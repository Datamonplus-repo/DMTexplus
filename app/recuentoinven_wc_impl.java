package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recuentoinven_wc_impl extends GXWebComponent
{
   public recuentoinven_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recuentoinven_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recuentoinven_wc_impl.class ));
   }

   public recuentoinven_wc_impl( int remoteHandle ,
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
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
               AV5EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
               AV6PrdNumFrom = httpContext.GetPar( "PrdNumFrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNumFrom", AV6PrdNumFrom);
               AV7PrdNumTo = httpContext.GetPar( "PrdNumTo") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdNumTo", AV7PrdNumTo);
               AV8PrvNumFrom = (int)(GXutil.lval( httpContext.GetPar( "PrvNumFrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrvNumFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8PrvNumFrom), 6, 0));
               AV9PrvNumTo = (int)(GXutil.lval( httpContext.GetPar( "PrvNumTo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9PrvNumTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9PrvNumTo), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5EmprCod,AV6PrdNumFrom,AV7PrdNumTo,Integer.valueOf(AV8PrvNumFrom),Integer.valueOf(AV9PrvNumTo)});
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
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      nRC_GXsfl_45 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_45"))) ;
      nGXsfl_45_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_45_idx"))) ;
      sGXsfl_45_idx = httpContext.GetPar( "sGXsfl_45_idx") ;
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
      AV21FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      AV6PrdNumFrom = httpContext.GetPar( "PrdNumFrom") ;
      AV7PrdNumTo = httpContext.GetPar( "PrdNumTo") ;
      AV8PrvNumFrom = (int)(GXutil.lval( httpContext.GetPar( "PrvNumFrom"))) ;
      AV9PrvNumTo = (int)(GXutil.lval( httpContext.GetPar( "PrvNumTo"))) ;
      AV31ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV26ColumnsSelector);
      AV32TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV33TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV34TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV35TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV36TFPrvNum = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum"))) ;
      AV37TFPrvNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum_To"))) ;
      AV38TFPrvNom = httpContext.GetPar( "TFPrvNom") ;
      AV39TFPrvNom_Sel = httpContext.GetPar( "TFPrvNom_Sel") ;
      AV40TFMetCod = (byte)(GXutil.lval( httpContext.GetPar( "TFMetCod"))) ;
      AV41TFMetCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFMetCod_To"))) ;
      AV42TFMetDsc = httpContext.GetPar( "TFMetDsc") ;
      AV43TFMetDsc_Sel = httpContext.GetPar( "TFMetDsc_Sel") ;
      AV66Pgmname = httpContext.GetPar( "Pgmname") ;
      AV18OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV19OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV5EmprCod, AV6PrdNumFrom, AV7PrdNumTo, AV8PrvNumFrom, AV9PrvNumTo, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV32TFPrdNum, AV33TFPrdNum_Sel, AV34TFPrdNom, AV35TFPrdNom_Sel, AV36TFPrvNum, AV37TFPrvNum_To, AV38TFPrvNom, AV39TFPrvNom_Sel, AV40TFMetCod, AV41TFMetCod_To, AV42TFMetDsc, AV43TFMetDsc_Sel, AV66Pgmname, AV18OrderedBy, AV19OrderedDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1M12( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Mantenimiento Productos Quimicos", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recuentoinven_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV6PrdNumFrom)),GXutil.URLEncode(GXutil.rtrim(AV7PrdNumTo)),GXutil.URLEncode(GXutil.ltrimstr(AV8PrvNumFrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9PrvNumTo,6,0))}, new String[] {"EmprCod","PrdNumFrom","PrdNumTo","PrvNumFrom","PrvNumTo"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV21FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV29ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV29ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV46GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV47GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV26ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV26ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5EmprCod", GXutil.rtrim( wcpOAV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6PrdNumFrom", GXutil.rtrim( wcpOAV6PrdNumFrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7PrdNumTo", GXutil.rtrim( wcpOAV7PrdNumTo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8PrvNumFrom", GXutil.ltrim( localUtil.ntoc( wcpOAV8PrvNumFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9PrvNumTo", GXutil.ltrim( localUtil.ntoc( wcpOAV9PrvNumTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV31ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM", GXutil.rtrim( AV32TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM_SEL", GXutil.rtrim( AV33TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM", GXutil.rtrim( AV34TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM_SEL", GXutil.rtrim( AV35TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNUM", GXutil.ltrim( localUtil.ntoc( AV36TFPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV37TFPrvNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNOM", GXutil.rtrim( AV38TFPrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNOM_SEL", GXutil.rtrim( AV39TFPrvNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETCOD", GXutil.ltrim( localUtil.ntoc( AV40TFMetCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETCOD_TO", GXutil.ltrim( localUtil.ntoc( AV41TFMetCod_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETDSC", GXutil.rtrim( AV42TFMetDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETDSC_SEL", GXutil.rtrim( AV43TFMetDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV66Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV66Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV18OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV19OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV16GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV16GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUMFROM", GXutil.rtrim( AV6PrdNumFrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUMTO", GXutil.rtrim( AV7PrdNumTo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRVNUMFROM", GXutil.ltrim( localUtil.ntoc( AV8PrvNumFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRVNUMTO", GXutil.ltrim( localUtil.ntoc( AV9PrvNumTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm1M12( )
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
      return "RecuentoInven_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento Productos Quimicos", "") ;
   }

   public void wb1M10( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.recuentoinven_wc");
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
            httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecuentoInven_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecuentoInven_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecuentoInven_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecuentoInven_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecuentoInven_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_1M12( true) ;
      }
      else
      {
         wb_table1_27_1M12( false) ;
      }
      return  ;
   }

   public void wb_table1_27_1M12e( boolean wbgen )
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
         startgridcontrol45( ) ;
      }
      if ( wbEnd == 45 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_45 = (int)(nGXsfl_45_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV46GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV47GridPageCount);
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
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV44DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV44DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV26ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 45 )
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

   public void start1M12( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento Productos Quimicos", ""), (short)(0)) ;
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
            strup1M10( ) ;
         }
      }
   }

   public void ws1M12( )
   {
      start1M12( ) ;
      evt1M12( ) ;
   }

   public void evt1M12( )
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
                              strup1M10( ) ;
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
                              strup1M10( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111M12 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M10( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121M12 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M10( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131M12 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M10( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141M12 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M10( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151M12 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M10( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsert' */
                                 e161M12 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M10( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e171M12 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M10( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportReport' */
                                 e181M12 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M10( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e191M12 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M10( ) ;
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
                              strup1M10( ) ;
                           }
                           nGXsfl_45_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_452( ) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
                           n794PrvNom = false ;
                           A629MetCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n629MetCod = false ;
                           A630MetDsc = httpContext.cgiGet( edtMetDsc_Internalname) ;
                           n630MetDsc = false ;
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
                                       e201M12 ();
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
                                       e211M12 ();
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
                                       e221M12 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV21FilterFullText) != 0 )
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
                                    strup1M10( ) ;
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

   public void we1M12( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1M12( ) ;
         }
      }
   }

   public void pa1M12( )
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
      subsflControlProps_452( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         sendrow_452( ) ;
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV21FilterFullText ,
                                 String AV5EmprCod ,
                                 String AV6PrdNumFrom ,
                                 String AV7PrdNumTo ,
                                 int AV8PrvNumFrom ,
                                 int AV9PrvNumTo ,
                                 byte AV31ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ,
                                 String AV32TFPrdNum ,
                                 String AV33TFPrdNum_Sel ,
                                 String AV34TFPrdNom ,
                                 String AV35TFPrdNom_Sel ,
                                 int AV36TFPrvNum ,
                                 int AV37TFPrvNum_To ,
                                 String AV38TFPrvNom ,
                                 String AV39TFPrvNom_Sel ,
                                 byte AV40TFMetCod ,
                                 byte AV41TFMetCod_To ,
                                 String AV42TFMetDsc ,
                                 String AV43TFMetDsc_Sel ,
                                 String AV66Pgmname ,
                                 short AV18OrderedBy ,
                                 boolean AV19OrderedDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e211M12 ();
      GRID_nCurrentRecord = 0 ;
      rf1M12( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDNUM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDNUM", GXutil.rtrim( A719PrdNum));
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
      rf1M12( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV66Pgmname = "RecuentoInven_WC" ;
      Gx_err = (short)(0) ;
   }

   public void rf1M12( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e211M12 ();
      nGXsfl_45_idx = 1 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_452( ) ;
      bGXsfl_45_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_452( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV53Recuentoinven_wcds_1_filterfulltext ,
                                              AV55Recuentoinven_wcds_3_tfprdnum_sel ,
                                              AV54Recuentoinven_wcds_2_tfprdnum ,
                                              AV57Recuentoinven_wcds_5_tfprdnom_sel ,
                                              AV56Recuentoinven_wcds_4_tfprdnom ,
                                              Integer.valueOf(AV58Recuentoinven_wcds_6_tfprvnum) ,
                                              Integer.valueOf(AV59Recuentoinven_wcds_7_tfprvnum_to) ,
                                              AV61Recuentoinven_wcds_9_tfprvnom_sel ,
                                              AV60Recuentoinven_wcds_8_tfprvnom ,
                                              Byte.valueOf(AV62Recuentoinven_wcds_10_tfmetcod) ,
                                              Byte.valueOf(AV63Recuentoinven_wcds_11_tfmetcod_to) ,
                                              AV65Recuentoinven_wcds_13_tfmetdsc_sel ,
                                              AV64Recuentoinven_wcds_12_tfmetdsc ,
                                              AV5EmprCod ,
                                              AV6PrdNumFrom ,
                                              AV7PrdNumTo ,
                                              Integer.valueOf(AV8PrvNumFrom) ,
                                              Integer.valueOf(AV9PrvNumTo) ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              Integer.valueOf(A795PrvNum) ,
                                              A794PrvNom ,
                                              Byte.valueOf(A629MetCod) ,
                                              A630MetDsc ,
                                              A396EmprCod ,
                                              Short.valueOf(AV18OrderedBy) ,
                                              Boolean.valueOf(AV19OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                              }
         });
         lV53Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Recuentoinven_wcds_1_filterfulltext), "%", "") ;
         lV53Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Recuentoinven_wcds_1_filterfulltext), "%", "") ;
         lV53Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Recuentoinven_wcds_1_filterfulltext), "%", "") ;
         lV53Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Recuentoinven_wcds_1_filterfulltext), "%", "") ;
         lV53Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Recuentoinven_wcds_1_filterfulltext), "%", "") ;
         lV53Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Recuentoinven_wcds_1_filterfulltext), "%", "") ;
         lV54Recuentoinven_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV54Recuentoinven_wcds_2_tfprdnum), 6, "%") ;
         lV56Recuentoinven_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV56Recuentoinven_wcds_4_tfprdnom), 26, "%") ;
         lV60Recuentoinven_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV60Recuentoinven_wcds_8_tfprvnom), 30, "%") ;
         lV64Recuentoinven_wcds_12_tfmetdsc = GXutil.padr( GXutil.rtrim( AV64Recuentoinven_wcds_12_tfmetdsc), 8, "%") ;
         /* Using cursor H01M12 */
         pr_default.execute(0, new Object[] {lV53Recuentoinven_wcds_1_filterfulltext, lV53Recuentoinven_wcds_1_filterfulltext, lV53Recuentoinven_wcds_1_filterfulltext, lV53Recuentoinven_wcds_1_filterfulltext, lV53Recuentoinven_wcds_1_filterfulltext, lV53Recuentoinven_wcds_1_filterfulltext, lV54Recuentoinven_wcds_2_tfprdnum, AV55Recuentoinven_wcds_3_tfprdnum_sel, lV56Recuentoinven_wcds_4_tfprdnom, AV57Recuentoinven_wcds_5_tfprdnom_sel, Integer.valueOf(AV58Recuentoinven_wcds_6_tfprvnum), Integer.valueOf(AV59Recuentoinven_wcds_7_tfprvnum_to), lV60Recuentoinven_wcds_8_tfprvnom, AV61Recuentoinven_wcds_9_tfprvnom_sel, Byte.valueOf(AV62Recuentoinven_wcds_10_tfmetcod), Byte.valueOf(AV63Recuentoinven_wcds_11_tfmetcod_to), lV64Recuentoinven_wcds_12_tfmetdsc, AV65Recuentoinven_wcds_13_tfmetdsc_sel, AV5EmprCod, AV6PrdNumFrom, AV7PrdNumTo, Integer.valueOf(AV8PrvNumFrom), Integer.valueOf(AV9PrvNumTo), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A630MetDsc = H01M12_A630MetDsc[0] ;
            n630MetDsc = H01M12_n630MetDsc[0] ;
            A629MetCod = H01M12_A629MetCod[0] ;
            n629MetCod = H01M12_n629MetCod[0] ;
            A794PrvNom = H01M12_A794PrvNom[0] ;
            n794PrvNom = H01M12_n794PrvNom[0] ;
            A795PrvNum = H01M12_A795PrvNum[0] ;
            A718PrdNom = H01M12_A718PrdNom[0] ;
            A719PrdNum = H01M12_A719PrdNum[0] ;
            A407EmprNom = H01M12_A407EmprNom[0] ;
            n407EmprNom = H01M12_n407EmprNom[0] ;
            A396EmprCod = H01M12_A396EmprCod[0] ;
            A407EmprNom = H01M12_A407EmprNom[0] ;
            n407EmprNom = H01M12_n407EmprNom[0] ;
            A630MetDsc = H01M12_A630MetDsc[0] ;
            n630MetDsc = H01M12_n630MetDsc[0] ;
            A794PrvNom = H01M12_A794PrvNom[0] ;
            n794PrvNom = H01M12_n794PrvNom[0] ;
            e221M12 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(45) ;
         wb1M10( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1M12( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV66Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV66Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PRDNUM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sPrefix+sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
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
      AV53Recuentoinven_wcds_1_filterfulltext = AV21FilterFullText ;
      AV54Recuentoinven_wcds_2_tfprdnum = AV32TFPrdNum ;
      AV55Recuentoinven_wcds_3_tfprdnum_sel = AV33TFPrdNum_Sel ;
      AV56Recuentoinven_wcds_4_tfprdnom = AV34TFPrdNom ;
      AV57Recuentoinven_wcds_5_tfprdnom_sel = AV35TFPrdNom_Sel ;
      AV58Recuentoinven_wcds_6_tfprvnum = AV36TFPrvNum ;
      AV59Recuentoinven_wcds_7_tfprvnum_to = AV37TFPrvNum_To ;
      AV60Recuentoinven_wcds_8_tfprvnom = AV38TFPrvNom ;
      AV61Recuentoinven_wcds_9_tfprvnom_sel = AV39TFPrvNom_Sel ;
      AV62Recuentoinven_wcds_10_tfmetcod = AV40TFMetCod ;
      AV63Recuentoinven_wcds_11_tfmetcod_to = AV41TFMetCod_To ;
      AV64Recuentoinven_wcds_12_tfmetdsc = AV42TFMetDsc ;
      AV65Recuentoinven_wcds_13_tfmetdsc_sel = AV43TFMetDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV53Recuentoinven_wcds_1_filterfulltext ,
                                           AV55Recuentoinven_wcds_3_tfprdnum_sel ,
                                           AV54Recuentoinven_wcds_2_tfprdnum ,
                                           AV57Recuentoinven_wcds_5_tfprdnom_sel ,
                                           AV56Recuentoinven_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV58Recuentoinven_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV59Recuentoinven_wcds_7_tfprvnum_to) ,
                                           AV61Recuentoinven_wcds_9_tfprvnom_sel ,
                                           AV60Recuentoinven_wcds_8_tfprvnom ,
                                           Byte.valueOf(AV62Recuentoinven_wcds_10_tfmetcod) ,
                                           Byte.valueOf(AV63Recuentoinven_wcds_11_tfmetcod_to) ,
                                           AV65Recuentoinven_wcds_13_tfmetdsc_sel ,
                                           AV64Recuentoinven_wcds_12_tfmetdsc ,
                                           AV5EmprCod ,
                                           AV6PrdNumFrom ,
                                           AV7PrdNumTo ,
                                           Integer.valueOf(AV8PrvNumFrom) ,
                                           Integer.valueOf(AV9PrvNumTo) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           Byte.valueOf(A629MetCod) ,
                                           A630MetDsc ,
                                           A396EmprCod ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV53Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV53Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV53Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV53Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV53Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV53Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV54Recuentoinven_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV54Recuentoinven_wcds_2_tfprdnum), 6, "%") ;
      lV56Recuentoinven_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV56Recuentoinven_wcds_4_tfprdnom), 26, "%") ;
      lV60Recuentoinven_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV60Recuentoinven_wcds_8_tfprvnom), 30, "%") ;
      lV64Recuentoinven_wcds_12_tfmetdsc = GXutil.padr( GXutil.rtrim( AV64Recuentoinven_wcds_12_tfmetdsc), 8, "%") ;
      /* Using cursor H01M13 */
      pr_default.execute(1, new Object[] {lV53Recuentoinven_wcds_1_filterfulltext, lV53Recuentoinven_wcds_1_filterfulltext, lV53Recuentoinven_wcds_1_filterfulltext, lV53Recuentoinven_wcds_1_filterfulltext, lV53Recuentoinven_wcds_1_filterfulltext, lV53Recuentoinven_wcds_1_filterfulltext, lV54Recuentoinven_wcds_2_tfprdnum, AV55Recuentoinven_wcds_3_tfprdnum_sel, lV56Recuentoinven_wcds_4_tfprdnom, AV57Recuentoinven_wcds_5_tfprdnom_sel, Integer.valueOf(AV58Recuentoinven_wcds_6_tfprvnum), Integer.valueOf(AV59Recuentoinven_wcds_7_tfprvnum_to), lV60Recuentoinven_wcds_8_tfprvnom, AV61Recuentoinven_wcds_9_tfprvnom_sel, Byte.valueOf(AV62Recuentoinven_wcds_10_tfmetcod), Byte.valueOf(AV63Recuentoinven_wcds_11_tfmetcod_to), lV64Recuentoinven_wcds_12_tfmetdsc, AV65Recuentoinven_wcds_13_tfmetdsc_sel, AV5EmprCod, AV6PrdNumFrom, AV7PrdNumTo, Integer.valueOf(AV8PrvNumFrom), Integer.valueOf(AV9PrvNumTo)});
      GRID_nRecordCount = H01M13_AGRID_nRecordCount[0] ;
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
      AV53Recuentoinven_wcds_1_filterfulltext = AV21FilterFullText ;
      AV54Recuentoinven_wcds_2_tfprdnum = AV32TFPrdNum ;
      AV55Recuentoinven_wcds_3_tfprdnum_sel = AV33TFPrdNum_Sel ;
      AV56Recuentoinven_wcds_4_tfprdnom = AV34TFPrdNom ;
      AV57Recuentoinven_wcds_5_tfprdnom_sel = AV35TFPrdNom_Sel ;
      AV58Recuentoinven_wcds_6_tfprvnum = AV36TFPrvNum ;
      AV59Recuentoinven_wcds_7_tfprvnum_to = AV37TFPrvNum_To ;
      AV60Recuentoinven_wcds_8_tfprvnom = AV38TFPrvNom ;
      AV61Recuentoinven_wcds_9_tfprvnom_sel = AV39TFPrvNom_Sel ;
      AV62Recuentoinven_wcds_10_tfmetcod = AV40TFMetCod ;
      AV63Recuentoinven_wcds_11_tfmetcod_to = AV41TFMetCod_To ;
      AV64Recuentoinven_wcds_12_tfmetdsc = AV42TFMetDsc ;
      AV65Recuentoinven_wcds_13_tfmetdsc_sel = AV43TFMetDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV5EmprCod, AV6PrdNumFrom, AV7PrdNumTo, AV8PrvNumFrom, AV9PrvNumTo, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV32TFPrdNum, AV33TFPrdNum_Sel, AV34TFPrdNom, AV35TFPrdNom_Sel, AV36TFPrvNum, AV37TFPrvNum_To, AV38TFPrvNom, AV39TFPrvNom_Sel, AV40TFMetCod, AV41TFMetCod_To, AV42TFMetDsc, AV43TFMetDsc_Sel, AV66Pgmname, AV18OrderedBy, AV19OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV53Recuentoinven_wcds_1_filterfulltext = AV21FilterFullText ;
      AV54Recuentoinven_wcds_2_tfprdnum = AV32TFPrdNum ;
      AV55Recuentoinven_wcds_3_tfprdnum_sel = AV33TFPrdNum_Sel ;
      AV56Recuentoinven_wcds_4_tfprdnom = AV34TFPrdNom ;
      AV57Recuentoinven_wcds_5_tfprdnom_sel = AV35TFPrdNom_Sel ;
      AV58Recuentoinven_wcds_6_tfprvnum = AV36TFPrvNum ;
      AV59Recuentoinven_wcds_7_tfprvnum_to = AV37TFPrvNum_To ;
      AV60Recuentoinven_wcds_8_tfprvnom = AV38TFPrvNom ;
      AV61Recuentoinven_wcds_9_tfprvnom_sel = AV39TFPrvNom_Sel ;
      AV62Recuentoinven_wcds_10_tfmetcod = AV40TFMetCod ;
      AV63Recuentoinven_wcds_11_tfmetcod_to = AV41TFMetCod_To ;
      AV64Recuentoinven_wcds_12_tfmetdsc = AV42TFMetDsc ;
      AV65Recuentoinven_wcds_13_tfmetdsc_sel = AV43TFMetDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV5EmprCod, AV6PrdNumFrom, AV7PrdNumTo, AV8PrvNumFrom, AV9PrvNumTo, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV32TFPrdNum, AV33TFPrdNum_Sel, AV34TFPrdNom, AV35TFPrdNom_Sel, AV36TFPrvNum, AV37TFPrvNum_To, AV38TFPrvNom, AV39TFPrvNom_Sel, AV40TFMetCod, AV41TFMetCod_To, AV42TFMetDsc, AV43TFMetDsc_Sel, AV66Pgmname, AV18OrderedBy, AV19OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV53Recuentoinven_wcds_1_filterfulltext = AV21FilterFullText ;
      AV54Recuentoinven_wcds_2_tfprdnum = AV32TFPrdNum ;
      AV55Recuentoinven_wcds_3_tfprdnum_sel = AV33TFPrdNum_Sel ;
      AV56Recuentoinven_wcds_4_tfprdnom = AV34TFPrdNom ;
      AV57Recuentoinven_wcds_5_tfprdnom_sel = AV35TFPrdNom_Sel ;
      AV58Recuentoinven_wcds_6_tfprvnum = AV36TFPrvNum ;
      AV59Recuentoinven_wcds_7_tfprvnum_to = AV37TFPrvNum_To ;
      AV60Recuentoinven_wcds_8_tfprvnom = AV38TFPrvNom ;
      AV61Recuentoinven_wcds_9_tfprvnom_sel = AV39TFPrvNom_Sel ;
      AV62Recuentoinven_wcds_10_tfmetcod = AV40TFMetCod ;
      AV63Recuentoinven_wcds_11_tfmetcod_to = AV41TFMetCod_To ;
      AV64Recuentoinven_wcds_12_tfmetdsc = AV42TFMetDsc ;
      AV65Recuentoinven_wcds_13_tfmetdsc_sel = AV43TFMetDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV5EmprCod, AV6PrdNumFrom, AV7PrdNumTo, AV8PrvNumFrom, AV9PrvNumTo, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV32TFPrdNum, AV33TFPrdNum_Sel, AV34TFPrdNom, AV35TFPrdNom_Sel, AV36TFPrvNum, AV37TFPrvNum_To, AV38TFPrvNom, AV39TFPrvNom_Sel, AV40TFMetCod, AV41TFMetCod_To, AV42TFMetDsc, AV43TFMetDsc_Sel, AV66Pgmname, AV18OrderedBy, AV19OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV53Recuentoinven_wcds_1_filterfulltext = AV21FilterFullText ;
      AV54Recuentoinven_wcds_2_tfprdnum = AV32TFPrdNum ;
      AV55Recuentoinven_wcds_3_tfprdnum_sel = AV33TFPrdNum_Sel ;
      AV56Recuentoinven_wcds_4_tfprdnom = AV34TFPrdNom ;
      AV57Recuentoinven_wcds_5_tfprdnom_sel = AV35TFPrdNom_Sel ;
      AV58Recuentoinven_wcds_6_tfprvnum = AV36TFPrvNum ;
      AV59Recuentoinven_wcds_7_tfprvnum_to = AV37TFPrvNum_To ;
      AV60Recuentoinven_wcds_8_tfprvnom = AV38TFPrvNom ;
      AV61Recuentoinven_wcds_9_tfprvnom_sel = AV39TFPrvNom_Sel ;
      AV62Recuentoinven_wcds_10_tfmetcod = AV40TFMetCod ;
      AV63Recuentoinven_wcds_11_tfmetcod_to = AV41TFMetCod_To ;
      AV64Recuentoinven_wcds_12_tfmetdsc = AV42TFMetDsc ;
      AV65Recuentoinven_wcds_13_tfmetdsc_sel = AV43TFMetDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV5EmprCod, AV6PrdNumFrom, AV7PrdNumTo, AV8PrvNumFrom, AV9PrvNumTo, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV32TFPrdNum, AV33TFPrdNum_Sel, AV34TFPrdNom, AV35TFPrdNom_Sel, AV36TFPrvNum, AV37TFPrvNum_To, AV38TFPrvNom, AV39TFPrvNom_Sel, AV40TFMetCod, AV41TFMetCod_To, AV42TFMetDsc, AV43TFMetDsc_Sel, AV66Pgmname, AV18OrderedBy, AV19OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV53Recuentoinven_wcds_1_filterfulltext = AV21FilterFullText ;
      AV54Recuentoinven_wcds_2_tfprdnum = AV32TFPrdNum ;
      AV55Recuentoinven_wcds_3_tfprdnum_sel = AV33TFPrdNum_Sel ;
      AV56Recuentoinven_wcds_4_tfprdnom = AV34TFPrdNom ;
      AV57Recuentoinven_wcds_5_tfprdnom_sel = AV35TFPrdNom_Sel ;
      AV58Recuentoinven_wcds_6_tfprvnum = AV36TFPrvNum ;
      AV59Recuentoinven_wcds_7_tfprvnum_to = AV37TFPrvNum_To ;
      AV60Recuentoinven_wcds_8_tfprvnom = AV38TFPrvNom ;
      AV61Recuentoinven_wcds_9_tfprvnom_sel = AV39TFPrvNom_Sel ;
      AV62Recuentoinven_wcds_10_tfmetcod = AV40TFMetCod ;
      AV63Recuentoinven_wcds_11_tfmetcod_to = AV41TFMetCod_To ;
      AV64Recuentoinven_wcds_12_tfmetdsc = AV42TFMetDsc ;
      AV65Recuentoinven_wcds_13_tfmetdsc_sel = AV43TFMetDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV5EmprCod, AV6PrdNumFrom, AV7PrdNumTo, AV8PrvNumFrom, AV9PrvNumTo, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV32TFPrdNum, AV33TFPrdNum_Sel, AV34TFPrdNom, AV35TFPrdNom_Sel, AV36TFPrvNum, AV37TFPrvNum_To, AV38TFPrvNom, AV39TFPrvNom_Sel, AV40TFMetCod, AV41TFMetCod_To, AV42TFMetDsc, AV43TFMetDsc_Sel, AV66Pgmname, AV18OrderedBy, AV19OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV66Pgmname = "RecuentoInven_WC" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1M10( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e201M12 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV29ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV44DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV26ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV46GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV47GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
         wcpOAV6PrdNumFrom = httpContext.cgiGet( sPrefix+"wcpOAV6PrdNumFrom") ;
         wcpOAV7PrdNumTo = httpContext.cgiGet( sPrefix+"wcpOAV7PrdNumTo") ;
         wcpOAV8PrvNumFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8PrvNumFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV9PrvNumTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9PrvNumTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Innewwindow1_Width = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Target") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV21FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FilterFullText", AV21FilterFullText);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV21FilterFullText) != 0 )
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
      e201M12 ();
      if (returnInSub) return;
   }

   public void e201M12( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV50Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recuentoinven_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV50Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV51Emprnom ;
      GXv_char4[0] = AV52Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV50Station, GXv_char2, GXv_char3, GXv_char4) ;
      recuentoinven_wc_impl.this.AV5EmprCod = GXv_char2[0] ;
      recuentoinven_wc_impl.this.AV51Emprnom = GXv_char3[0] ;
      recuentoinven_wc_impl.this.AV52Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
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
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV18OrderedBy < 1 )
      {
         AV18OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV44DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV44DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e211M12( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV12WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV12WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV31ManageFiltersExecutionStep == 1 )
      {
         AV31ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV31ManageFiltersExecutionStep == 2 )
      {
         AV31ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV28Session.getValue("RecuentoInven_WCColumnsSelector"), "") != 0 )
      {
         AV24ColumnsSelectorXML = AV28Session.getValue("RecuentoInven_WCColumnsSelector") ;
         AV26ColumnsSelector.fromxml(AV24ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMetCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMetDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV46GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridCurrentPage), 10, 0));
      AV47GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridPageCount), 10, 0));
      AV53Recuentoinven_wcds_1_filterfulltext = AV21FilterFullText ;
      AV54Recuentoinven_wcds_2_tfprdnum = AV32TFPrdNum ;
      AV55Recuentoinven_wcds_3_tfprdnum_sel = AV33TFPrdNum_Sel ;
      AV56Recuentoinven_wcds_4_tfprdnom = AV34TFPrdNom ;
      AV57Recuentoinven_wcds_5_tfprdnom_sel = AV35TFPrdNom_Sel ;
      AV58Recuentoinven_wcds_6_tfprvnum = AV36TFPrvNum ;
      AV59Recuentoinven_wcds_7_tfprvnum_to = AV37TFPrvNum_To ;
      AV60Recuentoinven_wcds_8_tfprvnom = AV38TFPrvNom ;
      AV61Recuentoinven_wcds_9_tfprvnom_sel = AV39TFPrvNom_Sel ;
      AV62Recuentoinven_wcds_10_tfmetcod = AV40TFMetCod ;
      AV63Recuentoinven_wcds_11_tfmetcod_to = AV41TFMetCod_To ;
      AV64Recuentoinven_wcds_12_tfmetdsc = AV42TFMetDsc ;
      AV65Recuentoinven_wcds_13_tfmetdsc_sel = AV43TFMetDsc_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ManageFiltersData", AV29ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
   }

   public void e121M12( )
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
         AV45PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV45PageToGo) ;
      }
   }

   public void e131M12( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141M12( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV18OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
         AV19OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedDsc", AV19OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV32TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrdNum", AV32TFPrdNum);
            AV33TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrdNum_Sel", AV33TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV34TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFPrdNom", AV34TFPrdNom);
            AV35TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFPrdNom_Sel", AV35TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNum") == 0 )
         {
            AV36TFPrvNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFPrvNum), 6, 0));
            AV37TFPrvNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNom") == 0 )
         {
            AV38TFPrvNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrvNom", AV38TFPrvNom);
            AV39TFPrvNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrvNom_Sel", AV39TFPrvNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetCod") == 0 )
         {
            AV40TFMetCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFMetCod", GXutil.str( AV40TFMetCod, 1, 0));
            AV41TFMetCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFMetCod_To", GXutil.str( AV41TFMetCod_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetDsc") == 0 )
         {
            AV42TFMetDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMetDsc", AV42TFMetDsc);
            AV43TFMetDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMetDsc_Sel", AV43TFMetDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e221M12( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      edtPrdNom_Link = formatLink("app.tnprovprdview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","PrdNum","TabCode"})  ;
      edtMetDsc_Link = formatLink("app.stocksquimicos.tmetpedview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A629MetCod,1,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","MetCod","TabCode"})  ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(45) ;
      }
      sendrow_452( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_45_Refreshing )
      {
         httpContext.doAjaxLoad(45, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e151M12( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV24ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV26ColumnsSelector.fromJSonString(AV24ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "RecuentoInven_WCColumnsSelector", ((GXutil.strcmp("", AV24ColumnsSelectorXML)==0) ? "" : AV26ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ManageFiltersData", AV29ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
   }

   public void e111M12( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("RecuentoInven_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV66Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV31ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("RecuentoInven_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV31ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV30ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "RecuentoInven_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         recuentoinven_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV30ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV30ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV66Pgmname+"GridState", AV30ManageFiltersXml) ;
            AV16GridState.fromxml(AV30ManageFiltersXml, null, null);
            AV18OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
            AV19OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedDsc", AV19OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ManageFiltersData", AV29ManageFiltersData);
   }

   public void e161M12( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.stocksquimicos.produc", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","PrdNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e171M12( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV22ExcelFilename ;
      GXv_char3[0] = AV23ErrorMessage ;
      new app.recuentoinven_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      recuentoinven_wc_impl.this.AV22ExcelFilename = GXv_char4[0] ;
      recuentoinven_wc_impl.this.AV23ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV22ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV22ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV23ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
   }

   public void e181M12( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.recuentoinven_wcexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, sPrefix, false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod(sPrefix, false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
   }

   public void e191M12( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.recuentoinven_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV18OrderedBy, 4, 0))+":"+(AV19OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV26ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNum", "", "Producto", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNom", "", "Descripcion", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvNum", "", "Codigo Proveedor", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvNom", "", "Nombre Proveedor", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MetCod", "", "Codigo Metodo", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MetDsc", "", "Descripcion Metodo", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV25UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "RecuentoInven_WCColumnsSelector", GXv_char4) ;
      recuentoinven_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV25UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV25UserCustomValue)==0) ) )
      {
         AV27ColumnsSelectorAux.fromxml(AV25UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV27ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV27ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV29ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "RecuentoInven_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV29ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV21FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FilterFullText", AV21FilterFullText);
      AV32TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrdNum", AV32TFPrdNum);
      AV33TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrdNum_Sel", AV33TFPrdNum_Sel);
      AV34TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFPrdNom", AV34TFPrdNom);
      AV35TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFPrdNom_Sel", AV35TFPrdNom_Sel);
      AV36TFPrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFPrvNum), 6, 0));
      AV37TFPrvNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFPrvNum_To), 6, 0));
      AV38TFPrvNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrvNom", AV38TFPrvNom);
      AV39TFPrvNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrvNom_Sel", AV39TFPrvNom_Sel);
      AV40TFMetCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFMetCod", GXutil.str( AV40TFMetCod, 1, 0));
      AV41TFMetCod_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFMetCod_To", GXutil.str( AV41TFMetCod_To, 1, 0));
      AV42TFMetDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMetDsc", AV42TFMetDsc);
      AV43TFMetDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMetDsc_Sel", AV43TFMetDsc_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV28Session.getValue(AV66Pgmname+"GridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV66Pgmname+"GridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV28Session.getValue(AV66Pgmname+"GridState"), null, null);
      }
      AV18OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
      AV19OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedDsc", AV19OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV16GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV16GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV16GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV67GXV1));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV21FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FilterFullText", AV21FilterFullText);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV32TFPrdNum = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrdNum", AV32TFPrdNum);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV33TFPrdNum_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrdNum_Sel", AV33TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV34TFPrdNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFPrdNom", AV34TFPrdNom);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV35TFPrdNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFPrdNom_Sel", AV35TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV36TFPrvNum = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFPrvNum), 6, 0));
            AV37TFPrvNum_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV38TFPrvNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrvNom", AV38TFPrvNom);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV39TFPrvNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrvNom_Sel", AV39TFPrvNom_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETCOD") == 0 )
         {
            AV40TFMetCod = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFMetCod", GXutil.str( AV40TFMetCod, 1, 0));
            AV41TFMetCod_To = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFMetCod_To", GXutil.str( AV41TFMetCod_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETDSC") == 0 )
         {
            AV42TFMetDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMetDsc", AV42TFMetDsc);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETDSC_SEL") == 0 )
         {
            AV43TFMetDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMetDsc_Sel", AV43TFMetDsc_Sel);
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFPrdNum_Sel)==0), AV33TFPrdNum_Sel, GXv_char4) ;
      recuentoinven_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFPrdNom_Sel)==0), AV35TFPrdNom_Sel, GXv_char3) ;
      recuentoinven_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFPrvNom_Sel)==0), AV39TFPrvNom_Sel, GXv_char2) ;
      recuentoinven_wc_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFMetDsc_Sel)==0), AV43TFMetDsc_Sel, GXv_char15) ;
      recuentoinven_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char12+"||"+GXt_char13+"||"+GXt_char14 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFPrdNum)==0), AV32TFPrdNum, GXv_char15) ;
      recuentoinven_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFPrdNom)==0), AV34TFPrdNom, GXv_char4) ;
      recuentoinven_wc_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFPrvNom)==0), AV38TFPrvNom, GXv_char3) ;
      recuentoinven_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFMetDsc)==0), AV42TFMetDsc, GXv_char2) ;
      recuentoinven_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char14+"|"+GXt_char13+"|"+((0==AV36TFPrvNum) ? "" : GXutil.str( AV36TFPrvNum, 6, 0))+"|"+GXt_char12+"|"+((0==AV40TFMetCod) ? "" : GXutil.str( AV40TFMetCod, 1, 0))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((0==AV37TFPrvNum_To) ? "" : GXutil.str( AV37TFPrvNum_To, 6, 0))+"||"+((0==AV41TFMetCod_To) ? "" : GXutil.str( AV41TFMetCod_To, 1, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV16GridState.fromxml(AV28Session.getValue(AV66Pgmname+"GridState"), null, null);
      AV16GridState.setgxTv_SdtWWPGridState_Orderedby( AV18OrderedBy );
      AV16GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV19OrderedDsc );
      AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV21FilterFullText)==0), (short)(0), AV21FilterFullText, "") ;
      AV16GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPRDNUM", "", !(GXutil.strcmp("", AV32TFPrdNum)==0), (short)(0), AV32TFPrdNum, "", !(GXutil.strcmp("", AV33TFPrdNum_Sel)==0), AV33TFPrdNum_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPRDNOM", "", !(GXutil.strcmp("", AV34TFPrdNom)==0), (short)(0), AV34TFPrdNom, "", !(GXutil.strcmp("", AV35TFPrdNom_Sel)==0), AV35TFPrdNom_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPRVNUM", "", !((0==AV36TFPrvNum)&&(0==AV37TFPrvNum_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFPrvNum, 6, 0)), GXutil.trim( GXutil.str( AV37TFPrvNum_To, 6, 0))) ;
      AV16GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPRVNOM", "", !(GXutil.strcmp("", AV38TFPrvNom)==0), (short)(0), AV38TFPrvNom, "", !(GXutil.strcmp("", AV39TFPrvNom_Sel)==0), AV39TFPrvNom_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFMETCOD", "", !((0==AV40TFMetCod)&&(0==AV41TFMetCod_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFMetCod, 1, 0)), GXutil.trim( GXutil.str( AV41TFMetCod_To, 1, 0))) ;
      AV16GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFMETDSC", "", !(GXutil.strcmp("", AV42TFMetDsc)==0), (short)(0), AV42TFMetDsc, "", !(GXutil.strcmp("", AV43TFMetDsc_Sel)==0), AV43TFMetDsc_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState16[0] ;
      AV16GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV16GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV66Pgmname+"GridState", AV16GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV14TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV66Pgmname );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV13HTTPRequest.getScriptName()+"?"+AV13HTTPRequest.getQuerystring() );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "StocksQuimicos.PRODUC" );
      AV28Session.setValue("TrnContext", AV14TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_1M12( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV29ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_32_1M12( true) ;
      }
      else
      {
         wb_table2_32_1M12( false) ;
      }
      return  ;
   }

   public void wb_table2_32_1M12e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_1M12e( true) ;
      }
      else
      {
         wb_table1_27_1M12e( false) ;
      }
   }

   public void wb_table2_32_1M12( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'" + sPrefix + "',false,'" + sGXsfl_45_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV21FilterFullText, GXutil.rtrim( localUtil.format( AV21FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_RecuentoInven_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_1M12e( true) ;
      }
      else
      {
         wb_table2_32_1M12e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      AV6PrdNumFrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNumFrom", AV6PrdNumFrom);
      AV7PrdNumTo = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdNumTo", AV7PrdNumTo);
      AV8PrvNumFrom = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrvNumFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8PrvNumFrom), 6, 0));
      AV9PrvNumTo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9PrvNumTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9PrvNumTo), 6, 0));
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
      pa1M12( ) ;
      ws1M12( ) ;
      we1M12( ) ;
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
      sCtrlAV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV6PrdNumFrom = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7PrdNumTo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8PrvNumFrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV9PrvNumTo = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1M12( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "recuentoinven_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1M12( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
         AV6PrdNumFrom = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNumFrom", AV6PrdNumFrom);
         AV7PrdNumTo = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdNumTo", AV7PrdNumTo);
         AV8PrvNumFrom = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrvNumFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8PrvNumFrom), 6, 0));
         AV9PrvNumTo = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9PrvNumTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9PrvNumTo), 6, 0));
      }
      wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
      wcpOAV6PrdNumFrom = httpContext.cgiGet( sPrefix+"wcpOAV6PrdNumFrom") ;
      wcpOAV7PrdNumTo = httpContext.cgiGet( sPrefix+"wcpOAV7PrdNumTo") ;
      wcpOAV8PrvNumFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8PrvNumFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV9PrvNumTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9PrvNumTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5EmprCod, wcpOAV5EmprCod) != 0 ) || ( GXutil.strcmp(AV6PrdNumFrom, wcpOAV6PrdNumFrom) != 0 ) || ( GXutil.strcmp(AV7PrdNumTo, wcpOAV7PrdNumTo) != 0 ) || ( AV8PrvNumFrom != wcpOAV8PrvNumFrom ) || ( AV9PrvNumTo != wcpOAV9PrvNumTo ) ) )
      {
         setjustcreated();
      }
      wcpOAV5EmprCod = AV5EmprCod ;
      wcpOAV6PrdNumFrom = AV6PrdNumFrom ;
      wcpOAV7PrdNumTo = AV7PrdNumTo ;
      wcpOAV8PrvNumFrom = AV8PrvNumFrom ;
      wcpOAV9PrvNumTo = AV9PrvNumTo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5EmprCod = httpContext.cgiGet( sPrefix+"AV5EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV5EmprCod) > 0 )
      {
         AV5EmprCod = httpContext.cgiGet( sCtrlAV5EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      }
      else
      {
         AV5EmprCod = httpContext.cgiGet( sPrefix+"AV5EmprCod_PARM") ;
      }
      sCtrlAV6PrdNumFrom = httpContext.cgiGet( sPrefix+"AV6PrdNumFrom_CTRL") ;
      if ( GXutil.len( sCtrlAV6PrdNumFrom) > 0 )
      {
         AV6PrdNumFrom = httpContext.cgiGet( sCtrlAV6PrdNumFrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PrdNumFrom", AV6PrdNumFrom);
      }
      else
      {
         AV6PrdNumFrom = httpContext.cgiGet( sPrefix+"AV6PrdNumFrom_PARM") ;
      }
      sCtrlAV7PrdNumTo = httpContext.cgiGet( sPrefix+"AV7PrdNumTo_CTRL") ;
      if ( GXutil.len( sCtrlAV7PrdNumTo) > 0 )
      {
         AV7PrdNumTo = httpContext.cgiGet( sCtrlAV7PrdNumTo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdNumTo", AV7PrdNumTo);
      }
      else
      {
         AV7PrdNumTo = httpContext.cgiGet( sPrefix+"AV7PrdNumTo_PARM") ;
      }
      sCtrlAV8PrvNumFrom = httpContext.cgiGet( sPrefix+"AV8PrvNumFrom_CTRL") ;
      if ( GXutil.len( sCtrlAV8PrvNumFrom) > 0 )
      {
         AV8PrvNumFrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8PrvNumFrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrvNumFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8PrvNumFrom), 6, 0));
      }
      else
      {
         AV8PrvNumFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8PrvNumFrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV9PrvNumTo = httpContext.cgiGet( sPrefix+"AV9PrvNumTo_CTRL") ;
      if ( GXutil.len( sCtrlAV9PrvNumTo) > 0 )
      {
         AV9PrvNumTo = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9PrvNumTo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9PrvNumTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9PrvNumTo), 6, 0));
      }
      else
      {
         AV9PrvNumTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9PrvNumTo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1M12( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1M12( ) ;
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
      ws1M12( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EmprCod_PARM", GXutil.rtrim( AV5EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EmprCod_CTRL", GXutil.rtrim( sCtrlAV5EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6PrdNumFrom_PARM", GXutil.rtrim( AV6PrdNumFrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6PrdNumFrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6PrdNumFrom_CTRL", GXutil.rtrim( sCtrlAV6PrdNumFrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7PrdNumTo_PARM", GXutil.rtrim( AV7PrdNumTo));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7PrdNumTo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7PrdNumTo_CTRL", GXutil.rtrim( sCtrlAV7PrdNumTo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8PrvNumFrom_PARM", GXutil.ltrim( localUtil.ntoc( AV8PrvNumFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8PrvNumFrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8PrvNumFrom_CTRL", GXutil.rtrim( sCtrlAV8PrvNumFrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9PrvNumTo_PARM", GXutil.ltrim( localUtil.ntoc( AV9PrvNumTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9PrvNumTo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9PrvNumTo_CTRL", GXutil.rtrim( sCtrlAV9PrvNumTo));
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
      we1M12( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211675815", true, true);
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
      httpContext.AddJavascriptSource("recuentoinven_wc.js", "?20268211675815", false, true);
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
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_452( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_45_idx ;
      edtEmprNom_Internalname = sPrefix+"EMPRNOM_"+sGXsfl_45_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_45_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_45_idx ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM_"+sGXsfl_45_idx ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM_"+sGXsfl_45_idx ;
      edtMetCod_Internalname = sPrefix+"METCOD_"+sGXsfl_45_idx ;
      edtMetDsc_Internalname = sPrefix+"METDSC_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_45_fel_idx ;
      edtEmprNom_Internalname = sPrefix+"EMPRNOM_"+sGXsfl_45_fel_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_45_fel_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_45_fel_idx ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM_"+sGXsfl_45_fel_idx ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM_"+sGXsfl_45_fel_idx ;
      edtMetCod_Internalname = sPrefix+"METCOD_"+sGXsfl_45_fel_idx ;
      edtMetDsc_Internalname = sPrefix+"METDSC_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb1M10( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_45_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_45_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_45_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtPrdNom_Link,"","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNum_Internalname,GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNom_Internalname,GXutil.rtrim( A794PrvNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMetCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetCod_Internalname,GXutil.ltrim( localUtil.ntoc( A629MetCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A629MetCod), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMetCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMetDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetDsc_Internalname,GXutil.rtrim( A630MetDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtMetDsc_Link,"","","",edtMetDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMetDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1M12( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      /* End function sendrow_452 */
   }

   public void startgridcontrol45( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"45\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Metodo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Metodo", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtPrdNom_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A794PrvNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A629MetCod, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A630MetDsc));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtMetDsc_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetDsc_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtninsert_Internalname = sPrefix+"BTNINSERT" ;
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportreport_Internalname = sPrefix+"BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtEmprNom_Internalname = sPrefix+"EMPRNOM" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM" ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM" ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM" ;
      edtMetCod_Internalname = sPrefix+"METCOD" ;
      edtMetDsc_Internalname = sPrefix+"METDSC" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
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
      edtMetDsc_Jsonclick = "" ;
      edtMetDsc_Link = "" ;
      edtMetCod_Jsonclick = "" ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNum_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Link = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtMetDsc_Visible = -1 ;
      edtMetCod_Visible = -1 ;
      edtPrvNom_Visible = -1 ;
      edtPrvNum_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "RecuentoInven_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T||T||T" ;
      Ddo_grid_Filterisrange = "||T||T|" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Character|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6" ;
      Ddo_grid_Columnids = "2:PrdNum|3:PrdNom|4:PrvNum|5:PrvNom|6:MetCod|7:MetDsc" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV7PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV8PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV9PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'sPrefix'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV40TFMetCod',fld:'vTFMETCOD',pic:'9'},{av:'AV41TFMetCod_To',fld:'vTFMETCOD_TO',pic:'9'},{av:'AV42TFMetDsc',fld:'vTFMETDSC',pic:''},{av:'AV43TFMetDsc_Sel',fld:'vTFMETDSC_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtMetCod_Visible',ctrl:'METCOD',prop:'Visible'},{av:'edtMetDsc_Visible',ctrl:'METDSC',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121M12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV7PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV8PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV9PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV40TFMetCod',fld:'vTFMETCOD',pic:'9'},{av:'AV41TFMetCod_To',fld:'vTFMETCOD_TO',pic:'9'},{av:'AV42TFMetDsc',fld:'vTFMETDSC',pic:''},{av:'AV43TFMetDsc_Sel',fld:'vTFMETDSC_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131M12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV7PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV8PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV9PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV40TFMetCod',fld:'vTFMETCOD',pic:'9'},{av:'AV41TFMetCod_To',fld:'vTFMETCOD_TO',pic:'9'},{av:'AV42TFMetDsc',fld:'vTFMETDSC',pic:''},{av:'AV43TFMetDsc_Sel',fld:'vTFMETDSC_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141M12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV7PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV8PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV9PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV40TFMetCod',fld:'vTFMETCOD',pic:'9'},{av:'AV41TFMetCod_To',fld:'vTFMETCOD_TO',pic:'9'},{av:'AV42TFMetDsc',fld:'vTFMETDSC',pic:''},{av:'AV43TFMetDsc_Sel',fld:'vTFMETDSC_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV42TFMetDsc',fld:'vTFMETDSC',pic:''},{av:'AV43TFMetDsc_Sel',fld:'vTFMETDSC_SEL',pic:''},{av:'AV40TFMetCod',fld:'vTFMETCOD',pic:'9'},{av:'AV41TFMetCod_To',fld:'vTFMETCOD_TO',pic:'9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e221M12',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'A629MetCod',fld:'METCOD',pic:'9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'edtPrdNom_Link',ctrl:'PRDNOM',prop:'Link'},{av:'edtMetDsc_Link',ctrl:'METDSC',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151M12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV7PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV8PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV9PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV40TFMetCod',fld:'vTFMETCOD',pic:'9'},{av:'AV41TFMetCod_To',fld:'vTFMETCOD_TO',pic:'9'},{av:'AV42TFMetDsc',fld:'vTFMETDSC',pic:''},{av:'AV43TFMetDsc_Sel',fld:'vTFMETDSC_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtMetCod_Visible',ctrl:'METCOD',prop:'Visible'},{av:'edtMetDsc_Visible',ctrl:'METDSC',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111M12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV7PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV8PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV9PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV40TFMetCod',fld:'vTFMETCOD',pic:'9'},{av:'AV41TFMetCod_To',fld:'vTFMETCOD_TO',pic:'9'},{av:'AV42TFMetDsc',fld:'vTFMETDSC',pic:''},{av:'AV43TFMetDsc_Sel',fld:'vTFMETDSC_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV40TFMetCod',fld:'vTFMETCOD',pic:'9'},{av:'AV41TFMetCod_To',fld:'vTFMETCOD_TO',pic:'9'},{av:'AV42TFMetDsc',fld:'vTFMETDSC',pic:''},{av:'AV43TFMetDsc_Sel',fld:'vTFMETDSC_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtMetCod_Visible',ctrl:'METCOD',prop:'Visible'},{av:'edtMetDsc_Visible',ctrl:'METDSC',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e161M12',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e171M12',iparms:[{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV43TFMetDsc_Sel',fld:'vTFMETDSC_SEL',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV40TFMetCod',fld:'vTFMETCOD',pic:'9'},{av:'AV42TFMetDsc',fld:'vTFMETDSC',pic:''},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV41TFMetCod_To',fld:'vTFMETCOD_TO',pic:'9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV7PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV8PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV9PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV40TFMetCod',fld:'vTFMETCOD',pic:'9'},{av:'AV41TFMetCod_To',fld:'vTFMETCOD_TO',pic:'9'},{av:'AV42TFMetDsc',fld:'vTFMETDSC',pic:''},{av:'AV43TFMetDsc_Sel',fld:'vTFMETDSC_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e181M12',iparms:[{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV43TFMetDsc_Sel',fld:'vTFMETDSC_SEL',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV40TFMetCod',fld:'vTFMETCOD',pic:'9'},{av:'AV42TFMetDsc',fld:'vTFMETDSC',pic:''},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV41TFMetCod_To',fld:'vTFMETCOD_TO',pic:'9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV7PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV8PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV9PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV40TFMetCod',fld:'vTFMETCOD',pic:'9'},{av:'AV41TFMetCod_To',fld:'vTFMETCOD_TO',pic:'9'},{av:'AV42TFMetDsc',fld:'vTFMETDSC',pic:''},{av:'AV43TFMetDsc_Sel',fld:'vTFMETDSC_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e191M12',iparms:[{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV43TFMetDsc_Sel',fld:'vTFMETDSC_SEL',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV40TFMetCod',fld:'vTFMETCOD',pic:'9'},{av:'AV42TFMetDsc',fld:'vTFMETDSC',pic:''},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV41TFMetCod_To',fld:'vTFMETCOD_TO',pic:'9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNumFrom',fld:'vPRDNUMFROM',pic:''},{av:'AV7PrdNumTo',fld:'vPRDNUMTO',pic:''},{av:'AV8PrvNumFrom',fld:'vPRVNUMFROM',pic:'ZZZZZ9'},{av:'AV9PrvNumTo',fld:'vPRVNUMTO',pic:'ZZZZZ9'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV40TFMetCod',fld:'vTFMETCOD',pic:'9'},{av:'AV41TFMetCod_To',fld:'vTFMETCOD_TO',pic:'9'},{av:'AV42TFMetDsc',fld:'vTFMETDSC',pic:''},{av:'AV43TFMetDsc_Sel',fld:'vTFMETDSC_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[]");
      setEventMetadata("VALID_PRVNUM",",oparms:[]}");
      setEventMetadata("VALID_METCOD","{handler:'valid_Metcod',iparms:[]");
      setEventMetadata("VALID_METCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Metdsc',iparms:[]");
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
      wcpOAV5EmprCod = "" ;
      wcpOAV6PrdNumFrom = "" ;
      wcpOAV7PrdNumTo = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5EmprCod = "" ;
      AV6PrdNumFrom = "" ;
      AV7PrdNumTo = "" ;
      AV21FilterFullText = "" ;
      AV26ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV32TFPrdNum = "" ;
      AV33TFPrdNum_Sel = "" ;
      AV34TFPrdNom = "" ;
      AV35TFPrdNom_Sel = "" ;
      AV38TFPrvNom = "" ;
      AV39TFPrvNom_Sel = "" ;
      AV42TFMetDsc = "" ;
      AV43TFMetDsc_Sel = "" ;
      AV66Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV29ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV44DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsert_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A794PrvNom = "" ;
      A630MetDsc = "" ;
      scmdbuf = "" ;
      lV53Recuentoinven_wcds_1_filterfulltext = "" ;
      lV54Recuentoinven_wcds_2_tfprdnum = "" ;
      lV56Recuentoinven_wcds_4_tfprdnom = "" ;
      lV60Recuentoinven_wcds_8_tfprvnom = "" ;
      lV64Recuentoinven_wcds_12_tfmetdsc = "" ;
      AV53Recuentoinven_wcds_1_filterfulltext = "" ;
      AV55Recuentoinven_wcds_3_tfprdnum_sel = "" ;
      AV54Recuentoinven_wcds_2_tfprdnum = "" ;
      AV57Recuentoinven_wcds_5_tfprdnom_sel = "" ;
      AV56Recuentoinven_wcds_4_tfprdnom = "" ;
      AV61Recuentoinven_wcds_9_tfprvnom_sel = "" ;
      AV60Recuentoinven_wcds_8_tfprvnom = "" ;
      AV65Recuentoinven_wcds_13_tfmetdsc_sel = "" ;
      AV64Recuentoinven_wcds_12_tfmetdsc = "" ;
      H01M12_A630MetDsc = new String[] {""} ;
      H01M12_n630MetDsc = new boolean[] {false} ;
      H01M12_A629MetCod = new byte[1] ;
      H01M12_n629MetCod = new boolean[] {false} ;
      H01M12_A794PrvNom = new String[] {""} ;
      H01M12_n794PrvNom = new boolean[] {false} ;
      H01M12_A795PrvNum = new int[1] ;
      H01M12_A718PrdNom = new String[] {""} ;
      H01M12_A719PrdNum = new String[] {""} ;
      H01M12_A407EmprNom = new String[] {""} ;
      H01M12_n407EmprNom = new boolean[] {false} ;
      H01M12_A396EmprCod = new String[] {""} ;
      H01M13_AGRID_nRecordCount = new long[1] ;
      AV50Station = "" ;
      AV51Emprnom = "" ;
      AV52Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV12WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV28Session = httpContext.getWebSession();
      AV24ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV30ManageFiltersXml = "" ;
      AV22ExcelFilename = "" ;
      AV23ErrorMessage = "" ;
      AV25UserCustomValue = "" ;
      AV27ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5EmprCod = "" ;
      sCtrlAV6PrdNumFrom = "" ;
      sCtrlAV7PrdNumTo = "" ;
      sCtrlAV8PrvNumFrom = "" ;
      sCtrlAV9PrvNumTo = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recuentoinven_wc__default(),
         new Object[] {
             new Object[] {
            H01M12_A630MetDsc, H01M12_n630MetDsc, H01M12_A629MetCod, H01M12_n629MetCod, H01M12_A794PrvNom, H01M12_n794PrvNom, H01M12_A795PrvNum, H01M12_A718PrdNom, H01M12_A719PrdNum, H01M12_A407EmprNom,
            H01M12_n407EmprNom, H01M12_A396EmprCod
            }
            , new Object[] {
            H01M13_AGRID_nRecordCount
            }
         }
      );
      AV66Pgmname = "RecuentoInven_WC" ;
      /* GeneXus formulas. */
      AV66Pgmname = "RecuentoInven_WC" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV31ManageFiltersExecutionStep ;
   private byte AV40TFMetCod ;
   private byte AV41TFMetCod_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A629MetCod ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV62Recuentoinven_wcds_10_tfmetcod ;
   private byte AV63Recuentoinven_wcds_11_tfmetcod_to ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV18OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV8PrvNumFrom ;
   private int wcpOAV9PrvNumTo ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int AV8PrvNumFrom ;
   private int AV9PrvNumTo ;
   private int nGXsfl_45_idx=1 ;
   private int AV36TFPrvNum ;
   private int AV37TFPrvNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A795PrvNum ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV58Recuentoinven_wcds_6_tfprvnum ;
   private int AV59Recuentoinven_wcds_7_tfprvnum_to ;
   private int edtPrdNum_Visible ;
   private int edtPrdNom_Visible ;
   private int edtPrvNum_Visible ;
   private int edtPrvNom_Visible ;
   private int edtMetCod_Visible ;
   private int edtMetDsc_Visible ;
   private int AV45PageToGo ;
   private int AV67GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV46GridCurrentPage ;
   private long AV47GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV6PrdNumFrom ;
   private String wcpOAV7PrdNumTo ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5EmprCod ;
   private String AV6PrdNumFrom ;
   private String AV7PrdNumTo ;
   private String sGXsfl_45_idx="0001" ;
   private String AV32TFPrdNum ;
   private String AV33TFPrdNum_Sel ;
   private String AV34TFPrdNom ;
   private String AV35TFPrdNom_Sel ;
   private String AV38TFPrvNom ;
   private String AV39TFPrvNom_Sel ;
   private String AV42TFMetDsc ;
   private String AV43TFMetDsc_Sel ;
   private String AV66Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
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
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
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
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtPrvNum_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Internalname ;
   private String edtMetCod_Internalname ;
   private String A630MetDsc ;
   private String edtMetDsc_Internalname ;
   private String scmdbuf ;
   private String lV54Recuentoinven_wcds_2_tfprdnum ;
   private String lV56Recuentoinven_wcds_4_tfprdnom ;
   private String lV60Recuentoinven_wcds_8_tfprvnom ;
   private String lV64Recuentoinven_wcds_12_tfmetdsc ;
   private String AV55Recuentoinven_wcds_3_tfprdnum_sel ;
   private String AV54Recuentoinven_wcds_2_tfprdnum ;
   private String AV57Recuentoinven_wcds_5_tfprdnom_sel ;
   private String AV56Recuentoinven_wcds_4_tfprdnom ;
   private String AV61Recuentoinven_wcds_9_tfprvnom_sel ;
   private String AV60Recuentoinven_wcds_8_tfprvnom ;
   private String AV65Recuentoinven_wcds_13_tfmetdsc_sel ;
   private String AV64Recuentoinven_wcds_12_tfmetdsc ;
   private String AV50Station ;
   private String AV51Emprnom ;
   private String AV52Usurcod ;
   private String edtPrdNom_Link ;
   private String edtMetDsc_Link ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV5EmprCod ;
   private String sCtrlAV6PrdNumFrom ;
   private String sCtrlAV7PrdNumTo ;
   private String sCtrlAV8PrvNumFrom ;
   private String sCtrlAV9PrvNumTo ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrvNom_Jsonclick ;
   private String edtMetCod_Jsonclick ;
   private String edtMetDsc_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV19OrderedDsc ;
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
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n794PrvNom ;
   private boolean n629MetCod ;
   private boolean n630MetDsc ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV24ColumnsSelectorXML ;
   private String AV30ManageFiltersXml ;
   private String AV25UserCustomValue ;
   private String AV21FilterFullText ;
   private String lV53Recuentoinven_wcds_1_filterfulltext ;
   private String AV53Recuentoinven_wcds_1_filterfulltext ;
   private String AV22ExcelFilename ;
   private String AV23ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV13HTTPRequest ;
   private com.genexus.webpanels.WebSession AV28Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H01M12_A630MetDsc ;
   private boolean[] H01M12_n630MetDsc ;
   private byte[] H01M12_A629MetCod ;
   private boolean[] H01M12_n629MetCod ;
   private String[] H01M12_A794PrvNom ;
   private boolean[] H01M12_n794PrvNom ;
   private int[] H01M12_A795PrvNum ;
   private String[] H01M12_A718PrdNom ;
   private String[] H01M12_A719PrdNum ;
   private String[] H01M12_A407EmprNom ;
   private boolean[] H01M12_n407EmprNom ;
   private String[] H01M12_A396EmprCod ;
   private long[] H01M13_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV29ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV12WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV44DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class recuentoinven_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01M12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Recuentoinven_wcds_1_filterfulltext ,
                                          String AV55Recuentoinven_wcds_3_tfprdnum_sel ,
                                          String AV54Recuentoinven_wcds_2_tfprdnum ,
                                          String AV57Recuentoinven_wcds_5_tfprdnom_sel ,
                                          String AV56Recuentoinven_wcds_4_tfprdnom ,
                                          int AV58Recuentoinven_wcds_6_tfprvnum ,
                                          int AV59Recuentoinven_wcds_7_tfprvnum_to ,
                                          String AV61Recuentoinven_wcds_9_tfprvnom_sel ,
                                          String AV60Recuentoinven_wcds_8_tfprvnom ,
                                          byte AV62Recuentoinven_wcds_10_tfmetcod ,
                                          byte AV63Recuentoinven_wcds_11_tfmetcod_to ,
                                          String AV65Recuentoinven_wcds_13_tfmetdsc_sel ,
                                          String AV64Recuentoinven_wcds_12_tfmetdsc ,
                                          String AV5EmprCod ,
                                          String AV6PrdNumFrom ,
                                          String AV7PrdNumTo ,
                                          int AV8PrvNumFrom ,
                                          int AV9PrvNumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          byte A629MetCod ,
                                          String A630MetDsc ,
                                          String A396EmprCod ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[28];
      Object[] GXv_Object18 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T3.MetDsc, T1.MetCod, T4.PrvNom, T1.PrvNum, T1.PrdNom, T1.PrdNum, T2.EmprNom, T1.EmprCod" ;
      sFromString = " FROM (((TXPPRODUC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPMETPED T3 ON T3.EmprCod = T1.EmprCod AND T3.MetCod = T1.MetCod) INNER JOIN" ;
      sFromString += " TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.PrvNum)" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV53Recuentoinven_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T4.PrvNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetCod,'90'), 2) like '%' || ?) or ( UPPER(T3.MetDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
         GXv_int17[1] = (byte)(1) ;
         GXv_int17[2] = (byte)(1) ;
         GXv_int17[3] = (byte)(1) ;
         GXv_int17[4] = (byte)(1) ;
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Recuentoinven_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV54Recuentoinven_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Recuentoinven_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Recuentoinven_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Recuentoinven_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Recuentoinven_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (0==AV58Recuentoinven_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (0==AV59Recuentoinven_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Recuentoinven_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Recuentoinven_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Recuentoinven_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrvNom = ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (0==AV62Recuentoinven_wcds_10_tfmetcod) )
      {
         addWhere(sWhereString, "(T1.MetCod >= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV63Recuentoinven_wcds_11_tfmetcod_to) )
      {
         addWhere(sWhereString, "(T1.MetCod <= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Recuentoinven_wcds_13_tfmetdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Recuentoinven_wcds_12_tfmetdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MetDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Recuentoinven_wcds_13_tfmetdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MetDsc = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV5EmprCod)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV6PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV7PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV8PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (0==AV9PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ( AV18OrderedBy == 1 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV18OrderedBy == 1 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T4.PrvNom" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T4.PrvNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MetCod" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MetCod DESC" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         sOrderString += " ORDER BY T3.MetDsc" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.MetDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H01M13( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Recuentoinven_wcds_1_filterfulltext ,
                                          String AV55Recuentoinven_wcds_3_tfprdnum_sel ,
                                          String AV54Recuentoinven_wcds_2_tfprdnum ,
                                          String AV57Recuentoinven_wcds_5_tfprdnom_sel ,
                                          String AV56Recuentoinven_wcds_4_tfprdnom ,
                                          int AV58Recuentoinven_wcds_6_tfprvnum ,
                                          int AV59Recuentoinven_wcds_7_tfprvnum_to ,
                                          String AV61Recuentoinven_wcds_9_tfprvnom_sel ,
                                          String AV60Recuentoinven_wcds_8_tfprvnom ,
                                          byte AV62Recuentoinven_wcds_10_tfmetcod ,
                                          byte AV63Recuentoinven_wcds_11_tfmetcod_to ,
                                          String AV65Recuentoinven_wcds_13_tfmetdsc_sel ,
                                          String AV64Recuentoinven_wcds_12_tfmetdsc ,
                                          String AV5EmprCod ,
                                          String AV6PrdNumFrom ,
                                          String AV7PrdNumTo ,
                                          int AV8PrvNumFrom ,
                                          int AV9PrvNumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          byte A629MetCod ,
                                          String A630MetDsc ,
                                          String A396EmprCod ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[23];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((TXPPRODUC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPMETPED T3 ON T3.EmprCod = T1.EmprCod AND T3.MetCod = T1.MetCod)" ;
      scmdbuf += " INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.PrvNum)" ;
      if ( ! (GXutil.strcmp("", AV53Recuentoinven_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T4.PrvNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetCod,'90'), 2) like '%' || ?) or ( UPPER(T3.MetDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int19[0] = (byte)(1) ;
         GXv_int19[1] = (byte)(1) ;
         GXv_int19[2] = (byte)(1) ;
         GXv_int19[3] = (byte)(1) ;
         GXv_int19[4] = (byte)(1) ;
         GXv_int19[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Recuentoinven_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV54Recuentoinven_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Recuentoinven_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Recuentoinven_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Recuentoinven_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Recuentoinven_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (0==AV58Recuentoinven_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (0==AV59Recuentoinven_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Recuentoinven_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV60Recuentoinven_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Recuentoinven_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrvNom = ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (0==AV62Recuentoinven_wcds_10_tfmetcod) )
      {
         addWhere(sWhereString, "(T1.MetCod >= ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (0==AV63Recuentoinven_wcds_11_tfmetcod_to) )
      {
         addWhere(sWhereString, "(T1.MetCod <= ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Recuentoinven_wcds_13_tfmetdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Recuentoinven_wcds_12_tfmetdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MetDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Recuentoinven_wcds_13_tfmetdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MetDsc = ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV5EmprCod)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV6PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV7PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (0==AV8PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (0==AV9PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV18OrderedBy == 1 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 1 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
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
                  return conditional_H01M12(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() );
            case 1 :
                  return conditional_H01M13(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01M12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((String[]) buf[7])[0] = rslt.getString(5, 26);
               ((String[]) buf[8])[0] = rslt.getString(6, 6);
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               return;
      }
   }

}

