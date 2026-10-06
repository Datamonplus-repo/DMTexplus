package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wingoperario_impl extends GXDataArea
{
   public wingoperario_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wingoperario_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wingoperario_impl.class ));
   }

   public wingoperario_impl( int remoteHandle ,
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
            AV5EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               Gx_msg = httpContext.GetPar( "Gx_msg") ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
               AV15BarCodin = (int)(GXutil.lval( httpContext.GetPar( "BarCodin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarCodin), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15BarCodin), "ZZZZZZZ9")));
               AV16BarCodParin = httpContext.GetPar( "BarCodParin") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16BarCodParin", AV16BarCodParin);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPARIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16BarCodParin, ""))));
               AV17BarCodReoin = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17BarCodReoin", GXutil.str( AV17BarCodReoin, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREOIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17BarCodReoin), "9")));
               AV13ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13ProCod", AV13ProCod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13ProCod, ""))));
               AV11BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarOrdLin), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11BarOrdLin), "ZZZ9")));
               AV14CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CCTCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14CCTCod), "ZZZZZ9")));
               AV7CCOpeCod = (int)(GXutil.lval( httpContext.GetPar( "CCOpeCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CCOpeCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCOPECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7CCOpeCod), "ZZZZZ9")));
               AV12IniFin = httpContext.GetPar( "IniFin") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12IniFin", AV12IniFin);
               AV21OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OpeCod), 6, 0));
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
      pa1X72( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1X72( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.wingoperario", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.rtrim(Gx_msg)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCodin,8,0)),GXutil.URLEncode(GXutil.rtrim(AV16BarCodParin)),GXutil.URLEncode(GXutil.ltrimstr(AV17BarCodReoin,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13ProCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarOrdLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14CCTCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7CCOpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV12IniFin)),GXutil.URLEncode(GXutil.ltrimstr(AV21OpeCod,6,0))}, new String[] {"EmprCod","Gx_msg","BarCodin","BarCodParin","BarCodReoin","ProCod","BarOrdLin","CCTCod","CCOpeCod","IniFin","OpeCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15BarCodin), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPARIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16BarCodParin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREOIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17BarCodReoin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14CCTCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCOPECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7CCOpeCod), "ZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vVALING_DATA", AV19ValIng_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vVALING_DATA", AV19ValIng_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODIN", GXutil.ltrim( localUtil.ntoc( AV15BarCodin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15BarCodin), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPARIN", GXutil.rtrim( AV16BarCodParin));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPARIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16BarCodParin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREOIN", GXutil.ltrim( localUtil.ntoc( AV17BarCodReoin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREOIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17BarCodReoin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV13ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV11BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTCOD", GXutil.ltrim( localUtil.ntoc( AV14CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14CCTCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCOPECOD", GXutil.ltrim( localUtil.ntoc( AV7CCOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCOPECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7CCOpeCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOPENOM", GXutil.rtrim( AV9Openom));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "vINIFIN", GXutil.rtrim( AV12IniFin));
      app.GxWebStd.gx_hidden_field( httpContext, "vOPECOD", GXutil.ltrim( localUtil.ntoc( AV21OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_VALING_Cls", GXutil.rtrim( Combo_valing_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_VALING_Selectedvalue_set", GXutil.rtrim( Combo_valing_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCODIGOOPERARIO_Width", GXutil.rtrim( Dvpanel_panelcodigooperario_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCODIGOOPERARIO_Autowidth", GXutil.booltostr( Dvpanel_panelcodigooperario_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCODIGOOPERARIO_Autoheight", GXutil.booltostr( Dvpanel_panelcodigooperario_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCODIGOOPERARIO_Cls", GXutil.rtrim( Dvpanel_panelcodigooperario_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCODIGOOPERARIO_Title", GXutil.rtrim( Dvpanel_panelcodigooperario_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCODIGOOPERARIO_Collapsible", GXutil.booltostr( Dvpanel_panelcodigooperario_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCODIGOOPERARIO_Collapsed", GXutil.booltostr( Dvpanel_panelcodigooperario_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCODIGOOPERARIO_Showcollapseicon", GXutil.booltostr( Dvpanel_panelcodigooperario_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCODIGOOPERARIO_Iconposition", GXutil.rtrim( Dvpanel_panelcodigooperario_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELCODIGOOPERARIO_Autoscroll", GXutil.booltostr( Dvpanel_panelcodigooperario_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_VALING_Selectedvalue_get", GXutil.rtrim( Combo_valing_Selectedvalue_get));
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
         we1X72( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1X72( ) ;
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
      return formatLink("app.controlcalidadhtd.wingoperario", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.rtrim(Gx_msg)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCodin,8,0)),GXutil.URLEncode(GXutil.rtrim(AV16BarCodParin)),GXutil.URLEncode(GXutil.ltrimstr(AV17BarCodReoin,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13ProCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarOrdLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14CCTCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7CCOpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV12IniFin)),GXutil.URLEncode(GXutil.ltrimstr(AV21OpeCod,6,0))}, new String[] {"EmprCod","Gx_msg","BarCodin","BarCodParin","BarCodReoin","ProCod","BarOrdLin","CCTCod","CCOpeCod","IniFin","OpeCod"})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.WINGOperario" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Seleção do Operario", "") ;
   }

   public void wb1X70( )
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
         ucDvpanel_panelcodigooperario.setProperty("Width", Dvpanel_panelcodigooperario_Width);
         ucDvpanel_panelcodigooperario.setProperty("AutoWidth", Dvpanel_panelcodigooperario_Autowidth);
         ucDvpanel_panelcodigooperario.setProperty("AutoHeight", Dvpanel_panelcodigooperario_Autoheight);
         ucDvpanel_panelcodigooperario.setProperty("Cls", Dvpanel_panelcodigooperario_Cls);
         ucDvpanel_panelcodigooperario.setProperty("Title", Dvpanel_panelcodigooperario_Title);
         ucDvpanel_panelcodigooperario.setProperty("Collapsible", Dvpanel_panelcodigooperario_Collapsible);
         ucDvpanel_panelcodigooperario.setProperty("Collapsed", Dvpanel_panelcodigooperario_Collapsed);
         ucDvpanel_panelcodigooperario.setProperty("ShowCollapseIcon", Dvpanel_panelcodigooperario_Showcollapseicon);
         ucDvpanel_panelcodigooperario.setProperty("IconPosition", Dvpanel_panelcodigooperario_Iconposition);
         ucDvpanel_panelcodigooperario.setProperty("AutoScroll", Dvpanel_panelcodigooperario_Autoscroll);
         ucDvpanel_panelcodigooperario.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelcodigooperario_Internalname, "DVPANEL_PANELCODIGOOPERARIOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELCODIGOOPERARIOContainer"+"PanelCodigoOperario"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelcodigooperario_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedvaling_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_valing_Internalname, httpContext.getMessage( "Codigo", ""), "", "", lblTextblockcombo_valing_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\WINGOperario.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         wb_table1_28_1X72( true) ;
      }
      else
      {
         wb_table1_28_1X72( false) ;
      }
      return  ;
   }

   public void wb_table1_28_1X72e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Right", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\WINGOperario.htm");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV27Pgmname), GXutil.rtrim( localUtil.format( AV27Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WINGOperario.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavValing_Internalname, GXutil.ltrim( localUtil.ntoc( AV10ValIng, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10ValIng), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavValing_Jsonclick, 0, "Attribute", "", "", "", "", edtavValing_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WINGOperario.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1X72( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Seleção do Operario", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1X70( ) ;
   }

   public void ws1X72( )
   {
      start1X72( ) ;
      evt1X72( ) ;
   }

   public void evt1X72( )
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
                           e111X72 ();
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
                                 e121X72 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e131X72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'PROMPT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'prompt' */
                           e141X72 ();
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

   public void we1X72( )
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

   public void pa1X72( )
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
            GX_FocusControl = edtavValing_Internalname ;
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
      rf1X72( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV27Pgmname = "ControlCalidadHTD.WINGOperario" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1X72( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e131X72 ();
         wb1X70( ) ;
      }
   }

   public void send_integrity_lvl_hashes1X72( )
   {
   }

   public void before_start_formulas( )
   {
      AV27Pgmname = "ControlCalidadHTD.WINGOperario" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1X70( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111X72 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vVALING_DATA"), AV19ValIng_Data);
         /* Read saved values. */
         Combo_valing_Cls = httpContext.cgiGet( "COMBO_VALING_Cls") ;
         Combo_valing_Selectedvalue_set = httpContext.cgiGet( "COMBO_VALING_Selectedvalue_set") ;
         Dvpanel_panelcodigooperario_Width = httpContext.cgiGet( "DVPANEL_PANELCODIGOOPERARIO_Width") ;
         Dvpanel_panelcodigooperario_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCODIGOOPERARIO_Autowidth")) ;
         Dvpanel_panelcodigooperario_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCODIGOOPERARIO_Autoheight")) ;
         Dvpanel_panelcodigooperario_Cls = httpContext.cgiGet( "DVPANEL_PANELCODIGOOPERARIO_Cls") ;
         Dvpanel_panelcodigooperario_Title = httpContext.cgiGet( "DVPANEL_PANELCODIGOOPERARIO_Title") ;
         Dvpanel_panelcodigooperario_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCODIGOOPERARIO_Collapsible")) ;
         Dvpanel_panelcodigooperario_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCODIGOOPERARIO_Collapsed")) ;
         Dvpanel_panelcodigooperario_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCODIGOOPERARIO_Showcollapseicon")) ;
         Dvpanel_panelcodigooperario_Iconposition = httpContext.cgiGet( "DVPANEL_PANELCODIGOOPERARIO_Iconposition") ;
         Dvpanel_panelcodigooperario_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELCODIGOOPERARIO_Autoscroll")) ;
         /* Read variables values. */
         AV27Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavValing_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavValing_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALING");
            GX_FocusControl = edtavValing_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10ValIng = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10ValIng", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ValIng), 6, 0));
         }
         else
         {
            AV10ValIng = (int)(localUtil.ctol( httpContext.cgiGet( edtavValing_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10ValIng", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ValIng), 6, 0));
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
      e111X72 ();
      if (returnInSub) return;
   }

   public void e111X72( )
   {
      /* Start Routine */
      returnInSub = false ;
      edtavValing_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValing_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValing_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOVALING' */
      S112 ();
      if (returnInSub) return;
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e121X72 ();
      if (returnInSub) return;
   }

   public void e121X72( )
   {
      /* Enter Routine */
      returnInSub = false ;
      GXt_int1 = AV18Ok ;
      GXv_int2[0] = GXt_int1 ;
      new app.controlcalidadhtd.pccins(remoteHandle, context).execute( AV5EmprCod, AV15BarCodin, AV16BarCodParin, AV17BarCodReoin, AV13ProCod, AV11BarOrdLin, AV14CCTCod, AV7CCOpeCod, httpContext.getMessage( "L", ""), GXv_int2) ;
      wingoperario_impl.this.GXt_int1 = GXv_int2[0] ;
      AV18Ok = GXt_int1 ;
      AV21OpeCod = AV10ValIng ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OpeCod), 6, 0));
      httpContext.setWebReturnParms(new Object[] {Integer.valueOf(AV21OpeCod)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV21OpeCod"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'LOADCOMBOVALING' Routine */
      returnInSub = false ;
      /* Using cursor H01X72 */
      pr_default.execute(0, new Object[] {AV5EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H01X72_A396EmprCod[0] ;
         A2102OperCod = H01X72_A2102OperCod[0] ;
         A2103OperDsc = H01X72_A2103OperDsc[0] ;
         n2103OperDsc = H01X72_n2103OperDsc[0] ;
         AV20Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV20Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A2102OperCod );
         AV20Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A2103OperDsc );
         AV19ValIng_Data.add(AV20Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_valing_Selectedvalue_set = ((0==AV10ValIng) ? "" : GXutil.trim( GXutil.str( AV10ValIng, 6, 0))) ;
      ucCombo_valing.sendProperty(context, "", false, Combo_valing_Internalname, "SelectedValue_set", Combo_valing_Selectedvalue_set);
      /* Using cursor H01X73 */
      pr_default.execute(1, new Object[] {AV5EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = H01X73_A396EmprCod[0] ;
         A652OpeCod = H01X73_A652OpeCod[0] ;
         A653OpeNom = H01X73_A653OpeNom[0] ;
         n653OpeNom = H01X73_n653OpeNom[0] ;
         AV20Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV20Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.str( A652OpeCod, 6, 0) );
         AV20Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0), A653OpeNom, "", "", "", "", "", "", "") );
         AV19ValIng_Data.add(AV20Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_valing_Selectedvalue_set = ((0==AV10ValIng) ? "" : GXutil.trim( GXutil.str( AV10ValIng, 6, 0))) ;
      ucCombo_valing.sendProperty(context, "", false, Combo_valing_Internalname, "SelectedValue_set", Combo_valing_Selectedvalue_set);
   }

   public void e141X72( )
   {
      /* 'prompt' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.controlcalidadhtd.wwopesel", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV10ValIng,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9Openom))}, new String[] {"InOutEmprCod","InOutOpeCod","InOutOpeNom"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e131X72( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_28_1X72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedcombo_valing_Internalname, tblTablemergedcombo_valing_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* User Defined Control */
         ucCombo_valing.setProperty("Caption", Combo_valing_Caption);
         ucCombo_valing.setProperty("Cls", Combo_valing_Cls);
         ucCombo_valing.setProperty("DropDownOptionsData", AV19ValIng_Data);
         ucCombo_valing.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_valing_Internalname, "COMBO_VALINGContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblCombo_valing_righttext_Internalname, httpContext.getMessage( "Operario", ""), "", "", lblCombo_valing_righttext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataDescription", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\WINGOperario.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_28_1X72e( true) ;
      }
      else
      {
         wb_table1_28_1X72e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      Gx_msg = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      AV15BarCodin = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarCodin), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15BarCodin), "ZZZZZZZ9")));
      AV16BarCodParin = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarCodParin", AV16BarCodParin);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPARIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16BarCodParin, ""))));
      AV17BarCodReoin = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarCodReoin", GXutil.str( AV17BarCodReoin, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREOIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17BarCodReoin), "9")));
      AV13ProCod = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13ProCod", AV13ProCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13ProCod, ""))));
      AV11BarOrdLin = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarOrdLin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11BarOrdLin), "ZZZ9")));
      AV14CCTCod = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CCTCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14CCTCod), "ZZZZZ9")));
      AV7CCOpeCod = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7CCOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CCOpeCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCOPECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7CCOpeCod), "ZZZZZ9")));
      AV12IniFin = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12IniFin", AV12IniFin);
      AV21OpeCod = ((Number) GXutil.testNumericType( getParm(obj,10), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OpeCod), 6, 0));
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
      pa1X72( ) ;
      ws1X72( ) ;
      we1X72( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714194224", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/wingoperario.js", "?202681714194225", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockcombo_valing_Internalname = "TEXTBLOCKCOMBO_VALING" ;
      Combo_valing_Internalname = "COMBO_VALING" ;
      lblCombo_valing_righttext_Internalname = "COMBO_VALING_RIGHTTEXT" ;
      tblTablemergedcombo_valing_Internalname = "TABLEMERGEDCOMBO_VALING" ;
      divTablesplittedvaling_Internalname = "TABLESPLITTEDVALING" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divPanelcodigooperario_Internalname = "PANELCODIGOOPERARIO" ;
      Dvpanel_panelcodigooperario_Internalname = "DVPANEL_PANELCODIGOOPERARIO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavValing_Internalname = "vVALING" ;
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
      edtavValing_Jsonclick = "" ;
      edtavValing_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Dvpanel_panelcodigooperario_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelcodigooperario_Iconposition = "Right" ;
      Dvpanel_panelcodigooperario_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelcodigooperario_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelcodigooperario_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelcodigooperario_Title = httpContext.getMessage( "Introducir Codigo Operario", "") ;
      Dvpanel_panelcodigooperario_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelcodigooperario_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelcodigooperario_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelcodigooperario_Width = "100%" ;
      Combo_valing_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Seleção do Operario", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV15BarCodin',fld:'vBARCODIN',pic:'ZZZZZZZ9',hsh:true},{av:'AV16BarCodParin',fld:'vBARCODPARIN',pic:'',hsh:true},{av:'AV17BarCodReoin',fld:'vBARCODREOIN',pic:'9',hsh:true},{av:'AV13ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV11BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV14CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV7CCOpeCod',fld:'vCCOPECOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e121X72',iparms:[{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15BarCodin',fld:'vBARCODIN',pic:'ZZZZZZZ9',hsh:true},{av:'AV16BarCodParin',fld:'vBARCODPARIN',pic:'',hsh:true},{av:'AV17BarCodReoin',fld:'vBARCODREOIN',pic:'9',hsh:true},{av:'AV13ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV11BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV14CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV7CCOpeCod',fld:'vCCOPECOD',pic:'ZZZZZ9',hsh:true},{av:'AV10ValIng',fld:'vVALING',pic:'ZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV21OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("'PROMPT'","{handler:'e141X72',iparms:[{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV10ValIng',fld:'vVALING',pic:'ZZZZZ9'},{av:'AV9Openom',fld:'vOPENOM',pic:''}]");
      setEventMetadata("'PROMPT'",",oparms:[{av:'AV9Openom',fld:'vOPENOM',pic:''},{av:'AV10ValIng',fld:'vVALING',pic:'ZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
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
      wcpOGx_msg = "" ;
      wcpOAV16BarCodParin = "" ;
      wcpOAV13ProCod = "" ;
      wcpOAV12IniFin = "" ;
      Combo_valing_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5EmprCod = "" ;
      Gx_msg = "" ;
      AV16BarCodParin = "" ;
      AV13ProCod = "" ;
      AV12IniFin = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV19ValIng_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9Openom = "" ;
      Combo_valing_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panelcodigooperario = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_valing_Jsonclick = "" ;
      TempTags = "" ;
      bttBtnenter_Jsonclick = "" ;
      AV27Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      H01X72_A396EmprCod = new String[] {""} ;
      H01X72_A2102OperCod = new String[] {""} ;
      H01X72_A2103OperDsc = new String[] {""} ;
      H01X72_n2103OperDsc = new boolean[] {false} ;
      A396EmprCod = "" ;
      A2102OperCod = "" ;
      A2103OperDsc = "" ;
      AV20Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      ucCombo_valing = new com.genexus.webpanels.GXUserControl();
      H01X73_A396EmprCod = new String[] {""} ;
      H01X73_A652OpeCod = new int[1] ;
      H01X73_A653OpeNom = new String[] {""} ;
      H01X73_n653OpeNom = new boolean[] {false} ;
      A653OpeNom = "" ;
      sStyleString = "" ;
      Combo_valing_Caption = "" ;
      lblCombo_valing_righttext_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.wingoperario__default(),
         new Object[] {
             new Object[] {
            H01X72_A396EmprCod, H01X72_A2102OperCod, H01X72_A2103OperDsc, H01X72_n2103OperDsc
            }
            , new Object[] {
            H01X73_A396EmprCod, H01X73_A652OpeCod, H01X73_A653OpeNom, H01X73_n653OpeNom
            }
         }
      );
      AV27Pgmname = "ControlCalidadHTD.WINGOperario" ;
      /* GeneXus formulas. */
      AV27Pgmname = "ControlCalidadHTD.WINGOperario" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV17BarCodReoin ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV17BarCodReoin ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV18Ok ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte nGXWrapped ;
   private short wcpOAV11BarOrdLin ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV11BarOrdLin ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV15BarCodin ;
   private int wcpOAV14CCTCod ;
   private int wcpOAV7CCOpeCod ;
   private int AV15BarCodin ;
   private int AV14CCTCod ;
   private int AV7CCOpeCod ;
   private int AV21OpeCod ;
   private int edtavPgmname_Enabled ;
   private int AV10ValIng ;
   private int edtavValing_Visible ;
   private int A652OpeCod ;
   private int idxLst ;
   private String wcpOAV5EmprCod ;
   private String wcpOGx_msg ;
   private String wcpOAV16BarCodParin ;
   private String wcpOAV13ProCod ;
   private String wcpOAV12IniFin ;
   private String Combo_valing_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV5EmprCod ;
   private String Gx_msg ;
   private String AV16BarCodParin ;
   private String AV13ProCod ;
   private String AV12IniFin ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV9Openom ;
   private String Combo_valing_Cls ;
   private String Combo_valing_Selectedvalue_set ;
   private String Dvpanel_panelcodigooperario_Width ;
   private String Dvpanel_panelcodigooperario_Cls ;
   private String Dvpanel_panelcodigooperario_Title ;
   private String Dvpanel_panelcodigooperario_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panelcodigooperario_Internalname ;
   private String divPanelcodigooperario_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divTablesplittedvaling_Internalname ;
   private String lblTextblockcombo_valing_Internalname ;
   private String lblTextblockcombo_valing_Jsonclick ;
   private String TempTags ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV27Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavValing_Internalname ;
   private String edtavValing_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A2102OperCod ;
   private String A2103OperDsc ;
   private String Combo_valing_Internalname ;
   private String A653OpeNom ;
   private String sStyleString ;
   private String tblTablemergedcombo_valing_Internalname ;
   private String Combo_valing_Caption ;
   private String lblCombo_valing_righttext_Internalname ;
   private String lblCombo_valing_righttext_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_panelcodigooperario_Autowidth ;
   private boolean Dvpanel_panelcodigooperario_Autoheight ;
   private boolean Dvpanel_panelcodigooperario_Collapsible ;
   private boolean Dvpanel_panelcodigooperario_Collapsed ;
   private boolean Dvpanel_panelcodigooperario_Showcollapseicon ;
   private boolean Dvpanel_panelcodigooperario_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n2103OperDsc ;
   private boolean n653OpeNom ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelcodigooperario ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_valing ;
   private IDataStoreProvider pr_default ;
   private String[] H01X72_A396EmprCod ;
   private String[] H01X72_A2102OperCod ;
   private String[] H01X72_A2103OperDsc ;
   private boolean[] H01X72_n2103OperDsc ;
   private String[] H01X73_A396EmprCod ;
   private int[] H01X73_A652OpeCod ;
   private String[] H01X73_A653OpeNom ;
   private boolean[] H01X73_n653OpeNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV19ValIng_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV20Combo_DataItem ;
}

final  class wingoperario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01X72", "SELECT EmprCod, OperCod, OperDsc FROM TXPOPEREX WHERE EmprCod = ? ORDER BY OperDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01X73", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? ORDER BY OpeNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

