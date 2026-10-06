package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwwkp110datatime_impl extends GXDataArea
{
   public webwwkp110datatime_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwwkp110datatime_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwwkp110datatime_impl.class ));
   }

   public webwwkp110datatime_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavHisproreo = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCODINICIAL") == 0 )
         {
            AV11MaqCodFinal = httpContext.GetPar( "MaqCodFinal") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11MaqCodFinal", AV11MaqCodFinal);
            AV6EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6EmprCod, "@!"))));
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodinicial1500( AV11MaqCodFinal, AV6EmprCod, A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCODFINAL") == 0 )
         {
            AV12MaqCodInicial = httpContext.GetPar( "MaqCodInicial") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12MaqCodInicial", AV12MaqCodInicial);
            AV6EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6EmprCod, "@!"))));
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodfinal1500( AV12MaqCodInicial, AV6EmprCod, A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCODINICIAL") == 0 )
         {
            AV11MaqCodFinal = httpContext.GetPar( "MaqCodFinal") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11MaqCodFinal", AV11MaqCodFinal);
            AV6EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6EmprCod, "@!"))));
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodinicial1500( AV11MaqCodFinal, AV6EmprCod, A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMAQCODINICIAL") == 0 )
         {
            AV11MaqCodFinal = httpContext.GetPar( "MaqCodFinal") ;
            AV6EmprCod = httpContext.GetPar( "EmprCod") ;
            hV12MaqCodInicial = httpContext.GetPar( "hV12MaqCodInicial") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmaqcodinicial1502( AV11MaqCodFinal, AV6EmprCod, hV12MaqCodInicial) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCODFINAL") == 0 )
         {
            AV12MaqCodInicial = httpContext.GetPar( "MaqCodInicial") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12MaqCodInicial", AV12MaqCodInicial);
            AV6EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6EmprCod, "@!"))));
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodfinal1500( AV12MaqCodInicial, AV6EmprCod, A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMAQCODFINAL") == 0 )
         {
            AV12MaqCodInicial = httpContext.GetPar( "MaqCodInicial") ;
            AV6EmprCod = httpContext.GetPar( "EmprCod") ;
            hV11MaqCodFinal = httpContext.GetPar( "hV11MaqCodFinal") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmaqcodfinal1502( AV12MaqCodInicial, AV6EmprCod, hV11MaqCodFinal) ;
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
      pa1502( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1502( ) ;
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
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwwkp110datatime", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTOCORTE", AV15TextoCorte);
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMAQCODINICIAL", GXutil.rtrim( AV12MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMAQCODFINAL", GXutil.rtrim( AV11MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV6EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6EmprCod, "@!"))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Width", GXutil.rtrim( Dvpanel_pnl1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Autowidth", GXutil.booltostr( Dvpanel_pnl1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Autoheight", GXutil.booltostr( Dvpanel_pnl1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Cls", GXutil.rtrim( Dvpanel_pnl1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Title", GXutil.rtrim( Dvpanel_pnl1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Collapsible", GXutil.booltostr( Dvpanel_pnl1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Collapsed", GXutil.booltostr( Dvpanel_pnl1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Showcollapseicon", GXutil.booltostr( Dvpanel_pnl1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Iconposition", GXutil.rtrim( Dvpanel_pnl1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Autoscroll", GXutil.booltostr( Dvpanel_pnl1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINFORMES_Width", GXutil.rtrim( Dvpanel_panelinformes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINFORMES_Autowidth", GXutil.booltostr( Dvpanel_panelinformes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINFORMES_Autoheight", GXutil.booltostr( Dvpanel_panelinformes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINFORMES_Cls", GXutil.rtrim( Dvpanel_panelinformes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINFORMES_Title", GXutil.rtrim( Dvpanel_panelinformes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINFORMES_Collapsible", GXutil.booltostr( Dvpanel_panelinformes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINFORMES_Collapsed", GXutil.booltostr( Dvpanel_panelinformes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINFORMES_Showcollapseicon", GXutil.booltostr( Dvpanel_panelinformes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINFORMES_Iconposition", GXutil.rtrim( Dvpanel_panelinformes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELINFORMES_Autoscroll", GXutil.booltostr( Dvpanel_panelinformes_Autoscroll));
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
      if ( ! ( WebComp_Wcwcinformesproduccion_tabs == null ) )
      {
         WebComp_Wcwcinformesproduccion_tabs.componentjscripts();
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
         we1502( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1502( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.webwwkp110datatime", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebWWkp110DataTime" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Produccion RESUMEN", "") ;
   }

   public void wb1500( )
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
         ucDvpanel_pnl1.setProperty("Width", Dvpanel_pnl1_Width);
         ucDvpanel_pnl1.setProperty("AutoWidth", Dvpanel_pnl1_Autowidth);
         ucDvpanel_pnl1.setProperty("AutoHeight", Dvpanel_pnl1_Autoheight);
         ucDvpanel_pnl1.setProperty("Cls", Dvpanel_pnl1_Cls);
         ucDvpanel_pnl1.setProperty("Title", Dvpanel_pnl1_Title);
         ucDvpanel_pnl1.setProperty("Collapsible", Dvpanel_pnl1_Collapsible);
         ucDvpanel_pnl1.setProperty("Collapsed", Dvpanel_pnl1_Collapsed);
         ucDvpanel_pnl1.setProperty("ShowCollapseIcon", Dvpanel_pnl1_Showcollapseicon);
         ucDvpanel_pnl1.setProperty("IconPosition", Dvpanel_pnl1_Iconposition);
         ucDvpanel_pnl1.setProperty("AutoScroll", Dvpanel_pnl1_Autoscroll);
         ucDvpanel_pnl1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnl1_Internalname, "DVPANEL_PNL1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNL1Container"+"pnl1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPnl1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqcodinicial_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcodinicial_Internalname, httpContext.getMessage( "Maquina Inicial", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcodinicial_Internalname, hV12MaqCodInicial, GXutil.rtrim( localUtil.format( hV12MaqCodInicial, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcodinicial_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcodinicial_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebWWkp110DataTime.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqcodfinal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcodfinal_Internalname, httpContext.getMessage( "Maquina Final", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcodfinal_Internalname, hV11MaqCodFinal, GXutil.rtrim( localUtil.format( hV11MaqCodFinal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcodfinal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcodfinal_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebWWkp110DataTime.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprodti_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprodti_Internalname, httpContext.getMessage( "Fecha-Hora Inicial", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodti_Internalname, localUtil.ttoc( AV9HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV9HisProDTI, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprodti_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWWkp110DataTime.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprodti_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWWkp110DataTime.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprodtf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprodtf_Internalname, httpContext.getMessage( "Fecha-Hora Final", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodtf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodtf_Internalname, localUtil.ttoc( AV8HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV8HisProDTF, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodtf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprodtf_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWWkp110DataTime.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodtf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprodtf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWWkp110DataTime.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavHisproreo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavHisproreo.getInternalname(), httpContext.getMessage( "Tipo Reoperado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavHisproreo, cmbavHisproreo.getInternalname(), GXutil.trim( GXutil.str( AV10HisProReo, 1, 0)), 1, cmbavHisproreo.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVHISPROREO.CLICK."+"'", "int", "", 1, cmbavHisproreo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "", true, (byte)(0), "HLP_WebWWkp110DataTime.htm");
         cmbavHisproreo.setValue( GXutil.trim( GXutil.str( AV10HisProReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHisproreo.getInternalname(), "Values", cmbavHisproreo.ToJavascriptSource(), true);
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111501_client"+"'", TempTags, "", 2, "HLP_WebWWkp110DataTime.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsalir_Internalname, "", httpContext.getMessage( "Salir", ""), bttBtnsalir_Jsonclick, 7, httpContext.getMessage( "Salir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121501_client"+"'", TempTags, "", 2, "HLP_WebWWkp110DataTime.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelinformes.setProperty("Width", Dvpanel_panelinformes_Width);
         ucDvpanel_panelinformes.setProperty("AutoWidth", Dvpanel_panelinformes_Autowidth);
         ucDvpanel_panelinformes.setProperty("AutoHeight", Dvpanel_panelinformes_Autoheight);
         ucDvpanel_panelinformes.setProperty("Cls", Dvpanel_panelinformes_Cls);
         ucDvpanel_panelinformes.setProperty("Title", Dvpanel_panelinformes_Title);
         ucDvpanel_panelinformes.setProperty("Collapsible", Dvpanel_panelinformes_Collapsible);
         ucDvpanel_panelinformes.setProperty("Collapsed", Dvpanel_panelinformes_Collapsed);
         ucDvpanel_panelinformes.setProperty("ShowCollapseIcon", Dvpanel_panelinformes_Showcollapseicon);
         ucDvpanel_panelinformes.setProperty("IconPosition", Dvpanel_panelinformes_Iconposition);
         ucDvpanel_panelinformes.setProperty("AutoScroll", Dvpanel_panelinformes_Autoscroll);
         ucDvpanel_panelinformes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelinformes_Internalname, "DVPANEL_PANELINFORMESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELINFORMESContainer"+"PanelInformes"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelinformes_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0068"+"", GXutil.rtrim( WebComp_Wcwcinformesproduccion_tabs_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0068"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcinformesproduccion_tabs_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcinformesproduccion_tabs), GXutil.lower( WebComp_Wcwcinformesproduccion_tabs_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0068"+"");
               }
               WebComp_Wcwcinformesproduccion_tabs.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcinformesproduccion_tabs), GXutil.lower( WebComp_Wcwcinformesproduccion_tabs_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
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

   public void start1502( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Informe Produccion RESUMEN", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1500( ) ;
   }

   public void ws1502( )
   {
      start1502( ) ;
      evt1502( ) ;
   }

   public void evt1502( )
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
                           e131502 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e141502 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e151502 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e161502 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VHISPROREO.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e171502 ();
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
                     if ( nCmpId == 68 )
                     {
                        OldWcwcinformesproduccion_tabs = httpContext.cgiGet( "W0068") ;
                        if ( ( GXutil.len( OldWcwcinformesproduccion_tabs) == 0 ) || ( GXutil.strcmp(OldWcwcinformesproduccion_tabs, WebComp_Wcwcinformesproduccion_tabs_Component) != 0 ) )
                        {
                           WebComp_Wcwcinformesproduccion_tabs = WebUtils.getWebComponent(getClass(), "app." + OldWcwcinformesproduccion_tabs + "_impl", remoteHandle, context);
                           WebComp_Wcwcinformesproduccion_tabs_Component = OldWcwcinformesproduccion_tabs ;
                        }
                        if ( GXutil.len( WebComp_Wcwcinformesproduccion_tabs_Component) != 0 )
                        {
                           WebComp_Wcwcinformesproduccion_tabs.componentprocess("W0068", "", sEvt);
                        }
                        WebComp_Wcwcinformesproduccion_tabs_Component = OldWcwcinformesproduccion_tabs ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1502( )
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

   public void pa1502( )
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
            GX_FocusControl = edtavMaqcodinicial_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvmaqcodinicial1500( String AV11MaqCodFinal ,
                                        String AV6EmprCod ,
                                        String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmaqcodinicial_data1500( AV11MaqCodFinal, AV6EmprCod, A13734MaqCDsc) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgvvmaqcodinicial_data1500( String AV11MaqCodFinal ,
                                                String AV6EmprCod ,
                                                String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H01502 */
      pr_default.execute(0, new Object[] {l13734MaqCDsc, AV11MaqCodFinal, AV11MaqCodFinal, AV6EmprCod});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H01502_A13734MaqCDsc[0]);
         gxdynajaxctrldescr.add(H01502_A13734MaqCDsc[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvmaqcodfinal1500( String AV12MaqCodInicial ,
                                      String AV6EmprCod ,
                                      String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmaqcodfinal_data1500( AV12MaqCodInicial, AV6EmprCod, A13734MaqCDsc) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgvvmaqcodfinal_data1500( String AV12MaqCodInicial ,
                                              String AV6EmprCod ,
                                              String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H01503 */
      pr_default.execute(1, new Object[] {l13734MaqCDsc, AV12MaqCodInicial, AV6EmprCod});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(H01503_A13734MaqCDsc[0]);
         gxdynajaxctrldescr.add(H01503_A13734MaqCDsc[0]);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxhcvvmaqcodinicial1502( String AV11MaqCodFinal ,
                                        String AV6EmprCod ,
                                        String A13734MaqCDsc )
   {
      /* Using cursor H01504 */
      pr_default.execute(2, new Object[] {A13734MaqCDsc, AV11MaqCodFinal, AV11MaqCodFinal, AV6EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A606MaqDsc = H01504_A606MaqDsc[0] ;
         n606MaqDsc = H01504_n606MaqDsc[0] ;
         A13734MaqCDsc = H01504_A13734MaqCDsc[0] ;
         A396EmprCod = H01504_A396EmprCod[0] ;
         A602MaqCod = H01504_A602MaqCod[0] ;
         pr_default.readNext(2);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(2);
   }

   public void gxhcvvmaqcodfinal1502( String AV12MaqCodInicial ,
                                      String AV6EmprCod ,
                                      String A13734MaqCDsc )
   {
      /* Using cursor H01505 */
      pr_default.execute(3, new Object[] {A13734MaqCDsc, AV12MaqCodInicial, AV6EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A606MaqDsc = H01505_A606MaqDsc[0] ;
         n606MaqDsc = H01505_n606MaqDsc[0] ;
         A13734MaqCDsc = H01505_A13734MaqCDsc[0] ;
         A396EmprCod = H01505_A396EmprCod[0] ;
         A602MaqCod = H01505_A602MaqCod[0] ;
         pr_default.readNext(3);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
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
      if ( cmbavHisproreo.getItemCount() > 0 )
      {
         AV10HisProReo = (byte)(GXutil.lval( cmbavHisproreo.getValidValue(GXutil.trim( GXutil.str( AV10HisProReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10HisProReo", GXutil.str( AV10HisProReo, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavHisproreo.setValue( GXutil.trim( GXutil.str( AV10HisProReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHisproreo.getInternalname(), "Values", cmbavHisproreo.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1502( ) ;
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

   public void rf1502( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e141502 ();
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcinformesproduccion_tabs_Component) != 0 )
            {
               WebComp_Wcwcinformesproduccion_tabs.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e161502 ();
         wb1500( ) ;
      }
   }

   public void send_integrity_lvl_hashes1502( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV6EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6EmprCod, "@!"))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1500( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131502 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV15TextoCorte = httpContext.cgiGet( "vTEXTOCORTE") ;
         AV6EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
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
         Dvpanel_pnl1_Width = httpContext.cgiGet( "DVPANEL_PNL1_Width") ;
         Dvpanel_pnl1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Autowidth")) ;
         Dvpanel_pnl1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Autoheight")) ;
         Dvpanel_pnl1_Cls = httpContext.cgiGet( "DVPANEL_PNL1_Cls") ;
         Dvpanel_pnl1_Title = httpContext.cgiGet( "DVPANEL_PNL1_Title") ;
         Dvpanel_pnl1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Collapsible")) ;
         Dvpanel_pnl1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Collapsed")) ;
         Dvpanel_pnl1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Showcollapseicon")) ;
         Dvpanel_pnl1_Iconposition = httpContext.cgiGet( "DVPANEL_PNL1_Iconposition") ;
         Dvpanel_pnl1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Autoscroll")) ;
         Dvpanel_panelinformes_Width = httpContext.cgiGet( "DVPANEL_PANELINFORMES_Width") ;
         Dvpanel_panelinformes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELINFORMES_Autowidth")) ;
         Dvpanel_panelinformes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELINFORMES_Autoheight")) ;
         Dvpanel_panelinformes_Cls = httpContext.cgiGet( "DVPANEL_PANELINFORMES_Cls") ;
         Dvpanel_panelinformes_Title = httpContext.cgiGet( "DVPANEL_PANELINFORMES_Title") ;
         Dvpanel_panelinformes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELINFORMES_Collapsible")) ;
         Dvpanel_panelinformes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELINFORMES_Collapsed")) ;
         Dvpanel_panelinformes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELINFORMES_Showcollapseicon")) ;
         Dvpanel_panelinformes_Iconposition = httpContext.cgiGet( "DVPANEL_PANELINFORMES_Iconposition") ;
         Dvpanel_panelinformes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELINFORMES_Autoscroll")) ;
         /* Read variables values. */
         hV12MaqCodInicial = httpContext.cgiGet( edtavMaqcodinicial_Internalname) ;
         if ( (GXutil.strcmp("", hV12MaqCodInicial)==0) )
         {
            AV12MaqCodInicial = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12MaqCodInicial", AV12MaqCodInicial);
         }
         else
         {
            A13734MaqCDsc = hV12MaqCodInicial ;
            /* Using cursor H01506 */
            pr_default.execute(4, new Object[] {A13734MaqCDsc, AV11MaqCodFinal, AV11MaqCodFinal, AV6EmprCod});
            AV12MaqCodInicial = H01506_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(4) == 101) ) )
            {
               pr_default.readNext(4);
               if ( ! ( (pr_default.getStatus(4) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCODINICIAL");
                  GX_FocusControl = edtavMaqcodinicial_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(4);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV12MaqCodInicial", hV12MaqCodInicial);
         hV11MaqCodFinal = httpContext.cgiGet( edtavMaqcodfinal_Internalname) ;
         if ( (GXutil.strcmp("", hV11MaqCodFinal)==0) )
         {
            AV11MaqCodFinal = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11MaqCodFinal", AV11MaqCodFinal);
         }
         else
         {
            A13734MaqCDsc = hV11MaqCodFinal ;
            /* Using cursor H01507 */
            pr_default.execute(5, new Object[] {A13734MaqCDsc, AV12MaqCodInicial, AV6EmprCod});
            AV11MaqCodFinal = H01507_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(5) == 101) ) )
            {
               pr_default.readNext(5);
               if ( ! ( (pr_default.getStatus(5) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCODFINAL");
                  GX_FocusControl = edtavMaqcodfinal_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(5);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV11MaqCodFinal", hV11MaqCodFinal);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTI");
            GX_FocusControl = edtavHisprodti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9HisProDTI = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV9HisProDTI", localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV9HisProDTI = localUtil.ctot( httpContext.cgiGet( edtavHisprodti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9HisProDTI", localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodtf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTF");
            GX_FocusControl = edtavHisprodtf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8HisProDTF = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV8HisProDTF", localUtil.ttoc( AV8HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV8HisProDTF = localUtil.ctot( httpContext.cgiGet( edtavHisprodtf_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8HisProDTF", localUtil.ttoc( AV8HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         cmbavHisproreo.setValue( httpContext.cgiGet( cmbavHisproreo.getInternalname()) );
         AV10HisProReo = (byte)(GXutil.lval( httpContext.cgiGet( cmbavHisproreo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10HisProReo", GXutil.str( AV10HisProReo, 1, 0));
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
      e131502 ();
      if (returnInSub) return;
   }

   public void e131502( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV6EmprCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerempresa(remoteHandle, context).execute( GXv_char2) ;
      webwwkp110datatime_impl.this.GXt_char1 = GXv_char2[0] ;
      AV6EmprCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6EmprCod, "@!"))));
      AV10HisProReo = (byte)(9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10HisProReo", GXutil.str( AV10HisProReo, 1, 0));
      AV8HisProDTF = GXutil.now( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8HisProDTF", localUtil.ttoc( AV8HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV9HisProDTI = GXutil.dtadd( AV8HisProDTF, 86400*(-30)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9HisProDTI", localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwwkp110datatime_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      GXv_char2[0] = AV6EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwwkp110datatime_impl.this.AV6EmprCod = GXv_char2[0] ;
      webwwkp110datatime_impl.this.AV7EmprNom = GXv_char3[0] ;
      webwwkp110datatime_impl.this.AV14UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6EmprCod, "@!"))));
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcinformesproduccion_tabs = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcinformesproduccion_tabs_Component), GXutil.lower( "WCInformesProduccionReoperados_tabs")) != 0 )
      {
         WebComp_Wcwcinformesproduccion_tabs = WebUtils.getWebComponent(getClass(), "app.wcinformesproduccionreoperados_tabs_impl", remoteHandle, context);
         WebComp_Wcwcinformesproduccion_tabs_Component = "WCInformesProduccionReoperados_tabs" ;
      }
      if ( GXutil.len( WebComp_Wcwcinformesproduccion_tabs_Component) != 0 )
      {
         WebComp_Wcwcinformesproduccion_tabs.setjustcreated();
         WebComp_Wcwcinformesproduccion_tabs.componentprepare(new Object[] {"W0068","",AV6EmprCod,AV12MaqCodInicial,AV11MaqCodFinal,AV9HisProDTI,AV8HisProDTF,Byte.valueOf(AV10HisProReo)});
         WebComp_Wcwcinformesproduccion_tabs.componentbind(new Object[] {"","vMAQCODINICIAL","vMAQCODFINAL","vHISPRODTI","vHISPRODTF","vHISPROREO"});
      }
   }

   public void e141502( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'DOREFRESH' */
      S112 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e171502( )
   {
      /* Hisproreo_Click Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'DOREFRESH' */
      S112 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e151502 ();
      if (returnInSub) return;
   }

   public void e151502( )
   {
      /* Enter Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'DOREFRESH' */
      S112 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'DOREFRESH' Routine */
      returnInSub = false ;
      AV15TextoCorte = "" ;
      if ( ! (GXutil.strcmp("", AV12MaqCodInicial)==0) || ! (GXutil.strcmp("", AV11MaqCodFinal)==0) )
      {
         if ( GXutil.strcmp(AV12MaqCodInicial, AV11MaqCodFinal) == 0 )
         {
            AV15TextoCorte = GXutil.format( httpContext.getMessage( "Máq. : %1", "")+GXutil.trim( AV12MaqCodInicial), "", "", "", "", "", "", "", "", "") ;
         }
         else if ( ! (GXutil.strcmp("", AV12MaqCodInicial)==0) && ! (GXutil.strcmp("", AV11MaqCodFinal)==0) )
         {
            AV15TextoCorte = GXutil.format( httpContext.getMessage( "Rango Máq. : %1 - %2", ""), GXutil.trim( AV12MaqCodInicial), GXutil.trim( AV11MaqCodFinal), "", "", "", "", "", "", "") ;
         }
         else if ( ! (GXutil.strcmp("", AV12MaqCodInicial)==0) )
         {
            AV15TextoCorte = GXutil.format( httpContext.getMessage( "Desde Máq. : %1", "")+GXutil.trim( AV12MaqCodInicial), "", "", "", "", "", "", "", "", "") ;
         }
         else
         {
            AV15TextoCorte = GXutil.format( httpContext.getMessage( "Hasta Máq. : %1", "")+GXutil.trim( AV11MaqCodFinal), "", "", "", "", "", "", "", "", "") ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV9HisProDTI) || ! GXutil.dateCompare(GXutil.nullDate(), AV8HisProDTF) )
      {
         if ( GXutil.dateCompare(AV9HisProDTI, AV8HisProDTF) )
         {
            AV15TextoCorte = ((GXutil.strcmp("", AV15TextoCorte)==0) ? "" : GXutil.trim( AV15TextoCorte)+", ") + GXutil.format( httpContext.getMessage( "Fecha : %1", "")+GXutil.trim( localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "", "", "", "", "", "", "", "", "") ;
         }
         else if ( ! GXutil.dateCompare(GXutil.nullDate(), AV9HisProDTI) && ! GXutil.dateCompare(GXutil.nullDate(), AV8HisProDTF) )
         {
            AV15TextoCorte = ((GXutil.strcmp("", AV15TextoCorte)==0) ? "" : GXutil.trim( AV15TextoCorte)+", ") + GXutil.format( httpContext.getMessage( "Rango Fecha : %1 - %2", ""), GXutil.trim( localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), GXutil.trim( localUtil.ttoc( AV8HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "", "", "", "", "", "", "") ;
         }
         else if ( ! GXutil.dateCompare(GXutil.nullDate(), AV9HisProDTI) )
         {
            AV15TextoCorte = ((GXutil.strcmp("", AV15TextoCorte)==0) ? "" : GXutil.trim( AV15TextoCorte)+", ") + GXutil.format( httpContext.getMessage( "Desde : %1", "")+GXutil.trim( localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "", "", "", "", "", "", "", "", "") ;
         }
         else
         {
            AV15TextoCorte = ((GXutil.strcmp("", AV15TextoCorte)==0) ? "" : GXutil.trim( AV15TextoCorte)+", ") + GXutil.format( httpContext.getMessage( "Hasta : %1", "")+GXutil.trim( localUtil.ttoc( AV8HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "", "", "", "", "", "", "", "", "") ;
         }
      }
      if ( ! ( AV10HisProReo == 9 ) )
      {
         if ( (0==AV10HisProReo) )
         {
            AV15TextoCorte = ((GXutil.strcmp("", AV15TextoCorte)==0) ? "" : GXutil.trim( AV15TextoCorte)+", ") + httpContext.getMessage( "Producción Normal", "") ;
         }
         else if ( AV10HisProReo == 1 )
         {
            AV15TextoCorte = ((GXutil.strcmp("", AV15TextoCorte)==0) ? "" : GXutil.trim( AV15TextoCorte)+", ") + httpContext.getMessage( "Reoperado I", "") ;
         }
         else if ( AV10HisProReo == 2 )
         {
            AV15TextoCorte = ((GXutil.strcmp("", AV15TextoCorte)==0) ? "" : GXutil.trim( AV15TextoCorte)+", ") + httpContext.getMessage( "Reoperado E", "") ;
         }
      }
      AV15TextoCorte = httpContext.getMessage( "Informes", "") + " " + GXutil.trim( AV15TextoCorte) ;
      Dvpanel_panelinformes_Title = GXutil.trim( AV15TextoCorte) ;
      ucDvpanel_panelinformes.sendProperty(context, "", false, Dvpanel_panelinformes_Internalname, "Title", Dvpanel_panelinformes_Title);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcinformesproduccion_tabs = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcinformesproduccion_tabs_Component), GXutil.lower( "WCInformesProduccionReoperados_tabs")) != 0 )
      {
         WebComp_Wcwcinformesproduccion_tabs = WebUtils.getWebComponent(getClass(), "app.wcinformesproduccionreoperados_tabs_impl", remoteHandle, context);
         WebComp_Wcwcinformesproduccion_tabs_Component = "WCInformesProduccionReoperados_tabs" ;
      }
      if ( GXutil.len( WebComp_Wcwcinformesproduccion_tabs_Component) != 0 )
      {
         WebComp_Wcwcinformesproduccion_tabs.setjustcreated();
         WebComp_Wcwcinformesproduccion_tabs.componentprepare(new Object[] {"W0068","",AV6EmprCod,AV12MaqCodInicial,AV11MaqCodFinal,AV9HisProDTI,AV8HisProDTF,Byte.valueOf(AV10HisProReo)});
         WebComp_Wcwcinformesproduccion_tabs.componentbind(new Object[] {"","vMAQCODINICIAL","vMAQCODFINAL","vHISPRODTI","vHISPRODTF","vHISPROREO"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcinformesproduccion_tabs )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0068"+"");
         WebComp_Wcwcinformesproduccion_tabs.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e161502( )
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
      pa1502( ) ;
      ws1502( ) ;
      we1502( ) ;
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
      if ( ! ( WebComp_Wcwcinformesproduccion_tabs == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcinformesproduccion_tabs_Component) != 0 )
         {
            WebComp_Wcwcinformesproduccion_tabs.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016424487", true, true);
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
      httpContext.AddJavascriptSource("webwwkp110datatime.js", "?202661016424487", false, true);
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
      edtavMaqcodinicial_Internalname = "vMAQCODINICIAL" ;
      edtavMaqcodfinal_Internalname = "vMAQCODFINAL" ;
      edtavHisprodti_Internalname = "vHISPRODTI" ;
      edtavHisprodtf_Internalname = "vHISPRODTF" ;
      cmbavHisproreo.setInternalname( "vHISPROREO" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtnsalir_Internalname = "BTNSALIR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divPnl1_Internalname = "PNL1" ;
      Dvpanel_pnl1_Internalname = "DVPANEL_PNL1" ;
      divPanelinformes_Internalname = "PANELINFORMES" ;
      Dvpanel_panelinformes_Internalname = "DVPANEL_PANELINFORMES" ;
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
      cmbavHisproreo.setJsonclick( "" );
      cmbavHisproreo.setEnabled( 1 );
      edtavHisprodtf_Jsonclick = "" ;
      edtavHisprodtf_Enabled = 1 ;
      edtavHisprodti_Jsonclick = "" ;
      edtavHisprodti_Enabled = 1 ;
      edtavMaqcodfinal_Jsonclick = "" ;
      edtavMaqcodfinal_Enabled = 1 ;
      edtavMaqcodinicial_Jsonclick = "" ;
      edtavMaqcodinicial_Enabled = 1 ;
      Dvpanel_panelinformes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelinformes_Iconposition = "Right" ;
      Dvpanel_panelinformes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelinformes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelinformes_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelinformes_Title = httpContext.getMessage( "Informes", "") ;
      Dvpanel_panelinformes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelinformes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelinformes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelinformes_Width = "100%" ;
      Dvpanel_pnl1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Iconposition = "Right" ;
      Dvpanel_pnl1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnl1_Title = httpContext.getMessage( "Filtros", "") ;
      Dvpanel_pnl1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnl1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnl1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Width = "100%" ;
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
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Generales", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Informe Produccion RESUMEN", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavHisproreo.setName( "vHISPROREO" );
      cmbavHisproreo.setWebtags( "" );
      cmbavHisproreo.addItem("9", httpContext.getMessage( "Todos", ""), (short)(0));
      cmbavHisproreo.addItem("0", httpContext.getMessage( "Produccion Normal", ""), (short)(0));
      cmbavHisproreo.addItem("1", httpContext.getMessage( "Reoperado I", ""), (short)(0));
      cmbavHisproreo.addItem("2", httpContext.getMessage( "Reoperado E", ""), (short)(0));
      if ( cmbavHisproreo.getItemCount() > 0 )
      {
         AV10HisProReo = (byte)(GXutil.lval( cmbavHisproreo.getValidValue(GXutil.trim( GXutil.str( AV10HisProReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10HisProReo", GXutil.str( AV10HisProReo, 1, 0));
      }
      /* End function init_web_controls */
   }

   public void validv_Maqcodfinal( )
   {
      if ( (GXutil.strcmp("", hV12MaqCodInicial)==0) )
      {
         AV12MaqCodInicial = "" ;
      }
      else
      {
         A13734MaqCDsc = hV12MaqCodInicial ;
         /* Using cursor H01508 */
         pr_default.execute(6, new Object[] {A13734MaqCDsc, AV11MaqCodFinal, AV11MaqCodFinal, AV6EmprCod});
         AV12MaqCodInicial = H01508_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(6) == 101) ) )
         {
            pr_default.readNext(6);
            if ( ! ( (pr_default.getStatus(6) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCODINICIAL");
               GX_FocusControl = edtavMaqcodinicial_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(6);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV12MaqCodInicial", hV12MaqCodInicial);
      if ( (GXutil.strcmp("", hV11MaqCodFinal)==0) )
      {
         AV11MaqCodFinal = "" ;
      }
      else
      {
         A13734MaqCDsc = hV11MaqCodFinal ;
         /* Using cursor H01509 */
         pr_default.execute(7, new Object[] {A13734MaqCDsc, AV12MaqCodInicial, AV6EmprCod});
         AV11MaqCodFinal = H01509_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(7) == 101) ) )
         {
            pr_default.readNext(7);
            if ( ! ( (pr_default.getStatus(7) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCODFINAL");
               GX_FocusControl = edtavMaqcodfinal_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(7);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV11MaqCodFinal", hV11MaqCodFinal);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV12MaqCodInicial", GXutil.rtrim( AV12MaqCodInicial));
      httpContext.ajax_rsp_assign_attri("", false, "AV11MaqCodFinal", GXutil.rtrim( AV11MaqCodFinal));
      httpContext.ajax_rsp_assign_attri("", false, "hV12MaqCodInicial", hV12MaqCodInicial);
      httpContext.ajax_rsp_assign_attri("", false, "hV11MaqCodFinal", hV11MaqCodFinal);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV12MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV11MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV9HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV8HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'cmbavHisproreo'},{av:'AV10HisProReo',fld:'vHISPROREO',pic:'9'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'Dvpanel_panelinformes_Title',ctrl:'DVPANEL_PANELINFORMES',prop:'Title'},{ctrl:'WCWCINFORMESPRODUCCION_TABS'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e111501',iparms:[{av:'AV12MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV11MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV9HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV8HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'cmbavHisproreo'},{av:'AV10HisProReo',fld:'vHISPROREO',pic:'9'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'Dvpanel_panelinformes_Title',ctrl:'DVPANEL_PANELINFORMES',prop:'Title'},{ctrl:'WCWCINFORMESPRODUCCION_TABS'}]}");
      setEventMetadata("'DOSALIR'","{handler:'e121501',iparms:[]");
      setEventMetadata("'DOSALIR'",",oparms:[]}");
      setEventMetadata("VHISPROREO.CLICK","{handler:'e171502',iparms:[{av:'AV12MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV11MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV9HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV8HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'cmbavHisproreo'},{av:'AV10HisProReo',fld:'vHISPROREO',pic:'9'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("VHISPROREO.CLICK",",oparms:[{av:'Dvpanel_panelinformes_Title',ctrl:'DVPANEL_PANELINFORMES',prop:'Title'},{ctrl:'WCWCINFORMESPRODUCCION_TABS'}]}");
      setEventMetadata("ENTER","{handler:'e151502',iparms:[{av:'AV12MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV11MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV9HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV8HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'cmbavHisproreo'},{av:'AV10HisProReo',fld:'vHISPROREO',pic:'9'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'Dvpanel_panelinformes_Title',ctrl:'DVPANEL_PANELINFORMES',prop:'Title'},{ctrl:'WCWCINFORMESPRODUCCION_TABS'}]}");
      setEventMetadata("VALIDV_MAQCODINICIAL","{handler:'validv_Maqcodinicial',iparms:[]");
      setEventMetadata("VALIDV_MAQCODINICIAL",",oparms:[]}");
      setEventMetadata("VALIDV_MAQCODFINAL","{handler:'validv_Maqcodfinal',iparms:[{av:'hV12MaqCodInicial'},{av:'hV11MaqCodFinal'},{av:'AV12MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV11MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("VALIDV_MAQCODFINAL",",oparms:[{av:'AV12MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV11MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'hV12MaqCodInicial'},{av:'hV11MaqCodFinal'}]}");
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
      AV11MaqCodFinal = "" ;
      AV6EmprCod = "" ;
      A13734MaqCDsc = "" ;
      AV12MaqCodInicial = "" ;
      hV12MaqCodInicial = "" ;
      hV11MaqCodFinal = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV15TextoCorte = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_pnl1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV9HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV8HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnsalir_Jsonclick = "" ;
      ucDvpanel_panelinformes = new com.genexus.webpanels.GXUserControl();
      WebComp_Wcwcinformesproduccion_tabs_Component = "" ;
      OldWcwcinformesproduccion_tabs = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13734MaqCDsc = "" ;
      H01502_A13734MaqCDsc = new String[] {""} ;
      H01503_A13734MaqCDsc = new String[] {""} ;
      H01504_A606MaqDsc = new String[] {""} ;
      H01504_n606MaqDsc = new boolean[] {false} ;
      H01504_A13734MaqCDsc = new String[] {""} ;
      H01504_A396EmprCod = new String[] {""} ;
      H01504_A602MaqCod = new String[] {""} ;
      A606MaqDsc = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      H01505_A606MaqDsc = new String[] {""} ;
      H01505_n606MaqDsc = new boolean[] {false} ;
      H01505_A13734MaqCDsc = new String[] {""} ;
      H01505_A396EmprCod = new String[] {""} ;
      H01505_A602MaqCod = new String[] {""} ;
      H01506_A606MaqDsc = new String[] {""} ;
      H01506_n606MaqDsc = new boolean[] {false} ;
      H01506_A13734MaqCDsc = new String[] {""} ;
      H01506_A396EmprCod = new String[] {""} ;
      H01506_A602MaqCod = new String[] {""} ;
      H01507_A606MaqDsc = new String[] {""} ;
      H01507_n606MaqDsc = new boolean[] {false} ;
      H01507_A13734MaqCDsc = new String[] {""} ;
      H01507_A396EmprCod = new String[] {""} ;
      H01507_A602MaqCod = new String[] {""} ;
      AV13Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV7EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV14UsurCod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H01508_A606MaqDsc = new String[] {""} ;
      H01508_n606MaqDsc = new boolean[] {false} ;
      H01508_A13734MaqCDsc = new String[] {""} ;
      H01508_A396EmprCod = new String[] {""} ;
      H01508_A602MaqCod = new String[] {""} ;
      H01509_A606MaqDsc = new String[] {""} ;
      H01509_n606MaqDsc = new boolean[] {false} ;
      H01509_A13734MaqCDsc = new String[] {""} ;
      H01509_A396EmprCod = new String[] {""} ;
      H01509_A602MaqCod = new String[] {""} ;
      ZV12MaqCodInicial = "" ;
      ZV11MaqCodFinal = "" ;
      ZhV12MaqCodInicial = "" ;
      ZhV11MaqCodFinal = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwwkp110datatime__default(),
         new Object[] {
             new Object[] {
            H01502_A13734MaqCDsc
            }
            , new Object[] {
            H01503_A13734MaqCDsc
            }
            , new Object[] {
            H01504_A606MaqDsc, H01504_n606MaqDsc, H01504_A13734MaqCDsc, H01504_A396EmprCod, H01504_A602MaqCod
            }
            , new Object[] {
            H01505_A606MaqDsc, H01505_n606MaqDsc, H01505_A13734MaqCDsc, H01505_A396EmprCod, H01505_A602MaqCod
            }
            , new Object[] {
            H01506_A606MaqDsc, H01506_n606MaqDsc, H01506_A13734MaqCDsc, H01506_A396EmprCod, H01506_A602MaqCod
            }
            , new Object[] {
            H01507_A606MaqDsc, H01507_n606MaqDsc, H01507_A13734MaqCDsc, H01507_A396EmprCod, H01507_A602MaqCod
            }
            , new Object[] {
            H01508_A606MaqDsc, H01508_n606MaqDsc, H01508_A13734MaqCDsc, H01508_A396EmprCod, H01508_A602MaqCod
            }
            , new Object[] {
            H01509_A606MaqDsc, H01509_n606MaqDsc, H01509_A13734MaqCDsc, H01509_A396EmprCod, H01509_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Wcwcinformesproduccion_tabs = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV10HisProReo ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int edtavMaqcodinicial_Enabled ;
   private int edtavMaqcodfinal_Enabled ;
   private int edtavHisprodti_Enabled ;
   private int edtavHisprodtf_Enabled ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV11MaqCodFinal ;
   private String AV6EmprCod ;
   private String AV12MaqCodInicial ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_pnl1_Width ;
   private String Dvpanel_pnl1_Cls ;
   private String Dvpanel_pnl1_Title ;
   private String Dvpanel_pnl1_Iconposition ;
   private String Dvpanel_panelinformes_Width ;
   private String Dvpanel_panelinformes_Cls ;
   private String Dvpanel_panelinformes_Title ;
   private String Dvpanel_panelinformes_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_pnl1_Internalname ;
   private String divPnl1_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavMaqcodinicial_Internalname ;
   private String TempTags ;
   private String edtavMaqcodinicial_Jsonclick ;
   private String edtavMaqcodfinal_Internalname ;
   private String edtavMaqcodfinal_Jsonclick ;
   private String edtavHisprodti_Internalname ;
   private String edtavHisprodti_Jsonclick ;
   private String edtavHisprodtf_Internalname ;
   private String edtavHisprodtf_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnsalir_Internalname ;
   private String bttBtnsalir_Jsonclick ;
   private String Dvpanel_panelinformes_Internalname ;
   private String divPanelinformes_Internalname ;
   private String WebComp_Wcwcinformesproduccion_tabs_Component ;
   private String OldWcwcinformesproduccion_tabs ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A606MaqDsc ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV13Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV7EmprNom ;
   private String GXv_char3[] ;
   private String AV14UsurCod ;
   private String GXv_char4[] ;
   private String ZV12MaqCodInicial ;
   private String ZV11MaqCodFinal ;
   private java.util.Date AV9HisProDTI ;
   private java.util.Date AV8HisProDTF ;
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
   private boolean Dvpanel_pnl1_Autowidth ;
   private boolean Dvpanel_pnl1_Autoheight ;
   private boolean Dvpanel_pnl1_Collapsible ;
   private boolean Dvpanel_pnl1_Collapsed ;
   private boolean Dvpanel_pnl1_Showcollapseicon ;
   private boolean Dvpanel_pnl1_Autoscroll ;
   private boolean Dvpanel_panelinformes_Autowidth ;
   private boolean Dvpanel_panelinformes_Autoheight ;
   private boolean Dvpanel_panelinformes_Collapsible ;
   private boolean Dvpanel_panelinformes_Collapsed ;
   private boolean Dvpanel_panelinformes_Showcollapseicon ;
   private boolean Dvpanel_panelinformes_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n606MaqDsc ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwcinformesproduccion_tabs ;
   private String A13734MaqCDsc ;
   private String hV12MaqCodInicial ;
   private String hV11MaqCodFinal ;
   private String AV15TextoCorte ;
   private String l13734MaqCDsc ;
   private String ZhV12MaqCodInicial ;
   private String ZhV11MaqCodFinal ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwcinformesproduccion_tabs ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnl1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelinformes ;
   private HTMLChoice cmbavHisproreo ;
   private IDataStoreProvider pr_default ;
   private String[] H01502_A13734MaqCDsc ;
   private String[] H01503_A13734MaqCDsc ;
   private String[] H01504_A606MaqDsc ;
   private boolean[] H01504_n606MaqDsc ;
   private String[] H01504_A13734MaqCDsc ;
   private String[] H01504_A396EmprCod ;
   private String[] H01504_A602MaqCod ;
   private String[] H01505_A606MaqDsc ;
   private boolean[] H01505_n606MaqDsc ;
   private String[] H01505_A13734MaqCDsc ;
   private String[] H01505_A396EmprCod ;
   private String[] H01505_A602MaqCod ;
   private String[] H01506_A606MaqDsc ;
   private boolean[] H01506_n606MaqDsc ;
   private String[] H01506_A13734MaqCDsc ;
   private String[] H01506_A396EmprCod ;
   private String[] H01506_A602MaqCod ;
   private String[] H01507_A606MaqDsc ;
   private boolean[] H01507_n606MaqDsc ;
   private String[] H01507_A13734MaqCDsc ;
   private String[] H01507_A396EmprCod ;
   private String[] H01507_A602MaqCod ;
   private String[] H01508_A606MaqDsc ;
   private boolean[] H01508_n606MaqDsc ;
   private String[] H01508_A13734MaqCDsc ;
   private String[] H01508_A396EmprCod ;
   private String[] H01508_A602MaqCod ;
   private String[] H01509_A606MaqDsc ;
   private boolean[] H01509_n606MaqDsc ;
   private String[] H01509_A13734MaqCDsc ;
   private String[] H01509_A396EmprCod ;
   private String[] H01509_A602MaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webwwkp110datatime__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01502", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE (UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?)) AND (Not (rtrim(MaqDsc) IS NULL AND NOT(MaqDsc IS NULL))) AND (MaqCod <= ? or (rtrim(?) IS NULL)) AND (EmprCod = ?)) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01503", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE (UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?)) AND (Not (rtrim(MaqDsc) IS NULL AND NOT(MaqDsc IS NULL))) AND (MaqCod >= ?) AND (EmprCod = ?)) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01504", "SELECT MaqDsc, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (Not (rtrim(MaqDsc) IS NULL AND NOT(MaqDsc IS NULL))) AND (MaqCod <= ? or (rtrim(?) IS NULL)) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01505", "SELECT MaqDsc, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (Not (rtrim(MaqDsc) IS NULL AND NOT(MaqDsc IS NULL))) AND (MaqCod >= ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01506", "SELECT MaqDsc, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (Not (rtrim(MaqDsc) IS NULL AND NOT(MaqDsc IS NULL))) AND (MaqCod <= ? or (rtrim(?) IS NULL)) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01507", "SELECT MaqDsc, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (Not (rtrim(MaqDsc) IS NULL AND NOT(MaqDsc IS NULL))) AND (MaqCod >= ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01508", "SELECT MaqDsc, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (Not (rtrim(MaqDsc) IS NULL AND NOT(MaqDsc IS NULL))) AND (MaqCod <= ? or (rtrim(?) IS NULL)) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01509", "SELECT MaqDsc, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (Not (rtrim(MaqDsc) IS NULL AND NOT(MaqDsc IS NULL))) AND (MaqCod >= ?) AND (EmprCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
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
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 3);
               return;
      }
   }

}

