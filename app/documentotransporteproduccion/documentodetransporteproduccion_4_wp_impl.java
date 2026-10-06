package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_4_wp_impl extends GXDataArea
{
   public documentodetransporteproduccion_4_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentodetransporteproduccion_4_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_4_wp_impl.class ));
   }

   public documentodetransporteproduccion_4_wp_impl( int remoteHandle ,
                                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbenvftp = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV17EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV15AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15AlbProCod), 10, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15AlbProCod), "ZZZZZZZZZ9")));
               AV12BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12BarCod), "ZZZZZZZ9")));
               AV13BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13BarCodReo", GXutil.str( AV13BarCodReo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReo), "9")));
               AV14BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarCodPar", AV14BarCodPar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14BarCodPar, ""))));
               AV24Guiremcli = (int)(GXutil.lval( httpContext.GetPar( "Guiremcli"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Guiremcli), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24Guiremcli), "ZZZZZ9")));
               AV21BarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbKgmE"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21BarAlbKgmE", GXutil.ltrimstr( AV21BarAlbKgmE, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBKGME", getSecureSignedToken( "", localUtil.format( AV21BarAlbKgmE, "ZZZZZ9.99")));
               AV22BarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbMtrE"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22BarAlbMtrE", GXutil.ltrimstr( AV22BarAlbMtrE, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBMTRE", getSecureSignedToken( "", localUtil.format( AV22BarAlbMtrE, "ZZZZZ9.99")));
               AV27AlbEnvFtp = (byte)(GXutil.lval( httpContext.GetPar( "AlbEnvFtp"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27AlbEnvFtp", GXutil.str( AV27AlbEnvFtp, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27AlbEnvFtp), "9")));
               AV28AlbLic = httpContext.GetPar( "AlbLic") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28AlbLic", AV28AlbLic);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28AlbLic, ""))));
               AV29AlbProEst = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEst"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29AlbProEst", GXutil.str( AV29AlbProEst, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29AlbProEst), "9")));
               AV32albmarca = httpContext.GetPar( "albmarca") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32albmarca", AV32albmarca);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32albmarca, ""))));
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
      pa29J2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start29J2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_4_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV14BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV24Guiremcli,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV21BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(AV22BarAlbMtrE)),GXutil.URLEncode(GXutil.ltrimstr(AV27AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV28AlbLic)),GXutil.URLEncode(GXutil.ltrimstr(AV29AlbProEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV32albmarca))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Guiremcli","BarAlbKgmE","BarAlbMtrE","AlbEnvFtp","AlbLic","AlbProEst","albmarca"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32albmarca, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15AlbProCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24Guiremcli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBKGME", getSecureSignedToken( "", localUtil.format( AV21BarAlbKgmE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBMTRE", getSecureSignedToken( "", localUtil.format( AV22BarAlbMtrE, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27AlbEnvFtp), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28AlbLic, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29AlbProEst), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vALBMARCA", GXutil.rtrim( AV32albmarca));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32albmarca, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV17EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG", GXutil.ltrim( localUtil.ntoc( AV20Flag, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBFAS", GXutil.ltrim( localUtil.ntoc( AV23albfas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_tableattributes_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
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
      if ( ! ( WebComp_Wcdocumentodetransporteproduccion_4_wc == null ) )
      {
         WebComp_Wcdocumentodetransporteproduccion_4_wc.componentjscripts();
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
         we29J2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt29J2( ) ;
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
      return formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_4_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV14BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV24Guiremcli,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV21BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(AV22BarAlbMtrE)),GXutil.URLEncode(GXutil.ltrimstr(AV27AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV28AlbLic)),GXutil.URLEncode(GXutil.ltrimstr(AV29AlbProEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV32albmarca))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Guiremcli","BarAlbKgmE","BarAlbMtrE","AlbEnvFtp","AlbLic","AlbProEst","albmarca"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_4_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Detalle de Fases p/produccion (Servicios)", "") ;
   }

   public void wb29J0( )
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
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         ucDvpanel_tableattributes.setProperty("Width", Dvpanel_tableattributes_Width);
         ucDvpanel_tableattributes.setProperty("AutoWidth", Dvpanel_tableattributes_Autowidth);
         ucDvpanel_tableattributes.setProperty("AutoHeight", Dvpanel_tableattributes_Autoheight);
         ucDvpanel_tableattributes.setProperty("Cls", Dvpanel_tableattributes_Cls);
         ucDvpanel_tableattributes.setProperty("Title", Dvpanel_tableattributes_Title);
         ucDvpanel_tableattributes.setProperty("Collapsible", Dvpanel_tableattributes_Collapsible);
         ucDvpanel_tableattributes.setProperty("Collapsed", Dvpanel_tableattributes_Collapsed);
         ucDvpanel_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_tableattributes_Showcollapseicon);
         ucDvpanel_tableattributes.setProperty("IconPosition", Dvpanel_tableattributes_Iconposition);
         ucDvpanel_tableattributes.setProperty("AutoScroll", Dvpanel_tableattributes_Autoscroll);
         ucDvpanel_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableattributes_Internalname, "DVPANEL_TABLEATTRIBUTESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEATTRIBUTESContainer"+"TableAttributes"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocod_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV15AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV15AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV15AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGuiremcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGuiremcli_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGuiremcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV24Guiremcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGuiremcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24Guiremcli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV24Guiremcli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGuiremcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGuiremcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbenvftp.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbenvftp.getInternalname(), httpContext.getMessage( "FTP", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbenvftp, cmbavAlbenvftp.getInternalname(), GXutil.trim( GXutil.str( AV27AlbEnvFtp, 1, 0)), 1, cmbavAlbenvftp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavAlbenvftp.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         cmbavAlbenvftp.setValue( GXutil.trim( GXutil.str( AV27AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbenvftp.getInternalname(), "Values", cmbavAlbenvftp.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlblic_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlblic_Internalname, httpContext.getMessage( "AtCode", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlblic_Internalname, GXutil.rtrim( AV28AlbLic), GXutil.rtrim( localUtil.format( AV28AlbLic, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlblic_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlblic_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbproest_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbproest_Internalname, httpContext.getMessage( "E", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbproest_Internalname, GXutil.ltrim( localUtil.ntoc( AV29AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbproest_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV29AlbProEst), "9") : localUtil.format( DecimalUtil.doubleToDec(AV29AlbProEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbproest_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbproest_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº OS", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV12BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV13BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV14BarCodPar), GXutil.rtrim( localUtil.format( AV14BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaralbkgme_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaralbkgme_Internalname, httpContext.getMessage( "Quilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaralbkgme_Internalname, GXutil.ltrim( localUtil.ntoc( AV21BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaralbkgme_Enabled!=0) ? localUtil.format( AV21BarAlbKgmE, "ZZZZZ9.99") : localUtil.format( AV21BarAlbKgmE, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaralbkgme_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaralbkgme_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaralbmtre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaralbmtre_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaralbmtre_Internalname, GXutil.ltrim( localUtil.ntoc( AV22BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaralbmtre_Enabled!=0) ? localUtil.format( AV22BarAlbMtrE, "ZZZZZ9.99") : localUtil.format( AV22BarAlbMtrE, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaralbmtre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaralbmtre_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGuifaslin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGuifaslin_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGuifaslin_Internalname, GXutil.ltrim( localUtil.ntoc( AV5GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGuifaslin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5GuiFasLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5GuiFasLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+"EVGUIFASLIN.CLICK."+"'", "", "", "", "", edtavGuifaslin_Jsonclick, 5, "AttributeFL", "", "", "", "", 1, edtavGuifaslin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfascod_Internalname, httpContext.getMessage( "Fase", ""), "", "", lblTextblockfascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_87_29J2( true) ;
      }
      else
      {
         wb_table1_87_29J2( false) ;
      }
      return  ;
   }

   public void wb_table1_87_29J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFasdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFasdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFasdsc_Internalname, GXutil.rtrim( AV7FasDsc), GXutil.rtrim( localUtil.format( AV7FasDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFasdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFasdsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFaskgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFaskgm_Internalname, httpContext.getMessage( "Quilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFaskgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV8FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFaskgm_Enabled!=0) ? localUtil.format( AV8FasKgm, "ZZZZZ9.99") : localUtil.format( AV8FasKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFaskgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFaskgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGuifaspkg_cell_Internalname, 1, 0, "px", 0, "px", divGuifaspkg_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavGuifaspkg_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGuifaspkg_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGuifaspkg_Internalname, httpContext.getMessage( "Preço", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGuifaspkg_Internalname, GXutil.ltrim( localUtil.ntoc( AV9GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGuifaspkg_Enabled!=0) ? localUtil.format( AV9GuiFasPKg, "ZZZZZZ9.999") : localUtil.format( AV9GuiFasPKg, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGuifaspkg_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavGuifaspkg_Visible, edtavGuifaspkg_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFasmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFasmtr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFasmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV10FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFasmtr_Enabled!=0) ? localUtil.format( AV10FasMtr, "ZZZZZ9.99") : localUtil.format( AV10FasMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFasmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFasmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGuifaspmt_cell_Internalname, 1, 0, "px", 0, "px", divGuifaspmt_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavGuifaspmt_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGuifaspmt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGuifaspmt_Internalname, httpContext.getMessage( "Preço", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGuifaspmt_Internalname, GXutil.ltrim( localUtil.ntoc( AV11GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGuifaspmt_Enabled!=0) ? localUtil.format( AV11GuiFasPMt, "ZZZZZZ9.999") : localUtil.format( AV11GuiFasPMt, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGuifaspmt_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavGuifaspmt_Visible, edtavGuifaspmt_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, bttBtnenter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0134"+"", GXutil.rtrim( WebComp_Wcdocumentodetransporteproduccion_4_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0134"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_4_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcdocumentodetransporteproduccion_4_wc), GXutil.lower( WebComp_Wcdocumentodetransporteproduccion_4_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0134"+"");
               }
               WebComp_Wcdocumentodetransporteproduccion_4_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcdocumentodetransporteproduccion_4_wc), GXutil.lower( WebComp_Wcdocumentodetransporteproduccion_4_wc_Component)) != 0 )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV35Pgmname), GXutil.rtrim( localUtil.format( AV35Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
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
         wb_table2_142_29J2( true) ;
      }
      else
      {
         wb_table2_142_29J2( false) ;
      }
      return  ;
   }

   public void wb_table2_142_29J2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start29J2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Detalle de Fases p/produccion (Servicios)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup29J0( ) ;
   }

   public void ws29J2( )
   {
      start29J2( ) ;
      evt29J2( ) ;
   }

   public void evt29J2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1129J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1229J2 ();
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
                                 e1329J2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1429J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VGUIFASLIN.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1529J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFASCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1629J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VGUIFASLIN.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1729J2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1829J2 ();
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
                     if ( nCmpId == 134 )
                     {
                        OldWcdocumentodetransporteproduccion_4_wc = httpContext.cgiGet( "W0134") ;
                        if ( ( GXutil.len( OldWcdocumentodetransporteproduccion_4_wc) == 0 ) || ( GXutil.strcmp(OldWcdocumentodetransporteproduccion_4_wc, WebComp_Wcdocumentodetransporteproduccion_4_wc_Component) != 0 ) )
                        {
                           WebComp_Wcdocumentodetransporteproduccion_4_wc = WebUtils.getWebComponent(getClass(), "app." + OldWcdocumentodetransporteproduccion_4_wc + "_impl", remoteHandle, context);
                           WebComp_Wcdocumentodetransporteproduccion_4_wc_Component = OldWcdocumentodetransporteproduccion_4_wc ;
                        }
                        if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_4_wc_Component) != 0 )
                        {
                           WebComp_Wcdocumentodetransporteproduccion_4_wc.componentprocess("W0134", "", sEvt);
                        }
                        WebComp_Wcdocumentodetransporteproduccion_4_wc_Component = OldWcdocumentodetransporteproduccion_4_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we29J2( )
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

   public void pa29J2( )
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
            GX_FocusControl = edtavGuifaslin_Internalname ;
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
      if ( cmbavAlbenvftp.getItemCount() > 0 )
      {
         AV27AlbEnvFtp = (byte)(GXutil.lval( cmbavAlbenvftp.getValidValue(GXutil.trim( GXutil.str( AV27AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27AlbEnvFtp", GXutil.str( AV27AlbEnvFtp, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27AlbEnvFtp), "9")));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbenvftp.setValue( GXutil.trim( GXutil.str( AV27AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbenvftp.getInternalname(), "Values", cmbavAlbenvftp.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf29J2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV35Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_4_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      edtavGuiremcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcli_Enabled), 5, 0), true);
      cmbavAlbenvftp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbenvftp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbenvftp.getEnabled(), 5, 0), true);
      edtavAlblic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlblic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlblic_Enabled), 5, 0), true);
      edtavAlbproest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbproest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbproest_Enabled), 5, 0), true);
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavBaralbkgme_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbkgme_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbkgme_Enabled), 5, 0), true);
      edtavBaralbmtre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbmtre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbmtre_Enabled), 5, 0), true);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_fascod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.tfasproprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFASCOD"+"'), id:'"+"vFASCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFASDSC"+"'), id:'"+"vFASDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_fascod_Internalname, "Link", imgPrompt_fascod_Link, true);
      imgPrompt_fascod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.tfasproprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFASCOD"+"'), id:'"+"vFASCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFASDSC"+"'), id:'"+"vFASDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_fascod_Internalname, "Link", imgPrompt_fascod_Link, true);
   }

   public void rf29J2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_4_wc_Component) != 0 )
            {
               WebComp_Wcdocumentodetransporteproduccion_4_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1829J2 ();
         wb29J0( ) ;
      }
   }

   public void send_integrity_lvl_hashes29J2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vALBMARCA", GXutil.rtrim( AV32albmarca));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32albmarca, ""))));
   }

   public void before_start_formulas( )
   {
      AV35Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_4_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      edtavGuiremcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGuiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcli_Enabled), 5, 0), true);
      cmbavAlbenvftp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbenvftp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbenvftp.getEnabled(), 5, 0), true);
      edtavAlblic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlblic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlblic_Enabled), 5, 0), true);
      edtavAlbproest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbproest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbproest_Enabled), 5, 0), true);
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavBaralbkgme_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbkgme_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbkgme_Enabled), 5, 0), true);
      edtavBaralbmtre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbmtre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbmtre_Enabled), 5, 0), true);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_fascod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.tfasproprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFASCOD"+"'), id:'"+"vFASCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFASDSC"+"'), id:'"+"vFASDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_fascod_Internalname, "Link", imgPrompt_fascod_Link, true);
      imgPrompt_fascod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.tfasproprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFASCOD"+"'), id:'"+"vFASCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFASDSC"+"'), id:'"+"vFASDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_fascod_Internalname, "Link", imgPrompt_fascod_Link, true);
      fix_multi_value_controls( ) ;
   }

   public void strup29J0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1229J2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
         Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
         Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
         Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
         Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
         Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
         Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
         Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
         Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
         Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
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
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGuifaslin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGuifaslin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGUIFASLIN");
            GX_FocusControl = edtavGuifaslin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5GuiFasLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5GuiFasLin), 4, 0));
         }
         else
         {
            AV5GuiFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavGuifaslin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5GuiFasLin), 4, 0));
         }
         AV6FasCod = GXutil.upper( httpContext.cgiGet( edtavFascod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6FasCod", AV6FasCod);
         AV7FasDsc = httpContext.cgiGet( edtavFasdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7FasDsc", AV7FasDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavFaskgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFaskgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFASKGM");
            GX_FocusControl = edtavFaskgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8FasKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8FasKgm", GXutil.ltrimstr( AV8FasKgm, 9, 2));
         }
         else
         {
            AV8FasKgm = localUtil.ctond( httpContext.cgiGet( edtavFaskgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8FasKgm", GXutil.ltrimstr( AV8FasKgm, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavGuifaspkg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavGuifaspkg_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGUIFASPKG");
            GX_FocusControl = edtavGuifaspkg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9GuiFasPKg = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9GuiFasPKg", GXutil.ltrimstr( AV9GuiFasPKg, 13, 5));
         }
         else
         {
            AV9GuiFasPKg = localUtil.ctond( httpContext.cgiGet( edtavGuifaspkg_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9GuiFasPKg", GXutil.ltrimstr( AV9GuiFasPKg, 13, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavFasmtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFasmtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFASMTR");
            GX_FocusControl = edtavFasmtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10FasMtr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10FasMtr", GXutil.ltrimstr( AV10FasMtr, 9, 2));
         }
         else
         {
            AV10FasMtr = localUtil.ctond( httpContext.cgiGet( edtavFasmtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10FasMtr", GXutil.ltrimstr( AV10FasMtr, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavGuifaspmt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavGuifaspmt_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGUIFASPMT");
            GX_FocusControl = edtavGuifaspmt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11GuiFasPMt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11GuiFasPMt", GXutil.ltrimstr( AV11GuiFasPMt, 13, 5));
         }
         else
         {
            AV11GuiFasPMt = localUtil.ctond( httpContext.cgiGet( edtavGuifaspmt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11GuiFasPMt", GXutil.ltrimstr( AV11GuiFasPMt, 13, 5));
         }
         AV35Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
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
      e1229J2 ();
      if (returnInSub) return;
   }

   public void e1229J2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV16Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentodetransporteproduccion_4_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Station = GXt_char1 ;
      GXv_char2[0] = AV17EmprCod ;
      GXv_char3[0] = AV18EmprNom ;
      GXv_char4[0] = AV19UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentodetransporteproduccion_4_wp_impl.this.AV17EmprCod = GXv_char2[0] ;
      documentodetransporteproduccion_4_wp_impl.this.AV18EmprNom = GXv_char3[0] ;
      documentodetransporteproduccion_4_wp_impl.this.AV19UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      GXt_int5 = AV5GuiFasLin ;
      GXv_int6[0] = GXt_int5 ;
      new app.documentotransporteproduccion.ultimalineaalbfas(remoteHandle, context).execute( AV17EmprCod, AV15AlbProCod, AV12BarCod, AV13BarCodReo, AV14BarCodPar, GXv_int6) ;
      documentodetransporteproduccion_4_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV5GuiFasLin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5GuiFasLin), 4, 0));
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcdocumentodetransporteproduccion_4_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcdocumentodetransporteproduccion_4_wc_Component), GXutil.lower( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion__4_WC")) != 0 )
      {
         WebComp_Wcdocumentodetransporteproduccion_4_wc = WebUtils.getWebComponent(getClass(), "app.documentotransporteproduccion.documentodetransporteproduccion__4_wc_impl", remoteHandle, context);
         WebComp_Wcdocumentodetransporteproduccion_4_wc_Component = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion__4_WC" ;
      }
      if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_4_wc_Component) != 0 )
      {
         WebComp_Wcdocumentodetransporteproduccion_4_wc.setjustcreated();
         WebComp_Wcdocumentodetransporteproduccion_4_wc.componentprepare(new Object[] {"W0134","",AV17EmprCod,Long.valueOf(AV15AlbProCod),Integer.valueOf(AV12BarCod),Byte.valueOf(AV13BarCodReo),AV14BarCodPar,Byte.valueOf(AV27AlbEnvFtp),AV28AlbLic,Byte.valueOf(AV29AlbProEst),AV32albmarca});
         WebComp_Wcdocumentodetransporteproduccion_4_wc.componentbind(new Object[] {"","vALBPROCOD","vBARCOD","vBARCODREO","vBARCODPAR","vALBENVFTP","vALBLIC","vALBPROEST",""});
      }
      if ( ( AV27AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV28AlbLic, " ") != 0 ) || ( AV29AlbProEst == 2 ) || ( GXutil.strcmp(AV32albmarca, "A") == 0 ) )
      {
         bttBtnenter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtnenter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnenter_Enabled), 5, 0), true);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1329J2 ();
      if (returnInSub) return;
   }

   public void e1329J2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ( AV27AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV28AlbLic, " ") != 0 ) || ( AV29AlbProEst == 2 ) || ( GXutil.strcmp(AV32albmarca, "A") == 0 ) )
      {
         lblTbmessage_Caption = ((AV29AlbProEst==2) ? httpContext.getMessage( "Guia faturada", "") : httpContext.getMessage( "Comunicada a AT", "")) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         if ( GXutil.strcmp(AV32albmarca, "A") == 0 )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Guia ANULADA", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         GXv_char4[0] = AV17EmprCod ;
         GXv_char3[0] = AV6FasCod ;
         GXv_int7[0] = AV20Flag ;
         new app.pexifas(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7) ;
         documentodetransporteproduccion_4_wp_impl.this.AV17EmprCod = GXv_char4[0] ;
         documentodetransporteproduccion_4_wp_impl.this.AV6FasCod = GXv_char3[0] ;
         documentodetransporteproduccion_4_wp_impl.this.AV20Flag = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV6FasCod", AV6FasCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV20Flag", GXutil.str( AV20Flag, 1, 0));
         if ( (0==AV5GuiFasLin) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Linea invalida", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            GX_FocusControl = edtavGuifaslin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( (GXutil.strcmp("", AV6FasCod)==0) )
            {
               lblTbmessage_Caption = httpContext.getMessage( "Fase invalida", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               GX_FocusControl = edtavFascod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( (0==AV20Flag) )
               {
                  lblTbmessage_Caption = httpContext.getMessage( "Fase Inexistente", "") ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  GX_FocusControl = edtavFascod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1129J2( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S122 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1429J2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      this.executeExternalObjectMethod("", false, "GlobalEvents", "ConfirmacionPrecioDocumento", new Object[] {}, true);
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      if ( ( AV27AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV28AlbLic, " ") != 0 ) || ( AV29AlbProEst == 2 ) || ( GXutil.strcmp(AV32albmarca, "A") == 0 ) )
      {
         lblTbmessage_Caption = ((AV29AlbProEst==2) ? httpContext.getMessage( "Guia faturada", "") : httpContext.getMessage( "Comunicada a AT", "")) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         if ( GXutil.strcmp(AV32albmarca, "A") == 0 )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Guia Anulada", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         new app.documentotransporteproduccion.insupd_albfas(remoteHandle, context).execute( AV17EmprCod, AV15AlbProCod, AV12BarCod, AV13BarCodReo, AV14BarCodPar, AV5GuiFasLin, AV6FasCod, AV8FasKgm, AV9GuiFasPKg, AV10FasMtr, AV11GuiFasPMt) ;
         new app.documentotransporteproduccion.upd_guifasulin_albbar(remoteHandle, context).execute( AV17EmprCod, AV15AlbProCod, AV12BarCod, AV13BarCodReo, AV14BarCodPar) ;
         GXt_int5 = AV5GuiFasLin ;
         GXv_int6[0] = GXt_int5 ;
         new app.documentotransporteproduccion.ultimalineaalbfas(remoteHandle, context).execute( AV17EmprCod, AV15AlbProCod, AV12BarCod, AV13BarCodReo, AV14BarCodPar, GXv_int6) ;
         documentodetransporteproduccion_4_wp_impl.this.GXt_int5 = GXv_int6[0] ;
         AV5GuiFasLin = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5GuiFasLin), 4, 0));
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcdocumentodetransporteproduccion_4_wc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcdocumentodetransporteproduccion_4_wc_Component), GXutil.lower( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion__4_WC")) != 0 )
         {
            WebComp_Wcdocumentodetransporteproduccion_4_wc = WebUtils.getWebComponent(getClass(), "app.documentotransporteproduccion.documentodetransporteproduccion__4_wc_impl", remoteHandle, context);
            WebComp_Wcdocumentodetransporteproduccion_4_wc_Component = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion__4_WC" ;
         }
         if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_4_wc_Component) != 0 )
         {
            WebComp_Wcdocumentodetransporteproduccion_4_wc.setjustcreated();
            WebComp_Wcdocumentodetransporteproduccion_4_wc.componentprepare(new Object[] {"W0134","",AV17EmprCod,Long.valueOf(AV15AlbProCod),Integer.valueOf(AV12BarCod),Byte.valueOf(AV13BarCodReo),AV14BarCodPar,Byte.valueOf(AV27AlbEnvFtp),AV28AlbLic,Byte.valueOf(AV29AlbProEst),AV32albmarca});
            WebComp_Wcdocumentodetransporteproduccion_4_wc.componentbind(new Object[] {"","vALBPROCOD","vBARCOD","vBARCODREO","vBARCODPAR","vALBENVFTP","vALBLIC","vALBPROEST",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcdocumentodetransporteproduccion_4_wc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0134"+"");
            WebComp_Wcdocumentodetransporteproduccion_4_wc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
         AV6FasCod = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6FasCod", AV6FasCod);
         AV8FasKgm = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8FasKgm", GXutil.ltrimstr( AV8FasKgm, 9, 2));
         AV9GuiFasPKg = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9GuiFasPKg", GXutil.ltrimstr( AV9GuiFasPKg, 13, 5));
         AV10FasMtr = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10FasMtr", GXutil.ltrimstr( AV10FasMtr, 9, 2));
         AV11GuiFasPMt = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11GuiFasPMt", GXutil.ltrimstr( AV11GuiFasPMt, 13, 5));
         AV7FasDsc = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7FasDsc", AV7FasDsc);
         httpContext.doAjaxRefresh();
      }
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV17EmprCod, httpContext.getMessage( "MODA21", "")) == 0 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtavGuifaspkg_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavGuifaspkg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuifaspkg_Visible), 5, 0), true);
         divGuifaspkg_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divGuifaspkg_cell_Internalname, "Class", divGuifaspkg_cell_Class, true);
      }
      else
      {
         edtavGuifaspkg_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavGuifaspkg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuifaspkg_Visible), 5, 0), true);
         divGuifaspkg_cell_Class = "col-xs-12 col-sm-2" ;
         httpContext.ajax_rsp_assign_prop("", false, divGuifaspkg_cell_Internalname, "Class", divGuifaspkg_cell_Class, true);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV17EmprCod, httpContext.getMessage( "MODA21", "")) == 0 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtavGuifaspmt_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavGuifaspmt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuifaspmt_Visible), 5, 0), true);
         divGuifaspmt_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divGuifaspmt_cell_Internalname, "Class", divGuifaspmt_cell_Class, true);
      }
      else
      {
         edtavGuifaspmt_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavGuifaspmt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuifaspmt_Visible), 5, 0), true);
         divGuifaspmt_cell_Class = "col-xs-12 col-sm-1" ;
         httpContext.ajax_rsp_assign_prop("", false, divGuifaspmt_cell_Internalname, "Class", divGuifaspmt_cell_Class, true);
      }
   }

   public void e1529J2( )
   {
      /* Guifaslin_Isvalid Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( (0==AV5GuiFasLin) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Linea invalida", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         httpContext.doAjaxRefresh();
         GX_FocusControl = edtavGuifaslin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         GXv_char4[0] = AV6FasCod ;
         GXv_char3[0] = AV7FasDsc ;
         GXv_decimal8[0] = AV8FasKgm ;
         GXv_decimal9[0] = AV9GuiFasPKg ;
         GXv_decimal10[0] = AV10FasMtr ;
         GXv_decimal11[0] = AV11GuiFasPMt ;
         GXv_int6[0] = AV23albfas ;
         new app.documentotransporteproduccion.obtengodatosalbfas(remoteHandle, context).execute( AV17EmprCod, AV15AlbProCod, AV12BarCod, AV13BarCodReo, AV14BarCodPar, AV5GuiFasLin, GXv_char4, GXv_char3, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_int6) ;
         documentodetransporteproduccion_4_wp_impl.this.AV6FasCod = GXv_char4[0] ;
         documentodetransporteproduccion_4_wp_impl.this.AV7FasDsc = GXv_char3[0] ;
         documentodetransporteproduccion_4_wp_impl.this.AV8FasKgm = GXv_decimal8[0] ;
         documentodetransporteproduccion_4_wp_impl.this.AV9GuiFasPKg = GXv_decimal9[0] ;
         documentodetransporteproduccion_4_wp_impl.this.AV10FasMtr = GXv_decimal10[0] ;
         documentodetransporteproduccion_4_wp_impl.this.AV11GuiFasPMt = GXv_decimal11[0] ;
         documentodetransporteproduccion_4_wp_impl.this.AV23albfas = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6FasCod", AV6FasCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV7FasDsc", AV7FasDsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV8FasKgm", GXutil.ltrimstr( AV8FasKgm, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV9GuiFasPKg", GXutil.ltrimstr( AV9GuiFasPKg, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV10FasMtr", GXutil.ltrimstr( AV10FasMtr, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV11GuiFasPMt", GXutil.ltrimstr( AV11GuiFasPMt, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV23albfas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23albfas), 4, 0));
         if ( (0==AV23albfas) )
         {
            GXv_decimal11[0] = AV25FasPreKgm ;
            GXv_decimal10[0] = AV26FasPreMtr ;
            new app.documentotransporteproduccion.obtengopreciofase(remoteHandle, context).execute( AV17EmprCod, AV24Guiremcli, AV6FasCod, GXv_decimal11, GXv_decimal10) ;
            documentodetransporteproduccion_4_wp_impl.this.AV25FasPreKgm = GXv_decimal11[0] ;
            documentodetransporteproduccion_4_wp_impl.this.AV26FasPreMtr = GXv_decimal10[0] ;
            AV8FasKgm = AV21BarAlbKgmE ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8FasKgm", GXutil.ltrimstr( AV8FasKgm, 9, 2));
            AV10FasMtr = AV22BarAlbMtrE ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10FasMtr", GXutil.ltrimstr( AV10FasMtr, 9, 2));
            AV9GuiFasPKg = AV25FasPreKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9GuiFasPKg", GXutil.ltrimstr( AV9GuiFasPKg, 13, 5));
            AV11GuiFasPMt = AV26FasPreMtr ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11GuiFasPMt", GXutil.ltrimstr( AV11GuiFasPMt, 13, 5));
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1629J2( )
   {
      /* Fascod_Isvalid Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      GXv_char4[0] = AV17EmprCod ;
      GXv_char3[0] = AV6FasCod ;
      GXv_int7[0] = AV20Flag ;
      new app.pexifas(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7) ;
      documentodetransporteproduccion_4_wp_impl.this.AV17EmprCod = GXv_char4[0] ;
      documentodetransporteproduccion_4_wp_impl.this.AV6FasCod = GXv_char3[0] ;
      documentodetransporteproduccion_4_wp_impl.this.AV20Flag = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV6FasCod", AV6FasCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV20Flag", GXutil.str( AV20Flag, 1, 0));
      if ( (GXutil.strcmp("", AV6FasCod)==0) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Fase invalida", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         httpContext.doAjaxRefresh();
         GX_FocusControl = edtavFascod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (0==AV20Flag) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Fase Inexistente", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            httpContext.doAjaxRefresh();
            GX_FocusControl = edtavFascod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( (0==AV23albfas) )
            {
               GXv_decimal11[0] = AV25FasPreKgm ;
               GXv_decimal10[0] = AV26FasPreMtr ;
               new app.documentotransporteproduccion.obtengopreciofase(remoteHandle, context).execute( AV17EmprCod, AV24Guiremcli, AV6FasCod, GXv_decimal11, GXv_decimal10) ;
               documentodetransporteproduccion_4_wp_impl.this.AV25FasPreKgm = GXv_decimal11[0] ;
               documentodetransporteproduccion_4_wp_impl.this.AV26FasPreMtr = GXv_decimal10[0] ;
               AV9GuiFasPKg = AV25FasPreKgm ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9GuiFasPKg", GXutil.ltrimstr( AV9GuiFasPKg, 13, 5));
               AV11GuiFasPMt = AV26FasPreMtr ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11GuiFasPMt", GXutil.ltrimstr( AV11GuiFasPMt, 13, 5));
            }
            GXv_char4[0] = AV7FasDsc ;
            new app.pfasdsc(remoteHandle, context).execute( AV17EmprCod, AV6FasCod, GXv_char4) ;
            documentodetransporteproduccion_4_wp_impl.this.AV7FasDsc = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7FasDsc", AV7FasDsc);
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1729J2( )
   {
      /* Guifaslin_Click Routine */
      returnInSub = false ;
      GXt_int5 = AV5GuiFasLin ;
      GXv_int6[0] = GXt_int5 ;
      new app.documentotransporteproduccion.ultimalineaalbfas(remoteHandle, context).execute( AV17EmprCod, AV15AlbProCod, AV12BarCod, AV13BarCodReo, AV14BarCodPar, GXv_int6) ;
      documentodetransporteproduccion_4_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV5GuiFasLin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5GuiFasLin), 4, 0));
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e1829J2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table2_142_29J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_enter_Internalname, tblTabledvelop_confirmpanel_enter_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_enter.setProperty("Title", Dvelop_confirmpanel_enter_Title);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonCaption", Dvelop_confirmpanel_enter_Yesbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("NoButtonCaption", Dvelop_confirmpanel_enter_Nobuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("CancelButtonCaption", Dvelop_confirmpanel_enter_Cancelbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonPosition", Dvelop_confirmpanel_enter_Yesbuttonposition);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmType", Dvelop_confirmpanel_enter_Confirmtype);
         ucDvelop_confirmpanel_enter.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_enter_Internalname, "DVELOP_CONFIRMPANEL_ENTERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ENTERContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_142_29J2e( true) ;
      }
      else
      {
         wb_table2_142_29J2e( false) ;
      }
   }

   public void wb_table1_87_29J2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedfascod_Internalname, tblTablemergedfascod_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFascod_Internalname, httpContext.getMessage( "Fas Cod", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFascod_Internalname, GXutil.rtrim( AV6FasCod), GXutil.rtrim( localUtil.format( AV6FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFascod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFascod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Static images/pictures */
         ClassString = "Image" + " " + ((GXutil.strcmp(imgPrompt_fascod_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgPrompt_fascod_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgPrompt_fascod_Internalname, sImgUrl, imgPrompt_fascod_Link, "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_4_WP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_87_29J2e( true) ;
      }
      else
      {
         wb_table1_87_29J2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV17EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      AV15AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15AlbProCod), 10, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15AlbProCod), "ZZZZZZZZZ9")));
      AV12BarCod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12BarCod), "ZZZZZZZ9")));
      AV13BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarCodReo", GXutil.str( AV13BarCodReo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReo), "9")));
      AV14BarCodPar = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarCodPar", AV14BarCodPar);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14BarCodPar, ""))));
      AV24Guiremcli = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Guiremcli), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24Guiremcli), "ZZZZZ9")));
      AV21BarAlbKgmE = (java.math.BigDecimal)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21BarAlbKgmE", GXutil.ltrimstr( AV21BarAlbKgmE, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBKGME", getSecureSignedToken( "", localUtil.format( AV21BarAlbKgmE, "ZZZZZ9.99")));
      AV22BarAlbMtrE = (java.math.BigDecimal)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22BarAlbMtrE", GXutil.ltrimstr( AV22BarAlbMtrE, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARALBMTRE", getSecureSignedToken( "", localUtil.format( AV22BarAlbMtrE, "ZZZZZ9.99")));
      AV27AlbEnvFtp = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27AlbEnvFtp", GXutil.str( AV27AlbEnvFtp, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27AlbEnvFtp), "9")));
      AV28AlbLic = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28AlbLic", AV28AlbLic);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28AlbLic, ""))));
      AV29AlbProEst = ((Number) GXutil.testNumericType( getParm(obj,10), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29AlbProEst", GXutil.str( AV29AlbProEst, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29AlbProEst), "9")));
      AV32albmarca = (String)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32albmarca", AV32albmarca);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32albmarca, ""))));
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
      pa29J2( ) ;
      ws29J2( ) ;
      we29J2( ) ;
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
      if ( ! ( WebComp_Wcdocumentodetransporteproduccion_4_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_4_wc_Component) != 0 )
         {
            WebComp_Wcdocumentodetransporteproduccion_4_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202679920360", true, true);
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
      httpContext.AddJavascriptSource("documentotransporteproduccion/documentodetransporteproduccion_4_wp.js", "?202679920360", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTbmessage_Internalname = "TBMESSAGE" ;
      edtavAlbprocod_Internalname = "vALBPROCOD" ;
      edtavGuiremcli_Internalname = "vGUIREMCLI" ;
      cmbavAlbenvftp.setInternalname( "vALBENVFTP" );
      edtavAlblic_Internalname = "vALBLIC" ;
      edtavAlbproest_Internalname = "vALBPROEST" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      edtavBaralbkgme_Internalname = "vBARALBKGME" ;
      edtavBaralbmtre_Internalname = "vBARALBMTRE" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtavGuifaslin_Internalname = "vGUIFASLIN" ;
      lblTextblockfascod_Internalname = "TEXTBLOCKFASCOD" ;
      edtavFascod_Internalname = "vFASCOD" ;
      imgPrompt_fascod_Internalname = "PROMPT_FASCOD" ;
      tblTablemergedfascod_Internalname = "TABLEMERGEDFASCOD" ;
      divTablesplittedfascod_Internalname = "TABLESPLITTEDFASCOD" ;
      edtavFasdsc_Internalname = "vFASDSC" ;
      edtavFaskgm_Internalname = "vFASKGM" ;
      edtavGuifaspkg_Internalname = "vGUIFASPKG" ;
      divGuifaspkg_cell_Internalname = "GUIFASPKG_CELL" ;
      edtavFasmtr_Internalname = "vFASMTR" ;
      edtavGuifaspmt_Internalname = "vGUIFASPMT" ;
      divGuifaspmt_cell_Internalname = "GUIFASPMT_CELL" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
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
      imgPrompt_fascod_Link = "" ;
      edtavFascod_Jsonclick = "" ;
      edtavFascod_Enabled = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtnenter_Enabled = 1 ;
      edtavGuifaspmt_Jsonclick = "" ;
      edtavGuifaspmt_Enabled = 1 ;
      edtavGuifaspmt_Visible = 1 ;
      divGuifaspmt_cell_Class = "col-xs-12 col-sm-1" ;
      edtavFasmtr_Jsonclick = "" ;
      edtavFasmtr_Enabled = 1 ;
      edtavGuifaspkg_Jsonclick = "" ;
      edtavGuifaspkg_Enabled = 1 ;
      edtavGuifaspkg_Visible = 1 ;
      divGuifaspkg_cell_Class = "col-xs-12 col-sm-2" ;
      edtavFaskgm_Jsonclick = "" ;
      edtavFaskgm_Enabled = 1 ;
      edtavFasdsc_Jsonclick = "" ;
      edtavFasdsc_Enabled = 1 ;
      edtavGuifaslin_Jsonclick = "" ;
      edtavGuifaslin_Enabled = 1 ;
      edtavBaralbmtre_Jsonclick = "" ;
      edtavBaralbmtre_Enabled = 0 ;
      edtavBaralbkgme_Jsonclick = "" ;
      edtavBaralbkgme_Enabled = 0 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 0 ;
      edtavAlbproest_Jsonclick = "" ;
      edtavAlbproest_Enabled = 0 ;
      edtavAlblic_Jsonclick = "" ;
      edtavAlblic_Enabled = 0 ;
      cmbavAlbenvftp.setJsonclick( "" );
      cmbavAlbenvftp.setEnabled( 0 );
      edtavGuiremcli_Jsonclick = "" ;
      edtavGuiremcli_Enabled = 0 ;
      edtavAlbprocod_Jsonclick = "" ;
      edtavAlbprocod_Enabled = 0 ;
      lblTbmessage_Caption = "  " ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma el dato?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
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
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Detalle de Fases p/produccion (Servicios)", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavAlbenvftp.setName( "vALBENVFTP" );
      cmbavAlbenvftp.setWebtags( "" );
      cmbavAlbenvftp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbavAlbenvftp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbavAlbenvftp.getItemCount() > 0 )
      {
         AV27AlbEnvFtp = (byte)(GXutil.lval( cmbavAlbenvftp.getValidValue(GXutil.trim( GXutil.str( AV27AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27AlbEnvFtp", GXutil.str( AV27AlbEnvFtp, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27AlbEnvFtp), "9")));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV32albmarca',fld:'vALBMARCA',pic:'',hsh:true},{av:'AV15AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV12BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV13BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV24Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV21BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV22BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99',hsh:true},{av:'cmbavAlbenvftp'},{av:'AV27AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV28AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV29AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e1329J2',iparms:[{av:'cmbavAlbenvftp'},{av:'AV27AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV28AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV29AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV32albmarca',fld:'vALBMARCA',pic:'',hsh:true},{av:'AV12BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV20Flag',fld:'vFLAG',pic:'9'},{av:'AV5GuiFasLin',fld:'vGUIFASLIN',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV20Flag',fld:'vFLAG',pic:'9'},{av:'AV6FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e1129J2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'cmbavAlbenvftp'},{av:'AV27AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV28AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV29AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV32albmarca',fld:'vALBMARCA',pic:'',hsh:true},{av:'AV12BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV13BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV5GuiFasLin',fld:'vGUIFASLIN',pic:'ZZZ9'},{av:'AV6FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV8FasKgm',fld:'vFASKGM',pic:'ZZZZZ9.99'},{av:'AV9GuiFasPKg',fld:'vGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV10FasMtr',fld:'vFASMTR',pic:'ZZZZZ9.99'},{av:'AV11GuiFasPMt',fld:'vGUIFASPMT',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV5GuiFasLin',fld:'vGUIFASLIN',pic:'ZZZ9'},{ctrl:'WCDOCUMENTODETRANSPORTEPRODUCCION_4_WC'},{av:'AV6FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV8FasKgm',fld:'vFASKGM',pic:'ZZZZZ9.99'},{av:'AV9GuiFasPKg',fld:'vGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV10FasMtr',fld:'vFASMTR',pic:'ZZZZZ9.99'},{av:'AV11GuiFasPMt',fld:'vGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV7FasDsc',fld:'vFASDSC',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1429J2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VGUIFASLIN.ISVALID","{handler:'e1529J2',iparms:[{av:'AV5GuiFasLin',fld:'vGUIFASLIN',pic:'ZZZ9'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV12BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV13BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV24Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV21BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99',hsh:true},{av:'AV22BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("VGUIFASLIN.ISVALID",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV23albfas',fld:'vALBFAS',pic:'ZZZ9'},{av:'AV11GuiFasPMt',fld:'vGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV10FasMtr',fld:'vFASMTR',pic:'ZZZZZ9.99'},{av:'AV9GuiFasPKg',fld:'vGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV8FasKgm',fld:'vFASKGM',pic:'ZZZZZ9.99'},{av:'AV7FasDsc',fld:'vFASDSC',pic:''},{av:'AV6FasCod',fld:'vFASCOD',pic:'@!'}]}");
      setEventMetadata("VFASCOD.ISVALID","{handler:'e1629J2',iparms:[{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV20Flag',fld:'vFLAG',pic:'9'},{av:'AV23albfas',fld:'vALBFAS',pic:'ZZZ9'},{av:'AV24Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("VFASCOD.ISVALID",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV20Flag',fld:'vFLAG',pic:'9'},{av:'AV6FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9GuiFasPKg',fld:'vGUIFASPKG',pic:'ZZZZZZ9.999'},{av:'AV11GuiFasPMt',fld:'vGUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV7FasDsc',fld:'vFASDSC',pic:''}]}");
      setEventMetadata("VGUIFASLIN.CLICK","{handler:'e1729J2',iparms:[{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV12BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV13BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true}]");
      setEventMetadata("VGUIFASLIN.CLICK",",oparms:[{av:'AV5GuiFasLin',fld:'vGUIFASLIN',pic:'ZZZ9'}]}");
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
      wcpOAV17EmprCod = "" ;
      wcpOAV14BarCodPar = "" ;
      wcpOAV21BarAlbKgmE = DecimalUtil.ZERO ;
      wcpOAV22BarAlbMtrE = DecimalUtil.ZERO ;
      wcpOAV28AlbLic = "" ;
      wcpOAV32albmarca = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV17EmprCod = "" ;
      AV14BarCodPar = "" ;
      AV21BarAlbKgmE = DecimalUtil.ZERO ;
      AV22BarAlbMtrE = DecimalUtil.ZERO ;
      AV28AlbLic = "" ;
      AV32albmarca = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTbmessage_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblockfascod_Jsonclick = "" ;
      AV7FasDsc = "" ;
      AV8FasKgm = DecimalUtil.ZERO ;
      AV9GuiFasPKg = DecimalUtil.ZERO ;
      AV10FasMtr = DecimalUtil.ZERO ;
      AV11GuiFasPMt = DecimalUtil.ZERO ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      WebComp_Wcdocumentodetransporteproduccion_4_wc_Component = "" ;
      OldWcdocumentodetransporteproduccion_4_wc = "" ;
      AV35Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV6FasCod = "" ;
      AV16Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV18EmprNom = "" ;
      AV19UsurCod = "" ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV25FasPreKgm = DecimalUtil.ZERO ;
      AV26FasPreMtr = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new byte[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new short[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      imgPrompt_fascod_gximage = "" ;
      sImgUrl = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      AV35Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_4_WP" ;
      /* GeneXus formulas. */
      AV35Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_4_WP" ;
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      edtavGuiremcli_Enabled = 0 ;
      cmbavAlbenvftp.setEnabled( 0 );
      edtavAlblic_Enabled = 0 ;
      edtavAlbproest_Enabled = 0 ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBaralbkgme_Enabled = 0 ;
      edtavBaralbmtre_Enabled = 0 ;
      edtavFasdsc_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      imgPrompt_fascod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.tfasproprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFASCOD"+"'), id:'"+"vFASCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFASDSC"+"'), id:'"+"vFASDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      imgPrompt_fascod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.tfasproprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFASCOD"+"'), id:'"+"vFASCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFASDSC"+"'), id:'"+"vFASDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      WebComp_Wcdocumentodetransporteproduccion_4_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV13BarCodReo ;
   private byte wcpOAV27AlbEnvFtp ;
   private byte wcpOAV29AlbProEst ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV13BarCodReo ;
   private byte AV27AlbEnvFtp ;
   private byte AV29AlbProEst ;
   private byte gxajaxcallmode ;
   private byte AV20Flag ;
   private byte nDonePA ;
   private byte GXv_int7[] ;
   private byte nGXWrapped ;
   private short AV23albfas ;
   private short wbEnd ;
   private short wbStart ;
   private short AV5GuiFasLin ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXt_int5 ;
   private short GXv_int6[] ;
   private int wcpOAV12BarCod ;
   private int wcpOAV24Guiremcli ;
   private int AV12BarCod ;
   private int AV24Guiremcli ;
   private int edtavAlbprocod_Enabled ;
   private int edtavGuiremcli_Enabled ;
   private int edtavAlblic_Enabled ;
   private int edtavAlbproest_Enabled ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavBaralbkgme_Enabled ;
   private int edtavBaralbmtre_Enabled ;
   private int edtavGuifaslin_Enabled ;
   private int edtavFasdsc_Enabled ;
   private int edtavFaskgm_Enabled ;
   private int edtavGuifaspkg_Visible ;
   private int edtavGuifaspkg_Enabled ;
   private int edtavFasmtr_Enabled ;
   private int edtavGuifaspmt_Visible ;
   private int edtavGuifaspmt_Enabled ;
   private int bttBtnenter_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavFascod_Enabled ;
   private int idxLst ;
   private long wcpOAV15AlbProCod ;
   private long AV15AlbProCod ;
   private java.math.BigDecimal wcpOAV21BarAlbKgmE ;
   private java.math.BigDecimal wcpOAV22BarAlbMtrE ;
   private java.math.BigDecimal AV21BarAlbKgmE ;
   private java.math.BigDecimal AV22BarAlbMtrE ;
   private java.math.BigDecimal AV8FasKgm ;
   private java.math.BigDecimal AV9GuiFasPKg ;
   private java.math.BigDecimal AV10FasMtr ;
   private java.math.BigDecimal AV11GuiFasPMt ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV25FasPreKgm ;
   private java.math.BigDecimal AV26FasPreMtr ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private String wcpOAV17EmprCod ;
   private String wcpOAV14BarCodPar ;
   private String wcpOAV28AlbLic ;
   private String wcpOAV32albmarca ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV17EmprCod ;
   private String AV14BarCodPar ;
   private String AV28AlbLic ;
   private String AV32albmarca ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtavAlbprocod_Internalname ;
   private String edtavAlbprocod_Jsonclick ;
   private String edtavGuiremcli_Internalname ;
   private String edtavGuiremcli_Jsonclick ;
   private String edtavAlblic_Internalname ;
   private String edtavAlblic_Jsonclick ;
   private String edtavAlbproest_Internalname ;
   private String edtavAlbproest_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String edtavBaralbkgme_Internalname ;
   private String edtavBaralbkgme_Jsonclick ;
   private String edtavBaralbmtre_Internalname ;
   private String edtavBaralbmtre_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavGuifaslin_Internalname ;
   private String TempTags ;
   private String edtavGuifaslin_Jsonclick ;
   private String divTablesplittedfascod_Internalname ;
   private String lblTextblockfascod_Internalname ;
   private String lblTextblockfascod_Jsonclick ;
   private String edtavFasdsc_Internalname ;
   private String AV7FasDsc ;
   private String edtavFasdsc_Jsonclick ;
   private String edtavFaskgm_Internalname ;
   private String edtavFaskgm_Jsonclick ;
   private String divGuifaspkg_cell_Internalname ;
   private String divGuifaspkg_cell_Class ;
   private String edtavGuifaspkg_Internalname ;
   private String edtavGuifaspkg_Jsonclick ;
   private String edtavFasmtr_Internalname ;
   private String edtavFasmtr_Jsonclick ;
   private String divGuifaspmt_cell_Internalname ;
   private String divGuifaspmt_cell_Class ;
   private String edtavGuifaspmt_Internalname ;
   private String edtavGuifaspmt_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String WebComp_Wcdocumentodetransporteproduccion_4_wc_Component ;
   private String OldWcdocumentodetransporteproduccion_4_wc ;
   private String edtavPgmname_Internalname ;
   private String AV35Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String imgPrompt_fascod_Link ;
   private String imgPrompt_fascod_Internalname ;
   private String AV6FasCod ;
   private String edtavFascod_Internalname ;
   private String AV16Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV18EmprNom ;
   private String AV19UsurCod ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String tblTablemergedfascod_Internalname ;
   private String edtavFascod_Jsonclick ;
   private String imgPrompt_fascod_gximage ;
   private String sImgUrl ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
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
   private boolean bDynCreated_Wcdocumentodetransporteproduccion_4_wc ;
   private boolean Cond_result ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcdocumentodetransporteproduccion_4_wc ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private HTMLChoice cmbavAlbenvftp ;
   private com.genexus.webpanels.GXWebForm Form ;
}

