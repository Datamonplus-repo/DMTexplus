package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webenvioatalbarancomercial_impl extends GXDataArea
{
   public webenvioatalbarancomercial_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webenvioatalbarancomercial_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webenvioatalbarancomercial_impl.class ));
   }

   public webenvioatalbarancomercial_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "AlbProcod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "AlbProcod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "AlbProcod") ;
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
            AV12AlbProcod = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AlbProcod), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12AlbProcod), "ZZZZZZZZZ9")));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV9AlbComFd = httpContext.GetPar( "AlbComFd") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9AlbComFd", AV9AlbComFd);
               AV10TipoDoc = (byte)(GXutil.lval( httpContext.GetPar( "TipoDoc"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10TipoDoc", GXutil.str( AV10TipoDoc, 1, 0));
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
      paNF2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startNF2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webenvioatalbarancomercial", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV12AlbProcod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV9AlbComFd)),GXutil.URLEncode(GXutil.ltrimstr(AV10TipoDoc,1,0))}, new String[] {"AlbProcod","AlbComFd","TipoDoc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV50FirmaD), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVURL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71Vurl, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATH1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59Path1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVPFX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70Vpfx, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVPASSPFX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV69Vpasspfx, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51hb), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERCOM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68VerCom), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vATVECES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28ATVeces), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12AlbProcod), "ZZZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WebEnvioATAlbaranComercial");
      forbiddenHiddens.add("Dir", GXutil.rtrim( localUtil.format( AV34Dir, "")));
      forbiddenHiddens.add("UserAT", GXutil.rtrim( localUtil.format( AV64UserAT, "")));
      forbiddenHiddens.add("PassAT", GXutil.rtrim( localUtil.format( AV57PassAT, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("webenvioatalbarancomercial:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBDOC", GXutil.ltrim( localUtil.ntoc( AV73AlbDoc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPODOC", GXutil.ltrim( localUtil.ntoc( AV10TipoDoc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMCOD", GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMFCH", localUtil.dtoc( A17AlbComFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMID", GXutil.rtrim( A10740AlbComID));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMPRI", GXutil.rtrim( A22AlbComPri));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMFD", GXutil.rtrim( A10014AlbComFd));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV50FirmaD, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV50FirmaD), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVURL", GXutil.rtrim( AV71Vurl));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVURL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71Vurl, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATH1", GXutil.rtrim( AV59Path1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATH1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59Path1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vVPFX", GXutil.rtrim( AV70Vpfx));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVPFX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70Vpfx, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vVPASSPFX", GXutil.rtrim( AV69Vpasspfx));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVPASSPFX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV69Vpasspfx, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHB", GXutil.ltrim( localUtil.ntoc( AV51hb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51hb), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVERCOM", GXutil.ltrim( localUtil.ntoc( AV68VerCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERCOM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68VerCom), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOKAT", GXutil.ltrim( localUtil.ntoc( AV56OkAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRAT", GXutil.ltrim( localUtil.ntoc( AV40ErrAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vATVECES", GXutil.ltrim( localUtil.ntoc( AV28ATVeces, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vATVECES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28ATVeces), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAXINT", GXutil.ltrim( localUtil.ntoc( AV53MaxInt, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFILER", GXutil.rtrim( AV18FileR));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNENVIAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnenviar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNENVIAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnenviar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNENVIAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnenviar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNENVIAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnenviar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNENVIAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnenviar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNENVIAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnenviar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNENVIAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnenviar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNENVIAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnenviar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNENVIAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnenviar_Result));
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
         weNF2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtNF2( ) ;
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
      return formatLink("app.webenvioatalbarancomercial", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV12AlbProcod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV9AlbComFd)),GXutil.URLEncode(GXutil.ltrimstr(AV10TipoDoc,1,0))}, new String[] {"AlbProcod","AlbComFd","TipoDoc"})  ;
   }

   public String getPgmname( )
   {
      return "WebEnvioATAlbaranComercial" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Envio Albaran Comercial", "") ;
   }

   public void wbNF0( )
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
         wb_table1_17_NF2( true) ;
      }
      else
      {
         wb_table1_17_NF2( false) ;
      }
      return  ;
   }

   public void wb_table1_17_NF2e( boolean wbgen )
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
         wb_table2_35_NF2( true) ;
      }
      else
      {
         wb_table2_35_NF2( false) ;
      }
      return  ;
   }

   public void wb_table2_35_NF2e( boolean wbgen )
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
         wb_table3_84_NF2( true) ;
      }
      else
      {
         wb_table3_84_NF2( false) ;
      }
      return  ;
   }

   public void wb_table3_84_NF2e( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         wb_table4_91_NF2( true) ;
      }
      else
      {
         wb_table4_91_NF2( false) ;
      }
      return  ;
   }

   public void wb_table4_91_NF2e( boolean wbgen )
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

   public void startNF2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Envio Albaran Comercial", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupNF0( ) ;
   }

   public void wsNF2( )
   {
      startNF2( ) ;
      evtNF2( ) ;
   }

   public void evtNF2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNENVIAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e11NF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e12NF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e13NF2 ();
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

   public void weNF2( )
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

   public void paNF2( )
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
            GX_FocusControl = edtavFechhh_Internalname ;
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
      rfNF2( ) ;
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
      edtavAlbcomfd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbcomfd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbcomfd_Enabled), 5, 0), true);
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      edtavDir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDir_Enabled), 5, 0), true);
      edtavUserat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUserat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUserat_Enabled), 5, 0), true);
      edtavPassat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPassat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPassat_Enabled), 5, 0), true);
   }

   public void rfNF2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00NF2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = H00NF2_A396EmprCod[0] ;
            /* Execute user event: Load */
            e13NF2 ();
            pr_default.readNext(0);
         }
         pr_default.close(0);
         wbNF0( ) ;
      }
   }

   public void send_integrity_lvl_hashesNF2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV50FirmaD, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV50FirmaD), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVURL", GXutil.rtrim( AV71Vurl));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVURL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71Vurl, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATH1", GXutil.rtrim( AV59Path1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATH1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59Path1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vVPFX", GXutil.rtrim( AV70Vpfx));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVPFX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70Vpfx, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vVPASSPFX", GXutil.rtrim( AV69Vpasspfx));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVPASSPFX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV69Vpasspfx, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHB", GXutil.ltrim( localUtil.ntoc( AV51hb, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51hb), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVERCOM", GXutil.ltrim( localUtil.ntoc( AV68VerCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERCOM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68VerCom), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vATVECES", GXutil.ltrim( localUtil.ntoc( AV28ATVeces, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vATVECES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28ATVeces), "9")));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavAlbcomfd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbcomfd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbcomfd_Enabled), 5, 0), true);
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      edtavDir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDir_Enabled), 5, 0), true);
      edtavUserat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUserat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUserat_Enabled), 5, 0), true);
      edtavPassat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPassat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPassat_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupNF0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12NF2 ();
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
         Dvelop_confirmpanel_btnenviar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNENVIAR_Title") ;
         Dvelop_confirmpanel_btnenviar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNENVIAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnenviar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNENVIAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnenviar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNENVIAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnenviar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNENVIAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnenviar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNENVIAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnenviar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNENVIAR_Confirmtype") ;
         Dvelop_confirmpanel_btnenviar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNENVIAR_Result") ;
         /* Read variables values. */
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavFechhh_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vFECHHH");
            GX_FocusControl = edtavFechhh_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6FecHhh = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV6FecHhh", localUtil.ttoc( AV6FecHhh, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV6FecHhh = localUtil.ctot( httpContext.cgiGet( edtavFechhh_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6FecHhh", localUtil.ttoc( AV6FecHhh, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         AV34Dir = httpContext.cgiGet( edtavDir_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Dir", AV34Dir);
         AV64UserAT = httpContext.cgiGet( edtavUserat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64UserAT", AV64UserAT);
         AV57PassAT = httpContext.cgiGet( edtavPassat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57PassAT", AV57PassAT);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"WebEnvioATAlbaranComercial");
         AV34Dir = httpContext.cgiGet( edtavDir_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Dir", AV34Dir);
         forbiddenHiddens.add("Dir", GXutil.rtrim( localUtil.format( AV34Dir, "")));
         AV64UserAT = httpContext.cgiGet( edtavUserat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64UserAT", AV64UserAT);
         forbiddenHiddens.add("UserAT", GXutil.rtrim( localUtil.format( AV64UserAT, "")));
         AV57PassAT = httpContext.cgiGet( edtavPassat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57PassAT", AV57PassAT);
         forbiddenHiddens.add("PassAT", GXutil.rtrim( localUtil.format( AV57PassAT, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("webenvioatalbarancomercial:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e12NF2 ();
      if (returnInSub) return;
   }

   public void e12NF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV62Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webenvioatalbarancomercial_impl.this.GXt_char1 = GXv_char2[0] ;
      AV62Station = GXt_char1 ;
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV39EmprNom ;
      GXv_char4[0] = AV65UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV62Station, GXv_char2, GXv_char3, GXv_char4) ;
      webenvioatalbarancomercial_impl.this.AV7EmprCod = GXv_char2[0] ;
      webenvioatalbarancomercial_impl.this.AV39EmprNom = GXv_char3[0] ;
      webenvioatalbarancomercial_impl.this.AV65UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      GXt_char1 = AV34Dir ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "SAFTW1", ""), GXv_char4) ;
      webenvioatalbarancomercial_impl.this.GXt_char1 = GXv_char4[0] ;
      AV34Dir = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Dir", AV34Dir);
      if ( GXutil.strcmp(AV34Dir, "") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Path ¡¡¡¡.Revisar Contador SAFTW1", ""));
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      GXt_char1 = AV64UserAT ;
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "USEAT2", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      webenvioatalbarancomercial_impl.this.AV7EmprCod = GXv_char4[0] ;
      webenvioatalbarancomercial_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      AV64UserAT = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64UserAT", AV64UserAT);
      GXt_char1 = AV57PassAT ;
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "PASAT2", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      webenvioatalbarancomercial_impl.this.AV7EmprCod = GXv_char4[0] ;
      webenvioatalbarancomercial_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      AV57PassAT = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57PassAT", AV57PassAT);
      AV71Vurl = httpContext.getMessage( "urlt", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Vurl", AV71Vurl);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVURL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71Vurl, ""))));
      GXt_char1 = AV71Vurl ;
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "URL", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      webenvioatalbarancomercial_impl.this.AV7EmprCod = GXv_char4[0] ;
      webenvioatalbarancomercial_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      AV71Vurl = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Vurl", AV71Vurl);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVURL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71Vurl, ""))));
      GXt_char1 = AV70Vpfx ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "PFX", ""), GXv_char4) ;
      webenvioatalbarancomercial_impl.this.GXt_char1 = GXv_char4[0] ;
      AV70Vpfx = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Vpfx", AV70Vpfx);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVPFX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70Vpfx, ""))));
      GXt_char1 = AV69Vpasspfx ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "PASPFX", ""), GXv_char4) ;
      webenvioatalbarancomercial_impl.this.GXt_char1 = GXv_char4[0] ;
      AV69Vpasspfx = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69Vpasspfx", AV69Vpasspfx);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVPASSPFX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV69Vpasspfx, ""))));
      GXt_int5 = AV68VerCom ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "APISEN", ""), GXv_int6) ;
      webenvioatalbarancomercial_impl.this.GXt_int5 = GXv_int6[0] ;
      AV68VerCom = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68VerCom", GXutil.str( AV68VerCom, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERCOM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68VerCom), "9")));
      GXt_int5 = AV51hb ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "HEABOD", ""), GXv_int6) ;
      webenvioatalbarancomercial_impl.this.GXt_int5 = GXv_int6[0] ;
      AV51hb = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51hb", GXutil.str( AV51hb, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51hb), "9")));
      GXt_int5 = AV28ATVeces ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "ATINTE", ""), GXv_int6) ;
      webenvioatalbarancomercial_impl.this.GXt_int5 = GXv_int6[0] ;
      AV28ATVeces = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28ATVeces", GXutil.str( AV28ATVeces, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vATVECES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28ATVeces), "9")));
      GXt_int5 = AV50FirmaD ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
      webenvioatalbarancomercial_impl.this.GXt_int5 = GXv_int6[0] ;
      AV50FirmaD = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50FirmaD", GXutil.str( AV50FirmaD, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV50FirmaD), "9")));
      GXt_dtime7 = AV6FecHhh ;
      GXv_dtime8[0] = GXt_dtime7 ;
      new app.stocksquimicos.ptrz001(remoteHandle, context).execute( AV7EmprCod, GXv_dtime8) ;
      webenvioatalbarancomercial_impl.this.GXt_dtime7 = GXv_dtime8[0] ;
      AV6FecHhh = GXt_dtime7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6FecHhh", localUtil.ttoc( AV6FecHhh, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      /* Using cursor H00NF3 */
      pr_default.execute(1, new Object[] {AV7EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = H00NF3_A396EmprCod[0] ;
         A395EmprCif = H00NF3_A395EmprCif[0] ;
         n395EmprCif = H00NF3_n395EmprCif[0] ;
         AV11EmprCif = A395EmprCif ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void e11NF2( )
   {
      /* Dvelop_confirmpanel_btnenviar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnenviar_Result, "Yes") == 0 )
      {
         AV5DiaHact = GXutil.serverNow( context, remoteHandle, pr_default) ;
         if ( AV6FecHhh.before( GXutil.serverNow( context, remoteHandle, pr_default) ) )
         {
            Gx_msg = httpContext.getMessage( "Erro. Dia-Hora ", "") + localUtil.ttoc( AV6FecHhh, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " inferior a ", "") + localUtil.ttoc( AV5DiaHact, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            httpContext.GX_msglist.addItem(Gx_msg);
            GX_FocusControl = edtavFechhh_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXv_char4[0] = AV7EmprCod ;
            GXv_int9[0] = AV73AlbDoc ;
            GXv_dtime8[0] = AV6FecHhh ;
            GXv_int6[0] = AV10TipoDoc ;
            new app.phhmmx(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_dtime8, GXv_int6) ;
            webenvioatalbarancomercial_impl.this.AV7EmprCod = GXv_char4[0] ;
            webenvioatalbarancomercial_impl.this.AV73AlbDoc = GXv_int9[0] ;
            webenvioatalbarancomercial_impl.this.AV6FecHhh = GXv_dtime8[0] ;
            webenvioatalbarancomercial_impl.this.AV10TipoDoc = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV73AlbDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AlbDoc), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV6FecHhh", localUtil.ttoc( AV6FecHhh, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            httpContext.ajax_rsp_assign_attri("", false, "AV10TipoDoc", GXutil.str( AV10TipoDoc, 1, 0));
            AV74Calcom = (byte)(0) ;
            /* Using cursor H00NF4 */
            pr_default.execute(2, new Object[] {AV7EmprCod, Long.valueOf(AV12AlbProcod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A14AlbComCod = H00NF4_A14AlbComCod[0] ;
               A396EmprCod = H00NF4_A396EmprCod[0] ;
               A17AlbComFch = H00NF4_A17AlbComFch[0] ;
               A10740AlbComID = H00NF4_A10740AlbComID[0] ;
               A22AlbComPri = H00NF4_A22AlbComPri[0] ;
               A10014AlbComFd = H00NF4_A10014AlbComFd[0] ;
               AV14AlbProfch = A17AlbComFch ;
               AV15ALbLic = A10740AlbComID ;
               AV74Calcom = (byte)(1) ;
               AV16AlbCOmPri = A22AlbComPri ;
               AV8AlbComcod = A14AlbComCod ;
               AV17Albfmd = A10014AlbComFd ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            if ( GXutil.strcmp(AV34Dir, "") == 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Path ¡¡¡¡.Revisar Contador SAFTW1", ""));
            }
            else
            {
               if ( AV74Calcom == 0 )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Nao Existe N Guia¡¡¡", ""));
               }
               else
               {
                  if ( (GXutil.strcmp("", AV17Albfmd)==0) && ( AV50FirmaD == 1 ) )
                  {
                     Gx_msg = httpContext.getMessage( "Atenção O código HASH está faltando.", "") + GXutil.newLine( ) ;
                     Gx_msg += httpContext.getMessage( "É necessário criar o HASH para o documento.", "") + GXutil.newLine( ) ;
                     Gx_msg += httpContext.getMessage( "Você tem que pressionar o botão Criar HASH.", "") ;
                     httpContext.GX_msglist.addItem(Gx_msg);
                  }
                  else
                  {
                     if ( GXutil.strcmp(AV16AlbCOmPri, "1") == 0 )
                     {
                        AV45Fichero = httpContext.getMessage( "GR3", "") + GXutil.padl( GXutil.trim( GXutil.str( AV8AlbComcod, 8, 0)), (short)(8), "0") ;
                     }
                     else
                     {
                        AV45Fichero = httpContext.getMessage( "GT4", "") + GXutil.padl( GXutil.trim( GXutil.str( AV8AlbComcod, 8, 0)), (short)(8), "0") ;
                     }
                     AV13File.setSource( GXutil.trim( AV34Dir)+"\\"+GXutil.trim( AV45Fichero)+httpContext.getMessage( ".xml", "") );
                     AV58Path = GXutil.trim( AV34Dir) ;
                     System.out.println( httpContext.getMessage( "Go PGCXML", "") );
                     GXv_char4[0] = AV7EmprCod ;
                     GXv_int9[0] = AV8AlbComcod ;
                     GXv_char3[0] = AV58Path ;
                     GXv_char2[0] = AV45Fichero ;
                     GXv_objcol_SdtMessages_Message10[0] = AV76messages ;
                     GXv_boolean11[0] = AV75isOk ;
                     new app.albaranescomerciales.pgcxml(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3, GXv_char2, GXv_objcol_SdtMessages_Message10, GXv_boolean11) ;
                     webenvioatalbarancomercial_impl.this.AV7EmprCod = GXv_char4[0] ;
                     webenvioatalbarancomercial_impl.this.AV8AlbComcod = GXv_int9[0] ;
                     webenvioatalbarancomercial_impl.this.AV58Path = GXv_char3[0] ;
                     webenvioatalbarancomercial_impl.this.AV45Fichero = GXv_char2[0] ;
                     AV76messages = GXv_objcol_SdtMessages_Message10[0] ;
                     webenvioatalbarancomercial_impl.this.AV75isOk = GXv_boolean11[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
                     System.out.println( httpContext.getMessage( "Return PGCXML", "") );
                     AV13File.setSource( AV45Fichero );
                     if ( AV13File.exists() )
                     {
                        AV31Comm = httpContext.getMessage( "apisender2 -", "") ;
                        AV31Comm += GXutil.trim( AV71Vurl) + " " ;
                        AV31Comm += httpContext.getMessage( "-p ", "") + GXutil.trim( AV34Dir) + " " + GXutil.trim( AV59Path1) ;
                        AV31Comm += httpContext.getMessage( "-cat ChavePublicaAT.cer ", "") ;
                        AV31Comm += httpContext.getMessage( "-c ", "") + GXutil.trim( AV70Vpfx) + " " ;
                        AV31Comm += httpContext.getMessage( "-cpass ", "") + GXutil.trim( AV69Vpasspfx) + " " ;
                        AV31Comm += httpContext.getMessage( "-user ", "") + GXutil.trim( AV64UserAT) + " " ;
                        AV31Comm += httpContext.getMessage( "-pass ", "") + GXutil.trim( AV57PassAT) + " " ;
                        AV31Comm += httpContext.getMessage( "-fi ", "") + GXutil.trim( AV45Fichero) + httpContext.getMessage( ".xml", "") + " " ;
                        AV31Comm += httpContext.getMessage( "-fo ", "") + GXutil.trim( AV45Fichero) + httpContext.getMessage( "result", "") + httpContext.getMessage( ".xml", "") ;
                        if ( AV51hb == 1 )
                        {
                           AV31Comm += httpContext.getMessage( " -hb ", "") + GXutil.trim( AV45Fichero) + httpContext.getMessage( "_hb", "") + httpContext.getMessage( ".xml", "") ;
                        }
                        if ( AV68VerCom == 1 )
                        {
                           httpContext.GX_msglist.addItem(AV31Comm);
                        }
                        AV61Resultado = (short)(GXutil.shell( AV31Comm, 1, 0)) ;
                        AV18FileR = GXutil.trim( AV34Dir) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV18FileR", AV18FileR);
                        if ( GXutil.strcmp(AV16AlbCOmPri, "1") == 0 )
                        {
                           AV18FileR += httpContext.getMessage( "\\GR3", "") + GXutil.padl( GXutil.trim( GXutil.str( AV8AlbComcod, 8, 0)), (short)(8), "0") + httpContext.getMessage( "result", "") + httpContext.getMessage( ".xml", "") ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV18FileR", AV18FileR);
                        }
                        else
                        {
                           AV18FileR += httpContext.getMessage( "\\GT4", "") + GXutil.padl( GXutil.trim( GXutil.str( AV8AlbComcod, 8, 0)), (short)(8), "0") + httpContext.getMessage( "result", "") + httpContext.getMessage( ".xml", "") ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV18FileR", AV18FileR);
                        }
                        AV13File.setSource( AV18FileR );
                        if ( AV13File.exists() )
                        {
                           System.out.println( httpContext.getMessage( "Go PATWS01", "") );
                           GXv_char4[0] = AV7EmprCod ;
                           GXv_char3[0] = AV18FileR ;
                           GXv_int9[0] = AV8AlbComcod ;
                           GXv_int6[0] = AV56OkAT ;
                           GXv_int12[0] = AV40ErrAT ;
                           new app.patws01(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int9, GXv_int6, GXv_int12) ;
                           webenvioatalbarancomercial_impl.this.AV7EmprCod = GXv_char4[0] ;
                           webenvioatalbarancomercial_impl.this.AV18FileR = GXv_char3[0] ;
                           webenvioatalbarancomercial_impl.this.AV8AlbComcod = GXv_int9[0] ;
                           webenvioatalbarancomercial_impl.this.AV56OkAT = GXv_int6[0] ;
                           webenvioatalbarancomercial_impl.this.AV40ErrAT = GXv_int12[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV18FileR", AV18FileR);
                           httpContext.ajax_rsp_assign_attri("", false, "AV56OkAT", GXutil.str( AV56OkAT, 1, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV40ErrAT", GXutil.str( AV40ErrAT, 1, 0));
                           System.out.println( httpContext.getMessage( "Return PATWS01", "") );
                           if ( ( AV56OkAT == 0 ) && ( AV28ATVeces == 1 ) )
                           {
                              Gx_msg = httpContext.getMessage( "Não houve qualquer sucesso.", "") + GXutil.chr( (short)(13)) ;
                              Gx_msg += httpContext.getMessage( "Quer enviar de volta ao AT?", "") + GXutil.chr( (short)(13)) ;
                              GXutil.Confirmed = true;
                              if ( GXutil.Confirmed )
                              {
                                 AV52Int = (byte)(1) ;
                                 if ( AV53MaxInt == 0 )
                                 {
                                    AV53MaxInt = (byte)(1) ;
                                    httpContext.ajax_rsp_assign_attri("", false, "AV53MaxInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53MaxInt), 2, 0));
                                 }
                                 while ( AV52Int <= AV53MaxInt )
                                 {
                                    System.out.println( httpContext.getMessage( "2.Go PATWS01", "") );
                                    GXv_char4[0] = AV7EmprCod ;
                                    GXv_char3[0] = AV18FileR ;
                                    GXv_int9[0] = AV8AlbComcod ;
                                    GXv_int12[0] = AV56OkAT ;
                                    GXv_int6[0] = AV40ErrAT ;
                                    new app.patws01(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int9, GXv_int12, GXv_int6) ;
                                    webenvioatalbarancomercial_impl.this.AV7EmprCod = GXv_char4[0] ;
                                    webenvioatalbarancomercial_impl.this.AV18FileR = GXv_char3[0] ;
                                    webenvioatalbarancomercial_impl.this.AV8AlbComcod = GXv_int9[0] ;
                                    webenvioatalbarancomercial_impl.this.AV56OkAT = GXv_int12[0] ;
                                    webenvioatalbarancomercial_impl.this.AV40ErrAT = GXv_int6[0] ;
                                    httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
                                    httpContext.ajax_rsp_assign_attri("", false, "AV18FileR", AV18FileR);
                                    httpContext.ajax_rsp_assign_attri("", false, "AV56OkAT", GXutil.str( AV56OkAT, 1, 0));
                                    httpContext.ajax_rsp_assign_attri("", false, "AV40ErrAT", GXutil.str( AV40ErrAT, 1, 0));
                                    System.out.println( httpContext.getMessage( "2.Return PATWS01", "") );
                                    AV52Int = (byte)(AV52Int+1) ;
                                 }
                              }
                           }
                           System.out.println( httpContext.getMessage( "Proceso Finalizado ¡¡¡¡", "") );
                           httpContext.setWebReturnParms(new Object[] {});
                           httpContext.setWebReturnParmsMetadata(new Object[] {});
                           httpContext.wjLocDisableFrm = (byte)(1) ;
                           httpContext.nUserReturn = (byte)(1) ;
                           returnInSub = true;
                           if (true) return;
                        }
                        else
                        {
                           AV55Msg_errr = httpContext.getMessage( "Nenhum arquivo ", "") + GXutil.trim( AV18FileR) + httpContext.getMessage( " foi criado ¡¡¡", "") ;
                           httpContext.GX_msglist.addItem(AV55Msg_errr);
                           httpContext.setWebReturnParms(new Object[] {});
                           httpContext.setWebReturnParmsMetadata(new Object[] {});
                           httpContext.wjLocDisableFrm = (byte)(1) ;
                           httpContext.nUserReturn = (byte)(1) ;
                           returnInSub = true;
                           if (true) return;
                        }
                     }
                     else
                     {
                        AV55Msg_errr = httpContext.getMessage( "Nenhum arquivo ", "") + GXutil.trim( AV18FileR) + httpContext.getMessage( " foi criado ¡¡¡", "") ;
                        httpContext.GX_msglist.addItem(AV55Msg_errr);
                        httpContext.setWebReturnParms(new Object[] {});
                        httpContext.setWebReturnParmsMetadata(new Object[] {});
                        httpContext.wjLocDisableFrm = (byte)(1) ;
                        httpContext.nUserReturn = (byte)(1) ;
                        returnInSub = true;
                        if (true) return;
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e13NF2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table4_91_NF2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnenviar_Internalname, tblTabledvelop_confirmpanel_btnenviar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnenviar.setProperty("Title", Dvelop_confirmpanel_btnenviar_Title);
         ucDvelop_confirmpanel_btnenviar.setProperty("ConfirmationText", Dvelop_confirmpanel_btnenviar_Confirmationtext);
         ucDvelop_confirmpanel_btnenviar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnenviar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnenviar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnenviar_Nobuttoncaption);
         ucDvelop_confirmpanel_btnenviar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnenviar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnenviar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnenviar_Yesbuttonposition);
         ucDvelop_confirmpanel_btnenviar.setProperty("ConfirmType", Dvelop_confirmpanel_btnenviar_Confirmtype);
         ucDvelop_confirmpanel_btnenviar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnenviar_Internalname, "DVELOP_CONFIRMPANEL_BTNENVIARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNENVIARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_91_NF2e( true) ;
      }
      else
      {
         wb_table4_91_NF2e( false) ;
      }
   }

   public void wb_table3_84_NF2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable3_Internalname, tblUnnamedtable3_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenviar_Internalname, "", httpContext.getMessage( "Enviar AT", ""), bttBtnenviar_Jsonclick, 7, httpContext.getMessage( "Enviar AT", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e14nf1_client"+"'", TempTags, "", 2, "HLP_WebEnvioATAlbaranComercial.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_84_NF2e( true) ;
      }
      else
      {
         wb_table3_84_NF2e( false) ;
      }
   }

   public void wb_table2_35_NF2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbprocod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbprocod_Internalname, httpContext.getMessage( "Nº Guia", ""), "", "", lblTextblockalbprocod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebEnvioATAlbaranComercial.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocod_Internalname, httpContext.getMessage( "Nº Albaran", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV12AlbProcod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12AlbProcod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12AlbProcod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebEnvioATAlbaranComercial.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabledir_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockdir_Internalname, httpContext.getMessage( "Path entrega e resposta", ""), "", "", lblTextblockdir_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebEnvioATAlbaranComercial.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDir_Internalname, httpContext.getMessage( "Dir", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDir_Internalname, GXutil.rtrim( AV34Dir), GXutil.rtrim( localUtil.format( AV34Dir, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDir_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDir_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebEnvioATAlbaranComercial.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableuserat_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockuserat_Internalname, httpContext.getMessage( "Utilizador Portal Finanzas", ""), "", "", lblTextblockuserat_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebEnvioATAlbaranComercial.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUserat_Internalname, httpContext.getMessage( "User AT", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUserat_Internalname, GXutil.rtrim( AV64UserAT), GXutil.rtrim( localUtil.format( AV64UserAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUserat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUserat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebEnvioATAlbaranComercial.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablepassat_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockpassat_Internalname, httpContext.getMessage( "Senha acceso do Utilizador", ""), "", "", lblTextblockpassat_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebEnvioATAlbaranComercial.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPassat_Internalname, httpContext.getMessage( "Pass AT", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPassat_Internalname, GXutil.rtrim( AV57PassAT), GXutil.rtrim( localUtil.format( AV57PassAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPassat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPassat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebEnvioATAlbaranComercial.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_35_NF2e( true) ;
      }
      else
      {
         wb_table2_35_NF2e( false) ;
      }
   }

   public void wb_table1_17_NF2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavFechhh_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechhh_Internalname, httpContext.getMessage( "Dia-Hora", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechhh_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechhh_Internalname, localUtil.ttoc( AV6FecHhh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV6FecHhh, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,24);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechhh_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechhh_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebEnvioATAlbaranComercial.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechhh_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechhh_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebEnvioATAlbaranComercial.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbcomfd_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbcomfd_Internalname, httpContext.getMessage( "Firma Digital", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavAlbcomfd_Internalname, GXutil.rtrim( AV9AlbComFd), "", "", (short)(0), 1, edtavAlbcomfd_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WebEnvioATAlbaranComercial.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncrearhash_Internalname, "", httpContext.getMessage( "Crear Hash", ""), bttBtncrearhash_Jsonclick, 7, httpContext.getMessage( "Crear Hash", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e15nf1_client"+"'", TempTags, "", 2, "HLP_WebEnvioATAlbaranComercial.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_17_NF2e( true) ;
      }
      else
      {
         wb_table1_17_NF2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV12AlbProcod = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AlbProcod), 10, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12AlbProcod), "ZZZZZZZZZ9")));
      AV9AlbComFd = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbComFd", AV9AlbComFd);
      AV10TipoDoc = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10TipoDoc", GXutil.str( AV10TipoDoc, 1, 0));
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
      paNF2( ) ;
      wsNF2( ) ;
      weNF2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241513443", true, true);
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
      httpContext.AddJavascriptSource("webenvioatalbarancomercial.js", "?20268241513444", false, true);
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
      edtavFechhh_Internalname = "vFECHHH" ;
      edtavAlbcomfd_Internalname = "vALBCOMFD" ;
      bttBtncrearhash_Internalname = "BTNCREARHASH" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTextblockalbprocod_Internalname = "TEXTBLOCKALBPROCOD" ;
      edtavAlbprocod_Internalname = "vALBPROCOD" ;
      divUnnamedtablealbprocod_Internalname = "UNNAMEDTABLEALBPROCOD" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTextblockdir_Internalname = "TEXTBLOCKDIR" ;
      edtavDir_Internalname = "vDIR" ;
      divUnnamedtabledir_Internalname = "UNNAMEDTABLEDIR" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      lblTextblockuserat_Internalname = "TEXTBLOCKUSERAT" ;
      edtavUserat_Internalname = "vUSERAT" ;
      divUnnamedtableuserat_Internalname = "UNNAMEDTABLEUSERAT" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      lblTextblockpassat_Internalname = "TEXTBLOCKPASSAT" ;
      edtavPassat_Internalname = "vPASSAT" ;
      divUnnamedtablepassat_Internalname = "UNNAMEDTABLEPASSAT" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      tblUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      bttBtnenviar_Internalname = "BTNENVIAR" ;
      tblUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_btnenviar_Internalname = "DVELOP_CONFIRMPANEL_BTNENVIAR" ;
      tblTabledvelop_confirmpanel_btnenviar_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNENVIAR" ;
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
      edtavAlbcomfd_Enabled = 0 ;
      edtavFechhh_Jsonclick = "" ;
      edtavFechhh_Enabled = 1 ;
      edtavPassat_Jsonclick = "" ;
      edtavPassat_Enabled = 1 ;
      edtavUserat_Jsonclick = "" ;
      edtavUserat_Enabled = 1 ;
      edtavDir_Jsonclick = "" ;
      edtavDir_Enabled = 1 ;
      edtavAlbprocod_Jsonclick = "" ;
      edtavAlbprocod_Enabled = 0 ;
      Dvelop_confirmpanel_btnenviar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnenviar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnenviar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnenviar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnenviar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnenviar_Confirmationtext = "¿Deseja enviar a guia de remessa para a AT?" ;
      Dvelop_confirmpanel_btnenviar_Title = "" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = "" ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Datos envio AT", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Data-Hora envio AT", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Envio Albaran Comercial", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV50FirmaD',fld:'vFIRMAD',pic:'9',hsh:true},{av:'AV71Vurl',fld:'vVURL',pic:'',hsh:true},{av:'AV59Path1',fld:'vPATH1',pic:'',hsh:true},{av:'AV70Vpfx',fld:'vVPFX',pic:'',hsh:true},{av:'AV69Vpasspfx',fld:'vVPASSPFX',pic:'',hsh:true},{av:'AV51hb',fld:'vHB',pic:'9',hsh:true},{av:'AV68VerCom',fld:'vVERCOM',pic:'9',hsh:true},{av:'AV28ATVeces',fld:'vATVECES',pic:'9',hsh:true},{av:'AV12AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV34Dir',fld:'vDIR',pic:''},{av:'AV64UserAT',fld:'vUSERAT',pic:''},{av:'AV57PassAT',fld:'vPASSAT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOENVIAR'","{handler:'e14NF1',iparms:[]");
      setEventMetadata("'DOENVIAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNENVIAR.CLOSE","{handler:'e11NF2',iparms:[{av:'Dvelop_confirmpanel_btnenviar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNENVIAR',prop:'Result'},{av:'AV6FecHhh',fld:'vFECHHH',pic:'99/99/99 99:99:99'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73AlbDoc',fld:'vALBDOC',pic:'ZZZZZZZ9'},{av:'AV10TipoDoc',fld:'vTIPODOC',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV12AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'A17AlbComFch',fld:'ALBCOMFCH',pic:''},{av:'A10740AlbComID',fld:'ALBCOMID',pic:''},{av:'A22AlbComPri',fld:'ALBCOMPRI',pic:'9'},{av:'A10014AlbComFd',fld:'ALBCOMFD',pic:''},{av:'AV34Dir',fld:'vDIR',pic:''},{av:'AV50FirmaD',fld:'vFIRMAD',pic:'9',hsh:true},{av:'AV71Vurl',fld:'vVURL',pic:'',hsh:true},{av:'AV59Path1',fld:'vPATH1',pic:'',hsh:true},{av:'AV70Vpfx',fld:'vVPFX',pic:'',hsh:true},{av:'AV69Vpasspfx',fld:'vVPASSPFX',pic:'',hsh:true},{av:'AV64UserAT',fld:'vUSERAT',pic:''},{av:'AV57PassAT',fld:'vPASSAT',pic:''},{av:'AV51hb',fld:'vHB',pic:'9',hsh:true},{av:'AV68VerCom',fld:'vVERCOM',pic:'9',hsh:true},{av:'AV56OkAT',fld:'vOKAT',pic:'9'},{av:'AV40ErrAT',fld:'vERRAT',pic:'9'},{av:'AV28ATVeces',fld:'vATVECES',pic:'9',hsh:true},{av:'AV53MaxInt',fld:'vMAXINT',pic:'Z9'},{av:'AV18FileR',fld:'vFILER',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNENVIAR.CLOSE",",oparms:[{av:'AV10TipoDoc',fld:'vTIPODOC',pic:'9'},{av:'AV6FecHhh',fld:'vFECHHH',pic:'99/99/99 99:99:99'},{av:'AV73AlbDoc',fld:'vALBDOC',pic:'ZZZZZZZ9'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV18FileR',fld:'vFILER',pic:''},{av:'AV40ErrAT',fld:'vERRAT',pic:'9'},{av:'AV56OkAT',fld:'vOKAT',pic:'9'},{av:'AV53MaxInt',fld:'vMAXINT',pic:'Z9'}]}");
      setEventMetadata("'DOCREARHASH'","{handler:'e15NF1',iparms:[]");
      setEventMetadata("'DOCREARHASH'",",oparms:[]}");
      setEventMetadata("VALIDV_ALBPROCOD","{handler:'validv_Albprocod',iparms:[]");
      setEventMetadata("VALIDV_ALBPROCOD",",oparms:[]}");
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
      wcpOAV9AlbComFd = "" ;
      Dvelop_confirmpanel_btnenviar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV9AlbComFd = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV71Vurl = "" ;
      AV59Path1 = "" ;
      AV70Vpfx = "" ;
      AV69Vpasspfx = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV34Dir = "" ;
      AV64UserAT = "" ;
      AV57PassAT = "" ;
      AV7EmprCod = "" ;
      A396EmprCod = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A10740AlbComID = "" ;
      A22AlbComPri = "" ;
      A10014AlbComFd = "" ;
      AV18FileR = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H00NF2_A396EmprCod = new String[] {""} ;
      AV6FecHhh = GXutil.resetTime( GXutil.nullDate() );
      hsh = "" ;
      AV62Station = "" ;
      AV39EmprNom = "" ;
      AV65UsurCod = "" ;
      GXt_char1 = "" ;
      GXt_dtime7 = GXutil.resetTime( GXutil.nullDate() );
      H00NF3_A396EmprCod = new String[] {""} ;
      H00NF3_A395EmprCif = new String[] {""} ;
      H00NF3_n395EmprCif = new boolean[] {false} ;
      A395EmprCif = "" ;
      AV11EmprCif = "" ;
      AV5DiaHact = GXutil.resetTime( GXutil.nullDate() );
      Gx_msg = "" ;
      GXv_dtime8 = new java.util.Date[1] ;
      H00NF4_A14AlbComCod = new int[1] ;
      H00NF4_A396EmprCod = new String[] {""} ;
      H00NF4_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      H00NF4_A10740AlbComID = new String[] {""} ;
      H00NF4_A22AlbComPri = new String[] {""} ;
      H00NF4_A10014AlbComFd = new String[] {""} ;
      AV14AlbProfch = GXutil.nullDate() ;
      AV15ALbLic = "" ;
      AV16AlbCOmPri = "" ;
      AV17Albfmd = "" ;
      AV45Fichero = "" ;
      AV13File = new com.genexus.util.GXFile();
      AV58Path = "" ;
      GXv_char2 = new String[1] ;
      AV76messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message10 = new GXBaseCollection[1] ;
      GXv_boolean11 = new boolean[1] ;
      AV31Comm = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      AV55Msg_errr = "" ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_btnenviar = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnenviar_Jsonclick = "" ;
      lblTextblockalbprocod_Jsonclick = "" ;
      lblTextblockdir_Jsonclick = "" ;
      lblTextblockuserat_Jsonclick = "" ;
      lblTextblockpassat_Jsonclick = "" ;
      bttBtncrearhash_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webenvioatalbarancomercial__default(),
         new Object[] {
             new Object[] {
            H00NF2_A396EmprCod
            }
            , new Object[] {
            H00NF3_A396EmprCod, H00NF3_A395EmprCif, H00NF3_n395EmprCif
            }
            , new Object[] {
            H00NF4_A14AlbComCod, H00NF4_A396EmprCod, H00NF4_A17AlbComFch, H00NF4_A10740AlbComID, H00NF4_A22AlbComPri, H00NF4_A10014AlbComFd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavAlbcomfd_Enabled = 0 ;
      edtavAlbprocod_Enabled = 0 ;
      edtavDir_Enabled = 0 ;
      edtavUserat_Enabled = 0 ;
      edtavPassat_Enabled = 0 ;
   }

   private byte wcpOAV10TipoDoc ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV10TipoDoc ;
   private byte gxajaxcallmode ;
   private byte AV50FirmaD ;
   private byte AV51hb ;
   private byte AV68VerCom ;
   private byte AV28ATVeces ;
   private byte AV56OkAT ;
   private byte AV40ErrAT ;
   private byte AV53MaxInt ;
   private byte nDonePA ;
   private byte GXt_int5 ;
   private byte AV74Calcom ;
   private byte AV52Int ;
   private byte GXv_int12[] ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV61Resultado ;
   private int AV73AlbDoc ;
   private int A14AlbComCod ;
   private int edtavAlbcomfd_Enabled ;
   private int edtavAlbprocod_Enabled ;
   private int edtavDir_Enabled ;
   private int edtavUserat_Enabled ;
   private int edtavPassat_Enabled ;
   private int AV8AlbComcod ;
   private int GXv_int9[] ;
   private int edtavFechhh_Enabled ;
   private int idxLst ;
   private long wcpOAV12AlbProcod ;
   private long AV12AlbProcod ;
   private String wcpOAV9AlbComFd ;
   private String Dvelop_confirmpanel_btnenviar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV9AlbComFd ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV71Vurl ;
   private String AV59Path1 ;
   private String AV70Vpfx ;
   private String AV69Vpasspfx ;
   private String GXKey ;
   private String AV34Dir ;
   private String AV64UserAT ;
   private String AV57PassAT ;
   private String AV7EmprCod ;
   private String A396EmprCod ;
   private String A10740AlbComID ;
   private String A22AlbComPri ;
   private String A10014AlbComFd ;
   private String AV18FileR ;
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
   private String Dvelop_confirmpanel_btnenviar_Title ;
   private String Dvelop_confirmpanel_btnenviar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnenviar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnenviar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnenviar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnenviar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnenviar_Confirmtype ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFechhh_Internalname ;
   private String edtavAlbcomfd_Internalname ;
   private String edtavAlbprocod_Internalname ;
   private String edtavDir_Internalname ;
   private String edtavUserat_Internalname ;
   private String edtavPassat_Internalname ;
   private String scmdbuf ;
   private String hsh ;
   private String AV62Station ;
   private String AV39EmprNom ;
   private String AV65UsurCod ;
   private String GXt_char1 ;
   private String A395EmprCif ;
   private String AV11EmprCif ;
   private String Gx_msg ;
   private String AV15ALbLic ;
   private String AV16AlbCOmPri ;
   private String AV45Fichero ;
   private String AV58Path ;
   private String GXv_char2[] ;
   private String AV31Comm ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV55Msg_errr ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_btnenviar_Internalname ;
   private String Dvelop_confirmpanel_btnenviar_Internalname ;
   private String tblUnnamedtable3_Internalname ;
   private String TempTags ;
   private String bttBtnenviar_Internalname ;
   private String bttBtnenviar_Jsonclick ;
   private String tblUnnamedtable2_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divUnnamedtablealbprocod_Internalname ;
   private String lblTextblockalbprocod_Internalname ;
   private String lblTextblockalbprocod_Jsonclick ;
   private String edtavAlbprocod_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtabledir_Internalname ;
   private String lblTextblockdir_Internalname ;
   private String lblTextblockdir_Jsonclick ;
   private String edtavDir_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String divUnnamedtableuserat_Internalname ;
   private String lblTextblockuserat_Internalname ;
   private String lblTextblockuserat_Jsonclick ;
   private String edtavUserat_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String divUnnamedtablepassat_Internalname ;
   private String lblTextblockpassat_Internalname ;
   private String lblTextblockpassat_Jsonclick ;
   private String edtavPassat_Jsonclick ;
   private String tblUnnamedtable1_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String edtavFechhh_Jsonclick ;
   private String bttBtncrearhash_Internalname ;
   private String bttBtncrearhash_Jsonclick ;
   private java.util.Date AV6FecHhh ;
   private java.util.Date GXt_dtime7 ;
   private java.util.Date AV5DiaHact ;
   private java.util.Date GXv_dtime8[] ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date AV14AlbProfch ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n395EmprCif ;
   private boolean AV75isOk ;
   private boolean GXv_boolean11[] ;
   private String AV17Albfmd ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnenviar ;
   private com.genexus.util.GXFile AV13File ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H00NF2_A396EmprCod ;
   private String[] H00NF3_A396EmprCod ;
   private String[] H00NF3_A395EmprCif ;
   private boolean[] H00NF3_n395EmprCif ;
   private int[] H00NF4_A14AlbComCod ;
   private String[] H00NF4_A396EmprCod ;
   private java.util.Date[] H00NF4_A17AlbComFch ;
   private String[] H00NF4_A10740AlbComID ;
   private String[] H00NF4_A22AlbComPri ;
   private String[] H00NF4_A10014AlbComFd ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV76messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message10[] ;
}

final  class webenvioatalbarancomercial__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00NF2", "SELECT EmprCod FROM TXPEMPRES ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00NF3", "SELECT EmprCod, EmprCif FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00NF4", "SELECT AlbComCod, EmprCod, AlbComFch, AlbComID, AlbComPri, AlbComFd FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 200);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

