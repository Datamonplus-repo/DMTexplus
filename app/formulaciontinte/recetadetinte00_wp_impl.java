package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetadetinte00_wp_impl extends GXDataArea
{
   public recetadetinte00_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetadetinte00_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte00_wp_impl.class ));
   }

   public recetadetinte00_wp_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      pa1FO2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1FO2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.recetadetinte00_wp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAUTOMATA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV87Automata), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73UsurCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV72Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRODUCTOSCADERNO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81ProductosCaderno), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRCT10", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68Rct10), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52Msg10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBLOCKC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24BlockC), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG0", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Msg0, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGIDIOMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37FlagIdioma), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeTinte00_WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV93Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\recetadetinte00_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCAD", GXutil.ltrim( localUtil.ntoc( AV11Barcad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSIT", GXutil.ltrim( localUtil.ntoc( AV22Barsit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV33EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODM", GXutil.ltrim( localUtil.ntoc( AV12Barcodm, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREOM", GXutil.ltrim( localUtil.ntoc( AV14Barcodreom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPARM", GXutil.rtrim( AV13Barcodparm));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARHDSUSP", GXutil.ltrim( localUtil.ntoc( A13890BarHDSusp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "BARACC", GXutil.rtrim( A5253BarAcc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARASI", GXutil.ltrim( localUtil.ntoc( A6434BarAsi, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER", GXutil.rtrim( A212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM", GXutil.rtrim( A135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPCOL", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNOMCLI", GXutil.rtrim( A1234BarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNUMCLI", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.ltrim( localUtil.ntoc( AV66Ok, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORPRO", GXutil.rtrim( AV39FORPRO));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORRELBAN", GXutil.ltrim( localUtil.ntoc( AV40ForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORBLO", GXutil.rtrim( AV38Forblo));
      app.GxWebStd.gx_hidden_field( httpContext, "HAYREC", GXutil.ltrim( localUtil.ntoc( A13710HayRec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRRECETA", GXutil.ltrim( localUtil.ntoc( AV36ErrReceta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTOMATA", GXutil.ltrim( localUtil.ntoc( AV87Automata, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAUTOMATA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV87Automata), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV73UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73UsurCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV72Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV72Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRMENSAJE", AV74ErrMensaje);
      app.GxWebStd.gx_hidden_field( httpContext, "vPRODUCTOSCADERNO", GXutil.ltrim( localUtil.ntoc( AV81ProductosCaderno, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRODUCTOSCADERNO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81ProductosCaderno), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQIN", GXutil.ltrim( localUtil.ntoc( AV75ReclinmaqIN, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARHDSUSP", GXutil.ltrim( localUtil.ntoc( AV18BarHDSusp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV9BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "vRCT10", GXutil.ltrim( localUtil.ntoc( AV68Rct10, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRCT10", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68Rct10), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMRECS", GXutil.ltrim( localUtil.ntoc( AV65NumRecs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV69Reclinmaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG10", GXutil.rtrim( AV52Msg10));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52Msg10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBLOCKC", GXutil.ltrim( localUtil.ntoc( AV24BlockC, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBLOCKC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24BlockC), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG0", GXutil.rtrim( AV50Msg0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG0", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Msg0, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODTIN", GXutil.ltrim( localUtil.ntoc( A1933BarCodTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARREOTIN", GXutil.ltrim( localUtil.ntoc( A1934BarReoTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPARTIN", GXutil.rtrim( A1935BarParTin));
      app.GxWebStd.gx_hidden_field( httpContext, "BARRECACB", GXutil.rtrim( A6634BarRecAcb));
      app.GxWebStd.gx_hidden_field( httpContext, "HREBARCOD", GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREBARREO", GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREBARPAR", GXutil.rtrim( A4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "HRERACAB", GXutil.rtrim( A9808HreRacab));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRCOD", GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRREO", GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRPAR", GXutil.rtrim( A122BarAgrPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGIDIOMA", GXutil.ltrim( localUtil.ntoc( AV37FlagIdioma, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGIDIOMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37FlagIdioma), "9")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA_Title", GXutil.rtrim( Dvelop_confirmpanel_btneliminarreceta_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btneliminarreceta_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminarreceta_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminarreceta_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminarreceta_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btneliminarreceta_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btneliminarreceta_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA_Result", GXutil.rtrim( Dvelop_confirmpanel_btneliminarreceta_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA_Result", GXutil.rtrim( Dvelop_confirmpanel_btneliminarreceta_Result));
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
         we1FO2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1FO2( ) ;
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
      return formatLink("app.formulaciontinte.recetadetinte00_wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.RecetadeTinte00_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Receta de Tinte", "") ;
   }

   public void wb1FO0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº HDR", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\RecetadeTinte00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV6BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV6BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\RecetadeTinte00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV7BarCodPar), GXutil.rtrim( localUtil.format( AV7BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\RecetadeTinte00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 CellMarginTop30", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPrompt_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Active Bitmap Variable */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPrompt_gximage, "")==0) ? "" : "GX_Image_"+imgavPrompt_gximage+"_Class") ;
         StyleString = "" ;
         AV80Prompt_IsBlob = (boolean)(((GXutil.strcmp("", AV80Prompt)==0)&&(GXutil.strcmp("", AV94Prompt_GXI)==0))||!(GXutil.strcmp("", AV80Prompt)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV80Prompt)==0) ? AV94Prompt_GXI : httpContext.getResourceRelative(AV80Prompt)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPrompt_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 5, imgavPrompt_Jsonclick, "'"+""+"'"+",false,"+"'"+"EVPROMPT.CLICK."+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV80Prompt_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_FormulacionTinte\\RecetadeTinte00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 CellMarginTop30", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuseraction1_Internalname, "", httpContext.getMessage( "Confirmar Color (Sit=2)", ""), bttBtnuseraction1_Jsonclick, 5, httpContext.getMessage( "Confirmar Color (Sit=2)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION1\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\RecetadeTinte00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 CellMarginTop30", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarreceta_Internalname, "", httpContext.getMessage( "Eliminar Receta", ""), bttBtneliminarreceta_Jsonclick, 7, httpContext.getMessage( "Eliminar Receta", ""), "", StyleString, ClassString, 1, bttBtneliminarreceta_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"e111fo1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\RecetadeTinte00_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_acciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\RecetadeTinte00_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\RecetadeTinte00_WP.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV93Pgmname), GXutil.rtrim( localUtil.format( AV93Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\RecetadeTinte00_WP.htm");
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
         wb_table1_64_1FO2( true) ;
      }
      else
      {
         wb_table1_64_1FO2( false) ;
      }
      return  ;
   }

   public void wb_table1_64_1FO2e( boolean wbgen )
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

   public void start1FO2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Receta de Tinte", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1FO0( ) ;
   }

   public void ws1FO2( )
   {
      start1FO2( ) ;
      evt1FO2( ) ;
   }

   public void evt1FO2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121FO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e131FO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e141FO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction1' */
                           e151FO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e161FO2 ();
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
                                 e171FO2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e181FO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPROMPT.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e191FO2 ();
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

   public void we1FO2( )
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

   public void pa1FO2( )
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
            GX_FocusControl = edtavBarcod_Internalname ;
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
      rf1FO2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV93Pgmname = "FormulacionTinte.RecetadeTinte00_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Pgmname", AV93Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1FO2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e161FO2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H01FO2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = H01FO2_A396EmprCod[0] ;
            /* Execute user event: Load */
            e181FO2 ();
            pr_default.readNext(0);
         }
         pr_default.close(0);
         wb1FO0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1FO2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTOMATA", GXutil.ltrim( localUtil.ntoc( AV87Automata, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAUTOMATA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV87Automata), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV73UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73UsurCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV72Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV72Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRODUCTOSCADERNO", GXutil.ltrim( localUtil.ntoc( AV81ProductosCaderno, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRODUCTOSCADERNO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81ProductosCaderno), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRCT10", GXutil.ltrim( localUtil.ntoc( AV68Rct10, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRCT10", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68Rct10), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG10", GXutil.rtrim( AV52Msg10));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52Msg10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBLOCKC", GXutil.ltrim( localUtil.ntoc( AV24BlockC, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBLOCKC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24BlockC), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG0", GXutil.rtrim( AV50Msg0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG0", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Msg0, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGIDIOMA", GXutil.ltrim( localUtil.ntoc( AV37FlagIdioma, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGIDIOMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37FlagIdioma), "9")));
   }

   public void before_start_formulas( )
   {
      AV93Pgmname = "FormulacionTinte.RecetadeTinte00_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Pgmname", AV93Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1FO0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131FO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV13Barcodparm = httpContext.cgiGet( "vBARCODPARM") ;
         AV14Barcodreom = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREOM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV12Barcodm = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCODM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV36ErrReceta = (byte)(localUtil.ctol( httpContext.cgiGet( "vERRRECETA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV22Barsit = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARSIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_btneliminarreceta_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA_Title") ;
         Dvelop_confirmpanel_btneliminarreceta_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA_Confirmationtext") ;
         Dvelop_confirmpanel_btneliminarreceta_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btneliminarreceta_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA_Nobuttoncaption") ;
         Dvelop_confirmpanel_btneliminarreceta_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btneliminarreceta_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA_Yesbuttonposition") ;
         Dvelop_confirmpanel_btneliminarreceta_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA_Confirmtype") ;
         Dvelop_confirmpanel_btneliminarreceta_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
         }
         else
         {
            AV5BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
            GX_FocusControl = edtavBarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodReo", GXutil.str( AV6BarCodReo, 1, 0));
         }
         else
         {
            AV6BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodReo", GXutil.str( AV6BarCodReo, 1, 0));
         }
         AV7BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
         AV80Prompt = httpContext.cgiGet( imgavPrompt_Internalname) ;
         AV93Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Pgmname", AV93Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeTinte00_WP");
         AV93Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Pgmname", AV93Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV93Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\recetadetinte00_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e131FO2 ();
      if (returnInSub) return;
   }

   public void e131FO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV72Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetadetinte00_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV72Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72Station", AV72Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV72Station, ""))));
      GXv_char2[0] = AV33EmprCod ;
      GXv_char3[0] = AV34EmprNom ;
      GXv_char4[0] = AV73UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV72Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetadetinte00_wp_impl.this.AV33EmprCod = GXv_char2[0] ;
      recetadetinte00_wp_impl.this.AV34EmprNom = GXv_char3[0] ;
      recetadetinte00_wp_impl.this.AV73UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33EmprCod", AV33EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV73UsurCod", AV73UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73UsurCod, ""))));
      GXt_int5 = AV37FlagIdioma ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV33EmprCod, "100001", GXv_int6) ;
      recetadetinte00_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV37FlagIdioma = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37FlagIdioma", GXutil.str( AV37FlagIdioma, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGIDIOMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37FlagIdioma), "9")));
      GXt_int5 = AV24BlockC ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV33EmprCod, httpContext.getMessage( "BLOCKC", ""), GXv_int6) ;
      recetadetinte00_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV24BlockC = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24BlockC", GXutil.str( AV24BlockC, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBLOCKC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24BlockC), "9")));
      GXt_int5 = AV68Rct10 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV33EmprCod, httpContext.getMessage( "#10RCT", ""), GXv_int6) ;
      recetadetinte00_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV68Rct10 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68Rct10", GXutil.str( AV68Rct10, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRCT10", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68Rct10), "9")));
      GXt_int5 = (byte)(AV76Carvitin) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV33EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
      recetadetinte00_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV76Carvitin = GXt_int5 ;
      GXt_int5 = (byte)(AV81ProductosCaderno) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV33EmprCod, httpContext.getMessage( "NOPRDE", ""), GXv_int6) ;
      recetadetinte00_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV81ProductosCaderno = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81ProductosCaderno", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81ProductosCaderno), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRODUCTOSCADERNO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81ProductosCaderno), "ZZZ9")));
      GXt_int5 = (byte)(AV89FlagFo13) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV33EmprCod, httpContext.getMessage( "FO0013", ""), GXv_int6) ;
      recetadetinte00_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV89FlagFo13 = GXt_int5 ;
      GXt_char1 = AV50Msg0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG022_", ""), (byte)(99), GXv_char4) ;
      recetadetinte00_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV50Msg0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Msg0", AV50Msg0);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG0", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Msg0, ""))));
      GXt_char1 = AV51Msg1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN071", ""), (byte)(99), GXv_char4) ;
      recetadetinte00_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV51Msg1 = GXt_char1 ;
      GXt_char1 = AV55Msg2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2065_", ""), (byte)(99), GXv_char4) ;
      recetadetinte00_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV55Msg2 = GXt_char1 ;
      AV55Msg2 = GXutil.trim( AV55Msg2) + httpContext.getMessage( " Inexistente", "") ;
      GXt_char1 = AV56Msg3 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG096_", ""), (byte)(99), GXv_char4) ;
      recetadetinte00_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV56Msg3 = GXt_char1 ;
      GXt_char1 = AV57Msg4 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG117_", ""), (byte)(99), GXv_char4) ;
      recetadetinte00_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV57Msg4 = GXt_char1 ;
      GXt_char1 = AV58Msg5 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN072", ""), (byte)(99), GXv_char4) ;
      recetadetinte00_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV58Msg5 = GXt_char1 ;
      GXt_char1 = AV59Msg6 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMLA005_", ""), (byte)(99), GXv_char4) ;
      recetadetinte00_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV59Msg6 = GXt_char1 ;
      GXt_char1 = AV60Msg7 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN073", ""), (byte)(99), GXv_char4) ;
      recetadetinte00_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV60Msg7 = GXt_char1 ;
      GXt_char1 = AV61Msg8 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN074", ""), (byte)(99), GXv_char4) ;
      recetadetinte00_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV61Msg8 = GXt_char1 ;
      GXt_char1 = AV62Msg9 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN075", ""), (byte)(99), GXv_char4) ;
      recetadetinte00_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV62Msg9 = GXt_char1 ;
      GXt_char1 = AV52Msg10 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN094", ""), (byte)(99), GXv_char4) ;
      recetadetinte00_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV52Msg10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Msg10", AV52Msg10);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52Msg10, ""))));
      AV74ErrMensaje = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74ErrMensaje", AV74ErrMensaje);
      imgavPrompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "gximage", imgavPrompt_gximage, true);
      AV80Prompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV80Prompt)==0) ? AV94Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV80Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV80Prompt), true);
      AV94Prompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV80Prompt)==0) ? AV94Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV80Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV80Prompt), true);
      GXt_char1 = AV72Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      recetadetinte00_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV72Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72Station", AV72Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV72Station, ""))));
      GXv_char4[0] = AV33EmprCod ;
      GXv_char3[0] = AV34EmprNom ;
      GXv_char2[0] = AV73UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV72Station, GXv_char4, GXv_char3, GXv_char2) ;
      recetadetinte00_wp_impl.this.AV33EmprCod = GXv_char4[0] ;
      recetadetinte00_wp_impl.this.AV34EmprNom = GXv_char3[0] ;
      recetadetinte00_wp_impl.this.AV73UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33EmprCod", AV33EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV73UsurCod", AV73UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73UsurCod, ""))));
      bttBtneliminarreceta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtneliminarreceta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtneliminarreceta_Enabled), 5, 0), true);
   }

   public void e141FO2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e151FO2( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CONTROLHDR' */
      S112 ();
      if (returnInSub) return;
      if ( (0==AV11Barcad) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "HDR Inexistente ¡¡¡", ""));
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( AV22Barsit == 2 )
         {
            httpContext.popup(formatLink("app.cambiodecolorenhojaderuta_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV33EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV12Barcodm,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14Barcodreom,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13Barcodparm))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) , new Object[] {});
            AV5BarCod = AV12Barcodm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
            AV6BarCodReo = AV14Barcodreom ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodReo", GXutil.str( AV6BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barcodparm", AV13Barcodparm);
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "La situacion debe estar con valor 2", ""));
         }
      }
      /*  Sending Event outputs  */
   }

   public void e121FO2( )
   {
      /* Dvelop_confirmpanel_btneliminarreceta_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btneliminarreceta_Result, "Yes") == 0 )
      {
         GXv_char4[0] = AV33EmprCod ;
         GXv_int7[0] = AV12Barcodm ;
         GXv_int6[0] = AV14Barcodreom ;
         GXv_char3[0] = AV13Barcodparm ;
         GXv_int8[0] = (short)(10) ;
         new app.pbajrec(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_int8) ;
         recetadetinte00_wp_impl.this.AV33EmprCod = GXv_char4[0] ;
         recetadetinte00_wp_impl.this.AV12Barcodm = GXv_int7[0] ;
         recetadetinte00_wp_impl.this.AV14Barcodreom = GXv_int6[0] ;
         recetadetinte00_wp_impl.this.AV13Barcodparm = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33EmprCod", AV33EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV12Barcodm", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Barcodm), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodreom", GXutil.str( AV14Barcodreom, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV13Barcodparm", AV13Barcodparm);
         GXv_char4[0] = AV33EmprCod ;
         GXv_int7[0] = AV12Barcodm ;
         GXv_int6[0] = AV14Barcodreom ;
         GXv_char3[0] = AV13Barcodparm ;
         GXv_int8[0] = (short)(10) ;
         new app.pdelrec3(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_int8) ;
         recetadetinte00_wp_impl.this.AV33EmprCod = GXv_char4[0] ;
         recetadetinte00_wp_impl.this.AV12Barcodm = GXv_int7[0] ;
         recetadetinte00_wp_impl.this.AV14Barcodreom = GXv_int6[0] ;
         recetadetinte00_wp_impl.this.AV13Barcodparm = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33EmprCod", AV33EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV12Barcodm", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Barcodm), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodreom", GXutil.str( AV14Barcodreom, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV13Barcodparm", AV13Barcodparm);
         if ( AV87Automata == 1 )
         {
            GXv_char4[0] = AV33EmprCod ;
            GXv_int7[0] = AV12Barcodm ;
            GXv_int6[0] = AV14Barcodreom ;
            GXv_char3[0] = AV13Barcodparm ;
            GXv_int8[0] = (short)(10) ;
            GXv_int9[0] = (byte)(3) ;
            GXv_char2[0] = "" ;
            GXv_char10[0] = AV86ErrorMessage ;
            new app.pdyrp030(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_int8, GXv_int9, GXv_char2, GXv_char10) ;
            recetadetinte00_wp_impl.this.AV33EmprCod = GXv_char4[0] ;
            recetadetinte00_wp_impl.this.AV12Barcodm = GXv_int7[0] ;
            recetadetinte00_wp_impl.this.AV14Barcodreom = GXv_int6[0] ;
            recetadetinte00_wp_impl.this.AV13Barcodparm = GXv_char3[0] ;
            recetadetinte00_wp_impl.this.AV86ErrorMessage = GXv_char10[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33EmprCod", AV33EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV12Barcodm", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Barcodm), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodreom", GXutil.str( AV14Barcodreom, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barcodparm", AV13Barcodparm);
         }
         AV43Inc_obs = httpContext.getMessage( "Receta Tinte, eliminada", "") ;
         new app.pctrinc(remoteHandle, context).execute( AV33EmprCod, GXutil.substring( AV93Pgmname, 1, 10), AV73UsurCod, AV72Station, AV43Inc_obs, AV12Barcodm, AV14Barcodreom, AV13Barcodparm) ;
         httpContext.GX_msglist.addItem(AV43Inc_obs);
         AV5BarCod = AV12Barcodm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
         AV6BarCodReo = AV14Barcodreom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodReo", GXutil.str( AV6BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV13Barcodparm", AV13Barcodparm);
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void e161FO2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV74ErrMensaje, httpContext.getMessage( "Proceso finalizado con exito!", "")) == 0 )
      {
         AV82Varmsg = AV74ErrMensaje ;
         if ( AV81ProductosCaderno == 1 )
         {
            GXv_char10[0] = AV33EmprCod ;
            GXv_int7[0] = AV12Barcodm ;
            GXv_int9[0] = AV14Barcodreom ;
            GXv_char4[0] = AV13Barcodparm ;
            GXv_int8[0] = AV75ReclinmaqIN ;
            GXv_char3[0] = AV82Varmsg ;
            new app.pcdnenc(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_int9, GXv_char4, GXv_int8, GXv_char3) ;
            recetadetinte00_wp_impl.this.AV33EmprCod = GXv_char10[0] ;
            recetadetinte00_wp_impl.this.AV12Barcodm = GXv_int7[0] ;
            recetadetinte00_wp_impl.this.AV14Barcodreom = GXv_int9[0] ;
            recetadetinte00_wp_impl.this.AV13Barcodparm = GXv_char4[0] ;
            recetadetinte00_wp_impl.this.AV75ReclinmaqIN = GXv_int8[0] ;
            recetadetinte00_wp_impl.this.AV82Varmsg = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33EmprCod", AV33EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV12Barcodm", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Barcodm), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodreom", GXutil.str( AV14Barcodreom, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barcodparm", AV13Barcodparm);
            httpContext.ajax_rsp_assign_attri("", false, "AV75ReclinmaqIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75ReclinmaqIN), 4, 0));
            if ( ! (GXutil.strcmp("", AV82Varmsg)==0) )
            {
               Gx_msg = httpContext.getMessage( "Atenção. Foram detectados produtos que não podem ser usados em determinados cadernos de encargos", "") + GXutil.newLine( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
               Gx_msg += GXutil.trim( AV82Varmsg) ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
               httpContext.GX_msglist.addItem(Gx_msg);
            }
         }
         GXv_decimal11[0] = AV88totalkilos ;
         new app.get_rectotkgm(remoteHandle, context).execute( AV33EmprCod, AV12Barcodm, AV14Barcodreom, AV13Barcodparm, AV75ReclinmaqIN, GXv_decimal11) ;
         recetadetinte00_wp_impl.this.AV88totalkilos = GXv_decimal11[0] ;
         callWebObject(formatLink("app.recetadetinte02__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV33EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV12Barcodm,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14Barcodreom,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13Barcodparm)),GXutil.URLEncode(GXutil.ltrimstr(AV75ReclinmaqIN,4,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "INS", ""))),GXutil.URLEncode(GXutil.rtrim(AV82Varmsg)),GXutil.URLEncode(DecimalUtil.decToString(AV88totalkilos))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMaq","Mode","varmsg","TotaldeKilos"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e191FO2( )
   {
      /* Prompt_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.seleccionhdrprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV33EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(1,9,0))}, new String[] {"InEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InClicod","InBarsit"}) , new Object[] {"AV33EmprCod","AV5BarCod","AV6BarCodReo","AV7BarCodPar","",""});
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e171FO2 ();
      if (returnInSub) return;
   }

   public void e171FO2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV36ErrReceta = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36ErrReceta", GXutil.str( AV36ErrReceta, 1, 0));
      /* Execute user subroutine: 'CONTROLHDR' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LCONTI' */
      S122 ();
      if (returnInSub) return;
      if ( (0==AV11Barcad) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "HDR Inexistente ¡¡¡", ""));
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( AV18BarHDSusp == 1 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.La HDR esta SUSPENDIDA", ""));
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            /* Execute user subroutine: 'BARAGR' */
            S132 ();
            if (returnInSub) return;
            if ( ( GXutil.strcmp(Gx_msg, " ") != 0 ) && ( GXutil.strcmp(AV9BarAgrEst, "S") == 0 ) )
            {
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            else
            {
               if ( (0==AV68Rct10) )
               {
                  GXv_char10[0] = A396EmprCod ;
                  GXv_int7[0] = AV12Barcodm ;
                  GXv_int9[0] = AV14Barcodreom ;
                  GXv_char4[0] = AV13Barcodparm ;
                  GXv_int8[0] = AV65NumRecs ;
                  GXv_int12[0] = AV69Reclinmaq ;
                  new app.pdyrp022(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_int9, GXv_char4, GXv_int8, GXv_int12) ;
                  recetadetinte00_wp_impl.this.A396EmprCod = GXv_char10[0] ;
                  recetadetinte00_wp_impl.this.AV12Barcodm = GXv_int7[0] ;
                  recetadetinte00_wp_impl.this.AV14Barcodreom = GXv_int9[0] ;
                  recetadetinte00_wp_impl.this.AV13Barcodparm = GXv_char4[0] ;
                  recetadetinte00_wp_impl.this.AV65NumRecs = GXv_int8[0] ;
                  recetadetinte00_wp_impl.this.AV69Reclinmaq = GXv_int12[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV12Barcodm", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Barcodm), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodreom", GXutil.str( AV14Barcodreom, 1, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV13Barcodparm", AV13Barcodparm);
                  httpContext.ajax_rsp_assign_attri("", false, "AV65NumRecs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65NumRecs), 4, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV69Reclinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Reclinmaq), 4, 0));
               }
               else
               {
                  GXv_char10[0] = A396EmprCod ;
                  GXv_int7[0] = AV12Barcodm ;
                  GXv_int9[0] = AV14Barcodreom ;
                  GXv_char4[0] = AV13Barcodparm ;
                  GXv_int12[0] = AV65NumRecs ;
                  GXv_int8[0] = AV69Reclinmaq ;
                  new app.pdyrp023(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_int9, GXv_char4, GXv_int12, GXv_int8) ;
                  recetadetinte00_wp_impl.this.A396EmprCod = GXv_char10[0] ;
                  recetadetinte00_wp_impl.this.AV12Barcodm = GXv_int7[0] ;
                  recetadetinte00_wp_impl.this.AV14Barcodreom = GXv_int9[0] ;
                  recetadetinte00_wp_impl.this.AV13Barcodparm = GXv_char4[0] ;
                  recetadetinte00_wp_impl.this.AV65NumRecs = GXv_int12[0] ;
                  recetadetinte00_wp_impl.this.AV69Reclinmaq = GXv_int8[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV12Barcodm", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Barcodm), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodreom", GXutil.str( AV14Barcodreom, 1, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV13Barcodparm", AV13Barcodparm);
                  httpContext.ajax_rsp_assign_attri("", false, "AV65NumRecs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65NumRecs), 4, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV69Reclinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Reclinmaq), 4, 0));
               }
               if ( AV22Barsit == 3 )
               {
                  Gx_msg = httpContext.getMessage( "HDR en Laboratorio, Situacion= ", "") + GXutil.str( AV22Barsit, 2, 0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                  httpContext.GX_msglist.addItem(Gx_msg);
                  GX_FocusControl = edtavBarcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  if ( AV22Barsit == 9 )
                  {
                     Gx_msg = httpContext.getMessage( "Atencion, Hdr ", "") + GXutil.str( AV12Barcodm, 8, 0) + "-" + GXutil.str( AV14Barcodreom, 1, 0) + AV13Barcodparm + GXutil.newLine( ) ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                     Gx_msg += httpContext.getMessage( "la situacion es, ", "") + GXutil.str( AV22Barsit, 2, 0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                     if ( ( GXutil.strcmp(AV9BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(GXutil.str( AV5BarCod, 8, 0)+GXutil.str( AV6BarCodReo, 1, 0)+AV7BarCodPar, GXutil.str( AV12Barcodm, 8, 0)+GXutil.str( AV14Barcodreom, 1, 0)+AV13Barcodparm) != 0 ) )
                     {
                        Gx_msg = httpContext.getMessage( "Atencion, Hdr ", "") + GXutil.str( AV5BarCod, 8, 0) + "-" + GXutil.str( AV6BarCodReo, 1, 0) + AV7BarCodPar + GXutil.newLine( ) ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                        Gx_msg += httpContext.getMessage( "Esta Agrupada con ", "") + GXutil.str( AV12Barcodm, 8, 0) + "-" + GXutil.str( AV14Barcodreom, 1, 0) + AV13Barcodparm + GXutil.newLine( ) ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                        Gx_msg += httpContext.getMessage( "y la situacion es ", "") + GXutil.str( AV22Barsit, 2, 0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                     }
                     httpContext.GX_msglist.addItem(Gx_msg);
                     GX_FocusControl = edtavBarcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( AV22Barsit == 2 )
                     {
                        Gx_msg = httpContext.getMessage( "NO existe el COLOR, Situacion= ", "") + GXutil.str( AV22Barsit, 2, 0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                        httpContext.GX_msglist.addItem(Gx_msg);
                        GX_FocusControl = edtavBarcod_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        if ( ( ( AV65NumRecs > 1 ) || ( ( AV65NumRecs == 1 ) && ( AV69Reclinmaq == 10 ) ) && ( AV68Rct10 == 0 ) ) || ( ( AV68Rct10 == 1 ) && ( AV65NumRecs > 1 ) ) )
                        {
                           Gx_msg = ((AV68Rct10==0) ? AV52Msg10 : httpContext.getMessage( "Se detecta que hay mas de 1 receta de tinte ¡¡¡. Solo puede haber una Rc Tinte, con valor #10 ¡¡¡", "")) ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                           httpContext.GX_msglist.addItem(Gx_msg);
                           GX_FocusControl = edtavBarcod_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                        }
                        else
                        {
                           if ( ( GXutil.strcmp(AV38Forblo, httpContext.getMessage( "S", "")) == 0 ) && ( AV24BlockC == 1 ) )
                           {
                              httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion. Este Color esta BLOQUEADO. Consultar con LABORATORIO¡¡¡", ""));
                              GX_FocusControl = edtavBarcod_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              httpContext.doAjaxSetFocus(GX_FocusControl);
                           }
                           else
                           {
                              if ( AV22Barsit > 4 )
                              {
                                 httpContext.GX_msglist.addItem(AV50Msg0);
                              }
                              if ( ( AV22Barsit >= 4 ) && ( AV36ErrReceta == 1 ) )
                              {
                                 bttBtneliminarreceta_Enabled = 1 ;
                                 httpContext.ajax_rsp_assign_prop("", false, bttBtneliminarreceta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtneliminarreceta_Enabled), 5, 0), true);
                                 Gx_msg = httpContext.getMessage( "Atencion.Existe Receta. Debe de Eliminarla", "") ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                                 httpContext.GX_msglist.addItem(Gx_msg);
                                 GX_FocusControl = edtavBarcod_Internalname ;
                                 httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                                 httpContext.doAjaxSetFocus(GX_FocusControl);
                              }
                              else
                              {
                                 if ( AV36ErrReceta == 1 )
                                 {
                                    Gx_msg = httpContext.getMessage( "Atencion.Existe la receta para la HDR ", "") + GXutil.str( AV5BarCod, 8, 0) + "-" + GXutil.str( AV6BarCodReo, 1, 0) + AV7BarCodPar + GXutil.newLine( ) ;
                                    httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                                    Gx_msg += httpContext.getMessage( "La HDR ", "") + GXutil.str( AV5BarCod, 8, 0) + "-" + GXutil.str( AV6BarCodReo, 1, 0) + AV7BarCodPar + GXutil.newLine( ) + httpContext.getMessage( "esta agrupada y NO es la HDR minima.", "") + GXutil.newLine( ) ;
                                    httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                                    Gx_msg += httpContext.getMessage( "Se debe de anular la RECETA.", "") ;
                                    httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
                                    httpContext.GX_msglist.addItem(Gx_msg);
                                    GX_FocusControl = edtavBarcod_Internalname ;
                                    httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                                    httpContext.doAjaxSetFocus(GX_FocusControl);
                                 }
                                 else
                                 {
                                    httpContext.popup(formatLink("app.recetadetinte01_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV33EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV12Barcodm,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14Barcodreom,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13Barcodparm)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","Barcod","Barcodreo","Barcodpar","RecLinmaq","ErrMensaje"}) , new Object[] {"AV33EmprCod","AV12Barcodm","AV14Barcodreom","AV13Barcodparm","AV75ReclinmaqIN","AV74ErrMensaje"});
                                    httpContext.doAjaxRefresh();
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'BARAGR' Routine */
      returnInSub = false ;
      Gx_msg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      /* Using cursor H01FO3 */
      pr_default.execute(1, new Object[] {AV33EmprCod, Integer.valueOf(AV12Barcodm), Byte.valueOf(AV14Barcodreom), AV13Barcodparm});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = H01FO3_A130BarCodPar[0] ;
         A132BarCodReo = H01FO3_A132BarCodReo[0] ;
         A129BarCod = H01FO3_A129BarCod[0] ;
         A396EmprCod = H01FO3_A396EmprCod[0] ;
         A122BarAgrPar = H01FO3_A122BarAgrPar[0] ;
         A124BarAgrReo = H01FO3_A124BarAgrReo[0] ;
         A119BarAgrCod = H01FO3_A119BarAgrCod[0] ;
         if ( ( AV12Barcodm == A119BarAgrCod ) && ( AV14Barcodreom == A124BarAgrReo ) && ( GXutil.strcmp(AV13Barcodparm, A122BarAgrPar) == 0 ) )
         {
            if ( AV37FlagIdioma == 0 )
            {
               Gx_msg = httpContext.getMessage( "ERROR. La Hdr= ", "") + GXutil.str( AV12Barcodm, 8, 0) + "-" + GXutil.str( AV14Barcodreom, 1, 0) + AV13Barcodparm + GXutil.chr( (short)(13)) ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
               Gx_msg += httpContext.getMessage( "esta AGRUPADA consigo misma ¡¡¡", "") + GXutil.chr( (short)(13)) ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
            }
            else
            {
               Gx_msg = httpContext.getMessage( "ERRO.O número OS=", "") + GXutil.str( AV12Barcodm, 8, 0) + "-" + GXutil.str( AV14Barcodreom, 1, 0) + AV13Barcodparm + GXutil.chr( (short)(13)) ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
               Gx_msg += httpContext.getMessage( "é agrupado com ele mesmo ¡¡¡", "") + GXutil.chr( (short)(13)) ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S122( )
   {
      /* 'LCONTI' Routine */
      returnInSub = false ;
      AV45Lconti = (short)(0) ;
      /* Using cursor H01FO4 */
      pr_default.execute(2, new Object[] {AV33EmprCod, Integer.valueOf(AV12Barcodm), Byte.valueOf(AV14Barcodreom), AV13Barcodparm});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A6634BarRecAcb = H01FO4_A6634BarRecAcb[0] ;
         n6634BarRecAcb = H01FO4_n6634BarRecAcb[0] ;
         A1935BarParTin = H01FO4_A1935BarParTin[0] ;
         n1935BarParTin = H01FO4_n1935BarParTin[0] ;
         A1934BarReoTin = H01FO4_A1934BarReoTin[0] ;
         n1934BarReoTin = H01FO4_n1934BarReoTin[0] ;
         A1933BarCodTin = H01FO4_A1933BarCodTin[0] ;
         n1933BarCodTin = H01FO4_n1933BarCodTin[0] ;
         A396EmprCod = H01FO4_A396EmprCod[0] ;
         if ( GXutil.strcmp(A6634BarRecAcb, httpContext.getMessage( "S", "")) != 0 )
         {
            AV45Lconti = (short)(AV45Lconti+1) ;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV42Hisreh = (short)(0) ;
      /* Using cursor H01FO5 */
      pr_default.execute(3, new Object[] {AV33EmprCod, Integer.valueOf(AV12Barcodm), Byte.valueOf(AV14Barcodreom), AV13Barcodparm});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A9808HreRacab = H01FO5_A9808HreRacab[0] ;
         n9808HreRacab = H01FO5_n9808HreRacab[0] ;
         A4494HreBarPar = H01FO5_A4494HreBarPar[0] ;
         A4493HreBarReo = H01FO5_A4493HreBarReo[0] ;
         A4492HreBarCod = H01FO5_A4492HreBarCod[0] ;
         A396EmprCod = H01FO5_A396EmprCod[0] ;
         if ( GXutil.strcmp(A9808HreRacab, httpContext.getMessage( "S", "")) != 0 )
         {
            AV42Hisreh = (short)(AV42Hisreh+1) ;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S112( )
   {
      /* 'CONTROLHDR' Routine */
      returnInSub = false ;
      AV74ErrMensaje = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74ErrMensaje", AV74ErrMensaje);
      AV11Barcad = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Barcad", GXutil.str( AV11Barcad, 1, 0));
      /* Using cursor H01FO7 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV33EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A120BarAgrEst = H01FO7_A120BarAgrEst[0] ;
         A5253BarAcc = H01FO7_A5253BarAcc[0] ;
         A6434BarAsi = H01FO7_A6434BarAsi[0] ;
         A213BarSit = H01FO7_A213BarSit[0] ;
         A252CliCod = H01FO7_A252CliCod[0] ;
         n252CliCod = H01FO7_n252CliCod[0] ;
         A212BarSer = H01FO7_A212BarSer[0] ;
         A135BarColNom = H01FO7_A135BarColNom[0] ;
         A136BarColNum = H01FO7_A136BarColNum[0] ;
         A218BarTipCol = H01FO7_A218BarTipCol[0] ;
         A1234BarNomCli = H01FO7_A1234BarNomCli[0] ;
         A1235BarNumCli = H01FO7_A1235BarNumCli[0] ;
         A361DisCod = H01FO7_A361DisCod[0] ;
         A13890BarHDSusp = H01FO7_A13890BarHDSusp[0] ;
         n13890BarHDSusp = H01FO7_n13890BarHDSusp[0] ;
         A130BarCodPar = H01FO7_A130BarCodPar[0] ;
         A132BarCodReo = H01FO7_A132BarCodReo[0] ;
         A129BarCod = H01FO7_A129BarCod[0] ;
         A396EmprCod = H01FO7_A396EmprCod[0] ;
         A13890BarHDSusp = H01FO7_A13890BarHDSusp[0] ;
         n13890BarHDSusp = H01FO7_n13890BarHDSusp[0] ;
         GXt_int5 = A13710HayRec ;
         GXv_int9[0] = GXt_int5 ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int9) ;
         recetadetinte00_wp_impl.this.GXt_int5 = GXv_int9[0] ;
         A13710HayRec = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13710HayRec", GXutil.str( A13710HayRec, 1, 0));
         AV11Barcad = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Barcad", GXutil.str( AV11Barcad, 1, 0));
         AV18BarHDSusp = A13890BarHDSusp ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18BarHDSusp", GXutil.str( AV18BarHDSusp, 1, 0));
         AV9BarAgrEst = A120BarAgrEst ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarAgrEst", AV9BarAgrEst);
         AV8BarAcc = A5253BarAcc ;
         AV10BarAsi = A6434BarAsi ;
         AV22Barsit = A213BarSit ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Barsit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Barsit), 2, 0));
         AV28Clicod = A252CliCod ;
         AV21Barser = A212BarSer ;
         AV15BarcolNom = A135BarColNom ;
         AV16Barcolnum = A136BarColNum ;
         AV23BarTipCol = A218BarTipCol ;
         AV19BarNomcli = A1234BarNomCli ;
         AV20Barnumcli = A1235BarNumCli ;
         AV12Barcodm = A129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Barcodm", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Barcodm), 8, 0));
         AV14Barcodreom = A132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodreom", GXutil.str( AV14Barcodreom, 1, 0));
         AV13Barcodparm = A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Barcodparm", AV13Barcodparm);
         AV32Discod = A361DisCod ;
         GXv_char10[0] = A396EmprCod ;
         GXv_int7[0] = AV28Clicod ;
         GXv_char4[0] = AV21Barser ;
         GXv_char3[0] = AV15BarcolNom ;
         GXv_int13[0] = AV16Barcolnum ;
         GXv_int9[0] = AV23BarTipCol ;
         GXv_int6[0] = AV66Ok ;
         new app.pdyrp017(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_char4, GXv_char3, GXv_int13, GXv_int9, GXv_int6) ;
         recetadetinte00_wp_impl.this.A396EmprCod = GXv_char10[0] ;
         recetadetinte00_wp_impl.this.AV28Clicod = GXv_int7[0] ;
         recetadetinte00_wp_impl.this.AV21Barser = GXv_char4[0] ;
         recetadetinte00_wp_impl.this.AV15BarcolNom = GXv_char3[0] ;
         recetadetinte00_wp_impl.this.AV16Barcolnum = GXv_int13[0] ;
         recetadetinte00_wp_impl.this.AV23BarTipCol = GXv_int9[0] ;
         recetadetinte00_wp_impl.this.AV66Ok = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV66Ok", GXutil.str( AV66Ok, 1, 0));
         AV41HdMin = (byte)(1) ;
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char10[0] = AV33EmprCod ;
            GXv_int13[0] = AV12Barcodm ;
            GXv_int9[0] = AV14Barcodreom ;
            GXv_char4[0] = AV13Barcodparm ;
            new app.pdyrp018(remoteHandle, context).execute( GXv_char10, GXv_int13, GXv_int9, GXv_char4) ;
            recetadetinte00_wp_impl.this.AV33EmprCod = GXv_char10[0] ;
            recetadetinte00_wp_impl.this.AV12Barcodm = GXv_int13[0] ;
            recetadetinte00_wp_impl.this.AV14Barcodreom = GXv_int9[0] ;
            recetadetinte00_wp_impl.this.AV13Barcodparm = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33EmprCod", AV33EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV12Barcodm", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Barcodm), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodreom", GXutil.str( AV14Barcodreom, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barcodparm", AV13Barcodparm);
            if ( ( A129BarCod == AV12Barcodm ) && ( A132BarCodReo == AV14Barcodreom ) && ( GXutil.strcmp(A130BarCodPar, AV13Barcodparm) == 0 ) )
            {
               AV41HdMin = (byte)(1) ;
            }
            else
            {
               AV41HdMin = (byte)(0) ;
            }
         }
         GXv_char10[0] = A396EmprCod ;
         GXv_int13[0] = A252CliCod ;
         GXv_char4[0] = A212BarSer ;
         GXv_char3[0] = A135BarColNom ;
         GXv_int7[0] = A136BarColNum ;
         GXv_int9[0] = A218BarTipCol ;
         GXv_char2[0] = AV39FORPRO ;
         GXv_decimal11[0] = AV40ForRelBan ;
         GXv_char14[0] = AV38Forblo ;
         new app.pdyrp020(remoteHandle, context).execute( GXv_char10, GXv_int13, GXv_char4, GXv_char3, GXv_int7, GXv_int9, GXv_char2, GXv_decimal11, GXv_char14) ;
         recetadetinte00_wp_impl.this.A396EmprCod = GXv_char10[0] ;
         recetadetinte00_wp_impl.this.A252CliCod = GXv_int13[0] ;
         recetadetinte00_wp_impl.this.A212BarSer = GXv_char4[0] ;
         recetadetinte00_wp_impl.this.A135BarColNom = GXv_char3[0] ;
         recetadetinte00_wp_impl.this.A136BarColNum = GXv_int7[0] ;
         recetadetinte00_wp_impl.this.A218BarTipCol = GXv_int9[0] ;
         recetadetinte00_wp_impl.this.AV39FORPRO = GXv_char2[0] ;
         recetadetinte00_wp_impl.this.AV40ForRelBan = GXv_decimal11[0] ;
         recetadetinte00_wp_impl.this.AV38Forblo = GXv_char14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV39FORPRO", AV39FORPRO);
         httpContext.ajax_rsp_assign_attri("", false, "AV40ForRelBan", GXutil.ltrimstr( AV40ForRelBan, 7, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV38Forblo", AV38Forblo);
         AV36ErrReceta = A13710HayRec ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36ErrReceta", GXutil.str( AV36ErrReceta, 1, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( (0==AV41HdMin) )
      {
         AV11Barcad = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Barcad", GXutil.str( AV11Barcad, 1, 0));
         /* Using cursor H01FO9 */
         pr_default.execute(5, new Object[] {A396EmprCod, AV33EmprCod, Integer.valueOf(AV12Barcodm), Byte.valueOf(AV14Barcodreom), AV13Barcodparm});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A130BarCodPar = H01FO9_A130BarCodPar[0] ;
            A132BarCodReo = H01FO9_A132BarCodReo[0] ;
            A129BarCod = H01FO9_A129BarCod[0] ;
            A396EmprCod = H01FO9_A396EmprCod[0] ;
            A120BarAgrEst = H01FO9_A120BarAgrEst[0] ;
            A5253BarAcc = H01FO9_A5253BarAcc[0] ;
            A6434BarAsi = H01FO9_A6434BarAsi[0] ;
            A213BarSit = H01FO9_A213BarSit[0] ;
            A252CliCod = H01FO9_A252CliCod[0] ;
            n252CliCod = H01FO9_n252CliCod[0] ;
            A212BarSer = H01FO9_A212BarSer[0] ;
            A135BarColNom = H01FO9_A135BarColNom[0] ;
            A136BarColNum = H01FO9_A136BarColNum[0] ;
            A218BarTipCol = H01FO9_A218BarTipCol[0] ;
            A1234BarNomCli = H01FO9_A1234BarNomCli[0] ;
            A1235BarNumCli = H01FO9_A1235BarNumCli[0] ;
            A361DisCod = H01FO9_A361DisCod[0] ;
            A13890BarHDSusp = H01FO9_A13890BarHDSusp[0] ;
            n13890BarHDSusp = H01FO9_n13890BarHDSusp[0] ;
            A13890BarHDSusp = H01FO9_A13890BarHDSusp[0] ;
            n13890BarHDSusp = H01FO9_n13890BarHDSusp[0] ;
            AV11Barcad = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Barcad", GXutil.str( AV11Barcad, 1, 0));
            AV18BarHDSusp = A13890BarHDSusp ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarHDSusp", GXutil.str( AV18BarHDSusp, 1, 0));
            AV9BarAgrEst = A120BarAgrEst ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarAgrEst", AV9BarAgrEst);
            AV8BarAcc = A5253BarAcc ;
            AV10BarAsi = A6434BarAsi ;
            AV22Barsit = A213BarSit ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Barsit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Barsit), 2, 0));
            AV28Clicod = A252CliCod ;
            AV21Barser = A212BarSer ;
            AV15BarcolNom = A135BarColNom ;
            AV16Barcolnum = A136BarColNum ;
            AV23BarTipCol = A218BarTipCol ;
            AV19BarNomcli = A1234BarNomCli ;
            AV20Barnumcli = A1235BarNumCli ;
            AV12Barcodm = A129BarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Barcodm", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Barcodm), 8, 0));
            AV14Barcodreom = A132BarCodReo ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodreom", GXutil.str( AV14Barcodreom, 1, 0));
            AV13Barcodparm = A130BarCodPar ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barcodparm", AV13Barcodparm);
            AV32Discod = A361DisCod ;
            GXv_char14[0] = A396EmprCod ;
            GXv_int13[0] = AV28Clicod ;
            GXv_char10[0] = AV21Barser ;
            GXv_char4[0] = AV15BarcolNom ;
            GXv_int7[0] = AV16Barcolnum ;
            GXv_int9[0] = AV23BarTipCol ;
            GXv_int6[0] = AV66Ok ;
            new app.pdyrp017(remoteHandle, context).execute( GXv_char14, GXv_int13, GXv_char10, GXv_char4, GXv_int7, GXv_int9, GXv_int6) ;
            recetadetinte00_wp_impl.this.A396EmprCod = GXv_char14[0] ;
            recetadetinte00_wp_impl.this.AV28Clicod = GXv_int13[0] ;
            recetadetinte00_wp_impl.this.AV21Barser = GXv_char10[0] ;
            recetadetinte00_wp_impl.this.AV15BarcolNom = GXv_char4[0] ;
            recetadetinte00_wp_impl.this.AV16Barcolnum = GXv_int7[0] ;
            recetadetinte00_wp_impl.this.AV23BarTipCol = GXv_int9[0] ;
            recetadetinte00_wp_impl.this.AV66Ok = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV66Ok", GXutil.str( AV66Ok, 1, 0));
            AV41HdMin = (byte)(1) ;
            GXv_char14[0] = A396EmprCod ;
            GXv_int13[0] = A252CliCod ;
            GXv_char10[0] = A212BarSer ;
            GXv_char4[0] = A135BarColNom ;
            GXv_int7[0] = A136BarColNum ;
            GXv_int9[0] = A218BarTipCol ;
            GXv_char3[0] = AV39FORPRO ;
            GXv_decimal11[0] = AV40ForRelBan ;
            GXv_char2[0] = AV38Forblo ;
            new app.pdyrp020(remoteHandle, context).execute( GXv_char14, GXv_int13, GXv_char10, GXv_char4, GXv_int7, GXv_int9, GXv_char3, GXv_decimal11, GXv_char2) ;
            recetadetinte00_wp_impl.this.A396EmprCod = GXv_char14[0] ;
            recetadetinte00_wp_impl.this.A252CliCod = GXv_int13[0] ;
            recetadetinte00_wp_impl.this.A212BarSer = GXv_char10[0] ;
            recetadetinte00_wp_impl.this.A135BarColNom = GXv_char4[0] ;
            recetadetinte00_wp_impl.this.A136BarColNum = GXv_int7[0] ;
            recetadetinte00_wp_impl.this.A218BarTipCol = GXv_int9[0] ;
            recetadetinte00_wp_impl.this.AV39FORPRO = GXv_char3[0] ;
            recetadetinte00_wp_impl.this.AV40ForRelBan = GXv_decimal11[0] ;
            recetadetinte00_wp_impl.this.AV38Forblo = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
            httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV39FORPRO", AV39FORPRO);
            httpContext.ajax_rsp_assign_attri("", false, "AV40ForRelBan", GXutil.ltrimstr( AV40ForRelBan, 7, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV38Forblo", AV38Forblo);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e181FO2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_64_1FO2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btneliminarreceta_Internalname, tblTabledvelop_confirmpanel_btneliminarreceta_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btneliminarreceta.setProperty("Title", Dvelop_confirmpanel_btneliminarreceta_Title);
         ucDvelop_confirmpanel_btneliminarreceta.setProperty("ConfirmationText", Dvelop_confirmpanel_btneliminarreceta_Confirmationtext);
         ucDvelop_confirmpanel_btneliminarreceta.setProperty("YesButtonCaption", Dvelop_confirmpanel_btneliminarreceta_Yesbuttoncaption);
         ucDvelop_confirmpanel_btneliminarreceta.setProperty("NoButtonCaption", Dvelop_confirmpanel_btneliminarreceta_Nobuttoncaption);
         ucDvelop_confirmpanel_btneliminarreceta.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btneliminarreceta_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btneliminarreceta.setProperty("YesButtonPosition", Dvelop_confirmpanel_btneliminarreceta_Yesbuttonposition);
         ucDvelop_confirmpanel_btneliminarreceta.setProperty("ConfirmType", Dvelop_confirmpanel_btneliminarreceta_Confirmtype);
         ucDvelop_confirmpanel_btneliminarreceta.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btneliminarreceta_Internalname, "DVELOP_CONFIRMPANEL_BTNELIMINARRECETAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNELIMINARRECETAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_64_1FO2e( true) ;
      }
      else
      {
         wb_table1_64_1FO2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      pa1FO2( ) ;
      ws1FO2( ) ;
      we1FO2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20269178553528", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/recetadetinte00_wp.js", "?20269178553528", false, true);
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
      imgavPrompt_Internalname = "vPROMPT" ;
      bttBtnuseraction1_Internalname = "BTNUSERACTION1" ;
      bttBtneliminarreceta_Internalname = "BTNELIMINARRECETA" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_btneliminarreceta_Internalname = "DVELOP_CONFIRMPANEL_BTNELIMINARRECETA" ;
      tblTabledvelop_confirmpanel_btneliminarreceta_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNELIMINARRECETA" ;
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
      bttBtneliminarreceta_Enabled = 1 ;
      imgavPrompt_Jsonclick = "" ;
      imgavPrompt_gximage = "" ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      Dvelop_confirmpanel_btneliminarreceta_Confirmtype = "1" ;
      Dvelop_confirmpanel_btneliminarreceta_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btneliminarreceta_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btneliminarreceta_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btneliminarreceta_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btneliminarreceta_Confirmationtext = "¿Desea Eliminar la Receta?" ;
      Dvelop_confirmpanel_btneliminarreceta_Title = "" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Receta de Tinte", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV74ErrMensaje',fld:'vERRMENSAJE',pic:''},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV12Barcodm',fld:'vBARCODM',pic:'ZZZZZZZ9'},{av:'AV14Barcodreom',fld:'vBARCODREOM',pic:'9'},{av:'AV13Barcodparm',fld:'vBARCODPARM',pic:''},{av:'AV75ReclinmaqIN',fld:'vRECLINMAQIN',pic:'ZZZ9'},{av:'AV87Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV73UsurCod',fld:'vUSURCOD',pic:'',hsh:true},{av:'AV72Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV81ProductosCaderno',fld:'vPRODUCTOSCADERNO',pic:'ZZZ9',hsh:true},{av:'AV68Rct10',fld:'vRCT10',pic:'9',hsh:true},{av:'AV52Msg10',fld:'vMSG10',pic:'',hsh:true},{av:'AV24BlockC',fld:'vBLOCKC',pic:'9',hsh:true},{av:'AV50Msg0',fld:'vMSG0',pic:'',hsh:true},{av:'AV37FlagIdioma',fld:'vFLAGIDIOMA',pic:'9',hsh:true},{av:'AV93Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV75ReclinmaqIN',fld:'vRECLINMAQIN',pic:'ZZZ9'},{av:'AV13Barcodparm',fld:'vBARCODPARM',pic:''},{av:'AV14Barcodreom',fld:'vBARCODREOM',pic:'9'},{av:'AV12Barcodm',fld:'vBARCODM',pic:'ZZZZZZZ9'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'Gx_msg',fld:'vMSG',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e141FO2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e151FO2',iparms:[{av:'AV11Barcad',fld:'vBARCAD',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV22Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV12Barcodm',fld:'vBARCODM',pic:'ZZZZZZZ9'},{av:'AV14Barcodreom',fld:'vBARCODREOM',pic:'9'},{av:'AV13Barcodparm',fld:'vBARCODPARM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A13890BarHDSusp',fld:'BARHDSUSP',pic:'9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A6434BarAsi',fld:'BARASI',pic:'9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV66Ok',fld:'vOK',pic:'9'},{av:'AV39FORPRO',fld:'vFORPRO',pic:''},{av:'AV40ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV38Forblo',fld:'vFORBLO',pic:'@!'},{av:'A13710HayRec',fld:'HAYREC',pic:'9'}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV13Barcodparm',fld:'vBARCODPARM',pic:''},{av:'AV74ErrMensaje',fld:'vERRMENSAJE',pic:''},{av:'AV11Barcad',fld:'vBARCAD',pic:'9'},{av:'AV18BarHDSusp',fld:'vBARHDSUSP',pic:'9'},{av:'AV9BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV22Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV12Barcodm',fld:'vBARCODM',pic:'ZZZZZZZ9'},{av:'AV14Barcodreom',fld:'vBARCODREOM',pic:'9'},{av:'AV66Ok',fld:'vOK',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38Forblo',fld:'vFORBLO',pic:'@!'},{av:'AV40ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV39FORPRO',fld:'vFORPRO',pic:''},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV36ErrReceta',fld:'vERRRECETA',pic:'9'}]}");
      setEventMetadata("'DOELIMINARRECETA'","{handler:'e111FO1',iparms:[{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV22Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV36ErrReceta',fld:'vERRRECETA',pic:'9'},{av:'AV12Barcodm',fld:'vBARCODM',pic:'ZZZZZZZ9'},{av:'AV14Barcodreom',fld:'vBARCODREOM',pic:'9'},{av:'AV13Barcodparm',fld:'vBARCODPARM',pic:''}]");
      setEventMetadata("'DOELIMINARRECETA'",",oparms:[{av:'Dvelop_confirmpanel_btneliminarreceta_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNELIMINARRECETA',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINARRECETA.CLOSE","{handler:'e121FO2',iparms:[{av:'Dvelop_confirmpanel_btneliminarreceta_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNELIMINARRECETA',prop:'Result'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV12Barcodm',fld:'vBARCODM',pic:'ZZZZZZZ9'},{av:'AV14Barcodreom',fld:'vBARCODREOM',pic:'9'},{av:'AV13Barcodparm',fld:'vBARCODPARM',pic:''},{av:'AV87Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV93Pgmname',fld:'vPGMNAME',pic:''},{av:'AV73UsurCod',fld:'vUSURCOD',pic:'',hsh:true},{av:'AV72Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINARRECETA.CLOSE",",oparms:[{av:'AV13Barcodparm',fld:'vBARCODPARM',pic:''},{av:'AV14Barcodreom',fld:'vBARCODREOM',pic:'9'},{av:'AV12Barcodm',fld:'vBARCODM',pic:'ZZZZZZZ9'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'}]}");
      setEventMetadata("VPROMPT.CLICK","{handler:'e191FO2',iparms:[{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("VPROMPT.CLICK",",oparms:[{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("ENTER","{handler:'e171FO2',iparms:[{av:'AV11Barcad',fld:'vBARCAD',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV18BarHDSusp',fld:'vBARHDSUSP',pic:'9'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV9BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV68Rct10',fld:'vRCT10',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV12Barcodm',fld:'vBARCODM',pic:'ZZZZZZZ9'},{av:'AV14Barcodreom',fld:'vBARCODREOM',pic:'9'},{av:'AV13Barcodparm',fld:'vBARCODPARM',pic:''},{av:'AV65NumRecs',fld:'vNUMRECS',pic:'ZZZ9'},{av:'AV69Reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV22Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV52Msg10',fld:'vMSG10',pic:'',hsh:true},{av:'AV38Forblo',fld:'vFORBLO',pic:'@!'},{av:'AV24BlockC',fld:'vBLOCKC',pic:'9',hsh:true},{av:'AV50Msg0',fld:'vMSG0',pic:'',hsh:true},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A13890BarHDSusp',fld:'BARHDSUSP',pic:'9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A6434BarAsi',fld:'BARASI',pic:'9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV66Ok',fld:'vOK',pic:'9'},{av:'AV39FORPRO',fld:'vFORPRO',pic:''},{av:'AV40ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'A13710HayRec',fld:'HAYREC',pic:'9'},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'A6634BarRecAcb',fld:'BARRECACB',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A9808HreRacab',fld:'HRERACAB',pic:''},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'AV37FlagIdioma',fld:'vFLAGIDIOMA',pic:'9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV36ErrReceta',fld:'vERRRECETA',pic:'9'},{av:'AV69Reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV65NumRecs',fld:'vNUMRECS',pic:'ZZZ9'},{av:'AV13Barcodparm',fld:'vBARCODPARM',pic:''},{av:'AV14Barcodreom',fld:'vBARCODREOM',pic:'9'},{av:'AV12Barcodm',fld:'vBARCODM',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_msg',fld:'vMSG',pic:''},{ctrl:'BTNELIMINARRECETA',prop:'Enabled'},{av:'AV74ErrMensaje',fld:'vERRMENSAJE',pic:''},{av:'AV75ReclinmaqIN',fld:'vRECLINMAQIN',pic:'ZZZ9'},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV11Barcad',fld:'vBARCAD',pic:'9'},{av:'AV18BarHDSusp',fld:'vBARHDSUSP',pic:'9'},{av:'AV9BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV22Barsit',fld:'vBARSIT',pic:'Z9'},{av:'AV66Ok',fld:'vOK',pic:'9'},{av:'AV38Forblo',fld:'vFORBLO',pic:'@!'},{av:'AV40ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV39FORPRO',fld:'vFORPRO',pic:''},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
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
      Dvelop_confirmpanel_btneliminarreceta_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV73UsurCod = "" ;
      AV72Station = "" ;
      AV52Msg10 = "" ;
      AV50Msg0 = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV93Pgmname = "" ;
      AV33EmprCod = "" ;
      AV13Barcodparm = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      A5253BarAcc = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      AV39FORPRO = "" ;
      AV40ForRelBan = DecimalUtil.ZERO ;
      AV38Forblo = "" ;
      AV74ErrMensaje = "" ;
      Gx_msg = "" ;
      AV9BarAgrEst = "" ;
      A1935BarParTin = "" ;
      A6634BarRecAcb = "" ;
      A4494HreBarPar = "" ;
      A9808HreRacab = "" ;
      A122BarAgrPar = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV7BarCodPar = "" ;
      AV80Prompt = "" ;
      AV94Prompt_GXI = "" ;
      sImgUrl = "" ;
      bttBtnuseraction1_Jsonclick = "" ;
      bttBtneliminarreceta_Jsonclick = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H01FO2_A396EmprCod = new String[] {""} ;
      hsh = "" ;
      AV34EmprNom = "" ;
      AV51Msg1 = "" ;
      AV55Msg2 = "" ;
      AV56Msg3 = "" ;
      AV57Msg4 = "" ;
      AV58Msg5 = "" ;
      AV59Msg6 = "" ;
      AV60Msg7 = "" ;
      AV61Msg8 = "" ;
      AV62Msg9 = "" ;
      GXt_char1 = "" ;
      AV86ErrorMessage = "" ;
      AV43Inc_obs = "" ;
      AV82Varmsg = "" ;
      AV88totalkilos = DecimalUtil.ZERO ;
      GXv_int12 = new short[1] ;
      GXv_int8 = new short[1] ;
      H01FO3_A130BarCodPar = new String[] {""} ;
      H01FO3_A132BarCodReo = new byte[1] ;
      H01FO3_A129BarCod = new int[1] ;
      H01FO3_A396EmprCod = new String[] {""} ;
      H01FO3_A122BarAgrPar = new String[] {""} ;
      H01FO3_A124BarAgrReo = new byte[1] ;
      H01FO3_A119BarAgrCod = new int[1] ;
      H01FO4_A3646EstTinAny = new short[1] ;
      H01FO4_A3647EstTinMes = new byte[1] ;
      H01FO4_A3648EstTinDia = new byte[1] ;
      H01FO4_A1929EstTinNr = new short[1] ;
      H01FO4_A6634BarRecAcb = new String[] {""} ;
      H01FO4_n6634BarRecAcb = new boolean[] {false} ;
      H01FO4_A1935BarParTin = new String[] {""} ;
      H01FO4_n1935BarParTin = new boolean[] {false} ;
      H01FO4_A1934BarReoTin = new byte[1] ;
      H01FO4_n1934BarReoTin = new boolean[] {false} ;
      H01FO4_A1933BarCodTin = new int[1] ;
      H01FO4_n1933BarCodTin = new boolean[] {false} ;
      H01FO4_A396EmprCod = new String[] {""} ;
      H01FO5_A4495HreNumCie = new byte[1] ;
      H01FO5_A9808HreRacab = new String[] {""} ;
      H01FO5_n9808HreRacab = new boolean[] {false} ;
      H01FO5_A4494HreBarPar = new String[] {""} ;
      H01FO5_A4493HreBarReo = new byte[1] ;
      H01FO5_A4492HreBarCod = new int[1] ;
      H01FO5_A396EmprCod = new String[] {""} ;
      H01FO7_A120BarAgrEst = new String[] {""} ;
      H01FO7_A5253BarAcc = new String[] {""} ;
      H01FO7_A6434BarAsi = new byte[1] ;
      H01FO7_A213BarSit = new byte[1] ;
      H01FO7_A252CliCod = new int[1] ;
      H01FO7_n252CliCod = new boolean[] {false} ;
      H01FO7_A212BarSer = new String[] {""} ;
      H01FO7_A135BarColNom = new String[] {""} ;
      H01FO7_A136BarColNum = new int[1] ;
      H01FO7_A218BarTipCol = new byte[1] ;
      H01FO7_A1234BarNomCli = new String[] {""} ;
      H01FO7_A1235BarNumCli = new int[1] ;
      H01FO7_A361DisCod = new int[1] ;
      H01FO7_A13890BarHDSusp = new byte[1] ;
      H01FO7_n13890BarHDSusp = new boolean[] {false} ;
      H01FO7_A130BarCodPar = new String[] {""} ;
      H01FO7_A132BarCodReo = new byte[1] ;
      H01FO7_A129BarCod = new int[1] ;
      H01FO7_A396EmprCod = new String[] {""} ;
      AV8BarAcc = "" ;
      AV21Barser = "" ;
      AV15BarcolNom = "" ;
      AV19BarNomcli = "" ;
      H01FO9_A130BarCodPar = new String[] {""} ;
      H01FO9_A132BarCodReo = new byte[1] ;
      H01FO9_A129BarCod = new int[1] ;
      H01FO9_A396EmprCod = new String[] {""} ;
      H01FO9_A120BarAgrEst = new String[] {""} ;
      H01FO9_A5253BarAcc = new String[] {""} ;
      H01FO9_A6434BarAsi = new byte[1] ;
      H01FO9_A213BarSit = new byte[1] ;
      H01FO9_A252CliCod = new int[1] ;
      H01FO9_n252CliCod = new boolean[] {false} ;
      H01FO9_A212BarSer = new String[] {""} ;
      H01FO9_A135BarColNom = new String[] {""} ;
      H01FO9_A136BarColNum = new int[1] ;
      H01FO9_A218BarTipCol = new byte[1] ;
      H01FO9_A1234BarNomCli = new String[] {""} ;
      H01FO9_A1235BarNumCli = new int[1] ;
      H01FO9_A361DisCod = new int[1] ;
      H01FO9_A13890BarHDSusp = new byte[1] ;
      H01FO9_n13890BarHDSusp = new boolean[] {false} ;
      GXv_int6 = new byte[1] ;
      GXv_char14 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_char10 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_char2 = new String[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_btneliminarreceta = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetinte00_wp__default(),
         new Object[] {
             new Object[] {
            H01FO2_A396EmprCod
            }
            , new Object[] {
            H01FO3_A130BarCodPar, H01FO3_A132BarCodReo, H01FO3_A129BarCod, H01FO3_A396EmprCod, H01FO3_A122BarAgrPar, H01FO3_A124BarAgrReo, H01FO3_A119BarAgrCod
            }
            , new Object[] {
            H01FO4_A3646EstTinAny, H01FO4_A3647EstTinMes, H01FO4_A3648EstTinDia, H01FO4_A1929EstTinNr, H01FO4_A6634BarRecAcb, H01FO4_n6634BarRecAcb, H01FO4_A1935BarParTin, H01FO4_n1935BarParTin, H01FO4_A1934BarReoTin, H01FO4_n1934BarReoTin,
            H01FO4_A1933BarCodTin, H01FO4_n1933BarCodTin, H01FO4_A396EmprCod
            }
            , new Object[] {
            H01FO5_A4495HreNumCie, H01FO5_A9808HreRacab, H01FO5_n9808HreRacab, H01FO5_A4494HreBarPar, H01FO5_A4493HreBarReo, H01FO5_A4492HreBarCod, H01FO5_A396EmprCod
            }
            , new Object[] {
            H01FO7_A120BarAgrEst, H01FO7_A5253BarAcc, H01FO7_A6434BarAsi, H01FO7_A213BarSit, H01FO7_A252CliCod, H01FO7_n252CliCod, H01FO7_A212BarSer, H01FO7_A135BarColNom, H01FO7_A136BarColNum, H01FO7_A218BarTipCol,
            H01FO7_A1234BarNomCli, H01FO7_A1235BarNumCli, H01FO7_A361DisCod, H01FO7_A13890BarHDSusp, H01FO7_n13890BarHDSusp, H01FO7_A130BarCodPar, H01FO7_A132BarCodReo, H01FO7_A129BarCod, H01FO7_A396EmprCod
            }
            , new Object[] {
            H01FO9_A130BarCodPar, H01FO9_A132BarCodReo, H01FO9_A129BarCod, H01FO9_A396EmprCod, H01FO9_A120BarAgrEst, H01FO9_A5253BarAcc, H01FO9_A6434BarAsi, H01FO9_A213BarSit, H01FO9_A252CliCod, H01FO9_n252CliCod,
            H01FO9_A212BarSer, H01FO9_A135BarColNom, H01FO9_A136BarColNum, H01FO9_A218BarTipCol, H01FO9_A1234BarNomCli, H01FO9_A1235BarNumCli, H01FO9_A361DisCod, H01FO9_A13890BarHDSusp, H01FO9_n13890BarHDSusp
            }
         }
      );
      AV93Pgmname = "FormulacionTinte.RecetadeTinte00_WP" ;
      /* GeneXus formulas. */
      AV93Pgmname = "FormulacionTinte.RecetadeTinte00_WP" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV68Rct10 ;
   private byte AV24BlockC ;
   private byte AV37FlagIdioma ;
   private byte AV11Barcad ;
   private byte AV22Barsit ;
   private byte AV14Barcodreom ;
   private byte A132BarCodReo ;
   private byte A13890BarHDSusp ;
   private byte A6434BarAsi ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte AV66Ok ;
   private byte A13710HayRec ;
   private byte AV36ErrReceta ;
   private byte AV18BarHDSusp ;
   private byte A1934BarReoTin ;
   private byte A4493HreBarReo ;
   private byte A124BarAgrReo ;
   private byte AV6BarCodReo ;
   private byte nDonePA ;
   private byte GXt_int5 ;
   private byte AV10BarAsi ;
   private byte AV23BarTipCol ;
   private byte AV41HdMin ;
   private byte GXv_int6[] ;
   private byte GXv_int9[] ;
   private byte nGXWrapped ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV87Automata ;
   private short AV81ProductosCaderno ;
   private short AV75ReclinmaqIN ;
   private short AV65NumRecs ;
   private short AV69Reclinmaq ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV76Carvitin ;
   private short AV89FlagFo13 ;
   private short GXv_int12[] ;
   private short GXv_int8[] ;
   private short AV45Lconti ;
   private short AV42Hisreh ;
   private int AV12Barcodm ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A361DisCod ;
   private int A1933BarCodTin ;
   private int A4492HreBarCod ;
   private int A119BarAgrCod ;
   private int AV5BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int bttBtneliminarreceta_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV28Clicod ;
   private int AV16Barcolnum ;
   private int AV20Barnumcli ;
   private int AV32Discod ;
   private int GXv_int13[] ;
   private int GXv_int7[] ;
   private int idxLst ;
   private java.math.BigDecimal AV40ForRelBan ;
   private java.math.BigDecimal AV88totalkilos ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private String Dvelop_confirmpanel_btneliminarreceta_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV73UsurCod ;
   private String AV72Station ;
   private String AV52Msg10 ;
   private String AV50Msg0 ;
   private String GXKey ;
   private String AV93Pgmname ;
   private String AV33EmprCod ;
   private String AV13Barcodparm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String A5253BarAcc ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String AV39FORPRO ;
   private String AV38Forblo ;
   private String Gx_msg ;
   private String AV9BarAgrEst ;
   private String A1935BarParTin ;
   private String A6634BarRecAcb ;
   private String A4494HreBarPar ;
   private String A9808HreRacab ;
   private String A122BarAgrPar ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Dvelop_confirmpanel_btneliminarreceta_Title ;
   private String Dvelop_confirmpanel_btneliminarreceta_Confirmationtext ;
   private String Dvelop_confirmpanel_btneliminarreceta_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btneliminarreceta_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btneliminarreceta_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btneliminarreceta_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btneliminarreceta_Confirmtype ;
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
   private String divTable_filtrosgenerales_Internalname ;
   private String edtavBarcod_Internalname ;
   private String TempTags ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String AV7BarCodPar ;
   private String edtavBarcodpar_Jsonclick ;
   private String imgavPrompt_Internalname ;
   private String imgavPrompt_gximage ;
   private String sImgUrl ;
   private String imgavPrompt_Jsonclick ;
   private String bttBtnuseraction1_Internalname ;
   private String bttBtnuseraction1_Jsonclick ;
   private String bttBtneliminarreceta_Internalname ;
   private String bttBtneliminarreceta_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String hsh ;
   private String AV34EmprNom ;
   private String AV51Msg1 ;
   private String AV55Msg2 ;
   private String AV56Msg3 ;
   private String AV57Msg4 ;
   private String AV58Msg5 ;
   private String AV59Msg6 ;
   private String AV60Msg7 ;
   private String AV61Msg8 ;
   private String AV62Msg9 ;
   private String GXt_char1 ;
   private String AV8BarAcc ;
   private String AV21Barser ;
   private String AV15BarcolNom ;
   private String AV19BarNomcli ;
   private String GXv_char14[] ;
   private String GXv_char10[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_btneliminarreceta_Internalname ;
   private String Dvelop_confirmpanel_btneliminarreceta_Internalname ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean AV80Prompt_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n6634BarRecAcb ;
   private boolean n1935BarParTin ;
   private boolean n1934BarReoTin ;
   private boolean n1933BarCodTin ;
   private boolean n9808HreRacab ;
   private boolean n252CliCod ;
   private boolean n13890BarHDSusp ;
   private String AV74ErrMensaje ;
   private String AV94Prompt_GXI ;
   private String AV86ErrorMessage ;
   private String AV43Inc_obs ;
   private String AV82Varmsg ;
   private String AV80Prompt ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btneliminarreceta ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H01FO2_A396EmprCod ;
   private String[] H01FO3_A130BarCodPar ;
   private byte[] H01FO3_A132BarCodReo ;
   private int[] H01FO3_A129BarCod ;
   private String[] H01FO3_A396EmprCod ;
   private String[] H01FO3_A122BarAgrPar ;
   private byte[] H01FO3_A124BarAgrReo ;
   private int[] H01FO3_A119BarAgrCod ;
   private short[] H01FO4_A3646EstTinAny ;
   private byte[] H01FO4_A3647EstTinMes ;
   private byte[] H01FO4_A3648EstTinDia ;
   private short[] H01FO4_A1929EstTinNr ;
   private String[] H01FO4_A6634BarRecAcb ;
   private boolean[] H01FO4_n6634BarRecAcb ;
   private String[] H01FO4_A1935BarParTin ;
   private boolean[] H01FO4_n1935BarParTin ;
   private byte[] H01FO4_A1934BarReoTin ;
   private boolean[] H01FO4_n1934BarReoTin ;
   private int[] H01FO4_A1933BarCodTin ;
   private boolean[] H01FO4_n1933BarCodTin ;
   private String[] H01FO4_A396EmprCod ;
   private byte[] H01FO5_A4495HreNumCie ;
   private String[] H01FO5_A9808HreRacab ;
   private boolean[] H01FO5_n9808HreRacab ;
   private String[] H01FO5_A4494HreBarPar ;
   private byte[] H01FO5_A4493HreBarReo ;
   private int[] H01FO5_A4492HreBarCod ;
   private String[] H01FO5_A396EmprCod ;
   private String[] H01FO7_A120BarAgrEst ;
   private String[] H01FO7_A5253BarAcc ;
   private byte[] H01FO7_A6434BarAsi ;
   private byte[] H01FO7_A213BarSit ;
   private int[] H01FO7_A252CliCod ;
   private boolean[] H01FO7_n252CliCod ;
   private String[] H01FO7_A212BarSer ;
   private String[] H01FO7_A135BarColNom ;
   private int[] H01FO7_A136BarColNum ;
   private byte[] H01FO7_A218BarTipCol ;
   private String[] H01FO7_A1234BarNomCli ;
   private int[] H01FO7_A1235BarNumCli ;
   private int[] H01FO7_A361DisCod ;
   private byte[] H01FO7_A13890BarHDSusp ;
   private boolean[] H01FO7_n13890BarHDSusp ;
   private String[] H01FO7_A130BarCodPar ;
   private byte[] H01FO7_A132BarCodReo ;
   private int[] H01FO7_A129BarCod ;
   private String[] H01FO7_A396EmprCod ;
   private String[] H01FO9_A130BarCodPar ;
   private byte[] H01FO9_A132BarCodReo ;
   private int[] H01FO9_A129BarCod ;
   private String[] H01FO9_A396EmprCod ;
   private String[] H01FO9_A120BarAgrEst ;
   private String[] H01FO9_A5253BarAcc ;
   private byte[] H01FO9_A6434BarAsi ;
   private byte[] H01FO9_A213BarSit ;
   private int[] H01FO9_A252CliCod ;
   private boolean[] H01FO9_n252CliCod ;
   private String[] H01FO9_A212BarSer ;
   private String[] H01FO9_A135BarColNom ;
   private int[] H01FO9_A136BarColNum ;
   private byte[] H01FO9_A218BarTipCol ;
   private String[] H01FO9_A1234BarNomCli ;
   private int[] H01FO9_A1235BarNumCli ;
   private int[] H01FO9_A361DisCod ;
   private byte[] H01FO9_A13890BarHDSusp ;
   private boolean[] H01FO9_n13890BarHDSusp ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class recetadetinte00_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01FO2", "SELECT EmprCod FROM TXPEMPRES ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FO3", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FO4", "SELECT EstTinAny, EstTinMes, EstTinDia, EstTinNr, BarRecAcb, BarParTin, BarReoTin, BarCodTin, EmprCod FROM TXPLCONTI WHERE EmprCod = ? and BarCodTin = ? and BarReoTin = ? and BarParTin = ? ORDER BY EmprCod, BarCodTin, BarReoTin, BarParTin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FO5", "SELECT HreNumCie, HreRacab, HreBarPar, HreBarReo, HreBarCod, EmprCod FROM TXPHISREH WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FO7", "SELECT T1.BarAgrEst, T1.BarAcc, T1.BarAsi, T1.BarSit, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarNomCli, T1.BarNumCli, T1.DisCod, COALESCE( T2.BarHDSusp, 0) AS BarHDSusp, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN (SELECT MIN(T3.Stp_Est) AS BarHDSusp, T4.BarCod, T4.BarCodReo, T4.BarCodPar FROM (TXPHDSTO1 T3 INNER JOIN TXPBARCAD T4 ON T4.EmprCod = T3.EmprCod) WHERE (T3.EmprCod = ?) AND (T4.BarCod = T3.Stp_hdr) AND (T4.BarCodReo = T3.Stp_r) AND (T4.BarCodPar = T3.Stp_p) AND (T3.Stp_Est = 1) GROUP BY T4.BarCod, T4.BarCodReo, T4.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01FO9", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarAgrEst, T1.BarAcc, T1.BarAsi, T1.BarSit, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarNomCli, T1.BarNumCli, T1.DisCod, COALESCE( T2.BarHDSusp, 0) AS BarHDSusp FROM (TXPBARCAD T1 LEFT JOIN (SELECT MIN(T3.Stp_Est) AS BarHDSusp, T4.BarCod, T4.BarCodReo, T4.BarCodPar FROM (TXPHDSTO1 T3 INNER JOIN TXPBARCAD T4 ON T4.EmprCod = T3.EmprCod) WHERE (T3.EmprCod = ?) AND (T4.BarCod = T3.Stp_hdr) AND (T4.BarCodReo = T3.Stp_r) AND (T4.BarCodPar = T3.Stp_p) AND (T3.Stp_Est = 1) GROUP BY T4.BarCod, T4.BarCodReo, T4.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

