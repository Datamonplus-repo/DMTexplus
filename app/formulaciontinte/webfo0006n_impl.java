package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webfo0006n_impl extends GXDataArea
{
   public webfo0006n_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webfo0006n_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webfo0006n_impl.class ));
   }

   public webfo0006n_impl( int remoteHandle ,
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
               AV6CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod), 6, 0));
               AV7ForSer = httpContext.GetPar( "ForSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7ForSer", AV7ForSer);
               AV8ForColNom = httpContext.GetPar( "ForColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8ForColNom", AV8ForColNom);
               AV9ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ForColNum), 6, 0));
               AV10TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10TipColCod), 2, 0));
               AV11ForRelBan = CommonUtil.decimalVal( httpContext.GetPar( "ForRelBan"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11ForRelBan", GXutil.ltrimstr( AV11ForRelBan, 7, 2));
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
      paSA2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startSA2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.webfo0006n", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV7ForSer)),GXutil.URLEncode(GXutil.rtrim(AV8ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV9ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10TipColCod,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV11ForRelBan))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForRelBan"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORMATO2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29Formato2), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPML", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14Artpml), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV54VolMul), "ZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD_DATA", AV57MaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD_DATA", AV57MaqCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC", GXutil.rtrim( AV33maqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORMATO2", GXutil.ltrim( localUtil.ntoc( AV29Formato2, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORMATO2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29Formato2), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTKILO", GXutil.ltrim( localUtil.ntoc( AV49TotKilo, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLIDESTINO", GXutil.ltrim( localUtil.ntoc( AV17CliDestino, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQVOLRES", GXutil.ltrim( localUtil.ntoc( A2801MaqVolRes, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQTINTIP", GXutil.rtrim( A619MaqTinTip));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORRELBAN", GXutil.ltrim( localUtil.ntoc( AV11ForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTPML", GXutil.ltrim( localUtil.ntoc( AV14Artpml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPML", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14Artpml), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLMUL", GXutil.ltrim( localUtil.ntoc( AV54VolMul, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV54VolMul), "ZZZZ9")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Cls", GXutil.rtrim( Combo_maqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_maqcod_Selectedvalue_set));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Width", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autowidth", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoheight", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Cls", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Title", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsible", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsed", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Iconposition", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Width", GXutil.rtrim( Dvpanel_panel_filtros_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autowidth", GXutil.booltostr( Dvpanel_panel_filtros_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoheight", GXutil.booltostr( Dvpanel_panel_filtros_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Cls", GXutil.rtrim( Dvpanel_panel_filtros_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Title", GXutil.rtrim( Dvpanel_panel_filtros_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsible", GXutil.booltostr( Dvpanel_panel_filtros_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsed", GXutil.booltostr( Dvpanel_panel_filtros_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtros_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Iconposition", GXutil.rtrim( Dvpanel_panel_filtros_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtros_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
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
         weSA2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtSA2( ) ;
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
      return formatLink("app.formulaciontinte.webfo0006n", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV7ForSer)),GXutil.URLEncode(GXutil.rtrim(AV8ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV9ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10TipColCod,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV11ForRelBan))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForRelBan"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.WebFO0006n" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Simulacion Formula", "") ;
   }

   public void wbSA0( )
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
         ucDvpanel_panel_filtros.setProperty("Width", Dvpanel_panel_filtros_Width);
         ucDvpanel_panel_filtros.setProperty("AutoWidth", Dvpanel_panel_filtros_Autowidth);
         ucDvpanel_panel_filtros.setProperty("AutoHeight", Dvpanel_panel_filtros_Autoheight);
         ucDvpanel_panel_filtros.setProperty("Cls", Dvpanel_panel_filtros_Cls);
         ucDvpanel_panel_filtros.setProperty("Title", Dvpanel_panel_filtros_Title);
         ucDvpanel_panel_filtros.setProperty("Collapsible", Dvpanel_panel_filtros_Collapsible);
         ucDvpanel_panel_filtros.setProperty("Collapsed", Dvpanel_panel_filtros_Collapsed);
         ucDvpanel_panel_filtros.setProperty("ShowCollapseIcon", Dvpanel_panel_filtros_Showcollapseicon);
         ucDvpanel_panel_filtros.setProperty("IconPosition", Dvpanel_panel_filtros_Iconposition);
         ucDvpanel_panel_filtros.setProperty("AutoScroll", Dvpanel_panel_filtros_Autoscroll);
         ucDvpanel_panel_filtros.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtros_Internalname, "DVPANEL_PANEL_FILTROSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSContainer"+"Panel_Filtros"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_filtrosgenerales.setProperty("Width", Dvpanel_panel_filtrosgenerales_Width);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoWidth", Dvpanel_panel_filtrosgenerales_Autowidth);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoHeight", Dvpanel_panel_filtrosgenerales_Autoheight);
         ucDvpanel_panel_filtrosgenerales.setProperty("Cls", Dvpanel_panel_filtrosgenerales_Cls);
         ucDvpanel_panel_filtrosgenerales.setProperty("Title", Dvpanel_panel_filtrosgenerales_Title);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsible", Dvpanel_panel_filtrosgenerales_Collapsible);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsed", Dvpanel_panel_filtrosgenerales_Collapsed);
         ucDvpanel_panel_filtrosgenerales.setProperty("ShowCollapseIcon", Dvpanel_panel_filtrosgenerales_Showcollapseicon);
         ucDvpanel_panel_filtrosgenerales.setProperty("IconPosition", Dvpanel_panel_filtrosgenerales_Iconposition);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoScroll", Dvpanel_panel_filtrosgenerales_Autoscroll);
         ucDvpanel_panel_filtrosgenerales.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtrosgenerales_Internalname, "DVPANEL_PANEL_FILTROSGENERALESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSGENERALESContainer"+"Panel_FiltrosGenerales"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "PanelNoHeader", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV6CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\WebFO0006n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForser_Internalname, GXutil.rtrim( AV7ForSer), GXutil.rtrim( localUtil.format( AV7ForSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\WebFO0006n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnom_Internalname, GXutil.rtrim( AV8ForColNom), GXutil.rtrim( localUtil.format( AV8ForColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\WebFO0006n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV9ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\WebFO0006n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipcolcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipcolcod_Internalname, httpContext.getMessage( "Tc", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcolcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV10TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipcolcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10TipColCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV10TipColCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcolcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipcolcod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\WebFO0006n.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcod_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblockcombo_maqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\WebFO0006n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcod.setProperty("Caption", Combo_maqcod_Caption);
         ucCombo_maqcod.setProperty("Cls", Combo_maqcod_Cls);
         ucCombo_maqcod.setProperty("DropDownOptionsData", AV57MaqCod_Data);
         ucCombo_maqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod_Internalname, "COMBO_MAQCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqvolres_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqvolres_Internalname, httpContext.getMessage( "Volumen Residual", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqvolres_Internalname, GXutil.ltrim( localUtil.ntoc( AV35MaqVolRes, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqvolres_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV35MaqVolRes), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV35MaqVolRes), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqvolres_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqvolres_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\WebFO0006n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqtintip_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqtintip_Internalname, httpContext.getMessage( "Tipo Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqtintip_Internalname, GXutil.rtrim( AV34maqTinTip), GXutil.rtrim( localUtil.format( AV34maqTinTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqtintip_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqtintip_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\WebFO0006n.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRb_Internalname, httpContext.getMessage( "Rb", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRb_Internalname, GXutil.ltrim( localUtil.ntoc( AV42Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRb_Enabled!=0) ? localUtil.format( AV42Rb, "ZZZ9.99") : localUtil.format( AV42Rb, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRb_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\WebFO0006n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotkilos_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotkilos_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotkilos_Internalname, GXutil.ltrim( localUtil.ntoc( AV50TotKilos, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotkilos_Enabled!=0) ? localUtil.format( AV50TotKilos, "ZZZZZZ9.99") : localUtil.format( AV50TotKilos, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotkilos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotkilos_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\WebFO0006n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotmetros_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotmetros_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotmetros_Internalname, GXutil.ltrim( localUtil.ntoc( AV51TotMetros, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotmetros_Enabled!=0) ? localUtil.format( AV51TotMetros, "ZZZZZZ9.99") : localUtil.format( AV51TotMetros, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotmetros_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotmetros_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\WebFO0006n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFacabs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFacabs_Internalname, httpContext.getMessage( "Factor Abs.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFacabs_Internalname, GXutil.ltrim( localUtil.ntoc( AV26FacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFacabs_Enabled!=0) ? localUtil.format( AV26FacAbs, "ZZ9.99") : localUtil.format( AV26FacAbs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFacabs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFacabs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\WebFO0006n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVolumen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavVolumen_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavVolumen_Internalname, GXutil.ltrim( localUtil.ntoc( AV55Volumen, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavVolumen_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV55Volumen), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV55Volumen), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVolumen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavVolumen_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\WebFO0006n.htm");
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
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup7_Internalname, httpContext.getMessage( "Incrementos", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_FormulacionTinte\\WebFO0006n.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavIncre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIncre_Internalname, httpContext.getMessage( "Incremento (%)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIncre_Internalname, GXutil.ltrim( localUtil.ntoc( AV31Incre, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIncre_Enabled!=0) ? localUtil.format( AV31Incre, "ZZ9.99") : localUtil.format( AV31Incre, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,108);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIncre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIncre_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\WebFO0006n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPorquebra_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPorquebra_Internalname, httpContext.getMessage( "Merma (%)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPorquebra_Internalname, GXutil.ltrim( localUtil.ntoc( AV38PorQuebra, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPorquebra_Enabled!=0) ? localUtil.format( AV38PorQuebra, "ZZ9.99") : localUtil.format( AV38PorQuebra, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,112);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPorquebra_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPorquebra_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\WebFO0006n.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\WebFO0006n.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsalir_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtnsalir_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSALIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\WebFO0006n.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, GXutil.rtrim( AV32MaqCod), GXutil.rtrim( localUtil.format( AV32MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcod_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\WebFO0006n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startSA2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Simulacion Formula", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupSA0( ) ;
   }

   public void wsSA2( )
   {
      startSA2( ) ;
      evtSA2( ) ;
   }

   public void evtSA2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_MAQCOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e11SA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e12SA2 ();
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
                                 e13SA2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSALIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSalir' */
                           e14SA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMAQCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15SA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFACABS.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16SA2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e17SA2 ();
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

   public void weSA2( )
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

   public void paSA2( )
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
            GX_FocusControl = edtavMaqvolres_Internalname ;
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
      rfSA2( ) ;
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
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavForser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForser_Enabled), 5, 0), true);
      edtavForcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForcolnom_Enabled), 5, 0), true);
      edtavForcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForcolnum_Enabled), 5, 0), true);
      edtavTipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcolcod_Enabled), 5, 0), true);
      edtavMaqtintip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqtintip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqtintip_Enabled), 5, 0), true);
   }

   public void rfSA2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e17SA2 ();
         wbSA0( ) ;
      }
   }

   public void send_integrity_lvl_hashesSA2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vFORMATO2", GXutil.ltrim( localUtil.ntoc( AV29Formato2, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORMATO2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29Formato2), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTPML", GXutil.ltrim( localUtil.ntoc( AV14Artpml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPML", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14Artpml), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLMUL", GXutil.ltrim( localUtil.ntoc( AV54VolMul, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV54VolMul), "ZZZZ9")));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavForser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForser_Enabled), 5, 0), true);
      edtavForcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForcolnom_Enabled), 5, 0), true);
      edtavForcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForcolnum_Enabled), 5, 0), true);
      edtavTipcolcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcolcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcolcod_Enabled), 5, 0), true);
      edtavMaqtintip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqtintip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqtintip_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupSA0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12SA2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD_DATA"), AV57MaqCod_Data);
         /* Read saved values. */
         AV14Artpml = (short)(localUtil.ctol( httpContext.cgiGet( "vARTPML"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Combo_maqcod_Cls = httpContext.cgiGet( "COMBO_MAQCOD_Cls") ;
         Combo_maqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_set") ;
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
         Dvpanel_panel_filtrosgenerales_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Width") ;
         Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autowidth")) ;
         Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoheight")) ;
         Dvpanel_panel_filtrosgenerales_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Cls") ;
         Dvpanel_panel_filtrosgenerales_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Title") ;
         Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsible")) ;
         Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsed")) ;
         Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon")) ;
         Dvpanel_panel_filtrosgenerales_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Iconposition") ;
         Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll")) ;
         Dvpanel_panel_filtros_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Width") ;
         Dvpanel_panel_filtros_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autowidth")) ;
         Dvpanel_panel_filtros_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoheight")) ;
         Dvpanel_panel_filtros_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Cls") ;
         Dvpanel_panel_filtros_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Title") ;
         Dvpanel_panel_filtros_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsible")) ;
         Dvpanel_panel_filtros_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsed")) ;
         Dvpanel_panel_filtros_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Showcollapseicon")) ;
         Dvpanel_panel_filtros_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Iconposition") ;
         Dvpanel_panel_filtros_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoscroll")) ;
         Combo_maqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_get") ;
         /* Read variables values. */
         AV6CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod), 6, 0));
         AV7ForSer = httpContext.cgiGet( edtavForser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7ForSer", AV7ForSer);
         AV8ForColNom = httpContext.cgiGet( edtavForcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8ForColNom", AV8ForColNom);
         AV9ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavForcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ForColNum), 6, 0));
         AV10TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTipcolcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10TipColCod), 2, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolres_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolres_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQVOLRES");
            GX_FocusControl = edtavMaqvolres_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35MaqVolRes = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35MaqVolRes), 5, 0));
         }
         else
         {
            AV35MaqVolRes = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaqvolres_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35MaqVolRes), 5, 0));
         }
         AV34maqTinTip = httpContext.cgiGet( edtavMaqtintip_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34maqTinTip", AV34maqTinTip);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRB");
            GX_FocusControl = edtavRb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42Rb = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Rb", GXutil.ltrimstr( AV42Rb, 7, 2));
         }
         else
         {
            AV42Rb = localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Rb", GXutil.ltrimstr( AV42Rb, 7, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotkilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotkilos_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTKILOS");
            GX_FocusControl = edtavTotkilos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV50TotKilos = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TotKilos", GXutil.ltrimstr( AV50TotKilos, 10, 2));
         }
         else
         {
            AV50TotKilos = localUtil.ctond( httpContext.cgiGet( edtavTotkilos_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TotKilos", GXutil.ltrimstr( AV50TotKilos, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotmetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotmetros_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTMETROS");
            GX_FocusControl = edtavTotmetros_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV51TotMetros = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TotMetros", GXutil.ltrimstr( AV51TotMetros, 10, 2));
         }
         else
         {
            AV51TotMetros = localUtil.ctond( httpContext.cgiGet( edtavTotmetros_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TotMetros", GXutil.ltrimstr( AV51TotMetros, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavFacabs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFacabs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACABS");
            GX_FocusControl = edtavFacabs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV26FacAbs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26FacAbs", GXutil.ltrimstr( AV26FacAbs, 6, 2));
         }
         else
         {
            AV26FacAbs = localUtil.ctond( httpContext.cgiGet( edtavFacabs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26FacAbs", GXutil.ltrimstr( AV26FacAbs, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavVolumen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavVolumen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVOLUMEN");
            GX_FocusControl = edtavVolumen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV55Volumen = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Volumen), 5, 0));
         }
         else
         {
            AV55Volumen = (int)(localUtil.ctol( httpContext.cgiGet( edtavVolumen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Volumen), 5, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavIncre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavIncre_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINCRE");
            GX_FocusControl = edtavIncre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV31Incre = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31Incre", GXutil.ltrimstr( AV31Incre, 6, 2));
         }
         else
         {
            AV31Incre = localUtil.ctond( httpContext.cgiGet( edtavIncre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31Incre", GXutil.ltrimstr( AV31Incre, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPorquebra_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPorquebra_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPORQUEBRA");
            GX_FocusControl = edtavPorquebra_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38PorQuebra = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38PorQuebra", GXutil.ltrimstr( AV38PorQuebra, 6, 2));
         }
         else
         {
            AV38PorQuebra = localUtil.ctond( httpContext.cgiGet( edtavPorquebra_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38PorQuebra", GXutil.ltrimstr( AV38PorQuebra, 6, 2));
         }
         AV32MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32MaqCod", AV32MaqCod);
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
      e12SA2 ();
      if (returnInSub) return;
   }

   public void e12SA2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webfo0006n_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV22EmprNom ;
      GXv_char4[0] = AV52UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      webfo0006n_impl.this.AV5EmprCod = GXv_char2[0] ;
      webfo0006n_impl.this.AV22EmprNom = GXv_char3[0] ;
      webfo0006n_impl.this.AV52UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      AV42Rb = AV11ForRelBan ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Rb", GXutil.ltrimstr( AV42Rb, 7, 2));
      AV42Rb = ((AV42Rb.doubleValue()==0) ? DecimalUtil.doubleToDec(10) : AV11ForRelBan) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Rb", GXutil.ltrimstr( AV42Rb, 7, 2));
      AV55Volumen = (int)(DecimalUtil.decToDouble(AV42Rb)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Volumen), 5, 0));
      GXt_int5 = AV54VolMul ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "VOLMUL", ""), GXv_int6) ;
      webfo0006n_impl.this.GXt_int5 = GXv_int6[0] ;
      AV54VolMul = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54VolMul", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54VolMul), 5, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV54VolMul), "ZZZZ9")));
      AV26FacAbs = DecimalUtil.doubleToDec(100) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26FacAbs", GXutil.ltrimstr( AV26FacAbs, 6, 2));
      GXt_int7 = AV37PmlC ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "PMLCRU", ""), GXv_int8) ;
      webfo0006n_impl.this.GXt_int7 = GXv_int8[0] ;
      AV37PmlC = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37PmlC", GXutil.str( AV37PmlC, 1, 0));
      GXt_int7 = AV13anahuac ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "ANAHUA", ""), GXv_int8) ;
      webfo0006n_impl.this.GXt_int7 = GXv_int8[0] ;
      AV13anahuac = GXt_int7 ;
      AV29Formato2 = (byte)(((AV13anahuac==1) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Formato2", GXutil.str( AV29Formato2, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORMATO2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29Formato2), "9")));
      /* Execute user subroutine: 'LFORMU' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ARTICU' */
      S122 ();
      if (returnInSub) return;
      AV51TotMetros = ((AV14Artpml>0) ? AV50TotKilos.multiply(DecimalUtil.doubleToDec(1000)).divide(DecimalUtil.doubleToDec(AV14Artpml), 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TotMetros", GXutil.ltrimstr( AV51TotMetros, 10, 2));
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webfo0006n_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV5EmprCod ;
      GXv_char3[0] = AV22EmprNom ;
      GXv_char2[0] = AV52UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      webfo0006n_impl.this.AV5EmprCod = GXv_char4[0] ;
      webfo0006n_impl.this.AV22EmprNom = GXv_char3[0] ;
      webfo0006n_impl.this.AV52UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      edtavMaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S132 ();
      if (returnInSub) return;
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e13SA2 ();
      if (returnInSub) return;
   }

   public void e13SA2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'MAQUIN' */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV33maqDsc, httpContext.getMessage( "Error", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso.Codigo Maquina Inexistente ¡¡¡", ""));
      }
      if ( AV55Volumen == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No hay Volumen", ""));
         GX_FocusControl = edtavVolumen_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( AV50TotKilos.doubleValue() == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "No hay Kilos", ""));
            GX_FocusControl = edtavTotkilos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( ( GXutil.strcmp(AV34maqTinTip, httpContext.getMessage( "CO", "")) == 0 ) && ( AV26FacAbs.doubleValue() == 0 ) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "No hay Factor de Absorcion", ""));
               GX_FocusControl = edtavFacabs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               System.out.println( httpContext.getMessage( "Proceso Simulacion en proceso...", "") );
               GXv_char4[0] = AV5EmprCod ;
               GXv_int6[0] = AV6CliCod ;
               GXv_char3[0] = AV7ForSer ;
               GXv_char2[0] = AV8ForColNom ;
               GXv_int9[0] = AV9ForColNum ;
               GXv_int8[0] = AV10TipColCod ;
               GXv_decimal10[0] = AV50TotKilos ;
               GXv_int11[0] = AV55Volumen ;
               GXv_char12[0] = AV32MaqCod ;
               GXv_decimal13[0] = AV31Incre ;
               new app.psimulax(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_char2, GXv_int9, GXv_int8, GXv_decimal10, GXv_int11, GXv_char12, GXv_decimal13) ;
               webfo0006n_impl.this.AV5EmprCod = GXv_char4[0] ;
               webfo0006n_impl.this.AV6CliCod = GXv_int6[0] ;
               webfo0006n_impl.this.AV7ForSer = GXv_char3[0] ;
               webfo0006n_impl.this.AV8ForColNom = GXv_char2[0] ;
               webfo0006n_impl.this.AV9ForColNum = GXv_int9[0] ;
               webfo0006n_impl.this.AV10TipColCod = GXv_int8[0] ;
               webfo0006n_impl.this.AV50TotKilos = GXv_decimal10[0] ;
               webfo0006n_impl.this.AV55Volumen = GXv_int11[0] ;
               webfo0006n_impl.this.AV32MaqCod = GXv_char12[0] ;
               webfo0006n_impl.this.AV31Incre = GXv_decimal13[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod), 6, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV7ForSer", AV7ForSer);
               httpContext.ajax_rsp_assign_attri("", false, "AV8ForColNom", AV8ForColNom);
               httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ForColNum), 6, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV10TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10TipColCod), 2, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV50TotKilos", GXutil.ltrimstr( AV50TotKilos, 10, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV55Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Volumen), 5, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV32MaqCod", AV32MaqCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV31Incre", GXutil.ltrimstr( AV31Incre, 6, 2));
               if ( AV29Formato2 == 0 )
               {
                  httpContext.popup(formatLink("app.formulaciontinte.rsimulaz", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV12Station)),GXutil.URLEncode(GXutil.ltrimstr(AV6CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV7ForSer)),GXutil.URLEncode(GXutil.rtrim(AV8ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV9ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10TipColCod,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV50TotKilos)),GXutil.URLEncode(GXutil.ltrimstr(AV55Volumen,5,0)),GXutil.URLEncode(GXutil.rtrim(AV32MaqCod)),GXutil.URLEncode(DecimalUtil.decToString(AV31Incre)),GXutil.URLEncode(DecimalUtil.decToString(AV49TotKilo)),GXutil.URLEncode(DecimalUtil.decToString(AV38PorQuebra)),GXutil.URLEncode(DecimalUtil.decToString(AV51TotMetros))}, new String[] {"EmprCod","Workstat","CliCod","ForSer","ForColNom","ForColNum","TipColCod","TotKilos","Volumen","MaqCod","Incre","TotKilo","Por_quebra","TotMts"}) , new Object[] {"AV5EmprCod","AV12Station","AV6CliCod","AV7ForSer","AV8ForColNom","AV9ForColNum","AV10TipColCod","AV50TotKilos","AV55Volumen","AV32MaqCod","AV31Incre","AV49TotKilo","AV38PorQuebra","AV51TotMetros"});
               }
               else
               {
                  httpContext.popup(formatLink("app.pprc165", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV12Station)),GXutil.URLEncode(GXutil.ltrimstr(AV6CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV7ForSer)),GXutil.URLEncode(GXutil.rtrim(AV8ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV9ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10TipColCod,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV50TotKilos)),GXutil.URLEncode(GXutil.ltrimstr(AV55Volumen,5,0)),GXutil.URLEncode(GXutil.rtrim(AV32MaqCod)),GXutil.URLEncode(DecimalUtil.decToString(AV31Incre)),GXutil.URLEncode(DecimalUtil.decToString(AV49TotKilo)),GXutil.URLEncode(DecimalUtil.decToString(AV38PorQuebra)),GXutil.URLEncode(DecimalUtil.decToString(AV51TotMetros)),GXutil.URLEncode(GXutil.ltrimstr(AV17CliDestino,6,0))}, new String[] {"EmprCod","Workstat","CliCod","ForSer","ForColNom","ForColNum","TipColCod","TotKilos","Volumen","MaqCod","Incre","TotKilo","Por_quebra","TotMts","ClicodDestino"}) , new Object[] {"AV5EmprCod","AV12Station","AV6CliCod","AV7ForSer","AV8ForColNom","AV9ForColNum","AV10TipColCod","AV50TotKilos","AV55Volumen","AV32MaqCod","AV31Incre","AV49TotKilo","AV38PorQuebra","AV51TotMetros","AV17CliDestino"});
               }
               System.out.println( httpContext.getMessage( "Proceso Simulacion finalizado...", "") );
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e14SA2( )
   {
      /* 'DoSalir' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV5EmprCod,Integer.valueOf(AV6CliCod),AV7ForSer,AV8ForColNom,Integer.valueOf(AV9ForColNum),Byte.valueOf(AV10TipColCod),AV11ForRelBan});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5EmprCod","AV6CliCod","AV7ForSer","AV8ForColNom","AV9ForColNum","AV10TipColCod","AV11ForRelBan"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e11SA2( )
   {
      /* Combo_maqcod_Onoptionclicked Routine */
      returnInSub = false ;
      AV32MaqCod = Combo_maqcod_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32MaqCod", AV32MaqCod);
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'LOADCOMBOMAQCOD' Routine */
      returnInSub = false ;
      /* Using cursor H00SA2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13734MaqCDsc = H00SA2_A13734MaqCDsc[0] ;
         A602MaqCod = H00SA2_A602MaqCod[0] ;
         A606MaqDsc = H00SA2_A606MaqDsc[0] ;
         n606MaqDsc = H00SA2_n606MaqDsc[0] ;
         AV58Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV58Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV58Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13734MaqCDsc );
         AV57MaqCod_Data.add(AV58Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_maqcod_Selectedvalue_set = AV32MaqCod ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
   }

   public void e15SA2( )
   {
      /* Maqcod_Isvalid Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'MAQUIN' */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV33maqDsc, httpContext.getMessage( "Error", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Maquina NO valida", ""));
         GX_FocusControl = edtavMaqcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void e16SA2( )
   {
      /* Facabs_Isvalid Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV34maqTinTip, httpContext.getMessage( "CO", "")) == 0 )
      {
         GXt_int5 = AV55Volumen ;
         GXv_decimal13[0] = AV26FacAbs ;
         GXv_int11[0] = AV35MaqVolRes ;
         GXv_int8[0] = (byte)(AV54VolMul) ;
         GXv_decimal10[0] = AV50TotKilos ;
         GXv_int9[0] = GXt_int5 ;
         new app.pcalvol(remoteHandle, context).execute( GXv_decimal13, GXv_int11, GXv_int8, GXv_decimal10, GXv_int9) ;
         webfo0006n_impl.this.AV26FacAbs = GXv_decimal13[0] ;
         webfo0006n_impl.this.AV35MaqVolRes = GXv_int11[0] ;
         webfo0006n_impl.this.AV54VolMul = GXv_int8[0] ;
         webfo0006n_impl.this.AV50TotKilos = GXv_decimal10[0] ;
         webfo0006n_impl.this.GXt_int5 = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26FacAbs", GXutil.ltrimstr( AV26FacAbs, 6, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV35MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35MaqVolRes), 5, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV54VolMul", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54VolMul), 5, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV54VolMul), "ZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, "AV50TotKilos", GXutil.ltrimstr( AV50TotKilos, 10, 2));
         AV55Volumen = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Volumen), 5, 0));
      }
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV35MaqVolRes = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35MaqVolRes), 5, 0));
      AV34maqTinTip = GXutil.space( (short)(2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34maqTinTip", AV34maqTinTip);
      AV33maqDsc = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33maqDsc", AV33maqDsc);
      if ( ! (GXutil.strcmp("", AV32MaqCod)==0) )
      {
         AV62GXLvl188 = (byte)(0) ;
         /* Using cursor H00SA3 */
         pr_default.execute(1, new Object[] {AV5EmprCod, AV32MaqCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A602MaqCod = H00SA3_A602MaqCod[0] ;
            A396EmprCod = H00SA3_A396EmprCod[0] ;
            A2801MaqVolRes = H00SA3_A2801MaqVolRes[0] ;
            n2801MaqVolRes = H00SA3_n2801MaqVolRes[0] ;
            A619MaqTinTip = H00SA3_A619MaqTinTip[0] ;
            n619MaqTinTip = H00SA3_n619MaqTinTip[0] ;
            AV62GXLvl188 = (byte)(1) ;
            AV35MaqVolRes = A2801MaqVolRes ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35MaqVolRes), 5, 0));
            AV34maqTinTip = A619MaqTinTip ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34maqTinTip", AV34maqTinTip);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV62GXLvl188 == 0 )
         {
            AV33maqDsc = httpContext.getMessage( "Error", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33maqDsc", AV33maqDsc);
         }
      }
   }

   public void S112( )
   {
      /* 'LFORMU' Routine */
      returnInSub = false ;
      AV36MsgP = " " ;
      AV40PqRb = (byte)(0) ;
      AV39PqFa = (byte)(0) ;
      /* Using cursor H00SA4 */
      pr_default.execute(2, new Object[] {AV5EmprCod, Integer.valueOf(AV6CliCod), AV7ForSer, AV8ForColNom, Integer.valueOf(AV9ForColNum), Byte.valueOf(AV10TipColCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A831TipColCod = H00SA4_A831TipColCod[0] ;
         A483ForColNum = H00SA4_A483ForColNum[0] ;
         A482ForColNom = H00SA4_A482ForColNom[0] ;
         A494ForSer = H00SA4_A494ForSer[0] ;
         A252CliCod = H00SA4_A252CliCod[0] ;
         A396EmprCod = H00SA4_A396EmprCod[0] ;
         A6549ProForFR = H00SA4_A6549ProForFR[0] ;
         A1160ProForL = H00SA4_A1160ProForL[0] ;
         if ( GXutil.strcmp(A6549ProForFR, httpContext.getMessage( "R", "")) == 0 )
         {
            if ( GXutil.strcmp(AV36MsgP, " ") == 0 )
            {
               AV36MsgP = httpContext.getMessage( "Proceso Quimico por RB", "") ;
               AV40PqRb = (byte)(1) ;
            }
            if ( ( GXutil.strcmp(AV36MsgP, " ") != 0 ) && ( AV40PqRb == 0 ) )
            {
               AV36MsgP += httpContext.getMessage( " Proceso Quimico por RB", "") ;
               AV40PqRb = (byte)(1) ;
            }
         }
         if ( GXutil.strcmp(A6549ProForFR, httpContext.getMessage( "F", "")) == 0 )
         {
            if ( GXutil.strcmp(AV36MsgP, " ") == 0 )
            {
               AV36MsgP = httpContext.getMessage( "Proceso Quimico por FA", "") ;
               AV39PqFa = (byte)(1) ;
            }
            if ( ( GXutil.strcmp(AV36MsgP, " ") != 0 ) && ( AV39PqFa == 0 ) )
            {
               AV36MsgP += httpContext.getMessage( " Proceso Quimico por FA", "") ;
               AV39PqFa = (byte)(1) ;
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S122( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV14Artpml = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Artpml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Artpml), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPML", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14Artpml), "ZZZ9")));
      /* Using cursor H00SA5 */
      pr_default.execute(3, new Object[] {AV5EmprCod, Integer.valueOf(AV6CliCod), AV7ForSer});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A65ArtCod = H00SA5_A65ArtCod[0] ;
         A252CliCod = H00SA5_A252CliCod[0] ;
         A396EmprCod = H00SA5_A396EmprCod[0] ;
         A1148ArtPml = H00SA5_A1148ArtPml[0] ;
         n1148ArtPml = H00SA5_n1148ArtPml[0] ;
         A7415ArtPmlCru = H00SA5_A7415ArtPmlCru[0] ;
         n7415ArtPmlCru = H00SA5_n7415ArtPmlCru[0] ;
         AV14Artpml = ((AV37PmlC==1) ? A7415ArtPmlCru : A1148ArtPml) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Artpml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Artpml), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTPML", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14Artpml), "ZZZ9")));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void nextLoad( )
   {
   }

   protected void e17SA2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      AV6CliCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCod), 6, 0));
      AV7ForSer = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7ForSer", AV7ForSer);
      AV8ForColNom = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8ForColNom", AV8ForColNom);
      AV9ForColNum = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ForColNum), 6, 0));
      AV10TipColCod = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10TipColCod), 2, 0));
      AV11ForRelBan = (java.math.BigDecimal)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ForRelBan", GXutil.ltrimstr( AV11ForRelBan, 7, 2));
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
      paSA2( ) ;
      wsSA2( ) ;
      weSA2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268171419467", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/webfo0006n.js", "?20268171419467", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavClicod_Internalname = "vCLICOD" ;
      edtavForser_Internalname = "vFORSER" ;
      edtavForcolnom_Internalname = "vFORCOLNOM" ;
      edtavForcolnum_Internalname = "vFORCOLNUM" ;
      edtavTipcolcod_Internalname = "vTIPCOLCOD" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTextblockcombo_maqcod_Internalname = "TEXTBLOCKCOMBO_MAQCOD" ;
      Combo_maqcod_Internalname = "COMBO_MAQCOD" ;
      divTablesplittedmaqcod_Internalname = "TABLESPLITTEDMAQCOD" ;
      edtavMaqvolres_Internalname = "vMAQVOLRES" ;
      edtavMaqtintip_Internalname = "vMAQTINTIP" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavRb_Internalname = "vRB" ;
      edtavTotkilos_Internalname = "vTOTKILOS" ;
      edtavTotmetros_Internalname = "vTOTMETROS" ;
      edtavFacabs_Internalname = "vFACABS" ;
      edtavVolumen_Internalname = "vVOLUMEN" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavIncre_Internalname = "vINCRE" ;
      edtavPorquebra_Internalname = "vPORQUEBRA" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      grpUnnamedgroup7_Internalname = "UNNAMEDGROUP7" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnsalir_Internalname = "BTNSALIR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
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
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Visible = 1 ;
      edtavPorquebra_Jsonclick = "" ;
      edtavPorquebra_Enabled = 1 ;
      edtavIncre_Jsonclick = "" ;
      edtavIncre_Enabled = 1 ;
      edtavVolumen_Jsonclick = "" ;
      edtavVolumen_Enabled = 1 ;
      edtavFacabs_Jsonclick = "" ;
      edtavFacabs_Enabled = 1 ;
      edtavTotmetros_Jsonclick = "" ;
      edtavTotmetros_Enabled = 1 ;
      edtavTotkilos_Jsonclick = "" ;
      edtavTotkilos_Enabled = 1 ;
      edtavRb_Jsonclick = "" ;
      edtavRb_Enabled = 1 ;
      edtavMaqtintip_Jsonclick = "" ;
      edtavMaqtintip_Enabled = 1 ;
      edtavMaqvolres_Jsonclick = "" ;
      edtavMaqvolres_Enabled = 1 ;
      edtavTipcolcod_Jsonclick = "" ;
      edtavTipcolcod_Enabled = 0 ;
      edtavForcolnum_Jsonclick = "" ;
      edtavForcolnum_Enabled = 0 ;
      edtavForcolnom_Jsonclick = "" ;
      edtavForcolnom_Enabled = 0 ;
      edtavForser_Jsonclick = "" ;
      edtavForser_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      Dvpanel_panel_filtros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Iconposition = "Right" ;
      Dvpanel_panel_filtros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Title = httpContext.getMessage( "<i class=\"fas fa-filter\"></i> Filtros", "") ;
      Dvpanel_panel_filtros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Width = "100%" ;
      Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Iconposition = "Right" ;
      Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Title = httpContext.getMessage( "Generales", "") ;
      Dvpanel_panel_filtrosgenerales_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Calculos", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Combo_maqcod_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Color", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Simulacion Formula", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV29Formato2',fld:'vFORMATO2',pic:'9',hsh:true},{av:'AV14Artpml',fld:'vARTPML',pic:'ZZZ9',hsh:true},{av:'AV54VolMul',fld:'vVOLMUL',pic:'ZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e13SA2',iparms:[{av:'AV33maqDsc',fld:'vMAQDSC',pic:''},{av:'AV55Volumen',fld:'vVOLUMEN',pic:'ZZZZ9'},{av:'AV50TotKilos',fld:'vTOTKILOS',pic:'ZZZZZZ9.99'},{av:'AV34maqTinTip',fld:'vMAQTINTIP',pic:''},{av:'AV26FacAbs',fld:'vFACABS',pic:'ZZ9.99'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV7ForSer',fld:'vFORSER',pic:''},{av:'AV8ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV9ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV10TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV32MaqCod',fld:'vMAQCOD',pic:''},{av:'AV31Incre',fld:'vINCRE',pic:'ZZ9.99'},{av:'AV29Formato2',fld:'vFORMATO2',pic:'9',hsh:true},{av:'AV12Station',fld:'vSTATION',pic:''},{av:'AV49TotKilo',fld:'vTOTKILO',pic:'ZZZZZZ9.99'},{av:'AV38PorQuebra',fld:'vPORQUEBRA',pic:'ZZ9.99'},{av:'AV51TotMetros',fld:'vTOTMETROS',pic:'ZZZZZZ9.99'},{av:'AV17CliDestino',fld:'vCLIDESTINO',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A2801MaqVolRes',fld:'MAQVOLRES',pic:'ZZZZ9'},{av:'A619MaqTinTip',fld:'MAQTINTIP',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV31Incre',fld:'vINCRE',pic:'ZZ9.99'},{av:'AV32MaqCod',fld:'vMAQCOD',pic:''},{av:'AV55Volumen',fld:'vVOLUMEN',pic:'ZZZZ9'},{av:'AV50TotKilos',fld:'vTOTKILOS',pic:'ZZZZZZ9.99'},{av:'AV10TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV9ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV8ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV7ForSer',fld:'vFORSER',pic:''},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17CliDestino',fld:'vCLIDESTINO',pic:'ZZZZZ9'},{av:'AV51TotMetros',fld:'vTOTMETROS',pic:'ZZZZZZ9.99'},{av:'AV38PorQuebra',fld:'vPORQUEBRA',pic:'ZZ9.99'},{av:'AV49TotKilo',fld:'vTOTKILO',pic:'ZZZZZZ9.99'},{av:'AV12Station',fld:'vSTATION',pic:''},{av:'AV35MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV34maqTinTip',fld:'vMAQTINTIP',pic:''},{av:'AV33maqDsc',fld:'vMAQDSC',pic:''}]}");
      setEventMetadata("'DOSALIR'","{handler:'e14SA2',iparms:[{av:'AV11ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV10TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV9ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV8ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV7ForSer',fld:'vFORSER',pic:''},{av:'AV6CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOSALIR'",",oparms:[]}");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED","{handler:'e11SA2',iparms:[{av:'Combo_maqcod_Selectedvalue_get',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED",",oparms:[{av:'AV32MaqCod',fld:'vMAQCOD',pic:''}]}");
      setEventMetadata("VMAQCOD.ISVALID","{handler:'e15SA2',iparms:[{av:'AV33maqDsc',fld:'vMAQDSC',pic:''},{av:'AV32MaqCod',fld:'vMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A2801MaqVolRes',fld:'MAQVOLRES',pic:'ZZZZ9'},{av:'A619MaqTinTip',fld:'MAQTINTIP',pic:''}]");
      setEventMetadata("VMAQCOD.ISVALID",",oparms:[{av:'AV35MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV34maqTinTip',fld:'vMAQTINTIP',pic:''},{av:'AV33maqDsc',fld:'vMAQDSC',pic:''}]}");
      setEventMetadata("VFACABS.ISVALID","{handler:'e16SA2',iparms:[{av:'AV34maqTinTip',fld:'vMAQTINTIP',pic:''},{av:'AV26FacAbs',fld:'vFACABS',pic:'ZZ9.99'},{av:'AV35MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV54VolMul',fld:'vVOLMUL',pic:'ZZZZ9',hsh:true},{av:'AV50TotKilos',fld:'vTOTKILOS',pic:'ZZZZZZ9.99'}]");
      setEventMetadata("VFACABS.ISVALID",",oparms:[{av:'AV55Volumen',fld:'vVOLUMEN',pic:'ZZZZ9'}]}");
      setEventMetadata("VALIDV_CLICOD","{handler:'validv_Clicod',iparms:[]");
      setEventMetadata("VALIDV_CLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_FORSER","{handler:'validv_Forser',iparms:[]");
      setEventMetadata("VALIDV_FORSER",",oparms:[]}");
      setEventMetadata("VALIDV_FORCOLNOM","{handler:'validv_Forcolnom',iparms:[]");
      setEventMetadata("VALIDV_FORCOLNOM",",oparms:[]}");
      setEventMetadata("VALIDV_FORCOLNUM","{handler:'validv_Forcolnum',iparms:[]");
      setEventMetadata("VALIDV_FORCOLNUM",",oparms:[]}");
      setEventMetadata("VALIDV_TIPCOLCOD","{handler:'validv_Tipcolcod',iparms:[]");
      setEventMetadata("VALIDV_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("VALIDV_MAQCOD","{handler:'validv_Maqcod',iparms:[]");
      setEventMetadata("VALIDV_MAQCOD",",oparms:[]}");
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
      wcpOAV7ForSer = "" ;
      wcpOAV8ForColNom = "" ;
      wcpOAV11ForRelBan = DecimalUtil.ZERO ;
      Combo_maqcod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5EmprCod = "" ;
      AV7ForSer = "" ;
      AV8ForColNom = "" ;
      AV11ForRelBan = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV57MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV33maqDsc = "" ;
      AV12Station = "" ;
      AV49TotKilo = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A619MaqTinTip = "" ;
      Combo_maqcod_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_maqcod_Jsonclick = "" ;
      ucCombo_maqcod = new com.genexus.webpanels.GXUserControl();
      Combo_maqcod_Caption = "" ;
      TempTags = "" ;
      AV34maqTinTip = "" ;
      AV42Rb = DecimalUtil.ZERO ;
      AV50TotKilos = DecimalUtil.ZERO ;
      AV51TotMetros = DecimalUtil.ZERO ;
      AV26FacAbs = DecimalUtil.ZERO ;
      AV31Incre = DecimalUtil.ZERO ;
      AV38PorQuebra = DecimalUtil.ZERO ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnsalir_Jsonclick = "" ;
      AV32MaqCod = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV22EmprNom = "" ;
      AV52UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char12 = new String[1] ;
      scmdbuf = "" ;
      H00SA2_A396EmprCod = new String[] {""} ;
      H00SA2_A13734MaqCDsc = new String[] {""} ;
      H00SA2_A602MaqCod = new String[] {""} ;
      H00SA2_A606MaqDsc = new String[] {""} ;
      H00SA2_n606MaqDsc = new boolean[] {false} ;
      A13734MaqCDsc = "" ;
      A606MaqDsc = "" ;
      AV58Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int11 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int9 = new int[1] ;
      H00SA3_A602MaqCod = new String[] {""} ;
      H00SA3_A396EmprCod = new String[] {""} ;
      H00SA3_A2801MaqVolRes = new int[1] ;
      H00SA3_n2801MaqVolRes = new boolean[] {false} ;
      H00SA3_A619MaqTinTip = new String[] {""} ;
      H00SA3_n619MaqTinTip = new boolean[] {false} ;
      AV36MsgP = "" ;
      H00SA4_A831TipColCod = new byte[1] ;
      H00SA4_A483ForColNum = new int[1] ;
      H00SA4_A482ForColNom = new String[] {""} ;
      H00SA4_A494ForSer = new String[] {""} ;
      H00SA4_A252CliCod = new int[1] ;
      H00SA4_A396EmprCod = new String[] {""} ;
      H00SA4_A6549ProForFR = new String[] {""} ;
      H00SA4_A1160ProForL = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A6549ProForFR = "" ;
      H00SA5_A65ArtCod = new String[] {""} ;
      H00SA5_A252CliCod = new int[1] ;
      H00SA5_A396EmprCod = new String[] {""} ;
      H00SA5_A1148ArtPml = new short[1] ;
      H00SA5_n1148ArtPml = new boolean[] {false} ;
      H00SA5_A7415ArtPmlCru = new short[1] ;
      H00SA5_n7415ArtPmlCru = new boolean[] {false} ;
      A65ArtCod = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.webfo0006n__default(),
         new Object[] {
             new Object[] {
            H00SA2_A396EmprCod, H00SA2_A13734MaqCDsc, H00SA2_A602MaqCod, H00SA2_A606MaqDsc, H00SA2_n606MaqDsc
            }
            , new Object[] {
            H00SA3_A602MaqCod, H00SA3_A396EmprCod, H00SA3_A2801MaqVolRes, H00SA3_n2801MaqVolRes, H00SA3_A619MaqTinTip, H00SA3_n619MaqTinTip
            }
            , new Object[] {
            H00SA4_A831TipColCod, H00SA4_A483ForColNum, H00SA4_A482ForColNom, H00SA4_A494ForSer, H00SA4_A252CliCod, H00SA4_A396EmprCod, H00SA4_A6549ProForFR, H00SA4_A1160ProForL
            }
            , new Object[] {
            H00SA5_A65ArtCod, H00SA5_A252CliCod, H00SA5_A396EmprCod, H00SA5_A1148ArtPml, H00SA5_n1148ArtPml, H00SA5_A7415ArtPmlCru, H00SA5_n7415ArtPmlCru
            }
         }
      );
      AV55Volumen = 10 ;
      AV50TotKilos = DecimalUtil.doubleToDec(1) ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      edtavForser_Enabled = 0 ;
      edtavForcolnom_Enabled = 0 ;
      edtavForcolnum_Enabled = 0 ;
      edtavTipcolcod_Enabled = 0 ;
      edtavMaqtintip_Enabled = 0 ;
   }

   private byte wcpOAV10TipColCod ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV10TipColCod ;
   private byte gxajaxcallmode ;
   private byte AV29Formato2 ;
   private byte nDonePA ;
   private byte AV37PmlC ;
   private byte AV13anahuac ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte AV62GXLvl188 ;
   private byte AV40PqRb ;
   private byte AV39PqFa ;
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
   private short AV14Artpml ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A1160ProForL ;
   private short A1148ArtPml ;
   private short A7415ArtPmlCru ;
   private int wcpOAV6CliCod ;
   private int wcpOAV9ForColNum ;
   private int AV6CliCod ;
   private int AV9ForColNum ;
   private int AV54VolMul ;
   private int AV17CliDestino ;
   private int A2801MaqVolRes ;
   private int edtavClicod_Enabled ;
   private int edtavForser_Enabled ;
   private int edtavForcolnom_Enabled ;
   private int edtavForcolnum_Enabled ;
   private int edtavTipcolcod_Enabled ;
   private int AV35MaqVolRes ;
   private int edtavMaqvolres_Enabled ;
   private int edtavMaqtintip_Enabled ;
   private int edtavRb_Enabled ;
   private int edtavTotkilos_Enabled ;
   private int edtavTotmetros_Enabled ;
   private int edtavFacabs_Enabled ;
   private int AV55Volumen ;
   private int edtavVolumen_Enabled ;
   private int edtavIncre_Enabled ;
   private int edtavPorquebra_Enabled ;
   private int edtavMaqcod_Visible ;
   private int GXv_int6[] ;
   private int GXt_int5 ;
   private int GXv_int11[] ;
   private int GXv_int9[] ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int idxLst ;
   private java.math.BigDecimal wcpOAV11ForRelBan ;
   private java.math.BigDecimal AV11ForRelBan ;
   private java.math.BigDecimal AV49TotKilo ;
   private java.math.BigDecimal AV42Rb ;
   private java.math.BigDecimal AV50TotKilos ;
   private java.math.BigDecimal AV51TotMetros ;
   private java.math.BigDecimal AV26FacAbs ;
   private java.math.BigDecimal AV31Incre ;
   private java.math.BigDecimal AV38PorQuebra ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV7ForSer ;
   private String wcpOAV8ForColNom ;
   private String Combo_maqcod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV5EmprCod ;
   private String AV7ForSer ;
   private String AV8ForColNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV33maqDsc ;
   private String AV12Station ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A619MaqTinTip ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Combo_maqcod_Cls ;
   private String Combo_maqcod_Selectedvalue_set ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_panel_filtrosgenerales_Internalname ;
   private String divPanel_filtrosgenerales_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavForser_Internalname ;
   private String edtavForser_Jsonclick ;
   private String edtavForcolnom_Internalname ;
   private String edtavForcolnom_Jsonclick ;
   private String edtavForcolnum_Internalname ;
   private String edtavForcolnum_Jsonclick ;
   private String edtavTipcolcod_Internalname ;
   private String edtavTipcolcod_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divTablesplittedmaqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Jsonclick ;
   private String Combo_maqcod_Caption ;
   private String Combo_maqcod_Internalname ;
   private String edtavMaqvolres_Internalname ;
   private String TempTags ;
   private String edtavMaqvolres_Jsonclick ;
   private String edtavMaqtintip_Internalname ;
   private String AV34maqTinTip ;
   private String edtavMaqtintip_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavRb_Internalname ;
   private String edtavRb_Jsonclick ;
   private String edtavTotkilos_Internalname ;
   private String edtavTotkilos_Jsonclick ;
   private String edtavTotmetros_Internalname ;
   private String edtavTotmetros_Jsonclick ;
   private String edtavFacabs_Internalname ;
   private String edtavFacabs_Jsonclick ;
   private String edtavVolumen_Internalname ;
   private String edtavVolumen_Jsonclick ;
   private String grpUnnamedgroup7_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtavIncre_Internalname ;
   private String edtavIncre_Jsonclick ;
   private String edtavPorquebra_Internalname ;
   private String edtavPorquebra_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnsalir_Internalname ;
   private String bttBtnsalir_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavMaqcod_Internalname ;
   private String AV32MaqCod ;
   private String edtavMaqcod_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV22EmprNom ;
   private String AV52UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char12[] ;
   private String scmdbuf ;
   private String A606MaqDsc ;
   private String AV36MsgP ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A6549ProForFR ;
   private String A65ArtCod ;
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
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
   private boolean Dvpanel_panel_filtros_Autowidth ;
   private boolean Dvpanel_panel_filtros_Autoheight ;
   private boolean Dvpanel_panel_filtros_Collapsible ;
   private boolean Dvpanel_panel_filtros_Collapsed ;
   private boolean Dvpanel_panel_filtros_Showcollapseicon ;
   private boolean Dvpanel_panel_filtros_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n606MaqDsc ;
   private boolean n2801MaqVolRes ;
   private boolean n619MaqTinTip ;
   private boolean n1148ArtPml ;
   private boolean n7415ArtPmlCru ;
   private String A13734MaqCDsc ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod ;
   private IDataStoreProvider pr_default ;
   private String[] H00SA2_A396EmprCod ;
   private String[] H00SA2_A13734MaqCDsc ;
   private String[] H00SA2_A602MaqCod ;
   private String[] H00SA2_A606MaqDsc ;
   private boolean[] H00SA2_n606MaqDsc ;
   private String[] H00SA3_A602MaqCod ;
   private String[] H00SA3_A396EmprCod ;
   private int[] H00SA3_A2801MaqVolRes ;
   private boolean[] H00SA3_n2801MaqVolRes ;
   private String[] H00SA3_A619MaqTinTip ;
   private boolean[] H00SA3_n619MaqTinTip ;
   private byte[] H00SA4_A831TipColCod ;
   private int[] H00SA4_A483ForColNum ;
   private String[] H00SA4_A482ForColNom ;
   private String[] H00SA4_A494ForSer ;
   private int[] H00SA4_A252CliCod ;
   private String[] H00SA4_A396EmprCod ;
   private String[] H00SA4_A6549ProForFR ;
   private short[] H00SA4_A1160ProForL ;
   private String[] H00SA5_A65ArtCod ;
   private int[] H00SA5_A252CliCod ;
   private String[] H00SA5_A396EmprCod ;
   private short[] H00SA5_A1148ArtPml ;
   private boolean[] H00SA5_n1148ArtPml ;
   private short[] H00SA5_A7415ArtPmlCru ;
   private boolean[] H00SA5_n7415ArtPmlCru ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV57MaqCod_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV58Combo_DataItem ;
}

final  class webfo0006n__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00SA2", "SELECT EmprCod, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, MaqCod, MaqDsc FROM TXPMAQUIN ORDER BY MaqCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00SA3", "SELECT MaqCod, EmprCod, MaqVolRes, MaqTinTip FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00SA4", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ProForFR, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00SA5", "SELECT ArtCod, CliCod, EmprCod, ArtPml, ArtPmlCru FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

