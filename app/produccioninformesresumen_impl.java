package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class produccioninformesresumen_impl extends GXDataArea
{
   public produccioninformesresumen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public produccioninformesresumen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( produccioninformesresumen_impl.class ));
   }

   public produccioninformesresumen_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavTipoproduccion = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCODINI") == 0 )
         {
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodiniDI0( A602MaqCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCODFIN") == 0 )
         {
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodfinDI0( A602MaqCod) ;
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
      paDI2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startDI2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccioninformesresumen", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Emprcod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLFILTROS_Width", GXutil.rtrim( Dvpanel_pnlfiltros_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLFILTROS_Autowidth", GXutil.booltostr( Dvpanel_pnlfiltros_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLFILTROS_Autoheight", GXutil.booltostr( Dvpanel_pnlfiltros_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLFILTROS_Cls", GXutil.rtrim( Dvpanel_pnlfiltros_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLFILTROS_Title", GXutil.rtrim( Dvpanel_pnlfiltros_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLFILTROS_Collapsible", GXutil.booltostr( Dvpanel_pnlfiltros_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLFILTROS_Collapsed", GXutil.booltostr( Dvpanel_pnlfiltros_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLFILTROS_Showcollapseicon", GXutil.booltostr( Dvpanel_pnlfiltros_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLFILTROS_Iconposition", GXutil.rtrim( Dvpanel_pnlfiltros_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLFILTROS_Autoscroll", GXutil.booltostr( Dvpanel_pnlfiltros_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL_Width", GXutil.rtrim( Dvpanel_pnl_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL_Autowidth", GXutil.booltostr( Dvpanel_pnl_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL_Autoheight", GXutil.booltostr( Dvpanel_pnl_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL_Cls", GXutil.rtrim( Dvpanel_pnl_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL_Title", GXutil.rtrim( Dvpanel_pnl_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL_Collapsible", GXutil.booltostr( Dvpanel_pnl_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL_Collapsed", GXutil.booltostr( Dvpanel_pnl_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL_Showcollapseicon", GXutil.booltostr( Dvpanel_pnl_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL_Iconposition", GXutil.rtrim( Dvpanel_pnl_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL_Autoscroll", GXutil.booltostr( Dvpanel_pnl_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLLHIPROLIST_Width", GXutil.rtrim( Dvpanel_pnllhiprolist_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLLHIPROLIST_Autowidth", GXutil.booltostr( Dvpanel_pnllhiprolist_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLLHIPROLIST_Autoheight", GXutil.booltostr( Dvpanel_pnllhiprolist_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLLHIPROLIST_Cls", GXutil.rtrim( Dvpanel_pnllhiprolist_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLLHIPROLIST_Title", GXutil.rtrim( Dvpanel_pnllhiprolist_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLLHIPROLIST_Collapsible", GXutil.booltostr( Dvpanel_pnllhiprolist_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLLHIPROLIST_Collapsed", GXutil.booltostr( Dvpanel_pnllhiprolist_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLLHIPROLIST_Showcollapseicon", GXutil.booltostr( Dvpanel_pnllhiprolist_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLLHIPROLIST_Iconposition", GXutil.rtrim( Dvpanel_pnllhiprolist_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLLHIPROLIST_Autoscroll", GXutil.booltostr( Dvpanel_pnllhiprolist_Autoscroll));
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
      if ( ! ( WebComp_Wcwcproduccionresumenmaquinas == null ) )
      {
         WebComp_Wcwcproduccionresumenmaquinas.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcproduccionresumenmaquinasqueryviewer == null ) )
      {
         WebComp_Wcwcproduccionresumenmaquinasqueryviewer.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcproduccionresumenfasesqueryviewer == null ) )
      {
         WebComp_Wcwcproduccionresumenfasesqueryviewer.componentjscripts();
      }
      if ( ! ( WebComp_Wcwctbllhiproqueryviewer == null ) )
      {
         WebComp_Wcwctbllhiproqueryviewer.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcproduccionresumenmaquinaschar == null ) )
      {
         WebComp_Wcwcproduccionresumenmaquinaschar.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcproduccionresumenoperarioschar == null ) )
      {
         WebComp_Wcwcproduccionresumenoperarioschar.componentjscripts();
      }
      if ( ! ( WebComp_Wcwctbllhiprolist == null ) )
      {
         WebComp_Wcwctbllhiprolist.componentjscripts();
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
         weDI2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtDI2( ) ;
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
      return formatLink("app.produccioninformesresumen", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ProduccionInformesResumen" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Produccion Informes Resumen", "") ;
   }

   public void wbDI0( )
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
         ucDvpanel_pnlfiltros.setProperty("Width", Dvpanel_pnlfiltros_Width);
         ucDvpanel_pnlfiltros.setProperty("AutoWidth", Dvpanel_pnlfiltros_Autowidth);
         ucDvpanel_pnlfiltros.setProperty("AutoHeight", Dvpanel_pnlfiltros_Autoheight);
         ucDvpanel_pnlfiltros.setProperty("Cls", Dvpanel_pnlfiltros_Cls);
         ucDvpanel_pnlfiltros.setProperty("Title", Dvpanel_pnlfiltros_Title);
         ucDvpanel_pnlfiltros.setProperty("Collapsible", Dvpanel_pnlfiltros_Collapsible);
         ucDvpanel_pnlfiltros.setProperty("Collapsed", Dvpanel_pnlfiltros_Collapsed);
         ucDvpanel_pnlfiltros.setProperty("ShowCollapseIcon", Dvpanel_pnlfiltros_Showcollapseicon);
         ucDvpanel_pnlfiltros.setProperty("IconPosition", Dvpanel_pnlfiltros_Iconposition);
         ucDvpanel_pnlfiltros.setProperty("AutoScroll", Dvpanel_pnlfiltros_Autoscroll);
         ucDvpanel_pnlfiltros.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnlfiltros_Internalname, "DVPANEL_PNLFILTROSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNLFILTROSContainer"+"pnlfiltros"+"\" style=\"display:none;\">") ;
         wb_table1_17_DI2( true) ;
      }
      else
      {
         wb_table1_17_DI2( false) ;
      }
      return  ;
   }

   public void wb_table1_17_DI2e( boolean wbgen )
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
         wb_table2_67_DI2( true) ;
      }
      else
      {
         wb_table2_67_DI2( false) ;
      }
      return  ;
   }

   public void wb_table2_67_DI2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
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
         wb_table3_77_DI2( true) ;
      }
      else
      {
         wb_table3_77_DI2( false) ;
      }
      return  ;
   }

   public void wb_table3_77_DI2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
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
         wb_table4_87_DI2( true) ;
      }
      else
      {
         wb_table4_87_DI2( false) ;
      }
      return  ;
   }

   public void wb_table4_87_DI2e( boolean wbgen )
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
         ucDvpanel_pnl.setProperty("Width", Dvpanel_pnl_Width);
         ucDvpanel_pnl.setProperty("AutoWidth", Dvpanel_pnl_Autowidth);
         ucDvpanel_pnl.setProperty("AutoHeight", Dvpanel_pnl_Autoheight);
         ucDvpanel_pnl.setProperty("Cls", Dvpanel_pnl_Cls);
         ucDvpanel_pnl.setProperty("Title", Dvpanel_pnl_Title);
         ucDvpanel_pnl.setProperty("Collapsible", Dvpanel_pnl_Collapsible);
         ucDvpanel_pnl.setProperty("Collapsed", Dvpanel_pnl_Collapsed);
         ucDvpanel_pnl.setProperty("ShowCollapseIcon", Dvpanel_pnl_Showcollapseicon);
         ucDvpanel_pnl.setProperty("IconPosition", Dvpanel_pnl_Iconposition);
         ucDvpanel_pnl.setProperty("AutoScroll", Dvpanel_pnl_Autoscroll);
         ucDvpanel_pnl.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnl_Internalname, "DVPANEL_PNLContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNLContainer"+"pnl"+"\" style=\"display:none;\">") ;
         wb_table5_97_DI2( true) ;
      }
      else
      {
         wb_table5_97_DI2( false) ;
      }
      return  ;
   }

   public void wb_table5_97_DI2e( boolean wbgen )
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
         wb_table6_105_DI2( true) ;
      }
      else
      {
         wb_table6_105_DI2( false) ;
      }
      return  ;
   }

   public void wb_table6_105_DI2e( boolean wbgen )
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
         ucDvpanel_pnllhiprolist.setProperty("Width", Dvpanel_pnllhiprolist_Width);
         ucDvpanel_pnllhiprolist.setProperty("AutoWidth", Dvpanel_pnllhiprolist_Autowidth);
         ucDvpanel_pnllhiprolist.setProperty("AutoHeight", Dvpanel_pnllhiprolist_Autoheight);
         ucDvpanel_pnllhiprolist.setProperty("Cls", Dvpanel_pnllhiprolist_Cls);
         ucDvpanel_pnllhiprolist.setProperty("Title", Dvpanel_pnllhiprolist_Title);
         ucDvpanel_pnllhiprolist.setProperty("Collapsible", Dvpanel_pnllhiprolist_Collapsible);
         ucDvpanel_pnllhiprolist.setProperty("Collapsed", Dvpanel_pnllhiprolist_Collapsed);
         ucDvpanel_pnllhiprolist.setProperty("ShowCollapseIcon", Dvpanel_pnllhiprolist_Showcollapseicon);
         ucDvpanel_pnllhiprolist.setProperty("IconPosition", Dvpanel_pnllhiprolist_Iconposition);
         ucDvpanel_pnllhiprolist.setProperty("AutoScroll", Dvpanel_pnllhiprolist_Autoscroll);
         ucDvpanel_pnllhiprolist.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnllhiprolist_Internalname, "DVPANEL_PNLLHIPROLISTContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNLLHIPROLISTContainer"+"pnlLhiprolist"+"\" style=\"display:none;\">") ;
         wb_table7_129_DI2( true) ;
      }
      else
      {
         wb_table7_129_DI2( false) ;
      }
      return  ;
   }

   public void wb_table7_129_DI2e( boolean wbgen )
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

   public void startDI2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Produccion Informes Resumen", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupDI0( ) ;
   }

   public void wsDI2( )
   {
      startDI2( ) ;
      evtDI2( ) ;
   }

   public void evtDI2( )
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
                           e11DI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMAQCODINI.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12DI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMAQCODFIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13DI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFFIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14DI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFINICIO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15DI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTIPOPRODUCCION.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16DI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e17DI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e18DI2 ();
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
                     if ( nCmpId == 72 )
                     {
                        OldWcwcproduccionresumenmaquinas = httpContext.cgiGet( "W0072") ;
                        if ( ( GXutil.len( OldWcwcproduccionresumenmaquinas) == 0 ) || ( GXutil.strcmp(OldWcwcproduccionresumenmaquinas, WebComp_Wcwcproduccionresumenmaquinas_Component) != 0 ) )
                        {
                           WebComp_Wcwcproduccionresumenmaquinas = WebUtils.getWebComponent(getClass(), "app." + OldWcwcproduccionresumenmaquinas + "_impl", remoteHandle, context);
                           WebComp_Wcwcproduccionresumenmaquinas_Component = OldWcwcproduccionresumenmaquinas ;
                        }
                        if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinas_Component) != 0 )
                        {
                           WebComp_Wcwcproduccionresumenmaquinas.componentprocess("W0072", "", sEvt);
                        }
                        WebComp_Wcwcproduccionresumenmaquinas_Component = OldWcwcproduccionresumenmaquinas ;
                     }
                     else if ( nCmpId == 82 )
                     {
                        OldWcwcproduccionresumenmaquinasqueryviewer = httpContext.cgiGet( "W0082") ;
                        if ( ( GXutil.len( OldWcwcproduccionresumenmaquinasqueryviewer) == 0 ) || ( GXutil.strcmp(OldWcwcproduccionresumenmaquinasqueryviewer, WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component) != 0 ) )
                        {
                           WebComp_Wcwcproduccionresumenmaquinasqueryviewer = WebUtils.getWebComponent(getClass(), "app." + OldWcwcproduccionresumenmaquinasqueryviewer + "_impl", remoteHandle, context);
                           WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component = OldWcwcproduccionresumenmaquinasqueryviewer ;
                        }
                        if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component) != 0 )
                        {
                           WebComp_Wcwcproduccionresumenmaquinasqueryviewer.componentprocess("W0082", "", sEvt);
                        }
                        WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component = OldWcwcproduccionresumenmaquinasqueryviewer ;
                     }
                     else if ( nCmpId == 92 )
                     {
                        OldWcwcproduccionresumenfasesqueryviewer = httpContext.cgiGet( "W0092") ;
                        if ( ( GXutil.len( OldWcwcproduccionresumenfasesqueryviewer) == 0 ) || ( GXutil.strcmp(OldWcwcproduccionresumenfasesqueryviewer, WebComp_Wcwcproduccionresumenfasesqueryviewer_Component) != 0 ) )
                        {
                           WebComp_Wcwcproduccionresumenfasesqueryviewer = WebUtils.getWebComponent(getClass(), "app." + OldWcwcproduccionresumenfasesqueryviewer + "_impl", remoteHandle, context);
                           WebComp_Wcwcproduccionresumenfasesqueryviewer_Component = OldWcwcproduccionresumenfasesqueryviewer ;
                        }
                        if ( GXutil.len( WebComp_Wcwcproduccionresumenfasesqueryviewer_Component) != 0 )
                        {
                           WebComp_Wcwcproduccionresumenfasesqueryviewer.componentprocess("W0092", "", sEvt);
                        }
                        WebComp_Wcwcproduccionresumenfasesqueryviewer_Component = OldWcwcproduccionresumenfasesqueryviewer ;
                     }
                     else if ( nCmpId == 102 )
                     {
                        OldWcwctbllhiproqueryviewer = httpContext.cgiGet( "W0102") ;
                        if ( ( GXutil.len( OldWcwctbllhiproqueryviewer) == 0 ) || ( GXutil.strcmp(OldWcwctbllhiproqueryviewer, WebComp_Wcwctbllhiproqueryviewer_Component) != 0 ) )
                        {
                           WebComp_Wcwctbllhiproqueryviewer = WebUtils.getWebComponent(getClass(), "app." + OldWcwctbllhiproqueryviewer + "_impl", remoteHandle, context);
                           WebComp_Wcwctbllhiproqueryviewer_Component = OldWcwctbllhiproqueryviewer ;
                        }
                        if ( GXutil.len( WebComp_Wcwctbllhiproqueryviewer_Component) != 0 )
                        {
                           WebComp_Wcwctbllhiproqueryviewer.componentprocess("W0102", "", sEvt);
                        }
                        WebComp_Wcwctbllhiproqueryviewer_Component = OldWcwctbllhiproqueryviewer ;
                     }
                     else if ( nCmpId == 115 )
                     {
                        OldWcwcproduccionresumenmaquinaschar = httpContext.cgiGet( "W0115") ;
                        if ( ( GXutil.len( OldWcwcproduccionresumenmaquinaschar) == 0 ) || ( GXutil.strcmp(OldWcwcproduccionresumenmaquinaschar, WebComp_Wcwcproduccionresumenmaquinaschar_Component) != 0 ) )
                        {
                           WebComp_Wcwcproduccionresumenmaquinaschar = WebUtils.getWebComponent(getClass(), "app." + OldWcwcproduccionresumenmaquinaschar + "_impl", remoteHandle, context);
                           WebComp_Wcwcproduccionresumenmaquinaschar_Component = OldWcwcproduccionresumenmaquinaschar ;
                        }
                        if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinaschar_Component) != 0 )
                        {
                           WebComp_Wcwcproduccionresumenmaquinaschar.componentprocess("W0115", "", sEvt);
                        }
                        WebComp_Wcwcproduccionresumenmaquinaschar_Component = OldWcwcproduccionresumenmaquinaschar ;
                     }
                     else if ( nCmpId == 124 )
                     {
                        OldWcwcproduccionresumenoperarioschar = httpContext.cgiGet( "W0124") ;
                        if ( ( GXutil.len( OldWcwcproduccionresumenoperarioschar) == 0 ) || ( GXutil.strcmp(OldWcwcproduccionresumenoperarioschar, WebComp_Wcwcproduccionresumenoperarioschar_Component) != 0 ) )
                        {
                           WebComp_Wcwcproduccionresumenoperarioschar = WebUtils.getWebComponent(getClass(), "app." + OldWcwcproduccionresumenoperarioschar + "_impl", remoteHandle, context);
                           WebComp_Wcwcproduccionresumenoperarioschar_Component = OldWcwcproduccionresumenoperarioschar ;
                        }
                        if ( GXutil.len( WebComp_Wcwcproduccionresumenoperarioschar_Component) != 0 )
                        {
                           WebComp_Wcwcproduccionresumenoperarioschar.componentprocess("W0124", "", sEvt);
                        }
                        WebComp_Wcwcproduccionresumenoperarioschar_Component = OldWcwcproduccionresumenoperarioschar ;
                     }
                     else if ( nCmpId == 134 )
                     {
                        OldWcwctbllhiprolist = httpContext.cgiGet( "W0134") ;
                        if ( ( GXutil.len( OldWcwctbllhiprolist) == 0 ) || ( GXutil.strcmp(OldWcwctbllhiprolist, WebComp_Wcwctbllhiprolist_Component) != 0 ) )
                        {
                           WebComp_Wcwctbllhiprolist = WebUtils.getWebComponent(getClass(), "app." + OldWcwctbllhiprolist + "_impl", remoteHandle, context);
                           WebComp_Wcwctbllhiprolist_Component = OldWcwctbllhiprolist ;
                        }
                        if ( GXutil.len( WebComp_Wcwctbllhiprolist_Component) != 0 )
                        {
                           WebComp_Wcwctbllhiprolist.componentprocess("W0134", "", sEvt);
                        }
                        WebComp_Wcwctbllhiprolist_Component = OldWcwctbllhiprolist ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weDI2( )
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

   public void paDI2( )
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
            GX_FocusControl = edtavMaqcodini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvmaqcodiniDI0( String A602MaqCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmaqcodini_dataDI0( A602MaqCod) ;
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

   protected void gxsgvvmaqcodini_dataDI0( String A602MaqCod )
   {
      l602MaqCod = GXutil.padr( GXutil.rtrim( A602MaqCod), 6, "%") ;
      /* Using cursor H00DI2 */
      pr_default.execute(0, new Object[] {l602MaqCod});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00DI2_A602MaqCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00DI2_A602MaqCod[0]));
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvmaqcodfinDI0( String A602MaqCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmaqcodfin_dataDI0( A602MaqCod) ;
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

   protected void gxsgvvmaqcodfin_dataDI0( String A602MaqCod )
   {
      l602MaqCod = GXutil.padr( GXutil.rtrim( A602MaqCod), 6, "%") ;
      /* Using cursor H00DI3 */
      pr_default.execute(1, new Object[] {l602MaqCod});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H00DI3_A602MaqCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H00DI3_A602MaqCod[0]));
         pr_default.readNext(1);
      }
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
      if ( cmbavTipoproduccion.getItemCount() > 0 )
      {
         AV9TipoProduccion = (byte)(GXutil.lval( cmbavTipoproduccion.getValidValue(GXutil.trim( GXutil.str( AV9TipoProduccion, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9TipoProduccion", GXutil.str( AV9TipoProduccion, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTipoproduccion.setValue( GXutil.trim( GXutil.str( AV9TipoProduccion, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipoproduccion.getInternalname(), "Values", cmbavTipoproduccion.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfDI2( ) ;
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

   public void rfDI2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e17DI2 ();
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinas_Component) != 0 )
            {
               WebComp_Wcwcproduccionresumenmaquinas.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component) != 0 )
            {
               WebComp_Wcwcproduccionresumenmaquinasqueryviewer.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcproduccionresumenfasesqueryviewer_Component) != 0 )
            {
               WebComp_Wcwcproduccionresumenfasesqueryviewer.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwctbllhiproqueryviewer_Component) != 0 )
            {
               WebComp_Wcwctbllhiproqueryviewer.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinaschar_Component) != 0 )
            {
               WebComp_Wcwcproduccionresumenmaquinaschar.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcproduccionresumenoperarioschar_Component) != 0 )
            {
               WebComp_Wcwcproduccionresumenoperarioschar.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwctbllhiprolist_Component) != 0 )
            {
               WebComp_Wcwctbllhiprolist.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e18DI2 ();
         wbDI0( ) ;
      }
   }

   public void send_integrity_lvl_hashesDI2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Emprcod, "@!"))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupDI0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11DI2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_pnlfiltros_Width = httpContext.cgiGet( "DVPANEL_PNLFILTROS_Width") ;
         Dvpanel_pnlfiltros_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLFILTROS_Autowidth")) ;
         Dvpanel_pnlfiltros_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLFILTROS_Autoheight")) ;
         Dvpanel_pnlfiltros_Cls = httpContext.cgiGet( "DVPANEL_PNLFILTROS_Cls") ;
         Dvpanel_pnlfiltros_Title = httpContext.cgiGet( "DVPANEL_PNLFILTROS_Title") ;
         Dvpanel_pnlfiltros_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLFILTROS_Collapsible")) ;
         Dvpanel_pnlfiltros_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLFILTROS_Collapsed")) ;
         Dvpanel_pnlfiltros_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLFILTROS_Showcollapseicon")) ;
         Dvpanel_pnlfiltros_Iconposition = httpContext.cgiGet( "DVPANEL_PNLFILTROS_Iconposition") ;
         Dvpanel_pnlfiltros_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLFILTROS_Autoscroll")) ;
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
         Dvpanel_pnl_Width = httpContext.cgiGet( "DVPANEL_PNL_Width") ;
         Dvpanel_pnl_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL_Autowidth")) ;
         Dvpanel_pnl_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL_Autoheight")) ;
         Dvpanel_pnl_Cls = httpContext.cgiGet( "DVPANEL_PNL_Cls") ;
         Dvpanel_pnl_Title = httpContext.cgiGet( "DVPANEL_PNL_Title") ;
         Dvpanel_pnl_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL_Collapsible")) ;
         Dvpanel_pnl_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL_Collapsed")) ;
         Dvpanel_pnl_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL_Showcollapseicon")) ;
         Dvpanel_pnl_Iconposition = httpContext.cgiGet( "DVPANEL_PNL_Iconposition") ;
         Dvpanel_pnl_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL_Autoscroll")) ;
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
         Dvpanel_pnllhiprolist_Width = httpContext.cgiGet( "DVPANEL_PNLLHIPROLIST_Width") ;
         Dvpanel_pnllhiprolist_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLLHIPROLIST_Autowidth")) ;
         Dvpanel_pnllhiprolist_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLLHIPROLIST_Autoheight")) ;
         Dvpanel_pnllhiprolist_Cls = httpContext.cgiGet( "DVPANEL_PNLLHIPROLIST_Cls") ;
         Dvpanel_pnllhiprolist_Title = httpContext.cgiGet( "DVPANEL_PNLLHIPROLIST_Title") ;
         Dvpanel_pnllhiprolist_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLLHIPROLIST_Collapsible")) ;
         Dvpanel_pnllhiprolist_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLLHIPROLIST_Collapsed")) ;
         Dvpanel_pnllhiprolist_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLLHIPROLIST_Showcollapseicon")) ;
         Dvpanel_pnllhiprolist_Iconposition = httpContext.cgiGet( "DVPANEL_PNLLHIPROLIST_Iconposition") ;
         Dvpanel_pnllhiprolist_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLLHIPROLIST_Autoscroll")) ;
         /* Read variables values. */
         AV8MaqcodIni = httpContext.cgiGet( edtavMaqcodini_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8MaqcodIni", AV8MaqcodIni);
         AV7MaqcodFin = httpContext.cgiGet( edtavMaqcodfin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7MaqcodFin", AV7MaqcodFin);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavFinicio_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vFINICIO");
            GX_FocusControl = edtavFinicio_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6FInicio = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV6FInicio", localUtil.ttoc( AV6FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV6FInicio = localUtil.ctot( httpContext.cgiGet( edtavFinicio_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6FInicio", localUtil.ttoc( AV6FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavFfin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vFFIN");
            GX_FocusControl = edtavFfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5FFin = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV5FFin", localUtil.ttoc( AV5FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV5FFin = localUtil.ctot( httpContext.cgiGet( edtavFfin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5FFin", localUtil.ttoc( AV5FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         cmbavTipoproduccion.setValue( httpContext.cgiGet( cmbavTipoproduccion.getInternalname()) );
         AV9TipoProduccion = (byte)(GXutil.lval( httpContext.cgiGet( cmbavTipoproduccion.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9TipoProduccion", GXutil.str( AV9TipoProduccion, 1, 0));
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
      e11DI2 ();
      if (returnInSub) return;
   }

   public void e11DI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV11Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      produccioninformesresumen_impl.this.GXt_char1 = GXv_char2[0] ;
      AV11Station = GXt_char1 ;
      GXv_char2[0] = AV10Emprcod ;
      GXv_char3[0] = AV12EmprNom ;
      GXv_char4[0] = AV13UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char2, GXv_char3, GXv_char4) ;
      produccioninformesresumen_impl.this.AV10Emprcod = GXv_char2[0] ;
      produccioninformesresumen_impl.this.AV12EmprNom = GXv_char3[0] ;
      produccioninformesresumen_impl.this.AV13UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Emprcod", AV10Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Emprcod, "@!"))));
      AV9TipoProduccion = (byte)(9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9TipoProduccion", GXutil.str( AV9TipoProduccion, 1, 0));
      AV5FFin = GXutil.now( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5FFin", localUtil.ttoc( AV5FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV6FInicio = GXutil.addmth( AV5FFin, (short)(-1)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6FInicio", localUtil.ttoc( AV6FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      GXt_char1 = AV11Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      produccioninformesresumen_impl.this.GXt_char1 = GXv_char4[0] ;
      AV11Station = GXt_char1 ;
      GXv_char4[0] = AV10Emprcod ;
      GXv_char3[0] = AV12EmprNom ;
      GXv_char2[0] = AV13UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char4, GXv_char3, GXv_char2) ;
      produccioninformesresumen_impl.this.AV10Emprcod = GXv_char4[0] ;
      produccioninformesresumen_impl.this.AV12EmprNom = GXv_char3[0] ;
      produccioninformesresumen_impl.this.AV13UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Emprcod", AV10Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Emprcod, "@!"))));
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwctbllhiprolist = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwctbllhiprolist_Component), GXutil.lower( "WCtblLhiproList")) != 0 )
      {
         WebComp_Wcwctbllhiprolist = WebUtils.getWebComponent(getClass(), "app.wctbllhiprolist_impl", remoteHandle, context);
         WebComp_Wcwctbllhiprolist_Component = "WCtblLhiproList" ;
      }
      if ( GXutil.len( WebComp_Wcwctbllhiprolist_Component) != 0 )
      {
         WebComp_Wcwctbllhiprolist.setjustcreated();
         WebComp_Wcwctbllhiprolist.componentprepare(new Object[] {"W0134","",AV10Emprcod,AV8MaqcodIni,AV7MaqcodFin,AV6FInicio,AV5FFin,Byte.valueOf(AV9TipoProduccion)});
         WebComp_Wcwctbllhiprolist.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vFINICIO","vFFIN","vTIPOPRODUCCION"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcproduccionresumenoperarioschar = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionresumenoperarioschar_Component), GXutil.lower( "WCProduccionResumenOperariosChar")) != 0 )
      {
         WebComp_Wcwcproduccionresumenoperarioschar = WebUtils.getWebComponent(getClass(), "app.wcproduccionresumenoperarioschar_impl", remoteHandle, context);
         WebComp_Wcwcproduccionresumenoperarioschar_Component = "WCProduccionResumenOperariosChar" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionresumenoperarioschar_Component) != 0 )
      {
         WebComp_Wcwcproduccionresumenoperarioschar.setjustcreated();
         WebComp_Wcwcproduccionresumenoperarioschar.componentprepare(new Object[] {"W0124","",AV10Emprcod,AV8MaqcodIni,AV7MaqcodFin,AV6FInicio,AV5FFin,Byte.valueOf(AV9TipoProduccion)});
         WebComp_Wcwcproduccionresumenoperarioschar.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vFINICIO","vFFIN","vTIPOPRODUCCION"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcproduccionresumenmaquinaschar = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionresumenmaquinaschar_Component), GXutil.lower( "WCProduccionResumenMaquinasChar")) != 0 )
      {
         WebComp_Wcwcproduccionresumenmaquinaschar = WebUtils.getWebComponent(getClass(), "app.wcproduccionresumenmaquinaschar_impl", remoteHandle, context);
         WebComp_Wcwcproduccionresumenmaquinaschar_Component = "WCProduccionResumenMaquinasChar" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinaschar_Component) != 0 )
      {
         WebComp_Wcwcproduccionresumenmaquinaschar.setjustcreated();
         WebComp_Wcwcproduccionresumenmaquinaschar.componentprepare(new Object[] {"W0115","",AV10Emprcod,AV8MaqcodIni,AV7MaqcodFin,AV6FInicio,AV5FFin,Byte.valueOf(AV9TipoProduccion)});
         WebComp_Wcwcproduccionresumenmaquinaschar.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vFINICIO","vFFIN","vTIPOPRODUCCION"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwctbllhiproqueryviewer = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwctbllhiproqueryviewer_Component), GXutil.lower( "WCtblLhiproQueryViewer")) != 0 )
      {
         WebComp_Wcwctbllhiproqueryviewer = WebUtils.getWebComponent(getClass(), "app.wctbllhiproqueryviewer_impl", remoteHandle, context);
         WebComp_Wcwctbllhiproqueryviewer_Component = "WCtblLhiproQueryViewer" ;
      }
      if ( GXutil.len( WebComp_Wcwctbllhiproqueryviewer_Component) != 0 )
      {
         WebComp_Wcwctbllhiproqueryviewer.setjustcreated();
         WebComp_Wcwctbllhiproqueryviewer.componentprepare(new Object[] {"W0102","",AV10Emprcod,AV8MaqcodIni,AV7MaqcodFin,AV6FInicio,AV5FFin,Byte.valueOf(AV9TipoProduccion)});
         WebComp_Wcwctbllhiproqueryviewer.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vFINICIO","vFFIN","vTIPOPRODUCCION"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcproduccionresumenfasesqueryviewer = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionresumenfasesqueryviewer_Component), GXutil.lower( "WCProduccionResumenFasesQueryViewer")) != 0 )
      {
         WebComp_Wcwcproduccionresumenfasesqueryviewer = WebUtils.getWebComponent(getClass(), "app.wcproduccionresumenfasesqueryviewer_impl", remoteHandle, context);
         WebComp_Wcwcproduccionresumenfasesqueryviewer_Component = "WCProduccionResumenFasesQueryViewer" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionresumenfasesqueryviewer_Component) != 0 )
      {
         WebComp_Wcwcproduccionresumenfasesqueryviewer.setjustcreated();
         WebComp_Wcwcproduccionresumenfasesqueryviewer.componentprepare(new Object[] {"W0092","",AV10Emprcod,AV8MaqcodIni,AV7MaqcodFin,AV6FInicio,AV5FFin,Byte.valueOf(AV9TipoProduccion)});
         WebComp_Wcwcproduccionresumenfasesqueryviewer.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vFINICIO","vFFIN","vTIPOPRODUCCION"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcproduccionresumenmaquinasqueryviewer = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component), GXutil.lower( "WCProduccionResumenMaquinasQueryViewer")) != 0 )
      {
         WebComp_Wcwcproduccionresumenmaquinasqueryviewer = WebUtils.getWebComponent(getClass(), "app.wcproduccionresumenmaquinasqueryviewer_impl", remoteHandle, context);
         WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component = "WCProduccionResumenMaquinasQueryViewer" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component) != 0 )
      {
         WebComp_Wcwcproduccionresumenmaquinasqueryviewer.setjustcreated();
         WebComp_Wcwcproduccionresumenmaquinasqueryviewer.componentprepare(new Object[] {"W0082","",AV10Emprcod,AV8MaqcodIni,AV7MaqcodFin,AV6FInicio,AV5FFin,Byte.valueOf(AV9TipoProduccion)});
         WebComp_Wcwcproduccionresumenmaquinasqueryviewer.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vFINICIO","vFFIN","vTIPOPRODUCCION"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcproduccionresumenmaquinas = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionresumenmaquinas_Component), GXutil.lower( "WCProduccionResumenMaquinas")) != 0 )
      {
         WebComp_Wcwcproduccionresumenmaquinas = WebUtils.getWebComponent(getClass(), "app.wcproduccionresumenmaquinas_impl", remoteHandle, context);
         WebComp_Wcwcproduccionresumenmaquinas_Component = "WCProduccionResumenMaquinas" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinas_Component) != 0 )
      {
         WebComp_Wcwcproduccionresumenmaquinas.setjustcreated();
         WebComp_Wcwcproduccionresumenmaquinas.componentprepare(new Object[] {"W0072","",AV10Emprcod,AV8MaqcodIni,AV7MaqcodFin,AV6FInicio,AV5FFin,Byte.valueOf(AV9TipoProduccion)});
         WebComp_Wcwcproduccionresumenmaquinas.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vFINICIO","vFFIN","vTIPOPRODUCCION"});
      }
   }

   public void e12DI2( )
   {
      /* Maqcodini_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e13DI2( )
   {
      /* Maqcodfin_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e14DI2( )
   {
      /* Ffin_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e15DI2( )
   {
      /* Finicio_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e16DI2( )
   {
      /* Tipoproduccion_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
   }

   public void e17DI2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwctbllhiproqueryviewer = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwctbllhiproqueryviewer_Component), GXutil.lower( "WCtblLhiproQueryViewer")) != 0 )
      {
         WebComp_Wcwctbllhiproqueryviewer = WebUtils.getWebComponent(getClass(), "app.wctbllhiproqueryviewer_impl", remoteHandle, context);
         WebComp_Wcwctbllhiproqueryviewer_Component = "WCtblLhiproQueryViewer" ;
      }
      if ( GXutil.len( WebComp_Wcwctbllhiproqueryviewer_Component) != 0 )
      {
         WebComp_Wcwctbllhiproqueryviewer.setjustcreated();
         WebComp_Wcwctbllhiproqueryviewer.componentprepare(new Object[] {"W0102","",AV10Emprcod,AV8MaqcodIni,AV7MaqcodFin,AV6FInicio,AV5FFin,Byte.valueOf(AV9TipoProduccion)});
         WebComp_Wcwctbllhiproqueryviewer.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vFINICIO","vFFIN","vTIPOPRODUCCION"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwctbllhiproqueryviewer )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0102"+"");
         WebComp_Wcwctbllhiproqueryviewer.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwctbllhiprolist = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwctbllhiprolist_Component), GXutil.lower( "WCtblLhiproList")) != 0 )
      {
         WebComp_Wcwctbllhiprolist = WebUtils.getWebComponent(getClass(), "app.wctbllhiprolist_impl", remoteHandle, context);
         WebComp_Wcwctbllhiprolist_Component = "WCtblLhiproList" ;
      }
      if ( GXutil.len( WebComp_Wcwctbllhiprolist_Component) != 0 )
      {
         WebComp_Wcwctbllhiprolist.setjustcreated();
         WebComp_Wcwctbllhiprolist.componentprepare(new Object[] {"W0134","",AV10Emprcod,AV8MaqcodIni,AV7MaqcodFin,AV6FInicio,AV5FFin,Byte.valueOf(AV9TipoProduccion)});
         WebComp_Wcwctbllhiprolist.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vFINICIO","vFFIN","vTIPOPRODUCCION"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwctbllhiprolist )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0134"+"");
         WebComp_Wcwctbllhiprolist.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcproduccionresumenmaquinasqueryviewer = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component), GXutil.lower( "WCProduccionResumenMaquinasQueryViewer")) != 0 )
      {
         WebComp_Wcwcproduccionresumenmaquinasqueryviewer = WebUtils.getWebComponent(getClass(), "app.wcproduccionresumenmaquinasqueryviewer_impl", remoteHandle, context);
         WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component = "WCProduccionResumenMaquinasQueryViewer" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component) != 0 )
      {
         WebComp_Wcwcproduccionresumenmaquinasqueryviewer.setjustcreated();
         WebComp_Wcwcproduccionresumenmaquinasqueryviewer.componentprepare(new Object[] {"W0082","",AV10Emprcod,AV8MaqcodIni,AV7MaqcodFin,AV6FInicio,AV5FFin,Byte.valueOf(AV9TipoProduccion)});
         WebComp_Wcwcproduccionresumenmaquinasqueryviewer.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vFINICIO","vFFIN","vTIPOPRODUCCION"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcproduccionresumenmaquinasqueryviewer )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0082"+"");
         WebComp_Wcwcproduccionresumenmaquinasqueryviewer.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcproduccionresumenfasesqueryviewer = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionresumenfasesqueryviewer_Component), GXutil.lower( "WCProduccionResumenFasesQueryViewer")) != 0 )
      {
         WebComp_Wcwcproduccionresumenfasesqueryviewer = WebUtils.getWebComponent(getClass(), "app.wcproduccionresumenfasesqueryviewer_impl", remoteHandle, context);
         WebComp_Wcwcproduccionresumenfasesqueryviewer_Component = "WCProduccionResumenFasesQueryViewer" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionresumenfasesqueryviewer_Component) != 0 )
      {
         WebComp_Wcwcproduccionresumenfasesqueryviewer.setjustcreated();
         WebComp_Wcwcproduccionresumenfasesqueryviewer.componentprepare(new Object[] {"W0092","",AV10Emprcod,AV8MaqcodIni,AV7MaqcodFin,AV6FInicio,AV5FFin,Byte.valueOf(AV9TipoProduccion)});
         WebComp_Wcwcproduccionresumenfasesqueryviewer.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vFINICIO","vFFIN","vTIPOPRODUCCION"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcproduccionresumenfasesqueryviewer )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0092"+"");
         WebComp_Wcwcproduccionresumenfasesqueryviewer.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcproduccionresumenoperarioschar = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionresumenoperarioschar_Component), GXutil.lower( "WCProduccionResumenOperariosChar")) != 0 )
      {
         WebComp_Wcwcproduccionresumenoperarioschar = WebUtils.getWebComponent(getClass(), "app.wcproduccionresumenoperarioschar_impl", remoteHandle, context);
         WebComp_Wcwcproduccionresumenoperarioschar_Component = "WCProduccionResumenOperariosChar" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionresumenoperarioschar_Component) != 0 )
      {
         WebComp_Wcwcproduccionresumenoperarioschar.setjustcreated();
         WebComp_Wcwcproduccionresumenoperarioschar.componentprepare(new Object[] {"W0124","",AV10Emprcod,AV8MaqcodIni,AV7MaqcodFin,AV6FInicio,AV5FFin,Byte.valueOf(AV9TipoProduccion)});
         WebComp_Wcwcproduccionresumenoperarioschar.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vFINICIO","vFFIN","vTIPOPRODUCCION"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcproduccionresumenoperarioschar )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0124"+"");
         WebComp_Wcwcproduccionresumenoperarioschar.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcproduccionresumenmaquinaschar = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionresumenmaquinaschar_Component), GXutil.lower( "WCProduccionResumenMaquinasChar")) != 0 )
      {
         WebComp_Wcwcproduccionresumenmaquinaschar = WebUtils.getWebComponent(getClass(), "app.wcproduccionresumenmaquinaschar_impl", remoteHandle, context);
         WebComp_Wcwcproduccionresumenmaquinaschar_Component = "WCProduccionResumenMaquinasChar" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinaschar_Component) != 0 )
      {
         WebComp_Wcwcproduccionresumenmaquinaschar.setjustcreated();
         WebComp_Wcwcproduccionresumenmaquinaschar.componentprepare(new Object[] {"W0115","",AV10Emprcod,AV8MaqcodIni,AV7MaqcodFin,AV6FInicio,AV5FFin,Byte.valueOf(AV9TipoProduccion)});
         WebComp_Wcwcproduccionresumenmaquinaschar.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vFINICIO","vFFIN","vTIPOPRODUCCION"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcproduccionresumenmaquinaschar )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0115"+"");
         WebComp_Wcwcproduccionresumenmaquinaschar.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcproduccionresumenmaquinas = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproduccionresumenmaquinas_Component), GXutil.lower( "WCProduccionResumenMaquinas")) != 0 )
      {
         WebComp_Wcwcproduccionresumenmaquinas = WebUtils.getWebComponent(getClass(), "app.wcproduccionresumenmaquinas_impl", remoteHandle, context);
         WebComp_Wcwcproduccionresumenmaquinas_Component = "WCProduccionResumenMaquinas" ;
      }
      if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinas_Component) != 0 )
      {
         WebComp_Wcwcproduccionresumenmaquinas.setjustcreated();
         WebComp_Wcwcproduccionresumenmaquinas.componentprepare(new Object[] {"W0072","",AV10Emprcod,AV8MaqcodIni,AV7MaqcodFin,AV6FInicio,AV5FFin,Byte.valueOf(AV9TipoProduccion)});
         WebComp_Wcwcproduccionresumenmaquinas.componentbind(new Object[] {"","vMAQCODINI","vMAQCODFIN","vFINICIO","vFFIN","vTIPOPRODUCCION"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcproduccionresumenmaquinas )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0072"+"");
         WebComp_Wcwcproduccionresumenmaquinas.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e18DI2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table7_129_DI2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPnllhiprolist_Internalname, tblPnllhiprolist_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0134"+"", GXutil.rtrim( WebComp_Wcwctbllhiprolist_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0134"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwctbllhiprolist_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwctbllhiprolist), GXutil.lower( WebComp_Wcwctbllhiprolist_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0134"+"");
               }
               WebComp_Wcwctbllhiprolist.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwctbllhiprolist), GXutil.lower( WebComp_Wcwctbllhiprolist_Component)) != 0 )
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
         wb_table7_129_DI2e( true) ;
      }
      else
      {
         wb_table7_129_DI2e( false) ;
      }
   }

   public void wb_table6_105_DI2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedpnl2_Internalname, tblTablemergedpnl2_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
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
         wb_table8_110_DI2( true) ;
      }
      else
      {
         wb_table8_110_DI2( false) ;
      }
      return  ;
   }

   public void wb_table8_110_DI2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         wb_table9_119_DI2( true) ;
      }
      else
      {
         wb_table9_119_DI2( false) ;
      }
      return  ;
   }

   public void wb_table9_119_DI2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_105_DI2e( true) ;
      }
      else
      {
         wb_table6_105_DI2e( false) ;
      }
   }

   public void wb_table9_119_DI2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable3_Internalname, tblUnnamedtable3_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0124"+"", GXutil.rtrim( WebComp_Wcwcproduccionresumenoperarioschar_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0124"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcproduccionresumenoperarioschar_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionresumenoperarioschar), GXutil.lower( WebComp_Wcwcproduccionresumenoperarioschar_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0124"+"");
               }
               WebComp_Wcwcproduccionresumenoperarioschar.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionresumenoperarioschar), GXutil.lower( WebComp_Wcwcproduccionresumenoperarioschar_Component)) != 0 )
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
         wb_table9_119_DI2e( true) ;
      }
      else
      {
         wb_table9_119_DI2e( false) ;
      }
   }

   public void wb_table8_110_DI2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPnl2_Internalname, tblPnl2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0115"+"", GXutil.rtrim( WebComp_Wcwcproduccionresumenmaquinaschar_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0115"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinaschar_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionresumenmaquinaschar), GXutil.lower( WebComp_Wcwcproduccionresumenmaquinaschar_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0115"+"");
               }
               WebComp_Wcwcproduccionresumenmaquinaschar.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionresumenmaquinaschar), GXutil.lower( WebComp_Wcwcproduccionresumenmaquinaschar_Component)) != 0 )
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
         wb_table8_110_DI2e( true) ;
      }
      else
      {
         wb_table8_110_DI2e( false) ;
      }
   }

   public void wb_table5_97_DI2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPnl_Internalname, tblPnl_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0102"+"", GXutil.rtrim( WebComp_Wcwctbllhiproqueryviewer_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0102"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwctbllhiproqueryviewer_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwctbllhiproqueryviewer), GXutil.lower( WebComp_Wcwctbllhiproqueryviewer_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0102"+"");
               }
               WebComp_Wcwctbllhiproqueryviewer.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwctbllhiproqueryviewer), GXutil.lower( WebComp_Wcwctbllhiproqueryviewer_Component)) != 0 )
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
         wb_table5_97_DI2e( true) ;
      }
      else
      {
         wb_table5_97_DI2e( false) ;
      }
   }

   public void wb_table4_87_DI2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0092"+"", GXutil.rtrim( WebComp_Wcwcproduccionresumenfasesqueryviewer_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0092"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcproduccionresumenfasesqueryviewer_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionresumenfasesqueryviewer), GXutil.lower( WebComp_Wcwcproduccionresumenfasesqueryviewer_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0092"+"");
               }
               WebComp_Wcwcproduccionresumenfasesqueryviewer.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionresumenfasesqueryviewer), GXutil.lower( WebComp_Wcwcproduccionresumenfasesqueryviewer_Component)) != 0 )
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
         wb_table4_87_DI2e( true) ;
      }
      else
      {
         wb_table4_87_DI2e( false) ;
      }
   }

   public void wb_table3_77_DI2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0082"+"", GXutil.rtrim( WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0082"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionresumenmaquinasqueryviewer), GXutil.lower( WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0082"+"");
               }
               WebComp_Wcwcproduccionresumenmaquinasqueryviewer.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionresumenmaquinasqueryviewer), GXutil.lower( WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component)) != 0 )
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
         wb_table3_77_DI2e( true) ;
      }
      else
      {
         wb_table3_77_DI2e( false) ;
      }
   }

   public void wb_table2_67_DI2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPnl1_Internalname, tblPnl1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0072"+"", GXutil.rtrim( WebComp_Wcwcproduccionresumenmaquinas_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0072"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinas_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionresumenmaquinas), GXutil.lower( WebComp_Wcwcproduccionresumenmaquinas_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0072"+"");
               }
               WebComp_Wcwcproduccionresumenmaquinas.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcproduccionresumenmaquinas), GXutil.lower( WebComp_Wcwcproduccionresumenmaquinas_Component)) != 0 )
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
         wb_table2_67_DI2e( true) ;
      }
      else
      {
         wb_table2_67_DI2e( false) ;
      }
   }

   public void wb_table1_17_DI2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPnlfiltros_Internalname, tblPnlfiltros_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablemaqcodini_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmaqcodini_Internalname, httpContext.getMessage( "Maquinas", ""), "", "", lblTextblockmaqcodini_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionInformesResumen.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcodini_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcodini_Internalname, GXutil.rtrim( AV8MaqcodIni), GXutil.rtrim( localUtil.format( AV8MaqcodIni, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcodini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcodini_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_ProduccionInformesResumen.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablemaqcodfin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmaqcodfin_Internalname, "", "", "", lblTextblockmaqcodfin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionInformesResumen.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcodfin_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcodfin_Internalname, GXutil.rtrim( AV7MaqcodFin), GXutil.rtrim( localUtil.format( AV7MaqcodFin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcodfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcodfin_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_ProduccionInformesResumen.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablefinicio_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfinicio_Internalname, httpContext.getMessage( "Inicio", ""), "", "", lblTextblockfinicio_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionInformesResumen.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFinicio_Internalname, httpContext.getMessage( "Inicio", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFinicio_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFinicio_Internalname, localUtil.ttoc( AV6FInicio, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV6FInicio, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFinicio_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFinicio_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ProduccionInformesResumen.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFinicio_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFinicio_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ProduccionInformesResumen.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableffin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockffin_Internalname, httpContext.getMessage( "Fin", ""), "", "", lblTextblockffin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionInformesResumen.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFfin_Internalname, httpContext.getMessage( "Fin", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFfin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFfin_Internalname, localUtil.ttoc( AV5FFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV5FFin, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFfin_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ProduccionInformesResumen.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFfin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFfin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ProduccionInformesResumen.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletipoproduccion_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktipoproduccion_Internalname, httpContext.getMessage( "Tipo Produccion", ""), "", "", lblTextblocktipoproduccion_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ProduccionInformesResumen.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavTipoproduccion.getInternalname(), httpContext.getMessage( "Estado Reoperado", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTipoproduccion, cmbavTipoproduccion.getInternalname(), GXutil.trim( GXutil.str( AV9TipoProduccion, 1, 0)), 1, cmbavTipoproduccion.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavTipoproduccion.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"", "", true, (byte)(0), "HLP_ProduccionInformesResumen.htm");
         cmbavTipoproduccion.setValue( GXutil.trim( GXutil.str( AV9TipoProduccion, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipoproduccion.getInternalname(), "Values", cmbavTipoproduccion.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_17_DI2e( true) ;
      }
      else
      {
         wb_table1_17_DI2e( false) ;
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
      paDI2( ) ;
      wsDI2( ) ;
      weDI2( ) ;
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
      if ( ! ( WebComp_Wcwcproduccionresumenmaquinas == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinas_Component) != 0 )
         {
            WebComp_Wcwcproduccionresumenmaquinas.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcproduccionresumenmaquinasqueryviewer == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component) != 0 )
         {
            WebComp_Wcwcproduccionresumenmaquinasqueryviewer.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcproduccionresumenfasesqueryviewer == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcproduccionresumenfasesqueryviewer_Component) != 0 )
         {
            WebComp_Wcwcproduccionresumenfasesqueryviewer.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwctbllhiproqueryviewer == null ) )
      {
         if ( GXutil.len( WebComp_Wcwctbllhiproqueryviewer_Component) != 0 )
         {
            WebComp_Wcwctbllhiproqueryviewer.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcproduccionresumenmaquinaschar == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcproduccionresumenmaquinaschar_Component) != 0 )
         {
            WebComp_Wcwcproduccionresumenmaquinaschar.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcproduccionresumenoperarioschar == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcproduccionresumenoperarioschar_Component) != 0 )
         {
            WebComp_Wcwcproduccionresumenoperarioschar.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwctbllhiprolist == null ) )
      {
         if ( GXutil.len( WebComp_Wcwctbllhiprolist_Component) != 0 )
         {
            WebComp_Wcwctbllhiprolist.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101641398", true, true);
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
      httpContext.AddJavascriptSource("produccioninformesresumen.js", "?20266101641399", false, true);
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
      lblTextblockmaqcodini_Internalname = "TEXTBLOCKMAQCODINI" ;
      edtavMaqcodini_Internalname = "vMAQCODINI" ;
      divUnnamedtablemaqcodini_Internalname = "UNNAMEDTABLEMAQCODINI" ;
      lblTextblockmaqcodfin_Internalname = "TEXTBLOCKMAQCODFIN" ;
      edtavMaqcodfin_Internalname = "vMAQCODFIN" ;
      divUnnamedtablemaqcodfin_Internalname = "UNNAMEDTABLEMAQCODFIN" ;
      lblTextblockfinicio_Internalname = "TEXTBLOCKFINICIO" ;
      edtavFinicio_Internalname = "vFINICIO" ;
      divUnnamedtablefinicio_Internalname = "UNNAMEDTABLEFINICIO" ;
      lblTextblockffin_Internalname = "TEXTBLOCKFFIN" ;
      edtavFfin_Internalname = "vFFIN" ;
      divUnnamedtableffin_Internalname = "UNNAMEDTABLEFFIN" ;
      lblTextblocktipoproduccion_Internalname = "TEXTBLOCKTIPOPRODUCCION" ;
      cmbavTipoproduccion.setInternalname( "vTIPOPRODUCCION" );
      divUnnamedtabletipoproduccion_Internalname = "UNNAMEDTABLETIPOPRODUCCION" ;
      divUnnamedtable12_Internalname = "UNNAMEDTABLE12" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      tblPnlfiltros_Internalname = "PNLFILTROS" ;
      Dvpanel_pnlfiltros_Internalname = "DVPANEL_PNLFILTROS" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      tblPnl1_Internalname = "PNL1" ;
      Dvpanel_pnl1_Internalname = "DVPANEL_PNL1" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      tblUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      tblPnl_Internalname = "PNL" ;
      Dvpanel_pnl_Internalname = "DVPANEL_PNL" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      tblPnl2_Internalname = "PNL2" ;
      Dvpanel_pnl2_Internalname = "DVPANEL_PNL2" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      tblUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      tblTablemergedpnl2_Internalname = "TABLEMERGEDPNL2" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      tblPnllhiprolist_Internalname = "PNLLHIPROLIST" ;
      Dvpanel_pnllhiprolist_Internalname = "DVPANEL_PNLLHIPROLIST" ;
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
      cmbavTipoproduccion.setJsonclick( "" );
      cmbavTipoproduccion.setEnabled( 1 );
      edtavFfin_Jsonclick = "" ;
      edtavFfin_Enabled = 1 ;
      edtavFinicio_Jsonclick = "" ;
      edtavFinicio_Enabled = 1 ;
      edtavMaqcodfin_Jsonclick = "" ;
      edtavMaqcodfin_Enabled = 1 ;
      edtavMaqcodini_Jsonclick = "" ;
      edtavMaqcodini_Enabled = 1 ;
      Dvpanel_pnllhiprolist_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnllhiprolist_Iconposition = "Right" ;
      Dvpanel_pnllhiprolist_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnllhiprolist_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnllhiprolist_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnllhiprolist_Title = httpContext.getMessage( "Detalle Produccion (list)", "") ;
      Dvpanel_pnllhiprolist_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnllhiprolist_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnllhiprolist_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnllhiprolist_Width = "100%" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Operarios (Google Charts)", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_pnl2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnl2_Iconposition = "Right" ;
      Dvpanel_pnl2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnl2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnl2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnl2_Title = httpContext.getMessage( "Maquinas (Google Charts)", "") ;
      Dvpanel_pnl2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnl2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnl2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnl2_Width = "100%" ;
      Dvpanel_pnl_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnl_Iconposition = "Right" ;
      Dvpanel_pnl_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnl_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnl_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnl_Title = httpContext.getMessage( "Detalle Produccion ( Query Viewer)", "") ;
      Dvpanel_pnl_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnl_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnl_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnl_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Fases (Query Viewer)", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Maquinas (Query Viewer)", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Dvpanel_pnl1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Iconposition = "Right" ;
      Dvpanel_pnl1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnl1_Title = httpContext.getMessage( "Resumen Maquinas (list)", "") ;
      Dvpanel_pnl1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnl1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnl1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Width = "100%" ;
      Dvpanel_pnlfiltros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnlfiltros_Iconposition = "Right" ;
      Dvpanel_pnlfiltros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnlfiltros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnlfiltros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnlfiltros_Title = httpContext.getMessage( "Filtros", "") ;
      Dvpanel_pnlfiltros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnlfiltros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnlfiltros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnlfiltros_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Produccion Informes Resumen", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavTipoproduccion.setName( "vTIPOPRODUCCION" );
      cmbavTipoproduccion.setWebtags( "" );
      cmbavTipoproduccion.addItem("9", httpContext.getMessage( "Produccion General", ""), (short)(0));
      cmbavTipoproduccion.addItem("0", httpContext.getMessage( "Produccion Normal", ""), (short)(0));
      cmbavTipoproduccion.addItem("1", httpContext.getMessage( "Produccion Reoperado Interno", ""), (short)(0));
      cmbavTipoproduccion.addItem("2", httpContext.getMessage( "Produccion Reoperado Externo", ""), (short)(0));
      if ( cmbavTipoproduccion.getItemCount() > 0 )
      {
         AV9TipoProduccion = (byte)(GXutil.lval( cmbavTipoproduccion.getValidValue(GXutil.trim( GXutil.str( AV9TipoProduccion, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9TipoProduccion", GXutil.str( AV9TipoProduccion, 1, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV8MaqcodIni',fld:'vMAQCODINI',pic:''},{av:'AV7MaqcodFin',fld:'vMAQCODFIN',pic:''},{av:'AV6FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99'},{av:'AV5FFin',fld:'vFFIN',pic:'99/99/99 99:99:99'},{av:'cmbavTipoproduccion'},{av:'AV9TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9'},{av:'AV10Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{ctrl:'WCWCTBLLHIPROQUERYVIEWER'},{ctrl:'WCWCTBLLHIPROLIST'},{ctrl:'WCWCPRODUCCIONRESUMENMAQUINASQUERYVIEWER'},{ctrl:'WCWCPRODUCCIONRESUMENFASESQUERYVIEWER'},{ctrl:'WCWCPRODUCCIONRESUMENOPERARIOSCHAR'},{ctrl:'WCWCPRODUCCIONRESUMENMAQUINASCHAR'},{ctrl:'WCWCPRODUCCIONRESUMENMAQUINAS'}]}");
      setEventMetadata("VMAQCODINI.CONTROLVALUECHANGED","{handler:'e12DI2',iparms:[]");
      setEventMetadata("VMAQCODINI.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VMAQCODFIN.CONTROLVALUECHANGED","{handler:'e13DI2',iparms:[]");
      setEventMetadata("VMAQCODFIN.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VFFIN.CONTROLVALUECHANGED","{handler:'e14DI2',iparms:[]");
      setEventMetadata("VFFIN.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VFINICIO.CONTROLVALUECHANGED","{handler:'e15DI2',iparms:[]");
      setEventMetadata("VFINICIO.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("VTIPOPRODUCCION.CONTROLVALUECHANGED","{handler:'e16DI2',iparms:[]");
      setEventMetadata("VTIPOPRODUCCION.CONTROLVALUECHANGED",",oparms:[]}");
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
      A602MaqCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV10Emprcod = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_pnlfiltros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_pnl1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_pnl = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_pnllhiprolist = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      OldWcwcproduccionresumenmaquinas = "" ;
      WebComp_Wcwcproduccionresumenmaquinas_Component = "" ;
      OldWcwcproduccionresumenmaquinasqueryviewer = "" ;
      WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component = "" ;
      OldWcwcproduccionresumenfasesqueryviewer = "" ;
      WebComp_Wcwcproduccionresumenfasesqueryviewer_Component = "" ;
      OldWcwctbllhiproqueryviewer = "" ;
      WebComp_Wcwctbllhiproqueryviewer_Component = "" ;
      OldWcwcproduccionresumenmaquinaschar = "" ;
      WebComp_Wcwcproduccionresumenmaquinaschar_Component = "" ;
      OldWcwcproduccionresumenoperarioschar = "" ;
      WebComp_Wcwcproduccionresumenoperarioschar_Component = "" ;
      OldWcwctbllhiprolist = "" ;
      WebComp_Wcwctbllhiprolist_Component = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l602MaqCod = "" ;
      H00DI2_A602MaqCod = new String[] {""} ;
      H00DI3_A602MaqCod = new String[] {""} ;
      AV8MaqcodIni = "" ;
      AV7MaqcodFin = "" ;
      AV6FInicio = GXutil.resetTime( GXutil.nullDate() );
      AV5FFin = GXutil.resetTime( GXutil.nullDate() );
      AV11Station = "" ;
      AV12EmprNom = "" ;
      AV13UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      sStyleString = "" ;
      ucDvpanel_pnl2 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      lblTextblockmaqcodini_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblockmaqcodfin_Jsonclick = "" ;
      lblTextblockfinicio_Jsonclick = "" ;
      lblTextblockffin_Jsonclick = "" ;
      lblTextblocktipoproduccion_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccioninformesresumen__default(),
         new Object[] {
             new Object[] {
            H00DI2_A602MaqCod
            }
            , new Object[] {
            H00DI3_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Wcwcproduccionresumenmaquinas = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcproduccionresumenmaquinasqueryviewer = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcproduccionresumenfasesqueryviewer = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwctbllhiproqueryviewer = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcproduccionresumenmaquinaschar = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcproduccionresumenoperarioschar = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwctbllhiprolist = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV9TipoProduccion ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int gxdynajaxindex ;
   private int edtavMaqcodini_Enabled ;
   private int edtavMaqcodfin_Enabled ;
   private int edtavFinicio_Enabled ;
   private int edtavFfin_Enabled ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A602MaqCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV10Emprcod ;
   private String GXKey ;
   private String Dvpanel_pnlfiltros_Width ;
   private String Dvpanel_pnlfiltros_Cls ;
   private String Dvpanel_pnlfiltros_Title ;
   private String Dvpanel_pnlfiltros_Iconposition ;
   private String Dvpanel_pnl1_Width ;
   private String Dvpanel_pnl1_Cls ;
   private String Dvpanel_pnl1_Title ;
   private String Dvpanel_pnl1_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_pnl_Width ;
   private String Dvpanel_pnl_Cls ;
   private String Dvpanel_pnl_Title ;
   private String Dvpanel_pnl_Iconposition ;
   private String Dvpanel_pnl2_Width ;
   private String Dvpanel_pnl2_Cls ;
   private String Dvpanel_pnl2_Title ;
   private String Dvpanel_pnl2_Iconposition ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_pnllhiprolist_Width ;
   private String Dvpanel_pnllhiprolist_Cls ;
   private String Dvpanel_pnllhiprolist_Title ;
   private String Dvpanel_pnllhiprolist_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_pnlfiltros_Internalname ;
   private String Dvpanel_pnl1_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String Dvpanel_pnl_Internalname ;
   private String Dvpanel_pnllhiprolist_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String OldWcwcproduccionresumenmaquinas ;
   private String WebComp_Wcwcproduccionresumenmaquinas_Component ;
   private String OldWcwcproduccionresumenmaquinasqueryviewer ;
   private String WebComp_Wcwcproduccionresumenmaquinasqueryviewer_Component ;
   private String OldWcwcproduccionresumenfasesqueryviewer ;
   private String WebComp_Wcwcproduccionresumenfasesqueryviewer_Component ;
   private String OldWcwctbllhiproqueryviewer ;
   private String WebComp_Wcwctbllhiproqueryviewer_Component ;
   private String OldWcwcproduccionresumenmaquinaschar ;
   private String WebComp_Wcwcproduccionresumenmaquinaschar_Component ;
   private String OldWcwcproduccionresumenoperarioschar ;
   private String WebComp_Wcwcproduccionresumenoperarioschar_Component ;
   private String OldWcwctbllhiprolist ;
   private String WebComp_Wcwctbllhiprolist_Component ;
   private String edtavMaqcodini_Internalname ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String l602MaqCod ;
   private String AV8MaqcodIni ;
   private String AV7MaqcodFin ;
   private String edtavMaqcodfin_Internalname ;
   private String edtavFinicio_Internalname ;
   private String edtavFfin_Internalname ;
   private String AV11Station ;
   private String AV12EmprNom ;
   private String AV13UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String sStyleString ;
   private String tblPnllhiprolist_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String tblTablemergedpnl2_Internalname ;
   private String Dvpanel_pnl2_Internalname ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String tblUnnamedtable3_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String tblPnl2_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String tblPnl_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String tblUnnamedtable2_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String tblUnnamedtable1_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String tblPnl1_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String tblPnlfiltros_Internalname ;
   private String divUnnamedtable11_Internalname ;
   private String divUnnamedtablemaqcodini_Internalname ;
   private String lblTextblockmaqcodini_Internalname ;
   private String lblTextblockmaqcodini_Jsonclick ;
   private String TempTags ;
   private String edtavMaqcodini_Jsonclick ;
   private String divUnnamedtablemaqcodfin_Internalname ;
   private String lblTextblockmaqcodfin_Internalname ;
   private String lblTextblockmaqcodfin_Jsonclick ;
   private String edtavMaqcodfin_Jsonclick ;
   private String divUnnamedtablefinicio_Internalname ;
   private String lblTextblockfinicio_Internalname ;
   private String lblTextblockfinicio_Jsonclick ;
   private String edtavFinicio_Jsonclick ;
   private String divUnnamedtableffin_Internalname ;
   private String lblTextblockffin_Internalname ;
   private String lblTextblockffin_Jsonclick ;
   private String edtavFfin_Jsonclick ;
   private String divUnnamedtabletipoproduccion_Internalname ;
   private String lblTextblocktipoproduccion_Internalname ;
   private String lblTextblocktipoproduccion_Jsonclick ;
   private String divUnnamedtable12_Internalname ;
   private java.util.Date AV6FInicio ;
   private java.util.Date AV5FFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_pnlfiltros_Autowidth ;
   private boolean Dvpanel_pnlfiltros_Autoheight ;
   private boolean Dvpanel_pnlfiltros_Collapsible ;
   private boolean Dvpanel_pnlfiltros_Collapsed ;
   private boolean Dvpanel_pnlfiltros_Showcollapseicon ;
   private boolean Dvpanel_pnlfiltros_Autoscroll ;
   private boolean Dvpanel_pnl1_Autowidth ;
   private boolean Dvpanel_pnl1_Autoheight ;
   private boolean Dvpanel_pnl1_Collapsible ;
   private boolean Dvpanel_pnl1_Collapsed ;
   private boolean Dvpanel_pnl1_Showcollapseicon ;
   private boolean Dvpanel_pnl1_Autoscroll ;
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
   private boolean Dvpanel_pnl_Autowidth ;
   private boolean Dvpanel_pnl_Autoheight ;
   private boolean Dvpanel_pnl_Collapsible ;
   private boolean Dvpanel_pnl_Collapsed ;
   private boolean Dvpanel_pnl_Showcollapseicon ;
   private boolean Dvpanel_pnl_Autoscroll ;
   private boolean Dvpanel_pnl2_Autowidth ;
   private boolean Dvpanel_pnl2_Autoheight ;
   private boolean Dvpanel_pnl2_Collapsible ;
   private boolean Dvpanel_pnl2_Collapsed ;
   private boolean Dvpanel_pnl2_Showcollapseicon ;
   private boolean Dvpanel_pnl2_Autoscroll ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Dvpanel_pnllhiprolist_Autowidth ;
   private boolean Dvpanel_pnllhiprolist_Autoheight ;
   private boolean Dvpanel_pnllhiprolist_Collapsible ;
   private boolean Dvpanel_pnllhiprolist_Collapsed ;
   private boolean Dvpanel_pnllhiprolist_Showcollapseicon ;
   private boolean Dvpanel_pnllhiprolist_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwctbllhiprolist ;
   private boolean bDynCreated_Wcwcproduccionresumenoperarioschar ;
   private boolean bDynCreated_Wcwcproduccionresumenmaquinaschar ;
   private boolean bDynCreated_Wcwctbllhiproqueryviewer ;
   private boolean bDynCreated_Wcwcproduccionresumenfasesqueryviewer ;
   private boolean bDynCreated_Wcwcproduccionresumenmaquinasqueryviewer ;
   private boolean bDynCreated_Wcwcproduccionresumenmaquinas ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwcproduccionresumenmaquinas ;
   private GXWebComponent WebComp_Wcwcproduccionresumenmaquinasqueryviewer ;
   private GXWebComponent WebComp_Wcwcproduccionresumenfasesqueryviewer ;
   private GXWebComponent WebComp_Wcwctbllhiproqueryviewer ;
   private GXWebComponent WebComp_Wcwcproduccionresumenmaquinaschar ;
   private GXWebComponent WebComp_Wcwcproduccionresumenoperarioschar ;
   private GXWebComponent WebComp_Wcwctbllhiprolist ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnlfiltros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnl1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnl ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnllhiprolist ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnl2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private HTMLChoice cmbavTipoproduccion ;
   private IDataStoreProvider pr_default ;
   private String[] H00DI2_A602MaqCod ;
   private String[] H00DI3_A602MaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class produccioninformesresumen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00DI2", "SELECT * FROM (SELECT DISTINCT MaqCod FROM TXPMAQUIN WHERE UPPER(MaqCod) like '%' || UPPER(?) ORDER BY MaqCod) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DI3", "SELECT * FROM (SELECT DISTINCT MaqCod FROM TXPMAQUIN WHERE UPPER(MaqCod) like '%' || UPPER(?) ORDER BY MaqCod) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
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
               stmt.setString(1, (String)parms[0], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 6);
               return;
      }
   }

}

