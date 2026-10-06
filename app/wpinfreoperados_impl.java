package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wpinfreoperados_impl extends GXDataArea
{
   public wpinfreoperados_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpinfreoperados_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpinfreoperados_impl.class ));
   }

   public wpinfreoperados_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavHisestreo = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCLICODINI") == 0 )
         {
            A279CliNom = httpContext.GetPar( "CliNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvclicodiniDZ0( A279CliNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCLICODINI") == 0 )
         {
            A279CliNom = httpContext.GetPar( "CliNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvclicodiniDZ0( A279CliNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vCLICODINI") == 0 )
         {
            hV5CliCodIni = httpContext.GetPar( "hV5CliCodIni") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvclicodiniDZ2( hV5CliCodIni) ;
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
      paDZ2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startDZ2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wpinfreoperados", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvCLICODINI", GXutil.ltrim( localUtil.ntoc( AV5CliCodIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL5_Width", GXutil.rtrim( Dvpanel_pnl5_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL5_Autowidth", GXutil.booltostr( Dvpanel_pnl5_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL5_Autoheight", GXutil.booltostr( Dvpanel_pnl5_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL5_Cls", GXutil.rtrim( Dvpanel_pnl5_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL5_Title", GXutil.rtrim( Dvpanel_pnl5_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL5_Collapsible", GXutil.booltostr( Dvpanel_pnl5_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL5_Collapsed", GXutil.booltostr( Dvpanel_pnl5_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL5_Showcollapseicon", GXutil.booltostr( Dvpanel_pnl5_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL5_Iconposition", GXutil.rtrim( Dvpanel_pnl5_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL5_Autoscroll", GXutil.booltostr( Dvpanel_pnl5_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL4_Width", GXutil.rtrim( Dvpanel_pnl4_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL4_Autowidth", GXutil.booltostr( Dvpanel_pnl4_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL4_Autoheight", GXutil.booltostr( Dvpanel_pnl4_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL4_Cls", GXutil.rtrim( Dvpanel_pnl4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL4_Title", GXutil.rtrim( Dvpanel_pnl4_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL4_Collapsible", GXutil.booltostr( Dvpanel_pnl4_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL4_Collapsed", GXutil.booltostr( Dvpanel_pnl4_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL4_Showcollapseicon", GXutil.booltostr( Dvpanel_pnl4_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL4_Iconposition", GXutil.rtrim( Dvpanel_pnl4_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL4_Autoscroll", GXutil.booltostr( Dvpanel_pnl4_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL2_Width", GXutil.rtrim( Dvpanel_pnl2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL2_Autowidth", GXutil.booltostr( Dvpanel_pnl2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL2_Autoheight", GXutil.booltostr( Dvpanel_pnl2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL2_Cls", GXutil.rtrim( Dvpanel_pnl2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL2_Title", GXutil.rtrim( Dvpanel_pnl2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL2_Collapsible", GXutil.booltostr( Dvpanel_pnl2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL2_Collapsed", GXutil.booltostr( Dvpanel_pnl2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL2_Showcollapseicon", GXutil.booltostr( Dvpanel_pnl2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL2_Iconposition", GXutil.rtrim( Dvpanel_pnl2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL2_Autoscroll", GXutil.booltostr( Dvpanel_pnl2_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL3_Width", GXutil.rtrim( Dvpanel_pnl3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL3_Autowidth", GXutil.booltostr( Dvpanel_pnl3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL3_Autoheight", GXutil.booltostr( Dvpanel_pnl3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL3_Cls", GXutil.rtrim( Dvpanel_pnl3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL3_Title", GXutil.rtrim( Dvpanel_pnl3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL3_Collapsible", GXutil.booltostr( Dvpanel_pnl3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL3_Collapsed", GXutil.booltostr( Dvpanel_pnl3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL3_Showcollapseicon", GXutil.booltostr( Dvpanel_pnl3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL3_Iconposition", GXutil.rtrim( Dvpanel_pnl3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL3_Autoscroll", GXutil.booltostr( Dvpanel_pnl3_Autoscroll));
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
      if ( ! ( WebComp_Wcwcclientesdefectosmaquinas == null ) )
      {
         WebComp_Wcwcclientesdefectosmaquinas.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcclientesresumengooglechart == null ) )
      {
         WebComp_Wcwcclientesresumengooglechart.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcdefectosresumengooglechart == null ) )
      {
         WebComp_Wcwcdefectosresumengooglechart.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcmaquinasresumengooglechart == null ) )
      {
         WebComp_Wcwcmaquinasresumengooglechart.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcreoperadosdetallelist == null ) )
      {
         WebComp_Wcwcreoperadosdetallelist.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcreoperadosdetallequeryviewer == null ) )
      {
         WebComp_Wcwcreoperadosdetallequeryviewer.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcdefectosresumen == null ) )
      {
         WebComp_Wcwcdefectosresumen.componentjscripts();
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
         weDZ2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtDZ2( ) ;
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
      return formatLink("app.wpinfreoperados", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WPInfReoperados" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informes de Reoperados Internos, Externos", "") ;
   }

   public void wbDZ0( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableclicodini_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicodini_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockclicodini_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WPInfReoperados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicodini_Internalname, httpContext.getMessage( "Cli Cod Ini", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodini_Internalname, GXutil.rtrim( hV5CliCodIni), GXutil.rtrim( localUtil.format( hV5CliCodIni, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicodini_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WPInfReoperados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablefechaini_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfechaini_Internalname, httpContext.getMessage( "Periodo", ""), "", "", lblTextblockfechaini_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WPInfReoperados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechaini_Internalname, httpContext.getMessage( "Fecha Ini", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechaini_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechaini_Internalname, localUtil.format(AV7FechaIni, "99/99/99"), localUtil.format( AV7FechaIni, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechaini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechaini_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "", "HLP_WPInfReoperados.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechaini_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechaini_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPInfReoperados.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablefechafin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfechafin_Internalname, "", "", "", lblTextblockfechafin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WPInfReoperados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechafin_Internalname, httpContext.getMessage( "Fecha Fin", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechafin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechafin_Internalname, localUtil.format(AV8FechaFin, "99/99/99"), localUtil.format( AV8FechaFin, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechafin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechafin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "", "HLP_WPInfReoperados.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechafin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechafin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPInfReoperados.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablehisestreo_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockhisestreo_Internalname, httpContext.getMessage( "Tipo", ""), "", "", lblTextblockhisestreo_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WPInfReoperados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavHisestreo.getInternalname(), httpContext.getMessage( "His Est Reo", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavHisestreo, cmbavHisestreo.getInternalname(), GXutil.trim( GXutil.str( AV13HisEstReo, 1, 0)), 1, cmbavHisestreo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavHisestreo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "", true, (byte)(0), "HLP_WPInfReoperados.htm");
         cmbavHisestreo.setValue( GXutil.trim( GXutil.str( AV13HisEstReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHisestreo.getInternalname(), "Values", cmbavHisestreo.ToJavascriptSource(), true);
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
         wb_table1_56_DZ2( true) ;
      }
      else
      {
         wb_table1_56_DZ2( false) ;
      }
      return  ;
   }

   public void wb_table1_56_DZ2e( boolean wbgen )
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
         ucDvpanel_pnl5.setProperty("Width", Dvpanel_pnl5_Width);
         ucDvpanel_pnl5.setProperty("AutoWidth", Dvpanel_pnl5_Autowidth);
         ucDvpanel_pnl5.setProperty("AutoHeight", Dvpanel_pnl5_Autoheight);
         ucDvpanel_pnl5.setProperty("Cls", Dvpanel_pnl5_Cls);
         ucDvpanel_pnl5.setProperty("Title", Dvpanel_pnl5_Title);
         ucDvpanel_pnl5.setProperty("Collapsible", Dvpanel_pnl5_Collapsible);
         ucDvpanel_pnl5.setProperty("Collapsed", Dvpanel_pnl5_Collapsed);
         ucDvpanel_pnl5.setProperty("ShowCollapseIcon", Dvpanel_pnl5_Showcollapseicon);
         ucDvpanel_pnl5.setProperty("IconPosition", Dvpanel_pnl5_Iconposition);
         ucDvpanel_pnl5.setProperty("AutoScroll", Dvpanel_pnl5_Autoscroll);
         ucDvpanel_pnl5.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnl5_Internalname, "DVPANEL_PNL5Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNL5Container"+"pnl5"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPnl5_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0070"+"", GXutil.rtrim( WebComp_Wcwcclientesresumengooglechart_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0070"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcclientesresumengooglechart_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcclientesresumengooglechart), GXutil.lower( WebComp_Wcwcclientesresumengooglechart_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0070"+"");
               }
               WebComp_Wcwcclientesresumengooglechart.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcclientesresumengooglechart), GXutil.lower( WebComp_Wcwcclientesresumengooglechart_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
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
         wb_table2_73_DZ2( true) ;
      }
      else
      {
         wb_table2_73_DZ2( false) ;
      }
      return  ;
   }

   public void wb_table2_73_DZ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divPnl1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0099"+"", GXutil.rtrim( WebComp_Wcwcreoperadosdetallelist_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0099"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcreoperadosdetallelist_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcreoperadosdetallelist), GXutil.lower( WebComp_Wcwcreoperadosdetallelist_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0099"+"");
               }
               WebComp_Wcwcreoperadosdetallelist.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcreoperadosdetallelist), GXutil.lower( WebComp_Wcwcreoperadosdetallelist_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
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
         /* User Defined Control */
         ucDvpanel_pnl2.setProperty("Width", Dvpanel_pnl2_Width);
         ucDvpanel_pnl2.setProperty("AutoWidth", Dvpanel_pnl2_Autowidth);
         ucDvpanel_pnl2.setProperty("AutoHeight", Dvpanel_pnl2_Autoheight);
         ucDvpanel_pnl2.setProperty("Cls", Dvpanel_pnl2_Cls);
         ucDvpanel_pnl2.setProperty("Title", Dvpanel_pnl2_Title);
         ucDvpanel_pnl2.setProperty("Collapsible", Dvpanel_pnl2_Collapsible);
         ucDvpanel_pnl2.setProperty("Collapsed", Dvpanel_pnl2_Collapsed);
         ucDvpanel_pnl2.setProperty("ShowCollapseIcon", Dvpanel_pnl2_Showcollapseicon);
         ucDvpanel_pnl2.setProperty("IconPosition", Dvpanel_pnl2_Iconposition);
         ucDvpanel_pnl2.setProperty("AutoScroll", Dvpanel_pnl2_Autoscroll);
         ucDvpanel_pnl2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnl2_Internalname, "DVPANEL_PNL2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNL2Container"+"pnl2"+"\" style=\"display:none;\">") ;
         wb_table3_104_DZ2( true) ;
      }
      else
      {
         wb_table3_104_DZ2( false) ;
      }
      return  ;
   }

   public void wb_table3_104_DZ2e( boolean wbgen )
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
         ucDvpanel_pnl3.setProperty("Width", Dvpanel_pnl3_Width);
         ucDvpanel_pnl3.setProperty("AutoWidth", Dvpanel_pnl3_Autowidth);
         ucDvpanel_pnl3.setProperty("AutoHeight", Dvpanel_pnl3_Autoheight);
         ucDvpanel_pnl3.setProperty("Cls", Dvpanel_pnl3_Cls);
         ucDvpanel_pnl3.setProperty("Title", Dvpanel_pnl3_Title);
         ucDvpanel_pnl3.setProperty("Collapsible", Dvpanel_pnl3_Collapsible);
         ucDvpanel_pnl3.setProperty("Collapsed", Dvpanel_pnl3_Collapsed);
         ucDvpanel_pnl3.setProperty("ShowCollapseIcon", Dvpanel_pnl3_Showcollapseicon);
         ucDvpanel_pnl3.setProperty("IconPosition", Dvpanel_pnl3_Iconposition);
         ucDvpanel_pnl3.setProperty("AutoScroll", Dvpanel_pnl3_Autoscroll);
         ucDvpanel_pnl3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnl3_Internalname, "DVPANEL_PNL3Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNL3Container"+"pnl3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPnl3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0119"+"", GXutil.rtrim( WebComp_Wcwcdefectosresumen_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0119"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcdefectosresumen_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcdefectosresumen), GXutil.lower( WebComp_Wcwcdefectosresumen_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0119"+"");
               }
               WebComp_Wcwcdefectosresumen.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcdefectosresumen), GXutil.lower( WebComp_Wcwcdefectosresumen_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
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

   public void startDZ2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Informes de Reoperados Internos, Externos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupDZ0( ) ;
   }

   public void wsDZ2( )
   {
      startDZ2( ) ;
      evtDZ2( ) ;
   }

   public void evtDZ2( )
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
                           e11DZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e12DZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCLICODINI.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13DZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFECHAFIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14DZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFECHAINI.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15DZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VHISESTREO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16DZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e17DZ2 ();
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
                     if ( nCmpId == 61 )
                     {
                        OldWcwcclientesdefectosmaquinas = httpContext.cgiGet( "W0061") ;
                        if ( ( GXutil.len( OldWcwcclientesdefectosmaquinas) == 0 ) || ( GXutil.strcmp(OldWcwcclientesdefectosmaquinas, WebComp_Wcwcclientesdefectosmaquinas_Component) != 0 ) )
                        {
                           WebComp_Wcwcclientesdefectosmaquinas = WebUtils.getWebComponent(getClass(), "app." + OldWcwcclientesdefectosmaquinas + "_impl", remoteHandle, context);
                           WebComp_Wcwcclientesdefectosmaquinas_Component = OldWcwcclientesdefectosmaquinas ;
                        }
                        if ( GXutil.len( WebComp_Wcwcclientesdefectosmaquinas_Component) != 0 )
                        {
                           WebComp_Wcwcclientesdefectosmaquinas.componentprocess("W0061", "", sEvt);
                        }
                        WebComp_Wcwcclientesdefectosmaquinas_Component = OldWcwcclientesdefectosmaquinas ;
                     }
                     else if ( nCmpId == 70 )
                     {
                        OldWcwcclientesresumengooglechart = httpContext.cgiGet( "W0070") ;
                        if ( ( GXutil.len( OldWcwcclientesresumengooglechart) == 0 ) || ( GXutil.strcmp(OldWcwcclientesresumengooglechart, WebComp_Wcwcclientesresumengooglechart_Component) != 0 ) )
                        {
                           WebComp_Wcwcclientesresumengooglechart = WebUtils.getWebComponent(getClass(), "app." + OldWcwcclientesresumengooglechart + "_impl", remoteHandle, context);
                           WebComp_Wcwcclientesresumengooglechart_Component = OldWcwcclientesresumengooglechart ;
                        }
                        if ( GXutil.len( WebComp_Wcwcclientesresumengooglechart_Component) != 0 )
                        {
                           WebComp_Wcwcclientesresumengooglechart.componentprocess("W0070", "", sEvt);
                        }
                        WebComp_Wcwcclientesresumengooglechart_Component = OldWcwcclientesresumengooglechart ;
                     }
                     else if ( nCmpId == 82 )
                     {
                        OldWcwcdefectosresumengooglechart = httpContext.cgiGet( "W0082") ;
                        if ( ( GXutil.len( OldWcwcdefectosresumengooglechart) == 0 ) || ( GXutil.strcmp(OldWcwcdefectosresumengooglechart, WebComp_Wcwcdefectosresumengooglechart_Component) != 0 ) )
                        {
                           WebComp_Wcwcdefectosresumengooglechart = WebUtils.getWebComponent(getClass(), "app." + OldWcwcdefectosresumengooglechart + "_impl", remoteHandle, context);
                           WebComp_Wcwcdefectosresumengooglechart_Component = OldWcwcdefectosresumengooglechart ;
                        }
                        if ( GXutil.len( WebComp_Wcwcdefectosresumengooglechart_Component) != 0 )
                        {
                           WebComp_Wcwcdefectosresumengooglechart.componentprocess("W0082", "", sEvt);
                        }
                        WebComp_Wcwcdefectosresumengooglechart_Component = OldWcwcdefectosresumengooglechart ;
                     }
                     else if ( nCmpId == 90 )
                     {
                        OldWcwcmaquinasresumengooglechart = httpContext.cgiGet( "W0090") ;
                        if ( ( GXutil.len( OldWcwcmaquinasresumengooglechart) == 0 ) || ( GXutil.strcmp(OldWcwcmaquinasresumengooglechart, WebComp_Wcwcmaquinasresumengooglechart_Component) != 0 ) )
                        {
                           WebComp_Wcwcmaquinasresumengooglechart = WebUtils.getWebComponent(getClass(), "app." + OldWcwcmaquinasresumengooglechart + "_impl", remoteHandle, context);
                           WebComp_Wcwcmaquinasresumengooglechart_Component = OldWcwcmaquinasresumengooglechart ;
                        }
                        if ( GXutil.len( WebComp_Wcwcmaquinasresumengooglechart_Component) != 0 )
                        {
                           WebComp_Wcwcmaquinasresumengooglechart.componentprocess("W0090", "", sEvt);
                        }
                        WebComp_Wcwcmaquinasresumengooglechart_Component = OldWcwcmaquinasresumengooglechart ;
                     }
                     else if ( nCmpId == 99 )
                     {
                        OldWcwcreoperadosdetallelist = httpContext.cgiGet( "W0099") ;
                        if ( ( GXutil.len( OldWcwcreoperadosdetallelist) == 0 ) || ( GXutil.strcmp(OldWcwcreoperadosdetallelist, WebComp_Wcwcreoperadosdetallelist_Component) != 0 ) )
                        {
                           WebComp_Wcwcreoperadosdetallelist = WebUtils.getWebComponent(getClass(), "app." + OldWcwcreoperadosdetallelist + "_impl", remoteHandle, context);
                           WebComp_Wcwcreoperadosdetallelist_Component = OldWcwcreoperadosdetallelist ;
                        }
                        if ( GXutil.len( WebComp_Wcwcreoperadosdetallelist_Component) != 0 )
                        {
                           WebComp_Wcwcreoperadosdetallelist.componentprocess("W0099", "", sEvt);
                        }
                        WebComp_Wcwcreoperadosdetallelist_Component = OldWcwcreoperadosdetallelist ;
                     }
                     else if ( nCmpId == 110 )
                     {
                        OldWcwcreoperadosdetallequeryviewer = httpContext.cgiGet( "W0110") ;
                        if ( ( GXutil.len( OldWcwcreoperadosdetallequeryviewer) == 0 ) || ( GXutil.strcmp(OldWcwcreoperadosdetallequeryviewer, WebComp_Wcwcreoperadosdetallequeryviewer_Component) != 0 ) )
                        {
                           WebComp_Wcwcreoperadosdetallequeryviewer = WebUtils.getWebComponent(getClass(), "app." + OldWcwcreoperadosdetallequeryviewer + "_impl", remoteHandle, context);
                           WebComp_Wcwcreoperadosdetallequeryviewer_Component = OldWcwcreoperadosdetallequeryviewer ;
                        }
                        if ( GXutil.len( WebComp_Wcwcreoperadosdetallequeryviewer_Component) != 0 )
                        {
                           WebComp_Wcwcreoperadosdetallequeryviewer.componentprocess("W0110", "", sEvt);
                        }
                        WebComp_Wcwcreoperadosdetallequeryviewer_Component = OldWcwcreoperadosdetallequeryviewer ;
                     }
                     else if ( nCmpId == 119 )
                     {
                        OldWcwcdefectosresumen = httpContext.cgiGet( "W0119") ;
                        if ( ( GXutil.len( OldWcwcdefectosresumen) == 0 ) || ( GXutil.strcmp(OldWcwcdefectosresumen, WebComp_Wcwcdefectosresumen_Component) != 0 ) )
                        {
                           WebComp_Wcwcdefectosresumen = WebUtils.getWebComponent(getClass(), "app." + OldWcwcdefectosresumen + "_impl", remoteHandle, context);
                           WebComp_Wcwcdefectosresumen_Component = OldWcwcdefectosresumen ;
                        }
                        if ( GXutil.len( WebComp_Wcwcdefectosresumen_Component) != 0 )
                        {
                           WebComp_Wcwcdefectosresumen.componentprocess("W0119", "", sEvt);
                        }
                        WebComp_Wcwcdefectosresumen_Component = OldWcwcdefectosresumen ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weDZ2( )
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

   public void paDZ2( )
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
            GX_FocusControl = edtavClicodini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvclicodiniDZ0( String A279CliNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvclicodini_dataDZ0( A279CliNom) ;
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

   protected void gxsgvvclicodini_dataDZ0( String A279CliNom )
   {
      l279CliNom = GXutil.padr( GXutil.rtrim( A279CliNom), 30, "%") ;
      /* Using cursor H00DZ2 */
      pr_default.execute(0, new Object[] {l279CliNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00DZ2_A279CliNom[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00DZ2_A279CliNom[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxhcvvclicodiniDZ2( String A279CliNom )
   {
      /* Using cursor H00DZ3 */
      pr_default.execute(1, new Object[] {A279CliNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A279CliNom = H00DZ3_A279CliNom[0] ;
         A396EmprCod = H00DZ3_A396EmprCod[0] ;
         A252CliCod = H00DZ3_A252CliCod[0] ;
         pr_default.readNext(1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(1);
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
      if ( cmbavHisestreo.getItemCount() > 0 )
      {
         AV13HisEstReo = (byte)(GXutil.lval( cmbavHisestreo.getValidValue(GXutil.trim( GXutil.str( AV13HisEstReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13HisEstReo", GXutil.str( AV13HisEstReo, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavHisestreo.setValue( GXutil.trim( GXutil.str( AV13HisEstReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHisestreo.getInternalname(), "Values", cmbavHisestreo.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfDZ2( ) ;
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

   public void rfDZ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e12DZ2 ();
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcclientesdefectosmaquinas_Component) != 0 )
            {
               WebComp_Wcwcclientesdefectosmaquinas.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcclientesresumengooglechart_Component) != 0 )
            {
               WebComp_Wcwcclientesresumengooglechart.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcdefectosresumengooglechart_Component) != 0 )
            {
               WebComp_Wcwcdefectosresumengooglechart.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcmaquinasresumengooglechart_Component) != 0 )
            {
               WebComp_Wcwcmaquinasresumengooglechart.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcreoperadosdetallelist_Component) != 0 )
            {
               WebComp_Wcwcreoperadosdetallelist.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcreoperadosdetallequeryviewer_Component) != 0 )
            {
               WebComp_Wcwcreoperadosdetallequeryviewer.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcdefectosresumen_Component) != 0 )
            {
               WebComp_Wcwcdefectosresumen.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e17DZ2 ();
         wbDZ0( ) ;
      }
   }

   public void send_integrity_lvl_hashesDZ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupDZ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11DZ2 ();
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
         Dvpanel_pnl5_Width = httpContext.cgiGet( "DVPANEL_PNL5_Width") ;
         Dvpanel_pnl5_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL5_Autowidth")) ;
         Dvpanel_pnl5_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL5_Autoheight")) ;
         Dvpanel_pnl5_Cls = httpContext.cgiGet( "DVPANEL_PNL5_Cls") ;
         Dvpanel_pnl5_Title = httpContext.cgiGet( "DVPANEL_PNL5_Title") ;
         Dvpanel_pnl5_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL5_Collapsible")) ;
         Dvpanel_pnl5_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL5_Collapsed")) ;
         Dvpanel_pnl5_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL5_Showcollapseicon")) ;
         Dvpanel_pnl5_Iconposition = httpContext.cgiGet( "DVPANEL_PNL5_Iconposition") ;
         Dvpanel_pnl5_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL5_Autoscroll")) ;
         Dvpanel_pnl4_Width = httpContext.cgiGet( "DVPANEL_PNL4_Width") ;
         Dvpanel_pnl4_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL4_Autowidth")) ;
         Dvpanel_pnl4_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL4_Autoheight")) ;
         Dvpanel_pnl4_Cls = httpContext.cgiGet( "DVPANEL_PNL4_Cls") ;
         Dvpanel_pnl4_Title = httpContext.cgiGet( "DVPANEL_PNL4_Title") ;
         Dvpanel_pnl4_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL4_Collapsible")) ;
         Dvpanel_pnl4_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL4_Collapsed")) ;
         Dvpanel_pnl4_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL4_Showcollapseicon")) ;
         Dvpanel_pnl4_Iconposition = httpContext.cgiGet( "DVPANEL_PNL4_Iconposition") ;
         Dvpanel_pnl4_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL4_Autoscroll")) ;
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
         Dvpanel_pnl2_Width = httpContext.cgiGet( "DVPANEL_PNL2_Width") ;
         Dvpanel_pnl2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL2_Autowidth")) ;
         Dvpanel_pnl2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL2_Autoheight")) ;
         Dvpanel_pnl2_Cls = httpContext.cgiGet( "DVPANEL_PNL2_Cls") ;
         Dvpanel_pnl2_Title = httpContext.cgiGet( "DVPANEL_PNL2_Title") ;
         Dvpanel_pnl2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL2_Collapsible")) ;
         Dvpanel_pnl2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL2_Collapsed")) ;
         Dvpanel_pnl2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL2_Showcollapseicon")) ;
         Dvpanel_pnl2_Iconposition = httpContext.cgiGet( "DVPANEL_PNL2_Iconposition") ;
         Dvpanel_pnl2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL2_Autoscroll")) ;
         Dvpanel_pnl3_Width = httpContext.cgiGet( "DVPANEL_PNL3_Width") ;
         Dvpanel_pnl3_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL3_Autowidth")) ;
         Dvpanel_pnl3_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL3_Autoheight")) ;
         Dvpanel_pnl3_Cls = httpContext.cgiGet( "DVPANEL_PNL3_Cls") ;
         Dvpanel_pnl3_Title = httpContext.cgiGet( "DVPANEL_PNL3_Title") ;
         Dvpanel_pnl3_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL3_Collapsible")) ;
         Dvpanel_pnl3_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL3_Collapsed")) ;
         Dvpanel_pnl3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL3_Showcollapseicon")) ;
         Dvpanel_pnl3_Iconposition = httpContext.cgiGet( "DVPANEL_PNL3_Iconposition") ;
         Dvpanel_pnl3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL3_Autoscroll")) ;
         /* Read variables values. */
         hV5CliCodIni = httpContext.cgiGet( edtavClicodini_Internalname) ;
         if ( (GXutil.strcmp("", hV5CliCodIni)==0) )
         {
            AV5CliCodIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5CliCodIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCodIni), 6, 0));
         }
         else
         {
            A279CliNom = hV5CliCodIni ;
            /* Using cursor H00DZ4 */
            pr_default.execute(2, new Object[] {A279CliNom});
            AV5CliCodIni = H00DZ4_A252CliCod[0] ;
            if ( ! ( (pr_default.getStatus(2) == 101) ) )
            {
               pr_default.readNext(2);
               if ( ! ( (pr_default.getStatus(2) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre Cliente", "")}), 1, "vCLICODINI");
                  GX_FocusControl = edtavClicodini_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(2);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV5CliCodIni", hV5CliCodIni);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFechaini_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHAINI");
            GX_FocusControl = edtavFechaini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7FechaIni = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7FechaIni", localUtil.format(AV7FechaIni, "99/99/99"));
         }
         else
         {
            AV7FechaIni = localUtil.ctod( httpContext.cgiGet( edtavFechaini_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7FechaIni", localUtil.format(AV7FechaIni, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFechafin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHAFIN");
            GX_FocusControl = edtavFechafin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8FechaFin = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8FechaFin", localUtil.format(AV8FechaFin, "99/99/99"));
         }
         else
         {
            AV8FechaFin = localUtil.ctod( httpContext.cgiGet( edtavFechafin_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8FechaFin", localUtil.format(AV8FechaFin, "99/99/99"));
         }
         cmbavHisestreo.setValue( httpContext.cgiGet( cmbavHisestreo.getInternalname()) );
         AV13HisEstReo = (byte)(GXutil.lval( httpContext.cgiGet( cmbavHisestreo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13HisEstReo", GXutil.str( AV13HisEstReo, 1, 0));
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
      e11DZ2 ();
      if (returnInSub) return;
   }

   public void e11DZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wpinfreoperados_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      wpinfreoperados_impl.this.AV10EmprCod = GXv_char2[0] ;
      wpinfreoperados_impl.this.AV11EmprNom = GXv_char3[0] ;
      wpinfreoperados_impl.this.AV12UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      GXt_char1 = AV9Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      wpinfreoperados_impl.this.GXt_char1 = GXv_char4[0] ;
      AV9Station = GXt_char1 ;
      GXv_char4[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char4, GXv_char3, GXv_char2) ;
      wpinfreoperados_impl.this.AV10EmprCod = GXv_char4[0] ;
      wpinfreoperados_impl.this.AV11EmprNom = GXv_char3[0] ;
      wpinfreoperados_impl.this.AV12UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcdefectosresumen = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcdefectosresumen_Component), GXutil.lower( "WCDefectosResumen")) != 0 )
      {
         WebComp_Wcwcdefectosresumen = WebUtils.getWebComponent(getClass(), "app.wcdefectosresumen_impl", remoteHandle, context);
         WebComp_Wcwcdefectosresumen_Component = "WCDefectosResumen" ;
      }
      if ( GXutil.len( WebComp_Wcwcdefectosresumen_Component) != 0 )
      {
         WebComp_Wcwcdefectosresumen.setjustcreated();
         WebComp_Wcwcdefectosresumen.componentprepare(new Object[] {"W0119","",AV10EmprCod,AV7FechaIni,AV8FechaFin,Integer.valueOf(AV5CliCodIni),Byte.valueOf(AV13HisEstReo)});
         WebComp_Wcwcdefectosresumen.componentbind(new Object[] {"","vFECHAINI","vFECHAFIN","vCLICODINI","vHISESTREO"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcreoperadosdetallequeryviewer = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcreoperadosdetallequeryviewer_Component), GXutil.lower( "WCReoperadosDetalleQueryViewer")) != 0 )
      {
         WebComp_Wcwcreoperadosdetallequeryviewer = WebUtils.getWebComponent(getClass(), "app.wcreoperadosdetallequeryviewer_impl", remoteHandle, context);
         WebComp_Wcwcreoperadosdetallequeryviewer_Component = "WCReoperadosDetalleQueryViewer" ;
      }
      if ( GXutil.len( WebComp_Wcwcreoperadosdetallequeryviewer_Component) != 0 )
      {
         WebComp_Wcwcreoperadosdetallequeryviewer.setjustcreated();
         WebComp_Wcwcreoperadosdetallequeryviewer.componentprepare(new Object[] {"W0110","",AV10EmprCod,AV7FechaIni,AV8FechaFin,Integer.valueOf(AV5CliCodIni),Integer.valueOf(AV14ClicodFin2),Byte.valueOf(AV13HisEstReo)});
         WebComp_Wcwcreoperadosdetallequeryviewer.componentbind(new Object[] {"","vFECHAINI","vFECHAFIN","vCLICODINI","","vHISESTREO"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcreoperadosdetallelist = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcreoperadosdetallelist_Component), GXutil.lower( "WCReoperadosDetalleList")) != 0 )
      {
         WebComp_Wcwcreoperadosdetallelist = WebUtils.getWebComponent(getClass(), "app.wcreoperadosdetallelist_impl", remoteHandle, context);
         WebComp_Wcwcreoperadosdetallelist_Component = "WCReoperadosDetalleList" ;
      }
      if ( GXutil.len( WebComp_Wcwcreoperadosdetallelist_Component) != 0 )
      {
         WebComp_Wcwcreoperadosdetallelist.setjustcreated();
         WebComp_Wcwcreoperadosdetallelist.componentprepare(new Object[] {"W0099","",AV10EmprCod,AV7FechaIni,AV8FechaFin,Integer.valueOf(AV5CliCodIni),Integer.valueOf(AV14ClicodFin2),Byte.valueOf(AV13HisEstReo)});
         WebComp_Wcwcreoperadosdetallelist.componentbind(new Object[] {"","vFECHAINI","vFECHAFIN","vCLICODINI","","vHISESTREO"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcmaquinasresumengooglechart = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcmaquinasresumengooglechart_Component), GXutil.lower( "WCMaquinasResumenGoogleChart")) != 0 )
      {
         WebComp_Wcwcmaquinasresumengooglechart = WebUtils.getWebComponent(getClass(), "app.wcmaquinasresumengooglechart_impl", remoteHandle, context);
         WebComp_Wcwcmaquinasresumengooglechart_Component = "WCMaquinasResumenGoogleChart" ;
      }
      if ( GXutil.len( WebComp_Wcwcmaquinasresumengooglechart_Component) != 0 )
      {
         WebComp_Wcwcmaquinasresumengooglechart.setjustcreated();
         WebComp_Wcwcmaquinasresumengooglechart.componentprepare(new Object[] {"W0090","",AV10EmprCod,AV7FechaIni,AV8FechaFin,Integer.valueOf(AV5CliCodIni),Byte.valueOf(AV13HisEstReo)});
         WebComp_Wcwcmaquinasresumengooglechart.componentbind(new Object[] {"","vFECHAINI","vFECHAFIN","vCLICODINI","vHISESTREO"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcdefectosresumengooglechart = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcdefectosresumengooglechart_Component), GXutil.lower( "WCDefectosResumenGoogleChart")) != 0 )
      {
         WebComp_Wcwcdefectosresumengooglechart = WebUtils.getWebComponent(getClass(), "app.wcdefectosresumengooglechart_impl", remoteHandle, context);
         WebComp_Wcwcdefectosresumengooglechart_Component = "WCDefectosResumenGoogleChart" ;
      }
      if ( GXutil.len( WebComp_Wcwcdefectosresumengooglechart_Component) != 0 )
      {
         WebComp_Wcwcdefectosresumengooglechart.setjustcreated();
         WebComp_Wcwcdefectosresumengooglechart.componentprepare(new Object[] {"W0082","",AV10EmprCod,AV7FechaIni,AV8FechaFin,Integer.valueOf(AV5CliCodIni),Integer.valueOf(AV14ClicodFin2),Byte.valueOf(AV13HisEstReo)});
         WebComp_Wcwcdefectosresumengooglechart.componentbind(new Object[] {"","vFECHAINI","vFECHAFIN","vCLICODINI","","vHISESTREO"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcclientesresumengooglechart = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcclientesresumengooglechart_Component), GXutil.lower( "WCClientesResumenGoogleChart")) != 0 )
      {
         WebComp_Wcwcclientesresumengooglechart = WebUtils.getWebComponent(getClass(), "app.wcclientesresumengooglechart_impl", remoteHandle, context);
         WebComp_Wcwcclientesresumengooglechart_Component = "WCClientesResumenGoogleChart" ;
      }
      if ( GXutil.len( WebComp_Wcwcclientesresumengooglechart_Component) != 0 )
      {
         WebComp_Wcwcclientesresumengooglechart.setjustcreated();
         WebComp_Wcwcclientesresumengooglechart.componentprepare(new Object[] {"W0070","",AV10EmprCod,AV7FechaIni,AV8FechaFin,Integer.valueOf(AV5CliCodIni),Byte.valueOf(AV13HisEstReo)});
         WebComp_Wcwcclientesresumengooglechart.componentbind(new Object[] {"","vFECHAINI","vFECHAFIN","vCLICODINI","vHISESTREO"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcclientesdefectosmaquinas = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcclientesdefectosmaquinas_Component), GXutil.lower( "WCClientesDefectosMaquinas")) != 0 )
      {
         WebComp_Wcwcclientesdefectosmaquinas = WebUtils.getWebComponent(getClass(), "app.wcclientesdefectosmaquinas_impl", remoteHandle, context);
         WebComp_Wcwcclientesdefectosmaquinas_Component = "WCClientesDefectosMaquinas" ;
      }
      if ( GXutil.len( WebComp_Wcwcclientesdefectosmaquinas_Component) != 0 )
      {
         WebComp_Wcwcclientesdefectosmaquinas.setjustcreated();
         WebComp_Wcwcclientesdefectosmaquinas.componentprepare(new Object[] {"W0061","",AV10EmprCod,AV7FechaIni,AV8FechaFin,Integer.valueOf(AV5CliCodIni),Integer.valueOf(AV14ClicodFin2),Byte.valueOf(AV13HisEstReo)});
         WebComp_Wcwcclientesdefectosmaquinas.componentbind(new Object[] {"","vFECHAINI","vFECHAFIN","vCLICODINI","","vHISESTREO"});
      }
   }

   public void e12DZ2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcclientesdefectosmaquinas = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcclientesdefectosmaquinas_Component), GXutil.lower( "WCClientesDefectosMaquinas")) != 0 )
      {
         WebComp_Wcwcclientesdefectosmaquinas = WebUtils.getWebComponent(getClass(), "app.wcclientesdefectosmaquinas_impl", remoteHandle, context);
         WebComp_Wcwcclientesdefectosmaquinas_Component = "WCClientesDefectosMaquinas" ;
      }
      if ( GXutil.len( WebComp_Wcwcclientesdefectosmaquinas_Component) != 0 )
      {
         WebComp_Wcwcclientesdefectosmaquinas.setjustcreated();
         WebComp_Wcwcclientesdefectosmaquinas.componentprepare(new Object[] {"W0061","",AV10EmprCod,AV7FechaIni,AV8FechaFin,Integer.valueOf(AV5CliCodIni),Integer.valueOf(AV5CliCodIni),Byte.valueOf(AV13HisEstReo)});
         WebComp_Wcwcclientesdefectosmaquinas.componentbind(new Object[] {"","vFECHAINI","vFECHAFIN","vCLICODINI","vCLICODINI","vHISESTREO"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcclientesdefectosmaquinas )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0061"+"");
         WebComp_Wcwcclientesdefectosmaquinas.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcmaquinasresumengooglechart = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcmaquinasresumengooglechart_Component), GXutil.lower( "WCMaquinasResumenGoogleChart")) != 0 )
      {
         WebComp_Wcwcmaquinasresumengooglechart = WebUtils.getWebComponent(getClass(), "app.wcmaquinasresumengooglechart_impl", remoteHandle, context);
         WebComp_Wcwcmaquinasresumengooglechart_Component = "WCMaquinasResumenGoogleChart" ;
      }
      if ( GXutil.len( WebComp_Wcwcmaquinasresumengooglechart_Component) != 0 )
      {
         WebComp_Wcwcmaquinasresumengooglechart.setjustcreated();
         WebComp_Wcwcmaquinasresumengooglechart.componentprepare(new Object[] {"W0090","",AV10EmprCod,AV7FechaIni,AV8FechaFin,Integer.valueOf(AV5CliCodIni),Byte.valueOf(AV13HisEstReo)});
         WebComp_Wcwcmaquinasresumengooglechart.componentbind(new Object[] {"","vFECHAINI","vFECHAFIN","vCLICODINI","vHISESTREO"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcmaquinasresumengooglechart )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0090"+"");
         WebComp_Wcwcmaquinasresumengooglechart.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcclientesresumengooglechart = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcclientesresumengooglechart_Component), GXutil.lower( "WCClientesResumenGoogleChart")) != 0 )
      {
         WebComp_Wcwcclientesresumengooglechart = WebUtils.getWebComponent(getClass(), "app.wcclientesresumengooglechart_impl", remoteHandle, context);
         WebComp_Wcwcclientesresumengooglechart_Component = "WCClientesResumenGoogleChart" ;
      }
      if ( GXutil.len( WebComp_Wcwcclientesresumengooglechart_Component) != 0 )
      {
         WebComp_Wcwcclientesresumengooglechart.setjustcreated();
         WebComp_Wcwcclientesresumengooglechart.componentprepare(new Object[] {"W0070","",AV10EmprCod,AV7FechaIni,AV8FechaFin,Integer.valueOf(AV5CliCodIni),Byte.valueOf(AV13HisEstReo)});
         WebComp_Wcwcclientesresumengooglechart.componentbind(new Object[] {"","vFECHAINI","vFECHAFIN","vCLICODINI","vHISESTREO"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcclientesresumengooglechart )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0070"+"");
         WebComp_Wcwcclientesresumengooglechart.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcdefectosresumengooglechart = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcdefectosresumengooglechart_Component), GXutil.lower( "WCDefectosResumenGoogleChart")) != 0 )
      {
         WebComp_Wcwcdefectosresumengooglechart = WebUtils.getWebComponent(getClass(), "app.wcdefectosresumengooglechart_impl", remoteHandle, context);
         WebComp_Wcwcdefectosresumengooglechart_Component = "WCDefectosResumenGoogleChart" ;
      }
      if ( GXutil.len( WebComp_Wcwcdefectosresumengooglechart_Component) != 0 )
      {
         WebComp_Wcwcdefectosresumengooglechart.setjustcreated();
         WebComp_Wcwcdefectosresumengooglechart.componentprepare(new Object[] {"W0082","",AV10EmprCod,AV7FechaIni,AV8FechaFin,Integer.valueOf(AV5CliCodIni),Integer.valueOf(AV5CliCodIni),Byte.valueOf(AV13HisEstReo)});
         WebComp_Wcwcdefectosresumengooglechart.componentbind(new Object[] {"","vFECHAINI","vFECHAFIN","vCLICODINI","vCLICODINI","vHISESTREO"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcdefectosresumengooglechart )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0082"+"");
         WebComp_Wcwcdefectosresumengooglechart.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcdefectosresumen = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcdefectosresumen_Component), GXutil.lower( "WCDefectosResumen")) != 0 )
      {
         WebComp_Wcwcdefectosresumen = WebUtils.getWebComponent(getClass(), "app.wcdefectosresumen_impl", remoteHandle, context);
         WebComp_Wcwcdefectosresumen_Component = "WCDefectosResumen" ;
      }
      if ( GXutil.len( WebComp_Wcwcdefectosresumen_Component) != 0 )
      {
         WebComp_Wcwcdefectosresumen.setjustcreated();
         WebComp_Wcwcdefectosresumen.componentprepare(new Object[] {"W0119","",AV10EmprCod,AV7FechaIni,AV8FechaFin,Integer.valueOf(AV5CliCodIni),Byte.valueOf(AV13HisEstReo)});
         WebComp_Wcwcdefectosresumen.componentbind(new Object[] {"","vFECHAINI","vFECHAFIN","vCLICODINI","vHISESTREO"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcdefectosresumen )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0119"+"");
         WebComp_Wcwcdefectosresumen.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcreoperadosdetallelist = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcreoperadosdetallelist_Component), GXutil.lower( "WCReoperadosDetalleList")) != 0 )
      {
         WebComp_Wcwcreoperadosdetallelist = WebUtils.getWebComponent(getClass(), "app.wcreoperadosdetallelist_impl", remoteHandle, context);
         WebComp_Wcwcreoperadosdetallelist_Component = "WCReoperadosDetalleList" ;
      }
      if ( GXutil.len( WebComp_Wcwcreoperadosdetallelist_Component) != 0 )
      {
         WebComp_Wcwcreoperadosdetallelist.setjustcreated();
         WebComp_Wcwcreoperadosdetallelist.componentprepare(new Object[] {"W0099","",AV10EmprCod,AV7FechaIni,AV8FechaFin,Integer.valueOf(AV5CliCodIni),Integer.valueOf(AV5CliCodIni),Byte.valueOf(AV13HisEstReo)});
         WebComp_Wcwcreoperadosdetallelist.componentbind(new Object[] {"","vFECHAINI","vFECHAFIN","vCLICODINI","vCLICODINI","vHISESTREO"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcreoperadosdetallelist )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0099"+"");
         WebComp_Wcwcreoperadosdetallelist.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcreoperadosdetallequeryviewer = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcreoperadosdetallequeryviewer_Component), GXutil.lower( "WCReoperadosDetalleQueryViewer")) != 0 )
      {
         WebComp_Wcwcreoperadosdetallequeryviewer = WebUtils.getWebComponent(getClass(), "app.wcreoperadosdetallequeryviewer_impl", remoteHandle, context);
         WebComp_Wcwcreoperadosdetallequeryviewer_Component = "WCReoperadosDetalleQueryViewer" ;
      }
      if ( GXutil.len( WebComp_Wcwcreoperadosdetallequeryviewer_Component) != 0 )
      {
         WebComp_Wcwcreoperadosdetallequeryviewer.setjustcreated();
         WebComp_Wcwcreoperadosdetallequeryviewer.componentprepare(new Object[] {"W0110","",AV10EmprCod,AV7FechaIni,AV8FechaFin,Integer.valueOf(AV5CliCodIni),Integer.valueOf(AV5CliCodIni),Byte.valueOf(AV13HisEstReo)});
         WebComp_Wcwcreoperadosdetallequeryviewer.componentbind(new Object[] {"","vFECHAINI","vFECHAFIN","vCLICODINI","vCLICODINI","vHISESTREO"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcreoperadosdetallequeryviewer )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0110"+"");
         WebComp_Wcwcreoperadosdetallequeryviewer.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   public void e13DZ2( )
   {
      /* Clicodini_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e14DZ2( )
   {
      /* Fechafin_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e15DZ2( )
   {
      /* Fechaini_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e16DZ2( )
   {
      /* Hisestreo_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   protected void nextLoad( )
   {
   }

   protected void e17DZ2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table3_104_DZ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPnl2_Internalname, tblPnl2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0110"+"", GXutil.rtrim( WebComp_Wcwcreoperadosdetallequeryviewer_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0110"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcreoperadosdetallequeryviewer_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcreoperadosdetallequeryviewer), GXutil.lower( WebComp_Wcwcreoperadosdetallequeryviewer_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0110"+"");
               }
               WebComp_Wcwcreoperadosdetallequeryviewer.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcreoperadosdetallequeryviewer), GXutil.lower( WebComp_Wcwcreoperadosdetallequeryviewer_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_104_DZ2e( true) ;
      }
      else
      {
         wb_table3_104_DZ2e( false) ;
      }
   }

   public void wb_table2_73_DZ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedpnl4_Internalname, tblTablemergedpnl4_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* User Defined Control */
         ucDvpanel_pnl4.setProperty("Width", Dvpanel_pnl4_Width);
         ucDvpanel_pnl4.setProperty("AutoWidth", Dvpanel_pnl4_Autowidth);
         ucDvpanel_pnl4.setProperty("AutoHeight", Dvpanel_pnl4_Autoheight);
         ucDvpanel_pnl4.setProperty("Cls", Dvpanel_pnl4_Cls);
         ucDvpanel_pnl4.setProperty("Title", Dvpanel_pnl4_Title);
         ucDvpanel_pnl4.setProperty("Collapsible", Dvpanel_pnl4_Collapsible);
         ucDvpanel_pnl4.setProperty("Collapsed", Dvpanel_pnl4_Collapsed);
         ucDvpanel_pnl4.setProperty("ShowCollapseIcon", Dvpanel_pnl4_Showcollapseicon);
         ucDvpanel_pnl4.setProperty("IconPosition", Dvpanel_pnl4_Iconposition);
         ucDvpanel_pnl4.setProperty("AutoScroll", Dvpanel_pnl4_Autoscroll);
         ucDvpanel_pnl4.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnl4_Internalname, "DVPANEL_PNL4Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNL4Container"+"pnl4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPnl4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0082"+"", GXutil.rtrim( WebComp_Wcwcdefectosresumengooglechart_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0082"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcdefectosresumengooglechart_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcdefectosresumengooglechart), GXutil.lower( WebComp_Wcwcdefectosresumengooglechart_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0082"+"");
               }
               WebComp_Wcwcdefectosresumengooglechart.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcdefectosresumengooglechart), GXutil.lower( WebComp_Wcwcdefectosresumengooglechart_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0090"+"", GXutil.rtrim( WebComp_Wcwcmaquinasresumengooglechart_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0090"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcmaquinasresumengooglechart_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcmaquinasresumengooglechart), GXutil.lower( WebComp_Wcwcmaquinasresumengooglechart_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0090"+"");
               }
               WebComp_Wcwcmaquinasresumengooglechart.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcmaquinasresumengooglechart), GXutil.lower( WebComp_Wcwcmaquinasresumengooglechart_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_73_DZ2e( true) ;
      }
      else
      {
         wb_table2_73_DZ2e( false) ;
      }
   }

   public void wb_table1_56_DZ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0061"+"", GXutil.rtrim( WebComp_Wcwcclientesdefectosmaquinas_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0061"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcclientesdefectosmaquinas_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcclientesdefectosmaquinas), GXutil.lower( WebComp_Wcwcclientesdefectosmaquinas_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0061"+"");
               }
               WebComp_Wcwcclientesdefectosmaquinas.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcclientesdefectosmaquinas), GXutil.lower( WebComp_Wcwcclientesdefectosmaquinas_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_56_DZ2e( true) ;
      }
      else
      {
         wb_table1_56_DZ2e( false) ;
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
      paDZ2( ) ;
      wsDZ2( ) ;
      weDZ2( ) ;
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
      if ( ! ( WebComp_Wcwcclientesdefectosmaquinas == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcclientesdefectosmaquinas_Component) != 0 )
         {
            WebComp_Wcwcclientesdefectosmaquinas.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcclientesresumengooglechart == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcclientesresumengooglechart_Component) != 0 )
         {
            WebComp_Wcwcclientesresumengooglechart.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcdefectosresumengooglechart == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcdefectosresumengooglechart_Component) != 0 )
         {
            WebComp_Wcwcdefectosresumengooglechart.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcmaquinasresumengooglechart == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcmaquinasresumengooglechart_Component) != 0 )
         {
            WebComp_Wcwcmaquinasresumengooglechart.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcreoperadosdetallelist == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcreoperadosdetallelist_Component) != 0 )
         {
            WebComp_Wcwcreoperadosdetallelist.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcreoperadosdetallequeryviewer == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcreoperadosdetallequeryviewer_Component) != 0 )
         {
            WebComp_Wcwcreoperadosdetallequeryviewer.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcdefectosresumen == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcdefectosresumen_Component) != 0 )
         {
            WebComp_Wcwcdefectosresumen.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101641536", true, true);
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
      httpContext.AddJavascriptSource("wpinfreoperados.js", "?20266101641536", false, true);
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
      lblTextblockclicodini_Internalname = "TEXTBLOCKCLICODINI" ;
      edtavClicodini_Internalname = "vCLICODINI" ;
      divUnnamedtableclicodini_Internalname = "UNNAMEDTABLECLICODINI" ;
      lblTextblockfechaini_Internalname = "TEXTBLOCKFECHAINI" ;
      edtavFechaini_Internalname = "vFECHAINI" ;
      divUnnamedtablefechaini_Internalname = "UNNAMEDTABLEFECHAINI" ;
      lblTextblockfechafin_Internalname = "TEXTBLOCKFECHAFIN" ;
      edtavFechafin_Internalname = "vFECHAFIN" ;
      divUnnamedtablefechafin_Internalname = "UNNAMEDTABLEFECHAFIN" ;
      lblTextblockhisestreo_Internalname = "TEXTBLOCKHISESTREO" ;
      cmbavHisestreo.setInternalname( "vHISESTREO" );
      divUnnamedtablehisestreo_Internalname = "UNNAMEDTABLEHISESTREO" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      tblUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      divPnl5_Internalname = "PNL5" ;
      Dvpanel_pnl5_Internalname = "DVPANEL_PNL5" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divPnl4_Internalname = "PNL4" ;
      Dvpanel_pnl4_Internalname = "DVPANEL_PNL4" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      tblTablemergedpnl4_Internalname = "TABLEMERGEDPNL4" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divPnl1_Internalname = "PNL1" ;
      Dvpanel_pnl1_Internalname = "DVPANEL_PNL1" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      tblPnl2_Internalname = "PNL2" ;
      Dvpanel_pnl2_Internalname = "DVPANEL_PNL2" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divPnl3_Internalname = "PNL3" ;
      Dvpanel_pnl3_Internalname = "DVPANEL_PNL3" ;
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
      cmbavHisestreo.setJsonclick( "" );
      cmbavHisestreo.setEnabled( 1 );
      edtavFechafin_Jsonclick = "" ;
      edtavFechafin_Enabled = 1 ;
      edtavFechaini_Jsonclick = "" ;
      edtavFechaini_Enabled = 1 ;
      edtavClicodini_Jsonclick = "" ;
      edtavClicodini_Enabled = 1 ;
      Dvpanel_pnl3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnl3_Iconposition = "Right" ;
      Dvpanel_pnl3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnl3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnl3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnl3_Title = httpContext.getMessage( "Defectos", "") ;
      Dvpanel_pnl3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnl3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnl3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnl3_Width = "100%" ;
      Dvpanel_pnl2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnl2_Iconposition = "Right" ;
      Dvpanel_pnl2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnl2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnl2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnl2_Title = httpContext.getMessage( "Detalle (Query Viewer)", "") ;
      Dvpanel_pnl2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnl2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnl2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnl2_Width = "100%" ;
      Dvpanel_pnl1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Iconposition = "Right" ;
      Dvpanel_pnl1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnl1_Title = httpContext.getMessage( "Detalle (List)", "") ;
      Dvpanel_pnl1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnl1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnl1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Width = "100%" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Maquinas (Google chart)", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_pnl4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnl4_Iconposition = "Right" ;
      Dvpanel_pnl4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnl4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnl4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnl4_Title = httpContext.getMessage( "Defectos (Google chart)", "") ;
      Dvpanel_pnl4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnl4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnl4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnl4_Width = "100%" ;
      Dvpanel_pnl5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnl5_Iconposition = "Right" ;
      Dvpanel_pnl5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnl5_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnl5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnl5_Title = httpContext.getMessage( "Clientes (Google chart)", "") ;
      Dvpanel_pnl5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnl5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnl5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnl5_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Clientes Maquinas Defectos", "") ;
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
      Form.setCaption( httpContext.getMessage( "Informes de Reoperados Internos, Externos", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavHisestreo.setName( "vHISESTREO" );
      cmbavHisestreo.setWebtags( "" );
      cmbavHisestreo.addItem("1", httpContext.getMessage( "NC", ""), (short)(0));
      cmbavHisestreo.addItem("2", httpContext.getMessage( "RC", ""), (short)(0));
      if ( cmbavHisestreo.getItemCount() > 0 )
      {
         AV13HisEstReo = (byte)(GXutil.lval( cmbavHisestreo.getValidValue(GXutil.trim( GXutil.str( AV13HisEstReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13HisEstReo", GXutil.str( AV13HisEstReo, 1, 0));
      }
      /* End function init_web_controls */
   }

   public void validv_Clicodini( )
   {
      if ( (GXutil.strcmp("", hV5CliCodIni)==0) )
      {
         AV5CliCodIni = 0 ;
      }
      else
      {
         A279CliNom = hV5CliCodIni ;
         /* Using cursor H00DZ5 */
         pr_default.execute(3, new Object[] {A279CliNom});
         AV5CliCodIni = H00DZ5_A252CliCod[0] ;
         if ( ! ( (pr_default.getStatus(3) == 101) ) )
         {
            pr_default.readNext(3);
            if ( ! ( (pr_default.getStatus(3) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre Cliente", "")}), 1, "vCLICODINI");
               GX_FocusControl = edtavClicodini_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(3);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV5CliCodIni", hV5CliCodIni);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV5CliCodIni", GXutil.ltrim( localUtil.ntoc( AV5CliCodIni, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV5CliCodIni", GXutil.rtrim( hV5CliCodIni));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV7FechaIni',fld:'vFECHAINI',pic:''},{av:'AV8FechaFin',fld:'vFECHAFIN',pic:''},{av:'AV5CliCodIni',fld:'vCLICODINI',pic:'ZZZZZ9'},{av:'cmbavHisestreo'},{av:'AV13HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{ctrl:'WCWCCLIENTESDEFECTOSMAQUINAS'},{ctrl:'WCWCMAQUINASRESUMENGOOGLECHART'},{ctrl:'WCWCCLIENTESRESUMENGOOGLECHART'},{ctrl:'WCWCDEFECTOSRESUMENGOOGLECHART'},{ctrl:'WCWCDEFECTOSRESUMEN'},{ctrl:'WCWCREOPERADOSDETALLELIST'},{ctrl:'WCWCREOPERADOSDETALLEQUERYVIEWER'}]}");
      setEventMetadata("VCLICODINI.CONTROLVALUECHANGED","{handler:'e13DZ2',iparms:[]");
      setEventMetadata("VCLICODINI.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VFECHAFIN.CONTROLVALUECHANGED","{handler:'e14DZ2',iparms:[]");
      setEventMetadata("VFECHAFIN.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VFECHAINI.CONTROLVALUECHANGED","{handler:'e15DZ2',iparms:[]");
      setEventMetadata("VFECHAINI.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VHISESTREO.CONTROLVALUECHANGED","{handler:'e16DZ2',iparms:[]");
      setEventMetadata("VHISESTREO.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VALIDV_CLICODINI","{handler:'validv_Clicodini',iparms:[{av:'hV5CliCodIni'},{av:'AV5CliCodIni',fld:'vCLICODINI',pic:'ZZZZZ9'}]");
      setEventMetadata("VALIDV_CLICODINI",",oparms:[{av:'AV5CliCodIni',fld:'vCLICODINI',pic:'ZZZZZ9'},{av:'hV5CliCodIni'}]}");
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
      A279CliNom = "" ;
      hV5CliCodIni = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV10EmprCod = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      lblTextblockclicodini_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblockfechaini_Jsonclick = "" ;
      AV7FechaIni = GXutil.nullDate() ;
      lblTextblockfechafin_Jsonclick = "" ;
      AV8FechaFin = GXutil.nullDate() ;
      lblTextblockhisestreo_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_pnl5 = new com.genexus.webpanels.GXUserControl();
      WebComp_Wcwcclientesresumengooglechart_Component = "" ;
      OldWcwcclientesresumengooglechart = "" ;
      ucDvpanel_pnl1 = new com.genexus.webpanels.GXUserControl();
      WebComp_Wcwcreoperadosdetallelist_Component = "" ;
      OldWcwcreoperadosdetallelist = "" ;
      ucDvpanel_pnl2 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_pnl3 = new com.genexus.webpanels.GXUserControl();
      WebComp_Wcwcdefectosresumen_Component = "" ;
      OldWcwcdefectosresumen = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      OldWcwcclientesdefectosmaquinas = "" ;
      WebComp_Wcwcclientesdefectosmaquinas_Component = "" ;
      OldWcwcdefectosresumengooglechart = "" ;
      WebComp_Wcwcdefectosresumengooglechart_Component = "" ;
      OldWcwcmaquinasresumengooglechart = "" ;
      WebComp_Wcwcmaquinasresumengooglechart_Component = "" ;
      OldWcwcreoperadosdetallequeryviewer = "" ;
      WebComp_Wcwcreoperadosdetallequeryviewer_Component = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l279CliNom = "" ;
      H00DZ2_A279CliNom = new String[] {""} ;
      H00DZ3_A279CliNom = new String[] {""} ;
      H00DZ3_A396EmprCod = new String[] {""} ;
      H00DZ3_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      H00DZ4_A279CliNom = new String[] {""} ;
      H00DZ4_A396EmprCod = new String[] {""} ;
      H00DZ4_A252CliCod = new int[1] ;
      AV9Station = "" ;
      AV11EmprNom = "" ;
      AV12UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      sStyleString = "" ;
      ucDvpanel_pnl4 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H00DZ5_A279CliNom = new String[] {""} ;
      H00DZ5_A396EmprCod = new String[] {""} ;
      H00DZ5_A252CliCod = new int[1] ;
      ZhV5CliCodIni = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wpinfreoperados__default(),
         new Object[] {
             new Object[] {
            H00DZ2_A279CliNom
            }
            , new Object[] {
            H00DZ3_A279CliNom, H00DZ3_A396EmprCod, H00DZ3_A252CliCod
            }
            , new Object[] {
            H00DZ4_A279CliNom, H00DZ4_A396EmprCod, H00DZ4_A252CliCod
            }
            , new Object[] {
            H00DZ5_A279CliNom, H00DZ5_A396EmprCod, H00DZ5_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Wcwcclientesdefectosmaquinas = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcclientesresumengooglechart = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcdefectosresumengooglechart = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcmaquinasresumengooglechart = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcreoperadosdetallelist = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcreoperadosdetallequeryviewer = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcdefectosresumen = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV13HisEstReo ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int AV5CliCodIni ;
   private int edtavClicodini_Enabled ;
   private int edtavFechaini_Enabled ;
   private int edtavFechafin_Enabled ;
   private int gxdynajaxindex ;
   private int A252CliCod ;
   private int AV14ClicodFin2 ;
   private int idxLst ;
   private int ZV5CliCodIni ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A279CliNom ;
   private String hV5CliCodIni ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV10EmprCod ;
   private String GXKey ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_pnl5_Width ;
   private String Dvpanel_pnl5_Cls ;
   private String Dvpanel_pnl5_Title ;
   private String Dvpanel_pnl5_Iconposition ;
   private String Dvpanel_pnl4_Width ;
   private String Dvpanel_pnl4_Cls ;
   private String Dvpanel_pnl4_Title ;
   private String Dvpanel_pnl4_Iconposition ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_pnl1_Width ;
   private String Dvpanel_pnl1_Cls ;
   private String Dvpanel_pnl1_Title ;
   private String Dvpanel_pnl1_Iconposition ;
   private String Dvpanel_pnl2_Width ;
   private String Dvpanel_pnl2_Cls ;
   private String Dvpanel_pnl2_Title ;
   private String Dvpanel_pnl2_Iconposition ;
   private String Dvpanel_pnl3_Width ;
   private String Dvpanel_pnl3_Cls ;
   private String Dvpanel_pnl3_Title ;
   private String Dvpanel_pnl3_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable11_Internalname ;
   private String divUnnamedtableclicodini_Internalname ;
   private String lblTextblockclicodini_Internalname ;
   private String lblTextblockclicodini_Jsonclick ;
   private String edtavClicodini_Internalname ;
   private String TempTags ;
   private String edtavClicodini_Jsonclick ;
   private String divUnnamedtablefechaini_Internalname ;
   private String lblTextblockfechaini_Internalname ;
   private String lblTextblockfechaini_Jsonclick ;
   private String edtavFechaini_Internalname ;
   private String edtavFechaini_Jsonclick ;
   private String divUnnamedtablefechafin_Internalname ;
   private String lblTextblockfechafin_Internalname ;
   private String lblTextblockfechafin_Jsonclick ;
   private String edtavFechafin_Internalname ;
   private String edtavFechafin_Jsonclick ;
   private String divUnnamedtablehisestreo_Internalname ;
   private String lblTextblockhisestreo_Internalname ;
   private String lblTextblockhisestreo_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String Dvpanel_pnl5_Internalname ;
   private String divPnl5_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String WebComp_Wcwcclientesresumengooglechart_Component ;
   private String OldWcwcclientesresumengooglechart ;
   private String Dvpanel_pnl1_Internalname ;
   private String divPnl1_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String WebComp_Wcwcreoperadosdetallelist_Component ;
   private String OldWcwcreoperadosdetallelist ;
   private String Dvpanel_pnl2_Internalname ;
   private String Dvpanel_pnl3_Internalname ;
   private String divPnl3_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String WebComp_Wcwcdefectosresumen_Component ;
   private String OldWcwcdefectosresumen ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String OldWcwcclientesdefectosmaquinas ;
   private String WebComp_Wcwcclientesdefectosmaquinas_Component ;
   private String OldWcwcdefectosresumengooglechart ;
   private String WebComp_Wcwcdefectosresumengooglechart_Component ;
   private String OldWcwcmaquinasresumengooglechart ;
   private String WebComp_Wcwcmaquinasresumengooglechart_Component ;
   private String OldWcwcreoperadosdetallequeryviewer ;
   private String WebComp_Wcwcreoperadosdetallequeryviewer_Component ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String l279CliNom ;
   private String A396EmprCod ;
   private String AV9Station ;
   private String AV11EmprNom ;
   private String AV12UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String sStyleString ;
   private String tblPnl2_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String tblTablemergedpnl4_Internalname ;
   private String Dvpanel_pnl4_Internalname ;
   private String divPnl4_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String tblUnnamedtable2_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String ZhV5CliCodIni ;
   private java.util.Date AV7FechaIni ;
   private java.util.Date AV8FechaFin ;
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
   private boolean Dvpanel_pnl5_Autowidth ;
   private boolean Dvpanel_pnl5_Autoheight ;
   private boolean Dvpanel_pnl5_Collapsible ;
   private boolean Dvpanel_pnl5_Collapsed ;
   private boolean Dvpanel_pnl5_Showcollapseicon ;
   private boolean Dvpanel_pnl5_Autoscroll ;
   private boolean Dvpanel_pnl4_Autowidth ;
   private boolean Dvpanel_pnl4_Autoheight ;
   private boolean Dvpanel_pnl4_Collapsible ;
   private boolean Dvpanel_pnl4_Collapsed ;
   private boolean Dvpanel_pnl4_Showcollapseicon ;
   private boolean Dvpanel_pnl4_Autoscroll ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Dvpanel_pnl1_Autowidth ;
   private boolean Dvpanel_pnl1_Autoheight ;
   private boolean Dvpanel_pnl1_Collapsible ;
   private boolean Dvpanel_pnl1_Collapsed ;
   private boolean Dvpanel_pnl1_Showcollapseicon ;
   private boolean Dvpanel_pnl1_Autoscroll ;
   private boolean Dvpanel_pnl2_Autowidth ;
   private boolean Dvpanel_pnl2_Autoheight ;
   private boolean Dvpanel_pnl2_Collapsible ;
   private boolean Dvpanel_pnl2_Collapsed ;
   private boolean Dvpanel_pnl2_Showcollapseicon ;
   private boolean Dvpanel_pnl2_Autoscroll ;
   private boolean Dvpanel_pnl3_Autowidth ;
   private boolean Dvpanel_pnl3_Autoheight ;
   private boolean Dvpanel_pnl3_Collapsible ;
   private boolean Dvpanel_pnl3_Collapsed ;
   private boolean Dvpanel_pnl3_Showcollapseicon ;
   private boolean Dvpanel_pnl3_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwcdefectosresumen ;
   private boolean bDynCreated_Wcwcreoperadosdetallequeryviewer ;
   private boolean bDynCreated_Wcwcreoperadosdetallelist ;
   private boolean bDynCreated_Wcwcmaquinasresumengooglechart ;
   private boolean bDynCreated_Wcwcdefectosresumengooglechart ;
   private boolean bDynCreated_Wcwcclientesresumengooglechart ;
   private boolean bDynCreated_Wcwcclientesdefectosmaquinas ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwcclientesdefectosmaquinas ;
   private GXWebComponent WebComp_Wcwcclientesresumengooglechart ;
   private GXWebComponent WebComp_Wcwcdefectosresumengooglechart ;
   private GXWebComponent WebComp_Wcwcmaquinasresumengooglechart ;
   private GXWebComponent WebComp_Wcwcreoperadosdetallelist ;
   private GXWebComponent WebComp_Wcwcreoperadosdetallequeryviewer ;
   private GXWebComponent WebComp_Wcwcdefectosresumen ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnl5 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnl1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnl2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnl3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnl4 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private HTMLChoice cmbavHisestreo ;
   private IDataStoreProvider pr_default ;
   private String[] H00DZ2_A279CliNom ;
   private String[] H00DZ3_A279CliNom ;
   private String[] H00DZ3_A396EmprCod ;
   private int[] H00DZ3_A252CliCod ;
   private String[] H00DZ4_A279CliNom ;
   private String[] H00DZ4_A396EmprCod ;
   private int[] H00DZ4_A252CliCod ;
   private String[] H00DZ5_A279CliNom ;
   private String[] H00DZ5_A396EmprCod ;
   private int[] H00DZ5_A252CliCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class wpinfreoperados__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00DZ2", "SELECT * FROM (SELECT DISTINCT CliNom FROM TXPCLIENT WHERE UPPER(CliNom) like '%' || UPPER(?) ORDER BY CliNom) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DZ3", "SELECT CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE CliNom = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DZ4", "SELECT CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE CliNom = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DZ5", "SELECT CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE CliNom = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setString(1, (String)parms[0], 30);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 30);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 30);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 30);
               return;
      }
   }

}

