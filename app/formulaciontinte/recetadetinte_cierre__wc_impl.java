package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetadetinte_cierre__wc_impl extends GXWebComponent
{
   public recetadetinte_cierre__wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetadetinte_cierre__wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte_cierre__wc_impl.class ));
   }

   public recetadetinte_cierre__wc_impl( int remoteHandle ,
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
      cmbavGrupodeacciones = new HTMLChoice();
      chkavRecetadetinte_cierre_sdt__seleccionar = UIFactory.getCheckbox(this);
      cmbavRecetadetinte_cierre_sdt__pesado = new HTMLChoice();
      cmbavRecetadetinte_cierre_sdt__adicion = new HTMLChoice();
      cmbavRecetadetinte_cierre_sdt__recnropar = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "EmprcodIN") ;
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
               AV73EmprcodIN = httpContext.GetPar( "EmprcodIN") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73EmprcodIN", AV73EmprcodIN);
               AV41BarcodIN = (int)(GXutil.lval( httpContext.GetPar( "BarcodIN"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41BarcodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarcodIN), 8, 0));
               AV43BarcodreoIN = (byte)(GXutil.lval( httpContext.GetPar( "BarcodreoIN"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43BarcodreoIN", GXutil.str( AV43BarcodreoIN, 1, 0));
               AV42BarcodparIN = httpContext.GetPar( "BarcodparIN") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarcodparIN", AV42BarcodparIN);
               AV37FechaCierre = localUtil.parseDateParm( httpContext.GetPar( "FechaCierre")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37FechaCierre", localUtil.format(AV37FechaCierre, "99/99/99"));
               AV33RecAcab = httpContext.GetPar( "RecAcab") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33RecAcab", AV33RecAcab);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV73EmprcodIN,Integer.valueOf(AV41BarcodIN),Byte.valueOf(AV43BarcodreoIN),AV42BarcodparIN,AV37FechaCierre,AV33RecAcab});
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
               gxfirstwebparm = httpContext.GetFirstPar( "EmprcodIN") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "EmprcodIN") ;
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
      nRC_GXsfl_68 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_68"))) ;
      nGXsfl_68_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_68_idx"))) ;
      sGXsfl_68_idx = httpContext.GetPar( "sGXsfl_68_idx") ;
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
      AV23ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV18ColumnsSelector);
      AV111Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV73EmprcodIN = httpContext.GetPar( "EmprcodIN") ;
      AV41BarcodIN = (int)(GXutil.lval( httpContext.GetPar( "BarcodIN"))) ;
      AV43BarcodreoIN = (byte)(GXutil.lval( httpContext.GetPar( "BarcodreoIN"))) ;
      AV42BarcodparIN = httpContext.GetPar( "BarcodparIN") ;
      AV37FechaCierre = localUtil.parseDateParm( httpContext.GetPar( "FechaCierre")) ;
      AV33RecAcab = httpContext.GetPar( "RecAcab") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV13RecetadeTinte_Cierre_SDT);
      AV51colorservicecontador = (short)(GXutil.lval( httpContext.GetPar( "colorservicecontador"))) ;
      AV49clienteModa21 = (short)(GXutil.lval( httpContext.GetPar( "clienteModa21"))) ;
      AV74SiCSV = (short)(GXutil.lval( httpContext.GetPar( "SiCSV"))) ;
      AV38RecetadeTinte_Cierre_SDT_json = httpContext.GetPar( "RecetadeTinte_Cierre_SDT_json") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV111Pgmname, AV12FilterFullText, AV73EmprcodIN, AV41BarcodIN, AV43BarcodreoIN, AV42BarcodparIN, AV37FechaCierre, AV33RecAcab, AV13RecetadeTinte_Cierre_SDT, AV51colorservicecontador, AV49clienteModa21, AV74SiCSV, AV38RecetadeTinte_Cierre_SDT_json, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa28U2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Receta de Tinte Cierre ", "")) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.recetadetinte_cierre__wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV73EmprcodIN)),GXutil.URLEncode(GXutil.ltrimstr(AV41BarcodIN,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV43BarcodreoIN,1,0)),GXutil.URLEncode(GXutil.rtrim(AV42BarcodparIN)),GXutil.URLEncode(GXutil.formatDateParm(AV37FechaCierre)),GXutil.URLEncode(GXutil.rtrim(AV33RecAcab))}, new String[] {"EmprcodIN","BarcodIN","BarcodreoIN","BarcodparIN","FechaCierre","RecAcab"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETADETINTE_CIERRE_SDT", getSecureSignedToken( sPrefix, AV13RecetadeTinte_Cierre_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICECONTADOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51colorservicecontador), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCLIENTEMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV49clienteModa21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSICSV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV74SiCSV), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETADETINTE_CIERRE_SDT_JSON", getSecureSignedToken( sPrefix, AV38RecetadeTinte_Cierre_SDT_json));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RecetadeTinte_Cierre__WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV111Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\recetadetinte_cierre__wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Recetadetinte_cierre_sdt", AV13RecetadeTinte_Cierre_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Recetadetinte_cierre_sdt", AV13RecetadeTinte_Cierre_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Recetadetinte_cierre_sdt", getSecureSignedToken( sPrefix, AV13RecetadeTinte_Cierre_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_68", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_68, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV26GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV27GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV73EmprcodIN", GXutil.rtrim( wcpOAV73EmprcodIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV41BarcodIN", GXutil.ltrim( localUtil.ntoc( wcpOAV41BarcodIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV43BarcodreoIN", GXutil.ltrim( localUtil.ntoc( wcpOAV43BarcodreoIN, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42BarcodparIN", GXutil.rtrim( wcpOAV42BarcodparIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37FechaCierre", localUtil.dtoc( wcpOAV37FechaCierre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33RecAcab", GXutil.rtrim( wcpOAV33RecAcab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV23ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCODIN", GXutil.rtrim( AV73EmprcodIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODIN", GXutil.ltrim( localUtil.ntoc( AV41BarcodIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREOIN", GXutil.ltrim( localUtil.ntoc( AV43BarcodreoIN, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPARIN", GXutil.rtrim( AV42BarcodparIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECACAB", GXutil.rtrim( AV33RecAcab));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vRECETADETINTE_CIERRE_SDT", AV13RecetadeTinte_Cierre_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vRECETADETINTE_CIERRE_SDT", AV13RecetadeTinte_Cierre_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETADETINTE_CIERRE_SDT", getSecureSignedToken( sPrefix, AV13RecetadeTinte_Cierre_SDT));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOLORSERVICECONTADOR", GXutil.ltrim( localUtil.ntoc( AV51colorservicecontador, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICECONTADOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51colorservicecontador), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV29Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIENTEMODA21", GXutil.ltrim( localUtil.ntoc( AV49clienteModa21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCLIENTEMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV49clienteModa21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECHAYANY", GXutil.rtrim( AV77RecHayAny));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV36UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV34Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECCIETIN", localUtil.dtoc( AV55FecCieTin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV52Consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCC_ALMCOD", GXutil.ltrim( localUtil.ntoc( AV48Cc_almcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGM", GXutil.ltrim( localUtil.ntoc( AV56FlagM, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECFEC", localUtil.dtoc( AV65Recfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRODUCTOSCONSUMOS", AV62productosconsumos);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vJ", GXutil.ltrim( localUtil.ntoc( AV59j, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSICSV", GXutil.ltrim( localUtil.ntoc( AV74SiCSV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSICSV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV74SiCSV), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECETADETINTE_CIERRE_SDT_JSON", AV38RecetadeTinte_Cierre_SDT_json);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETADETINTE_CIERRE_SDT_JSON", getSecureSignedToken( sPrefix, AV38RecetadeTinte_Cierre_SDT_json));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Title", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Result", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Result", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
   }

   public void renderHtmlCloseForm28U2( )
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
      return "FormulacionTinte.RecetadeTinte_Cierre__WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Receta de Tinte Cierre ", "") ;
   }

   public void wb28U0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.recetadetinte_cierre__wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
            httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 68, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\RecetadeTinte_Cierre__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 68, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\RecetadeTinte_Cierre__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 68, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\RecetadeTinte_Cierre__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablefechacierre_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfechacierre_Internalname, httpContext.getMessage( "Fecha Cierre", ""), "", "", lblTextblockfechacierre_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\RecetadeTinte_Cierre__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechacierre_Internalname, httpContext.getMessage( "Fecha Cierre", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavFechacierre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechacierre_Internalname, localUtil.format(AV37FechaCierre, "99/99/99"), localUtil.format( AV37FechaCierre, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechacierre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechacierre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\RecetadeTinte_Cierre__WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechacierre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechacierre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\RecetadeTinte_Cierre__WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablenumeroregistros_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocknumeroregistros_Internalname, httpContext.getMessage( "Registros", ""), "", "", lblTextblocknumeroregistros_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\RecetadeTinte_Cierre__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavNumeroregistros_Internalname, httpContext.getMessage( "Numeroregistros", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'" + sPrefix + "',false,'" + sGXsfl_68_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNumeroregistros_Internalname, GXutil.ltrim( localUtil.ntoc( AV61Numeroregistros, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavNumeroregistros_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV61Numeroregistros), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV61Numeroregistros), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNumeroregistros_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavNumeroregistros_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\RecetadeTinte_Cierre__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_39_28U2( true) ;
      }
      else
      {
         wb_table1_39_28U2( false) ;
      }
      return  ;
   }

   public void wb_table1_39_28U2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, sPrefix+"BARRADEPROGRESOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 68, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1128u1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\RecetadeTinte_Cierre__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCellCellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol68( ) ;
      }
      if ( wbEnd == 68 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_68 = (int)(nGXsfl_68_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV83GXV1 = nGXsfl_68_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV26GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV27GridPageCount);
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0103"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0103"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_68_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0103"+"");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV111Pgmname), GXutil.rtrim( localUtil.format( AV111Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\RecetadeTinte_Cierre__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, sPrefix+"DATAMONJSContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV18ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_116_28U2( true) ;
      }
      else
      {
         wb_table2_116_28U2( false) ;
      }
      return  ;
   }

   public void wb_table2_116_28U2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_121_28U2( true) ;
      }
      else
      {
         wb_table3_121_28U2( false) ;
      }
      return  ;
   }

   public void wb_table3_121_28U2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 68 )
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
               AV83GXV1 = nGXsfl_68_idx ;
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

   public void start28U2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Receta de Tinte Cierre ", ""), (short)(0)) ;
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
            strup28U0( ) ;
         }
      }
   }

   public void ws28U2( )
   {
      start28U2( ) ;
      evt28U2( ) ;
   }

   public void evt28U2( )
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
                              strup28U0( ) ;
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
                              strup28U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1228U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1328U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1428U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1528U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1628U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1728U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1828U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1928U2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28U0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 25), "VDETAILWEBCOMPONENT.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 43), "RECETADETINTE_CIERRE_SDT__INCIDENCIAS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 41), "RECETADETINTE_CIERRE_SDT__BARAGREST.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 43), "RECETADETINTE_CIERRE_SDT__SELECCIONAR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 43), "RECETADETINTE_CIERRE_SDT__SELECCIONAR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 43), "RECETADETINTE_CIERRE_SDT__INCIDENCIAS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 25), "VDETAILWEBCOMPONENT.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 41), "RECETADETINTE_CIERRE_SDT__BARAGREST.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28U0( ) ;
                           }
                           nGXsfl_68_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_682( ) ;
                           AV83GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) && ( AV83GXV1 > 0 ) )
                           {
                              AV13RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)) );
                              cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
                              cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
                              AV57grupodeacciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57grupodeacciones), 4, 0));
                              AV54DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV54DetailWebComponent);
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e2028U2 ();
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e2128U2 ();
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
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2228U2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRUPODEACCIONES.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2328U2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VDETAILWEBCOMPONENT.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2428U2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "RECETADETINTE_CIERRE_SDT__INCIDENCIAS.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2528U2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "RECETADETINTE_CIERRE_SDT__BARAGREST.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2628U2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "RECETADETINTE_CIERRE_SDT__SELECCIONAR.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2728U2 ();
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
                                    strup28U0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
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
                     if ( nCmpId == 103 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0103") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0103", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we28U2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm28U2( ) ;
         }
      }
   }

   public void pa28U2( )
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
            GX_FocusControl = edtavNumeroregistros_Internalname ;
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
      subsflControlProps_682( ) ;
      while ( nGXsfl_68_idx <= nRC_GXsfl_68 )
      {
         sendrow_682( ) ;
         nGXsfl_68_idx = ((subGrid_Islastpage==1)&&(nGXsfl_68_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_68_idx+1) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_682( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV23ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV111Pgmname ,
                                 String AV12FilterFullText ,
                                 String AV73EmprcodIN ,
                                 int AV41BarcodIN ,
                                 byte AV43BarcodreoIN ,
                                 String AV42BarcodparIN ,
                                 java.util.Date AV37FechaCierre ,
                                 String AV33RecAcab ,
                                 GXBaseCollection<app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item> AV13RecetadeTinte_Cierre_SDT ,
                                 short AV51colorservicecontador ,
                                 short AV49clienteModa21 ,
                                 short AV74SiCSV ,
                                 String AV38RecetadeTinte_Cierre_SDT_json ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2128U2 ();
      GRID_nCurrentRecord = 0 ;
      rf28U2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RecetadeTinte_Cierre__WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV111Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\recetadetinte_cierre__wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf28U2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV111Pgmname = "FormulacionTinte.RecetadeTinte_Cierre__WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111Pgmname", AV111Pgmname);
      Gx_err = (short)(0) ;
      edtavFechacierre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFechacierre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFechacierre_Enabled), 5, 0), true);
      edtavNumeroregistros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNumeroregistros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNumeroregistros_Enabled), 5, 0), true);
      cmbavRecetadetinte_cierre_sdt__pesado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecetadetinte_cierre_sdt__pesado.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__pesado.getEnabled(), 5, 0), !bGXsfl_68_Refreshing);
      cmbavRecetadetinte_cierre_sdt__adicion.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecetadetinte_cierre_sdt__adicion.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__adicion.getEnabled(), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__incidencias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__incidencias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__incidencias_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__reclinmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barsit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barsit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barsit_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__baragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__baragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__baragrest_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barser_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barserdsc_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcolnum_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__bartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__bartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__bartipcol_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnomcli_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barnumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnumcli_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__maqcod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__rectotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__recvolprd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__recvolprd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__recvolprd_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__recfecalt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__recfecalt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__recfecalt_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnumany_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barnumany_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnumany_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__lconti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__lconti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__lconti_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__hisreh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__hisreh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__hisreh_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__batchcode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__batchcode_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__batchcode_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      cmbavRecetadetinte_cierre_sdt__recnropar.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecetadetinte_cierre_sdt__recnropar.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__recnropar.getEnabled(), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__weigprodid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__weigprodid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__weigprodid_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf28U2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(68) ;
      /* Execute user event: Refresh */
      e2128U2 ();
      nGXsfl_68_idx = 1 ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_682( ) ;
      bGXsfl_68_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_682( ) ;
         e2228U2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_68_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e2228U2 ();
         }
         wbEnd = (short)(68) ;
         wb28U0( ) ;
      }
      bGXsfl_68_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes28U2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vRECETADETINTE_CIERRE_SDT", AV13RecetadeTinte_Cierre_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vRECETADETINTE_CIERRE_SDT", AV13RecetadeTinte_Cierre_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETADETINTE_CIERRE_SDT", getSecureSignedToken( sPrefix, AV13RecetadeTinte_Cierre_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOLORSERVICECONTADOR", GXutil.ltrim( localUtil.ntoc( AV51colorservicecontador, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICECONTADOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51colorservicecontador), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIENTEMODA21", GXutil.ltrim( localUtil.ntoc( AV49clienteModa21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCLIENTEMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV49clienteModa21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSICSV", GXutil.ltrim( localUtil.ntoc( AV74SiCSV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSICSV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV74SiCSV), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECETADETINTE_CIERRE_SDT_JSON", AV38RecetadeTinte_Cierre_SDT_json);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETADETINTE_CIERRE_SDT_JSON", getSecureSignedToken( sPrefix, AV38RecetadeTinte_Cierre_SDT_json));
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
      return AV13RecetadeTinte_Cierre_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV111Pgmname, AV12FilterFullText, AV73EmprcodIN, AV41BarcodIN, AV43BarcodreoIN, AV42BarcodparIN, AV37FechaCierre, AV33RecAcab, AV13RecetadeTinte_Cierre_SDT, AV51colorservicecontador, AV49clienteModa21, AV74SiCSV, AV38RecetadeTinte_Cierre_SDT_json, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV111Pgmname, AV12FilterFullText, AV73EmprcodIN, AV41BarcodIN, AV43BarcodreoIN, AV42BarcodparIN, AV37FechaCierre, AV33RecAcab, AV13RecetadeTinte_Cierre_SDT, AV51colorservicecontador, AV49clienteModa21, AV74SiCSV, AV38RecetadeTinte_Cierre_SDT_json, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV111Pgmname, AV12FilterFullText, AV73EmprcodIN, AV41BarcodIN, AV43BarcodreoIN, AV42BarcodparIN, AV37FechaCierre, AV33RecAcab, AV13RecetadeTinte_Cierre_SDT, AV51colorservicecontador, AV49clienteModa21, AV74SiCSV, AV38RecetadeTinte_Cierre_SDT_json, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV111Pgmname, AV12FilterFullText, AV73EmprcodIN, AV41BarcodIN, AV43BarcodreoIN, AV42BarcodparIN, AV37FechaCierre, AV33RecAcab, AV13RecetadeTinte_Cierre_SDT, AV51colorservicecontador, AV49clienteModa21, AV74SiCSV, AV38RecetadeTinte_Cierre_SDT_json, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV111Pgmname, AV12FilterFullText, AV73EmprcodIN, AV41BarcodIN, AV43BarcodreoIN, AV42BarcodparIN, AV37FechaCierre, AV33RecAcab, AV13RecetadeTinte_Cierre_SDT, AV51colorservicecontador, AV49clienteModa21, AV74SiCSV, AV38RecetadeTinte_Cierre_SDT_json, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV111Pgmname = "FormulacionTinte.RecetadeTinte_Cierre__WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111Pgmname", AV111Pgmname);
      Gx_err = (short)(0) ;
      edtavFechacierre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFechacierre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFechacierre_Enabled), 5, 0), true);
      edtavNumeroregistros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNumeroregistros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNumeroregistros_Enabled), 5, 0), true);
      cmbavRecetadetinte_cierre_sdt__pesado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecetadetinte_cierre_sdt__pesado.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__pesado.getEnabled(), 5, 0), !bGXsfl_68_Refreshing);
      cmbavRecetadetinte_cierre_sdt__adicion.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecetadetinte_cierre_sdt__adicion.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__adicion.getEnabled(), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__incidencias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__incidencias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__incidencias_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__reclinmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barsit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barsit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barsit_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__baragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__baragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__baragrest_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barser_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barserdsc_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcolnum_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__bartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__bartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__bartipcol_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnomcli_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barnumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnumcli_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__maqcod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__rectotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__recvolprd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__recvolprd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__recvolprd_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__recfecalt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__recfecalt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__recfecalt_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnumany_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barnumany_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnumany_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__lconti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__lconti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__lconti_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__hisreh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__hisreh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__hisreh_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__batchcode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__batchcode_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__batchcode_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      cmbavRecetadetinte_cierre_sdt__recnropar.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecetadetinte_cierre_sdt__recnropar.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__recnropar.getEnabled(), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__weigprodid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__weigprodid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__weigprodid_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup28U0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2028U2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Recetadetinte_cierre_sdt"), AV13RecetadeTinte_Cierre_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV21ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV24DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vRECETADETINTE_CIERRE_SDT"), AV13RecetadeTinte_Cierre_SDT);
         /* Read saved values. */
         nRC_GXsfl_68 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_68"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV73EmprcodIN = httpContext.cgiGet( sPrefix+"wcpOAV73EmprcodIN") ;
         wcpOAV41BarcodIN = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV41BarcodIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV43BarcodreoIN = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV43BarcodreoIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV42BarcodparIN = httpContext.cgiGet( sPrefix+"wcpOAV42BarcodparIN") ;
         wcpOAV37FechaCierre = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV37FechaCierre"), 0) ;
         wcpOAV33RecAcab = httpContext.cgiGet( sPrefix+"wcpOAV33RecAcab") ;
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
         Dvelop_confirmpanel_anyadirproductos_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Title") ;
         Dvelop_confirmpanel_anyadirproductos_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Confirmationtext") ;
         Dvelop_confirmpanel_anyadirproductos_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_anyadirproductos_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Nobuttoncaption") ;
         Dvelop_confirmpanel_anyadirproductos_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_anyadirproductos_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Yesbuttonposition") ;
         Dvelop_confirmpanel_anyadirproductos_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Confirmtype") ;
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
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
         Dvelop_confirmpanel_anyadirproductos_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Result") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         nRC_GXsfl_68 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_68"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_68_fel_idx = 0 ;
         while ( nGXsfl_68_fel_idx < nRC_GXsfl_68 )
         {
            nGXsfl_68_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_68_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_68_fel_idx+1) ;
            sGXsfl_68_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_682( ) ;
            AV83GXV1 = (int)(nGXsfl_68_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) && ( AV83GXV1 > 0 ) )
            {
               AV13RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)) );
               cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
               cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
               AV57grupodeacciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
               AV54DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            }
         }
         if ( nGXsfl_68_fel_idx == 0 )
         {
            nGXsfl_68_idx = 1 ;
            sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_682( ) ;
         }
         nGXsfl_68_fel_idx = 1 ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNumeroregistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNumeroregistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUMEROREGISTROS");
            GX_FocusControl = edtavNumeroregistros_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV61Numeroregistros = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Numeroregistros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61Numeroregistros), 12, 0));
         }
         else
         {
            AV61Numeroregistros = localUtil.ctol( httpContext.cgiGet( edtavNumeroregistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Numeroregistros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61Numeroregistros), 12, 0));
         }
         AV12FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         AV111Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111Pgmname", AV111Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_68_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_682( ) ;
         AV83GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
         if ( nGXsfl_68_idx > 0 )
         {
            AV83GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) && ( AV83GXV1 > 0 ) )
            {
               AV13RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)) );
               cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
               cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
               AV57grupodeacciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57grupodeacciones), 4, 0));
               AV54DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV54DetailWebComponent);
            }
            if ( ( AV83GXV1 > 0 ) && ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) )
            {
               AV13RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)) );
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RecetadeTinte_Cierre__WC");
         AV111Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111Pgmname", AV111Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV111Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\recetadetinte_cierre__wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
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
      e2028U2 ();
      if (returnInSub) return;
   }

   public void e2028U2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV34Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetadetinte_cierre__wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV34Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Station", AV34Station);
      GXv_char2[0] = AV29Emprcod ;
      GXv_char3[0] = AV35EmprNom ;
      GXv_char4[0] = AV36UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV34Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetadetinte_cierre__wc_impl.this.AV29Emprcod = GXv_char2[0] ;
      recetadetinte_cierre__wc_impl.this.AV35EmprNom = GXv_char3[0] ;
      recetadetinte_cierre__wc_impl.this.AV36UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Emprcod", AV29Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36UsurCod", AV36UsurCod);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV24DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV24DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV49clienteModa21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV29Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      recetadetinte_cierre__wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV49clienteModa21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49clienteModa21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49clienteModa21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCLIENTEMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV49clienteModa21), "ZZZ9")));
      GXt_int7 = (byte)(AV51colorservicecontador) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV29Emprcod, httpContext.getMessage( "CSTXP", ""), GXv_int8) ;
      recetadetinte_cierre__wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV51colorservicecontador = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51colorservicecontador", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51colorservicecontador), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOLORSERVICECONTADOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51colorservicecontador), "ZZZ9")));
      GXt_int9 = AV53ContVal ;
      GXv_char4[0] = AV29Emprcod ;
      GXv_char3[0] = "011100" ;
      GXv_int10[0] = GXt_int9 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int10) ;
      recetadetinte_cierre__wc_impl.this.AV29Emprcod = GXv_char4[0] ;
      recetadetinte_cierre__wc_impl.this.GXt_int9 = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Emprcod", AV29Emprcod);
      AV53ContVal = GXt_int9 ;
      AV52Consumos = (short)(((AV53ContVal==1) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52Consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Consumos), 4, 0));
      GXt_int7 = (byte)(AV74SiCSV) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV29Emprcod, httpContext.getMessage( "SICSV", ""), GXv_int8) ;
      recetadetinte_cierre__wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV74SiCSV = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74SiCSV", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74SiCSV), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSICSV", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV74SiCSV), "ZZZ9")));
      GXt_char1 = AV38RecetadeTinte_Cierre_SDT_json ;
      GXt_dtime11 = GXutil.resetTime( AV37FechaCierre );
      GXt_dtime12 = GXutil.resetTime( AV75FechaCierreHasta );
      GXv_char4[0] = GXt_char1 ;
      new app.formulaciontinte.recetadetinte_cierre_prc(remoteHandle, context).execute( AV73EmprcodIN, AV41BarcodIN, AV43BarcodreoIN, AV42BarcodparIN, GXt_dtime11, GXt_dtime12, AV33RecAcab, GXv_char4) ;
      recetadetinte_cierre__wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV38RecetadeTinte_Cierre_SDT_json = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38RecetadeTinte_Cierre_SDT_json", AV38RecetadeTinte_Cierre_SDT_json);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETADETINTE_CIERRE_SDT_JSON", getSecureSignedToken( sPrefix, AV38RecetadeTinte_Cierre_SDT_json));
      AV13RecetadeTinte_Cierre_SDT.fromJSonString(AV38RecetadeTinte_Cierre_SDT_json, null);
      gx_BV68 = true ;
      AV61Numeroregistros = AV13RecetadeTinte_Cierre_SDT.size() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61Numeroregistros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61Numeroregistros), 12, 0));
   }

   public void e2128U2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext13[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext13) ;
      AV6WWPContext = GXv_SdtWWPContext13[0] ;
      if ( AV23ManageFiltersExecutionStep == 1 )
      {
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV23ManageFiltersExecutionStep == 2 )
      {
         AV23ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV20Session.getValue("FormulacionTinte.RecetadeTinte_Cierre__WCColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("FormulacionTinte.RecetadeTinte_Cierre__WCColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      chkavRecetadetinte_cierre_sdt__seleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavRecetadetinte_cierre_sdt__seleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavRecetadetinte_cierre_sdt__seleccionar.getVisible(), 5, 0), !bGXsfl_68_Refreshing);
      cmbavRecetadetinte_cierre_sdt__pesado.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecetadetinte_cierre_sdt__pesado.getInternalname(), "Visible", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__pesado.getVisible(), 5, 0), !bGXsfl_68_Refreshing);
      cmbavRecetadetinte_cierre_sdt__adicion.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecetadetinte_cierre_sdt__adicion.getInternalname(), "Visible", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__adicion.getVisible(), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__incidencias_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__incidencias_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__incidencias_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcod_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcodreo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barcodreo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcodreo_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcodpar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barcodpar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcodpar_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__reclinmaq_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__reclinmaq_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__reclinmaq_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barsit_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barsit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barsit_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__baragrest_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__baragrest_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__baragrest_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barser_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barserdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barserdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barserdsc_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barcolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcolnom_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcolnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barcolnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcolnum_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__bartipcol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__bartipcol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__bartipcol_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnomcli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barnomcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnomcli_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnumcli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barnumcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnumcli_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__maqcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__maqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__maqcod_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__rectotkgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__rectotkgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__rectotkgm_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__recvolprd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__recvolprd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__recvolprd_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__recfecalt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__recfecalt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__recfecalt_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnumany_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barnumany_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnumany_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__lconti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__lconti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__lconti_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__hisreh_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__hisreh_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__hisreh_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__batchcode_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__batchcode_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__batchcode_Visible), 5, 0), !bGXsfl_68_Refreshing);
      cmbavRecetadetinte_cierre_sdt__recnropar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecetadetinte_cierre_sdt__recnropar.getInternalname(), "Visible", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__recnropar.getVisible(), 5, 0), !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__weigprodid_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__weigprodid_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__weigprodid_Visible), 5, 0), !bGXsfl_68_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV26GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridCurrentPage), 10, 0));
      AV27GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridPageCount), 10, 0));
      edtavRecetadetinte_cierre_sdt__incidencias_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__incidencias_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__incidencias_Columnheaderclass, !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__barcod_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__barcod_Columnheaderclass, !bGXsfl_68_Refreshing);
      edtavRecetadetinte_cierre_sdt__weigprodid_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecetadetinte_cierre_sdt__weigprodid_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__weigprodid_Columnheaderclass, !bGXsfl_68_Refreshing);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1328U2( )
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
         AV25PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV25PageToGo) ;
      }
   }

   public void e1428U2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e2228U2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV83GXV1 = 1 ;
      while ( AV83GXV1 <= AV13RecetadeTinte_Cierre_SDT.size() )
      {
         AV13RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)) );
         cmbavGrupodeacciones.removeAllItems();
         cmbavGrupodeacciones.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGrupodeacciones.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Añadir Productos (Formato I)", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGrupodeacciones.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Numero de Añadidas", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         AV54DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV54DetailWebComponent);
         edtavRecetadetinte_cierre_sdt__incidencias_Columnclass = ((((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias()>0) ? "WWColumn WWColumnDanger WWColumnDangerSingleCell" : "WWColumn") ;
         edtavRecetadetinte_cierre_sdt__barcod_Columnclass = ((((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos()==1) ? "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" : "WWColumn") ;
         edtavRecetadetinte_cierre_sdt__weigprodid_Columnclass = ((((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos()==1) ? "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" : "WWColumn") ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(68) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_682( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_68_Refreshing )
         {
            httpContext.doAjaxLoad(68, GridRow);
         }
         AV83GXV1 = (int)(AV83GXV1+1) ;
      }
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV57grupodeacciones, 4, 0)) );
   }

   public void e1528U2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinte_Cierre__WCColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1228U2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.RecetadeTinte_Cierre__WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV111Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.RecetadeTinte_Cierre__WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV22ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinte_Cierre__WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         recetadetinte_cierre__wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV22ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV22ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV111Pgmname+"GridState", AV22ManageFiltersXml) ;
            AV10GridState.fromxml(AV22ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
   }

   public void e2328U2( )
   {
      AV83GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV83GXV1 > 0 ) && ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) )
      {
         AV13RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)) );
      }
      /* Grupodeacciones_Click Routine */
      returnInSub = false ;
      if ( AV57grupodeacciones == 1 )
      {
         /* Execute user subroutine: 'DO ANYADIRPRODUCTOS' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV57grupodeacciones == 2 )
      {
         /* Execute user subroutine: 'DO NUMERODEANYADIDAS' */
         S192 ();
         if (returnInSub) return;
      }
      AV57grupodeacciones = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57grupodeacciones), 4, 0));
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV57grupodeacciones, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), true);
   }

   public void e1628U2( )
   {
      AV83GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV83GXV1 > 0 ) && ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) )
      {
         AV13RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)) );
      }
      /* Dvelop_confirmpanel_anyadirproductos_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_anyadirproductos_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ANYADIRPRODUCTOS' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV63ProgressIndicator", AV63ProgressIndicator);
   }

   public void e1728U2( )
   {
      AV83GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV83GXV1 > 0 ) && ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) )
      {
         AV13RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)) );
      }
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S212 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV63ProgressIndicator", AV63ProgressIndicator);
   }

   public void e1828U2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV71websession.setValue(httpContext.getMessage( "&RecetadeTinte_Cierre_SDT_json", ""), AV38RecetadeTinte_Cierre_SDT_json);
      GXv_char4[0] = AV14ExcelFilename ;
      GXv_char3[0] = AV15ErrorMessage ;
      new app.formulaciontinte.recetadetinte_cierre__wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      recetadetinte_cierre__wc_impl.this.AV14ExcelFilename = GXv_char4[0] ;
      recetadetinte_cierre__wc_impl.this.AV15ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV14ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV14ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV15ErrorMessage);
      }
   }

   public void e1928U2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV71websession.setValue(httpContext.getMessage( "&RecetadeTinte_Cierre_SDT_json", ""), AV38RecetadeTinte_Cierre_SDT_json);
      callWebObject(formatLink("app.formulaciontinte.recetadetinte_cierre__wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void e2428U2( )
   {
      AV83GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV83GXV1 > 0 ) && ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) )
      {
         AV13RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)) );
      }
      /* Detailwebcomponent_Click Routine */
      returnInSub = false ;
      AV46BatchCode = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode() ;
      AV30Barcod = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod() ;
      AV31Barcodreo = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo() ;
      AV32Barcodpar = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar() ;
      AV66reclinmaq = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq() ;
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Grid_dwc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Grid_dwc_Component), GXutil.lower( "FormulacionTinte.ConsumosColorService_WC")) != 0 )
      {
         WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app.formulaciontinte.consumoscolorservice_wc_impl", remoteHandle, context);
         WebComp_Grid_dwc_Component = "FormulacionTinte.ConsumosColorService_WC" ;
      }
      if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
      {
         WebComp_Grid_dwc.setjustcreated();
         WebComp_Grid_dwc.componentprepare(new Object[] {sPrefix+"W0103","",AV46BatchCode,AV29Emprcod,Integer.valueOf(AV30Barcod),Byte.valueOf(AV31Barcodreo),AV32Barcodpar,Short.valueOf(AV66reclinmaq)});
         WebComp_Grid_dwc.componentbind(new Object[] {"","","","","",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Grid_dwc )
      {
         httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0103"+"");
         WebComp_Grid_dwc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
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
      AV18ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Seleccionar", "", "Op", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Pesado", "", "P?", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Adicion", "", "Ad?", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Incidencias", "", "Err", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Barcod", "", "Nº Hdr", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Barcodreo", "", "R", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Barcodpar", "", "P", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__RecLinMaq", "", "#", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__BarSit", "", "Sit.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__BarAgrEst", "", "A?", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Barser", "", "Articulo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Barserdsc", "", "Descripcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Barcolnom", "", "Color", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Barcolnum", "", "Numero", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Bartipcol", "", "TC", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Barnomcli", "", "Color Cliente", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Barnumcli", "", "Numero ", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Maqcod", "", "Maquina", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Rectotkgm", "", "Kilos Tot.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__RecVolprd", "", "Volumen", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__RecFecAlt", "", "Fech. Alta", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__BarNumAny", "", "Nº Añad.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Lconti", "", "Lconti", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__Hisreh", "", "Hisreh", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__BatchCode", "", "Batch Code", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__RecNroPar", "", "Color Service", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXv_SdtWWPColumnsSelector14[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, "RecetadeTinte_Cierre_SDT__WeigProdID", "", "ID CS", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector14[0] ;
      GXt_char1 = AV17UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinte_Cierre__WCColumnsSelector", GXv_char4) ;
      recetadetinte_cierre__wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector14[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector15[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector14, GXv_SdtWWPColumnsSelector15) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector14[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = AV21ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinte_Cierre__WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[0] ;
      AV21ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV12FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
   }

   public void S182( )
   {
      /* 'DO ANYADIRPRODUCTOS' Routine */
      returnInSub = false ;
      AV50Colorservice = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos() ;
      AV67RecNroPar = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar() ;
      if ( ( AV51colorservicecontador == 1 ) && ( AV50Colorservice == 1 ) && ( AV67RecNroPar == 0 ) )
      {
         Dvelop_confirmpanel_anyadirproductos_Confirmationtext = httpContext.getMessage( "Atenção, este O.S. contém consumos de ColorService. Se continuarmos, o programa atualizará os consumos ColorService no O.S.", "")+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_anyadirproductos.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_anyadirproductos_Internalname, "ConfirmationText", Dvelop_confirmpanel_anyadirproductos_Confirmationtext);
         Dvelop_confirmpanel_anyadirproductos_Confirmationtext = Dvelop_confirmpanel_anyadirproductos_Confirmationtext+httpContext.getMessage( "Confirme?", "") ;
         ucDvelop_confirmpanel_anyadirproductos.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_anyadirproductos_Internalname, "ConfirmationText", Dvelop_confirmpanel_anyadirproductos_Confirmationtext);
      }
      else
      {
         Dvelop_confirmpanel_anyadirproductos_Confirmationtext = httpContext.getMessage( "Confirma?", "") ;
         ucDvelop_confirmpanel_anyadirproductos.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_anyadirproductos_Internalname, "ConfirmationText", Dvelop_confirmpanel_anyadirproductos_Confirmationtext);
      }
      this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOSContainer", "Confirm", "", new Object[] {});
   }

   public void S202( )
   {
      /* 'DO ACTION ANYADIRPRODUCTOS' Routine */
      returnInSub = false ;
      AV50Colorservice = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos() ;
      AV67RecNroPar = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar() ;
      AV30Barcod = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod() ;
      AV31Barcodreo = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo() ;
      AV32Barcodpar = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar() ;
      AV66reclinmaq = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq() ;
      AV46BatchCode = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode() ;
      AV60MaqCod = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod() ;
      AV68RecTotKgm = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm() ;
      AV69RecVolPrd = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd() ;
      AV44barnhdr = GXutil.trim( GXutil.str( AV30Barcod, 8, 0)) + "-" + GXutil.str( AV31Barcodreo, 1, 0) + AV32Barcodpar ;
      if ( ( AV51colorservicecontador == 1 ) && ( AV50Colorservice == 1 ) && ( AV67RecNroPar == 0 ) && ( AV49clienteModa21 == 1 ) )
      {
         AV63ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
         AV63ProgressIndicator.showwithtitle(httpContext.getMessage( "Preparando datos ... ", ""));
         AV63ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
         AV63ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciamos Color Service ... ", ""));
         GXv_char4[0] = AV58Inc_obs ;
         GXv_int8[0] = AV76RecNumAny ;
         GXv_objcol_SdtMessages_Message18[0] = AV79messages ;
         new app.formulaciontinte.colorserviceactualizaciondeconsumos(remoteHandle, context).execute( AV46BatchCode, AV29Emprcod, AV30Barcod, AV31Barcodreo, AV32Barcodpar, AV66reclinmaq, httpContext.getMessage( "N", ""), GXv_char4, GXv_int8, GXv_objcol_SdtMessages_Message18) ;
         recetadetinte_cierre__wc_impl.this.AV58Inc_obs = GXv_char4[0] ;
         recetadetinte_cierre__wc_impl.this.AV76RecNumAny = GXv_int8[0] ;
         AV79messages = GXv_objcol_SdtMessages_Message18[0] ;
         AV77RecHayAny = ((GXutil.strcmp(AV77RecHayAny, "S")!=0)&&(AV76RecNumAny>0) ? "S" : AV77RecHayAny) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77RecHayAny", AV77RecHayAny);
         AV58Inc_obs = "" ;
         AV112GXV29 = 1 ;
         while ( AV112GXV29 <= AV79messages.size() )
         {
            AV80message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV79messages.elementAt(-1+AV112GXV29));
            AV58Inc_obs = httpContext.getMessage( "RecetadeTinte_Cierre__WC ", "") + GXutil.rtrim( localUtil.format( AV80message.getgxTv_SdtMessages_Message_Id(), "")) ;
            AV58Inc_obs += "/" + AV80message.getgxTv_SdtMessages_Message_Description() ;
            new app.pctrinc(remoteHandle, context).execute( AV29Emprcod, AV111Pgmname, AV36UsurCod, AV34Station, AV58Inc_obs, AV30Barcod, AV31Barcodreo, AV32Barcodpar) ;
            AV58Inc_obs = "" ;
            AV112GXV29 = (int)(AV112GXV29+1) ;
         }
         AV63ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "progress-bar-sucess", "") );
         AV63ProgressIndicator.showwithtitle(httpContext.getMessage( "Finalizado", ""));
         AV63ProgressIndicator.hide();
         new app.pcommit(remoteHandle, context).execute( ) ;
      }
      httpContext.popup(formatLink("app.formulaciontinte.cierrerecetastinte_3_anyadidas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV30Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV32Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV66reclinmaq,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV55FecCieTin)),GXutil.URLEncode(GXutil.ltrimstr(AV52Consumos,4,0)),GXutil.URLEncode(GXutil.rtrim(AV60MaqCod)),GXutil.URLEncode(GXutil.ltrimstr(AV48Cc_almcod,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV37FechaCierre)),GXutil.URLEncode(GXutil.ltrimstr(AV56FlagM,1,0)),GXutil.URLEncode(GXutil.formatDateParm(AV65Recfec)),GXutil.URLEncode(DecimalUtil.decToString(AV68RecTotKgm)),GXutil.URLEncode(GXutil.ltrimstr(AV69RecVolPrd,5,0)),GXutil.URLEncode(GXutil.rtrim(AV44barnhdr)),GXutil.URLEncode(GXutil.rtrim(AV77RecHayAny))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","FecCieTin","consumos","Maqcod","Cc_almcod","fechaCierre","flagM","recfec","rectotkgm","recvolprd","barnhdr","HayAnyadidas"}) , new Object[] {"AV29Emprcod","AV30Barcod","AV31Barcodreo","AV32Barcodpar","AV66reclinmaq","AV55FecCieTin","AV52Consumos","AV60MaqCod","AV48Cc_almcod","AV37FechaCierre","AV56FlagM","AV65Recfec","AV68RecTotKgm","AV69RecVolPrd","AV44barnhdr","AV77RecHayAny"});
      this.executeExternalObjectMethod(sPrefix, false, "GlobalEvents", "RecetaTinteRefresh", new Object[] {}, true);
   }

   public void S192( )
   {
      /* 'DO NUMERODEANYADIDAS' Routine */
      returnInSub = false ;
      AV30Barcod = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod() ;
      AV31Barcodreo = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo() ;
      AV32Barcodpar = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar() ;
      AV44barnhdr = GXutil.trim( GXutil.str( AV30Barcod, 8, 0)) + "-" + GXutil.str( AV31Barcodreo, 1, 0) + AV32Barcodpar ;
      AV66reclinmaq = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq() ;
      AV45barnumany = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany() ;
      httpContext.popup(formatLink("app.formulaciontinte.cierrerecetastinte_numerodeanyadidas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV30Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV32Barcodpar)),GXutil.URLEncode(GXutil.rtrim(AV44barnhdr)),GXutil.URLEncode(GXutil.ltrimstr(AV45barnumany,3,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarNHdr","BarNumAny"}) , new Object[] {});
      this.executeExternalObjectMethod(sPrefix, false, "GlobalEvents", "RecetaTinteRefresh", new Object[] {}, true);
   }

   public void S212( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV63ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
      AV63ProgressIndicator.showwithtitle(httpContext.getMessage( "Preparando datos ... ", ""));
      AV63ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV63ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciamos lectura ... ", ""));
      AV70t = (short)(0) ;
      AV113GXV30 = 1 ;
      while ( AV113GXV30 <= AV13RecetadeTinte_Cierre_SDT.size() )
      {
         AV64RecetadeTinte_Cierre_SDT_item = (app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV113GXV30));
         if ( AV64RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar() )
         {
            AV46BatchCode = AV64RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode() ;
            AV30Barcod = AV64RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod() ;
            AV31Barcodreo = AV64RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo() ;
            AV32Barcodpar = AV64RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar() ;
            AV66reclinmaq = AV64RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq() ;
            AV50Colorservice = AV64RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos() ;
            AV45barnumany = AV64RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany() ;
            AV60MaqCod = AV64RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod() ;
            if ( AV50Colorservice == 1 )
            {
               AV58Inc_obs = httpContext.getMessage( "Go ColorServiceActualizaciondeConsumos", "") ;
               new app.pctrinc(remoteHandle, context).execute( AV29Emprcod, AV111Pgmname, AV36UsurCod, AV34Station, AV58Inc_obs, AV30Barcod, AV31Barcodreo, AV32Barcodpar) ;
               GXv_char4[0] = AV58Inc_obs ;
               GXv_int8[0] = AV76RecNumAny ;
               GXv_objcol_SdtMessages_Message18[0] = AV79messages ;
               new app.formulaciontinte.colorserviceactualizaciondeconsumos(remoteHandle, context).execute( AV46BatchCode, AV29Emprcod, AV30Barcod, AV31Barcodreo, AV32Barcodpar, AV66reclinmaq, httpContext.getMessage( "N", ""), GXv_char4, GXv_int8, GXv_objcol_SdtMessages_Message18) ;
               recetadetinte_cierre__wc_impl.this.AV58Inc_obs = GXv_char4[0] ;
               recetadetinte_cierre__wc_impl.this.AV76RecNumAny = GXv_int8[0] ;
               AV79messages = GXv_objcol_SdtMessages_Message18[0] ;
               new app.pcommit(remoteHandle, context).execute( ) ;
               AV58Inc_obs = "" ;
               AV114GXV31 = 1 ;
               while ( AV114GXV31 <= AV79messages.size() )
               {
                  AV80message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV79messages.elementAt(-1+AV114GXV31));
                  AV58Inc_obs = httpContext.getMessage( "RecetadeTinte_Cierre__WC ", "") + GXutil.rtrim( localUtil.format( AV80message.getgxTv_SdtMessages_Message_Id(), "")) ;
                  AV58Inc_obs += "/" + AV80message.getgxTv_SdtMessages_Message_Description() ;
                  new app.pctrinc(remoteHandle, context).execute( AV29Emprcod, AV111Pgmname, AV36UsurCod, AV34Station, AV58Inc_obs, AV30Barcod, AV31Barcodreo, AV32Barcodpar) ;
                  AV58Inc_obs = "" ;
                  AV114GXV31 = (int)(AV114GXV31+1) ;
               }
            }
            AV47Ca_diahora = GXutil.serverNow( context, remoteHandle, pr_default) ;
            AV58Inc_obs = httpContext.getMessage( "go PCLs999", "") ;
            new app.pctrinc(remoteHandle, context).execute( AV29Emprcod, AV111Pgmname, AV36UsurCod, AV34Station, AV58Inc_obs, AV30Barcod, AV31Barcodreo, AV32Barcodpar) ;
            GXv_char4[0] = AV29Emprcod ;
            GXv_int10[0] = AV30Barcod ;
            GXv_int8[0] = AV31Barcodreo ;
            GXv_char3[0] = AV32Barcodpar ;
            GXv_char2[0] = httpContext.getMessage( "A", "") ;
            GXv_int19[0] = (byte)(AV52Consumos) ;
            GXv_int20[0] = AV45barnumany ;
            GXv_int21[0] = AV66reclinmaq ;
            GXv_char22[0] = AV60MaqCod ;
            GXv_char23[0] = httpContext.getMessage( "M", "") ;
            GXv_char24[0] = httpContext.getMessage( "M", "") ;
            GXv_dtime25[0] = AV47Ca_diahora ;
            GXv_int26[0] = AV48Cc_almcod ;
            GXv_char27[0] = AV62productosconsumos ;
            GXv_int28[0] = AV59j ;
            GXv_char29[0] = AV36UsurCod ;
            GXv_char30[0] = AV34Station ;
            GXv_date31[0] = AV37FechaCierre ;
            new app.pcls999(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int8, GXv_char3, GXv_char2, GXv_int19, GXv_int20, GXv_int21, GXv_char22, GXv_char23, GXv_char24, GXv_dtime25, GXv_int26, GXv_char27, GXv_int28, GXv_char29, GXv_char30, GXv_date31) ;
            recetadetinte_cierre__wc_impl.this.AV29Emprcod = GXv_char4[0] ;
            recetadetinte_cierre__wc_impl.this.AV30Barcod = GXv_int10[0] ;
            recetadetinte_cierre__wc_impl.this.AV31Barcodreo = GXv_int8[0] ;
            recetadetinte_cierre__wc_impl.this.AV32Barcodpar = GXv_char3[0] ;
            recetadetinte_cierre__wc_impl.this.AV52Consumos = GXv_int19[0] ;
            recetadetinte_cierre__wc_impl.this.AV45barnumany = GXv_int20[0] ;
            recetadetinte_cierre__wc_impl.this.AV66reclinmaq = GXv_int21[0] ;
            recetadetinte_cierre__wc_impl.this.AV60MaqCod = GXv_char22[0] ;
            recetadetinte_cierre__wc_impl.this.AV47Ca_diahora = GXv_dtime25[0] ;
            recetadetinte_cierre__wc_impl.this.AV48Cc_almcod = GXv_int26[0] ;
            recetadetinte_cierre__wc_impl.this.AV62productosconsumos = GXv_char27[0] ;
            recetadetinte_cierre__wc_impl.this.AV59j = (short)((short)(GXv_int28[0])) ;
            recetadetinte_cierre__wc_impl.this.AV36UsurCod = GXv_char29[0] ;
            recetadetinte_cierre__wc_impl.this.AV34Station = GXv_char30[0] ;
            recetadetinte_cierre__wc_impl.this.AV37FechaCierre = GXv_date31[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Emprcod", AV29Emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52Consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Consumos), 4, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Cc_almcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Cc_almcod), 2, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62productosconsumos", AV62productosconsumos);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59j", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59j), 4, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36UsurCod", AV36UsurCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Station", AV34Station);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37FechaCierre", localUtil.format(AV37FechaCierre, "99/99/99"));
            AV58Inc_obs = httpContext.getMessage( "gReturn PCLs999", "") ;
            new app.pctrinc(remoteHandle, context).execute( AV29Emprcod, AV111Pgmname, AV36UsurCod, AV34Station, AV58Inc_obs, AV30Barcod, AV31Barcodreo, AV32Barcodpar) ;
            AV63ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "progress-bar-warning", "") );
            AV63ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesada N Hdr ", "")+GXutil.str( AV30Barcod, 8, 0)+"-"+GXutil.str( AV31Barcodreo, 1, 0)+AV32Barcodpar);
            AV70t = (short)(AV70t+1) ;
         }
         AV113GXV30 = (int)(AV113GXV30+1) ;
      }
      AV63ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "progress-bar-sucess", "") );
      AV63ProgressIndicator.showwithtitle(httpContext.getMessage( "Finalizado", ""));
      AV63ProgressIndicator.hide();
      if ( AV70t > 0 )
      {
         if ( AV74SiCSV == 1 )
         {
            callWebObject(formatLink("app.pctrlinsumos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV62productosconsumos))}, new String[] {"Emprcod","ProductosConsumos"}) );
            httpContext.wjLocDisableFrm = (byte)(2) ;
         }
         this.executeExternalObjectMethod(sPrefix, false, "GlobalEvents", "RecetaTinteRefresh", new Object[] {}, true);
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV111Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV111Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV111Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV115GXV32 = 1 ;
      while ( AV115GXV32 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV115GXV32));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         }
         AV115GXV32 = (int)(AV115GXV32+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV111Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV12FilterFullText)==0), (short)(0), AV12FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      if ( ! (GXutil.strcmp("", AV73EmprcodIN)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCODIN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV73EmprcodIN );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV41BarcodIN) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODIN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV41BarcodIN, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV43BarcodreoIN) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREOIN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV43BarcodreoIN, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV42BarcodparIN)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPARIN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV42BarcodparIN );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37FechaCierre)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FECHACIERRE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV37FechaCierre, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV33RecAcab)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&RECACAB" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV33RecAcab );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV111Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void e2528U2( )
   {
      AV83GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV83GXV1 > 0 ) && ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) )
      {
         AV13RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)) );
      }
      /* Recetadetinte_cierre_sdt__incidencias_Click Routine */
      returnInSub = false ;
      AV30Barcod = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod() ;
      AV31Barcodreo = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo() ;
      AV32Barcodpar = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar() ;
      AV66reclinmaq = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq() ;
      AV39Window.setAutoresize( 0 );
      AV39Window.setWidth( 1600 );
      AV39Window.setHeight( 900 );
      /* Window Datatype Object Property */
      AV39Window.setUrl( formatLink("app.formulaciontinte.cierrerecetastinteincidencias_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV30Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV32Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV66reclinmaq,4,0))}, new String[] {"EmprCod","barcod","barcodreo","barcodpar","reclinmaq"})  );
      AV39Window.setReturnParms(new Object[] {});
      httpContext.newWindow(AV39Window);
      /*  Sending Event outputs  */
   }

   public void e2628U2( )
   {
      AV83GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV83GXV1 > 0 ) && ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) )
      {
         AV13RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)) );
      }
      /* Recetadetinte_cierre_sdt__baragrest_Click Routine */
      returnInSub = false ;
      AV40BarAgrEst = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest() ;
      AV30Barcod = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod() ;
      AV31Barcodreo = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo() ;
      AV32Barcodpar = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar() ;
      if ( GXutil.strcmp(AV40BarAgrEst, "S") == 0 )
      {
         AV39Window.setAutoresize( 0 );
         AV39Window.setWidth( 1600 );
         AV39Window.setHeight( 900 );
         /* Window Datatype Object Property */
         AV39Window.setUrl( formatLink("app.formulaciontinte.recetadetinte_agrupacion_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV30Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV32Barcodpar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"})  );
         AV39Window.setReturnParms(new Object[] {"AV29Emprcod","AV30Barcod","AV31Barcodreo","AV32Barcodpar",});
         httpContext.newWindow(AV39Window);
      }
      /*  Sending Event outputs  */
   }

   public void e2728U2( )
   {
      AV83GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV83GXV1 > 0 ) && ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) )
      {
         AV13RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)) );
      }
      /* Recetadetinte_cierre_sdt__seleccionar_Click Routine */
      returnInSub = false ;
      if ( ( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar() ) && ( ( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti() > 0 ) || ( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV13RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh() > 0 ) ) )
      {
         Gx_msg = httpContext.getMessage( "Atencion. El sistema ha dectectado que esta OT", "") + GXutil.newLine( ) + httpContext.getMessage( "Ya ha sido cerrada anteriormente. Consulte Historico Recetas", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
   }

   public void wb_table3_121_28U2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmar_Internalname, tblTabledvelop_confirmpanel_confirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmar.setProperty("Title", Dvelop_confirmpanel_confirmar_Title);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmType", Dvelop_confirmpanel_confirmar_Confirmtype);
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_121_28U2e( true) ;
      }
      else
      {
         wb_table3_121_28U2e( false) ;
      }
   }

   public void wb_table2_116_28U2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_anyadirproductos_Internalname, tblTabledvelop_confirmpanel_anyadirproductos_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_anyadirproductos.setProperty("Title", Dvelop_confirmpanel_anyadirproductos_Title);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("ConfirmationText", Dvelop_confirmpanel_anyadirproductos_Confirmationtext);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("YesButtonCaption", Dvelop_confirmpanel_anyadirproductos_Yesbuttoncaption);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("NoButtonCaption", Dvelop_confirmpanel_anyadirproductos_Nobuttoncaption);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("CancelButtonCaption", Dvelop_confirmpanel_anyadirproductos_Cancelbuttoncaption);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("YesButtonPosition", Dvelop_confirmpanel_anyadirproductos_Yesbuttonposition);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("ConfirmType", Dvelop_confirmpanel_anyadirproductos_Confirmtype);
         ucDvelop_confirmpanel_anyadirproductos.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_anyadirproductos_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOSContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_116_28U2e( true) ;
      }
      else
      {
         wb_table2_116_28U2e( false) ;
      }
   }

   public void wb_table1_39_28U2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV21ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_44_28U2( true) ;
      }
      else
      {
         wb_table4_44_28U2( false) ;
      }
      return  ;
   }

   public void wb_table4_44_28U2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_39_28U2e( true) ;
      }
      else
      {
         wb_table1_39_28U2e( false) ;
      }
   }

   public void wb_table4_44_28U2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'" + sPrefix + "',false,'" + sGXsfl_68_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV12FilterFullText, GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\RecetadeTinte_Cierre__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_44_28U2e( true) ;
      }
      else
      {
         wb_table4_44_28U2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV73EmprcodIN = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73EmprcodIN", AV73EmprcodIN);
      AV41BarcodIN = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41BarcodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarcodIN), 8, 0));
      AV43BarcodreoIN = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43BarcodreoIN", GXutil.str( AV43BarcodreoIN, 1, 0));
      AV42BarcodparIN = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarcodparIN", AV42BarcodparIN);
      AV37FechaCierre = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37FechaCierre", localUtil.format(AV37FechaCierre, "99/99/99"));
      AV33RecAcab = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33RecAcab", AV33RecAcab);
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
      pa28U2( ) ;
      ws28U2( ) ;
      we28U2( ) ;
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
      sCtrlAV73EmprcodIN = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV41BarcodIN = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV43BarcodreoIN = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV42BarcodparIN = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV37FechaCierre = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV33RecAcab = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa28U2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\recetadetinte_cierre__wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa28U2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV73EmprcodIN = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73EmprcodIN", AV73EmprcodIN);
         AV41BarcodIN = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41BarcodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarcodIN), 8, 0));
         AV43BarcodreoIN = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43BarcodreoIN", GXutil.str( AV43BarcodreoIN, 1, 0));
         AV42BarcodparIN = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarcodparIN", AV42BarcodparIN);
         AV37FechaCierre = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37FechaCierre", localUtil.format(AV37FechaCierre, "99/99/99"));
         AV33RecAcab = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33RecAcab", AV33RecAcab);
      }
      wcpOAV73EmprcodIN = httpContext.cgiGet( sPrefix+"wcpOAV73EmprcodIN") ;
      wcpOAV41BarcodIN = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV41BarcodIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV43BarcodreoIN = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV43BarcodreoIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV42BarcodparIN = httpContext.cgiGet( sPrefix+"wcpOAV42BarcodparIN") ;
      wcpOAV37FechaCierre = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV37FechaCierre"), 0) ;
      wcpOAV33RecAcab = httpContext.cgiGet( sPrefix+"wcpOAV33RecAcab") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV73EmprcodIN, wcpOAV73EmprcodIN) != 0 ) || ( AV41BarcodIN != wcpOAV41BarcodIN ) || ( AV43BarcodreoIN != wcpOAV43BarcodreoIN ) || ( GXutil.strcmp(AV42BarcodparIN, wcpOAV42BarcodparIN) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV37FechaCierre), GXutil.resetTime(wcpOAV37FechaCierre)) ) || ( GXutil.strcmp(AV33RecAcab, wcpOAV33RecAcab) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV73EmprcodIN = AV73EmprcodIN ;
      wcpOAV41BarcodIN = AV41BarcodIN ;
      wcpOAV43BarcodreoIN = AV43BarcodreoIN ;
      wcpOAV42BarcodparIN = AV42BarcodparIN ;
      wcpOAV37FechaCierre = AV37FechaCierre ;
      wcpOAV33RecAcab = AV33RecAcab ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV73EmprcodIN = httpContext.cgiGet( sPrefix+"AV73EmprcodIN_CTRL") ;
      if ( GXutil.len( sCtrlAV73EmprcodIN) > 0 )
      {
         AV73EmprcodIN = httpContext.cgiGet( sCtrlAV73EmprcodIN) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73EmprcodIN", AV73EmprcodIN);
      }
      else
      {
         AV73EmprcodIN = httpContext.cgiGet( sPrefix+"AV73EmprcodIN_PARM") ;
      }
      sCtrlAV41BarcodIN = httpContext.cgiGet( sPrefix+"AV41BarcodIN_CTRL") ;
      if ( GXutil.len( sCtrlAV41BarcodIN) > 0 )
      {
         AV41BarcodIN = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV41BarcodIN), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41BarcodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarcodIN), 8, 0));
      }
      else
      {
         AV41BarcodIN = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV41BarcodIN_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV43BarcodreoIN = httpContext.cgiGet( sPrefix+"AV43BarcodreoIN_CTRL") ;
      if ( GXutil.len( sCtrlAV43BarcodreoIN) > 0 )
      {
         AV43BarcodreoIN = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV43BarcodreoIN), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43BarcodreoIN", GXutil.str( AV43BarcodreoIN, 1, 0));
      }
      else
      {
         AV43BarcodreoIN = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV43BarcodreoIN_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV42BarcodparIN = httpContext.cgiGet( sPrefix+"AV42BarcodparIN_CTRL") ;
      if ( GXutil.len( sCtrlAV42BarcodparIN) > 0 )
      {
         AV42BarcodparIN = httpContext.cgiGet( sCtrlAV42BarcodparIN) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42BarcodparIN", AV42BarcodparIN);
      }
      else
      {
         AV42BarcodparIN = httpContext.cgiGet( sPrefix+"AV42BarcodparIN_PARM") ;
      }
      sCtrlAV37FechaCierre = httpContext.cgiGet( sPrefix+"AV37FechaCierre_CTRL") ;
      if ( GXutil.len( sCtrlAV37FechaCierre) > 0 )
      {
         AV37FechaCierre = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV37FechaCierre), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37FechaCierre", localUtil.format(AV37FechaCierre, "99/99/99"));
      }
      else
      {
         AV37FechaCierre = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV37FechaCierre_PARM"), 0) ;
      }
      sCtrlAV33RecAcab = httpContext.cgiGet( sPrefix+"AV33RecAcab_CTRL") ;
      if ( GXutil.len( sCtrlAV33RecAcab) > 0 )
      {
         AV33RecAcab = httpContext.cgiGet( sCtrlAV33RecAcab) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33RecAcab", AV33RecAcab);
      }
      else
      {
         AV33RecAcab = httpContext.cgiGet( sPrefix+"AV33RecAcab_PARM") ;
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
      pa28U2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws28U2( ) ;
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
      ws28U2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73EmprcodIN_PARM", GXutil.rtrim( AV73EmprcodIN));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV73EmprcodIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV73EmprcodIN_CTRL", GXutil.rtrim( sCtrlAV73EmprcodIN));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41BarcodIN_PARM", GXutil.ltrim( localUtil.ntoc( AV41BarcodIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV41BarcodIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41BarcodIN_CTRL", GXutil.rtrim( sCtrlAV41BarcodIN));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43BarcodreoIN_PARM", GXutil.ltrim( localUtil.ntoc( AV43BarcodreoIN, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43BarcodreoIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43BarcodreoIN_CTRL", GXutil.rtrim( sCtrlAV43BarcodreoIN));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42BarcodparIN_PARM", GXutil.rtrim( AV42BarcodparIN));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42BarcodparIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42BarcodparIN_CTRL", GXutil.rtrim( sCtrlAV42BarcodparIN));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37FechaCierre_PARM", localUtil.dtoc( AV37FechaCierre, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37FechaCierre)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37FechaCierre_CTRL", GXutil.rtrim( sCtrlAV37FechaCierre));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33RecAcab_PARM", GXutil.rtrim( AV33RecAcab));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33RecAcab)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33RecAcab_CTRL", GXutil.rtrim( sCtrlAV33RecAcab));
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
      we28U2( ) ;
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
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211555160", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/recetadetinte_cierre__wc.js", "?20268211555161", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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

   public void subsflControlProps_682( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_68_idx );
      chkavRecetadetinte_cierre_sdt__seleccionar.setInternalname( sPrefix+"RECETADETINTE_CIERRE_SDT__SELECCIONAR_"+sGXsfl_68_idx );
      cmbavRecetadetinte_cierre_sdt__pesado.setInternalname( sPrefix+"RECETADETINTE_CIERRE_SDT__PESADO_"+sGXsfl_68_idx );
      cmbavRecetadetinte_cierre_sdt__adicion.setInternalname( sPrefix+"RECETADETINTE_CIERRE_SDT__ADICION_"+sGXsfl_68_idx );
      edtavRecetadetinte_cierre_sdt__incidencias_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__INCIDENCIAS_"+sGXsfl_68_idx ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__barcod_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARCOD_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARCODREO_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARCODPAR_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__RECLINMAQ_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__barsit_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARSIT_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__baragrest_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARAGREST_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__barser_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARSER_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARSERDSC_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARCOLNOM_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARCOLNUM_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARTIPCOL_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARNOMCLI_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARNUMCLI_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__maqcod_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__MAQCOD_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__RECTOTKGM_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__RECVOLPRD_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__RECFECALT_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__barnumany_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARNUMANY_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__lconti_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__LCONTI_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__hisreh_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__HISREH_"+sGXsfl_68_idx ;
      edtavRecetadetinte_cierre_sdt__batchcode_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BATCHCODE_"+sGXsfl_68_idx ;
      cmbavRecetadetinte_cierre_sdt__recnropar.setInternalname( sPrefix+"RECETADETINTE_CIERRE_SDT__RECNROPAR_"+sGXsfl_68_idx );
      edtavRecetadetinte_cierre_sdt__weigprodid_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__WEIGPRODID_"+sGXsfl_68_idx ;
   }

   public void subsflControlProps_fel_682( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_68_fel_idx );
      chkavRecetadetinte_cierre_sdt__seleccionar.setInternalname( sPrefix+"RECETADETINTE_CIERRE_SDT__SELECCIONAR_"+sGXsfl_68_fel_idx );
      cmbavRecetadetinte_cierre_sdt__pesado.setInternalname( sPrefix+"RECETADETINTE_CIERRE_SDT__PESADO_"+sGXsfl_68_fel_idx );
      cmbavRecetadetinte_cierre_sdt__adicion.setInternalname( sPrefix+"RECETADETINTE_CIERRE_SDT__ADICION_"+sGXsfl_68_fel_idx );
      edtavRecetadetinte_cierre_sdt__incidencias_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__INCIDENCIAS_"+sGXsfl_68_fel_idx ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barcod_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARCOD_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARCODREO_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARCODPAR_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__RECLINMAQ_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barsit_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARSIT_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__baragrest_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARAGREST_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barser_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARSER_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARSERDSC_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARCOLNOM_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARCOLNUM_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARTIPCOL_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARNOMCLI_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARNUMCLI_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__maqcod_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__MAQCOD_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__RECTOTKGM_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__RECVOLPRD_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__RECFECALT_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barnumany_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARNUMANY_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__lconti_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__LCONTI_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__hisreh_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__HISREH_"+sGXsfl_68_fel_idx ;
      edtavRecetadetinte_cierre_sdt__batchcode_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BATCHCODE_"+sGXsfl_68_fel_idx ;
      cmbavRecetadetinte_cierre_sdt__recnropar.setInternalname( sPrefix+"RECETADETINTE_CIERRE_SDT__RECNROPAR_"+sGXsfl_68_fel_idx );
      edtavRecetadetinte_cierre_sdt__weigprodid_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__WEIGPRODID_"+sGXsfl_68_fel_idx ;
   }

   public void sendrow_682( )
   {
      subsflControlProps_682( ) ;
      wb28U0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_68_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_68_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_68_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 69,'"+sPrefix+"',false,'"+sGXsfl_68_idx+"',68)\"" : " ") ;
         if ( ( cmbavGrupodeacciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_68_idx ;
            cmbavGrupodeacciones.setName( GXCCtl );
            cmbavGrupodeacciones.setWebtags( "" );
            if ( cmbavGrupodeacciones.getItemCount() > 0 )
            {
               if ( ( AV83GXV1 > 0 ) && ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) && (0==AV57grupodeacciones) )
               {
                  AV57grupodeacciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV57grupodeacciones, 4, 0))))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57grupodeacciones), 4, 0));
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeacciones,cmbavGrupodeacciones.getInternalname(),GXutil.trim( GXutil.str( AV57grupodeacciones, 4, 0)),Integer.valueOf(1),cmbavGrupodeacciones.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRUPODEACCIONES.CLICK."+sGXsfl_68_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,69);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV57grupodeacciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), !bGXsfl_68_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavRecetadetinte_cierre_sdt__seleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavRecetadetinte_cierre_sdt__seleccionar.getEnabled()!=0)&&(chkavRecetadetinte_cierre_sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 70,'"+sPrefix+"',false,'"+sGXsfl_68_idx+"',68)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "RECETADETINTE_CIERRE_SDT__SELECCIONAR_" + sGXsfl_68_idx ;
         chkavRecetadetinte_cierre_sdt__seleccionar.setName( GXCCtl );
         chkavRecetadetinte_cierre_sdt__seleccionar.setWebtags( "" );
         chkavRecetadetinte_cierre_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavRecetadetinte_cierre_sdt__seleccionar.getInternalname(), "TitleCaption", chkavRecetadetinte_cierre_sdt__seleccionar.getCaption(), !bGXsfl_68_Refreshing);
         chkavRecetadetinte_cierre_sdt__seleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavRecetadetinte_cierre_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar()),"","",Integer.valueOf(chkavRecetadetinte_cierre_sdt__seleccionar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+((chkavRecetadetinte_cierre_sdt__seleccionar.getEnabled()!=0)&&(chkavRecetadetinte_cierre_sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,70);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbavRecetadetinte_cierre_sdt__pesado.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbavRecetadetinte_cierre_sdt__pesado.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "RECETADETINTE_CIERRE_SDT__PESADO_" + sGXsfl_68_idx ;
            cmbavRecetadetinte_cierre_sdt__pesado.setName( GXCCtl );
            cmbavRecetadetinte_cierre_sdt__pesado.setWebtags( "" );
            cmbavRecetadetinte_cierre_sdt__pesado.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            cmbavRecetadetinte_cierre_sdt__pesado.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            if ( cmbavRecetadetinte_cierre_sdt__pesado.getItemCount() > 0 )
            {
               if ( ( AV83GXV1 > 0 ) && ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) && (GXutil.strcmp("", ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado())==0) )
               {
                  ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado( cmbavRecetadetinte_cierre_sdt__pesado.getValidValue(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado()) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavRecetadetinte_cierre_sdt__pesado,cmbavRecetadetinte_cierre_sdt__pesado.getInternalname(),GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado()),Integer.valueOf(1),cmbavRecetadetinte_cierre_sdt__pesado.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbavRecetadetinte_cierre_sdt__pesado.getVisible()),Integer.valueOf(cmbavRecetadetinte_cierre_sdt__pesado.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavRecetadetinte_cierre_sdt__pesado.setValue( GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado()) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecetadetinte_cierre_sdt__pesado.getInternalname(), "Values", cmbavRecetadetinte_cierre_sdt__pesado.ToJavascriptSource(), !bGXsfl_68_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbavRecetadetinte_cierre_sdt__adicion.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbavRecetadetinte_cierre_sdt__adicion.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "RECETADETINTE_CIERRE_SDT__ADICION_" + sGXsfl_68_idx ;
            cmbavRecetadetinte_cierre_sdt__adicion.setName( GXCCtl );
            cmbavRecetadetinte_cierre_sdt__adicion.setWebtags( "" );
            cmbavRecetadetinte_cierre_sdt__adicion.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            cmbavRecetadetinte_cierre_sdt__adicion.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            if ( cmbavRecetadetinte_cierre_sdt__adicion.getItemCount() > 0 )
            {
               if ( ( AV83GXV1 > 0 ) && ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) && (GXutil.strcmp("", ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion())==0) )
               {
                  ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion( cmbavRecetadetinte_cierre_sdt__adicion.getValidValue(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion()) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavRecetadetinte_cierre_sdt__adicion,cmbavRecetadetinte_cierre_sdt__adicion.getInternalname(),GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion()),Integer.valueOf(1),cmbavRecetadetinte_cierre_sdt__adicion.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbavRecetadetinte_cierre_sdt__adicion.getVisible()),Integer.valueOf(cmbavRecetadetinte_cierre_sdt__adicion.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavRecetadetinte_cierre_sdt__adicion.setValue( GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion()) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecetadetinte_cierre_sdt__adicion.getInternalname(), "Values", cmbavRecetadetinte_cierre_sdt__adicion.ToJavascriptSource(), !bGXsfl_68_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__incidencias_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__incidencias_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__incidencias_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+sPrefix+"ERECETADETINTE_CIERRE_SDT__INCIDENCIAS.CLICK."+sGXsfl_68_idx+"'","","","","",edtavRecetadetinte_cierre_sdt__incidencias_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__incidencias_Columnclass,edtavRecetadetinte_cierre_sdt__incidencias_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__incidencias_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__incidencias_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 74,'"+sPrefix+"',false,'"+sGXsfl_68_idx+"',68)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV54DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,74);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVDETAILWEBCOMPONENT.CLICK."+sGXsfl_68_idx+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__barcod_Columnclass,edtavRecetadetinte_cierre_sdt__barcod_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcod_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barcodreo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcodreo_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barcodpar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barcodpar_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcodpar_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__reclinmaq_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__reclinmaq_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__reclinmaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__reclinmaq_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barsit_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barsit_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__barsit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barsit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__barsit_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barsit_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__baragrest_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__baragrest_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest()),GXutil.rtrim( localUtil.format( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+sPrefix+"ERECETADETINTE_CIERRE_SDT__BARAGREST.CLICK."+sGXsfl_68_idx+"'","","","","",edtavRecetadetinte_cierre_sdt__baragrest_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__baragrest_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__baragrest_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barser_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__barser_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barserdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barserdsc_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__barserdsc_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barcolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barcolnom_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcolnom_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barcolnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__barcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcolnum_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__bartipcol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__bartipcol_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__bartipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__bartipcol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__bartipcol_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__bartipcol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barnomcli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barnomcli_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barnomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__barnomcli_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barnomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barnumcli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barnumcli_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__barnumcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barnumcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__barnumcli_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barnumcli_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__maqcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__maqcod_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__maqcod_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__rectotkgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__rectotkgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm(), "ZZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__rectotkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__rectotkgm_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__recvolprd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__recvolprd_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd(), (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__recvolprd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd()), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd()), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__recvolprd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__recvolprd_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__recvolprd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__recfecalt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__recfecalt_Internalname,localUtil.ttoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt(), "99/99/99 99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__recfecalt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__recfecalt_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__recfecalt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barnumany_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barnumany_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany(), (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__barnumany_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany()), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany()), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barnumany_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__barnumany_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barnumany_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__lconti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__lconti_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__lconti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__lconti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__lconti_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__lconti_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__hisreh_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__hisreh_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__hisreh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__hisreh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__hisreh_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__hisreh_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__batchcode_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__batchcode_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__batchcode_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecetadetinte_cierre_sdt__batchcode_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__batchcode_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbavRecetadetinte_cierre_sdt__recnropar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbavRecetadetinte_cierre_sdt__recnropar.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "RECETADETINTE_CIERRE_SDT__RECNROPAR_" + sGXsfl_68_idx ;
            cmbavRecetadetinte_cierre_sdt__recnropar.setName( GXCCtl );
            cmbavRecetadetinte_cierre_sdt__recnropar.setWebtags( "" );
            cmbavRecetadetinte_cierre_sdt__recnropar.addItem("999999", httpContext.getMessage( "Rec. Act. Cons. Color Service", ""), (short)(0));
            cmbavRecetadetinte_cierre_sdt__recnropar.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
            if ( cmbavRecetadetinte_cierre_sdt__recnropar.getItemCount() > 0 )
            {
               if ( ( AV83GXV1 > 0 ) && ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) && (0==((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar()) )
               {
                  ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar( (int)(GXutil.lval( cmbavRecetadetinte_cierre_sdt__recnropar.getValidValue(GXutil.trim( GXutil.str( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar(), 6, 0))))) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavRecetadetinte_cierre_sdt__recnropar,cmbavRecetadetinte_cierre_sdt__recnropar.getInternalname(),GXutil.trim( GXutil.str( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar(), 6, 0)),Integer.valueOf(1),cmbavRecetadetinte_cierre_sdt__recnropar.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbavRecetadetinte_cierre_sdt__recnropar.getVisible()),Integer.valueOf(cmbavRecetadetinte_cierre_sdt__recnropar.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavRecetadetinte_cierre_sdt__recnropar.setValue( GXutil.trim( GXutil.str( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar(), 6, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecetadetinte_cierre_sdt__recnropar.getInternalname(), "Values", cmbavRecetadetinte_cierre_sdt__recnropar.ToJavascriptSource(), !bGXsfl_68_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__weigprodid_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__weigprodid_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid(), (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__weigprodid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid()), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid()), "ZZZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__weigprodid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__weigprodid_Columnclass,edtavRecetadetinte_cierre_sdt__weigprodid_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__weigprodid_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__weigprodid_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes28U2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_68_idx = ((subGrid_Islastpage==1)&&(nGXsfl_68_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_68_idx+1) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_682( ) ;
      }
      /* End function sendrow_682 */
   }

   public void startgridcontrol68( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"68\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavRecetadetinte_cierre_sdt__seleccionar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavRecetadetinte_cierre_sdt__pesado.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavRecetadetinte_cierre_sdt__adicion.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ad?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__incidencias_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Err", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barcodreo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barcodpar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__reclinmaq_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barsit_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sit.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__baragrest_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barserdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barcolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barcolnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__bartipcol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barnomcli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barnumcli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__maqcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__rectotkgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Tot.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__recvolprd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__recfecalt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fech. Alta", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barnumany_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Añad.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__lconti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lconti", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__hisreh_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hisreh", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__batchcode_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Batch Code", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavRecetadetinte_cierre_sdt__recnropar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Service", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__weigprodid_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ID CS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV57grupodeacciones, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavRecetadetinte_cierre_sdt__seleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavRecetadetinte_cierre_sdt__pesado.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavRecetadetinte_cierre_sdt__pesado.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavRecetadetinte_cierre_sdt__adicion.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavRecetadetinte_cierre_sdt__adicion.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__incidencias_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__incidencias_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__incidencias_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__incidencias_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV54DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barcod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barcod_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcodreo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcodpar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__reclinmaq_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barsit_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barsit_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__baragrest_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__baragrest_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barserdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcolnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__bartipcol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__bartipcol_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barnomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barnomcli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barnumcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barnumcli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__maqcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__rectotkgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__recvolprd_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__recvolprd_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__recfecalt_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__recfecalt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barnumany_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barnumany_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__lconti_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__lconti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__hisreh_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__hisreh_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__batchcode_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__batchcode_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavRecetadetinte_cierre_sdt__recnropar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavRecetadetinte_cierre_sdt__recnropar.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__weigprodid_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__weigprodid_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__weigprodid_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__weigprodid_Visible, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblockfechacierre_Internalname = sPrefix+"TEXTBLOCKFECHACIERRE" ;
      edtavFechacierre_Internalname = sPrefix+"vFECHACIERRE" ;
      divUnnamedtablefechacierre_Internalname = sPrefix+"UNNAMEDTABLEFECHACIERRE" ;
      lblTextblocknumeroregistros_Internalname = sPrefix+"TEXTBLOCKNUMEROREGISTROS" ;
      edtavNumeroregistros_Internalname = sPrefix+"vNUMEROREGISTROS" ;
      divUnnamedtablenumeroregistros_Internalname = sPrefix+"UNNAMEDTABLENUMEROREGISTROS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      Barradeprogreso_Internalname = sPrefix+"BARRADEPROGRESO" ;
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES" );
      chkavRecetadetinte_cierre_sdt__seleccionar.setInternalname( sPrefix+"RECETADETINTE_CIERRE_SDT__SELECCIONAR" );
      cmbavRecetadetinte_cierre_sdt__pesado.setInternalname( sPrefix+"RECETADETINTE_CIERRE_SDT__PESADO" );
      cmbavRecetadetinte_cierre_sdt__adicion.setInternalname( sPrefix+"RECETADETINTE_CIERRE_SDT__ADICION" );
      edtavRecetadetinte_cierre_sdt__incidencias_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__INCIDENCIAS" ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtavRecetadetinte_cierre_sdt__barcod_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARCOD" ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARCODREO" ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARCODPAR" ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__RECLINMAQ" ;
      edtavRecetadetinte_cierre_sdt__barsit_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARSIT" ;
      edtavRecetadetinte_cierre_sdt__baragrest_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARAGREST" ;
      edtavRecetadetinte_cierre_sdt__barser_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARSER" ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARSERDSC" ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARCOLNOM" ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARCOLNUM" ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARTIPCOL" ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARNOMCLI" ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARNUMCLI" ;
      edtavRecetadetinte_cierre_sdt__maqcod_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__MAQCOD" ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__RECTOTKGM" ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__RECVOLPRD" ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__RECFECALT" ;
      edtavRecetadetinte_cierre_sdt__barnumany_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BARNUMANY" ;
      edtavRecetadetinte_cierre_sdt__lconti_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__LCONTI" ;
      edtavRecetadetinte_cierre_sdt__hisreh_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__HISREH" ;
      edtavRecetadetinte_cierre_sdt__batchcode_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__BATCHCODE" ;
      cmbavRecetadetinte_cierre_sdt__recnropar.setInternalname( sPrefix+"RECETADETINTE_CIERRE_SDT__RECNROPAR" );
      edtavRecetadetinte_cierre_sdt__weigprodid_Internalname = sPrefix+"RECETADETINTE_CIERRE_SDT__WEIGPRODID" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_anyadirproductos_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS" ;
      tblTabledvelop_confirmpanel_anyadirproductos_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS" ;
      Dvelop_confirmpanel_confirmar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtavRecetadetinte_cierre_sdt__weigprodid_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__weigprodid_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__weigprodid_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__weigprodid_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__weigprodid_Visible = -1 ;
      cmbavRecetadetinte_cierre_sdt__recnropar.setJsonclick( "" );
      cmbavRecetadetinte_cierre_sdt__recnropar.setEnabled( 0 );
      cmbavRecetadetinte_cierre_sdt__recnropar.setVisible( -1 );
      edtavRecetadetinte_cierre_sdt__batchcode_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__batchcode_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__batchcode_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__hisreh_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__hisreh_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__hisreh_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__lconti_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__lconti_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__lconti_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barnumany_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barnumany_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barnumany_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__maqcod_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__maqcod_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__maqcod_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barser_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barser_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barser_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__baragrest_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__baragrest_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__baragrest_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barsit_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barsit_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barsit_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcod_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barcod_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__barcod_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__barcod_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcod_Visible = -1 ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      edtavRecetadetinte_cierre_sdt__incidencias_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__incidencias_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__incidencias_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__incidencias_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__incidencias_Visible = -1 ;
      cmbavRecetadetinte_cierre_sdt__adicion.setJsonclick( "" );
      cmbavRecetadetinte_cierre_sdt__adicion.setEnabled( 0 );
      cmbavRecetadetinte_cierre_sdt__adicion.setVisible( -1 );
      cmbavRecetadetinte_cierre_sdt__pesado.setJsonclick( "" );
      cmbavRecetadetinte_cierre_sdt__pesado.setEnabled( 0 );
      cmbavRecetadetinte_cierre_sdt__pesado.setVisible( -1 );
      chkavRecetadetinte_cierre_sdt__seleccionar.setCaption( "" );
      chkavRecetadetinte_cierre_sdt__seleccionar.setEnabled( 1 );
      chkavRecetadetinte_cierre_sdt__seleccionar.setVisible( -1 );
      cmbavGrupodeacciones.setJsonclick( "" );
      cmbavGrupodeacciones.setVisible( -1 );
      cmbavGrupodeacciones.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavRecetadetinte_cierre_sdt__weigprodid_Visible = -1 ;
      cmbavRecetadetinte_cierre_sdt__recnropar.setVisible( -1 );
      edtavRecetadetinte_cierre_sdt__batchcode_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__hisreh_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__lconti_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barnumany_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__maqcod_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barser_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__baragrest_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barsit_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcod_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__incidencias_Visible = -1 ;
      cmbavRecetadetinte_cierre_sdt__adicion.setVisible( -1 );
      cmbavRecetadetinte_cierre_sdt__pesado.setVisible( -1 );
      chkavRecetadetinte_cierre_sdt__seleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavRecetadetinte_cierre_sdt__weigprodid_Enabled = -1 ;
      cmbavRecetadetinte_cierre_sdt__recnropar.setEnabled( -1 );
      edtavRecetadetinte_cierre_sdt__batchcode_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__hisreh_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__lconti_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barnumany_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__maqcod_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barser_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__baragrest_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barsit_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barcod_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__incidencias_Enabled = -1 ;
      cmbavRecetadetinte_cierre_sdt__adicion.setEnabled( -1 );
      cmbavRecetadetinte_cierre_sdt__pesado.setEnabled( -1 );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      edtavNumeroregistros_Jsonclick = "" ;
      edtavNumeroregistros_Enabled = 1 ;
      edtavFechacierre_Jsonclick = "" ;
      edtavFechacierre_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Desea Confirmar?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Dvelop_confirmpanel_anyadirproductos_Confirmtype = "1" ;
      Dvelop_confirmpanel_anyadirproductos_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_anyadirproductos_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_anyadirproductos_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_anyadirproductos_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_anyadirproductos_Confirmationtext = "¿Confirma?" ;
      Dvelop_confirmpanel_anyadirproductos_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||||||||||||||||||||" ;
      Ddo_grid_Columnids = "1:RecetadeTinte_Cierre_SDT__Seleccionar|2:RecetadeTinte_Cierre_SDT__Pesado|3:RecetadeTinte_Cierre_SDT__Adicion|4:RecetadeTinte_Cierre_SDT__Incidencias|6:RecetadeTinte_Cierre_SDT__Barcod|7:RecetadeTinte_Cierre_SDT__Barcodreo|8:RecetadeTinte_Cierre_SDT__Barcodpar|9:RecetadeTinte_Cierre_SDT__RecLinMaq|10:RecetadeTinte_Cierre_SDT__BarSit|11:RecetadeTinte_Cierre_SDT__BarAgrEst|12:RecetadeTinte_Cierre_SDT__Barser|13:RecetadeTinte_Cierre_SDT__Barserdsc|14:RecetadeTinte_Cierre_SDT__Barcolnom|15:RecetadeTinte_Cierre_SDT__Barcolnum|16:RecetadeTinte_Cierre_SDT__Bartipcol|17:RecetadeTinte_Cierre_SDT__Barnomcli|18:RecetadeTinte_Cierre_SDT__Barnumcli|19:RecetadeTinte_Cierre_SDT__Maqcod|20:RecetadeTinte_Cierre_SDT__Rectotkgm|21:RecetadeTinte_Cierre_SDT__RecVolprd|22:RecetadeTinte_Cierre_SDT__RecFecAlt|23:RecetadeTinte_Cierre_SDT__BarNumAny|24:RecetadeTinte_Cierre_SDT__Lconti|25:RecetadeTinte_Cierre_SDT__Hisreh|26:RecetadeTinte_Cierre_SDT__BatchCode|27:RecetadeTinte_Cierre_SDT__RecNroPar|28:RecetadeTinte_Cierre_SDT__WeigProdID" ;
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
      GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_68_idx ;
      cmbavGrupodeacciones.setName( GXCCtl );
      cmbavGrupodeacciones.setWebtags( "" );
      if ( cmbavGrupodeacciones.getItemCount() > 0 )
      {
         if ( ( AV83GXV1 > 0 ) && ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) && (0==AV57grupodeacciones) )
         {
         }
      }
      GXCCtl = "RECETADETINTE_CIERRE_SDT__SELECCIONAR_" + sGXsfl_68_idx ;
      chkavRecetadetinte_cierre_sdt__seleccionar.setName( GXCCtl );
      chkavRecetadetinte_cierre_sdt__seleccionar.setWebtags( "" );
      chkavRecetadetinte_cierre_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavRecetadetinte_cierre_sdt__seleccionar.getInternalname(), "TitleCaption", chkavRecetadetinte_cierre_sdt__seleccionar.getCaption(), !bGXsfl_68_Refreshing);
      chkavRecetadetinte_cierre_sdt__seleccionar.setCheckedValue( "false" );
      GXCCtl = "RECETADETINTE_CIERRE_SDT__PESADO_" + sGXsfl_68_idx ;
      cmbavRecetadetinte_cierre_sdt__pesado.setName( GXCCtl );
      cmbavRecetadetinte_cierre_sdt__pesado.setWebtags( "" );
      cmbavRecetadetinte_cierre_sdt__pesado.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbavRecetadetinte_cierre_sdt__pesado.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbavRecetadetinte_cierre_sdt__pesado.getItemCount() > 0 )
      {
         if ( ( AV83GXV1 > 0 ) && ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) && (GXutil.strcmp("", ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado())==0) )
         {
         }
      }
      GXCCtl = "RECETADETINTE_CIERRE_SDT__ADICION_" + sGXsfl_68_idx ;
      cmbavRecetadetinte_cierre_sdt__adicion.setName( GXCCtl );
      cmbavRecetadetinte_cierre_sdt__adicion.setWebtags( "" );
      cmbavRecetadetinte_cierre_sdt__adicion.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbavRecetadetinte_cierre_sdt__adicion.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbavRecetadetinte_cierre_sdt__adicion.getItemCount() > 0 )
      {
         if ( ( AV83GXV1 > 0 ) && ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) && (GXutil.strcmp("", ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion())==0) )
         {
         }
      }
      GXCCtl = "RECETADETINTE_CIERRE_SDT__RECNROPAR_" + sGXsfl_68_idx ;
      cmbavRecetadetinte_cierre_sdt__recnropar.setName( GXCCtl );
      cmbavRecetadetinte_cierre_sdt__recnropar.setWebtags( "" );
      cmbavRecetadetinte_cierre_sdt__recnropar.addItem("999999", httpContext.getMessage( "Rec. Act. Cons. Color Service", ""), (short)(0));
      cmbavRecetadetinte_cierre_sdt__recnropar.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
      if ( cmbavRecetadetinte_cierre_sdt__recnropar.getItemCount() > 0 )
      {
         if ( ( AV83GXV1 > 0 ) && ( AV13RecetadeTinte_Cierre_SDT.size() >= AV83GXV1 ) && (0==((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV13RecetadeTinte_Cierre_SDT.elementAt(-1+AV83GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar()) )
         {
         }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73EmprcodIN',fld:'vEMPRCODIN',pic:''},{av:'AV41BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV43BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV42BarcodparIN',fld:'vBARCODPARIN',pic:''},{av:'AV37FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV33RecAcab',fld:'vRECACAB',pic:''},{av:'AV13RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:68,pic:'',hsh:true},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'AV51colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV49clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV74SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true},{av:'AV38RecetadeTinte_Cierre_SDT_json',fld:'vRECETADETINTE_CIERRE_SDT_JSON',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Columnheaderclass'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1328U2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73EmprcodIN',fld:'vEMPRCODIN',pic:''},{av:'AV41BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV43BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV42BarcodparIN',fld:'vBARCODPARIN',pic:''},{av:'AV37FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV33RecAcab',fld:'vRECACAB',pic:''},{av:'AV13RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:68,pic:'',hsh:true},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'AV51colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV49clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV74SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true},{av:'AV38RecetadeTinte_Cierre_SDT_json',fld:'vRECETADETINTE_CIERRE_SDT_JSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1428U2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73EmprcodIN',fld:'vEMPRCODIN',pic:''},{av:'AV41BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV43BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV42BarcodparIN',fld:'vBARCODPARIN',pic:''},{av:'AV37FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV33RecAcab',fld:'vRECACAB',pic:''},{av:'AV13RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:68,pic:'',hsh:true},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'AV51colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV49clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV74SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true},{av:'AV38RecetadeTinte_Cierre_SDT_json',fld:'vRECETADETINTE_CIERRE_SDT_JSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2228U2',iparms:[{av:'AV13RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:68,pic:'',hsh:true},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV57grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV54DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1528U2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73EmprcodIN',fld:'vEMPRCODIN',pic:''},{av:'AV41BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV43BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV42BarcodparIN',fld:'vBARCODPARIN',pic:''},{av:'AV37FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV33RecAcab',fld:'vRECACAB',pic:''},{av:'AV13RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:68,pic:'',hsh:true},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'AV51colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV49clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV74SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true},{av:'AV38RecetadeTinte_Cierre_SDT_json',fld:'vRECETADETINTE_CIERRE_SDT_JSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Columnheaderclass'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1228U2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73EmprcodIN',fld:'vEMPRCODIN',pic:''},{av:'AV41BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV43BarcodreoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV42BarcodparIN',fld:'vBARCODPARIN',pic:''},{av:'AV37FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV33RecAcab',fld:'vRECACAB',pic:''},{av:'AV13RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:68,pic:'',hsh:true},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'AV51colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV49clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV74SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true},{av:'AV38RecetadeTinte_Cierre_SDT_json',fld:'vRECETADETINTE_CIERRE_SDT_JSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Columnheaderclass'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRUPODEACCIONES.CLICK","{handler:'e2328U2',iparms:[{av:'cmbavGrupodeacciones'},{av:'AV57grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV13RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:68,pic:'',hsh:true},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'AV51colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("VGRUPODEACCIONES.CLICK",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV57grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_anyadirproductos_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS.CLOSE","{handler:'e1628U2',iparms:[{av:'Dvelop_confirmpanel_anyadirproductos_Result',ctrl:'DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS',prop:'Result'},{av:'AV13RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:68,pic:'',hsh:true},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'AV51colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV49clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV77RecHayAny',fld:'vRECHAYANY',pic:''},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV34Station',fld:'vSTATION',pic:''},{av:'AV55FecCieTin',fld:'vFECCIETIN',pic:''},{av:'AV52Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'AV48Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9'},{av:'AV37FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV56FlagM',fld:'vFLAGM',pic:'9'},{av:'AV65Recfec',fld:'vRECFEC',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS.CLOSE",",oparms:[{av:'AV77RecHayAny',fld:'vRECHAYANY',pic:''},{av:'AV65Recfec',fld:'vRECFEC',pic:''},{av:'AV56FlagM',fld:'vFLAGM',pic:'9'},{av:'AV37FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV48Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9'},{av:'AV52Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'AV55FecCieTin',fld:'vFECCIETIN',pic:''},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1128U1',iparms:[]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e1728U2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV13RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:68,pic:'',hsh:true},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV111Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV34Station',fld:'vSTATION',pic:''},{av:'AV52Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'AV48Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9'},{av:'AV62productosconsumos',fld:'vPRODUCTOSCONSUMOS',pic:''},{av:'AV59j',fld:'vJ',pic:'ZZZ9'},{av:'AV37FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV74SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV37FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV34Station',fld:'vSTATION',pic:''},{av:'AV36UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV59j',fld:'vJ',pic:'ZZZ9'},{av:'AV62productosconsumos',fld:'vPRODUCTOSCONSUMOS',pic:''},{av:'AV48Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9'},{av:'AV52Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1828U2',iparms:[{av:'AV38RecetadeTinte_Cierre_SDT_json',fld:'vRECETADETINTE_CIERRE_SDT_JSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1928U2',iparms:[{av:'AV38RecetadeTinte_Cierre_SDT_json',fld:'vRECETADETINTE_CIERRE_SDT_JSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e2428U2',iparms:[{av:'AV13RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:68,pic:'',hsh:true},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("RECETADETINTE_CIERRE_SDT__INCIDENCIAS.CLICK","{handler:'e2528U2',iparms:[{av:'AV13RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:68,pic:'',hsh:true},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("RECETADETINTE_CIERRE_SDT__INCIDENCIAS.CLICK",",oparms:[]}");
      setEventMetadata("RECETADETINTE_CIERRE_SDT__BARAGREST.CLICK","{handler:'e2628U2',iparms:[{av:'AV13RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:68,pic:'',hsh:true},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("RECETADETINTE_CIERRE_SDT__BARAGREST.CLICK",",oparms:[]}");
      setEventMetadata("RECETADETINTE_CIERRE_SDT__SELECCIONAR.CLICK","{handler:'e2728U2',iparms:[{av:'AV13RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:68,pic:'',hsh:true},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68}]");
      setEventMetadata("RECETADETINTE_CIERRE_SDT__SELECCIONAR.CLICK",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv28',iparms:[]");
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
      wcpOAV73EmprcodIN = "" ;
      wcpOAV42BarcodparIN = "" ;
      wcpOAV37FechaCierre = GXutil.nullDate() ;
      wcpOAV33RecAcab = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_anyadirproductos_Result = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV73EmprcodIN = "" ;
      AV42BarcodparIN = "" ;
      AV37FechaCierre = GXutil.nullDate() ;
      AV33RecAcab = "" ;
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV111Pgmname = "" ;
      AV12FilterFullText = "" ;
      AV13RecetadeTinte_Cierre_SDT = new GXBaseCollection<app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item>(app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV38RecetadeTinte_Cierre_SDT_json = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV21ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV24DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV29Emprcod = "" ;
      AV77RecHayAny = "" ;
      AV36UsurCod = "" ;
      AV34Station = "" ;
      AV55FecCieTin = GXutil.nullDate() ;
      AV65Recfec = GXutil.nullDate() ;
      AV62productosconsumos = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      lblTextblockfechacierre_Jsonclick = "" ;
      lblTextblocknumeroregistros_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV54DetailWebComponent = "" ;
      hsh = "" ;
      AV35EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXt_dtime11 = GXutil.resetTime( GXutil.nullDate() );
      AV75FechaCierreHasta = GXutil.nullDate() ;
      GXt_dtime12 = GXutil.resetTime( GXutil.nullDate() );
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext13 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22ManageFiltersXml = "" ;
      AV63ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV71websession = httpContext.getWebSession();
      AV14ExcelFilename = "" ;
      AV15ErrorMessage = "" ;
      AV46BatchCode = "" ;
      AV32Barcodpar = "" ;
      AV17UserCustomValue = "" ;
      GXt_char1 = "" ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector14 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = new GXBaseCollection[1] ;
      ucDvelop_confirmpanel_anyadirproductos = new com.genexus.webpanels.GXUserControl();
      AV60MaqCod = "" ;
      AV68RecTotKgm = DecimalUtil.ZERO ;
      AV44barnhdr = "" ;
      AV58Inc_obs = "" ;
      AV79messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV80message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV64RecetadeTinte_Cierre_SDT_item = new app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item(remoteHandle, context);
      GXv_objcol_SdtMessages_Message18 = new GXBaseCollection[1] ;
      AV47Ca_diahora = GXutil.resetTime( GXutil.nullDate() );
      GXv_char4 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int19 = new byte[1] ;
      GXv_int20 = new short[1] ;
      GXv_int21 = new short[1] ;
      GXv_char22 = new String[1] ;
      GXv_char23 = new String[1] ;
      GXv_char24 = new String[1] ;
      GXv_dtime25 = new java.util.Date[1] ;
      GXv_int26 = new byte[1] ;
      GXv_char27 = new String[1] ;
      GXv_int28 = new int[1] ;
      GXv_char29 = new String[1] ;
      GXv_char30 = new String[1] ;
      GXv_date31 = new java.util.Date[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState32 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV39Window = new com.genexus.webpanels.GXWindow();
      AV40BarAgrEst = "" ;
      Gx_msg = "" ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV73EmprcodIN = "" ;
      sCtrlAV41BarcodIN = "" ;
      sCtrlAV43BarcodreoIN = "" ;
      sCtrlAV42BarcodparIN = "" ;
      sCtrlAV37FechaCierre = "" ;
      sCtrlAV33RecAcab = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetinte_cierre__wc__default(),
         new Object[] {
         }
      );
      AV111Pgmname = "FormulacionTinte.RecetadeTinte_Cierre__WC" ;
      /* GeneXus formulas. */
      AV111Pgmname = "FormulacionTinte.RecetadeTinte_Cierre__WC" ;
      Gx_err = (short)(0) ;
      edtavFechacierre_Enabled = 0 ;
      edtavNumeroregistros_Enabled = 0 ;
      cmbavRecetadetinte_cierre_sdt__pesado.setEnabled( 0 );
      cmbavRecetadetinte_cierre_sdt__adicion.setEnabled( 0 );
      edtavRecetadetinte_cierre_sdt__incidencias_Enabled = 0 ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcod_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barsit_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__baragrest_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barser_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__maqcod_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barnumany_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__lconti_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__hisreh_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__batchcode_Enabled = 0 ;
      cmbavRecetadetinte_cierre_sdt__recnropar.setEnabled( 0 );
      edtavRecetadetinte_cierre_sdt__weigprodid_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV43BarcodreoIN ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV43BarcodreoIN ;
   private byte AV23ManageFiltersExecutionStep ;
   private byte AV48Cc_almcod ;
   private byte AV56FlagM ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte AV31Barcodreo ;
   private byte AV76RecNumAny ;
   private byte GXv_int8[] ;
   private byte GXv_int19[] ;
   private byte GXv_int26[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV51colorservicecontador ;
   private short AV49clienteModa21 ;
   private short AV74SiCSV ;
   private short AV52Consumos ;
   private short AV59j ;
   private short wbEnd ;
   private short wbStart ;
   private short AV57grupodeacciones ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV66reclinmaq ;
   private short AV50Colorservice ;
   private short AV45barnumany ;
   private short AV70t ;
   private short GXv_int20[] ;
   private short GXv_int21[] ;
   private int wcpOAV41BarcodIN ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_68 ;
   private int AV41BarcodIN ;
   private int nGXsfl_68_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavFechacierre_Enabled ;
   private int edtavNumeroregistros_Enabled ;
   private int AV83GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavRecetadetinte_cierre_sdt__incidencias_Enabled ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barcod_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barcodreo_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barcodpar_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barsit_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__baragrest_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barser_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barserdsc_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barcolnom_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barcolnum_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__bartipcol_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barnomcli_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barnumcli_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__maqcod_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__recvolprd_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__recfecalt_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barnumany_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__lconti_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__hisreh_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__batchcode_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__weigprodid_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_68_fel_idx=1 ;
   private int AV53ContVal ;
   private int GXt_int9 ;
   private int edtavRecetadetinte_cierre_sdt__incidencias_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barcod_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barcodreo_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barcodpar_Visible ;
   private int edtavRecetadetinte_cierre_sdt__reclinmaq_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barsit_Visible ;
   private int edtavRecetadetinte_cierre_sdt__baragrest_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barser_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barserdsc_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barcolnom_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barcolnum_Visible ;
   private int edtavRecetadetinte_cierre_sdt__bartipcol_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barnomcli_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barnumcli_Visible ;
   private int edtavRecetadetinte_cierre_sdt__maqcod_Visible ;
   private int edtavRecetadetinte_cierre_sdt__rectotkgm_Visible ;
   private int edtavRecetadetinte_cierre_sdt__recvolprd_Visible ;
   private int edtavRecetadetinte_cierre_sdt__recfecalt_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barnumany_Visible ;
   private int edtavRecetadetinte_cierre_sdt__lconti_Visible ;
   private int edtavRecetadetinte_cierre_sdt__hisreh_Visible ;
   private int edtavRecetadetinte_cierre_sdt__batchcode_Visible ;
   private int edtavRecetadetinte_cierre_sdt__weigprodid_Visible ;
   private int AV25PageToGo ;
   private int AV30Barcod ;
   private int AV67RecNroPar ;
   private int AV69RecVolPrd ;
   private int AV112GXV29 ;
   private int AV113GXV30 ;
   private int AV114GXV31 ;
   private int GXv_int10[] ;
   private int GXv_int28[] ;
   private int AV115GXV32 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV26GridCurrentPage ;
   private long AV27GridPageCount ;
   private long AV61Numeroregistros ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV68RecTotKgm ;
   private String wcpOAV73EmprcodIN ;
   private String wcpOAV42BarcodparIN ;
   private String wcpOAV33RecAcab ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_anyadirproductos_Result ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV73EmprcodIN ;
   private String AV42BarcodparIN ;
   private String AV33RecAcab ;
   private String sGXsfl_68_idx="0001" ;
   private String AV111Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV29Emprcod ;
   private String AV77RecHayAny ;
   private String AV36UsurCod ;
   private String AV34Station ;
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
   private String Dvelop_confirmpanel_anyadirproductos_Title ;
   private String Dvelop_confirmpanel_anyadirproductos_Confirmationtext ;
   private String Dvelop_confirmpanel_anyadirproductos_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_anyadirproductos_Nobuttoncaption ;
   private String Dvelop_confirmpanel_anyadirproductos_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_anyadirproductos_Yesbuttonposition ;
   private String Dvelop_confirmpanel_anyadirproductos_Confirmtype ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
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
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divUnnamedtablefechacierre_Internalname ;
   private String lblTextblockfechacierre_Internalname ;
   private String lblTextblockfechacierre_Jsonclick ;
   private String edtavFechacierre_Internalname ;
   private String edtavFechacierre_Jsonclick ;
   private String divUnnamedtablenumeroregistros_Internalname ;
   private String lblTextblocknumeroregistros_Internalname ;
   private String lblTextblocknumeroregistros_Jsonclick ;
   private String edtavNumeroregistros_Internalname ;
   private String edtavNumeroregistros_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV54DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__incidencias_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barcod_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barcodreo_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barcodpar_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__reclinmaq_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barsit_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__baragrest_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barser_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barserdsc_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barcolnom_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barcolnum_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__bartipcol_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barnomcli_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barnumcli_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__maqcod_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__rectotkgm_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__recvolprd_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__recfecalt_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barnumany_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__lconti_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__hisreh_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__batchcode_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__weigprodid_Internalname ;
   private String sGXsfl_68_fel_idx="0001" ;
   private String edtavFilterfulltext_Internalname ;
   private String hsh ;
   private String AV35EmprNom ;
   private String edtavRecetadetinte_cierre_sdt__incidencias_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__barcod_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__weigprodid_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__incidencias_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__barcod_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__weigprodid_Columnclass ;
   private String AV46BatchCode ;
   private String AV32Barcodpar ;
   private String GXt_char1 ;
   private String Dvelop_confirmpanel_anyadirproductos_Internalname ;
   private String AV60MaqCod ;
   private String AV44barnhdr ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char22[] ;
   private String GXv_char23[] ;
   private String GXv_char24[] ;
   private String GXv_char27[] ;
   private String GXv_char29[] ;
   private String GXv_char30[] ;
   private String AV40BarAgrEst ;
   private String Gx_msg ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String tblTabledvelop_confirmpanel_anyadirproductos_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV73EmprcodIN ;
   private String sCtrlAV41BarcodIN ;
   private String sCtrlAV43BarcodreoIN ;
   private String sCtrlAV42BarcodparIN ;
   private String sCtrlAV37FechaCierre ;
   private String sCtrlAV33RecAcab ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavRecetadetinte_cierre_sdt__incidencias_Jsonclick ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barcod_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barcodreo_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barcodpar_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__reclinmaq_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barsit_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__baragrest_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barser_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barserdsc_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barcolnom_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barcolnum_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__bartipcol_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barnomcli_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barnumcli_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__maqcod_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__rectotkgm_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__recvolprd_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__recfecalt_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barnumany_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__lconti_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__hisreh_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__batchcode_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__weigprodid_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date GXt_dtime11 ;
   private java.util.Date GXt_dtime12 ;
   private java.util.Date AV47Ca_diahora ;
   private java.util.Date GXv_dtime25[] ;
   private java.util.Date wcpOAV37FechaCierre ;
   private java.util.Date AV37FechaCierre ;
   private java.util.Date AV55FecCieTin ;
   private java.util.Date AV65Recfec ;
   private java.util.Date AV75FechaCierreHasta ;
   private java.util.Date GXv_date31[] ;
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
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_68_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV68 ;
   private boolean gx_refresh_fired ;
   private boolean bDynCreated_Grid_dwc ;
   private String AV38RecetadeTinte_Cierre_SDT_json ;
   private String AV16ColumnsSelectorXML ;
   private String AV22ManageFiltersXml ;
   private String AV17UserCustomValue ;
   private String AV12FilterFullText ;
   private String AV62productosconsumos ;
   private String AV14ExcelFilename ;
   private String AV15ErrorMessage ;
   private String AV58Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.GXWindow AV39Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_anyadirproductos ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGrupodeacciones ;
   private ICheckbox chkavRecetadetinte_cierre_sdt__seleccionar ;
   private HTMLChoice cmbavRecetadetinte_cierre_sdt__pesado ;
   private HTMLChoice cmbavRecetadetinte_cierre_sdt__adicion ;
   private HTMLChoice cmbavRecetadetinte_cierre_sdt__recnropar ;
   private IDataStoreProvider pr_default ;
   private com.genexus.webpanels.WebSession AV71websession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV21ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item16 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item17[] ;
   private GXBaseCollection<app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item> AV13RecetadeTinte_Cierre_SDT ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV79messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message18[] ;
   private com.genexus.SdtMessages_Message AV80message ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector14[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV24DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState32[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV63ProgressIndicator ;
   private app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item AV64RecetadeTinte_Cierre_SDT_item ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext13[] ;
}

final  class recetadetinte_cierre__wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

