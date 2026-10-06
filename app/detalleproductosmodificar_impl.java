package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class detalleproductosmodificar_impl extends GXDataArea
{
   public detalleproductosmodificar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public detalleproductosmodificar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( detalleproductosmodificar_impl.class ));
   }

   public detalleproductosmodificar_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vFORPRDUME") == 0 )
         {
            A13746ForPrdCDsc = httpContext.GetPar( "ForPrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvforprdume1610( A13746ForPrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vFORPRDUME") == 0 )
         {
            A13746ForPrdCDsc = httpContext.GetPar( "ForPrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvforprdume1610( A13746ForPrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vFORPRDUME") == 0 )
         {
            hV25ForPrdUMe = httpContext.GetPar( "hV25ForPrdUMe") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvforprdume1612( hV25ForPrdUMe) ;
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
               AV6HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6HreBarCod), 8, 0));
               AV7HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7HreBarReo", GXutil.str( AV7HreBarReo, 1, 0));
               AV8HreBarPar = httpContext.GetPar( "HreBarPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8HreBarPar", AV8HreBarPar);
               AV9HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9HreNumCie), 2, 0));
               AV10HreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "HreLinMaq"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10HreLinMaq), 4, 0));
               AV11HreLinPro = (byte)(GXutil.lval( httpContext.GetPar( "HreLinPro"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11HreLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11HreLinPro), 2, 0));
               AV12HreRecLin = (short)(GXutil.lval( httpContext.GetPar( "HreRecLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12HreRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12HreRecLin), 4, 0));
               AV13HreCanAny = CommonUtil.decimalVal( httpContext.GetPar( "HreCanAny"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13HreCanAny", GXutil.ltrimstr( AV13HreCanAny, 11, 3));
               AV14HreFacCon = CommonUtil.decimalVal( httpContext.GetPar( "HreFacCon"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14HreFacCon", GXutil.ltrimstr( AV14HreFacCon, 11, 5));
               AV15HrePrdCant = CommonUtil.decimalVal( httpContext.GetPar( "HrePrdCant"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15HrePrdCant", GXutil.ltrimstr( AV15HrePrdCant, 11, 3));
               AV16HrePrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "HrePrdUMe"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16HrePrdUMe", GXutil.str( AV16HrePrdUMe, 1, 0));
               AV17Hreprduds = httpContext.GetPar( "Hreprduds") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Hreprduds", AV17Hreprduds);
               AV18Prdnum = httpContext.GetPar( "Prdnum") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Prdnum", AV18Prdnum);
               AV19Prdnom = httpContext.GetPar( "Prdnom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Prdnom", AV19Prdnom);
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
      pa1612( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1612( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.detalleproductosmodificar", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(AV9HreNumCie,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10HreLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11HreLinPro,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12HreRecLin,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV13HreCanAny)),GXutil.URLEncode(DecimalUtil.decToString(AV14HreFacCon)),GXutil.URLEncode(DecimalUtil.decToString(AV15HrePrdCant)),GXutil.URLEncode(GXutil.ltrimstr(AV16HrePrdUMe,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17Hreprduds)),GXutil.URLEncode(GXutil.rtrim(AV18Prdnum)),GXutil.URLEncode(GXutil.rtrim(AV19Prdnom))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","HreNumCie","HreLinMaq","HreLinPro","HreRecLin","HreCanAny","HreFacCon","HrePrdCant","HrePrdUMe","Hreprduds","Prdnum","Prdnom"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINAMAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Tinamar), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39ValCos), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DetalleProductosModificar");
      forbiddenHiddens.add("Hretotkgm", localUtil.format( AV20Hretotkgm, "ZZZZZ9.99"));
      forbiddenHiddens.add("HreVolPrd", localUtil.format( DecimalUtil.doubleToDec(AV21HreVolPrd), "ZZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("detalleproductosmodificar:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vUNDDSC", AV32UndDsc);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vUNDDSC", AV32UndDsc);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREBARCOD", GXutil.ltrim( localUtil.ntoc( AV6HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREBARREO", GXutil.ltrim( localUtil.ntoc( AV7HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREBARPAR", GXutil.rtrim( AV8HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vHRENUMCIE", GXutil.ltrim( localUtil.ntoc( AV9HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHRELINMAQ", GXutil.ltrim( localUtil.ntoc( AV10HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHRELINPRO", GXutil.ltrim( localUtil.ntoc( AV11HreLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHRERECLIN", GXutil.ltrim( localUtil.ntoc( AV12HreRecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUMIN", GXutil.rtrim( AV28Prdnumin));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNOMIN", GXutil.rtrim( AV27PrdNomin));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREPRDUME", GXutil.ltrim( localUtil.ntoc( AV16HrePrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINAMAR", GXutil.ltrim( localUtil.ntoc( AV33Tinamar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINAMAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Tinamar), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV47Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV30Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV31Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vNVECES", GXutil.ltrim( localUtil.ntoc( AV38Nveces, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSGE", GXutil.rtrim( AV37MsgE));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV40inc_obs);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOBJETOREFRESCAR", AV42ObjetoRefrescar);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOBJETOREFRESCAR", AV42ObjetoRefrescar);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vVALCOS", GXutil.ltrim( localUtil.ntoc( AV39ValCos, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39ValCos), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvFORPRDUME", GXutil.ltrim( localUtil.ntoc( AV25ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Title", GXutil.rtrim( Dvelop_confirmpanel_modificar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_modificar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_modificar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_modificar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_modificar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_modificar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_modificar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Result", GXutil.rtrim( Dvelop_confirmpanel_modificar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICAR_Result", GXutil.rtrim( Dvelop_confirmpanel_modificar_Result));
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
         we1612( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1612( ) ;
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
      return formatLink("app.detalleproductosmodificar", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(AV9HreNumCie,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10HreLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11HreLinPro,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12HreRecLin,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV13HreCanAny)),GXutil.URLEncode(DecimalUtil.decToString(AV14HreFacCon)),GXutil.URLEncode(DecimalUtil.decToString(AV15HrePrdCant)),GXutil.URLEncode(GXutil.ltrimstr(AV16HrePrdUMe,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17Hreprduds)),GXutil.URLEncode(GXutil.rtrim(AV18Prdnum)),GXutil.URLEncode(GXutil.rtrim(AV19Prdnom))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","HreNumCie","HreLinMaq","HreLinPro","HreRecLin","HreCanAny","HreFacCon","HrePrdCant","HrePrdUMe","Hreprduds","Prdnum","Prdnom"})  ;
   }

   public String getPgmname( )
   {
      return "DetalleProductosModificar" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Detalle Productos (Modificar)", "") ;
   }

   public void wb1610( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdnum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnum_Internalname, GXutil.rtrim( AV18Prdnum), GXutil.rtrim( localUtil.format( AV18Prdnum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdnum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DetalleProductosModificar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdnom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnom_Internalname, GXutil.rtrim( AV19Prdnom), GXutil.rtrim( localUtil.format( AV19Prdnom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdnom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DetalleProductosModificar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHretotkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHretotkgm_Internalname, httpContext.getMessage( "Kilos Receta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHretotkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV20Hretotkgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHretotkgm_Enabled!=0) ? localUtil.format( AV20Hretotkgm, "ZZZZZ9.99") : localUtil.format( AV20Hretotkgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHretotkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHretotkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DetalleProductosModificar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHrevolprd_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHrevolprd_Internalname, httpContext.getMessage( "Volumen Receta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHrevolprd_Internalname, GXutil.ltrim( localUtil.ntoc( AV21HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHrevolprd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21HreVolPrd), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV21HreVolPrd), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHrevolprd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHrevolprd_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DetalleProductosModificar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Inicial", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_DetalleProductosModificar.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHrefaccon_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHrefaccon_Internalname, httpContext.getMessage( "Factor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHrefaccon_Internalname, GXutil.ltrim( localUtil.ntoc( AV14HreFacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHrefaccon_Enabled!=0) ? localUtil.format( AV14HreFacCon, "ZZZZ9.99999") : localUtil.format( AV14HreFacCon, "ZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHrefaccon_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHrefaccon_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DetalleProductosModificar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHreprduds_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHreprduds_Internalname, httpContext.getMessage( "Und", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHreprduds_Internalname, GXutil.rtrim( AV17Hreprduds), GXutil.rtrim( localUtil.format( AV17Hreprduds, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHreprduds_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHreprduds_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DetalleProductosModificar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHreprdcant_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHreprdcant_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHreprdcant_Internalname, GXutil.ltrim( localUtil.ntoc( AV15HrePrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHreprdcant_Enabled!=0) ? localUtil.format( AV15HrePrdCant, "ZZZZZZ9.999") : localUtil.format( AV15HrePrdCant, "ZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHreprdcant_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHreprdcant_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DetalleProductosModificar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHrecanany_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHrecanany_Internalname, httpContext.getMessage( "Añadida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHrecanany_Internalname, GXutil.ltrim( localUtil.ntoc( AV13HreCanAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHrecanany_Enabled!=0) ? localUtil.format( AV13HreCanAny, "ZZZZZZ9.999") : localUtil.format( AV13HreCanAny, "ZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHrecanany_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHrecanany_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DetalleProductosModificar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup5_Internalname, httpContext.getMessage( "Final", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_DetalleProductosModificar.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavNewfactor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavNewfactor_Internalname, httpContext.getMessage( "Factor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNewfactor_Internalname, GXutil.ltrim( localUtil.ntoc( AV24NewFactor, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavNewfactor_Enabled!=0) ? localUtil.format( AV24NewFactor, "ZZZZ9.99999") : localUtil.format( AV24NewFactor, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNewfactor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavNewfactor_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DetalleProductosModificar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForprdume_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForprdume_Internalname, httpContext.getMessage( "Und", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForprdume_Internalname, hV25ForPrdUMe, GXutil.rtrim( localUtil.format( hV25ForPrdUMe, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForprdume_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForprdume_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_DetalleProductosModificar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavNewcant_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavNewcant_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNewcant_Internalname, GXutil.ltrim( localUtil.ntoc( AV23Newcant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavNewcant_Enabled!=0) ? localUtil.format( AV23Newcant, "ZZZZZZ9.999") : localUtil.format( AV23Newcant, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNewcant_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavNewcant_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DetalleProductosModificar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavNewcantad_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavNewcantad_Internalname, httpContext.getMessage( "Añadida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNewcantad_Internalname, GXutil.ltrim( localUtil.ntoc( AV22Newcantad, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavNewcantad_Enabled!=0) ? localUtil.format( AV22Newcantad, "ZZZZZZ9.999") : localUtil.format( AV22Newcantad, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNewcantad_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavNewcantad_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DetalleProductosModificar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmodificar_Internalname, "", httpContext.getMessage( "Modificar", ""), bttBtnmodificar_Jsonclick, 7, httpContext.getMessage( "Modificar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111611_client"+"'", TempTags, "", 2, "HLP_DetalleProductosModificar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DetalleProductosModificar.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogresos.render(context, "gxprogressindicator", Barradeprogresos_Internalname, "BARRADEPROGRESOSContainer");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         wb_table1_95_1612( true) ;
      }
      else
      {
         wb_table1_95_1612( false) ;
      }
      return  ;
   }

   public void wb_table1_95_1612e( boolean wbgen )
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

   public void start1612( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Detalle Productos (Modificar)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1610( ) ;
   }

   public void ws1612( )
   {
      start1612( ) ;
      evt1612( ) ;
   }

   public void evt1612( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_MODIFICAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121612 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e131612 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e141612 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e151612 ();
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

   public void we1612( )
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

   public void pa1612( )
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
            GX_FocusControl = edtavHretotkgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvforprdume1610( String A13746ForPrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvforprdume_data1610( A13746ForPrdCDsc) ;
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

   protected void gxsgvvforprdume_data1610( String A13746ForPrdCDsc )
   {
      l13746ForPrdCDsc = GXutil.concat( GXutil.rtrim( A13746ForPrdCDsc), "%", "") ;
      /* Using cursor H01612 */
      pr_default.execute(0, new Object[] {l13746ForPrdCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01612_A13746ForPrdCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13746ForPrdCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01612_A13746ForPrdCDsc[0]);
            gxdynajaxctrldescr.add(H01612_A13746ForPrdCDsc[0]);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxhcvvforprdume1612( String A13746ForPrdCDsc )
   {
      /* Using cursor H01613 */
      pr_default.execute(1, new Object[] {A13746ForPrdCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( GXutil.strcmp(H01613_A13746ForPrdCDsc[0], A13746ForPrdCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13746ForPrdCDsc = H01613_A13746ForPrdCDsc[0] ;
            A396EmprCod = H01613_A396EmprCod[0] ;
            A490ForPrdUMe = H01613_A490ForPrdUMe[0] ;
         }
         pr_default.readNext(1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")))+"\"") ;
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
      rf1612( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV47Pgmname = "DetalleProductosModificar" ;
      Gx_err = (short)(0) ;
      edtavPrdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Enabled), 5, 0), true);
      edtavPrdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnom_Enabled), 5, 0), true);
      edtavHretotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHretotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHretotkgm_Enabled), 5, 0), true);
      edtavHrevolprd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHrevolprd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrevolprd_Enabled), 5, 0), true);
      edtavHrefaccon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHrefaccon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrefaccon_Enabled), 5, 0), true);
      edtavHreprduds_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHreprduds_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHreprduds_Enabled), 5, 0), true);
      edtavHreprdcant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHreprdcant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHreprdcant_Enabled), 5, 0), true);
      edtavHrecanany_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHrecanany_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrecanany_Enabled), 5, 0), true);
   }

   public void rf1612( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e151612 ();
         wb1610( ) ;
      }
   }

   public void send_integrity_lvl_hashes1612( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vTINAMAR", GXutil.ltrim( localUtil.ntoc( AV33Tinamar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINAMAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Tinamar), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV47Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV47Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALCOS", GXutil.ltrim( localUtil.ntoc( AV39ValCos, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39ValCos), "ZZZZZZZ9")));
   }

   public void before_start_formulas( )
   {
      AV47Pgmname = "DetalleProductosModificar" ;
      Gx_err = (short)(0) ;
      edtavPrdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Enabled), 5, 0), true);
      edtavPrdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnom_Enabled), 5, 0), true);
      edtavHretotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHretotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHretotkgm_Enabled), 5, 0), true);
      edtavHrevolprd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHrevolprd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrevolprd_Enabled), 5, 0), true);
      edtavHrefaccon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHrefaccon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrefaccon_Enabled), 5, 0), true);
      edtavHreprduds_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHreprduds_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHreprduds_Enabled), 5, 0), true);
      edtavHreprdcant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHreprdcant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHreprdcant_Enabled), 5, 0), true);
      edtavHrecanany_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHrecanany_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrecanany_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1610( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131612 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV39ValCos = (int)(localUtil.ctol( httpContext.cgiGet( "vVALCOS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_modificar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICAR_Title") ;
         Dvelop_confirmpanel_modificar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICAR_Confirmationtext") ;
         Dvelop_confirmpanel_modificar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_modificar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_modificar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_modificar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_modificar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICAR_Confirmtype") ;
         Dvelop_confirmpanel_modificar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICAR_Result") ;
         /* Read variables values. */
         AV18Prdnum = httpContext.cgiGet( edtavPrdnum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Prdnum", AV18Prdnum);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavHretotkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavHretotkgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHRETOTKGM");
            GX_FocusControl = edtavHretotkgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20Hretotkgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Hretotkgm", GXutil.ltrimstr( AV20Hretotkgm, 9, 2));
         }
         else
         {
            AV20Hretotkgm = localUtil.ctond( httpContext.cgiGet( edtavHretotkgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Hretotkgm", GXutil.ltrimstr( AV20Hretotkgm, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHrevolprd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHrevolprd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHREVOLPRD");
            GX_FocusControl = edtavHrevolprd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21HreVolPrd = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21HreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21HreVolPrd), 5, 0));
         }
         else
         {
            AV21HreVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtavHrevolprd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21HreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21HreVolPrd), 5, 0));
         }
         AV17Hreprduds = httpContext.cgiGet( edtavHreprduds_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Hreprduds", AV17Hreprduds);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavNewfactor_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavNewfactor_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNEWFACTOR");
            GX_FocusControl = edtavNewfactor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24NewFactor = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24NewFactor", GXutil.ltrimstr( AV24NewFactor, 11, 5));
         }
         else
         {
            AV24NewFactor = localUtil.ctond( httpContext.cgiGet( edtavNewfactor_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24NewFactor", GXutil.ltrimstr( AV24NewFactor, 11, 5));
         }
         hV25ForPrdUMe = httpContext.cgiGet( edtavForprdume_Internalname) ;
         if ( (GXutil.strcmp("", hV25ForPrdUMe)==0) )
         {
            AV25ForPrdUMe = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25ForPrdUMe", GXutil.str( AV25ForPrdUMe, 1, 0));
         }
         else
         {
            A13746ForPrdCDsc = hV25ForPrdUMe ;
            /* Using cursor H01614 */
            pr_default.execute(2, new Object[] {A13746ForPrdCDsc});
            AV25ForPrdUMe = H01614_A490ForPrdUMe[0] ;
            if ( ! ( (pr_default.getStatus(2) == 101) ) )
            {
               pr_default.readNext(2);
               if ( ! ( (pr_default.getStatus(2) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vFORPRDUME");
                  GX_FocusControl = edtavForprdume_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(2);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV25ForPrdUMe", hV25ForPrdUMe);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavNewcant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavNewcant_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNEWCANT");
            GX_FocusControl = edtavNewcant_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23Newcant = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Newcant", GXutil.ltrimstr( AV23Newcant, 11, 3));
         }
         else
         {
            AV23Newcant = localUtil.ctond( httpContext.cgiGet( edtavNewcant_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Newcant", GXutil.ltrimstr( AV23Newcant, 11, 3));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavNewcantad_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavNewcantad_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNEWCANTAD");
            GX_FocusControl = edtavNewcantad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22Newcantad = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Newcantad", GXutil.ltrimstr( AV22Newcantad, 11, 3));
         }
         else
         {
            AV22Newcantad = localUtil.ctond( httpContext.cgiGet( edtavNewcantad_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Newcantad", GXutil.ltrimstr( AV22Newcantad, 11, 3));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DetalleProductosModificar");
         AV20Hretotkgm = localUtil.ctond( httpContext.cgiGet( edtavHretotkgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Hretotkgm", GXutil.ltrimstr( AV20Hretotkgm, 9, 2));
         forbiddenHiddens.add("Hretotkgm", localUtil.format( AV20Hretotkgm, "ZZZZZ9.99"));
         AV21HreVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtavHrevolprd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21HreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21HreVolPrd), 5, 0));
         forbiddenHiddens.add("HreVolPrd", localUtil.format( DecimalUtil.doubleToDec(AV21HreVolPrd), "ZZZZ9"));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("detalleproductosmodificar:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e131612 ();
      if (returnInSub) return;
   }

   public void e131612( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXv_char1[0] = AV5EmprCod ;
      GXv_char2[0] = "030100" ;
      GXv_int3[0] = AV39ValCos ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      detalleproductosmodificar_impl.this.AV5EmprCod = GXv_char1[0] ;
      detalleproductosmodificar_impl.this.AV39ValCos = GXv_int3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV39ValCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39ValCos), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39ValCos), "ZZZZZZZ9")));
      GXt_int4 = AV33Tinamar ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int5) ;
      detalleproductosmodificar_impl.this.GXt_int4 = GXv_int5[0] ;
      AV33Tinamar = GXt_int4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Tinamar", GXutil.str( AV33Tinamar, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINAMAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Tinamar), "9")));
      AV22Newcantad = AV13HreCanAny ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Newcantad", GXutil.ltrimstr( AV22Newcantad, 11, 3));
      AV23Newcant = AV15HrePrdCant ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Newcant", GXutil.ltrimstr( AV23Newcant, 11, 3));
      AV24NewFactor = AV14HreFacCon ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24NewFactor", GXutil.ltrimstr( AV24NewFactor, 11, 5));
      AV27PrdNomin = AV19Prdnom ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27PrdNomin", AV27PrdNomin);
      AV28Prdnumin = AV18Prdnum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Prdnumin", AV28Prdnumin);
      AV25ForPrdUMe = AV16HrePrdUMe ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25ForPrdUMe", GXutil.str( AV25ForPrdUMe, 1, 0));
      /* Using cursor H01615 */
      pr_default.execute(3, new Object[] {Byte.valueOf(AV25ForPrdUMe)});
      hV25ForPrdUMe = "" ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         hV25ForPrdUMe = H01615_A13746ForPrdCDsc[0] ;
         if (true) break;
      }
      pr_default.close(3);
      httpContext.ajax_rsp_assign_attri("", false, "hV25ForPrdUMe", hV25ForPrdUMe);
      AV32UndDsc[1-1] = httpContext.getMessage( "Gr/L", "") ;
      AV32UndDsc[2-1] = httpContext.getMessage( "Cc/L", "") ;
      AV32UndDsc[3-1] = "%" ;
      /* Using cursor H01616 */
      pr_default.execute(4, new Object[] {AV5EmprCod, Integer.valueOf(AV6HreBarCod), Byte.valueOf(AV7HreBarReo), AV8HreBarPar, Byte.valueOf(AV9HreNumCie)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A4495HreNumCie = H01616_A4495HreNumCie[0] ;
         A4494HreBarPar = H01616_A4494HreBarPar[0] ;
         A4493HreBarReo = H01616_A4493HreBarReo[0] ;
         A4492HreBarCod = H01616_A4492HreBarCod[0] ;
         A396EmprCod = H01616_A396EmprCod[0] ;
         A4542HreTotKgm = H01616_A4542HreTotKgm[0] ;
         n4542HreTotKgm = H01616_n4542HreTotKgm[0] ;
         AV20Hretotkgm = A4542HreTotKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Hretotkgm", GXutil.ltrimstr( AV20Hretotkgm, 9, 2));
         /* Using cursor H01617 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(AV10HreLinMaq)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A4545HreLinMaq = H01617_A4545HreLinMaq[0] ;
            A4547HreVolPrd = H01617_A4547HreVolPrd[0] ;
            n4547HreVolPrd = H01617_n4547HreVolPrd[0] ;
            AV21HreVolPrd = A4547HreVolPrd ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21HreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21HreVolPrd), 5, 0));
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      GXt_char6 = AV31Station ;
      GXv_char2[0] = GXt_char6 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      detalleproductosmodificar_impl.this.GXt_char6 = GXv_char2[0] ;
      AV31Station = GXt_char6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Station", AV31Station);
      GXv_char2[0] = AV5EmprCod ;
      GXv_char1[0] = AV41EmprNom ;
      GXv_char7[0] = AV30Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV31Station, GXv_char2, GXv_char1, GXv_char7) ;
      detalleproductosmodificar_impl.this.AV5EmprCod = GXv_char2[0] ;
      detalleproductosmodificar_impl.this.AV41EmprNom = GXv_char1[0] ;
      detalleproductosmodificar_impl.this.AV30Usurcod = GXv_char7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV30Usurcod", AV30Usurcod);
   }

   public void e121612( )
   {
      /* Dvelop_confirmpanel_modificar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_modificar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION MODIFICAR' */
         S112 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36Progress", AV36Progress);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ObjetoRefrescar", AV42ObjetoRefrescar);
   }

   public void e141612( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      AV42ObjetoRefrescar.add(httpContext.getMessage( "DetalleProductosModificar", ""), 0);
      this.executeExternalObjectMethod("", false, "GlobalEvents", "RefrescarObjeto", new Object[] {AV42ObjetoRefrescar,Boolean.valueOf(false)}, true);
      httpContext.setWebReturnParms(new Object[] {AV5EmprCod,Integer.valueOf(AV6HreBarCod),Byte.valueOf(AV7HreBarReo),AV8HreBarPar,Byte.valueOf(AV9HreNumCie),Short.valueOf(AV10HreLinMaq),Byte.valueOf(AV11HreLinPro),Short.valueOf(AV12HreRecLin),AV13HreCanAny,AV14HreFacCon,AV15HrePrdCant,Byte.valueOf(AV16HrePrdUMe),AV17Hreprduds,AV18Prdnum,AV19Prdnom});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5EmprCod","AV6HreBarCod","AV7HreBarReo","AV8HreBarPar","AV9HreNumCie","AV10HreLinMaq","AV11HreLinPro","AV12HreRecLin","AV13HreCanAny","AV14HreFacCon","AV15HrePrdCant","AV16HrePrdUMe","AV17Hreprduds","AV18Prdnum","AV19Prdnom"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ObjetoRefrescar", AV42ObjetoRefrescar);
   }

   public void S112( )
   {
      /* 'DO ACTION MODIFICAR' Routine */
      returnInSub = false ;
      AV36Progress.setgxTv_SdtProgress_Type( (byte)(1) );
      AV36Progress.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV36Progress.setgxTv_SdtProgress_Value( 55 );
      AV36Progress.showwithtitle(httpContext.getMessage( "Validando Operacion", ""));
      AV36Progress.show();
      AV26ForPrdDsc = AV32UndDsc[AV25ForPrdUMe-1] ;
      GXv_char7[0] = AV5EmprCod ;
      GXv_int3[0] = AV6HreBarCod ;
      GXv_int5[0] = AV7HreBarReo ;
      GXv_char2[0] = AV8HreBarPar ;
      GXv_int8[0] = AV9HreNumCie ;
      GXv_int9[0] = AV10HreLinMaq ;
      GXv_int10[0] = AV11HreLinPro ;
      GXv_int11[0] = AV12HreRecLin ;
      GXv_decimal12[0] = AV23Newcant ;
      GXv_decimal13[0] = AV22Newcantad ;
      GXv_decimal14[0] = AV24NewFactor ;
      GXv_char1[0] = AV28Prdnumin ;
      GXv_char15[0] = AV27PrdNomin ;
      GXv_int16[0] = AV25ForPrdUMe ;
      GXv_char17[0] = AV26ForPrdDsc ;
      new app.updateproductohislreccstks(remoteHandle, context).execute( GXv_char7, GXv_int3, GXv_int5, GXv_char2, GXv_int8, GXv_int9, GXv_int10, GXv_int11, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_char1, GXv_char15, GXv_int16, GXv_char17) ;
      detalleproductosmodificar_impl.this.AV5EmprCod = GXv_char7[0] ;
      detalleproductosmodificar_impl.this.AV6HreBarCod = GXv_int3[0] ;
      detalleproductosmodificar_impl.this.AV7HreBarReo = GXv_int5[0] ;
      detalleproductosmodificar_impl.this.AV8HreBarPar = GXv_char2[0] ;
      detalleproductosmodificar_impl.this.AV9HreNumCie = GXv_int8[0] ;
      detalleproductosmodificar_impl.this.AV10HreLinMaq = GXv_int9[0] ;
      detalleproductosmodificar_impl.this.AV11HreLinPro = GXv_int10[0] ;
      detalleproductosmodificar_impl.this.AV12HreRecLin = GXv_int11[0] ;
      detalleproductosmodificar_impl.this.AV23Newcant = GXv_decimal12[0] ;
      detalleproductosmodificar_impl.this.AV22Newcantad = GXv_decimal13[0] ;
      detalleproductosmodificar_impl.this.AV24NewFactor = GXv_decimal14[0] ;
      detalleproductosmodificar_impl.this.AV28Prdnumin = GXv_char1[0] ;
      detalleproductosmodificar_impl.this.AV27PrdNomin = GXv_char15[0] ;
      detalleproductosmodificar_impl.this.AV25ForPrdUMe = GXv_int16[0] ;
      detalleproductosmodificar_impl.this.AV26ForPrdDsc = GXv_char17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV6HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6HreBarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7HreBarReo", GXutil.str( AV7HreBarReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8HreBarPar", AV8HreBarPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV9HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9HreNumCie), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10HreLinMaq), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11HreLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11HreLinPro), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV12HreRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12HreRecLin), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV23Newcant", GXutil.ltrimstr( AV23Newcant, 11, 3));
      httpContext.ajax_rsp_assign_attri("", false, "AV22Newcantad", GXutil.ltrimstr( AV22Newcantad, 11, 3));
      httpContext.ajax_rsp_assign_attri("", false, "AV24NewFactor", GXutil.ltrimstr( AV24NewFactor, 11, 5));
      httpContext.ajax_rsp_assign_attri("", false, "AV28Prdnumin", AV28Prdnumin);
      httpContext.ajax_rsp_assign_attri("", false, "AV27PrdNomin", AV27PrdNomin);
      httpContext.ajax_rsp_assign_attri("", false, "AV25ForPrdUMe", GXutil.str( AV25ForPrdUMe, 1, 0));
      AV29Textoi = httpContext.getMessage( "Factor Old ", "") + GXutil.str( AV14HreFacCon, 11, 5) + " -> " + GXutil.str( AV24NewFactor, 11, 5) + GXutil.newLine( ) ;
      AV29Textoi = httpContext.getMessage( "Unidad Old ", "") + GXutil.str( AV16HrePrdUMe, 1, 0) + " -> " + GXutil.str( AV25ForPrdUMe, 1, 0) + GXutil.newLine( ) ;
      AV29Textoi += httpContext.getMessage( "Cantidad  Old ", "") + GXutil.str( AV15HrePrdCant, 11, 3) + " -> " + GXutil.str( AV23Newcant, 11, 3) + GXutil.newLine( ) ;
      AV29Textoi += httpContext.getMessage( "Cantidad Ad Old ", "") + GXutil.str( AV13HreCanAny, 11, 3) + " -> " + GXutil.str( AV22Newcantad, 11, 3) + GXutil.newLine( ) ;
      if ( ( AV33Tinamar == 1 ) && ( GXutil.strcmp(AV28Prdnumin, AV18Prdnum) != 0 ) )
      {
         AV29Textoi += httpContext.getMessage( "Cambio de Producto ", "") + AV18Prdnum + httpContext.getMessage( " por ", "") + AV28Prdnumin + GXutil.newLine( ) ;
      }
      new app.pctrinc(remoteHandle, context).execute( AV5EmprCod, GXutil.substring( AV47Pgmname, 1, 10), AV30Usurcod, AV31Station, AV29Textoi, AV6HreBarCod, AV7HreBarReo, AV8HreBarPar) ;
      AV34Cant = (AV23Newcant.add(AV22Newcantad)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      AV35Oldcant = (AV15HrePrdCant.add(AV13HreCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      AV36Progress.setgxTv_SdtProgress_Value( 85 );
      GXv_char17[0] = AV5EmprCod ;
      GXv_int3[0] = AV6HreBarCod ;
      GXv_int16[0] = AV7HreBarReo ;
      GXv_char15[0] = AV8HreBarPar ;
      GXv_decimal14[0] = AV34Cant ;
      GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
      GXv_decimal12[0] = AV35Oldcant ;
      GXv_char7[0] = AV18Prdnum ;
      GXv_int11[0] = AV38Nveces ;
      GXv_char2[0] = httpContext.getMessage( "S", "") ;
      GXv_char1[0] = AV37MsgE ;
      GXv_char18[0] = AV40inc_obs ;
      GXv_char19[0] = AV30Usurcod ;
      GXv_char20[0] = AV31Station ;
      new app.pactccstkshislre(remoteHandle, context).execute( GXv_char17, GXv_int3, GXv_int16, GXv_char15, GXv_decimal14, GXv_decimal13, GXv_decimal12, GXv_char7, GXv_int11, GXv_char2, GXv_char1, GXv_char18, GXv_char19, GXv_char20) ;
      detalleproductosmodificar_impl.this.AV5EmprCod = GXv_char17[0] ;
      detalleproductosmodificar_impl.this.AV6HreBarCod = GXv_int3[0] ;
      detalleproductosmodificar_impl.this.AV7HreBarReo = GXv_int16[0] ;
      detalleproductosmodificar_impl.this.AV8HreBarPar = GXv_char15[0] ;
      detalleproductosmodificar_impl.this.AV34Cant = GXv_decimal14[0] ;
      detalleproductosmodificar_impl.this.AV35Oldcant = GXv_decimal12[0] ;
      detalleproductosmodificar_impl.this.AV18Prdnum = GXv_char7[0] ;
      detalleproductosmodificar_impl.this.AV38Nveces = GXv_int11[0] ;
      detalleproductosmodificar_impl.this.AV37MsgE = GXv_char1[0] ;
      detalleproductosmodificar_impl.this.AV40inc_obs = GXv_char18[0] ;
      detalleproductosmodificar_impl.this.AV30Usurcod = GXv_char19[0] ;
      detalleproductosmodificar_impl.this.AV31Station = GXv_char20[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV6HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6HreBarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7HreBarReo", GXutil.str( AV7HreBarReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8HreBarPar", AV8HreBarPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV18Prdnum", AV18Prdnum);
      httpContext.ajax_rsp_assign_attri("", false, "AV38Nveces", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Nveces), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV37MsgE", AV37MsgE);
      httpContext.ajax_rsp_assign_attri("", false, "AV40inc_obs", AV40inc_obs);
      httpContext.ajax_rsp_assign_attri("", false, "AV30Usurcod", AV30Usurcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV31Station", AV31Station);
      new app.pctrinc(remoteHandle, context).execute( AV5EmprCod, GXutil.substring( AV47Pgmname, 1, 10), AV30Usurcod, AV31Station, AV40inc_obs, AV6HreBarCod, AV7HreBarReo, AV8HreBarPar) ;
      AV36Progress.setgxTv_SdtProgress_Value( 100 );
      AV36Progress.hide();
      AV16HrePrdUMe = AV25ForPrdUMe ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16HrePrdUMe", GXutil.str( AV16HrePrdUMe, 1, 0));
      AV17Hreprduds = AV26ForPrdDsc ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Hreprduds", AV17Hreprduds);
      AV42ObjetoRefrescar.clear();
      AV42ObjetoRefrescar.add(httpContext.getMessage( "DetalleProductosModificar", ""), 0);
      this.executeExternalObjectMethod("", false, "GlobalEvents", "RefrescarObjeto", new Object[] {AV42ObjetoRefrescar,Boolean.valueOf(true)}, true);
      httpContext.setWebReturnParms(new Object[] {AV5EmprCod,Integer.valueOf(AV6HreBarCod),Byte.valueOf(AV7HreBarReo),AV8HreBarPar,Byte.valueOf(AV9HreNumCie),Short.valueOf(AV10HreLinMaq),Byte.valueOf(AV11HreLinPro),Short.valueOf(AV12HreRecLin),AV13HreCanAny,AV14HreFacCon,AV15HrePrdCant,Byte.valueOf(AV16HrePrdUMe),AV17Hreprduds,AV18Prdnum,AV19Prdnom});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5EmprCod","AV6HreBarCod","AV7HreBarReo","AV8HreBarPar","AV9HreNumCie","AV10HreLinMaq","AV11HreLinPro","AV12HreRecLin","AV13HreCanAny","AV14HreFacCon","AV15HrePrdCant","AV16HrePrdUMe","AV17Hreprduds","AV18Prdnum","AV19Prdnom"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e151612( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_95_1612( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_modificar_Internalname, tblTabledvelop_confirmpanel_modificar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_modificar.setProperty("Title", Dvelop_confirmpanel_modificar_Title);
         ucDvelop_confirmpanel_modificar.setProperty("ConfirmationText", Dvelop_confirmpanel_modificar_Confirmationtext);
         ucDvelop_confirmpanel_modificar.setProperty("YesButtonCaption", Dvelop_confirmpanel_modificar_Yesbuttoncaption);
         ucDvelop_confirmpanel_modificar.setProperty("NoButtonCaption", Dvelop_confirmpanel_modificar_Nobuttoncaption);
         ucDvelop_confirmpanel_modificar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_modificar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_modificar.setProperty("YesButtonPosition", Dvelop_confirmpanel_modificar_Yesbuttonposition);
         ucDvelop_confirmpanel_modificar.setProperty("ConfirmType", Dvelop_confirmpanel_modificar_Confirmtype);
         ucDvelop_confirmpanel_modificar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_modificar_Internalname, "DVELOP_CONFIRMPANEL_MODIFICARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_MODIFICARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_95_1612e( true) ;
      }
      else
      {
         wb_table1_95_1612e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      AV6HreBarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6HreBarCod), 8, 0));
      AV7HreBarReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7HreBarReo", GXutil.str( AV7HreBarReo, 1, 0));
      AV8HreBarPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8HreBarPar", AV8HreBarPar);
      AV9HreNumCie = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9HreNumCie), 2, 0));
      AV10HreLinMaq = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10HreLinMaq), 4, 0));
      AV11HreLinPro = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11HreLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11HreLinPro), 2, 0));
      AV12HreRecLin = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12HreRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12HreRecLin), 4, 0));
      AV13HreCanAny = (java.math.BigDecimal)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13HreCanAny", GXutil.ltrimstr( AV13HreCanAny, 11, 3));
      AV14HreFacCon = (java.math.BigDecimal)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14HreFacCon", GXutil.ltrimstr( AV14HreFacCon, 11, 5));
      AV15HrePrdCant = (java.math.BigDecimal)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15HrePrdCant", GXutil.ltrimstr( AV15HrePrdCant, 11, 3));
      AV16HrePrdUMe = ((Number) GXutil.testNumericType( getParm(obj,11), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16HrePrdUMe", GXutil.str( AV16HrePrdUMe, 1, 0));
      AV17Hreprduds = (String)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Hreprduds", AV17Hreprduds);
      AV18Prdnum = (String)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Prdnum", AV18Prdnum);
      AV19Prdnom = (String)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Prdnom", AV19Prdnom);
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
      pa1612( ) ;
      ws1612( ) ;
      we1612( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202679918489", true, true);
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
      httpContext.AddJavascriptSource("detalleproductosmodificar.js", "?202679918489", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavPrdnum_Internalname = "vPRDNUM" ;
      edtavPrdnom_Internalname = "vPRDNOM" ;
      edtavHretotkgm_Internalname = "vHRETOTKGM" ;
      edtavHrevolprd_Internalname = "vHREVOLPRD" ;
      edtavHrefaccon_Internalname = "vHREFACCON" ;
      edtavHreprduds_Internalname = "vHREPRDUDS" ;
      edtavHreprdcant_Internalname = "vHREPRDCANT" ;
      edtavHrecanany_Internalname = "vHRECANANY" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      grpUnnamedgroup3_Internalname = "UNNAMEDGROUP3" ;
      edtavNewfactor_Internalname = "vNEWFACTOR" ;
      edtavForprdume_Internalname = "vFORPRDUME" ;
      edtavNewcant_Internalname = "vNEWCANT" ;
      edtavNewcantad_Internalname = "vNEWCANTAD" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      grpUnnamedgroup5_Internalname = "UNNAMEDGROUP5" ;
      bttBtnmodificar_Internalname = "BTNMODIFICAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Barradeprogresos_Internalname = "BARRADEPROGRESOS" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_modificar_Internalname = "DVELOP_CONFIRMPANEL_MODIFICAR" ;
      tblTabledvelop_confirmpanel_modificar_Internalname = "TABLEDVELOP_CONFIRMPANEL_MODIFICAR" ;
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
      edtavNewcantad_Jsonclick = "" ;
      edtavNewcantad_Enabled = 1 ;
      edtavNewcant_Jsonclick = "" ;
      edtavNewcant_Enabled = 1 ;
      edtavForprdume_Jsonclick = "" ;
      edtavForprdume_Enabled = 1 ;
      edtavNewfactor_Jsonclick = "" ;
      edtavNewfactor_Enabled = 1 ;
      edtavHrecanany_Jsonclick = "" ;
      edtavHrecanany_Enabled = 0 ;
      edtavHreprdcant_Jsonclick = "" ;
      edtavHreprdcant_Enabled = 0 ;
      edtavHreprduds_Jsonclick = "" ;
      edtavHreprduds_Enabled = 0 ;
      edtavHrefaccon_Jsonclick = "" ;
      edtavHrefaccon_Enabled = 0 ;
      edtavHrevolprd_Jsonclick = "" ;
      edtavHrevolprd_Enabled = 1 ;
      edtavHretotkgm_Jsonclick = "" ;
      edtavHretotkgm_Enabled = 1 ;
      edtavPrdnom_Jsonclick = "" ;
      edtavPrdnom_Enabled = 0 ;
      edtavPrdnum_Jsonclick = "" ;
      edtavPrdnum_Enabled = 0 ;
      Dvelop_confirmpanel_modificar_Confirmtype = "1" ;
      Dvelop_confirmpanel_modificar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_modificar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_modificar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_modificar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_modificar_Confirmationtext = "¿Confirmar los cambios?" ;
      Dvelop_confirmpanel_modificar_Title = "" ;
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
      Form.setCaption( httpContext.getMessage( "Detalle Productos (Modificar)", "") );
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

   public void validv_Forprdume( )
   {
      if ( (GXutil.strcmp("", hV25ForPrdUMe)==0) )
      {
         AV25ForPrdUMe = (byte)(0) ;
      }
      else
      {
         A13746ForPrdCDsc = hV25ForPrdUMe ;
         /* Using cursor H01618 */
         pr_default.execute(6, new Object[] {A13746ForPrdCDsc});
         AV25ForPrdUMe = H01618_A490ForPrdUMe[0] ;
         if ( ! ( (pr_default.getStatus(6) == 101) ) )
         {
            pr_default.readNext(6);
            if ( ! ( (pr_default.getStatus(6) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vFORPRDUME");
               GX_FocusControl = edtavForprdume_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(6);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV25ForPrdUMe", hV25ForPrdUMe);
      if ( ! ( ( AV25ForPrdUMe == 0 ) || ( AV25ForPrdUMe == 1 ) || ( AV25ForPrdUMe == 2 ) || ( AV25ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "For Prd UMe", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "vFORPRDUME");
         GX_FocusControl = edtavForprdume_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV25ForPrdUMe", GXutil.ltrim( localUtil.ntoc( AV25ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV25ForPrdUMe", hV25ForPrdUMe);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV33Tinamar',fld:'vTINAMAR',pic:'9',hsh:true},{av:'AV47Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV39ValCos',fld:'vVALCOS',pic:'ZZZZZZZ9',hsh:true},{av:'AV20Hretotkgm',fld:'vHRETOTKGM',pic:'ZZZZZ9.99'},{av:'AV21HreVolPrd',fld:'vHREVOLPRD',pic:'ZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOMODIFICAR'","{handler:'e111611',iparms:[]");
      setEventMetadata("'DOMODIFICAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_MODIFICAR.CLOSE","{handler:'e121612',iparms:[{av:'Dvelop_confirmpanel_modificar_Result',ctrl:'DVELOP_CONFIRMPANEL_MODIFICAR',prop:'Result'},{av:'AV32UndDsc',fld:'vUNDDSC',pic:''},{av:'AV25ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV12HreRecLin',fld:'vHRERECLIN',pic:'ZZZ9'},{av:'AV23Newcant',fld:'vNEWCANT',pic:'ZZZZZZ9.999'},{av:'AV22Newcantad',fld:'vNEWCANTAD',pic:'ZZZZZZ9.999'},{av:'AV24NewFactor',fld:'vNEWFACTOR',pic:'ZZZZ9.99999'},{av:'AV28Prdnumin',fld:'vPRDNUMIN',pic:''},{av:'AV27PrdNomin',fld:'vPRDNOMIN',pic:''},{av:'AV14HreFacCon',fld:'vHREFACCON',pic:'ZZZZ9.99999'},{av:'AV16HrePrdUMe',fld:'vHREPRDUME',pic:'9'},{av:'AV15HrePrdCant',fld:'vHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV13HreCanAny',fld:'vHRECANANY',pic:'ZZZZZZ9.999'},{av:'AV33Tinamar',fld:'vTINAMAR',pic:'9',hsh:true},{av:'AV18Prdnum',fld:'vPRDNUM',pic:''},{av:'AV47Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV30Usurcod',fld:'vUSURCOD',pic:'@!'},{av:'AV31Station',fld:'vSTATION',pic:''},{av:'AV38Nveces',fld:'vNVECES',pic:'ZZZ9'},{av:'AV37MsgE',fld:'vMSGE',pic:''},{av:'AV40inc_obs',fld:'vINC_OBS',pic:''},{av:'AV19Prdnom',fld:'vPRDNOM',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_MODIFICAR.CLOSE",",oparms:[{av:'AV25ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV27PrdNomin',fld:'vPRDNOMIN',pic:''},{av:'AV28Prdnumin',fld:'vPRDNUMIN',pic:''},{av:'AV24NewFactor',fld:'vNEWFACTOR',pic:'ZZZZ9.99999'},{av:'AV22Newcantad',fld:'vNEWCANTAD',pic:'ZZZZZZ9.999'},{av:'AV23Newcant',fld:'vNEWCANT',pic:'ZZZZZZ9.999'},{av:'AV12HreRecLin',fld:'vHRERECLIN',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31Station',fld:'vSTATION',pic:''},{av:'AV30Usurcod',fld:'vUSURCOD',pic:'@!'},{av:'AV40inc_obs',fld:'vINC_OBS',pic:''},{av:'AV37MsgE',fld:'vMSGE',pic:''},{av:'AV38Nveces',fld:'vNVECES',pic:'ZZZ9'},{av:'AV18Prdnum',fld:'vPRDNUM',pic:''},{av:'AV16HrePrdUMe',fld:'vHREPRDUME',pic:'9'},{av:'AV17Hreprduds',fld:'vHREPRDUDS',pic:''},{av:'AV42ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e141612',iparms:[{av:'AV42ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:''},{av:'AV19Prdnom',fld:'vPRDNOM',pic:''},{av:'AV18Prdnum',fld:'vPRDNUM',pic:''},{av:'AV17Hreprduds',fld:'vHREPRDUDS',pic:''},{av:'AV16HrePrdUMe',fld:'vHREPRDUME',pic:'9'},{av:'AV15HrePrdCant',fld:'vHREPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV14HreFacCon',fld:'vHREFACCON',pic:'ZZZZ9.99999'},{av:'AV13HreCanAny',fld:'vHRECANANY',pic:'ZZZZZZ9.999'},{av:'AV12HreRecLin',fld:'vHRERECLIN',pic:'ZZZ9'},{av:'AV11HreLinPro',fld:'vHRELINPRO',pic:'Z9'},{av:'AV10HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9'},{av:'AV9HreNumCie',fld:'vHRENUMCIE',pic:'Z9'},{av:'AV8HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV7HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV6HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[{av:'AV42ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:''}]}");
      setEventMetadata("VALIDV_FORPRDUME","{handler:'validv_Forprdume',iparms:[{av:'hV25ForPrdUMe'},{av:'AV25ForPrdUMe',fld:'vFORPRDUME',pic:'9'}]");
      setEventMetadata("VALIDV_FORPRDUME",",oparms:[{av:'AV25ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'hV25ForPrdUMe'}]}");
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
      wcpOAV8HreBarPar = "" ;
      wcpOAV13HreCanAny = DecimalUtil.ZERO ;
      wcpOAV14HreFacCon = DecimalUtil.ZERO ;
      wcpOAV15HrePrdCant = DecimalUtil.ZERO ;
      wcpOAV17Hreprduds = "" ;
      wcpOAV18Prdnum = "" ;
      wcpOAV19Prdnom = "" ;
      Dvelop_confirmpanel_modificar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A13746ForPrdCDsc = "" ;
      hV25ForPrdUMe = "" ;
      AV5EmprCod = "" ;
      AV8HreBarPar = "" ;
      AV13HreCanAny = DecimalUtil.ZERO ;
      AV14HreFacCon = DecimalUtil.ZERO ;
      AV15HrePrdCant = DecimalUtil.ZERO ;
      AV17Hreprduds = "" ;
      AV18Prdnum = "" ;
      AV19Prdnom = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV47Pgmname = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV20Hretotkgm = DecimalUtil.ZERO ;
      AV32UndDsc = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV32UndDsc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV28Prdnumin = "" ;
      AV27PrdNomin = "" ;
      AV30Usurcod = "" ;
      AV31Station = "" ;
      AV37MsgE = "" ;
      AV40inc_obs = "" ;
      AV42ObjetoRefrescar = new GXSimpleCollection<String>(String.class, "internal", "");
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV24NewFactor = DecimalUtil.ZERO ;
      AV23Newcant = DecimalUtil.ZERO ;
      AV22Newcantad = DecimalUtil.ZERO ;
      bttBtnmodificar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucBarradeprogresos = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13746ForPrdCDsc = "" ;
      H01612_A13746ForPrdCDsc = new String[] {""} ;
      H01613_A13746ForPrdCDsc = new String[] {""} ;
      H01613_A396EmprCod = new String[] {""} ;
      H01613_A490ForPrdUMe = new byte[1] ;
      A396EmprCod = "" ;
      H01614_A13746ForPrdCDsc = new String[] {""} ;
      H01614_A396EmprCod = new String[] {""} ;
      H01614_A490ForPrdUMe = new byte[1] ;
      hsh = "" ;
      H01615_A13746ForPrdCDsc = new String[] {""} ;
      H01615_A396EmprCod = new String[] {""} ;
      H01615_A490ForPrdUMe = new byte[1] ;
      H01616_A4495HreNumCie = new byte[1] ;
      H01616_A4494HreBarPar = new String[] {""} ;
      H01616_A4493HreBarReo = new byte[1] ;
      H01616_A4492HreBarCod = new int[1] ;
      H01616_A396EmprCod = new String[] {""} ;
      H01616_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01616_n4542HreTotKgm = new boolean[] {false} ;
      A4494HreBarPar = "" ;
      A4542HreTotKgm = DecimalUtil.ZERO ;
      H01617_A396EmprCod = new String[] {""} ;
      H01617_A4492HreBarCod = new int[1] ;
      H01617_A4493HreBarReo = new byte[1] ;
      H01617_A4494HreBarPar = new String[] {""} ;
      H01617_A4495HreNumCie = new byte[1] ;
      H01617_A4545HreLinMaq = new short[1] ;
      H01617_A4547HreVolPrd = new int[1] ;
      H01617_n4547HreVolPrd = new boolean[] {false} ;
      GXt_char6 = "" ;
      AV41EmprNom = "" ;
      AV36Progress = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV26ForPrdDsc = "" ;
      GXv_int5 = new byte[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int9 = new short[1] ;
      GXv_int10 = new byte[1] ;
      AV29Textoi = "" ;
      AV34Cant = DecimalUtil.ZERO ;
      AV35Oldcant = DecimalUtil.ZERO ;
      GXv_char17 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int16 = new byte[1] ;
      GXv_char15 = new String[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_char7 = new String[1] ;
      GXv_int11 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_char20 = new String[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_modificar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H01618_A13746ForPrdCDsc = new String[] {""} ;
      H01618_A396EmprCod = new String[] {""} ;
      H01618_A490ForPrdUMe = new byte[1] ;
      ZhV25ForPrdUMe = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.detalleproductosmodificar__default(),
         new Object[] {
             new Object[] {
            H01612_A13746ForPrdCDsc
            }
            , new Object[] {
            H01613_A13746ForPrdCDsc, H01613_A396EmprCod, H01613_A490ForPrdUMe
            }
            , new Object[] {
            H01614_A13746ForPrdCDsc, H01614_A396EmprCod, H01614_A490ForPrdUMe
            }
            , new Object[] {
            H01615_A13746ForPrdCDsc, H01615_A396EmprCod, H01615_A490ForPrdUMe
            }
            , new Object[] {
            H01616_A4495HreNumCie, H01616_A4494HreBarPar, H01616_A4493HreBarReo, H01616_A4492HreBarCod, H01616_A396EmprCod, H01616_A4542HreTotKgm, H01616_n4542HreTotKgm
            }
            , new Object[] {
            H01617_A396EmprCod, H01617_A4492HreBarCod, H01617_A4493HreBarReo, H01617_A4494HreBarPar, H01617_A4495HreNumCie, H01617_A4545HreLinMaq, H01617_A4547HreVolPrd, H01617_n4547HreVolPrd
            }
            , new Object[] {
            H01618_A13746ForPrdCDsc, H01618_A396EmprCod, H01618_A490ForPrdUMe
            }
         }
      );
      AV47Pgmname = "DetalleProductosModificar" ;
      /* GeneXus formulas. */
      AV47Pgmname = "DetalleProductosModificar" ;
      Gx_err = (short)(0) ;
      edtavPrdnum_Enabled = 0 ;
      edtavPrdnom_Enabled = 0 ;
      edtavHretotkgm_Enabled = 0 ;
      edtavHrevolprd_Enabled = 0 ;
      edtavHrefaccon_Enabled = 0 ;
      edtavHreprduds_Enabled = 0 ;
      edtavHreprdcant_Enabled = 0 ;
      edtavHrecanany_Enabled = 0 ;
   }

   private byte wcpOAV7HreBarReo ;
   private byte wcpOAV9HreNumCie ;
   private byte wcpOAV11HreLinPro ;
   private byte wcpOAV16HrePrdUMe ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV7HreBarReo ;
   private byte AV9HreNumCie ;
   private byte AV11HreLinPro ;
   private byte AV16HrePrdUMe ;
   private byte gxajaxcallmode ;
   private byte AV33Tinamar ;
   private byte AV25ForPrdUMe ;
   private byte nDonePA ;
   private byte A490ForPrdUMe ;
   private byte GXt_int4 ;
   private byte A4495HreNumCie ;
   private byte A4493HreBarReo ;
   private byte GXv_int5[] ;
   private byte GXv_int8[] ;
   private byte GXv_int10[] ;
   private byte GXv_int16[] ;
   private byte nGXWrapped ;
   private byte ZV25ForPrdUMe ;
   private short wcpOAV10HreLinMaq ;
   private short wcpOAV12HreRecLin ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short AV10HreLinMaq ;
   private short AV12HreRecLin ;
   private short AV38Nveces ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short A4545HreLinMaq ;
   private short GXv_int9[] ;
   private short GXv_int11[] ;
   private int wcpOAV6HreBarCod ;
   private int AV6HreBarCod ;
   private int AV39ValCos ;
   private int AV21HreVolPrd ;
   private int edtavPrdnum_Enabled ;
   private int edtavPrdnom_Enabled ;
   private int edtavHretotkgm_Enabled ;
   private int edtavHrevolprd_Enabled ;
   private int edtavHrefaccon_Enabled ;
   private int edtavHreprduds_Enabled ;
   private int edtavHreprdcant_Enabled ;
   private int edtavHrecanany_Enabled ;
   private int edtavNewfactor_Enabled ;
   private int edtavForprdume_Enabled ;
   private int edtavNewcant_Enabled ;
   private int edtavNewcantad_Enabled ;
   private int gxdynajaxindex ;
   private int A4492HreBarCod ;
   private int A4547HreVolPrd ;
   private int GXv_int3[] ;
   private int idxLst ;
   private int GX_I ;
   private java.math.BigDecimal wcpOAV13HreCanAny ;
   private java.math.BigDecimal wcpOAV14HreFacCon ;
   private java.math.BigDecimal wcpOAV15HrePrdCant ;
   private java.math.BigDecimal AV13HreCanAny ;
   private java.math.BigDecimal AV14HreFacCon ;
   private java.math.BigDecimal AV15HrePrdCant ;
   private java.math.BigDecimal AV20Hretotkgm ;
   private java.math.BigDecimal AV24NewFactor ;
   private java.math.BigDecimal AV23Newcant ;
   private java.math.BigDecimal AV22Newcantad ;
   private java.math.BigDecimal A4542HreTotKgm ;
   private java.math.BigDecimal AV34Cant ;
   private java.math.BigDecimal AV35Oldcant ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV8HreBarPar ;
   private String wcpOAV17Hreprduds ;
   private String wcpOAV18Prdnum ;
   private String wcpOAV19Prdnom ;
   private String Dvelop_confirmpanel_modificar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV5EmprCod ;
   private String AV8HreBarPar ;
   private String AV17Hreprduds ;
   private String AV18Prdnum ;
   private String AV19Prdnom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV47Pgmname ;
   private String GXKey ;
   private String AV32UndDsc[] ;
   private String AV28Prdnumin ;
   private String AV27PrdNomin ;
   private String AV30Usurcod ;
   private String AV31Station ;
   private String AV37MsgE ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvelop_confirmpanel_modificar_Title ;
   private String Dvelop_confirmpanel_modificar_Confirmationtext ;
   private String Dvelop_confirmpanel_modificar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_modificar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_modificar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_modificar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_modificar_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavPrdnum_Internalname ;
   private String edtavPrdnum_Jsonclick ;
   private String edtavPrdnom_Internalname ;
   private String edtavPrdnom_Jsonclick ;
   private String edtavHretotkgm_Internalname ;
   private String TempTags ;
   private String edtavHretotkgm_Jsonclick ;
   private String edtavHrevolprd_Internalname ;
   private String edtavHrevolprd_Jsonclick ;
   private String grpUnnamedgroup3_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavHrefaccon_Internalname ;
   private String edtavHrefaccon_Jsonclick ;
   private String edtavHreprduds_Internalname ;
   private String edtavHreprduds_Jsonclick ;
   private String edtavHreprdcant_Internalname ;
   private String edtavHreprdcant_Jsonclick ;
   private String edtavHrecanany_Internalname ;
   private String edtavHrecanany_Jsonclick ;
   private String grpUnnamedgroup5_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavNewfactor_Internalname ;
   private String edtavNewfactor_Jsonclick ;
   private String edtavForprdume_Internalname ;
   private String edtavForprdume_Jsonclick ;
   private String edtavNewcant_Internalname ;
   private String edtavNewcant_Jsonclick ;
   private String edtavNewcantad_Internalname ;
   private String edtavNewcantad_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String bttBtnmodificar_Internalname ;
   private String bttBtnmodificar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Barradeprogresos_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String hsh ;
   private String A4494HreBarPar ;
   private String GXt_char6 ;
   private String AV41EmprNom ;
   private String AV26ForPrdDsc ;
   private String GXv_char17[] ;
   private String GXv_char15[] ;
   private String GXv_char7[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char18[] ;
   private String GXv_char19[] ;
   private String GXv_char20[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_modificar_Internalname ;
   private String Dvelop_confirmpanel_modificar_Internalname ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n4542HreTotKgm ;
   private boolean n4547HreVolPrd ;
   private String A13746ForPrdCDsc ;
   private String hV25ForPrdUMe ;
   private String AV40inc_obs ;
   private String l13746ForPrdCDsc ;
   private String AV29Textoi ;
   private String ZhV25ForPrdUMe ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogresos ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_modificar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H01612_A13746ForPrdCDsc ;
   private String[] H01613_A13746ForPrdCDsc ;
   private String[] H01613_A396EmprCod ;
   private byte[] H01613_A490ForPrdUMe ;
   private String[] H01614_A13746ForPrdCDsc ;
   private String[] H01614_A396EmprCod ;
   private byte[] H01614_A490ForPrdUMe ;
   private String[] H01615_A13746ForPrdCDsc ;
   private String[] H01615_A396EmprCod ;
   private byte[] H01615_A490ForPrdUMe ;
   private byte[] H01616_A4495HreNumCie ;
   private String[] H01616_A4494HreBarPar ;
   private byte[] H01616_A4493HreBarReo ;
   private int[] H01616_A4492HreBarCod ;
   private String[] H01616_A396EmprCod ;
   private java.math.BigDecimal[] H01616_A4542HreTotKgm ;
   private boolean[] H01616_n4542HreTotKgm ;
   private String[] H01617_A396EmprCod ;
   private int[] H01617_A4492HreBarCod ;
   private byte[] H01617_A4493HreBarReo ;
   private String[] H01617_A4494HreBarPar ;
   private byte[] H01617_A4495HreNumCie ;
   private short[] H01617_A4545HreLinMaq ;
   private int[] H01617_A4547HreVolPrd ;
   private boolean[] H01617_n4547HreVolPrd ;
   private String[] H01618_A13746ForPrdCDsc ;
   private String[] H01618_A396EmprCod ;
   private byte[] H01618_A490ForPrdUMe ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV42ObjetoRefrescar ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV36Progress ;
}

final  class detalleproductosmodificar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01612", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc FROM TXPUNMEPR WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, '')))) like '%' || UPPER(?) ORDER BY ForPrdCDsc) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01613", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01614", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01615", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE ForPrdUMe = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01616", "SELECT HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreTotKgm FROM TXPHISREH WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01617", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreVolPrd FROM TXPHISREM WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01618", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
      }
   }

}

