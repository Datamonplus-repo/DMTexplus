package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class procesosquimicos_claves_tipodetejidoymaquina_wc_impl extends GXWebComponent
{
   public procesosquimicos_claves_tipodetejidoymaquina_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public procesosquimicos_claves_tipodetejidoymaquina_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesosquimicos_claves_tipodetejidoymaquina_wc_impl.class ));
   }

   public procesosquimicos_claves_tipodetejidoymaquina_wc_impl( int remoteHandle ,
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
      cmbavFuncion = new HTMLChoice();
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
               AV9EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9EmprCod", AV9EmprCod);
               AV12ProForCla = httpContext.GetPar( "ProForCla") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12ProForCla", AV12ProForCla);
               AV11PrdMaxFind = httpContext.GetPar( "PrdMaxFind") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11PrdMaxFind", AV11PrdMaxFind);
               AV14ProForUli = (short)(GXutil.lval( httpContext.GetPar( "ProForUli"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ProForUli), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV9EmprCod,AV12ProForCla,AV11PrdMaxFind,Short.valueOf(AV14ProForUli)});
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

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1NR2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Clave Tipo de Tejido y Maquina", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.procesosquimicos_claves_tipodetejidoymaquina_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV9EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV12ProForCla)),GXutil.URLEncode(GXutil.rtrim(AV11PrdMaxFind)),GXutil.URLEncode(GXutil.ltrimstr(AV14ProForUli,4,0))}, new String[] {"EmprCod","ProForCla","PrdMaxFind","ProForUli"}) +"\">") ;
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
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCLASCOD_DATA", AV18Clascod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCLASCOD_DATA", AV18Clascod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMAQCOD_DATA", AV16MaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMAQCOD_DATA", AV16MaqCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9EmprCod", GXutil.rtrim( wcpOAV9EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11PrdMaxFind", GXutil.rtrim( wcpOAV11PrdMaxFind));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14ProForUli", GXutil.ltrim( localUtil.ntoc( wcpOAV14ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV9EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAG", GXutil.ltrim( localUtil.ntoc( AV10Flag, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDMAXFIND", GXutil.rtrim( AV11PrdMaxFind));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROFORCLA", GXutil.rtrim( AV12ProForCla));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROFORULI", GXutil.ltrim( localUtil.ntoc( AV14ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COMBO_CLASCOD_Cls", GXutil.rtrim( Combo_clascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COMBO_CLASCOD_Selectedvalue_set", GXutil.rtrim( Combo_clascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COMBO_CLASCOD_Emptyitem", GXutil.booltostr( Combo_clascod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COMBO_MAQCOD_Cls", GXutil.rtrim( Combo_maqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COMBO_MAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_maqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COMBO_MAQCOD_Emptyitem", GXutil.booltostr( Combo_maqcod_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COMBO_CLASCOD_Selectedvalue_get", GXutil.rtrim( Combo_clascod_Selectedvalue_get));
   }

   public void renderHtmlCloseForm1NR2( )
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
      return "FormulacionTinte.ProcesosQuimicos_Claves_TipodeTejidoyMaquina_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Clave Tipo de Tejido y Maquina", "") ;
   }

   public void wb1NR0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.procesosquimicos_claves_tipodetejidoymaquina_wc");
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
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clascod_Internalname, httpContext.getMessage( "Tipo Tela", ""), "", "", lblTextblockcombo_clascod_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_TipodeTejidoyMaquina_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clascod.setProperty("Caption", Combo_clascod_Caption);
         ucCombo_clascod.setProperty("Cls", Combo_clascod_Cls);
         ucCombo_clascod.setProperty("EmptyItem", Combo_clascod_Emptyitem);
         ucCombo_clascod.setProperty("DropDownOptionsData", AV18Clascod_Data);
         ucCombo_clascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clascod_Internalname, sPrefix+"COMBO_CLASCODContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcod_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblockcombo_maqcod_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_TipodeTejidoyMaquina_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcod.setProperty("Caption", Combo_maqcod_Caption);
         ucCombo_maqcod.setProperty("Cls", Combo_maqcod_Cls);
         ucCombo_maqcod.setProperty("EmptyItem", Combo_maqcod_Emptyitem);
         ucCombo_maqcod.setProperty("DropDownOptionsData", AV16MaqCod_Data);
         ucCombo_maqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod_Internalname, sPrefix+"COMBO_MAQCODContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavFuncion.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavFuncion.getInternalname(), httpContext.getMessage( "Funcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'" + sPrefix + "',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavFuncion, cmbavFuncion.getInternalname(), GXutil.rtrim( AV6Funcion), 1, cmbavFuncion.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavFuncion.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"", "", true, (byte)(0), "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_TipodeTejidoyMaquina_WC.htm");
         cmbavFuncion.setValue( GXutil.rtrim( AV6Funcion) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavFuncion.getInternalname(), "Values", cmbavFuncion.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClave_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClave_Internalname, httpContext.getMessage( "Clave", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClave_Internalname, GXutil.rtrim( AV5Clave), GXutil.rtrim( localUtil.format( AV5Clave, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClave_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClave_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_TipodeTejidoyMaquina_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Generar Clave", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Generar Clave", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_TipodeTejidoyMaquina_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClascod_Internalname, GXutil.ltrim( localUtil.ntoc( AV8Clascod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8Clascod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClascod_Jsonclick, 0, "Attribute", "", "", "", "", edtavClascod_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_TipodeTejidoyMaquina_WC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, GXutil.rtrim( AV7MaqCod), GXutil.rtrim( localUtil.format( AV7MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcod_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_TipodeTejidoyMaquina_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1NR2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Clave Tipo de Tejido y Maquina", ""), (short)(0)) ;
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
            strup1NR0( ) ;
         }
      }
   }

   public void ws1NR2( )
   {
      start1NR2( ) ;
      evt1NR2( ) ;
   }

   public void evt1NR2( )
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
                              strup1NR0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e111NR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoConfirmar' */
                                 e121NR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e131NR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NR0( ) ;
                           }
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
                              strup1NR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavFuncion.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1NR2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1NR2( ) ;
         }
      }
   }

   public void pa1NR2( )
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
            GX_FocusControl = cmbavFuncion.getInternalname() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
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
      if ( cmbavFuncion.getItemCount() > 0 )
      {
         AV6Funcion = cmbavFuncion.getValidValue(AV6Funcion) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Funcion", AV6Funcion);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavFuncion.setValue( GXutil.rtrim( AV6Funcion) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavFuncion.getInternalname(), "Values", cmbavFuncion.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1NR2( ) ;
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
      edtavClave_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClave_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClave_Enabled), 5, 0), true);
   }

   public void rf1NR2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e131NR2 ();
         wb1NR0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1NR2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavClave_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClave_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClave_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1NR0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111NR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCLASCOD_DATA"), AV18Clascod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMAQCOD_DATA"), AV16MaqCod_Data);
         /* Read saved values. */
         wcpOAV9EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV9EmprCod") ;
         wcpOAV11PrdMaxFind = httpContext.cgiGet( sPrefix+"wcpOAV11PrdMaxFind") ;
         wcpOAV14ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14ProForUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Combo_clascod_Cls = httpContext.cgiGet( sPrefix+"COMBO_CLASCOD_Cls") ;
         Combo_clascod_Selectedvalue_set = httpContext.cgiGet( sPrefix+"COMBO_CLASCOD_Selectedvalue_set") ;
         Combo_clascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( sPrefix+"COMBO_CLASCOD_Emptyitem")) ;
         Combo_maqcod_Cls = httpContext.cgiGet( sPrefix+"COMBO_MAQCOD_Cls") ;
         Combo_maqcod_Selectedvalue_set = httpContext.cgiGet( sPrefix+"COMBO_MAQCOD_Selectedvalue_set") ;
         Combo_maqcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( sPrefix+"COMBO_MAQCOD_Emptyitem")) ;
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
         /* Read variables values. */
         cmbavFuncion.setValue( httpContext.cgiGet( cmbavFuncion.getInternalname()) );
         AV6Funcion = httpContext.cgiGet( cmbavFuncion.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Funcion", AV6Funcion);
         AV5Clave = httpContext.cgiGet( edtavClave_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clave", AV5Clave);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClascod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClascod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLASCOD");
            GX_FocusControl = edtavClascod_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8Clascod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Clascod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clascod), 4, 0));
         }
         else
         {
            AV8Clascod = (short)(localUtil.ctol( httpContext.cgiGet( edtavClascod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Clascod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clascod), 4, 0));
         }
         AV7MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCod", AV7MaqCod);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e111NR2 ();
      if (returnInSub) return;
   }

   public void e111NR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV21Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      procesosquimicos_claves_tipodetejidoymaquina_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Station = GXt_char1 ;
      GXv_char2[0] = AV9EmprCod ;
      GXv_char3[0] = AV22Emprnom ;
      GXv_char4[0] = AV23Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char2, GXv_char3, GXv_char4) ;
      procesosquimicos_claves_tipodetejidoymaquina_wc_impl.this.AV9EmprCod = GXv_char2[0] ;
      procesosquimicos_claves_tipodetejidoymaquina_wc_impl.this.AV22Emprnom = GXv_char3[0] ;
      procesosquimicos_claves_tipodetejidoymaquina_wc_impl.this.AV23Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9EmprCod", AV9EmprCod);
      edtavMaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Visible), 5, 0), true);
      edtavClascod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClascod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClascod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLASCOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S122 ();
      if (returnInSub) return;
   }

   public void e121NR2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV9EmprCod ;
      GXv_int5[0] = AV8Clascod ;
      GXv_int6[0] = AV10Flag ;
      new app.pbusclas(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6) ;
      procesosquimicos_claves_tipodetejidoymaquina_wc_impl.this.AV9EmprCod = GXv_char4[0] ;
      procesosquimicos_claves_tipodetejidoymaquina_wc_impl.this.AV8Clascod = GXv_int5[0] ;
      procesosquimicos_claves_tipodetejidoymaquina_wc_impl.this.AV10Flag = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9EmprCod", AV9EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Clascod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clascod), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Flag", GXutil.str( AV10Flag, 1, 0));
      if ( (0==AV10Flag) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Tipo Tejido¡", ""));
      }
      else
      {
         GXv_char4[0] = AV9EmprCod ;
         GXv_char3[0] = AV7MaqCod ;
         GXv_int6[0] = AV10Flag ;
         new app.pbusmqt(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
         procesosquimicos_claves_tipodetejidoymaquina_wc_impl.this.AV9EmprCod = GXv_char4[0] ;
         procesosquimicos_claves_tipodetejidoymaquina_wc_impl.this.AV7MaqCod = GXv_char3[0] ;
         procesosquimicos_claves_tipodetejidoymaquina_wc_impl.this.AV10Flag = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9EmprCod", AV9EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7MaqCod", AV7MaqCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Flag", GXutil.str( AV10Flag, 1, 0));
         if ( AV10Flag == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Maquina Inexistente", ""));
            GX_FocusControl = edtavMaqcod_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( (GXutil.strcmp("", AV11PrdMaxFind)==0) && ( GXutil.strcmp(AV6Funcion, httpContext.getMessage( "A", "")) != 0 ) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Solo puede utilizar Añadir Producto", ""));
            }
            else
            {
               AV5Clave = httpContext.getMessage( "AZ", "") + " " + GXutil.padl( GXutil.trim( GXutil.str( AV8Clascod, 4, 0)), (short)(4), "0") + " " + AV7MaqCod + " " + AV6Funcion ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Clave", AV5Clave);
               AV12ProForCla = AV5Clave ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12ProForCla", AV12ProForCla);
               AV13WebSession.setValue("ProForCla", AV12ProForCla);
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'LOADCOMBOMAQCOD' Routine */
      returnInSub = false ;
      /* Using cursor H01NR2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13734MaqCDsc = H01NR2_A13734MaqCDsc[0] ;
         A602MaqCod = H01NR2_A602MaqCod[0] ;
         A606MaqDsc = H01NR2_A606MaqDsc[0] ;
         n606MaqDsc = H01NR2_n606MaqDsc[0] ;
         AV17Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV17Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV17Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13734MaqCDsc );
         AV16MaqCod_Data.add(AV17Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_maqcod_Selectedvalue_set = AV7MaqCod ;
      ucCombo_maqcod.sendProperty(context, sPrefix, false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLASCOD' Routine */
      returnInSub = false ;
      /* Using cursor H01NR3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13804ClasDscID = H01NR3_A13804ClasDscID[0] ;
         A4295ClasCod = H01NR3_A4295ClasCod[0] ;
         A4296ClasDsc = H01NR3_A4296ClasDsc[0] ;
         n4296ClasDsc = H01NR3_n4296ClasDsc[0] ;
         AV17Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV17Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A4295ClasCod, 4, 0)) );
         AV17Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13804ClasDscID );
         AV18Clascod_Data.add(AV17Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_clascod_Selectedvalue_set = ((0==AV8Clascod) ? "" : GXutil.trim( GXutil.str( AV8Clascod, 4, 0))) ;
      ucCombo_clascod.sendProperty(context, sPrefix, false, Combo_clascod_Internalname, "SelectedValue_set", Combo_clascod_Selectedvalue_set);
   }

   protected void nextLoad( )
   {
   }

   protected void e131NR2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV9EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9EmprCod", AV9EmprCod);
      AV12ProForCla = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12ProForCla", AV12ProForCla);
      AV11PrdMaxFind = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11PrdMaxFind", AV11PrdMaxFind);
      AV14ProForUli = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ProForUli), 4, 0));
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
      pa1NR2( ) ;
      ws1NR2( ) ;
      we1NR2( ) ;
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
      sCtrlAV9EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV12ProForCla = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV11PrdMaxFind = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV14ProForUli = (String)getParm(obj,3,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1NR2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\procesosquimicos_claves_tipodetejidoymaquina_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1NR2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV9EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9EmprCod", AV9EmprCod);
         AV12ProForCla = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12ProForCla", AV12ProForCla);
         AV11PrdMaxFind = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11PrdMaxFind", AV11PrdMaxFind);
         AV14ProForUli = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ProForUli), 4, 0));
      }
      wcpOAV9EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV9EmprCod") ;
      wcpOAV11PrdMaxFind = httpContext.cgiGet( sPrefix+"wcpOAV11PrdMaxFind") ;
      wcpOAV14ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14ProForUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV9EmprCod, wcpOAV9EmprCod) != 0 ) || ( GXutil.strcmp(AV11PrdMaxFind, wcpOAV11PrdMaxFind) != 0 ) || ( AV14ProForUli != wcpOAV14ProForUli ) ) )
      {
         setjustcreated();
      }
      wcpOAV9EmprCod = AV9EmprCod ;
      wcpOAV11PrdMaxFind = AV11PrdMaxFind ;
      wcpOAV14ProForUli = AV14ProForUli ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV9EmprCod = httpContext.cgiGet( sPrefix+"AV9EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV9EmprCod) > 0 )
      {
         AV9EmprCod = httpContext.cgiGet( sCtrlAV9EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9EmprCod", AV9EmprCod);
      }
      else
      {
         AV9EmprCod = httpContext.cgiGet( sPrefix+"AV9EmprCod_PARM") ;
      }
      sCtrlAV12ProForCla = httpContext.cgiGet( sPrefix+"AV12ProForCla_CTRL") ;
      if ( GXutil.len( sCtrlAV12ProForCla) > 0 )
      {
         AV12ProForCla = httpContext.cgiGet( sCtrlAV12ProForCla) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12ProForCla", AV12ProForCla);
      }
      else
      {
         AV12ProForCla = httpContext.cgiGet( sPrefix+"AV12ProForCla_PARM") ;
      }
      sCtrlAV11PrdMaxFind = httpContext.cgiGet( sPrefix+"AV11PrdMaxFind_CTRL") ;
      if ( GXutil.len( sCtrlAV11PrdMaxFind) > 0 )
      {
         AV11PrdMaxFind = httpContext.cgiGet( sCtrlAV11PrdMaxFind) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11PrdMaxFind", AV11PrdMaxFind);
      }
      else
      {
         AV11PrdMaxFind = httpContext.cgiGet( sPrefix+"AV11PrdMaxFind_PARM") ;
      }
      sCtrlAV14ProForUli = httpContext.cgiGet( sPrefix+"AV14ProForUli_CTRL") ;
      if ( GXutil.len( sCtrlAV14ProForUli) > 0 )
      {
         AV14ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV14ProForUli), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ProForUli), 4, 0));
      }
      else
      {
         AV14ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV14ProForUli_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1NR2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1NR2( ) ;
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
      ws1NR2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9EmprCod_PARM", GXutil.rtrim( AV9EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9EmprCod_CTRL", GXutil.rtrim( sCtrlAV9EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12ProForCla_PARM", GXutil.rtrim( AV12ProForCla));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12ProForCla)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12ProForCla_CTRL", GXutil.rtrim( sCtrlAV12ProForCla));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11PrdMaxFind_PARM", GXutil.rtrim( AV11PrdMaxFind));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11PrdMaxFind)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11PrdMaxFind_CTRL", GXutil.rtrim( sCtrlAV11PrdMaxFind));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14ProForUli_PARM", GXutil.ltrim( localUtil.ntoc( AV14ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14ProForUli)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14ProForUli_CTRL", GXutil.rtrim( sCtrlAV14ProForUli));
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
      we1NR2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714145174", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/procesosquimicos_claves_tipodetejidoymaquina_wc.js", "?202681714145174", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockcombo_clascod_Internalname = sPrefix+"TEXTBLOCKCOMBO_CLASCOD" ;
      Combo_clascod_Internalname = sPrefix+"COMBO_CLASCOD" ;
      divTablesplittedclascod_Internalname = sPrefix+"TABLESPLITTEDCLASCOD" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      lblTextblockcombo_maqcod_Internalname = sPrefix+"TEXTBLOCKCOMBO_MAQCOD" ;
      Combo_maqcod_Internalname = sPrefix+"COMBO_MAQCOD" ;
      divTablesplittedmaqcod_Internalname = sPrefix+"TABLESPLITTEDMAQCOD" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      cmbavFuncion.setInternalname( sPrefix+"vFUNCION" );
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      edtavClave_Internalname = sPrefix+"vCLAVE" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE2" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      edtavClascod_Internalname = sPrefix+"vCLASCOD" ;
      edtavMaqcod_Internalname = sPrefix+"vMAQCOD" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
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
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Visible = 1 ;
      edtavClascod_Jsonclick = "" ;
      edtavClascod_Visible = 1 ;
      edtavClave_Jsonclick = "" ;
      edtavClave_Enabled = 1 ;
      cmbavFuncion.setJsonclick( "" );
      cmbavFuncion.setEnabled( 1 );
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
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
      Combo_maqcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_maqcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clascod_Cls = "ExtendedCombo AttributeFL" ;
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
      cmbavFuncion.setName( "vFUNCION" );
      cmbavFuncion.setWebtags( "" );
      cmbavFuncion.addItem("A", httpContext.getMessage( "Añadir Producto", ""), (short)(0));
      cmbavFuncion.addItem("M", httpContext.getMessage( "Modificar Producto", ""), (short)(0));
      cmbavFuncion.addItem("E", httpContext.getMessage( "Eliminar Producto", ""), (short)(0));
      if ( cmbavFuncion.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e121NR2',iparms:[{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Clascod',fld:'vCLASCOD',pic:'ZZZ9'},{av:'AV10Flag',fld:'vFLAG',pic:'9'},{av:'AV7MaqCod',fld:'vMAQCOD',pic:''},{av:'AV11PrdMaxFind',fld:'vPRDMAXFIND',pic:''},{av:'cmbavFuncion'},{av:'AV6Funcion',fld:'vFUNCION',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV10Flag',fld:'vFLAG',pic:'9'},{av:'AV8Clascod',fld:'vCLASCOD',pic:'ZZZ9'},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7MaqCod',fld:'vMAQCOD',pic:''},{av:'AV5Clave',fld:'vCLAVE',pic:''},{av:'AV12ProForCla',fld:'vPROFORCLA',pic:''}]}");
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
      wcpOAV9EmprCod = "" ;
      wcpOAV11PrdMaxFind = "" ;
      Combo_maqcod_Selectedvalue_get = "" ;
      Combo_clascod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV9EmprCod = "" ;
      AV12ProForCla = "" ;
      AV11PrdMaxFind = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV18Clascod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV16MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Combo_clascod_Selectedvalue_set = "" ;
      Combo_maqcod_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clascod_Jsonclick = "" ;
      ucCombo_clascod = new com.genexus.webpanels.GXUserControl();
      Combo_clascod_Caption = "" ;
      lblTextblockcombo_maqcod_Jsonclick = "" ;
      ucCombo_maqcod = new com.genexus.webpanels.GXUserControl();
      Combo_maqcod_Caption = "" ;
      TempTags = "" ;
      AV6Funcion = "" ;
      AV5Clave = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      AV7MaqCod = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV21Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV22Emprnom = "" ;
      AV23Usurcod = "" ;
      GXv_int5 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      AV13WebSession = httpContext.getWebSession();
      scmdbuf = "" ;
      H01NR2_A396EmprCod = new String[] {""} ;
      H01NR2_A13734MaqCDsc = new String[] {""} ;
      H01NR2_A602MaqCod = new String[] {""} ;
      H01NR2_A606MaqDsc = new String[] {""} ;
      H01NR2_n606MaqDsc = new boolean[] {false} ;
      A13734MaqCDsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      AV17Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01NR3_A396EmprCod = new String[] {""} ;
      H01NR3_A13804ClasDscID = new String[] {""} ;
      H01NR3_A4295ClasCod = new short[1] ;
      H01NR3_A4296ClasDsc = new String[] {""} ;
      H01NR3_n4296ClasDsc = new boolean[] {false} ;
      A13804ClasDscID = "" ;
      A4296ClasDsc = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV9EmprCod = "" ;
      sCtrlAV12ProForCla = "" ;
      sCtrlAV11PrdMaxFind = "" ;
      sCtrlAV14ProForUli = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesosquimicos_claves_tipodetejidoymaquina_wc__default(),
         new Object[] {
             new Object[] {
            H01NR2_A396EmprCod, H01NR2_A13734MaqCDsc, H01NR2_A602MaqCod, H01NR2_A606MaqDsc, H01NR2_n606MaqDsc
            }
            , new Object[] {
            H01NR3_A396EmprCod, H01NR3_A13804ClasDscID, H01NR3_A4295ClasCod, H01NR3_A4296ClasDsc, H01NR3_n4296ClasDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavClave_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV10Flag ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private short wcpOAV14ProForUli ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV14ProForUli ;
   private short wbEnd ;
   private short wbStart ;
   private short AV8Clascod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int5[] ;
   private short A4295ClasCod ;
   private int edtavClave_Enabled ;
   private int edtavClascod_Visible ;
   private int edtavMaqcod_Visible ;
   private int idxLst ;
   private String wcpOAV9EmprCod ;
   private String wcpOAV11PrdMaxFind ;
   private String Combo_maqcod_Selectedvalue_get ;
   private String Combo_clascod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV9EmprCod ;
   private String AV12ProForCla ;
   private String AV11PrdMaxFind ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Combo_clascod_Cls ;
   private String Combo_clascod_Selectedvalue_set ;
   private String Combo_maqcod_Cls ;
   private String Combo_maqcod_Selectedvalue_set ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divTablesplittedclascod_Internalname ;
   private String lblTextblockcombo_clascod_Internalname ;
   private String lblTextblockcombo_clascod_Jsonclick ;
   private String Combo_clascod_Caption ;
   private String Combo_clascod_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divTablesplittedmaqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Jsonclick ;
   private String Combo_maqcod_Caption ;
   private String Combo_maqcod_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String TempTags ;
   private String AV6Funcion ;
   private String divUnnamedtable7_Internalname ;
   private String edtavClave_Internalname ;
   private String AV5Clave ;
   private String edtavClave_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClascod_Internalname ;
   private String edtavClascod_Jsonclick ;
   private String edtavMaqcod_Internalname ;
   private String AV7MaqCod ;
   private String edtavMaqcod_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV21Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV22Emprnom ;
   private String AV23Usurcod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A4296ClasDsc ;
   private String sCtrlAV9EmprCod ;
   private String sCtrlAV12ProForCla ;
   private String sCtrlAV11PrdMaxFind ;
   private String sCtrlAV14ProForUli ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Combo_clascod_Emptyitem ;
   private boolean Combo_maqcod_Emptyitem ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n606MaqDsc ;
   private boolean n4296ClasDsc ;
   private String A13734MaqCDsc ;
   private String A13804ClasDscID ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_clascod ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private HTMLChoice cmbavFuncion ;
   private IDataStoreProvider pr_default ;
   private String[] H01NR2_A396EmprCod ;
   private String[] H01NR2_A13734MaqCDsc ;
   private String[] H01NR2_A602MaqCod ;
   private String[] H01NR2_A606MaqDsc ;
   private boolean[] H01NR2_n606MaqDsc ;
   private String[] H01NR3_A396EmprCod ;
   private String[] H01NR3_A13804ClasDscID ;
   private short[] H01NR3_A4295ClasCod ;
   private String[] H01NR3_A4296ClasDsc ;
   private boolean[] H01NR3_n4296ClasDsc ;
   private com.genexus.webpanels.WebSession AV13WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV18Clascod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV16MaqCod_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV17Combo_DataItem ;
}

final  class procesosquimicos_claves_tipodetejidoymaquina_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01NR2", "SELECT EmprCod, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, MaqCod, MaqDsc FROM TXPMAQUIN ORDER BY MaqCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01NR3", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(ClasCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ClasDsc, ''))) AS ClasDscID, ClasCod, ClasDsc FROM TXPCLAPEN ORDER BY ClasDscID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
      }
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

