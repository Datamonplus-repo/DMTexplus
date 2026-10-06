package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webreoperadosinternoskilosmetrospiezas_impl extends GXDataArea
{
   public webreoperadosinternoskilosmetrospiezas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webreoperadosinternoskilosmetrospiezas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webreoperadosinternoskilosmetrospiezas_impl.class ));
   }

   public webreoperadosinternoskilosmetrospiezas_impl( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavTipreo = new HTMLChoice();
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
            AV7Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV19BarNHdr = httpContext.GetPar( "BarNHdr") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19BarNHdr", AV19BarNHdr);
               AV8Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Barcod), 8, 0));
               AV5Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5Barcodreo", GXutil.str( AV5Barcodreo, 1, 0));
               AV6Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
               AV12BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12BarKgm", GXutil.ltrimstr( AV12BarKgm, 9, 2));
               AV13BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13BarMtr", GXutil.ltrimstr( AV13BarMtr, 9, 2));
               AV14BarPie = (int)(GXutil.lval( httpContext.GetPar( "BarPie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarPie), 6, 0));
               AV15BarUnimed = httpContext.GetPar( "BarUnimed") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15BarUnimed", AV15BarUnimed);
               AV27BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27BarSit), 2, 0));
               AV37KilAct = CommonUtil.decimalVal( httpContext.GetPar( "KilAct"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37KilAct", GXutil.ltrimstr( AV37KilAct, 9, 2));
               AV38MtrAct = CommonUtil.decimalVal( httpContext.GetPar( "MtrAct"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38MtrAct", GXutil.ltrimstr( AV38MtrAct, 9, 2));
               AV47BarCosAny = CommonUtil.decimalVal( httpContext.GetPar( "BarCosAny"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV47BarCosAny", GXutil.ltrimstr( AV47BarCosAny, 10, 2));
               AV46BarCosPro = CommonUtil.decimalVal( httpContext.GetPar( "BarCosPro"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46BarCosPro", GXutil.ltrimstr( AV46BarCosPro, 10, 2));
               AV53prior = httpContext.GetPar( "prior") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV53prior", AV53prior);
               AV36UsurCod = httpContext.GetPar( "UsurCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36UsurCod", AV36UsurCod);
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
      paEC2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startEC2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webreoperadosinternoskilosmetrospiezas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV19BarNHdr)),GXutil.URLEncode(GXutil.ltrimstr(AV8Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV5Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6Barcodpar)),GXutil.URLEncode(DecimalUtil.decToString(AV12BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV13BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarPie,6,0)),GXutil.URLEncode(GXutil.rtrim(AV15BarUnimed)),GXutil.URLEncode(GXutil.ltrimstr(AV27BarSit,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV37KilAct)),GXutil.URLEncode(DecimalUtil.decToString(AV38MtrAct)),GXutil.URLEncode(DecimalUtil.decToString(AV47BarCosAny)),GXutil.URLEncode(DecimalUtil.decToString(AV46BarCosPro)),GXutil.URLEncode(GXutil.rtrim(AV53prior)),GXutil.URLEncode(GXutil.rtrim(AV36UsurCod))}, new String[] {"Emprcod","BarNHdr","Barcod","Barcodreo","Barcodpar","BarKgm","BarMtr","BarPie","BarUnimed","BarSit","KilAct","MtrAct","BarCosAny","BarCosPro","prior","UsurCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDRDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20BarNHdrdestino, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WebReoperadosInternosKilosMetrosPiezas");
      forbiddenHiddens.add("BarPes", localUtil.format( DecimalUtil.doubleToDec(AV80BarPes), "ZZZ9"));
      forbiddenHiddens.add("BarGraAca", localUtil.format( DecimalUtil.doubleToDec(AV81BarGraAca), "ZZZ9"));
      forbiddenHiddens.add("BarAncAca1", localUtil.format( DecimalUtil.doubleToDec(AV82BarAncAca1), "ZZ9"));
      forbiddenHiddens.add("kilos", localUtil.format( AV71kilos, "ZZZZZ9.99"));
      forbiddenHiddens.add("metros", localUtil.format( AV72metros, "ZZZZZ9.99"));
      forbiddenHiddens.add("piezas", localUtil.format( DecimalUtil.doubleToDec(AV73piezas), "ZZZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("webreoperadosinternoskilosmetrospiezas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD_DATA", AV65MaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD_DATA", AV65MaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPDEFCOD_DATA", AV67TipDefCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPDEFCOD_DATA", AV67TipDefCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCODCAUSA_DATA", AV68CodCausa_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCODCAUSA_DATA", AV68CodCausa_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vRPS_COD_DATA", AV69Rps_Cod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vRPS_COD_DATA", AV69Rps_Cod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOPECOD_DATA", AV70Opecod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOPECOD_DATA", AV70Opecod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNHDRDESTINO", GXutil.rtrim( AV20BarNHdrdestino));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDRDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20BarNHdrdestino, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRIOR", GXutil.rtrim( AV53prior));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV5Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV8Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV6Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSIT", GXutil.ltrim( localUtil.ntoc( AV27BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPORCEN", GXutil.ltrim( localUtil.ntoc( AV29Porcen, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONREO", GXutil.ltrim( localUtil.ntoc( AV30ConReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV32DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV109Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV36UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV39Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vKGMORI", GXutil.ltrim( localUtil.ntoc( AV56KgmOri, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETORI", GXutil.ltrim( localUtil.ntoc( AV57MetOri, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSITRI", GXutil.ltrim( localUtil.ntoc( AV64Barsitri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOSPRO", GXutil.ltrim( localUtil.ntoc( AV46BarCosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOSANY", GXutil.ltrim( localUtil.ntoc( AV47BarCosAny, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTRACT", GXutil.ltrim( localUtil.ntoc( AV38MtrAct, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILACT", GXutil.ltrim( localUtil.ntoc( AV37KilAct, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSPRO", GXutil.ltrim( localUtil.ntoc( AV48CosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSANY", GXutil.ltrim( localUtil.ntoc( AV49CosAny, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSPRO2", GXutil.ltrim( localUtil.ntoc( AV50CosPro2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSANY2", GXutil.ltrim( localUtil.ntoc( AV51CosAny2, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOBJETOREFRESCAR", AV100ObjetoRefrescar);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOBJETOREFRESCAR", AV100ObjetoRefrescar);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.rtrim( AV35Ok));
      app.GxWebStd.gx_hidden_field( httpContext, "vANCHO", GXutil.ltrim( localUtil.ntoc( AV83Ancho, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Cls", GXutil.rtrim( Combo_maqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_maqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Emptyitem", GXutil.booltostr( Combo_maqcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDEFCOD_Cls", GXutil.rtrim( Combo_tipdefcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDEFCOD_Selectedvalue_set", GXutil.rtrim( Combo_tipdefcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDEFCOD_Emptyitem", GXutil.booltostr( Combo_tipdefcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CODCAUSA_Cls", GXutil.rtrim( Combo_codcausa_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CODCAUSA_Selectedvalue_set", GXutil.rtrim( Combo_codcausa_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CODCAUSA_Emptyitemtext", GXutil.rtrim( Combo_codcausa_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_RPS_COD_Cls", GXutil.rtrim( Combo_rps_cod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_RPS_COD_Selectedvalue_set", GXutil.rtrim( Combo_rps_cod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_RPS_COD_Emptyitemtext", GXutil.rtrim( Combo_rps_cod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPECOD_Cls", GXutil.rtrim( Combo_opecod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPECOD_Selectedvalue_set", GXutil.rtrim( Combo_opecod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPECOD_Emptyitemtext", GXutil.rtrim( Combo_opecod_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASDATOS_Width", GXutil.rtrim( Dvpanel_panelmasdatos_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASDATOS_Autowidth", GXutil.booltostr( Dvpanel_panelmasdatos_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASDATOS_Autoheight", GXutil.booltostr( Dvpanel_panelmasdatos_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASDATOS_Cls", GXutil.rtrim( Dvpanel_panelmasdatos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASDATOS_Title", GXutil.rtrim( Dvpanel_panelmasdatos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASDATOS_Collapsible", GXutil.booltostr( Dvpanel_panelmasdatos_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASDATOS_Collapsed", GXutil.booltostr( Dvpanel_panelmasdatos_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASDATOS_Showcollapseicon", GXutil.booltostr( Dvpanel_panelmasdatos_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASDATOS_Iconposition", GXutil.rtrim( Dvpanel_panelmasdatos_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASDATOS_Autoscroll", GXutil.booltostr( Dvpanel_panelmasdatos_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPECOD_Selectedvalue_get", GXutil.rtrim( Combo_opecod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_RPS_COD_Selectedvalue_get", GXutil.rtrim( Combo_rps_cod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CODCAUSA_Selectedvalue_get", GXutil.rtrim( Combo_codcausa_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDEFCOD_Selectedvalue_get", GXutil.rtrim( Combo_tipdefcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
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
         weEC2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtEC2( ) ;
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
      return formatLink("app.webreoperadosinternoskilosmetrospiezas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV19BarNHdr)),GXutil.URLEncode(GXutil.ltrimstr(AV8Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV5Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6Barcodpar)),GXutil.URLEncode(DecimalUtil.decToString(AV12BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV13BarMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarPie,6,0)),GXutil.URLEncode(GXutil.rtrim(AV15BarUnimed)),GXutil.URLEncode(GXutil.ltrimstr(AV27BarSit,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV37KilAct)),GXutil.URLEncode(DecimalUtil.decToString(AV38MtrAct)),GXutil.URLEncode(DecimalUtil.decToString(AV47BarCosAny)),GXutil.URLEncode(DecimalUtil.decToString(AV46BarCosPro)),GXutil.URLEncode(GXutil.rtrim(AV53prior)),GXutil.URLEncode(GXutil.rtrim(AV36UsurCod))}, new String[] {"Emprcod","BarNHdr","Barcod","Barcodreo","Barcodpar","BarKgm","BarMtr","BarPie","BarUnimed","BarSit","KilAct","MtrAct","BarCosAny","BarCosPro","prior","UsurCod"})  ;
   }

   public String getPgmname( )
   {
      return "WebReoperadosInternosKilosMetrosPiezas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Reoperados Internos", "") ;
   }

   public void wbEC0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsalir_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtnsalir_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSALIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnhdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnhdr_Internalname, httpContext.getMessage( "N Hdr", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV19BarNHdr), GXutil.rtrim( localUtil.format( AV19BarNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarunimed_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarunimed_Internalname, httpContext.getMessage( "Unidad", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarunimed_Internalname, GXutil.rtrim( AV15BarUnimed), GXutil.rtrim( localUtil.format( AV15BarUnimed, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarunimed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarunimed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpes_Internalname, httpContext.getMessage( "Pml", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpes_Internalname, GXutil.ltrim( localUtil.ntoc( AV80BarPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV80BarPes), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV80BarPes), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpes_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBargraaca_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBargraaca_Internalname, httpContext.getMessage( "Grm2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBargraaca_Internalname, GXutil.ltrim( localUtil.ntoc( AV81BarGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBargraaca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV81BarGraAca), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV81BarGraAca), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBargraaca_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBargraaca_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarancaca1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarancaca1_Internalname, httpContext.getMessage( "Ancho", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarancaca1_Internalname, GXutil.ltrim( localUtil.ntoc( AV82BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarancaca1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV82BarAncAca1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV82BarAncAca1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarancaca1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarancaca1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "Kilos", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV12BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV12BarKgm, "ZZZZZ9.99") : localUtil.format( AV12BarKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmtr_Internalname, httpContext.getMessage( "Metros", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV13BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV13BarMtr, "ZZZZZ9.99") : localUtil.format( AV13BarMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpie_Internalname, httpContext.getMessage( "Piezas", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpie_Internalname, GXutil.ltrim( localUtil.ntoc( AV14BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14BarPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavKilos_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavKilos_Internalname, httpContext.getMessage( "Kilos Ent.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavKilos_Internalname, GXutil.ltrim( localUtil.ntoc( AV71kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavKilos_Enabled!=0) ? localUtil.format( AV71kilos, "ZZZZZ9.99") : localUtil.format( AV71kilos, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavKilos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavKilos_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetros_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetros_Internalname, httpContext.getMessage( "Metros Ent.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetros_Internalname, GXutil.ltrim( localUtil.ntoc( AV72metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetros_Enabled!=0) ? localUtil.format( AV72metros, "ZZZZZ9.99") : localUtil.format( AV72metros, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetros_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetros_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPiezas_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPiezas_Internalname, httpContext.getMessage( "Piezas Ent", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPiezas_Internalname, GXutil.ltrim( localUtil.ntoc( AV73piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPiezas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV73piezas), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV73piezas), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPiezas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPiezas_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavKilosdisponible_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavKilosdisponible_Internalname, httpContext.getMessage( "Kilos Disp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavKilosdisponible_Internalname, GXutil.ltrim( localUtil.ntoc( AV75kilosdisponible, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavKilosdisponible_Enabled!=0) ? localUtil.format( AV75kilosdisponible, "ZZZZZ9.99") : localUtil.format( AV75kilosdisponible, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,92);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavKilosdisponible_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavKilosdisponible_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetrosdisponible_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetrosdisponible_Internalname, httpContext.getMessage( "Metros Disp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetrosdisponible_Internalname, GXutil.ltrim( localUtil.ntoc( AV76metrosdisponible, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetrosdisponible_Enabled!=0) ? localUtil.format( AV76metrosdisponible, "ZZZZZ9.99") : localUtil.format( AV76metrosdisponible, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetrosdisponible_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetrosdisponible_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPiezasdisponible_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPiezasdisponible_Internalname, httpContext.getMessage( "Piezas Disp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPiezasdisponible_Internalname, GXutil.ltrim( localUtil.ntoc( AV74piezasdisponible, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPiezasdisponible_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV74piezasdisponible), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV74piezasdisponible), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPiezasdisponible_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPiezasdisponible_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcod_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblockcombo_maqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcod.setProperty("Caption", Combo_maqcod_Caption);
         ucCombo_maqcod.setProperty("Cls", Combo_maqcod_Cls);
         ucCombo_maqcod.setProperty("EmptyItem", Combo_maqcod_Emptyitem);
         ucCombo_maqcod.setProperty("DropDownOptionsData", AV65MaqCod_Data);
         ucCombo_maqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod_Internalname, "COMBO_MAQCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipdefcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tipdefcod_Internalname, httpContext.getMessage( "Defecto", ""), "", "", lblTextblockcombo_tipdefcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tipdefcod.setProperty("Caption", Combo_tipdefcod_Caption);
         ucCombo_tipdefcod.setProperty("Cls", Combo_tipdefcod_Cls);
         ucCombo_tipdefcod.setProperty("EmptyItem", Combo_tipdefcod_Emptyitem);
         ucCombo_tipdefcod.setProperty("DropDownOptionsData", AV67TipDefCod_Data);
         ucCombo_tipdefcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipdefcod_Internalname, "COMBO_TIPDEFCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedcodcausa_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_codcausa_Internalname, httpContext.getMessage( "Causa", ""), "", "", lblTextblockcombo_codcausa_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_codcausa.setProperty("Caption", Combo_codcausa_Caption);
         ucCombo_codcausa.setProperty("Cls", Combo_codcausa_Cls);
         ucCombo_codcausa.setProperty("EmptyItemText", Combo_codcausa_Emptyitemtext);
         ucCombo_codcausa.setProperty("DropDownOptionsData", AV68CodCausa_Data);
         ucCombo_codcausa.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_codcausa_Internalname, "COMBO_CODCAUSAContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedrps_cod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_rps_cod_Internalname, httpContext.getMessage( "Responsabilidad", ""), "", "", lblTextblockcombo_rps_cod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_rps_cod.setProperty("Caption", Combo_rps_cod_Caption);
         ucCombo_rps_cod.setProperty("Cls", Combo_rps_cod_Cls);
         ucCombo_rps_cod.setProperty("EmptyItemText", Combo_rps_cod_Emptyitemtext);
         ucCombo_rps_cod.setProperty("DropDownOptionsData", AV69Rps_Cod_Data);
         ucCombo_rps_cod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_rps_cod_Internalname, "COMBO_RPS_CODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedopecod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_opecod_Internalname, httpContext.getMessage( "Operario", ""), "", "", lblTextblockcombo_opecod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_opecod.setProperty("Caption", Combo_opecod_Caption);
         ucCombo_opecod.setProperty("Cls", Combo_opecod_Cls);
         ucCombo_opecod.setProperty("EmptyItemText", Combo_opecod_Emptyitemtext);
         ucCombo_opecod.setProperty("DropDownOptionsData", AV70Opecod_Data);
         ucCombo_opecod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_opecod_Internalname, "COMBO_OPECODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTurno_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTurno_Internalname, httpContext.getMessage( "Turno", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTurno_Internalname, GXutil.ltrim( localUtil.ntoc( AV23Turno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTurno_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV23Turno), "9") : localUtil.format( DecimalUtil.doubleToDec(AV23Turno), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,147);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTurno_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTurno_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavTipreo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavTipreo.getInternalname(), httpContext.getMessage( "Tipo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTipreo, cmbavTipreo.getInternalname(), GXutil.rtrim( AV28TipReo), 1, cmbavTipreo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavTipreo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,155);\"", "", true, (byte)(0), "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         cmbavTipreo.setValue( GXutil.rtrim( AV28TipReo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipreo.getInternalname(), "Values", cmbavTipreo.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelmasdatos.setProperty("Width", Dvpanel_panelmasdatos_Width);
         ucDvpanel_panelmasdatos.setProperty("AutoWidth", Dvpanel_panelmasdatos_Autowidth);
         ucDvpanel_panelmasdatos.setProperty("AutoHeight", Dvpanel_panelmasdatos_Autoheight);
         ucDvpanel_panelmasdatos.setProperty("Cls", Dvpanel_panelmasdatos_Cls);
         ucDvpanel_panelmasdatos.setProperty("Title", Dvpanel_panelmasdatos_Title);
         ucDvpanel_panelmasdatos.setProperty("Collapsible", Dvpanel_panelmasdatos_Collapsible);
         ucDvpanel_panelmasdatos.setProperty("Collapsed", Dvpanel_panelmasdatos_Collapsed);
         ucDvpanel_panelmasdatos.setProperty("ShowCollapseIcon", Dvpanel_panelmasdatos_Showcollapseicon);
         ucDvpanel_panelmasdatos.setProperty("IconPosition", Dvpanel_panelmasdatos_Iconposition);
         ucDvpanel_panelmasdatos.setProperty("AutoScroll", Dvpanel_panelmasdatos_Autoscroll);
         ucDvpanel_panelmasdatos.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelmasdatos_Internalname, "DVPANEL_PANELMASDATOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELMASDATOSContainer"+"Panelmasdatos"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelmasdatos_Internalname, divPanelmasdatos_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarkgm1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm1_Internalname, httpContext.getMessage( "Kilos", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm1_Internalname, GXutil.ltrim( localUtil.ntoc( AV16BarKgm1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV16BarKgm1, "ZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,168);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm1_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmtr1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmtr1_Internalname, httpContext.getMessage( "Metros", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmtr1_Internalname, GXutil.ltrim( localUtil.ntoc( AV17BarMtr1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV17BarMtr1, "ZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,172);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmtr1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmtr1_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpie1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpie1_Internalname, httpContext.getMessage( "Piezas", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpie1_Internalname, GXutil.ltrim( localUtil.ntoc( AV18BarPie1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18BarPie1), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpie1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpie1_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, GXutil.rtrim( AV22MaqCod), GXutil.rtrim( localUtil.format( AV22MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,183);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcod_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipdefcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV24TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TipDefCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipdefcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipdefcod_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCodcausa_Internalname, GXutil.ltrim( localUtil.ntoc( AV25CodCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25CodCausa), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,185);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCodcausa_Jsonclick, 0, "Attribute", "", "", "", "", edtavCodcausa_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRps_cod_Internalname, GXutil.ltrim( localUtil.ntoc( AV26Rps_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26Rps_Cod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRps_cod_Jsonclick, 0, "Attribute", "", "", "", "", edtavRps_cod_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOpecod_Internalname, GXutil.ltrim( localUtil.ntoc( AV21Opecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21Opecod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,187);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOpecod_Jsonclick, 0, "Attribute", "", "", "", "", edtavOpecod_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternosKilosMetrosPiezas.htm");
         wb_table1_188_EC2( true) ;
      }
      else
      {
         wb_table1_188_EC2( false) ;
      }
      return  ;
   }

   public void wb_table1_188_EC2e( boolean wbgen )
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

   public void startEC2( )
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
      strupEC0( ) ;
   }

   public void wsEC2( )
   {
      startEC2( ) ;
      evtEC2( ) ;
   }

   public void evtEC2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e11EC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e12EC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e13EC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSALIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSalir' */
                           e14EC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTIPDEFCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15EC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e16EC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e17EC2 ();
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

   public void weEC2( )
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

   public void paEC2( )
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
            GX_FocusControl = edtavBarpes_Internalname ;
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
      if ( cmbavTipreo.getItemCount() > 0 )
      {
         AV28TipReo = cmbavTipreo.getValidValue(AV28TipReo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28TipReo", AV28TipReo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTipreo.setValue( GXutil.rtrim( AV28TipReo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipreo.getInternalname(), "Values", cmbavTipreo.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfEC2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV109Pgmname = "WebReoperadosInternosKilosMetrosPiezas" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavBarunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarunimed_Enabled), 5, 0), true);
      edtavBarpes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpes_Enabled), 5, 0), true);
      edtavBargraaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBargraaca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBargraaca_Enabled), 5, 0), true);
      edtavBarancaca1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarancaca1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarancaca1_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      edtavKilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavKilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKilos_Enabled), 5, 0), true);
      edtavMetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetros_Enabled), 5, 0), true);
      edtavPiezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPiezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPiezas_Enabled), 5, 0), true);
      edtavKilosdisponible_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavKilosdisponible_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKilosdisponible_Enabled), 5, 0), true);
      edtavMetrosdisponible_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMetrosdisponible_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetrosdisponible_Enabled), 5, 0), true);
      edtavPiezasdisponible_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPiezasdisponible_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPiezasdisponible_Enabled), 5, 0), true);
   }

   public void rfEC2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e16EC2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e17EC2 ();
         wbEC0( ) ;
      }
   }

   public void send_integrity_lvl_hashesEC2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNHDRDESTINO", GXutil.rtrim( AV20BarNHdrdestino));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDRDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20BarNHdrdestino, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV109Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV39Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Station, ""))));
   }

   public void before_start_formulas( )
   {
      AV109Pgmname = "WebReoperadosInternosKilosMetrosPiezas" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavBarunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarunimed_Enabled), 5, 0), true);
      edtavBarpes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpes_Enabled), 5, 0), true);
      edtavBargraaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBargraaca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBargraaca_Enabled), 5, 0), true);
      edtavBarancaca1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarancaca1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarancaca1_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
      edtavKilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavKilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKilos_Enabled), 5, 0), true);
      edtavMetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetros_Enabled), 5, 0), true);
      edtavPiezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPiezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPiezas_Enabled), 5, 0), true);
      edtavKilosdisponible_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavKilosdisponible_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKilosdisponible_Enabled), 5, 0), true);
      edtavMetrosdisponible_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMetrosdisponible_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetrosdisponible_Enabled), 5, 0), true);
      edtavPiezasdisponible_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPiezasdisponible_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPiezasdisponible_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupEC0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12EC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD_DATA"), AV65MaqCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPDEFCOD_DATA"), AV67TipDefCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCODCAUSA_DATA"), AV68CodCausa_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vRPS_COD_DATA"), AV69Rps_Cod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vOPECOD_DATA"), AV70Opecod_Data);
         /* Read saved values. */
         AV83Ancho = localUtil.ctond( httpContext.cgiGet( "vANCHO")) ;
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
         Combo_maqcod_Cls = httpContext.cgiGet( "COMBO_MAQCOD_Cls") ;
         Combo_maqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_set") ;
         Combo_maqcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Emptyitem")) ;
         Combo_tipdefcod_Cls = httpContext.cgiGet( "COMBO_TIPDEFCOD_Cls") ;
         Combo_tipdefcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPDEFCOD_Selectedvalue_set") ;
         Combo_tipdefcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Emptyitem")) ;
         Combo_codcausa_Cls = httpContext.cgiGet( "COMBO_CODCAUSA_Cls") ;
         Combo_codcausa_Selectedvalue_set = httpContext.cgiGet( "COMBO_CODCAUSA_Selectedvalue_set") ;
         Combo_codcausa_Emptyitemtext = httpContext.cgiGet( "COMBO_CODCAUSA_Emptyitemtext") ;
         Combo_rps_cod_Cls = httpContext.cgiGet( "COMBO_RPS_COD_Cls") ;
         Combo_rps_cod_Selectedvalue_set = httpContext.cgiGet( "COMBO_RPS_COD_Selectedvalue_set") ;
         Combo_rps_cod_Emptyitemtext = httpContext.cgiGet( "COMBO_RPS_COD_Emptyitemtext") ;
         Combo_opecod_Cls = httpContext.cgiGet( "COMBO_OPECOD_Cls") ;
         Combo_opecod_Selectedvalue_set = httpContext.cgiGet( "COMBO_OPECOD_Selectedvalue_set") ;
         Combo_opecod_Emptyitemtext = httpContext.cgiGet( "COMBO_OPECOD_Emptyitemtext") ;
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
         Dvpanel_panelmasdatos_Width = httpContext.cgiGet( "DVPANEL_PANELMASDATOS_Width") ;
         Dvpanel_panelmasdatos_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELMASDATOS_Autowidth")) ;
         Dvpanel_panelmasdatos_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELMASDATOS_Autoheight")) ;
         Dvpanel_panelmasdatos_Cls = httpContext.cgiGet( "DVPANEL_PANELMASDATOS_Cls") ;
         Dvpanel_panelmasdatos_Title = httpContext.cgiGet( "DVPANEL_PANELMASDATOS_Title") ;
         Dvpanel_panelmasdatos_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELMASDATOS_Collapsible")) ;
         Dvpanel_panelmasdatos_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELMASDATOS_Collapsed")) ;
         Dvpanel_panelmasdatos_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELMASDATOS_Showcollapseicon")) ;
         Dvpanel_panelmasdatos_Iconposition = httpContext.cgiGet( "DVPANEL_PANELMASDATOS_Iconposition") ;
         Dvpanel_panelmasdatos_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELMASDATOS_Autoscroll")) ;
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
         Dvelop_confirmpanel_btnconfirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPES");
            GX_FocusControl = edtavBarpes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV80BarPes = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80BarPes), 4, 0));
         }
         else
         {
            AV80BarPes = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarpes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80BarPes), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBargraaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBargraaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARGRAACA");
            GX_FocusControl = edtavBargraaca_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV81BarGraAca = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81BarGraAca), 4, 0));
         }
         else
         {
            AV81BarGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtavBargraaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81BarGraAca), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarancaca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarancaca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARANCACA1");
            GX_FocusControl = edtavBarancaca1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV82BarAncAca1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82BarAncAca1), 3, 0));
         }
         else
         {
            AV82BarAncAca1 = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarancaca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82BarAncAca1), 3, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKILOS");
            GX_FocusControl = edtavKilos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV71kilos = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71kilos", GXutil.ltrimstr( AV71kilos, 9, 2));
         }
         else
         {
            AV71kilos = localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71kilos", GXutil.ltrimstr( AV71kilos, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETROS");
            GX_FocusControl = edtavMetros_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV72metros = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72metros", GXutil.ltrimstr( AV72metros, 9, 2));
         }
         else
         {
            AV72metros = localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72metros", GXutil.ltrimstr( AV72metros, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPIEZAS");
            GX_FocusControl = edtavPiezas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV73piezas = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73piezas), 6, 0));
         }
         else
         {
            AV73piezas = (int)(localUtil.ctol( httpContext.cgiGet( edtavPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73piezas), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKilosdisponible_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKilosdisponible_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKILOSDISPONIBLE");
            GX_FocusControl = edtavKilosdisponible_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV75kilosdisponible = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75kilosdisponible", GXutil.ltrimstr( AV75kilosdisponible, 9, 2));
         }
         else
         {
            AV75kilosdisponible = localUtil.ctond( httpContext.cgiGet( edtavKilosdisponible_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75kilosdisponible", GXutil.ltrimstr( AV75kilosdisponible, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetrosdisponible_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetrosdisponible_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETROSDISPONIBLE");
            GX_FocusControl = edtavMetrosdisponible_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV76metrosdisponible = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76metrosdisponible", GXutil.ltrimstr( AV76metrosdisponible, 9, 2));
         }
         else
         {
            AV76metrosdisponible = localUtil.ctond( httpContext.cgiGet( edtavMetrosdisponible_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76metrosdisponible", GXutil.ltrimstr( AV76metrosdisponible, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPiezasdisponible_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPiezasdisponible_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPIEZASDISPONIBLE");
            GX_FocusControl = edtavPiezasdisponible_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV74piezasdisponible = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74piezasdisponible", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74piezasdisponible), 6, 0));
         }
         else
         {
            AV74piezasdisponible = (int)(localUtil.ctol( httpContext.cgiGet( edtavPiezasdisponible_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74piezasdisponible", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74piezasdisponible), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTURNO");
            GX_FocusControl = edtavTurno_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23Turno = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Turno", GXutil.str( AV23Turno, 1, 0));
         }
         else
         {
            AV23Turno = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Turno", GXutil.str( AV23Turno, 1, 0));
         }
         cmbavTipreo.setValue( httpContext.cgiGet( cmbavTipreo.getInternalname()) );
         AV28TipReo = httpContext.cgiGet( cmbavTipreo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28TipReo", AV28TipReo);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarkgm1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarkgm1_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARKGM1");
            GX_FocusControl = edtavBarkgm1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16BarKgm1 = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16BarKgm1", GXutil.ltrimstr( AV16BarKgm1, 9, 2));
         }
         else
         {
            AV16BarKgm1 = localUtil.ctond( httpContext.cgiGet( edtavBarkgm1_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16BarKgm1", GXutil.ltrimstr( AV16BarKgm1, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarmtr1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarmtr1_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARMTR1");
            GX_FocusControl = edtavBarmtr1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17BarMtr1 = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17BarMtr1", GXutil.ltrimstr( AV17BarMtr1, 9, 2));
         }
         else
         {
            AV17BarMtr1 = localUtil.ctond( httpContext.cgiGet( edtavBarmtr1_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17BarMtr1", GXutil.ltrimstr( AV17BarMtr1, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpie1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpie1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIE1");
            GX_FocusControl = edtavBarpie1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18BarPie1 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarPie1), 6, 0));
         }
         else
         {
            AV18BarPie1 = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarpie1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarPie1), 6, 0));
         }
         AV22MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22MaqCod", AV22MaqCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipdefcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipdefcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPDEFCOD");
            GX_FocusControl = edtavTipdefcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24TipDefCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TipDefCod), 4, 0));
         }
         else
         {
            AV24TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipdefcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TipDefCod), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCodcausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCodcausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCODCAUSA");
            GX_FocusControl = edtavCodcausa_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV25CodCausa = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25CodCausa), 4, 0));
         }
         else
         {
            AV25CodCausa = (short)(localUtil.ctol( httpContext.cgiGet( edtavCodcausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25CodCausa), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRps_cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRps_cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRPS_COD");
            GX_FocusControl = edtavRps_cod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV26Rps_Cod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Rps_Cod), 4, 0));
         }
         else
         {
            AV26Rps_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtavRps_cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Rps_Cod), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOPECOD");
            GX_FocusControl = edtavOpecod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21Opecod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Opecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Opecod), 6, 0));
         }
         else
         {
            AV21Opecod = (int)(localUtil.ctol( httpContext.cgiGet( edtavOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Opecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Opecod), 6, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"WebReoperadosInternosKilosMetrosPiezas");
         AV80BarPes = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarpes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80BarPes), 4, 0));
         forbiddenHiddens.add("BarPes", localUtil.format( DecimalUtil.doubleToDec(AV80BarPes), "ZZZ9"));
         AV81BarGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtavBargraaca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81BarGraAca), 4, 0));
         forbiddenHiddens.add("BarGraAca", localUtil.format( DecimalUtil.doubleToDec(AV81BarGraAca), "ZZZ9"));
         AV82BarAncAca1 = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarancaca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82BarAncAca1), 3, 0));
         forbiddenHiddens.add("BarAncAca1", localUtil.format( DecimalUtil.doubleToDec(AV82BarAncAca1), "ZZ9"));
         AV71kilos = localUtil.ctond( httpContext.cgiGet( edtavKilos_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71kilos", GXutil.ltrimstr( AV71kilos, 9, 2));
         forbiddenHiddens.add("kilos", localUtil.format( AV71kilos, "ZZZZZ9.99"));
         AV72metros = localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72metros", GXutil.ltrimstr( AV72metros, 9, 2));
         forbiddenHiddens.add("metros", localUtil.format( AV72metros, "ZZZZZ9.99"));
         AV73piezas = (int)(localUtil.ctol( httpContext.cgiGet( edtavPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73piezas), 6, 0));
         forbiddenHiddens.add("piezas", localUtil.format( DecimalUtil.doubleToDec(AV73piezas), "ZZZZZ9"));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("webreoperadosinternoskilosmetrospiezas:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e12EC2 ();
      if (returnInSub) return;
   }

   public void e12EC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      /* Using cursor H00EC3 */
      pr_default.execute(0, new Object[] {AV7Emprcod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV5Barcodreo), AV6Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = H00EC3_A130BarCodPar[0] ;
         A132BarCodReo = H00EC3_A132BarCodReo[0] ;
         A129BarCod = H00EC3_A129BarCod[0] ;
         A396EmprCod = H00EC3_A396EmprCod[0] ;
         A213BarSit = H00EC3_A213BarSit[0] ;
         A2009DisTipDis = H00EC3_A2009DisTipDis[0] ;
         n2009DisTipDis = H00EC3_n2009DisTipDis[0] ;
         A361DisCod = H00EC3_A361DisCod[0] ;
         A864BarPes = H00EC3_A864BarPes[0] ;
         A1909BarGraAca = H00EC3_A1909BarGraAca[0] ;
         A125BarAncAca1 = H00EC3_A125BarAncAca1[0] ;
         A166BarKgm = H00EC3_A166BarKgm[0] ;
         A184BarMtr = H00EC3_A184BarMtr[0] ;
         A168BarKgmLan = H00EC3_A168BarKgmLan[0] ;
         A186BarMtrLan = H00EC3_A186BarMtrLan[0] ;
         A199BarPie1 = H00EC3_A199BarPie1[0] ;
         A365DisDes = H00EC3_A365DisDes[0] ;
         A898BarPieNDes = H00EC3_A898BarPieNDes[0] ;
         A166BarKgm = H00EC3_A166BarKgm[0] ;
         A184BarMtr = H00EC3_A184BarMtr[0] ;
         A168BarKgmLan = H00EC3_A168BarKgmLan[0] ;
         A186BarMtrLan = H00EC3_A186BarMtrLan[0] ;
         A199BarPie1 = H00EC3_A199BarPie1[0] ;
         A898BarPieNDes = H00EC3_A898BarPieNDes[0] ;
         A2009DisTipDis = H00EC3_A2009DisTipDis[0] ;
         n2009DisTipDis = H00EC3_n2009DisTipDis[0] ;
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
         AV54DisTipDis = A2009DisTipDis ;
         AV55DisOriCod = A361DisCod ;
         AV56KgmOri = ((AV58Artextil==0) ? (A166BarKgm.subtract(A168BarKgmLan)) : A166BarKgm) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56KgmOri", GXutil.ltrimstr( AV56KgmOri, 9, 2));
         AV57MetOri = ((AV58Artextil==0) ? (A184BarMtr.subtract(A186BarMtrLan)) : A184BarMtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57MetOri", GXutil.ltrimstr( AV57MetOri, 9, 2));
         AV80BarPes = A864BarPes ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80BarPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80BarPes), 4, 0));
         AV81BarGraAca = A1909BarGraAca ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81BarGraAca), 4, 0));
         AV82BarAncAca1 = A125BarAncAca1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82BarAncAca1), 3, 0));
         AV71kilos = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71kilos", GXutil.ltrimstr( AV71kilos, 9, 2));
         AV72metros = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72metros", GXutil.ltrimstr( AV72metros, 9, 2));
         AV73piezas = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73piezas), 6, 0));
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(H00EC3_A396EmprCod[0], A396EmprCod) == 0 ) && ( H00EC3_A129BarCod[0] == A129BarCod ) && ( H00EC3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(H00EC3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            A213BarSit = H00EC3_A213BarSit[0] ;
            A361DisCod = H00EC3_A361DisCod[0] ;
            A864BarPes = H00EC3_A864BarPes[0] ;
            A1909BarGraAca = H00EC3_A1909BarGraAca[0] ;
            A125BarAncAca1 = H00EC3_A125BarAncAca1[0] ;
            A365DisDes = H00EC3_A365DisDes[0] ;
            /* Using cursor H00EC5 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            if ( (pr_default.getStatus(1) != 101) )
            {
               A166BarKgm = H00EC5_A166BarKgm[0] ;
               A184BarMtr = H00EC5_A184BarMtr[0] ;
               A199BarPie1 = H00EC5_A199BarPie1[0] ;
               A898BarPieNDes = H00EC5_A898BarPieNDes[0] ;
            }
            else
            {
               A898BarPieNDes = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
               A199BarPie1 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
               A166BarKgm = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
               A184BarMtr = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A184BarMtr", GXutil.ltrimstr( A184BarMtr, 9, 2));
            }
            pr_default.close(1);
            if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
            {
               edtavBarkgm1_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm1_Enabled), 5, 0), true);
            }
            else
            {
               edtavBarkgm1_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm1_Enabled), 5, 0), true);
            }
            if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
            {
               edtavBarmtr1_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr1_Enabled), 5, 0), true);
            }
            else
            {
               edtavBarmtr1_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr1_Enabled), 5, 0), true);
            }
            if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
            {
               edtavBarpie1_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavBarpie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie1_Enabled), 5, 0), true);
            }
            else
            {
               edtavBarpie1_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavBarpie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie1_Enabled), 5, 0), true);
            }
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
            /* Optimized group. */
            /* Using cursor H00EC6 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            c1261BarAlbKgmE = H00EC6_A1261BarAlbKgmE[0] ;
            c1263BarAlbMtrE = H00EC6_A1263BarAlbMtrE[0] ;
            c1265BarAlbPie = H00EC6_A1265BarAlbPie[0] ;
            pr_default.close(2);
            AV71kilos = AV71kilos.add(c1261BarAlbKgmE) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71kilos", GXutil.ltrimstr( AV71kilos, 9, 2));
            AV72metros = AV72metros.add(c1263BarAlbMtrE) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72metros", GXutil.ltrimstr( AV72metros, 9, 2));
            AV73piezas = (int)(AV73piezas+c1265BarAlbPie) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73piezas), 6, 0));
            /* End optimized group. */
            AV74piezasdisponible = (int)((A198BarPie-AV73piezas)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74piezasdisponible", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74piezasdisponible), 6, 0));
            AV75kilosdisponible = (A166BarKgm.subtract(AV71kilos)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75kilosdisponible", GXutil.ltrimstr( AV75kilosdisponible, 9, 2));
            AV76metrosdisponible = (A184BarMtr.subtract(AV72metros)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76metrosdisponible", GXutil.ltrimstr( AV76metrosdisponible, 9, 2));
            /* Exiting from a For First loop. */
            if (true) break;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor H00EC7 */
      pr_default.execute(3, new Object[] {AV7Emprcod, Integer.valueOf(AV8Barcod), AV6Barcodpar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = H00EC7_A130BarCodPar[0] ;
         A132BarCodReo = H00EC7_A132BarCodReo[0] ;
         A129BarCod = H00EC7_A129BarCod[0] ;
         A396EmprCod = H00EC7_A396EmprCod[0] ;
         A138BarConReo = H00EC7_A138BarConReo[0] ;
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarkgm1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarkgm1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm1_Enabled), 5, 0), true);
         }
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarmtr1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarmtr1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr1_Enabled), 5, 0), true);
         }
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarpie1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarpie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarpie1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarpie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie1_Enabled), 5, 0), true);
         }
         AV34Barconreo = (byte)(A138BarConReo+1) ;
         AV20BarNHdrdestino = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( AV34Barconreo, 1, 0)) + A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20BarNHdrdestino", AV20BarNHdrdestino);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDRDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20BarNHdrdestino, ""))));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      divPanelmasdatos_Visible = (((GXutil.strcmp(AV28TipReo, httpContext.getMessage( "T", ""))==0) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divPanelmasdatos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divPanelmasdatos_Visible), 5, 0), true);
      GXt_char1 = AV39Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webreoperadosinternoskilosmetrospiezas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV39Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Station", AV39Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Station, ""))));
      GXv_char2[0] = AV7Emprcod ;
      GXv_char3[0] = AV40EmprNom ;
      GXv_char4[0] = AV36UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV39Station, GXv_char2, GXv_char3, GXv_char4) ;
      webreoperadosinternoskilosmetrospiezas_impl.this.AV7Emprcod = GXv_char2[0] ;
      webreoperadosinternoskilosmetrospiezas_impl.this.AV40EmprNom = GXv_char3[0] ;
      webreoperadosinternoskilosmetrospiezas_impl.this.AV36UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV36UsurCod", AV36UsurCod);
      edtavOpecod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOpecod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpecod_Visible), 5, 0), true);
      edtavRps_cod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRps_cod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRps_cod_Visible), 5, 0), true);
      edtavCodcausa_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCodcausa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCodcausa_Visible), 5, 0), true);
      edtavTipdefcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipdefcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipdefcod_Visible), 5, 0), true);
      edtavMaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOTIPDEFCOD' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOCODCAUSA' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBORPS_COD' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOOPECOD' */
      S152 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e13EC2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( "T", "")) != 0 ) && ( AV18BarPie1 > ( AV14BarPie - AV73piezas ) ) )
      {
         AV77piezasdisponible2 = (int)((AV14BarPie-AV73piezas)) ;
         Gx_msg = httpContext.getMessage( "Pzs Hdr ", "") + GXutil.str( AV14BarPie, 6, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Pzs Entregadas ", "") + GXutil.str( AV73piezas, 6, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Pzs ", "") + GXutil.trim( GXutil.str( AV18BarPie1, 6, 0)) + httpContext.getMessage( " superior al disponible ", "") + GXutil.trim( GXutil.str( AV77piezasdisponible2, 6, 0)) ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( "T", "")) != 0 ) && ( DecimalUtil.compareTo(AV16BarKgm1, (AV12BarKgm.subtract(AV71kilos))) > 0 ) && ( GXutil.strcmp(AV15BarUnimed, httpContext.getMessage( "K", "")) == 0 ) )
         {
            AV78kilosdisponible2 = (AV12BarKgm.subtract(AV71kilos)) ;
            Gx_msg = httpContext.getMessage( "Kgs Hdr ", "") + GXutil.str( AV12BarKgm, 9, 2) + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "Kgs Entregados ", "") + GXutil.str( AV71kilos, 9, 2) + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "Kgs ", "") + GXutil.trim( GXutil.str( AV16BarKgm1, 9, 2)) + httpContext.getMessage( " superior al disponible ", "") + GXutil.trim( GXutil.str( AV78kilosdisponible2, 9, 2)) ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            if ( ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( "T", "")) != 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV16BarKgm1)==0) && ( GXutil.strcmp(AV15BarUnimed, httpContext.getMessage( "K", "")) == 0 ) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "NO ha introducido Kilos", ""));
            }
            else
            {
               if ( ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( "T", "")) != 0 ) && ( DecimalUtil.compareTo(AV17BarMtr1, (AV13BarMtr.subtract(AV72metros))) > 0 ) && ( GXutil.strcmp(AV15BarUnimed, httpContext.getMessage( "M", "")) == 0 ) )
               {
                  AV79metrosdisponible2 = (AV13BarMtr.subtract(AV72metros)) ;
                  Gx_msg = httpContext.getMessage( "Mts Hdr ", "") + GXutil.str( AV13BarMtr, 9, 2) + GXutil.newLine( ) ;
                  Gx_msg += httpContext.getMessage( "Mts Entregados ", "") + GXutil.str( AV72metros, 9, 2) + GXutil.newLine( ) ;
                  Gx_msg += httpContext.getMessage( "Mts ", "") + GXutil.trim( GXutil.str( AV17BarMtr1, 9, 2)) + httpContext.getMessage( " superior al disponible ", "") + GXutil.trim( GXutil.str( AV79metrosdisponible2, 9, 2)) ;
                  httpContext.GX_msglist.addItem(Gx_msg);
               }
               else
               {
                  if ( ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( "T", "")) != 0 ) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV17BarMtr1)==0) && ( GXutil.strcmp(AV15BarUnimed, httpContext.getMessage( "M", "")) == 0 ) )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "NO ha introducido Metros", ""));
                  }
                  else
                  {
                     GXv_char4[0] = "" ;
                     GXv_char3[0] = AV35Ok ;
                     new app.existedefectotipdef(remoteHandle, context).execute( AV7Emprcod, AV24TipDefCod, GXv_char4, GXv_char3) ;
                     webreoperadosinternoskilosmetrospiezas_impl.this.AV35Ok = GXv_char3[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV35Ok", AV35Ok);
                     if ( (0==AV24TipDefCod) || ( GXutil.strcmp(AV35Ok, httpContext.getMessage( "N", "")) == 0 ) )
                     {
                        httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Tipo Defecto Inexistente ¡¡¡", ""));
                        GX_FocusControl = edtavTipdefcod_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        GXv_char4[0] = AV60Maqdsc ;
                        GXv_char3[0] = AV35Ok ;
                        new app.existemaquinamaquin(remoteHandle, context).execute( AV7Emprcod, AV22MaqCod, GXv_char4, GXv_char3) ;
                        webreoperadosinternoskilosmetrospiezas_impl.this.AV60Maqdsc = GXv_char4[0] ;
                        webreoperadosinternoskilosmetrospiezas_impl.this.AV35Ok = GXv_char3[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV35Ok", AV35Ok);
                        if ( (GXutil.strcmp("", AV22MaqCod)==0) || ( GXutil.strcmp(AV35Ok, httpContext.getMessage( "N", "")) == 0 ) )
                        {
                           httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Maquina Inexistente ¡¡¡", ""));
                           GX_FocusControl = edtavMaqcod_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                        }
                        else
                        {
                           Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.getMessage( "Desea crear el Reoperado", "")+((GXutil.strcmp(AV28TipReo, "T")==0) ? httpContext.getMessage( "TOTAL", "") : httpContext.getMessage( "PARCIAL", ""))+httpContext.getMessage( " de la N Hdr ", "")+GXutil.trim( AV20BarNHdrdestino)+"?" ;
                           ucDvelop_confirmpanel_btnconfirmar.sendProperty(context, "", false, Dvelop_confirmpanel_btnconfirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
                           this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer", "Confirm", "", new Object[] {});
                        }
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e11EC2( )
   {
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, "Yes") == 0 )
      {
         AV31Codigo = ((GXutil.strcmp(AV53prior, "0")==0) ? "020200" : "021200") ;
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( "T", "")) == 0 )
         {
            GXv_int5[0] = AV30ConReo ;
            GXv_int6[0] = AV32DisCod ;
            new app.prpi000(remoteHandle, context).execute( AV7Emprcod, AV8Barcod, AV5Barcodreo, AV6Barcodpar, AV8Barcod, AV6Barcodpar, AV27BarSit, AV28TipReo, AV24TipDefCod, (short)(DecimalUtil.decToDouble(AV29Porcen)), AV22MaqCod, GXv_int5, AV31Codigo, GXv_int6) ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV30ConReo = GXv_int5[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV32DisCod = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30ConReo", GXutil.str( AV30ConReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV32DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32DisCod), 8, 0));
            AV52Inc_obs = httpContext.getMessage( "Generacion Reoperado Interno, Maquina=", "") + AV22MaqCod ;
            new app.pctrinc(remoteHandle, context).execute( AV7Emprcod, GXutil.substring( AV109Pgmname, 1, 10), AV36UsurCod, AV39Station, AV52Inc_obs, AV8Barcod, AV30ConReo, AV6Barcodpar) ;
            GXv_char4[0] = AV7Emprcod ;
            GXv_int6[0] = AV8Barcod ;
            GXv_int5[0] = AV30ConReo ;
            GXv_char3[0] = AV6Barcodpar ;
            GXv_decimal7[0] = AV56KgmOri ;
            GXv_decimal8[0] = AV57MetOri ;
            GXv_int9[0] = AV25CodCausa ;
            GXv_char2[0] = AV22MaqCod ;
            new app.phisreo(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_char3, GXv_decimal7, GXv_decimal8, GXv_int9, GXv_char2) ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV7Emprcod = GXv_char4[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV8Barcod = GXv_int6[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV30ConReo = GXv_int5[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV6Barcodpar = GXv_char3[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV56KgmOri = GXv_decimal7[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV57MetOri = GXv_decimal8[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV25CodCausa = GXv_int9[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV22MaqCod = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV8Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV30ConReo", GXutil.str( AV30ConReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV56KgmOri", GXutil.ltrimstr( AV56KgmOri, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV57MetOri", GXutil.ltrimstr( AV57MetOri, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV25CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25CodCausa), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV22MaqCod", AV22MaqCod);
            GXv_char4[0] = AV7Emprcod ;
            GXv_int6[0] = AV8Barcod ;
            GXv_int5[0] = AV30ConReo ;
            GXv_char3[0] = AV6Barcodpar ;
            GXv_int9[0] = AV26Rps_Cod ;
            new app.preorps(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_char3, GXv_int9) ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV7Emprcod = GXv_char4[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV8Barcod = GXv_int6[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV30ConReo = GXv_int5[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV6Barcodpar = GXv_char3[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV26Rps_Cod = GXv_int9[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV8Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV30ConReo", GXutil.str( AV30ConReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV26Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Rps_Cod), 4, 0));
            GXv_char4[0] = AV7Emprcod ;
            GXv_int6[0] = AV8Barcod ;
            GXv_int5[0] = AV30ConReo ;
            GXv_char3[0] = AV6Barcodpar ;
            GXv_int10[0] = AV21Opecod ;
            GXv_int11[0] = AV23Turno ;
            new app.pturope(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_char3, GXv_int10, GXv_int11) ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV7Emprcod = GXv_char4[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV8Barcod = GXv_int6[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV30ConReo = GXv_int5[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV6Barcodpar = GXv_char3[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV21Opecod = GXv_int10[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV23Turno = GXv_int11[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV8Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV30ConReo", GXutil.str( AV30ConReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV21Opecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Opecod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV23Turno", GXutil.str( AV23Turno, 1, 0));
            GXv_char4[0] = AV7Emprcod ;
            GXv_int10[0] = AV8Barcod ;
            GXv_int11[0] = AV30ConReo ;
            GXv_char3[0] = AV6Barcodpar ;
            GXv_char2[0] = AV36UsurCod ;
            new app.pusureo(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int11, GXv_char3, GXv_char2) ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV7Emprcod = GXv_char4[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV8Barcod = GXv_int10[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV30ConReo = GXv_int11[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV6Barcodpar = GXv_char3[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV36UsurCod = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV8Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV30ConReo", GXutil.str( AV30ConReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV36UsurCod", AV36UsurCod);
            AV52Inc_obs = httpContext.getMessage( "Generacion Reoperado Interno TOTAL,Fin.", "") ;
            new app.pctrinc(remoteHandle, context).execute( AV7Emprcod, GXutil.substring( AV109Pgmname, 1, 10), AV36UsurCod, AV39Station, AV52Inc_obs, AV8Barcod, AV30ConReo, AV6Barcodpar) ;
            httpContext.popup(formatLink("app.pedidosclientesindetalle.hojaderuta_procesos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV8Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV30ConReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV32DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV64Barsitri,2,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Discod","BarSit","Barext"}) , new Object[] {"AV7Emprcod","AV8Barcod","AV30ConReo","AV6Barcodpar","AV32DisCod","AV64Barsitri",""});
            GXv_char4[0] = AV84PriCod ;
            GXv_int10[0] = AV85CliCod ;
            GXv_char3[0] = AV86CliNom ;
            GXv_char2[0] = AV87DisArtCod ;
            GXv_char12[0] = AV88DisArtDsc ;
            GXv_date13[0] = AV89DisFec ;
            new app.datoshdrnc(remoteHandle, context).execute( AV7Emprcod, AV8Barcod, AV30ConReo, AV6Barcodpar, GXv_char4, GXv_int10, GXv_char3, GXv_char2, GXv_char12, GXv_date13) ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV84PriCod = GXv_char4[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV85CliCod = GXv_int10[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV86CliNom = GXv_char3[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV87DisArtCod = GXv_char2[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV88DisArtDsc = GXv_char12[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV89DisFec = GXv_date13[0] ;
            httpContext.popup(formatLink("app.pedidos.disobs__", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV32DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV84PriCod)),GXutil.URLEncode(GXutil.ltrimstr(AV85CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV86CliNom)),GXutil.URLEncode(GXutil.rtrim(AV87DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV88DisArtDsc)),GXutil.URLEncode(GXutil.formatDateParm(AV89DisFec))}, new String[] {"Mode","EmprCod","DisCod","PriCod","CliCod","CliNom","Barser","Barserdsc","Barfecgen"}) , new Object[] {});
            AV95OUTConReo = AV30ConReo ;
            AV100ObjetoRefrescar.clear();
            AV100ObjetoRefrescar.add(httpContext.getMessage( "Reoperado", ""), 0);
            AV100ObjetoRefrescar.add(GXutil.str( AV95OUTConReo, 1, 0), 0);
            this.executeExternalObjectMethod("", false, "GlobalEvents", "RefrescarObjeto", new Object[] {AV100ObjetoRefrescar,Boolean.valueOf(true)}, true);
            httpContext.setWebReturnParms(new Object[] {AV7Emprcod,AV19BarNHdr,Integer.valueOf(AV8Barcod),Byte.valueOf(AV5Barcodreo),AV6Barcodpar,AV12BarKgm,AV13BarMtr,Integer.valueOf(AV14BarPie),AV15BarUnimed,Byte.valueOf(AV27BarSit),AV37KilAct,AV38MtrAct,AV47BarCosAny,AV46BarCosPro,AV53prior,AV36UsurCod});
            httpContext.setWebReturnParmsMetadata(new Object[] {"AV7Emprcod","AV19BarNHdr","AV8Barcod","AV5Barcodreo","AV6Barcodpar","AV12BarKgm","AV13BarMtr","AV14BarPie","AV15BarUnimed","AV27BarSit","AV37KilAct","AV38MtrAct","AV47BarCosAny","AV46BarCosPro","AV53prior","AV36UsurCod"});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         else
         {
            AV37KilAct = AV12BarKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37KilAct", GXutil.ltrimstr( AV37KilAct, 9, 2));
            AV38MtrAct = AV13BarMtr ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38MtrAct", GXutil.ltrimstr( AV38MtrAct, 9, 2));
            AV44CosProi = AV46BarCosPro ;
            AV45CosAnyi = AV47BarCosAny ;
            GXv_char12[0] = AV7Emprcod ;
            GXv_int10[0] = AV8Barcod ;
            GXv_int11[0] = AV5Barcodreo ;
            GXv_char4[0] = AV6Barcodpar ;
            GXv_int6[0] = AV8Barcod ;
            GXv_char3[0] = AV6Barcodpar ;
            GXv_int5[0] = AV27BarSit ;
            GXv_char2[0] = AV28TipReo ;
            GXv_int9[0] = AV24TipDefCod ;
            GXv_int14[0] = (short)(DecimalUtil.decToDouble(AV29Porcen)) ;
            GXv_char15[0] = AV22MaqCod ;
            GXv_int16[0] = AV30ConReo ;
            GXv_char17[0] = AV31Codigo ;
            GXv_int18[0] = AV32DisCod ;
            new app.pbarreo(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int11, GXv_char4, GXv_int6, GXv_char3, GXv_int5, GXv_char2, GXv_int9, GXv_int14, GXv_char15, GXv_int16, GXv_char17, GXv_int18) ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV7Emprcod = GXv_char12[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV8Barcod = GXv_int10[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV5Barcodreo = GXv_int11[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV6Barcodpar = GXv_char4[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV8Barcod = GXv_int6[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV6Barcodpar = GXv_char3[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV27BarSit = GXv_int5[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV28TipReo = GXv_char2[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV24TipDefCod = GXv_int9[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV29Porcen = DecimalUtil.doubleToDec(GXv_int14[0]) ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV22MaqCod = GXv_char15[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV30ConReo = GXv_int16[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV31Codigo = GXv_char17[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV32DisCod = GXv_int18[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV8Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV5Barcodreo", GXutil.str( AV5Barcodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV8Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV27BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27BarSit), 2, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV28TipReo", AV28TipReo);
            httpContext.ajax_rsp_assign_attri("", false, "AV24TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TipDefCod), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV29Porcen", GXutil.ltrimstr( AV29Porcen, 6, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV22MaqCod", AV22MaqCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV30ConReo", GXutil.str( AV30ConReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV32DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32DisCod), 8, 0));
            GXv_char17[0] = AV7Emprcod ;
            GXv_int18[0] = AV8Barcod ;
            GXv_int16[0] = AV5Barcodreo ;
            GXv_char15[0] = AV6Barcodpar ;
            GXv_int10[0] = AV8Barcod ;
            GXv_int11[0] = AV30ConReo ;
            GXv_char12[0] = AV6Barcodpar ;
            GXv_int6[0] = AV18BarPie1 ;
            GXv_decimal8[0] = AV16BarKgm1 ;
            GXv_decimal7[0] = AV17BarMtr1 ;
            GXv_char4[0] = AV28TipReo ;
            GXv_int19[0] = AV32DisCod ;
            new app.pdespie(remoteHandle, context).execute( GXv_char17, GXv_int18, GXv_int16, GXv_char15, GXv_int10, GXv_int11, GXv_char12, GXv_int6, GXv_decimal8, GXv_decimal7, GXv_char4, GXv_int19) ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV7Emprcod = GXv_char17[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV8Barcod = GXv_int18[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV5Barcodreo = GXv_int16[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV6Barcodpar = GXv_char15[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV8Barcod = GXv_int10[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV30ConReo = GXv_int11[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV6Barcodpar = GXv_char12[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV18BarPie1 = GXv_int6[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV16BarKgm1 = GXv_decimal8[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV17BarMtr1 = GXv_decimal7[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV28TipReo = GXv_char4[0] ;
            webreoperadosinternoskilosmetrospiezas_impl.this.AV32DisCod = GXv_int19[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV8Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV5Barcodreo", GXutil.str( AV5Barcodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV8Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV30ConReo", GXutil.str( AV30ConReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarPie1), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV16BarKgm1", GXutil.ltrimstr( AV16BarKgm1, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV17BarMtr1", GXutil.ltrimstr( AV17BarMtr1, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV28TipReo", AV28TipReo);
            httpContext.ajax_rsp_assign_attri("", false, "AV32DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32DisCod), 8, 0));
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37KilAct)==0) )
            {
               AV50CosPro2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( (AV44CosProi.divide(AV37KilAct, 18, java.math.RoundingMode.DOWN)).multiply((AV12BarKgm)), 2))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV50CosPro2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50CosPro2), 4, 0));
               AV51CosAny2 = GXutil.roundDecimal( (AV45CosAnyi.divide(AV37KilAct, 18, java.math.RoundingMode.DOWN)).multiply((AV12BarKgm)), 2) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV51CosAny2", GXutil.ltrimstr( AV51CosAny2, 10, 2));
               AV48CosPro = ((DecimalUtil.compareTo(AV37KilAct, AV12BarKgm)!=0) ? GXutil.roundDecimal( (AV44CosProi.divide(AV37KilAct, 18, java.math.RoundingMode.DOWN)).multiply((AV37KilAct.subtract(AV12BarKgm))), 2) : DecimalUtil.doubleToDec(0)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV48CosPro", GXutil.ltrimstr( AV48CosPro, 10, 2));
               AV49CosAny = ((DecimalUtil.compareTo(AV37KilAct, AV12BarKgm)!=0) ? GXutil.roundDecimal( (AV45CosAnyi.divide(AV37KilAct, 18, java.math.RoundingMode.DOWN)).multiply((AV37KilAct.subtract(AV12BarKgm))), 2) : DecimalUtil.doubleToDec(0)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV49CosAny", GXutil.ltrimstr( AV49CosAny, 10, 2));
            }
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37KilAct)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38MtrAct)==0) )
            {
               GXv_char17[0] = AV7Emprcod ;
               GXv_int19[0] = AV8Barcod ;
               GXv_int16[0] = AV5Barcodreo ;
               GXv_char15[0] = AV6Barcodpar ;
               GXv_decimal8[0] = AV48CosPro ;
               GXv_decimal7[0] = AV49CosAny ;
               new app.pcosbar(remoteHandle, context).execute( GXv_char17, GXv_int19, GXv_int16, GXv_char15, GXv_decimal8, GXv_decimal7) ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV7Emprcod = GXv_char17[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV8Barcod = GXv_int19[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV5Barcodreo = GXv_int16[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV6Barcodpar = GXv_char15[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV48CosPro = GXv_decimal8[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV49CosAny = GXv_decimal7[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV5Barcodreo", GXutil.str( AV5Barcodreo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV48CosPro", GXutil.ltrimstr( AV48CosPro, 10, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV49CosAny", GXutil.ltrimstr( AV49CosAny, 10, 2));
               GXv_char17[0] = AV7Emprcod ;
               GXv_int19[0] = AV8Barcod ;
               GXv_int16[0] = AV30ConReo ;
               GXv_char15[0] = AV6Barcodpar ;
               GXv_decimal8[0] = DecimalUtil.doubleToDec(AV50CosPro2) ;
               GXv_decimal7[0] = AV51CosAny2 ;
               new app.pcosbar(remoteHandle, context).execute( GXv_char17, GXv_int19, GXv_int16, GXv_char15, GXv_decimal8, GXv_decimal7) ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV7Emprcod = GXv_char17[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV8Barcod = GXv_int19[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV30ConReo = GXv_int16[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV6Barcodpar = GXv_char15[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV50CosPro2 = (short)(DecimalUtil.decToDouble(GXv_decimal8[0])) ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV51CosAny2 = GXv_decimal7[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV30ConReo", GXutil.str( AV30ConReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV50CosPro2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50CosPro2), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV51CosAny2", GXutil.ltrimstr( AV51CosAny2, 10, 2));
               GXv_char17[0] = AV7Emprcod ;
               GXv_int19[0] = AV8Barcod ;
               GXv_int16[0] = AV30ConReo ;
               GXv_char15[0] = AV6Barcodpar ;
               GXv_decimal8[0] = AV37KilAct ;
               GXv_decimal7[0] = AV38MtrAct ;
               GXv_int14[0] = AV25CodCausa ;
               GXv_char12[0] = AV22MaqCod ;
               new app.phisreo(remoteHandle, context).execute( GXv_char17, GXv_int19, GXv_int16, GXv_char15, GXv_decimal8, GXv_decimal7, GXv_int14, GXv_char12) ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV7Emprcod = GXv_char17[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV8Barcod = GXv_int19[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV30ConReo = GXv_int16[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV6Barcodpar = GXv_char15[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV37KilAct = GXv_decimal8[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV38MtrAct = GXv_decimal7[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV25CodCausa = GXv_int14[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV22MaqCod = GXv_char12[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV30ConReo", GXutil.str( AV30ConReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV37KilAct", GXutil.ltrimstr( AV37KilAct, 9, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV38MtrAct", GXutil.ltrimstr( AV38MtrAct, 9, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV25CodCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25CodCausa), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV22MaqCod", AV22MaqCod);
               GXv_char17[0] = AV7Emprcod ;
               GXv_int19[0] = AV8Barcod ;
               GXv_int16[0] = AV30ConReo ;
               GXv_char15[0] = AV6Barcodpar ;
               GXv_int14[0] = AV26Rps_Cod ;
               new app.preorps(remoteHandle, context).execute( GXv_char17, GXv_int19, GXv_int16, GXv_char15, GXv_int14) ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV7Emprcod = GXv_char17[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV8Barcod = GXv_int19[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV30ConReo = GXv_int16[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV6Barcodpar = GXv_char15[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV26Rps_Cod = GXv_int14[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV30ConReo", GXutil.str( AV30ConReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV26Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Rps_Cod), 4, 0));
               GXv_char17[0] = AV7Emprcod ;
               GXv_int19[0] = AV8Barcod ;
               GXv_int16[0] = AV30ConReo ;
               GXv_char15[0] = AV6Barcodpar ;
               GXv_int18[0] = AV21Opecod ;
               GXv_int11[0] = AV23Turno ;
               new app.pturope(remoteHandle, context).execute( GXv_char17, GXv_int19, GXv_int16, GXv_char15, GXv_int18, GXv_int11) ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV7Emprcod = GXv_char17[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV8Barcod = GXv_int19[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV30ConReo = GXv_int16[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV6Barcodpar = GXv_char15[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV21Opecod = GXv_int18[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV23Turno = GXv_int11[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV30ConReo", GXutil.str( AV30ConReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV21Opecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Opecod), 6, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV23Turno", GXutil.str( AV23Turno, 1, 0));
               GXv_char17[0] = AV7Emprcod ;
               GXv_int19[0] = AV8Barcod ;
               GXv_int16[0] = AV30ConReo ;
               GXv_char15[0] = AV6Barcodpar ;
               GXv_char12[0] = AV36UsurCod ;
               new app.pusureo(remoteHandle, context).execute( GXv_char17, GXv_int19, GXv_int16, GXv_char15, GXv_char12) ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV7Emprcod = GXv_char17[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV8Barcod = GXv_int19[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV30ConReo = GXv_int16[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV6Barcodpar = GXv_char15[0] ;
               webreoperadosinternoskilosmetrospiezas_impl.this.AV36UsurCod = GXv_char12[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV30ConReo", GXutil.str( AV30ConReo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV36UsurCod", AV36UsurCod);
            }
            AV52Inc_obs = httpContext.getMessage( "Generacion Reoperado Interno PARCIAL,Fin.", "") ;
            new app.pctrinc(remoteHandle, context).execute( AV7Emprcod, GXutil.substring( AV109Pgmname, 1, 10), AV36UsurCod, AV39Station, AV52Inc_obs, AV8Barcod, AV30ConReo, AV6Barcodpar) ;
            httpContext.GX_msglist.addItem(AV52Inc_obs);
            AV95OUTConReo = AV30ConReo ;
            AV100ObjetoRefrescar.clear();
            AV100ObjetoRefrescar.add(httpContext.getMessage( "Reoperado", ""), 0);
            AV100ObjetoRefrescar.add(GXutil.str( AV95OUTConReo, 1, 0), 0);
            this.executeExternalObjectMethod("", false, "GlobalEvents", "RefrescarObjeto", new Object[] {AV100ObjetoRefrescar,Boolean.valueOf(true)}, true);
            httpContext.setWebReturnParms(new Object[] {AV7Emprcod,AV19BarNHdr,Integer.valueOf(AV8Barcod),Byte.valueOf(AV5Barcodreo),AV6Barcodpar,AV12BarKgm,AV13BarMtr,Integer.valueOf(AV14BarPie),AV15BarUnimed,Byte.valueOf(AV27BarSit),AV37KilAct,AV38MtrAct,AV47BarCosAny,AV46BarCosPro,AV53prior,AV36UsurCod});
            httpContext.setWebReturnParmsMetadata(new Object[] {"AV7Emprcod","AV19BarNHdr","AV8Barcod","AV5Barcodreo","AV6Barcodpar","AV12BarKgm","AV13BarMtr","AV14BarPie","AV15BarUnimed","AV27BarSit","AV37KilAct","AV38MtrAct","AV47BarCosAny","AV46BarCosPro","AV53prior","AV36UsurCod"});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
      /*  Sending Event outputs  */
      cmbavTipreo.setValue( GXutil.rtrim( AV28TipReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTipreo.getInternalname(), "Values", cmbavTipreo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV100ObjetoRefrescar", AV100ObjetoRefrescar);
   }

   public void e14EC2( )
   {
      /* 'DoSalir' Routine */
      returnInSub = false ;
      AV95OUTConReo = (byte)(0) ;
      AV100ObjetoRefrescar.add(httpContext.getMessage( "Reoperado", ""), 0);
      AV100ObjetoRefrescar.add(GXutil.str( AV95OUTConReo, 1, 0), 0);
      this.executeExternalObjectMethod("", false, "GlobalEvents", "RefrescarObjeto", new Object[] {AV100ObjetoRefrescar,Boolean.valueOf(false)}, true);
      httpContext.setWebReturnParms(new Object[] {AV7Emprcod,AV19BarNHdr,Integer.valueOf(AV8Barcod),Byte.valueOf(AV5Barcodreo),AV6Barcodpar,AV12BarKgm,AV13BarMtr,Integer.valueOf(AV14BarPie),AV15BarUnimed,Byte.valueOf(AV27BarSit),AV37KilAct,AV38MtrAct,AV47BarCosAny,AV46BarCosPro,AV53prior,AV36UsurCod});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV7Emprcod","AV19BarNHdr","AV8Barcod","AV5Barcodreo","AV6Barcodpar","AV12BarKgm","AV13BarMtr","AV14BarPie","AV15BarUnimed","AV27BarSit","AV37KilAct","AV38MtrAct","AV47BarCosAny","AV46BarCosPro","AV53prior","AV36UsurCod"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV100ObjetoRefrescar", AV100ObjetoRefrescar);
   }

   public void S152( )
   {
      /* 'LOADCOMBOOPECOD' Routine */
      returnInSub = false ;
      /* Using cursor H00EC8 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A8482OpeAct = H00EC8_A8482OpeAct[0] ;
         n8482OpeAct = H00EC8_n8482OpeAct[0] ;
         A13748OpeCNom = H00EC8_A13748OpeCNom[0] ;
         A652OpeCod = H00EC8_A652OpeCod[0] ;
         A653OpeNom = H00EC8_A653OpeNom[0] ;
         n653OpeNom = H00EC8_n653OpeNom[0] ;
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarkgm1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarkgm1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm1_Enabled), 5, 0), true);
         }
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarmtr1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarmtr1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr1_Enabled), 5, 0), true);
         }
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarpie1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarpie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarpie1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarpie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie1_Enabled), 5, 0), true);
         }
         AV66Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV66Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) );
         AV66Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13748OpeCNom );
         AV70Opecod_Data.add(AV66Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      Combo_opecod_Selectedvalue_set = ((0==AV21Opecod) ? "" : GXutil.trim( GXutil.str( AV21Opecod, 6, 0))) ;
      ucCombo_opecod.sendProperty(context, "", false, Combo_opecod_Internalname, "SelectedValue_set", Combo_opecod_Selectedvalue_set);
   }

   public void S142( )
   {
      /* 'LOADCOMBORPS_COD' Routine */
      returnInSub = false ;
      /* Using cursor H00EC9 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A13817Rps_DscID = H00EC9_A13817Rps_DscID[0] ;
         A7000Rps_Cod = H00EC9_A7000Rps_Cod[0] ;
         A7001Rps_Dsc = H00EC9_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = H00EC9_n7001Rps_Dsc[0] ;
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarkgm1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarkgm1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm1_Enabled), 5, 0), true);
         }
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarmtr1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarmtr1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr1_Enabled), 5, 0), true);
         }
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarpie1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarpie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarpie1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarpie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie1_Enabled), 5, 0), true);
         }
         AV66Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV66Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A7000Rps_Cod, 4, 0)) );
         AV66Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13817Rps_DscID );
         AV69Rps_Cod_Data.add(AV66Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      Combo_rps_cod_Selectedvalue_set = ((0==AV26Rps_Cod) ? "" : GXutil.trim( GXutil.str( AV26Rps_Cod, 4, 0))) ;
      ucCombo_rps_cod.sendProperty(context, "", false, Combo_rps_cod_Internalname, "SelectedValue_set", Combo_rps_cod_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOCODCAUSA' Routine */
      returnInSub = false ;
      /* Using cursor H00EC10 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A13816DscCausaID = H00EC10_A13816DscCausaID[0] ;
         A5085CodCausa = H00EC10_A5085CodCausa[0] ;
         A5086DscCausa = H00EC10_A5086DscCausa[0] ;
         n5086DscCausa = H00EC10_n5086DscCausa[0] ;
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarkgm1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarkgm1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm1_Enabled), 5, 0), true);
         }
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarmtr1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarmtr1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr1_Enabled), 5, 0), true);
         }
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarpie1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarpie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarpie1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarpie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie1_Enabled), 5, 0), true);
         }
         AV66Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV66Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A5085CodCausa, 4, 0)) );
         AV66Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13816DscCausaID );
         AV68CodCausa_Data.add(AV66Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      Combo_codcausa_Selectedvalue_set = ((0==AV25CodCausa) ? "" : GXutil.trim( GXutil.str( AV25CodCausa, 4, 0))) ;
      ucCombo_codcausa.sendProperty(context, "", false, Combo_codcausa_Internalname, "SelectedValue_set", Combo_codcausa_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOTIPDEFCOD' Routine */
      returnInSub = false ;
      if ( 1 == 2 )
      {
         /* Using cursor H00EC11 */
         pr_default.execute(7);
         while ( (pr_default.getStatus(7) != 101) )
         {
            A13003TipDefAct = H00EC11_A13003TipDefAct[0] ;
            n13003TipDefAct = H00EC11_n13003TipDefAct[0] ;
            A13819TipdefDscI = H00EC11_A13819TipdefDscI[0] ;
            A833TipDefCod = H00EC11_A833TipDefCod[0] ;
            A834TipDefDsc = H00EC11_A834TipDefDsc[0] ;
            n834TipDefDsc = H00EC11_n834TipDefDsc[0] ;
            if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
            {
               edtavBarkgm1_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm1_Enabled), 5, 0), true);
            }
            else
            {
               edtavBarkgm1_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm1_Enabled), 5, 0), true);
            }
            if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
            {
               edtavBarmtr1_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr1_Enabled), 5, 0), true);
            }
            else
            {
               edtavBarmtr1_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr1_Enabled), 5, 0), true);
            }
            if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
            {
               edtavBarpie1_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavBarpie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie1_Enabled), 5, 0), true);
            }
            else
            {
               edtavBarpie1_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavBarpie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie1_Enabled), 5, 0), true);
            }
            AV66Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV66Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A833TipDefCod, 4, 0)) );
            AV66Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13819TipdefDscI );
            AV67TipDefCod_Data.add(AV66Combo_DataItem, 0);
            pr_default.readNext(7);
         }
         pr_default.close(7);
         Combo_tipdefcod_Selectedvalue_set = ((0==AV24TipDefCod) ? "" : GXutil.trim( GXutil.str( AV24TipDefCod, 4, 0))) ;
         ucCombo_tipdefcod.sendProperty(context, "", false, Combo_tipdefcod_Internalname, "SelectedValue_set", Combo_tipdefcod_Selectedvalue_set);
      }
      /* Using cursor H00EC12 */
      pr_default.execute(8);
      while ( (pr_default.getStatus(8) != 101) )
      {
         A13003TipDefAct = H00EC12_A13003TipDefAct[0] ;
         n13003TipDefAct = H00EC12_n13003TipDefAct[0] ;
         A834TipDefDsc = H00EC12_A834TipDefDsc[0] ;
         n834TipDefDsc = H00EC12_n834TipDefDsc[0] ;
         A833TipDefCod = H00EC12_A833TipDefCod[0] ;
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarkgm1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarkgm1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm1_Enabled), 5, 0), true);
         }
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarmtr1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarmtr1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr1_Enabled), 5, 0), true);
         }
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarpie1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarpie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarpie1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarpie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie1_Enabled), 5, 0), true);
         }
         A13819TipdefDscI = GXutil.trim( GXutil.str( A833TipDefCod, 4, 0)) + "-" + GXutil.trim( A834TipDefDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13819TipdefDscI", A13819TipdefDscI);
         AV66Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV66Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A833TipDefCod, 4, 0)) );
         AV66Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13819TipdefDscI );
         AV67TipDefCod_Data.add(AV66Combo_DataItem, 0);
         pr_default.readNext(8);
      }
      pr_default.close(8);
      Combo_tipdefcod_Selectedvalue_set = ((0==AV24TipDefCod) ? "" : GXutil.trim( GXutil.str( AV24TipDefCod, 4, 0))) ;
      ucCombo_tipdefcod.sendProperty(context, "", false, Combo_tipdefcod_Internalname, "SelectedValue_set", Combo_tipdefcod_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOMAQCOD' Routine */
      returnInSub = false ;
      /* Using cursor H00EC13 */
      pr_default.execute(9);
      while ( (pr_default.getStatus(9) != 101) )
      {
         A607MaqEst = H00EC13_A607MaqEst[0] ;
         n607MaqEst = H00EC13_n607MaqEst[0] ;
         A13734MaqCDsc = H00EC13_A13734MaqCDsc[0] ;
         A602MaqCod = H00EC13_A602MaqCod[0] ;
         A606MaqDsc = H00EC13_A606MaqDsc[0] ;
         n606MaqDsc = H00EC13_n606MaqDsc[0] ;
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarkgm1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarkgm1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm1_Enabled), 5, 0), true);
         }
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarmtr1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarmtr1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr1_Enabled), 5, 0), true);
         }
         if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
         {
            edtavBarpie1_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarpie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie1_Enabled), 5, 0), true);
         }
         else
         {
            edtavBarpie1_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavBarpie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie1_Enabled), 5, 0), true);
         }
         AV66Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV66Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV66Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13734MaqCDsc );
         AV65MaqCod_Data.add(AV66Combo_DataItem, 0);
         pr_default.readNext(9);
      }
      pr_default.close(9);
      Combo_maqcod_Selectedvalue_set = AV22MaqCod ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
   }

   public void e15EC2( )
   {
      /* Tipdefcod_Isvalid Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'DEFECTOS' */
      S162 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      if ( GXutil.strcmp(AV35Ok, httpContext.getMessage( "N", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.NO existe Dedefcto", ""));
         GX_FocusControl = edtavTipdefcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void e16EC2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "RemoveElement", "", new Object[] {httpContext.getMessage( ".gx-popup-close", "")});
   }

   public void S162( )
   {
      /* 'DEFECTOS' Routine */
      returnInSub = false ;
      GXv_char17[0] = AV42Tipdefdsc ;
      GXv_char15[0] = AV35Ok ;
      new app.existedefectotipdef(remoteHandle, context).execute( AV7Emprcod, AV24TipDefCod, GXv_char17, GXv_char15) ;
      webreoperadosinternoskilosmetrospiezas_impl.this.AV42Tipdefdsc = GXv_char17[0] ;
      webreoperadosinternoskilosmetrospiezas_impl.this.AV35Ok = GXv_char15[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Ok", AV35Ok);
   }

   protected void nextLoad( )
   {
   }

   protected void e17EC2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_188_EC2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconfirmar.setProperty("Title", Dvelop_confirmpanel_btnconfirmar_Title);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmar_Confirmtype);
         ucDvelop_confirmpanel_btnconfirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar_Internalname, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_188_EC2e( true) ;
      }
      else
      {
         wb_table1_188_EC2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Emprcod", AV7Emprcod);
      AV19BarNHdr = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarNHdr", AV19BarNHdr);
      AV8Barcod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Barcod), 8, 0));
      AV5Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Barcodreo", GXutil.str( AV5Barcodreo, 1, 0));
      AV6Barcodpar = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
      AV12BarKgm = (java.math.BigDecimal)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12BarKgm", GXutil.ltrimstr( AV12BarKgm, 9, 2));
      AV13BarMtr = (java.math.BigDecimal)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarMtr", GXutil.ltrimstr( AV13BarMtr, 9, 2));
      AV14BarPie = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarPie), 6, 0));
      AV15BarUnimed = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarUnimed", AV15BarUnimed);
      AV27BarSit = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27BarSit), 2, 0));
      AV37KilAct = (java.math.BigDecimal)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37KilAct", GXutil.ltrimstr( AV37KilAct, 9, 2));
      AV38MtrAct = (java.math.BigDecimal)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38MtrAct", GXutil.ltrimstr( AV38MtrAct, 9, 2));
      AV47BarCosAny = (java.math.BigDecimal)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47BarCosAny", GXutil.ltrimstr( AV47BarCosAny, 10, 2));
      AV46BarCosPro = (java.math.BigDecimal)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46BarCosPro", GXutil.ltrimstr( AV46BarCosPro, 10, 2));
      AV53prior = (String)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53prior", AV53prior);
      AV36UsurCod = (String)getParm(obj,15) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36UsurCod", AV36UsurCod);
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
      paEC2( ) ;
      wsEC2( ) ;
      weEC2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714192453", true, true);
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
      httpContext.AddJavascriptSource("webreoperadosinternoskilosmetrospiezas.js", "?202681714192453", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtnsalir_Internalname = "BTNSALIR" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavBarnhdr_Internalname = "vBARNHDR" ;
      edtavBarunimed_Internalname = "vBARUNIMED" ;
      edtavBarpes_Internalname = "vBARPES" ;
      edtavBargraaca_Internalname = "vBARGRAACA" ;
      edtavBarancaca1_Internalname = "vBARANCACA1" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavBarkgm_Internalname = "vBARKGM" ;
      edtavBarmtr_Internalname = "vBARMTR" ;
      edtavBarpie_Internalname = "vBARPIE" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtavKilos_Internalname = "vKILOS" ;
      edtavMetros_Internalname = "vMETROS" ;
      edtavPiezas_Internalname = "vPIEZAS" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      edtavKilosdisponible_Internalname = "vKILOSDISPONIBLE" ;
      edtavMetrosdisponible_Internalname = "vMETROSDISPONIBLE" ;
      edtavPiezasdisponible_Internalname = "vPIEZASDISPONIBLE" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      lblTextblockcombo_maqcod_Internalname = "TEXTBLOCKCOMBO_MAQCOD" ;
      Combo_maqcod_Internalname = "COMBO_MAQCOD" ;
      divTablesplittedmaqcod_Internalname = "TABLESPLITTEDMAQCOD" ;
      lblTextblockcombo_tipdefcod_Internalname = "TEXTBLOCKCOMBO_TIPDEFCOD" ;
      Combo_tipdefcod_Internalname = "COMBO_TIPDEFCOD" ;
      divTablesplittedtipdefcod_Internalname = "TABLESPLITTEDTIPDEFCOD" ;
      lblTextblockcombo_codcausa_Internalname = "TEXTBLOCKCOMBO_CODCAUSA" ;
      Combo_codcausa_Internalname = "COMBO_CODCAUSA" ;
      divTablesplittedcodcausa_Internalname = "TABLESPLITTEDCODCAUSA" ;
      lblTextblockcombo_rps_cod_Internalname = "TEXTBLOCKCOMBO_RPS_COD" ;
      Combo_rps_cod_Internalname = "COMBO_RPS_COD" ;
      divTablesplittedrps_cod_Internalname = "TABLESPLITTEDRPS_COD" ;
      lblTextblockcombo_opecod_Internalname = "TEXTBLOCKCOMBO_OPECOD" ;
      Combo_opecod_Internalname = "COMBO_OPECOD" ;
      divTablesplittedopecod_Internalname = "TABLESPLITTEDOPECOD" ;
      edtavTurno_Internalname = "vTURNO" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      cmbavTipreo.setInternalname( "vTIPREO" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavBarkgm1_Internalname = "vBARKGM1" ;
      edtavBarmtr1_Internalname = "vBARMTR1" ;
      edtavBarpie1_Internalname = "vBARPIE1" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divPanelmasdatos_Internalname = "PANELMASDATOS" ;
      Dvpanel_panelmasdatos_Internalname = "DVPANEL_PANELMASDATOS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      edtavTipdefcod_Internalname = "vTIPDEFCOD" ;
      edtavCodcausa_Internalname = "vCODCAUSA" ;
      edtavRps_cod_Internalname = "vRPS_COD" ;
      edtavOpecod_Internalname = "vOPECOD" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = "DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
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
      edtavOpecod_Jsonclick = "" ;
      edtavOpecod_Visible = 1 ;
      edtavRps_cod_Jsonclick = "" ;
      edtavRps_cod_Visible = 1 ;
      edtavCodcausa_Jsonclick = "" ;
      edtavCodcausa_Visible = 1 ;
      edtavTipdefcod_Jsonclick = "" ;
      edtavTipdefcod_Visible = 1 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Visible = 1 ;
      edtavBarpie1_Jsonclick = "" ;
      edtavBarpie1_Enabled = 1 ;
      edtavBarmtr1_Jsonclick = "" ;
      edtavBarmtr1_Enabled = 1 ;
      edtavBarkgm1_Jsonclick = "" ;
      edtavBarkgm1_Enabled = 1 ;
      divPanelmasdatos_Visible = 1 ;
      cmbavTipreo.setJsonclick( "" );
      cmbavTipreo.setEnabled( 1 );
      edtavTurno_Jsonclick = "" ;
      edtavTurno_Enabled = 1 ;
      edtavPiezasdisponible_Jsonclick = "" ;
      edtavPiezasdisponible_Enabled = 1 ;
      edtavMetrosdisponible_Jsonclick = "" ;
      edtavMetrosdisponible_Enabled = 1 ;
      edtavKilosdisponible_Jsonclick = "" ;
      edtavKilosdisponible_Enabled = 1 ;
      edtavPiezas_Jsonclick = "" ;
      edtavPiezas_Enabled = 1 ;
      edtavMetros_Jsonclick = "" ;
      edtavMetros_Enabled = 1 ;
      edtavKilos_Jsonclick = "" ;
      edtavKilos_Enabled = 1 ;
      edtavBarpie_Jsonclick = "" ;
      edtavBarpie_Enabled = 0 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarancaca1_Jsonclick = "" ;
      edtavBarancaca1_Enabled = 1 ;
      edtavBargraaca_Jsonclick = "" ;
      edtavBargraaca_Enabled = 1 ;
      edtavBarpes_Jsonclick = "" ;
      edtavBarpes_Enabled = 1 ;
      edtavBarunimed_Jsonclick = "" ;
      edtavBarunimed_Enabled = 0 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 0 ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Desea crear el REOPERADO INTERNO?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = httpContext.getMessage( "Creacion REOPERADO INTERNO", "") ;
      Dvpanel_panelmasdatos_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelmasdatos_Iconposition = "Right" ;
      Dvpanel_panelmasdatos_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelmasdatos_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelmasdatos_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelmasdatos_Title = "" ;
      Dvpanel_panelmasdatos_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelmasdatos_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelmasdatos_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelmasdatos_Width = "100%" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Destino", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Combo_opecod_Emptyitemtext = "" ;
      Combo_opecod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_rps_cod_Emptyitemtext = "" ;
      Combo_rps_cod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_codcausa_Emptyitemtext = "" ;
      Combo_codcausa_Cls = "ExtendedCombo AttributeFL" ;
      Combo_tipdefcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_tipdefcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_maqcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_maqcod_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Origen", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
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
      cmbavTipreo.setName( "vTIPREO" );
      cmbavTipreo.setWebtags( "" );
      cmbavTipreo.addItem("T", httpContext.getMessage( "TOTAL", ""), (short)(0));
      cmbavTipreo.addItem("P", httpContext.getMessage( "PARCIAL", ""), (short)(0));
      if ( cmbavTipreo.getItemCount() > 0 )
      {
         AV28TipReo = cmbavTipreo.getValidValue(AV28TipReo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28TipReo", AV28TipReo);
      }
      /* End function init_web_controls */
   }

   public void validv_Tipreo( )
   {
      AV28TipReo = cmbavTipreo.getValue() ;
      if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
      {
         edtavBarkgm1_Enabled = 0 ;
      }
      else
      {
         edtavBarkgm1_Enabled = 1 ;
      }
      if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
      {
         edtavBarmtr1_Enabled = 0 ;
      }
      else
      {
         edtavBarmtr1_Enabled = 1 ;
      }
      if ( GXutil.strcmp(AV28TipReo, httpContext.getMessage( httpContext.getMessage( httpContext.getMessage( "T", ""), ""), "")) == 0 )
      {
         edtavBarpie1_Enabled = 0 ;
      }
      else
      {
         edtavBarpie1_Enabled = 1 ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm1_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr1_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie1_Enabled), 5, 0), true);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV20BarNHdrdestino',fld:'vBARNHDRDESTINO',pic:'',hsh:true},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV39Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV80BarPes',fld:'vBARPES',pic:'ZZZ9'},{av:'AV81BarGraAca',fld:'vBARGRAACA',pic:'ZZZ9'},{av:'AV82BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9'},{av:'AV71kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV72metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV73piezas',fld:'vPIEZAS',pic:'ZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e13EC2',iparms:[{av:'cmbavTipreo'},{av:'AV28TipReo',fld:'vTIPREO',pic:''},{av:'AV18BarPie1',fld:'vBARPIE1',pic:'ZZZZZ9'},{av:'AV14BarPie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV73piezas',fld:'vPIEZAS',pic:'ZZZZZ9'},{av:'AV16BarKgm1',fld:'vBARKGM1',pic:'ZZZZZ9.99'},{av:'AV12BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV71kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV15BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV17BarMtr1',fld:'vBARMTR1',pic:'ZZZZZ9.99'},{av:'AV13BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV72metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV24TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'AV22MaqCod',fld:'vMAQCOD',pic:''},{av:'AV20BarNHdrdestino',fld:'vBARNHDRDESTINO',pic:'',hsh:true}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV35Ok',fld:'vOK',pic:''},{av:'Dvelop_confirmpanel_btnconfirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e11EC2',iparms:[{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'AV53prior',fld:'vPRIOR',pic:''},{av:'cmbavTipreo'},{av:'AV28TipReo',fld:'vTIPREO',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV27BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV24TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'AV29Porcen',fld:'vPORCEN',pic:'ZZ9.99'},{av:'AV22MaqCod',fld:'vMAQCOD',pic:''},{av:'AV30ConReo',fld:'vCONREO',pic:'9'},{av:'AV32DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV36UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV39Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV56KgmOri',fld:'vKGMORI',pic:'ZZZZZ9.99'},{av:'AV57MetOri',fld:'vMETORI',pic:'ZZZZZ9.99'},{av:'AV25CodCausa',fld:'vCODCAUSA',pic:'ZZZ9'},{av:'AV26Rps_Cod',fld:'vRPS_COD',pic:'ZZZ9'},{av:'AV21Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV23Turno',fld:'vTURNO',pic:'9'},{av:'AV64Barsitri',fld:'vBARSITRI',pic:'Z9'},{av:'AV46BarCosPro',fld:'vBARCOSPRO',pic:'ZZZZZZ9.99'},{av:'AV47BarCosAny',fld:'vBARCOSANY',pic:'ZZZZZZ9.99'},{av:'AV38MtrAct',fld:'vMTRACT',pic:'ZZZZZ9.99'},{av:'AV37KilAct',fld:'vKILACT',pic:'ZZZZZ9.99'},{av:'AV15BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV14BarPie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV13BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV12BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV19BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV18BarPie1',fld:'vBARPIE1',pic:'ZZZZZ9'},{av:'AV16BarKgm1',fld:'vBARKGM1',pic:'ZZZZZ9.99'},{av:'AV17BarMtr1',fld:'vBARMTR1',pic:'ZZZZZ9.99'},{av:'AV48CosPro',fld:'vCOSPRO',pic:'ZZZZZZ9.99'},{av:'AV49CosAny',fld:'vCOSANY',pic:'ZZZZZZ9.99'},{av:'AV50CosPro2',fld:'vCOSPRO2',pic:'ZZZ9'},{av:'AV51CosAny2',fld:'vCOSANY2',pic:'ZZZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV25CodCausa',fld:'vCODCAUSA',pic:'ZZZ9'},{av:'AV57MetOri',fld:'vMETORI',pic:'ZZZZZ9.99'},{av:'AV56KgmOri',fld:'vKGMORI',pic:'ZZZZZ9.99'},{av:'AV26Rps_Cod',fld:'vRPS_COD',pic:'ZZZ9'},{av:'AV23Turno',fld:'vTURNO',pic:'9'},{av:'AV21Opecod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV36UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV64Barsitri',fld:'vBARSITRI',pic:'Z9'},{av:'AV37KilAct',fld:'vKILACT',pic:'ZZZZZ9.99'},{av:'AV38MtrAct',fld:'vMTRACT',pic:'ZZZZZ9.99'},{av:'AV29Porcen',fld:'vPORCEN',pic:'ZZ9.99'},{av:'AV24TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'cmbavTipreo'},{av:'AV28TipReo',fld:'vTIPREO',pic:''},{av:'AV27BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV5Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV17BarMtr1',fld:'vBARMTR1',pic:'ZZZZZ9.99'},{av:'AV16BarKgm1',fld:'vBARKGM1',pic:'ZZZZZ9.99'},{av:'AV18BarPie1',fld:'vBARPIE1',pic:'ZZZZZ9'},{av:'AV50CosPro2',fld:'vCOSPRO2',pic:'ZZZ9'},{av:'AV51CosAny2',fld:'vCOSANY2',pic:'ZZZZZZ9.99'},{av:'AV48CosPro',fld:'vCOSPRO',pic:'ZZZZZZ9.99'},{av:'AV49CosAny',fld:'vCOSANY',pic:'ZZZZZZ9.99'},{av:'AV32DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV30ConReo',fld:'vCONREO',pic:'9'},{av:'AV22MaqCod',fld:'vMAQCOD',pic:''},{av:'AV6Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV8Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV100ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:''}]}");
      setEventMetadata("'DOSALIR'","{handler:'e14EC2',iparms:[{av:'AV100ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:''},{av:'AV36UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV53prior',fld:'vPRIOR',pic:''},{av:'AV46BarCosPro',fld:'vBARCOSPRO',pic:'ZZZZZZ9.99'},{av:'AV47BarCosAny',fld:'vBARCOSANY',pic:'ZZZZZZ9.99'},{av:'AV38MtrAct',fld:'vMTRACT',pic:'ZZZZZ9.99'},{av:'AV37KilAct',fld:'vKILACT',pic:'ZZZZZ9.99'},{av:'AV27BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV15BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV14BarPie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV13BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV12BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV6Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV5Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV19BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOSALIR'",",oparms:[{av:'AV100ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:''}]}");
      setEventMetadata("VTIPDEFCOD.ISVALID","{handler:'e15EC2',iparms:[{av:'AV35Ok',fld:'vOK',pic:''},{av:'AV24TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("VTIPDEFCOD.ISVALID",",oparms:[{av:'AV35Ok',fld:'vOK',pic:''}]}");
      setEventMetadata("VALIDV_TIPREO","{handler:'validv_Tipreo',iparms:[{av:'cmbavTipreo'},{av:'AV28TipReo',fld:'vTIPREO',pic:''}]");
      setEventMetadata("VALIDV_TIPREO",",oparms:[{av:'edtavBarkgm1_Enabled',ctrl:'vBARKGM1',prop:'Enabled'},{av:'edtavBarmtr1_Enabled',ctrl:'vBARMTR1',prop:'Enabled'},{av:'edtavBarpie1_Enabled',ctrl:'vBARPIE1',prop:'Enabled'}]}");
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
      pr_default.close(1);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV7Emprcod = "" ;
      wcpOAV19BarNHdr = "" ;
      wcpOAV6Barcodpar = "" ;
      wcpOAV12BarKgm = DecimalUtil.ZERO ;
      wcpOAV13BarMtr = DecimalUtil.ZERO ;
      wcpOAV15BarUnimed = "" ;
      wcpOAV37KilAct = DecimalUtil.ZERO ;
      wcpOAV38MtrAct = DecimalUtil.ZERO ;
      wcpOAV47BarCosAny = DecimalUtil.ZERO ;
      wcpOAV46BarCosPro = DecimalUtil.ZERO ;
      wcpOAV53prior = "" ;
      wcpOAV36UsurCod = "" ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      Combo_opecod_Selectedvalue_get = "" ;
      Combo_rps_cod_Selectedvalue_get = "" ;
      Combo_codcausa_Selectedvalue_get = "" ;
      Combo_tipdefcod_Selectedvalue_get = "" ;
      Combo_maqcod_Selectedvalue_get = "" ;
      NV16BarKgm1 = DecimalUtil.ZERO ;
      NV17BarMtr1 = DecimalUtil.ZERO ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7Emprcod = "" ;
      AV19BarNHdr = "" ;
      AV6Barcodpar = "" ;
      AV12BarKgm = DecimalUtil.ZERO ;
      AV13BarMtr = DecimalUtil.ZERO ;
      AV15BarUnimed = "" ;
      AV37KilAct = DecimalUtil.ZERO ;
      AV38MtrAct = DecimalUtil.ZERO ;
      AV47BarCosAny = DecimalUtil.ZERO ;
      AV46BarCosPro = DecimalUtil.ZERO ;
      AV53prior = "" ;
      AV36UsurCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV20BarNHdrdestino = "" ;
      AV109Pgmname = "" ;
      AV39Station = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV71kilos = DecimalUtil.ZERO ;
      AV72metros = DecimalUtil.ZERO ;
      AV65MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV67TipDefCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV68CodCausa_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV69Rps_Cod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV70Opecod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV29Porcen = DecimalUtil.ZERO ;
      AV56KgmOri = DecimalUtil.ZERO ;
      AV57MetOri = DecimalUtil.ZERO ;
      AV48CosPro = DecimalUtil.ZERO ;
      AV49CosAny = DecimalUtil.ZERO ;
      AV51CosAny2 = DecimalUtil.ZERO ;
      AV100ObjetoRefrescar = new GXSimpleCollection<String>(String.class, "internal", "");
      AV35Ok = "" ;
      AV83Ancho = DecimalUtil.ZERO ;
      Combo_maqcod_Selectedvalue_set = "" ;
      Combo_tipdefcod_Selectedvalue_set = "" ;
      Combo_codcausa_Selectedvalue_set = "" ;
      Combo_rps_cod_Selectedvalue_set = "" ;
      Combo_opecod_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnsalir_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      AV75kilosdisponible = DecimalUtil.ZERO ;
      AV76metrosdisponible = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_maqcod_Jsonclick = "" ;
      ucCombo_maqcod = new com.genexus.webpanels.GXUserControl();
      Combo_maqcod_Caption = "" ;
      lblTextblockcombo_tipdefcod_Jsonclick = "" ;
      ucCombo_tipdefcod = new com.genexus.webpanels.GXUserControl();
      Combo_tipdefcod_Caption = "" ;
      lblTextblockcombo_codcausa_Jsonclick = "" ;
      ucCombo_codcausa = new com.genexus.webpanels.GXUserControl();
      Combo_codcausa_Caption = "" ;
      lblTextblockcombo_rps_cod_Jsonclick = "" ;
      ucCombo_rps_cod = new com.genexus.webpanels.GXUserControl();
      Combo_rps_cod_Caption = "" ;
      lblTextblockcombo_opecod_Jsonclick = "" ;
      ucCombo_opecod = new com.genexus.webpanels.GXUserControl();
      Combo_opecod_Caption = "" ;
      AV28TipReo = "" ;
      ucDvpanel_panelmasdatos = new com.genexus.webpanels.GXUserControl();
      AV16BarKgm1 = DecimalUtil.ZERO ;
      AV17BarMtr1 = DecimalUtil.ZERO ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV22MaqCod = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      scmdbuf = "" ;
      H00EC3_A130BarCodPar = new String[] {""} ;
      H00EC3_A132BarCodReo = new byte[1] ;
      H00EC3_A129BarCod = new int[1] ;
      H00EC3_A396EmprCod = new String[] {""} ;
      H00EC3_A213BarSit = new byte[1] ;
      H00EC3_A2009DisTipDis = new String[] {""} ;
      H00EC3_n2009DisTipDis = new boolean[] {false} ;
      H00EC3_A361DisCod = new int[1] ;
      H00EC3_A864BarPes = new short[1] ;
      H00EC3_A1909BarGraAca = new short[1] ;
      H00EC3_A125BarAncAca1 = new short[1] ;
      H00EC3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EC3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EC3_A168BarKgmLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EC3_A186BarMtrLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EC3_A199BarPie1 = new short[1] ;
      H00EC3_A365DisDes = new String[] {""} ;
      H00EC3_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A2009DisTipDis = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A168BarKgmLan = DecimalUtil.ZERO ;
      A186BarMtrLan = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV54DisTipDis = "" ;
      H00EC5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EC5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EC5_A199BarPie1 = new short[1] ;
      H00EC5_A898BarPieNDes = new int[1] ;
      c1261BarAlbKgmE = DecimalUtil.ZERO ;
      c1263BarAlbMtrE = DecimalUtil.ZERO ;
      H00EC6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EC6_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EC6_A1265BarAlbPie = new int[1] ;
      H00EC7_A130BarCodPar = new String[] {""} ;
      H00EC7_A132BarCodReo = new byte[1] ;
      H00EC7_A129BarCod = new int[1] ;
      H00EC7_A396EmprCod = new String[] {""} ;
      H00EC7_A138BarConReo = new byte[1] ;
      GXt_char1 = "" ;
      AV40EmprNom = "" ;
      Gx_msg = "" ;
      AV78kilosdisponible2 = DecimalUtil.ZERO ;
      AV79metrosdisponible2 = DecimalUtil.ZERO ;
      AV60Maqdsc = "" ;
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      AV31Codigo = "" ;
      AV52Inc_obs = "" ;
      AV84PriCod = "" ;
      AV86CliNom = "" ;
      AV87DisArtCod = "" ;
      AV88DisArtDsc = "" ;
      AV89DisFec = GXutil.nullDate() ;
      GXv_date13 = new java.util.Date[1] ;
      AV44CosProi = DecimalUtil.ZERO ;
      AV45CosAnyi = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_int10 = new int[1] ;
      GXv_int6 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int14 = new short[1] ;
      GXv_int18 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_int19 = new int[1] ;
      GXv_int16 = new byte[1] ;
      GXv_char12 = new String[1] ;
      H00EC8_A396EmprCod = new String[] {""} ;
      H00EC8_A8482OpeAct = new String[] {""} ;
      H00EC8_n8482OpeAct = new boolean[] {false} ;
      H00EC8_A13748OpeCNom = new String[] {""} ;
      H00EC8_A652OpeCod = new int[1] ;
      H00EC8_A653OpeNom = new String[] {""} ;
      H00EC8_n653OpeNom = new boolean[] {false} ;
      A8482OpeAct = "" ;
      A13748OpeCNom = "" ;
      A653OpeNom = "" ;
      AV66Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H00EC9_A396EmprCod = new String[] {""} ;
      H00EC9_A13817Rps_DscID = new String[] {""} ;
      H00EC9_A7000Rps_Cod = new short[1] ;
      H00EC9_A7001Rps_Dsc = new String[] {""} ;
      H00EC9_n7001Rps_Dsc = new boolean[] {false} ;
      A13817Rps_DscID = "" ;
      A7001Rps_Dsc = "" ;
      H00EC10_A396EmprCod = new String[] {""} ;
      H00EC10_A13816DscCausaID = new String[] {""} ;
      H00EC10_A5085CodCausa = new short[1] ;
      H00EC10_A5086DscCausa = new String[] {""} ;
      H00EC10_n5086DscCausa = new boolean[] {false} ;
      A13816DscCausaID = "" ;
      A5086DscCausa = "" ;
      H00EC11_A396EmprCod = new String[] {""} ;
      H00EC11_A13003TipDefAct = new String[] {""} ;
      H00EC11_n13003TipDefAct = new boolean[] {false} ;
      H00EC11_A13819TipdefDscI = new String[] {""} ;
      H00EC11_A833TipDefCod = new short[1] ;
      H00EC11_A834TipDefDsc = new String[] {""} ;
      H00EC11_n834TipDefDsc = new boolean[] {false} ;
      A13003TipDefAct = "" ;
      A13819TipdefDscI = "" ;
      A834TipDefDsc = "" ;
      H00EC12_A396EmprCod = new String[] {""} ;
      H00EC12_A13003TipDefAct = new String[] {""} ;
      H00EC12_n13003TipDefAct = new boolean[] {false} ;
      H00EC12_A834TipDefDsc = new String[] {""} ;
      H00EC12_n834TipDefDsc = new boolean[] {false} ;
      H00EC12_A833TipDefCod = new short[1] ;
      H00EC13_A396EmprCod = new String[] {""} ;
      H00EC13_A607MaqEst = new String[] {""} ;
      H00EC13_n607MaqEst = new boolean[] {false} ;
      H00EC13_A13734MaqCDsc = new String[] {""} ;
      H00EC13_A602MaqCod = new String[] {""} ;
      H00EC13_A606MaqDsc = new String[] {""} ;
      H00EC13_n606MaqDsc = new boolean[] {false} ;
      A607MaqEst = "" ;
      A13734MaqCDsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      AV42Tipdefdsc = "" ;
      GXv_char17 = new String[1] ;
      GXv_char15 = new String[1] ;
      sStyleString = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webreoperadosinternoskilosmetrospiezas__default(),
         new Object[] {
             new Object[] {
            H00EC3_A130BarCodPar, H00EC3_A132BarCodReo, H00EC3_A129BarCod, H00EC3_A396EmprCod, H00EC3_A213BarSit, H00EC3_A2009DisTipDis, H00EC3_n2009DisTipDis, H00EC3_A361DisCod, H00EC3_A864BarPes, H00EC3_A1909BarGraAca,
            H00EC3_A125BarAncAca1, H00EC3_A166BarKgm, H00EC3_A184BarMtr, H00EC3_A168BarKgmLan, H00EC3_A186BarMtrLan, H00EC3_A199BarPie1, H00EC3_A365DisDes, H00EC3_A898BarPieNDes
            }
            , new Object[] {
            H00EC5_A166BarKgm, H00EC5_A184BarMtr, H00EC5_A199BarPie1, H00EC5_A898BarPieNDes
            }
            , new Object[] {
            H00EC6_A1261BarAlbKgmE, H00EC6_A1263BarAlbMtrE, H00EC6_A1265BarAlbPie
            }
            , new Object[] {
            H00EC7_A130BarCodPar, H00EC7_A132BarCodReo, H00EC7_A129BarCod, H00EC7_A396EmprCod, H00EC7_A138BarConReo
            }
            , new Object[] {
            H00EC8_A396EmprCod, H00EC8_A8482OpeAct, H00EC8_n8482OpeAct, H00EC8_A13748OpeCNom, H00EC8_A652OpeCod, H00EC8_A653OpeNom, H00EC8_n653OpeNom
            }
            , new Object[] {
            H00EC9_A396EmprCod, H00EC9_A13817Rps_DscID, H00EC9_A7000Rps_Cod, H00EC9_A7001Rps_Dsc, H00EC9_n7001Rps_Dsc
            }
            , new Object[] {
            H00EC10_A396EmprCod, H00EC10_A13816DscCausaID, H00EC10_A5085CodCausa, H00EC10_A5086DscCausa, H00EC10_n5086DscCausa
            }
            , new Object[] {
            H00EC11_A396EmprCod, H00EC11_A13003TipDefAct, H00EC11_n13003TipDefAct, H00EC11_A13819TipdefDscI, H00EC11_A833TipDefCod, H00EC11_A834TipDefDsc, H00EC11_n834TipDefDsc
            }
            , new Object[] {
            H00EC12_A396EmprCod, H00EC12_A13003TipDefAct, H00EC12_n13003TipDefAct, H00EC12_A834TipDefDsc, H00EC12_n834TipDefDsc, H00EC12_A833TipDefCod
            }
            , new Object[] {
            H00EC13_A396EmprCod, H00EC13_A607MaqEst, H00EC13_n607MaqEst, H00EC13_A13734MaqCDsc, H00EC13_A602MaqCod, H00EC13_A606MaqDsc, H00EC13_n606MaqDsc
            }
         }
      );
      AV109Pgmname = "WebReoperadosInternosKilosMetrosPiezas" ;
      /* GeneXus formulas. */
      AV109Pgmname = "WebReoperadosInternosKilosMetrosPiezas" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      edtavBarunimed_Enabled = 0 ;
      edtavBarpes_Enabled = 0 ;
      edtavBargraaca_Enabled = 0 ;
      edtavBarancaca1_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarpie_Enabled = 0 ;
      edtavKilos_Enabled = 0 ;
      edtavMetros_Enabled = 0 ;
      edtavPiezas_Enabled = 0 ;
      edtavKilosdisponible_Enabled = 0 ;
      edtavMetrosdisponible_Enabled = 0 ;
      edtavPiezasdisponible_Enabled = 0 ;
   }

   private byte wcpOAV5Barcodreo ;
   private byte wcpOAV27BarSit ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV5Barcodreo ;
   private byte AV27BarSit ;
   private byte gxajaxcallmode ;
   private byte AV30ConReo ;
   private byte AV64Barsitri ;
   private byte AV23Turno ;
   private byte nDonePA ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A138BarConReo ;
   private byte AV34Barconreo ;
   private byte AV95OUTConReo ;
   private byte GXv_int5[] ;
   private byte GXv_int11[] ;
   private byte GXv_int16[] ;
   private byte nGXWrapped ;
   private short nRcdExists_12 ;
   private short nIsMod_12 ;
   private short nRcdExists_11 ;
   private short nIsMod_11 ;
   private short nRcdExists_10 ;
   private short nIsMod_10 ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short AV80BarPes ;
   private short AV81BarGraAca ;
   private short AV82BarAncAca1 ;
   private short AV50CosPro2 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV24TipDefCod ;
   private short AV25CodCausa ;
   private short AV26Rps_Cod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A864BarPes ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short A199BarPie1 ;
   private short AV58Artextil ;
   private short GXv_int9[] ;
   private short GXv_int14[] ;
   private short A7000Rps_Cod ;
   private short A5085CodCausa ;
   private short A833TipDefCod ;
   private int wcpOAV8Barcod ;
   private int wcpOAV14BarPie ;
   private int NV18BarPie1 ;
   private int AV8Barcod ;
   private int AV14BarPie ;
   private int AV73piezas ;
   private int AV32DisCod ;
   private int edtavBarnhdr_Enabled ;
   private int edtavBarunimed_Enabled ;
   private int edtavBarpes_Enabled ;
   private int edtavBargraaca_Enabled ;
   private int edtavBarancaca1_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int edtavBarpie_Enabled ;
   private int edtavKilos_Enabled ;
   private int edtavMetros_Enabled ;
   private int edtavPiezas_Enabled ;
   private int edtavKilosdisponible_Enabled ;
   private int edtavMetrosdisponible_Enabled ;
   private int AV74piezasdisponible ;
   private int edtavPiezasdisponible_Enabled ;
   private int edtavTurno_Enabled ;
   private int divPanelmasdatos_Visible ;
   private int edtavBarkgm1_Enabled ;
   private int edtavBarmtr1_Enabled ;
   private int AV18BarPie1 ;
   private int edtavBarpie1_Enabled ;
   private int edtavMaqcod_Visible ;
   private int edtavTipdefcod_Visible ;
   private int edtavCodcausa_Visible ;
   private int edtavRps_cod_Visible ;
   private int AV21Opecod ;
   private int edtavOpecod_Visible ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV55DisOriCod ;
   private int c1265BarAlbPie ;
   private int AV77piezasdisponible2 ;
   private int AV85CliCod ;
   private int GXv_int10[] ;
   private int GXv_int6[] ;
   private int GXv_int18[] ;
   private int GXv_int19[] ;
   private int A652OpeCod ;
   private int idxLst ;
   private java.math.BigDecimal wcpOAV12BarKgm ;
   private java.math.BigDecimal wcpOAV13BarMtr ;
   private java.math.BigDecimal wcpOAV37KilAct ;
   private java.math.BigDecimal wcpOAV38MtrAct ;
   private java.math.BigDecimal wcpOAV47BarCosAny ;
   private java.math.BigDecimal wcpOAV46BarCosPro ;
   private java.math.BigDecimal NV16BarKgm1 ;
   private java.math.BigDecimal NV17BarMtr1 ;
   private java.math.BigDecimal AV12BarKgm ;
   private java.math.BigDecimal AV13BarMtr ;
   private java.math.BigDecimal AV37KilAct ;
   private java.math.BigDecimal AV38MtrAct ;
   private java.math.BigDecimal AV47BarCosAny ;
   private java.math.BigDecimal AV46BarCosPro ;
   private java.math.BigDecimal AV71kilos ;
   private java.math.BigDecimal AV72metros ;
   private java.math.BigDecimal AV29Porcen ;
   private java.math.BigDecimal AV56KgmOri ;
   private java.math.BigDecimal AV57MetOri ;
   private java.math.BigDecimal AV48CosPro ;
   private java.math.BigDecimal AV49CosAny ;
   private java.math.BigDecimal AV51CosAny2 ;
   private java.math.BigDecimal AV83Ancho ;
   private java.math.BigDecimal AV75kilosdisponible ;
   private java.math.BigDecimal AV76metrosdisponible ;
   private java.math.BigDecimal AV16BarKgm1 ;
   private java.math.BigDecimal AV17BarMtr1 ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A168BarKgmLan ;
   private java.math.BigDecimal A186BarMtrLan ;
   private java.math.BigDecimal c1261BarAlbKgmE ;
   private java.math.BigDecimal c1263BarAlbMtrE ;
   private java.math.BigDecimal AV78kilosdisponible2 ;
   private java.math.BigDecimal AV79metrosdisponible2 ;
   private java.math.BigDecimal AV44CosProi ;
   private java.math.BigDecimal AV45CosAnyi ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String wcpOAV7Emprcod ;
   private String wcpOAV19BarNHdr ;
   private String wcpOAV6Barcodpar ;
   private String wcpOAV15BarUnimed ;
   private String wcpOAV53prior ;
   private String wcpOAV36UsurCod ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String Combo_opecod_Selectedvalue_get ;
   private String Combo_rps_cod_Selectedvalue_get ;
   private String Combo_codcausa_Selectedvalue_get ;
   private String Combo_tipdefcod_Selectedvalue_get ;
   private String Combo_maqcod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7Emprcod ;
   private String AV19BarNHdr ;
   private String AV6Barcodpar ;
   private String AV15BarUnimed ;
   private String AV53prior ;
   private String AV36UsurCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV20BarNHdrdestino ;
   private String AV109Pgmname ;
   private String AV39Station ;
   private String GXKey ;
   private String AV35Ok ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Combo_maqcod_Cls ;
   private String Combo_maqcod_Selectedvalue_set ;
   private String Combo_tipdefcod_Cls ;
   private String Combo_tipdefcod_Selectedvalue_set ;
   private String Combo_codcausa_Cls ;
   private String Combo_codcausa_Selectedvalue_set ;
   private String Combo_codcausa_Emptyitemtext ;
   private String Combo_rps_cod_Cls ;
   private String Combo_rps_cod_Selectedvalue_set ;
   private String Combo_rps_cod_Emptyitemtext ;
   private String Combo_opecod_Cls ;
   private String Combo_opecod_Selectedvalue_set ;
   private String Combo_opecod_Emptyitemtext ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_panelmasdatos_Width ;
   private String Dvpanel_panelmasdatos_Cls ;
   private String Dvpanel_panelmasdatos_Title ;
   private String Dvpanel_panelmasdatos_Iconposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String TempTags ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnsalir_Internalname ;
   private String bttBtnsalir_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtavBarnhdr_Internalname ;
   private String edtavBarnhdr_Jsonclick ;
   private String edtavBarunimed_Internalname ;
   private String edtavBarunimed_Jsonclick ;
   private String edtavBarpes_Internalname ;
   private String edtavBarpes_Jsonclick ;
   private String edtavBargraaca_Internalname ;
   private String edtavBargraaca_Jsonclick ;
   private String edtavBarancaca1_Internalname ;
   private String edtavBarancaca1_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavBarmtr_Internalname ;
   private String edtavBarmtr_Jsonclick ;
   private String edtavBarpie_Internalname ;
   private String edtavBarpie_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtavKilos_Internalname ;
   private String edtavKilos_Jsonclick ;
   private String edtavMetros_Internalname ;
   private String edtavMetros_Jsonclick ;
   private String edtavPiezas_Internalname ;
   private String edtavPiezas_Jsonclick ;
   private String divUnnamedtable9_Internalname ;
   private String edtavKilosdisponible_Internalname ;
   private String edtavKilosdisponible_Jsonclick ;
   private String edtavMetrosdisponible_Internalname ;
   private String edtavMetrosdisponible_Jsonclick ;
   private String edtavPiezasdisponible_Internalname ;
   private String edtavPiezasdisponible_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divTablesplittedmaqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Jsonclick ;
   private String Combo_maqcod_Caption ;
   private String Combo_maqcod_Internalname ;
   private String divTablesplittedtipdefcod_Internalname ;
   private String lblTextblockcombo_tipdefcod_Internalname ;
   private String lblTextblockcombo_tipdefcod_Jsonclick ;
   private String Combo_tipdefcod_Caption ;
   private String Combo_tipdefcod_Internalname ;
   private String divTablesplittedcodcausa_Internalname ;
   private String lblTextblockcombo_codcausa_Internalname ;
   private String lblTextblockcombo_codcausa_Jsonclick ;
   private String Combo_codcausa_Caption ;
   private String Combo_codcausa_Internalname ;
   private String divTablesplittedrps_cod_Internalname ;
   private String lblTextblockcombo_rps_cod_Internalname ;
   private String lblTextblockcombo_rps_cod_Jsonclick ;
   private String Combo_rps_cod_Caption ;
   private String Combo_rps_cod_Internalname ;
   private String divTablesplittedopecod_Internalname ;
   private String lblTextblockcombo_opecod_Internalname ;
   private String lblTextblockcombo_opecod_Jsonclick ;
   private String Combo_opecod_Caption ;
   private String Combo_opecod_Internalname ;
   private String edtavTurno_Internalname ;
   private String edtavTurno_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String AV28TipReo ;
   private String Dvpanel_panelmasdatos_Internalname ;
   private String divPanelmasdatos_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavBarkgm1_Internalname ;
   private String edtavBarkgm1_Jsonclick ;
   private String edtavBarmtr1_Internalname ;
   private String edtavBarmtr1_Jsonclick ;
   private String edtavBarpie1_Internalname ;
   private String edtavBarpie1_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavMaqcod_Internalname ;
   private String AV22MaqCod ;
   private String edtavMaqcod_Jsonclick ;
   private String edtavTipdefcod_Internalname ;
   private String edtavTipdefcod_Jsonclick ;
   private String edtavCodcausa_Internalname ;
   private String edtavCodcausa_Jsonclick ;
   private String edtavRps_cod_Internalname ;
   private String edtavRps_cod_Jsonclick ;
   private String edtavOpecod_Internalname ;
   private String edtavOpecod_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String hsh ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A2009DisTipDis ;
   private String A365DisDes ;
   private String AV54DisTipDis ;
   private String GXt_char1 ;
   private String AV40EmprNom ;
   private String Gx_msg ;
   private String AV60Maqdsc ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String AV31Codigo ;
   private String AV84PriCod ;
   private String AV86CliNom ;
   private String AV87DisArtCod ;
   private String AV88DisArtDsc ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char12[] ;
   private String A8482OpeAct ;
   private String A653OpeNom ;
   private String A7001Rps_Dsc ;
   private String A5086DscCausa ;
   private String A13003TipDefAct ;
   private String A834TipDefDsc ;
   private String A607MaqEst ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String AV42Tipdefdsc ;
   private String GXv_char17[] ;
   private String GXv_char15[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private java.util.Date AV89DisFec ;
   private java.util.Date GXv_date13[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Combo_maqcod_Emptyitem ;
   private boolean Combo_tipdefcod_Emptyitem ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Dvpanel_panelmasdatos_Autowidth ;
   private boolean Dvpanel_panelmasdatos_Autoheight ;
   private boolean Dvpanel_panelmasdatos_Collapsible ;
   private boolean Dvpanel_panelmasdatos_Collapsed ;
   private boolean Dvpanel_panelmasdatos_Showcollapseicon ;
   private boolean Dvpanel_panelmasdatos_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n2009DisTipDis ;
   private boolean n8482OpeAct ;
   private boolean n653OpeNom ;
   private boolean n7001Rps_Dsc ;
   private boolean n5086DscCausa ;
   private boolean n13003TipDefAct ;
   private boolean n834TipDefDsc ;
   private boolean n607MaqEst ;
   private boolean n606MaqDsc ;
   private String AV52Inc_obs ;
   private String A13748OpeCNom ;
   private String A13817Rps_DscID ;
   private String A13816DscCausaID ;
   private String A13819TipdefDscI ;
   private String A13734MaqCDsc ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipdefcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_codcausa ;
   private com.genexus.webpanels.GXUserControl ucCombo_rps_cod ;
   private com.genexus.webpanels.GXUserControl ucCombo_opecod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelmasdatos ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavTipreo ;
   private IDataStoreProvider pr_default ;
   private String[] H00EC3_A130BarCodPar ;
   private byte[] H00EC3_A132BarCodReo ;
   private int[] H00EC3_A129BarCod ;
   private String[] H00EC3_A396EmprCod ;
   private byte[] H00EC3_A213BarSit ;
   private String[] H00EC3_A2009DisTipDis ;
   private boolean[] H00EC3_n2009DisTipDis ;
   private int[] H00EC3_A361DisCod ;
   private short[] H00EC3_A864BarPes ;
   private short[] H00EC3_A1909BarGraAca ;
   private short[] H00EC3_A125BarAncAca1 ;
   private java.math.BigDecimal[] H00EC3_A166BarKgm ;
   private java.math.BigDecimal[] H00EC3_A184BarMtr ;
   private java.math.BigDecimal[] H00EC3_A168BarKgmLan ;
   private java.math.BigDecimal[] H00EC3_A186BarMtrLan ;
   private short[] H00EC3_A199BarPie1 ;
   private String[] H00EC3_A365DisDes ;
   private int[] H00EC3_A898BarPieNDes ;
   private java.math.BigDecimal[] H00EC5_A166BarKgm ;
   private java.math.BigDecimal[] H00EC5_A184BarMtr ;
   private short[] H00EC5_A199BarPie1 ;
   private int[] H00EC5_A898BarPieNDes ;
   private java.math.BigDecimal[] H00EC6_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] H00EC6_A1263BarAlbMtrE ;
   private int[] H00EC6_A1265BarAlbPie ;
   private String[] H00EC7_A130BarCodPar ;
   private byte[] H00EC7_A132BarCodReo ;
   private int[] H00EC7_A129BarCod ;
   private String[] H00EC7_A396EmprCod ;
   private byte[] H00EC7_A138BarConReo ;
   private String[] H00EC8_A396EmprCod ;
   private String[] H00EC8_A8482OpeAct ;
   private boolean[] H00EC8_n8482OpeAct ;
   private String[] H00EC8_A13748OpeCNom ;
   private int[] H00EC8_A652OpeCod ;
   private String[] H00EC8_A653OpeNom ;
   private boolean[] H00EC8_n653OpeNom ;
   private String[] H00EC9_A396EmprCod ;
   private String[] H00EC9_A13817Rps_DscID ;
   private short[] H00EC9_A7000Rps_Cod ;
   private String[] H00EC9_A7001Rps_Dsc ;
   private boolean[] H00EC9_n7001Rps_Dsc ;
   private String[] H00EC10_A396EmprCod ;
   private String[] H00EC10_A13816DscCausaID ;
   private short[] H00EC10_A5085CodCausa ;
   private String[] H00EC10_A5086DscCausa ;
   private boolean[] H00EC10_n5086DscCausa ;
   private String[] H00EC11_A396EmprCod ;
   private String[] H00EC11_A13003TipDefAct ;
   private boolean[] H00EC11_n13003TipDefAct ;
   private String[] H00EC11_A13819TipdefDscI ;
   private short[] H00EC11_A833TipDefCod ;
   private String[] H00EC11_A834TipDefDsc ;
   private boolean[] H00EC11_n834TipDefDsc ;
   private String[] H00EC12_A396EmprCod ;
   private String[] H00EC12_A13003TipDefAct ;
   private boolean[] H00EC12_n13003TipDefAct ;
   private String[] H00EC12_A834TipDefDsc ;
   private boolean[] H00EC12_n834TipDefDsc ;
   private short[] H00EC12_A833TipDefCod ;
   private String[] H00EC13_A396EmprCod ;
   private String[] H00EC13_A607MaqEst ;
   private boolean[] H00EC13_n607MaqEst ;
   private String[] H00EC13_A13734MaqCDsc ;
   private String[] H00EC13_A602MaqCod ;
   private String[] H00EC13_A606MaqDsc ;
   private boolean[] H00EC13_n606MaqDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV100ObjetoRefrescar ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV65MaqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV67TipDefCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV68CodCausa_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV69Rps_Cod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV70Opecod_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV66Combo_DataItem ;
}

final  class webreoperadosinternoskilosmetrospiezas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00EC3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarSit, T3.DisTipDis, T1.DisCod, T1.BarPes, T1.BarGraAca, T1.BarAncAca1, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgmLan, 0) AS BarKgmLan, COALESCE( T2.BarMtrLan, 0) AS BarMtrLan, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr, SUM(BarKilLan) AS BarKgmLan, SUM(BarMetLan) AS BarMtrLan FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00EC5", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm, COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarPie1, 0) AS BarPie1, COALESCE( T1.BarPieNDes, 0) AS BarPieNDes FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00EC6", "SELECT SUM(BarAlbKgmE), SUM(BarAlbMtrE), SUM(BarAlbPie) FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EC7", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarConReo FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = 0 and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00EC8", "SELECT EmprCod, OpeAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, OpeCod, OpeNom FROM TXPOPERAR WHERE OpeAct = 'A' ORDER BY OpeCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EC9", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(Rps_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Rps_Dsc, ''))) AS Rps_DscID, Rps_Cod, Rps_Dsc FROM TXPCODRPS ORDER BY Rps_DscID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EC10", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(CodCausa,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscCausa, ''))) AS DscCausaID, CodCausa, DscCausa FROM TXPTIPCAU ORDER BY DscCausaID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EC11", "SELECT EmprCod, TipDefAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, TipDefCod, TipDefDsc FROM TXPTIPDEF WHERE TipDefAct = 'S' ORDER BY TipdefDscI ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EC12", "SELECT EmprCod, TipDefAct, TipDefDsc, TipDefCod FROM TXPTIPDEF WHERE TipDefAct = 'S' ORDER BY TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00EC13", "SELECT EmprCod, MaqEst, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, MaqCod, MaqDsc FROM TXPMAQUIN WHERE MaqEst = 'A' ORDER BY MaqCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

