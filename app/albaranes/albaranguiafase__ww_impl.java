package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class albaranguiafase__ww_impl extends GXWebComponent
{
   public albaranguiafase__ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public albaranguiafase__ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaranguiafase__ww_impl.class ));
   }

   public albaranguiafase__ww_impl( int remoteHandle ,
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
      cmbAlbEnvFtp = new HTMLChoice();
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
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
               AV43VisualizarAcciones = GXutil.strtobool( httpContext.GetPar( "VisualizarAcciones")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43VisualizarAcciones", AV43VisualizarAcciones);
               AV46AccionesEnPopup = GXutil.strtobool( httpContext.GetPar( "AccionesEnPopup")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46AccionesEnPopup", AV46AccionesEnPopup);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Long.valueOf(A30AlbProCod),Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar,Boolean.valueOf(AV43VisualizarAcciones),Boolean.valueOf(AV46AccionesEnPopup)});
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
            if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
            {
               A396EmprCod = gxfirstwebparm ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
               {
                  A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                  A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                  A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                  A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
                  AV43VisualizarAcciones = GXutil.strtobool( httpContext.GetPar( "VisualizarAcciones")) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43VisualizarAcciones", AV43VisualizarAcciones);
                  AV46AccionesEnPopup = GXutil.strtobool( httpContext.GetPar( "AccionesEnPopup")) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46AccionesEnPopup", AV46AccionesEnPopup);
               }
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
      nRC_GXsfl_84 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_84"))) ;
      nGXsfl_84_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_84_idx"))) ;
      sGXsfl_84_idx = httpContext.GetPar( "sGXsfl_84_idx") ;
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
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV23ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV18ColumnsSelector);
      AV24TFGuiFasLin = (short)(GXutil.lval( httpContext.GetPar( "TFGuiFasLin"))) ;
      AV25TFGuiFasLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFGuiFasLin_To"))) ;
      AV26TFFasCod = httpContext.GetPar( "TFFasCod") ;
      AV27TFFasCod_Sel = httpContext.GetPar( "TFFasCod_Sel") ;
      AV28TFFasDsc = httpContext.GetPar( "TFFasDsc") ;
      AV29TFFasDsc_Sel = httpContext.GetPar( "TFFasDsc_Sel") ;
      AV32TFGuiFasPKg = CommonUtil.decimalVal( httpContext.GetPar( "TFGuiFasPKg"), ".") ;
      AV33TFGuiFasPKg_To = CommonUtil.decimalVal( httpContext.GetPar( "TFGuiFasPKg_To"), ".") ;
      AV36TFGuiFasPMt = CommonUtil.decimalVal( httpContext.GetPar( "TFGuiFasPMt"), ".") ;
      AV37TFGuiFasPMt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFGuiFasPMt_To"), ".") ;
      AV30TFFasKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFFasKgm"), ".") ;
      AV31TFFasKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFasKgm_To"), ".") ;
      AV34TFFasMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFFasMtr"), ".") ;
      AV35TFFasMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFasMtr_To"), ".") ;
      AV46AccionesEnPopup = GXutil.strtobool( httpContext.GetPar( "AccionesEnPopup")) ;
      AV43VisualizarAcciones = GXutil.strtobool( httpContext.GetPar( "VisualizarAcciones")) ;
      AV49Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV24TFGuiFasLin, AV25TFGuiFasLin_To, AV26TFFasCod, AV27TFFasCod_Sel, AV28TFFasDsc, AV29TFFasDsc_Sel, AV32TFGuiFasPKg, AV33TFGuiFasPKg_To, AV36TFGuiFasPMt, AV37TFGuiFasPMt_To, AV30TFFasKgm, AV31TFFasKgm_To, AV34TFFasMtr, AV35TFFasMtr_To, AV46AccionesEnPopup, AV43VisualizarAcciones, AV49Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1XD2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws1XD2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  we1XD2( ) ;
               }
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
         httpContext.writeValue( httpContext.getMessage( " Guia / Fases", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.albaranes.albaranguiafase__ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.booltostr(AV43VisualizarAcciones)),GXutil.URLEncode(GXutil.booltostr(AV46AccionesEnPopup))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","VisualizarAcciones","AccionesEnPopup"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AlbaranGuiaFase__WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV49Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("albaranes\\albaranguiafase__ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA30AlbProCod", GXutil.ltrim( localUtil.ntoc( wcpOA30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA129BarCod", GXutil.ltrim( localUtil.ntoc( wcpOA129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA132BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOA132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA130BarCodPar", GXutil.rtrim( wcpOA130BarCodPar));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"wcpOAV43VisualizarAcciones", wcpOAV43VisualizarAcciones);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"wcpOAV46AccionesEnPopup", wcpOAV46AccionesEnPopup);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV23ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGUIFASLIN", GXutil.ltrim( localUtil.ntoc( AV24TFGuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGUIFASLIN_TO", GXutil.ltrim( localUtil.ntoc( AV25TFGuiFasLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD", GXutil.rtrim( AV26TFFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCOD_SEL", GXutil.rtrim( AV27TFFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC", GXutil.rtrim( AV28TFFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSC_SEL", GXutil.rtrim( AV29TFFasDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGUIFASPKG", GXutil.ltrim( localUtil.ntoc( AV32TFGuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGUIFASPKG_TO", GXutil.ltrim( localUtil.ntoc( AV33TFGuiFasPKg_To, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGUIFASPMT", GXutil.ltrim( localUtil.ntoc( AV36TFGuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGUIFASPMT_TO", GXutil.ltrim( localUtil.ntoc( AV37TFGuiFasPMt_To, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASKGM", GXutil.ltrim( localUtil.ntoc( AV30TFFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASKGM_TO", GXutil.ltrim( localUtil.ntoc( AV31TFFasKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASMTR", GXutil.ltrim( localUtil.ntoc( AV34TFFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASMTR_TO", GXutil.ltrim( localUtil.ntoc( AV35TFFasMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vACCIONESENPOPUP", AV46AccionesEnPopup);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vVISUALIZARACCIONES", AV43VisualizarAcciones);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Width", GXutil.rtrim( Dvpanel_tablealbaran_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Autowidth", GXutil.booltostr( Dvpanel_tablealbaran_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Autoheight", GXutil.booltostr( Dvpanel_tablealbaran_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Cls", GXutil.rtrim( Dvpanel_tablealbaran_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Title", GXutil.rtrim( Dvpanel_tablealbaran_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Collapsible", GXutil.booltostr( Dvpanel_tablealbaran_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Collapsed", GXutil.booltostr( Dvpanel_tablealbaran_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Showcollapseicon", GXutil.booltostr( Dvpanel_tablealbaran_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Iconposition", GXutil.rtrim( Dvpanel_tablealbaran_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEALBARAN_Autoscroll", GXutil.booltostr( Dvpanel_tablealbaran_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
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

   public void renderHtmlCloseForm1XD2( )
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
         httpContext.writeText( "<script type=\"text/javascript\">") ;
         httpContext.writeText( "gx.setLanguageCode(\""+httpContext.getLanguageProperty( "code")+"\");") ;
         if ( ! httpContext.isSpaRequest( ) )
         {
            httpContext.writeText( "gx.setDateFormat(\""+httpContext.getLanguageProperty( "date_fmt")+"\");") ;
            httpContext.writeText( "gx.setTimeFormat("+httpContext.getLanguageProperty( "time_fmt")+");") ;
            httpContext.writeText( "gx.setCenturyFirstYear("+40+");") ;
            httpContext.writeText( "gx.setDecimalPoint(\""+httpContext.getLanguageProperty( "decimal_point")+"\");") ;
            httpContext.writeText( "gx.setThousandSeparator(\""+httpContext.getLanguageProperty( "thousand_sep")+"\");") ;
            httpContext.writeText( "gx.StorageTimeZone = "+2+";") ;
         }
         httpContext.writeText( "</script>") ;
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
      return "Albaranes.AlbaranGuiaFase__WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Guia / Fases", "") ;
   }

   public void wb1XD0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.albaranes.albaranguiafase__ww");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_tablealbaran_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_tablealbaran_cell_Class, "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tablealbaran.setProperty("Width", Dvpanel_tablealbaran_Width);
         ucDvpanel_tablealbaran.setProperty("AutoWidth", Dvpanel_tablealbaran_Autowidth);
         ucDvpanel_tablealbaran.setProperty("AutoHeight", Dvpanel_tablealbaran_Autoheight);
         ucDvpanel_tablealbaran.setProperty("Cls", Dvpanel_tablealbaran_Cls);
         ucDvpanel_tablealbaran.setProperty("Title", Dvpanel_tablealbaran_Title);
         ucDvpanel_tablealbaran.setProperty("Collapsible", Dvpanel_tablealbaran_Collapsible);
         ucDvpanel_tablealbaran.setProperty("Collapsed", Dvpanel_tablealbaran_Collapsed);
         ucDvpanel_tablealbaran.setProperty("ShowCollapseIcon", Dvpanel_tablealbaran_Showcollapseicon);
         ucDvpanel_tablealbaran.setProperty("IconPosition", Dvpanel_tablealbaran_Iconposition);
         ucDvpanel_tablealbaran.setProperty("AutoScroll", Dvpanel_tablealbaran_Autoscroll);
         ucDvpanel_tablealbaran.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablealbaran_Internalname, sPrefix+"DVPANEL_TABLEALBARANContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEALBARANContainer"+"TableAlbaran"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablealbaran_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop25", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbngruia_Internalname, httpContext.getMessage( "<b>Nº Guia</b>", ""), "", "", lblTbngruia_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Albaranes\\AlbaranGuiaFase__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaFase__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbAlbEnvFtp.getInternalname(), httpContext.getMessage( "Envio Albaran FTP", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbEnvFtp, cmbAlbEnvFtp.getInternalname(), GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)), 1, cmbAlbEnvFtp.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbEnvFtp.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Albaranes\\AlbaranGuiaFase__WW.htm");
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtGuiRemCli_Internalname, httpContext.getMessage( "Codigo Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiRemCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiRemCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaFase__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtGuiRemCln_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCln_Internalname, GXutil.rtrim( A1244GuiRemCln), GXutil.rtrim( localUtil.format( A1244GuiRemCln, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCln_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiRemCln_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuiaFase__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtAlbProfch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtAlbProfch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProfch_Internalname, localUtil.format(A34AlbProfch, "99/99/99"), localUtil.format( A34AlbProfch, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProfch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaFase__WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtAlbProfch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProfch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Albaranes\\AlbaranGuiaFase__WW.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-8 col-sm-1 CellMarginTop20", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbos_Internalname, httpContext.getMessage( "<b>O. Servicio</b>", ""), "", "", lblTbos_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Albaranes\\AlbaranGuiaFase__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaFase__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaFase__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuiaFase__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell CellMarginTop", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, bttBtninsert_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\AlbaranGuiaFase__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\AlbaranGuiaFase__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_66_1XD2( true) ;
      }
      else
      {
         wb_table1_66_1XD2( false) ;
      }
      return  ;
   }

   public void wb_table1_66_1XD2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         startgridcontrol84( ) ;
      }
      if ( wbEnd == 84 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_84 = (int)(nGXsfl_84_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\AlbaranGuiaFase__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV49Pgmname), GXutil.rtrim( localUtil.format( AV49Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuiaFase__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV38DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV38DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV18ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuiaFase__WW.htm");
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
      if ( wbEnd == 84 )
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

   public void start1XD2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Guia / Fases", ""), (short)(0)) ;
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
            strup1XD0( ) ;
         }
      }
   }

   public void ws1XD2( )
   {
      start1XD2( ) ;
      evt1XD2( ) ;
   }

   public void evt1XD2( )
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
                              strup1XD0( ) ;
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
                              strup1XD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111XD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121XD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131XD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141XD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151XD2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsert' */
                                 e161XD2 ();
                              }
                           }
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XD0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavUpdate_Internalname ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VUPDATE.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VDELETE.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VUPDATE.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VDELETE.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1XD0( ) ;
                           }
                           nGXsfl_84_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_842( ) ;
                           AV44Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavUpdate_Internalname, AV44Update);
                           AV45Delete = httpContext.cgiGet( edtavDelete_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDelete_Internalname, AV45Delete);
                           A1240GuiFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtGuiFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           A1241GuiFasPKg = localUtil.ctond( httpContext.cgiGet( edtGuiFasPKg_Internalname)) ;
                           A1242GuiFasPMt = localUtil.ctond( httpContext.cgiGet( edtGuiFasPMt_Internalname)) ;
                           A1275FasKgm = localUtil.ctond( httpContext.cgiGet( edtFasKgm_Internalname)) ;
                           A1276FasMtr = localUtil.ctond( httpContext.cgiGet( edtFasMtr_Internalname)) ;
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
                                       GX_FocusControl = edtavUpdate_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e171XD2 ();
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
                                       GX_FocusControl = edtavUpdate_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e181XD2 ();
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
                                       GX_FocusControl = edtavUpdate_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e191XD2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VUPDATE.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavUpdate_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e201XD2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VDELETE.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavUpdate_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e211XD2 ();
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
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup1XD0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavUpdate_Internalname ;
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

   public void we1XD2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1XD2( ) ;
         }
      }
   }

   public void pa1XD2( )
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
      subsflControlProps_842( ) ;
      while ( nGXsfl_84_idx <= nRC_GXsfl_84 )
      {
         sendrow_842( ) ;
         nGXsfl_84_idx = ((subGrid_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_84_idx+1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 String A396EmprCod ,
                                 long A30AlbProCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 byte AV23ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 short AV24TFGuiFasLin ,
                                 short AV25TFGuiFasLin_To ,
                                 String AV26TFFasCod ,
                                 String AV27TFFasCod_Sel ,
                                 String AV28TFFasDsc ,
                                 String AV29TFFasDsc_Sel ,
                                 java.math.BigDecimal AV32TFGuiFasPKg ,
                                 java.math.BigDecimal AV33TFGuiFasPKg_To ,
                                 java.math.BigDecimal AV36TFGuiFasPMt ,
                                 java.math.BigDecimal AV37TFGuiFasPMt_To ,
                                 java.math.BigDecimal AV30TFFasKgm ,
                                 java.math.BigDecimal AV31TFFasKgm_To ,
                                 java.math.BigDecimal AV34TFFasMtr ,
                                 java.math.BigDecimal AV35TFFasMtr_To ,
                                 boolean AV46AccionesEnPopup ,
                                 boolean AV43VisualizarAcciones ,
                                 String AV49Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e181XD2 ();
      GRID_nCurrentRecord = 0 ;
      rf1XD2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AlbaranGuiaFase__WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV49Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("albaranes\\albaranguiafase__ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_GUIFASLIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A1240GuiFasLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GUIFASLIN", GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), ".", "")));
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
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1XD2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV49Pgmname = "Albaranes.AlbaranGuiaFase__WW" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Pgmname", AV49Pgmname);
      Gx_err = (short)(0) ;
      edtavUpdate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUpdate_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtavDelete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDelete_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1XD2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(84) ;
      /* Execute user event: Refresh */
      e181XD2 ();
      nGXsfl_84_idx = 1 ;
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_842( ) ;
      bGXsfl_84_Refreshing = true ;
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
         subsflControlProps_842( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV54Albaranes_albaranguiafase__wwds_1_filterfulltext ,
                                              Short.valueOf(AV55Albaranes_albaranguiafase__wwds_2_tfguifaslin) ,
                                              Short.valueOf(AV56Albaranes_albaranguiafase__wwds_3_tfguifaslin_to) ,
                                              AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel ,
                                              AV57Albaranes_albaranguiafase__wwds_4_tffascod ,
                                              AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel ,
                                              AV59Albaranes_albaranguiafase__wwds_6_tffasdsc ,
                                              AV61Albaranes_albaranguiafase__wwds_8_tfguifaspkg ,
                                              AV62Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to ,
                                              AV63Albaranes_albaranguiafase__wwds_10_tfguifaspmt ,
                                              AV64Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to ,
                                              AV65Albaranes_albaranguiafase__wwds_12_tffaskgm ,
                                              AV66Albaranes_albaranguiafase__wwds_13_tffaskgm_to ,
                                              AV67Albaranes_albaranguiafase__wwds_14_tffasmtr ,
                                              AV68Albaranes_albaranguiafase__wwds_15_tffasmtr_to ,
                                              Short.valueOf(A1240GuiFasLin) ,
                                              A457FasCod ,
                                              A460FasDsc ,
                                              A1241GuiFasPKg ,
                                              A1242GuiFasPMt ,
                                              A1275FasKgm ,
                                              A1276FasMtr ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A396EmprCod ,
                                              Long.valueOf(A30AlbProCod) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV54Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
         lV54Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
         lV54Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
         lV54Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
         lV54Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
         lV54Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
         lV54Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
         lV57Albaranes_albaranguiafase__wwds_4_tffascod = GXutil.padr( GXutil.rtrim( AV57Albaranes_albaranguiafase__wwds_4_tffascod), 8, "%") ;
         lV59Albaranes_albaranguiafase__wwds_6_tffasdsc = GXutil.padr( GXutil.rtrim( AV59Albaranes_albaranguiafase__wwds_6_tffasdsc), 28, "%") ;
         /* Using cursor H01XD2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, lV54Albaranes_albaranguiafase__wwds_1_filterfulltext, lV54Albaranes_albaranguiafase__wwds_1_filterfulltext, lV54Albaranes_albaranguiafase__wwds_1_filterfulltext, lV54Albaranes_albaranguiafase__wwds_1_filterfulltext, lV54Albaranes_albaranguiafase__wwds_1_filterfulltext, lV54Albaranes_albaranguiafase__wwds_1_filterfulltext, lV54Albaranes_albaranguiafase__wwds_1_filterfulltext, Short.valueOf(AV55Albaranes_albaranguiafase__wwds_2_tfguifaslin), Short.valueOf(AV56Albaranes_albaranguiafase__wwds_3_tfguifaslin_to), lV57Albaranes_albaranguiafase__wwds_4_tffascod, AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel, lV59Albaranes_albaranguiafase__wwds_6_tffasdsc, AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel, AV61Albaranes_albaranguiafase__wwds_8_tfguifaspkg, AV62Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to, AV63Albaranes_albaranguiafase__wwds_10_tfguifaspmt, AV64Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to, AV65Albaranes_albaranguiafase__wwds_12_tffaskgm, AV66Albaranes_albaranguiafase__wwds_13_tffaskgm_to, AV67Albaranes_albaranguiafase__wwds_14_tffasmtr, AV68Albaranes_albaranguiafase__wwds_15_tffasmtr_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_84_idx = 1 ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A1276FasMtr = H01XD2_A1276FasMtr[0] ;
            A1275FasKgm = H01XD2_A1275FasKgm[0] ;
            A1242GuiFasPMt = H01XD2_A1242GuiFasPMt[0] ;
            A1241GuiFasPKg = H01XD2_A1241GuiFasPKg[0] ;
            A460FasDsc = H01XD2_A460FasDsc[0] ;
            A457FasCod = H01XD2_A457FasCod[0] ;
            A1240GuiFasLin = H01XD2_A1240GuiFasLin[0] ;
            A460FasDsc = H01XD2_A460FasDsc[0] ;
            e191XD2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb1XD0( ) ;
      }
      bGXsfl_84_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1XD2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_GUIFASLIN"+"_"+sGXsfl_84_idx, getSecureSignedToken( sPrefix+sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A1240GuiFasLin), "ZZZ9")));
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
      AV54Albaranes_albaranguiafase__wwds_1_filterfulltext = AV15FilterFullText ;
      AV55Albaranes_albaranguiafase__wwds_2_tfguifaslin = AV24TFGuiFasLin ;
      AV56Albaranes_albaranguiafase__wwds_3_tfguifaslin_to = AV25TFGuiFasLin_To ;
      AV57Albaranes_albaranguiafase__wwds_4_tffascod = AV26TFFasCod ;
      AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel = AV27TFFasCod_Sel ;
      AV59Albaranes_albaranguiafase__wwds_6_tffasdsc = AV28TFFasDsc ;
      AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel = AV29TFFasDsc_Sel ;
      AV61Albaranes_albaranguiafase__wwds_8_tfguifaspkg = AV32TFGuiFasPKg ;
      AV62Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to = AV33TFGuiFasPKg_To ;
      AV63Albaranes_albaranguiafase__wwds_10_tfguifaspmt = AV36TFGuiFasPMt ;
      AV64Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to = AV37TFGuiFasPMt_To ;
      AV65Albaranes_albaranguiafase__wwds_12_tffaskgm = AV30TFFasKgm ;
      AV66Albaranes_albaranguiafase__wwds_13_tffaskgm_to = AV31TFFasKgm_To ;
      AV67Albaranes_albaranguiafase__wwds_14_tffasmtr = AV34TFFasMtr ;
      AV68Albaranes_albaranguiafase__wwds_15_tffasmtr_to = AV35TFFasMtr_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV54Albaranes_albaranguiafase__wwds_1_filterfulltext ,
                                           Short.valueOf(AV55Albaranes_albaranguiafase__wwds_2_tfguifaslin) ,
                                           Short.valueOf(AV56Albaranes_albaranguiafase__wwds_3_tfguifaslin_to) ,
                                           AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel ,
                                           AV57Albaranes_albaranguiafase__wwds_4_tffascod ,
                                           AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel ,
                                           AV59Albaranes_albaranguiafase__wwds_6_tffasdsc ,
                                           AV61Albaranes_albaranguiafase__wwds_8_tfguifaspkg ,
                                           AV62Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to ,
                                           AV63Albaranes_albaranguiafase__wwds_10_tfguifaspmt ,
                                           AV64Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to ,
                                           AV65Albaranes_albaranguiafase__wwds_12_tffaskgm ,
                                           AV66Albaranes_albaranguiafase__wwds_13_tffaskgm_to ,
                                           AV67Albaranes_albaranguiafase__wwds_14_tffasmtr ,
                                           AV68Albaranes_albaranguiafase__wwds_15_tffasmtr_to ,
                                           Short.valueOf(A1240GuiFasLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A1241GuiFasPKg ,
                                           A1242GuiFasPMt ,
                                           A1275FasKgm ,
                                           A1276FasMtr ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV54Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV54Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV54Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV54Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV54Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV54Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV54Albaranes_albaranguiafase__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Albaranes_albaranguiafase__wwds_1_filterfulltext), "%", "") ;
      lV57Albaranes_albaranguiafase__wwds_4_tffascod = GXutil.padr( GXutil.rtrim( AV57Albaranes_albaranguiafase__wwds_4_tffascod), 8, "%") ;
      lV59Albaranes_albaranguiafase__wwds_6_tffasdsc = GXutil.padr( GXutil.rtrim( AV59Albaranes_albaranguiafase__wwds_6_tffasdsc), 28, "%") ;
      /* Using cursor H01XD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, lV54Albaranes_albaranguiafase__wwds_1_filterfulltext, lV54Albaranes_albaranguiafase__wwds_1_filterfulltext, lV54Albaranes_albaranguiafase__wwds_1_filterfulltext, lV54Albaranes_albaranguiafase__wwds_1_filterfulltext, lV54Albaranes_albaranguiafase__wwds_1_filterfulltext, lV54Albaranes_albaranguiafase__wwds_1_filterfulltext, lV54Albaranes_albaranguiafase__wwds_1_filterfulltext, Short.valueOf(AV55Albaranes_albaranguiafase__wwds_2_tfguifaslin), Short.valueOf(AV56Albaranes_albaranguiafase__wwds_3_tfguifaslin_to), lV57Albaranes_albaranguiafase__wwds_4_tffascod, AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel, lV59Albaranes_albaranguiafase__wwds_6_tffasdsc, AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel, AV61Albaranes_albaranguiafase__wwds_8_tfguifaspkg, AV62Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to, AV63Albaranes_albaranguiafase__wwds_10_tfguifaspmt, AV64Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to, AV65Albaranes_albaranguiafase__wwds_12_tffaskgm, AV66Albaranes_albaranguiafase__wwds_13_tffaskgm_to, AV67Albaranes_albaranguiafase__wwds_14_tffasmtr, AV68Albaranes_albaranguiafase__wwds_15_tffasmtr_to});
      GRID_nRecordCount = H01XD3_AGRID_nRecordCount[0] ;
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
      AV54Albaranes_albaranguiafase__wwds_1_filterfulltext = AV15FilterFullText ;
      AV55Albaranes_albaranguiafase__wwds_2_tfguifaslin = AV24TFGuiFasLin ;
      AV56Albaranes_albaranguiafase__wwds_3_tfguifaslin_to = AV25TFGuiFasLin_To ;
      AV57Albaranes_albaranguiafase__wwds_4_tffascod = AV26TFFasCod ;
      AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel = AV27TFFasCod_Sel ;
      AV59Albaranes_albaranguiafase__wwds_6_tffasdsc = AV28TFFasDsc ;
      AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel = AV29TFFasDsc_Sel ;
      AV61Albaranes_albaranguiafase__wwds_8_tfguifaspkg = AV32TFGuiFasPKg ;
      AV62Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to = AV33TFGuiFasPKg_To ;
      AV63Albaranes_albaranguiafase__wwds_10_tfguifaspmt = AV36TFGuiFasPMt ;
      AV64Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to = AV37TFGuiFasPMt_To ;
      AV65Albaranes_albaranguiafase__wwds_12_tffaskgm = AV30TFFasKgm ;
      AV66Albaranes_albaranguiafase__wwds_13_tffaskgm_to = AV31TFFasKgm_To ;
      AV67Albaranes_albaranguiafase__wwds_14_tffasmtr = AV34TFFasMtr ;
      AV68Albaranes_albaranguiafase__wwds_15_tffasmtr_to = AV35TFFasMtr_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV24TFGuiFasLin, AV25TFGuiFasLin_To, AV26TFFasCod, AV27TFFasCod_Sel, AV28TFFasDsc, AV29TFFasDsc_Sel, AV32TFGuiFasPKg, AV33TFGuiFasPKg_To, AV36TFGuiFasPMt, AV37TFGuiFasPMt_To, AV30TFFasKgm, AV31TFFasKgm_To, AV34TFFasMtr, AV35TFFasMtr_To, AV46AccionesEnPopup, AV43VisualizarAcciones, AV49Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV54Albaranes_albaranguiafase__wwds_1_filterfulltext = AV15FilterFullText ;
      AV55Albaranes_albaranguiafase__wwds_2_tfguifaslin = AV24TFGuiFasLin ;
      AV56Albaranes_albaranguiafase__wwds_3_tfguifaslin_to = AV25TFGuiFasLin_To ;
      AV57Albaranes_albaranguiafase__wwds_4_tffascod = AV26TFFasCod ;
      AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel = AV27TFFasCod_Sel ;
      AV59Albaranes_albaranguiafase__wwds_6_tffasdsc = AV28TFFasDsc ;
      AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel = AV29TFFasDsc_Sel ;
      AV61Albaranes_albaranguiafase__wwds_8_tfguifaspkg = AV32TFGuiFasPKg ;
      AV62Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to = AV33TFGuiFasPKg_To ;
      AV63Albaranes_albaranguiafase__wwds_10_tfguifaspmt = AV36TFGuiFasPMt ;
      AV64Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to = AV37TFGuiFasPMt_To ;
      AV65Albaranes_albaranguiafase__wwds_12_tffaskgm = AV30TFFasKgm ;
      AV66Albaranes_albaranguiafase__wwds_13_tffaskgm_to = AV31TFFasKgm_To ;
      AV67Albaranes_albaranguiafase__wwds_14_tffasmtr = AV34TFFasMtr ;
      AV68Albaranes_albaranguiafase__wwds_15_tffasmtr_to = AV35TFFasMtr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV24TFGuiFasLin, AV25TFGuiFasLin_To, AV26TFFasCod, AV27TFFasCod_Sel, AV28TFFasDsc, AV29TFFasDsc_Sel, AV32TFGuiFasPKg, AV33TFGuiFasPKg_To, AV36TFGuiFasPMt, AV37TFGuiFasPMt_To, AV30TFFasKgm, AV31TFFasKgm_To, AV34TFFasMtr, AV35TFFasMtr_To, AV46AccionesEnPopup, AV43VisualizarAcciones, AV49Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV54Albaranes_albaranguiafase__wwds_1_filterfulltext = AV15FilterFullText ;
      AV55Albaranes_albaranguiafase__wwds_2_tfguifaslin = AV24TFGuiFasLin ;
      AV56Albaranes_albaranguiafase__wwds_3_tfguifaslin_to = AV25TFGuiFasLin_To ;
      AV57Albaranes_albaranguiafase__wwds_4_tffascod = AV26TFFasCod ;
      AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel = AV27TFFasCod_Sel ;
      AV59Albaranes_albaranguiafase__wwds_6_tffasdsc = AV28TFFasDsc ;
      AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel = AV29TFFasDsc_Sel ;
      AV61Albaranes_albaranguiafase__wwds_8_tfguifaspkg = AV32TFGuiFasPKg ;
      AV62Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to = AV33TFGuiFasPKg_To ;
      AV63Albaranes_albaranguiafase__wwds_10_tfguifaspmt = AV36TFGuiFasPMt ;
      AV64Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to = AV37TFGuiFasPMt_To ;
      AV65Albaranes_albaranguiafase__wwds_12_tffaskgm = AV30TFFasKgm ;
      AV66Albaranes_albaranguiafase__wwds_13_tffaskgm_to = AV31TFFasKgm_To ;
      AV67Albaranes_albaranguiafase__wwds_14_tffasmtr = AV34TFFasMtr ;
      AV68Albaranes_albaranguiafase__wwds_15_tffasmtr_to = AV35TFFasMtr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV24TFGuiFasLin, AV25TFGuiFasLin_To, AV26TFFasCod, AV27TFFasCod_Sel, AV28TFFasDsc, AV29TFFasDsc_Sel, AV32TFGuiFasPKg, AV33TFGuiFasPKg_To, AV36TFGuiFasPMt, AV37TFGuiFasPMt_To, AV30TFFasKgm, AV31TFFasKgm_To, AV34TFFasMtr, AV35TFFasMtr_To, AV46AccionesEnPopup, AV43VisualizarAcciones, AV49Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV54Albaranes_albaranguiafase__wwds_1_filterfulltext = AV15FilterFullText ;
      AV55Albaranes_albaranguiafase__wwds_2_tfguifaslin = AV24TFGuiFasLin ;
      AV56Albaranes_albaranguiafase__wwds_3_tfguifaslin_to = AV25TFGuiFasLin_To ;
      AV57Albaranes_albaranguiafase__wwds_4_tffascod = AV26TFFasCod ;
      AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel = AV27TFFasCod_Sel ;
      AV59Albaranes_albaranguiafase__wwds_6_tffasdsc = AV28TFFasDsc ;
      AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel = AV29TFFasDsc_Sel ;
      AV61Albaranes_albaranguiafase__wwds_8_tfguifaspkg = AV32TFGuiFasPKg ;
      AV62Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to = AV33TFGuiFasPKg_To ;
      AV63Albaranes_albaranguiafase__wwds_10_tfguifaspmt = AV36TFGuiFasPMt ;
      AV64Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to = AV37TFGuiFasPMt_To ;
      AV65Albaranes_albaranguiafase__wwds_12_tffaskgm = AV30TFFasKgm ;
      AV66Albaranes_albaranguiafase__wwds_13_tffaskgm_to = AV31TFFasKgm_To ;
      AV67Albaranes_albaranguiafase__wwds_14_tffasmtr = AV34TFFasMtr ;
      AV68Albaranes_albaranguiafase__wwds_15_tffasmtr_to = AV35TFFasMtr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV24TFGuiFasLin, AV25TFGuiFasLin_To, AV26TFFasCod, AV27TFFasCod_Sel, AV28TFFasDsc, AV29TFFasDsc_Sel, AV32TFGuiFasPKg, AV33TFGuiFasPKg_To, AV36TFGuiFasPMt, AV37TFGuiFasPMt_To, AV30TFFasKgm, AV31TFFasKgm_To, AV34TFFasMtr, AV35TFFasMtr_To, AV46AccionesEnPopup, AV43VisualizarAcciones, AV49Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV54Albaranes_albaranguiafase__wwds_1_filterfulltext = AV15FilterFullText ;
      AV55Albaranes_albaranguiafase__wwds_2_tfguifaslin = AV24TFGuiFasLin ;
      AV56Albaranes_albaranguiafase__wwds_3_tfguifaslin_to = AV25TFGuiFasLin_To ;
      AV57Albaranes_albaranguiafase__wwds_4_tffascod = AV26TFFasCod ;
      AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel = AV27TFFasCod_Sel ;
      AV59Albaranes_albaranguiafase__wwds_6_tffasdsc = AV28TFFasDsc ;
      AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel = AV29TFFasDsc_Sel ;
      AV61Albaranes_albaranguiafase__wwds_8_tfguifaspkg = AV32TFGuiFasPKg ;
      AV62Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to = AV33TFGuiFasPKg_To ;
      AV63Albaranes_albaranguiafase__wwds_10_tfguifaspmt = AV36TFGuiFasPMt ;
      AV64Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to = AV37TFGuiFasPMt_To ;
      AV65Albaranes_albaranguiafase__wwds_12_tffaskgm = AV30TFFasKgm ;
      AV66Albaranes_albaranguiafase__wwds_13_tffaskgm_to = AV31TFFasKgm_To ;
      AV67Albaranes_albaranguiafase__wwds_14_tffasmtr = AV34TFFasMtr ;
      AV68Albaranes_albaranguiafase__wwds_15_tffasmtr_to = AV35TFFasMtr_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV24TFGuiFasLin, AV25TFGuiFasLin_To, AV26TFFasCod, AV27TFFasCod_Sel, AV28TFFasDsc, AV29TFFasDsc_Sel, AV32TFGuiFasPKg, AV33TFGuiFasPKg_To, AV36TFGuiFasPMt, AV37TFGuiFasPMt_To, AV30TFFasKgm, AV31TFFasKgm_To, AV34TFFasMtr, AV35TFFasMtr_To, AV46AccionesEnPopup, AV43VisualizarAcciones, AV49Pgmname, AV12OrderedBy, AV13OrderedDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV49Pgmname = "Albaranes.AlbaranGuiaFase__WW" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Pgmname", AV49Pgmname);
      Gx_err = (short)(0) ;
      edtavUpdate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUpdate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUpdate_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtavDelete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDelete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDelete_Enabled), 5, 0), !bGXsfl_84_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      /* Using cursor H01XD4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      A1253EmprGuiRem = H01XD4_A1253EmprGuiRem[0] ;
      A5805AlbEnvFtp = H01XD4_A5805AlbEnvFtp[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      A1243GuiRemCli = H01XD4_A1243GuiRemCli[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      A34AlbProfch = H01XD4_A34AlbProfch[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      pr_default.close(2);
      /* Using cursor H01XD5 */
      pr_default.execute(3, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      A1244GuiRemCln = H01XD5_A1244GuiRemCln[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1244GuiRemCln", A1244GuiRemCln);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(3);
      fix_multi_value_controls( ) ;
   }

   public void strup1XD0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e171XD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV21ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV38DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_84 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_84"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV40GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV41GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA30AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOA129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOA132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOA130BarCodPar = httpContext.cgiGet( sPrefix+"wcpOA130BarCodPar") ;
         wcpOAV43VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV43VisualizarAcciones")) ;
         wcpOAV46AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV46AccionesEnPopup")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tablealbaran_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Width") ;
         Dvpanel_tablealbaran_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Autowidth")) ;
         Dvpanel_tablealbaran_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Autoheight")) ;
         Dvpanel_tablealbaran_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Cls") ;
         Dvpanel_tablealbaran_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Title") ;
         Dvpanel_tablealbaran_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Collapsible")) ;
         Dvpanel_tablealbaran_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Collapsed")) ;
         Dvpanel_tablealbaran_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Showcollapseicon")) ;
         Dvpanel_tablealbaran_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Iconposition") ;
         Dvpanel_tablealbaran_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEALBARAN_Autoscroll")) ;
         Ddo_managefilters_Icontype = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Cls") ;
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
         cmbAlbEnvFtp.setName( cmbAlbEnvFtp.getInternalname() );
         cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
         A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1244GuiRemCln", A1244GuiRemCln);
         A34AlbProfch = localUtil.ctod( httpContext.cgiGet( edtAlbProfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         AV49Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Pgmname", AV49Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"AlbaranGuiaFase__WW");
         AV49Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Pgmname", AV49Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV49Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("albaranes\\albaranguiafase__ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
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
      e171XD2 ();
      if (returnInSub) return;
   }

   public void e171XD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV50Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      albaranguiafase__ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV50Station = GXt_char1 ;
      GXv_char2[0] = AV51Emprcod ;
      GXv_char3[0] = AV52Emprnom ;
      GXv_char4[0] = AV53Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV50Station, GXv_char2, GXv_char3, GXv_char4) ;
      albaranguiafase__ww_impl.this.AV51Emprcod = GXv_char2[0] ;
      albaranguiafase__ww_impl.this.AV52Emprnom = GXv_char3[0] ;
      albaranguiafase__ww_impl.this.AV53Usurcod = GXv_char4[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S122 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
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

   public void e181XD2( )
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
      /* Execute user subroutine: 'CHECKSECURITYFORACTIONS' */
      S162 ();
      if (returnInSub) return;
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
         S122 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV20Session.getValue("Albaranes.AlbaranGuiaFase__WWColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("Albaranes.AlbaranGuiaFase__WWColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S182 ();
         if (returnInSub) return;
      }
      edtGuiFasLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGuiFasLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasLin_Visible), 5, 0), !bGXsfl_84_Refreshing);
      edtFasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Visible), 5, 0), !bGXsfl_84_Refreshing);
      edtFasDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Visible), 5, 0), !bGXsfl_84_Refreshing);
      edtGuiFasPKg_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGuiFasPKg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPKg_Visible), 5, 0), !bGXsfl_84_Refreshing);
      edtGuiFasPMt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGuiFasPMt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPMt_Visible), 5, 0), !bGXsfl_84_Refreshing);
      edtFasKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasKgm_Visible), 5, 0), !bGXsfl_84_Refreshing);
      edtFasMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasMtr_Visible), 5, 0), !bGXsfl_84_Refreshing);
      AV40GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridCurrentPage), 10, 0));
      AV41GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridPageCount), 10, 0));
      AV54Albaranes_albaranguiafase__wwds_1_filterfulltext = AV15FilterFullText ;
      AV55Albaranes_albaranguiafase__wwds_2_tfguifaslin = AV24TFGuiFasLin ;
      AV56Albaranes_albaranguiafase__wwds_3_tfguifaslin_to = AV25TFGuiFasLin_To ;
      AV57Albaranes_albaranguiafase__wwds_4_tffascod = AV26TFFasCod ;
      AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel = AV27TFFasCod_Sel ;
      AV59Albaranes_albaranguiafase__wwds_6_tffasdsc = AV28TFFasDsc ;
      AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel = AV29TFFasDsc_Sel ;
      AV61Albaranes_albaranguiafase__wwds_8_tfguifaspkg = AV32TFGuiFasPKg ;
      AV62Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to = AV33TFGuiFasPKg_To ;
      AV63Albaranes_albaranguiafase__wwds_10_tfguifaspmt = AV36TFGuiFasPMt ;
      AV64Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to = AV37TFGuiFasPMt_To ;
      AV65Albaranes_albaranguiafase__wwds_12_tffaskgm = AV30TFFasKgm ;
      AV66Albaranes_albaranguiafase__wwds_13_tffaskgm_to = AV31TFFasKgm_To ;
      AV67Albaranes_albaranguiafase__wwds_14_tffasmtr = AV34TFFasMtr ;
      AV68Albaranes_albaranguiafase__wwds_15_tffasmtr_to = AV35TFFasMtr_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121XD2( )
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

   public void e131XD2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141XD2( )
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
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GuiFasLin") == 0 )
         {
            AV24TFGuiFasLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFGuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFGuiFasLin), 4, 0));
            AV25TFGuiFasLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFGuiFasLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFGuiFasLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCod") == 0 )
         {
            AV26TFFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFFasCod", AV26TFFasCod);
            AV27TFFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFFasCod_Sel", AV27TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDsc") == 0 )
         {
            AV28TFFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFFasDsc", AV28TFFasDsc);
            AV29TFFasDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFFasDsc_Sel", AV29TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GuiFasPKg") == 0 )
         {
            AV32TFGuiFasPKg = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFGuiFasPKg", GXutil.ltrimstr( AV32TFGuiFasPKg, 13, 5));
            AV33TFGuiFasPKg_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFGuiFasPKg_To", GXutil.ltrimstr( AV33TFGuiFasPKg_To, 13, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GuiFasPMt") == 0 )
         {
            AV36TFGuiFasPMt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFGuiFasPMt", GXutil.ltrimstr( AV36TFGuiFasPMt, 13, 5));
            AV37TFGuiFasPMt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFGuiFasPMt_To", GXutil.ltrimstr( AV37TFGuiFasPMt_To, 13, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasKgm") == 0 )
         {
            AV30TFFasKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFFasKgm", GXutil.ltrimstr( AV30TFFasKgm, 9, 2));
            AV31TFFasKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFFasKgm_To", GXutil.ltrimstr( AV31TFFasKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasMtr") == 0 )
         {
            AV34TFFasMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFFasMtr", GXutil.ltrimstr( AV34TFFasMtr, 9, 2));
            AV35TFFasMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFFasMtr_To", GXutil.ltrimstr( AV35TFFasMtr_To, 9, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e191XD2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV44Update = httpContext.getMessage( "GXM_update", "") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavUpdate_Internalname, AV44Update);
      if ( AV43VisualizarAcciones )
      {
         edtavUpdate_Class = "Attribute" ;
      }
      else
      {
         edtavUpdate_Class = "Invisible" ;
      }
      AV45Delete = httpContext.getMessage( "GX_BtnDelete", "") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDelete_Internalname, AV45Delete);
      if ( AV43VisualizarAcciones )
      {
         edtavDelete_Class = "Attribute" ;
      }
      else
      {
         edtavDelete_Class = "Invisible" ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(84) ;
      }
      sendrow_842( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_84_Refreshing )
      {
         httpContext.doAjaxLoad(84, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e151XD2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Albaranes.AlbaranGuiaFase__WWColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e111XD2( )
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
         S172 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Albaranes.AlbaranGuiaFase__WWFilters")),GXutil.URLEncode(GXutil.rtrim(AV49Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Albaranes.AlbaranGuiaFase__WWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV22ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Albaranes.AlbaranGuiaFase__WWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         albaranguiafase__ww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV22ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV22ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S192 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV49Pgmname+"GridState", AV22ManageFiltersXml) ;
            AV10GridState.fromxml(AV22ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S152 ();
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
   }

   public void e201XD2( )
   {
      /* Update_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.albaranes.albaranguiafase", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A1240GuiFasLin,4,0))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","GuiFasLin"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e211XD2( )
   {
      /* Delete_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.albaranes.albaranguiafase", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A1240GuiFasLin,4,0))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","GuiFasLin"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e161XD2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.albaranes.albaranguiafase", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","GuiFasLin"}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S182( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV18ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "GuiFasLin", "", "#", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FasCod", "", "Fase", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FasDsc", "", "Descrição", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "GuiFasPKg", "", "Preço", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "GuiFasPMt", "", "Preço", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FasKgm", "", "Quilos", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FasMtr", "", "Metros", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV17UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Albaranes.AlbaranGuiaFase__WWColumnsSelector", GXv_char4) ;
      albaranguiafase__ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S162( )
   {
      /* 'CHECKSECURITYFORACTIONS' Routine */
      returnInSub = false ;
      if ( ! ( AV46AccionesEnPopup ) )
      {
         bttBtn_cancel_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_cancel_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_cancel_Visible), 5, 0), true);
      }
      if ( ! ( AV43VisualizarAcciones ) )
      {
         bttBtninsert_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtninsert_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtninsert_Visible), 5, 0), true);
      }
   }

   public void S122( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV21ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Albaranes.AlbaranGuiaFase__WWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV21ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV24TFGuiFasLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFGuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFGuiFasLin), 4, 0));
      AV25TFGuiFasLin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFGuiFasLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFGuiFasLin_To), 4, 0));
      AV26TFFasCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFFasCod", AV26TFFasCod);
      AV27TFFasCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFFasCod_Sel", AV27TFFasCod_Sel);
      AV28TFFasDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFFasDsc", AV28TFFasDsc);
      AV29TFFasDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFFasDsc_Sel", AV29TFFasDsc_Sel);
      AV32TFGuiFasPKg = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFGuiFasPKg", GXutil.ltrimstr( AV32TFGuiFasPKg, 13, 5));
      AV33TFGuiFasPKg_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFGuiFasPKg_To", GXutil.ltrimstr( AV33TFGuiFasPKg_To, 13, 5));
      AV36TFGuiFasPMt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFGuiFasPMt", GXutil.ltrimstr( AV36TFGuiFasPMt, 13, 5));
      AV37TFGuiFasPMt_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFGuiFasPMt_To", GXutil.ltrimstr( AV37TFGuiFasPMt_To, 13, 5));
      AV30TFFasKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFFasKgm", GXutil.ltrimstr( AV30TFFasKgm, 9, 2));
      AV31TFFasKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFFasKgm_To", GXutil.ltrimstr( AV31TFFasKgm_To, 9, 2));
      AV34TFFasMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFFasMtr", GXutil.ltrimstr( AV34TFFasMtr, 9, 2));
      AV35TFFasMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFFasMtr_To", GXutil.ltrimstr( AV35TFFasMtr_To, 9, 2));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV49Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV49Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV49Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
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
      AV69GXV1 = 1 ;
      while ( AV69GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV69GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASLIN") == 0 )
         {
            AV24TFGuiFasLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFGuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFGuiFasLin), 4, 0));
            AV25TFGuiFasLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFGuiFasLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFGuiFasLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV26TFFasCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFFasCod", AV26TFFasCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV27TFFasCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFFasCod_Sel", AV27TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV28TFFasDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFFasDsc", AV28TFFasDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV29TFFasDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFFasDsc_Sel", AV29TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASPKG") == 0 )
         {
            AV32TFGuiFasPKg = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFGuiFasPKg", GXutil.ltrimstr( AV32TFGuiFasPKg, 13, 5));
            AV33TFGuiFasPKg_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFGuiFasPKg_To", GXutil.ltrimstr( AV33TFGuiFasPKg_To, 13, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASPMT") == 0 )
         {
            AV36TFGuiFasPMt = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFGuiFasPMt", GXutil.ltrimstr( AV36TFGuiFasPMt, 13, 5));
            AV37TFGuiFasPMt_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFGuiFasPMt_To", GXutil.ltrimstr( AV37TFGuiFasPMt_To, 13, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASKGM") == 0 )
         {
            AV30TFFasKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFFasKgm", GXutil.ltrimstr( AV30TFFasKgm, 9, 2));
            AV31TFFasKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFFasKgm_To", GXutil.ltrimstr( AV31TFFasKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASMTR") == 0 )
         {
            AV34TFFasMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFFasMtr", GXutil.ltrimstr( AV34TFFasMtr, 9, 2));
            AV35TFFasMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFFasMtr_To", GXutil.ltrimstr( AV35TFFasMtr_To, 9, 2));
         }
         AV69GXV1 = (int)(AV69GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFFasCod_Sel)==0), AV27TFFasCod_Sel, GXv_char4) ;
      albaranguiafase__ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFFasDsc_Sel)==0), AV29TFFasDsc_Sel, GXv_char3) ;
      albaranguiafase__ww_impl.this.GXt_char12 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char12+"||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char12 = "" ;
      GXv_char4[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFFasCod)==0), AV26TFFasCod, GXv_char4) ;
      albaranguiafase__ww_impl.this.GXt_char12 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFFasDsc)==0), AV28TFFasDsc, GXv_char3) ;
      albaranguiafase__ww_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV24TFGuiFasLin) ? "" : GXutil.str( AV24TFGuiFasLin, 4, 0))+"|"+GXt_char12+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFGuiFasPKg)==0) ? "" : GXutil.str( AV32TFGuiFasPKg, 13, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFGuiFasPMt)==0) ? "" : GXutil.str( AV36TFGuiFasPMt, 13, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFFasKgm)==0) ? "" : GXutil.str( AV30TFFasKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFFasMtr)==0) ? "" : GXutil.str( AV34TFFasMtr, 9, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV25TFGuiFasLin_To) ? "" : GXutil.str( AV25TFGuiFasLin_To, 4, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFGuiFasPKg_To)==0) ? "" : GXutil.str( AV33TFGuiFasPKg_To, 13, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFGuiFasPMt_To)==0) ? "" : GXutil.str( AV37TFGuiFasPMt_To, 13, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFFasKgm_To)==0) ? "" : GXutil.str( AV31TFFasKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFFasMtr_To)==0) ? "" : GXutil.str( AV35TFFasMtr_To, 9, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S172( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV49Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFGUIFASLIN", "", !((0==AV24TFGuiFasLin)&&(0==AV25TFGuiFasLin_To)), (short)(0), GXutil.trim( GXutil.str( AV24TFGuiFasLin, 4, 0)), GXutil.trim( GXutil.str( AV25TFGuiFasLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFFASCOD", "", !(GXutil.strcmp("", AV26TFFasCod)==0), (short)(0), AV26TFFasCod, "", !(GXutil.strcmp("", AV27TFFasCod_Sel)==0), AV27TFFasCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFFASDSC", "", !(GXutil.strcmp("", AV28TFFasDsc)==0), (short)(0), AV28TFFasDsc, "", !(GXutil.strcmp("", AV29TFFasDsc_Sel)==0), AV29TFFasDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFGUIFASPKG", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFGuiFasPKg)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFGuiFasPKg_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV32TFGuiFasPKg, 13, 5)), GXutil.trim( GXutil.str( AV33TFGuiFasPKg_To, 13, 5))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFGUIFASPMT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFGuiFasPMt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFGuiFasPMt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV36TFGuiFasPMt, 13, 5)), GXutil.trim( GXutil.str( AV37TFGuiFasPMt_To, 13, 5))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFFASKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFFasKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFFasKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV30TFFasKgm, 9, 2)), GXutil.trim( GXutil.str( AV31TFFasKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFFASMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFFasMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFFasMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV34TFFasMtr, 9, 2)), GXutil.trim( GXutil.str( AV35TFFasMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV49Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV49Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Albaranes.AlbaranGuiaFase" );
      AV20Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( AV43VisualizarAcciones ) )
      {
         divDvpanel_tablealbaran_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_tablealbaran_cell_Internalname, "Class", divDvpanel_tablealbaran_cell_Class, true);
      }
      else
      {
         divDvpanel_tablealbaran_cell_Class = "col-xs-12" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_tablealbaran_cell_Internalname, "Class", divDvpanel_tablealbaran_cell_Class, true);
      }
   }

   public void wb_table1_66_1XD2( boolean wbgen )
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
         wb_table2_71_1XD2( true) ;
      }
      else
      {
         wb_table2_71_1XD2( false) ;
      }
      return  ;
   }

   public void wb_table2_71_1XD2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_66_1XD2e( true) ;
      }
      else
      {
         wb_table1_66_1XD2e( false) ;
      }
   }

   public void wb_table2_71_1XD2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'" + sPrefix + "',false,'" + sGXsfl_84_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Albaranes\\AlbaranGuiaFase__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_71_1XD2e( true) ;
      }
      else
      {
         wb_table2_71_1XD2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A30AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      A129BarCod = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
      AV43VisualizarAcciones = ((Boolean) getParm(obj,5,TypeConstants.BOOLEAN)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43VisualizarAcciones", AV43VisualizarAcciones);
      AV46AccionesEnPopup = ((Boolean) getParm(obj,6,TypeConstants.BOOLEAN)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46AccionesEnPopup", AV46AccionesEnPopup);
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
      pa1XD2( ) ;
      ws1XD2( ) ;
      we1XD2( ) ;
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
      sCtrlA396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA30AlbProCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlA129BarCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlA132BarCodReo = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlA130BarCodPar = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV43VisualizarAcciones = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV46AccionesEnPopup = (String)getParm(obj,6,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1XD2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "albaranes\\albaranguiafase__ww", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1XD2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         AV43VisualizarAcciones = ((Boolean) getParm(obj,7,TypeConstants.BOOLEAN)).booleanValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43VisualizarAcciones", AV43VisualizarAcciones);
         AV46AccionesEnPopup = ((Boolean) getParm(obj,8,TypeConstants.BOOLEAN)).booleanValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46AccionesEnPopup", AV46AccionesEnPopup);
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA30AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      wcpOA129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOA132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOA130BarCodPar = httpContext.cgiGet( sPrefix+"wcpOA130BarCodPar") ;
      wcpOAV43VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV43VisualizarAcciones")) ;
      wcpOAV46AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV46AccionesEnPopup")) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A30AlbProCod != wcpOA30AlbProCod ) || ( A129BarCod != wcpOA129BarCod ) || ( A132BarCodReo != wcpOA132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, wcpOA130BarCodPar) != 0 ) || ( AV43VisualizarAcciones != wcpOAV43VisualizarAcciones ) || ( AV46AccionesEnPopup != wcpOAV46AccionesEnPopup ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA30AlbProCod = A30AlbProCod ;
      wcpOA129BarCod = A129BarCod ;
      wcpOA132BarCodReo = A132BarCodReo ;
      wcpOA130BarCodPar = A130BarCodPar ;
      wcpOAV43VisualizarAcciones = AV43VisualizarAcciones ;
      wcpOAV46AccionesEnPopup = AV46AccionesEnPopup ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlA396EmprCod) > 0 )
      {
         A396EmprCod = httpContext.cgiGet( sCtrlA396EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      }
      else
      {
         A396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_PARM") ;
      }
      sCtrlA30AlbProCod = httpContext.cgiGet( sPrefix+"A30AlbProCod_CTRL") ;
      if ( GXutil.len( sCtrlA30AlbProCod) > 0 )
      {
         A30AlbProCod = localUtil.ctol( httpContext.cgiGet( sCtrlA30AlbProCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      else
      {
         A30AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"A30AlbProCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      sCtrlA129BarCod = httpContext.cgiGet( sPrefix+"A129BarCod_CTRL") ;
      if ( GXutil.len( sCtrlA129BarCod) > 0 )
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA129BarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      else
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A129BarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlA132BarCodReo = httpContext.cgiGet( sPrefix+"A132BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlA132BarCodReo) > 0 )
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlA132BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      else
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A132BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlA130BarCodPar = httpContext.cgiGet( sPrefix+"A130BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlA130BarCodPar) > 0 )
      {
         A130BarCodPar = httpContext.cgiGet( sCtrlA130BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
      }
      else
      {
         A130BarCodPar = httpContext.cgiGet( sPrefix+"A130BarCodPar_PARM") ;
      }
      sCtrlAV43VisualizarAcciones = httpContext.cgiGet( sPrefix+"AV43VisualizarAcciones_CTRL") ;
      if ( GXutil.len( sCtrlAV43VisualizarAcciones) > 0 )
      {
         AV43VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sCtrlAV43VisualizarAcciones)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43VisualizarAcciones", AV43VisualizarAcciones);
      }
      else
      {
         AV43VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( sPrefix+"AV43VisualizarAcciones_PARM")) ;
      }
      sCtrlAV46AccionesEnPopup = httpContext.cgiGet( sPrefix+"AV46AccionesEnPopup_CTRL") ;
      if ( GXutil.len( sCtrlAV46AccionesEnPopup) > 0 )
      {
         AV46AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sCtrlAV46AccionesEnPopup)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46AccionesEnPopup", AV46AccionesEnPopup);
      }
      else
      {
         AV46AccionesEnPopup = GXutil.strtobool( httpContext.cgiGet( sPrefix+"AV46AccionesEnPopup_PARM")) ;
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
      pa1XD2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1XD2( ) ;
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
      ws1XD2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_PARM", GXutil.rtrim( A396EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlA396EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_CTRL", GXutil.rtrim( sCtrlA396EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A30AlbProCod_PARM", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA30AlbProCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A30AlbProCod_CTRL", GXutil.rtrim( sCtrlA30AlbProCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A129BarCod_PARM", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA129BarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A129BarCod_CTRL", GXutil.rtrim( sCtrlA129BarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A132BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA132BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A132BarCodReo_CTRL", GXutil.rtrim( sCtrlA132BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A130BarCodPar_PARM", GXutil.rtrim( A130BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlA130BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A130BarCodPar_CTRL", GXutil.rtrim( sCtrlA130BarCodPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43VisualizarAcciones_PARM", GXutil.booltostr( AV43VisualizarAcciones));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43VisualizarAcciones)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43VisualizarAcciones_CTRL", GXutil.rtrim( sCtrlAV43VisualizarAcciones));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46AccionesEnPopup_PARM", GXutil.booltostr( AV46AccionesEnPopup));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV46AccionesEnPopup)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46AccionesEnPopup_CTRL", GXutil.rtrim( sCtrlAV46AccionesEnPopup));
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
      we1XD2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821169531", true, true);
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
      httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("albaranes/albaranguiafase__ww.js", "?2026821169532", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_84_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_84_idx ;
      edtGuiFasLin_Internalname = sPrefix+"GUIFASLIN_"+sGXsfl_84_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_84_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_84_idx ;
      edtGuiFasPKg_Internalname = sPrefix+"GUIFASPKG_"+sGXsfl_84_idx ;
      edtGuiFasPMt_Internalname = sPrefix+"GUIFASPMT_"+sGXsfl_84_idx ;
      edtFasKgm_Internalname = sPrefix+"FASKGM_"+sGXsfl_84_idx ;
      edtFasMtr_Internalname = sPrefix+"FASMTR_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavUpdate_Internalname = sPrefix+"vUPDATE_"+sGXsfl_84_fel_idx ;
      edtavDelete_Internalname = sPrefix+"vDELETE_"+sGXsfl_84_fel_idx ;
      edtGuiFasLin_Internalname = sPrefix+"GUIFASLIN_"+sGXsfl_84_fel_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_84_fel_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_84_fel_idx ;
      edtGuiFasPKg_Internalname = sPrefix+"GUIFASPKG_"+sGXsfl_84_fel_idx ;
      edtGuiFasPMt_Internalname = sPrefix+"GUIFASPMT_"+sGXsfl_84_fel_idx ;
      edtFasKgm_Internalname = sPrefix+"FASKGM_"+sGXsfl_84_fel_idx ;
      edtFasMtr_Internalname = sPrefix+"FASMTR_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb1XD0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_84_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_84_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_84_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavUpdate_Enabled!=0)&&(edtavUpdate_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 85,'"+sPrefix+"',false,'"+sGXsfl_84_idx+"',84)\"" : " ") ;
         ROClassString = edtavUpdate_Class ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,GXutil.rtrim( AV44Update),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavUpdate_Enabled!=0)&&(edtavUpdate_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,85);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVUPDATE.CLICK."+sGXsfl_84_idx+"'","","",httpContext.getMessage( "GXM_update", ""),"",edtavUpdate_Jsonclick,Integer.valueOf(5),edtavUpdate_Class,"",ROClassString,"WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavUpdate_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDelete_Enabled!=0)&&(edtavDelete_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 86,'"+sPrefix+"',false,'"+sGXsfl_84_idx+"',84)\"" : " ") ;
         ROClassString = edtavDelete_Class ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDelete_Internalname,GXutil.rtrim( AV45Delete),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDelete_Enabled!=0)&&(edtavDelete_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,86);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVDELETE.CLICK."+sGXsfl_84_idx+"'","","",httpContext.getMessage( "GX_BtnDelete", ""),"",edtavDelete_Jsonclick,Integer.valueOf(5),edtavDelete_Class,"",ROClassString,"WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDelete_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtGuiFasLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasLin_Internalname,GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1240GuiFasLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtGuiFasLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFasDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtGuiFasPKg_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasPKg_Internalname,GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1241GuiFasPKg, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasPKg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtGuiFasPKg_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtGuiFasPMt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasPMt_Internalname,GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1242GuiFasPMt, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasPMt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtGuiFasPMt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFasKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1275FasKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtFasMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1276FasMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFasMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(84),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1XD2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_84_idx = ((subGrid_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_84_idx+1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_84_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void startgridcontrol84( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"84\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+edtavUpdate_Class+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+edtavDelete_Class+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGuiFasLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descrição", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGuiFasPKg_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preço", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGuiFasPMt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preço", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Quilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFasMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV44Update));
         GridColumn.AddObjectProperty("Class", GXutil.rtrim( edtavUpdate_Class));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavUpdate_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV45Delete));
         GridColumn.AddObjectProperty("Class", GXutil.rtrim( edtavDelete_Class));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDelete_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGuiFasLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGuiFasPKg_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGuiFasPMt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1275FasKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1276FasMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFasMtr_Visible, (byte)(5), (byte)(0), ".", "")));
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
      lblTbngruia_Internalname = sPrefix+"TBNGRUIA" ;
      edtAlbProCod_Internalname = sPrefix+"ALBPROCOD" ;
      cmbAlbEnvFtp.setInternalname( sPrefix+"ALBENVFTP" );
      edtGuiRemCli_Internalname = sPrefix+"GUIREMCLI" ;
      edtGuiRemCln_Internalname = sPrefix+"GUIREMCLN" ;
      edtAlbProfch_Internalname = sPrefix+"ALBPROFCH" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      lblTbos_Internalname = sPrefix+"TBOS" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      divTablealbaran_Internalname = sPrefix+"TABLEALBARAN" ;
      Dvpanel_tablealbaran_Internalname = sPrefix+"DVPANEL_TABLEALBARAN" ;
      divDvpanel_tablealbaran_cell_Internalname = sPrefix+"DVPANEL_TABLEALBARAN_CELL" ;
      bttBtninsert_Internalname = sPrefix+"BTNINSERT" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      edtavUpdate_Internalname = sPrefix+"vUPDATE" ;
      edtavDelete_Internalname = sPrefix+"vDELETE" ;
      edtGuiFasLin_Internalname = sPrefix+"GUIFASLIN" ;
      edtFasCod_Internalname = sPrefix+"FASCOD" ;
      edtFasDsc_Internalname = sPrefix+"FASDSC" ;
      edtGuiFasPKg_Internalname = sPrefix+"GUIFASPKG" ;
      edtGuiFasPMt_Internalname = sPrefix+"GUIFASPMT" ;
      edtFasKgm_Internalname = sPrefix+"FASKGM" ;
      edtFasMtr_Internalname = sPrefix+"FASMTR" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      bttBtn_cancel_Internalname = sPrefix+"BTN_CANCEL" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
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
      edtFasMtr_Jsonclick = "" ;
      edtFasKgm_Jsonclick = "" ;
      edtGuiFasPMt_Jsonclick = "" ;
      edtGuiFasPKg_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtGuiFasLin_Jsonclick = "" ;
      edtavDelete_Jsonclick = "" ;
      edtavDelete_Class = "Attribute" ;
      edtavDelete_Visible = -1 ;
      edtavDelete_Enabled = 1 ;
      edtavUpdate_Jsonclick = "" ;
      edtavUpdate_Class = "Attribute" ;
      edtavUpdate_Visible = -1 ;
      edtavUpdate_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtFasMtr_Visible = -1 ;
      edtFasKgm_Visible = -1 ;
      edtGuiFasPMt_Visible = -1 ;
      edtGuiFasPKg_Visible = -1 ;
      edtFasDsc_Visible = -1 ;
      edtFasCod_Visible = -1 ;
      edtGuiFasLin_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtninsert_Visible = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 0 ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProfch_Enabled = 0 ;
      edtGuiRemCln_Jsonclick = "" ;
      edtGuiRemCln_Enabled = 0 ;
      edtGuiRemCli_Jsonclick = "" ;
      edtGuiRemCli_Enabled = 0 ;
      cmbAlbEnvFtp.setJsonclick( "" );
      cmbAlbEnvFtp.setEnabled( 0 );
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 0 ;
      divDvpanel_tablealbaran_cell_Class = "col-xs-12" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "Albaranes.AlbaranGuiaFase__WWGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic||||" ;
      Ddo_grid_Includedatalist = "|T|T||||" ;
      Ddo_grid_Filterisrange = "T|||T|T|T|T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8" ;
      Ddo_grid_Columnids = "2:GuiFasLin|3:FasCod|4:FasDsc|5:GuiFasPKg|6:GuiFasPMt|7:FasKgm|8:FasMtr" ;
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
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
      Dvpanel_tablealbaran_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Iconposition = "Right" ;
      Dvpanel_tablealbaran_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Title = httpContext.getMessage( "Albarán", "") ;
      Dvpanel_tablealbaran_Cls = "PanelNoHeader" ;
      Dvpanel_tablealbaran_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablealbaran_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Width = "100%" ;
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
      cmbAlbEnvFtp.setName( "ALBENVFTP" );
      cmbAlbEnvFtp.setWebtags( "" );
      cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV24TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV25TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV32TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV33TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV37TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV30TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV31TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV34TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV35TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV46AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV43VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV49Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtGuiFasLin_Visible',ctrl:'GUIFASLIN',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'edtGuiFasPKg_Visible',ctrl:'GUIFASPKG',prop:'Visible'},{av:'edtGuiFasPMt_Visible',ctrl:'GUIFASPMT',prop:'Visible'},{av:'edtFasKgm_Visible',ctrl:'FASKGM',prop:'Visible'},{av:'edtFasMtr_Visible',ctrl:'FASMTR',prop:'Visible'},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTN_CANCEL',prop:'Visible'},{ctrl:'BTNINSERT',prop:'Visible'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121XD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV25TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV32TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV33TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV37TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV30TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV31TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV34TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV35TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV46AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV43VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV49Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131XD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV25TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV32TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV33TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV37TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV30TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV31TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV34TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV35TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV46AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV43VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV49Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141XD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV25TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV32TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV33TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV37TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV30TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV31TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV34TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV35TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV46AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV43VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV49Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV34TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV35TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV30TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV31TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV36TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV37TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV33TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV24TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV25TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e191XD2',iparms:[{av:'AV43VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV44Update',fld:'vUPDATE',pic:''},{av:'edtavUpdate_Class',ctrl:'vUPDATE',prop:'Class'},{av:'AV45Delete',fld:'vDELETE',pic:''},{av:'edtavDelete_Class',ctrl:'vDELETE',prop:'Class'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151XD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV25TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV32TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV33TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV37TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV30TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV31TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV34TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV35TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV46AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV43VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV49Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtGuiFasLin_Visible',ctrl:'GUIFASLIN',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'edtGuiFasPKg_Visible',ctrl:'GUIFASPKG',prop:'Visible'},{av:'edtGuiFasPMt_Visible',ctrl:'GUIFASPMT',prop:'Visible'},{av:'edtFasKgm_Visible',ctrl:'FASKGM',prop:'Visible'},{av:'edtFasMtr_Visible',ctrl:'FASMTR',prop:'Visible'},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTN_CANCEL',prop:'Visible'},{ctrl:'BTNINSERT',prop:'Visible'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111XD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV25TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV32TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV33TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV37TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV30TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV31TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV34TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV35TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV46AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV43VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV49Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV24TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV25TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV32TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV33TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV37TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV30TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV31TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV34TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV35TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtGuiFasLin_Visible',ctrl:'GUIFASLIN',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'edtGuiFasPKg_Visible',ctrl:'GUIFASPKG',prop:'Visible'},{av:'edtGuiFasPMt_Visible',ctrl:'GUIFASPMT',prop:'Visible'},{av:'edtFasKgm_Visible',ctrl:'FASKGM',prop:'Visible'},{av:'edtFasMtr_Visible',ctrl:'FASMTR',prop:'Visible'},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTN_CANCEL',prop:'Visible'},{ctrl:'BTNINSERT',prop:'Visible'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VUPDATE.CLICK","{handler:'e201XD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV25TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV32TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV33TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV37TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV30TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV31TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV34TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV35TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV46AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV43VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV49Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'A1240GuiFasLin',fld:'GUIFASLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("VUPDATE.CLICK",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtGuiFasLin_Visible',ctrl:'GUIFASLIN',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'edtGuiFasPKg_Visible',ctrl:'GUIFASPKG',prop:'Visible'},{av:'edtGuiFasPMt_Visible',ctrl:'GUIFASPMT',prop:'Visible'},{av:'edtFasKgm_Visible',ctrl:'FASKGM',prop:'Visible'},{av:'edtFasMtr_Visible',ctrl:'FASMTR',prop:'Visible'},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTN_CANCEL',prop:'Visible'},{ctrl:'BTNINSERT',prop:'Visible'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VDELETE.CLICK","{handler:'e211XD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV25TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV32TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV33TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV37TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV30TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV31TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV34TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV35TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV46AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV43VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV49Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'A1240GuiFasLin',fld:'GUIFASLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("VDELETE.CLICK",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtGuiFasLin_Visible',ctrl:'GUIFASLIN',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'edtGuiFasPKg_Visible',ctrl:'GUIFASPKG',prop:'Visible'},{av:'edtGuiFasPMt_Visible',ctrl:'GUIFASPMT',prop:'Visible'},{av:'edtFasKgm_Visible',ctrl:'FASKGM',prop:'Visible'},{av:'edtFasMtr_Visible',ctrl:'FASMTR',prop:'Visible'},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTN_CANCEL',prop:'Visible'},{ctrl:'BTNINSERT',prop:'Visible'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e161XD2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV24TFGuiFasLin',fld:'vTFGUIFASLIN',pic:'ZZZ9'},{av:'AV25TFGuiFasLin_To',fld:'vTFGUIFASLIN_TO',pic:'ZZZ9'},{av:'AV26TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV27TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV28TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV29TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV32TFGuiFasPKg',fld:'vTFGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV33TFGuiFasPKg_To',fld:'vTFGUIFASPKG_TO',pic:'ZZZZZZ9.999'},{av:'AV36TFGuiFasPMt',fld:'vTFGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV37TFGuiFasPMt_To',fld:'vTFGUIFASPMT_TO',pic:'ZZZZZZ9.999'},{av:'AV30TFFasKgm',fld:'vTFFASKGM',pic:'ZZZZZ9.99'},{av:'AV31TFFasKgm_To',fld:'vTFFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV34TFFasMtr',fld:'vTFFASMTR',pic:'ZZZZZ9.99'},{av:'AV35TFFasMtr_To',fld:'vTFFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV46AccionesEnPopup',fld:'vACCIONESENPOPUP',pic:''},{av:'AV43VisualizarAcciones',fld:'vVISUALIZARACCIONES',pic:''},{av:'AV49Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'sPrefix'},{av:'A1240GuiFasLin',fld:'GUIFASLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtGuiFasLin_Visible',ctrl:'GUIFASLIN',prop:'Visible'},{av:'edtFasCod_Visible',ctrl:'FASCOD',prop:'Visible'},{av:'edtFasDsc_Visible',ctrl:'FASDSC',prop:'Visible'},{av:'edtGuiFasPKg_Visible',ctrl:'GUIFASPKG',prop:'Visible'},{av:'edtGuiFasPMt_Visible',ctrl:'GUIFASPMT',prop:'Visible'},{av:'edtFasKgm_Visible',ctrl:'FASKGM',prop:'Visible'},{av:'edtFasMtr_Visible',ctrl:'FASMTR',prop:'Visible'},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTN_CANCEL',prop:'Visible'},{ctrl:'BTNINSERT',prop:'Visible'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Fasmtr',iparms:[]");
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
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
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
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV15FilterFullText = "" ;
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26TFFasCod = "" ;
      AV27TFFasCod_Sel = "" ;
      AV28TFFasDsc = "" ;
      AV29TFFasDsc_Sel = "" ;
      AV32TFGuiFasPKg = DecimalUtil.ZERO ;
      AV33TFGuiFasPKg_To = DecimalUtil.ZERO ;
      AV36TFGuiFasPMt = DecimalUtil.ZERO ;
      AV37TFGuiFasPMt_To = DecimalUtil.ZERO ;
      AV30TFFasKgm = DecimalUtil.ZERO ;
      AV31TFFasKgm_To = DecimalUtil.ZERO ;
      AV34TFFasMtr = DecimalUtil.ZERO ;
      AV35TFFasMtr_To = DecimalUtil.ZERO ;
      AV49Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV21ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV38DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tablealbaran = new com.genexus.webpanels.GXUserControl();
      lblTbngruia_Jsonclick = "" ;
      A1244GuiRemCln = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      lblTbos_Jsonclick = "" ;
      TempTags = "" ;
      bttBtninsert_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      bttBtn_cancel_Jsonclick = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV44Update = "" ;
      AV45Delete = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV54Albaranes_albaranguiafase__wwds_1_filterfulltext = "" ;
      lV57Albaranes_albaranguiafase__wwds_4_tffascod = "" ;
      lV59Albaranes_albaranguiafase__wwds_6_tffasdsc = "" ;
      AV54Albaranes_albaranguiafase__wwds_1_filterfulltext = "" ;
      AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel = "" ;
      AV57Albaranes_albaranguiafase__wwds_4_tffascod = "" ;
      AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel = "" ;
      AV59Albaranes_albaranguiafase__wwds_6_tffasdsc = "" ;
      AV61Albaranes_albaranguiafase__wwds_8_tfguifaspkg = DecimalUtil.ZERO ;
      AV62Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to = DecimalUtil.ZERO ;
      AV63Albaranes_albaranguiafase__wwds_10_tfguifaspmt = DecimalUtil.ZERO ;
      AV64Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to = DecimalUtil.ZERO ;
      AV65Albaranes_albaranguiafase__wwds_12_tffaskgm = DecimalUtil.ZERO ;
      AV66Albaranes_albaranguiafase__wwds_13_tffaskgm_to = DecimalUtil.ZERO ;
      AV67Albaranes_albaranguiafase__wwds_14_tffasmtr = DecimalUtil.ZERO ;
      AV68Albaranes_albaranguiafase__wwds_15_tffasmtr_to = DecimalUtil.ZERO ;
      H01XD2_A1253EmprGuiRem = new String[] {""} ;
      H01XD2_A396EmprCod = new String[] {""} ;
      H01XD2_A30AlbProCod = new long[1] ;
      H01XD2_A129BarCod = new int[1] ;
      H01XD2_A132BarCodReo = new byte[1] ;
      H01XD2_A130BarCodPar = new String[] {""} ;
      H01XD2_A5805AlbEnvFtp = new byte[1] ;
      H01XD2_A1243GuiRemCli = new int[1] ;
      H01XD2_A1244GuiRemCln = new String[] {""} ;
      H01XD2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H01XD2_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XD2_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XD2_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XD2_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XD2_A460FasDsc = new String[] {""} ;
      H01XD2_A457FasCod = new String[] {""} ;
      H01XD2_A1240GuiFasLin = new short[1] ;
      H01XD3_AGRID_nRecordCount = new long[1] ;
      H01XD4_A1253EmprGuiRem = new String[] {""} ;
      H01XD4_A5805AlbEnvFtp = new byte[1] ;
      H01XD4_A1243GuiRemCli = new int[1] ;
      H01XD4_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A1253EmprGuiRem = "" ;
      H01XD5_A1244GuiRemCln = new String[] {""} ;
      hsh = "" ;
      AV50Station = "" ;
      AV51Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV52Emprnom = "" ;
      AV53Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22ManageFiltersXml = "" ;
      AV17UserCustomValue = "" ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
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
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA30AlbProCod = "" ;
      sCtrlA129BarCod = "" ;
      sCtrlA132BarCodReo = "" ;
      sCtrlA130BarCodPar = "" ;
      sCtrlAV43VisualizarAcciones = "" ;
      sCtrlAV46AccionesEnPopup = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguiafase__ww__default(),
         new Object[] {
             new Object[] {
            H01XD2_A1253EmprGuiRem, H01XD2_A396EmprCod, H01XD2_A30AlbProCod, H01XD2_A129BarCod, H01XD2_A132BarCodReo, H01XD2_A130BarCodPar, H01XD2_A5805AlbEnvFtp, H01XD2_A1243GuiRemCli, H01XD2_A1244GuiRemCln, H01XD2_A34AlbProfch,
            H01XD2_A1276FasMtr, H01XD2_A1275FasKgm, H01XD2_A1242GuiFasPMt, H01XD2_A1241GuiFasPKg, H01XD2_A460FasDsc, H01XD2_A457FasCod, H01XD2_A1240GuiFasLin
            }
            , new Object[] {
            H01XD3_AGRID_nRecordCount
            }
            , new Object[] {
            H01XD4_A1253EmprGuiRem, H01XD4_A5805AlbEnvFtp, H01XD4_A1243GuiRemCli, H01XD4_A34AlbProfch
            }
            , new Object[] {
            H01XD5_A1244GuiRemCln
            }
         }
      );
      AV49Pgmname = "Albaranes.AlbaranGuiaFase__WW" ;
      /* GeneXus formulas. */
      AV49Pgmname = "Albaranes.AlbaranGuiaFase__WW" ;
      Gx_err = (short)(0) ;
      edtavUpdate_Enabled = 0 ;
      edtavDelete_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOA132BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A132BarCodReo ;
   private byte AV23ManageFiltersExecutionStep ;
   private byte A5805AlbEnvFtp ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV24TFGuiFasLin ;
   private short AV25TFGuiFasLin_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A1240GuiFasLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV55Albaranes_albaranguiafase__wwds_2_tfguifaslin ;
   private short AV56Albaranes_albaranguiafase__wwds_3_tfguifaslin_to ;
   private int wcpOA129BarCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_84 ;
   private int A129BarCod ;
   private int nGXsfl_84_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtAlbProCod_Enabled ;
   private int A1243GuiRemCli ;
   private int edtGuiRemCli_Enabled ;
   private int edtGuiRemCln_Enabled ;
   private int edtAlbProfch_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int bttBtninsert_Visible ;
   private int bttBtn_cancel_Visible ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int subGrid_Islastpage ;
   private int edtavUpdate_Enabled ;
   private int edtavDelete_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtGuiFasLin_Visible ;
   private int edtFasCod_Visible ;
   private int edtFasDsc_Visible ;
   private int edtGuiFasPKg_Visible ;
   private int edtGuiFasPMt_Visible ;
   private int edtFasKgm_Visible ;
   private int edtFasMtr_Visible ;
   private int AV39PageToGo ;
   private int AV69GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavUpdate_Visible ;
   private int edtavDelete_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long wcpOA30AlbProCod ;
   private long GRID_nFirstRecordOnPage ;
   private long A30AlbProCod ;
   private long AV40GridCurrentPage ;
   private long AV41GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV32TFGuiFasPKg ;
   private java.math.BigDecimal AV33TFGuiFasPKg_To ;
   private java.math.BigDecimal AV36TFGuiFasPMt ;
   private java.math.BigDecimal AV37TFGuiFasPMt_To ;
   private java.math.BigDecimal AV30TFFasKgm ;
   private java.math.BigDecimal AV31TFFasKgm_To ;
   private java.math.BigDecimal AV34TFFasMtr ;
   private java.math.BigDecimal AV35TFFasMtr_To ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal AV61Albaranes_albaranguiafase__wwds_8_tfguifaspkg ;
   private java.math.BigDecimal AV62Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to ;
   private java.math.BigDecimal AV63Albaranes_albaranguiafase__wwds_10_tfguifaspmt ;
   private java.math.BigDecimal AV64Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to ;
   private java.math.BigDecimal AV65Albaranes_albaranguiafase__wwds_12_tffaskgm ;
   private java.math.BigDecimal AV66Albaranes_albaranguiafase__wwds_13_tffaskgm_to ;
   private java.math.BigDecimal AV67Albaranes_albaranguiafase__wwds_14_tffasmtr ;
   private java.math.BigDecimal AV68Albaranes_albaranguiafase__wwds_15_tffasmtr_to ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
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
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String sGXsfl_84_idx="0001" ;
   private String AV26TFFasCod ;
   private String AV27TFFasCod_Sel ;
   private String AV28TFFasDsc ;
   private String AV29TFFasDsc_Sel ;
   private String AV49Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tablealbaran_Width ;
   private String Dvpanel_tablealbaran_Cls ;
   private String Dvpanel_tablealbaran_Title ;
   private String Dvpanel_tablealbaran_Iconposition ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
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
   private String divTablecontent_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divDvpanel_tablealbaran_cell_Internalname ;
   private String divDvpanel_tablealbaran_cell_Class ;
   private String Dvpanel_tablealbaran_Internalname ;
   private String divTablealbaran_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String lblTbngruia_Internalname ;
   private String lblTbngruia_Jsonclick ;
   private String edtAlbProCod_Internalname ;
   private String edtAlbProCod_Jsonclick ;
   private String edtGuiRemCli_Internalname ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtGuiRemCln_Internalname ;
   private String A1244GuiRemCln ;
   private String edtGuiRemCln_Jsonclick ;
   private String edtAlbProfch_Internalname ;
   private String edtAlbProfch_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String lblTbos_Internalname ;
   private String lblTbos_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavUpdate_Internalname ;
   private String AV44Update ;
   private String AV45Delete ;
   private String edtavDelete_Internalname ;
   private String edtGuiFasLin_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String edtGuiFasPKg_Internalname ;
   private String edtGuiFasPMt_Internalname ;
   private String edtFasKgm_Internalname ;
   private String edtFasMtr_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV57Albaranes_albaranguiafase__wwds_4_tffascod ;
   private String lV59Albaranes_albaranguiafase__wwds_6_tffasdsc ;
   private String AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel ;
   private String AV57Albaranes_albaranguiafase__wwds_4_tffascod ;
   private String AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel ;
   private String AV59Albaranes_albaranguiafase__wwds_6_tffasdsc ;
   private String A1253EmprGuiRem ;
   private String hsh ;
   private String AV50Station ;
   private String AV51Emprcod ;
   private String GXv_char2[] ;
   private String AV52Emprnom ;
   private String AV53Usurcod ;
   private String edtavUpdate_Class ;
   private String edtavDelete_Class ;
   private String GXt_char12 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA30AlbProCod ;
   private String sCtrlA129BarCod ;
   private String sCtrlA132BarCodReo ;
   private String sCtrlA130BarCodPar ;
   private String sCtrlAV43VisualizarAcciones ;
   private String sCtrlAV46AccionesEnPopup ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavUpdate_Jsonclick ;
   private String edtavDelete_Jsonclick ;
   private String edtGuiFasLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtGuiFasPKg_Jsonclick ;
   private String edtGuiFasPMt_Jsonclick ;
   private String edtFasKgm_Jsonclick ;
   private String edtFasMtr_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A34AlbProfch ;
   private boolean wcpOAV43VisualizarAcciones ;
   private boolean wcpOAV46AccionesEnPopup ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV43VisualizarAcciones ;
   private boolean AV46AccionesEnPopup ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_tablealbaran_Autowidth ;
   private boolean Dvpanel_tablealbaran_Autoheight ;
   private boolean Dvpanel_tablealbaran_Collapsible ;
   private boolean Dvpanel_tablealbaran_Collapsed ;
   private boolean Dvpanel_tablealbaran_Showcollapseicon ;
   private boolean Dvpanel_tablealbaran_Autoscroll ;
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
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV16ColumnsSelectorXML ;
   private String AV22ManageFiltersXml ;
   private String AV17UserCustomValue ;
   private String AV15FilterFullText ;
   private String lV54Albaranes_albaranguiafase__wwds_1_filterfulltext ;
   private String AV54Albaranes_albaranguiafase__wwds_1_filterfulltext ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablealbaran ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbEnvFtp ;
   private IDataStoreProvider pr_default ;
   private String[] H01XD2_A1253EmprGuiRem ;
   private String[] H01XD2_A396EmprCod ;
   private long[] H01XD2_A30AlbProCod ;
   private int[] H01XD2_A129BarCod ;
   private byte[] H01XD2_A132BarCodReo ;
   private String[] H01XD2_A130BarCodPar ;
   private byte[] H01XD2_A5805AlbEnvFtp ;
   private int[] H01XD2_A1243GuiRemCli ;
   private String[] H01XD2_A1244GuiRemCln ;
   private java.util.Date[] H01XD2_A34AlbProfch ;
   private java.math.BigDecimal[] H01XD2_A1276FasMtr ;
   private java.math.BigDecimal[] H01XD2_A1275FasKgm ;
   private java.math.BigDecimal[] H01XD2_A1242GuiFasPMt ;
   private java.math.BigDecimal[] H01XD2_A1241GuiFasPKg ;
   private String[] H01XD2_A460FasDsc ;
   private String[] H01XD2_A457FasCod ;
   private short[] H01XD2_A1240GuiFasLin ;
   private long[] H01XD3_AGRID_nRecordCount ;
   private String[] H01XD4_A1253EmprGuiRem ;
   private byte[] H01XD4_A5805AlbEnvFtp ;
   private int[] H01XD4_A1243GuiRemCli ;
   private java.util.Date[] H01XD4_A34AlbProfch ;
   private String[] H01XD5_A1244GuiRemCln ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV21ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState13[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV38DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class albaranguiafase__ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01XD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Albaranes_albaranguiafase__wwds_1_filterfulltext ,
                                          short AV55Albaranes_albaranguiafase__wwds_2_tfguifaslin ,
                                          short AV56Albaranes_albaranguiafase__wwds_3_tfguifaslin_to ,
                                          String AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel ,
                                          String AV57Albaranes_albaranguiafase__wwds_4_tffascod ,
                                          String AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel ,
                                          String AV59Albaranes_albaranguiafase__wwds_6_tffasdsc ,
                                          java.math.BigDecimal AV61Albaranes_albaranguiafase__wwds_8_tfguifaspkg ,
                                          java.math.BigDecimal AV62Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to ,
                                          java.math.BigDecimal AV63Albaranes_albaranguiafase__wwds_10_tfguifaspmt ,
                                          java.math.BigDecimal AV64Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to ,
                                          java.math.BigDecimal AV65Albaranes_albaranguiafase__wwds_12_tffaskgm ,
                                          java.math.BigDecimal AV66Albaranes_albaranguiafase__wwds_13_tffaskgm_to ,
                                          java.math.BigDecimal AV67Albaranes_albaranguiafase__wwds_14_tffasmtr ,
                                          java.math.BigDecimal AV68Albaranes_albaranguiafase__wwds_15_tffasmtr_to ,
                                          short A1240GuiFasLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          java.math.BigDecimal A1241GuiFasPKg ,
                                          java.math.BigDecimal A1242GuiFasPMt ,
                                          java.math.BigDecimal A1275FasKgm ,
                                          java.math.BigDecimal A1276FasMtr ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[31];
      Object[] GXv_Object15 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T3.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.AlbEnvFtp, T3.GuiRemCli AS GuiRemCli, T4.CliNom AS GuiRemCln, T3.AlbProfch," ;
      sSelectString += " T1.FasMtr, T1.FasKgm, T1.GuiFasPMt, T1.GuiFasPKg, T2.FasDsc, T1.FasCod, T1.GuiFasLin" ;
      sFromString = " FROM (((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod" ;
      sFromString += " = T1.AlbProCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T3.EmprGuiRem AND T4.CliCod = T3.GuiRemCli)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV54Albaranes_albaranguiafase__wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.GuiFasLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.GuiFasPKg,'9999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.GuiFasPMt,'9999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasMtr,'999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
         GXv_int14[6] = (byte)(1) ;
         GXv_int14[7] = (byte)(1) ;
         GXv_int14[8] = (byte)(1) ;
         GXv_int14[9] = (byte)(1) ;
         GXv_int14[10] = (byte)(1) ;
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV55Albaranes_albaranguiafase__wwds_2_tfguifaslin) )
      {
         addWhere(sWhereString, "(T1.GuiFasLin >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV56Albaranes_albaranguiafase__wwds_3_tfguifaslin_to) )
      {
         addWhere(sWhereString, "(T1.GuiFasLin <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV57Albaranes_albaranguiafase__wwds_4_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Albaranes_albaranguiafase__wwds_6_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Albaranes_albaranguiafase__wwds_8_tfguifaspkg)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPKg >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPKg <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Albaranes_albaranguiafase__wwds_10_tfguifaspmt)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPMt >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPMt <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Albaranes_albaranguiafase__wwds_12_tffaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgm >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Albaranes_albaranguiafase__wwds_13_tffaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgm <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Albaranes_albaranguiafase__wwds_14_tffasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.FasMtr >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Albaranes_albaranguiafase__wwds_15_tffasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasMtr <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.GuiFasLin" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.GuiFasLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasDsc" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.GuiFasPKg" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.GuiFasPKg DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.GuiFasPMt" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.GuiFasPMt DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasKgm" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasKgm DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasMtr" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasMtr DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_H01XD3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Albaranes_albaranguiafase__wwds_1_filterfulltext ,
                                          short AV55Albaranes_albaranguiafase__wwds_2_tfguifaslin ,
                                          short AV56Albaranes_albaranguiafase__wwds_3_tfguifaslin_to ,
                                          String AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel ,
                                          String AV57Albaranes_albaranguiafase__wwds_4_tffascod ,
                                          String AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel ,
                                          String AV59Albaranes_albaranguiafase__wwds_6_tffasdsc ,
                                          java.math.BigDecimal AV61Albaranes_albaranguiafase__wwds_8_tfguifaspkg ,
                                          java.math.BigDecimal AV62Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to ,
                                          java.math.BigDecimal AV63Albaranes_albaranguiafase__wwds_10_tfguifaspmt ,
                                          java.math.BigDecimal AV64Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to ,
                                          java.math.BigDecimal AV65Albaranes_albaranguiafase__wwds_12_tffaskgm ,
                                          java.math.BigDecimal AV66Albaranes_albaranguiafase__wwds_13_tffaskgm_to ,
                                          java.math.BigDecimal AV67Albaranes_albaranguiafase__wwds_14_tffasmtr ,
                                          java.math.BigDecimal AV68Albaranes_albaranguiafase__wwds_15_tffasmtr_to ,
                                          short A1240GuiFasLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          java.math.BigDecimal A1241GuiFasPKg ,
                                          java.math.BigDecimal A1242GuiFasPMt ,
                                          java.math.BigDecimal A1275FasKgm ,
                                          java.math.BigDecimal A1276FasMtr ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[26];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.AlbProCod = T1.AlbProCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T3.EmprGuiRem AND T4.CliCod = T3.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV54Albaranes_albaranguiafase__wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.GuiFasLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.GuiFasPKg,'9999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.GuiFasPMt,'9999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.FasMtr,'999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
         GXv_int16[6] = (byte)(1) ;
         GXv_int16[7] = (byte)(1) ;
         GXv_int16[8] = (byte)(1) ;
         GXv_int16[9] = (byte)(1) ;
         GXv_int16[10] = (byte)(1) ;
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (0==AV55Albaranes_albaranguiafase__wwds_2_tfguifaslin) )
      {
         addWhere(sWhereString, "(T1.GuiFasLin >= ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (0==AV56Albaranes_albaranguiafase__wwds_3_tfguifaslin_to) )
      {
         addWhere(sWhereString, "(T1.GuiFasLin <= ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV57Albaranes_albaranguiafase__wwds_4_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Albaranes_albaranguiafase__wwds_5_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Albaranes_albaranguiafase__wwds_6_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Albaranes_albaranguiafase__wwds_7_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Albaranes_albaranguiafase__wwds_8_tfguifaspkg)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPKg >= ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Albaranes_albaranguiafase__wwds_9_tfguifaspkg_to)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPKg <= ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Albaranes_albaranguiafase__wwds_10_tfguifaspmt)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPMt >= ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Albaranes_albaranguiafase__wwds_11_tfguifaspmt_to)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPMt <= ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Albaranes_albaranguiafase__wwds_12_tffaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgm >= ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Albaranes_albaranguiafase__wwds_13_tffaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgm <= ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Albaranes_albaranguiafase__wwds_14_tffasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.FasMtr >= ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Albaranes_albaranguiafase__wwds_15_tffasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasMtr <= ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
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
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
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

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H01XD2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Boolean) dynConstraints[23]).booleanValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] );
            case 1 :
                  return conditional_H01XD3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Boolean) dynConstraints[23]).booleanValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01XD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01XD3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01XD4", "SELECT EmprGuiRem, AlbEnvFtp, GuiRemCli, AlbProfch FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01XD5", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((String[]) buf[14])[0] = rslt.getString(15, 28);
               ((String[]) buf[15])[0] = rslt.getString(16, 8);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[32]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 28);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[27]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 28);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

