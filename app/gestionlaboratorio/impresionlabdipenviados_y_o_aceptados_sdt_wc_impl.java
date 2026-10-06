package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class impresionlabdipenviados_y_o_aceptados_sdt_wc_impl extends GXWebComponent
{
   public impresionlabdipenviados_y_o_aceptados_sdt_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public impresionlabdipenviados_y_o_aceptados_sdt_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impresionlabdipenviados_y_o_aceptados_sdt_wc_impl.class ));
   }

   public impresionlabdipenviados_y_o_aceptados_sdt_wc_impl( int remoteHandle ,
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
      chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar = UIFactory.getCheckbox(this);
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
               AV14Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Emprcod", AV14Emprcod);
               AV8Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clicod), 6, 0));
               AV29Lb_Cartaz = httpContext.GetPar( "Lb_Cartaz") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Lb_Cartaz", AV29Lb_Cartaz);
               AV30Lb_ColNom = httpContext.GetPar( "Lb_ColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Lb_ColNom", AV30Lb_ColNom);
               AV35Lb_Numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_Numero"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Lb_Numero), 8, 0));
               AV32Lb_FechaEfrom = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEfrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Lb_FechaEfrom", localUtil.format(AV32Lb_FechaEfrom, "99/99/99"));
               AV34Lb_FechaEto = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEto")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Lb_FechaEto", localUtil.format(AV34Lb_FechaEto, "99/99/99"));
               AV33Lb_FechaEn = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEn")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Lb_FechaEn", localUtil.format(AV33Lb_FechaEn, "99/99/99"));
               AV31Lb_Estado = (byte)(GXutil.lval( httpContext.GetPar( "Lb_Estado"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Lb_Estado", GXutil.str( AV31Lb_Estado, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV14Emprcod,Integer.valueOf(AV8Clicod),AV29Lb_Cartaz,AV30Lb_ColNom,Integer.valueOf(AV35Lb_Numero),AV32Lb_FechaEfrom,AV34Lb_FechaEto,AV33Lb_FechaEn,Byte.valueOf(AV31Lb_Estado)});
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
      nRC_GXsfl_71 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_71"))) ;
      nGXsfl_71_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_71_idx"))) ;
      sGXsfl_71_idx = httpContext.GetPar( "sGXsfl_71_idx") ;
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
      AV37ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV10ColumnsSelector);
      AV67Pgmname = httpContext.GetPar( "Pgmname") ;
      AV17FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV14Emprcod = httpContext.GetPar( "Emprcod") ;
      AV8Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV29Lb_Cartaz = httpContext.GetPar( "Lb_Cartaz") ;
      AV30Lb_ColNom = httpContext.GetPar( "Lb_ColNom") ;
      AV35Lb_Numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_Numero"))) ;
      AV32Lb_FechaEfrom = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEfrom")) ;
      AV34Lb_FechaEto = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEto")) ;
      AV33Lb_FechaEn = localUtil.parseDateParm( httpContext.GetPar( "Lb_FechaEn")) ;
      AV31Lb_Estado = (byte)(GXutil.lval( httpContext.GetPar( "Lb_Estado"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT);
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV37ManageFiltersExecutionStep, AV10ColumnsSelector, AV67Pgmname, AV17FilterFullText, AV14Emprcod, AV8Clicod, AV29Lb_Cartaz, AV30Lb_ColNom, AV35Lb_Numero, AV32Lb_FechaEfrom, AV34Lb_FechaEto, AV33Lb_FechaEn, AV31Lb_Estado, AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2762( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Impresion Lab Dip Enviados_y_o_Aceptados (SDT)", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.impresionlabdipenviados_y_o_aceptados_sdt_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV14Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV8Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV29Lb_Cartaz)),GXutil.URLEncode(GXutil.rtrim(AV30Lb_ColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV35Lb_Numero,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV32Lb_FechaEfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV34Lb_FechaEto)),GXutil.URLEncode(GXutil.formatDateParm(AV33Lb_FechaEn)),GXutil.URLEncode(GXutil.ltrimstr(AV31Lb_Estado,1,0))}, new String[] {"Emprcod","Clicod","Lb_Cartaz","Lb_ColNom","Lb_Numero","Lb_FechaEfrom","Lb_FechaEto","Lb_FechaEn","Lb_Estado"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\impresionlabdipenviados_y_o_aceptados_sdt_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Impresionlabdipenviados_y_o_aceptados_sdt", AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Impresionlabdipenviados_y_o_aceptados_sdt", AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_71", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_71, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV36ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV36ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV18GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV19GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV13DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV13DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV10ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV10ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14Emprcod", GXutil.rtrim( wcpOAV14Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV8Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29Lb_Cartaz", GXutil.rtrim( wcpOAV29Lb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30Lb_ColNom", GXutil.rtrim( wcpOAV30Lb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35Lb_Numero", GXutil.ltrim( localUtil.ntoc( wcpOAV35Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32Lb_FechaEfrom", localUtil.dtoc( wcpOAV32Lb_FechaEfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34Lb_FechaEto", localUtil.dtoc( wcpOAV34Lb_FechaEto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33Lb_FechaEn", localUtil.dtoc( wcpOAV33Lb_FechaEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31Lb_Estado", GXutil.ltrim( localUtil.ntoc( wcpOAV31Lb_Estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV37ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV14Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV8Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_CARTAZ", GXutil.rtrim( AV29Lb_Cartaz));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_COLNOM", GXutil.rtrim( AV30Lb_ColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV35Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAEFROM", localUtil.dtoc( AV32Lb_FechaEfrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAETO", localUtil.dtoc( AV34Lb_FechaEto, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_FECHAEN", localUtil.dtoc( AV33Lb_FechaEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_ESTADO", GXutil.ltrim( localUtil.ntoc( AV31Lb_Estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vIMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT", AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vIMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT", AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV20GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV20GridState);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vVAR_SELECCIONAR", AV44Var_seleccionar);
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm2762( )
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
      return "GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Impresion Lab Dip Enviados_y_o_Aceptados (SDT)", "") ;
   }

   public void wb2760( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.gestionlaboratorio.impresionlabdipenviados_y_o_aceptados_sdt_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 71, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 71, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 71, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_2762( true) ;
      }
      else
      {
         wb_table1_23_2762( false) ;
      }
      return  ;
   }

   public void wb_table1_23_2762e( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlabdip_Internalname, "gx.evt.setGridEvt("+GXutil.str( 71, 2, 0)+","+"null"+");", httpContext.getMessage( "Lab DIP para Aprovaçao", ""), bttBtnlabdip_Jsonclick, 5, httpContext.getMessage( "Lab DIP para Aprovaçao", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOLABDIP\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 71, 2, 0)+","+"null"+");", "++", bttBtnmarcartodas_Jsonclick, 5, "++", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOMARCARTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndesmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 71, 2, 0)+","+"null"+");", "--", bttBtndesmarcartodas_Jsonclick, 5, "--", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DODESMARCARTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 71, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC.htm");
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
         /* User Defined Control */
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlabdipcoste_Internalname, "gx.evt.setGridEvt("+GXutil.str( 71, 2, 0)+","+"null"+");", httpContext.getMessage( "Lab DIP con Coste", ""), bttBtnlabdipcoste_Jsonclick, 5, httpContext.getMessage( "Lab DIP con Coste", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOLABDIPCOSTE\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablelb_rb_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 MergeLabelCell CellWidth_12_5", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklb_rb_Internalname, httpContext.getMessage( "Rb", ""), "", "", lblTextblocklb_rb_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_GestionLaboratorio\\ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellWidth_87_5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLb_rb_Internalname, httpContext.getMessage( "Rb", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'" + sPrefix + "',false,'" + sGXsfl_71_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLb_rb_Internalname, GXutil.ltrim( localUtil.ntoc( AV48Lb_Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLb_rb_Enabled!=0) ? localUtil.format( AV48Lb_Rb, "ZZZ9.99") : localUtil.format( AV48Lb_Rb, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,65);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLb_rb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLb_rb_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol71( ) ;
      }
      if ( wbEnd == 71 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_71 = (int)(nGXsfl_71_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV53GXV1 = nGXsfl_71_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV18GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV19GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV67Pgmname), GXutil.rtrim( localUtil.format( AV67Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV10ColumnsSelector);
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
      if ( wbEnd == 71 )
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
               AV53GXV1 = nGXsfl_71_idx ;
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

   public void start2762( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Impresion Lab Dip Enviados_y_o_Aceptados (SDT)", ""), (short)(0)) ;
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
            strup2760( ) ;
         }
      }
   }

   public void ws2762( )
   {
      start2762( ) ;
      evt2762( ) ;
   }

   public void evt2762( )
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
                              strup2760( ) ;
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
                              strup2760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e142762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLABDIPCOSTE'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Dolabdipcoste' */
                                 e152762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLABDIP'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Dolabdip' */
                                 e162762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOMARCARTODAS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoMarcarTodas' */
                                 e172762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DODESMARCARTODAS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoDesmarcarTodas' */
                                 e182762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCancelar' */
                                 e192762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e202762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e212762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2760( ) ;
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
                              strup2760( ) ;
                           }
                           nGXsfl_71_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_712( ) ;
                           AV53GXV1 = (int)(nGXsfl_71_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.size() >= AV53GXV1 ) && ( AV53GXV1 > 0 ) )
                           {
                              AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)) );
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e222762 ();
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
                                       e232762 ();
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
                                       e242762 ();
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
                                    strup2760( ) ;
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

   public void we2762( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2762( ) ;
         }
      }
   }

   public void pa2762( )
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
      subsflControlProps_712( ) ;
      while ( nGXsfl_71_idx <= nRC_GXsfl_71 )
      {
         sendrow_712( ) ;
         nGXsfl_71_idx = ((subGrid_Islastpage==1)&&(nGXsfl_71_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_71_idx+1) ;
         sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_712( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV37ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV10ColumnsSelector ,
                                 String AV67Pgmname ,
                                 String AV17FilterFullText ,
                                 String AV14Emprcod ,
                                 int AV8Clicod ,
                                 String AV29Lb_Cartaz ,
                                 String AV30Lb_ColNom ,
                                 int AV35Lb_Numero ,
                                 java.util.Date AV32Lb_FechaEfrom ,
                                 java.util.Date AV34Lb_FechaEto ,
                                 java.util.Date AV33Lb_FechaEn ,
                                 byte AV31Lb_Estado ,
                                 GXBaseCollection<app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item> AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e232762 ();
      GRID_nCurrentRecord = 0 ;
      rf2762( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\impresionlabdipenviados_y_o_aceptados_sdt_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2762( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV67Pgmname = "GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Pgmname", AV67Pgmname);
      Gx_err = (short)(0) ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2762( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(71) ;
      /* Execute user event: Refresh */
      e232762 ();
      nGXsfl_71_idx = 1 ;
      sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_712( ) ;
      bGXsfl_71_Refreshing = true ;
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
         subsflControlProps_712( ) ;
         e242762 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_71_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e242762 ();
         }
         wbEnd = (short)(71) ;
         wb2760( ) ;
      }
      bGXsfl_71_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2762( )
   {
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
      return AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV37ManageFiltersExecutionStep, AV10ColumnsSelector, AV67Pgmname, AV17FilterFullText, AV14Emprcod, AV8Clicod, AV29Lb_Cartaz, AV30Lb_ColNom, AV35Lb_Numero, AV32Lb_FechaEfrom, AV34Lb_FechaEto, AV33Lb_FechaEn, AV31Lb_Estado, AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV37ManageFiltersExecutionStep, AV10ColumnsSelector, AV67Pgmname, AV17FilterFullText, AV14Emprcod, AV8Clicod, AV29Lb_Cartaz, AV30Lb_ColNom, AV35Lb_Numero, AV32Lb_FechaEfrom, AV34Lb_FechaEto, AV33Lb_FechaEn, AV31Lb_Estado, AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV37ManageFiltersExecutionStep, AV10ColumnsSelector, AV67Pgmname, AV17FilterFullText, AV14Emprcod, AV8Clicod, AV29Lb_Cartaz, AV30Lb_ColNom, AV35Lb_Numero, AV32Lb_FechaEfrom, AV34Lb_FechaEto, AV33Lb_FechaEn, AV31Lb_Estado, AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV37ManageFiltersExecutionStep, AV10ColumnsSelector, AV67Pgmname, AV17FilterFullText, AV14Emprcod, AV8Clicod, AV29Lb_Cartaz, AV30Lb_ColNom, AV35Lb_Numero, AV32Lb_FechaEfrom, AV34Lb_FechaEto, AV33Lb_FechaEn, AV31Lb_Estado, AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV37ManageFiltersExecutionStep, AV10ColumnsSelector, AV67Pgmname, AV17FilterFullText, AV14Emprcod, AV8Clicod, AV29Lb_Cartaz, AV30Lb_ColNom, AV35Lb_Numero, AV32Lb_FechaEfrom, AV34Lb_FechaEto, AV33Lb_FechaEn, AV31Lb_Estado, AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV67Pgmname = "GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Pgmname", AV67Pgmname);
      Gx_err = (short)(0) ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2760( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e222762 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Impresionlabdipenviados_y_o_aceptados_sdt"), AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV36ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV13DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV10ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vIMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT"), AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT);
         /* Read saved values. */
         nRC_GXsfl_71 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_71"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV18GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV19GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV14Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV14Emprcod") ;
         wcpOAV8Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV29Lb_Cartaz = httpContext.cgiGet( sPrefix+"wcpOAV29Lb_Cartaz") ;
         wcpOAV30Lb_ColNom = httpContext.cgiGet( sPrefix+"wcpOAV30Lb_ColNom") ;
         wcpOAV35Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35Lb_Numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV32Lb_FechaEfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV32Lb_FechaEfrom"), 0) ;
         wcpOAV34Lb_FechaEto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV34Lb_FechaEto"), 0) ;
         wcpOAV33Lb_FechaEn = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV33Lb_FechaEn"), 0) ;
         wcpOAV31Lb_Estado = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31Lb_Estado"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
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
         nRC_GXsfl_71 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_71"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_71_fel_idx = 0 ;
         while ( nGXsfl_71_fel_idx < nRC_GXsfl_71 )
         {
            nGXsfl_71_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_71_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_71_fel_idx+1) ;
            sGXsfl_71_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_712( ) ;
            AV53GXV1 = (int)(nGXsfl_71_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.size() >= AV53GXV1 ) && ( AV53GXV1 > 0 ) )
            {
               AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)) );
            }
         }
         if ( nGXsfl_71_fel_idx == 0 )
         {
            nGXsfl_71_idx = 1 ;
            sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_712( ) ;
         }
         nGXsfl_71_fel_idx = 1 ;
         /* Read variables values. */
         AV17FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17FilterFullText", AV17FilterFullText);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavLb_rb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavLb_rb_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLB_RB");
            GX_FocusControl = edtavLb_rb_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV48Lb_Rb = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Lb_Rb", GXutil.ltrimstr( AV48Lb_Rb, 7, 2));
         }
         else
         {
            AV48Lb_Rb = localUtil.ctond( httpContext.cgiGet( edtavLb_rb_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Lb_Rb", GXutil.ltrimstr( AV48Lb_Rb, 7, 2));
         }
         AV67Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Pgmname", AV67Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_71_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_712( ) ;
         AV53GXV1 = (int)(nGXsfl_71_idx+GRID_nFirstRecordOnPage) ;
         if ( nGXsfl_71_idx > 0 )
         {
            AV53GXV1 = (int)(nGXsfl_71_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.size() >= AV53GXV1 ) && ( AV53GXV1 > 0 ) )
            {
               AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)) );
            }
            if ( ( AV53GXV1 > 0 ) && ( AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.size() >= AV53GXV1 ) )
            {
               AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)) );
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC");
         AV67Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Pgmname", AV67Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\impresionlabdipenviados_y_o_aceptados_sdt_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e222762 ();
      if (returnInSub) return;
   }

   public void e222762( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV6Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      impresionlabdipenviados_y_o_aceptados_sdt_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV6Station = GXt_char1 ;
      GXv_char2[0] = AV14Emprcod ;
      GXv_char3[0] = AV5EmprNom ;
      GXv_char4[0] = AV7UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV6Station, GXv_char2, GXv_char3, GXv_char4) ;
      impresionlabdipenviados_y_o_aceptados_sdt_wc_impl.this.AV14Emprcod = GXv_char2[0] ;
      impresionlabdipenviados_y_o_aceptados_sdt_wc_impl.this.AV5EmprNom = GXv_char3[0] ;
      impresionlabdipenviados_y_o_aceptados_sdt_wc_impl.this.AV7UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Emprcod", AV14Emprcod);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV13DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV13DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_objcol_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item7 = AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT ;
      GXv_objcol_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item8[0] = GXt_objcol_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item7 ;
      new app.gestionlaboratorio.impresionlabdipenviados_y_o_aceptados_dp(remoteHandle, context).execute( AV14Emprcod, AV8Clicod, AV29Lb_Cartaz, AV30Lb_ColNom, AV35Lb_Numero, AV32Lb_FechaEfrom, AV34Lb_FechaEto, AV33Lb_FechaEn, AV31Lb_Estado, GXv_objcol_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item8) ;
      GXt_objcol_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item7 = GXv_objcol_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item8[0] ;
      AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT = GXt_objcol_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item7 ;
      gx_BV71 = true ;
   }

   public void e232762( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV45WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV45WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV37ManageFiltersExecutionStep == 1 )
      {
         AV37ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ManageFiltersExecutionStep", GXutil.str( AV37ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV37ManageFiltersExecutionStep == 2 )
      {
         AV37ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ManageFiltersExecutionStep", GXutil.str( AV37ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV40Session.getValue("GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_SDT_WCColumnsSelector"), "") != 0 )
      {
         AV12ColumnsSelectorXML = AV40Session.getValue("GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_SDT_WCColumnsSelector") ;
         AV10ColumnsSelector.fromxml(AV12ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getVisible(), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Visible), 5, 0), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV10ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Visible), 5, 0), !bGXsfl_71_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV18GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18GridCurrentPage), 10, 0));
      AV19GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridPageCount), 10, 0));
      chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getInternalname(), "Columnheaderclass", chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getColumnHeaderClass(), !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Internalname, "Columnheaderclass", edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Columnheaderclass, !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Internalname, "Columnheaderclass", edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Columnheaderclass, !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Internalname, "Columnheaderclass", edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Columnheaderclass, !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Internalname, "Columnheaderclass", edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Columnheaderclass, !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Internalname, "Columnheaderclass", edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Columnheaderclass, !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Internalname, "Columnheaderclass", edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Columnheaderclass, !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Internalname, "Columnheaderclass", edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Columnheaderclass, !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Internalname, "Columnheaderclass", edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Columnheaderclass, !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Internalname, "Columnheaderclass", edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Columnheaderclass, !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Internalname, "Columnheaderclass", edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Columnheaderclass, !bGXsfl_71_Refreshing);
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Internalname, "Columnheaderclass", edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Columnheaderclass, !bGXsfl_71_Refreshing);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10ColumnsSelector", AV10ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV36ManageFiltersData", AV36ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20GridState", AV20GridState);
   }

   public void e122762( )
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

   public void e132762( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e242762( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.size() )
      {
         AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)) );
         chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setColumnClass( ((GXutil.strcmp(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)(AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem())).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs(), " ")!=0) ? "WWColumn WWColumnWarning WWColumnWarningFirstColumn" : "WWColumn") );
         edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Columnclass = ((GXutil.strcmp(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)(AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem())).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs(), " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Columnclass = ((GXutil.strcmp(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)(AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem())).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs(), " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Columnclass = ((GXutil.strcmp(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)(AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem())).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs(), " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Columnclass = ((GXutil.strcmp(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)(AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem())).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs(), " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Columnclass = ((GXutil.strcmp(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)(AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem())).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs(), " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Columnclass = ((GXutil.strcmp(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)(AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem())).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs(), " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Columnclass = ((GXutil.strcmp(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)(AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem())).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs(), " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Columnclass = ((GXutil.strcmp(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)(AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem())).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs(), " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Columnclass = ((GXutil.strcmp(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)(AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem())).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs(), " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Columnclass = ((GXutil.strcmp(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)(AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem())).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs(), " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Columnclass = ((GXutil.strcmp(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)(AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem())).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs(), " ")!=0) ? "WWColumn WWColumnWarning" : "WWColumn") ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(71) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_712( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_71_Refreshing )
         {
            httpContext.doAjaxLoad(71, GridRow);
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e142762( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV12ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV10ColumnsSelector.fromJSonString(AV12ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_SDT_WCColumnsSelector", ((GXutil.strcmp("", AV12ColumnsSelectorXML)==0) ? "" : AV10ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10ColumnsSelector", AV10ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV36ManageFiltersData", AV36ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20GridState", AV20GridState);
   }

   public void e112762( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_SDT_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV67Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV37ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ManageFiltersExecutionStep", GXutil.str( AV37ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_SDT_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV37ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ManageFiltersExecutionStep", GXutil.str( AV37ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV38ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_SDT_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         impresionlabdipenviados_y_o_aceptados_sdt_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV38ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV38ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV67Pgmname+"GridState", AV38ManageFiltersXml) ;
            AV20GridState.fromxml(AV38ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20GridState", AV20GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10ColumnsSelector", AV10ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV36ManageFiltersData", AV36ManageFiltersData);
   }

   public void e152762( )
   {
      AV53GXV1 = (int)(nGXsfl_71_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV53GXV1 > 0 ) && ( AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.size() >= AV53GXV1 ) )
      {
         AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)) );
      }
      /* 'Dolabdipcoste' Routine */
      returnInSub = false ;
      AV9Col_EnvioEnsayo.clear();
      AV68GXV15 = 1 ;
      while ( AV68GXV15 <= AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.size() )
      {
         AV25ImpresionLabDipEnviados_y_o_Aceptados_SDT_item = (app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV68GXV15));
         if ( AV25ImpresionLabDipEnviados_y_o_Aceptados_SDT_item.getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar() )
         {
            AV26IN_Lb_numero = AV25ImpresionLabDipEnviados_y_o_Aceptados_SDT_item.getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero() ;
            AV27IN_Lb_opcion = AV25ImpresionLabDipEnviados_y_o_Aceptados_SDT_item.getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion() ;
            AV46Item_EnvioEnsayo = (app.gestionlaboratorio.SdtEnviodeEnsayo_SDT)new app.gestionlaboratorio.SdtEnviodeEnsayo_SDT(remoteHandle, context);
            AV46Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_numero( AV26IN_Lb_numero );
            AV46Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_opcion( AV27IN_Lb_opcion );
            AV46Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz( AV25ImpresionLabDipEnviados_y_o_Aceptados_SDT_item.getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz() );
            AV46Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Coste( DecimalUtil.doubleToDec(0) );
            AV9Col_EnvioEnsayo.add(AV46Item_EnvioEnsayo, 0);
         }
         AV68GXV15 = (int)(AV68GXV15+1) ;
      }
      AV47Json_EnvioEnsayo = AV9Col_EnvioEnsayo.toJSonString(false) ;
      httpContext.popup(formatLink("app.gestionlaboratorio.rens023", new String[] {GXutil.URLEncode(GXutil.rtrim(AV14Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV8Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV29Lb_Cartaz)),GXutil.URLEncode(GXutil.formatDateParm(AV33Lb_FechaEn)),GXutil.URLEncode(DecimalUtil.decToString(AV48Lb_Rb)),GXutil.URLEncode(GXutil.rtrim(AV47Json_EnvioEnsayo))}, new String[] {"EmprCod","CliCod","Lb_cartaz","Lb_fechaen","Lb_rb","Json_EnvioEnsayo"}) , new Object[] {"AV14Emprcod","AV8Clicod","AV29Lb_Cartaz","AV33Lb_FechaEn","AV48Lb_Rb","AV47Json_EnvioEnsayo"});
      /*  Sending Event outputs  */
   }

   public void e162762( )
   {
      AV53GXV1 = (int)(nGXsfl_71_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV53GXV1 > 0 ) && ( AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.size() >= AV53GXV1 ) )
      {
         AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)) );
      }
      /* 'Dolabdip' Routine */
      returnInSub = false ;
      AV9Col_EnvioEnsayo.clear();
      AV69GXV16 = 1 ;
      while ( AV69GXV16 <= AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.size() )
      {
         AV25ImpresionLabDipEnviados_y_o_Aceptados_SDT_item = (app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV69GXV16));
         if ( AV25ImpresionLabDipEnviados_y_o_Aceptados_SDT_item.getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar() )
         {
            AV26IN_Lb_numero = AV25ImpresionLabDipEnviados_y_o_Aceptados_SDT_item.getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero() ;
            AV27IN_Lb_opcion = AV25ImpresionLabDipEnviados_y_o_Aceptados_SDT_item.getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion() ;
            AV46Item_EnvioEnsayo = (app.gestionlaboratorio.SdtEnviodeEnsayo_SDT)new app.gestionlaboratorio.SdtEnviodeEnsayo_SDT(remoteHandle, context);
            AV46Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_numero( AV26IN_Lb_numero );
            AV46Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_opcion( AV27IN_Lb_opcion );
            AV46Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Lb_cartaz( AV25ImpresionLabDipEnviados_y_o_Aceptados_SDT_item.getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz() );
            AV46Item_EnvioEnsayo.setgxTv_SdtEnviodeEnsayo_SDT_Coste( DecimalUtil.doubleToDec(0) );
            AV9Col_EnvioEnsayo.add(AV46Item_EnvioEnsayo, 0);
         }
         AV69GXV16 = (int)(AV69GXV16+1) ;
      }
      AV47Json_EnvioEnsayo = AV9Col_EnvioEnsayo.toJSonString(false) ;
      httpContext.popup(formatLink("app.gestionlaboratorio.rensm016", new String[] {GXutil.URLEncode(GXutil.rtrim(AV14Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV8Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV29Lb_Cartaz)),GXutil.URLEncode(GXutil.formatDateParm(AV33Lb_FechaEn)),GXutil.URLEncode(GXutil.rtrim(AV47Json_EnvioEnsayo))}, new String[] {"EmprCod","CliCod","Lb_cartaz","Lb_fechaen","Json_EnvioEnsayo"}) , new Object[] {"AV14Emprcod","AV8Clicod","AV29Lb_Cartaz","AV33Lb_FechaEn","AV47Json_EnvioEnsayo"});
      /*  Sending Event outputs  */
   }

   public void e172762( )
   {
      AV53GXV1 = (int)(nGXsfl_71_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV53GXV1 > 0 ) && ( AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.size() >= AV53GXV1 ) )
      {
         AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)) );
      }
      /* 'DoMarcarTodas' Routine */
      returnInSub = false ;
      AV44Var_seleccionar = true ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Var_seleccionar", AV44Var_seleccionar);
      /* Execute user subroutine: 'APLICOGRID' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT", AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT);
      nGXsfl_71_bak_idx = nGXsfl_71_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV37ManageFiltersExecutionStep, AV10ColumnsSelector, AV67Pgmname, AV17FilterFullText, AV14Emprcod, AV8Clicod, AV29Lb_Cartaz, AV30Lb_ColNom, AV35Lb_Numero, AV32Lb_FechaEfrom, AV34Lb_FechaEto, AV33Lb_FechaEn, AV31Lb_Estado, AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT, sPrefix) ;
      nGXsfl_71_idx = nGXsfl_71_bak_idx ;
      sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_712( ) ;
   }

   public void e182762( )
   {
      AV53GXV1 = (int)(nGXsfl_71_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV53GXV1 > 0 ) && ( AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.size() >= AV53GXV1 ) )
      {
         AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)) );
      }
      /* 'DoDesmarcarTodas' Routine */
      returnInSub = false ;
      AV44Var_seleccionar = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Var_seleccionar", AV44Var_seleccionar);
      /* Execute user subroutine: 'APLICOGRID' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT", AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT);
      nGXsfl_71_bak_idx = nGXsfl_71_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV37ManageFiltersExecutionStep, AV10ColumnsSelector, AV67Pgmname, AV17FilterFullText, AV14Emprcod, AV8Clicod, AV29Lb_Cartaz, AV30Lb_ColNom, AV35Lb_Numero, AV32Lb_FechaEfrom, AV34Lb_FechaEto, AV33Lb_FechaEn, AV31Lb_Estado, AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT, sPrefix) ;
      nGXsfl_71_idx = nGXsfl_71_bak_idx ;
      sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_712( ) ;
   }

   public void e192762( )
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

   public void e202762( )
   {
      AV53GXV1 = (int)(nGXsfl_71_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV53GXV1 > 0 ) && ( AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.size() >= AV53GXV1 ) )
      {
         AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV50ImpresionLabDipEnviados_y_o_Aceptados_SDT_json = AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.toJSonString(false) ;
      AV49websession.setValue("&ImpresionLabDipEnviados_y_o_Aceptados_SDT_json", AV50ImpresionLabDipEnviados_y_o_Aceptados_SDT_json);
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV15ErrorMessage ;
      new app.gestionlaboratorio.impresionlabdipenviados_y_o_aceptados_sdt_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      impresionlabdipenviados_y_o_aceptados_sdt_wc_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      impresionlabdipenviados_y_o_aceptados_sdt_wc_impl.this.AV15ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV15ErrorMessage);
      }
   }

   public void e212762( )
   {
      AV53GXV1 = (int)(nGXsfl_71_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV53GXV1 > 0 ) && ( AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.size() >= AV53GXV1 ) )
      {
         AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.currentItem( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)) );
      }
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV50ImpresionLabDipEnviados_y_o_Aceptados_SDT_json = AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.toJSonString(false) ;
      AV49websession.setValue("&ImpresionLabDipEnviados_y_o_Aceptados_SDT_json", AV50ImpresionLabDipEnviados_y_o_Aceptados_SDT_json);
      callWebObject(formatLink("app.gestionlaboratorio.impresionlabdipenviados_y_o_aceptados_sdt_wcexportcsv", new String[] {}, new String[] {}) );
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
      AV10ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ImpresionLabDipEnviados_y_o_Aceptados_SDT__Seleccionar", "", "Op", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_numero", "", "Nº de Ensayo", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ImpresionLabDipEnviados_y_o_Aceptados_SDT__Clicod", "", "Cliente", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_Artcod", "", "Articulo", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_colnomc", "", "Color Cliente", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_rb", "", "Rb", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_Opcion", "", "Opcion", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_numop", "", "# Opcion", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_Cartaz", "", "Coleccion", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_fechae", "", "Fecha Entrada", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_fechaen", "", "Fecha Envio", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_estado", "", "Estado", true, "") ;
      AV10ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV43UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_SDT_WCColumnsSelector", GXv_char4) ;
      impresionlabdipenviados_y_o_aceptados_sdt_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV43UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV43UserCustomValue)==0) ) )
      {
         AV11ColumnsSelectorAux.fromxml(AV43UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV11ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV10ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV11ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV10ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV36ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_SDT_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV36ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV17FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17FilterFullText", AV17FilterFullText);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV40Session.getValue(AV67Pgmname+"GridState"), "") == 0 )
      {
         AV20GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV67Pgmname+"GridState"), null, null);
      }
      else
      {
         AV20GridState.fromxml(AV40Session.getValue(AV67Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV20GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV20GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV20GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV70GXV17 = 1 ;
      while ( AV70GXV17 <= AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV70GXV17));
         if ( GXutil.strcmp(AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV17FilterFullText = AV21GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17FilterFullText", AV17FilterFullText);
         }
         AV70GXV17 = (int)(AV70GXV17+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV20GridState.fromxml(AV40Session.getValue(AV67Pgmname+"GridState"), null, null);
      AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV20GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV17FilterFullText)==0), (short)(0), AV17FilterFullText, "") ;
      AV20GridState = GXv_SdtWWPGridState14[0] ;
      if ( ! (GXutil.strcmp("", AV14Emprcod)==0) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV14Emprcod );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (0==AV8Clicod) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV8Clicod, 6, 0) );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV29Lb_Cartaz)==0) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_CARTAZ" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV29Lb_Cartaz );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV30Lb_ColNom)==0) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_COLNOM" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV30Lb_ColNom );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (0==AV35Lb_Numero) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_NUMERO" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV35Lb_Numero, 8, 0) );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32Lb_FechaEfrom)) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHAEFROM" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV32Lb_FechaEfrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34Lb_FechaEto)) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHAETO" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV34Lb_FechaEto, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33Lb_FechaEn)) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_FECHAEN" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV33Lb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      if ( ! (0==AV31Lb_Estado) )
      {
         AV21GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LB_ESTADO" );
         AV21GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV31Lb_Estado, 1, 0) );
         AV20GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV21GridStateFilterValue, 0);
      }
      AV20GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV20GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV67Pgmname+"GridState", AV20GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S182( )
   {
      /* 'APLICOGRID' Routine */
      returnInSub = false ;
      AV23i = (short)(1) ;
      while ( AV23i <= AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.size() )
      {
         ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV23i)).setgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar( GXutil.boolval( GXutil.booltostr( AV44Var_seleccionar)) );
         AV23i = (short)(AV23i+1) ;
      }
   }

   public void wb_table1_23_2762( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV36ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_2762( true) ;
      }
      else
      {
         wb_table2_28_2762( false) ;
      }
      return  ;
   }

   public void wb_table2_28_2762e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_2762e( true) ;
      }
      else
      {
         wb_table1_23_2762e( false) ;
      }
   }

   public void wb_table2_28_2762( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_71_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV17FilterFullText, GXutil.rtrim( localUtil.format( AV17FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_GestionLaboratorio\\ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_2762e( true) ;
      }
      else
      {
         wb_table2_28_2762e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV14Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Emprcod", AV14Emprcod);
      AV8Clicod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clicod), 6, 0));
      AV29Lb_Cartaz = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Lb_Cartaz", AV29Lb_Cartaz);
      AV30Lb_ColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Lb_ColNom", AV30Lb_ColNom);
      AV35Lb_Numero = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Lb_Numero), 8, 0));
      AV32Lb_FechaEfrom = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Lb_FechaEfrom", localUtil.format(AV32Lb_FechaEfrom, "99/99/99"));
      AV34Lb_FechaEto = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Lb_FechaEto", localUtil.format(AV34Lb_FechaEto, "99/99/99"));
      AV33Lb_FechaEn = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Lb_FechaEn", localUtil.format(AV33Lb_FechaEn, "99/99/99"));
      AV31Lb_Estado = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Lb_Estado", GXutil.str( AV31Lb_Estado, 1, 0));
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
      pa2762( ) ;
      ws2762( ) ;
      we2762( ) ;
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
      sCtrlAV14Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8Clicod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV29Lb_Cartaz = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV30Lb_ColNom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV35Lb_Numero = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV32Lb_FechaEfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV34Lb_FechaEto = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV33Lb_FechaEn = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV31Lb_Estado = (String)getParm(obj,8,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2762( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gestionlaboratorio\\impresionlabdipenviados_y_o_aceptados_sdt_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2762( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV14Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Emprcod", AV14Emprcod);
         AV8Clicod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clicod), 6, 0));
         AV29Lb_Cartaz = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Lb_Cartaz", AV29Lb_Cartaz);
         AV30Lb_ColNom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Lb_ColNom", AV30Lb_ColNom);
         AV35Lb_Numero = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Lb_Numero), 8, 0));
         AV32Lb_FechaEfrom = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Lb_FechaEfrom", localUtil.format(AV32Lb_FechaEfrom, "99/99/99"));
         AV34Lb_FechaEto = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Lb_FechaEto", localUtil.format(AV34Lb_FechaEto, "99/99/99"));
         AV33Lb_FechaEn = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Lb_FechaEn", localUtil.format(AV33Lb_FechaEn, "99/99/99"));
         AV31Lb_Estado = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Lb_Estado", GXutil.str( AV31Lb_Estado, 1, 0));
      }
      wcpOAV14Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV14Emprcod") ;
      wcpOAV8Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV29Lb_Cartaz = httpContext.cgiGet( sPrefix+"wcpOAV29Lb_Cartaz") ;
      wcpOAV30Lb_ColNom = httpContext.cgiGet( sPrefix+"wcpOAV30Lb_ColNom") ;
      wcpOAV35Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35Lb_Numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV32Lb_FechaEfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV32Lb_FechaEfrom"), 0) ;
      wcpOAV34Lb_FechaEto = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV34Lb_FechaEto"), 0) ;
      wcpOAV33Lb_FechaEn = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV33Lb_FechaEn"), 0) ;
      wcpOAV31Lb_Estado = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31Lb_Estado"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV14Emprcod, wcpOAV14Emprcod) != 0 ) || ( AV8Clicod != wcpOAV8Clicod ) || ( GXutil.strcmp(AV29Lb_Cartaz, wcpOAV29Lb_Cartaz) != 0 ) || ( GXutil.strcmp(AV30Lb_ColNom, wcpOAV30Lb_ColNom) != 0 ) || ( AV35Lb_Numero != wcpOAV35Lb_Numero ) || !( GXutil.dateCompare(GXutil.resetTime(AV32Lb_FechaEfrom), GXutil.resetTime(wcpOAV32Lb_FechaEfrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV34Lb_FechaEto), GXutil.resetTime(wcpOAV34Lb_FechaEto)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV33Lb_FechaEn), GXutil.resetTime(wcpOAV33Lb_FechaEn)) ) || ( AV31Lb_Estado != wcpOAV31Lb_Estado ) ) )
      {
         setjustcreated();
      }
      wcpOAV14Emprcod = AV14Emprcod ;
      wcpOAV8Clicod = AV8Clicod ;
      wcpOAV29Lb_Cartaz = AV29Lb_Cartaz ;
      wcpOAV30Lb_ColNom = AV30Lb_ColNom ;
      wcpOAV35Lb_Numero = AV35Lb_Numero ;
      wcpOAV32Lb_FechaEfrom = AV32Lb_FechaEfrom ;
      wcpOAV34Lb_FechaEto = AV34Lb_FechaEto ;
      wcpOAV33Lb_FechaEn = AV33Lb_FechaEn ;
      wcpOAV31Lb_Estado = AV31Lb_Estado ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV14Emprcod = httpContext.cgiGet( sPrefix+"AV14Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV14Emprcod) > 0 )
      {
         AV14Emprcod = httpContext.cgiGet( sCtrlAV14Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Emprcod", AV14Emprcod);
      }
      else
      {
         AV14Emprcod = httpContext.cgiGet( sPrefix+"AV14Emprcod_PARM") ;
      }
      sCtrlAV8Clicod = httpContext.cgiGet( sPrefix+"AV8Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV8Clicod) > 0 )
      {
         AV8Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clicod), 6, 0));
      }
      else
      {
         AV8Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV29Lb_Cartaz = httpContext.cgiGet( sPrefix+"AV29Lb_Cartaz_CTRL") ;
      if ( GXutil.len( sCtrlAV29Lb_Cartaz) > 0 )
      {
         AV29Lb_Cartaz = httpContext.cgiGet( sCtrlAV29Lb_Cartaz) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Lb_Cartaz", AV29Lb_Cartaz);
      }
      else
      {
         AV29Lb_Cartaz = httpContext.cgiGet( sPrefix+"AV29Lb_Cartaz_PARM") ;
      }
      sCtrlAV30Lb_ColNom = httpContext.cgiGet( sPrefix+"AV30Lb_ColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV30Lb_ColNom) > 0 )
      {
         AV30Lb_ColNom = httpContext.cgiGet( sCtrlAV30Lb_ColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Lb_ColNom", AV30Lb_ColNom);
      }
      else
      {
         AV30Lb_ColNom = httpContext.cgiGet( sPrefix+"AV30Lb_ColNom_PARM") ;
      }
      sCtrlAV35Lb_Numero = httpContext.cgiGet( sPrefix+"AV35Lb_Numero_CTRL") ;
      if ( GXutil.len( sCtrlAV35Lb_Numero) > 0 )
      {
         AV35Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV35Lb_Numero), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Lb_Numero), 8, 0));
      }
      else
      {
         AV35Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV35Lb_Numero_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV32Lb_FechaEfrom = httpContext.cgiGet( sPrefix+"AV32Lb_FechaEfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV32Lb_FechaEfrom) > 0 )
      {
         AV32Lb_FechaEfrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV32Lb_FechaEfrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Lb_FechaEfrom", localUtil.format(AV32Lb_FechaEfrom, "99/99/99"));
      }
      else
      {
         AV32Lb_FechaEfrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV32Lb_FechaEfrom_PARM"), 0) ;
      }
      sCtrlAV34Lb_FechaEto = httpContext.cgiGet( sPrefix+"AV34Lb_FechaEto_CTRL") ;
      if ( GXutil.len( sCtrlAV34Lb_FechaEto) > 0 )
      {
         AV34Lb_FechaEto = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV34Lb_FechaEto), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Lb_FechaEto", localUtil.format(AV34Lb_FechaEto, "99/99/99"));
      }
      else
      {
         AV34Lb_FechaEto = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV34Lb_FechaEto_PARM"), 0) ;
      }
      sCtrlAV33Lb_FechaEn = httpContext.cgiGet( sPrefix+"AV33Lb_FechaEn_CTRL") ;
      if ( GXutil.len( sCtrlAV33Lb_FechaEn) > 0 )
      {
         AV33Lb_FechaEn = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV33Lb_FechaEn), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Lb_FechaEn", localUtil.format(AV33Lb_FechaEn, "99/99/99"));
      }
      else
      {
         AV33Lb_FechaEn = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV33Lb_FechaEn_PARM"), 0) ;
      }
      sCtrlAV31Lb_Estado = httpContext.cgiGet( sPrefix+"AV31Lb_Estado_CTRL") ;
      if ( GXutil.len( sCtrlAV31Lb_Estado) > 0 )
      {
         AV31Lb_Estado = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV31Lb_Estado), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Lb_Estado", GXutil.str( AV31Lb_Estado, 1, 0));
      }
      else
      {
         AV31Lb_Estado = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV31Lb_Estado_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa2762( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2762( ) ;
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
      ws2762( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14Emprcod_PARM", GXutil.rtrim( AV14Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14Emprcod_CTRL", GXutil.rtrim( sCtrlAV14Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV8Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Clicod_CTRL", GXutil.rtrim( sCtrlAV8Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29Lb_Cartaz_PARM", GXutil.rtrim( AV29Lb_Cartaz));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29Lb_Cartaz)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29Lb_Cartaz_CTRL", GXutil.rtrim( sCtrlAV29Lb_Cartaz));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Lb_ColNom_PARM", GXutil.rtrim( AV30Lb_ColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30Lb_ColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Lb_ColNom_CTRL", GXutil.rtrim( sCtrlAV30Lb_ColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35Lb_Numero_PARM", GXutil.ltrim( localUtil.ntoc( AV35Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35Lb_Numero)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35Lb_Numero_CTRL", GXutil.rtrim( sCtrlAV35Lb_Numero));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Lb_FechaEfrom_PARM", localUtil.dtoc( AV32Lb_FechaEfrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32Lb_FechaEfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Lb_FechaEfrom_CTRL", GXutil.rtrim( sCtrlAV32Lb_FechaEfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Lb_FechaEto_PARM", localUtil.dtoc( AV34Lb_FechaEto, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34Lb_FechaEto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Lb_FechaEto_CTRL", GXutil.rtrim( sCtrlAV34Lb_FechaEto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Lb_FechaEn_PARM", localUtil.dtoc( AV33Lb_FechaEn, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33Lb_FechaEn)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Lb_FechaEn_CTRL", GXutil.rtrim( sCtrlAV33Lb_FechaEn));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31Lb_Estado_PARM", GXutil.ltrim( localUtil.ntoc( AV31Lb_Estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31Lb_Estado)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31Lb_Estado_CTRL", GXutil.rtrim( sCtrlAV31Lb_Estado));
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
      we2762( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115552572", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/impresionlabdipenviados_y_o_aceptados_sdt_wc.js", "?202682115552573", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_712( )
   {
      chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setInternalname( sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__SELECCIONAR_"+sGXsfl_71_idx );
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMERO_"+sGXsfl_71_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__CLICOD_"+sGXsfl_71_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ARTCOD_"+sGXsfl_71_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_COLNOMC_"+sGXsfl_71_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_RB_"+sGXsfl_71_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_OPCION_"+sGXsfl_71_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMOP_"+sGXsfl_71_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_CARTAZ_"+sGXsfl_71_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAE_"+sGXsfl_71_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAEN_"+sGXsfl_71_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ESTADO_"+sGXsfl_71_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__OBS_"+sGXsfl_71_idx ;
   }

   public void subsflControlProps_fel_712( )
   {
      chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setInternalname( sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__SELECCIONAR_"+sGXsfl_71_fel_idx );
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMERO_"+sGXsfl_71_fel_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__CLICOD_"+sGXsfl_71_fel_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ARTCOD_"+sGXsfl_71_fel_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_COLNOMC_"+sGXsfl_71_fel_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_RB_"+sGXsfl_71_fel_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_OPCION_"+sGXsfl_71_fel_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMOP_"+sGXsfl_71_fel_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_CARTAZ_"+sGXsfl_71_fel_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAE_"+sGXsfl_71_fel_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAEN_"+sGXsfl_71_fel_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ESTADO_"+sGXsfl_71_fel_idx ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__OBS_"+sGXsfl_71_fel_idx ;
   }

   public void sendrow_712( )
   {
      subsflControlProps_712( ) ;
      wb2760( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_71_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_71_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_71_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getEnabled()!=0)&&(chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 72,'"+sPrefix+"',false,'"+sGXsfl_71_idx+"',71)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__SELECCIONAR_" + sGXsfl_71_idx ;
         chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setName( GXCCtl );
         chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setWebtags( "" );
         chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getInternalname(), "TitleCaption", chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getCaption(), !bGXsfl_71_Refreshing);
         chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Seleccionar()),"","",Integer.valueOf(chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getColumnClass(),chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getColumnHeaderClass(),TempTags+" onclick="+"\"gx.fn.checkboxClick(72, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getEnabled()!=0)&&(chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,72);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numero()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Columnclass,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Columnheaderclass,Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Visible),Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Columnclass,edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Columnheaderclass,Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Visible),Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_artcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Columnclass,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Columnheaderclass,Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Visible),Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_colnomc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Columnclass,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Columnheaderclass,Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Visible),Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb(), (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Enabled!=0) ? localUtil.format( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb(), "ZZZ9.99") : localUtil.format( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_rb(), "ZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Columnclass,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Columnheaderclass,Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Visible),Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion()),GXutil.rtrim( localUtil.format( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_opcion(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Columnclass,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Columnheaderclass,Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Visible),Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numop(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numop()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_numop()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Columnclass,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Columnheaderclass,Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Visible),Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_cartaz()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Columnclass,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Columnheaderclass,Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Visible),Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Internalname,localUtil.format(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae(), "99/99/99"),localUtil.format( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechae(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Columnclass,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Columnheaderclass,Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Visible),Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Internalname,localUtil.format(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen(), "99/99/99"),localUtil.format( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_fechaen(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Columnclass,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Columnheaderclass,Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Visible),Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_estado(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_estado()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Lb_estado()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Columnclass,edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Columnheaderclass,Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Visible),Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item)AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item_Obs()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2762( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_71_idx = ((subGrid_Islastpage==1)&&(nGXsfl_71_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_71_idx+1) ;
         sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_712( ) ;
      }
      /* End function sendrow_712 */
   }

   public void startgridcontrol71( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"71\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº de Ensayo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Opcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "# Opcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnlabdip_Internalname = sPrefix+"BTNLABDIP" ;
      bttBtnmarcartodas_Internalname = sPrefix+"BTNMARCARTODAS" ;
      bttBtndesmarcartodas_Internalname = sPrefix+"BTNDESMARCARTODAS" ;
      bttBtncancelar_Internalname = sPrefix+"BTNCANCELAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      bttBtnlabdipcoste_Internalname = sPrefix+"BTNLABDIPCOSTE" ;
      lblTextblocklb_rb_Internalname = sPrefix+"TEXTBLOCKLB_RB" ;
      edtavLb_rb_Internalname = sPrefix+"vLB_RB" ;
      divUnnamedtablelb_rb_Internalname = sPrefix+"UNNAMEDTABLELB_RB" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE2" ;
      chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setInternalname( sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__SELECCIONAR" );
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMERO" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__CLICOD" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ARTCOD" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_COLNOMC" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_RB" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_OPCION" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMOP" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_CARTAZ" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAE" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAEN" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ESTADO" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Internalname = sPrefix+"IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__OBS" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Jsonclick = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Jsonclick = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Columnheaderclass = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Columnclass = "WWColumn" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Jsonclick = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Columnheaderclass = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Columnclass = "WWColumn" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Jsonclick = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Columnheaderclass = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Columnclass = "WWColumn" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Jsonclick = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Columnheaderclass = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Columnclass = "WWColumn" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Jsonclick = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Columnheaderclass = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Columnclass = "WWColumn" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Jsonclick = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Columnheaderclass = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Columnclass = "WWColumn" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Jsonclick = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Columnheaderclass = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Columnclass = "WWColumn" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Jsonclick = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Columnheaderclass = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Columnclass = "WWColumn" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Jsonclick = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Columnheaderclass = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Columnclass = "WWColumn" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Jsonclick = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Columnheaderclass = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Columnclass = "WWColumn" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Jsonclick = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Columnheaderclass = "" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Columnclass = "WWColumn" ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Visible = -1 ;
      chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setCaption( "" );
      chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setColumnHeaderClass( "" );
      chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setColumnClass( "WWColumn" );
      chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setEnabled( 1 );
      chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setVisible( -1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Visible = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Visible = -1 ;
      chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Enabled = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Enabled = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Enabled = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Enabled = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Enabled = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Enabled = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Enabled = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Enabled = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Enabled = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Enabled = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Enabled = -1 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavLb_rb_Jsonclick = "" ;
      edtavLb_rb_Enabled = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "|||||||||||" ;
      Ddo_grid_Columnids = "0:ImpresionLabDipEnviados_y_o_Aceptados_SDT__Seleccionar|1:ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_numero|2:ImpresionLabDipEnviados_y_o_Aceptados_SDT__Clicod|3:ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_Artcod|4:ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_colnomc|5:ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_rb|6:ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_Opcion|7:ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_numop|8:ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_Cartaz|9:ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_fechae|10:ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_fechaen|11:ImpresionLabDipEnviados_y_o_Aceptados_SDT__Lb_estado" ;
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
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Lab Dip con Coste", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
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
      GXCCtl = "IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__SELECCIONAR_" + sGXsfl_71_idx ;
      chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setName( GXCCtl );
      chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setWebtags( "" );
      chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getInternalname(), "TitleCaption", chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.getCaption(), !bGXsfl_71_Refreshing);
      chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT',fld:'vIMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT',grid:71,pic:''},{av:'nGXsfl_71_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:71},{av:'nRC_GXsfl_71',ctrl:'GRID',prop:'GridRC',grid:71},{av:'sPrefix'},{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV14Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV30Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV35Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV32Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV34Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV33Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV31Lb_Estado',fld:'vLB_ESTADO',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__CLICOD',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ARTCOD',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_COLNOMC',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_RB',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_OPCION',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMOP',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAE',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ESTADO',prop:'Visible'},{av:'AV18GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV19GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__SELECCIONAR',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMERO',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__CLICOD',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ARTCOD',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_COLNOMC',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_RB',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_OPCION',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMOP',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_CARTAZ',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAE',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAEN',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ESTADO',prop:'Columnheaderclass'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV20GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122762',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV14Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV30Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV35Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV32Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV34Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV33Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV31Lb_Estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT',fld:'vIMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT',grid:71,pic:''},{av:'nGXsfl_71_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:71},{av:'nRC_GXsfl_71',ctrl:'GRID',prop:'GridRC',grid:71},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132762',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV14Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV30Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV35Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV32Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV34Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV33Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV31Lb_Estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT',fld:'vIMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT',grid:71,pic:''},{av:'nGXsfl_71_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:71},{av:'nRC_GXsfl_71',ctrl:'GRID',prop:'GridRC',grid:71},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e242762',iparms:[{av:'AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT',fld:'vIMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT',grid:71,pic:''},{av:'nGXsfl_71_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:71},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_71',ctrl:'GRID',prop:'GridRC',grid:71}]");
      setEventMetadata("GRID.LOAD",",oparms:[{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__SELECCIONAR',prop:'Columnclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMERO',prop:'Columnclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__CLICOD',prop:'Columnclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ARTCOD',prop:'Columnclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_COLNOMC',prop:'Columnclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_RB',prop:'Columnclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_OPCION',prop:'Columnclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMOP',prop:'Columnclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_CARTAZ',prop:'Columnclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAE',prop:'Columnclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAEN',prop:'Columnclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ESTADO',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e142762',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV14Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV30Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV35Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV32Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV34Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV33Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV31Lb_Estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT',fld:'vIMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT',grid:71,pic:''},{av:'nGXsfl_71_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:71},{av:'nRC_GXsfl_71',ctrl:'GRID',prop:'GridRC',grid:71},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__CLICOD',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ARTCOD',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_COLNOMC',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_RB',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_OPCION',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMOP',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAE',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ESTADO',prop:'Visible'},{av:'AV18GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV19GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__SELECCIONAR',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMERO',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__CLICOD',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ARTCOD',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_COLNOMC',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_RB',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_OPCION',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMOP',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_CARTAZ',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAE',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAEN',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ESTADO',prop:'Columnheaderclass'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV20GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e112762',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV14Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV30Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV35Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV32Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV34Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV33Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV31Lb_Estado',fld:'vLB_ESTADO',pic:'9'},{av:'AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT',fld:'vIMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT',grid:71,pic:''},{av:'nGXsfl_71_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:71},{av:'nRC_GXsfl_71',ctrl:'GRID',prop:'GridRC',grid:71},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV20GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20GridState',fld:'vGRIDSTATE',pic:''},{av:'AV17FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMERO',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__CLICOD',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ARTCOD',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_COLNOMC',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_RB',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_OPCION',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMOP',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_CARTAZ',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAE',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAEN',prop:'Visible'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ESTADO',prop:'Visible'},{av:'AV18GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV19GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__SELECCIONAR',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMERO',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__CLICOD',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ARTCOD',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_COLNOMC',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_RB',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_OPCION',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_NUMOP',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_CARTAZ',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAE',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_FECHAEN',prop:'Columnheaderclass'},{ctrl:'IMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT__LB_ESTADO',prop:'Columnheaderclass'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOLABDIPCOSTE'","{handler:'e152762',iparms:[{av:'AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT',fld:'vIMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT',grid:71,pic:''},{av:'nGXsfl_71_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:71},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_71',ctrl:'GRID',prop:'GridRC',grid:71},{av:'AV14Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV33Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV48Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'}]");
      setEventMetadata("'DOLABDIPCOSTE'",",oparms:[{av:'AV48Lb_Rb',fld:'vLB_RB',pic:'ZZZ9.99'},{av:'AV33Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV29Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV14Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOLABDIP'","{handler:'e162762',iparms:[{av:'AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT',fld:'vIMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT',grid:71,pic:''},{av:'nGXsfl_71_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:71},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_71',ctrl:'GRID',prop:'GridRC',grid:71},{av:'AV14Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV33Lb_FechaEn',fld:'vLB_FECHAEN',pic:''}]");
      setEventMetadata("'DOLABDIP'",",oparms:[{av:'AV33Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV29Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV14Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOMARCARTODAS'","{handler:'e172762',iparms:[{av:'AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT',fld:'vIMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT',grid:71,pic:''},{av:'nGXsfl_71_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:71},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_71',ctrl:'GRID',prop:'GridRC',grid:71},{av:'AV44Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV14Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV30Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV35Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV32Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV34Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV33Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV31Lb_Estado',fld:'vLB_ESTADO',pic:'9'}]");
      setEventMetadata("'DOMARCARTODAS'",",oparms:[{av:'AV44Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT',fld:'vIMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT',grid:71,pic:''},{av:'nGXsfl_71_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:71},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_71',ctrl:'GRID',prop:'GridRC',grid:71}]}");
      setEventMetadata("'DODESMARCARTODAS'","{handler:'e182762',iparms:[{av:'AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT',fld:'vIMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT',grid:71,pic:''},{av:'nGXsfl_71_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:71},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_71',ctrl:'GRID',prop:'GridRC',grid:71},{av:'AV44Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV37ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV14Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29Lb_Cartaz',fld:'vLB_CARTAZ',pic:''},{av:'AV30Lb_ColNom',fld:'vLB_COLNOM',pic:''},{av:'AV35Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV32Lb_FechaEfrom',fld:'vLB_FECHAEFROM',pic:''},{av:'AV34Lb_FechaEto',fld:'vLB_FECHAETO',pic:''},{av:'AV33Lb_FechaEn',fld:'vLB_FECHAEN',pic:''},{av:'AV31Lb_Estado',fld:'vLB_ESTADO',pic:'9'}]");
      setEventMetadata("'DODESMARCARTODAS'",",oparms:[{av:'AV44Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT',fld:'vIMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT',grid:71,pic:''},{av:'nGXsfl_71_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:71},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_71',ctrl:'GRID',prop:'GridRC',grid:71}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e192762',iparms:[]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e202762',iparms:[{av:'AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT',fld:'vIMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT',grid:71,pic:''},{av:'nGXsfl_71_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:71},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_71',ctrl:'GRID',prop:'GridRC',grid:71}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e212762',iparms:[{av:'AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT',fld:'vIMPRESIONLABDIPENVIADOS_Y_O_ACEPTADOS_SDT',grid:71,pic:''},{av:'nGXsfl_71_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:71},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_71',ctrl:'GRID',prop:'GridRC',grid:71}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv14',iparms:[]");
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
      wcpOAV14Emprcod = "" ;
      wcpOAV29Lb_Cartaz = "" ;
      wcpOAV30Lb_ColNom = "" ;
      wcpOAV32Lb_FechaEfrom = GXutil.nullDate() ;
      wcpOAV34Lb_FechaEto = GXutil.nullDate() ;
      wcpOAV33Lb_FechaEn = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV14Emprcod = "" ;
      AV29Lb_Cartaz = "" ;
      AV30Lb_ColNom = "" ;
      AV32Lb_FechaEfrom = GXutil.nullDate() ;
      AV34Lb_FechaEto = GXutil.nullDate() ;
      AV33Lb_FechaEn = GXutil.nullDate() ;
      AV10ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV67Pgmname = "" ;
      AV17FilterFullText = "" ;
      AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT = new GXBaseCollection<app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item>(app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV36ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV13DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV20GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      bttBtnlabdip_Jsonclick = "" ;
      bttBtnmarcartodas_Jsonclick = "" ;
      bttBtndesmarcartodas_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      bttBtnlabdipcoste_Jsonclick = "" ;
      lblTextblocklb_rb_Jsonclick = "" ;
      AV48Lb_Rb = DecimalUtil.ZERO ;
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
      AV6Station = "" ;
      GXv_char2 = new String[1] ;
      AV5EmprNom = "" ;
      AV7UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXt_objcol_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item7 = new GXBaseCollection<app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item>(app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item8 = new GXBaseCollection[1] ;
      AV45WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV40Session = httpContext.getWebSession();
      AV12ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV38ManageFiltersXml = "" ;
      AV9Col_EnvioEnsayo = new GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayo_SDT>(app.gestionlaboratorio.SdtEnviodeEnsayo_SDT.class, "EnviodeEnsayo_SDT", "TexplusNET", remoteHandle);
      AV25ImpresionLabDipEnviados_y_o_Aceptados_SDT_item = new app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item(remoteHandle, context);
      AV27IN_Lb_opcion = "" ;
      AV46Item_EnvioEnsayo = new app.gestionlaboratorio.SdtEnviodeEnsayo_SDT(remoteHandle, context);
      AV47Json_EnvioEnsayo = "" ;
      AV50ImpresionLabDipEnviados_y_o_Aceptados_SDT_json = "" ;
      AV49websession = httpContext.getWebSession();
      AV16ExcelFilename = "" ;
      AV15ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV43UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV11ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV21GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV14Emprcod = "" ;
      sCtrlAV8Clicod = "" ;
      sCtrlAV29Lb_Cartaz = "" ;
      sCtrlAV30Lb_ColNom = "" ;
      sCtrlAV35Lb_Numero = "" ;
      sCtrlAV32Lb_FechaEfrom = "" ;
      sCtrlAV34Lb_FechaEto = "" ;
      sCtrlAV33Lb_FechaEn = "" ;
      sCtrlAV31Lb_Estado = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV67Pgmname = "GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC" ;
      /* GeneXus formulas. */
      AV67Pgmname = "GestionLaboratorio.ImpresionLabDipEnviados_y_o_Aceptados_SDT_WC" ;
      Gx_err = (short)(0) ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Enabled = 0 ;
      edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV31Lb_Estado ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV31Lb_Estado ;
   private byte AV37ManageFiltersExecutionStep ;
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
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV23i ;
   private int wcpOAV8Clicod ;
   private int wcpOAV35Lb_Numero ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_71 ;
   private int AV8Clicod ;
   private int AV35Lb_Numero ;
   private int nGXsfl_71_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavLb_rb_Enabled ;
   private int AV53GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Enabled ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Enabled ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Enabled ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Enabled ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Enabled ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Enabled ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Enabled ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Enabled ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Enabled ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Enabled ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Enabled ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_71_fel_idx=1 ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Visible ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Visible ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Visible ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Visible ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Visible ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Visible ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Visible ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Visible ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Visible ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Visible ;
   private int edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Visible ;
   private int AV39PageToGo ;
   private int AV68GXV15 ;
   private int AV26IN_Lb_numero ;
   private int AV69GXV16 ;
   private int nGXsfl_71_bak_idx=1 ;
   private int AV70GXV17 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV18GridCurrentPage ;
   private long AV19GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV48Lb_Rb ;
   private String wcpOAV14Emprcod ;
   private String wcpOAV29Lb_Cartaz ;
   private String wcpOAV30Lb_ColNom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV14Emprcod ;
   private String AV29Lb_Cartaz ;
   private String AV30Lb_ColNom ;
   private String sGXsfl_71_idx="0001" ;
   private String AV67Pgmname ;
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
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
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
   private String divUnnamedtable1_Internalname ;
   private String bttBtnlabdip_Internalname ;
   private String bttBtnlabdip_Jsonclick ;
   private String bttBtnmarcartodas_Internalname ;
   private String bttBtnmarcartodas_Jsonclick ;
   private String bttBtndesmarcartodas_Internalname ;
   private String bttBtndesmarcartodas_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnlabdipcoste_Internalname ;
   private String bttBtnlabdipcoste_Jsonclick ;
   private String divUnnamedtablelb_rb_Internalname ;
   private String lblTextblocklb_rb_Internalname ;
   private String lblTextblocklb_rb_Jsonclick ;
   private String edtavLb_rb_Internalname ;
   private String edtavLb_rb_Jsonclick ;
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
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Internalname ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Internalname ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Internalname ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Internalname ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Internalname ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Internalname ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Internalname ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Internalname ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Internalname ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Internalname ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Internalname ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Internalname ;
   private String sGXsfl_71_fel_idx="0001" ;
   private String hsh ;
   private String AV6Station ;
   private String GXv_char2[] ;
   private String AV5EmprNom ;
   private String AV7UsurCod ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Columnheaderclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Columnheaderclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Columnheaderclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Columnheaderclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Columnheaderclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Columnheaderclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Columnheaderclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Columnheaderclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Columnheaderclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Columnheaderclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Columnheaderclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Columnclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Columnclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Columnclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Columnclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Columnclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Columnclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Columnclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Columnclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Columnclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Columnclass ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Columnclass ;
   private String AV27IN_Lb_opcion ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV14Emprcod ;
   private String sCtrlAV8Clicod ;
   private String sCtrlAV29Lb_Cartaz ;
   private String sCtrlAV30Lb_ColNom ;
   private String sCtrlAV35Lb_Numero ;
   private String sCtrlAV32Lb_FechaEfrom ;
   private String sCtrlAV34Lb_FechaEto ;
   private String sCtrlAV33Lb_FechaEn ;
   private String sCtrlAV31Lb_Estado ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numero_Jsonclick ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__clicod_Jsonclick ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_artcod_Jsonclick ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_colnomc_Jsonclick ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_rb_Jsonclick ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_opcion_Jsonclick ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_numop_Jsonclick ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_cartaz_Jsonclick ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechae_Jsonclick ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_fechaen_Jsonclick ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__lb_estado_Jsonclick ;
   private String edtavImpresionlabdipenviados_y_o_aceptados_sdt__obs_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV32Lb_FechaEfrom ;
   private java.util.Date wcpOAV34Lb_FechaEto ;
   private java.util.Date wcpOAV33Lb_FechaEn ;
   private java.util.Date AV32Lb_FechaEfrom ;
   private java.util.Date AV34Lb_FechaEto ;
   private java.util.Date AV33Lb_FechaEn ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV44Var_seleccionar ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
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
   private boolean bGXsfl_71_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV71 ;
   private boolean gx_refresh_fired ;
   private String AV12ColumnsSelectorXML ;
   private String AV38ManageFiltersXml ;
   private String AV50ImpresionLabDipEnviados_y_o_Aceptados_SDT_json ;
   private String AV43UserCustomValue ;
   private String AV17FilterFullText ;
   private String AV47Json_EnvioEnsayo ;
   private String AV16ExcelFilename ;
   private String AV15ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV40Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavImpresionlabdipenviados_y_o_aceptados_sdt__seleccionar ;
   private com.genexus.webpanels.WebSession AV49websession ;
   private GXBaseCollection<app.gestionlaboratorio.SdtEnviodeEnsayo_SDT> AV9Col_EnvioEnsayo ;
   private GXBaseCollection<app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item> AV24ImpresionLabDipEnviados_y_o_Aceptados_SDT ;
   private GXBaseCollection<app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item> GXt_objcol_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item7 ;
   private GXBaseCollection<app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item> GXv_objcol_SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item8[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV36ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.gestionlaboratorio.SdtEnviodeEnsayo_SDT AV46Item_EnvioEnsayo ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV10ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV11ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV13DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV20GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV21GridStateFilterValue ;
   private app.gestionlaboratorio.SdtImpresionLabDipEnviados_y_o_Aceptados_SDT_Item AV25ImpresionLabDipEnviados_y_o_Aceptados_SDT_item ;
   private app.wwpbaseobjects.SdtWWPContext AV45WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

