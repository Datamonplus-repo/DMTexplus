package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class particionhdrs3_impl extends GXDataArea
{
   public particionhdrs3_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public particionhdrs3_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( particionhdrs3_impl.class ));
   }

   public particionhdrs3_impl( int remoteHandle ,
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
            AV18EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV19BarOriCod = (int)(GXutil.lval( httpContext.GetPar( "BarOriCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarOriCod), 8, 0));
               AV20BarOriReo = (byte)(GXutil.lval( httpContext.GetPar( "BarOriReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20BarOriReo", GXutil.str( AV20BarOriReo, 1, 0));
               AV21BarOriPar = httpContext.GetPar( "BarOriPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21BarOriPar", AV21BarOriPar);
               AV15BarCodDes = (int)(GXutil.lval( httpContext.GetPar( "BarCodDes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarCodDes), 8, 0));
               AV16BarReoDes = (byte)(GXutil.lval( httpContext.GetPar( "BarReoDes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16BarReoDes", GXutil.str( AV16BarReoDes, 1, 0));
               AV17BarParDes = httpContext.GetPar( "BarParDes") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17BarParDes", AV17BarParDes);
               AV5Conos2 = (short)(GXutil.lval( httpContext.GetPar( "Conos2"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5Conos2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Conos2), 4, 0));
               AV6Kilos2 = CommonUtil.decimalVal( httpContext.GetPar( "Kilos2"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6Kilos2", GXutil.ltrimstr( AV6Kilos2, 9, 2));
               AV7Metros2 = CommonUtil.decimalVal( httpContext.GetPar( "Metros2"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Metros2", GXutil.ltrimstr( AV7Metros2, 9, 2));
               AV14Barpes = (short)(GXutil.lval( httpContext.GetPar( "Barpes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Barpes), 4, 0));
               AV8OK = httpContext.GetPar( "OK") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8OK", AV8OK);
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
      pa15F2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start15F2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.particionhdrs3", new String[] {GXutil.URLEncode(GXutil.rtrim(AV18EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarOriCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarOriReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV21BarOriPar)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCodDes,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV16BarReoDes,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17BarParDes)),GXutil.URLEncode(GXutil.ltrimstr(AV5Conos2,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV6Kilos2)),GXutil.URLEncode(DecimalUtil.decToString(AV7Metros2)),GXutil.URLEncode(GXutil.ltrimstr(AV14Barpes,4,0)),GXutil.URLEncode(GXutil.rtrim(AV8OK))}, new String[] {"EmprCod","BarOriCod","BarOriReo","BarOriPar","BarCodDes","BarReoDes","BarParDes","Conos2","Kilos2","Metros2","Barpes","OK"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13msg1, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODDES", GXutil.ltrim( localUtil.ntoc( AV15BarCodDes, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARREODES", GXutil.ltrim( localUtil.ntoc( AV16BarReoDes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPARDES", GXutil.rtrim( AV17BarParDes));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG1", GXutil.rtrim( AV13msg1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13msg1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPES", GXutil.ltrim( localUtil.ntoc( AV14Barpes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV18EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORICOD", GXutil.ltrim( localUtil.ntoc( AV19BarOriCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORIREO", GXutil.ltrim( localUtil.ntoc( AV20BarOriReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORIPAR", GXutil.rtrim( AV21BarOriPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSANYORI", GXutil.ltrim( localUtil.ntoc( AV26CosAnyOri, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSPRDORI", GXutil.ltrim( localUtil.ntoc( AV27CosPrdOri, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.rtrim( AV8OK));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETROS2", GXutil.ltrim( localUtil.ntoc( AV7Metros2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILOS2", GXutil.ltrim( localUtil.ntoc( AV6Kilos2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONOS2", GXutil.ltrim( localUtil.ntoc( AV5Conos2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         we15F2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt15F2( ) ;
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
      return formatLink("app.particionhdrs3", new String[] {GXutil.URLEncode(GXutil.rtrim(AV18EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarOriCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarOriReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV21BarOriPar)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCodDes,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV16BarReoDes,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17BarParDes)),GXutil.URLEncode(GXutil.ltrimstr(AV5Conos2,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV6Kilos2)),GXutil.URLEncode(DecimalUtil.decToString(AV7Metros2)),GXutil.URLEncode(GXutil.ltrimstr(AV14Barpes,4,0)),GXutil.URLEncode(GXutil.rtrim(AV8OK))}, new String[] {"EmprCod","BarOriCod","BarOriReo","BarOriPar","BarCodDes","BarReoDes","BarParDes","Conos2","Kilos2","Metros2","Barpes","OK"})  ;
   }

   public String getPgmname( )
   {
      return "ParticionHdrs3" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Particion Hdrs (NO se utiliza)", "") ;
   }

   public void wb15F0( )
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
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup4_Internalname, httpContext.getMessage( "Origen", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_ParticionHdrs3.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotpieori_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotpieori_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotpieori_Internalname, GXutil.ltrim( localUtil.ntoc( AV23TotPieOri, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotpieori_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV23TotPieOri), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV23TotPieOri), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotpieori_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotpieori_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ParticionHdrs3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotkgmori_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotkgmori_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotkgmori_Internalname, GXutil.ltrim( localUtil.ntoc( AV24TotKgmOri, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotkgmori_Enabled!=0) ? localUtil.format( AV24TotKgmOri, "ZZZZZ9.99") : localUtil.format( AV24TotKgmOri, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotkgmori_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotkgmori_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ParticionHdrs3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotmetori_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotmetori_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotmetori_Internalname, GXutil.ltrim( localUtil.ntoc( AV25TotMetOri, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotmetori_Enabled!=0) ? localUtil.format( AV25TotMetOri, "ZZZZZ9.99") : localUtil.format( AV25TotMetOri, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotmetori_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotmetori_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ParticionHdrs3.htm");
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
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup6_Internalname, httpContext.getMessage( "Destino", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_ParticionHdrs3.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavConos_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavConos_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavConos_Internalname, GXutil.ltrim( localUtil.ntoc( AV9Conos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavConos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9Conos), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9Conos), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavConos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavConos_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ParticionHdrs3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavKilos_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavKilos_Internalname, httpContext.getMessage( "Kilos Dispuestos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavKilos_Internalname, GXutil.ltrim( localUtil.ntoc( AV10Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavKilos_Enabled!=0) ? localUtil.format( AV10Kilos, "ZZZZZ9.99") : localUtil.format( AV10Kilos, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavKilos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavKilos_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ParticionHdrs3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetros_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetros_Internalname, httpContext.getMessage( "Metros Dispuestos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetros_Internalname, GXutil.ltrim( localUtil.ntoc( AV11Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetros_Enabled!=0) ? localUtil.format( AV11Metros, "ZZZZZ9.99") : localUtil.format( AV11Metros, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetros_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetros_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ParticionHdrs3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1115f1_client"+"'", TempTags, "", 2, "HLP_ParticionHdrs3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsalir_Internalname, "", httpContext.getMessage( "Salir", ""), bttBtnsalir_Jsonclick, 5, httpContext.getMessage( "Salir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSALIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ParticionHdrs3.htm");
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
         wb_table1_67_15F2( true) ;
      }
      else
      {
         wb_table1_67_15F2( false) ;
      }
      return  ;
   }

   public void wb_table1_67_15F2e( boolean wbgen )
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

   public void start15F2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Particion Hdrs (NO se utiliza)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup15F0( ) ;
   }

   public void ws15F2( )
   {
      start15F2( ) ;
      evt15F2( ) ;
   }

   public void evt15F2( )
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
                           e1215F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1315F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSALIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSalir' */
                           e1415F2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1515F2 ();
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

   public void we15F2( )
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

   public void pa15F2( )
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
            GX_FocusControl = edtavTotpieori_Internalname ;
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
      rf15F2( ) ;
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
      edtavTotpieori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotpieori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotpieori_Enabled), 5, 0), true);
      edtavTotkgmori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotkgmori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotkgmori_Enabled), 5, 0), true);
      edtavTotmetori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotmetori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotmetori_Enabled), 5, 0), true);
   }

   public void rf15F2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1515F2 ();
         wb15F0( ) ;
      }
   }

   public void send_integrity_lvl_hashes15F2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG1", GXutil.rtrim( AV13msg1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13msg1, ""))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavTotpieori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotpieori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotpieori_Enabled), 5, 0), true);
      edtavTotkgmori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotkgmori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotkgmori_Enabled), 5, 0), true);
      edtavTotmetori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotmetori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotmetori_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup15F0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1315F2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV17BarParDes = httpContext.cgiGet( "vBARPARDES") ;
         AV16BarReoDes = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARREODES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV15BarCodDes = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCODDES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTotpieori_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTotpieori_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTPIEORI");
            GX_FocusControl = edtavTotpieori_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23TotPieOri = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TotPieOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TotPieOri), 6, 0));
         }
         else
         {
            AV23TotPieOri = (int)(localUtil.ctol( httpContext.cgiGet( edtavTotpieori_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TotPieOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TotPieOri), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotkgmori_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotkgmori_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTKGMORI");
            GX_FocusControl = edtavTotkgmori_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24TotKgmOri = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TotKgmOri", GXutil.ltrimstr( AV24TotKgmOri, 9, 2));
         }
         else
         {
            AV24TotKgmOri = localUtil.ctond( httpContext.cgiGet( edtavTotkgmori_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TotKgmOri", GXutil.ltrimstr( AV24TotKgmOri, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotmetori_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotmetori_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTMETORI");
            GX_FocusControl = edtavTotmetori_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV25TotMetOri = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TotMetOri", GXutil.ltrimstr( AV25TotMetOri, 9, 2));
         }
         else
         {
            AV25TotMetOri = localUtil.ctond( httpContext.cgiGet( edtavTotmetori_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TotMetOri", GXutil.ltrimstr( AV25TotMetOri, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavConos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavConos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCONOS");
            GX_FocusControl = edtavConos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9Conos = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9Conos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Conos), 4, 0));
         }
         else
         {
            AV9Conos = (short)(localUtil.ctol( httpContext.cgiGet( edtavConos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9Conos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Conos), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKILOS");
            GX_FocusControl = edtavKilos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10Kilos = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Kilos", GXutil.ltrimstr( AV10Kilos, 9, 2));
         }
         else
         {
            AV10Kilos = localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Kilos", GXutil.ltrimstr( AV10Kilos, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETROS");
            GX_FocusControl = edtavMetros_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11Metros = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Metros", GXutil.ltrimstr( AV11Metros, 9, 2));
         }
         else
         {
            AV11Metros = localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Metros", GXutil.ltrimstr( AV11Metros, 9, 2));
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
      e1315F2 ();
      if (returnInSub) return;
   }

   public void e1315F2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12msg0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG219_", ""), (byte)(99), GXv_char2) ;
      particionhdrs3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12msg0 = GXt_char1 ;
      GXt_char1 = AV13msg1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG220_", ""), (byte)(99), GXv_char2) ;
      particionhdrs3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13msg1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13msg1", AV13msg1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13msg1, ""))));
      AV8OK = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8OK", AV8OK);
      /* Using cursor H015F3 */
      pr_default.execute(0, new Object[] {AV18EmprCod, Integer.valueOf(AV19BarOriCod), Byte.valueOf(AV20BarOriReo), AV21BarOriPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = H015F3_A130BarCodPar[0] ;
         A132BarCodReo = H015F3_A132BarCodReo[0] ;
         A129BarCod = H015F3_A129BarCod[0] ;
         A396EmprCod = H015F3_A396EmprCod[0] ;
         A213BarSit = H015F3_A213BarSit[0] ;
         A140BarCosAny = H015F3_A140BarCosAny[0] ;
         A141BarCosPro = H015F3_A141BarCosPro[0] ;
         A898BarPieNDes = H015F3_A898BarPieNDes[0] ;
         A166BarKgm = H015F3_A166BarKgm[0] ;
         A184BarMtr = H015F3_A184BarMtr[0] ;
         A898BarPieNDes = H015F3_A898BarPieNDes[0] ;
         A166BarKgm = H015F3_A166BarKgm[0] ;
         A184BarMtr = H015F3_A184BarMtr[0] ;
         AV22BarSitOri = A213BarSit ;
         AV23TotPieOri = A898BarPieNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23TotPieOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TotPieOri), 6, 0));
         AV24TotKgmOri = A166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24TotKgmOri", GXutil.ltrimstr( AV24TotKgmOri, 9, 2));
         AV25TotMetOri = A184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25TotMetOri", GXutil.ltrimstr( AV25TotMetOri, 9, 2));
         AV26CosAnyOri = A140BarCosAny ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26CosAnyOri", GXutil.ltrimstr( AV26CosAnyOri, 10, 2));
         AV27CosPrdOri = A141BarCosPro ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27CosPrdOri", GXutil.ltrimstr( AV27CosPrdOri, 10, 2));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXt_char1 = AV32Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      particionhdrs3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Station = GXt_char1 ;
      GXv_char2[0] = AV18EmprCod ;
      GXv_char3[0] = AV33Emprnom ;
      GXv_char4[0] = AV34Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV32Station, GXv_char2, GXv_char3, GXv_char4) ;
      particionhdrs3_impl.this.AV18EmprCod = GXv_char2[0] ;
      particionhdrs3_impl.this.AV33Emprnom = GXv_char3[0] ;
      particionhdrs3_impl.this.AV34Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
   }

   public void e1215F2( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( 0 == 1 )
      {
         if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
         {
            /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
            S112 ();
            if (returnInSub) return;
         }
      }
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         if ( ( AV9Conos > AV23TotPieOri ) || ( DecimalUtil.compareTo(AV10Kilos, AV24TotKgmOri) > 0 ) || ( DecimalUtil.compareTo(AV11Metros, AV25TotMetOri) > 0 ) )
         {
            httpContext.GX_msglist.addItem(AV13msg1);
         }
         else
         {
            /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
            S112 ();
            if (returnInSub) return;
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1415F2( )
   {
      /* 'DoSalir' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV18EmprCod,Integer.valueOf(AV19BarOriCod),Byte.valueOf(AV20BarOriReo),AV21BarOriPar,Integer.valueOf(AV15BarCodDes),Byte.valueOf(AV16BarReoDes),AV17BarParDes,Short.valueOf(AV5Conos2),AV6Kilos2,AV7Metros2,Short.valueOf(AV14Barpes),AV8OK});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV18EmprCod","AV19BarOriCod","AV20BarOriReo","AV21BarOriPar","AV15BarCodDes","AV16BarReoDes","AV17BarParDes","AV5Conos2","AV6Kilos2","AV7Metros2","AV14Barpes","AV8OK"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV8OK = httpContext.getMessage( "S", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8OK", AV8OK);
      AV5Conos2 = AV9Conos ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Conos2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Conos2), 4, 0));
      AV6Kilos2 = AV10Kilos ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Kilos2", GXutil.ltrimstr( AV6Kilos2, 9, 2));
      AV6Kilos2 = ((AV10Kilos.doubleValue()==0) ? (AV11Metros.multiply(DecimalUtil.doubleToDec(AV14Barpes))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) : AV6Kilos2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Kilos2", GXutil.ltrimstr( AV6Kilos2, 9, 2));
      AV7Metros2 = AV11Metros ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Metros2", GXutil.ltrimstr( AV7Metros2, 9, 2));
      GXv_char4[0] = AV18EmprCod ;
      GXv_int5[0] = AV19BarOriCod ;
      GXv_int6[0] = AV20BarOriReo ;
      GXv_char3[0] = AV21BarOriPar ;
      GXv_int7[0] = AV15BarCodDes ;
      GXv_int8[0] = AV16BarReoDes ;
      GXv_char2[0] = AV17BarParDes ;
      new app.pcrebar(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_int7, GXv_int8, GXv_char2) ;
      particionhdrs3_impl.this.AV18EmprCod = GXv_char4[0] ;
      particionhdrs3_impl.this.AV19BarOriCod = GXv_int5[0] ;
      particionhdrs3_impl.this.AV20BarOriReo = GXv_int6[0] ;
      particionhdrs3_impl.this.AV21BarOriPar = GXv_char3[0] ;
      particionhdrs3_impl.this.AV15BarCodDes = GXv_int7[0] ;
      particionhdrs3_impl.this.AV16BarReoDes = GXv_int8[0] ;
      particionhdrs3_impl.this.AV17BarParDes = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarOriCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV20BarOriReo", GXutil.str( AV20BarOriReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV21BarOriPar", AV21BarOriPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarCodDes), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarReoDes", GXutil.str( AV16BarReoDes, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarParDes", AV17BarParDes);
      GXv_char4[0] = AV18EmprCod ;
      GXv_int7[0] = AV19BarOriCod ;
      GXv_int8[0] = AV20BarOriReo ;
      GXv_char3[0] = AV21BarOriPar ;
      GXv_int5[0] = AV15BarCodDes ;
      GXv_int6[0] = AV16BarReoDes ;
      GXv_char2[0] = AV17BarParDes ;
      GXv_int9[0] = AV5Conos2 ;
      GXv_decimal10[0] = AV6Kilos2 ;
      GXv_decimal11[0] = AV7Metros2 ;
      new app.preopeh(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_char3, GXv_int5, GXv_int6, GXv_char2, GXv_int9, GXv_decimal10, GXv_decimal11) ;
      particionhdrs3_impl.this.AV18EmprCod = GXv_char4[0] ;
      particionhdrs3_impl.this.AV19BarOriCod = GXv_int7[0] ;
      particionhdrs3_impl.this.AV20BarOriReo = GXv_int8[0] ;
      particionhdrs3_impl.this.AV21BarOriPar = GXv_char3[0] ;
      particionhdrs3_impl.this.AV15BarCodDes = GXv_int5[0] ;
      particionhdrs3_impl.this.AV16BarReoDes = GXv_int6[0] ;
      particionhdrs3_impl.this.AV17BarParDes = GXv_char2[0] ;
      particionhdrs3_impl.this.AV5Conos2 = (short)((short)(GXv_int9[0])) ;
      particionhdrs3_impl.this.AV6Kilos2 = GXv_decimal10[0] ;
      particionhdrs3_impl.this.AV7Metros2 = GXv_decimal11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarOriCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV20BarOriReo", GXutil.str( AV20BarOriReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV21BarOriPar", AV21BarOriPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarCodDes), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarReoDes", GXutil.str( AV16BarReoDes, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarParDes", AV17BarParDes);
      httpContext.ajax_rsp_assign_attri("", false, "AV5Conos2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Conos2), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6Kilos2", GXutil.ltrimstr( AV6Kilos2, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV7Metros2", GXutil.ltrimstr( AV7Metros2, 9, 2));
      AV28Signo = (short)(1) ;
      GXv_char4[0] = AV18EmprCod ;
      GXv_int9[0] = AV15BarCodDes ;
      GXv_int8[0] = AV16BarReoDes ;
      GXv_char3[0] = AV17BarParDes ;
      GXv_int12[0] = AV5Conos2 ;
      GXv_decimal11[0] = AV6Kilos2 ;
      GXv_decimal10[0] = AV7Metros2 ;
      GXv_int13[0] = (short)(AV23TotPieOri) ;
      GXv_decimal14[0] = AV24TotKgmOri ;
      GXv_decimal15[0] = AV25TotMetOri ;
      GXv_decimal16[0] = AV26CosAnyOri ;
      GXv_decimal17[0] = AV27CosPrdOri ;
      GXv_int6[0] = (byte)(AV28Signo) ;
      new app.pacparth(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int8, GXv_char3, GXv_int12, GXv_decimal11, GXv_decimal10, GXv_int13, GXv_decimal14, GXv_decimal15, GXv_decimal16, GXv_decimal17, GXv_int6) ;
      particionhdrs3_impl.this.AV18EmprCod = GXv_char4[0] ;
      particionhdrs3_impl.this.AV15BarCodDes = GXv_int9[0] ;
      particionhdrs3_impl.this.AV16BarReoDes = GXv_int8[0] ;
      particionhdrs3_impl.this.AV17BarParDes = GXv_char3[0] ;
      particionhdrs3_impl.this.AV5Conos2 = GXv_int12[0] ;
      particionhdrs3_impl.this.AV6Kilos2 = GXv_decimal11[0] ;
      particionhdrs3_impl.this.AV7Metros2 = GXv_decimal10[0] ;
      particionhdrs3_impl.this.AV23TotPieOri = GXv_int13[0] ;
      particionhdrs3_impl.this.AV24TotKgmOri = GXv_decimal14[0] ;
      particionhdrs3_impl.this.AV25TotMetOri = GXv_decimal15[0] ;
      particionhdrs3_impl.this.AV26CosAnyOri = GXv_decimal16[0] ;
      particionhdrs3_impl.this.AV27CosPrdOri = GXv_decimal17[0] ;
      particionhdrs3_impl.this.AV28Signo = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarCodDes), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarReoDes", GXutil.str( AV16BarReoDes, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarParDes", AV17BarParDes);
      httpContext.ajax_rsp_assign_attri("", false, "AV5Conos2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Conos2), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6Kilos2", GXutil.ltrimstr( AV6Kilos2, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV7Metros2", GXutil.ltrimstr( AV7Metros2, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV23TotPieOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TotPieOri), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV24TotKgmOri", GXutil.ltrimstr( AV24TotKgmOri, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV25TotMetOri", GXutil.ltrimstr( AV25TotMetOri, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV26CosAnyOri", GXutil.ltrimstr( AV26CosAnyOri, 10, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV27CosPrdOri", GXutil.ltrimstr( AV27CosPrdOri, 10, 2));
   }

   protected void nextLoad( )
   {
   }

   protected void e1515F2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_67_15F2( boolean wbgen )
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
         wb_table1_67_15F2e( true) ;
      }
      else
      {
         wb_table1_67_15F2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV18EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      AV19BarOriCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarOriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarOriCod), 8, 0));
      AV20BarOriReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20BarOriReo", GXutil.str( AV20BarOriReo, 1, 0));
      AV21BarOriPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21BarOriPar", AV21BarOriPar);
      AV15BarCodDes = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarCodDes), 8, 0));
      AV16BarReoDes = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarReoDes", GXutil.str( AV16BarReoDes, 1, 0));
      AV17BarParDes = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarParDes", AV17BarParDes);
      AV5Conos2 = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Conos2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Conos2), 4, 0));
      AV6Kilos2 = (java.math.BigDecimal)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Kilos2", GXutil.ltrimstr( AV6Kilos2, 9, 2));
      AV7Metros2 = (java.math.BigDecimal)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Metros2", GXutil.ltrimstr( AV7Metros2, 9, 2));
      AV14Barpes = ((Number) GXutil.testNumericType( getParm(obj,10), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Barpes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Barpes), 4, 0));
      AV8OK = (String)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8OK", AV8OK);
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
      pa15F2( ) ;
      ws15F2( ) ;
      we15F2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202671011121698", true, true);
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
      httpContext.AddJavascriptSource("particionhdrs3.js", "?202671011121698", false, true);
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
      edtavTotpieori_Internalname = "vTOTPIEORI" ;
      edtavTotkgmori_Internalname = "vTOTKGMORI" ;
      edtavTotmetori_Internalname = "vTOTMETORI" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      grpUnnamedgroup4_Internalname = "UNNAMEDGROUP4" ;
      edtavConos_Internalname = "vCONOS" ;
      edtavKilos_Internalname = "vKILOS" ;
      edtavMetros_Internalname = "vMETROS" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      grpUnnamedgroup6_Internalname = "UNNAMEDGROUP6" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtnsalir_Internalname = "BTNSALIR" ;
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
      edtavMetros_Jsonclick = "" ;
      edtavMetros_Enabled = 1 ;
      edtavKilos_Jsonclick = "" ;
      edtavKilos_Enabled = 1 ;
      edtavConos_Jsonclick = "" ;
      edtavConos_Enabled = 1 ;
      edtavTotmetori_Jsonclick = "" ;
      edtavTotmetori_Enabled = 1 ;
      edtavTotkgmori_Jsonclick = "" ;
      edtavTotkgmori_Enabled = 1 ;
      edtavTotpieori_Jsonclick = "" ;
      edtavTotpieori_Enabled = 1 ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Deseas crear la nueva N Hdr?" ;
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
      Form.setCaption( httpContext.getMessage( "Particion Hdrs (NO se utiliza)", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV13msg1',fld:'vMSG1',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1115F1',iparms:[{av:'AV15BarCodDes',fld:'vBARCODDES',pic:'ZZZZZZZ9'},{av:'AV16BarReoDes',fld:'vBARREODES',pic:'9'},{av:'AV17BarParDes',fld:'vBARPARDES',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'Dvelop_confirmpanel_confirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e1215F2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV9Conos',fld:'vCONOS',pic:'ZZZ9'},{av:'AV23TotPieOri',fld:'vTOTPIEORI',pic:'ZZZZZ9'},{av:'AV10Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV24TotKgmOri',fld:'vTOTKGMORI',pic:'ZZZZZ9.99'},{av:'AV11Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV25TotMetOri',fld:'vTOTMETORI',pic:'ZZZZZ9.99'},{av:'AV13msg1',fld:'vMSG1',pic:'',hsh:true},{av:'AV14Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV20BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV21BarOriPar',fld:'vBARORIPAR',pic:''},{av:'AV15BarCodDes',fld:'vBARCODDES',pic:'ZZZZZZZ9'},{av:'AV16BarReoDes',fld:'vBARREODES',pic:'9'},{av:'AV17BarParDes',fld:'vBARPARDES',pic:''},{av:'AV26CosAnyOri',fld:'vCOSANYORI',pic:'ZZZZZZ9.99'},{av:'AV27CosPrdOri',fld:'vCOSPRDORI',pic:'ZZZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV8OK',fld:'vOK',pic:''},{av:'AV5Conos2',fld:'vCONOS2',pic:'ZZZ9'},{av:'AV6Kilos2',fld:'vKILOS2',pic:'ZZZZZ9.99'},{av:'AV7Metros2',fld:'vMETROS2',pic:'ZZZZZ9.99'},{av:'AV17BarParDes',fld:'vBARPARDES',pic:''},{av:'AV16BarReoDes',fld:'vBARREODES',pic:'9'},{av:'AV15BarCodDes',fld:'vBARCODDES',pic:'ZZZZZZZ9'},{av:'AV21BarOriPar',fld:'vBARORIPAR',pic:''},{av:'AV20BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV19BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV27CosPrdOri',fld:'vCOSPRDORI',pic:'ZZZZZZ9.99'},{av:'AV26CosAnyOri',fld:'vCOSANYORI',pic:'ZZZZZZ9.99'},{av:'AV25TotMetOri',fld:'vTOTMETORI',pic:'ZZZZZ9.99'},{av:'AV24TotKgmOri',fld:'vTOTKGMORI',pic:'ZZZZZ9.99'},{av:'AV23TotPieOri',fld:'vTOTPIEORI',pic:'ZZZZZ9'}]}");
      setEventMetadata("'DOSALIR'","{handler:'e1415F2',iparms:[{av:'AV8OK',fld:'vOK',pic:''},{av:'AV14Barpes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV7Metros2',fld:'vMETROS2',pic:'ZZZZZ9.99'},{av:'AV6Kilos2',fld:'vKILOS2',pic:'ZZZZZ9.99'},{av:'AV5Conos2',fld:'vCONOS2',pic:'ZZZ9'},{av:'AV17BarParDes',fld:'vBARPARDES',pic:''},{av:'AV16BarReoDes',fld:'vBARREODES',pic:'9'},{av:'AV15BarCodDes',fld:'vBARCODDES',pic:'ZZZZZZZ9'},{av:'AV21BarOriPar',fld:'vBARORIPAR',pic:''},{av:'AV20BarOriReo',fld:'vBARORIREO',pic:'9'},{av:'AV19BarOriCod',fld:'vBARORICOD',pic:'ZZZZZZZ9'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOSALIR'",",oparms:[]}");
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
      wcpOAV18EmprCod = "" ;
      wcpOAV21BarOriPar = "" ;
      wcpOAV17BarParDes = "" ;
      wcpOAV6Kilos2 = DecimalUtil.ZERO ;
      wcpOAV7Metros2 = DecimalUtil.ZERO ;
      wcpOAV8OK = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV18EmprCod = "" ;
      AV21BarOriPar = "" ;
      AV17BarParDes = "" ;
      AV6Kilos2 = DecimalUtil.ZERO ;
      AV7Metros2 = DecimalUtil.ZERO ;
      AV8OK = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV13msg1 = "" ;
      GXKey = "" ;
      AV26CosAnyOri = DecimalUtil.ZERO ;
      AV27CosPrdOri = DecimalUtil.ZERO ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV24TotKgmOri = DecimalUtil.ZERO ;
      AV25TotMetOri = DecimalUtil.ZERO ;
      AV10Kilos = DecimalUtil.ZERO ;
      AV11Metros = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnsalir_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV12msg0 = "" ;
      scmdbuf = "" ;
      H015F3_A130BarCodPar = new String[] {""} ;
      H015F3_A132BarCodReo = new byte[1] ;
      H015F3_A129BarCod = new int[1] ;
      H015F3_A396EmprCod = new String[] {""} ;
      H015F3_A213BarSit = new byte[1] ;
      H015F3_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015F3_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015F3_A898BarPieNDes = new int[1] ;
      H015F3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015F3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV32Station = "" ;
      GXt_char1 = "" ;
      AV33Emprnom = "" ;
      AV34Usurcod = "" ;
      GXv_int7 = new int[1] ;
      GXv_int5 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int12 = new short[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int13 = new short[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_int6 = new byte[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.particionhdrs3__default(),
         new Object[] {
             new Object[] {
            H015F3_A130BarCodPar, H015F3_A132BarCodReo, H015F3_A129BarCod, H015F3_A396EmprCod, H015F3_A213BarSit, H015F3_A140BarCosAny, H015F3_A141BarCosPro, H015F3_A898BarPieNDes, H015F3_A166BarKgm, H015F3_A184BarMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavTotpieori_Enabled = 0 ;
      edtavTotkgmori_Enabled = 0 ;
      edtavTotmetori_Enabled = 0 ;
   }

   private byte wcpOAV20BarOriReo ;
   private byte wcpOAV16BarReoDes ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV20BarOriReo ;
   private byte AV16BarReoDes ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV22BarSitOri ;
   private byte GXv_int8[] ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private short wcpOAV5Conos2 ;
   private short wcpOAV14Barpes ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV5Conos2 ;
   private short AV14Barpes ;
   private short wbEnd ;
   private short wbStart ;
   private short AV9Conos ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV28Signo ;
   private short GXv_int12[] ;
   private short GXv_int13[] ;
   private int wcpOAV19BarOriCod ;
   private int wcpOAV15BarCodDes ;
   private int AV19BarOriCod ;
   private int AV15BarCodDes ;
   private int AV23TotPieOri ;
   private int edtavTotpieori_Enabled ;
   private int edtavTotkgmori_Enabled ;
   private int edtavTotmetori_Enabled ;
   private int edtavConos_Enabled ;
   private int edtavKilos_Enabled ;
   private int edtavMetros_Enabled ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int GXv_int7[] ;
   private int GXv_int5[] ;
   private int GXv_int9[] ;
   private int idxLst ;
   private java.math.BigDecimal wcpOAV6Kilos2 ;
   private java.math.BigDecimal wcpOAV7Metros2 ;
   private java.math.BigDecimal AV6Kilos2 ;
   private java.math.BigDecimal AV7Metros2 ;
   private java.math.BigDecimal AV26CosAnyOri ;
   private java.math.BigDecimal AV27CosPrdOri ;
   private java.math.BigDecimal AV24TotKgmOri ;
   private java.math.BigDecimal AV25TotMetOri ;
   private java.math.BigDecimal AV10Kilos ;
   private java.math.BigDecimal AV11Metros ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private String wcpOAV18EmprCod ;
   private String wcpOAV21BarOriPar ;
   private String wcpOAV17BarParDes ;
   private String wcpOAV8OK ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV18EmprCod ;
   private String AV21BarOriPar ;
   private String AV17BarParDes ;
   private String AV8OK ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV13msg1 ;
   private String GXKey ;
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
   private String grpUnnamedgroup4_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavTotpieori_Internalname ;
   private String TempTags ;
   private String edtavTotpieori_Jsonclick ;
   private String edtavTotkgmori_Internalname ;
   private String edtavTotkgmori_Jsonclick ;
   private String edtavTotmetori_Internalname ;
   private String edtavTotmetori_Jsonclick ;
   private String grpUnnamedgroup6_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavConos_Internalname ;
   private String edtavConos_Jsonclick ;
   private String edtavKilos_Internalname ;
   private String edtavKilos_Jsonclick ;
   private String edtavMetros_Internalname ;
   private String edtavMetros_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnsalir_Internalname ;
   private String bttBtnsalir_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV12msg0 ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String AV32Station ;
   private String GXt_char1 ;
   private String AV33Emprnom ;
   private String AV34Usurcod ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
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
   private IDataStoreProvider pr_default ;
   private String[] H015F3_A130BarCodPar ;
   private byte[] H015F3_A132BarCodReo ;
   private int[] H015F3_A129BarCod ;
   private String[] H015F3_A396EmprCod ;
   private byte[] H015F3_A213BarSit ;
   private java.math.BigDecimal[] H015F3_A140BarCosAny ;
   private java.math.BigDecimal[] H015F3_A141BarCosPro ;
   private int[] H015F3_A898BarPieNDes ;
   private java.math.BigDecimal[] H015F3_A166BarKgm ;
   private java.math.BigDecimal[] H015F3_A184BarMtr ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class particionhdrs3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H015F3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarSit, T1.BarCosAny, T1.BarCosPro, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

