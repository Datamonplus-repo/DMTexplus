package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetas_wc_impl extends GXWebComponent
{
   public recetas_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetas_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetas_wc_impl.class ));
   }

   public recetas_wc_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
            gxfirstwebparm_bkp = gxfirstwebparm ;
            gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
            toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
            if ( GXutil.strcmp(gxfirstwebparm, "dyncall") == 0 )
            {
               httpContext.setAjaxCallMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               dyncall( httpContext.GetNextPar( )) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetPar( "sCompPrefix") ;
               sSFPrefix = httpContext.GetPar( "sSFPrefix") ;
               AV46emprcod = httpContext.GetPar( "emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46emprcod", AV46emprcod);
               AV47prdnum = httpContext.GetPar( "prdnum") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47prdnum", AV47prdnum);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV46emprcod,AV47prdnum});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid") == 0 )
            {
               gxnrgrid_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid") == 0 )
            {
               gxgrgrid_refresh_invoke( ) ;
               return  ;
            }
            else
            {
               if ( ! httpContext.IsValidAjaxCall( false) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = gxfirstwebparm_bkp ;
            }
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid_newrow( ) ;
      /* End function gxnrGrid_newrow_invoke */
   }

   public void gxgrgrid_refresh_invoke( )
   {
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV46emprcod = httpContext.GetPar( "emprcod") ;
      AV47prdnum = httpContext.GetPar( "prdnum") ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV43TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV44TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV48TFRecLinUsr = httpContext.GetPar( "TFRecLinUsr") ;
      AV49TFRecLinUsr_Sel = httpContext.GetPar( "TFRecLinUsr_Sel") ;
      AV50TFRecPesFec = localUtil.parseDTimeParm( httpContext.GetPar( "TFRecPesFec")) ;
      AV59TFRecFecAlt = localUtil.parseDTimeParm( httpContext.GetPar( "TFRecFecAlt")) ;
      AV77Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV54TotCant = CommonUtil.decimalVal( httpContext.GetPar( "TotCant"), ".") ;
      AV56TotCantPdt = CommonUtil.decimalVal( httpContext.GetPar( "TotCantPdt"), ".") ;
      AV58BarFasDTI = localUtil.parseDTimeParm( httpContext.GetPar( "BarFasDTI")) ;
      A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      A150BarFacTin = httpContext.GetPar( "BarFacTin") ;
      A4442BarFasDTI = localUtil.parseDTimeParm( httpContext.GetPar( "BarFasDTI")) ;
      n4442BarFasDTI = false ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV46emprcod, AV47prdnum, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV43TFBarNHdr, AV44TFBarNHdr_Sel, AV48TFRecLinUsr, AV49TFRecLinUsr_Sel, AV50TFRecPesFec, AV59TFRecFecAlt, AV77Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54TotCant, AV56TotCantPdt, AV58BarFasDTI, A194BarOrdLin, A150BarFacTin, A4442BarFasDTI, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1OP2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
         {
            httpContext.enableOutput();
            if ( ! httpContext.isAjaxRequest( ) )
            {
               httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
            }
            if ( ! httpContext.willRedirect( ) )
            {
               addString( httpContext.getJSONResponse( )) ;
            }
            else
            {
               if ( httpContext.isAjaxRequest( ) )
               {
                  httpContext.disableOutput();
               }
               renderHtmlHeaders( ) ;
               httpContext.redirect( httpContext.wjLoc );
               httpContext.dispatchAjaxCommands();
            }
         }
      }
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( httpContext.getMessage( " Tabla LRECET", "")) ;
         httpContext.writeTextNL( "</title>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         if ( GXutil.len( sDynURL) > 0 )
         {
            httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
         }
         define_styles( ) ;
      }
      if ( ( ( httpContext.getBrowserType( ) == 1 ) || ( httpContext.getBrowserType( ) == 5 ) ) && ( GXutil.strcmp(httpContext.getBrowserVersion( ), "7.0") == 0 ) )
      {
         httpContext.AddJavascriptSource("json2.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("gxcfg.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.recetas_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV46emprcod)),GXutil.URLEncode(GXutil.rtrim(AV47prdnum))}, new String[] {"emprcod","prdnum"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
      }
      else
      {
         boolean toggleHtmlOutput = httpContext.isOutputEnabled( );
         if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableOutput();
            }
         }
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         if ( toggleHtmlOutput )
         {
            if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableOutput();
               }
            }
         }
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV77Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCANT", getSecureSignedToken( sPrefix, localUtil.format( AV54TotCant, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCANTPDT", getSecureSignedToken( sPrefix, localUtil.format( AV56TotCantPdt, "ZZZZZZ9.999")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV40GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV41GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV38DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV38DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV46emprcod", GXutil.rtrim( wcpOAV46emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47prdnum", GXutil.rtrim( wcpOAV47prdnum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV43TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV44TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLINUSR", GXutil.rtrim( AV48TFRecLinUsr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECLINUSR_SEL", GXutil.rtrim( AV49TFRecLinUsr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECPESFEC", localUtil.ttoc( AV50TFRecPesFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECFECALT", localUtil.ttoc( AV59TFRecFecAlt, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV77Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV77Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV46emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM", GXutil.rtrim( AV47prdnum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDCANT", GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDFACCON", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCANT", GXutil.ltrim( localUtil.ntoc( AV54TotCant, (byte)(18), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCANT", getSecureSignedToken( sPrefix, localUtil.format( AV54TotCant, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCANTPDT", GXutil.ltrim( localUtil.ntoc( AV56TotCantPdt, (byte)(18), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCANTPDT", getSecureSignedToken( sPrefix, localUtil.format( AV56TotCantPdt, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFASDTI", localUtil.ttoc( A4442BarFasDTI, 10, 8, 0, 0, "/", ":", " "));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFACTIN", GXutil.rtrim( A150BarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm1OP2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) ) )
      {
         componentjscripts();
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
         httpContext.SendComponentObjects();
         httpContext.SendServerCommands();
         httpContext.SendState();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         httpContext.writeTextNL( "</form>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         include_jscripts( ) ;
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.Recetas_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Tabla LRECET", "") ;
   }

   public void wb1OP0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.stocksquimicos.recetas_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
         }
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMain", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableheader.setProperty("Width", Dvpanel_tableheader_Width);
         ucDvpanel_tableheader.setProperty("AutoWidth", Dvpanel_tableheader_Autowidth);
         ucDvpanel_tableheader.setProperty("AutoHeight", Dvpanel_tableheader_Autoheight);
         ucDvpanel_tableheader.setProperty("Cls", Dvpanel_tableheader_Cls);
         ucDvpanel_tableheader.setProperty("Title", Dvpanel_tableheader_Title);
         ucDvpanel_tableheader.setProperty("Collapsible", Dvpanel_tableheader_Collapsible);
         ucDvpanel_tableheader.setProperty("Collapsed", Dvpanel_tableheader_Collapsed);
         ucDvpanel_tableheader.setProperty("ShowCollapseIcon", Dvpanel_tableheader_Showcollapseicon);
         ucDvpanel_tableheader.setProperty("IconPosition", Dvpanel_tableheader_Iconposition);
         ucDvpanel_tableheader.setProperty("AutoScroll", Dvpanel_tableheader_Autoscroll);
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, sPrefix+"DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\Recetas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\Recetas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\Recetas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1OP2( true) ;
      }
      else
      {
         wb_table1_23_1OP2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1OP2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol41( ) ;
      }
      if ( wbEnd == 41 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_41 = (int)(nGXsfl_41_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_57_1OP2( true) ;
      }
      else
      {
         wb_table2_57_1OP2( false) ;
      }
      return  ;
   }

   public void wb_table2_57_1OP2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridpaginationbar.setProperty("Class", Gridpaginationbar_Class);
         ucGridpaginationbar.setProperty("ShowFirst", Gridpaginationbar_Showfirst);
         ucGridpaginationbar.setProperty("ShowPrevious", Gridpaginationbar_Showprevious);
         ucGridpaginationbar.setProperty("ShowNext", Gridpaginationbar_Shownext);
         ucGridpaginationbar.setProperty("ShowLast", Gridpaginationbar_Showlast);
         ucGridpaginationbar.setProperty("PagesToShow", Gridpaginationbar_Pagestoshow);
         ucGridpaginationbar.setProperty("PagingButtonsPosition", Gridpaginationbar_Pagingbuttonsposition);
         ucGridpaginationbar.setProperty("PagingCaptionPosition", Gridpaginationbar_Pagingcaptionposition);
         ucGridpaginationbar.setProperty("EmptyGridClass", Gridpaginationbar_Emptygridclass);
         ucGridpaginationbar.setProperty("RowsPerPageSelector", Gridpaginationbar_Rowsperpageselector);
         ucGridpaginationbar.setProperty("RowsPerPageOptions", Gridpaginationbar_Rowsperpageoptions);
         ucGridpaginationbar.setProperty("Previous", Gridpaginationbar_Previous);
         ucGridpaginationbar.setProperty("Next", Gridpaginationbar_Next);
         ucGridpaginationbar.setProperty("Caption", Gridpaginationbar_Caption);
         ucGridpaginationbar.setProperty("EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
         ucGridpaginationbar.setProperty("RowsPerPageCaption", Gridpaginationbar_Rowsperpagecaption);
         ucGridpaginationbar.setProperty("CurrentPage", AV40GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV41GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV38DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV38DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_recpesfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_recpesfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_recpesfecauxdate_Internalname, localUtil.format(AV52DDO_RecPesFecAuxDate, "99/99/99"), localUtil.format( AV52DDO_RecPesFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,87);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_recpesfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\Recetas_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_recpesfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\Recetas_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_recfecaltauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_recfecaltauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_recfecaltauxdate_Internalname, localUtil.format(AV61DDO_RecFecAltAuxDate, "99/99/99"), localUtil.format( AV61DDO_RecFecAltAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,89);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_recfecaltauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\Recetas_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_recfecaltauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\Recetas_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 41 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1OP2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            if ( httpContext.exposeMetadata( ) )
            {
               Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
            }
            Form.getMeta().addItem("description", httpContext.getMessage( " Tabla LRECET", ""), (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup1OP0( ) ;
         }
      }
   }

   public void ws1OP2( )
   {
      start1OP2( ) ;
      evt1OP2( ) ;
   }

   public void evt1OP2( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1OP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1OP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111OP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1OP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121OP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1OP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131OP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1OP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141OP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1OP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151OP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1OP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e161OP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1OP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e171OP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1OP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavFilterfulltext_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1OP0( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           AV42Cant = localUtil.ctond( httpContext.cgiGet( edtavCant_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCant_Internalname, GXutil.ltrimstr( AV42Cant, 11, 3));
                           AV45CantPdt = localUtil.ctond( httpContext.cgiGet( edtavCantpdt_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantpdt_Internalname, GXutil.ltrimstr( AV45CantPdt, 11, 3));
                           A4576RecLinUsr = GXutil.upper( httpContext.cgiGet( edtRecLinUsr_Internalname)) ;
                           A4577RecPesFec = localUtil.ctot( httpContext.cgiGet( edtRecPesFec_Internalname), 0) ;
                           A4866RecFecAlt = localUtil.ctot( httpContext.cgiGet( edtRecFecAlt_Internalname), 0) ;
                           n4866RecFecAlt = false ;
                           AV58BarFasDTI = localUtil.ctot( httpContext.cgiGet( edtavBarfasdti_Internalname), 0) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfasdti_Internalname, localUtil.ttoc( AV58BarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARFASDTI"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( AV58BarFasDTI, "99/99/99 99:99:99")));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e181OP2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e191OP2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e201OP2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       if ( ! wbErr )
                                       {
                                          Rfr0gs = false ;
                                          /* Set Refresh If Filterfulltext Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
                                          if ( ! Rfr0gs )
                                          {
                                          }
                                          dynload_actions( ) ;
                                       }
                                    }
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup1OP0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1OP2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1OP2( ) ;
         }
      }
   }

   public void pa1OP2( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
            }
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         init_web_controls( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavFilterfulltext_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_412( ) ;
      while ( nGXsfl_41_idx <= nRC_GXsfl_41 )
      {
         sendrow_412( ) ;
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 String AV46emprcod ,
                                 String AV47prdnum ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV43TFBarNHdr ,
                                 String AV44TFBarNHdr_Sel ,
                                 String AV48TFRecLinUsr ,
                                 String AV49TFRecLinUsr_Sel ,
                                 java.util.Date AV50TFRecPesFec ,
                                 java.util.Date AV59TFRecFecAlt ,
                                 String AV77Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV54TotCant ,
                                 java.math.BigDecimal AV56TotCantPdt ,
                                 java.util.Date AV58BarFasDTI ,
                                 short A194BarOrdLin ,
                                 String A150BarFacTin ,
                                 java.util.Date A4442BarFasDTI ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e191OP2 ();
      GRID_nCurrentRecord = 0 ;
      rf1OP2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARFASDTI", getSecureSignedToken( sPrefix, localUtil.format( AV58BarFasDTI, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFASDTI", localUtil.ttoc( AV58BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1OP2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV77Pgmname = "StocksQuimicos.Recetas_WC" ;
      Gx_err = (short)(0) ;
      edtavCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCant_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCantpdt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantpdt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantpdt_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavBarfasdti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfasdti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasdti_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTotvaluecant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecant_Enabled), 5, 0), true);
      edtavTotvaluecantpdt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecantpdt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecantpdt_Enabled), 5, 0), true);
   }

   public void rf1OP2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e191OP2 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_412( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV68Stocksquimicos_recetas_wcds_1_filterfulltext ,
                                              AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel ,
                                              AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr ,
                                              AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel ,
                                              AV71Stocksquimicos_recetas_wcds_4_tfreclinusr ,
                                              AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec ,
                                              AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A4576RecLinUsr ,
                                              A4577RecPesFec ,
                                              A4866RecFecAlt ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV46emprcod ,
                                              AV47prdnum ,
                                              A396EmprCod ,
                                              A719PrdNum } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN
                                              }
         });
         lV68Stocksquimicos_recetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Stocksquimicos_recetas_wcds_1_filterfulltext), "%", "") ;
         lV68Stocksquimicos_recetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Stocksquimicos_recetas_wcds_1_filterfulltext), "%", "") ;
         lV69Stocksquimicos_recetas_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr), 11, "%") ;
         lV71Stocksquimicos_recetas_wcds_4_tfreclinusr = GXutil.padr( GXutil.rtrim( AV71Stocksquimicos_recetas_wcds_4_tfreclinusr), 8, "%") ;
         /* Using cursor H01OP2 */
         pr_default.execute(0, new Object[] {AV46emprcod, AV47prdnum, lV68Stocksquimicos_recetas_wcds_1_filterfulltext, lV68Stocksquimicos_recetas_wcds_1_filterfulltext, lV69Stocksquimicos_recetas_wcds_2_tfbarnhdr, AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel, lV71Stocksquimicos_recetas_wcds_4_tfreclinusr, AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel, AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec, AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01OP2_A396EmprCod[0] ;
            A719PrdNum = H01OP2_A719PrdNum[0] ;
            n719PrdNum = H01OP2_n719PrdNum[0] ;
            A707PrdFacCon = H01OP2_A707PrdFacCon[0] ;
            A686PrdCant = H01OP2_A686PrdCant[0] ;
            A4866RecFecAlt = H01OP2_A4866RecFecAlt[0] ;
            n4866RecFecAlt = H01OP2_n4866RecFecAlt[0] ;
            A4577RecPesFec = H01OP2_A4577RecPesFec[0] ;
            A4576RecLinUsr = H01OP2_A4576RecLinUsr[0] ;
            A811RecLin = H01OP2_A811RecLin[0] ;
            A1273RecLinPro = H01OP2_A1273RecLinPro[0] ;
            A2804RecLinMaq = H01OP2_A2804RecLinMaq[0] ;
            A130BarCodPar = H01OP2_A130BarCodPar[0] ;
            A132BarCodReo = H01OP2_A132BarCodReo[0] ;
            A129BarCod = H01OP2_A129BarCod[0] ;
            A707PrdFacCon = H01OP2_A707PrdFacCon[0] ;
            A4866RecFecAlt = H01OP2_A4866RecFecAlt[0] ;
            n4866RecFecAlt = H01OP2_n4866RecFecAlt[0] ;
            A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
            e201OP2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(41) ;
         wb1OP0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1OP2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV77Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV77Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCANT", GXutil.ltrim( localUtil.ntoc( AV54TotCant, (byte)(18), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCANT", getSecureSignedToken( sPrefix, localUtil.format( AV54TotCant, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCANTPDT", GXutil.ltrim( localUtil.ntoc( AV56TotCantPdt, (byte)(18), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCANTPDT", getSecureSignedToken( sPrefix, localUtil.format( AV56TotCantPdt, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARFASDTI"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( AV58BarFasDTI, "99/99/99 99:99:99")));
   }

   public int subgrid_fnc_pagecount( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public int subgrid_fnc_recordcount( )
   {
      AV68Stocksquimicos_recetas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr = AV43TFBarNHdr ;
      AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel = AV44TFBarNHdr_Sel ;
      AV71Stocksquimicos_recetas_wcds_4_tfreclinusr = AV48TFRecLinUsr ;
      AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel = AV49TFRecLinUsr_Sel ;
      AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec = AV50TFRecPesFec ;
      AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt = AV59TFRecFecAlt ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV68Stocksquimicos_recetas_wcds_1_filterfulltext ,
                                           AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel ,
                                           AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr ,
                                           AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel ,
                                           AV71Stocksquimicos_recetas_wcds_4_tfreclinusr ,
                                           AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec ,
                                           AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4576RecLinUsr ,
                                           A4577RecPesFec ,
                                           A4866RecFecAlt ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV46emprcod ,
                                           AV47prdnum ,
                                           A396EmprCod ,
                                           A719PrdNum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV68Stocksquimicos_recetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Stocksquimicos_recetas_wcds_1_filterfulltext), "%", "") ;
      lV68Stocksquimicos_recetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Stocksquimicos_recetas_wcds_1_filterfulltext), "%", "") ;
      lV69Stocksquimicos_recetas_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr), 11, "%") ;
      lV71Stocksquimicos_recetas_wcds_4_tfreclinusr = GXutil.padr( GXutil.rtrim( AV71Stocksquimicos_recetas_wcds_4_tfreclinusr), 8, "%") ;
      /* Using cursor H01OP3 */
      pr_default.execute(1, new Object[] {AV46emprcod, AV47prdnum, lV68Stocksquimicos_recetas_wcds_1_filterfulltext, lV68Stocksquimicos_recetas_wcds_1_filterfulltext, lV69Stocksquimicos_recetas_wcds_2_tfbarnhdr, AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel, lV71Stocksquimicos_recetas_wcds_4_tfreclinusr, AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel, AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec, AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt});
      GRID_nRecordCount = H01OP3_AGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID_nRecordCount) ;
   }

   public int subgrid_fnc_recordsperpage( )
   {
      if ( subGrid_Rows > 0 )
      {
         return subGrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public short subgrid_firstpage( )
   {
      AV68Stocksquimicos_recetas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr = AV43TFBarNHdr ;
      AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel = AV44TFBarNHdr_Sel ;
      AV71Stocksquimicos_recetas_wcds_4_tfreclinusr = AV48TFRecLinUsr ;
      AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel = AV49TFRecLinUsr_Sel ;
      AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec = AV50TFRecPesFec ;
      AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt = AV59TFRecFecAlt ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV46emprcod, AV47prdnum, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV43TFBarNHdr, AV44TFBarNHdr_Sel, AV48TFRecLinUsr, AV49TFRecLinUsr_Sel, AV50TFRecPesFec, AV59TFRecFecAlt, AV77Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54TotCant, AV56TotCantPdt, AV58BarFasDTI, A194BarOrdLin, A150BarFacTin, A4442BarFasDTI, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV68Stocksquimicos_recetas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr = AV43TFBarNHdr ;
      AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel = AV44TFBarNHdr_Sel ;
      AV71Stocksquimicos_recetas_wcds_4_tfreclinusr = AV48TFRecLinUsr ;
      AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel = AV49TFRecLinUsr_Sel ;
      AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec = AV50TFRecPesFec ;
      AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt = AV59TFRecFecAlt ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV46emprcod, AV47prdnum, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV43TFBarNHdr, AV44TFBarNHdr_Sel, AV48TFRecLinUsr, AV49TFRecLinUsr_Sel, AV50TFRecPesFec, AV59TFRecFecAlt, AV77Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54TotCant, AV56TotCantPdt, AV58BarFasDTI, A194BarOrdLin, A150BarFacTin, A4442BarFasDTI, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV68Stocksquimicos_recetas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr = AV43TFBarNHdr ;
      AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel = AV44TFBarNHdr_Sel ;
      AV71Stocksquimicos_recetas_wcds_4_tfreclinusr = AV48TFRecLinUsr ;
      AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel = AV49TFRecLinUsr_Sel ;
      AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec = AV50TFRecPesFec ;
      AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt = AV59TFRecFecAlt ;
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV46emprcod, AV47prdnum, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV43TFBarNHdr, AV44TFBarNHdr_Sel, AV48TFRecLinUsr, AV49TFRecLinUsr_Sel, AV50TFRecPesFec, AV59TFRecFecAlt, AV77Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54TotCant, AV56TotCantPdt, AV58BarFasDTI, A194BarOrdLin, A150BarFacTin, A4442BarFasDTI, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV68Stocksquimicos_recetas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr = AV43TFBarNHdr ;
      AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel = AV44TFBarNHdr_Sel ;
      AV71Stocksquimicos_recetas_wcds_4_tfreclinusr = AV48TFRecLinUsr ;
      AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel = AV49TFRecLinUsr_Sel ;
      AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec = AV50TFRecPesFec ;
      AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt = AV59TFRecFecAlt ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( GRID_nRecordCount > subgrid_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-subgrid_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV46emprcod, AV47prdnum, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV43TFBarNHdr, AV44TFBarNHdr_Sel, AV48TFRecLinUsr, AV49TFRecLinUsr_Sel, AV50TFRecPesFec, AV59TFRecFecAlt, AV77Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54TotCant, AV56TotCantPdt, AV58BarFasDTI, A194BarOrdLin, A150BarFacTin, A4442BarFasDTI, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV68Stocksquimicos_recetas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr = AV43TFBarNHdr ;
      AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel = AV44TFBarNHdr_Sel ;
      AV71Stocksquimicos_recetas_wcds_4_tfreclinusr = AV48TFRecLinUsr ;
      AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel = AV49TFRecLinUsr_Sel ;
      AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec = AV50TFRecPesFec ;
      AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt = AV59TFRecFecAlt ;
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV46emprcod, AV47prdnum, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV43TFBarNHdr, AV44TFBarNHdr_Sel, AV48TFRecLinUsr, AV49TFRecLinUsr_Sel, AV50TFRecPesFec, AV59TFRecFecAlt, AV77Pgmname, AV12OrderedBy, AV13OrderedDsc, AV54TotCant, AV56TotCantPdt, AV58BarFasDTI, A194BarOrdLin, A150BarFacTin, A4442BarFasDTI, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV77Pgmname = "StocksQuimicos.Recetas_WC" ;
      Gx_err = (short)(0) ;
      edtavCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCant_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavCantpdt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantpdt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantpdt_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavBarfasdti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfasdti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasdti_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTotvaluecant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecant_Enabled), 5, 0), true);
      edtavTotvaluecantpdt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecantpdt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecantpdt_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1OP0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e181OP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV38DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV40GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV41GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV46emprcod = httpContext.cgiGet( sPrefix+"wcpOAV46emprcod") ;
         wcpOAV47prdnum = httpContext.cgiGet( sPrefix+"wcpOAV47prdnum") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Cls") ;
         Dvpanel_tableheader_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         AV55TotValueCant = httpContext.cgiGet( edtavTotvaluecant_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TotValueCant", AV55TotValueCant);
         AV57TotValueCantPdt = httpContext.cgiGet( edtavTotvaluecantpdt_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TotValueCantPdt", AV57TotValueCantPdt);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_recpesfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_RECPESFECAUXDATE");
            GX_FocusControl = edtavDdo_recpesfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV52DDO_RecPesFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52DDO_RecPesFecAuxDate", localUtil.format(AV52DDO_RecPesFecAuxDate, "99/99/99"));
         }
         else
         {
            AV52DDO_RecPesFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_recpesfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52DDO_RecPesFecAuxDate", localUtil.format(AV52DDO_RecPesFecAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_recfecaltauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_RECFECALTAUXDATE");
            GX_FocusControl = edtavDdo_recfecaltauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV61DDO_RecFecAltAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61DDO_RecFecAltAuxDate", localUtil.format(AV61DDO_RecFecAltAuxDate, "99/99/99"));
         }
         else
         {
            AV61DDO_RecFecAltAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_recfecaltauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61DDO_RecFecAltAuxDate", localUtil.format(AV61DDO_RecFecAltAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e181OP2 ();
      if (returnInSub) return;
   }

   public void e181OP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV65Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetas_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV65Station = GXt_char1 ;
      GXv_char2[0] = AV46emprcod ;
      GXv_char3[0] = AV66Emprnom ;
      GXv_char4[0] = AV67Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV65Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetas_wc_impl.this.AV46emprcod = GXv_char2[0] ;
      recetas_wc_impl.this.AV66Emprnom = GXv_char3[0] ;
      recetas_wc_impl.this.AV67Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46emprcod", AV46emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV38DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV38DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e191OP2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV6WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV25ManageFiltersExecutionStep == 1 )
      {
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV25ManageFiltersExecutionStep == 2 )
      {
         AV25ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("StocksQuimicos.Recetas_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("StocksQuimicos.Recetas_WCColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCant_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCant_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCant_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavCantpdt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantpdt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantpdt_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtRecLinUsr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecLinUsr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinUsr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtRecPesFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecPesFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPesFec_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtRecFecAlt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecFecAlt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecAlt_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavBarfasdti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfasdti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasdti_Visible), 5, 0), !bGXsfl_41_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV40GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridCurrentPage), 10, 0));
      AV41GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      AV68Stocksquimicos_recetas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr = AV43TFBarNHdr ;
      AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel = AV44TFBarNHdr_Sel ;
      AV71Stocksquimicos_recetas_wcds_4_tfreclinusr = AV48TFRecLinUsr ;
      AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel = AV49TFRecLinUsr_Sel ;
      AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec = AV50TFRecPesFec ;
      AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt = AV59TFRecFecAlt ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121OP2( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         subgrid_nextpage( ) ;
      }
      else
      {
         AV39PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV39PageToGo) ;
      }
   }

   public void e131OP2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141OP2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV43TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarNHdr", AV43TFBarNHdr);
            AV44TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarNHdr_Sel", AV44TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLinUsr") == 0 )
         {
            AV48TFRecLinUsr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFRecLinUsr", AV48TFRecLinUsr);
            AV49TFRecLinUsr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFRecLinUsr_Sel", AV49TFRecLinUsr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPesFec") == 0 )
         {
            AV50TFRecPesFec = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFRecPesFec", localUtil.ttoc( AV50TFRecPesFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecFecAlt") == 0 )
         {
            AV59TFRecFecAlt = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFRecFecAlt", localUtil.ttoc( AV59TFRecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e201OP2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV42Cant = (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCant_Internalname, GXutil.ltrimstr( AV42Cant, 11, 3));
      AV45CantPdt = ((GXutil.strcmp("", A4576RecLinUsr)==0) ? DecimalUtil.doubleToDec(0) : (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantpdt_Internalname, GXutil.ltrimstr( AV45CantPdt, 11, 3));
      AV75Nfasestinte = (byte)(0) ;
      AV58BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfasdti_Internalname, localUtil.ttoc( AV58BarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARFASDTI"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( AV58BarFasDTI, "99/99/99 99:99:99")));
      /* Using cursor H01OP4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A150BarFacTin = H01OP4_A150BarFacTin[0] ;
         A4442BarFasDTI = H01OP4_A4442BarFasDTI[0] ;
         n4442BarFasDTI = H01OP4_n4442BarFasDTI[0] ;
         A194BarOrdLin = H01OP4_A194BarOrdLin[0] ;
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            AV75Nfasestinte = (byte)(AV75Nfasestinte+1) ;
            AV58BarFasDTI = A4442BarFasDTI ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfasdti_Internalname, localUtil.ttoc( AV58BarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARFASDTI"+"_"+sGXsfl_41_idx, getSecureSignedToken( sPrefix+sGXsfl_41_idx, localUtil.format( AV58BarFasDTI, "99/99/99 99:99:99")));
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(41) ;
      }
      sendrow_412( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e151OP2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.Recetas_WCColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e111OP2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S192 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.Recetas_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV77Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("StocksQuimicos.Recetas_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "StocksQuimicos.Recetas_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         recetas_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV24ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S192 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV77Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S202 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e161OP2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.stocksquimicos.recetas_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      recetas_wc_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      recetas_wc_impl.this.AV17ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
   }

   public void e171OP2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.recetas_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarNHdr", "", "N Hdr", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Cant", "", "Cantidad", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&CantPdt", "", "Cant Pdte", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "RecLinUsr", "Pesaje", "Usuario", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "RecPesFec", "Pesaje", "Fecha", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "RecFecAlt", "", "Fecha Alta Receta", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&BarFasDTI", "", "Inicio Fase", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.Recetas_WCColumnsSelector", GXv_char4) ;
      recetas_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "StocksQuimicos.Recetas_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV43TFBarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarNHdr", AV43TFBarNHdr);
      AV44TFBarNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarNHdr_Sel", AV44TFBarNHdr_Sel);
      AV48TFRecLinUsr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFRecLinUsr", AV48TFRecLinUsr);
      AV49TFRecLinUsr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFRecLinUsr_Sel", AV49TFRecLinUsr_Sel);
      AV50TFRecPesFec = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFRecPesFec", localUtil.ttoc( AV50TFRecPesFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV59TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFRecFecAlt", localUtil.ttoc( AV59TFRecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV77Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV77Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV77Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S202( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV78GXV1 = 1 ;
      while ( AV78GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV78GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV43TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarNHdr", AV43TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV44TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarNHdr_Sel", AV44TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR") == 0 )
         {
            AV48TFRecLinUsr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFRecLinUsr", AV48TFRecLinUsr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR_SEL") == 0 )
         {
            AV49TFRecLinUsr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFRecLinUsr_Sel", AV49TFRecLinUsr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPESFEC") == 0 )
         {
            AV50TFRecPesFec = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFRecPesFec", localUtil.ttoc( AV50TFRecPesFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV52DDO_RecPesFecAuxDate = GXutil.resetTime(AV50TFRecPesFec) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52DDO_RecPesFecAuxDate", localUtil.format(AV52DDO_RecPesFecAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV59TFRecFecAlt = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFRecFecAlt", localUtil.ttoc( AV59TFRecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV61DDO_RecFecAltAuxDate = GXutil.resetTime(AV59TFRecFecAlt) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61DDO_RecFecAltAuxDate", localUtil.format(AV61DDO_RecFecAltAuxDate, "99/99/99"));
         }
         AV78GXV1 = (int)(AV78GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFBarNHdr_Sel)==0), AV44TFBarNHdr_Sel, GXv_char4) ;
      recetas_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFRecLinUsr_Sel)==0), AV49TFRecLinUsr_Sel, GXv_char3) ;
      recetas_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|||"+GXt_char12+"|||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char12 = "" ;
      GXv_char4[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFBarNHdr)==0), AV43TFBarNHdr, GXv_char4) ;
      recetas_wc_impl.this.GXt_char12 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFRecLinUsr)==0), AV48TFRecLinUsr, GXv_char3) ;
      recetas_wc_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char12+"|||"+GXt_char1+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV50TFRecPesFec) ? "" : localUtil.dtoc( AV52DDO_RecPesFecAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV59TFRecFecAlt) ? "" : localUtil.dtoc( AV61DDO_RecFecAltAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV77Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFBARNHDR", "", !(GXutil.strcmp("", AV43TFBarNHdr)==0), (short)(0), AV43TFBarNHdr, "", !(GXutil.strcmp("", AV44TFBarNHdr_Sel)==0), AV44TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFRECLINUSR", "", !(GXutil.strcmp("", AV48TFRecLinUsr)==0), (short)(0), AV48TFRecLinUsr, "", !(GXutil.strcmp("", AV49TFRecLinUsr_Sel)==0), AV49TFRecLinUsr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFRECPESFEC", "", !GXutil.dateCompare(GXutil.nullDate(), AV50TFRecPesFec), (short)(0), GXutil.trim( localUtil.ttoc( AV50TFRecPesFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFRECFECALT", "", !GXutil.dateCompare(GXutil.nullDate(), AV59TFRecFecAlt), (short)(0), GXutil.trim( localUtil.ttoc( AV59TFRecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      if ( ! (GXutil.strcmp("", AV46emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV46emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV47prdnum)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV47prdnum );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV77Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV77Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LRECET" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV54TotCant = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TotCant", GXutil.ltrimstr( AV54TotCant, 18, 3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCANT", getSecureSignedToken( sPrefix, localUtil.format( AV54TotCant, "ZZZZZZ9.999")));
      AV56TotCantPdt = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TotCantPdt", GXutil.ltrimstr( AV56TotCantPdt, 18, 3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCANTPDT", getSecureSignedToken( sPrefix, localUtil.format( AV56TotCantPdt, "ZZZZZZ9.999")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV68Stocksquimicos_recetas_wcds_1_filterfulltext = AV15FilterFullText ;
      AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr = AV43TFBarNHdr ;
      AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel = AV44TFBarNHdr_Sel ;
      AV71Stocksquimicos_recetas_wcds_4_tfreclinusr = AV48TFRecLinUsr ;
      AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel = AV49TFRecLinUsr_Sel ;
      AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec = AV50TFRecPesFec ;
      AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt = AV59TFRecFecAlt ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV68Stocksquimicos_recetas_wcds_1_filterfulltext ,
                                           AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel ,
                                           AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr ,
                                           AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel ,
                                           AV71Stocksquimicos_recetas_wcds_4_tfreclinusr ,
                                           AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec ,
                                           AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4576RecLinUsr ,
                                           A4577RecPesFec ,
                                           A4866RecFecAlt ,
                                           AV46emprcod ,
                                           AV47prdnum ,
                                           A396EmprCod ,
                                           A719PrdNum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV68Stocksquimicos_recetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Stocksquimicos_recetas_wcds_1_filterfulltext), "%", "") ;
      lV68Stocksquimicos_recetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Stocksquimicos_recetas_wcds_1_filterfulltext), "%", "") ;
      lV69Stocksquimicos_recetas_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr), 11, "%") ;
      lV71Stocksquimicos_recetas_wcds_4_tfreclinusr = GXutil.padr( GXutil.rtrim( AV71Stocksquimicos_recetas_wcds_4_tfreclinusr), 8, "%") ;
      /* Using cursor H01OP5 */
      pr_default.execute(3, new Object[] {AV46emprcod, AV47prdnum, lV68Stocksquimicos_recetas_wcds_1_filterfulltext, lV68Stocksquimicos_recetas_wcds_1_filterfulltext, lV69Stocksquimicos_recetas_wcds_2_tfbarnhdr, AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel, lV71Stocksquimicos_recetas_wcds_4_tfreclinusr, AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel, AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec, AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2804RecLinMaq = H01OP5_A2804RecLinMaq[0] ;
         A719PrdNum = H01OP5_A719PrdNum[0] ;
         n719PrdNum = H01OP5_n719PrdNum[0] ;
         A396EmprCod = H01OP5_A396EmprCod[0] ;
         A4866RecFecAlt = H01OP5_A4866RecFecAlt[0] ;
         n4866RecFecAlt = H01OP5_n4866RecFecAlt[0] ;
         A4577RecPesFec = H01OP5_A4577RecPesFec[0] ;
         A4576RecLinUsr = H01OP5_A4576RecLinUsr[0] ;
         A707PrdFacCon = H01OP5_A707PrdFacCon[0] ;
         A686PrdCant = H01OP5_A686PrdCant[0] ;
         A130BarCodPar = H01OP5_A130BarCodPar[0] ;
         A132BarCodReo = H01OP5_A132BarCodReo[0] ;
         A129BarCod = H01OP5_A129BarCod[0] ;
         A707PrdFacCon = H01OP5_A707PrdFacCon[0] ;
         A4866RecFecAlt = H01OP5_A4866RecFecAlt[0] ;
         n4866RecFecAlt = H01OP5_n4866RecFecAlt[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV42Cant = (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCant_Internalname, GXutil.ltrimstr( AV42Cant, 11, 3));
         AV54TotCant = AV42Cant.add(AV54TotCant) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TotCant", GXutil.ltrimstr( AV54TotCant, 18, 3));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCANT", getSecureSignedToken( sPrefix, localUtil.format( AV54TotCant, "ZZZZZZ9.999")));
         AV45CantPdt = ((GXutil.strcmp("", A4576RecLinUsr)==0) ? DecimalUtil.doubleToDec(0) : (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantpdt_Internalname, GXutil.ltrimstr( AV45CantPdt, 11, 3));
         AV56TotCantPdt = AV45CantPdt.add(AV56TotCantPdt) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TotCantPdt", GXutil.ltrimstr( AV56TotCantPdt, 18, 3));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCANTPDT", getSecureSignedToken( sPrefix, localUtil.format( AV56TotCantPdt, "ZZZZZZ9.999")));
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV55TotValueCant = localUtil.format( AV54TotCant, "ZZZZZZ9.999") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TotValueCant", AV55TotValueCant);
      AV57TotValueCantPdt = localUtil.format( AV56TotCantPdt, "ZZZZZZ9.999") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TotValueCantPdt", AV57TotValueCantPdt);
   }

   public void wb_table2_57_1OP2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridtabletotalizer_Internalname, tblGridtabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluecant_Internalname, httpContext.getMessage( "Tot Value Cant", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluecant_Internalname, AV55TotValueCant, GXutil.rtrim( localUtil.format( AV55TotValueCant, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluecant_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluecant_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\Recetas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluecantpdt_Internalname, httpContext.getMessage( "Tot Value Cant Pdt", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluecantpdt_Internalname, AV57TotValueCantPdt, GXutil.rtrim( localUtil.format( AV57TotValueCantPdt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluecantpdt_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluecantpdt_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\Recetas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_57_1OP2e( true) ;
      }
      else
      {
         wb_table2_57_1OP2e( false) ;
      }
   }

   public void wb_table1_23_1OP2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV23ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_28_1OP2( true) ;
      }
      else
      {
         wb_table3_28_1OP2( false) ;
      }
      return  ;
   }

   public void wb_table3_28_1OP2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1OP2e( true) ;
      }
      else
      {
         wb_table1_23_1OP2e( false) ;
      }
   }

   public void wb_table3_28_1OP2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_StocksQuimicos\\Recetas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1OP2e( true) ;
      }
      else
      {
         wb_table3_28_1OP2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV46emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46emprcod", AV46emprcod);
      AV47prdnum = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47prdnum", AV47prdnum);
   }

   public String getresponse( String sGXDynURL )
   {
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa1OP2( ) ;
      ws1OP2( ) ;
      we1OP2( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlAV46emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV47prdnum = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1OP2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "stocksquimicos\\recetas_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1OP2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV46emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46emprcod", AV46emprcod);
         AV47prdnum = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47prdnum", AV47prdnum);
      }
      wcpOAV46emprcod = httpContext.cgiGet( sPrefix+"wcpOAV46emprcod") ;
      wcpOAV47prdnum = httpContext.cgiGet( sPrefix+"wcpOAV47prdnum") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV46emprcod, wcpOAV46emprcod) != 0 ) || ( GXutil.strcmp(AV47prdnum, wcpOAV47prdnum) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV46emprcod = AV46emprcod ;
      wcpOAV47prdnum = AV47prdnum ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV46emprcod = httpContext.cgiGet( sPrefix+"AV46emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV46emprcod) > 0 )
      {
         AV46emprcod = httpContext.cgiGet( sCtrlAV46emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46emprcod", AV46emprcod);
      }
      else
      {
         AV46emprcod = httpContext.cgiGet( sPrefix+"AV46emprcod_PARM") ;
      }
      sCtrlAV47prdnum = httpContext.cgiGet( sPrefix+"AV47prdnum_CTRL") ;
      if ( GXutil.len( sCtrlAV47prdnum) > 0 )
      {
         AV47prdnum = httpContext.cgiGet( sCtrlAV47prdnum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47prdnum", AV47prdnum);
      }
      else
      {
         AV47prdnum = httpContext.cgiGet( sPrefix+"AV47prdnum_PARM") ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa1OP2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1OP2( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      ws1OP2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46emprcod_PARM", GXutil.rtrim( AV46emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV46emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46emprcod_CTRL", GXutil.rtrim( sCtrlAV46emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47prdnum_PARM", GXutil.rtrim( AV47prdnum));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47prdnum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47prdnum_CTRL", GXutil.rtrim( sCtrlAV47prdnum));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      we1OP2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115561465", true, true);
         idxLst = (int)(idxLst+1) ;
      }
      if ( ! outputEnabled )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("stocksquimicos/recetas_wc.js", "?202682115561465", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_412( )
   {
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_41_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_41_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_41_idx ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ_"+sGXsfl_41_idx ;
      edtRecLinPro_Internalname = sPrefix+"RECLINPRO_"+sGXsfl_41_idx ;
      edtRecLin_Internalname = sPrefix+"RECLIN_"+sGXsfl_41_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_41_idx ;
      edtavCant_Internalname = sPrefix+"vCANT_"+sGXsfl_41_idx ;
      edtavCantpdt_Internalname = sPrefix+"vCANTPDT_"+sGXsfl_41_idx ;
      edtRecLinUsr_Internalname = sPrefix+"RECLINUSR_"+sGXsfl_41_idx ;
      edtRecPesFec_Internalname = sPrefix+"RECPESFEC_"+sGXsfl_41_idx ;
      edtRecFecAlt_Internalname = sPrefix+"RECFECALT_"+sGXsfl_41_idx ;
      edtavBarfasdti_Internalname = sPrefix+"vBARFASDTI_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_41_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_41_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_41_fel_idx ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ_"+sGXsfl_41_fel_idx ;
      edtRecLinPro_Internalname = sPrefix+"RECLINPRO_"+sGXsfl_41_fel_idx ;
      edtRecLin_Internalname = sPrefix+"RECLIN_"+sGXsfl_41_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_41_fel_idx ;
      edtavCant_Internalname = sPrefix+"vCANT_"+sGXsfl_41_fel_idx ;
      edtavCantpdt_Internalname = sPrefix+"vCANTPDT_"+sGXsfl_41_fel_idx ;
      edtRecLinUsr_Internalname = sPrefix+"RECLINUSR_"+sGXsfl_41_fel_idx ;
      edtRecPesFec_Internalname = sPrefix+"RECPESFEC_"+sGXsfl_41_fel_idx ;
      edtRecFecAlt_Internalname = sPrefix+"RECFECALT_"+sGXsfl_41_fel_idx ;
      edtavBarfasdti_Internalname = sPrefix+"vBARFASDTI_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb1OP0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_41_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
      {
         GridRow = GXWebRow.GetNew(context,GridContainer) ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            subGrid_Backcolor = subGrid_Allbackcolor ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Uniform" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
            subGrid_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_41_idx) % (2))) == 0 )
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Even" ;
               }
            }
            else
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Odd" ;
               }
            }
         }
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinPro_Internalname,GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLinPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLin_Internalname,GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCant_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCant_Internalname,GXutil.ltrim( localUtil.ntoc( AV42Cant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCant_Enabled!=0) ? localUtil.format( AV42Cant, "ZZZZZZ9.999") : localUtil.format( AV42Cant, "ZZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCant_Visible),Integer.valueOf(edtavCant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCantpdt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCantpdt_Internalname,GXutil.ltrim( localUtil.ntoc( AV45CantPdt, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCantpdt_Enabled!=0) ? localUtil.format( AV45CantPdt, "ZZZZZZ9.999") : localUtil.format( AV45CantPdt, "ZZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCantpdt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCantpdt_Visible),Integer.valueOf(edtavCantpdt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtRecLinUsr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinUsr_Internalname,GXutil.rtrim( A4576RecLinUsr),GXutil.rtrim( localUtil.format( A4576RecLinUsr, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLinUsr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecLinUsr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecPesFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPesFec_Internalname,localUtil.ttoc( A4577RecPesFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4577RecPesFec, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecPesFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecPesFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecFecAlt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecFecAlt_Internalname,localUtil.ttoc( A4866RecFecAlt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4866RecFecAlt, "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecFecAlt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecFecAlt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBarfasdti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfasdti_Internalname,localUtil.ttoc( AV58BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( AV58BarFasDTI, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarfasdti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarfasdti_Visible),Integer.valueOf(edtavBarfasdti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1OP2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      /* End function sendrow_412 */
   }

   public void startgridcontrol41( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"41\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            subGrid_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid_Class) > 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Title" ;
            }
         }
         else
         {
            subGrid_Titlebackstyle = (byte)(1) ;
            if ( subGrid_Backcolorstyle == 1 )
            {
               subGrid_Titlebackcolor = subGrid_Allbackcolor ;
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCant_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCantpdt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant Pdte", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecLinUsr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecPesFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecFecAlt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Alta Receta", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarfasdti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            GridContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            GridContainer.Clear();
         }
         GridContainer.SetWrapped(nGXWrapped);
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42Cant, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCant_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCant_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV45CantPdt, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCantpdt_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCantpdt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4576RecLinUsr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecLinUsr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4577RecPesFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecPesFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4866RecFecAlt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecFecAlt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( AV58BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfasdti_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarfasdti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ" ;
      edtRecLinPro_Internalname = sPrefix+"RECLINPRO" ;
      edtRecLin_Internalname = sPrefix+"RECLIN" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtavCant_Internalname = sPrefix+"vCANT" ;
      edtavCantpdt_Internalname = sPrefix+"vCANTPDT" ;
      edtRecLinUsr_Internalname = sPrefix+"RECLINUSR" ;
      edtRecPesFec_Internalname = sPrefix+"RECPESFEC" ;
      edtRecFecAlt_Internalname = sPrefix+"RECFECALT" ;
      edtavBarfasdti_Internalname = sPrefix+"vBARFASDTI" ;
      edtavTotvaluecant_Internalname = sPrefix+"vTOTVALUECANT" ;
      edtavTotvaluecantpdt_Internalname = sPrefix+"vTOTVALUECANTPDT" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_recpesfecauxdate_Internalname = sPrefix+"vDDO_RECPESFECAUXDATE" ;
      divDdo_recpesfecauxdates_Internalname = sPrefix+"DDO_RECPESFECAUXDATES" ;
      edtavDdo_recfecaltauxdate_Internalname = sPrefix+"vDDO_RECFECALTAUXDATE" ;
      divDdo_recfecaltauxdates_Internalname = sPrefix+"DDO_RECFECALTAUXDATES" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGrid_Internalname = sPrefix+"GRID" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtavBarfasdti_Jsonclick = "" ;
      edtavBarfasdti_Enabled = 0 ;
      edtRecFecAlt_Jsonclick = "" ;
      edtRecPesFec_Jsonclick = "" ;
      edtRecLinUsr_Jsonclick = "" ;
      edtavCantpdt_Jsonclick = "" ;
      edtavCantpdt_Enabled = 0 ;
      edtavCant_Jsonclick = "" ;
      edtavCant_Enabled = 0 ;
      edtBarNHdr_Jsonclick = "" ;
      edtRecLin_Jsonclick = "" ;
      edtRecLinPro_Jsonclick = "" ;
      edtRecLinMaq_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluecantpdt_Jsonclick = "" ;
      edtavTotvaluecantpdt_Enabled = 1 ;
      edtavTotvaluecant_Jsonclick = "" ;
      edtavTotvaluecant_Enabled = 1 ;
      edtavBarfasdti_Visible = -1 ;
      edtRecFecAlt_Visible = -1 ;
      edtRecPesFec_Visible = -1 ;
      edtRecLinUsr_Visible = -1 ;
      edtavCantpdt_Visible = -1 ;
      edtavCant_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_recfecaltauxdate_Jsonclick = "" ;
      edtavDdo_recpesfecauxdate_Jsonclick = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;Pesaje;Pesaje;;" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "StocksQuimicos.Recetas_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|||Dynamic|||" ;
      Ddo_grid_Includedatalist = "T|||T|||" ;
      Ddo_grid_Filtertype = "Character|||Character|Date|Date|" ;
      Ddo_grid_Includefilter = "T|||T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|||T|T|T|" ;
      Ddo_grid_Columnssortvalues = "|||1|2|3|" ;
      Ddo_grid_Columnids = "6:BarNHdr|7:Cant|8:CantPdt|9:RecLinUsr|10:RecPesFec|11:RecFecAlt|12:BarFasDTI" ;
      Ddo_grid_Gridinternalname = "" ;
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridpaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridpaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridpaginationbar_Pagingcaptionposition = "Left" ;
      Gridpaginationbar_Pagingbuttonsposition = "Right" ;
      Gridpaginationbar_Pagestoshow = 5 ;
      Gridpaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Class = "PaginationBar" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "WWP_FilterOptions", "") ;
      Dvpanel_tableheader_Cls = "PanelNoHeader" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public String ajaxOnSessionTimeout( )
   {
      httpContext.setAjaxOnSessionTimeout("Warn");
      return "Warn" ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV58BarFasDTI',fld:'vBARFASDTI',pic:'99/99/99 99:99:99',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A4442BarFasDTI',fld:'BARFASDTI',pic:'99/99/99 99:99:99'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47prdnum',fld:'vPRDNUM',pic:''},{av:'AV43TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV44TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFRecLinUsr',fld:'vTFRECLINUSR',pic:'@!'},{av:'AV49TFRecLinUsr_Sel',fld:'vTFRECLINUSR_SEL',pic:'@!'},{av:'AV50TFRecPesFec',fld:'vTFRECPESFEC',pic:'99/99/99 99:99'},{av:'AV59TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV77Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54TotCant',fld:'vTOTCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV56TotCantPdt',fld:'vTOTCANTPDT',pic:'ZZZZZZ9.999',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A686PrdCant',fld:'PRDCANT',pic:'ZZZZZZ9.999'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavCant_Visible',ctrl:'vCANT',prop:'Visible'},{av:'edtavCantpdt_Visible',ctrl:'vCANTPDT',prop:'Visible'},{av:'edtRecLinUsr_Visible',ctrl:'RECLINUSR',prop:'Visible'},{av:'edtRecPesFec_Visible',ctrl:'RECPESFEC',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtavBarfasdti_Visible',ctrl:'vBARFASDTI',prop:'Visible'},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV54TotCant',fld:'vTOTCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV56TotCantPdt',fld:'vTOTCANTPDT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV42Cant',fld:'vCANT',pic:'ZZZZZZ9.999'},{av:'AV45CantPdt',fld:'vCANTPDT',pic:'ZZZZZZ9.999'},{av:'AV55TotValueCant',fld:'vTOTVALUECANT',pic:''},{av:'AV57TotValueCantPdt',fld:'vTOTVALUECANTPDT',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121OP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47prdnum',fld:'vPRDNUM',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV44TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFRecLinUsr',fld:'vTFRECLINUSR',pic:'@!'},{av:'AV49TFRecLinUsr_Sel',fld:'vTFRECLINUSR_SEL',pic:'@!'},{av:'AV50TFRecPesFec',fld:'vTFRECPESFEC',pic:'99/99/99 99:99'},{av:'AV59TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV77Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54TotCant',fld:'vTOTCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV56TotCantPdt',fld:'vTOTCANTPDT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV58BarFasDTI',fld:'vBARFASDTI',pic:'99/99/99 99:99:99',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A4442BarFasDTI',fld:'BARFASDTI',pic:'99/99/99 99:99:99'},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131OP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47prdnum',fld:'vPRDNUM',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV44TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFRecLinUsr',fld:'vTFRECLINUSR',pic:'@!'},{av:'AV49TFRecLinUsr_Sel',fld:'vTFRECLINUSR_SEL',pic:'@!'},{av:'AV50TFRecPesFec',fld:'vTFRECPESFEC',pic:'99/99/99 99:99'},{av:'AV59TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV77Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54TotCant',fld:'vTOTCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV56TotCantPdt',fld:'vTOTCANTPDT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV58BarFasDTI',fld:'vBARFASDTI',pic:'99/99/99 99:99:99',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A4442BarFasDTI',fld:'BARFASDTI',pic:'99/99/99 99:99:99'},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141OP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47prdnum',fld:'vPRDNUM',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV44TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFRecLinUsr',fld:'vTFRECLINUSR',pic:'@!'},{av:'AV49TFRecLinUsr_Sel',fld:'vTFRECLINUSR_SEL',pic:'@!'},{av:'AV50TFRecPesFec',fld:'vTFRECPESFEC',pic:'99/99/99 99:99'},{av:'AV59TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV77Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54TotCant',fld:'vTOTCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV56TotCantPdt',fld:'vTOTCANTPDT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV58BarFasDTI',fld:'vBARFASDTI',pic:'99/99/99 99:99:99',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A4442BarFasDTI',fld:'BARFASDTI',pic:'99/99/99 99:99:99'},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV43TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV44TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFRecLinUsr',fld:'vTFRECLINUSR',pic:'@!'},{av:'AV49TFRecLinUsr_Sel',fld:'vTFRECLINUSR_SEL',pic:'@!'},{av:'AV50TFRecPesFec',fld:'vTFRECPESFEC',pic:'99/99/99 99:99'},{av:'AV59TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e201OP2',iparms:[{av:'A686PrdCant',fld:'PRDCANT',pic:'ZZZZZZ9.999'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'},{av:'AV58BarFasDTI',fld:'vBARFASDTI',pic:'99/99/99 99:99:99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A4442BarFasDTI',fld:'BARFASDTI',pic:'99/99/99 99:99:99'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV42Cant',fld:'vCANT',pic:'ZZZZZZ9.999'},{av:'AV45CantPdt',fld:'vCANTPDT',pic:'ZZZZZZ9.999'},{av:'AV58BarFasDTI',fld:'vBARFASDTI',pic:'99/99/99 99:99:99',hsh:true}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151OP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47prdnum',fld:'vPRDNUM',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV44TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFRecLinUsr',fld:'vTFRECLINUSR',pic:'@!'},{av:'AV49TFRecLinUsr_Sel',fld:'vTFRECLINUSR_SEL',pic:'@!'},{av:'AV50TFRecPesFec',fld:'vTFRECPESFEC',pic:'99/99/99 99:99'},{av:'AV59TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV77Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54TotCant',fld:'vTOTCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV56TotCantPdt',fld:'vTOTCANTPDT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV58BarFasDTI',fld:'vBARFASDTI',pic:'99/99/99 99:99:99',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A4442BarFasDTI',fld:'BARFASDTI',pic:'99/99/99 99:99:99'},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A686PrdCant',fld:'PRDCANT',pic:'ZZZZZZ9.999'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavCant_Visible',ctrl:'vCANT',prop:'Visible'},{av:'edtavCantpdt_Visible',ctrl:'vCANTPDT',prop:'Visible'},{av:'edtRecLinUsr_Visible',ctrl:'RECLINUSR',prop:'Visible'},{av:'edtRecPesFec_Visible',ctrl:'RECPESFEC',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtavBarfasdti_Visible',ctrl:'vBARFASDTI',prop:'Visible'},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV54TotCant',fld:'vTOTCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV56TotCantPdt',fld:'vTOTCANTPDT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV42Cant',fld:'vCANT',pic:'ZZZZZZ9.999'},{av:'AV45CantPdt',fld:'vCANTPDT',pic:'ZZZZZZ9.999'},{av:'AV55TotValueCant',fld:'vTOTVALUECANT',pic:''},{av:'AV57TotValueCantPdt',fld:'vTOTVALUECANTPDT',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111OP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV47prdnum',fld:'vPRDNUM',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV44TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFRecLinUsr',fld:'vTFRECLINUSR',pic:'@!'},{av:'AV49TFRecLinUsr_Sel',fld:'vTFRECLINUSR_SEL',pic:'@!'},{av:'AV50TFRecPesFec',fld:'vTFRECPESFEC',pic:'99/99/99 99:99'},{av:'AV59TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'AV77Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54TotCant',fld:'vTOTCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV56TotCantPdt',fld:'vTOTCANTPDT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV58BarFasDTI',fld:'vBARFASDTI',pic:'99/99/99 99:99:99',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A4442BarFasDTI',fld:'BARFASDTI',pic:'99/99/99 99:99:99'},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV52DDO_RecPesFecAuxDate',fld:'vDDO_RECPESFECAUXDATE',pic:''},{av:'AV61DDO_RecFecAltAuxDate',fld:'vDDO_RECFECALTAUXDATE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A686PrdCant',fld:'PRDCANT',pic:'ZZZZZZ9.999'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV44TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV48TFRecLinUsr',fld:'vTFRECLINUSR',pic:'@!'},{av:'AV49TFRecLinUsr_Sel',fld:'vTFRECLINUSR_SEL',pic:'@!'},{av:'AV50TFRecPesFec',fld:'vTFRECPESFEC',pic:'99/99/99 99:99'},{av:'AV59TFRecFecAlt',fld:'vTFRECFECALT',pic:'99/99/99 99:99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV61DDO_RecFecAltAuxDate',fld:'vDDO_RECFECALTAUXDATE',pic:''},{av:'AV52DDO_RecPesFecAuxDate',fld:'vDDO_RECPESFECAUXDATE',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtavCant_Visible',ctrl:'vCANT',prop:'Visible'},{av:'edtavCantpdt_Visible',ctrl:'vCANTPDT',prop:'Visible'},{av:'edtRecLinUsr_Visible',ctrl:'RECLINUSR',prop:'Visible'},{av:'edtRecPesFec_Visible',ctrl:'RECPESFEC',prop:'Visible'},{av:'edtRecFecAlt_Visible',ctrl:'RECFECALT',prop:'Visible'},{av:'edtavBarfasdti_Visible',ctrl:'vBARFASDTI',prop:'Visible'},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV54TotCant',fld:'vTOTCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV56TotCantPdt',fld:'vTOTCANTPDT',pic:'ZZZZZZ9.999',hsh:true},{av:'AV42Cant',fld:'vCANT',pic:'ZZZZZZ9.999'},{av:'AV45CantPdt',fld:'vCANTPDT',pic:'ZZZZZZ9.999'},{av:'AV55TotValueCant',fld:'vTOTVALUECANT',pic:''},{av:'AV57TotValueCantPdt',fld:'vTOTVALUECANTPDT',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e161OP2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e171OP2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_RECLINMAQ","{handler:'valid_Reclinmaq',iparms:[]");
      setEventMetadata("VALID_RECLINMAQ",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Barfasdti',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV46emprcod = "" ;
      wcpOAV47prdnum = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV46emprcod = "" ;
      AV47prdnum = "" ;
      AV15FilterFullText = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV43TFBarNHdr = "" ;
      AV44TFBarNHdr_Sel = "" ;
      AV48TFRecLinUsr = "" ;
      AV49TFRecLinUsr_Sel = "" ;
      AV50TFRecPesFec = GXutil.resetTime( GXutil.nullDate() );
      AV59TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV77Pgmname = "" ;
      AV54TotCant = DecimalUtil.ZERO ;
      AV56TotCantPdt = DecimalUtil.ZERO ;
      AV58BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A150BarFacTin = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV38DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV52DDO_RecPesFecAuxDate = GXutil.nullDate() ;
      AV61DDO_RecFecAltAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      AV42Cant = DecimalUtil.ZERO ;
      AV45CantPdt = DecimalUtil.ZERO ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV68Stocksquimicos_recetas_wcds_1_filterfulltext = "" ;
      lV69Stocksquimicos_recetas_wcds_2_tfbarnhdr = "" ;
      lV71Stocksquimicos_recetas_wcds_4_tfreclinusr = "" ;
      AV68Stocksquimicos_recetas_wcds_1_filterfulltext = "" ;
      AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel = "" ;
      AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr = "" ;
      AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel = "" ;
      AV71Stocksquimicos_recetas_wcds_4_tfreclinusr = "" ;
      AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec = GXutil.resetTime( GXutil.nullDate() );
      AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      H01OP2_A396EmprCod = new String[] {""} ;
      H01OP2_A719PrdNum = new String[] {""} ;
      H01OP2_n719PrdNum = new boolean[] {false} ;
      H01OP2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01OP2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01OP2_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      H01OP2_n4866RecFecAlt = new boolean[] {false} ;
      H01OP2_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01OP2_A4576RecLinUsr = new String[] {""} ;
      H01OP2_A811RecLin = new short[1] ;
      H01OP2_A1273RecLinPro = new byte[1] ;
      H01OP2_A2804RecLinMaq = new short[1] ;
      H01OP2_A130BarCodPar = new String[] {""} ;
      H01OP2_A132BarCodReo = new byte[1] ;
      H01OP2_A129BarCod = new int[1] ;
      H01OP3_AGRID_nRecordCount = new long[1] ;
      AV55TotValueCant = "" ;
      AV57TotValueCantPdt = "" ;
      AV65Station = "" ;
      GXv_char2 = new String[1] ;
      AV66Emprnom = "" ;
      AV67Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      H01OP4_A758ProCod = new String[] {""} ;
      H01OP4_A396EmprCod = new String[] {""} ;
      H01OP4_A129BarCod = new int[1] ;
      H01OP4_A132BarCodReo = new byte[1] ;
      H01OP4_A130BarCodPar = new String[] {""} ;
      H01OP4_A150BarFacTin = new String[] {""} ;
      H01OP4_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H01OP4_n4442BarFasDTI = new boolean[] {false} ;
      H01OP4_A194BarOrdLin = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char12 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState13 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H01OP5_A1273RecLinPro = new byte[1] ;
      H01OP5_A811RecLin = new short[1] ;
      H01OP5_A2804RecLinMaq = new short[1] ;
      H01OP5_A719PrdNum = new String[] {""} ;
      H01OP5_n719PrdNum = new boolean[] {false} ;
      H01OP5_A396EmprCod = new String[] {""} ;
      H01OP5_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      H01OP5_n4866RecFecAlt = new boolean[] {false} ;
      H01OP5_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01OP5_A4576RecLinUsr = new String[] {""} ;
      H01OP5_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01OP5_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01OP5_A130BarCodPar = new String[] {""} ;
      H01OP5_A132BarCodReo = new byte[1] ;
      H01OP5_A129BarCod = new int[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV46emprcod = "" ;
      sCtrlAV47prdnum = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.recetas_wc__default(),
         new Object[] {
             new Object[] {
            H01OP2_A396EmprCod, H01OP2_A719PrdNum, H01OP2_n719PrdNum, H01OP2_A707PrdFacCon, H01OP2_A686PrdCant, H01OP2_A4866RecFecAlt, H01OP2_n4866RecFecAlt, H01OP2_A4577RecPesFec, H01OP2_A4576RecLinUsr, H01OP2_A811RecLin,
            H01OP2_A1273RecLinPro, H01OP2_A2804RecLinMaq, H01OP2_A130BarCodPar, H01OP2_A132BarCodReo, H01OP2_A129BarCod
            }
            , new Object[] {
            H01OP3_AGRID_nRecordCount
            }
            , new Object[] {
            H01OP4_A758ProCod, H01OP4_A396EmprCod, H01OP4_A129BarCod, H01OP4_A132BarCodReo, H01OP4_A130BarCodPar, H01OP4_A150BarFacTin, H01OP4_A4442BarFasDTI, H01OP4_n4442BarFasDTI, H01OP4_A194BarOrdLin
            }
            , new Object[] {
            H01OP5_A1273RecLinPro, H01OP5_A811RecLin, H01OP5_A2804RecLinMaq, H01OP5_A719PrdNum, H01OP5_n719PrdNum, H01OP5_A396EmprCod, H01OP5_A4866RecFecAlt, H01OP5_n4866RecFecAlt, H01OP5_A4577RecPesFec, H01OP5_A4576RecLinUsr,
            H01OP5_A707PrdFacCon, H01OP5_A686PrdCant, H01OP5_A130BarCodPar, H01OP5_A132BarCodReo, H01OP5_A129BarCod
            }
         }
      );
      AV77Pgmname = "StocksQuimicos.Recetas_WC" ;
      /* GeneXus formulas. */
      AV77Pgmname = "StocksQuimicos.Recetas_WC" ;
      Gx_err = (short)(0) ;
      edtavCant_Enabled = 0 ;
      edtavCantpdt_Enabled = 0 ;
      edtavBarfasdti_Enabled = 0 ;
      edtavTotvaluecant_Enabled = 0 ;
      edtavTotvaluecantpdt_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV75Nfasestinte ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV12OrderedBy ;
   private short A194BarOrdLin ;
   private short wbEnd ;
   private short wbStart ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int nGXsfl_41_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavCant_Enabled ;
   private int edtavCantpdt_Enabled ;
   private int edtavBarfasdti_Enabled ;
   private int edtavTotvaluecant_Enabled ;
   private int edtavTotvaluecantpdt_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtBarNHdr_Visible ;
   private int edtavCant_Visible ;
   private int edtavCantpdt_Visible ;
   private int edtRecLinUsr_Visible ;
   private int edtRecPesFec_Visible ;
   private int edtRecFecAlt_Visible ;
   private int edtavBarfasdti_Visible ;
   private int AV39PageToGo ;
   private int AV78GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV40GridCurrentPage ;
   private long AV41GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV54TotCant ;
   private java.math.BigDecimal AV56TotCantPdt ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal AV42Cant ;
   private java.math.BigDecimal AV45CantPdt ;
   private String wcpOAV46emprcod ;
   private String wcpOAV47prdnum ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV46emprcod ;
   private String AV47prdnum ;
   private String sGXsfl_41_idx="0001" ;
   private String AV43TFBarNHdr ;
   private String AV44TFBarNHdr_Sel ;
   private String AV48TFRecLinUsr ;
   private String AV49TFRecLinUsr_Sel ;
   private String AV77Pgmname ;
   private String A150BarFacTin ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Gridpaginationbar_Class ;
   private String Gridpaginationbar_Pagingbuttonsposition ;
   private String Gridpaginationbar_Pagingcaptionposition ;
   private String Gridpaginationbar_Emptygridclass ;
   private String Gridpaginationbar_Rowsperpageoptions ;
   private String Gridpaginationbar_Previous ;
   private String Gridpaginationbar_Next ;
   private String Gridpaginationbar_Caption ;
   private String Gridpaginationbar_Emptygridcaption ;
   private String Gridpaginationbar_Rowsperpagecaption ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_recpesfecauxdates_Internalname ;
   private String edtavDdo_recpesfecauxdate_Internalname ;
   private String edtavDdo_recpesfecauxdate_Jsonclick ;
   private String divDdo_recfecaltauxdates_Internalname ;
   private String edtavDdo_recfecaltauxdate_Internalname ;
   private String edtavDdo_recfecaltauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtRecLinMaq_Internalname ;
   private String edtRecLinPro_Internalname ;
   private String edtRecLin_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String edtavCant_Internalname ;
   private String edtavCantpdt_Internalname ;
   private String A4576RecLinUsr ;
   private String edtRecLinUsr_Internalname ;
   private String edtRecPesFec_Internalname ;
   private String edtRecFecAlt_Internalname ;
   private String edtavBarfasdti_Internalname ;
   private String edtavTotvaluecant_Internalname ;
   private String edtavTotvaluecantpdt_Internalname ;
   private String scmdbuf ;
   private String lV69Stocksquimicos_recetas_wcds_2_tfbarnhdr ;
   private String lV71Stocksquimicos_recetas_wcds_4_tfreclinusr ;
   private String AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel ;
   private String AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr ;
   private String AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel ;
   private String AV71Stocksquimicos_recetas_wcds_4_tfreclinusr ;
   private String AV65Station ;
   private String GXv_char2[] ;
   private String AV66Emprnom ;
   private String AV67Usurcod ;
   private String GXt_char12 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluecant_Jsonclick ;
   private String edtavTotvaluecantpdt_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV46emprcod ;
   private String sCtrlAV47prdnum ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtRecLinPro_Jsonclick ;
   private String edtRecLin_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtavCant_Jsonclick ;
   private String edtavCantpdt_Jsonclick ;
   private String edtRecLinUsr_Jsonclick ;
   private String edtRecPesFec_Jsonclick ;
   private String edtRecFecAlt_Jsonclick ;
   private String edtavBarfasdti_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV50TFRecPesFec ;
   private java.util.Date AV59TFRecFecAlt ;
   private java.util.Date AV58BarFasDTI ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4577RecPesFec ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec ;
   private java.util.Date AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt ;
   private java.util.Date AV52DDO_RecPesFecAuxDate ;
   private java.util.Date AV61DDO_RecFecAltAuxDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean n4442BarFasDTI ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n4866RecFecAlt ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String lV68Stocksquimicos_recetas_wcds_1_filterfulltext ;
   private String AV68Stocksquimicos_recetas_wcds_1_filterfulltext ;
   private String AV55TotValueCant ;
   private String AV57TotValueCantPdt ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H01OP2_A396EmprCod ;
   private String[] H01OP2_A719PrdNum ;
   private boolean[] H01OP2_n719PrdNum ;
   private java.math.BigDecimal[] H01OP2_A707PrdFacCon ;
   private java.math.BigDecimal[] H01OP2_A686PrdCant ;
   private java.util.Date[] H01OP2_A4866RecFecAlt ;
   private boolean[] H01OP2_n4866RecFecAlt ;
   private java.util.Date[] H01OP2_A4577RecPesFec ;
   private String[] H01OP2_A4576RecLinUsr ;
   private short[] H01OP2_A811RecLin ;
   private byte[] H01OP2_A1273RecLinPro ;
   private short[] H01OP2_A2804RecLinMaq ;
   private String[] H01OP2_A130BarCodPar ;
   private byte[] H01OP2_A132BarCodReo ;
   private int[] H01OP2_A129BarCod ;
   private long[] H01OP3_AGRID_nRecordCount ;
   private String[] H01OP4_A758ProCod ;
   private String[] H01OP4_A396EmprCod ;
   private int[] H01OP4_A129BarCod ;
   private byte[] H01OP4_A132BarCodReo ;
   private String[] H01OP4_A130BarCodPar ;
   private String[] H01OP4_A150BarFacTin ;
   private java.util.Date[] H01OP4_A4442BarFasDTI ;
   private boolean[] H01OP4_n4442BarFasDTI ;
   private short[] H01OP4_A194BarOrdLin ;
   private byte[] H01OP5_A1273RecLinPro ;
   private short[] H01OP5_A811RecLin ;
   private short[] H01OP5_A2804RecLinMaq ;
   private String[] H01OP5_A719PrdNum ;
   private boolean[] H01OP5_n719PrdNum ;
   private String[] H01OP5_A396EmprCod ;
   private java.util.Date[] H01OP5_A4866RecFecAlt ;
   private boolean[] H01OP5_n4866RecFecAlt ;
   private java.util.Date[] H01OP5_A4577RecPesFec ;
   private String[] H01OP5_A4576RecLinUsr ;
   private java.math.BigDecimal[] H01OP5_A707PrdFacCon ;
   private java.math.BigDecimal[] H01OP5_A686PrdCant ;
   private String[] H01OP5_A130BarCodPar ;
   private byte[] H01OP5_A132BarCodReo ;
   private int[] H01OP5_A129BarCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState13[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV38DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class recetas_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01OP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV68Stocksquimicos_recetas_wcds_1_filterfulltext ,
                                          String AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel ,
                                          String AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr ,
                                          String AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel ,
                                          String AV71Stocksquimicos_recetas_wcds_4_tfreclinusr ,
                                          java.util.Date AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec ,
                                          java.util.Date AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4576RecLinUsr ,
                                          java.util.Date A4577RecPesFec ,
                                          java.util.Date A4866RecFecAlt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV46emprcod ,
                                          String AV47prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[15];
      Object[] GXv_Object15 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.PrdNum, T2.PrdFacCon, T1.PrdCant, T3.RecFecAlt, T1.RecPesFec, T1.RecLinUsr, T1.RecLin, T1.RecLinPro, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod" ;
      sFromString = " FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPRECMAQ T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod" ;
      sFromString += " = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV68Stocksquimicos_recetas_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.RecLinUsr) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
         GXv_int14[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel)==0) && ( ! (GXutil.strcmp("", AV71Stocksquimicos_recetas_wcds_4_tfreclinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLinUsr = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec) )
      {
         addWhere(sWhereString, "(T1.RecPesFec >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T3.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecLinUsr" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecLinUsr DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecPesFec" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecPesFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.RecFecAlt" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.RecFecAlt DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_H01OP3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV68Stocksquimicos_recetas_wcds_1_filterfulltext ,
                                          String AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel ,
                                          String AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr ,
                                          String AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel ,
                                          String AV71Stocksquimicos_recetas_wcds_4_tfreclinusr ,
                                          java.util.Date AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec ,
                                          java.util.Date AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4576RecLinUsr ,
                                          java.util.Date A4577RecPesFec ,
                                          java.util.Date A4866RecFecAlt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV46emprcod ,
                                          String AV47prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[10];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPRECMAQ T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV68Stocksquimicos_recetas_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.RecLinUsr) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
         GXv_int16[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel)==0) && ( ! (GXutil.strcmp("", AV71Stocksquimicos_recetas_wcds_4_tfreclinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLinUsr = ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec) )
      {
         addWhere(sWhereString, "(T1.RecPesFec >= ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T3.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_H01OP5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV68Stocksquimicos_recetas_wcds_1_filterfulltext ,
                                          String AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel ,
                                          String AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr ,
                                          String AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel ,
                                          String AV71Stocksquimicos_recetas_wcds_4_tfreclinusr ,
                                          java.util.Date AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec ,
                                          java.util.Date AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4576RecLinUsr ,
                                          java.util.Date A4577RecPesFec ,
                                          java.util.Date A4866RecFecAlt ,
                                          String AV46emprcod ,
                                          String AV47prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[10];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T1.RecLinPro, T1.RecLin, T1.RecLinMaq, T1.PrdNum, T1.EmprCod, T3.RecFecAlt, T1.RecPesFec, T1.RecLinUsr, T2.PrdFacCon, T1.PrdCant, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPRECMAQ T3 ON T3.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV68Stocksquimicos_recetas_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.RecLinUsr) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int18[2] = (byte)(1) ;
         GXv_int18[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV69Stocksquimicos_recetas_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Stocksquimicos_recetas_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel)==0) && ( ! (GXutil.strcmp("", AV71Stocksquimicos_recetas_wcds_4_tfreclinusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLinUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Stocksquimicos_recetas_wcds_5_tfreclinusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLinUsr = ?)");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV73Stocksquimicos_recetas_wcds_6_tfrecpesfec) )
      {
         addWhere(sWhereString, "(T1.RecPesFec >= ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV74Stocksquimicos_recetas_wcds_7_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T3.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H01OP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 1 :
                  return conditional_H01OP3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 3 :
                  return conditional_H01OP5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01OP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01OP3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01OP4", "SELECT ProCod, EmprCod, BarCod, BarCodReo, BarCodPar, BarFacTin, BarFasDTI, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01OP5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 8);
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,3);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[24], false);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[18], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[19], false);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[18], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[19], false);
               }
               return;
      }
   }

}

