package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mantenimientorollos__upd_mts_impl extends GXDataArea
{
   public mantenimientorollos__upd_mts_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mantenimientorollos__upd_mts_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientorollos__upd_mts_impl.class ));
   }

   public mantenimientorollos__upd_mts_impl( int remoteHandle ,
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
            AV26EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV5METTERCOD = httpContext.GetPar( "METTERCOD") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5METTERCOD", AV5METTERCOD);
               AV14BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarCod), 8, 0));
               AV6BarCodreo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodreo", GXutil.str( AV6BarCodreo, 1, 0));
               AV13BarCodpar = httpContext.GetPar( "BarCodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13BarCodpar", AV13BarCodpar);
               AV12METPIECOD = httpContext.GetPar( "METPIECOD") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12METPIECOD", AV12METPIECOD);
               AV7METPIEMET = CommonUtil.decimalVal( httpContext.GetPar( "METPIEMET"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7METPIEMET", GXutil.ltrimstr( AV7METPIEMET, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIEMET", getSecureSignedToken( "", localUtil.format( AV7METPIEMET, "ZZZZZ9.99")));
               AV11MetPieKil = CommonUtil.decimalVal( httpContext.GetPar( "MetPieKil"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11MetPieKil", GXutil.ltrimstr( AV11MetPieKil, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIEKIL", getSecureSignedToken( "", localUtil.format( AV11MetPieKil, "ZZZZZ9.99")));
               AV10MetPieAnc = (short)(GXutil.lval( httpContext.GetPar( "MetPieAnc"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10MetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10MetPieAnc), 3, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIEANC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10MetPieAnc), "ZZ9")));
               AV9BarTrocal1 = (short)(GXutil.lval( httpContext.GetPar( "BarTrocal1"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9BarTrocal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarTrocal1), 4, 0));
               AV8BarUnimed = httpContext.GetPar( "BarUnimed") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8BarUnimed", AV8BarUnimed);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8BarUnimed, "@!"))));
               AV15Barpes = (short)(GXutil.lval( httpContext.GetPar( "Barpes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Barpes), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15Barpes), "ZZZ9")));
               AV16BarRdt = CommonUtil.decimalVal( httpContext.GetPar( "BarRdt"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16BarRdt", GXutil.ltrimstr( AV16BarRdt, 6, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARRDT", getSecureSignedToken( "", localUtil.format( AV16BarRdt, "ZZ9.99")));
               AV17IdPz = httpContext.GetPar( "IdPz") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17IdPz", AV17IdPz);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIDPZ", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17IdPz, ""))));
               AV18grm2 = CommonUtil.decimalVal( httpContext.GetPar( "grm2"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18grm2", GXutil.ltrimstr( AV18grm2, 8, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRM2", getSecureSignedToken( "", localUtil.format( AV18grm2, "ZZZZ9.99")));
               AV19Kms = httpContext.GetPar( "Kms") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Kms", AV19Kms);
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
      pa26K2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start26K2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.mantenimientorollos__upd_mts", new String[] {GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV5METTERCOD)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13BarCodpar)),GXutil.URLEncode(GXutil.rtrim(AV12METPIECOD)),GXutil.URLEncode(DecimalUtil.decToString(AV7METPIEMET)),GXutil.URLEncode(DecimalUtil.decToString(AV11MetPieKil)),GXutil.URLEncode(GXutil.ltrimstr(AV10MetPieAnc,3,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarTrocal1,4,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarUnimed)),GXutil.URLEncode(GXutil.ltrimstr(AV15Barpes,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV16BarRdt)),GXutil.URLEncode(GXutil.rtrim(AV17IdPz)),GXutil.URLEncode(DecimalUtil.decToString(AV18grm2)),GXutil.URLEncode(GXutil.rtrim(AV19Kms))}, new String[] {"EmprCod","METTERCOD","BarCod","BarCodreo","BarCodpar","METPIECOD","METPIEMET","MetPieKil","MetPieAnc","BarTrocal1","BarUnimed","Barpes","BarRdt","IdPz","grm2","Kms"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8BarUnimed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARRDT", getSecureSignedToken( "", localUtil.format( AV16BarRdt, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15Barpes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIEMET", getSecureSignedToken( "", localUtil.format( AV7METPIEMET, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIEKIL", getSecureSignedToken( "", localUtil.format( AV11MetPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIEANC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10MetPieAnc), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIDPZ", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17IdPz, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRM2", getSecureSignedToken( "", localUtil.format( AV18grm2, "ZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNIMED", GXutil.rtrim( AV8BarUnimed));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8BarUnimed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV25Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARRDT", GXutil.ltrim( localUtil.ntoc( AV16BarRdt, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARRDT", getSecureSignedToken( "", localUtil.format( AV16BarRdt, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPES", GXutil.ltrim( localUtil.ntoc( AV15Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15Barpes), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV26EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETTERCOD", GXutil.rtrim( AV5METTERCOD));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETPIEID", GXutil.rtrim( AV23MetPieId));
      app.GxWebStd.gx_hidden_field( httpContext, "vKMS", GXutil.rtrim( AV19Kms));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETPIEMET", GXutil.ltrim( localUtil.ntoc( AV7METPIEMET, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIEMET", getSecureSignedToken( "", localUtil.format( AV7METPIEMET, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETPIEKIL", GXutil.ltrim( localUtil.ntoc( AV11MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIEKIL", getSecureSignedToken( "", localUtil.format( AV11MetPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETPIEANC", GXutil.ltrim( localUtil.ntoc( AV10MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIEANC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10MetPieAnc), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARTROCAL1", GXutil.ltrim( localUtil.ntoc( AV9BarTrocal1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vIDPZ", GXutil.rtrim( AV17IdPz));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIDPZ", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17IdPz, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRM2", GXutil.ltrim( localUtil.ntoc( AV18grm2, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRM2", getSecureSignedToken( "", localUtil.format( AV18grm2, "ZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vANCHOM", GXutil.ltrim( localUtil.ntoc( AV30Anchom, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
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
         we26K2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt26K2( ) ;
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
      return formatLink("app.pedidosclientesindetalle.mantenimientorollos__upd_mts", new String[] {GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV5METTERCOD)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13BarCodpar)),GXutil.URLEncode(GXutil.rtrim(AV12METPIECOD)),GXutil.URLEncode(DecimalUtil.decToString(AV7METPIEMET)),GXutil.URLEncode(DecimalUtil.decToString(AV11MetPieKil)),GXutil.URLEncode(GXutil.ltrimstr(AV10MetPieAnc,3,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarTrocal1,4,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarUnimed)),GXutil.URLEncode(GXutil.ltrimstr(AV15Barpes,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV16BarRdt)),GXutil.URLEncode(GXutil.rtrim(AV17IdPz)),GXutil.URLEncode(DecimalUtil.decToString(AV18grm2)),GXutil.URLEncode(GXutil.rtrim(AV19Kms))}, new String[] {"EmprCod","METTERCOD","BarCod","BarCodreo","BarCodpar","METPIECOD","METPIEMET","MetPieKil","MetPieAnc","BarTrocal1","BarUnimed","Barpes","BarRdt","IdPz","grm2","Kms"})  ;
   }

   public String getPgmname( )
   {
      return "PedidosClienteSinDetalle.MantenimientoRollos__Upd_Mts" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento Rollos (Modificacion Mts, KIlos)", "") ;
   }

   public void wb26K0( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº HDR", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV14BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos__Upd_Mts.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-1 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV6BarCodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6BarCodreo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV6BarCodreo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos__Upd_Mts.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-1 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV13BarCodpar), GXutil.rtrim( localUtil.format( AV13BarCodpar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos__Upd_Mts.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetpiecod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetpiecod_Internalname, httpContext.getMessage( "Pieza", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetpiecod_Internalname, GXutil.rtrim( AV12METPIECOD), GXutil.rtrim( localUtil.format( AV12METPIECOD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetpiecod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetpiecod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos__Upd_Mts.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiekil_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiekil_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiekil_Internalname, GXutil.ltrim( localUtil.ntoc( AV22barpiekil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpiekil_Enabled!=0) ? localUtil.format( AV22barpiekil, "ZZZZZ9.99") : localUtil.format( AV22barpiekil, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiekil_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiekil_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos__Upd_Mts.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpiemet_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpiemet_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpiemet_Internalname, GXutil.ltrim( localUtil.ntoc( AV20BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpiemet_Enabled!=0) ? localUtil.format( AV20BarPieMet, "ZZZZZ9.99") : localUtil.format( AV20BarPieMet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpiemet_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpiemet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos__Upd_Mts.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarancaca1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarancaca1_Internalname, httpContext.getMessage( "Ancho Final (cm)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarancaca1_Internalname, GXutil.ltrim( localUtil.ntoc( AV21BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarancaca1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21BarAncAca1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV21BarAncAca1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarancaca1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarancaca1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos__Upd_Mts.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetpiemtd_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetpiemtd_Internalname, httpContext.getMessage( "Grm2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetpiemtd_Internalname, GXutil.ltrim( localUtil.ntoc( AV24MetPieMtd, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetpiemtd_Enabled!=0) ? localUtil.format( AV24MetPieMtd, "ZZZZ9.99") : localUtil.format( AV24MetPieMtd, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetpiemtd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetpiemtd_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos__Upd_Mts.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrecalculametros_Internalname, "", httpContext.getMessage( "ReCalcula Metros", ""), bttBtnrecalculametros_Jsonclick, 7, httpContext.getMessage( "ReCalcula Metros", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1126k1_client"+"'", TempTags, "", 2, "HLP_PedidosClienteSinDetalle\\MantenimientoRollos__Upd_Mts.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrecalculakilos_Internalname, "", httpContext.getMessage( "ReCalcula Kilos", ""), bttBtnrecalculakilos_Jsonclick, 7, httpContext.getMessage( "ReCalcula Kilos", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1226k1_client"+"'", TempTags, "", 2, "HLP_PedidosClienteSinDetalle\\MantenimientoRollos__Upd_Mts.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1326k1_client"+"'", TempTags, "", 2, "HLP_PedidosClienteSinDetalle\\MantenimientoRollos__Upd_Mts.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\MantenimientoRollos__Upd_Mts.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV33Pgmname), GXutil.rtrim( localUtil.format( AV33Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos__Upd_Mts.htm");
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
         wb_table1_90_26K2( true) ;
      }
      else
      {
         wb_table1_90_26K2( false) ;
      }
      return  ;
   }

   public void wb_table1_90_26K2e( boolean wbgen )
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

   public void start26K2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento Rollos (Modificacion Mts, KIlos)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup26K0( ) ;
   }

   public void ws26K2( )
   {
      start26K2( ) ;
      evt26K2( ) ;
   }

   public void evt26K2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1426K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1526K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1626K2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1726K2 ();
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

   public void we26K2( )
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

   public void pa26K2( )
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
            GX_FocusControl = edtavBarpiekil_Internalname ;
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
      rf26K2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV33Pgmname = "PedidosClienteSinDetalle.MantenimientoRollos__Upd_Mts" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavMetpiecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMetpiecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetpiecod_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf26K2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1726K2 ();
         wb26K0( ) ;
      }
   }

   public void send_integrity_lvl_hashes26K2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNIMED", GXutil.rtrim( AV8BarUnimed));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8BarUnimed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV25Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARRDT", GXutil.ltrim( localUtil.ntoc( AV16BarRdt, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARRDT", getSecureSignedToken( "", localUtil.format( AV16BarRdt, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPES", GXutil.ltrim( localUtil.ntoc( AV15Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15Barpes), "ZZZ9")));
   }

   public void before_start_formulas( )
   {
      AV33Pgmname = "PedidosClienteSinDetalle.MantenimientoRollos__Upd_Mts" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavMetpiecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMetpiecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetpiecod_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup26K0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1526K2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV30Anchom = localUtil.ctond( httpContext.cgiGet( "vANCHOM")) ;
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
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         /* Read variables values. */
         AV14BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarCod), 8, 0));
         AV6BarCodreo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodreo", GXutil.str( AV6BarCodreo, 1, 0));
         AV13BarCodpar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarCodpar", AV13BarCodpar);
         AV12METPIECOD = httpContext.cgiGet( edtavMetpiecod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12METPIECOD", AV12METPIECOD);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarpiekil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarpiekil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIEKIL");
            GX_FocusControl = edtavBarpiekil_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22barpiekil = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22barpiekil", GXutil.ltrimstr( AV22barpiekil, 9, 2));
         }
         else
         {
            AV22barpiekil = localUtil.ctond( httpContext.cgiGet( edtavBarpiekil_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22barpiekil", GXutil.ltrimstr( AV22barpiekil, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIEMET");
            GX_FocusControl = edtavBarpiemet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20BarPieMet = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20BarPieMet", GXutil.ltrimstr( AV20BarPieMet, 9, 2));
         }
         else
         {
            AV20BarPieMet = localUtil.ctond( httpContext.cgiGet( edtavBarpiemet_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20BarPieMet", GXutil.ltrimstr( AV20BarPieMet, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarancaca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarancaca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARANCACA1");
            GX_FocusControl = edtavBarancaca1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21BarAncAca1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarAncAca1), 3, 0));
         }
         else
         {
            AV21BarAncAca1 = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarancaca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarAncAca1), 3, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetpiemtd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetpiemtd_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETPIEMTD");
            GX_FocusControl = edtavMetpiemtd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24MetPieMtd = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24MetPieMtd", GXutil.ltrimstr( AV24MetPieMtd, 8, 2));
         }
         else
         {
            AV24MetPieMtd = localUtil.ctond( httpContext.cgiGet( edtavMetpiemtd_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24MetPieMtd", GXutil.ltrimstr( AV24MetPieMtd, 8, 2));
         }
         AV33Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
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
      e1526K2 ();
      if (returnInSub) return;
   }

   public void e1526K2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV20BarPieMet = AV7METPIEMET ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20BarPieMet", GXutil.ltrimstr( AV20BarPieMet, 9, 2));
      AV21BarAncAca1 = AV10MetPieAnc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarAncAca1), 3, 0));
      AV22barpiekil = AV11MetPieKil ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22barpiekil", GXutil.ltrimstr( AV22barpiekil, 9, 2));
      AV23MetPieId = AV17IdPz ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23MetPieId", AV23MetPieId);
      AV24MetPieMtd = AV18grm2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24MetPieMtd", GXutil.ltrimstr( AV24MetPieMtd, 8, 2));
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mantenimientorollos__upd_mts_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      GXv_char2[0] = AV26EmprCod ;
      GXv_char3[0] = AV28EmprNom ;
      GXv_char4[0] = AV29UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      mantenimientorollos__upd_mts_impl.this.AV26EmprCod = GXv_char2[0] ;
      mantenimientorollos__upd_mts_impl.this.AV28EmprNom = GXv_char3[0] ;
      mantenimientorollos__upd_mts_impl.this.AV29UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
      GXt_int5 = (byte)(AV25Moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV26EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      mantenimientorollos__upd_mts_impl.this.GXt_int5 = GXv_int6[0] ;
      AV25Moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Moda21), "ZZZ9")));
   }

   public void e1426K2( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S112 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1626K2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV26EmprCod,AV5METTERCOD,Integer.valueOf(AV14BarCod),Byte.valueOf(AV6BarCodreo),AV13BarCodpar,AV12METPIECOD,AV19Kms});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV26EmprCod","AV5METTERCOD","AV14BarCod","AV6BarCodreo","AV13BarCodpar","AV12METPIECOD","AV19Kms"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(AV8BarUnimed, httpContext.getMessage( "K", "")) == 0 ) && ( AV20BarPieMet.doubleValue() == 0 ) && ( AV25Moda21 == 0 ) )
      {
         AV20BarPieMet = AV22barpiekil.multiply(AV16BarRdt) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20BarPieMet", GXutil.ltrimstr( AV20BarPieMet, 9, 2));
      }
      if ( ( GXutil.strcmp(AV8BarUnimed, httpContext.getMessage( "M", "")) == 0 ) && ( AV22barpiekil.doubleValue() == 0 ) && ( AV25Moda21 == 0 ) )
      {
         AV22barpiekil = AV20BarPieMet.multiply(DecimalUtil.doubleToDec(AV15Barpes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22barpiekil", GXutil.ltrimstr( AV22barpiekil, 9, 2));
      }
      GXv_char4[0] = AV26EmprCod ;
      GXv_int7[0] = AV14BarCod ;
      GXv_int6[0] = AV6BarCodreo ;
      GXv_char3[0] = AV13BarCodpar ;
      GXv_char2[0] = AV12METPIECOD ;
      GXv_decimal8[0] = AV20BarPieMet ;
      GXv_decimal9[0] = AV22barpiekil ;
      GXv_int10[0] = AV21BarAncAca1 ;
      GXv_char11[0] = AV5METTERCOD ;
      GXv_char12[0] = AV23MetPieId ;
      GXv_char13[0] = AV19Kms ;
      GXv_decimal14[0] = AV24MetPieMtd ;
      new app.pupdkm(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_char2, GXv_decimal8, GXv_decimal9, GXv_int10, GXv_char11, GXv_char12, GXv_char13, GXv_decimal14) ;
      mantenimientorollos__upd_mts_impl.this.AV26EmprCod = GXv_char4[0] ;
      mantenimientorollos__upd_mts_impl.this.AV14BarCod = GXv_int7[0] ;
      mantenimientorollos__upd_mts_impl.this.AV6BarCodreo = GXv_int6[0] ;
      mantenimientorollos__upd_mts_impl.this.AV13BarCodpar = GXv_char3[0] ;
      mantenimientorollos__upd_mts_impl.this.AV12METPIECOD = GXv_char2[0] ;
      mantenimientorollos__upd_mts_impl.this.AV20BarPieMet = GXv_decimal8[0] ;
      mantenimientorollos__upd_mts_impl.this.AV22barpiekil = GXv_decimal9[0] ;
      mantenimientorollos__upd_mts_impl.this.AV21BarAncAca1 = GXv_int10[0] ;
      mantenimientorollos__upd_mts_impl.this.AV5METTERCOD = GXv_char11[0] ;
      mantenimientorollos__upd_mts_impl.this.AV23MetPieId = GXv_char12[0] ;
      mantenimientorollos__upd_mts_impl.this.AV19Kms = GXv_char13[0] ;
      mantenimientorollos__upd_mts_impl.this.AV24MetPieMtd = GXv_decimal14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodreo", GXutil.str( AV6BarCodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarCodpar", AV13BarCodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV12METPIECOD", AV12METPIECOD);
      httpContext.ajax_rsp_assign_attri("", false, "AV20BarPieMet", GXutil.ltrimstr( AV20BarPieMet, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV22barpiekil", GXutil.ltrimstr( AV22barpiekil, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV21BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarAncAca1), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV5METTERCOD", AV5METTERCOD);
      httpContext.ajax_rsp_assign_attri("", false, "AV23MetPieId", AV23MetPieId);
      httpContext.ajax_rsp_assign_attri("", false, "AV19Kms", AV19Kms);
      httpContext.ajax_rsp_assign_attri("", false, "AV24MetPieMtd", GXutil.ltrimstr( AV24MetPieMtd, 8, 2));
      httpContext.setWebReturnParms(new Object[] {AV26EmprCod,AV5METTERCOD,Integer.valueOf(AV14BarCod),Byte.valueOf(AV6BarCodreo),AV13BarCodpar,AV12METPIECOD,AV19Kms});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV26EmprCod","AV5METTERCOD","AV14BarCod","AV6BarCodreo","AV13BarCodpar","AV12METPIECOD","AV19Kms"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S132( )
   {
      /* 'KILOS' Routine */
      returnInSub = false ;
      AV30Anchom = DecimalUtil.doubleToDec(AV21BarAncAca1/ (double) (100)) ;
      AV22barpiekil = ((AV24MetPieMtd.multiply(AV30Anchom)).multiply(AV20BarPieMet).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22barpiekil", GXutil.ltrimstr( AV22barpiekil, 9, 2));
   }

   public void S122( )
   {
      /* 'METROS' Routine */
      returnInSub = false ;
      AV30Anchom = DecimalUtil.doubleToDec(AV21BarAncAca1/ (double) (100)) ;
      AV20BarPieMet = (AV22barpiekil.multiply(DecimalUtil.doubleToDec(1000))).divide((AV24MetPieMtd.multiply(AV30Anchom)), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20BarPieMet", GXutil.ltrimstr( AV20BarPieMet, 9, 2));
      AV20BarPieMet = GXutil.truncDecimal( AV20BarPieMet, 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20BarPieMet", GXutil.ltrimstr( AV20BarPieMet, 9, 2));
   }

   protected void nextLoad( )
   {
   }

   protected void e1726K2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_90_26K2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmar_Internalname, tblTabledvelop_confirmpanel_confirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmar.setProperty("Title", Dvelop_confirmpanel_confirmar_Title);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmType", Dvelop_confirmpanel_confirmar_Confirmtype);
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, "DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_90_26K2e( true) ;
      }
      else
      {
         wb_table1_90_26K2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV26EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
      AV5METTERCOD = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5METTERCOD", AV5METTERCOD);
      AV14BarCod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarCod), 8, 0));
      AV6BarCodreo = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodreo", GXutil.str( AV6BarCodreo, 1, 0));
      AV13BarCodpar = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarCodpar", AV13BarCodpar);
      AV12METPIECOD = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12METPIECOD", AV12METPIECOD);
      AV7METPIEMET = (java.math.BigDecimal)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7METPIEMET", GXutil.ltrimstr( AV7METPIEMET, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIEMET", getSecureSignedToken( "", localUtil.format( AV7METPIEMET, "ZZZZZ9.99")));
      AV11MetPieKil = (java.math.BigDecimal)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11MetPieKil", GXutil.ltrimstr( AV11MetPieKil, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIEKIL", getSecureSignedToken( "", localUtil.format( AV11MetPieKil, "ZZZZZ9.99")));
      AV10MetPieAnc = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10MetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10MetPieAnc), 3, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIEANC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10MetPieAnc), "ZZ9")));
      AV9BarTrocal1 = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarTrocal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarTrocal1), 4, 0));
      AV8BarUnimed = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarUnimed", AV8BarUnimed);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8BarUnimed, "@!"))));
      AV15Barpes = ((Number) GXutil.testNumericType( getParm(obj,11), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Barpes), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARPES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15Barpes), "ZZZ9")));
      AV16BarRdt = (java.math.BigDecimal)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarRdt", GXutil.ltrimstr( AV16BarRdt, 6, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARRDT", getSecureSignedToken( "", localUtil.format( AV16BarRdt, "ZZ9.99")));
      AV17IdPz = (String)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17IdPz", AV17IdPz);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIDPZ", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17IdPz, ""))));
      AV18grm2 = (java.math.BigDecimal)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18grm2", GXutil.ltrimstr( AV18grm2, 8, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRM2", getSecureSignedToken( "", localUtil.format( AV18grm2, "ZZZZ9.99")));
      AV19Kms = (String)getParm(obj,15) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Kms", AV19Kms);
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
      pa26K2( ) ;
      ws26K2( ) ;
      we26K2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016451247", true, true);
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
      httpContext.AddJavascriptSource("pedidosclientesindetalle/mantenimientorollos__upd_mts.js", "?202661016451247", false, true);
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
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      edtavMetpiecod_Internalname = "vMETPIECOD" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavBarpiekil_Internalname = "vBARPIEKIL" ;
      edtavBarpiemet_Internalname = "vBARPIEMET" ;
      edtavBarancaca1_Internalname = "vBARANCACA1" ;
      edtavMetpiemtd_Internalname = "vMETPIEMTD" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      bttBtnrecalculametros_Internalname = "BTNRECALCULAMETROS" ;
      bttBtnrecalculakilos_Internalname = "BTNRECALCULAKILOS" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_confirmar_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
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
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavMetpiemtd_Jsonclick = "" ;
      edtavMetpiemtd_Enabled = 1 ;
      edtavBarancaca1_Jsonclick = "" ;
      edtavBarancaca1_Enabled = 1 ;
      edtavBarpiemet_Jsonclick = "" ;
      edtavBarpiemet_Enabled = 1 ;
      edtavBarpiekil_Jsonclick = "" ;
      edtavBarpiekil_Enabled = 1 ;
      edtavMetpiecod_Jsonclick = "" ;
      edtavMetpiecod_Enabled = 0 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 0 ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma los Kilos-Metros Pieza?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Datos", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion General", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Mantenimiento Rollos (Modificacion Mts, KIlos)", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV8BarUnimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV25Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV16BarRdt',fld:'vBARRDT',pic:'ZZ9.99',hsh:true},{av:'AV15Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV7METPIEMET',fld:'vMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV11MetPieKil',fld:'vMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV10MetPieAnc',fld:'vMETPIEANC',pic:'ZZ9',hsh:true},{av:'AV17IdPz',fld:'vIDPZ',pic:'',hsh:true},{av:'AV18grm2',fld:'vGRM2',pic:'ZZZZ9.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1326K1',iparms:[{av:'AV20BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV22barpiekil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e1426K2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV8BarUnimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV20BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV25Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV22barpiekil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV16BarRdt',fld:'vBARRDT',pic:'ZZ9.99',hsh:true},{av:'AV15Barpes',fld:'vBARPES',pic:'ZZZ9',hsh:true},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV13BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV12METPIECOD',fld:'vMETPIECOD',pic:''},{av:'AV21BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV5METTERCOD',fld:'vMETTERCOD',pic:''},{av:'AV23MetPieId',fld:'vMETPIEID',pic:''},{av:'AV19Kms',fld:'vKMS',pic:''},{av:'AV24MetPieMtd',fld:'vMETPIEMTD',pic:'ZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV20BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV22barpiekil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV24MetPieMtd',fld:'vMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV19Kms',fld:'vKMS',pic:''},{av:'AV23MetPieId',fld:'vMETPIEID',pic:''},{av:'AV5METTERCOD',fld:'vMETTERCOD',pic:''},{av:'AV21BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV12METPIECOD',fld:'vMETPIECOD',pic:''},{av:'AV13BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV6BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV14BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1626K2',iparms:[{av:'AV19Kms',fld:'vKMS',pic:''},{av:'AV12METPIECOD',fld:'vMETPIECOD',pic:''},{av:'AV13BarCodpar',fld:'vBARCODPAR',pic:''},{av:'AV6BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV14BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5METTERCOD',fld:'vMETTERCOD',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DORECALCULAMETROS'","{handler:'e1126K1',iparms:[{av:'AV22barpiekil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV21BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV24MetPieMtd',fld:'vMETPIEMTD',pic:'ZZZZ9.99'}]");
      setEventMetadata("'DORECALCULAMETROS'",",oparms:[{av:'AV20BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("'DORECALCULAKILOS'","{handler:'e1226K1',iparms:[{av:'AV20BarPieMet',fld:'vBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV21BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV24MetPieMtd',fld:'vMETPIEMTD',pic:'ZZZZ9.99'}]");
      setEventMetadata("'DORECALCULAKILOS'",",oparms:[{av:'AV22barpiekil',fld:'vBARPIEKIL',pic:'ZZZZZ9.99'}]}");
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
      wcpOAV26EmprCod = "" ;
      wcpOAV5METTERCOD = "" ;
      wcpOAV13BarCodpar = "" ;
      wcpOAV12METPIECOD = "" ;
      wcpOAV7METPIEMET = DecimalUtil.ZERO ;
      wcpOAV11MetPieKil = DecimalUtil.ZERO ;
      wcpOAV8BarUnimed = "" ;
      wcpOAV16BarRdt = DecimalUtil.ZERO ;
      wcpOAV17IdPz = "" ;
      wcpOAV18grm2 = DecimalUtil.ZERO ;
      wcpOAV19Kms = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV26EmprCod = "" ;
      AV5METTERCOD = "" ;
      AV13BarCodpar = "" ;
      AV12METPIECOD = "" ;
      AV7METPIEMET = DecimalUtil.ZERO ;
      AV11MetPieKil = DecimalUtil.ZERO ;
      AV8BarUnimed = "" ;
      AV16BarRdt = DecimalUtil.ZERO ;
      AV17IdPz = "" ;
      AV18grm2 = DecimalUtil.ZERO ;
      AV19Kms = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23MetPieId = "" ;
      AV30Anchom = DecimalUtil.ZERO ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV22barpiekil = DecimalUtil.ZERO ;
      AV20BarPieMet = DecimalUtil.ZERO ;
      AV24MetPieMtd = DecimalUtil.ZERO ;
      bttBtnrecalculametros_Jsonclick = "" ;
      bttBtnrecalculakilos_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV27Station = "" ;
      GXt_char1 = "" ;
      AV28EmprNom = "" ;
      AV29UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int10 = new short[1] ;
      GXv_char11 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      AV33Pgmname = "PedidosClienteSinDetalle.MantenimientoRollos__Upd_Mts" ;
      /* GeneXus formulas. */
      AV33Pgmname = "PedidosClienteSinDetalle.MantenimientoRollos__Upd_Mts" ;
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavMetpiecod_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV6BarCodreo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV6BarCodreo ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private short wcpOAV10MetPieAnc ;
   private short wcpOAV9BarTrocal1 ;
   private short wcpOAV15Barpes ;
   private short AV10MetPieAnc ;
   private short AV9BarTrocal1 ;
   private short AV15Barpes ;
   private short AV25Moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV21BarAncAca1 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int10[] ;
   private int wcpOAV14BarCod ;
   private int AV14BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavMetpiecod_Enabled ;
   private int edtavBarpiekil_Enabled ;
   private int edtavBarpiemet_Enabled ;
   private int edtavBarancaca1_Enabled ;
   private int edtavMetpiemtd_Enabled ;
   private int edtavPgmname_Enabled ;
   private int GXv_int7[] ;
   private int idxLst ;
   private java.math.BigDecimal wcpOAV7METPIEMET ;
   private java.math.BigDecimal wcpOAV11MetPieKil ;
   private java.math.BigDecimal wcpOAV16BarRdt ;
   private java.math.BigDecimal wcpOAV18grm2 ;
   private java.math.BigDecimal AV7METPIEMET ;
   private java.math.BigDecimal AV11MetPieKil ;
   private java.math.BigDecimal AV16BarRdt ;
   private java.math.BigDecimal AV18grm2 ;
   private java.math.BigDecimal AV30Anchom ;
   private java.math.BigDecimal AV22barpiekil ;
   private java.math.BigDecimal AV20BarPieMet ;
   private java.math.BigDecimal AV24MetPieMtd ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private String wcpOAV26EmprCod ;
   private String wcpOAV5METTERCOD ;
   private String wcpOAV13BarCodpar ;
   private String wcpOAV12METPIECOD ;
   private String wcpOAV8BarUnimed ;
   private String wcpOAV17IdPz ;
   private String wcpOAV19Kms ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV26EmprCod ;
   private String AV5METTERCOD ;
   private String AV13BarCodpar ;
   private String AV12METPIECOD ;
   private String AV8BarUnimed ;
   private String AV17IdPz ;
   private String AV19Kms ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV23MetPieId ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String edtavMetpiecod_Internalname ;
   private String edtavMetpiecod_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavBarpiekil_Internalname ;
   private String TempTags ;
   private String edtavBarpiekil_Jsonclick ;
   private String edtavBarpiemet_Internalname ;
   private String edtavBarpiemet_Jsonclick ;
   private String edtavBarancaca1_Internalname ;
   private String edtavBarancaca1_Jsonclick ;
   private String edtavMetpiemtd_Internalname ;
   private String edtavMetpiemtd_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String bttBtnrecalculametros_Internalname ;
   private String bttBtnrecalculametros_Jsonclick ;
   private String bttBtnrecalculakilos_Internalname ;
   private String bttBtnrecalculakilos_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV33Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV27Station ;
   private String GXt_char1 ;
   private String AV28EmprNom ;
   private String AV29UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.webpanels.GXWebForm Form ;
}

