package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwopeexp_impl extends GXDataArea
{
   public webwopeexp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwopeexp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwopeexp_impl.class ));
   }

   public webwopeexp_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
      chkavTintutex = UIFactory.getCheckbox(this);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vOPECOD") == 0 )
         {
            A13748OpeCNom = httpContext.GetPar( "OpeCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvopecod1570( A13748OpeCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCOD") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcod1570( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vLECMAQCOD") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvlecmaqcod1570( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vOPECOD") == 0 )
         {
            A13748OpeCNom = httpContext.GetPar( "OpeCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvopecod1570( A13748OpeCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vOPECOD") == 0 )
         {
            hV13OpeCod = httpContext.GetPar( "hV13OpeCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvopecod1572( hV13OpeCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCOD") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcod1570( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMAQCOD") == 0 )
         {
            hV11MaqCod = httpContext.GetPar( "hV11MaqCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmaqcod1572( hV11MaqCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vLECMAQCOD") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvlecmaqcod1570( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vLECMAQCOD") == 0 )
         {
            hV10LecMaqCod = httpContext.GetPar( "hV10LecMaqCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvlecmaqcod1572( hV10LecMaqCod) ;
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
      pa1572( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1572( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.expedicionesautomatizadas.webwopeexp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vESTADOANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60EstadoAnt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPROF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36HisProf, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WebWOPEEXP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV106Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("expedicionesautomatizadas\\webwopeexp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vMAQUINAVALIDADA", AV12MaquinaValidada);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDT_MAQUINA", AV17SDT_Maquina);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDT_MAQUINA", AV17SDT_Maquina);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vOPERARIOVALIDADO", AV15OperarioValidado);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vHDREXISTE", AV78HDRExiste);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vMAQUINAFASEEXISTE", AV88MaquinaFaseExiste);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARANCACA1", GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER", GXutil.rtrim( A212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIECOD", GXutil.rtrim( A200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEEST", GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CODBARPZ", GXutil.rtrim( A8838CodBarPz));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASTIP", GXutil.rtrim( AV69FasTip));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCADA", GXutil.ltrim( localUtil.ntoc( AV42Barcada, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASCON", GXutil.rtrim( A152BarFasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "FASTIP", GXutil.rtrim( A6011FasTip));
      app.GxWebStd.gx_hidden_field( httpContext, "FASH2OREH", GXutil.rtrim( A7600FasH2OReh));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV21UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV19Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vESTADOANT", GXutil.ltrim( localUtil.ntoc( AV60EstadoAnt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vESTADOANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60EstadoAnt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROF", GXutil.rtrim( AV36HisProf));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPROF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36HisProf, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vLECPARCOD", GXutil.ltrim( localUtil.ntoc( AV34Lecparcod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTURNO", GXutil.ltrim( localUtil.ntoc( AV39Turno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDT_OPERARIO", AV18SDT_Operario);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDT_OPERARIO", AV18SDT_Operario);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCODMF", GXutil.rtrim( AV66FasCodmf));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASDSCMF", GXutil.rtrim( AV67FasDscmf));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV47BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARANCACA1", GXutil.ltrim( localUtil.ntoc( AV41BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMENSA", GXutil.rtrim( AV89Mensa));
      app.GxWebStd.gx_hidden_field( httpContext, "vLECFEC", localUtil.dtoc( AV29Lecfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROLIN", GXutil.ltrim( localUtil.ntoc( AV37HisProlin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV94Procod));
      app.GxWebStd.gx_hidden_field( httpContext, "LECMAQCOD", GXutil.rtrim( A1166LecMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "LECBARCOD", GXutil.ltrim( localUtil.ntoc( A1167LecBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LECBARPAR", GXutil.rtrim( A1169LecBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "LECBARREO", GXutil.ltrim( localUtil.ntoc( A1168LecBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LECFASORD", GXutil.ltrim( localUtil.ntoc( A1188LecFasOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LECFASCOD", GXutil.rtrim( A1171LecFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "LECOPECOD", GXutil.ltrim( localUtil.ntoc( A1170LecOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LECPARCOD", GXutil.ltrim( localUtil.ntoc( A1172LecParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OPECOD", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OPENOM", GXutil.rtrim( A653OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PARCOD", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARCODNOM", GXutil.rtrim( A867ParCodNom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvOPECOD", GXutil.ltrim( localUtil.ntoc( AV13OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMAQCOD", GXutil.rtrim( AV11MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvLECMAQCOD", GXutil.rtrim( AV10LecMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEOPERARIO_Width", GXutil.rtrim( Dvpanel_tableoperario_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEOPERARIO_Autowidth", GXutil.booltostr( Dvpanel_tableoperario_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEOPERARIO_Autoheight", GXutil.booltostr( Dvpanel_tableoperario_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEOPERARIO_Cls", GXutil.rtrim( Dvpanel_tableoperario_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEOPERARIO_Title", GXutil.rtrim( Dvpanel_tableoperario_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEOPERARIO_Collapsible", GXutil.booltostr( Dvpanel_tableoperario_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEOPERARIO_Collapsed", GXutil.booltostr( Dvpanel_tableoperario_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEOPERARIO_Showcollapseicon", GXutil.booltostr( Dvpanel_tableoperario_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEOPERARIO_Iconposition", GXutil.rtrim( Dvpanel_tableoperario_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEOPERARIO_Autoscroll", GXutil.booltostr( Dvpanel_tableoperario_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEMAQUINA_Width", GXutil.rtrim( Dvpanel_tablemaquina_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEMAQUINA_Autowidth", GXutil.booltostr( Dvpanel_tablemaquina_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEMAQUINA_Autoheight", GXutil.booltostr( Dvpanel_tablemaquina_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEMAQUINA_Cls", GXutil.rtrim( Dvpanel_tablemaquina_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEMAQUINA_Title", GXutil.rtrim( Dvpanel_tablemaquina_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEMAQUINA_Collapsible", GXutil.booltostr( Dvpanel_tablemaquina_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEMAQUINA_Collapsed", GXutil.booltostr( Dvpanel_tablemaquina_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEMAQUINA_Showcollapseicon", GXutil.booltostr( Dvpanel_tablemaquina_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEMAQUINA_Iconposition", GXutil.rtrim( Dvpanel_tablemaquina_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEMAQUINA_Autoscroll", GXutil.booltostr( Dvpanel_tablemaquina_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHDR_Width", GXutil.rtrim( Dvpanel_tablehdr_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHDR_Autowidth", GXutil.booltostr( Dvpanel_tablehdr_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHDR_Autoheight", GXutil.booltostr( Dvpanel_tablehdr_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHDR_Cls", GXutil.rtrim( Dvpanel_tablehdr_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHDR_Title", GXutil.rtrim( Dvpanel_tablehdr_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHDR_Collapsible", GXutil.booltostr( Dvpanel_tablehdr_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHDR_Collapsed", GXutil.booltostr( Dvpanel_tablehdr_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHDR_Showcollapseicon", GXutil.booltostr( Dvpanel_tablehdr_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHDR_Iconposition", GXutil.rtrim( Dvpanel_tablehdr_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHDR_Autoscroll", GXutil.booltostr( Dvpanel_tablehdr_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEINFORMACION_Width", GXutil.rtrim( Dvpanel_tableinformacion_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEINFORMACION_Autowidth", GXutil.booltostr( Dvpanel_tableinformacion_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEINFORMACION_Autoheight", GXutil.booltostr( Dvpanel_tableinformacion_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEINFORMACION_Cls", GXutil.rtrim( Dvpanel_tableinformacion_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEINFORMACION_Title", GXutil.rtrim( Dvpanel_tableinformacion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEINFORMACION_Collapsible", GXutil.booltostr( Dvpanel_tableinformacion_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEINFORMACION_Collapsed", GXutil.booltostr( Dvpanel_tableinformacion_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEINFORMACION_Showcollapseicon", GXutil.booltostr( Dvpanel_tableinformacion_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEINFORMACION_Iconposition", GXutil.rtrim( Dvpanel_tableinformacion_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEINFORMACION_Autoscroll", GXutil.booltostr( Dvpanel_tableinformacion_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_MENSAJES_Width", GXutil.rtrim( Dvpanel_table_mensajes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_MENSAJES_Autowidth", GXutil.booltostr( Dvpanel_table_mensajes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_MENSAJES_Autoheight", GXutil.booltostr( Dvpanel_table_mensajes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_MENSAJES_Cls", GXutil.rtrim( Dvpanel_table_mensajes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_MENSAJES_Title", GXutil.rtrim( Dvpanel_table_mensajes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_MENSAJES_Collapsible", GXutil.booltostr( Dvpanel_table_mensajes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_MENSAJES_Collapsed", GXutil.booltostr( Dvpanel_table_mensajes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_MENSAJES_Showcollapseicon", GXutil.booltostr( Dvpanel_table_mensajes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_MENSAJES_Iconposition", GXutil.rtrim( Dvpanel_table_mensajes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLE_MENSAJES_Autoscroll", GXutil.booltostr( Dvpanel_table_mensajes_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEVARIABLES_Width", GXutil.rtrim( Dvpanel_tablevariables_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEVARIABLES_Autowidth", GXutil.booltostr( Dvpanel_tablevariables_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEVARIABLES_Autoheight", GXutil.booltostr( Dvpanel_tablevariables_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEVARIABLES_Cls", GXutil.rtrim( Dvpanel_tablevariables_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEVARIABLES_Title", GXutil.rtrim( Dvpanel_tablevariables_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEVARIABLES_Collapsible", GXutil.booltostr( Dvpanel_tablevariables_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEVARIABLES_Collapsed", GXutil.booltostr( Dvpanel_tablevariables_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEVARIABLES_Showcollapseicon", GXutil.booltostr( Dvpanel_tablevariables_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEVARIABLES_Iconposition", GXutil.rtrim( Dvpanel_tablevariables_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEVARIABLES_Autoscroll", GXutil.booltostr( Dvpanel_tablevariables_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTBLOCK_MENSAJE_Caption", GXutil.rtrim( lblTextblock_mensaje_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "vSDT_OPERARIO_Opecnom", AV18SDT_Operario.getgxTv_SdtSDT_Operario_Opecnom());
      app.GxWebStd.gx_hidden_field( httpContext, "vSDT_MAQUINA_Maqcdsc", AV17SDT_Maquina.getgxTv_SdtSDT_Maquina_Maqcdsc());
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTBLOCK_MENSAJE_Caption", GXutil.rtrim( lblTextblock_mensaje_Caption));
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
         we1572( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1572( ) ;
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
      return formatLink("app.expedicionesautomatizadas.webwopeexp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ExpedicionesAutomatizadas.WebWOPEEXP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Web WOPEEXP", "") ;
   }

   public void wb1570( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableTransactionTemplate", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainTransaction", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableunificadora_1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableoperario.setProperty("Width", Dvpanel_tableoperario_Width);
         ucDvpanel_tableoperario.setProperty("AutoWidth", Dvpanel_tableoperario_Autowidth);
         ucDvpanel_tableoperario.setProperty("AutoHeight", Dvpanel_tableoperario_Autoheight);
         ucDvpanel_tableoperario.setProperty("Cls", Dvpanel_tableoperario_Cls);
         ucDvpanel_tableoperario.setProperty("Title", Dvpanel_tableoperario_Title);
         ucDvpanel_tableoperario.setProperty("Collapsible", Dvpanel_tableoperario_Collapsible);
         ucDvpanel_tableoperario.setProperty("Collapsed", Dvpanel_tableoperario_Collapsed);
         ucDvpanel_tableoperario.setProperty("ShowCollapseIcon", Dvpanel_tableoperario_Showcollapseicon);
         ucDvpanel_tableoperario.setProperty("IconPosition", Dvpanel_tableoperario_Iconposition);
         ucDvpanel_tableoperario.setProperty("AutoScroll", Dvpanel_tableoperario_Autoscroll);
         ucDvpanel_tableoperario.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableoperario_Internalname, "DVPANEL_TABLEOPERARIOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEOPERARIOContainer"+"TableOperario"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableoperario_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOpecod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOpecod_Internalname, httpContext.getMessage( "Operario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOpecod_Internalname, hV13OpeCod, GXutil.rtrim( localUtil.format( hV13OpeCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOpecod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOpecod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOpepass_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOpepass_Internalname, httpContext.getMessage( "Password", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOpepass_Internalname, GXutil.rtrim( AV14OpePass), GXutil.rtrim( localUtil.format( AV14OpePass, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\""+" "+"data-gx-password-reveal"+" ", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "Contraseña", ""), edtavOpepass_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOpepass_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(-1), (short)(0), 0, (byte)(0), (byte)(0), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         ClassString = "BtnCheck" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnvalidaroperario_Internalname, "", httpContext.getMessage( "Valida", ""), bttBtnvalidaroperario_Jsonclick, 5, httpContext.getMessage( "Valida", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOVALIDAROPERARIO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_tablemaquina_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_tablemaquina_cell_Class, "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tablemaquina.setProperty("Width", Dvpanel_tablemaquina_Width);
         ucDvpanel_tablemaquina.setProperty("AutoWidth", Dvpanel_tablemaquina_Autowidth);
         ucDvpanel_tablemaquina.setProperty("AutoHeight", Dvpanel_tablemaquina_Autoheight);
         ucDvpanel_tablemaquina.setProperty("Cls", Dvpanel_tablemaquina_Cls);
         ucDvpanel_tablemaquina.setProperty("Title", Dvpanel_tablemaquina_Title);
         ucDvpanel_tablemaquina.setProperty("Collapsible", Dvpanel_tablemaquina_Collapsible);
         ucDvpanel_tablemaquina.setProperty("Collapsed", Dvpanel_tablemaquina_Collapsed);
         ucDvpanel_tablemaquina.setProperty("ShowCollapseIcon", Dvpanel_tablemaquina_Showcollapseicon);
         ucDvpanel_tablemaquina.setProperty("IconPosition", Dvpanel_tablemaquina_Iconposition);
         ucDvpanel_tablemaquina.setProperty("AutoScroll", Dvpanel_tablemaquina_Autoscroll);
         ucDvpanel_tablemaquina.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablemaquina_Internalname, "DVPANEL_TABLEMAQUINAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEMAQUINAContainer"+"TableMaquina"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemaquina_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcod_Internalname, httpContext.getMessage( "Código Máquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, hV11MaqCod, GXutil.rtrim( localUtil.format( hV11MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         ClassString = "BtnToggleActive" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnvalidarmaquina_Internalname, "", httpContext.getMessage( "Valida", ""), bttBtnvalidarmaquina_Jsonclick, 5, httpContext.getMessage( "Valida", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOVALIDARMAQUINA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableunificadora_2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_tablehdr_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_tablehdr_cell_Class, "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tablehdr.setProperty("Width", Dvpanel_tablehdr_Width);
         ucDvpanel_tablehdr.setProperty("AutoWidth", Dvpanel_tablehdr_Autowidth);
         ucDvpanel_tablehdr.setProperty("AutoHeight", Dvpanel_tablehdr_Autoheight);
         ucDvpanel_tablehdr.setProperty("Cls", Dvpanel_tablehdr_Cls);
         ucDvpanel_tablehdr.setProperty("Title", Dvpanel_tablehdr_Title);
         ucDvpanel_tablehdr.setProperty("Collapsible", Dvpanel_tablehdr_Collapsible);
         ucDvpanel_tablehdr.setProperty("Collapsed", Dvpanel_tablehdr_Collapsed);
         ucDvpanel_tablehdr.setProperty("ShowCollapseIcon", Dvpanel_tablehdr_Showcollapseicon);
         ucDvpanel_tablehdr.setProperty("IconPosition", Dvpanel_tablehdr_Iconposition);
         ucDvpanel_tablehdr.setProperty("AutoScroll", Dvpanel_tablehdr_Autoscroll);
         ucDvpanel_tablehdr.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablehdr_Internalname, "DVPANEL_TABLEHDRContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEHDRContainer"+"TableHDR"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablehdr_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarhdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarhdr_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarhdr_Internalname, GXutil.rtrim( AV46BarHdr), GXutil.rtrim( localUtil.format( AV46BarHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarhdr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnvalidarhdr_Internalname, "", httpContext.getMessage( "Valida", ""), bttBtnvalidarhdr_Jsonclick, 5, httpContext.getMessage( "Valida", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOVALIDARHDR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Hdr Cod", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "Reoperado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV44BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV44BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV44BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "Particion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV43BarCodPar), GXutil.rtrim( localUtil.format( AV43BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_tableinformacion_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_tableinformacion_cell_Class, "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableinformacion.setProperty("Width", Dvpanel_tableinformacion_Width);
         ucDvpanel_tableinformacion.setProperty("AutoWidth", Dvpanel_tableinformacion_Autowidth);
         ucDvpanel_tableinformacion.setProperty("AutoHeight", Dvpanel_tableinformacion_Autoheight);
         ucDvpanel_tableinformacion.setProperty("Cls", Dvpanel_tableinformacion_Cls);
         ucDvpanel_tableinformacion.setProperty("Title", Dvpanel_tableinformacion_Title);
         ucDvpanel_tableinformacion.setProperty("Collapsible", Dvpanel_tableinformacion_Collapsible);
         ucDvpanel_tableinformacion.setProperty("Collapsed", Dvpanel_tableinformacion_Collapsed);
         ucDvpanel_tableinformacion.setProperty("ShowCollapseIcon", Dvpanel_tableinformacion_Showcollapseicon);
         ucDvpanel_tableinformacion.setProperty("IconPosition", Dvpanel_tableinformacion_Iconposition);
         ucDvpanel_tableinformacion.setProperty("AutoScroll", Dvpanel_tableinformacion_Autoscroll);
         ucDvpanel_tableinformacion.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableinformacion_Internalname, "DVPANEL_TABLEINFORMACIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEINFORMACIONContainer"+"TableInformacion"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableinformacion_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         wb_table1_80_1572( true) ;
      }
      else
      {
         wb_table1_80_1572( false) ;
      }
      return  ;
   }

   public void wb_table1_80_1572e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecnom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecnom_Internalname, GXutil.rtrim( AV32LecNom), GXutil.rtrim( localUtil.format( AV32LecNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecnom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         wb_table2_91_1572( true) ;
      }
      else
      {
         wb_table2_91_1572( false) ;
      }
      return  ;
   }

   public void wb_table2_91_1572e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecfasnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecfasnom_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecfasnom_Internalname, GXutil.rtrim( AV27LecFasNom), GXutil.rtrim( localUtil.format( AV27LecFasNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecfasnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecfasnom_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecparnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecparnom_Internalname, httpContext.getMessage( "Paro", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecparnom_Internalname, GXutil.rtrim( AV35LecParNom), GXutil.rtrim( localUtil.format( AV35LecParNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,115);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecparnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecparnom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVdesestado_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavVdesestado_Internalname, httpContext.getMessage( "ESTADO", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavVdesestado_Internalname, GXutil.rtrim( AV101vDesEstado), GXutil.rtrim( localUtil.format( AV101vDesEstado, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVdesestado_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavVdesestado_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_table_mensajes.setProperty("Width", Dvpanel_table_mensajes_Width);
         ucDvpanel_table_mensajes.setProperty("AutoWidth", Dvpanel_table_mensajes_Autowidth);
         ucDvpanel_table_mensajes.setProperty("AutoHeight", Dvpanel_table_mensajes_Autoheight);
         ucDvpanel_table_mensajes.setProperty("Cls", Dvpanel_table_mensajes_Cls);
         ucDvpanel_table_mensajes.setProperty("Title", Dvpanel_table_mensajes_Title);
         ucDvpanel_table_mensajes.setProperty("Collapsible", Dvpanel_table_mensajes_Collapsible);
         ucDvpanel_table_mensajes.setProperty("Collapsed", Dvpanel_table_mensajes_Collapsed);
         ucDvpanel_table_mensajes.setProperty("ShowCollapseIcon", Dvpanel_table_mensajes_Showcollapseicon);
         ucDvpanel_table_mensajes.setProperty("IconPosition", Dvpanel_table_mensajes_Iconposition);
         ucDvpanel_table_mensajes.setProperty("AutoScroll", Dvpanel_table_mensajes_Autoscroll);
         ucDvpanel_table_mensajes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_table_mensajes_Internalname, "DVPANEL_TABLE_MENSAJESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLE_MENSAJESContainer"+"Table_Mensajes"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_mensajes_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock_mensaje_Internalname, lblTextblock_mensaje_Caption, "", "", lblTextblock_mensaje_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
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
         ucDvpanel_tablevariables.setProperty("Width", Dvpanel_tablevariables_Width);
         ucDvpanel_tablevariables.setProperty("AutoWidth", Dvpanel_tablevariables_Autowidth);
         ucDvpanel_tablevariables.setProperty("AutoHeight", Dvpanel_tablevariables_Autoheight);
         ucDvpanel_tablevariables.setProperty("Cls", Dvpanel_tablevariables_Cls);
         ucDvpanel_tablevariables.setProperty("Title", Dvpanel_tablevariables_Title);
         ucDvpanel_tablevariables.setProperty("Collapsible", Dvpanel_tablevariables_Collapsible);
         ucDvpanel_tablevariables.setProperty("Collapsed", Dvpanel_tablevariables_Collapsed);
         ucDvpanel_tablevariables.setProperty("ShowCollapseIcon", Dvpanel_tablevariables_Showcollapseicon);
         ucDvpanel_tablevariables.setProperty("IconPosition", Dvpanel_tablevariables_Iconposition);
         ucDvpanel_tablevariables.setProperty("AutoScroll", Dvpanel_tablevariables_Autoscroll);
         ucDvpanel_tablevariables.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablevariables_Internalname, "DVPANEL_TABLEVARIABLESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEVARIABLESContainer"+"TableVariables"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablevariables_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavIntentospassword_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIntentospassword_Internalname, httpContext.getMessage( "Intentos Password", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntentospassword_Internalname, GXutil.ltrim( localUtil.ntoc( AV9IntentosPassword, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIntentospassword_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9IntentosPassword), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9IntentosPassword), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntentospassword_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIntentospassword_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFlagcb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFlagcb_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFlagcb_Internalname, GXutil.ltrim( localUtil.ntoc( AV73FlagCB, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFlagcb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV73FlagCB), "9") : localUtil.format( DecimalUtil.doubleToDec(AV73FlagCB), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,140);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFlagcb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFlagcb_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFlagribes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFlagribes_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFlagribes_Internalname, GXutil.ltrim( localUtil.ntoc( AV75FlagRibes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFlagribes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV75FlagRibes), "9") : localUtil.format( DecimalUtil.doubleToDec(AV75FlagRibes), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFlagribes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFlagribes_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFlagsit_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFlagsit_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFlagsit_Internalname, GXutil.ltrim( localUtil.ntoc( AV76FlagSit, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFlagsit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV76FlagSit), "9") : localUtil.format( DecimalUtil.doubleToDec(AV76FlagSit), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,148);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFlagsit_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFlagsit_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMagosa_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMagosa_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMagosa_Internalname, GXutil.ltrim( localUtil.ntoc( AV86Magosa, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMagosa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV86Magosa), "9") : localUtil.format( DecimalUtil.doubleToDec(AV86Magosa), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,152);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMagosa_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMagosa_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFinite_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFinite_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFinite_Internalname, GXutil.ltrim( localUtil.ntoc( AV71Finite, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFinite_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV71Finite), "9") : localUtil.format( DecimalUtil.doubleToDec(AV71Finite), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,157);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFinite_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFinite_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavJbp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavJbp_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavJbp_Internalname, GXutil.ltrim( localUtil.ntoc( AV81JBP, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavJbp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV81JBP), "9") : localUtil.format( DecimalUtil.doubleToDec(AV81JBP), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavJbp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavJbp_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEstamp_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEstamp_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEstamp_Internalname, GXutil.ltrim( localUtil.ntoc( AV61Estamp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavEstamp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV61Estamp), "9") : localUtil.format( DecimalUtil.doubleToDec(AV61Estamp), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,165);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEstamp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEstamp_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavTintutex.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavTintutex.getInternalname(), httpContext.getMessage( "Dom_Check_Number_1_0", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavTintutex.getInternalname(), GXutil.str( AV20Tintutex, 1, 0), "", httpContext.getMessage( "Dom_Check_Number_1_0", ""), 1, chkavTintutex.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(169, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,169);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTinest_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTinest_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTinest_Internalname, GXutil.ltrim( localUtil.ntoc( AV100TinEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTinest_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV100TinEst), "9") : localUtil.format( DecimalUtil.doubleToDec(AV100TinEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,173);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTinest_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTinest_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTinamar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTinamar_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTinamar_Internalname, GXutil.ltrim( localUtil.ntoc( AV99Tinamar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTinamar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV99Tinamar), "9") : localUtil.format( DecimalUtil.doubleToDec(AV99Tinamar), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,178);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTinamar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTinamar_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFasman_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFasman_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 182,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFasman_Internalname, GXutil.ltrim( localUtil.ntoc( AV68FasMan, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFasman_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV68FasMan), "9") : localUtil.format( DecimalUtil.doubleToDec(AV68FasMan), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,182);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFasman_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFasman_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavJbmartin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavJbmartin_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavJbmartin_Internalname, GXutil.ltrim( localUtil.ntoc( AV80JBMartin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavJbmartin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV80JBMartin), "9") : localUtil.format( DecimalUtil.doubleToDec(AV80JBMartin), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavJbmartin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavJbmartin_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavF_vt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavF_vt_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 190,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavF_vt_Internalname, GXutil.ltrim( localUtil.ntoc( AV64F_vt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavF_vt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV64F_vt), "9") : localUtil.format( DecimalUtil.doubleToDec(AV64F_vt), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,190);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavF_vt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavF_vt_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHidro_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHidro_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHidro_Internalname, GXutil.ltrim( localUtil.ntoc( AV79Hidro, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHidro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV79Hidro), "9") : localUtil.format( DecimalUtil.doubleToDec(AV79Hidro), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHidro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHidro_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFidel_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFidel_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFidel_Internalname, GXutil.ltrim( localUtil.ntoc( AV70Fidel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFidel_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV70Fidel), "9") : localUtil.format( DecimalUtil.doubleToDec(AV70Fidel), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFidel_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFidel_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCiehri_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCiehri_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCiehri_Internalname, GXutil.ltrim( localUtil.ntoc( AV51CieHrI, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCiehri_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV51CieHrI), "9") : localUtil.format( DecimalUtil.doubleToDec(AV51CieHrI), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,203);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCiehri_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCiehri_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCierre_hdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCierre_hdr_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 207,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCierre_hdr_Internalname, GXutil.ltrim( localUtil.ntoc( AV52Cierre_Hdr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCierre_hdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV52Cierre_Hdr), "9") : localUtil.format( DecimalUtil.doubleToDec(AV52Cierre_Hdr), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,207);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCierre_hdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCierre_hdr_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRevhdm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRevhdm_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRevhdm_Internalname, GXutil.ltrim( localUtil.ntoc( AV96Revhdm, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRevhdm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV96Revhdm), "9") : localUtil.format( DecimalUtil.doubleToDec(AV96Revhdm), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRevhdm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRevhdm_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetsim_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetsim_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 215,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetsim_Internalname, GXutil.ltrim( localUtil.ntoc( AV90MetSim, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetsim_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV90MetSim), "9") : localUtil.format( DecimalUtil.doubleToDec(AV90MetSim), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,215);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetsim_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetsim_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavExpsindetail_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavExpsindetail_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 220,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavExpsindetail_Internalname, GXutil.ltrim( localUtil.ntoc( AV63ExpSinDetail, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavExpsindetail_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV63ExpSinDetail), "9") : localUtil.format( DecimalUtil.doubleToDec(AV63ExpSinDetail), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,220);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavExpsindetail_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavExpsindetail_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCarolina_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCarolina_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCarolina_Internalname, GXutil.ltrim( localUtil.ntoc( AV50Carolina, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCarolina_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV50Carolina), "9") : localUtil.format( DecimalUtil.doubleToDec(AV50Carolina), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,224);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCarolina_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCarolina_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavKgmt_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavKgmt_Internalname, httpContext.getMessage( "Utliza Agua Rehuso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 228,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavKgmt_Internalname, GXutil.rtrim( AV82KgMt), GXutil.rtrim( localUtil.format( AV82KgMt, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,228);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavKgmt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavKgmt_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavKgmtcc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavKgmtcc_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 232,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavKgmtcc_Internalname, GXutil.ltrim( localUtil.ntoc( AV83KgMtcc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavKgmtcc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV83KgMtcc), "9") : localUtil.format( DecimalUtil.doubleToDec(AV83KgMtcc), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,232);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavKgmtcc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavKgmtcc_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCosfrac_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCosfrac_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCosfrac_Internalname, GXutil.ltrim( localUtil.ntoc( AV56CosFrac, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCosfrac_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV56CosFrac), "9") : localUtil.format( DecimalUtil.doubleToDec(AV56CosFrac), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCosfrac_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCosfrac_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavExpcondetail_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavExpcondetail_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavExpcondetail_Internalname, GXutil.ltrim( localUtil.ntoc( AV62Expcondetail, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavExpcondetail_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV62Expcondetail), "9") : localUtil.format( DecimalUtil.doubleToDec(AV62Expcondetail), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavExpcondetail_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavExpcondetail_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPzastrozos_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPzastrozos_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 245,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPzastrozos_Internalname, GXutil.ltrim( localUtil.ntoc( AV95PzasTrozos, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPzastrozos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV95PzasTrozos), "9") : localUtil.format( DecimalUtil.doubleToDec(AV95PzasTrozos), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,245);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPzastrozos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPzastrozos_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPass00_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPass00_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPass00_Internalname, GXutil.ltrim( localUtil.ntoc( AV93Pass00, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPass00_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV93Pass00), "9") : localUtil.format( DecimalUtil.doubleToDec(AV93Pass00), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,249);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPass00_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPass00_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFssgts_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFssgts_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 253,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFssgts_Internalname, GXutil.ltrim( localUtil.ntoc( AV77FsSgts, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFssgts_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV77FsSgts), "9") : localUtil.format( DecimalUtil.doubleToDec(AV77FsSgts), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,253);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFssgts_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFssgts_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavContadorcarvema_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavContadorcarvema_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 257,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavContadorcarvema_Internalname, GXutil.ltrim( localUtil.ntoc( AV54ContadorCarvema, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavContadorcarvema_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV54ContadorCarvema), "9") : localUtil.format( DecimalUtil.doubleToDec(AV54ContadorCarvema), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,257);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavContadorcarvema_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavContadorcarvema_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavContadorerfoc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavContadorerfoc_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 262,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavContadorerfoc_Internalname, GXutil.ltrim( localUtil.ntoc( AV55ContadorErfoc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavContadorerfoc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV55ContadorErfoc), "9") : localUtil.format( DecimalUtil.doubleToDec(AV55ContadorErfoc), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,262);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavContadorerfoc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavContadorerfoc_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBianco_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBianco_Internalname, httpContext.getMessage( "Flag", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBianco_Internalname, GXutil.ltrim( localUtil.ntoc( AV49bianco, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBianco_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV49bianco), "9") : localUtil.format( DecimalUtil.doubleToDec(AV49bianco), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,266);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBianco_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBianco_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "ExpedicionesAutomatizadas\\Flag", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavNoproc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavNoproc_Internalname, httpContext.getMessage( "Descripcion Contador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 270,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNoproc_Internalname, GXutil.rtrim( AV91NoProc), GXutil.rtrim( localUtil.format( AV91NoProc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,270);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNoproc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavNoproc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 275,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 277,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtncancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV106Pgmname), GXutil.rtrim( localUtil.format( AV106Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 288,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecmaqnom_Internalname, GXutil.rtrim( AV31LecMaqNom), GXutil.rtrim( localUtil.format( AV31LecMaqNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,288);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecmaqnom_Jsonclick, 0, "Attribute", "", "", "", "", edtavLecmaqnom_Visible, 1, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1572( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Web WOPEEXP", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1570( ) ;
   }

   public void ws1572( )
   {
      start1572( ) ;
      evt1572( ) ;
   }

   public void evt1572( )
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
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e111572 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOVALIDARHDR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoValidarHDR' */
                           e121572 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOVALIDARMAQUINA'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoValidarMaquina' */
                           e131572 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOVALIDAROPERARIO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoValidarOperario' */
                           e141572 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VOPEPASS.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151572 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMAQCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161572 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARHDR.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e171572 ();
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
                                 e181572 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e191572 ();
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

   public void we1572( )
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

   public void pa1572( )
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
            GX_FocusControl = edtavOpecod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvopecod1570( String A13748OpeCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvopecod_data1570( A13748OpeCNom) ;
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

   protected void gxsgvvopecod_data1570( String A13748OpeCNom )
   {
      l13748OpeCNom = GXutil.concat( GXutil.rtrim( A13748OpeCNom), "%", "") ;
      /* Using cursor H01572 */
      pr_default.execute(0, new Object[] {l13748OpeCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H01572_A13748OpeCNom[0]);
         gxdynajaxctrldescr.add(H01572_A13748OpeCNom[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvmaqcod1570( String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmaqcod_data1570( A13734MaqCDsc) ;
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

   protected void gxsgvvmaqcod_data1570( String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H01573 */
      pr_default.execute(1, new Object[] {l13734MaqCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(H01573_A13734MaqCDsc[0]);
         gxdynajaxctrldescr.add(H01573_A13734MaqCDsc[0]);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxsgvvlecmaqcod1570( String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvlecmaqcod_data1570( A13734MaqCDsc) ;
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

   protected void gxsgvvlecmaqcod_data1570( String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H01574 */
      pr_default.execute(2, new Object[] {l13734MaqCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(2) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01574_A13734MaqCDsc[0]) , GXutil.padr( GXutil.upper( A13734MaqCDsc) , 254 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01574_A13734MaqCDsc[0]);
            gxdynajaxctrldescr.add(H01574_A13734MaqCDsc[0]);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxhcvvopecod1572( String A13748OpeCNom )
   {
      /* Using cursor H01575 */
      pr_default.execute(3, new Object[] {A13748OpeCNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A8482OpeAct = H01575_A8482OpeAct[0] ;
         n8482OpeAct = H01575_n8482OpeAct[0] ;
         A13748OpeCNom = H01575_A13748OpeCNom[0] ;
         A396EmprCod = H01575_A396EmprCod[0] ;
         A652OpeCod = H01575_A652OpeCod[0] ;
         pr_default.readNext(3);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(3);
   }

   public void gxhcvvmaqcod1572( String A13734MaqCDsc )
   {
      /* Using cursor H01576 */
      pr_default.execute(4, new Object[] {A13734MaqCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(4) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A607MaqEst = H01576_A607MaqEst[0] ;
         n607MaqEst = H01576_n607MaqEst[0] ;
         A13734MaqCDsc = H01576_A13734MaqCDsc[0] ;
         A396EmprCod = H01576_A396EmprCod[0] ;
         A602MaqCod = H01576_A602MaqCod[0] ;
         pr_default.readNext(4);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
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
      pr_default.close(4);
   }

   public void gxhcvvlecmaqcod1572( String A13734MaqCDsc )
   {
      /* Using cursor H01577 */
      pr_default.execute(5, new Object[] {A13734MaqCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(5) != 101) )
      {
         if ( GXutil.strcmp(H01577_A13734MaqCDsc[0], A13734MaqCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13734MaqCDsc = H01577_A13734MaqCDsc[0] ;
            A396EmprCod = H01577_A396EmprCod[0] ;
            A602MaqCod = H01577_A602MaqCod[0] ;
         }
         pr_default.readNext(5);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
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
      pr_default.close(5);
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
      AV20Tintutex = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV20Tintutex, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Tintutex", GXutil.str( AV20Tintutex, 1, 0));
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1572( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV106Pgmname = "ExpedicionesAutomatizadas.WebWOPEEXP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106Pgmname", AV106Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavLecmaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecmaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecmaqcod_Enabled), 5, 0), true);
      edtavLecbarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecbarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarcod_Enabled), 5, 0), true);
      edtavLecbarreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecbarreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarreo_Enabled), 5, 0), true);
      edtavLecbarpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecbarpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarpar_Enabled), 5, 0), true);
      edtavLecfasnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecfasnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecfasnom_Enabled), 5, 0), true);
      edtavLecparnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecparnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecparnom_Enabled), 5, 0), true);
      edtavVdesestado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVdesestado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVdesestado_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1572( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e191572 ();
         wb1570( ) ;
      }
   }

   public void send_integrity_lvl_hashes1572( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vESTADOANT", GXutil.ltrim( localUtil.ntoc( AV60EstadoAnt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vESTADOANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60EstadoAnt), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROF", GXutil.rtrim( AV36HisProf));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHISPROF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36HisProf, "@!"))));
   }

   public void before_start_formulas( )
   {
      AV106Pgmname = "ExpedicionesAutomatizadas.WebWOPEEXP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106Pgmname", AV106Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavLecmaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecmaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecmaqcod_Enabled), 5, 0), true);
      edtavLecbarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecbarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarcod_Enabled), 5, 0), true);
      edtavLecbarreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecbarreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarreo_Enabled), 5, 0), true);
      edtavLecbarpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecbarpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecbarpar_Enabled), 5, 0), true);
      edtavLecfasnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecfasnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecfasnom_Enabled), 5, 0), true);
      edtavLecparnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecparnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecparnom_Enabled), 5, 0), true);
      edtavVdesestado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVdesestado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVdesestado_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1570( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111572 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_tableoperario_Width = httpContext.cgiGet( "DVPANEL_TABLEOPERARIO_Width") ;
         Dvpanel_tableoperario_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEOPERARIO_Autowidth")) ;
         Dvpanel_tableoperario_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEOPERARIO_Autoheight")) ;
         Dvpanel_tableoperario_Cls = httpContext.cgiGet( "DVPANEL_TABLEOPERARIO_Cls") ;
         Dvpanel_tableoperario_Title = httpContext.cgiGet( "DVPANEL_TABLEOPERARIO_Title") ;
         Dvpanel_tableoperario_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEOPERARIO_Collapsible")) ;
         Dvpanel_tableoperario_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEOPERARIO_Collapsed")) ;
         Dvpanel_tableoperario_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEOPERARIO_Showcollapseicon")) ;
         Dvpanel_tableoperario_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEOPERARIO_Iconposition") ;
         Dvpanel_tableoperario_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEOPERARIO_Autoscroll")) ;
         Dvpanel_tablemaquina_Width = httpContext.cgiGet( "DVPANEL_TABLEMAQUINA_Width") ;
         Dvpanel_tablemaquina_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEMAQUINA_Autowidth")) ;
         Dvpanel_tablemaquina_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEMAQUINA_Autoheight")) ;
         Dvpanel_tablemaquina_Cls = httpContext.cgiGet( "DVPANEL_TABLEMAQUINA_Cls") ;
         Dvpanel_tablemaquina_Title = httpContext.cgiGet( "DVPANEL_TABLEMAQUINA_Title") ;
         Dvpanel_tablemaquina_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEMAQUINA_Collapsible")) ;
         Dvpanel_tablemaquina_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEMAQUINA_Collapsed")) ;
         Dvpanel_tablemaquina_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEMAQUINA_Showcollapseicon")) ;
         Dvpanel_tablemaquina_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEMAQUINA_Iconposition") ;
         Dvpanel_tablemaquina_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEMAQUINA_Autoscroll")) ;
         Dvpanel_tablehdr_Width = httpContext.cgiGet( "DVPANEL_TABLEHDR_Width") ;
         Dvpanel_tablehdr_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHDR_Autowidth")) ;
         Dvpanel_tablehdr_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHDR_Autoheight")) ;
         Dvpanel_tablehdr_Cls = httpContext.cgiGet( "DVPANEL_TABLEHDR_Cls") ;
         Dvpanel_tablehdr_Title = httpContext.cgiGet( "DVPANEL_TABLEHDR_Title") ;
         Dvpanel_tablehdr_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHDR_Collapsible")) ;
         Dvpanel_tablehdr_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHDR_Collapsed")) ;
         Dvpanel_tablehdr_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHDR_Showcollapseicon")) ;
         Dvpanel_tablehdr_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEHDR_Iconposition") ;
         Dvpanel_tablehdr_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHDR_Autoscroll")) ;
         Dvpanel_tableinformacion_Width = httpContext.cgiGet( "DVPANEL_TABLEINFORMACION_Width") ;
         Dvpanel_tableinformacion_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEINFORMACION_Autowidth")) ;
         Dvpanel_tableinformacion_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEINFORMACION_Autoheight")) ;
         Dvpanel_tableinformacion_Cls = httpContext.cgiGet( "DVPANEL_TABLEINFORMACION_Cls") ;
         Dvpanel_tableinformacion_Title = httpContext.cgiGet( "DVPANEL_TABLEINFORMACION_Title") ;
         Dvpanel_tableinformacion_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEINFORMACION_Collapsible")) ;
         Dvpanel_tableinformacion_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEINFORMACION_Collapsed")) ;
         Dvpanel_tableinformacion_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEINFORMACION_Showcollapseicon")) ;
         Dvpanel_tableinformacion_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEINFORMACION_Iconposition") ;
         Dvpanel_tableinformacion_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEINFORMACION_Autoscroll")) ;
         Dvpanel_table_mensajes_Width = httpContext.cgiGet( "DVPANEL_TABLE_MENSAJES_Width") ;
         Dvpanel_table_mensajes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_MENSAJES_Autowidth")) ;
         Dvpanel_table_mensajes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_MENSAJES_Autoheight")) ;
         Dvpanel_table_mensajes_Cls = httpContext.cgiGet( "DVPANEL_TABLE_MENSAJES_Cls") ;
         Dvpanel_table_mensajes_Title = httpContext.cgiGet( "DVPANEL_TABLE_MENSAJES_Title") ;
         Dvpanel_table_mensajes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_MENSAJES_Collapsible")) ;
         Dvpanel_table_mensajes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_MENSAJES_Collapsed")) ;
         Dvpanel_table_mensajes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_MENSAJES_Showcollapseicon")) ;
         Dvpanel_table_mensajes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLE_MENSAJES_Iconposition") ;
         Dvpanel_table_mensajes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLE_MENSAJES_Autoscroll")) ;
         Dvpanel_tablevariables_Width = httpContext.cgiGet( "DVPANEL_TABLEVARIABLES_Width") ;
         Dvpanel_tablevariables_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEVARIABLES_Autowidth")) ;
         Dvpanel_tablevariables_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEVARIABLES_Autoheight")) ;
         Dvpanel_tablevariables_Cls = httpContext.cgiGet( "DVPANEL_TABLEVARIABLES_Cls") ;
         Dvpanel_tablevariables_Title = httpContext.cgiGet( "DVPANEL_TABLEVARIABLES_Title") ;
         Dvpanel_tablevariables_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEVARIABLES_Collapsible")) ;
         Dvpanel_tablevariables_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEVARIABLES_Collapsed")) ;
         Dvpanel_tablevariables_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEVARIABLES_Showcollapseicon")) ;
         Dvpanel_tablevariables_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEVARIABLES_Iconposition") ;
         Dvpanel_tablevariables_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEVARIABLES_Autoscroll")) ;
         lblTextblock_mensaje_Caption = httpContext.cgiGet( "TEXTBLOCK_MENSAJE_Caption") ;
         /* Read variables values. */
         hV13OpeCod = httpContext.cgiGet( edtavOpecod_Internalname) ;
         if ( (GXutil.strcmp("", hV13OpeCod)==0) )
         {
            AV13OpeCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OpeCod), 6, 0));
         }
         else
         {
            A13748OpeCNom = hV13OpeCod ;
            /* Using cursor H01578 */
            pr_default.execute(6, new Object[] {A13748OpeCNom});
            AV13OpeCod = H01578_A652OpeCod[0] ;
            if ( ! ( (pr_default.getStatus(6) == 101) ) )
            {
               pr_default.readNext(6);
               if ( ! ( (pr_default.getStatus(6) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Nombre", "")}), 1, "vOPECOD");
                  GX_FocusControl = edtavOpecod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(6);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV13OpeCod", hV13OpeCod);
         AV14OpePass = httpContext.cgiGet( edtavOpepass_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14OpePass", AV14OpePass);
         hV11MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         if ( (GXutil.strcmp("", hV11MaqCod)==0) )
         {
            AV11MaqCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11MaqCod", AV11MaqCod);
         }
         else
         {
            A13734MaqCDsc = hV11MaqCod ;
            /* Using cursor H01579 */
            pr_default.execute(7, new Object[] {A13734MaqCDsc});
            AV11MaqCod = H01579_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(7) == 101) ) )
            {
               pr_default.readNext(7);
               if ( ! ( (pr_default.getStatus(7) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCOD");
                  GX_FocusControl = edtavMaqcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(7);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV11MaqCod", hV11MaqCod);
         AV46BarHdr = httpContext.cgiGet( edtavBarhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46BarHdr", AV46BarHdr);
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
            AV44BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44BarCodReo", GXutil.str( AV44BarCodReo, 1, 0));
         }
         else
         {
            AV44BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44BarCodReo", GXutil.str( AV44BarCodReo, 1, 0));
         }
         AV43BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43BarCodPar", AV43BarCodPar);
         hV10LecMaqCod = httpContext.cgiGet( edtavLecmaqcod_Internalname) ;
         if ( (GXutil.strcmp("", hV10LecMaqCod)==0) )
         {
            AV10LecMaqCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10LecMaqCod", AV10LecMaqCod);
         }
         else
         {
            A13734MaqCDsc = hV10LecMaqCod ;
            /* Using cursor H015710 */
            pr_default.execute(8, new Object[] {A13734MaqCDsc});
            AV10LecMaqCod = H015710_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               pr_default.readNext(8);
               if ( ! ( (pr_default.getStatus(8) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vLECMAQCOD");
                  GX_FocusControl = edtavLecmaqcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(8);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV10LecMaqCod", hV10LecMaqCod);
         AV32LecNom = httpContext.cgiGet( edtavLecnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32LecNom", AV32LecNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLecbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLecbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLECBARCOD");
            GX_FocusControl = edtavLecbarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23LecBarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23LecBarCod), 8, 0));
         }
         else
         {
            AV23LecBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavLecbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23LecBarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLecbarreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLecbarreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLECBARREO");
            GX_FocusControl = edtavLecbarreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV25LecBarReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25LecBarReo", GXutil.str( AV25LecBarReo, 1, 0));
         }
         else
         {
            AV25LecBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavLecbarreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25LecBarReo", GXutil.str( AV25LecBarReo, 1, 0));
         }
         AV24LecBarPar = httpContext.cgiGet( edtavLecbarpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24LecBarPar", AV24LecBarPar);
         AV27LecFasNom = httpContext.cgiGet( edtavLecfasnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27LecFasNom", AV27LecFasNom);
         AV35LecParNom = httpContext.cgiGet( edtavLecparnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35LecParNom", AV35LecParNom);
         AV101vDesEstado = httpContext.cgiGet( edtavVdesestado_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV101vDesEstado", AV101vDesEstado);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIntentospassword_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIntentospassword_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTENTOSPASSWORD");
            GX_FocusControl = edtavIntentospassword_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9IntentosPassword = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9IntentosPassword", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9IntentosPassword), 4, 0));
         }
         else
         {
            AV9IntentosPassword = (short)(localUtil.ctol( httpContext.cgiGet( edtavIntentospassword_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9IntentosPassword", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9IntentosPassword), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFlagcb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFlagcb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFLAGCB");
            GX_FocusControl = edtavFlagcb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV73FlagCB = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73FlagCB", GXutil.str( AV73FlagCB, 1, 0));
         }
         else
         {
            AV73FlagCB = (byte)(localUtil.ctol( httpContext.cgiGet( edtavFlagcb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73FlagCB", GXutil.str( AV73FlagCB, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFlagribes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFlagribes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFLAGRIBES");
            GX_FocusControl = edtavFlagribes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV75FlagRibes = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75FlagRibes", GXutil.str( AV75FlagRibes, 1, 0));
         }
         else
         {
            AV75FlagRibes = (byte)(localUtil.ctol( httpContext.cgiGet( edtavFlagribes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75FlagRibes", GXutil.str( AV75FlagRibes, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFlagsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFlagsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFLAGSIT");
            GX_FocusControl = edtavFlagsit_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV76FlagSit = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76FlagSit", GXutil.str( AV76FlagSit, 1, 0));
         }
         else
         {
            AV76FlagSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtavFlagsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76FlagSit", GXutil.str( AV76FlagSit, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMagosa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMagosa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAGOSA");
            GX_FocusControl = edtavMagosa_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV86Magosa = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86Magosa", GXutil.str( AV86Magosa, 1, 0));
         }
         else
         {
            AV86Magosa = (byte)(localUtil.ctol( httpContext.cgiGet( edtavMagosa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86Magosa", GXutil.str( AV86Magosa, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFinite_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFinite_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFINITE");
            GX_FocusControl = edtavFinite_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV71Finite = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71Finite", GXutil.str( AV71Finite, 1, 0));
         }
         else
         {
            AV71Finite = (byte)(localUtil.ctol( httpContext.cgiGet( edtavFinite_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71Finite", GXutil.str( AV71Finite, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavJbp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavJbp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vJBP");
            GX_FocusControl = edtavJbp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV81JBP = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81JBP", GXutil.str( AV81JBP, 1, 0));
         }
         else
         {
            AV81JBP = (byte)(localUtil.ctol( httpContext.cgiGet( edtavJbp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81JBP", GXutil.str( AV81JBP, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavEstamp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavEstamp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vESTAMP");
            GX_FocusControl = edtavEstamp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV61Estamp = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61Estamp", GXutil.str( AV61Estamp, 1, 0));
         }
         else
         {
            AV61Estamp = (byte)(localUtil.ctol( httpContext.cgiGet( edtavEstamp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61Estamp", GXutil.str( AV61Estamp, 1, 0));
         }
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavTintutex.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavTintutex.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTINTUTEX");
            GX_FocusControl = chkavTintutex.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20Tintutex = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Tintutex", GXutil.str( AV20Tintutex, 1, 0));
         }
         else
         {
            AV20Tintutex = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavTintutex.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Tintutex", GXutil.str( AV20Tintutex, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTinest_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTinest_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTINEST");
            GX_FocusControl = edtavTinest_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV100TinEst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TinEst", GXutil.str( AV100TinEst, 1, 0));
         }
         else
         {
            AV100TinEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTinest_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TinEst", GXutil.str( AV100TinEst, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTinamar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTinamar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTINAMAR");
            GX_FocusControl = edtavTinamar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV99Tinamar = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99Tinamar", GXutil.str( AV99Tinamar, 1, 0));
         }
         else
         {
            AV99Tinamar = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTinamar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99Tinamar", GXutil.str( AV99Tinamar, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFasman_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFasman_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFASMAN");
            GX_FocusControl = edtavFasman_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV68FasMan = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68FasMan", GXutil.str( AV68FasMan, 1, 0));
         }
         else
         {
            AV68FasMan = (byte)(localUtil.ctol( httpContext.cgiGet( edtavFasman_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68FasMan", GXutil.str( AV68FasMan, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavJbmartin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavJbmartin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vJBMARTIN");
            GX_FocusControl = edtavJbmartin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV80JBMartin = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80JBMartin", GXutil.str( AV80JBMartin, 1, 0));
         }
         else
         {
            AV80JBMartin = (byte)(localUtil.ctol( httpContext.cgiGet( edtavJbmartin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80JBMartin", GXutil.str( AV80JBMartin, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavF_vt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavF_vt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vF_VT");
            GX_FocusControl = edtavF_vt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV64F_vt = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64F_vt", GXutil.str( AV64F_vt, 1, 0));
         }
         else
         {
            AV64F_vt = (byte)(localUtil.ctol( httpContext.cgiGet( edtavF_vt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64F_vt", GXutil.str( AV64F_vt, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHidro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHidro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHIDRO");
            GX_FocusControl = edtavHidro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV79Hidro = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79Hidro", GXutil.str( AV79Hidro, 1, 0));
         }
         else
         {
            AV79Hidro = (byte)(localUtil.ctol( httpContext.cgiGet( edtavHidro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79Hidro", GXutil.str( AV79Hidro, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFidel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFidel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFIDEL");
            GX_FocusControl = edtavFidel_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV70Fidel = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70Fidel", GXutil.str( AV70Fidel, 1, 0));
         }
         else
         {
            AV70Fidel = (byte)(localUtil.ctol( httpContext.cgiGet( edtavFidel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70Fidel", GXutil.str( AV70Fidel, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCiehri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCiehri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCIEHRI");
            GX_FocusControl = edtavCiehri_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV51CieHrI = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51CieHrI", GXutil.str( AV51CieHrI, 1, 0));
         }
         else
         {
            AV51CieHrI = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCiehri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51CieHrI", GXutil.str( AV51CieHrI, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCierre_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCierre_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCIERRE_HDR");
            GX_FocusControl = edtavCierre_hdr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV52Cierre_Hdr = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52Cierre_Hdr", GXutil.str( AV52Cierre_Hdr, 1, 0));
         }
         else
         {
            AV52Cierre_Hdr = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCierre_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52Cierre_Hdr", GXutil.str( AV52Cierre_Hdr, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRevhdm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRevhdm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vREVHDM");
            GX_FocusControl = edtavRevhdm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV96Revhdm = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96Revhdm", GXutil.str( AV96Revhdm, 1, 0));
         }
         else
         {
            AV96Revhdm = (byte)(localUtil.ctol( httpContext.cgiGet( edtavRevhdm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96Revhdm", GXutil.str( AV96Revhdm, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMetsim_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMetsim_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETSIM");
            GX_FocusControl = edtavMetsim_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV90MetSim = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90MetSim", GXutil.str( AV90MetSim, 1, 0));
         }
         else
         {
            AV90MetSim = (byte)(localUtil.ctol( httpContext.cgiGet( edtavMetsim_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90MetSim", GXutil.str( AV90MetSim, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavExpsindetail_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavExpsindetail_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vEXPSINDETAIL");
            GX_FocusControl = edtavExpsindetail_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV63ExpSinDetail = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63ExpSinDetail", GXutil.str( AV63ExpSinDetail, 1, 0));
         }
         else
         {
            AV63ExpSinDetail = (byte)(localUtil.ctol( httpContext.cgiGet( edtavExpsindetail_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63ExpSinDetail", GXutil.str( AV63ExpSinDetail, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCarolina_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCarolina_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCAROLINA");
            GX_FocusControl = edtavCarolina_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV50Carolina = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50Carolina", GXutil.str( AV50Carolina, 1, 0));
         }
         else
         {
            AV50Carolina = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCarolina_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50Carolina", GXutil.str( AV50Carolina, 1, 0));
         }
         AV82KgMt = GXutil.upper( httpContext.cgiGet( edtavKgmt_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82KgMt", AV82KgMt);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavKgmtcc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavKgmtcc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKGMTCC");
            GX_FocusControl = edtavKgmtcc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV83KgMtcc = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83KgMtcc", GXutil.str( AV83KgMtcc, 1, 0));
         }
         else
         {
            AV83KgMtcc = (byte)(localUtil.ctol( httpContext.cgiGet( edtavKgmtcc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83KgMtcc", GXutil.str( AV83KgMtcc, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCosfrac_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCosfrac_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSFRAC");
            GX_FocusControl = edtavCosfrac_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV56CosFrac = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56CosFrac", GXutil.str( AV56CosFrac, 1, 0));
         }
         else
         {
            AV56CosFrac = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCosfrac_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56CosFrac", GXutil.str( AV56CosFrac, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavExpcondetail_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavExpcondetail_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vEXPCONDETAIL");
            GX_FocusControl = edtavExpcondetail_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV62Expcondetail = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62Expcondetail", GXutil.str( AV62Expcondetail, 1, 0));
         }
         else
         {
            AV62Expcondetail = (byte)(localUtil.ctol( httpContext.cgiGet( edtavExpcondetail_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62Expcondetail", GXutil.str( AV62Expcondetail, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPzastrozos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPzastrozos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPZASTROZOS");
            GX_FocusControl = edtavPzastrozos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV95PzasTrozos = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95PzasTrozos", GXutil.str( AV95PzasTrozos, 1, 0));
         }
         else
         {
            AV95PzasTrozos = (byte)(localUtil.ctol( httpContext.cgiGet( edtavPzastrozos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95PzasTrozos", GXutil.str( AV95PzasTrozos, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPass00_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPass00_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPASS00");
            GX_FocusControl = edtavPass00_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV93Pass00 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93Pass00", GXutil.str( AV93Pass00, 1, 0));
         }
         else
         {
            AV93Pass00 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavPass00_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93Pass00", GXutil.str( AV93Pass00, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFssgts_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFssgts_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFSSGTS");
            GX_FocusControl = edtavFssgts_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV77FsSgts = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77FsSgts", GXutil.str( AV77FsSgts, 1, 0));
         }
         else
         {
            AV77FsSgts = (byte)(localUtil.ctol( httpContext.cgiGet( edtavFssgts_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77FsSgts", GXutil.str( AV77FsSgts, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavContadorcarvema_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavContadorcarvema_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCONTADORCARVEMA");
            GX_FocusControl = edtavContadorcarvema_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV54ContadorCarvema = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54ContadorCarvema", GXutil.str( AV54ContadorCarvema, 1, 0));
         }
         else
         {
            AV54ContadorCarvema = (byte)(localUtil.ctol( httpContext.cgiGet( edtavContadorcarvema_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54ContadorCarvema", GXutil.str( AV54ContadorCarvema, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavContadorerfoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavContadorerfoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCONTADORERFOC");
            GX_FocusControl = edtavContadorerfoc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV55ContadorErfoc = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55ContadorErfoc", GXutil.str( AV55ContadorErfoc, 1, 0));
         }
         else
         {
            AV55ContadorErfoc = (byte)(localUtil.ctol( httpContext.cgiGet( edtavContadorerfoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55ContadorErfoc", GXutil.str( AV55ContadorErfoc, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBianco_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBianco_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBIANCO");
            GX_FocusControl = edtavBianco_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV49bianco = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49bianco", GXutil.str( AV49bianco, 1, 0));
         }
         else
         {
            AV49bianco = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBianco_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49bianco", GXutil.str( AV49bianco, 1, 0));
         }
         AV91NoProc = httpContext.cgiGet( edtavNoproc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV91NoProc", AV91NoProc);
         AV106Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV106Pgmname", AV106Pgmname);
         AV31LecMaqNom = httpContext.cgiGet( edtavLecmaqnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31LecMaqNom", AV31LecMaqNom);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"WebWOPEEXP");
         AV106Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV106Pgmname", AV106Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV106Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("expedicionesautomatizadas\\webwopeexp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e111572 ();
      if (returnInSub) return;
   }

   public void e111572( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwopeexp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwopeexp_impl.this.AV7EmprCod = GXv_char2[0] ;
      webwopeexp_impl.this.AV8EmprNom = GXv_char3[0] ;
      webwopeexp_impl.this.AV21UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
      GXt_char1 = AV7EmprCod ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerempresa(remoteHandle, context).execute( GXv_char4) ;
      webwopeexp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV7EmprCod = ((GXutil.strcmp("", AV7EmprCod)==0) ? GXt_char1 : AV7EmprCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      GXv_char4[0] = AV6ContDsc2 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "VERSEM", ""), GXv_char4) ;
      webwopeexp_impl.this.AV6ContDsc2 = GXv_char4[0] ;
      AV22Version = GXutil.substring( AV6ContDsc2, 1, 20) ;
      GXv_int5[0] = AV73FlagCB ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "HP710C", ""), GXv_int5) ;
      webwopeexp_impl.this.AV73FlagCB = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73FlagCB", GXutil.str( AV73FlagCB, 1, 0));
      GXv_int5[0] = AV86Magosa ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "MAGOSA", ""), GXv_int5) ;
      webwopeexp_impl.this.AV86Magosa = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86Magosa", GXutil.str( AV86Magosa, 1, 0));
      GXv_int5[0] = AV71Finite ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "FINITE", ""), GXv_int5) ;
      webwopeexp_impl.this.AV71Finite = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Finite", GXutil.str( AV71Finite, 1, 0));
      GXv_int5[0] = AV75FlagRibes ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "RIBES", ""), GXv_int5) ;
      webwopeexp_impl.this.AV75FlagRibes = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75FlagRibes", GXutil.str( AV75FlagRibes, 1, 0));
      GXv_int5[0] = AV76FlagSit ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "LECSIT", ""), GXv_int5) ;
      webwopeexp_impl.this.AV76FlagSit = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76FlagSit", GXutil.str( AV76FlagSit, 1, 0));
      GXv_int5[0] = AV81JBP ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "JBURGO", ""), GXv_int5) ;
      webwopeexp_impl.this.AV81JBP = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81JBP", GXutil.str( AV81JBP, 1, 0));
      GXv_int5[0] = AV61Estamp ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "ESTAMP", ""), GXv_int5) ;
      webwopeexp_impl.this.AV61Estamp = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Estamp", GXutil.str( AV61Estamp, 1, 0));
      GXv_int5[0] = AV100TinEst ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "TINEST", ""), GXv_int5) ;
      webwopeexp_impl.this.AV100TinEst = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100TinEst", GXutil.str( AV100TinEst, 1, 0));
      GXv_int5[0] = AV68FasMan ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "MAQMAN", ""), GXv_int5) ;
      webwopeexp_impl.this.AV68FasMan = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68FasMan", GXutil.str( AV68FasMan, 1, 0));
      GXv_int5[0] = AV80JBMartin ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "JBMAR", ""), GXv_int5) ;
      webwopeexp_impl.this.AV80JBMartin = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80JBMartin", GXutil.str( AV80JBMartin, 1, 0));
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "NOPROC", "") ;
      GXv_char2[0] = AV91NoProc ;
      new app.pexicond(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      webwopeexp_impl.this.AV7EmprCod = GXv_char4[0] ;
      webwopeexp_impl.this.AV91NoProc = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV91NoProc", AV91NoProc);
      GXv_int5[0] = AV64F_vt ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "VTABUA", ""), GXv_int5) ;
      webwopeexp_impl.this.AV64F_vt = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64F_vt", GXutil.str( AV64F_vt, 1, 0));
      GXv_int5[0] = AV79Hidro ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "HIDRO", ""), GXv_int5) ;
      webwopeexp_impl.this.AV79Hidro = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79Hidro", GXutil.str( AV79Hidro, 1, 0));
      GXv_int5[0] = AV70Fidel ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "FIDEL", ""), GXv_int5) ;
      webwopeexp_impl.this.AV70Fidel = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Fidel", GXutil.str( AV70Fidel, 1, 0));
      GXv_int5[0] = AV51CieHrI ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "CIEHRI", ""), GXv_int5) ;
      webwopeexp_impl.this.AV51CieHrI = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51CieHrI", GXutil.str( AV51CieHrI, 1, 0));
      GXv_int5[0] = AV52Cierre_Hdr ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "CIEHRP", ""), GXv_int5) ;
      webwopeexp_impl.this.AV52Cierre_Hdr = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Cierre_Hdr", GXutil.str( AV52Cierre_Hdr, 1, 0));
      GXt_int6 = AV96Revhdm ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "REVHDM", ""), GXv_int5) ;
      webwopeexp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV96Revhdm = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96Revhdm", GXutil.str( AV96Revhdm, 1, 0));
      GXt_int6 = AV90MetSim ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "METSIM", ""), GXv_int5) ;
      webwopeexp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV90MetSim = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90MetSim", GXutil.str( AV90MetSim, 1, 0));
      GXt_int7 = AV63ExpSinDetail ;
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "METSIM", "") ;
      GXv_int8[0] = GXt_int7 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8) ;
      webwopeexp_impl.this.AV7EmprCod = GXv_char4[0] ;
      webwopeexp_impl.this.GXt_int7 = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      AV63ExpSinDetail = (byte)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63ExpSinDetail", GXutil.str( AV63ExpSinDetail, 1, 0));
      GXt_int6 = AV50Carolina ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "CAROLI", ""), GXv_int5) ;
      webwopeexp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV50Carolina = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Carolina", GXutil.str( AV50Carolina, 1, 0));
      GXt_int6 = AV83KgMtcc ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "KGMTCC", ""), GXv_int5) ;
      webwopeexp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV83KgMtcc = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83KgMtcc", GXutil.str( AV83KgMtcc, 1, 0));
      GXt_int6 = AV56CosFrac ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "COSFRA", ""), GXv_int5) ;
      webwopeexp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV56CosFrac = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56CosFrac", GXutil.str( AV56CosFrac, 1, 0));
      GXt_int6 = AV62Expcondetail ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "DETAIL", ""), GXv_int5) ;
      webwopeexp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV62Expcondetail = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Expcondetail", GXutil.str( AV62Expcondetail, 1, 0));
      GXt_int6 = AV95PzasTrozos ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "PZSTRS", ""), GXv_int5) ;
      webwopeexp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV95PzasTrozos = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95PzasTrozos", GXutil.str( AV95PzasTrozos, 1, 0));
      GXt_int7 = AV93Pass00 ;
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "PWD111", "") ;
      GXv_int8[0] = GXt_int7 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8) ;
      webwopeexp_impl.this.AV7EmprCod = GXv_char4[0] ;
      webwopeexp_impl.this.GXt_int7 = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      AV93Pass00 = (byte)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Pass00", GXutil.str( AV93Pass00, 1, 0));
      GXt_int6 = AV20Tintutex ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int5) ;
      webwopeexp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV20Tintutex = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Tintutex", GXutil.str( AV20Tintutex, 1, 0));
      GXt_int6 = AV99Tinamar ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int5) ;
      webwopeexp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV99Tinamar = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99Tinamar", GXutil.str( AV99Tinamar, 1, 0));
      GXt_int6 = AV77FsSgts ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "FSSGTS", ""), GXv_int5) ;
      webwopeexp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV77FsSgts = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77FsSgts", GXutil.str( AV77FsSgts, 1, 0));
      GXt_int6 = AV54ContadorCarvema ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "CTDCAV", ""), GXv_int5) ;
      webwopeexp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV54ContadorCarvema = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54ContadorCarvema", GXutil.str( AV54ContadorCarvema, 1, 0));
      GXt_int6 = AV55ContadorErfoc ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "CTDERF", ""), GXv_int5) ;
      webwopeexp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV55ContadorErfoc = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55ContadorErfoc", GXutil.str( AV55ContadorErfoc, 1, 0));
      GXt_int6 = AV49bianco ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "BIANCO", ""), GXv_int5) ;
      webwopeexp_impl.this.GXt_int6 = GXv_int5[0] ;
      AV49bianco = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49bianco", GXutil.str( AV49bianco, 1, 0));
      AV9IntentosPassword = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9IntentosPassword", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9IntentosPassword), 4, 0));
      AV29Lecfec = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lecfec", localUtil.format(AV29Lecfec, "99/99/99"));
      GXt_char1 = AV19Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwopeexp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char2[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwopeexp_impl.this.AV7EmprCod = GXv_char4[0] ;
      webwopeexp_impl.this.AV8EmprNom = GXv_char3[0] ;
      webwopeexp_impl.this.AV21UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      edtavLecmaqnom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLecmaqnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLecmaqnom_Visible), 5, 0), true);
   }

   public void e121572( )
   {
      /* 'DoValidarHDR' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'VALIDARHDR' */
      S122 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17SDT_Maquina", AV17SDT_Maquina);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18SDT_Operario", AV18SDT_Operario);
   }

   public void e131572( )
   {
      /* 'DoValidarMaquina' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'VALIDARMAQUINA' */
      S132 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17SDT_Maquina", AV17SDT_Maquina);
   }

   public void e141572( )
   {
      /* 'DoValidarOperario' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'VALIDAROPERARIO' */
      S142 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18SDT_Operario", AV18SDT_Operario);
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( AV15OperarioValidado ) && ( AV12MaquinaValidada ) ) )
      {
         divDvpanel_tablehdr_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tablehdr_cell_Internalname, "Class", divDvpanel_tablehdr_cell_Class, true);
      }
      else
      {
         divDvpanel_tablehdr_cell_Class = "col-xs-12 col-sm-6" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tablehdr_cell_Internalname, "Class", divDvpanel_tablehdr_cell_Class, true);
      }
      if ( ! ( ( AV15OperarioValidado ) && ( AV12MaquinaValidada ) && ( AV78HDRExiste ) && ( AV88MaquinaFaseExiste ) ) )
      {
         divDvpanel_tableinformacion_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tableinformacion_cell_Internalname, "Class", divDvpanel_tableinformacion_cell_Class, true);
      }
      else
      {
         divDvpanel_tableinformacion_cell_Class = "col-xs-12 col-sm-6" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tableinformacion_cell_Internalname, "Class", divDvpanel_tableinformacion_cell_Class, true);
      }
      if ( ! ( ( AV15OperarioValidado ) ) )
      {
         divDvpanel_tablemaquina_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tablemaquina_cell_Internalname, "Class", divDvpanel_tablemaquina_cell_Class, true);
      }
      else
      {
         divDvpanel_tablemaquina_cell_Class = "col-xs-12 col-sm-6" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tablemaquina_cell_Internalname, "Class", divDvpanel_tablemaquina_cell_Class, true);
      }
   }

   public void e151572( )
   {
      /* Opepass_Isvalid Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'VALIDAROPERARIO' */
      S142 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18SDT_Operario", AV18SDT_Operario);
   }

   public void e161572( )
   {
      /* Maqcod_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'VALIDARMAQUINA' */
      S132 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17SDT_Maquina", AV17SDT_Maquina);
   }

   public void e171572( )
   {
      /* Barhdr_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV46BarHdr)==0) )
      {
         /* Execute user subroutine: 'VALIDARHDR' */
         S122 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17SDT_Maquina", AV17SDT_Maquina);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18SDT_Operario", AV18SDT_Operario);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e181572 ();
      if (returnInSub) return;
   }

   public void e181572( )
   {
      /* Enter Routine */
      returnInSub = false ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "datos evento enter con  operario=%1, maquina=%2, HDR=%3, con EmprCod=%4, BarCod =%5, BarCodReo =%6, BarCodPar =%7", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OpeCod), 6, 0), AV11MaqCod, AV46BarHdr, AV7EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0), GXutil.str( AV44BarCodReo, 1, 0), AV43BarCodPar, "", "")) ;
      /* Execute user subroutine: 'VALIDAROPERARIO' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'VALIDARMAQUINA' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'VALIDARHDR' */
      S122 ();
      if (returnInSub) return;
      if ( ! AV78HDRExiste )
      {
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         lblTextblock_mensaje_Caption = lblTextblock_mensaje_Caption+GXutil.newLine( )+GXutil.format( "HDR %1 - %2 - %3, NO VALIDADA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0), GXutil.str( AV44BarCodReo, 1, 0), AV43BarCodPar, "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextblock_mensaje_Internalname, "Caption", lblTextblock_mensaje_Caption, true);
      }
      else
      {
         lblTextblock_mensaje_Caption = lblTextblock_mensaje_Caption+GXutil.newLine( )+GXutil.format( "HDR %1 - %2 - %3, Validada correctamente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0), GXutil.str( AV44BarCodReo, 1, 0), AV43BarCodPar, "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextblock_mensaje_Internalname, "Caption", lblTextblock_mensaje_Caption, true);
         /* Execute user subroutine: 'REALIZAR PROCESAMIENTO HDR' */
         S152 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18SDT_Operario", AV18SDT_Operario);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17SDT_Maquina", AV17SDT_Maquina);
   }

   public void S162( )
   {
      /* 'VALIDANDO HDR EXISTA' Routine */
      returnInSub = false ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "ingresando a validar HDR %1 con EmprCod %2, BarCod = %3, BarCodReo = %4, BarCodPar = %5", AV7EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0), GXutil.str( AV44BarCodReo, 1, 0), AV43BarCodPar, "", "", "", "", ""), AV106Pgmname) ;
      AV78HDRExiste = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78HDRExiste", AV78HDRExiste);
      AV107GXLvl178 = (byte)(0) ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           AV43BarCodPar ,
                                           A130BarCodPar ,
                                           AV7EmprCod ,
                                           Integer.valueOf(AV5BarCod) ,
                                           Byte.valueOf(AV44BarCodReo) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE
                                           }
      });
      /* Using cursor H015711 */
      pr_default.execute(9, new Object[] {AV7EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV44BarCodReo), AV43BarCodPar});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A1122MaqCodDis = H015711_A1122MaqCodDis[0] ;
         n1122MaqCodDis = H015711_n1122MaqCodDis[0] ;
         A130BarCodPar = H015711_A130BarCodPar[0] ;
         A132BarCodReo = H015711_A132BarCodReo[0] ;
         A129BarCod = H015711_A129BarCod[0] ;
         A396EmprCod = H015711_A396EmprCod[0] ;
         A607MaqEst = H015711_A607MaqEst[0] ;
         n607MaqEst = H015711_n607MaqEst[0] ;
         A213BarSit = H015711_A213BarSit[0] ;
         A361DisCod = H015711_A361DisCod[0] ;
         A125BarAncAca1 = H015711_A125BarAncAca1[0] ;
         A252CliCod = H015711_A252CliCod[0] ;
         n252CliCod = H015711_n252CliCod[0] ;
         A212BarSer = H015711_A212BarSer[0] ;
         A365DisDes = H015711_A365DisDes[0] ;
         A1122MaqCodDis = H015711_A1122MaqCodDis[0] ;
         n1122MaqCodDis = H015711_n1122MaqCodDis[0] ;
         A607MaqEst = H015711_A607MaqEst[0] ;
         n607MaqEst = H015711_n607MaqEst[0] ;
         AV107GXLvl178 = (byte)(1) ;
         if ( A213BarSit >= 9 )
         {
            if ( AV76FlagSit == 1 )
            {
               httpContext.GX_msglist.addItem(GXutil.format( "HDR %1 - %2 - %3, En situación Cerrada o en Historico:%4", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0), GXutil.str( AV44BarCodReo, 1, 0), AV43BarCodPar, GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0), "", "", "", "", ""));
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Existe HDR %1 con EmprCod %2, BarCod = %3, BarCodReo = %4, BarCodPar = %5", AV106Pgmname, AV7EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0), GXutil.str( AV44BarCodReo, 1, 0), AV43BarCodPar, "", "", "", ""), AV106Pgmname) ;
         AV42Barcada = AV5BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Barcada", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Barcada), 6, 0));
         AV58Discod = A361DisCod ;
         AV48BarSit = A213BarSit ;
         AV41BarAncAca1 = A125BarAncAca1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarAncAca1), 3, 0));
         AV53Clicod = A252CliCod ;
         AV40Artcod = A212BarSer ;
         AV59DisDes = A365DisDes ;
         AV92Num_etq = (byte)(0) ;
         /* Execute user subroutine: 'MAQFAS' */
         S173 ();
         if ( returnInSub )
         {
            pr_default.close(9);
            pr_default.close(9);
            pr_default.close(9);
            returnInSub = true;
            if (true) return;
         }
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Retorna MaqFas con HDR=%1 con EmprCod=%2, BarCod =%3, BarCodReo =%4, BarCodPar =%5, &MaquinaFaseExiste=%6", AV7EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0), GXutil.str( AV44BarCodReo, 1, 0), AV43BarCodPar, GXutil.booltostr( AV88MaquinaFaseExiste), "", "", "", ""), AV106Pgmname) ;
         if ( AV88MaquinaFaseExiste )
         {
            /* Using cursor H015712 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(10) != 101) )
            {
               A201BarPieEst = H015712_A201BarPieEst[0] ;
               A8838CodBarPz = H015712_A8838CodBarPz[0] ;
               n8838CodBarPz = H015712_n8838CodBarPz[0] ;
               A200BarPieCod = H015712_A200BarPieCod[0] ;
               if ( GXutil.strcmp(A8838CodBarPz, "1") == 0 )
               {
                  AV92Num_etq = (byte)(AV92Num_etq-1) ;
               }
               else
               {
                  AV92Num_etq = (byte)(AV92Num_etq+1) ;
               }
               pr_default.readNext(10);
            }
            pr_default.close(10);
            AV92Num_etq = (byte)(((AV92Num_etq<0) ? 0 : AV92Num_etq)) ;
            if ( ( AV92Num_etq == 0 ) && ( GXutil.strcmp(AV69FasTip, httpContext.getMessage( "S", "")) == 0 ) )
            {
               httpContext.GX_msglist.addItem(GXutil.format( "Atencion. Esta HDR %1 - %2 - %3. tiene TODAS sus PIEZAS marcadas como ya leidas. Consulte con Responsable Produccion", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0), GXutil.str( AV44BarCodReo, 1, 0), AV43BarCodPar, "", "", "", "", "", ""));
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            else
            {
               AV78HDRExiste = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV78HDRExiste", AV78HDRExiste);
            }
         }
         else
         {
            httpContext.GX_msglist.addItem(GXutil.format( "No es posible iniciar la HDR %1 - %2 - %3. No tiene Fases asociadas en la maquina introducida", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0), GXutil.str( AV44BarCodReo, 1, 0), AV43BarCodPar, "", "", "", "", "", ""));
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
      if ( AV107GXLvl178 == 0 )
      {
         httpContext.GX_msglist.addItem(GXutil.format( "HDR %1, Inexistente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0), "", "", "", "", "", "", "", ""));
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      if ( ! AV78HDRExiste )
      {
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         lblTextblock_mensaje_Caption = lblTextblock_mensaje_Caption+GXutil.newLine( )+GXutil.format( "HDR %1 - %2 - %3, NO VALIDADA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0), GXutil.str( AV44BarCodReo, 1, 0), AV43BarCodPar, "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextblock_mensaje_Internalname, "Caption", lblTextblock_mensaje_Caption, true);
      }
      else
      {
         lblTextblock_mensaje_Caption = lblTextblock_mensaje_Caption+GXutil.newLine( )+GXutil.format( "HDR %1 - %2 - %3, Validada correctamente", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0), GXutil.str( AV44BarCodReo, 1, 0), AV43BarCodPar, "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextblock_mensaje_Internalname, "Caption", lblTextblock_mensaje_Caption, true);
         /* Execute user subroutine: 'REALIZAR PROCESAMIENTO HDR' */
         S152 ();
         if (returnInSub) return;
      }
   }

   public void S173( )
   {
      /* 'MAQFAS' Routine */
      returnInSub = false ;
      AV88MaquinaFaseExiste = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88MaquinaFaseExiste", AV88MaquinaFaseExiste);
      AV45Barfasest = (byte)(9) ;
      AV109GXLvl247 = (byte)(0) ;
      pr_default.dynParam(11, new Object[]{ new Object[]{
                                           AV43BarCodPar ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A153BarFasEst) ,
                                           A152BarFasCon ,
                                           AV7EmprCod ,
                                           Integer.valueOf(AV42Barcada) ,
                                           Byte.valueOf(AV44BarCodReo) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE
                                           }
      });
      /* Using cursor H015713 */
      pr_default.execute(11, new Object[] {AV7EmprCod, Integer.valueOf(AV42Barcada), Byte.valueOf(AV44BarCodReo), AV43BarCodPar});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A152BarFasCon = H015713_A152BarFasCon[0] ;
         A153BarFasEst = H015713_A153BarFasEst[0] ;
         A130BarCodPar = H015713_A130BarCodPar[0] ;
         A132BarCodReo = H015713_A132BarCodReo[0] ;
         A129BarCod = H015713_A129BarCod[0] ;
         A396EmprCod = H015713_A396EmprCod[0] ;
         A457FasCod = H015713_A457FasCod[0] ;
         A460FasDsc = H015713_A460FasDsc[0] ;
         A6011FasTip = H015713_A6011FasTip[0] ;
         n6011FasTip = H015713_n6011FasTip[0] ;
         A7600FasH2OReh = H015713_A7600FasH2OReh[0] ;
         n7600FasH2OReh = H015713_n7600FasH2OReh[0] ;
         A194BarOrdLin = H015713_A194BarOrdLin[0] ;
         A758ProCod = H015713_A758ProCod[0] ;
         A460FasDsc = H015713_A460FasDsc[0] ;
         A6011FasTip = H015713_A6011FasTip[0] ;
         n6011FasTip = H015713_n6011FasTip[0] ;
         A7600FasH2OReh = H015713_A7600FasH2OReh[0] ;
         n7600FasH2OReh = H015713_n7600FasH2OReh[0] ;
         AV109GXLvl247 = (byte)(1) ;
         AV65FasCodi = A457FasCod ;
         AV67FasDscmf = A460FasDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67FasDscmf", AV67FasDscmf);
         AV69FasTip = A6011FasTip ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69FasTip", AV69FasTip);
         AV47BarOrdLin = A194BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47BarOrdLin), 4, 0));
         AV94Procod = A758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94Procod", AV94Procod);
         AV82KgMt = A7600FasH2OReh ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82KgMt", AV82KgMt);
         AV45Barfasest = A153BarFasEst ;
         AV66FasCodmf = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66FasCodmf", AV66FasCodmf);
         if ( ! AV88MaquinaFaseExiste )
         {
            GXt_SdtSDT_MaquinaFase9 = AV98SDT_MaquinaFase;
            GXv_SdtSDT_MaquinaFase10[0] = GXt_SdtSDT_MaquinaFase9;
            new app.expedicionesautomatizadas.dp_sdt_maquinafase(remoteHandle, context).execute( AV7EmprCod, AV11MaqCod, A457FasCod, GXv_SdtSDT_MaquinaFase10) ;
            GXt_SdtSDT_MaquinaFase9 = GXv_SdtSDT_MaquinaFase10[0] ;
            AV98SDT_MaquinaFase = GXt_SdtSDT_MaquinaFase9;
            new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "maquina fase para maquina = %1, fase = %2, maquina fase=%3", ""), AV11MaqCod, A457FasCod, AV98SDT_MaquinaFase.toJSonString(false, true), "", "", "", "", "", ""), AV106Pgmname) ;
            if ( ! (GXutil.strcmp("", AV98SDT_MaquinaFase.getgxTv_SdtSDT_MaquinaFase_Maqfasuni())==0) )
            {
               AV88MaquinaFaseExiste = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV88MaquinaFaseExiste", AV88MaquinaFaseExiste);
               AV66FasCodmf = A457FasCod ;
               httpContext.ajax_rsp_assign_attri("", false, "AV66FasCodmf", AV66FasCodmf);
            }
         }
         if ( AV88MaquinaFaseExiste )
         {
            new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Encontrada maquina fase para maquina = %1, maquina fase = %2", ""), AV11MaqCod, AV66FasCodmf, "", "", "", "", "", "", ""), AV106Pgmname) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(11);
      }
      pr_default.close(11);
      if ( AV109GXLvl247 == 0 )
      {
         httpContext.GX_msglist.addItem(GXutil.format( "No existe fases del proceso para HDR: &EmprCod=%1, &Barcada=%2, &BarCodReo=%3, &BarCodPar=%4, en estado BarFasEst diferente de 2 y BarFasCon igual a S ", AV7EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Barcada), 6, 0), GXutil.str( AV44BarCodReo, 1, 0), AV43BarCodPar, "", "", "", "", ""));
      }
      if ( AV88MaquinaFaseExiste && ( AV77FsSgts == 1 ) )
      {
         GXv_char4[0] = AV7EmprCod ;
         GXv_int8[0] = AV42Barcada ;
         GXv_int5[0] = AV44BarCodReo ;
         GXv_char3[0] = AV43BarCodPar ;
         GXv_char2[0] = AV94Procod ;
         GXv_int11[0] = AV47BarOrdLin ;
         GXv_char12[0] = AV21UsurCod ;
         GXv_char13[0] = AV19Station ;
         new app.pfssgts(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int5, GXv_char3, GXv_char2, GXv_int11, GXv_char12, GXv_char13) ;
         webwopeexp_impl.this.AV7EmprCod = GXv_char4[0] ;
         webwopeexp_impl.this.AV42Barcada = GXv_int8[0] ;
         webwopeexp_impl.this.AV44BarCodReo = GXv_int5[0] ;
         webwopeexp_impl.this.AV43BarCodPar = GXv_char3[0] ;
         webwopeexp_impl.this.AV94Procod = GXv_char2[0] ;
         webwopeexp_impl.this.AV47BarOrdLin = GXv_int11[0] ;
         webwopeexp_impl.this.AV21UsurCod = GXv_char12[0] ;
         webwopeexp_impl.this.AV19Station = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV42Barcada", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Barcada), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV44BarCodReo", GXutil.str( AV44BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43BarCodPar", AV43BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV94Procod", AV94Procod);
         httpContext.ajax_rsp_assign_attri("", false, "AV47BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47BarOrdLin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      }
      if ( AV20Tintutex == 1 )
      {
         AV88MaquinaFaseExiste = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88MaquinaFaseExiste", AV88MaquinaFaseExiste);
      }
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Aca el valor de Encontrada maquina fase para maquina = %1, maquina fase = %2", ""), AV11MaqCod, AV66FasCodmf, "", "", "", "", "", "", ""), AV106Pgmname) ;
   }

   public void S142( )
   {
      /* 'VALIDAROPERARIO' Routine */
      returnInSub = false ;
      AV15OperarioValidado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15OperarioValidado", AV15OperarioValidado);
      if ( (0==AV13OpeCod) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( "Requiere Seleccionar Operario", "", "", "", "", "", "", "", "", ""));
         GX_FocusControl = edtavOpecod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( (GXutil.strcmp("", AV14OpePass)==0) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( "Requiere Contraseña del Operario", "", "", "", "", "", "", "", "", ""));
         GX_FocusControl = edtavOpepass_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         GXt_SdtSDT_Operario14 = AV18SDT_Operario;
         GXv_SdtSDT_Operario15[0] = GXt_SdtSDT_Operario14;
         new app.expedicionesautomatizadas.dp_sdt_operario(remoteHandle, context).execute( AV7EmprCod, AV13OpeCod, GXv_SdtSDT_Operario15) ;
         GXt_SdtSDT_Operario14 = GXv_SdtSDT_Operario15[0] ;
         AV18SDT_Operario = GXt_SdtSDT_Operario14;
         if ( ! ( ( GXutil.strcmp(AV18SDT_Operario.getgxTv_SdtSDT_Operario_Emprcod(), AV7EmprCod) == 0 ) && ( AV18SDT_Operario.getgxTv_SdtSDT_Operario_Opecod() == AV13OpeCod ) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( "Datos no encontrados para el Operario %1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OpeCod), 6, 0), "", "", "", "", "", "", "", ""));
            GX_FocusControl = edtavOpecod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else if ( ! ( ( GXutil.strcmp(AV18SDT_Operario.getgxTv_SdtSDT_Operario_Opeact(), httpContext.getMessage( "A", "")) == 0 ) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( "Operario %1, Inactivo", AV18SDT_Operario.getgxTv_SdtSDT_Operario_Opecnom(), "", "", "", "", "", "", "", ""));
         }
         else if ( AV9IntentosPassword > 2 )
         {
            httpContext.GX_msglist.addItem(GXutil.format( "Sobrepaso el numero de intentos para la Contraseña, el Operario %1", AV18SDT_Operario.getgxTv_SdtSDT_Operario_Opecnom(), "", "", "", "", "", "", "", ""));
            httpContext.setWebReturnParms(new Object[] {});
            httpContext.setWebReturnParmsMetadata(new Object[] {});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            returnInSub = true;
            if (true) return;
         }
         else if ( ! ( ( GXutil.strcmp(AV18SDT_Operario.getgxTv_SdtSDT_Operario_Opepass(), AV14OpePass) == 0 ) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( "Contraseña Incorrecta para el Operario %1, Nro de intentos: %2", AV18SDT_Operario.getgxTv_SdtSDT_Operario_Opecnom(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9IntentosPassword), 4, 0), "", "", "", "", "", "", ""));
            AV9IntentosPassword = (short)(AV9IntentosPassword+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9IntentosPassword", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9IntentosPassword), 4, 0));
            GX_FocusControl = edtavOpepass_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            AV15OperarioValidado = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15OperarioValidado", AV15OperarioValidado);
            lblTextblock_mensaje_Caption = GXutil.format( "Operario %1, Validado correctamente", AV18SDT_Operario.getgxTv_SdtSDT_Operario_Opecnom(), "", "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTextblock_mensaje_Internalname, "Caption", lblTextblock_mensaje_Caption, true);
         }
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      if ( ! AV15OperarioValidado )
      {
         GX_FocusControl = edtavOpecod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         lblTextblock_mensaje_Caption = GXutil.format( "Operario %1, Validado incorrectamente", AV18SDT_Operario.getgxTv_SdtSDT_Operario_Opecnom(), "", "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextblock_mensaje_Internalname, "Caption", lblTextblock_mensaje_Caption, true);
      }
      else
      {
         GX_FocusControl = edtavMaqcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         Dvpanel_tableoperario_Collapsed = true ;
         ucDvpanel_tableoperario.sendProperty(context, "", false, Dvpanel_tableoperario_Internalname, "Collapsed", GXutil.booltostr( Dvpanel_tableoperario_Collapsed));
      }
   }

   public void S132( )
   {
      /* 'VALIDARMAQUINA' Routine */
      returnInSub = false ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "2. ingresando a validar maquina %1 con operario %2", AV11MaqCod, GXutil.booltostr( AV15OperarioValidado), "", "", "", "", "", "", ""), AV106Pgmname) ;
      AV12MaquinaValidada = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12MaquinaValidada", AV12MaquinaValidada);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      if ( AV15OperarioValidado )
      {
         if ( (GXutil.strcmp("", AV11MaqCod)==0) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( "Requiere Seleccionar Máquina", "", "", "", "", "", "", "", "", ""));
            GX_FocusControl = edtavMaqcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXt_SdtSDT_Maquina16 = AV17SDT_Maquina;
            GXv_SdtSDT_Maquina17[0] = GXt_SdtSDT_Maquina16;
            new app.expedicionesautomatizadas.dp_sdt_maquina(remoteHandle, context).execute( AV7EmprCod, AV11MaqCod, GXv_SdtSDT_Maquina17) ;
            GXt_SdtSDT_Maquina16 = GXv_SdtSDT_Maquina17[0] ;
            AV17SDT_Maquina = GXt_SdtSDT_Maquina16;
            if ( ! ( ( GXutil.strcmp(AV17SDT_Maquina.getgxTv_SdtSDT_Maquina_Emprcod(), AV7EmprCod) == 0 ) && ( GXutil.strcmp(AV17SDT_Maquina.getgxTv_SdtSDT_Maquina_Maqcod(), AV11MaqCod) == 0 ) ) )
            {
               httpContext.GX_msglist.addItem(GXutil.format( "Datos no encontrados para la máquina %1", AV11MaqCod, "", "", "", "", "", "", "", ""));
               GX_FocusControl = edtavMaqcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else if ( ! ( ( GXutil.strcmp(AV17SDT_Maquina.getgxTv_SdtSDT_Maquina_Maqest(), httpContext.getMessage( "A", "")) == 0 ) ) )
            {
               httpContext.GX_msglist.addItem(GXutil.format( "Máquina %1, Inactiva", AV17SDT_Maquina.getgxTv_SdtSDT_Maquina_Maqcdsc(), "", "", "", "", "", "", "", ""));
            }
            else
            {
               AV12MaquinaValidada = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12MaquinaValidada", AV12MaquinaValidada);
               /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
               S112 ();
               if (returnInSub) return;
               GX_FocusControl = edtavBarhdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
               lblTextblock_mensaje_Caption = lblTextblock_mensaje_Caption+GXutil.newLine( )+GXutil.format( "Máquina %1, Validada correctamente", AV17SDT_Maquina.getgxTv_SdtSDT_Maquina_Maqdsc(), "", "", "", "", "", "", "", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTextblock_mensaje_Internalname, "Caption", lblTextblock_mensaje_Caption, true);
               /* Execute user subroutine: 'LECTOR' */
               S182 ();
               if (returnInSub) return;
            }
         }
      }
      else
      {
         GX_FocusControl = edtavOpecod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         lblTextblock_mensaje_Caption = GXutil.format( "Operario %1, NO Validado", AV18SDT_Operario.getgxTv_SdtSDT_Operario_Opecnom(), "", "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextblock_mensaje_Internalname, "Caption", lblTextblock_mensaje_Caption, true);
      }
   }

   public void S122( )
   {
      /* 'VALIDARHDR' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      if ( AV12MaquinaValidada )
      {
         AV46BarHdr = GXutil.upper( AV46BarHdr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46BarHdr", AV46BarHdr);
         AV84Largo = (short)(GXutil.len( GXutil.trim( AV46BarHdr))) ;
         if ( AV84Largo < 9 )
         {
            AV97RevisarBarPar = GXutil.substring( AV46BarHdr, AV84Largo, 1) ;
            AV84Largo = (short)(9) ;
            if ( GxRegex.IsMatch(AV97RevisarBarPar,"[a-zA-Z]") )
            {
               AV84Largo = (short)(10) ;
            }
            AV46BarHdr = GXutil.padl( GXutil.trim( AV46BarHdr), AV84Largo, "0") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46BarHdr", AV46BarHdr);
         }
         AV84Largo = (short)(GXutil.len( GXutil.trim( AV46BarHdr))) ;
         if ( AV84Largo < 10 )
         {
            AV46BarHdr = GXutil.padr( GXutil.trim( AV46BarHdr), 10, " ") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46BarHdr", AV46BarHdr);
         }
         GXv_int8[0] = AV5BarCod ;
         GXv_int5[0] = AV44BarCodReo ;
         GXv_char13[0] = AV43BarCodPar ;
         new app.partesbarhdr(remoteHandle, context).execute( AV46BarHdr, GXv_int8, GXv_int5, GXv_char13) ;
         webwopeexp_impl.this.AV5BarCod = GXv_int8[0] ;
         webwopeexp_impl.this.AV44BarCodReo = GXv_int5[0] ;
         webwopeexp_impl.this.AV43BarCodPar = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV44BarCodReo", GXutil.str( AV44BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43BarCodPar", AV43BarCodPar);
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "datos saliendo HDR=%1, con EmprCod=%2, BarCod =%3, BarCodReo =%4, BarCodPar =%5,", AV46BarHdr, AV7EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0), GXutil.str( AV44BarCodReo, 1, 0), AV43BarCodPar, "", "", "", "")) ;
         if ( ! (0==AV5BarCod) )
         {
            /* Execute user subroutine: 'VALIDANDO HDR EXISTA' */
            S162 ();
            if (returnInSub) return;
         }
         else
         {
            httpContext.GX_msglist.addItem(GXutil.format( "HDR %1, No Válida", AV46BarHdr, "", "", "", "", "", "", "", ""));
            GX_FocusControl = edtavBarhdr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else
      {
         GX_FocusControl = edtavMaqcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         lblTextblock_mensaje_Caption = lblTextblock_mensaje_Caption+GXutil.newLine( )+GXutil.format( "Máquina %1, NO VALIDADA", AV17SDT_Maquina.getgxTv_SdtSDT_Maquina_Maqcdsc(), "", "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextblock_mensaje_Internalname, "Caption", lblTextblock_mensaje_Caption, true);
      }
   }

   public void S152( )
   {
      /* 'REALIZAR PROCESAMIENTO HDR' Routine */
      returnInSub = false ;
      httpContext.GX_msglist.addItem("llega a Realizar Procesamiento HDR");
      if ( ! ( 0 > 1 ) )
      {
         /* Execute user subroutine: 'REALIZAR PROCESAMIENTO HDR - PARTE 04' */
         S192 ();
         if (returnInSub) return;
      }
      else
      {
         if ( ( AV60EstadoAnt < 2 ) && ( GXutil.strcmp(AV36HisProf, httpContext.getMessage( "N", "")) == 0 ) && ( AV34Lecparcod == 0 ) && ( GXutil.strcmp(AV69FasTip, httpContext.getMessage( "S", "")) == 0 ) )
         {
            GXv_char13[0] = AV7EmprCod ;
            GXv_int5[0] = AV39Turno ;
            new app.pturno(remoteHandle, context).execute( GXv_char13, GXv_int5) ;
            webwopeexp_impl.this.AV7EmprCod = GXv_char13[0] ;
            webwopeexp_impl.this.AV39Turno = GXv_int5[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV39Turno", GXutil.str( AV39Turno, 1, 0));
            httpContext.GX_msglist.addItem(httpContext.getMessage( "aca va el programa cierre  PCIERRE - PPARPRO - PNUEOP2", ""));
         }
         httpContext.GX_msglist.addItem(httpContext.getMessage( "aqui va el programa lector PLECTOR ", ""));
         /* Execute user subroutine: 'REALIZAR PROCESAMIENTO HDR - PARTE 03' */
         S202 ();
         if (returnInSub) return;
      }
   }

   public void S202( )
   {
      /* 'REALIZAR PROCESAMIENTO HDR - PARTE 03' Routine */
      returnInSub = false ;
   }

   public void S192( )
   {
      /* 'REALIZAR PROCESAMIENTO HDR - PARTE 04' Routine */
      returnInSub = false ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Procesamiento HDR - Parte 04, llamando a WebContador datos 1: &EmprCod=%1, &OpeCod=%2, &OpeNom=%3, &MaqCod=%4, MaqDsc=%5, &FasCodmf=%6, &FasDscmf=%7,&Barcada=%8, &BarCodReo=%9,", AV7EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OpeCod), 6, 0), AV18SDT_Operario.getgxTv_SdtSDT_Operario_Opecnom(), AV11MaqCod, AV17SDT_Maquina.getgxTv_SdtSDT_Maquina_Maqcdsc(), AV66FasCodmf, AV67FasDscmf, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0), GXutil.str( AV44BarCodReo, 1, 0)), AV106Pgmname) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( "Procesamiento HDR - Parte 04, llamando a WebContador datos 2: &BarCodPar=%1, &BarOrdLin=%2, &BarAncAca1=%3, &Mensa=%4, &Lecfec=%5, &HisProlin=%6, &Procod=%7, &KgMt=%8,", AV43BarCodPar, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47BarOrdLin), 4, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarAncAca1), 3, 0), AV89Mensa, localUtil.dtoc( AV29Lecfec, 0, "-"), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37HisProlin), 8, 0), AV94Procod, AV82KgMt, ""), AV106Pgmname) ;
      callWebObject(formatLink("app.expedicionesautomatizadas.webcontador", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13OpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV18SDT_Operario.getgxTv_SdtSDT_Operario_Opecnom())),GXutil.URLEncode(GXutil.rtrim(AV11MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV17SDT_Maquina.getgxTv_SdtSDT_Maquina_Maqcdsc())),GXutil.URLEncode(GXutil.rtrim(AV66FasCodmf)),GXutil.URLEncode(GXutil.rtrim(AV67FasDscmf)),GXutil.URLEncode(GXutil.ltrimstr(AV5BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV44BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV43BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV94Procod)),GXutil.URLEncode(GXutil.ltrimstr(AV47BarOrdLin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41BarAncAca1,3,0)),GXutil.URLEncode(GXutil.rtrim(AV89Mensa)),GXutil.URLEncode(GXutil.formatDateParm(AV29Lecfec)),GXutil.URLEncode(GXutil.ltrimstr(AV37HisProlin,8,0)),GXutil.URLEncode(GXutil.ltrimstr(999999,9,0)),GXutil.URLEncode(GXutil.rtrim(AV82KgMt))}, new String[] {"EmprCod","OpeCod","OpeNom","MaqCod","MaqDsc","FasCod","FasDsc","BarCod","BarCodReo","BarCodPar","Procod","BarOrdlin","BarAncAca1","Msg_l","Lecfec","HisProlin","Cctcod","KMS"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'LHIPRO' Routine */
      returnInSub = false ;
      AV85Lhipro = (byte)(0) ;
      /* Using cursor H015714 */
      pr_default.execute(12, new Object[] {AV7EmprCod, Integer.valueOf(AV42Barcada), Byte.valueOf(AV44BarCodReo), AV43BarCodPar, Short.valueOf(AV47BarOrdLin), AV11MaqCod, AV29Lecfec});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A396EmprCod = H015714_A396EmprCod[0] ;
         A129BarCod = H015714_A129BarCod[0] ;
         A132BarCodReo = H015714_A132BarCodReo[0] ;
         A130BarCodPar = H015714_A130BarCodPar[0] ;
         A194BarOrdLin = H015714_A194BarOrdLin[0] ;
         A602MaqCod = H015714_A602MaqCod[0] ;
         A558HisProFec = H015714_A558HisProFec[0] ;
         A656ParCod = H015714_A656ParCod[0] ;
         n656ParCod = H015714_n656ParCod[0] ;
         A561HisProLin = H015714_A561HisProLin[0] ;
         AV37HisProlin = A561HisProLin ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37HisProlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37HisProlin), 8, 0));
         AV85Lhipro = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S182( )
   {
      /* 'LECTOR' Routine */
      returnInSub = false ;
      /* Using cursor H015715 */
      pr_default.execute(13, new Object[] {AV7EmprCod, AV11MaqCod});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A1172LecParCod = H015715_A1172LecParCod[0] ;
         n1172LecParCod = H015715_n1172LecParCod[0] ;
         A1171LecFasCod = H015715_A1171LecFasCod[0] ;
         n1171LecFasCod = H015715_n1171LecFasCod[0] ;
         A1170LecOpeCod = H015715_A1170LecOpeCod[0] ;
         n1170LecOpeCod = H015715_n1170LecOpeCod[0] ;
         A396EmprCod = H015715_A396EmprCod[0] ;
         A1166LecMaqCod = H015715_A1166LecMaqCod[0] ;
         A1167LecBarCod = H015715_A1167LecBarCod[0] ;
         n1167LecBarCod = H015715_n1167LecBarCod[0] ;
         A1169LecBarPar = H015715_A1169LecBarPar[0] ;
         n1169LecBarPar = H015715_n1169LecBarPar[0] ;
         A1168LecBarReo = H015715_A1168LecBarReo[0] ;
         n1168LecBarReo = H015715_n1168LecBarReo[0] ;
         A1188LecFasOrd = H015715_A1188LecFasOrd[0] ;
         n1188LecFasOrd = H015715_n1188LecFasOrd[0] ;
         AV10LecMaqCod = A1166LecMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10LecMaqCod", AV10LecMaqCod);
         AV31LecMaqNom = AV17SDT_Maquina.getgxTv_SdtSDT_Maquina_Maqcdsc() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31LecMaqNom", AV31LecMaqNom);
         AV23LecBarCod = A1167LecBarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23LecBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23LecBarCod), 8, 0));
         AV24LecBarPar = A1169LecBarPar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24LecBarPar", AV24LecBarPar);
         AV25LecBarReo = A1168LecBarReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25LecBarReo", GXutil.str( AV25LecBarReo, 1, 0));
         AV32LecNom = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32LecNom", AV32LecNom);
         AV28LecFasord = A1188LecFasOrd ;
         AV26LecFasCod = A1171LecFasCod ;
         AV33LecOpeCod = A1170LecOpeCod ;
         AV34Lecparcod = A1172LecParCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Lecparcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Lecparcod), 4, 0));
         /* Using cursor H015716 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n1170LecOpeCod), Integer.valueOf(A1170LecOpeCod)});
         while ( (pr_default.getStatus(14) != 101) )
         {
            A652OpeCod = H015716_A652OpeCod[0] ;
            A653OpeNom = H015716_A653OpeNom[0] ;
            n653OpeNom = H015716_n653OpeNom[0] ;
            AV32LecNom = A653OpeNom ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32LecNom", AV32LecNom);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(14);
         AV27LecFasNom = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27LecFasNom", AV27LecFasNom);
         /* Using cursor H015717 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n1171LecFasCod), A1171LecFasCod});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A457FasCod = H015717_A457FasCod[0] ;
            A460FasDsc = H015717_A460FasDsc[0] ;
            AV27LecFasNom = A460FasDsc ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27LecFasNom", AV27LecFasNom);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(15);
         AV35LecParNom = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35LecParNom", AV35LecParNom);
         /* Using cursor H015718 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n1172LecParCod), Short.valueOf(A1172LecParCod)});
         while ( (pr_default.getStatus(16) != 101) )
         {
            A656ParCod = H015718_A656ParCod[0] ;
            n656ParCod = H015718_n656ParCod[0] ;
            A867ParCodNom = H015718_A867ParCodNom[0] ;
            n867ParCodNom = H015718_n867ParCodNom[0] ;
            AV35LecParNom = A867ParCodNom ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35LecParNom", AV35LecParNom);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(16);
         GXv_char13[0] = AV102EstFase ;
         GXv_char12[0] = AV103terminus ;
         new app.psitfas(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char13, GXv_char12) ;
         webwopeexp_impl.this.AV102EstFase = GXv_char13[0] ;
         webwopeexp_impl.this.AV103terminus = GXv_char12[0] ;
         AV101vDesEstado = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV101vDesEstado", AV101vDesEstado);
         if ( GXutil.strcmp(AV102EstFase, httpContext.getMessage( "I", "")) == 0 )
         {
            AV101vDesEstado = httpContext.getMessage( "EN PROCESO", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101vDesEstado", AV101vDesEstado);
         }
         else if ( GXutil.strcmp(AV102EstFase, httpContext.getMessage( "F", "")) == 0 )
         {
            AV101vDesEstado = httpContext.getMessage( "FINALIZADA", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101vDesEstado", AV101vDesEstado);
         }
         else
         {
            AV101vDesEstado = httpContext.getMessage( "No definido para el estado ", "") + AV102EstFase ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101vDesEstado", AV101vDesEstado);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   protected void nextLoad( )
   {
   }

   protected void e191572( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table2_91_1572( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblDatoshdr_Internalname, tblDatoshdr_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='DataContentCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecbarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecbarcod_Internalname, httpContext.getMessage( "Hoja de Ruta", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecbarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV23LecBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLecbarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV23LecBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV23LecBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecbarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecbarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='DataContentCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecbarreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecbarreo_Internalname, httpContext.getMessage( "Reoperado", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecbarreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV25LecBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLecbarreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25LecBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV25LecBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecbarreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecbarreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='DataContentCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecbarpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecbarpar_Internalname, httpContext.getMessage( "Partición", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecbarpar_Internalname, GXutil.rtrim( AV24LecBarPar), GXutil.rtrim( localUtil.format( AV24LecBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecbarpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecbarpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_91_1572e( true) ;
      }
      else
      {
         wb_table2_91_1572e( false) ;
      }
   }

   public void wb_table1_80_1572( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblDatosmaquina_Internalname, tblDatosmaquina_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='DataContentCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavLecmaqcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLecmaqcod_Internalname, httpContext.getMessage( "Maquina Cod.", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLecmaqcod_Internalname, hV10LecMaqCod, GXutil.rtrim( localUtil.format( hV10LecMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLecmaqcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLecmaqcod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWOPEEXP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_80_1572e( true) ;
      }
      else
      {
         wb_table1_80_1572e( false) ;
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
      pa1572( ) ;
      ws1572( ) ;
      we1572( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268514392099", true, true);
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
      httpContext.AddJavascriptSource("expedicionesautomatizadas/webwopeexp.js", "?20268514392099", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavOpecod_Internalname = "vOPECOD" ;
      edtavOpepass_Internalname = "vOPEPASS" ;
      bttBtnvalidaroperario_Internalname = "BTNVALIDAROPERARIO" ;
      divTableoperario_Internalname = "TABLEOPERARIO" ;
      Dvpanel_tableoperario_Internalname = "DVPANEL_TABLEOPERARIO" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      bttBtnvalidarmaquina_Internalname = "BTNVALIDARMAQUINA" ;
      divTablemaquina_Internalname = "TABLEMAQUINA" ;
      Dvpanel_tablemaquina_Internalname = "DVPANEL_TABLEMAQUINA" ;
      divDvpanel_tablemaquina_cell_Internalname = "DVPANEL_TABLEMAQUINA_CELL" ;
      divTableunificadora_1_Internalname = "TABLEUNIFICADORA_1" ;
      edtavBarhdr_Internalname = "vBARHDR" ;
      bttBtnvalidarhdr_Internalname = "BTNVALIDARHDR" ;
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablehdr_Internalname = "TABLEHDR" ;
      Dvpanel_tablehdr_Internalname = "DVPANEL_TABLEHDR" ;
      divDvpanel_tablehdr_cell_Internalname = "DVPANEL_TABLEHDR_CELL" ;
      edtavLecmaqcod_Internalname = "vLECMAQCOD" ;
      tblDatosmaquina_Internalname = "DATOSMAQUINA" ;
      edtavLecnom_Internalname = "vLECNOM" ;
      edtavLecbarcod_Internalname = "vLECBARCOD" ;
      edtavLecbarreo_Internalname = "vLECBARREO" ;
      edtavLecbarpar_Internalname = "vLECBARPAR" ;
      tblDatoshdr_Internalname = "DATOSHDR" ;
      edtavLecfasnom_Internalname = "vLECFASNOM" ;
      edtavLecparnom_Internalname = "vLECPARNOM" ;
      edtavVdesestado_Internalname = "vVDESESTADO" ;
      divTableinformacion_Internalname = "TABLEINFORMACION" ;
      Dvpanel_tableinformacion_Internalname = "DVPANEL_TABLEINFORMACION" ;
      divDvpanel_tableinformacion_cell_Internalname = "DVPANEL_TABLEINFORMACION_CELL" ;
      divTableunificadora_2_Internalname = "TABLEUNIFICADORA_2" ;
      lblTextblock_mensaje_Internalname = "TEXTBLOCK_MENSAJE" ;
      divTable_mensajes_Internalname = "TABLE_MENSAJES" ;
      Dvpanel_table_mensajes_Internalname = "DVPANEL_TABLE_MENSAJES" ;
      edtavIntentospassword_Internalname = "vINTENTOSPASSWORD" ;
      edtavFlagcb_Internalname = "vFLAGCB" ;
      edtavFlagribes_Internalname = "vFLAGRIBES" ;
      edtavFlagsit_Internalname = "vFLAGSIT" ;
      edtavMagosa_Internalname = "vMAGOSA" ;
      edtavFinite_Internalname = "vFINITE" ;
      edtavJbp_Internalname = "vJBP" ;
      edtavEstamp_Internalname = "vESTAMP" ;
      chkavTintutex.setInternalname( "vTINTUTEX" );
      edtavTinest_Internalname = "vTINEST" ;
      edtavTinamar_Internalname = "vTINAMAR" ;
      edtavFasman_Internalname = "vFASMAN" ;
      edtavJbmartin_Internalname = "vJBMARTIN" ;
      edtavF_vt_Internalname = "vF_VT" ;
      edtavHidro_Internalname = "vHIDRO" ;
      edtavFidel_Internalname = "vFIDEL" ;
      edtavCiehri_Internalname = "vCIEHRI" ;
      edtavCierre_hdr_Internalname = "vCIERRE_HDR" ;
      edtavRevhdm_Internalname = "vREVHDM" ;
      edtavMetsim_Internalname = "vMETSIM" ;
      edtavExpsindetail_Internalname = "vEXPSINDETAIL" ;
      edtavCarolina_Internalname = "vCAROLINA" ;
      edtavKgmt_Internalname = "vKGMT" ;
      edtavKgmtcc_Internalname = "vKGMTCC" ;
      edtavCosfrac_Internalname = "vCOSFRAC" ;
      edtavExpcondetail_Internalname = "vEXPCONDETAIL" ;
      edtavPzastrozos_Internalname = "vPZASTROZOS" ;
      edtavPass00_Internalname = "vPASS00" ;
      edtavFssgts_Internalname = "vFSSGTS" ;
      edtavContadorcarvema_Internalname = "vCONTADORCARVEMA" ;
      edtavContadorerfoc_Internalname = "vCONTADORERFOC" ;
      edtavBianco_Internalname = "vBIANCO" ;
      edtavNoproc_Internalname = "vNOPROC" ;
      divTablevariables_Internalname = "TABLEVARIABLES" ;
      Dvpanel_tablevariables_Internalname = "DVPANEL_TABLEVARIABLES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncancel_Internalname = "BTNCANCEL" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavLecmaqnom_Internalname = "vLECMAQNOM" ;
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
      edtavLecmaqcod_Jsonclick = "" ;
      edtavLecmaqcod_Enabled = 1 ;
      edtavLecbarpar_Jsonclick = "" ;
      edtavLecbarpar_Enabled = 1 ;
      edtavLecbarreo_Jsonclick = "" ;
      edtavLecbarreo_Enabled = 1 ;
      edtavLecbarcod_Jsonclick = "" ;
      edtavLecbarcod_Enabled = 1 ;
      edtavLecmaqnom_Jsonclick = "" ;
      edtavLecmaqnom_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavNoproc_Jsonclick = "" ;
      edtavNoproc_Enabled = 1 ;
      edtavBianco_Jsonclick = "" ;
      edtavBianco_Enabled = 1 ;
      edtavContadorerfoc_Jsonclick = "" ;
      edtavContadorerfoc_Enabled = 1 ;
      edtavContadorcarvema_Jsonclick = "" ;
      edtavContadorcarvema_Enabled = 1 ;
      edtavFssgts_Jsonclick = "" ;
      edtavFssgts_Enabled = 1 ;
      edtavPass00_Jsonclick = "" ;
      edtavPass00_Enabled = 1 ;
      edtavPzastrozos_Jsonclick = "" ;
      edtavPzastrozos_Enabled = 1 ;
      edtavExpcondetail_Jsonclick = "" ;
      edtavExpcondetail_Enabled = 1 ;
      edtavCosfrac_Jsonclick = "" ;
      edtavCosfrac_Enabled = 1 ;
      edtavKgmtcc_Jsonclick = "" ;
      edtavKgmtcc_Enabled = 1 ;
      edtavKgmt_Jsonclick = "" ;
      edtavKgmt_Enabled = 1 ;
      edtavCarolina_Jsonclick = "" ;
      edtavCarolina_Enabled = 1 ;
      edtavExpsindetail_Jsonclick = "" ;
      edtavExpsindetail_Enabled = 1 ;
      edtavMetsim_Jsonclick = "" ;
      edtavMetsim_Enabled = 1 ;
      edtavRevhdm_Jsonclick = "" ;
      edtavRevhdm_Enabled = 1 ;
      edtavCierre_hdr_Jsonclick = "" ;
      edtavCierre_hdr_Enabled = 1 ;
      edtavCiehri_Jsonclick = "" ;
      edtavCiehri_Enabled = 1 ;
      edtavFidel_Jsonclick = "" ;
      edtavFidel_Enabled = 1 ;
      edtavHidro_Jsonclick = "" ;
      edtavHidro_Enabled = 1 ;
      edtavF_vt_Jsonclick = "" ;
      edtavF_vt_Enabled = 1 ;
      edtavJbmartin_Jsonclick = "" ;
      edtavJbmartin_Enabled = 1 ;
      edtavFasman_Jsonclick = "" ;
      edtavFasman_Enabled = 1 ;
      edtavTinamar_Jsonclick = "" ;
      edtavTinamar_Enabled = 1 ;
      edtavTinest_Jsonclick = "" ;
      edtavTinest_Enabled = 1 ;
      chkavTintutex.setEnabled( 1 );
      edtavEstamp_Jsonclick = "" ;
      edtavEstamp_Enabled = 1 ;
      edtavJbp_Jsonclick = "" ;
      edtavJbp_Enabled = 1 ;
      edtavFinite_Jsonclick = "" ;
      edtavFinite_Enabled = 1 ;
      edtavMagosa_Jsonclick = "" ;
      edtavMagosa_Enabled = 1 ;
      edtavFlagsit_Jsonclick = "" ;
      edtavFlagsit_Enabled = 1 ;
      edtavFlagribes_Jsonclick = "" ;
      edtavFlagribes_Enabled = 1 ;
      edtavFlagcb_Jsonclick = "" ;
      edtavFlagcb_Enabled = 1 ;
      edtavIntentospassword_Jsonclick = "" ;
      edtavIntentospassword_Enabled = 1 ;
      edtavVdesestado_Jsonclick = "" ;
      edtavVdesestado_Enabled = 1 ;
      edtavLecparnom_Jsonclick = "" ;
      edtavLecparnom_Enabled = 1 ;
      edtavLecfasnom_Jsonclick = "" ;
      edtavLecfasnom_Enabled = 1 ;
      edtavLecnom_Jsonclick = "" ;
      edtavLecnom_Enabled = 1 ;
      divDvpanel_tableinformacion_cell_Class = "col-xs-12 col-sm-6" ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      edtavBarhdr_Jsonclick = "" ;
      edtavBarhdr_Enabled = 1 ;
      divDvpanel_tablehdr_cell_Class = "col-xs-12 col-sm-6" ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 1 ;
      divDvpanel_tablemaquina_cell_Class = "col-xs-12 col-sm-6" ;
      edtavOpepass_Jsonclick = "" ;
      edtavOpepass_Enabled = 1 ;
      edtavOpecod_Jsonclick = "" ;
      edtavOpecod_Enabled = 1 ;
      lblTextblock_mensaje_Caption = httpContext.getMessage( "Mensaje", "") ;
      Dvpanel_tablevariables_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablevariables_Iconposition = "Right" ;
      Dvpanel_tablevariables_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablevariables_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tablevariables_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tablevariables_Title = httpContext.getMessage( "Manejo de Variables", "") ;
      Dvpanel_tablevariables_Cls = "CellMarginTop" ;
      Dvpanel_tablevariables_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablevariables_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablevariables_Width = "100%" ;
      Dvpanel_table_mensajes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_table_mensajes_Iconposition = "Right" ;
      Dvpanel_table_mensajes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_table_mensajes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_table_mensajes_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_table_mensajes_Title = httpContext.getMessage( "Mensajes", "") ;
      Dvpanel_table_mensajes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_table_mensajes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_table_mensajes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_table_mensajes_Width = "100%" ;
      Dvpanel_tableinformacion_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableinformacion_Iconposition = "Right" ;
      Dvpanel_tableinformacion_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableinformacion_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableinformacion_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableinformacion_Title = httpContext.getMessage( "Informacion", "") ;
      Dvpanel_tableinformacion_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableinformacion_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableinformacion_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableinformacion_Width = "100%" ;
      Dvpanel_tablehdr_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablehdr_Iconposition = "Right" ;
      Dvpanel_tablehdr_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablehdr_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablehdr_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tablehdr_Title = httpContext.getMessage( "Hoja de Ruta (HDR)", "") ;
      Dvpanel_tablehdr_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tablehdr_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablehdr_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablehdr_Width = "100%" ;
      Dvpanel_tablemaquina_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablemaquina_Iconposition = "Right" ;
      Dvpanel_tablemaquina_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablemaquina_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablemaquina_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tablemaquina_Title = httpContext.getMessage( "Maquina", "") ;
      Dvpanel_tablemaquina_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tablemaquina_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablemaquina_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablemaquina_Width = "100%" ;
      Dvpanel_tableoperario_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableoperario_Iconposition = "Right" ;
      Dvpanel_tableoperario_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableoperario_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableoperario_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableoperario_Title = httpContext.getMessage( "Operario", "") ;
      Dvpanel_tableoperario_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableoperario_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableoperario_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableoperario_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Web WOPEEXP", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavTintutex.setName( "vTINTUTEX" );
      chkavTintutex.setWebtags( "" );
      chkavTintutex.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavTintutex.getInternalname(), "TitleCaption", chkavTintutex.getCaption(), true);
      chkavTintutex.setCheckedValue( "0" );
      AV20Tintutex = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV20Tintutex, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Tintutex", GXutil.str( AV20Tintutex, 1, 0));
      /* End function init_web_controls */
   }

   public void validv_Opecod( )
   {
      if ( (GXutil.strcmp("", hV13OpeCod)==0) )
      {
         AV13OpeCod = 0 ;
      }
      else
      {
         A13748OpeCNom = hV13OpeCod ;
         /* Using cursor H015719 */
         pr_default.execute(17, new Object[] {A13748OpeCNom});
         AV13OpeCod = H015719_A652OpeCod[0] ;
         if ( ! ( (pr_default.getStatus(17) == 101) ) )
         {
            pr_default.readNext(17);
            if ( ! ( (pr_default.getStatus(17) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Nombre", "")}), 1, "vOPECOD");
               GX_FocusControl = edtavOpecod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(17);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV13OpeCod", hV13OpeCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV13OpeCod", GXutil.ltrim( localUtil.ntoc( AV13OpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV13OpeCod", hV13OpeCod);
   }

   public void validv_Maqcod( )
   {
      if ( (GXutil.strcmp("", hV11MaqCod)==0) )
      {
         AV11MaqCod = "" ;
      }
      else
      {
         A13734MaqCDsc = hV11MaqCod ;
         /* Using cursor H015720 */
         pr_default.execute(18, new Object[] {A13734MaqCDsc});
         AV11MaqCod = H015720_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(18) == 101) ) )
         {
            pr_default.readNext(18);
            if ( ! ( (pr_default.getStatus(18) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCOD");
               GX_FocusControl = edtavMaqcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(18);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV11MaqCod", hV11MaqCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV11MaqCod", GXutil.rtrim( AV11MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "hV11MaqCod", hV11MaqCod);
   }

   public void validv_Lecmaqcod( )
   {
      if ( (GXutil.strcmp("", hV10LecMaqCod)==0) )
      {
         AV10LecMaqCod = "" ;
      }
      else
      {
         A13734MaqCDsc = hV10LecMaqCod ;
         /* Using cursor H015721 */
         pr_default.execute(19, new Object[] {A13734MaqCDsc});
         AV10LecMaqCod = H015721_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(19) == 101) ) )
         {
            pr_default.readNext(19);
            if ( ! ( (pr_default.getStatus(19) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vLECMAQCOD");
               GX_FocusControl = edtavLecmaqcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(19);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV10LecMaqCod", hV10LecMaqCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV10LecMaqCod", GXutil.rtrim( AV10LecMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "hV10LecMaqCod", hV10LecMaqCod);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV20Tintutex',fld:'vTINTUTEX',pic:'9'},{av:'AV60EstadoAnt',fld:'vESTADOANT',pic:'9',hsh:true},{av:'AV36HisProf',fld:'vHISPROF',pic:'@!',hsh:true},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOVALIDARHDR'","{handler:'e121572',iparms:[{av:'AV12MaquinaValidada',fld:'vMAQUINAVALIDADA',pic:''},{av:'AV46BarHdr',fld:'vBARHDR',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV11MaqCod',fld:'vMAQCOD',pic:''},{av:'AV17SDT_Maquina',fld:'vSDT_MAQUINA',pic:''},{av:'lblTextblock_mensaje_Caption',ctrl:'TEXTBLOCK_MENSAJE',prop:'Caption'},{av:'AV15OperarioValidado',fld:'vOPERARIOVALIDADO',pic:''},{av:'AV78HDRExiste',fld:'vHDREXISTE',pic:''},{av:'AV88MaquinaFaseExiste',fld:'vMAQUINAFASEEXISTE',pic:''},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV44BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'AV76FlagSit',fld:'vFLAGSIT',pic:'9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A125BarAncAca1',fld:'BARANCACA1',pic:'ZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A201BarPieEst',fld:'BARPIEEST',pic:'9'},{av:'A8838CodBarPz',fld:'CODBARPZ',pic:''},{av:'AV69FasTip',fld:'vFASTIP',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV42Barcada',fld:'vBARCADA',pic:'ZZZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A152BarFasCon',fld:'BARFASCON',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A6011FasTip',fld:'FASTIP',pic:''},{av:'A7600FasH2OReh',fld:'FASH2OREH',pic:'@!'},{av:'AV77FsSgts',fld:'vFSSGTS',pic:'9'},{av:'AV21UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV19Station',fld:'vSTATION',pic:''},{av:'AV20Tintutex',fld:'vTINTUTEX',pic:'9'},{av:'AV60EstadoAnt',fld:'vESTADOANT',pic:'9',hsh:true},{av:'AV36HisProf',fld:'vHISPROF',pic:'@!',hsh:true},{av:'AV34Lecparcod',fld:'vLECPARCOD',pic:'ZZZ9'},{av:'AV39Turno',fld:'vTURNO',pic:'9'},{av:'AV13OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV18SDT_Operario',fld:'vSDT_OPERARIO',pic:''},{av:'AV66FasCodmf',fld:'vFASCODMF',pic:'@!'},{av:'AV67FasDscmf',fld:'vFASDSCMF',pic:''},{av:'AV47BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV41BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV89Mensa',fld:'vMENSA',pic:''},{av:'AV29Lecfec',fld:'vLECFEC',pic:''},{av:'AV37HisProlin',fld:'vHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV94Procod',fld:'vPROCOD',pic:''},{av:'AV82KgMt',fld:'vKGMT',pic:'@!'}]");
      setEventMetadata("'DOVALIDARHDR'",",oparms:[{av:'AV46BarHdr',fld:'vBARHDR',pic:''},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'lblTextblock_mensaje_Caption',ctrl:'TEXTBLOCK_MENSAJE',prop:'Caption'},{av:'divDvpanel_tablehdr_cell_Class',ctrl:'DVPANEL_TABLEHDR_CELL',prop:'Class'},{av:'divDvpanel_tableinformacion_cell_Class',ctrl:'DVPANEL_TABLEINFORMACION_CELL',prop:'Class'},{av:'divDvpanel_tablemaquina_cell_Class',ctrl:'DVPANEL_TABLEMAQUINA_CELL',prop:'Class'},{av:'AV78HDRExiste',fld:'vHDREXISTE',pic:''},{av:'AV42Barcada',fld:'vBARCADA',pic:'ZZZZZ9'},{av:'AV41BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV88MaquinaFaseExiste',fld:'vMAQUINAFASEEXISTE',pic:''},{av:'AV67FasDscmf',fld:'vFASDSCMF',pic:''},{av:'AV69FasTip',fld:'vFASTIP',pic:''},{av:'AV47BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV94Procod',fld:'vPROCOD',pic:''},{av:'AV82KgMt',fld:'vKGMT',pic:'@!'},{av:'AV66FasCodmf',fld:'vFASCODMF',pic:'@!'},{av:'AV19Station',fld:'vSTATION',pic:''},{av:'AV21UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39Turno',fld:'vTURNO',pic:'9'},{av:'AV37HisProlin',fld:'vHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV29Lecfec',fld:'vLECFEC',pic:''},{av:'AV89Mensa',fld:'vMENSA',pic:''},{av:'AV17SDT_Maquina',fld:'vSDT_MAQUINA',pic:''},{av:'AV11MaqCod',fld:'vMAQCOD',pic:''},{av:'AV18SDT_Operario',fld:'vSDT_OPERARIO',pic:''},{av:'AV13OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("'DOVALIDARMAQUINA'","{handler:'e131572',iparms:[{av:'AV11MaqCod',fld:'vMAQCOD',pic:''},{av:'AV15OperarioValidado',fld:'vOPERARIOVALIDADO',pic:''},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV46BarHdr',fld:'vBARHDR',pic:''},{av:'lblTextblock_mensaje_Caption',ctrl:'TEXTBLOCK_MENSAJE',prop:'Caption'},{av:'AV13OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV18SDT_Operario',fld:'vSDT_OPERARIO',pic:''},{av:'AV12MaquinaValidada',fld:'vMAQUINAVALIDADA',pic:''},{av:'AV78HDRExiste',fld:'vHDREXISTE',pic:''},{av:'AV88MaquinaFaseExiste',fld:'vMAQUINAFASEEXISTE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1166LecMaqCod',fld:'LECMAQCOD',pic:''},{av:'AV17SDT_Maquina',fld:'vSDT_MAQUINA',pic:''},{av:'A1167LecBarCod',fld:'LECBARCOD',pic:'ZZZZZZZ9'},{av:'A1169LecBarPar',fld:'LECBARPAR',pic:''},{av:'A1168LecBarReo',fld:'LECBARREO',pic:'9'},{av:'A1188LecFasOrd',fld:'LECFASORD',pic:'ZZZ9'},{av:'A1171LecFasCod',fld:'LECFASCOD',pic:''},{av:'A1170LecOpeCod',fld:'LECOPECOD',pic:'ZZZZZ9'},{av:'A1172LecParCod',fld:'LECPARCOD',pic:'ZZZ9'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''}]");
      setEventMetadata("'DOVALIDARMAQUINA'",",oparms:[{av:'AV12MaquinaValidada',fld:'vMAQUINAVALIDADA',pic:''},{av:'AV17SDT_Maquina',fld:'vSDT_MAQUINA',pic:''},{av:'lblTextblock_mensaje_Caption',ctrl:'TEXTBLOCK_MENSAJE',prop:'Caption'},{av:'divDvpanel_tablehdr_cell_Class',ctrl:'DVPANEL_TABLEHDR_CELL',prop:'Class'},{av:'divDvpanel_tableinformacion_cell_Class',ctrl:'DVPANEL_TABLEINFORMACION_CELL',prop:'Class'},{av:'divDvpanel_tablemaquina_cell_Class',ctrl:'DVPANEL_TABLEMAQUINA_CELL',prop:'Class'},{av:'AV10LecMaqCod',fld:'vLECMAQCOD',pic:''},{av:'AV31LecMaqNom',fld:'vLECMAQNOM',pic:''},{av:'AV23LecBarCod',fld:'vLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV24LecBarPar',fld:'vLECBARPAR',pic:''},{av:'AV25LecBarReo',fld:'vLECBARREO',pic:'9'},{av:'AV32LecNom',fld:'vLECNOM',pic:''},{av:'AV34Lecparcod',fld:'vLECPARCOD',pic:'ZZZ9'},{av:'AV27LecFasNom',fld:'vLECFASNOM',pic:''},{av:'AV35LecParNom',fld:'vLECPARNOM',pic:''},{av:'AV101vDesEstado',fld:'vVDESESTADO',pic:''}]}");
      setEventMetadata("'DOVALIDAROPERARIO'","{handler:'e141572',iparms:[{av:'AV13OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV14OpePass',fld:'vOPEPASS',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9IntentosPassword',fld:'vINTENTOSPASSWORD',pic:'ZZZ9'},{av:'AV18SDT_Operario',fld:'vSDT_OPERARIO',pic:''},{av:'AV11MaqCod',fld:'vMAQCOD',pic:''},{av:'AV15OperarioValidado',fld:'vOPERARIOVALIDADO',pic:''},{av:'AV12MaquinaValidada',fld:'vMAQUINAVALIDADA',pic:''},{av:'AV78HDRExiste',fld:'vHDREXISTE',pic:''},{av:'AV88MaquinaFaseExiste',fld:'vMAQUINAFASEEXISTE',pic:''}]");
      setEventMetadata("'DOVALIDAROPERARIO'",",oparms:[{av:'AV15OperarioValidado',fld:'vOPERARIOVALIDADO',pic:''},{av:'AV18SDT_Operario',fld:'vSDT_OPERARIO',pic:''},{av:'AV9IntentosPassword',fld:'vINTENTOSPASSWORD',pic:'ZZZ9'},{av:'lblTextblock_mensaje_Caption',ctrl:'TEXTBLOCK_MENSAJE',prop:'Caption'},{av:'Dvpanel_tableoperario_Collapsed',ctrl:'DVPANEL_TABLEOPERARIO',prop:'Collapsed'},{av:'divDvpanel_tablehdr_cell_Class',ctrl:'DVPANEL_TABLEHDR_CELL',prop:'Class'},{av:'divDvpanel_tableinformacion_cell_Class',ctrl:'DVPANEL_TABLEINFORMACION_CELL',prop:'Class'},{av:'divDvpanel_tablemaquina_cell_Class',ctrl:'DVPANEL_TABLEMAQUINA_CELL',prop:'Class'}]}");
      setEventMetadata("VOPEPASS.ISVALID","{handler:'e151572',iparms:[{av:'AV13OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV14OpePass',fld:'vOPEPASS',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9IntentosPassword',fld:'vINTENTOSPASSWORD',pic:'ZZZ9'},{av:'AV18SDT_Operario',fld:'vSDT_OPERARIO',pic:''},{av:'AV11MaqCod',fld:'vMAQCOD',pic:''},{av:'AV15OperarioValidado',fld:'vOPERARIOVALIDADO',pic:''},{av:'AV12MaquinaValidada',fld:'vMAQUINAVALIDADA',pic:''},{av:'AV78HDRExiste',fld:'vHDREXISTE',pic:''},{av:'AV88MaquinaFaseExiste',fld:'vMAQUINAFASEEXISTE',pic:''}]");
      setEventMetadata("VOPEPASS.ISVALID",",oparms:[{av:'AV15OperarioValidado',fld:'vOPERARIOVALIDADO',pic:''},{av:'AV18SDT_Operario',fld:'vSDT_OPERARIO',pic:''},{av:'AV9IntentosPassword',fld:'vINTENTOSPASSWORD',pic:'ZZZ9'},{av:'lblTextblock_mensaje_Caption',ctrl:'TEXTBLOCK_MENSAJE',prop:'Caption'},{av:'Dvpanel_tableoperario_Collapsed',ctrl:'DVPANEL_TABLEOPERARIO',prop:'Collapsed'},{av:'divDvpanel_tablehdr_cell_Class',ctrl:'DVPANEL_TABLEHDR_CELL',prop:'Class'},{av:'divDvpanel_tableinformacion_cell_Class',ctrl:'DVPANEL_TABLEINFORMACION_CELL',prop:'Class'},{av:'divDvpanel_tablemaquina_cell_Class',ctrl:'DVPANEL_TABLEMAQUINA_CELL',prop:'Class'}]}");
      setEventMetadata("VMAQCOD.CONTROLVALUECHANGED","{handler:'e161572',iparms:[{av:'AV11MaqCod',fld:'vMAQCOD',pic:''},{av:'AV15OperarioValidado',fld:'vOPERARIOVALIDADO',pic:''},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV46BarHdr',fld:'vBARHDR',pic:''},{av:'lblTextblock_mensaje_Caption',ctrl:'TEXTBLOCK_MENSAJE',prop:'Caption'},{av:'AV13OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV18SDT_Operario',fld:'vSDT_OPERARIO',pic:''},{av:'AV12MaquinaValidada',fld:'vMAQUINAVALIDADA',pic:''},{av:'AV78HDRExiste',fld:'vHDREXISTE',pic:''},{av:'AV88MaquinaFaseExiste',fld:'vMAQUINAFASEEXISTE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1166LecMaqCod',fld:'LECMAQCOD',pic:''},{av:'AV17SDT_Maquina',fld:'vSDT_MAQUINA',pic:''},{av:'A1167LecBarCod',fld:'LECBARCOD',pic:'ZZZZZZZ9'},{av:'A1169LecBarPar',fld:'LECBARPAR',pic:''},{av:'A1168LecBarReo',fld:'LECBARREO',pic:'9'},{av:'A1188LecFasOrd',fld:'LECFASORD',pic:'ZZZ9'},{av:'A1171LecFasCod',fld:'LECFASCOD',pic:''},{av:'A1170LecOpeCod',fld:'LECOPECOD',pic:'ZZZZZ9'},{av:'A1172LecParCod',fld:'LECPARCOD',pic:'ZZZ9'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''}]");
      setEventMetadata("VMAQCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV12MaquinaValidada',fld:'vMAQUINAVALIDADA',pic:''},{av:'AV17SDT_Maquina',fld:'vSDT_MAQUINA',pic:''},{av:'lblTextblock_mensaje_Caption',ctrl:'TEXTBLOCK_MENSAJE',prop:'Caption'},{av:'divDvpanel_tablehdr_cell_Class',ctrl:'DVPANEL_TABLEHDR_CELL',prop:'Class'},{av:'divDvpanel_tableinformacion_cell_Class',ctrl:'DVPANEL_TABLEINFORMACION_CELL',prop:'Class'},{av:'divDvpanel_tablemaquina_cell_Class',ctrl:'DVPANEL_TABLEMAQUINA_CELL',prop:'Class'},{av:'AV10LecMaqCod',fld:'vLECMAQCOD',pic:''},{av:'AV31LecMaqNom',fld:'vLECMAQNOM',pic:''},{av:'AV23LecBarCod',fld:'vLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV24LecBarPar',fld:'vLECBARPAR',pic:''},{av:'AV25LecBarReo',fld:'vLECBARREO',pic:'9'},{av:'AV32LecNom',fld:'vLECNOM',pic:''},{av:'AV34Lecparcod',fld:'vLECPARCOD',pic:'ZZZ9'},{av:'AV27LecFasNom',fld:'vLECFASNOM',pic:''},{av:'AV35LecParNom',fld:'vLECPARNOM',pic:''},{av:'AV101vDesEstado',fld:'vVDESESTADO',pic:''}]}");
      setEventMetadata("VBARHDR.CONTROLVALUECHANGED","{handler:'e171572',iparms:[{av:'AV46BarHdr',fld:'vBARHDR',pic:''},{av:'AV12MaquinaValidada',fld:'vMAQUINAVALIDADA',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV11MaqCod',fld:'vMAQCOD',pic:''},{av:'AV17SDT_Maquina',fld:'vSDT_MAQUINA',pic:''},{av:'lblTextblock_mensaje_Caption',ctrl:'TEXTBLOCK_MENSAJE',prop:'Caption'},{av:'AV15OperarioValidado',fld:'vOPERARIOVALIDADO',pic:''},{av:'AV78HDRExiste',fld:'vHDREXISTE',pic:''},{av:'AV88MaquinaFaseExiste',fld:'vMAQUINAFASEEXISTE',pic:''},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV44BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'AV76FlagSit',fld:'vFLAGSIT',pic:'9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A125BarAncAca1',fld:'BARANCACA1',pic:'ZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A201BarPieEst',fld:'BARPIEEST',pic:'9'},{av:'A8838CodBarPz',fld:'CODBARPZ',pic:''},{av:'AV69FasTip',fld:'vFASTIP',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV42Barcada',fld:'vBARCADA',pic:'ZZZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A152BarFasCon',fld:'BARFASCON',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A6011FasTip',fld:'FASTIP',pic:''},{av:'A7600FasH2OReh',fld:'FASH2OREH',pic:'@!'},{av:'AV77FsSgts',fld:'vFSSGTS',pic:'9'},{av:'AV21UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV19Station',fld:'vSTATION',pic:''},{av:'AV20Tintutex',fld:'vTINTUTEX',pic:'9'},{av:'AV60EstadoAnt',fld:'vESTADOANT',pic:'9',hsh:true},{av:'AV36HisProf',fld:'vHISPROF',pic:'@!',hsh:true},{av:'AV34Lecparcod',fld:'vLECPARCOD',pic:'ZZZ9'},{av:'AV39Turno',fld:'vTURNO',pic:'9'},{av:'AV13OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV18SDT_Operario',fld:'vSDT_OPERARIO',pic:''},{av:'AV66FasCodmf',fld:'vFASCODMF',pic:'@!'},{av:'AV67FasDscmf',fld:'vFASDSCMF',pic:''},{av:'AV47BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV41BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV89Mensa',fld:'vMENSA',pic:''},{av:'AV29Lecfec',fld:'vLECFEC',pic:''},{av:'AV37HisProlin',fld:'vHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV94Procod',fld:'vPROCOD',pic:''},{av:'AV82KgMt',fld:'vKGMT',pic:'@!'}]");
      setEventMetadata("VBARHDR.CONTROLVALUECHANGED",",oparms:[{av:'AV46BarHdr',fld:'vBARHDR',pic:''},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'lblTextblock_mensaje_Caption',ctrl:'TEXTBLOCK_MENSAJE',prop:'Caption'},{av:'divDvpanel_tablehdr_cell_Class',ctrl:'DVPANEL_TABLEHDR_CELL',prop:'Class'},{av:'divDvpanel_tableinformacion_cell_Class',ctrl:'DVPANEL_TABLEINFORMACION_CELL',prop:'Class'},{av:'divDvpanel_tablemaquina_cell_Class',ctrl:'DVPANEL_TABLEMAQUINA_CELL',prop:'Class'},{av:'AV78HDRExiste',fld:'vHDREXISTE',pic:''},{av:'AV42Barcada',fld:'vBARCADA',pic:'ZZZZZ9'},{av:'AV41BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV88MaquinaFaseExiste',fld:'vMAQUINAFASEEXISTE',pic:''},{av:'AV67FasDscmf',fld:'vFASDSCMF',pic:''},{av:'AV69FasTip',fld:'vFASTIP',pic:''},{av:'AV47BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV94Procod',fld:'vPROCOD',pic:''},{av:'AV82KgMt',fld:'vKGMT',pic:'@!'},{av:'AV66FasCodmf',fld:'vFASCODMF',pic:'@!'},{av:'AV19Station',fld:'vSTATION',pic:''},{av:'AV21UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39Turno',fld:'vTURNO',pic:'9'},{av:'AV37HisProlin',fld:'vHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV29Lecfec',fld:'vLECFEC',pic:''},{av:'AV89Mensa',fld:'vMENSA',pic:''},{av:'AV17SDT_Maquina',fld:'vSDT_MAQUINA',pic:''},{av:'AV11MaqCod',fld:'vMAQCOD',pic:''},{av:'AV18SDT_Operario',fld:'vSDT_OPERARIO',pic:''},{av:'AV13OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("ENTER","{handler:'e181572',iparms:[{av:'AV13OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV11MaqCod',fld:'vMAQCOD',pic:''},{av:'AV46BarHdr',fld:'vBARHDR',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV44BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV78HDRExiste',fld:'vHDREXISTE',pic:''},{av:'lblTextblock_mensaje_Caption',ctrl:'TEXTBLOCK_MENSAJE',prop:'Caption'},{av:'AV14OpePass',fld:'vOPEPASS',pic:''},{av:'AV9IntentosPassword',fld:'vINTENTOSPASSWORD',pic:'ZZZ9'},{av:'AV18SDT_Operario',fld:'vSDT_OPERARIO',pic:''},{av:'AV15OperarioValidado',fld:'vOPERARIOVALIDADO',pic:''},{av:'AV106Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12MaquinaValidada',fld:'vMAQUINAVALIDADA',pic:''},{av:'AV17SDT_Maquina',fld:'vSDT_MAQUINA',pic:''},{av:'AV60EstadoAnt',fld:'vESTADOANT',pic:'9',hsh:true},{av:'AV36HisProf',fld:'vHISPROF',pic:'@!',hsh:true},{av:'AV34Lecparcod',fld:'vLECPARCOD',pic:'ZZZ9'},{av:'AV69FasTip',fld:'vFASTIP',pic:''},{av:'AV39Turno',fld:'vTURNO',pic:'9'},{av:'AV88MaquinaFaseExiste',fld:'vMAQUINAFASEEXISTE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1166LecMaqCod',fld:'LECMAQCOD',pic:''},{av:'A1167LecBarCod',fld:'LECBARCOD',pic:'ZZZZZZZ9'},{av:'A1169LecBarPar',fld:'LECBARPAR',pic:''},{av:'A1168LecBarReo',fld:'LECBARREO',pic:'9'},{av:'A1188LecFasOrd',fld:'LECFASORD',pic:'ZZZ9'},{av:'A1171LecFasCod',fld:'LECFASCOD',pic:''},{av:'A1170LecOpeCod',fld:'LECOPECOD',pic:'ZZZZZ9'},{av:'A1172LecParCod',fld:'LECPARCOD',pic:'ZZZ9'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'AV76FlagSit',fld:'vFLAGSIT',pic:'9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A125BarAncAca1',fld:'BARANCACA1',pic:'ZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A201BarPieEst',fld:'BARPIEEST',pic:'9'},{av:'A8838CodBarPz',fld:'CODBARPZ',pic:''},{av:'AV66FasCodmf',fld:'vFASCODMF',pic:'@!'},{av:'AV67FasDscmf',fld:'vFASDSCMF',pic:''},{av:'AV47BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV41BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV89Mensa',fld:'vMENSA',pic:''},{av:'AV29Lecfec',fld:'vLECFEC',pic:''},{av:'AV37HisProlin',fld:'vHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV94Procod',fld:'vPROCOD',pic:''},{av:'AV82KgMt',fld:'vKGMT',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV42Barcada',fld:'vBARCADA',pic:'ZZZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A152BarFasCon',fld:'BARFASCON',pic:'@!'},{av:'A6011FasTip',fld:'FASTIP',pic:''},{av:'A7600FasH2OReh',fld:'FASH2OREH',pic:'@!'},{av:'AV77FsSgts',fld:'vFSSGTS',pic:'9'},{av:'AV21UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV19Station',fld:'vSTATION',pic:''},{av:'AV20Tintutex',fld:'vTINTUTEX',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTextblock_mensaje_Caption',ctrl:'TEXTBLOCK_MENSAJE',prop:'Caption'},{av:'AV15OperarioValidado',fld:'vOPERARIOVALIDADO',pic:''},{av:'AV18SDT_Operario',fld:'vSDT_OPERARIO',pic:''},{av:'AV9IntentosPassword',fld:'vINTENTOSPASSWORD',pic:'ZZZ9'},{av:'Dvpanel_tableoperario_Collapsed',ctrl:'DVPANEL_TABLEOPERARIO',prop:'Collapsed'},{av:'AV12MaquinaValidada',fld:'vMAQUINAVALIDADA',pic:''},{av:'AV17SDT_Maquina',fld:'vSDT_MAQUINA',pic:''},{av:'AV46BarHdr',fld:'vBARHDR',pic:''},{av:'AV43BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV39Turno',fld:'vTURNO',pic:'9'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'divDvpanel_tablehdr_cell_Class',ctrl:'DVPANEL_TABLEHDR_CELL',prop:'Class'},{av:'divDvpanel_tableinformacion_cell_Class',ctrl:'DVPANEL_TABLEINFORMACION_CELL',prop:'Class'},{av:'divDvpanel_tablemaquina_cell_Class',ctrl:'DVPANEL_TABLEMAQUINA_CELL',prop:'Class'},{av:'AV10LecMaqCod',fld:'vLECMAQCOD',pic:''},{av:'AV31LecMaqNom',fld:'vLECMAQNOM',pic:''},{av:'AV23LecBarCod',fld:'vLECBARCOD',pic:'ZZZZZZZ9'},{av:'AV24LecBarPar',fld:'vLECBARPAR',pic:''},{av:'AV25LecBarReo',fld:'vLECBARREO',pic:'9'},{av:'AV32LecNom',fld:'vLECNOM',pic:''},{av:'AV34Lecparcod',fld:'vLECPARCOD',pic:'ZZZ9'},{av:'AV27LecFasNom',fld:'vLECFASNOM',pic:''},{av:'AV35LecParNom',fld:'vLECPARNOM',pic:''},{av:'AV101vDesEstado',fld:'vVDESESTADO',pic:''},{av:'AV78HDRExiste',fld:'vHDREXISTE',pic:''},{av:'AV42Barcada',fld:'vBARCADA',pic:'ZZZZZ9'},{av:'AV41BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV82KgMt',fld:'vKGMT',pic:'@!'},{av:'AV37HisProlin',fld:'vHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV29Lecfec',fld:'vLECFEC',pic:''},{av:'AV89Mensa',fld:'vMENSA',pic:''},{av:'AV47BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV94Procod',fld:'vPROCOD',pic:''},{av:'AV67FasDscmf',fld:'vFASDSCMF',pic:''},{av:'AV66FasCodmf',fld:'vFASCODMF',pic:'@!'},{av:'AV11MaqCod',fld:'vMAQCOD',pic:''},{av:'AV13OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV88MaquinaFaseExiste',fld:'vMAQUINAFASEEXISTE',pic:''},{av:'AV69FasTip',fld:'vFASTIP',pic:''},{av:'AV19Station',fld:'vSTATION',pic:''},{av:'AV21UsurCod',fld:'vUSURCOD',pic:'@!'}]}");
      setEventMetadata("VALIDV_OPECOD","{handler:'validv_Opecod',iparms:[{av:'hV13OpeCod'},{av:'AV13OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALIDV_OPECOD",",oparms:[{av:'AV13OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'hV13OpeCod'}]}");
      setEventMetadata("VALIDV_MAQCOD","{handler:'validv_Maqcod',iparms:[{av:'hV11MaqCod'},{av:'AV11MaqCod',fld:'vMAQCOD',pic:''}]");
      setEventMetadata("VALIDV_MAQCOD",",oparms:[{av:'AV11MaqCod',fld:'vMAQCOD',pic:''},{av:'hV11MaqCod'}]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALIDV_LECMAQCOD","{handler:'validv_Lecmaqcod',iparms:[{av:'hV10LecMaqCod'},{av:'AV10LecMaqCod',fld:'vLECMAQCOD',pic:''}]");
      setEventMetadata("VALIDV_LECMAQCOD",",oparms:[{av:'AV10LecMaqCod',fld:'vLECMAQCOD',pic:''},{av:'hV10LecMaqCod'}]}");
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
      AV18SDT_Operario = new app.expedicionesautomatizadas.SdtSDT_Operario(remoteHandle, context);
      AV17SDT_Maquina = new app.expedicionesautomatizadas.SdtSDT_Maquina(remoteHandle, context);
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A13748OpeCNom = "" ;
      A13734MaqCDsc = "" ;
      hV13OpeCod = "" ;
      hV11MaqCod = "" ;
      hV10LecMaqCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV36HisProf = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV106Pgmname = "" ;
      AV7EmprCod = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A365DisDes = "" ;
      A200BarPieCod = "" ;
      A8838CodBarPz = "" ;
      AV69FasTip = "" ;
      A758ProCod = "" ;
      A152BarFasCon = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A6011FasTip = "" ;
      A7600FasH2OReh = "" ;
      AV21UsurCod = "" ;
      AV19Station = "" ;
      AV66FasCodmf = "" ;
      AV67FasDscmf = "" ;
      AV89Mensa = "" ;
      AV29Lecfec = GXutil.nullDate() ;
      AV94Procod = "" ;
      A1166LecMaqCod = "" ;
      A1169LecBarPar = "" ;
      A1171LecFasCod = "" ;
      A653OpeNom = "" ;
      A867ParCodNom = "" ;
      AV11MaqCod = "" ;
      AV10LecMaqCod = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableoperario = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV14OpePass = "" ;
      bttBtnvalidaroperario_Jsonclick = "" ;
      ucDvpanel_tablemaquina = new com.genexus.webpanels.GXUserControl();
      bttBtnvalidarmaquina_Jsonclick = "" ;
      ucDvpanel_tablehdr = new com.genexus.webpanels.GXUserControl();
      AV46BarHdr = "" ;
      bttBtnvalidarhdr_Jsonclick = "" ;
      AV43BarCodPar = "" ;
      ucDvpanel_tableinformacion = new com.genexus.webpanels.GXUserControl();
      AV32LecNom = "" ;
      AV27LecFasNom = "" ;
      AV35LecParNom = "" ;
      AV101vDesEstado = "" ;
      ucDvpanel_table_mensajes = new com.genexus.webpanels.GXUserControl();
      lblTextblock_mensaje_Jsonclick = "" ;
      ucDvpanel_tablevariables = new com.genexus.webpanels.GXUserControl();
      AV82KgMt = "" ;
      AV91NoProc = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncancel_Jsonclick = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV31LecMaqNom = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13748OpeCNom = "" ;
      H01572_A13748OpeCNom = new String[] {""} ;
      l13734MaqCDsc = "" ;
      H01573_A13734MaqCDsc = new String[] {""} ;
      H01574_A13734MaqCDsc = new String[] {""} ;
      H01575_A8482OpeAct = new String[] {""} ;
      H01575_n8482OpeAct = new boolean[] {false} ;
      H01575_A13748OpeCNom = new String[] {""} ;
      H01575_A396EmprCod = new String[] {""} ;
      H01575_A652OpeCod = new int[1] ;
      A8482OpeAct = "" ;
      H01576_A607MaqEst = new String[] {""} ;
      H01576_n607MaqEst = new boolean[] {false} ;
      H01576_A13734MaqCDsc = new String[] {""} ;
      H01576_A396EmprCod = new String[] {""} ;
      H01576_A602MaqCod = new String[] {""} ;
      A607MaqEst = "" ;
      A602MaqCod = "" ;
      H01577_A13734MaqCDsc = new String[] {""} ;
      H01577_A396EmprCod = new String[] {""} ;
      H01577_A602MaqCod = new String[] {""} ;
      H01578_A8482OpeAct = new String[] {""} ;
      H01578_n8482OpeAct = new boolean[] {false} ;
      H01578_A13748OpeCNom = new String[] {""} ;
      H01578_A396EmprCod = new String[] {""} ;
      H01578_A652OpeCod = new int[1] ;
      H01579_A607MaqEst = new String[] {""} ;
      H01579_n607MaqEst = new boolean[] {false} ;
      H01579_A13734MaqCDsc = new String[] {""} ;
      H01579_A396EmprCod = new String[] {""} ;
      H01579_A602MaqCod = new String[] {""} ;
      H015710_A13734MaqCDsc = new String[] {""} ;
      H015710_A396EmprCod = new String[] {""} ;
      H015710_A602MaqCod = new String[] {""} ;
      AV24LecBarPar = "" ;
      hsh = "" ;
      AV8EmprNom = "" ;
      AV6ContDsc2 = "" ;
      AV22Version = "" ;
      GXt_char1 = "" ;
      H015711_A1122MaqCodDis = new String[] {""} ;
      H015711_n1122MaqCodDis = new boolean[] {false} ;
      H015711_A130BarCodPar = new String[] {""} ;
      H015711_A132BarCodReo = new byte[1] ;
      H015711_A129BarCod = new int[1] ;
      H015711_A396EmprCod = new String[] {""} ;
      H015711_A607MaqEst = new String[] {""} ;
      H015711_n607MaqEst = new boolean[] {false} ;
      H015711_A213BarSit = new byte[1] ;
      H015711_A361DisCod = new int[1] ;
      H015711_A125BarAncAca1 = new short[1] ;
      H015711_A252CliCod = new int[1] ;
      H015711_n252CliCod = new boolean[] {false} ;
      H015711_A212BarSer = new String[] {""} ;
      H015711_A365DisDes = new String[] {""} ;
      A1122MaqCodDis = "" ;
      AV40Artcod = "" ;
      AV59DisDes = "" ;
      H015712_A396EmprCod = new String[] {""} ;
      H015712_A129BarCod = new int[1] ;
      H015712_A132BarCodReo = new byte[1] ;
      H015712_A130BarCodPar = new String[] {""} ;
      H015712_A201BarPieEst = new byte[1] ;
      H015712_A8838CodBarPz = new String[] {""} ;
      H015712_n8838CodBarPz = new boolean[] {false} ;
      H015712_A200BarPieCod = new String[] {""} ;
      H015713_A152BarFasCon = new String[] {""} ;
      H015713_A153BarFasEst = new byte[1] ;
      H015713_A130BarCodPar = new String[] {""} ;
      H015713_A132BarCodReo = new byte[1] ;
      H015713_A129BarCod = new int[1] ;
      H015713_A396EmprCod = new String[] {""} ;
      H015713_A457FasCod = new String[] {""} ;
      H015713_A460FasDsc = new String[] {""} ;
      H015713_A6011FasTip = new String[] {""} ;
      H015713_n6011FasTip = new boolean[] {false} ;
      H015713_A7600FasH2OReh = new String[] {""} ;
      H015713_n7600FasH2OReh = new boolean[] {false} ;
      H015713_A194BarOrdLin = new short[1] ;
      H015713_A758ProCod = new String[] {""} ;
      AV65FasCodi = "" ;
      AV98SDT_MaquinaFase = new app.expedicionesautomatizadas.SdtSDT_MaquinaFase(remoteHandle, context);
      GXt_SdtSDT_MaquinaFase9 = new app.expedicionesautomatizadas.SdtSDT_MaquinaFase(remoteHandle, context);
      GXv_SdtSDT_MaquinaFase10 = new app.expedicionesautomatizadas.SdtSDT_MaquinaFase[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int11 = new short[1] ;
      GXt_SdtSDT_Operario14 = new app.expedicionesautomatizadas.SdtSDT_Operario(remoteHandle, context);
      GXv_SdtSDT_Operario15 = new app.expedicionesautomatizadas.SdtSDT_Operario[1] ;
      GXt_SdtSDT_Maquina16 = new app.expedicionesautomatizadas.SdtSDT_Maquina(remoteHandle, context);
      GXv_SdtSDT_Maquina17 = new app.expedicionesautomatizadas.SdtSDT_Maquina[1] ;
      AV97RevisarBarPar = "" ;
      GXv_int8 = new int[1] ;
      GXv_int5 = new byte[1] ;
      H015714_A396EmprCod = new String[] {""} ;
      H015714_A129BarCod = new int[1] ;
      H015714_A132BarCodReo = new byte[1] ;
      H015714_A130BarCodPar = new String[] {""} ;
      H015714_A194BarOrdLin = new short[1] ;
      H015714_A602MaqCod = new String[] {""} ;
      H015714_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H015714_A656ParCod = new short[1] ;
      H015714_n656ParCod = new boolean[] {false} ;
      H015714_A561HisProLin = new int[1] ;
      A558HisProFec = GXutil.nullDate() ;
      H015715_A1172LecParCod = new short[1] ;
      H015715_n1172LecParCod = new boolean[] {false} ;
      H015715_A1171LecFasCod = new String[] {""} ;
      H015715_n1171LecFasCod = new boolean[] {false} ;
      H015715_A1170LecOpeCod = new int[1] ;
      H015715_n1170LecOpeCod = new boolean[] {false} ;
      H015715_A396EmprCod = new String[] {""} ;
      H015715_A1166LecMaqCod = new String[] {""} ;
      H015715_A1167LecBarCod = new int[1] ;
      H015715_n1167LecBarCod = new boolean[] {false} ;
      H015715_A1169LecBarPar = new String[] {""} ;
      H015715_n1169LecBarPar = new boolean[] {false} ;
      H015715_A1168LecBarReo = new byte[1] ;
      H015715_n1168LecBarReo = new boolean[] {false} ;
      H015715_A1188LecFasOrd = new short[1] ;
      H015715_n1188LecFasOrd = new boolean[] {false} ;
      AV26LecFasCod = "" ;
      H015716_A396EmprCod = new String[] {""} ;
      H015716_A652OpeCod = new int[1] ;
      H015716_A653OpeNom = new String[] {""} ;
      H015716_n653OpeNom = new boolean[] {false} ;
      H015717_A396EmprCod = new String[] {""} ;
      H015717_A457FasCod = new String[] {""} ;
      H015717_A460FasDsc = new String[] {""} ;
      H015718_A396EmprCod = new String[] {""} ;
      H015718_A656ParCod = new short[1] ;
      H015718_n656ParCod = new boolean[] {false} ;
      H015718_A867ParCodNom = new String[] {""} ;
      H015718_n867ParCodNom = new boolean[] {false} ;
      AV102EstFase = "" ;
      GXv_char13 = new String[1] ;
      AV103terminus = "" ;
      GXv_char12 = new String[1] ;
      sStyleString = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H015719_A8482OpeAct = new String[] {""} ;
      H015719_n8482OpeAct = new boolean[] {false} ;
      H015719_A13748OpeCNom = new String[] {""} ;
      H015719_A396EmprCod = new String[] {""} ;
      H015719_A652OpeCod = new int[1] ;
      ZhV13OpeCod = "" ;
      H015720_A607MaqEst = new String[] {""} ;
      H015720_n607MaqEst = new boolean[] {false} ;
      H015720_A13734MaqCDsc = new String[] {""} ;
      H015720_A396EmprCod = new String[] {""} ;
      H015720_A602MaqCod = new String[] {""} ;
      ZV11MaqCod = "" ;
      ZhV11MaqCod = "" ;
      H015721_A13734MaqCDsc = new String[] {""} ;
      H015721_A396EmprCod = new String[] {""} ;
      H015721_A602MaqCod = new String[] {""} ;
      ZV10LecMaqCod = "" ;
      ZhV10LecMaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webwopeexp__default(),
         new Object[] {
             new Object[] {
            H01572_A13748OpeCNom
            }
            , new Object[] {
            H01573_A13734MaqCDsc
            }
            , new Object[] {
            H01574_A13734MaqCDsc
            }
            , new Object[] {
            H01575_A8482OpeAct, H01575_n8482OpeAct, H01575_A13748OpeCNom, H01575_A396EmprCod, H01575_A652OpeCod
            }
            , new Object[] {
            H01576_A607MaqEst, H01576_n607MaqEst, H01576_A13734MaqCDsc, H01576_A396EmprCod, H01576_A602MaqCod
            }
            , new Object[] {
            H01577_A13734MaqCDsc, H01577_A396EmprCod, H01577_A602MaqCod
            }
            , new Object[] {
            H01578_A8482OpeAct, H01578_n8482OpeAct, H01578_A13748OpeCNom, H01578_A396EmprCod, H01578_A652OpeCod
            }
            , new Object[] {
            H01579_A607MaqEst, H01579_n607MaqEst, H01579_A13734MaqCDsc, H01579_A396EmprCod, H01579_A602MaqCod
            }
            , new Object[] {
            H015710_A13734MaqCDsc, H015710_A396EmprCod, H015710_A602MaqCod
            }
            , new Object[] {
            H015711_A1122MaqCodDis, H015711_n1122MaqCodDis, H015711_A130BarCodPar, H015711_A132BarCodReo, H015711_A129BarCod, H015711_A396EmprCod, H015711_A607MaqEst, H015711_n607MaqEst, H015711_A213BarSit, H015711_A361DisCod,
            H015711_A125BarAncAca1, H015711_A252CliCod, H015711_n252CliCod, H015711_A212BarSer, H015711_A365DisDes
            }
            , new Object[] {
            H015712_A396EmprCod, H015712_A129BarCod, H015712_A132BarCodReo, H015712_A130BarCodPar, H015712_A201BarPieEst, H015712_A8838CodBarPz, H015712_n8838CodBarPz, H015712_A200BarPieCod
            }
            , new Object[] {
            H015713_A152BarFasCon, H015713_A153BarFasEst, H015713_A130BarCodPar, H015713_A132BarCodReo, H015713_A129BarCod, H015713_A396EmprCod, H015713_A457FasCod, H015713_A460FasDsc, H015713_A6011FasTip, H015713_n6011FasTip,
            H015713_A7600FasH2OReh, H015713_n7600FasH2OReh, H015713_A194BarOrdLin, H015713_A758ProCod
            }
            , new Object[] {
            H015714_A396EmprCod, H015714_A129BarCod, H015714_A132BarCodReo, H015714_A130BarCodPar, H015714_A194BarOrdLin, H015714_A602MaqCod, H015714_A558HisProFec, H015714_A656ParCod, H015714_n656ParCod, H015714_A561HisProLin
            }
            , new Object[] {
            H015715_A1172LecParCod, H015715_n1172LecParCod, H015715_A1171LecFasCod, H015715_n1171LecFasCod, H015715_A1170LecOpeCod, H015715_n1170LecOpeCod, H015715_A396EmprCod, H015715_A1166LecMaqCod, H015715_A1167LecBarCod, H015715_n1167LecBarCod,
            H015715_A1169LecBarPar, H015715_n1169LecBarPar, H015715_A1168LecBarReo, H015715_n1168LecBarReo, H015715_A1188LecFasOrd, H015715_n1188LecFasOrd
            }
            , new Object[] {
            H015716_A396EmprCod, H015716_A652OpeCod, H015716_A653OpeNom, H015716_n653OpeNom
            }
            , new Object[] {
            H015717_A396EmprCod, H015717_A457FasCod, H015717_A460FasDsc
            }
            , new Object[] {
            H015718_A396EmprCod, H015718_A656ParCod, H015718_A867ParCodNom, H015718_n867ParCodNom
            }
            , new Object[] {
            H015719_A8482OpeAct, H015719_n8482OpeAct, H015719_A13748OpeCNom, H015719_A396EmprCod, H015719_A652OpeCod
            }
            , new Object[] {
            H015720_A607MaqEst, H015720_n607MaqEst, H015720_A13734MaqCDsc, H015720_A396EmprCod, H015720_A602MaqCod
            }
            , new Object[] {
            H015721_A13734MaqCDsc, H015721_A396EmprCod, H015721_A602MaqCod
            }
         }
      );
      AV106Pgmname = "ExpedicionesAutomatizadas.WebWOPEEXP" ;
      /* GeneXus formulas. */
      AV106Pgmname = "ExpedicionesAutomatizadas.WebWOPEEXP" ;
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavLecmaqcod_Enabled = 0 ;
      edtavLecbarcod_Enabled = 0 ;
      edtavLecbarreo_Enabled = 0 ;
      edtavLecbarpar_Enabled = 0 ;
      edtavLecfasnom_Enabled = 0 ;
      edtavLecparnom_Enabled = 0 ;
      edtavVdesestado_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV60EstadoAnt ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A201BarPieEst ;
   private byte A153BarFasEst ;
   private byte AV39Turno ;
   private byte A1168LecBarReo ;
   private byte AV44BarCodReo ;
   private byte AV73FlagCB ;
   private byte AV75FlagRibes ;
   private byte AV76FlagSit ;
   private byte AV86Magosa ;
   private byte AV71Finite ;
   private byte AV81JBP ;
   private byte AV61Estamp ;
   private byte AV20Tintutex ;
   private byte AV100TinEst ;
   private byte AV99Tinamar ;
   private byte AV68FasMan ;
   private byte AV80JBMartin ;
   private byte AV64F_vt ;
   private byte AV79Hidro ;
   private byte AV70Fidel ;
   private byte AV51CieHrI ;
   private byte AV52Cierre_Hdr ;
   private byte AV96Revhdm ;
   private byte AV90MetSim ;
   private byte AV63ExpSinDetail ;
   private byte AV50Carolina ;
   private byte AV83KgMtcc ;
   private byte AV56CosFrac ;
   private byte AV62Expcondetail ;
   private byte AV95PzasTrozos ;
   private byte AV93Pass00 ;
   private byte AV77FsSgts ;
   private byte AV54ContadorCarvema ;
   private byte AV55ContadorErfoc ;
   private byte AV49bianco ;
   private byte nDonePA ;
   private byte AV25LecBarReo ;
   private byte GXt_int6 ;
   private byte AV107GXLvl178 ;
   private byte AV48BarSit ;
   private byte AV92Num_etq ;
   private byte AV45Barfasest ;
   private byte AV109GXLvl247 ;
   private byte GXv_int5[] ;
   private byte AV85Lhipro ;
   private byte nGXWrapped ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_10 ;
   private short nIsMod_10 ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short A125BarAncAca1 ;
   private short A194BarOrdLin ;
   private short AV34Lecparcod ;
   private short AV47BarOrdLin ;
   private short AV41BarAncAca1 ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short A656ParCod ;
   private short wbEnd ;
   private short wbStart ;
   private short AV9IntentosPassword ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short GXv_int11[] ;
   private short AV84Largo ;
   private short AV28LecFasord ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV42Barcada ;
   private int AV37HisProlin ;
   private int A1167LecBarCod ;
   private int A1170LecOpeCod ;
   private int A652OpeCod ;
   private int AV13OpeCod ;
   private int edtavOpecod_Enabled ;
   private int edtavOpepass_Enabled ;
   private int edtavMaqcod_Enabled ;
   private int edtavBarhdr_Enabled ;
   private int AV5BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavLecnom_Enabled ;
   private int edtavLecfasnom_Enabled ;
   private int edtavLecparnom_Enabled ;
   private int edtavVdesestado_Enabled ;
   private int edtavIntentospassword_Enabled ;
   private int edtavFlagcb_Enabled ;
   private int edtavFlagribes_Enabled ;
   private int edtavFlagsit_Enabled ;
   private int edtavMagosa_Enabled ;
   private int edtavFinite_Enabled ;
   private int edtavJbp_Enabled ;
   private int edtavEstamp_Enabled ;
   private int edtavTinest_Enabled ;
   private int edtavTinamar_Enabled ;
   private int edtavFasman_Enabled ;
   private int edtavJbmartin_Enabled ;
   private int edtavF_vt_Enabled ;
   private int edtavHidro_Enabled ;
   private int edtavFidel_Enabled ;
   private int edtavCiehri_Enabled ;
   private int edtavCierre_hdr_Enabled ;
   private int edtavRevhdm_Enabled ;
   private int edtavMetsim_Enabled ;
   private int edtavExpsindetail_Enabled ;
   private int edtavCarolina_Enabled ;
   private int edtavKgmt_Enabled ;
   private int edtavKgmtcc_Enabled ;
   private int edtavCosfrac_Enabled ;
   private int edtavExpcondetail_Enabled ;
   private int edtavPzastrozos_Enabled ;
   private int edtavPass00_Enabled ;
   private int edtavFssgts_Enabled ;
   private int edtavContadorcarvema_Enabled ;
   private int edtavContadorerfoc_Enabled ;
   private int edtavBianco_Enabled ;
   private int edtavNoproc_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavLecmaqnom_Visible ;
   private int gxdynajaxindex ;
   private int edtavLecmaqcod_Enabled ;
   private int edtavLecbarcod_Enabled ;
   private int edtavLecbarreo_Enabled ;
   private int edtavLecbarpar_Enabled ;
   private int AV23LecBarCod ;
   private int GXt_int7 ;
   private int AV58Discod ;
   private int AV53Clicod ;
   private int GXv_int8[] ;
   private int A561HisProLin ;
   private int AV33LecOpeCod ;
   private int idxLst ;
   private int ZV13OpeCod ;
   private String lblTextblock_mensaje_Caption ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV36HisProf ;
   private String GXKey ;
   private String AV106Pgmname ;
   private String AV7EmprCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A365DisDes ;
   private String A200BarPieCod ;
   private String A8838CodBarPz ;
   private String AV69FasTip ;
   private String A758ProCod ;
   private String A152BarFasCon ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A6011FasTip ;
   private String A7600FasH2OReh ;
   private String AV21UsurCod ;
   private String AV19Station ;
   private String AV66FasCodmf ;
   private String AV67FasDscmf ;
   private String AV89Mensa ;
   private String AV94Procod ;
   private String A1166LecMaqCod ;
   private String A1169LecBarPar ;
   private String A1171LecFasCod ;
   private String A653OpeNom ;
   private String A867ParCodNom ;
   private String AV11MaqCod ;
   private String AV10LecMaqCod ;
   private String Dvpanel_tableoperario_Width ;
   private String Dvpanel_tableoperario_Cls ;
   private String Dvpanel_tableoperario_Title ;
   private String Dvpanel_tableoperario_Iconposition ;
   private String Dvpanel_tablemaquina_Width ;
   private String Dvpanel_tablemaquina_Cls ;
   private String Dvpanel_tablemaquina_Title ;
   private String Dvpanel_tablemaquina_Iconposition ;
   private String Dvpanel_tablehdr_Width ;
   private String Dvpanel_tablehdr_Cls ;
   private String Dvpanel_tablehdr_Title ;
   private String Dvpanel_tablehdr_Iconposition ;
   private String Dvpanel_tableinformacion_Width ;
   private String Dvpanel_tableinformacion_Cls ;
   private String Dvpanel_tableinformacion_Title ;
   private String Dvpanel_tableinformacion_Iconposition ;
   private String Dvpanel_table_mensajes_Width ;
   private String Dvpanel_table_mensajes_Cls ;
   private String Dvpanel_table_mensajes_Title ;
   private String Dvpanel_table_mensajes_Iconposition ;
   private String Dvpanel_tablevariables_Width ;
   private String Dvpanel_tablevariables_Cls ;
   private String Dvpanel_tablevariables_Title ;
   private String Dvpanel_tablevariables_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divTableunificadora_1_Internalname ;
   private String Dvpanel_tableoperario_Internalname ;
   private String divTableoperario_Internalname ;
   private String edtavOpecod_Internalname ;
   private String TempTags ;
   private String edtavOpecod_Jsonclick ;
   private String edtavOpepass_Internalname ;
   private String AV14OpePass ;
   private String edtavOpepass_Jsonclick ;
   private String bttBtnvalidaroperario_Internalname ;
   private String bttBtnvalidaroperario_Jsonclick ;
   private String divDvpanel_tablemaquina_cell_Internalname ;
   private String divDvpanel_tablemaquina_cell_Class ;
   private String Dvpanel_tablemaquina_Internalname ;
   private String divTablemaquina_Internalname ;
   private String edtavMaqcod_Internalname ;
   private String edtavMaqcod_Jsonclick ;
   private String bttBtnvalidarmaquina_Internalname ;
   private String bttBtnvalidarmaquina_Jsonclick ;
   private String divTableunificadora_2_Internalname ;
   private String divDvpanel_tablehdr_cell_Internalname ;
   private String divDvpanel_tablehdr_cell_Class ;
   private String Dvpanel_tablehdr_Internalname ;
   private String divTablehdr_Internalname ;
   private String edtavBarhdr_Internalname ;
   private String AV46BarHdr ;
   private String edtavBarhdr_Jsonclick ;
   private String bttBtnvalidarhdr_Internalname ;
   private String bttBtnvalidarhdr_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String AV43BarCodPar ;
   private String edtavBarcodpar_Jsonclick ;
   private String divDvpanel_tableinformacion_cell_Internalname ;
   private String divDvpanel_tableinformacion_cell_Class ;
   private String Dvpanel_tableinformacion_Internalname ;
   private String divTableinformacion_Internalname ;
   private String edtavLecnom_Internalname ;
   private String AV32LecNom ;
   private String edtavLecnom_Jsonclick ;
   private String edtavLecfasnom_Internalname ;
   private String AV27LecFasNom ;
   private String edtavLecfasnom_Jsonclick ;
   private String edtavLecparnom_Internalname ;
   private String AV35LecParNom ;
   private String edtavLecparnom_Jsonclick ;
   private String edtavVdesestado_Internalname ;
   private String AV101vDesEstado ;
   private String edtavVdesestado_Jsonclick ;
   private String Dvpanel_table_mensajes_Internalname ;
   private String divTable_mensajes_Internalname ;
   private String lblTextblock_mensaje_Internalname ;
   private String lblTextblock_mensaje_Jsonclick ;
   private String Dvpanel_tablevariables_Internalname ;
   private String divTablevariables_Internalname ;
   private String edtavIntentospassword_Internalname ;
   private String edtavIntentospassword_Jsonclick ;
   private String edtavFlagcb_Internalname ;
   private String edtavFlagcb_Jsonclick ;
   private String edtavFlagribes_Internalname ;
   private String edtavFlagribes_Jsonclick ;
   private String edtavFlagsit_Internalname ;
   private String edtavFlagsit_Jsonclick ;
   private String edtavMagosa_Internalname ;
   private String edtavMagosa_Jsonclick ;
   private String edtavFinite_Internalname ;
   private String edtavFinite_Jsonclick ;
   private String edtavJbp_Internalname ;
   private String edtavJbp_Jsonclick ;
   private String edtavEstamp_Internalname ;
   private String edtavEstamp_Jsonclick ;
   private String edtavTinest_Internalname ;
   private String edtavTinest_Jsonclick ;
   private String edtavTinamar_Internalname ;
   private String edtavTinamar_Jsonclick ;
   private String edtavFasman_Internalname ;
   private String edtavFasman_Jsonclick ;
   private String edtavJbmartin_Internalname ;
   private String edtavJbmartin_Jsonclick ;
   private String edtavF_vt_Internalname ;
   private String edtavF_vt_Jsonclick ;
   private String edtavHidro_Internalname ;
   private String edtavHidro_Jsonclick ;
   private String edtavFidel_Internalname ;
   private String edtavFidel_Jsonclick ;
   private String edtavCiehri_Internalname ;
   private String edtavCiehri_Jsonclick ;
   private String edtavCierre_hdr_Internalname ;
   private String edtavCierre_hdr_Jsonclick ;
   private String edtavRevhdm_Internalname ;
   private String edtavRevhdm_Jsonclick ;
   private String edtavMetsim_Internalname ;
   private String edtavMetsim_Jsonclick ;
   private String edtavExpsindetail_Internalname ;
   private String edtavExpsindetail_Jsonclick ;
   private String edtavCarolina_Internalname ;
   private String edtavCarolina_Jsonclick ;
   private String edtavKgmt_Internalname ;
   private String AV82KgMt ;
   private String edtavKgmt_Jsonclick ;
   private String edtavKgmtcc_Internalname ;
   private String edtavKgmtcc_Jsonclick ;
   private String edtavCosfrac_Internalname ;
   private String edtavCosfrac_Jsonclick ;
   private String edtavExpcondetail_Internalname ;
   private String edtavExpcondetail_Jsonclick ;
   private String edtavPzastrozos_Internalname ;
   private String edtavPzastrozos_Jsonclick ;
   private String edtavPass00_Internalname ;
   private String edtavPass00_Jsonclick ;
   private String edtavFssgts_Internalname ;
   private String edtavFssgts_Jsonclick ;
   private String edtavContadorcarvema_Internalname ;
   private String edtavContadorcarvema_Jsonclick ;
   private String edtavContadorerfoc_Internalname ;
   private String edtavContadorerfoc_Jsonclick ;
   private String edtavBianco_Internalname ;
   private String edtavBianco_Jsonclick ;
   private String edtavNoproc_Internalname ;
   private String AV91NoProc ;
   private String edtavNoproc_Jsonclick ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncancel_Internalname ;
   private String bttBtncancel_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavLecmaqnom_Internalname ;
   private String AV31LecMaqNom ;
   private String edtavLecmaqnom_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A8482OpeAct ;
   private String A607MaqEst ;
   private String A602MaqCod ;
   private String edtavLecmaqcod_Internalname ;
   private String edtavLecbarcod_Internalname ;
   private String edtavLecbarreo_Internalname ;
   private String edtavLecbarpar_Internalname ;
   private String AV24LecBarPar ;
   private String hsh ;
   private String AV8EmprNom ;
   private String AV6ContDsc2 ;
   private String AV22Version ;
   private String GXt_char1 ;
   private String A1122MaqCodDis ;
   private String AV40Artcod ;
   private String AV59DisDes ;
   private String AV65FasCodi ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV97RevisarBarPar ;
   private String AV26LecFasCod ;
   private String AV102EstFase ;
   private String GXv_char13[] ;
   private String AV103terminus ;
   private String GXv_char12[] ;
   private String sStyleString ;
   private String tblDatoshdr_Internalname ;
   private String edtavLecbarcod_Jsonclick ;
   private String edtavLecbarreo_Jsonclick ;
   private String edtavLecbarpar_Jsonclick ;
   private String tblDatosmaquina_Internalname ;
   private String edtavLecmaqcod_Jsonclick ;
   private String ZV11MaqCod ;
   private String ZV10LecMaqCod ;
   private java.util.Date AV29Lecfec ;
   private java.util.Date A558HisProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV12MaquinaValidada ;
   private boolean AV15OperarioValidado ;
   private boolean AV78HDRExiste ;
   private boolean AV88MaquinaFaseExiste ;
   private boolean Dvpanel_tableoperario_Autowidth ;
   private boolean Dvpanel_tableoperario_Autoheight ;
   private boolean Dvpanel_tableoperario_Collapsible ;
   private boolean Dvpanel_tableoperario_Collapsed ;
   private boolean Dvpanel_tableoperario_Showcollapseicon ;
   private boolean Dvpanel_tableoperario_Autoscroll ;
   private boolean Dvpanel_tablemaquina_Autowidth ;
   private boolean Dvpanel_tablemaquina_Autoheight ;
   private boolean Dvpanel_tablemaquina_Collapsible ;
   private boolean Dvpanel_tablemaquina_Collapsed ;
   private boolean Dvpanel_tablemaquina_Showcollapseicon ;
   private boolean Dvpanel_tablemaquina_Autoscroll ;
   private boolean Dvpanel_tablehdr_Autowidth ;
   private boolean Dvpanel_tablehdr_Autoheight ;
   private boolean Dvpanel_tablehdr_Collapsible ;
   private boolean Dvpanel_tablehdr_Collapsed ;
   private boolean Dvpanel_tablehdr_Showcollapseicon ;
   private boolean Dvpanel_tablehdr_Autoscroll ;
   private boolean Dvpanel_tableinformacion_Autowidth ;
   private boolean Dvpanel_tableinformacion_Autoheight ;
   private boolean Dvpanel_tableinformacion_Collapsible ;
   private boolean Dvpanel_tableinformacion_Collapsed ;
   private boolean Dvpanel_tableinformacion_Showcollapseicon ;
   private boolean Dvpanel_tableinformacion_Autoscroll ;
   private boolean Dvpanel_table_mensajes_Autowidth ;
   private boolean Dvpanel_table_mensajes_Autoheight ;
   private boolean Dvpanel_table_mensajes_Collapsible ;
   private boolean Dvpanel_table_mensajes_Collapsed ;
   private boolean Dvpanel_table_mensajes_Showcollapseicon ;
   private boolean Dvpanel_table_mensajes_Autoscroll ;
   private boolean Dvpanel_tablevariables_Autowidth ;
   private boolean Dvpanel_tablevariables_Autoheight ;
   private boolean Dvpanel_tablevariables_Collapsible ;
   private boolean Dvpanel_tablevariables_Collapsed ;
   private boolean Dvpanel_tablevariables_Showcollapseicon ;
   private boolean Dvpanel_tablevariables_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n8482OpeAct ;
   private boolean n607MaqEst ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n1122MaqCodDis ;
   private boolean n252CliCod ;
   private boolean n8838CodBarPz ;
   private boolean n6011FasTip ;
   private boolean n7600FasH2OReh ;
   private boolean n656ParCod ;
   private boolean n1172LecParCod ;
   private boolean n1171LecFasCod ;
   private boolean n1170LecOpeCod ;
   private boolean n1167LecBarCod ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1188LecFasOrd ;
   private boolean n653OpeNom ;
   private boolean n867ParCodNom ;
   private String A13748OpeCNom ;
   private String A13734MaqCDsc ;
   private String hV13OpeCod ;
   private String hV11MaqCod ;
   private String hV10LecMaqCod ;
   private String l13748OpeCNom ;
   private String l13734MaqCDsc ;
   private String ZhV13OpeCod ;
   private String ZhV11MaqCod ;
   private String ZhV10LecMaqCod ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableoperario ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablemaquina ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablehdr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableinformacion ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_table_mensajes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablevariables ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private app.expedicionesautomatizadas.SdtSDT_Maquina AV17SDT_Maquina ;
   private app.expedicionesautomatizadas.SdtSDT_Operario AV18SDT_Operario ;
   private ICheckbox chkavTintutex ;
   private IDataStoreProvider pr_default ;
   private String[] H01572_A13748OpeCNom ;
   private String[] H01573_A13734MaqCDsc ;
   private String[] H01574_A13734MaqCDsc ;
   private String[] H01575_A8482OpeAct ;
   private boolean[] H01575_n8482OpeAct ;
   private String[] H01575_A13748OpeCNom ;
   private String[] H01575_A396EmprCod ;
   private int[] H01575_A652OpeCod ;
   private String[] H01576_A607MaqEst ;
   private boolean[] H01576_n607MaqEst ;
   private String[] H01576_A13734MaqCDsc ;
   private String[] H01576_A396EmprCod ;
   private String[] H01576_A602MaqCod ;
   private String[] H01577_A13734MaqCDsc ;
   private String[] H01577_A396EmprCod ;
   private String[] H01577_A602MaqCod ;
   private String[] H01578_A8482OpeAct ;
   private boolean[] H01578_n8482OpeAct ;
   private String[] H01578_A13748OpeCNom ;
   private String[] H01578_A396EmprCod ;
   private int[] H01578_A652OpeCod ;
   private String[] H01579_A607MaqEst ;
   private boolean[] H01579_n607MaqEst ;
   private String[] H01579_A13734MaqCDsc ;
   private String[] H01579_A396EmprCod ;
   private String[] H01579_A602MaqCod ;
   private String[] H015710_A13734MaqCDsc ;
   private String[] H015710_A396EmprCod ;
   private String[] H015710_A602MaqCod ;
   private String[] H015711_A1122MaqCodDis ;
   private boolean[] H015711_n1122MaqCodDis ;
   private String[] H015711_A130BarCodPar ;
   private byte[] H015711_A132BarCodReo ;
   private int[] H015711_A129BarCod ;
   private String[] H015711_A396EmprCod ;
   private String[] H015711_A607MaqEst ;
   private boolean[] H015711_n607MaqEst ;
   private byte[] H015711_A213BarSit ;
   private int[] H015711_A361DisCod ;
   private short[] H015711_A125BarAncAca1 ;
   private int[] H015711_A252CliCod ;
   private boolean[] H015711_n252CliCod ;
   private String[] H015711_A212BarSer ;
   private String[] H015711_A365DisDes ;
   private String[] H015712_A396EmprCod ;
   private int[] H015712_A129BarCod ;
   private byte[] H015712_A132BarCodReo ;
   private String[] H015712_A130BarCodPar ;
   private byte[] H015712_A201BarPieEst ;
   private String[] H015712_A8838CodBarPz ;
   private boolean[] H015712_n8838CodBarPz ;
   private String[] H015712_A200BarPieCod ;
   private String[] H015713_A152BarFasCon ;
   private byte[] H015713_A153BarFasEst ;
   private String[] H015713_A130BarCodPar ;
   private byte[] H015713_A132BarCodReo ;
   private int[] H015713_A129BarCod ;
   private String[] H015713_A396EmprCod ;
   private String[] H015713_A457FasCod ;
   private String[] H015713_A460FasDsc ;
   private String[] H015713_A6011FasTip ;
   private boolean[] H015713_n6011FasTip ;
   private String[] H015713_A7600FasH2OReh ;
   private boolean[] H015713_n7600FasH2OReh ;
   private short[] H015713_A194BarOrdLin ;
   private String[] H015713_A758ProCod ;
   private String[] H015714_A396EmprCod ;
   private int[] H015714_A129BarCod ;
   private byte[] H015714_A132BarCodReo ;
   private String[] H015714_A130BarCodPar ;
   private short[] H015714_A194BarOrdLin ;
   private String[] H015714_A602MaqCod ;
   private java.util.Date[] H015714_A558HisProFec ;
   private short[] H015714_A656ParCod ;
   private boolean[] H015714_n656ParCod ;
   private int[] H015714_A561HisProLin ;
   private short[] H015715_A1172LecParCod ;
   private boolean[] H015715_n1172LecParCod ;
   private String[] H015715_A1171LecFasCod ;
   private boolean[] H015715_n1171LecFasCod ;
   private int[] H015715_A1170LecOpeCod ;
   private boolean[] H015715_n1170LecOpeCod ;
   private String[] H015715_A396EmprCod ;
   private String[] H015715_A1166LecMaqCod ;
   private int[] H015715_A1167LecBarCod ;
   private boolean[] H015715_n1167LecBarCod ;
   private String[] H015715_A1169LecBarPar ;
   private boolean[] H015715_n1169LecBarPar ;
   private byte[] H015715_A1168LecBarReo ;
   private boolean[] H015715_n1168LecBarReo ;
   private short[] H015715_A1188LecFasOrd ;
   private boolean[] H015715_n1188LecFasOrd ;
   private String[] H015716_A396EmprCod ;
   private int[] H015716_A652OpeCod ;
   private String[] H015716_A653OpeNom ;
   private boolean[] H015716_n653OpeNom ;
   private String[] H015717_A396EmprCod ;
   private String[] H015717_A457FasCod ;
   private String[] H015717_A460FasDsc ;
   private String[] H015718_A396EmprCod ;
   private short[] H015718_A656ParCod ;
   private boolean[] H015718_n656ParCod ;
   private String[] H015718_A867ParCodNom ;
   private boolean[] H015718_n867ParCodNom ;
   private String[] H015719_A8482OpeAct ;
   private boolean[] H015719_n8482OpeAct ;
   private String[] H015719_A13748OpeCNom ;
   private String[] H015719_A396EmprCod ;
   private int[] H015719_A652OpeCod ;
   private String[] H015720_A607MaqEst ;
   private boolean[] H015720_n607MaqEst ;
   private String[] H015720_A13734MaqCDsc ;
   private String[] H015720_A396EmprCod ;
   private String[] H015720_A602MaqCod ;
   private String[] H015721_A13734MaqCDsc ;
   private String[] H015721_A396EmprCod ;
   private String[] H015721_A602MaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.expedicionesautomatizadas.SdtSDT_Maquina GXt_SdtSDT_Maquina16 ;
   private app.expedicionesautomatizadas.SdtSDT_Maquina GXv_SdtSDT_Maquina17[] ;
   private app.expedicionesautomatizadas.SdtSDT_MaquinaFase AV98SDT_MaquinaFase ;
   private app.expedicionesautomatizadas.SdtSDT_MaquinaFase GXt_SdtSDT_MaquinaFase9 ;
   private app.expedicionesautomatizadas.SdtSDT_MaquinaFase GXv_SdtSDT_MaquinaFase10[] ;
   private app.expedicionesautomatizadas.SdtSDT_Operario GXt_SdtSDT_Operario14 ;
   private app.expedicionesautomatizadas.SdtSDT_Operario GXv_SdtSDT_Operario15[] ;
}

final  class webwopeexp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H015711( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV43BarCodPar ,
                                           String A130BarCodPar ,
                                           String AV7EmprCod ,
                                           int AV5BarCod ,
                                           byte AV44BarCodReo ,
                                           String A396EmprCod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[4];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T2.MaqCodDis AS MaqCodDis, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T3.MaqEst, T1.BarSit, T1.DisCod, T1.BarAncAca1, T1.CliCod, T1.BarSer, T1.DisDes" ;
      scmdbuf += " FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod" ;
      scmdbuf += " = T2.MaqCodDis)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ?)");
      if ( ! (GXutil.strcmp("", AV43BarCodPar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43BarCodPar)==0) )
      {
         addWhere(sWhereString, "((rtrim(T1.BarCodPar) IS NULL AND NOT(T1.BarCodPar IS NULL)))");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_H015713( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV43BarCodPar ,
                                           String A130BarCodPar ,
                                           byte A153BarFasEst ,
                                           String A152BarFasCon ,
                                           String AV7EmprCod ,
                                           int AV42Barcada ,
                                           byte AV44BarCodReo ,
                                           String A396EmprCod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[4];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.BarFasCon, T1.BarFasEst, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.FasCod, T2.FasDsc, T2.FasTip, T2.FasH2OReh, T1.BarOrdLin, T1.ProCod FROM" ;
      scmdbuf += " (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarFasEst <> 2)");
      addWhere(sWhereString, "(T1.BarFasCon = 'S')");
      if ( ! (GXutil.strcmp("", AV43BarCodPar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43BarCodPar)==0) )
      {
         addWhere(sWhereString, "((rtrim(T1.BarCodPar) IS NULL AND NOT(T1.BarCodPar IS NULL)))");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 9 :
                  return conditional_H015711(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() );
            case 11 :
                  return conditional_H015713(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01572", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom FROM TXPOPERAR WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, '')))) like '%' || UPPER(?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01573", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?) ORDER BY MaqCDsc) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01574", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like UPPER(?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01575", "SELECT OpeAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01576", "SELECT MaqEst, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01577", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01578", "SELECT OpeAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01579", "SELECT MaqEst, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015710", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015711", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015712", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieEst, CodBarPz, BarPieCod FROM TXPBARPIE WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarPieEst = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015713", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015714", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, MaqCod, HisProFec, ParCod, HisProLin FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? and MaqCod = ? and HisProFec = ?) AND ((ParCod = 0)) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, MaqCod, HisProFec, HisProLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H015715", "SELECT LecParCod, LecFasCod, LecOpeCod, EmprCod, LecMaqCod, LecBarCod, LecBarPar, LecBarReo, LecFasOrd FROM TXPLECTOR WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H015716", "SELECT EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H015717", "SELECT EmprCod, FasCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H015718", "SELECT EmprCod, ParCod, ParCodNom FROM TXPCODPAR WHERE EmprCod = ? and ParCod = ? ORDER BY EmprCod, ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H015719", "SELECT OpeAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015720", "SELECT MaqEst, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015721", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((String[]) buf[14])[0] = rslt.getString(12, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 28);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[6]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 1);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[6]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 1);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setDate(7, (java.util.Date)parms[6]);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
      }
   }

}

