package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webduplicarformula_impl extends GXDataArea
{
   public webduplicarformula_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webduplicarformula_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webduplicarformula_impl.class ));
   }

   public webduplicarformula_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavEquiv = new HTMLChoice();
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
            A396EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV12CliCodOri = (int)(GXutil.lval( httpContext.GetPar( "CliCodOri"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12CliCodOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCodOri), 6, 0));
               AV37SerOri = httpContext.GetPar( "SerOri") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37SerOri", AV37SerOri);
               AV17ColOri = httpContext.GetPar( "ColOri") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17ColOri", AV17ColOri);
               AV16ColNumOri = (int)(GXutil.lval( httpContext.GetPar( "ColNumOri"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16ColNumOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16ColNumOri), 6, 0));
               AV40TipColOri = (byte)(GXutil.lval( httpContext.GetPar( "TipColOri"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40TipColOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TipColOri), 2, 0));
               AV7BarNomCliO = httpContext.GetPar( "BarNomCliO") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7BarNomCliO", AV7BarNomCliO);
               AV9BarNumCliO = (int)(GXutil.lval( httpContext.GetPar( "BarNumCliO"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9BarNumCliO", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarNumCliO), 6, 0));
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
      paSB2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startSB2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webduplicarformula", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV12CliCodOri,6,0)),GXutil.URLEncode(GXutil.rtrim(AV37SerOri)),GXutil.URLEncode(GXutil.rtrim(AV17ColOri)),GXutil.URLEncode(GXutil.ltrimstr(AV16ColNumOri,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40TipColOri,2,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarNomCliO)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarNumCliO,6,0))}, new String[] {"EmprCod","CliCodOri","SerOri","ColOri","ColNumOri","TipColOri","BarNomCliO","BarNumCliO"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODDES_DATA", AV47CliCodDes_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODDES_DATA", AV47CliCodDes_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSERDES_DATA", AV49SerDes_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSERDES_DATA", AV49SerDes_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV18EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXISTEARTICU", GXutil.ltrim( localUtil.ntoc( AV46ExisteArticu, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTCOD", GXutil.rtrim( A65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTCDSC", A13751ArtCDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODDES_Cls", GXutil.rtrim( Combo_clicoddes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODDES_Selectedvalue_set", GXutil.rtrim( Combo_clicoddes_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODDES_Emptyitem", GXutil.booltostr( Combo_clicoddes_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SERDES_Cls", GXutil.rtrim( Combo_serdes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SERDES_Selectedvalue_set", GXutil.rtrim( Combo_serdes_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SERDES_Emptyitem", GXutil.booltostr( Combo_serdes_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SERDES_Selectedvalue_get", GXutil.rtrim( Combo_serdes_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODDES_Selectedvalue_get", GXutil.rtrim( Combo_clicoddes_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODDES_Selectedvalue_get", GXutil.rtrim( Combo_clicoddes_Selectedvalue_get));
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
         weSB2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtSB2( ) ;
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
      return formatLink("app.webduplicarformula", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV12CliCodOri,6,0)),GXutil.URLEncode(GXutil.rtrim(AV37SerOri)),GXutil.URLEncode(GXutil.rtrim(AV17ColOri)),GXutil.URLEncode(GXutil.ltrimstr(AV16ColNumOri,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40TipColOri,2,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarNomCliO)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarNumCliO,6,0))}, new String[] {"EmprCod","CliCodOri","SerOri","ColOri","ColNumOri","TipColOri","BarNomCliO","BarNumCliO"})  ;
   }

   public String getPgmname( )
   {
      return "WebDuplicarFormula" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Duplicar o Equivalente", "") ;
   }

   public void wbSB0( )
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
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup6_Internalname, httpContext.getMessage( "Formula Origen", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_WebDuplicarFormula.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicodori_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicodori_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodori_Internalname, GXutil.ltrim( localUtil.ntoc( AV12CliCodOri, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicodori_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12CliCodOri), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12CliCodOri), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodori_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicodori_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDuplicarFormula.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSerori_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSerori_Internalname, httpContext.getMessage( "Articulo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSerori_Internalname, GXutil.rtrim( AV37SerOri), GXutil.rtrim( localUtil.format( AV37SerOri, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSerori_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSerori_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDuplicarFormula.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavColori_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavColori_Internalname, httpContext.getMessage( "Color", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavColori_Internalname, GXutil.rtrim( AV17ColOri), GXutil.rtrim( localUtil.format( AV17ColOri, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavColori_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavColori_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDuplicarFormula.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavColnumori_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavColnumori_Internalname, httpContext.getMessage( "Numero", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavColnumori_Internalname, GXutil.ltrim( localUtil.ntoc( AV16ColNumOri, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavColnumori_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV16ColNumOri), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV16ColNumOri), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavColnumori_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavColnumori_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDuplicarFormula.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipcolori_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipcolori_Internalname, httpContext.getMessage( "Tc", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcolori_Internalname, GXutil.ltrim( localUtil.ntoc( AV40TipColOri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipcolori_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV40TipColOri), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV40TipColOri), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcolori_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipcolori_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDuplicarFormula.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnomclio_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnomclio_Internalname, httpContext.getMessage( "Color Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomclio_Internalname, GXutil.rtrim( AV7BarNomCliO), GXutil.rtrim( localUtil.format( AV7BarNomCliO, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomclio_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomclio_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDuplicarFormula.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnumclio_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnumclio_Internalname, httpContext.getMessage( "Numero ", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnumclio_Internalname, GXutil.ltrim( localUtil.ntoc( AV9BarNumCliO, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarnumclio_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9BarNumCliO), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9BarNumCliO), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnumclio_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnumclio_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDuplicarFormula.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMsgbloqueadocolor_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMsgbloqueadocolor_Internalname, AV42Msgbloqueadocolor, GXutil.rtrim( localUtil.format( AV42Msgbloqueadocolor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMsgbloqueadocolor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMsgbloqueadocolor_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDuplicarFormula.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", divUnnamedtable8_Height, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup10_Internalname, httpContext.getMessage( "Formula Destino", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_WebDuplicarFormula.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicoddes_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicoddes_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockcombo_clicoddes_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDuplicarFormula.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicoddes.setProperty("Caption", Combo_clicoddes_Caption);
         ucCombo_clicoddes.setProperty("Cls", Combo_clicoddes_Cls);
         ucCombo_clicoddes.setProperty("EmptyItem", Combo_clicoddes_Emptyitem);
         ucCombo_clicoddes.setProperty("DropDownOptionsData", AV47CliCodDes_Data);
         ucCombo_clicoddes.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicoddes_Internalname, "COMBO_CLICODDESContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedserdes_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_serdes_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblockcombo_serdes_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDuplicarFormula.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_serdes.setProperty("Caption", Combo_serdes_Caption);
         ucCombo_serdes.setProperty("Cls", Combo_serdes_Cls);
         ucCombo_serdes.setProperty("EmptyItem", Combo_serdes_Emptyitem);
         ucCombo_serdes.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucCombo_serdes.setProperty("DropDownOptionsData", AV49SerDes_Data);
         ucCombo_serdes.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_serdes_Internalname, "COMBO_SERDESContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavColdes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavColdes_Internalname, httpContext.getMessage( "Color", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavColdes_Internalname, GXutil.rtrim( AV14ColDes), GXutil.rtrim( localUtil.format( AV14ColDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavColdes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavColdes_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDuplicarFormula.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavColnumdes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavColnumdes_Internalname, httpContext.getMessage( "Numero", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavColnumdes_Internalname, GXutil.ltrim( localUtil.ntoc( AV15ColNumDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavColnumdes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV15ColNumDes), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV15ColNumDes), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavColnumdes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavColnumdes_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDuplicarFormula.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipcoldes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipcoldes_Internalname, httpContext.getMessage( "Tc", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcoldes_Internalname, GXutil.ltrim( localUtil.ntoc( AV39TipColDes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipcoldes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV39TipColDes), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV39TipColDes), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcoldes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipcoldes_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDuplicarFormula.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnomclid_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnomclid_Internalname, httpContext.getMessage( "Color Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomclid_Internalname, GXutil.rtrim( AV6BarNomCliD), GXutil.rtrim( localUtil.format( AV6BarNomCliD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomclid_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomclid_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDuplicarFormula.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnumclid_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnumclid_Internalname, httpContext.getMessage( "Numero ", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnumclid_Internalname, GXutil.ltrim( localUtil.ntoc( AV8BarNumCliD, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarnumclid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8BarNumCliD), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8BarNumCliD), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnumclid_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnumclid_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDuplicarFormula.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavEquiv.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavEquiv, cmbavEquiv.getInternalname(), GXutil.trim( GXutil.str( AV20Equiv, 1, 0)), 1, cmbavEquiv.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavEquiv.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,115);\"", "", true, (byte)(0), "HLP_WebDuplicarFormula.htm");
         cmbavEquiv.setValue( GXutil.trim( GXutil.str( AV20Equiv, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavEquiv.getInternalname(), "Values", cmbavEquiv.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebDuplicarFormula.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsalir_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtnsalir_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSALIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebDuplicarFormula.htm");
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicoddes_Internalname, GXutil.ltrim( localUtil.ntoc( AV11CliCodDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11CliCodDes), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicoddes_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicoddes_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDuplicarFormula.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSerdes_Internalname, GXutil.rtrim( AV36SerDes), GXutil.rtrim( localUtil.format( AV36SerDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,132);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSerdes_Jsonclick, 0, "Attribute", "", "", "", "", edtavSerdes_Visible, 1, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDuplicarFormula.htm");
         wb_table1_133_SB2( true) ;
      }
      else
      {
         wb_table1_133_SB2( false) ;
      }
      return  ;
   }

   public void wb_table1_133_SB2e( boolean wbgen )
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

   public void startSB2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Duplicar o Equivalente", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupSB0( ) ;
   }

   public void wsSB2( )
   {
      startSB2( ) ;
      evtSB2( ) ;
   }

   public void evtSB2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICODDES.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e11SB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12SB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e13SB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e14SB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSALIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSalir' */
                           e15SB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e16SB2 ();
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

   public void weSB2( )
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

   public void paSB2( )
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
            GX_FocusControl = edtavMsgbloqueadocolor_Internalname ;
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
      if ( cmbavEquiv.getItemCount() > 0 )
      {
         AV20Equiv = (byte)(GXutil.lval( cmbavEquiv.getValidValue(GXutil.trim( GXutil.str( AV20Equiv, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Equiv", GXutil.str( AV20Equiv, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavEquiv.setValue( GXutil.trim( GXutil.str( AV20Equiv, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavEquiv.getInternalname(), "Values", cmbavEquiv.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfSB2( ) ;
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
      edtavClicodori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodori_Enabled), 5, 0), true);
      edtavSerori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSerori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSerori_Enabled), 5, 0), true);
      edtavColori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavColori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavColori_Enabled), 5, 0), true);
      edtavColnumori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavColnumori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavColnumori_Enabled), 5, 0), true);
      edtavTipcolori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcolori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcolori_Enabled), 5, 0), true);
      edtavBarnomclio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomclio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomclio_Enabled), 5, 0), true);
      edtavBarnumclio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnumclio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnumclio_Enabled), 5, 0), true);
      edtavMsgbloqueadocolor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMsgbloqueadocolor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMsgbloqueadocolor_Enabled), 5, 0), true);
   }

   public void rfSB2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00SB2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            /* Execute user event: Load */
            e16SB2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wbSB0( ) ;
      }
   }

   public void send_integrity_lvl_hashesSB2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavClicodori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodori_Enabled), 5, 0), true);
      edtavSerori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSerori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSerori_Enabled), 5, 0), true);
      edtavColori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavColori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavColori_Enabled), 5, 0), true);
      edtavColnumori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavColnumori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavColnumori_Enabled), 5, 0), true);
      edtavTipcolori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcolori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcolori_Enabled), 5, 0), true);
      edtavBarnomclio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomclio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomclio_Enabled), 5, 0), true);
      edtavBarnumclio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnumclio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnumclio_Enabled), 5, 0), true);
      edtavMsgbloqueadocolor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMsgbloqueadocolor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMsgbloqueadocolor_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupSB0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13SB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODDES_DATA"), AV47CliCodDes_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV50DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSERDES_DATA"), AV49SerDes_Data);
         /* Read saved values. */
         Combo_clicoddes_Cls = httpContext.cgiGet( "COMBO_CLICODDES_Cls") ;
         Combo_clicoddes_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODDES_Selectedvalue_set") ;
         Combo_clicoddes_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICODDES_Emptyitem")) ;
         Combo_serdes_Cls = httpContext.cgiGet( "COMBO_SERDES_Cls") ;
         Combo_serdes_Selectedvalue_set = httpContext.cgiGet( "COMBO_SERDES_Selectedvalue_set") ;
         Combo_serdes_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_SERDES_Emptyitem")) ;
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
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         Combo_clicoddes_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODDES_Selectedvalue_get") ;
         /* Read variables values. */
         AV12CliCodOri = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodori_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12CliCodOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCodOri), 6, 0));
         AV37SerOri = httpContext.cgiGet( edtavSerori_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37SerOri", AV37SerOri);
         AV17ColOri = httpContext.cgiGet( edtavColori_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17ColOri", AV17ColOri);
         AV16ColNumOri = (int)(localUtil.ctol( httpContext.cgiGet( edtavColnumori_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16ColNumOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16ColNumOri), 6, 0));
         AV40TipColOri = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTipcolori_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40TipColOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TipColOri), 2, 0));
         AV42Msgbloqueadocolor = httpContext.cgiGet( edtavMsgbloqueadocolor_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Msgbloqueadocolor", AV42Msgbloqueadocolor);
         AV14ColDes = httpContext.cgiGet( edtavColdes_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14ColDes", AV14ColDes);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavColnumdes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavColnumdes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOLNUMDES");
            GX_FocusControl = edtavColnumdes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15ColNumDes = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15ColNumDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15ColNumDes), 6, 0));
         }
         else
         {
            AV15ColNumDes = (int)(localUtil.ctol( httpContext.cgiGet( edtavColnumdes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15ColNumDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15ColNumDes), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcoldes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcoldes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPCOLDES");
            GX_FocusControl = edtavTipcoldes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39TipColDes = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TipColDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TipColDes), 2, 0));
         }
         else
         {
            AV39TipColDes = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTipcoldes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TipColDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TipColDes), 2, 0));
         }
         AV6BarNomCliD = httpContext.cgiGet( edtavBarnomclid_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarNomCliD", AV6BarNomCliD);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumclid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumclid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARNUMCLID");
            GX_FocusControl = edtavBarnumclid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8BarNumCliD = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarNumCliD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarNumCliD), 6, 0));
         }
         else
         {
            AV8BarNumCliD = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarnumclid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarNumCliD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarNumCliD), 6, 0));
         }
         cmbavEquiv.setValue( httpContext.cgiGet( cmbavEquiv.getInternalname()) );
         AV20Equiv = (byte)(GXutil.lval( httpContext.cgiGet( cmbavEquiv.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Equiv", GXutil.str( AV20Equiv, 1, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicoddes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicoddes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODDES");
            GX_FocusControl = edtavClicoddes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11CliCodDes = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11CliCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCodDes), 6, 0));
         }
         else
         {
            AV11CliCodDes = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicoddes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11CliCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCodDes), 6, 0));
         }
         AV36SerDes = httpContext.cgiGet( edtavSerdes_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36SerDes", AV36SerDes);
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
      e13SB2 ();
      if (returnInSub) return;
   }

   public void e13SB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV38Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webduplicarformula_impl.this.GXt_char1 = GXv_char2[0] ;
      AV38Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV41UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV38Station, GXv_char2, GXv_char3, GXv_char4) ;
      webduplicarformula_impl.this.A396EmprCod = GXv_char2[0] ;
      webduplicarformula_impl.this.AV19EmprNom = GXv_char3[0] ;
      webduplicarformula_impl.this.AV41UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV11CliCodDes = AV12CliCodOri ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11CliCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCodDes), 6, 0));
      AV36SerDes = AV37SerOri ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36SerDes", AV36SerDes);
      AV14ColDes = AV17ColOri ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14ColDes", AV14ColDes);
      AV15ColNumDes = AV16ColNumOri ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15ColNumDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15ColNumDes), 6, 0));
      AV39TipColDes = AV40TipColOri ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TipColDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TipColDes), 2, 0));
      AV6BarNomCliD = AV7BarNomCliO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarNomCliD", AV6BarNomCliD);
      AV8BarNumCliD = AV9BarNumCliO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarNumCliD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarNumCliD), 6, 0));
      GXt_char1 = AV33Msg5 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN277", ""), (byte)(99), GXv_char4) ;
      webduplicarformula_impl.this.GXt_char1 = GXv_char4[0] ;
      AV33Msg5 = GXt_char1 ;
      GXt_char1 = AV34Msg6 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1297_", ""), (byte)(99), GXv_char4) ;
      webduplicarformula_impl.this.GXt_char1 = GXv_char4[0] ;
      AV34Msg6 = GXt_char1 ;
      GXt_char1 = AV35Msg7 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGLR075_", ""), (byte)(99), GXv_char4) ;
      webduplicarformula_impl.this.GXt_char1 = GXv_char4[0] ;
      AV35Msg7 = GXt_char1 ;
      GXt_int5 = AV10Carvema ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      webduplicarformula_impl.this.GXt_int5 = GXv_int6[0] ;
      AV10Carvema = GXt_int5 ;
      GXt_int5 = AV26Jpf ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JPF", ""), GXv_int6) ;
      webduplicarformula_impl.this.GXt_int5 = GXv_int6[0] ;
      AV26Jpf = GXt_int5 ;
      /* Execute user subroutine: 'ORIGEM' */
      S112 ();
      if (returnInSub) return;
      AV42Msgbloqueadocolor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Msgbloqueadocolor", AV42Msgbloqueadocolor);
      if ( ( GXutil.strcmp(AV25ForPro, httpContext.getMessage( "S", "")) == 0 ) && ( AV26Jpf == 1 ) )
      {
         AV42Msgbloqueadocolor = httpContext.getMessage( "AVISO.Atencion el Color Original esta BLOQUEADO", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Msgbloqueadocolor", AV42Msgbloqueadocolor);
      }
      if ( GXutil.strcmp(AV23ForBlo, httpContext.getMessage( "S", "")) == 0 )
      {
         AV42Msgbloqueadocolor = httpContext.getMessage( "AVISO.Atencion el Color Original esta BLOQUEADO", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Msgbloqueadocolor", AV42Msgbloqueadocolor);
      }
      GXt_char1 = AV38Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webduplicarformula_impl.this.GXt_char1 = GXv_char4[0] ;
      AV38Station = GXt_char1 ;
      GXv_char4[0] = AV18EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char2[0] = AV41UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV38Station, GXv_char4, GXv_char3, GXv_char2) ;
      webduplicarformula_impl.this.AV18EmprCod = GXv_char4[0] ;
      webduplicarformula_impl.this.AV19EmprNom = GXv_char3[0] ;
      webduplicarformula_impl.this.AV41UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV50DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV50DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      edtavSerdes_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSerdes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSerdes_Visible), 5, 0), true);
      edtavClicoddes_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicoddes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicoddes_Visible), 5, 0), true);
      divUnnamedtable8_Height = 20 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable8_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable8_Height), 9, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICODDES' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOSERDES' */
      S132 ();
      if (returnInSub) return;
   }

   public void e14SB2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      if ( (0==AV11CliCodDes) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Cliente Destino sin valor", ""));
         GX_FocusControl = edtavClicoddes_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         GXt_char1 = AV45var_clinom ;
         GXv_char4[0] = GXt_char1 ;
         new app.pclinom(remoteHandle, context).execute( AV18EmprCod, AV11CliCodDes, GXv_char4) ;
         webduplicarformula_impl.this.GXt_char1 = GXv_char4[0] ;
         AV45var_clinom = GXt_char1 ;
         if ( GXutil.strcmp(AV45var_clinom, httpContext.getMessage( "Error", "")) == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Cliente Destino Inexistente", ""));
            GX_FocusControl = edtavClicoddes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXv_char4[0] = AV18EmprCod ;
            GXv_int9[0] = AV11CliCodDes ;
            GXv_char3[0] = AV36SerDes ;
            GXv_char2[0] = " " ;
            GXv_int6[0] = (byte)(AV46ExisteArticu) ;
            new app.pbusard(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3, GXv_char2, GXv_int6) ;
            webduplicarformula_impl.this.AV18EmprCod = GXv_char4[0] ;
            webduplicarformula_impl.this.AV11CliCodDes = GXv_int9[0] ;
            webduplicarformula_impl.this.AV36SerDes = GXv_char3[0] ;
            webduplicarformula_impl.this.AV46ExisteArticu = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV11CliCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCodDes), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV36SerDes", AV36SerDes);
            httpContext.ajax_rsp_assign_attri("", false, "AV46ExisteArticu", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46ExisteArticu), 4, 0));
            if ( (0==AV46ExisteArticu) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Cliente-Articulo Destino, NO existe", ""));
            }
            else
            {
               if ( (GXutil.strcmp("", AV36SerDes)==0) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Articulo Destino sin valor", ""));
                  GX_FocusControl = edtavSerdes_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  Dvelop_confirmpanel_confirmar_Title = httpContext.getMessage( "Has seleccionado, Opcion= ", "")+((0==AV20Equiv) ? httpContext.getMessage( "DUPLICAR", "") : httpContext.getMessage( "EQUIVALENTE", ""))+GXutil.newLine( ) ;
                  ucDvelop_confirmpanel_confirmar.sendProperty(context, "", false, Dvelop_confirmpanel_confirmar_Internalname, "Title", Dvelop_confirmpanel_confirmar_Title);
                  this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_CONFIRMARContainer", "Confirm", "", new Object[] {});
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e12SB2( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S142 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      cmbavEquiv.setValue( GXutil.trim( GXutil.str( AV20Equiv, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavEquiv.getInternalname(), "Values", cmbavEquiv.ToJavascriptSource(), true);
   }

   public void e15SB2( )
   {
      /* 'DoSalir' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(AV12CliCodOri),AV37SerOri,AV17ColOri,Integer.valueOf(AV16ColNumOri),Byte.valueOf(AV40TipColOri),AV7BarNomCliO,Integer.valueOf(AV9BarNumCliO)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","AV12CliCodOri","AV37SerOri","AV17ColOri","AV16ColNumOri","AV40TipColOri","AV7BarNomCliO","AV9BarNumCliO"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e11SB2( )
   {
      /* Combo_clicoddes_Onoptionclicked Routine */
      returnInSub = false ;
      AV11CliCodDes = (int)(GXutil.lval( Combo_clicoddes_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11CliCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCodDes), 6, 0));
      /* Execute user subroutine: 'LOADCOMBOSERDES' */
      S132 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV49SerDes_Data", AV49SerDes_Data);
   }

   public void S142( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      GXv_int6[0] = AV21Flag ;
      new app.formulaciontinte.pbufori(remoteHandle, context).execute( A396EmprCod, AV11CliCodDes, AV36SerDes, AV14ColDes, AV15ColNumDes, AV39TipColDes, GXv_int6) ;
      webduplicarformula_impl.this.AV21Flag = GXv_int6[0] ;
      if ( AV21Flag == 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Color Destino, existe ¡¡¡", ""));
      }
      else
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = AV12CliCodOri ;
         GXv_char3[0] = AV37SerOri ;
         GXv_char2[0] = AV17ColOri ;
         GXv_int10[0] = AV16ColNumOri ;
         GXv_int6[0] = AV40TipColOri ;
         GXv_int11[0] = AV11CliCodDes ;
         GXv_char12[0] = AV36SerDes ;
         GXv_char13[0] = AV14ColDes ;
         GXv_int14[0] = AV15ColNumDes ;
         GXv_int15[0] = AV39TipColDes ;
         GXv_char16[0] = AV6BarNomCliD ;
         GXv_int17[0] = AV8BarNumCliD ;
         GXv_int18[0] = AV20Equiv ;
         new app.pdupfork(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3, GXv_char2, GXv_int10, GXv_int6, GXv_int11, GXv_char12, GXv_char13, GXv_int14, GXv_int15, GXv_char16, GXv_int17, GXv_int18) ;
         webduplicarformula_impl.this.A396EmprCod = GXv_char4[0] ;
         webduplicarformula_impl.this.AV12CliCodOri = GXv_int9[0] ;
         webduplicarformula_impl.this.AV37SerOri = GXv_char3[0] ;
         webduplicarformula_impl.this.AV17ColOri = GXv_char2[0] ;
         webduplicarformula_impl.this.AV16ColNumOri = GXv_int10[0] ;
         webduplicarformula_impl.this.AV40TipColOri = GXv_int6[0] ;
         webduplicarformula_impl.this.AV11CliCodDes = GXv_int11[0] ;
         webduplicarformula_impl.this.AV36SerDes = GXv_char12[0] ;
         webduplicarformula_impl.this.AV14ColDes = GXv_char13[0] ;
         webduplicarformula_impl.this.AV15ColNumDes = GXv_int14[0] ;
         webduplicarformula_impl.this.AV39TipColDes = GXv_int15[0] ;
         webduplicarformula_impl.this.AV6BarNomCliD = GXv_char16[0] ;
         webduplicarformula_impl.this.AV8BarNumCliD = GXv_int17[0] ;
         webduplicarformula_impl.this.AV20Equiv = GXv_int18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV12CliCodOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCodOri), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV37SerOri", AV37SerOri);
         httpContext.ajax_rsp_assign_attri("", false, "AV17ColOri", AV17ColOri);
         httpContext.ajax_rsp_assign_attri("", false, "AV16ColNumOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16ColNumOri), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV40TipColOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TipColOri), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV11CliCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCodDes), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV36SerDes", AV36SerDes);
         httpContext.ajax_rsp_assign_attri("", false, "AV14ColDes", AV14ColDes);
         httpContext.ajax_rsp_assign_attri("", false, "AV15ColNumDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15ColNumDes), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV39TipColDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TipColDes), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarNomCliD", AV6BarNomCliD);
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarNumCliD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarNumCliD), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV20Equiv", GXutil.str( AV20Equiv, 1, 0));
         Gx_msg = ((AV20Equiv==0) ? httpContext.getMessage( "Color Duplicado creado", "") : httpContext.getMessage( "Color Equivalente creado", "")) ;
         httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(AV12CliCodOri),AV37SerOri,AV17ColOri,Integer.valueOf(AV16ColNumOri),Byte.valueOf(AV40TipColOri),AV7BarNomCliO,Integer.valueOf(AV9BarNumCliO)});
         httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","AV12CliCodOri","AV37SerOri","AV17ColOri","AV16ColNumOri","AV40TipColOri","AV7BarNomCliO","AV9BarNumCliO"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S132( )
   {
      /* 'LOADCOMBOSERDES' Routine */
      returnInSub = false ;
      AV49SerDes_Data.clear();
      /* Using cursor H00SB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV11CliCodDes)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = H00SB3_A252CliCod[0] ;
         A69ArtDsc = H00SB3_A69ArtDsc[0] ;
         n69ArtDsc = H00SB3_n69ArtDsc[0] ;
         A65ArtCod = H00SB3_A65ArtCod[0] ;
         A13751ArtCDsc = GXutil.trim( A65ArtCod) + "-" + GXutil.trim( A69ArtDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13751ArtCDsc", A13751ArtCDsc);
         AV48Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV48Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A65ArtCod );
         AV48Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13751ArtCDsc );
         AV49SerDes_Data.add(AV48Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV49SerDes_Data.sort("Title");
      Combo_serdes_Selectedvalue_set = AV36SerDes ;
      ucCombo_serdes.sendProperty(context, "", false, Combo_serdes_Internalname, "SelectedValue_set", Combo_serdes_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICODDES' Routine */
      returnInSub = false ;
      /* Using cursor H00SB4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A10045CliAct = H00SB4_A10045CliAct[0] ;
         A13735CliCNom = H00SB4_A13735CliCNom[0] ;
         A252CliCod = H00SB4_A252CliCod[0] ;
         A279CliNom = H00SB4_A279CliNom[0] ;
         AV48Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV48Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV48Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV47CliCodDes_Data.add(AV48Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_clicoddes_Selectedvalue_set = ((0==AV11CliCodDes) ? "" : GXutil.trim( GXutil.str( AV11CliCodDes, 6, 0))) ;
      ucCombo_clicoddes.sendProperty(context, "", false, Combo_clicoddes_Internalname, "SelectedValue_set", Combo_clicoddes_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'ORIGEM' Routine */
      returnInSub = false ;
      AV24ForNumColi = 0 ;
      AV13CliObs = "" ;
      /* Using cursor H00SB5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV12CliCodOri), AV37SerOri, AV17ColOri, Integer.valueOf(AV16ColNumOri), Byte.valueOf(AV40TipColOri)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A831TipColCod = H00SB5_A831TipColCod[0] ;
         A483ForColNum = H00SB5_A483ForColNum[0] ;
         A482ForColNom = H00SB5_A482ForColNom[0] ;
         A494ForSer = H00SB5_A494ForSer[0] ;
         A252CliCod = H00SB5_A252CliCod[0] ;
         A486ForNumCol = H00SB5_A486ForNumCol[0] ;
         A2838ForRelBan = H00SB5_A2838ForRelBan[0] ;
         n2838ForRelBan = H00SB5_n2838ForRelBan[0] ;
         A3629CliObs = H00SB5_A3629CliObs[0] ;
         A3629CliObs = H00SB5_A3629CliObs[0] ;
         AV24ForNumColi = A486ForNumCol ;
         AV43ForRelBan = A2838ForRelBan ;
         AV13CliObs = A3629CliObs ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV5ArtObslon = "" ;
      /* Using cursor H00SB6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV12CliCodOri), AV37SerOri});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A3072ArtObsLon = H00SB6_A3072ArtObsLon[0] ;
         n3072ArtObsLon = H00SB6_n3072ArtObsLon[0] ;
         A65ArtCod = H00SB6_A65ArtCod[0] ;
         A252CliCod = H00SB6_A252CliCod[0] ;
         AV5ArtObslon = A3072ArtObsLon ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   protected void nextLoad( )
   {
   }

   protected void e16SB2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_133_SB2( boolean wbgen )
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
         wb_table1_133_SB2e( true) ;
      }
      else
      {
         wb_table1_133_SB2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV12CliCodOri = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12CliCodOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCodOri), 6, 0));
      AV37SerOri = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37SerOri", AV37SerOri);
      AV17ColOri = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ColOri", AV17ColOri);
      AV16ColNumOri = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16ColNumOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16ColNumOri), 6, 0));
      AV40TipColOri = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TipColOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TipColOri), 2, 0));
      AV7BarNomCliO = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarNomCliO", AV7BarNomCliO);
      AV9BarNumCliO = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarNumCliO", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarNumCliO), 6, 0));
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
      paSB2( ) ;
      wsSB2( ) ;
      weSB2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241513755", true, true);
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
      httpContext.AddJavascriptSource("webduplicarformula.js", "?20268241513755", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      edtavClicodori_Internalname = "vCLICODORI" ;
      edtavSerori_Internalname = "vSERORI" ;
      edtavColori_Internalname = "vCOLORI" ;
      edtavColnumori_Internalname = "vCOLNUMORI" ;
      edtavTipcolori_Internalname = "vTIPCOLORI" ;
      edtavBarnomclio_Internalname = "vBARNOMCLIO" ;
      edtavBarnumclio_Internalname = "vBARNUMCLIO" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      grpUnnamedgroup6_Internalname = "UNNAMEDGROUP6" ;
      edtavMsgbloqueadocolor_Internalname = "vMSGBLOQUEADOCOLOR" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      lblTextblockcombo_clicoddes_Internalname = "TEXTBLOCKCOMBO_CLICODDES" ;
      Combo_clicoddes_Internalname = "COMBO_CLICODDES" ;
      divTablesplittedclicoddes_Internalname = "TABLESPLITTEDCLICODDES" ;
      lblTextblockcombo_serdes_Internalname = "TEXTBLOCKCOMBO_SERDES" ;
      Combo_serdes_Internalname = "COMBO_SERDES" ;
      divTablesplittedserdes_Internalname = "TABLESPLITTEDSERDES" ;
      edtavColdes_Internalname = "vCOLDES" ;
      edtavColnumdes_Internalname = "vCOLNUMDES" ;
      edtavTipcoldes_Internalname = "vTIPCOLDES" ;
      edtavBarnomclid_Internalname = "vBARNOMCLID" ;
      edtavBarnumclid_Internalname = "vBARNUMCLID" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      grpUnnamedgroup10_Internalname = "UNNAMEDGROUP10" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      cmbavEquiv.setInternalname( "vEQUIV" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtnsalir_Internalname = "BTNSALIR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicoddes_Internalname = "vCLICODDES" ;
      edtavSerdes_Internalname = "vSERDES" ;
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
      edtavSerdes_Jsonclick = "" ;
      edtavSerdes_Visible = 1 ;
      edtavClicoddes_Jsonclick = "" ;
      edtavClicoddes_Visible = 1 ;
      cmbavEquiv.setJsonclick( "" );
      cmbavEquiv.setEnabled( 1 );
      edtavBarnumclid_Jsonclick = "" ;
      edtavBarnumclid_Enabled = 1 ;
      edtavBarnomclid_Jsonclick = "" ;
      edtavBarnomclid_Enabled = 1 ;
      edtavTipcoldes_Jsonclick = "" ;
      edtavTipcoldes_Enabled = 1 ;
      edtavColnumdes_Jsonclick = "" ;
      edtavColnumdes_Enabled = 1 ;
      edtavColdes_Jsonclick = "" ;
      edtavColdes_Enabled = 1 ;
      Combo_serdes_Caption = "" ;
      divUnnamedtable8_Height = 0 ;
      edtavMsgbloqueadocolor_Jsonclick = "" ;
      edtavMsgbloqueadocolor_Enabled = 1 ;
      edtavBarnumclio_Jsonclick = "" ;
      edtavBarnumclio_Enabled = 0 ;
      edtavBarnomclio_Jsonclick = "" ;
      edtavBarnomclio_Enabled = 0 ;
      edtavTipcolori_Jsonclick = "" ;
      edtavTipcolori_Enabled = 0 ;
      edtavColnumori_Jsonclick = "" ;
      edtavColnumori_Enabled = 0 ;
      edtavColori_Jsonclick = "" ;
      edtavColori_Enabled = 0 ;
      edtavSerori_Jsonclick = "" ;
      edtavSerori_Enabled = 0 ;
      edtavClicodori_Jsonclick = "" ;
      edtavClicodori_Enabled = 0 ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirmas el Proceso?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
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
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Accion", "") ;
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
      Combo_serdes_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_serdes_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicoddes_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clicoddes_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Duplicar o Equivalente", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavEquiv.setName( "vEQUIV" );
      cmbavEquiv.setWebtags( "" );
      cmbavEquiv.addItem("0", httpContext.getMessage( "Duplicado", ""), (short)(0));
      cmbavEquiv.addItem("1", httpContext.getMessage( "Equivalente", ""), (short)(0));
      if ( cmbavEquiv.getItemCount() > 0 )
      {
         AV20Equiv = (byte)(GXutil.lval( cmbavEquiv.getValidValue(GXutil.trim( GXutil.str( AV20Equiv, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Equiv", GXutil.str( AV20Equiv, 1, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e14SB2',iparms:[{av:'AV11CliCodDes',fld:'vCLICODDES',pic:'ZZZZZ9'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36SerDes',fld:'vSERDES',pic:''},{av:'AV46ExisteArticu',fld:'vEXISTEARTICU',pic:'ZZZ9'},{av:'cmbavEquiv'},{av:'AV20Equiv',fld:'vEQUIV',pic:'9'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV46ExisteArticu',fld:'vEXISTEARTICU',pic:'ZZZ9'},{av:'AV36SerDes',fld:'vSERDES',pic:''},{av:'AV11CliCodDes',fld:'vCLICODDES',pic:'ZZZZZ9'},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_confirmar_Title',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Title'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e12SB2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV11CliCodDes',fld:'vCLICODDES',pic:'ZZZZZ9'},{av:'AV36SerDes',fld:'vSERDES',pic:''},{av:'AV14ColDes',fld:'vCOLDES',pic:''},{av:'AV15ColNumDes',fld:'vCOLNUMDES',pic:'ZZZZZ9'},{av:'AV39TipColDes',fld:'vTIPCOLDES',pic:'Z9'},{av:'AV12CliCodOri',fld:'vCLICODORI',pic:'ZZZZZ9'},{av:'AV37SerOri',fld:'vSERORI',pic:''},{av:'AV17ColOri',fld:'vCOLORI',pic:''},{av:'AV16ColNumOri',fld:'vCOLNUMORI',pic:'ZZZZZ9'},{av:'AV40TipColOri',fld:'vTIPCOLORI',pic:'Z9'},{av:'AV6BarNomCliD',fld:'vBARNOMCLID',pic:''},{av:'AV8BarNumCliD',fld:'vBARNUMCLID',pic:'ZZZZZ9'},{av:'cmbavEquiv'},{av:'AV20Equiv',fld:'vEQUIV',pic:'9'},{av:'AV9BarNumCliO',fld:'vBARNUMCLIO',pic:'ZZZZZ9'},{av:'AV7BarNomCliO',fld:'vBARNOMCLIO',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'cmbavEquiv'},{av:'AV20Equiv',fld:'vEQUIV',pic:'9'},{av:'AV8BarNumCliD',fld:'vBARNUMCLID',pic:'ZZZZZ9'},{av:'AV6BarNomCliD',fld:'vBARNOMCLID',pic:''},{av:'AV39TipColDes',fld:'vTIPCOLDES',pic:'Z9'},{av:'AV15ColNumDes',fld:'vCOLNUMDES',pic:'ZZZZZ9'},{av:'AV14ColDes',fld:'vCOLDES',pic:''},{av:'AV36SerDes',fld:'vSERDES',pic:''},{av:'AV11CliCodDes',fld:'vCLICODDES',pic:'ZZZZZ9'},{av:'AV40TipColOri',fld:'vTIPCOLORI',pic:'Z9'},{av:'AV16ColNumOri',fld:'vCOLNUMORI',pic:'ZZZZZ9'},{av:'AV17ColOri',fld:'vCOLORI',pic:''},{av:'AV37SerOri',fld:'vSERORI',pic:''},{av:'AV12CliCodOri',fld:'vCLICODORI',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOSALIR'","{handler:'e15SB2',iparms:[{av:'AV9BarNumCliO',fld:'vBARNUMCLIO',pic:'ZZZZZ9'},{av:'AV7BarNomCliO',fld:'vBARNOMCLIO',pic:''},{av:'AV40TipColOri',fld:'vTIPCOLORI',pic:'Z9'},{av:'AV16ColNumOri',fld:'vCOLNUMORI',pic:'ZZZZZ9'},{av:'AV17ColOri',fld:'vCOLORI',pic:''},{av:'AV37SerOri',fld:'vSERORI',pic:''},{av:'AV12CliCodOri',fld:'vCLICODORI',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOSALIR'",",oparms:[]}");
      setEventMetadata("COMBO_CLICODDES.ONOPTIONCLICKED","{handler:'e11SB2',iparms:[{av:'Combo_clicoddes_Selectedvalue_get',ctrl:'COMBO_CLICODDES',prop:'SelectedValue_get'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV11CliCodDes',fld:'vCLICODDES',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A13751ArtCDsc',fld:'ARTCDSC',pic:''},{av:'AV36SerDes',fld:'vSERDES',pic:''}]");
      setEventMetadata("COMBO_CLICODDES.ONOPTIONCLICKED",",oparms:[{av:'AV11CliCodDes',fld:'vCLICODDES',pic:'ZZZZZ9'},{av:'AV49SerDes_Data',fld:'vSERDES_DATA',pic:''},{av:'Combo_serdes_Selectedvalue_set',ctrl:'COMBO_SERDES',prop:'SelectedValue_set'}]}");
      setEventMetadata("VALIDV_CLICODORI","{handler:'validv_Clicodori',iparms:[]");
      setEventMetadata("VALIDV_CLICODORI",",oparms:[]}");
      setEventMetadata("VALIDV_SERORI","{handler:'validv_Serori',iparms:[]");
      setEventMetadata("VALIDV_SERORI",",oparms:[]}");
      setEventMetadata("VALIDV_COLORI","{handler:'validv_Colori',iparms:[]");
      setEventMetadata("VALIDV_COLORI",",oparms:[]}");
      setEventMetadata("VALIDV_COLNUMORI","{handler:'validv_Colnumori',iparms:[]");
      setEventMetadata("VALIDV_COLNUMORI",",oparms:[]}");
      setEventMetadata("VALIDV_TIPCOLORI","{handler:'validv_Tipcolori',iparms:[]");
      setEventMetadata("VALIDV_TIPCOLORI",",oparms:[]}");
      setEventMetadata("VALIDV_CLICODDES","{handler:'validv_Clicoddes',iparms:[]");
      setEventMetadata("VALIDV_CLICODDES",",oparms:[]}");
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
      wcpOA396EmprCod = "" ;
      wcpOAV37SerOri = "" ;
      wcpOAV17ColOri = "" ;
      wcpOAV7BarNomCliO = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      Combo_serdes_Selectedvalue_get = "" ;
      Combo_clicoddes_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV37SerOri = "" ;
      AV17ColOri = "" ;
      AV7BarNomCliO = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV47CliCodDes_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV50DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV49SerDes_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV18EmprCod = "" ;
      A65ArtCod = "" ;
      A13751ArtCDsc = "" ;
      Combo_clicoddes_Selectedvalue_set = "" ;
      Combo_serdes_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV42Msgbloqueadocolor = "" ;
      lblTextblockcombo_clicoddes_Jsonclick = "" ;
      ucCombo_clicoddes = new com.genexus.webpanels.GXUserControl();
      Combo_clicoddes_Caption = "" ;
      lblTextblockcombo_serdes_Jsonclick = "" ;
      ucCombo_serdes = new com.genexus.webpanels.GXUserControl();
      AV14ColDes = "" ;
      AV6BarNomCliD = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnsalir_Jsonclick = "" ;
      AV36SerDes = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H00SB2_A396EmprCod = new String[] {""} ;
      AV38Station = "" ;
      AV19EmprNom = "" ;
      AV41UsurCod = "" ;
      AV33Msg5 = "" ;
      AV34Msg6 = "" ;
      AV35Msg7 = "" ;
      AV25ForPro = "" ;
      AV23ForBlo = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV45var_clinom = "" ;
      GXt_char1 = "" ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      GXv_char4 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int11 = new int[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_int15 = new byte[1] ;
      GXv_char16 = new String[1] ;
      GXv_int17 = new int[1] ;
      GXv_int18 = new byte[1] ;
      Gx_msg = "" ;
      H00SB3_A396EmprCod = new String[] {""} ;
      H00SB3_A252CliCod = new int[1] ;
      H00SB3_A69ArtDsc = new String[] {""} ;
      H00SB3_n69ArtDsc = new boolean[] {false} ;
      H00SB3_A65ArtCod = new String[] {""} ;
      A69ArtDsc = "" ;
      AV48Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H00SB4_A396EmprCod = new String[] {""} ;
      H00SB4_A10045CliAct = new String[] {""} ;
      H00SB4_A13735CliCNom = new String[] {""} ;
      H00SB4_A252CliCod = new int[1] ;
      H00SB4_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      AV13CliObs = "" ;
      H00SB5_A396EmprCod = new String[] {""} ;
      H00SB5_A831TipColCod = new byte[1] ;
      H00SB5_A483ForColNum = new int[1] ;
      H00SB5_A482ForColNom = new String[] {""} ;
      H00SB5_A494ForSer = new String[] {""} ;
      H00SB5_A252CliCod = new int[1] ;
      H00SB5_A486ForNumCol = new int[1] ;
      H00SB5_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00SB5_n2838ForRelBan = new boolean[] {false} ;
      H00SB5_A3629CliObs = new String[] {""} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      A3629CliObs = "" ;
      AV43ForRelBan = DecimalUtil.ZERO ;
      AV5ArtObslon = "" ;
      H00SB6_A3072ArtObsLon = new String[] {""} ;
      H00SB6_n3072ArtObsLon = new boolean[] {false} ;
      H00SB6_A396EmprCod = new String[] {""} ;
      H00SB6_A65ArtCod = new String[] {""} ;
      H00SB6_A252CliCod = new int[1] ;
      A3072ArtObsLon = "" ;
      sStyleString = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webduplicarformula__default(),
         new Object[] {
             new Object[] {
            H00SB2_A396EmprCod
            }
            , new Object[] {
            H00SB3_A396EmprCod, H00SB3_A252CliCod, H00SB3_A69ArtDsc, H00SB3_n69ArtDsc, H00SB3_A65ArtCod
            }
            , new Object[] {
            H00SB4_A396EmprCod, H00SB4_A10045CliAct, H00SB4_A13735CliCNom, H00SB4_A252CliCod, H00SB4_A279CliNom
            }
            , new Object[] {
            H00SB5_A396EmprCod, H00SB5_A831TipColCod, H00SB5_A483ForColNum, H00SB5_A482ForColNom, H00SB5_A494ForSer, H00SB5_A252CliCod, H00SB5_A486ForNumCol, H00SB5_A2838ForRelBan, H00SB5_n2838ForRelBan, H00SB5_A3629CliObs
            }
            , new Object[] {
            H00SB6_A3072ArtObsLon, H00SB6_n3072ArtObsLon, H00SB6_A396EmprCod, H00SB6_A65ArtCod, H00SB6_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavClicodori_Enabled = 0 ;
      edtavSerori_Enabled = 0 ;
      edtavColori_Enabled = 0 ;
      edtavColnumori_Enabled = 0 ;
      edtavTipcolori_Enabled = 0 ;
      edtavBarnomclio_Enabled = 0 ;
      edtavBarnumclio_Enabled = 0 ;
      edtavMsgbloqueadocolor_Enabled = 0 ;
   }

   private byte wcpOAV40TipColOri ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV40TipColOri ;
   private byte gxajaxcallmode ;
   private byte AV39TipColDes ;
   private byte AV20Equiv ;
   private byte nDonePA ;
   private byte AV10Carvema ;
   private byte AV26Jpf ;
   private byte GXt_int5 ;
   private byte AV21Flag ;
   private byte GXv_int6[] ;
   private byte GXv_int15[] ;
   private byte GXv_int18[] ;
   private byte A831TipColCod ;
   private byte nGXWrapped ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV46ExisteArticu ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV12CliCodOri ;
   private int wcpOAV16ColNumOri ;
   private int wcpOAV9BarNumCliO ;
   private int AV12CliCodOri ;
   private int AV16ColNumOri ;
   private int AV9BarNumCliO ;
   private int A252CliCod ;
   private int edtavClicodori_Enabled ;
   private int edtavSerori_Enabled ;
   private int edtavColori_Enabled ;
   private int edtavColnumori_Enabled ;
   private int edtavTipcolori_Enabled ;
   private int edtavBarnomclio_Enabled ;
   private int edtavBarnumclio_Enabled ;
   private int edtavMsgbloqueadocolor_Enabled ;
   private int divUnnamedtable8_Height ;
   private int edtavColdes_Enabled ;
   private int AV15ColNumDes ;
   private int edtavColnumdes_Enabled ;
   private int edtavTipcoldes_Enabled ;
   private int edtavBarnomclid_Enabled ;
   private int AV8BarNumCliD ;
   private int edtavBarnumclid_Enabled ;
   private int AV11CliCodDes ;
   private int edtavClicoddes_Visible ;
   private int edtavSerdes_Visible ;
   private int GXv_int9[] ;
   private int GXv_int10[] ;
   private int GXv_int11[] ;
   private int GXv_int14[] ;
   private int GXv_int17[] ;
   private int AV24ForNumColi ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int idxLst ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal AV43ForRelBan ;
   private String wcpOA396EmprCod ;
   private String wcpOAV37SerOri ;
   private String wcpOAV17ColOri ;
   private String wcpOAV7BarNomCliO ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String Combo_serdes_Selectedvalue_get ;
   private String Combo_clicoddes_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV37SerOri ;
   private String AV17ColOri ;
   private String AV7BarNomCliO ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV18EmprCod ;
   private String A65ArtCod ;
   private String Combo_clicoddes_Cls ;
   private String Combo_clicoddes_Selectedvalue_set ;
   private String Combo_serdes_Cls ;
   private String Combo_serdes_Selectedvalue_set ;
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
   private String grpUnnamedgroup6_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavClicodori_Internalname ;
   private String edtavClicodori_Jsonclick ;
   private String edtavSerori_Internalname ;
   private String edtavSerori_Jsonclick ;
   private String edtavColori_Internalname ;
   private String edtavColori_Jsonclick ;
   private String edtavColnumori_Internalname ;
   private String edtavColnumori_Jsonclick ;
   private String edtavTipcolori_Internalname ;
   private String edtavTipcolori_Jsonclick ;
   private String edtavBarnomclio_Internalname ;
   private String edtavBarnomclio_Jsonclick ;
   private String edtavBarnumclio_Internalname ;
   private String edtavBarnumclio_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavMsgbloqueadocolor_Internalname ;
   private String TempTags ;
   private String edtavMsgbloqueadocolor_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String grpUnnamedgroup10_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String divTablesplittedclicoddes_Internalname ;
   private String lblTextblockcombo_clicoddes_Internalname ;
   private String lblTextblockcombo_clicoddes_Jsonclick ;
   private String Combo_clicoddes_Caption ;
   private String Combo_clicoddes_Internalname ;
   private String divTablesplittedserdes_Internalname ;
   private String lblTextblockcombo_serdes_Internalname ;
   private String lblTextblockcombo_serdes_Jsonclick ;
   private String Combo_serdes_Caption ;
   private String Combo_serdes_Internalname ;
   private String edtavColdes_Internalname ;
   private String AV14ColDes ;
   private String edtavColdes_Jsonclick ;
   private String edtavColnumdes_Internalname ;
   private String edtavColnumdes_Jsonclick ;
   private String edtavTipcoldes_Internalname ;
   private String edtavTipcoldes_Jsonclick ;
   private String edtavBarnomclid_Internalname ;
   private String AV6BarNomCliD ;
   private String edtavBarnomclid_Jsonclick ;
   private String edtavBarnumclid_Internalname ;
   private String edtavBarnumclid_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnsalir_Internalname ;
   private String bttBtnsalir_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicoddes_Internalname ;
   private String edtavClicoddes_Jsonclick ;
   private String edtavSerdes_Internalname ;
   private String AV36SerDes ;
   private String edtavSerdes_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String AV38Station ;
   private String AV19EmprNom ;
   private String AV41UsurCod ;
   private String AV33Msg5 ;
   private String AV34Msg6 ;
   private String AV35Msg7 ;
   private String AV25ForPro ;
   private String AV23ForBlo ;
   private String AV45var_clinom ;
   private String GXt_char1 ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char16[] ;
   private String Gx_msg ;
   private String A69ArtDsc ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Combo_clicoddes_Emptyitem ;
   private boolean Combo_serdes_Emptyitem ;
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
   private boolean n69ArtDsc ;
   private boolean n2838ForRelBan ;
   private boolean n3072ArtObsLon ;
   private String AV5ArtObslon ;
   private String A3072ArtObsLon ;
   private String A13751ArtCDsc ;
   private String AV42Msgbloqueadocolor ;
   private String A13735CliCNom ;
   private String AV13CliObs ;
   private String A3629CliObs ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicoddes ;
   private com.genexus.webpanels.GXUserControl ucCombo_serdes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private HTMLChoice cmbavEquiv ;
   private IDataStoreProvider pr_default ;
   private String[] H00SB2_A396EmprCod ;
   private String[] H00SB3_A396EmprCod ;
   private int[] H00SB3_A252CliCod ;
   private String[] H00SB3_A69ArtDsc ;
   private boolean[] H00SB3_n69ArtDsc ;
   private String[] H00SB3_A65ArtCod ;
   private String[] H00SB4_A396EmprCod ;
   private String[] H00SB4_A10045CliAct ;
   private String[] H00SB4_A13735CliCNom ;
   private int[] H00SB4_A252CliCod ;
   private String[] H00SB4_A279CliNom ;
   private String[] H00SB5_A396EmprCod ;
   private byte[] H00SB5_A831TipColCod ;
   private int[] H00SB5_A483ForColNum ;
   private String[] H00SB5_A482ForColNom ;
   private String[] H00SB5_A494ForSer ;
   private int[] H00SB5_A252CliCod ;
   private int[] H00SB5_A486ForNumCol ;
   private java.math.BigDecimal[] H00SB5_A2838ForRelBan ;
   private boolean[] H00SB5_n2838ForRelBan ;
   private String[] H00SB5_A3629CliObs ;
   private String[] H00SB6_A3072ArtObsLon ;
   private boolean[] H00SB6_n3072ArtObsLon ;
   private String[] H00SB6_A396EmprCod ;
   private String[] H00SB6_A65ArtCod ;
   private int[] H00SB6_A252CliCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV47CliCodDes_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV49SerDes_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV48Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV50DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class webduplicarformula__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00SB2", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00SB3", "SELECT EmprCod, CliCod, ArtDsc, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00SB4", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00SB5", "SELECT T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.ForNumCol, T1.ForRelBan, T2.CliObs FROM (TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00SB6", "SELECT ArtObsLon, EmprCod, ArtCod, CliCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((int[]) buf[4])[0] = rslt.getInt(4);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

