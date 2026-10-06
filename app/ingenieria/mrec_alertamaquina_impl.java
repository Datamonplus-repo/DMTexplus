package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mrec_alertamaquina_impl extends GXDataArea
{
   public mrec_alertamaquina_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mrec_alertamaquina_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_alertamaquina_impl.class ));
   }

   public mrec_alertamaquina_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Fsgrid1") == 0 )
         {
            gxnrfsgrid1_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Fsgrid1") == 0 )
         {
            gxgrfsgrid1_refresh_invoke( ) ;
            return  ;
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

   public void gxnrfsgrid1_newrow_invoke( )
   {
      nRC_GXsfl_109 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_109"))) ;
      nGXsfl_109_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_109_idx"))) ;
      sGXsfl_109_idx = httpContext.GetPar( "sGXsfl_109_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrfsgrid1_newrow( ) ;
      /* End function gxnrFsgrid1_newrow_invoke */
   }

   public void gxgrfsgrid1_refresh_invoke( )
   {
      AV129Contador = GXutil.lval( httpContext.GetPar( "Contador")) ;
      AV132Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV79Maquinas);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV123MRec_AnalisisLineaSDT);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV128PrimeraMaquinaMRec_AnalisisLineaSDT);
      AV29FueraRango = GXutil.strtobool( httpContext.GetPar( "FueraRango")) ;
      AV102UsurCod = httpContext.GetPar( "UsurCod") ;
      AV64Ip = httpContext.GetPar( "Ip") ;
      AV25EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrfsgrid1_refresh( AV129Contador, AV132Pgmname, AV79Maquinas, AV123MRec_AnalisisLineaSDT, AV128PrimeraMaquinaMRec_AnalisisLineaSDT, AV29FueraRango, AV102UsurCod, AV64Ip, AV25EmprCod) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrFsgrid1_refresh_invoke */
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
      pa2E42( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2E42( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Chronometer/ChronometerRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/Ingenieria.GraficaAlertaUCRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.mrec_alertamaquina", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV129Contador), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIMERAMAQUINAMREC_ANALISISLINEASDT", getSecureSignedToken( "", AV128PrimeraMaquinaMRec_AnalisisLineaSDT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64Ip, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MRec_AlertaMaquina");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV132Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\mrec_alertamaquina:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_109", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_109, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV18DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV18DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSEGUNDOS_DATA", AV94Segundos_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSEGUNDOS_DATA", AV94Segundos_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD_DATA", AV76MaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD_DATA", AV76MaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCOD_DATA", AV27FasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCOD_DATA", AV27FasCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vHDR_DATA", AV60Hdr_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vHDR_DATA", AV60Hdr_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARFASCOD_DATA", AV88ParFasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARFASCOD_DATA", AV88ParFasCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTADOR", GXutil.ltrim( localUtil.ntoc( AV129Contador, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV129Contador), "ZZZZZZZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQUINAS", AV79Maquinas);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQUINAS", AV79Maquinas);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMREC_ANALISISLINEASDT", AV123MRec_AnalisisLineaSDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMREC_ANALISISLINEASDT", AV123MRec_AnalisisLineaSDT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRIMERAMAQUINAMREC_ANALISISLINEASDT", AV128PrimeraMaquinaMRec_AnalisisLineaSDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRIMERAMAQUINAMREC_ANALISISLINEASDT", AV128PrimeraMaquinaMRec_AnalisisLineaSDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIMERAMAQUINAMREC_ANALISISLINEASDT", getSecureSignedToken( "", AV128PrimeraMaquinaMRec_AnalisisLineaSDT));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vCRONOMETROSTART", AV14CronometroStart);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD", AV75MaqCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD", AV75MaqCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vHDR", AV59Hdr);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vHDR", AV59Hdr);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCOD", AV26FasCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCOD", AV26FasCod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vDESDE", localUtil.ttoc( AV19Desde, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASTA", localUtil.ttoc( AV57Hasta, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV102UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102UsurCod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vINFILSDT", AV107InFilSDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vINFILSDT", AV107InFilSDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vIP", AV64Ip);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64Ip, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOW", localUtil.ttoc( AV105Now, 10, 12, 0, 0, "/", ":", " "));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARFASCOD", AV87ParFasCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARFASCOD", AV87ParFasCod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV25EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRUSU", GXutil.rtrim( A14698MEPrUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRIP", A14699MEPrIp);
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRREG", localUtil.ttoc( A14700MEPrReg, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRTKN", A14701MEPrTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "vINFILTKN", AV111InFilTkn);
      app.GxWebStd.gx_hidden_field( httpContext, "MEPROBJ", A14702MEPrObj);
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRMAQCOD", GXutil.rtrim( A14693MEPrMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRMAQDSC", GXutil.rtrim( A14694MEPrMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRFASCOD", GXutil.rtrim( A14691MEPrFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRHDR", GXutil.rtrim( A14697MEPrHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRPARCOD", GXutil.ltrim( localUtil.ntoc( A14695MEPrParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRPARDSC", GXutil.rtrim( A14696MEPrParDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "MEPRFASDSC", GXutil.rtrim( A14692MEPrFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SEGUNDOS_Cls", GXutil.rtrim( Combo_segundos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SEGUNDOS_Selectedvalue_set", GXutil.rtrim( Combo_segundos_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SEGUNDOS_Selectedtext_set", GXutil.rtrim( Combo_segundos_Selectedtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SEGUNDOS_Emptyitem", GXutil.booltostr( Combo_segundos_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Cls", GXutil.rtrim( Combo_hdr_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Selectedvalue_set", GXutil.rtrim( Combo_hdr_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Allowmultipleselection", GXutil.booltostr( Combo_hdr_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Includeonlyselectedoption", GXutil.booltostr( Combo_hdr_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Emptyitem", GXutil.booltostr( Combo_hdr_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Multiplevaluestype", GXutil.rtrim( Combo_hdr_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Cls", GXutil.rtrim( Combo_parfascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Selectedvalue_set", GXutil.rtrim( Combo_parfascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Allowmultipleselection", GXutil.booltostr( Combo_parfascod_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Includeonlyselectedoption", GXutil.booltostr( Combo_parfascod_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Emptyitem", GXutil.booltostr( Combo_parfascod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Multiplevaluestype", GXutil.rtrim( Combo_parfascod_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "UC_CHROMETER_Tickinterval", GXutil.ltrim( localUtil.ntoc( Uc_chrometer_Tickinterval, (byte)(9), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Width", GXutil.rtrim( Dvpanel_panelgeneral_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Autowidth", GXutil.booltostr( Dvpanel_panelgeneral_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Autoheight", GXutil.booltostr( Dvpanel_panelgeneral_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Cls", GXutil.rtrim( Dvpanel_panelgeneral_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Title", GXutil.rtrim( Dvpanel_panelgeneral_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Collapsible", GXutil.booltostr( Dvpanel_panelgeneral_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Collapsed", GXutil.booltostr( Dvpanel_panelgeneral_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Showcollapseicon", GXutil.booltostr( Dvpanel_panelgeneral_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Iconposition", GXutil.rtrim( Dvpanel_panelgeneral_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERAL_Autoscroll", GXutil.booltostr( Dvpanel_panelgeneral_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs1_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Class", GXutil.rtrim( Gxuitabspanel_tabs1_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs1_Historymanagement));
      app.GxWebStd.gx_hidden_field( httpContext, "FSGRID1_Class", GXutil.rtrim( subFsgrid1_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "FSGRID1_Flexdirection", GXutil.rtrim( subFsgrid1_Flexdirection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Selectedvalue_get", GXutil.rtrim( Combo_parfascod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Selectedvalue_get", GXutil.rtrim( Combo_hdr_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_get", GXutil.rtrim( Combo_fascod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SEGUNDOS_Selectedvalue_get", GXutil.rtrim( Combo_segundos_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Selectedvalue_get", GXutil.rtrim( Combo_parfascod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_HDR_Selectedvalue_get", GXutil.rtrim( Combo_hdr_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_get", GXutil.rtrim( Combo_fascod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SEGUNDOS_Selectedvalue_get", GXutil.rtrim( Combo_segundos_Selectedvalue_get));
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
      if ( ! ( WebComp_Wcmrec_detalle == null ) )
      {
         WebComp_Wcmrec_detalle.componentjscripts();
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
         we2E42( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2E42( ) ;
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
      return formatLink("app.ingenieria.mrec_alertamaquina", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.MRec_AlertaMaquina" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Alertas", "") ;
   }

   public void wb2E40( )
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
         app.GxWebStd.gx_div_start( httpContext, divPanelfiltros_Internalname, 1, 0, "px", divPanelfiltros_Height, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedsegundos_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_segundos_Internalname, httpContext.getMessage( "Intervalo ", ""), "", "", lblTextblockcombo_segundos_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_AlertaMaquina.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_segundos.setProperty("Caption", Combo_segundos_Caption);
         ucCombo_segundos.setProperty("Cls", Combo_segundos_Cls);
         ucCombo_segundos.setProperty("EmptyItem", Combo_segundos_Emptyitem);
         ucCombo_segundos.setProperty("DropDownOptionsTitleSettingsIcons", AV18DDO_TitleSettingsIcons);
         ucCombo_segundos.setProperty("DropDownOptionsData", AV94Segundos_Data);
         ucCombo_segundos.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_segundos_Internalname, "COMBO_SEGUNDOSContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcod_Internalname, httpContext.getMessage( "Máquina(s)", ""), "", "", lblTextblockcombo_maqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_AlertaMaquina.htm");
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
         ucCombo_maqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV18DDO_TitleSettingsIcons);
         ucCombo_maqcod.setProperty("DropDownOptionsData", AV76MaqCod_Data);
         ucCombo_maqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod_Internalname, "COMBO_MAQCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_fascod_Internalname, httpContext.getMessage( "Fase(s)", ""), "", "", lblTextblockcombo_fascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_AlertaMaquina.htm");
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
         ucCombo_fascod.setProperty("DropDownOptionsTitleSettingsIcons", AV18DDO_TitleSettingsIcons);
         ucCombo_fascod.setProperty("DropDownOptionsData", AV27FasCod_Data);
         ucCombo_fascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fascod_Internalname, "COMBO_FASCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedhdr_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_hdr_Internalname, httpContext.getMessage( "Hdr(s)", ""), "", "", lblTextblockcombo_hdr_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_AlertaMaquina.htm");
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
         ucCombo_hdr.setProperty("DropDownOptionsTitleSettingsIcons", AV18DDO_TitleSettingsIcons);
         ucCombo_hdr.setProperty("DropDownOptionsData", AV60Hdr_Data);
         ucCombo_hdr.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_hdr_Internalname, "COMBO_HDRContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedparfascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_parfascod_Internalname, httpContext.getMessage( "Parámetro(s)", ""), "", "", lblTextblockcombo_parfascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_AlertaMaquina.htm");
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
         ucCombo_parfascod.setProperty("DropDownOptionsTitleSettingsIcons", AV18DDO_TitleSettingsIcons);
         ucCombo_parfascod.setProperty("DropDownOptionsData", AV88ParFasCod_Data);
         ucCombo_parfascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_parfascod_Internalname, "COMBO_PARFASCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavFuerarango.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavFuerarango.getInternalname(), httpContext.getMessage( "Error", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavFuerarango.getInternalname(), GXutil.booltostr( AV29FueraRango), "", httpContext.getMessage( "Error", ""), 1, chkavFuerarango.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(61, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,61);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop30", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblActualizar_Internalname, httpContext.getMessage( "<i class=\"fa fa-search fas fa-search fa-3x\"></i>", ""), "", "", lblActualizar_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOACTUALIZAR\\'."+"'", "", lblActualizar_Class, 5, httpContext.getMessage( "Actualizar resultados...", ""), 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_AlertaMaquina.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablerango_Internalname, divTablerango_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDesdefechahora_Internalname, httpContext.getMessage( "Desde Fecha Hora", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDesdefechahora_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDesdefechahora_Internalname, localUtil.ttoc( AV20DesdeFechaHora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV20DesdeFechaHora, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDesdefechahora_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDesdefechahora_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRec_AlertaMaquina.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDesdefechahora_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDesdefechahora_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MRec_AlertaMaquina.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHastafechahora_Internalname, httpContext.getMessage( "Hasta Fecha Hora", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHastafechahora_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHastafechahora_Internalname, localUtil.ttoc( AV58HastaFechaHora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV58HastaFechaHora, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHastafechahora_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHastafechahora_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRec_AlertaMaquina.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHastafechahora_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHastafechahora_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MRec_AlertaMaquina.htm");
         httpContext.writeTextNL( "</div>") ;
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
         wb_table1_76_2E42( true) ;
      }
      else
      {
         wb_table1_76_2E42( false) ;
      }
      return  ;
   }

   public void wb_table1_76_2E42e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucUc_chrometer.render(context, "wwp.chronometer", Uc_chrometer_Internalname, "UC_CHROMETERContainer");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGxuitabspanel_tabs1.setProperty("PageCount", Gxuitabspanel_tabs1_Pagecount);
         ucGxuitabspanel_tabs1.setProperty("Class", Gxuitabspanel_tabs1_Class);
         ucGxuitabspanel_tabs1.setProperty("HistoryManagement", Gxuitabspanel_tabs1_Historymanagement);
         ucGxuitabspanel_tabs1.render(context, "tab", Gxuitabspanel_tabs1_Internalname, "GXUITABSPANEL_TABS1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabgeneral_title_Internalname, httpContext.getMessage( "Alerta", ""), "", "", lblTabgeneral_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_AlertaMaquina.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabGeneral") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablegeneral_Internalname, divTablegeneral_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelgeneral.setProperty("Width", Dvpanel_panelgeneral_Width);
         ucDvpanel_panelgeneral.setProperty("AutoWidth", Dvpanel_panelgeneral_Autowidth);
         ucDvpanel_panelgeneral.setProperty("AutoHeight", Dvpanel_panelgeneral_Autoheight);
         ucDvpanel_panelgeneral.setProperty("Cls", Dvpanel_panelgeneral_Cls);
         ucDvpanel_panelgeneral.setProperty("Title", Dvpanel_panelgeneral_Title);
         ucDvpanel_panelgeneral.setProperty("Collapsible", Dvpanel_panelgeneral_Collapsible);
         ucDvpanel_panelgeneral.setProperty("Collapsed", Dvpanel_panelgeneral_Collapsed);
         ucDvpanel_panelgeneral.setProperty("ShowCollapseIcon", Dvpanel_panelgeneral_Showcollapseicon);
         ucDvpanel_panelgeneral.setProperty("IconPosition", Dvpanel_panelgeneral_Iconposition);
         ucDvpanel_panelgeneral.setProperty("AutoScroll", Dvpanel_panelgeneral_Autoscroll);
         ucDvpanel_panelgeneral.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelgeneral_Internalname, "DVPANEL_PANELGENERALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELGENERALContainer"+"PanelGeneral"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelgeneral_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTitulogeneral_Internalname, lblTitulogeneral_Caption, "", "", lblTitulogeneral_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_AlertaMaquina.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemaquinas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Fsgrid1Container.SetIsFreestyle(true);
         Fsgrid1Container.SetWrapped(nGXWrapped);
         startgridcontrol109( ) ;
      }
      if ( wbEnd == 109 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_109 = (int)(nGXsfl_109_idx-1) ;
         if ( Fsgrid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Fsgrid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Fsgrid1", Fsgrid1Container, subFsgrid1_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Fsgrid1ContainerData", Fsgrid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Fsgrid1ContainerData"+"V", Fsgrid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Fsgrid1ContainerData"+"V"+"\" value='"+Fsgrid1Container.GridValuesHidden()+"'/>") ;
            }
         }
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTabdetalle_title_Internalname, httpContext.getMessage( "Detalle", ""), "", "", lblTabdetalle_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec_AlertaMaquina.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "TabDetalle") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabletabdetalle_Internalname, divTabletabdetalle_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemasdetalles_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0140"+"", GXutil.rtrim( WebComp_Wcmrec_detalle_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0140"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_109_Refreshing )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcmrec_detalle), GXutil.lower( WebComp_Wcmrec_detalle_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0140"+"");
               }
               WebComp_Wcmrec_detalle.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcmrec_detalle), GXutil.lower( WebComp_Wcmrec_detalle_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV132Pgmname), GXutil.rtrim( localUtil.format( AV132Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec_AlertaMaquina.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSegundos_Internalname, GXutil.ltrim( localUtil.ntoc( AV93Segundos, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV93Segundos), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSegundos_Jsonclick, 0, "Attribute", "", "", "", "", edtavSegundos_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRec_AlertaMaquina.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 109 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Fsgrid1Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Fsgrid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Fsgrid1", Fsgrid1Container, subFsgrid1_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Fsgrid1ContainerData", Fsgrid1Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Fsgrid1ContainerData"+"V", Fsgrid1Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Fsgrid1ContainerData"+"V"+"\" value='"+Fsgrid1Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2E42( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Alertas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2E40( ) ;
   }

   public void ws2E42( )
   {
      start2E42( ) ;
      evt2E42( ) ;
   }

   public void evt2E42( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_SEGUNDOS.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e112E42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_MAQCOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122E42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_FASCOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132E42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_HDR.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142E42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_PARFASCOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152E42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "UC_CHROMETER.TICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e162E42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVPANEL_PANELFILTROS.ONTITLECLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e172E42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCRONOMETROSTARTSTOP'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCronometroStartStop' */
                           e182E42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOACTUALIZAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoActualizar' */
                           e192E42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VSEGUNDOS.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e202E42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDESDEFECHAHORA.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e212E42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VHASTAFECHAHORA.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e222E42 ();
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
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "FSGRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_109_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1092( ) ;
                           GXCCtl = "GRAFICA_Datasource_" + sGXsfl_109_idx ;
                           Grafica_Datasource = httpContext.cgiGet( GXCCtl) ;
                           ucGrafica.sendProperty(context, "", false, Grafica_Internalname, "DataSource", Grafica_Datasource);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Width_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Width = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Width", Dvpanel_unnamedtable1_Width);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autowidth_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoWidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoheight_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoHeight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Cls_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Cls", Dvpanel_unnamedtable1_Cls);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Title_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Title = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Title", Dvpanel_unnamedtable1_Title);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsible_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsed_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Showcollapseicon_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "ShowCollapseIcon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Iconposition_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "IconPosition", Dvpanel_unnamedtable1_Iconposition);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoscroll_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoScroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e232E42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "FSGRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e242E42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e252E42 ();
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
                              }
                           }
                           else
                           {
                           }
                        }
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "FSGRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_109_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1092( ) ;
                           GXCCtl = "GRAFICA_Datasource_" + sGXsfl_109_idx ;
                           Grafica_Datasource = httpContext.cgiGet( GXCCtl) ;
                           ucGrafica.sendProperty(context, "", false, Grafica_Internalname, "DataSource", Grafica_Datasource);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Width_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Width = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Width", Dvpanel_unnamedtable1_Width);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autowidth_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoWidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoheight_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoHeight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Cls_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Cls", Dvpanel_unnamedtable1_Cls);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Title_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Title = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Title", Dvpanel_unnamedtable1_Title);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsible_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsed_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Showcollapseicon_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "ShowCollapseIcon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Iconposition_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "IconPosition", Dvpanel_unnamedtable1_Iconposition);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoscroll_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoScroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e232E42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "FSGRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e242E42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e252E42 ();
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
                              }
                           }
                           else
                           {
                           }
                        }
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "FSGRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_109_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1092( ) ;
                           GXCCtl = "GRAFICA_Datasource_" + sGXsfl_109_idx ;
                           Grafica_Datasource = httpContext.cgiGet( GXCCtl) ;
                           ucGrafica.sendProperty(context, "", false, Grafica_Internalname, "DataSource", Grafica_Datasource);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Width_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Width = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Width", Dvpanel_unnamedtable1_Width);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autowidth_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoWidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoheight_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoHeight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Cls_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Cls", Dvpanel_unnamedtable1_Cls);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Title_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Title = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Title", Dvpanel_unnamedtable1_Title);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsible_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsed_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Showcollapseicon_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "ShowCollapseIcon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Iconposition_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "IconPosition", Dvpanel_unnamedtable1_Iconposition);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoscroll_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoScroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e232E42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "FSGRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e242E42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e252E42 ();
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
                              }
                           }
                           else
                           {
                           }
                        }
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "FSGRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_109_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1092( ) ;
                           GXCCtl = "GRAFICA_Datasource_" + sGXsfl_109_idx ;
                           Grafica_Datasource = httpContext.cgiGet( GXCCtl) ;
                           ucGrafica.sendProperty(context, "", false, Grafica_Internalname, "DataSource", Grafica_Datasource);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Width_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Width = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Width", Dvpanel_unnamedtable1_Width);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autowidth_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoWidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoheight_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoHeight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Cls_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Cls", Dvpanel_unnamedtable1_Cls);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Title_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Title = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Title", Dvpanel_unnamedtable1_Title);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsible_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsed_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Showcollapseicon_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "ShowCollapseIcon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Iconposition_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "IconPosition", Dvpanel_unnamedtable1_Iconposition);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoscroll_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoScroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e232E42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "FSGRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e242E42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e252E42 ();
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
                              }
                           }
                           else
                           {
                           }
                        }
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "FSGRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_109_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1092( ) ;
                           GXCCtl = "GRAFICA_Datasource_" + sGXsfl_109_idx ;
                           Grafica_Datasource = httpContext.cgiGet( GXCCtl) ;
                           ucGrafica.sendProperty(context, "", false, Grafica_Internalname, "DataSource", Grafica_Datasource);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Width_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Width = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Width", Dvpanel_unnamedtable1_Width);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autowidth_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoWidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoheight_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoHeight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Cls_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Cls", Dvpanel_unnamedtable1_Cls);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Title_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Title = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Title", Dvpanel_unnamedtable1_Title);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsible_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsed_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Showcollapseicon_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "ShowCollapseIcon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Iconposition_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "IconPosition", Dvpanel_unnamedtable1_Iconposition);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoscroll_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoScroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e232E42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "FSGRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e242E42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e252E42 ();
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
                              }
                           }
                           else
                           {
                           }
                        }
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "FSGRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_109_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1092( ) ;
                           GXCCtl = "GRAFICA_Datasource_" + sGXsfl_109_idx ;
                           Grafica_Datasource = httpContext.cgiGet( GXCCtl) ;
                           ucGrafica.sendProperty(context, "", false, Grafica_Internalname, "DataSource", Grafica_Datasource);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Width_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Width = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Width", Dvpanel_unnamedtable1_Width);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autowidth_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoWidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoheight_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoHeight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Cls_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Cls", Dvpanel_unnamedtable1_Cls);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Title_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Title = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Title", Dvpanel_unnamedtable1_Title);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsible_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsed_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Showcollapseicon_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "ShowCollapseIcon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Iconposition_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( GXCCtl) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "IconPosition", Dvpanel_unnamedtable1_Iconposition);
                           GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoscroll_" + sGXsfl_109_idx ;
                           Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
                           ucDvpanel_unnamedtable1.sendProperty(context, "", false, Dvpanel_unnamedtable1_Internalname, "AutoScroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e232E42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "FSGRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e242E42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e252E42 ();
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
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 140 )
                     {
                        OldWcmrec_detalle = httpContext.cgiGet( "W0140") ;
                        if ( ( GXutil.len( OldWcmrec_detalle) == 0 ) || ( GXutil.strcmp(OldWcmrec_detalle, WebComp_Wcmrec_detalle_Component) != 0 ) )
                        {
                           WebComp_Wcmrec_detalle = WebUtils.getWebComponent(getClass(), "app." + OldWcmrec_detalle + "_impl", remoteHandle, context);
                           WebComp_Wcmrec_detalle_Component = OldWcmrec_detalle ;
                        }
                        WebComp_Wcmrec_detalle.componentprocess("W0140", "", sEvt);
                        WebComp_Wcmrec_detalle_Component = OldWcmrec_detalle ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2E42( )
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

   public void pa2E42( )
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
            GX_FocusControl = chkavFuerarango.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrfsgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1092( ) ;
      while ( nGXsfl_109_idx <= nRC_GXsfl_109 )
      {
         sendrow_1092( ) ;
         nGXsfl_109_idx = ((subFsgrid1_Islastpage==1)&&(nGXsfl_109_idx+1>subfsgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_109_idx+1) ;
         sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1092( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Fsgrid1Container)) ;
      /* End function gxnrFsgrid1_newrow */
   }

   public void gxgrfsgrid1_refresh( long AV129Contador ,
                                    String AV132Pgmname ,
                                    GXBaseCollection<app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item> AV79Maquinas ,
                                    GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT> AV123MRec_AnalisisLineaSDT ,
                                    GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT> AV128PrimeraMaquinaMRec_AnalisisLineaSDT ,
                                    boolean AV29FueraRango ,
                                    String AV102UsurCod ,
                                    String AV64Ip ,
                                    String AV25EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e252E42 ();
      FSGRID1_nCurrentRecord = 0 ;
      rf2E42( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MRec_AlertaMaquina");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV132Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\mrec_alertamaquina:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrFsgrid1_refresh */
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
      AV29FueraRango = GXutil.strtobool( GXutil.booltostr( AV29FueraRango)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29FueraRango", AV29FueraRango);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2E42( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV132Pgmname = "Ingenieria.MRec_AlertaMaquina" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV132Pgmname", AV132Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2E42( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Fsgrid1Container.ClearRows();
      }
      wbStart = (short)(109) ;
      /* Execute user event: Refresh */
      e252E42 ();
      nGXsfl_109_idx = 1 ;
      sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1092( ) ;
      bGXsfl_109_Refreshing = true ;
      Fsgrid1Container.AddObjectProperty("GridName", "Fsgrid1");
      Fsgrid1Container.AddObjectProperty("CmpContext", "");
      Fsgrid1Container.AddObjectProperty("InMasterPage", "false");
      Fsgrid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
      Fsgrid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Fsgrid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Fsgrid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Fsgrid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Fsgrid1Container.setPageSize( subfsgrid1_fnc_recordsperpage( ) );
      if ( subFsgrid1_Islastpage != 0 )
      {
         FSGRID1_nFirstRecordOnPage = (long)(subfsgrid1_fnc_recordcount( )-subfsgrid1_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "FSGRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( FSGRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("FSGRID1_nFirstRecordOnPage", FSGRID1_nFirstRecordOnPage);
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            WebComp_Wcmrec_detalle.componentstart();
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1092( ) ;
         e242E42 ();
         wbEnd = (short)(109) ;
         wb2E40( ) ;
      }
      bGXsfl_109_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2E42( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTADOR", GXutil.ltrim( localUtil.ntoc( AV129Contador, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV129Contador), "ZZZZZZZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRIMERAMAQUINAMREC_ANALISISLINEASDT", AV128PrimeraMaquinaMRec_AnalisisLineaSDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRIMERAMAQUINAMREC_ANALISISLINEASDT", AV128PrimeraMaquinaMRec_AnalisisLineaSDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIMERAMAQUINAMREC_ANALISISLINEASDT", getSecureSignedToken( "", AV128PrimeraMaquinaMRec_AnalisisLineaSDT));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV102UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vIP", AV64Ip);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64Ip, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV25EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
   }

   public int subfsgrid1_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subfsgrid1_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subfsgrid1_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subfsgrid1_fnc_currentpage( )
   {
      return -1 ;
   }

   public void before_start_formulas( )
   {
      AV132Pgmname = "Ingenieria.MRec_AlertaMaquina" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV132Pgmname", AV132Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2E40( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e232E42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV18DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSEGUNDOS_DATA"), AV94Segundos_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD_DATA"), AV76MaqCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASCOD_DATA"), AV27FasCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vHDR_DATA"), AV60Hdr_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARFASCOD_DATA"), AV88ParFasCod_Data);
         /* Read saved values. */
         nRC_GXsfl_109 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_109"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Combo_segundos_Cls = httpContext.cgiGet( "COMBO_SEGUNDOS_Cls") ;
         Combo_segundos_Selectedvalue_set = httpContext.cgiGet( "COMBO_SEGUNDOS_Selectedvalue_set") ;
         Combo_segundos_Selectedtext_set = httpContext.cgiGet( "COMBO_SEGUNDOS_Selectedtext_set") ;
         Combo_segundos_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_SEGUNDOS_Emptyitem")) ;
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
         Combo_hdr_Cls = httpContext.cgiGet( "COMBO_HDR_Cls") ;
         Combo_hdr_Selectedvalue_set = httpContext.cgiGet( "COMBO_HDR_Selectedvalue_set") ;
         Combo_hdr_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_HDR_Allowmultipleselection")) ;
         Combo_hdr_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_HDR_Includeonlyselectedoption")) ;
         Combo_hdr_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_HDR_Emptyitem")) ;
         Combo_hdr_Multiplevaluestype = httpContext.cgiGet( "COMBO_HDR_Multiplevaluestype") ;
         Combo_parfascod_Cls = httpContext.cgiGet( "COMBO_PARFASCOD_Cls") ;
         Combo_parfascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedvalue_set") ;
         Combo_parfascod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Allowmultipleselection")) ;
         Combo_parfascod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Includeonlyselectedoption")) ;
         Combo_parfascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Emptyitem")) ;
         Combo_parfascod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PARFASCOD_Multiplevaluestype") ;
         Uc_chrometer_Tickinterval = (int)(localUtil.ctol( httpContext.cgiGet( "UC_CHROMETER_Tickinterval"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvpanel_panelgeneral_Width = httpContext.cgiGet( "DVPANEL_PANELGENERAL_Width") ;
         Dvpanel_panelgeneral_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERAL_Autowidth")) ;
         Dvpanel_panelgeneral_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERAL_Autoheight")) ;
         Dvpanel_panelgeneral_Cls = httpContext.cgiGet( "DVPANEL_PANELGENERAL_Cls") ;
         Dvpanel_panelgeneral_Title = httpContext.cgiGet( "DVPANEL_PANELGENERAL_Title") ;
         Dvpanel_panelgeneral_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERAL_Collapsible")) ;
         Dvpanel_panelgeneral_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERAL_Collapsed")) ;
         Dvpanel_panelgeneral_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERAL_Showcollapseicon")) ;
         Dvpanel_panelgeneral_Iconposition = httpContext.cgiGet( "DVPANEL_PANELGENERAL_Iconposition") ;
         Dvpanel_panelgeneral_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERAL_Autoscroll")) ;
         Gxuitabspanel_tabs1_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_tabs1_Class = httpContext.cgiGet( "GXUITABSPANEL_TABS1_Class") ;
         Gxuitabspanel_tabs1_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Historymanagement")) ;
         subFsgrid1_Class = httpContext.cgiGet( "FSGRID1_Class") ;
         subFsgrid1_Flexdirection = httpContext.cgiGet( "FSGRID1_Flexdirection") ;
         Combo_parfascod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedvalue_get") ;
         Combo_hdr_Selectedvalue_get = httpContext.cgiGet( "COMBO_HDR_Selectedvalue_get") ;
         Combo_fascod_Selectedvalue_get = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_get") ;
         Combo_maqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_get") ;
         Combo_segundos_Selectedvalue_get = httpContext.cgiGet( "COMBO_SEGUNDOS_Selectedvalue_get") ;
         /* Read variables values. */
         AV29FueraRango = GXutil.strtobool( httpContext.cgiGet( chkavFuerarango.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29FueraRango", AV29FueraRango);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavDesdefechahora_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vDESDEFECHAHORA");
            GX_FocusControl = edtavDesdefechahora_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20DesdeFechaHora = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV20DesdeFechaHora", localUtil.ttoc( AV20DesdeFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV20DesdeFechaHora = localUtil.ctot( httpContext.cgiGet( edtavDesdefechahora_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20DesdeFechaHora", localUtil.ttoc( AV20DesdeFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHastafechahora_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHASTAFECHAHORA");
            GX_FocusControl = edtavHastafechahora_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV58HastaFechaHora = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV58HastaFechaHora", localUtil.ttoc( AV58HastaFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV58HastaFechaHora = localUtil.ctot( httpContext.cgiGet( edtavHastafechahora_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58HastaFechaHora", localUtil.ttoc( AV58HastaFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         AV132Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV132Pgmname", AV132Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSegundos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSegundos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSEGUNDOS");
            GX_FocusControl = edtavSegundos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV93Segundos = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Segundos), 6, 0));
         }
         else
         {
            AV93Segundos = (int)(localUtil.ctol( httpContext.cgiGet( edtavSegundos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Segundos), 6, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"MRec_AlertaMaquina");
         AV132Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV132Pgmname", AV132Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV132Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ingenieria\\mrec_alertamaquina:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e232E42 ();
      if (returnInSub) return;
   }

   public void e232E42( )
   {
      /* Start Routine */
      returnInSub = false ;
      if ( 0 == 2 )
      {
         new app.ingenieria.ming_init(remoteHandle, context).execute( ) ;
      }
      AV129Contador = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129Contador", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129Contador), 10, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV129Contador), "ZZZZZZZZZ9")));
      GXt_char1 = AV25EmprCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.vxparam_acaemp(remoteHandle, context).execute( GXv_char2) ;
      mrec_alertamaquina_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25EmprCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      if ( (GXutil.strcmp("", AV25EmprCod)==0) )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "No se encontró el parametro ACAEMP en parametros de GAIA", ""), "", "", "", "", "", "", "", "", ""), AV132Pgmname) ;
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "El parametro ACAEMP es %1", ""), AV25EmprCod, "", "", "", "", "", "", "", ""), AV132Pgmname) ;
      }
      AV12ContCod = httpContext.getMessage( "INGSIM", "") ;
      GXv_SdtWWPContext3[0] = AV106WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext3) ;
      AV106WWPContext = GXv_SdtWWPContext3[0] ;
      AV102UsurCod = AV106WWPContext.getgxTv_SdtWWPContext_Usurcod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102UsurCod", AV102UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102UsurCod, "@!"))));
      AV64Ip = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64Ip", AV64Ip);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64Ip, ""))));
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "&Ip:%1, &UsurCod:%2", ""), AV64Ip, AV102UsurCod, "", "", "", "", "", "", ""), AV132Pgmname) ;
      Uc_chrometer_Tickinterval = 60 ;
      ucUc_chrometer.sendProperty(context, "", false, Uc_chrometer_Internalname, "TickInterval", GXutil.ltrimstr( DecimalUtil.doubleToDec(Uc_chrometer_Tickinterval), 9, 0));
      this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABS1Container", "HideTab", "", new Object[] {Integer.valueOf(2)});
      AV93Segundos = 600 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Segundos), 6, 0));
      AV29FueraRango = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29FueraRango", AV29FueraRango);
      AV58HastaFechaHora = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58HastaFechaHora", localUtil.ttoc( AV58HastaFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV20DesdeFechaHora = GXutil.dtadd( AV58HastaFechaHora, 3600*(-6)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20DesdeFechaHora", localUtil.ttoc( AV20DesdeFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      divTablegeneral_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablegeneral_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablegeneral_Visible), 5, 0), true);
      divTabletabdetalle_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTabletabdetalle_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabletabdetalle_Visible), 5, 0), true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4 = AV18DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5[0] ;
      AV18DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4;
      edtavSegundos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSegundos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSegundos_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOSEGUNDOS' */
      S112 ();
      if (returnInSub) return;
      AV113BuscandoInFilSDT.fromJSonString(AV110WebSession.getValue("TexplusNET_FiltrosAlertaMaquina"), null);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "2026-09-29 parte 1 Filtros Session: ip:%1-%2, usuario:%3-%4, sdt:%5", ""), AV64Ip, AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Infilip(), AV102UsurCod, AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Infilusu(), AV113BuscandoInFilSDT.toJSonString(false, true), "", "", "", ""), AV132Pgmname) ;
      if ( ( GXutil.strcmp(AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Infilusu(), AV102UsurCod) == 0 ) && ( GXutil.strcmp(AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Infilip(), AV64Ip) == 0 ) )
      {
         AV93Segundos = AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Intervalo() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Segundos), 6, 0));
         Combo_segundos_Selectedtext_set = GXutil.trim( GXutil.str( AV93Segundos, 6, 0)) ;
         ucCombo_segundos.sendProperty(context, "", false, Combo_segundos_Internalname, "SelectedText_set", Combo_segundos_Selectedtext_set);
         /* Execute user subroutine: 'LOADCOMBOSEGUNDOS' */
         S112 ();
         if (returnInSub) return;
         AV75MaqCod.fromJSonString(AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Infilmaq(), null);
         AV26FasCod.fromJSonString(AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Infilfase(), null);
         Combo_maqcod_Selectedvalue_set = AV75MaqCod.toJSonString(false) ;
         ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
         Combo_fascod_Selectedvalue_set = AV26FasCod.toJSonString(false) ;
         ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
         AV20DesdeFechaHora = AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Infilfini() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20DesdeFechaHora", localUtil.ttoc( AV20DesdeFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV58HastaFechaHora = AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Infilffin() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58HastaFechaHora", localUtil.ttoc( AV58HastaFechaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV29FueraRango = AV113BuscandoInFilSDT.getgxTv_SdtInFilSDT_Infilerr() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29FueraRango", AV29FueraRango);
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "2026-09-29 parte 2 Filtros Session:Intervalo:%1, maquinas:%2, fases:%3, &Segundos=%4.", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Segundos), 6, 0), AV75MaqCod.toJSonString(false), AV26FasCod.toJSonString(false), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Segundos), 6, 0), "", "", "", "", ""), AV132Pgmname) ;
         if ( AV75MaqCod.size() > 0 )
         {
            /* Execute user subroutine: 'ORGANIZAR FILTRO' */
            S122 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
            S132 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADCOMBOFASCOD' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADCOMBOHDR' */
            S152 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADCOMBOPARFASCOD' */
            S162 ();
            if (returnInSub) return;
         }
         AV81MRasTxt = GXutil.format( httpContext.getMessage( "Filtros Session:Intervalo:%1, maquinas:%2, fases:%3. Ahora:%4", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Segundos), 6, 0), AV75MaqCod.toJSonString(false), AV26FasCod.toJSonString(false), localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", "", "", "") ;
         new app.ingenieria.crearrastro(remoteHandle, context).execute( AV102UsurCod, AV64Ip, AV103Version, AV132Pgmname, AV81MRasTxt) ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Evento start: inicio Actualizar pantalla", ""), "", "", "", "", "", "", "", "", ""), AV132Pgmname) ;
         /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
         S172 ();
         if (returnInSub) return;
         AV14CronometroStart = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14CronometroStart", AV14CronometroStart);
         /* Execute user subroutine: 'INICIARPARARCRONOMETRO' */
         S182 ();
         if (returnInSub) return;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Evento start: fin    Actualizar pantalla", ""), "", "", "", "", "", "", "", "", ""), AV132Pgmname) ;
      }
      if ( 1 == 0 )
      {
         GXt_char1 = AV116Station ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         mrec_alertamaquina_impl.this.GXt_char1 = GXv_char2[0] ;
         AV116Station = GXt_char1 ;
         GXv_char2[0] = AV25EmprCod ;
         GXv_char6[0] = AV117EmprNom ;
         GXv_char7[0] = AV102UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV116Station, GXv_char2, GXv_char6, GXv_char7) ;
         mrec_alertamaquina_impl.this.AV25EmprCod = GXv_char2[0] ;
         mrec_alertamaquina_impl.this.AV117EmprNom = GXv_char6[0] ;
         mrec_alertamaquina_impl.this.AV102UsurCod = GXv_char7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, "AV102UsurCod", AV102UsurCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102UsurCod, "@!"))));
         divPanelfiltros_Height = 50 ;
         httpContext.ajax_rsp_assign_prop("", false, divPanelfiltros_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divPanelfiltros_Height), 9, 0), true);
         GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4 = AV18DDO_TitleSettingsIcons;
         GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4;
         new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5) ;
         GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5[0] ;
         AV18DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4;
         edtavSegundos_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavSegundos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSegundos_Visible), 5, 0), true);
         /* Execute user subroutine: 'LOADCOMBOSEGUNDOS' */
         S112 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'LOADCOMBOFASCOD' */
         S142 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'LOADCOMBOHDR' */
         S152 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'LOADCOMBOPARFASCOD' */
         S162 ();
         if (returnInSub) return;
      }
      divPanelfiltros_Height = 50 ;
      httpContext.ajax_rsp_assign_prop("", false, divPanelfiltros_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divPanelfiltros_Height), 9, 0), true);
      divTablerango_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablerango_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablerango_Visible), 5, 0), true);
      if ( AV93Segundos == 999999 )
      {
         divTablerango_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, divTablerango_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablerango_Visible), 5, 0), true);
      }
   }

   private void e242E42( )
   {
      /* Fsgrid1_Load Routine */
      returnInSub = false ;
      AV129Contador = (long)(AV129Contador+1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129Contador", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129Contador), 10, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV129Contador), "ZZZZZZZZZ9")));
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "1. Inicia carga fsGrid1.Load contador:%1, maquinas:%2 ..SDT:%3.", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129Contador), 10, 0), AV79Maquinas.toJSonString(false), AV123MRec_AnalisisLineaSDT.toJSonString(false), "", "", "", "", "", ""), AV132Pgmname) ;
      AV127primeramaquina = true ;
      AV133GXV1 = 1 ;
      while ( AV133GXV1 <= AV79Maquinas.size() )
      {
         AV78Maquina = (app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV79Maquinas.elementAt(-1+AV133GXV1));
         AV124MaquinaMRec_AnalisisLineaSDT.clear();
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "3. Ejecuta .. fsGrid1.Load ingresa sdt ..%1--%2.", ""), GXutil.booltostr( AV127primeramaquina), AV78Maquina.getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod(), "", "", "", "", "", "", ""), AV132Pgmname) ;
         AV134GXV2 = 1 ;
         while ( AV134GXV2 <= AV123MRec_AnalisisLineaSDT.size() )
         {
            AV125Fila = (app.ingenieria.SdtMRec_AnalisisLineaSDT)((app.ingenieria.SdtMRec_AnalisisLineaSDT)AV123MRec_AnalisisLineaSDT.elementAt(-1+AV134GXV2));
            if ( GXutil.strcmp(AV125Fila.getgxTv_SdtMRec_AnalisisLineaSDT_Mrprmaqcod(), AV78Maquina.getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod()) == 0 )
            {
               AV124MaquinaMRec_AnalisisLineaSDT.add(AV125Fila, 0);
            }
            AV134GXV2 = (int)(AV134GXV2+1) ;
         }
         if ( AV124MaquinaMRec_AnalisisLineaSDT.size() > 0 )
         {
            if ( AV127primeramaquina )
            {
               AV127primeramaquina = false ;
               AV128PrimeraMaquinaMRec_AnalisisLineaSDT = AV124MaquinaMRec_AnalisisLineaSDT.Clone() ;
               new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "4. Ejecuta .. fsGrid1.Load encuentra PRIMERA maquina ..%1--%2----registros primera:%3 -- actual:%4.", ""), GXutil.booltostr( AV127primeramaquina), AV78Maquina.getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod(), GXutil.ltrimstr( AV128PrimeraMaquinaMRec_AnalisisLineaSDT.size(), 9, 0), GXutil.ltrimstr( AV124MaquinaMRec_AnalisisLineaSDT.size(), 9, 0), "", "", "", "", ""), AV132Pgmname) ;
            }
            new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "5. Ejecuta .. fsGrid1.Load carga maquina:%1, sdt:%2-----%3", ""), AV78Maquina.getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod(), GXutil.ltrimstr( AV124MaquinaMRec_AnalisisLineaSDT.size(), 9, 0), AV124MaquinaMRec_AnalisisLineaSDT.toJSonString(false), "", "", "", "", "", ""), AV132Pgmname) ;
            lblTbmaquina_Caption = GXutil.format( "%1--%2 (%3)", AV78Maquina.getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc(), GXutil.ltrimstr( AV124MaquinaMRec_AnalisisLineaSDT.size(), 9, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129Contador), 10, 0), "", "", "", "", "", "") ;
            Grafica_Datasource = AV124MaquinaMRec_AnalisisLineaSDT.toJSonString(false) ;
            ucGrafica.sendProperty(context, "", false, Grafica_Internalname, "DataSource", Grafica_Datasource);
            /* Load Method */
            if ( wbStart != -1 )
            {
               wbStart = (short)(109) ;
            }
            sendrow_1092( ) ;
            if ( isFullAjaxMode( ) && ! bGXsfl_109_Refreshing )
            {
               httpContext.doAjaxLoad(109, Fsgrid1Row);
            }
         }
         else
         {
            new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "8. Ejecuta .. fsGrid1.Load NO DATOS para maquina %1", ""), AV78Maquina.getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod(), "", "", "", "", "", "", "", ""), AV132Pgmname) ;
         }
         AV133GXV1 = (int)(AV133GXV1+1) ;
      }
      AV124MaquinaMRec_AnalisisLineaSDT = AV128PrimeraMaquinaMRec_AnalisisLineaSDT ;
      Grafica_Datasource = AV128PrimeraMaquinaMRec_AnalisisLineaSDT.toJSonString(false) ;
      ucGrafica.sendProperty(context, "", false, Grafica_Internalname, "DataSource", Grafica_Datasource);
      if ( 1 == 0 )
      {
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV128PrimeraMaquinaMRec_AnalisisLineaSDT", AV128PrimeraMaquinaMRec_AnalisisLineaSDT);
   }

   public void e182E42( )
   {
      /* 'DoCronometroStartStop' Routine */
      returnInSub = false ;
      AV14CronometroStart = (boolean)(!AV14CronometroStart) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CronometroStart", AV14CronometroStart);
      /* Execute user subroutine: 'INICIARPARARCRONOMETRO' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e192E42( )
   {
      /* 'DoActualizar' Routine */
      returnInSub = false ;
      lblActualizar_Class = httpContext.getMessage( "<i class='fas fa-circle' style='font-size: 20px; color:green; '></i>", "") ;
      httpContext.ajax_rsp_assign_prop("", false, lblActualizar_Internalname, "Class", lblActualizar_Class, true);
      lblActualizar_Jsonclick = httpContext.getMessage( "<i class='fas fa-circle' style='font-size: 20px; color:green; '></i>", "") ;
      httpContext.ajax_rsp_assign_prop("", false, lblActualizar_Internalname, "Jsonclick", lblActualizar_Jsonclick, true);
      /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
      S172 ();
      if (returnInSub) return;
      AV14CronometroStart = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CronometroStart", AV14CronometroStart);
      /* Execute user subroutine: 'INICIARPARARCRONOMETRO' */
      S182 ();
      if (returnInSub) return;
      this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABS1Container", "SelectTab", "", new Object[] {Integer.valueOf(1)});
      this.executeUsercontrolMethod("", false, "DVPANEL_PANELFILTROSContainer", "Collapse", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV107InFilSDT", AV107InFilSDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV123MRec_AnalisisLineaSDT", AV123MRec_AnalisisLineaSDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV79Maquinas", AV79Maquinas);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV75MaqCod", AV75MaqCod);
   }

   public void e152E42( )
   {
      /* Combo_parfascod_Onoptionclicked Routine */
      returnInSub = false ;
      AV14CronometroStart = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CronometroStart", AV14CronometroStart);
      /* Execute user subroutine: 'INICIARPARARCRONOMETRO' */
      S182 ();
      if (returnInSub) return;
      AV87ParFasCod.fromJSonString(Combo_parfascod_Selectedvalue_get, null);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV87ParFasCod", AV87ParFasCod);
   }

   public void e142E42( )
   {
      /* Combo_hdr_Onoptionclicked Routine */
      returnInSub = false ;
      AV59Hdr.fromJSonString(Combo_hdr_Selectedvalue_get, null);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "llamando a parametros", ""), "", "", "", "", "", "", "", "", ""), AV132Pgmname) ;
      /* Execute user subroutine: 'LOADCOMBOPARFASCOD' */
      S162 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59Hdr", AV59Hdr);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV88ParFasCod_Data", AV88ParFasCod_Data);
   }

   public void e132E42( )
   {
      /* Combo_fascod_Onoptionclicked Routine */
      returnInSub = false ;
      AV14CronometroStart = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CronometroStart", AV14CronometroStart);
      /* Execute user subroutine: 'INICIARPARARCRONOMETRO' */
      S182 ();
      if (returnInSub) return;
      AV26FasCod.fromJSonString(Combo_fascod_Selectedvalue_get, null);
      /* Execute user subroutine: 'LOADCOMBOHDR' */
      S152 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26FasCod", AV26FasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60Hdr_Data", AV60Hdr_Data);
   }

   public void e122E42( )
   {
      /* Combo_maqcod_Onoptionclicked Routine */
      returnInSub = false ;
      AV14CronometroStart = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CronometroStart", AV14CronometroStart);
      /* Execute user subroutine: 'INICIARPARARCRONOMETRO' */
      S182 ();
      if (returnInSub) return;
      AV75MaqCod.fromJSonString(Combo_maqcod_Selectedvalue_get, null);
      /* Execute user subroutine: 'LOADCOMBOFASCOD' */
      S142 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV75MaqCod", AV75MaqCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27FasCod_Data", AV27FasCod_Data);
   }

   public void e112E42( )
   {
      /* Combo_segundos_Onoptionclicked Routine */
      returnInSub = false ;
      AV93Segundos = (int)(GXutil.lval( Combo_segundos_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Segundos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Segundos), 6, 0));
      /* Execute user subroutine: 'SOLICITAR RANGO FECHA' */
      S192 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV107InFilSDT", AV107InFilSDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV75MaqCod", AV75MaqCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26FasCod", AV26FasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59Hdr", AV59Hdr);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV87ParFasCod", AV87ParFasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV76MaqCod_Data", AV76MaqCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27FasCod_Data", AV27FasCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60Hdr_Data", AV60Hdr_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV88ParFasCod_Data", AV88ParFasCod_Data);
   }

   public void S162( )
   {
      /* 'LOADCOMBOPARFASCOD' Routine */
      returnInSub = false ;
      AV88ParFasCod_Data.clear();
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Cargue Parametros: HDRs=%1, Fases:%2, Maquinas:%3.", ""), AV59Hdr.toJSonString(false), AV26FasCod.toJSonString(false), AV75MaqCod.toJSonString(false), "", "", "", "", "", ""), AV132Pgmname) ;
      if ( ( AV26FasCod.size() > 0 ) && ( AV75MaqCod.size() > 0 ) && ( AV59Hdr.size() > 0 ) )
      {
         AV135GXLvl291 = (byte)(0) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A14693MEPrMaqCod ,
                                              AV75MaqCod ,
                                              A14691MEPrFasCod ,
                                              AV26FasCod ,
                                              A14697MEPrHdr ,
                                              AV59Hdr ,
                                              A14700MEPrReg ,
                                              AV105Now ,
                                              A14698MEPrUsu ,
                                              AV102UsurCod ,
                                              A14699MEPrIp ,
                                              AV64Ip ,
                                              A14701MEPrTkn ,
                                              AV111InFilTkn ,
                                              A14702MEPrObj ,
                                              AV132Pgmname ,
                                              AV25EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor H02E42 */
         pr_default.execute(0, new Object[] {AV25EmprCod, AV105Now, AV102UsurCod, AV64Ip, AV111InFilTkn, AV132Pgmname});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A14702MEPrObj = H02E42_A14702MEPrObj[0] ;
            A14701MEPrTkn = H02E42_A14701MEPrTkn[0] ;
            A14700MEPrReg = H02E42_A14700MEPrReg[0] ;
            A14699MEPrIp = H02E42_A14699MEPrIp[0] ;
            A14698MEPrUsu = H02E42_A14698MEPrUsu[0] ;
            A14697MEPrHdr = H02E42_A14697MEPrHdr[0] ;
            A14691MEPrFasCod = H02E42_A14691MEPrFasCod[0] ;
            A14693MEPrMaqCod = H02E42_A14693MEPrMaqCod[0] ;
            A396EmprCod = H02E42_A396EmprCod[0] ;
            A14696MEPrParDsc = H02E42_A14696MEPrParDsc[0] ;
            A14695MEPrParCod = H02E42_A14695MEPrParCod[0] ;
            AV135GXLvl291 = (byte)(1) ;
            AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.str( A14695MEPrParCod, 4, 0) );
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.str( A14695MEPrParCod, 4, 0), GXutil.trim( A14696MEPrParDsc), "", "", "", "", "", "", "") );
            AV88ParFasCod_Data.add(AV11Combo_DataItem, 0);
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( AV135GXLvl291 == 0 )
         {
            AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "" );
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( "" );
            AV88ParFasCod_Data.add(AV11Combo_DataItem, 0);
         }
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Parametros %1.", ""), AV88ParFasCod_Data.toJSonString(false), "", "", "", "", "", "", "", ""), AV132Pgmname) ;
      }
      else
      {
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "" );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( "" );
         AV88ParFasCod_Data.add(AV11Combo_DataItem, 0);
      }
      AV88ParFasCod_Data.sort("Title");
      Combo_parfascod_Selectedvalue_set = AV87ParFasCod.toJSonString(false) ;
      ucCombo_parfascod.sendProperty(context, "", false, Combo_parfascod_Internalname, "SelectedValue_set", Combo_parfascod_Selectedvalue_set);
   }

   public void S152( )
   {
      /* 'LOADCOMBOHDR' Routine */
      returnInSub = false ;
      AV60Hdr_Data.clear();
      if ( ( AV26FasCod.size() > 0 ) && ( AV75MaqCod.size() > 0 ) )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "cargando HDR con fases:%1, maquinas:%2, empresa:%3.", ""), AV26FasCod.toJSonString(false), AV75MaqCod.toJSonString(false), AV25EmprCod, "", "", "", "", "", ""), AV132Pgmname) ;
         AV136GXLvl342 = (byte)(0) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A14691MEPrFasCod ,
                                              AV26FasCod ,
                                              A14693MEPrMaqCod ,
                                              AV75MaqCod ,
                                              A14700MEPrReg ,
                                              AV105Now ,
                                              A14698MEPrUsu ,
                                              AV102UsurCod ,
                                              A14699MEPrIp ,
                                              AV64Ip ,
                                              A14701MEPrTkn ,
                                              AV111InFilTkn ,
                                              A14702MEPrObj ,
                                              AV132Pgmname ,
                                              AV25EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor H02E43 */
         pr_default.execute(1, new Object[] {AV25EmprCod, AV105Now, AV102UsurCod, AV64Ip, AV111InFilTkn, AV132Pgmname});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A14702MEPrObj = H02E43_A14702MEPrObj[0] ;
            A14701MEPrTkn = H02E43_A14701MEPrTkn[0] ;
            A14700MEPrReg = H02E43_A14700MEPrReg[0] ;
            A14699MEPrIp = H02E43_A14699MEPrIp[0] ;
            A14698MEPrUsu = H02E43_A14698MEPrUsu[0] ;
            A14693MEPrMaqCod = H02E43_A14693MEPrMaqCod[0] ;
            A14691MEPrFasCod = H02E43_A14691MEPrFasCod[0] ;
            A396EmprCod = H02E43_A396EmprCod[0] ;
            A14697MEPrHdr = H02E43_A14697MEPrHdr[0] ;
            A130BarCodPar = H02E43_A130BarCodPar[0] ;
            A132BarCodReo = H02E43_A132BarCodReo[0] ;
            A129BarCod = H02E43_A129BarCod[0] ;
            AV136GXLvl342 = (byte)(1) ;
            AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.format( "%1%2%3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0), GXutil.str( A132BarCodReo, 1, 0), A130BarCodPar, "", "", "", "", "", "") );
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1%2%3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0), GXutil.str( A132BarCodReo, 1, 0), A130BarCodPar, "", "", "", "", "", "") );
            AV60Hdr_Data.add(AV11Combo_DataItem, 0);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV136GXLvl342 == 0 )
         {
            AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "" );
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( "" );
            AV60Hdr_Data.add(AV11Combo_DataItem, 0);
         }
      }
      else
      {
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "" );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( "" );
         AV60Hdr_Data.add(AV11Combo_DataItem, 0);
      }
      AV60Hdr_Data.sort("Title");
      Combo_hdr_Selectedvalue_set = AV59Hdr.toJSonString(false) ;
      ucCombo_hdr.sendProperty(context, "", false, Combo_hdr_Internalname, "SelectedValue_set", Combo_hdr_Selectedvalue_set);
   }

   public void S142( )
   {
      /* 'LOADCOMBOFASCOD' Routine */
      returnInSub = false ;
      AV27FasCod_Data.clear();
      if ( AV75MaqCod.size() > 0 )
      {
         AV137GXLvl387 = (byte)(0) ;
         pr_default.dynParam(2, new Object[]{ new Object[]{
                                              A14693MEPrMaqCod ,
                                              AV75MaqCod ,
                                              A14700MEPrReg ,
                                              AV105Now ,
                                              A14698MEPrUsu ,
                                              AV102UsurCod ,
                                              A14699MEPrIp ,
                                              AV64Ip ,
                                              A14701MEPrTkn ,
                                              AV111InFilTkn ,
                                              A14702MEPrObj ,
                                              AV132Pgmname ,
                                              AV25EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor H02E44 */
         pr_default.execute(2, new Object[] {AV25EmprCod, AV105Now, AV102UsurCod, AV64Ip, AV111InFilTkn, AV132Pgmname});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A14702MEPrObj = H02E44_A14702MEPrObj[0] ;
            A14701MEPrTkn = H02E44_A14701MEPrTkn[0] ;
            A14700MEPrReg = H02E44_A14700MEPrReg[0] ;
            A14699MEPrIp = H02E44_A14699MEPrIp[0] ;
            A14698MEPrUsu = H02E44_A14698MEPrUsu[0] ;
            A14693MEPrMaqCod = H02E44_A14693MEPrMaqCod[0] ;
            A396EmprCod = H02E44_A396EmprCod[0] ;
            A14692MEPrFasDsc = H02E44_A14692MEPrFasDsc[0] ;
            A14691MEPrFasCod = H02E44_A14691MEPrFasCod[0] ;
            AV137GXLvl387 = (byte)(1) ;
            AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A14691MEPrFasCod );
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", A14691MEPrFasCod, A14692MEPrFasDsc, "", "", "", "", "", "", "") );
            AV27FasCod_Data.add(AV11Combo_DataItem, 0);
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( AV137GXLvl387 == 0 )
         {
            AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "" );
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( "" );
            AV27FasCod_Data.add(AV11Combo_DataItem, 0);
         }
      }
      else
      {
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "" );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( "" );
         AV27FasCod_Data.add(AV11Combo_DataItem, 0);
      }
      AV27FasCod_Data.sort("Title");
      Combo_fascod_Selectedvalue_set = AV26FasCod.toJSonString(false) ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOMAQCOD' Routine */
      returnInSub = false ;
      AV76MaqCod_Data.clear();
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "LoadComboMaqCod ANTES: &EmprCod:%1, &UsurCod:%2, &Ip:%3, &Now:%4, &InFilTkn:%5", ""), AV25EmprCod, AV102UsurCod, AV64Ip, localUtil.ttoc( AV105Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV111InFilTkn, "", "", "", "")) ;
      AV138GXLvl429 = (byte)(0) ;
      /* Using cursor H02E45 */
      pr_default.execute(3, new Object[] {AV25EmprCod, AV105Now, AV102UsurCod, AV64Ip, AV111InFilTkn, AV132Pgmname});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A14702MEPrObj = H02E45_A14702MEPrObj[0] ;
         A14701MEPrTkn = H02E45_A14701MEPrTkn[0] ;
         A14700MEPrReg = H02E45_A14700MEPrReg[0] ;
         A14699MEPrIp = H02E45_A14699MEPrIp[0] ;
         A14698MEPrUsu = H02E45_A14698MEPrUsu[0] ;
         A396EmprCod = H02E45_A396EmprCod[0] ;
         A14694MEPrMaqDsc = H02E45_A14694MEPrMaqDsc[0] ;
         A14693MEPrMaqCod = H02E45_A14693MEPrMaqCod[0] ;
         AV138GXLvl429 = (byte)(1) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A14693MEPrMaqCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", A14693MEPrMaqCod, GXutil.trim( A14694MEPrMaqDsc), "", "", "", "", "", "", "") );
         AV76MaqCod_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV138GXLvl429 == 0 )
      {
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "" );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( "" );
         AV76MaqCod_Data.add(AV11Combo_DataItem, 0);
      }
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "LoadComboMaqCod Sale:&MaqCod_Data:%1, &MaqCod:%2", ""), AV76MaqCod_Data.toJSonString(false), AV75MaqCod.toJSonString(false), "", "", "", "", "", "", ""), AV132Pgmname) ;
      AV76MaqCod_Data.sort("Title");
      Combo_maqcod_Selectedvalue_set = AV75MaqCod.toJSonString(false) ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOSEGUNDOS' Routine */
      returnInSub = false ;
      AV94Segundos_Data.clear();
      AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "300" );
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "5 m", ""), "", "", "", "", "", "", "", "", "") );
      AV94Segundos_Data.add(AV11Combo_DataItem, 0);
      AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "600" );
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "10 m", ""), "", "", "", "", "", "", "", "", "") );
      AV94Segundos_Data.add(AV11Combo_DataItem, 0);
      AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "900" );
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "15 m", ""), "", "", "", "", "", "", "", "", "") );
      AV94Segundos_Data.add(AV11Combo_DataItem, 0);
      AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "1200" );
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "20 m", ""), "", "", "", "", "", "", "", "", "") );
      AV94Segundos_Data.add(AV11Combo_DataItem, 0);
      AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "1500" );
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "25 m", ""), "", "", "", "", "", "", "", "", "") );
      AV94Segundos_Data.add(AV11Combo_DataItem, 0);
      AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "1800" );
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "30 m", ""), "", "", "", "", "", "", "", "", "") );
      AV94Segundos_Data.add(AV11Combo_DataItem, 0);
      AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "2700" );
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "45 m", ""), "", "", "", "", "", "", "", "", "") );
      AV94Segundos_Data.add(AV11Combo_DataItem, 0);
      AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "3600" );
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "1 h", ""), "", "", "", "", "", "", "", "", "") );
      AV94Segundos_Data.add(AV11Combo_DataItem, 0);
      AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "7200" );
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "2 h", ""), "", "", "", "", "", "", "", "", "") );
      AV94Segundos_Data.add(AV11Combo_DataItem, 0);
      AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( "999999" );
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( httpContext.getMessage( "Rango", ""), "", "", "", "", "", "", "", "", "") );
      AV94Segundos_Data.add(AV11Combo_DataItem, 0);
      Combo_segundos_Selectedvalue_set = ((0==AV93Segundos) ? "" : GXutil.trim( GXutil.str( AV93Segundos, 6, 0))) ;
      ucCombo_segundos.sendProperty(context, "", false, Combo_segundos_Internalname, "SelectedValue_set", Combo_segundos_Selectedvalue_set);
   }

   public void e202E42( )
   {
      /* Segundos_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SOLICITAR RANGO FECHA' */
      S192 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV107InFilSDT", AV107InFilSDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV75MaqCod", AV75MaqCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26FasCod", AV26FasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59Hdr", AV59Hdr);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV87ParFasCod", AV87ParFasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV76MaqCod_Data", AV76MaqCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27FasCod_Data", AV27FasCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60Hdr_Data", AV60Hdr_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV88ParFasCod_Data", AV88ParFasCod_Data);
   }

   public void e162E42( )
   {
      /* Uc_chrometer_Tick Routine */
      returnInSub = false ;
      if ( AV75MaqCod.size() > 0 )
      {
         /* Execute user subroutine: 'LIMPIAR FILTROS' */
         S202 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'ACTUALIZAR PANTALLA' */
      S172 ();
      if (returnInSub) return;
      httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Actualizada consulta %1", ""), localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", "", "", "", "", "", ""));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV75MaqCod", AV75MaqCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26FasCod", AV26FasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59Hdr", AV59Hdr);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV87ParFasCod", AV87ParFasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV107InFilSDT", AV107InFilSDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV123MRec_AnalisisLineaSDT", AV123MRec_AnalisisLineaSDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV76MaqCod_Data", AV76MaqCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27FasCod_Data", AV27FasCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60Hdr_Data", AV60Hdr_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV88ParFasCod_Data", AV88ParFasCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV79Maquinas", AV79Maquinas);
   }

   public void e212E42( )
   {
      /* Desdefechahora_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ORGANIZAR FILTRO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LIMPIAR FILTROS' */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S132 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV107InFilSDT", AV107InFilSDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV75MaqCod", AV75MaqCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26FasCod", AV26FasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59Hdr", AV59Hdr);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV87ParFasCod", AV87ParFasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV76MaqCod_Data", AV76MaqCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27FasCod_Data", AV27FasCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60Hdr_Data", AV60Hdr_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV88ParFasCod_Data", AV88ParFasCod_Data);
   }

   public void e222E42( )
   {
      /* Hastafechahora_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ORGANIZAR FILTRO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LIMPIAR FILTROS' */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S132 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV107InFilSDT", AV107InFilSDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV75MaqCod", AV75MaqCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26FasCod", AV26FasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59Hdr", AV59Hdr);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV87ParFasCod", AV87ParFasCod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV76MaqCod_Data", AV76MaqCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27FasCod_Data", AV27FasCod_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60Hdr_Data", AV60Hdr_Data);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV88ParFasCod_Data", AV88ParFasCod_Data);
   }

   public void e172E42( )
   {
      /* Dvpanel_panelfiltros_Ontitleclick Routine */
      returnInSub = false ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "ejecuta el evento DVPanel_PanelFiltros.OnTitleClick", ""), "", "", "", "", "", "", "", "", ""), AV132Pgmname) ;
   }

   public void e252E42( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "ejecuta el evento Refresh %1", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129Contador), 10, 0), "", "", "", "", "", "", "", ""), AV132Pgmname) ;
   }

   public void S172( )
   {
      /* 'ACTUALIZAR PANTALLA' Routine */
      returnInSub = false ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "INICIA contador:%2 ..Do Actualizar pantalla ... con valor:%1. maquinas:%3.", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Segundos), 6, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129Contador), 10, 0), AV75MaqCod.toJSonString(false), "", "", "", "", "", ""), AV132Pgmname) ;
      lblTitulogeneral_Caption = GXutil.format( httpContext.getMessage( "%7Actualizando", ""), httpContext.getMessage( "<i class='fa fa-search' style='color:red; '></i>", ""), "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, lblTitulogeneral_Internalname, "Caption", lblTitulogeneral_Caption, true);
      divTablegeneral_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablegeneral_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablegeneral_Visible), 5, 0), true);
      divTabletabdetalle_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTabletabdetalle_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabletabdetalle_Visible), 5, 0), true);
      if ( ! ( AV93Segundos > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Recuerda seleccionar Intervalo", ""));
      }
      else
      {
         AV121Titulo = GXutil.format( httpContext.getMessage( "Actualizando Intervalo:%1--%2, Maquinas:%3, Fases:%4, HDRs:%5.", ""), localUtil.ttoc( AV19Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV57Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV75MaqCod.toJSonString(false), AV26FasCod.toJSonString(false), AV59Hdr.toJSonString(false), "", "", "", "") ;
         /* Execute user subroutine: 'IDENTIFICARINTERVALOTIEMPO' */
         S212 ();
         if (returnInSub) return;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "aplica con &Segundos:%1, &Desde:%2, &Hasta:%3.", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Segundos), 6, 0), localUtil.ttoc( AV19Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV57Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", "", "", "", ""), AV132Pgmname) ;
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilusu( AV102UsurCod );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilip( AV64Ip );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilobj( AV132Pgmname );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilfreg( AV105Now );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilfini( AV19Desde );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilffin( AV57Hasta );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilmaq( AV75MaqCod.toJSonString(false) );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilfase( AV26FasCod.toJSonString(false) );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilhdr( AV59Hdr.toJSonString(false) );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilpar( AV87ParFasCod.toJSonString(false) );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilerr( AV29FueraRango );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilemp( AV25EmprCod );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infiltkn( " " );
         GXt_boolean8 = AV108ExisteFiltro ;
         GXv_int9[0] = AV109InFilId ;
         GXv_char7[0] = AV111InFilTkn ;
         GXv_boolean10[0] = GXt_boolean8 ;
         new app.ingenieria.crearfiltro(remoteHandle, context).execute( AV107InFilSDT, GXv_int9, GXv_char7, GXv_boolean10) ;
         mrec_alertamaquina_impl.this.AV109InFilId = GXv_int9[0] ;
         mrec_alertamaquina_impl.this.AV111InFilTkn = GXv_char7[0] ;
         mrec_alertamaquina_impl.this.GXt_boolean8 = GXv_boolean10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV111InFilTkn", AV111InFilTkn);
         AV108ExisteFiltro = GXt_boolean8 ;
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infilid( AV109InFilId );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Infiltkn( AV111InFilTkn );
         AV107InFilSDT.setgxTv_SdtInFilSDT_Intervalo( AV93Segundos );
         AV110WebSession.setValue("TexplusNET_FiltrosAlertaMaquina", AV107InFilSDT.toJSonString(false, true));
         /* Execute user subroutine: 'ORGANIZAR MAQUINAS' */
         S222 ();
         if (returnInSub) return;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "paso 2 organizar maquinas %1 .. ip:%2, Usuario:%3.", ""), AV75MaqCod.toJSonString(false), AV107InFilSDT.getgxTv_SdtInFilSDT_Infilip(), AV107InFilSDT.getgxTv_SdtInFilSDT_Infilusu(), "", "", "", "", "", ""), AV132Pgmname) ;
         AV124MaquinaMRec_AnalisisLineaSDT.clear();
         AV123MRec_AnalisisLineaSDT.clear();
         GXt_objcol_SdtMRec_AnalisisLineaSDT11 = AV123MRec_AnalisisLineaSDT ;
         GXv_objcol_SdtMRec_AnalisisLineaSDT12[0] = GXt_objcol_SdtMRec_AnalisisLineaSDT11 ;
         new app.ingenieria.mrec_alertamaquinadp_v2(remoteHandle, context).execute( AV25EmprCod, AV19Desde, AV57Hasta, AV75MaqCod, AV26FasCod, AV59Hdr, AV87ParFasCod, AV29FueraRango, AV102UsurCod, AV64Ip, AV105Now, AV111InFilTkn, (byte)(1), GXv_objcol_SdtMRec_AnalisisLineaSDT12) ;
         GXt_objcol_SdtMRec_AnalisisLineaSDT11 = GXv_objcol_SdtMRec_AnalisisLineaSDT12[0] ;
         AV123MRec_AnalisisLineaSDT = GXt_objcol_SdtMRec_AnalisisLineaSDT11 ;
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Despues Grafica MRec_AnalisisDP_v2 con: &MRec_AnalisisLineaSDT=%1.", ""), AV123MRec_AnalisisLineaSDT.toJSonString(false), "", "", "", "", "", "", "", ""), AV132Pgmname) ;
         lblTitulogeneral_Caption = GXutil.format( httpContext.getMessage( "%7Actualizado a:%8, con el Intervalo:%1, Maquinas:%2, Fases:%3, Hdrs:%4, Parametro:%5, Error:%6.", ""), GXutil.format( " %1 (%2-%3) ", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Segundos), 6, 0), localUtil.ttoc( AV19Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.ttoc( AV57Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "", "", "", "", "", ""), AV75MaqCod.toJSonString(false), AV26FasCod.toJSonString(false), AV59Hdr.toJSonString(false), AV87ParFasCod.toJSonString(false), GXutil.booltostr( AV29FueraRango), httpContext.getMessage( "<i class='fa fa-search' style='color:green; '></i>", ""), localUtil.ttoc( AV105Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTitulogeneral_Internalname, "Caption", lblTitulogeneral_Caption, true);
         divTablegeneral_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, divTablegeneral_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablegeneral_Visible), 5, 0), true);
         divTabletabdetalle_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, divTabletabdetalle_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabletabdetalle_Visible), 5, 0), true);
         this.executeUsercontrolMethod("", false, "GXUITABSPANEL_TABS1Container", "SelectTab", "", new Object[] {Integer.valueOf(1)});
         this.executeUsercontrolMethod("", false, "DVPANEL_PANELFILTROSContainer", "Collapse", "", new Object[] {});
         gxgrfsgrid1_refresh( AV129Contador, AV132Pgmname, AV79Maquinas, AV123MRec_AnalisisLineaSDT, AV128PrimeraMaquinaMRec_AnalisisLineaSDT, AV29FueraRango, AV102UsurCod, AV64Ip, AV25EmprCod) ;
      }
   }

   public void S182( )
   {
      /* 'INICIARPARARCRONOMETRO' Routine */
      returnInSub = false ;
      if ( AV14CronometroStart )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Inicia   (%2)  ----IniciarPararCronometro:%3 a las %1", ""), localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129Contador), 10, 0), GXutil.booltostr( AV14CronometroStart), "", "", "", "", "", ""), AV132Pgmname) ;
         this.executeUsercontrolMethod("", false, "UC_CHROMETERContainer", "Start", "", new Object[] {});
         lblCronometrostartstop_Caption = httpContext.getMessage( "<i class=\"fas fa-play fa-2x\"></i>", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblCronometrostartstop_Internalname, "Caption", lblCronometrostartstop_Caption, true);
         lblTbmensajeactualizar_Caption = "" ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmensajeactualizar_Internalname, "Caption", lblTbmensajeactualizar_Caption, true);
      }
      else
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Parar    (%2)  ----IniciarPararCronometro:%3 a las %1", ""), localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129Contador), 10, 0), GXutil.booltostr( AV14CronometroStart), "", "", "", "", "", ""), AV132Pgmname) ;
         this.executeUsercontrolMethod("", false, "UC_CHROMETERContainer", "Stop", "", new Object[] {});
         lblCronometrostartstop_Caption = httpContext.getMessage( "<i class=\"fas fa-pause fa-2x\"></i>", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblCronometrostartstop_Internalname, "Caption", lblCronometrostartstop_Caption, true);
         lblTbmensajeactualizar_Caption = GXutil.format( httpContext.getMessage( "Cronómetro parado ó filtros cambiados, Activar cronometro %1 ó clic en actualizar %2 para activarlos...", ""), httpContext.getMessage( "<i class=\"fas fa-play\"></i>", ""), httpContext.getMessage( "<i class='fa fa-search' style='color:gray; '></i>", ""), "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmensajeactualizar_Internalname, "Caption", lblTbmensajeactualizar_Caption, true);
      }
   }

   public void S192( )
   {
      /* 'SOLICITAR RANGO FECHA' Routine */
      returnInSub = false ;
      divTablerango_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablerango_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablerango_Visible), 5, 0), true);
      if ( AV93Segundos == 999999 )
      {
         divTablerango_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, divTablerango_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablerango_Visible), 5, 0), true);
      }
      AV14CronometroStart = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CronometroStart", AV14CronometroStart);
      /* Execute user subroutine: 'INICIARPARARCRONOMETRO' */
      S182 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ORGANIZAR FILTRO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LIMPIAR FILTROS' */
      S202 ();
      if (returnInSub) return;
   }

   public void S122( )
   {
      /* 'ORGANIZAR FILTRO' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'IDENTIFICARINTERVALOTIEMPO' */
      S212 ();
      if (returnInSub) return;
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilusu( AV102UsurCod );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilip( AV64Ip );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilobj( AV132Pgmname );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilfreg( AV105Now );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilfini( AV19Desde );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilffin( AV57Hasta );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilmaq( " " );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilfase( " " );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilhdr( " " );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilpar( " " );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilerr( false );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilemp( AV25EmprCod );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infiltkn( " " );
      GXt_boolean8 = AV108ExisteFiltro ;
      GXv_int9[0] = AV109InFilId ;
      GXv_char7[0] = AV111InFilTkn ;
      GXv_boolean10[0] = GXt_boolean8 ;
      new app.ingenieria.crearfiltro(remoteHandle, context).execute( AV107InFilSDT, GXv_int9, GXv_char7, GXv_boolean10) ;
      mrec_alertamaquina_impl.this.AV109InFilId = GXv_int9[0] ;
      mrec_alertamaquina_impl.this.AV111InFilTkn = GXv_char7[0] ;
      mrec_alertamaquina_impl.this.GXt_boolean8 = GXv_boolean10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111InFilTkn", AV111InFilTkn);
      AV108ExisteFiltro = GXt_boolean8 ;
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infilid( AV109InFilId );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Infiltkn( AV111InFilTkn );
      AV107InFilSDT.setgxTv_SdtInFilSDT_Intervalo( AV93Segundos );
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Solicita Intervalo: %1--%2 y crea filtro: %3", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Segundos), 6, 0), localUtil.ttoc( AV105Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), AV107InFilSDT.toJSonString(false, true), "", "", "", "", "", ""), AV132Pgmname) ;
   }

   public void S202( )
   {
      /* 'LIMPIAR FILTROS' Routine */
      returnInSub = false ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "ejecuta rutina Limpiar Filtros %1", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129Contador), 10, 0), "", "", "", "", "", "", "", ""), AV132Pgmname) ;
      AV75MaqCod.clear();
      Combo_maqcod_Selectedvalue_set = " " ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
      Combo_maqcod_Selectedvalue_set = AV75MaqCod.toJSonString(false) ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
      AV26FasCod.clear();
      Combo_fascod_Selectedvalue_set = AV26FasCod.toJSonString(false) ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
      AV59Hdr.clear();
      Combo_hdr_Selectedvalue_set = AV59Hdr.toJSonString(false) ;
      ucCombo_hdr.sendProperty(context, "", false, Combo_hdr_Internalname, "SelectedValue_set", Combo_hdr_Selectedvalue_set);
      AV87ParFasCod.clear();
      Combo_parfascod_Selectedvalue_set = AV87ParFasCod.toJSonString(false) ;
      ucCombo_parfascod.sendProperty(context, "", false, Combo_parfascod_Internalname, "SelectedValue_set", Combo_parfascod_Selectedvalue_set);
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOFASCOD' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOHDR' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOPARFASCOD' */
      S162 ();
      if (returnInSub) return;
      divTablegeneral_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablegeneral_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablegeneral_Visible), 5, 0), true);
      divTabletabdetalle_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTabletabdetalle_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabletabdetalle_Visible), 5, 0), true);
   }

   public void S222( )
   {
      /* 'ORGANIZAR MAQUINAS' Routine */
      returnInSub = false ;
      AV79Maquinas.clear();
      AV75MaqCod.clear();
      /* Using cursor H02E46 */
      pr_default.execute(4, new Object[] {AV25EmprCod, AV105Now, AV102UsurCod, AV64Ip, AV111InFilTkn, AV132Pgmname});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A14702MEPrObj = H02E46_A14702MEPrObj[0] ;
         A14701MEPrTkn = H02E46_A14701MEPrTkn[0] ;
         A14700MEPrReg = H02E46_A14700MEPrReg[0] ;
         A14699MEPrIp = H02E46_A14699MEPrIp[0] ;
         A14698MEPrUsu = H02E46_A14698MEPrUsu[0] ;
         A396EmprCod = H02E46_A396EmprCod[0] ;
         A14694MEPrMaqDsc = H02E46_A14694MEPrMaqDsc[0] ;
         A14693MEPrMaqCod = H02E46_A14693MEPrMaqCod[0] ;
         AV78Maquina = (app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)new app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item(remoteHandle, context);
         AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Emprcod( A396EmprCod );
         AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcod( 0 );
         AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodreo( (byte)(0) );
         AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Barcodpar( "" );
         AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Menvord( (short)(0) );
         AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Mreclin( 0 );
         AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod( A14693MEPrMaqCod );
         AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqdsc( GXutil.format( "%1-%2", A14693MEPrMaqCod, GXutil.trim( A14694MEPrMaqDsc), "", "", "", "", "", "", "") );
         AV78Maquina.setgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqerr( DecimalUtil.doubleToDec(0) );
         AV79Maquinas.add(AV78Maquina, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV79Maquinas.sort(httpContext.getMessage( "MaqDsc", ""));
      AV140GXV3 = 1 ;
      while ( AV140GXV3 <= AV79Maquinas.size() )
      {
         AV78Maquina = (app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)((app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item)AV79Maquinas.elementAt(-1+AV140GXV3));
         AV75MaqCod.add(AV78Maquina.getgxTv_SdtMRec_AlertaMaquinaSDT_Item_Maqcod(), 0);
         AV140GXV3 = (int)(AV140GXV3+1) ;
      }
   }

   public void S212( )
   {
      /* 'IDENTIFICARINTERVALOTIEMPO' Routine */
      returnInSub = false ;
      AV105Now = GXutil.serverNowMs( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105Now", localUtil.ttoc( AV105Now, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      if ( AV93Segundos == 999999 )
      {
         AV19Desde = AV20DesdeFechaHora ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Desde", localUtil.ttoc( AV19Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV57Hasta = (AV58HastaFechaHora.after(AV105Now) ? GXutil.dtadd( AV105Now, -30) : AV58HastaFechaHora) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57Hasta", localUtil.ttoc( AV57Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         if ( AV57Hasta.before( AV19Desde ) )
         {
            AV19Desde = GXutil.dtadd( AV57Hasta, 60*(-2)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Desde", localUtil.ttoc( AV19Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
      }
      else
      {
         AV104SegundosMenos = (int)(AV93Segundos*-1) ;
         AV19Desde = GXutil.dtadd( AV105Now, AV104SegundosMenos) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Desde", localUtil.ttoc( AV19Desde, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV57Hasta = GXutil.dtadd( AV105Now, -30) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57Hasta", localUtil.ttoc( AV57Hasta, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
   }

   public void wb_table1_76_2E42( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedcronometrostartstop_Internalname, tblTablemergedcronometrostartstop_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblCronometrostartstop_Internalname, lblCronometrostartstop_Caption, "", "", lblCronometrostartstop_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOCRONOMETROSTARTSTOP\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "Iniciar / parar actualización automática de datos", ""), 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_AlertaMaquina.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmensajeactualizar_Internalname, lblTbmensajeactualizar_Caption, "", "", lblTbmensajeactualizar_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Ingenieria\\MRec_AlertaMaquina.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_76_2E42e( true) ;
      }
      else
      {
         wb_table1_76_2E42e( false) ;
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
      pa2E42( ) ;
      ws2E42( ) ;
      we2E42( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcmrec_detalle == null ) )
      {
         WebComp_Wcmrec_detalle.componentthemes();
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261017453310", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/mrec_alertamaquina.js", "?20261017453312", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Chronometer/ChronometerRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/Ingenieria.GraficaAlertaUCRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1092( )
   {
      lblImgcircle_Internalname = "IMGCIRCLE_"+sGXsfl_109_idx ;
      lblTbmaquina_Internalname = "TBMAQUINA_"+sGXsfl_109_idx ;
      Grafica_Internalname = "GRAFICA_"+sGXsfl_109_idx ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1_"+sGXsfl_109_idx ;
   }

   public void subsflControlProps_fel_1092( )
   {
      lblImgcircle_Internalname = "IMGCIRCLE_"+sGXsfl_109_fel_idx ;
      lblTbmaquina_Internalname = "TBMAQUINA_"+sGXsfl_109_fel_idx ;
      Grafica_Internalname = "GRAFICA_"+sGXsfl_109_fel_idx ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1_"+sGXsfl_109_fel_idx ;
   }

   public void sendrow_1092( )
   {
      subsflControlProps_1092( ) ;
      wb2E40( ) ;
      Fsgrid1Row = GXWebRow.GetNew(context,Fsgrid1Container) ;
      if ( subFsgrid1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subFsgrid1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subFsgrid1_Class, "") != 0 )
         {
            subFsgrid1_Linesclass = subFsgrid1_Class+"Odd" ;
         }
      }
      else if ( subFsgrid1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subFsgrid1_Backstyle = (byte)(0) ;
         subFsgrid1_Backcolor = subFsgrid1_Allbackcolor ;
         if ( GXutil.strcmp(subFsgrid1_Class, "") != 0 )
         {
            subFsgrid1_Linesclass = subFsgrid1_Class+"Uniform" ;
         }
      }
      else if ( subFsgrid1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subFsgrid1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subFsgrid1_Class, "") != 0 )
         {
            subFsgrid1_Linesclass = subFsgrid1_Class+"Odd" ;
         }
         subFsgrid1_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subFsgrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subFsgrid1_Backstyle = (byte)(1) ;
         subFsgrid1_Backcolor = (int)(0xFFFFFF) ;
         if ( GXutil.strcmp(subFsgrid1_Class, "") != 0 )
         {
            subFsgrid1_Linesclass = subFsgrid1_Class+"Odd" ;
         }
      }
      /* Start of Columns property logic. */
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divFsgrid1layouttable_Internalname+"_"+sGXsfl_109_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 CellMarginLeft CellMarginBottom","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* User Defined Control */
      Fsgrid1Row.AddColumnProperties("usercontrol", -1, isAjaxCallMode( ), new Object[] {"DVPANEL_UNNAMEDTABLE1Container"+"_"+sGXsfl_109_idx,Integer.valueOf(-1)});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("usercontrolcontainer", -1, isAjaxCallMode( ), new Object[] {"DVPANEL_UNNAMEDTABLE1Container","UnnamedTable1"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtable1_Internalname+"_"+sGXsfl_109_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTablemaquina_Internalname+"_"+sGXsfl_109_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-6","Right","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Text block */
      Fsgrid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblImgcircle_Internalname,httpContext.getMessage( "<i class='fas fa-circle' style='font-size: 20px'></i>", ""),"","",lblImgcircle_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(2)});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"Right","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-6","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Text block */
      Fsgrid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTbmaquina_Internalname,lblTbmaquina_Caption,"","",lblTbmaquina_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(1)});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTablegraficas_Internalname+"_"+sGXsfl_109_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* Div Control */
      Fsgrid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      /* User Defined Control */
      Fsgrid1Row.AddColumnProperties("usercontrol", -1, isAjaxCallMode( ), new Object[] {"GRAFICAContainer"+"_"+sGXsfl_109_idx,Integer.valueOf(-1)});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      Fsgrid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Fsgrid1Row.AddRenderProperties(Fsgrid1Column);
      send_integrity_lvl_hashes2E42( ) ;
      GXCCtl = "GRAFICA_Datasource_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Grafica_Datasource));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Width_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autowidth_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoheight_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Cls_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Title_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsible_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Collapsed_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Showcollapseicon_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Iconposition_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      GXCCtl = "DVPANEL_UNNAMEDTABLE1_Autoscroll_" + sGXsfl_109_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      /* End of Columns property logic. */
      Fsgrid1Container.AddRow(Fsgrid1Row);
      nGXsfl_109_idx = ((subFsgrid1_Islastpage==1)&&(nGXsfl_109_idx+1>subfsgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_109_idx+1) ;
      sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1092( ) ;
      /* End function sendrow_1092 */
   }

   public void startgridcontrol109( )
   {
      if ( Fsgrid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Fsgrid1Container"+"DivS\" data-gxgridid=\"109\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subFsgrid1_Internalname, subFsgrid1_Internalname, "", "FreeStyleGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
         Fsgrid1Container.AddObjectProperty("GridName", "Fsgrid1");
      }
      else
      {
         Fsgrid1Container.AddObjectProperty("GridName", "Fsgrid1");
         Fsgrid1Container.AddObjectProperty("Header", subFsgrid1_Header);
         Fsgrid1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
         Fsgrid1Container.AddObjectProperty("Class", "FreeStyleGrid");
         Fsgrid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("CmpContext", "");
         Fsgrid1Container.AddObjectProperty("InMasterPage", "false");
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Fsgrid1Container.AddColumnProperties(Fsgrid1Column);
         Fsgrid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Fsgrid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subFsgrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      lblTextblockcombo_segundos_Internalname = "TEXTBLOCKCOMBO_SEGUNDOS" ;
      Combo_segundos_Internalname = "COMBO_SEGUNDOS" ;
      divTablesplittedsegundos_Internalname = "TABLESPLITTEDSEGUNDOS" ;
      lblTextblockcombo_maqcod_Internalname = "TEXTBLOCKCOMBO_MAQCOD" ;
      Combo_maqcod_Internalname = "COMBO_MAQCOD" ;
      divTablesplittedmaqcod_Internalname = "TABLESPLITTEDMAQCOD" ;
      lblTextblockcombo_fascod_Internalname = "TEXTBLOCKCOMBO_FASCOD" ;
      Combo_fascod_Internalname = "COMBO_FASCOD" ;
      divTablesplittedfascod_Internalname = "TABLESPLITTEDFASCOD" ;
      lblTextblockcombo_hdr_Internalname = "TEXTBLOCKCOMBO_HDR" ;
      Combo_hdr_Internalname = "COMBO_HDR" ;
      divTablesplittedhdr_Internalname = "TABLESPLITTEDHDR" ;
      lblTextblockcombo_parfascod_Internalname = "TEXTBLOCKCOMBO_PARFASCOD" ;
      Combo_parfascod_Internalname = "COMBO_PARFASCOD" ;
      divTablesplittedparfascod_Internalname = "TABLESPLITTEDPARFASCOD" ;
      chkavFuerarango.setInternalname( "vFUERARANGO" );
      lblActualizar_Internalname = "ACTUALIZAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavDesdefechahora_Internalname = "vDESDEFECHAHORA" ;
      edtavHastafechahora_Internalname = "vHASTAFECHAHORA" ;
      divTablerango_Internalname = "TABLERANGO" ;
      lblCronometrostartstop_Internalname = "CRONOMETROSTARTSTOP" ;
      lblTbmensajeactualizar_Internalname = "TBMENSAJEACTUALIZAR" ;
      tblTablemergedcronometrostartstop_Internalname = "TABLEMERGEDCRONOMETROSTARTSTOP" ;
      Uc_chrometer_Internalname = "UC_CHROMETER" ;
      Barraprogreso_Internalname = "BARRAPROGRESO" ;
      divPanelfiltros_Internalname = "PANELFILTROS" ;
      Dvpanel_panelfiltros_Internalname = "DVPANEL_PANELFILTROS" ;
      lblTabgeneral_title_Internalname = "TABGENERAL_TITLE" ;
      lblTitulogeneral_Internalname = "TITULOGENERAL" ;
      lblImgcircle_Internalname = "IMGCIRCLE" ;
      lblTbmaquina_Internalname = "TBMAQUINA" ;
      Grafica_Internalname = "GRAFICA" ;
      divTablegraficas_Internalname = "TABLEGRAFICAS" ;
      divTablemaquina_Internalname = "TABLEMAQUINA" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divFsgrid1layouttable_Internalname = "FSGRID1LAYOUTTABLE" ;
      divTablemaquinas_Internalname = "TABLEMAQUINAS" ;
      divPanelgeneral_Internalname = "PANELGENERAL" ;
      Dvpanel_panelgeneral_Internalname = "DVPANEL_PANELGENERAL" ;
      divTablegeneral_Internalname = "TABLEGENERAL" ;
      lblTabdetalle_title_Internalname = "TABDETALLE_TITLE" ;
      divTablemasdetalles_Internalname = "TABLEMASDETALLES" ;
      divTabletabdetalle_Internalname = "TABLETABDETALLE" ;
      Gxuitabspanel_tabs1_Internalname = "GXUITABSPANEL_TABS1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamon_Internalname = "DATAMON" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavSegundos_Internalname = "vSEGUNDOS" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subFsgrid1_Internalname = "FSGRID1" ;
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
      subFsgrid1_Allowcollapsing = (byte)(0) ;
      lblTbmaquina_Caption = httpContext.getMessage( "MaquinaNombre", "") ;
      lblTbmensajeactualizar_Caption = " " ;
      lblCronometrostartstop_Caption = httpContext.getMessage( "<i class=\"fas fa-pause fas fa-pause  fa-2x\"></i>", "") ;
      subFsgrid1_Backcolorstyle = (byte)(0) ;
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
      Grafica_Datasource = "" ;
      edtavSegundos_Jsonclick = "" ;
      edtavSegundos_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divTabletabdetalle_Visible = 1 ;
      lblTitulogeneral_Caption = httpContext.getMessage( " Titulo", "") ;
      divTablegeneral_Visible = 1 ;
      edtavHastafechahora_Jsonclick = "" ;
      edtavHastafechahora_Enabled = 1 ;
      edtavDesdefechahora_Jsonclick = "" ;
      edtavDesdefechahora_Enabled = 1 ;
      divTablerango_Visible = 1 ;
      lblActualizar_Class = "TextBlock" ;
      chkavFuerarango.setEnabled( 1 );
      Combo_parfascod_Caption = "" ;
      Combo_hdr_Caption = "" ;
      Combo_fascod_Caption = "" ;
      Combo_maqcod_Caption = "" ;
      Combo_segundos_Caption = "" ;
      divPanelfiltros_Height = 0 ;
      subFsgrid1_Flexdirection = "column" ;
      subFsgrid1_Class = "FreeStyleGrid" ;
      Gxuitabspanel_tabs1_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs1_Class = "" ;
      Gxuitabspanel_tabs1_Pagecount = 2 ;
      Dvpanel_panelgeneral_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelgeneral_Iconposition = "Right" ;
      Dvpanel_panelgeneral_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelgeneral_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelgeneral_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelgeneral_Title = "" ;
      Dvpanel_panelgeneral_Cls = "PanelNoHeader" ;
      Dvpanel_panelgeneral_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelgeneral_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelgeneral_Width = "100%" ;
      Dvpanel_panelfiltros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Iconposition = "Right" ;
      Dvpanel_panelfiltros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_panelfiltros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelfiltros_Title = httpContext.getMessage( "Filtros", "") ;
      Dvpanel_panelfiltros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelfiltros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelfiltros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelfiltros_Width = "100%" ;
      Uc_chrometer_Tickinterval = 1 ;
      Combo_parfascod_Multiplevaluestype = "Tags" ;
      Combo_parfascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_parfascod_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_parfascod_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_parfascod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_hdr_Multiplevaluestype = "Tags" ;
      Combo_hdr_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_hdr_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_hdr_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_hdr_Cls = "ExtendedCombo AttributeFL" ;
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
      Combo_segundos_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_segundos_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Alertas", "") );
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
      AV29FueraRango = GXutil.strtobool( GXutil.booltostr( AV29FueraRango)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29FueraRango", AV29FueraRango);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'FSGRID1_nFirstRecordOnPage'},{av:'FSGRID1_nEOF'},{av:'AV79Maquinas',fld:'vMAQUINAS',pic:''},{av:'AV123MRec_AnalisisLineaSDT',fld:'vMREC_ANALISISLINEASDT',pic:''},{av:'AV29FueraRango',fld:'vFUERARANGO',pic:''},{av:'AV129Contador',fld:'vCONTADOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV128PrimeraMaquinaMRec_AnalisisLineaSDT',fld:'vPRIMERAMAQUINAMREC_ANALISISLINEASDT',pic:'',hsh:true},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("FSGRID1.LOAD","{handler:'e242E42',iparms:[{av:'AV129Contador',fld:'vCONTADOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV79Maquinas',fld:'vMAQUINAS',pic:''},{av:'AV123MRec_AnalisisLineaSDT',fld:'vMREC_ANALISISLINEASDT',pic:''},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''},{av:'AV128PrimeraMaquinaMRec_AnalisisLineaSDT',fld:'vPRIMERAMAQUINAMREC_ANALISISLINEASDT',pic:'',hsh:true}]");
      setEventMetadata("FSGRID1.LOAD",",oparms:[{av:'AV129Contador',fld:'vCONTADOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV128PrimeraMaquinaMRec_AnalisisLineaSDT',fld:'vPRIMERAMAQUINAMREC_ANALISISLINEASDT',pic:'',hsh:true},{av:'lblTbmaquina_Caption',ctrl:'TBMAQUINA',prop:'Caption'},{av:'Grafica_Datasource',ctrl:'GRAFICA',prop:'DataSource'}]}");
      setEventMetadata("'DOCRONOMETROSTARTSTOP'","{handler:'e182E42',iparms:[{av:'AV14CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV129Contador',fld:'vCONTADOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("'DOCRONOMETROSTARTSTOP'",",oparms:[{av:'AV14CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'lblCronometrostartstop_Caption',ctrl:'CRONOMETROSTARTSTOP',prop:'Caption'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'}]}");
      setEventMetadata("'DOACTUALIZAR'","{handler:'e192E42',iparms:[{av:'FSGRID1_nFirstRecordOnPage'},{av:'FSGRID1_nEOF'},{av:'AV129Contador',fld:'vCONTADOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''},{av:'AV79Maquinas',fld:'vMAQUINAS',pic:''},{av:'AV123MRec_AnalisisLineaSDT',fld:'vMREC_ANALISISLINEASDT',pic:''},{av:'AV128PrimeraMaquinaMRec_AnalisisLineaSDT',fld:'vPRIMERAMAQUINAMREC_ANALISISLINEASDT',pic:'',hsh:true},{av:'AV29FueraRango',fld:'vFUERARANGO',pic:''},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV93Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'AV75MaqCod',fld:'vMAQCOD',pic:''},{av:'AV59Hdr',fld:'vHDR',pic:''},{av:'AV26FasCod',fld:'vFASCOD',pic:''},{av:'AV19Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV57Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV14CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV20DesdeFechaHora',fld:'vDESDEFECHAHORA',pic:'99/99/99 99:99'},{av:'AV58HastaFechaHora',fld:'vHASTAFECHAHORA',pic:'99/99/99 99:99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14694MEPrMaqDsc',fld:'MEPRMAQDSC',pic:''}]");
      setEventMetadata("'DOACTUALIZAR'",",oparms:[{av:'lblActualizar_Class',ctrl:'ACTUALIZAR',prop:'Class'},{av:'lblActualizar_Jsonclick',ctrl:'ACTUALIZAR',prop:'Jsonclick'},{av:'AV14CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'lblTitulogeneral_Caption',ctrl:'TITULOGENERAL',prop:'Caption'},{av:'divTablegeneral_Visible',ctrl:'TABLEGENERAL',prop:'Visible'},{av:'divTabletabdetalle_Visible',ctrl:'TABLETABDETALLE',prop:'Visible'},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'AV123MRec_AnalisisLineaSDT',fld:'vMREC_ANALISISLINEASDT',pic:''},{av:'lblCronometrostartstop_Caption',ctrl:'CRONOMETROSTARTSTOP',prop:'Caption'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV19Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV57Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV79Maquinas',fld:'vMAQUINAS',pic:''},{av:'AV75MaqCod',fld:'vMAQCOD',pic:''}]}");
      setEventMetadata("COMBO_PARFASCOD.ONOPTIONCLICKED","{handler:'e152E42',iparms:[{av:'Combo_parfascod_Selectedvalue_get',ctrl:'COMBO_PARFASCOD',prop:'SelectedValue_get'},{av:'AV14CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV129Contador',fld:'vCONTADOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("COMBO_PARFASCOD.ONOPTIONCLICKED",",oparms:[{av:'AV14CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:''},{av:'lblCronometrostartstop_Caption',ctrl:'CRONOMETROSTARTSTOP',prop:'Caption'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'}]}");
      setEventMetadata("COMBO_HDR.ONOPTIONCLICKED","{handler:'e142E42',iparms:[{av:'Combo_hdr_Selectedvalue_get',ctrl:'COMBO_HDR',prop:'SelectedValue_get'},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''},{av:'AV59Hdr',fld:'vHDR',pic:''},{av:'AV26FasCod',fld:'vFASCOD',pic:''},{av:'AV75MaqCod',fld:'vMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14697MEPrHdr',fld:'MEPRHDR',pic:''},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A14695MEPrParCod',fld:'MEPRPARCOD',pic:'ZZZ9'},{av:'A14696MEPrParDsc',fld:'MEPRPARDSC',pic:''},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:''}]");
      setEventMetadata("COMBO_HDR.ONOPTIONCLICKED",",oparms:[{av:'AV59Hdr',fld:'vHDR',pic:''},{av:'AV88ParFasCod_Data',fld:'vPARFASCOD_DATA',pic:''},{av:'Combo_parfascod_Selectedvalue_set',ctrl:'COMBO_PARFASCOD',prop:'SelectedValue_set'}]}");
      setEventMetadata("COMBO_FASCOD.ONOPTIONCLICKED","{handler:'e132E42',iparms:[{av:'Combo_fascod_Selectedvalue_get',ctrl:'COMBO_FASCOD',prop:'SelectedValue_get'},{av:'AV14CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV129Contador',fld:'vCONTADOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26FasCod',fld:'vFASCOD',pic:''},{av:'AV75MaqCod',fld:'vMAQCOD',pic:''},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV59Hdr',fld:'vHDR',pic:''}]");
      setEventMetadata("COMBO_FASCOD.ONOPTIONCLICKED",",oparms:[{av:'AV14CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV26FasCod',fld:'vFASCOD',pic:''},{av:'lblCronometrostartstop_Caption',ctrl:'CRONOMETROSTARTSTOP',prop:'Caption'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'},{av:'AV60Hdr_Data',fld:'vHDR_DATA',pic:''},{av:'Combo_hdr_Selectedvalue_set',ctrl:'COMBO_HDR',prop:'SelectedValue_set'}]}");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED","{handler:'e122E42',iparms:[{av:'Combo_maqcod_Selectedvalue_get',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_get'},{av:'AV14CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV129Contador',fld:'vCONTADOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''},{av:'AV75MaqCod',fld:'vMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14692MEPrFasDsc',fld:'MEPRFASDSC',pic:''},{av:'AV26FasCod',fld:'vFASCOD',pic:''}]");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED",",oparms:[{av:'AV14CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV75MaqCod',fld:'vMAQCOD',pic:''},{av:'lblCronometrostartstop_Caption',ctrl:'CRONOMETROSTARTSTOP',prop:'Caption'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'},{av:'AV27FasCod_Data',fld:'vFASCOD_DATA',pic:''},{av:'Combo_fascod_Selectedvalue_set',ctrl:'COMBO_FASCOD',prop:'SelectedValue_set'}]}");
      setEventMetadata("COMBO_SEGUNDOS.ONOPTIONCLICKED","{handler:'e112E42',iparms:[{av:'Combo_segundos_Selectedvalue_get',ctrl:'COMBO_SEGUNDOS',prop:'SelectedValue_get'},{av:'AV93Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'AV14CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV129Contador',fld:'vCONTADOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV19Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV57Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV20DesdeFechaHora',fld:'vDESDEFECHAHORA',pic:'99/99/99 99:99'},{av:'AV58HastaFechaHora',fld:'vHASTAFECHAHORA',pic:'99/99/99 99:99'},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14694MEPrMaqDsc',fld:'MEPRMAQDSC',pic:''},{av:'AV75MaqCod',fld:'vMAQCOD',pic:''},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14692MEPrFasDsc',fld:'MEPRFASDSC',pic:''},{av:'AV26FasCod',fld:'vFASCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV59Hdr',fld:'vHDR',pic:''},{av:'A14697MEPrHdr',fld:'MEPRHDR',pic:''},{av:'A14695MEPrParCod',fld:'MEPRPARCOD',pic:'ZZZ9'},{av:'A14696MEPrParDsc',fld:'MEPRPARDSC',pic:''},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:''}]");
      setEventMetadata("COMBO_SEGUNDOS.ONOPTIONCLICKED",",oparms:[{av:'AV93Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'divTablerango_Visible',ctrl:'TABLERANGO',prop:'Visible'},{av:'AV14CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'lblCronometrostartstop_Caption',ctrl:'CRONOMETROSTARTSTOP',prop:'Caption'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'AV75MaqCod',fld:'vMAQCOD',pic:''},{av:'Combo_maqcod_Selectedvalue_set',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_set'},{av:'AV26FasCod',fld:'vFASCOD',pic:''},{av:'Combo_fascod_Selectedvalue_set',ctrl:'COMBO_FASCOD',prop:'SelectedValue_set'},{av:'AV59Hdr',fld:'vHDR',pic:''},{av:'Combo_hdr_Selectedvalue_set',ctrl:'COMBO_HDR',prop:'SelectedValue_set'},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:''},{av:'Combo_parfascod_Selectedvalue_set',ctrl:'COMBO_PARFASCOD',prop:'SelectedValue_set'},{av:'divTablegeneral_Visible',ctrl:'TABLEGENERAL',prop:'Visible'},{av:'divTabletabdetalle_Visible',ctrl:'TABLETABDETALLE',prop:'Visible'},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV19Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV57Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV76MaqCod_Data',fld:'vMAQCOD_DATA',pic:''},{av:'AV27FasCod_Data',fld:'vFASCOD_DATA',pic:''},{av:'AV60Hdr_Data',fld:'vHDR_DATA',pic:''},{av:'AV88ParFasCod_Data',fld:'vPARFASCOD_DATA',pic:''}]}");
      setEventMetadata("VSEGUNDOS.CONTROLVALUECHANGED","{handler:'e202E42',iparms:[{av:'AV93Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'AV14CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'AV129Contador',fld:'vCONTADOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV19Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV57Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV20DesdeFechaHora',fld:'vDESDEFECHAHORA',pic:'99/99/99 99:99'},{av:'AV58HastaFechaHora',fld:'vHASTAFECHAHORA',pic:'99/99/99 99:99'},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14694MEPrMaqDsc',fld:'MEPRMAQDSC',pic:''},{av:'AV75MaqCod',fld:'vMAQCOD',pic:''},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14692MEPrFasDsc',fld:'MEPRFASDSC',pic:''},{av:'AV26FasCod',fld:'vFASCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV59Hdr',fld:'vHDR',pic:''},{av:'A14697MEPrHdr',fld:'MEPRHDR',pic:''},{av:'A14695MEPrParCod',fld:'MEPRPARCOD',pic:'ZZZ9'},{av:'A14696MEPrParDsc',fld:'MEPRPARDSC',pic:''},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:''}]");
      setEventMetadata("VSEGUNDOS.CONTROLVALUECHANGED",",oparms:[{av:'divTablerango_Visible',ctrl:'TABLERANGO',prop:'Visible'},{av:'AV14CronometroStart',fld:'vCRONOMETROSTART',pic:''},{av:'lblCronometrostartstop_Caption',ctrl:'CRONOMETROSTARTSTOP',prop:'Caption'},{av:'lblTbmensajeactualizar_Caption',ctrl:'TBMENSAJEACTUALIZAR',prop:'Caption'},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'AV75MaqCod',fld:'vMAQCOD',pic:''},{av:'Combo_maqcod_Selectedvalue_set',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_set'},{av:'AV26FasCod',fld:'vFASCOD',pic:''},{av:'Combo_fascod_Selectedvalue_set',ctrl:'COMBO_FASCOD',prop:'SelectedValue_set'},{av:'AV59Hdr',fld:'vHDR',pic:''},{av:'Combo_hdr_Selectedvalue_set',ctrl:'COMBO_HDR',prop:'SelectedValue_set'},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:''},{av:'Combo_parfascod_Selectedvalue_set',ctrl:'COMBO_PARFASCOD',prop:'SelectedValue_set'},{av:'divTablegeneral_Visible',ctrl:'TABLEGENERAL',prop:'Visible'},{av:'divTabletabdetalle_Visible',ctrl:'TABLETABDETALLE',prop:'Visible'},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV19Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV57Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV76MaqCod_Data',fld:'vMAQCOD_DATA',pic:''},{av:'AV27FasCod_Data',fld:'vFASCOD_DATA',pic:''},{av:'AV60Hdr_Data',fld:'vHDR_DATA',pic:''},{av:'AV88ParFasCod_Data',fld:'vPARFASCOD_DATA',pic:''}]}");
      setEventMetadata("UC_CHROMETER.TICK","{handler:'e162E42',iparms:[{av:'AV75MaqCod',fld:'vMAQCOD',pic:''},{av:'AV129Contador',fld:'vCONTADOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''},{av:'FSGRID1_nFirstRecordOnPage'},{av:'FSGRID1_nEOF'},{av:'AV79Maquinas',fld:'vMAQUINAS',pic:''},{av:'AV123MRec_AnalisisLineaSDT',fld:'vMREC_ANALISISLINEASDT',pic:''},{av:'AV128PrimeraMaquinaMRec_AnalisisLineaSDT',fld:'vPRIMERAMAQUINAMREC_ANALISISLINEASDT',pic:'',hsh:true},{av:'AV29FueraRango',fld:'vFUERARANGO',pic:''},{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV93Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'AV59Hdr',fld:'vHDR',pic:''},{av:'AV26FasCod',fld:'vFASCOD',pic:''},{av:'AV19Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV57Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14694MEPrMaqDsc',fld:'MEPRMAQDSC',pic:''},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14692MEPrFasDsc',fld:'MEPRFASDSC',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A14697MEPrHdr',fld:'MEPRHDR',pic:''},{av:'A14695MEPrParCod',fld:'MEPRPARCOD',pic:'ZZZ9'},{av:'A14696MEPrParDsc',fld:'MEPRPARDSC',pic:''},{av:'AV20DesdeFechaHora',fld:'vDESDEFECHAHORA',pic:'99/99/99 99:99'},{av:'AV58HastaFechaHora',fld:'vHASTAFECHAHORA',pic:'99/99/99 99:99'}]");
      setEventMetadata("UC_CHROMETER.TICK",",oparms:[{av:'AV75MaqCod',fld:'vMAQCOD',pic:''},{av:'Combo_maqcod_Selectedvalue_set',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_set'},{av:'AV26FasCod',fld:'vFASCOD',pic:''},{av:'Combo_fascod_Selectedvalue_set',ctrl:'COMBO_FASCOD',prop:'SelectedValue_set'},{av:'AV59Hdr',fld:'vHDR',pic:''},{av:'Combo_hdr_Selectedvalue_set',ctrl:'COMBO_HDR',prop:'SelectedValue_set'},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:''},{av:'Combo_parfascod_Selectedvalue_set',ctrl:'COMBO_PARFASCOD',prop:'SelectedValue_set'},{av:'divTablegeneral_Visible',ctrl:'TABLEGENERAL',prop:'Visible'},{av:'divTabletabdetalle_Visible',ctrl:'TABLETABDETALLE',prop:'Visible'},{av:'lblTitulogeneral_Caption',ctrl:'TITULOGENERAL',prop:'Caption'},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'AV123MRec_AnalisisLineaSDT',fld:'vMREC_ANALISISLINEASDT',pic:''},{av:'AV76MaqCod_Data',fld:'vMAQCOD_DATA',pic:''},{av:'AV27FasCod_Data',fld:'vFASCOD_DATA',pic:''},{av:'AV60Hdr_Data',fld:'vHDR_DATA',pic:''},{av:'AV88ParFasCod_Data',fld:'vPARFASCOD_DATA',pic:''},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV19Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV57Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV79Maquinas',fld:'vMAQUINAS',pic:''}]}");
      setEventMetadata("VDESDEFECHAHORA.CONTROLVALUECHANGED","{handler:'e212E42',iparms:[{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV19Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV57Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV93Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'AV129Contador',fld:'vCONTADOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14694MEPrMaqDsc',fld:'MEPRMAQDSC',pic:''},{av:'AV75MaqCod',fld:'vMAQCOD',pic:''},{av:'AV20DesdeFechaHora',fld:'vDESDEFECHAHORA',pic:'99/99/99 99:99'},{av:'AV58HastaFechaHora',fld:'vHASTAFECHAHORA',pic:'99/99/99 99:99'},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14692MEPrFasDsc',fld:'MEPRFASDSC',pic:''},{av:'AV26FasCod',fld:'vFASCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV59Hdr',fld:'vHDR',pic:''},{av:'A14697MEPrHdr',fld:'MEPRHDR',pic:''},{av:'A14695MEPrParCod',fld:'MEPRPARCOD',pic:'ZZZ9'},{av:'A14696MEPrParDsc',fld:'MEPRPARDSC',pic:''},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:''}]");
      setEventMetadata("VDESDEFECHAHORA.CONTROLVALUECHANGED",",oparms:[{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'AV75MaqCod',fld:'vMAQCOD',pic:''},{av:'Combo_maqcod_Selectedvalue_set',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_set'},{av:'AV26FasCod',fld:'vFASCOD',pic:''},{av:'Combo_fascod_Selectedvalue_set',ctrl:'COMBO_FASCOD',prop:'SelectedValue_set'},{av:'AV59Hdr',fld:'vHDR',pic:''},{av:'Combo_hdr_Selectedvalue_set',ctrl:'COMBO_HDR',prop:'SelectedValue_set'},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:''},{av:'Combo_parfascod_Selectedvalue_set',ctrl:'COMBO_PARFASCOD',prop:'SelectedValue_set'},{av:'divTablegeneral_Visible',ctrl:'TABLEGENERAL',prop:'Visible'},{av:'divTabletabdetalle_Visible',ctrl:'TABLETABDETALLE',prop:'Visible'},{av:'AV76MaqCod_Data',fld:'vMAQCOD_DATA',pic:''},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV19Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV57Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV27FasCod_Data',fld:'vFASCOD_DATA',pic:''},{av:'AV60Hdr_Data',fld:'vHDR_DATA',pic:''},{av:'AV88ParFasCod_Data',fld:'vPARFASCOD_DATA',pic:''}]}");
      setEventMetadata("VHASTAFECHAHORA.CONTROLVALUECHANGED","{handler:'e222E42',iparms:[{av:'AV102UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV64Ip',fld:'vIP',pic:'',hsh:true},{av:'AV132Pgmname',fld:'vPGMNAME',pic:''},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV19Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV57Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV93Segundos',fld:'vSEGUNDOS',pic:'ZZZZZ9'},{av:'AV129Contador',fld:'vCONTADOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14698MEPrUsu',fld:'MEPRUSU',pic:''},{av:'A14699MEPrIp',fld:'MEPRIP',pic:''},{av:'A14700MEPrReg',fld:'MEPRREG',pic:'99/99/99 99:99:99.999'},{av:'A14701MEPrTkn',fld:'MEPRTKN',pic:''},{av:'A14702MEPrObj',fld:'MEPROBJ',pic:''},{av:'A14693MEPrMaqCod',fld:'MEPRMAQCOD',pic:''},{av:'A14694MEPrMaqDsc',fld:'MEPRMAQDSC',pic:''},{av:'AV75MaqCod',fld:'vMAQCOD',pic:''},{av:'AV20DesdeFechaHora',fld:'vDESDEFECHAHORA',pic:'99/99/99 99:99'},{av:'AV58HastaFechaHora',fld:'vHASTAFECHAHORA',pic:'99/99/99 99:99'},{av:'A14691MEPrFasCod',fld:'MEPRFASCOD',pic:''},{av:'A14692MEPrFasDsc',fld:'MEPRFASDSC',pic:''},{av:'AV26FasCod',fld:'vFASCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV59Hdr',fld:'vHDR',pic:''},{av:'A14697MEPrHdr',fld:'MEPRHDR',pic:''},{av:'A14695MEPrParCod',fld:'MEPRPARCOD',pic:'ZZZ9'},{av:'A14696MEPrParDsc',fld:'MEPRPARDSC',pic:''},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:''}]");
      setEventMetadata("VHASTAFECHAHORA.CONTROLVALUECHANGED",",oparms:[{av:'AV107InFilSDT',fld:'vINFILSDT',pic:''},{av:'AV111InFilTkn',fld:'vINFILTKN',pic:''},{av:'AV75MaqCod',fld:'vMAQCOD',pic:''},{av:'Combo_maqcod_Selectedvalue_set',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_set'},{av:'AV26FasCod',fld:'vFASCOD',pic:''},{av:'Combo_fascod_Selectedvalue_set',ctrl:'COMBO_FASCOD',prop:'SelectedValue_set'},{av:'AV59Hdr',fld:'vHDR',pic:''},{av:'Combo_hdr_Selectedvalue_set',ctrl:'COMBO_HDR',prop:'SelectedValue_set'},{av:'AV87ParFasCod',fld:'vPARFASCOD',pic:''},{av:'Combo_parfascod_Selectedvalue_set',ctrl:'COMBO_PARFASCOD',prop:'SelectedValue_set'},{av:'divTablegeneral_Visible',ctrl:'TABLEGENERAL',prop:'Visible'},{av:'divTabletabdetalle_Visible',ctrl:'TABLETABDETALLE',prop:'Visible'},{av:'AV76MaqCod_Data',fld:'vMAQCOD_DATA',pic:''},{av:'AV105Now',fld:'vNOW',pic:'99/99/99 99:99:99.999'},{av:'AV19Desde',fld:'vDESDE',pic:'99/99/99 99:99:99.999'},{av:'AV57Hasta',fld:'vHASTA',pic:'99/99/99 99:99:99.999'},{av:'AV27FasCod_Data',fld:'vFASCOD_DATA',pic:''},{av:'AV60Hdr_Data',fld:'vHDR_DATA',pic:''},{av:'AV88ParFasCod_Data',fld:'vPARFASCOD_DATA',pic:''}]}");
      setEventMetadata("DVPANEL_PANELFILTROS.ONTITLECLICK","{handler:'e172E42',iparms:[{av:'AV132Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("DVPANEL_PANELFILTROS.ONTITLECLICK",",oparms:[]}");
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
      Combo_hdr_Selectedvalue_get = "" ;
      Combo_fascod_Selectedvalue_get = "" ;
      Combo_maqcod_Selectedvalue_get = "" ;
      Combo_segundos_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV132Pgmname = "" ;
      AV79Maquinas = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item>(app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV123MRec_AnalisisLineaSDT = new GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT>(app.ingenieria.SdtMRec_AnalisisLineaSDT.class, "MRec_AnalisisLineaSDT", "TexplusNET", remoteHandle);
      AV128PrimeraMaquinaMRec_AnalisisLineaSDT = new GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT>(app.ingenieria.SdtMRec_AnalisisLineaSDT.class, "MRec_AnalisisLineaSDT", "TexplusNET", remoteHandle);
      AV102UsurCod = "" ;
      AV64Ip = "" ;
      AV25EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV18DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV94Segundos_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV76MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV27FasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV60Hdr_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV88ParFasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV75MaqCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV59Hdr = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26FasCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19Desde = GXutil.resetTime( GXutil.nullDate() );
      AV57Hasta = GXutil.resetTime( GXutil.nullDate() );
      AV107InFilSDT = new app.ingenieria.SdtInFilSDT(remoteHandle, context);
      AV105Now = GXutil.resetTime( GXutil.nullDate() );
      AV87ParFasCod = new GXSimpleCollection<Short>(Short.class, "internal", "");
      A396EmprCod = "" ;
      A14698MEPrUsu = "" ;
      A14699MEPrIp = "" ;
      A14700MEPrReg = GXutil.resetTime( GXutil.nullDate() );
      A14701MEPrTkn = "" ;
      AV111InFilTkn = "" ;
      A14702MEPrObj = "" ;
      A14693MEPrMaqCod = "" ;
      A14694MEPrMaqDsc = "" ;
      A14691MEPrFasCod = "" ;
      A14697MEPrHdr = "" ;
      A14696MEPrParDsc = "" ;
      A130BarCodPar = "" ;
      A14692MEPrFasDsc = "" ;
      Combo_segundos_Selectedvalue_set = "" ;
      Combo_segundos_Selectedtext_set = "" ;
      Combo_maqcod_Selectedvalue_set = "" ;
      Combo_fascod_Selectedvalue_set = "" ;
      Combo_hdr_Selectedvalue_set = "" ;
      Combo_parfascod_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panelfiltros = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_segundos_Jsonclick = "" ;
      ucCombo_segundos = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_maqcod_Jsonclick = "" ;
      ucCombo_maqcod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_fascod_Jsonclick = "" ;
      ucCombo_fascod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_hdr_Jsonclick = "" ;
      ucCombo_hdr = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_parfascod_Jsonclick = "" ;
      ucCombo_parfascod = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblActualizar_Jsonclick = "" ;
      AV20DesdeFechaHora = GXutil.resetTime( GXutil.nullDate() );
      AV58HastaFechaHora = GXutil.resetTime( GXutil.nullDate() );
      ucUc_chrometer = new com.genexus.webpanels.GXUserControl();
      ucBarraprogreso = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs1 = new com.genexus.webpanels.GXUserControl();
      lblTabgeneral_title_Jsonclick = "" ;
      ucDvpanel_panelgeneral = new com.genexus.webpanels.GXUserControl();
      lblTitulogeneral_Jsonclick = "" ;
      Fsgrid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      lblTabdetalle_title_Jsonclick = "" ;
      WebComp_Wcmrec_detalle_Component = "" ;
      OldWcmrec_detalle = "" ;
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      ucGrafica = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      hsh = "" ;
      AV12ContCod = "" ;
      AV106WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext3 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV113BuscandoInFilSDT = new app.ingenieria.SdtInFilSDT(remoteHandle, context);
      AV110WebSession = httpContext.getWebSession();
      AV81MRasTxt = "" ;
      AV103Version = "" ;
      AV116Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV117EmprNom = "" ;
      GXv_char6 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV78Maquina = new app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item(remoteHandle, context);
      AV124MaquinaMRec_AnalisisLineaSDT = new GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT>(app.ingenieria.SdtMRec_AnalisisLineaSDT.class, "MRec_AnalisisLineaSDT", "TexplusNET", remoteHandle);
      AV125Fila = new app.ingenieria.SdtMRec_AnalisisLineaSDT(remoteHandle, context);
      Fsgrid1Row = new com.genexus.webpanels.GXWebRow();
      scmdbuf = "" ;
      H02E42_A14702MEPrObj = new String[] {""} ;
      H02E42_A14701MEPrTkn = new String[] {""} ;
      H02E42_A14700MEPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      H02E42_A14699MEPrIp = new String[] {""} ;
      H02E42_A14698MEPrUsu = new String[] {""} ;
      H02E42_A14697MEPrHdr = new String[] {""} ;
      H02E42_A14691MEPrFasCod = new String[] {""} ;
      H02E42_A14693MEPrMaqCod = new String[] {""} ;
      H02E42_A396EmprCod = new String[] {""} ;
      H02E42_A14696MEPrParDsc = new String[] {""} ;
      H02E42_A14695MEPrParCod = new short[1] ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H02E43_A14702MEPrObj = new String[] {""} ;
      H02E43_A14701MEPrTkn = new String[] {""} ;
      H02E43_A14700MEPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      H02E43_A14699MEPrIp = new String[] {""} ;
      H02E43_A14698MEPrUsu = new String[] {""} ;
      H02E43_A14693MEPrMaqCod = new String[] {""} ;
      H02E43_A14691MEPrFasCod = new String[] {""} ;
      H02E43_A396EmprCod = new String[] {""} ;
      H02E43_A14697MEPrHdr = new String[] {""} ;
      H02E43_A130BarCodPar = new String[] {""} ;
      H02E43_A132BarCodReo = new byte[1] ;
      H02E43_A129BarCod = new int[1] ;
      H02E44_A14702MEPrObj = new String[] {""} ;
      H02E44_A14701MEPrTkn = new String[] {""} ;
      H02E44_A14700MEPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      H02E44_A14699MEPrIp = new String[] {""} ;
      H02E44_A14698MEPrUsu = new String[] {""} ;
      H02E44_A14693MEPrMaqCod = new String[] {""} ;
      H02E44_A396EmprCod = new String[] {""} ;
      H02E44_A14692MEPrFasDsc = new String[] {""} ;
      H02E44_A14691MEPrFasCod = new String[] {""} ;
      H02E45_A14702MEPrObj = new String[] {""} ;
      H02E45_A14701MEPrTkn = new String[] {""} ;
      H02E45_A14700MEPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      H02E45_A14699MEPrIp = new String[] {""} ;
      H02E45_A14698MEPrUsu = new String[] {""} ;
      H02E45_A396EmprCod = new String[] {""} ;
      H02E45_A14694MEPrMaqDsc = new String[] {""} ;
      H02E45_A14693MEPrMaqCod = new String[] {""} ;
      AV121Titulo = "" ;
      GXt_objcol_SdtMRec_AnalisisLineaSDT11 = new GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT>(app.ingenieria.SdtMRec_AnalisisLineaSDT.class, "MRec_AnalisisLineaSDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtMRec_AnalisisLineaSDT12 = new GXBaseCollection[1] ;
      GXv_int9 = new long[1] ;
      GXv_char7 = new String[1] ;
      GXv_boolean10 = new boolean[1] ;
      H02E46_A14702MEPrObj = new String[] {""} ;
      H02E46_A14701MEPrTkn = new String[] {""} ;
      H02E46_A14700MEPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      H02E46_A14699MEPrIp = new String[] {""} ;
      H02E46_A14698MEPrUsu = new String[] {""} ;
      H02E46_A396EmprCod = new String[] {""} ;
      H02E46_A14694MEPrMaqDsc = new String[] {""} ;
      H02E46_A14693MEPrMaqCod = new String[] {""} ;
      lblCronometrostartstop_Jsonclick = "" ;
      lblTbmensajeactualizar_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subFsgrid1_Linesclass = "" ;
      Fsgrid1Column = new com.genexus.webpanels.GXWebColumn();
      lblImgcircle_Jsonclick = "" ;
      lblTbmaquina_Jsonclick = "" ;
      subFsgrid1_Header = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_alertamaquina__default(),
         new Object[] {
             new Object[] {
            H02E42_A14702MEPrObj, H02E42_A14701MEPrTkn, H02E42_A14700MEPrReg, H02E42_A14699MEPrIp, H02E42_A14698MEPrUsu, H02E42_A14697MEPrHdr, H02E42_A14691MEPrFasCod, H02E42_A14693MEPrMaqCod, H02E42_A396EmprCod, H02E42_A14696MEPrParDsc,
            H02E42_A14695MEPrParCod
            }
            , new Object[] {
            H02E43_A14702MEPrObj, H02E43_A14701MEPrTkn, H02E43_A14700MEPrReg, H02E43_A14699MEPrIp, H02E43_A14698MEPrUsu, H02E43_A14693MEPrMaqCod, H02E43_A14691MEPrFasCod, H02E43_A396EmprCod, H02E43_A14697MEPrHdr, H02E43_A130BarCodPar,
            H02E43_A132BarCodReo, H02E43_A129BarCod
            }
            , new Object[] {
            H02E44_A14702MEPrObj, H02E44_A14701MEPrTkn, H02E44_A14700MEPrReg, H02E44_A14699MEPrIp, H02E44_A14698MEPrUsu, H02E44_A14693MEPrMaqCod, H02E44_A396EmprCod, H02E44_A14692MEPrFasDsc, H02E44_A14691MEPrFasCod
            }
            , new Object[] {
            H02E45_A14702MEPrObj, H02E45_A14701MEPrTkn, H02E45_A14700MEPrReg, H02E45_A14699MEPrIp, H02E45_A14698MEPrUsu, H02E45_A396EmprCod, H02E45_A14694MEPrMaqDsc, H02E45_A14693MEPrMaqCod
            }
            , new Object[] {
            H02E46_A14702MEPrObj, H02E46_A14701MEPrTkn, H02E46_A14700MEPrReg, H02E46_A14699MEPrIp, H02E46_A14698MEPrUsu, H02E46_A396EmprCod, H02E46_A14694MEPrMaqDsc, H02E46_A14693MEPrMaqCod
            }
         }
      );
      AV132Pgmname = "Ingenieria.MRec_AlertaMaquina" ;
      /* GeneXus formulas. */
      AV132Pgmname = "Ingenieria.MRec_AlertaMaquina" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wcmrec_detalle = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subFsgrid1_Backcolorstyle ;
   private byte FSGRID1_nEOF ;
   private byte AV135GXLvl291 ;
   private byte AV136GXLvl342 ;
   private byte AV137GXLvl387 ;
   private byte AV138GXLvl429 ;
   private byte nGXWrapped ;
   private byte subFsgrid1_Backstyle ;
   private byte subFsgrid1_Allowselection ;
   private byte subFsgrid1_Allowhovering ;
   private byte subFsgrid1_Allowcollapsing ;
   private byte subFsgrid1_Collapsed ;
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
   private short A14695MEPrParCod ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int nRC_GXsfl_109 ;
   private int nGXsfl_109_idx=1 ;
   private int A129BarCod ;
   private int Uc_chrometer_Tickinterval ;
   private int Gxuitabspanel_tabs1_Pagecount ;
   private int divPanelfiltros_Height ;
   private int divTablerango_Visible ;
   private int edtavDesdefechahora_Enabled ;
   private int edtavHastafechahora_Enabled ;
   private int divTablegeneral_Visible ;
   private int divTabletabdetalle_Visible ;
   private int edtavPgmname_Enabled ;
   private int AV93Segundos ;
   private int edtavSegundos_Visible ;
   private int subFsgrid1_Islastpage ;
   private int AV133GXV1 ;
   private int AV134GXV2 ;
   private int AV140GXV3 ;
   private int AV104SegundosMenos ;
   private int idxLst ;
   private int subFsgrid1_Backcolor ;
   private int subFsgrid1_Allbackcolor ;
   private int subFsgrid1_Selectedindex ;
   private int subFsgrid1_Selectioncolor ;
   private int subFsgrid1_Hoveringcolor ;
   private long AV129Contador ;
   private long FSGRID1_nCurrentRecord ;
   private long FSGRID1_nFirstRecordOnPage ;
   private long AV109InFilId ;
   private long GXv_int9[] ;
   private String Combo_parfascod_Selectedvalue_get ;
   private String Combo_hdr_Selectedvalue_get ;
   private String Combo_fascod_Selectedvalue_get ;
   private String Combo_maqcod_Selectedvalue_get ;
   private String Combo_segundos_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_109_idx="0001" ;
   private String AV132Pgmname ;
   private String AV102UsurCod ;
   private String AV25EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A14698MEPrUsu ;
   private String A14693MEPrMaqCod ;
   private String A14694MEPrMaqDsc ;
   private String A14691MEPrFasCod ;
   private String A14697MEPrHdr ;
   private String A14696MEPrParDsc ;
   private String A130BarCodPar ;
   private String A14692MEPrFasDsc ;
   private String Combo_segundos_Cls ;
   private String Combo_segundos_Selectedvalue_set ;
   private String Combo_segundos_Selectedtext_set ;
   private String Combo_maqcod_Cls ;
   private String Combo_maqcod_Selectedvalue_set ;
   private String Combo_maqcod_Multiplevaluestype ;
   private String Combo_maqcod_Emptyitemtext ;
   private String Combo_fascod_Cls ;
   private String Combo_fascod_Selectedvalue_set ;
   private String Combo_fascod_Multiplevaluestype ;
   private String Combo_hdr_Cls ;
   private String Combo_hdr_Selectedvalue_set ;
   private String Combo_hdr_Multiplevaluestype ;
   private String Combo_parfascod_Cls ;
   private String Combo_parfascod_Selectedvalue_set ;
   private String Combo_parfascod_Multiplevaluestype ;
   private String Dvpanel_panelfiltros_Width ;
   private String Dvpanel_panelfiltros_Cls ;
   private String Dvpanel_panelfiltros_Title ;
   private String Dvpanel_panelfiltros_Iconposition ;
   private String Dvpanel_panelgeneral_Width ;
   private String Dvpanel_panelgeneral_Cls ;
   private String Dvpanel_panelgeneral_Title ;
   private String Dvpanel_panelgeneral_Iconposition ;
   private String Gxuitabspanel_tabs1_Class ;
   private String subFsgrid1_Class ;
   private String subFsgrid1_Flexdirection ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panelfiltros_Internalname ;
   private String divPanelfiltros_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedsegundos_Internalname ;
   private String lblTextblockcombo_segundos_Internalname ;
   private String lblTextblockcombo_segundos_Jsonclick ;
   private String Combo_segundos_Caption ;
   private String Combo_segundos_Internalname ;
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
   private String divTablesplittedhdr_Internalname ;
   private String lblTextblockcombo_hdr_Internalname ;
   private String lblTextblockcombo_hdr_Jsonclick ;
   private String Combo_hdr_Caption ;
   private String Combo_hdr_Internalname ;
   private String divTablesplittedparfascod_Internalname ;
   private String lblTextblockcombo_parfascod_Internalname ;
   private String lblTextblockcombo_parfascod_Jsonclick ;
   private String Combo_parfascod_Caption ;
   private String Combo_parfascod_Internalname ;
   private String TempTags ;
   private String lblActualizar_Internalname ;
   private String lblActualizar_Jsonclick ;
   private String lblActualizar_Class ;
   private String divTablerango_Internalname ;
   private String edtavDesdefechahora_Internalname ;
   private String edtavDesdefechahora_Jsonclick ;
   private String edtavHastafechahora_Internalname ;
   private String edtavHastafechahora_Jsonclick ;
   private String Uc_chrometer_Internalname ;
   private String Barraprogreso_Internalname ;
   private String Gxuitabspanel_tabs1_Internalname ;
   private String lblTabgeneral_title_Internalname ;
   private String lblTabgeneral_title_Jsonclick ;
   private String divTablegeneral_Internalname ;
   private String Dvpanel_panelgeneral_Internalname ;
   private String divPanelgeneral_Internalname ;
   private String lblTitulogeneral_Internalname ;
   private String lblTitulogeneral_Caption ;
   private String lblTitulogeneral_Jsonclick ;
   private String divTablemaquinas_Internalname ;
   private String sStyleString ;
   private String subFsgrid1_Internalname ;
   private String lblTabdetalle_title_Internalname ;
   private String lblTabdetalle_title_Jsonclick ;
   private String divTabletabdetalle_Internalname ;
   private String divTablemasdetalles_Internalname ;
   private String WebComp_Wcmrec_detalle_Component ;
   private String OldWcmrec_detalle ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamon_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavSegundos_Internalname ;
   private String edtavSegundos_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String Grafica_Datasource ;
   private String Grafica_Internalname ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String hsh ;
   private String AV12ContCod ;
   private String AV103Version ;
   private String AV116Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV117EmprNom ;
   private String GXv_char6[] ;
   private String lblTbmaquina_Caption ;
   private String scmdbuf ;
   private String lblCronometrostartstop_Caption ;
   private String lblCronometrostartstop_Internalname ;
   private String lblTbmensajeactualizar_Caption ;
   private String lblTbmensajeactualizar_Internalname ;
   private String GXv_char7[] ;
   private String tblTablemergedcronometrostartstop_Internalname ;
   private String lblCronometrostartstop_Jsonclick ;
   private String lblTbmensajeactualizar_Jsonclick ;
   private String lblImgcircle_Internalname ;
   private String lblTbmaquina_Internalname ;
   private String sGXsfl_109_fel_idx="0001" ;
   private String subFsgrid1_Linesclass ;
   private String divFsgrid1layouttable_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divTablemaquina_Internalname ;
   private String lblImgcircle_Jsonclick ;
   private String lblTbmaquina_Jsonclick ;
   private String divTablegraficas_Internalname ;
   private String subFsgrid1_Header ;
   private java.util.Date AV19Desde ;
   private java.util.Date AV57Hasta ;
   private java.util.Date AV105Now ;
   private java.util.Date A14700MEPrReg ;
   private java.util.Date AV20DesdeFechaHora ;
   private java.util.Date AV58HastaFechaHora ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV29FueraRango ;
   private boolean AV14CronometroStart ;
   private boolean Combo_segundos_Emptyitem ;
   private boolean Combo_maqcod_Allowmultipleselection ;
   private boolean Combo_maqcod_Includeonlyselectedoption ;
   private boolean Combo_fascod_Allowmultipleselection ;
   private boolean Combo_fascod_Includeonlyselectedoption ;
   private boolean Combo_fascod_Emptyitem ;
   private boolean Combo_hdr_Allowmultipleselection ;
   private boolean Combo_hdr_Includeonlyselectedoption ;
   private boolean Combo_hdr_Emptyitem ;
   private boolean Combo_parfascod_Allowmultipleselection ;
   private boolean Combo_parfascod_Includeonlyselectedoption ;
   private boolean Combo_parfascod_Emptyitem ;
   private boolean Dvpanel_panelfiltros_Autowidth ;
   private boolean Dvpanel_panelfiltros_Autoheight ;
   private boolean Dvpanel_panelfiltros_Collapsible ;
   private boolean Dvpanel_panelfiltros_Collapsed ;
   private boolean Dvpanel_panelfiltros_Showcollapseicon ;
   private boolean Dvpanel_panelfiltros_Autoscroll ;
   private boolean Dvpanel_panelgeneral_Autowidth ;
   private boolean Dvpanel_panelgeneral_Autoheight ;
   private boolean Dvpanel_panelgeneral_Collapsible ;
   private boolean Dvpanel_panelgeneral_Collapsed ;
   private boolean Dvpanel_panelgeneral_Showcollapseicon ;
   private boolean Dvpanel_panelgeneral_Autoscroll ;
   private boolean Gxuitabspanel_tabs1_Historymanagement ;
   private boolean wbLoad ;
   private boolean bGXsfl_109_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean AV127primeramaquina ;
   private boolean gx_refresh_fired ;
   private boolean AV108ExisteFiltro ;
   private boolean GXt_boolean8 ;
   private boolean GXv_boolean10[] ;
   private String AV81MRasTxt ;
   private String AV64Ip ;
   private String A14699MEPrIp ;
   private String A14701MEPrTkn ;
   private String AV111InFilTkn ;
   private String A14702MEPrObj ;
   private String AV121Titulo ;
   private GXSimpleCollection<Short> AV87ParFasCod ;
   private com.genexus.webpanels.GXWebGrid Fsgrid1Container ;
   private com.genexus.webpanels.GXWebRow Fsgrid1Row ;
   private com.genexus.webpanels.GXWebColumn Fsgrid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcmrec_detalle ;
   private com.genexus.webpanels.WebSession AV110WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelfiltros ;
   private com.genexus.webpanels.GXUserControl ucCombo_segundos ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_fascod ;
   private com.genexus.webpanels.GXUserControl ucCombo_hdr ;
   private com.genexus.webpanels.GXUserControl ucCombo_parfascod ;
   private com.genexus.webpanels.GXUserControl ucUc_chrometer ;
   private com.genexus.webpanels.GXUserControl ucBarraprogreso ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelgeneral ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexus.webpanels.GXUserControl ucGrafica ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavFuerarango ;
   private IDataStoreProvider pr_default ;
   private String[] H02E42_A14702MEPrObj ;
   private String[] H02E42_A14701MEPrTkn ;
   private java.util.Date[] H02E42_A14700MEPrReg ;
   private String[] H02E42_A14699MEPrIp ;
   private String[] H02E42_A14698MEPrUsu ;
   private String[] H02E42_A14697MEPrHdr ;
   private String[] H02E42_A14691MEPrFasCod ;
   private String[] H02E42_A14693MEPrMaqCod ;
   private String[] H02E42_A396EmprCod ;
   private String[] H02E42_A14696MEPrParDsc ;
   private short[] H02E42_A14695MEPrParCod ;
   private String[] H02E43_A14702MEPrObj ;
   private String[] H02E43_A14701MEPrTkn ;
   private java.util.Date[] H02E43_A14700MEPrReg ;
   private String[] H02E43_A14699MEPrIp ;
   private String[] H02E43_A14698MEPrUsu ;
   private String[] H02E43_A14693MEPrMaqCod ;
   private String[] H02E43_A14691MEPrFasCod ;
   private String[] H02E43_A396EmprCod ;
   private String[] H02E43_A14697MEPrHdr ;
   private String[] H02E43_A130BarCodPar ;
   private byte[] H02E43_A132BarCodReo ;
   private int[] H02E43_A129BarCod ;
   private String[] H02E44_A14702MEPrObj ;
   private String[] H02E44_A14701MEPrTkn ;
   private java.util.Date[] H02E44_A14700MEPrReg ;
   private String[] H02E44_A14699MEPrIp ;
   private String[] H02E44_A14698MEPrUsu ;
   private String[] H02E44_A14693MEPrMaqCod ;
   private String[] H02E44_A396EmprCod ;
   private String[] H02E44_A14692MEPrFasDsc ;
   private String[] H02E44_A14691MEPrFasCod ;
   private String[] H02E45_A14702MEPrObj ;
   private String[] H02E45_A14701MEPrTkn ;
   private java.util.Date[] H02E45_A14700MEPrReg ;
   private String[] H02E45_A14699MEPrIp ;
   private String[] H02E45_A14698MEPrUsu ;
   private String[] H02E45_A396EmprCod ;
   private String[] H02E45_A14694MEPrMaqDsc ;
   private String[] H02E45_A14693MEPrMaqCod ;
   private String[] H02E46_A14702MEPrObj ;
   private String[] H02E46_A14701MEPrTkn ;
   private java.util.Date[] H02E46_A14700MEPrReg ;
   private String[] H02E46_A14699MEPrIp ;
   private String[] H02E46_A14698MEPrUsu ;
   private String[] H02E46_A396EmprCod ;
   private String[] H02E46_A14694MEPrMaqDsc ;
   private String[] H02E46_A14693MEPrMaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV75MaqCod ;
   private GXSimpleCollection<String> AV59Hdr ;
   private GXSimpleCollection<String> AV26FasCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV94Segundos_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV76MaqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV27FasCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV60Hdr_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV88ParFasCod_Data ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item> AV79Maquinas ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT> AV123MRec_AnalisisLineaSDT ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT> AV128PrimeraMaquinaMRec_AnalisisLineaSDT ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT> AV124MaquinaMRec_AnalisisLineaSDT ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT> GXt_objcol_SdtMRec_AnalisisLineaSDT11 ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT> GXv_objcol_SdtMRec_AnalisisLineaSDT12[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV18DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons4 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5[] ;
   private app.ingenieria.SdtMRec_AlertaMaquinaSDT_Item AV78Maquina ;
   private app.wwpbaseobjects.SdtWWPContext AV106WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext3[] ;
   private app.ingenieria.SdtInFilSDT AV107InFilSDT ;
   private app.ingenieria.SdtInFilSDT AV113BuscandoInFilSDT ;
   private app.ingenieria.SdtMRec_AnalisisLineaSDT AV125Fila ;
}

final  class mrec_alertamaquina__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02E42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14693MEPrMaqCod ,
                                          GXSimpleCollection<String> AV75MaqCod ,
                                          String A14691MEPrFasCod ,
                                          GXSimpleCollection<String> AV26FasCod ,
                                          String A14697MEPrHdr ,
                                          GXSimpleCollection<String> AV59Hdr ,
                                          java.util.Date A14700MEPrReg ,
                                          java.util.Date AV105Now ,
                                          String A14698MEPrUsu ,
                                          String AV102UsurCod ,
                                          String A14699MEPrIp ,
                                          String AV64Ip ,
                                          String A14701MEPrTkn ,
                                          String AV111InFilTkn ,
                                          String A14702MEPrObj ,
                                          String AV132Pgmname ,
                                          String AV25EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[6];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS MEPrObj, NULL AS MEPrTkn, NULL AS MEPrReg, NULL AS MEPrIp, NULL AS MEPrUsu, NULL AS MEPrHdr, NULL AS MEPrFasCod, NULL AS MEPrMaqCod, NULL" ;
      scmdbuf += " AS EmprCod, MEPrParDsc, MEPrParCod FROM ( SELECT MEPrObj, MEPrTkn, MEPrReg, MEPrIp, MEPrUsu, MEPrHdr, MEPrFasCod, MEPrMaqCod, EmprCod, MEPrParDsc, MEPrParCod FROM" ;
      scmdbuf += " MEPr" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV75MaqCod, "MEPrMaqCod IN (", ")")+")");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV26FasCod, "MEPrFasCod IN (", ")")+")");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV59Hdr, "MEPrHdr IN (", ")")+")");
      addWhere(sWhereString, "(MEPrReg >= ?)");
      addWhere(sWhereString, "(MEPrUsu = ?)");
      addWhere(sWhereString, "(MEPrIp = ?)");
      addWhere(sWhereString, "(MEPrTkn = ?)");
      addWhere(sWhereString, "(MEPrObj = ?)");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      scmdbuf += ") DistinctT" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_H02E43( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14691MEPrFasCod ,
                                          GXSimpleCollection<String> AV26FasCod ,
                                          String A14693MEPrMaqCod ,
                                          GXSimpleCollection<String> AV75MaqCod ,
                                          java.util.Date A14700MEPrReg ,
                                          java.util.Date AV105Now ,
                                          String A14698MEPrUsu ,
                                          String AV102UsurCod ,
                                          String A14699MEPrIp ,
                                          String AV64Ip ,
                                          String A14701MEPrTkn ,
                                          String AV111InFilTkn ,
                                          String A14702MEPrObj ,
                                          String AV132Pgmname ,
                                          String AV25EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[6];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS MEPrObj, NULL AS MEPrTkn, NULL AS MEPrReg, NULL AS MEPrIp, NULL AS MEPrUsu, NULL AS MEPrMaqCod, NULL AS MEPrFasCod, EmprCod, MEPrHdr, BarCodPar," ;
      scmdbuf += " BarCodReo, BarCod FROM ( SELECT MEPrObj, MEPrTkn, MEPrReg, MEPrIp, MEPrUsu, MEPrMaqCod, MEPrFasCod, EmprCod, MEPrHdr, BarCodPar, BarCodReo, BarCod FROM MEPr" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV26FasCod, "MEPrFasCod IN (", ")")+")");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV75MaqCod, "MEPrMaqCod IN (", ")")+")");
      addWhere(sWhereString, "(MEPrReg >= ?)");
      addWhere(sWhereString, "(MEPrUsu = ?)");
      addWhere(sWhereString, "(MEPrIp = ?)");
      addWhere(sWhereString, "(MEPrTkn = ?)");
      addWhere(sWhereString, "(MEPrObj = ?)");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      scmdbuf += ") DistinctT" ;
      scmdbuf += " ORDER BY EmprCod" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_H02E44( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14693MEPrMaqCod ,
                                          GXSimpleCollection<String> AV75MaqCod ,
                                          java.util.Date A14700MEPrReg ,
                                          java.util.Date AV105Now ,
                                          String A14698MEPrUsu ,
                                          String AV102UsurCod ,
                                          String A14699MEPrIp ,
                                          String AV64Ip ,
                                          String A14701MEPrTkn ,
                                          String AV111InFilTkn ,
                                          String A14702MEPrObj ,
                                          String AV132Pgmname ,
                                          String AV25EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[6];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS MEPrObj, NULL AS MEPrTkn, NULL AS MEPrReg, NULL AS MEPrIp, NULL AS MEPrUsu, NULL AS MEPrMaqCod, NULL AS EmprCod, MEPrFasDsc, MEPrFasCod FROM" ;
      scmdbuf += " ( SELECT MEPrObj, MEPrTkn, MEPrReg, MEPrIp, MEPrUsu, MEPrMaqCod, EmprCod, MEPrFasDsc, MEPrFasCod FROM MEPr" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV75MaqCod, "MEPrMaqCod IN (", ")")+")");
      addWhere(sWhereString, "(MEPrReg >= ?)");
      addWhere(sWhereString, "(MEPrUsu = ?)");
      addWhere(sWhereString, "(MEPrIp = ?)");
      addWhere(sWhereString, "(MEPrTkn = ?)");
      addWhere(sWhereString, "(MEPrObj = ?)");
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      scmdbuf += ") DistinctT" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
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
                  return conditional_H02E42(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] );
            case 1 :
                  return conditional_H02E43(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 2 :
                  return conditional_H02E44(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02E42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02E43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02E44", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02E45", "SELECT DISTINCT NULL AS MEPrObj, MEPrTkn, NULL AS MEPrReg, MEPrIp, MEPrUsu, EmprCod, MEPrMaqDsc, MEPrMaqCod FROM ( SELECT MEPrObj, MEPrTkn, MEPrReg, MEPrIp, MEPrUsu, EmprCod, MEPrMaqDsc, MEPrMaqCod FROM MEPr WHERE (EmprCod = ?) AND (MEPrReg >= ?) AND (MEPrUsu = ?) AND (MEPrIp = ?) AND (MEPrTkn = ?) AND (MEPrObj = ?) ORDER BY EmprCod) DistinctT ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02E46", "SELECT DISTINCT NULL AS MEPrObj, MEPrTkn, NULL AS MEPrReg, MEPrIp, MEPrUsu, EmprCod, MEPrMaqDsc, MEPrMaqCod FROM ( SELECT MEPrObj, MEPrTkn, MEPrReg, MEPrIp, MEPrUsu, EmprCod, MEPrMaqDsc, MEPrMaqCod FROM MEPr WHERE (EmprCod = ?) AND (MEPrReg >= ?) AND (MEPrUsu = ?) AND (MEPrIp = ?) AND (MEPrTkn = ?) AND (MEPrObj = ?) ORDER BY EmprCod) DistinctT ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3, true);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3, true);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3, true);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
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
            case 4 :
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

