package app.websevices ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwsat_impl extends GXDataArea
{
   public webwsat_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwsat_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwsat_impl.class ));
   }

   public webwsat_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
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
      pa1DV2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1DV2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.websevices.webwsat", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_DATOS_Width", GXutil.rtrim( Dvpanel_panelheader_datos_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_DATOS_Autowidth", GXutil.booltostr( Dvpanel_panelheader_datos_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_DATOS_Autoheight", GXutil.booltostr( Dvpanel_panelheader_datos_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_DATOS_Cls", GXutil.rtrim( Dvpanel_panelheader_datos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_DATOS_Title", GXutil.rtrim( Dvpanel_panelheader_datos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_DATOS_Collapsible", GXutil.booltostr( Dvpanel_panelheader_datos_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_DATOS_Collapsed", GXutil.booltostr( Dvpanel_panelheader_datos_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_DATOS_Showcollapseicon", GXutil.booltostr( Dvpanel_panelheader_datos_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_DATOS_Iconposition", GXutil.rtrim( Dvpanel_panelheader_datos_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_DATOS_Autoscroll", GXutil.booltostr( Dvpanel_panelheader_datos_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_HEADER_Width", GXutil.rtrim( Dvpanel_panelheader_header_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_HEADER_Autowidth", GXutil.booltostr( Dvpanel_panelheader_header_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_HEADER_Autoheight", GXutil.booltostr( Dvpanel_panelheader_header_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_HEADER_Cls", GXutil.rtrim( Dvpanel_panelheader_header_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_HEADER_Title", GXutil.rtrim( Dvpanel_panelheader_header_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_HEADER_Collapsible", GXutil.booltostr( Dvpanel_panelheader_header_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_HEADER_Collapsed", GXutil.booltostr( Dvpanel_panelheader_header_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_HEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_panelheader_header_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_HEADER_Iconposition", GXutil.rtrim( Dvpanel_panelheader_header_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_HEADER_Autoscroll", GXutil.booltostr( Dvpanel_panelheader_header_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_Width", GXutil.rtrim( Dvpanel_panelheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_Autowidth", GXutil.booltostr( Dvpanel_panelheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_Autoheight", GXutil.booltostr( Dvpanel_panelheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_Cls", GXutil.rtrim( Dvpanel_panelheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_Title", GXutil.rtrim( Dvpanel_panelheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_Collapsible", GXutil.booltostr( Dvpanel_panelheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_Collapsed", GXutil.booltostr( Dvpanel_panelheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_panelheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_Iconposition", GXutil.rtrim( Dvpanel_panelheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELHEADER_Autoscroll", GXutil.booltostr( Dvpanel_panelheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELBODY_Width", GXutil.rtrim( Dvpanel_panelbody_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELBODY_Autowidth", GXutil.booltostr( Dvpanel_panelbody_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELBODY_Autoheight", GXutil.booltostr( Dvpanel_panelbody_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELBODY_Cls", GXutil.rtrim( Dvpanel_panelbody_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELBODY_Title", GXutil.rtrim( Dvpanel_panelbody_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELBODY_Collapsible", GXutil.booltostr( Dvpanel_panelbody_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELBODY_Collapsed", GXutil.booltostr( Dvpanel_panelbody_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELBODY_Showcollapseicon", GXutil.booltostr( Dvpanel_panelbody_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELBODY_Iconposition", GXutil.rtrim( Dvpanel_panelbody_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELBODY_Autoscroll", GXutil.booltostr( Dvpanel_panelbody_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELXML_Width", GXutil.rtrim( Dvpanel_panelxml_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELXML_Autowidth", GXutil.booltostr( Dvpanel_panelxml_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELXML_Autoheight", GXutil.booltostr( Dvpanel_panelxml_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELXML_Cls", GXutil.rtrim( Dvpanel_panelxml_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELXML_Title", GXutil.rtrim( Dvpanel_panelxml_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELXML_Collapsible", GXutil.booltostr( Dvpanel_panelxml_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELXML_Collapsed", GXutil.booltostr( Dvpanel_panelxml_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELXML_Showcollapseicon", GXutil.booltostr( Dvpanel_panelxml_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELXML_Iconposition", GXutil.rtrim( Dvpanel_panelxml_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELXML_Autoscroll", GXutil.booltostr( Dvpanel_panelxml_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADO_Width", GXutil.rtrim( Dvpanel_panelresultado_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADO_Autowidth", GXutil.booltostr( Dvpanel_panelresultado_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADO_Autoheight", GXutil.booltostr( Dvpanel_panelresultado_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADO_Cls", GXutil.rtrim( Dvpanel_panelresultado_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADO_Title", GXutil.rtrim( Dvpanel_panelresultado_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADO_Collapsible", GXutil.booltostr( Dvpanel_panelresultado_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADO_Collapsed", GXutil.booltostr( Dvpanel_panelresultado_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADO_Showcollapseicon", GXutil.booltostr( Dvpanel_panelresultado_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADO_Iconposition", GXutil.rtrim( Dvpanel_panelresultado_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADO_Autoscroll", GXutil.booltostr( Dvpanel_panelresultado_Autoscroll));
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
         we1DV2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1DV2( ) ;
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
      return formatLink("app.websevices.webwsat", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebSevices.WebWSAT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consumir WS de la AT", "") ;
   }

   public void wb1DV0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelheader.setProperty("Width", Dvpanel_panelheader_Width);
         ucDvpanel_panelheader.setProperty("AutoWidth", Dvpanel_panelheader_Autowidth);
         ucDvpanel_panelheader.setProperty("AutoHeight", Dvpanel_panelheader_Autoheight);
         ucDvpanel_panelheader.setProperty("Cls", Dvpanel_panelheader_Cls);
         ucDvpanel_panelheader.setProperty("Title", Dvpanel_panelheader_Title);
         ucDvpanel_panelheader.setProperty("Collapsible", Dvpanel_panelheader_Collapsible);
         ucDvpanel_panelheader.setProperty("Collapsed", Dvpanel_panelheader_Collapsed);
         ucDvpanel_panelheader.setProperty("ShowCollapseIcon", Dvpanel_panelheader_Showcollapseicon);
         ucDvpanel_panelheader.setProperty("IconPosition", Dvpanel_panelheader_Iconposition);
         ucDvpanel_panelheader.setProperty("AutoScroll", Dvpanel_panelheader_Autoscroll);
         ucDvpanel_panelheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelheader_Internalname, "DVPANEL_PANELHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELHEADERContainer"+"PanelHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelheader_datos.setProperty("Width", Dvpanel_panelheader_datos_Width);
         ucDvpanel_panelheader_datos.setProperty("AutoWidth", Dvpanel_panelheader_datos_Autowidth);
         ucDvpanel_panelheader_datos.setProperty("AutoHeight", Dvpanel_panelheader_datos_Autoheight);
         ucDvpanel_panelheader_datos.setProperty("Cls", Dvpanel_panelheader_datos_Cls);
         ucDvpanel_panelheader_datos.setProperty("Title", Dvpanel_panelheader_datos_Title);
         ucDvpanel_panelheader_datos.setProperty("Collapsible", Dvpanel_panelheader_datos_Collapsible);
         ucDvpanel_panelheader_datos.setProperty("Collapsed", Dvpanel_panelheader_datos_Collapsed);
         ucDvpanel_panelheader_datos.setProperty("ShowCollapseIcon", Dvpanel_panelheader_datos_Showcollapseicon);
         ucDvpanel_panelheader_datos.setProperty("IconPosition", Dvpanel_panelheader_datos_Iconposition);
         ucDvpanel_panelheader_datos.setProperty("AutoScroll", Dvpanel_panelheader_datos_Autoscroll);
         ucDvpanel_panelheader_datos.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelheader_datos_Internalname, "DVPANEL_PANELHEADER_DATOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELHEADER_DATOSContainer"+"PanelHeader_Datos"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelheader_datos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUsername_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUsername_Internalname, httpContext.getMessage( "User Name", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUsername_Internalname, AV13UserName, GXutil.rtrim( localUtil.format( AV13UserName, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUsername_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUsername_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_WebSevices\\WebWSAT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPassword_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPassword_Internalname, httpContext.getMessage( "Password", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPassword_Internalname, AV10Password, GXutil.rtrim( localUtil.format( AV10Password, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\""+" "+"data-gx-password-reveal"+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPassword_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPassword_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(-1), (short)(0), 0, (byte)(0), (byte)(0), (byte)(-1), false, "", "left", true, "", "HLP_WebSevices\\WebWSAT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavNonce_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavNonce_Internalname, httpContext.getMessage( "Nonce", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavNonce_Internalname, AV9Nonce, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", (short)(0), 1, edtavNonce_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "1024", -1, 0, "", "", (byte)(-1), false, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WebSevices\\WebWSAT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCreated_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCreated_Internalname, httpContext.getMessage( "Created", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCreated_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCreated_Internalname, localUtil.format(AV7Created, "99/99/99"), localUtil.format( AV7Created, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCreated_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCreated_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), false, "", "right", false, "", "HLP_WebSevices\\WebWSAT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavCreated_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavCreated_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebSevices\\WebWSAT.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtngenerarheader_Internalname, "", httpContext.getMessage( "Generar Header", ""), bttBtngenerarheader_Jsonclick, 7, httpContext.getMessage( "Generar Header", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111dv1_client"+"'", TempTags, "", 2, "HLP_WebSevices\\WebWSAT.htm");
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
         /* User Defined Control */
         ucDvpanel_panelheader_header.setProperty("Width", Dvpanel_panelheader_header_Width);
         ucDvpanel_panelheader_header.setProperty("AutoWidth", Dvpanel_panelheader_header_Autowidth);
         ucDvpanel_panelheader_header.setProperty("AutoHeight", Dvpanel_panelheader_header_Autoheight);
         ucDvpanel_panelheader_header.setProperty("Cls", Dvpanel_panelheader_header_Cls);
         ucDvpanel_panelheader_header.setProperty("Title", Dvpanel_panelheader_header_Title);
         ucDvpanel_panelheader_header.setProperty("Collapsible", Dvpanel_panelheader_header_Collapsible);
         ucDvpanel_panelheader_header.setProperty("Collapsed", Dvpanel_panelheader_header_Collapsed);
         ucDvpanel_panelheader_header.setProperty("ShowCollapseIcon", Dvpanel_panelheader_header_Showcollapseicon);
         ucDvpanel_panelheader_header.setProperty("IconPosition", Dvpanel_panelheader_header_Iconposition);
         ucDvpanel_panelheader_header.setProperty("AutoScroll", Dvpanel_panelheader_header_Autoscroll);
         ucDvpanel_panelheader_header.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelheader_header_Internalname, "DVPANEL_PANELHEADER_HEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELHEADER_HEADERContainer"+"PanelHeader_Header"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelheader_header_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHeader_Internalname, httpContext.getMessage( "Header", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavHeader_Internalname, AV8Header, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", (short)(0), 1, edtavHeader_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), false, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WebSevices\\WebWSAT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnheader_plantilla_obtener_Internalname, "", httpContext.getMessage( "Obtenr planitlla", ""), bttBtnheader_plantilla_obtener_Jsonclick, 7, httpContext.getMessage( "Obtenr planitlla", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121dv1_client"+"'", TempTags, "", 2, "HLP_WebSevices\\WebWSAT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         /* User Defined Control */
         ucDvpanel_panelbody.setProperty("Width", Dvpanel_panelbody_Width);
         ucDvpanel_panelbody.setProperty("AutoWidth", Dvpanel_panelbody_Autowidth);
         ucDvpanel_panelbody.setProperty("AutoHeight", Dvpanel_panelbody_Autoheight);
         ucDvpanel_panelbody.setProperty("Cls", Dvpanel_panelbody_Cls);
         ucDvpanel_panelbody.setProperty("Title", Dvpanel_panelbody_Title);
         ucDvpanel_panelbody.setProperty("Collapsible", Dvpanel_panelbody_Collapsible);
         ucDvpanel_panelbody.setProperty("Collapsed", Dvpanel_panelbody_Collapsed);
         ucDvpanel_panelbody.setProperty("ShowCollapseIcon", Dvpanel_panelbody_Showcollapseicon);
         ucDvpanel_panelbody.setProperty("IconPosition", Dvpanel_panelbody_Iconposition);
         ucDvpanel_panelbody.setProperty("AutoScroll", Dvpanel_panelbody_Autoscroll);
         ucDvpanel_panelbody.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelbody_Internalname, "DVPANEL_PANELBODYContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELBODYContainer"+"PanelBody"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelbody_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBody_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBody_Internalname, httpContext.getMessage( "Body", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavBody_Internalname, AV6Body, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", (short)(0), 1, edtavBody_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), false, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WebSevices\\WebWSAT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnbody_plantilla_obtener_Internalname, "", httpContext.getMessage( "Obtenr planitlla", ""), bttBtnbody_plantilla_obtener_Jsonclick, 7, httpContext.getMessage( "Obtenr planitlla", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e131dv1_client"+"'", TempTags, "", 2, "HLP_WebSevices\\WebWSAT.htm");
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
         /* User Defined Control */
         ucDvpanel_panelxml.setProperty("Width", Dvpanel_panelxml_Width);
         ucDvpanel_panelxml.setProperty("AutoWidth", Dvpanel_panelxml_Autowidth);
         ucDvpanel_panelxml.setProperty("AutoHeight", Dvpanel_panelxml_Autoheight);
         ucDvpanel_panelxml.setProperty("Cls", Dvpanel_panelxml_Cls);
         ucDvpanel_panelxml.setProperty("Title", Dvpanel_panelxml_Title);
         ucDvpanel_panelxml.setProperty("Collapsible", Dvpanel_panelxml_Collapsible);
         ucDvpanel_panelxml.setProperty("Collapsed", Dvpanel_panelxml_Collapsed);
         ucDvpanel_panelxml.setProperty("ShowCollapseIcon", Dvpanel_panelxml_Showcollapseicon);
         ucDvpanel_panelxml.setProperty("IconPosition", Dvpanel_panelxml_Iconposition);
         ucDvpanel_panelxml.setProperty("AutoScroll", Dvpanel_panelxml_Autoscroll);
         ucDvpanel_panelxml.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelxml_Internalname, "DVPANEL_PANELXMLContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELXMLContainer"+"PanelXML"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelxml_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavXml_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavXml_Internalname, AV14XML, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", (short)(0), 1, edtavXml_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), false, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WebSevices\\WebWSAT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnxml_obtener_Internalname, "", httpContext.getMessage( "Obtener XML", ""), bttBtnxml_obtener_Jsonclick, 7, httpContext.getMessage( "Obtener XML", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e141dv1_client"+"'", TempTags, "", 2, "HLP_WebSevices\\WebWSAT.htm");
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
         /* User Defined Control */
         ucDvpanel_panelresultado.setProperty("Width", Dvpanel_panelresultado_Width);
         ucDvpanel_panelresultado.setProperty("AutoWidth", Dvpanel_panelresultado_Autowidth);
         ucDvpanel_panelresultado.setProperty("AutoHeight", Dvpanel_panelresultado_Autoheight);
         ucDvpanel_panelresultado.setProperty("Cls", Dvpanel_panelresultado_Cls);
         ucDvpanel_panelresultado.setProperty("Title", Dvpanel_panelresultado_Title);
         ucDvpanel_panelresultado.setProperty("Collapsible", Dvpanel_panelresultado_Collapsible);
         ucDvpanel_panelresultado.setProperty("Collapsed", Dvpanel_panelresultado_Collapsed);
         ucDvpanel_panelresultado.setProperty("ShowCollapseIcon", Dvpanel_panelresultado_Showcollapseicon);
         ucDvpanel_panelresultado.setProperty("IconPosition", Dvpanel_panelresultado_Iconposition);
         ucDvpanel_panelresultado.setProperty("AutoScroll", Dvpanel_panelresultado_Autoscroll);
         ucDvpanel_panelresultado.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelresultado_Internalname, "DVPANEL_PANELRESULTADOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELRESULTADOContainer"+"PanelResultado"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelresultado_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavResultadoat_Internalname, httpContext.getMessage( "Resultado AT", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavResultadoat_Internalname, GXutil.rtrim( AV11ResultadoAT), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"", (short)(0), 1, edtavResultadoat_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), false, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WebSevices\\WebWSAT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconsumirwsat_Internalname, "", httpContext.getMessage( "Consumir WS AT", ""), bttBtnconsumirwsat_Jsonclick, 7, httpContext.getMessage( "Consumir WS AT", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e151dv1_client"+"'", TempTags, "", 2, "HLP_WebSevices\\WebWSAT.htm");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1DV2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consumir WS de la AT", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1DV0( ) ;
   }

   public void ws1DV2( )
   {
      start1DV2( ) ;
      evt1DV2( ) ;
   }

   public void evt1DV2( )
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
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e161DV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e171DV2 ();
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

   public void we1DV2( )
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

   public void pa1DV2( )
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
            GX_FocusControl = edtavUsername_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      rf1DV2( ) ;
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
      edtavResultadoat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavResultadoat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResultadoat_Enabled), 5, 0), true);
   }

   public void rf1DV2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e171DV2 ();
         wb1DV0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1DV2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavResultadoat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavResultadoat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavResultadoat_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1DV0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161DV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_panelheader_datos_Width = httpContext.cgiGet( "DVPANEL_PANELHEADER_DATOS_Width") ;
         Dvpanel_panelheader_datos_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_DATOS_Autowidth")) ;
         Dvpanel_panelheader_datos_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_DATOS_Autoheight")) ;
         Dvpanel_panelheader_datos_Cls = httpContext.cgiGet( "DVPANEL_PANELHEADER_DATOS_Cls") ;
         Dvpanel_panelheader_datos_Title = httpContext.cgiGet( "DVPANEL_PANELHEADER_DATOS_Title") ;
         Dvpanel_panelheader_datos_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_DATOS_Collapsible")) ;
         Dvpanel_panelheader_datos_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_DATOS_Collapsed")) ;
         Dvpanel_panelheader_datos_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_DATOS_Showcollapseicon")) ;
         Dvpanel_panelheader_datos_Iconposition = httpContext.cgiGet( "DVPANEL_PANELHEADER_DATOS_Iconposition") ;
         Dvpanel_panelheader_datos_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_DATOS_Autoscroll")) ;
         Dvpanel_panelheader_header_Width = httpContext.cgiGet( "DVPANEL_PANELHEADER_HEADER_Width") ;
         Dvpanel_panelheader_header_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_HEADER_Autowidth")) ;
         Dvpanel_panelheader_header_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_HEADER_Autoheight")) ;
         Dvpanel_panelheader_header_Cls = httpContext.cgiGet( "DVPANEL_PANELHEADER_HEADER_Cls") ;
         Dvpanel_panelheader_header_Title = httpContext.cgiGet( "DVPANEL_PANELHEADER_HEADER_Title") ;
         Dvpanel_panelheader_header_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_HEADER_Collapsible")) ;
         Dvpanel_panelheader_header_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_HEADER_Collapsed")) ;
         Dvpanel_panelheader_header_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_HEADER_Showcollapseicon")) ;
         Dvpanel_panelheader_header_Iconposition = httpContext.cgiGet( "DVPANEL_PANELHEADER_HEADER_Iconposition") ;
         Dvpanel_panelheader_header_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_HEADER_Autoscroll")) ;
         Dvpanel_panelheader_Width = httpContext.cgiGet( "DVPANEL_PANELHEADER_Width") ;
         Dvpanel_panelheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_Autowidth")) ;
         Dvpanel_panelheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_Autoheight")) ;
         Dvpanel_panelheader_Cls = httpContext.cgiGet( "DVPANEL_PANELHEADER_Cls") ;
         Dvpanel_panelheader_Title = httpContext.cgiGet( "DVPANEL_PANELHEADER_Title") ;
         Dvpanel_panelheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_Collapsible")) ;
         Dvpanel_panelheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_Collapsed")) ;
         Dvpanel_panelheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_Showcollapseicon")) ;
         Dvpanel_panelheader_Iconposition = httpContext.cgiGet( "DVPANEL_PANELHEADER_Iconposition") ;
         Dvpanel_panelheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELHEADER_Autoscroll")) ;
         Dvpanel_panelbody_Width = httpContext.cgiGet( "DVPANEL_PANELBODY_Width") ;
         Dvpanel_panelbody_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELBODY_Autowidth")) ;
         Dvpanel_panelbody_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELBODY_Autoheight")) ;
         Dvpanel_panelbody_Cls = httpContext.cgiGet( "DVPANEL_PANELBODY_Cls") ;
         Dvpanel_panelbody_Title = httpContext.cgiGet( "DVPANEL_PANELBODY_Title") ;
         Dvpanel_panelbody_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELBODY_Collapsible")) ;
         Dvpanel_panelbody_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELBODY_Collapsed")) ;
         Dvpanel_panelbody_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELBODY_Showcollapseicon")) ;
         Dvpanel_panelbody_Iconposition = httpContext.cgiGet( "DVPANEL_PANELBODY_Iconposition") ;
         Dvpanel_panelbody_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELBODY_Autoscroll")) ;
         Dvpanel_panelxml_Width = httpContext.cgiGet( "DVPANEL_PANELXML_Width") ;
         Dvpanel_panelxml_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELXML_Autowidth")) ;
         Dvpanel_panelxml_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELXML_Autoheight")) ;
         Dvpanel_panelxml_Cls = httpContext.cgiGet( "DVPANEL_PANELXML_Cls") ;
         Dvpanel_panelxml_Title = httpContext.cgiGet( "DVPANEL_PANELXML_Title") ;
         Dvpanel_panelxml_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELXML_Collapsible")) ;
         Dvpanel_panelxml_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELXML_Collapsed")) ;
         Dvpanel_panelxml_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELXML_Showcollapseicon")) ;
         Dvpanel_panelxml_Iconposition = httpContext.cgiGet( "DVPANEL_PANELXML_Iconposition") ;
         Dvpanel_panelxml_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELXML_Autoscroll")) ;
         Dvpanel_panelresultado_Width = httpContext.cgiGet( "DVPANEL_PANELRESULTADO_Width") ;
         Dvpanel_panelresultado_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADO_Autowidth")) ;
         Dvpanel_panelresultado_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADO_Autoheight")) ;
         Dvpanel_panelresultado_Cls = httpContext.cgiGet( "DVPANEL_PANELRESULTADO_Cls") ;
         Dvpanel_panelresultado_Title = httpContext.cgiGet( "DVPANEL_PANELRESULTADO_Title") ;
         Dvpanel_panelresultado_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADO_Collapsible")) ;
         Dvpanel_panelresultado_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADO_Collapsed")) ;
         Dvpanel_panelresultado_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADO_Showcollapseicon")) ;
         Dvpanel_panelresultado_Iconposition = httpContext.cgiGet( "DVPANEL_PANELRESULTADO_Iconposition") ;
         Dvpanel_panelresultado_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADO_Autoscroll")) ;
         /* Read variables values. */
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
      e161DV2 ();
      if (returnInSub) return;
   }

   public void e161DV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV17Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwsat_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Station = GXt_char1 ;
      GXv_char2[0] = AV18Emprcod ;
      GXv_char3[0] = AV19Emprnom ;
      GXv_char4[0] = AV20Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV17Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwsat_impl.this.AV18Emprcod = GXv_char2[0] ;
      webwsat_impl.this.AV19Emprnom = GXv_char3[0] ;
      webwsat_impl.this.AV20Usurcod = GXv_char4[0] ;
      /* Execute user subroutine: 'HEADER_PANTILLA' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'BODY_PLANTILLA' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'XML' */
      S132 ();
      if (returnInSub) return;
   }

   public void S112( )
   {
      /* 'HEADER_PANTILLA' Routine */
      returnInSub = false ;
      AV8Header = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Header", AV8Header);
      AV8Header += httpContext.getMessage( "   <S:Header> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Header", AV8Header);
      AV8Header += httpContext.getMessage( "       <wss:Security xmlns:wss=\"http://schemas.xmlsoap.org/ws/2002/12/secext\"> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Header", AV8Header);
      AV8Header += httpContext.getMessage( "            <wss:UsernameToken> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Header", AV8Header);
      AV8Header += httpContext.getMessage( "                <wss:Username>[UserName]</wss:Username> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Header", AV8Header);
      AV8Header += httpContext.getMessage( "                <wss:Password>[UserPassword]</wss:Password> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Header", AV8Header);
      AV8Header += httpContext.getMessage( "               <wss:Nonce>[Nonce]</wss:Nonce> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Header", AV8Header);
      AV8Header += httpContext.getMessage( "                <wss:Created>[Created]</wss:Created> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Header", AV8Header);
      AV8Header += httpContext.getMessage( "            </wss:UsernameToken> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Header", AV8Header);
      AV8Header += httpContext.getMessage( "        </wss:Security> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Header", AV8Header);
      AV8Header += httpContext.getMessage( "    </S:Header>  ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Header", AV8Header);
   }

   public void S122( )
   {
      /* 'BODY_PLANTILLA' Routine */
      returnInSub = false ;
      AV6Body = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "  <Body> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "        <!--Comunicação de um Documentos de Transporte pelo Cliente--> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "       <envioDocumentoTransporteRequestElem xmlns=\"https://servicos.portaldasfinancas.gov.pt/sgdtws/documentosTransporte/\"> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <TaxRegistrationNumber xmlns=\"\">[integer]</TaxRegistrationNumber> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <CompanyName xmlns=\"\">[string]</CompanyName> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <CompanyAddress xmlns=\"\"> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <Addressdetail>[string?]</Addressdetail> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <City>[string?]</City> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <PostalCode>[string?]</PostalCode> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <Country>[string?]</Country> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            </CompanyAddress> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <DocumentNumber xmlns=\"\">[string]</DocumentNumber> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <ATDocCodeID xmlns=\"\">[string?]</ATDocCodeID> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <MovementStatus xmlns=\"\">[string]</MovementStatus> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <MovementDate xmlns=\"\">[date]</MovementDate> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <MovementType xmlns=\"\">[string]</MovementType> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <CustomerTaxID xmlns=\"\">[string?]</CustomerTaxID> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <!-- Optional --> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <CustomerAddress xmlns=\"\"> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <Addressdetail>[string?]</Addressdetail> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <City>[string?]</City> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <PostalCode>[string?]</PostalCode> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <Country>[string?]</Country> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            </CustomerAddress> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <CustomerName xmlns=\"\">[string?]</CustomerName> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <!-- Optional --> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <AddressTo xmlns=\"\"> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <Addressdetail>[string?]</Addressdetail> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <City>[string?]</City> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <PostalCode>[string?]</PostalCode> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <Country>[string?]</Country> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            </AddressTo> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <AddressFrom xmlns=\"\"> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <Addressdetail>[string?]</Addressdetail> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <City>[string?]</City> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <PostalCode>[string?]</PostalCode> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <Country>[string?]</Country> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            </AddressFrom> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <MovementEndTime xmlns=\"\">[dateTime?]</MovementEndTime> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <MovementStartTime xmlns=\"\">[dateTime]</MovementStartTime> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <VehicleID xmlns=\"\">[string?]</VehicleID> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            <Line xmlns=\"\"> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <!-- Optional --> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <OrderReferences> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                    <OriginatingON>[string?]</OriginatingON> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                </OrderReferences> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <ProductDescription>[string]</ProductDescription> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <Quantity>[decimal]</Quantity> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <UnitOfMeasure>[string]</UnitOfMeasure> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "                <UnitPrice>[decimal]</UnitPrice> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "            </Line> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "        </envioDocumentoTransporteRequestElem> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
      AV6Body += httpContext.getMessage( "    </Body> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Body", AV6Body);
   }

   public void S132( )
   {
      /* 'XML' Routine */
      returnInSub = false ;
      AV14XML = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14XML", AV14XML);
      AV14XML += httpContext.getMessage( "	<Envelope xmlns=\"http://schemas.xmlsoap.org/soap/envelope/\"> ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14XML", AV14XML);
      AV14XML += httpContext.getMessage( "		[Header] ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14XML", AV14XML);
      AV14XML += httpContext.getMessage( "		[Body]	 ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14XML", AV14XML);
      AV14XML += httpContext.getMessage( "	</Envelope>	 ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14XML", AV14XML);
   }

   protected void nextLoad( )
   {
   }

   protected void e171DV2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      pa1DV2( ) ;
      ws1DV2( ) ;
      we1DV2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101643874", true, true);
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
      httpContext.AddJavascriptSource("websevices/webwsat.js", "?20266101643874", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavUsername_Internalname = "vUSERNAME" ;
      edtavPassword_Internalname = "vPASSWORD" ;
      edtavNonce_Internalname = "vNONCE" ;
      edtavCreated_Internalname = "vCREATED" ;
      bttBtngenerarheader_Internalname = "BTNGENERARHEADER" ;
      divPanelheader_datos_Internalname = "PANELHEADER_DATOS" ;
      Dvpanel_panelheader_datos_Internalname = "DVPANEL_PANELHEADER_DATOS" ;
      edtavHeader_Internalname = "vHEADER" ;
      bttBtnheader_plantilla_obtener_Internalname = "BTNHEADER_PLANTILLA_OBTENER" ;
      divPanelheader_header_Internalname = "PANELHEADER_HEADER" ;
      Dvpanel_panelheader_header_Internalname = "DVPANEL_PANELHEADER_HEADER" ;
      divPanelheader_Internalname = "PANELHEADER" ;
      Dvpanel_panelheader_Internalname = "DVPANEL_PANELHEADER" ;
      edtavBody_Internalname = "vBODY" ;
      bttBtnbody_plantilla_obtener_Internalname = "BTNBODY_PLANTILLA_OBTENER" ;
      divPanelbody_Internalname = "PANELBODY" ;
      Dvpanel_panelbody_Internalname = "DVPANEL_PANELBODY" ;
      edtavXml_Internalname = "vXML" ;
      bttBtnxml_obtener_Internalname = "BTNXML_OBTENER" ;
      divPanelxml_Internalname = "PANELXML" ;
      Dvpanel_panelxml_Internalname = "DVPANEL_PANELXML" ;
      edtavResultadoat_Internalname = "vRESULTADOAT" ;
      bttBtnconsumirwsat_Internalname = "BTNCONSUMIRWSAT" ;
      divPanelresultado_Internalname = "PANELRESULTADO" ;
      Dvpanel_panelresultado_Internalname = "DVPANEL_PANELRESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
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
      edtavResultadoat_Enabled = 1 ;
      edtavXml_Enabled = 1 ;
      edtavBody_Enabled = 1 ;
      edtavHeader_Enabled = 1 ;
      edtavCreated_Jsonclick = "" ;
      edtavCreated_Enabled = 1 ;
      edtavNonce_Enabled = 1 ;
      edtavPassword_Jsonclick = "" ;
      edtavPassword_Enabled = 1 ;
      edtavUsername_Jsonclick = "" ;
      edtavUsername_Enabled = 1 ;
      Dvpanel_panelresultado_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultado_Iconposition = "Right" ;
      Dvpanel_panelresultado_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultado_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultado_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultado_Title = httpContext.getMessage( "Resultado obtenido de AT", "") ;
      Dvpanel_panelresultado_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelresultado_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultado_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultado_Width = "100%" ;
      Dvpanel_panelxml_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelxml_Iconposition = "Right" ;
      Dvpanel_panelxml_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelxml_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelxml_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelxml_Title = httpContext.getMessage( "Archivo XML", "") ;
      Dvpanel_panelxml_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelxml_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelxml_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelxml_Width = "100%" ;
      Dvpanel_panelbody_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelbody_Iconposition = "Right" ;
      Dvpanel_panelbody_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelbody_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelbody_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelbody_Title = httpContext.getMessage( "Estructura en la Sección Body del XML", "") ;
      Dvpanel_panelbody_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelbody_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelbody_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelbody_Width = "100%" ;
      Dvpanel_panelheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelheader_Iconposition = "Right" ;
      Dvpanel_panelheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelheader_Title = httpContext.getMessage( "Datos que deben ir en la Sección Header del XML", "") ;
      Dvpanel_panelheader_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelheader_Width = "100%" ;
      Dvpanel_panelheader_header_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelheader_header_Iconposition = "Right" ;
      Dvpanel_panelheader_header_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelheader_header_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelheader_header_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelheader_header_Title = httpContext.getMessage( "Header", "") ;
      Dvpanel_panelheader_header_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelheader_header_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelheader_header_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelheader_header_Width = "100%" ;
      Dvpanel_panelheader_datos_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelheader_datos_Iconposition = "Right" ;
      Dvpanel_panelheader_datos_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelheader_datos_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelheader_datos_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelheader_datos_Title = httpContext.getMessage( "Datos del header", "") ;
      Dvpanel_panelheader_datos_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelheader_datos_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelheader_datos_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelheader_datos_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Consumir WS de la AT", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONSUMIRWSAT'","{handler:'e151DV1',iparms:[]");
      setEventMetadata("'DOCONSUMIRWSAT'",",oparms:[]}");
      setEventMetadata("'DOXML_OBTENER'","{handler:'e141DV1',iparms:[{av:'AV8Header',fld:'vHEADER',pic:''},{av:'AV6Body',fld:'vBODY',pic:''}]");
      setEventMetadata("'DOXML_OBTENER'",",oparms:[{av:'AV14XML',fld:'vXML',pic:''}]}");
      setEventMetadata("'DOBODY_PLANTILLA_OBTENER'","{handler:'e131DV1',iparms:[]");
      setEventMetadata("'DOBODY_PLANTILLA_OBTENER'",",oparms:[{av:'AV6Body',fld:'vBODY',pic:''}]}");
      setEventMetadata("'DOHEADER_PLANTILLA_OBTENER'","{handler:'e121DV1',iparms:[]");
      setEventMetadata("'DOHEADER_PLANTILLA_OBTENER'",",oparms:[{av:'AV8Header',fld:'vHEADER',pic:''}]}");
      setEventMetadata("'DOGENERARHEADER'","{handler:'e111DV1',iparms:[{av:'AV8Header',fld:'vHEADER',pic:''},{av:'AV13UserName',fld:'vUSERNAME',pic:''},{av:'AV10Password',fld:'vPASSWORD',pic:''},{av:'AV9Nonce',fld:'vNONCE',pic:''},{av:'AV7Created',fld:'vCREATED',pic:''}]");
      setEventMetadata("'DOGENERARHEADER'",",oparms:[{av:'AV8Header',fld:'vHEADER',pic:''}]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panelheader = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panelheader_datos = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV13UserName = "" ;
      AV10Password = "" ;
      AV9Nonce = "" ;
      AV7Created = GXutil.nullDate() ;
      bttBtngenerarheader_Jsonclick = "" ;
      ucDvpanel_panelheader_header = new com.genexus.webpanels.GXUserControl();
      AV8Header = "" ;
      bttBtnheader_plantilla_obtener_Jsonclick = "" ;
      ucDvpanel_panelbody = new com.genexus.webpanels.GXUserControl();
      AV6Body = "" ;
      bttBtnbody_plantilla_obtener_Jsonclick = "" ;
      ucDvpanel_panelxml = new com.genexus.webpanels.GXUserControl();
      AV14XML = "" ;
      bttBtnxml_obtener_Jsonclick = "" ;
      ucDvpanel_panelresultado = new com.genexus.webpanels.GXUserControl();
      AV11ResultadoAT = "" ;
      bttBtnconsumirwsat_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Station = "" ;
      GXt_char1 = "" ;
      AV18Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV19Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV20Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavResultadoat_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavUsername_Enabled ;
   private int edtavPassword_Enabled ;
   private int edtavNonce_Enabled ;
   private int edtavCreated_Enabled ;
   private int edtavHeader_Enabled ;
   private int edtavBody_Enabled ;
   private int edtavXml_Enabled ;
   private int edtavResultadoat_Enabled ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_panelheader_datos_Width ;
   private String Dvpanel_panelheader_datos_Cls ;
   private String Dvpanel_panelheader_datos_Title ;
   private String Dvpanel_panelheader_datos_Iconposition ;
   private String Dvpanel_panelheader_header_Width ;
   private String Dvpanel_panelheader_header_Cls ;
   private String Dvpanel_panelheader_header_Title ;
   private String Dvpanel_panelheader_header_Iconposition ;
   private String Dvpanel_panelheader_Width ;
   private String Dvpanel_panelheader_Cls ;
   private String Dvpanel_panelheader_Title ;
   private String Dvpanel_panelheader_Iconposition ;
   private String Dvpanel_panelbody_Width ;
   private String Dvpanel_panelbody_Cls ;
   private String Dvpanel_panelbody_Title ;
   private String Dvpanel_panelbody_Iconposition ;
   private String Dvpanel_panelxml_Width ;
   private String Dvpanel_panelxml_Cls ;
   private String Dvpanel_panelxml_Title ;
   private String Dvpanel_panelxml_Iconposition ;
   private String Dvpanel_panelresultado_Width ;
   private String Dvpanel_panelresultado_Cls ;
   private String Dvpanel_panelresultado_Title ;
   private String Dvpanel_panelresultado_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panelheader_Internalname ;
   private String divPanelheader_Internalname ;
   private String Dvpanel_panelheader_datos_Internalname ;
   private String divPanelheader_datos_Internalname ;
   private String edtavUsername_Internalname ;
   private String TempTags ;
   private String edtavUsername_Jsonclick ;
   private String edtavPassword_Internalname ;
   private String edtavPassword_Jsonclick ;
   private String edtavNonce_Internalname ;
   private String edtavCreated_Internalname ;
   private String edtavCreated_Jsonclick ;
   private String bttBtngenerarheader_Internalname ;
   private String bttBtngenerarheader_Jsonclick ;
   private String Dvpanel_panelheader_header_Internalname ;
   private String divPanelheader_header_Internalname ;
   private String edtavHeader_Internalname ;
   private String bttBtnheader_plantilla_obtener_Internalname ;
   private String bttBtnheader_plantilla_obtener_Jsonclick ;
   private String Dvpanel_panelbody_Internalname ;
   private String divPanelbody_Internalname ;
   private String edtavBody_Internalname ;
   private String bttBtnbody_plantilla_obtener_Internalname ;
   private String bttBtnbody_plantilla_obtener_Jsonclick ;
   private String Dvpanel_panelxml_Internalname ;
   private String divPanelxml_Internalname ;
   private String edtavXml_Internalname ;
   private String bttBtnxml_obtener_Internalname ;
   private String bttBtnxml_obtener_Jsonclick ;
   private String Dvpanel_panelresultado_Internalname ;
   private String divPanelresultado_Internalname ;
   private String edtavResultadoat_Internalname ;
   private String AV11ResultadoAT ;
   private String bttBtnconsumirwsat_Internalname ;
   private String bttBtnconsumirwsat_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV17Station ;
   private String GXt_char1 ;
   private String AV18Emprcod ;
   private String GXv_char2[] ;
   private String AV19Emprnom ;
   private String GXv_char3[] ;
   private String AV20Usurcod ;
   private String GXv_char4[] ;
   private java.util.Date AV7Created ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_panelheader_datos_Autowidth ;
   private boolean Dvpanel_panelheader_datos_Autoheight ;
   private boolean Dvpanel_panelheader_datos_Collapsible ;
   private boolean Dvpanel_panelheader_datos_Collapsed ;
   private boolean Dvpanel_panelheader_datos_Showcollapseicon ;
   private boolean Dvpanel_panelheader_datos_Autoscroll ;
   private boolean Dvpanel_panelheader_header_Autowidth ;
   private boolean Dvpanel_panelheader_header_Autoheight ;
   private boolean Dvpanel_panelheader_header_Collapsible ;
   private boolean Dvpanel_panelheader_header_Collapsed ;
   private boolean Dvpanel_panelheader_header_Showcollapseicon ;
   private boolean Dvpanel_panelheader_header_Autoscroll ;
   private boolean Dvpanel_panelheader_Autowidth ;
   private boolean Dvpanel_panelheader_Autoheight ;
   private boolean Dvpanel_panelheader_Collapsible ;
   private boolean Dvpanel_panelheader_Collapsed ;
   private boolean Dvpanel_panelheader_Showcollapseicon ;
   private boolean Dvpanel_panelheader_Autoscroll ;
   private boolean Dvpanel_panelbody_Autowidth ;
   private boolean Dvpanel_panelbody_Autoheight ;
   private boolean Dvpanel_panelbody_Collapsible ;
   private boolean Dvpanel_panelbody_Collapsed ;
   private boolean Dvpanel_panelbody_Showcollapseicon ;
   private boolean Dvpanel_panelbody_Autoscroll ;
   private boolean Dvpanel_panelxml_Autowidth ;
   private boolean Dvpanel_panelxml_Autoheight ;
   private boolean Dvpanel_panelxml_Collapsible ;
   private boolean Dvpanel_panelxml_Collapsed ;
   private boolean Dvpanel_panelxml_Showcollapseicon ;
   private boolean Dvpanel_panelxml_Autoscroll ;
   private boolean Dvpanel_panelresultado_Autowidth ;
   private boolean Dvpanel_panelresultado_Autoheight ;
   private boolean Dvpanel_panelresultado_Collapsible ;
   private boolean Dvpanel_panelresultado_Collapsed ;
   private boolean Dvpanel_panelresultado_Showcollapseicon ;
   private boolean Dvpanel_panelresultado_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String AV8Header ;
   private String AV6Body ;
   private String AV14XML ;
   private String AV13UserName ;
   private String AV10Password ;
   private String AV9Nonce ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelheader_datos ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelheader_header ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelbody ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelxml ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelresultado ;
   private com.genexus.webpanels.GXWebForm Form ;
}

