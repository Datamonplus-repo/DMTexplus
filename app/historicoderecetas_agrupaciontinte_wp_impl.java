package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class historicoderecetas_agrupaciontinte_wp_impl extends GXDataArea
{
   public historicoderecetas_agrupaciontinte_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public historicoderecetas_agrupaciontinte_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( historicoderecetas_agrupaciontinte_wp_impl.class ));
   }

   public historicoderecetas_agrupaciontinte_wp_impl( int remoteHandle ,
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
            AV50Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50Emprcod", AV50Emprcod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Emprcod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV51HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV51HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51HreBarCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51HreBarCod), "ZZZZZZZ9")));
               AV52HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV52HreBarReo", GXutil.str( AV52HreBarReo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52HreBarReo), "9")));
               AV53HreBarpar = httpContext.GetPar( "HreBarpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV53HreBarpar", AV53HreBarpar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV53HreBarpar, ""))));
               AV54HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV54HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54HreNumCie), 2, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHRENUMCIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV54HreNumCie), "Z9")));
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
      AV50Emprcod = httpContext.GetPar( "Emprcod") ;
      AV51HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
      AV52HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
      AV53HreBarpar = httpContext.GetPar( "HreBarpar") ;
      AV54HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
      AV23ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV18ColumnsSelector);
      AV63TFHreAgrNHdr = httpContext.GetPar( "TFHreAgrNHdr") ;
      AV64TFHreAgrNHdr_Sel = httpContext.GetPar( "TFHreAgrNHdr_Sel") ;
      AV36TFHreAgrSer = httpContext.GetPar( "TFHreAgrSer") ;
      AV37TFHreAgrSer_Sel = httpContext.GetPar( "TFHreAgrSer_Sel") ;
      AV38TFHreAgrDsc = httpContext.GetPar( "TFHreAgrDsc") ;
      AV39TFHreAgrDsc_Sel = httpContext.GetPar( "TFHreAgrDsc_Sel") ;
      AV40TFHreAgrCol = httpContext.GetPar( "TFHreAgrCol") ;
      AV41TFHreAgrCol_Sel = httpContext.GetPar( "TFHreAgrCol_Sel") ;
      AV42TFHreAgrNumC = (int)(GXutil.lval( httpContext.GetPar( "TFHreAgrNumC"))) ;
      AV43TFHreAgrNumC_To = (int)(GXutil.lval( httpContext.GetPar( "TFHreAgrNumC_To"))) ;
      AV44TFHreAgrCli = (int)(GXutil.lval( httpContext.GetPar( "TFHreAgrCli"))) ;
      AV45TFHreAgrCli_To = (int)(GXutil.lval( httpContext.GetPar( "TFHreAgrCli_To"))) ;
      AV30TFHreAgrKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFHreAgrKgm"), ".") ;
      AV31TFHreAgrKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHreAgrKgm_To"), ".") ;
      AV32TFHreAgrMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFHreAgrMtr"), ".") ;
      AV33TFHreAgrMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHreAgrMtr_To"), ".") ;
      AV34TFHreAgrPie = (short)(GXutil.lval( httpContext.GetPar( "TFHreAgrPie"))) ;
      AV35TFHreAgrPie_To = (short)(GXutil.lval( httpContext.GetPar( "TFHreAgrPie_To"))) ;
      AV89Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV57TotHreAgrKgm = CommonUtil.decimalVal( httpContext.GetPar( "TotHreAgrKgm"), ".") ;
      AV59TotHreAgrMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotHreAgrMtr"), ".") ;
      AV61TotHreAgrPie = GXutil.lval( httpContext.GetPar( "TotHreAgrPie")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV50Emprcod, AV51HreBarCod, AV52HreBarReo, AV53HreBarpar, AV54HreNumCie, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV63TFHreAgrNHdr, AV64TFHreAgrNHdr_Sel, AV36TFHreAgrSer, AV37TFHreAgrSer_Sel, AV38TFHreAgrDsc, AV39TFHreAgrDsc_Sel, AV40TFHreAgrCol, AV41TFHreAgrCol_Sel, AV42TFHreAgrNumC, AV43TFHreAgrNumC_To, AV44TFHreAgrCli, AV45TFHreAgrCli_To, AV30TFHreAgrKgm, AV31TFHreAgrKgm_To, AV32TFHreAgrMtr, AV33TFHreAgrMtr_To, AV34TFHreAgrPie, AV35TFHreAgrPie_To, AV89Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57TotHreAgrKgm, AV59TotHreAgrMtr, AV61TotHreAgrPie) ;
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
      pa1FY2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1FY2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.historicoderecetas_agrupaciontinte_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV50Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV51HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV52HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV53HreBarpar)),GXutil.URLEncode(GXutil.ltrimstr(AV54HreNumCie,2,0))}, new String[] {"Emprcod","HreBarCod","HreBarReo","HreBarpar","HreNumCie"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV89Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREAGRKGM", getSecureSignedToken( "", localUtil.format( AV57TotHreAgrKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREAGRMTR", getSecureSignedToken( "", localUtil.format( AV59TotHreAgrMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREAGRPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61TotHreAgrPie), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51HreBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52HreBarReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV53HreBarpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHRENUMCIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV54HreNumCie), "Z9")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRNHDR", GXutil.rtrim( AV63TFHreAgrNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRNHDR_SEL", GXutil.rtrim( AV64TFHreAgrNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRSER", GXutil.rtrim( AV36TFHreAgrSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRSER_SEL", GXutil.rtrim( AV37TFHreAgrSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRDSC", GXutil.rtrim( AV38TFHreAgrDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRDSC_SEL", GXutil.rtrim( AV39TFHreAgrDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRCOL", GXutil.rtrim( AV40TFHreAgrCol));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRCOL_SEL", GXutil.rtrim( AV41TFHreAgrCol_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRNUMC", GXutil.ltrim( localUtil.ntoc( AV42TFHreAgrNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRNUMC_TO", GXutil.ltrim( localUtil.ntoc( AV43TFHreAgrNumC_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRCLI", GXutil.ltrim( localUtil.ntoc( AV44TFHreAgrCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRCLI_TO", GXutil.ltrim( localUtil.ntoc( AV45TFHreAgrCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRKGM", GXutil.ltrim( localUtil.ntoc( AV30TFHreAgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRKGM_TO", GXutil.ltrim( localUtil.ntoc( AV31TFHreAgrKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRMTR", GXutil.ltrim( localUtil.ntoc( AV32TFHreAgrMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRMTR_TO", GXutil.ltrim( localUtil.ntoc( AV33TFHreAgrMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRPIE", GXutil.ltrim( localUtil.ntoc( AV34TFHreAgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHREAGRPIE_TO", GXutil.ltrim( localUtil.ntoc( AV35TFHreAgrPie_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV89Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV89Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV50Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREBARCOD", GXutil.ltrim( localUtil.ntoc( AV51HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51HreBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREBARREO", GXutil.ltrim( localUtil.ntoc( AV52HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52HreBarReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHREBARPAR", GXutil.rtrim( AV53HreBarpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV53HreBarpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHRENUMCIE", GXutil.ltrim( localUtil.ntoc( AV54HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHRENUMCIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV54HreNumCie), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTHREAGRKGM", GXutil.ltrim( localUtil.ntoc( AV57TotHreAgrKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREAGRKGM", getSecureSignedToken( "", localUtil.format( AV57TotHreAgrKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTHREAGRMTR", GXutil.ltrim( localUtil.ntoc( AV59TotHreAgrMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREAGRMTR", getSecureSignedToken( "", localUtil.format( AV59TotHreAgrMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTHREAGRPIE", GXutil.ltrim( localUtil.ntoc( AV61TotHreAgrPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREAGRPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61TotHreAgrPie), "ZZZ9")));
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
         we1FY2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1FY2( ) ;
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
      return formatLink("app.historicoderecetas_agrupaciontinte_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV50Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV51HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV52HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV53HreBarpar)),GXutil.URLEncode(GXutil.ltrimstr(AV54HreNumCie,2,0))}, new String[] {"Emprcod","HreBarCod","HreBarReo","HreBarpar","HreNumCie"})  ;
   }

   public String getPgmname( )
   {
      return "HistoricodeRecetas_AgrupacionTinte_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Hdrs Agrupadas (TINTE)", "") ;
   }

   public void wb1FY0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 37, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HistoricodeRecetas_AgrupacionTinte_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_19_1FY2( true) ;
      }
      else
      {
         wb_table1_19_1FY2( false) ;
      }
      return  ;
   }

   public void wb_table1_19_1FY2e( boolean wbgen )
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
         wb_table2_57_1FY2( true) ;
      }
      else
      {
         wb_table2_57_1FY2( false) ;
      }
      return  ;
   }

   public void wb_table2_57_1FY2e( boolean wbgen )
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

   public void start1FY2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Hdrs Agrupadas (TINTE)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1FY0( ) ;
   }

   public void ws1FY2( )
   {
      start1FY2( ) ;
      evt1FY2( ) ;
   }

   public void evt1FY2( )
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
                           e111FY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121FY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131FY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141FY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151FY2 ();
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
                           A4497HreAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4498HreAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4499HreAgrPar = httpContext.cgiGet( edtHreAgrPar_Internalname) ;
                           A13894HreAgrNHdr = httpContext.cgiGet( edtHreAgrNHdr_Internalname) ;
                           A4504HreAgrSer = httpContext.cgiGet( edtHreAgrSer_Internalname) ;
                           A4505HreAgrDsc = httpContext.cgiGet( edtHreAgrDsc_Internalname) ;
                           A4506HreAgrCol = httpContext.cgiGet( edtHreAgrCol_Internalname) ;
                           A4507HreAgrNumC = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAgrNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4503HreAgrCli = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAgrCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4500HreAgrKgm = localUtil.ctond( httpContext.cgiGet( edtHreAgrKgm_Internalname)) ;
                           A4501HreAgrMtr = localUtil.ctond( httpContext.cgiGet( edtHreAgrMtr_Internalname)) ;
                           A4502HreAgrPie = (short)(localUtil.ctol( httpContext.cgiGet( edtHreAgrPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e161FY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e171FY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e181FY2 ();
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
                           A4497HreAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4498HreAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4499HreAgrPar = httpContext.cgiGet( edtHreAgrPar_Internalname) ;
                           A13894HreAgrNHdr = httpContext.cgiGet( edtHreAgrNHdr_Internalname) ;
                           A4504HreAgrSer = httpContext.cgiGet( edtHreAgrSer_Internalname) ;
                           A4505HreAgrDsc = httpContext.cgiGet( edtHreAgrDsc_Internalname) ;
                           A4506HreAgrCol = httpContext.cgiGet( edtHreAgrCol_Internalname) ;
                           A4507HreAgrNumC = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAgrNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4503HreAgrCli = (int)(localUtil.ctol( httpContext.cgiGet( edtHreAgrCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4500HreAgrKgm = localUtil.ctond( httpContext.cgiGet( edtHreAgrKgm_Internalname)) ;
                           A4501HreAgrMtr = localUtil.ctond( httpContext.cgiGet( edtHreAgrMtr_Internalname)) ;
                           A4502HreAgrPie = (short)(localUtil.ctol( httpContext.cgiGet( edtHreAgrPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e161FY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e171FY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e181FY2 ();
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

   public void we1FY2( )
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

   public void pa1FY2( )
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
                                 String AV50Emprcod ,
                                 int AV51HreBarCod ,
                                 byte AV52HreBarReo ,
                                 String AV53HreBarpar ,
                                 byte AV54HreNumCie ,
                                 byte AV23ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV63TFHreAgrNHdr ,
                                 String AV64TFHreAgrNHdr_Sel ,
                                 String AV36TFHreAgrSer ,
                                 String AV37TFHreAgrSer_Sel ,
                                 String AV38TFHreAgrDsc ,
                                 String AV39TFHreAgrDsc_Sel ,
                                 String AV40TFHreAgrCol ,
                                 String AV41TFHreAgrCol_Sel ,
                                 int AV42TFHreAgrNumC ,
                                 int AV43TFHreAgrNumC_To ,
                                 int AV44TFHreAgrCli ,
                                 int AV45TFHreAgrCli_To ,
                                 java.math.BigDecimal AV30TFHreAgrKgm ,
                                 java.math.BigDecimal AV31TFHreAgrKgm_To ,
                                 java.math.BigDecimal AV32TFHreAgrMtr ,
                                 java.math.BigDecimal AV33TFHreAgrMtr_To ,
                                 short AV34TFHreAgrPie ,
                                 short AV35TFHreAgrPie_To ,
                                 String AV89Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV57TotHreAgrKgm ,
                                 java.math.BigDecimal AV59TotHreAgrMtr ,
                                 long AV61TotHreAgrPie )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171FY2 ();
      GRID_nCurrentRecord = 0 ;
      rf1FY2( ) ;
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
      rf1FY2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV89Pgmname = "HistoricodeRecetas_AgrupacionTinte_WP" ;
      Gx_err = (short)(0) ;
      edtavTotvaluehreagrkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluehreagrkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehreagrkgm_Enabled), 5, 0), true);
      edtavTotvaluehreagrmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluehreagrmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehreagrmtr_Enabled), 5, 0), true);
      edtavTotvaluehreagrpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluehreagrpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehreagrpie_Enabled), 5, 0), true);
   }

   public void rf1FY2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(37) ;
      /* Execute user event: Refresh */
      e171FY2 ();
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
                                              AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ,
                                              AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel ,
                                              AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ,
                                              AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel ,
                                              AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ,
                                              AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel ,
                                              AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ,
                                              AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel ,
                                              AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ,
                                              Integer.valueOf(AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc) ,
                                              Integer.valueOf(AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to) ,
                                              Integer.valueOf(AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli) ,
                                              Integer.valueOf(AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to) ,
                                              AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm ,
                                              AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to ,
                                              AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr ,
                                              AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to ,
                                              Short.valueOf(AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie) ,
                                              Short.valueOf(AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to) ,
                                              Integer.valueOf(A4497HreAgrCod) ,
                                              Byte.valueOf(A4498HreAgrReo) ,
                                              A4499HreAgrPar ,
                                              A4504HreAgrSer ,
                                              A4505HreAgrDsc ,
                                              A4506HreAgrCol ,
                                              Integer.valueOf(A4507HreAgrNumC) ,
                                              Integer.valueOf(A4503HreAgrCli) ,
                                              A4500HreAgrKgm ,
                                              A4501HreAgrMtr ,
                                              Short.valueOf(A4502HreAgrPie) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV50Emprcod ,
                                              Integer.valueOf(AV51HreBarCod) ,
                                              Byte.valueOf(AV52HreBarReo) ,
                                              AV53HreBarpar ,
                                              Byte.valueOf(AV54HreNumCie) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A4492HreBarCod) ,
                                              Byte.valueOf(A4493HreBarReo) ,
                                              A4494HreBarPar ,
                                              Byte.valueOf(A4495HreNumCie) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.BYTE
                                              }
         });
         lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
         lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
         lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
         lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
         lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
         lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
         lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
         lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
         lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
         lV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = GXutil.padr( GXutil.rtrim( AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr), 11, "%") ;
         lV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = GXutil.padr( GXutil.rtrim( AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser), 16, "%") ;
         lV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = GXutil.padr( GXutil.rtrim( AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc), 26, "%") ;
         lV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = GXutil.padr( GXutil.rtrim( AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol), 13, "%") ;
         /* Using cursor H01FY2 */
         pr_default.execute(0, new Object[] {AV50Emprcod, Integer.valueOf(AV51HreBarCod), Byte.valueOf(AV52HreBarReo), AV53HreBarpar, Byte.valueOf(AV54HreNumCie), lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr, AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel, lV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser, AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel, lV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc, AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel, lV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol, AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel, Integer.valueOf(AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc), Integer.valueOf(AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to), Integer.valueOf(AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli), Integer.valueOf(AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to), AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm, AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to, AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr, AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to, Short.valueOf(AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie), Short.valueOf(AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_37_idx = 1 ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4502HreAgrPie = H01FY2_A4502HreAgrPie[0] ;
            A4501HreAgrMtr = H01FY2_A4501HreAgrMtr[0] ;
            A4500HreAgrKgm = H01FY2_A4500HreAgrKgm[0] ;
            A4503HreAgrCli = H01FY2_A4503HreAgrCli[0] ;
            A4507HreAgrNumC = H01FY2_A4507HreAgrNumC[0] ;
            A4506HreAgrCol = H01FY2_A4506HreAgrCol[0] ;
            A4505HreAgrDsc = H01FY2_A4505HreAgrDsc[0] ;
            A4504HreAgrSer = H01FY2_A4504HreAgrSer[0] ;
            A4495HreNumCie = H01FY2_A4495HreNumCie[0] ;
            A4494HreBarPar = H01FY2_A4494HreBarPar[0] ;
            A4493HreBarReo = H01FY2_A4493HreBarReo[0] ;
            A4492HreBarCod = H01FY2_A4492HreBarCod[0] ;
            A396EmprCod = H01FY2_A396EmprCod[0] ;
            A4499HreAgrPar = H01FY2_A4499HreAgrPar[0] ;
            A4498HreAgrReo = H01FY2_A4498HreAgrReo[0] ;
            A4497HreAgrCod = H01FY2_A4497HreAgrCod[0] ;
            A13894HreAgrNHdr = GXutil.trim( GXutil.str( A4497HreAgrCod, 8, 0)) + "-" + GXutil.str( A4498HreAgrReo, 1, 0) + A4499HreAgrPar ;
            e181FY2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(37) ;
         wb1FY0( ) ;
      }
      bGXsfl_37_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1FY2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV89Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV89Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV50Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTHREAGRKGM", GXutil.ltrim( localUtil.ntoc( AV57TotHreAgrKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREAGRKGM", getSecureSignedToken( "", localUtil.format( AV57TotHreAgrKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTHREAGRMTR", GXutil.ltrim( localUtil.ntoc( AV59TotHreAgrMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREAGRMTR", getSecureSignedToken( "", localUtil.format( AV59TotHreAgrMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTHREAGRPIE", GXutil.ltrim( localUtil.ntoc( AV61TotHreAgrPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREAGRPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61TotHreAgrPie), "ZZZ9")));
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
      AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = AV15FilterFullText ;
      AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = AV63TFHreAgrNHdr ;
      AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel = AV64TFHreAgrNHdr_Sel ;
      AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = AV36TFHreAgrSer ;
      AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel = AV37TFHreAgrSer_Sel ;
      AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = AV38TFHreAgrDsc ;
      AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel = AV39TFHreAgrDsc_Sel ;
      AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = AV40TFHreAgrCol ;
      AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel = AV41TFHreAgrCol_Sel ;
      AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc = AV42TFHreAgrNumC ;
      AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to = AV43TFHreAgrNumC_To ;
      AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli = AV44TFHreAgrCli ;
      AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to = AV45TFHreAgrCli_To ;
      AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm = AV30TFHreAgrKgm ;
      AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to = AV31TFHreAgrKgm_To ;
      AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr = AV32TFHreAgrMtr ;
      AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to = AV33TFHreAgrMtr_To ;
      AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie = AV34TFHreAgrPie ;
      AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to = AV35TFHreAgrPie_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ,
                                           AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel ,
                                           AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ,
                                           AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel ,
                                           AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ,
                                           AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel ,
                                           AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ,
                                           AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel ,
                                           AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ,
                                           Integer.valueOf(AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc) ,
                                           Integer.valueOf(AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to) ,
                                           Integer.valueOf(AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli) ,
                                           Integer.valueOf(AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to) ,
                                           AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm ,
                                           AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to ,
                                           AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr ,
                                           AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to ,
                                           Short.valueOf(AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie) ,
                                           Short.valueOf(AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to) ,
                                           Integer.valueOf(A4497HreAgrCod) ,
                                           Byte.valueOf(A4498HreAgrReo) ,
                                           A4499HreAgrPar ,
                                           A4504HreAgrSer ,
                                           A4505HreAgrDsc ,
                                           A4506HreAgrCol ,
                                           Integer.valueOf(A4507HreAgrNumC) ,
                                           Integer.valueOf(A4503HreAgrCli) ,
                                           A4500HreAgrKgm ,
                                           A4501HreAgrMtr ,
                                           Short.valueOf(A4502HreAgrPie) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV50Emprcod ,
                                           Integer.valueOf(AV51HreBarCod) ,
                                           Byte.valueOf(AV52HreBarReo) ,
                                           AV53HreBarpar ,
                                           Byte.valueOf(AV54HreNumCie) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = GXutil.padr( GXutil.rtrim( AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr), 11, "%") ;
      lV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = GXutil.padr( GXutil.rtrim( AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser), 16, "%") ;
      lV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = GXutil.padr( GXutil.rtrim( AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc), 26, "%") ;
      lV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = GXutil.padr( GXutil.rtrim( AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol), 13, "%") ;
      /* Using cursor H01FY3 */
      pr_default.execute(1, new Object[] {AV50Emprcod, Integer.valueOf(AV51HreBarCod), Byte.valueOf(AV52HreBarReo), AV53HreBarpar, Byte.valueOf(AV54HreNumCie), lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr, AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel, lV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser, AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel, lV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc, AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel, lV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol, AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel, Integer.valueOf(AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc), Integer.valueOf(AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to), Integer.valueOf(AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli), Integer.valueOf(AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to), AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm, AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to, AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr, AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to, Short.valueOf(AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie), Short.valueOf(AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to)});
      GRID_nRecordCount = H01FY3_AGRID_nRecordCount[0] ;
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
      AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = AV15FilterFullText ;
      AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = AV63TFHreAgrNHdr ;
      AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel = AV64TFHreAgrNHdr_Sel ;
      AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = AV36TFHreAgrSer ;
      AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel = AV37TFHreAgrSer_Sel ;
      AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = AV38TFHreAgrDsc ;
      AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel = AV39TFHreAgrDsc_Sel ;
      AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = AV40TFHreAgrCol ;
      AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel = AV41TFHreAgrCol_Sel ;
      AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc = AV42TFHreAgrNumC ;
      AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to = AV43TFHreAgrNumC_To ;
      AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli = AV44TFHreAgrCli ;
      AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to = AV45TFHreAgrCli_To ;
      AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm = AV30TFHreAgrKgm ;
      AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to = AV31TFHreAgrKgm_To ;
      AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr = AV32TFHreAgrMtr ;
      AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to = AV33TFHreAgrMtr_To ;
      AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie = AV34TFHreAgrPie ;
      AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to = AV35TFHreAgrPie_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV50Emprcod, AV51HreBarCod, AV52HreBarReo, AV53HreBarpar, AV54HreNumCie, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV63TFHreAgrNHdr, AV64TFHreAgrNHdr_Sel, AV36TFHreAgrSer, AV37TFHreAgrSer_Sel, AV38TFHreAgrDsc, AV39TFHreAgrDsc_Sel, AV40TFHreAgrCol, AV41TFHreAgrCol_Sel, AV42TFHreAgrNumC, AV43TFHreAgrNumC_To, AV44TFHreAgrCli, AV45TFHreAgrCli_To, AV30TFHreAgrKgm, AV31TFHreAgrKgm_To, AV32TFHreAgrMtr, AV33TFHreAgrMtr_To, AV34TFHreAgrPie, AV35TFHreAgrPie_To, AV89Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57TotHreAgrKgm, AV59TotHreAgrMtr, AV61TotHreAgrPie) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = AV15FilterFullText ;
      AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = AV63TFHreAgrNHdr ;
      AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel = AV64TFHreAgrNHdr_Sel ;
      AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = AV36TFHreAgrSer ;
      AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel = AV37TFHreAgrSer_Sel ;
      AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = AV38TFHreAgrDsc ;
      AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel = AV39TFHreAgrDsc_Sel ;
      AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = AV40TFHreAgrCol ;
      AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel = AV41TFHreAgrCol_Sel ;
      AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc = AV42TFHreAgrNumC ;
      AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to = AV43TFHreAgrNumC_To ;
      AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli = AV44TFHreAgrCli ;
      AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to = AV45TFHreAgrCli_To ;
      AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm = AV30TFHreAgrKgm ;
      AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to = AV31TFHreAgrKgm_To ;
      AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr = AV32TFHreAgrMtr ;
      AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to = AV33TFHreAgrMtr_To ;
      AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie = AV34TFHreAgrPie ;
      AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to = AV35TFHreAgrPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV50Emprcod, AV51HreBarCod, AV52HreBarReo, AV53HreBarpar, AV54HreNumCie, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV63TFHreAgrNHdr, AV64TFHreAgrNHdr_Sel, AV36TFHreAgrSer, AV37TFHreAgrSer_Sel, AV38TFHreAgrDsc, AV39TFHreAgrDsc_Sel, AV40TFHreAgrCol, AV41TFHreAgrCol_Sel, AV42TFHreAgrNumC, AV43TFHreAgrNumC_To, AV44TFHreAgrCli, AV45TFHreAgrCli_To, AV30TFHreAgrKgm, AV31TFHreAgrKgm_To, AV32TFHreAgrMtr, AV33TFHreAgrMtr_To, AV34TFHreAgrPie, AV35TFHreAgrPie_To, AV89Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57TotHreAgrKgm, AV59TotHreAgrMtr, AV61TotHreAgrPie) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = AV15FilterFullText ;
      AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = AV63TFHreAgrNHdr ;
      AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel = AV64TFHreAgrNHdr_Sel ;
      AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = AV36TFHreAgrSer ;
      AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel = AV37TFHreAgrSer_Sel ;
      AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = AV38TFHreAgrDsc ;
      AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel = AV39TFHreAgrDsc_Sel ;
      AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = AV40TFHreAgrCol ;
      AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel = AV41TFHreAgrCol_Sel ;
      AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc = AV42TFHreAgrNumC ;
      AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to = AV43TFHreAgrNumC_To ;
      AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli = AV44TFHreAgrCli ;
      AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to = AV45TFHreAgrCli_To ;
      AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm = AV30TFHreAgrKgm ;
      AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to = AV31TFHreAgrKgm_To ;
      AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr = AV32TFHreAgrMtr ;
      AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to = AV33TFHreAgrMtr_To ;
      AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie = AV34TFHreAgrPie ;
      AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to = AV35TFHreAgrPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV50Emprcod, AV51HreBarCod, AV52HreBarReo, AV53HreBarpar, AV54HreNumCie, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV63TFHreAgrNHdr, AV64TFHreAgrNHdr_Sel, AV36TFHreAgrSer, AV37TFHreAgrSer_Sel, AV38TFHreAgrDsc, AV39TFHreAgrDsc_Sel, AV40TFHreAgrCol, AV41TFHreAgrCol_Sel, AV42TFHreAgrNumC, AV43TFHreAgrNumC_To, AV44TFHreAgrCli, AV45TFHreAgrCli_To, AV30TFHreAgrKgm, AV31TFHreAgrKgm_To, AV32TFHreAgrMtr, AV33TFHreAgrMtr_To, AV34TFHreAgrPie, AV35TFHreAgrPie_To, AV89Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57TotHreAgrKgm, AV59TotHreAgrMtr, AV61TotHreAgrPie) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = AV15FilterFullText ;
      AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = AV63TFHreAgrNHdr ;
      AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel = AV64TFHreAgrNHdr_Sel ;
      AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = AV36TFHreAgrSer ;
      AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel = AV37TFHreAgrSer_Sel ;
      AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = AV38TFHreAgrDsc ;
      AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel = AV39TFHreAgrDsc_Sel ;
      AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = AV40TFHreAgrCol ;
      AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel = AV41TFHreAgrCol_Sel ;
      AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc = AV42TFHreAgrNumC ;
      AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to = AV43TFHreAgrNumC_To ;
      AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli = AV44TFHreAgrCli ;
      AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to = AV45TFHreAgrCli_To ;
      AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm = AV30TFHreAgrKgm ;
      AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to = AV31TFHreAgrKgm_To ;
      AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr = AV32TFHreAgrMtr ;
      AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to = AV33TFHreAgrMtr_To ;
      AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie = AV34TFHreAgrPie ;
      AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to = AV35TFHreAgrPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV50Emprcod, AV51HreBarCod, AV52HreBarReo, AV53HreBarpar, AV54HreNumCie, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV63TFHreAgrNHdr, AV64TFHreAgrNHdr_Sel, AV36TFHreAgrSer, AV37TFHreAgrSer_Sel, AV38TFHreAgrDsc, AV39TFHreAgrDsc_Sel, AV40TFHreAgrCol, AV41TFHreAgrCol_Sel, AV42TFHreAgrNumC, AV43TFHreAgrNumC_To, AV44TFHreAgrCli, AV45TFHreAgrCli_To, AV30TFHreAgrKgm, AV31TFHreAgrKgm_To, AV32TFHreAgrMtr, AV33TFHreAgrMtr_To, AV34TFHreAgrPie, AV35TFHreAgrPie_To, AV89Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57TotHreAgrKgm, AV59TotHreAgrMtr, AV61TotHreAgrPie) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = AV15FilterFullText ;
      AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = AV63TFHreAgrNHdr ;
      AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel = AV64TFHreAgrNHdr_Sel ;
      AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = AV36TFHreAgrSer ;
      AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel = AV37TFHreAgrSer_Sel ;
      AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = AV38TFHreAgrDsc ;
      AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel = AV39TFHreAgrDsc_Sel ;
      AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = AV40TFHreAgrCol ;
      AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel = AV41TFHreAgrCol_Sel ;
      AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc = AV42TFHreAgrNumC ;
      AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to = AV43TFHreAgrNumC_To ;
      AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli = AV44TFHreAgrCli ;
      AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to = AV45TFHreAgrCli_To ;
      AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm = AV30TFHreAgrKgm ;
      AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to = AV31TFHreAgrKgm_To ;
      AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr = AV32TFHreAgrMtr ;
      AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to = AV33TFHreAgrMtr_To ;
      AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie = AV34TFHreAgrPie ;
      AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to = AV35TFHreAgrPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV50Emprcod, AV51HreBarCod, AV52HreBarReo, AV53HreBarpar, AV54HreNumCie, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV63TFHreAgrNHdr, AV64TFHreAgrNHdr_Sel, AV36TFHreAgrSer, AV37TFHreAgrSer_Sel, AV38TFHreAgrDsc, AV39TFHreAgrDsc_Sel, AV40TFHreAgrCol, AV41TFHreAgrCol_Sel, AV42TFHreAgrNumC, AV43TFHreAgrNumC_To, AV44TFHreAgrCli, AV45TFHreAgrCli_To, AV30TFHreAgrKgm, AV31TFHreAgrKgm_To, AV32TFHreAgrMtr, AV33TFHreAgrMtr_To, AV34TFHreAgrPie, AV35TFHreAgrPie_To, AV89Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57TotHreAgrKgm, AV59TotHreAgrMtr, AV61TotHreAgrPie) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV89Pgmname = "HistoricodeRecetas_AgrupacionTinte_WP" ;
      Gx_err = (short)(0) ;
      edtavTotvaluehreagrkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluehreagrkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehreagrkgm_Enabled), 5, 0), true);
      edtavTotvaluehreagrmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluehreagrmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehreagrmtr_Enabled), 5, 0), true);
      edtavTotvaluehreagrpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluehreagrpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehreagrpie_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1FY0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161FY2 ();
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
         AV58TotValueHreAgrKgm = httpContext.cgiGet( edtavTotvaluehreagrkgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58TotValueHreAgrKgm", AV58TotValueHreAgrKgm);
         AV60TotValueHreAgrMtr = httpContext.cgiGet( edtavTotvaluehreagrmtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60TotValueHreAgrMtr", AV60TotValueHreAgrMtr);
         AV62TotValueHreAgrPie = httpContext.cgiGet( edtavTotvaluehreagrpie_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62TotValueHreAgrPie", AV62TotValueHreAgrPie);
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
      e161FY2 ();
      if (returnInSub) return;
   }

   public void e161FY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV67Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      historicoderecetas_agrupaciontinte_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV67Station = GXt_char1 ;
      GXv_char2[0] = AV50Emprcod ;
      GXv_char3[0] = AV68Emprnom ;
      GXv_char4[0] = AV69Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV67Station, GXv_char2, GXv_char3, GXv_char4) ;
      historicoderecetas_agrupaciontinte_wp_impl.this.AV50Emprcod = GXv_char2[0] ;
      historicoderecetas_agrupaciontinte_wp_impl.this.AV68Emprnom = GXv_char3[0] ;
      historicoderecetas_agrupaciontinte_wp_impl.this.AV69Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Emprcod", AV50Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Emprcod, "@!"))));
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
      Form.setCaption( httpContext.getMessage( "Hdrs Agrupadas (TINTE)", "") );
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

   public void e171FY2( )
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
      if ( GXutil.strcmp(AV20Session.getValue("HistoricodeRecetas_AgrupacionTinte_WPColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("HistoricodeRecetas_AgrupacionTinte_WPColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtHreAgrNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrNHdr_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtHreAgrSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrSer_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtHreAgrDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrDsc_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtHreAgrCol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrCol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrCol_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtHreAgrNumC_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrNumC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrNumC_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtHreAgrCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrCli_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtHreAgrKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrKgm_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtHreAgrMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrMtr_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtHreAgrPie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAgrPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAgrPie_Visible), 5, 0), !bGXsfl_37_Refreshing);
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
      AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = AV15FilterFullText ;
      AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = AV63TFHreAgrNHdr ;
      AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel = AV64TFHreAgrNHdr_Sel ;
      AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = AV36TFHreAgrSer ;
      AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel = AV37TFHreAgrSer_Sel ;
      AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = AV38TFHreAgrDsc ;
      AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel = AV39TFHreAgrDsc_Sel ;
      AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = AV40TFHreAgrCol ;
      AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel = AV41TFHreAgrCol_Sel ;
      AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc = AV42TFHreAgrNumC ;
      AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to = AV43TFHreAgrNumC_To ;
      AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli = AV44TFHreAgrCli ;
      AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to = AV45TFHreAgrCli_To ;
      AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm = AV30TFHreAgrKgm ;
      AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to = AV31TFHreAgrKgm_To ;
      AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr = AV32TFHreAgrMtr ;
      AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to = AV33TFHreAgrMtr_To ;
      AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie = AV34TFHreAgrPie ;
      AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to = AV35TFHreAgrPie_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e121FY2( )
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

   public void e131FY2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141FY2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrNHdr") == 0 )
         {
            AV63TFHreAgrNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFHreAgrNHdr", AV63TFHreAgrNHdr);
            AV64TFHreAgrNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFHreAgrNHdr_Sel", AV64TFHreAgrNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrSer") == 0 )
         {
            AV36TFHreAgrSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFHreAgrSer", AV36TFHreAgrSer);
            AV37TFHreAgrSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFHreAgrSer_Sel", AV37TFHreAgrSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrDsc") == 0 )
         {
            AV38TFHreAgrDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFHreAgrDsc", AV38TFHreAgrDsc);
            AV39TFHreAgrDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFHreAgrDsc_Sel", AV39TFHreAgrDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrCol") == 0 )
         {
            AV40TFHreAgrCol = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFHreAgrCol", AV40TFHreAgrCol);
            AV41TFHreAgrCol_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFHreAgrCol_Sel", AV41TFHreAgrCol_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrNumC") == 0 )
         {
            AV42TFHreAgrNumC = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFHreAgrNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFHreAgrNumC), 6, 0));
            AV43TFHreAgrNumC_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFHreAgrNumC_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFHreAgrNumC_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrCli") == 0 )
         {
            AV44TFHreAgrCli = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFHreAgrCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFHreAgrCli), 6, 0));
            AV45TFHreAgrCli_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFHreAgrCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFHreAgrCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrKgm") == 0 )
         {
            AV30TFHreAgrKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFHreAgrKgm", GXutil.ltrimstr( AV30TFHreAgrKgm, 9, 2));
            AV31TFHreAgrKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFHreAgrKgm_To", GXutil.ltrimstr( AV31TFHreAgrKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrMtr") == 0 )
         {
            AV32TFHreAgrMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFHreAgrMtr", GXutil.ltrimstr( AV32TFHreAgrMtr, 9, 2));
            AV33TFHreAgrMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFHreAgrMtr_To", GXutil.ltrimstr( AV33TFHreAgrMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreAgrPie") == 0 )
         {
            AV34TFHreAgrPie = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFHreAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFHreAgrPie), 4, 0));
            AV35TFHreAgrPie_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFHreAgrPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFHreAgrPie_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e181FY2( )
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

   public void e151FY2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "HistoricodeRecetas_AgrupacionTinte_WPColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e111FY2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("HistoricodeRecetas_AgrupacionTinte_WPFilters")),GXutil.URLEncode(GXutil.rtrim(AV89Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("HistoricodeRecetas_AgrupacionTinte_WPFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV22ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "HistoricodeRecetas_AgrupacionTinte_WPFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         historicoderecetas_agrupaciontinte_wp_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV89Pgmname+"GridState", AV22ManageFiltersXml) ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAgrNHdr", "", "HDR", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAgrSer", "", "Codigo Articulo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAgrDsc", "", "Articulo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAgrCol", "", "Color", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAgrNumC", "", "Numero", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAgrCli", "", "Codigo Cliente", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAgrKgm", "", "Kilos", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAgrMtr", "", "Metros", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HreAgrPie", "", "Pzas", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV17UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "HistoricodeRecetas_AgrupacionTinte_WPColumnsSelector", GXv_char4) ;
      historicoderecetas_agrupaciontinte_wp_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "HistoricodeRecetas_AgrupacionTinte_WPFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV21ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV63TFHreAgrNHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFHreAgrNHdr", AV63TFHreAgrNHdr);
      AV64TFHreAgrNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFHreAgrNHdr_Sel", AV64TFHreAgrNHdr_Sel);
      AV36TFHreAgrSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFHreAgrSer", AV36TFHreAgrSer);
      AV37TFHreAgrSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFHreAgrSer_Sel", AV37TFHreAgrSer_Sel);
      AV38TFHreAgrDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFHreAgrDsc", AV38TFHreAgrDsc);
      AV39TFHreAgrDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFHreAgrDsc_Sel", AV39TFHreAgrDsc_Sel);
      AV40TFHreAgrCol = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFHreAgrCol", AV40TFHreAgrCol);
      AV41TFHreAgrCol_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFHreAgrCol_Sel", AV41TFHreAgrCol_Sel);
      AV42TFHreAgrNumC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFHreAgrNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFHreAgrNumC), 6, 0));
      AV43TFHreAgrNumC_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFHreAgrNumC_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFHreAgrNumC_To), 6, 0));
      AV44TFHreAgrCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFHreAgrCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFHreAgrCli), 6, 0));
      AV45TFHreAgrCli_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFHreAgrCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFHreAgrCli_To), 6, 0));
      AV30TFHreAgrKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFHreAgrKgm", GXutil.ltrimstr( AV30TFHreAgrKgm, 9, 2));
      AV31TFHreAgrKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFHreAgrKgm_To", GXutil.ltrimstr( AV31TFHreAgrKgm_To, 9, 2));
      AV32TFHreAgrMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFHreAgrMtr", GXutil.ltrimstr( AV32TFHreAgrMtr, 9, 2));
      AV33TFHreAgrMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFHreAgrMtr_To", GXutil.ltrimstr( AV33TFHreAgrMtr_To, 9, 2));
      AV34TFHreAgrPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFHreAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFHreAgrPie), 4, 0));
      AV35TFHreAgrPie_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFHreAgrPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFHreAgrPie_To), 4, 0));
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
      if ( GXutil.strcmp(AV20Session.getValue(AV89Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV89Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV89Pgmname+"GridState"), null, null);
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
      AV90GXV1 = 1 ;
      while ( AV90GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV90GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRNHDR") == 0 )
         {
            AV63TFHreAgrNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFHreAgrNHdr", AV63TFHreAgrNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRNHDR_SEL") == 0 )
         {
            AV64TFHreAgrNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFHreAgrNHdr_Sel", AV64TFHreAgrNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRSER") == 0 )
         {
            AV36TFHreAgrSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFHreAgrSer", AV36TFHreAgrSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRSER_SEL") == 0 )
         {
            AV37TFHreAgrSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFHreAgrSer_Sel", AV37TFHreAgrSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRDSC") == 0 )
         {
            AV38TFHreAgrDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFHreAgrDsc", AV38TFHreAgrDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRDSC_SEL") == 0 )
         {
            AV39TFHreAgrDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFHreAgrDsc_Sel", AV39TFHreAgrDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRCOL") == 0 )
         {
            AV40TFHreAgrCol = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFHreAgrCol", AV40TFHreAgrCol);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRCOL_SEL") == 0 )
         {
            AV41TFHreAgrCol_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFHreAgrCol_Sel", AV41TFHreAgrCol_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRNUMC") == 0 )
         {
            AV42TFHreAgrNumC = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFHreAgrNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFHreAgrNumC), 6, 0));
            AV43TFHreAgrNumC_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFHreAgrNumC_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFHreAgrNumC_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRCLI") == 0 )
         {
            AV44TFHreAgrCli = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFHreAgrCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFHreAgrCli), 6, 0));
            AV45TFHreAgrCli_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFHreAgrCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFHreAgrCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRKGM") == 0 )
         {
            AV30TFHreAgrKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFHreAgrKgm", GXutil.ltrimstr( AV30TFHreAgrKgm, 9, 2));
            AV31TFHreAgrKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFHreAgrKgm_To", GXutil.ltrimstr( AV31TFHreAgrKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRMTR") == 0 )
         {
            AV32TFHreAgrMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFHreAgrMtr", GXutil.ltrimstr( AV32TFHreAgrMtr, 9, 2));
            AV33TFHreAgrMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFHreAgrMtr_To", GXutil.ltrimstr( AV33TFHreAgrMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREAGRPIE") == 0 )
         {
            AV34TFHreAgrPie = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFHreAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFHreAgrPie), 4, 0));
            AV35TFHreAgrPie_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFHreAgrPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFHreAgrPie_To), 4, 0));
         }
         AV90GXV1 = (int)(AV90GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFHreAgrNHdr_Sel)==0), AV64TFHreAgrNHdr_Sel, GXv_char4) ;
      historicoderecetas_agrupaciontinte_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFHreAgrSer_Sel)==0), AV37TFHreAgrSer_Sel, GXv_char3) ;
      historicoderecetas_agrupaciontinte_wp_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFHreAgrDsc_Sel)==0), AV39TFHreAgrDsc_Sel, GXv_char2) ;
      historicoderecetas_agrupaciontinte_wp_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFHreAgrCol_Sel)==0), AV41TFHreAgrCol_Sel, GXv_char15) ;
      historicoderecetas_agrupaciontinte_wp_impl.this.GXt_char14 = GXv_char15[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFHreAgrNHdr)==0), AV63TFHreAgrNHdr, GXv_char15) ;
      historicoderecetas_agrupaciontinte_wp_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFHreAgrSer)==0), AV36TFHreAgrSer, GXv_char4) ;
      historicoderecetas_agrupaciontinte_wp_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFHreAgrDsc)==0), AV38TFHreAgrDsc, GXv_char3) ;
      historicoderecetas_agrupaciontinte_wp_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFHreAgrCol)==0), AV40TFHreAgrCol, GXv_char2) ;
      historicoderecetas_agrupaciontinte_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1+"|"+((0==AV42TFHreAgrNumC) ? "" : GXutil.str( AV42TFHreAgrNumC, 6, 0))+"|"+((0==AV44TFHreAgrCli) ? "" : GXutil.str( AV44TFHreAgrCli, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFHreAgrKgm)==0) ? "" : GXutil.str( AV30TFHreAgrKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFHreAgrMtr)==0) ? "" : GXutil.str( AV32TFHreAgrMtr, 9, 2))+"|"+((0==AV34TFHreAgrPie) ? "" : GXutil.str( AV34TFHreAgrPie, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||"+((0==AV43TFHreAgrNumC_To) ? "" : GXutil.str( AV43TFHreAgrNumC_To, 6, 0))+"|"+((0==AV45TFHreAgrCli_To) ? "" : GXutil.str( AV45TFHreAgrCli_To, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFHreAgrKgm_To)==0) ? "" : GXutil.str( AV31TFHreAgrKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFHreAgrMtr_To)==0) ? "" : GXutil.str( AV33TFHreAgrMtr_To, 9, 2))+"|"+((0==AV35TFHreAgrPie_To) ? "" : GXutil.str( AV35TFHreAgrPie_To, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV89Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREAGRNHDR", "", !(GXutil.strcmp("", AV63TFHreAgrNHdr)==0), (short)(0), AV63TFHreAgrNHdr, "", !(GXutil.strcmp("", AV64TFHreAgrNHdr_Sel)==0), AV64TFHreAgrNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREAGRSER", "", !(GXutil.strcmp("", AV36TFHreAgrSer)==0), (short)(0), AV36TFHreAgrSer, "", !(GXutil.strcmp("", AV37TFHreAgrSer_Sel)==0), AV37TFHreAgrSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREAGRDSC", "", !(GXutil.strcmp("", AV38TFHreAgrDsc)==0), (short)(0), AV38TFHreAgrDsc, "", !(GXutil.strcmp("", AV39TFHreAgrDsc_Sel)==0), AV39TFHreAgrDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREAGRCOL", "", !(GXutil.strcmp("", AV40TFHreAgrCol)==0), (short)(0), AV40TFHreAgrCol, "", !(GXutil.strcmp("", AV41TFHreAgrCol_Sel)==0), AV41TFHreAgrCol_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREAGRNUMC", "", !((0==AV42TFHreAgrNumC)&&(0==AV43TFHreAgrNumC_To)), (short)(0), GXutil.trim( GXutil.str( AV42TFHreAgrNumC, 6, 0)), GXutil.trim( GXutil.str( AV43TFHreAgrNumC_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREAGRCLI", "", !((0==AV44TFHreAgrCli)&&(0==AV45TFHreAgrCli_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFHreAgrCli, 6, 0)), GXutil.trim( GXutil.str( AV45TFHreAgrCli_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREAGRKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFHreAgrKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFHreAgrKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV30TFHreAgrKgm, 9, 2)), GXutil.trim( GXutil.str( AV31TFHreAgrKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREAGRMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFHreAgrMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFHreAgrMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV32TFHreAgrMtr, 9, 2)), GXutil.trim( GXutil.str( AV33TFHreAgrMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFHREAGRPIE", "", !((0==AV34TFHreAgrPie)&&(0==AV35TFHreAgrPie_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFHreAgrPie, 4, 0)), GXutil.trim( GXutil.str( AV35TFHreAgrPie_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      if ( ! (GXutil.strcmp("", AV50Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV50Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV51HreBarCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV51HreBarCod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV52HreBarReo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV52HreBarReo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV53HreBarpar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV53HreBarpar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV54HreNumCie) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HRENUMCIE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV54HreNumCie, 2, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV89Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV89Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "HISRAG" );
      AV20Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV57TotHreAgrKgm = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TotHreAgrKgm", GXutil.ltrimstr( AV57TotHreAgrKgm, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREAGRKGM", getSecureSignedToken( "", localUtil.format( AV57TotHreAgrKgm, "ZZZZZ9.99")));
      AV59TotHreAgrMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TotHreAgrMtr", GXutil.ltrimstr( AV59TotHreAgrMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREAGRMTR", getSecureSignedToken( "", localUtil.format( AV59TotHreAgrMtr, "ZZZZZ9.99")));
      AV61TotHreAgrPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TotHreAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TotHreAgrPie), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREAGRPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61TotHreAgrPie), "ZZZ9")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = AV15FilterFullText ;
      AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = AV63TFHreAgrNHdr ;
      AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel = AV64TFHreAgrNHdr_Sel ;
      AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = AV36TFHreAgrSer ;
      AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel = AV37TFHreAgrSer_Sel ;
      AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = AV38TFHreAgrDsc ;
      AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel = AV39TFHreAgrDsc_Sel ;
      AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = AV40TFHreAgrCol ;
      AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel = AV41TFHreAgrCol_Sel ;
      AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc = AV42TFHreAgrNumC ;
      AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to = AV43TFHreAgrNumC_To ;
      AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli = AV44TFHreAgrCli ;
      AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to = AV45TFHreAgrCli_To ;
      AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm = AV30TFHreAgrKgm ;
      AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to = AV31TFHreAgrKgm_To ;
      AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr = AV32TFHreAgrMtr ;
      AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to = AV33TFHreAgrMtr_To ;
      AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie = AV34TFHreAgrPie ;
      AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to = AV35TFHreAgrPie_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ,
                                           AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel ,
                                           AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ,
                                           AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel ,
                                           AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ,
                                           AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel ,
                                           AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ,
                                           AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel ,
                                           AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ,
                                           Integer.valueOf(AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc) ,
                                           Integer.valueOf(AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to) ,
                                           Integer.valueOf(AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli) ,
                                           Integer.valueOf(AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to) ,
                                           AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm ,
                                           AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to ,
                                           AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr ,
                                           AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to ,
                                           Short.valueOf(AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie) ,
                                           Short.valueOf(AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to) ,
                                           Integer.valueOf(A4497HreAgrCod) ,
                                           Byte.valueOf(A4498HreAgrReo) ,
                                           A4499HreAgrPar ,
                                           A4504HreAgrSer ,
                                           A4505HreAgrDsc ,
                                           A4506HreAgrCol ,
                                           Integer.valueOf(A4507HreAgrNumC) ,
                                           Integer.valueOf(A4503HreAgrCli) ,
                                           A4500HreAgrKgm ,
                                           A4501HreAgrMtr ,
                                           Short.valueOf(A4502HreAgrPie) ,
                                           AV50Emprcod ,
                                           Integer.valueOf(AV51HreBarCod) ,
                                           Byte.valueOf(AV52HreBarReo) ,
                                           AV53HreBarpar ,
                                           Byte.valueOf(AV54HreNumCie) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext), "%", "") ;
      lV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = GXutil.padr( GXutil.rtrim( AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr), 11, "%") ;
      lV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = GXutil.padr( GXutil.rtrim( AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser), 16, "%") ;
      lV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = GXutil.padr( GXutil.rtrim( AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc), 26, "%") ;
      lV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = GXutil.padr( GXutil.rtrim( AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol), 13, "%") ;
      /* Using cursor H01FY4 */
      pr_default.execute(2, new Object[] {AV50Emprcod, Integer.valueOf(AV51HreBarCod), Byte.valueOf(AV52HreBarReo), AV53HreBarpar, Byte.valueOf(AV54HreNumCie), lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext, lV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr, AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel, lV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser, AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel, lV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc, AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel, lV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol, AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel, Integer.valueOf(AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc), Integer.valueOf(AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to), Integer.valueOf(AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli), Integer.valueOf(AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to), AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm, AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to, AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr, AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to, Short.valueOf(AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie), Short.valueOf(AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to)});
      nGXsfl_37_idx = 1 ;
      sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_372( ) ;
      GRID_nEOF = (byte)(0) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      while ( ( (pr_default.getStatus(2) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
      {
         A4495HreNumCie = H01FY4_A4495HreNumCie[0] ;
         A4494HreBarPar = H01FY4_A4494HreBarPar[0] ;
         A4493HreBarReo = H01FY4_A4493HreBarReo[0] ;
         A4492HreBarCod = H01FY4_A4492HreBarCod[0] ;
         A396EmprCod = H01FY4_A396EmprCod[0] ;
         A4502HreAgrPie = H01FY4_A4502HreAgrPie[0] ;
         A4501HreAgrMtr = H01FY4_A4501HreAgrMtr[0] ;
         A4500HreAgrKgm = H01FY4_A4500HreAgrKgm[0] ;
         A4503HreAgrCli = H01FY4_A4503HreAgrCli[0] ;
         A4507HreAgrNumC = H01FY4_A4507HreAgrNumC[0] ;
         A4506HreAgrCol = H01FY4_A4506HreAgrCol[0] ;
         A4505HreAgrDsc = H01FY4_A4505HreAgrDsc[0] ;
         A4504HreAgrSer = H01FY4_A4504HreAgrSer[0] ;
         A4499HreAgrPar = H01FY4_A4499HreAgrPar[0] ;
         A4498HreAgrReo = H01FY4_A4498HreAgrReo[0] ;
         A4497HreAgrCod = H01FY4_A4497HreAgrCod[0] ;
         A13894HreAgrNHdr = GXutil.trim( GXutil.str( A4497HreAgrCod, 8, 0)) + "-" + GXutil.str( A4498HreAgrReo, 1, 0) + A4499HreAgrPar ;
         AV57TotHreAgrKgm = A4500HreAgrKgm.add(AV57TotHreAgrKgm) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57TotHreAgrKgm", GXutil.ltrimstr( AV57TotHreAgrKgm, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREAGRKGM", getSecureSignedToken( "", localUtil.format( AV57TotHreAgrKgm, "ZZZZZ9.99")));
         AV59TotHreAgrMtr = A4501HreAgrMtr.add(AV59TotHreAgrMtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59TotHreAgrMtr", GXutil.ltrimstr( AV59TotHreAgrMtr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREAGRMTR", getSecureSignedToken( "", localUtil.format( AV59TotHreAgrMtr, "ZZZZZ9.99")));
         AV61TotHreAgrPie = (long)(A4502HreAgrPie+AV61TotHreAgrPie) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61TotHreAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TotHreAgrPie), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHREAGRPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61TotHreAgrPie), "ZZZ9")));
         pr_default.readNext(2);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(2) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(2);
      AV58TotValueHreAgrKgm = localUtil.format( AV57TotHreAgrKgm, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TotValueHreAgrKgm", AV58TotValueHreAgrKgm);
      AV60TotValueHreAgrMtr = localUtil.format( AV59TotHreAgrMtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TotValueHreAgrMtr", AV60TotValueHreAgrMtr);
      AV62TotValueHreAgrPie = localUtil.format( DecimalUtil.doubleToDec(AV61TotHreAgrPie), "ZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TotValueHreAgrPie", AV62TotValueHreAgrPie);
   }

   public void wb_table2_57_1FY2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehreagrkgm_Internalname, httpContext.getMessage( "Tot Value Hre Agr Kgm", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_37_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehreagrkgm_Internalname, AV58TotValueHreAgrKgm, GXutil.rtrim( localUtil.format( AV58TotValueHreAgrKgm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehreagrkgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehreagrkgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HistoricodeRecetas_AgrupacionTinte_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehreagrmtr_Internalname, httpContext.getMessage( "Tot Value Hre Agr Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_37_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehreagrmtr_Internalname, AV60TotValueHreAgrMtr, GXutil.rtrim( localUtil.format( AV60TotValueHreAgrMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehreagrmtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehreagrmtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HistoricodeRecetas_AgrupacionTinte_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehreagrpie_Internalname, httpContext.getMessage( "Tot Value Hre Agr Pie", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_37_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehreagrpie_Internalname, AV62TotValueHreAgrPie, GXutil.rtrim( localUtil.format( AV62TotValueHreAgrPie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehreagrpie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehreagrpie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_HistoricodeRecetas_AgrupacionTinte_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_57_1FY2e( true) ;
      }
      else
      {
         wb_table2_57_1FY2e( false) ;
      }
   }

   public void wb_table1_19_1FY2( boolean wbgen )
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
         wb_table3_24_1FY2( true) ;
      }
      else
      {
         wb_table3_24_1FY2( false) ;
      }
      return  ;
   }

   public void wb_table3_24_1FY2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_19_1FY2e( true) ;
      }
      else
      {
         wb_table1_19_1FY2e( false) ;
      }
   }

   public void wb_table3_24_1FY2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_HistoricodeRecetas_AgrupacionTinte_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_24_1FY2e( true) ;
      }
      else
      {
         wb_table3_24_1FY2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV50Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Emprcod", AV50Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50Emprcod, "@!"))));
      AV51HreBarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51HreBarCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51HreBarCod), "ZZZZZZZ9")));
      AV52HreBarReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52HreBarReo", GXutil.str( AV52HreBarReo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52HreBarReo), "9")));
      AV53HreBarpar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53HreBarpar", AV53HreBarpar);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHREBARPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV53HreBarpar, ""))));
      AV54HreNumCie = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54HreNumCie), 2, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHRENUMCIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV54HreNumCie), "Z9")));
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
      pa1FY2( ) ;
      ws1FY2( ) ;
      we1FY2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116133357", true, true);
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
      httpContext.AddJavascriptSource("historicoderecetas_agrupaciontinte_wp.js", "?202682116133358", false, true);
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
      edtHreAgrCod_Internalname = "HREAGRCOD_"+sGXsfl_37_idx ;
      edtHreAgrReo_Internalname = "HREAGRREO_"+sGXsfl_37_idx ;
      edtHreAgrPar_Internalname = "HREAGRPAR_"+sGXsfl_37_idx ;
      edtHreAgrNHdr_Internalname = "HREAGRNHDR_"+sGXsfl_37_idx ;
      edtHreAgrSer_Internalname = "HREAGRSER_"+sGXsfl_37_idx ;
      edtHreAgrDsc_Internalname = "HREAGRDSC_"+sGXsfl_37_idx ;
      edtHreAgrCol_Internalname = "HREAGRCOL_"+sGXsfl_37_idx ;
      edtHreAgrNumC_Internalname = "HREAGRNUMC_"+sGXsfl_37_idx ;
      edtHreAgrCli_Internalname = "HREAGRCLI_"+sGXsfl_37_idx ;
      edtHreAgrKgm_Internalname = "HREAGRKGM_"+sGXsfl_37_idx ;
      edtHreAgrMtr_Internalname = "HREAGRMTR_"+sGXsfl_37_idx ;
      edtHreAgrPie_Internalname = "HREAGRPIE_"+sGXsfl_37_idx ;
   }

   public void subsflControlProps_fel_372( )
   {
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_37_fel_idx ;
      edtHreBarCod_Internalname = "HREBARCOD_"+sGXsfl_37_fel_idx ;
      edtHreBarReo_Internalname = "HREBARREO_"+sGXsfl_37_fel_idx ;
      edtHreBarPar_Internalname = "HREBARPAR_"+sGXsfl_37_fel_idx ;
      edtHreNumCie_Internalname = "HRENUMCIE_"+sGXsfl_37_fel_idx ;
      edtHreAgrCod_Internalname = "HREAGRCOD_"+sGXsfl_37_fel_idx ;
      edtHreAgrReo_Internalname = "HREAGRREO_"+sGXsfl_37_fel_idx ;
      edtHreAgrPar_Internalname = "HREAGRPAR_"+sGXsfl_37_fel_idx ;
      edtHreAgrNHdr_Internalname = "HREAGRNHDR_"+sGXsfl_37_fel_idx ;
      edtHreAgrSer_Internalname = "HREAGRSER_"+sGXsfl_37_fel_idx ;
      edtHreAgrDsc_Internalname = "HREAGRDSC_"+sGXsfl_37_fel_idx ;
      edtHreAgrCol_Internalname = "HREAGRCOL_"+sGXsfl_37_fel_idx ;
      edtHreAgrNumC_Internalname = "HREAGRNUMC_"+sGXsfl_37_fel_idx ;
      edtHreAgrCli_Internalname = "HREAGRCLI_"+sGXsfl_37_fel_idx ;
      edtHreAgrKgm_Internalname = "HREAGRKGM_"+sGXsfl_37_fel_idx ;
      edtHreAgrMtr_Internalname = "HREAGRMTR_"+sGXsfl_37_fel_idx ;
      edtHreAgrPie_Internalname = "HREAGRPIE_"+sGXsfl_37_fel_idx ;
   }

   public void sendrow_372( )
   {
      subsflControlProps_372( ) ;
      wb1FY0( ) ;
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrCod_Internalname,GXutil.ltrim( localUtil.ntoc( A4497HreAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4497HreAgrCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrReo_Internalname,GXutil.ltrim( localUtil.ntoc( A4498HreAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4498HreAgrReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrPar_Internalname,GXutil.rtrim( A4499HreAgrPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreAgrNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrNHdr_Internalname,GXutil.rtrim( A13894HreAgrNHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHreAgrNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreAgrSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrSer_Internalname,GXutil.rtrim( A4504HreAgrSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreAgrSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreAgrDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrDsc_Internalname,GXutil.rtrim( A4505HreAgrDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreAgrDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreAgrCol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrCol_Internalname,GXutil.rtrim( A4506HreAgrCol),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreAgrCol_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreAgrNumC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrNumC_Internalname,GXutil.ltrim( localUtil.ntoc( A4507HreAgrNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4507HreAgrNumC), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrNumC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreAgrNumC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreAgrCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrCli_Internalname,GXutil.ltrim( localUtil.ntoc( A4503HreAgrCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4503HreAgrCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreAgrCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreAgrKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A4500HreAgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4500HreAgrKgm, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHreAgrKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreAgrMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A4501HreAgrMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4501HreAgrMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreAgrMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreAgrPie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAgrPie_Internalname,GXutil.ltrim( localUtil.ntoc( A4502HreAgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4502HreAgrPie), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAgrPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreAgrPie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1FY2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAgrNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAgrSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAgrDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAgrCol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAgrNumC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAgrCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAgrKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAgrMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreAgrPie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pzas", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4497HreAgrCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4498HreAgrReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4499HreAgrPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13894HreAgrNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAgrNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4504HreAgrSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAgrSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4505HreAgrDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAgrDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4506HreAgrCol));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAgrCol_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4507HreAgrNumC, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAgrNumC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4503HreAgrCli, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAgrCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4500HreAgrKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAgrKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4501HreAgrMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAgrMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4502HreAgrPie, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreAgrPie_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtHreAgrCod_Internalname = "HREAGRCOD" ;
      edtHreAgrReo_Internalname = "HREAGRREO" ;
      edtHreAgrPar_Internalname = "HREAGRPAR" ;
      edtHreAgrNHdr_Internalname = "HREAGRNHDR" ;
      edtHreAgrSer_Internalname = "HREAGRSER" ;
      edtHreAgrDsc_Internalname = "HREAGRDSC" ;
      edtHreAgrCol_Internalname = "HREAGRCOL" ;
      edtHreAgrNumC_Internalname = "HREAGRNUMC" ;
      edtHreAgrCli_Internalname = "HREAGRCLI" ;
      edtHreAgrKgm_Internalname = "HREAGRKGM" ;
      edtHreAgrMtr_Internalname = "HREAGRMTR" ;
      edtHreAgrPie_Internalname = "HREAGRPIE" ;
      edtavTotvaluehreagrkgm_Internalname = "vTOTVALUEHREAGRKGM" ;
      edtavTotvaluehreagrmtr_Internalname = "vTOTVALUEHREAGRMTR" ;
      edtavTotvaluehreagrpie_Internalname = "vTOTVALUEHREAGRPIE" ;
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
      edtHreAgrPie_Jsonclick = "" ;
      edtHreAgrMtr_Jsonclick = "" ;
      edtHreAgrKgm_Jsonclick = "" ;
      edtHreAgrCli_Jsonclick = "" ;
      edtHreAgrNumC_Jsonclick = "" ;
      edtHreAgrCol_Jsonclick = "" ;
      edtHreAgrDsc_Jsonclick = "" ;
      edtHreAgrSer_Jsonclick = "" ;
      edtHreAgrNHdr_Jsonclick = "" ;
      edtHreAgrPar_Jsonclick = "" ;
      edtHreAgrReo_Jsonclick = "" ;
      edtHreAgrCod_Jsonclick = "" ;
      edtHreNumCie_Jsonclick = "" ;
      edtHreBarPar_Jsonclick = "" ;
      edtHreBarReo_Jsonclick = "" ;
      edtHreBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluehreagrpie_Jsonclick = "" ;
      edtavTotvaluehreagrpie_Enabled = 1 ;
      edtavTotvaluehreagrmtr_Jsonclick = "" ;
      edtavTotvaluehreagrmtr_Enabled = 1 ;
      edtavTotvaluehreagrkgm_Jsonclick = "" ;
      edtavTotvaluehreagrkgm_Enabled = 1 ;
      edtHreAgrPie_Visible = -1 ;
      edtHreAgrMtr_Visible = -1 ;
      edtHreAgrKgm_Visible = -1 ;
      edtHreAgrCli_Visible = -1 ;
      edtHreAgrNumC_Visible = -1 ;
      edtHreAgrCol_Visible = -1 ;
      edtHreAgrDsc_Visible = -1 ;
      edtHreAgrSer_Visible = -1 ;
      edtHreAgrNHdr_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "HistoricodeRecetas_AgrupacionTinte_WPGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic|Dynamic|||||" ;
      Ddo_grid_Includedatalist = "T|T|T|T|||||" ;
      Ddo_grid_Filterisrange = "||||T|T|T|T|T" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|1|2|3|4|5|6|7|8" ;
      Ddo_grid_Columnids = "8:HreAgrNHdr|9:HreAgrSer|10:HreAgrDsc|11:HreAgrCol|12:HreAgrNumC|13:HreAgrCli|14:HreAgrKgm|15:HreAgrMtr|16:HreAgrPie" ;
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
      Form.setCaption( httpContext.getMessage( "Hdrs Agrupadas (TINTE)", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV50Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV51HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV52HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV53HreBarpar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV54HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV63TFHreAgrNHdr',fld:'vTFHREAGRNHDR',pic:''},{av:'AV64TFHreAgrNHdr_Sel',fld:'vTFHREAGRNHDR_SEL',pic:''},{av:'AV36TFHreAgrSer',fld:'vTFHREAGRSER',pic:''},{av:'AV37TFHreAgrSer_Sel',fld:'vTFHREAGRSER_SEL',pic:''},{av:'AV38TFHreAgrDsc',fld:'vTFHREAGRDSC',pic:''},{av:'AV39TFHreAgrDsc_Sel',fld:'vTFHREAGRDSC_SEL',pic:''},{av:'AV40TFHreAgrCol',fld:'vTFHREAGRCOL',pic:''},{av:'AV41TFHreAgrCol_Sel',fld:'vTFHREAGRCOL_SEL',pic:''},{av:'AV42TFHreAgrNumC',fld:'vTFHREAGRNUMC',pic:'ZZZZZ9'},{av:'AV43TFHreAgrNumC_To',fld:'vTFHREAGRNUMC_TO',pic:'ZZZZZ9'},{av:'AV44TFHreAgrCli',fld:'vTFHREAGRCLI',pic:'ZZZZZ9'},{av:'AV45TFHreAgrCli_To',fld:'vTFHREAGRCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFHreAgrKgm',fld:'vTFHREAGRKGM',pic:'ZZZZZ9.99'},{av:'AV31TFHreAgrKgm_To',fld:'vTFHREAGRKGM_TO',pic:'ZZZZZ9.99'},{av:'AV32TFHreAgrMtr',fld:'vTFHREAGRMTR',pic:'ZZZZZ9.99'},{av:'AV33TFHreAgrMtr_To',fld:'vTFHREAGRMTR_TO',pic:'ZZZZZ9.99'},{av:'AV34TFHreAgrPie',fld:'vTFHREAGRPIE',pic:'ZZZ9'},{av:'AV35TFHreAgrPie_To',fld:'vTFHREAGRPIE_TO',pic:'ZZZ9'},{av:'AV89Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57TotHreAgrKgm',fld:'vTOTHREAGRKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV59TotHreAgrMtr',fld:'vTOTHREAGRMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV61TotHreAgrPie',fld:'vTOTHREAGRPIE',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4500HreAgrKgm',fld:'HREAGRKGM',pic:'ZZZZZ9.99'},{av:'A4501HreAgrMtr',fld:'HREAGRMTR',pic:'ZZZZZ9.99'},{av:'A4502HreAgrPie',fld:'HREAGRPIE',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtHreAgrNHdr_Visible',ctrl:'HREAGRNHDR',prop:'Visible'},{av:'edtHreAgrSer_Visible',ctrl:'HREAGRSER',prop:'Visible'},{av:'edtHreAgrDsc_Visible',ctrl:'HREAGRDSC',prop:'Visible'},{av:'edtHreAgrCol_Visible',ctrl:'HREAGRCOL',prop:'Visible'},{av:'edtHreAgrNumC_Visible',ctrl:'HREAGRNUMC',prop:'Visible'},{av:'edtHreAgrCli_Visible',ctrl:'HREAGRCLI',prop:'Visible'},{av:'edtHreAgrKgm_Visible',ctrl:'HREAGRKGM',prop:'Visible'},{av:'edtHreAgrMtr_Visible',ctrl:'HREAGRMTR',prop:'Visible'},{av:'edtHreAgrPie_Visible',ctrl:'HREAGRPIE',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV57TotHreAgrKgm',fld:'vTOTHREAGRKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV59TotHreAgrMtr',fld:'vTOTHREAGRMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV61TotHreAgrPie',fld:'vTOTHREAGRPIE',pic:'ZZZ9',hsh:true},{av:'AV58TotValueHreAgrKgm',fld:'vTOTVALUEHREAGRKGM',pic:''},{av:'AV60TotValueHreAgrMtr',fld:'vTOTVALUEHREAGRMTR',pic:''},{av:'AV62TotValueHreAgrPie',fld:'vTOTVALUEHREAGRPIE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121FY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV50Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV51HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV52HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV53HreBarpar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV54HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV63TFHreAgrNHdr',fld:'vTFHREAGRNHDR',pic:''},{av:'AV64TFHreAgrNHdr_Sel',fld:'vTFHREAGRNHDR_SEL',pic:''},{av:'AV36TFHreAgrSer',fld:'vTFHREAGRSER',pic:''},{av:'AV37TFHreAgrSer_Sel',fld:'vTFHREAGRSER_SEL',pic:''},{av:'AV38TFHreAgrDsc',fld:'vTFHREAGRDSC',pic:''},{av:'AV39TFHreAgrDsc_Sel',fld:'vTFHREAGRDSC_SEL',pic:''},{av:'AV40TFHreAgrCol',fld:'vTFHREAGRCOL',pic:''},{av:'AV41TFHreAgrCol_Sel',fld:'vTFHREAGRCOL_SEL',pic:''},{av:'AV42TFHreAgrNumC',fld:'vTFHREAGRNUMC',pic:'ZZZZZ9'},{av:'AV43TFHreAgrNumC_To',fld:'vTFHREAGRNUMC_TO',pic:'ZZZZZ9'},{av:'AV44TFHreAgrCli',fld:'vTFHREAGRCLI',pic:'ZZZZZ9'},{av:'AV45TFHreAgrCli_To',fld:'vTFHREAGRCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFHreAgrKgm',fld:'vTFHREAGRKGM',pic:'ZZZZZ9.99'},{av:'AV31TFHreAgrKgm_To',fld:'vTFHREAGRKGM_TO',pic:'ZZZZZ9.99'},{av:'AV32TFHreAgrMtr',fld:'vTFHREAGRMTR',pic:'ZZZZZ9.99'},{av:'AV33TFHreAgrMtr_To',fld:'vTFHREAGRMTR_TO',pic:'ZZZZZ9.99'},{av:'AV34TFHreAgrPie',fld:'vTFHREAGRPIE',pic:'ZZZ9'},{av:'AV35TFHreAgrPie_To',fld:'vTFHREAGRPIE_TO',pic:'ZZZ9'},{av:'AV89Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57TotHreAgrKgm',fld:'vTOTHREAGRKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV59TotHreAgrMtr',fld:'vTOTHREAGRMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV61TotHreAgrPie',fld:'vTOTHREAGRPIE',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131FY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV50Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV51HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV52HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV53HreBarpar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV54HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV63TFHreAgrNHdr',fld:'vTFHREAGRNHDR',pic:''},{av:'AV64TFHreAgrNHdr_Sel',fld:'vTFHREAGRNHDR_SEL',pic:''},{av:'AV36TFHreAgrSer',fld:'vTFHREAGRSER',pic:''},{av:'AV37TFHreAgrSer_Sel',fld:'vTFHREAGRSER_SEL',pic:''},{av:'AV38TFHreAgrDsc',fld:'vTFHREAGRDSC',pic:''},{av:'AV39TFHreAgrDsc_Sel',fld:'vTFHREAGRDSC_SEL',pic:''},{av:'AV40TFHreAgrCol',fld:'vTFHREAGRCOL',pic:''},{av:'AV41TFHreAgrCol_Sel',fld:'vTFHREAGRCOL_SEL',pic:''},{av:'AV42TFHreAgrNumC',fld:'vTFHREAGRNUMC',pic:'ZZZZZ9'},{av:'AV43TFHreAgrNumC_To',fld:'vTFHREAGRNUMC_TO',pic:'ZZZZZ9'},{av:'AV44TFHreAgrCli',fld:'vTFHREAGRCLI',pic:'ZZZZZ9'},{av:'AV45TFHreAgrCli_To',fld:'vTFHREAGRCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFHreAgrKgm',fld:'vTFHREAGRKGM',pic:'ZZZZZ9.99'},{av:'AV31TFHreAgrKgm_To',fld:'vTFHREAGRKGM_TO',pic:'ZZZZZ9.99'},{av:'AV32TFHreAgrMtr',fld:'vTFHREAGRMTR',pic:'ZZZZZ9.99'},{av:'AV33TFHreAgrMtr_To',fld:'vTFHREAGRMTR_TO',pic:'ZZZZZ9.99'},{av:'AV34TFHreAgrPie',fld:'vTFHREAGRPIE',pic:'ZZZ9'},{av:'AV35TFHreAgrPie_To',fld:'vTFHREAGRPIE_TO',pic:'ZZZ9'},{av:'AV89Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57TotHreAgrKgm',fld:'vTOTHREAGRKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV59TotHreAgrMtr',fld:'vTOTHREAGRMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV61TotHreAgrPie',fld:'vTOTHREAGRPIE',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141FY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV50Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV51HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV52HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV53HreBarpar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV54HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV63TFHreAgrNHdr',fld:'vTFHREAGRNHDR',pic:''},{av:'AV64TFHreAgrNHdr_Sel',fld:'vTFHREAGRNHDR_SEL',pic:''},{av:'AV36TFHreAgrSer',fld:'vTFHREAGRSER',pic:''},{av:'AV37TFHreAgrSer_Sel',fld:'vTFHREAGRSER_SEL',pic:''},{av:'AV38TFHreAgrDsc',fld:'vTFHREAGRDSC',pic:''},{av:'AV39TFHreAgrDsc_Sel',fld:'vTFHREAGRDSC_SEL',pic:''},{av:'AV40TFHreAgrCol',fld:'vTFHREAGRCOL',pic:''},{av:'AV41TFHreAgrCol_Sel',fld:'vTFHREAGRCOL_SEL',pic:''},{av:'AV42TFHreAgrNumC',fld:'vTFHREAGRNUMC',pic:'ZZZZZ9'},{av:'AV43TFHreAgrNumC_To',fld:'vTFHREAGRNUMC_TO',pic:'ZZZZZ9'},{av:'AV44TFHreAgrCli',fld:'vTFHREAGRCLI',pic:'ZZZZZ9'},{av:'AV45TFHreAgrCli_To',fld:'vTFHREAGRCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFHreAgrKgm',fld:'vTFHREAGRKGM',pic:'ZZZZZ9.99'},{av:'AV31TFHreAgrKgm_To',fld:'vTFHREAGRKGM_TO',pic:'ZZZZZ9.99'},{av:'AV32TFHreAgrMtr',fld:'vTFHREAGRMTR',pic:'ZZZZZ9.99'},{av:'AV33TFHreAgrMtr_To',fld:'vTFHREAGRMTR_TO',pic:'ZZZZZ9.99'},{av:'AV34TFHreAgrPie',fld:'vTFHREAGRPIE',pic:'ZZZ9'},{av:'AV35TFHreAgrPie_To',fld:'vTFHREAGRPIE_TO',pic:'ZZZ9'},{av:'AV89Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57TotHreAgrKgm',fld:'vTOTHREAGRKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV59TotHreAgrMtr',fld:'vTOTHREAGRMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV61TotHreAgrPie',fld:'vTOTHREAGRPIE',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV34TFHreAgrPie',fld:'vTFHREAGRPIE',pic:'ZZZ9'},{av:'AV35TFHreAgrPie_To',fld:'vTFHREAGRPIE_TO',pic:'ZZZ9'},{av:'AV32TFHreAgrMtr',fld:'vTFHREAGRMTR',pic:'ZZZZZ9.99'},{av:'AV33TFHreAgrMtr_To',fld:'vTFHREAGRMTR_TO',pic:'ZZZZZ9.99'},{av:'AV30TFHreAgrKgm',fld:'vTFHREAGRKGM',pic:'ZZZZZ9.99'},{av:'AV31TFHreAgrKgm_To',fld:'vTFHREAGRKGM_TO',pic:'ZZZZZ9.99'},{av:'AV44TFHreAgrCli',fld:'vTFHREAGRCLI',pic:'ZZZZZ9'},{av:'AV45TFHreAgrCli_To',fld:'vTFHREAGRCLI_TO',pic:'ZZZZZ9'},{av:'AV42TFHreAgrNumC',fld:'vTFHREAGRNUMC',pic:'ZZZZZ9'},{av:'AV43TFHreAgrNumC_To',fld:'vTFHREAGRNUMC_TO',pic:'ZZZZZ9'},{av:'AV40TFHreAgrCol',fld:'vTFHREAGRCOL',pic:''},{av:'AV41TFHreAgrCol_Sel',fld:'vTFHREAGRCOL_SEL',pic:''},{av:'AV38TFHreAgrDsc',fld:'vTFHREAGRDSC',pic:''},{av:'AV39TFHreAgrDsc_Sel',fld:'vTFHREAGRDSC_SEL',pic:''},{av:'AV36TFHreAgrSer',fld:'vTFHREAGRSER',pic:''},{av:'AV37TFHreAgrSer_Sel',fld:'vTFHREAGRSER_SEL',pic:''},{av:'AV63TFHreAgrNHdr',fld:'vTFHREAGRNHDR',pic:''},{av:'AV64TFHreAgrNHdr_Sel',fld:'vTFHREAGRNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e181FY2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151FY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV50Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV51HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV52HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV53HreBarpar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV54HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV63TFHreAgrNHdr',fld:'vTFHREAGRNHDR',pic:''},{av:'AV64TFHreAgrNHdr_Sel',fld:'vTFHREAGRNHDR_SEL',pic:''},{av:'AV36TFHreAgrSer',fld:'vTFHREAGRSER',pic:''},{av:'AV37TFHreAgrSer_Sel',fld:'vTFHREAGRSER_SEL',pic:''},{av:'AV38TFHreAgrDsc',fld:'vTFHREAGRDSC',pic:''},{av:'AV39TFHreAgrDsc_Sel',fld:'vTFHREAGRDSC_SEL',pic:''},{av:'AV40TFHreAgrCol',fld:'vTFHREAGRCOL',pic:''},{av:'AV41TFHreAgrCol_Sel',fld:'vTFHREAGRCOL_SEL',pic:''},{av:'AV42TFHreAgrNumC',fld:'vTFHREAGRNUMC',pic:'ZZZZZ9'},{av:'AV43TFHreAgrNumC_To',fld:'vTFHREAGRNUMC_TO',pic:'ZZZZZ9'},{av:'AV44TFHreAgrCli',fld:'vTFHREAGRCLI',pic:'ZZZZZ9'},{av:'AV45TFHreAgrCli_To',fld:'vTFHREAGRCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFHreAgrKgm',fld:'vTFHREAGRKGM',pic:'ZZZZZ9.99'},{av:'AV31TFHreAgrKgm_To',fld:'vTFHREAGRKGM_TO',pic:'ZZZZZ9.99'},{av:'AV32TFHreAgrMtr',fld:'vTFHREAGRMTR',pic:'ZZZZZ9.99'},{av:'AV33TFHreAgrMtr_To',fld:'vTFHREAGRMTR_TO',pic:'ZZZZZ9.99'},{av:'AV34TFHreAgrPie',fld:'vTFHREAGRPIE',pic:'ZZZ9'},{av:'AV35TFHreAgrPie_To',fld:'vTFHREAGRPIE_TO',pic:'ZZZ9'},{av:'AV89Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57TotHreAgrKgm',fld:'vTOTHREAGRKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV59TotHreAgrMtr',fld:'vTOTHREAGRMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV61TotHreAgrPie',fld:'vTOTHREAGRPIE',pic:'ZZZ9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4500HreAgrKgm',fld:'HREAGRKGM',pic:'ZZZZZ9.99'},{av:'A4501HreAgrMtr',fld:'HREAGRMTR',pic:'ZZZZZ9.99'},{av:'A4502HreAgrPie',fld:'HREAGRPIE',pic:'ZZZ9'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtHreAgrNHdr_Visible',ctrl:'HREAGRNHDR',prop:'Visible'},{av:'edtHreAgrSer_Visible',ctrl:'HREAGRSER',prop:'Visible'},{av:'edtHreAgrDsc_Visible',ctrl:'HREAGRDSC',prop:'Visible'},{av:'edtHreAgrCol_Visible',ctrl:'HREAGRCOL',prop:'Visible'},{av:'edtHreAgrNumC_Visible',ctrl:'HREAGRNUMC',prop:'Visible'},{av:'edtHreAgrCli_Visible',ctrl:'HREAGRCLI',prop:'Visible'},{av:'edtHreAgrKgm_Visible',ctrl:'HREAGRKGM',prop:'Visible'},{av:'edtHreAgrMtr_Visible',ctrl:'HREAGRMTR',prop:'Visible'},{av:'edtHreAgrPie_Visible',ctrl:'HREAGRPIE',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV57TotHreAgrKgm',fld:'vTOTHREAGRKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV59TotHreAgrMtr',fld:'vTOTHREAGRMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV61TotHreAgrPie',fld:'vTOTHREAGRPIE',pic:'ZZZ9',hsh:true},{av:'AV58TotValueHreAgrKgm',fld:'vTOTVALUEHREAGRKGM',pic:''},{av:'AV60TotValueHreAgrMtr',fld:'vTOTVALUEHREAGRMTR',pic:''},{av:'AV62TotValueHreAgrPie',fld:'vTOTVALUEHREAGRPIE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111FY2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV50Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV51HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV52HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV53HreBarpar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV54HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV63TFHreAgrNHdr',fld:'vTFHREAGRNHDR',pic:''},{av:'AV64TFHreAgrNHdr_Sel',fld:'vTFHREAGRNHDR_SEL',pic:''},{av:'AV36TFHreAgrSer',fld:'vTFHREAGRSER',pic:''},{av:'AV37TFHreAgrSer_Sel',fld:'vTFHREAGRSER_SEL',pic:''},{av:'AV38TFHreAgrDsc',fld:'vTFHREAGRDSC',pic:''},{av:'AV39TFHreAgrDsc_Sel',fld:'vTFHREAGRDSC_SEL',pic:''},{av:'AV40TFHreAgrCol',fld:'vTFHREAGRCOL',pic:''},{av:'AV41TFHreAgrCol_Sel',fld:'vTFHREAGRCOL_SEL',pic:''},{av:'AV42TFHreAgrNumC',fld:'vTFHREAGRNUMC',pic:'ZZZZZ9'},{av:'AV43TFHreAgrNumC_To',fld:'vTFHREAGRNUMC_TO',pic:'ZZZZZ9'},{av:'AV44TFHreAgrCli',fld:'vTFHREAGRCLI',pic:'ZZZZZ9'},{av:'AV45TFHreAgrCli_To',fld:'vTFHREAGRCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFHreAgrKgm',fld:'vTFHREAGRKGM',pic:'ZZZZZ9.99'},{av:'AV31TFHreAgrKgm_To',fld:'vTFHREAGRKGM_TO',pic:'ZZZZZ9.99'},{av:'AV32TFHreAgrMtr',fld:'vTFHREAGRMTR',pic:'ZZZZZ9.99'},{av:'AV33TFHreAgrMtr_To',fld:'vTFHREAGRMTR_TO',pic:'ZZZZZ9.99'},{av:'AV34TFHreAgrPie',fld:'vTFHREAGRPIE',pic:'ZZZ9'},{av:'AV35TFHreAgrPie_To',fld:'vTFHREAGRPIE_TO',pic:'ZZZ9'},{av:'AV89Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57TotHreAgrKgm',fld:'vTOTHREAGRKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV59TotHreAgrMtr',fld:'vTOTHREAGRMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV61TotHreAgrPie',fld:'vTOTHREAGRPIE',pic:'ZZZ9',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4500HreAgrKgm',fld:'HREAGRKGM',pic:'ZZZZZ9.99'},{av:'A4501HreAgrMtr',fld:'HREAGRMTR',pic:'ZZZZZ9.99'},{av:'A4502HreAgrPie',fld:'HREAGRPIE',pic:'ZZZ9'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV63TFHreAgrNHdr',fld:'vTFHREAGRNHDR',pic:''},{av:'AV64TFHreAgrNHdr_Sel',fld:'vTFHREAGRNHDR_SEL',pic:''},{av:'AV36TFHreAgrSer',fld:'vTFHREAGRSER',pic:''},{av:'AV37TFHreAgrSer_Sel',fld:'vTFHREAGRSER_SEL',pic:''},{av:'AV38TFHreAgrDsc',fld:'vTFHREAGRDSC',pic:''},{av:'AV39TFHreAgrDsc_Sel',fld:'vTFHREAGRDSC_SEL',pic:''},{av:'AV40TFHreAgrCol',fld:'vTFHREAGRCOL',pic:''},{av:'AV41TFHreAgrCol_Sel',fld:'vTFHREAGRCOL_SEL',pic:''},{av:'AV42TFHreAgrNumC',fld:'vTFHREAGRNUMC',pic:'ZZZZZ9'},{av:'AV43TFHreAgrNumC_To',fld:'vTFHREAGRNUMC_TO',pic:'ZZZZZ9'},{av:'AV44TFHreAgrCli',fld:'vTFHREAGRCLI',pic:'ZZZZZ9'},{av:'AV45TFHreAgrCli_To',fld:'vTFHREAGRCLI_TO',pic:'ZZZZZ9'},{av:'AV30TFHreAgrKgm',fld:'vTFHREAGRKGM',pic:'ZZZZZ9.99'},{av:'AV31TFHreAgrKgm_To',fld:'vTFHREAGRKGM_TO',pic:'ZZZZZ9.99'},{av:'AV32TFHreAgrMtr',fld:'vTFHREAGRMTR',pic:'ZZZZZ9.99'},{av:'AV33TFHreAgrMtr_To',fld:'vTFHREAGRMTR_TO',pic:'ZZZZZ9.99'},{av:'AV34TFHreAgrPie',fld:'vTFHREAGRPIE',pic:'ZZZ9'},{av:'AV35TFHreAgrPie_To',fld:'vTFHREAGRPIE_TO',pic:'ZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtHreAgrNHdr_Visible',ctrl:'HREAGRNHDR',prop:'Visible'},{av:'edtHreAgrSer_Visible',ctrl:'HREAGRSER',prop:'Visible'},{av:'edtHreAgrDsc_Visible',ctrl:'HREAGRDSC',prop:'Visible'},{av:'edtHreAgrCol_Visible',ctrl:'HREAGRCOL',prop:'Visible'},{av:'edtHreAgrNumC_Visible',ctrl:'HREAGRNUMC',prop:'Visible'},{av:'edtHreAgrCli_Visible',ctrl:'HREAGRCLI',prop:'Visible'},{av:'edtHreAgrKgm_Visible',ctrl:'HREAGRKGM',prop:'Visible'},{av:'edtHreAgrMtr_Visible',ctrl:'HREAGRMTR',prop:'Visible'},{av:'edtHreAgrPie_Visible',ctrl:'HREAGRPIE',prop:'Visible'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV57TotHreAgrKgm',fld:'vTOTHREAGRKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV59TotHreAgrMtr',fld:'vTOTHREAGRMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV61TotHreAgrPie',fld:'vTOTHREAGRPIE',pic:'ZZZ9',hsh:true},{av:'AV58TotValueHreAgrKgm',fld:'vTOTVALUEHREAGRKGM',pic:''},{av:'AV60TotValueHreAgrMtr',fld:'vTOTVALUEHREAGRMTR',pic:''},{av:'AV62TotValueHreAgrPie',fld:'vTOTVALUEHREAGRPIE',pic:''}]}");
      setEventMetadata("VALID_HREAGRCOD","{handler:'valid_Hreagrcod',iparms:[]");
      setEventMetadata("VALID_HREAGRCOD",",oparms:[]}");
      setEventMetadata("VALID_HREAGRREO","{handler:'valid_Hreagrreo',iparms:[]");
      setEventMetadata("VALID_HREAGRREO",",oparms:[]}");
      setEventMetadata("VALID_HREAGRPAR","{handler:'valid_Hreagrpar',iparms:[]");
      setEventMetadata("VALID_HREAGRPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hreagrpie',iparms:[]");
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
      wcpOAV50Emprcod = "" ;
      wcpOAV53HreBarpar = "" ;
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
      AV50Emprcod = "" ;
      AV53HreBarpar = "" ;
      AV15FilterFullText = "" ;
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV63TFHreAgrNHdr = "" ;
      AV64TFHreAgrNHdr_Sel = "" ;
      AV36TFHreAgrSer = "" ;
      AV37TFHreAgrSer_Sel = "" ;
      AV38TFHreAgrDsc = "" ;
      AV39TFHreAgrDsc_Sel = "" ;
      AV40TFHreAgrCol = "" ;
      AV41TFHreAgrCol_Sel = "" ;
      AV30TFHreAgrKgm = DecimalUtil.ZERO ;
      AV31TFHreAgrKgm_To = DecimalUtil.ZERO ;
      AV32TFHreAgrMtr = DecimalUtil.ZERO ;
      AV33TFHreAgrMtr_To = DecimalUtil.ZERO ;
      AV89Pgmname = "" ;
      AV57TotHreAgrKgm = DecimalUtil.ZERO ;
      AV59TotHreAgrMtr = DecimalUtil.ZERO ;
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
      A4499HreAgrPar = "" ;
      A13894HreAgrNHdr = "" ;
      A4504HreAgrSer = "" ;
      A4505HreAgrDsc = "" ;
      A4506HreAgrCol = "" ;
      A4500HreAgrKgm = DecimalUtil.ZERO ;
      A4501HreAgrMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = "" ;
      lV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = "" ;
      lV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = "" ;
      lV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = "" ;
      lV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = "" ;
      AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext = "" ;
      AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel = "" ;
      AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr = "" ;
      AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel = "" ;
      AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser = "" ;
      AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel = "" ;
      AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc = "" ;
      AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel = "" ;
      AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol = "" ;
      AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm = DecimalUtil.ZERO ;
      AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to = DecimalUtil.ZERO ;
      AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr = DecimalUtil.ZERO ;
      AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to = DecimalUtil.ZERO ;
      H01FY2_A4502HreAgrPie = new short[1] ;
      H01FY2_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FY2_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FY2_A4503HreAgrCli = new int[1] ;
      H01FY2_A4507HreAgrNumC = new int[1] ;
      H01FY2_A4506HreAgrCol = new String[] {""} ;
      H01FY2_A4505HreAgrDsc = new String[] {""} ;
      H01FY2_A4504HreAgrSer = new String[] {""} ;
      H01FY2_A4495HreNumCie = new byte[1] ;
      H01FY2_A4494HreBarPar = new String[] {""} ;
      H01FY2_A4493HreBarReo = new byte[1] ;
      H01FY2_A4492HreBarCod = new int[1] ;
      H01FY2_A396EmprCod = new String[] {""} ;
      H01FY2_A4499HreAgrPar = new String[] {""} ;
      H01FY2_A4498HreAgrReo = new byte[1] ;
      H01FY2_A4497HreAgrCod = new int[1] ;
      H01FY3_AGRID_nRecordCount = new long[1] ;
      AV58TotValueHreAgrKgm = "" ;
      AV60TotValueHreAgrMtr = "" ;
      AV62TotValueHreAgrPie = "" ;
      AV67Station = "" ;
      AV68Emprnom = "" ;
      AV69Usurcod = "" ;
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
      H01FY4_A4495HreNumCie = new byte[1] ;
      H01FY4_A4494HreBarPar = new String[] {""} ;
      H01FY4_A4493HreBarReo = new byte[1] ;
      H01FY4_A4492HreBarCod = new int[1] ;
      H01FY4_A396EmprCod = new String[] {""} ;
      H01FY4_A4502HreAgrPie = new short[1] ;
      H01FY4_A4501HreAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FY4_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FY4_A4503HreAgrCli = new int[1] ;
      H01FY4_A4507HreAgrNumC = new int[1] ;
      H01FY4_A4506HreAgrCol = new String[] {""} ;
      H01FY4_A4505HreAgrDsc = new String[] {""} ;
      H01FY4_A4504HreAgrSer = new String[] {""} ;
      H01FY4_A4499HreAgrPar = new String[] {""} ;
      H01FY4_A4498HreAgrReo = new byte[1] ;
      H01FY4_A4497HreAgrCod = new int[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.historicoderecetas_agrupaciontinte_wp__default(),
         new Object[] {
             new Object[] {
            H01FY2_A4502HreAgrPie, H01FY2_A4501HreAgrMtr, H01FY2_A4500HreAgrKgm, H01FY2_A4503HreAgrCli, H01FY2_A4507HreAgrNumC, H01FY2_A4506HreAgrCol, H01FY2_A4505HreAgrDsc, H01FY2_A4504HreAgrSer, H01FY2_A4495HreNumCie, H01FY2_A4494HreBarPar,
            H01FY2_A4493HreBarReo, H01FY2_A4492HreBarCod, H01FY2_A396EmprCod, H01FY2_A4499HreAgrPar, H01FY2_A4498HreAgrReo, H01FY2_A4497HreAgrCod
            }
            , new Object[] {
            H01FY3_AGRID_nRecordCount
            }
            , new Object[] {
            H01FY4_A4495HreNumCie, H01FY4_A4494HreBarPar, H01FY4_A4493HreBarReo, H01FY4_A4492HreBarCod, H01FY4_A396EmprCod, H01FY4_A4502HreAgrPie, H01FY4_A4501HreAgrMtr, H01FY4_A4500HreAgrKgm, H01FY4_A4503HreAgrCli, H01FY4_A4507HreAgrNumC,
            H01FY4_A4506HreAgrCol, H01FY4_A4505HreAgrDsc, H01FY4_A4504HreAgrSer, H01FY4_A4499HreAgrPar, H01FY4_A4498HreAgrReo, H01FY4_A4497HreAgrCod
            }
         }
      );
      AV89Pgmname = "HistoricodeRecetas_AgrupacionTinte_WP" ;
      /* GeneXus formulas. */
      AV89Pgmname = "HistoricodeRecetas_AgrupacionTinte_WP" ;
      Gx_err = (short)(0) ;
      edtavTotvaluehreagrkgm_Enabled = 0 ;
      edtavTotvaluehreagrmtr_Enabled = 0 ;
      edtavTotvaluehreagrpie_Enabled = 0 ;
   }

   private byte wcpOAV52HreBarReo ;
   private byte wcpOAV54HreNumCie ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV52HreBarReo ;
   private byte AV54HreNumCie ;
   private byte AV23ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4498HreAgrReo ;
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
   private short AV34TFHreAgrPie ;
   private short AV35TFHreAgrPie_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A4502HreAgrPie ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie ;
   private short AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to ;
   private int wcpOAV51HreBarCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_37 ;
   private int AV51HreBarCod ;
   private int nGXsfl_37_idx=1 ;
   private int AV42TFHreAgrNumC ;
   private int AV43TFHreAgrNumC_To ;
   private int AV44TFHreAgrCli ;
   private int AV45TFHreAgrCli_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A4492HreBarCod ;
   private int A4497HreAgrCod ;
   private int A4507HreAgrNumC ;
   private int A4503HreAgrCli ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluehreagrkgm_Enabled ;
   private int edtavTotvaluehreagrmtr_Enabled ;
   private int edtavTotvaluehreagrpie_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc ;
   private int AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to ;
   private int AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli ;
   private int AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to ;
   private int edtHreAgrNHdr_Visible ;
   private int edtHreAgrSer_Visible ;
   private int edtHreAgrDsc_Visible ;
   private int edtHreAgrCol_Visible ;
   private int edtHreAgrNumC_Visible ;
   private int edtHreAgrCli_Visible ;
   private int edtHreAgrKgm_Visible ;
   private int edtHreAgrMtr_Visible ;
   private int edtHreAgrPie_Visible ;
   private int AV47PageToGo ;
   private int AV90GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV61TotHreAgrPie ;
   private long AV48GridCurrentPage ;
   private long AV49GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV30TFHreAgrKgm ;
   private java.math.BigDecimal AV31TFHreAgrKgm_To ;
   private java.math.BigDecimal AV32TFHreAgrMtr ;
   private java.math.BigDecimal AV33TFHreAgrMtr_To ;
   private java.math.BigDecimal AV57TotHreAgrKgm ;
   private java.math.BigDecimal AV59TotHreAgrMtr ;
   private java.math.BigDecimal A4500HreAgrKgm ;
   private java.math.BigDecimal A4501HreAgrMtr ;
   private java.math.BigDecimal AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm ;
   private java.math.BigDecimal AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to ;
   private java.math.BigDecimal AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr ;
   private java.math.BigDecimal AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to ;
   private String wcpOAV50Emprcod ;
   private String wcpOAV53HreBarpar ;
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
   private String AV50Emprcod ;
   private String AV53HreBarpar ;
   private String sGXsfl_37_idx="0001" ;
   private String AV63TFHreAgrNHdr ;
   private String AV64TFHreAgrNHdr_Sel ;
   private String AV36TFHreAgrSer ;
   private String AV37TFHreAgrSer_Sel ;
   private String AV38TFHreAgrDsc ;
   private String AV39TFHreAgrDsc_Sel ;
   private String AV40TFHreAgrCol ;
   private String AV41TFHreAgrCol_Sel ;
   private String AV89Pgmname ;
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
   private String edtHreAgrCod_Internalname ;
   private String edtHreAgrReo_Internalname ;
   private String A4499HreAgrPar ;
   private String edtHreAgrPar_Internalname ;
   private String A13894HreAgrNHdr ;
   private String edtHreAgrNHdr_Internalname ;
   private String A4504HreAgrSer ;
   private String edtHreAgrSer_Internalname ;
   private String A4505HreAgrDsc ;
   private String edtHreAgrDsc_Internalname ;
   private String A4506HreAgrCol ;
   private String edtHreAgrCol_Internalname ;
   private String edtHreAgrNumC_Internalname ;
   private String edtHreAgrCli_Internalname ;
   private String edtHreAgrKgm_Internalname ;
   private String edtHreAgrMtr_Internalname ;
   private String edtHreAgrPie_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavTotvaluehreagrkgm_Internalname ;
   private String edtavTotvaluehreagrmtr_Internalname ;
   private String edtavTotvaluehreagrpie_Internalname ;
   private String scmdbuf ;
   private String lV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ;
   private String lV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ;
   private String lV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ;
   private String lV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ;
   private String AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel ;
   private String AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ;
   private String AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel ;
   private String AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ;
   private String AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel ;
   private String AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ;
   private String AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel ;
   private String AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ;
   private String AV67Station ;
   private String AV68Emprnom ;
   private String AV69Usurcod ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluehreagrkgm_Jsonclick ;
   private String edtavTotvaluehreagrmtr_Jsonclick ;
   private String edtavTotvaluehreagrpie_Jsonclick ;
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
   private String edtHreAgrCod_Jsonclick ;
   private String edtHreAgrReo_Jsonclick ;
   private String edtHreAgrPar_Jsonclick ;
   private String edtHreAgrNHdr_Jsonclick ;
   private String edtHreAgrSer_Jsonclick ;
   private String edtHreAgrDsc_Jsonclick ;
   private String edtHreAgrCol_Jsonclick ;
   private String edtHreAgrNumC_Jsonclick ;
   private String edtHreAgrCli_Jsonclick ;
   private String edtHreAgrKgm_Jsonclick ;
   private String edtHreAgrMtr_Jsonclick ;
   private String edtHreAgrPie_Jsonclick ;
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
   private boolean bGXsfl_37_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV16ColumnsSelectorXML ;
   private String AV22ManageFiltersXml ;
   private String AV17UserCustomValue ;
   private String AV15FilterFullText ;
   private String lV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ;
   private String AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ;
   private String AV58TotValueHreAgrKgm ;
   private String AV60TotValueHreAgrMtr ;
   private String AV62TotValueHreAgrPie ;
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
   private short[] H01FY2_A4502HreAgrPie ;
   private java.math.BigDecimal[] H01FY2_A4501HreAgrMtr ;
   private java.math.BigDecimal[] H01FY2_A4500HreAgrKgm ;
   private int[] H01FY2_A4503HreAgrCli ;
   private int[] H01FY2_A4507HreAgrNumC ;
   private String[] H01FY2_A4506HreAgrCol ;
   private String[] H01FY2_A4505HreAgrDsc ;
   private String[] H01FY2_A4504HreAgrSer ;
   private byte[] H01FY2_A4495HreNumCie ;
   private String[] H01FY2_A4494HreBarPar ;
   private byte[] H01FY2_A4493HreBarReo ;
   private int[] H01FY2_A4492HreBarCod ;
   private String[] H01FY2_A396EmprCod ;
   private String[] H01FY2_A4499HreAgrPar ;
   private byte[] H01FY2_A4498HreAgrReo ;
   private int[] H01FY2_A4497HreAgrCod ;
   private long[] H01FY3_AGRID_nRecordCount ;
   private byte[] H01FY4_A4495HreNumCie ;
   private String[] H01FY4_A4494HreBarPar ;
   private byte[] H01FY4_A4493HreBarReo ;
   private int[] H01FY4_A4492HreBarCod ;
   private String[] H01FY4_A396EmprCod ;
   private short[] H01FY4_A4502HreAgrPie ;
   private java.math.BigDecimal[] H01FY4_A4501HreAgrMtr ;
   private java.math.BigDecimal[] H01FY4_A4500HreAgrKgm ;
   private int[] H01FY4_A4503HreAgrCli ;
   private int[] H01FY4_A4507HreAgrNumC ;
   private String[] H01FY4_A4506HreAgrCol ;
   private String[] H01FY4_A4505HreAgrDsc ;
   private String[] H01FY4_A4504HreAgrSer ;
   private String[] H01FY4_A4499HreAgrPar ;
   private byte[] H01FY4_A4498HreAgrReo ;
   private int[] H01FY4_A4497HreAgrCod ;
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

final  class historicoderecetas_agrupaciontinte_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01FY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ,
                                          String AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel ,
                                          String AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ,
                                          String AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel ,
                                          String AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ,
                                          String AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel ,
                                          String AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ,
                                          String AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel ,
                                          String AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ,
                                          int AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc ,
                                          int AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to ,
                                          int AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli ,
                                          int AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to ,
                                          java.math.BigDecimal AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm ,
                                          java.math.BigDecimal AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to ,
                                          java.math.BigDecimal AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr ,
                                          java.math.BigDecimal AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to ,
                                          short AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie ,
                                          short AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to ,
                                          int A4497HreAgrCod ,
                                          byte A4498HreAgrReo ,
                                          String A4499HreAgrPar ,
                                          String A4504HreAgrSer ,
                                          String A4505HreAgrDsc ,
                                          String A4506HreAgrCol ,
                                          int A4507HreAgrNumC ,
                                          int A4503HreAgrCli ,
                                          java.math.BigDecimal A4500HreAgrKgm ,
                                          java.math.BigDecimal A4501HreAgrMtr ,
                                          short A4502HreAgrPie ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV50Emprcod ,
                                          int AV51HreBarCod ,
                                          byte AV52HreBarReo ,
                                          String AV53HreBarpar ,
                                          byte AV54HreNumCie ,
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
      sSelectString = " HreAgrPie, HreAgrMtr, HreAgrKgm, HreAgrCli, HreAgrNumC, HreAgrCol, HreAgrDsc, HreAgrSer, HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreAgrPar, HreAgrReo," ;
      sSelectString += " HreAgrCod" ;
      sFromString = " FROM TXPHISRAG" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ?)");
      if ( ! (GXutil.strcmp("", AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar) like '%' || UPPER(?)) or ( UPPER(HreAgrSer) like '%' || UPPER(?)) or ( UPPER(HreAgrDsc) like '%' || UPPER(?)) or ( UPPER(HreAgrCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreAgrNumC,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrCli,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrPie,'9990'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel)==0) && ( ! (GXutil.strcmp("", AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrSer = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrDsc = ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel)==0) && ( ! (GXutil.strcmp("", AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrCol = ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (0==AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc) )
      {
         addWhere(sWhereString, "(HreAgrNumC >= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (0==AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to) )
      {
         addWhere(sWhereString, "(HreAgrNumC <= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (0==AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli) )
      {
         addWhere(sWhereString, "(HreAgrCli >= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (0==AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to) )
      {
         addWhere(sWhereString, "(HreAgrCli <= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm >= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm <= ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr <= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (0==AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie) )
      {
         addWhere(sWhereString, "(HreAgrPie >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (0==AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to) )
      {
         addWhere(sWhereString, "(HreAgrPie <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY HreAgrSer" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreAgrSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY HreAgrDsc" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreAgrDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY HreAgrCol" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreAgrCol DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY HreAgrNumC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreAgrNumC DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY HreAgrCli" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreAgrCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY HreAgrKgm" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreAgrKgm DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY HreAgrMtr" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreAgrMtr DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY HreAgrPie" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreAgrPie DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H01FY3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ,
                                          String AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel ,
                                          String AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ,
                                          String AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel ,
                                          String AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ,
                                          String AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel ,
                                          String AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ,
                                          String AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel ,
                                          String AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ,
                                          int AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc ,
                                          int AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to ,
                                          int AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli ,
                                          int AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to ,
                                          java.math.BigDecimal AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm ,
                                          java.math.BigDecimal AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to ,
                                          java.math.BigDecimal AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr ,
                                          java.math.BigDecimal AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to ,
                                          short AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie ,
                                          short AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to ,
                                          int A4497HreAgrCod ,
                                          byte A4498HreAgrReo ,
                                          String A4499HreAgrPar ,
                                          String A4504HreAgrSer ,
                                          String A4505HreAgrDsc ,
                                          String A4506HreAgrCol ,
                                          int A4507HreAgrNumC ,
                                          int A4503HreAgrCli ,
                                          java.math.BigDecimal A4500HreAgrKgm ,
                                          java.math.BigDecimal A4501HreAgrMtr ,
                                          short A4502HreAgrPie ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV50Emprcod ,
                                          int AV51HreBarCod ,
                                          byte AV52HreBarReo ,
                                          String AV53HreBarpar ,
                                          byte AV54HreNumCie ,
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
      scmdbuf = "SELECT COUNT(*) FROM TXPHISRAG" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ?)");
      if ( ! (GXutil.strcmp("", AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar) like '%' || UPPER(?)) or ( UPPER(HreAgrSer) like '%' || UPPER(?)) or ( UPPER(HreAgrDsc) like '%' || UPPER(?)) or ( UPPER(HreAgrCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreAgrNumC,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrCli,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrPie,'9990'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar = ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel)==0) && ( ! (GXutil.strcmp("", AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrSer = ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrDsc = ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel)==0) && ( ! (GXutil.strcmp("", AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrCol = ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (0==AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc) )
      {
         addWhere(sWhereString, "(HreAgrNumC >= ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (0==AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to) )
      {
         addWhere(sWhereString, "(HreAgrNumC <= ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (0==AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli) )
      {
         addWhere(sWhereString, "(HreAgrCli >= ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! (0==AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to) )
      {
         addWhere(sWhereString, "(HreAgrCli <= ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm >= ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm <= ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr >= ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr <= ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (0==AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie) )
      {
         addWhere(sWhereString, "(HreAgrPie >= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (0==AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to) )
      {
         addWhere(sWhereString, "(HreAgrPie <= ?)");
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

   protected Object[] conditional_H01FY4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext ,
                                          String AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel ,
                                          String AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr ,
                                          String AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel ,
                                          String AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser ,
                                          String AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel ,
                                          String AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc ,
                                          String AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel ,
                                          String AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol ,
                                          int AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc ,
                                          int AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to ,
                                          int AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli ,
                                          int AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to ,
                                          java.math.BigDecimal AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm ,
                                          java.math.BigDecimal AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to ,
                                          java.math.BigDecimal AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr ,
                                          java.math.BigDecimal AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to ,
                                          short AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie ,
                                          short AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to ,
                                          int A4497HreAgrCod ,
                                          byte A4498HreAgrReo ,
                                          String A4499HreAgrPar ,
                                          String A4504HreAgrSer ,
                                          String A4505HreAgrDsc ,
                                          String A4506HreAgrCol ,
                                          int A4507HreAgrNumC ,
                                          int A4503HreAgrCli ,
                                          java.math.BigDecimal A4500HreAgrKgm ,
                                          java.math.BigDecimal A4501HreAgrMtr ,
                                          short A4502HreAgrPie ,
                                          String AV50Emprcod ,
                                          int AV51HreBarCod ,
                                          byte AV52HreBarReo ,
                                          String AV53HreBarpar ,
                                          byte AV54HreNumCie ,
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
      scmdbuf = "SELECT HreNumCie, HreBarPar, HreBarReo, HreBarCod, EmprCod, HreAgrPie, HreAgrMtr, HreAgrKgm, HreAgrCli, HreAgrNumC, HreAgrCol, HreAgrDsc, HreAgrSer, HreAgrPar, HreAgrReo," ;
      scmdbuf += " HreAgrCod FROM TXPHISRAG" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ?)");
      if ( ! (GXutil.strcmp("", AV70Historicoderecetas_agrupaciontinte_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar) like '%' || UPPER(?)) or ( UPPER(HreAgrSer) like '%' || UPPER(?)) or ( UPPER(HreAgrDsc) like '%' || UPPER(?)) or ( UPPER(HreAgrCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreAgrNumC,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrCli,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreAgrPie,'9990'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV71Historicoderecetas_agrupaciontinte_wpds_2_tfhreagrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Historicoderecetas_agrupaciontinte_wpds_3_tfhreagrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(HreAgrCod,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(HreAgrReo,'90'), 2) || HreAgrPar = ?)");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel)==0) && ( ! (GXutil.strcmp("", AV73Historicoderecetas_agrupaciontinte_wpds_4_tfhreagrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Historicoderecetas_agrupaciontinte_wpds_5_tfhreagrser_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrSer = ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Historicoderecetas_agrupaciontinte_wpds_6_tfhreagrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Historicoderecetas_agrupaciontinte_wpds_7_tfhreagrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrDsc = ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel)==0) && ( ! (GXutil.strcmp("", AV77Historicoderecetas_agrupaciontinte_wpds_8_tfhreagrcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreAgrCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Historicoderecetas_agrupaciontinte_wpds_9_tfhreagrcol_sel)==0) )
      {
         addWhere(sWhereString, "(HreAgrCol = ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (0==AV79Historicoderecetas_agrupaciontinte_wpds_10_tfhreagrnumc) )
      {
         addWhere(sWhereString, "(HreAgrNumC >= ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (0==AV80Historicoderecetas_agrupaciontinte_wpds_11_tfhreagrnumc_to) )
      {
         addWhere(sWhereString, "(HreAgrNumC <= ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! (0==AV81Historicoderecetas_agrupaciontinte_wpds_12_tfhreagrcli) )
      {
         addWhere(sWhereString, "(HreAgrCli >= ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! (0==AV82Historicoderecetas_agrupaciontinte_wpds_13_tfhreagrcli_to) )
      {
         addWhere(sWhereString, "(HreAgrCli <= ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Historicoderecetas_agrupaciontinte_wpds_14_tfhreagrkgm)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm >= ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Historicoderecetas_agrupaciontinte_wpds_15_tfhreagrkgm_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrKgm <= ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Historicoderecetas_agrupaciontinte_wpds_16_tfhreagrmtr)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr >= ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Historicoderecetas_agrupaciontinte_wpds_17_tfhreagrmtr_to)==0) )
      {
         addWhere(sWhereString, "(HreAgrMtr <= ?)");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (0==AV87Historicoderecetas_agrupaciontinte_wpds_18_tfhreagrpie) )
      {
         addWhere(sWhereString, "(HreAgrPie >= ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (0==AV88Historicoderecetas_agrupaciontinte_wpds_19_tfhreagrpie_to) )
      {
         addWhere(sWhereString, "(HreAgrPie <= ?)");
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
                  return conditional_H01FY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() );
            case 1 :
                  return conditional_H01FY3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() );
            case 2 :
                  return conditional_H01FY4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01FY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FY3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FY4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((String[]) buf[12])[0] = rslt.getString(13, 16);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
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
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
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
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
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
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               return;
      }
   }

}

