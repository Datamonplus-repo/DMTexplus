package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mrec_analisis_impl extends GXDataArea
{
   public mrec_analisis_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mrec_analisis_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_analisis_impl.class ));
   }

   public mrec_analisis_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavFuerarango = UIFactory.getCheckbox(this);
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
      pa1WE2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1WE2( ) ;
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
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/Ingenieria.GraficaAlertaUCRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.mrec_analisis", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV74UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64Ip, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERSION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV82Version, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ContCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPOSICIONFINAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV110PosicionFinal), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MRec_Analisis");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV114Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\mrec_analisis:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV13DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV13DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vHDR_DATA", AV61Hdr_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vHDR_DATA", AV61Hdr_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD_DATA", AV27MaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD_DATA", AV27MaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCOD_DATA", AV19FasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCOD_DATA", AV19FasCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARFASCOD_DATA", AV31ParFasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARFASCOD_DATA", AV31ParFasCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vELEMENTS", AV16Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vELEMENTS", AV16Elements);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARAMETERS", AV29Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARAMETERS", AV29Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMCLICKDATA", AV21ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMCLICKDATA", AV21ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMDOUBLECLICKDATA", AV23ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMDOUBLECLICKDATA", AV23ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDRAGANDDROPDATA", AV14DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDRAGANDDROPDATA", AV14DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILTERCHANGEDDATA", AV39FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILTERCHANGEDDATA", AV39FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMEXPANDDATA", AV24ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMEXPANDDATA", AV24ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMCOLLAPSEDATA", AV22ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMCOLLAPSEDATA", AV22ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV17EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDESDE", localUtil.ttoc( AV43Desde, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASTA", localUtil.ttoc( AV44Hasta, 10, 8, 0, 0, "/", ":", " "));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD", AV26MaqCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD", AV26MaqCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCOD", AV18FasCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCOD", AV18FasCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vHDR", AV60Hdr);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vHDR", AV60Hdr);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARFASCOD", AV30ParFasCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARFASCOD", AV30ParFasCod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMEMO", AV65memo);
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV74UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV74UsurCod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vINFILSDT", AV63inFilSDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vINFILSDT", AV63inFilSDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vIP", AV64Ip);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64Ip, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vVERSION", GXutil.rtrim( AV82Version));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERSION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV82Version, ""))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vCRONOMETROSTART", AV10CronometroStart);
      app.GxWebStd.gx_hidden_field( httpContext, "vNOW", localUtil.ttoc( AV45Now, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTKN", AV77MTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRMAQCOD", GXutil.rtrim( A14693MEPrMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRFASCOD", GXutil.rtrim( A14691MEPrFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRHDR", GXutil.rtrim( A14697MEPrHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRUSU", GXutil.rtrim( A14698MEPrUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRIP", A14699MEPrIp);
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRREG", localUtil.ttoc( A14700MEPrReg, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRTKN", A14701MEPrTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "MEPROBJ", A14702MEPrObj);
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRPARCOD", GXutil.ltrim( localUtil.ntoc( A14695MEPrParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRPARDSC", GXutil.rtrim( A14696MEPrParDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRFASDSC", GXutil.rtrim( A14692MEPrFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRMAQDSC", GXutil.rtrim( A14694MEPrMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLINEAHDR", AV101LineaHdr);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLINEAHDR", AV101LineaHdr);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLINEAFASCOD", AV100LineaFasCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLINEAFASCOD", AV100LineaFasCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLINEAMAQCOD", AV99LineaMaqCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLINEAMAQCOD", AV99LineaMaqCod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV9ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ContCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPOSICIONFINAL", GXutil.ltrim( localUtil.ntoc( AV110PosicionFinal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPOSICIONFINAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV110PosicionFinal), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Cls", GXutil.rtrim( Combo_hdr_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Selectedvalue_set", GXutil.rtrim( Combo_hdr_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Allowmultipleselection", GXutil.booltostr( Combo_hdr_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Includeonlyselectedoption", GXutil.booltostr( Combo_hdr_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Emptyitem", GXutil.booltostr( Combo_hdr_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Multiplevaluestype", GXutil.rtrim( Combo_hdr_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Cls", GXutil.rtrim( Combo_maqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_maqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Allowmultipleselection", GXutil.booltostr( Combo_maqcod_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Includeonlyselectedoption", GXutil.booltostr( Combo_maqcod_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Multiplevaluestype", GXutil.rtrim( Combo_maqcod_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Emptyitemtext", GXutil.rtrim( Combo_maqcod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Cls", GXutil.rtrim( Combo_fascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_set", GXutil.rtrim( Combo_fascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Allowmultipleselection", GXutil.booltostr( Combo_fascod_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Includeonlyselectedoption", GXutil.booltostr( Combo_fascod_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Emptyitem", GXutil.booltostr( Combo_fascod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Multiplevaluestype", GXutil.rtrim( Combo_fascod_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Cls", GXutil.rtrim( Combo_parfascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Selectedvalue_set", GXutil.rtrim( Combo_parfascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Allowmultipleselection", GXutil.booltostr( Combo_parfascod_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Includeonlyselectedoption", GXutil.booltostr( Combo_parfascod_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Emptyitem", GXutil.booltostr( Combo_parfascod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Multiplevaluestype", GXutil.rtrim( Combo_parfascod_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Width", GXutil.rtrim( Dvpanel_panelfiltros_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Autowidth", GXutil.booltostr( Dvpanel_panelfiltros_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Autoheight", GXutil.booltostr( Dvpanel_panelfiltros_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Cls", GXutil.rtrim( Dvpanel_panelfiltros_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Title", GXutil.rtrim( Dvpanel_panelfiltros_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Collapsible", GXutil.booltostr( Dvpanel_panelfiltros_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Collapsed", GXutil.booltostr( Dvpanel_panelfiltros_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Showcollapseicon", GXutil.booltostr( Dvpanel_panelfiltros_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Iconposition", GXutil.rtrim( Dvpanel_panelfiltros_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELFILTROS_Autoscroll", GXutil.booltostr( Dvpanel_panelfiltros_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOA_Objectcall", GXutil.rtrim( Qvprocesoa_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOA_Objectcall", GXutil.rtrim( Qvprocesoa_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOA_Height", GXutil.rtrim( Qvprocesoa_Height));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOA_Allowselection", GXutil.booltostr( Qvprocesoa_Allowselection));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOA_Type", GXutil.rtrim( Qvprocesoa_Type));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOB_Objectcall", GXutil.rtrim( Qvprocesob_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOB_Objectcall", GXutil.rtrim( Qvprocesob_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOB_Height", GXutil.rtrim( Qvprocesob_Height));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOB_Allowselection", GXutil.booltostr( Qvprocesob_Allowselection));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOB_Rememberlayout", GXutil.booltostr( Qvprocesob_Rememberlayout));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOB_Type", GXutil.rtrim( Qvprocesob_Type));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOB_Charttype", GXutil.rtrim( Qvprocesob_Charttype));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOC_Datasource", GXutil.rtrim( Qvprocesoc_Datasource));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs1_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Class", GXutil.rtrim( Gxuitabspanel_tabs1_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs1_Historymanagement));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSINDATOS_Width", GXutil.rtrim( Dvpanel_panelsindatos_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSINDATOS_Autowidth", GXutil.booltostr( Dvpanel_panelsindatos_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSINDATOS_Autoheight", GXutil.booltostr( Dvpanel_panelsindatos_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSINDATOS_Cls", GXutil.rtrim( Dvpanel_panelsindatos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSINDATOS_Title", GXutil.rtrim( Dvpanel_panelsindatos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSINDATOS_Collapsible", GXutil.booltostr( Dvpanel_panelsindatos_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSINDATOS_Collapsed", GXutil.booltostr( Dvpanel_panelsindatos_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSINDATOS_Showcollapseicon", GXutil.booltostr( Dvpanel_panelsindatos_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSINDATOS_Iconposition", GXutil.rtrim( Dvpanel_panelsindatos_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELSINDATOS_Autoscroll", GXutil.booltostr( Dvpanel_panelsindatos_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Selectedvalue_get", GXutil.rtrim( Combo_parfascod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_get", GXutil.rtrim( Combo_fascod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Selectedvalue_get", GXutil.rtrim( Combo_hdr_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOC_Clickedvalue", GXutil.rtrim( Qvprocesoc_Clickedvalue));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOC_Clickedtime", GXutil.rtrim( Qvprocesoc_Clickedtime));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOC_Clickedseriesname", GXutil.rtrim( Qvprocesoc_Clickedseriesname));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_get", GXutil.rtrim( Combo_fascod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Selectedvalue_get", GXutil.rtrim( Combo_hdr_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOC_Clickedvalue", GXutil.rtrim( Qvprocesoc_Clickedvalue));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOC_Clickedtime", GXutil.rtrim( Qvprocesoc_Clickedtime));
      app.GxWebStd.gx_hidden_field( httpContext, "QVPROCESOC_Clickedseriesname", GXutil.rtrim( Qvprocesoc_Clickedseriesname));
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
      if ( ! ( WebComp_Wcmrec_analisisdetalle == null ) )
      {
         WebComp_Wcmrec_analisisdetalle.componentjscripts();
      }
      if ( ! ( WebComp_Wcmrec_analisishdr == null ) )
      {
         WebComp_Wcmrec_analisishdr.componentjscripts();
      }
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
         we1WE2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1WE2( ) ;
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
      return formatLink("app.ingenieria.mrec_analisis", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.MRec_Analisis" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Análisis", "") ;
   }

   public void wb1WE0( )
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
         ucDvpanel_panelfiltros.setProperty("Width", Dvpanel_panelfiltros_Width);
         ucDvpanel_panelfiltros.setProperty("AutoWidth", Dvpanel_panelfiltros_Autowidth);
         ucDvpanel_panelfiltros.setProperty("AutoHeight", Dvpanel_panelfiltros_Autoheight);
         ucDvpanel_panelfiltros.setProperty("Cls", Dvpanel_panelfiltros_Cls);
         ucDvpanel_panelfiltros.setProperty("Title", Dvpanel_panelfiltros_Title);
         ucDvpanel_panelfiltros.setProperty("Collapsible", Dvpanel_panelfiltros_Collapsible);
         ucDvpanel_panelfiltros.setProperty("Collapsed", Dvpanel_panelfiltros_Collapsed);
         ucDvpanel_panelfiltros.setProperty("ShowCollapseIcon", Dvpanel_panelfiltros_Showcollapseicon);
         ucDvpanel_panelfiltros.setProperty("IconPosition", Dvpanel_panelfiltros_Iconposition);
         ucDvpanel_panelfiltros.setProperty("AutoScroll", Dvpanel_panelfiltros_Autoscroll);
         ucDvpanel_panelfiltros.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelfiltros_Internalname, "DVPANEL_PANELFILTROSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELFILTROSContainer"+"PanelFiltros"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelfiltros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-md-4 col-lg-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDesdefechahora_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDesdefechahora_Internalname, httpContext.getMessage( "Desde", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDesdefechahora_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDesdefechahora_Internalname, localUtil.ttoc( AV47DesdeFechaHora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV47DesdeFechaHora, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDesdefechahora_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDesdefechahora_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRec_Analisis.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDesdefechahora_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDesdefechahora_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MRec_Analisis.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-md-4 col-lg-3 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHastafechahora_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHastafechahora_Internalname, httpContext.getMessage( "hasta", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHastafechahora_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHastafechahora_Internalname, localUtil.ttoc( AV48HastaFechaHora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV48HastaFechaHora, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHastafechahora_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHastafechahora_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRec_Analisis.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHastafechahora_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHastafechahora_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MRec_Analisis.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-md-4 col-lg-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedhdr_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_hdr_Internalname, httpContext.getMessage( "Hdr(s)", ""), "", "", lblTextblockcombo_hdr_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_Analisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_hdr.setProperty("Caption", Combo_hdr_Caption);
         ucCombo_hdr.setProperty("Cls", Combo_hdr_Cls);
         ucCombo_hdr.setProperty("AllowMultipleSelection", Combo_hdr_Allowmultipleselection);
         ucCombo_hdr.setProperty("IncludeOnlySelectedOption", Combo_hdr_Includeonlyselectedoption);
         ucCombo_hdr.setProperty("EmptyItem", Combo_hdr_Emptyitem);
         ucCombo_hdr.setProperty("MultipleValuesType", Combo_hdr_Multiplevaluestype);
         ucCombo_hdr.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucCombo_hdr.setProperty("DropDownOptionsData", AV61Hdr_Data);
         ucCombo_hdr.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_hdr_Internalname, "COMBO_HDRContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcod_Internalname, httpContext.getMessage( "Máquina(s)", ""), "", "", lblTextblockcombo_maqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_Analisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcod.setProperty("Caption", Combo_maqcod_Caption);
         ucCombo_maqcod.setProperty("Cls", Combo_maqcod_Cls);
         ucCombo_maqcod.setProperty("AllowMultipleSelection", Combo_maqcod_Allowmultipleselection);
         ucCombo_maqcod.setProperty("IncludeOnlySelectedOption", Combo_maqcod_Includeonlyselectedoption);
         ucCombo_maqcod.setProperty("MultipleValuesType", Combo_maqcod_Multiplevaluestype);
         ucCombo_maqcod.setProperty("EmptyItemText", Combo_maqcod_Emptyitemtext);
         ucCombo_maqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucCombo_maqcod.setProperty("DropDownOptionsData", AV27MaqCod_Data);
         ucCombo_maqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod_Internalname, "COMBO_MAQCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_fascod_Internalname, httpContext.getMessage( "Fase(s)", ""), "", "", lblTextblockcombo_fascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_Analisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_fascod.setProperty("Caption", Combo_fascod_Caption);
         ucCombo_fascod.setProperty("Cls", Combo_fascod_Cls);
         ucCombo_fascod.setProperty("AllowMultipleSelection", Combo_fascod_Allowmultipleselection);
         ucCombo_fascod.setProperty("IncludeOnlySelectedOption", Combo_fascod_Includeonlyselectedoption);
         ucCombo_fascod.setProperty("EmptyItem", Combo_fascod_Emptyitem);
         ucCombo_fascod.setProperty("MultipleValuesType", Combo_fascod_Multiplevaluestype);
         ucCombo_fascod.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucCombo_fascod.setProperty("DropDownOptionsData", AV19FasCod_Data);
         ucCombo_fascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fascod_Internalname, "COMBO_FASCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedparfascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_parfascod_Internalname, httpContext.getMessage( "Parámetro(s)", ""), "", "", lblTextblockcombo_parfascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_Analisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_parfascod.setProperty("Caption", Combo_parfascod_Caption);
         ucCombo_parfascod.setProperty("Cls", Combo_parfascod_Cls);
         ucCombo_parfascod.setProperty("AllowMultipleSelection", Combo_parfascod_Allowmultipleselection);
         ucCombo_parfascod.setProperty("IncludeOnlySelectedOption", Combo_parfascod_Includeonlyselectedoption);
         ucCombo_parfascod.setProperty("EmptyItem", Combo_parfascod_Emptyitem);
         ucCombo_parfascod.setProperty("MultipleValuesType", Combo_parfascod_Multiplevaluestype);
         ucCombo_parfascod.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucCombo_parfascod.setProperty("DropDownOptionsData", AV31ParFasCod_Data);
         ucCombo_parfascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_parfascod_Internalname, "COMBO_PARFASCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavFuerarango.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavFuerarango.getInternalname(), httpContext.getMessage( "Error", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavFuerarango.getInternalname(), GXutil.booltostr( AV20FueraRango), "", httpContext.getMessage( "Error", ""), 1, chkavFuerarango.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(62, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,62);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop30", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblActualizar_Internalname, httpContext.getMessage( "<i class=\"fa fa-search fas fa-search fa-3x\"></i>", ""), "", "", lblActualizar_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOACTUALIZAR\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "Actualizar resultados...", ""), 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_Analisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablerango_Internalname, divTablerango_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmensajeactualizar_Internalname, lblTbmensajeactualizar_Caption, "", "", lblTbmensajeactualizar_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_Analisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarraprogreso.render(context, "gxprogressindicator", Barraprogreso_Internalname, "BARRAPROGRESOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblFiltroseleccionados_Internalname, lblFiltroseleccionados_Caption, "", "", lblFiltroseleccionados_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_Analisis.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTabledatos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGxuitabspanel_tabs1.setProperty("PageCount", Gxuitabspanel_tabs1_Pagecount);
         ucGxuitabspanel_tabs1.setProperty("Class", Gxuitabspanel_tabs1_Class);
         ucGxuitabspanel_tabs1.setProperty("HistoryManagement", Gxuitabspanel_tabs1_Historymanagement);
         ucGxuitabspanel_tabs1.render(context, "tab", Gxuitabspanel_tabs1_Internalname, "GXUITABSPANEL_TABS1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab1procesos_title_Internalname, httpContext.getMessage( "Procesos", ""), "", "", lblTab1procesos_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_Analisis.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab1Procesos") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablegrafica_Internalname, divTablegrafica_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucQvprocesoa.setProperty("Elements", AV16Elements);
         ucQvprocesoa.setProperty("Parameters", AV29Parameters);
         ucQvprocesoa.setProperty("Height", Qvprocesoa_Height);
         ucQvprocesoa.setProperty("AllowSelection", Qvprocesoa_Allowselection);
         ucQvprocesoa.setProperty("Type", Qvprocesoa_Type);
         ucQvprocesoa.setProperty("Title", Qvprocesoa_Title);
         ucQvprocesoa.setProperty("ItemClickData", AV21ItemClickData);
         ucQvprocesoa.setProperty("ItemDoubleClickData", AV23ItemDoubleClickData);
         ucQvprocesoa.setProperty("DragAndDropData", AV14DragAndDropData);
         ucQvprocesoa.setProperty("FilterChangedData", AV39FilterChangedData);
         ucQvprocesoa.setProperty("ItemExpandData", AV24ItemExpandData);
         ucQvprocesoa.setProperty("ItemCollapseData", AV22ItemCollapseData);
         ucQvprocesoa.render(context, "queryviewer", Qvprocesoa_Internalname, "QVPROCESOAContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucQvprocesob.setProperty("Elements", AV16Elements);
         ucQvprocesob.setProperty("Parameters", AV29Parameters);
         ucQvprocesob.setProperty("Height", Qvprocesob_Height);
         ucQvprocesob.setProperty("AllowSelection", Qvprocesob_Allowselection);
         ucQvprocesob.setProperty("RememberLayout", Qvprocesob_Rememberlayout);
         ucQvprocesob.setProperty("Type", Qvprocesob_Type);
         ucQvprocesob.setProperty("Title", Qvprocesob_Title);
         ucQvprocesob.setProperty("ChartType", Qvprocesob_Charttype);
         ucQvprocesob.setProperty("ItemClickData", AV21ItemClickData);
         ucQvprocesob.setProperty("ItemDoubleClickData", AV23ItemDoubleClickData);
         ucQvprocesob.setProperty("DragAndDropData", AV14DragAndDropData);
         ucQvprocesob.setProperty("FilterChangedData", AV39FilterChangedData);
         ucQvprocesob.setProperty("ItemExpandData", AV24ItemExpandData);
         ucQvprocesob.setProperty("ItemCollapseData", AV22ItemCollapseData);
         ucQvprocesob.render(context, "queryviewer", Qvprocesob_Internalname, "QVPROCESOBContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucQvprocesoc.render(context, "ingenieria.graficaalertauc", Qvprocesoc_Internalname, "QVPROCESOCContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab1detalle_title_Internalname, httpContext.getMessage( "Parametro", ""), "", "", lblTab1detalle_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_Analisis.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab1Detalle") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledetalle_Internalname, divTabledetalle_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0104"+"", GXutil.rtrim( WebComp_Wcmrec_analisisdetalle_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0104"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcmrec_analisisdetalle_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcmrec_analisisdetalle), GXutil.lower( WebComp_Wcmrec_analisisdetalle_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0104"+"");
               }
               WebComp_Wcmrec_analisisdetalle.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcmrec_analisisdetalle), GXutil.lower( WebComp_Wcmrec_analisisdetalle_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"title3"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab1hdr_title_Internalname, httpContext.getMessage( "HDR", ""), "", "", lblTab1hdr_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_Analisis.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab1Hdr") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablehdr_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0112"+"", GXutil.rtrim( WebComp_Wcmrec_analisishdr_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0112"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcmrec_analisishdr_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcmrec_analisishdr), GXutil.lower( WebComp_Wcmrec_analisishdr_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0112"+"");
               }
               WebComp_Wcmrec_analisishdr.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcmrec_analisishdr), GXutil.lower( WebComp_Wcmrec_analisishdr_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs hidden-sm hidden-md hidden-lg", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablenodatos_Internalname, divTablenodatos_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelsindatos.setProperty("Width", Dvpanel_panelsindatos_Width);
         ucDvpanel_panelsindatos.setProperty("AutoWidth", Dvpanel_panelsindatos_Autowidth);
         ucDvpanel_panelsindatos.setProperty("AutoHeight", Dvpanel_panelsindatos_Autoheight);
         ucDvpanel_panelsindatos.setProperty("Cls", Dvpanel_panelsindatos_Cls);
         ucDvpanel_panelsindatos.setProperty("Title", Dvpanel_panelsindatos_Title);
         ucDvpanel_panelsindatos.setProperty("Collapsible", Dvpanel_panelsindatos_Collapsible);
         ucDvpanel_panelsindatos.setProperty("Collapsed", Dvpanel_panelsindatos_Collapsed);
         ucDvpanel_panelsindatos.setProperty("ShowCollapseIcon", Dvpanel_panelsindatos_Showcollapseicon);
         ucDvpanel_panelsindatos.setProperty("IconPosition", Dvpanel_panelsindatos_Iconposition);
         ucDvpanel_panelsindatos.setProperty("AutoScroll", Dvpanel_panelsindatos_Autoscroll);
         ucDvpanel_panelsindatos.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelsindatos_Internalname, "DVPANEL_PANELSINDATOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELSINDATOSContainer"+"PanelSinDatos"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelsindatos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado1_Internalname, 1, 0, "px", divTableresultado1_Height, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock_resultado1_Internalname, httpContext.getMessage( "<h2>No existen datos a mostrar, cambie los filtros </h2>", ""), "", "", lblTextblock_resultado1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "WizardStepDescription", 0, "", 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_Analisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblImage12_Internalname, httpContext.getMessage( "<i class='fas fa-chart-line' style='font-size: 50px'></i>", ""), "", "", lblImage12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(2), "HLP_Ingenieria\\MRec_Analisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamon.render(context, "datamonjs", Datamon_Internalname, "DATAMONContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV114Pgmname), GXutil.rtrim( localUtil.format( AV114Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec_Analisis.htm");
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
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavLongvarchar_Internalname, AV25Longvarchar, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,140);\"", (short)(0), edtavLongvarchar_Visible, 1, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Ingenieria\\MRec_Analisis.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSegundos_Internalname, GXutil.ltrim( localUtil.ntoc( AV32Segundos, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32Segundos), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", edtavSegundos_Tooltiptext, "", edtavSegundos_Jsonclick, 0, "Attribute", "", "", "", "", edtavSegundos_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRec_Analisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1WE2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Análisis", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1WE0( ) ;
   }

   public void ws1WE2( )
   {
      start1WE2( ) ;
      evt1WE2( ) ;
   }

   public void evt1WE2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_HDR.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e111WE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_MAQCOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121WE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_FASCOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131WE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "QVPROCESOA.ITEMCLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141WE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "QVPROCESOB.ITEMCLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151WE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "QVPROCESOC.ITEMCLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161WE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e171WE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOACTUALIZAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoActualizar' */
                           e181WE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VSEGUNDOS.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e191WE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDESDEFECHAHORA.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e201WE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VHASTAFECHAHORA.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e211WE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e221WE2 ();
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 104 )
                     {
                        OldWcmrec_analisisdetalle = httpContext.cgiGet( "W0104") ;
                        if ( ( GXutil.len( OldWcmrec_analisisdetalle) == 0 ) || ( GXutil.strcmp(OldWcmrec_analisisdetalle, WebComp_Wcmrec_analisisdetalle_Component) != 0 ) )
                        {
                           WebComp_Wcmrec_analisisdetalle = WebUtils.getWebComponent(getClass(), "app." + OldWcmrec_analisisdetalle + "_impl", remoteHandle, context);
                           WebComp_Wcmrec_analisisdetalle_Component = OldWcmrec_analisisdetalle ;
                        }
                        if ( GXutil.len( WebComp_Wcmrec_analisisdetalle_Component) != 0 )
                        {
                           WebComp_Wcmrec_analisisdetalle.componentprocess("W0104", "", sEvt);
                        }
                        WebComp_Wcmrec_analisisdetalle_Component = OldWcmrec_analisisdetalle ;
                     }
                     else if ( nCmpId == 112 )
                     {
                        OldWcmrec_analisishdr = httpContext.cgiGet( "W0112") ;
                        if ( ( GXutil.len( OldWcmrec_analisishdr) == 0 ) || ( GXutil.strcmp(OldWcmrec_analisishdr, WebComp_Wcmrec_analisishdr_Component) != 0 ) )
                        {
                           WebComp_Wcmrec_analisishdr = WebUtils.getWebComponent(getClass(), "app." + OldWcmrec_analisishdr + "_impl", remoteHandle, context);
                           WebComp_Wcmrec_analisishdr_Component = OldWcmrec_analisishdr ;
                        }
                        if ( GXutil.len( WebComp_Wcmrec_analisishdr_Component) != 0 )
                        {
                           WebComp_Wcmrec_analisishdr.componentprocess("W0112", "", sEvt);
                        }
                        WebComp_Wcmrec_analisishdr_Component = OldWcmrec_analisishdr ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1WE2( )
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

   public void pa1WE2( )
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
            GX_FocusControl = edtavDesdefechahora_Internalname ;
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
      AV20FueraRango = GXutil.strtobool( GXutil.booltostr( AV20FueraRango)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20FueraRango", AV20FueraRango);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1WE2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV114Pgmname = "Ingenieria.MRec_Analisis" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV114Pgmname", AV114Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1WE2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcmrec_analisisdetalle_Component) != 0 )
            {
               WebComp_Wcmrec_analisisdetalle.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcmrec_analisishdr_Component) != 0 )
            {
               WebComp_Wcmrec_analisishdr.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e221WE2 ();
         wb1WE0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1WE2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV17EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV74UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV74UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vIP", AV64Ip);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64Ip, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vVERSION", GXutil.rtrim( AV82Version));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVERSION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV82Version, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV9ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ContCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPOSICIONFINAL", GXutil.ltrim( localUtil.ntoc( AV110PosicionFinal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPOSICIONFINAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV110PosicionFinal), "ZZZ9")));
   }

   public void before_start_formulas( )
   {
      AV114Pgmname = "Ingenieria.MRec_Analisis" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV114Pgmname", AV114Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1WE0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e171WE2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV13DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vHDR_DATA"), AV61Hdr_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD_DATA"), AV27MaqCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASCOD_DATA"), AV19FasCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARFASCOD_DATA"), AV31ParFasCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vELEMENTS"), AV16Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARAMETERS"), AV29Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMCLICKDATA"), AV21ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMDOUBLECLICKDATA"), AV23ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDRAGANDDROPDATA"), AV14DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFILTERCHANGEDDATA"), AV39FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMEXPANDDATA"), AV24ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMCOLLAPSEDATA"), AV22ItemCollapseData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARFASCOD"), AV30ParFasCod);
         /* Read saved values. */
         AV10CronometroStart = GXutil.strtobool( httpContext.cgiGet( "vCRONOMETROSTART")) ;
         Combo_hdr_Cls = httpContext.cgiGet( "COMBO_HDR_Cls") ;
         Combo_hdr_Selectedvalue_set = httpContext.cgiGet( "COMBO_HDR_Selectedvalue_set") ;
         Combo_hdr_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_HDR_Allowmultipleselection")) ;
         Combo_hdr_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_HDR_Includeonlyselectedoption")) ;
         Combo_hdr_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_HDR_Emptyitem")) ;
         Combo_hdr_Multiplevaluestype = httpContext.cgiGet( "COMBO_HDR_Multiplevaluestype") ;
         Combo_maqcod_Cls = httpContext.cgiGet( "COMBO_MAQCOD_Cls") ;
         Combo_maqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_set") ;
         Combo_maqcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Allowmultipleselection")) ;
         Combo_maqcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Includeonlyselectedoption")) ;
         Combo_maqcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_MAQCOD_Multiplevaluestype") ;
         Combo_maqcod_Emptyitemtext = httpContext.cgiGet( "COMBO_MAQCOD_Emptyitemtext") ;
         Combo_fascod_Cls = httpContext.cgiGet( "COMBO_FASCOD_Cls") ;
         Combo_fascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_set") ;
         Combo_fascod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Allowmultipleselection")) ;
         Combo_fascod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Includeonlyselectedoption")) ;
         Combo_fascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Emptyitem")) ;
         Combo_fascod_Multiplevaluestype = httpContext.cgiGet( "COMBO_FASCOD_Multiplevaluestype") ;
         Combo_parfascod_Cls = httpContext.cgiGet( "COMBO_PARFASCOD_Cls") ;
         Combo_parfascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedvalue_set") ;
         Combo_parfascod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Allowmultipleselection")) ;
         Combo_parfascod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Includeonlyselectedoption")) ;
         Combo_parfascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Emptyitem")) ;
         Combo_parfascod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PARFASCOD_Multiplevaluestype") ;
         Dvpanel_panelfiltros_Width = httpContext.cgiGet( "DVPANEL_PANELFILTROS_Width") ;
         Dvpanel_panelfiltros_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Autowidth")) ;
         Dvpanel_panelfiltros_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Autoheight")) ;
         Dvpanel_panelfiltros_Cls = httpContext.cgiGet( "DVPANEL_PANELFILTROS_Cls") ;
         Dvpanel_panelfiltros_Title = httpContext.cgiGet( "DVPANEL_PANELFILTROS_Title") ;
         Dvpanel_panelfiltros_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Collapsible")) ;
         Dvpanel_panelfiltros_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Collapsed")) ;
         Dvpanel_panelfiltros_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Showcollapseicon")) ;
         Dvpanel_panelfiltros_Iconposition = httpContext.cgiGet( "DVPANEL_PANELFILTROS_Iconposition") ;
         Dvpanel_panelfiltros_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELFILTROS_Autoscroll")) ;
         Qvprocesoa_Objectcall = httpContext.cgiGet( "QVPROCESOA_Objectcall") ;
         Qvprocesoa_Objectcall = httpContext.cgiGet( "QVPROCESOA_Objectcall") ;
         Qvprocesoa_Height = httpContext.cgiGet( "QVPROCESOA_Height") ;
         Qvprocesoa_Allowselection = GXutil.strtobool( httpContext.cgiGet( "QVPROCESOA_Allowselection")) ;
         Qvprocesoa_Type = httpContext.cgiGet( "QVPROCESOA_Type") ;
         Qvprocesob_Objectcall = httpContext.cgiGet( "QVPROCESOB_Objectcall") ;
         Qvprocesob_Objectcall = httpContext.cgiGet( "QVPROCESOB_Objectcall") ;
         Qvprocesob_Height = httpContext.cgiGet( "QVPROCESOB_Height") ;
         Qvprocesob_Allowselection = GXutil.strtobool( httpContext.cgiGet( "QVPROCESOB_Allowselection")) ;
         Qvprocesob_Rememberlayout = GXutil.strtobool( httpContext.cgiGet( "QVPROCESOB_Rememberlayout")) ;
         Qvprocesob_Type = httpContext.cgiGet( "QVPROCESOB_Type") ;
         Qvprocesob_Charttype = httpContext.cgiGet( "QVPROCESOB_Charttype") ;
         Qvprocesoc_Datasource = httpContext.cgiGet( "QVPROCESOC_Datasource") ;
         Gxuitabspanel_tabs1_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_tabs1_Class = httpContext.cgiGet( "GXUITABSPANEL_TABS1_Class") ;
         Gxuitabspanel_tabs1_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Historymanagement")) ;
         Dvpanel_panelsindatos_Width = httpContext.cgiGet( "DVPANEL_PANELSINDATOS_Width") ;
         Dvpanel_panelsindatos_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELSINDATOS_Autowidth")) ;
         Dvpanel_panelsindatos_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELSINDATOS_Autoheight")) ;
         Dvpanel_panelsindatos_Cls = httpContext.cgiGet( "DVPANEL_PANELSINDATOS_Cls") ;
         Dvpanel_panelsindatos_Title = httpContext.cgiGet( "DVPANEL_PANELSINDATOS_Title") ;
         Dvpanel_panelsindatos_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELSINDATOS_Collapsible")) ;
         Dvpanel_panelsindatos_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELSINDATOS_Collapsed")) ;
         Dvpanel_panelsindatos_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELSINDATOS_Showcollapseicon")) ;
         Dvpanel_panelsindatos_Iconposition = httpContext.cgiGet( "DVPANEL_PANELSINDATOS_Iconposition") ;
         Dvpanel_panelsindatos_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELSINDATOS_Autoscroll")) ;
         Combo_fascod_Selectedvalue_get = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_get") ;
         Combo_maqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_get") ;
         Combo_hdr_Selectedvalue_get = httpContext.cgiGet( "COMBO_HDR_Selectedvalue_get") ;
         Qvprocesoc_Clickedvalue = httpContext.cgiGet( "QVPROCESOC_Clickedvalue") ;
         Qvprocesoc_Clickedtime = httpContext.cgiGet( "QVPROCESOC_Clickedtime") ;
         Qvprocesoc_Clickedseriesname = httpContext.cgiGet( "QVPROCESOC_Clickedseriesname") ;
         /* Read variables values. */
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavDesdefechahora_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vDESDEFECHAHORA");
            GX_FocusControl = edtavDesdefechahora_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV47DesdeFechaHora = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV47DesdeFechaHora", localUtil.ttoc( AV47DesdeFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV47DesdeFechaHora = localUtil.ctot( httpContext.cgiGet( edtavDesdefechahora_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47DesdeFechaHora", localUtil.ttoc( AV47DesdeFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHastafechahora_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHASTAFECHAHORA");
            GX_FocusControl = edtavHastafechahora_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV48HastaFechaHora = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV48HastaFechaHora", localUtil.ttoc( AV48HastaFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV48HastaFechaHora = localUtil.ctot( httpContext.cgiGet( edtavHastafechahora_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48HastaFechaHora", localUtil.ttoc( AV48HastaFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         AV20FueraRango = GXutil.strtobool( httpContext.cgiGet( chkavFuerarango.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20FueraRango", AV20FueraRango);
         AV114Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV114Pgmname", AV114Pgmname);
         AV25Longvarchar = httpContext.cgiGet( edtavLongvarchar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Longvarchar", AV25Longvarchar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSegundos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSegundos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSEGUNDOS");
            GX_FocusControl = edtavSegundos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV32Segundos = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Segundos), 6, 0));
         }
         else
         {
            AV32Segundos = (int)(localUtil.ctol( httpContext.cgiGet( edtavSegundos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Segundos), 6, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"MRec_Analisis");
         AV114Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV114Pgmname", AV114Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV114Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ingenieria\\mrec_analisis:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e171WE2 ();
      if (returnInSub) return;
   }

   public void e171WE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV17EmprCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.vxparam_acaemp(remoteHandle, context).execute( GXv_char2) ;
      mrec_analisis_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17EmprCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      if ( (GXutil.strcmp("", AV17EmprCod)==0) )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "No se encontró el parametro ACAEMP en parametros de GAIA", ""), "", "", "", "", "", "", "", "", ""), AV114Pgmname) ;
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "El parametro ACAEMP es %1", ""), AV17EmprCod, "", "", "", "", "", "", "", ""), AV114Pgmname) ;
      }
      AV9ContCod = httpContext.getMessage( "INGSIM", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9ContCod", AV9ContCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ContCod, "@!"))));
      GXv_SdtWWPContext3[0] = AV75WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext3) ;
      AV75WWPContext = GXv_SdtWWPContext3[0] ;
      AV74UsurCod = AV75WWPContext.getgxTv_SdtWWPContext_Usurcod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74UsurCod", AV74UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV74UsurCod, "@!"))));
      AV64Ip = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64Ip", AV64Ip);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64Ip, ""))));
      AV84ProgressIndicator.hide();
      if ( 1 == 0 )
      {
         GXt_char1 = AV78Station ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         mrec_analisis_impl.this.GXt_char1 = GXv_char2[0] ;
         AV78Station = GXt_char1 ;
         GXv_char2[0] = AV17EmprCod ;
         GXv_char4[0] = AV79EmprNom ;
         GXv_char5[0] = AV74UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV78Station, GXv_char2, GXv_char4, GXv_char5) ;
         mrec_analisis_impl.this.AV17EmprCod = GXv_char2[0] ;
         mrec_analisis_impl.this.AV79EmprNom = GXv_char4[0] ;
         mrec_analisis_impl.this.AV74UsurCod = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, "AV74UsurCod", AV74UsurCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV74UsurCod, "@!"))));
         divTableresultado1_Height = 300 ;
         httpContext.ajax_rsp_assign_prop("", false, divTableresultado1_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableresultado1_Height), 9, 0), true);
         GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV13DDO_TitleSettingsIcons;
         GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
         new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
         GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
         AV13DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
         edtavSegundos_Tooltiptext = httpContext.getMessage( "Intervalo de tiempo", "") ;
         httpContext.ajax_rsp_assign_prop("", false, edtavSegundos_Internalname, "Tooltiptext", edtavSegundos_Tooltiptext, true);
         /* Execute user subroutine: 'LOADCOMBOHDR' */
         S112 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
         S122 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'LOADCOMBOFASCOD' */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'LOADCOMBOPARFASCOD' */
         S142 ();
         if (returnInSub) return;
         edtavLongvarchar_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLongvarchar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLongvarchar_Visible), 5, 0), true);
         edtavSegundos_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavSegundos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSegundos_Visible), 5, 0), true);
      }
      edtavLongvarchar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLongvarchar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLongvarchar_Visible), 5, 0), true);
      edtavSegundos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSegundos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSegundos_Visible), 5, 0), true);
      divTableresultado1_Height = 300 ;
      httpContext.ajax_rsp_assign_prop("", false, divTableresultado1_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableresultado1_Height), 9, 0), true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV13DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV13DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtavSegundos_Tooltiptext = httpContext.getMessage( "Intervalo de tiempo", "") ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSegundos_Internalname, "Tooltiptext", edtavSegundos_Tooltiptext, true);
      AV32Segundos = 999999 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Segundos), 6, 0));
      AV48HastaFechaHora = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48HastaFechaHora", localUtil.ttoc( AV48HastaFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV47DesdeFechaHora = GXutil.dtadd( AV48HastaFechaHora, 60*(-30)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47DesdeFechaHora", localUtil.ttoc( AV47DesdeFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      divTablegrafica_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablegrafica_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablegrafica_Visible), 5, 0), true);
      divTabledetalle_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTabledetalle_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabledetalle_Visible), 5, 0), true);
      divTablenodatos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablenodatos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablenodatos_Visible), 5, 0), true);
   }

   public void e181WE2( )
   {
      /* 'DoActualizar' Routine */
      returnInSub = false ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Actualizando desde evento DoActualizar : &EmprCod=%1, &Desde=%2, &Hasta=%3, &MaqCod=%4, &FasCod=%5, &Hdr=%6, &ParCod=%7, &FueraRango=%8.", ""), AV17EmprCod, localUtil.ttoc( AV43Desde, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV44Hasta, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV26MaqCod.toJSonString(false), AV18FasCod.toJSonString(false), AV60Hdr.toJSonString(false), AV30ParFasCod.toJSonString(false), GXutil.booltostr( AV20FueraRango), ""), AV114Pgmname) ;
      /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
      S152 ();
      if (returnInSub) return;
      AV10CronometroStart = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10CronometroStart", AV10CronometroStart);
      /* Execute user subroutine: 'INICIARPARARCRONOMETRO' */
      S162 ();
      if (returnInSub) return;
      this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63inFilSDT", AV63inFilSDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV16Elements", AV16Elements);
   }

   public void e131WE2( )
   {
      /* Combo_fascod_Onoptionclicked Routine */
      returnInSub = false ;
      AV10CronometroStart = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10CronometroStart", AV10CronometroStart);
      /* Execute user subroutine: 'INICIARPARARCRONOMETRO' */
      S162 ();
      if (returnInSub) return;
      AV18FasCod.fromJSonString(Combo_fascod_Selectedvalue_get, null);
      AV30ParFasCod.clear();
      /* Execute user subroutine: 'LOADCOMBOPARFASCOD' */
      S142 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18FasCod", AV18FasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30ParFasCod", AV30ParFasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31ParFasCod_Data", AV31ParFasCod_Data);
   }

   public void e121WE2( )
   {
      /* Combo_maqcod_Onoptionclicked Routine */
      returnInSub = false ;
      AV10CronometroStart = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10CronometroStart", AV10CronometroStart);
      /* Execute user subroutine: 'INICIARPARARCRONOMETRO' */
      S162 ();
      if (returnInSub) return;
      AV26MaqCod.fromJSonString(Combo_maqcod_Selectedvalue_get, null);
      AV18FasCod.clear();
      AV30ParFasCod.clear();
      /* Execute user subroutine: 'LOADCOMBOFASCOD' */
      S132 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26MaqCod", AV26MaqCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18FasCod", AV18FasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30ParFasCod", AV30ParFasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19FasCod_Data", AV19FasCod_Data);
   }

   public void e111WE2( )
   {
      /* Combo_hdr_Onoptionclicked Routine */
      returnInSub = false ;
      AV60Hdr.fromJSonString(Combo_hdr_Selectedvalue_get, null);
      AV26MaqCod.clear();
      AV18FasCod.clear();
      AV30ParFasCod.clear();
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S122 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60Hdr", AV60Hdr);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26MaqCod", AV26MaqCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18FasCod", AV18FasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30ParFasCod", AV30ParFasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27MaqCod_Data", AV27MaqCod_Data);
   }

   public void S142( )
   {
      /* 'LOADCOMBOPARFASCOD' Routine */
      returnInSub = false ;
      AV31ParFasCod_Data.clear();
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Cargue Parametros: HDRs=%1, Fases:%2, Maquinas:%3.", ""), AV60Hdr.toJSonString(false), AV18FasCod.toJSonString(false), AV26MaqCod.toJSonString(false), "", "", "", "", "", ""), AV114Pgmname) ;
      if ( ( AV18FasCod.size() > 0 ) && ( AV26MaqCod.size() > 0 ) && ( AV60Hdr.size() > 0 ) )
      {
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A14693MEPrMaqCod ,
                                              AV26MaqCod ,
                                              A14691MEPrFasCod ,
                                              AV18FasCod ,
                                              A14697MEPrHdr ,
                                              AV60Hdr ,
                                              A14700MEPrReg ,
                                              AV45Now ,
                                              A14698MEPrUsu ,
                                              AV74UsurCod ,
                                              A14699MEPrIp ,
                                              AV64Ip ,
                                              A14701MEPrTkn ,
                                              AV77MTkn ,
                                              A14702MEPrObj ,
                                              AV114Pgmname ,
                                              AV17EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor H01WE2 */
         pr_default.execute(0, new Object[] {AV17EmprCod, AV45Now, AV74UsurCod, AV64Ip, AV77MTkn, AV114Pgmname});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A14702MEPrObj = H01WE2_A14702MEPrObj[0] ;
            A14701MEPrTkn = H01WE2_A14701MEPrTkn[0] ;
            A14700MEPrReg = H01WE2_A14700MEPrReg[0] ;
            A14699MEPrIp = H01WE2_A14699MEPrIp[0] ;
            A14698MEPrUsu = H01WE2_A14698MEPrUsu[0] ;
            A14697MEPrHdr = H01WE2_A14697MEPrHdr[0] ;
            A14691MEPrFasCod = H01WE2_A14691MEPrFasCod[0] ;
            A14693MEPrMaqCod = H01WE2_A14693MEPrMaqCod[0] ;
            A396EmprCod = H01WE2_A396EmprCod[0] ;
            A14696MEPrParDsc = H01WE2_A14696MEPrParDsc[0] ;
            A14695MEPrParCod = H01WE2_A14695MEPrParCod[0] ;
            new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Ingresa  Parametros:%1-%2, HDRs=%3, Fases:%4, Maquinas:%5.", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(A14695MEPrParCod), 4, 0), A14696MEPrParDsc, AV60Hdr.toJSonString(false), AV18FasCod.toJSonString(false), AV26MaqCod.toJSonString(false), "", "", "", ""), AV114Pgmname) ;
            AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.str( A14695MEPrParCod, 4, 0) );
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.str( A14695MEPrParCod, 4, 0), GXutil.trim( A14696MEPrParDsc), "", "", "", "", "", "", "") );
            AV31ParFasCod_Data.add(AV8Combo_DataItem, 0);
            pr_default.readNext(0);
         }
         pr_default.close(0);
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Parametros %1.", ""), AV31ParFasCod_Data.toJSonString(false), "", "", "", "", "", "", "", ""), AV114Pgmname) ;
         AV31ParFasCod_Data.sort("Title");
         Combo_parfascod_Selectedvalue_set = AV30ParFasCod.toJSonString(false) ;
         ucCombo_parfascod.sendProperty(context, "", false, Combo_parfascod_Internalname, "SelectedValue_set", Combo_parfascod_Selectedvalue_set);
      }
      else
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "no ingresa a cargar parametros", ""), "", "", "", "", "", "", "", "", ""));
      }
   }

   public void S132( )
   {
      /* 'LOADCOMBOFASCOD' Routine */
      returnInSub = false ;
      AV19FasCod_Data.clear();
      if ( AV26MaqCod.size() > 0 )
      {
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A14693MEPrMaqCod ,
                                              AV26MaqCod ,
                                              A14697MEPrHdr ,
                                              AV60Hdr ,
                                              A14700MEPrReg ,
                                              AV45Now ,
                                              A14698MEPrUsu ,
                                              AV74UsurCod ,
                                              A14699MEPrIp ,
                                              AV64Ip ,
                                              A14701MEPrTkn ,
                                              AV77MTkn ,
                                              A14702MEPrObj ,
                                              AV114Pgmname ,
                                              AV17EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor H01WE3 */
         pr_default.execute(1, new Object[] {AV17EmprCod, AV45Now, AV74UsurCod, AV64Ip, AV77MTkn, AV114Pgmname});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A14702MEPrObj = H01WE3_A14702MEPrObj[0] ;
            A14701MEPrTkn = H01WE3_A14701MEPrTkn[0] ;
            A14700MEPrReg = H01WE3_A14700MEPrReg[0] ;
            A14699MEPrIp = H01WE3_A14699MEPrIp[0] ;
            A14698MEPrUsu = H01WE3_A14698MEPrUsu[0] ;
            A14697MEPrHdr = H01WE3_A14697MEPrHdr[0] ;
            A14693MEPrMaqCod = H01WE3_A14693MEPrMaqCod[0] ;
            A396EmprCod = H01WE3_A396EmprCod[0] ;
            A14692MEPrFasDsc = H01WE3_A14692MEPrFasDsc[0] ;
            A14691MEPrFasCod = H01WE3_A14691MEPrFasCod[0] ;
            AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A14691MEPrFasCod );
            AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", A14691MEPrFasCod, A14692MEPrFasDsc, "", "", "", "", "", "", "") );
            AV19FasCod_Data.add(AV8Combo_DataItem, 0);
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      AV19FasCod_Data.sort("Title");
      Combo_fascod_Selectedvalue_set = AV18FasCod.toJSonString(false) ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOMAQCOD' Routine */
      returnInSub = false ;
      AV27MaqCod_Data.clear();
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A14697MEPrHdr ,
                                           AV60Hdr ,
                                           A14700MEPrReg ,
                                           AV45Now ,
                                           A14698MEPrUsu ,
                                           AV74UsurCod ,
                                           A14699MEPrIp ,
                                           AV64Ip ,
                                           A14701MEPrTkn ,
                                           AV77MTkn ,
                                           A14702MEPrObj ,
                                           AV114Pgmname ,
                                           AV17EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H01WE4 */
      pr_default.execute(2, new Object[] {AV17EmprCod, AV45Now, AV74UsurCod, AV64Ip, AV77MTkn, AV114Pgmname});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14702MEPrObj = H01WE4_A14702MEPrObj[0] ;
         A14701MEPrTkn = H01WE4_A14701MEPrTkn[0] ;
         A14700MEPrReg = H01WE4_A14700MEPrReg[0] ;
         A14699MEPrIp = H01WE4_A14699MEPrIp[0] ;
         A14698MEPrUsu = H01WE4_A14698MEPrUsu[0] ;
         A14697MEPrHdr = H01WE4_A14697MEPrHdr[0] ;
         A396EmprCod = H01WE4_A396EmprCod[0] ;
         A14694MEPrMaqDsc = H01WE4_A14694MEPrMaqDsc[0] ;
         A14693MEPrMaqCod = H01WE4_A14693MEPrMaqCod[0] ;
         AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A14693MEPrMaqCod );
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", A14693MEPrMaqCod, GXutil.trim( A14694MEPrMaqDsc), "", "", "", "", "", "", "") );
         AV27MaqCod_Data.add(AV8Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV27MaqCod_Data.sort("Title");
      Combo_maqcod_Selectedvalue_set = AV26MaqCod.toJSonString(false) ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOHDR' Routine */
      returnInSub = false ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "cargando HDR con fases:%1, maquinas:%2, empresa:%3.", ""), AV18FasCod.toJSonString(false), AV26MaqCod.toJSonString(false), AV17EmprCod, "", "", "", "", "", ""), AV114Pgmname) ;
      AV61Hdr_Data.clear();
      /* Using cursor H01WE5 */
      pr_default.execute(3, new Object[] {AV17EmprCod, AV45Now, AV74UsurCod, AV64Ip, AV77MTkn, AV114Pgmname});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A14702MEPrObj = H01WE5_A14702MEPrObj[0] ;
         A14701MEPrTkn = H01WE5_A14701MEPrTkn[0] ;
         A14700MEPrReg = H01WE5_A14700MEPrReg[0] ;
         A14699MEPrIp = H01WE5_A14699MEPrIp[0] ;
         A14698MEPrUsu = H01WE5_A14698MEPrUsu[0] ;
         A396EmprCod = H01WE5_A396EmprCod[0] ;
         A130BarCodPar = H01WE5_A130BarCodPar[0] ;
         A132BarCodReo = H01WE5_A132BarCodReo[0] ;
         A129BarCod = H01WE5_A129BarCod[0] ;
         AV8Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.format( "%1%2%3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0), GXutil.str( A132BarCodReo, 1, 0), A130BarCodPar, "", "", "", "", "", "") );
         AV8Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1%2%3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0), GXutil.str( A132BarCodReo, 1, 0), A130BarCodPar, "", "", "", "", "", "") );
         AV61Hdr_Data.add(AV8Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV61Hdr_Data.sort("Title");
      Combo_hdr_Selectedvalue_set = AV60Hdr.toJSonString(false) ;
      ucCombo_hdr.sendProperty(context, "", false, Combo_hdr_Internalname, "SelectedValue_set", Combo_hdr_Selectedvalue_set);
   }

   public void e191WE2( )
   {
      /* Segundos_Controlvaluechanged Routine */
      returnInSub = false ;
      divTablerango_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablerango_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablerango_Visible), 5, 0), true);
      AV47DesdeFechaHora = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV47DesdeFechaHora", localUtil.ttoc( AV47DesdeFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV48HastaFechaHora = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV48HastaFechaHora", localUtil.ttoc( AV48HastaFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      if ( AV32Segundos == 999999 )
      {
         divTablerango_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, divTablerango_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablerango_Visible), 5, 0), true);
         AV48HastaFechaHora = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48HastaFechaHora", localUtil.ttoc( AV48HastaFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV47DesdeFechaHora = GXutil.dtadd( AV48HastaFechaHora, 86400*(-1)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47DesdeFechaHora", localUtil.ttoc( AV47DesdeFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      AV10CronometroStart = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10CronometroStart", AV10CronometroStart);
      /* Execute user subroutine: 'INICIARPARARCRONOMETRO' */
      S162 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e201WE2( )
   {
      /* Desdefechahora_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ORGANIZAR FILTRO' */
      S172 ();
      if (returnInSub) return;
      AV60Hdr.clear();
      AV26MaqCod.clear();
      AV18FasCod.clear();
      AV30ParFasCod.clear();
      /* Execute user subroutine: 'LOADCOMBOHDR' */
      S112 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60Hdr", AV60Hdr);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26MaqCod", AV26MaqCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18FasCod", AV18FasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30ParFasCod", AV30ParFasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63inFilSDT", AV63inFilSDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV61Hdr_Data", AV61Hdr_Data);
   }

   public void e211WE2( )
   {
      /* Hastafechahora_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ORGANIZAR FILTRO' */
      S172 ();
      if (returnInSub) return;
      AV60Hdr.clear();
      AV26MaqCod.clear();
      AV18FasCod.clear();
      AV30ParFasCod.clear();
      /* Execute user subroutine: 'LOADCOMBOHDR' */
      S112 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60Hdr", AV60Hdr);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26MaqCod", AV26MaqCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18FasCod", AV18FasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30ParFasCod", AV30ParFasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63inFilSDT", AV63inFilSDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV61Hdr_Data", AV61Hdr_Data);
   }

   public void e141WE2( )
   {
      /* Qvprocesoa_Itemclick Routine */
      returnInSub = false ;
      AV83Titulo = GXutil.format( httpContext.getMessage( "Detalle HDRs %7, con el Intervalo:%1--%2, Maquinas:%3, Fases:%4, HDRs:%5.", ""), localUtil.ttoc( AV43Desde, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV44Hasta, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV99LineaMaqCod.toJSonString(false), AV100LineaFasCod.toJSonString(false), AV101LineaHdr.toJSonString(false), "", "", "", "") ;
      new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV83Titulo, 50, true, (byte)(1)) ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcmrec_analisishdr = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcmrec_analisishdr_Component), GXutil.lower( "Ingenieria.MRec_AnalisisHdr")) != 0 )
      {
         WebComp_Wcmrec_analisishdr = WebUtils.getWebComponent(getClass(), "app.ingenieria.mrec_analisishdr_impl", remoteHandle, context);
         WebComp_Wcmrec_analisishdr_Component = "Ingenieria.MRec_AnalisisHdr" ;
      }
      if ( GXutil.len( WebComp_Wcmrec_analisishdr_Component) != 0 )
      {
         WebComp_Wcmrec_analisishdr.setjustcreated();
         WebComp_Wcmrec_analisishdr.componentprepare(new Object[] {"W0112","",AV17EmprCod,AV26MaqCod.toJSonString(false),AV18FasCod.toJSonString(false),AV60Hdr.toJSonString(false),AV43Desde,AV44Hasta,AV74UsurCod,AV64Ip,AV45Now,AV77MTkn});
         WebComp_Wcmrec_analisishdr.componentbind(new Object[] {"",""+"",""+"",""+"","","","","","",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcmrec_analisishdr )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0112"+"");
         WebComp_Wcmrec_analisishdr.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV83Titulo, 90, true, (byte)(1)) ;
      new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV83Titulo, 100, false, (byte)(1)) ;
      this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABS1Container", "SelectTab", "", new Object[] {Integer.valueOf(3)});
      /*  Sending Event outputs  */
   }

   public void e151WE2( )
   {
      /* Qvprocesob_Itemclick Routine */
      returnInSub = false ;
      AV85DataPosicion.clear();
      AV85DataPosicion = AV21ItemClickData.getgxTv_SdtQueryViewerItemClickData_Context() ;
      AV92EncontradoNombrePlc = GXutil.trim( AV21ItemClickData.getgxTv_SdtQueryViewerItemClickData_Name()) ;
      AV93Posicion = (short)(GXutil.strSearch( AV92EncontradoNombrePlc, "_", 1)+1) ;
      AV94Largo = (short)(GXutil.len( AV92EncontradoNombrePlc)) ;
      AV95NumeroNombrePlc = GXutil.substring( AV92EncontradoNombrePlc, AV93Posicion, AV94Largo) ;
      AV80i = (byte)(GXutil.lval( AV95NumeroNombrePlc)) ;
      GXt_boolean8 = AV59existeRegistro ;
      GXv_char5[0] = AV98MRParPrHdr ;
      GXv_char4[0] = AV104MRParPrMaqCod ;
      GXv_char2[0] = AV103MRParPrFasCod ;
      GXv_int9[0] = AV105MRParPrCod ;
      GXv_char10[0] = AV68MRParPrPLC ;
      GXv_boolean11[0] = GXt_boolean8 ;
      new app.ingenieria.mrparprohdrget(remoteHandle, context).execute( AV74UsurCod, AV64Ip, AV45Now, AV77MTkn, AV80i, GXv_char5, GXv_char4, GXv_char2, GXv_int9, GXv_char10, GXv_boolean11) ;
      mrec_analisis_impl.this.AV98MRParPrHdr = GXv_char5[0] ;
      mrec_analisis_impl.this.AV104MRParPrMaqCod = GXv_char4[0] ;
      mrec_analisis_impl.this.AV103MRParPrFasCod = GXv_char2[0] ;
      mrec_analisis_impl.this.AV105MRParPrCod = GXv_int9[0] ;
      mrec_analisis_impl.this.AV68MRParPrPLC = GXv_char10[0] ;
      mrec_analisis_impl.this.GXt_boolean8 = GXv_boolean11[0] ;
      AV59existeRegistro = GXt_boolean8 ;
      AV99LineaMaqCod.clear();
      AV99LineaMaqCod.add(AV104MRParPrMaqCod, 0);
      AV100LineaFasCod.clear();
      AV100LineaFasCod.add(AV103MRParPrFasCod, 0);
      AV101LineaHdr.clear();
      AV101LineaHdr.add(GXutil.trim( AV98MRParPrHdr), 0);
      AV102LineaParFasCod.clear();
      AV102LineaParFasCod.add((short)(AV105MRParPrCod), 0);
      httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Detalle para la HDR:%2 con el Plc:%1", ""), AV68MRParPrPLC, AV98MRParPrHdr, "", "", "", "", "", "", ""));
      AV83Titulo = GXutil.format( httpContext.getMessage( "Detalle PLC %7, con el Intervalo:%1--%2, Maquinas:%3, Fases:%4, HDRs:%5, Parametros:%6.", ""), localUtil.ttoc( AV43Desde, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV44Hasta, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV99LineaMaqCod.toJSonString(false), AV100LineaFasCod.toJSonString(false), AV101LineaHdr.toJSonString(false), AV102LineaParFasCod.toJSonString(false), AV68MRParPrPLC, "", "") ;
      new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV83Titulo, 50, true, (byte)(1)) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "LLamando Detalle con &EmprCod=%1, &ContCod=%2, &Segundos=%3, Maquinas=%4, Fases:%5, &Hrs:%6, Plc:%7, &FueraRango=%8, %9...", ""), AV17EmprCod, AV9ContCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Segundos), 6, 0), AV99LineaMaqCod.toJSonString(false), AV100LineaFasCod.toJSonString(false), AV101LineaHdr.toJSonString(false), AV102LineaParFasCod.toJSonString(false), GXutil.booltostr( AV20FueraRango), GXutil.format( httpContext.getMessage( " &Desde=%1, &Hasta=%2, &UsurCod=%3, &Ip=%4, &Now=%5, &MTkn=%6", ""), localUtil.ttoc( AV43Desde, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV44Hasta, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV74UsurCod, AV64Ip, localUtil.ttoc( AV45Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV77MTkn, "", "", "")), AV114Pgmname) ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcmrec_analisisdetalle = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcmrec_analisisdetalle_Component), GXutil.lower( "Ingenieria.MRec_AnalisisDetalle")) != 0 )
      {
         WebComp_Wcmrec_analisisdetalle = WebUtils.getWebComponent(getClass(), "app.ingenieria.mrec_analisisdetalle_impl", remoteHandle, context);
         WebComp_Wcmrec_analisisdetalle_Component = "Ingenieria.MRec_AnalisisDetalle" ;
      }
      if ( GXutil.len( WebComp_Wcmrec_analisisdetalle_Component) != 0 )
      {
         WebComp_Wcmrec_analisisdetalle.setjustcreated();
         WebComp_Wcmrec_analisisdetalle.componentprepare(new Object[] {"W0104","",AV17EmprCod,AV9ContCod,Integer.valueOf(AV32Segundos),AV99LineaMaqCod.toJSonString(false),AV100LineaFasCod.toJSonString(false),AV101LineaHdr.toJSonString(false),AV102LineaParFasCod.toJSonString(false),Boolean.valueOf(AV20FueraRango),AV43Desde,AV44Hasta,AV74UsurCod,AV64Ip,AV45Now,AV77MTkn});
         WebComp_Wcmrec_analisisdetalle.componentbind(new Object[] {"","","vSEGUNDOS",""+"",""+"",""+"",""+"","vFUERARANGO","","","","","",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcmrec_analisisdetalle )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0104"+"");
         WebComp_Wcmrec_analisisdetalle.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      divTabledetalle_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, divTabledetalle_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabledetalle_Visible), 5, 0), true);
      this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABS1Container", "SelectTab", "", new Object[] {Integer.valueOf(2)});
      new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV83Titulo, 90, true, (byte)(1)) ;
      new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV83Titulo, 100, false, (byte)(1)) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV99LineaMaqCod", AV99LineaMaqCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV100LineaFasCod", AV100LineaFasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV101LineaHdr", AV101LineaHdr);
   }

   public void e161WE2( )
   {
      /* Qvprocesoc_Itemclick Routine */
      returnInSub = false ;
      httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Click en gráfico: Serie=%1, Tiempo=%2, Valor=%3", ""), Qvprocesoc_Clickedseriesname, Qvprocesoc_Clickedtime, Qvprocesoc_Clickedvalue, "", "", "", "", "", ""));
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Click en gráfico: Serie=%1, Tiempo=%2, Valor=%3", ""), Qvprocesoc_Clickedseriesname, Qvprocesoc_Clickedtime, Qvprocesoc_Clickedvalue, "", "", "", "", "", ""), AV114Pgmname) ;
      AV92EncontradoNombrePlc = Qvprocesoc_Clickedseriesname ;
      AV93Posicion = (short)(GXutil.strSearch( AV92EncontradoNombrePlc, "-", 1)-1) ;
      AV94Largo = (short)(GXutil.len( AV92EncontradoNombrePlc)) ;
      AV95NumeroNombrePlc = GXutil.substring( AV92EncontradoNombrePlc, 1, AV93Posicion) ;
      AV111MRParPrId = GXutil.lval( AV95NumeroNombrePlc) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "linea: &EncontradoNombrePlc:%1, MRParPrId:%2, &Posicion:%3,&PosicionFinal=%4 &Largo=%5, &NumeroNombrePlc=%6.", ""), AV92EncontradoNombrePlc, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111MRParPrId), 10, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Posicion), 4, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110PosicionFinal), 4, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94Largo), 4, 0), AV95NumeroNombrePlc, "", "", ""), AV114Pgmname) ;
      GXt_boolean8 = AV59existeRegistro ;
      GXv_char10[0] = AV98MRParPrHdr ;
      GXv_char5[0] = AV104MRParPrMaqCod ;
      GXv_char4[0] = AV103MRParPrFasCod ;
      GXv_int9[0] = AV105MRParPrCod ;
      GXv_char2[0] = AV68MRParPrPLC ;
      GXv_boolean11[0] = GXt_boolean8 ;
      new app.ingenieria.mrparprohdrget(remoteHandle, context).execute( AV74UsurCod, AV64Ip, AV45Now, AV77MTkn, AV111MRParPrId, GXv_char10, GXv_char5, GXv_char4, GXv_int9, GXv_char2, GXv_boolean11) ;
      mrec_analisis_impl.this.AV98MRParPrHdr = GXv_char10[0] ;
      mrec_analisis_impl.this.AV104MRParPrMaqCod = GXv_char5[0] ;
      mrec_analisis_impl.this.AV103MRParPrFasCod = GXv_char4[0] ;
      mrec_analisis_impl.this.AV105MRParPrCod = GXv_int9[0] ;
      mrec_analisis_impl.this.AV68MRParPrPLC = GXv_char2[0] ;
      mrec_analisis_impl.this.GXt_boolean8 = GXv_boolean11[0] ;
      AV59existeRegistro = GXt_boolean8 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "linea localiza: &UsurCod=%1, &Ip=%2, &Now=%3, &MTkn=%4, &MRParPrId=%5, &MRParPrHdr=%6, &MRParPrPLC=%7. ", ""), AV74UsurCod, AV64Ip, localUtil.ttoc( AV45Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV77MTkn, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111MRParPrId), 10, 0), AV98MRParPrHdr, AV68MRParPrPLC, "", ""), AV114Pgmname) ;
      AV99LineaMaqCod.clear();
      AV99LineaMaqCod.add(AV104MRParPrMaqCod, 0);
      AV100LineaFasCod.clear();
      AV100LineaFasCod.add(AV103MRParPrFasCod, 0);
      AV101LineaHdr.clear();
      AV101LineaHdr.add(GXutil.trim( AV98MRParPrHdr), 0);
      AV102LineaParFasCod.clear();
      AV102LineaParFasCod.add((short)(AV105MRParPrCod), 0);
      AV83Titulo = GXutil.format( httpContext.getMessage( "Detalle PLC %7, con el Intervalo:%1--%2, Maquinas:%3, Fases:%4, HDRs:%5, Parametros:%6.", ""), localUtil.ttoc( AV43Desde, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV44Hasta, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV99LineaMaqCod.toJSonString(false), AV100LineaFasCod.toJSonString(false), AV101LineaHdr.toJSonString(false), AV102LineaParFasCod.toJSonString(false), AV68MRParPrPLC, "", "") ;
      new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV83Titulo, 50, true, (byte)(1)) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "LLamando Detalle con &EmprCod=%1, &ContCod=%2, &Segundos=%3, Maquinas=%4, Fases:%5, &Hrs:%6, Plc:%7, &FueraRango=%8, %9...", ""), AV17EmprCod, AV9ContCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Segundos), 6, 0), AV99LineaMaqCod.toJSonString(false), AV100LineaFasCod.toJSonString(false), AV101LineaHdr.toJSonString(false), AV102LineaParFasCod.toJSonString(false), GXutil.booltostr( AV20FueraRango), GXutil.format( httpContext.getMessage( " &Desde=%1, &Hasta=%2, &UsurCod=%3, &Ip=%4, &Now=%5, &MTkn=%6", ""), localUtil.ttoc( AV43Desde, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV44Hasta, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV74UsurCod, AV64Ip, localUtil.ttoc( AV45Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV77MTkn, "", "", "")), AV114Pgmname) ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcmrec_analisisdetalle = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcmrec_analisisdetalle_Component), GXutil.lower( "Ingenieria.MRec_AnalisisDetalle")) != 0 )
      {
         WebComp_Wcmrec_analisisdetalle = WebUtils.getWebComponent(getClass(), "app.ingenieria.mrec_analisisdetalle_impl", remoteHandle, context);
         WebComp_Wcmrec_analisisdetalle_Component = "Ingenieria.MRec_AnalisisDetalle" ;
      }
      if ( GXutil.len( WebComp_Wcmrec_analisisdetalle_Component) != 0 )
      {
         WebComp_Wcmrec_analisisdetalle.setjustcreated();
         WebComp_Wcmrec_analisisdetalle.componentprepare(new Object[] {"W0104","",AV17EmprCod,AV9ContCod,Integer.valueOf(AV32Segundos),AV99LineaMaqCod.toJSonString(false),AV100LineaFasCod.toJSonString(false),AV101LineaHdr.toJSonString(false),AV102LineaParFasCod.toJSonString(false),Boolean.valueOf(AV20FueraRango),AV43Desde,AV44Hasta,AV74UsurCod,AV64Ip,AV45Now,AV77MTkn});
         WebComp_Wcmrec_analisisdetalle.componentbind(new Object[] {"","","vSEGUNDOS",""+"",""+"",""+"",""+"","vFUERARANGO","","","","","",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcmrec_analisisdetalle )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0104"+"");
         WebComp_Wcmrec_analisisdetalle.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      divTabledetalle_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, divTabledetalle_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabledetalle_Visible), 5, 0), true);
      this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABS1Container", "SelectTab", "", new Object[] {Integer.valueOf(2)});
      new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV83Titulo, 90, true, (byte)(1)) ;
      new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV83Titulo, 100, false, (byte)(1)) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV99LineaMaqCod", AV99LineaMaqCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV100LineaFasCod", AV100LineaFasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV101LineaHdr", AV101LineaHdr);
   }

   public void S152( )
   {
      /* 'ACTUALIZAR PANTALLA' Routine */
      returnInSub = false ;
      if ( ! ( AV60Hdr.size() > 0 ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Pendiente seleccionar Hojas de Ruta -Hdr-", ""), "", "", "", "", "", "", "", "", ""));
         GX_FocusControl = Combo_hdr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( ! ( AV26MaqCod.size() > 0 ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Pendiente seleccionar Maquinas", ""), "", "", "", "", "", "", "", "", ""));
         GX_FocusControl = Combo_maqcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( ! ( AV18FasCod.size() > 0 ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Pendiente seleccionar Fases", ""), "", "", "", "", "", "", "", "", ""));
         GX_FocusControl = Combo_fascod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( ( AV32Segundos == 999999 ) && AV48HastaFechaHora.before( AV47DesdeFechaHora ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Pendiente Verificar el rango de fechas", ""), "", "", "", "", "", "", "", "", ""));
         GX_FocusControl = edtavDesdefechahora_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         AV83Titulo = AV65memo ;
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV83Titulo, 15, true, (byte)(1)) ;
         AV45Now = GXutil.serverNowMs( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Now", localUtil.ttoc( AV45Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         if ( AV32Segundos == 999999 )
         {
            AV43Desde = AV47DesdeFechaHora ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43Desde", localUtil.ttoc( AV43Desde, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV44Hasta = AV48HastaFechaHora ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44Hasta", localUtil.ttoc( AV44Hasta, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV46SegundosMenos = (int)(AV32Segundos*-1) ;
            AV43Desde = GXutil.dtadd( AV45Now, AV46SegundosMenos) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43Desde", localUtil.ttoc( AV43Desde, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV44Hasta = GXutil.dtadd( AV45Now, 3600*(-1)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44Hasta", localUtil.ttoc( AV44Hasta, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( AV60Hdr.size() > 0 )
         {
            AV65memo = GXutil.format( httpContext.getMessage( "Actualizando con los filtros: Intervalo:%1-%2, Hdrs=%3, Maquinas=%4, Fases=%5, Parametros=%6, Con errores=%7.", ""), localUtil.ttoc( AV43Desde, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV44Hasta, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV60Hdr.toJSonString(false), AV26MaqCod.toJSonString(false), AV18FasCod.toJSonString(false), AV30ParFasCod.toJSonString(false), GXutil.booltostr( AV20FueraRango), "", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65memo", AV65memo);
         }
         else
         {
            AV65memo = GXutil.format( httpContext.getMessage( "Actualizando con los filtros: Intervalo:%1-%2.", ""), localUtil.ttoc( AV43Desde, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV44Hasta, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65memo", AV65memo);
         }
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(AV65memo, AV114Pgmname) ;
         lblFiltroseleccionados_Caption = GXutil.format( "%2%1", AV65memo, httpContext.getMessage( "<i class='fa fa-search h4' style='color:#333333; '></i>", ""), "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblFiltroseleccionados_Internalname, "Caption", lblFiltroseleccionados_Caption, true);
         AV63inFilSDT.setgxTv_SdtInFilSDT_Infilusu( AV74UsurCod );
         AV63inFilSDT.setgxTv_SdtInFilSDT_Infilip( AV64Ip );
         AV63inFilSDT.setgxTv_SdtInFilSDT_Infilobj( AV114Pgmname );
         AV63inFilSDT.setgxTv_SdtInFilSDT_Infilfreg( AV45Now );
         AV63inFilSDT.setgxTv_SdtInFilSDT_Infilfini( AV43Desde );
         AV63inFilSDT.setgxTv_SdtInFilSDT_Infilffin( AV44Hasta );
         AV63inFilSDT.setgxTv_SdtInFilSDT_Infilmaq( AV26MaqCod.toJSonString(false) );
         AV63inFilSDT.setgxTv_SdtInFilSDT_Infilfase( AV18FasCod.toJSonString(false) );
         AV63inFilSDT.setgxTv_SdtInFilSDT_Infilhdr( AV60Hdr.toJSonString(false) );
         AV63inFilSDT.setgxTv_SdtInFilSDT_Infilpar( AV30ParFasCod.toJSonString(false) );
         AV63inFilSDT.setgxTv_SdtInFilSDT_Infilerr( AV20FueraRango );
         AV63inFilSDT.setgxTv_SdtInFilSDT_Infilemp( AV17EmprCod );
         AV63inFilSDT.setgxTv_SdtInFilSDT_Infiltkn( " " );
         GXt_boolean8 = AV58ExisteFiltro ;
         GXv_int12[0] = AV62InFilId ;
         GXv_char10[0] = AV76InFilTkn ;
         GXv_boolean11[0] = GXt_boolean8 ;
         new app.ingenieria.crearfiltro(remoteHandle, context).execute( AV63inFilSDT, GXv_int12, GXv_char10, GXv_boolean11) ;
         mrec_analisis_impl.this.AV62InFilId = GXv_int12[0] ;
         mrec_analisis_impl.this.AV76InFilTkn = GXv_char10[0] ;
         mrec_analisis_impl.this.GXt_boolean8 = GXv_boolean11[0] ;
         AV58ExisteFiltro = GXt_boolean8 ;
         AV77MTkn = AV76InFilTkn ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77MTkn", AV77MTkn);
         AV63inFilSDT.setgxTv_SdtInFilSDT_Infiltkn( AV76InFilTkn );
         AV63inFilSDT.setgxTv_SdtInFilSDT_Infilid( AV62InFilId );
         AV81MRasTxt = GXutil.format( "Inicia  Analisis 01. Token:%1, Id:%2, Filtro:%3", AV77MTkn, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62InFilId), 10, 0), AV63inFilSDT.toJSonString(false, true), "", "", "", "", "", "") ;
         new app.ingenieria.crearrastro(remoteHandle, context).execute( AV74UsurCod, AV64Ip, AV82Version, AV114Pgmname, AV81MRasTxt) ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "llama a MRec_AnalisisDP con: &EmprCod=%1, &Desde=%2, &Hasta=%3, &MaqCod=%4, &FasCod=%5, &Hdr=%6, &ParFasCod=%7, %8.", ""), AV17EmprCod, localUtil.ttoc( AV43Desde, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV44Hasta, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV26MaqCod.toJSonString(false), AV18FasCod.toJSonString(false), AV60Hdr.toJSonString(false), AV30ParFasCod.toJSonString(false), GXutil.format( httpContext.getMessage( "&FueraRango=%1, &UsurCod=%2, &Ip=%3, &Now=%4, &InFilTkn=%5", ""), GXutil.booltostr( AV20FueraRango), AV74UsurCod, AV64Ip, localUtil.ttoc( AV45Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV77MTkn, "", "", "", ""), ""), AV114Pgmname) ;
         AV83Titulo = AV65memo ;
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV83Titulo, 25, true, (byte)(1)) ;
         GXt_objcol_SdtMRec_AnalisisSDT13 = AV12Datos ;
         GXv_objcol_SdtMRec_AnalisisSDT14[0] = GXt_objcol_SdtMRec_AnalisisSDT13 ;
         new app.ingenieria.mrec_analisisdp(remoteHandle, context).execute( AV17EmprCod, AV43Desde, AV44Hasta, AV26MaqCod, AV18FasCod, AV60Hdr, AV30ParFasCod, AV20FueraRango, AV74UsurCod, AV64Ip, AV45Now, AV77MTkn, (byte)(1), GXv_objcol_SdtMRec_AnalisisSDT14) ;
         GXt_objcol_SdtMRec_AnalisisSDT13 = GXv_objcol_SdtMRec_AnalisisSDT14[0] ;
         AV12Datos = GXt_objcol_SdtMRec_AnalisisSDT13 ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Trae Datos MRec_AnalisisDP:%1", ""), AV12Datos.toJSonString(false), "", "", "", "", "", "", "", ""), AV114Pgmname) ;
         AV81MRasTxt = GXutil.format( "Trae    Analisis 02. MRec_AnalisisDP:%1", AV12Datos.toJSonString(false), "", "", "", "", "", "", "", "") ;
         new app.ingenieria.crearrastro(remoteHandle, context).execute( AV74UsurCod, AV64Ip, AV82Version, AV114Pgmname, AV81MRasTxt) ;
         GXt_objcol_SdtMRec_DatoColumnaExisteSDT15 = AV56Dato_Existe ;
         GXv_objcol_SdtMRec_DatoColumnaExisteSDT16[0] = GXt_objcol_SdtMRec_DatoColumnaExisteSDT15 ;
         new app.ingenieria.validadatacolumnas(remoteHandle, context).execute( AV12Datos, GXv_objcol_SdtMRec_DatoColumnaExisteSDT16) ;
         GXt_objcol_SdtMRec_DatoColumnaExisteSDT15 = GXv_objcol_SdtMRec_DatoColumnaExisteSDT16[0] ;
         AV56Dato_Existe = GXt_objcol_SdtMRec_DatoColumnaExisteSDT15 ;
         AV81MRasTxt = GXutil.format( "Trae    Analisis 03. Datos en las columnas:%1", AV56Dato_Existe.toJSonString(false), "", "", "", "", "", "", "", "") ;
         new app.ingenieria.crearrastro(remoteHandle, context).execute( AV74UsurCod, AV64Ip, AV82Version, AV114Pgmname, AV81MRasTxt) ;
         AV83Titulo = AV65memo ;
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV83Titulo, 40, true, (byte)(1)) ;
         AV71PlcElements.clear();
         AV70PlcElement = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
         AV70PlcElement.setgxTv_SdtQueryViewerElements_Element_Name( "MPRecFec" );
         AV70PlcElement.setgxTv_SdtQueryViewerElements_Element_Title( httpContext.getMessage( "Registro", "") );
         AV70PlcElement.setgxTv_SdtQueryViewerElements_Element_Type( "Axis" );
         AV70PlcElement.setgxTv_SdtQueryViewerElements_Element_Axis( "Rows" );
         AV70PlcElement.setgxTv_SdtQueryViewerElements_Element_Visible( "Yes" );
         AV70PlcElement.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
         AV70PlcElement.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Picture( httpContext.getMessage( "YYYY-MM-DD HH24:MI", "") );
         AV71PlcElements.add(AV70PlcElement, 0);
         GXt_boolean8 = AV59existeRegistro ;
         GXv_objcol_SdtMRParProSDT17[0] = AV106MRParProSDTCollection ;
         GXv_boolean11[0] = GXt_boolean8 ;
         new app.ingenieria.mrparprobulk(remoteHandle, context).execute( AV74UsurCod, AV64Ip, AV45Now, AV77MTkn, GXv_objcol_SdtMRParProSDT17, GXv_boolean11) ;
         AV106MRParProSDTCollection = GXv_objcol_SdtMRParProSDT17[0] ;
         mrec_analisis_impl.this.GXt_boolean8 = GXv_boolean11[0] ;
         AV59existeRegistro = GXt_boolean8 ;
         AV80i = (byte)(1) ;
         while ( AV80i <= 79 )
         {
            AV59existeRegistro = false ;
            AV68MRParPrPLC = "" ;
            AV119GXV1 = 1 ;
            while ( AV119GXV1 <= AV106MRParProSDTCollection.size() )
            {
               AV107MRParProSDT = (app.ingenieria.SdtMRParProSDT)((app.ingenieria.SdtMRParProSDT)AV106MRParProSDTCollection.elementAt(-1+AV119GXV1));
               if ( AV107MRParProSDT.getgxTv_SdtMRParProSDT_Mrparprid() == AV80i )
               {
                  new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Parametro valor %1", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80i), 2, 0), AV107MRParProSDT.getgxTv_SdtMRParProSDT_Mrparprdsc(), "", "", "", "", "", "", ""), AV114Pgmname) ;
                  AV68MRParPrPLC = AV107MRParProSDT.getgxTv_SdtMRParProSDT_Mrparprdsc() ;
                  AV59existeRegistro = true ;
               }
               AV119GXV1 = (int)(AV119GXV1+1) ;
            }
            AV70PlcElement = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
            AV70PlcElement.setgxTv_SdtQueryViewerElements_Element_Name( GXutil.format( "MPRecPLC_%1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80i), 2, 0), "", "", "", "", "", "", "", "") );
            AV70PlcElement.setgxTv_SdtQueryViewerElements_Element_Title( (AV59existeRegistro ? AV68MRParPrPLC : " ") );
            AV70PlcElement.setgxTv_SdtQueryViewerElements_Element_Type( "Datum" );
            AV70PlcElement.setgxTv_SdtQueryViewerElements_Element_Visible( ((AV59existeRegistro&&((app.ingenieria.SdtMRec_DatoColumnaExisteSDT)AV56Dato_Existe.elementAt(-1+AV80i)).getgxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste()) ? "Yes" : "No") );
            AV70PlcElement.setgxTv_SdtQueryViewerElements_Element_Axis( "Pages" );
            AV70PlcElement.getgxTv_SdtQueryViewerElements_Element_Format().setgxTv_SdtQueryViewerElements_Element_Format_Subtotals( "Hidden" );
            AV71PlcElements.add(AV70PlcElement, 0);
            AV80i = (byte)(AV80i+1) ;
         }
         AV83Titulo = AV65memo ;
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV83Titulo, 60, true, (byte)(1)) ;
         AV16Elements = AV71PlcElements ;
         divTablegrafica_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, divTablegrafica_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablegrafica_Visible), 5, 0), true);
         divTabledetalle_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divTabledetalle_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabledetalle_Visible), 5, 0), true);
         this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABS1Container", "SelectTab", "", new Object[] {Integer.valueOf(1)});
         Qvprocesoa_Objectcall = "[ \""+"query"+"\", \""+GXutil.encodeJSON( "Ingenieria\\MRec_Datos_QV")+"\", \""+GXutil.encodeJSON( AV17EmprCod)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV43Desde, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV44Hasta, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( AV26MaqCod.toJSonString(false))+"\", \""+GXutil.encodeJSON( AV18FasCod.toJSonString(false))+"\", \""+GXutil.encodeJSON( AV60Hdr.toJSonString(false))+"\", \""+GXutil.encodeJSON( AV30ParFasCod.toJSonString(false))+"\", \""+GXutil.encodeJSON( AV74UsurCod)+"\", \""+GXutil.encodeJSON( AV64Ip)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV45Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\" ]" ;
         ucQvprocesoa.sendProperty(context, "", false, Qvprocesoa_Internalname, "Object", Qvprocesoa_Objectcall);
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Grafica MRec_AnalisisDP con: &EmprCod=%1, &Desde=%2, &Hasta=%3, &MaqCod=%4, &FasCod=%5, &Hdr=%6, &ParFasCod=%7, %8.", ""), AV17EmprCod, localUtil.ttoc( AV43Desde, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV44Hasta, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV26MaqCod.toJSonString(false), AV18FasCod.toJSonString(false), AV60Hdr.toJSonString(false), AV30ParFasCod.toJSonString(false), GXutil.format( httpContext.getMessage( "&FueraRango=%1, &UsurCod=%2, &Ip=%3, &Now=%4, &InFilTkn=%5", ""), GXutil.booltostr( AV20FueraRango), AV74UsurCod, AV64Ip, localUtil.ttoc( AV45Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV77MTkn, "", "", "", ""), ""), AV114Pgmname) ;
         Qvprocesob_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "Ingenieria\\MRec_AnalisisDP")+"\", \""+GXutil.encodeJSON( AV17EmprCod)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV43Desde, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV44Hasta, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( AV26MaqCod.toJSonString(false))+"\", \""+GXutil.encodeJSON( AV18FasCod.toJSonString(false))+"\", \""+GXutil.encodeJSON( AV60Hdr.toJSonString(false))+"\", \""+GXutil.encodeJSON( AV30ParFasCod.toJSonString(false))+"\", \""+GXutil.encodeJSON( GXutil.booltostr( AV20FueraRango))+"\", \""+GXutil.encodeJSON( AV74UsurCod)+"\", \""+GXutil.encodeJSON( AV64Ip)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV45Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( AV77MTkn)+"\", \""+GXutil.encodeJSON( "        2")+"\" ]" ;
         ucQvprocesob.sendProperty(context, "", false, Qvprocesob_Internalname, "Object", Qvprocesob_Objectcall);
         /* Execute user subroutine: 'CARGARV2' */
         S182 ();
         if (returnInSub) return;
         AV83Titulo = AV65memo ;
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV83Titulo, 70, true, (byte)(1)) ;
         new app.anticipacionerrores.barraprogreso(remoteHandle, context).execute( AV83Titulo, 100, false, (byte)(1)) ;
         AV56Dato_Existe.clear();
      }
   }

   public void S162( )
   {
      /* 'INICIARPARARCRONOMETRO' Routine */
      returnInSub = false ;
      if ( AV10CronometroStart )
      {
         lblTbmensajeactualizar_Caption = "" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmensajeactualizar_Internalname, "Caption", lblTbmensajeactualizar_Caption, true);
      }
      else
      {
         lblTbmensajeactualizar_Caption = GXutil.format( httpContext.getMessage( "Filtros cambiados, clic en actualizar %1 para actualizar los datos...", ""), httpContext.getMessage( "<i class='fa fa-search' style='color:gray; '></i>", ""), "", "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmensajeactualizar_Internalname, "Caption", lblTbmensajeactualizar_Caption, true);
         divTablegrafica_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divTablegrafica_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablegrafica_Visible), 5, 0), true);
         divTabledetalle_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divTabledetalle_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabledetalle_Visible), 5, 0), true);
      }
   }

   public void S172( )
   {
      /* 'ORGANIZAR FILTRO' Routine */
      returnInSub = false ;
      AV63inFilSDT.setgxTv_SdtInFilSDT_Infilusu( AV74UsurCod );
      AV63inFilSDT.setgxTv_SdtInFilSDT_Infilip( AV64Ip );
      AV63inFilSDT.setgxTv_SdtInFilSDT_Infilobj( AV114Pgmname );
      AV63inFilSDT.setgxTv_SdtInFilSDT_Infilfreg( AV45Now );
      AV63inFilSDT.setgxTv_SdtInFilSDT_Infilfini( AV47DesdeFechaHora );
      AV63inFilSDT.setgxTv_SdtInFilSDT_Infilffin( AV48HastaFechaHora );
      AV63inFilSDT.setgxTv_SdtInFilSDT_Infilmaq( " " );
      AV63inFilSDT.setgxTv_SdtInFilSDT_Infilfase( " " );
      AV63inFilSDT.setgxTv_SdtInFilSDT_Infilhdr( " " );
      AV63inFilSDT.setgxTv_SdtInFilSDT_Infilpar( " " );
      AV63inFilSDT.setgxTv_SdtInFilSDT_Infilerr( false );
      AV63inFilSDT.setgxTv_SdtInFilSDT_Infilemp( AV17EmprCod );
      AV63inFilSDT.setgxTv_SdtInFilSDT_Infiltkn( " " );
      GXt_boolean8 = AV58ExisteFiltro ;
      GXv_int12[0] = AV62InFilId ;
      GXv_char10[0] = AV76InFilTkn ;
      GXv_boolean11[0] = GXt_boolean8 ;
      new app.ingenieria.crearfiltro(remoteHandle, context).execute( AV63inFilSDT, GXv_int12, GXv_char10, GXv_boolean11) ;
      mrec_analisis_impl.this.AV62InFilId = GXv_int12[0] ;
      mrec_analisis_impl.this.AV76InFilTkn = GXv_char10[0] ;
      mrec_analisis_impl.this.GXt_boolean8 = GXv_boolean11[0] ;
      AV58ExisteFiltro = GXt_boolean8 ;
      AV77MTkn = AV76InFilTkn ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77MTkn", AV77MTkn);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Solicita Intervalo: %1--%2, Now:%3, y crea filtro: %4", ""), localUtil.ttoc( AV47DesdeFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV48HastaFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV45Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV63inFilSDT.toJSonString(false, true), "", "", "", "", ""), AV114Pgmname) ;
   }

   public void S182( )
   {
      /* 'CARGARV2' Routine */
      returnInSub = false ;
      GXt_objcol_SdtMRec_AnalisisLineaSDT18 = AV108MRec_AnalisisLineaSDT ;
      GXv_objcol_SdtMRec_AnalisisLineaSDT19[0] = GXt_objcol_SdtMRec_AnalisisLineaSDT18 ;
      new app.ingenieria.mrec_analisisdp_v2(remoteHandle, context).execute( AV17EmprCod, AV43Desde, AV44Hasta, AV26MaqCod, AV18FasCod, AV60Hdr, AV30ParFasCod, AV20FueraRango, AV74UsurCod, AV64Ip, AV45Now, AV77MTkn, (byte)(1), GXv_objcol_SdtMRec_AnalisisLineaSDT19) ;
      GXt_objcol_SdtMRec_AnalisisLineaSDT18 = GXv_objcol_SdtMRec_AnalisisLineaSDT19[0] ;
      AV108MRec_AnalisisLineaSDT = GXt_objcol_SdtMRec_AnalisisLineaSDT18 ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Grafica MRec_AnalisisDP_v2 con: &MRec_AnalisisLineaSDT=%1.", ""), AV108MRec_AnalisisLineaSDT.toJSonString(false), "", "", "", "", "", "", "", ""), AV114Pgmname) ;
      Qvprocesoc_Datasource = AV108MRec_AnalisisLineaSDT.toJSonString(false) ;
      ucQvprocesoc.sendProperty(context, "", false, Qvprocesoc_Internalname, "DataSource", Qvprocesoc_Datasource);
   }

   protected void nextLoad( )
   {
   }

   protected void e221WE2( )
   {
      /* Load Routine */
      returnInSub = false ;
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
      pa1WE2( ) ;
      ws1WE2( ) ;
      we1WE2( ) ;
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
      httpContext.AddStyleSheetFile("QueryViewer/highcharts/css/highcharts.css", "");
      httpContext.AddStyleSheetFile("QueryViewer/QueryViewer.css", "");
      httpContext.AddStyleSheetFile("QueryViewer/highcharts/css/highcharts.css", "");
      httpContext.AddStyleSheetFile("QueryViewer/QueryViewer.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcmrec_analisisdetalle == null ) )
      {
         if ( GXutil.len( WebComp_Wcmrec_analisisdetalle_Component) != 0 )
         {
            WebComp_Wcmrec_analisisdetalle.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcmrec_analisishdr == null ) )
      {
         if ( GXutil.len( WebComp_Wcmrec_analisishdr_Component) != 0 )
         {
            WebComp_Wcmrec_analisishdr.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116143010", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("ingenieria/mrec_analisis.js", "?202682116143011", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/Ingenieria.GraficaAlertaUCRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavDesdefechahora_Internalname = "vDESDEFECHAHORA" ;
      edtavHastafechahora_Internalname = "vHASTAFECHAHORA" ;
      lblTextblockcombo_hdr_Internalname = "TEXTBLOCKCOMBO_HDR" ;
      Combo_hdr_Internalname = "COMBO_HDR" ;
      divTablesplittedhdr_Internalname = "TABLESPLITTEDHDR" ;
      lblTextblockcombo_maqcod_Internalname = "TEXTBLOCKCOMBO_MAQCOD" ;
      Combo_maqcod_Internalname = "COMBO_MAQCOD" ;
      divTablesplittedmaqcod_Internalname = "TABLESPLITTEDMAQCOD" ;
      lblTextblockcombo_fascod_Internalname = "TEXTBLOCKCOMBO_FASCOD" ;
      Combo_fascod_Internalname = "COMBO_FASCOD" ;
      divTablesplittedfascod_Internalname = "TABLESPLITTEDFASCOD" ;
      lblTextblockcombo_parfascod_Internalname = "TEXTBLOCKCOMBO_PARFASCOD" ;
      Combo_parfascod_Internalname = "COMBO_PARFASCOD" ;
      divTablesplittedparfascod_Internalname = "TABLESPLITTEDPARFASCOD" ;
      chkavFuerarango.setInternalname( "vFUERARANGO" );
      lblActualizar_Internalname = "ACTUALIZAR" ;
      divTablerango_Internalname = "TABLERANGO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      lblTbmensajeactualizar_Internalname = "TBMENSAJEACTUALIZAR" ;
      Barraprogreso_Internalname = "BARRAPROGRESO" ;
      lblFiltroseleccionados_Internalname = "FILTROSELECCIONADOS" ;
      divPanelfiltros_Internalname = "PANELFILTROS" ;
      Dvpanel_panelfiltros_Internalname = "DVPANEL_PANELFILTROS" ;
      lblTab1procesos_title_Internalname = "TAB1PROCESOS_TITLE" ;
      Qvprocesoa_Internalname = "QVPROCESOA" ;
      Qvprocesob_Internalname = "QVPROCESOB" ;
      Qvprocesoc_Internalname = "QVPROCESOC" ;
      divTablegrafica_Internalname = "TABLEGRAFICA" ;
      lblTab1detalle_title_Internalname = "TAB1DETALLE_TITLE" ;
      divTabledetalle_Internalname = "TABLEDETALLE" ;
      lblTab1hdr_title_Internalname = "TAB1HDR_TITLE" ;
      divTablehdr_Internalname = "TABLEHDR" ;
      Gxuitabspanel_tabs1_Internalname = "GXUITABSPANEL_TABS1" ;
      divTabledatos_Internalname = "TABLEDATOS" ;
      lblTextblock_resultado1_Internalname = "TEXTBLOCK_RESULTADO1" ;
      lblImage12_Internalname = "IMAGE12" ;
      divTableresultado1_Internalname = "TABLERESULTADO1" ;
      divPanelsindatos_Internalname = "PANELSINDATOS" ;
      Dvpanel_panelsindatos_Internalname = "DVPANEL_PANELSINDATOS" ;
      divTablenodatos_Internalname = "TABLENODATOS" ;
      Datamon_Internalname = "DATAMON" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavLongvarchar_Internalname = "vLONGVARCHAR" ;
      edtavSegundos_Internalname = "vSEGUNDOS" ;
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
      edtavSegundos_Jsonclick = "" ;
      edtavSegundos_Tooltiptext = "" ;
      edtavSegundos_Visible = 1 ;
      edtavLongvarchar_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divTableresultado1_Height = 0 ;
      divTablenodatos_Visible = 1 ;
      divTabledetalle_Visible = 1 ;
      Qvprocesob_Title = "" ;
      divTablegrafica_Visible = 1 ;
      lblFiltroseleccionados_Caption = "" ;
      lblTbmensajeactualizar_Caption = " " ;
      divTablerango_Visible = 1 ;
      chkavFuerarango.setEnabled( 1 );
      Combo_parfascod_Caption = "" ;
      Combo_fascod_Caption = "" ;
      Combo_maqcod_Caption = "" ;
      Combo_hdr_Caption = "" ;
      edtavHastafechahora_Jsonclick = "" ;
      edtavHastafechahora_Enabled = 1 ;
      edtavDesdefechahora_Jsonclick = "" ;
      edtavDesdefechahora_Enabled = 1 ;
      Qvprocesoc_Clickedseriesname = "" ;
      Qvprocesoc_Clickedtime = "" ;
      Qvprocesoc_Clickedvalue = "" ;
      Dvpanel_panelsindatos_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelsindatos_Iconposition = "Right" ;
      Dvpanel_panelsindatos_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelsindatos_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelsindatos_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelsindatos_Title = "" ;
      Dvpanel_panelsindatos_Cls = "PanelNoHeader" ;
      Dvpanel_panelsindatos_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelsindatos_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelsindatos_Width = "100%" ;
      Gxuitabspanel_tabs1_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs1_Class = "" ;
      Gxuitabspanel_tabs1_Pagecount = 3 ;
      Qvprocesoc_Datasource = "" ;
      Qvprocesob_Charttype = "SmoothTimeline" ;
      Qvprocesob_Type = "Chart" ;
      Qvprocesob_Rememberlayout = GXutil.toBoolean( -1) ;
      Qvprocesob_Allowselection = GXutil.toBoolean( 1) ;
      Qvprocesob_Height = "800px" ;
      Qvprocesob_Objectcall = "" ;
      Qvprocesoa_Type = "Card" ;
      Qvprocesoa_Allowselection = GXutil.toBoolean( 1) ;
      Qvprocesoa_Height = "120px" ;
      Qvprocesoa_Objectcall = "" ;
      Dvpanel_panelfiltros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Iconposition = "Right" ;
      Dvpanel_panelfiltros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelfiltros_Title = httpContext.getMessage( "Filtros", "") ;
      Dvpanel_panelfiltros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelfiltros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelfiltros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Width = "100%" ;
      Combo_parfascod_Multiplevaluestype = "Tags" ;
      Combo_parfascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_parfascod_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_parfascod_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_parfascod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_fascod_Multiplevaluestype = "Tags" ;
      Combo_fascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_fascod_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_fascod_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_fascod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_maqcod_Emptyitemtext = "" ;
      Combo_maqcod_Multiplevaluestype = "Tags" ;
      Combo_maqcod_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_maqcod_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_maqcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_hdr_Multiplevaluestype = "Tags" ;
      Combo_hdr_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_hdr_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_hdr_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_hdr_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Análisis", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavFuerarango.setName( "vFUERARANGO" );
      chkavFuerarango.setWebtags( "" );
      chkavFuerarango.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavFuerarango.getInternalname(), "TitleCaption", chkavFuerarango.getCaption(), true);
      chkavFuerarango.setCheckedValue( "false" );
      AV20FueraRango = GXutil.strtobool( GXutil.booltostr( AV20FueraRango)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20FueraRango", AV20FueraRango);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV20FueraRango',fld:'vFUERARANGO',pic:''},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV74UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV82Version',fld:'vVERSION',pic:'',hsh:true},{av:'AV9ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV110PosicionFinal',fld:'vPOSICIONFINAL',pic:'ZZZ9',hsh:true},{av:'AV114Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOACTUALIZAR'","{handler:'e181WE2',iparms:[{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV43Desde',fld:'vDESDE',pic:'99/99/99 99:99'},{av:'AV44Hasta',fld:'vHASTA',pic:'99/99/99 99:99'},{av:'AV26MaqCod',fld:'vMAQCOD',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'AV60Hdr',fld:'vHDR',pic:''},{av:'AV30ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV20FueraRango',fld:'vFUERARANGO',pic:''},{av:'AV114Pgmname',fld:'vPGMNAME',pic:''},{av:'AV32Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'AV48HastaFechaHora',fld:'vHASTAFECHAHORA',pic:'99/99/99 99:99'},{av:'AV47DesdeFechaHora',fld:'vDESDEFECHAHORA',pic:'99/99/99 99:99'},{av:'AV65memo',fld:'vMEMO',pic:''},{av:'AV74UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV63inFilSDT',fld:'vINFILSDT',pic:''},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV82Version',fld:'vVERSION',pic:'',hsh:true},{av:'AV10CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV45Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV77MTkn',fld:'vMTKN',pic:''}]");
      setEventMetadata("'DOACTUALIZAR'",",oparms:[{av:'AV10CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV45Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV43Desde',fld:'vDESDE',pic:'99/99/99 99:99'},{av:'AV44Hasta',fld:'vHASTA',pic:'99/99/99 99:99'},{av:'AV65memo',fld:'vMEMO',pic:''},{av:'lblFiltroseleccionados_Caption',ctrl:'FILTROSELECCIONADOS',prop:'Caption'},{av:'AV63inFilSDT',fld:'vINFILSDT',pic:''},{av:'AV77MTkn',fld:'vMTKN',pic:''},{av:'AV16Elements',fld:'vELEMENTS',pic:''},{av:'divTablegrafica_Visible',ctrl:'TABLEGRAFICA',prop:'Visible'},{av:'divTabledetalle_Visible',ctrl:'TABLEDETALLE',prop:'Visible'},{ctrl:'QVPROCESOA'},{ctrl:'QVPROCESOB'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'},{av:'Qvprocesoc_Datasource',ctrl:'QVPROCESOC',prop:'DataSource'}]}");
      setEventMetadata("COMBO_FASCOD.ONOPTIONCLICKED","{handler:'e131WE2',iparms:[{av:'Combo_fascod_Selectedvalue_get',ctrl:'COMBO_FASCOD',prop:'SelectedValue_get'},{av:'AV10CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV60Hdr',fld:'vHDR',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'AV26MaqCod',fld:'vMAQCOD',pic:''},{av:'AV114Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14697MEPrHdr',fld:'MEPRHDR',pic:''},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'AV74UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'AV45Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'AV77MTkn',fld:'vMTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A14695MEPrParCod',fld:'MEPRPARCOD',pic:'ZZZ9'},{av:'A14696MEPrParDsc',fld:'MEPRPARDSC',pic:''},{av:'AV30ParFasCod',fld:'vPARFASCOD',pic:''}]");
      setEventMetadata("COMBO_FASCOD.ONOPTIONCLICKED",",oparms:[{av:'AV10CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'AV30ParFasCod',fld:'vPARFASCOD',pic:''},{av:'divTablegrafica_Visible',ctrl:'TABLEGRAFICA',prop:'Visible'},{av:'divTabledetalle_Visible',ctrl:'TABLEDETALLE',prop:'Visible'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'},{av:'AV31ParFasCod_Data',fld:'vPARFASCOD_DATA',pic:''},{av:'Combo_parfascod_Selectedvalue_set',ctrl:'COMBO_PARFASCOD',prop:'SelectedValue_set'}]}");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED","{handler:'e121WE2',iparms:[{av:'Combo_maqcod_Selectedvalue_get',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_get'},{av:'AV10CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV26MaqCod',fld:'vMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14697MEPrHdr',fld:'MEPRHDR',pic:''},{av:'AV60Hdr',fld:'vHDR',pic:''},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'AV74UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'AV45Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'AV77MTkn',fld:'vMTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'AV114Pgmname',fld:'vPGMNAME',pic:''},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14692MEPrFasDsc',fld:'MEPRFASDSC',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''}]");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED",",oparms:[{av:'AV10CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV26MaqCod',fld:'vMAQCOD',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'AV30ParFasCod',fld:'vPARFASCOD',pic:''},{av:'divTablegrafica_Visible',ctrl:'TABLEGRAFICA',prop:'Visible'},{av:'divTabledetalle_Visible',ctrl:'TABLEDETALLE',prop:'Visible'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'},{av:'AV19FasCod_Data',fld:'vFASCOD_DATA',pic:''},{av:'Combo_fascod_Selectedvalue_set',ctrl:'COMBO_FASCOD',prop:'SelectedValue_set'}]}");
      setEventMetadata("COMBO_HDR.ONOPTIONCLICKED","{handler:'e111WE2',iparms:[{av:'Combo_hdr_Selectedvalue_get',ctrl:'COMBO_HDR',prop:'SelectedValue_get'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A14697MEPrHdr',fld:'MEPRHDR',pic:''},{av:'AV60Hdr',fld:'vHDR',pic:''},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'AV74UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'AV45Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'AV77MTkn',fld:'vMTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'AV114Pgmname',fld:'vPGMNAME',pic:''},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14694MEPrMaqDsc',fld:'MEPRMAQDSC',pic:''},{av:'AV26MaqCod',fld:'vMAQCOD',pic:''}]");
      setEventMetadata("COMBO_HDR.ONOPTIONCLICKED",",oparms:[{av:'AV60Hdr',fld:'vHDR',pic:''},{av:'AV26MaqCod',fld:'vMAQCOD',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'AV30ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV27MaqCod_Data',fld:'vMAQCOD_DATA',pic:''},{av:'Combo_maqcod_Selectedvalue_set',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_set'}]}");
      setEventMetadata("VSEGUNDOS.CONTROLVALUECHANGED","{handler:'e191WE2',iparms:[{av:'AV32Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'AV10CronometroStart',fld:'vCRONOMETROSTART',pic:''}]");
      setEventMetadata("VSEGUNDOS.CONTROLVALUECHANGED",",oparms:[{av:'divTablerango_Visible',ctrl:'TABLERANGO',prop:'Visible'},{av:'AV47DesdeFechaHora',fld:'vDESDEFECHAHORA',pic:'99/99/99 99:99'},{av:'AV48HastaFechaHora',fld:'vHASTAFECHAHORA',pic:'99/99/99 99:99'},{av:'AV10CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'divTablegrafica_Visible',ctrl:'TABLEGRAFICA',prop:'Visible'},{av:'divTabledetalle_Visible',ctrl:'TABLEDETALLE',prop:'Visible'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'}]}");
      setEventMetadata("VDESDEFECHAHORA.CONTROLVALUECHANGED","{handler:'e201WE2',iparms:[{av:'AV74UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV63inFilSDT',fld:'vINFILSDT',pic:''},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV114Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV47DesdeFechaHora',fld:'vDESDEFECHAHORA',pic:'99/99/99 99:99'},{av:'AV48HastaFechaHora',fld:'vHASTAFECHAHORA',pic:'99/99/99 99:99'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'AV26MaqCod',fld:'vMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'AV77MTkn',fld:'vMTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV60Hdr',fld:'vHDR',pic:''}]");
      setEventMetadata("VDESDEFECHAHORA.CONTROLVALUECHANGED",",oparms:[{av:'AV60Hdr',fld:'vHDR',pic:''},{av:'AV26MaqCod',fld:'vMAQCOD',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'AV30ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV63inFilSDT',fld:'vINFILSDT',pic:''},{av:'AV77MTkn',fld:'vMTKN',pic:''},{av:'AV61Hdr_Data',fld:'vHDR_DATA',pic:''},{av:'Combo_hdr_Selectedvalue_set',ctrl:'COMBO_HDR',prop:'SelectedValue_set'}]}");
      setEventMetadata("VHASTAFECHAHORA.CONTROLVALUECHANGED","{handler:'e211WE2',iparms:[{av:'AV74UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV63inFilSDT',fld:'vINFILSDT',pic:''},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV114Pgmname',fld:'vPGMNAME',pic:''},{av:'AV45Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV47DesdeFechaHora',fld:'vDESDEFECHAHORA',pic:'99/99/99 99:99'},{av:'AV48HastaFechaHora',fld:'vHASTAFECHAHORA',pic:'99/99/99 99:99'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'AV26MaqCod',fld:'vMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'AV77MTkn',fld:'vMTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV60Hdr',fld:'vHDR',pic:''}]");
      setEventMetadata("VHASTAFECHAHORA.CONTROLVALUECHANGED",",oparms:[{av:'AV60Hdr',fld:'vHDR',pic:''},{av:'AV26MaqCod',fld:'vMAQCOD',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'AV30ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV63inFilSDT',fld:'vINFILSDT',pic:''},{av:'AV77MTkn',fld:'vMTKN',pic:''},{av:'AV61Hdr_Data',fld:'vHDR_DATA',pic:''},{av:'Combo_hdr_Selectedvalue_set',ctrl:'COMBO_HDR',prop:'SelectedValue_set'}]}");
      setEventMetadata("QVPROCESOA.ITEMCLICK","{handler:'e141WE2',iparms:[{av:'AV101LineaHdr',fld:'vLINEAHDR',pic:''},{av:'AV100LineaFasCod',fld:'vLINEAFASCOD',pic:''},{av:'AV99LineaMaqCod',fld:'vLINEAMAQCOD',pic:''},{av:'AV43Desde',fld:'vDESDE',pic:'99/99/99 99:99'},{av:'AV44Hasta',fld:'vHASTA',pic:'99/99/99 99:99'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV26MaqCod',fld:'vMAQCOD',pic:''},{av:'AV18FasCod',fld:'vFASCOD',pic:''},{av:'AV60Hdr',fld:'vHDR',pic:''},{av:'AV74UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV45Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV77MTkn',fld:'vMTKN',pic:''}]");
      setEventMetadata("QVPROCESOA.ITEMCLICK",",oparms:[{ctrl:'WCMREC_ANALISISHDR'}]}");
      setEventMetadata("QVPROCESOB.ITEMCLICK","{handler:'e151WE2',iparms:[{av:'AV21ItemClickData',fld:'vITEMCLICKDATA',pic:''},{av:'AV74UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV45Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV77MTkn',fld:'vMTKN',pic:''},{av:'AV43Desde',fld:'vDESDE',pic:'99/99/99 99:99'},{av:'AV44Hasta',fld:'vHASTA',pic:'99/99/99 99:99'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV32Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'AV20FueraRango',fld:'vFUERARANGO',pic:''},{av:'AV114Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("QVPROCESOB.ITEMCLICK",",oparms:[{av:'AV99LineaMaqCod',fld:'vLINEAMAQCOD',pic:''},{av:'AV100LineaFasCod',fld:'vLINEAFASCOD',pic:''},{av:'AV101LineaHdr',fld:'vLINEAHDR',pic:''},{ctrl:'WCMREC_ANALISISDETALLE'},{av:'divTabledetalle_Visible',ctrl:'TABLEDETALLE',prop:'Visible'}]}");
      setEventMetadata("QVPROCESOC.ITEMCLICK","{handler:'e161WE2',iparms:[{av:'Qvprocesoc_Clickedvalue',ctrl:'QVPROCESOC',prop:'ClickedValue'},{av:'Qvprocesoc_Clickedtime',ctrl:'QVPROCESOC',prop:'ClickedTime'},{av:'Qvprocesoc_Clickedseriesname',ctrl:'QVPROCESOC',prop:'ClickedSeriesName'},{av:'AV114Pgmname',fld:'vPGMNAME',pic:''},{av:'AV110PosicionFinal',fld:'vPOSICIONFINAL',pic:'ZZZ9',hsh:true},{av:'AV74UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV45Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV77MTkn',fld:'vMTKN',pic:''},{av:'AV43Desde',fld:'vDESDE',pic:'99/99/99 99:99'},{av:'AV44Hasta',fld:'vHASTA',pic:'99/99/99 99:99'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV32Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'AV20FueraRango',fld:'vFUERARANGO',pic:''}]");
      setEventMetadata("QVPROCESOC.ITEMCLICK",",oparms:[{av:'AV99LineaMaqCod',fld:'vLINEAMAQCOD',pic:''},{av:'AV100LineaFasCod',fld:'vLINEAFASCOD',pic:''},{av:'AV101LineaHdr',fld:'vLINEAHDR',pic:''},{ctrl:'WCMREC_ANALISISDETALLE'},{av:'divTabledetalle_Visible',ctrl:'TABLEDETALLE',prop:'Visible'}]}");
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
      Combo_parfascod_Selectedvalue_get = "" ;
      Combo_fascod_Selectedvalue_get = "" ;
      Combo_maqcod_Selectedvalue_get = "" ;
      Combo_hdr_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV17EmprCod = "" ;
      AV74UsurCod = "" ;
      AV64Ip = "" ;
      AV82Version = "" ;
      AV9ContCod = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV114Pgmname = "" ;
      AV13DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV61Hdr_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV27MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV19FasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV31ParFasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV16Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV29Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV21ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV23ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV14DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV39FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV24ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV22ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      AV43Desde = GXutil.resetTime( GXutil.nullDate() );
      AV44Hasta = GXutil.resetTime( GXutil.nullDate() );
      AV26MaqCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18FasCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV60Hdr = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30ParFasCod = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV65memo = "" ;
      AV63inFilSDT = new app.ingenieria.SdtInFilSDT(remoteHandle, context);
      AV45Now = GXutil.resetTime( GXutil.nullDate() );
      AV77MTkn = "" ;
      A396EmprCod = "" ;
      A14693MEPrMaqCod = "" ;
      A14691MEPrFasCod = "" ;
      A14697MEPrHdr = "" ;
      A14698MEPrUsu = "" ;
      A14699MEPrIp = "" ;
      A14700MEPrReg = GXutil.resetTime( GXutil.nullDate() );
      A14701MEPrTkn = "" ;
      A14702MEPrObj = "" ;
      A14696MEPrParDsc = "" ;
      A14692MEPrFasDsc = "" ;
      A14694MEPrMaqDsc = "" ;
      A130BarCodPar = "" ;
      AV101LineaHdr = new GXSimpleCollection<String>(String.class, "internal", "");
      AV100LineaFasCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV99LineaMaqCod = new GXSimpleCollection<String>(String.class, "internal", "");
      Combo_hdr_Selectedvalue_set = "" ;
      Combo_maqcod_Selectedvalue_set = "" ;
      Combo_fascod_Selectedvalue_set = "" ;
      Combo_parfascod_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panelfiltros = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV47DesdeFechaHora = GXutil.resetTime( GXutil.nullDate() );
      AV48HastaFechaHora = GXutil.resetTime( GXutil.nullDate() );
      lblTextblockcombo_hdr_Jsonclick = "" ;
      ucCombo_hdr = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_maqcod_Jsonclick = "" ;
      ucCombo_maqcod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_fascod_Jsonclick = "" ;
      ucCombo_fascod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_parfascod_Jsonclick = "" ;
      ucCombo_parfascod = new com.genexus.webpanels.GXUserControl();
      lblActualizar_Jsonclick = "" ;
      lblTbmensajeactualizar_Jsonclick = "" ;
      ucBarraprogreso = new com.genexus.webpanels.GXUserControl();
      lblFiltroseleccionados_Jsonclick = "" ;
      ucGxuitabspanel_tabs1 = new com.genexus.webpanels.GXUserControl();
      lblTab1procesos_title_Jsonclick = "" ;
      ucQvprocesoa = new com.genexus.webpanels.GXUserControl();
      Qvprocesoa_Title = "" ;
      ucQvprocesob = new com.genexus.webpanels.GXUserControl();
      ucQvprocesoc = new com.genexus.webpanels.GXUserControl();
      lblTab1detalle_title_Jsonclick = "" ;
      WebComp_Wcmrec_analisisdetalle_Component = "" ;
      OldWcmrec_analisisdetalle = "" ;
      lblTab1hdr_title_Jsonclick = "" ;
      WebComp_Wcmrec_analisishdr_Component = "" ;
      OldWcmrec_analisishdr = "" ;
      ucDvpanel_panelsindatos = new com.genexus.webpanels.GXUserControl();
      lblTextblock_resultado1_Jsonclick = "" ;
      lblImage12_Jsonclick = "" ;
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      AV25Longvarchar = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV75WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext3 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV84ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV78Station = "" ;
      GXt_char1 = "" ;
      AV79EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      scmdbuf = "" ;
      H01WE2_A14702MEPrObj = new String[] {""} ;
      H01WE2_A14701MEPrTkn = new String[] {""} ;
      H01WE2_A14700MEPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      H01WE2_A14699MEPrIp = new String[] {""} ;
      H01WE2_A14698MEPrUsu = new String[] {""} ;
      H01WE2_A14697MEPrHdr = new String[] {""} ;
      H01WE2_A14691MEPrFasCod = new String[] {""} ;
      H01WE2_A14693MEPrMaqCod = new String[] {""} ;
      H01WE2_A396EmprCod = new String[] {""} ;
      H01WE2_A14696MEPrParDsc = new String[] {""} ;
      H01WE2_A14695MEPrParCod = new short[1] ;
      AV8Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01WE3_A14702MEPrObj = new String[] {""} ;
      H01WE3_A14701MEPrTkn = new String[] {""} ;
      H01WE3_A14700MEPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      H01WE3_A14699MEPrIp = new String[] {""} ;
      H01WE3_A14698MEPrUsu = new String[] {""} ;
      H01WE3_A14697MEPrHdr = new String[] {""} ;
      H01WE3_A14693MEPrMaqCod = new String[] {""} ;
      H01WE3_A396EmprCod = new String[] {""} ;
      H01WE3_A14692MEPrFasDsc = new String[] {""} ;
      H01WE3_A14691MEPrFasCod = new String[] {""} ;
      H01WE4_A14702MEPrObj = new String[] {""} ;
      H01WE4_A14701MEPrTkn = new String[] {""} ;
      H01WE4_A14700MEPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      H01WE4_A14699MEPrIp = new String[] {""} ;
      H01WE4_A14698MEPrUsu = new String[] {""} ;
      H01WE4_A14697MEPrHdr = new String[] {""} ;
      H01WE4_A396EmprCod = new String[] {""} ;
      H01WE4_A14694MEPrMaqDsc = new String[] {""} ;
      H01WE4_A14693MEPrMaqCod = new String[] {""} ;
      H01WE5_A14702MEPrObj = new String[] {""} ;
      H01WE5_A14701MEPrTkn = new String[] {""} ;
      H01WE5_A14700MEPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      H01WE5_A14699MEPrIp = new String[] {""} ;
      H01WE5_A14698MEPrUsu = new String[] {""} ;
      H01WE5_A396EmprCod = new String[] {""} ;
      H01WE5_A130BarCodPar = new String[] {""} ;
      H01WE5_A132BarCodReo = new byte[1] ;
      H01WE5_A129BarCod = new int[1] ;
      AV83Titulo = "" ;
      AV85DataPosicion = new GXBaseCollection<app.SdtQueryViewerItemClickData_Element>(app.SdtQueryViewerItemClickData_Element.class, "QueryViewerItemClickData.Element", "TexplusNET", remoteHandle);
      AV92EncontradoNombrePlc = "" ;
      AV95NumeroNombrePlc = "" ;
      AV98MRParPrHdr = "" ;
      AV104MRParPrMaqCod = "" ;
      AV103MRParPrFasCod = "" ;
      AV68MRParPrPLC = "" ;
      AV102LineaParFasCod = new GXSimpleCollection<Short>(Short.class, "internal", "");
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_char2 = new String[1] ;
      AV76InFilTkn = "" ;
      AV81MRasTxt = "" ;
      AV12Datos = new GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT>(app.ingenieria.SdtMRec_AnalisisSDT.class, "MRec_AnalisisSDT", "TexplusNET", remoteHandle);
      GXt_objcol_SdtMRec_AnalisisSDT13 = new GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT>(app.ingenieria.SdtMRec_AnalisisSDT.class, "MRec_AnalisisSDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtMRec_AnalisisSDT14 = new GXBaseCollection[1] ;
      AV56Dato_Existe = new GXBaseCollection<app.ingenieria.SdtMRec_DatoColumnaExisteSDT>(app.ingenieria.SdtMRec_DatoColumnaExisteSDT.class, "MRec_DatoColumnaExisteSDT", "TexplusNET", remoteHandle);
      GXt_objcol_SdtMRec_DatoColumnaExisteSDT15 = new GXBaseCollection<app.ingenieria.SdtMRec_DatoColumnaExisteSDT>(app.ingenieria.SdtMRec_DatoColumnaExisteSDT.class, "MRec_DatoColumnaExisteSDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtMRec_DatoColumnaExisteSDT16 = new GXBaseCollection[1] ;
      AV71PlcElements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV70PlcElement = new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV106MRParProSDTCollection = new GXBaseCollection<app.ingenieria.SdtMRParProSDT>(app.ingenieria.SdtMRParProSDT.class, "MRParProSDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtMRParProSDT17 = new GXBaseCollection[1] ;
      AV107MRParProSDT = new app.ingenieria.SdtMRParProSDT(remoteHandle, context);
      GXv_int12 = new long[1] ;
      GXv_char10 = new String[1] ;
      GXv_boolean11 = new boolean[1] ;
      AV108MRec_AnalisisLineaSDT = new GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT>(app.ingenieria.SdtMRec_AnalisisLineaSDT.class, "MRec_AnalisisLineaSDT", "TexplusNET", remoteHandle);
      GXt_objcol_SdtMRec_AnalisisLineaSDT18 = new GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT>(app.ingenieria.SdtMRec_AnalisisLineaSDT.class, "MRec_AnalisisLineaSDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtMRec_AnalisisLineaSDT19 = new GXBaseCollection[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_analisis__default(),
         new Object[] {
             new Object[] {
            H01WE2_A14702MEPrObj, H01WE2_A14701MEPrTkn, H01WE2_A14700MEPrReg, H01WE2_A14699MEPrIp, H01WE2_A14698MEPrUsu, H01WE2_A14697MEPrHdr, H01WE2_A14691MEPrFasCod, H01WE2_A14693MEPrMaqCod, H01WE2_A396EmprCod, H01WE2_A14696MEPrParDsc,
            H01WE2_A14695MEPrParCod
            }
            , new Object[] {
            H01WE3_A14702MEPrObj, H01WE3_A14701MEPrTkn, H01WE3_A14700MEPrReg, H01WE3_A14699MEPrIp, H01WE3_A14698MEPrUsu, H01WE3_A14697MEPrHdr, H01WE3_A14693MEPrMaqCod, H01WE3_A396EmprCod, H01WE3_A14692MEPrFasDsc, H01WE3_A14691MEPrFasCod
            }
            , new Object[] {
            H01WE4_A14702MEPrObj, H01WE4_A14701MEPrTkn, H01WE4_A14700MEPrReg, H01WE4_A14699MEPrIp, H01WE4_A14698MEPrUsu, H01WE4_A14697MEPrHdr, H01WE4_A396EmprCod, H01WE4_A14694MEPrMaqDsc, H01WE4_A14693MEPrMaqCod
            }
            , new Object[] {
            H01WE5_A14702MEPrObj, H01WE5_A14701MEPrTkn, H01WE5_A14700MEPrReg, H01WE5_A14699MEPrIp, H01WE5_A14698MEPrUsu, H01WE5_A396EmprCod, H01WE5_A130BarCodPar, H01WE5_A132BarCodReo, H01WE5_A129BarCod
            }
         }
      );
      AV114Pgmname = "Ingenieria.MRec_Analisis" ;
      /* GeneXus formulas. */
      AV114Pgmname = "Ingenieria.MRec_Analisis" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wcmrec_analisisdetalle = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcmrec_analisishdr = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte AV80i ;
   private byte nGXWrapped ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV110PosicionFinal ;
   private short A14695MEPrParCod ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV93Posicion ;
   private short AV94Largo ;
   private short AV105MRParPrCod ;
   private short GXv_int9[] ;
   private int A129BarCod ;
   private int Gxuitabspanel_tabs1_Pagecount ;
   private int edtavDesdefechahora_Enabled ;
   private int edtavHastafechahora_Enabled ;
   private int divTablerango_Visible ;
   private int divTablegrafica_Visible ;
   private int divTabledetalle_Visible ;
   private int divTablenodatos_Visible ;
   private int divTableresultado1_Height ;
   private int edtavPgmname_Enabled ;
   private int edtavLongvarchar_Visible ;
   private int AV32Segundos ;
   private int edtavSegundos_Visible ;
   private int AV46SegundosMenos ;
   private int AV119GXV1 ;
   private int idxLst ;
   private long AV111MRParPrId ;
   private long AV62InFilId ;
   private long GXv_int12[] ;
   private String Combo_parfascod_Selectedvalue_get ;
   private String Combo_fascod_Selectedvalue_get ;
   private String Combo_maqcod_Selectedvalue_get ;
   private String Combo_hdr_Selectedvalue_get ;
   private String Qvprocesoc_Clickedvalue ;
   private String Qvprocesoc_Clickedtime ;
   private String Qvprocesoc_Clickedseriesname ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV17EmprCod ;
   private String AV74UsurCod ;
   private String AV82Version ;
   private String AV9ContCod ;
   private String GXKey ;
   private String AV114Pgmname ;
   private String A396EmprCod ;
   private String A14693MEPrMaqCod ;
   private String A14691MEPrFasCod ;
   private String A14697MEPrHdr ;
   private String A14698MEPrUsu ;
   private String A14696MEPrParDsc ;
   private String A14692MEPrFasDsc ;
   private String A14694MEPrMaqDsc ;
   private String A130BarCodPar ;
   private String Combo_hdr_Cls ;
   private String Combo_hdr_Selectedvalue_set ;
   private String Combo_hdr_Multiplevaluestype ;
   private String Combo_maqcod_Cls ;
   private String Combo_maqcod_Selectedvalue_set ;
   private String Combo_maqcod_Multiplevaluestype ;
   private String Combo_maqcod_Emptyitemtext ;
   private String Combo_fascod_Cls ;
   private String Combo_fascod_Selectedvalue_set ;
   private String Combo_fascod_Multiplevaluestype ;
   private String Combo_parfascod_Cls ;
   private String Combo_parfascod_Selectedvalue_set ;
   private String Combo_parfascod_Multiplevaluestype ;
   private String Dvpanel_panelfiltros_Width ;
   private String Dvpanel_panelfiltros_Cls ;
   private String Dvpanel_panelfiltros_Title ;
   private String Dvpanel_panelfiltros_Iconposition ;
   private String Qvprocesoa_Objectcall ;
   private String Qvprocesoa_Height ;
   private String Qvprocesoa_Type ;
   private String Qvprocesob_Objectcall ;
   private String Qvprocesob_Height ;
   private String Qvprocesob_Type ;
   private String Qvprocesob_Charttype ;
   private String Qvprocesoc_Datasource ;
   private String Gxuitabspanel_tabs1_Class ;
   private String Dvpanel_panelsindatos_Width ;
   private String Dvpanel_panelsindatos_Cls ;
   private String Dvpanel_panelsindatos_Title ;
   private String Dvpanel_panelsindatos_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panelfiltros_Internalname ;
   private String divPanelfiltros_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavDesdefechahora_Internalname ;
   private String TempTags ;
   private String edtavDesdefechahora_Jsonclick ;
   private String edtavHastafechahora_Internalname ;
   private String edtavHastafechahora_Jsonclick ;
   private String divTablesplittedhdr_Internalname ;
   private String lblTextblockcombo_hdr_Internalname ;
   private String lblTextblockcombo_hdr_Jsonclick ;
   private String Combo_hdr_Caption ;
   private String Combo_hdr_Internalname ;
   private String divTablesplittedmaqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Jsonclick ;
   private String Combo_maqcod_Caption ;
   private String Combo_maqcod_Internalname ;
   private String divTablesplittedfascod_Internalname ;
   private String lblTextblockcombo_fascod_Internalname ;
   private String lblTextblockcombo_fascod_Jsonclick ;
   private String Combo_fascod_Caption ;
   private String Combo_fascod_Internalname ;
   private String divTablesplittedparfascod_Internalname ;
   private String lblTextblockcombo_parfascod_Internalname ;
   private String lblTextblockcombo_parfascod_Jsonclick ;
   private String Combo_parfascod_Caption ;
   private String Combo_parfascod_Internalname ;
   private String lblActualizar_Internalname ;
   private String lblActualizar_Jsonclick ;
   private String divTablerango_Internalname ;
   private String lblTbmensajeactualizar_Internalname ;
   private String lblTbmensajeactualizar_Caption ;
   private String lblTbmensajeactualizar_Jsonclick ;
   private String Barraprogreso_Internalname ;
   private String lblFiltroseleccionados_Internalname ;
   private String lblFiltroseleccionados_Caption ;
   private String lblFiltroseleccionados_Jsonclick ;
   private String divTabledatos_Internalname ;
   private String Gxuitabspanel_tabs1_Internalname ;
   private String lblTab1procesos_title_Internalname ;
   private String lblTab1procesos_title_Jsonclick ;
   private String divTablegrafica_Internalname ;
   private String Qvprocesoa_Title ;
   private String Qvprocesoa_Internalname ;
   private String Qvprocesob_Title ;
   private String Qvprocesob_Internalname ;
   private String Qvprocesoc_Internalname ;
   private String lblTab1detalle_title_Internalname ;
   private String lblTab1detalle_title_Jsonclick ;
   private String divTabledetalle_Internalname ;
   private String WebComp_Wcmrec_analisisdetalle_Component ;
   private String OldWcmrec_analisisdetalle ;
   private String lblTab1hdr_title_Internalname ;
   private String lblTab1hdr_title_Jsonclick ;
   private String divTablehdr_Internalname ;
   private String WebComp_Wcmrec_analisishdr_Component ;
   private String OldWcmrec_analisishdr ;
   private String divTablenodatos_Internalname ;
   private String Dvpanel_panelsindatos_Internalname ;
   private String divPanelsindatos_Internalname ;
   private String divTableresultado1_Internalname ;
   private String lblTextblock_resultado1_Internalname ;
   private String lblTextblock_resultado1_Jsonclick ;
   private String lblImage12_Internalname ;
   private String lblImage12_Jsonclick ;
   private String Datamon_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavLongvarchar_Internalname ;
   private String edtavSegundos_Internalname ;
   private String edtavSegundos_Tooltiptext ;
   private String edtavSegundos_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String hsh ;
   private String AV78Station ;
   private String GXt_char1 ;
   private String AV79EmprNom ;
   private String scmdbuf ;
   private String AV98MRParPrHdr ;
   private String AV104MRParPrMaqCod ;
   private String AV103MRParPrFasCod ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String GXv_char10[] ;
   private java.util.Date AV43Desde ;
   private java.util.Date AV44Hasta ;
   private java.util.Date AV45Now ;
   private java.util.Date A14700MEPrReg ;
   private java.util.Date AV47DesdeFechaHora ;
   private java.util.Date AV48HastaFechaHora ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV10CronometroStart ;
   private boolean Combo_hdr_Allowmultipleselection ;
   private boolean Combo_hdr_Includeonlyselectedoption ;
   private boolean Combo_hdr_Emptyitem ;
   private boolean Combo_maqcod_Allowmultipleselection ;
   private boolean Combo_maqcod_Includeonlyselectedoption ;
   private boolean Combo_fascod_Allowmultipleselection ;
   private boolean Combo_fascod_Includeonlyselectedoption ;
   private boolean Combo_fascod_Emptyitem ;
   private boolean Combo_parfascod_Allowmultipleselection ;
   private boolean Combo_parfascod_Includeonlyselectedoption ;
   private boolean Combo_parfascod_Emptyitem ;
   private boolean Dvpanel_panelfiltros_Autowidth ;
   private boolean Dvpanel_panelfiltros_Autoheight ;
   private boolean Dvpanel_panelfiltros_Collapsible ;
   private boolean Dvpanel_panelfiltros_Collapsed ;
   private boolean Dvpanel_panelfiltros_Showcollapseicon ;
   private boolean Dvpanel_panelfiltros_Autoscroll ;
   private boolean Qvprocesoa_Allowselection ;
   private boolean Qvprocesob_Allowselection ;
   private boolean Qvprocesob_Rememberlayout ;
   private boolean Gxuitabspanel_tabs1_Historymanagement ;
   private boolean Dvpanel_panelsindatos_Autowidth ;
   private boolean Dvpanel_panelsindatos_Autoheight ;
   private boolean Dvpanel_panelsindatos_Collapsible ;
   private boolean Dvpanel_panelsindatos_Collapsed ;
   private boolean Dvpanel_panelsindatos_Showcollapseicon ;
   private boolean Dvpanel_panelsindatos_Autoscroll ;
   private boolean wbLoad ;
   private boolean AV20FueraRango ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcmrec_analisishdr ;
   private boolean AV59existeRegistro ;
   private boolean bDynCreated_Wcmrec_analisisdetalle ;
   private boolean AV58ExisteFiltro ;
   private boolean GXt_boolean8 ;
   private boolean GXv_boolean11[] ;
   private String AV65memo ;
   private String AV25Longvarchar ;
   private String AV81MRasTxt ;
   private String AV64Ip ;
   private String AV77MTkn ;
   private String A14699MEPrIp ;
   private String A14701MEPrTkn ;
   private String A14702MEPrObj ;
   private String AV83Titulo ;
   private String AV92EncontradoNombrePlc ;
   private String AV95NumeroNombrePlc ;
   private String AV68MRParPrPLC ;
   private String AV76InFilTkn ;
   private GXSimpleCollection<Short> AV30ParFasCod ;
   private GXSimpleCollection<Short> AV102LineaParFasCod ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcmrec_analisisdetalle ;
   private GXWebComponent WebComp_Wcmrec_analisishdr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelfiltros ;
   private com.genexus.webpanels.GXUserControl ucCombo_hdr ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_fascod ;
   private com.genexus.webpanels.GXUserControl ucCombo_parfascod ;
   private com.genexus.webpanels.GXUserControl ucBarraprogreso ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs1 ;
   private com.genexus.webpanels.GXUserControl ucQvprocesoa ;
   private com.genexus.webpanels.GXUserControl ucQvprocesob ;
   private com.genexus.webpanels.GXUserControl ucQvprocesoc ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelsindatos ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavFuerarango ;
   private IDataStoreProvider pr_default ;
   private String[] H01WE2_A14702MEPrObj ;
   private String[] H01WE2_A14701MEPrTkn ;
   private java.util.Date[] H01WE2_A14700MEPrReg ;
   private String[] H01WE2_A14699MEPrIp ;
   private String[] H01WE2_A14698MEPrUsu ;
   private String[] H01WE2_A14697MEPrHdr ;
   private String[] H01WE2_A14691MEPrFasCod ;
   private String[] H01WE2_A14693MEPrMaqCod ;
   private String[] H01WE2_A396EmprCod ;
   private String[] H01WE2_A14696MEPrParDsc ;
   private short[] H01WE2_A14695MEPrParCod ;
   private String[] H01WE3_A14702MEPrObj ;
   private String[] H01WE3_A14701MEPrTkn ;
   private java.util.Date[] H01WE3_A14700MEPrReg ;
   private String[] H01WE3_A14699MEPrIp ;
   private String[] H01WE3_A14698MEPrUsu ;
   private String[] H01WE3_A14697MEPrHdr ;
   private String[] H01WE3_A14693MEPrMaqCod ;
   private String[] H01WE3_A396EmprCod ;
   private String[] H01WE3_A14692MEPrFasDsc ;
   private String[] H01WE3_A14691MEPrFasCod ;
   private String[] H01WE4_A14702MEPrObj ;
   private String[] H01WE4_A14701MEPrTkn ;
   private java.util.Date[] H01WE4_A14700MEPrReg ;
   private String[] H01WE4_A14699MEPrIp ;
   private String[] H01WE4_A14698MEPrUsu ;
   private String[] H01WE4_A14697MEPrHdr ;
   private String[] H01WE4_A396EmprCod ;
   private String[] H01WE4_A14694MEPrMaqDsc ;
   private String[] H01WE4_A14693MEPrMaqCod ;
   private String[] H01WE5_A14702MEPrObj ;
   private String[] H01WE5_A14701MEPrTkn ;
   private java.util.Date[] H01WE5_A14700MEPrReg ;
   private String[] H01WE5_A14699MEPrIp ;
   private String[] H01WE5_A14698MEPrUsu ;
   private String[] H01WE5_A396EmprCod ;
   private String[] H01WE5_A130BarCodPar ;
   private byte[] H01WE5_A132BarCodReo ;
   private int[] H01WE5_A129BarCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV26MaqCod ;
   private GXSimpleCollection<String> AV18FasCod ;
   private GXSimpleCollection<String> AV60Hdr ;
   private GXSimpleCollection<String> AV101LineaHdr ;
   private GXSimpleCollection<String> AV100LineaFasCod ;
   private GXSimpleCollection<String> AV99LineaMaqCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV61Hdr_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV27MaqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV19FasCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV31ParFasCod_Data ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT> AV12Datos ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT> GXt_objcol_SdtMRec_AnalisisSDT13 ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisSDT> GXv_objcol_SdtMRec_AnalisisSDT14[] ;
   private GXBaseCollection<app.ingenieria.SdtMRec_DatoColumnaExisteSDT> AV56Dato_Existe ;
   private GXBaseCollection<app.ingenieria.SdtMRec_DatoColumnaExisteSDT> GXt_objcol_SdtMRec_DatoColumnaExisteSDT15 ;
   private GXBaseCollection<app.ingenieria.SdtMRec_DatoColumnaExisteSDT> GXv_objcol_SdtMRec_DatoColumnaExisteSDT16[] ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV16Elements ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV71PlcElements ;
   private GXBaseCollection<app.SdtQueryViewerItemClickData_Element> AV85DataPosicion ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV29Parameters ;
   private GXBaseCollection<app.ingenieria.SdtMRParProSDT> AV106MRParProSDTCollection ;
   private GXBaseCollection<app.ingenieria.SdtMRParProSDT> GXv_objcol_SdtMRParProSDT17[] ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT> AV108MRec_AnalisisLineaSDT ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT> GXt_objcol_SdtMRec_AnalisisLineaSDT18 ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT> GXv_objcol_SdtMRec_AnalisisLineaSDT19[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV8Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV13DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
   private app.SdtQueryViewerDragAndDropData AV14DragAndDropData ;
   private app.SdtQueryViewerElements_Element AV70PlcElement ;
   private app.SdtQueryViewerFilterChangedData AV39FilterChangedData ;
   private app.ingenieria.SdtInFilSDT AV63inFilSDT ;
   private app.SdtQueryViewerItemClickData AV21ItemClickData ;
   private app.SdtQueryViewerItemCollapseData AV22ItemCollapseData ;
   private app.SdtQueryViewerItemDoubleClickData AV23ItemDoubleClickData ;
   private app.SdtQueryViewerItemExpandData AV24ItemExpandData ;
   private app.wwpbaseobjects.SdtWWPContext AV75WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext3[] ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV84ProgressIndicator ;
   private app.ingenieria.SdtMRParProSDT AV107MRParProSDT ;
}

final  class mrec_analisis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01WE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14693MEPrMaqCod ,
                                          GXSimpleCollection<String> AV26MaqCod ,
                                          String A14691MEPrFasCod ,
                                          GXSimpleCollection<String> AV18FasCod ,
                                          String A14697MEPrHdr ,
                                          GXSimpleCollection<String> AV60Hdr ,
                                          java.util.Date A14700MEPrReg ,
                                          java.util.Date AV45Now ,
                                          String A14698MEPrUsu ,
                                          String AV74UsurCod ,
                                          String A14699MEPrIp ,
                                          String AV64Ip ,
                                          String A14701MEPrTkn ,
                                          String AV77MTkn ,
                                          String A14702MEPrObj ,
                                          String AV114Pgmname ,
                                          String AV17EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[6];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS MEPrObj, NULL AS MEPrTkn, NULL AS MEPrReg, NULL AS MEPrIp, NULL AS MEPrUsu, NULL AS MEPrHdr, NULL AS MEPrFasCod, NULL AS MEPrMaqCod, NULL" ;
      scmdbuf += " AS EmprCod, MEPrParDsc, MEPrParCod FROM ( SELECT MEPrObj, MEPrTkn, MEPrReg, MEPrIp, MEPrUsu, MEPrHdr, MEPrFasCod, MEPrMaqCod, EmprCod, MEPrParDsc, MEPrParCod FROM" ;
      scmdbuf += " MEPr" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV26MaqCod, "MEPrMaqCod IN (", ")")+")");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV18FasCod, "MEPrFasCod IN (", ")")+")");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV60Hdr, "MEPrHdr IN (", ")")+")");
      addWhere(sWhereString, "(MEPrReg >= ?)");
      addWhere(sWhereString, "(MEPrUsu = ?)");
      addWhere(sWhereString, "(MEPrIp = ?)");
      addWhere(sWhereString, "(MEPrTkn = ?)");
      addWhere(sWhereString, "(MEPrObj = ?)");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      scmdbuf += ") DistinctT" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_H01WE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14693MEPrMaqCod ,
                                          GXSimpleCollection<String> AV26MaqCod ,
                                          String A14697MEPrHdr ,
                                          GXSimpleCollection<String> AV60Hdr ,
                                          java.util.Date A14700MEPrReg ,
                                          java.util.Date AV45Now ,
                                          String A14698MEPrUsu ,
                                          String AV74UsurCod ,
                                          String A14699MEPrIp ,
                                          String AV64Ip ,
                                          String A14701MEPrTkn ,
                                          String AV77MTkn ,
                                          String A14702MEPrObj ,
                                          String AV114Pgmname ,
                                          String AV17EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[6];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS MEPrObj, NULL AS MEPrTkn, NULL AS MEPrReg, NULL AS MEPrIp, NULL AS MEPrUsu, NULL AS MEPrHdr, NULL AS MEPrMaqCod, NULL AS EmprCod, MEPrFasDsc," ;
      scmdbuf += " MEPrFasCod FROM ( SELECT MEPrObj, MEPrTkn, MEPrReg, MEPrIp, MEPrUsu, MEPrHdr, MEPrMaqCod, EmprCod, MEPrFasDsc, MEPrFasCod FROM MEPr" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV26MaqCod, "MEPrMaqCod IN (", ")")+")");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV60Hdr, "MEPrHdr IN (", ")")+")");
      addWhere(sWhereString, "(MEPrReg >= ?)");
      addWhere(sWhereString, "(MEPrUsu = ?)");
      addWhere(sWhereString, "(MEPrIp = ?)");
      addWhere(sWhereString, "(MEPrTkn = ?)");
      addWhere(sWhereString, "(MEPrObj = ?)");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      scmdbuf += ") DistinctT" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_H01WE4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14697MEPrHdr ,
                                          GXSimpleCollection<String> AV60Hdr ,
                                          java.util.Date A14700MEPrReg ,
                                          java.util.Date AV45Now ,
                                          String A14698MEPrUsu ,
                                          String AV74UsurCod ,
                                          String A14699MEPrIp ,
                                          String AV64Ip ,
                                          String A14701MEPrTkn ,
                                          String AV77MTkn ,
                                          String A14702MEPrObj ,
                                          String AV114Pgmname ,
                                          String AV17EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[6];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS MEPrObj, NULL AS MEPrTkn, NULL AS MEPrReg, NULL AS MEPrIp, NULL AS MEPrUsu, NULL AS MEPrHdr, NULL AS EmprCod, MEPrMaqDsc, MEPrMaqCod FROM" ;
      scmdbuf += " ( SELECT MEPrObj, MEPrTkn, MEPrReg, MEPrIp, MEPrUsu, MEPrHdr, EmprCod, MEPrMaqDsc, MEPrMaqCod FROM MEPr" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV60Hdr, "MEPrHdr IN (", ")")+")");
      addWhere(sWhereString, "(MEPrReg >= ?)");
      addWhere(sWhereString, "(MEPrUsu = ?)");
      addWhere(sWhereString, "(MEPrIp = ?)");
      addWhere(sWhereString, "(MEPrTkn = ?)");
      addWhere(sWhereString, "(MEPrObj = ?)");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      scmdbuf += ") DistinctT" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H01WE2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] );
            case 1 :
                  return conditional_H01WE3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 2 :
                  return conditional_H01WE4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01WE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WE4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WE5", "SELECT DISTINCT NULL AS MEPrObj, NULL AS MEPrTkn, NULL AS MEPrReg, NULL AS MEPrIp, NULL AS MEPrUsu, EmprCod, BarCodPar, BarCodReo, BarCod FROM ( SELECT MEPrObj, MEPrTkn, MEPrReg, MEPrIp, MEPrUsu, EmprCod, BarCodPar, BarCodReo, BarCod FROM MEPr WHERE (EmprCod = ?) AND (MEPrReg >= ?) AND (MEPrUsu = ?) AND (MEPrIp = ?) AND (MEPrTkn = ?) AND (MEPrObj = ?) ORDER BY EmprCod) DistinctT ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3, true);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3, true);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3, true);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3, true);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[7], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 256);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 129);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[7], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 256);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 129);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[7], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 256);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 129);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDateTime(2, (java.util.Date)parms[1], false, true);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 20);
               stmt.setVarchar(5, (String)parms[4], 256);
               stmt.setString(6, (String)parms[5], 129);
               return;
      }
   }

}

