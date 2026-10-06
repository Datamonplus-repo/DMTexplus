package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class historicoderecetas_agrupacionacabados_wp_impl extends GXDataArea
{
   public historicoderecetas_agrupacionacabados_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public historicoderecetas_agrupacionacabados_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( historicoderecetas_agrupacionacabados_wp_impl.class ));
   }

   public historicoderecetas_agrupacionacabados_wp_impl( int remoteHandle ,
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
            AV59Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59Emprcod", AV59Emprcod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59Emprcod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV60HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV60HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60HreBarCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60HreBarCod), "ZZZZZZZ9")));
               AV61HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV61HreBarReo", GXutil.str( AV61HreBarReo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61HreBarReo), "9")));
               AV62HreBarpar = httpContext.GetPar( "HreBarpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV62HreBarpar", AV62HreBarpar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62HreBarpar, ""))));
               AV63HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV63HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63HreNumCie), 2, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHRENUMCIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63HreNumCie), "Z9")));
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
      nRC_GXsfl_37 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_37"))) ;
      nGXsfl_37_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_37_idx"))) ;
      sGXsfl_37_idx = httpContext.GetPar( "sGXsfl_37_idx") ;
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
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV59Emprcod = httpContext.GetPar( "Emprcod") ;
      AV60HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
      AV61HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
      AV62HreBarpar = httpContext.GetPar( "HreBarpar") ;
      AV63HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
      AV23ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV18ColumnsSelector);
      AV51TFHreAcNHdr = httpContext.GetPar( "TFHreAcNHdr") ;
      AV52TFHreAcNHdr_Sel = httpContext.GetPar( "TFHreAcNHdr_Sel") ;
      AV38TFHreAcSer = httpContext.GetPar( "TFHreAcSer") ;
      AV39TFHreAcSer_Sel = httpContext.GetPar( "TFHreAcSer_Sel") ;
      AV40TFHreAcDsc = httpContext.GetPar( "TFHreAcDsc") ;
      AV41TFHreAcDsc_Sel = httpContext.GetPar( "TFHreAcDsc_Sel") ;
      AV42TFHreAcCol = httpContext.GetPar( "TFHreAcCol") ;
      AV43TFHreAcCol_Sel = httpContext.GetPar( "TFHreAcCol_Sel") ;
      AV44TFHreAcNumC = (int)(GXutil.lval( httpContext.GetPar( "TFHreAcNumC"))) ;
      AV45TFHreAcNumC_To = (int)(GXutil.lval( httpContext.GetPar( "TFHreAcNumC_To"))) ;
      AV36TFHreAcCli = (int)(GXutil.lval( httpContext.GetPar( "TFHreAcCli"))) ;
      AV37TFHreAcCli_To = (int)(GXutil.lval( httpContext.GetPar( "TFHreAcCli_To"))) ;
      AV30TFHreAcKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFHreAcKgm"), ".") ;
      AV31TFHreAcKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHreAcKgm_To"), ".") ;
      AV32TFHreAcMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFHreAcMtr"), ".") ;
      AV33TFHreAcMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHreAcMtr_To"), ".") ;
      AV34TFHreAcPie = (int)(GXutil.lval( httpContext.GetPar( "TFHreAcPie"))) ;
      AV35TFHreAcPie_To = (int)(GXutil.lval( httpContext.GetPar( "TFHreAcPie_To"))) ;
      AV88Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV53TotHreAcKgm = CommonUtil.decimalVal( httpContext.GetPar( "TotHreAcKgm"), ".") ;
      AV55TotHreAcMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotHreAcMtr"), ".") ;
      AV57TotHreAcPie = GXutil.lval( httpContext.GetPar( "TotHreAcPie")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV59Emprcod, AV60HreBarCod, AV61HreBarReo, AV62HreBarpar, AV63HreNumCie, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV51TFHreAcNHdr, AV52TFHreAcNHdr_Sel, AV38TFHreAcSer, AV39TFHreAcSer_Sel, AV40TFHreAcDsc, AV41TFHreAcDsc_Sel, AV42TFHreAcCol, AV43TFHreAcCol_Sel, AV44TFHreAcNumC, AV45TFHreAcNumC_To, AV36TFHreAcCli, AV37TFHreAcCli_To, AV30TFHreAcKgm, AV31TFHreAcKgm_To, AV32TFHreAcMtr, AV33TFHreAcMtr_To, AV34TFHreAcPie, AV35TFHreAcPie_To, AV88Pgmname, AV12OrderedBy, AV13OrderedDsc, AV53TotHreAcKgm, AV55TotHreAcMtr, AV57TotHreAcPie) ;
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
      pa1FZ2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1FZ2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.historicoderecetas_agrupacionacabados_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV59Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV60HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV61HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV62HreBarpar)),GXutil.URLEncode(GXutil.ltrimstr(AV63HreNumCie,2,0))}, new String[] {"Emprcod","HreBarCod","HreBarReo","HreBarpar","HreNumCie"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV88Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREACKGM", getSecureSignedToken( "", localUtil.format( AV53TotHreAcKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREACMTR", getSecureSignedToken( "", localUtil.format( AV55TotHreAcMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREACPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV57TotHreAcPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60HreBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61HreBarReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62HreBarpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHRENUMCIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63HreNumCie), "Z9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_37", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_37, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV48GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV49GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV46DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV46DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV23ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACNHDR", GXutil.rtrim( AV51TFHreAcNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACNHDR_SEL", GXutil.rtrim( AV52TFHreAcNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACSER", GXutil.rtrim( AV38TFHreAcSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACSER_SEL", GXutil.rtrim( AV39TFHreAcSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACDSC", GXutil.rtrim( AV40TFHreAcDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACDSC_SEL", GXutil.rtrim( AV41TFHreAcDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACCOL", GXutil.rtrim( AV42TFHreAcCol));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACCOL_SEL", GXutil.rtrim( AV43TFHreAcCol_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACNUMC", GXutil.ltrim( localUtil.ntoc( AV44TFHreAcNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACNUMC_TO", GXutil.ltrim( localUtil.ntoc( AV45TFHreAcNumC_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACCLI", GXutil.ltrim( localUtil.ntoc( AV36TFHreAcCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACCLI_TO", GXutil.ltrim( localUtil.ntoc( AV37TFHreAcCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACKGM", GXutil.ltrim( localUtil.ntoc( AV30TFHreAcKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACKGM_TO", GXutil.ltrim( localUtil.ntoc( AV31TFHreAcKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACMTR", GXutil.ltrim( localUtil.ntoc( AV32TFHreAcMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACMTR_TO", GXutil.ltrim( localUtil.ntoc( AV33TFHreAcMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACPIE", GXutil.ltrim( localUtil.ntoc( AV34TFHreAcPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREACPIE_TO", GXutil.ltrim( localUtil.ntoc( AV35TFHreAcPie_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV88Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV88Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV59Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREBARCOD", GXutil.ltrim( localUtil.ntoc( AV60HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60HreBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREBARREO", GXutil.ltrim( localUtil.ntoc( AV61HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61HreBarReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREBARPAR", GXutil.rtrim( AV62HreBarpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62HreBarpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHRENUMCIE", GXutil.ltrim( localUtil.ntoc( AV63HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHRENUMCIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63HreNumCie), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTHREACKGM", GXutil.ltrim( localUtil.ntoc( AV53TotHreAcKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREACKGM", getSecureSignedToken( "", localUtil.format( AV53TotHreAcKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTHREACMTR", GXutil.ltrim( localUtil.ntoc( AV55TotHreAcMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREACMTR", getSecureSignedToken( "", localUtil.format( AV55TotHreAcMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTHREACPIE", GXutil.ltrim( localUtil.ntoc( AV57TotHreAcPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREACPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV57TotHreAcPie), "ZZZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
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
         we1FZ2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1FZ2( ) ;
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
      return formatLink("app.historicoderecetas_agrupacionacabados_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV59Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV60HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV61HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV62HreBarpar)),GXutil.URLEncode(GXutil.ltrimstr(AV63HreNumCie,2,0))}, new String[] {"Emprcod","HreBarCod","HreBarReo","HreBarpar","HreNumCie"})  ;
   }

   public String getPgmname( )
   {
      return "HistoricodeRecetas_AgrupacionAcabados_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Tabla HISHRA", "") ;
   }

   public void wb1FZ0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 37, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HistoricodeRecetas_AgrupacionAcabados_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_19_1FZ2( true) ;
      }
      else
      {
         wb_table1_19_1FZ2( false) ;
      }
      return  ;
   }

   public void wb_table1_19_1FZ2e( boolean wbgen )
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
         startgridcontrol37( ) ;
      }
      if ( wbEnd == 37 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_37 = (int)(nGXsfl_37_idx-1) ;
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
         wb_table2_57_1FZ2( true) ;
      }
      else
      {
         wb_table2_57_1FZ2( false) ;
      }
      return  ;
   }

   public void wb_table2_57_1FZ2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV48GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV49GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV46DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV46DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV18ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 37 )
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

   public void start1FZ2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Tabla HISHRA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1FZ0( ) ;
   }

   public void ws1FZ2( )
   {
      start1FZ2( ) ;
      evt1FZ2( ) ;
   }

   public void evt1FZ2( )
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
                           e111FZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121FZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131FZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141FZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151FZ2 ();
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
                           nGXsfl_37_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_372( ) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4494HreBarPar = httpContext.cgiGet( edtHreBarPar_Internalname) ;
                           A4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9985HreAcCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAcCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9986HreAcReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreAcReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9987HreAcPar = httpContext.cgiGet( edtHreAcPar_Internalname) ;
                           A13895HreAcNHdr = httpContext.cgiGet( edtHreAcNHdr_Internalname) ;
                           A9992HreAcSer = httpContext.cgiGet( edtHreAcSer_Internalname) ;
                           n9992HreAcSer = false ;
                           A9993HreAcDsc = httpContext.cgiGet( edtHreAcDsc_Internalname) ;
                           n9993HreAcDsc = false ;
                           A9994HreAcCol = httpContext.cgiGet( edtHreAcCol_Internalname) ;
                           n9994HreAcCol = false ;
                           A9995HreAcNumC = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAcNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n9995HreAcNumC = false ;
                           A9991HreAcCli = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAcCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n9991HreAcCli = false ;
                           A9988HreAcKgm = localUtil.ctond( httpContext.cgiGet( edtHreAcKgm_Internalname)) ;
                           n9988HreAcKgm = false ;
                           A9989HreAcMtr = localUtil.ctond( httpContext.cgiGet( edtHreAcMtr_Internalname)) ;
                           n9989HreAcMtr = false ;
                           A9990HreAcPie = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAcPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n9990HreAcPie = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e161FZ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e171FZ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e181FZ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_37_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_372( ) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4494HreBarPar = httpContext.cgiGet( edtHreBarPar_Internalname) ;
                           A4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9985HreAcCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAcCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9986HreAcReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreAcReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9987HreAcPar = httpContext.cgiGet( edtHreAcPar_Internalname) ;
                           A13895HreAcNHdr = httpContext.cgiGet( edtHreAcNHdr_Internalname) ;
                           A9992HreAcSer = httpContext.cgiGet( edtHreAcSer_Internalname) ;
                           n9992HreAcSer = false ;
                           A9993HreAcDsc = httpContext.cgiGet( edtHreAcDsc_Internalname) ;
                           n9993HreAcDsc = false ;
                           A9994HreAcCol = httpContext.cgiGet( edtHreAcCol_Internalname) ;
                           n9994HreAcCol = false ;
                           A9995HreAcNumC = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAcNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n9995HreAcNumC = false ;
                           A9991HreAcCli = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAcCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n9991HreAcCli = false ;
                           A9988HreAcKgm = localUtil.ctond( httpContext.cgiGet( edtHreAcKgm_Internalname)) ;
                           n9988HreAcKgm = false ;
                           A9989HreAcMtr = localUtil.ctond( httpContext.cgiGet( edtHreAcMtr_Internalname)) ;
                           n9989HreAcMtr = false ;
                           A9990HreAcPie = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAcPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n9990HreAcPie = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e161FZ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e171FZ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e181FZ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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

   public void we1FZ2( )
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

   public void pa1FZ2( )
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
      subsflControlProps_372( ) ;
      while ( nGXsfl_37_idx <= nRC_GXsfl_37 )
      {
         sendrow_372( ) ;
         nGXsfl_37_idx = ((subGrid_Islastpage==1)&&(nGXsfl_37_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_37_idx+1) ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 String AV59Emprcod ,
                                 int AV60HreBarCod ,
                                 byte AV61HreBarReo ,
                                 String AV62HreBarpar ,
                                 byte AV63HreNumCie ,
                                 byte AV23ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV51TFHreAcNHdr ,
                                 String AV52TFHreAcNHdr_Sel ,
                                 String AV38TFHreAcSer ,
                                 String AV39TFHreAcSer_Sel ,
                                 String AV40TFHreAcDsc ,
                                 String AV41TFHreAcDsc_Sel ,
                                 String AV42TFHreAcCol ,
                                 String AV43TFHreAcCol_Sel ,
                                 int AV44TFHreAcNumC ,
                                 int AV45TFHreAcNumC_To ,
                                 int AV36TFHreAcCli ,
                                 int AV37TFHreAcCli_To ,
                                 java.math.BigDecimal AV30TFHreAcKgm ,
                                 java.math.BigDecimal AV31TFHreAcKgm_To ,
                                 java.math.BigDecimal AV32TFHreAcMtr ,
                                 java.math.BigDecimal AV33TFHreAcMtr_To ,
                                 int AV34TFHreAcPie ,
                                 int AV35TFHreAcPie_To ,
                                 String AV88Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV53TotHreAcKgm ,
                                 java.math.BigDecimal AV55TotHreAcMtr ,
                                 long AV57TotHreAcPie )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171FZ2 ();
      GRID_nCurrentRecord = 0 ;
      rf1FZ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
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
      rf1FZ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV88Pgmname = "HistoricodeRecetas_AgrupacionAcabados_WP" ;
      Gx_err = (short)(0) ;
      edtavTotvaluehreackgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluehreackgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehreackgm_Enabled), 5, 0), true);
      edtavTotvaluehreacmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluehreacmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehreacmtr_Enabled), 5, 0), true);
      edtavTotvaluehreacpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluehreacpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehreacpie_Enabled), 5, 0), true);
   }

   public void rf1FZ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(37) ;
      /* Execute user event: Refresh */
      e171FZ2 ();
      nGXsfl_37_idx = 1 ;
      sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_372( ) ;
      bGXsfl_37_Refreshing = true ;
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
         subsflControlProps_372( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ,
                                              AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel ,
                                              AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ,
                                              AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel ,
                                              AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ,
                                              AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel ,
                                              AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ,
                                              AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel ,
                                              AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ,
                                              Integer.valueOf(AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc) ,
                                              Integer.valueOf(AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to) ,
                                              Integer.valueOf(AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli) ,
                                              Integer.valueOf(AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to) ,
                                              AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm ,
                                              AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to ,
                                              AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr ,
                                              AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to ,
                                              Integer.valueOf(AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie) ,
                                              Integer.valueOf(AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to) ,
                                              Integer.valueOf(A9985HreAcCod) ,
                                              Byte.valueOf(A9986HreAcReo) ,
                                              A9987HreAcPar ,
                                              A9992HreAcSer ,
                                              A9993HreAcDsc ,
                                              A9994HreAcCol ,
                                              Integer.valueOf(A9995HreAcNumC) ,
                                              Integer.valueOf(A9991HreAcCli) ,
                                              A9988HreAcKgm ,
                                              A9989HreAcMtr ,
                                              Integer.valueOf(A9990HreAcPie) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV59Emprcod ,
                                              Integer.valueOf(AV60HreBarCod) ,
                                              Byte.valueOf(AV61HreBarReo) ,
                                              AV62HreBarpar ,
                                              Byte.valueOf(AV63HreNumCie) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A4492HreBarCod) ,
                                              Byte.valueOf(A4493HreBarReo) ,
                                              A4494HreBarPar ,
                                              Byte.valueOf(A4495HreNumCie) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE
                                              }
         });
         lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
         lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
         lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
         lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
         lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
         lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
         lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
         lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
         lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
         lV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = GXutil.padr( GXutil.rtrim( AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr), 11, "%") ;
         lV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = GXutil.padr( GXutil.rtrim( AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser), 16, "%") ;
         lV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = GXutil.padr( GXutil.rtrim( AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc), 26, "%") ;
         lV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = GXutil.padr( GXutil.rtrim( AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol), 13, "%") ;
         /* Using cursor H01FZ2 */
         pr_default.execute(0, new Object[] {AV59Emprcod, Integer.valueOf(AV60HreBarCod), Byte.valueOf(AV61HreBarReo), AV62HreBarpar, Byte.valueOf(AV63HreNumCie), lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr, AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel, lV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser, AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel, lV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc, AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel, lV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol, AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel, Integer.valueOf(AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc), Integer.valueOf(AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to), Integer.valueOf(AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli), Integer.valueOf(AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to), AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm, AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to, AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr, AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to, Integer.valueOf(AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie), Integer.valueOf(AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_37_idx = 1 ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A9990HreAcPie = H01FZ2_A9990HreAcPie[0] ;
            n9990HreAcPie = H01FZ2_n9990HreAcPie[0] ;
            A9989HreAcMtr = H01FZ2_A9989HreAcMtr[0] ;
            n9989HreAcMtr = H01FZ2_n9989HreAcMtr[0] ;
            A9988HreAcKgm = H01FZ2_A9988HreAcKgm[0] ;
            n9988HreAcKgm = H01FZ2_n9988HreAcKgm[0] ;
            A9991HreAcCli = H01FZ2_A9991HreAcCli[0] ;
            n9991HreAcCli = H01FZ2_n9991HreAcCli[0] ;
            A9995HreAcNumC = H01FZ2_A9995HreAcNumC[0] ;
            n9995HreAcNumC = H01FZ2_n9995HreAcNumC[0] ;
            A9994HreAcCol = H01FZ2_A9994HreAcCol[0] ;
            n9994HreAcCol = H01FZ2_n9994HreAcCol[0] ;
            A9993HreAcDsc = H01FZ2_A9993HreAcDsc[0] ;
            n9993HreAcDsc = H01FZ2_n9993HreAcDsc[0] ;
            A9992HreAcSer = H01FZ2_A9992HreAcSer[0] ;
            n9992HreAcSer = H01FZ2_n9992HreAcSer[0] ;
            A4495HreNumCie = H01FZ2_A4495HreNumCie[0] ;
            A4494HreBarPar = H01FZ2_A4494HreBarPar[0] ;
            A4493HreBarReo = H01FZ2_A4493HreBarReo[0] ;
            A4492HreBarCod = H01FZ2_A4492HreBarCod[0] ;
            A396EmprCod = H01FZ2_A396EmprCod[0] ;
            A9987HreAcPar = H01FZ2_A9987HreAcPar[0] ;
            A9986HreAcReo = H01FZ2_A9986HreAcReo[0] ;
            A9985HreAcCod = H01FZ2_A9985HreAcCod[0] ;
            A13895HreAcNHdr = GXutil.trim( GXutil.str( A9985HreAcCod, 8, 0)) + "-" + GXutil.str( A9986HreAcReo, 1, 0) + A9987HreAcPar ;
            e181FZ2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(37) ;
         wb1FZ0( ) ;
      }
      bGXsfl_37_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1FZ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV88Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV88Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV59Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTHREACKGM", GXutil.ltrim( localUtil.ntoc( AV53TotHreAcKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREACKGM", getSecureSignedToken( "", localUtil.format( AV53TotHreAcKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTHREACMTR", GXutil.ltrim( localUtil.ntoc( AV55TotHreAcMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREACMTR", getSecureSignedToken( "", localUtil.format( AV55TotHreAcMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTHREACPIE", GXutil.ltrim( localUtil.ntoc( AV57TotHreAcPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREACPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV57TotHreAcPie), "ZZZZZ9")));
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
      AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = AV15FilterFullText ;
      AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = AV51TFHreAcNHdr ;
      AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel = AV52TFHreAcNHdr_Sel ;
      AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = AV38TFHreAcSer ;
      AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel = AV39TFHreAcSer_Sel ;
      AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = AV40TFHreAcDsc ;
      AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel = AV41TFHreAcDsc_Sel ;
      AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = AV42TFHreAcCol ;
      AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel = AV43TFHreAcCol_Sel ;
      AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc = AV44TFHreAcNumC ;
      AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to = AV45TFHreAcNumC_To ;
      AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli = AV36TFHreAcCli ;
      AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to = AV37TFHreAcCli_To ;
      AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm = AV30TFHreAcKgm ;
      AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to = AV31TFHreAcKgm_To ;
      AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr = AV32TFHreAcMtr ;
      AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to = AV33TFHreAcMtr_To ;
      AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie = AV34TFHreAcPie ;
      AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to = AV35TFHreAcPie_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ,
                                           AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel ,
                                           AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ,
                                           AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel ,
                                           AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ,
                                           AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel ,
                                           AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ,
                                           AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel ,
                                           AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ,
                                           Integer.valueOf(AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc) ,
                                           Integer.valueOf(AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to) ,
                                           Integer.valueOf(AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli) ,
                                           Integer.valueOf(AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to) ,
                                           AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm ,
                                           AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to ,
                                           AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr ,
                                           AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to ,
                                           Integer.valueOf(AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie) ,
                                           Integer.valueOf(AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to) ,
                                           Integer.valueOf(A9985HreAcCod) ,
                                           Byte.valueOf(A9986HreAcReo) ,
                                           A9987HreAcPar ,
                                           A9992HreAcSer ,
                                           A9993HreAcDsc ,
                                           A9994HreAcCol ,
                                           Integer.valueOf(A9995HreAcNumC) ,
                                           Integer.valueOf(A9991HreAcCli) ,
                                           A9988HreAcKgm ,
                                           A9989HreAcMtr ,
                                           Integer.valueOf(A9990HreAcPie) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV59Emprcod ,
                                           Integer.valueOf(AV60HreBarCod) ,
                                           Byte.valueOf(AV61HreBarReo) ,
                                           AV62HreBarpar ,
                                           Byte.valueOf(AV63HreNumCie) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = GXutil.padr( GXutil.rtrim( AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr), 11, "%") ;
      lV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = GXutil.padr( GXutil.rtrim( AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser), 16, "%") ;
      lV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = GXutil.padr( GXutil.rtrim( AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc), 26, "%") ;
      lV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = GXutil.padr( GXutil.rtrim( AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol), 13, "%") ;
      /* Using cursor H01FZ3 */
      pr_default.execute(1, new Object[] {AV59Emprcod, Integer.valueOf(AV60HreBarCod), Byte.valueOf(AV61HreBarReo), AV62HreBarpar, Byte.valueOf(AV63HreNumCie), lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr, AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel, lV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser, AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel, lV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc, AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel, lV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol, AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel, Integer.valueOf(AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc), Integer.valueOf(AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to), Integer.valueOf(AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli), Integer.valueOf(AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to), AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm, AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to, AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr, AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to, Integer.valueOf(AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie), Integer.valueOf(AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to)});
      GRID_nRecordCount = H01FZ3_AGRID_nRecordCount[0] ;
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
      AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = AV15FilterFullText ;
      AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = AV51TFHreAcNHdr ;
      AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel = AV52TFHreAcNHdr_Sel ;
      AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = AV38TFHreAcSer ;
      AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel = AV39TFHreAcSer_Sel ;
      AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = AV40TFHreAcDsc ;
      AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel = AV41TFHreAcDsc_Sel ;
      AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = AV42TFHreAcCol ;
      AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel = AV43TFHreAcCol_Sel ;
      AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc = AV44TFHreAcNumC ;
      AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to = AV45TFHreAcNumC_To ;
      AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli = AV36TFHreAcCli ;
      AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to = AV37TFHreAcCli_To ;
      AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm = AV30TFHreAcKgm ;
      AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to = AV31TFHreAcKgm_To ;
      AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr = AV32TFHreAcMtr ;
      AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to = AV33TFHreAcMtr_To ;
      AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie = AV34TFHreAcPie ;
      AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to = AV35TFHreAcPie_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV59Emprcod, AV60HreBarCod, AV61HreBarReo, AV62HreBarpar, AV63HreNumCie, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV51TFHreAcNHdr, AV52TFHreAcNHdr_Sel, AV38TFHreAcSer, AV39TFHreAcSer_Sel, AV40TFHreAcDsc, AV41TFHreAcDsc_Sel, AV42TFHreAcCol, AV43TFHreAcCol_Sel, AV44TFHreAcNumC, AV45TFHreAcNumC_To, AV36TFHreAcCli, AV37TFHreAcCli_To, AV30TFHreAcKgm, AV31TFHreAcKgm_To, AV32TFHreAcMtr, AV33TFHreAcMtr_To, AV34TFHreAcPie, AV35TFHreAcPie_To, AV88Pgmname, AV12OrderedBy, AV13OrderedDsc, AV53TotHreAcKgm, AV55TotHreAcMtr, AV57TotHreAcPie) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = AV15FilterFullText ;
      AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = AV51TFHreAcNHdr ;
      AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel = AV52TFHreAcNHdr_Sel ;
      AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = AV38TFHreAcSer ;
      AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel = AV39TFHreAcSer_Sel ;
      AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = AV40TFHreAcDsc ;
      AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel = AV41TFHreAcDsc_Sel ;
      AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = AV42TFHreAcCol ;
      AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel = AV43TFHreAcCol_Sel ;
      AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc = AV44TFHreAcNumC ;
      AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to = AV45TFHreAcNumC_To ;
      AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli = AV36TFHreAcCli ;
      AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to = AV37TFHreAcCli_To ;
      AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm = AV30TFHreAcKgm ;
      AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to = AV31TFHreAcKgm_To ;
      AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr = AV32TFHreAcMtr ;
      AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to = AV33TFHreAcMtr_To ;
      AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie = AV34TFHreAcPie ;
      AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to = AV35TFHreAcPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV59Emprcod, AV60HreBarCod, AV61HreBarReo, AV62HreBarpar, AV63HreNumCie, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV51TFHreAcNHdr, AV52TFHreAcNHdr_Sel, AV38TFHreAcSer, AV39TFHreAcSer_Sel, AV40TFHreAcDsc, AV41TFHreAcDsc_Sel, AV42TFHreAcCol, AV43TFHreAcCol_Sel, AV44TFHreAcNumC, AV45TFHreAcNumC_To, AV36TFHreAcCli, AV37TFHreAcCli_To, AV30TFHreAcKgm, AV31TFHreAcKgm_To, AV32TFHreAcMtr, AV33TFHreAcMtr_To, AV34TFHreAcPie, AV35TFHreAcPie_To, AV88Pgmname, AV12OrderedBy, AV13OrderedDsc, AV53TotHreAcKgm, AV55TotHreAcMtr, AV57TotHreAcPie) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = AV15FilterFullText ;
      AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = AV51TFHreAcNHdr ;
      AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel = AV52TFHreAcNHdr_Sel ;
      AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = AV38TFHreAcSer ;
      AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel = AV39TFHreAcSer_Sel ;
      AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = AV40TFHreAcDsc ;
      AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel = AV41TFHreAcDsc_Sel ;
      AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = AV42TFHreAcCol ;
      AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel = AV43TFHreAcCol_Sel ;
      AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc = AV44TFHreAcNumC ;
      AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to = AV45TFHreAcNumC_To ;
      AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli = AV36TFHreAcCli ;
      AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to = AV37TFHreAcCli_To ;
      AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm = AV30TFHreAcKgm ;
      AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to = AV31TFHreAcKgm_To ;
      AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr = AV32TFHreAcMtr ;
      AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to = AV33TFHreAcMtr_To ;
      AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie = AV34TFHreAcPie ;
      AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to = AV35TFHreAcPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV59Emprcod, AV60HreBarCod, AV61HreBarReo, AV62HreBarpar, AV63HreNumCie, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV51TFHreAcNHdr, AV52TFHreAcNHdr_Sel, AV38TFHreAcSer, AV39TFHreAcSer_Sel, AV40TFHreAcDsc, AV41TFHreAcDsc_Sel, AV42TFHreAcCol, AV43TFHreAcCol_Sel, AV44TFHreAcNumC, AV45TFHreAcNumC_To, AV36TFHreAcCli, AV37TFHreAcCli_To, AV30TFHreAcKgm, AV31TFHreAcKgm_To, AV32TFHreAcMtr, AV33TFHreAcMtr_To, AV34TFHreAcPie, AV35TFHreAcPie_To, AV88Pgmname, AV12OrderedBy, AV13OrderedDsc, AV53TotHreAcKgm, AV55TotHreAcMtr, AV57TotHreAcPie) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = AV15FilterFullText ;
      AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = AV51TFHreAcNHdr ;
      AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel = AV52TFHreAcNHdr_Sel ;
      AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = AV38TFHreAcSer ;
      AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel = AV39TFHreAcSer_Sel ;
      AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = AV40TFHreAcDsc ;
      AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel = AV41TFHreAcDsc_Sel ;
      AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = AV42TFHreAcCol ;
      AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel = AV43TFHreAcCol_Sel ;
      AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc = AV44TFHreAcNumC ;
      AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to = AV45TFHreAcNumC_To ;
      AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli = AV36TFHreAcCli ;
      AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to = AV37TFHreAcCli_To ;
      AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm = AV30TFHreAcKgm ;
      AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to = AV31TFHreAcKgm_To ;
      AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr = AV32TFHreAcMtr ;
      AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to = AV33TFHreAcMtr_To ;
      AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie = AV34TFHreAcPie ;
      AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to = AV35TFHreAcPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV59Emprcod, AV60HreBarCod, AV61HreBarReo, AV62HreBarpar, AV63HreNumCie, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV51TFHreAcNHdr, AV52TFHreAcNHdr_Sel, AV38TFHreAcSer, AV39TFHreAcSer_Sel, AV40TFHreAcDsc, AV41TFHreAcDsc_Sel, AV42TFHreAcCol, AV43TFHreAcCol_Sel, AV44TFHreAcNumC, AV45TFHreAcNumC_To, AV36TFHreAcCli, AV37TFHreAcCli_To, AV30TFHreAcKgm, AV31TFHreAcKgm_To, AV32TFHreAcMtr, AV33TFHreAcMtr_To, AV34TFHreAcPie, AV35TFHreAcPie_To, AV88Pgmname, AV12OrderedBy, AV13OrderedDsc, AV53TotHreAcKgm, AV55TotHreAcMtr, AV57TotHreAcPie) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = AV15FilterFullText ;
      AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = AV51TFHreAcNHdr ;
      AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel = AV52TFHreAcNHdr_Sel ;
      AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = AV38TFHreAcSer ;
      AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel = AV39TFHreAcSer_Sel ;
      AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = AV40TFHreAcDsc ;
      AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel = AV41TFHreAcDsc_Sel ;
      AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = AV42TFHreAcCol ;
      AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel = AV43TFHreAcCol_Sel ;
      AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc = AV44TFHreAcNumC ;
      AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to = AV45TFHreAcNumC_To ;
      AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli = AV36TFHreAcCli ;
      AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to = AV37TFHreAcCli_To ;
      AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm = AV30TFHreAcKgm ;
      AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to = AV31TFHreAcKgm_To ;
      AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr = AV32TFHreAcMtr ;
      AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to = AV33TFHreAcMtr_To ;
      AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie = AV34TFHreAcPie ;
      AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to = AV35TFHreAcPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV59Emprcod, AV60HreBarCod, AV61HreBarReo, AV62HreBarpar, AV63HreNumCie, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV51TFHreAcNHdr, AV52TFHreAcNHdr_Sel, AV38TFHreAcSer, AV39TFHreAcSer_Sel, AV40TFHreAcDsc, AV41TFHreAcDsc_Sel, AV42TFHreAcCol, AV43TFHreAcCol_Sel, AV44TFHreAcNumC, AV45TFHreAcNumC_To, AV36TFHreAcCli, AV37TFHreAcCli_To, AV30TFHreAcKgm, AV31TFHreAcKgm_To, AV32TFHreAcMtr, AV33TFHreAcMtr_To, AV34TFHreAcPie, AV35TFHreAcPie_To, AV88Pgmname, AV12OrderedBy, AV13OrderedDsc, AV53TotHreAcKgm, AV55TotHreAcMtr, AV57TotHreAcPie) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV88Pgmname = "HistoricodeRecetas_AgrupacionAcabados_WP" ;
      Gx_err = (short)(0) ;
      edtavTotvaluehreackgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluehreackgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehreackgm_Enabled), 5, 0), true);
      edtavTotvaluehreacmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluehreacmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehreacmtr_Enabled), 5, 0), true);
      edtavTotvaluehreacpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluehreacpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehreacpie_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1FZ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161FZ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV21ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV46DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_37 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_37"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV48GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV49GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         AV54TotValueHreAcKgm = httpContext.cgiGet( edtavTotvaluehreackgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54TotValueHreAcKgm", AV54TotValueHreAcKgm);
         AV56TotValueHreAcMtr = httpContext.cgiGet( edtavTotvaluehreacmtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56TotValueHreAcMtr", AV56TotValueHreAcMtr);
         AV58TotValueHreAcPie = httpContext.cgiGet( edtavTotvaluehreacpie_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58TotValueHreAcPie", AV58TotValueHreAcPie);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
      e161FZ2 ();
      if (returnInSub) return;
   }

   public void e161FZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV66Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      historicoderecetas_agrupacionacabados_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV66Station = GXt_char1 ;
      GXv_char2[0] = AV59Emprcod ;
      GXv_char3[0] = AV67Emprnom ;
      GXv_char4[0] = AV68Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV66Station, GXv_char2, GXv_char3, GXv_char4) ;
      historicoderecetas_agrupacionacabados_wp_impl.this.AV59Emprcod = GXv_char2[0] ;
      historicoderecetas_agrupacionacabados_wp_impl.this.AV67Emprnom = GXv_char3[0] ;
      historicoderecetas_agrupacionacabados_wp_impl.this.AV68Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Emprcod", AV59Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59Emprcod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV7HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Tabla HISHRA", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV46DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV46DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e171FZ2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV6WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV23ManageFiltersExecutionStep == 1 )
      {
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV23ManageFiltersExecutionStep == 2 )
      {
         AV23ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV20Session.getValue("HistoricodeRecetas_AgrupacionAcabados_WPColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("HistoricodeRecetas_AgrupacionAcabados_WPColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtHreAcNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcNHdr_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtHreAcSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcSer_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtHreAcDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcDsc_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtHreAcCol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCol_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtHreAcNumC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcNumC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcNumC_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtHreAcCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcCli_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtHreAcKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcKgm_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtHreAcMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcMtr_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtHreAcPie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcPie_Visible), 5, 0), !bGXsfl_37_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV48GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridCurrentPage), 10, 0));
      AV49GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = AV15FilterFullText ;
      AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = AV51TFHreAcNHdr ;
      AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel = AV52TFHreAcNHdr_Sel ;
      AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = AV38TFHreAcSer ;
      AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel = AV39TFHreAcSer_Sel ;
      AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = AV40TFHreAcDsc ;
      AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel = AV41TFHreAcDsc_Sel ;
      AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = AV42TFHreAcCol ;
      AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel = AV43TFHreAcCol_Sel ;
      AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc = AV44TFHreAcNumC ;
      AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to = AV45TFHreAcNumC_To ;
      AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli = AV36TFHreAcCli ;
      AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to = AV37TFHreAcCli_To ;
      AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm = AV30TFHreAcKgm ;
      AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to = AV31TFHreAcKgm_To ;
      AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr = AV32TFHreAcMtr ;
      AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to = AV33TFHreAcMtr_To ;
      AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie = AV34TFHreAcPie ;
      AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to = AV35TFHreAcPie_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e121FZ2( )
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
         AV47PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV47PageToGo) ;
      }
   }

   public void e131FZ2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141FZ2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAcNHdr") == 0 )
         {
            AV51TFHreAcNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFHreAcNHdr", AV51TFHreAcNHdr);
            AV52TFHreAcNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFHreAcNHdr_Sel", AV52TFHreAcNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAcSer") == 0 )
         {
            AV38TFHreAcSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFHreAcSer", AV38TFHreAcSer);
            AV39TFHreAcSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFHreAcSer_Sel", AV39TFHreAcSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAcDsc") == 0 )
         {
            AV40TFHreAcDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFHreAcDsc", AV40TFHreAcDsc);
            AV41TFHreAcDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFHreAcDsc_Sel", AV41TFHreAcDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAcCol") == 0 )
         {
            AV42TFHreAcCol = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFHreAcCol", AV42TFHreAcCol);
            AV43TFHreAcCol_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFHreAcCol_Sel", AV43TFHreAcCol_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAcNumC") == 0 )
         {
            AV44TFHreAcNumC = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFHreAcNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFHreAcNumC), 6, 0));
            AV45TFHreAcNumC_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFHreAcNumC_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFHreAcNumC_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAcCli") == 0 )
         {
            AV36TFHreAcCli = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFHreAcCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFHreAcCli), 6, 0));
            AV37TFHreAcCli_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFHreAcCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFHreAcCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAcKgm") == 0 )
         {
            AV30TFHreAcKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFHreAcKgm", GXutil.ltrimstr( AV30TFHreAcKgm, 9, 2));
            AV31TFHreAcKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFHreAcKgm_To", GXutil.ltrimstr( AV31TFHreAcKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAcMtr") == 0 )
         {
            AV32TFHreAcMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFHreAcMtr", GXutil.ltrimstr( AV32TFHreAcMtr, 9, 2));
            AV33TFHreAcMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFHreAcMtr_To", GXutil.ltrimstr( AV33TFHreAcMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAcPie") == 0 )
         {
            AV34TFHreAcPie = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFHreAcPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFHreAcPie), 6, 0));
            AV35TFHreAcPie_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFHreAcPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFHreAcPie_To), 6, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e181FZ2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(37) ;
      }
      sendrow_372( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_37_Refreshing )
      {
         httpContext.doAjaxLoad(37, GridRow);
      }
   }

   public void e151FZ2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "HistoricodeRecetas_AgrupacionAcabados_WPColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e111FZ2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("HistoricodeRecetas_AgrupacionAcabados_WPFilters")),GXutil.URLEncode(GXutil.rtrim(AV88Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("HistoricodeRecetas_AgrupacionAcabados_WPFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV22ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "HistoricodeRecetas_AgrupacionAcabados_WPFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         historicoderecetas_agrupacionacabados_wp_impl.this.GXt_char1 = GXv_char4[0] ;
         AV22ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV22ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S192 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV88Pgmname+"GridState", AV22ManageFiltersXml) ;
            AV10GridState.fromxml(AV22ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21ManageFiltersData", AV21ManageFiltersData);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV18ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAcNHdr", "", "Hdr", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAcSer", "", "Codigo Articulo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAcDsc", "", "Articulo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAcCol", "", "Color", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAcNumC", "", "Numero", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAcCli", "", "Cliente", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAcKgm", "", "Kgs", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAcMtr", "", "Mts", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAcPie", "", "Pzs", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV17UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "HistoricodeRecetas_AgrupacionAcabados_WPColumnsSelector", GXv_char4) ;
      historicoderecetas_agrupacionacabados_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV21ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "HistoricodeRecetas_AgrupacionAcabados_WPFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV21ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV51TFHreAcNHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFHreAcNHdr", AV51TFHreAcNHdr);
      AV52TFHreAcNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFHreAcNHdr_Sel", AV52TFHreAcNHdr_Sel);
      AV38TFHreAcSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFHreAcSer", AV38TFHreAcSer);
      AV39TFHreAcSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFHreAcSer_Sel", AV39TFHreAcSer_Sel);
      AV40TFHreAcDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFHreAcDsc", AV40TFHreAcDsc);
      AV41TFHreAcDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFHreAcDsc_Sel", AV41TFHreAcDsc_Sel);
      AV42TFHreAcCol = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFHreAcCol", AV42TFHreAcCol);
      AV43TFHreAcCol_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFHreAcCol_Sel", AV43TFHreAcCol_Sel);
      AV44TFHreAcNumC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFHreAcNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFHreAcNumC), 6, 0));
      AV45TFHreAcNumC_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFHreAcNumC_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFHreAcNumC_To), 6, 0));
      AV36TFHreAcCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFHreAcCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFHreAcCli), 6, 0));
      AV37TFHreAcCli_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFHreAcCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFHreAcCli_To), 6, 0));
      AV30TFHreAcKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFHreAcKgm", GXutil.ltrimstr( AV30TFHreAcKgm, 9, 2));
      AV31TFHreAcKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFHreAcKgm_To", GXutil.ltrimstr( AV31TFHreAcKgm_To, 9, 2));
      AV32TFHreAcMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFHreAcMtr", GXutil.ltrimstr( AV32TFHreAcMtr, 9, 2));
      AV33TFHreAcMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFHreAcMtr_To", GXutil.ltrimstr( AV33TFHreAcMtr_To, 9, 2));
      AV34TFHreAcPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFHreAcPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFHreAcPie), 6, 0));
      AV35TFHreAcPie_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFHreAcPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFHreAcPie_To), 6, 0));
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
      if ( GXutil.strcmp(AV20Session.getValue(AV88Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV88Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV88Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S202( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV89GXV1 = 1 ;
      while ( AV89GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV89GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACNHDR") == 0 )
         {
            AV51TFHreAcNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFHreAcNHdr", AV51TFHreAcNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACNHDR_SEL") == 0 )
         {
            AV52TFHreAcNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFHreAcNHdr_Sel", AV52TFHreAcNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACSER") == 0 )
         {
            AV38TFHreAcSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFHreAcSer", AV38TFHreAcSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACSER_SEL") == 0 )
         {
            AV39TFHreAcSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFHreAcSer_Sel", AV39TFHreAcSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACDSC") == 0 )
         {
            AV40TFHreAcDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFHreAcDsc", AV40TFHreAcDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACDSC_SEL") == 0 )
         {
            AV41TFHreAcDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFHreAcDsc_Sel", AV41TFHreAcDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACCOL") == 0 )
         {
            AV42TFHreAcCol = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFHreAcCol", AV42TFHreAcCol);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACCOL_SEL") == 0 )
         {
            AV43TFHreAcCol_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFHreAcCol_Sel", AV43TFHreAcCol_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACNUMC") == 0 )
         {
            AV44TFHreAcNumC = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFHreAcNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFHreAcNumC), 6, 0));
            AV45TFHreAcNumC_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFHreAcNumC_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFHreAcNumC_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACCLI") == 0 )
         {
            AV36TFHreAcCli = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFHreAcCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFHreAcCli), 6, 0));
            AV37TFHreAcCli_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFHreAcCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFHreAcCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACKGM") == 0 )
         {
            AV30TFHreAcKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFHreAcKgm", GXutil.ltrimstr( AV30TFHreAcKgm, 9, 2));
            AV31TFHreAcKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFHreAcKgm_To", GXutil.ltrimstr( AV31TFHreAcKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACMTR") == 0 )
         {
            AV32TFHreAcMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFHreAcMtr", GXutil.ltrimstr( AV32TFHreAcMtr, 9, 2));
            AV33TFHreAcMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFHreAcMtr_To", GXutil.ltrimstr( AV33TFHreAcMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREACPIE") == 0 )
         {
            AV34TFHreAcPie = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFHreAcPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFHreAcPie), 6, 0));
            AV35TFHreAcPie_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFHreAcPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFHreAcPie_To), 6, 0));
         }
         AV89GXV1 = (int)(AV89GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFHreAcNHdr_Sel)==0), AV52TFHreAcNHdr_Sel, GXv_char4) ;
      historicoderecetas_agrupacionacabados_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFHreAcSer_Sel)==0), AV39TFHreAcSer_Sel, GXv_char3) ;
      historicoderecetas_agrupacionacabados_wp_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFHreAcDsc_Sel)==0), AV41TFHreAcDsc_Sel, GXv_char2) ;
      historicoderecetas_agrupacionacabados_wp_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFHreAcCol_Sel)==0), AV43TFHreAcCol_Sel, GXv_char15) ;
      historicoderecetas_agrupacionacabados_wp_impl.this.GXt_char14 = GXv_char15[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFHreAcNHdr)==0), AV51TFHreAcNHdr, GXv_char15) ;
      historicoderecetas_agrupacionacabados_wp_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFHreAcSer)==0), AV38TFHreAcSer, GXv_char4) ;
      historicoderecetas_agrupacionacabados_wp_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFHreAcDsc)==0), AV40TFHreAcDsc, GXv_char3) ;
      historicoderecetas_agrupacionacabados_wp_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFHreAcCol)==0), AV42TFHreAcCol, GXv_char2) ;
      historicoderecetas_agrupacionacabados_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1+"|"+((0==AV44TFHreAcNumC) ? "" : GXutil.str( AV44TFHreAcNumC, 6, 0))+"|"+((0==AV36TFHreAcCli) ? "" : GXutil.str( AV36TFHreAcCli, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFHreAcKgm)==0) ? "" : GXutil.str( AV30TFHreAcKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFHreAcMtr)==0) ? "" : GXutil.str( AV32TFHreAcMtr, 9, 2))+"|"+((0==AV34TFHreAcPie) ? "" : GXutil.str( AV34TFHreAcPie, 6, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||"+((0==AV45TFHreAcNumC_To) ? "" : GXutil.str( AV45TFHreAcNumC_To, 6, 0))+"|"+((0==AV37TFHreAcCli_To) ? "" : GXutil.str( AV37TFHreAcCli_To, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFHreAcKgm_To)==0) ? "" : GXutil.str( AV31TFHreAcKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFHreAcMtr_To)==0) ? "" : GXutil.str( AV33TFHreAcMtr_To, 9, 2))+"|"+((0==AV35TFHreAcPie_To) ? "" : GXutil.str( AV35TFHreAcPie_To, 6, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV88Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREACNHDR", "", !(GXutil.strcmp("", AV51TFHreAcNHdr)==0), (short)(0), AV51TFHreAcNHdr, "", !(GXutil.strcmp("", AV52TFHreAcNHdr_Sel)==0), AV52TFHreAcNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREACSER", "", !(GXutil.strcmp("", AV38TFHreAcSer)==0), (short)(0), AV38TFHreAcSer, "", !(GXutil.strcmp("", AV39TFHreAcSer_Sel)==0), AV39TFHreAcSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREACDSC", "", !(GXutil.strcmp("", AV40TFHreAcDsc)==0), (short)(0), AV40TFHreAcDsc, "", !(GXutil.strcmp("", AV41TFHreAcDsc_Sel)==0), AV41TFHreAcDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREACCOL", "", !(GXutil.strcmp("", AV42TFHreAcCol)==0), (short)(0), AV42TFHreAcCol, "", !(GXutil.strcmp("", AV43TFHreAcCol_Sel)==0), AV43TFHreAcCol_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREACNUMC", "", !((0==AV44TFHreAcNumC)&&(0==AV45TFHreAcNumC_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFHreAcNumC, 6, 0)), GXutil.trim( GXutil.str( AV45TFHreAcNumC_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREACCLI", "", !((0==AV36TFHreAcCli)&&(0==AV37TFHreAcCli_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFHreAcCli, 6, 0)), GXutil.trim( GXutil.str( AV37TFHreAcCli_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREACKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFHreAcKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFHreAcKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV30TFHreAcKgm, 9, 2)), GXutil.trim( GXutil.str( AV31TFHreAcKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREACMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFHreAcMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFHreAcMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV32TFHreAcMtr, 9, 2)), GXutil.trim( GXutil.str( AV33TFHreAcMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREACPIE", "", !((0==AV34TFHreAcPie)&&(0==AV35TFHreAcPie_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFHreAcPie, 6, 0)), GXutil.trim( GXutil.str( AV35TFHreAcPie_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV88Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV88Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "HISHRA" );
      AV20Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV53TotHreAcKgm = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TotHreAcKgm", GXutil.ltrimstr( AV53TotHreAcKgm, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREACKGM", getSecureSignedToken( "", localUtil.format( AV53TotHreAcKgm, "ZZZZZ9.99")));
      AV55TotHreAcMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TotHreAcMtr", GXutil.ltrimstr( AV55TotHreAcMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREACMTR", getSecureSignedToken( "", localUtil.format( AV55TotHreAcMtr, "ZZZZZ9.99")));
      AV57TotHreAcPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TotHreAcPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TotHreAcPie), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREACPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV57TotHreAcPie), "ZZZZZ9")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = AV15FilterFullText ;
      AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = AV51TFHreAcNHdr ;
      AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel = AV52TFHreAcNHdr_Sel ;
      AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = AV38TFHreAcSer ;
      AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel = AV39TFHreAcSer_Sel ;
      AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = AV40TFHreAcDsc ;
      AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel = AV41TFHreAcDsc_Sel ;
      AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = AV42TFHreAcCol ;
      AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel = AV43TFHreAcCol_Sel ;
      AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc = AV44TFHreAcNumC ;
      AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to = AV45TFHreAcNumC_To ;
      AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli = AV36TFHreAcCli ;
      AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to = AV37TFHreAcCli_To ;
      AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm = AV30TFHreAcKgm ;
      AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to = AV31TFHreAcKgm_To ;
      AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr = AV32TFHreAcMtr ;
      AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to = AV33TFHreAcMtr_To ;
      AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie = AV34TFHreAcPie ;
      AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to = AV35TFHreAcPie_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ,
                                           AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel ,
                                           AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ,
                                           AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel ,
                                           AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ,
                                           AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel ,
                                           AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ,
                                           AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel ,
                                           AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ,
                                           Integer.valueOf(AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc) ,
                                           Integer.valueOf(AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to) ,
                                           Integer.valueOf(AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli) ,
                                           Integer.valueOf(AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to) ,
                                           AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm ,
                                           AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to ,
                                           AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr ,
                                           AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to ,
                                           Integer.valueOf(AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie) ,
                                           Integer.valueOf(AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to) ,
                                           Integer.valueOf(A9985HreAcCod) ,
                                           Byte.valueOf(A9986HreAcReo) ,
                                           A9987HreAcPar ,
                                           A9992HreAcSer ,
                                           A9993HreAcDsc ,
                                           A9994HreAcCol ,
                                           Integer.valueOf(A9995HreAcNumC) ,
                                           Integer.valueOf(A9991HreAcCli) ,
                                           A9988HreAcKgm ,
                                           A9989HreAcMtr ,
                                           Integer.valueOf(A9990HreAcPie) ,
                                           AV59Emprcod ,
                                           Integer.valueOf(AV60HreBarCod) ,
                                           Byte.valueOf(AV61HreBarReo) ,
                                           AV62HreBarpar ,
                                           Byte.valueOf(AV63HreNumCie) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = GXutil.padr( GXutil.rtrim( AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr), 11, "%") ;
      lV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = GXutil.padr( GXutil.rtrim( AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser), 16, "%") ;
      lV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = GXutil.padr( GXutil.rtrim( AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc), 26, "%") ;
      lV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = GXutil.padr( GXutil.rtrim( AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol), 13, "%") ;
      /* Using cursor H01FZ4 */
      pr_default.execute(2, new Object[] {AV59Emprcod, Integer.valueOf(AV60HreBarCod), Byte.valueOf(AV61HreBarReo), AV62HreBarpar, Byte.valueOf(AV63HreNumCie), lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext, lV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr, AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel, lV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser, AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel, lV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc, AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel, lV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol, AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel, Integer.valueOf(AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc), Integer.valueOf(AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to), Integer.valueOf(AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli), Integer.valueOf(AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to), AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm, AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to, AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr, AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to, Integer.valueOf(AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie), Integer.valueOf(AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to)});
      nGXsfl_37_idx = 1 ;
      sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_372( ) ;
      GRID_nEOF = (byte)(0) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      while ( ( (pr_default.getStatus(2) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
      {
         A4495HreNumCie = H01FZ4_A4495HreNumCie[0] ;
         A4494HreBarPar = H01FZ4_A4494HreBarPar[0] ;
         A4493HreBarReo = H01FZ4_A4493HreBarReo[0] ;
         A4492HreBarCod = H01FZ4_A4492HreBarCod[0] ;
         A396EmprCod = H01FZ4_A396EmprCod[0] ;
         A9990HreAcPie = H01FZ4_A9990HreAcPie[0] ;
         n9990HreAcPie = H01FZ4_n9990HreAcPie[0] ;
         A9989HreAcMtr = H01FZ4_A9989HreAcMtr[0] ;
         n9989HreAcMtr = H01FZ4_n9989HreAcMtr[0] ;
         A9988HreAcKgm = H01FZ4_A9988HreAcKgm[0] ;
         n9988HreAcKgm = H01FZ4_n9988HreAcKgm[0] ;
         A9991HreAcCli = H01FZ4_A9991HreAcCli[0] ;
         n9991HreAcCli = H01FZ4_n9991HreAcCli[0] ;
         A9995HreAcNumC = H01FZ4_A9995HreAcNumC[0] ;
         n9995HreAcNumC = H01FZ4_n9995HreAcNumC[0] ;
         A9994HreAcCol = H01FZ4_A9994HreAcCol[0] ;
         n9994HreAcCol = H01FZ4_n9994HreAcCol[0] ;
         A9993HreAcDsc = H01FZ4_A9993HreAcDsc[0] ;
         n9993HreAcDsc = H01FZ4_n9993HreAcDsc[0] ;
         A9992HreAcSer = H01FZ4_A9992HreAcSer[0] ;
         n9992HreAcSer = H01FZ4_n9992HreAcSer[0] ;
         A9987HreAcPar = H01FZ4_A9987HreAcPar[0] ;
         A9986HreAcReo = H01FZ4_A9986HreAcReo[0] ;
         A9985HreAcCod = H01FZ4_A9985HreAcCod[0] ;
         A13895HreAcNHdr = GXutil.trim( GXutil.str( A9985HreAcCod, 8, 0)) + "-" + GXutil.str( A9986HreAcReo, 1, 0) + A9987HreAcPar ;
         AV53TotHreAcKgm = A9988HreAcKgm.add(AV53TotHreAcKgm) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53TotHreAcKgm", GXutil.ltrimstr( AV53TotHreAcKgm, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREACKGM", getSecureSignedToken( "", localUtil.format( AV53TotHreAcKgm, "ZZZZZ9.99")));
         AV55TotHreAcMtr = A9989HreAcMtr.add(AV55TotHreAcMtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55TotHreAcMtr", GXutil.ltrimstr( AV55TotHreAcMtr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREACMTR", getSecureSignedToken( "", localUtil.format( AV55TotHreAcMtr, "ZZZZZ9.99")));
         AV57TotHreAcPie = (long)(A9990HreAcPie+AV57TotHreAcPie) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57TotHreAcPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TotHreAcPie), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREACPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV57TotHreAcPie), "ZZZZZ9")));
         pr_default.readNext(2);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(2) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(2);
      AV54TotValueHreAcKgm = localUtil.format( AV53TotHreAcKgm, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TotValueHreAcKgm", AV54TotValueHreAcKgm);
      AV56TotValueHreAcMtr = localUtil.format( AV55TotHreAcMtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TotValueHreAcMtr", AV56TotValueHreAcMtr);
      AV58TotValueHreAcPie = localUtil.format( DecimalUtil.doubleToDec(AV57TotHreAcPie), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TotValueHreAcPie", AV58TotValueHreAcPie);
   }

   public void wb_table2_57_1FZ2( boolean wbgen )
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehreackgm_Internalname, httpContext.getMessage( "Tot Value Hre Ac Kgm", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_37_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehreackgm_Internalname, AV54TotValueHreAcKgm, GXutil.rtrim( localUtil.format( AV54TotValueHreAcKgm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehreackgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehreackgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HistoricodeRecetas_AgrupacionAcabados_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehreacmtr_Internalname, httpContext.getMessage( "Tot Value Hre Ac Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_37_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehreacmtr_Internalname, AV56TotValueHreAcMtr, GXutil.rtrim( localUtil.format( AV56TotValueHreAcMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehreacmtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehreacmtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HistoricodeRecetas_AgrupacionAcabados_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehreacpie_Internalname, httpContext.getMessage( "Tot Value Hre Ac Pie", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_37_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehreacpie_Internalname, AV58TotValueHreAcPie, GXutil.rtrim( localUtil.format( AV58TotValueHreAcPie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehreacpie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehreacpie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HistoricodeRecetas_AgrupacionAcabados_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_57_1FZ2e( true) ;
      }
      else
      {
         wb_table2_57_1FZ2e( false) ;
      }
   }

   public void wb_table1_19_1FZ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV21ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_24_1FZ2( true) ;
      }
      else
      {
         wb_table3_24_1FZ2( false) ;
      }
      return  ;
   }

   public void wb_table3_24_1FZ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_19_1FZ2e( true) ;
      }
      else
      {
         wb_table1_19_1FZ2e( false) ;
      }
   }

   public void wb_table3_24_1FZ2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'" + sGXsfl_37_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_HistoricodeRecetas_AgrupacionAcabados_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_24_1FZ2e( true) ;
      }
      else
      {
         wb_table3_24_1FZ2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV59Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Emprcod", AV59Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59Emprcod, "@!"))));
      AV60HreBarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60HreBarCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60HreBarCod), "ZZZZZZZ9")));
      AV61HreBarReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61HreBarReo", GXutil.str( AV61HreBarReo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61HreBarReo), "9")));
      AV62HreBarpar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62HreBarpar", AV62HreBarpar);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62HreBarpar, ""))));
      AV63HreNumCie = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63HreNumCie), 2, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHRENUMCIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63HreNumCie), "Z9")));
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
      pa1FZ2( ) ;
      ws1FZ2( ) ;
      we1FZ2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116133233", true, true);
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
      httpContext.AddJavascriptSource("historicoderecetas_agrupacionacabados_wp.js", "?202682116133234", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_372( )
   {
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_37_idx ;
      edtHreBarCod_Internalname = "HREBARCOD_"+sGXsfl_37_idx ;
      edtHreBarReo_Internalname = "HREBARREO_"+sGXsfl_37_idx ;
      edtHreBarPar_Internalname = "HREBARPAR_"+sGXsfl_37_idx ;
      edtHreNumCie_Internalname = "HRENUMCIE_"+sGXsfl_37_idx ;
      edtHreAcCod_Internalname = "HREACCOD_"+sGXsfl_37_idx ;
      edtHreAcReo_Internalname = "HREACREO_"+sGXsfl_37_idx ;
      edtHreAcPar_Internalname = "HREACPAR_"+sGXsfl_37_idx ;
      edtHreAcNHdr_Internalname = "HREACNHDR_"+sGXsfl_37_idx ;
      edtHreAcSer_Internalname = "HREACSER_"+sGXsfl_37_idx ;
      edtHreAcDsc_Internalname = "HREACDSC_"+sGXsfl_37_idx ;
      edtHreAcCol_Internalname = "HREACCOL_"+sGXsfl_37_idx ;
      edtHreAcNumC_Internalname = "HREACNUMC_"+sGXsfl_37_idx ;
      edtHreAcCli_Internalname = "HREACCLI_"+sGXsfl_37_idx ;
      edtHreAcKgm_Internalname = "HREACKGM_"+sGXsfl_37_idx ;
      edtHreAcMtr_Internalname = "HREACMTR_"+sGXsfl_37_idx ;
      edtHreAcPie_Internalname = "HREACPIE_"+sGXsfl_37_idx ;
   }

   public void subsflControlProps_fel_372( )
   {
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_37_fel_idx ;
      edtHreBarCod_Internalname = "HREBARCOD_"+sGXsfl_37_fel_idx ;
      edtHreBarReo_Internalname = "HREBARREO_"+sGXsfl_37_fel_idx ;
      edtHreBarPar_Internalname = "HREBARPAR_"+sGXsfl_37_fel_idx ;
      edtHreNumCie_Internalname = "HRENUMCIE_"+sGXsfl_37_fel_idx ;
      edtHreAcCod_Internalname = "HREACCOD_"+sGXsfl_37_fel_idx ;
      edtHreAcReo_Internalname = "HREACREO_"+sGXsfl_37_fel_idx ;
      edtHreAcPar_Internalname = "HREACPAR_"+sGXsfl_37_fel_idx ;
      edtHreAcNHdr_Internalname = "HREACNHDR_"+sGXsfl_37_fel_idx ;
      edtHreAcSer_Internalname = "HREACSER_"+sGXsfl_37_fel_idx ;
      edtHreAcDsc_Internalname = "HREACDSC_"+sGXsfl_37_fel_idx ;
      edtHreAcCol_Internalname = "HREACCOL_"+sGXsfl_37_fel_idx ;
      edtHreAcNumC_Internalname = "HREACNUMC_"+sGXsfl_37_fel_idx ;
      edtHreAcCli_Internalname = "HREACCLI_"+sGXsfl_37_fel_idx ;
      edtHreAcKgm_Internalname = "HREACKGM_"+sGXsfl_37_fel_idx ;
      edtHreAcMtr_Internalname = "HREACMTR_"+sGXsfl_37_fel_idx ;
      edtHreAcPie_Internalname = "HREACPIE_"+sGXsfl_37_fel_idx ;
   }

   public void sendrow_372( )
   {
      subsflControlProps_372( ) ;
      wb1FZ0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_37_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_37_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_37_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreBarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarPar_Internalname,GXutil.rtrim( A4494HreBarPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreBarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNumCie_Internalname,GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreNumCie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9985HreAcCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9985HreAcCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcReo_Internalname,GXutil.ltrim( localUtil.ntoc( A9986HreAcReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9986HreAcReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcPar_Internalname,GXutil.rtrim( A9987HreAcPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreAcNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcNHdr_Internalname,GXutil.rtrim( A13895HreAcNHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreAcNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreAcSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcSer_Internalname,GXutil.rtrim( A9992HreAcSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreAcSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreAcDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcDsc_Internalname,GXutil.rtrim( A9993HreAcDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreAcDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreAcCol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcCol_Internalname,GXutil.rtrim( A9994HreAcCol),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreAcCol_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreAcNumC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcNumC_Internalname,GXutil.ltrim( localUtil.ntoc( A9995HreAcNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9995HreAcNumC), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcNumC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreAcNumC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreAcCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcCli_Internalname,GXutil.ltrim( localUtil.ntoc( A9991HreAcCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9991HreAcCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreAcCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreAcKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A9988HreAcKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9988HreAcKgm, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHreAcKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreAcMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A9989HreAcMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9989HreAcMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreAcMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreAcPie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcPie_Internalname,GXutil.ltrim( localUtil.ntoc( A9990HreAcPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9990HreAcPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreAcPie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1FZ2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_37_idx = ((subGrid_Islastpage==1)&&(nGXsfl_37_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_37_idx+1) ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
      }
      /* End function sendrow_372 */
   }

   public void startgridcontrol37( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"37\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAcNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAcSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAcDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAcCol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAcNumC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAcCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAcKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAcMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAcPie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pzs", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4494HreBarPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9985HreAcCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9986HreAcReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9987HreAcPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13895HreAcNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAcNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9992HreAcSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAcSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9993HreAcDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAcDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9994HreAcCol));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAcCol_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9995HreAcNumC, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAcNumC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9991HreAcCli, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAcCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9988HreAcKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAcKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9989HreAcMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAcMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9990HreAcPie, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAcPie_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtHreBarCod_Internalname = "HREBARCOD" ;
      edtHreBarReo_Internalname = "HREBARREO" ;
      edtHreBarPar_Internalname = "HREBARPAR" ;
      edtHreNumCie_Internalname = "HRENUMCIE" ;
      edtHreAcCod_Internalname = "HREACCOD" ;
      edtHreAcReo_Internalname = "HREACREO" ;
      edtHreAcPar_Internalname = "HREACPAR" ;
      edtHreAcNHdr_Internalname = "HREACNHDR" ;
      edtHreAcSer_Internalname = "HREACSER" ;
      edtHreAcDsc_Internalname = "HREACDSC" ;
      edtHreAcCol_Internalname = "HREACCOL" ;
      edtHreAcNumC_Internalname = "HREACNUMC" ;
      edtHreAcCli_Internalname = "HREACCLI" ;
      edtHreAcKgm_Internalname = "HREACKGM" ;
      edtHreAcMtr_Internalname = "HREACMTR" ;
      edtHreAcPie_Internalname = "HREACPIE" ;
      edtavTotvaluehreackgm_Internalname = "vTOTVALUEHREACKGM" ;
      edtavTotvaluehreacmtr_Internalname = "vTOTVALUEHREACMTR" ;
      edtavTotvaluehreacpie_Internalname = "vTOTVALUEHREACPIE" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
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
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtHreAcPie_Jsonclick = "" ;
      edtHreAcMtr_Jsonclick = "" ;
      edtHreAcKgm_Jsonclick = "" ;
      edtHreAcCli_Jsonclick = "" ;
      edtHreAcNumC_Jsonclick = "" ;
      edtHreAcCol_Jsonclick = "" ;
      edtHreAcDsc_Jsonclick = "" ;
      edtHreAcSer_Jsonclick = "" ;
      edtHreAcNHdr_Jsonclick = "" ;
      edtHreAcPar_Jsonclick = "" ;
      edtHreAcReo_Jsonclick = "" ;
      edtHreAcCod_Jsonclick = "" ;
      edtHreNumCie_Jsonclick = "" ;
      edtHreBarPar_Jsonclick = "" ;
      edtHreBarReo_Jsonclick = "" ;
      edtHreBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluehreacpie_Jsonclick = "" ;
      edtavTotvaluehreacpie_Enabled = 1 ;
      edtavTotvaluehreacmtr_Jsonclick = "" ;
      edtavTotvaluehreacmtr_Enabled = 1 ;
      edtavTotvaluehreackgm_Jsonclick = "" ;
      edtavTotvaluehreackgm_Enabled = 1 ;
      edtHreAcPie_Visible = -1 ;
      edtHreAcMtr_Visible = -1 ;
      edtHreAcKgm_Visible = -1 ;
      edtHreAcCli_Visible = -1 ;
      edtHreAcNumC_Visible = -1 ;
      edtHreAcCol_Visible = -1 ;
      edtHreAcDsc_Visible = -1 ;
      edtHreAcSer_Visible = -1 ;
      edtHreAcNHdr_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "HistoricodeRecetas_AgrupacionAcabados_WPGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic|Dynamic|||||" ;
      Ddo_grid_Includedatalist = "T|T|T|T|||||" ;
      Ddo_grid_Filterisrange = "||||T|T|T|T|T" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|1|2|3|4|5|6|7|8" ;
      Ddo_grid_Columnids = "8:HreAcNHdr|9:HreAcSer|10:HreAcDsc|11:HreAcCol|12:HreAcNumC|13:HreAcCli|14:HreAcKgm|15:HreAcMtr|16:HreAcPie" ;
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
      Form.setCaption( httpContext.getMessage( " Tabla HISHRA", "") );
      subGrid_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV60HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV61HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV62HreBarpar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV63HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV51TFHreAcNHdr',fld:'vTFHREACNHDR',pic:''},{av:'AV52TFHreAcNHdr_Sel',fld:'vTFHREACNHDR_SEL',pic:''},{av:'AV38TFHreAcSer',fld:'vTFHREACSER',pic:''},{av:'AV39TFHreAcSer_Sel',fld:'vTFHREACSER_SEL',pic:''},{av:'AV40TFHreAcDsc',fld:'vTFHREACDSC',pic:''},{av:'AV41TFHreAcDsc_Sel',fld:'vTFHREACDSC_SEL',pic:''},{av:'AV42TFHreAcCol',fld:'vTFHREACCOL',pic:''},{av:'AV43TFHreAcCol_Sel',fld:'vTFHREACCOL_SEL',pic:''},{av:'AV44TFHreAcNumC',fld:'vTFHREACNUMC',pic:'ZZZZZ9'},{av:'AV45TFHreAcNumC_To',fld:'vTFHREACNUMC_TO',pic:'ZZZZZ9'},{av:'AV36TFHreAcCli',fld:'vTFHREACCLI',pic:'ZZZZZ9'},{av:'AV37TFHreAcCli_To',fld:'vTFHREACCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFHreAcKgm',fld:'vTFHREACKGM',pic:'ZZZZZ9.99'},{av:'AV31TFHreAcKgm_To',fld:'vTFHREACKGM_TO',pic:'ZZZZZ9.99'},{av:'AV32TFHreAcMtr',fld:'vTFHREACMTR',pic:'ZZZZZ9.99'},{av:'AV33TFHreAcMtr_To',fld:'vTFHREACMTR_TO',pic:'ZZZZZ9.99'},{av:'AV34TFHreAcPie',fld:'vTFHREACPIE',pic:'ZZZZZ9'},{av:'AV35TFHreAcPie_To',fld:'vTFHREACPIE_TO',pic:'ZZZZZ9'},{av:'AV88Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV53TotHreAcKgm',fld:'vTOTHREACKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV55TotHreAcMtr',fld:'vTOTHREACMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV57TotHreAcPie',fld:'vTOTHREACPIE',pic:'ZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A9988HreAcKgm',fld:'HREACKGM',pic:'ZZZZZ9.99'},{av:'A9989HreAcMtr',fld:'HREACMTR',pic:'ZZZZZ9.99'},{av:'A9990HreAcPie',fld:'HREACPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtHreAcNHdr_Visible',ctrl:'HREACNHDR',prop:'Visible'},{av:'edtHreAcSer_Visible',ctrl:'HREACSER',prop:'Visible'},{av:'edtHreAcDsc_Visible',ctrl:'HREACDSC',prop:'Visible'},{av:'edtHreAcCol_Visible',ctrl:'HREACCOL',prop:'Visible'},{av:'edtHreAcNumC_Visible',ctrl:'HREACNUMC',prop:'Visible'},{av:'edtHreAcCli_Visible',ctrl:'HREACCLI',prop:'Visible'},{av:'edtHreAcKgm_Visible',ctrl:'HREACKGM',prop:'Visible'},{av:'edtHreAcMtr_Visible',ctrl:'HREACMTR',prop:'Visible'},{av:'edtHreAcPie_Visible',ctrl:'HREACPIE',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV53TotHreAcKgm',fld:'vTOTHREACKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV55TotHreAcMtr',fld:'vTOTHREACMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV57TotHreAcPie',fld:'vTOTHREACPIE',pic:'ZZZZZ9',hsh:true},{av:'AV54TotValueHreAcKgm',fld:'vTOTVALUEHREACKGM',pic:''},{av:'AV56TotValueHreAcMtr',fld:'vTOTVALUEHREACMTR',pic:''},{av:'AV58TotValueHreAcPie',fld:'vTOTVALUEHREACPIE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121FZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV60HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV61HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV62HreBarpar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV63HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV51TFHreAcNHdr',fld:'vTFHREACNHDR',pic:''},{av:'AV52TFHreAcNHdr_Sel',fld:'vTFHREACNHDR_SEL',pic:''},{av:'AV38TFHreAcSer',fld:'vTFHREACSER',pic:''},{av:'AV39TFHreAcSer_Sel',fld:'vTFHREACSER_SEL',pic:''},{av:'AV40TFHreAcDsc',fld:'vTFHREACDSC',pic:''},{av:'AV41TFHreAcDsc_Sel',fld:'vTFHREACDSC_SEL',pic:''},{av:'AV42TFHreAcCol',fld:'vTFHREACCOL',pic:''},{av:'AV43TFHreAcCol_Sel',fld:'vTFHREACCOL_SEL',pic:''},{av:'AV44TFHreAcNumC',fld:'vTFHREACNUMC',pic:'ZZZZZ9'},{av:'AV45TFHreAcNumC_To',fld:'vTFHREACNUMC_TO',pic:'ZZZZZ9'},{av:'AV36TFHreAcCli',fld:'vTFHREACCLI',pic:'ZZZZZ9'},{av:'AV37TFHreAcCli_To',fld:'vTFHREACCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFHreAcKgm',fld:'vTFHREACKGM',pic:'ZZZZZ9.99'},{av:'AV31TFHreAcKgm_To',fld:'vTFHREACKGM_TO',pic:'ZZZZZ9.99'},{av:'AV32TFHreAcMtr',fld:'vTFHREACMTR',pic:'ZZZZZ9.99'},{av:'AV33TFHreAcMtr_To',fld:'vTFHREACMTR_TO',pic:'ZZZZZ9.99'},{av:'AV34TFHreAcPie',fld:'vTFHREACPIE',pic:'ZZZZZ9'},{av:'AV35TFHreAcPie_To',fld:'vTFHREACPIE_TO',pic:'ZZZZZ9'},{av:'AV88Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV53TotHreAcKgm',fld:'vTOTHREACKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV55TotHreAcMtr',fld:'vTOTHREACMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV57TotHreAcPie',fld:'vTOTHREACPIE',pic:'ZZZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131FZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV60HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV61HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV62HreBarpar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV63HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV51TFHreAcNHdr',fld:'vTFHREACNHDR',pic:''},{av:'AV52TFHreAcNHdr_Sel',fld:'vTFHREACNHDR_SEL',pic:''},{av:'AV38TFHreAcSer',fld:'vTFHREACSER',pic:''},{av:'AV39TFHreAcSer_Sel',fld:'vTFHREACSER_SEL',pic:''},{av:'AV40TFHreAcDsc',fld:'vTFHREACDSC',pic:''},{av:'AV41TFHreAcDsc_Sel',fld:'vTFHREACDSC_SEL',pic:''},{av:'AV42TFHreAcCol',fld:'vTFHREACCOL',pic:''},{av:'AV43TFHreAcCol_Sel',fld:'vTFHREACCOL_SEL',pic:''},{av:'AV44TFHreAcNumC',fld:'vTFHREACNUMC',pic:'ZZZZZ9'},{av:'AV45TFHreAcNumC_To',fld:'vTFHREACNUMC_TO',pic:'ZZZZZ9'},{av:'AV36TFHreAcCli',fld:'vTFHREACCLI',pic:'ZZZZZ9'},{av:'AV37TFHreAcCli_To',fld:'vTFHREACCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFHreAcKgm',fld:'vTFHREACKGM',pic:'ZZZZZ9.99'},{av:'AV31TFHreAcKgm_To',fld:'vTFHREACKGM_TO',pic:'ZZZZZ9.99'},{av:'AV32TFHreAcMtr',fld:'vTFHREACMTR',pic:'ZZZZZ9.99'},{av:'AV33TFHreAcMtr_To',fld:'vTFHREACMTR_TO',pic:'ZZZZZ9.99'},{av:'AV34TFHreAcPie',fld:'vTFHREACPIE',pic:'ZZZZZ9'},{av:'AV35TFHreAcPie_To',fld:'vTFHREACPIE_TO',pic:'ZZZZZ9'},{av:'AV88Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV53TotHreAcKgm',fld:'vTOTHREACKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV55TotHreAcMtr',fld:'vTOTHREACMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV57TotHreAcPie',fld:'vTOTHREACPIE',pic:'ZZZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141FZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV60HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV61HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV62HreBarpar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV63HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV51TFHreAcNHdr',fld:'vTFHREACNHDR',pic:''},{av:'AV52TFHreAcNHdr_Sel',fld:'vTFHREACNHDR_SEL',pic:''},{av:'AV38TFHreAcSer',fld:'vTFHREACSER',pic:''},{av:'AV39TFHreAcSer_Sel',fld:'vTFHREACSER_SEL',pic:''},{av:'AV40TFHreAcDsc',fld:'vTFHREACDSC',pic:''},{av:'AV41TFHreAcDsc_Sel',fld:'vTFHREACDSC_SEL',pic:''},{av:'AV42TFHreAcCol',fld:'vTFHREACCOL',pic:''},{av:'AV43TFHreAcCol_Sel',fld:'vTFHREACCOL_SEL',pic:''},{av:'AV44TFHreAcNumC',fld:'vTFHREACNUMC',pic:'ZZZZZ9'},{av:'AV45TFHreAcNumC_To',fld:'vTFHREACNUMC_TO',pic:'ZZZZZ9'},{av:'AV36TFHreAcCli',fld:'vTFHREACCLI',pic:'ZZZZZ9'},{av:'AV37TFHreAcCli_To',fld:'vTFHREACCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFHreAcKgm',fld:'vTFHREACKGM',pic:'ZZZZZ9.99'},{av:'AV31TFHreAcKgm_To',fld:'vTFHREACKGM_TO',pic:'ZZZZZ9.99'},{av:'AV32TFHreAcMtr',fld:'vTFHREACMTR',pic:'ZZZZZ9.99'},{av:'AV33TFHreAcMtr_To',fld:'vTFHREACMTR_TO',pic:'ZZZZZ9.99'},{av:'AV34TFHreAcPie',fld:'vTFHREACPIE',pic:'ZZZZZ9'},{av:'AV35TFHreAcPie_To',fld:'vTFHREACPIE_TO',pic:'ZZZZZ9'},{av:'AV88Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV53TotHreAcKgm',fld:'vTOTHREACKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV55TotHreAcMtr',fld:'vTOTHREACMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV57TotHreAcPie',fld:'vTOTHREACPIE',pic:'ZZZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV34TFHreAcPie',fld:'vTFHREACPIE',pic:'ZZZZZ9'},{av:'AV35TFHreAcPie_To',fld:'vTFHREACPIE_TO',pic:'ZZZZZ9'},{av:'AV32TFHreAcMtr',fld:'vTFHREACMTR',pic:'ZZZZZ9.99'},{av:'AV33TFHreAcMtr_To',fld:'vTFHREACMTR_TO',pic:'ZZZZZ9.99'},{av:'AV30TFHreAcKgm',fld:'vTFHREACKGM',pic:'ZZZZZ9.99'},{av:'AV31TFHreAcKgm_To',fld:'vTFHREACKGM_TO',pic:'ZZZZZ9.99'},{av:'AV36TFHreAcCli',fld:'vTFHREACCLI',pic:'ZZZZZ9'},{av:'AV37TFHreAcCli_To',fld:'vTFHREACCLI_TO',pic:'ZZZZZ9'},{av:'AV44TFHreAcNumC',fld:'vTFHREACNUMC',pic:'ZZZZZ9'},{av:'AV45TFHreAcNumC_To',fld:'vTFHREACNUMC_TO',pic:'ZZZZZ9'},{av:'AV42TFHreAcCol',fld:'vTFHREACCOL',pic:''},{av:'AV43TFHreAcCol_Sel',fld:'vTFHREACCOL_SEL',pic:''},{av:'AV40TFHreAcDsc',fld:'vTFHREACDSC',pic:''},{av:'AV41TFHreAcDsc_Sel',fld:'vTFHREACDSC_SEL',pic:''},{av:'AV38TFHreAcSer',fld:'vTFHREACSER',pic:''},{av:'AV39TFHreAcSer_Sel',fld:'vTFHREACSER_SEL',pic:''},{av:'AV51TFHreAcNHdr',fld:'vTFHREACNHDR',pic:''},{av:'AV52TFHreAcNHdr_Sel',fld:'vTFHREACNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e181FZ2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151FZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV60HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV61HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV62HreBarpar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV63HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV51TFHreAcNHdr',fld:'vTFHREACNHDR',pic:''},{av:'AV52TFHreAcNHdr_Sel',fld:'vTFHREACNHDR_SEL',pic:''},{av:'AV38TFHreAcSer',fld:'vTFHREACSER',pic:''},{av:'AV39TFHreAcSer_Sel',fld:'vTFHREACSER_SEL',pic:''},{av:'AV40TFHreAcDsc',fld:'vTFHREACDSC',pic:''},{av:'AV41TFHreAcDsc_Sel',fld:'vTFHREACDSC_SEL',pic:''},{av:'AV42TFHreAcCol',fld:'vTFHREACCOL',pic:''},{av:'AV43TFHreAcCol_Sel',fld:'vTFHREACCOL_SEL',pic:''},{av:'AV44TFHreAcNumC',fld:'vTFHREACNUMC',pic:'ZZZZZ9'},{av:'AV45TFHreAcNumC_To',fld:'vTFHREACNUMC_TO',pic:'ZZZZZ9'},{av:'AV36TFHreAcCli',fld:'vTFHREACCLI',pic:'ZZZZZ9'},{av:'AV37TFHreAcCli_To',fld:'vTFHREACCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFHreAcKgm',fld:'vTFHREACKGM',pic:'ZZZZZ9.99'},{av:'AV31TFHreAcKgm_To',fld:'vTFHREACKGM_TO',pic:'ZZZZZ9.99'},{av:'AV32TFHreAcMtr',fld:'vTFHREACMTR',pic:'ZZZZZ9.99'},{av:'AV33TFHreAcMtr_To',fld:'vTFHREACMTR_TO',pic:'ZZZZZ9.99'},{av:'AV34TFHreAcPie',fld:'vTFHREACPIE',pic:'ZZZZZ9'},{av:'AV35TFHreAcPie_To',fld:'vTFHREACPIE_TO',pic:'ZZZZZ9'},{av:'AV88Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV53TotHreAcKgm',fld:'vTOTHREACKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV55TotHreAcMtr',fld:'vTOTHREACMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV57TotHreAcPie',fld:'vTOTHREACPIE',pic:'ZZZZZ9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A9988HreAcKgm',fld:'HREACKGM',pic:'ZZZZZ9.99'},{av:'A9989HreAcMtr',fld:'HREACMTR',pic:'ZZZZZ9.99'},{av:'A9990HreAcPie',fld:'HREACPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtHreAcNHdr_Visible',ctrl:'HREACNHDR',prop:'Visible'},{av:'edtHreAcSer_Visible',ctrl:'HREACSER',prop:'Visible'},{av:'edtHreAcDsc_Visible',ctrl:'HREACDSC',prop:'Visible'},{av:'edtHreAcCol_Visible',ctrl:'HREACCOL',prop:'Visible'},{av:'edtHreAcNumC_Visible',ctrl:'HREACNUMC',prop:'Visible'},{av:'edtHreAcCli_Visible',ctrl:'HREACCLI',prop:'Visible'},{av:'edtHreAcKgm_Visible',ctrl:'HREACKGM',prop:'Visible'},{av:'edtHreAcMtr_Visible',ctrl:'HREACMTR',prop:'Visible'},{av:'edtHreAcPie_Visible',ctrl:'HREACPIE',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV53TotHreAcKgm',fld:'vTOTHREACKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV55TotHreAcMtr',fld:'vTOTHREACMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV57TotHreAcPie',fld:'vTOTHREACPIE',pic:'ZZZZZ9',hsh:true},{av:'AV54TotValueHreAcKgm',fld:'vTOTVALUEHREACKGM',pic:''},{av:'AV56TotValueHreAcMtr',fld:'vTOTVALUEHREACMTR',pic:''},{av:'AV58TotValueHreAcPie',fld:'vTOTVALUEHREACPIE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111FZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV59Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV60HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV61HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV62HreBarpar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV63HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV51TFHreAcNHdr',fld:'vTFHREACNHDR',pic:''},{av:'AV52TFHreAcNHdr_Sel',fld:'vTFHREACNHDR_SEL',pic:''},{av:'AV38TFHreAcSer',fld:'vTFHREACSER',pic:''},{av:'AV39TFHreAcSer_Sel',fld:'vTFHREACSER_SEL',pic:''},{av:'AV40TFHreAcDsc',fld:'vTFHREACDSC',pic:''},{av:'AV41TFHreAcDsc_Sel',fld:'vTFHREACDSC_SEL',pic:''},{av:'AV42TFHreAcCol',fld:'vTFHREACCOL',pic:''},{av:'AV43TFHreAcCol_Sel',fld:'vTFHREACCOL_SEL',pic:''},{av:'AV44TFHreAcNumC',fld:'vTFHREACNUMC',pic:'ZZZZZ9'},{av:'AV45TFHreAcNumC_To',fld:'vTFHREACNUMC_TO',pic:'ZZZZZ9'},{av:'AV36TFHreAcCli',fld:'vTFHREACCLI',pic:'ZZZZZ9'},{av:'AV37TFHreAcCli_To',fld:'vTFHREACCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFHreAcKgm',fld:'vTFHREACKGM',pic:'ZZZZZ9.99'},{av:'AV31TFHreAcKgm_To',fld:'vTFHREACKGM_TO',pic:'ZZZZZ9.99'},{av:'AV32TFHreAcMtr',fld:'vTFHREACMTR',pic:'ZZZZZ9.99'},{av:'AV33TFHreAcMtr_To',fld:'vTFHREACMTR_TO',pic:'ZZZZZ9.99'},{av:'AV34TFHreAcPie',fld:'vTFHREACPIE',pic:'ZZZZZ9'},{av:'AV35TFHreAcPie_To',fld:'vTFHREACPIE_TO',pic:'ZZZZZ9'},{av:'AV88Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV53TotHreAcKgm',fld:'vTOTHREACKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV55TotHreAcMtr',fld:'vTOTHREACMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV57TotHreAcPie',fld:'vTOTHREACPIE',pic:'ZZZZZ9',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A9988HreAcKgm',fld:'HREACKGM',pic:'ZZZZZ9.99'},{av:'A9989HreAcMtr',fld:'HREACMTR',pic:'ZZZZZ9.99'},{av:'A9990HreAcPie',fld:'HREACPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV51TFHreAcNHdr',fld:'vTFHREACNHDR',pic:''},{av:'AV52TFHreAcNHdr_Sel',fld:'vTFHREACNHDR_SEL',pic:''},{av:'AV38TFHreAcSer',fld:'vTFHREACSER',pic:''},{av:'AV39TFHreAcSer_Sel',fld:'vTFHREACSER_SEL',pic:''},{av:'AV40TFHreAcDsc',fld:'vTFHREACDSC',pic:''},{av:'AV41TFHreAcDsc_Sel',fld:'vTFHREACDSC_SEL',pic:''},{av:'AV42TFHreAcCol',fld:'vTFHREACCOL',pic:''},{av:'AV43TFHreAcCol_Sel',fld:'vTFHREACCOL_SEL',pic:''},{av:'AV44TFHreAcNumC',fld:'vTFHREACNUMC',pic:'ZZZZZ9'},{av:'AV45TFHreAcNumC_To',fld:'vTFHREACNUMC_TO',pic:'ZZZZZ9'},{av:'AV36TFHreAcCli',fld:'vTFHREACCLI',pic:'ZZZZZ9'},{av:'AV37TFHreAcCli_To',fld:'vTFHREACCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFHreAcKgm',fld:'vTFHREACKGM',pic:'ZZZZZ9.99'},{av:'AV31TFHreAcKgm_To',fld:'vTFHREACKGM_TO',pic:'ZZZZZ9.99'},{av:'AV32TFHreAcMtr',fld:'vTFHREACMTR',pic:'ZZZZZ9.99'},{av:'AV33TFHreAcMtr_To',fld:'vTFHREACMTR_TO',pic:'ZZZZZ9.99'},{av:'AV34TFHreAcPie',fld:'vTFHREACPIE',pic:'ZZZZZ9'},{av:'AV35TFHreAcPie_To',fld:'vTFHREACPIE_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtHreAcNHdr_Visible',ctrl:'HREACNHDR',prop:'Visible'},{av:'edtHreAcSer_Visible',ctrl:'HREACSER',prop:'Visible'},{av:'edtHreAcDsc_Visible',ctrl:'HREACDSC',prop:'Visible'},{av:'edtHreAcCol_Visible',ctrl:'HREACCOL',prop:'Visible'},{av:'edtHreAcNumC_Visible',ctrl:'HREACNUMC',prop:'Visible'},{av:'edtHreAcCli_Visible',ctrl:'HREACCLI',prop:'Visible'},{av:'edtHreAcKgm_Visible',ctrl:'HREACKGM',prop:'Visible'},{av:'edtHreAcMtr_Visible',ctrl:'HREACMTR',prop:'Visible'},{av:'edtHreAcPie_Visible',ctrl:'HREACPIE',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV53TotHreAcKgm',fld:'vTOTHREACKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV55TotHreAcMtr',fld:'vTOTHREACMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV57TotHreAcPie',fld:'vTOTHREACPIE',pic:'ZZZZZ9',hsh:true},{av:'AV54TotValueHreAcKgm',fld:'vTOTVALUEHREACKGM',pic:''},{av:'AV56TotValueHreAcMtr',fld:'vTOTVALUEHREACMTR',pic:''},{av:'AV58TotValueHreAcPie',fld:'vTOTVALUEHREACPIE',pic:''}]}");
      setEventMetadata("VALID_HREACCOD","{handler:'valid_Hreaccod',iparms:[]");
      setEventMetadata("VALID_HREACCOD",",oparms:[]}");
      setEventMetadata("VALID_HREACREO","{handler:'valid_Hreacreo',iparms:[]");
      setEventMetadata("VALID_HREACREO",",oparms:[]}");
      setEventMetadata("VALID_HREACPAR","{handler:'valid_Hreacpar',iparms:[]");
      setEventMetadata("VALID_HREACPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hreacpie',iparms:[]");
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
      wcpOAV59Emprcod = "" ;
      wcpOAV62HreBarpar = "" ;
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
      AV59Emprcod = "" ;
      AV62HreBarpar = "" ;
      AV15FilterFullText = "" ;
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV51TFHreAcNHdr = "" ;
      AV52TFHreAcNHdr_Sel = "" ;
      AV38TFHreAcSer = "" ;
      AV39TFHreAcSer_Sel = "" ;
      AV40TFHreAcDsc = "" ;
      AV41TFHreAcDsc_Sel = "" ;
      AV42TFHreAcCol = "" ;
      AV43TFHreAcCol_Sel = "" ;
      AV30TFHreAcKgm = DecimalUtil.ZERO ;
      AV31TFHreAcKgm_To = DecimalUtil.ZERO ;
      AV32TFHreAcMtr = DecimalUtil.ZERO ;
      AV33TFHreAcMtr_To = DecimalUtil.ZERO ;
      AV88Pgmname = "" ;
      AV53TotHreAcKgm = DecimalUtil.ZERO ;
      AV55TotHreAcMtr = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV21ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV46DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      A9987HreAcPar = "" ;
      A13895HreAcNHdr = "" ;
      A9992HreAcSer = "" ;
      A9993HreAcDsc = "" ;
      A9994HreAcCol = "" ;
      A9988HreAcKgm = DecimalUtil.ZERO ;
      A9989HreAcMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = "" ;
      lV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = "" ;
      lV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = "" ;
      lV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = "" ;
      lV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = "" ;
      AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext = "" ;
      AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel = "" ;
      AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr = "" ;
      AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel = "" ;
      AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser = "" ;
      AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel = "" ;
      AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc = "" ;
      AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel = "" ;
      AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol = "" ;
      AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm = DecimalUtil.ZERO ;
      AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to = DecimalUtil.ZERO ;
      AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr = DecimalUtil.ZERO ;
      AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to = DecimalUtil.ZERO ;
      H01FZ2_A9990HreAcPie = new int[1] ;
      H01FZ2_n9990HreAcPie = new boolean[] {false} ;
      H01FZ2_A9989HreAcMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FZ2_n9989HreAcMtr = new boolean[] {false} ;
      H01FZ2_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FZ2_n9988HreAcKgm = new boolean[] {false} ;
      H01FZ2_A9991HreAcCli = new int[1] ;
      H01FZ2_n9991HreAcCli = new boolean[] {false} ;
      H01FZ2_A9995HreAcNumC = new int[1] ;
      H01FZ2_n9995HreAcNumC = new boolean[] {false} ;
      H01FZ2_A9994HreAcCol = new String[] {""} ;
      H01FZ2_n9994HreAcCol = new boolean[] {false} ;
      H01FZ2_A9993HreAcDsc = new String[] {""} ;
      H01FZ2_n9993HreAcDsc = new boolean[] {false} ;
      H01FZ2_A9992HreAcSer = new String[] {""} ;
      H01FZ2_n9992HreAcSer = new boolean[] {false} ;
      H01FZ2_A4495HreNumCie = new byte[1] ;
      H01FZ2_A4494HreBarPar = new String[] {""} ;
      H01FZ2_A4493HreBarReo = new byte[1] ;
      H01FZ2_A4492HreBarCod = new int[1] ;
      H01FZ2_A396EmprCod = new String[] {""} ;
      H01FZ2_A9987HreAcPar = new String[] {""} ;
      H01FZ2_A9986HreAcReo = new byte[1] ;
      H01FZ2_A9985HreAcCod = new int[1] ;
      H01FZ3_AGRID_nRecordCount = new long[1] ;
      AV54TotValueHreAcKgm = "" ;
      AV56TotValueHreAcMtr = "" ;
      AV58TotValueHreAcPie = "" ;
      AV66Station = "" ;
      AV67Emprnom = "" ;
      AV68Usurcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22ManageFiltersXml = "" ;
      AV17UserCustomValue = "" ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      H01FZ4_A4495HreNumCie = new byte[1] ;
      H01FZ4_A4494HreBarPar = new String[] {""} ;
      H01FZ4_A4493HreBarReo = new byte[1] ;
      H01FZ4_A4492HreBarCod = new int[1] ;
      H01FZ4_A396EmprCod = new String[] {""} ;
      H01FZ4_A9990HreAcPie = new int[1] ;
      H01FZ4_n9990HreAcPie = new boolean[] {false} ;
      H01FZ4_A9989HreAcMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FZ4_n9989HreAcMtr = new boolean[] {false} ;
      H01FZ4_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FZ4_n9988HreAcKgm = new boolean[] {false} ;
      H01FZ4_A9991HreAcCli = new int[1] ;
      H01FZ4_n9991HreAcCli = new boolean[] {false} ;
      H01FZ4_A9995HreAcNumC = new int[1] ;
      H01FZ4_n9995HreAcNumC = new boolean[] {false} ;
      H01FZ4_A9994HreAcCol = new String[] {""} ;
      H01FZ4_n9994HreAcCol = new boolean[] {false} ;
      H01FZ4_A9993HreAcDsc = new String[] {""} ;
      H01FZ4_n9993HreAcDsc = new boolean[] {false} ;
      H01FZ4_A9992HreAcSer = new String[] {""} ;
      H01FZ4_n9992HreAcSer = new boolean[] {false} ;
      H01FZ4_A9987HreAcPar = new String[] {""} ;
      H01FZ4_A9986HreAcReo = new byte[1] ;
      H01FZ4_A9985HreAcCod = new int[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.historicoderecetas_agrupacionacabados_wp__default(),
         new Object[] {
             new Object[] {
            H01FZ2_A9990HreAcPie, H01FZ2_n9990HreAcPie, H01FZ2_A9989HreAcMtr, H01FZ2_n9989HreAcMtr, H01FZ2_A9988HreAcKgm, H01FZ2_n9988HreAcKgm, H01FZ2_A9991HreAcCli, H01FZ2_n9991HreAcCli, H01FZ2_A9995HreAcNumC, H01FZ2_n9995HreAcNumC,
            H01FZ2_A9994HreAcCol, H01FZ2_n9994HreAcCol, H01FZ2_A9993HreAcDsc, H01FZ2_n9993HreAcDsc, H01FZ2_A9992HreAcSer, H01FZ2_n9992HreAcSer, H01FZ2_A4495HreNumCie, H01FZ2_A4494HreBarPar, H01FZ2_A4493HreBarReo, H01FZ2_A4492HreBarCod,
            H01FZ2_A396EmprCod, H01FZ2_A9987HreAcPar, H01FZ2_A9986HreAcReo, H01FZ2_A9985HreAcCod
            }
            , new Object[] {
            H01FZ3_AGRID_nRecordCount
            }
            , new Object[] {
            H01FZ4_A4495HreNumCie, H01FZ4_A4494HreBarPar, H01FZ4_A4493HreBarReo, H01FZ4_A4492HreBarCod, H01FZ4_A396EmprCod, H01FZ4_A9990HreAcPie, H01FZ4_n9990HreAcPie, H01FZ4_A9989HreAcMtr, H01FZ4_n9989HreAcMtr, H01FZ4_A9988HreAcKgm,
            H01FZ4_n9988HreAcKgm, H01FZ4_A9991HreAcCli, H01FZ4_n9991HreAcCli, H01FZ4_A9995HreAcNumC, H01FZ4_n9995HreAcNumC, H01FZ4_A9994HreAcCol, H01FZ4_n9994HreAcCol, H01FZ4_A9993HreAcDsc, H01FZ4_n9993HreAcDsc, H01FZ4_A9992HreAcSer,
            H01FZ4_n9992HreAcSer, H01FZ4_A9987HreAcPar, H01FZ4_A9986HreAcReo, H01FZ4_A9985HreAcCod
            }
         }
      );
      AV88Pgmname = "HistoricodeRecetas_AgrupacionAcabados_WP" ;
      /* GeneXus formulas. */
      AV88Pgmname = "HistoricodeRecetas_AgrupacionAcabados_WP" ;
      Gx_err = (short)(0) ;
      edtavTotvaluehreackgm_Enabled = 0 ;
      edtavTotvaluehreacmtr_Enabled = 0 ;
      edtavTotvaluehreacpie_Enabled = 0 ;
   }

   private byte wcpOAV61HreBarReo ;
   private byte wcpOAV63HreNumCie ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV61HreBarReo ;
   private byte AV63HreNumCie ;
   private byte AV23ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A9986HreAcReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV60HreBarCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_37 ;
   private int AV60HreBarCod ;
   private int nGXsfl_37_idx=1 ;
   private int AV44TFHreAcNumC ;
   private int AV45TFHreAcNumC_To ;
   private int AV36TFHreAcCli ;
   private int AV37TFHreAcCli_To ;
   private int AV34TFHreAcPie ;
   private int AV35TFHreAcPie_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A4492HreBarCod ;
   private int A9985HreAcCod ;
   private int A9995HreAcNumC ;
   private int A9991HreAcCli ;
   private int A9990HreAcPie ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluehreackgm_Enabled ;
   private int edtavTotvaluehreacmtr_Enabled ;
   private int edtavTotvaluehreacpie_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc ;
   private int AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to ;
   private int AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli ;
   private int AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to ;
   private int AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie ;
   private int AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to ;
   private int edtHreAcNHdr_Visible ;
   private int edtHreAcSer_Visible ;
   private int edtHreAcDsc_Visible ;
   private int edtHreAcCol_Visible ;
   private int edtHreAcNumC_Visible ;
   private int edtHreAcCli_Visible ;
   private int edtHreAcKgm_Visible ;
   private int edtHreAcMtr_Visible ;
   private int edtHreAcPie_Visible ;
   private int AV47PageToGo ;
   private int AV89GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV57TotHreAcPie ;
   private long AV48GridCurrentPage ;
   private long AV49GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV30TFHreAcKgm ;
   private java.math.BigDecimal AV31TFHreAcKgm_To ;
   private java.math.BigDecimal AV32TFHreAcMtr ;
   private java.math.BigDecimal AV33TFHreAcMtr_To ;
   private java.math.BigDecimal AV53TotHreAcKgm ;
   private java.math.BigDecimal AV55TotHreAcMtr ;
   private java.math.BigDecimal A9988HreAcKgm ;
   private java.math.BigDecimal A9989HreAcMtr ;
   private java.math.BigDecimal AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm ;
   private java.math.BigDecimal AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to ;
   private java.math.BigDecimal AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr ;
   private java.math.BigDecimal AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to ;
   private String wcpOAV59Emprcod ;
   private String wcpOAV62HreBarpar ;
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
   private String AV59Emprcod ;
   private String AV62HreBarpar ;
   private String sGXsfl_37_idx="0001" ;
   private String AV51TFHreAcNHdr ;
   private String AV52TFHreAcNHdr_Sel ;
   private String AV38TFHreAcSer ;
   private String AV39TFHreAcSer_Sel ;
   private String AV40TFHreAcDsc ;
   private String AV41TFHreAcDsc_Sel ;
   private String AV42TFHreAcCol ;
   private String AV43TFHreAcCol_Sel ;
   private String AV88Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
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
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtHreBarCod_Internalname ;
   private String edtHreBarReo_Internalname ;
   private String A4494HreBarPar ;
   private String edtHreBarPar_Internalname ;
   private String edtHreNumCie_Internalname ;
   private String edtHreAcCod_Internalname ;
   private String edtHreAcReo_Internalname ;
   private String A9987HreAcPar ;
   private String edtHreAcPar_Internalname ;
   private String A13895HreAcNHdr ;
   private String edtHreAcNHdr_Internalname ;
   private String A9992HreAcSer ;
   private String edtHreAcSer_Internalname ;
   private String A9993HreAcDsc ;
   private String edtHreAcDsc_Internalname ;
   private String A9994HreAcCol ;
   private String edtHreAcCol_Internalname ;
   private String edtHreAcNumC_Internalname ;
   private String edtHreAcCli_Internalname ;
   private String edtHreAcKgm_Internalname ;
   private String edtHreAcMtr_Internalname ;
   private String edtHreAcPie_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavTotvaluehreackgm_Internalname ;
   private String edtavTotvaluehreacmtr_Internalname ;
   private String edtavTotvaluehreacpie_Internalname ;
   private String scmdbuf ;
   private String lV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ;
   private String lV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ;
   private String lV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ;
   private String lV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ;
   private String AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel ;
   private String AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ;
   private String AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel ;
   private String AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ;
   private String AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel ;
   private String AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ;
   private String AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel ;
   private String AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ;
   private String AV66Station ;
   private String AV67Emprnom ;
   private String AV68Usurcod ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluehreackgm_Jsonclick ;
   private String edtavTotvaluehreacmtr_Jsonclick ;
   private String edtavTotvaluehreacpie_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_37_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtHreBarCod_Jsonclick ;
   private String edtHreBarReo_Jsonclick ;
   private String edtHreBarPar_Jsonclick ;
   private String edtHreNumCie_Jsonclick ;
   private String edtHreAcCod_Jsonclick ;
   private String edtHreAcReo_Jsonclick ;
   private String edtHreAcPar_Jsonclick ;
   private String edtHreAcNHdr_Jsonclick ;
   private String edtHreAcSer_Jsonclick ;
   private String edtHreAcDsc_Jsonclick ;
   private String edtHreAcCol_Jsonclick ;
   private String edtHreAcNumC_Jsonclick ;
   private String edtHreAcCli_Jsonclick ;
   private String edtHreAcKgm_Jsonclick ;
   private String edtHreAcMtr_Jsonclick ;
   private String edtHreAcPie_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
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
   private boolean n9992HreAcSer ;
   private boolean n9993HreAcDsc ;
   private boolean n9994HreAcCol ;
   private boolean n9995HreAcNumC ;
   private boolean n9991HreAcCli ;
   private boolean n9988HreAcKgm ;
   private boolean n9989HreAcMtr ;
   private boolean n9990HreAcPie ;
   private boolean bGXsfl_37_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV16ColumnsSelectorXML ;
   private String AV22ManageFiltersXml ;
   private String AV17UserCustomValue ;
   private String AV15FilterFullText ;
   private String lV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ;
   private String AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ;
   private String AV54TotValueHreAcKgm ;
   private String AV56TotValueHreAcMtr ;
   private String AV58TotValueHreAcPie ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private int[] H01FZ2_A9990HreAcPie ;
   private boolean[] H01FZ2_n9990HreAcPie ;
   private java.math.BigDecimal[] H01FZ2_A9989HreAcMtr ;
   private boolean[] H01FZ2_n9989HreAcMtr ;
   private java.math.BigDecimal[] H01FZ2_A9988HreAcKgm ;
   private boolean[] H01FZ2_n9988HreAcKgm ;
   private int[] H01FZ2_A9991HreAcCli ;
   private boolean[] H01FZ2_n9991HreAcCli ;
   private int[] H01FZ2_A9995HreAcNumC ;
   private boolean[] H01FZ2_n9995HreAcNumC ;
   private String[] H01FZ2_A9994HreAcCol ;
   private boolean[] H01FZ2_n9994HreAcCol ;
   private String[] H01FZ2_A9993HreAcDsc ;
   private boolean[] H01FZ2_n9993HreAcDsc ;
   private String[] H01FZ2_A9992HreAcSer ;
   private boolean[] H01FZ2_n9992HreAcSer ;
   private byte[] H01FZ2_A4495HreNumCie ;
   private String[] H01FZ2_A4494HreBarPar ;
   private byte[] H01FZ2_A4493HreBarReo ;
   private int[] H01FZ2_A4492HreBarCod ;
   private String[] H01FZ2_A396EmprCod ;
   private String[] H01FZ2_A9987HreAcPar ;
   private byte[] H01FZ2_A9986HreAcReo ;
   private int[] H01FZ2_A9985HreAcCod ;
   private long[] H01FZ3_AGRID_nRecordCount ;
   private byte[] H01FZ4_A4495HreNumCie ;
   private String[] H01FZ4_A4494HreBarPar ;
   private byte[] H01FZ4_A4493HreBarReo ;
   private int[] H01FZ4_A4492HreBarCod ;
   private String[] H01FZ4_A396EmprCod ;
   private int[] H01FZ4_A9990HreAcPie ;
   private boolean[] H01FZ4_n9990HreAcPie ;
   private java.math.BigDecimal[] H01FZ4_A9989HreAcMtr ;
   private boolean[] H01FZ4_n9989HreAcMtr ;
   private java.math.BigDecimal[] H01FZ4_A9988HreAcKgm ;
   private boolean[] H01FZ4_n9988HreAcKgm ;
   private int[] H01FZ4_A9991HreAcCli ;
   private boolean[] H01FZ4_n9991HreAcCli ;
   private int[] H01FZ4_A9995HreAcNumC ;
   private boolean[] H01FZ4_n9995HreAcNumC ;
   private String[] H01FZ4_A9994HreAcCol ;
   private boolean[] H01FZ4_n9994HreAcCol ;
   private String[] H01FZ4_A9993HreAcDsc ;
   private boolean[] H01FZ4_n9993HreAcDsc ;
   private String[] H01FZ4_A9992HreAcSer ;
   private boolean[] H01FZ4_n9992HreAcSer ;
   private String[] H01FZ4_A9987HreAcPar ;
   private byte[] H01FZ4_A9986HreAcReo ;
   private int[] H01FZ4_A9985HreAcCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV21ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV46DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class historicoderecetas_agrupacionacabados_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01FZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ,
                                          String AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel ,
                                          String AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ,
                                          String AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel ,
                                          String AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ,
                                          String AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel ,
                                          String AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ,
                                          String AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel ,
                                          String AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ,
                                          int AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc ,
                                          int AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to ,
                                          int AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli ,
                                          int AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to ,
                                          java.math.BigDecimal AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm ,
                                          java.math.BigDecimal AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to ,
                                          java.math.BigDecimal AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr ,
                                          java.math.BigDecimal AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to ,
                                          int AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie ,
                                          int AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to ,
                                          int A9985HreAcCod ,
                                          byte A9986HreAcReo ,
                                          String A9987HreAcPar ,
                                          String A9992HreAcSer ,
                                          String A9993HreAcDsc ,
                                          String A9994HreAcCol ,
                                          int A9995HreAcNumC ,
                                          int A9991HreAcCli ,
                                          java.math.BigDecimal A9988HreAcKgm ,
                                          java.math.BigDecimal A9989HreAcMtr ,
                                          int A9990HreAcPie ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV59Emprcod ,
                                          int AV60HreBarCod ,
                                          byte AV61HreBarReo ,
                                          String AV62HreBarpar ,
                                          byte AV63HreNumCie ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[37];
      Object[] GXv_Object18 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " HreAcPie, HreAcMtr, HreAcKgm, HreAcCli, HreAcNumC, HreAcCol, HreAcDsc, HreAcSer, HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreAcPar, HreAcReo, HreAcCod" ;
      sFromString = " FROM TXPHISHRA" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ?)");
      if ( ! (GXutil.strcmp("", AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar) like '%' || UPPER(?)) or ( UPPER(HreAcSer) like '%' || UPPER(?)) or ( UPPER(HreAcDsc) like '%' || UPPER(?)) or ( UPPER(HreAcCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreAcNumC,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcCli,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcPie,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
         GXv_int17[6] = (byte)(1) ;
         GXv_int17[7] = (byte)(1) ;
         GXv_int17[8] = (byte)(1) ;
         GXv_int17[9] = (byte)(1) ;
         GXv_int17[10] = (byte)(1) ;
         GXv_int17[11] = (byte)(1) ;
         GXv_int17[12] = (byte)(1) ;
         GXv_int17[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel)==0) && ( ! (GXutil.strcmp("", AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcSer = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcDsc = ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel)==0) && ( ! (GXutil.strcmp("", AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcCol = ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (0==AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc) )
      {
         addWhere(sWhereString, "(HreAcNumC >= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (0==AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to) )
      {
         addWhere(sWhereString, "(HreAcNumC <= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (0==AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli) )
      {
         addWhere(sWhereString, "(HreAcCli >= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (0==AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to) )
      {
         addWhere(sWhereString, "(HreAcCli <= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm)==0) )
      {
         addWhere(sWhereString, "(HreAcKgm >= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAcKgm <= ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr)==0) )
      {
         addWhere(sWhereString, "(HreAcMtr >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAcMtr <= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (0==AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie) )
      {
         addWhere(sWhereString, "(HreAcPie >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (0==AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to) )
      {
         addWhere(sWhereString, "(HreAcPie <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY HreAcSer" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreAcSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY HreAcDsc" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreAcDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY HreAcCol" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreAcCol DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY HreAcNumC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreAcNumC DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY HreAcCli" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreAcCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY HreAcKgm" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreAcKgm DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY HreAcMtr" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreAcMtr DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY HreAcPie" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreAcPie DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H01FZ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ,
                                          String AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel ,
                                          String AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ,
                                          String AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel ,
                                          String AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ,
                                          String AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel ,
                                          String AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ,
                                          String AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel ,
                                          String AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ,
                                          int AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc ,
                                          int AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to ,
                                          int AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli ,
                                          int AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to ,
                                          java.math.BigDecimal AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm ,
                                          java.math.BigDecimal AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to ,
                                          java.math.BigDecimal AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr ,
                                          java.math.BigDecimal AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to ,
                                          int AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie ,
                                          int AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to ,
                                          int A9985HreAcCod ,
                                          byte A9986HreAcReo ,
                                          String A9987HreAcPar ,
                                          String A9992HreAcSer ,
                                          String A9993HreAcDsc ,
                                          String A9994HreAcCol ,
                                          int A9995HreAcNumC ,
                                          int A9991HreAcCli ,
                                          java.math.BigDecimal A9988HreAcKgm ,
                                          java.math.BigDecimal A9989HreAcMtr ,
                                          int A9990HreAcPie ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV59Emprcod ,
                                          int AV60HreBarCod ,
                                          byte AV61HreBarReo ,
                                          String AV62HreBarpar ,
                                          byte AV63HreNumCie ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[32];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPHISHRA" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ?)");
      if ( ! (GXutil.strcmp("", AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar) like '%' || UPPER(?)) or ( UPPER(HreAcSer) like '%' || UPPER(?)) or ( UPPER(HreAcDsc) like '%' || UPPER(?)) or ( UPPER(HreAcCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreAcNumC,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcCli,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcPie,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
         GXv_int19[6] = (byte)(1) ;
         GXv_int19[7] = (byte)(1) ;
         GXv_int19[8] = (byte)(1) ;
         GXv_int19[9] = (byte)(1) ;
         GXv_int19[10] = (byte)(1) ;
         GXv_int19[11] = (byte)(1) ;
         GXv_int19[12] = (byte)(1) ;
         GXv_int19[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar = ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel)==0) && ( ! (GXutil.strcmp("", AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcSer = ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcDsc = ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel)==0) && ( ! (GXutil.strcmp("", AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcCol = ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (0==AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc) )
      {
         addWhere(sWhereString, "(HreAcNumC >= ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (0==AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to) )
      {
         addWhere(sWhereString, "(HreAcNumC <= ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (0==AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli) )
      {
         addWhere(sWhereString, "(HreAcCli >= ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! (0==AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to) )
      {
         addWhere(sWhereString, "(HreAcCli <= ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm)==0) )
      {
         addWhere(sWhereString, "(HreAcKgm >= ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAcKgm <= ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr)==0) )
      {
         addWhere(sWhereString, "(HreAcMtr >= ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAcMtr <= ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (0==AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie) )
      {
         addWhere(sWhereString, "(HreAcPie >= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (0==AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to) )
      {
         addWhere(sWhereString, "(HreAcPie <= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H01FZ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext ,
                                          String AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel ,
                                          String AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr ,
                                          String AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel ,
                                          String AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser ,
                                          String AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel ,
                                          String AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc ,
                                          String AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel ,
                                          String AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol ,
                                          int AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc ,
                                          int AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to ,
                                          int AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli ,
                                          int AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to ,
                                          java.math.BigDecimal AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm ,
                                          java.math.BigDecimal AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to ,
                                          java.math.BigDecimal AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr ,
                                          java.math.BigDecimal AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to ,
                                          int AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie ,
                                          int AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to ,
                                          int A9985HreAcCod ,
                                          byte A9986HreAcReo ,
                                          String A9987HreAcPar ,
                                          String A9992HreAcSer ,
                                          String A9993HreAcDsc ,
                                          String A9994HreAcCol ,
                                          int A9995HreAcNumC ,
                                          int A9991HreAcCli ,
                                          java.math.BigDecimal A9988HreAcKgm ,
                                          java.math.BigDecimal A9989HreAcMtr ,
                                          int A9990HreAcPie ,
                                          String AV59Emprcod ,
                                          int AV60HreBarCod ,
                                          byte AV61HreBarReo ,
                                          String AV62HreBarpar ,
                                          byte AV63HreNumCie ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[32];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreAcPie, HreAcMtr, HreAcKgm, HreAcCli, HreAcNumC, HreAcCol, HreAcDsc, HreAcSer, HreAcPar, HreAcReo," ;
      scmdbuf += " HreAcCod FROM TXPHISHRA" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ?)");
      if ( ! (GXutil.strcmp("", AV69Historicoderecetas_agrupacionacabados_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar) like '%' || UPPER(?)) or ( UPPER(HreAcSer) like '%' || UPPER(?)) or ( UPPER(HreAcDsc) like '%' || UPPER(?)) or ( UPPER(HreAcCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreAcNumC,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcCli,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAcPie,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int21[5] = (byte)(1) ;
         GXv_int21[6] = (byte)(1) ;
         GXv_int21[7] = (byte)(1) ;
         GXv_int21[8] = (byte)(1) ;
         GXv_int21[9] = (byte)(1) ;
         GXv_int21[10] = (byte)(1) ;
         GXv_int21[11] = (byte)(1) ;
         GXv_int21[12] = (byte)(1) ;
         GXv_int21[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Historicoderecetas_agrupacionacabados_wpds_2_tfhreacnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Historicoderecetas_agrupacionacabados_wpds_3_tfhreacnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAcCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAcReo,'90'), 2) || HreAcPar = ?)");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel)==0) && ( ! (GXutil.strcmp("", AV72Historicoderecetas_agrupacionacabados_wpds_4_tfhreacser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Historicoderecetas_agrupacionacabados_wpds_5_tfhreacser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcSer = ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Historicoderecetas_agrupacionacabados_wpds_6_tfhreacdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Historicoderecetas_agrupacionacabados_wpds_7_tfhreacdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcDsc = ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel)==0) && ( ! (GXutil.strcmp("", AV76Historicoderecetas_agrupacionacabados_wpds_8_tfhreaccol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAcCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Historicoderecetas_agrupacionacabados_wpds_9_tfhreaccol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAcCol = ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (0==AV78Historicoderecetas_agrupacionacabados_wpds_10_tfhreacnumc) )
      {
         addWhere(sWhereString, "(HreAcNumC >= ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (0==AV79Historicoderecetas_agrupacionacabados_wpds_11_tfhreacnumc_to) )
      {
         addWhere(sWhereString, "(HreAcNumC <= ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! (0==AV80Historicoderecetas_agrupacionacabados_wpds_12_tfhreaccli) )
      {
         addWhere(sWhereString, "(HreAcCli >= ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! (0==AV81Historicoderecetas_agrupacionacabados_wpds_13_tfhreaccli_to) )
      {
         addWhere(sWhereString, "(HreAcCli <= ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Historicoderecetas_agrupacionacabados_wpds_14_tfhreackgm)==0) )
      {
         addWhere(sWhereString, "(HreAcKgm >= ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Historicoderecetas_agrupacionacabados_wpds_15_tfhreackgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAcKgm <= ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Historicoderecetas_agrupacionacabados_wpds_16_tfhreacmtr)==0) )
      {
         addWhere(sWhereString, "(HreAcMtr >= ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Historicoderecetas_agrupacionacabados_wpds_17_tfhreacmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAcMtr <= ?)");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (0==AV86Historicoderecetas_agrupacionacabados_wpds_18_tfhreacpie) )
      {
         addWhere(sWhereString, "(HreAcPie >= ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (0==AV87Historicoderecetas_agrupacionacabados_wpds_19_tfhreacpie_to) )
      {
         addWhere(sWhereString, "(HreAcPie <= ?)");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
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
                  return conditional_H01FZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() );
            case 1 :
                  return conditional_H01FZ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() );
            case 2 :
                  return conditional_H01FZ4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01FZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FZ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FZ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(9);
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(11);
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 3);
               ((String[]) buf[21])[0] = rslt.getString(14, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(15);
               ((int[]) buf[23])[0] = rslt.getInt(16);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(15);
               ((int[]) buf[23])[0] = rslt.getInt(16);
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
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               return;
      }
   }

}

