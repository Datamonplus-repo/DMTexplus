package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class reoperadosinternos_impl extends GXDataArea
{
   public reoperadosinternos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public reoperadosinternos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( reoperadosinternos_impl.class ));
   }

   public reoperadosinternos_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavTinte = UIFactory.getCheckbox(this);
      chkavAcabado = UIFactory.getCheckbox(this);
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
      pa15G2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start15G2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.reoperadosinternos", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32TinEst), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTEXTIL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35Artextil), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOCIERRE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31NoCierre), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOUTBARCOSANY", getSecureSignedToken( "", localUtil.format( AV66outBarcosany, "ZZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTSELECTIONHDR", AV50SDTSelectionHDR);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTSELECTIONHDR", AV50SDTSelectionHDR);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV17EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vAGRUPA", GXutil.rtrim( AV10Agrupa));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGEXISTE", GXutil.ltrim( localUtil.ntoc( AV46FlagExiste, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIT", GXutil.ltrim( localUtil.ntoc( AV8Sit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGRECA", GXutil.ltrim( localUtil.ntoc( AV24FlagReca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGREC", GXutil.ltrim( localUtil.ntoc( AV18FlagRec, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG_NR", GXutil.ltrim( localUtil.ntoc( AV30Flag_nr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINEST", GXutil.ltrim( localUtil.ntoc( AV32TinEst, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32TinEst), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUM_P", GXutil.ltrim( localUtil.ntoc( AV11Num_p, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUM_P1", GXutil.ltrim( localUtil.ntoc( AV13Num_p1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARDES", GXutil.rtrim( AV9BarDes));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTEXTIL", GXutil.ltrim( localUtil.ntoc( AV35Artextil, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTEXTIL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35Artextil), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNHDR", GXutil.rtrim( AV36BarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPIE", GXutil.ltrim( localUtil.ntoc( AV39Barpie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNIMED", GXutil.rtrim( AV40BarUnimed));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARKGM", GXutil.ltrim( localUtil.ntoc( AV37Barkgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMTR", GXutil.ltrim( localUtil.ntoc( AV38Barmtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOSANY", GXutil.ltrim( localUtil.ntoc( AV41Barcosany, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOSPRO", GXutil.ltrim( localUtil.ntoc( AV42Barcospro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPRI", GXutil.rtrim( AV45BarPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV22UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSITEST", GXutil.ltrim( localUtil.ntoc( A4400BarSitEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKGM", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMTR", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOSANY", GXutil.ltrim( localUtil.ntoc( A140BarCosAny, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOSPRO", GXutil.ltrim( localUtil.ntoc( A141BarCosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARUNIMED", GXutil.rtrim( A228BarUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNHDR", GXutil.rtrim( A13696BarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPRI", GXutil.rtrim( A209BarPri));
      app.GxWebStd.gx_hidden_field( httpContext, "HAYREC", GXutil.ltrim( localUtil.ntoc( A13710HayRec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIECOD", GXutil.rtrim( A200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEEST", GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECACAB", GXutil.rtrim( A6039RecAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "RECVOLPRD", GXutil.ltrim( localUtil.ntoc( A2805RecVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLINMAQ", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHDRACA", GXutil.ltrim( localUtil.ntoc( AV26Hdraca, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD_P", GXutil.ltrim( localUtil.ntoc( AV27BarCod_p, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCODREO_P", GXutil.ltrim( localUtil.ntoc( AV28CodReo_p, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCODPAR", GXutil.rtrim( AV29CodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOCIERRE", GXutil.ltrim( localUtil.ntoc( AV31NoCierre, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOCIERRE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31NoCierre), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMLIN", GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMCOD", GXutil.rtrim( A1056DisComCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FONCOD", GXutil.rtrim( A1032FonCod));
      app.GxWebStd.gx_hidden_field( httpContext, "RECMOLCOD", GXutil.ltrim( localUtil.ntoc( A2124RecMolCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECMOLLIN", GXutil.ltrim( localUtil.ntoc( A2126RecMolLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPASLIN", GXutil.ltrim( localUtil.ntoc( A2672RecPasLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_BARCOD", GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_BARREO", GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "AC_BARPAR", GXutil.rtrim( A6033Ac_BarPar));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vREFRESCAR", AV64Refrescar);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOBJETOREFRESCAR", AV56ObjetoRefrescar);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOBJETOREFRESCAR", AV56ObjetoRefrescar);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vOUTBARCOSANY", GXutil.ltrim( localUtil.ntoc( AV66outBarcosany, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOUTBARCOSANY", getSecureSignedToken( "", localUtil.format( AV66outBarcosany, "ZZZZZZ9.99")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminaragrupacion_Result));
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
         we15G2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt15G2( ) ;
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
      return formatLink("app.reoperadosinternos", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ReoperadosInternos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Reoperados Internos", "") ;
   }

   public void wb15G0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ReoperadosInternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV6BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV6BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ReoperadosInternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV7BarCodPar), GXutil.rtrim( localUtil.format( AV7BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ReoperadosInternos.htm");
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
         AV47Prompt_IsBlob = (boolean)(((GXutil.strcmp("", AV47Prompt)==0)&&(GXutil.strcmp("", AV71Prompt_GXI)==0))||!(GXutil.strcmp("", AV47Prompt)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV47Prompt)==0) ? AV71Prompt_GXI : httpContext.getResourceRelative(AV47Prompt)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPrompt_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 5, imgavPrompt_Jsonclick, "'"+""+"'"+",false,"+"'"+"EVPROMPT.CLICK."+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV47Prompt_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ReoperadosInternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablaeliminaragrupacion_Internalname, divTablaeliminaragrupacion_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminaragrupacion_Internalname, "", httpContext.getMessage( "Eliminar Agrupacion", ""), bttBtneliminaragrupacion_Jsonclick, 7, httpContext.getMessage( "Eliminar Agrupacion", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1115g1_client"+"'", TempTags, "", 2, "HLP_ReoperadosInternos.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_ReoperadosInternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavTinte.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavTinte.getInternalname(), httpContext.getMessage( "Tinte?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavTinte.getInternalname(), AV48Tinte, "", httpContext.getMessage( "Tinte?", ""), 1, chkavTinte.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(65, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,65);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavAcabado.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavAcabado.getInternalname(), httpContext.getMessage( "Acabado?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavAcabado.getInternalname(), AV49Acabado, "", httpContext.getMessage( "Acabado?", ""), 1, chkavAcabado.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(69, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,69);\"");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ReoperadosInternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ReoperadosInternos.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV70Pgmname), GXutil.rtrim( localUtil.format( AV70Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ReoperadosInternos.htm");
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
         wb_table1_87_15G2( true) ;
      }
      else
      {
         wb_table1_87_15G2( false) ;
      }
      return  ;
   }

   public void wb_table1_87_15G2e( boolean wbgen )
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

   public void start15G2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Reoperados Internos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup15G0( ) ;
   }

   public void ws15G2( )
   {
      start15G2( ) ;
      evt15G2( ) ;
   }

   public void evt15G2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1215G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1315G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1415G2 ();
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
                                 e1515G2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GLOBALEVENTS.REFRESCAROBJETO") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1615G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1715G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPROMPT.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1815G2 ();
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

   public void we15G2( )
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

   public void pa15G2( )
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
      AV48Tinte = ((GXutil.strcmp(GXutil.rtrim( AV48Tinte), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Tinte", AV48Tinte);
      AV49Acabado = ((GXutil.strcmp(GXutil.rtrim( AV49Acabado), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Acabado", AV49Acabado);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf15G2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV70Pgmname = "ReoperadosInternos" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Pgmname", AV70Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf15G2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1715G2 ();
         wb15G0( ) ;
      }
   }

   public void send_integrity_lvl_hashes15G2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vTINEST", GXutil.ltrim( localUtil.ntoc( AV32TinEst, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32TinEst), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTEXTIL", GXutil.ltrim( localUtil.ntoc( AV35Artextil, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTEXTIL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35Artextil), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOCIERRE", GXutil.ltrim( localUtil.ntoc( AV31NoCierre, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOCIERRE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31NoCierre), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOUTBARCOSANY", GXutil.ltrim( localUtil.ntoc( AV66outBarcosany, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOUTBARCOSANY", getSecureSignedToken( "", localUtil.format( AV66outBarcosany, "ZZZZZZ9.99")));
   }

   public void before_start_formulas( )
   {
      AV70Pgmname = "ReoperadosInternos" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Pgmname", AV70Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup15G0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1315G2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV10Agrupa = httpContext.cgiGet( "vAGRUPA") ;
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
         Dvelop_confirmpanel_eliminaragrupacion_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Title") ;
         Dvelop_confirmpanel_eliminaragrupacion_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Confirmationtext") ;
         Dvelop_confirmpanel_eliminaragrupacion_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminaragrupacion_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminaragrupacion_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminaragrupacion_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminaragrupacion_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Confirmtype") ;
         Dvelop_confirmpanel_eliminaragrupacion_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION_Result") ;
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
         AV47Prompt = httpContext.cgiGet( imgavPrompt_Internalname) ;
         AV48Tinte = ((GXutil.strcmp(httpContext.cgiGet( chkavTinte.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Tinte", AV48Tinte);
         AV49Acabado = ((GXutil.strcmp(httpContext.cgiGet( chkavAcabado.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Acabado", AV49Acabado);
         AV70Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70Pgmname", AV70Pgmname);
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
      e1315G2 ();
      if (returnInSub) return;
   }

   public void e1315G2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV20Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      reoperadosinternos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Station = GXt_char1 ;
      GXv_char2[0] = AV17EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char4[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char2, GXv_char3, GXv_char4) ;
      reoperadosinternos_impl.this.AV17EmprCod = GXv_char2[0] ;
      reoperadosinternos_impl.this.AV21EmprNom = GXv_char3[0] ;
      reoperadosinternos_impl.this.AV22UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV22UsurCod", AV22UsurCod);
      imgavPrompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "gximage", imgavPrompt_gximage, true);
      AV47Prompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV47Prompt)==0) ? AV71Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV47Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV47Prompt), true);
      AV71Prompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV47Prompt)==0) ? AV71Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV47Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV47Prompt), true);
      AV10Agrupa = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Agrupa", AV10Agrupa);
      divTablaeliminaragrupacion_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablaeliminaragrupacion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablaeliminaragrupacion_Visible), 5, 0), true);
      AV48Tinte = "S" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Tinte", AV48Tinte);
      AV49Acabado = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Acabado", AV49Acabado);
      GXt_int5 = (byte)(AV31NoCierre) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV17EmprCod, httpContext.getMessage( "NOCLRC", ""), GXv_int6) ;
      reoperadosinternos_impl.this.GXt_int5 = GXv_int6[0] ;
      AV31NoCierre = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31NoCierre", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31NoCierre), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOCIERRE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31NoCierre), "ZZZ9")));
      AV53WebSession.remove(httpContext.getMessage( "AgrupacionSDT_001", ""));
   }

   public void e1415G2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      if ( AV50SDTSelectionHDR.size() > 0 )
      {
         AV53WebSession.setValue(httpContext.getMessage( "AgrupacionSDT_001", ""), AV50SDTSelectionHDR.toJSonString(false));
         httpContext.popup(formatLink("app.agrupacionhdr", new String[] {}, new String[] {}) , new Object[] {});
      }
      else
      {
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1215G2( )
   {
      /* Dvelop_confirmpanel_eliminaragrupacion_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminaragrupacion_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARAGRUPACION' */
         S112 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'DO ACTION ELIMINARAGRUPACION' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV17EmprCod ;
      GXv_int7[0] = AV5BarCod ;
      GXv_int6[0] = AV6BarCodReo ;
      GXv_char3[0] = AV7BarCodPar ;
      new app.peliagr(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3) ;
      reoperadosinternos_impl.this.AV17EmprCod = GXv_char4[0] ;
      reoperadosinternos_impl.this.AV5BarCod = GXv_int7[0] ;
      reoperadosinternos_impl.this.AV6BarCodReo = GXv_int6[0] ;
      reoperadosinternos_impl.this.AV7BarCodPar = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCodReo", GXutil.str( AV6BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodPar", AV7BarCodPar);
      AV10Agrupa = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Agrupa", AV10Agrupa);
      divTablaeliminaragrupacion_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablaeliminaragrupacion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablaeliminaragrupacion_Visible), 5, 0), true);
      GX_FocusControl = edtavBarcod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
   }

   public void e1815G2( )
   {
      /* Prompt_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.seleccionhdrprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(6,9,0))}, new String[] {"InEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InClicod","InBarsit"}) , new Object[] {"AV17EmprCod","AV5BarCod","AV6BarCodReo","AV7BarCodPar","",""});
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1515G2 ();
      if (returnInSub) return;
   }

   public void e1515G2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      /* Execute user subroutine: 'CONTROLES' */
      S122 ();
      if (returnInSub) return;
      divTablaeliminaragrupacion_Visible = (((GXutil.strcmp(AV10Agrupa, "N")==0) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divTablaeliminaragrupacion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablaeliminaragrupacion_Visible), 5, 0), true);
      if ( AV46FlagExiste == 0 )
      {
         lblTbmessage_Caption = httpContext.getMessage( "NO existe N Hdr", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( AV8Sit >= 9 )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Atencion N Hdr con situacion ", "")+GXutil.trim( GXutil.str( AV8Sit, 2, 0)) ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( ( AV24FlagReca > 0 ) && ( AV18FlagRec == 0 ) && ( GXutil.strcmp(AV48Tinte, "S") == 0 ) )
            {
               Gx_msg = httpContext.getMessage( "Atencion. Tiene que Eliminar la Receta de Acabado", "") + GXutil.newLine( ) ;
               Gx_msg += httpContext.getMessage( "Seguidamente,puede continuar con el REOPERADO", "") + GXutil.newLine( ) ;
               lblTbmessage_Caption = Gx_msg ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               GX_FocusControl = edtavBarcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( ( AV18FlagRec > 0 ) && ( GXutil.strcmp(AV48Tinte, "S") == 0 ) && ( AV30Flag_nr == 1 ) )
               {
                  Gx_msg = httpContext.getMessage( "Atencion. Tiene que Eliminar la Receta de TINTE", "") + GXutil.newLine( ) ;
                  Gx_msg += httpContext.getMessage( "Seguidamente,puede continuar con el REOPERADO", "") + GXutil.newLine( ) ;
                  lblTbmessage_Caption = Gx_msg ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  GX_FocusControl = edtavBarcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  if ( ( AV24FlagReca > 0 ) && ( GXutil.strcmp(AV49Acabado, "S") == 0 ) && ( AV30Flag_nr == 1 ) )
                  {
                     Gx_msg = httpContext.getMessage( "Atencion. Tiene que Eliminar o Cerrar la Receta de Tinte", "") + GXutil.newLine( ) ;
                     Gx_msg += httpContext.getMessage( "Seguidamente,puede continuar con el reoperado de Acabado", "") + GXutil.newLine( ) ;
                     lblTbmessage_Caption = Gx_msg ;
                     httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                     GX_FocusControl = edtavBarcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( ( GXutil.strcmp(AV48Tinte, httpContext.getMessage( "N", "")) == 0 ) && ( GXutil.strcmp(AV49Acabado, httpContext.getMessage( "N", "")) == 0 ) )
                     {
                        Gx_msg = ((AV32TinEst==0) ? httpContext.getMessage( "Atencion. Falta indicar Tinte o Acabado", "") : httpContext.getMessage( "Atencion. Falta indicar Tinte o Acabado o Estampacion", "")) ;
                        lblTbmessage_Caption = Gx_msg ;
                        httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                        GX_FocusControl = edtavBarcod_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        if ( ( AV11Num_p == AV13Num_p1 ) && ( AV11Num_p > 0 ) && ( AV13Num_p1 > 0 ) && ( GXutil.strcmp(AV9BarDes, httpContext.getMessage( "S", "")) == 0 ) && ( AV35Artextil == 0 ) )
                        {
                           lblTbmessage_Caption = httpContext.getMessage( "Las Piezas estan todas cerradas¡¡¡", "") ;
                           httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                           GX_FocusControl = edtavBarcod_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                        }
                        else
                        {
                           if ( GXutil.strcmp(AV10Agrupa, "S") == 0 )
                           {
                              lblTbmessage_Caption = httpContext.getMessage( "Atencion. La HDR, esta AGRUPADA. Elimine la AGRUPACION.¡¡¡", "") ;
                              httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                              GX_FocusControl = edtavBarcod_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              httpContext.doAjaxSetFocus(GX_FocusControl);
                           }
                           else
                           {
                              if ( GXutil.strcmp(AV9BarDes, "S") == 0 )
                              {
                                 lblTbmessage_Caption = httpContext.getMessage( "Opcion con detalle de rollos NO programada", "") ;
                                 httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                                 GX_FocusControl = edtavBarcod_Internalname ;
                                 httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                                 httpContext.doAjaxSetFocus(GX_FocusControl);
                              }
                              else
                              {
                                 httpContext.popup(formatLink("app.webreoperadosinternoskilosmetrospiezas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV36BarNHdr)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV7BarCodPar)),GXutil.URLEncode(DecimalUtil.decToString(AV37Barkgm)),GXutil.URLEncode(DecimalUtil.decToString(AV38Barmtr)),GXutil.URLEncode(GXutil.ltrimstr(AV39Barpie,6,0)),GXutil.URLEncode(GXutil.rtrim(AV40BarUnimed)),GXutil.URLEncode(GXutil.ltrimstr(AV8Sit,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV37Barkgm)),GXutil.URLEncode(DecimalUtil.decToString(AV38Barmtr)),GXutil.URLEncode(DecimalUtil.decToString(AV41Barcosany)),GXutil.URLEncode(DecimalUtil.decToString(AV42Barcospro)),GXutil.URLEncode(GXutil.rtrim(AV45BarPri)),GXutil.URLEncode(GXutil.rtrim(AV22UsurCod))}, new String[] {"Emprcod","BarNHdr","Barcod","Barcodreo","Barcodpar","BarKgm","BarMtr","BarPie","BarUnimed","BarSit","KilAct","MtrAct","BarCosAny","BarCosPro","prior","UsurCod"}) , new Object[] {"AV17EmprCod","AV36BarNHdr","AV5BarCod","AV6BarCodReo","AV7BarCodPar","AV37Barkgm","AV38Barmtr","AV39Barpie","AV40BarUnimed","AV8Sit","AV37Barkgm","AV38Barmtr","AV41Barcosany","AV42Barcospro","AV45BarPri","AV22UsurCod"});
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

   public void e1615G2( )
   {
      /* GlobalEvents_Refrescarobjeto Routine */
      returnInSub = false ;
      if ( ( AV56ObjetoRefrescar.indexof(httpContext.getMessage( "Reoperado", "")) > 0 ) && AV64Refrescar )
      {
         AV62OUTConReo = (byte)(GXutil.lval( (String)AV56ObjetoRefrescar.elementAt(-1+2))) ;
         GXv_decimal8[0] = AV41Barcosany ;
         GXv_decimal9[0] = AV57outBarcospro ;
         GXv_decimal10[0] = AV58outBarkgm ;
         GXv_decimal11[0] = AV59outBarmtr ;
         GXv_int7[0] = AV60outBarpie ;
         GXv_int6[0] = AV61outbarsit ;
         GXv_int12[0] = AV67outdiscod ;
         new app.pedidosclientesindetalle.getdatosnc(remoteHandle, context).execute( AV17EmprCod, AV5BarCod, AV62OUTConReo, AV7BarCodPar, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_int7, GXv_int6, GXv_int12) ;
         reoperadosinternos_impl.this.AV41Barcosany = GXv_decimal8[0] ;
         reoperadosinternos_impl.this.AV57outBarcospro = GXv_decimal9[0] ;
         reoperadosinternos_impl.this.AV58outBarkgm = GXv_decimal10[0] ;
         reoperadosinternos_impl.this.AV59outBarmtr = GXv_decimal11[0] ;
         reoperadosinternos_impl.this.AV60outBarpie = GXv_int7[0] ;
         reoperadosinternos_impl.this.AV61outbarsit = GXv_int6[0] ;
         reoperadosinternos_impl.this.AV67outdiscod = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41Barcosany", GXutil.ltrimstr( AV41Barcosany, 10, 2));
         AV52SDTSelectionHDR_Item = (app.SdtSDTSelectionHDR_Item)new app.SdtSDTSelectionHDR_Item(remoteHandle, context);
         AV52SDTSelectionHDR_Item.setgxTv_SdtSDTSelectionHDR_Item_Emprcod( AV17EmprCod );
         AV52SDTSelectionHDR_Item.setgxTv_SdtSDTSelectionHDR_Item_Barnhdr( GXutil.trim( GXutil.str( AV5BarCod, 8, 0))+"-"+GXutil.str( AV62OUTConReo, 1, 0)+AV7BarCodPar );
         AV52SDTSelectionHDR_Item.setgxTv_SdtSDTSelectionHDR_Item_Barcod( AV5BarCod );
         AV52SDTSelectionHDR_Item.setgxTv_SdtSDTSelectionHDR_Item_Barcodreo( AV62OUTConReo );
         AV52SDTSelectionHDR_Item.setgxTv_SdtSDTSelectionHDR_Item_Barcodpar( AV7BarCodPar );
         AV52SDTSelectionHDR_Item.setgxTv_SdtSDTSelectionHDR_Item_Barkgm( AV58outBarkgm );
         AV52SDTSelectionHDR_Item.setgxTv_SdtSDTSelectionHDR_Item_Barmtr( AV59outBarmtr );
         AV52SDTSelectionHDR_Item.setgxTv_SdtSDTSelectionHDR_Item_Barpie( AV60outBarpie );
         AV52SDTSelectionHDR_Item.setgxTv_SdtSDTSelectionHDR_Item_Barunimed( AV40BarUnimed );
         AV52SDTSelectionHDR_Item.setgxTv_SdtSDTSelectionHDR_Item_Barsit( AV8Sit );
         AV52SDTSelectionHDR_Item.setgxTv_SdtSDTSelectionHDR_Item_Kilact( AV37Barkgm );
         AV52SDTSelectionHDR_Item.setgxTv_SdtSDTSelectionHDR_Item_Mtract( AV38Barmtr );
         AV52SDTSelectionHDR_Item.setgxTv_SdtSDTSelectionHDR_Item_Barcosany( AV66outBarcosany );
         AV52SDTSelectionHDR_Item.setgxTv_SdtSDTSelectionHDR_Item_Barcospro( AV57outBarcospro );
         AV52SDTSelectionHDR_Item.setgxTv_SdtSDTSelectionHDR_Item_Barpri( AV45BarPri );
         AV52SDTSelectionHDR_Item.setgxTv_SdtSDTSelectionHDR_Item_Usurcod( AV22UsurCod );
         AV50SDTSelectionHDR.add(AV52SDTSelectionHDR_Item, 0);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV50SDTSelectionHDR", AV50SDTSelectionHDR);
   }

   public void S122( )
   {
      /* 'CONTROLES' Routine */
      returnInSub = false ;
      AV46FlagExiste = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46FlagExiste", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46FlagExiste), 4, 0));
      /* Using cursor H015G3 */
      pr_default.execute(0, new Object[] {AV17EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = H015G3_A213BarSit[0] ;
         A120BarAgrEst = H015G3_A120BarAgrEst[0] ;
         A4400BarSitEst = H015G3_A4400BarSitEst[0] ;
         A140BarCosAny = H015G3_A140BarCosAny[0] ;
         A141BarCosPro = H015G3_A141BarCosPro[0] ;
         A228BarUniMed = H015G3_A228BarUniMed[0] ;
         A209BarPri = H015G3_A209BarPri[0] ;
         A166BarKgm = H015G3_A166BarKgm[0] ;
         A184BarMtr = H015G3_A184BarMtr[0] ;
         A396EmprCod = H015G3_A396EmprCod[0] ;
         A130BarCodPar = H015G3_A130BarCodPar[0] ;
         A132BarCodReo = H015G3_A132BarCodReo[0] ;
         A129BarCod = H015G3_A129BarCod[0] ;
         A199BarPie1 = H015G3_A199BarPie1[0] ;
         A365DisDes = H015G3_A365DisDes[0] ;
         A898BarPieNDes = H015G3_A898BarPieNDes[0] ;
         A166BarKgm = H015G3_A166BarKgm[0] ;
         A184BarMtr = H015G3_A184BarMtr[0] ;
         A199BarPie1 = H015G3_A199BarPie1[0] ;
         A898BarPieNDes = H015G3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         else
         {
            A198BarPie = A199BarPie1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         GXt_int5 = A13710HayRec ;
         GXv_int6[0] = GXt_int5 ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int6) ;
         reoperadosinternos_impl.this.GXt_int5 = GXv_int6[0] ;
         A13710HayRec = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13710HayRec", GXutil.str( A13710HayRec, 1, 0));
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
         AV8Sit = A213BarSit ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Sit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Sit), 2, 0));
         AV9BarDes = A365DisDes ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarDes", AV9BarDes);
         AV10Agrupa = A120BarAgrEst ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Agrupa", AV10Agrupa);
         AV11Num_p = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Num_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Num_p), 4, 0));
         AV12BarSitEst = A4400BarSitEst ;
         AV37Barkgm = A166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Barkgm", GXutil.ltrimstr( AV37Barkgm, 9, 2));
         AV38Barmtr = A184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Barmtr", GXutil.ltrimstr( AV38Barmtr, 9, 2));
         AV39Barpie = A198BarPie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Barpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Barpie), 6, 0));
         AV41Barcosany = A140BarCosAny ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41Barcosany", GXutil.ltrimstr( AV41Barcosany, 10, 2));
         AV42Barcospro = A141BarCosPro ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Barcospro", GXutil.ltrimstr( AV42Barcospro, 10, 2));
         AV40BarUnimed = A228BarUniMed ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40BarUnimed", AV40BarUnimed);
         AV36BarNHdr = A13696BarNHdr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36BarNHdr", AV36BarNHdr);
         AV45BarPri = A209BarPri ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45BarPri", AV45BarPri);
         AV46FlagExiste = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46FlagExiste", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46FlagExiste), 4, 0));
         AV18FlagRec = A13710HayRec ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18FlagRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18FlagRec), 4, 0));
         /* Using cursor H015G4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A201BarPieEst = H015G4_A201BarPieEst[0] ;
            A200BarPieCod = H015G4_A200BarPieCod[0] ;
            if ( A201BarPieEst == 1 )
            {
               AV13Num_p1 = (short)(AV13Num_p1+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Num_p1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Num_p1), 4, 0));
            }
            AV11Num_p = (short)(AV11Num_p+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Num_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Num_p), 4, 0));
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV14BarCodM = AV5BarCod ;
      AV15BarReoM = AV6BarCodReo ;
      AV16BarParM = AV7BarCodPar ;
      if ( GXutil.strcmp(AV10Agrupa, httpContext.getMessage( "S", "")) == 0 )
      {
         new app.pminagr(remoteHandle, context).execute( AV17EmprCod, AV14BarCodM, AV15BarReoM, AV16BarParM) ;
      }
      AV23Num_ra = (short)(0) ;
      AV24FlagReca = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24FlagReca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24FlagReca), 4, 0));
      /* Using cursor H015G5 */
      pr_default.execute(2, new Object[] {AV17EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A6039RecAcab = H015G5_A6039RecAcab[0] ;
         n6039RecAcab = H015G5_n6039RecAcab[0] ;
         A130BarCodPar = H015G5_A130BarCodPar[0] ;
         A132BarCodReo = H015G5_A132BarCodReo[0] ;
         A129BarCod = H015G5_A129BarCod[0] ;
         A396EmprCod = H015G5_A396EmprCod[0] ;
         A2805RecVolPrd = H015G5_A2805RecVolPrd[0] ;
         A2804RecLinMaq = H015G5_A2804RecLinMaq[0] ;
         AV24FlagReca = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24FlagReca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24FlagReca), 4, 0));
         AV23Num_ra = (short)(AV23Num_ra+1) ;
         AV25RecLinMaq = A2804RecLinMaq ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Execute user subroutine: 'HDRACA' */
      S132 ();
      if (returnInSub) return;
      if ( AV26Hdraca == 1 )
      {
         Gx_msg = httpContext.getMessage( "ATENCION: Esta Hdr esta agrupada con la Hdr ", "") + GXutil.str( AV27BarCod_p, 8, 0) + "-" + GXutil.str( AV28CodReo_p, 1, 0) + AV29CodPar + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Agrupacion de Hdrs ACABADO", "") + GXutil.newLine( ) ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      AV30Flag_nr = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Flag_nr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Flag_nr), 4, 0));
      if ( ( AV18FlagRec > 0 ) && ( AV24FlagReca > 0 ) && ( AV31NoCierre == 0 ) )
      {
         Gx_msg = httpContext.getMessage( "Atencion. El sistema ha detectado que hay", "") + GXutil.newLine( ) + httpContext.getMessage( "Receta de Tinte y/o Receta de Acabado.", "") + GXutil.newLine( ) + httpContext.getMessage( "Tiene que eliminar la Receta que sea necesaria", "") + GXutil.newLine( ) ;
         httpContext.GX_msglist.addItem(Gx_msg);
         AV30Flag_nr = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Flag_nr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Flag_nr), 4, 0));
      }
      if ( ( AV18FlagRec > 0 ) && ( AV31NoCierre == 1 ) )
      {
         AV30Flag_nr = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Flag_nr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Flag_nr), 4, 0));
         Gx_msg = httpContext.getMessage( "Atencion. El sistema ha detectado que hay", "") + GXutil.newLine( ) + httpContext.getMessage( "Receta de Tinte.", "") + GXutil.newLine( ) + httpContext.getMessage( "Tiene que Eliminar o Cerrar la Receta", "") + GXutil.newLine( ) ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      if ( ( AV24FlagReca > 0 ) && ( AV31NoCierre == 1 ) )
      {
         AV30Flag_nr = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Flag_nr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Flag_nr), 4, 0));
         Gx_msg = httpContext.getMessage( "Atencion. El sistema ha detectado que hay", "") + GXutil.newLine( ) + httpContext.getMessage( "Receta de Acabado.", "") + GXutil.newLine( ) + httpContext.getMessage( "Tiene que Eliminar o Cerrar la Receta", "") + GXutil.newLine( ) ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      if ( ( AV12BarSitEst == 4 ) && ( AV32TinEst == 1 ) )
      {
         AV33Recprd = (short)(0) ;
         /* Using cursor H015G6 */
         pr_default.execute(3, new Object[] {AV17EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A130BarCodPar = H015G6_A130BarCodPar[0] ;
            A132BarCodReo = H015G6_A132BarCodReo[0] ;
            A129BarCod = H015G6_A129BarCod[0] ;
            A396EmprCod = H015G6_A396EmprCod[0] ;
            A2126RecMolLin = H015G6_A2126RecMolLin[0] ;
            A2124RecMolCod = H015G6_A2124RecMolCod[0] ;
            A1032FonCod = H015G6_A1032FonCod[0] ;
            A1056DisComCod = H015G6_A1056DisComCod[0] ;
            A2524DisComLin = H015G6_A2524DisComLin[0] ;
            AV33Recprd = (short)(AV33Recprd+1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         AV34RecPas = (short)(0) ;
         /* Using cursor H015G7 */
         pr_default.execute(4, new Object[] {AV17EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A130BarCodPar = H015G7_A130BarCodPar[0] ;
            A132BarCodReo = H015G7_A132BarCodReo[0] ;
            A129BarCod = H015G7_A129BarCod[0] ;
            A396EmprCod = H015G7_A396EmprCod[0] ;
            A2672RecPasLin = H015G7_A2672RecPasLin[0] ;
            A2124RecMolCod = H015G7_A2124RecMolCod[0] ;
            A1032FonCod = H015G7_A1032FonCod[0] ;
            A1056DisComCod = H015G7_A1056DisComCod[0] ;
            A2524DisComLin = H015G7_A2524DisComLin[0] ;
            AV34RecPas = (short)(AV34RecPas+1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
   }

   public void S132( )
   {
      /* 'HDRACA' Routine */
      returnInSub = false ;
      AV26Hdraca = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Hdraca", GXutil.str( AV26Hdraca, 1, 0));
      AV27BarCod_p = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27BarCod_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27BarCod_p), 8, 0));
      AV28CodReo_p = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28CodReo_p", GXutil.str( AV28CodReo_p, 1, 0));
      AV29CodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29CodPar", AV29CodPar);
      /* Using cursor H015G8 */
      pr_default.execute(5, new Object[] {AV17EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV6BarCodReo), AV7BarCodPar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A396EmprCod = H015G8_A396EmprCod[0] ;
         A6031Ac_Barcod = H015G8_A6031Ac_Barcod[0] ;
         A6032Ac_BarReo = H015G8_A6032Ac_BarReo[0] ;
         A6033Ac_BarPar = H015G8_A6033Ac_BarPar[0] ;
         A129BarCod = H015G8_A129BarCod[0] ;
         A132BarCodReo = H015G8_A132BarCodReo[0] ;
         A130BarCodPar = H015G8_A130BarCodPar[0] ;
         AV26Hdraca = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Hdraca", GXutil.str( AV26Hdraca, 1, 0));
         AV27BarCod_p = A129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27BarCod_p", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27BarCod_p), 8, 0));
         AV28CodReo_p = A132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28CodReo_p", GXutil.str( AV28CodReo_p, 1, 0));
         AV29CodPar = A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29CodPar", AV29CodPar);
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   protected void nextLoad( )
   {
   }

   protected void e1715G2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_87_15G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminaragrupacion_Internalname, tblTabledvelop_confirmpanel_eliminaragrupacion_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminaragrupacion.setProperty("Title", Dvelop_confirmpanel_eliminaragrupacion_Title);
         ucDvelop_confirmpanel_eliminaragrupacion.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminaragrupacion_Confirmationtext);
         ucDvelop_confirmpanel_eliminaragrupacion.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminaragrupacion_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminaragrupacion.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminaragrupacion_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminaragrupacion.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminaragrupacion_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminaragrupacion.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminaragrupacion_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminaragrupacion.setProperty("ConfirmType", Dvelop_confirmpanel_eliminaragrupacion_Confirmtype);
         ucDvelop_confirmpanel_eliminaragrupacion.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminaragrupacion_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARAGRUPACIONContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_87_15G2e( true) ;
      }
      else
      {
         wb_table1_87_15G2e( false) ;
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
      pa15G2( ) ;
      ws15G2( ) ;
      we15G2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202679919355", true, true);
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
      httpContext.AddJavascriptSource("reoperadosinternos.js", "?202679919355", false, true);
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
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      imgavPrompt_Internalname = "vPROMPT" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      bttBtneliminaragrupacion_Internalname = "BTNELIMINARAGRUPACION" ;
      divTablaeliminaragrupacion_Internalname = "TABLAELIMINARAGRUPACION" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      chkavTinte.setInternalname( "vTINTE" );
      chkavAcabado.setInternalname( "vACABADO" );
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_eliminaragrupacion_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION" ;
      tblTabledvelop_confirmpanel_eliminaragrupacion_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARAGRUPACION" ;
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
      chkavAcabado.setEnabled( 1 );
      chkavTinte.setEnabled( 1 );
      lblTbmessage_Caption = "  " ;
      divTablaeliminaragrupacion_Visible = 1 ;
      imgavPrompt_Jsonclick = "" ;
      imgavPrompt_gximage = "" ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      Dvelop_confirmpanel_eliminaragrupacion_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminaragrupacion_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminaragrupacion_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminaragrupacion_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminaragrupacion_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminaragrupacion_Confirmationtext = "¿Desea eliminar la Agrupacion?" ;
      Dvelop_confirmpanel_eliminaragrupacion_Title = "" ;
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
      Form.setCaption( httpContext.getMessage( "Reoperados Internos", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavTinte.setName( "vTINTE" );
      chkavTinte.setWebtags( "" );
      chkavTinte.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavTinte.getInternalname(), "TitleCaption", chkavTinte.getCaption(), true);
      chkavTinte.setCheckedValue( "N" );
      AV48Tinte = ((GXutil.strcmp(GXutil.rtrim( AV48Tinte), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Tinte", AV48Tinte);
      chkavAcabado.setName( "vACABADO" );
      chkavAcabado.setWebtags( "" );
      chkavAcabado.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavAcabado.getInternalname(), "TitleCaption", chkavAcabado.getCaption(), true);
      chkavAcabado.setCheckedValue( "N" );
      AV49Acabado = ((GXutil.strcmp(GXutil.rtrim( AV49Acabado), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Acabado", AV49Acabado);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV48Tinte',fld:'vTINTE',pic:''},{av:'AV49Acabado',fld:'vACABADO',pic:''},{av:'AV32TinEst',fld:'vTINEST',pic:'ZZZ9',hsh:true},{av:'AV35Artextil',fld:'vARTEXTIL',pic:'ZZZ9',hsh:true},{av:'AV31NoCierre',fld:'vNOCIERRE',pic:'ZZZ9',hsh:true},{av:'AV66outBarcosany',fld:'vOUTBARCOSANY',pic:'ZZZZZZ9.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1415G2',iparms:[{av:'AV50SDTSelectionHDR',fld:'vSDTSELECTIONHDR',pic:''}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOELIMINARAGRUPACION'","{handler:'e1115G1',iparms:[]");
      setEventMetadata("'DOELIMINARAGRUPACION'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION.CLOSE","{handler:'e1215G2',iparms:[{av:'Dvelop_confirmpanel_eliminaragrupacion_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION',prop:'Result'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARAGRUPACION.CLOSE",",oparms:[{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV10Agrupa',fld:'vAGRUPA',pic:'@!'},{av:'divTablaeliminaragrupacion_Visible',ctrl:'TABLAELIMINARAGRUPACION',prop:'Visible'}]}");
      setEventMetadata("VPROMPT.CLICK","{handler:'e1815G2',iparms:[{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("VPROMPT.CLICK",",oparms:[{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("ENTER","{handler:'e1515G2',iparms:[{av:'AV10Agrupa',fld:'vAGRUPA',pic:'@!'},{av:'AV46FlagExiste',fld:'vFLAGEXISTE',pic:'ZZZ9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Sit',fld:'vSIT',pic:'Z9'},{av:'AV24FlagReca',fld:'vFLAGRECA',pic:'ZZZ9'},{av:'AV18FlagRec',fld:'vFLAGREC',pic:'ZZZ9'},{av:'AV48Tinte',fld:'vTINTE',pic:''},{av:'AV30Flag_nr',fld:'vFLAG_NR',pic:'ZZZ9'},{av:'AV49Acabado',fld:'vACABADO',pic:''},{av:'AV32TinEst',fld:'vTINEST',pic:'ZZZ9',hsh:true},{av:'AV11Num_p',fld:'vNUM_P',pic:'ZZZ9'},{av:'AV13Num_p1',fld:'vNUM_P1',pic:'ZZZ9'},{av:'AV9BarDes',fld:'vBARDES',pic:'@!'},{av:'AV35Artextil',fld:'vARTEXTIL',pic:'ZZZ9',hsh:true},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV39Barpie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV40BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV37Barkgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV38Barmtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV41Barcosany',fld:'vBARCOSANY',pic:'ZZZZZZ9.99'},{av:'AV42Barcospro',fld:'vBARCOSPRO',pic:'ZZZZZZ9.99'},{av:'AV45BarPri',fld:'vBARPRI',pic:'9'},{av:'AV22UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A4400BarSitEst',fld:'BARSITEST',pic:'9'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A140BarCosAny',fld:'BARCOSANY',pic:'ZZZZZZ9.99'},{av:'A141BarCosPro',fld:'BARCOSPRO',pic:'ZZZZZZ9.99'},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A209BarPri',fld:'BARPRI',pic:'9'},{av:'A13710HayRec',fld:'HAYREC',pic:'9'},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A201BarPieEst',fld:'BARPIEEST',pic:'9'},{av:'A6039RecAcab',fld:'RECACAB',pic:''},{av:'A2805RecVolPrd',fld:'RECVOLPRD',pic:'ZZZZ9'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'AV26Hdraca',fld:'vHDRACA',pic:'9'},{av:'AV27BarCod_p',fld:'vBARCOD_P',pic:'ZZZZZZZ9'},{av:'AV28CodReo_p',fld:'vCODREO_P',pic:'9'},{av:'AV29CodPar',fld:'vCODPAR',pic:''},{av:'AV31NoCierre',fld:'vNOCIERRE',pic:'ZZZ9',hsh:true},{av:'A2524DisComLin',fld:'DISCOMLIN',pic:'Z9'},{av:'A1056DisComCod',fld:'DISCOMCOD',pic:''},{av:'A1032FonCod',fld:'FONCOD',pic:''},{av:'A2124RecMolCod',fld:'RECMOLCOD',pic:'Z9'},{av:'A2126RecMolLin',fld:'RECMOLLIN',pic:'Z9'},{av:'A2672RecPasLin',fld:'RECPASLIN',pic:'ZZ9'},{av:'A6031Ac_Barcod',fld:'AC_BARCOD',pic:'ZZZZZZZ9'},{av:'A6032Ac_BarReo',fld:'AC_BARREO',pic:'9'},{av:'A6033Ac_BarPar',fld:'AC_BARPAR',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'divTablaeliminaragrupacion_Visible',ctrl:'TABLAELIMINARAGRUPACION',prop:'Visible'},{av:'AV22UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV45BarPri',fld:'vBARPRI',pic:'9'},{av:'AV42Barcospro',fld:'vBARCOSPRO',pic:'ZZZZZZ9.99'},{av:'AV41Barcosany',fld:'vBARCOSANY',pic:'ZZZZZZ9.99'},{av:'AV38Barmtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV37Barkgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV8Sit',fld:'vSIT',pic:'Z9'},{av:'AV40BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV39Barpie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV6BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV36BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV46FlagExiste',fld:'vFLAGEXISTE',pic:'ZZZ9'},{av:'AV9BarDes',fld:'vBARDES',pic:'@!'},{av:'AV10Agrupa',fld:'vAGRUPA',pic:'@!'},{av:'AV11Num_p',fld:'vNUM_P',pic:'ZZZ9'},{av:'AV18FlagRec',fld:'vFLAGREC',pic:'ZZZ9'},{av:'AV13Num_p1',fld:'vNUM_P1',pic:'ZZZ9'},{av:'AV24FlagReca',fld:'vFLAGRECA',pic:'ZZZ9'},{av:'AV30Flag_nr',fld:'vFLAG_NR',pic:'ZZZ9'},{av:'AV26Hdraca',fld:'vHDRACA',pic:'9'},{av:'AV27BarCod_p',fld:'vBARCOD_P',pic:'ZZZZZZZ9'},{av:'AV28CodReo_p',fld:'vCODREO_P',pic:'9'},{av:'AV29CodPar',fld:'vCODPAR',pic:''}]}");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO","{handler:'e1615G2',iparms:[{av:'AV64Refrescar',fld:'vREFRESCAR',pic:''},{av:'AV56ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:''},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV40BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV8Sit',fld:'vSIT',pic:'Z9'},{av:'AV37Barkgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV38Barmtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV66outBarcosany',fld:'vOUTBARCOSANY',pic:'ZZZZZZ9.99',hsh:true},{av:'AV45BarPri',fld:'vBARPRI',pic:'9'},{av:'AV22UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV50SDTSelectionHDR',fld:'vSDTSELECTIONHDR',pic:''}]");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO",",oparms:[{av:'AV41Barcosany',fld:'vBARCOSANY',pic:'ZZZZZZ9.99'},{av:'AV50SDTSelectionHDR',fld:'vSDTSELECTIONHDR',pic:''}]}");
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
      Dvelop_confirmpanel_eliminaragrupacion_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV66outBarcosany = DecimalUtil.ZERO ;
      GXKey = "" ;
      AV50SDTSelectionHDR = new GXBaseCollection<app.SdtSDTSelectionHDR_Item>(app.SdtSDTSelectionHDR_Item.class, "Item", "TexplusNET", remoteHandle);
      AV17EmprCod = "" ;
      AV10Agrupa = "" ;
      AV9BarDes = "" ;
      AV36BarNHdr = "" ;
      AV40BarUnimed = "" ;
      AV37Barkgm = DecimalUtil.ZERO ;
      AV38Barmtr = DecimalUtil.ZERO ;
      AV41Barcosany = DecimalUtil.ZERO ;
      AV42Barcospro = DecimalUtil.ZERO ;
      AV45BarPri = "" ;
      AV22UsurCod = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A365DisDes = "" ;
      A120BarAgrEst = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A228BarUniMed = "" ;
      A13696BarNHdr = "" ;
      A209BarPri = "" ;
      A200BarPieCod = "" ;
      A6039RecAcab = "" ;
      AV29CodPar = "" ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      A6033Ac_BarPar = "" ;
      AV56ObjetoRefrescar = new GXSimpleCollection<String>(String.class, "internal", "");
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV7BarCodPar = "" ;
      AV47Prompt = "" ;
      AV71Prompt_GXI = "" ;
      sImgUrl = "" ;
      bttBtneliminaragrupacion_Jsonclick = "" ;
      lblTbmessage_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      AV48Tinte = "" ;
      AV49Acabado = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      AV70Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV20Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV21EmprNom = "" ;
      AV53WebSession = httpContext.getWebSession();
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      Gx_msg = "" ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV57outBarcospro = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV58outBarkgm = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV59outBarmtr = DecimalUtil.ZERO ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int7 = new int[1] ;
      GXv_int12 = new int[1] ;
      AV52SDTSelectionHDR_Item = new app.SdtSDTSelectionHDR_Item(remoteHandle, context);
      scmdbuf = "" ;
      H015G3_A213BarSit = new byte[1] ;
      H015G3_A120BarAgrEst = new String[] {""} ;
      H015G3_A4400BarSitEst = new byte[1] ;
      H015G3_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015G3_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015G3_A228BarUniMed = new String[] {""} ;
      H015G3_A209BarPri = new String[] {""} ;
      H015G3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015G3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015G3_A396EmprCod = new String[] {""} ;
      H015G3_A130BarCodPar = new String[] {""} ;
      H015G3_A132BarCodReo = new byte[1] ;
      H015G3_A129BarCod = new int[1] ;
      H015G3_A199BarPie1 = new short[1] ;
      H015G3_A365DisDes = new String[] {""} ;
      H015G3_A898BarPieNDes = new int[1] ;
      GXv_int6 = new byte[1] ;
      H015G4_A396EmprCod = new String[] {""} ;
      H015G4_A129BarCod = new int[1] ;
      H015G4_A132BarCodReo = new byte[1] ;
      H015G4_A130BarCodPar = new String[] {""} ;
      H015G4_A201BarPieEst = new byte[1] ;
      H015G4_A200BarPieCod = new String[] {""} ;
      AV16BarParM = "" ;
      H015G5_A6039RecAcab = new String[] {""} ;
      H015G5_n6039RecAcab = new boolean[] {false} ;
      H015G5_A130BarCodPar = new String[] {""} ;
      H015G5_A132BarCodReo = new byte[1] ;
      H015G5_A129BarCod = new int[1] ;
      H015G5_A396EmprCod = new String[] {""} ;
      H015G5_A2805RecVolPrd = new int[1] ;
      H015G5_A2804RecLinMaq = new short[1] ;
      H015G6_A130BarCodPar = new String[] {""} ;
      H015G6_A132BarCodReo = new byte[1] ;
      H015G6_A129BarCod = new int[1] ;
      H015G6_A396EmprCod = new String[] {""} ;
      H015G6_A2126RecMolLin = new byte[1] ;
      H015G6_A2124RecMolCod = new byte[1] ;
      H015G6_A1032FonCod = new String[] {""} ;
      H015G6_A1056DisComCod = new String[] {""} ;
      H015G6_A2524DisComLin = new byte[1] ;
      H015G7_A130BarCodPar = new String[] {""} ;
      H015G7_A132BarCodReo = new byte[1] ;
      H015G7_A129BarCod = new int[1] ;
      H015G7_A396EmprCod = new String[] {""} ;
      H015G7_A2672RecPasLin = new short[1] ;
      H015G7_A2124RecMolCod = new byte[1] ;
      H015G7_A1032FonCod = new String[] {""} ;
      H015G7_A1056DisComCod = new String[] {""} ;
      H015G7_A2524DisComLin = new byte[1] ;
      H015G8_A396EmprCod = new String[] {""} ;
      H015G8_A6031Ac_Barcod = new int[1] ;
      H015G8_A6032Ac_BarReo = new byte[1] ;
      H015G8_A6033Ac_BarPar = new String[] {""} ;
      H015G8_A129BarCod = new int[1] ;
      H015G8_A132BarCodReo = new byte[1] ;
      H015G8_A130BarCodPar = new String[] {""} ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_eliminaragrupacion = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.reoperadosinternos__default(),
         new Object[] {
             new Object[] {
            H015G3_A213BarSit, H015G3_A120BarAgrEst, H015G3_A4400BarSitEst, H015G3_A140BarCosAny, H015G3_A141BarCosPro, H015G3_A228BarUniMed, H015G3_A209BarPri, H015G3_A166BarKgm, H015G3_A184BarMtr, H015G3_A396EmprCod,
            H015G3_A130BarCodPar, H015G3_A132BarCodReo, H015G3_A129BarCod, H015G3_A199BarPie1, H015G3_A365DisDes, H015G3_A898BarPieNDes
            }
            , new Object[] {
            H015G4_A396EmprCod, H015G4_A129BarCod, H015G4_A132BarCodReo, H015G4_A130BarCodPar, H015G4_A201BarPieEst, H015G4_A200BarPieCod
            }
            , new Object[] {
            H015G5_A6039RecAcab, H015G5_n6039RecAcab, H015G5_A130BarCodPar, H015G5_A132BarCodReo, H015G5_A129BarCod, H015G5_A396EmprCod, H015G5_A2805RecVolPrd, H015G5_A2804RecLinMaq
            }
            , new Object[] {
            H015G6_A130BarCodPar, H015G6_A132BarCodReo, H015G6_A129BarCod, H015G6_A396EmprCod, H015G6_A2126RecMolLin, H015G6_A2124RecMolCod, H015G6_A1032FonCod, H015G6_A1056DisComCod, H015G6_A2524DisComLin
            }
            , new Object[] {
            H015G7_A130BarCodPar, H015G7_A132BarCodReo, H015G7_A129BarCod, H015G7_A396EmprCod, H015G7_A2672RecPasLin, H015G7_A2124RecMolCod, H015G7_A1032FonCod, H015G7_A1056DisComCod, H015G7_A2524DisComLin
            }
            , new Object[] {
            H015G8_A396EmprCod, H015G8_A6031Ac_Barcod, H015G8_A6032Ac_BarReo, H015G8_A6033Ac_BarPar, H015G8_A129BarCod, H015G8_A132BarCodReo, H015G8_A130BarCodPar
            }
         }
      );
      AV70Pgmname = "ReoperadosInternos" ;
      /* GeneXus formulas. */
      AV70Pgmname = "ReoperadosInternos" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV8Sit ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A4400BarSitEst ;
   private byte A13710HayRec ;
   private byte A201BarPieEst ;
   private byte AV26Hdraca ;
   private byte AV28CodReo_p ;
   private byte A2524DisComLin ;
   private byte A2124RecMolCod ;
   private byte A2126RecMolLin ;
   private byte A6032Ac_BarReo ;
   private byte AV6BarCodReo ;
   private byte nDonePA ;
   private byte AV62OUTConReo ;
   private byte AV61outbarsit ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte AV12BarSitEst ;
   private byte AV15BarReoM ;
   private byte nGXWrapped ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short AV32TinEst ;
   private short AV35Artextil ;
   private short AV31NoCierre ;
   private short AV46FlagExiste ;
   private short AV24FlagReca ;
   private short AV18FlagRec ;
   private short AV30Flag_nr ;
   private short AV11Num_p ;
   private short AV13Num_p1 ;
   private short A2804RecLinMaq ;
   private short A2672RecPasLin ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A199BarPie1 ;
   private short AV23Num_ra ;
   private short AV25RecLinMaq ;
   private short AV33Recprd ;
   private short AV34RecPas ;
   private int AV39Barpie ;
   private int A129BarCod ;
   private int A198BarPie ;
   private int A2805RecVolPrd ;
   private int AV27BarCod_p ;
   private int A6031Ac_Barcod ;
   private int AV5BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int divTablaeliminaragrupacion_Visible ;
   private int edtavPgmname_Enabled ;
   private int AV60outBarpie ;
   private int GXv_int7[] ;
   private int AV67outdiscod ;
   private int GXv_int12[] ;
   private int A898BarPieNDes ;
   private int AV14BarCodM ;
   private int idxLst ;
   private java.math.BigDecimal AV66outBarcosany ;
   private java.math.BigDecimal AV37Barkgm ;
   private java.math.BigDecimal AV38Barmtr ;
   private java.math.BigDecimal AV41Barcosany ;
   private java.math.BigDecimal AV42Barcospro ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV57outBarcospro ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV58outBarkgm ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV59outBarmtr ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV17EmprCod ;
   private String AV10Agrupa ;
   private String AV9BarDes ;
   private String AV36BarNHdr ;
   private String AV40BarUnimed ;
   private String AV45BarPri ;
   private String AV22UsurCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A365DisDes ;
   private String A120BarAgrEst ;
   private String A228BarUniMed ;
   private String A13696BarNHdr ;
   private String A209BarPri ;
   private String A200BarPieCod ;
   private String A6039RecAcab ;
   private String AV29CodPar ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String A6033Ac_BarPar ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Title ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Confirmtype ;
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
   private String divTablaeliminaragrupacion_Internalname ;
   private String bttBtneliminaragrupacion_Internalname ;
   private String bttBtneliminaragrupacion_Jsonclick ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String AV48Tinte ;
   private String AV49Acabado ;
   private String divTable_acciones_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV70Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV20Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV21EmprNom ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String AV16BarParM ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_eliminaragrupacion_Internalname ;
   private String Dvelop_confirmpanel_eliminaragrupacion_Internalname ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV64Refrescar ;
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_panel_filtros_Autowidth ;
   private boolean Dvpanel_panel_filtros_Autoheight ;
   private boolean Dvpanel_panel_filtros_Collapsible ;
   private boolean Dvpanel_panel_filtros_Collapsed ;
   private boolean Dvpanel_panel_filtros_Showcollapseicon ;
   private boolean Dvpanel_panel_filtros_Autoscroll ;
   private boolean wbLoad ;
   private boolean AV47Prompt_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n6039RecAcab ;
   private String AV71Prompt_GXI ;
   private String AV47Prompt ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminaragrupacion ;
   private ICheckbox chkavTinte ;
   private ICheckbox chkavAcabado ;
   private IDataStoreProvider pr_default ;
   private byte[] H015G3_A213BarSit ;
   private String[] H015G3_A120BarAgrEst ;
   private byte[] H015G3_A4400BarSitEst ;
   private java.math.BigDecimal[] H015G3_A140BarCosAny ;
   private java.math.BigDecimal[] H015G3_A141BarCosPro ;
   private String[] H015G3_A228BarUniMed ;
   private String[] H015G3_A209BarPri ;
   private java.math.BigDecimal[] H015G3_A166BarKgm ;
   private java.math.BigDecimal[] H015G3_A184BarMtr ;
   private String[] H015G3_A396EmprCod ;
   private String[] H015G3_A130BarCodPar ;
   private byte[] H015G3_A132BarCodReo ;
   private int[] H015G3_A129BarCod ;
   private short[] H015G3_A199BarPie1 ;
   private String[] H015G3_A365DisDes ;
   private int[] H015G3_A898BarPieNDes ;
   private String[] H015G4_A396EmprCod ;
   private int[] H015G4_A129BarCod ;
   private byte[] H015G4_A132BarCodReo ;
   private String[] H015G4_A130BarCodPar ;
   private byte[] H015G4_A201BarPieEst ;
   private String[] H015G4_A200BarPieCod ;
   private String[] H015G5_A6039RecAcab ;
   private boolean[] H015G5_n6039RecAcab ;
   private String[] H015G5_A130BarCodPar ;
   private byte[] H015G5_A132BarCodReo ;
   private int[] H015G5_A129BarCod ;
   private String[] H015G5_A396EmprCod ;
   private int[] H015G5_A2805RecVolPrd ;
   private short[] H015G5_A2804RecLinMaq ;
   private String[] H015G6_A130BarCodPar ;
   private byte[] H015G6_A132BarCodReo ;
   private int[] H015G6_A129BarCod ;
   private String[] H015G6_A396EmprCod ;
   private byte[] H015G6_A2126RecMolLin ;
   private byte[] H015G6_A2124RecMolCod ;
   private String[] H015G6_A1032FonCod ;
   private String[] H015G6_A1056DisComCod ;
   private byte[] H015G6_A2524DisComLin ;
   private String[] H015G7_A130BarCodPar ;
   private byte[] H015G7_A132BarCodReo ;
   private int[] H015G7_A129BarCod ;
   private String[] H015G7_A396EmprCod ;
   private short[] H015G7_A2672RecPasLin ;
   private byte[] H015G7_A2124RecMolCod ;
   private String[] H015G7_A1032FonCod ;
   private String[] H015G7_A1056DisComCod ;
   private byte[] H015G7_A2524DisComLin ;
   private String[] H015G8_A396EmprCod ;
   private int[] H015G8_A6031Ac_Barcod ;
   private byte[] H015G8_A6032Ac_BarReo ;
   private String[] H015G8_A6033Ac_BarPar ;
   private int[] H015G8_A129BarCod ;
   private byte[] H015G8_A132BarCodReo ;
   private String[] H015G8_A130BarCodPar ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV53WebSession ;
   private GXSimpleCollection<String> AV56ObjetoRefrescar ;
   private GXBaseCollection<app.SdtSDTSelectionHDR_Item> AV50SDTSelectionHDR ;
   private app.SdtSDTSelectionHDR_Item AV52SDTSelectionHDR_Item ;
}

final  class reoperadosinternos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H015G3", "SELECT T1.BarSit, T1.BarAgrEst, T1.BarSitEst, T1.BarCosAny, T1.BarCosPro, T1.BarUniMed, T1.BarPri, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H015G4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieEst, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015G5", "SELECT RecAcab, BarCodPar, BarCodReo, BarCod, EmprCod, RecVolPrd, RecLinMaq FROM TXPRECMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (RecAcab = 'S') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015G6", "SELECT * FROM (SELECT BarCodPar, BarCodReo, BarCod, EmprCod, RecMolLin, RecMolCod, FonCod, DisComCod, DisComLin FROM TXPRECPRD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H015G7", "SELECT * FROM (SELECT BarCodPar, BarCodReo, BarCod, EmprCod, RecPasLin, RecMolCod, FonCod, DisComCod, DisComLin FROM TXPRECPAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H015G8", "SELECT EmprCod, Ac_Barcod, Ac_BarReo, Ac_BarPar, BarCod, BarCodReo, BarCodPar FROM TXPHDRACA WHERE EmprCod = ? and Ac_Barcod = ? and Ac_BarReo = ? and Ac_BarPar = ? ORDER BY EmprCod, Ac_Barcod, Ac_BarReo, Ac_BarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

