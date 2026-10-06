package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_adicionesmanual_ins_upd_impl extends GXDataArea
{
   public cierrerecetastinte_adicionesmanual_ins_upd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cierrerecetastinte_adicionesmanual_ins_upd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinte_adicionesmanual_ins_upd_impl.class ));
   }

   public cierrerecetastinte_adicionesmanual_ins_upd_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRDNUM") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprdnum1B40( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRDNUM") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprdnum1B40( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vPRDNUM") == 0 )
         {
            hV6PrdNum = httpContext.GetPar( "hV6PrdNum") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvprdnum1B42( hV6PrdNum) ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
            AV9Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9Emprcod", AV9Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV10Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcod), 8, 0));
               AV11Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
               AV12Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Barcodpar", AV12Barcodpar);
               AV13RecLinMal = (short)(GXutil.lval( httpContext.GetPar( "RecLinMal"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13RecLinMal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13RecLinMal), 4, 0));
               AV14RecNumAnyIn = (byte)(GXutil.lval( httpContext.GetPar( "RecNumAnyIn"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14RecNumAnyIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14RecNumAnyIn), 2, 0));
               AV15PrdnumIn = httpContext.GetPar( "PrdnumIn") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15PrdnumIn", AV15PrdnumIn);
               AV16PrdCFinIn = CommonUtil.decimalVal( httpContext.GetPar( "PrdCFinIn"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16PrdCFinIn", GXutil.ltrimstr( AV16PrdCFinIn, 11, 3));
               AV17LanyLoteIn = httpContext.GetPar( "LanyLoteIn") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17LanyLoteIn", AV17LanyLoteIn);
               Gx_mode = httpContext.GetPar( "Mode") ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
      pa1B42( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1B42( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.cierrerecetastinte_adicionesmanual_ins_upd", new String[] {GXutil.URLEncode(GXutil.rtrim(AV9Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV10Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV12Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV13RecLinMal,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14RecNumAnyIn,2,0)),GXutil.URLEncode(GXutil.rtrim(AV15PrdnumIn)),GXutil.URLEncode(DecimalUtil.decToString(AV16PrdCFinIn)),GXutil.URLEncode(GXutil.rtrim(AV17LanyLoteIn)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMal","RecNumAnyIn","PrdnumIn","PrdCFinIn","LanyLoteIn","Gx_mode"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRODUC", GXutil.ltrim( localUtil.ntoc( AV21Produc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV9Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV10Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV11Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV12Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAL", GXutil.ltrim( localUtil.ntoc( AV13RecLinMal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNOM", GXutil.rtrim( AV27PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV24UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV25Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vLANYLOTEIN", GXutil.rtrim( AV17LanyLoteIn));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDCFININ", GXutil.ltrim( localUtil.ntoc( AV16PrdCFinIn, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUMIN", GXutil.rtrim( AV15PrdnumIn));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECNUMANYIN", GXutil.ltrim( localUtil.ntoc( AV14RecNumAnyIn, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDLOTE", GXutil.rtrim( A10881PrdLote));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANRES", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXIALM", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDEXIALM", GXutil.ltrim( localUtil.ntoc( AV20Prdexialm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDCANRES", GXutil.ltrim( localUtil.ntoc( AV19PrdCanres, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDEXICC", GXutil.ltrim( localUtil.ntoc( AV23Prdexicc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSGERR", AV22MsgErr);
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvPRDNUM", GXutil.rtrim( AV6PrdNum));
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
         we1B42( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1B42( ) ;
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
      return formatLink("app.cierrerecetastinte_adicionesmanual_ins_upd", new String[] {GXutil.URLEncode(GXutil.rtrim(AV9Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV10Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV12Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV13RecLinMal,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14RecNumAnyIn,2,0)),GXutil.URLEncode(GXutil.rtrim(AV15PrdnumIn)),GXutil.URLEncode(DecimalUtil.decToString(AV16PrdCFinIn)),GXutil.URLEncode(GXutil.rtrim(AV17LanyLoteIn)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMal","RecNumAnyIn","PrdnumIn","PrdCFinIn","LanyLoteIn","Gx_mode"})  ;
   }

   public String getPgmname( )
   {
      return "CierreRecetasTinte_AdicionesManual_Ins_Upd" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Cierre Recetas Tinte_Adiciones Manual (Ins_Upd)", "") ;
   }

   public void wb1B40( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecnumany_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecnumany_Internalname, httpContext.getMessage( "Nº Añadida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecnumany_Internalname, GXutil.ltrim( localUtil.ntoc( AV5RecNumAny, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRecnumany_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5RecNumAny), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV5RecNumAny), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecnumany_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecnumany_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CierreRecetasTinte_AdicionesManual_Ins_Upd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdnum_Internalname, httpContext.getMessage( "Codigo Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnum_Internalname, hV6PrdNum, GXutil.rtrim( localUtil.format( hV6PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdnum_Enabled, 1, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_CierreRecetasTinte_AdicionesManual_Ins_Upd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdcfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdcfin_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdcfin_Internalname, GXutil.ltrim( localUtil.ntoc( AV7PrdCFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrdcfin_Enabled!=0) ? localUtil.format( AV7PrdCFin, "ZZZZZZ9.999") : localUtil.format( AV7PrdCFin, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdcfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdcfin_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CierreRecetasTinte_AdicionesManual_Ins_Upd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLanylote_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLanylote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLanylote_Internalname, GXutil.rtrim( AV8LanyLote), GXutil.rtrim( localUtil.format( AV8LanyLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLanylote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLanylote_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CierreRecetasTinte_AdicionesManual_Ins_Upd.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111b41_client"+"'", TempTags, "", 2, "HLP_CierreRecetasTinte_AdicionesManual_Ins_Upd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CierreRecetasTinte_AdicionesManual_Ins_Upd.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         wb_table1_50_1B42( true) ;
      }
      else
      {
         wb_table1_50_1B42( false) ;
      }
      return  ;
   }

   public void wb_table1_50_1B42e( boolean wbgen )
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

   public void start1B42( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Cierre Recetas Tinte_Adiciones Manual (Ins_Upd)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1B40( ) ;
   }

   public void ws1B42( )
   {
      start1B42( ) ;
      evt1B42( ) ;
   }

   public void evt1B42( )
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
                           e121B42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e131B42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e141B42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPRDNUM.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151B42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPRDCFIN.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161B42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e171B42 ();
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

   public void we1B42( )
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

   public void pa1B42( )
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
            GX_FocusControl = edtavPrdnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvprdnum1B40( String A13747PrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvprdnum_data1B40( A13747PrdCDsc) ;
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

   protected void gxsgvvprdnum_data1B40( String A13747PrdCDsc )
   {
      l13747PrdCDsc = GXutil.concat( GXutil.rtrim( A13747PrdCDsc), "%", "") ;
      /* Using cursor H01B42 */
      pr_default.execute(0, new Object[] {l13747PrdCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H01B42_A13747PrdCDsc[0]);
         gxdynajaxctrldescr.add(H01B42_A13747PrdCDsc[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxhcvvprdnum1B42( String A13747PrdCDsc )
   {
      /* Using cursor H01B43 */
      pr_default.execute(1, new Object[] {A13747PrdCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A856ValCod = H01B43_A856ValCod[0] ;
         A13747PrdCDsc = H01B43_A13747PrdCDsc[0] ;
         A396EmprCod = H01B43_A396EmprCod[0] ;
         A719PrdNum = H01B43_A719PrdNum[0] ;
         pr_default.readNext(1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\"") ;
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1B42( ) ;
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

   public void rf1B42( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e171B42 ();
         wb1B40( ) ;
      }
   }

   public void send_integrity_lvl_hashes1B42( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavRecnumany_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecnumany_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecnumany_Enabled), 5, 0), true);
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "UPD", ""), ""), "")) == 0 )
      {
         edtavPrdnum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavPrdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Enabled), 5, 0), true);
      }
      else
      {
         edtavPrdnum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavPrdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Enabled), 5, 0), true);
      }
      fix_multi_value_controls( ) ;
   }

   public void strup1B40( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131B42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV21Produc = (short)(localUtil.ctol( httpContext.cgiGet( "vPRODUC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "vMODE") ;
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
         AV5RecNumAny = (byte)(localUtil.ctol( httpContext.cgiGet( edtavRecnumany_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5RecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5RecNumAny), 2, 0));
         hV6PrdNum = httpContext.cgiGet( edtavPrdnum_Internalname) ;
         if ( (GXutil.strcmp("", hV6PrdNum)==0) )
         {
            AV6PrdNum = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6PrdNum", AV6PrdNum);
         }
         else
         {
            A13747PrdCDsc = hV6PrdNum ;
            /* Using cursor H01B44 */
            pr_default.execute(2, new Object[] {A13747PrdCDsc});
            AV6PrdNum = H01B44_A719PrdNum[0] ;
            if ( ! ( (pr_default.getStatus(2) == 101) ) )
            {
               pr_default.readNext(2);
               if ( ! ( (pr_default.getStatus(2) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "vPRDNUM");
                  GX_FocusControl = edtavPrdnum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(2);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV6PrdNum", hV6PrdNum);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrdcfin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdcfin_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDCFIN");
            GX_FocusControl = edtavPrdcfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7PrdCFin = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7PrdCFin", GXutil.ltrimstr( AV7PrdCFin, 11, 3));
         }
         else
         {
            AV7PrdCFin = localUtil.ctond( httpContext.cgiGet( edtavPrdcfin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7PrdCFin", GXutil.ltrimstr( AV7PrdCFin, 11, 3));
         }
         AV8LanyLote = httpContext.cgiGet( edtavLanylote_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8LanyLote", AV8LanyLote);
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
      e131B42 ();
      if (returnInSub) return;
   }

   public void e131B42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV25Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Station", AV25Station);
      GXv_char2[0] = AV9Emprcod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char4[0] = AV24UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char2, GXv_char3, GXv_char4) ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV9Emprcod = GXv_char2[0] ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV26EmprNom = GXv_char3[0] ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV24UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Emprcod", AV9Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV24UsurCod", AV24UsurCod);
      AV5RecNumAny = AV14RecNumAnyIn ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5RecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5RecNumAny), 2, 0));
      AV6PrdNum = AV15PrdnumIn ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6PrdNum", AV6PrdNum);
      /* Using cursor H01B45 */
      pr_default.execute(3, new Object[] {AV6PrdNum});
      hV6PrdNum = "" ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         hV6PrdNum = H01B45_A13747PrdCDsc[0] ;
         if (true) break;
      }
      pr_default.close(3);
      httpContext.ajax_rsp_assign_attri("", false, "hV6PrdNum", hV6PrdNum);
      AV7PrdCFin = AV16PrdCFinIn ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7PrdCFin", GXutil.ltrimstr( AV7PrdCFin, 11, 3));
      AV8LanyLote = AV17LanyLoteIn ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8LanyLote", AV8LanyLote);
      GXt_char1 = AV25Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.GXt_char1 = GXv_char4[0] ;
      AV25Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Station", AV25Station);
      GXv_char4[0] = AV9Emprcod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char2[0] = AV24UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char4, GXv_char3, GXv_char2) ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV9Emprcod = GXv_char4[0] ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV26EmprNom = GXv_char3[0] ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV24UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Emprcod", AV9Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV24UsurCod", AV24UsurCod);
   }

   public void e121B42( )
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

   public void e141B42( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV9Emprcod,Integer.valueOf(AV10Barcod),Byte.valueOf(AV11Barcodreo),AV12Barcodpar,Short.valueOf(AV13RecLinMal),Byte.valueOf(AV14RecNumAnyIn),AV15PrdnumIn,AV16PrdCFinIn,AV17LanyLoteIn,Gx_mode});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV9Emprcod","AV10Barcod","AV11Barcodreo","AV12Barcodpar","AV13RecLinMal","AV14RecNumAnyIn","AV15PrdnumIn","AV16PrdCFinIn","AV17LanyLoteIn","Gx_mode"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV9Emprcod ;
      GXv_int5[0] = AV10Barcod ;
      GXv_int6[0] = AV11Barcodreo ;
      GXv_char3[0] = AV12Barcodpar ;
      GXv_int7[0] = AV13RecLinMal ;
      GXv_int8[0] = AV5RecNumAny ;
      GXv_char2[0] = AV6PrdNum ;
      GXv_char9[0] = AV27PrdNom ;
      GXv_decimal10[0] = AV7PrdCFin ;
      GXv_char11[0] = AV8LanyLote ;
      GXv_char12[0] = AV24UsurCod ;
      GXv_char13[0] = AV25Station ;
      new app.pinsupdlanyad(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_int7, GXv_int8, GXv_char2, GXv_char9, GXv_decimal10, GXv_char11, GXv_char12, GXv_char13) ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV9Emprcod = GXv_char4[0] ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV10Barcod = GXv_int5[0] ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV11Barcodreo = GXv_int6[0] ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV12Barcodpar = GXv_char3[0] ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV13RecLinMal = GXv_int7[0] ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV5RecNumAny = GXv_int8[0] ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV6PrdNum = GXv_char2[0] ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV27PrdNom = GXv_char9[0] ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV7PrdCFin = GXv_decimal10[0] ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV8LanyLote = GXv_char11[0] ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV24UsurCod = GXv_char12[0] ;
      cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV25Station = GXv_char13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Emprcod", AV9Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV10Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV12Barcodpar", AV12Barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV13RecLinMal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13RecLinMal), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV5RecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5RecNumAny), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6PrdNum", AV6PrdNum);
      httpContext.ajax_rsp_assign_attri("", false, "AV27PrdNom", AV27PrdNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV7PrdCFin", GXutil.ltrimstr( AV7PrdCFin, 11, 3));
      httpContext.ajax_rsp_assign_attri("", false, "AV8LanyLote", AV8LanyLote);
      httpContext.ajax_rsp_assign_attri("", false, "AV24UsurCod", AV24UsurCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV25Station", AV25Station);
      httpContext.setWebReturnParms(new Object[] {AV9Emprcod,Integer.valueOf(AV10Barcod),Byte.valueOf(AV11Barcodreo),AV12Barcodpar,Short.valueOf(AV13RecLinMal),Byte.valueOf(AV14RecNumAnyIn),AV15PrdnumIn,AV16PrdCFinIn,AV17LanyLoteIn,Gx_mode});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV9Emprcod","AV10Barcod","AV11Barcodreo","AV12Barcodpar","AV13RecLinMal","AV14RecNumAnyIn","AV15PrdnumIn","AV16PrdCFinIn","AV17LanyLoteIn","Gx_mode"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e151B42( )
   {
      /* Prdnum_Isvalid Routine */
      returnInSub = false ;
      AV21Produc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Produc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Produc), 4, 0));
      /* Using cursor H01B46 */
      pr_default.execute(4, new Object[] {AV9Emprcod, AV6PrdNum});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A719PrdNum = H01B46_A719PrdNum[0] ;
         A396EmprCod = H01B46_A396EmprCod[0] ;
         A10881PrdLote = H01B46_A10881PrdLote[0] ;
         A685PrdCanRes = H01B46_A685PrdCanRes[0] ;
         A704PrdExiAlm = H01B46_A704PrdExiAlm[0] ;
         if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "UPD", ""), ""), "")) == 0 )
         {
            edtavPrdnum_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavPrdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Enabled), 5, 0), true);
         }
         else
         {
            edtavPrdnum_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavPrdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Enabled), 5, 0), true);
         }
         AV8LanyLote = A10881PrdLote ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8LanyLote", AV8LanyLote);
         AV19PrdCanres = A685PrdCanRes ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19PrdCanres", GXutil.ltrimstr( AV19PrdCanres, 12, 4));
         AV20Prdexialm = A704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Prdexialm", GXutil.ltrimstr( AV20Prdexialm, 12, 4));
         AV21Produc = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Produc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Produc), 4, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      /*  Sending Event outputs  */
   }

   public void e161B42( )
   {
      /* Prdcfin_Isvalid Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV6PrdNum)==0) && ( AV21Produc == 1 ) )
      {
         GXv_char13[0] = AV9Emprcod ;
         GXv_char12[0] = AV6PrdNum ;
         GXv_decimal10[0] = AV20Prdexialm ;
         GXv_decimal14[0] = AV19PrdCanres ;
         GXv_decimal15[0] = AV7PrdCFin ;
         GXv_decimal16[0] = AV23Prdexicc ;
         GXv_decimal17[0] = AV16PrdCFinIn ;
         GXv_int8[0] = (byte)(0) ;
         GXv_char11[0] = AV22MsgErr ;
         new app.pcantanyadida(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_decimal10, GXv_decimal14, GXv_decimal15, GXv_decimal16, GXv_decimal17, GXv_int8, GXv_char11) ;
         cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV9Emprcod = GXv_char13[0] ;
         cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV6PrdNum = GXv_char12[0] ;
         cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV20Prdexialm = GXv_decimal10[0] ;
         cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV19PrdCanres = GXv_decimal14[0] ;
         cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV7PrdCFin = GXv_decimal15[0] ;
         cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV23Prdexicc = GXv_decimal16[0] ;
         cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV16PrdCFinIn = GXv_decimal17[0] ;
         cierrerecetastinte_adicionesmanual_ins_upd_impl.this.AV22MsgErr = GXv_char11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Emprcod", AV9Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV6PrdNum", AV6PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV20Prdexialm", GXutil.ltrimstr( AV20Prdexialm, 12, 4));
         httpContext.ajax_rsp_assign_attri("", false, "AV19PrdCanres", GXutil.ltrimstr( AV19PrdCanres, 12, 4));
         httpContext.ajax_rsp_assign_attri("", false, "AV7PrdCFin", GXutil.ltrimstr( AV7PrdCFin, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Prdexicc", GXutil.ltrimstr( AV23Prdexicc, 12, 4));
         httpContext.ajax_rsp_assign_attri("", false, "AV16PrdCFinIn", GXutil.ltrimstr( AV16PrdCFinIn, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV22MsgErr", AV22MsgErr);
         if ( ! (GXutil.strcmp("", AV22MsgErr)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.", "")+AV22MsgErr);
         }
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e171B42( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_50_1B42( boolean wbgen )
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
         wb_table1_50_1B42e( true) ;
      }
      else
      {
         wb_table1_50_1B42e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV9Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Emprcod", AV9Emprcod);
      AV10Barcod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcod), 8, 0));
      AV11Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
      AV12Barcodpar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Barcodpar", AV12Barcodpar);
      AV13RecLinMal = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13RecLinMal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13RecLinMal), 4, 0));
      AV14RecNumAnyIn = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14RecNumAnyIn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14RecNumAnyIn), 2, 0));
      AV15PrdnumIn = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15PrdnumIn", AV15PrdnumIn);
      AV16PrdCFinIn = (java.math.BigDecimal)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PrdCFinIn", GXutil.ltrimstr( AV16PrdCFinIn, 11, 3));
      AV17LanyLoteIn = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17LanyLoteIn", AV17LanyLoteIn);
      Gx_mode = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
      pa1B42( ) ;
      ws1B42( ) ;
      we1B42( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101643185", true, true);
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
      httpContext.AddJavascriptSource("cierrerecetastinte_adicionesmanual_ins_upd.js", "?20266101643185", false, true);
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
      edtavRecnumany_Internalname = "vRECNUMANY" ;
      edtavPrdnum_Internalname = "vPRDNUM" ;
      edtavPrdcfin_Internalname = "vPRDCFIN" ;
      edtavLanylote_Internalname = "vLANYLOTE" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
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
      edtavLanylote_Jsonclick = "" ;
      edtavLanylote_Enabled = 1 ;
      edtavPrdcfin_Jsonclick = "" ;
      edtavPrdcfin_Enabled = 1 ;
      edtavPrdnum_Jsonclick = "" ;
      edtavPrdnum_Enabled = 1 ;
      edtavRecnumany_Jsonclick = "" ;
      edtavRecnumany_Enabled = 0 ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma los datos?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Cierre Recetas Tinte_Adiciones Manual (Ins_Upd)", "") );
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

   public void validv_Prdnum( )
   {
      if ( (GXutil.strcmp("", hV6PrdNum)==0) )
      {
         AV6PrdNum = "" ;
      }
      else
      {
         A13747PrdCDsc = hV6PrdNum ;
         /* Using cursor H01B47 */
         pr_default.execute(5, new Object[] {A13747PrdCDsc});
         AV6PrdNum = H01B47_A719PrdNum[0] ;
         if ( ! ( (pr_default.getStatus(5) == 101) ) )
         {
            pr_default.readNext(5);
            if ( ! ( (pr_default.getStatus(5) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "vPRDNUM");
               GX_FocusControl = edtavPrdnum_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(5);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV6PrdNum", hV6PrdNum);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV6PrdNum", GXutil.rtrim( AV6PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "hV6PrdNum", hV6PrdNum);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e111B41',iparms:[{av:'AV7PrdCFin',fld:'vPRDCFIN',pic:'ZZZZZZ9.999'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV21Produc',fld:'vPRODUC',pic:'ZZZ9'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'Dvelop_confirmpanel_confirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e121B42',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV9Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV12Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV13RecLinMal',fld:'vRECLINMAL',pic:'ZZZ9'},{av:'AV5RecNumAny',fld:'vRECNUMANY',pic:'Z9'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV27PrdNom',fld:'vPRDNOM',pic:''},{av:'AV7PrdCFin',fld:'vPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV8LanyLote',fld:'vLANYLOTE',pic:''},{av:'AV24UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV25Station',fld:'vSTATION',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV17LanyLoteIn',fld:'vLANYLOTEIN',pic:''},{av:'AV16PrdCFinIn',fld:'vPRDCFININ',pic:'ZZZZZZ9.999'},{av:'AV15PrdnumIn',fld:'vPRDNUMIN',pic:''},{av:'AV14RecNumAnyIn',fld:'vRECNUMANYIN',pic:'Z9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV25Station',fld:'vSTATION',pic:''},{av:'AV24UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV8LanyLote',fld:'vLANYLOTE',pic:''},{av:'AV7PrdCFin',fld:'vPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV27PrdNom',fld:'vPRDNOM',pic:''},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV5RecNumAny',fld:'vRECNUMANY',pic:'Z9'},{av:'AV13RecLinMal',fld:'vRECLINMAL',pic:'ZZZ9'},{av:'AV12Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e141B42',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV17LanyLoteIn',fld:'vLANYLOTEIN',pic:''},{av:'AV16PrdCFinIn',fld:'vPRDCFININ',pic:'ZZZZZZ9.999'},{av:'AV15PrdnumIn',fld:'vPRDNUMIN',pic:''},{av:'AV14RecNumAnyIn',fld:'vRECNUMANYIN',pic:'Z9'},{av:'AV13RecLinMal',fld:'vRECLINMAL',pic:'ZZZ9'},{av:'AV12Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VPRDNUM.ISVALID","{handler:'e151B42',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV9Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("VPRDNUM.ISVALID",",oparms:[{av:'AV21Produc',fld:'vPRODUC',pic:'ZZZ9'},{av:'AV8LanyLote',fld:'vLANYLOTE',pic:''},{av:'AV19PrdCanres',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV20Prdexialm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("VPRDCFIN.ISVALID","{handler:'e161B42',iparms:[{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV21Produc',fld:'vPRODUC',pic:'ZZZ9'},{av:'AV9Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV20Prdexialm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV19PrdCanres',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV7PrdCFin',fld:'vPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV23Prdexicc',fld:'vPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV16PrdCFinIn',fld:'vPRDCFININ',pic:'ZZZZZZ9.999'},{av:'AV22MsgErr',fld:'vMSGERR',pic:''}]");
      setEventMetadata("VPRDCFIN.ISVALID",",oparms:[{av:'AV22MsgErr',fld:'vMSGERR',pic:''},{av:'AV16PrdCFinIn',fld:'vPRDCFININ',pic:'ZZZZZZ9.999'},{av:'AV23Prdexicc',fld:'vPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV7PrdCFin',fld:'vPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV19PrdCanres',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV20Prdexialm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'AV9Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALIDV_PRDNUM","{handler:'validv_Prdnum',iparms:[{av:'hV6PrdNum'},{av:'AV6PrdNum',fld:'vPRDNUM',pic:''}]");
      setEventMetadata("VALIDV_PRDNUM",",oparms:[{av:'AV6PrdNum',fld:'vPRDNUM',pic:''},{av:'hV6PrdNum'}]}");
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
      wcpOAV9Emprcod = "" ;
      wcpOAV12Barcodpar = "" ;
      wcpOAV15PrdnumIn = "" ;
      wcpOAV16PrdCFinIn = DecimalUtil.ZERO ;
      wcpOAV17LanyLoteIn = "" ;
      wcpOGx_mode = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A13747PrdCDsc = "" ;
      hV6PrdNum = "" ;
      AV9Emprcod = "" ;
      AV12Barcodpar = "" ;
      AV15PrdnumIn = "" ;
      AV16PrdCFinIn = DecimalUtil.ZERO ;
      AV17LanyLoteIn = "" ;
      Gx_mode = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV27PrdNom = "" ;
      AV24UsurCod = "" ;
      AV25Station = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A10881PrdLote = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      AV20Prdexialm = DecimalUtil.ZERO ;
      AV19PrdCanres = DecimalUtil.ZERO ;
      AV23Prdexicc = DecimalUtil.ZERO ;
      AV22MsgErr = "" ;
      AV6PrdNum = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV7PrdCFin = DecimalUtil.ZERO ;
      AV8LanyLote = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13747PrdCDsc = "" ;
      H01B42_A13747PrdCDsc = new String[] {""} ;
      H01B43_A856ValCod = new byte[1] ;
      H01B43_A13747PrdCDsc = new String[] {""} ;
      H01B43_A396EmprCod = new String[] {""} ;
      H01B43_A719PrdNum = new String[] {""} ;
      H01B44_A856ValCod = new byte[1] ;
      H01B44_A13747PrdCDsc = new String[] {""} ;
      H01B44_A396EmprCod = new String[] {""} ;
      H01B44_A719PrdNum = new String[] {""} ;
      AV26EmprNom = "" ;
      H01B45_A856ValCod = new byte[1] ;
      H01B45_A13747PrdCDsc = new String[] {""} ;
      H01B45_A396EmprCod = new String[] {""} ;
      H01B45_A719PrdNum = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_char9 = new String[1] ;
      H01B46_A719PrdNum = new String[] {""} ;
      H01B46_A396EmprCod = new String[] {""} ;
      H01B46_A10881PrdLote = new String[] {""} ;
      H01B46_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01B46_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXv_char13 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char11 = new String[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H01B47_A856ValCod = new byte[1] ;
      H01B47_A13747PrdCDsc = new String[] {""} ;
      H01B47_A396EmprCod = new String[] {""} ;
      H01B47_A719PrdNum = new String[] {""} ;
      ZV6PrdNum = "" ;
      ZhV6PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cierrerecetastinte_adicionesmanual_ins_upd__default(),
         new Object[] {
             new Object[] {
            H01B42_A13747PrdCDsc
            }
            , new Object[] {
            H01B43_A856ValCod, H01B43_A13747PrdCDsc, H01B43_A396EmprCod, H01B43_A719PrdNum
            }
            , new Object[] {
            H01B44_A856ValCod, H01B44_A13747PrdCDsc, H01B44_A396EmprCod, H01B44_A719PrdNum
            }
            , new Object[] {
            H01B45_A856ValCod, H01B45_A13747PrdCDsc, H01B45_A396EmprCod, H01B45_A719PrdNum
            }
            , new Object[] {
            H01B46_A719PrdNum, H01B46_A396EmprCod, H01B46_A10881PrdLote, H01B46_A685PrdCanRes, H01B46_A704PrdExiAlm
            }
            , new Object[] {
            H01B47_A856ValCod, H01B47_A13747PrdCDsc, H01B47_A396EmprCod, H01B47_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV11Barcodreo ;
   private byte wcpOAV14RecNumAnyIn ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV11Barcodreo ;
   private byte AV14RecNumAnyIn ;
   private byte gxajaxcallmode ;
   private byte AV5RecNumAny ;
   private byte nDonePA ;
   private byte A856ValCod ;
   private byte GXv_int6[] ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private short wcpOAV13RecLinMal ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV13RecLinMal ;
   private short AV21Produc ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short GXv_int7[] ;
   private int wcpOAV10Barcod ;
   private int AV10Barcod ;
   private int edtavRecnumany_Enabled ;
   private int edtavPrdnum_Enabled ;
   private int edtavPrdcfin_Enabled ;
   private int edtavLanylote_Enabled ;
   private int gxdynajaxindex ;
   private int GXv_int5[] ;
   private int idxLst ;
   private java.math.BigDecimal wcpOAV16PrdCFinIn ;
   private java.math.BigDecimal AV16PrdCFinIn ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal AV20Prdexialm ;
   private java.math.BigDecimal AV19PrdCanres ;
   private java.math.BigDecimal AV23Prdexicc ;
   private java.math.BigDecimal AV7PrdCFin ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private String wcpOAV9Emprcod ;
   private String wcpOAV12Barcodpar ;
   private String wcpOAV15PrdnumIn ;
   private String wcpOAV17LanyLoteIn ;
   private String wcpOGx_mode ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV9Emprcod ;
   private String AV12Barcodpar ;
   private String AV15PrdnumIn ;
   private String AV17LanyLoteIn ;
   private String Gx_mode ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV27PrdNom ;
   private String AV24UsurCod ;
   private String AV25Station ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A10881PrdLote ;
   private String AV6PrdNum ;
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
   private String edtavRecnumany_Internalname ;
   private String edtavRecnumany_Jsonclick ;
   private String edtavPrdnum_Internalname ;
   private String TempTags ;
   private String edtavPrdnum_Jsonclick ;
   private String edtavPrdcfin_Internalname ;
   private String edtavPrdcfin_Jsonclick ;
   private String edtavLanylote_Internalname ;
   private String AV8LanyLote ;
   private String edtavLanylote_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String AV26EmprNom ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
   private String GXv_char13[] ;
   private String GXv_char12[] ;
   private String GXv_char11[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String ZV6PrdNum ;
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
   private String A13747PrdCDsc ;
   private String hV6PrdNum ;
   private String AV22MsgErr ;
   private String l13747PrdCDsc ;
   private String ZhV6PrdNum ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private IDataStoreProvider pr_default ;
   private String[] H01B42_A13747PrdCDsc ;
   private byte[] H01B43_A856ValCod ;
   private String[] H01B43_A13747PrdCDsc ;
   private String[] H01B43_A396EmprCod ;
   private String[] H01B43_A719PrdNum ;
   private byte[] H01B44_A856ValCod ;
   private String[] H01B44_A13747PrdCDsc ;
   private String[] H01B44_A396EmprCod ;
   private String[] H01B44_A719PrdNum ;
   private byte[] H01B45_A856ValCod ;
   private String[] H01B45_A13747PrdCDsc ;
   private String[] H01B45_A396EmprCod ;
   private String[] H01B45_A719PrdNum ;
   private String[] H01B46_A719PrdNum ;
   private String[] H01B46_A396EmprCod ;
   private String[] H01B46_A10881PrdLote ;
   private java.math.BigDecimal[] H01B46_A685PrdCanRes ;
   private java.math.BigDecimal[] H01B46_A704PrdExiAlm ;
   private byte[] H01B47_A856ValCod ;
   private String[] H01B47_A13747PrdCDsc ;
   private String[] H01B47_A396EmprCod ;
   private String[] H01B47_A719PrdNum ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class cierrerecetastinte_adicionesmanual_ins_upd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01B42", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc FROM TXPPRODUC WHERE (UPPER(RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom))) like '%' || UPPER(?)) AND (ValCod <= 2) ORDER BY PrdCDsc) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01B43", "SELECT ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ?) AND (ValCod <= 2) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01B44", "SELECT ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ?) AND (ValCod <= 2) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01B45", "SELECT ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (ValCod <= 2) AND (PrdNum = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01B46", "SELECT PrdNum, EmprCod, PrdLote, PrdCanRes, PrdExiAlm FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01B47", "SELECT ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ?) AND (ValCod <= 2) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
      }
   }

}

