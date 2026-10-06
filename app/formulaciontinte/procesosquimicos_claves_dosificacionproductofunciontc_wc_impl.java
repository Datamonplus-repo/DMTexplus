package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class procesosquimicos_claves_dosificacionproductofunciontc_wc_impl extends GXWebComponent
{
   public procesosquimicos_claves_dosificacionproductofunciontc_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public procesosquimicos_claves_dosificacionproductofunciontc_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesosquimicos_claves_dosificacionproductofunciontc_wc_impl.class ));
   }

   public procesosquimicos_claves_dosificacionproductofunciontc_wc_impl( int remoteHandle ,
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
               AV5EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
               AV6ProForCla = httpContext.GetPar( "ProForCla") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ProForCla", AV6ProForCla);
               AV7PrdMaxFind = httpContext.GetPar( "PrdMaxFind") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdMaxFind", AV7PrdMaxFind);
               AV8ProForUli = (short)(GXutil.lval( httpContext.GetPar( "ProForUli"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ProForUli), 4, 0));
               AV17Proforclv = httpContext.GetPar( "Proforclv") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Proforclv", AV17Proforclv);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5EmprCod,AV6ProForCla,AV7PrdMaxFind,Short.valueOf(AV8ProForUli),AV17Proforclv});
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
         pa1NH2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Clave Dosificacion Producto em % f(Total corante) #", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.procesosquimicos_claves_dosificacionproductofunciontc_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV6ProForCla)),GXutil.URLEncode(GXutil.rtrim(AV7PrdMaxFind)),GXutil.URLEncode(GXutil.ltrimstr(AV8ProForUli,4,0)),GXutil.URLEncode(GXutil.rtrim(AV17Proforclv))}, new String[] {"EmprCod","ProForCla","PrdMaxFind","ProForUli","Proforclv"}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRUCOL_DATA", AV18GruCol_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRUCOL_DATA", AV18GruCol_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5EmprCod", GXutil.rtrim( wcpOAV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7PrdMaxFind", GXutil.rtrim( wcpOAV7PrdMaxFind));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8ProForUli", GXutil.ltrim( localUtil.ntoc( wcpOAV8ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAG", GXutil.ltrim( localUtil.ntoc( AV15Flag, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDMAXFIND", GXutil.rtrim( AV7PrdMaxFind));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROFORCLA", GXutil.rtrim( AV6ProForCla));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROFORULI", GXutil.ltrim( localUtil.ntoc( AV8ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROFORCLV", GXutil.rtrim( AV17Proforclv));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COMBO_GRUCOL_Cls", GXutil.rtrim( Combo_grucol_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COMBO_GRUCOL_Selectedvalue_set", GXutil.rtrim( Combo_grucol_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COMBO_GRUCOL_Emptyitem", GXutil.booltostr( Combo_grucol_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COMBO_GRUCOL_Selectedvalue_get", GXutil.rtrim( Combo_grucol_Selectedvalue_get));
   }

   public void renderHtmlCloseForm1NH2( )
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
      return "FormulacionTinte.ProcesosQuimicos_Claves_DosificacionProductofuncionTC_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Clave Dosificacion Producto em % f(Total corante) #", "") ;
   }

   public void wb1NH0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.procesosquimicos_claves_dosificacionproductofunciontc_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavIntini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIntini_Internalname, httpContext.getMessage( "Cantidad Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntini_Internalname, GXutil.ltrim( localUtil.ntoc( AV11IntIni, (byte)(8), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIntini_Enabled!=0) ? localUtil.format( AV11IntIni, "Z9.99999") : localUtil.format( AV11IntIni, "Z9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,25);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIntini_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_DosificacionProductofuncionTC_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavIntfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIntfin_Internalname, httpContext.getMessage( "Cantidad Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntfin_Internalname, GXutil.ltrim( localUtil.ntoc( AV12IntFin, (byte)(8), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIntfin_Enabled!=0) ? localUtil.format( AV12IntFin, "Z9.99999") : localUtil.format( AV12IntFin, "Z9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,29);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIntfin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_DosificacionProductofuncionTC_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPorc_p_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPorc_p_Internalname, "%", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPorc_p_Internalname, GXutil.ltrim( localUtil.ntoc( AV14Porc_p, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPorc_p_Enabled!=0) ? localUtil.format( AV14Porc_p, "ZZ9.99") : localUtil.format( AV14Porc_p, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,37);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPorc_p_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPorc_p_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_DosificacionProductofuncionTC_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedgrucol_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_grucol_Internalname, httpContext.getMessage( "Familia", ""), "", "", lblTextblockcombo_grucol_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_DosificacionProductofuncionTC_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_grucol.setProperty("Caption", Combo_grucol_Caption);
         ucCombo_grucol.setProperty("Cls", Combo_grucol_Cls);
         ucCombo_grucol.setProperty("EmptyItem", Combo_grucol_Emptyitem);
         ucCombo_grucol.setProperty("DropDownOptionsData", AV18GruCol_Data);
         ucCombo_grucol.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_grucol_Internalname, sPrefix+"COMBO_GRUCOLContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'" + sPrefix + "',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavFuncion, cmbavFuncion.getInternalname(), GXutil.rtrim( AV10Funcion), 1, cmbavFuncion.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavFuncion.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "", true, (byte)(0), "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_DosificacionProductofuncionTC_WC.htm");
         cmbavFuncion.setValue( GXutil.rtrim( AV10Funcion) );
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClave_Internalname, GXutil.rtrim( AV9Clave), GXutil.rtrim( localUtil.format( AV9Clave, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClave_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClave_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_DosificacionProductofuncionTC_WC.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Generar Clave", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Generar Clave", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_DosificacionProductofuncionTC_WC.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'" + sPrefix + "',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGrucol_Internalname, GXutil.ltrim( localUtil.ntoc( AV13GruCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13GruCol), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGrucol_Jsonclick, 0, "Attribute", "", "", "", "", edtavGrucol_Visible, 1, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesosQuimicos_Claves_DosificacionProductofuncionTC_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1NH2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Clave Dosificacion Producto em % f(Total corante) #", ""), (short)(0)) ;
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
            strup1NH0( ) ;
         }
      }
   }

   public void ws1NH2( )
   {
      start1NH2( ) ;
      evt1NH2( ) ;
   }

   public void evt1NH2( )
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
                              strup1NH0( ) ;
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
                              strup1NH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e111NH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoConfirmar' */
                                 e121NH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e131NH2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1NH0( ) ;
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
                              strup1NH0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavIntini_Internalname ;
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

   public void we1NH2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1NH2( ) ;
         }
      }
   }

   public void pa1NH2( )
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
            GX_FocusControl = edtavIntini_Internalname ;
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
         AV10Funcion = cmbavFuncion.getValidValue(AV10Funcion) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Funcion", AV10Funcion);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavFuncion.setValue( GXutil.rtrim( AV10Funcion) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavFuncion.getInternalname(), "Values", cmbavFuncion.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1NH2( ) ;
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

   public void rf1NH2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e131NH2 ();
         wb1NH0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1NH2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavClave_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClave_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClave_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1NH0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111NH2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vGRUCOL_DATA"), AV18GruCol_Data);
         /* Read saved values. */
         wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
         wcpOAV7PrdMaxFind = httpContext.cgiGet( sPrefix+"wcpOAV7PrdMaxFind") ;
         wcpOAV8ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8ProForUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Combo_grucol_Cls = httpContext.cgiGet( sPrefix+"COMBO_GRUCOL_Cls") ;
         Combo_grucol_Selectedvalue_set = httpContext.cgiGet( sPrefix+"COMBO_GRUCOL_Selectedvalue_set") ;
         Combo_grucol_Emptyitem = GXutil.strtobool( httpContext.cgiGet( sPrefix+"COMBO_GRUCOL_Emptyitem")) ;
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
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavIntini_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavIntini_Internalname)), DecimalUtil.stringToDec("99.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTINI");
            GX_FocusControl = edtavIntini_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11IntIni = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11IntIni", GXutil.ltrimstr( AV11IntIni, 8, 5));
         }
         else
         {
            AV11IntIni = localUtil.ctond( httpContext.cgiGet( edtavIntini_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11IntIni", GXutil.ltrimstr( AV11IntIni, 8, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavIntfin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavIntfin_Internalname)), DecimalUtil.stringToDec("99.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTFIN");
            GX_FocusControl = edtavIntfin_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12IntFin = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12IntFin", GXutil.ltrimstr( AV12IntFin, 8, 5));
         }
         else
         {
            AV12IntFin = localUtil.ctond( httpContext.cgiGet( edtavIntfin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12IntFin", GXutil.ltrimstr( AV12IntFin, 8, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPorc_p_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPorc_p_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPORC_P");
            GX_FocusControl = edtavPorc_p_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14Porc_p = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Porc_p", GXutil.ltrimstr( AV14Porc_p, 6, 2));
         }
         else
         {
            AV14Porc_p = localUtil.ctond( httpContext.cgiGet( edtavPorc_p_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Porc_p", GXutil.ltrimstr( AV14Porc_p, 6, 2));
         }
         cmbavFuncion.setValue( httpContext.cgiGet( cmbavFuncion.getInternalname()) );
         AV10Funcion = httpContext.cgiGet( cmbavFuncion.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Funcion", AV10Funcion);
         AV9Clave = httpContext.cgiGet( edtavClave_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Clave", AV9Clave);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGrucol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGrucol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRUCOL");
            GX_FocusControl = edtavGrucol_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13GruCol = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13GruCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GruCol), 2, 0));
         }
         else
         {
            AV13GruCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtavGrucol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13GruCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GruCol), 2, 0));
         }
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
      e111NH2 ();
      if (returnInSub) return;
   }

   public void e111NH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV20Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      procesosquimicos_claves_dosificacionproductofunciontc_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char4[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char2, GXv_char3, GXv_char4) ;
      procesosquimicos_claves_dosificacionproductofunciontc_wc_impl.this.AV5EmprCod = GXv_char2[0] ;
      procesosquimicos_claves_dosificacionproductofunciontc_wc_impl.this.AV21EmprNom = GXv_char3[0] ;
      procesosquimicos_claves_dosificacionproductofunciontc_wc_impl.this.AV22UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      edtavGrucol_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGrucol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrucol_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOGRUCOL' */
      S112 ();
      if (returnInSub) return;
      AV6ProForCla = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ProForCla", AV6ProForCla);
   }

   public void e121NH2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV5EmprCod ;
      GXv_int5[0] = AV13GruCol ;
      GXv_int6[0] = AV15Flag ;
      new app.pbusgru(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6) ;
      procesosquimicos_claves_dosificacionproductofunciontc_wc_impl.this.AV5EmprCod = GXv_char4[0] ;
      procesosquimicos_claves_dosificacionproductofunciontc_wc_impl.this.AV13GruCol = GXv_int5[0] ;
      procesosquimicos_claves_dosificacionproductofunciontc_wc_impl.this.AV15Flag = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13GruCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GruCol), 2, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Flag", GXutil.str( AV15Flag, 1, 0));
      if ( (0==AV15Flag) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Familia¡", ""));
      }
      else
      {
         if ( DecimalUtil.compareTo(AV12IntFin, AV11IntIni) < 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor Inicial superior Valor Final", ""));
         }
         else
         {
            if ( (GXutil.strcmp("", AV7PrdMaxFind)==0) && ( GXutil.strcmp(AV10Funcion, httpContext.getMessage( "A", "")) != 0 ) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Solo puede utilizar Añadir Producto", ""));
            }
            else
            {
               AV9Clave = httpContext.getMessage( "CP", "") + " " ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Clave", AV9Clave);
               AV9Clave += GXutil.padl( GXutil.trim( GXutil.str( AV11IntIni, 8, 5)), (short)(8), "0") + " " ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Clave", AV9Clave);
               AV9Clave += GXutil.padl( GXutil.trim( GXutil.str( AV12IntFin, 8, 5)), (short)(8), "0") + " " ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Clave", AV9Clave);
               AV9Clave += GXutil.padl( GXutil.trim( GXutil.str( AV14Porc_p, 6, 2)), (short)(6), "0") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Clave", AV9Clave);
               AV9Clave += AV10Funcion ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Clave", AV9Clave);
               AV9Clave += GXutil.padl( GXutil.trim( GXutil.str( AV13GruCol, 2, 0)), (short)(2), "0") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Clave", AV9Clave);
               AV17Proforclv = AV9Clave ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Proforclv", AV17Proforclv);
               AV16WebSession.setValue("ProForClv", AV17Proforclv);
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'LOADCOMBOGRUCOL' Routine */
      returnInSub = false ;
      /* Using cursor H01NH2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13745GrpCDsc = H01NH2_A13745GrpCDsc[0] ;
         A499GrpFamCod = H01NH2_A499GrpFamCod[0] ;
         A500GrpFamDsc = H01NH2_A500GrpFamDsc[0] ;
         n500GrpFamDsc = H01NH2_n500GrpFamDsc[0] ;
         AV19Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV19Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A499GrpFamCod, 2, 0)) );
         AV19Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13745GrpCDsc );
         AV18GruCol_Data.add(AV19Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_grucol_Selectedvalue_set = ((0==AV13GruCol) ? "" : GXutil.trim( GXutil.str( AV13GruCol, 2, 0))) ;
      ucCombo_grucol.sendProperty(context, sPrefix, false, Combo_grucol_Internalname, "SelectedValue_set", Combo_grucol_Selectedvalue_set);
   }

   protected void nextLoad( )
   {
   }

   protected void e131NH2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      AV6ProForCla = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ProForCla", AV6ProForCla);
      AV7PrdMaxFind = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdMaxFind", AV7PrdMaxFind);
      AV8ProForUli = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ProForUli), 4, 0));
      AV17Proforclv = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Proforclv", AV17Proforclv);
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
      pa1NH2( ) ;
      ws1NH2( ) ;
      we1NH2( ) ;
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
      sCtrlAV6ProForCla = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7PrdMaxFind = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8ProForUli = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV17Proforclv = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1NH2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\procesosquimicos_claves_dosificacionproductofunciontc_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1NH2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
         AV6ProForCla = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ProForCla", AV6ProForCla);
         AV7PrdMaxFind = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdMaxFind", AV7PrdMaxFind);
         AV8ProForUli = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ProForUli), 4, 0));
         AV17Proforclv = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Proforclv", AV17Proforclv);
      }
      wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
      wcpOAV7PrdMaxFind = httpContext.cgiGet( sPrefix+"wcpOAV7PrdMaxFind") ;
      wcpOAV8ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8ProForUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5EmprCod, wcpOAV5EmprCod) != 0 ) || ( GXutil.strcmp(AV7PrdMaxFind, wcpOAV7PrdMaxFind) != 0 ) || ( AV8ProForUli != wcpOAV8ProForUli ) ) )
      {
         setjustcreated();
      }
      wcpOAV5EmprCod = AV5EmprCod ;
      wcpOAV7PrdMaxFind = AV7PrdMaxFind ;
      wcpOAV8ProForUli = AV8ProForUli ;
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
      sCtrlAV6ProForCla = httpContext.cgiGet( sPrefix+"AV6ProForCla_CTRL") ;
      if ( GXutil.len( sCtrlAV6ProForCla) > 0 )
      {
         AV6ProForCla = httpContext.cgiGet( sCtrlAV6ProForCla) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ProForCla", AV6ProForCla);
      }
      else
      {
         AV6ProForCla = httpContext.cgiGet( sPrefix+"AV6ProForCla_PARM") ;
      }
      sCtrlAV7PrdMaxFind = httpContext.cgiGet( sPrefix+"AV7PrdMaxFind_CTRL") ;
      if ( GXutil.len( sCtrlAV7PrdMaxFind) > 0 )
      {
         AV7PrdMaxFind = httpContext.cgiGet( sCtrlAV7PrdMaxFind) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PrdMaxFind", AV7PrdMaxFind);
      }
      else
      {
         AV7PrdMaxFind = httpContext.cgiGet( sPrefix+"AV7PrdMaxFind_PARM") ;
      }
      sCtrlAV8ProForUli = httpContext.cgiGet( sPrefix+"AV8ProForUli_CTRL") ;
      if ( GXutil.len( sCtrlAV8ProForUli) > 0 )
      {
         AV8ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8ProForUli), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ProForUli), 4, 0));
      }
      else
      {
         AV8ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8ProForUli_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV17Proforclv = httpContext.cgiGet( sPrefix+"AV17Proforclv_CTRL") ;
      if ( GXutil.len( sCtrlAV17Proforclv) > 0 )
      {
         AV17Proforclv = httpContext.cgiGet( sCtrlAV17Proforclv) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Proforclv", AV17Proforclv);
      }
      else
      {
         AV17Proforclv = httpContext.cgiGet( sPrefix+"AV17Proforclv_PARM") ;
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
      pa1NH2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1NH2( ) ;
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
      ws1NH2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6ProForCla_PARM", GXutil.rtrim( AV6ProForCla));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6ProForCla)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6ProForCla_CTRL", GXutil.rtrim( sCtrlAV6ProForCla));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7PrdMaxFind_PARM", GXutil.rtrim( AV7PrdMaxFind));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7PrdMaxFind)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7PrdMaxFind_CTRL", GXutil.rtrim( sCtrlAV7PrdMaxFind));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8ProForUli_PARM", GXutil.ltrim( localUtil.ntoc( AV8ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8ProForUli)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8ProForUli_CTRL", GXutil.rtrim( sCtrlAV8ProForUli));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Proforclv_PARM", GXutil.rtrim( AV17Proforclv));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17Proforclv)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Proforclv_CTRL", GXutil.rtrim( sCtrlAV17Proforclv));
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
      we1NH2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714145469", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/procesosquimicos_claves_dosificacionproductofunciontc_wc.js", "?202681714145469", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      edtavIntini_Internalname = sPrefix+"vINTINI" ;
      edtavIntfin_Internalname = sPrefix+"vINTFIN" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      edtavPorc_p_Internalname = sPrefix+"vPORC_P" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      lblTextblockcombo_grucol_Internalname = sPrefix+"TEXTBLOCKCOMBO_GRUCOL" ;
      Combo_grucol_Internalname = sPrefix+"COMBO_GRUCOL" ;
      divTablesplittedgrucol_Internalname = sPrefix+"TABLESPLITTEDGRUCOL" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      cmbavFuncion.setInternalname( sPrefix+"vFUNCION" );
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      edtavClave_Internalname = sPrefix+"vCLAVE" ;
      divUnnamedtable8_Internalname = sPrefix+"UNNAMEDTABLE8" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE2" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      edtavGrucol_Internalname = sPrefix+"vGRUCOL" ;
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
      edtavGrucol_Jsonclick = "" ;
      edtavGrucol_Visible = 1 ;
      edtavClave_Jsonclick = "" ;
      edtavClave_Enabled = 1 ;
      cmbavFuncion.setJsonclick( "" );
      cmbavFuncion.setEnabled( 1 );
      edtavPorc_p_Jsonclick = "" ;
      edtavPorc_p_Enabled = 1 ;
      edtavIntfin_Jsonclick = "" ;
      edtavIntfin_Enabled = 1 ;
      edtavIntini_Jsonclick = "" ;
      edtavIntini_Enabled = 1 ;
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
      Combo_grucol_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_grucol_Cls = "ExtendedCombo AttributeFL" ;
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
      setEventMetadata("'DOCONFIRMAR'","{handler:'e121NH2',iparms:[{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13GruCol',fld:'vGRUCOL',pic:'Z9'},{av:'AV15Flag',fld:'vFLAG',pic:'9'},{av:'AV12IntFin',fld:'vINTFIN',pic:'Z9.99999'},{av:'AV11IntIni',fld:'vINTINI',pic:'Z9.99999'},{av:'AV7PrdMaxFind',fld:'vPRDMAXFIND',pic:''},{av:'cmbavFuncion'},{av:'AV10Funcion',fld:'vFUNCION',pic:''},{av:'AV14Porc_p',fld:'vPORC_P',pic:'ZZ9.99'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV15Flag',fld:'vFLAG',pic:'9'},{av:'AV13GruCol',fld:'vGRUCOL',pic:'Z9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Clave',fld:'vCLAVE',pic:''},{av:'AV17Proforclv',fld:'vPROFORCLV',pic:''}]}");
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
      wcpOAV7PrdMaxFind = "" ;
      Combo_grucol_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5EmprCod = "" ;
      AV6ProForCla = "" ;
      AV7PrdMaxFind = "" ;
      AV17Proforclv = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV18GruCol_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Combo_grucol_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV11IntIni = DecimalUtil.ZERO ;
      AV12IntFin = DecimalUtil.ZERO ;
      AV14Porc_p = DecimalUtil.ZERO ;
      lblTextblockcombo_grucol_Jsonclick = "" ;
      ucCombo_grucol = new com.genexus.webpanels.GXUserControl();
      Combo_grucol_Caption = "" ;
      AV10Funcion = "" ;
      AV9Clave = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV20Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV21EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV22UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      AV16WebSession = httpContext.getWebSession();
      scmdbuf = "" ;
      H01NH2_A396EmprCod = new String[] {""} ;
      H01NH2_A13745GrpCDsc = new String[] {""} ;
      H01NH2_A499GrpFamCod = new byte[1] ;
      H01NH2_A500GrpFamDsc = new String[] {""} ;
      H01NH2_n500GrpFamDsc = new boolean[] {false} ;
      A13745GrpCDsc = "" ;
      A500GrpFamDsc = "" ;
      AV19Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5EmprCod = "" ;
      sCtrlAV6ProForCla = "" ;
      sCtrlAV7PrdMaxFind = "" ;
      sCtrlAV8ProForUli = "" ;
      sCtrlAV17Proforclv = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesosquimicos_claves_dosificacionproductofunciontc_wc__default(),
         new Object[] {
             new Object[] {
            H01NH2_A396EmprCod, H01NH2_A13745GrpCDsc, H01NH2_A499GrpFamCod, H01NH2_A500GrpFamDsc, H01NH2_n500GrpFamDsc
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
   private byte AV15Flag ;
   private byte AV13GruCol ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte GXv_int5[] ;
   private byte GXv_int6[] ;
   private byte A499GrpFamCod ;
   private byte nGXWrapped ;
   private short wcpOAV8ProForUli ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV8ProForUli ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavIntini_Enabled ;
   private int edtavIntfin_Enabled ;
   private int edtavPorc_p_Enabled ;
   private int edtavClave_Enabled ;
   private int edtavGrucol_Visible ;
   private int idxLst ;
   private java.math.BigDecimal AV11IntIni ;
   private java.math.BigDecimal AV12IntFin ;
   private java.math.BigDecimal AV14Porc_p ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV7PrdMaxFind ;
   private String Combo_grucol_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5EmprCod ;
   private String AV6ProForCla ;
   private String AV7PrdMaxFind ;
   private String AV17Proforclv ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Combo_grucol_Cls ;
   private String Combo_grucol_Selectedvalue_set ;
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
   private String edtavIntini_Internalname ;
   private String TempTags ;
   private String edtavIntini_Jsonclick ;
   private String edtavIntfin_Internalname ;
   private String edtavIntfin_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavPorc_p_Internalname ;
   private String edtavPorc_p_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String divTablesplittedgrucol_Internalname ;
   private String lblTextblockcombo_grucol_Internalname ;
   private String lblTextblockcombo_grucol_Jsonclick ;
   private String Combo_grucol_Caption ;
   private String Combo_grucol_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String AV10Funcion ;
   private String divUnnamedtable8_Internalname ;
   private String edtavClave_Internalname ;
   private String AV9Clave ;
   private String edtavClave_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavGrucol_Internalname ;
   private String edtavGrucol_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV20Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV21EmprNom ;
   private String GXv_char3[] ;
   private String AV22UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A500GrpFamDsc ;
   private String sCtrlAV5EmprCod ;
   private String sCtrlAV6ProForCla ;
   private String sCtrlAV7PrdMaxFind ;
   private String sCtrlAV8ProForUli ;
   private String sCtrlAV17Proforclv ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Combo_grucol_Emptyitem ;
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
   private boolean n500GrpFamDsc ;
   private String A13745GrpCDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_grucol ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private HTMLChoice cmbavFuncion ;
   private IDataStoreProvider pr_default ;
   private String[] H01NH2_A396EmprCod ;
   private String[] H01NH2_A13745GrpCDsc ;
   private byte[] H01NH2_A499GrpFamCod ;
   private String[] H01NH2_A500GrpFamDsc ;
   private boolean[] H01NH2_n500GrpFamDsc ;
   private com.genexus.webpanels.WebSession AV16WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV18GruCol_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV19Combo_DataItem ;
}

final  class procesosquimicos_claves_dosificacionproductofunciontc_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01NH2", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) AS GrpCDsc, GrpFamCod, GrpFamDsc FROM TXPGRUFAM ORDER BY GrpCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
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

