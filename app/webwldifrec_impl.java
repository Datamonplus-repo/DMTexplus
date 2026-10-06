package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwldifrec_impl extends GXDataArea
{
   public webwldifrec_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwldifrec_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwldifrec_impl.class ));
   }

   public webwldifrec_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavDesvios = UIFactory.getCheckbox(this);
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
      nRC_GXsfl_69 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_69"))) ;
      nGXsfl_69_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_69_idx"))) ;
      sGXsfl_69_idx = httpContext.GetPar( "sGXsfl_69_idx") ;
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
      AV77FilterFullText = httpContext.GetPar( "FilterFullText") ;
      A810RecFec = localUtil.parseDateParm( httpContext.GetPar( "RecFec")) ;
      AV30ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV25ColumnsSelector);
      AV19RecFec = localUtil.parseDateParm( httpContext.GetPar( "RecFec")) ;
      AV32TFRecFec = localUtil.parseDateParm( httpContext.GetPar( "TFRecFec")) ;
      AV37TFRechora = localUtil.parseDTimeParm( httpContext.GetPar( "TFRechora")) ;
      AV42TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV43TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV45TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV46TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV55TFRecExiTeo = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTeo"), ".") ;
      AV56TFRecExiTeo_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTeo_To"), ".") ;
      AV58TFRecExiRea = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiRea"), ".") ;
      AV59TFRecExiRea_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiRea_To"), ".") ;
      AV97Pgmname = httpContext.GetPar( "Pgmname") ;
      AV16OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV17OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A809RecExiTeo = CommonUtil.decimalVal( httpContext.GetPar( "RecExiTeo"), ".") ;
      AV62TotRecExiTeo = CommonUtil.decimalVal( httpContext.GetPar( "TotRecExiTeo"), ".") ;
      A6573RecPreRec = CommonUtil.decimalVal( httpContext.GetPar( "RecPreRec"), ".") ;
      AV79TotValorInicial = CommonUtil.decimalVal( httpContext.GetPar( "TotValorInicial"), ".") ;
      A807RecExiRea = CommonUtil.decimalVal( httpContext.GetPar( "RecExiRea"), ".") ;
      AV60TotRecExiRea = CommonUtil.decimalVal( httpContext.GetPar( "TotRecExiRea"), ".") ;
      AV81TotValorActual = CommonUtil.decimalVal( httpContext.GetPar( "TotValorActual"), ".") ;
      AV65TotExisInicial = CommonUtil.decimalVal( httpContext.GetPar( "TotExisInicial"), ".") ;
      AV67TotValExisInicial = CommonUtil.decimalVal( httpContext.GetPar( "TotValExisInicial"), ".") ;
      AV64TotExisActual = CommonUtil.decimalVal( httpContext.GetPar( "TotExisActual"), ".") ;
      AV66TotValExisActual = CommonUtil.decimalVal( httpContext.GetPar( "TotValExisActual"), ".") ;
      AV72Desvios = httpContext.GetPar( "Desvios") ;
      AV68PrdNum = httpContext.GetPar( "PrdNum") ;
      AV69PrdNum_To = httpContext.GetPar( "PrdNum_To") ;
      AV76InvAt = (short)(GXutil.lval( httpContext.GetPar( "InvAt"))) ;
      AV74ImpCod = httpContext.GetPar( "ImpCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV77FilterFullText, A810RecFec, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV19RecFec, AV32TFRecFec, AV37TFRechora, AV42TFPrdNum, AV43TFPrdNum_Sel, AV45TFPrdNom, AV46TFPrdNom_Sel, AV55TFRecExiTeo, AV56TFRecExiTeo_To, AV58TFRecExiRea, AV59TFRecExiRea_To, AV97Pgmname, AV16OrderedBy, AV17OrderedDsc, A809RecExiTeo, AV62TotRecExiTeo, A6573RecPreRec, AV79TotValorInicial, A807RecExiRea, AV60TotRecExiRea, AV81TotValorActual, AV65TotExisInicial, AV67TotValExisInicial, AV64TotExisActual, AV66TotValExisActual, AV72Desvios, AV68PrdNum, AV69PrdNum_To, AV76InvAt, AV74ImpCod) ;
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
      paTM2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startTM2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwldifrec", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTRECEXITEO", getSecureSignedToken( "", localUtil.format( AV62TotRecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECPREREC", getSecureSignedToken( "", localUtil.format( A6573RecPreRec, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALORINICIAL", getSecureSignedToken( "", localUtil.format( AV79TotValorInicial, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTRECEXIREA", getSecureSignedToken( "", localUtil.format( AV60TotRecExiRea, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALORACTUAL", getSecureSignedToken( "", localUtil.format( AV81TotValorActual, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTEXISINICIAL", getSecureSignedToken( "", localUtil.format( AV65TotExisInicial, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALEXISINICIAL", getSecureSignedToken( "", localUtil.format( AV67TotValExisInicial, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTEXISACTUAL", getSecureSignedToken( "", localUtil.format( AV64TotExisActual, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALEXISACTUAL", getSecureSignedToken( "", localUtil.format( AV66TotValExisActual, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV68PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM_TO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV69PrdNum_To, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINVAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76InvAt), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV74ImpCod, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV77FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_69", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_69, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV28ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV28ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV50GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV51GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV48DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV48DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV25ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV25ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV30ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECFEC", localUtil.dtoc( AV32TFRecFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECHORA", localUtil.ttoc( AV37TFRechora, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV42TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV43TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM", GXutil.rtrim( AV45TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM_SEL", GXutil.rtrim( AV46TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECEXITEO", GXutil.ltrim( localUtil.ntoc( AV55TFRecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECEXITEO_TO", GXutil.ltrim( localUtil.ntoc( AV56TFRecExiTeo_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECEXIREA", GXutil.ltrim( localUtil.ntoc( AV58TFRecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECEXIREA_TO", GXutil.ltrim( localUtil.ntoc( AV59TFRecExiRea_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV97Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV16OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV17OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTRECEXITEO", GXutil.ltrim( localUtil.ntoc( AV62TotRecExiTeo, (byte)(18), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTRECEXITEO", getSecureSignedToken( "", localUtil.format( AV62TotRecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPREREC", GXutil.ltrim( localUtil.ntoc( A6573RecPreRec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECPREREC", getSecureSignedToken( "", localUtil.format( A6573RecPreRec, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTVALORINICIAL", GXutil.ltrim( localUtil.ntoc( AV79TotValorInicial, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALORINICIAL", getSecureSignedToken( "", localUtil.format( AV79TotValorInicial, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTRECEXIREA", GXutil.ltrim( localUtil.ntoc( AV60TotRecExiRea, (byte)(18), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTRECEXIREA", getSecureSignedToken( "", localUtil.format( AV60TotRecExiRea, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTVALORACTUAL", GXutil.ltrim( localUtil.ntoc( AV81TotValorActual, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALORACTUAL", getSecureSignedToken( "", localUtil.format( AV81TotValorActual, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTEXISINICIAL", GXutil.ltrim( localUtil.ntoc( AV65TotExisInicial, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTEXISINICIAL", getSecureSignedToken( "", localUtil.format( AV65TotExisInicial, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTVALEXISINICIAL", GXutil.ltrim( localUtil.ntoc( AV67TotValExisInicial, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALEXISINICIAL", getSecureSignedToken( "", localUtil.format( AV67TotValExisInicial, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTEXISACTUAL", GXutil.ltrim( localUtil.ntoc( AV64TotExisActual, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTEXISACTUAL", getSecureSignedToken( "", localUtil.format( AV64TotExisActual, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTVALEXISACTUAL", GXutil.ltrim( localUtil.ntoc( AV66TotValExisActual, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALEXISACTUAL", getSecureSignedToken( "", localUtil.format( AV66TotValExisActual, "ZZZZZZZ9.99")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV14GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV14GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV6EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM", GXutil.rtrim( AV68PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV68PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM_TO", GXutil.rtrim( AV69PrdNum_To));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM_TO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV69PrdNum_To, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINVAT", GXutil.ltrim( localUtil.ntoc( AV76InvAt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINVAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76InvAt), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV74ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV74ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         weTM2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtTM2( ) ;
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
      return formatLink("app.webwldifrec", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebWldifrec" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Inventario", "") ;
   }

   public void wbTM0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableheader.setProperty("Width", Dvpanel_tableheader_Width);
         ucDvpanel_tableheader.setProperty("AutoWidth", Dvpanel_tableheader_Autowidth);
         ucDvpanel_tableheader.setProperty("AutoHeight", Dvpanel_tableheader_Autoheight);
         ucDvpanel_tableheader.setProperty("Cls", Dvpanel_tableheader_Cls);
         ucDvpanel_tableheader.setProperty("Title", Dvpanel_tableheader_Title);
         ucDvpanel_tableheader.setProperty("Collapsible", Dvpanel_tableheader_Collapsible);
         ucDvpanel_tableheader.setProperty("Collapsed", Dvpanel_tableheader_Collapsed);
         ucDvpanel_tableheader.setProperty("ShowCollapseIcon", Dvpanel_tableheader_Showcollapseicon);
         ucDvpanel_tableheader.setProperty("IconPosition", Dvpanel_tableheader_Iconposition);
         ucDvpanel_tableheader.setProperty("AutoScroll", Dvpanel_tableheader_Autoscroll);
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, "DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWldifrec.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWldifrec.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnbtninforme_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", httpContext.getMessage( "PDF (2)", ""), bttBtnbtninforme_Jsonclick, 7, httpContext.getMessage( "PDF (2)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11tm1_client"+"'", TempTags, "", 2, "HLP_WebWldifrec.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWldifrec.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWldifrec.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_28_TM2( true) ;
      }
      else
      {
         wb_table1_28_TM2( false) ;
      }
      return  ;
   }

   public void wb_table1_28_TM2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfiltertextrecfec_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblFiltertextrecfec_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblFiltertextrecfec_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWldifrec.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_50_TM2( true) ;
      }
      else
      {
         wb_table2_50_TM2( false) ;
      }
      return  ;
   }

   public void wb_table2_50_TM2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavDesvios.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavDesvios.getInternalname(), AV72Desvios, "", "", 1, chkavDesvios.getEnabled(), "S", httpContext.getMessage( "Solo Desvios?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(60, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,60);\"");
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
         startgridcontrol69( ) ;
      }
      if ( wbEnd == 69 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_69 = (int)(nGXsfl_69_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table3_80_TM2( true) ;
      }
      else
      {
         wb_table3_80_TM2( false) ;
      }
      return  ;
   }

   public void wb_table3_80_TM2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV50GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV51GridPageCount);
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV48DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV48DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV25ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_recfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_recfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_recfecauxdate_Internalname, localUtil.format(AV34DDO_RecFecAuxDate, "99/99/99"), localUtil.format( AV34DDO_RecFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_recfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWldifrec.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_recfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWldifrec.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_rechoraauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_rechoraauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_rechoraauxdate_Internalname, localUtil.format(AV39DDO_RechoraAuxDate, "99/99/99"), localUtil.format( AV39DDO_RechoraAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_rechoraauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWldifrec.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_rechoraauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWldifrec.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 69 )
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

   public void startTM2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Informe Inventario", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupTM0( ) ;
   }

   public void wsTM2( )
   {
      startTM2( ) ;
      evtTM2( ) ;
   }

   public void evtTM2( )
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
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12TM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13TM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14TM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15TM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16TM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17TM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e18TM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e19TM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VRECFEC.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e20TM2 ();
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
                           nGXsfl_69_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_692( ) ;
                           A810RecFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtRecFec_Internalname), 0)) ;
                           A13455Rechora = localUtil.ctot( httpContext.cgiGet( edtRechora_Internalname), 0) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
                           AV52ValorInicial = localUtil.ctond( httpContext.cgiGet( edtavValorinicial_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavValorinicial_Internalname, GXutil.ltrimstr( AV52ValorInicial, 11, 2));
                           A807RecExiRea = localUtil.ctond( httpContext.cgiGet( edtRecExiRea_Internalname)) ;
                           AV53ValorActual = localUtil.ctond( httpContext.cgiGet( edtavValoractual_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavValoractual_Internalname, GXutil.ltrimstr( AV53ValorActual, 11, 2));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e21TM2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e22TM2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e23TM2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV77FilterFullText) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
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

   public void weTM2( )
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

   public void paTM2( )
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
            GX_FocusControl = edtavFilterfulltext_Internalname ;
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
      subsflControlProps_692( ) ;
      while ( nGXsfl_69_idx <= nRC_GXsfl_69 )
      {
         sendrow_692( ) ;
         nGXsfl_69_idx = ((subGrid_Islastpage==1)&&(nGXsfl_69_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_69_idx+1) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_692( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV77FilterFullText ,
                                 java.util.Date A810RecFec ,
                                 byte AV30ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelector ,
                                 java.util.Date AV19RecFec ,
                                 java.util.Date AV32TFRecFec ,
                                 java.util.Date AV37TFRechora ,
                                 String AV42TFPrdNum ,
                                 String AV43TFPrdNum_Sel ,
                                 String AV45TFPrdNom ,
                                 String AV46TFPrdNom_Sel ,
                                 java.math.BigDecimal AV55TFRecExiTeo ,
                                 java.math.BigDecimal AV56TFRecExiTeo_To ,
                                 java.math.BigDecimal AV58TFRecExiRea ,
                                 java.math.BigDecimal AV59TFRecExiRea_To ,
                                 String AV97Pgmname ,
                                 short AV16OrderedBy ,
                                 boolean AV17OrderedDsc ,
                                 java.math.BigDecimal A809RecExiTeo ,
                                 java.math.BigDecimal AV62TotRecExiTeo ,
                                 java.math.BigDecimal A6573RecPreRec ,
                                 java.math.BigDecimal AV79TotValorInicial ,
                                 java.math.BigDecimal A807RecExiRea ,
                                 java.math.BigDecimal AV60TotRecExiRea ,
                                 java.math.BigDecimal AV81TotValorActual ,
                                 java.math.BigDecimal AV65TotExisInicial ,
                                 java.math.BigDecimal AV67TotValExisInicial ,
                                 java.math.BigDecimal AV64TotExisActual ,
                                 java.math.BigDecimal AV66TotValExisActual ,
                                 String AV72Desvios ,
                                 String AV68PrdNum ,
                                 String AV69PrdNum_To ,
                                 short AV76InvAt ,
                                 String AV74ImpCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e22TM2 ();
      GRID_nCurrentRecord = 0 ;
      rfTM2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECEXITEO", getSecureSignedToken( "", localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXITEO", GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECEXIREA", getSecureSignedToken( "", localUtil.format( A807RecExiRea, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXIREA", GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), ".", "")));
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
      AV72Desvios = ((GXutil.strcmp(GXutil.rtrim( AV72Desvios), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72Desvios", AV72Desvios);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfTM2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV97Pgmname = "WebWldifrec" ;
      Gx_err = (short)(0) ;
      edtavValorinicial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValorinicial_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValorinicial_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavValoractual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValoractual_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValoractual_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavTotvaluerecexiteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluerecexiteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluerecexiteo_Enabled), 5, 0), true);
      edtavTotvaluevalorinicial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluevalorinicial_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluevalorinicial_Enabled), 5, 0), true);
      edtavTotvaluerecexirea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluerecexirea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluerecexirea_Enabled), 5, 0), true);
      edtavTotvaluevaloractual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluevaloractual_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluevaloractual_Enabled), 5, 0), true);
   }

   public void rfTM2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(69) ;
      /* Execute user event: Refresh */
      e22TM2 ();
      nGXsfl_69_idx = 1 ;
      sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_692( ) ;
      bGXsfl_69_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_692( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV85Webwldifrecds_1_filterfulltext ,
                                              AV87Webwldifrecds_3_tfrecfec ,
                                              AV88Webwldifrecds_4_tfrechora ,
                                              AV90Webwldifrecds_6_tfprdnum_sel ,
                                              AV89Webwldifrecds_5_tfprdnum ,
                                              AV92Webwldifrecds_8_tfprdnom_sel ,
                                              AV91Webwldifrecds_7_tfprdnom ,
                                              AV93Webwldifrecds_9_tfrecexiteo ,
                                              AV94Webwldifrecds_10_tfrecexiteo_to ,
                                              AV95Webwldifrecds_11_tfrecexirea ,
                                              AV96Webwldifrecds_12_tfrecexirea_to ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A809RecExiTeo ,
                                              A807RecExiRea ,
                                              A810RecFec ,
                                              A13455Rechora ,
                                              Short.valueOf(AV16OrderedBy) ,
                                              Boolean.valueOf(AV17OrderedDsc) ,
                                              AV86Webwldifrecds_2_recfec } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE
                                              }
         });
         lV89Webwldifrecds_5_tfprdnum = GXutil.padr( GXutil.rtrim( AV89Webwldifrecds_5_tfprdnum), 6, "%") ;
         lV91Webwldifrecds_7_tfprdnom = GXutil.padr( GXutil.rtrim( AV91Webwldifrecds_7_tfprdnom), 26, "%") ;
         /* Using cursor H00TM2 */
         pr_default.execute(0, new Object[] {A810RecFec, AV86Webwldifrecds_2_recfec, lV89Webwldifrecds_5_tfprdnum, AV90Webwldifrecds_6_tfprdnum_sel, lV91Webwldifrecds_7_tfprdnom, AV92Webwldifrecds_8_tfprdnom_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_69_idx = 1 ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_692( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A718PrdNom = H00TM2_A718PrdNom[0] ;
            A719PrdNum = H00TM2_A719PrdNum[0] ;
            e23TM2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(69) ;
         wbTM0( ) ;
      }
      bGXsfl_69_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesTM2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV97Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECEXITEO"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTRECEXITEO", GXutil.ltrim( localUtil.ntoc( AV62TotRecExiTeo, (byte)(18), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTRECEXITEO", getSecureSignedToken( "", localUtil.format( AV62TotRecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPREREC", GXutil.ltrim( localUtil.ntoc( A6573RecPreRec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECPREREC", getSecureSignedToken( "", localUtil.format( A6573RecPreRec, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTVALORINICIAL", GXutil.ltrim( localUtil.ntoc( AV79TotValorInicial, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALORINICIAL", getSecureSignedToken( "", localUtil.format( AV79TotValorInicial, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECEXIREA"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, localUtil.format( A807RecExiRea, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTRECEXIREA", GXutil.ltrim( localUtil.ntoc( AV60TotRecExiRea, (byte)(18), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTRECEXIREA", getSecureSignedToken( "", localUtil.format( AV60TotRecExiRea, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTVALORACTUAL", GXutil.ltrim( localUtil.ntoc( AV81TotValorActual, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALORACTUAL", getSecureSignedToken( "", localUtil.format( AV81TotValorActual, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTEXISINICIAL", GXutil.ltrim( localUtil.ntoc( AV65TotExisInicial, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTEXISINICIAL", getSecureSignedToken( "", localUtil.format( AV65TotExisInicial, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTVALEXISINICIAL", GXutil.ltrim( localUtil.ntoc( AV67TotValExisInicial, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALEXISINICIAL", getSecureSignedToken( "", localUtil.format( AV67TotValExisInicial, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTEXISACTUAL", GXutil.ltrim( localUtil.ntoc( AV64TotExisActual, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTEXISACTUAL", getSecureSignedToken( "", localUtil.format( AV64TotExisActual, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTVALEXISACTUAL", GXutil.ltrim( localUtil.ntoc( AV66TotValExisActual, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALEXISACTUAL", getSecureSignedToken( "", localUtil.format( AV66TotValExisActual, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM", GXutil.rtrim( AV68PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV68PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM_TO", GXutil.rtrim( AV69PrdNum_To));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM_TO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV69PrdNum_To, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINVAT", GXutil.ltrim( localUtil.ntoc( AV76InvAt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINVAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76InvAt), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV74ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV74ImpCod, ""))));
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
      AV85Webwldifrecds_1_filterfulltext = AV77FilterFullText ;
      AV86Webwldifrecds_2_recfec = AV19RecFec ;
      AV87Webwldifrecds_3_tfrecfec = AV32TFRecFec ;
      AV88Webwldifrecds_4_tfrechora = AV37TFRechora ;
      AV89Webwldifrecds_5_tfprdnum = AV42TFPrdNum ;
      AV90Webwldifrecds_6_tfprdnum_sel = AV43TFPrdNum_Sel ;
      AV91Webwldifrecds_7_tfprdnom = AV45TFPrdNom ;
      AV92Webwldifrecds_8_tfprdnom_sel = AV46TFPrdNom_Sel ;
      AV93Webwldifrecds_9_tfrecexiteo = AV55TFRecExiTeo ;
      AV94Webwldifrecds_10_tfrecexiteo_to = AV56TFRecExiTeo_To ;
      AV95Webwldifrecds_11_tfrecexirea = AV58TFRecExiRea ;
      AV96Webwldifrecds_12_tfrecexirea_to = AV59TFRecExiRea_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV85Webwldifrecds_1_filterfulltext ,
                                           AV87Webwldifrecds_3_tfrecfec ,
                                           AV88Webwldifrecds_4_tfrechora ,
                                           AV90Webwldifrecds_6_tfprdnum_sel ,
                                           AV89Webwldifrecds_5_tfprdnum ,
                                           AV92Webwldifrecds_8_tfprdnom_sel ,
                                           AV91Webwldifrecds_7_tfprdnom ,
                                           AV93Webwldifrecds_9_tfrecexiteo ,
                                           AV94Webwldifrecds_10_tfrecexiteo_to ,
                                           AV95Webwldifrecds_11_tfrecexirea ,
                                           AV96Webwldifrecds_12_tfrecexirea_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A810RecFec ,
                                           A13455Rechora ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV86Webwldifrecds_2_recfec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE
                                           }
      });
      lV89Webwldifrecds_5_tfprdnum = GXutil.padr( GXutil.rtrim( AV89Webwldifrecds_5_tfprdnum), 6, "%") ;
      lV91Webwldifrecds_7_tfprdnom = GXutil.padr( GXutil.rtrim( AV91Webwldifrecds_7_tfprdnom), 26, "%") ;
      /* Using cursor H00TM3 */
      pr_default.execute(1, new Object[] {A810RecFec, AV86Webwldifrecds_2_recfec, lV89Webwldifrecds_5_tfprdnum, AV90Webwldifrecds_6_tfprdnum_sel, lV91Webwldifrecds_7_tfprdnom, AV92Webwldifrecds_8_tfprdnom_sel});
      GRID_nRecordCount = H00TM3_AGRID_nRecordCount[0] ;
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
      AV85Webwldifrecds_1_filterfulltext = AV77FilterFullText ;
      AV86Webwldifrecds_2_recfec = AV19RecFec ;
      AV87Webwldifrecds_3_tfrecfec = AV32TFRecFec ;
      AV88Webwldifrecds_4_tfrechora = AV37TFRechora ;
      AV89Webwldifrecds_5_tfprdnum = AV42TFPrdNum ;
      AV90Webwldifrecds_6_tfprdnum_sel = AV43TFPrdNum_Sel ;
      AV91Webwldifrecds_7_tfprdnom = AV45TFPrdNom ;
      AV92Webwldifrecds_8_tfprdnom_sel = AV46TFPrdNom_Sel ;
      AV93Webwldifrecds_9_tfrecexiteo = AV55TFRecExiTeo ;
      AV94Webwldifrecds_10_tfrecexiteo_to = AV56TFRecExiTeo_To ;
      AV95Webwldifrecds_11_tfrecexirea = AV58TFRecExiRea ;
      AV96Webwldifrecds_12_tfrecexirea_to = AV59TFRecExiRea_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV77FilterFullText, A810RecFec, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV19RecFec, AV32TFRecFec, AV37TFRechora, AV42TFPrdNum, AV43TFPrdNum_Sel, AV45TFPrdNom, AV46TFPrdNom_Sel, AV55TFRecExiTeo, AV56TFRecExiTeo_To, AV58TFRecExiRea, AV59TFRecExiRea_To, AV97Pgmname, AV16OrderedBy, AV17OrderedDsc, A809RecExiTeo, AV62TotRecExiTeo, A6573RecPreRec, AV79TotValorInicial, A807RecExiRea, AV60TotRecExiRea, AV81TotValorActual, AV65TotExisInicial, AV67TotValExisInicial, AV64TotExisActual, AV66TotValExisActual, AV72Desvios, AV68PrdNum, AV69PrdNum_To, AV76InvAt, AV74ImpCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV85Webwldifrecds_1_filterfulltext = AV77FilterFullText ;
      AV86Webwldifrecds_2_recfec = AV19RecFec ;
      AV87Webwldifrecds_3_tfrecfec = AV32TFRecFec ;
      AV88Webwldifrecds_4_tfrechora = AV37TFRechora ;
      AV89Webwldifrecds_5_tfprdnum = AV42TFPrdNum ;
      AV90Webwldifrecds_6_tfprdnum_sel = AV43TFPrdNum_Sel ;
      AV91Webwldifrecds_7_tfprdnom = AV45TFPrdNom ;
      AV92Webwldifrecds_8_tfprdnom_sel = AV46TFPrdNom_Sel ;
      AV93Webwldifrecds_9_tfrecexiteo = AV55TFRecExiTeo ;
      AV94Webwldifrecds_10_tfrecexiteo_to = AV56TFRecExiTeo_To ;
      AV95Webwldifrecds_11_tfrecexirea = AV58TFRecExiRea ;
      AV96Webwldifrecds_12_tfrecexirea_to = AV59TFRecExiRea_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV77FilterFullText, A810RecFec, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV19RecFec, AV32TFRecFec, AV37TFRechora, AV42TFPrdNum, AV43TFPrdNum_Sel, AV45TFPrdNom, AV46TFPrdNom_Sel, AV55TFRecExiTeo, AV56TFRecExiTeo_To, AV58TFRecExiRea, AV59TFRecExiRea_To, AV97Pgmname, AV16OrderedBy, AV17OrderedDsc, A809RecExiTeo, AV62TotRecExiTeo, A6573RecPreRec, AV79TotValorInicial, A807RecExiRea, AV60TotRecExiRea, AV81TotValorActual, AV65TotExisInicial, AV67TotValExisInicial, AV64TotExisActual, AV66TotValExisActual, AV72Desvios, AV68PrdNum, AV69PrdNum_To, AV76InvAt, AV74ImpCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV85Webwldifrecds_1_filterfulltext = AV77FilterFullText ;
      AV86Webwldifrecds_2_recfec = AV19RecFec ;
      AV87Webwldifrecds_3_tfrecfec = AV32TFRecFec ;
      AV88Webwldifrecds_4_tfrechora = AV37TFRechora ;
      AV89Webwldifrecds_5_tfprdnum = AV42TFPrdNum ;
      AV90Webwldifrecds_6_tfprdnum_sel = AV43TFPrdNum_Sel ;
      AV91Webwldifrecds_7_tfprdnom = AV45TFPrdNom ;
      AV92Webwldifrecds_8_tfprdnom_sel = AV46TFPrdNom_Sel ;
      AV93Webwldifrecds_9_tfrecexiteo = AV55TFRecExiTeo ;
      AV94Webwldifrecds_10_tfrecexiteo_to = AV56TFRecExiTeo_To ;
      AV95Webwldifrecds_11_tfrecexirea = AV58TFRecExiRea ;
      AV96Webwldifrecds_12_tfrecexirea_to = AV59TFRecExiRea_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV77FilterFullText, A810RecFec, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV19RecFec, AV32TFRecFec, AV37TFRechora, AV42TFPrdNum, AV43TFPrdNum_Sel, AV45TFPrdNom, AV46TFPrdNom_Sel, AV55TFRecExiTeo, AV56TFRecExiTeo_To, AV58TFRecExiRea, AV59TFRecExiRea_To, AV97Pgmname, AV16OrderedBy, AV17OrderedDsc, A809RecExiTeo, AV62TotRecExiTeo, A6573RecPreRec, AV79TotValorInicial, A807RecExiRea, AV60TotRecExiRea, AV81TotValorActual, AV65TotExisInicial, AV67TotValExisInicial, AV64TotExisActual, AV66TotValExisActual, AV72Desvios, AV68PrdNum, AV69PrdNum_To, AV76InvAt, AV74ImpCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV85Webwldifrecds_1_filterfulltext = AV77FilterFullText ;
      AV86Webwldifrecds_2_recfec = AV19RecFec ;
      AV87Webwldifrecds_3_tfrecfec = AV32TFRecFec ;
      AV88Webwldifrecds_4_tfrechora = AV37TFRechora ;
      AV89Webwldifrecds_5_tfprdnum = AV42TFPrdNum ;
      AV90Webwldifrecds_6_tfprdnum_sel = AV43TFPrdNum_Sel ;
      AV91Webwldifrecds_7_tfprdnom = AV45TFPrdNom ;
      AV92Webwldifrecds_8_tfprdnom_sel = AV46TFPrdNom_Sel ;
      AV93Webwldifrecds_9_tfrecexiteo = AV55TFRecExiTeo ;
      AV94Webwldifrecds_10_tfrecexiteo_to = AV56TFRecExiTeo_To ;
      AV95Webwldifrecds_11_tfrecexirea = AV58TFRecExiRea ;
      AV96Webwldifrecds_12_tfrecexirea_to = AV59TFRecExiRea_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV77FilterFullText, A810RecFec, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV19RecFec, AV32TFRecFec, AV37TFRechora, AV42TFPrdNum, AV43TFPrdNum_Sel, AV45TFPrdNom, AV46TFPrdNom_Sel, AV55TFRecExiTeo, AV56TFRecExiTeo_To, AV58TFRecExiRea, AV59TFRecExiRea_To, AV97Pgmname, AV16OrderedBy, AV17OrderedDsc, A809RecExiTeo, AV62TotRecExiTeo, A6573RecPreRec, AV79TotValorInicial, A807RecExiRea, AV60TotRecExiRea, AV81TotValorActual, AV65TotExisInicial, AV67TotValExisInicial, AV64TotExisActual, AV66TotValExisActual, AV72Desvios, AV68PrdNum, AV69PrdNum_To, AV76InvAt, AV74ImpCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV85Webwldifrecds_1_filterfulltext = AV77FilterFullText ;
      AV86Webwldifrecds_2_recfec = AV19RecFec ;
      AV87Webwldifrecds_3_tfrecfec = AV32TFRecFec ;
      AV88Webwldifrecds_4_tfrechora = AV37TFRechora ;
      AV89Webwldifrecds_5_tfprdnum = AV42TFPrdNum ;
      AV90Webwldifrecds_6_tfprdnum_sel = AV43TFPrdNum_Sel ;
      AV91Webwldifrecds_7_tfprdnom = AV45TFPrdNom ;
      AV92Webwldifrecds_8_tfprdnom_sel = AV46TFPrdNom_Sel ;
      AV93Webwldifrecds_9_tfrecexiteo = AV55TFRecExiTeo ;
      AV94Webwldifrecds_10_tfrecexiteo_to = AV56TFRecExiTeo_To ;
      AV95Webwldifrecds_11_tfrecexirea = AV58TFRecExiRea ;
      AV96Webwldifrecds_12_tfrecexirea_to = AV59TFRecExiRea_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV77FilterFullText, A810RecFec, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV19RecFec, AV32TFRecFec, AV37TFRechora, AV42TFPrdNum, AV43TFPrdNum_Sel, AV45TFPrdNom, AV46TFPrdNom_Sel, AV55TFRecExiTeo, AV56TFRecExiTeo_To, AV58TFRecExiRea, AV59TFRecExiRea_To, AV97Pgmname, AV16OrderedBy, AV17OrderedDsc, A809RecExiTeo, AV62TotRecExiTeo, A6573RecPreRec, AV79TotValorInicial, A807RecExiRea, AV60TotRecExiRea, AV81TotValorActual, AV65TotExisInicial, AV67TotValExisInicial, AV64TotExisActual, AV66TotValExisActual, AV72Desvios, AV68PrdNum, AV69PrdNum_To, AV76InvAt, AV74ImpCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV97Pgmname = "WebWldifrec" ;
      Gx_err = (short)(0) ;
      edtavValorinicial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValorinicial_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValorinicial_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavValoractual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValoractual_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValoractual_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavTotvaluerecexiteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluerecexiteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluerecexiteo_Enabled), 5, 0), true);
      edtavTotvaluevalorinicial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluevalorinicial_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluevalorinicial_Enabled), 5, 0), true);
      edtavTotvaluerecexirea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluerecexirea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluerecexirea_Enabled), 5, 0), true);
      edtavTotvaluevaloractual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluevaloractual_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluevaloractual_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupTM0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e21TM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV28ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV48DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV25ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_69 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_69"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV50GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV51GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV69PrdNum_To = httpContext.cgiGet( "vPRDNUM_TO") ;
         AV68PrdNum = httpContext.cgiGet( "vPRDNUM") ;
         AV6EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( "DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( "DDO_MANAGEFILTERS_Cls") ;
         Dvpanel_tableheader_Width = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoscroll")) ;
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
         Ddo_grid_Fixable = httpContext.cgiGet( "DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Innewwindow1_Width = httpContext.cgiGet( "INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( "INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( "INNEWWINDOW1_Target") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV77FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77FilterFullText", AV77FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavRecfec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vRECFEC");
            GX_FocusControl = edtavRecfec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19RecFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19RecFec", localUtil.format(AV19RecFec, "99/99/99"));
         }
         else
         {
            AV19RecFec = localUtil.ctod( httpContext.cgiGet( edtavRecfec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19RecFec", localUtil.format(AV19RecFec, "99/99/99"));
         }
         AV72Desvios = ((GXutil.strcmp(httpContext.cgiGet( chkavDesvios.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72Desvios", AV72Desvios);
         AV63TotValueRecExiTeo = httpContext.cgiGet( edtavTotvaluerecexiteo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63TotValueRecExiTeo", AV63TotValueRecExiTeo);
         AV80TotValueValorInicial = httpContext.cgiGet( edtavTotvaluevalorinicial_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80TotValueValorInicial", AV80TotValueValorInicial);
         AV61TotValueRecExiRea = httpContext.cgiGet( edtavTotvaluerecexirea_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61TotValueRecExiRea", AV61TotValueRecExiRea);
         AV82TotValueValorActual = httpContext.cgiGet( edtavTotvaluevaloractual_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82TotValueValorActual", AV82TotValueValorActual);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_recfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_RECFECAUXDATE");
            GX_FocusControl = edtavDdo_recfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34DDO_RecFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34DDO_RecFecAuxDate", localUtil.format(AV34DDO_RecFecAuxDate, "99/99/99"));
         }
         else
         {
            AV34DDO_RecFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_recfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34DDO_RecFecAuxDate", localUtil.format(AV34DDO_RecFecAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_rechoraauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_RECHORAAUXDATE");
            GX_FocusControl = edtavDdo_rechoraauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39DDO_RechoraAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39DDO_RechoraAuxDate", localUtil.format(AV39DDO_RechoraAuxDate, "99/99/99"));
         }
         else
         {
            AV39DDO_RechoraAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_rechoraauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39DDO_RechoraAuxDate", localUtil.format(AV39DDO_RechoraAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV77FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
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
      e21TM2 ();
      if (returnInSub) return;
   }

   public void e21TM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV5Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwldifrec_impl.this.GXt_char1 = GXv_char2[0] ;
      AV5Station = GXt_char1 ;
      GXv_char2[0] = AV6EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwldifrec_impl.this.AV6EmprCod = GXv_char2[0] ;
      webwldifrec_impl.this.AV7EmprNom = GXv_char3[0] ;
      webwldifrec_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      GXt_int5 = (byte)(AV76InvAt) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "INVAT", ""), GXv_int6) ;
      webwldifrec_impl.this.GXt_int5 = GXv_int6[0] ;
      AV76InvAt = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76InvAt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76InvAt), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINVAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76InvAt), "ZZZ9")));
      AV19RecFec = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19RecFec", localUtil.format(AV19RecFec, "99/99/99"));
      AV20RecFec_To = GXutil.today( ) ;
      AV72Desvios = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72Desvios", AV72Desvios);
      GXt_char1 = AV5Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwldifrec_impl.this.GXt_char1 = GXv_char4[0] ;
      AV5Station = GXt_char1 ;
      GXv_char4[0] = AV6EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwldifrec_impl.this.AV6EmprCod = GXv_char4[0] ;
      webwldifrec_impl.this.AV7EmprNom = GXv_char3[0] ;
      webwldifrec_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV11HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Informe Inventario", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV16OrderedBy < 1 )
      {
         AV16OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV48DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV48DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e22TM2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV10WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV30ManageFiltersExecutionStep == 1 )
      {
         AV30ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30ManageFiltersExecutionStep", GXutil.str( AV30ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV30ManageFiltersExecutionStep == 2 )
      {
         AV30ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30ManageFiltersExecutionStep", GXutil.str( AV30ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV27Session.getValue("WebWldifrecColumnsSelector"), "") != 0 )
      {
         AV23ColumnsSelectorXML = AV27Session.getValue("WebWldifrecColumnsSelector") ;
         AV25ColumnsSelector.fromxml(AV23ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtRecFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFec_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtRechora_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRechora_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRechora_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtRecExiTeo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTeo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTeo_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtavValorinicial_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValorinicial_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValorinicial_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtRecExiRea_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiRea_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiRea_Visible), 5, 0), !bGXsfl_69_Refreshing);
      edtavValoractual_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValoractual_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValoractual_Visible), 5, 0), !bGXsfl_69_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV50GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridCurrentPage), 10, 0));
      AV51GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      AV85Webwldifrecds_1_filterfulltext = AV77FilterFullText ;
      AV86Webwldifrecds_2_recfec = AV19RecFec ;
      AV87Webwldifrecds_3_tfrecfec = AV32TFRecFec ;
      AV88Webwldifrecds_4_tfrechora = AV37TFRechora ;
      AV89Webwldifrecds_5_tfprdnum = AV42TFPrdNum ;
      AV90Webwldifrecds_6_tfprdnum_sel = AV43TFPrdNum_Sel ;
      AV91Webwldifrecds_7_tfprdnom = AV45TFPrdNom ;
      AV92Webwldifrecds_8_tfprdnom_sel = AV46TFPrdNom_Sel ;
      AV93Webwldifrecds_9_tfrecexiteo = AV55TFRecExiTeo ;
      AV94Webwldifrecds_10_tfrecexiteo_to = AV56TFRecExiTeo_To ;
      AV95Webwldifrecds_11_tfrecexirea = AV58TFRecExiRea ;
      AV96Webwldifrecds_12_tfrecexirea_to = AV59TFRecExiRea_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25ColumnsSelector", AV25ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28ManageFiltersData", AV28ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void e13TM2( )
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
         AV49PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV49PageToGo) ;
      }
   }

   public void e14TM2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e15TM2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV16OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
         AV17OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedDsc", AV17OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecFec") == 0 )
         {
            AV32TFRecFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFRecFec", localUtil.format(AV32TFRecFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Rechora") == 0 )
         {
            AV37TFRechora = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFRechora", localUtil.ttoc( AV37TFRechora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV42TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFPrdNum", AV42TFPrdNum);
            AV43TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFPrdNum_Sel", AV43TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV45TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFPrdNom", AV45TFPrdNom);
            AV46TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFPrdNom_Sel", AV46TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecExiTeo") == 0 )
         {
            AV55TFRecExiTeo = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFRecExiTeo", GXutil.ltrimstr( AV55TFRecExiTeo, 12, 4));
            AV56TFRecExiTeo_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFRecExiTeo_To", GXutil.ltrimstr( AV56TFRecExiTeo_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecExiRea") == 0 )
         {
            AV58TFRecExiRea = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFRecExiRea", GXutil.ltrimstr( AV58TFRecExiRea, 12, 4));
            AV59TFRecExiRea_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFRecExiRea_To", GXutil.ltrimstr( AV59TFRecExiRea_To, 12, 4));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e23TM2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV52ValorInicial = GXutil.roundDecimal( (A809RecExiTeo.multiply(A6573RecPreRec)), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavValorinicial_Internalname, GXutil.ltrimstr( AV52ValorInicial, 11, 2));
      AV53ValorActual = GXutil.roundDecimal( (A807RecExiRea.multiply(A6573RecPreRec)), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavValoractual_Internalname, GXutil.ltrimstr( AV53ValorActual, 11, 2));
      AV65TotExisInicial = AV65TotExisInicial.add(A809RecExiTeo) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TotExisInicial", GXutil.ltrimstr( AV65TotExisInicial, 12, 4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTEXISINICIAL", getSecureSignedToken( "", localUtil.format( AV65TotExisInicial, "ZZZZZZ9.9999")));
      AV67TotValExisInicial = AV67TotValExisInicial.add(AV52ValorInicial) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TotValExisInicial", GXutil.ltrimstr( AV67TotValExisInicial, 11, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALEXISINICIAL", getSecureSignedToken( "", localUtil.format( AV67TotValExisInicial, "ZZZZZZZ9.99")));
      AV64TotExisActual = AV64TotExisActual.add(A807RecExiRea) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TotExisActual", GXutil.ltrimstr( AV64TotExisActual, 12, 4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTEXISACTUAL", getSecureSignedToken( "", localUtil.format( AV64TotExisActual, "ZZZZZZ9.9999")));
      AV66TotValExisActual = AV66TotValExisActual.add(AV53ValorActual) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TotValExisActual", GXutil.ltrimstr( AV66TotValExisActual, 11, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALEXISACTUAL", getSecureSignedToken( "", localUtil.format( AV66TotValExisActual, "ZZZZZZZ9.99")));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(69) ;
      }
      sendrow_692( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_69_Refreshing )
      {
         httpContext.doAjaxLoad(69, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e16TM2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV23ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV25ColumnsSelector.fromJSonString(AV23ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WebWldifrecColumnsSelector", ((GXutil.strcmp("", AV23ColumnsSelectorXML)==0) ? "" : AV25ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25ColumnsSelector", AV25ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28ManageFiltersData", AV28ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void e12TM2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S192 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WebWldifrecFilters")),GXutil.URLEncode(GXutil.rtrim(AV97Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV30ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30ManageFiltersExecutionStep", GXutil.str( AV30ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WebWldifrecFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV30ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30ManageFiltersExecutionStep", GXutil.str( AV30ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV29ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WebWldifrecFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         webwldifrec_impl.this.GXt_char1 = GXv_char4[0] ;
         AV29ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV29ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S192 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV97Pgmname+"GridState", AV29ManageFiltersXml) ;
            AV14GridState.fromxml(AV29ManageFiltersXml, null, null);
            AV16OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
            AV17OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedDsc", AV17OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S202 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25ColumnsSelector", AV25ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28ManageFiltersData", AV28ManageFiltersData);
   }

   public void e17TM2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV21ExcelFilename ;
      GXv_char3[0] = AV22ErrorMessage ;
      new app.webwldifrecexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      webwldifrec_impl.this.AV21ExcelFilename = GXv_char4[0] ;
      webwldifrec_impl.this.AV22ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV21ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV21ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV22ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void e18TM2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      if ( 0 > 1 )
      {
         /* Execute user subroutine: 'LOADGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         Innewwindow1_Target = formatLink("app.webwldifrecexportreport", new String[] {}, new String[] {})  ;
         ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
         Innewwindow1_Height = "600" ;
         ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
         Innewwindow1_Width = "800" ;
         ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
         this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      }
      if ( AV76InvAt == 0 )
      {
         /* Window Datatype Object Property */
         AV70window.setUrl( formatLink("app.rst0029", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV74ImpCod)),GXutil.URLEncode(GXutil.formatDateParm(AV19RecFec)),GXutil.URLEncode(GXutil.rtrim(AV68PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV69PrdNum_To)),GXutil.URLEncode(GXutil.rtrim(AV72Desvios))}, new String[] {"EmprCod","ImpCod","UFecha","Prdnum1","Prdnum2","desvios"})  );
         AV70window.setReturnParms(new Object[] {"AV6EmprCod","AV74ImpCod","AV19RecFec","AV68PrdNum","AV69PrdNum_To","AV72Desvios",});
         AV70window.setWidth( 1000 );
         AV70window.setHeight( 1000 );
         httpContext.newWindow(AV70window);
      }
      else
      {
         /* Window Datatype Object Property */
         AV70window.setUrl( formatLink("app.rstat29", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV74ImpCod)),GXutil.URLEncode(GXutil.formatDateParm(AV19RecFec)),GXutil.URLEncode(GXutil.rtrim(AV68PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV69PrdNum_To)),GXutil.URLEncode(GXutil.rtrim(AV72Desvios))}, new String[] {"EmprCod","ImpCod","UFecha","prdnum1","prdnum2","desvios"})  );
         AV70window.setReturnParms(new Object[] {"AV6EmprCod","AV74ImpCod","AV19RecFec","AV68PrdNum","AV69PrdNum_To","AV72Desvios",});
         AV70window.setWidth( 1000 );
         AV70window.setHeight( 1000 );
         httpContext.newWindow(AV70window);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void e19TM2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.webwldifrecexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV16OrderedBy, 4, 0))+":"+(AV17OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV25ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "RecFec", "", "Fecha", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Rechora", "", "Hora", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrdNum", "", "Producto", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PrdNom", "", "Descripcion", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "RecExiTeo", "", "Existencia Inicial", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&ValorInicial", "", "Valor", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "RecExiRea", "", "Stock Actual", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&ValorActual", "", "Valor", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV24UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWldifrecColumnsSelector", GXv_char4) ;
      webwldifrec_impl.this.GXt_char1 = GXv_char4[0] ;
      AV24UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV24UserCustomValue)==0) ) )
      {
         AV26ColumnsSelectorAux.fromxml(AV24UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV26ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV25ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV26ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV25ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV28ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WebWldifrecFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV28ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV77FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77FilterFullText", AV77FilterFullText);
      AV19RecFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19RecFec", localUtil.format(AV19RecFec, "99/99/99"));
      AV32TFRecFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFRecFec", localUtil.format(AV32TFRecFec, "99/99/99"));
      AV37TFRechora = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFRechora", localUtil.ttoc( AV37TFRechora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV42TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFPrdNum", AV42TFPrdNum);
      AV43TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFPrdNum_Sel", AV43TFPrdNum_Sel);
      AV45TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFPrdNom", AV45TFPrdNom);
      AV46TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFPrdNom_Sel", AV46TFPrdNom_Sel);
      AV55TFRecExiTeo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFRecExiTeo", GXutil.ltrimstr( AV55TFRecExiTeo, 12, 4));
      AV56TFRecExiTeo_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFRecExiTeo_To", GXutil.ltrimstr( AV56TFRecExiTeo_To, 12, 4));
      AV58TFRecExiRea = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFRecExiRea", GXutil.ltrimstr( AV58TFRecExiRea, 12, 4));
      AV59TFRecExiRea_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFRecExiRea_To", GXutil.ltrimstr( AV59TFRecExiRea_To, 12, 4));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue(AV97Pgmname+"GridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV97Pgmname+"GridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV27Session.getValue(AV97Pgmname+"GridState"), null, null);
      }
      AV16OrderedBy = AV14GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16OrderedBy), 4, 0));
      AV17OrderedDsc = AV14GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedDsc", AV17OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV14GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV14GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV14GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S202( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV98GXV1 = 1 ;
      while ( AV98GXV1 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV98GXV1));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV77FilterFullText = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77FilterFullText", AV77FilterFullText);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "RECFEC") == 0 )
         {
            AV19RecFec = localUtil.ctod( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19RecFec", localUtil.format(AV19RecFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFEC") == 0 )
         {
            AV32TFRecFec = localUtil.ctod( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFRecFec", localUtil.format(AV32TFRecFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECHORA") == 0 )
         {
            AV37TFRechora = localUtil.ctot( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFRechora", localUtil.ttoc( AV37TFRechora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV39DDO_RechoraAuxDate = GXutil.resetTime(AV37TFRechora) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39DDO_RechoraAuxDate", localUtil.format(AV39DDO_RechoraAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV42TFPrdNum = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFPrdNum", AV42TFPrdNum);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV43TFPrdNum_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFPrdNum_Sel", AV43TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV45TFPrdNom = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFPrdNom", AV45TFPrdNom);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV46TFPrdNom_Sel = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFPrdNom_Sel", AV46TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV55TFRecExiTeo = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFRecExiTeo", GXutil.ltrimstr( AV55TFRecExiTeo, 12, 4));
            AV56TFRecExiTeo_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFRecExiTeo_To", GXutil.ltrimstr( AV56TFRecExiTeo_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXIREA") == 0 )
         {
            AV58TFRecExiRea = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFRecExiRea", GXutil.ltrimstr( AV58TFRecExiRea, 12, 4));
            AV59TFRecExiRea_To = CommonUtil.decimalVal( AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFRecExiRea_To", GXutil.ltrimstr( AV59TFRecExiRea_To, 12, 4));
         }
         AV98GXV1 = (int)(AV98GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFPrdNum_Sel)==0), AV43TFPrdNum_Sel, GXv_char4) ;
      webwldifrec_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFPrdNom_Sel)==0), AV46TFPrdNom_Sel, GXv_char3) ;
      webwldifrec_impl.this.GXt_char14 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|"+GXt_char14+"||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char4[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFPrdNum)==0), AV42TFPrdNum, GXv_char4) ;
      webwldifrec_impl.this.GXt_char14 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFPrdNom)==0), AV45TFPrdNom, GXv_char3) ;
      webwldifrec_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32TFRecFec)) ? "" : localUtil.dtoc( AV32TFRecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV37TFRechora) ? "" : localUtil.dtoc( AV39DDO_RechoraAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char14+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFRecExiTeo)==0) ? "" : GXutil.str( AV55TFRecExiTeo, 12, 4))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFRecExiRea)==0) ? "" : GXutil.str( AV58TFRecExiRea, 12, 4))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFRecExiTeo_To)==0) ? "" : GXutil.str( AV56TFRecExiTeo_To, 12, 4))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFRecExiRea_To)==0) ? "" : GXutil.str( AV59TFRecExiRea_To, 12, 4))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV14GridState.fromxml(AV27Session.getValue(AV97Pgmname+"GridState"), null, null);
      AV14GridState.setgxTv_SdtWWPGridState_Orderedby( AV16OrderedBy );
      AV14GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV17OrderedDsc );
      AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState15[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV77FilterFullText)==0), (short)(0), AV77FilterFullText, "") ;
      AV14GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "RECFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV19RecFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV19RecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV14GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFRECFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32TFRecFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV32TFRecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV14GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFRECHORA", "", !GXutil.dateCompare(GXutil.nullDate(), AV37TFRechora), (short)(0), GXutil.trim( localUtil.ttoc( AV37TFRechora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV14GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFPRDNUM", "", !(GXutil.strcmp("", AV42TFPrdNum)==0), (short)(0), AV42TFPrdNum, "", !(GXutil.strcmp("", AV43TFPrdNum_Sel)==0), AV43TFPrdNum_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFPRDNOM", "", !(GXutil.strcmp("", AV45TFPrdNom)==0), (short)(0), AV45TFPrdNom, "", !(GXutil.strcmp("", AV46TFPrdNom_Sel)==0), AV46TFPrdNom_Sel, "") ;
      AV14GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFRECEXITEO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFRecExiTeo)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFRecExiTeo_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV55TFRecExiTeo, 12, 4)), GXutil.trim( GXutil.str( AV56TFRecExiTeo_To, 12, 4))) ;
      AV14GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFRECEXIREA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFRecExiRea)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFRecExiRea_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV58TFRecExiRea, 12, 4)), GXutil.trim( GXutil.str( AV59TFRecExiRea_To, 12, 4))) ;
      AV14GridState = GXv_SdtWWPGridState15[0] ;
      AV14GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV14GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV97Pgmname+"GridState", AV14GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV12TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV97Pgmname );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV11HTTPRequest.getScriptName()+"?"+AV11HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TRECUEN" );
      AV27Session.setValue("TrnContext", AV12TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV62TotRecExiTeo = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TotRecExiTeo", GXutil.ltrimstr( AV62TotRecExiTeo, 18, 4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTRECEXITEO", getSecureSignedToken( "", localUtil.format( AV62TotRecExiTeo, "ZZZZZZ9.9999")));
      AV79TotValorInicial = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TotValorInicial", GXutil.ltrimstr( AV79TotValorInicial, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALORINICIAL", getSecureSignedToken( "", localUtil.format( AV79TotValorInicial, "ZZZZZZZ9.99")));
      AV60TotRecExiRea = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TotRecExiRea", GXutil.ltrimstr( AV60TotRecExiRea, 18, 4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTRECEXIREA", getSecureSignedToken( "", localUtil.format( AV60TotRecExiRea, "ZZZZZZ9.9999")));
      AV81TotValorActual = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81TotValorActual", GXutil.ltrimstr( AV81TotValorActual, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALORACTUAL", getSecureSignedToken( "", localUtil.format( AV81TotValorActual, "ZZZZZZZ9.99")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV85Webwldifrecds_1_filterfulltext = AV77FilterFullText ;
      AV86Webwldifrecds_2_recfec = AV19RecFec ;
      AV87Webwldifrecds_3_tfrecfec = AV32TFRecFec ;
      AV88Webwldifrecds_4_tfrechora = AV37TFRechora ;
      AV89Webwldifrecds_5_tfprdnum = AV42TFPrdNum ;
      AV90Webwldifrecds_6_tfprdnum_sel = AV43TFPrdNum_Sel ;
      AV91Webwldifrecds_7_tfprdnom = AV45TFPrdNom ;
      AV92Webwldifrecds_8_tfprdnom_sel = AV46TFPrdNom_Sel ;
      AV93Webwldifrecds_9_tfrecexiteo = AV55TFRecExiTeo ;
      AV94Webwldifrecds_10_tfrecexiteo_to = AV56TFRecExiTeo_To ;
      AV95Webwldifrecds_11_tfrecexirea = AV58TFRecExiRea ;
      AV96Webwldifrecds_12_tfrecexirea_to = AV59TFRecExiRea_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV85Webwldifrecds_1_filterfulltext ,
                                           AV87Webwldifrecds_3_tfrecfec ,
                                           AV88Webwldifrecds_4_tfrechora ,
                                           AV90Webwldifrecds_6_tfprdnum_sel ,
                                           AV89Webwldifrecds_5_tfprdnum ,
                                           AV92Webwldifrecds_8_tfprdnom_sel ,
                                           AV91Webwldifrecds_7_tfprdnom ,
                                           AV93Webwldifrecds_9_tfrecexiteo ,
                                           AV94Webwldifrecds_10_tfrecexiteo_to ,
                                           AV95Webwldifrecds_11_tfrecexirea ,
                                           AV96Webwldifrecds_12_tfrecexirea_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A810RecFec ,
                                           A13455Rechora ,
                                           AV86Webwldifrecds_2_recfec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV89Webwldifrecds_5_tfprdnum = GXutil.padr( GXutil.rtrim( AV89Webwldifrecds_5_tfprdnum), 6, "%") ;
      lV91Webwldifrecds_7_tfprdnom = GXutil.padr( GXutil.rtrim( AV91Webwldifrecds_7_tfprdnom), 26, "%") ;
      /* Using cursor H00TM4 */
      pr_default.execute(2, new Object[] {A810RecFec, AV86Webwldifrecds_2_recfec, lV89Webwldifrecds_5_tfprdnum, AV90Webwldifrecds_6_tfprdnum_sel, lV91Webwldifrecds_7_tfprdnom, AV92Webwldifrecds_8_tfprdnom_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A718PrdNom = H00TM4_A718PrdNom[0] ;
         A719PrdNum = H00TM4_A719PrdNum[0] ;
         AV62TotRecExiTeo = A809RecExiTeo.add(AV62TotRecExiTeo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62TotRecExiTeo", GXutil.ltrimstr( AV62TotRecExiTeo, 18, 4));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTRECEXITEO", getSecureSignedToken( "", localUtil.format( AV62TotRecExiTeo, "ZZZZZZ9.9999")));
         AV52ValorInicial = GXutil.roundDecimal( (A809RecExiTeo.multiply(A6573RecPreRec)), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavValorinicial_Internalname, GXutil.ltrimstr( AV52ValorInicial, 11, 2));
         AV79TotValorInicial = AV52ValorInicial.add(AV79TotValorInicial) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79TotValorInicial", GXutil.ltrimstr( AV79TotValorInicial, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALORINICIAL", getSecureSignedToken( "", localUtil.format( AV79TotValorInicial, "ZZZZZZZ9.99")));
         AV60TotRecExiRea = A807RecExiRea.add(AV60TotRecExiRea) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60TotRecExiRea", GXutil.ltrimstr( AV60TotRecExiRea, 18, 4));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTRECEXIREA", getSecureSignedToken( "", localUtil.format( AV60TotRecExiRea, "ZZZZZZ9.9999")));
         AV53ValorActual = GXutil.roundDecimal( (A807RecExiRea.multiply(A6573RecPreRec)), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavValoractual_Internalname, GXutil.ltrimstr( AV53ValorActual, 11, 2));
         AV81TotValorActual = AV53ValorActual.add(AV81TotValorActual) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81TotValorActual", GXutil.ltrimstr( AV81TotValorActual, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTVALORACTUAL", getSecureSignedToken( "", localUtil.format( AV81TotValorActual, "ZZZZZZZ9.99")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV63TotValueRecExiTeo = localUtil.format( AV62TotRecExiTeo, "ZZZZZZ9.9999") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TotValueRecExiTeo", AV63TotValueRecExiTeo);
      AV80TotValueValorInicial = localUtil.format( AV79TotValorInicial, "ZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80TotValueValorInicial", AV80TotValueValorInicial);
      AV61TotValueRecExiRea = localUtil.format( AV60TotRecExiRea, "ZZZZZZ9.9999") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TotValueRecExiRea", AV61TotValueRecExiRea);
      AV82TotValueValorActual = localUtil.format( AV81TotValorActual, "ZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82TotValueValorActual", AV82TotValueValorActual);
   }

   public void e20TM2( )
   {
      /* Recfec_Controlvaluechanged Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25ColumnsSelector", AV25ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28ManageFiltersData", AV28ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
   }

   public void wb_table3_80_TM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridtabletotalizer_Internalname, tblGridtabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluerecexiteo_Internalname, httpContext.getMessage( "Tot Value Rec Exi Teo", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluerecexiteo_Internalname, AV63TotValueRecExiTeo, GXutil.rtrim( localUtil.format( AV63TotValueRecExiTeo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluerecexiteo_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluerecexiteo_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWldifrec.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluevalorinicial_Internalname, httpContext.getMessage( "Tot Value Valor Inicial", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluevalorinicial_Internalname, AV80TotValueValorInicial, GXutil.rtrim( localUtil.format( AV80TotValueValorInicial, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluevalorinicial_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluevalorinicial_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWldifrec.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluerecexirea_Internalname, httpContext.getMessage( "Tot Value Rec Exi Rea", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluerecexirea_Internalname, AV61TotValueRecExiRea, GXutil.rtrim( localUtil.format( AV61TotValueRecExiRea, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluerecexirea_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluerecexirea_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWldifrec.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluevaloractual_Internalname, httpContext.getMessage( "Tot Value Valor Actual", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluevaloractual_Internalname, AV82TotValueValorActual, GXutil.rtrim( localUtil.format( AV82TotValueValorActual, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluevaloractual_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluevaloractual_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWldifrec.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_80_TM2e( true) ;
      }
      else
      {
         wb_table3_80_TM2e( false) ;
      }
   }

   public void wb_table2_50_TM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedfiltertextrecfec_Internalname, tblTablemergedfiltertextrecfec_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecfec_Internalname, httpContext.getMessage( "Rec Fec", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavRecfec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecfec_Internalname, localUtil.format(AV19RecFec, "99/99/99"), localUtil.format( AV19RecFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecfec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecfec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWldifrec.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavRecfec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavRecfec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWldifrec.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgConsulta_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgConsulta_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgConsulta_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgConsulta_Jsonclick, "'"+""+"'"+",false,"+"'"+"e24tm1_client"+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WebWldifrec.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_50_TM2e( true) ;
      }
      else
      {
         wb_table2_50_TM2e( false) ;
      }
   }

   public void wb_table1_28_TM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_31_TM2( true) ;
      }
      else
      {
         wb_table4_31_TM2( false) ;
      }
      return  ;
   }

   public void wb_table4_31_TM2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV28ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_28_TM2e( true) ;
      }
      else
      {
         wb_table1_28_TM2e( false) ;
      }
   }

   public void wb_table4_31_TM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV77FilterFullText, GXutil.rtrim( localUtil.format( AV77FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WebWldifrec.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_31_TM2e( true) ;
      }
      else
      {
         wb_table4_31_TM2e( false) ;
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
      paTM2( ) ;
      wsTM2( ) ;
      weTM2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116124944", true, true);
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
      httpContext.AddJavascriptSource("webwldifrec.js", "?202682116124944", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_692( )
   {
      edtRecFec_Internalname = "RECFEC_"+sGXsfl_69_idx ;
      edtRechora_Internalname = "RECHORA_"+sGXsfl_69_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_69_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_69_idx ;
      edtRecExiTeo_Internalname = "RECEXITEO_"+sGXsfl_69_idx ;
      edtavValorinicial_Internalname = "vVALORINICIAL_"+sGXsfl_69_idx ;
      edtRecExiRea_Internalname = "RECEXIREA_"+sGXsfl_69_idx ;
      edtavValoractual_Internalname = "vVALORACTUAL_"+sGXsfl_69_idx ;
   }

   public void subsflControlProps_fel_692( )
   {
      edtRecFec_Internalname = "RECFEC_"+sGXsfl_69_fel_idx ;
      edtRechora_Internalname = "RECHORA_"+sGXsfl_69_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_69_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_69_fel_idx ;
      edtRecExiTeo_Internalname = "RECEXITEO_"+sGXsfl_69_fel_idx ;
      edtavValorinicial_Internalname = "vVALORINICIAL_"+sGXsfl_69_fel_idx ;
      edtRecExiRea_Internalname = "RECEXIREA_"+sGXsfl_69_fel_idx ;
      edtavValoractual_Internalname = "vVALORACTUAL_"+sGXsfl_69_fel_idx ;
   }

   public void sendrow_692( )
   {
      subsflControlProps_692( ) ;
      wbTM0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_69_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_69_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_69_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecFec_Internalname,localUtil.format(A810RecFec, "99/99/99"),localUtil.format( A810RecFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRechora_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRechora_Internalname,localUtil.ttoc( A13455Rechora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A13455Rechora, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRechora_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRechora_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecExiTeo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExiTeo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecExiTeo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavValorinicial_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValorinicial_Internalname,GXutil.ltrim( localUtil.ntoc( AV52ValorInicial, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavValorinicial_Enabled!=0) ? localUtil.format( AV52ValorInicial, "ZZZZZZZ9.99") : localUtil.format( AV52ValorInicial, "ZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavValorinicial_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavValorinicial_Visible),Integer.valueOf(edtavValorinicial_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecExiRea_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiRea_Internalname,GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A807RecExiRea, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExiRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecExiRea_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavValoractual_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValoractual_Internalname,GXutil.ltrim( localUtil.ntoc( AV53ValorActual, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavValoractual_Enabled!=0) ? localUtil.format( AV53ValorActual, "ZZZZZZZ9.99") : localUtil.format( AV53ValorActual, "ZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavValoractual_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavValoractual_Visible),Integer.valueOf(edtavValoractual_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesTM2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_69_idx = ((subGrid_Islastpage==1)&&(nGXsfl_69_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_69_idx+1) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_692( ) ;
      }
      /* End function sendrow_692 */
   }

   public void startgridcontrol69( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"69\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRechora_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecExiTeo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Existencia Inicial", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavValorinicial_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecExiRea_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Stock Actual", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavValoractual_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A810RecFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A13455Rechora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRechora_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecExiTeo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV52ValorInicial, (byte)(11), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValorinicial_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavValorinicial_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecExiRea_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV53ValorActual, (byte)(11), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValoractual_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavValoractual_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportreport_Internalname = "BTNEXPORTREPORT" ;
      bttBtnbtninforme_Internalname = "BTNBTNINFORME" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      lblFiltertextrecfec_Internalname = "FILTERTEXTRECFEC" ;
      edtavRecfec_Internalname = "vRECFEC" ;
      imgConsulta_Internalname = "CONSULTA" ;
      tblTablemergedfiltertextrecfec_Internalname = "TABLEMERGEDFILTERTEXTRECFEC" ;
      divTablesplittedfiltertextrecfec_Internalname = "TABLESPLITTEDFILTERTEXTRECFEC" ;
      chkavDesvios.setInternalname( "vDESVIOS" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtRecFec_Internalname = "RECFEC" ;
      edtRechora_Internalname = "RECHORA" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtRecExiTeo_Internalname = "RECEXITEO" ;
      edtavValorinicial_Internalname = "vVALORINICIAL" ;
      edtRecExiRea_Internalname = "RECEXIREA" ;
      edtavValoractual_Internalname = "vVALORACTUAL" ;
      edtavTotvaluerecexiteo_Internalname = "vTOTVALUERECEXITEO" ;
      edtavTotvaluevalorinicial_Internalname = "vTOTVALUEVALORINICIAL" ;
      edtavTotvaluerecexirea_Internalname = "vTOTVALUERECEXIREA" ;
      edtavTotvaluevaloractual_Internalname = "vTOTVALUEVALORACTUAL" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_recfecauxdate_Internalname = "vDDO_RECFECAUXDATE" ;
      divDdo_recfecauxdates_Internalname = "DDO_RECFECAUXDATES" ;
      edtavDdo_rechoraauxdate_Internalname = "vDDO_RECHORAAUXDATE" ;
      divDdo_rechoraauxdates_Internalname = "DDO_RECHORAAUXDATES" ;
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
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtavValoractual_Jsonclick = "" ;
      edtavValoractual_Enabled = 0 ;
      edtRecExiRea_Jsonclick = "" ;
      edtavValorinicial_Jsonclick = "" ;
      edtavValorinicial_Enabled = 0 ;
      edtRecExiTeo_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtRechora_Jsonclick = "" ;
      edtRecFec_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavRecfec_Jsonclick = "" ;
      edtavRecfec_Enabled = 1 ;
      edtavTotvaluevaloractual_Jsonclick = "" ;
      edtavTotvaluevaloractual_Enabled = 1 ;
      edtavTotvaluerecexirea_Jsonclick = "" ;
      edtavTotvaluerecexirea_Enabled = 1 ;
      edtavTotvaluevalorinicial_Jsonclick = "" ;
      edtavTotvaluevalorinicial_Enabled = 1 ;
      edtavTotvaluerecexiteo_Jsonclick = "" ;
      edtavTotvaluerecexiteo_Enabled = 1 ;
      edtavValoractual_Visible = -1 ;
      edtRecExiRea_Visible = -1 ;
      edtavValorinicial_Visible = -1 ;
      edtRecExiTeo_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      edtRechora_Visible = -1 ;
      edtRecFec_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_rechoraauxdate_Jsonclick = "" ;
      edtavDdo_recfecauxdate_Jsonclick = "" ;
      chkavDesvios.setEnabled( 1 );
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "WebWldifrecGetFilterData" ;
      Ddo_grid_Datalisttype = "||Dynamic|Dynamic||||" ;
      Ddo_grid_Includedatalist = "||T|T||||" ;
      Ddo_grid_Filterisrange = "||||T||T|" ;
      Ddo_grid_Filtertype = "Date|Date|Character|Character|Numeric||Numeric|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T||T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T||T|" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5||6|" ;
      Ddo_grid_Columnids = "0:RecFec|1:Rechora|2:PrdNum|3:PrdNom|4:RecExiTeo|5:ValorInicial|6:RecExiRea|7:ValorActual" ;
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
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "WWP_FilterOptions", "") ;
      Dvpanel_tableheader_Cls = "PanelNoHeader" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Informe Inventario", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavDesvios.setName( "vDESVIOS" );
      chkavDesvios.setWebtags( "" );
      chkavDesvios.setCaption( httpContext.getMessage( "Solo Desvios?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavDesvios.getInternalname(), "TitleCaption", chkavDesvios.getCaption(), true);
      chkavDesvios.setCheckedValue( "N" );
      AV72Desvios = ((GXutil.strcmp(GXutil.rtrim( AV72Desvios), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72Desvios", AV72Desvios);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV19RecFec',fld:'vRECFEC',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV37TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV42TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV43TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV45TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV46TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV55TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV59TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV62TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'A6573RecPreRec',fld:'RECPREREC',pic:'ZZZZ9.99999',hsh:true},{av:'AV79TotValorInicial',fld:'vTOTVALORINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV60TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV81TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV65TotExisInicial',fld:'vTOTEXISINICIAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV67TotValExisInicial',fld:'vTOTVALEXISINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV64TotExisActual',fld:'vTOTEXISACTUAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV66TotValExisActual',fld:'vTOTVALEXISACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV72Desvios',fld:'vDESVIOS',pic:''},{av:'AV68PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV69PrdNum_To',fld:'vPRDNUM_TO',pic:'',hsh:true},{av:'AV76InvAt',fld:'vINVAT',pic:'ZZZ9',hsh:true},{av:'AV74ImpCod',fld:'vIMPCOD',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecFec_Visible',ctrl:'RECFEC',prop:'Visible'},{av:'edtRechora_Visible',ctrl:'RECHORA',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavValorinicial_Visible',ctrl:'vVALORINICIAL',prop:'Visible'},{av:'edtRecExiRea_Visible',ctrl:'RECEXIREA',prop:'Visible'},{av:'edtavValoractual_Visible',ctrl:'vVALORACTUAL',prop:'Visible'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV62TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV79TotValorInicial',fld:'vTOTVALORINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV60TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV81TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV52ValorInicial',fld:'vVALORINICIAL',pic:'ZZZZZZZ9.99'},{av:'AV53ValorActual',fld:'vVALORACTUAL',pic:'ZZZZZZZ9.99'},{av:'AV63TotValueRecExiTeo',fld:'vTOTVALUERECEXITEO',pic:''},{av:'AV80TotValueValorInicial',fld:'vTOTVALUEVALORINICIAL',pic:''},{av:'AV61TotValueRecExiRea',fld:'vTOTVALUERECEXIREA',pic:''},{av:'AV82TotValueValorActual',fld:'vTOTVALUEVALORACTUAL',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e13TM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19RecFec',fld:'vRECFEC',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV37TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV42TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV43TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV45TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV46TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV55TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV59TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV62TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'A6573RecPreRec',fld:'RECPREREC',pic:'ZZZZ9.99999',hsh:true},{av:'AV79TotValorInicial',fld:'vTOTVALORINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV60TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV81TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV65TotExisInicial',fld:'vTOTEXISINICIAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV67TotValExisInicial',fld:'vTOTVALEXISINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV64TotExisActual',fld:'vTOTEXISACTUAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV66TotValExisActual',fld:'vTOTVALEXISACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV72Desvios',fld:'vDESVIOS',pic:''},{av:'AV68PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV69PrdNum_To',fld:'vPRDNUM_TO',pic:'',hsh:true},{av:'AV76InvAt',fld:'vINVAT',pic:'ZZZ9',hsh:true},{av:'AV74ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e14TM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19RecFec',fld:'vRECFEC',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV37TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV42TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV43TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV45TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV46TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV55TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV59TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV62TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'A6573RecPreRec',fld:'RECPREREC',pic:'ZZZZ9.99999',hsh:true},{av:'AV79TotValorInicial',fld:'vTOTVALORINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV60TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV81TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV65TotExisInicial',fld:'vTOTEXISINICIAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV67TotValExisInicial',fld:'vTOTVALEXISINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV64TotExisActual',fld:'vTOTEXISACTUAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV66TotValExisActual',fld:'vTOTVALEXISACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV72Desvios',fld:'vDESVIOS',pic:''},{av:'AV68PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV69PrdNum_To',fld:'vPRDNUM_TO',pic:'',hsh:true},{av:'AV76InvAt',fld:'vINVAT',pic:'ZZZ9',hsh:true},{av:'AV74ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e15TM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19RecFec',fld:'vRECFEC',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV37TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV42TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV43TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV45TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV46TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV55TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV59TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV62TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'A6573RecPreRec',fld:'RECPREREC',pic:'ZZZZ9.99999',hsh:true},{av:'AV79TotValorInicial',fld:'vTOTVALORINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV60TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV81TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV65TotExisInicial',fld:'vTOTEXISINICIAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV67TotValExisInicial',fld:'vTOTVALEXISINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV64TotExisActual',fld:'vTOTEXISACTUAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV66TotValExisActual',fld:'vTOTVALEXISACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV72Desvios',fld:'vDESVIOS',pic:''},{av:'AV68PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV69PrdNum_To',fld:'vPRDNUM_TO',pic:'',hsh:true},{av:'AV76InvAt',fld:'vINVAT',pic:'ZZZ9',hsh:true},{av:'AV74ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV59TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV55TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV45TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV46TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV42TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV43TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV37TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e23TM2',iparms:[{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'A6573RecPreRec',fld:'RECPREREC',pic:'ZZZZ9.99999',hsh:true},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV65TotExisInicial',fld:'vTOTEXISINICIAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV67TotValExisInicial',fld:'vTOTVALEXISINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV64TotExisActual',fld:'vTOTEXISACTUAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV66TotValExisActual',fld:'vTOTVALEXISACTUAL',pic:'ZZZZZZZ9.99',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV52ValorInicial',fld:'vVALORINICIAL',pic:'ZZZZZZZ9.99'},{av:'AV53ValorActual',fld:'vVALORACTUAL',pic:'ZZZZZZZ9.99'},{av:'AV65TotExisInicial',fld:'vTOTEXISINICIAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV67TotValExisInicial',fld:'vTOTVALEXISINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV64TotExisActual',fld:'vTOTEXISACTUAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV66TotValExisActual',fld:'vTOTVALEXISACTUAL',pic:'ZZZZZZZ9.99',hsh:true}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e16TM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19RecFec',fld:'vRECFEC',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV37TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV42TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV43TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV45TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV46TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV55TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV59TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV62TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'A6573RecPreRec',fld:'RECPREREC',pic:'ZZZZ9.99999',hsh:true},{av:'AV79TotValorInicial',fld:'vTOTVALORINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV60TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV81TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV65TotExisInicial',fld:'vTOTEXISINICIAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV67TotValExisInicial',fld:'vTOTVALEXISINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV64TotExisActual',fld:'vTOTEXISACTUAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV66TotValExisActual',fld:'vTOTVALEXISACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV72Desvios',fld:'vDESVIOS',pic:''},{av:'AV68PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV69PrdNum_To',fld:'vPRDNUM_TO',pic:'',hsh:true},{av:'AV76InvAt',fld:'vINVAT',pic:'ZZZ9',hsh:true},{av:'AV74ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtRecFec_Visible',ctrl:'RECFEC',prop:'Visible'},{av:'edtRechora_Visible',ctrl:'RECHORA',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavValorinicial_Visible',ctrl:'vVALORINICIAL',prop:'Visible'},{av:'edtRecExiRea_Visible',ctrl:'RECEXIREA',prop:'Visible'},{av:'edtavValoractual_Visible',ctrl:'vVALORACTUAL',prop:'Visible'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV62TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV79TotValorInicial',fld:'vTOTVALORINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV60TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV81TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV52ValorInicial',fld:'vVALORINICIAL',pic:'ZZZZZZZ9.99'},{av:'AV53ValorActual',fld:'vVALORACTUAL',pic:'ZZZZZZZ9.99'},{av:'AV63TotValueRecExiTeo',fld:'vTOTVALUERECEXITEO',pic:''},{av:'AV80TotValueValorInicial',fld:'vTOTVALUEVALORINICIAL',pic:''},{av:'AV61TotValueRecExiRea',fld:'vTOTVALUERECEXIREA',pic:''},{av:'AV82TotValueValorActual',fld:'vTOTVALUEVALORACTUAL',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e12TM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19RecFec',fld:'vRECFEC',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV37TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV42TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV43TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV45TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV46TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV55TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV59TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV62TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'A6573RecPreRec',fld:'RECPREREC',pic:'ZZZZ9.99999',hsh:true},{av:'AV79TotValorInicial',fld:'vTOTVALORINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV60TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV81TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV65TotExisInicial',fld:'vTOTEXISINICIAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV67TotValExisInicial',fld:'vTOTVALEXISINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV64TotExisActual',fld:'vTOTEXISACTUAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV66TotValExisActual',fld:'vTOTVALEXISACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV72Desvios',fld:'vDESVIOS',pic:''},{av:'AV68PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV69PrdNum_To',fld:'vPRDNUM_TO',pic:'',hsh:true},{av:'AV76InvAt',fld:'vINVAT',pic:'ZZZ9',hsh:true},{av:'AV74ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV39DDO_RechoraAuxDate',fld:'vDDO_RECHORAAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV19RecFec',fld:'vRECFEC',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV37TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV42TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV43TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV45TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV46TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV55TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV59TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV39DDO_RechoraAuxDate',fld:'vDDO_RECHORAAUXDATE',pic:''},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecFec_Visible',ctrl:'RECFEC',prop:'Visible'},{av:'edtRechora_Visible',ctrl:'RECHORA',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavValorinicial_Visible',ctrl:'vVALORINICIAL',prop:'Visible'},{av:'edtRecExiRea_Visible',ctrl:'RECEXIREA',prop:'Visible'},{av:'edtavValoractual_Visible',ctrl:'vVALORACTUAL',prop:'Visible'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV62TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV79TotValorInicial',fld:'vTOTVALORINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV60TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV81TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV52ValorInicial',fld:'vVALORINICIAL',pic:'ZZZZZZZ9.99'},{av:'AV53ValorActual',fld:'vVALORACTUAL',pic:'ZZZZZZZ9.99'},{av:'AV63TotValueRecExiTeo',fld:'vTOTVALUERECEXITEO',pic:''},{av:'AV80TotValueValorInicial',fld:'vTOTVALUEVALORINICIAL',pic:''},{av:'AV61TotValueRecExiRea',fld:'vTOTVALUERECEXIREA',pic:''},{av:'AV82TotValueValorActual',fld:'vTOTVALUEVALORACTUAL',pic:''}]}");
      setEventMetadata("'DOCONSULTA'","{handler:'e24TM1',iparms:[{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19RecFec',fld:'vRECFEC',pic:''}]");
      setEventMetadata("'DOCONSULTA'",",oparms:[{av:'AV19RecFec',fld:'vRECFEC',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOBTNINFORME'","{handler:'e11TM1',iparms:[{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV68PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV69PrdNum_To',fld:'vPRDNUM_TO',pic:'',hsh:true},{av:'AV19RecFec',fld:'vRECFEC',pic:''}]");
      setEventMetadata("'DOBTNINFORME'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17TM2',iparms:[{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV43TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV37TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV39DDO_RechoraAuxDate',fld:'vDDO_RECHORAAUXDATE',pic:''},{av:'AV42TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV45TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV55TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV58TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV59TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19RecFec',fld:'vRECFEC',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV37TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV42TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV43TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV45TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV46TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV55TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV59TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV62TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'A6573RecPreRec',fld:'RECPREREC',pic:'ZZZZ9.99999',hsh:true},{av:'AV79TotValorInicial',fld:'vTOTVALORINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV60TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV81TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV65TotExisInicial',fld:'vTOTEXISINICIAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV67TotValExisInicial',fld:'vTOTVALEXISINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV64TotExisActual',fld:'vTOTEXISACTUAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV66TotValExisActual',fld:'vTOTVALEXISACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV72Desvios',fld:'vDESVIOS',pic:''},{av:'AV68PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV69PrdNum_To',fld:'vPRDNUM_TO',pic:'',hsh:true},{av:'AV76InvAt',fld:'vINVAT',pic:'ZZZ9',hsh:true},{av:'AV74ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV39DDO_RechoraAuxDate',fld:'vDDO_RECHORAAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e18TM2',iparms:[{av:'AV76InvAt',fld:'vINVAT',pic:'ZZZ9',hsh:true},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV74ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV19RecFec',fld:'vRECFEC',pic:''},{av:'AV68PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV69PrdNum_To',fld:'vPRDNUM_TO',pic:'',hsh:true},{av:'AV72Desvios',fld:'vDESVIOS',pic:''},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV43TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV37TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV39DDO_RechoraAuxDate',fld:'vDDO_RECHORAAUXDATE',pic:''},{av:'AV42TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV45TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV55TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV58TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV59TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19RecFec',fld:'vRECFEC',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV37TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV42TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV43TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV45TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV46TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV55TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV59TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV62TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'A6573RecPreRec',fld:'RECPREREC',pic:'ZZZZ9.99999',hsh:true},{av:'AV79TotValorInicial',fld:'vTOTVALORINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV60TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV81TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV65TotExisInicial',fld:'vTOTEXISINICIAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV67TotValExisInicial',fld:'vTOTVALEXISINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV64TotExisActual',fld:'vTOTEXISACTUAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV66TotValExisActual',fld:'vTOTVALEXISACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV72Desvios',fld:'vDESVIOS',pic:''},{av:'AV68PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV69PrdNum_To',fld:'vPRDNUM_TO',pic:'',hsh:true},{av:'AV76InvAt',fld:'vINVAT',pic:'ZZZ9',hsh:true},{av:'AV74ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV39DDO_RechoraAuxDate',fld:'vDDO_RECHORAAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e19TM2',iparms:[{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV43TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV46TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV37TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV39DDO_RechoraAuxDate',fld:'vDDO_RECHORAAUXDATE',pic:''},{av:'AV42TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV45TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV55TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV58TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV59TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19RecFec',fld:'vRECFEC',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV37TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV42TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV43TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV45TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV46TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV55TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV59TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV62TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'A6573RecPreRec',fld:'RECPREREC',pic:'ZZZZ9.99999',hsh:true},{av:'AV79TotValorInicial',fld:'vTOTVALORINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV60TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV81TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV65TotExisInicial',fld:'vTOTEXISINICIAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV67TotValExisInicial',fld:'vTOTVALEXISINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV64TotExisActual',fld:'vTOTEXISACTUAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV66TotValExisActual',fld:'vTOTVALEXISACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV72Desvios',fld:'vDESVIOS',pic:''},{av:'AV68PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV69PrdNum_To',fld:'vPRDNUM_TO',pic:'',hsh:true},{av:'AV76InvAt',fld:'vINVAT',pic:'ZZZ9',hsh:true},{av:'AV74ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV39DDO_RechoraAuxDate',fld:'vDDO_RECHORAAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VRECFEC.CONTROLVALUECHANGED","{handler:'e20TM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19RecFec',fld:'vRECFEC',pic:''},{av:'AV32TFRecFec',fld:'vTFRECFEC',pic:''},{av:'AV37TFRechora',fld:'vTFRECHORA',pic:'99/99/99 99:99'},{av:'AV42TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV43TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV45TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV46TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV55TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFRecExiRea',fld:'vTFRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV59TFRecExiRea_To',fld:'vTFRECEXIREA_TO',pic:'ZZZZZZ9.9999'},{av:'AV97Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV17OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV62TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'A6573RecPreRec',fld:'RECPREREC',pic:'ZZZZ9.99999',hsh:true},{av:'AV79TotValorInicial',fld:'vTOTVALORINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV60TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV81TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV65TotExisInicial',fld:'vTOTEXISINICIAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV67TotValExisInicial',fld:'vTOTVALEXISINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV64TotExisActual',fld:'vTOTEXISACTUAL',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV66TotValExisActual',fld:'vTOTVALEXISACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV72Desvios',fld:'vDESVIOS',pic:''},{av:'AV68PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV69PrdNum_To',fld:'vPRDNUM_TO',pic:'',hsh:true},{av:'AV76InvAt',fld:'vINVAT',pic:'ZZZ9',hsh:true},{av:'AV74ImpCod',fld:'vIMPCOD',pic:'',hsh:true}]");
      setEventMetadata("VRECFEC.CONTROLVALUECHANGED",",oparms:[{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecFec_Visible',ctrl:'RECFEC',prop:'Visible'},{av:'edtRechora_Visible',ctrl:'RECHORA',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavValorinicial_Visible',ctrl:'vVALORINICIAL',prop:'Visible'},{av:'edtRecExiRea_Visible',ctrl:'RECEXIREA',prop:'Visible'},{av:'edtavValoractual_Visible',ctrl:'vVALORACTUAL',prop:'Visible'},{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV62TotRecExiTeo',fld:'vTOTRECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV79TotValorInicial',fld:'vTOTVALORINICIAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV60TotRecExiRea',fld:'vTOTRECEXIREA',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV81TotValorActual',fld:'vTOTVALORACTUAL',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV52ValorInicial',fld:'vVALORINICIAL',pic:'ZZZZZZZ9.99'},{av:'AV53ValorActual',fld:'vVALORACTUAL',pic:'ZZZZZZZ9.99'},{av:'AV63TotValueRecExiTeo',fld:'vTOTVALUERECEXITEO',pic:''},{av:'AV80TotValueValorInicial',fld:'vTOTVALUEVALORINICIAL',pic:''},{av:'AV61TotValueRecExiRea',fld:'vTOTVALUERECEXIREA',pic:''},{av:'AV82TotValueValorActual',fld:'vTOTVALUEVALORACTUAL',pic:''}]}");
      setEventMetadata("NULL","{handler:'validv_Valoractual',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV77FilterFullText = "" ;
      A810RecFec = GXutil.nullDate() ;
      AV25ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV19RecFec = GXutil.nullDate() ;
      AV32TFRecFec = GXutil.nullDate() ;
      AV37TFRechora = GXutil.resetTime( GXutil.nullDate() );
      AV42TFPrdNum = "" ;
      AV43TFPrdNum_Sel = "" ;
      AV45TFPrdNom = "" ;
      AV46TFPrdNom_Sel = "" ;
      AV55TFRecExiTeo = DecimalUtil.ZERO ;
      AV56TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV58TFRecExiRea = DecimalUtil.ZERO ;
      AV59TFRecExiRea_To = DecimalUtil.ZERO ;
      AV97Pgmname = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      AV62TotRecExiTeo = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      AV79TotValorInicial = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      AV60TotRecExiRea = DecimalUtil.ZERO ;
      AV81TotValorActual = DecimalUtil.ZERO ;
      AV65TotExisInicial = DecimalUtil.ZERO ;
      AV67TotValExisInicial = DecimalUtil.ZERO ;
      AV64TotExisActual = DecimalUtil.ZERO ;
      AV66TotValExisActual = DecimalUtil.ZERO ;
      AV72Desvios = "" ;
      AV68PrdNum = "" ;
      AV69PrdNum_To = "" ;
      AV74ImpCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV28ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV48DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV6EmprCod = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnbtninforme_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      lblFiltertextrecfec_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV34DDO_RecFecAuxDate = GXutil.nullDate() ;
      AV39DDO_RechoraAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      AV52ValorInicial = DecimalUtil.ZERO ;
      AV53ValorActual = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV89Webwldifrecds_5_tfprdnum = "" ;
      lV91Webwldifrecds_7_tfprdnom = "" ;
      AV85Webwldifrecds_1_filterfulltext = "" ;
      AV87Webwldifrecds_3_tfrecfec = GXutil.nullDate() ;
      AV88Webwldifrecds_4_tfrechora = GXutil.resetTime( GXutil.nullDate() );
      AV90Webwldifrecds_6_tfprdnum_sel = "" ;
      AV89Webwldifrecds_5_tfprdnum = "" ;
      AV92Webwldifrecds_8_tfprdnom_sel = "" ;
      AV91Webwldifrecds_7_tfprdnom = "" ;
      AV93Webwldifrecds_9_tfrecexiteo = DecimalUtil.ZERO ;
      AV94Webwldifrecds_10_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV95Webwldifrecds_11_tfrecexirea = DecimalUtil.ZERO ;
      AV96Webwldifrecds_12_tfrecexirea_to = DecimalUtil.ZERO ;
      AV86Webwldifrecds_2_recfec = GXutil.nullDate() ;
      H00TM2_A396EmprCod = new String[] {""} ;
      H00TM2_A718PrdNom = new String[] {""} ;
      H00TM2_A719PrdNum = new String[] {""} ;
      H00TM3_AGRID_nRecordCount = new long[1] ;
      AV63TotValueRecExiTeo = "" ;
      AV80TotValueValorInicial = "" ;
      AV61TotValueRecExiRea = "" ;
      AV82TotValueValorActual = "" ;
      AV5Station = "" ;
      AV7EmprNom = "" ;
      AV8UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      AV20RecFec_To = GXutil.nullDate() ;
      GXv_char2 = new String[1] ;
      AV11HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV23ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV29ManageFiltersXml = "" ;
      AV21ExcelFilename = "" ;
      AV22ErrorMessage = "" ;
      AV70window = new com.genexus.webpanels.GXWindow();
      AV24UserCustomValue = "" ;
      AV26ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char14 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState15 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV12TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      H00TM4_A396EmprCod = new String[] {""} ;
      H00TM4_A718PrdNom = new String[] {""} ;
      H00TM4_A719PrdNum = new String[] {""} ;
      imgConsulta_gximage = "" ;
      sImgUrl = "" ;
      imgConsulta_Jsonclick = "" ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwldifrec__default(),
         new Object[] {
             new Object[] {
            H00TM2_A396EmprCod, H00TM2_A718PrdNom, H00TM2_A719PrdNum
            }
            , new Object[] {
            H00TM3_AGRID_nRecordCount
            }
            , new Object[] {
            H00TM4_A396EmprCod, H00TM4_A718PrdNom, H00TM4_A719PrdNum
            }
         }
      );
      AV97Pgmname = "WebWldifrec" ;
      /* GeneXus formulas. */
      AV97Pgmname = "WebWldifrec" ;
      Gx_err = (short)(0) ;
      edtavValorinicial_Enabled = 0 ;
      edtavValoractual_Enabled = 0 ;
      edtavTotvaluerecexiteo_Enabled = 0 ;
      edtavTotvaluevalorinicial_Enabled = 0 ;
      edtavTotvaluerecexirea_Enabled = 0 ;
      edtavTotvaluevaloractual_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV30ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV16OrderedBy ;
   private short AV76InvAt ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_69 ;
   private int nGXsfl_69_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int subGrid_Islastpage ;
   private int edtavValorinicial_Enabled ;
   private int edtavValoractual_Enabled ;
   private int edtavTotvaluerecexiteo_Enabled ;
   private int edtavTotvaluevalorinicial_Enabled ;
   private int edtavTotvaluerecexirea_Enabled ;
   private int edtavTotvaluevaloractual_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtRecFec_Visible ;
   private int edtRechora_Visible ;
   private int edtPrdNum_Visible ;
   private int edtPrdNom_Visible ;
   private int edtRecExiTeo_Visible ;
   private int edtavValorinicial_Visible ;
   private int edtRecExiRea_Visible ;
   private int edtavValoractual_Visible ;
   private int AV49PageToGo ;
   private int AV98GXV1 ;
   private int edtavRecfec_Enabled ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV50GridCurrentPage ;
   private long AV51GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV55TFRecExiTeo ;
   private java.math.BigDecimal AV56TFRecExiTeo_To ;
   private java.math.BigDecimal AV58TFRecExiRea ;
   private java.math.BigDecimal AV59TFRecExiRea_To ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal AV62TotRecExiTeo ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal AV79TotValorInicial ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal AV60TotRecExiRea ;
   private java.math.BigDecimal AV81TotValorActual ;
   private java.math.BigDecimal AV65TotExisInicial ;
   private java.math.BigDecimal AV67TotValExisInicial ;
   private java.math.BigDecimal AV64TotExisActual ;
   private java.math.BigDecimal AV66TotValExisActual ;
   private java.math.BigDecimal AV52ValorInicial ;
   private java.math.BigDecimal AV53ValorActual ;
   private java.math.BigDecimal AV93Webwldifrecds_9_tfrecexiteo ;
   private java.math.BigDecimal AV94Webwldifrecds_10_tfrecexiteo_to ;
   private java.math.BigDecimal AV95Webwldifrecds_11_tfrecexirea ;
   private java.math.BigDecimal AV96Webwldifrecds_12_tfrecexirea_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_69_idx="0001" ;
   private String AV42TFPrdNum ;
   private String AV43TFPrdNum_Sel ;
   private String AV45TFPrdNom ;
   private String AV46TFPrdNom_Sel ;
   private String AV97Pgmname ;
   private String AV72Desvios ;
   private String AV68PrdNum ;
   private String AV69PrdNum_To ;
   private String AV74ImpCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV6EmprCod ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnbtninforme_Internalname ;
   private String bttBtnbtninforme_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divTablesplittedfiltertextrecfec_Internalname ;
   private String lblFiltertextrecfec_Internalname ;
   private String lblFiltertextrecfec_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_recfecauxdates_Internalname ;
   private String edtavDdo_recfecauxdate_Internalname ;
   private String edtavDdo_recfecauxdate_Jsonclick ;
   private String divDdo_rechoraauxdates_Internalname ;
   private String edtavDdo_rechoraauxdate_Internalname ;
   private String edtavDdo_rechoraauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtRecFec_Internalname ;
   private String edtRechora_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtRecExiTeo_Internalname ;
   private String edtavValorinicial_Internalname ;
   private String edtRecExiRea_Internalname ;
   private String edtavValoractual_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavTotvaluerecexiteo_Internalname ;
   private String edtavTotvaluevalorinicial_Internalname ;
   private String edtavTotvaluerecexirea_Internalname ;
   private String edtavTotvaluevaloractual_Internalname ;
   private String scmdbuf ;
   private String lV89Webwldifrecds_5_tfprdnum ;
   private String lV91Webwldifrecds_7_tfprdnom ;
   private String AV90Webwldifrecds_6_tfprdnum_sel ;
   private String AV89Webwldifrecds_5_tfprdnum ;
   private String AV92Webwldifrecds_8_tfprdnom_sel ;
   private String AV91Webwldifrecds_7_tfprdnom ;
   private String edtavRecfec_Internalname ;
   private String AV5Station ;
   private String AV7EmprNom ;
   private String AV8UsurCod ;
   private String GXv_char2[] ;
   private String GXt_char14 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluerecexiteo_Jsonclick ;
   private String edtavTotvaluevalorinicial_Jsonclick ;
   private String edtavTotvaluerecexirea_Jsonclick ;
   private String edtavTotvaluevaloractual_Jsonclick ;
   private String tblTablemergedfiltertextrecfec_Internalname ;
   private String edtavRecfec_Jsonclick ;
   private String imgConsulta_gximage ;
   private String sImgUrl ;
   private String imgConsulta_Internalname ;
   private String imgConsulta_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_69_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtRecFec_Jsonclick ;
   private String edtRechora_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtRecExiTeo_Jsonclick ;
   private String edtavValorinicial_Jsonclick ;
   private String edtRecExiRea_Jsonclick ;
   private String edtavValoractual_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV37TFRechora ;
   private java.util.Date A13455Rechora ;
   private java.util.Date AV88Webwldifrecds_4_tfrechora ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV19RecFec ;
   private java.util.Date AV32TFRecFec ;
   private java.util.Date AV34DDO_RecFecAuxDate ;
   private java.util.Date AV39DDO_RechoraAuxDate ;
   private java.util.Date AV87Webwldifrecds_3_tfrecfec ;
   private java.util.Date AV86Webwldifrecds_2_recfec ;
   private java.util.Date AV20RecFec_To ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV17OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_69_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV23ColumnsSelectorXML ;
   private String AV29ManageFiltersXml ;
   private String AV24UserCustomValue ;
   private String AV77FilterFullText ;
   private String AV85Webwldifrecds_1_filterfulltext ;
   private String AV63TotValueRecExiTeo ;
   private String AV80TotValueValorInicial ;
   private String AV61TotValueRecExiRea ;
   private String AV82TotValueValorActual ;
   private String AV21ExcelFilename ;
   private String AV22ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWindow AV70window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV11HTTPRequest ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private ICheckbox chkavDesvios ;
   private IDataStoreProvider pr_default ;
   private String[] H00TM2_A396EmprCod ;
   private String[] H00TM2_A718PrdNom ;
   private String[] H00TM2_A719PrdNum ;
   private long[] H00TM3_AGRID_nRecordCount ;
   private String[] H00TM4_A396EmprCod ;
   private String[] H00TM4_A718PrdNom ;
   private String[] H00TM4_A719PrdNum ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV28ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV48DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState15[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV12TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class webwldifrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00TM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV85Webwldifrecds_1_filterfulltext ,
                                          java.util.Date AV87Webwldifrecds_3_tfrecfec ,
                                          java.util.Date AV88Webwldifrecds_4_tfrechora ,
                                          String AV90Webwldifrecds_6_tfprdnum_sel ,
                                          String AV89Webwldifrecds_5_tfprdnum ,
                                          String AV92Webwldifrecds_8_tfprdnom_sel ,
                                          String AV91Webwldifrecds_7_tfprdnom ,
                                          java.math.BigDecimal AV93Webwldifrecds_9_tfrecexiteo ,
                                          java.math.BigDecimal AV94Webwldifrecds_10_tfrecexiteo_to ,
                                          java.math.BigDecimal AV95Webwldifrecds_11_tfrecexirea ,
                                          java.math.BigDecimal AV96Webwldifrecds_12_tfrecexirea_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          java.util.Date AV86Webwldifrecds_2_recfec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[11];
      Object[] GXv_Object17 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, PrdNom, PrdNum" ;
      sFromString = " FROM TXPPRODUC" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(? = ?)");
      if ( (GXutil.strcmp("", AV90Webwldifrecds_6_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV89Webwldifrecds_5_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Webwldifrecds_6_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Webwldifrecds_8_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Webwldifrecds_7_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Webwldifrecds_8_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY PrdNum" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY PrdNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         sOrderString += " ORDER BY PrdNom" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += " ORDER BY PrdNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, PrdNum" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_H00TM3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV85Webwldifrecds_1_filterfulltext ,
                                          java.util.Date AV87Webwldifrecds_3_tfrecfec ,
                                          java.util.Date AV88Webwldifrecds_4_tfrechora ,
                                          String AV90Webwldifrecds_6_tfprdnum_sel ,
                                          String AV89Webwldifrecds_5_tfprdnum ,
                                          String AV92Webwldifrecds_8_tfprdnom_sel ,
                                          String AV91Webwldifrecds_7_tfprdnom ,
                                          java.math.BigDecimal AV93Webwldifrecds_9_tfrecexiteo ,
                                          java.math.BigDecimal AV94Webwldifrecds_10_tfrecexiteo_to ,
                                          java.math.BigDecimal AV95Webwldifrecds_11_tfrecexirea ,
                                          java.math.BigDecimal AV96Webwldifrecds_12_tfrecexirea_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          java.util.Date AV86Webwldifrecds_2_recfec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[6];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPPRODUC" ;
      addWhere(sWhereString, "(? = ?)");
      if ( (GXutil.strcmp("", AV90Webwldifrecds_6_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV89Webwldifrecds_5_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Webwldifrecds_6_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Webwldifrecds_8_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Webwldifrecds_7_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Webwldifrecds_8_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV16OrderedBy == 1 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 1 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_H00TM4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV85Webwldifrecds_1_filterfulltext ,
                                          java.util.Date AV87Webwldifrecds_3_tfrecfec ,
                                          java.util.Date AV88Webwldifrecds_4_tfrechora ,
                                          String AV90Webwldifrecds_6_tfprdnum_sel ,
                                          String AV89Webwldifrecds_5_tfprdnum ,
                                          String AV92Webwldifrecds_8_tfprdnom_sel ,
                                          String AV91Webwldifrecds_7_tfprdnom ,
                                          java.math.BigDecimal AV93Webwldifrecds_9_tfrecexiteo ,
                                          java.math.BigDecimal AV94Webwldifrecds_10_tfrecexiteo_to ,
                                          java.math.BigDecimal AV95Webwldifrecds_11_tfrecexirea ,
                                          java.math.BigDecimal AV96Webwldifrecds_12_tfrecexirea_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora ,
                                          java.util.Date AV86Webwldifrecds_2_recfec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[6];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNom, PrdNum FROM TXPPRODUC" ;
      addWhere(sWhereString, "(? = ?)");
      if ( (GXutil.strcmp("", AV90Webwldifrecds_6_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV89Webwldifrecds_5_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Webwldifrecds_6_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Webwldifrecds_8_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Webwldifrecds_7_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Webwldifrecds_8_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, PrdNum" ;
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
            case 0 :
                  return conditional_H00TM2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (java.util.Date)dynConstraints[19] );
            case 1 :
                  return conditional_H00TM3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (java.util.Date)dynConstraints[19] );
            case 2 :
                  return conditional_H00TM4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00TM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00TM3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00TM4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
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
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[6]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[7]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 26);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[6]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[7]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 26);
               }
               return;
      }
   }

}

