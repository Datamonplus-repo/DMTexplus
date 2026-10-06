package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetastinteprocesosquimicos_wp_impl extends GXDataArea
{
   public recetastinteprocesosquimicos_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetastinteprocesosquimicos_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetastinteprocesosquimicos_wp_impl.class ));
   }

   public recetastinteprocesosquimicos_wp_impl( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavRecetastinteprocesosquimicos_sdts__eliminar = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridrecetastinteprocesosquimicos_sdts") == 0 )
         {
            gxnrgridrecetastinteprocesosquimicos_sdts_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridrecetastinteprocesosquimicos_sdts") == 0 )
         {
            gxgrgridrecetastinteprocesosquimicos_sdts_refresh_invoke( ) ;
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
            AV7Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
               AV10Forser = httpContext.GetPar( "Forser") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10Forser", AV10Forser);
               AV8Forcolnom = httpContext.GetPar( "Forcolnom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Forcolnom", AV8Forcolnom);
               AV9Forcolnum = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Forcolnum), 6, 0));
               AV20Tipcolcod = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Tipcolcod), 2, 0));
               AV19RecetasTinteProcesosQuimicosToJson = httpContext.GetPar( "RecetasTinteProcesosQuimicosToJson") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19RecetasTinteProcesosQuimicosToJson", AV19RecetasTinteProcesosQuimicosToJson);
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridrecetastinteprocesosquimicos_sdts_newrow_invoke( )
   {
      nRC_GXsfl_23 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_23"))) ;
      nGXsfl_23_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_23_idx"))) ;
      sGXsfl_23_idx = httpContext.GetPar( "sGXsfl_23_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridrecetastinteprocesosquimicos_sdts_newrow( ) ;
      /* End function gxnrGridrecetastinteprocesosquimicos_sdts_newrow_invoke */
   }

   public void gxgrgridrecetastinteprocesosquimicos_sdts_refresh_invoke( )
   {
      subGridrecetastinteprocesosquimicos_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridrecetastinteprocesosquimicos_sdts_Rows"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridrecetastinteprocesosquimicos_sdts_refresh( subGridrecetastinteprocesosquimicos_sdts_Rows) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridrecetastinteprocesosquimicos_sdts_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpage");
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
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
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      pa1G22( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1G22( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetastinteprocesosquimicos_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV10Forser)),GXutil.URLEncode(GXutil.rtrim(AV8Forcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV9Forcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20Tipcolcod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV19RecetasTinteProcesosQuimicosToJson))}, new String[] {"Emprcod","Clicod","Forser","Forcolnom","Forcolnum","Tipcolcod","RecetasTinteProcesosQuimicosToJson"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Recetastinteprocesosquimicos_sdts", AV18RecetasTinteProcesosQuimicos_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Recetastinteprocesosquimicos_sdts", AV18RecetasTinteProcesosQuimicos_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_23", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_23, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vRECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD_DATA", AV28RecetasTinteProcesosQuimicos_SDTs__Proforcod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vRECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD_DATA", AV28RecetasTinteProcesosQuimicos_SDTs__Proforcod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vRECETASTINTEPROCESOSQUIMICOS_SDTS", AV18RecetasTinteProcesosQuimicos_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vRECETASTINTEPROCESOSQUIMICOS_SDTS", AV18RecetasTinteProcesosQuimicos_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV20Tipcolcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV9Forcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNOM", GXutil.rtrim( AV8Forcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORSER", GXutil.rtrim( AV10Forser));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV6Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECETASTINTEPROCESOSQUIMICOSTOJSON", AV19RecetasTinteProcesosQuimicosToJson);
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridrecetastinteprocesosquimicos_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD_Cls", GXutil.rtrim( Combo_recetastinteprocesosquimicos_sdts__proforcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_recetastinteprocesosquimicos_sdts__proforcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD_Isgriditem", GXutil.booltostr( Combo_recetastinteprocesosquimicos_sdts__proforcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD_Emptyitem", GXutil.booltostr( Combo_recetastinteprocesosquimicos_sdts__proforcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridrecetastinteprocesosquimicos_sdts_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_EMPOWERER_Infinitescrolling", GXutil.rtrim( Gridrecetastinteprocesosquimicos_sdts_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Result));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
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
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we1G22( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1G22( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.recetastinteprocesosquimicos_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV10Forser)),GXutil.URLEncode(GXutil.rtrim(AV8Forcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV9Forcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20Tipcolcod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV19RecetasTinteProcesosQuimicosToJson))}, new String[] {"Emprcod","Clicod","Forser","Forcolnom","Forcolnum","Tipcolcod","RecetasTinteProcesosQuimicosToJson"})  ;
   }

   public String getPgmname( )
   {
      return "RecetasTinteProcesosQuimicos_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recetas Tinte( Procesos Quimicos)", "") ;
   }

   public void wb1G20( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnadd_Internalname, "gx.evt.setGridEvt("+GXutil.str( 23, 2, 0)+","+"null"+");", httpContext.getMessage( "Agregar nuevo proceso", ""), bttBtnadd_Jsonclick, 5, httpContext.getMessage( "Agregar nuevo proceso", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOADD\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasTinteProcesosQuimicos_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridrecetastinteprocesosquimicos_sdtsContainer.SetWrapped(nGXWrapped);
         startgridcontrol23( ) ;
      }
      if ( wbEnd == 23 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_23 = (int)(nGXsfl_23_idx-1) ;
         if ( Gridrecetastinteprocesosquimicos_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF", GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF);
            Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage", GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage);
            AV32GXV1 = nGXsfl_23_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Gridrecetastinteprocesosquimicos_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridrecetastinteprocesosquimicos_sdts", Gridrecetastinteprocesosquimicos_sdtsContainer, subGridrecetastinteprocesosquimicos_sdts_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridrecetastinteprocesosquimicos_sdtsContainerData", Gridrecetastinteprocesosquimicos_sdtsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridrecetastinteprocesosquimicos_sdtsContainerData"+"V", Gridrecetastinteprocesosquimicos_sdtsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridrecetastinteprocesosquimicos_sdtsContainerData"+"V"+"\" value='"+Gridrecetastinteprocesosquimicos_sdtsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarproceso_Internalname, "gx.evt.setGridEvt("+GXutil.str( 23, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar", ""), bttBtneliminarproceso_Jsonclick, 7, httpContext.getMessage( "Eliminar Proceso", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111g21_client"+"'", TempTags, "", 2, "HLP_RecetasTinteProcesosQuimicos_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnreordenarprocesos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 23, 2, 0)+","+"null"+");", httpContext.getMessage( "Reordenar", ""), bttBtnreordenarprocesos_Jsonclick, 5, httpContext.getMessage( "Reordenar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOREORDENARPROCESOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasTinteProcesosQuimicos_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 23, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasTinteProcesosQuimicos_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 23, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasTinteProcesosQuimicos_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         ucCombo_recetastinteprocesosquimicos_sdts__proforcod.setProperty("Caption", Combo_recetastinteprocesosquimicos_sdts__proforcod_Caption);
         ucCombo_recetastinteprocesosquimicos_sdts__proforcod.setProperty("Cls", Combo_recetastinteprocesosquimicos_sdts__proforcod_Cls);
         ucCombo_recetastinteprocesosquimicos_sdts__proforcod.setProperty("IsGridItem", Combo_recetastinteprocesosquimicos_sdts__proforcod_Isgriditem);
         ucCombo_recetastinteprocesosquimicos_sdts__proforcod.setProperty("EmptyItem", Combo_recetastinteprocesosquimicos_sdts__proforcod_Emptyitem);
         ucCombo_recetastinteprocesosquimicos_sdts__proforcod.setProperty("DropDownOptionsData", AV28RecetasTinteProcesosQuimicos_SDTs__Proforcod_Data);
         ucCombo_recetastinteprocesosquimicos_sdts__proforcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_recetastinteprocesosquimicos_sdts__proforcod_Internalname, "COMBO_RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCODContainer");
         wb_table1_52_1G22( true) ;
      }
      else
      {
         wb_table1_52_1G22( false) ;
      }
      return  ;
   }

   public void wb_table1_52_1G22e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGridrecetastinteprocesosquimicos_sdts_empowerer.setProperty("InfiniteScrolling", Gridrecetastinteprocesosquimicos_sdts_empowerer_Infinitescrolling);
         ucGridrecetastinteprocesosquimicos_sdts_empowerer.render(context, "wwp.gridempowerer", Gridrecetastinteprocesosquimicos_sdts_empowerer_Internalname, "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 23 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Gridrecetastinteprocesosquimicos_sdtsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF", GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF);
               Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage", GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage);
               AV32GXV1 = nGXsfl_23_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Gridrecetastinteprocesosquimicos_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridrecetastinteprocesosquimicos_sdts", Gridrecetastinteprocesosquimicos_sdtsContainer, subGridrecetastinteprocesosquimicos_sdts_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridrecetastinteprocesosquimicos_sdtsContainerData", Gridrecetastinteprocesosquimicos_sdtsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridrecetastinteprocesosquimicos_sdtsContainerData"+"V", Gridrecetastinteprocesosquimicos_sdtsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridrecetastinteprocesosquimicos_sdtsContainerData"+"V"+"\" value='"+Gridrecetastinteprocesosquimicos_sdtsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1G22( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "Recetas Tinte( Procesos Quimicos)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1G20( ) ;
   }

   public void ws1G22( )
   {
      start1G22( ) ;
      evt1G22( ) ;
   }

   public void evt1G22( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121G22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e131G22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e141G22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOADD'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Doadd' */
                           e151G22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOREORDENARPROCESOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoReordenarProcesos' */
                           e161G22 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTSPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTSPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgridrecetastinteprocesosquimicos_sdts_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgridrecetastinteprocesosquimicos_sdts_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgridrecetastinteprocesosquimicos_sdts_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgridrecetastinteprocesosquimicos_sdts_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 42), "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 8), "'DOTEST'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 52), "RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD.ISVALID") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 56), "RECETASTINTEPROCESOSQUIMICOS_SDTS__NUMERODELINEA.ISVALID") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_23_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_232( ) ;
                           AV32GXV1 = nGXsfl_23_idx ;
                           if ( ( AV18RecetasTinteProcesosQuimicos_SDTs.size() >= AV32GXV1 ) && ( AV32GXV1 > 0 ) )
                           {
                              AV18RecetasTinteProcesosQuimicos_SDTs.currentItem( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV32GXV1)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e171G22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e181G22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOTEST'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoTest' */
                                 e191G22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD.ISVALID") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e201G22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "RECETASTINTEPROCESOSQUIMICOS_SDTS__NUMERODELINEA.ISVALID") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e211G22 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
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

   public void we1G22( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa1G22( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         init_web_controls( ) ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridrecetastinteprocesosquimicos_sdts_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_232( ) ;
      while ( nGXsfl_23_idx <= nRC_GXsfl_23 )
      {
         sendrow_232( ) ;
         nGXsfl_23_idx = ((subGridrecetastinteprocesosquimicos_sdts_Islastpage==1)&&(nGXsfl_23_idx+1>subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_23_idx+1) ;
         sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_232( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridrecetastinteprocesosquimicos_sdtsContainer)) ;
      /* End function gxnrGridrecetastinteprocesosquimicos_sdts_newrow */
   }

   public void gxgrgridrecetastinteprocesosquimicos_sdts_refresh( int subGridrecetastinteprocesosquimicos_sdts_Rows )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nCurrentRecord = 0 ;
      rf1G22( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridrecetastinteprocesosquimicos_sdts_refresh */
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
      GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage = 0 ;
      GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nCurrentRecord = 0 ;
      GXCCtl = "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage_" + sGXsfl_23_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf1G22( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavRecetastinteprocesosquimicos_sdts__profordsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetastinteprocesosquimicos_sdts__profordsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetastinteprocesosquimicos_sdts__profordsc_Enabled), 5, 0), !bGXsfl_23_Refreshing);
   }

   public void rf1G22( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridrecetastinteprocesosquimicos_sdtsContainer.ClearRows();
      }
      wbStart = (short)(23) ;
      nGXsfl_23_idx = (int)(1+GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage) ;
      sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_232( ) ;
      bGXsfl_23_Refreshing = true ;
      Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("GridName", "Gridrecetastinteprocesosquimicos_sdts");
      Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("CmpContext", "");
      Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("InMasterPage", "false");
      Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridrecetastinteprocesosquimicos_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridrecetastinteprocesosquimicos_sdtsContainer.setPageSize( subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_232( ) ;
         e181G22 ();
         if ( ( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nCurrentRecord > 0 ) && ( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nGridOutOfScope == 0 ) && ( nGXsfl_23_idx == 1 ) )
         {
            GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nCurrentRecord = 0 ;
            GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nGridOutOfScope = 1 ;
            subgridrecetastinteprocesosquimicos_sdts_firstpage( ) ;
            e181G22 ();
         }
         wbEnd = (short)(23) ;
         wb1G20( ) ;
      }
      bGXsfl_23_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1G22( )
   {
   }

   public int subgridrecetastinteprocesosquimicos_sdts_fnc_pagecount( )
   {
      GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nRecordCount = subgridrecetastinteprocesosquimicos_sdts_fnc_recordcount( ) ;
      if ( ((int)((GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nRecordCount) % (subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nRecordCount/ (double) (subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nRecordCount/ (double) (subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( )))+1) ;
   }

   public int subgridrecetastinteprocesosquimicos_sdts_fnc_recordcount( )
   {
      return AV18RecetasTinteProcesosQuimicos_SDTs.size() ;
   }

   public int subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( )
   {
      if ( subGridrecetastinteprocesosquimicos_sdts_Rows > 0 )
      {
         return subGridrecetastinteprocesosquimicos_sdts_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridrecetastinteprocesosquimicos_sdts_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage/ (double) (subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( )))+1) ;
   }

   public short subgridrecetastinteprocesosquimicos_sdts_firstpage( )
   {
      GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridrecetastinteprocesosquimicos_sdts_refresh( subGridrecetastinteprocesosquimicos_sdts_Rows) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridrecetastinteprocesosquimicos_sdts_nextpage( )
   {
      GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nRecordCount = subgridrecetastinteprocesosquimicos_sdts_fnc_recordcount( ) ;
      if ( ( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nRecordCount >= subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( ) ) && ( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF == 0 ) )
      {
         GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage = (long)(GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage+subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF == 1 )
      {
         GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage = GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage", GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridrecetastinteprocesosquimicos_sdts_refresh( subGridrecetastinteprocesosquimicos_sdts_Rows) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridrecetastinteprocesosquimicos_sdts_previouspage( )
   {
      if ( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage >= subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( ) )
      {
         GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage = (long)(GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage-subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridrecetastinteprocesosquimicos_sdts_refresh( subGridrecetastinteprocesosquimicos_sdts_Rows) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridrecetastinteprocesosquimicos_sdts_lastpage( )
   {
      GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nRecordCount = subgridrecetastinteprocesosquimicos_sdts_fnc_recordcount( ) ;
      if ( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nRecordCount > subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nRecordCount) % (subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( )))) == 0 )
         {
            GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage = (long)(GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nRecordCount-subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage = (long)(GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nRecordCount-((int)((GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nRecordCount) % (subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridrecetastinteprocesosquimicos_sdts_refresh( subGridrecetastinteprocesosquimicos_sdts_Rows) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridrecetastinteprocesosquimicos_sdts_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage = (long)(subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridrecetastinteprocesosquimicos_sdts_refresh( subGridrecetastinteprocesosquimicos_sdts_Rows) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavRecetastinteprocesosquimicos_sdts__profordsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetastinteprocesosquimicos_sdts__profordsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetastinteprocesosquimicos_sdts__profordsc_Enabled), 5, 0), !bGXsfl_23_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup1G20( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e171G22 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Recetastinteprocesosquimicos_sdts"), AV18RecetasTinteProcesosQuimicos_SDTs);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vRECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD_DATA"), AV28RecetasTinteProcesosQuimicos_SDTs__Proforcod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vRECETASTINTEPROCESOSQUIMICOS_SDTS"), AV18RecetasTinteProcesosQuimicos_SDTs);
         /* Read saved values. */
         nRC_GXsfl_23 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_23"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridrecetastinteprocesosquimicos_sdts_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridrecetastinteprocesosquimicos_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
         Combo_recetastinteprocesosquimicos_sdts__proforcod_Cls = httpContext.cgiGet( "COMBO_RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD_Cls") ;
         Combo_recetastinteprocesosquimicos_sdts__proforcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD_Titlecontrolidtoreplace") ;
         Combo_recetastinteprocesosquimicos_sdts__proforcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD_Isgriditem")) ;
         Combo_recetastinteprocesosquimicos_sdts__proforcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD_Emptyitem")) ;
         Dvelop_confirmpanel_eliminarproceso_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Title") ;
         Dvelop_confirmpanel_eliminarproceso_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarproceso_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarproceso_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarproceso_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarproceso_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarproceso_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Confirmtype") ;
         Gridrecetastinteprocesosquimicos_sdts_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_EMPOWERER_Gridinternalname") ;
         Gridrecetastinteprocesosquimicos_sdts_empowerer_Infinitescrolling = httpContext.cgiGet( "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_EMPOWERER_Infinitescrolling") ;
         Dvelop_confirmpanel_eliminarproceso_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Result") ;
         nRC_GXsfl_23 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_23"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_23_fel_idx = 0 ;
         while ( nGXsfl_23_fel_idx < nRC_GXsfl_23 )
         {
            nGXsfl_23_fel_idx = ((subGridrecetastinteprocesosquimicos_sdts_Islastpage==1)&&(nGXsfl_23_fel_idx+1>subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_23_fel_idx+1) ;
            sGXsfl_23_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_232( ) ;
            AV32GXV1 = nGXsfl_23_fel_idx ;
            if ( ( AV18RecetasTinteProcesosQuimicos_SDTs.size() >= AV32GXV1 ) && ( AV32GXV1 > 0 ) )
            {
               AV18RecetasTinteProcesosQuimicos_SDTs.currentItem( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV32GXV1)) );
            }
         }
         if ( nGXsfl_23_fel_idx == 0 )
         {
            nGXsfl_23_idx = 1 ;
            sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_232( ) ;
         }
         nGXsfl_23_fel_idx = 1 ;
         /* Read variables values. */
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
      e171G22 ();
      if (returnInSub) return;
   }

   public void e171G22( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV18RecetasTinteProcesosQuimicos_SDTs.fromJSonString(AV19RecetasTinteProcesosQuimicosToJson, null);
      gx_BV23 = true ;
      if ( AV18RecetasTinteProcesosQuimicos_SDTs.size() == 0 )
      {
         AV18RecetasTinteProcesosQuimicos_SDTs.clear();
         gx_BV23 = true ;
         AV21Tabla_Lformu = (short)(0) ;
         /* Using cursor H01G22 */
         pr_default.execute(0, new Object[] {AV7Emprcod, Integer.valueOf(AV6Clicod), AV10Forser, AV8Forcolnom, Integer.valueOf(AV9Forcolnum), Byte.valueOf(AV20Tipcolcod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A831TipColCod = H01G22_A831TipColCod[0] ;
            A483ForColNum = H01G22_A483ForColNum[0] ;
            A482ForColNom = H01G22_A482ForColNom[0] ;
            A494ForSer = H01G22_A494ForSer[0] ;
            A252CliCod = H01G22_A252CliCod[0] ;
            A396EmprCod = H01G22_A396EmprCod[0] ;
            A764ProForCod = H01G22_A764ProForCod[0] ;
            A766ProForDsc = H01G22_A766ProForDsc[0] ;
            A1160ProForL = H01G22_A1160ProForL[0] ;
            A766ProForDsc = H01G22_A766ProForDsc[0] ;
            AV17RecetasTinteProcesosQuimicos_SDT = (app.SdtRecetasTinteProcesosQuimicos_SDT)new app.SdtRecetasTinteProcesosQuimicos_SDT(remoteHandle, context);
            AV17RecetasTinteProcesosQuimicos_SDT.setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod( A764ProForCod );
            AV17RecetasTinteProcesosQuimicos_SDT.setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc( A766ProForDsc );
            AV17RecetasTinteProcesosQuimicos_SDT.setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea( A1160ProForL );
            AV18RecetasTinteProcesosQuimicos_SDTs.add(AV17RecetasTinteProcesosQuimicos_SDT, 0);
            gx_BV23 = true ;
            AV21Tabla_Lformu = (short)(1) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV19RecetasTinteProcesosQuimicosToJson = AV18RecetasTinteProcesosQuimicos_SDTs.toJSonString(false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19RecetasTinteProcesosQuimicosToJson", AV19RecetasTinteProcesosQuimicosToJson);
      }
      else
      {
         AV18RecetasTinteProcesosQuimicos_SDTs.fromJSonString(AV19RecetasTinteProcesosQuimicosToJson, null);
         gx_BV23 = true ;
      }
      GXt_char1 = AV38Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetastinteprocesosquimicos_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV38Station = GXt_char1 ;
      GXv_char2[0] = AV7Emprcod ;
      GXv_char3[0] = AV39Emprnom ;
      GXv_char4[0] = AV40Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV38Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetastinteprocesosquimicos_wp_impl.this.AV7Emprcod = GXv_char2[0] ;
      recetastinteprocesosquimicos_wp_impl.this.AV39Emprnom = GXv_char3[0] ;
      recetastinteprocesosquimicos_wp_impl.this.AV40Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
      Combo_recetastinteprocesosquimicos_sdts__proforcod_Titlecontrolidtoreplace = edtavRecetastinteprocesosquimicos_sdts__proforcod_Internalname ;
      ucCombo_recetastinteprocesosquimicos_sdts__proforcod.sendProperty(context, "", false, Combo_recetastinteprocesosquimicos_sdts__proforcod_Internalname, "TitleControlIdToReplace", Combo_recetastinteprocesosquimicos_sdts__proforcod_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBORECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD' */
      S112 ();
      if (returnInSub) return;
      Gridrecetastinteprocesosquimicos_sdts_empowerer_Gridinternalname = subGridrecetastinteprocesosquimicos_sdts_Internalname ;
      ucGridrecetastinteprocesosquimicos_sdts_empowerer.sendProperty(context, "", false, Gridrecetastinteprocesosquimicos_sdts_empowerer_Internalname, "GridInternalName", Gridrecetastinteprocesosquimicos_sdts_empowerer_Gridinternalname);
      subGridrecetastinteprocesosquimicos_sdts_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridrecetastinteprocesosquimicos_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   private void e181G22( )
   {
      /* Gridrecetastinteprocesosquimicos_sdts_Load Routine */
      returnInSub = false ;
      AV32GXV1 = 1 ;
      while ( AV32GXV1 <= AV18RecetasTinteProcesosQuimicos_SDTs.size() )
      {
         AV18RecetasTinteProcesosQuimicos_SDTs.currentItem( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV32GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(23) ;
         }
         if ( ( subGridrecetastinteprocesosquimicos_sdts_Islastpage == 1 ) || ( subGridrecetastinteprocesosquimicos_sdts_Rows == 0 ) || ( ( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nCurrentRecord >= GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage ) && ( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nCurrentRecord < GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage + subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( ) ) ) )
         {
            sendrow_232( ) ;
            GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nCurrentRecord + 1 >= subgridrecetastinteprocesosquimicos_sdts_fnc_recordcount( ) )
            {
               GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nCurrentRecord = (long)(GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_23_Refreshing )
         {
            httpContext.doAjaxLoad(23, Gridrecetastinteprocesosquimicos_sdtsRow);
         }
         AV32GXV1 = (int)(AV32GXV1+1) ;
      }
   }

   public void e131G22( )
   {
      AV32GXV1 = nGXsfl_23_idx ;
      if ( ( AV32GXV1 > 0 ) && ( AV18RecetasTinteProcesosQuimicos_SDTs.size() >= AV32GXV1 ) )
      {
         AV18RecetasTinteProcesosQuimicos_SDTs.currentItem( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV32GXV1)) );
      }
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ELIMINODATOSNOLOGICOS' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'REORDENOSDT' */
      S132 ();
      if (returnInSub) return;
      AV19RecetasTinteProcesosQuimicosToJson = AV18RecetasTinteProcesosQuimicos_SDTs.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19RecetasTinteProcesosQuimicosToJson", AV19RecetasTinteProcesosQuimicosToJson);
      httpContext.setWebReturnParms(new Object[] {AV7Emprcod,Integer.valueOf(AV6Clicod),AV10Forser,AV8Forcolnom,Integer.valueOf(AV9Forcolnum),Byte.valueOf(AV20Tipcolcod),AV19RecetasTinteProcesosQuimicosToJson});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV7Emprcod","AV6Clicod","AV10Forser","AV8Forcolnom","AV9Forcolnum","AV20Tipcolcod","AV19RecetasTinteProcesosQuimicosToJson"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18RecetasTinteProcesosQuimicos_SDTs", AV18RecetasTinteProcesosQuimicos_SDTs);
      nGXsfl_23_bak_idx = nGXsfl_23_idx ;
      gxgrgridrecetastinteprocesosquimicos_sdts_refresh( subGridrecetastinteprocesosquimicos_sdts_Rows) ;
      nGXsfl_23_idx = nGXsfl_23_bak_idx ;
      sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_232( ) ;
   }

   public void e141G22( )
   {
      AV32GXV1 = nGXsfl_23_idx ;
      if ( ( AV32GXV1 > 0 ) && ( AV18RecetasTinteProcesosQuimicos_SDTs.size() >= AV32GXV1 ) )
      {
         AV18RecetasTinteProcesosQuimicos_SDTs.currentItem( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV32GXV1)) );
      }
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ELIMINODATOSNOLOGICOS' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'REORDENOSDT' */
      S132 ();
      if (returnInSub) return;
      AV19RecetasTinteProcesosQuimicosToJson = AV18RecetasTinteProcesosQuimicos_SDTs.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19RecetasTinteProcesosQuimicosToJson", AV19RecetasTinteProcesosQuimicosToJson);
      httpContext.setWebReturnParms(new Object[] {AV7Emprcod,Integer.valueOf(AV6Clicod),AV10Forser,AV8Forcolnom,Integer.valueOf(AV9Forcolnum),Byte.valueOf(AV20Tipcolcod),AV19RecetasTinteProcesosQuimicosToJson});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV7Emprcod","AV6Clicod","AV10Forser","AV8Forcolnom","AV9Forcolnum","AV20Tipcolcod","AV19RecetasTinteProcesosQuimicosToJson"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18RecetasTinteProcesosQuimicos_SDTs", AV18RecetasTinteProcesosQuimicos_SDTs);
      nGXsfl_23_bak_idx = nGXsfl_23_idx ;
      gxgrgridrecetastinteprocesosquimicos_sdts_refresh( subGridrecetastinteprocesosquimicos_sdts_Rows) ;
      nGXsfl_23_idx = nGXsfl_23_bak_idx ;
      sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_232( ) ;
   }

   public void e151G22( )
   {
      AV32GXV1 = nGXsfl_23_idx ;
      if ( ( AV32GXV1 > 0 ) && ( AV18RecetasTinteProcesosQuimicos_SDTs.size() >= AV32GXV1 ) )
      {
         AV18RecetasTinteProcesosQuimicos_SDTs.currentItem( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV32GXV1)) );
      }
      /* 'Doadd' Routine */
      returnInSub = false ;
      AV25NumerodeLinea = (short)(0) ;
      if ( AV18RecetasTinteProcesosQuimicos_SDTs.size() > 0 )
      {
         AV18RecetasTinteProcesosQuimicos_SDTs.sort(httpContext.getMessage( "[NumerodeLinea]", ""));
         gx_BV23 = true ;
         AV25NumerodeLinea = ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+1)).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea() ;
      }
      AV25NumerodeLinea = (short)(AV25NumerodeLinea+10) ;
      AV17RecetasTinteProcesosQuimicos_SDT = (app.SdtRecetasTinteProcesosQuimicos_SDT)new app.SdtRecetasTinteProcesosQuimicos_SDT(remoteHandle, context);
      AV17RecetasTinteProcesosQuimicos_SDT.setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea( AV25NumerodeLinea );
      AV18RecetasTinteProcesosQuimicos_SDTs.add(AV17RecetasTinteProcesosQuimicos_SDT, 0);
      gx_BV23 = true ;
      AV18RecetasTinteProcesosQuimicos_SDTs.sort(httpContext.getMessage( "NumerodeLinea", ""));
      gx_BV23 = true ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18RecetasTinteProcesosQuimicos_SDTs", AV18RecetasTinteProcesosQuimicos_SDTs);
      nGXsfl_23_bak_idx = nGXsfl_23_idx ;
      gxgrgridrecetastinteprocesosquimicos_sdts_refresh( subGridrecetastinteprocesosquimicos_sdts_Rows) ;
      nGXsfl_23_idx = nGXsfl_23_bak_idx ;
      sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_232( ) ;
   }

   public void e121G22( )
   {
      AV32GXV1 = nGXsfl_23_idx ;
      if ( ( AV32GXV1 > 0 ) && ( AV18RecetasTinteProcesosQuimicos_SDTs.size() >= AV32GXV1 ) )
      {
         AV18RecetasTinteProcesosQuimicos_SDTs.currentItem( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV32GXV1)) );
      }
      /* Dvelop_confirmpanel_eliminarproceso_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarproceso_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARPROCESO' */
         S142 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18RecetasTinteProcesosQuimicos_SDTs", AV18RecetasTinteProcesosQuimicos_SDTs);
      nGXsfl_23_bak_idx = nGXsfl_23_idx ;
      gxgrgridrecetastinteprocesosquimicos_sdts_refresh( subGridrecetastinteprocesosquimicos_sdts_Rows) ;
      nGXsfl_23_idx = nGXsfl_23_bak_idx ;
      sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_232( ) ;
   }

   public void e161G22( )
   {
      AV32GXV1 = nGXsfl_23_idx ;
      if ( ( AV32GXV1 > 0 ) && ( AV18RecetasTinteProcesosQuimicos_SDTs.size() >= AV32GXV1 ) )
      {
         AV18RecetasTinteProcesosQuimicos_SDTs.currentItem( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV32GXV1)) );
      }
      /* 'DoReordenarProcesos' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'REORDENOSDT' */
      S132 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18RecetasTinteProcesosQuimicos_SDTs", AV18RecetasTinteProcesosQuimicos_SDTs);
      nGXsfl_23_bak_idx = nGXsfl_23_idx ;
      gxgrgridrecetastinteprocesosquimicos_sdts_refresh( subGridrecetastinteprocesosquimicos_sdts_Rows) ;
      nGXsfl_23_idx = nGXsfl_23_bak_idx ;
      sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_232( ) ;
   }

   public void S142( )
   {
      /* 'DO ACTION ELIMINARPROCESO' Routine */
      returnInSub = false ;
      AV15i = (short)(1) ;
      while ( AV15i <= AV18RecetasTinteProcesosQuimicos_SDTs.size() )
      {
         if ( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV15i)).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Eliminar() )
         {
            AV18RecetasTinteProcesosQuimicos_SDTs.removeItem(AV15i);
            gx_BV23 = true ;
            AV15i = (short)(AV15i-1) ;
         }
         AV15i = (short)(AV15i+1) ;
      }
      httpContext.doAjaxRefresh();
   }

   public void S112( )
   {
      /* 'LOADCOMBORECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD' Routine */
      returnInSub = false ;
      /* Using cursor H01G23 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13133ProForAct = H01G23_A13133ProForAct[0] ;
         A13740ProFDsc = H01G23_A13740ProFDsc[0] ;
         A764ProForCod = H01G23_A764ProForCod[0] ;
         A766ProForDsc = H01G23_A766ProForDsc[0] ;
         AV29Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV29Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A764ProForCod );
         AV29Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13740ProFDsc );
         AV28RecetasTinteProcesosQuimicos_SDTs__Proforcod_Data.add(AV29Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void e191G22( )
   {
      AV32GXV1 = nGXsfl_23_idx ;
      if ( ( AV32GXV1 > 0 ) && ( AV18RecetasTinteProcesosQuimicos_SDTs.size() >= AV32GXV1 ) )
      {
         AV18RecetasTinteProcesosQuimicos_SDTs.currentItem( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV32GXV1)) );
      }
      /* 'DoTest' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ELIMINODATOSNOLOGICOS' */
      S122 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18RecetasTinteProcesosQuimicos_SDTs", AV18RecetasTinteProcesosQuimicos_SDTs);
      nGXsfl_23_bak_idx = nGXsfl_23_idx ;
      gxgrgridrecetastinteprocesosquimicos_sdts_refresh( subGridrecetastinteprocesosquimicos_sdts_Rows) ;
      nGXsfl_23_idx = nGXsfl_23_bak_idx ;
      sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_232( ) ;
   }

   public void e201G22( )
   {
      AV32GXV1 = nGXsfl_23_idx ;
      if ( ( AV32GXV1 > 0 ) && ( AV18RecetasTinteProcesosQuimicos_SDTs.size() >= AV32GXV1 ) )
      {
         AV18RecetasTinteProcesosQuimicos_SDTs.currentItem( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV32GXV1)) );
      }
      /* Recetastinteprocesosquimicos_sdts__proforcod_Isvalid Routine */
      returnInSub = false ;
      AV27q = (short)(0) ;
      AV15i = (short)(1) ;
      while ( AV15i <= AV18RecetasTinteProcesosQuimicos_SDTs.size() )
      {
         if ( ! (GXutil.strcmp("", ((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod())==0) && ( GXutil.strcmp(((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV15i)).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod(), ((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod()) == 0 ) )
         {
            AV27q = AV15i ;
            if (true) break;
         }
         AV15i = (short)(AV15i+1) ;
      }
      AV15i = (short)(1) ;
      while ( AV15i <= AV18RecetasTinteProcesosQuimicos_SDTs.size() )
      {
         if ( ! (GXutil.strcmp("", ((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod())==0) && ( GXutil.strcmp(((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV15i)).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod(), ((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod()) == 0 ) && ( AV15i != AV27q ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "El proceso %1 , ya existe !", ""), GXutil.trim( ((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod()), "", "", "", "", "", "", "", ""));
            ((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod( "" );
            if (true) break;
         }
         AV15i = (short)(AV15i+1) ;
      }
      if ( ! (GXutil.strcmp("", ((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod())==0) )
      {
         GXt_char1 = "" ;
         GXv_char4[0] = GXt_char1 ;
         new app.pprofordsc(remoteHandle, context).execute( AV7Emprcod, ((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod(), GXv_char4) ;
         recetastinteprocesosquimicos_wp_impl.this.GXt_char1 = GXv_char4[0] ;
         ((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc( GXt_char1 );
      }
      if ( ! (GXutil.strcmp("", ((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod())==0) && ( GXutil.strcmp(((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc(), "No existe proceso quimico") == 0 ) )
      {
         httpContext.GX_msglist.addItem(((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc());
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18RecetasTinteProcesosQuimicos_SDTs", AV18RecetasTinteProcesosQuimicos_SDTs);
      nGXsfl_23_bak_idx = nGXsfl_23_idx ;
      gxgrgridrecetastinteprocesosquimicos_sdts_refresh( subGridrecetastinteprocesosquimicos_sdts_Rows) ;
      nGXsfl_23_idx = nGXsfl_23_bak_idx ;
      sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_232( ) ;
   }

   public void e211G22( )
   {
      AV32GXV1 = nGXsfl_23_idx ;
      if ( ( AV32GXV1 > 0 ) && ( AV18RecetasTinteProcesosQuimicos_SDTs.size() >= AV32GXV1 ) )
      {
         AV18RecetasTinteProcesosQuimicos_SDTs.currentItem( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV32GXV1)) );
      }
      /* Recetastinteprocesosquimicos_sdts__numerodelinea_Isvalid Routine */
      returnInSub = false ;
      AV27q = (short)(0) ;
      AV15i = (short)(1) ;
      while ( AV15i <= AV18RecetasTinteProcesosQuimicos_SDTs.size() )
      {
         if ( ! (0==((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea()) && ( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV15i)).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea() == ((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea() ) )
         {
            AV27q = AV15i ;
            if (true) break;
         }
         AV15i = (short)(AV15i+1) ;
      }
      AV15i = (short)(1) ;
      while ( AV15i <= AV18RecetasTinteProcesosQuimicos_SDTs.size() )
      {
         if ( ! (0==((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea()) && ( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV15i)).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea() == ((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea() ) && ( AV15i != AV27q ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "1.La linea %1 , ya existe!", ""), GXutil.trim( GXutil.str( ((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea(), 4, 0)), "", "", "", "", "", "", "", ""));
            ((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea( (short)(0) );
            if (true) break;
         }
         AV15i = (short)(AV15i+1) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18RecetasTinteProcesosQuimicos_SDTs", AV18RecetasTinteProcesosQuimicos_SDTs);
      nGXsfl_23_bak_idx = nGXsfl_23_idx ;
      gxgrgridrecetastinteprocesosquimicos_sdts_refresh( subGridrecetastinteprocesosquimicos_sdts_Rows) ;
      nGXsfl_23_idx = nGXsfl_23_bak_idx ;
      sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_232( ) ;
   }

   public void S132( )
   {
      /* 'REORDENOSDT' Routine */
      returnInSub = false ;
      AV18RecetasTinteProcesosQuimicos_SDTs.sort(httpContext.getMessage( "NumerodeLinea", ""));
      gx_BV23 = true ;
   }

   public void S152( )
   {
      /* 'DATOSLOGICOS' Routine */
      returnInSub = false ;
      AV26IsOk = true ;
      AV15i = (short)(1) ;
      while ( AV15i <= AV18RecetasTinteProcesosQuimicos_SDTs.size() )
      {
         if ( (0==((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV15i)).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea()) || (GXutil.strcmp("", ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV15i)).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod())==0) )
         {
            AV26IsOk = false ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "La línea %1 esta incompleta,falta indicar el numero de linea. Verifique por favor!", ""), GXutil.trim( GXutil.str( AV15i, 4, 0)), "", "", "", "", "", "", "", ""));
            if (true) break;
         }
         if ( ! (GXutil.strcmp("", ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV15i)).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod())==0) )
         {
            GXt_char1 = "" ;
            GXv_char4[0] = GXt_char1 ;
            new app.pprofordsc(remoteHandle, context).execute( AV7Emprcod, ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV15i)).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod(), GXv_char4) ;
            recetastinteprocesosquimicos_wp_impl.this.GXt_char1 = GXv_char4[0] ;
            ((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc( GXt_char1 );
            if ( GXutil.strcmp(((app.SdtRecetasTinteProcesosQuimicos_SDT)(AV18RecetasTinteProcesosQuimicos_SDTs.currentItem())).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc(), httpContext.getMessage( "No existe proceso quimico", "")) == 0 )
            {
               AV26IsOk = false ;
               httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe proceso quimico", ""));
               if (true) break;
            }
         }
         AV15i = (short)(AV15i+1) ;
      }
   }

   public void S122( )
   {
      /* 'ELIMINODATOSNOLOGICOS' Routine */
      returnInSub = false ;
      AV15i = (short)(1) ;
      while ( AV15i <= AV18RecetasTinteProcesosQuimicos_SDTs.size() )
      {
         if ( (0==((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV15i)).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea()) || (GXutil.strcmp("", ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV15i)).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod())==0) )
         {
            AV18RecetasTinteProcesosQuimicos_SDTs.removeItem(AV15i);
            gx_BV23 = true ;
         }
         AV15i = (short)(AV15i+1) ;
      }
   }

   public void wb_table1_52_1G22( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarproceso_Internalname, tblTabledvelop_confirmpanel_eliminarproceso_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminarproceso.setProperty("Title", Dvelop_confirmpanel_eliminarproceso_Title);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarproceso_Confirmationtext);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarproceso_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarproceso_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarproceso_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarproceso_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarproceso_Confirmtype);
         ucDvelop_confirmpanel_eliminarproceso.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarproceso_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARPROCESOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARPROCESOContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_52_1G22e( true) ;
      }
      else
      {
         wb_table1_52_1G22e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
      AV6Clicod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
      AV10Forser = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Forser", AV10Forser);
      AV8Forcolnom = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Forcolnom", AV8Forcolnom);
      AV9Forcolnum = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Forcolnum), 6, 0));
      AV20Tipcolcod = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Tipcolcod), 2, 0));
      AV19RecetasTinteProcesosQuimicosToJson = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19RecetasTinteProcesosQuimicosToJson", AV19RecetasTinteProcesosQuimicosToJson);
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
      pa1G22( ) ;
      ws1G22( ) ;
      we1G22( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
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

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714192347", true, true);
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
      httpContext.AddJavascriptSource("recetastinteprocesosquimicos_wp.js", "?202681714192348", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_232( )
   {
      chkavRecetastinteprocesosquimicos_sdts__eliminar.setInternalname( "RECETASTINTEPROCESOSQUIMICOS_SDTS__ELIMINAR_"+sGXsfl_23_idx );
      edtavRecetastinteprocesosquimicos_sdts__numerodelinea_Internalname = "RECETASTINTEPROCESOSQUIMICOS_SDTS__NUMERODELINEA_"+sGXsfl_23_idx ;
      edtavRecetastinteprocesosquimicos_sdts__proforcod_Internalname = "RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD_"+sGXsfl_23_idx ;
      edtavRecetastinteprocesosquimicos_sdts__profordsc_Internalname = "RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORDSC_"+sGXsfl_23_idx ;
   }

   public void subsflControlProps_fel_232( )
   {
      chkavRecetastinteprocesosquimicos_sdts__eliminar.setInternalname( "RECETASTINTEPROCESOSQUIMICOS_SDTS__ELIMINAR_"+sGXsfl_23_fel_idx );
      edtavRecetastinteprocesosquimicos_sdts__numerodelinea_Internalname = "RECETASTINTEPROCESOSQUIMICOS_SDTS__NUMERODELINEA_"+sGXsfl_23_fel_idx ;
      edtavRecetastinteprocesosquimicos_sdts__proforcod_Internalname = "RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD_"+sGXsfl_23_fel_idx ;
      edtavRecetastinteprocesosquimicos_sdts__profordsc_Internalname = "RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORDSC_"+sGXsfl_23_fel_idx ;
   }

   public void sendrow_232( )
   {
      subsflControlProps_232( ) ;
      wb1G20( ) ;
      if ( ( subGridrecetastinteprocesosquimicos_sdts_Rows * 1 == 0 ) || ( nGXsfl_23_idx - GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage <= subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( ) * 1 ) )
      {
         Gridrecetastinteprocesosquimicos_sdtsRow = GXWebRow.GetNew(context,Gridrecetastinteprocesosquimicos_sdtsContainer) ;
         if ( subGridrecetastinteprocesosquimicos_sdts_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridrecetastinteprocesosquimicos_sdts_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridrecetastinteprocesosquimicos_sdts_Class, "") != 0 )
            {
               subGridrecetastinteprocesosquimicos_sdts_Linesclass = subGridrecetastinteprocesosquimicos_sdts_Class+"Odd" ;
            }
         }
         else if ( subGridrecetastinteprocesosquimicos_sdts_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridrecetastinteprocesosquimicos_sdts_Backstyle = (byte)(0) ;
            subGridrecetastinteprocesosquimicos_sdts_Backcolor = subGridrecetastinteprocesosquimicos_sdts_Allbackcolor ;
            if ( GXutil.strcmp(subGridrecetastinteprocesosquimicos_sdts_Class, "") != 0 )
            {
               subGridrecetastinteprocesosquimicos_sdts_Linesclass = subGridrecetastinteprocesosquimicos_sdts_Class+"Uniform" ;
            }
         }
         else if ( subGridrecetastinteprocesosquimicos_sdts_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridrecetastinteprocesosquimicos_sdts_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridrecetastinteprocesosquimicos_sdts_Class, "") != 0 )
            {
               subGridrecetastinteprocesosquimicos_sdts_Linesclass = subGridrecetastinteprocesosquimicos_sdts_Class+"Odd" ;
            }
            subGridrecetastinteprocesosquimicos_sdts_Backcolor = (int)(0x0) ;
         }
         else if ( subGridrecetastinteprocesosquimicos_sdts_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridrecetastinteprocesosquimicos_sdts_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_23_idx) % (2))) == 0 )
            {
               subGridrecetastinteprocesosquimicos_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridrecetastinteprocesosquimicos_sdts_Class, "") != 0 )
               {
                  subGridrecetastinteprocesosquimicos_sdts_Linesclass = subGridrecetastinteprocesosquimicos_sdts_Class+"Even" ;
               }
            }
            else
            {
               subGridrecetastinteprocesosquimicos_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridrecetastinteprocesosquimicos_sdts_Class, "") != 0 )
               {
                  subGridrecetastinteprocesosquimicos_sdts_Linesclass = subGridrecetastinteprocesosquimicos_sdts_Class+"Odd" ;
               }
            }
         }
         if ( Gridrecetastinteprocesosquimicos_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_23_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridrecetastinteprocesosquimicos_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavRecetastinteprocesosquimicos_sdts__eliminar.getEnabled()!=0)&&(chkavRecetastinteprocesosquimicos_sdts__eliminar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 24,'',false,'"+sGXsfl_23_idx+"',23)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "RECETASTINTEPROCESOSQUIMICOS_SDTS__ELIMINAR_" + sGXsfl_23_idx ;
         chkavRecetastinteprocesosquimicos_sdts__eliminar.setName( GXCCtl );
         chkavRecetastinteprocesosquimicos_sdts__eliminar.setWebtags( "" );
         chkavRecetastinteprocesosquimicos_sdts__eliminar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavRecetastinteprocesosquimicos_sdts__eliminar.getInternalname(), "TitleCaption", chkavRecetastinteprocesosquimicos_sdts__eliminar.getCaption(), !bGXsfl_23_Refreshing);
         chkavRecetastinteprocesosquimicos_sdts__eliminar.setCheckedValue( "false" );
         Gridrecetastinteprocesosquimicos_sdtsRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavRecetastinteprocesosquimicos_sdts__eliminar.getInternalname(),GXutil.booltostr( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV32GXV1)).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Eliminar()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(24, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavRecetastinteprocesosquimicos_sdts__eliminar.getEnabled()!=0)&&(chkavRecetastinteprocesosquimicos_sdts__eliminar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,24);\"" : " ")});
         /* Subfile cell */
         if ( Gridrecetastinteprocesosquimicos_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRecetastinteprocesosquimicos_sdts__numerodelinea_Enabled!=0)&&(edtavRecetastinteprocesosquimicos_sdts__numerodelinea_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 25,'',false,'"+sGXsfl_23_idx+"',23)\"" : " ") ;
         ROClassString = "Attribute" ;
         Gridrecetastinteprocesosquimicos_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetastinteprocesosquimicos_sdts__numerodelinea_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV32GXV1)).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV32GXV1)).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea()), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavRecetastinteprocesosquimicos_sdts__numerodelinea_Enabled!=0)&&(edtavRecetastinteprocesosquimicos_sdts__numerodelinea_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetastinteprocesosquimicos_sdts__numerodelinea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridrecetastinteprocesosquimicos_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRecetastinteprocesosquimicos_sdts__proforcod_Enabled!=0)&&(edtavRecetastinteprocesosquimicos_sdts__proforcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 26,'',false,'"+sGXsfl_23_idx+"',23)\"" : " ") ;
         ROClassString = "Attribute" ;
         Gridrecetastinteprocesosquimicos_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetastinteprocesosquimicos_sdts__proforcod_Internalname,GXutil.rtrim( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV32GXV1)).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod()),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavRecetastinteprocesosquimicos_sdts__proforcod_Enabled!=0)&&(edtavRecetastinteprocesosquimicos_sdts__proforcod_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,26);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetastinteprocesosquimicos_sdts__proforcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridrecetastinteprocesosquimicos_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridrecetastinteprocesosquimicos_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetastinteprocesosquimicos_sdts__profordsc_Internalname,GXutil.rtrim( ((app.SdtRecetasTinteProcesosQuimicos_SDT)AV18RecetasTinteProcesosQuimicos_SDTs.elementAt(-1+AV32GXV1)).getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetastinteprocesosquimicos_sdts__profordsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavRecetastinteprocesosquimicos_sdts__profordsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1G22( ) ;
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddRow(Gridrecetastinteprocesosquimicos_sdtsRow);
         nGXsfl_23_idx = ((subGridrecetastinteprocesosquimicos_sdts_Islastpage==1)&&(nGXsfl_23_idx+1>subgridrecetastinteprocesosquimicos_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_23_idx+1) ;
         sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_232( ) ;
      }
      /* End function sendrow_232 */
   }

   public void startgridcontrol23( )
   {
      if ( Gridrecetastinteprocesosquimicos_sdtsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Gridrecetastinteprocesosquimicos_sdtsContainer"+"DivS\" data-gxgridid=\"23\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridrecetastinteprocesosquimicos_sdts_Internalname, subGridrecetastinteprocesosquimicos_sdts_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridrecetastinteprocesosquimicos_sdts_Backcolorstyle == 0 )
         {
            subGridrecetastinteprocesosquimicos_sdts_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridrecetastinteprocesosquimicos_sdts_Class) > 0 )
            {
               subGridrecetastinteprocesosquimicos_sdts_Linesclass = subGridrecetastinteprocesosquimicos_sdts_Class+"Title" ;
            }
         }
         else
         {
            subGridrecetastinteprocesosquimicos_sdts_Titlebackstyle = (byte)(1) ;
            if ( subGridrecetastinteprocesosquimicos_sdts_Backcolorstyle == 1 )
            {
               subGridrecetastinteprocesosquimicos_sdts_Titlebackcolor = subGridrecetastinteprocesosquimicos_sdts_Allbackcolor ;
               if ( GXutil.len( subGridrecetastinteprocesosquimicos_sdts_Class) > 0 )
               {
                  subGridrecetastinteprocesosquimicos_sdts_Linesclass = subGridrecetastinteprocesosquimicos_sdts_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridrecetastinteprocesosquimicos_sdts_Class) > 0 )
               {
                  subGridrecetastinteprocesosquimicos_sdts_Linesclass = subGridrecetastinteprocesosquimicos_sdts_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("GridName", "Gridrecetastinteprocesosquimicos_sdts");
      }
      else
      {
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("GridName", "Gridrecetastinteprocesosquimicos_sdts");
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("Header", subGridrecetastinteprocesosquimicos_sdts_Header);
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridrecetastinteprocesosquimicos_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("CmpContext", "");
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("InMasterPage", "false");
         Gridrecetastinteprocesosquimicos_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddColumnProperties(Gridrecetastinteprocesosquimicos_sdtsColumn);
         Gridrecetastinteprocesosquimicos_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddColumnProperties(Gridrecetastinteprocesosquimicos_sdtsColumn);
         Gridrecetastinteprocesosquimicos_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddColumnProperties(Gridrecetastinteprocesosquimicos_sdtsColumn);
         Gridrecetastinteprocesosquimicos_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridrecetastinteprocesosquimicos_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetastinteprocesosquimicos_sdts__profordsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddColumnProperties(Gridrecetastinteprocesosquimicos_sdtsColumn);
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridrecetastinteprocesosquimicos_sdts_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridrecetastinteprocesosquimicos_sdts_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridrecetastinteprocesosquimicos_sdts_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridrecetastinteprocesosquimicos_sdts_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridrecetastinteprocesosquimicos_sdts_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridrecetastinteprocesosquimicos_sdts_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Gridrecetastinteprocesosquimicos_sdtsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridrecetastinteprocesosquimicos_sdts_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      bttBtnadd_Internalname = "BTNADD" ;
      chkavRecetastinteprocesosquimicos_sdts__eliminar.setInternalname( "RECETASTINTEPROCESOSQUIMICOS_SDTS__ELIMINAR" );
      edtavRecetastinteprocesosquimicos_sdts__numerodelinea_Internalname = "RECETASTINTEPROCESOSQUIMICOS_SDTS__NUMERODELINEA" ;
      edtavRecetastinteprocesosquimicos_sdts__proforcod_Internalname = "RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD" ;
      edtavRecetastinteprocesosquimicos_sdts__profordsc_Internalname = "RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORDSC" ;
      bttBtneliminarproceso_Internalname = "BTNELIMINARPROCESO" ;
      bttBtnreordenarprocesos_Internalname = "BTNREORDENARPROCESOS" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_recetastinteprocesosquimicos_sdts__proforcod_Internalname = "COMBO_RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD" ;
      Dvelop_confirmpanel_eliminarproceso_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARPROCESO" ;
      tblTabledvelop_confirmpanel_eliminarproceso_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARPROCESO" ;
      Gridrecetastinteprocesosquimicos_sdts_empowerer_Internalname = "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridrecetastinteprocesosquimicos_sdts_Internalname = "GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      subGridrecetastinteprocesosquimicos_sdts_Allowcollapsing = (byte)(0) ;
      subGridrecetastinteprocesosquimicos_sdts_Allowselection = (byte)(0) ;
      subGridrecetastinteprocesosquimicos_sdts_Header = "" ;
      edtavRecetastinteprocesosquimicos_sdts__profordsc_Jsonclick = "" ;
      edtavRecetastinteprocesosquimicos_sdts__profordsc_Enabled = 0 ;
      edtavRecetastinteprocesosquimicos_sdts__proforcod_Jsonclick = "" ;
      edtavRecetastinteprocesosquimicos_sdts__proforcod_Visible = -1 ;
      edtavRecetastinteprocesosquimicos_sdts__proforcod_Enabled = 1 ;
      edtavRecetastinteprocesosquimicos_sdts__numerodelinea_Jsonclick = "" ;
      edtavRecetastinteprocesosquimicos_sdts__numerodelinea_Visible = -1 ;
      edtavRecetastinteprocesosquimicos_sdts__numerodelinea_Enabled = 1 ;
      chkavRecetastinteprocesosquimicos_sdts__eliminar.setCaption( "" );
      chkavRecetastinteprocesosquimicos_sdts__eliminar.setVisible( -1 );
      chkavRecetastinteprocesosquimicos_sdts__eliminar.setEnabled( 1 );
      subGridrecetastinteprocesosquimicos_sdts_Class = "GridNoBorder WorkWith" ;
      subGridrecetastinteprocesosquimicos_sdts_Backcolorstyle = (byte)(0) ;
      edtavRecetastinteprocesosquimicos_sdts__profordsc_Enabled = -1 ;
      Gridrecetastinteprocesosquimicos_sdts_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_eliminarproceso_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarproceso_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarproceso_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarproceso_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarproceso_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarproceso_Confirmationtext = "¿Desea Eliminar?" ;
      Dvelop_confirmpanel_eliminarproceso_Title = "" ;
      Combo_recetastinteprocesosquimicos_sdts__proforcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_recetastinteprocesosquimicos_sdts__proforcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_recetastinteprocesosquimicos_sdts__proforcod_Titlecontrolidtoreplace = "" ;
      Combo_recetastinteprocesosquimicos_sdts__proforcod_Cls = "ExtendedCombo" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Recetas Tinte( Procesos Quimicos)", "") );
      subGridrecetastinteprocesosquimicos_sdts_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "RECETASTINTEPROCESOSQUIMICOS_SDTS__ELIMINAR_" + sGXsfl_23_idx ;
      chkavRecetastinteprocesosquimicos_sdts__eliminar.setName( GXCCtl );
      chkavRecetastinteprocesosquimicos_sdts__eliminar.setWebtags( "" );
      chkavRecetastinteprocesosquimicos_sdts__eliminar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavRecetastinteprocesosquimicos_sdts__eliminar.getInternalname(), "TitleCaption", chkavRecetastinteprocesosquimicos_sdts__eliminar.getCaption(), !bGXsfl_23_Refreshing);
      chkavRecetastinteprocesosquimicos_sdts__eliminar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF'},{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23},{av:'subGridrecetastinteprocesosquimicos_sdts_Rows',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'Rows'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS.LOAD","{handler:'e181G22',iparms:[]");
      setEventMetadata("GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS.LOAD",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e131G22',iparms:[{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23},{av:'AV20Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV9Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV10Forser',fld:'vFORSER',pic:''},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF'},{av:'subGridrecetastinteprocesosquimicos_sdts_Rows',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'Rows'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV19RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:''},{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e141G22',iparms:[{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23},{av:'AV20Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV9Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV10Forser',fld:'vFORSER',pic:''},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF'},{av:'subGridrecetastinteprocesosquimicos_sdts_Rows',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'Rows'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[{av:'AV19RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:''},{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23}]}");
      setEventMetadata("'DOADD'","{handler:'e151G22',iparms:[{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF'},{av:'subGridrecetastinteprocesosquimicos_sdts_Rows',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'Rows'}]");
      setEventMetadata("'DOADD'",",oparms:[{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23}]}");
      setEventMetadata("'DOELIMINARPROCESO'","{handler:'e111G21',iparms:[]");
      setEventMetadata("'DOELIMINARPROCESO'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARPROCESO.CLOSE","{handler:'e121G22',iparms:[{av:'Dvelop_confirmpanel_eliminarproceso_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARPROCESO',prop:'Result'},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF'},{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23},{av:'subGridrecetastinteprocesosquimicos_sdts_Rows',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'Rows'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARPROCESO.CLOSE",",oparms:[{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23}]}");
      setEventMetadata("'DOREORDENARPROCESOS'","{handler:'e161G22',iparms:[{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF'},{av:'subGridrecetastinteprocesosquimicos_sdts_Rows',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'Rows'}]");
      setEventMetadata("'DOREORDENARPROCESOS'",",oparms:[{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23}]}");
      setEventMetadata("'DOTEST'","{handler:'e191G22',iparms:[{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF'},{av:'subGridrecetastinteprocesosquimicos_sdts_Rows',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'Rows'}]");
      setEventMetadata("'DOTEST'",",oparms:[{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23}]}");
      setEventMetadata("RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD.ISVALID","{handler:'e201G22',iparms:[{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF'},{av:'subGridrecetastinteprocesosquimicos_sdts_Rows',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'Rows'}]");
      setEventMetadata("RECETASTINTEPROCESOSQUIMICOS_SDTS__PROFORCOD.ISVALID",",oparms:[{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23}]}");
      setEventMetadata("RECETASTINTEPROCESOSQUIMICOS_SDTS__NUMERODELINEA.ISVALID","{handler:'e211G22',iparms:[{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF'},{av:'subGridrecetastinteprocesosquimicos_sdts_Rows',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'Rows'}]");
      setEventMetadata("RECETASTINTEPROCESOSQUIMICOS_SDTS__NUMERODELINEA.ISVALID",",oparms:[{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23}]}");
      setEventMetadata("GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_FIRSTPAGE","{handler:'subgridrecetastinteprocesosquimicos_sdts_firstpage',iparms:[{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF'},{av:'subGridrecetastinteprocesosquimicos_sdts_Rows',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'Rows'},{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23}]");
      setEventMetadata("GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_PREVPAGE","{handler:'subgridrecetastinteprocesosquimicos_sdts_previouspage',iparms:[{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF'},{av:'subGridrecetastinteprocesosquimicos_sdts_Rows',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'Rows'},{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23}]");
      setEventMetadata("GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_NEXTPAGE","{handler:'subgridrecetastinteprocesosquimicos_sdts_nextpage',iparms:[{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF'},{av:'subGridrecetastinteprocesosquimicos_sdts_Rows',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'Rows'},{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23}]");
      setEventMetadata("GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_LASTPAGE","{handler:'subgridrecetastinteprocesosquimicos_sdts_lastpage',iparms:[{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage'},{av:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF'},{av:'subGridrecetastinteprocesosquimicos_sdts_Rows',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'Rows'},{av:'AV18RecetasTinteProcesosQuimicos_SDTs',fld:'vRECETASTINTEPROCESOSQUIMICOS_SDTS',grid:23,pic:''},{av:'nGXsfl_23_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:23},{av:'nRC_GXsfl_23',ctrl:'GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS',prop:'GridRC',grid:23}]");
      setEventMetadata("GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_LASTPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv5',iparms:[]");
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
      wcpOAV7Emprcod = "" ;
      wcpOAV10Forser = "" ;
      wcpOAV8Forcolnom = "" ;
      wcpOAV19RecetasTinteProcesosQuimicosToJson = "" ;
      Dvelop_confirmpanel_eliminarproceso_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7Emprcod = "" ;
      AV10Forser = "" ;
      AV8Forcolnom = "" ;
      AV19RecetasTinteProcesosQuimicosToJson = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV18RecetasTinteProcesosQuimicos_SDTs = new GXBaseCollection<app.SdtRecetasTinteProcesosQuimicos_SDT>(app.SdtRecetasTinteProcesosQuimicos_SDT.class, "RecetasTinteProcesosQuimicos_SDT", "TexplusNET", remoteHandle);
      AV28RecetasTinteProcesosQuimicos_SDTs__Proforcod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridrecetastinteprocesosquimicos_sdts_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnadd_Jsonclick = "" ;
      Gridrecetastinteprocesosquimicos_sdtsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      bttBtneliminarproceso_Jsonclick = "" ;
      bttBtnreordenarprocesos_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucCombo_recetastinteprocesosquimicos_sdts__proforcod = new com.genexus.webpanels.GXUserControl();
      Combo_recetastinteprocesosquimicos_sdts__proforcod_Caption = "" ;
      ucGridrecetastinteprocesosquimicos_sdts_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      H01G22_A831TipColCod = new byte[1] ;
      H01G22_A483ForColNum = new int[1] ;
      H01G22_A482ForColNom = new String[] {""} ;
      H01G22_A494ForSer = new String[] {""} ;
      H01G22_A252CliCod = new int[1] ;
      H01G22_A396EmprCod = new String[] {""} ;
      H01G22_A764ProForCod = new String[] {""} ;
      H01G22_A766ProForDsc = new String[] {""} ;
      H01G22_A1160ProForL = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      AV17RecetasTinteProcesosQuimicos_SDT = new app.SdtRecetasTinteProcesosQuimicos_SDT(remoteHandle, context);
      AV38Station = "" ;
      GXv_char2 = new String[1] ;
      AV39Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV40Usurcod = "" ;
      Gridrecetastinteprocesosquimicos_sdtsRow = new com.genexus.webpanels.GXWebRow();
      H01G23_A396EmprCod = new String[] {""} ;
      H01G23_A13133ProForAct = new String[] {""} ;
      H01G23_A13740ProFDsc = new String[] {""} ;
      H01G23_A764ProForCod = new String[] {""} ;
      H01G23_A766ProForDsc = new String[] {""} ;
      A13133ProForAct = "" ;
      A13740ProFDsc = "" ;
      AV29Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      ucDvelop_confirmpanel_eliminarproceso = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridrecetastinteprocesosquimicos_sdts_Linesclass = "" ;
      ROClassString = "" ;
      Gridrecetastinteprocesosquimicos_sdtsColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetastinteprocesosquimicos_wp__default(),
         new Object[] {
             new Object[] {
            H01G22_A831TipColCod, H01G22_A483ForColNum, H01G22_A482ForColNom, H01G22_A494ForSer, H01G22_A252CliCod, H01G22_A396EmprCod, H01G22_A764ProForCod, H01G22_A766ProForDsc, H01G22_A1160ProForL
            }
            , new Object[] {
            H01G23_A396EmprCod, H01G23_A13133ProForAct, H01G23_A13740ProFDsc, H01G23_A764ProForCod, H01G23_A766ProForDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavRecetastinteprocesosquimicos_sdts__profordsc_Enabled = 0 ;
   }

   private byte wcpOAV20Tipcolcod ;
   private byte GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV20Tipcolcod ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGridrecetastinteprocesosquimicos_sdts_Backcolorstyle ;
   private byte A831TipColCod ;
   private byte nGXWrapped ;
   private byte subGridrecetastinteprocesosquimicos_sdts_Backstyle ;
   private byte subGridrecetastinteprocesosquimicos_sdts_Titlebackstyle ;
   private byte subGridrecetastinteprocesosquimicos_sdts_Allowselection ;
   private byte subGridrecetastinteprocesosquimicos_sdts_Allowhovering ;
   private byte subGridrecetastinteprocesosquimicos_sdts_Allowcollapsing ;
   private byte subGridrecetastinteprocesosquimicos_sdts_Collapsed ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV21Tabla_Lformu ;
   private short A1160ProForL ;
   private short AV25NumerodeLinea ;
   private short AV15i ;
   private short AV27q ;
   private int wcpOAV6Clicod ;
   private int wcpOAV9Forcolnum ;
   private int nRC_GXsfl_23 ;
   private int subGridrecetastinteprocesosquimicos_sdts_Rows ;
   private int AV6Clicod ;
   private int AV9Forcolnum ;
   private int nGXsfl_23_idx=1 ;
   private int AV32GXV1 ;
   private int subGridrecetastinteprocesosquimicos_sdts_Islastpage ;
   private int edtavRecetastinteprocesosquimicos_sdts__profordsc_Enabled ;
   private int GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nGridOutOfScope ;
   private int nGXsfl_23_fel_idx=1 ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int nGXsfl_23_bak_idx=1 ;
   private int idxLst ;
   private int subGridrecetastinteprocesosquimicos_sdts_Backcolor ;
   private int subGridrecetastinteprocesosquimicos_sdts_Allbackcolor ;
   private int edtavRecetastinteprocesosquimicos_sdts__numerodelinea_Enabled ;
   private int edtavRecetastinteprocesosquimicos_sdts__numerodelinea_Visible ;
   private int edtavRecetastinteprocesosquimicos_sdts__proforcod_Enabled ;
   private int edtavRecetastinteprocesosquimicos_sdts__proforcod_Visible ;
   private int subGridrecetastinteprocesosquimicos_sdts_Titlebackcolor ;
   private int subGridrecetastinteprocesosquimicos_sdts_Selectedindex ;
   private int subGridrecetastinteprocesosquimicos_sdts_Selectioncolor ;
   private int subGridrecetastinteprocesosquimicos_sdts_Hoveringcolor ;
   private long GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nFirstRecordOnPage ;
   private long GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nCurrentRecord ;
   private long GRIDRECETASTINTEPROCESOSQUIMICOS_SDTS_nRecordCount ;
   private String wcpOAV7Emprcod ;
   private String wcpOAV10Forser ;
   private String wcpOAV8Forcolnom ;
   private String Dvelop_confirmpanel_eliminarproceso_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7Emprcod ;
   private String AV10Forser ;
   private String AV8Forcolnom ;
   private String sGXsfl_23_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Combo_recetastinteprocesosquimicos_sdts__proforcod_Cls ;
   private String Combo_recetastinteprocesosquimicos_sdts__proforcod_Titlecontrolidtoreplace ;
   private String Dvelop_confirmpanel_eliminarproceso_Title ;
   private String Dvelop_confirmpanel_eliminarproceso_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarproceso_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarproceso_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarproceso_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarproceso_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarproceso_Confirmtype ;
   private String Gridrecetastinteprocesosquimicos_sdts_empowerer_Gridinternalname ;
   private String Gridrecetastinteprocesosquimicos_sdts_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String bttBtnadd_Internalname ;
   private String bttBtnadd_Jsonclick ;
   private String sStyleString ;
   private String subGridrecetastinteprocesosquimicos_sdts_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtneliminarproceso_Internalname ;
   private String bttBtneliminarproceso_Jsonclick ;
   private String bttBtnreordenarprocesos_Internalname ;
   private String bttBtnreordenarprocesos_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_recetastinteprocesosquimicos_sdts__proforcod_Caption ;
   private String Combo_recetastinteprocesosquimicos_sdts__proforcod_Internalname ;
   private String Gridrecetastinteprocesosquimicos_sdts_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String edtavRecetastinteprocesosquimicos_sdts__profordsc_Internalname ;
   private String sGXsfl_23_fel_idx="0001" ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String AV38Station ;
   private String GXv_char2[] ;
   private String AV39Emprnom ;
   private String GXv_char3[] ;
   private String AV40Usurcod ;
   private String edtavRecetastinteprocesosquimicos_sdts__proforcod_Internalname ;
   private String A13133ProForAct ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_eliminarproceso_Internalname ;
   private String Dvelop_confirmpanel_eliminarproceso_Internalname ;
   private String edtavRecetastinteprocesosquimicos_sdts__numerodelinea_Internalname ;
   private String subGridrecetastinteprocesosquimicos_sdts_Class ;
   private String subGridrecetastinteprocesosquimicos_sdts_Linesclass ;
   private String ROClassString ;
   private String edtavRecetastinteprocesosquimicos_sdts__numerodelinea_Jsonclick ;
   private String edtavRecetastinteprocesosquimicos_sdts__proforcod_Jsonclick ;
   private String edtavRecetastinteprocesosquimicos_sdts__profordsc_Jsonclick ;
   private String subGridrecetastinteprocesosquimicos_sdts_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Combo_recetastinteprocesosquimicos_sdts__proforcod_Isgriditem ;
   private boolean Combo_recetastinteprocesosquimicos_sdts__proforcod_Emptyitem ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_23_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV23 ;
   private boolean AV26IsOk ;
   private String wcpOAV19RecetasTinteProcesosQuimicosToJson ;
   private String AV19RecetasTinteProcesosQuimicosToJson ;
   private String A13740ProFDsc ;
   private com.genexus.webpanels.GXWebGrid Gridrecetastinteprocesosquimicos_sdtsContainer ;
   private com.genexus.webpanels.GXWebRow Gridrecetastinteprocesosquimicos_sdtsRow ;
   private com.genexus.webpanels.GXWebColumn Gridrecetastinteprocesosquimicos_sdtsColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_recetastinteprocesosquimicos_sdts__proforcod ;
   private com.genexus.webpanels.GXUserControl ucGridrecetastinteprocesosquimicos_sdts_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarproceso ;
   private ICheckbox chkavRecetastinteprocesosquimicos_sdts__eliminar ;
   private IDataStoreProvider pr_default ;
   private byte[] H01G22_A831TipColCod ;
   private int[] H01G22_A483ForColNum ;
   private String[] H01G22_A482ForColNom ;
   private String[] H01G22_A494ForSer ;
   private int[] H01G22_A252CliCod ;
   private String[] H01G22_A396EmprCod ;
   private String[] H01G22_A764ProForCod ;
   private String[] H01G22_A766ProForDsc ;
   private short[] H01G22_A1160ProForL ;
   private String[] H01G23_A396EmprCod ;
   private String[] H01G23_A13133ProForAct ;
   private String[] H01G23_A13740ProFDsc ;
   private String[] H01G23_A764ProForCod ;
   private String[] H01G23_A766ProForDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtRecetasTinteProcesosQuimicos_SDT> AV18RecetasTinteProcesosQuimicos_SDTs ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV28RecetasTinteProcesosQuimicos_SDTs__Proforcod_Data ;
   private app.SdtRecetasTinteProcesosQuimicos_SDT AV17RecetasTinteProcesosQuimicos_SDT ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV29Combo_DataItem ;
}

final  class recetastinteprocesosquimicos_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01G22", "SELECT T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.EmprCod, T1.ProForCod, T2.ProForDsc, T1.ProForL FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01G23", "SELECT EmprCod, ProForAct, RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, ProForCod, ProForDsc FROM TXPCPROFO WHERE ProForAct = 'S' ORDER BY ProFDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

