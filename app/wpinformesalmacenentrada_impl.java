package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wpinformesalmacenentrada_impl extends GXDataArea
{
   public wpinformesalmacenentrada_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpinformesalmacenentrada_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpinformesalmacenentrada_impl.class ));
   }

   public wpinformesalmacenentrada_impl( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbrest = new HTMLChoice();
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
      paGC2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startGC2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wpinformesalmacenentrada", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Emprcod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV9Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Emprcod, "@!"))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Width", GXutil.rtrim( Dvpanel_unnamedtable3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Cls", GXutil.rtrim( Dvpanel_unnamedtable3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Title", GXutil.rtrim( Dvpanel_unnamedtable3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable3_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Width", GXutil.rtrim( Dvpanel_unnamedtable4_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable4_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable4_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Cls", GXutil.rtrim( Dvpanel_unnamedtable4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Title", GXutil.rtrim( Dvpanel_unnamedtable4_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable4_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable4_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable4_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Width", GXutil.rtrim( Dvpanel_unnamedtable5_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable5_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable5_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Cls", GXutil.rtrim( Dvpanel_unnamedtable5_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Title", GXutil.rtrim( Dvpanel_unnamedtable5_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable5_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable5_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable5_Autoscroll));
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
      if ( ! ( WebComp_Wcwcclientearticuloresumenentradas == null ) )
      {
         WebComp_Wcwcclientearticuloresumenentradas.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcclienteresumenentradas == null ) )
      {
         WebComp_Wcwcclienteresumenentradas.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcdetalleentradas == null ) )
      {
         WebComp_Wcwcdetalleentradas.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcdistribuciondeunidades == null ) )
      {
         WebComp_Wcwcdistribuciondeunidades.componentjscripts();
      }
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
         weGC2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtGC2( ) ;
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
      return formatLink("app.wpinformesalmacenentrada", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WPInformesAlmacenEntrada" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WPInformes Almacen Entrada", "") ;
   }

   public void wbGC0( )
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
         wb_table1_17_GC2( true) ;
      }
      else
      {
         wb_table1_17_GC2( false) ;
      }
      return  ;
   }

   public void wb_table1_17_GC2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         wb_table2_70_GC2( true) ;
      }
      else
      {
         wb_table2_70_GC2( false) ;
      }
      return  ;
   }

   public void wb_table2_70_GC2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable3.setProperty("Width", Dvpanel_unnamedtable3_Width);
         ucDvpanel_unnamedtable3.setProperty("AutoWidth", Dvpanel_unnamedtable3_Autowidth);
         ucDvpanel_unnamedtable3.setProperty("AutoHeight", Dvpanel_unnamedtable3_Autoheight);
         ucDvpanel_unnamedtable3.setProperty("Cls", Dvpanel_unnamedtable3_Cls);
         ucDvpanel_unnamedtable3.setProperty("Title", Dvpanel_unnamedtable3_Title);
         ucDvpanel_unnamedtable3.setProperty("Collapsible", Dvpanel_unnamedtable3_Collapsible);
         ucDvpanel_unnamedtable3.setProperty("Collapsed", Dvpanel_unnamedtable3_Collapsed);
         ucDvpanel_unnamedtable3.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable3_Showcollapseicon);
         ucDvpanel_unnamedtable3.setProperty("IconPosition", Dvpanel_unnamedtable3_Iconposition);
         ucDvpanel_unnamedtable3.setProperty("AutoScroll", Dvpanel_unnamedtable3_Autoscroll);
         ucDvpanel_unnamedtable3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable3_Internalname, "DVPANEL_UNNAMEDTABLE3Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE3Container"+"UnnamedTable3"+"\" style=\"display:none;\">") ;
         wb_table3_78_GC2( true) ;
      }
      else
      {
         wb_table3_78_GC2( false) ;
      }
      return  ;
   }

   public void wb_table3_78_GC2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable4.setProperty("Width", Dvpanel_unnamedtable4_Width);
         ucDvpanel_unnamedtable4.setProperty("AutoWidth", Dvpanel_unnamedtable4_Autowidth);
         ucDvpanel_unnamedtable4.setProperty("AutoHeight", Dvpanel_unnamedtable4_Autoheight);
         ucDvpanel_unnamedtable4.setProperty("Cls", Dvpanel_unnamedtable4_Cls);
         ucDvpanel_unnamedtable4.setProperty("Title", Dvpanel_unnamedtable4_Title);
         ucDvpanel_unnamedtable4.setProperty("Collapsible", Dvpanel_unnamedtable4_Collapsible);
         ucDvpanel_unnamedtable4.setProperty("Collapsed", Dvpanel_unnamedtable4_Collapsed);
         ucDvpanel_unnamedtable4.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable4_Showcollapseicon);
         ucDvpanel_unnamedtable4.setProperty("IconPosition", Dvpanel_unnamedtable4_Iconposition);
         ucDvpanel_unnamedtable4.setProperty("AutoScroll", Dvpanel_unnamedtable4_Autoscroll);
         ucDvpanel_unnamedtable4.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable4_Internalname, "DVPANEL_UNNAMEDTABLE4Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE4Container"+"UnnamedTable4"+"\" style=\"display:none;\">") ;
         wb_table4_86_GC2( true) ;
      }
      else
      {
         wb_table4_86_GC2( false) ;
      }
      return  ;
   }

   public void wb_table4_86_GC2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable5.setProperty("Width", Dvpanel_unnamedtable5_Width);
         ucDvpanel_unnamedtable5.setProperty("AutoWidth", Dvpanel_unnamedtable5_Autowidth);
         ucDvpanel_unnamedtable5.setProperty("AutoHeight", Dvpanel_unnamedtable5_Autoheight);
         ucDvpanel_unnamedtable5.setProperty("Cls", Dvpanel_unnamedtable5_Cls);
         ucDvpanel_unnamedtable5.setProperty("Title", Dvpanel_unnamedtable5_Title);
         ucDvpanel_unnamedtable5.setProperty("Collapsible", Dvpanel_unnamedtable5_Collapsible);
         ucDvpanel_unnamedtable5.setProperty("Collapsed", Dvpanel_unnamedtable5_Collapsed);
         ucDvpanel_unnamedtable5.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable5_Showcollapseicon);
         ucDvpanel_unnamedtable5.setProperty("IconPosition", Dvpanel_unnamedtable5_Iconposition);
         ucDvpanel_unnamedtable5.setProperty("AutoScroll", Dvpanel_unnamedtable5_Autoscroll);
         ucDvpanel_unnamedtable5.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable5_Internalname, "DVPANEL_UNNAMEDTABLE5Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE5Container"+"UnnamedTable5"+"\" style=\"display:none;\">") ;
         wb_table5_94_GC2( true) ;
      }
      else
      {
         wb_table5_94_GC2( false) ;
      }
      return  ;
   }

   public void wb_table5_94_GC2e( boolean wbgen )
   {
      if ( wbgen )
      {
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

   public void startGC2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "WPInformes Almacen Entrada", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupGC0( ) ;
   }

   public void wsGC2( )
   {
      startGC2( ) ;
      evtGC2( ) ;
   }

   public void evtGC2( )
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
                           e11GC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e12GC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCLIENTEINICIAL.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13GC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCLIENTEFINAL.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14GC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFECHAINICIAL.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15GC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFECHAFINAL.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16GC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VARTICULOINICIAL.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e17GC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VARTICULOFINAL.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e18GC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBREST.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e19GC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e20GC2 ();
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 73 )
                     {
                        OldWcwcclientearticuloresumenentradas = httpContext.cgiGet( "W0073") ;
                        if ( ( GXutil.len( OldWcwcclientearticuloresumenentradas) == 0 ) || ( GXutil.strcmp(OldWcwcclientearticuloresumenentradas, WebComp_Wcwcclientearticuloresumenentradas_Component) != 0 ) )
                        {
                           WebComp_Wcwcclientearticuloresumenentradas = WebUtils.getWebComponent(getClass(), "app." + OldWcwcclientearticuloresumenentradas + "_impl", remoteHandle, context);
                           WebComp_Wcwcclientearticuloresumenentradas_Component = OldWcwcclientearticuloresumenentradas ;
                        }
                        if ( GXutil.len( WebComp_Wcwcclientearticuloresumenentradas_Component) != 0 )
                        {
                           WebComp_Wcwcclientearticuloresumenentradas.componentprocess("W0073", "", sEvt);
                        }
                        WebComp_Wcwcclientearticuloresumenentradas_Component = OldWcwcclientearticuloresumenentradas ;
                     }
                     else if ( nCmpId == 81 )
                     {
                        OldWcwcclienteresumenentradas = httpContext.cgiGet( "W0081") ;
                        if ( ( GXutil.len( OldWcwcclienteresumenentradas) == 0 ) || ( GXutil.strcmp(OldWcwcclienteresumenentradas, WebComp_Wcwcclienteresumenentradas_Component) != 0 ) )
                        {
                           WebComp_Wcwcclienteresumenentradas = WebUtils.getWebComponent(getClass(), "app." + OldWcwcclienteresumenentradas + "_impl", remoteHandle, context);
                           WebComp_Wcwcclienteresumenentradas_Component = OldWcwcclienteresumenentradas ;
                        }
                        if ( GXutil.len( WebComp_Wcwcclienteresumenentradas_Component) != 0 )
                        {
                           WebComp_Wcwcclienteresumenentradas.componentprocess("W0081", "", sEvt);
                        }
                        WebComp_Wcwcclienteresumenentradas_Component = OldWcwcclienteresumenentradas ;
                     }
                     else if ( nCmpId == 89 )
                     {
                        OldWcwcdetalleentradas = httpContext.cgiGet( "W0089") ;
                        if ( ( GXutil.len( OldWcwcdetalleentradas) == 0 ) || ( GXutil.strcmp(OldWcwcdetalleentradas, WebComp_Wcwcdetalleentradas_Component) != 0 ) )
                        {
                           WebComp_Wcwcdetalleentradas = WebUtils.getWebComponent(getClass(), "app." + OldWcwcdetalleentradas + "_impl", remoteHandle, context);
                           WebComp_Wcwcdetalleentradas_Component = OldWcwcdetalleentradas ;
                        }
                        if ( GXutil.len( WebComp_Wcwcdetalleentradas_Component) != 0 )
                        {
                           WebComp_Wcwcdetalleentradas.componentprocess("W0089", "", sEvt);
                        }
                        WebComp_Wcwcdetalleentradas_Component = OldWcwcdetalleentradas ;
                     }
                     else if ( nCmpId == 97 )
                     {
                        OldWcwcdistribuciondeunidades = httpContext.cgiGet( "W0097") ;
                        if ( ( GXutil.len( OldWcwcdistribuciondeunidades) == 0 ) || ( GXutil.strcmp(OldWcwcdistribuciondeunidades, WebComp_Wcwcdistribuciondeunidades_Component) != 0 ) )
                        {
                           WebComp_Wcwcdistribuciondeunidades = WebUtils.getWebComponent(getClass(), "app." + OldWcwcdistribuciondeunidades + "_impl", remoteHandle, context);
                           WebComp_Wcwcdistribuciondeunidades_Component = OldWcwcdistribuciondeunidades ;
                        }
                        if ( GXutil.len( WebComp_Wcwcdistribuciondeunidades_Component) != 0 )
                        {
                           WebComp_Wcwcdistribuciondeunidades.componentprocess("W0097", "", sEvt);
                        }
                        WebComp_Wcwcdistribuciondeunidades_Component = OldWcwcdistribuciondeunidades ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weGC2( )
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

   public void paGC2( )
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
            GX_FocusControl = edtavClienteinicial_Internalname ;
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
      if ( cmbavAlbrest.getItemCount() > 0 )
      {
         AV15AlbREst = (byte)(GXutil.lval( cmbavAlbrest.getValidValue(GXutil.trim( GXutil.str( AV15AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15AlbREst", GXutil.str( AV15AlbREst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbrest.setValue( GXutil.trim( GXutil.str( AV15AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrest.getInternalname(), "Values", cmbavAlbrest.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfGC2( ) ;
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
   }

   public void rfGC2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e12GC2 ();
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcclientearticuloresumenentradas_Component) != 0 )
            {
               WebComp_Wcwcclientearticuloresumenentradas.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcclienteresumenentradas_Component) != 0 )
            {
               WebComp_Wcwcclienteresumenentradas.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcdetalleentradas_Component) != 0 )
            {
               WebComp_Wcwcdetalleentradas.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcdistribuciondeunidades_Component) != 0 )
            {
               WebComp_Wcwcdistribuciondeunidades.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e20GC2 ();
         wbGC0( ) ;
      }
   }

   public void send_integrity_lvl_hashesGC2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV9Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Emprcod, "@!"))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupGC0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11GC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
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
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
         Dvpanel_unnamedtable3_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Width") ;
         Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
         Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
         Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Cls") ;
         Dvpanel_unnamedtable3_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Title") ;
         Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
         Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
         Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
         Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Iconposition") ;
         Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
         Dvpanel_unnamedtable4_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Width") ;
         Dvpanel_unnamedtable4_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autowidth")) ;
         Dvpanel_unnamedtable4_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoheight")) ;
         Dvpanel_unnamedtable4_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Cls") ;
         Dvpanel_unnamedtable4_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Title") ;
         Dvpanel_unnamedtable4_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsible")) ;
         Dvpanel_unnamedtable4_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsed")) ;
         Dvpanel_unnamedtable4_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showcollapseicon")) ;
         Dvpanel_unnamedtable4_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Iconposition") ;
         Dvpanel_unnamedtable4_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoscroll")) ;
         Dvpanel_unnamedtable5_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Width") ;
         Dvpanel_unnamedtable5_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autowidth")) ;
         Dvpanel_unnamedtable5_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoheight")) ;
         Dvpanel_unnamedtable5_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Cls") ;
         Dvpanel_unnamedtable5_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Title") ;
         Dvpanel_unnamedtable5_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsible")) ;
         Dvpanel_unnamedtable5_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsed")) ;
         Dvpanel_unnamedtable5_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Showcollapseicon")) ;
         Dvpanel_unnamedtable5_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Iconposition") ;
         Dvpanel_unnamedtable5_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoscroll")) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClienteinicial_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClienteinicial_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLIENTEINICIAL");
            GX_FocusControl = edtavClienteinicial_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8ClienteInicial = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8ClienteInicial", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ClienteInicial), 6, 0));
         }
         else
         {
            AV8ClienteInicial = (int)(localUtil.ctol( httpContext.cgiGet( edtavClienteinicial_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8ClienteInicial", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8ClienteInicial), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClientefinal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClientefinal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLIENTEFINAL");
            GX_FocusControl = edtavClientefinal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7ClienteFinal = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7ClienteFinal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7ClienteFinal), 6, 0));
         }
         else
         {
            AV7ClienteFinal = (int)(localUtil.ctol( httpContext.cgiGet( edtavClientefinal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7ClienteFinal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7ClienteFinal), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFechainicial_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHAINICIAL");
            GX_FocusControl = edtavFechainicial_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11FechaInicial = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11FechaInicial", localUtil.format(AV11FechaInicial, "99/99/99"));
         }
         else
         {
            AV11FechaInicial = localUtil.ctod( httpContext.cgiGet( edtavFechainicial_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11FechaInicial", localUtil.format(AV11FechaInicial, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFechafinal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHAFINAL");
            GX_FocusControl = edtavFechafinal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10FechaFinal = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10FechaFinal", localUtil.format(AV10FechaFinal, "99/99/99"));
         }
         else
         {
            AV10FechaFinal = localUtil.ctod( httpContext.cgiGet( edtavFechafinal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10FechaFinal", localUtil.format(AV10FechaFinal, "99/99/99"));
         }
         AV6ArticuloInicial = httpContext.cgiGet( edtavArticuloinicial_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6ArticuloInicial", AV6ArticuloInicial);
         AV5ArticuloFinal = httpContext.cgiGet( edtavArticulofinal_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5ArticuloFinal", AV5ArticuloFinal);
         cmbavAlbrest.setValue( httpContext.cgiGet( cmbavAlbrest.getInternalname()) );
         AV15AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbavAlbrest.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15AlbREst", GXutil.str( AV15AlbREst, 1, 0));
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
      e11GC2 ();
      if (returnInSub) return;
   }

   public void e11GC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wpinformesalmacenentrada_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      GXv_char2[0] = AV9Emprcod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      wpinformesalmacenentrada_impl.this.AV9Emprcod = GXv_char2[0] ;
      wpinformesalmacenentrada_impl.this.AV13EmprNom = GXv_char3[0] ;
      wpinformesalmacenentrada_impl.this.AV14UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Emprcod", AV9Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Emprcod, "@!"))));
      AV11FechaInicial = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11FechaInicial", localUtil.format(AV11FechaInicial, "99/99/99"));
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      wpinformesalmacenentrada_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      GXv_char4[0] = AV9Emprcod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char2[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      wpinformesalmacenentrada_impl.this.AV9Emprcod = GXv_char4[0] ;
      wpinformesalmacenentrada_impl.this.AV13EmprNom = GXv_char3[0] ;
      wpinformesalmacenentrada_impl.this.AV14UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Emprcod", AV9Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Emprcod, "@!"))));
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcdistribuciondeunidades = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcdistribuciondeunidades_Component), GXutil.lower( "WCDistribuciondeUnidades")) != 0 )
      {
         WebComp_Wcwcdistribuciondeunidades = WebUtils.getWebComponent(getClass(), "app.wcdistribuciondeunidades_impl", remoteHandle, context);
         WebComp_Wcwcdistribuciondeunidades_Component = "WCDistribuciondeUnidades" ;
      }
      if ( GXutil.len( WebComp_Wcwcdistribuciondeunidades_Component) != 0 )
      {
         WebComp_Wcwcdistribuciondeunidades.setjustcreated();
         WebComp_Wcwcdistribuciondeunidades.componentprepare(new Object[] {"W0097","",AV9Emprcod,Integer.valueOf(AV8ClienteInicial),Integer.valueOf(AV7ClienteFinal),AV11FechaInicial,AV10FechaFinal,AV6ArticuloInicial,AV5ArticuloFinal,Byte.valueOf(AV15AlbREst)});
         WebComp_Wcwcdistribuciondeunidades.componentbind(new Object[] {"","vCLIENTEINICIAL","vCLIENTEFINAL","vFECHAINICIAL","vFECHAFINAL","vARTICULOINICIAL","vARTICULOFINAL","vALBREST"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcdetalleentradas = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcdetalleentradas_Component), GXutil.lower( "WCDetalleEntradas")) != 0 )
      {
         WebComp_Wcwcdetalleentradas = WebUtils.getWebComponent(getClass(), "app.wcdetalleentradas_impl", remoteHandle, context);
         WebComp_Wcwcdetalleentradas_Component = "WCDetalleEntradas" ;
      }
      if ( GXutil.len( WebComp_Wcwcdetalleentradas_Component) != 0 )
      {
         WebComp_Wcwcdetalleentradas.setjustcreated();
         WebComp_Wcwcdetalleentradas.componentprepare(new Object[] {"W0089","",AV9Emprcod,Integer.valueOf(AV8ClienteInicial),Integer.valueOf(AV7ClienteFinal),AV11FechaInicial,AV10FechaFinal,AV6ArticuloInicial,AV5ArticuloFinal,Byte.valueOf(AV15AlbREst)});
         WebComp_Wcwcdetalleentradas.componentbind(new Object[] {"","vCLIENTEINICIAL","vCLIENTEFINAL","vFECHAINICIAL","vFECHAFINAL","vARTICULOINICIAL","vARTICULOFINAL","vALBREST"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcclienteresumenentradas = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcclienteresumenentradas_Component), GXutil.lower( "WCClienteResumenEntradas")) != 0 )
      {
         WebComp_Wcwcclienteresumenentradas = WebUtils.getWebComponent(getClass(), "app.wcclienteresumenentradas_impl", remoteHandle, context);
         WebComp_Wcwcclienteresumenentradas_Component = "WCClienteResumenEntradas" ;
      }
      if ( GXutil.len( WebComp_Wcwcclienteresumenentradas_Component) != 0 )
      {
         WebComp_Wcwcclienteresumenentradas.setjustcreated();
         WebComp_Wcwcclienteresumenentradas.componentprepare(new Object[] {"W0081","",AV9Emprcod,Integer.valueOf(AV8ClienteInicial),Integer.valueOf(AV7ClienteFinal),AV11FechaInicial,AV10FechaFinal,AV6ArticuloInicial,AV5ArticuloFinal,Byte.valueOf(AV15AlbREst)});
         WebComp_Wcwcclienteresumenentradas.componentbind(new Object[] {"","vCLIENTEINICIAL","vCLIENTEFINAL","vFECHAINICIAL","vFECHAFINAL","vARTICULOINICIAL","vARTICULOFINAL","vALBREST"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcclientearticuloresumenentradas = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcclientearticuloresumenentradas_Component), GXutil.lower( "WCClienteArticuloResumenEntradas")) != 0 )
      {
         WebComp_Wcwcclientearticuloresumenentradas = WebUtils.getWebComponent(getClass(), "app.wcclientearticuloresumenentradas_impl", remoteHandle, context);
         WebComp_Wcwcclientearticuloresumenentradas_Component = "WCClienteArticuloResumenEntradas" ;
      }
      if ( GXutil.len( WebComp_Wcwcclientearticuloresumenentradas_Component) != 0 )
      {
         WebComp_Wcwcclientearticuloresumenentradas.setjustcreated();
         WebComp_Wcwcclientearticuloresumenentradas.componentprepare(new Object[] {"W0073","",AV9Emprcod,Integer.valueOf(AV8ClienteInicial),Integer.valueOf(AV7ClienteFinal),AV11FechaInicial,AV10FechaFinal,AV6ArticuloInicial,AV5ArticuloFinal,Byte.valueOf(AV15AlbREst)});
         WebComp_Wcwcclientearticuloresumenentradas.componentbind(new Object[] {"","vCLIENTEINICIAL","vCLIENTEFINAL","vFECHAINICIAL","vFECHAFINAL","vARTICULOINICIAL","vARTICULOFINAL","vALBREST"});
      }
   }

   public void e12GC2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      AV7ClienteFinal = ((0==AV7ClienteFinal) ? 999999 : AV7ClienteFinal) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7ClienteFinal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7ClienteFinal), 6, 0));
      AV10FechaFinal = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10FechaFinal)) ? GXutil.today( ) : AV10FechaFinal) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10FechaFinal", localUtil.format(AV10FechaFinal, "99/99/99"));
      AV5ArticuloFinal = ((GXutil.strcmp("", AV5ArticuloFinal)==0) ? httpContext.getMessage( "zzzzzzzzzzzzzzzz", "") : AV5ArticuloFinal) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5ArticuloFinal", AV5ArticuloFinal);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcclientearticuloresumenentradas = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcclientearticuloresumenentradas_Component), GXutil.lower( "WCClienteArticuloResumenEntradas")) != 0 )
      {
         WebComp_Wcwcclientearticuloresumenentradas = WebUtils.getWebComponent(getClass(), "app.wcclientearticuloresumenentradas_impl", remoteHandle, context);
         WebComp_Wcwcclientearticuloresumenentradas_Component = "WCClienteArticuloResumenEntradas" ;
      }
      if ( GXutil.len( WebComp_Wcwcclientearticuloresumenentradas_Component) != 0 )
      {
         WebComp_Wcwcclientearticuloresumenentradas.setjustcreated();
         WebComp_Wcwcclientearticuloresumenentradas.componentprepare(new Object[] {"W0073","",AV9Emprcod,Integer.valueOf(AV8ClienteInicial),Integer.valueOf(AV7ClienteFinal),AV11FechaInicial,AV10FechaFinal,AV6ArticuloInicial,AV5ArticuloFinal,Byte.valueOf(AV15AlbREst)});
         WebComp_Wcwcclientearticuloresumenentradas.componentbind(new Object[] {"","vCLIENTEINICIAL","vCLIENTEFINAL","vFECHAINICIAL","vFECHAFINAL","vARTICULOINICIAL","vARTICULOFINAL","vALBREST"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcclientearticuloresumenentradas )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0073"+"");
         WebComp_Wcwcclientearticuloresumenentradas.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcclienteresumenentradas = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcclienteresumenentradas_Component), GXutil.lower( "WCClienteResumenEntradas")) != 0 )
      {
         WebComp_Wcwcclienteresumenentradas = WebUtils.getWebComponent(getClass(), "app.wcclienteresumenentradas_impl", remoteHandle, context);
         WebComp_Wcwcclienteresumenentradas_Component = "WCClienteResumenEntradas" ;
      }
      if ( GXutil.len( WebComp_Wcwcclienteresumenentradas_Component) != 0 )
      {
         WebComp_Wcwcclienteresumenentradas.setjustcreated();
         WebComp_Wcwcclienteresumenentradas.componentprepare(new Object[] {"W0081","",AV9Emprcod,Integer.valueOf(AV8ClienteInicial),Integer.valueOf(AV7ClienteFinal),AV11FechaInicial,AV10FechaFinal,AV6ArticuloInicial,AV5ArticuloFinal,Byte.valueOf(AV15AlbREst)});
         WebComp_Wcwcclienteresumenentradas.componentbind(new Object[] {"","vCLIENTEINICIAL","vCLIENTEFINAL","vFECHAINICIAL","vFECHAFINAL","vARTICULOINICIAL","vARTICULOFINAL","vALBREST"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcclienteresumenentradas )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0081"+"");
         WebComp_Wcwcclienteresumenentradas.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcdetalleentradas = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcdetalleentradas_Component), GXutil.lower( "WCDetalleEntradas")) != 0 )
      {
         WebComp_Wcwcdetalleentradas = WebUtils.getWebComponent(getClass(), "app.wcdetalleentradas_impl", remoteHandle, context);
         WebComp_Wcwcdetalleentradas_Component = "WCDetalleEntradas" ;
      }
      if ( GXutil.len( WebComp_Wcwcdetalleentradas_Component) != 0 )
      {
         WebComp_Wcwcdetalleentradas.setjustcreated();
         WebComp_Wcwcdetalleentradas.componentprepare(new Object[] {"W0089","",AV9Emprcod,Integer.valueOf(AV8ClienteInicial),Integer.valueOf(AV7ClienteFinal),AV11FechaInicial,AV10FechaFinal,AV6ArticuloInicial,AV5ArticuloFinal,Byte.valueOf(AV15AlbREst)});
         WebComp_Wcwcdetalleentradas.componentbind(new Object[] {"","vCLIENTEINICIAL","vCLIENTEFINAL","vFECHAINICIAL","vFECHAFINAL","vARTICULOINICIAL","vARTICULOFINAL","vALBREST"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcdetalleentradas )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0089"+"");
         WebComp_Wcwcdetalleentradas.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcdistribuciondeunidades = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcdistribuciondeunidades_Component), GXutil.lower( "WCDistribuciondeUnidades")) != 0 )
      {
         WebComp_Wcwcdistribuciondeunidades = WebUtils.getWebComponent(getClass(), "app.wcdistribuciondeunidades_impl", remoteHandle, context);
         WebComp_Wcwcdistribuciondeunidades_Component = "WCDistribuciondeUnidades" ;
      }
      if ( GXutil.len( WebComp_Wcwcdistribuciondeunidades_Component) != 0 )
      {
         WebComp_Wcwcdistribuciondeunidades.setjustcreated();
         WebComp_Wcwcdistribuciondeunidades.componentprepare(new Object[] {"W0097","",AV9Emprcod,Integer.valueOf(AV8ClienteInicial),Integer.valueOf(AV7ClienteFinal),AV11FechaInicial,AV10FechaFinal,AV6ArticuloInicial,AV5ArticuloFinal,Byte.valueOf(AV15AlbREst)});
         WebComp_Wcwcdistribuciondeunidades.componentbind(new Object[] {"","vCLIENTEINICIAL","vCLIENTEFINAL","vFECHAINICIAL","vFECHAFINAL","vARTICULOINICIAL","vARTICULOFINAL","vALBREST"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcdistribuciondeunidades )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0097"+"");
         WebComp_Wcwcdistribuciondeunidades.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   public void e13GC2( )
   {
      /* Clienteinicial_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e14GC2( )
   {
      /* Clientefinal_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e15GC2( )
   {
      /* Fechainicial_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e16GC2( )
   {
      /* Fechafinal_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e17GC2( )
   {
      /* Articuloinicial_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e18GC2( )
   {
      /* Articulofinal_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e19GC2( )
   {
      /* Albrest_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   protected void nextLoad( )
   {
   }

   protected void e20GC2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table5_94_GC2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable5_Internalname, tblUnnamedtable5_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0097"+"", GXutil.rtrim( WebComp_Wcwcdistribuciondeunidades_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0097"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcdistribuciondeunidades_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcdistribuciondeunidades), GXutil.lower( WebComp_Wcwcdistribuciondeunidades_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0097"+"");
               }
               WebComp_Wcwcdistribuciondeunidades.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcdistribuciondeunidades), GXutil.lower( WebComp_Wcwcdistribuciondeunidades_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_94_GC2e( true) ;
      }
      else
      {
         wb_table5_94_GC2e( false) ;
      }
   }

   public void wb_table4_86_GC2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable4_Internalname, tblUnnamedtable4_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0089"+"", GXutil.rtrim( WebComp_Wcwcdetalleentradas_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0089"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcdetalleentradas_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcdetalleentradas), GXutil.lower( WebComp_Wcwcdetalleentradas_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0089"+"");
               }
               WebComp_Wcwcdetalleentradas.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcdetalleentradas), GXutil.lower( WebComp_Wcwcdetalleentradas_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_86_GC2e( true) ;
      }
      else
      {
         wb_table4_86_GC2e( false) ;
      }
   }

   public void wb_table3_78_GC2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable3_Internalname, tblUnnamedtable3_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0081"+"", GXutil.rtrim( WebComp_Wcwcclienteresumenentradas_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0081"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcclienteresumenentradas_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcclienteresumenentradas), GXutil.lower( WebComp_Wcwcclienteresumenentradas_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0081"+"");
               }
               WebComp_Wcwcclienteresumenentradas.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcclienteresumenentradas), GXutil.lower( WebComp_Wcwcclienteresumenentradas_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_78_GC2e( true) ;
      }
      else
      {
         wb_table3_78_GC2e( false) ;
      }
   }

   public void wb_table2_70_GC2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0073"+"", GXutil.rtrim( WebComp_Wcwcclientearticuloresumenentradas_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0073"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcclientearticuloresumenentradas_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcclientearticuloresumenentradas), GXutil.lower( WebComp_Wcwcclientearticuloresumenentradas_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0073"+"");
               }
               WebComp_Wcwcclientearticuloresumenentradas.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcclientearticuloresumenentradas), GXutil.lower( WebComp_Wcwcclientearticuloresumenentradas_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_70_GC2e( true) ;
      }
      else
      {
         wb_table2_70_GC2e( false) ;
      }
   }

   public void wb_table1_17_GC2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableclienteinicial_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclienteinicial_Internalname, httpContext.getMessage( "Clientes", ""), "", "", lblTextblockclienteinicial_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WPInformesAlmacenEntrada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClienteinicial_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClienteinicial_Internalname, GXutil.ltrim( localUtil.ntoc( AV8ClienteInicial, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClienteinicial_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8ClienteInicial), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8ClienteInicial), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClienteinicial_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClienteinicial_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPInformesAlmacenEntrada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableclientefinal_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclientefinal_Internalname, "", "", "", lblTextblockclientefinal_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WPInformesAlmacenEntrada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClientefinal_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClientefinal_Internalname, GXutil.ltrim( localUtil.ntoc( AV7ClienteFinal, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClientefinal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7ClienteFinal), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7ClienteFinal), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClientefinal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClientefinal_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPInformesAlmacenEntrada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavFechainicial_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechainicial_Internalname, httpContext.getMessage( "Periodo", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechainicial_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechainicial_Internalname, localUtil.format(AV11FechaInicial, "99/99/99"), localUtil.format( AV11FechaInicial, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechainicial_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechainicial_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPInformesAlmacenEntrada.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechainicial_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechainicial_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPInformesAlmacenEntrada.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavFechafinal_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechafinal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechafinal_Internalname, localUtil.format(AV10FechaFinal, "99/99/99"), localUtil.format( AV10FechaFinal, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechafinal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechafinal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPInformesAlmacenEntrada.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechafinal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechafinal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPInformesAlmacenEntrada.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavArticuloinicial_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArticuloinicial_Internalname, httpContext.getMessage( "Referencia", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArticuloinicial_Internalname, GXutil.rtrim( AV6ArticuloInicial), GXutil.rtrim( localUtil.format( AV6ArticuloInicial, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArticuloinicial_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArticuloinicial_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPInformesAlmacenEntrada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavArticulofinal_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArticulofinal_Internalname, GXutil.rtrim( AV5ArticuloFinal), GXutil.rtrim( localUtil.format( AV5ArticuloFinal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArticulofinal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArticulofinal_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPInformesAlmacenEntrada.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbrest.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbrest.getInternalname(), httpContext.getMessage( "Estado", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbrest, cmbavAlbrest.getInternalname(), GXutil.trim( GXutil.str( AV15AlbREst, 1, 0)), 1, cmbavAlbrest.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavAlbrest.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "", true, (byte)(0), "HLP_WPInformesAlmacenEntrada.htm");
         cmbavAlbrest.setValue( GXutil.trim( GXutil.str( AV15AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrest.getInternalname(), "Values", cmbavAlbrest.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_17_GC2e( true) ;
      }
      else
      {
         wb_table1_17_GC2e( false) ;
      }
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
      paGC2( ) ;
      wsGC2( ) ;
      weGC2( ) ;
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
      if ( ! ( WebComp_Wcwcclientearticuloresumenentradas == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcclientearticuloresumenentradas_Component) != 0 )
         {
            WebComp_Wcwcclientearticuloresumenentradas.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcclienteresumenentradas == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcclienteresumenentradas_Component) != 0 )
         {
            WebComp_Wcwcclienteresumenentradas.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcdetalleentradas == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcdetalleentradas_Component) != 0 )
         {
            WebComp_Wcwcdetalleentradas.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcdistribuciondeunidades == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcdistribuciondeunidades_Component) != 0 )
         {
            WebComp_Wcwcdistribuciondeunidades.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016411819", true, true);
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
      httpContext.AddJavascriptSource("wpinformesalmacenentrada.js", "?202661016411819", false, true);
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
      lblTextblockclienteinicial_Internalname = "TEXTBLOCKCLIENTEINICIAL" ;
      edtavClienteinicial_Internalname = "vCLIENTEINICIAL" ;
      divUnnamedtableclienteinicial_Internalname = "UNNAMEDTABLECLIENTEINICIAL" ;
      lblTextblockclientefinal_Internalname = "TEXTBLOCKCLIENTEFINAL" ;
      edtavClientefinal_Internalname = "vCLIENTEFINAL" ;
      divUnnamedtableclientefinal_Internalname = "UNNAMEDTABLECLIENTEFINAL" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavFechainicial_Internalname = "vFECHAINICIAL" ;
      edtavFechafinal_Internalname = "vFECHAFINAL" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtavArticuloinicial_Internalname = "vARTICULOINICIAL" ;
      edtavArticulofinal_Internalname = "vARTICULOFINAL" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      cmbavAlbrest.setInternalname( "vALBREST" );
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      tblUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      tblUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      tblUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      tblUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = "DVPANEL_UNNAMEDTABLE5" ;
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
      cmbavAlbrest.setJsonclick( "" );
      cmbavAlbrest.setEnabled( 1 );
      edtavArticulofinal_Jsonclick = "" ;
      edtavArticulofinal_Enabled = 1 ;
      edtavArticuloinicial_Jsonclick = "" ;
      edtavArticuloinicial_Enabled = 1 ;
      edtavFechafinal_Jsonclick = "" ;
      edtavFechafinal_Enabled = 1 ;
      edtavFechainicial_Jsonclick = "" ;
      edtavFechainicial_Enabled = 1 ;
      edtavClientefinal_Jsonclick = "" ;
      edtavClientefinal_Enabled = 1 ;
      edtavClienteinicial_Jsonclick = "" ;
      edtavClienteinicial_Enabled = 1 ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = httpContext.getMessage( "Distribucion de Unidades por Pedido", "") ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Detalle Entradas", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Resumen Cliente", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Resumen Cliente_Articulo", "") ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "WPInformes Almacen Entrada", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavAlbrest.setName( "vALBREST" );
      cmbavAlbrest.setWebtags( "" );
      cmbavAlbrest.addItem("9", httpContext.getMessage( "Todas", ""), (short)(0));
      cmbavAlbrest.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbavAlbrest.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbavAlbrest.getItemCount() > 0 )
      {
         AV15AlbREst = (byte)(GXutil.lval( cmbavAlbrest.getValidValue(GXutil.trim( GXutil.str( AV15AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15AlbREst", GXutil.str( AV15AlbREst, 1, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV7ClienteFinal',fld:'vCLIENTEFINAL',pic:'ZZZZZ9'},{av:'AV10FechaFinal',fld:'vFECHAFINAL',pic:''},{av:'AV5ArticuloFinal',fld:'vARTICULOFINAL',pic:''},{av:'AV8ClienteInicial',fld:'vCLIENTEINICIAL',pic:'ZZZZZ9'},{av:'AV11FechaInicial',fld:'vFECHAINICIAL',pic:''},{av:'AV6ArticuloInicial',fld:'vARTICULOINICIAL',pic:''},{av:'cmbavAlbrest'},{av:'AV15AlbREst',fld:'vALBREST',pic:'9'},{av:'AV9Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV7ClienteFinal',fld:'vCLIENTEFINAL',pic:'ZZZZZ9'},{av:'AV10FechaFinal',fld:'vFECHAFINAL',pic:''},{av:'AV5ArticuloFinal',fld:'vARTICULOFINAL',pic:''},{ctrl:'WCWCCLIENTEARTICULORESUMENENTRADAS'},{ctrl:'WCWCCLIENTERESUMENENTRADAS'},{ctrl:'WCWCDETALLEENTRADAS'},{ctrl:'WCWCDISTRIBUCIONDEUNIDADES'}]}");
      setEventMetadata("VCLIENTEINICIAL.CONTROLVALUECHANGED","{handler:'e13GC2',iparms:[]");
      setEventMetadata("VCLIENTEINICIAL.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VCLIENTEFINAL.CONTROLVALUECHANGED","{handler:'e14GC2',iparms:[]");
      setEventMetadata("VCLIENTEFINAL.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VFECHAINICIAL.CONTROLVALUECHANGED","{handler:'e15GC2',iparms:[]");
      setEventMetadata("VFECHAINICIAL.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VFECHAFINAL.CONTROLVALUECHANGED","{handler:'e16GC2',iparms:[]");
      setEventMetadata("VFECHAFINAL.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VARTICULOINICIAL.CONTROLVALUECHANGED","{handler:'e17GC2',iparms:[]");
      setEventMetadata("VARTICULOINICIAL.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VARTICULOFINAL.CONTROLVALUECHANGED","{handler:'e18GC2',iparms:[]");
      setEventMetadata("VARTICULOFINAL.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VALBREST.CONTROLVALUECHANGED","{handler:'e19GC2',iparms:[]");
      setEventMetadata("VALBREST.CONTROLVALUECHANGED",",oparms:[]}");
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
      AV9Emprcod = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      OldWcwcclientearticuloresumenentradas = "" ;
      WebComp_Wcwcclientearticuloresumenentradas_Component = "" ;
      OldWcwcclienteresumenentradas = "" ;
      WebComp_Wcwcclienteresumenentradas_Component = "" ;
      OldWcwcdetalleentradas = "" ;
      WebComp_Wcwcdetalleentradas_Component = "" ;
      OldWcwcdistribuciondeunidades = "" ;
      WebComp_Wcwcdistribuciondeunidades_Component = "" ;
      AV11FechaInicial = GXutil.nullDate() ;
      AV10FechaFinal = GXutil.nullDate() ;
      AV6ArticuloInicial = "" ;
      AV5ArticuloFinal = "" ;
      AV12Station = "" ;
      AV13EmprNom = "" ;
      AV14UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      sStyleString = "" ;
      lblTextblockclienteinicial_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblockclientefinal_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Wcwcclientearticuloresumenentradas = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcclienteresumenentradas = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcdetalleentradas = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcdistribuciondeunidades = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV15AlbREst ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV8ClienteInicial ;
   private int AV7ClienteFinal ;
   private int edtavClienteinicial_Enabled ;
   private int edtavClientefinal_Enabled ;
   private int edtavFechainicial_Enabled ;
   private int edtavFechafinal_Enabled ;
   private int edtavArticuloinicial_Enabled ;
   private int edtavArticulofinal_Enabled ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV9Emprcod ;
   private String GXKey ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String OldWcwcclientearticuloresumenentradas ;
   private String WebComp_Wcwcclientearticuloresumenentradas_Component ;
   private String OldWcwcclienteresumenentradas ;
   private String WebComp_Wcwcclienteresumenentradas_Component ;
   private String OldWcwcdetalleentradas ;
   private String WebComp_Wcwcdetalleentradas_Component ;
   private String OldWcwcdistribuciondeunidades ;
   private String WebComp_Wcwcdistribuciondeunidades_Component ;
   private String edtavClienteinicial_Internalname ;
   private String edtavClientefinal_Internalname ;
   private String edtavFechainicial_Internalname ;
   private String edtavFechafinal_Internalname ;
   private String AV6ArticuloInicial ;
   private String edtavArticuloinicial_Internalname ;
   private String AV5ArticuloFinal ;
   private String edtavArticulofinal_Internalname ;
   private String AV12Station ;
   private String AV13EmprNom ;
   private String AV14UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String sStyleString ;
   private String tblUnnamedtable5_Internalname ;
   private String tblUnnamedtable4_Internalname ;
   private String tblUnnamedtable3_Internalname ;
   private String tblUnnamedtable2_Internalname ;
   private String tblUnnamedtable1_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String divUnnamedtableclienteinicial_Internalname ;
   private String lblTextblockclienteinicial_Internalname ;
   private String lblTextblockclienteinicial_Jsonclick ;
   private String TempTags ;
   private String edtavClienteinicial_Jsonclick ;
   private String divUnnamedtableclientefinal_Internalname ;
   private String lblTextblockclientefinal_Internalname ;
   private String lblTextblockclientefinal_Jsonclick ;
   private String edtavClientefinal_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavFechainicial_Jsonclick ;
   private String edtavFechafinal_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtavArticuloinicial_Jsonclick ;
   private String edtavArticulofinal_Jsonclick ;
   private String divUnnamedtable9_Internalname ;
   private java.util.Date AV11FechaInicial ;
   private java.util.Date AV10FechaFinal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean Dvpanel_unnamedtable5_Autowidth ;
   private boolean Dvpanel_unnamedtable5_Autoheight ;
   private boolean Dvpanel_unnamedtable5_Collapsible ;
   private boolean Dvpanel_unnamedtable5_Collapsed ;
   private boolean Dvpanel_unnamedtable5_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable5_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwcdistribuciondeunidades ;
   private boolean bDynCreated_Wcwcdetalleentradas ;
   private boolean bDynCreated_Wcwcclienteresumenentradas ;
   private boolean bDynCreated_Wcwcclientearticuloresumenentradas ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwcclientearticuloresumenentradas ;
   private GXWebComponent WebComp_Wcwcclienteresumenentradas ;
   private GXWebComponent WebComp_Wcwcdetalleentradas ;
   private GXWebComponent WebComp_Wcwcdistribuciondeunidades ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private HTMLChoice cmbavAlbrest ;
   private com.genexus.webpanels.GXWebForm Form ;
}

