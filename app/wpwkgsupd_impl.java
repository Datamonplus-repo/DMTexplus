package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wpwkgsupd_impl extends GXDataArea
{
   public wpwkgsupd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpwkgsupd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpwkgsupd_impl.class ));
   }

   public wpwkgsupd_impl( int remoteHandle ,
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
               AV10maqcod = httpContext.GetPar( "maqcod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10maqcod", AV10maqcod);
               AV40Tot_kgs = CommonUtil.decimalVal( httpContext.GetPar( "Tot_kgs"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40Tot_kgs", GXutil.ltrimstr( AV40Tot_kgs, 9, 2));
               AV6Barvolmaq = (int)(GXutil.lval( httpContext.GetPar( "Barvolmaq"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barvolmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barvolmaq), 5, 0));
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
      pa11H2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start11H2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wpwkgsupd", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV10maqcod)),GXutil.URLEncode(DecimalUtil.decToString(AV40Tot_kgs)),GXutil.URLEncode(GXutil.ltrimstr(AV6Barvolmaq,5,0))}, new String[] {"EmprCod","maqcod","Tot_kgs","Barvolmaq"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOCTRLKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37noCtrlKgs), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCAMBIOVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24CambioVolumen), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WpWkgsupd");
      forbiddenHiddens.add("MaqKgsMIn", localUtil.format( AV14MaqKgsMIn, "ZZZZZ9.99"));
      forbiddenHiddens.add("maqKgsMax", localUtil.format( AV15maqKgsMax, "ZZZZZ9.99"));
      forbiddenHiddens.add("MaqVolMin", localUtil.format( DecimalUtil.doubleToDec(AV19MaqVolMin), "ZZZZ9"));
      forbiddenHiddens.add("MaqVolMax", localUtil.format( DecimalUtil.doubleToDec(AV18MaqVolMax), "ZZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wpwkgsupd:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vNOCTRLKGS", GXutil.ltrim( localUtil.ntoc( AV37noCtrlKgs, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOCTRLKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37noCtrlKgs), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV7Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV8Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV9Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV46Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV11UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCAMBIOVOLUMEN", GXutil.ltrim( localUtil.ntoc( AV24CambioVolumen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCAMBIOVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24CambioVolumen), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
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
         we11H2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt11H2( ) ;
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
      return formatLink("app.wpwkgsupd", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV10maqcod)),GXutil.URLEncode(DecimalUtil.decToString(AV40Tot_kgs)),GXutil.URLEncode(GXutil.ltrimstr(AV6Barvolmaq,5,0))}, new String[] {"EmprCod","maqcod","Tot_kgs","Barvolmaq"})  ;
   }

   public String getPgmname( )
   {
      return "WpWkgsupd" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Solicito Kilos y Volumen", "") ;
   }

   public void wb11H0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcod_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, GXutil.rtrim( AV10maqcod), GXutil.rtrim( localUtil.format( AV10maqcod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WpWkgsupd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqdsc_Internalname, GXutil.rtrim( AV16Maqdsc), GXutil.rtrim( localUtil.format( AV16Maqdsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqdsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WpWkgsupd.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavKgs_f_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavKgs_f_Internalname, httpContext.getMessage( "Kilos", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavKgs_f_Internalname, GXutil.ltrim( localUtil.ntoc( AV27Kgs_f, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavKgs_f_Enabled!=0) ? localUtil.format( AV27Kgs_f, "ZZZZZ9.99") : localUtil.format( AV27Kgs_f, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavKgs_f_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavKgs_f_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WpWkgsupd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTot_kgs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTot_kgs_Internalname, httpContext.getMessage( "Kilos", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTot_kgs_Internalname, GXutil.ltrim( localUtil.ntoc( AV40Tot_kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTot_kgs_Enabled!=0) ? localUtil.format( AV40Tot_kgs, "ZZZZZ9.99") : localUtil.format( AV40Tot_kgs, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTot_kgs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTot_kgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WpWkgsupd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqkgsmin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqkgsmin_Internalname, httpContext.getMessage( "Kgs Min", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqkgsmin_Internalname, GXutil.ltrim( localUtil.ntoc( AV14MaqKgsMIn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqkgsmin_Enabled!=0) ? localUtil.format( AV14MaqKgsMIn, "ZZZZZ9.99") : localUtil.format( AV14MaqKgsMIn, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqkgsmin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqkgsmin_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WpWkgsupd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqkgsmax_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqkgsmax_Internalname, httpContext.getMessage( "Kgs Max", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqkgsmax_Internalname, GXutil.ltrim( localUtil.ntoc( AV15maqKgsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqkgsmax_Enabled!=0) ? localUtil.format( AV15maqKgsMax, "ZZZZZ9.99") : localUtil.format( AV15maqKgsMax, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqkgsmax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqkgsmax_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WpWkgsupd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVolumennew_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavVolumennew_Internalname, httpContext.getMessage( "Volumen", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavVolumennew_Internalname, GXutil.ltrim( localUtil.ntoc( AV41VolumenNew, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavVolumennew_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV41VolumenNew), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV41VolumenNew), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVolumennew_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavVolumennew_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WpWkgsupd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarvolmaq_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarvolmaq_Internalname, httpContext.getMessage( "Volumen", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarvolmaq_Internalname, GXutil.ltrim( localUtil.ntoc( AV6Barvolmaq, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarvolmaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6Barvolmaq), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6Barvolmaq), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarvolmaq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarvolmaq_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WpWkgsupd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqvolmin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqvolmin_Internalname, httpContext.getMessage( "Vol Min", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqvolmin_Internalname, GXutil.ltrim( localUtil.ntoc( AV19MaqVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqvolmin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19MaqVolMin), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19MaqVolMin), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqvolmin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqvolmin_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WpWkgsupd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqvolmax_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqvolmax_Internalname, httpContext.getMessage( "Vol Max", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqvolmax_Internalname, GXutil.ltrim( localUtil.ntoc( AV18MaqVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqvolmax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV18MaqVolMax), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV18MaqVolMax), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqvolmax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqvolmax_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WpWkgsupd.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", divUnnamedtable3_Height, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1111h1_client"+"'", TempTags, "", 2, "HLP_WpWkgsupd.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         wb_table1_75_11H2( true) ;
      }
      else
      {
         wb_table1_75_11H2( false) ;
      }
      return  ;
   }

   public void wb_table1_75_11H2e( boolean wbgen )
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

   public void start11H2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Solicito Kilos y Volumen", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup11H0( ) ;
   }

   public void ws11H2( )
   {
      start11H2( ) ;
      evt11H2( ) ;
   }

   public void evt11H2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1211H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1311H2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1411H2 ();
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

   public void we11H2( )
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

   public void pa11H2( )
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
            GX_FocusControl = edtavMaqdsc_Internalname ;
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
      rf11H2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV46Pgmname = "WpWkgsupd" ;
      Gx_err = (short)(0) ;
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), true);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), true);
      edtavTot_kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTot_kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTot_kgs_Enabled), 5, 0), true);
      edtavMaqkgsmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqkgsmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqkgsmin_Enabled), 5, 0), true);
      edtavMaqkgsmax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqkgsmax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqkgsmax_Enabled), 5, 0), true);
      edtavBarvolmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarvolmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarvolmaq_Enabled), 5, 0), true);
      edtavMaqvolmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolmin_Enabled), 5, 0), true);
      edtavMaqvolmax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolmax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolmax_Enabled), 5, 0), true);
   }

   public void rf11H2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1411H2 ();
         wb11H0( ) ;
      }
   }

   public void send_integrity_lvl_hashes11H2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vNOCTRLKGS", GXutil.ltrim( localUtil.ntoc( AV37noCtrlKgs, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOCTRLKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37noCtrlKgs), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV7Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV8Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV9Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV46Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV11UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCAMBIOVOLUMEN", GXutil.ltrim( localUtil.ntoc( AV24CambioVolumen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCAMBIOVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24CambioVolumen), "9")));
   }

   public void before_start_formulas( )
   {
      AV46Pgmname = "WpWkgsupd" ;
      Gx_err = (short)(0) ;
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), true);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), true);
      edtavTot_kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTot_kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTot_kgs_Enabled), 5, 0), true);
      edtavMaqkgsmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqkgsmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqkgsmin_Enabled), 5, 0), true);
      edtavMaqkgsmax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqkgsmax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqkgsmax_Enabled), 5, 0), true);
      edtavBarvolmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarvolmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarvolmaq_Enabled), 5, 0), true);
      edtavMaqvolmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolmin_Enabled), 5, 0), true);
      edtavMaqvolmax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolmax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolmax_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup11H0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1311H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV24CambioVolumen = (byte)(localUtil.ctol( httpContext.cgiGet( "vCAMBIOVOLUMEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_msg = httpContext.cgiGet( "vMSG") ;
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
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
         Dvelop_confirmpanel_btnconfirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result") ;
         /* Read variables values. */
         AV16Maqdsc = httpContext.cgiGet( edtavMaqdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Maqdsc", AV16Maqdsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKgs_f_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKgs_f_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKGS_F");
            GX_FocusControl = edtavKgs_f_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV27Kgs_f = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Kgs_f", GXutil.ltrimstr( AV27Kgs_f, 9, 2));
         }
         else
         {
            AV27Kgs_f = localUtil.ctond( httpContext.cgiGet( edtavKgs_f_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Kgs_f", GXutil.ltrimstr( AV27Kgs_f, 9, 2));
         }
         AV40Tot_kgs = localUtil.ctond( httpContext.cgiGet( edtavTot_kgs_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Tot_kgs", GXutil.ltrimstr( AV40Tot_kgs, 9, 2));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMaqkgsmin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMaqkgsmin_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQKGSMIN");
            GX_FocusControl = edtavMaqkgsmin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14MaqKgsMIn = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14MaqKgsMIn", GXutil.ltrimstr( AV14MaqKgsMIn, 9, 2));
         }
         else
         {
            AV14MaqKgsMIn = localUtil.ctond( httpContext.cgiGet( edtavMaqkgsmin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14MaqKgsMIn", GXutil.ltrimstr( AV14MaqKgsMIn, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMaqkgsmax_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMaqkgsmax_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQKGSMAX");
            GX_FocusControl = edtavMaqkgsmax_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15maqKgsMax = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15maqKgsMax", GXutil.ltrimstr( AV15maqKgsMax, 9, 2));
         }
         else
         {
            AV15maqKgsMax = localUtil.ctond( httpContext.cgiGet( edtavMaqkgsmax_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15maqKgsMax", GXutil.ltrimstr( AV15maqKgsMax, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavVolumennew_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavVolumennew_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVOLUMENNEW");
            GX_FocusControl = edtavVolumennew_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV41VolumenNew = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41VolumenNew", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41VolumenNew), 5, 0));
         }
         else
         {
            AV41VolumenNew = (int)(localUtil.ctol( httpContext.cgiGet( edtavVolumennew_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41VolumenNew", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41VolumenNew), 5, 0));
         }
         AV6Barvolmaq = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarvolmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Barvolmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barvolmaq), 5, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQVOLMIN");
            GX_FocusControl = edtavMaqvolmin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19MaqVolMin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19MaqVolMin), 5, 0));
         }
         else
         {
            AV19MaqVolMin = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaqvolmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19MaqVolMin), 5, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolmax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolmax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQVOLMAX");
            GX_FocusControl = edtavMaqvolmax_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18MaqVolMax = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18MaqVolMax), 5, 0));
         }
         else
         {
            AV18MaqVolMax = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaqvolmax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18MaqVolMax), 5, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"WpWkgsupd");
         AV14MaqKgsMIn = localUtil.ctond( httpContext.cgiGet( edtavMaqkgsmin_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14MaqKgsMIn", GXutil.ltrimstr( AV14MaqKgsMIn, 9, 2));
         forbiddenHiddens.add("MaqKgsMIn", localUtil.format( AV14MaqKgsMIn, "ZZZZZ9.99"));
         AV15maqKgsMax = localUtil.ctond( httpContext.cgiGet( edtavMaqkgsmax_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15maqKgsMax", GXutil.ltrimstr( AV15maqKgsMax, 9, 2));
         forbiddenHiddens.add("maqKgsMax", localUtil.format( AV15maqKgsMax, "ZZZZZ9.99"));
         AV19MaqVolMin = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaqvolmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19MaqVolMin), 5, 0));
         forbiddenHiddens.add("MaqVolMin", localUtil.format( DecimalUtil.doubleToDec(AV19MaqVolMin), "ZZZZ9"));
         AV18MaqVolMax = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaqvolmax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18MaqVolMax), 5, 0));
         forbiddenHiddens.add("MaqVolMax", localUtil.format( DecimalUtil.doubleToDec(AV18MaqVolMax), "ZZZZ9"));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("wpwkgsupd:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1311H2 ();
      if (returnInSub) return;
   }

   public void e1311H2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV11UsurCod = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11UsurCod", AV11UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11UsurCod, "@!"))));
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
      GXv_char1[0] = AV5EmprCod ;
      GXv_char2[0] = AV13EmprNom ;
      GXv_char3[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char1, GXv_char2, GXv_char3) ;
      wpwkgsupd_impl.this.AV5EmprCod = GXv_char1[0] ;
      wpwkgsupd_impl.this.AV13EmprNom = GXv_char2[0] ;
      wpwkgsupd_impl.this.AV11UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11UsurCod", AV11UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11UsurCod, "@!"))));
      GXt_int4 = AV25Eliot ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int5) ;
      wpwkgsupd_impl.this.GXt_int4 = GXv_int5[0] ;
      AV25Eliot = GXt_int4 ;
      GXt_int4 = AV24CambioVolumen ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "CVIVOL", ""), GXv_int5) ;
      wpwkgsupd_impl.this.GXt_int4 = GXv_int5[0] ;
      AV24CambioVolumen = GXt_int4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24CambioVolumen", GXutil.str( AV24CambioVolumen, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCAMBIOVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24CambioVolumen), "9")));
      GXt_int4 = AV37noCtrlKgs ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "NOCTKG", ""), GXv_int5) ;
      wpwkgsupd_impl.this.GXt_int4 = GXv_int5[0] ;
      AV37noCtrlKgs = GXt_int4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37noCtrlKgs", GXutil.str( AV37noCtrlKgs, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOCTRLKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37noCtrlKgs), "9")));
      AV27Kgs_f = AV40Tot_kgs ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Kgs_f", GXutil.ltrimstr( AV27Kgs_f, 9, 2));
      AV14MaqKgsMIn = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14MaqKgsMIn", GXutil.ltrimstr( AV14MaqKgsMIn, 9, 2));
      AV15maqKgsMax = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15maqKgsMax", GXutil.ltrimstr( AV15maqKgsMax, 9, 2));
      AV16Maqdsc = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Maqdsc", AV16Maqdsc);
      /* Using cursor H011H2 */
      pr_default.execute(0, new Object[] {AV10maqcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = H011H2_A602MaqCod[0] ;
         A4283MaqKgsMin = H011H2_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = H011H2_n4283MaqKgsMin[0] ;
         A4285MaqKgsMax = H011H2_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = H011H2_n4285MaqKgsMax[0] ;
         A606MaqDsc = H011H2_A606MaqDsc[0] ;
         n606MaqDsc = H011H2_n606MaqDsc[0] ;
         A624MaqVolMed = H011H2_A624MaqVolMed[0] ;
         n624MaqVolMed = H011H2_n624MaqVolMed[0] ;
         A623MaqVolMax = H011H2_A623MaqVolMax[0] ;
         n623MaqVolMax = H011H2_n623MaqVolMax[0] ;
         A625MaqVolMin = H011H2_A625MaqVolMin[0] ;
         n625MaqVolMin = H011H2_n625MaqVolMin[0] ;
         A396EmprCod = H011H2_A396EmprCod[0] ;
         AV14MaqKgsMIn = A4283MaqKgsMin ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14MaqKgsMIn", GXutil.ltrimstr( AV14MaqKgsMIn, 9, 2));
         AV15maqKgsMax = A4285MaqKgsMax ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15maqKgsMax", GXutil.ltrimstr( AV15maqKgsMax, 9, 2));
         AV16Maqdsc = A606MaqDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Maqdsc", AV16Maqdsc);
         AV17MaqVolMed = A624MaqVolMed ;
         AV18MaqVolMax = A623MaqVolMax ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18MaqVolMax), 5, 0));
         AV19MaqVolMin = A625MaqVolMin ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19MaqVolMin), 5, 0));
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV25Eliot == 1 )
      {
         AV36MgMin = DecimalUtil.doubleToDec(50) ;
         AV35MgMax = DecimalUtil.doubleToDec(10) ;
      }
      else
      {
         AV36MgMin = DecimalUtil.doubleToDec(0) ;
         AV35MgMax = DecimalUtil.doubleToDec(0) ;
      }
      AV14MaqKgsMIn = AV14MaqKgsMIn.subtract(((AV14MaqKgsMIn.multiply(AV36MgMin)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14MaqKgsMIn", GXutil.ltrimstr( AV14MaqKgsMIn, 9, 2));
      AV15maqKgsMax = AV15maqKgsMax.add(((AV15maqKgsMax.multiply(AV35MgMax)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15maqKgsMax", GXutil.ltrimstr( AV15maqKgsMax, 9, 2));
      AV38Rb = ((AV40Tot_kgs.doubleValue()>0) ? GXutil.roundDecimal( DecimalUtil.doubleToDec(AV6Barvolmaq).divide(AV40Tot_kgs, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
      AV41VolumenNew = AV6Barvolmaq ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41VolumenNew", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41VolumenNew), 5, 0));
      GXt_char6 = AV12Station ;
      GXv_char3[0] = GXt_char6 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      wpwkgsupd_impl.this.GXt_char6 = GXv_char3[0] ;
      AV12Station = GXt_char6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Station, ""))));
      GXv_char3[0] = AV5EmprCod ;
      GXv_char2[0] = AV13EmprNom ;
      GXv_char1[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char3, GXv_char2, GXv_char1) ;
      wpwkgsupd_impl.this.AV5EmprCod = GXv_char3[0] ;
      wpwkgsupd_impl.this.AV13EmprNom = GXv_char2[0] ;
      wpwkgsupd_impl.this.AV11UsurCod = GXv_char1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11UsurCod", AV11UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11UsurCod, "@!"))));
      divUnnamedtable3_Height = 50 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable3_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable3_Height), 9, 0), true);
   }

   public void e1211H2( )
   {
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, "Yes") == 0 )
      {
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV27Kgs_f)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. No se permite Kgs=0", ""));
            GX_FocusControl = edtavKgs_f_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( ( ( DecimalUtil.compareTo(AV27Kgs_f, AV14MaqKgsMIn) < 0 ) && ( AV27Kgs_f.doubleValue() > 0 ) ) || ( ( DecimalUtil.compareTo(AV27Kgs_f, AV15maqKgsMax) > 0 ) && ( AV27Kgs_f.doubleValue() > 0 ) ) && ( AV37noCtrlKgs == 0 ) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Los Kgs NO estan en el intervalo de KILOS de la Maquina", ""));
               GX_FocusControl = edtavKgs_f_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( ( ( DecimalUtil.compareTo(AV27Kgs_f, AV14MaqKgsMIn) < 0 ) && ( AV27Kgs_f.doubleValue() > 0 ) ) || ( ( DecimalUtil.compareTo(AV27Kgs_f, AV15maqKgsMax) > 0 ) && ( AV27Kgs_f.doubleValue() > 0 ) ) && ( AV37noCtrlKgs == 1 ) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.Los Kgs NO estan en el intervalo de KILOS de la Maquina", ""));
               }
               if ( AV41VolumenNew < AV19MaqVolMin )
               {
                  Gx_msg = httpContext.getMessage( "Atencion el Volumen calculado ", "") + GXutil.str( AV41VolumenNew, 5, 0) + httpContext.getMessage( " es inferior Volumen Minimo ", "") + GXutil.str( AV19MaqVolMin, 5, 0) ;
                  httpContext.GX_msglist.addItem(Gx_msg);
               }
               if ( AV41VolumenNew > AV18MaqVolMax )
               {
                  Gx_msg = httpContext.getMessage( "Atencion el Volumen calculado ", "") + GXutil.str( AV41VolumenNew, 5, 0) + httpContext.getMessage( " es superior Volumen Maximo ", "") + GXutil.str( AV18MaqVolMax, 5, 0) ;
                  httpContext.GX_msglist.addItem(Gx_msg);
               }
               AV26Hdr = GXutil.str( AV7Barcod, 8, 0) + "-" + GXutil.str( AV8Barcodreo, 1, 0) + AV9Barcodpar ;
               AV39Texto_i = httpContext.getMessage( "Cambio de Kgs a Teñir en la HDR = ", "") + AV26Hdr + httpContext.getMessage( " Kgs Iniciales = ", "") + GXutil.str( AV40Tot_kgs, 9, 2) + httpContext.getMessage( " Kgs Finales = ", "") + GXutil.str( AV27Kgs_f, 9, 2) + GXutil.newLine( ) ;
               AV39Texto_i += httpContext.getMessage( "Cambio de Volumen a Teñir       = ", "") + httpContext.getMessage( "Volumen Inicial = ", "") + GXutil.str( AV6Barvolmaq, 5, 0) + httpContext.getMessage( " Volumen Final = ", "") + GXutil.str( AV41VolumenNew, 5, 0) ;
               new app.pctrinc(remoteHandle, context).execute( AV5EmprCod, GXutil.substring( AV46Pgmname, 1, 10), AV11UsurCod, AV12Station, AV39Texto_i, AV7Barcod, AV8Barcodreo, AV9Barcodpar) ;
               AV40Tot_kgs = AV27Kgs_f ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40Tot_kgs", GXutil.ltrimstr( AV40Tot_kgs, 9, 2));
               AV6Barvolmaq = AV41VolumenNew ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barvolmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barvolmaq), 5, 0));
               httpContext.setWebReturnParms(new Object[] {AV5EmprCod,AV10maqcod,AV40Tot_kgs,Integer.valueOf(AV6Barvolmaq)});
               httpContext.setWebReturnParmsMetadata(new Object[] {"AV5EmprCod","AV10maqcod","AV40Tot_kgs","AV6Barvolmaq"});
               httpContext.wjLocDisableFrm = (byte)(1) ;
               httpContext.nUserReturn = (byte)(1) ;
               returnInSub = true;
               if (true) return;
            }
         }
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e1411H2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_75_11H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconfirmar.setProperty("Title", Dvelop_confirmpanel_btnconfirmar_Title);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmar_Confirmtype);
         ucDvelop_confirmpanel_btnconfirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar_Internalname, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_75_11H2e( true) ;
      }
      else
      {
         wb_table1_75_11H2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      AV10maqcod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10maqcod", AV10maqcod);
      AV40Tot_kgs = (java.math.BigDecimal)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Tot_kgs", GXutil.ltrimstr( AV40Tot_kgs, 9, 2));
      AV6Barvolmaq = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Barvolmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barvolmaq), 5, 0));
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
      pa11H2( ) ;
      ws11H2( ) ;
      we11H2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016423710", true, true);
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
      httpContext.AddJavascriptSource("wpwkgsupd.js", "?202661016423710", false, true);
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
      edtavMaqcod_Internalname = "vMAQCOD" ;
      edtavMaqdsc_Internalname = "vMAQDSC" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavKgs_f_Internalname = "vKGS_F" ;
      edtavTot_kgs_Internalname = "vTOT_KGS" ;
      edtavMaqkgsmin_Internalname = "vMAQKGSMIN" ;
      edtavMaqkgsmax_Internalname = "vMAQKGSMAX" ;
      edtavVolumennew_Internalname = "vVOLUMENNEW" ;
      edtavBarvolmaq_Internalname = "vBARVOLMAQ" ;
      edtavMaqvolmin_Internalname = "vMAQVOLMIN" ;
      edtavMaqvolmax_Internalname = "vMAQVOLMAX" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = "DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
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
      divUnnamedtable3_Height = 0 ;
      edtavMaqvolmax_Jsonclick = "" ;
      edtavMaqvolmax_Enabled = 1 ;
      edtavMaqvolmin_Jsonclick = "" ;
      edtavMaqvolmin_Enabled = 1 ;
      edtavBarvolmaq_Jsonclick = "" ;
      edtavBarvolmaq_Enabled = 0 ;
      edtavVolumennew_Jsonclick = "" ;
      edtavVolumennew_Enabled = 1 ;
      edtavMaqkgsmax_Jsonclick = "" ;
      edtavMaqkgsmax_Enabled = 1 ;
      edtavMaqkgsmin_Jsonclick = "" ;
      edtavMaqkgsmin_Enabled = 1 ;
      edtavTot_kgs_Jsonclick = "" ;
      edtavTot_kgs_Enabled = 0 ;
      edtavKgs_f_Jsonclick = "" ;
      edtavKgs_f_Enabled = 1 ;
      edtavMaqdsc_Jsonclick = "" ;
      edtavMaqdsc_Enabled = 1 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 0 ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Confirma los datos?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = "" ;
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
      Dvpanel_unnamedtable1_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Solicito Kilos y Volumen", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV37noCtrlKgs',fld:'vNOCTRLKGS',pic:'9',hsh:true},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV46Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV11UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV12Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV24CambioVolumen',fld:'vCAMBIOVOLUMEN',pic:'9',hsh:true},{av:'AV14MaqKgsMIn',fld:'vMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV15maqKgsMax',fld:'vMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV19MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'},{av:'AV18MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1111H1',iparms:[{av:'AV27Kgs_f',fld:'vKGS_F',pic:'ZZZZZ9.99'},{av:'AV41VolumenNew',fld:'vVOLUMENNEW',pic:'ZZZZ9'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'Dvelop_confirmpanel_btnconfirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e1211H2',iparms:[{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'AV27Kgs_f',fld:'vKGS_F',pic:'ZZZZZ9.99'},{av:'AV14MaqKgsMIn',fld:'vMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV15maqKgsMax',fld:'vMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV37noCtrlKgs',fld:'vNOCTRLKGS',pic:'9',hsh:true},{av:'AV41VolumenNew',fld:'vVOLUMENNEW',pic:'ZZZZ9'},{av:'AV19MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'},{av:'AV18MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV40Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZ9.99'},{av:'AV6Barvolmaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV46Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV11UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV12Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV10maqcod',fld:'vMAQCOD',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV40Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZ9.99'},{av:'AV6Barvolmaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'}]}");
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
      wcpOAV10maqcod = "" ;
      wcpOAV40Tot_kgs = DecimalUtil.ZERO ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5EmprCod = "" ;
      AV10maqcod = "" ;
      AV40Tot_kgs = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV9Barcodpar = "" ;
      AV46Pgmname = "" ;
      AV11UsurCod = "" ;
      AV12Station = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV14MaqKgsMIn = DecimalUtil.ZERO ;
      AV15maqKgsMax = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV16Maqdsc = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      AV27Kgs_f = DecimalUtil.ZERO ;
      bttBtnconfirmar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV13EmprNom = "" ;
      GXv_int5 = new byte[1] ;
      scmdbuf = "" ;
      H011H2_A602MaqCod = new String[] {""} ;
      H011H2_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H011H2_n4283MaqKgsMin = new boolean[] {false} ;
      H011H2_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H011H2_n4285MaqKgsMax = new boolean[] {false} ;
      H011H2_A606MaqDsc = new String[] {""} ;
      H011H2_n606MaqDsc = new boolean[] {false} ;
      H011H2_A624MaqVolMed = new int[1] ;
      H011H2_n624MaqVolMed = new boolean[] {false} ;
      H011H2_A623MaqVolMax = new int[1] ;
      H011H2_n623MaqVolMax = new boolean[] {false} ;
      H011H2_A625MaqVolMin = new int[1] ;
      H011H2_n625MaqVolMin = new boolean[] {false} ;
      H011H2_A396EmprCod = new String[] {""} ;
      A602MaqCod = "" ;
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      A396EmprCod = "" ;
      AV36MgMin = DecimalUtil.ZERO ;
      AV35MgMax = DecimalUtil.ZERO ;
      AV38Rb = DecimalUtil.ZERO ;
      GXt_char6 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      AV26Hdr = "" ;
      AV39Texto_i = "" ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wpwkgsupd__default(),
         new Object[] {
             new Object[] {
            H011H2_A602MaqCod, H011H2_A4283MaqKgsMin, H011H2_n4283MaqKgsMin, H011H2_A4285MaqKgsMax, H011H2_n4285MaqKgsMax, H011H2_A606MaqDsc, H011H2_n606MaqDsc, H011H2_A624MaqVolMed, H011H2_n624MaqVolMed, H011H2_A623MaqVolMax,
            H011H2_n623MaqVolMax, H011H2_A625MaqVolMin, H011H2_n625MaqVolMin, H011H2_A396EmprCod
            }
         }
      );
      AV46Pgmname = "WpWkgsupd" ;
      /* GeneXus formulas. */
      AV46Pgmname = "WpWkgsupd" ;
      Gx_err = (short)(0) ;
      edtavMaqcod_Enabled = 0 ;
      edtavMaqdsc_Enabled = 0 ;
      edtavTot_kgs_Enabled = 0 ;
      edtavMaqkgsmin_Enabled = 0 ;
      edtavMaqkgsmax_Enabled = 0 ;
      edtavBarvolmaq_Enabled = 0 ;
      edtavMaqvolmin_Enabled = 0 ;
      edtavMaqvolmax_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV37noCtrlKgs ;
   private byte AV8Barcodreo ;
   private byte AV24CambioVolumen ;
   private byte nDonePA ;
   private byte AV25Eliot ;
   private byte GXt_int4 ;
   private byte GXv_int5[] ;
   private byte nGXWrapped ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV6Barvolmaq ;
   private int AV6Barvolmaq ;
   private int AV7Barcod ;
   private int AV19MaqVolMin ;
   private int AV18MaqVolMax ;
   private int edtavMaqcod_Enabled ;
   private int edtavMaqdsc_Enabled ;
   private int edtavKgs_f_Enabled ;
   private int edtavTot_kgs_Enabled ;
   private int edtavMaqkgsmin_Enabled ;
   private int edtavMaqkgsmax_Enabled ;
   private int AV41VolumenNew ;
   private int edtavVolumennew_Enabled ;
   private int edtavBarvolmaq_Enabled ;
   private int edtavMaqvolmin_Enabled ;
   private int edtavMaqvolmax_Enabled ;
   private int divUnnamedtable3_Height ;
   private int A624MaqVolMed ;
   private int A623MaqVolMax ;
   private int A625MaqVolMin ;
   private int AV17MaqVolMed ;
   private int idxLst ;
   private java.math.BigDecimal wcpOAV40Tot_kgs ;
   private java.math.BigDecimal AV40Tot_kgs ;
   private java.math.BigDecimal AV14MaqKgsMIn ;
   private java.math.BigDecimal AV15maqKgsMax ;
   private java.math.BigDecimal AV27Kgs_f ;
   private java.math.BigDecimal A4283MaqKgsMin ;
   private java.math.BigDecimal A4285MaqKgsMax ;
   private java.math.BigDecimal AV36MgMin ;
   private java.math.BigDecimal AV35MgMax ;
   private java.math.BigDecimal AV38Rb ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV10maqcod ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV5EmprCod ;
   private String AV10maqcod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV9Barcodpar ;
   private String AV46Pgmname ;
   private String AV11UsurCod ;
   private String AV12Station ;
   private String GXKey ;
   private String Gx_msg ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavMaqcod_Internalname ;
   private String edtavMaqcod_Jsonclick ;
   private String edtavMaqdsc_Internalname ;
   private String TempTags ;
   private String AV16Maqdsc ;
   private String edtavMaqdsc_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavKgs_f_Internalname ;
   private String edtavKgs_f_Jsonclick ;
   private String edtavTot_kgs_Internalname ;
   private String edtavTot_kgs_Jsonclick ;
   private String edtavMaqkgsmin_Internalname ;
   private String edtavMaqkgsmin_Jsonclick ;
   private String edtavMaqkgsmax_Internalname ;
   private String edtavMaqkgsmax_Jsonclick ;
   private String edtavVolumennew_Internalname ;
   private String edtavVolumennew_Jsonclick ;
   private String edtavBarvolmaq_Internalname ;
   private String edtavBarvolmaq_Jsonclick ;
   private String edtavMaqvolmin_Internalname ;
   private String edtavMaqvolmin_Jsonclick ;
   private String edtavMaqvolmax_Internalname ;
   private String edtavMaqvolmax_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String hsh ;
   private String AV13EmprNom ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A396EmprCod ;
   private String GXt_char6 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String AV26Hdr ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
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
   private boolean n4283MaqKgsMin ;
   private boolean n4285MaqKgsMax ;
   private boolean n606MaqDsc ;
   private boolean n624MaqVolMed ;
   private boolean n623MaqVolMax ;
   private boolean n625MaqVolMin ;
   private String AV39Texto_i ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H011H2_A602MaqCod ;
   private java.math.BigDecimal[] H011H2_A4283MaqKgsMin ;
   private boolean[] H011H2_n4283MaqKgsMin ;
   private java.math.BigDecimal[] H011H2_A4285MaqKgsMax ;
   private boolean[] H011H2_n4285MaqKgsMax ;
   private String[] H011H2_A606MaqDsc ;
   private boolean[] H011H2_n606MaqDsc ;
   private int[] H011H2_A624MaqVolMed ;
   private boolean[] H011H2_n624MaqVolMed ;
   private int[] H011H2_A623MaqVolMax ;
   private boolean[] H011H2_n623MaqVolMax ;
   private int[] H011H2_A625MaqVolMin ;
   private boolean[] H011H2_n625MaqVolMin ;
   private String[] H011H2_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class wpwkgsupd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H011H2", "SELECT MaqCod, MaqKgsMin, MaqKgsMax, MaqDsc, MaqVolMed, MaqVolMax, MaqVolMin, EmprCod FROM TXPMAQUIN WHERE MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
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
      }
   }

}

