package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recepciondeensayocliente__wc_impl extends GXWebComponent
{
   public recepciondeensayocliente__wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recepciondeensayocliente__wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recepciondeensayocliente__wc_impl.class ));
   }

   public recepciondeensayocliente__wc_impl( int remoteHandle ,
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
      chkavActualizacionensayotxp = UIFactory.getCheckbox(this);
      chkavAprobacioncolorlab = UIFactory.getCheckbox(this);
      chkavRecepciondeensayocliente_sdt__seleccionar = UIFactory.getCheckbox(this);
      cmbavRecepciondeensayocliente_sdt__lb_tiprec = new HTMLChoice();
      cmbavRecepciondeensayocliente_sdt__lb_estado = new HTMLChoice();
      chkavRecepciondeensayocliente_sdt__eliminar = UIFactory.getCheckbox(this);
      cmbavRecepciondeensayocliente_sdt__lb_provdef = new HTMLChoice();
      cmbavRecepciondeensayocliente_sdt__lb_opst = new HTMLChoice();
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
               AV61ClicodIN = (int)(GXutil.lval( httpContext.GetPar( "ClicodIN"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61ClicodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61ClicodIN), 6, 0));
               AV62Lb_CartazIN = httpContext.GetPar( "Lb_CartazIN") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Lb_CartazIN", AV62Lb_CartazIN);
               AV63Lb_ColNomIN = httpContext.GetPar( "Lb_ColNomIN") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Lb_ColNomIN", AV63Lb_ColNomIN);
               AV64Lb_numeroIN = (int)(GXutil.lval( httpContext.GetPar( "Lb_numeroIN"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Lb_numeroIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64Lb_numeroIN), 8, 0));
               AV66Lb_fechaRIN = localUtil.parseDateParm( httpContext.GetPar( "Lb_fechaRIN")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Lb_fechaRIN", localUtil.format(AV66Lb_fechaRIN, "99/99/99"));
               AV65Lb_estadoIN = (byte)(GXutil.lval( httpContext.GetPar( "Lb_estadoIN"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Lb_estadoIN", GXutil.str( AV65Lb_estadoIN, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV73EmprcodIN,Integer.valueOf(AV61ClicodIN),AV62Lb_CartazIN,AV63Lb_ColNomIN,Integer.valueOf(AV64Lb_numeroIN),AV66Lb_fechaRIN,Byte.valueOf(AV65Lb_estadoIN)});
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
      nRC_GXsfl_72 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_72"))) ;
      nGXsfl_72_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_72_idx"))) ;
      sGXsfl_72_idx = httpContext.GetPar( "sGXsfl_72_idx") ;
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV11ColumnsSelector);
      AV106Pgmname = httpContext.GetPar( "Pgmname") ;
      AV19FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV73EmprcodIN = httpContext.GetPar( "EmprcodIN") ;
      AV61ClicodIN = (int)(GXutil.lval( httpContext.GetPar( "ClicodIN"))) ;
      AV62Lb_CartazIN = httpContext.GetPar( "Lb_CartazIN") ;
      AV63Lb_ColNomIN = httpContext.GetPar( "Lb_ColNomIN") ;
      AV64Lb_numeroIN = (int)(GXutil.lval( httpContext.GetPar( "Lb_numeroIN"))) ;
      AV66Lb_fechaRIN = localUtil.parseDateParm( httpContext.GetPar( "Lb_fechaRIN")) ;
      AV65Lb_estadoIN = (byte)(GXutil.lval( httpContext.GetPar( "Lb_estadoIN"))) ;
      AV39ActualizacionEnsayoTxp = httpContext.GetPar( "ActualizacionEnsayoTxp") ;
      AV40AprobacionColorLab = httpContext.GetPar( "AprobacionColorLab") ;
      AV29Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV27ManageFiltersExecutionStep, AV11ColumnsSelector, AV106Pgmname, AV19FilterFullText, AV73EmprcodIN, AV61ClicodIN, AV62Lb_CartazIN, AV63Lb_ColNomIN, AV64Lb_numeroIN, AV66Lb_fechaRIN, AV65Lb_estadoIN, AV39ActualizacionEnsayoTxp, AV40AprobacionColorLab, AV29Moda21, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa28M2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Recepcionde Ensayo Cliente", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.recepciondeensayocliente__wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV73EmprcodIN)),GXutil.URLEncode(GXutil.ltrimstr(AV61ClicodIN,6,0)),GXutil.URLEncode(GXutil.rtrim(AV62Lb_CartazIN)),GXutil.URLEncode(GXutil.rtrim(AV63Lb_ColNomIN)),GXutil.URLEncode(GXutil.ltrimstr(AV64Lb_numeroIN,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV66Lb_fechaRIN)),GXutil.URLEncode(GXutil.ltrimstr(AV65Lb_estadoIN,1,0))}, new String[] {"EmprcodIN","ClicodIN","Lb_CartazIN","Lb_ColNomIN","Lb_numeroIN","Lb_fechaRIN","Lb_estadoIN"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV29Moda21), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RecepciondeEnsayoCliente__WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV106Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\recepciondeensayocliente__wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Recepciondeensayocliente_sdt", AV31RecepciondeEnsayoCliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Recepciondeensayocliente_sdt", AV31RecepciondeEnsayoCliente_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_72", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_72, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV26ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV26ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV20GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV21GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV14DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV14DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV11ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV11ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV73EmprcodIN", GXutil.rtrim( wcpOAV73EmprcodIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV61ClicodIN", GXutil.ltrim( localUtil.ntoc( wcpOAV61ClicodIN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV62Lb_CartazIN", GXutil.rtrim( wcpOAV62Lb_CartazIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63Lb_ColNomIN", GXutil.rtrim( wcpOAV63Lb_ColNomIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64Lb_numeroIN", GXutil.ltrim( localUtil.ntoc( wcpOAV64Lb_numeroIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV66Lb_fechaRIN", localUtil.dtoc( wcpOAV66Lb_fechaRIN, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV65Lb_estadoIN", GXutil.ltrim( localUtil.ntoc( wcpOAV65Lb_estadoIN, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV27ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCODIN", GXutil.rtrim( AV73EmprcodIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODIN", GXutil.ltrim( localUtil.ntoc( AV61ClicodIN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_CARTAZIN", GXutil.rtrim( AV62Lb_CartazIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_COLNOMIN", GXutil.rtrim( AV63Lb_ColNomIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_NUMEROIN", GXutil.ltrim( localUtil.ntoc( AV64Lb_numeroIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHARIN", localUtil.dtoc( AV66Lb_fechaRIN, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_ESTADOIN", GXutil.ltrim( localUtil.ntoc( AV65Lb_estadoIN, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV22GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV22GridState);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vRECEPCIONDEENSAYOCLIENTE_SDT", AV31RecepciondeEnsayoCliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vRECEPCIONDEENSAYOCLIENTE_SDT", AV31RecepciondeEnsayoCliente_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIN_LB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV44IN_Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV15Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV29Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV29Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHA_B", localUtil.dtoc( AV69Fecha_b, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vRECEPCIONDEENSAYOCLIENTE_SDT_ITEM", AV43RecepciondeEnsayoCliente_SDT_item);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vRECEPCIONDEENSAYOCLIENTE_SDT_ITEM", AV43RecepciondeEnsayoCliente_SDT_item);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGXV31", GXutil.ltrim( localUtil.ntoc( AV109GXV31, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLINEAS", GXutil.ltrim( localUtil.ntoc( AV49Lineas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGXV36", GXutil.ltrim( localUtil.ntoc( AV114GXV36, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIN_LB_NUMEROT", GXutil.ltrim( localUtil.ntoc( AV46IN_Lb_numerot, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAEN", localUtil.dtoc( AV45Lb_FechaEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGXV30", GXutil.ltrim( localUtil.ntoc( AV108GXV30, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNUM_V", GXutil.ltrim( localUtil.ntoc( AV42Num_v, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Title", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Title", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Result", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Result", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Result", GXutil.rtrim( Dvelop_confirmpanel_recepcion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarrecepcion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Result", GXutil.rtrim( Dvelop_confirmpanel_aprobacioninterna_Result));
   }

   public void renderHtmlCloseForm28M2( )
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
      return "GestionLaboratorio.RecepciondeEnsayoCliente__WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recepcionde Ensayo Cliente", "") ;
   }

   public void wb28M0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.gestionlaboratorio.recepciondeensayocliente__wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 72, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 72, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 72, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_28M2( true) ;
      }
      else
      {
         wb_table1_23_28M2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_28M2e( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrecepcion_Internalname, "gx.evt.setGridEvt("+GXutil.str( 72, 2, 0)+","+"null"+");", httpContext.getMessage( "Recepcion Ensayo", ""), bttBtnrecepcion_Jsonclick, 7, httpContext.getMessage( "Recepcion Ensayo", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1128m1_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarrecepcion_Internalname, "gx.evt.setGridEvt("+GXutil.str( 72, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Recepcion", ""), bttBtneliminarrecepcion_Jsonclick, 7, httpContext.getMessage( "Eliminar Recepcion", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1228m1_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnaprobacioninterna_Internalname, "gx.evt.setGridEvt("+GXutil.str( 72, 2, 0)+","+"null"+");", httpContext.getMessage( "Aprobacion Interna", ""), bttBtnaprobacioninterna_Jsonclick, 5, httpContext.getMessage( "Aprobacion Interna", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOAPROBACIONINTERNA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 72, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente__WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavActualizacionensayotxp.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'" + sPrefix + "',false,'" + sGXsfl_72_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavActualizacionensayotxp.getInternalname(), AV39ActualizacionEnsayoTxp, "", "", 1, chkavActualizacionensayotxp.getEnabled(), "S", httpContext.getMessage( "Actualizar Ensayo en Produccion?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(62, this, 'S', 'N',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,62);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavAprobacioncolorlab.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'" + sPrefix + "',false,'" + sGXsfl_72_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavAprobacioncolorlab.getInternalname(), AV40AprobacionColorLab, "", "", 1, chkavAprobacioncolorlab.getEnabled(), "S", httpContext.getMessage( "Actualizar Color Laboratorio?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(66, this, 'S', 'N',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,66);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol72( ) ;
      }
      if ( wbEnd == 72 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_72 = (int)(nGXsfl_72_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV77GXV1 = nGXsfl_72_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV20GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV21GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV106Pgmname), GXutil.rtrim( localUtil.format( AV106Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente__WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV14DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV14DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV11ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_116_28M2( true) ;
      }
      else
      {
         wb_table2_116_28M2( false) ;
      }
      return  ;
   }

   public void wb_table2_116_28M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_121_28M2( true) ;
      }
      else
      {
         wb_table3_121_28M2( false) ;
      }
      return  ;
   }

   public void wb_table3_121_28M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_126_28M2( true) ;
      }
      else
      {
         wb_table4_126_28M2( false) ;
      }
      return  ;
   }

   public void wb_table4_126_28M2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
      if ( wbEnd == 72 )
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
               AV77GXV1 = nGXsfl_72_idx ;
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

   public void start28M2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Recepcionde Ensayo Cliente", ""), (short)(0)) ;
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
            strup28M0( ) ;
         }
      }
   }

   public void ws28M2( )
   {
      start28M2( ) ;
      evt28M2( ) ;
   }

   public void evt28M2( )
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
                              strup28M0( ) ;
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
                              strup28M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1328M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1428M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1528M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1628M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_RECEPCION.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1728M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARRECEPCION.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1828M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_APROBACIONINTERNA.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1928M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOAPROBACIONINTERNA'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoAprobacionInterna' */
                                 e2028M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCancelar' */
                                 e2128M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e2228M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e2328M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = chkavRecepciondeensayocliente_sdt__seleccionar.getInternalname() ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 47), "RECEPCIONDEENSAYOCLIENTE_SDT__SELECCIONAR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 47), "RECEPCIONDEENSAYOCLIENTE_SDT__SELECCIONAR.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28M0( ) ;
                           }
                           nGXsfl_72_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_722( ) ;
                           AV77GXV1 = (int)(nGXsfl_72_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) && ( AV77GXV1 > 0 ) )
                           {
                              AV31RecepciondeEnsayoCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)) );
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
                                       GX_FocusControl = chkavRecepciondeensayocliente_sdt__seleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e2428M2 ();
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
                                       GX_FocusControl = chkavRecepciondeensayocliente_sdt__seleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e2528M2 ();
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
                                       GX_FocusControl = chkavRecepciondeensayocliente_sdt__seleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2628M2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "RECEPCIONDEENSAYOCLIENTE_SDT__SELECCIONAR.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavRecepciondeensayocliente_sdt__seleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2728M2 ();
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
                                    strup28M0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavRecepciondeensayocliente_sdt__seleccionar.getInternalname() ;
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

   public void we28M2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm28M2( ) ;
         }
      }
   }

   public void pa28M2( )
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
      subsflControlProps_722( ) ;
      while ( nGXsfl_72_idx <= nRC_GXsfl_72 )
      {
         sendrow_722( ) ;
         nGXsfl_72_idx = ((subGrid_Islastpage==1)&&(nGXsfl_72_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_72_idx+1) ;
         sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_722( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV27ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV11ColumnsSelector ,
                                 String AV106Pgmname ,
                                 String AV19FilterFullText ,
                                 String AV73EmprcodIN ,
                                 int AV61ClicodIN ,
                                 String AV62Lb_CartazIN ,
                                 String AV63Lb_ColNomIN ,
                                 int AV64Lb_numeroIN ,
                                 java.util.Date AV66Lb_fechaRIN ,
                                 byte AV65Lb_estadoIN ,
                                 String AV39ActualizacionEnsayoTxp ,
                                 String AV40AprobacionColorLab ,
                                 short AV29Moda21 ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2528M2 ();
      GRID_nCurrentRecord = 0 ;
      rf28M2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RecepciondeEnsayoCliente__WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV106Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\recepciondeensayocliente__wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      AV39ActualizacionEnsayoTxp = ((GXutil.strcmp(GXutil.rtrim( AV39ActualizacionEnsayoTxp), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39ActualizacionEnsayoTxp", AV39ActualizacionEnsayoTxp);
      AV40AprobacionColorLab = ((GXutil.strcmp(GXutil.rtrim( AV40AprobacionColorLab), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40AprobacionColorLab", AV40AprobacionColorLab);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf28M2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV106Pgmname = "GestionLaboratorio.RecepciondeEnsayoCliente__WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106Pgmname", AV106Pgmname);
      Gx_err = (short)(0) ;
      edtavRecepciondeensayocliente_sdt__lb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_numero_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__clicod_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_artcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_artcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_artcod_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_colnomc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_colnomc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_colnomc_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_colnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_colnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_colnum_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_rb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_rb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_rb_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_opcion_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_numop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_numop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_numop_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_cartaz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_cartaz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_cartaz_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_fechae_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_fechae_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_fechae_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_fechaen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_fechaen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_fechaen_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_fechar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_fechar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_fechar_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      cmbavRecepciondeensayocliente_sdt__lb_estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecepciondeensayocliente_sdt__lb_estado.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecepciondeensayocliente_sdt__lb_estado.getEnabled(), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_obscr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_obscr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_obscr_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      cmbavRecepciondeensayocliente_sdt__lb_opst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecepciondeensayocliente_sdt__lb_opst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecepciondeensayocliente_sdt__lb_opst.getEnabled(), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_opfc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_opfc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_opfc_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__clinom_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__f_cformu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__f_cformu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__f_cformu_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__fornumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__fornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__fornumcol_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_costee_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_costee_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_costee_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__tipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__tipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__tipcolcod_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_colnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_colnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_colnom_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__forultuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__forultuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__forultuti_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_rgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_rgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_rgb_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf28M2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(72) ;
      /* Execute user event: Refresh */
      e2528M2 ();
      nGXsfl_72_idx = 1 ;
      sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_722( ) ;
      bGXsfl_72_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_722( ) ;
         e2628M2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_72_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e2628M2 ();
         }
         wbEnd = (short)(72) ;
         wb28M0( ) ;
      }
      bGXsfl_72_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes28M2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV29Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV29Moda21), "ZZZ9")));
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
      return AV31RecepciondeEnsayoCliente_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27ManageFiltersExecutionStep, AV11ColumnsSelector, AV106Pgmname, AV19FilterFullText, AV73EmprcodIN, AV61ClicodIN, AV62Lb_CartazIN, AV63Lb_ColNomIN, AV64Lb_numeroIN, AV66Lb_fechaRIN, AV65Lb_estadoIN, AV39ActualizacionEnsayoTxp, AV40AprobacionColorLab, AV29Moda21, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27ManageFiltersExecutionStep, AV11ColumnsSelector, AV106Pgmname, AV19FilterFullText, AV73EmprcodIN, AV61ClicodIN, AV62Lb_CartazIN, AV63Lb_ColNomIN, AV64Lb_numeroIN, AV66Lb_fechaRIN, AV65Lb_estadoIN, AV39ActualizacionEnsayoTxp, AV40AprobacionColorLab, AV29Moda21, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27ManageFiltersExecutionStep, AV11ColumnsSelector, AV106Pgmname, AV19FilterFullText, AV73EmprcodIN, AV61ClicodIN, AV62Lb_CartazIN, AV63Lb_ColNomIN, AV64Lb_numeroIN, AV66Lb_fechaRIN, AV65Lb_estadoIN, AV39ActualizacionEnsayoTxp, AV40AprobacionColorLab, AV29Moda21, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27ManageFiltersExecutionStep, AV11ColumnsSelector, AV106Pgmname, AV19FilterFullText, AV73EmprcodIN, AV61ClicodIN, AV62Lb_CartazIN, AV63Lb_ColNomIN, AV64Lb_numeroIN, AV66Lb_fechaRIN, AV65Lb_estadoIN, AV39ActualizacionEnsayoTxp, AV40AprobacionColorLab, AV29Moda21, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27ManageFiltersExecutionStep, AV11ColumnsSelector, AV106Pgmname, AV19FilterFullText, AV73EmprcodIN, AV61ClicodIN, AV62Lb_CartazIN, AV63Lb_ColNomIN, AV64Lb_numeroIN, AV66Lb_fechaRIN, AV65Lb_estadoIN, AV39ActualizacionEnsayoTxp, AV40AprobacionColorLab, AV29Moda21, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV106Pgmname = "GestionLaboratorio.RecepciondeEnsayoCliente__WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106Pgmname", AV106Pgmname);
      Gx_err = (short)(0) ;
      edtavRecepciondeensayocliente_sdt__lb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_numero_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__clicod_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_artcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_artcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_artcod_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_colnomc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_colnomc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_colnomc_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_colnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_colnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_colnum_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_rb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_rb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_rb_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_opcion_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_numop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_numop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_numop_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_cartaz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_cartaz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_cartaz_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_fechae_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_fechae_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_fechae_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_fechaen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_fechaen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_fechaen_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_fechar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_fechar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_fechar_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      cmbavRecepciondeensayocliente_sdt__lb_estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecepciondeensayocliente_sdt__lb_estado.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecepciondeensayocliente_sdt__lb_estado.getEnabled(), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_obscr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_obscr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_obscr_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      cmbavRecepciondeensayocliente_sdt__lb_opst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecepciondeensayocliente_sdt__lb_opst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecepciondeensayocliente_sdt__lb_opst.getEnabled(), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_opfc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_opfc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_opfc_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__clinom_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__f_cformu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__f_cformu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__f_cformu_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__fornumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__fornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__fornumcol_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_costee_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_costee_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_costee_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__tipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__tipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__tipcolcod_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_colnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_colnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_colnom_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__forultuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__forultuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__forultuti_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_rgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_rgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_rgb_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup28M0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2428M2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Recepciondeensayocliente_sdt"), AV31RecepciondeEnsayoCliente_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV26ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV14DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV11ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vRECEPCIONDEENSAYOCLIENTE_SDT"), AV31RecepciondeEnsayoCliente_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vRECEPCIONDEENSAYOCLIENTE_SDT_ITEM"), AV43RecepciondeEnsayoCliente_SDT_item);
         /* Read saved values. */
         nRC_GXsfl_72 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_72"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV20GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV21GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV73EmprcodIN = httpContext.cgiGet( sPrefix+"wcpOAV73EmprcodIN") ;
         wcpOAV61ClicodIN = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV61ClicodIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV62Lb_CartazIN = httpContext.cgiGet( sPrefix+"wcpOAV62Lb_CartazIN") ;
         wcpOAV63Lb_ColNomIN = httpContext.cgiGet( sPrefix+"wcpOAV63Lb_ColNomIN") ;
         wcpOAV64Lb_numeroIN = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV64Lb_numeroIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV66Lb_fechaRIN = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV66Lb_fechaRIN"), 0) ;
         wcpOAV65Lb_estadoIN = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65Lb_estadoIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV109GXV31 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vGXV31"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV49Lineas = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vLINEAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV114GXV36 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vGXV36"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV46IN_Lb_numerot = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vIN_LB_NUMEROT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV44IN_Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vIN_LB_NUMERO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV66Lb_fechaRIN = localUtil.ctod( httpContext.cgiGet( sPrefix+"vLB_FECHARIN"), 0) ;
         AV45Lb_FechaEn = localUtil.ctod( httpContext.cgiGet( sPrefix+"vLB_FECHAEN"), 0) ;
         AV108GXV30 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vGXV30"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_msg = httpContext.cgiGet( sPrefix+"vMSG") ;
         AV42Num_v = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vNUM_V"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_recepcion_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Title") ;
         Dvelop_confirmpanel_recepcion_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Confirmationtext") ;
         Dvelop_confirmpanel_recepcion_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Yesbuttoncaption") ;
         Dvelop_confirmpanel_recepcion_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Nobuttoncaption") ;
         Dvelop_confirmpanel_recepcion_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_recepcion_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Yesbuttonposition") ;
         Dvelop_confirmpanel_recepcion_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Confirmtype") ;
         Dvelop_confirmpanel_eliminarrecepcion_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Title") ;
         Dvelop_confirmpanel_eliminarrecepcion_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarrecepcion_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarrecepcion_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarrecepcion_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarrecepcion_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarrecepcion_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Confirmtype") ;
         Dvelop_confirmpanel_aprobacioninterna_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Title") ;
         Dvelop_confirmpanel_aprobacioninterna_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Confirmationtext") ;
         Dvelop_confirmpanel_aprobacioninterna_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_aprobacioninterna_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Nobuttoncaption") ;
         Dvelop_confirmpanel_aprobacioninterna_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_aprobacioninterna_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Yesbuttonposition") ;
         Dvelop_confirmpanel_aprobacioninterna_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvelop_confirmpanel_recepcion_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION_Result") ;
         Dvelop_confirmpanel_eliminarrecepcion_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION_Result") ;
         Dvelop_confirmpanel_aprobacioninterna_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA_Result") ;
         nRC_GXsfl_72 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_72"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_72_fel_idx = 0 ;
         while ( nGXsfl_72_fel_idx < nRC_GXsfl_72 )
         {
            nGXsfl_72_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_72_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_72_fel_idx+1) ;
            sGXsfl_72_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_722( ) ;
            AV77GXV1 = (int)(nGXsfl_72_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) && ( AV77GXV1 > 0 ) )
            {
               AV31RecepciondeEnsayoCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)) );
            }
         }
         if ( nGXsfl_72_fel_idx == 0 )
         {
            nGXsfl_72_idx = 1 ;
            sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_722( ) ;
         }
         nGXsfl_72_fel_idx = 1 ;
         /* Read variables values. */
         AV19FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19FilterFullText", AV19FilterFullText);
         AV39ActualizacionEnsayoTxp = ((GXutil.strcmp(httpContext.cgiGet( chkavActualizacionensayotxp.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39ActualizacionEnsayoTxp", AV39ActualizacionEnsayoTxp);
         AV40AprobacionColorLab = ((GXutil.strcmp(httpContext.cgiGet( chkavAprobacioncolorlab.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40AprobacionColorLab", AV40AprobacionColorLab);
         AV106Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106Pgmname", AV106Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_72_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_722( ) ;
         AV77GXV1 = (int)(nGXsfl_72_idx+GRID_nFirstRecordOnPage) ;
         if ( nGXsfl_72_idx > 0 )
         {
            AV77GXV1 = (int)(nGXsfl_72_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) && ( AV77GXV1 > 0 ) )
            {
               AV31RecepciondeEnsayoCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)) );
            }
            if ( ( AV77GXV1 > 0 ) && ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) )
            {
               AV31RecepciondeEnsayoCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)) );
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RecepciondeEnsayoCliente__WC");
         AV106Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106Pgmname", AV106Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV106Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\recepciondeensayocliente__wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e2428M2 ();
      if (returnInSub) return;
   }

   public void e2428M2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV33Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recepciondeensayocliente__wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33Station = GXt_char1 ;
      GXv_char2[0] = AV15Emprcod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV37UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV33Station, GXv_char2, GXv_char3, GXv_char4) ;
      recepciondeensayocliente__wc_impl.this.AV15Emprcod = GXv_char2[0] ;
      recepciondeensayocliente__wc_impl.this.AV16EmprNom = GXv_char3[0] ;
      recepciondeensayocliente__wc_impl.this.AV37UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Emprcod", AV15Emprcod);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV14DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV14DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 = AV31RecepciondeEnsayoCliente_SDT ;
      GXv_objcol_SdtRecepciondeEnsayoCliente_SDT_Item8[0] = GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 ;
      new app.gestionlaboratorio.recepcionensayocliente_dp(remoteHandle, context).execute( AV15Emprcod, AV61ClicodIN, AV62Lb_CartazIN, AV63Lb_ColNomIN, AV64Lb_numeroIN, AV66Lb_fechaRIN, AV65Lb_estadoIN, GXv_objcol_SdtRecepciondeEnsayoCliente_SDT_Item8) ;
      GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 = GXv_objcol_SdtRecepciondeEnsayoCliente_SDT_Item8[0] ;
      AV31RecepciondeEnsayoCliente_SDT = GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 ;
      gx_BV72 = true ;
      GXt_int9 = (byte)(AV29Moda21) ;
      GXv_int10[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV15Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int10) ;
      recepciondeensayocliente__wc_impl.this.GXt_int9 = GXv_int10[0] ;
      AV29Moda21 = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV29Moda21), "ZZZ9")));
      AV39ActualizacionEnsayoTxp = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39ActualizacionEnsayoTxp", AV39ActualizacionEnsayoTxp);
      AV40AprobacionColorLab = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40AprobacionColorLab", AV40AprobacionColorLab);
      AV41AprobacionInterna = "N" ;
   }

   public void e2528M2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV38WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV38WWPContext = GXv_SdtWWPContext11[0] ;
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
      if ( GXutil.strcmp(AV32Session.getValue("GestionLaboratorio.RecepciondeEnsayoCliente__WCColumnsSelector"), "") != 0 )
      {
         AV13ColumnsSelectorXML = AV32Session.getValue("GestionLaboratorio.RecepciondeEnsayoCliente__WCColumnsSelector") ;
         AV11ColumnsSelector.fromxml(AV13ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      chkavRecepciondeensayocliente_sdt__seleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavRecepciondeensayocliente_sdt__seleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavRecepciondeensayocliente_sdt__seleccionar.getVisible(), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_numero_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_numero_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_numero_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__clicod_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_artcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_artcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_artcod_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_colnomc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_colnomc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_colnomc_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_colnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_colnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_colnum_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_rb_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_rb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_rb_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_opcion_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_opcion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_opcion_Visible), 5, 0), !bGXsfl_72_Refreshing);
      cmbavRecepciondeensayocliente_sdt__lb_tiprec.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecepciondeensayocliente_sdt__lb_tiprec.getInternalname(), "Visible", GXutil.ltrimstr( cmbavRecepciondeensayocliente_sdt__lb_tiprec.getVisible(), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_numop_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_numop_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_numop_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_cartaz_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_cartaz_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_cartaz_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_fechae_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_fechae_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_fechae_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_fechaen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_fechaen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_fechaen_Visible), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_fechar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_fechar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_fechar_Visible), 5, 0), !bGXsfl_72_Refreshing);
      cmbavRecepciondeensayocliente_sdt__lb_estado.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecepciondeensayocliente_sdt__lb_estado.getInternalname(), "Visible", GXutil.ltrimstr( cmbavRecepciondeensayocliente_sdt__lb_estado.getVisible(), 5, 0), !bGXsfl_72_Refreshing);
      chkavRecepciondeensayocliente_sdt__eliminar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavRecepciondeensayocliente_sdt__eliminar.getInternalname(), "Visible", GXutil.ltrimstr( chkavRecepciondeensayocliente_sdt__eliminar.getVisible(), 5, 0), !bGXsfl_72_Refreshing);
      cmbavRecepciondeensayocliente_sdt__lb_provdef.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecepciondeensayocliente_sdt__lb_provdef.getInternalname(), "Visible", GXutil.ltrimstr( cmbavRecepciondeensayocliente_sdt__lb_provdef.getVisible(), 5, 0), !bGXsfl_72_Refreshing);
      edtavRecepciondeensayocliente_sdt__lb_obscr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRecepciondeensayocliente_sdt__lb_obscr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecepciondeensayocliente_sdt__lb_obscr_Visible), 5, 0), !bGXsfl_72_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV20GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20GridCurrentPage), 10, 0));
      AV21GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV11ColumnsSelector", AV11ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ManageFiltersData", AV26ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22GridState", AV22GridState);
   }

   public void e1428M2( )
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
         AV30PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV30PageToGo) ;
      }
   }

   public void e1528M2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e2628M2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV77GXV1 = 1 ;
      while ( AV77GXV1 <= AV31RecepciondeEnsayoCliente_SDT.size() )
      {
         AV31RecepciondeEnsayoCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(72) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_722( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_72_Refreshing )
         {
            httpContext.doAjaxLoad(72, GridRow);
         }
         AV77GXV1 = (int)(AV77GXV1+1) ;
      }
   }

   public void e1628M2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV13ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV11ColumnsSelector.fromJSonString(AV13ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.RecepciondeEnsayoCliente__WCColumnsSelector", ((GXutil.strcmp("", AV13ColumnsSelectorXML)==0) ? "" : AV11ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV11ColumnsSelector", AV11ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ManageFiltersData", AV26ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22GridState", AV22GridState);
   }

   public void e1328M2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.RecepciondeEnsayoCliente__WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV106Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV27ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.RecepciondeEnsayoCliente__WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV27ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV28ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "GestionLaboratorio.RecepciondeEnsayoCliente__WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         recepciondeensayocliente__wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV28ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV28ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV106Pgmname+"GridState", AV28ManageFiltersXml) ;
            AV22GridState.fromxml(AV28ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22GridState", AV22GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV11ColumnsSelector", AV11ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ManageFiltersData", AV26ManageFiltersData);
   }

   public void e1728M2( )
   {
      AV77GXV1 = (int)(nGXsfl_72_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV77GXV1 > 0 ) && ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) )
      {
         AV31RecepciondeEnsayoCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)) );
      }
      /* Dvelop_confirmpanel_recepcion_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_recepcion_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION RECEPCION' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV31RecepciondeEnsayoCliente_SDT", AV31RecepciondeEnsayoCliente_SDT);
      nGXsfl_72_bak_idx = nGXsfl_72_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV27ManageFiltersExecutionStep, AV11ColumnsSelector, AV106Pgmname, AV19FilterFullText, AV73EmprcodIN, AV61ClicodIN, AV62Lb_CartazIN, AV63Lb_ColNomIN, AV64Lb_numeroIN, AV66Lb_fechaRIN, AV65Lb_estadoIN, AV39ActualizacionEnsayoTxp, AV40AprobacionColorLab, AV29Moda21, sPrefix) ;
      nGXsfl_72_idx = nGXsfl_72_bak_idx ;
      sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_722( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV11ColumnsSelector", AV11ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ManageFiltersData", AV26ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22GridState", AV22GridState);
   }

   public void e1828M2( )
   {
      AV77GXV1 = (int)(nGXsfl_72_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV77GXV1 > 0 ) && ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) )
      {
         AV31RecepciondeEnsayoCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)) );
      }
      /* Dvelop_confirmpanel_eliminarrecepcion_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarrecepcion_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARRECEPCION' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV31RecepciondeEnsayoCliente_SDT", AV31RecepciondeEnsayoCliente_SDT);
      nGXsfl_72_bak_idx = nGXsfl_72_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV27ManageFiltersExecutionStep, AV11ColumnsSelector, AV106Pgmname, AV19FilterFullText, AV73EmprcodIN, AV61ClicodIN, AV62Lb_CartazIN, AV63Lb_ColNomIN, AV64Lb_numeroIN, AV66Lb_fechaRIN, AV65Lb_estadoIN, AV39ActualizacionEnsayoTxp, AV40AprobacionColorLab, AV29Moda21, sPrefix) ;
      nGXsfl_72_idx = nGXsfl_72_bak_idx ;
      sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_722( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV11ColumnsSelector", AV11ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ManageFiltersData", AV26ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22GridState", AV22GridState);
   }

   public void e2028M2( )
   {
      AV77GXV1 = (int)(nGXsfl_72_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV77GXV1 > 0 ) && ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) )
      {
         AV31RecepciondeEnsayoCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)) );
      }
      /* 'DoAprobacionInterna' Routine */
      returnInSub = false ;
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66Lb_fechaRIN)) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay Fecha Recepcion", ""));
      }
      else
      {
         AV44IN_Lb_numero = ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)(AV31RecepciondeEnsayoCliente_SDT.currentItem())).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44IN_Lb_numero), 8, 0));
         if ( (0==AV44IN_Lb_numero) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay Nº Ensayo", ""));
         }
         else
         {
            Dvelop_confirmpanel_aprobacioninterna_Confirmationtext = httpContext.getMessage( "Selecionou o ensaio nº = ", "")+GXutil.trim( GXutil.str( AV44IN_Lb_numero, 8, 0))+GXutil.newLine( ) ;
            ucDvelop_confirmpanel_aprobacioninterna.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_aprobacioninterna_Internalname, "ConfirmationText", Dvelop_confirmpanel_aprobacioninterna_Confirmationtext);
            Dvelop_confirmpanel_aprobacioninterna_Confirmationtext = Dvelop_confirmpanel_aprobacioninterna_Confirmationtext+httpContext.getMessage( "Deseja continuar?", "") ;
            ucDvelop_confirmpanel_aprobacioninterna.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_aprobacioninterna_Internalname, "ConfirmationText", Dvelop_confirmpanel_aprobacioninterna_Confirmationtext);
            this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_APROBACIONINTERNAContainer", "Confirm", "", new Object[] {});
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1928M2( )
   {
      AV77GXV1 = (int)(nGXsfl_72_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV77GXV1 > 0 ) && ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) )
      {
         AV31RecepciondeEnsayoCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)) );
      }
      /* Dvelop_confirmpanel_aprobacioninterna_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_aprobacioninterna_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION APROBACIONINTERNA' */
         S212 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      if ( gx_BV72 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV31RecepciondeEnsayoCliente_SDT", AV31RecepciondeEnsayoCliente_SDT);
         nGXsfl_72_bak_idx = nGXsfl_72_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV27ManageFiltersExecutionStep, AV11ColumnsSelector, AV106Pgmname, AV19FilterFullText, AV73EmprcodIN, AV61ClicodIN, AV62Lb_CartazIN, AV63Lb_ColNomIN, AV64Lb_numeroIN, AV66Lb_fechaRIN, AV65Lb_estadoIN, AV39ActualizacionEnsayoTxp, AV40AprobacionColorLab, AV29Moda21, sPrefix) ;
         nGXsfl_72_idx = nGXsfl_72_bak_idx ;
         sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_722( ) ;
      }
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV11ColumnsSelector", AV11ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ManageFiltersData", AV26ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV22GridState", AV22GridState);
   }

   public void e2128M2( )
   {
      /* 'DoCancelar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e2228M2( )
   {
      AV77GXV1 = (int)(nGXsfl_72_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV77GXV1 > 0 ) && ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) )
      {
         AV31RecepciondeEnsayoCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV71RecepciondeEnsayoCliente_SDT_json = AV31RecepciondeEnsayoCliente_SDT.toJSonString(false) ;
      AV70Websession.setValue(httpContext.getMessage( "&RecepciondeEnsayoCliente_SDT_json", ""), AV71RecepciondeEnsayoCliente_SDT_json);
      GXv_char4[0] = AV18ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.gestionlaboratorio.recepciondeensayocliente__wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      recepciondeensayocliente__wc_impl.this.AV18ExcelFilename = GXv_char4[0] ;
      recepciondeensayocliente__wc_impl.this.AV17ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV18ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV18ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
   }

   public void e2328M2( )
   {
      AV77GXV1 = (int)(nGXsfl_72_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV77GXV1 > 0 ) && ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) )
      {
         AV31RecepciondeEnsayoCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)) );
      }
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV71RecepciondeEnsayoCliente_SDT_json = AV31RecepciondeEnsayoCliente_SDT.toJSonString(false) ;
      AV70Websession.setValue(httpContext.getMessage( "&RecepciondeEnsayoCliente_SDT_json", ""), AV71RecepciondeEnsayoCliente_SDT_json);
      callWebObject(formatLink("app.gestionlaboratorio.recepciondeensayocliente__wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
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
      AV11ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__Seleccionar", "", "Op", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__Clicod", "", "Cliente", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__Lb_artcod", "", "Articulo", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__lb_colnomC", "", "Color Cliente", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__Lb_colnum", "", "Numero", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__Lb_rb", "", "Rb", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__Lb_opcion", "", "Opcion", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__Lb_TipRec", "", "Tipo de Receta", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__Lb_numop", "", "Nº Opcion", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__Lb_Cartaz", "", "Coleccion", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__Lb_fechaE", "", "Fecha Entrada", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__Lb_FechaEn", "", "Fecha Envio", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__Lb_fechaR", "", "Fecha Recepcion", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__Lb_estado", "", "Estado", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__Eliminar", "", "E", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__Lb_ProvDef", "", "P_D", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecepciondeEnsayoCliente_SDT__Lb_ObsCR", "", "Obs.", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char1 = AV36UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.RecepciondeEnsayoCliente__WCColumnsSelector", GXv_char4) ;
      recepciondeensayocliente__wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV36UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV36UserCustomValue)==0) ) )
      {
         AV12ColumnsSelectorAux.fromxml(AV36UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV12ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV11ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV12ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV11ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = AV26ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "GestionLaboratorio.RecepciondeEnsayoCliente__WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] ;
      AV26ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV19FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19FilterFullText", AV19FilterFullText);
   }

   public void S192( )
   {
      /* 'DO ACTION RECEPCION' Routine */
      returnInSub = false ;
      AV50Lb_HoraR = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      AV110GXV32 = 1 ;
      while ( AV110GXV32 <= AV31RecepciondeEnsayoCliente_SDT.size() )
      {
         AV43RecepciondeEnsayoCliente_SDT_item = (app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV110GXV32));
         if ( AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar() )
         {
            AV44IN_Lb_numero = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44IN_Lb_numero), 8, 0));
            AV60IN_Lb_opcion = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion() ;
            AV7Lb_ColNom = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom() ;
            AV51Lb_ColNum = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum() ;
            AV52TipColCod = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod() ;
            AV53Lb_TipRec = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec() ;
            AV54Lb_ProvDef = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef() ;
            AV5Clicod = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod() ;
            AV55CliNom = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom() ;
            AV56lb_artcod = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod() ;
            AV57Lb_numop = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop() ;
            new app.gestionlaboratorio.pens007(remoteHandle, context).execute( AV15Emprcod, AV44IN_Lb_numero, AV60IN_Lb_opcion, AV66Lb_fechaRIN, AV50Lb_HoraR, AV7Lb_ColNom, AV51Lb_ColNum, AV52TipColCod, AV53Lb_TipRec, (byte)(2), AV54Lb_ProvDef) ;
            GXv_char4[0] = AV15Emprcod ;
            GXv_int16[0] = AV44IN_Lb_numero ;
            new app.gestionlaboratorio.pdbgl03(remoteHandle, context).execute( GXv_char4, GXv_int16) ;
            recepciondeensayocliente__wc_impl.this.AV15Emprcod = GXv_char4[0] ;
            recepciondeensayocliente__wc_impl.this.AV44IN_Lb_numero = GXv_int16[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Emprcod", AV15Emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44IN_Lb_numero), 8, 0));
            if ( AV29Moda21 == 1 )
            {
               new app.gestionlaboratorio.pregcor7(remoteHandle, context).execute( AV15Emprcod, AV44IN_Lb_numero, AV60IN_Lb_opcion, AV66Lb_fechaRIN, AV5Clicod, AV54Lb_ProvDef) ;
            }
            AV58Num_color = GXutil.trim( GXutil.str( AV51Lb_ColNum, 6, 0)) + GXutil.trim( GXutil.str( AV57Lb_numop, 2, 0)) ;
            AV59N_color = (int)(GXutil.lval( GXutil.substring( AV58Num_color, 1, 6))) ;
         }
         AV110GXV32 = (int)(AV110GXV32+1) ;
      }
      if ( GXutil.strcmp(AV39ActualizacionEnsayoTxp, "S") == 0 )
      {
         AV111GXV33 = 1 ;
         while ( AV111GXV33 <= AV31RecepciondeEnsayoCliente_SDT.size() )
         {
            AV43RecepciondeEnsayoCliente_SDT_item = (app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV111GXV33));
            if ( AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar() )
            {
               httpContext.popup(formatLink("app.gestionlaboratorio.envioensayosacliente_texplus", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod(),6,0)),GXutil.URLEncode(GXutil.rtrim(AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom())),GXutil.URLEncode(GXutil.rtrim(AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod())),GXutil.URLEncode(GXutil.rtrim(AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom())),GXutil.URLEncode(GXutil.ltrimstr(AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum(),6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod(),2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu(),4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero(),8,0)),GXutil.URLEncode(GXutil.rtrim(AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion())),GXutil.URLEncode(GXutil.formatDateParm(AV66Lb_fechaRIN)),GXutil.URLEncode(DecimalUtil.decToString(AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee())),GXutil.URLEncode(GXutil.ltrimstr(AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb(),10,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Emprcod","Clicod","CliNom","lb_Artcod","lb_ColNom","lb_ColNum","TipColCod","F_cformu","lb_numero","Lb_opcion","Lb_fechaEn","Lb_CosteE","Lb_RGB","registrosprocedados"}) , new Object[] {"AV72registrosprocedados"});
               if ( GXutil.strcmp(AV40AprobacionColorLab, "S") == 0 )
               {
                  httpContext.popup(formatLink("app.gestionlaboratorio.aprobacioncolorhdr", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod(),6,0)),GXutil.URLEncode(GXutil.rtrim(AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom())),GXutil.URLEncode(GXutil.rtrim(AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod())),GXutil.URLEncode(GXutil.rtrim(AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom())),GXutil.URLEncode(GXutil.ltrimstr(AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum(),6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod(),2,0))}, new String[] {"EmprCod","CliCod","CliNom","ForSer","ForColNom","ForColNum","TipColCod"}) , new Object[] {"AV15Emprcod","","","","","",""});
               }
            }
            AV111GXV33 = (int)(AV111GXV33+1) ;
         }
      }
      GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 = AV31RecepciondeEnsayoCliente_SDT ;
      GXv_objcol_SdtRecepciondeEnsayoCliente_SDT_Item8[0] = GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 ;
      new app.gestionlaboratorio.recepcionensayocliente_dp(remoteHandle, context).execute( AV15Emprcod, AV61ClicodIN, AV62Lb_CartazIN, AV63Lb_ColNomIN, AV64Lb_numeroIN, AV66Lb_fechaRIN, AV65Lb_estadoIN, GXv_objcol_SdtRecepciondeEnsayoCliente_SDT_Item8) ;
      GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 = GXv_objcol_SdtRecepciondeEnsayoCliente_SDT_Item8[0] ;
      AV31RecepciondeEnsayoCliente_SDT = GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 ;
      gx_BV72 = true ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S202( )
   {
      /* 'DO ACTION ELIMINARRECEPCION' Routine */
      returnInSub = false ;
      AV112GXV34 = 1 ;
      while ( AV112GXV34 <= AV31RecepciondeEnsayoCliente_SDT.size() )
      {
         AV43RecepciondeEnsayoCliente_SDT_item = (app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV112GXV34));
         if ( AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Eliminar() )
         {
            AV44IN_Lb_numero = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44IN_Lb_numero), 8, 0));
            AV60IN_Lb_opcion = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion() ;
            AV67Fec_null = GXutil.nullDate() ;
            AV68Hora_null = GXutil.resetTime( GXutil.nullDate() );
            AV7Lb_ColNom = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom() ;
            AV51Lb_ColNum = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum() ;
            AV52TipColCod = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod() ;
            AV53Lb_TipRec = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec() ;
            AV54Lb_ProvDef = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef() ;
            AV5Clicod = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod() ;
            GXt_dtime17 = GXutil.resetDate(AV68Hora_null) ;
            new app.gestionlaboratorio.pens007(remoteHandle, context).execute( AV15Emprcod, AV44IN_Lb_numero, AV60IN_Lb_opcion, AV67Fec_null, GXt_dtime17, AV7Lb_ColNom, AV51Lb_ColNum, AV52TipColCod, AV53Lb_TipRec, (byte)(1), AV54Lb_ProvDef) ;
            GXv_char4[0] = AV15Emprcod ;
            GXv_int16[0] = AV44IN_Lb_numero ;
            new app.gestionlaboratorio.pdbgl03(remoteHandle, context).execute( GXv_char4, GXv_int16) ;
            recepciondeensayocliente__wc_impl.this.AV15Emprcod = GXv_char4[0] ;
            recepciondeensayocliente__wc_impl.this.AV44IN_Lb_numero = GXv_int16[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Emprcod", AV15Emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44IN_Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44IN_Lb_numero), 8, 0));
            if ( AV29Moda21 == 1 )
            {
               AV69Fecha_b = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Fecha_b", localUtil.format(AV69Fecha_b, "99/99/99"));
               new app.gestionlaboratorio.pregcor7(remoteHandle, context).execute( AV15Emprcod, AV44IN_Lb_numero, " ", AV69Fecha_b, AV5Clicod, AV54Lb_ProvDef) ;
            }
         }
         AV112GXV34 = (int)(AV112GXV34+1) ;
      }
      GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 = AV31RecepciondeEnsayoCliente_SDT ;
      GXv_objcol_SdtRecepciondeEnsayoCliente_SDT_Item8[0] = GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 ;
      new app.gestionlaboratorio.recepcionensayocliente_dp(remoteHandle, context).execute( AV15Emprcod, AV61ClicodIN, AV62Lb_CartazIN, AV63Lb_ColNomIN, AV64Lb_numeroIN, AV66Lb_fechaRIN, AV65Lb_estadoIN, GXv_objcol_SdtRecepciondeEnsayoCliente_SDT_Item8) ;
      GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 = GXv_objcol_SdtRecepciondeEnsayoCliente_SDT_Item8[0] ;
      AV31RecepciondeEnsayoCliente_SDT = GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 ;
      gx_BV72 = true ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S212( )
   {
      /* 'DO ACTION APROBACIONINTERNA' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.gestionlaboratorio.aprobacioninternaensayo_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV44IN_Lb_numero,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV66Lb_fechaRIN))}, new String[] {"EmprCod","Lb_Numero","Lb_fechaR"}) , new Object[] {});
      GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 = AV31RecepciondeEnsayoCliente_SDT ;
      GXv_objcol_SdtRecepciondeEnsayoCliente_SDT_Item8[0] = GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 ;
      new app.gestionlaboratorio.recepcionensayocliente_dp(remoteHandle, context).execute( AV15Emprcod, AV61ClicodIN, AV62Lb_CartazIN, AV63Lb_ColNomIN, AV64Lb_numeroIN, AV66Lb_fechaRIN, AV65Lb_estadoIN, GXv_objcol_SdtRecepciondeEnsayoCliente_SDT_Item8) ;
      GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 = GXv_objcol_SdtRecepciondeEnsayoCliente_SDT_Item8[0] ;
      AV31RecepciondeEnsayoCliente_SDT = GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 ;
      gx_BV72 = true ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV32Session.getValue(AV106Pgmname+"GridState"), "") == 0 )
      {
         AV22GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV106Pgmname+"GridState"), null, null);
      }
      else
      {
         AV22GridState.fromxml(AV32Session.getValue(AV106Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV22GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV22GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV22GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV113GXV35 = 1 ;
      while ( AV113GXV35 <= AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV113GXV35));
         if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV19FilterFullText = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19FilterFullText", AV19FilterFullText);
         }
         AV113GXV35 = (int)(AV113GXV35+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV22GridState.fromxml(AV32Session.getValue(AV106Pgmname+"GridState"), null, null);
      AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV19FilterFullText)==0), (short)(0), AV19FilterFullText, "") ;
      AV22GridState = GXv_SdtWWPGridState18[0] ;
      if ( ! (GXutil.strcmp("", AV73EmprcodIN)==0) )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV23GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCODIN" );
         AV23GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV73EmprcodIN );
         AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV23GridStateFilterValue, 0);
      }
      if ( ! (0==AV61ClicodIN) )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV23GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICODIN" );
         AV23GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV61ClicodIN, 6, 0) );
         AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV23GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV62Lb_CartazIN)==0) )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV23GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_CARTAZIN" );
         AV23GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV62Lb_CartazIN );
         AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV23GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV63Lb_ColNomIN)==0) )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV23GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_COLNOMIN" );
         AV23GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV63Lb_ColNomIN );
         AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV23GridStateFilterValue, 0);
      }
      if ( ! (0==AV64Lb_numeroIN) )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV23GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_NUMEROIN" );
         AV23GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV64Lb_numeroIN, 8, 0) );
         AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV23GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66Lb_fechaRIN)) )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV23GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHARIN" );
         AV23GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV66Lb_fechaRIN, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV23GridStateFilterValue, 0);
      }
      if ( ! (0==AV65Lb_estadoIN) )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV23GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_ESTADOIN" );
         AV23GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV65Lb_estadoIN, 1, 0) );
         AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV23GridStateFilterValue, 0);
      }
      AV22GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV22GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV106Pgmname+"GridState", AV22GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void e2728M2( )
   {
      AV77GXV1 = (int)(nGXsfl_72_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV77GXV1 > 0 ) && ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) )
      {
         AV31RecepciondeEnsayoCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)) );
      }
      /* Recepciondeensayocliente_sdt__seleccionar_Click Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'COLORIRLINEA' */
      S222 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void S182( )
   {
      /* 'NVECES' Routine */
      returnInSub = false ;
      AV42Num_v = (short)(0) ;
      AV114GXV36 = 1 ;
      while ( AV114GXV36 <= AV31RecepciondeEnsayoCliente_SDT.size() )
      {
         AV43RecepciondeEnsayoCliente_SDT_item = (app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV114GXV36));
         if ( AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar() )
         {
            AV46IN_Lb_numerot = AV43RecepciondeEnsayoCliente_SDT_item.getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero() ;
            if ( AV46IN_Lb_numerot == AV44IN_Lb_numero )
            {
               AV42Num_v = (short)(AV42Num_v+1) ;
            }
         }
         AV114GXV36 = (int)(AV114GXV36+1) ;
      }
   }

   public void S222( )
   {
      /* 'COLORIRLINEA' Routine */
      returnInSub = false ;
      AV74i = (short)(0) ;
      /* Start For Each Line in Grid */
      nRC_GXsfl_72 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_72"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_72_fel_idx = 0 ;
      while ( nGXsfl_72_fel_idx < nRC_GXsfl_72 )
      {
         nGXsfl_72_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_72_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_72_fel_idx+1) ;
         sGXsfl_72_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_722( ) ;
         AV77GXV1 = (int)(nGXsfl_72_fel_idx+GRID_nFirstRecordOnPage) ;
         if ( ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) && ( AV77GXV1 > 0 ) )
         {
            AV31RecepciondeEnsayoCliente_SDT.currentItem( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)) );
         }
         AV74i = (short)(AV74i+1) ;
         if ( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)(AV31RecepciondeEnsayoCliente_SDT.currentItem())).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar() )
         {
            this.executeUsercontrolMethod(sPrefix, false, "DATAMONJSContainer", "ChangeClass", "", new Object[] {GXutil.format( httpContext.getMessage( "#W0092GridContainerRow_%1 > td ", ""), localUtil.format( DecimalUtil.doubleToDec(AV74i), "9999"), "", "", "", "", "", "", "", ""),"WWColumn WWColumnWarning"});
            chkavRecepciondeensayocliente_sdt__seleccionar.setColumnClass( "WWColumn WWColumnWarning WWColumnWarningFirstColumn" );
            httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavRecepciondeensayocliente_sdt__seleccionar.getInternalname(), "Columnclass", chkavRecepciondeensayocliente_sdt__seleccionar.getColumnClass(), !bGXsfl_72_Refreshing);
         }
         else
         {
            this.executeUsercontrolMethod(sPrefix, false, "DATAMONJSContainer", "RemoveClass", "", new Object[] {GXutil.format( httpContext.getMessage( "#W0092GridContainerRow_%1 > td ", ""), localUtil.format( DecimalUtil.doubleToDec(AV74i), "9999"), "", "", "", "", "", "", "", "")});
         }
         /* End For Each Line */
      }
      if ( nGXsfl_72_fel_idx == 0 )
      {
         nGXsfl_72_idx = 1 ;
         sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_722( ) ;
      }
      nGXsfl_72_fel_idx = 1 ;
   }

   public void wb_table4_126_28M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_aprobacioninterna_Internalname, tblTabledvelop_confirmpanel_aprobacioninterna_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_aprobacioninterna.setProperty("Title", Dvelop_confirmpanel_aprobacioninterna_Title);
         ucDvelop_confirmpanel_aprobacioninterna.setProperty("ConfirmationText", Dvelop_confirmpanel_aprobacioninterna_Confirmationtext);
         ucDvelop_confirmpanel_aprobacioninterna.setProperty("YesButtonCaption", Dvelop_confirmpanel_aprobacioninterna_Yesbuttoncaption);
         ucDvelop_confirmpanel_aprobacioninterna.setProperty("NoButtonCaption", Dvelop_confirmpanel_aprobacioninterna_Nobuttoncaption);
         ucDvelop_confirmpanel_aprobacioninterna.setProperty("CancelButtonCaption", Dvelop_confirmpanel_aprobacioninterna_Cancelbuttoncaption);
         ucDvelop_confirmpanel_aprobacioninterna.setProperty("YesButtonPosition", Dvelop_confirmpanel_aprobacioninterna_Yesbuttonposition);
         ucDvelop_confirmpanel_aprobacioninterna.setProperty("ConfirmType", Dvelop_confirmpanel_aprobacioninterna_Confirmtype);
         ucDvelop_confirmpanel_aprobacioninterna.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_aprobacioninterna_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_126_28M2e( true) ;
      }
      else
      {
         wb_table4_126_28M2e( false) ;
      }
   }

   public void wb_table3_121_28M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarrecepcion_Internalname, tblTabledvelop_confirmpanel_eliminarrecepcion_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminarrecepcion.setProperty("Title", Dvelop_confirmpanel_eliminarrecepcion_Title);
         ucDvelop_confirmpanel_eliminarrecepcion.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarrecepcion_Confirmationtext);
         ucDvelop_confirmpanel_eliminarrecepcion.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarrecepcion_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminarrecepcion.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarrecepcion_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminarrecepcion.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarrecepcion_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminarrecepcion.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarrecepcion_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminarrecepcion.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarrecepcion_Confirmtype);
         ucDvelop_confirmpanel_eliminarrecepcion.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarrecepcion_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCIONContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_121_28M2e( true) ;
      }
      else
      {
         wb_table3_121_28M2e( false) ;
      }
   }

   public void wb_table2_116_28M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_recepcion_Internalname, tblTabledvelop_confirmpanel_recepcion_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_recepcion.setProperty("Title", Dvelop_confirmpanel_recepcion_Title);
         ucDvelop_confirmpanel_recepcion.setProperty("ConfirmationText", Dvelop_confirmpanel_recepcion_Confirmationtext);
         ucDvelop_confirmpanel_recepcion.setProperty("YesButtonCaption", Dvelop_confirmpanel_recepcion_Yesbuttoncaption);
         ucDvelop_confirmpanel_recepcion.setProperty("NoButtonCaption", Dvelop_confirmpanel_recepcion_Nobuttoncaption);
         ucDvelop_confirmpanel_recepcion.setProperty("CancelButtonCaption", Dvelop_confirmpanel_recepcion_Cancelbuttoncaption);
         ucDvelop_confirmpanel_recepcion.setProperty("YesButtonPosition", Dvelop_confirmpanel_recepcion_Yesbuttonposition);
         ucDvelop_confirmpanel_recepcion.setProperty("ConfirmType", Dvelop_confirmpanel_recepcion_Confirmtype);
         ucDvelop_confirmpanel_recepcion.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_recepcion_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_RECEPCIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_RECEPCIONContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_116_28M2e( true) ;
      }
      else
      {
         wb_table2_116_28M2e( false) ;
      }
   }

   public void wb_table1_23_28M2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV26ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_28_28M2( true) ;
      }
      else
      {
         wb_table5_28_28M2( false) ;
      }
      return  ;
   }

   public void wb_table5_28_28M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_28M2e( true) ;
      }
      else
      {
         wb_table1_23_28M2e( false) ;
      }
   }

   public void wb_table5_28_28M2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_72_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV19FilterFullText, GXutil.rtrim( localUtil.format( AV19FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_GestionLaboratorio\\RecepciondeEnsayoCliente__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_28_28M2e( true) ;
      }
      else
      {
         wb_table5_28_28M2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV73EmprcodIN = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73EmprcodIN", AV73EmprcodIN);
      AV61ClicodIN = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61ClicodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61ClicodIN), 6, 0));
      AV62Lb_CartazIN = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Lb_CartazIN", AV62Lb_CartazIN);
      AV63Lb_ColNomIN = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Lb_ColNomIN", AV63Lb_ColNomIN);
      AV64Lb_numeroIN = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Lb_numeroIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64Lb_numeroIN), 8, 0));
      AV66Lb_fechaRIN = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Lb_fechaRIN", localUtil.format(AV66Lb_fechaRIN, "99/99/99"));
      AV65Lb_estadoIN = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Lb_estadoIN", GXutil.str( AV65Lb_estadoIN, 1, 0));
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
      pa28M2( ) ;
      ws28M2( ) ;
      we28M2( ) ;
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
      sCtrlAV61ClicodIN = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV62Lb_CartazIN = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV63Lb_ColNomIN = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV64Lb_numeroIN = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV66Lb_fechaRIN = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV65Lb_estadoIN = (String)getParm(obj,6,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa28M2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gestionlaboratorio\\recepciondeensayocliente__wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa28M2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV73EmprcodIN = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73EmprcodIN", AV73EmprcodIN);
         AV61ClicodIN = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61ClicodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61ClicodIN), 6, 0));
         AV62Lb_CartazIN = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Lb_CartazIN", AV62Lb_CartazIN);
         AV63Lb_ColNomIN = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Lb_ColNomIN", AV63Lb_ColNomIN);
         AV64Lb_numeroIN = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Lb_numeroIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64Lb_numeroIN), 8, 0));
         AV66Lb_fechaRIN = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Lb_fechaRIN", localUtil.format(AV66Lb_fechaRIN, "99/99/99"));
         AV65Lb_estadoIN = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Lb_estadoIN", GXutil.str( AV65Lb_estadoIN, 1, 0));
      }
      wcpOAV73EmprcodIN = httpContext.cgiGet( sPrefix+"wcpOAV73EmprcodIN") ;
      wcpOAV61ClicodIN = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV61ClicodIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV62Lb_CartazIN = httpContext.cgiGet( sPrefix+"wcpOAV62Lb_CartazIN") ;
      wcpOAV63Lb_ColNomIN = httpContext.cgiGet( sPrefix+"wcpOAV63Lb_ColNomIN") ;
      wcpOAV64Lb_numeroIN = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV64Lb_numeroIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV66Lb_fechaRIN = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV66Lb_fechaRIN"), 0) ;
      wcpOAV65Lb_estadoIN = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV65Lb_estadoIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV73EmprcodIN, wcpOAV73EmprcodIN) != 0 ) || ( AV61ClicodIN != wcpOAV61ClicodIN ) || ( GXutil.strcmp(AV62Lb_CartazIN, wcpOAV62Lb_CartazIN) != 0 ) || ( GXutil.strcmp(AV63Lb_ColNomIN, wcpOAV63Lb_ColNomIN) != 0 ) || ( AV64Lb_numeroIN != wcpOAV64Lb_numeroIN ) || !( GXutil.dateCompare(GXutil.resetTime(AV66Lb_fechaRIN), GXutil.resetTime(wcpOAV66Lb_fechaRIN)) ) || ( AV65Lb_estadoIN != wcpOAV65Lb_estadoIN ) ) )
      {
         setjustcreated();
      }
      wcpOAV73EmprcodIN = AV73EmprcodIN ;
      wcpOAV61ClicodIN = AV61ClicodIN ;
      wcpOAV62Lb_CartazIN = AV62Lb_CartazIN ;
      wcpOAV63Lb_ColNomIN = AV63Lb_ColNomIN ;
      wcpOAV64Lb_numeroIN = AV64Lb_numeroIN ;
      wcpOAV66Lb_fechaRIN = AV66Lb_fechaRIN ;
      wcpOAV65Lb_estadoIN = AV65Lb_estadoIN ;
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
      sCtrlAV61ClicodIN = httpContext.cgiGet( sPrefix+"AV61ClicodIN_CTRL") ;
      if ( GXutil.len( sCtrlAV61ClicodIN) > 0 )
      {
         AV61ClicodIN = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV61ClicodIN), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61ClicodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61ClicodIN), 6, 0));
      }
      else
      {
         AV61ClicodIN = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV61ClicodIN_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV62Lb_CartazIN = httpContext.cgiGet( sPrefix+"AV62Lb_CartazIN_CTRL") ;
      if ( GXutil.len( sCtrlAV62Lb_CartazIN) > 0 )
      {
         AV62Lb_CartazIN = httpContext.cgiGet( sCtrlAV62Lb_CartazIN) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62Lb_CartazIN", AV62Lb_CartazIN);
      }
      else
      {
         AV62Lb_CartazIN = httpContext.cgiGet( sPrefix+"AV62Lb_CartazIN_PARM") ;
      }
      sCtrlAV63Lb_ColNomIN = httpContext.cgiGet( sPrefix+"AV63Lb_ColNomIN_CTRL") ;
      if ( GXutil.len( sCtrlAV63Lb_ColNomIN) > 0 )
      {
         AV63Lb_ColNomIN = httpContext.cgiGet( sCtrlAV63Lb_ColNomIN) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Lb_ColNomIN", AV63Lb_ColNomIN);
      }
      else
      {
         AV63Lb_ColNomIN = httpContext.cgiGet( sPrefix+"AV63Lb_ColNomIN_PARM") ;
      }
      sCtrlAV64Lb_numeroIN = httpContext.cgiGet( sPrefix+"AV64Lb_numeroIN_CTRL") ;
      if ( GXutil.len( sCtrlAV64Lb_numeroIN) > 0 )
      {
         AV64Lb_numeroIN = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV64Lb_numeroIN), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64Lb_numeroIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64Lb_numeroIN), 8, 0));
      }
      else
      {
         AV64Lb_numeroIN = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV64Lb_numeroIN_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV66Lb_fechaRIN = httpContext.cgiGet( sPrefix+"AV66Lb_fechaRIN_CTRL") ;
      if ( GXutil.len( sCtrlAV66Lb_fechaRIN) > 0 )
      {
         AV66Lb_fechaRIN = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV66Lb_fechaRIN), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66Lb_fechaRIN", localUtil.format(AV66Lb_fechaRIN, "99/99/99"));
      }
      else
      {
         AV66Lb_fechaRIN = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV66Lb_fechaRIN_PARM"), 0) ;
      }
      sCtrlAV65Lb_estadoIN = httpContext.cgiGet( sPrefix+"AV65Lb_estadoIN_CTRL") ;
      if ( GXutil.len( sCtrlAV65Lb_estadoIN) > 0 )
      {
         AV65Lb_estadoIN = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV65Lb_estadoIN), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Lb_estadoIN", GXutil.str( AV65Lb_estadoIN, 1, 0));
      }
      else
      {
         AV65Lb_estadoIN = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV65Lb_estadoIN_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa28M2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws28M2( ) ;
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
      ws28M2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61ClicodIN_PARM", GXutil.ltrim( localUtil.ntoc( AV61ClicodIN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV61ClicodIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61ClicodIN_CTRL", GXutil.rtrim( sCtrlAV61ClicodIN));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62Lb_CartazIN_PARM", GXutil.rtrim( AV62Lb_CartazIN));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV62Lb_CartazIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62Lb_CartazIN_CTRL", GXutil.rtrim( sCtrlAV62Lb_CartazIN));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63Lb_ColNomIN_PARM", GXutil.rtrim( AV63Lb_ColNomIN));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63Lb_ColNomIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63Lb_ColNomIN_CTRL", GXutil.rtrim( sCtrlAV63Lb_ColNomIN));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64Lb_numeroIN_PARM", GXutil.ltrim( localUtil.ntoc( AV64Lb_numeroIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64Lb_numeroIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64Lb_numeroIN_CTRL", GXutil.rtrim( sCtrlAV64Lb_numeroIN));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Lb_fechaRIN_PARM", localUtil.dtoc( AV66Lb_fechaRIN, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV66Lb_fechaRIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV66Lb_fechaRIN_CTRL", GXutil.rtrim( sCtrlAV66Lb_fechaRIN));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65Lb_estadoIN_PARM", GXutil.ltrim( localUtil.ntoc( AV65Lb_estadoIN, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV65Lb_estadoIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV65Lb_estadoIN_CTRL", GXutil.rtrim( sCtrlAV65Lb_estadoIN));
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
      we28M2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115551990", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/recepciondeensayocliente__wc.js", "?202682115551990", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_722( )
   {
      chkavRecepciondeensayocliente_sdt__seleccionar.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__SELECCIONAR_"+sGXsfl_72_idx );
      edtavRecepciondeensayocliente_sdt__lb_numero_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMERO_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__clicod_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__CLICOD_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__lb_artcod_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_ARTCOD_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__lb_colnomc_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNOMC_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__lb_colnum_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNUM_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__lb_rb_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_RB_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__lb_opcion_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_OPCION_"+sGXsfl_72_idx ;
      cmbavRecepciondeensayocliente_sdt__lb_tiprec.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_TIPREC_"+sGXsfl_72_idx );
      edtavRecepciondeensayocliente_sdt__lb_numop_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMOP_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__lb_cartaz_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_CARTAZ_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__lb_fechae_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAE_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__lb_fechaen_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAEN_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__lb_fechar_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAR_"+sGXsfl_72_idx ;
      cmbavRecepciondeensayocliente_sdt__lb_estado.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_ESTADO_"+sGXsfl_72_idx );
      chkavRecepciondeensayocliente_sdt__eliminar.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__ELIMINAR_"+sGXsfl_72_idx );
      cmbavRecepciondeensayocliente_sdt__lb_provdef.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_PROVDEF_"+sGXsfl_72_idx );
      edtavRecepciondeensayocliente_sdt__lb_obscr_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_OBSCR_"+sGXsfl_72_idx ;
      cmbavRecepciondeensayocliente_sdt__lb_opst.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_OPST_"+sGXsfl_72_idx );
      edtavRecepciondeensayocliente_sdt__lb_opfc_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_OPFC_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__clinom_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__CLINOM_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__f_cformu_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__F_CFORMU_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__fornumcol_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__FORNUMCOL_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__lb_costee_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_COSTEE_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__tipcolcod_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__TIPCOLCOD_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__lb_colnom_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNOM_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__forultuti_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__FORULTUTI_"+sGXsfl_72_idx ;
      edtavRecepciondeensayocliente_sdt__lb_rgb_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_RGB_"+sGXsfl_72_idx ;
   }

   public void subsflControlProps_fel_722( )
   {
      chkavRecepciondeensayocliente_sdt__seleccionar.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__SELECCIONAR_"+sGXsfl_72_fel_idx );
      edtavRecepciondeensayocliente_sdt__lb_numero_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMERO_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__clicod_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__CLICOD_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__lb_artcod_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_ARTCOD_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__lb_colnomc_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNOMC_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__lb_colnum_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNUM_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__lb_rb_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_RB_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__lb_opcion_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_OPCION_"+sGXsfl_72_fel_idx ;
      cmbavRecepciondeensayocliente_sdt__lb_tiprec.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_TIPREC_"+sGXsfl_72_fel_idx );
      edtavRecepciondeensayocliente_sdt__lb_numop_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMOP_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__lb_cartaz_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_CARTAZ_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__lb_fechae_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAE_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__lb_fechaen_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAEN_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__lb_fechar_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAR_"+sGXsfl_72_fel_idx ;
      cmbavRecepciondeensayocliente_sdt__lb_estado.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_ESTADO_"+sGXsfl_72_fel_idx );
      chkavRecepciondeensayocliente_sdt__eliminar.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__ELIMINAR_"+sGXsfl_72_fel_idx );
      cmbavRecepciondeensayocliente_sdt__lb_provdef.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_PROVDEF_"+sGXsfl_72_fel_idx );
      edtavRecepciondeensayocliente_sdt__lb_obscr_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_OBSCR_"+sGXsfl_72_fel_idx ;
      cmbavRecepciondeensayocliente_sdt__lb_opst.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_OPST_"+sGXsfl_72_fel_idx );
      edtavRecepciondeensayocliente_sdt__lb_opfc_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_OPFC_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__clinom_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__CLINOM_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__f_cformu_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__F_CFORMU_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__fornumcol_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__FORNUMCOL_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__lb_costee_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_COSTEE_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__tipcolcod_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__TIPCOLCOD_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__lb_colnom_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNOM_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__forultuti_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__FORULTUTI_"+sGXsfl_72_fel_idx ;
      edtavRecepciondeensayocliente_sdt__lb_rgb_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_RGB_"+sGXsfl_72_fel_idx ;
   }

   public void sendrow_722( )
   {
      subsflControlProps_722( ) ;
      wb28M0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_72_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_72_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_72_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavRecepciondeensayocliente_sdt__seleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavRecepciondeensayocliente_sdt__seleccionar.getEnabled()!=0)&&(chkavRecepciondeensayocliente_sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 73,'"+sPrefix+"',false,'"+sGXsfl_72_idx+"',72)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "RECEPCIONDEENSAYOCLIENTE_SDT__SELECCIONAR_" + sGXsfl_72_idx ;
         chkavRecepciondeensayocliente_sdt__seleccionar.setName( GXCCtl );
         chkavRecepciondeensayocliente_sdt__seleccionar.setWebtags( "" );
         chkavRecepciondeensayocliente_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavRecepciondeensayocliente_sdt__seleccionar.getInternalname(), "TitleCaption", chkavRecepciondeensayocliente_sdt__seleccionar.getCaption(), !bGXsfl_72_Refreshing);
         chkavRecepciondeensayocliente_sdt__seleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavRecepciondeensayocliente_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Seleccionar()),"","",Integer.valueOf(chkavRecepciondeensayocliente_sdt__seleccionar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,chkavRecepciondeensayocliente_sdt__seleccionar.getColumnClass(),"",TempTags+((chkavRecepciondeensayocliente_sdt__seleccionar.getEnabled()!=0)&&(chkavRecepciondeensayocliente_sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,73);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_numero_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__lb_numero_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecepciondeensayocliente_sdt__lb_numero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numero()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__lb_numero_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_numero_Visible),Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_numero_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecepciondeensayocliente_sdt__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecepciondeensayocliente_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecepciondeensayocliente_sdt__clicod_Visible),Integer.valueOf(edtavRecepciondeensayocliente_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_artcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__lb_artcod_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_artcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__lb_artcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_artcod_Visible),Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_artcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_colnomc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__lb_colnomc_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnomc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__lb_colnomc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_colnomc_Visible),Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_colnomc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_colnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__lb_colnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecepciondeensayocliente_sdt__lb_colnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__lb_colnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_colnum_Visible),Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_colnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_rb_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__lb_rb_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb(), (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecepciondeensayocliente_sdt__lb_rb_Enabled!=0) ? localUtil.format( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb(), "ZZZ9.99") : localUtil.format( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rb(), "ZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__lb_rb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_rb_Visible),Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_rb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_opcion_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__lb_opcion_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion()),GXutil.rtrim( localUtil.format( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opcion(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__lb_opcion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_opcion_Visible),Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_opcion_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbavRecepciondeensayocliente_sdt__lb_tiprec.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         TempTags = " " + ((cmbavRecepciondeensayocliente_sdt__lb_tiprec.getEnabled()!=0)&&(cmbavRecepciondeensayocliente_sdt__lb_tiprec.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 81,'"+sPrefix+"',false,'"+sGXsfl_72_idx+"',72)\"" : " ") ;
         if ( ( cmbavRecepciondeensayocliente_sdt__lb_tiprec.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "RECEPCIONDEENSAYOCLIENTE_SDT__LB_TIPREC_" + sGXsfl_72_idx ;
            cmbavRecepciondeensayocliente_sdt__lb_tiprec.setName( GXCCtl );
            cmbavRecepciondeensayocliente_sdt__lb_tiprec.setWebtags( "" );
            cmbavRecepciondeensayocliente_sdt__lb_tiprec.addItem("1", httpContext.getMessage( "Receta", ""), (short)(0));
            cmbavRecepciondeensayocliente_sdt__lb_tiprec.addItem("2", httpContext.getMessage( "Añadida", ""), (short)(0));
            cmbavRecepciondeensayocliente_sdt__lb_tiprec.addItem("3", httpContext.getMessage( "Conf.", ""), (short)(0));
            if ( cmbavRecepciondeensayocliente_sdt__lb_tiprec.getItemCount() > 0 )
            {
               if ( ( AV77GXV1 > 0 ) && ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) && (0==((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec()) )
               {
                  ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec( (byte)(GXutil.lval( cmbavRecepciondeensayocliente_sdt__lb_tiprec.getValidValue(GXutil.trim( GXutil.str( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec(), 1, 0))))) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavRecepciondeensayocliente_sdt__lb_tiprec,cmbavRecepciondeensayocliente_sdt__lb_tiprec.getInternalname(),GXutil.trim( GXutil.str( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec(), 1, 0)),Integer.valueOf(1),cmbavRecepciondeensayocliente_sdt__lb_tiprec.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbavRecepciondeensayocliente_sdt__lb_tiprec.getVisible()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavRecepciondeensayocliente_sdt__lb_tiprec.getEnabled()!=0)&&(cmbavRecepciondeensayocliente_sdt__lb_tiprec.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,81);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavRecepciondeensayocliente_sdt__lb_tiprec.setValue( GXutil.trim( GXutil.str( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec(), 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecepciondeensayocliente_sdt__lb_tiprec.getInternalname(), "Values", cmbavRecepciondeensayocliente_sdt__lb_tiprec.ToJavascriptSource(), !bGXsfl_72_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_numop_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__lb_numop_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecepciondeensayocliente_sdt__lb_numop_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_numop()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__lb_numop_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_numop_Visible),Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_numop_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_cartaz_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__lb_cartaz_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_cartaz()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__lb_cartaz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_cartaz_Visible),Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_cartaz_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_fechae_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__lb_fechae_Internalname,localUtil.format(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae(), "99/99/99"),localUtil.format( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechae(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__lb_fechae_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_fechae_Visible),Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_fechae_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_fechaen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__lb_fechaen_Internalname,localUtil.format(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen(), "99/99/99"),localUtil.format( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechaen(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__lb_fechaen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_fechaen_Visible),Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_fechaen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_fechar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__lb_fechar_Internalname,localUtil.format(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar(), "99/99/99"),localUtil.format( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_fechar(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__lb_fechar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_fechar_Visible),Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_fechar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbavRecepciondeensayocliente_sdt__lb_estado.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbavRecepciondeensayocliente_sdt__lb_estado.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "RECEPCIONDEENSAYOCLIENTE_SDT__LB_ESTADO_" + sGXsfl_72_idx ;
            cmbavRecepciondeensayocliente_sdt__lb_estado.setName( GXCCtl );
            cmbavRecepciondeensayocliente_sdt__lb_estado.setWebtags( "" );
            cmbavRecepciondeensayocliente_sdt__lb_estado.addItem("1", httpContext.getMessage( "Enviado", ""), (short)(0));
            cmbavRecepciondeensayocliente_sdt__lb_estado.addItem("2", httpContext.getMessage( "Recepcionado", ""), (short)(0));
            if ( cmbavRecepciondeensayocliente_sdt__lb_estado.getItemCount() > 0 )
            {
               if ( ( AV77GXV1 > 0 ) && ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) && (0==((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado()) )
               {
                  ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado( (byte)(GXutil.lval( cmbavRecepciondeensayocliente_sdt__lb_estado.getValidValue(GXutil.trim( GXutil.str( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado(), 1, 0))))) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavRecepciondeensayocliente_sdt__lb_estado,cmbavRecepciondeensayocliente_sdt__lb_estado.getInternalname(),GXutil.trim( GXutil.str( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado(), 1, 0)),Integer.valueOf(1),cmbavRecepciondeensayocliente_sdt__lb_estado.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbavRecepciondeensayocliente_sdt__lb_estado.getVisible()),Integer.valueOf(cmbavRecepciondeensayocliente_sdt__lb_estado.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavRecepciondeensayocliente_sdt__lb_estado.setValue( GXutil.trim( GXutil.str( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado(), 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecepciondeensayocliente_sdt__lb_estado.getInternalname(), "Values", cmbavRecepciondeensayocliente_sdt__lb_estado.ToJavascriptSource(), !bGXsfl_72_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavRecepciondeensayocliente_sdt__eliminar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavRecepciondeensayocliente_sdt__eliminar.getEnabled()!=0)&&(chkavRecepciondeensayocliente_sdt__eliminar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 88,'"+sPrefix+"',false,'"+sGXsfl_72_idx+"',72)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "RECEPCIONDEENSAYOCLIENTE_SDT__ELIMINAR_" + sGXsfl_72_idx ;
         chkavRecepciondeensayocliente_sdt__eliminar.setName( GXCCtl );
         chkavRecepciondeensayocliente_sdt__eliminar.setWebtags( "" );
         chkavRecepciondeensayocliente_sdt__eliminar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavRecepciondeensayocliente_sdt__eliminar.getInternalname(), "TitleCaption", chkavRecepciondeensayocliente_sdt__eliminar.getCaption(), !bGXsfl_72_Refreshing);
         chkavRecepciondeensayocliente_sdt__eliminar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavRecepciondeensayocliente_sdt__eliminar.getInternalname(),GXutil.booltostr( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Eliminar()),"","",Integer.valueOf(chkavRecepciondeensayocliente_sdt__eliminar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(88, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavRecepciondeensayocliente_sdt__eliminar.getEnabled()!=0)&&(chkavRecepciondeensayocliente_sdt__eliminar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,88);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbavRecepciondeensayocliente_sdt__lb_provdef.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         TempTags = " " + ((cmbavRecepciondeensayocliente_sdt__lb_provdef.getEnabled()!=0)&&(cmbavRecepciondeensayocliente_sdt__lb_provdef.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 89,'"+sPrefix+"',false,'"+sGXsfl_72_idx+"',72)\"" : " ") ;
         if ( ( cmbavRecepciondeensayocliente_sdt__lb_provdef.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "RECEPCIONDEENSAYOCLIENTE_SDT__LB_PROVDEF_" + sGXsfl_72_idx ;
            cmbavRecepciondeensayocliente_sdt__lb_provdef.setName( GXCCtl );
            cmbavRecepciondeensayocliente_sdt__lb_provdef.setWebtags( "" );
            cmbavRecepciondeensayocliente_sdt__lb_provdef.addItem("D", httpContext.getMessage( "D", ""), (short)(0));
            cmbavRecepciondeensayocliente_sdt__lb_provdef.addItem("P", httpContext.getMessage( "P", ""), (short)(0));
            if ( cmbavRecepciondeensayocliente_sdt__lb_provdef.getItemCount() > 0 )
            {
               if ( ( AV77GXV1 > 0 ) && ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) && (GXutil.strcmp("", ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef())==0) )
               {
                  ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef( cmbavRecepciondeensayocliente_sdt__lb_provdef.getValidValue(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef()) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavRecepciondeensayocliente_sdt__lb_provdef,cmbavRecepciondeensayocliente_sdt__lb_provdef.getInternalname(),GXutil.rtrim( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef()),Integer.valueOf(1),cmbavRecepciondeensayocliente_sdt__lb_provdef.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbavRecepciondeensayocliente_sdt__lb_provdef.getVisible()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavRecepciondeensayocliente_sdt__lb_provdef.getEnabled()!=0)&&(cmbavRecepciondeensayocliente_sdt__lb_provdef.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,89);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavRecepciondeensayocliente_sdt__lb_provdef.setValue( GXutil.rtrim( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef()) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecepciondeensayocliente_sdt__lb_provdef.getInternalname(), "Values", cmbavRecepciondeensayocliente_sdt__lb_provdef.ToJavascriptSource(), !bGXsfl_72_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_obscr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__lb_obscr_Internalname,((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_obscr(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__lb_obscr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_obscr_Visible),Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_obscr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(300),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbavRecepciondeensayocliente_sdt__lb_opst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "RECEPCIONDEENSAYOCLIENTE_SDT__LB_OPST_" + sGXsfl_72_idx ;
            cmbavRecepciondeensayocliente_sdt__lb_opst.setName( GXCCtl );
            cmbavRecepciondeensayocliente_sdt__lb_opst.setWebtags( "" );
            cmbavRecepciondeensayocliente_sdt__lb_opst.addItem("*", httpContext.getMessage( "Aprovado o Reprovado", ""), (short)(0));
            cmbavRecepciondeensayocliente_sdt__lb_opst.addItem("A", httpContext.getMessage( "Aprovado", ""), (short)(0));
            cmbavRecepciondeensayocliente_sdt__lb_opst.addItem("R", httpContext.getMessage( "Reprovado", ""), (short)(0));
            if ( cmbavRecepciondeensayocliente_sdt__lb_opst.getItemCount() > 0 )
            {
               if ( ( AV77GXV1 > 0 ) && ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) && (GXutil.strcmp("", ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst())==0) )
               {
                  ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).setgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst( cmbavRecepciondeensayocliente_sdt__lb_opst.getValidValue(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst()) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavRecepciondeensayocliente_sdt__lb_opst,cmbavRecepciondeensayocliente_sdt__lb_opst.getInternalname(),GXutil.rtrim( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst()),Integer.valueOf(1),cmbavRecepciondeensayocliente_sdt__lb_opst.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(0),Integer.valueOf(cmbavRecepciondeensayocliente_sdt__lb_opst.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavRecepciondeensayocliente_sdt__lb_opst.setValue( GXutil.rtrim( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst()) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavRecepciondeensayocliente_sdt__lb_opst.getInternalname(), "Values", cmbavRecepciondeensayocliente_sdt__lb_opst.ToJavascriptSource(), !bGXsfl_72_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__lb_opfc_Internalname,localUtil.format(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc(), "99/99/99"),localUtil.format( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opfc(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__lb_opfc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_opfc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__clinom_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavRecepciondeensayocliente_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__f_cformu_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecepciondeensayocliente_sdt__f_cformu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_F_cformu()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__f_cformu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavRecepciondeensayocliente_sdt__f_cformu_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__fornumcol_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Fornumcol(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecepciondeensayocliente_sdt__fornumcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Fornumcol()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Fornumcol()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__fornumcol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavRecepciondeensayocliente_sdt__fornumcol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__lb_costee_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee(), (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecepciondeensayocliente_sdt__lb_costee_Enabled!=0) ? localUtil.format( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee(), "ZZZZ9.99999") : localUtil.format( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_costee(), "ZZZZ9.99999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__lb_costee_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_costee_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__tipcolcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecepciondeensayocliente_sdt__tipcolcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Tipcolcod()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__tipcolcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavRecepciondeensayocliente_sdt__tipcolcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__lb_colnom_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_colnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__lb_colnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_colnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__forultuti_Internalname,localUtil.format(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti(), "99/99/99"),localUtil.format( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Forultuti(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__forultuti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavRecepciondeensayocliente_sdt__forultuti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecepciondeensayocliente_sdt__lb_rgb_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb(), (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecepciondeensayocliente_sdt__lb_rgb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb()), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_rgb()), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecepciondeensayocliente_sdt__lb_rgb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavRecepciondeensayocliente_sdt__lb_rgb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes28M2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_72_idx = ((subGrid_Islastpage==1)&&(nGXsfl_72_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_72_idx+1) ;
         sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_722( ) ;
      }
      /* End function sendrow_722 */
   }

   public void startgridcontrol72( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"72\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavRecepciondeensayocliente_sdt__seleccionar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_numero_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº de Ensayo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecepciondeensayocliente_sdt__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_artcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_colnomc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_colnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_rb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_opcion_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Opcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavRecepciondeensayocliente_sdt__lb_tiprec.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo de Receta", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_numop_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Opcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_cartaz_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_fechae_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_fechaen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_fechar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavRecepciondeensayocliente_sdt__lb_estado.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavRecepciondeensayocliente_sdt__eliminar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavRecepciondeensayocliente_sdt__lb_provdef.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P_D", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecepciondeensayocliente_sdt__lb_obscr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Obs.", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkavRecepciondeensayocliente_sdt__seleccionar.getColumnClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavRecepciondeensayocliente_sdt__seleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_numero_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_numero_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_artcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_artcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_colnomc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_colnomc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_colnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_colnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_rb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_rb_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_opcion_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_opcion_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavRecepciondeensayocliente_sdt__lb_tiprec.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_numop_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_numop_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_cartaz_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_cartaz_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_fechae_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_fechae_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_fechaen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_fechaen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_fechar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_fechar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavRecepciondeensayocliente_sdt__lb_estado.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavRecepciondeensayocliente_sdt__lb_estado.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavRecepciondeensayocliente_sdt__eliminar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavRecepciondeensayocliente_sdt__lb_provdef.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_obscr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_obscr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavRecepciondeensayocliente_sdt__lb_opst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_opfc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__f_cformu_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__fornumcol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_costee_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__tipcolcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_colnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__forultuti_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecepciondeensayocliente_sdt__lb_rgb_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnrecepcion_Internalname = sPrefix+"BTNRECEPCION" ;
      bttBtneliminarrecepcion_Internalname = sPrefix+"BTNELIMINARRECEPCION" ;
      bttBtnaprobacioninterna_Internalname = sPrefix+"BTNAPROBACIONINTERNA" ;
      bttBtncancelar_Internalname = sPrefix+"BTNCANCELAR" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      chkavActualizacionensayotxp.setInternalname( sPrefix+"vACTUALIZACIONENSAYOTXP" );
      chkavAprobacioncolorlab.setInternalname( sPrefix+"vAPROBACIONCOLORLAB" );
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      chkavRecepciondeensayocliente_sdt__seleccionar.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__SELECCIONAR" );
      edtavRecepciondeensayocliente_sdt__lb_numero_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMERO" ;
      edtavRecepciondeensayocliente_sdt__clicod_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__CLICOD" ;
      edtavRecepciondeensayocliente_sdt__lb_artcod_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_ARTCOD" ;
      edtavRecepciondeensayocliente_sdt__lb_colnomc_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNOMC" ;
      edtavRecepciondeensayocliente_sdt__lb_colnum_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNUM" ;
      edtavRecepciondeensayocliente_sdt__lb_rb_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_RB" ;
      edtavRecepciondeensayocliente_sdt__lb_opcion_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_OPCION" ;
      cmbavRecepciondeensayocliente_sdt__lb_tiprec.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_TIPREC" );
      edtavRecepciondeensayocliente_sdt__lb_numop_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMOP" ;
      edtavRecepciondeensayocliente_sdt__lb_cartaz_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_CARTAZ" ;
      edtavRecepciondeensayocliente_sdt__lb_fechae_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAE" ;
      edtavRecepciondeensayocliente_sdt__lb_fechaen_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAEN" ;
      edtavRecepciondeensayocliente_sdt__lb_fechar_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAR" ;
      cmbavRecepciondeensayocliente_sdt__lb_estado.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_ESTADO" );
      chkavRecepciondeensayocliente_sdt__eliminar.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__ELIMINAR" );
      cmbavRecepciondeensayocliente_sdt__lb_provdef.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_PROVDEF" );
      edtavRecepciondeensayocliente_sdt__lb_obscr_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_OBSCR" ;
      cmbavRecepciondeensayocliente_sdt__lb_opst.setInternalname( sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_OPST" );
      edtavRecepciondeensayocliente_sdt__lb_opfc_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_OPFC" ;
      edtavRecepciondeensayocliente_sdt__clinom_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__CLINOM" ;
      edtavRecepciondeensayocliente_sdt__f_cformu_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__F_CFORMU" ;
      edtavRecepciondeensayocliente_sdt__fornumcol_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__FORNUMCOL" ;
      edtavRecepciondeensayocliente_sdt__lb_costee_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_COSTEE" ;
      edtavRecepciondeensayocliente_sdt__tipcolcod_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__TIPCOLCOD" ;
      edtavRecepciondeensayocliente_sdt__lb_colnom_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNOM" ;
      edtavRecepciondeensayocliente_sdt__forultuti_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__FORULTUTI" ;
      edtavRecepciondeensayocliente_sdt__lb_rgb_Internalname = sPrefix+"RECEPCIONDEENSAYOCLIENTE_SDT__LB_RGB" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_recepcion_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_RECEPCION" ;
      tblTabledvelop_confirmpanel_recepcion_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_RECEPCION" ;
      Dvelop_confirmpanel_eliminarrecepcion_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARRECEPCION" ;
      tblTabledvelop_confirmpanel_eliminarrecepcion_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINARRECEPCION" ;
      Dvelop_confirmpanel_aprobacioninterna_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_APROBACIONINTERNA" ;
      tblTabledvelop_confirmpanel_aprobacioninterna_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_APROBACIONINTERNA" ;
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
      edtavRecepciondeensayocliente_sdt__lb_rgb_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__lb_rgb_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__forultuti_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__forultuti_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_colnom_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__lb_colnom_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__tipcolcod_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__tipcolcod_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_costee_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__lb_costee_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__fornumcol_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__fornumcol_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__f_cformu_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__f_cformu_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__clinom_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__clinom_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_opfc_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__lb_opfc_Enabled = 0 ;
      cmbavRecepciondeensayocliente_sdt__lb_opst.setJsonclick( "" );
      cmbavRecepciondeensayocliente_sdt__lb_opst.setEnabled( 0 );
      edtavRecepciondeensayocliente_sdt__lb_obscr_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__lb_obscr_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_obscr_Visible = -1 ;
      cmbavRecepciondeensayocliente_sdt__lb_provdef.setJsonclick( "" );
      cmbavRecepciondeensayocliente_sdt__lb_provdef.setEnabled( 1 );
      cmbavRecepciondeensayocliente_sdt__lb_provdef.setVisible( -1 );
      chkavRecepciondeensayocliente_sdt__eliminar.setCaption( "" );
      chkavRecepciondeensayocliente_sdt__eliminar.setEnabled( 1 );
      chkavRecepciondeensayocliente_sdt__eliminar.setVisible( -1 );
      cmbavRecepciondeensayocliente_sdt__lb_estado.setJsonclick( "" );
      cmbavRecepciondeensayocliente_sdt__lb_estado.setEnabled( 0 );
      cmbavRecepciondeensayocliente_sdt__lb_estado.setVisible( -1 );
      edtavRecepciondeensayocliente_sdt__lb_fechar_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__lb_fechar_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_fechar_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_fechaen_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__lb_fechaen_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_fechaen_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_fechae_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__lb_fechae_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_fechae_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_cartaz_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__lb_cartaz_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_cartaz_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_numop_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__lb_numop_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_numop_Visible = -1 ;
      cmbavRecepciondeensayocliente_sdt__lb_tiprec.setJsonclick( "" );
      cmbavRecepciondeensayocliente_sdt__lb_tiprec.setEnabled( 1 );
      cmbavRecepciondeensayocliente_sdt__lb_tiprec.setVisible( -1 );
      edtavRecepciondeensayocliente_sdt__lb_opcion_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__lb_opcion_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_opcion_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_rb_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__lb_rb_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_rb_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_colnum_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__lb_colnum_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_colnum_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_colnomc_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__lb_colnomc_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_colnomc_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_artcod_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__lb_artcod_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_artcod_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__clicod_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__clicod_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__clicod_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_numero_Jsonclick = "" ;
      edtavRecepciondeensayocliente_sdt__lb_numero_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_numero_Visible = -1 ;
      chkavRecepciondeensayocliente_sdt__seleccionar.setCaption( "" );
      chkavRecepciondeensayocliente_sdt__seleccionar.setColumnClass( "WWColumn" );
      chkavRecepciondeensayocliente_sdt__seleccionar.setEnabled( 1 );
      chkavRecepciondeensayocliente_sdt__seleccionar.setVisible( -1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      chkavRecepciondeensayocliente_sdt__seleccionar.setColumnClass( "WWColumn" );
      edtavRecepciondeensayocliente_sdt__lb_obscr_Visible = -1 ;
      cmbavRecepciondeensayocliente_sdt__lb_provdef.setVisible( -1 );
      chkavRecepciondeensayocliente_sdt__eliminar.setVisible( -1 );
      cmbavRecepciondeensayocliente_sdt__lb_estado.setVisible( -1 );
      edtavRecepciondeensayocliente_sdt__lb_fechar_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_fechaen_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_fechae_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_cartaz_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_numop_Visible = -1 ;
      cmbavRecepciondeensayocliente_sdt__lb_tiprec.setVisible( -1 );
      edtavRecepciondeensayocliente_sdt__lb_opcion_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_rb_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_colnum_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_colnomc_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_artcod_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__clicod_Visible = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_numero_Visible = -1 ;
      chkavRecepciondeensayocliente_sdt__seleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavRecepciondeensayocliente_sdt__lb_rgb_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__forultuti_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_colnom_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__tipcolcod_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_costee_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__fornumcol_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__f_cformu_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__clinom_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_opfc_Enabled = -1 ;
      cmbavRecepciondeensayocliente_sdt__lb_opst.setEnabled( -1 );
      edtavRecepciondeensayocliente_sdt__lb_obscr_Enabled = -1 ;
      cmbavRecepciondeensayocliente_sdt__lb_estado.setEnabled( -1 );
      edtavRecepciondeensayocliente_sdt__lb_fechar_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_fechaen_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_fechae_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_cartaz_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_numop_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_opcion_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_rb_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_colnum_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_colnomc_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_artcod_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__clicod_Enabled = -1 ;
      edtavRecepciondeensayocliente_sdt__lb_numero_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      chkavAprobacioncolorlab.setEnabled( 1 );
      chkavActualizacionensayotxp.setEnabled( 1 );
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_aprobacioninterna_Confirmtype = "1" ;
      Dvelop_confirmpanel_aprobacioninterna_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_aprobacioninterna_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_aprobacioninterna_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_aprobacioninterna_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_aprobacioninterna_Confirmationtext = "¿Desea aplicar Aprobacion Interna?" ;
      Dvelop_confirmpanel_aprobacioninterna_Title = "" ;
      Dvelop_confirmpanel_eliminarrecepcion_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarrecepcion_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarrecepcion_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarrecepcion_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarrecepcion_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarrecepcion_Confirmationtext = "¿Desea eliminar la Recepcion?" ;
      Dvelop_confirmpanel_eliminarrecepcion_Title = "" ;
      Dvelop_confirmpanel_recepcion_Confirmtype = "1" ;
      Dvelop_confirmpanel_recepcion_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_recepcion_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_recepcion_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_recepcion_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_recepcion_Confirmationtext = "¿Confirma Recepcion?" ;
      Dvelop_confirmpanel_recepcion_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "|||||||||||||||||" ;
      Ddo_grid_Columnids = "0:RecepciondeEnsayoCliente_SDT__Seleccionar|1:RecepciondeEnsayoCliente_SDT__Lb_numero|2:RecepciondeEnsayoCliente_SDT__Clicod|3:RecepciondeEnsayoCliente_SDT__Lb_artcod|4:RecepciondeEnsayoCliente_SDT__lb_colnomC|5:RecepciondeEnsayoCliente_SDT__Lb_colnum|6:RecepciondeEnsayoCliente_SDT__Lb_rb|7:RecepciondeEnsayoCliente_SDT__Lb_opcion|8:RecepciondeEnsayoCliente_SDT__Lb_TipRec|9:RecepciondeEnsayoCliente_SDT__Lb_numop|10:RecepciondeEnsayoCliente_SDT__Lb_Cartaz|11:RecepciondeEnsayoCliente_SDT__Lb_fechaE|12:RecepciondeEnsayoCliente_SDT__Lb_FechaEn|13:RecepciondeEnsayoCliente_SDT__Lb_fechaR|14:RecepciondeEnsayoCliente_SDT__Lb_estado|15:RecepciondeEnsayoCliente_SDT__Eliminar|16:RecepciondeEnsayoCliente_SDT__Lb_ProvDef|17:RecepciondeEnsayoCliente_SDT__Lb_ObsCR" ;
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
      chkavActualizacionensayotxp.setName( "vACTUALIZACIONENSAYOTXP" );
      chkavActualizacionensayotxp.setWebtags( "" );
      chkavActualizacionensayotxp.setCaption( httpContext.getMessage( "Actualizar Ensayo en Produccion?", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavActualizacionensayotxp.getInternalname(), "TitleCaption", chkavActualizacionensayotxp.getCaption(), true);
      chkavActualizacionensayotxp.setCheckedValue( "N" );
      chkavAprobacioncolorlab.setName( "vAPROBACIONCOLORLAB" );
      chkavAprobacioncolorlab.setWebtags( "" );
      chkavAprobacioncolorlab.setCaption( httpContext.getMessage( "Actualizar Color Laboratorio?", "") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavAprobacioncolorlab.getInternalname(), "TitleCaption", chkavAprobacioncolorlab.getCaption(), true);
      chkavAprobacioncolorlab.setCheckedValue( "N" );
      GXCCtl = "RECEPCIONDEENSAYOCLIENTE_SDT__SELECCIONAR_" + sGXsfl_72_idx ;
      chkavRecepciondeensayocliente_sdt__seleccionar.setName( GXCCtl );
      chkavRecepciondeensayocliente_sdt__seleccionar.setWebtags( "" );
      chkavRecepciondeensayocliente_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavRecepciondeensayocliente_sdt__seleccionar.getInternalname(), "TitleCaption", chkavRecepciondeensayocliente_sdt__seleccionar.getCaption(), !bGXsfl_72_Refreshing);
      chkavRecepciondeensayocliente_sdt__seleccionar.setCheckedValue( "false" );
      GXCCtl = "RECEPCIONDEENSAYOCLIENTE_SDT__LB_TIPREC_" + sGXsfl_72_idx ;
      cmbavRecepciondeensayocliente_sdt__lb_tiprec.setName( GXCCtl );
      cmbavRecepciondeensayocliente_sdt__lb_tiprec.setWebtags( "" );
      cmbavRecepciondeensayocliente_sdt__lb_tiprec.addItem("1", httpContext.getMessage( "Receta", ""), (short)(0));
      cmbavRecepciondeensayocliente_sdt__lb_tiprec.addItem("2", httpContext.getMessage( "Añadida", ""), (short)(0));
      cmbavRecepciondeensayocliente_sdt__lb_tiprec.addItem("3", httpContext.getMessage( "Conf.", ""), (short)(0));
      if ( cmbavRecepciondeensayocliente_sdt__lb_tiprec.getItemCount() > 0 )
      {
         if ( ( AV77GXV1 > 0 ) && ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) && (0==((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_tiprec()) )
         {
         }
      }
      GXCCtl = "RECEPCIONDEENSAYOCLIENTE_SDT__LB_ESTADO_" + sGXsfl_72_idx ;
      cmbavRecepciondeensayocliente_sdt__lb_estado.setName( GXCCtl );
      cmbavRecepciondeensayocliente_sdt__lb_estado.setWebtags( "" );
      cmbavRecepciondeensayocliente_sdt__lb_estado.addItem("1", httpContext.getMessage( "Enviado", ""), (short)(0));
      cmbavRecepciondeensayocliente_sdt__lb_estado.addItem("2", httpContext.getMessage( "Recepcionado", ""), (short)(0));
      if ( cmbavRecepciondeensayocliente_sdt__lb_estado.getItemCount() > 0 )
      {
         if ( ( AV77GXV1 > 0 ) && ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) && (0==((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_estado()) )
         {
         }
      }
      GXCCtl = "RECEPCIONDEENSAYOCLIENTE_SDT__ELIMINAR_" + sGXsfl_72_idx ;
      chkavRecepciondeensayocliente_sdt__eliminar.setName( GXCCtl );
      chkavRecepciondeensayocliente_sdt__eliminar.setWebtags( "" );
      chkavRecepciondeensayocliente_sdt__eliminar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavRecepciondeensayocliente_sdt__eliminar.getInternalname(), "TitleCaption", chkavRecepciondeensayocliente_sdt__eliminar.getCaption(), !bGXsfl_72_Refreshing);
      chkavRecepciondeensayocliente_sdt__eliminar.setCheckedValue( "false" );
      GXCCtl = "RECEPCIONDEENSAYOCLIENTE_SDT__LB_PROVDEF_" + sGXsfl_72_idx ;
      cmbavRecepciondeensayocliente_sdt__lb_provdef.setName( GXCCtl );
      cmbavRecepciondeensayocliente_sdt__lb_provdef.setWebtags( "" );
      cmbavRecepciondeensayocliente_sdt__lb_provdef.addItem("D", httpContext.getMessage( "D", ""), (short)(0));
      cmbavRecepciondeensayocliente_sdt__lb_provdef.addItem("P", httpContext.getMessage( "P", ""), (short)(0));
      if ( cmbavRecepciondeensayocliente_sdt__lb_provdef.getItemCount() > 0 )
      {
         if ( ( AV77GXV1 > 0 ) && ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) && (GXutil.strcmp("", ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_provdef())==0) )
         {
         }
      }
      GXCCtl = "RECEPCIONDEENSAYOCLIENTE_SDT__LB_OPST_" + sGXsfl_72_idx ;
      cmbavRecepciondeensayocliente_sdt__lb_opst.setName( GXCCtl );
      cmbavRecepciondeensayocliente_sdt__lb_opst.setWebtags( "" );
      cmbavRecepciondeensayocliente_sdt__lb_opst.addItem("*", httpContext.getMessage( "Aprovado o Reprovado", ""), (short)(0));
      cmbavRecepciondeensayocliente_sdt__lb_opst.addItem("A", httpContext.getMessage( "Aprovado", ""), (short)(0));
      cmbavRecepciondeensayocliente_sdt__lb_opst.addItem("R", httpContext.getMessage( "Reprovado", ""), (short)(0));
      if ( cmbavRecepciondeensayocliente_sdt__lb_opst.getItemCount() > 0 )
      {
         if ( ( AV77GXV1 > 0 ) && ( AV31RecepciondeEnsayoCliente_SDT.size() >= AV77GXV1 ) && (GXutil.strcmp("", ((app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item)AV31RecepciondeEnsayoCliente_SDT.elementAt(-1+AV77GXV1)).getgxTv_SdtRecepciondeEnsayoCliente_SDT_Item_Lb_opst())==0) )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV31RecepciondeEnsayoCliente_SDT',fld:'vRECEPCIONDEENSAYOCLIENTE_SDT',grid:72,pic:''},{av:'nGXsfl_72_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:72},{av:'nRC_GXsfl_72',ctrl:'GRID',prop:'GridRC',grid:72},{av:'sPrefix'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73EmprcodIN',fld:'vEMPRCODIN',pic:''},{av:'AV61ClicodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV62Lb_CartazIN',fld:'vLB_CARTAZIN',pic:''},{av:'AV63Lb_ColNomIN',fld:'vLB_COLNOMIN',pic:''},{av:'AV64Lb_numeroIN',fld:'vLB_NUMEROIN',pic:'ZZZZZZZ9'},{av:'AV66Lb_fechaRIN',fld:'vLB_FECHARIN',pic:''},{av:'AV65Lb_estadoIN',fld:'vLB_ESTADOIN',pic:'9'},{av:'AV39ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV40AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV29Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__CLICOD',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_ARTCOD',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNOMC',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNUM',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_RB',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_OPCION',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_TIPREC',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMOP',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAE',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_ESTADO',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__ELIMINAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_PROVDEF',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_OBSCR',prop:'Visible'},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV22GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1428M2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV31RecepciondeEnsayoCliente_SDT',fld:'vRECEPCIONDEENSAYOCLIENTE_SDT',grid:72,pic:''},{av:'nGXsfl_72_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:72},{av:'nRC_GXsfl_72',ctrl:'GRID',prop:'GridRC',grid:72},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73EmprcodIN',fld:'vEMPRCODIN',pic:''},{av:'AV61ClicodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV62Lb_CartazIN',fld:'vLB_CARTAZIN',pic:''},{av:'AV63Lb_ColNomIN',fld:'vLB_COLNOMIN',pic:''},{av:'AV64Lb_numeroIN',fld:'vLB_NUMEROIN',pic:'ZZZZZZZ9'},{av:'AV66Lb_fechaRIN',fld:'vLB_FECHARIN',pic:''},{av:'AV65Lb_estadoIN',fld:'vLB_ESTADOIN',pic:'9'},{av:'AV39ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV40AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV29Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1528M2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV31RecepciondeEnsayoCliente_SDT',fld:'vRECEPCIONDEENSAYOCLIENTE_SDT',grid:72,pic:''},{av:'nGXsfl_72_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:72},{av:'nRC_GXsfl_72',ctrl:'GRID',prop:'GridRC',grid:72},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73EmprcodIN',fld:'vEMPRCODIN',pic:''},{av:'AV61ClicodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV62Lb_CartazIN',fld:'vLB_CARTAZIN',pic:''},{av:'AV63Lb_ColNomIN',fld:'vLB_COLNOMIN',pic:''},{av:'AV64Lb_numeroIN',fld:'vLB_NUMEROIN',pic:'ZZZZZZZ9'},{av:'AV66Lb_fechaRIN',fld:'vLB_FECHARIN',pic:''},{av:'AV65Lb_estadoIN',fld:'vLB_ESTADOIN',pic:'9'},{av:'AV39ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV40AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV29Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2628M2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1628M2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV31RecepciondeEnsayoCliente_SDT',fld:'vRECEPCIONDEENSAYOCLIENTE_SDT',grid:72,pic:''},{av:'nGXsfl_72_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:72},{av:'nRC_GXsfl_72',ctrl:'GRID',prop:'GridRC',grid:72},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73EmprcodIN',fld:'vEMPRCODIN',pic:''},{av:'AV61ClicodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV62Lb_CartazIN',fld:'vLB_CARTAZIN',pic:''},{av:'AV63Lb_ColNomIN',fld:'vLB_COLNOMIN',pic:''},{av:'AV64Lb_numeroIN',fld:'vLB_NUMEROIN',pic:'ZZZZZZZ9'},{av:'AV66Lb_fechaRIN',fld:'vLB_FECHARIN',pic:''},{av:'AV65Lb_estadoIN',fld:'vLB_ESTADOIN',pic:'9'},{av:'AV39ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV40AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV29Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__CLICOD',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_ARTCOD',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNOMC',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNUM',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_RB',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_OPCION',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_TIPREC',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMOP',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAE',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_ESTADO',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__ELIMINAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_PROVDEF',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_OBSCR',prop:'Visible'},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV22GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1328M2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV31RecepciondeEnsayoCliente_SDT',fld:'vRECEPCIONDEENSAYOCLIENTE_SDT',grid:72,pic:''},{av:'nGXsfl_72_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:72},{av:'nRC_GXsfl_72',ctrl:'GRID',prop:'GridRC',grid:72},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73EmprcodIN',fld:'vEMPRCODIN',pic:''},{av:'AV61ClicodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV62Lb_CartazIN',fld:'vLB_CARTAZIN',pic:''},{av:'AV63Lb_ColNomIN',fld:'vLB_COLNOMIN',pic:''},{av:'AV64Lb_numeroIN',fld:'vLB_NUMEROIN',pic:'ZZZZZZZ9'},{av:'AV66Lb_fechaRIN',fld:'vLB_FECHARIN',pic:''},{av:'AV65Lb_estadoIN',fld:'vLB_ESTADOIN',pic:'9'},{av:'AV39ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV40AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV29Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV22GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22GridState',fld:'vGRIDSTATE',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__CLICOD',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_ARTCOD',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNOMC',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNUM',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_RB',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_OPCION',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_TIPREC',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMOP',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAE',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_ESTADO',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__ELIMINAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_PROVDEF',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_OBSCR',prop:'Visible'},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DORECEPCION'","{handler:'e1128M1',iparms:[{av:'AV31RecepciondeEnsayoCliente_SDT',fld:'vRECEPCIONDEENSAYOCLIENTE_SDT',grid:72,pic:''},{av:'nGXsfl_72_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:72},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_72',ctrl:'GRID',prop:'GridRC',grid:72},{av:'AV66Lb_fechaRIN',fld:'vLB_FECHARIN',pic:''},{av:'AV44IN_Lb_numero',fld:'vIN_LB_NUMERO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DORECEPCION'",",oparms:[{av:'AV44IN_Lb_numero',fld:'vIN_LB_NUMERO',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_RECEPCION.CLOSE","{handler:'e1728M2',iparms:[{av:'Dvelop_confirmpanel_recepcion_Result',ctrl:'DVELOP_CONFIRMPANEL_RECEPCION',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV31RecepciondeEnsayoCliente_SDT',fld:'vRECEPCIONDEENSAYOCLIENTE_SDT',grid:72,pic:''},{av:'nGXsfl_72_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:72},{av:'nRC_GXsfl_72',ctrl:'GRID',prop:'GridRC',grid:72},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73EmprcodIN',fld:'vEMPRCODIN',pic:''},{av:'AV61ClicodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV62Lb_CartazIN',fld:'vLB_CARTAZIN',pic:''},{av:'AV63Lb_ColNomIN',fld:'vLB_COLNOMIN',pic:''},{av:'AV64Lb_numeroIN',fld:'vLB_NUMEROIN',pic:'ZZZZZZZ9'},{av:'AV66Lb_fechaRIN',fld:'vLB_FECHARIN',pic:''},{av:'AV65Lb_estadoIN',fld:'vLB_ESTADOIN',pic:'9'},{av:'AV39ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV40AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV29Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV15Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_RECEPCION.CLOSE",",oparms:[{av:'AV44IN_Lb_numero',fld:'vIN_LB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV15Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31RecepciondeEnsayoCliente_SDT',fld:'vRECEPCIONDEENSAYOCLIENTE_SDT',grid:72,pic:''},{av:'nGXsfl_72_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:72},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_72',ctrl:'GRID',prop:'GridRC',grid:72},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__CLICOD',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_ARTCOD',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNOMC',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNUM',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_RB',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_OPCION',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_TIPREC',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMOP',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAE',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_ESTADO',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__ELIMINAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_PROVDEF',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_OBSCR',prop:'Visible'},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV22GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOELIMINARRECEPCION'","{handler:'e1228M1',iparms:[{av:'AV31RecepciondeEnsayoCliente_SDT',fld:'vRECEPCIONDEENSAYOCLIENTE_SDT',grid:72,pic:''},{av:'nGXsfl_72_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:72},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_72',ctrl:'GRID',prop:'GridRC',grid:72}]");
      setEventMetadata("'DOELIMINARRECEPCION'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARRECEPCION.CLOSE","{handler:'e1828M2',iparms:[{av:'Dvelop_confirmpanel_eliminarrecepcion_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARRECEPCION',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV31RecepciondeEnsayoCliente_SDT',fld:'vRECEPCIONDEENSAYOCLIENTE_SDT',grid:72,pic:''},{av:'nGXsfl_72_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:72},{av:'nRC_GXsfl_72',ctrl:'GRID',prop:'GridRC',grid:72},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73EmprcodIN',fld:'vEMPRCODIN',pic:''},{av:'AV61ClicodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV62Lb_CartazIN',fld:'vLB_CARTAZIN',pic:''},{av:'AV63Lb_ColNomIN',fld:'vLB_COLNOMIN',pic:''},{av:'AV64Lb_numeroIN',fld:'vLB_NUMEROIN',pic:'ZZZZZZZ9'},{av:'AV66Lb_fechaRIN',fld:'vLB_FECHARIN',pic:''},{av:'AV65Lb_estadoIN',fld:'vLB_ESTADOIN',pic:'9'},{av:'AV39ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV40AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV29Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV15Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV69Fecha_b',fld:'vFECHA_B',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARRECEPCION.CLOSE",",oparms:[{av:'AV44IN_Lb_numero',fld:'vIN_LB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV15Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV69Fecha_b',fld:'vFECHA_B',pic:''},{av:'AV31RecepciondeEnsayoCliente_SDT',fld:'vRECEPCIONDEENSAYOCLIENTE_SDT',grid:72,pic:''},{av:'nGXsfl_72_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:72},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_72',ctrl:'GRID',prop:'GridRC',grid:72},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__CLICOD',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_ARTCOD',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNOMC',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNUM',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_RB',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_OPCION',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_TIPREC',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMOP',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAE',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_ESTADO',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__ELIMINAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_PROVDEF',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_OBSCR',prop:'Visible'},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV22GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOAPROBACIONINTERNA'","{handler:'e2028M2',iparms:[{av:'AV66Lb_fechaRIN',fld:'vLB_FECHARIN',pic:''},{av:'AV31RecepciondeEnsayoCliente_SDT',fld:'vRECEPCIONDEENSAYOCLIENTE_SDT',grid:72,pic:''},{av:'nGXsfl_72_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:72},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_72',ctrl:'GRID',prop:'GridRC',grid:72}]");
      setEventMetadata("'DOAPROBACIONINTERNA'",",oparms:[{av:'AV44IN_Lb_numero',fld:'vIN_LB_NUMERO',pic:'ZZZZZZZ9'},{av:'Dvelop_confirmpanel_aprobacioninterna_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_APROBACIONINTERNA',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_APROBACIONINTERNA.CLOSE","{handler:'e1928M2',iparms:[{av:'Dvelop_confirmpanel_aprobacioninterna_Result',ctrl:'DVELOP_CONFIRMPANEL_APROBACIONINTERNA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV31RecepciondeEnsayoCliente_SDT',fld:'vRECEPCIONDEENSAYOCLIENTE_SDT',grid:72,pic:''},{av:'nGXsfl_72_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:72},{av:'nRC_GXsfl_72',ctrl:'GRID',prop:'GridRC',grid:72},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV19FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV73EmprcodIN',fld:'vEMPRCODIN',pic:''},{av:'AV61ClicodIN',fld:'vCLICODIN',pic:'ZZZZZ9'},{av:'AV62Lb_CartazIN',fld:'vLB_CARTAZIN',pic:''},{av:'AV63Lb_ColNomIN',fld:'vLB_COLNOMIN',pic:''},{av:'AV64Lb_numeroIN',fld:'vLB_NUMEROIN',pic:'ZZZZZZZ9'},{av:'AV66Lb_fechaRIN',fld:'vLB_FECHARIN',pic:''},{av:'AV65Lb_estadoIN',fld:'vLB_ESTADOIN',pic:'9'},{av:'AV39ActualizacionEnsayoTxp',fld:'vACTUALIZACIONENSAYOTXP',pic:''},{av:'AV40AprobacionColorLab',fld:'vAPROBACIONCOLORLAB',pic:''},{av:'AV29Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV15Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44IN_Lb_numero',fld:'vIN_LB_NUMERO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_APROBACIONINTERNA.CLOSE",",oparms:[{av:'AV31RecepciondeEnsayoCliente_SDT',fld:'vRECEPCIONDEENSAYOCLIENTE_SDT',grid:72,pic:''},{av:'nGXsfl_72_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:72},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_72',ctrl:'GRID',prop:'GridRC',grid:72},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__CLICOD',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_ARTCOD',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNOMC',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_COLNUM',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_RB',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_OPCION',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_TIPREC',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_NUMOP',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAE',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_FECHAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_ESTADO',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__ELIMINAR',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_PROVDEF',prop:'Visible'},{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__LB_OBSCR',prop:'Visible'},{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV22GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e2128M2',iparms:[]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e2228M2',iparms:[{av:'AV31RecepciondeEnsayoCliente_SDT',fld:'vRECEPCIONDEENSAYOCLIENTE_SDT',grid:72,pic:''},{av:'nGXsfl_72_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:72},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_72',ctrl:'GRID',prop:'GridRC',grid:72}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e2328M2',iparms:[{av:'AV31RecepciondeEnsayoCliente_SDT',fld:'vRECEPCIONDEENSAYOCLIENTE_SDT',grid:72,pic:''},{av:'nGXsfl_72_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:72},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_72',ctrl:'GRID',prop:'GridRC',grid:72}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("RECEPCIONDEENSAYOCLIENTE_SDT__SELECCIONAR.CLICK","{handler:'e2728M2',iparms:[{av:'AV31RecepciondeEnsayoCliente_SDT',fld:'vRECEPCIONDEENSAYOCLIENTE_SDT',grid:72,pic:''},{av:'nGXsfl_72_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:72},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_72',ctrl:'GRID',grid:72,prop:'GridRC',grid:72}]");
      setEventMetadata("RECEPCIONDEENSAYOCLIENTE_SDT__SELECCIONAR.CLICK",",oparms:[{ctrl:'RECEPCIONDEENSAYOCLIENTE_SDT__SELECCIONAR',prop:'Columnclass'}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv29',iparms:[]");
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
      wcpOAV62Lb_CartazIN = "" ;
      wcpOAV63Lb_ColNomIN = "" ;
      wcpOAV66Lb_fechaRIN = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_recepcion_Result = "" ;
      Dvelop_confirmpanel_eliminarrecepcion_Result = "" ;
      Dvelop_confirmpanel_aprobacioninterna_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV73EmprcodIN = "" ;
      AV62Lb_CartazIN = "" ;
      AV63Lb_ColNomIN = "" ;
      AV66Lb_fechaRIN = GXutil.nullDate() ;
      AV11ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV106Pgmname = "" ;
      AV19FilterFullText = "" ;
      AV39ActualizacionEnsayoTxp = "" ;
      AV40AprobacionColorLab = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV31RecepciondeEnsayoCliente_SDT = new GXBaseCollection<app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item>(app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV26ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV14DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV22GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV15Emprcod = "" ;
      AV69Fecha_b = GXutil.nullDate() ;
      AV43RecepciondeEnsayoCliente_SDT_item = new app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item(remoteHandle, context);
      AV45Lb_FechaEn = GXutil.nullDate() ;
      Gx_msg = "" ;
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
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      bttBtnrecepcion_Jsonclick = "" ;
      bttBtneliminarrecepcion_Jsonclick = "" ;
      bttBtnaprobacioninterna_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV33Station = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      AV37UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int10 = new byte[1] ;
      AV41AprobacionInterna = "" ;
      AV38WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV32Session = httpContext.getWebSession();
      AV13ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV28ManageFiltersXml = "" ;
      ucDvelop_confirmpanel_aprobacioninterna = new com.genexus.webpanels.GXUserControl();
      AV71RecepciondeEnsayoCliente_SDT_json = "" ;
      AV70Websession = httpContext.getWebSession();
      AV18ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV36UserCustomValue = "" ;
      GXt_char1 = "" ;
      AV12ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection[1] ;
      AV50Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      AV60IN_Lb_opcion = "" ;
      AV7Lb_ColNom = "" ;
      AV54Lb_ProvDef = "" ;
      AV55CliNom = "" ;
      AV56lb_artcod = "" ;
      AV58Num_color = "" ;
      AV67Fec_null = GXutil.nullDate() ;
      AV68Hora_null = GXutil.resetTime( GXutil.nullDate() );
      GXt_dtime17 = GXutil.resetTime( GXutil.nullDate() );
      GXv_char4 = new String[1] ;
      GXv_int16 = new int[1] ;
      GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 = new GXBaseCollection<app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item>(app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtRecepciondeEnsayoCliente_SDT_Item8 = new GXBaseCollection[1] ;
      AV23GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      ucDvelop_confirmpanel_eliminarrecepcion = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_recepcion = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV73EmprcodIN = "" ;
      sCtrlAV61ClicodIN = "" ;
      sCtrlAV62Lb_CartazIN = "" ;
      sCtrlAV63Lb_ColNomIN = "" ;
      sCtrlAV64Lb_numeroIN = "" ;
      sCtrlAV66Lb_fechaRIN = "" ;
      sCtrlAV65Lb_estadoIN = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.recepciondeensayocliente__wc__default(),
         new Object[] {
         }
      );
      AV106Pgmname = "GestionLaboratorio.RecepciondeEnsayoCliente__WC" ;
      /* GeneXus formulas. */
      AV106Pgmname = "GestionLaboratorio.RecepciondeEnsayoCliente__WC" ;
      Gx_err = (short)(0) ;
      edtavRecepciondeensayocliente_sdt__lb_numero_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__clicod_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_artcod_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_colnomc_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_colnum_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_rb_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_opcion_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_numop_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_cartaz_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_fechae_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_fechaen_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_fechar_Enabled = 0 ;
      cmbavRecepciondeensayocliente_sdt__lb_estado.setEnabled( 0 );
      edtavRecepciondeensayocliente_sdt__lb_obscr_Enabled = 0 ;
      cmbavRecepciondeensayocliente_sdt__lb_opst.setEnabled( 0 );
      edtavRecepciondeensayocliente_sdt__lb_opfc_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__clinom_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__f_cformu_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__fornumcol_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_costee_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__tipcolcod_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_colnom_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__forultuti_Enabled = 0 ;
      edtavRecepciondeensayocliente_sdt__lb_rgb_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV65Lb_estadoIN ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV65Lb_estadoIN ;
   private byte AV27ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int9 ;
   private byte GXv_int10[] ;
   private byte AV52TipColCod ;
   private byte AV53Lb_TipRec ;
   private byte AV57Lb_numop ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV29Moda21 ;
   private short AV49Lineas ;
   private short AV42Num_v ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV74i ;
   private int wcpOAV61ClicodIN ;
   private int wcpOAV64Lb_numeroIN ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_72 ;
   private int AV61ClicodIN ;
   private int AV64Lb_numeroIN ;
   private int nGXsfl_72_idx=1 ;
   private int AV44IN_Lb_numero ;
   private int AV109GXV31 ;
   private int AV114GXV36 ;
   private int AV46IN_Lb_numerot ;
   private int AV108GXV30 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV77GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavRecepciondeensayocliente_sdt__lb_numero_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__clicod_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__lb_artcod_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__lb_colnomc_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__lb_colnum_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__lb_rb_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__lb_opcion_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__lb_numop_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__lb_cartaz_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__lb_fechae_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__lb_fechaen_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__lb_fechar_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__lb_obscr_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__lb_opfc_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__clinom_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__f_cformu_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__fornumcol_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__lb_costee_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__tipcolcod_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__lb_colnom_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__forultuti_Enabled ;
   private int edtavRecepciondeensayocliente_sdt__lb_rgb_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_72_fel_idx=1 ;
   private int edtavRecepciondeensayocliente_sdt__lb_numero_Visible ;
   private int edtavRecepciondeensayocliente_sdt__clicod_Visible ;
   private int edtavRecepciondeensayocliente_sdt__lb_artcod_Visible ;
   private int edtavRecepciondeensayocliente_sdt__lb_colnomc_Visible ;
   private int edtavRecepciondeensayocliente_sdt__lb_colnum_Visible ;
   private int edtavRecepciondeensayocliente_sdt__lb_rb_Visible ;
   private int edtavRecepciondeensayocliente_sdt__lb_opcion_Visible ;
   private int edtavRecepciondeensayocliente_sdt__lb_numop_Visible ;
   private int edtavRecepciondeensayocliente_sdt__lb_cartaz_Visible ;
   private int edtavRecepciondeensayocliente_sdt__lb_fechae_Visible ;
   private int edtavRecepciondeensayocliente_sdt__lb_fechaen_Visible ;
   private int edtavRecepciondeensayocliente_sdt__lb_fechar_Visible ;
   private int edtavRecepciondeensayocliente_sdt__lb_obscr_Visible ;
   private int AV30PageToGo ;
   private int nGXsfl_72_bak_idx=1 ;
   private int AV110GXV32 ;
   private int AV51Lb_ColNum ;
   private int AV5Clicod ;
   private int AV59N_color ;
   private int AV111GXV33 ;
   private int AV112GXV34 ;
   private int GXv_int16[] ;
   private int AV113GXV35 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV20GridCurrentPage ;
   private long AV21GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV73EmprcodIN ;
   private String wcpOAV62Lb_CartazIN ;
   private String wcpOAV63Lb_ColNomIN ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_recepcion_Result ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Result ;
   private String Dvelop_confirmpanel_aprobacioninterna_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV73EmprcodIN ;
   private String AV62Lb_CartazIN ;
   private String AV63Lb_ColNomIN ;
   private String sGXsfl_72_idx="0001" ;
   private String AV106Pgmname ;
   private String AV39ActualizacionEnsayoTxp ;
   private String AV40AprobacionColorLab ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV15Emprcod ;
   private String Gx_msg ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Dvelop_confirmpanel_recepcion_Title ;
   private String Dvelop_confirmpanel_recepcion_Confirmationtext ;
   private String Dvelop_confirmpanel_recepcion_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_recepcion_Nobuttoncaption ;
   private String Dvelop_confirmpanel_recepcion_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_recepcion_Yesbuttonposition ;
   private String Dvelop_confirmpanel_recepcion_Confirmtype ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Title ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Confirmtype ;
   private String Dvelop_confirmpanel_aprobacioninterna_Title ;
   private String Dvelop_confirmpanel_aprobacioninterna_Confirmationtext ;
   private String Dvelop_confirmpanel_aprobacioninterna_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_aprobacioninterna_Nobuttoncaption ;
   private String Dvelop_confirmpanel_aprobacioninterna_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_aprobacioninterna_Yesbuttonposition ;
   private String Dvelop_confirmpanel_aprobacioninterna_Confirmtype ;
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
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnrecepcion_Internalname ;
   private String bttBtnrecepcion_Jsonclick ;
   private String bttBtneliminarrecepcion_Internalname ;
   private String bttBtneliminarrecepcion_Jsonclick ;
   private String bttBtnaprobacioninterna_Internalname ;
   private String bttBtnaprobacioninterna_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
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
   private String edtavFilterfulltext_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__lb_numero_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__clicod_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__lb_artcod_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__lb_colnomc_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__lb_colnum_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__lb_rb_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__lb_opcion_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__lb_numop_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__lb_cartaz_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__lb_fechae_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__lb_fechaen_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__lb_fechar_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__lb_obscr_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__lb_opfc_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__clinom_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__f_cformu_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__fornumcol_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__lb_costee_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__tipcolcod_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__lb_colnom_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__forultuti_Internalname ;
   private String edtavRecepciondeensayocliente_sdt__lb_rgb_Internalname ;
   private String sGXsfl_72_fel_idx="0001" ;
   private String hsh ;
   private String AV33Station ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String AV37UsurCod ;
   private String AV41AprobacionInterna ;
   private String Dvelop_confirmpanel_aprobacioninterna_Internalname ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String AV60IN_Lb_opcion ;
   private String AV7Lb_ColNom ;
   private String AV54Lb_ProvDef ;
   private String AV55CliNom ;
   private String AV56lb_artcod ;
   private String AV58Num_color ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_aprobacioninterna_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminarrecepcion_Internalname ;
   private String Dvelop_confirmpanel_eliminarrecepcion_Internalname ;
   private String tblTabledvelop_confirmpanel_recepcion_Internalname ;
   private String Dvelop_confirmpanel_recepcion_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV73EmprcodIN ;
   private String sCtrlAV61ClicodIN ;
   private String sCtrlAV62Lb_CartazIN ;
   private String sCtrlAV63Lb_ColNomIN ;
   private String sCtrlAV64Lb_numeroIN ;
   private String sCtrlAV66Lb_fechaRIN ;
   private String sCtrlAV65Lb_estadoIN ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavRecepciondeensayocliente_sdt__lb_numero_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__clicod_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__lb_artcod_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__lb_colnomc_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__lb_colnum_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__lb_rb_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__lb_opcion_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__lb_numop_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__lb_cartaz_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__lb_fechae_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__lb_fechaen_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__lb_fechar_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__lb_obscr_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__lb_opfc_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__clinom_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__f_cformu_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__fornumcol_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__lb_costee_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__tipcolcod_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__lb_colnom_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__forultuti_Jsonclick ;
   private String edtavRecepciondeensayocliente_sdt__lb_rgb_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV50Lb_HoraR ;
   private java.util.Date AV68Hora_null ;
   private java.util.Date GXt_dtime17 ;
   private java.util.Date wcpOAV66Lb_fechaRIN ;
   private java.util.Date AV66Lb_fechaRIN ;
   private java.util.Date AV69Fecha_b ;
   private java.util.Date AV45Lb_FechaEn ;
   private java.util.Date AV67Fec_null ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
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
   private boolean bGXsfl_72_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV72 ;
   private boolean gx_refresh_fired ;
   private String AV13ColumnsSelectorXML ;
   private String AV28ManageFiltersXml ;
   private String AV71RecepciondeEnsayoCliente_SDT_json ;
   private String AV36UserCustomValue ;
   private String AV19FilterFullText ;
   private String AV18ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV32Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_aprobacioninterna ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarrecepcion ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_recepcion ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavActualizacionensayotxp ;
   private ICheckbox chkavAprobacioncolorlab ;
   private ICheckbox chkavRecepciondeensayocliente_sdt__seleccionar ;
   private HTMLChoice cmbavRecepciondeensayocliente_sdt__lb_tiprec ;
   private HTMLChoice cmbavRecepciondeensayocliente_sdt__lb_estado ;
   private ICheckbox chkavRecepciondeensayocliente_sdt__eliminar ;
   private HTMLChoice cmbavRecepciondeensayocliente_sdt__lb_provdef ;
   private HTMLChoice cmbavRecepciondeensayocliente_sdt__lb_opst ;
   private IDataStoreProvider pr_default ;
   private com.genexus.webpanels.WebSession AV70Websession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV26ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[] ;
   private GXBaseCollection<app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item> AV31RecepciondeEnsayoCliente_SDT ;
   private GXBaseCollection<app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item> GXt_objcol_SdtRecepciondeEnsayoCliente_SDT_Item7 ;
   private GXBaseCollection<app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item> GXv_objcol_SdtRecepciondeEnsayoCliente_SDT_Item8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV11ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV12ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV14DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV22GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV23GridStateFilterValue ;
   private app.gestionlaboratorio.SdtRecepciondeEnsayoCliente_SDT_Item AV43RecepciondeEnsayoCliente_SDT_item ;
   private app.wwpbaseobjects.SdtWWPContext AV38WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class recepciondeensayocliente__wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

