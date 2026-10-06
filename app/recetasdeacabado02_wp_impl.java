package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetasdeacabado02_wp_impl extends GXDataArea
{
   public recetasdeacabado02_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetasdeacabado02_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetasdeacabado02_wp_impl.class ));
   }

   public recetasdeacabado02_wp_impl( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGrupodeaccionesgrid = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid") == 0 )
         {
            gxnrgrid_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid") == 0 )
         {
            gxgrgrid_refresh_invoke( ) ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV6Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6Emprcod", AV6Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV7Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Barcod), 8, 0));
               AV8Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodreo", GXutil.str( AV8Barcodreo, 1, 0));
               AV9Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9Barcodpar", AV9Barcodpar);
               AV11RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11RecLinMaq), 4, 0));
               Gx_mode = httpContext.GetPar( "Mode") ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_129 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_129"))) ;
      nGXsfl_129_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_129_idx"))) ;
      sGXsfl_129_idx = httpContext.GetPar( "sGXsfl_129_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid_newrow( ) ;
      /* End function gxnrGrid_newrow_invoke */
   }

   public void gxgrgrid_refresh_invoke( )
   {
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      AV6Emprcod = httpContext.GetPar( "Emprcod") ;
      AV7Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV8Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV9Barcodpar = httpContext.GetPar( "Barcodpar") ;
      AV11RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
      AV72Procesosdadosdealta = (short)(GXutil.lval( httpContext.GetPar( "Procesosdadosdealta"))) ;
      AV42TFRecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "TFRecLinPro"))) ;
      AV43TFRecLinPro_To = (byte)(GXutil.lval( httpContext.GetPar( "TFRecLinPro_To"))) ;
      AV44TFProForCod = httpContext.GetPar( "TFProForCod") ;
      AV45TFProForCod_Sel = httpContext.GetPar( "TFProForCod_Sel") ;
      AV46TFProForDsc = httpContext.GetPar( "TFProForDsc") ;
      AV47TFProForDsc_Sel = httpContext.GetPar( "TFProForDsc_Sel") ;
      AV48TFRecLin = (short)(GXutil.lval( httpContext.GetPar( "TFRecLin"))) ;
      AV49TFRecLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFRecLin_To"))) ;
      AV50TFRecPrdNum = httpContext.GetPar( "TFRecPrdNum") ;
      AV51TFRecPrdNum_Sel = httpContext.GetPar( "TFRecPrdNum_Sel") ;
      AV52TFRecPrdDsc = httpContext.GetPar( "TFRecPrdDsc") ;
      AV53TFRecPrdDsc_Sel = httpContext.GetPar( "TFRecPrdDsc_Sel") ;
      AV54TFFacCon = CommonUtil.decimalVal( httpContext.GetPar( "TFFacCon"), ".") ;
      AV55TFFacCon_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFacCon_To"), ".") ;
      AV56TFPrdCant = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCant"), ".") ;
      AV57TFPrdCant_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCant_To"), ".") ;
      AV58TFForPrdDsc = httpContext.GetPar( "TFForPrdDsc") ;
      AV59TFForPrdDsc_Sel = httpContext.GetPar( "TFForPrdDsc_Sel") ;
      AV60TFRecForNro = (byte)(GXutil.lval( httpContext.GetPar( "TFRecForNro"))) ;
      AV61TFRecForNro_To = (byte)(GXutil.lval( httpContext.GetPar( "TFRecForNro_To"))) ;
      AV62TFRecPrdTnq = (byte)(GXutil.lval( httpContext.GetPar( "TFRecPrdTnq"))) ;
      AV63TFRecPrdTnq_To = (byte)(GXutil.lval( httpContext.GetPar( "TFRecPrdTnq_To"))) ;
      AV64TFRecLote = httpContext.GetPar( "TFRecLote") ;
      AV65TFRecLote_Sel = httpContext.GetPar( "TFRecLote_Sel") ;
      AV126Pgmname = httpContext.GetPar( "Pgmname") ;
      AV23OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV24OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV77FecPan = localUtil.parseDateParm( httpContext.GetPar( "FecPan")) ;
      AV85Usurcod = httpContext.GetPar( "Usurcod") ;
      AV86Station = httpContext.GetPar( "Station") ;
      AV78MaqVolRes = (int)(GXutil.lval( httpContext.GetPar( "MaqVolRes"))) ;
      AV80VolMul = (short)(GXutil.lval( httpContext.GetPar( "VolMul"))) ;
      AV81RecVolPrdold = (int)(GXutil.lval( httpContext.GetPar( "RecVolPrdold"))) ;
      AV38BarNHdr = httpContext.GetPar( "BarNHdr") ;
      AV79RecTotKgs = CommonUtil.decimalVal( httpContext.GetPar( "RecTotKgs"), ".") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV6Emprcod, AV7Barcod, AV8Barcodreo, AV9Barcodpar, AV11RecLinMaq, AV72Procesosdadosdealta, AV42TFRecLinPro, AV43TFRecLinPro_To, AV44TFProForCod, AV45TFProForCod_Sel, AV46TFProForDsc, AV47TFProForDsc_Sel, AV48TFRecLin, AV49TFRecLin_To, AV50TFRecPrdNum, AV51TFRecPrdNum_Sel, AV52TFRecPrdDsc, AV53TFRecPrdDsc_Sel, AV54TFFacCon, AV55TFFacCon_To, AV56TFPrdCant, AV57TFPrdCant_To, AV58TFForPrdDsc, AV59TFForPrdDsc_Sel, AV60TFRecForNro, AV61TFRecForNro_To, AV62TFRecPrdTnq, AV63TFRecPrdTnq_To, AV64TFRecLote, AV65TFRecLote_Sel, AV126Pgmname, AV23OrderedBy, AV24OrderedDsc, AV77FecPan, AV85Usurcod, AV86Station, AV78MaqVolRes, AV80VolMul, AV81RecVolPrdold, AV38BarNHdr, AV79RecTotKgs) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
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
      pa1HI2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1HI2( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetasdeacabado02_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV9Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV11RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMaq","Gx_mode"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV126Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECPAN", getSecureSignedToken( "", AV77FecPan));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV85Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV86Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQVOLRES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV78MaqVolRes), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV80VolMul), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECVOLPRDOLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81RecVolPrdold), "ZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetasdeAcabado02_WP");
      forbiddenHiddens.add("BarNHdr", GXutil.rtrim( localUtil.format( AV38BarNHdr, "")));
      forbiddenHiddens.add("RecTotKgs", localUtil.format( AV79RecTotKgs, "ZZZZZZ9.99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetasdeacabado02_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_129", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_129, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV70GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV71GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV68DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV68DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCESOSDADOSDEALTA", GXutil.ltrim( localUtil.ntoc( AV72Procesosdadosdealta, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV6Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV7Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV8Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV9Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLINPRO", GXutil.ltrim( localUtil.ntoc( AV42TFRecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLINPRO_TO", GXutil.ltrim( localUtil.ntoc( AV43TFRecLinPro_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORCOD", GXutil.rtrim( AV44TFProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORCOD_SEL", GXutil.rtrim( AV45TFProForCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORDSC", GXutil.rtrim( AV46TFProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORDSC_SEL", GXutil.rtrim( AV47TFProForDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLIN", GXutil.ltrim( localUtil.ntoc( AV48TFRecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLIN_TO", GXutil.ltrim( localUtil.ntoc( AV49TFRecLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDNUM", GXutil.rtrim( AV50TFRecPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDNUM_SEL", GXutil.rtrim( AV51TFRecPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDDSC", GXutil.rtrim( AV52TFRecPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDDSC_SEL", GXutil.rtrim( AV53TFRecPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACCON", GXutil.ltrim( localUtil.ntoc( AV54TFFacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACCON_TO", GXutil.ltrim( localUtil.ntoc( AV55TFFacCon_To, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANT", GXutil.ltrim( localUtil.ntoc( AV56TFPrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANT_TO", GXutil.ltrim( localUtil.ntoc( AV57TFPrdCant_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC", GXutil.rtrim( AV58TFForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC_SEL", GXutil.rtrim( AV59TFForPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECFORNRO", GXutil.ltrim( localUtil.ntoc( AV60TFRecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECFORNRO_TO", GXutil.ltrim( localUtil.ntoc( AV61TFRecForNro_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDTNQ", GXutil.ltrim( localUtil.ntoc( AV62TFRecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDTNQ_TO", GXutil.ltrim( localUtil.ntoc( AV63TFRecPrdTnq_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLOTE", GXutil.rtrim( AV64TFRecLote));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLOTE_SEL", GXutil.rtrim( AV65TFRecLote_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV126Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV126Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV23OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV24OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vFECPAN", localUtil.dtoc( AV77FecPan, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECPAN", getSecureSignedToken( "", AV77FecPan));
      app.GxWebStd.gx_hidden_field( httpContext, "RECHDRLTS", GXutil.rtrim( A9812RecHdrLts));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLTSSR", GXutil.ltrim( localUtil.ntoc( A9764RecLtsSR, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV85Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV85Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV86Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV86Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV84ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQVOLRES", GXutil.ltrim( localUtil.ntoc( AV78MaqVolRes, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQVOLRES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV78MaqVolRes), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLMUL", GXutil.ltrim( localUtil.ntoc( AV80VolMul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV80VolMul), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECVOLPRDOLD", GXutil.ltrim( localUtil.ntoc( AV81RecVolPrdold, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECVOLPRDOLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81RecVolPrdold), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF2", GXutil.rtrim( AV88Modif2));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD_SELECTED", GXutil.rtrim( AV119Emprcod_selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV120Barcod_selected, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO_SELECTED", GXutil.ltrim( localUtil.ntoc( AV121Barcodreo_selected, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR_SELECTED", GXutil.rtrim( AV122Barcodpar_selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ_SELECTED", GXutil.ltrim( localUtil.ntoc( AV123Reclinmaq_selected, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINPRO_SELECTED", GXutil.ltrim( localUtil.ntoc( AV124Reclinpro_selected, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLIN_SELECTED", GXutil.ltrim( localUtil.ntoc( AV125Reclin_selected, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Title", GXutil.rtrim( Dvelop_confirmpanel_elimimarproceso_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_elimimarproceso_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_elimimarproceso_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_elimimarproceso_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_elimimarproceso_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_elimimarproceso_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_elimimarproceso_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Title", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Result", GXutil.rtrim( Dvelop_confirmpanel_elimimarproceso_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Result", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Result", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Result));
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
         we1HI2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1HI2( ) ;
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
      return formatLink("app.recetasdeacabado02_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV9Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV11RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMaq","Gx_mode"})  ;
   }

   public String getPgmname( )
   {
      return "RecetasdeAcabado02_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recetas de Acabado (Mto)", "") ;
   }

   public void wb1HI0( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMain", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnhdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnhdr_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'" + sGXsfl_129_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV38BarNHdr), GXutil.rtrim( localUtil.format( AV38BarNHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,19);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeAcabado02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavReclinmaq_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavReclinmaq_Internalname, httpContext.getMessage( "Nº Rec.  Int.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavReclinmaq_Internalname, GXutil.ltrim( localUtil.ntoc( AV11RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavReclinmaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11RecLinMaq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV11RecLinMaq), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavReclinmaq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavReclinmaq_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavModo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavModo_Internalname, httpContext.getMessage( "Modo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_129_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavModo_Internalname, GXutil.rtrim( AV39Modo), GXutil.rtrim( localUtil.format( AV39Modo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavModo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavModo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeAcabado02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavModif_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavModif_Internalname, httpContext.getMessage( "Variable Control (Modif)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_129_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavModif_Internalname, GXutil.rtrim( AV40Modif), GXutil.rtrim( localUtil.format( AV40Modif, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavModif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavModif_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeAcabado02_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_129_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV33CliNom), GXutil.rtrim( localUtil.format( AV33CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeAcabado02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_129_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV34BarSer), GXutil.rtrim( localUtil.format( AV34BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeAcabado02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_129_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV35BarColNom), GXutil.rtrim( localUtil.format( AV35BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeAcabado02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_129_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV36BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV36BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV36BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartipcol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBartipcol_Internalname, httpContext.getMessage( "TC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_129_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipcol_Internalname, GXutil.ltrim( localUtil.ntoc( AV37BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBartipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV37BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV37BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipcol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartipcol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado02_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmaqcod_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblockmaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_RecetasdeAcabado02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_71_1HI2( true) ;
      }
      else
      {
         wb_table1_71_1HI2( false) ;
      }
      return  ;
   }

   public void wb_table1_71_1HI2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRectotkgs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRectotkgs_Internalname, httpContext.getMessage( "Tot Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_129_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRectotkgs_Internalname, GXutil.ltrim( localUtil.ntoc( AV79RecTotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRectotkgs_Enabled!=0) ? localUtil.format( AV79RecTotKgs, "ZZZZZZ9.99") : localUtil.format( AV79RecTotKgs, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRectotkgs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRectotkgs_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecfa_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecfa_Internalname, httpContext.getMessage( "Factor Absorcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_129_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecfa_Internalname, GXutil.ltrim( localUtil.ntoc( AV12RecFA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRecfa_Enabled!=0) ? localUtil.format( AV12RecFA, "ZZ9.99") : localUtil.format( AV12RecFA, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecfa_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecfa_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecvolprd_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecvolprd_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_129_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecvolprd_Internalname, GXutil.ltrim( localUtil.ntoc( AV13RecVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRecvolprd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13RecVolPrd), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13RecVolPrd), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecvolprd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecvolprd_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado02_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 129, 3, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Receta", ""), bttBtneliminar_Jsonclick, 7, httpContext.getMessage( "Eliminar Receta", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111hi1_client"+"'", TempTags, "", 2, "HLP_RecetasdeAcabado02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimir_Internalname, "gx.evt.setGridEvt("+GXutil.str( 129, 3, 0)+","+"null"+");", httpContext.getMessage( "Imprimir", ""), bttBtnimprimir_Jsonclick, 5, httpContext.getMessage( "Imprimir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOIMPRIMIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeAcabado02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 129, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeAcabado02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 129, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 7, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121hi1_client"+"'", TempTags, "", 2, "HLP_RecetasdeAcabado02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnadd_Internalname, "gx.evt.setGridEvt("+GXutil.str( 129, 3, 0)+","+"null"+");", httpContext.getMessage( "Agregar Procesos", ""), bttBtnadd_Jsonclick, 5, httpContext.getMessage( "Agregar Procesos", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOADD\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeAcabado02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarprocesos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 129, 3, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Procesos", ""), bttBtneliminarprocesos_Jsonclick, 5, httpContext.getMessage( "Eliminar Procesos", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOELIMINARPROCESOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeAcabado02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol129( ) ;
      }
      if ( wbEnd == 129 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_129 = (int)(nGXsfl_129_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridpaginationbar.setProperty("Class", Gridpaginationbar_Class);
         ucGridpaginationbar.setProperty("ShowFirst", Gridpaginationbar_Showfirst);
         ucGridpaginationbar.setProperty("ShowPrevious", Gridpaginationbar_Showprevious);
         ucGridpaginationbar.setProperty("ShowNext", Gridpaginationbar_Shownext);
         ucGridpaginationbar.setProperty("ShowLast", Gridpaginationbar_Showlast);
         ucGridpaginationbar.setProperty("PagesToShow", Gridpaginationbar_Pagestoshow);
         ucGridpaginationbar.setProperty("PagingButtonsPosition", Gridpaginationbar_Pagingbuttonsposition);
         ucGridpaginationbar.setProperty("PagingCaptionPosition", Gridpaginationbar_Pagingcaptionposition);
         ucGridpaginationbar.setProperty("EmptyGridClass", Gridpaginationbar_Emptygridclass);
         ucGridpaginationbar.setProperty("RowsPerPageSelector", Gridpaginationbar_Rowsperpageselector);
         ucGridpaginationbar.setProperty("RowsPerPageOptions", Gridpaginationbar_Rowsperpageoptions);
         ucGridpaginationbar.setProperty("Previous", Gridpaginationbar_Previous);
         ucGridpaginationbar.setProperty("Next", Gridpaginationbar_Next);
         ucGridpaginationbar.setProperty("Caption", Gridpaginationbar_Caption);
         ucGridpaginationbar.setProperty("EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
         ucGridpaginationbar.setProperty("RowsPerPageCaption", Gridpaginationbar_Rowsperpagecaption);
         ucGridpaginationbar.setProperty("CurrentPage", AV70GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV71GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV68DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'" + sGXsfl_129_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV32CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado02_WP.htm");
         wb_table2_167_1HI2( true) ;
      }
      else
      {
         wb_table2_167_1HI2( false) ;
      }
      return  ;
   }

   public void wb_table2_167_1HI2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_172_1HI2( true) ;
      }
      else
      {
         wb_table3_172_1HI2( false) ;
      }
      return  ;
   }

   public void wb_table3_172_1HI2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_177_1HI2( true) ;
      }
      else
      {
         wb_table4_177_1HI2( false) ;
      }
      return  ;
   }

   public void wb_table4_177_1HI2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_182_1HI2( true) ;
      }
      else
      {
         wb_table5_182_1HI2( false) ;
      }
      return  ;
   }

   public void wb_table5_182_1HI2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 129 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1HI2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Recetas de Acabado (Mto)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1HI0( ) ;
   }

   public void ws1HI2( )
   {
      start1HI2( ) ;
      evt1HI2( ) ;
   }

   public void evt1HI2( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131HI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141HI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151HI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161HI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e171HI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CERRAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e181HI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOADD'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoAdd' */
                           e191HI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOELIMINARPROCESOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoEliminarProcesos' */
                           e201HI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e211HI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VRECFA.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e221HI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VRECVOLPRD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e231HI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMAQCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e241HI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOIMPRIMIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoImprimir' */
                           e251HI2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_129_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_129_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_129_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1292( ) ;
                           cmbavGrupodeaccionesgrid.setName( cmbavGrupodeaccionesgrid.getInternalname() );
                           cmbavGrupodeaccionesgrid.setValue( httpContext.cgiGet( cmbavGrupodeaccionesgrid.getInternalname()) );
                           AV74GrupodeaccionesGrid = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeaccionesgrid.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeaccionesgrid.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74GrupodeaccionesGrid), 4, 0));
                           A1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
                           A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
                           A811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A872RecPrdNum = httpContext.cgiGet( edtRecPrdNum_Internalname) ;
                           A875RecPrdDsc = httpContext.cgiGet( edtRecPrdDsc_Internalname) ;
                           A431FacCon = localUtil.ctond( httpContext.cgiGet( edtFacCon_Internalname)) ;
                           A686PrdCant = localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)) ;
                           A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
                           n488ForPrdDsc = false ;
                           A2394RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3274RecPrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5725RecLote = httpContext.cgiGet( edtRecLote_Internalname) ;
                           A13232PrdRGB = localUtil.ctol( httpContext.cgiGet( edtPrdRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDRGB");
                              GX_FocusControl = edtavPrdrgb_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV25PrdRGB = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25PrdRGB), 10, 0));
                           }
                           else
                           {
                              AV25PrdRGB = localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25PrdRGB), 10, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR");
                              GX_FocusControl = edtavR_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV26R = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26R), 3, 0));
                           }
                           else
                           {
                              AV26R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26R), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG");
                              GX_FocusControl = edtavG_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV27G = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27G), 3, 0));
                           }
                           else
                           {
                              AV27G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27G), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB");
                              GX_FocusControl = edtavB_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV28B = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28B), 3, 0));
                           }
                           else
                           {
                              AV28B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28B), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR2");
                              GX_FocusControl = edtavR2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV29R2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29R2), 3, 0));
                           }
                           else
                           {
                              AV29R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29R2), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG2");
                              GX_FocusControl = edtavG2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV30G2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30G2), 3, 0));
                           }
                           else
                           {
                              AV30G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30G2), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB2");
                              GX_FocusControl = edtavB2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV31B2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31B2), 3, 0));
                           }
                           else
                           {
                              AV31B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31B2), 3, 0));
                           }
                           A6018ProForFab = httpContext.cgiGet( edtProForFab_Internalname) ;
                           n6018ProForFab = false ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           n719PrdNum = false ;
                           A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n490ForPrdUMe = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e261HI2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e271HI2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e281HI2 ();
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1HI2( )
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

   public void pa1HI2( )
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
            GX_FocusControl = edtavBarnhdr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1292( ) ;
      while ( nGXsfl_129_idx <= nRC_GXsfl_129 )
      {
         sendrow_1292( ) ;
         nGXsfl_129_idx = ((subGrid_Islastpage==1)&&(nGXsfl_129_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_129_idx+1) ;
         sGXsfl_129_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_129_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1292( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV6Emprcod ,
                                 int AV7Barcod ,
                                 byte AV8Barcodreo ,
                                 String AV9Barcodpar ,
                                 short AV11RecLinMaq ,
                                 short AV72Procesosdadosdealta ,
                                 byte AV42TFRecLinPro ,
                                 byte AV43TFRecLinPro_To ,
                                 String AV44TFProForCod ,
                                 String AV45TFProForCod_Sel ,
                                 String AV46TFProForDsc ,
                                 String AV47TFProForDsc_Sel ,
                                 short AV48TFRecLin ,
                                 short AV49TFRecLin_To ,
                                 String AV50TFRecPrdNum ,
                                 String AV51TFRecPrdNum_Sel ,
                                 String AV52TFRecPrdDsc ,
                                 String AV53TFRecPrdDsc_Sel ,
                                 java.math.BigDecimal AV54TFFacCon ,
                                 java.math.BigDecimal AV55TFFacCon_To ,
                                 java.math.BigDecimal AV56TFPrdCant ,
                                 java.math.BigDecimal AV57TFPrdCant_To ,
                                 String AV58TFForPrdDsc ,
                                 String AV59TFForPrdDsc_Sel ,
                                 byte AV60TFRecForNro ,
                                 byte AV61TFRecForNro_To ,
                                 byte AV62TFRecPrdTnq ,
                                 byte AV63TFRecPrdTnq_To ,
                                 String AV64TFRecLote ,
                                 String AV65TFRecLote_Sel ,
                                 String AV126Pgmname ,
                                 short AV23OrderedBy ,
                                 boolean AV24OrderedDsc ,
                                 java.util.Date AV77FecPan ,
                                 String AV85Usurcod ,
                                 String AV86Station ,
                                 int AV78MaqVolRes ,
                                 short AV80VolMul ,
                                 int AV81RecVolPrdold ,
                                 String AV38BarNHdr ,
                                 java.math.BigDecimal AV79RecTotKgs )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e271HI2 ();
      GRID_nCurrentRecord = 0 ;
      rf1HI2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetasdeAcabado02_WP");
      forbiddenHiddens.add("BarNHdr", GXutil.rtrim( localUtil.format( AV38BarNHdr, "")));
      forbiddenHiddens.add("RecTotKgs", localUtil.format( AV79RecTotKgs, "ZZZZZZ9.99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetasdeacabado02_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLINPRO", GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLIN", GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), ".", "")));
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
      rf1HI2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV126Pgmname = "RecetasdeAcabado02_WP" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavReclinmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinmaq_Enabled), 5, 0), true);
      edtavModo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModo_Enabled), 5, 0), true);
      edtavModif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModif_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipcol_Enabled), 5, 0), true);
      edtavRectotkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotkgs_Enabled), 5, 0), true);
      edtavPrdrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdrgb_Enabled), 5, 0), !bGXsfl_129_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_129_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_129_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_129_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_129_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_129_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_129_Refreshing);
      imgPrompt_maqcod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.tmaqui1prompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vMAQCOD"+"'), id:'"+"vMAQCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vMAQDSC"+"'), id:'"+"vMAQDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_maqcod_Internalname, "Link", imgPrompt_maqcod_Link, true);
   }

   public void rf1HI2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(129) ;
      /* Execute user event: Refresh */
      e271HI2 ();
      nGXsfl_129_idx = 1 ;
      sGXsfl_129_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_129_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1292( ) ;
      bGXsfl_129_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1292( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(AV95Recetasdeacabado02_wpds_1_tfreclinpro) ,
                                              Byte.valueOf(AV96Recetasdeacabado02_wpds_2_tfreclinpro_to) ,
                                              AV98Recetasdeacabado02_wpds_4_tfproforcod_sel ,
                                              AV97Recetasdeacabado02_wpds_3_tfproforcod ,
                                              AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel ,
                                              AV99Recetasdeacabado02_wpds_5_tfprofordsc ,
                                              Short.valueOf(AV101Recetasdeacabado02_wpds_7_tfreclin) ,
                                              Short.valueOf(AV102Recetasdeacabado02_wpds_8_tfreclin_to) ,
                                              AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel ,
                                              AV103Recetasdeacabado02_wpds_9_tfrecprdnum ,
                                              AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel ,
                                              AV105Recetasdeacabado02_wpds_11_tfrecprddsc ,
                                              AV107Recetasdeacabado02_wpds_13_tffaccon ,
                                              AV108Recetasdeacabado02_wpds_14_tffaccon_to ,
                                              AV109Recetasdeacabado02_wpds_15_tfprdcant ,
                                              AV110Recetasdeacabado02_wpds_16_tfprdcant_to ,
                                              AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel ,
                                              AV111Recetasdeacabado02_wpds_17_tfforprddsc ,
                                              Byte.valueOf(AV113Recetasdeacabado02_wpds_19_tfrecfornro) ,
                                              Byte.valueOf(AV114Recetasdeacabado02_wpds_20_tfrecfornro_to) ,
                                              Byte.valueOf(AV115Recetasdeacabado02_wpds_21_tfrecprdtnq) ,
                                              Byte.valueOf(AV116Recetasdeacabado02_wpds_22_tfrecprdtnq_to) ,
                                              AV118Recetasdeacabado02_wpds_24_tfreclote_sel ,
                                              AV117Recetasdeacabado02_wpds_23_tfreclote ,
                                              Byte.valueOf(A1273RecLinPro) ,
                                              A764ProForCod ,
                                              A766ProForDsc ,
                                              Short.valueOf(A811RecLin) ,
                                              A872RecPrdNum ,
                                              A875RecPrdDsc ,
                                              A431FacCon ,
                                              A686PrdCant ,
                                              A488ForPrdDsc ,
                                              Byte.valueOf(A2394RecForNro) ,
                                              Byte.valueOf(A3274RecPrdTnq) ,
                                              A5725RecLote ,
                                              Short.valueOf(AV23OrderedBy) ,
                                              Boolean.valueOf(AV24OrderedDsc) ,
                                              AV6Emprcod ,
                                              Integer.valueOf(AV7Barcod) ,
                                              Byte.valueOf(AV8Barcodreo) ,
                                              AV9Barcodpar ,
                                              Short.valueOf(AV11RecLinMaq) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Short.valueOf(A2804RecLinMaq) } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                              }
         });
         lV97Recetasdeacabado02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV97Recetasdeacabado02_wpds_3_tfproforcod), 6, "%") ;
         lV99Recetasdeacabado02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV99Recetasdeacabado02_wpds_5_tfprofordsc), 30, "%") ;
         lV103Recetasdeacabado02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV103Recetasdeacabado02_wpds_9_tfrecprdnum), 6, "%") ;
         lV105Recetasdeacabado02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV105Recetasdeacabado02_wpds_11_tfrecprddsc), 26, "%") ;
         lV111Recetasdeacabado02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV111Recetasdeacabado02_wpds_17_tfforprddsc), 5, "%") ;
         lV117Recetasdeacabado02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV117Recetasdeacabado02_wpds_23_tfreclote), 26, "%") ;
         /* Using cursor H01HI2 */
         pr_default.execute(0, new Object[] {AV6Emprcod, Integer.valueOf(AV7Barcod), Byte.valueOf(AV8Barcodreo), AV9Barcodpar, Short.valueOf(AV11RecLinMaq), Byte.valueOf(AV95Recetasdeacabado02_wpds_1_tfreclinpro), Byte.valueOf(AV96Recetasdeacabado02_wpds_2_tfreclinpro_to), lV97Recetasdeacabado02_wpds_3_tfproforcod, AV98Recetasdeacabado02_wpds_4_tfproforcod_sel, lV99Recetasdeacabado02_wpds_5_tfprofordsc, AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel, Short.valueOf(AV101Recetasdeacabado02_wpds_7_tfreclin), Short.valueOf(AV102Recetasdeacabado02_wpds_8_tfreclin_to), lV103Recetasdeacabado02_wpds_9_tfrecprdnum, AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel, lV105Recetasdeacabado02_wpds_11_tfrecprddsc, AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel, AV107Recetasdeacabado02_wpds_13_tffaccon, AV108Recetasdeacabado02_wpds_14_tffaccon_to, AV109Recetasdeacabado02_wpds_15_tfprdcant, AV110Recetasdeacabado02_wpds_16_tfprdcant_to, lV111Recetasdeacabado02_wpds_17_tfforprddsc, AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV113Recetasdeacabado02_wpds_19_tfrecfornro), Byte.valueOf(AV114Recetasdeacabado02_wpds_20_tfrecfornro_to), Byte.valueOf(AV115Recetasdeacabado02_wpds_21_tfrecprdtnq), Byte.valueOf(AV116Recetasdeacabado02_wpds_22_tfrecprdtnq_to), lV117Recetasdeacabado02_wpds_23_tfreclote, AV118Recetasdeacabado02_wpds_24_tfreclote_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_129_idx = 1 ;
         sGXsfl_129_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_129_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1292( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A9812RecHdrLts = H01HI2_A9812RecHdrLts[0] ;
            n9812RecHdrLts = H01HI2_n9812RecHdrLts[0] ;
            A9764RecLtsSR = H01HI2_A9764RecLtsSR[0] ;
            n9764RecLtsSR = H01HI2_n9764RecLtsSR[0] ;
            A490ForPrdUMe = H01HI2_A490ForPrdUMe[0] ;
            n490ForPrdUMe = H01HI2_n490ForPrdUMe[0] ;
            A719PrdNum = H01HI2_A719PrdNum[0] ;
            n719PrdNum = H01HI2_n719PrdNum[0] ;
            A2804RecLinMaq = H01HI2_A2804RecLinMaq[0] ;
            A130BarCodPar = H01HI2_A130BarCodPar[0] ;
            A132BarCodReo = H01HI2_A132BarCodReo[0] ;
            A129BarCod = H01HI2_A129BarCod[0] ;
            A396EmprCod = H01HI2_A396EmprCod[0] ;
            A6018ProForFab = H01HI2_A6018ProForFab[0] ;
            n6018ProForFab = H01HI2_n6018ProForFab[0] ;
            A13232PrdRGB = H01HI2_A13232PrdRGB[0] ;
            A5725RecLote = H01HI2_A5725RecLote[0] ;
            A3274RecPrdTnq = H01HI2_A3274RecPrdTnq[0] ;
            A2394RecForNro = H01HI2_A2394RecForNro[0] ;
            A488ForPrdDsc = H01HI2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01HI2_n488ForPrdDsc[0] ;
            A686PrdCant = H01HI2_A686PrdCant[0] ;
            A431FacCon = H01HI2_A431FacCon[0] ;
            A875RecPrdDsc = H01HI2_A875RecPrdDsc[0] ;
            A872RecPrdNum = H01HI2_A872RecPrdNum[0] ;
            A811RecLin = H01HI2_A811RecLin[0] ;
            A766ProForDsc = H01HI2_A766ProForDsc[0] ;
            A764ProForCod = H01HI2_A764ProForCod[0] ;
            A1273RecLinPro = H01HI2_A1273RecLinPro[0] ;
            A13232PrdRGB = H01HI2_A13232PrdRGB[0] ;
            A488ForPrdDsc = H01HI2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01HI2_n488ForPrdDsc[0] ;
            A9812RecHdrLts = H01HI2_A9812RecHdrLts[0] ;
            n9812RecHdrLts = H01HI2_n9812RecHdrLts[0] ;
            A9764RecLtsSR = H01HI2_A9764RecLtsSR[0] ;
            n9764RecLtsSR = H01HI2_n9764RecLtsSR[0] ;
            A764ProForCod = H01HI2_A764ProForCod[0] ;
            A6018ProForFab = H01HI2_A6018ProForFab[0] ;
            n6018ProForFab = H01HI2_n6018ProForFab[0] ;
            A766ProForDsc = H01HI2_A766ProForDsc[0] ;
            e281HI2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(129) ;
         wb1HI0( ) ;
      }
      bGXsfl_129_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1HI2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV126Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV126Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECLINPRO"+"_"+sGXsfl_129_idx, getSecureSignedToken( sGXsfl_129_idx, localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECLIN"+"_"+sGXsfl_129_idx, getSecureSignedToken( sGXsfl_129_idx, localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECPAN", localUtil.dtoc( AV77FecPan, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECPAN", getSecureSignedToken( "", AV77FecPan));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV85Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV85Usurcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV86Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV86Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQVOLRES", GXutil.ltrim( localUtil.ntoc( AV78MaqVolRes, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQVOLRES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV78MaqVolRes), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLMUL", GXutil.ltrim( localUtil.ntoc( AV80VolMul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV80VolMul), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECVOLPRDOLD", GXutil.ltrim( localUtil.ntoc( AV81RecVolPrdold, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECVOLPRDOLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81RecVolPrdold), "ZZZZ9")));
   }

   public int subgrid_fnc_pagecount( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public int subgrid_fnc_recordcount( )
   {
      AV95Recetasdeacabado02_wpds_1_tfreclinpro = AV42TFRecLinPro ;
      AV96Recetasdeacabado02_wpds_2_tfreclinpro_to = AV43TFRecLinPro_To ;
      AV97Recetasdeacabado02_wpds_3_tfproforcod = AV44TFProForCod ;
      AV98Recetasdeacabado02_wpds_4_tfproforcod_sel = AV45TFProForCod_Sel ;
      AV99Recetasdeacabado02_wpds_5_tfprofordsc = AV46TFProForDsc ;
      AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel = AV47TFProForDsc_Sel ;
      AV101Recetasdeacabado02_wpds_7_tfreclin = AV48TFRecLin ;
      AV102Recetasdeacabado02_wpds_8_tfreclin_to = AV49TFRecLin_To ;
      AV103Recetasdeacabado02_wpds_9_tfrecprdnum = AV50TFRecPrdNum ;
      AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel = AV51TFRecPrdNum_Sel ;
      AV105Recetasdeacabado02_wpds_11_tfrecprddsc = AV52TFRecPrdDsc ;
      AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel = AV53TFRecPrdDsc_Sel ;
      AV107Recetasdeacabado02_wpds_13_tffaccon = AV54TFFacCon ;
      AV108Recetasdeacabado02_wpds_14_tffaccon_to = AV55TFFacCon_To ;
      AV109Recetasdeacabado02_wpds_15_tfprdcant = AV56TFPrdCant ;
      AV110Recetasdeacabado02_wpds_16_tfprdcant_to = AV57TFPrdCant_To ;
      AV111Recetasdeacabado02_wpds_17_tfforprddsc = AV58TFForPrdDsc ;
      AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV113Recetasdeacabado02_wpds_19_tfrecfornro = AV60TFRecForNro ;
      AV114Recetasdeacabado02_wpds_20_tfrecfornro_to = AV61TFRecForNro_To ;
      AV115Recetasdeacabado02_wpds_21_tfrecprdtnq = AV62TFRecPrdTnq ;
      AV116Recetasdeacabado02_wpds_22_tfrecprdtnq_to = AV63TFRecPrdTnq_To ;
      AV117Recetasdeacabado02_wpds_23_tfreclote = AV64TFRecLote ;
      AV118Recetasdeacabado02_wpds_24_tfreclote_sel = AV65TFRecLote_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV95Recetasdeacabado02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV96Recetasdeacabado02_wpds_2_tfreclinpro_to) ,
                                           AV98Recetasdeacabado02_wpds_4_tfproforcod_sel ,
                                           AV97Recetasdeacabado02_wpds_3_tfproforcod ,
                                           AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel ,
                                           AV99Recetasdeacabado02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV101Recetasdeacabado02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV102Recetasdeacabado02_wpds_8_tfreclin_to) ,
                                           AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel ,
                                           AV103Recetasdeacabado02_wpds_9_tfrecprdnum ,
                                           AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel ,
                                           AV105Recetasdeacabado02_wpds_11_tfrecprddsc ,
                                           AV107Recetasdeacabado02_wpds_13_tffaccon ,
                                           AV108Recetasdeacabado02_wpds_14_tffaccon_to ,
                                           AV109Recetasdeacabado02_wpds_15_tfprdcant ,
                                           AV110Recetasdeacabado02_wpds_16_tfprdcant_to ,
                                           AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel ,
                                           AV111Recetasdeacabado02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV113Recetasdeacabado02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV114Recetasdeacabado02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV115Recetasdeacabado02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV116Recetasdeacabado02_wpds_22_tfrecprdtnq_to) ,
                                           AV118Recetasdeacabado02_wpds_24_tfreclote_sel ,
                                           AV117Recetasdeacabado02_wpds_23_tfreclote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           Short.valueOf(AV23OrderedBy) ,
                                           Boolean.valueOf(AV24OrderedDsc) ,
                                           AV6Emprcod ,
                                           Integer.valueOf(AV7Barcod) ,
                                           Byte.valueOf(AV8Barcodreo) ,
                                           AV9Barcodpar ,
                                           Short.valueOf(AV11RecLinMaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV97Recetasdeacabado02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV97Recetasdeacabado02_wpds_3_tfproforcod), 6, "%") ;
      lV99Recetasdeacabado02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV99Recetasdeacabado02_wpds_5_tfprofordsc), 30, "%") ;
      lV103Recetasdeacabado02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV103Recetasdeacabado02_wpds_9_tfrecprdnum), 6, "%") ;
      lV105Recetasdeacabado02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV105Recetasdeacabado02_wpds_11_tfrecprddsc), 26, "%") ;
      lV111Recetasdeacabado02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV111Recetasdeacabado02_wpds_17_tfforprddsc), 5, "%") ;
      lV117Recetasdeacabado02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV117Recetasdeacabado02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor H01HI3 */
      pr_default.execute(1, new Object[] {AV6Emprcod, Integer.valueOf(AV7Barcod), Byte.valueOf(AV8Barcodreo), AV9Barcodpar, Short.valueOf(AV11RecLinMaq), Byte.valueOf(AV95Recetasdeacabado02_wpds_1_tfreclinpro), Byte.valueOf(AV96Recetasdeacabado02_wpds_2_tfreclinpro_to), lV97Recetasdeacabado02_wpds_3_tfproforcod, AV98Recetasdeacabado02_wpds_4_tfproforcod_sel, lV99Recetasdeacabado02_wpds_5_tfprofordsc, AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel, Short.valueOf(AV101Recetasdeacabado02_wpds_7_tfreclin), Short.valueOf(AV102Recetasdeacabado02_wpds_8_tfreclin_to), lV103Recetasdeacabado02_wpds_9_tfrecprdnum, AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel, lV105Recetasdeacabado02_wpds_11_tfrecprddsc, AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel, AV107Recetasdeacabado02_wpds_13_tffaccon, AV108Recetasdeacabado02_wpds_14_tffaccon_to, AV109Recetasdeacabado02_wpds_15_tfprdcant, AV110Recetasdeacabado02_wpds_16_tfprdcant_to, lV111Recetasdeacabado02_wpds_17_tfforprddsc, AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV113Recetasdeacabado02_wpds_19_tfrecfornro), Byte.valueOf(AV114Recetasdeacabado02_wpds_20_tfrecfornro_to), Byte.valueOf(AV115Recetasdeacabado02_wpds_21_tfrecprdtnq), Byte.valueOf(AV116Recetasdeacabado02_wpds_22_tfrecprdtnq_to), lV117Recetasdeacabado02_wpds_23_tfreclote, AV118Recetasdeacabado02_wpds_24_tfreclote_sel});
      GRID_nRecordCount = H01HI3_AGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID_nRecordCount) ;
   }

   public int subgrid_fnc_recordsperpage( )
   {
      if ( subGrid_Rows > 0 )
      {
         return subGrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public short subgrid_firstpage( )
   {
      AV95Recetasdeacabado02_wpds_1_tfreclinpro = AV42TFRecLinPro ;
      AV96Recetasdeacabado02_wpds_2_tfreclinpro_to = AV43TFRecLinPro_To ;
      AV97Recetasdeacabado02_wpds_3_tfproforcod = AV44TFProForCod ;
      AV98Recetasdeacabado02_wpds_4_tfproforcod_sel = AV45TFProForCod_Sel ;
      AV99Recetasdeacabado02_wpds_5_tfprofordsc = AV46TFProForDsc ;
      AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel = AV47TFProForDsc_Sel ;
      AV101Recetasdeacabado02_wpds_7_tfreclin = AV48TFRecLin ;
      AV102Recetasdeacabado02_wpds_8_tfreclin_to = AV49TFRecLin_To ;
      AV103Recetasdeacabado02_wpds_9_tfrecprdnum = AV50TFRecPrdNum ;
      AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel = AV51TFRecPrdNum_Sel ;
      AV105Recetasdeacabado02_wpds_11_tfrecprddsc = AV52TFRecPrdDsc ;
      AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel = AV53TFRecPrdDsc_Sel ;
      AV107Recetasdeacabado02_wpds_13_tffaccon = AV54TFFacCon ;
      AV108Recetasdeacabado02_wpds_14_tffaccon_to = AV55TFFacCon_To ;
      AV109Recetasdeacabado02_wpds_15_tfprdcant = AV56TFPrdCant ;
      AV110Recetasdeacabado02_wpds_16_tfprdcant_to = AV57TFPrdCant_To ;
      AV111Recetasdeacabado02_wpds_17_tfforprddsc = AV58TFForPrdDsc ;
      AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV113Recetasdeacabado02_wpds_19_tfrecfornro = AV60TFRecForNro ;
      AV114Recetasdeacabado02_wpds_20_tfrecfornro_to = AV61TFRecForNro_To ;
      AV115Recetasdeacabado02_wpds_21_tfrecprdtnq = AV62TFRecPrdTnq ;
      AV116Recetasdeacabado02_wpds_22_tfrecprdtnq_to = AV63TFRecPrdTnq_To ;
      AV117Recetasdeacabado02_wpds_23_tfreclote = AV64TFRecLote ;
      AV118Recetasdeacabado02_wpds_24_tfreclote_sel = AV65TFRecLote_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV6Emprcod, AV7Barcod, AV8Barcodreo, AV9Barcodpar, AV11RecLinMaq, AV72Procesosdadosdealta, AV42TFRecLinPro, AV43TFRecLinPro_To, AV44TFProForCod, AV45TFProForCod_Sel, AV46TFProForDsc, AV47TFProForDsc_Sel, AV48TFRecLin, AV49TFRecLin_To, AV50TFRecPrdNum, AV51TFRecPrdNum_Sel, AV52TFRecPrdDsc, AV53TFRecPrdDsc_Sel, AV54TFFacCon, AV55TFFacCon_To, AV56TFPrdCant, AV57TFPrdCant_To, AV58TFForPrdDsc, AV59TFForPrdDsc_Sel, AV60TFRecForNro, AV61TFRecForNro_To, AV62TFRecPrdTnq, AV63TFRecPrdTnq_To, AV64TFRecLote, AV65TFRecLote_Sel, AV126Pgmname, AV23OrderedBy, AV24OrderedDsc, AV77FecPan, AV85Usurcod, AV86Station, AV78MaqVolRes, AV80VolMul, AV81RecVolPrdold, AV38BarNHdr, AV79RecTotKgs) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV95Recetasdeacabado02_wpds_1_tfreclinpro = AV42TFRecLinPro ;
      AV96Recetasdeacabado02_wpds_2_tfreclinpro_to = AV43TFRecLinPro_To ;
      AV97Recetasdeacabado02_wpds_3_tfproforcod = AV44TFProForCod ;
      AV98Recetasdeacabado02_wpds_4_tfproforcod_sel = AV45TFProForCod_Sel ;
      AV99Recetasdeacabado02_wpds_5_tfprofordsc = AV46TFProForDsc ;
      AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel = AV47TFProForDsc_Sel ;
      AV101Recetasdeacabado02_wpds_7_tfreclin = AV48TFRecLin ;
      AV102Recetasdeacabado02_wpds_8_tfreclin_to = AV49TFRecLin_To ;
      AV103Recetasdeacabado02_wpds_9_tfrecprdnum = AV50TFRecPrdNum ;
      AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel = AV51TFRecPrdNum_Sel ;
      AV105Recetasdeacabado02_wpds_11_tfrecprddsc = AV52TFRecPrdDsc ;
      AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel = AV53TFRecPrdDsc_Sel ;
      AV107Recetasdeacabado02_wpds_13_tffaccon = AV54TFFacCon ;
      AV108Recetasdeacabado02_wpds_14_tffaccon_to = AV55TFFacCon_To ;
      AV109Recetasdeacabado02_wpds_15_tfprdcant = AV56TFPrdCant ;
      AV110Recetasdeacabado02_wpds_16_tfprdcant_to = AV57TFPrdCant_To ;
      AV111Recetasdeacabado02_wpds_17_tfforprddsc = AV58TFForPrdDsc ;
      AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV113Recetasdeacabado02_wpds_19_tfrecfornro = AV60TFRecForNro ;
      AV114Recetasdeacabado02_wpds_20_tfrecfornro_to = AV61TFRecForNro_To ;
      AV115Recetasdeacabado02_wpds_21_tfrecprdtnq = AV62TFRecPrdTnq ;
      AV116Recetasdeacabado02_wpds_22_tfrecprdtnq_to = AV63TFRecPrdTnq_To ;
      AV117Recetasdeacabado02_wpds_23_tfreclote = AV64TFRecLote ;
      AV118Recetasdeacabado02_wpds_24_tfreclote_sel = AV65TFRecLote_Sel ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV6Emprcod, AV7Barcod, AV8Barcodreo, AV9Barcodpar, AV11RecLinMaq, AV72Procesosdadosdealta, AV42TFRecLinPro, AV43TFRecLinPro_To, AV44TFProForCod, AV45TFProForCod_Sel, AV46TFProForDsc, AV47TFProForDsc_Sel, AV48TFRecLin, AV49TFRecLin_To, AV50TFRecPrdNum, AV51TFRecPrdNum_Sel, AV52TFRecPrdDsc, AV53TFRecPrdDsc_Sel, AV54TFFacCon, AV55TFFacCon_To, AV56TFPrdCant, AV57TFPrdCant_To, AV58TFForPrdDsc, AV59TFForPrdDsc_Sel, AV60TFRecForNro, AV61TFRecForNro_To, AV62TFRecPrdTnq, AV63TFRecPrdTnq_To, AV64TFRecLote, AV65TFRecLote_Sel, AV126Pgmname, AV23OrderedBy, AV24OrderedDsc, AV77FecPan, AV85Usurcod, AV86Station, AV78MaqVolRes, AV80VolMul, AV81RecVolPrdold, AV38BarNHdr, AV79RecTotKgs) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV95Recetasdeacabado02_wpds_1_tfreclinpro = AV42TFRecLinPro ;
      AV96Recetasdeacabado02_wpds_2_tfreclinpro_to = AV43TFRecLinPro_To ;
      AV97Recetasdeacabado02_wpds_3_tfproforcod = AV44TFProForCod ;
      AV98Recetasdeacabado02_wpds_4_tfproforcod_sel = AV45TFProForCod_Sel ;
      AV99Recetasdeacabado02_wpds_5_tfprofordsc = AV46TFProForDsc ;
      AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel = AV47TFProForDsc_Sel ;
      AV101Recetasdeacabado02_wpds_7_tfreclin = AV48TFRecLin ;
      AV102Recetasdeacabado02_wpds_8_tfreclin_to = AV49TFRecLin_To ;
      AV103Recetasdeacabado02_wpds_9_tfrecprdnum = AV50TFRecPrdNum ;
      AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel = AV51TFRecPrdNum_Sel ;
      AV105Recetasdeacabado02_wpds_11_tfrecprddsc = AV52TFRecPrdDsc ;
      AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel = AV53TFRecPrdDsc_Sel ;
      AV107Recetasdeacabado02_wpds_13_tffaccon = AV54TFFacCon ;
      AV108Recetasdeacabado02_wpds_14_tffaccon_to = AV55TFFacCon_To ;
      AV109Recetasdeacabado02_wpds_15_tfprdcant = AV56TFPrdCant ;
      AV110Recetasdeacabado02_wpds_16_tfprdcant_to = AV57TFPrdCant_To ;
      AV111Recetasdeacabado02_wpds_17_tfforprddsc = AV58TFForPrdDsc ;
      AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV113Recetasdeacabado02_wpds_19_tfrecfornro = AV60TFRecForNro ;
      AV114Recetasdeacabado02_wpds_20_tfrecfornro_to = AV61TFRecForNro_To ;
      AV115Recetasdeacabado02_wpds_21_tfrecprdtnq = AV62TFRecPrdTnq ;
      AV116Recetasdeacabado02_wpds_22_tfrecprdtnq_to = AV63TFRecPrdTnq_To ;
      AV117Recetasdeacabado02_wpds_23_tfreclote = AV64TFRecLote ;
      AV118Recetasdeacabado02_wpds_24_tfreclote_sel = AV65TFRecLote_Sel ;
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV6Emprcod, AV7Barcod, AV8Barcodreo, AV9Barcodpar, AV11RecLinMaq, AV72Procesosdadosdealta, AV42TFRecLinPro, AV43TFRecLinPro_To, AV44TFProForCod, AV45TFProForCod_Sel, AV46TFProForDsc, AV47TFProForDsc_Sel, AV48TFRecLin, AV49TFRecLin_To, AV50TFRecPrdNum, AV51TFRecPrdNum_Sel, AV52TFRecPrdDsc, AV53TFRecPrdDsc_Sel, AV54TFFacCon, AV55TFFacCon_To, AV56TFPrdCant, AV57TFPrdCant_To, AV58TFForPrdDsc, AV59TFForPrdDsc_Sel, AV60TFRecForNro, AV61TFRecForNro_To, AV62TFRecPrdTnq, AV63TFRecPrdTnq_To, AV64TFRecLote, AV65TFRecLote_Sel, AV126Pgmname, AV23OrderedBy, AV24OrderedDsc, AV77FecPan, AV85Usurcod, AV86Station, AV78MaqVolRes, AV80VolMul, AV81RecVolPrdold, AV38BarNHdr, AV79RecTotKgs) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV95Recetasdeacabado02_wpds_1_tfreclinpro = AV42TFRecLinPro ;
      AV96Recetasdeacabado02_wpds_2_tfreclinpro_to = AV43TFRecLinPro_To ;
      AV97Recetasdeacabado02_wpds_3_tfproforcod = AV44TFProForCod ;
      AV98Recetasdeacabado02_wpds_4_tfproforcod_sel = AV45TFProForCod_Sel ;
      AV99Recetasdeacabado02_wpds_5_tfprofordsc = AV46TFProForDsc ;
      AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel = AV47TFProForDsc_Sel ;
      AV101Recetasdeacabado02_wpds_7_tfreclin = AV48TFRecLin ;
      AV102Recetasdeacabado02_wpds_8_tfreclin_to = AV49TFRecLin_To ;
      AV103Recetasdeacabado02_wpds_9_tfrecprdnum = AV50TFRecPrdNum ;
      AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel = AV51TFRecPrdNum_Sel ;
      AV105Recetasdeacabado02_wpds_11_tfrecprddsc = AV52TFRecPrdDsc ;
      AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel = AV53TFRecPrdDsc_Sel ;
      AV107Recetasdeacabado02_wpds_13_tffaccon = AV54TFFacCon ;
      AV108Recetasdeacabado02_wpds_14_tffaccon_to = AV55TFFacCon_To ;
      AV109Recetasdeacabado02_wpds_15_tfprdcant = AV56TFPrdCant ;
      AV110Recetasdeacabado02_wpds_16_tfprdcant_to = AV57TFPrdCant_To ;
      AV111Recetasdeacabado02_wpds_17_tfforprddsc = AV58TFForPrdDsc ;
      AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV113Recetasdeacabado02_wpds_19_tfrecfornro = AV60TFRecForNro ;
      AV114Recetasdeacabado02_wpds_20_tfrecfornro_to = AV61TFRecForNro_To ;
      AV115Recetasdeacabado02_wpds_21_tfrecprdtnq = AV62TFRecPrdTnq ;
      AV116Recetasdeacabado02_wpds_22_tfrecprdtnq_to = AV63TFRecPrdTnq_To ;
      AV117Recetasdeacabado02_wpds_23_tfreclote = AV64TFRecLote ;
      AV118Recetasdeacabado02_wpds_24_tfreclote_sel = AV65TFRecLote_Sel ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( GRID_nRecordCount > subgrid_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-subgrid_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV6Emprcod, AV7Barcod, AV8Barcodreo, AV9Barcodpar, AV11RecLinMaq, AV72Procesosdadosdealta, AV42TFRecLinPro, AV43TFRecLinPro_To, AV44TFProForCod, AV45TFProForCod_Sel, AV46TFProForDsc, AV47TFProForDsc_Sel, AV48TFRecLin, AV49TFRecLin_To, AV50TFRecPrdNum, AV51TFRecPrdNum_Sel, AV52TFRecPrdDsc, AV53TFRecPrdDsc_Sel, AV54TFFacCon, AV55TFFacCon_To, AV56TFPrdCant, AV57TFPrdCant_To, AV58TFForPrdDsc, AV59TFForPrdDsc_Sel, AV60TFRecForNro, AV61TFRecForNro_To, AV62TFRecPrdTnq, AV63TFRecPrdTnq_To, AV64TFRecLote, AV65TFRecLote_Sel, AV126Pgmname, AV23OrderedBy, AV24OrderedDsc, AV77FecPan, AV85Usurcod, AV86Station, AV78MaqVolRes, AV80VolMul, AV81RecVolPrdold, AV38BarNHdr, AV79RecTotKgs) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV95Recetasdeacabado02_wpds_1_tfreclinpro = AV42TFRecLinPro ;
      AV96Recetasdeacabado02_wpds_2_tfreclinpro_to = AV43TFRecLinPro_To ;
      AV97Recetasdeacabado02_wpds_3_tfproforcod = AV44TFProForCod ;
      AV98Recetasdeacabado02_wpds_4_tfproforcod_sel = AV45TFProForCod_Sel ;
      AV99Recetasdeacabado02_wpds_5_tfprofordsc = AV46TFProForDsc ;
      AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel = AV47TFProForDsc_Sel ;
      AV101Recetasdeacabado02_wpds_7_tfreclin = AV48TFRecLin ;
      AV102Recetasdeacabado02_wpds_8_tfreclin_to = AV49TFRecLin_To ;
      AV103Recetasdeacabado02_wpds_9_tfrecprdnum = AV50TFRecPrdNum ;
      AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel = AV51TFRecPrdNum_Sel ;
      AV105Recetasdeacabado02_wpds_11_tfrecprddsc = AV52TFRecPrdDsc ;
      AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel = AV53TFRecPrdDsc_Sel ;
      AV107Recetasdeacabado02_wpds_13_tffaccon = AV54TFFacCon ;
      AV108Recetasdeacabado02_wpds_14_tffaccon_to = AV55TFFacCon_To ;
      AV109Recetasdeacabado02_wpds_15_tfprdcant = AV56TFPrdCant ;
      AV110Recetasdeacabado02_wpds_16_tfprdcant_to = AV57TFPrdCant_To ;
      AV111Recetasdeacabado02_wpds_17_tfforprddsc = AV58TFForPrdDsc ;
      AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV113Recetasdeacabado02_wpds_19_tfrecfornro = AV60TFRecForNro ;
      AV114Recetasdeacabado02_wpds_20_tfrecfornro_to = AV61TFRecForNro_To ;
      AV115Recetasdeacabado02_wpds_21_tfrecprdtnq = AV62TFRecPrdTnq ;
      AV116Recetasdeacabado02_wpds_22_tfrecprdtnq_to = AV63TFRecPrdTnq_To ;
      AV117Recetasdeacabado02_wpds_23_tfreclote = AV64TFRecLote ;
      AV118Recetasdeacabado02_wpds_24_tfreclote_sel = AV65TFRecLote_Sel ;
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV6Emprcod, AV7Barcod, AV8Barcodreo, AV9Barcodpar, AV11RecLinMaq, AV72Procesosdadosdealta, AV42TFRecLinPro, AV43TFRecLinPro_To, AV44TFProForCod, AV45TFProForCod_Sel, AV46TFProForDsc, AV47TFProForDsc_Sel, AV48TFRecLin, AV49TFRecLin_To, AV50TFRecPrdNum, AV51TFRecPrdNum_Sel, AV52TFRecPrdDsc, AV53TFRecPrdDsc_Sel, AV54TFFacCon, AV55TFFacCon_To, AV56TFPrdCant, AV57TFPrdCant_To, AV58TFForPrdDsc, AV59TFForPrdDsc_Sel, AV60TFRecForNro, AV61TFRecForNro_To, AV62TFRecPrdTnq, AV63TFRecPrdTnq_To, AV64TFRecLote, AV65TFRecLote_Sel, AV126Pgmname, AV23OrderedBy, AV24OrderedDsc, AV77FecPan, AV85Usurcod, AV86Station, AV78MaqVolRes, AV80VolMul, AV81RecVolPrdold, AV38BarNHdr, AV79RecTotKgs) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV126Pgmname = "RecetasdeAcabado02_WP" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavReclinmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinmaq_Enabled), 5, 0), true);
      edtavModo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModo_Enabled), 5, 0), true);
      edtavModif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModif_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipcol_Enabled), 5, 0), true);
      edtavRectotkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotkgs_Enabled), 5, 0), true);
      edtavPrdrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdrgb_Enabled), 5, 0), !bGXsfl_129_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_129_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_129_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_129_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_129_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_129_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_129_Refreshing);
      imgPrompt_maqcod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.tmaqui1prompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vMAQCOD"+"'), id:'"+"vMAQCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vMAQDSC"+"'), id:'"+"vMAQDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_maqcod_Internalname, "Link", imgPrompt_maqcod_Link, true);
      fix_multi_value_controls( ) ;
   }

   public void strup1HI0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e261HI2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV68DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_129 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_129"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV70GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV71GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV88Modif2 = httpContext.cgiGet( "vMODIF2") ;
         AV77FecPan = localUtil.ctod( httpContext.cgiGet( "vFECPAN"), 0) ;
         AV119Emprcod_selected = httpContext.cgiGet( "vEMPRCOD_SELECTED") ;
         AV120Barcod_selected = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV121Barcodreo_selected = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV122Barcodpar_selected = httpContext.cgiGet( "vBARCODPAR_SELECTED") ;
         AV123Reclinmaq_selected = (short)(localUtil.ctol( httpContext.cgiGet( "vRECLINMAQ_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV124Reclinpro_selected = (byte)(localUtil.ctol( httpContext.cgiGet( "vRECLINPRO_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV125Reclin_selected = (short)(localUtil.ctol( httpContext.cgiGet( "vRECLIN_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Gridpaginationbar_Class = httpContext.cgiGet( "GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( "GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( "GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( "DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_elimimarproceso_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Title") ;
         Dvelop_confirmpanel_elimimarproceso_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Confirmationtext") ;
         Dvelop_confirmpanel_elimimarproceso_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Yesbuttoncaption") ;
         Dvelop_confirmpanel_elimimarproceso_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Nobuttoncaption") ;
         Dvelop_confirmpanel_elimimarproceso_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_elimimarproceso_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Yesbuttonposition") ;
         Dvelop_confirmpanel_elimimarproceso_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Confirmtype") ;
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Dvelop_confirmpanel_cerrar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Title") ;
         Dvelop_confirmpanel_cerrar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Confirmationtext") ;
         Dvelop_confirmpanel_cerrar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_cerrar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_cerrar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_cerrar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_cerrar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         Dvelop_confirmpanel_cerrar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Result") ;
         /* Read variables values. */
         AV38BarNHdr = httpContext.cgiGet( edtavBarnhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38BarNHdr", AV38BarNHdr);
         AV11RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtavReclinmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11RecLinMaq), 4, 0));
         AV39Modo = httpContext.cgiGet( edtavModo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Modo", AV39Modo);
         AV40Modif = httpContext.cgiGet( edtavModif_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
         AV33CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33CliNom", AV33CliNom);
         AV34BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34BarSer", AV34BarSer);
         AV35BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35BarColNom", AV35BarColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
            GX_FocusControl = edtavBarcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36BarColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarColNum), 6, 0));
         }
         else
         {
            AV36BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarColNum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPCOL");
            GX_FocusControl = edtavBartipcol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV37BarTipCol = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarTipCol), 2, 0));
         }
         else
         {
            AV37BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarTipCol), 2, 0));
         }
         AV14MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14MaqCod", AV14MaqCod);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRectotkgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRectotkgs_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECTOTKGS");
            GX_FocusControl = edtavRectotkgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV79RecTotKgs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79RecTotKgs", GXutil.ltrimstr( AV79RecTotKgs, 10, 2));
         }
         else
         {
            AV79RecTotKgs = localUtil.ctond( httpContext.cgiGet( edtavRectotkgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79RecTotKgs", GXutil.ltrimstr( AV79RecTotKgs, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRecfa_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecfa_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECFA");
            GX_FocusControl = edtavRecfa_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12RecFA = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12RecFA", GXutil.ltrimstr( AV12RecFA, 6, 2));
         }
         else
         {
            AV12RecFA = localUtil.ctond( httpContext.cgiGet( edtavRecfa_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12RecFA", GXutil.ltrimstr( AV12RecFA, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRecvolprd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRecvolprd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECVOLPRD");
            GX_FocusControl = edtavRecvolprd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13RecVolPrd = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13RecVolPrd), 5, 0));
         }
         else
         {
            AV13RecVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtavRecvolprd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13RecVolPrd), 5, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV32CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32CliCod), 6, 0));
         }
         else
         {
            AV32CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32CliCod), 6, 0));
         }
         /* Read subfile selected row values. */
         nGXsfl_129_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_129_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_129_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1292( ) ;
         if ( nGXsfl_129_idx > 0 )
         {
            cmbavGrupodeaccionesgrid.setName( cmbavGrupodeaccionesgrid.getInternalname() );
            cmbavGrupodeaccionesgrid.setValue( httpContext.cgiGet( cmbavGrupodeaccionesgrid.getInternalname()) );
            AV74GrupodeaccionesGrid = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeaccionesgrid.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeaccionesgrid.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74GrupodeaccionesGrid), 4, 0));
            A1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
            A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
            A811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A872RecPrdNum = httpContext.cgiGet( edtRecPrdNum_Internalname) ;
            A875RecPrdDsc = httpContext.cgiGet( edtRecPrdDsc_Internalname) ;
            A431FacCon = localUtil.ctond( httpContext.cgiGet( edtFacCon_Internalname)) ;
            A686PrdCant = localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)) ;
            A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
            n488ForPrdDsc = false ;
            A2394RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3274RecPrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5725RecLote = httpContext.cgiGet( edtRecLote_Internalname) ;
            A13232PrdRGB = localUtil.ctol( httpContext.cgiGet( edtPrdRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDRGB");
               GX_FocusControl = edtavPrdrgb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV25PrdRGB = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25PrdRGB), 10, 0));
            }
            else
            {
               AV25PrdRGB = localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25PrdRGB), 10, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR");
               GX_FocusControl = edtavR_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV26R = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26R), 3, 0));
            }
            else
            {
               AV26R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26R), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG");
               GX_FocusControl = edtavG_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV27G = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27G), 3, 0));
            }
            else
            {
               AV27G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27G), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB");
               GX_FocusControl = edtavB_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV28B = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28B), 3, 0));
            }
            else
            {
               AV28B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28B), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR2");
               GX_FocusControl = edtavR2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV29R2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29R2), 3, 0));
            }
            else
            {
               AV29R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29R2), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG2");
               GX_FocusControl = edtavG2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV30G2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30G2), 3, 0));
            }
            else
            {
               AV30G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30G2), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB2");
               GX_FocusControl = edtavB2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV31B2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31B2), 3, 0));
            }
            else
            {
               AV31B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31B2), 3, 0));
            }
            A6018ProForFab = httpContext.cgiGet( edtProForFab_Internalname) ;
            n6018ProForFab = false ;
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            n719PrdNum = false ;
            A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n490ForPrdUMe = false ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"RecetasdeAcabado02_WP");
         AV38BarNHdr = httpContext.cgiGet( edtavBarnhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38BarNHdr", AV38BarNHdr);
         forbiddenHiddens.add("BarNHdr", GXutil.rtrim( localUtil.format( AV38BarNHdr, "")));
         AV79RecTotKgs = localUtil.ctond( httpContext.cgiGet( edtavRectotkgs_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79RecTotKgs", GXutil.ltrimstr( AV79RecTotKgs, 10, 2));
         forbiddenHiddens.add("RecTotKgs", localUtil.format( AV79RecTotKgs, "ZZZZZZ9.99"));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("recetasdeacabado02_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e261HI2 ();
      if (returnInSub) return;
   }

   public void e261HI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = AV80VolMul ;
      GXv_int2[0] = GXt_int1 ;
      new app.pbuscon(remoteHandle, context).execute( AV6Emprcod, httpContext.getMessage( "VOLMUL", ""), GXv_int2) ;
      recetasdeacabado02_wp_impl.this.GXt_int1 = GXv_int2[0] ;
      AV80VolMul = (short)(GXt_int1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80VolMul", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80VolMul), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV80VolMul), "ZZZ9")));
      AV40Modif = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
      AV88Modif2 = "N" ;
      AV39Modo = Gx_mode ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Modo", AV39Modo);
      AV72Procesosdadosdealta = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72Procesosdadosdealta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72Procesosdadosdealta), 4, 0));
      AV38BarNHdr = GXutil.str( AV7Barcod, 8, 0) + "-" + GXutil.str( AV8Barcodreo, 1, 0) + AV9Barcodpar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38BarNHdr", AV38BarNHdr);
      /* Using cursor H01HI4 */
      pr_default.execute(2, new Object[] {AV6Emprcod, Integer.valueOf(AV7Barcod), Byte.valueOf(AV8Barcodreo), AV9Barcodpar, Short.valueOf(AV11RecLinMaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2804RecLinMaq = H01HI4_A2804RecLinMaq[0] ;
         A130BarCodPar = H01HI4_A130BarCodPar[0] ;
         A132BarCodReo = H01HI4_A132BarCodReo[0] ;
         A129BarCod = H01HI4_A129BarCod[0] ;
         A396EmprCod = H01HI4_A396EmprCod[0] ;
         A602MaqCod = H01HI4_A602MaqCod[0] ;
         A2806RecFA = H01HI4_A2806RecFA[0] ;
         A2805RecVolPrd = H01HI4_A2805RecVolPrd[0] ;
         A252CliCod = H01HI4_A252CliCod[0] ;
         n252CliCod = H01HI4_n252CliCod[0] ;
         A279CliNom = H01HI4_A279CliNom[0] ;
         A212BarSer = H01HI4_A212BarSer[0] ;
         A135BarColNom = H01HI4_A135BarColNom[0] ;
         A136BarColNum = H01HI4_A136BarColNum[0] ;
         A218BarTipCol = H01HI4_A218BarTipCol[0] ;
         A4259RecTotKgs = H01HI4_A4259RecTotKgs[0] ;
         A252CliCod = H01HI4_A252CliCod[0] ;
         n252CliCod = H01HI4_n252CliCod[0] ;
         A212BarSer = H01HI4_A212BarSer[0] ;
         A135BarColNom = H01HI4_A135BarColNom[0] ;
         A136BarColNum = H01HI4_A136BarColNum[0] ;
         A218BarTipCol = H01HI4_A218BarTipCol[0] ;
         A279CliNom = H01HI4_A279CliNom[0] ;
         AV14MaqCod = A602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14MaqCod", AV14MaqCod);
         AV15MaqcodOld = A602MaqCod ;
         AV12RecFA = A2806RecFA ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12RecFA", GXutil.ltrimstr( AV12RecFA, 6, 2));
         AV13RecVolPrd = A2805RecVolPrd ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13RecVolPrd), 5, 0));
         AV32CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32CliCod), 6, 0));
         AV33CliNom = A279CliNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33CliNom", AV33CliNom);
         AV34BarSer = A212BarSer ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34BarSer", AV34BarSer);
         AV35BarColNom = A135BarColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35BarColNom", AV35BarColNom);
         AV36BarColNum = A136BarColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36BarColNum), 6, 0));
         AV37BarTipCol = A218BarTipCol ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarTipCol), 2, 0));
         AV79RecTotKgs = A4259RecTotKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79RecTotKgs", GXutil.ltrimstr( AV79RecTotKgs, 10, 2));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      GXt_char3 = AV86Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      recetasdeacabado02_wp_impl.this.GXt_char3 = GXv_char4[0] ;
      AV86Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86Station", AV86Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV86Station, ""))));
      GXv_char4[0] = AV6Emprcod ;
      GXv_char5[0] = AV94Emprnom ;
      GXv_char6[0] = AV85Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV86Station, GXv_char4, GXv_char5, GXv_char6) ;
      recetasdeacabado02_wp_impl.this.AV6Emprcod = GXv_char4[0] ;
      recetasdeacabado02_wp_impl.this.AV94Emprnom = GXv_char5[0] ;
      recetasdeacabado02_wp_impl.this.AV85Usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Emprcod", AV6Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV85Usurcod", AV85Usurcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV85Usurcod, "@!"))));
      edtavClicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Visible), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Recetas de Acabado (Mto)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV23OrderedBy < 1 )
      {
         AV23OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV68DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV68DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e271HI2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV17WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV17WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV70GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70GridCurrentPage), 10, 0));
      AV71GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71GridPageCount), 10, 0));
      if ( AV72Procesosdadosdealta > 0 )
      {
         AV82ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
         AV82ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
         AV82ProgressIndicator.setgxTv_SdtProgress_Value( 55 );
         AV82ProgressIndicator.showwithtitle(httpContext.getMessage( "Validando Operacion", ""));
         AV82ProgressIndicator.show();
         AV82ProgressIndicator.setgxTv_SdtProgress_Value( 85 );
         GXv_char6[0] = AV6Emprcod ;
         GXv_int2[0] = AV7Barcod ;
         GXv_int10[0] = AV8Barcodreo ;
         GXv_char5[0] = AV9Barcodpar ;
         GXv_int11[0] = AV11RecLinMaq ;
         new app.prac008(remoteHandle, context).execute( GXv_char6, GXv_int2, GXv_int10, GXv_char5, GXv_int11) ;
         recetasdeacabado02_wp_impl.this.AV6Emprcod = GXv_char6[0] ;
         recetasdeacabado02_wp_impl.this.AV7Barcod = GXv_int2[0] ;
         recetasdeacabado02_wp_impl.this.AV8Barcodreo = GXv_int10[0] ;
         recetasdeacabado02_wp_impl.this.AV9Barcodpar = GXv_char5[0] ;
         recetasdeacabado02_wp_impl.this.AV11RecLinMaq = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Emprcod", AV6Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV7Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Barcod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodreo", GXutil.str( AV8Barcodreo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9Barcodpar", AV9Barcodpar);
         httpContext.ajax_rsp_assign_attri("", false, "AV11RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11RecLinMaq), 4, 0));
         AV82ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV82ProgressIndicator.hide();
         AV40Modif = "Y" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
         AV72Procesosdadosdealta = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72Procesosdadosdealta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72Procesosdadosdealta), 4, 0));
      }
      AV95Recetasdeacabado02_wpds_1_tfreclinpro = AV42TFRecLinPro ;
      AV96Recetasdeacabado02_wpds_2_tfreclinpro_to = AV43TFRecLinPro_To ;
      AV97Recetasdeacabado02_wpds_3_tfproforcod = AV44TFProForCod ;
      AV98Recetasdeacabado02_wpds_4_tfproforcod_sel = AV45TFProForCod_Sel ;
      AV99Recetasdeacabado02_wpds_5_tfprofordsc = AV46TFProForDsc ;
      AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel = AV47TFProForDsc_Sel ;
      AV101Recetasdeacabado02_wpds_7_tfreclin = AV48TFRecLin ;
      AV102Recetasdeacabado02_wpds_8_tfreclin_to = AV49TFRecLin_To ;
      AV103Recetasdeacabado02_wpds_9_tfrecprdnum = AV50TFRecPrdNum ;
      AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel = AV51TFRecPrdNum_Sel ;
      AV105Recetasdeacabado02_wpds_11_tfrecprddsc = AV52TFRecPrdDsc ;
      AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel = AV53TFRecPrdDsc_Sel ;
      AV107Recetasdeacabado02_wpds_13_tffaccon = AV54TFFacCon ;
      AV108Recetasdeacabado02_wpds_14_tffaccon_to = AV55TFFacCon_To ;
      AV109Recetasdeacabado02_wpds_15_tfprdcant = AV56TFPrdCant ;
      AV110Recetasdeacabado02_wpds_16_tfprdcant_to = AV57TFPrdCant_To ;
      AV111Recetasdeacabado02_wpds_17_tfforprddsc = AV58TFForPrdDsc ;
      AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel = AV59TFForPrdDsc_Sel ;
      AV113Recetasdeacabado02_wpds_19_tfrecfornro = AV60TFRecForNro ;
      AV114Recetasdeacabado02_wpds_20_tfrecfornro_to = AV61TFRecForNro_To ;
      AV115Recetasdeacabado02_wpds_21_tfrecprdtnq = AV62TFRecPrdTnq ;
      AV116Recetasdeacabado02_wpds_22_tfrecprdtnq_to = AV63TFRecPrdTnq_To ;
      AV117Recetasdeacabado02_wpds_23_tfreclote = AV64TFRecLote ;
      AV118Recetasdeacabado02_wpds_24_tfreclote_sel = AV65TFRecLote_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82ProgressIndicator", AV82ProgressIndicator);
   }

   public void e131HI2( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         subgrid_nextpage( ) ;
      }
      else
      {
         AV69PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV69PageToGo) ;
      }
   }

   public void e141HI2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e151HI2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV23OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23OrderedBy), 4, 0));
         AV24OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24OrderedDsc", AV24OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLinPro") == 0 )
         {
            AV42TFRecLinPro = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFRecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFRecLinPro), 2, 0));
            AV43TFRecLinPro_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFRecLinPro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFRecLinPro_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForCod") == 0 )
         {
            AV44TFProForCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFProForCod", AV44TFProForCod);
            AV45TFProForCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFProForCod_Sel", AV45TFProForCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForDsc") == 0 )
         {
            AV46TFProForDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFProForDsc", AV46TFProForDsc);
            AV47TFProForDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFProForDsc_Sel", AV47TFProForDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLin") == 0 )
         {
            AV48TFRecLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFRecLin), 4, 0));
            AV49TFRecLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFRecLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdNum") == 0 )
         {
            AV50TFRecPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFRecPrdNum", AV50TFRecPrdNum);
            AV51TFRecPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFRecPrdNum_Sel", AV51TFRecPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdDsc") == 0 )
         {
            AV52TFRecPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFRecPrdDsc", AV52TFRecPrdDsc);
            AV53TFRecPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFRecPrdDsc_Sel", AV53TFRecPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacCon") == 0 )
         {
            AV54TFFacCon = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFFacCon", GXutil.ltrimstr( AV54TFFacCon, 11, 5));
            AV55TFFacCon_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFFacCon_To", GXutil.ltrimstr( AV55TFFacCon_To, 11, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCant") == 0 )
         {
            AV56TFPrdCant = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPrdCant", GXutil.ltrimstr( AV56TFPrdCant, 11, 3));
            AV57TFPrdCant_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFPrdCant_To", GXutil.ltrimstr( AV57TFPrdCant_To, 11, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdDsc") == 0 )
         {
            AV58TFForPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFForPrdDsc", AV58TFForPrdDsc);
            AV59TFForPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFForPrdDsc_Sel", AV59TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecForNro") == 0 )
         {
            AV60TFRecForNro = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFRecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFRecForNro), 2, 0));
            AV61TFRecForNro_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFRecForNro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFRecForNro_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdTnq") == 0 )
         {
            AV62TFRecPrdTnq = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFRecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFRecPrdTnq), 2, 0));
            AV63TFRecPrdTnq_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFRecPrdTnq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFRecPrdTnq_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLote") == 0 )
         {
            AV64TFRecLote = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFRecLote", AV64TFRecLote);
            AV65TFRecLote_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFRecLote_Sel", AV65TFRecLote_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e281HI2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGrupodeaccionesgrid.removeAllItems();
      cmbavGrupodeaccionesgrid.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGrupodeaccionesgrid.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar Proceso", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeaccionesgrid.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar Proceso", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      AV25PrdRGB = ((A13232PrdRGB==0) ? 16777215 : A13232PrdRGB) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25PrdRGB), 10, 0));
      GXv_int11[0] = AV26R ;
      GXv_int12[0] = AV27G ;
      GXv_int13[0] = AV28B ;
      GXv_int14[0] = AV29R2 ;
      GXv_int15[0] = AV30G2 ;
      GXv_int16[0] = AV31B2 ;
      new app.backcolorforecolor(remoteHandle, context).execute( AV25PrdRGB, GXv_int11, GXv_int12, GXv_int13, GXv_int14, GXv_int15, GXv_int16) ;
      recetasdeacabado02_wp_impl.this.AV26R = GXv_int11[0] ;
      recetasdeacabado02_wp_impl.this.AV27G = GXv_int12[0] ;
      recetasdeacabado02_wp_impl.this.AV28B = GXv_int13[0] ;
      recetasdeacabado02_wp_impl.this.AV29R2 = GXv_int14[0] ;
      recetasdeacabado02_wp_impl.this.AV30G2 = GXv_int15[0] ;
      recetasdeacabado02_wp_impl.this.AV31B2 = GXv_int16[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26R), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27G), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28B), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29R2), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30G2), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31B2), 3, 0));
      edtRecPrdDsc_Backcolor = GXutil.getColor( AV26R, AV27G, AV28B) ;
      edtRecPrdDsc_Forecolor = GXutil.getColor( AV29R2, AV30G2, AV31B2) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(129) ;
      }
      sendrow_1292( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_129_Refreshing )
      {
         httpContext.doAjaxLoad(129, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGrupodeaccionesgrid.setValue( GXutil.trim( GXutil.str( AV74GrupodeaccionesGrid, 4, 0)) );
   }

   public void e191HI2( )
   {
      /* 'DoAdd' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.recetadetinte06_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV9Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV11RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","Procesosdadosdealta"}) , new Object[] {"AV72Procesosdadosdealta"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82ProgressIndicator", AV82ProgressIndicator);
   }

   public void e201HI2( )
   {
      /* 'DoEliminarProcesos' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.recetadetinte04_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV9Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV11RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","Reclinmaq","Procesoseliminados"}) , new Object[] {"AV73Procesoseliminados"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82ProgressIndicator", AV82ProgressIndicator);
   }

   public void e161HI2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e251HI2( )
   {
      /* 'DoImprimir' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.rrac006", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV9Barcodpar)),GXutil.URLEncode(GXutil.rtrim(AV14MaqCod)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(AV13RecVolPrd,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(AV84ImpCod)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "PRN", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarMaqCod","BarSua","Volumen","RecLinMaq","ImpCod","Output"}) , new Object[] {"AV6Emprcod","AV7Barcod","AV8Barcodreo","AV9Barcodpar","AV14MaqCod","","AV13RecVolPrd","AV11RecLinMaq","AV84ImpCod",""});
      /*  Sending Event outputs  */
   }

   public void e211HI2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      GXv_char6[0] = AV6Emprcod ;
      GXv_char5[0] = AV14MaqCod ;
      GXv_int10[0] = AV87Flag ;
      new app.peximaq(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_int10) ;
      recetasdeacabado02_wp_impl.this.AV6Emprcod = GXv_char6[0] ;
      recetasdeacabado02_wp_impl.this.AV14MaqCod = GXv_char5[0] ;
      recetasdeacabado02_wp_impl.this.AV87Flag = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Emprcod", AV6Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV14MaqCod", AV14MaqCod);
      if ( (0==AV87Flag) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Maquina Inexistente", ""));
         GX_FocusControl = edtavMaqcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( GXutil.strcmp(AV40Modif, "Y") == 0 )
         {
            Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.getMessage( "Atencion.El volumen ha cambiado. Al confirmar, la receta se eliminara y se volvera a crear", "")+GXutil.newLine( ) ;
            ucDvelop_confirmpanel_confirmar.sendProperty(context, "", false, Dvelop_confirmpanel_confirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
            Dvelop_confirmpanel_confirmar_Confirmationtext = Dvelop_confirmpanel_confirmar_Confirmationtext+httpContext.getMessage( "¿Desea confirmar los cambios?", "") ;
            ucDvelop_confirmpanel_confirmar.sendProperty(context, "", false, Dvelop_confirmpanel_confirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
         }
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_CONFIRMARContainer", "Confirm", "", new Object[] {});
      }
      /*  Sending Event outputs  */
   }

   public void e171HI2( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e181HI2( )
   {
      /* Dvelop_confirmpanel_cerrar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_cerrar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CERRAR' */
         S202 ();
         if (returnInSub) return;
      }
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV23OrderedBy, 4, 0))+":"+(AV24OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO ELIMIMARPROCESO' Routine */
      returnInSub = false ;
      AV119Emprcod_selected = A396EmprCod ;
      AV120Barcod_selected = A129BarCod ;
      AV121Barcodreo_selected = A132BarCodReo ;
      AV122Barcodpar_selected = A130BarCodPar ;
      AV123Reclinmaq_selected = A2804RecLinMaq ;
      AV124Reclinpro_selected = A1273RecLinPro ;
      AV125Reclin_selected = A811RecLin ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESOContainer", "Confirm", "", new Object[] {});
   }

   public void S172( )
   {
      /* 'DO ACTION ELIMIMARPROCESO' Routine */
      returnInSub = false ;
   }

   public void S162( )
   {
      /* 'DO MODIFICARPROCESO2' Routine */
      returnInSub = false ;
      AV88Modif2 = AV40Modif ;
      callWebObject(formatLink("app.mantenimientoproductosreceta_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A2804RecLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A1273RecLinPro,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV79RecTotKgs)),GXutil.URLEncode(GXutil.ltrimstr(AV13RecVolPrd,5,0)),GXutil.URLEncode(GXutil.formatDateParm(AV77FecPan)),GXutil.URLEncode(GXutil.rtrim(AV38BarNHdr)),GXutil.URLEncode(GXutil.rtrim(A766ProForDsc)),GXutil.URLEncode(GXutil.rtrim(A6018ProForFab)),GXutil.URLEncode(GXutil.rtrim(AV88Modif2))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","RecLinPro","TotKgs","Volumen","FecPan","BarNHdr","ProForDsc","Proforfab","Modif2"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S182( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char6[0] = A396EmprCod ;
      GXv_char5[0] = A9812RecHdrLts ;
      GXv_int2[0] = A9764RecLtsSR ;
      new app.prac105(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_int2) ;
      recetasdeacabado02_wp_impl.this.A396EmprCod = GXv_char6[0] ;
      recetasdeacabado02_wp_impl.this.A9812RecHdrLts = GXv_char5[0] ;
      recetasdeacabado02_wp_impl.this.A9764RecLtsSR = GXv_int2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9812RecHdrLts", A9812RecHdrLts);
      httpContext.ajax_rsp_assign_attri("", false, "A9764RecLtsSR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9764RecLtsSR), 5, 0));
      GXv_char6[0] = AV6Emprcod ;
      GXv_int2[0] = AV7Barcod ;
      GXv_int10[0] = AV8Barcodreo ;
      GXv_char5[0] = AV9Barcodpar ;
      GXv_int16[0] = AV11RecLinMaq ;
      new app.pbajrec(remoteHandle, context).execute( GXv_char6, GXv_int2, GXv_int10, GXv_char5, GXv_int16) ;
      recetasdeacabado02_wp_impl.this.AV6Emprcod = GXv_char6[0] ;
      recetasdeacabado02_wp_impl.this.AV7Barcod = GXv_int2[0] ;
      recetasdeacabado02_wp_impl.this.AV8Barcodreo = GXv_int10[0] ;
      recetasdeacabado02_wp_impl.this.AV9Barcodpar = GXv_char5[0] ;
      recetasdeacabado02_wp_impl.this.AV11RecLinMaq = GXv_int16[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Emprcod", AV6Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodreo", GXutil.str( AV8Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV9Barcodpar", AV9Barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV11RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11RecLinMaq), 4, 0));
      GXv_char6[0] = AV6Emprcod ;
      GXv_int2[0] = AV7Barcod ;
      GXv_int10[0] = AV8Barcodreo ;
      GXv_char5[0] = AV9Barcodpar ;
      GXv_int16[0] = AV11RecLinMaq ;
      new app.pdelrec3(remoteHandle, context).execute( GXv_char6, GXv_int2, GXv_int10, GXv_char5, GXv_int16) ;
      recetasdeacabado02_wp_impl.this.AV6Emprcod = GXv_char6[0] ;
      recetasdeacabado02_wp_impl.this.AV7Barcod = GXv_int2[0] ;
      recetasdeacabado02_wp_impl.this.AV8Barcodreo = GXv_int10[0] ;
      recetasdeacabado02_wp_impl.this.AV9Barcodpar = GXv_char5[0] ;
      recetasdeacabado02_wp_impl.this.AV11RecLinMaq = GXv_int16[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Emprcod", AV6Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodreo", GXutil.str( AV8Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV9Barcodpar", AV9Barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV11RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11RecLinMaq), 4, 0));
      AV83Inc_obs = httpContext.getMessage( "Receta Acabado, eliminada", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV6Emprcod, GXutil.substring( AV126Pgmname, 1, 10), AV85Usurcod, AV86Station, AV83Inc_obs, AV7Barcod, AV8Barcodreo, AV9Barcodpar) ;
      httpContext.setWebReturnParms(new Object[] {AV6Emprcod,Integer.valueOf(AV7Barcod),Byte.valueOf(AV8Barcodreo),AV9Barcodpar,Short.valueOf(AV11RecLinMaq),Gx_mode});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV6Emprcod","AV7Barcod","AV8Barcodreo","AV9Barcodpar","AV11RecLinMaq","Gx_mode"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S192( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      new app.acsfabsvol(remoteHandle, context).execute( ) ;
      if ( GXutil.strcmp(AV40Modif, "Y") == 0 )
      {
         GXv_char6[0] = AV6Emprcod ;
         GXv_int2[0] = AV7Barcod ;
         GXv_int10[0] = AV8Barcodreo ;
         GXv_char5[0] = AV9Barcodpar ;
         GXv_int16[0] = AV11RecLinMaq ;
         new app.prac008(remoteHandle, context).execute( GXv_char6, GXv_int2, GXv_int10, GXv_char5, GXv_int16) ;
         recetasdeacabado02_wp_impl.this.AV6Emprcod = GXv_char6[0] ;
         recetasdeacabado02_wp_impl.this.AV7Barcod = GXv_int2[0] ;
         recetasdeacabado02_wp_impl.this.AV8Barcodreo = GXv_int10[0] ;
         recetasdeacabado02_wp_impl.this.AV9Barcodpar = GXv_char5[0] ;
         recetasdeacabado02_wp_impl.this.AV11RecLinMaq = GXv_int16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Emprcod", AV6Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV7Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Barcod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodreo", GXutil.str( AV8Barcodreo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9Barcodpar", AV9Barcodpar);
         httpContext.ajax_rsp_assign_attri("", false, "AV11RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11RecLinMaq), 4, 0));
      }
      httpContext.setWebReturnParms(new Object[] {AV6Emprcod,Integer.valueOf(AV7Barcod),Byte.valueOf(AV8Barcodreo),AV9Barcodpar,Short.valueOf(AV11RecLinMaq),Gx_mode});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV6Emprcod","AV7Barcod","AV8Barcodreo","AV9Barcodpar","AV11RecLinMaq","Gx_mode"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S202( )
   {
      /* 'DO ACTION CERRAR' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV6Emprcod,Integer.valueOf(AV7Barcod),Byte.valueOf(AV8Barcodreo),AV9Barcodpar,Short.valueOf(AV11RecLinMaq),Gx_mode});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV6Emprcod","AV7Barcod","AV8Barcodreo","AV9Barcodpar","AV11RecLinMaq","Gx_mode"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue(AV126Pgmname+"GridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV126Pgmname+"GridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV41Session.getValue(AV126Pgmname+"GridState"), null, null);
      }
      AV23OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23OrderedBy), 4, 0));
      AV24OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24OrderedDsc", AV24OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV127GXV1 = 1 ;
      while ( AV127GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV127GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV42TFRecLinPro = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFRecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFRecLinPro), 2, 0));
            AV43TFRecLinPro_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFRecLinPro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFRecLinPro_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV44TFProForCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFProForCod", AV44TFProForCod);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV45TFProForCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFProForCod_Sel", AV45TFProForCod_Sel);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV46TFProForDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFProForDsc", AV46TFProForDsc);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV47TFProForDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFProForDsc_Sel", AV47TFProForDsc_Sel);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV48TFRecLin = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFRecLin), 4, 0));
            AV49TFRecLin_To = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFRecLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV50TFRecPrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFRecPrdNum", AV50TFRecPrdNum);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV51TFRecPrdNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFRecPrdNum_Sel", AV51TFRecPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV52TFRecPrdDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFRecPrdDsc", AV52TFRecPrdDsc);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV53TFRecPrdDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFRecPrdDsc_Sel", AV53TFRecPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV54TFFacCon = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFFacCon", GXutil.ltrimstr( AV54TFFacCon, 11, 5));
            AV55TFFacCon_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFFacCon_To", GXutil.ltrimstr( AV55TFFacCon_To, 11, 5));
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV56TFPrdCant = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPrdCant", GXutil.ltrimstr( AV56TFPrdCant, 11, 3));
            AV57TFPrdCant_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFPrdCant_To", GXutil.ltrimstr( AV57TFPrdCant_To, 11, 3));
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV58TFForPrdDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFForPrdDsc", AV58TFForPrdDsc);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV59TFForPrdDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFForPrdDsc_Sel", AV59TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFORNRO") == 0 )
         {
            AV60TFRecForNro = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFRecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFRecForNro), 2, 0));
            AV61TFRecForNro_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFRecForNro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFRecForNro_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDTNQ") == 0 )
         {
            AV62TFRecPrdTnq = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFRecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFRecPrdTnq), 2, 0));
            AV63TFRecPrdTnq_To = (byte)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFRecPrdTnq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFRecPrdTnq_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE") == 0 )
         {
            AV64TFRecLote = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFRecLote", AV64TFRecLote);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE_SEL") == 0 )
         {
            AV65TFRecLote_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFRecLote_Sel", AV65TFRecLote_Sel);
         }
         AV127GXV1 = (int)(AV127GXV1+1) ;
      }
      GXt_char3 = "" ;
      GXv_char6[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFProForCod_Sel)==0), AV45TFProForCod_Sel, GXv_char6) ;
      recetasdeacabado02_wp_impl.this.GXt_char3 = GXv_char6[0] ;
      GXt_char17 = "" ;
      GXv_char5[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFProForDsc_Sel)==0), AV47TFProForDsc_Sel, GXv_char5) ;
      recetasdeacabado02_wp_impl.this.GXt_char17 = GXv_char5[0] ;
      GXt_char18 = "" ;
      GXv_char4[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFRecPrdNum_Sel)==0), AV51TFRecPrdNum_Sel, GXv_char4) ;
      recetasdeacabado02_wp_impl.this.GXt_char18 = GXv_char4[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFRecPrdDsc_Sel)==0), AV53TFRecPrdDsc_Sel, GXv_char20) ;
      recetasdeacabado02_wp_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFForPrdDsc_Sel)==0), AV59TFForPrdDsc_Sel, GXv_char22) ;
      recetasdeacabado02_wp_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFRecLote_Sel)==0), AV65TFRecLote_Sel, GXv_char24) ;
      recetasdeacabado02_wp_impl.this.GXt_char23 = GXv_char24[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char3+"|"+GXt_char17+"||"+GXt_char18+"|"+GXt_char19+"|||"+GXt_char21+"|||"+GXt_char23 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFProForCod)==0), AV44TFProForCod, GXv_char24) ;
      recetasdeacabado02_wp_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFProForDsc)==0), AV46TFProForDsc, GXv_char22) ;
      recetasdeacabado02_wp_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFRecPrdNum)==0), AV50TFRecPrdNum, GXv_char20) ;
      recetasdeacabado02_wp_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char18 = "" ;
      GXv_char6[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFRecPrdDsc)==0), AV52TFRecPrdDsc, GXv_char6) ;
      recetasdeacabado02_wp_impl.this.GXt_char18 = GXv_char6[0] ;
      GXt_char17 = "" ;
      GXv_char5[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFForPrdDsc)==0), AV58TFForPrdDsc, GXv_char5) ;
      recetasdeacabado02_wp_impl.this.GXt_char17 = GXv_char5[0] ;
      GXt_char3 = "" ;
      GXv_char4[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFRecLote)==0), AV64TFRecLote, GXv_char4) ;
      recetasdeacabado02_wp_impl.this.GXt_char3 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV42TFRecLinPro) ? "" : GXutil.str( AV42TFRecLinPro, 2, 0))+"|"+GXt_char23+"|"+GXt_char21+"|"+((0==AV48TFRecLin) ? "" : GXutil.str( AV48TFRecLin, 4, 0))+"|"+GXt_char19+"|"+GXt_char18+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFFacCon)==0) ? "" : GXutil.str( AV54TFFacCon, 11, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFPrdCant)==0) ? "" : GXutil.str( AV56TFPrdCant, 11, 3))+"|"+GXt_char17+"|"+((0==AV60TFRecForNro) ? "" : GXutil.str( AV60TFRecForNro, 2, 0))+"|"+((0==AV62TFRecPrdTnq) ? "" : GXutil.str( AV62TFRecPrdTnq, 2, 0))+"|"+GXt_char3 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV43TFRecLinPro_To) ? "" : GXutil.str( AV43TFRecLinPro_To, 2, 0))+"|||"+((0==AV49TFRecLin_To) ? "" : GXutil.str( AV49TFRecLin_To, 4, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFFacCon_To)==0) ? "" : GXutil.str( AV55TFFacCon_To, 11, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFPrdCant_To)==0) ? "" : GXutil.str( AV57TFPrdCant_To, 11, 3))+"||"+((0==AV61TFRecForNro_To) ? "" : GXutil.str( AV61TFRecForNro_To, 2, 0))+"|"+((0==AV63TFRecPrdTnq_To) ? "" : GXutil.str( AV63TFRecPrdTnq_To, 2, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV21GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV21GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV21GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV21GridState.fromxml(AV41Session.getValue(AV126Pgmname+"GridState"), null, null);
      AV21GridState.setgxTv_SdtWWPGridState_Orderedby( AV23OrderedBy );
      AV21GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV24OrderedDsc );
      AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState25[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFRECLINPRO", "", !((0==AV42TFRecLinPro)&&(0==AV43TFRecLinPro_To)), (short)(0), GXutil.trim( GXutil.str( AV42TFRecLinPro, 2, 0)), GXutil.trim( GXutil.str( AV43TFRecLinPro_To, 2, 0))) ;
      AV21GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFPROFORCOD", "", !(GXutil.strcmp("", AV44TFProForCod)==0), (short)(0), AV44TFProForCod, "", !(GXutil.strcmp("", AV45TFProForCod_Sel)==0), AV45TFProForCod_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFPROFORDSC", "", !(GXutil.strcmp("", AV46TFProForDsc)==0), (short)(0), AV46TFProForDsc, "", !(GXutil.strcmp("", AV47TFProForDsc_Sel)==0), AV47TFProForDsc_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFRECLIN", "", !((0==AV48TFRecLin)&&(0==AV49TFRecLin_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFRecLin, 4, 0)), GXutil.trim( GXutil.str( AV49TFRecLin_To, 4, 0))) ;
      AV21GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFRECPRDNUM", "", !(GXutil.strcmp("", AV50TFRecPrdNum)==0), (short)(0), AV50TFRecPrdNum, "", !(GXutil.strcmp("", AV51TFRecPrdNum_Sel)==0), AV51TFRecPrdNum_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFRECPRDDSC", "", !(GXutil.strcmp("", AV52TFRecPrdDsc)==0), (short)(0), AV52TFRecPrdDsc, "", !(GXutil.strcmp("", AV53TFRecPrdDsc_Sel)==0), AV53TFRecPrdDsc_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFFACCON", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFFacCon)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFFacCon_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV54TFFacCon, 11, 5)), GXutil.trim( GXutil.str( AV55TFFacCon_To, 11, 5))) ;
      AV21GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFPRDCANT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFPrdCant)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFPrdCant_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV56TFPrdCant, 11, 3)), GXutil.trim( GXutil.str( AV57TFPrdCant_To, 11, 3))) ;
      AV21GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFFORPRDDSC", "", !(GXutil.strcmp("", AV58TFForPrdDsc)==0), (short)(0), AV58TFForPrdDsc, "", !(GXutil.strcmp("", AV59TFForPrdDsc_Sel)==0), AV59TFForPrdDsc_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFRECFORNRO", "", !((0==AV60TFRecForNro)&&(0==AV61TFRecForNro_To)), (short)(0), GXutil.trim( GXutil.str( AV60TFRecForNro, 2, 0)), GXutil.trim( GXutil.str( AV61TFRecForNro_To, 2, 0))) ;
      AV21GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFRECPRDTNQ", "", !((0==AV62TFRecPrdTnq)&&(0==AV63TFRecPrdTnq_To)), (short)(0), GXutil.trim( GXutil.str( AV62TFRecPrdTnq, 2, 0)), GXutil.trim( GXutil.str( AV63TFRecPrdTnq_To, 2, 0))) ;
      AV21GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFRECLOTE", "", !(GXutil.strcmp("", AV64TFRecLote)==0), (short)(0), AV64TFRecLote, "", !(GXutil.strcmp("", AV65TFRecLote_Sel)==0), AV65TFRecLote_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState25[0] ;
      AV21GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV21GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV126Pgmname+"GridState", AV21GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV19TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV19TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV126Pgmname );
      AV19TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV19TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV18HTTPRequest.getScriptName()+"?"+AV18HTTPRequest.getQuerystring() );
      AV19TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LRECET" );
      AV41Session.setValue("TrnContext", AV19TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e221HI2( )
   {
      /* Recfa_Isvalid Routine */
      returnInSub = false ;
      GXt_int1 = AV13RecVolPrd ;
      GXv_decimal26[0] = AV12RecFA ;
      GXv_int2[0] = AV78MaqVolRes ;
      GXv_int10[0] = (byte)(AV80VolMul) ;
      GXv_decimal27[0] = AV79RecTotKgs ;
      GXv_int28[0] = GXt_int1 ;
      new app.pcalvol(remoteHandle, context).execute( GXv_decimal26, GXv_int2, GXv_int10, GXv_decimal27, GXv_int28) ;
      recetasdeacabado02_wp_impl.this.AV12RecFA = GXv_decimal26[0] ;
      recetasdeacabado02_wp_impl.this.AV78MaqVolRes = GXv_int2[0] ;
      recetasdeacabado02_wp_impl.this.AV80VolMul = GXv_int10[0] ;
      recetasdeacabado02_wp_impl.this.AV79RecTotKgs = GXv_decimal27[0] ;
      recetasdeacabado02_wp_impl.this.GXt_int1 = GXv_int28[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12RecFA", GXutil.ltrimstr( AV12RecFA, 6, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV80VolMul", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80VolMul), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV80VolMul), "ZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV79RecTotKgs", GXutil.ltrimstr( AV79RecTotKgs, 10, 2));
      AV13RecVolPrd = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13RecVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13RecVolPrd), 5, 0));
      AV40Modif = ((AV13RecVolPrd==AV81RecVolPrdold) ? AV40Modif : httpContext.getMessage( "Y", "")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82ProgressIndicator", AV82ProgressIndicator);
   }

   public void e231HI2( )
   {
      /* Recvolprd_Controlvaluechanged Routine */
      returnInSub = false ;
      AV40Modif = ((AV13RecVolPrd==AV81RecVolPrdold) ? AV40Modif : httpContext.getMessage( "Y", "")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Modif", AV40Modif);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82ProgressIndicator", AV82ProgressIndicator);
   }

   public void e241HI2( )
   {
      /* Maqcod_Isvalid Routine */
      returnInSub = false ;
      GXv_char24[0] = AV6Emprcod ;
      GXv_char22[0] = AV14MaqCod ;
      GXv_int10[0] = AV87Flag ;
      new app.peximaq(remoteHandle, context).execute( GXv_char24, GXv_char22, GXv_int10) ;
      recetasdeacabado02_wp_impl.this.AV6Emprcod = GXv_char24[0] ;
      recetasdeacabado02_wp_impl.this.AV14MaqCod = GXv_char22[0] ;
      recetasdeacabado02_wp_impl.this.AV87Flag = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Emprcod", AV6Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV14MaqCod", AV14MaqCod);
      if ( (0==AV87Flag) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Maquina Inexistente", ""));
         GX_FocusControl = edtavMaqcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void wb_table5_182_1HI2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_cerrar_Internalname, tblTabledvelop_confirmpanel_cerrar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_cerrar.setProperty("Title", Dvelop_confirmpanel_cerrar_Title);
         ucDvelop_confirmpanel_cerrar.setProperty("ConfirmationText", Dvelop_confirmpanel_cerrar_Confirmationtext);
         ucDvelop_confirmpanel_cerrar.setProperty("YesButtonCaption", Dvelop_confirmpanel_cerrar_Yesbuttoncaption);
         ucDvelop_confirmpanel_cerrar.setProperty("NoButtonCaption", Dvelop_confirmpanel_cerrar_Nobuttoncaption);
         ucDvelop_confirmpanel_cerrar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_cerrar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_cerrar.setProperty("YesButtonPosition", Dvelop_confirmpanel_cerrar_Yesbuttonposition);
         ucDvelop_confirmpanel_cerrar.setProperty("ConfirmType", Dvelop_confirmpanel_cerrar_Confirmtype);
         ucDvelop_confirmpanel_cerrar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_cerrar_Internalname, "DVELOP_CONFIRMPANEL_CERRARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CERRARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_182_1HI2e( true) ;
      }
      else
      {
         wb_table5_182_1HI2e( false) ;
      }
   }

   public void wb_table4_177_1HI2( boolean wbgen )
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
         wb_table4_177_1HI2e( true) ;
      }
      else
      {
         wb_table4_177_1HI2e( false) ;
      }
   }

   public void wb_table3_172_1HI2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminar_Internalname, tblTabledvelop_confirmpanel_eliminar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminar.setProperty("Title", Dvelop_confirmpanel_eliminar_Title);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminar_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminar_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminar_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmType", Dvelop_confirmpanel_eliminar_Confirmtype);
         ucDvelop_confirmpanel_eliminar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminar_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_172_1HI2e( true) ;
      }
      else
      {
         wb_table3_172_1HI2e( false) ;
      }
   }

   public void wb_table2_167_1HI2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_elimimarproceso_Internalname, tblTabledvelop_confirmpanel_elimimarproceso_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_elimimarproceso.setProperty("Title", Dvelop_confirmpanel_elimimarproceso_Title);
         ucDvelop_confirmpanel_elimimarproceso.setProperty("ConfirmationText", Dvelop_confirmpanel_elimimarproceso_Confirmationtext);
         ucDvelop_confirmpanel_elimimarproceso.setProperty("YesButtonCaption", Dvelop_confirmpanel_elimimarproceso_Yesbuttoncaption);
         ucDvelop_confirmpanel_elimimarproceso.setProperty("NoButtonCaption", Dvelop_confirmpanel_elimimarproceso_Nobuttoncaption);
         ucDvelop_confirmpanel_elimimarproceso.setProperty("CancelButtonCaption", Dvelop_confirmpanel_elimimarproceso_Cancelbuttoncaption);
         ucDvelop_confirmpanel_elimimarproceso.setProperty("YesButtonPosition", Dvelop_confirmpanel_elimimarproceso_Yesbuttonposition);
         ucDvelop_confirmpanel_elimimarproceso.setProperty("ConfirmType", Dvelop_confirmpanel_elimimarproceso_Confirmtype);
         ucDvelop_confirmpanel_elimimarproceso.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_elimimarproceso_Internalname, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMIMARPROCESOContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_167_1HI2e( true) ;
      }
      else
      {
         wb_table2_167_1HI2e( false) ;
      }
   }

   public void wb_table1_71_1HI2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedmaqcod_Internalname, tblTablemergedmaqcod_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcod_Internalname, httpContext.getMessage( "Maquina", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_129_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, GXutil.rtrim( AV14MaqCod), GXutil.rtrim( localUtil.format( AV14MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeAcabado02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Static images/pictures */
         ClassString = "Image" + " " + ((GXutil.strcmp(imgPrompt_maqcod_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgPrompt_maqcod_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgPrompt_maqcod_Internalname, sImgUrl, imgPrompt_maqcod_Link, "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RecetasdeAcabado02_WP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_71_1HI2e( true) ;
      }
      else
      {
         wb_table1_71_1HI2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV6Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Emprcod", AV6Emprcod);
      AV7Barcod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Barcod), 8, 0));
      AV8Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodreo", GXutil.str( AV8Barcodreo, 1, 0));
      AV9Barcodpar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Barcodpar", AV9Barcodpar);
      AV11RecLinMaq = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11RecLinMaq), 4, 0));
      Gx_mode = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
      pa1HI2( ) ;
      ws1HI2( ) ;
      we1HI2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116134462", true, true);
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
      httpContext.AddJavascriptSource("recetasdeacabado02_wp.js", "?202682116134462", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1292( )
   {
      cmbavGrupodeaccionesgrid.setInternalname( "vGRUPODEACCIONESGRID_"+sGXsfl_129_idx );
      edtRecLinPro_Internalname = "RECLINPRO_"+sGXsfl_129_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_129_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_129_idx ;
      edtRecLin_Internalname = "RECLIN_"+sGXsfl_129_idx ;
      edtRecPrdNum_Internalname = "RECPRDNUM_"+sGXsfl_129_idx ;
      edtRecPrdDsc_Internalname = "RECPRDDSC_"+sGXsfl_129_idx ;
      edtFacCon_Internalname = "FACCON_"+sGXsfl_129_idx ;
      edtPrdCant_Internalname = "PRDCANT_"+sGXsfl_129_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_129_idx ;
      edtRecForNro_Internalname = "RECFORNRO_"+sGXsfl_129_idx ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ_"+sGXsfl_129_idx ;
      edtRecLote_Internalname = "RECLOTE_"+sGXsfl_129_idx ;
      edtPrdRGB_Internalname = "PRDRGB_"+sGXsfl_129_idx ;
      edtavPrdrgb_Internalname = "vPRDRGB_"+sGXsfl_129_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_129_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_129_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_129_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_129_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_129_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_129_idx ;
      edtProForFab_Internalname = "PROFORFAB_"+sGXsfl_129_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_129_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_129_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_129_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_129_idx ;
      edtRecLinMaq_Internalname = "RECLINMAQ_"+sGXsfl_129_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_129_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_129_idx ;
   }

   public void subsflControlProps_fel_1292( )
   {
      cmbavGrupodeaccionesgrid.setInternalname( "vGRUPODEACCIONESGRID_"+sGXsfl_129_fel_idx );
      edtRecLinPro_Internalname = "RECLINPRO_"+sGXsfl_129_fel_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_129_fel_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_129_fel_idx ;
      edtRecLin_Internalname = "RECLIN_"+sGXsfl_129_fel_idx ;
      edtRecPrdNum_Internalname = "RECPRDNUM_"+sGXsfl_129_fel_idx ;
      edtRecPrdDsc_Internalname = "RECPRDDSC_"+sGXsfl_129_fel_idx ;
      edtFacCon_Internalname = "FACCON_"+sGXsfl_129_fel_idx ;
      edtPrdCant_Internalname = "PRDCANT_"+sGXsfl_129_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_129_fel_idx ;
      edtRecForNro_Internalname = "RECFORNRO_"+sGXsfl_129_fel_idx ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ_"+sGXsfl_129_fel_idx ;
      edtRecLote_Internalname = "RECLOTE_"+sGXsfl_129_fel_idx ;
      edtPrdRGB_Internalname = "PRDRGB_"+sGXsfl_129_fel_idx ;
      edtavPrdrgb_Internalname = "vPRDRGB_"+sGXsfl_129_fel_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_129_fel_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_129_fel_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_129_fel_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_129_fel_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_129_fel_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_129_fel_idx ;
      edtProForFab_Internalname = "PROFORFAB_"+sGXsfl_129_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_129_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_129_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_129_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_129_fel_idx ;
      edtRecLinMaq_Internalname = "RECLINMAQ_"+sGXsfl_129_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_129_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_129_fel_idx ;
   }

   public void sendrow_1292( )
   {
      subsflControlProps_1292( ) ;
      wb1HI0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_129_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
      {
         GridRow = GXWebRow.GetNew(context,GridContainer) ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            subGrid_Backcolor = subGrid_Allbackcolor ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Uniform" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
            subGrid_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_129_idx) % (2))) == 0 )
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Even" ;
               }
            }
            else
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Odd" ;
               }
            }
         }
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_129_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeaccionesgrid.getEnabled()!=0)&&(cmbavGrupodeaccionesgrid.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 130,'',false,'"+sGXsfl_129_idx+"',129)\"" : " ") ;
         if ( ( cmbavGrupodeaccionesgrid.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONESGRID_" + sGXsfl_129_idx ;
            cmbavGrupodeaccionesgrid.setName( GXCCtl );
            cmbavGrupodeaccionesgrid.setWebtags( "" );
            if ( cmbavGrupodeaccionesgrid.getItemCount() > 0 )
            {
               AV74GrupodeaccionesGrid = (short)(GXutil.lval( cmbavGrupodeaccionesgrid.getValidValue(GXutil.trim( GXutil.str( AV74GrupodeaccionesGrid, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeaccionesgrid.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74GrupodeaccionesGrid), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeaccionesgrid,cmbavGrupodeaccionesgrid.getInternalname(),GXutil.trim( GXutil.str( AV74GrupodeaccionesGrid, 4, 0)),Integer.valueOf(1),cmbavGrupodeaccionesgrid.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e291hi2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeaccionesgrid.getEnabled()!=0)&&(cmbavGrupodeaccionesgrid.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,130);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeaccionesgrid.setValue( GXutil.trim( GXutil.str( AV74GrupodeaccionesGrid, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeaccionesgrid.getInternalname(), "Values", cmbavGrupodeaccionesgrid.ToJavascriptSource(), !bGXsfl_129_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinPro_Internalname,GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,GXutil.rtrim( A764ProForCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDsc_Internalname,GXutil.rtrim( A766ProForDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLin_Internalname,GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdNum_Internalname,GXutil.rtrim( A872RecPrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtRecPrdDsc_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdDsc_Internalname,GXutil.rtrim( A875RecPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtRecPrdDsc_Forecolor)+";"+((edtRecPrdDsc_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtRecPrdDsc_Backcolor)+";"),ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacCon_Internalname,GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A431FacCon, "ZZZZ9.99999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCant_Internalname,GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A686PrdCant, "ZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecForNro_Internalname,GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2394RecForNro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecForNro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdTnq_Internalname,GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3274RecPrdTnq), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdTnq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLote_Internalname,GXutil.rtrim( A5725RecLote),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRGB_Internalname,GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13232PrdRGB), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdRGB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdrgb_Enabled!=0)&&(edtavPrdrgb_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 144,'',false,'"+sGXsfl_129_idx+"',129)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdrgb_Internalname,GXutil.ltrim( localUtil.ntoc( AV25PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrdrgb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25PrdRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV25PrdRGB), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavPrdrgb_Enabled!=0)&&(edtavPrdrgb_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,144);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrdrgb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPrdrgb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 145,'',false,'"+sGXsfl_129_idx+"',129)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR_Internalname,GXutil.ltrim( localUtil.ntoc( AV26R, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV26R), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV26R), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,145);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 146,'',false,'"+sGXsfl_129_idx+"',129)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG_Internalname,GXutil.ltrim( localUtil.ntoc( AV27G, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV27G), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV27G), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 147,'',false,'"+sGXsfl_129_idx+"',129)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB_Internalname,GXutil.ltrim( localUtil.ntoc( AV28B, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV28B), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV28B), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,147);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 148,'',false,'"+sGXsfl_129_idx+"',129)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR2_Internalname,GXutil.ltrim( localUtil.ntoc( AV29R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV29R2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV29R2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,148);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 149,'',false,'"+sGXsfl_129_idx+"',129)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG2_Internalname,GXutil.ltrim( localUtil.ntoc( AV30G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV30G2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV30G2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,149);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 150,'',false,'"+sGXsfl_129_idx+"',129)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB2_Internalname,GXutil.ltrim( localUtil.ntoc( AV31B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV31B2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV31B2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,150);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForFab_Internalname,GXutil.rtrim( A6018ProForFab),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForFab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(129),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1HI2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_129_idx = ((subGrid_Islastpage==1)&&(nGXsfl_129_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_129_idx+1) ;
         sGXsfl_129_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_129_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1292( ) ;
      }
      /* End function sendrow_1292 */
   }

   public void startgridcontrol129( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"129\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            subGrid_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid_Class) > 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Title" ;
            }
         }
         else
         {
            subGrid_Titlebackstyle = (byte)(1) ;
            if ( subGrid_Backcolorstyle == 1 )
            {
               subGrid_Titlebackcolor = subGrid_Allbackcolor ;
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tq", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "RGB", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "RGB", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "G", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "B", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "G2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "B2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Reoperado Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Particion Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad Medida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            GridContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            GridContainer.Clear();
         }
         GridContainer.SetWrapped(nGXWrapped);
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV74GrupodeaccionesGrid, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A764ProForCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A766ProForDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A872RecPrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A875RecPrdDsc));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5725RecLote));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV25PrdRGB, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdrgb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV26R, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV27G, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV28B, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV29R2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV30G2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV31B2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6018ProForFab));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavBarnhdr_Internalname = "vBARNHDR" ;
      edtavReclinmaq_Internalname = "vRECLINMAQ" ;
      edtavModo_Internalname = "vMODO" ;
      edtavModif_Internalname = "vMODIF" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      edtavBartipcol_Internalname = "vBARTIPCOL" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTextblockmaqcod_Internalname = "TEXTBLOCKMAQCOD" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      imgPrompt_maqcod_Internalname = "PROMPT_MAQCOD" ;
      tblTablemergedmaqcod_Internalname = "TABLEMERGEDMAQCOD" ;
      divTablesplittedmaqcod_Internalname = "TABLESPLITTEDMAQCOD" ;
      edtavRectotkgs_Internalname = "vRECTOTKGS" ;
      edtavRecfa_Internalname = "vRECFA" ;
      edtavRecvolprd_Internalname = "vRECVOLPRD" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      bttBtneliminar_Internalname = "BTNELIMINAR" ;
      bttBtnimprimir_Internalname = "BTNIMPRIMIR" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      bttBtnadd_Internalname = "BTNADD" ;
      bttBtneliminarprocesos_Internalname = "BTNELIMINARPROCESOS" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      cmbavGrupodeaccionesgrid.setInternalname( "vGRUPODEACCIONESGRID" );
      edtRecLinPro_Internalname = "RECLINPRO" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtRecLin_Internalname = "RECLIN" ;
      edtRecPrdNum_Internalname = "RECPRDNUM" ;
      edtRecPrdDsc_Internalname = "RECPRDDSC" ;
      edtFacCon_Internalname = "FACCON" ;
      edtPrdCant_Internalname = "PRDCANT" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtRecForNro_Internalname = "RECFORNRO" ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ" ;
      edtRecLote_Internalname = "RECLOTE" ;
      edtPrdRGB_Internalname = "PRDRGB" ;
      edtavPrdrgb_Internalname = "vPRDRGB" ;
      edtavR_Internalname = "vR" ;
      edtavG_Internalname = "vG" ;
      edtavB_Internalname = "vB" ;
      edtavR2_Internalname = "vR2" ;
      edtavG2_Internalname = "vG2" ;
      edtavB2_Internalname = "vB2" ;
      edtProForFab_Internalname = "PROFORFAB" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtRecLinMaq_Internalname = "RECLINMAQ" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      edtavClicod_Internalname = "vCLICOD" ;
      Dvelop_confirmpanel_elimimarproceso_Internalname = "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO" ;
      tblTabledvelop_confirmpanel_elimimarproceso_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMIMARPROCESO" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_confirmar_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
      Dvelop_confirmpanel_cerrar_Internalname = "DVELOP_CONFIRMPANEL_CERRAR" ;
      tblTabledvelop_confirmpanel_cerrar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CERRAR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
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
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtRecLinMaq_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtProForFab_Jsonclick = "" ;
      edtavB2_Jsonclick = "" ;
      edtavB2_Visible = 0 ;
      edtavB2_Enabled = 1 ;
      edtavG2_Jsonclick = "" ;
      edtavG2_Visible = 0 ;
      edtavG2_Enabled = 1 ;
      edtavR2_Jsonclick = "" ;
      edtavR2_Visible = 0 ;
      edtavR2_Enabled = 1 ;
      edtavB_Jsonclick = "" ;
      edtavB_Visible = 0 ;
      edtavB_Enabled = 1 ;
      edtavG_Jsonclick = "" ;
      edtavG_Visible = 0 ;
      edtavG_Enabled = 1 ;
      edtavR_Jsonclick = "" ;
      edtavR_Visible = 0 ;
      edtavR_Enabled = 1 ;
      edtavPrdrgb_Jsonclick = "" ;
      edtavPrdrgb_Visible = 0 ;
      edtavPrdrgb_Enabled = 1 ;
      edtPrdRGB_Jsonclick = "" ;
      edtRecLote_Jsonclick = "" ;
      edtRecPrdTnq_Jsonclick = "" ;
      edtRecForNro_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtPrdCant_Jsonclick = "" ;
      edtFacCon_Jsonclick = "" ;
      edtRecPrdDsc_Jsonclick = "" ;
      edtRecPrdDsc_Forecolor = (int)(0x000000) ;
      edtRecPrdDsc_Backcolor = -1 ;
      edtRecPrdNum_Jsonclick = "" ;
      edtRecLin_Jsonclick = "" ;
      edtProForDsc_Jsonclick = "" ;
      edtProForCod_Jsonclick = "" ;
      edtRecLinPro_Jsonclick = "" ;
      cmbavGrupodeaccionesgrid.setJsonclick( "" );
      cmbavGrupodeaccionesgrid.setVisible( -1 );
      cmbavGrupodeaccionesgrid.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      imgPrompt_maqcod_Link = "" ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Visible = 1 ;
      edtavRecvolprd_Jsonclick = "" ;
      edtavRecvolprd_Enabled = 1 ;
      edtavRecfa_Jsonclick = "" ;
      edtavRecfa_Enabled = 1 ;
      edtavRectotkgs_Jsonclick = "" ;
      edtavRectotkgs_Enabled = 1 ;
      edtavBartipcol_Jsonclick = "" ;
      edtavBartipcol_Enabled = 1 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 1 ;
      edtavModif_Jsonclick = "" ;
      edtavModif_Enabled = 1 ;
      edtavModo_Jsonclick = "" ;
      edtavModo_Enabled = 1 ;
      edtavReclinmaq_Jsonclick = "" ;
      edtavReclinmaq_Enabled = 0 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 1 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_cerrar_Confirmtype = "1" ;
      Dvelop_confirmpanel_cerrar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_cerrar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_cerrar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_cerrar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_cerrar_Confirmationtext = "¿Desea cerrar?" ;
      Dvelop_confirmpanel_cerrar_Title = "" ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma los datos?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la Receta?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Dvelop_confirmpanel_elimimarproceso_Confirmtype = "1" ;
      Dvelop_confirmpanel_elimimarproceso_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_elimimarproceso_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_elimimarproceso_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_elimimarproceso_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_elimimarproceso_Confirmationtext = "¿Desea eliminar el proceso?" ;
      Dvelop_confirmpanel_elimimarproceso_Title = "" ;
      Ddo_grid_Datalistproc = "RecetasdeAcabado02_WPGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic||Dynamic|Dynamic|||Dynamic|||Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T||T|T|||T|||T" ;
      Ddo_grid_Filterisrange = "T|||T|||T|T||T|T|" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric|Character|Character|Numeric|Numeric|Character|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10|11|12" ;
      Ddo_grid_Columnids = "1:RecLinPro|2:ProForCod|3:ProForDsc|4:RecLin|5:RecPrdNum|6:RecPrdDsc|7:FacCon|8:PrdCant|9:ForPrdDsc|10:RecForNro|11:RecPrdTnq|12:RecLote" ;
      Ddo_grid_Gridinternalname = "" ;
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridpaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridpaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridpaginationbar_Pagingcaptionposition = "Left" ;
      Gridpaginationbar_Pagingbuttonsposition = "Right" ;
      Gridpaginationbar_Pagestoshow = 5 ;
      Gridpaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Class = "PaginationBar" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = "" ;
      Dvpanel_unnamedtable3_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Datos cabecera", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Recetas de Acabado (Mto)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRUPODEACCIONESGRID_" + sGXsfl_129_idx ;
      cmbavGrupodeaccionesgrid.setName( GXCCtl );
      cmbavGrupodeaccionesgrid.setWebtags( "" );
      if ( cmbavGrupodeaccionesgrid.getItemCount() > 0 )
      {
         AV74GrupodeaccionesGrid = (short)(GXutil.lval( cmbavGrupodeaccionesgrid.getValidValue(GXutil.trim( GXutil.str( AV74GrupodeaccionesGrid, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeaccionesgrid.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74GrupodeaccionesGrid), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV72Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV42TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV43TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV44TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV45TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV46TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV47TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV48TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV49TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV50TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV51TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV52TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV53TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV54TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV55TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV56TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV57TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV58TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV59TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV60TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV61TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV62TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV63TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV64TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV65TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV85Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV86Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV78MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9',hsh:true},{av:'AV80VolMul',fld:'vVOLMUL',pic:'ZZZ9',hsh:true},{av:'AV81RecVolPrdold',fld:'vRECVOLPRDOLD',pic:'ZZZZ9',hsh:true},{av:'AV38BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV79RecTotKgs',fld:'vRECTOTKGS',pic:'ZZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV70GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV71GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV40Modif',fld:'vMODIF',pic:''},{av:'AV72Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e131HI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV72Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV42TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV43TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV44TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV45TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV46TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV47TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV48TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV49TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV50TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV51TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV52TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV53TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV54TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV55TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV56TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV57TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV58TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV59TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV60TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV61TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV62TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV63TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV64TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV65TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV85Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV86Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV78MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9',hsh:true},{av:'AV80VolMul',fld:'vVOLMUL',pic:'ZZZ9',hsh:true},{av:'AV81RecVolPrdold',fld:'vRECVOLPRDOLD',pic:'ZZZZ9',hsh:true},{av:'AV38BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV79RecTotKgs',fld:'vRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e141HI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV72Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV42TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV43TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV44TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV45TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV46TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV47TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV48TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV49TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV50TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV51TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV52TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV53TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV54TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV55TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV56TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV57TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV58TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV59TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV60TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV61TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV62TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV63TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV64TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV65TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV85Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV86Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV78MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9',hsh:true},{av:'AV80VolMul',fld:'vVOLMUL',pic:'ZZZ9',hsh:true},{av:'AV81RecVolPrdold',fld:'vRECVOLPRDOLD',pic:'ZZZZ9',hsh:true},{av:'AV38BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV79RecTotKgs',fld:'vRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e151HI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV72Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV42TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV43TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV44TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV45TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV46TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV47TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV48TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV49TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV50TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV51TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV52TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV53TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV54TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV55TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV56TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV57TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV58TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV59TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV60TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV61TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV62TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV63TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV64TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV65TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV85Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV86Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV78MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9',hsh:true},{av:'AV80VolMul',fld:'vVOLMUL',pic:'ZZZ9',hsh:true},{av:'AV81RecVolPrdold',fld:'vRECVOLPRDOLD',pic:'ZZZZ9',hsh:true},{av:'AV38BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV79RecTotKgs',fld:'vRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV65TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV62TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV63TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV60TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV61TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV58TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV59TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV56TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV57TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV54TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV55TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV52TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV53TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV50TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV51TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV48TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV49TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV46TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV47TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV44TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV45TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV42TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV43TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e281HI2',iparms:[{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeaccionesgrid'},{av:'AV74GrupodeaccionesGrid',fld:'vGRUPODEACCIONESGRID',pic:'ZZZ9'},{av:'AV25PrdRGB',fld:'vPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV31B2',fld:'vB2',pic:'ZZ9'},{av:'AV30G2',fld:'vG2',pic:'ZZ9'},{av:'AV29R2',fld:'vR2',pic:'ZZ9'},{av:'AV28B',fld:'vB',pic:'ZZ9'},{av:'AV27G',fld:'vG',pic:'ZZ9'},{av:'AV26R',fld:'vR',pic:'ZZ9'},{av:'edtRecPrdDsc_Backcolor',ctrl:'RECPRDDSC',prop:'Backcolor'},{av:'edtRecPrdDsc_Forecolor',ctrl:'RECPRDDSC',prop:'Forecolor'}]}");
      setEventMetadata("VGRUPODEACCIONESGRID.CLICK","{handler:'e291HI2',iparms:[{av:'cmbavGrupodeaccionesgrid'},{av:'AV74GrupodeaccionesGrid',fld:'vGRUPODEACCIONESGRID',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9',hsh:true},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9',hsh:true},{av:'AV40Modif',fld:'vMODIF',pic:''},{av:'AV79RecTotKgs',fld:'vRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV13RecVolPrd',fld:'vRECVOLPRD',pic:'ZZZZ9'},{av:'AV77FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV38BarNHdr',fld:'vBARNHDR',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A6018ProForFab',fld:'PROFORFAB',pic:''}]");
      setEventMetadata("VGRUPODEACCIONESGRID.CLICK",",oparms:[{av:'cmbavGrupodeaccionesgrid'},{av:'AV74GrupodeaccionesGrid',fld:'vGRUPODEACCIONESGRID',pic:'ZZZ9'}]}");
      setEventMetadata("'DOADD'","{handler:'e191HI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV72Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV42TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV43TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV44TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV45TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV46TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV47TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV48TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV49TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV50TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV51TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV52TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV53TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV54TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV55TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV56TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV57TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV58TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV59TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV60TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV61TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV62TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV63TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV64TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV65TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV85Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV86Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV78MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9',hsh:true},{av:'AV80VolMul',fld:'vVOLMUL',pic:'ZZZ9',hsh:true},{av:'AV81RecVolPrdold',fld:'vRECVOLPRDOLD',pic:'ZZZZ9',hsh:true},{av:'AV38BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV79RecTotKgs',fld:'vRECTOTKGS',pic:'ZZZZZZ9.99'}]");
      setEventMetadata("'DOADD'",",oparms:[{av:'AV72Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV70GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV71GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV40Modif',fld:'vMODIF',pic:''}]}");
      setEventMetadata("'DOELIMINARPROCESOS'","{handler:'e201HI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV72Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV42TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV43TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV44TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV45TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV46TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV47TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV48TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV49TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV50TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV51TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV52TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV53TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV54TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV55TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV56TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV57TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV58TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV59TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV60TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV61TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV62TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV63TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV64TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV65TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV85Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV86Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV78MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9',hsh:true},{av:'AV80VolMul',fld:'vVOLMUL',pic:'ZZZ9',hsh:true},{av:'AV81RecVolPrdold',fld:'vRECVOLPRDOLD',pic:'ZZZZ9',hsh:true},{av:'AV38BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV79RecTotKgs',fld:'vRECTOTKGS',pic:'ZZZZZZ9.99'}]");
      setEventMetadata("'DOELIMINARPROCESOS'",",oparms:[{av:'AV70GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV71GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV40Modif',fld:'vMODIF',pic:''},{av:'AV72Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'}]}");
      setEventMetadata("'DOELIMINAR'","{handler:'e111HI1',iparms:[]");
      setEventMetadata("'DOELIMINAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e161HI2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9812RecHdrLts',fld:'RECHDRLTS',pic:''},{av:'A9764RecLtsSR',fld:'RECLTSSR',pic:'ZZZZ9'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV126Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV85Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV86Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'A9764RecLtsSR',fld:'RECLTSSR',pic:'ZZZZ9'},{av:'A9812RecHdrLts',fld:'RECHDRLTS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOIMPRIMIR'","{handler:'e251HI2',iparms:[{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV14MaqCod',fld:'vMAQCOD',pic:''},{av:'AV13RecVolPrd',fld:'vRECVOLPRD',pic:'ZZZZ9'},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV84ImpCod',fld:'vIMPCOD',pic:''}]");
      setEventMetadata("'DOIMPRIMIR'",",oparms:[{av:'AV84ImpCod',fld:'vIMPCOD',pic:''},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV13RecVolPrd',fld:'vRECVOLPRD',pic:'ZZZZ9'},{av:'AV14MaqCod',fld:'vMAQCOD',pic:''},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e211HI2',iparms:[{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14MaqCod',fld:'vMAQCOD',pic:''},{av:'AV40Modif',fld:'vMODIF',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV14MaqCod',fld:'vMAQCOD',pic:''},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_confirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e171HI2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV14MaqCod',fld:'vMAQCOD',pic:''},{av:'AV12RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV13RecVolPrd',fld:'vRECVOLPRD',pic:'ZZZZ9'},{av:'AV40Modif',fld:'vMODIF',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV13RecVolPrd',fld:'vRECVOLPRD',pic:'ZZZZ9'},{av:'AV12RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV14MaqCod',fld:'vMAQCOD',pic:''},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e121HI1',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CERRAR.CLOSE","{handler:'e181HI2',iparms:[{av:'Dvelop_confirmpanel_cerrar_Result',ctrl:'DVELOP_CONFIRMPANEL_CERRAR',prop:'Result'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CERRAR.CLOSE",",oparms:[]}");
      setEventMetadata("VRECFA.ISVALID","{handler:'e221HI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV72Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV42TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV43TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV44TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV45TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV46TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV47TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV48TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV49TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV50TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV51TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV52TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV53TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV54TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV55TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV56TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV57TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV58TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV59TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV60TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV61TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV62TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV63TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV64TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV65TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV85Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV86Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV78MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9',hsh:true},{av:'AV80VolMul',fld:'vVOLMUL',pic:'ZZZ9',hsh:true},{av:'AV81RecVolPrdold',fld:'vRECVOLPRDOLD',pic:'ZZZZ9',hsh:true},{av:'AV38BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV79RecTotKgs',fld:'vRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV12RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV40Modif',fld:'vMODIF',pic:''}]");
      setEventMetadata("VRECFA.ISVALID",",oparms:[{av:'AV13RecVolPrd',fld:'vRECVOLPRD',pic:'ZZZZ9'},{av:'AV40Modif',fld:'vMODIF',pic:''},{av:'AV70GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV71GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV72Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'}]}");
      setEventMetadata("VRECVOLPRD.CONTROLVALUECHANGED","{handler:'e231HI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV72Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV42TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV43TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV44TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV45TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV46TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV47TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV48TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV49TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV50TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV51TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV52TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV53TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV54TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV55TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV56TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV57TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV58TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV59TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV60TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV61TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV62TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV63TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV64TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV65TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV126Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV23OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV24OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV85Usurcod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV86Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV78MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9',hsh:true},{av:'AV80VolMul',fld:'vVOLMUL',pic:'ZZZ9',hsh:true},{av:'AV81RecVolPrdold',fld:'vRECVOLPRDOLD',pic:'ZZZZ9',hsh:true},{av:'AV38BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV79RecTotKgs',fld:'vRECTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV13RecVolPrd',fld:'vRECVOLPRD',pic:'ZZZZ9'},{av:'AV40Modif',fld:'vMODIF',pic:''}]");
      setEventMetadata("VRECVOLPRD.CONTROLVALUECHANGED",",oparms:[{av:'AV40Modif',fld:'vMODIF',pic:''},{av:'AV70GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV71GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV9Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV8Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV7Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV72Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'}]}");
      setEventMetadata("VMAQCOD.ISVALID","{handler:'e241HI2',iparms:[{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14MaqCod',fld:'vMAQCOD',pic:''}]");
      setEventMetadata("VMAQCOD.ISVALID",",oparms:[{av:'AV14MaqCod',fld:'vMAQCOD',pic:''},{av:'AV6Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALIDV_RECLINMAQ","{handler:'validv_Reclinmaq',iparms:[]");
      setEventMetadata("VALIDV_RECLINMAQ",",oparms:[]}");
      setEventMetadata("VALID_RECLINPRO","{handler:'valid_Reclinpro',iparms:[]");
      setEventMetadata("VALID_RECLINPRO",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_RECLINMAQ","{handler:'valid_Reclinmaq',iparms:[]");
      setEventMetadata("VALID_RECLINMAQ",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[]}");
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
      wcpOAV6Emprcod = "" ;
      wcpOAV9Barcodpar = "" ;
      wcpOGx_mode = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_elimimarproceso_Result = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      Dvelop_confirmpanel_cerrar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV6Emprcod = "" ;
      AV9Barcodpar = "" ;
      Gx_mode = "" ;
      AV44TFProForCod = "" ;
      AV45TFProForCod_Sel = "" ;
      AV46TFProForDsc = "" ;
      AV47TFProForDsc_Sel = "" ;
      AV50TFRecPrdNum = "" ;
      AV51TFRecPrdNum_Sel = "" ;
      AV52TFRecPrdDsc = "" ;
      AV53TFRecPrdDsc_Sel = "" ;
      AV54TFFacCon = DecimalUtil.ZERO ;
      AV55TFFacCon_To = DecimalUtil.ZERO ;
      AV56TFPrdCant = DecimalUtil.ZERO ;
      AV57TFPrdCant_To = DecimalUtil.ZERO ;
      AV58TFForPrdDsc = "" ;
      AV59TFForPrdDsc_Sel = "" ;
      AV64TFRecLote = "" ;
      AV65TFRecLote_Sel = "" ;
      AV126Pgmname = "" ;
      AV77FecPan = GXutil.nullDate() ;
      AV85Usurcod = "" ;
      AV86Station = "" ;
      AV38BarNHdr = "" ;
      AV79RecTotKgs = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV68DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A9812RecHdrLts = "" ;
      AV84ImpCod = "" ;
      AV88Modif2 = "" ;
      AV119Emprcod_selected = "" ;
      AV122Barcodpar_selected = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV39Modo = "" ;
      AV40Modif = "" ;
      AV33CliNom = "" ;
      AV34BarSer = "" ;
      AV35BarColNom = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTextblockmaqcod_Jsonclick = "" ;
      AV12RecFA = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      bttBtneliminar_Jsonclick = "" ;
      bttBtnimprimir_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      bttBtnadd_Jsonclick = "" ;
      bttBtneliminarprocesos_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A5725RecLote = "" ;
      A6018ProForFab = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A719PrdNum = "" ;
      scmdbuf = "" ;
      lV97Recetasdeacabado02_wpds_3_tfproforcod = "" ;
      lV99Recetasdeacabado02_wpds_5_tfprofordsc = "" ;
      lV103Recetasdeacabado02_wpds_9_tfrecprdnum = "" ;
      lV105Recetasdeacabado02_wpds_11_tfrecprddsc = "" ;
      lV111Recetasdeacabado02_wpds_17_tfforprddsc = "" ;
      lV117Recetasdeacabado02_wpds_23_tfreclote = "" ;
      AV98Recetasdeacabado02_wpds_4_tfproforcod_sel = "" ;
      AV97Recetasdeacabado02_wpds_3_tfproforcod = "" ;
      AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel = "" ;
      AV99Recetasdeacabado02_wpds_5_tfprofordsc = "" ;
      AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel = "" ;
      AV103Recetasdeacabado02_wpds_9_tfrecprdnum = "" ;
      AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel = "" ;
      AV105Recetasdeacabado02_wpds_11_tfrecprddsc = "" ;
      AV107Recetasdeacabado02_wpds_13_tffaccon = DecimalUtil.ZERO ;
      AV108Recetasdeacabado02_wpds_14_tffaccon_to = DecimalUtil.ZERO ;
      AV109Recetasdeacabado02_wpds_15_tfprdcant = DecimalUtil.ZERO ;
      AV110Recetasdeacabado02_wpds_16_tfprdcant_to = DecimalUtil.ZERO ;
      AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel = "" ;
      AV111Recetasdeacabado02_wpds_17_tfforprddsc = "" ;
      AV118Recetasdeacabado02_wpds_24_tfreclote_sel = "" ;
      AV117Recetasdeacabado02_wpds_23_tfreclote = "" ;
      H01HI2_A9812RecHdrLts = new String[] {""} ;
      H01HI2_n9812RecHdrLts = new boolean[] {false} ;
      H01HI2_A9764RecLtsSR = new int[1] ;
      H01HI2_n9764RecLtsSR = new boolean[] {false} ;
      H01HI2_A490ForPrdUMe = new byte[1] ;
      H01HI2_n490ForPrdUMe = new boolean[] {false} ;
      H01HI2_A719PrdNum = new String[] {""} ;
      H01HI2_n719PrdNum = new boolean[] {false} ;
      H01HI2_A2804RecLinMaq = new short[1] ;
      H01HI2_A130BarCodPar = new String[] {""} ;
      H01HI2_A132BarCodReo = new byte[1] ;
      H01HI2_A129BarCod = new int[1] ;
      H01HI2_A396EmprCod = new String[] {""} ;
      H01HI2_A6018ProForFab = new String[] {""} ;
      H01HI2_n6018ProForFab = new boolean[] {false} ;
      H01HI2_A13232PrdRGB = new long[1] ;
      H01HI2_A5725RecLote = new String[] {""} ;
      H01HI2_A3274RecPrdTnq = new byte[1] ;
      H01HI2_A2394RecForNro = new byte[1] ;
      H01HI2_A488ForPrdDsc = new String[] {""} ;
      H01HI2_n488ForPrdDsc = new boolean[] {false} ;
      H01HI2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01HI2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01HI2_A875RecPrdDsc = new String[] {""} ;
      H01HI2_A872RecPrdNum = new String[] {""} ;
      H01HI2_A811RecLin = new short[1] ;
      H01HI2_A766ProForDsc = new String[] {""} ;
      H01HI2_A764ProForCod = new String[] {""} ;
      H01HI2_A1273RecLinPro = new byte[1] ;
      H01HI3_AGRID_nRecordCount = new long[1] ;
      AV14MaqCod = "" ;
      hsh = "" ;
      H01HI4_A2804RecLinMaq = new short[1] ;
      H01HI4_A130BarCodPar = new String[] {""} ;
      H01HI4_A132BarCodReo = new byte[1] ;
      H01HI4_A129BarCod = new int[1] ;
      H01HI4_A396EmprCod = new String[] {""} ;
      H01HI4_A602MaqCod = new String[] {""} ;
      H01HI4_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01HI4_A2805RecVolPrd = new int[1] ;
      H01HI4_A252CliCod = new int[1] ;
      H01HI4_n252CliCod = new boolean[] {false} ;
      H01HI4_A279CliNom = new String[] {""} ;
      H01HI4_A212BarSer = new String[] {""} ;
      H01HI4_A135BarColNom = new String[] {""} ;
      H01HI4_A136BarColNum = new int[1] ;
      H01HI4_A218BarTipCol = new byte[1] ;
      H01HI4_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A602MaqCod = "" ;
      A2806RecFA = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      AV15MaqcodOld = "" ;
      AV94Emprnom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV17WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV82ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      GXv_int11 = new short[1] ;
      GXv_int12 = new short[1] ;
      GXv_int13 = new short[1] ;
      GXv_int14 = new short[1] ;
      GXv_int15 = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      AV83Inc_obs = "" ;
      GXv_int16 = new short[1] ;
      AV41Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char23 = "" ;
      GXt_char21 = "" ;
      GXt_char19 = "" ;
      GXv_char20 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char6 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState25 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV19TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV18HTTPRequest = httpContext.getHttpRequest();
      GXv_decimal26 = new java.math.BigDecimal[1] ;
      GXv_int2 = new int[1] ;
      GXv_decimal27 = new java.math.BigDecimal[1] ;
      GXv_int28 = new int[1] ;
      GXv_char24 = new String[1] ;
      GXv_char22 = new String[1] ;
      GXv_int10 = new byte[1] ;
      ucDvelop_confirmpanel_cerrar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_elimimarproceso = new com.genexus.webpanels.GXUserControl();
      imgPrompt_maqcod_gximage = "" ;
      sImgUrl = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabado02_wp__default(),
         new Object[] {
             new Object[] {
            H01HI2_A9812RecHdrLts, H01HI2_n9812RecHdrLts, H01HI2_A9764RecLtsSR, H01HI2_n9764RecLtsSR, H01HI2_A490ForPrdUMe, H01HI2_n490ForPrdUMe, H01HI2_A719PrdNum, H01HI2_n719PrdNum, H01HI2_A2804RecLinMaq, H01HI2_A130BarCodPar,
            H01HI2_A132BarCodReo, H01HI2_A129BarCod, H01HI2_A396EmprCod, H01HI2_A6018ProForFab, H01HI2_n6018ProForFab, H01HI2_A13232PrdRGB, H01HI2_A5725RecLote, H01HI2_A3274RecPrdTnq, H01HI2_A2394RecForNro, H01HI2_A488ForPrdDsc,
            H01HI2_n488ForPrdDsc, H01HI2_A686PrdCant, H01HI2_A431FacCon, H01HI2_A875RecPrdDsc, H01HI2_A872RecPrdNum, H01HI2_A811RecLin, H01HI2_A766ProForDsc, H01HI2_A764ProForCod, H01HI2_A1273RecLinPro
            }
            , new Object[] {
            H01HI3_AGRID_nRecordCount
            }
            , new Object[] {
            H01HI4_A2804RecLinMaq, H01HI4_A130BarCodPar, H01HI4_A132BarCodReo, H01HI4_A129BarCod, H01HI4_A396EmprCod, H01HI4_A602MaqCod, H01HI4_A2806RecFA, H01HI4_A2805RecVolPrd, H01HI4_A252CliCod, H01HI4_n252CliCod,
            H01HI4_A279CliNom, H01HI4_A212BarSer, H01HI4_A135BarColNom, H01HI4_A136BarColNum, H01HI4_A218BarTipCol, H01HI4_A4259RecTotKgs
            }
         }
      );
      AV126Pgmname = "RecetasdeAcabado02_WP" ;
      /* GeneXus formulas. */
      AV126Pgmname = "RecetasdeAcabado02_WP" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      edtavReclinmaq_Enabled = 0 ;
      edtavModo_Enabled = 0 ;
      edtavModif_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBartipcol_Enabled = 0 ;
      edtavRectotkgs_Enabled = 0 ;
      edtavPrdrgb_Enabled = 0 ;
      edtavR_Enabled = 0 ;
      edtavG_Enabled = 0 ;
      edtavB_Enabled = 0 ;
      edtavR2_Enabled = 0 ;
      edtavG2_Enabled = 0 ;
      edtavB2_Enabled = 0 ;
      imgPrompt_maqcod_Link = "javascript:"+"gx.popup.openPrompt('"+"app.tmaqui1prompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vMAQCOD"+"'), id:'"+"vMAQCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vMAQDSC"+"'), id:'"+"vMAQDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
   }

   private byte wcpOAV8Barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV8Barcodreo ;
   private byte AV42TFRecLinPro ;
   private byte AV43TFRecLinPro_To ;
   private byte AV60TFRecForNro ;
   private byte AV61TFRecForNro_To ;
   private byte AV62TFRecPrdTnq ;
   private byte AV63TFRecPrdTnq_To ;
   private byte gxajaxcallmode ;
   private byte AV121Barcodreo_selected ;
   private byte AV124Reclinpro_selected ;
   private byte AV37BarTipCol ;
   private byte A1273RecLinPro ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A132BarCodReo ;
   private byte A490ForPrdUMe ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV95Recetasdeacabado02_wpds_1_tfreclinpro ;
   private byte AV96Recetasdeacabado02_wpds_2_tfreclinpro_to ;
   private byte AV113Recetasdeacabado02_wpds_19_tfrecfornro ;
   private byte AV114Recetasdeacabado02_wpds_20_tfrecfornro_to ;
   private byte AV115Recetasdeacabado02_wpds_21_tfrecprdtnq ;
   private byte AV116Recetasdeacabado02_wpds_22_tfrecprdtnq_to ;
   private byte A218BarTipCol ;
   private byte AV87Flag ;
   private byte GXv_int10[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV11RecLinMaq ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV11RecLinMaq ;
   private short AV72Procesosdadosdealta ;
   private short AV48TFRecLin ;
   private short AV49TFRecLin_To ;
   private short AV23OrderedBy ;
   private short AV80VolMul ;
   private short AV123Reclinmaq_selected ;
   private short AV125Reclin_selected ;
   private short wbEnd ;
   private short wbStart ;
   private short AV74GrupodeaccionesGrid ;
   private short A811RecLin ;
   private short AV26R ;
   private short AV27G ;
   private short AV28B ;
   private short AV29R2 ;
   private short AV30G2 ;
   private short AV31B2 ;
   private short A2804RecLinMaq ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV101Recetasdeacabado02_wpds_7_tfreclin ;
   private short AV102Recetasdeacabado02_wpds_8_tfreclin_to ;
   private short GXv_int11[] ;
   private short GXv_int12[] ;
   private short GXv_int13[] ;
   private short GXv_int14[] ;
   private short GXv_int15[] ;
   private short GXv_int16[] ;
   private int wcpOAV7Barcod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_129 ;
   private int AV7Barcod ;
   private int nGXsfl_129_idx=1 ;
   private int AV78MaqVolRes ;
   private int AV81RecVolPrdold ;
   private int A9764RecLtsSR ;
   private int AV120Barcod_selected ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavBarnhdr_Enabled ;
   private int edtavReclinmaq_Enabled ;
   private int edtavModo_Enabled ;
   private int edtavModif_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int AV36BarColNum ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBartipcol_Enabled ;
   private int edtavRectotkgs_Enabled ;
   private int edtavRecfa_Enabled ;
   private int AV13RecVolPrd ;
   private int edtavRecvolprd_Enabled ;
   private int AV32CliCod ;
   private int edtavClicod_Visible ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavPrdrgb_Enabled ;
   private int edtavR_Enabled ;
   private int edtavG_Enabled ;
   private int edtavB_Enabled ;
   private int edtavR2_Enabled ;
   private int edtavG2_Enabled ;
   private int edtavB2_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A2805RecVolPrd ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV69PageToGo ;
   private int edtRecPrdDsc_Backcolor ;
   private int edtRecPrdDsc_Forecolor ;
   private int AV127GXV1 ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private int GXv_int28[] ;
   private int edtavMaqcod_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavPrdrgb_Visible ;
   private int edtavR_Visible ;
   private int edtavG_Visible ;
   private int edtavB_Visible ;
   private int edtavR2_Visible ;
   private int edtavG2_Visible ;
   private int edtavB2_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV70GridCurrentPage ;
   private long AV71GridPageCount ;
   private long A13232PrdRGB ;
   private long AV25PrdRGB ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV54TFFacCon ;
   private java.math.BigDecimal AV55TFFacCon_To ;
   private java.math.BigDecimal AV56TFPrdCant ;
   private java.math.BigDecimal AV57TFPrdCant_To ;
   private java.math.BigDecimal AV79RecTotKgs ;
   private java.math.BigDecimal AV12RecFA ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal AV107Recetasdeacabado02_wpds_13_tffaccon ;
   private java.math.BigDecimal AV108Recetasdeacabado02_wpds_14_tffaccon_to ;
   private java.math.BigDecimal AV109Recetasdeacabado02_wpds_15_tfprdcant ;
   private java.math.BigDecimal AV110Recetasdeacabado02_wpds_16_tfprdcant_to ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal GXv_decimal26[] ;
   private java.math.BigDecimal GXv_decimal27[] ;
   private String wcpOAV6Emprcod ;
   private String wcpOAV9Barcodpar ;
   private String wcpOGx_mode ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_elimimarproceso_Result ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String Dvelop_confirmpanel_cerrar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV6Emprcod ;
   private String AV9Barcodpar ;
   private String Gx_mode ;
   private String sGXsfl_129_idx="0001" ;
   private String AV44TFProForCod ;
   private String AV45TFProForCod_Sel ;
   private String AV46TFProForDsc ;
   private String AV47TFProForDsc_Sel ;
   private String AV50TFRecPrdNum ;
   private String AV51TFRecPrdNum_Sel ;
   private String AV52TFRecPrdDsc ;
   private String AV53TFRecPrdDsc_Sel ;
   private String AV58TFForPrdDsc ;
   private String AV59TFForPrdDsc_Sel ;
   private String AV64TFRecLote ;
   private String AV65TFRecLote_Sel ;
   private String AV126Pgmname ;
   private String AV85Usurcod ;
   private String AV86Station ;
   private String AV38BarNHdr ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A9812RecHdrLts ;
   private String AV84ImpCod ;
   private String AV88Modif2 ;
   private String AV119Emprcod_selected ;
   private String AV122Barcodpar_selected ;
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
   private String Gridpaginationbar_Class ;
   private String Gridpaginationbar_Pagingbuttonsposition ;
   private String Gridpaginationbar_Pagingcaptionposition ;
   private String Gridpaginationbar_Emptygridclass ;
   private String Gridpaginationbar_Rowsperpageoptions ;
   private String Gridpaginationbar_Previous ;
   private String Gridpaginationbar_Next ;
   private String Gridpaginationbar_Caption ;
   private String Gridpaginationbar_Emptygridcaption ;
   private String Gridpaginationbar_Rowsperpagecaption ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_elimimarproceso_Title ;
   private String Dvelop_confirmpanel_elimimarproceso_Confirmationtext ;
   private String Dvelop_confirmpanel_elimimarproceso_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_elimimarproceso_Nobuttoncaption ;
   private String Dvelop_confirmpanel_elimimarproceso_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_elimimarproceso_Yesbuttonposition ;
   private String Dvelop_confirmpanel_elimimarproceso_Confirmtype ;
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String Dvelop_confirmpanel_cerrar_Title ;
   private String Dvelop_confirmpanel_cerrar_Confirmationtext ;
   private String Dvelop_confirmpanel_cerrar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_cerrar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_cerrar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_cerrar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_cerrar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtavBarnhdr_Internalname ;
   private String TempTags ;
   private String edtavBarnhdr_Jsonclick ;
   private String edtavReclinmaq_Internalname ;
   private String edtavReclinmaq_Jsonclick ;
   private String edtavModo_Internalname ;
   private String AV39Modo ;
   private String edtavModo_Jsonclick ;
   private String edtavModif_Internalname ;
   private String AV40Modif ;
   private String edtavModif_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtavClinom_Internalname ;
   private String AV33CliNom ;
   private String edtavClinom_Jsonclick ;
   private String edtavBarser_Internalname ;
   private String AV34BarSer ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String AV35BarColNom ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String edtavBartipcol_Internalname ;
   private String edtavBartipcol_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String divTablesplittedmaqcod_Internalname ;
   private String lblTextblockmaqcod_Internalname ;
   private String lblTextblockmaqcod_Jsonclick ;
   private String edtavRectotkgs_Internalname ;
   private String edtavRectotkgs_Jsonclick ;
   private String edtavRecfa_Internalname ;
   private String edtavRecfa_Jsonclick ;
   private String edtavRecvolprd_Internalname ;
   private String edtavRecvolprd_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtneliminar_Internalname ;
   private String bttBtneliminar_Jsonclick ;
   private String bttBtnimprimir_Internalname ;
   private String bttBtnimprimir_Jsonclick ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String bttBtnadd_Internalname ;
   private String bttBtnadd_Jsonclick ;
   private String bttBtneliminarprocesos_Internalname ;
   private String bttBtneliminarprocesos_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtRecLinPro_Internalname ;
   private String A764ProForCod ;
   private String edtProForCod_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Internalname ;
   private String edtRecLin_Internalname ;
   private String A872RecPrdNum ;
   private String edtRecPrdNum_Internalname ;
   private String A875RecPrdDsc ;
   private String edtRecPrdDsc_Internalname ;
   private String edtFacCon_Internalname ;
   private String edtPrdCant_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Internalname ;
   private String edtRecForNro_Internalname ;
   private String edtRecPrdTnq_Internalname ;
   private String A5725RecLote ;
   private String edtRecLote_Internalname ;
   private String edtPrdRGB_Internalname ;
   private String edtavPrdrgb_Internalname ;
   private String edtavR_Internalname ;
   private String edtavG_Internalname ;
   private String edtavB_Internalname ;
   private String edtavR2_Internalname ;
   private String edtavG2_Internalname ;
   private String edtavB2_Internalname ;
   private String A6018ProForFab ;
   private String edtProForFab_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtRecLinMaq_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String imgPrompt_maqcod_Link ;
   private String imgPrompt_maqcod_Internalname ;
   private String scmdbuf ;
   private String lV97Recetasdeacabado02_wpds_3_tfproforcod ;
   private String lV99Recetasdeacabado02_wpds_5_tfprofordsc ;
   private String lV103Recetasdeacabado02_wpds_9_tfrecprdnum ;
   private String lV105Recetasdeacabado02_wpds_11_tfrecprddsc ;
   private String lV111Recetasdeacabado02_wpds_17_tfforprddsc ;
   private String lV117Recetasdeacabado02_wpds_23_tfreclote ;
   private String AV98Recetasdeacabado02_wpds_4_tfproforcod_sel ;
   private String AV97Recetasdeacabado02_wpds_3_tfproforcod ;
   private String AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel ;
   private String AV99Recetasdeacabado02_wpds_5_tfprofordsc ;
   private String AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel ;
   private String AV103Recetasdeacabado02_wpds_9_tfrecprdnum ;
   private String AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel ;
   private String AV105Recetasdeacabado02_wpds_11_tfrecprddsc ;
   private String AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel ;
   private String AV111Recetasdeacabado02_wpds_17_tfforprddsc ;
   private String AV118Recetasdeacabado02_wpds_24_tfreclote_sel ;
   private String AV117Recetasdeacabado02_wpds_23_tfreclote ;
   private String AV14MaqCod ;
   private String edtavMaqcod_Internalname ;
   private String hsh ;
   private String A602MaqCod ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV15MaqcodOld ;
   private String AV94Emprnom ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String GXt_char23 ;
   private String GXt_char21 ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char18 ;
   private String GXv_char6[] ;
   private String GXt_char17 ;
   private String GXv_char5[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXv_char24[] ;
   private String GXv_char22[] ;
   private String tblTabledvelop_confirmpanel_cerrar_Internalname ;
   private String Dvelop_confirmpanel_cerrar_Internalname ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblTabledvelop_confirmpanel_elimimarproceso_Internalname ;
   private String Dvelop_confirmpanel_elimimarproceso_Internalname ;
   private String tblTablemergedmaqcod_Internalname ;
   private String edtavMaqcod_Jsonclick ;
   private String imgPrompt_maqcod_gximage ;
   private String sImgUrl ;
   private String sGXsfl_129_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtRecLinPro_Jsonclick ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Jsonclick ;
   private String edtRecLin_Jsonclick ;
   private String edtRecPrdNum_Jsonclick ;
   private String edtRecPrdDsc_Jsonclick ;
   private String edtFacCon_Jsonclick ;
   private String edtPrdCant_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtRecForNro_Jsonclick ;
   private String edtRecPrdTnq_Jsonclick ;
   private String edtRecLote_Jsonclick ;
   private String edtPrdRGB_Jsonclick ;
   private String edtavPrdrgb_Jsonclick ;
   private String edtavR_Jsonclick ;
   private String edtavG_Jsonclick ;
   private String edtavB_Jsonclick ;
   private String edtavR2_Jsonclick ;
   private String edtavG2_Jsonclick ;
   private String edtavB2_Jsonclick ;
   private String edtProForFab_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV77FecPan ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV24OrderedDsc ;
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
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n488ForPrdDsc ;
   private boolean n6018ProForFab ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean bGXsfl_129_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n9812RecHdrLts ;
   private boolean n9764RecLtsSR ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean gx_refresh_fired ;
   private String AV83Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV18HTTPRequest ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_cerrar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_elimimarproceso ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV82ProgressIndicator ;
   private HTMLChoice cmbavGrupodeaccionesgrid ;
   private IDataStoreProvider pr_default ;
   private String[] H01HI2_A9812RecHdrLts ;
   private boolean[] H01HI2_n9812RecHdrLts ;
   private int[] H01HI2_A9764RecLtsSR ;
   private boolean[] H01HI2_n9764RecLtsSR ;
   private byte[] H01HI2_A490ForPrdUMe ;
   private boolean[] H01HI2_n490ForPrdUMe ;
   private String[] H01HI2_A719PrdNum ;
   private boolean[] H01HI2_n719PrdNum ;
   private short[] H01HI2_A2804RecLinMaq ;
   private String[] H01HI2_A130BarCodPar ;
   private byte[] H01HI2_A132BarCodReo ;
   private int[] H01HI2_A129BarCod ;
   private String[] H01HI2_A396EmprCod ;
   private String[] H01HI2_A6018ProForFab ;
   private boolean[] H01HI2_n6018ProForFab ;
   private long[] H01HI2_A13232PrdRGB ;
   private String[] H01HI2_A5725RecLote ;
   private byte[] H01HI2_A3274RecPrdTnq ;
   private byte[] H01HI2_A2394RecForNro ;
   private String[] H01HI2_A488ForPrdDsc ;
   private boolean[] H01HI2_n488ForPrdDsc ;
   private java.math.BigDecimal[] H01HI2_A686PrdCant ;
   private java.math.BigDecimal[] H01HI2_A431FacCon ;
   private String[] H01HI2_A875RecPrdDsc ;
   private String[] H01HI2_A872RecPrdNum ;
   private short[] H01HI2_A811RecLin ;
   private String[] H01HI2_A766ProForDsc ;
   private String[] H01HI2_A764ProForCod ;
   private byte[] H01HI2_A1273RecLinPro ;
   private long[] H01HI3_AGRID_nRecordCount ;
   private short[] H01HI4_A2804RecLinMaq ;
   private String[] H01HI4_A130BarCodPar ;
   private byte[] H01HI4_A132BarCodReo ;
   private int[] H01HI4_A129BarCod ;
   private String[] H01HI4_A396EmprCod ;
   private String[] H01HI4_A602MaqCod ;
   private java.math.BigDecimal[] H01HI4_A2806RecFA ;
   private int[] H01HI4_A2805RecVolPrd ;
   private int[] H01HI4_A252CliCod ;
   private boolean[] H01HI4_n252CliCod ;
   private String[] H01HI4_A279CliNom ;
   private String[] H01HI4_A212BarSer ;
   private String[] H01HI4_A135BarColNom ;
   private int[] H01HI4_A136BarColNum ;
   private byte[] H01HI4_A218BarTipCol ;
   private java.math.BigDecimal[] H01HI4_A4259RecTotKgs ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV68DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState25[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV19TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV17WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class recetasdeacabado02_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01HI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV95Recetasdeacabado02_wpds_1_tfreclinpro ,
                                          byte AV96Recetasdeacabado02_wpds_2_tfreclinpro_to ,
                                          String AV98Recetasdeacabado02_wpds_4_tfproforcod_sel ,
                                          String AV97Recetasdeacabado02_wpds_3_tfproforcod ,
                                          String AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel ,
                                          String AV99Recetasdeacabado02_wpds_5_tfprofordsc ,
                                          short AV101Recetasdeacabado02_wpds_7_tfreclin ,
                                          short AV102Recetasdeacabado02_wpds_8_tfreclin_to ,
                                          String AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel ,
                                          String AV103Recetasdeacabado02_wpds_9_tfrecprdnum ,
                                          String AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel ,
                                          String AV105Recetasdeacabado02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV107Recetasdeacabado02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV108Recetasdeacabado02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV109Recetasdeacabado02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV110Recetasdeacabado02_wpds_16_tfprdcant_to ,
                                          String AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel ,
                                          String AV111Recetasdeacabado02_wpds_17_tfforprddsc ,
                                          byte AV113Recetasdeacabado02_wpds_19_tfrecfornro ,
                                          byte AV114Recetasdeacabado02_wpds_20_tfrecfornro_to ,
                                          byte AV115Recetasdeacabado02_wpds_21_tfrecprdtnq ,
                                          byte AV116Recetasdeacabado02_wpds_22_tfrecprdtnq_to ,
                                          String AV118Recetasdeacabado02_wpds_24_tfreclote_sel ,
                                          String AV117Recetasdeacabado02_wpds_23_tfreclote ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          short AV23OrderedBy ,
                                          boolean AV24OrderedDsc ,
                                          String AV6Emprcod ,
                                          int AV7Barcod ,
                                          byte AV8Barcodreo ,
                                          String AV9Barcodpar ,
                                          short AV11RecLinMaq ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[34];
      Object[] GXv_Object30 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T4.RecHdrLts, T4.RecLtsSR, T1.ForPrdUMe, T1.PrdNum, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T6.ProForFab, T2.PrdRGB, T1.RecLote, T1.RecPrdTnq," ;
      sSelectString += " T1.RecForNro, T3.ForPrdDsc, T1.PrdCant, T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T6.ProForDsc, T5.ProForCod, T1.RecLinPro" ;
      sFromString = " FROM (((((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe" ;
      sFromString += " = T1.ForPrdUMe) INNER JOIN TXPRECMAQ T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND" ;
      sFromString += " T4.RecLinMaq = T1.RecLinMaq) INNER JOIN TXPCRECET T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar" ;
      sFromString += " AND T5.RecLinMaq = T1.RecLinMaq AND T5.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T6 ON T6.EmprCod = T1.EmprCod AND T6.ProForCod = T5.ProForCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      if ( ! (0==AV95Recetasdeacabado02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      if ( ! (0==AV96Recetasdeacabado02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Recetasdeacabado02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV97Recetasdeacabado02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Recetasdeacabado02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProForCod = ?)");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV99Recetasdeacabado02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ProForDsc = ?)");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! (0==AV101Recetasdeacabado02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( ! (0==AV102Recetasdeacabado02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV103Recetasdeacabado02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV105Recetasdeacabado02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Recetasdeacabado02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Recetasdeacabado02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Recetasdeacabado02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Recetasdeacabado02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Recetasdeacabado02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (0==AV113Recetasdeacabado02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( ! (0==AV114Recetasdeacabado02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (0==AV115Recetasdeacabado02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( ! (0==AV116Recetasdeacabado02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Recetasdeacabado02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV117Recetasdeacabado02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Recetasdeacabado02_wpds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ( AV23OrderedBy == 1 ) && ! AV24OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecLinPro" ;
      }
      else if ( ( AV23OrderedBy == 1 ) && ( AV24OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecLinPro DESC" ;
      }
      else if ( ( AV23OrderedBy == 2 ) && ! AV24OrderedDsc )
      {
         sOrderString += " ORDER BY T5.ProForCod" ;
      }
      else if ( ( AV23OrderedBy == 2 ) && ( AV24OrderedDsc ) )
      {
         sOrderString += " ORDER BY T5.ProForCod DESC" ;
      }
      else if ( ( AV23OrderedBy == 3 ) && ! AV24OrderedDsc )
      {
         sOrderString += " ORDER BY T6.ProForDsc" ;
      }
      else if ( ( AV23OrderedBy == 3 ) && ( AV24OrderedDsc ) )
      {
         sOrderString += " ORDER BY T6.ProForDsc DESC" ;
      }
      else if ( ( AV23OrderedBy == 4 ) && ! AV24OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecLin" ;
      }
      else if ( ( AV23OrderedBy == 4 ) && ( AV24OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecLin DESC" ;
      }
      else if ( ( AV23OrderedBy == 5 ) && ! AV24OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecPrdNum" ;
      }
      else if ( ( AV23OrderedBy == 5 ) && ( AV24OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecPrdNum DESC" ;
      }
      else if ( ( AV23OrderedBy == 6 ) && ! AV24OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecPrdDsc" ;
      }
      else if ( ( AV23OrderedBy == 6 ) && ( AV24OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecPrdDsc DESC" ;
      }
      else if ( ( AV23OrderedBy == 7 ) && ! AV24OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FacCon" ;
      }
      else if ( ( AV23OrderedBy == 7 ) && ( AV24OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FacCon DESC" ;
      }
      else if ( ( AV23OrderedBy == 8 ) && ! AV24OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdCant" ;
      }
      else if ( ( AV23OrderedBy == 8 ) && ( AV24OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdCant DESC" ;
      }
      else if ( ( AV23OrderedBy == 9 ) && ! AV24OrderedDsc )
      {
         sOrderString += " ORDER BY T3.ForPrdDsc" ;
      }
      else if ( ( AV23OrderedBy == 9 ) && ( AV24OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.ForPrdDsc DESC" ;
      }
      else if ( ( AV23OrderedBy == 10 ) && ! AV24OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecForNro" ;
      }
      else if ( ( AV23OrderedBy == 10 ) && ( AV24OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecForNro DESC" ;
      }
      else if ( ( AV23OrderedBy == 11 ) && ! AV24OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecPrdTnq" ;
      }
      else if ( ( AV23OrderedBy == 11 ) && ( AV24OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecPrdTnq DESC" ;
      }
      else if ( ( AV23OrderedBy == 12 ) && ! AV24OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecLote" ;
      }
      else if ( ( AV23OrderedBy == 12 ) && ( AV24OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecLote DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   protected Object[] conditional_H01HI3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV95Recetasdeacabado02_wpds_1_tfreclinpro ,
                                          byte AV96Recetasdeacabado02_wpds_2_tfreclinpro_to ,
                                          String AV98Recetasdeacabado02_wpds_4_tfproforcod_sel ,
                                          String AV97Recetasdeacabado02_wpds_3_tfproforcod ,
                                          String AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel ,
                                          String AV99Recetasdeacabado02_wpds_5_tfprofordsc ,
                                          short AV101Recetasdeacabado02_wpds_7_tfreclin ,
                                          short AV102Recetasdeacabado02_wpds_8_tfreclin_to ,
                                          String AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel ,
                                          String AV103Recetasdeacabado02_wpds_9_tfrecprdnum ,
                                          String AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel ,
                                          String AV105Recetasdeacabado02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV107Recetasdeacabado02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV108Recetasdeacabado02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV109Recetasdeacabado02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV110Recetasdeacabado02_wpds_16_tfprdcant_to ,
                                          String AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel ,
                                          String AV111Recetasdeacabado02_wpds_17_tfforprddsc ,
                                          byte AV113Recetasdeacabado02_wpds_19_tfrecfornro ,
                                          byte AV114Recetasdeacabado02_wpds_20_tfrecfornro_to ,
                                          byte AV115Recetasdeacabado02_wpds_21_tfrecprdtnq ,
                                          byte AV116Recetasdeacabado02_wpds_22_tfrecprdtnq_to ,
                                          String AV118Recetasdeacabado02_wpds_24_tfreclote_sel ,
                                          String AV117Recetasdeacabado02_wpds_23_tfreclote ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          short AV23OrderedBy ,
                                          boolean AV24OrderedDsc ,
                                          String AV6Emprcod ,
                                          int AV7Barcod ,
                                          byte AV8Barcodreo ,
                                          String AV9Barcodpar ,
                                          short AV11RecLinMaq ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[29];
      Object[] GXv_Object32 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPRECMAQ T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar =" ;
      scmdbuf += " T1.BarCodPar AND T4.RecLinMaq = T1.RecLinMaq) INNER JOIN TXPCRECET T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar AND T5.RecLinMaq = T1.RecLinMaq AND T5.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T6 ON T6.EmprCod = T1.EmprCod AND T6.ProForCod = T5.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      if ( ! (0==AV95Recetasdeacabado02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int31[5] = (byte)(1) ;
      }
      if ( ! (0==AV96Recetasdeacabado02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int31[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Recetasdeacabado02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV97Recetasdeacabado02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Recetasdeacabado02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProForCod = ?)");
      }
      else
      {
         GXv_int31[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV99Recetasdeacabado02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Recetasdeacabado02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ProForDsc = ?)");
      }
      else
      {
         GXv_int31[10] = (byte)(1) ;
      }
      if ( ! (0==AV101Recetasdeacabado02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int31[11] = (byte)(1) ;
      }
      if ( ! (0==AV102Recetasdeacabado02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int31[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV103Recetasdeacabado02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Recetasdeacabado02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int31[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV105Recetasdeacabado02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Recetasdeacabado02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int31[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Recetasdeacabado02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int31[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Recetasdeacabado02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int31[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Recetasdeacabado02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int31[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Recetasdeacabado02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int31[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Recetasdeacabado02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Recetasdeacabado02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int31[22] = (byte)(1) ;
      }
      if ( ! (0==AV113Recetasdeacabado02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int31[23] = (byte)(1) ;
      }
      if ( ! (0==AV114Recetasdeacabado02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int31[24] = (byte)(1) ;
      }
      if ( ! (0==AV115Recetasdeacabado02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int31[25] = (byte)(1) ;
      }
      if ( ! (0==AV116Recetasdeacabado02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int31[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Recetasdeacabado02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV117Recetasdeacabado02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Recetasdeacabado02_wpds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int31[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV23OrderedBy == 1 ) && ! AV24OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 1 ) && ( AV24OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 2 ) && ! AV24OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 2 ) && ( AV24OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 3 ) && ! AV24OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 3 ) && ( AV24OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 4 ) && ! AV24OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 4 ) && ( AV24OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 5 ) && ! AV24OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 5 ) && ( AV24OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 6 ) && ! AV24OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 6 ) && ( AV24OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 7 ) && ! AV24OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 7 ) && ( AV24OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 8 ) && ! AV24OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 8 ) && ( AV24OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 9 ) && ! AV24OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 9 ) && ( AV24OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 10 ) && ! AV24OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 10 ) && ( AV24OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 11 ) && ! AV24OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 11 ) && ( AV24OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 12 ) && ! AV24OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV23OrderedBy == 12 ) && ( AV24OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object32[0] = scmdbuf ;
      GXv_Object32[1] = GXv_int31 ;
      return GXv_Object32 ;
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
                  return conditional_H01HI2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() );
            case 1 :
                  return conditional_H01HI3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01HI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HI3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HI4", "SELECT T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.MaqCod, T1.RecFA, T1.RecVolPrd, T2.CliCod, T3.CliNom, T2.BarSer, T2.BarColNom, T2.BarColNum, T2.BarTipCol, T1.RecTotKgs FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 12);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((String[]) buf[13])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(11);
               ((String[]) buf[16])[0] = rslt.getString(12, 26);
               ((byte[]) buf[17])[0] = rslt.getByte(13);
               ((byte[]) buf[18])[0] = rslt.getByte(14);
               ((String[]) buf[19])[0] = rslt.getString(15, 5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,5);
               ((String[]) buf[23])[0] = rslt.getString(18, 26);
               ((String[]) buf[24])[0] = rslt.getString(19, 6);
               ((short[]) buf[25])[0] = rslt.getShort(20);
               ((String[]) buf[26])[0] = rslt.getString(21, 30);
               ((String[]) buf[27])[0] = rslt.getString(22, 6);
               ((byte[]) buf[28])[0] = rslt.getByte(23);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
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
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

