package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class impresionhdrcv_impl extends GXWebComponent
{
   public impresionhdrcv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public impresionhdrcv_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impresionhdrcv_impl.class ));
   }

   public impresionhdrcv_impl( int remoteHandle ,
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
      chkavSeleccionar = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
               AV5Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
               AV32Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Barcod), 8, 0));
               AV36Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Barcodreo", GXutil.str( AV36Barcodreo, 1, 0));
               AV34Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Barcodpar", AV34Barcodpar);
               AV33Barcod_to = (int)(GXutil.lval( httpContext.GetPar( "Barcod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Barcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Barcod_to), 8, 0));
               AV37Barcodreo_to = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Barcodreo_to", GXutil.str( AV37Barcodreo_to, 1, 0));
               AV35Barcodpar_to = httpContext.GetPar( "Barcodpar_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Barcodpar_to", AV35Barcodpar_to);
               AV6BarFecGen = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarFecGen", localUtil.format(AV6BarFecGen, "99/99/99"));
               AV7BarFecGen_to = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarFecGen_to", localUtil.format(AV7BarFecGen_to, "99/99/99"));
               AV8BarLis = (byte)(GXutil.lval( httpContext.GetPar( "BarLis"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarLis", GXutil.str( AV8BarLis, 1, 0));
               AV47BarEnccli = httpContext.GetPar( "BarEnccli") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47BarEnccli", AV47BarEnccli);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,Integer.valueOf(AV32Barcod),Byte.valueOf(AV36Barcodreo),AV34Barcodpar,Integer.valueOf(AV33Barcod_to),Byte.valueOf(AV37Barcodreo_to),AV35Barcodpar_to,AV6BarFecGen,AV7BarFecGen_to,Byte.valueOf(AV8BarLis),AV47BarEnccli});
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
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
      nRC_GXsfl_37 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_37"))) ;
      nGXsfl_37_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_37_idx"))) ;
      sGXsfl_37_idx = httpContext.GetPar( "sGXsfl_37_idx") ;
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
      AV27ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV22ColumnsSelector);
      AV66Pgmname = httpContext.GetPar( "Pgmname") ;
      AV16FilterFullText = httpContext.GetPar( "FilterFullText") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV17ImpresionHdr_SDTs);
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV66Pgmname, AV16FilterFullText, AV17ImpresionHdr_SDTs, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa19R2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Impresion Hdr", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.impresionhdrcv", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV32Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV36Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV34Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV33Barcod_to,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37Barcodreo_to,1,0)),GXutil.URLEncode(GXutil.rtrim(AV35Barcodpar_to)),GXutil.URLEncode(GXutil.formatDateParm(AV6BarFecGen)),GXutil.URLEncode(GXutil.formatDateParm(AV7BarFecGen_to)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarLis,1,0)),GXutil.URLEncode(GXutil.rtrim(AV47BarEnccli))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","Barcod_to","Barcodreo_to","Barcodpar_to","BarFecGen","BarFecGen_to","BarLis","BarEnccli"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV66Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vIMPRESIONHDR_SDTS", getSecureSignedToken( sPrefix, AV17ImpresionHdr_SDTs));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Impresionhdr_sdts", AV17ImpresionHdr_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Impresionhdr_sdts", AV17ImpresionHdr_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Impresionhdr_sdts", getSecureSignedToken( sPrefix, AV17ImpresionHdr_SDTs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_37", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_37, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV25ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV25ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV30GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV31GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV28DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV28DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV22ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV22ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32Barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV32Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36Barcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV36Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34Barcodpar", GXutil.rtrim( wcpOAV34Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33Barcod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV33Barcod_to, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37Barcodreo_to", GXutil.ltrim( localUtil.ntoc( wcpOAV37Barcodreo_to, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35Barcodpar_to", GXutil.rtrim( wcpOAV35Barcodpar_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6BarFecGen", localUtil.dtoc( wcpOAV6BarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7BarFecGen_to", localUtil.dtoc( wcpOAV7BarFecGen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8BarLis", GXutil.ltrim( localUtil.ntoc( wcpOAV8BarLis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47BarEnccli", GXutil.rtrim( wcpOAV47BarEnccli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV27ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV66Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV66Pgmname, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vIMPRESIONHDR_SDTS", AV17ImpresionHdr_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vIMPRESIONHDR_SDTS", AV17ImpresionHdr_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vIMPRESIONHDR_SDTS", getSecureSignedToken( sPrefix, AV17ImpresionHdr_SDTs));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV14GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV14GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV45UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIMPCOD", GXutil.rtrim( AV46ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOUTPUT", GXutil.rtrim( Gx_out));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV32Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV36Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV34Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV33Barcod_to, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO_TO", GXutil.ltrim( localUtil.ntoc( AV37Barcodreo_to, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR_TO", GXutil.rtrim( AV35Barcodpar_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGEN", localUtil.dtoc( AV6BarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGEN_TO", localUtil.dtoc( AV7BarFecGen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARLIS", GXutil.ltrim( localUtil.ntoc( AV8BarLis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARENCCLI", GXutil.rtrim( AV47BarEnccli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS_Title", GXutil.rtrim( Dvelop_confirmpanel_imprimiros_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_imprimiros_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_imprimiros_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_imprimiros_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_imprimiros_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_imprimiros_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_imprimiros_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DETAILWEBCOMPONENT_MODAL_Width", GXutil.rtrim( Detailwebcomponent_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DETAILWEBCOMPONENT_MODAL_Title", GXutil.rtrim( Detailwebcomponent_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DETAILWEBCOMPONENT_MODAL_Confirmtype", GXutil.rtrim( Detailwebcomponent_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DETAILWEBCOMPONENT_MODAL_Bodytype", GXutil.rtrim( Detailwebcomponent_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS_Result", GXutil.rtrim( Dvelop_confirmpanel_imprimiros_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS_Result", GXutil.rtrim( Dvelop_confirmpanel_imprimiros_Result));
   }

   public void renderHtmlCloseForm19R2( )
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
         if ( ! ( WebComp_Grid_dwc == null ) )
         {
            WebComp_Grid_dwc.componentjscripts();
         }
         if ( ! ( WebComp_Wwpaux_wc == null ) )
         {
            WebComp_Wwpaux_wc.componentjscripts();
         }
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
      return "ImpresionHdrCv" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Impresion Hdr", "") ;
   }

   public void wb19R0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.impresionhdrcv");
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
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 37, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ImpresionHdrCv.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_19_19R2( true) ;
      }
      else
      {
         wb_table1_19_19R2( false) ;
      }
      return  ;
   }

   public void wb_table1_19_19R2e( boolean wbgen )
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
         startgridcontrol37( ) ;
      }
      if ( wbEnd == 37 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_37 = (int)(nGXsfl_37_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV58GXV1 = nGXsfl_37_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV30GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV31GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0054"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0054"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_37_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0054"+"");
                  }
                  WebComp_Grid_dwc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
         ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
         ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
         ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
         ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
         ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
         ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
         ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
         ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
         ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         wb_table2_59_19R2( true) ;
      }
      else
      {
         wb_table2_59_19R2( false) ;
      }
      return  ;
   }

   public void wb_table2_59_19R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV28DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV28DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV22ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table3_74_19R2( true) ;
      }
      else
      {
         wb_table3_74_19R2( false) ;
      }
      return  ;
   }

   public void wb_table3_74_19R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_79_19R2( true) ;
      }
      else
      {
         wb_table4_79_19R2( false) ;
      }
      return  ;
   }

   public void wb_table4_79_19R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0086"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0086"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_37_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0086"+"");
                  }
                  WebComp_Wwpaux_wc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 37 )
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
               AV58GXV1 = nGXsfl_37_idx ;
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

   public void start19R2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Impresion Hdr", ""), (short)(0)) ;
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
            strup19R0( ) ;
         }
      }
   }

   public void ws19R2( )
   {
      start19R2( ) ;
      evt19R2( ) ;
   }

   public void evt19R2( )
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
                              strup19R0( ) ;
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
                              strup19R0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1119R2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19R0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1219R2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19R0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1319R2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19R0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1419R2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_IMPRIMIROS.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19R0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1519R2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DETAILWEBCOMPONENT_MODAL.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19R0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1619R2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOIMPRIMIRRESUMO'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19R0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoImprimirResumo' */
                                 e1719R2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOIMPRIMIROSRESUMO'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19R0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoImprimirOSResumo' */
                                 e1819R2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup19R0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = chkavSeleccionar.getInternalname() ;
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
                              strup19R0( ) ;
                           }
                           nGXsfl_37_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_372( ) ;
                           AV58GXV1 = (int)(nGXsfl_37_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV17ImpresionHdr_SDTs.size() >= AV58GXV1 ) && ( AV58GXV1 > 0 ) )
                           {
                              AV17ImpresionHdr_SDTs.currentItem( ((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)) );
                              AV38Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV38Seleccionar);
                              AV49DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV49DetailWebComponent);
                              if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
                              {
                                 httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
                                 GX_FocusControl = edtavClicod_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                 wbErr = true ;
                                 AV53CliCod = 0 ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53CliCod), 6, 0));
                              }
                              else
                              {
                                 AV53CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53CliCod), 6, 0));
                              }
                              AV54BarEncCli2 = httpContext.cgiGet( edtavBarenccli2_Internalname) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarenccli2_Internalname, AV54BarEncCli2);
                              if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                              {
                                 httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUMERODEHDRS");
                                 GX_FocusControl = edtavNumerodehdrs_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                 wbErr = true ;
                                 AV48NumerodeHdrs = (short)(0) ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNumerodehdrs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48NumerodeHdrs), 4, 0));
                              }
                              else
                              {
                                 AV48NumerodeHdrs = (short)(localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNumerodehdrs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48NumerodeHdrs), 4, 0));
                              }
                              AV55RelaciondeHdrs = httpContext.cgiGet( edtavRelaciondehdrs_Internalname) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRelaciondehdrs_Internalname, AV55RelaciondeHdrs);
                           }
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1919R2 ();
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e2019R2 ();
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2119R2 ();
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
                                    strup19R0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 54 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0054") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0054", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                     else if ( nCmpId == 86 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( sPrefix+"W0086") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess(sPrefix+"W0086", "", sEvt);
                        }
                        WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we19R2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm19R2( ) ;
         }
      }
   }

   public void pa19R2( )
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
      subsflControlProps_372( ) ;
      while ( nGXsfl_37_idx <= nRC_GXsfl_37 )
      {
         sendrow_372( ) ;
         nGXsfl_37_idx = ((subGrid_Islastpage==1)&&(nGXsfl_37_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_37_idx+1) ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV27ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ,
                                 String AV66Pgmname ,
                                 String AV16FilterFullText ,
                                 GXBaseCollection<app.SdtImpresionHdrCv_SDT> AV17ImpresionHdr_SDTs ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2019R2 ();
      GRID_nCurrentRecord = 0 ;
      rf19R2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
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
      rf19R2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV66Pgmname = "ImpresionHdrCv" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavImpresionhdr_sdts__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionhdr_sdts__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionhdr_sdts__clicod_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavImpresionhdr_sdts__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionhdr_sdts__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionhdr_sdts__clinom_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavImpresionhdr_sdts__barenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionhdr_sdts__barenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionhdr_sdts__barenccli_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavImpresionhdr_sdts__numero_numerohdrs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionhdr_sdts__numero_numerohdrs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionhdr_sdts__numero_numerohdrs_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavImpresionhdr_sdts__numero_relacionhdrs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionhdr_sdts__numero_relacionhdrs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionhdr_sdts__numero_relacionhdrs_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavBarenccli2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli2_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavNumerodehdrs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNumerodehdrs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNumerodehdrs_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavRelaciondehdrs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRelaciondehdrs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRelaciondehdrs_Enabled), 5, 0), !bGXsfl_37_Refreshing);
   }

   public void rf19R2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(37) ;
      /* Execute user event: Refresh */
      e2019R2 ();
      nGXsfl_37_idx = 1 ;
      sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_372( ) ;
      bGXsfl_37_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
            {
               WebComp_Grid_dwc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
            {
               WebComp_Wwpaux_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_372( ) ;
         e2119R2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_37_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e2119R2 ();
         }
         wbEnd = (short)(37) ;
         wb19R0( ) ;
      }
      bGXsfl_37_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes19R2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV66Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV66Pgmname, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vIMPRESIONHDR_SDTS", AV17ImpresionHdr_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vIMPRESIONHDR_SDTS", AV17ImpresionHdr_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vIMPRESIONHDR_SDTS", getSecureSignedToken( sPrefix, AV17ImpresionHdr_SDTs));
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
      return AV17ImpresionHdr_SDTs.size() ;
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV66Pgmname, AV16FilterFullText, AV17ImpresionHdr_SDTs, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV66Pgmname, AV16FilterFullText, AV17ImpresionHdr_SDTs, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV66Pgmname, AV16FilterFullText, AV17ImpresionHdr_SDTs, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV66Pgmname, AV16FilterFullText, AV17ImpresionHdr_SDTs, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV27ManageFiltersExecutionStep, AV22ColumnsSelector, AV66Pgmname, AV16FilterFullText, AV17ImpresionHdr_SDTs, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV66Pgmname = "ImpresionHdrCv" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavImpresionhdr_sdts__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionhdr_sdts__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionhdr_sdts__clicod_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavImpresionhdr_sdts__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionhdr_sdts__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionhdr_sdts__clinom_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavImpresionhdr_sdts__barenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionhdr_sdts__barenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionhdr_sdts__barenccli_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavImpresionhdr_sdts__numero_numerohdrs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionhdr_sdts__numero_numerohdrs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionhdr_sdts__numero_numerohdrs_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavImpresionhdr_sdts__numero_relacionhdrs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionhdr_sdts__numero_relacionhdrs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionhdr_sdts__numero_relacionhdrs_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavBarenccli2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli2_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavNumerodehdrs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNumerodehdrs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNumerodehdrs_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavRelaciondehdrs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRelaciondehdrs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRelaciondehdrs_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup19R0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1919R2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Impresionhdr_sdts"), AV17ImpresionHdr_SDTs);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV25ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV28DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV22ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vIMPRESIONHDR_SDTS"), AV17ImpresionHdr_SDTs);
         /* Read saved values. */
         nRC_GXsfl_37 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_37"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV30GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV31GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV32Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV36Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV34Barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV34Barcodpar") ;
         wcpOAV33Barcod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33Barcod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV37Barcodreo_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37Barcodreo_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV35Barcodpar_to = httpContext.cgiGet( sPrefix+"wcpOAV35Barcodpar_to") ;
         wcpOAV6BarFecGen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV6BarFecGen"), 0) ;
         wcpOAV7BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV7BarFecGen_to"), 0) ;
         wcpOAV8BarLis = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8BarLis"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV47BarEnccli = httpContext.cgiGet( sPrefix+"wcpOAV47BarEnccli") ;
         AV5Emprcod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
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
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Dvelop_confirmpanel_imprimiros_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS_Title") ;
         Dvelop_confirmpanel_imprimiros_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS_Confirmationtext") ;
         Dvelop_confirmpanel_imprimiros_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_imprimiros_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS_Nobuttoncaption") ;
         Dvelop_confirmpanel_imprimiros_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_imprimiros_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS_Yesbuttonposition") ;
         Dvelop_confirmpanel_imprimiros_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS_Confirmtype") ;
         Detailwebcomponent_modal_Width = httpContext.cgiGet( sPrefix+"DETAILWEBCOMPONENT_MODAL_Width") ;
         Detailwebcomponent_modal_Title = httpContext.cgiGet( sPrefix+"DETAILWEBCOMPONENT_MODAL_Title") ;
         Detailwebcomponent_modal_Confirmtype = httpContext.cgiGet( sPrefix+"DETAILWEBCOMPONENT_MODAL_Confirmtype") ;
         Detailwebcomponent_modal_Bodytype = httpContext.cgiGet( sPrefix+"DETAILWEBCOMPONENT_MODAL_Bodytype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvelop_confirmpanel_imprimiros_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS_Result") ;
         nRC_GXsfl_37 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_37"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_37_fel_idx = 0 ;
         while ( nGXsfl_37_fel_idx < nRC_GXsfl_37 )
         {
            nGXsfl_37_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_37_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_37_fel_idx+1) ;
            sGXsfl_37_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_372( ) ;
            AV58GXV1 = (int)(nGXsfl_37_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV17ImpresionHdr_SDTs.size() >= AV58GXV1 ) && ( AV58GXV1 > 0 ) )
            {
               AV17ImpresionHdr_SDTs.currentItem( ((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)) );
               AV38Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
               AV49DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
                  GX_FocusControl = edtavClicod_Internalname ;
                  wbErr = true ;
                  AV53CliCod = 0 ;
               }
               else
               {
                  AV53CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               }
               AV54BarEncCli2 = httpContext.cgiGet( edtavBarenccli2_Internalname) ;
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUMERODEHDRS");
                  GX_FocusControl = edtavNumerodehdrs_Internalname ;
                  wbErr = true ;
                  AV48NumerodeHdrs = (short)(0) ;
               }
               else
               {
                  AV48NumerodeHdrs = (short)(localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               }
               AV55RelaciondeHdrs = httpContext.cgiGet( edtavRelaciondehdrs_Internalname) ;
            }
         }
         if ( nGXsfl_37_fel_idx == 0 )
         {
            nGXsfl_37_idx = 1 ;
            sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_372( ) ;
         }
         nGXsfl_37_fel_idx = 1 ;
         /* Read variables values. */
         AV16FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FilterFullText", AV16FilterFullText);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e1919R2 ();
      if (returnInSub) return;
   }

   public void e1919R2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV64Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      impresionhdrcv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV64Station = GXt_char1 ;
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV65Emprnom ;
      GXv_char4[0] = AV45UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV64Station, GXv_char2, GXv_char3, GXv_char4) ;
      impresionhdrcv_impl.this.AV5Emprcod = GXv_char2[0] ;
      impresionhdrcv_impl.this.AV65Emprnom = GXv_char3[0] ;
      impresionhdrcv_impl.this.AV45UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45UsurCod", AV45UsurCod);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV28DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV28DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_objcol_SdtImpresionHdrCv_SDT7 = AV17ImpresionHdr_SDTs ;
      GXv_objcol_SdtImpresionHdrCv_SDT8[0] = GXt_objcol_SdtImpresionHdrCv_SDT7 ;
      new app.impresionhdrscv_dp(remoteHandle, context).execute( AV5Emprcod, AV32Barcod, AV36Barcodreo, AV34Barcodpar, AV33Barcod_to, AV37Barcodreo_to, AV35Barcodpar_to, AV6BarFecGen, AV7BarFecGen_to, AV8BarLis, AV47BarEnccli, GXv_objcol_SdtImpresionHdrCv_SDT8) ;
      GXt_objcol_SdtImpresionHdrCv_SDT7 = GXv_objcol_SdtImpresionHdrCv_SDT8[0] ;
      AV17ImpresionHdr_SDTs = GXt_objcol_SdtImpresionHdrCv_SDT7 ;
      gx_BV37 = true ;
   }

   public void e2019R2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV10WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV27ManageFiltersExecutionStep == 1 )
      {
         AV27ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV27ManageFiltersExecutionStep == 2 )
      {
         AV27ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV24Session.getValue("ImpresionHdrCvColumnsSelector"), "") != 0 )
      {
         AV20ColumnsSelectorXML = AV24Session.getValue("ImpresionHdrCvColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV20ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      chkavSeleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavSeleccionar.getVisible(), 5, 0), !bGXsfl_37_Refreshing);
      edtavImpresionhdr_sdts__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionhdr_sdts__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionhdr_sdts__clicod_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavImpresionhdr_sdts__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionhdr_sdts__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionhdr_sdts__clinom_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavImpresionhdr_sdts__barenccli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionhdr_sdts__barenccli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionhdr_sdts__barenccli_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavImpresionhdr_sdts__numero_numerohdrs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionhdr_sdts__numero_numerohdrs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionhdr_sdts__numero_numerohdrs_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavImpresionhdr_sdts__numero_relacionhdrs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionhdr_sdts__numero_relacionhdrs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionhdr_sdts__numero_relacionhdrs_Visible), 5, 0), !bGXsfl_37_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV30GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30GridCurrentPage), 10, 0));
      AV31GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ManageFiltersData", AV25ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   public void e1219R2( )
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
         AV29PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV29PageToGo) ;
      }
   }

   public void e1319R2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e2119R2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV17ImpresionHdr_SDTs.size() )
      {
         AV17ImpresionHdr_SDTs.currentItem( ((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)) );
         AV49DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV49DetailWebComponent);
         AV38Seleccionar = "N" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV38Seleccionar);
         AV53CliCod = ((app.SdtImpresionHdrCv_SDT)(AV17ImpresionHdr_SDTs.currentItem())).getgxTv_SdtImpresionHdrCv_SDT_Clicod() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53CliCod), 6, 0));
         AV54BarEncCli2 = ((app.SdtImpresionHdrCv_SDT)(AV17ImpresionHdr_SDTs.currentItem())).getgxTv_SdtImpresionHdrCv_SDT_Barenccli() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarenccli2_Internalname, AV54BarEncCli2);
         AV48NumerodeHdrs = ((app.SdtImpresionHdrCv_SDT)(AV17ImpresionHdr_SDTs.currentItem())).getgxTv_SdtImpresionHdrCv_SDT_Numero().getgxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNumerodehdrs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48NumerodeHdrs), 4, 0));
         AV55RelaciondeHdrs = ((app.SdtImpresionHdrCv_SDT)(AV17ImpresionHdr_SDTs.currentItem())).getgxTv_SdtImpresionHdrCv_SDT_Numero().getgxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRelaciondehdrs_Internalname, AV55RelaciondeHdrs);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(37) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_372( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_37_Refreshing )
         {
            httpContext.doAjaxLoad(37, GridRow);
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e1419R2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV20ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV22ColumnsSelector.fromJSonString(AV20ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ImpresionHdrCvColumnsSelector", ((GXutil.strcmp("", AV20ColumnsSelectorXML)==0) ? "" : AV22ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ManageFiltersData", AV25ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   public void e1119R2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S162 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("ImpresionHdrCvFilters")),GXutil.URLEncode(GXutil.rtrim(AV66Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV27ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("ImpresionHdrCvFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV27ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV26ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "ImpresionHdrCvFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         impresionhdrcv_impl.this.GXt_char1 = GXv_char4[0] ;
         AV26ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV26ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV66Pgmname+"GridState", AV26ManageFiltersXml) ;
            AV14GridState.fromxml(AV26ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ManageFiltersData", AV25ManageFiltersData);
   }

   public void e1519R2( )
   {
      AV58GXV1 = (int)(nGXsfl_37_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV58GXV1 > 0 ) && ( AV17ImpresionHdr_SDTs.size() >= AV58GXV1 ) )
      {
         AV17ImpresionHdr_SDTs.currentItem( ((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)) );
      }
      /* Dvelop_confirmpanel_imprimiros_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_imprimiros_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION IMPRIMIROS' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ManageFiltersData", AV25ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   public void e1719R2( )
   {
      /* 'DoImprimirResumo' Routine */
      returnInSub = false ;
      /* Start For Each Line in Grid */
      nRC_GXsfl_37 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_37"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_37_fel_idx = 0 ;
      while ( nGXsfl_37_fel_idx < nRC_GXsfl_37 )
      {
         nGXsfl_37_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_37_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_37_fel_idx+1) ;
         sGXsfl_37_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_372( ) ;
         AV58GXV1 = (int)(nGXsfl_37_fel_idx+GRID_nFirstRecordOnPage) ;
         if ( ( AV17ImpresionHdr_SDTs.size() >= AV58GXV1 ) && ( AV58GXV1 > 0 ) )
         {
            AV17ImpresionHdr_SDTs.currentItem( ((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)) );
            AV38Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
            AV49DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
               GX_FocusControl = edtavClicod_Internalname ;
               wbErr = true ;
               AV53CliCod = 0 ;
            }
            else
            {
               AV53CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            }
            AV54BarEncCli2 = httpContext.cgiGet( edtavBarenccli2_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUMERODEHDRS");
               GX_FocusControl = edtavNumerodehdrs_Internalname ;
               wbErr = true ;
               AV48NumerodeHdrs = (short)(0) ;
            }
            else
            {
               AV48NumerodeHdrs = (short)(localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            }
            AV55RelaciondeHdrs = httpContext.cgiGet( edtavRelaciondehdrs_Internalname) ;
         }
         if ( GXutil.strcmp(AV38Seleccionar, "S") == 0 )
         {
            httpContext.popup(formatLink("app.presuos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV53CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV54BarEncCli2)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.ltrimstr(99999999,9,0)),GXutil.URLEncode(GXutil.ltrimstr(9,9,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "z", ""))),GXutil.URLEncode(GXutil.rtrim(AV46ImpCod)),GXutil.URLEncode(GXutil.rtrim(Gx_out))}, new String[] {"EmprCod","CliCod","BarEncCli","PBarCod","PBarCodReo","PBarCodPar","UBarCod","UBarCodReo","UBarCodPar","ImpCod","Output"}) , new Object[] {"AV5Emprcod","AV53CliCod","AV54BarEncCli2","","","","","","","AV46ImpCod","Gx_out"});
         }
         /* End For Each Line */
      }
      if ( nGXsfl_37_fel_idx == 0 )
      {
         nGXsfl_37_idx = 1 ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
      }
      nGXsfl_37_fel_idx = 1 ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ManageFiltersData", AV25ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   public void e1819R2( )
   {
      AV58GXV1 = (int)(nGXsfl_37_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV58GXV1 > 0 ) && ( AV17ImpresionHdr_SDTs.size() >= AV58GXV1 ) )
      {
         AV17ImpresionHdr_SDTs.currentItem( ((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)) );
      }
      /* 'DoImprimirOSResumo' Routine */
      returnInSub = false ;
      /* Start For Each Line in Grid */
      nRC_GXsfl_37 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_37"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_37_fel_idx = 0 ;
      while ( nGXsfl_37_fel_idx < nRC_GXsfl_37 )
      {
         nGXsfl_37_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_37_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_37_fel_idx+1) ;
         sGXsfl_37_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_372( ) ;
         AV58GXV1 = (int)(nGXsfl_37_fel_idx+GRID_nFirstRecordOnPage) ;
         if ( ( AV17ImpresionHdr_SDTs.size() >= AV58GXV1 ) && ( AV58GXV1 > 0 ) )
         {
            AV17ImpresionHdr_SDTs.currentItem( ((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)) );
            AV38Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
            AV49DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
               GX_FocusControl = edtavClicod_Internalname ;
               wbErr = true ;
               AV53CliCod = 0 ;
            }
            else
            {
               AV53CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            }
            AV54BarEncCli2 = httpContext.cgiGet( edtavBarenccli2_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUMERODEHDRS");
               GX_FocusControl = edtavNumerodehdrs_Internalname ;
               wbErr = true ;
               AV48NumerodeHdrs = (short)(0) ;
            }
            else
            {
               AV48NumerodeHdrs = (short)(localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            }
            AV55RelaciondeHdrs = httpContext.cgiGet( edtavRelaciondehdrs_Internalname) ;
         }
         if ( GXutil.strcmp(AV38Seleccionar, "S") == 0 )
         {
            AV39t = (short)(1) ;
            AV40x = (short)(1) ;
            AV41y = (short)(8) ;
            while ( AV39t <= AV48NumerodeHdrs )
            {
               AV32Barcod = (int)(GXutil.lval( GXutil.substring( AV55RelaciondeHdrs, AV40x, 8))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Barcod), 8, 0));
               AV40x = (short)(AV40x+8) ;
               AV36Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV55RelaciondeHdrs, AV40x, 1))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Barcodreo", GXutil.str( AV36Barcodreo, 1, 0));
               AV40x = (short)(AV40x+1) ;
               AV34Barcodpar = GXutil.substring( AV55RelaciondeHdrs, AV40x, 1) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Barcodpar", AV34Barcodpar);
               AV42Barcodp = AV32Barcod ;
               AV43Barcodreop = AV36Barcodreo ;
               AV44Barcodparp = AV34Barcodpar ;
               GXv_char4[0] = AV5Emprcod ;
               GXv_int10[0] = AV42Barcodp ;
               GXv_int11[0] = AV43Barcodreop ;
               GXv_char3[0] = AV44Barcodparp ;
               GXv_char2[0] = AV45UsurCod ;
               new app.pctrimp(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int11, GXv_char3, GXv_char2) ;
               impresionhdrcv_impl.this.AV5Emprcod = GXv_char4[0] ;
               impresionhdrcv_impl.this.AV42Barcodp = GXv_int10[0] ;
               impresionhdrcv_impl.this.AV43Barcodreop = GXv_int11[0] ;
               impresionhdrcv_impl.this.AV44Barcodparp = GXv_char3[0] ;
               impresionhdrcv_impl.this.AV45UsurCod = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45UsurCod", AV45UsurCod);
               httpContext.popup(formatLink("app.pcarordemservico", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV42Barcodp,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV43Barcodreop,1,0)),GXutil.URLEncode(GXutil.rtrim(AV44Barcodparp)),GXutil.URLEncode(GXutil.rtrim(AV46ImpCod)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "PRN", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ImpCod","Output"}) , new Object[] {"AV5Emprcod","AV42Barcodp","AV43Barcodreop","AV44Barcodparp","AV46ImpCod",""});
               new app.pbaredi(remoteHandle, context).execute( AV5Emprcod, AV42Barcodp, AV44Barcodparp, AV43Barcodreop) ;
               AV39t = (short)(AV39t+1) ;
               AV40x = (short)(AV40x+1) ;
            }
         }
         /* End For Each Line */
      }
      if ( nGXsfl_37_fel_idx == 0 )
      {
         nGXsfl_37_idx = 1 ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
      }
      nGXsfl_37_fel_idx = 1 ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      AV48NumerodeHdrs = ((app.SdtImpresionHdrCv_SDT)(AV17ImpresionHdr_SDTs.currentItem())).getgxTv_SdtImpresionHdrCv_SDT_Numero().getgxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNumerodehdrs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48NumerodeHdrs), 4, 0));
      AV55RelaciondeHdrs = ((app.SdtImpresionHdrCv_SDT)(AV17ImpresionHdr_SDTs.currentItem())).getgxTv_SdtImpresionHdrCv_SDT_Numero().getgxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRelaciondehdrs_Internalname, AV55RelaciondeHdrs);
      /* Start For Each Line in Grid */
      nRC_GXsfl_37 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_37"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_37_fel_idx = 0 ;
      while ( nGXsfl_37_fel_idx < nRC_GXsfl_37 )
      {
         nGXsfl_37_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_37_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_37_fel_idx+1) ;
         sGXsfl_37_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_372( ) ;
         AV58GXV1 = (int)(nGXsfl_37_fel_idx+GRID_nFirstRecordOnPage) ;
         if ( ( AV17ImpresionHdr_SDTs.size() >= AV58GXV1 ) && ( AV58GXV1 > 0 ) )
         {
            AV17ImpresionHdr_SDTs.currentItem( ((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)) );
            AV38Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
            AV49DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
               GX_FocusControl = edtavClicod_Internalname ;
               wbErr = true ;
               AV53CliCod = 0 ;
            }
            else
            {
               AV53CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            }
            AV54BarEncCli2 = httpContext.cgiGet( edtavBarenccli2_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUMERODEHDRS");
               GX_FocusControl = edtavNumerodehdrs_Internalname ;
               wbErr = true ;
               AV48NumerodeHdrs = (short)(0) ;
            }
            else
            {
               AV48NumerodeHdrs = (short)(localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            }
            AV55RelaciondeHdrs = httpContext.cgiGet( edtavRelaciondehdrs_Internalname) ;
         }
         if ( GXutil.strcmp(AV38Seleccionar, "S") == 0 )
         {
            httpContext.popup(formatLink("app.presuos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV53CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV54BarEncCli2)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.ltrimstr(99999999,9,0)),GXutil.URLEncode(GXutil.ltrimstr(9,9,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "z", ""))),GXutil.URLEncode(GXutil.rtrim(AV46ImpCod)),GXutil.URLEncode(GXutil.rtrim(Gx_out))}, new String[] {"EmprCod","CliCod","BarEncCli","PBarCod","PBarCodReo","PBarCodPar","UBarCod","UBarCodReo","UBarCodPar","ImpCod","Output"}) , new Object[] {"AV5Emprcod","AV53CliCod","AV54BarEncCli2","","","","","","","AV46ImpCod","Gx_out"});
         }
         /* End For Each Line */
      }
      if ( nGXsfl_37_fel_idx == 0 )
      {
         nGXsfl_37_idx = 1 ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
      }
      nGXsfl_37_fel_idx = 1 ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ManageFiltersData", AV25ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   public void e1619R2( )
   {
      /* Detailwebcomponent_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ManageFiltersData", AV25ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   public void S152( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV22ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&Seleccionar", "", "Op", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ImpresionHdr_SDTs__Clicod", "", "Codigo Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ImpresionHdr_SDTs__CliNom", "", "Nombre del Codigo Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ImpresionHdr_SDTs__BarEnccli", "", "Disp Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ImpresionHdr_SDTs__Numero_NumeroHdrs", "", "Numero Hdrs", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ImpresionHdr_SDTs__Numero_RelacionHdrs", "", "Relacion Hdrs", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char1 = AV21UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ImpresionHdrCvColumnsSelector", GXv_char4) ;
      impresionhdrcv_impl.this.GXt_char1 = GXv_char4[0] ;
      AV21UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV21UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV21UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = AV25ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "ImpresionHdrCvFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] ;
      AV25ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV16FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FilterFullText", AV16FilterFullText);
   }

   public void S182( )
   {
      /* 'DO ACTION IMPRIMIROS' Routine */
      returnInSub = false ;
      /* Start For Each Line in Grid */
      nRC_GXsfl_37 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_37"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_37_fel_idx = 0 ;
      while ( nGXsfl_37_fel_idx < nRC_GXsfl_37 )
      {
         nGXsfl_37_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_37_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_37_fel_idx+1) ;
         sGXsfl_37_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_372( ) ;
         AV58GXV1 = (int)(nGXsfl_37_fel_idx+GRID_nFirstRecordOnPage) ;
         if ( ( AV17ImpresionHdr_SDTs.size() >= AV58GXV1 ) && ( AV58GXV1 > 0 ) )
         {
            AV17ImpresionHdr_SDTs.currentItem( ((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)) );
            AV38Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
            AV49DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
               GX_FocusControl = edtavClicod_Internalname ;
               wbErr = true ;
               AV53CliCod = 0 ;
            }
            else
            {
               AV53CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            }
            AV54BarEncCli2 = httpContext.cgiGet( edtavBarenccli2_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUMERODEHDRS");
               GX_FocusControl = edtavNumerodehdrs_Internalname ;
               wbErr = true ;
               AV48NumerodeHdrs = (short)(0) ;
            }
            else
            {
               AV48NumerodeHdrs = (short)(localUtil.ctol( httpContext.cgiGet( edtavNumerodehdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            }
            AV55RelaciondeHdrs = httpContext.cgiGet( edtavRelaciondehdrs_Internalname) ;
         }
         if ( GXutil.strcmp(AV38Seleccionar, "S") == 0 )
         {
            AV39t = (short)(1) ;
            AV40x = (short)(1) ;
            AV41y = (short)(8) ;
            while ( AV39t <= AV48NumerodeHdrs )
            {
               AV32Barcod = (int)(GXutil.lval( GXutil.substring( AV55RelaciondeHdrs, AV40x, 8))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Barcod), 8, 0));
               AV40x = (short)(AV40x+8) ;
               AV36Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV55RelaciondeHdrs, AV40x, 1))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Barcodreo", GXutil.str( AV36Barcodreo, 1, 0));
               AV40x = (short)(AV40x+1) ;
               AV34Barcodpar = GXutil.substring( AV55RelaciondeHdrs, AV40x, 1) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Barcodpar", AV34Barcodpar);
               AV42Barcodp = AV32Barcod ;
               AV43Barcodreop = AV36Barcodreo ;
               AV44Barcodparp = AV34Barcodpar ;
               GXv_char4[0] = AV5Emprcod ;
               GXv_int10[0] = AV42Barcodp ;
               GXv_int11[0] = AV43Barcodreop ;
               GXv_char3[0] = AV44Barcodparp ;
               GXv_char2[0] = AV45UsurCod ;
               new app.pctrimp(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int11, GXv_char3, GXv_char2) ;
               impresionhdrcv_impl.this.AV5Emprcod = GXv_char4[0] ;
               impresionhdrcv_impl.this.AV42Barcodp = GXv_int10[0] ;
               impresionhdrcv_impl.this.AV43Barcodreop = GXv_int11[0] ;
               impresionhdrcv_impl.this.AV44Barcodparp = GXv_char3[0] ;
               impresionhdrcv_impl.this.AV45UsurCod = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45UsurCod", AV45UsurCod);
               httpContext.popup(formatLink("app.pcarordemservico", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV42Barcodp,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV43Barcodreop,1,0)),GXutil.URLEncode(GXutil.rtrim(AV44Barcodparp)),GXutil.URLEncode(GXutil.rtrim(AV46ImpCod)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "PRN", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ImpCod","Output"}) , new Object[] {"AV5Emprcod","AV42Barcodp","AV43Barcodreop","AV44Barcodparp","AV46ImpCod",""});
               new app.pbaredi(remoteHandle, context).execute( AV5Emprcod, AV42Barcodp, AV44Barcodparp, AV43Barcodreop) ;
               AV39t = (short)(AV39t+1) ;
               AV40x = (short)(AV40x+1) ;
            }
         }
         /* End For Each Line */
      }
      if ( nGXsfl_37_fel_idx == 0 )
      {
         nGXsfl_37_idx = 1 ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
      }
      nGXsfl_37_fel_idx = 1 ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      AV48NumerodeHdrs = ((app.SdtImpresionHdrCv_SDT)(AV17ImpresionHdr_SDTs.currentItem())).getgxTv_SdtImpresionHdrCv_SDT_Numero().getgxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNumerodehdrs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48NumerodeHdrs), 4, 0));
      AV55RelaciondeHdrs = ((app.SdtImpresionHdrCv_SDT)(AV17ImpresionHdr_SDTs.currentItem())).getgxTv_SdtImpresionHdrCv_SDT_Numero().getgxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRelaciondehdrs_Internalname, AV55RelaciondeHdrs);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV24Session.getValue(AV66Pgmname+"GridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV66Pgmname+"GridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV24Session.getValue(AV66Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV14GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV14GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV14GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV72GXV7 = 1 ;
      while ( AV72GXV7 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV7));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV16FilterFullText = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FilterFullText", AV16FilterFullText);
         }
         AV72GXV7 = (int)(AV72GXV7+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV14GridState.fromxml(AV24Session.getValue(AV66Pgmname+"GridState"), null, null);
      AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV16FilterFullText)==0), (short)(0), AV16FilterFullText, "") ;
      AV14GridState = GXv_SdtWWPGridState16[0] ;
      AV14GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV14GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV66Pgmname+"GridState", AV14GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void wb_table4_79_19R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledetailwebcomponent_modal_Internalname, tblTabledetailwebcomponent_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDetailwebcomponent_modal.setProperty("Width", Detailwebcomponent_modal_Width);
         ucDetailwebcomponent_modal.setProperty("Title", Detailwebcomponent_modal_Title);
         ucDetailwebcomponent_modal.setProperty("ConfirmType", Detailwebcomponent_modal_Confirmtype);
         ucDetailwebcomponent_modal.setProperty("BodyType", Detailwebcomponent_modal_Bodytype);
         ucDetailwebcomponent_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Detailwebcomponent_modal_Internalname, sPrefix+"DETAILWEBCOMPONENT_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DETAILWEBCOMPONENT_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_79_19R2e( true) ;
      }
      else
      {
         wb_table4_79_19R2e( false) ;
      }
   }

   public void wb_table3_74_19R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_imprimiros_Internalname, tblTabledvelop_confirmpanel_imprimiros_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_imprimiros.setProperty("Title", Dvelop_confirmpanel_imprimiros_Title);
         ucDvelop_confirmpanel_imprimiros.setProperty("ConfirmationText", Dvelop_confirmpanel_imprimiros_Confirmationtext);
         ucDvelop_confirmpanel_imprimiros.setProperty("YesButtonCaption", Dvelop_confirmpanel_imprimiros_Yesbuttoncaption);
         ucDvelop_confirmpanel_imprimiros.setProperty("NoButtonCaption", Dvelop_confirmpanel_imprimiros_Nobuttoncaption);
         ucDvelop_confirmpanel_imprimiros.setProperty("CancelButtonCaption", Dvelop_confirmpanel_imprimiros_Cancelbuttoncaption);
         ucDvelop_confirmpanel_imprimiros.setProperty("YesButtonPosition", Dvelop_confirmpanel_imprimiros_Yesbuttonposition);
         ucDvelop_confirmpanel_imprimiros.setProperty("ConfirmType", Dvelop_confirmpanel_imprimiros_Confirmtype);
         ucDvelop_confirmpanel_imprimiros.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_imprimiros_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROSContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_74_19R2e( true) ;
      }
      else
      {
         wb_table3_74_19R2e( false) ;
      }
   }

   public void wb_table2_59_19R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimiros_Internalname, "gx.evt.setGridEvt("+GXutil.str( 37, 2, 0)+","+"null"+");", httpContext.getMessage( "Imprimir OSs", ""), bttBtnimprimiros_Jsonclick, 7, httpContext.getMessage( "Imprimir OSs", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e2219r1_client"+"'", TempTags, "", 2, "HLP_ImpresionHdrCv.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimirresumo_Internalname, "gx.evt.setGridEvt("+GXutil.str( 37, 2, 0)+","+"null"+");", httpContext.getMessage( "Imprimir Resumo", ""), bttBtnimprimirresumo_Jsonclick, 5, httpContext.getMessage( "Imprimir Resumo", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOIMPRIMIRRESUMO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ImpresionHdrCv.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimirosresumo_Internalname, "gx.evt.setGridEvt("+GXutil.str( 37, 2, 0)+","+"null"+");", httpContext.getMessage( "Imprimir OS+Resumo", ""), bttBtnimprimirosresumo_Jsonclick, 5, httpContext.getMessage( "Imprimir OS+Resumo", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOIMPRIMIROSRESUMO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ImpresionHdrCv.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_59_19R2e( true) ;
      }
      else
      {
         wb_table2_59_19R2e( false) ;
      }
   }

   public void wb_table1_19_19R2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV25ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_24_19R2( true) ;
      }
      else
      {
         wb_table5_24_19R2( false) ;
      }
      return  ;
   }

   public void wb_table5_24_19R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_19_19R2e( true) ;
      }
      else
      {
         wb_table1_19_19R2e( false) ;
      }
   }

   public void wb_table5_24_19R2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'" + sPrefix + "',false,'" + sGXsfl_37_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV16FilterFullText, GXutil.rtrim( localUtil.format( AV16FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_ImpresionHdrCv.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_24_19R2e( true) ;
      }
      else
      {
         wb_table5_24_19R2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV32Barcod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Barcod), 8, 0));
      AV36Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Barcodreo", GXutil.str( AV36Barcodreo, 1, 0));
      AV34Barcodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Barcodpar", AV34Barcodpar);
      AV33Barcod_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Barcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Barcod_to), 8, 0));
      AV37Barcodreo_to = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Barcodreo_to", GXutil.str( AV37Barcodreo_to, 1, 0));
      AV35Barcodpar_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Barcodpar_to", AV35Barcodpar_to);
      AV6BarFecGen = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarFecGen", localUtil.format(AV6BarFecGen, "99/99/99"));
      AV7BarFecGen_to = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarFecGen_to", localUtil.format(AV7BarFecGen_to, "99/99/99"));
      AV8BarLis = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarLis", GXutil.str( AV8BarLis, 1, 0));
      AV47BarEnccli = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47BarEnccli", AV47BarEnccli);
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
      pa19R2( ) ;
      ws19R2( ) ;
      we19R2( ) ;
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
      sCtrlAV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV32Barcod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV36Barcodreo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV34Barcodpar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV33Barcod_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV37Barcodreo_to = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV35Barcodpar_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV6BarFecGen = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV7BarFecGen_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV8BarLis = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV47BarEnccli = (String)getParm(obj,10,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa19R2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "impresionhdrcv", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa19R2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV32Barcod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Barcod), 8, 0));
         AV36Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Barcodreo", GXutil.str( AV36Barcodreo, 1, 0));
         AV34Barcodpar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Barcodpar", AV34Barcodpar);
         AV33Barcod_to = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Barcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Barcod_to), 8, 0));
         AV37Barcodreo_to = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Barcodreo_to", GXutil.str( AV37Barcodreo_to, 1, 0));
         AV35Barcodpar_to = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Barcodpar_to", AV35Barcodpar_to);
         AV6BarFecGen = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarFecGen", localUtil.format(AV6BarFecGen, "99/99/99"));
         AV7BarFecGen_to = (java.util.Date)getParm(obj,10,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarFecGen_to", localUtil.format(AV7BarFecGen_to, "99/99/99"));
         AV8BarLis = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarLis", GXutil.str( AV8BarLis, 1, 0));
         AV47BarEnccli = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47BarEnccli", AV47BarEnccli);
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV32Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32Barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV36Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36Barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV34Barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV34Barcodpar") ;
      wcpOAV33Barcod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33Barcod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV37Barcodreo_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37Barcodreo_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV35Barcodpar_to = httpContext.cgiGet( sPrefix+"wcpOAV35Barcodpar_to") ;
      wcpOAV6BarFecGen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV6BarFecGen"), 0) ;
      wcpOAV7BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV7BarFecGen_to"), 0) ;
      wcpOAV8BarLis = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8BarLis"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV47BarEnccli = httpContext.cgiGet( sPrefix+"wcpOAV47BarEnccli") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( AV32Barcod != wcpOAV32Barcod ) || ( AV36Barcodreo != wcpOAV36Barcodreo ) || ( GXutil.strcmp(AV34Barcodpar, wcpOAV34Barcodpar) != 0 ) || ( AV33Barcod_to != wcpOAV33Barcod_to ) || ( AV37Barcodreo_to != wcpOAV37Barcodreo_to ) || ( GXutil.strcmp(AV35Barcodpar_to, wcpOAV35Barcodpar_to) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV6BarFecGen), GXutil.resetTime(wcpOAV6BarFecGen)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV7BarFecGen_to), GXutil.resetTime(wcpOAV7BarFecGen_to)) ) || ( AV8BarLis != wcpOAV8BarLis ) || ( GXutil.strcmp(AV47BarEnccli, wcpOAV47BarEnccli) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV32Barcod = AV32Barcod ;
      wcpOAV36Barcodreo = AV36Barcodreo ;
      wcpOAV34Barcodpar = AV34Barcodpar ;
      wcpOAV33Barcod_to = AV33Barcod_to ;
      wcpOAV37Barcodreo_to = AV37Barcodreo_to ;
      wcpOAV35Barcodpar_to = AV35Barcodpar_to ;
      wcpOAV6BarFecGen = AV6BarFecGen ;
      wcpOAV7BarFecGen_to = AV7BarFecGen_to ;
      wcpOAV8BarLis = AV8BarLis ;
      wcpOAV47BarEnccli = AV47BarEnccli ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV5Emprcod) > 0 )
      {
         AV5Emprcod = httpContext.cgiGet( sCtrlAV5Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      }
      else
      {
         AV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_PARM") ;
      }
      sCtrlAV32Barcod = httpContext.cgiGet( sPrefix+"AV32Barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV32Barcod) > 0 )
      {
         AV32Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV32Barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Barcod), 8, 0));
      }
      else
      {
         AV32Barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV32Barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV36Barcodreo = httpContext.cgiGet( sPrefix+"AV36Barcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV36Barcodreo) > 0 )
      {
         AV36Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV36Barcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Barcodreo", GXutil.str( AV36Barcodreo, 1, 0));
      }
      else
      {
         AV36Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV36Barcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV34Barcodpar = httpContext.cgiGet( sPrefix+"AV34Barcodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV34Barcodpar) > 0 )
      {
         AV34Barcodpar = httpContext.cgiGet( sCtrlAV34Barcodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Barcodpar", AV34Barcodpar);
      }
      else
      {
         AV34Barcodpar = httpContext.cgiGet( sPrefix+"AV34Barcodpar_PARM") ;
      }
      sCtrlAV33Barcod_to = httpContext.cgiGet( sPrefix+"AV33Barcod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV33Barcod_to) > 0 )
      {
         AV33Barcod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV33Barcod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Barcod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Barcod_to), 8, 0));
      }
      else
      {
         AV33Barcod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV33Barcod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV37Barcodreo_to = httpContext.cgiGet( sPrefix+"AV37Barcodreo_to_CTRL") ;
      if ( GXutil.len( sCtrlAV37Barcodreo_to) > 0 )
      {
         AV37Barcodreo_to = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV37Barcodreo_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Barcodreo_to", GXutil.str( AV37Barcodreo_to, 1, 0));
      }
      else
      {
         AV37Barcodreo_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV37Barcodreo_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV35Barcodpar_to = httpContext.cgiGet( sPrefix+"AV35Barcodpar_to_CTRL") ;
      if ( GXutil.len( sCtrlAV35Barcodpar_to) > 0 )
      {
         AV35Barcodpar_to = httpContext.cgiGet( sCtrlAV35Barcodpar_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Barcodpar_to", AV35Barcodpar_to);
      }
      else
      {
         AV35Barcodpar_to = httpContext.cgiGet( sPrefix+"AV35Barcodpar_to_PARM") ;
      }
      sCtrlAV6BarFecGen = httpContext.cgiGet( sPrefix+"AV6BarFecGen_CTRL") ;
      if ( GXutil.len( sCtrlAV6BarFecGen) > 0 )
      {
         AV6BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV6BarFecGen), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarFecGen", localUtil.format(AV6BarFecGen, "99/99/99"));
      }
      else
      {
         AV6BarFecGen = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV6BarFecGen_PARM"), 0) ;
      }
      sCtrlAV7BarFecGen_to = httpContext.cgiGet( sPrefix+"AV7BarFecGen_to_CTRL") ;
      if ( GXutil.len( sCtrlAV7BarFecGen_to) > 0 )
      {
         AV7BarFecGen_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV7BarFecGen_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarFecGen_to", localUtil.format(AV7BarFecGen_to, "99/99/99"));
      }
      else
      {
         AV7BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV7BarFecGen_to_PARM"), 0) ;
      }
      sCtrlAV8BarLis = httpContext.cgiGet( sPrefix+"AV8BarLis_CTRL") ;
      if ( GXutil.len( sCtrlAV8BarLis) > 0 )
      {
         AV8BarLis = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8BarLis), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarLis", GXutil.str( AV8BarLis, 1, 0));
      }
      else
      {
         AV8BarLis = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8BarLis_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV47BarEnccli = httpContext.cgiGet( sPrefix+"AV47BarEnccli_CTRL") ;
      if ( GXutil.len( sCtrlAV47BarEnccli) > 0 )
      {
         AV47BarEnccli = httpContext.cgiGet( sCtrlAV47BarEnccli) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47BarEnccli", AV47BarEnccli);
      }
      else
      {
         AV47BarEnccli = httpContext.cgiGet( sPrefix+"AV47BarEnccli_PARM") ;
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
      pa19R2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws19R2( ) ;
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
      ws19R2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_PARM", GXutil.rtrim( AV5Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_CTRL", GXutil.rtrim( sCtrlAV5Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV32Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32Barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Barcod_CTRL", GXutil.rtrim( sCtrlAV32Barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36Barcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV36Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36Barcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36Barcodreo_CTRL", GXutil.rtrim( sCtrlAV36Barcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Barcodpar_PARM", GXutil.rtrim( AV34Barcodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34Barcodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Barcodpar_CTRL", GXutil.rtrim( sCtrlAV34Barcodpar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Barcod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV33Barcod_to, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33Barcod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Barcod_to_CTRL", GXutil.rtrim( sCtrlAV33Barcod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37Barcodreo_to_PARM", GXutil.ltrim( localUtil.ntoc( AV37Barcodreo_to, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37Barcodreo_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37Barcodreo_to_CTRL", GXutil.rtrim( sCtrlAV37Barcodreo_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35Barcodpar_to_PARM", GXutil.rtrim( AV35Barcodpar_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35Barcodpar_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35Barcodpar_to_CTRL", GXutil.rtrim( sCtrlAV35Barcodpar_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6BarFecGen_PARM", localUtil.dtoc( AV6BarFecGen, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6BarFecGen)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6BarFecGen_CTRL", GXutil.rtrim( sCtrlAV6BarFecGen));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BarFecGen_to_PARM", localUtil.dtoc( AV7BarFecGen_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7BarFecGen_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BarFecGen_to_CTRL", GXutil.rtrim( sCtrlAV7BarFecGen_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarLis_PARM", GXutil.ltrim( localUtil.ntoc( AV8BarLis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8BarLis)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarLis_CTRL", GXutil.rtrim( sCtrlAV8BarLis));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47BarEnccli_PARM", GXutil.rtrim( AV47BarEnccli));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47BarEnccli)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47BarEnccli_CTRL", GXutil.rtrim( sCtrlAV47BarEnccli));
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
      we19R2( ) ;
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         WebComp_Grid_dwc.componentjscripts();
      }
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         WebComp_Wwpaux_wc.componentjscripts();
      }
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
         }
      }
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
         {
            WebComp_Wwpaux_wc.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115562070", true, true);
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
      httpContext.AddJavascriptSource("impresionhdrcv.js", "?202682115562070", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_372( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_37_idx );
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_37_idx ;
      edtavImpresionhdr_sdts__clicod_Internalname = sPrefix+"IMPRESIONHDR_SDTS__CLICOD_"+sGXsfl_37_idx ;
      edtavImpresionhdr_sdts__clinom_Internalname = sPrefix+"IMPRESIONHDR_SDTS__CLINOM_"+sGXsfl_37_idx ;
      edtavImpresionhdr_sdts__barenccli_Internalname = sPrefix+"IMPRESIONHDR_SDTS__BARENCCLI_"+sGXsfl_37_idx ;
      edtavImpresionhdr_sdts__numero_numerohdrs_Internalname = sPrefix+"IMPRESIONHDR_SDTS__NUMERO_NUMEROHDRS_"+sGXsfl_37_idx ;
      edtavImpresionhdr_sdts__numero_relacionhdrs_Internalname = sPrefix+"IMPRESIONHDR_SDTS__NUMERO_RELACIONHDRS_"+sGXsfl_37_idx ;
      edtavClicod_Internalname = sPrefix+"vCLICOD_"+sGXsfl_37_idx ;
      edtavBarenccli2_Internalname = sPrefix+"vBARENCCLI2_"+sGXsfl_37_idx ;
      edtavNumerodehdrs_Internalname = sPrefix+"vNUMERODEHDRS_"+sGXsfl_37_idx ;
      edtavRelaciondehdrs_Internalname = sPrefix+"vRELACIONDEHDRS_"+sGXsfl_37_idx ;
   }

   public void subsflControlProps_fel_372( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_37_fel_idx );
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_37_fel_idx ;
      edtavImpresionhdr_sdts__clicod_Internalname = sPrefix+"IMPRESIONHDR_SDTS__CLICOD_"+sGXsfl_37_fel_idx ;
      edtavImpresionhdr_sdts__clinom_Internalname = sPrefix+"IMPRESIONHDR_SDTS__CLINOM_"+sGXsfl_37_fel_idx ;
      edtavImpresionhdr_sdts__barenccli_Internalname = sPrefix+"IMPRESIONHDR_SDTS__BARENCCLI_"+sGXsfl_37_fel_idx ;
      edtavImpresionhdr_sdts__numero_numerohdrs_Internalname = sPrefix+"IMPRESIONHDR_SDTS__NUMERO_NUMEROHDRS_"+sGXsfl_37_fel_idx ;
      edtavImpresionhdr_sdts__numero_relacionhdrs_Internalname = sPrefix+"IMPRESIONHDR_SDTS__NUMERO_RELACIONHDRS_"+sGXsfl_37_fel_idx ;
      edtavClicod_Internalname = sPrefix+"vCLICOD_"+sGXsfl_37_fel_idx ;
      edtavBarenccli2_Internalname = sPrefix+"vBARENCCLI2_"+sGXsfl_37_fel_idx ;
      edtavNumerodehdrs_Internalname = sPrefix+"vNUMERODEHDRS_"+sGXsfl_37_fel_idx ;
      edtavRelaciondehdrs_Internalname = sPrefix+"vRELACIONDEHDRS_"+sGXsfl_37_fel_idx ;
   }

   public void sendrow_372( )
   {
      subsflControlProps_372( ) ;
      wb19R0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_37_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_37_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_37_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 38,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_37_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_37_Refreshing);
         chkavSeleccionar.setCheckedValue( "N" );
         if ( (GXutil.strcmp("", AV38Seleccionar)==0) )
         {
         }
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),AV38Seleccionar,"","",Integer.valueOf(chkavSeleccionar.getVisible()),Integer.valueOf(1),"S","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(38, this, 'S', 'N',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,38);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 39,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV49DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,39);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e2319r2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavImpresionhdr_sdts__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImpresionhdr_sdts__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)).getgxTv_SdtImpresionHdrCv_SDT_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavImpresionhdr_sdts__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)).getgxTv_SdtImpresionHdrCv_SDT_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)).getgxTv_SdtImpresionHdrCv_SDT_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavImpresionhdr_sdts__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavImpresionhdr_sdts__clicod_Visible),Integer.valueOf(edtavImpresionhdr_sdts__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavImpresionhdr_sdts__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImpresionhdr_sdts__clinom_Internalname,GXutil.rtrim( ((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)).getgxTv_SdtImpresionHdrCv_SDT_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavImpresionhdr_sdts__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavImpresionhdr_sdts__clinom_Visible),Integer.valueOf(edtavImpresionhdr_sdts__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavImpresionhdr_sdts__barenccli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImpresionhdr_sdts__barenccli_Internalname,GXutil.rtrim( ((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)).getgxTv_SdtImpresionHdrCv_SDT_Barenccli()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavImpresionhdr_sdts__barenccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavImpresionhdr_sdts__barenccli_Visible),Integer.valueOf(edtavImpresionhdr_sdts__barenccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavImpresionhdr_sdts__numero_numerohdrs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImpresionhdr_sdts__numero_numerohdrs_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)).getgxTv_SdtImpresionHdrCv_SDT_Numero().getgxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavImpresionhdr_sdts__numero_numerohdrs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)).getgxTv_SdtImpresionHdrCv_SDT_Numero().getgxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)).getgxTv_SdtImpresionHdrCv_SDT_Numero().getgxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavImpresionhdr_sdts__numero_numerohdrs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavImpresionhdr_sdts__numero_numerohdrs_Visible),Integer.valueOf(edtavImpresionhdr_sdts__numero_numerohdrs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavImpresionhdr_sdts__numero_relacionhdrs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImpresionhdr_sdts__numero_relacionhdrs_Internalname,((app.SdtImpresionHdrCv_SDT)AV17ImpresionHdr_SDTs.elementAt(-1+AV58GXV1)).getgxTv_SdtImpresionHdrCv_SDT_Numero().getgxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavImpresionhdr_sdts__numero_relacionhdrs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavImpresionhdr_sdts__numero_relacionhdrs_Visible),Integer.valueOf(edtavImpresionhdr_sdts__numero_relacionhdrs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavClicod_Enabled!=0)&&(edtavClicod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavClicod_Internalname,GXutil.ltrim( localUtil.ntoc( AV53CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV53CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV53CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavClicod_Enabled!=0)&&(edtavClicod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavClicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavClicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarenccli2_Enabled!=0)&&(edtavBarenccli2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarenccli2_Internalname,GXutil.rtrim( AV54BarEncCli2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarenccli2_Enabled!=0)&&(edtavBarenccli2_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarenccli2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarenccli2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavNumerodehdrs_Enabled!=0)&&(edtavNumerodehdrs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNumerodehdrs_Internalname,GXutil.ltrim( localUtil.ntoc( AV48NumerodeHdrs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavNumerodehdrs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV48NumerodeHdrs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV48NumerodeHdrs), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavNumerodehdrs_Enabled!=0)&&(edtavNumerodehdrs_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavNumerodehdrs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavNumerodehdrs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRelaciondehdrs_Enabled!=0)&&(edtavRelaciondehdrs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRelaciondehdrs_Internalname,AV55RelaciondeHdrs,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavRelaciondehdrs_Enabled!=0)&&(edtavRelaciondehdrs_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,48);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRelaciondehdrs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavRelaciondehdrs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes19R2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_37_idx = ((subGrid_Islastpage==1)&&(nGXsfl_37_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_37_idx+1) ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
      }
      /* End function sendrow_372 */
   }

   public void startgridcontrol37( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"37\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSeleccionar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavImpresionhdr_sdts__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavImpresionhdr_sdts__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre del Codigo Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavImpresionhdr_sdts__barenccli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disp Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavImpresionhdr_sdts__numero_numerohdrs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero Hdrs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavImpresionhdr_sdts__numero_relacionhdrs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Relacion Hdrs", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV38Seleccionar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSeleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV49DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImpresionhdr_sdts__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImpresionhdr_sdts__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImpresionhdr_sdts__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImpresionhdr_sdts__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImpresionhdr_sdts__barenccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImpresionhdr_sdts__barenccli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImpresionhdr_sdts__numero_numerohdrs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImpresionhdr_sdts__numero_numerohdrs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImpresionhdr_sdts__numero_relacionhdrs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImpresionhdr_sdts__numero_relacionhdrs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV53CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavClicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV54BarEncCli2));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarenccli2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV48NumerodeHdrs, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNumerodehdrs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV55RelaciondeHdrs);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRelaciondehdrs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR" );
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtavImpresionhdr_sdts__clicod_Internalname = sPrefix+"IMPRESIONHDR_SDTS__CLICOD" ;
      edtavImpresionhdr_sdts__clinom_Internalname = sPrefix+"IMPRESIONHDR_SDTS__CLINOM" ;
      edtavImpresionhdr_sdts__barenccli_Internalname = sPrefix+"IMPRESIONHDR_SDTS__BARENCCLI" ;
      edtavImpresionhdr_sdts__numero_numerohdrs_Internalname = sPrefix+"IMPRESIONHDR_SDTS__NUMERO_NUMEROHDRS" ;
      edtavImpresionhdr_sdts__numero_relacionhdrs_Internalname = sPrefix+"IMPRESIONHDR_SDTS__NUMERO_RELACIONHDRS" ;
      edtavClicod_Internalname = sPrefix+"vCLICOD" ;
      edtavBarenccli2_Internalname = sPrefix+"vBARENCCLI2" ;
      edtavNumerodehdrs_Internalname = sPrefix+"vNUMERODEHDRS" ;
      edtavRelaciondehdrs_Internalname = sPrefix+"vRELACIONDEHDRS" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      bttBtnimprimiros_Internalname = sPrefix+"BTNIMPRIMIROS" ;
      bttBtnimprimirresumo_Internalname = sPrefix+"BTNIMPRIMIRRESUMO" ;
      bttBtnimprimirosresumo_Internalname = sPrefix+"BTNIMPRIMIROSRESUMO" ;
      tblUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_imprimiros_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_IMPRIMIROS" ;
      tblTabledvelop_confirmpanel_imprimiros_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_IMPRIMIROS" ;
      Detailwebcomponent_modal_Internalname = sPrefix+"DETAILWEBCOMPONENT_MODAL" ;
      tblTabledetailwebcomponent_modal_Internalname = sPrefix+"TABLEDETAILWEBCOMPONENT_MODAL" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = sPrefix+"DIV_WWPAUXWC" ;
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
      edtavRelaciondehdrs_Jsonclick = "" ;
      edtavRelaciondehdrs_Visible = 0 ;
      edtavRelaciondehdrs_Enabled = 1 ;
      edtavNumerodehdrs_Jsonclick = "" ;
      edtavNumerodehdrs_Visible = 0 ;
      edtavNumerodehdrs_Enabled = 1 ;
      edtavBarenccli2_Jsonclick = "" ;
      edtavBarenccli2_Visible = 0 ;
      edtavBarenccli2_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Visible = 0 ;
      edtavClicod_Enabled = 1 ;
      edtavImpresionhdr_sdts__numero_relacionhdrs_Jsonclick = "" ;
      edtavImpresionhdr_sdts__numero_relacionhdrs_Enabled = 0 ;
      edtavImpresionhdr_sdts__numero_relacionhdrs_Visible = -1 ;
      edtavImpresionhdr_sdts__numero_numerohdrs_Jsonclick = "" ;
      edtavImpresionhdr_sdts__numero_numerohdrs_Enabled = 0 ;
      edtavImpresionhdr_sdts__numero_numerohdrs_Visible = -1 ;
      edtavImpresionhdr_sdts__barenccli_Jsonclick = "" ;
      edtavImpresionhdr_sdts__barenccli_Enabled = 0 ;
      edtavImpresionhdr_sdts__barenccli_Visible = -1 ;
      edtavImpresionhdr_sdts__clinom_Jsonclick = "" ;
      edtavImpresionhdr_sdts__clinom_Enabled = 0 ;
      edtavImpresionhdr_sdts__clinom_Visible = -1 ;
      edtavImpresionhdr_sdts__clicod_Jsonclick = "" ;
      edtavImpresionhdr_sdts__clicod_Enabled = 0 ;
      edtavImpresionhdr_sdts__clicod_Visible = -1 ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavImpresionhdr_sdts__numero_relacionhdrs_Visible = -1 ;
      edtavImpresionhdr_sdts__numero_numerohdrs_Visible = -1 ;
      edtavImpresionhdr_sdts__barenccli_Visible = -1 ;
      edtavImpresionhdr_sdts__clinom_Visible = -1 ;
      edtavImpresionhdr_sdts__clicod_Visible = -1 ;
      chkavSeleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavImpresionhdr_sdts__numero_relacionhdrs_Enabled = -1 ;
      edtavImpresionhdr_sdts__numero_numerohdrs_Enabled = -1 ;
      edtavImpresionhdr_sdts__barenccli_Enabled = -1 ;
      edtavImpresionhdr_sdts__clinom_Enabled = -1 ;
      edtavImpresionhdr_sdts__clicod_Enabled = -1 ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Detailwebcomponent_modal_Bodytype = "WebComponent" ;
      Detailwebcomponent_modal_Confirmtype = "" ;
      Detailwebcomponent_modal_Title = httpContext.getMessage( " Mantenimiento HDRs", "") ;
      Detailwebcomponent_modal_Width = "400" ;
      Dvelop_confirmpanel_imprimiros_Confirmtype = "1" ;
      Dvelop_confirmpanel_imprimiros_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_imprimiros_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_imprimiros_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_imprimiros_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_imprimiros_Confirmationtext = "¿Desea Imprimir las OSs?" ;
      Dvelop_confirmpanel_imprimiros_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||" ;
      Ddo_grid_Columnids = "2:ImpresionHdr_SDTs__Clicod|3:ImpresionHdr_SDTs__CliNom|4:ImpresionHdr_SDTs__BarEnccli|5:ImpresionHdr_SDTs__Numero_NumeroHdrs|6:ImpresionHdr_SDTs__Numero_RelacionHdrs" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      GXCCtl = "vSELECCIONAR_" + sGXsfl_37_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_37_Refreshing);
      chkavSeleccionar.setCheckedValue( "N" );
      if ( (GXutil.strcmp("", AV38Seleccionar)==0) )
      {
      }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV17ImpresionHdr_SDTs',fld:'vIMPRESIONHDR_SDTS',grid:37,pic:'',hsh:true},{av:'nGXsfl_37_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:37},{av:'nRC_GXsfl_37',ctrl:'GRID',prop:'GridRC',grid:37}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__CLICOD',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__CLINOM',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__BARENCCLI',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__NUMERO_NUMEROHDRS',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__NUMERO_RELACIONHDRS',prop:'Visible'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1219R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV17ImpresionHdr_SDTs',fld:'vIMPRESIONHDR_SDTS',grid:37,pic:'',hsh:true},{av:'nGXsfl_37_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:37},{av:'nRC_GXsfl_37',ctrl:'GRID',prop:'GridRC',grid:37},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1319R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV17ImpresionHdr_SDTs',fld:'vIMPRESIONHDR_SDTS',grid:37,pic:'',hsh:true},{av:'nGXsfl_37_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:37},{av:'nRC_GXsfl_37',ctrl:'GRID',prop:'GridRC',grid:37},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2119R2',iparms:[{av:'AV17ImpresionHdr_SDTs',fld:'vIMPRESIONHDR_SDTS',grid:37,pic:'',hsh:true},{av:'nGXsfl_37_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:37},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_37',ctrl:'GRID',prop:'GridRC',grid:37}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV49DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV38Seleccionar',fld:'vSELECCIONAR',pic:''},{av:'AV53CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV54BarEncCli2',fld:'vBARENCCLI2',pic:''},{av:'AV48NumerodeHdrs',fld:'vNUMERODEHDRS',pic:'ZZZ9'},{av:'AV55RelaciondeHdrs',fld:'vRELACIONDEHDRS',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1419R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV17ImpresionHdr_SDTs',fld:'vIMPRESIONHDR_SDTS',grid:37,pic:'',hsh:true},{av:'nGXsfl_37_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:37},{av:'nRC_GXsfl_37',ctrl:'GRID',prop:'GridRC',grid:37},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__CLICOD',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__CLINOM',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__BARENCCLI',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__NUMERO_NUMEROHDRS',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__NUMERO_RELACIONHDRS',prop:'Visible'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1119R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV17ImpresionHdr_SDTs',fld:'vIMPRESIONHDR_SDTS',grid:37,pic:'',hsh:true},{av:'nGXsfl_37_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:37},{av:'nRC_GXsfl_37',ctrl:'GRID',prop:'GridRC',grid:37},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__CLICOD',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__CLINOM',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__BARENCCLI',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__NUMERO_NUMEROHDRS',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__NUMERO_RELACIONHDRS',prop:'Visible'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOIMPRIMIROS'","{handler:'e2219R1',iparms:[]");
      setEventMetadata("'DOIMPRIMIROS'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_IMPRIMIROS.CLOSE","{handler:'e1519R2',iparms:[{av:'Dvelop_confirmpanel_imprimiros_Result',ctrl:'DVELOP_CONFIRMPANEL_IMPRIMIROS',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV17ImpresionHdr_SDTs',fld:'vIMPRESIONHDR_SDTS',grid:37,pic:'',hsh:true},{av:'nGXsfl_37_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:37},{av:'nRC_GXsfl_37',ctrl:'GRID',grid:37,prop:'GridRC',grid:37},{av:'sPrefix'},{av:'AV38Seleccionar',fld:'vSELECCIONAR',grid:37,pic:''},{av:'AV48NumerodeHdrs',fld:'vNUMERODEHDRS',grid:37,pic:'ZZZ9'},{av:'AV55RelaciondeHdrs',fld:'vRELACIONDEHDRS',grid:37,pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV45UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV46ImpCod',fld:'vIMPCOD',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_IMPRIMIROS.CLOSE",",oparms:[{av:'AV32Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV36Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV34Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV45UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV46ImpCod',fld:'vIMPCOD',pic:''},{av:'AV48NumerodeHdrs',fld:'vNUMERODEHDRS',pic:'ZZZ9'},{av:'AV55RelaciondeHdrs',fld:'vRELACIONDEHDRS',pic:''},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__CLICOD',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__CLINOM',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__BARENCCLI',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__NUMERO_NUMEROHDRS',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__NUMERO_RELACIONHDRS',prop:'Visible'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOIMPRIMIRRESUMO'","{handler:'e1719R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV17ImpresionHdr_SDTs',fld:'vIMPRESIONHDR_SDTS',grid:37,pic:'',hsh:true},{av:'nGXsfl_37_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:37},{av:'nRC_GXsfl_37',ctrl:'GRID',grid:37,prop:'GridRC',grid:37},{av:'sPrefix'},{av:'AV38Seleccionar',fld:'vSELECCIONAR',grid:37,pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53CliCod',fld:'vCLICOD',grid:37,pic:'ZZZZZ9'},{av:'AV54BarEncCli2',fld:'vBARENCCLI2',grid:37,pic:''},{av:'AV46ImpCod',fld:'vIMPCOD',pic:''},{av:'Gx_out',fld:'vOUTPUT',pic:''}]");
      setEventMetadata("'DOIMPRIMIRRESUMO'",",oparms:[{av:'Gx_out',fld:'vOUTPUT',pic:''},{av:'AV46ImpCod',fld:'vIMPCOD',pic:''},{av:'AV54BarEncCli2',fld:'vBARENCCLI2',pic:''},{av:'AV53CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__CLICOD',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__CLINOM',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__BARENCCLI',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__NUMERO_NUMEROHDRS',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__NUMERO_RELACIONHDRS',prop:'Visible'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOIMPRIMIROSRESUMO'","{handler:'e1819R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV17ImpresionHdr_SDTs',fld:'vIMPRESIONHDR_SDTS',grid:37,pic:'',hsh:true},{av:'nGXsfl_37_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:37},{av:'nRC_GXsfl_37',ctrl:'GRID',grid:37,prop:'GridRC',grid:37},{av:'sPrefix'},{av:'AV38Seleccionar',fld:'vSELECCIONAR',grid:37,pic:''},{av:'AV48NumerodeHdrs',fld:'vNUMERODEHDRS',grid:37,pic:'ZZZ9'},{av:'AV55RelaciondeHdrs',fld:'vRELACIONDEHDRS',grid:37,pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV45UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV46ImpCod',fld:'vIMPCOD',pic:''},{av:'AV53CliCod',fld:'vCLICOD',grid:37,pic:'ZZZZZ9'},{av:'AV54BarEncCli2',fld:'vBARENCCLI2',grid:37,pic:''},{av:'Gx_out',fld:'vOUTPUT',pic:''}]");
      setEventMetadata("'DOIMPRIMIROSRESUMO'",",oparms:[{av:'AV32Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV36Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV34Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV45UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV46ImpCod',fld:'vIMPCOD',pic:''},{av:'AV48NumerodeHdrs',fld:'vNUMERODEHDRS',pic:'ZZZ9'},{av:'AV55RelaciondeHdrs',fld:'vRELACIONDEHDRS',pic:''},{av:'Gx_out',fld:'vOUTPUT',pic:''},{av:'AV54BarEncCli2',fld:'vBARENCCLI2',pic:''},{av:'AV53CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__CLICOD',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__CLINOM',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__BARENCCLI',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__NUMERO_NUMEROHDRS',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__NUMERO_RELACIONHDRS',prop:'Visible'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e2319R2',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV54BarEncCli2',fld:'vBARENCCLI2',pic:''}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("DETAILWEBCOMPONENT_MODAL.CLOSE","{handler:'e1619R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV17ImpresionHdr_SDTs',fld:'vIMPRESIONHDR_SDTS',grid:37,pic:'',hsh:true},{av:'nGXsfl_37_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:37},{av:'nRC_GXsfl_37',ctrl:'GRID',prop:'GridRC',grid:37},{av:'sPrefix'}]");
      setEventMetadata("DETAILWEBCOMPONENT_MODAL.CLOSE",",oparms:[{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSeleccionar.getVisible()',ctrl:'vSELECCIONAR',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__CLICOD',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__CLINOM',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__BARENCCLI',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__NUMERO_NUMEROHDRS',prop:'Visible'},{ctrl:'IMPRESIONHDR_SDTS__NUMERO_RELACIONHDRS',prop:'Visible'},{av:'AV30GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV31GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("NULL","{handler:'validv_Relaciondehdrs',iparms:[]");
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
      wcpOAV5Emprcod = "" ;
      wcpOAV34Barcodpar = "" ;
      wcpOAV35Barcodpar_to = "" ;
      wcpOAV6BarFecGen = GXutil.nullDate() ;
      wcpOAV7BarFecGen_to = GXutil.nullDate() ;
      wcpOAV47BarEnccli = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_imprimiros_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5Emprcod = "" ;
      AV34Barcodpar = "" ;
      AV35Barcodpar_to = "" ;
      AV6BarFecGen = GXutil.nullDate() ;
      AV7BarFecGen_to = GXutil.nullDate() ;
      AV47BarEnccli = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV66Pgmname = "" ;
      AV16FilterFullText = "" ;
      AV17ImpresionHdr_SDTs = new GXBaseCollection<app.SdtImpresionHdrCv_SDT>(app.SdtImpresionHdrCv_SDT.class, "ImpresionHdrCv_SDT", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV25ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV28DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV45UsurCod = "" ;
      AV46ImpCod = "" ;
      Gx_out = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV38Seleccionar = "" ;
      AV49DetailWebComponent = "" ;
      AV54BarEncCli2 = "" ;
      AV55RelaciondeHdrs = "" ;
      AV64Station = "" ;
      AV65Emprnom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXt_objcol_SdtImpresionHdrCv_SDT7 = new GXBaseCollection<app.SdtImpresionHdrCv_SDT>(app.SdtImpresionHdrCv_SDT.class, "ImpresionHdrCv_SDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtImpresionHdrCv_SDT8 = new GXBaseCollection[1] ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV24Session = httpContext.getWebSession();
      AV20ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV26ManageFiltersXml = "" ;
      AV44Barcodparp = "" ;
      AV21UserCustomValue = "" ;
      GXt_char1 = "" ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection[1] ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      ucDetailwebcomponent_modal = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_imprimiros = new com.genexus.webpanels.GXUserControl();
      bttBtnimprimiros_Jsonclick = "" ;
      bttBtnimprimirresumo_Jsonclick = "" ;
      bttBtnimprimirosresumo_Jsonclick = "" ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV32Barcod = "" ;
      sCtrlAV36Barcodreo = "" ;
      sCtrlAV34Barcodpar = "" ;
      sCtrlAV33Barcod_to = "" ;
      sCtrlAV37Barcodreo_to = "" ;
      sCtrlAV35Barcodpar_to = "" ;
      sCtrlAV6BarFecGen = "" ;
      sCtrlAV7BarFecGen_to = "" ;
      sCtrlAV8BarLis = "" ;
      sCtrlAV47BarEnccli = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV66Pgmname = "ImpresionHdrCv" ;
      /* GeneXus formulas. */
      AV66Pgmname = "ImpresionHdrCv" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavImpresionhdr_sdts__clicod_Enabled = 0 ;
      edtavImpresionhdr_sdts__clinom_Enabled = 0 ;
      edtavImpresionhdr_sdts__barenccli_Enabled = 0 ;
      edtavImpresionhdr_sdts__numero_numerohdrs_Enabled = 0 ;
      edtavImpresionhdr_sdts__numero_relacionhdrs_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavBarenccli2_Enabled = 0 ;
      edtavNumerodehdrs_Enabled = 0 ;
      edtavRelaciondehdrs_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV36Barcodreo ;
   private byte wcpOAV37Barcodreo_to ;
   private byte wcpOAV8BarLis ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV36Barcodreo ;
   private byte AV37Barcodreo_to ;
   private byte AV8BarLis ;
   private byte AV27ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV43Barcodreop ;
   private byte GXv_int11[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short AV48NumerodeHdrs ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV39t ;
   private short AV40x ;
   private short AV41y ;
   private int wcpOAV32Barcod ;
   private int wcpOAV33Barcod_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_37 ;
   private int AV32Barcod ;
   private int AV33Barcod_to ;
   private int nGXsfl_37_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV58GXV1 ;
   private int AV53CliCod ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavImpresionhdr_sdts__clicod_Enabled ;
   private int edtavImpresionhdr_sdts__clinom_Enabled ;
   private int edtavImpresionhdr_sdts__barenccli_Enabled ;
   private int edtavImpresionhdr_sdts__numero_numerohdrs_Enabled ;
   private int edtavImpresionhdr_sdts__numero_relacionhdrs_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavBarenccli2_Enabled ;
   private int edtavNumerodehdrs_Enabled ;
   private int edtavRelaciondehdrs_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_37_fel_idx=1 ;
   private int edtavImpresionhdr_sdts__clicod_Visible ;
   private int edtavImpresionhdr_sdts__clinom_Visible ;
   private int edtavImpresionhdr_sdts__barenccli_Visible ;
   private int edtavImpresionhdr_sdts__numero_numerohdrs_Visible ;
   private int edtavImpresionhdr_sdts__numero_relacionhdrs_Visible ;
   private int AV29PageToGo ;
   private int AV42Barcodp ;
   private int GXv_int10[] ;
   private int AV72GXV7 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int edtavClicod_Visible ;
   private int edtavBarenccli2_Visible ;
   private int edtavNumerodehdrs_Visible ;
   private int edtavRelaciondehdrs_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV30GridCurrentPage ;
   private long AV31GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV34Barcodpar ;
   private String wcpOAV35Barcodpar_to ;
   private String wcpOAV47BarEnccli ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_imprimiros_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5Emprcod ;
   private String AV34Barcodpar ;
   private String AV35Barcodpar_to ;
   private String AV47BarEnccli ;
   private String sGXsfl_37_idx="0001" ;
   private String AV66Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV45UsurCod ;
   private String AV46ImpCod ;
   private String Gx_out ;
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
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Dvelop_confirmpanel_imprimiros_Title ;
   private String Dvelop_confirmpanel_imprimiros_Confirmationtext ;
   private String Dvelop_confirmpanel_imprimiros_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_imprimiros_Nobuttoncaption ;
   private String Dvelop_confirmpanel_imprimiros_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_imprimiros_Yesbuttonposition ;
   private String Dvelop_confirmpanel_imprimiros_Confirmtype ;
   private String Detailwebcomponent_modal_Width ;
   private String Detailwebcomponent_modal_Title ;
   private String Detailwebcomponent_modal_Confirmtype ;
   private String Detailwebcomponent_modal_Bodytype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV38Seleccionar ;
   private String AV49DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String edtavClicod_Internalname ;
   private String AV54BarEncCli2 ;
   private String edtavBarenccli2_Internalname ;
   private String edtavNumerodehdrs_Internalname ;
   private String edtavRelaciondehdrs_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavImpresionhdr_sdts__clicod_Internalname ;
   private String edtavImpresionhdr_sdts__clinom_Internalname ;
   private String edtavImpresionhdr_sdts__barenccli_Internalname ;
   private String edtavImpresionhdr_sdts__numero_numerohdrs_Internalname ;
   private String edtavImpresionhdr_sdts__numero_relacionhdrs_Internalname ;
   private String sGXsfl_37_fel_idx="0001" ;
   private String AV64Station ;
   private String AV65Emprnom ;
   private String AV44Barcodparp ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String tblTabledetailwebcomponent_modal_Internalname ;
   private String Detailwebcomponent_modal_Internalname ;
   private String tblTabledvelop_confirmpanel_imprimiros_Internalname ;
   private String Dvelop_confirmpanel_imprimiros_Internalname ;
   private String tblUnnamedtable1_Internalname ;
   private String bttBtnimprimiros_Internalname ;
   private String bttBtnimprimiros_Jsonclick ;
   private String bttBtnimprimirresumo_Internalname ;
   private String bttBtnimprimirresumo_Jsonclick ;
   private String bttBtnimprimirosresumo_Internalname ;
   private String bttBtnimprimirosresumo_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV32Barcod ;
   private String sCtrlAV36Barcodreo ;
   private String sCtrlAV34Barcodpar ;
   private String sCtrlAV33Barcod_to ;
   private String sCtrlAV37Barcodreo_to ;
   private String sCtrlAV35Barcodpar_to ;
   private String sCtrlAV6BarFecGen ;
   private String sCtrlAV7BarFecGen_to ;
   private String sCtrlAV8BarLis ;
   private String sCtrlAV47BarEnccli ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtavImpresionhdr_sdts__clicod_Jsonclick ;
   private String edtavImpresionhdr_sdts__clinom_Jsonclick ;
   private String edtavImpresionhdr_sdts__barenccli_Jsonclick ;
   private String edtavImpresionhdr_sdts__numero_numerohdrs_Jsonclick ;
   private String edtavImpresionhdr_sdts__numero_relacionhdrs_Jsonclick ;
   private String edtavClicod_Jsonclick ;
   private String edtavBarenccli2_Jsonclick ;
   private String edtavNumerodehdrs_Jsonclick ;
   private String edtavRelaciondehdrs_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV6BarFecGen ;
   private java.util.Date wcpOAV7BarFecGen_to ;
   private java.util.Date AV6BarFecGen ;
   private java.util.Date AV7BarFecGen_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_37_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV37 ;
   private boolean gx_refresh_fired ;
   private String AV20ColumnsSelectorXML ;
   private String AV26ManageFiltersXml ;
   private String AV21UserCustomValue ;
   private String AV16FilterFullText ;
   private String AV55RelaciondeHdrs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.webpanels.WebSession AV24Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDetailwebcomponent_modal ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_imprimiros ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private ICheckbox chkavSeleccionar ;
   private GXBaseCollection<app.SdtImpresionHdrCv_SDT> AV17ImpresionHdr_SDTs ;
   private GXBaseCollection<app.SdtImpresionHdrCv_SDT> GXt_objcol_SdtImpresionHdrCv_SDT7 ;
   private GXBaseCollection<app.SdtImpresionHdrCv_SDT> GXv_objcol_SdtImpresionHdrCv_SDT8[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV25ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV28DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

