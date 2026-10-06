package app.ponteway ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ogguiaimportviewgeneral_impl extends GXWebComponent
{
   public ogguiaimportviewgeneral_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ogguiaimportviewgeneral_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ogguiaimportviewgeneral_impl.class ));
   }

   public ogguiaimportviewgeneral_impl( int remoteHandle ,
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
            gxfirstwebparm = httpContext.GetFirstPar( "ogEmprCod") ;
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
               A14504ogEmprCod = httpContext.GetPar( "ogEmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14504ogEmprCod", A14504ogEmprCod);
               A14505ogCliCod = GXutil.lval( httpContext.GetPar( "ogCliCod")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14505ogCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14505ogCliCod), 10, 0));
               A14521ogARecCod = (int)(GXutil.lval( httpContext.GetPar( "ogARecCod"))) ;
               n14521ogARecCod = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14521ogARecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14521ogARecCod), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A14504ogEmprCod,Long.valueOf(A14505ogCliCod),Integer.valueOf(A14521ogARecCod)});
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
               gxfirstwebparm = httpContext.GetFirstPar( "ogEmprCod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "ogEmprCod") ;
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
         pa2D62( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Og Guia Import View General", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ponteway.ogguiaimportviewgeneral", new String[] {GXutil.URLEncode(GXutil.rtrim(A14504ogEmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14505ogCliCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A14521ogARecCod,8,0))}, new String[] {"ogEmprCod","ogCliCod","ogARecCod"}) +"\">") ;
            app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
            httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
         }
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"OgGuiaImportViewGeneral");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV13Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ponteway\\ogguiaimportviewgeneral:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA14504ogEmprCod", wcpOA14504ogEmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA14505ogCliCod", GXutil.ltrim( localUtil.ntoc( wcpOA14505ogCliCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA14521ogARecCod", GXutil.ltrim( localUtil.ntoc( wcpOA14521ogARecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_CHANGED_Width", GXutil.rtrim( Dvpanel_att_changed_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_CHANGED_Autowidth", GXutil.booltostr( Dvpanel_att_changed_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_CHANGED_Autoheight", GXutil.booltostr( Dvpanel_att_changed_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_CHANGED_Cls", GXutil.rtrim( Dvpanel_att_changed_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_CHANGED_Title", GXutil.rtrim( Dvpanel_att_changed_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_CHANGED_Collapsible", GXutil.booltostr( Dvpanel_att_changed_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_CHANGED_Collapsed", GXutil.booltostr( Dvpanel_att_changed_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_CHANGED_Showcollapseicon", GXutil.booltostr( Dvpanel_att_changed_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_CHANGED_Iconposition", GXutil.rtrim( Dvpanel_att_changed_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_CHANGED_Autoscroll", GXutil.booltostr( Dvpanel_att_changed_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_ORIGINAL_Width", GXutil.rtrim( Dvpanel_att_original_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_ORIGINAL_Autowidth", GXutil.booltostr( Dvpanel_att_original_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_ORIGINAL_Autoheight", GXutil.booltostr( Dvpanel_att_original_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_ORIGINAL_Cls", GXutil.rtrim( Dvpanel_att_original_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_ORIGINAL_Title", GXutil.rtrim( Dvpanel_att_original_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_ORIGINAL_Collapsible", GXutil.booltostr( Dvpanel_att_original_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_ORIGINAL_Collapsed", GXutil.booltostr( Dvpanel_att_original_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_ORIGINAL_Showcollapseicon", GXutil.booltostr( Dvpanel_att_original_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_ORIGINAL_Iconposition", GXutil.rtrim( Dvpanel_att_original_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_ATT_ORIGINAL_Autoscroll", GXutil.booltostr( Dvpanel_att_original_Autoscroll));
   }

   public void renderHtmlCloseForm2D62( )
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
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "</form>") ;
         }
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
      return "PonteWay.OgGuiaImportViewGeneral" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Og Guia Import View General", "") ;
   }

   public void wb2D60( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.ponteway.ogguiaimportviewgeneral");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         }
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", sPrefix, "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogSerie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogSerie_Internalname, httpContext.getMessage( "Serie", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogSerie_Internalname, GXutil.ltrim( localUtil.ntoc( A14523ogSerie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtogSerie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14523ogSerie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14523ogSerie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogSerie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogSerie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), false, "", "right", false, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogCliCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14505ogCliCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtogCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14505ogCliCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14505ogCliCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogCliCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), false, "", "right", false, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogFecha_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogFecha_Internalname, httpContext.getMessage( "Doc.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtogFecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtogFecha_Internalname, localUtil.format(A14506ogFecha, "99/99/99"), localUtil.format( A14506ogFecha, "99/99/99"), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogFecha_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogFecha_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), false, "Fecha", "right", false, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtogFecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtogFecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogCodArt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogCodArt_Internalname, httpContext.getMessage( "Articu", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogCodArt_Internalname, A14507ogCodArt, GXutil.rtrim( localUtil.format( A14507ogCodArt, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogCodArt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogCodArt_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogReferen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogReferen_Internalname, httpContext.getMessage( "Referencia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogReferen_Internalname, A14528ogReferen, GXutil.rtrim( localUtil.format( A14528ogReferen, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogReferen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogReferen_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogReclam_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogReclam_Internalname, httpContext.getMessage( "Reclamacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogReclam_Internalname, A14511ogReclam, GXutil.rtrim( localUtil.format( A14511ogReclam, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogReclam_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogReclam_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogLote_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogLote_Internalname, A14518ogLote, GXutil.rtrim( localUtil.format( A14518ogLote, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogLote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogLote_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogJogo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogJogo_Internalname, httpContext.getMessage( "Juego", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogJogo_Internalname, A14512ogJogo, GXutil.rtrim( localUtil.format( A14512ogJogo, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogJogo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogJogo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogPoleg_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogPoleg_Internalname, httpContext.getMessage( "Polegadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogPoleg_Internalname, A14513ogPoleg, GXutil.rtrim( localUtil.format( A14513ogPoleg, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogPoleg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogPoleg_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogEntrada_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogEntrada_Internalname, httpContext.getMessage( "de Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogEntrada_Internalname, A14516ogEntrada, GXutil.rtrim( localUtil.format( A14516ogEntrada, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogEntrada_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogEntrada_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogMaqui_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogMaqui_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogMaqui_Internalname, A14515ogMaqui, GXutil.rtrim( localUtil.format( A14515ogMaqui, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogMaqui_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogMaqui_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogVossaR_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogVossaR_Internalname, httpContext.getMessage( "Reccepcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogVossaR_Internalname, A14517ogVossaR, GXutil.rtrim( localUtil.format( A14517ogVossaR, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogVossaR_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogVossaR_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTransactiondetail_tableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_att_changed.setProperty("Width", Dvpanel_att_changed_Width);
         ucDvpanel_att_changed.setProperty("AutoWidth", Dvpanel_att_changed_Autowidth);
         ucDvpanel_att_changed.setProperty("AutoHeight", Dvpanel_att_changed_Autoheight);
         ucDvpanel_att_changed.setProperty("Cls", Dvpanel_att_changed_Cls);
         ucDvpanel_att_changed.setProperty("Title", Dvpanel_att_changed_Title);
         ucDvpanel_att_changed.setProperty("Collapsible", Dvpanel_att_changed_Collapsible);
         ucDvpanel_att_changed.setProperty("Collapsed", Dvpanel_att_changed_Collapsed);
         ucDvpanel_att_changed.setProperty("ShowCollapseIcon", Dvpanel_att_changed_Showcollapseicon);
         ucDvpanel_att_changed.setProperty("IconPosition", Dvpanel_att_changed_Iconposition);
         ucDvpanel_att_changed.setProperty("AutoScroll", Dvpanel_att_changed_Autoscroll);
         ucDvpanel_att_changed.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_att_changed_Internalname, sPrefix+"DVPANEL_ATT_CHANGEDContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_ATT_CHANGEDContainer"+"Att_Changed"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divAtt_changed_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogRolos__Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogRolos__Internalname, httpContext.getMessage( "Rollos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogRolos__Internalname, GXutil.ltrim( localUtil.ntoc( A14556ogRolos_, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtogRolos__Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14556ogRolos_), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14556ogRolos_), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogRolos__Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogRolos__Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), false, "", "right", false, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogQuant__Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogQuant__Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogQuant__Internalname, GXutil.ltrim( localUtil.ntoc( A14557ogQuant_, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtogQuant__Enabled!=0) ? localUtil.format( A14557ogQuant_, "ZZZ9.99") : localUtil.format( A14557ogQuant_, "ZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogQuant__Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogQuant__Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), false, "", "right", false, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogUnidad__Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogUnidad__Internalname, httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogUnidad__Internalname, A14558ogUnidad_, GXutil.rtrim( localUtil.format( A14558ogUnidad_, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogUnidad__Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogUnidad__Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogLocalizc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogLocalizc_Internalname, httpContext.getMessage( "Localizacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogLocalizc_Internalname, A14559ogLocalizc, GXutil.rtrim( localUtil.format( A14559ogLocalizc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogLocalizc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogLocalizc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogFio__Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogFio__Internalname, httpContext.getMessage( "Hilo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogFio__Internalname, A14560ogFio_, GXutil.rtrim( localUtil.format( A14560ogFio_, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogFio__Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogFio__Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_att_original.setProperty("Width", Dvpanel_att_original_Width);
         ucDvpanel_att_original.setProperty("AutoWidth", Dvpanel_att_original_Autowidth);
         ucDvpanel_att_original.setProperty("AutoHeight", Dvpanel_att_original_Autoheight);
         ucDvpanel_att_original.setProperty("Cls", Dvpanel_att_original_Cls);
         ucDvpanel_att_original.setProperty("Title", Dvpanel_att_original_Title);
         ucDvpanel_att_original.setProperty("Collapsible", Dvpanel_att_original_Collapsible);
         ucDvpanel_att_original.setProperty("Collapsed", Dvpanel_att_original_Collapsed);
         ucDvpanel_att_original.setProperty("ShowCollapseIcon", Dvpanel_att_original_Showcollapseicon);
         ucDvpanel_att_original.setProperty("IconPosition", Dvpanel_att_original_Iconposition);
         ucDvpanel_att_original.setProperty("AutoScroll", Dvpanel_att_original_Autoscroll);
         ucDvpanel_att_original.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_att_original_Internalname, sPrefix+"DVPANEL_ATT_ORIGINALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_ATT_ORIGINALContainer"+"Att_Original"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divAtt_original_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogRolos_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogRolos_Internalname, httpContext.getMessage( "Rollos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogRolos_Internalname, GXutil.ltrim( localUtil.ntoc( A14508ogRolos, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtogRolos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14508ogRolos), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14508ogRolos), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogRolos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogRolos_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), false, "", "right", false, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogQuant_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogQuant_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogQuant_Internalname, GXutil.ltrim( localUtil.ntoc( A14509ogQuant, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtogQuant_Enabled!=0) ? localUtil.format( A14509ogQuant, "ZZZ9.99") : localUtil.format( A14509ogQuant, "ZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogQuant_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogQuant_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), false, "", "right", false, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogUnidad_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogUnidad_Internalname, httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogUnidad_Internalname, A14510ogUnidad, GXutil.rtrim( localUtil.format( A14510ogUnidad, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogUnidad_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogUnidad_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogLocaliza_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogLocaliza_Internalname, httpContext.getMessage( "Localizacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogLocaliza_Internalname, A14554ogLocaliza, GXutil.rtrim( localUtil.format( A14554ogLocaliza, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogLocaliza_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogLocaliza_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtogFio_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtogFio_Internalname, httpContext.getMessage( "Hilo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogFio_Internalname, A14514ogFio, GXutil.rtrim( localUtil.format( A14514ogFio, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogFio_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtogFio_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV13Pgmname), GXutil.rtrim( localUtil.format( AV13Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtogLinha_Internalname, GXutil.ltrim( localUtil.ntoc( A14503ogLinha, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14503ogLinha), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogLinha_Jsonclick, 0, "Attribute", "", "", "", "", edtogLinha_Visible, 0, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), false, "", "right", false, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogEmprCod_Internalname, A14504ogEmprCod, GXutil.rtrim( localUtil.format( A14504ogEmprCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtogEmprCod_Visible, 0, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogNmrGuia_Internalname, GXutil.ltrim( localUtil.ntoc( A14522ogNmrGuia, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14522ogNmrGuia), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogNmrGuia_Jsonclick, 0, "Attribute", "", "", "", "", edtogNmrGuia_Visible, 0, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), false, "", "right", false, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogArtiCR_Internalname, A14519ogArtiCR, GXutil.rtrim( localUtil.format( A14519ogArtiCR, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogArtiCR_Jsonclick, 0, "Attribute", "", "", "", "", edtogArtiCR_Visible, 0, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogArtiAC_Internalname, A14520ogArtiAC, GXutil.rtrim( localUtil.format( A14520ogArtiAC, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogArtiAC_Jsonclick, 0, "Attribute", "", "", "", "", edtogArtiAC_Visible, 0, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtogARecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14521ogARecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14521ogARecCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtogARecCod_Jsonclick, 0, "Attribute", "", "", "", "", edtogARecCod_Visible, 0, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), false, "", "right", false, "", "HLP_PonteWay\\OgGuiaImportViewGeneral.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start2D62( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Og Guia Import View General", ""), (short)(0)) ;
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
            strup2D60( ) ;
         }
      }
   }

   public void ws2D62( )
   {
      start2D62( ) ;
      evt2D62( ) ;
   }

   public void evt2D62( )
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
                              strup2D60( ) ;
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
                              strup2D60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e112D62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2D60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e122D62 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2D60( ) ;
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
                              strup2D60( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
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

   public void we2D62( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2D62( ) ;
         }
      }
   }

   public void pa2D62( )
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2D62( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV13Pgmname = "PonteWay.OgGuiaImportViewGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2D62( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H02D62 */
         pr_default.execute(0, new Object[] {A14504ogEmprCod, Long.valueOf(A14505ogCliCod), Boolean.valueOf(n14521ogARecCod), Integer.valueOf(A14521ogARecCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A14520ogArtiAC = H02D62_A14520ogArtiAC[0] ;
            n14520ogArtiAC = H02D62_n14520ogArtiAC[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14520ogArtiAC", A14520ogArtiAC);
            A14519ogArtiCR = H02D62_A14519ogArtiCR[0] ;
            n14519ogArtiCR = H02D62_n14519ogArtiCR[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14519ogArtiCR", A14519ogArtiCR);
            A14522ogNmrGuia = H02D62_A14522ogNmrGuia[0] ;
            n14522ogNmrGuia = H02D62_n14522ogNmrGuia[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14522ogNmrGuia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14522ogNmrGuia), 10, 0));
            A14503ogLinha = H02D62_A14503ogLinha[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14503ogLinha", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14503ogLinha), 10, 0));
            A14514ogFio = H02D62_A14514ogFio[0] ;
            n14514ogFio = H02D62_n14514ogFio[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14514ogFio", A14514ogFio);
            A14554ogLocaliza = H02D62_A14554ogLocaliza[0] ;
            n14554ogLocaliza = H02D62_n14554ogLocaliza[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14554ogLocaliza", A14554ogLocaliza);
            A14510ogUnidad = H02D62_A14510ogUnidad[0] ;
            n14510ogUnidad = H02D62_n14510ogUnidad[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14510ogUnidad", A14510ogUnidad);
            A14509ogQuant = H02D62_A14509ogQuant[0] ;
            n14509ogQuant = H02D62_n14509ogQuant[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14509ogQuant", GXutil.ltrimstr( A14509ogQuant, 7, 2));
            A14508ogRolos = H02D62_A14508ogRolos[0] ;
            n14508ogRolos = H02D62_n14508ogRolos[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14508ogRolos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14508ogRolos), 3, 0));
            A14560ogFio_ = H02D62_A14560ogFio_[0] ;
            n14560ogFio_ = H02D62_n14560ogFio_[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14560ogFio_", A14560ogFio_);
            A14559ogLocalizc = H02D62_A14559ogLocalizc[0] ;
            n14559ogLocalizc = H02D62_n14559ogLocalizc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14559ogLocalizc", A14559ogLocalizc);
            A14558ogUnidad_ = H02D62_A14558ogUnidad_[0] ;
            n14558ogUnidad_ = H02D62_n14558ogUnidad_[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14558ogUnidad_", A14558ogUnidad_);
            A14557ogQuant_ = H02D62_A14557ogQuant_[0] ;
            n14557ogQuant_ = H02D62_n14557ogQuant_[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14557ogQuant_", GXutil.ltrimstr( A14557ogQuant_, 7, 2));
            A14556ogRolos_ = H02D62_A14556ogRolos_[0] ;
            n14556ogRolos_ = H02D62_n14556ogRolos_[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14556ogRolos_", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14556ogRolos_), 3, 0));
            A14517ogVossaR = H02D62_A14517ogVossaR[0] ;
            n14517ogVossaR = H02D62_n14517ogVossaR[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14517ogVossaR", A14517ogVossaR);
            A14515ogMaqui = H02D62_A14515ogMaqui[0] ;
            n14515ogMaqui = H02D62_n14515ogMaqui[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14515ogMaqui", A14515ogMaqui);
            A14516ogEntrada = H02D62_A14516ogEntrada[0] ;
            n14516ogEntrada = H02D62_n14516ogEntrada[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14516ogEntrada", A14516ogEntrada);
            A14513ogPoleg = H02D62_A14513ogPoleg[0] ;
            n14513ogPoleg = H02D62_n14513ogPoleg[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14513ogPoleg", A14513ogPoleg);
            A14512ogJogo = H02D62_A14512ogJogo[0] ;
            n14512ogJogo = H02D62_n14512ogJogo[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14512ogJogo", A14512ogJogo);
            A14518ogLote = H02D62_A14518ogLote[0] ;
            n14518ogLote = H02D62_n14518ogLote[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14518ogLote", A14518ogLote);
            A14511ogReclam = H02D62_A14511ogReclam[0] ;
            n14511ogReclam = H02D62_n14511ogReclam[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14511ogReclam", A14511ogReclam);
            A14528ogReferen = H02D62_A14528ogReferen[0] ;
            n14528ogReferen = H02D62_n14528ogReferen[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14528ogReferen", A14528ogReferen);
            A14507ogCodArt = H02D62_A14507ogCodArt[0] ;
            n14507ogCodArt = H02D62_n14507ogCodArt[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14507ogCodArt", A14507ogCodArt);
            A14506ogFecha = H02D62_A14506ogFecha[0] ;
            n14506ogFecha = H02D62_n14506ogFecha[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14506ogFecha", localUtil.format(A14506ogFecha, "99/99/99"));
            A14523ogSerie = H02D62_A14523ogSerie[0] ;
            n14523ogSerie = H02D62_n14523ogSerie[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14523ogSerie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14523ogSerie), 4, 0));
            /* Execute user event: Load */
            e122D62 ();
            pr_default.readNext(0);
         }
         pr_default.close(0);
         wb2D60( ) ;
      }
   }

   public void send_integrity_lvl_hashes2D62( )
   {
   }

   public void before_start_formulas( )
   {
      AV13Pgmname = "PonteWay.OgGuiaImportViewGeneral" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2D60( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e112D62 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         wcpOA14504ogEmprCod = httpContext.cgiGet( sPrefix+"wcpOA14504ogEmprCod") ;
         wcpOA14505ogCliCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA14505ogCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOA14521ogARecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA14521ogARecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvpanel_att_changed_Width = httpContext.cgiGet( sPrefix+"DVPANEL_ATT_CHANGED_Width") ;
         Dvpanel_att_changed_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ATT_CHANGED_Autowidth")) ;
         Dvpanel_att_changed_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ATT_CHANGED_Autoheight")) ;
         Dvpanel_att_changed_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_ATT_CHANGED_Cls") ;
         Dvpanel_att_changed_Title = httpContext.cgiGet( sPrefix+"DVPANEL_ATT_CHANGED_Title") ;
         Dvpanel_att_changed_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ATT_CHANGED_Collapsible")) ;
         Dvpanel_att_changed_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ATT_CHANGED_Collapsed")) ;
         Dvpanel_att_changed_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ATT_CHANGED_Showcollapseicon")) ;
         Dvpanel_att_changed_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_ATT_CHANGED_Iconposition") ;
         Dvpanel_att_changed_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ATT_CHANGED_Autoscroll")) ;
         Dvpanel_att_original_Width = httpContext.cgiGet( sPrefix+"DVPANEL_ATT_ORIGINAL_Width") ;
         Dvpanel_att_original_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ATT_ORIGINAL_Autowidth")) ;
         Dvpanel_att_original_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ATT_ORIGINAL_Autoheight")) ;
         Dvpanel_att_original_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_ATT_ORIGINAL_Cls") ;
         Dvpanel_att_original_Title = httpContext.cgiGet( sPrefix+"DVPANEL_ATT_ORIGINAL_Title") ;
         Dvpanel_att_original_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ATT_ORIGINAL_Collapsible")) ;
         Dvpanel_att_original_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ATT_ORIGINAL_Collapsed")) ;
         Dvpanel_att_original_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ATT_ORIGINAL_Showcollapseicon")) ;
         Dvpanel_att_original_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_ATT_ORIGINAL_Iconposition") ;
         Dvpanel_att_original_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_ATT_ORIGINAL_Autoscroll")) ;
         /* Read variables values. */
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"OgGuiaImportViewGeneral");
         AV13Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Pgmname", AV13Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV13Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ponteway\\ogguiaimportviewgeneral:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
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
      e112D62 ();
      if (returnInSub) return;
   }

   public void e112D62( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ogguiaimportviewgeneral_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      GXv_char2[0] = AV15Emprcod ;
      GXv_char3[0] = AV16Emprnom ;
      GXv_char4[0] = AV17Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      ogguiaimportviewgeneral_impl.this.AV15Emprcod = GXv_char2[0] ;
      ogguiaimportviewgeneral_impl.this.AV16Emprnom = GXv_char3[0] ;
      ogguiaimportviewgeneral_impl.this.AV17Usurcod = GXv_char4[0] ;
      GXv_SdtWWPContext5[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV6WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e122D62( )
   {
      /* Load Routine */
      returnInSub = false ;
      edtogLinha_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtogLinha_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogLinha_Visible), 5, 0), true);
      edtogEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtogEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogEmprCod_Visible), 5, 0), true);
      edtogNmrGuia_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtogNmrGuia_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogNmrGuia_Visible), 5, 0), true);
      edtogArtiCR_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtogArtiCR_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogArtiCR_Visible), 5, 0), true);
      edtogArtiAC_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtogArtiAC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogArtiAC_Visible), 5, 0), true);
      edtogARecCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtogARecCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtogARecCod_Visible), 5, 0), true);
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV7TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV13Pgmname );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( false );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV7TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "PonteWay.v1.OgGuiaImport" );
      AV9Session.setValue("TrnContext", AV7TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A14504ogEmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14504ogEmprCod", A14504ogEmprCod);
      A14505ogCliCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14505ogCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14505ogCliCod), 10, 0));
      A14521ogARecCod = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      n14521ogARecCod = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14521ogARecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14521ogARecCod), 8, 0));
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
      pa2D62( ) ;
      ws2D62( ) ;
      we2D62( ) ;
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
      sCtrlA14504ogEmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA14505ogCliCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlA14521ogARecCod = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2D62( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "ponteway\\ogguiaimportviewgeneral", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2D62( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A14504ogEmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14504ogEmprCod", A14504ogEmprCod);
         A14505ogCliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14505ogCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14505ogCliCod), 10, 0));
         A14521ogARecCod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         n14521ogARecCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14521ogARecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14521ogARecCod), 8, 0));
      }
      wcpOA14504ogEmprCod = httpContext.cgiGet( sPrefix+"wcpOA14504ogEmprCod") ;
      wcpOA14505ogCliCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA14505ogCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      wcpOA14521ogARecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA14521ogARecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A14504ogEmprCod, wcpOA14504ogEmprCod) != 0 ) || ( A14505ogCliCod != wcpOA14505ogCliCod ) || ( A14521ogARecCod != wcpOA14521ogARecCod ) ) )
      {
         setjustcreated();
      }
      wcpOA14504ogEmprCod = A14504ogEmprCod ;
      wcpOA14505ogCliCod = A14505ogCliCod ;
      wcpOA14521ogARecCod = A14521ogARecCod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA14504ogEmprCod = httpContext.cgiGet( sPrefix+"A14504ogEmprCod_CTRL") ;
      if ( GXutil.len( sCtrlA14504ogEmprCod) > 0 )
      {
         A14504ogEmprCod = httpContext.cgiGet( sCtrlA14504ogEmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14504ogEmprCod", A14504ogEmprCod);
      }
      else
      {
         A14504ogEmprCod = httpContext.cgiGet( sPrefix+"A14504ogEmprCod_PARM") ;
      }
      sCtrlA14505ogCliCod = httpContext.cgiGet( sPrefix+"A14505ogCliCod_CTRL") ;
      if ( GXutil.len( sCtrlA14505ogCliCod) > 0 )
      {
         A14505ogCliCod = localUtil.ctol( httpContext.cgiGet( sCtrlA14505ogCliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14505ogCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14505ogCliCod), 10, 0));
      }
      else
      {
         A14505ogCliCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"A14505ogCliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      sCtrlA14521ogARecCod = httpContext.cgiGet( sPrefix+"A14521ogARecCod_CTRL") ;
      if ( GXutil.len( sCtrlA14521ogARecCod) > 0 )
      {
         A14521ogARecCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA14521ogARecCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n14521ogARecCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A14521ogARecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14521ogARecCod), 8, 0));
      }
      else
      {
         A14521ogARecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A14521ogARecCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n14521ogARecCod = false ;
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
      pa2D62( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2D62( ) ;
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
      ws2D62( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A14504ogEmprCod_PARM", A14504ogEmprCod);
      if ( GXutil.len( GXutil.rtrim( sCtrlA14504ogEmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A14504ogEmprCod_CTRL", GXutil.rtrim( sCtrlA14504ogEmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A14505ogCliCod_PARM", GXutil.ltrim( localUtil.ntoc( A14505ogCliCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA14505ogCliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A14505ogCliCod_CTRL", GXutil.rtrim( sCtrlA14505ogCliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A14521ogARecCod_PARM", GXutil.ltrim( localUtil.ntoc( A14521ogARecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA14521ogARecCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A14521ogARecCod_CTRL", GXutil.rtrim( sCtrlA14521ogARecCod));
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
      we2D62( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115545970", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("ponteway/ogguiaimportviewgeneral.js", "?202682115545971", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtogSerie_Internalname = sPrefix+"OGSERIE" ;
      edtogCliCod_Internalname = sPrefix+"OGCLICOD" ;
      edtogFecha_Internalname = sPrefix+"OGFECHA" ;
      edtogCodArt_Internalname = sPrefix+"OGCODART" ;
      edtogReferen_Internalname = sPrefix+"OGREFEREN" ;
      edtogReclam_Internalname = sPrefix+"OGRECLAM" ;
      edtogLote_Internalname = sPrefix+"OGLOTE" ;
      edtogJogo_Internalname = sPrefix+"OGJOGO" ;
      edtogPoleg_Internalname = sPrefix+"OGPOLEG" ;
      edtogEntrada_Internalname = sPrefix+"OGENTRADA" ;
      edtogMaqui_Internalname = sPrefix+"OGMAQUI" ;
      edtogVossaR_Internalname = sPrefix+"OGVOSSAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      edtogRolos__Internalname = sPrefix+"OGROLOS_" ;
      edtogQuant__Internalname = sPrefix+"OGQUANT_" ;
      edtogUnidad__Internalname = sPrefix+"OGUNIDAD_" ;
      edtogLocalizc_Internalname = sPrefix+"OGLOCALIZC" ;
      edtogFio__Internalname = sPrefix+"OGFIO_" ;
      divAtt_changed_Internalname = sPrefix+"ATT_CHANGED" ;
      Dvpanel_att_changed_Internalname = sPrefix+"DVPANEL_ATT_CHANGED" ;
      edtogRolos_Internalname = sPrefix+"OGROLOS" ;
      edtogQuant_Internalname = sPrefix+"OGQUANT" ;
      edtogUnidad_Internalname = sPrefix+"OGUNIDAD" ;
      edtogLocaliza_Internalname = sPrefix+"OGLOCALIZA" ;
      edtogFio_Internalname = sPrefix+"OGFIO" ;
      divAtt_original_Internalname = sPrefix+"ATT_ORIGINAL" ;
      Dvpanel_att_original_Internalname = sPrefix+"DVPANEL_ATT_ORIGINAL" ;
      divTransactiondetail_tableattributes_Internalname = sPrefix+"TRANSACTIONDETAIL_TABLEATTRIBUTES" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTable_Internalname = sPrefix+"TABLE" ;
      edtogLinha_Internalname = sPrefix+"OGLINHA" ;
      edtogEmprCod_Internalname = sPrefix+"OGEMPRCOD" ;
      edtogNmrGuia_Internalname = sPrefix+"OGNMRGUIA" ;
      edtogArtiCR_Internalname = sPrefix+"OGARTICR" ;
      edtogArtiAC_Internalname = sPrefix+"OGARTIAC" ;
      edtogARecCod_Internalname = sPrefix+"OGARECCOD" ;
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
      edtogARecCod_Jsonclick = "" ;
      edtogARecCod_Visible = 1 ;
      edtogArtiAC_Jsonclick = "" ;
      edtogArtiAC_Visible = 1 ;
      edtogArtiCR_Jsonclick = "" ;
      edtogArtiCR_Visible = 1 ;
      edtogNmrGuia_Jsonclick = "" ;
      edtogNmrGuia_Visible = 1 ;
      edtogEmprCod_Jsonclick = "" ;
      edtogEmprCod_Visible = 1 ;
      edtogLinha_Jsonclick = "" ;
      edtogLinha_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtogFio_Jsonclick = "" ;
      edtogFio_Enabled = 0 ;
      edtogLocaliza_Jsonclick = "" ;
      edtogLocaliza_Enabled = 0 ;
      edtogUnidad_Jsonclick = "" ;
      edtogUnidad_Enabled = 0 ;
      edtogQuant_Jsonclick = "" ;
      edtogQuant_Enabled = 0 ;
      edtogRolos_Jsonclick = "" ;
      edtogRolos_Enabled = 0 ;
      edtogFio__Jsonclick = "" ;
      edtogFio__Enabled = 0 ;
      edtogLocalizc_Jsonclick = "" ;
      edtogLocalizc_Enabled = 0 ;
      edtogUnidad__Jsonclick = "" ;
      edtogUnidad__Enabled = 0 ;
      edtogQuant__Jsonclick = "" ;
      edtogQuant__Enabled = 0 ;
      edtogRolos__Jsonclick = "" ;
      edtogRolos__Enabled = 0 ;
      edtogVossaR_Jsonclick = "" ;
      edtogVossaR_Enabled = 0 ;
      edtogMaqui_Jsonclick = "" ;
      edtogMaqui_Enabled = 0 ;
      edtogEntrada_Jsonclick = "" ;
      edtogEntrada_Enabled = 0 ;
      edtogPoleg_Jsonclick = "" ;
      edtogPoleg_Enabled = 0 ;
      edtogJogo_Jsonclick = "" ;
      edtogJogo_Enabled = 0 ;
      edtogLote_Jsonclick = "" ;
      edtogLote_Enabled = 0 ;
      edtogReclam_Jsonclick = "" ;
      edtogReclam_Enabled = 0 ;
      edtogReferen_Jsonclick = "" ;
      edtogReferen_Enabled = 0 ;
      edtogCodArt_Jsonclick = "" ;
      edtogCodArt_Enabled = 0 ;
      edtogFecha_Jsonclick = "" ;
      edtogFecha_Enabled = 0 ;
      edtogCliCod_Jsonclick = "" ;
      edtogCliCod_Enabled = 0 ;
      edtogSerie_Jsonclick = "" ;
      edtogSerie_Enabled = 0 ;
      Dvpanel_att_original_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_att_original_Iconposition = "Right" ;
      Dvpanel_att_original_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_att_original_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_att_original_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_att_original_Title = httpContext.getMessage( "Despues", "") ;
      Dvpanel_att_original_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_att_original_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_att_original_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_att_original_Width = "100%" ;
      Dvpanel_att_changed_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_att_changed_Iconposition = "Right" ;
      Dvpanel_att_changed_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_att_changed_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_att_changed_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_att_changed_Title = httpContext.getMessage( "Antes", "") ;
      Dvpanel_att_changed_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_att_changed_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_att_changed_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_att_changed_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A14504ogEmprCod',fld:'OGEMPRCOD',pic:''},{av:'A14505ogCliCod',fld:'OGCLICOD',pic:'ZZZZZZZZZ9'},{av:'A14521ogARecCod',fld:'OGARECCOD',pic:'ZZZZZZZ9'},{av:'AV13Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
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
      wcpOA14504ogEmprCod = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A14504ogEmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV13Pgmname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      A14506ogFecha = GXutil.nullDate() ;
      A14507ogCodArt = "" ;
      A14528ogReferen = "" ;
      A14511ogReclam = "" ;
      A14518ogLote = "" ;
      A14512ogJogo = "" ;
      A14513ogPoleg = "" ;
      A14516ogEntrada = "" ;
      A14515ogMaqui = "" ;
      A14517ogVossaR = "" ;
      ucDvpanel_att_changed = new com.genexus.webpanels.GXUserControl();
      A14557ogQuant_ = DecimalUtil.ZERO ;
      A14558ogUnidad_ = "" ;
      A14559ogLocalizc = "" ;
      A14560ogFio_ = "" ;
      ucDvpanel_att_original = new com.genexus.webpanels.GXUserControl();
      A14509ogQuant = DecimalUtil.ZERO ;
      A14510ogUnidad = "" ;
      A14554ogLocaliza = "" ;
      A14514ogFio = "" ;
      A14519ogArtiCR = "" ;
      A14520ogArtiAC = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H02D62_A14504ogEmprCod = new String[] {""} ;
      H02D62_A14505ogCliCod = new long[1] ;
      H02D62_A14521ogARecCod = new int[1] ;
      H02D62_n14521ogARecCod = new boolean[] {false} ;
      H02D62_A14520ogArtiAC = new String[] {""} ;
      H02D62_n14520ogArtiAC = new boolean[] {false} ;
      H02D62_A14519ogArtiCR = new String[] {""} ;
      H02D62_n14519ogArtiCR = new boolean[] {false} ;
      H02D62_A14522ogNmrGuia = new long[1] ;
      H02D62_n14522ogNmrGuia = new boolean[] {false} ;
      H02D62_A14503ogLinha = new long[1] ;
      H02D62_A14514ogFio = new String[] {""} ;
      H02D62_n14514ogFio = new boolean[] {false} ;
      H02D62_A14554ogLocaliza = new String[] {""} ;
      H02D62_n14554ogLocaliza = new boolean[] {false} ;
      H02D62_A14510ogUnidad = new String[] {""} ;
      H02D62_n14510ogUnidad = new boolean[] {false} ;
      H02D62_A14509ogQuant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02D62_n14509ogQuant = new boolean[] {false} ;
      H02D62_A14508ogRolos = new short[1] ;
      H02D62_n14508ogRolos = new boolean[] {false} ;
      H02D62_A14560ogFio_ = new String[] {""} ;
      H02D62_n14560ogFio_ = new boolean[] {false} ;
      H02D62_A14559ogLocalizc = new String[] {""} ;
      H02D62_n14559ogLocalizc = new boolean[] {false} ;
      H02D62_A14558ogUnidad_ = new String[] {""} ;
      H02D62_n14558ogUnidad_ = new boolean[] {false} ;
      H02D62_A14557ogQuant_ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02D62_n14557ogQuant_ = new boolean[] {false} ;
      H02D62_A14556ogRolos_ = new short[1] ;
      H02D62_n14556ogRolos_ = new boolean[] {false} ;
      H02D62_A14517ogVossaR = new String[] {""} ;
      H02D62_n14517ogVossaR = new boolean[] {false} ;
      H02D62_A14515ogMaqui = new String[] {""} ;
      H02D62_n14515ogMaqui = new boolean[] {false} ;
      H02D62_A14516ogEntrada = new String[] {""} ;
      H02D62_n14516ogEntrada = new boolean[] {false} ;
      H02D62_A14513ogPoleg = new String[] {""} ;
      H02D62_n14513ogPoleg = new boolean[] {false} ;
      H02D62_A14512ogJogo = new String[] {""} ;
      H02D62_n14512ogJogo = new boolean[] {false} ;
      H02D62_A14518ogLote = new String[] {""} ;
      H02D62_n14518ogLote = new boolean[] {false} ;
      H02D62_A14511ogReclam = new String[] {""} ;
      H02D62_n14511ogReclam = new boolean[] {false} ;
      H02D62_A14528ogReferen = new String[] {""} ;
      H02D62_n14528ogReferen = new boolean[] {false} ;
      H02D62_A14507ogCodArt = new String[] {""} ;
      H02D62_n14507ogCodArt = new boolean[] {false} ;
      H02D62_A14506ogFecha = new java.util.Date[] {GXutil.nullDate()} ;
      H02D62_n14506ogFecha = new boolean[] {false} ;
      H02D62_A14523ogSerie = new short[1] ;
      H02D62_n14523ogSerie = new boolean[] {false} ;
      hsh = "" ;
      AV14Station = "" ;
      GXt_char1 = "" ;
      AV15Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV16Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV17Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV7TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10HTTPRequest = httpContext.getHttpRequest();
      AV9Session = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA14504ogEmprCod = "" ;
      sCtrlA14505ogCliCod = "" ;
      sCtrlA14521ogARecCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ponteway.ogguiaimportviewgeneral__default(),
         new Object[] {
             new Object[] {
            H02D62_A14504ogEmprCod, H02D62_A14505ogCliCod, H02D62_A14521ogARecCod, H02D62_n14521ogARecCod, H02D62_A14520ogArtiAC, H02D62_n14520ogArtiAC, H02D62_A14519ogArtiCR, H02D62_n14519ogArtiCR, H02D62_A14522ogNmrGuia, H02D62_n14522ogNmrGuia,
            H02D62_A14503ogLinha, H02D62_A14514ogFio, H02D62_n14514ogFio, H02D62_A14554ogLocaliza, H02D62_n14554ogLocaliza, H02D62_A14510ogUnidad, H02D62_n14510ogUnidad, H02D62_A14509ogQuant, H02D62_n14509ogQuant, H02D62_A14508ogRolos,
            H02D62_n14508ogRolos, H02D62_A14560ogFio_, H02D62_n14560ogFio_, H02D62_A14559ogLocalizc, H02D62_n14559ogLocalizc, H02D62_A14558ogUnidad_, H02D62_n14558ogUnidad_, H02D62_A14557ogQuant_, H02D62_n14557ogQuant_, H02D62_A14556ogRolos_,
            H02D62_n14556ogRolos_, H02D62_A14517ogVossaR, H02D62_n14517ogVossaR, H02D62_A14515ogMaqui, H02D62_n14515ogMaqui, H02D62_A14516ogEntrada, H02D62_n14516ogEntrada, H02D62_A14513ogPoleg, H02D62_n14513ogPoleg, H02D62_A14512ogJogo,
            H02D62_n14512ogJogo, H02D62_A14518ogLote, H02D62_n14518ogLote, H02D62_A14511ogReclam, H02D62_n14511ogReclam, H02D62_A14528ogReferen, H02D62_n14528ogReferen, H02D62_A14507ogCodArt, H02D62_n14507ogCodArt, H02D62_A14506ogFecha,
            H02D62_n14506ogFecha, H02D62_A14523ogSerie, H02D62_n14523ogSerie
            }
         }
      );
      AV13Pgmname = "PonteWay.OgGuiaImportViewGeneral" ;
      /* GeneXus formulas. */
      AV13Pgmname = "PonteWay.OgGuiaImportViewGeneral" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private short wbEnd ;
   private short wbStart ;
   private short A14523ogSerie ;
   private short A14556ogRolos_ ;
   private short A14508ogRolos ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOA14521ogARecCod ;
   private int A14521ogARecCod ;
   private int edtogSerie_Enabled ;
   private int edtogCliCod_Enabled ;
   private int edtogFecha_Enabled ;
   private int edtogCodArt_Enabled ;
   private int edtogReferen_Enabled ;
   private int edtogReclam_Enabled ;
   private int edtogLote_Enabled ;
   private int edtogJogo_Enabled ;
   private int edtogPoleg_Enabled ;
   private int edtogEntrada_Enabled ;
   private int edtogMaqui_Enabled ;
   private int edtogVossaR_Enabled ;
   private int edtogRolos__Enabled ;
   private int edtogQuant__Enabled ;
   private int edtogUnidad__Enabled ;
   private int edtogLocalizc_Enabled ;
   private int edtogFio__Enabled ;
   private int edtogRolos_Enabled ;
   private int edtogQuant_Enabled ;
   private int edtogUnidad_Enabled ;
   private int edtogLocaliza_Enabled ;
   private int edtogFio_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtogLinha_Visible ;
   private int edtogEmprCod_Visible ;
   private int edtogNmrGuia_Visible ;
   private int edtogArtiCR_Visible ;
   private int edtogArtiAC_Visible ;
   private int edtogARecCod_Visible ;
   private int idxLst ;
   private long wcpOA14505ogCliCod ;
   private long A14505ogCliCod ;
   private long A14503ogLinha ;
   private long A14522ogNmrGuia ;
   private java.math.BigDecimal A14557ogQuant_ ;
   private java.math.BigDecimal A14509ogQuant ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV13Pgmname ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_att_changed_Width ;
   private String Dvpanel_att_changed_Cls ;
   private String Dvpanel_att_changed_Title ;
   private String Dvpanel_att_changed_Iconposition ;
   private String Dvpanel_att_original_Width ;
   private String Dvpanel_att_original_Cls ;
   private String Dvpanel_att_original_Title ;
   private String Dvpanel_att_original_Iconposition ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTable_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtogSerie_Internalname ;
   private String edtogSerie_Jsonclick ;
   private String edtogCliCod_Internalname ;
   private String edtogCliCod_Jsonclick ;
   private String edtogFecha_Internalname ;
   private String edtogFecha_Jsonclick ;
   private String edtogCodArt_Internalname ;
   private String edtogCodArt_Jsonclick ;
   private String edtogReferen_Internalname ;
   private String edtogReferen_Jsonclick ;
   private String edtogReclam_Internalname ;
   private String edtogReclam_Jsonclick ;
   private String edtogLote_Internalname ;
   private String edtogLote_Jsonclick ;
   private String edtogJogo_Internalname ;
   private String edtogJogo_Jsonclick ;
   private String edtogPoleg_Internalname ;
   private String edtogPoleg_Jsonclick ;
   private String edtogEntrada_Internalname ;
   private String edtogEntrada_Jsonclick ;
   private String edtogMaqui_Internalname ;
   private String edtogMaqui_Jsonclick ;
   private String edtogVossaR_Internalname ;
   private String edtogVossaR_Jsonclick ;
   private String divTransactiondetail_tableattributes_Internalname ;
   private String Dvpanel_att_changed_Internalname ;
   private String divAtt_changed_Internalname ;
   private String edtogRolos__Internalname ;
   private String edtogRolos__Jsonclick ;
   private String edtogQuant__Internalname ;
   private String edtogQuant__Jsonclick ;
   private String edtogUnidad__Internalname ;
   private String edtogUnidad__Jsonclick ;
   private String edtogLocalizc_Internalname ;
   private String edtogLocalizc_Jsonclick ;
   private String edtogFio__Internalname ;
   private String edtogFio__Jsonclick ;
   private String Dvpanel_att_original_Internalname ;
   private String divAtt_original_Internalname ;
   private String edtogRolos_Internalname ;
   private String edtogRolos_Jsonclick ;
   private String edtogQuant_Internalname ;
   private String edtogQuant_Jsonclick ;
   private String edtogUnidad_Internalname ;
   private String edtogUnidad_Jsonclick ;
   private String edtogLocaliza_Internalname ;
   private String edtogLocaliza_Jsonclick ;
   private String edtogFio_Internalname ;
   private String edtogFio_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtogLinha_Internalname ;
   private String edtogLinha_Jsonclick ;
   private String edtogEmprCod_Internalname ;
   private String edtogEmprCod_Jsonclick ;
   private String edtogNmrGuia_Internalname ;
   private String edtogNmrGuia_Jsonclick ;
   private String edtogArtiCR_Internalname ;
   private String edtogArtiCR_Jsonclick ;
   private String edtogArtiAC_Internalname ;
   private String edtogArtiAC_Jsonclick ;
   private String edtogARecCod_Internalname ;
   private String edtogARecCod_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String hsh ;
   private String AV14Station ;
   private String GXt_char1 ;
   private String AV15Emprcod ;
   private String GXv_char2[] ;
   private String AV16Emprnom ;
   private String GXv_char3[] ;
   private String AV17Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlA14504ogEmprCod ;
   private String sCtrlA14505ogCliCod ;
   private String sCtrlA14521ogARecCod ;
   private java.util.Date A14506ogFecha ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n14521ogARecCod ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_att_changed_Autowidth ;
   private boolean Dvpanel_att_changed_Autoheight ;
   private boolean Dvpanel_att_changed_Collapsible ;
   private boolean Dvpanel_att_changed_Collapsed ;
   private boolean Dvpanel_att_changed_Showcollapseicon ;
   private boolean Dvpanel_att_changed_Autoscroll ;
   private boolean Dvpanel_att_original_Autowidth ;
   private boolean Dvpanel_att_original_Autoheight ;
   private boolean Dvpanel_att_original_Collapsible ;
   private boolean Dvpanel_att_original_Collapsed ;
   private boolean Dvpanel_att_original_Showcollapseicon ;
   private boolean Dvpanel_att_original_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n14520ogArtiAC ;
   private boolean n14519ogArtiCR ;
   private boolean n14522ogNmrGuia ;
   private boolean n14514ogFio ;
   private boolean n14554ogLocaliza ;
   private boolean n14510ogUnidad ;
   private boolean n14509ogQuant ;
   private boolean n14508ogRolos ;
   private boolean n14560ogFio_ ;
   private boolean n14559ogLocalizc ;
   private boolean n14558ogUnidad_ ;
   private boolean n14557ogQuant_ ;
   private boolean n14556ogRolos_ ;
   private boolean n14517ogVossaR ;
   private boolean n14515ogMaqui ;
   private boolean n14516ogEntrada ;
   private boolean n14513ogPoleg ;
   private boolean n14512ogJogo ;
   private boolean n14518ogLote ;
   private boolean n14511ogReclam ;
   private boolean n14528ogReferen ;
   private boolean n14507ogCodArt ;
   private boolean n14506ogFecha ;
   private boolean n14523ogSerie ;
   private boolean returnInSub ;
   private String wcpOA14504ogEmprCod ;
   private String A14504ogEmprCod ;
   private String A14507ogCodArt ;
   private String A14528ogReferen ;
   private String A14511ogReclam ;
   private String A14518ogLote ;
   private String A14512ogJogo ;
   private String A14513ogPoleg ;
   private String A14516ogEntrada ;
   private String A14515ogMaqui ;
   private String A14517ogVossaR ;
   private String A14558ogUnidad_ ;
   private String A14559ogLocalizc ;
   private String A14560ogFio_ ;
   private String A14510ogUnidad ;
   private String A14554ogLocaliza ;
   private String A14514ogFio ;
   private String A14519ogArtiCR ;
   private String A14520ogArtiAC ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_att_changed ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_att_original ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H02D62_A14504ogEmprCod ;
   private long[] H02D62_A14505ogCliCod ;
   private int[] H02D62_A14521ogARecCod ;
   private boolean[] H02D62_n14521ogARecCod ;
   private String[] H02D62_A14520ogArtiAC ;
   private boolean[] H02D62_n14520ogArtiAC ;
   private String[] H02D62_A14519ogArtiCR ;
   private boolean[] H02D62_n14519ogArtiCR ;
   private long[] H02D62_A14522ogNmrGuia ;
   private boolean[] H02D62_n14522ogNmrGuia ;
   private long[] H02D62_A14503ogLinha ;
   private String[] H02D62_A14514ogFio ;
   private boolean[] H02D62_n14514ogFio ;
   private String[] H02D62_A14554ogLocaliza ;
   private boolean[] H02D62_n14554ogLocaliza ;
   private String[] H02D62_A14510ogUnidad ;
   private boolean[] H02D62_n14510ogUnidad ;
   private java.math.BigDecimal[] H02D62_A14509ogQuant ;
   private boolean[] H02D62_n14509ogQuant ;
   private short[] H02D62_A14508ogRolos ;
   private boolean[] H02D62_n14508ogRolos ;
   private String[] H02D62_A14560ogFio_ ;
   private boolean[] H02D62_n14560ogFio_ ;
   private String[] H02D62_A14559ogLocalizc ;
   private boolean[] H02D62_n14559ogLocalizc ;
   private String[] H02D62_A14558ogUnidad_ ;
   private boolean[] H02D62_n14558ogUnidad_ ;
   private java.math.BigDecimal[] H02D62_A14557ogQuant_ ;
   private boolean[] H02D62_n14557ogQuant_ ;
   private short[] H02D62_A14556ogRolos_ ;
   private boolean[] H02D62_n14556ogRolos_ ;
   private String[] H02D62_A14517ogVossaR ;
   private boolean[] H02D62_n14517ogVossaR ;
   private String[] H02D62_A14515ogMaqui ;
   private boolean[] H02D62_n14515ogMaqui ;
   private String[] H02D62_A14516ogEntrada ;
   private boolean[] H02D62_n14516ogEntrada ;
   private String[] H02D62_A14513ogPoleg ;
   private boolean[] H02D62_n14513ogPoleg ;
   private String[] H02D62_A14512ogJogo ;
   private boolean[] H02D62_n14512ogJogo ;
   private String[] H02D62_A14518ogLote ;
   private boolean[] H02D62_n14518ogLote ;
   private String[] H02D62_A14511ogReclam ;
   private boolean[] H02D62_n14511ogReclam ;
   private String[] H02D62_A14528ogReferen ;
   private boolean[] H02D62_n14528ogReferen ;
   private String[] H02D62_A14507ogCodArt ;
   private boolean[] H02D62_n14507ogCodArt ;
   private java.util.Date[] H02D62_A14506ogFecha ;
   private boolean[] H02D62_n14506ogFecha ;
   private short[] H02D62_A14523ogSerie ;
   private boolean[] H02D62_n14523ogSerie ;
   private com.genexus.webpanels.WebSession AV9Session ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV7TrnContext ;
}

final  class ogguiaimportviewgeneral__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02D62", "SELECT ogEmprCod, ogCliCod, ogARecCod, ogArtiAC, ogArtiCR, ogNmrGuia, ogLinha, ogFio, ogLocaliza, ogUnidad, ogQuant, ogRolos, ogFio_, ogLocalizc, ogUnidad_, ogQuant_, ogRolos_, ogVossaR, ogMaqui, ogEntrada, ogPoleg, ogJogo, ogLote, ogReclam, ogReferen, ogCodArt, ogFecha, ogSerie FROM TXPOGGUIA WHERE (ogEmprCod = ?) AND (ogCliCod = ?) AND (ogARecCod = ?) ORDER BY ogLinha, ogEmprCod, ogCliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7);
               ((String[]) buf[11])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[49])[0] = rslt.getGXDate(27);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((short[]) buf[51])[0] = rslt.getShort(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 10, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
      }
   }

}

