package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tarticu_ww_impl extends GXDataArea
{
   public tarticu_ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tarticu_ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarticu_ww_impl.class ));
   }

   public tarticu_ww_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      chkArtActivo = UIFactory.getCheckbox(this);
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
      nRC_GXsfl_45 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_45"))) ;
      nGXsfl_45_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_45_idx"))) ;
      sGXsfl_45_idx = httpContext.GetPar( "sGXsfl_45_idx") ;
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
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV29ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV24ColumnsSelector);
      AV30TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV31TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV32TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV33TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV34TFArtCod = httpContext.GetPar( "TFArtCod") ;
      AV35TFArtCod_Sel = httpContext.GetPar( "TFArtCod_Sel") ;
      AV36TFArtDsc = httpContext.GetPar( "TFArtDsc") ;
      AV37TFArtDsc_Sel = httpContext.GetPar( "TFArtDsc_Sel") ;
      AV38TFTipArtCod = (short)(GXutil.lval( httpContext.GetPar( "TFTipArtCod"))) ;
      AV39TFTipArtCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFTipArtCod_To"))) ;
      AV40TFTipArtDsc = httpContext.GetPar( "TFTipArtDsc") ;
      AV41TFTipArtDsc_Sel = httpContext.GetPar( "TFTipArtDsc_Sel") ;
      AV42TFArtPml = (short)(GXutil.lval( httpContext.GetPar( "TFArtPml"))) ;
      AV43TFArtPml_To = (short)(GXutil.lval( httpContext.GetPar( "TFArtPml_To"))) ;
      AV44TFArtGraAca = (short)(GXutil.lval( httpContext.GetPar( "TFArtGraAca"))) ;
      AV45TFArtGraAca_To = (short)(GXutil.lval( httpContext.GetPar( "TFArtGraAca_To"))) ;
      AV46TFArtRen = CommonUtil.decimalVal( httpContext.GetPar( "TFArtRen"), ".") ;
      AV47TFArtRen_To = CommonUtil.decimalVal( httpContext.GetPar( "TFArtRen_To"), ".") ;
      AV48TFArtAcaMin = (short)(GXutil.lval( httpContext.GetPar( "TFArtAcaMin"))) ;
      AV49TFArtAcaMin_To = (short)(GXutil.lval( httpContext.GetPar( "TFArtAcaMin_To"))) ;
      AV50TFArtComer = httpContext.GetPar( "TFArtComer") ;
      AV51TFArtComer_Sel = httpContext.GetPar( "TFArtComer_Sel") ;
      AV63TFArtActivo_Sel = httpContext.GetPar( "TFArtActivo_Sel") ;
      AV66Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV58EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV34TFArtCod, AV35TFArtCod_Sel, AV36TFArtDsc, AV37TFArtDsc_Sel, AV38TFTipArtCod, AV39TFTipArtCod_To, AV40TFTipArtDsc, AV41TFTipArtDsc_Sel, AV42TFArtPml, AV43TFArtPml_To, AV44TFArtGraAca, AV45TFArtGraAca_To, AV46TFArtRen, AV47TFArtRen_To, AV48TFArtAcaMin, AV49TFArtAcaMin_To, AV50TFArtComer, AV51TFArtComer_Sel, AV63TFArtActivo_Sel, AV66Pgmname, AV12OrderedBy, AV13OrderedDsc, AV58EmprCod) ;
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
      pa2652( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2652( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tarticu_ww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Tarticu_WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV66Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tarticu_ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV54GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV55GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV52DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV52DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV29ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV30TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV31TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV32TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV33TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTCOD", GXutil.rtrim( AV34TFArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTCOD_SEL", GXutil.rtrim( AV35TFArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTDSC", GXutil.rtrim( AV36TFArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTDSC_SEL", GXutil.rtrim( AV37TFArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPARTCOD", GXutil.ltrim( localUtil.ntoc( AV38TFTipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPARTCOD_TO", GXutil.ltrim( localUtil.ntoc( AV39TFTipArtCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPARTDSC", GXutil.rtrim( AV40TFTipArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPARTDSC_SEL", GXutil.rtrim( AV41TFTipArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTPML", GXutil.ltrim( localUtil.ntoc( AV42TFArtPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTPML_TO", GXutil.ltrim( localUtil.ntoc( AV43TFArtPml_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTGRAACA", GXutil.ltrim( localUtil.ntoc( AV44TFArtGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTGRAACA_TO", GXutil.ltrim( localUtil.ntoc( AV45TFArtGraAca_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTREN", GXutil.ltrim( localUtil.ntoc( AV46TFArtRen, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTREN_TO", GXutil.ltrim( localUtil.ntoc( AV47TFArtRen_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTACAMIN", GXutil.ltrim( localUtil.ntoc( AV48TFArtAcaMin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTACAMIN_TO", GXutil.ltrim( localUtil.ntoc( AV49TFArtAcaMin_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTCOMER", GXutil.rtrim( AV50TFArtComer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTCOMER_SEL", GXutil.rtrim( AV51TFArtComer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFARTACTIVO_SEL", GXutil.rtrim( AV63TFArtActivo_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV58EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58EmprCod, "@!"))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
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
         we2652( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2652( ) ;
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
      return formatLink("app.tarticu_ww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Tarticu_WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Ficha Tecnica (Articulo)", "") ;
   }

   public void wb2650( )
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
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tarticu_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tarticu_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tarticu_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tarticu_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tarticu_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_2652( true) ;
      }
      else
      {
         wb_table1_27_2652( false) ;
      }
      return  ;
   }

   public void wb_table1_27_2652e( boolean wbgen )
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
         startgridcontrol45( ) ;
      }
      if ( wbEnd == 45 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_45 = (int)(nGXsfl_45_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV54GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV55GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV66Pgmname), GXutil.rtrim( localUtil.format( AV66Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tarticu_WW.htm");
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
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV24ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 45 )
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

   public void start2652( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Ficha Tecnica (Articulo)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2650( ) ;
   }

   public void ws2652( )
   {
      start2652( ) ;
      evt2652( ) ;
   }

   public void evt2652( )
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
                           e112652 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122652 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132652 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142652 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152652 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e162652 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e172652 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e182652 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e192652 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_45_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_452( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV56GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridActions), 4, 0));
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
                           A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
                           n69ArtDsc = false ;
                           A829TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipArtCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A830TipArtDsc = httpContext.cgiGet( edtTipArtDsc_Internalname) ;
                           n830TipArtDsc = false ;
                           A1148ArtPml = (short)(localUtil.ctol( httpContext.cgiGet( edtArtPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1148ArtPml = false ;
                           A1903ArtGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtArtGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1903ArtGraAca = false ;
                           A95ArtRen = localUtil.ctond( httpContext.cgiGet( edtArtRen_Internalname)) ;
                           n95ArtRen = false ;
                           A63ArtAcaMin = (short)(localUtil.ctol( httpContext.cgiGet( edtArtAcaMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n63ArtAcaMin = false ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNproc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNproc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNPROC");
                              GX_FocusControl = edtavNproc_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV16NProc = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavNproc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16NProc), 4, 0));
                           }
                           else
                           {
                              AV16NProc = (short)(localUtil.ctol( httpContext.cgiGet( edtavNproc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavNproc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16NProc), 4, 0));
                           }
                           AV17ProCods = httpContext.cgiGet( edtavProcods_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavProcods_Internalname, AV17ProCods);
                           AV18ProDscs = httpContext.cgiGet( edtavProdscs_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavProdscs_Internalname, AV18ProDscs);
                           AV19ArtProCod = httpContext.cgiGet( edtavArtprocod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavArtprocod_Internalname, AV19ArtProCod);
                           A5741ArtComer = httpContext.cgiGet( edtArtComer_Internalname) ;
                           n5741ArtComer = false ;
                           A14295ArtActivo = ((GXutil.strcmp(httpContext.cgiGet( chkArtActivo.getInternalname()), "S")==0) ? "S" : "N") ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e202652 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e212652 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e222652 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e232652 ();
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

   public void we2652( )
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

   public void pa2652( )
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
      subsflControlProps_452( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         sendrow_452( ) ;
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 String A396EmprCod ,
                                 byte AV29ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ,
                                 int AV30TFCliCod ,
                                 int AV31TFCliCod_To ,
                                 String AV32TFCliNom ,
                                 String AV33TFCliNom_Sel ,
                                 String AV34TFArtCod ,
                                 String AV35TFArtCod_Sel ,
                                 String AV36TFArtDsc ,
                                 String AV37TFArtDsc_Sel ,
                                 short AV38TFTipArtCod ,
                                 short AV39TFTipArtCod_To ,
                                 String AV40TFTipArtDsc ,
                                 String AV41TFTipArtDsc_Sel ,
                                 short AV42TFArtPml ,
                                 short AV43TFArtPml_To ,
                                 short AV44TFArtGraAca ,
                                 short AV45TFArtGraAca_To ,
                                 java.math.BigDecimal AV46TFArtRen ,
                                 java.math.BigDecimal AV47TFArtRen_To ,
                                 short AV48TFArtAcaMin ,
                                 short AV49TFArtAcaMin_To ,
                                 String AV50TFArtComer ,
                                 String AV51TFArtComer_Sel ,
                                 String AV63TFArtActivo_Sel ,
                                 String AV66Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV58EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e212652 ();
      GRID_nCurrentRecord = 0 ;
      rf2652( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Tarticu_WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV66Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tarticu_ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A65ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTCOD", GXutil.rtrim( A65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A69ArtDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTDSC", GXutil.rtrim( A69ArtDsc));
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
      rf2652( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV66Pgmname = "Tarticu_WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Pgmname", AV66Pgmname);
      Gx_err = (short)(0) ;
      edtavNproc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNproc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNproc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavProcods_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcods_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcods_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavProdscs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdscs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdscs_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavArtprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtprocod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2652( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e212652 ();
      nGXsfl_45_idx = 1 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_452( ) ;
      bGXsfl_45_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_452( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV67Tarticu_wwds_1_filterfulltext ,
                                              Integer.valueOf(AV68Tarticu_wwds_2_tfclicod) ,
                                              Integer.valueOf(AV69Tarticu_wwds_3_tfclicod_to) ,
                                              AV71Tarticu_wwds_5_tfclinom_sel ,
                                              AV70Tarticu_wwds_4_tfclinom ,
                                              AV73Tarticu_wwds_7_tfartcod_sel ,
                                              AV72Tarticu_wwds_6_tfartcod ,
                                              AV75Tarticu_wwds_9_tfartdsc_sel ,
                                              AV74Tarticu_wwds_8_tfartdsc ,
                                              Short.valueOf(AV76Tarticu_wwds_10_tftipartcod) ,
                                              Short.valueOf(AV77Tarticu_wwds_11_tftipartcod_to) ,
                                              AV79Tarticu_wwds_13_tftipartdsc_sel ,
                                              AV78Tarticu_wwds_12_tftipartdsc ,
                                              Short.valueOf(AV80Tarticu_wwds_14_tfartpml) ,
                                              Short.valueOf(AV81Tarticu_wwds_15_tfartpml_to) ,
                                              Short.valueOf(AV82Tarticu_wwds_16_tfartgraaca) ,
                                              Short.valueOf(AV83Tarticu_wwds_17_tfartgraaca_to) ,
                                              AV84Tarticu_wwds_18_tfartren ,
                                              AV85Tarticu_wwds_19_tfartren_to ,
                                              Short.valueOf(AV86Tarticu_wwds_20_tfartacamin) ,
                                              Short.valueOf(AV87Tarticu_wwds_21_tfartacamin_to) ,
                                              AV89Tarticu_wwds_23_tfartcomer_sel ,
                                              AV88Tarticu_wwds_22_tfartcomer ,
                                              AV90Tarticu_wwds_24_tfartactivo_sel ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A65ArtCod ,
                                              A69ArtDsc ,
                                              Short.valueOf(A829TipArtCod) ,
                                              A830TipArtDsc ,
                                              Short.valueOf(A1148ArtPml) ,
                                              Short.valueOf(A1903ArtGraAca) ,
                                              A95ArtRen ,
                                              Short.valueOf(A63ArtAcaMin) ,
                                              A5741ArtComer ,
                                              A14295ArtActivo ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A10045CliAct ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
         lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
         lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
         lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
         lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
         lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
         lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
         lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
         lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
         lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
         lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
         lV70Tarticu_wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV70Tarticu_wwds_4_tfclinom), 30, "%") ;
         lV72Tarticu_wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV72Tarticu_wwds_6_tfartcod), 16, "%") ;
         lV74Tarticu_wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV74Tarticu_wwds_8_tfartdsc), 26, "%") ;
         lV78Tarticu_wwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV78Tarticu_wwds_12_tftipartdsc), 30, "%") ;
         lV88Tarticu_wwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV88Tarticu_wwds_22_tfartcomer), 16, "%") ;
         /* Using cursor H02652 */
         pr_default.execute(0, new Object[] {A396EmprCod, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, Integer.valueOf(AV68Tarticu_wwds_2_tfclicod), Integer.valueOf(AV69Tarticu_wwds_3_tfclicod_to), lV70Tarticu_wwds_4_tfclinom, AV71Tarticu_wwds_5_tfclinom_sel, lV72Tarticu_wwds_6_tfartcod, AV73Tarticu_wwds_7_tfartcod_sel, lV74Tarticu_wwds_8_tfartdsc, AV75Tarticu_wwds_9_tfartdsc_sel, Short.valueOf(AV76Tarticu_wwds_10_tftipartcod), Short.valueOf(AV77Tarticu_wwds_11_tftipartcod_to), lV78Tarticu_wwds_12_tftipartdsc, AV79Tarticu_wwds_13_tftipartdsc_sel, Short.valueOf(AV80Tarticu_wwds_14_tfartpml), Short.valueOf(AV81Tarticu_wwds_15_tfartpml_to), Short.valueOf(AV82Tarticu_wwds_16_tfartgraaca), Short.valueOf(AV83Tarticu_wwds_17_tfartgraaca_to), AV84Tarticu_wwds_18_tfartren, AV85Tarticu_wwds_19_tfartren_to, Short.valueOf(AV86Tarticu_wwds_20_tfartacamin), Short.valueOf(AV87Tarticu_wwds_21_tfartacamin_to), lV88Tarticu_wwds_22_tfartcomer, AV89Tarticu_wwds_23_tfartcomer_sel, AV90Tarticu_wwds_24_tfartactivo_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A10045CliAct = H02652_A10045CliAct[0] ;
            A14295ArtActivo = H02652_A14295ArtActivo[0] ;
            A5741ArtComer = H02652_A5741ArtComer[0] ;
            n5741ArtComer = H02652_n5741ArtComer[0] ;
            A63ArtAcaMin = H02652_A63ArtAcaMin[0] ;
            n63ArtAcaMin = H02652_n63ArtAcaMin[0] ;
            A95ArtRen = H02652_A95ArtRen[0] ;
            n95ArtRen = H02652_n95ArtRen[0] ;
            A1903ArtGraAca = H02652_A1903ArtGraAca[0] ;
            n1903ArtGraAca = H02652_n1903ArtGraAca[0] ;
            A1148ArtPml = H02652_A1148ArtPml[0] ;
            n1148ArtPml = H02652_n1148ArtPml[0] ;
            A830TipArtDsc = H02652_A830TipArtDsc[0] ;
            n830TipArtDsc = H02652_n830TipArtDsc[0] ;
            A829TipArtCod = H02652_A829TipArtCod[0] ;
            A69ArtDsc = H02652_A69ArtDsc[0] ;
            n69ArtDsc = H02652_n69ArtDsc[0] ;
            A65ArtCod = H02652_A65ArtCod[0] ;
            A279CliNom = H02652_A279CliNom[0] ;
            A252CliCod = H02652_A252CliCod[0] ;
            A10045CliAct = H02652_A10045CliAct[0] ;
            A279CliNom = H02652_A279CliNom[0] ;
            A830TipArtDsc = H02652_A830TipArtDsc[0] ;
            n830TipArtDsc = H02652_n830TipArtDsc[0] ;
            e222652 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(45) ;
         wb2650( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2652( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ARTCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A65ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV58EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ARTDSC"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A69ArtDsc, ""))));
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
      AV67Tarticu_wwds_1_filterfulltext = AV15FilterFullText ;
      AV68Tarticu_wwds_2_tfclicod = AV30TFCliCod ;
      AV69Tarticu_wwds_3_tfclicod_to = AV31TFCliCod_To ;
      AV70Tarticu_wwds_4_tfclinom = AV32TFCliNom ;
      AV71Tarticu_wwds_5_tfclinom_sel = AV33TFCliNom_Sel ;
      AV72Tarticu_wwds_6_tfartcod = AV34TFArtCod ;
      AV73Tarticu_wwds_7_tfartcod_sel = AV35TFArtCod_Sel ;
      AV74Tarticu_wwds_8_tfartdsc = AV36TFArtDsc ;
      AV75Tarticu_wwds_9_tfartdsc_sel = AV37TFArtDsc_Sel ;
      AV76Tarticu_wwds_10_tftipartcod = AV38TFTipArtCod ;
      AV77Tarticu_wwds_11_tftipartcod_to = AV39TFTipArtCod_To ;
      AV78Tarticu_wwds_12_tftipartdsc = AV40TFTipArtDsc ;
      AV79Tarticu_wwds_13_tftipartdsc_sel = AV41TFTipArtDsc_Sel ;
      AV80Tarticu_wwds_14_tfartpml = AV42TFArtPml ;
      AV81Tarticu_wwds_15_tfartpml_to = AV43TFArtPml_To ;
      AV82Tarticu_wwds_16_tfartgraaca = AV44TFArtGraAca ;
      AV83Tarticu_wwds_17_tfartgraaca_to = AV45TFArtGraAca_To ;
      AV84Tarticu_wwds_18_tfartren = AV46TFArtRen ;
      AV85Tarticu_wwds_19_tfartren_to = AV47TFArtRen_To ;
      AV86Tarticu_wwds_20_tfartacamin = AV48TFArtAcaMin ;
      AV87Tarticu_wwds_21_tfartacamin_to = AV49TFArtAcaMin_To ;
      AV88Tarticu_wwds_22_tfartcomer = AV50TFArtComer ;
      AV89Tarticu_wwds_23_tfartcomer_sel = AV51TFArtComer_Sel ;
      AV90Tarticu_wwds_24_tfartactivo_sel = AV63TFArtActivo_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV67Tarticu_wwds_1_filterfulltext ,
                                           Integer.valueOf(AV68Tarticu_wwds_2_tfclicod) ,
                                           Integer.valueOf(AV69Tarticu_wwds_3_tfclicod_to) ,
                                           AV71Tarticu_wwds_5_tfclinom_sel ,
                                           AV70Tarticu_wwds_4_tfclinom ,
                                           AV73Tarticu_wwds_7_tfartcod_sel ,
                                           AV72Tarticu_wwds_6_tfartcod ,
                                           AV75Tarticu_wwds_9_tfartdsc_sel ,
                                           AV74Tarticu_wwds_8_tfartdsc ,
                                           Short.valueOf(AV76Tarticu_wwds_10_tftipartcod) ,
                                           Short.valueOf(AV77Tarticu_wwds_11_tftipartcod_to) ,
                                           AV79Tarticu_wwds_13_tftipartdsc_sel ,
                                           AV78Tarticu_wwds_12_tftipartdsc ,
                                           Short.valueOf(AV80Tarticu_wwds_14_tfartpml) ,
                                           Short.valueOf(AV81Tarticu_wwds_15_tfartpml_to) ,
                                           Short.valueOf(AV82Tarticu_wwds_16_tfartgraaca) ,
                                           Short.valueOf(AV83Tarticu_wwds_17_tfartgraaca_to) ,
                                           AV84Tarticu_wwds_18_tfartren ,
                                           AV85Tarticu_wwds_19_tfartren_to ,
                                           Short.valueOf(AV86Tarticu_wwds_20_tfartacamin) ,
                                           Short.valueOf(AV87Tarticu_wwds_21_tfartacamin_to) ,
                                           AV89Tarticu_wwds_23_tfartcomer_sel ,
                                           AV88Tarticu_wwds_22_tfartcomer ,
                                           AV90Tarticu_wwds_24_tfartactivo_sel ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           Short.valueOf(A1148ArtPml) ,
                                           Short.valueOf(A1903ArtGraAca) ,
                                           A95ArtRen ,
                                           Short.valueOf(A63ArtAcaMin) ,
                                           A5741ArtComer ,
                                           A14295ArtActivo ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A10045CliAct ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV67Tarticu_wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Tarticu_wwds_1_filterfulltext), "%", "") ;
      lV70Tarticu_wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV70Tarticu_wwds_4_tfclinom), 30, "%") ;
      lV72Tarticu_wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV72Tarticu_wwds_6_tfartcod), 16, "%") ;
      lV74Tarticu_wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV74Tarticu_wwds_8_tfartdsc), 26, "%") ;
      lV78Tarticu_wwds_12_tftipartdsc = GXutil.padr( GXutil.rtrim( AV78Tarticu_wwds_12_tftipartdsc), 30, "%") ;
      lV88Tarticu_wwds_22_tfartcomer = GXutil.padr( GXutil.rtrim( AV88Tarticu_wwds_22_tfartcomer), 16, "%") ;
      /* Using cursor H02653 */
      pr_default.execute(1, new Object[] {A396EmprCod, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, lV67Tarticu_wwds_1_filterfulltext, Integer.valueOf(AV68Tarticu_wwds_2_tfclicod), Integer.valueOf(AV69Tarticu_wwds_3_tfclicod_to), lV70Tarticu_wwds_4_tfclinom, AV71Tarticu_wwds_5_tfclinom_sel, lV72Tarticu_wwds_6_tfartcod, AV73Tarticu_wwds_7_tfartcod_sel, lV74Tarticu_wwds_8_tfartdsc, AV75Tarticu_wwds_9_tfartdsc_sel, Short.valueOf(AV76Tarticu_wwds_10_tftipartcod), Short.valueOf(AV77Tarticu_wwds_11_tftipartcod_to), lV78Tarticu_wwds_12_tftipartdsc, AV79Tarticu_wwds_13_tftipartdsc_sel, Short.valueOf(AV80Tarticu_wwds_14_tfartpml), Short.valueOf(AV81Tarticu_wwds_15_tfartpml_to), Short.valueOf(AV82Tarticu_wwds_16_tfartgraaca), Short.valueOf(AV83Tarticu_wwds_17_tfartgraaca_to), AV84Tarticu_wwds_18_tfartren, AV85Tarticu_wwds_19_tfartren_to, Short.valueOf(AV86Tarticu_wwds_20_tfartacamin), Short.valueOf(AV87Tarticu_wwds_21_tfartacamin_to), lV88Tarticu_wwds_22_tfartcomer, AV89Tarticu_wwds_23_tfartcomer_sel, AV90Tarticu_wwds_24_tfartactivo_sel});
      GRID_nRecordCount = H02653_AGRID_nRecordCount[0] ;
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
      AV67Tarticu_wwds_1_filterfulltext = AV15FilterFullText ;
      AV68Tarticu_wwds_2_tfclicod = AV30TFCliCod ;
      AV69Tarticu_wwds_3_tfclicod_to = AV31TFCliCod_To ;
      AV70Tarticu_wwds_4_tfclinom = AV32TFCliNom ;
      AV71Tarticu_wwds_5_tfclinom_sel = AV33TFCliNom_Sel ;
      AV72Tarticu_wwds_6_tfartcod = AV34TFArtCod ;
      AV73Tarticu_wwds_7_tfartcod_sel = AV35TFArtCod_Sel ;
      AV74Tarticu_wwds_8_tfartdsc = AV36TFArtDsc ;
      AV75Tarticu_wwds_9_tfartdsc_sel = AV37TFArtDsc_Sel ;
      AV76Tarticu_wwds_10_tftipartcod = AV38TFTipArtCod ;
      AV77Tarticu_wwds_11_tftipartcod_to = AV39TFTipArtCod_To ;
      AV78Tarticu_wwds_12_tftipartdsc = AV40TFTipArtDsc ;
      AV79Tarticu_wwds_13_tftipartdsc_sel = AV41TFTipArtDsc_Sel ;
      AV80Tarticu_wwds_14_tfartpml = AV42TFArtPml ;
      AV81Tarticu_wwds_15_tfartpml_to = AV43TFArtPml_To ;
      AV82Tarticu_wwds_16_tfartgraaca = AV44TFArtGraAca ;
      AV83Tarticu_wwds_17_tfartgraaca_to = AV45TFArtGraAca_To ;
      AV84Tarticu_wwds_18_tfartren = AV46TFArtRen ;
      AV85Tarticu_wwds_19_tfartren_to = AV47TFArtRen_To ;
      AV86Tarticu_wwds_20_tfartacamin = AV48TFArtAcaMin ;
      AV87Tarticu_wwds_21_tfartacamin_to = AV49TFArtAcaMin_To ;
      AV88Tarticu_wwds_22_tfartcomer = AV50TFArtComer ;
      AV89Tarticu_wwds_23_tfartcomer_sel = AV51TFArtComer_Sel ;
      AV90Tarticu_wwds_24_tfartactivo_sel = AV63TFArtActivo_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV34TFArtCod, AV35TFArtCod_Sel, AV36TFArtDsc, AV37TFArtDsc_Sel, AV38TFTipArtCod, AV39TFTipArtCod_To, AV40TFTipArtDsc, AV41TFTipArtDsc_Sel, AV42TFArtPml, AV43TFArtPml_To, AV44TFArtGraAca, AV45TFArtGraAca_To, AV46TFArtRen, AV47TFArtRen_To, AV48TFArtAcaMin, AV49TFArtAcaMin_To, AV50TFArtComer, AV51TFArtComer_Sel, AV63TFArtActivo_Sel, AV66Pgmname, AV12OrderedBy, AV13OrderedDsc, AV58EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV67Tarticu_wwds_1_filterfulltext = AV15FilterFullText ;
      AV68Tarticu_wwds_2_tfclicod = AV30TFCliCod ;
      AV69Tarticu_wwds_3_tfclicod_to = AV31TFCliCod_To ;
      AV70Tarticu_wwds_4_tfclinom = AV32TFCliNom ;
      AV71Tarticu_wwds_5_tfclinom_sel = AV33TFCliNom_Sel ;
      AV72Tarticu_wwds_6_tfartcod = AV34TFArtCod ;
      AV73Tarticu_wwds_7_tfartcod_sel = AV35TFArtCod_Sel ;
      AV74Tarticu_wwds_8_tfartdsc = AV36TFArtDsc ;
      AV75Tarticu_wwds_9_tfartdsc_sel = AV37TFArtDsc_Sel ;
      AV76Tarticu_wwds_10_tftipartcod = AV38TFTipArtCod ;
      AV77Tarticu_wwds_11_tftipartcod_to = AV39TFTipArtCod_To ;
      AV78Tarticu_wwds_12_tftipartdsc = AV40TFTipArtDsc ;
      AV79Tarticu_wwds_13_tftipartdsc_sel = AV41TFTipArtDsc_Sel ;
      AV80Tarticu_wwds_14_tfartpml = AV42TFArtPml ;
      AV81Tarticu_wwds_15_tfartpml_to = AV43TFArtPml_To ;
      AV82Tarticu_wwds_16_tfartgraaca = AV44TFArtGraAca ;
      AV83Tarticu_wwds_17_tfartgraaca_to = AV45TFArtGraAca_To ;
      AV84Tarticu_wwds_18_tfartren = AV46TFArtRen ;
      AV85Tarticu_wwds_19_tfartren_to = AV47TFArtRen_To ;
      AV86Tarticu_wwds_20_tfartacamin = AV48TFArtAcaMin ;
      AV87Tarticu_wwds_21_tfartacamin_to = AV49TFArtAcaMin_To ;
      AV88Tarticu_wwds_22_tfartcomer = AV50TFArtComer ;
      AV89Tarticu_wwds_23_tfartcomer_sel = AV51TFArtComer_Sel ;
      AV90Tarticu_wwds_24_tfartactivo_sel = AV63TFArtActivo_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV34TFArtCod, AV35TFArtCod_Sel, AV36TFArtDsc, AV37TFArtDsc_Sel, AV38TFTipArtCod, AV39TFTipArtCod_To, AV40TFTipArtDsc, AV41TFTipArtDsc_Sel, AV42TFArtPml, AV43TFArtPml_To, AV44TFArtGraAca, AV45TFArtGraAca_To, AV46TFArtRen, AV47TFArtRen_To, AV48TFArtAcaMin, AV49TFArtAcaMin_To, AV50TFArtComer, AV51TFArtComer_Sel, AV63TFArtActivo_Sel, AV66Pgmname, AV12OrderedBy, AV13OrderedDsc, AV58EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV67Tarticu_wwds_1_filterfulltext = AV15FilterFullText ;
      AV68Tarticu_wwds_2_tfclicod = AV30TFCliCod ;
      AV69Tarticu_wwds_3_tfclicod_to = AV31TFCliCod_To ;
      AV70Tarticu_wwds_4_tfclinom = AV32TFCliNom ;
      AV71Tarticu_wwds_5_tfclinom_sel = AV33TFCliNom_Sel ;
      AV72Tarticu_wwds_6_tfartcod = AV34TFArtCod ;
      AV73Tarticu_wwds_7_tfartcod_sel = AV35TFArtCod_Sel ;
      AV74Tarticu_wwds_8_tfartdsc = AV36TFArtDsc ;
      AV75Tarticu_wwds_9_tfartdsc_sel = AV37TFArtDsc_Sel ;
      AV76Tarticu_wwds_10_tftipartcod = AV38TFTipArtCod ;
      AV77Tarticu_wwds_11_tftipartcod_to = AV39TFTipArtCod_To ;
      AV78Tarticu_wwds_12_tftipartdsc = AV40TFTipArtDsc ;
      AV79Tarticu_wwds_13_tftipartdsc_sel = AV41TFTipArtDsc_Sel ;
      AV80Tarticu_wwds_14_tfartpml = AV42TFArtPml ;
      AV81Tarticu_wwds_15_tfartpml_to = AV43TFArtPml_To ;
      AV82Tarticu_wwds_16_tfartgraaca = AV44TFArtGraAca ;
      AV83Tarticu_wwds_17_tfartgraaca_to = AV45TFArtGraAca_To ;
      AV84Tarticu_wwds_18_tfartren = AV46TFArtRen ;
      AV85Tarticu_wwds_19_tfartren_to = AV47TFArtRen_To ;
      AV86Tarticu_wwds_20_tfartacamin = AV48TFArtAcaMin ;
      AV87Tarticu_wwds_21_tfartacamin_to = AV49TFArtAcaMin_To ;
      AV88Tarticu_wwds_22_tfartcomer = AV50TFArtComer ;
      AV89Tarticu_wwds_23_tfartcomer_sel = AV51TFArtComer_Sel ;
      AV90Tarticu_wwds_24_tfartactivo_sel = AV63TFArtActivo_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV34TFArtCod, AV35TFArtCod_Sel, AV36TFArtDsc, AV37TFArtDsc_Sel, AV38TFTipArtCod, AV39TFTipArtCod_To, AV40TFTipArtDsc, AV41TFTipArtDsc_Sel, AV42TFArtPml, AV43TFArtPml_To, AV44TFArtGraAca, AV45TFArtGraAca_To, AV46TFArtRen, AV47TFArtRen_To, AV48TFArtAcaMin, AV49TFArtAcaMin_To, AV50TFArtComer, AV51TFArtComer_Sel, AV63TFArtActivo_Sel, AV66Pgmname, AV12OrderedBy, AV13OrderedDsc, AV58EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV67Tarticu_wwds_1_filterfulltext = AV15FilterFullText ;
      AV68Tarticu_wwds_2_tfclicod = AV30TFCliCod ;
      AV69Tarticu_wwds_3_tfclicod_to = AV31TFCliCod_To ;
      AV70Tarticu_wwds_4_tfclinom = AV32TFCliNom ;
      AV71Tarticu_wwds_5_tfclinom_sel = AV33TFCliNom_Sel ;
      AV72Tarticu_wwds_6_tfartcod = AV34TFArtCod ;
      AV73Tarticu_wwds_7_tfartcod_sel = AV35TFArtCod_Sel ;
      AV74Tarticu_wwds_8_tfartdsc = AV36TFArtDsc ;
      AV75Tarticu_wwds_9_tfartdsc_sel = AV37TFArtDsc_Sel ;
      AV76Tarticu_wwds_10_tftipartcod = AV38TFTipArtCod ;
      AV77Tarticu_wwds_11_tftipartcod_to = AV39TFTipArtCod_To ;
      AV78Tarticu_wwds_12_tftipartdsc = AV40TFTipArtDsc ;
      AV79Tarticu_wwds_13_tftipartdsc_sel = AV41TFTipArtDsc_Sel ;
      AV80Tarticu_wwds_14_tfartpml = AV42TFArtPml ;
      AV81Tarticu_wwds_15_tfartpml_to = AV43TFArtPml_To ;
      AV82Tarticu_wwds_16_tfartgraaca = AV44TFArtGraAca ;
      AV83Tarticu_wwds_17_tfartgraaca_to = AV45TFArtGraAca_To ;
      AV84Tarticu_wwds_18_tfartren = AV46TFArtRen ;
      AV85Tarticu_wwds_19_tfartren_to = AV47TFArtRen_To ;
      AV86Tarticu_wwds_20_tfartacamin = AV48TFArtAcaMin ;
      AV87Tarticu_wwds_21_tfartacamin_to = AV49TFArtAcaMin_To ;
      AV88Tarticu_wwds_22_tfartcomer = AV50TFArtComer ;
      AV89Tarticu_wwds_23_tfartcomer_sel = AV51TFArtComer_Sel ;
      AV90Tarticu_wwds_24_tfartactivo_sel = AV63TFArtActivo_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV34TFArtCod, AV35TFArtCod_Sel, AV36TFArtDsc, AV37TFArtDsc_Sel, AV38TFTipArtCod, AV39TFTipArtCod_To, AV40TFTipArtDsc, AV41TFTipArtDsc_Sel, AV42TFArtPml, AV43TFArtPml_To, AV44TFArtGraAca, AV45TFArtGraAca_To, AV46TFArtRen, AV47TFArtRen_To, AV48TFArtAcaMin, AV49TFArtAcaMin_To, AV50TFArtComer, AV51TFArtComer_Sel, AV63TFArtActivo_Sel, AV66Pgmname, AV12OrderedBy, AV13OrderedDsc, AV58EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV67Tarticu_wwds_1_filterfulltext = AV15FilterFullText ;
      AV68Tarticu_wwds_2_tfclicod = AV30TFCliCod ;
      AV69Tarticu_wwds_3_tfclicod_to = AV31TFCliCod_To ;
      AV70Tarticu_wwds_4_tfclinom = AV32TFCliNom ;
      AV71Tarticu_wwds_5_tfclinom_sel = AV33TFCliNom_Sel ;
      AV72Tarticu_wwds_6_tfartcod = AV34TFArtCod ;
      AV73Tarticu_wwds_7_tfartcod_sel = AV35TFArtCod_Sel ;
      AV74Tarticu_wwds_8_tfartdsc = AV36TFArtDsc ;
      AV75Tarticu_wwds_9_tfartdsc_sel = AV37TFArtDsc_Sel ;
      AV76Tarticu_wwds_10_tftipartcod = AV38TFTipArtCod ;
      AV77Tarticu_wwds_11_tftipartcod_to = AV39TFTipArtCod_To ;
      AV78Tarticu_wwds_12_tftipartdsc = AV40TFTipArtDsc ;
      AV79Tarticu_wwds_13_tftipartdsc_sel = AV41TFTipArtDsc_Sel ;
      AV80Tarticu_wwds_14_tfartpml = AV42TFArtPml ;
      AV81Tarticu_wwds_15_tfartpml_to = AV43TFArtPml_To ;
      AV82Tarticu_wwds_16_tfartgraaca = AV44TFArtGraAca ;
      AV83Tarticu_wwds_17_tfartgraaca_to = AV45TFArtGraAca_To ;
      AV84Tarticu_wwds_18_tfartren = AV46TFArtRen ;
      AV85Tarticu_wwds_19_tfartren_to = AV47TFArtRen_To ;
      AV86Tarticu_wwds_20_tfartacamin = AV48TFArtAcaMin ;
      AV87Tarticu_wwds_21_tfartacamin_to = AV49TFArtAcaMin_To ;
      AV88Tarticu_wwds_22_tfartcomer = AV50TFArtComer ;
      AV89Tarticu_wwds_23_tfartcomer_sel = AV51TFArtComer_Sel ;
      AV90Tarticu_wwds_24_tfartactivo_sel = AV63TFArtActivo_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, A396EmprCod, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV30TFCliCod, AV31TFCliCod_To, AV32TFCliNom, AV33TFCliNom_Sel, AV34TFArtCod, AV35TFArtCod_Sel, AV36TFArtDsc, AV37TFArtDsc_Sel, AV38TFTipArtCod, AV39TFTipArtCod_To, AV40TFTipArtDsc, AV41TFTipArtDsc_Sel, AV42TFArtPml, AV43TFArtPml_To, AV44TFArtGraAca, AV45TFArtGraAca_To, AV46TFArtRen, AV47TFArtRen_To, AV48TFArtAcaMin, AV49TFArtAcaMin_To, AV50TFArtComer, AV51TFArtComer_Sel, AV63TFArtActivo_Sel, AV66Pgmname, AV12OrderedBy, AV13OrderedDsc, AV58EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV66Pgmname = "Tarticu_WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Pgmname", AV66Pgmname);
      Gx_err = (short)(0) ;
      edtavNproc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNproc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNproc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavProcods_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcods_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcods_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavProdscs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdscs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdscs_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavArtprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtprocod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2650( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e202652 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV27ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV52DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV24ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV54GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV55GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
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
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
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
         AV66Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66Pgmname", AV66Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"Tarticu_WW");
         AV66Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66Pgmname", AV66Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV66Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tarticu_ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
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
      e202652 ();
      if (returnInSub) return;
   }

   public void e202652( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV59Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tarticu_ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV59Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV60EmprNom ;
      GXv_char4[0] = AV61UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV59Station, GXv_char2, GXv_char3, GXv_char4) ;
      tarticu_ww_impl.this.A396EmprCod = GXv_char2[0] ;
      tarticu_ww_impl.this.AV60EmprNom = GXv_char3[0] ;
      tarticu_ww_impl.this.AV61UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXt_char1 = AV59Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tarticu_ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV59Station = GXt_char1 ;
      GXv_char4[0] = AV58EmprCod ;
      GXv_char3[0] = AV60EmprNom ;
      GXv_char2[0] = AV61UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV59Station, GXv_char4, GXv_char3, GXv_char2) ;
      tarticu_ww_impl.this.AV58EmprCod = GXv_char4[0] ;
      tarticu_ww_impl.this.AV60EmprNom = GXv_char3[0] ;
      tarticu_ww_impl.this.AV61UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58EmprCod", AV58EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58EmprCod, "@!"))));
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
      Form.setCaption( httpContext.getMessage( " Ficha Tecnica (Articulo)", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV52DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV52DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e212652( )
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
      if ( AV29ManageFiltersExecutionStep == 1 )
      {
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV29ManageFiltersExecutionStep == 2 )
      {
         AV29ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV26Session.getValue("Tarticu_WWColumnsSelector"), "") != 0 )
      {
         AV22ColumnsSelectorXML = AV26Session.getValue("Tarticu_WWColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV22ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtArtDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipArtDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtArtPml_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtPml_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtPml_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtArtGraAca_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtGraAca_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtGraAca_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtArtRen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtRen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtRen_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtArtAcaMin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtAcaMin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtAcaMin_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavNproc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNproc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNproc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavProcods_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProcods_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProcods_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavProdscs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProdscs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProdscs_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavArtprocod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtprocod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtprocod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtArtComer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtComer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtComer_Visible), 5, 0), !bGXsfl_45_Refreshing);
      chkArtActivo.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkArtActivo.getInternalname(), "Visible", GXutil.ltrimstr( chkArtActivo.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      AV54GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridCurrentPage), 10, 0));
      AV55GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55GridPageCount), 10, 0));
      AV67Tarticu_wwds_1_filterfulltext = AV15FilterFullText ;
      AV68Tarticu_wwds_2_tfclicod = AV30TFCliCod ;
      AV69Tarticu_wwds_3_tfclicod_to = AV31TFCliCod_To ;
      AV70Tarticu_wwds_4_tfclinom = AV32TFCliNom ;
      AV71Tarticu_wwds_5_tfclinom_sel = AV33TFCliNom_Sel ;
      AV72Tarticu_wwds_6_tfartcod = AV34TFArtCod ;
      AV73Tarticu_wwds_7_tfartcod_sel = AV35TFArtCod_Sel ;
      AV74Tarticu_wwds_8_tfartdsc = AV36TFArtDsc ;
      AV75Tarticu_wwds_9_tfartdsc_sel = AV37TFArtDsc_Sel ;
      AV76Tarticu_wwds_10_tftipartcod = AV38TFTipArtCod ;
      AV77Tarticu_wwds_11_tftipartcod_to = AV39TFTipArtCod_To ;
      AV78Tarticu_wwds_12_tftipartdsc = AV40TFTipArtDsc ;
      AV79Tarticu_wwds_13_tftipartdsc_sel = AV41TFTipArtDsc_Sel ;
      AV80Tarticu_wwds_14_tfartpml = AV42TFArtPml ;
      AV81Tarticu_wwds_15_tfartpml_to = AV43TFArtPml_To ;
      AV82Tarticu_wwds_16_tfartgraaca = AV44TFArtGraAca ;
      AV83Tarticu_wwds_17_tfartgraaca_to = AV45TFArtGraAca_To ;
      AV84Tarticu_wwds_18_tfartren = AV46TFArtRen ;
      AV85Tarticu_wwds_19_tfartren_to = AV47TFArtRen_To ;
      AV86Tarticu_wwds_20_tfartacamin = AV48TFArtAcaMin ;
      AV87Tarticu_wwds_21_tfartacamin_to = AV49TFArtAcaMin_To ;
      AV88Tarticu_wwds_22_tfartcomer = AV50TFArtComer ;
      AV89Tarticu_wwds_23_tfartcomer_sel = AV51TFArtComer_Sel ;
      AV90Tarticu_wwds_24_tfartactivo_sel = AV63TFArtActivo_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e122652( )
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
         AV53PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV53PageToGo) ;
      }
   }

   public void e132652( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e142652( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV30TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFCliCod), 6, 0));
            AV31TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV32TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFCliNom", AV32TFCliNom);
            AV33TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliNom_Sel", AV33TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtCod") == 0 )
         {
            AV34TFArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFArtCod", AV34TFArtCod);
            AV35TFArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFArtCod_Sel", AV35TFArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtDsc") == 0 )
         {
            AV36TFArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFArtDsc", AV36TFArtDsc);
            AV37TFArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFArtDsc_Sel", AV37TFArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipArtCod") == 0 )
         {
            AV38TFTipArtCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFTipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFTipArtCod), 4, 0));
            AV39TFTipArtCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFTipArtCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFTipArtCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipArtDsc") == 0 )
         {
            AV40TFTipArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFTipArtDsc", AV40TFTipArtDsc);
            AV41TFTipArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFTipArtDsc_Sel", AV41TFTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtPml") == 0 )
         {
            AV42TFArtPml = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFArtPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFArtPml), 4, 0));
            AV43TFArtPml_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFArtPml_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFArtPml_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtGraAca") == 0 )
         {
            AV44TFArtGraAca = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFArtGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFArtGraAca), 4, 0));
            AV45TFArtGraAca_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFArtGraAca_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFArtGraAca_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtRen") == 0 )
         {
            AV46TFArtRen = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFArtRen", GXutil.ltrimstr( AV46TFArtRen, 6, 2));
            AV47TFArtRen_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFArtRen_To", GXutil.ltrimstr( AV47TFArtRen_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtAcaMin") == 0 )
         {
            AV48TFArtAcaMin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFArtAcaMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFArtAcaMin), 3, 0));
            AV49TFArtAcaMin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFArtAcaMin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFArtAcaMin_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtComer") == 0 )
         {
            AV50TFArtComer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFArtComer", AV50TFArtComer);
            AV51TFArtComer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFArtComer_Sel", AV51TFArtComer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ArtActivo") == 0 )
         {
            AV63TFArtActivo_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFArtActivo_Sel", AV63TFArtActivo_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e222652( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Duplicar Artículo", ""), "fas fa-clone", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Procesos", ""), "fa fa-cog", "", "", "", "", "", "", ""), (short)(0));
      GXv_char4[0] = AV19ArtProCod ;
      GXv_char3[0] = AV17ProCods ;
      GXv_char2[0] = AV18ProDscs ;
      GXv_int8[0] = AV16NProc ;
      new app.datosprocesoclientearticulo(remoteHandle, context).execute( A396EmprCod, A252CliCod, A65ArtCod, GXv_char4, GXv_char3, GXv_char2, GXv_int8) ;
      tarticu_ww_impl.this.AV19ArtProCod = GXv_char4[0] ;
      tarticu_ww_impl.this.AV17ProCods = GXv_char3[0] ;
      tarticu_ww_impl.this.AV18ProDscs = GXv_char2[0] ;
      tarticu_ww_impl.this.AV16NProc = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtavArtprocod_Internalname, AV19ArtProCod);
      httpContext.ajax_rsp_assign_attri("", false, edtavProcods_Internalname, AV17ProCods);
      httpContext.ajax_rsp_assign_attri("", false, edtavProdscs_Internalname, AV18ProDscs);
      httpContext.ajax_rsp_assign_attri("", false, edtavNproc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16NProc), 4, 0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(45) ;
      }
      sendrow_452( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_45_Refreshing )
      {
         httpContext.doAjaxLoad(45, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV56GridActions, 4, 0)) );
   }

   public void e152652( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV22ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV24ColumnsSelector.fromJSonString(AV22ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Tarticu_WWColumnsSelector", ((GXutil.strcmp("", AV22ColumnsSelectorXML)==0) ? "" : AV24ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e112652( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Tarticu_WWFilters")),GXutil.URLEncode(GXutil.rtrim(AV66Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Tarticu_WWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV28ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Tarticu_WWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tarticu_ww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV28ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV28ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV66Pgmname+"GridState", AV28ManageFiltersXml) ;
            AV10GridState.fromxml(AV28ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
   }

   public void e232652( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV56GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV56GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV56GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV56GridActions == 4 )
      {
         /* Execute user subroutine: 'DO DUPLICARARTICULO' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV56GridActions == 5 )
      {
         /* Execute user subroutine: 'DO PROCESOS' */
         S232 ();
         if (returnInSub) return;
      }
      AV56GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV56GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e162652( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tarticu", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","CliCod","ArtCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.tarticu", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","CliCod","ArtCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e172652( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV20ExcelFilename ;
      GXv_char3[0] = AV21ErrorMessage ;
      new app.tarticu_wwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tarticu_ww_impl.this.AV20ExcelFilename = GXv_char4[0] ;
      tarticu_ww_impl.this.AV21ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV20ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV20ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV21ErrorMessage);
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
   }

   public void e182652( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tarticu_wwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
   }

   public void e192652( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tarticu_wwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27ManageFiltersData", AV27ManageFiltersData);
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
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CliCod", "", "Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CliNom", "", "Nombre", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "ArtCod", "", "Artículo", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "ArtDsc", "", "Descripción", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "TipArtCod", "", "Tipo Artículo", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "TipArtDsc", "", "Descripción", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "ArtPml", "", "Pml", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "ArtGraAca", "", "Grm2", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "ArtRen", "", "Rdto", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "ArtAcaMin", "", "Ancho Ac", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&NProc", "", "#", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&ProCods", "", "Proceso", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&ProDscs", "", "Descripción", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&ArtProCod", "", "Acs", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "ArtComer", "", "Artículo Comercial", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "ArtActivo", "", "Activo?", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char1 = AV23UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Tarticu_WWColumnsSelector", GXv_char4) ;
      tarticu_ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV23UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV23UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector9[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector10[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, GXv_SdtWWPColumnsSelector10) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector9[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = AV27ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Tarticu_WWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[0] ;
      AV27ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV30TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFCliCod), 6, 0));
      AV31TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCod_To), 6, 0));
      AV32TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFCliNom", AV32TFCliNom);
      AV33TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliNom_Sel", AV33TFCliNom_Sel);
      AV34TFArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFArtCod", AV34TFArtCod);
      AV35TFArtCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFArtCod_Sel", AV35TFArtCod_Sel);
      AV36TFArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFArtDsc", AV36TFArtDsc);
      AV37TFArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFArtDsc_Sel", AV37TFArtDsc_Sel);
      AV38TFTipArtCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFTipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFTipArtCod), 4, 0));
      AV39TFTipArtCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFTipArtCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFTipArtCod_To), 4, 0));
      AV40TFTipArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFTipArtDsc", AV40TFTipArtDsc);
      AV41TFTipArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFTipArtDsc_Sel", AV41TFTipArtDsc_Sel);
      AV42TFArtPml = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFArtPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFArtPml), 4, 0));
      AV43TFArtPml_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFArtPml_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFArtPml_To), 4, 0));
      AV44TFArtGraAca = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFArtGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFArtGraAca), 4, 0));
      AV45TFArtGraAca_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFArtGraAca_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFArtGraAca_To), 4, 0));
      AV46TFArtRen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFArtRen", GXutil.ltrimstr( AV46TFArtRen, 6, 2));
      AV47TFArtRen_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFArtRen_To", GXutil.ltrimstr( AV47TFArtRen_To, 6, 2));
      AV48TFArtAcaMin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFArtAcaMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFArtAcaMin), 3, 0));
      AV49TFArtAcaMin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFArtAcaMin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFArtAcaMin_To), 3, 0));
      AV50TFArtComer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFArtComer", AV50TFArtComer);
      AV51TFArtComer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFArtComer_Sel", AV51TFArtComer_Sel);
      AV63TFArtActivo_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFArtActivo_Sel", AV63TFArtActivo_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tarticu", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"Mode","EmprCod","CliCod","ArtCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tarticu", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"Mode","EmprCod","CliCod","ArtCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tarticu", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"Mode","EmprCod","CliCod","ArtCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S222( )
   {
      /* 'DO DUPLICARARTICULO' Routine */
      returnInSub = false ;
      if ( ! (0==A252CliCod) && ! (GXutil.strcmp("", A65ArtCod)==0) )
      {
         httpContext.popup(formatLink("app.wduser2_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod))}, new String[] {"EmprCod","CliOri","ArtOri"}) , new Object[] {});
         httpContext.doAjaxRefresh();
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se debe seleccionar Cliente y Artículo", ""));
      }
   }

   public void S232( )
   {
      /* 'DO PROCESOS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tarticu_procesos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV58EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A65ArtCod)),GXutil.URLEncode(GXutil.rtrim(A69ArtDsc))}, new String[] {"Emprcod","CliCod","CliNom","ArtCod","ArtDsc"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV26Session.getValue(AV66Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV66Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV26Session.getValue(AV66Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV91GXV1 = 1 ;
      while ( AV91GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV91GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV30TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFCliCod), 6, 0));
            AV31TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV32TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFCliNom", AV32TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV33TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFCliNom_Sel", AV33TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV34TFArtCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFArtCod", AV34TFArtCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV35TFArtCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFArtCod_Sel", AV35TFArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV36TFArtDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFArtDsc", AV36TFArtDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV37TFArtDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFArtDsc_Sel", AV37TFArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTCOD") == 0 )
         {
            AV38TFTipArtCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFTipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFTipArtCod), 4, 0));
            AV39TFTipArtCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFTipArtCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFTipArtCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC") == 0 )
         {
            AV40TFTipArtDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFTipArtDsc", AV40TFTipArtDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC_SEL") == 0 )
         {
            AV41TFTipArtDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFTipArtDsc_Sel", AV41TFTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTPML") == 0 )
         {
            AV42TFArtPml = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFArtPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFArtPml), 4, 0));
            AV43TFArtPml_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFArtPml_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFArtPml_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTGRAACA") == 0 )
         {
            AV44TFArtGraAca = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFArtGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFArtGraAca), 4, 0));
            AV45TFArtGraAca_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFArtGraAca_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFArtGraAca_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTREN") == 0 )
         {
            AV46TFArtRen = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFArtRen", GXutil.ltrimstr( AV46TFArtRen, 6, 2));
            AV47TFArtRen_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFArtRen_To", GXutil.ltrimstr( AV47TFArtRen_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTACAMIN") == 0 )
         {
            AV48TFArtAcaMin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFArtAcaMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFArtAcaMin), 3, 0));
            AV49TFArtAcaMin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFArtAcaMin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFArtAcaMin_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER") == 0 )
         {
            AV50TFArtComer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFArtComer", AV50TFArtComer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOMER_SEL") == 0 )
         {
            AV51TFArtComer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFArtComer_Sel", AV51TFArtComer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTACTIVO_SEL") == 0 )
         {
            AV63TFArtActivo_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFArtActivo_Sel", AV63TFArtActivo_Sel);
         }
         AV91GXV1 = (int)(AV91GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFCliNom_Sel)==0), AV33TFCliNom_Sel, GXv_char4) ;
      tarticu_ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFArtCod_Sel)==0), AV35TFArtCod_Sel, GXv_char3) ;
      tarticu_ww_impl.this.GXt_char13 = GXv_char3[0] ;
      GXt_char14 = "" ;
      GXv_char2[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFArtDsc_Sel)==0), AV37TFArtDsc_Sel, GXv_char2) ;
      tarticu_ww_impl.this.GXt_char14 = GXv_char2[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFTipArtDsc_Sel)==0), AV41TFTipArtDsc_Sel, GXv_char16) ;
      tarticu_ww_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFArtComer_Sel)==0), AV51TFArtComer_Sel, GXv_char18) ;
      tarticu_ww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFArtActivo_Sel)==0), AV63TFArtActivo_Sel, GXv_char20) ;
      tarticu_ww_impl.this.GXt_char19 = GXv_char20[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char13+"|"+GXt_char14+"||"+GXt_char15+"|||||||||"+GXt_char17+"|"+GXt_char19 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFCliNom)==0), AV32TFCliNom, GXv_char20) ;
      tarticu_ww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFArtCod)==0), AV34TFArtCod, GXv_char18) ;
      tarticu_ww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFArtDsc)==0), AV36TFArtDsc, GXv_char16) ;
      tarticu_ww_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char14 = "" ;
      GXv_char4[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFTipArtDsc)==0), AV40TFTipArtDsc, GXv_char4) ;
      tarticu_ww_impl.this.GXt_char14 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFArtComer)==0), AV50TFArtComer, GXv_char3) ;
      tarticu_ww_impl.this.GXt_char13 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV30TFCliCod) ? "" : GXutil.str( AV30TFCliCod, 6, 0))+"|"+GXt_char19+"|"+GXt_char17+"|"+GXt_char15+"|"+((0==AV38TFTipArtCod) ? "" : GXutil.str( AV38TFTipArtCod, 4, 0))+"|"+GXt_char14+"|"+((0==AV42TFArtPml) ? "" : GXutil.str( AV42TFArtPml, 4, 0))+"|"+((0==AV44TFArtGraAca) ? "" : GXutil.str( AV44TFArtGraAca, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFArtRen)==0) ? "" : GXutil.str( AV46TFArtRen, 6, 2))+"|"+((0==AV48TFArtAcaMin) ? "" : GXutil.str( AV48TFArtAcaMin, 3, 0))+"|||||"+GXt_char13+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV31TFCliCod_To) ? "" : GXutil.str( AV31TFCliCod_To, 6, 0))+"||||"+((0==AV39TFTipArtCod_To) ? "" : GXutil.str( AV39TFTipArtCod_To, 4, 0))+"||"+((0==AV43TFArtPml_To) ? "" : GXutil.str( AV43TFArtPml_To, 4, 0))+"|"+((0==AV45TFArtGraAca_To) ? "" : GXutil.str( AV45TFArtGraAca_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFArtRen_To)==0) ? "" : GXutil.str( AV47TFArtRen_To, 6, 2))+"|"+((0==AV49TFArtAcaMin_To) ? "" : GXutil.str( AV49TFArtAcaMin_To, 3, 0))+"||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV26Session.getValue(AV66Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFCLICOD", "", !((0==AV30TFCliCod)&&(0==AV31TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV31TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFCLINOM", "", !(GXutil.strcmp("", AV32TFCliNom)==0), (short)(0), AV32TFCliNom, "", !(GXutil.strcmp("", AV33TFCliNom_Sel)==0), AV33TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFARTCOD", "", !(GXutil.strcmp("", AV34TFArtCod)==0), (short)(0), AV34TFArtCod, "", !(GXutil.strcmp("", AV35TFArtCod_Sel)==0), AV35TFArtCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFARTDSC", "", !(GXutil.strcmp("", AV36TFArtDsc)==0), (short)(0), AV36TFArtDsc, "", !(GXutil.strcmp("", AV37TFArtDsc_Sel)==0), AV37TFArtDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFTIPARTCOD", "", !((0==AV38TFTipArtCod)&&(0==AV39TFTipArtCod_To)), (short)(0), GXutil.trim( GXutil.str( AV38TFTipArtCod, 4, 0)), GXutil.trim( GXutil.str( AV39TFTipArtCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFTIPARTDSC", "", !(GXutil.strcmp("", AV40TFTipArtDsc)==0), (short)(0), AV40TFTipArtDsc, "", !(GXutil.strcmp("", AV41TFTipArtDsc_Sel)==0), AV41TFTipArtDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFARTPML", "", !((0==AV42TFArtPml)&&(0==AV43TFArtPml_To)), (short)(0), GXutil.trim( GXutil.str( AV42TFArtPml, 4, 0)), GXutil.trim( GXutil.str( AV43TFArtPml_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFARTGRAACA", "", !((0==AV44TFArtGraAca)&&(0==AV45TFArtGraAca_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFArtGraAca, 4, 0)), GXutil.trim( GXutil.str( AV45TFArtGraAca_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFARTREN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFArtRen)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFArtRen_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV46TFArtRen, 6, 2)), GXutil.trim( GXutil.str( AV47TFArtRen_To, 6, 2))) ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFARTACAMIN", "", !((0==AV48TFArtAcaMin)&&(0==AV49TFArtAcaMin_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFArtAcaMin, 3, 0)), GXutil.trim( GXutil.str( AV49TFArtAcaMin_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFARTCOMER", "", !(GXutil.strcmp("", AV50TFArtComer)==0), (short)(0), AV50TFArtComer, "", !(GXutil.strcmp("", AV51TFArtComer_Sel)==0), AV51TFArtComer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFARTACTIVO_SEL", "", !(GXutil.strcmp("", AV63TFArtActivo_Sel)==0), (short)(0), AV63TFArtActivo_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV66Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV66Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TARTICU" );
      AV26Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_2652( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV27ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_32_2652( true) ;
      }
      else
      {
         wb_table2_32_2652( false) ;
      }
      return  ;
   }

   public void wb_table2_32_2652e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_2652e( true) ;
      }
      else
      {
         wb_table1_27_2652e( false) ;
      }
   }

   public void wb_table2_32_2652( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Tarticu_WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_2652e( true) ;
      }
      else
      {
         wb_table2_32_2652e( false) ;
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
      pa2652( ) ;
      ws2652( ) ;
      we2652( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211614564", true, true);
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
      httpContext.AddJavascriptSource("tarticu_ww.js", "?20268211614564", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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

   public void subsflControlProps_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_45_idx ;
      edtArtCod_Internalname = "ARTCOD_"+sGXsfl_45_idx ;
      edtArtDsc_Internalname = "ARTDSC_"+sGXsfl_45_idx ;
      edtTipArtCod_Internalname = "TIPARTCOD_"+sGXsfl_45_idx ;
      edtTipArtDsc_Internalname = "TIPARTDSC_"+sGXsfl_45_idx ;
      edtArtPml_Internalname = "ARTPML_"+sGXsfl_45_idx ;
      edtArtGraAca_Internalname = "ARTGRAACA_"+sGXsfl_45_idx ;
      edtArtRen_Internalname = "ARTREN_"+sGXsfl_45_idx ;
      edtArtAcaMin_Internalname = "ARTACAMIN_"+sGXsfl_45_idx ;
      edtavNproc_Internalname = "vNPROC_"+sGXsfl_45_idx ;
      edtavProcods_Internalname = "vPROCODS_"+sGXsfl_45_idx ;
      edtavProdscs_Internalname = "vPRODSCS_"+sGXsfl_45_idx ;
      edtavArtprocod_Internalname = "vARTPROCOD_"+sGXsfl_45_idx ;
      edtArtComer_Internalname = "ARTCOMER_"+sGXsfl_45_idx ;
      chkArtActivo.setInternalname( "ARTACTIVO_"+sGXsfl_45_idx );
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_45_fel_idx ;
      edtArtCod_Internalname = "ARTCOD_"+sGXsfl_45_fel_idx ;
      edtArtDsc_Internalname = "ARTDSC_"+sGXsfl_45_fel_idx ;
      edtTipArtCod_Internalname = "TIPARTCOD_"+sGXsfl_45_fel_idx ;
      edtTipArtDsc_Internalname = "TIPARTDSC_"+sGXsfl_45_fel_idx ;
      edtArtPml_Internalname = "ARTPML_"+sGXsfl_45_fel_idx ;
      edtArtGraAca_Internalname = "ARTGRAACA_"+sGXsfl_45_fel_idx ;
      edtArtRen_Internalname = "ARTREN_"+sGXsfl_45_fel_idx ;
      edtArtAcaMin_Internalname = "ARTACAMIN_"+sGXsfl_45_fel_idx ;
      edtavNproc_Internalname = "vNPROC_"+sGXsfl_45_fel_idx ;
      edtavProcods_Internalname = "vPROCODS_"+sGXsfl_45_fel_idx ;
      edtavProdscs_Internalname = "vPRODSCS_"+sGXsfl_45_fel_idx ;
      edtavArtprocod_Internalname = "vARTPROCOD_"+sGXsfl_45_fel_idx ;
      edtArtComer_Internalname = "ARTCOMER_"+sGXsfl_45_fel_idx ;
      chkArtActivo.setInternalname( "ARTACTIVO_"+sGXsfl_45_fel_idx );
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb2650( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_45_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_45_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_45_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_45_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV56GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV56GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV56GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_45_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV56GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtCod_Internalname,GXutil.rtrim( A65ArtCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtArtDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtDsc_Internalname,GXutil.rtrim( A69ArtDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtArtDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTipArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipArtCod_Internalname,GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A829TipArtCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtTipArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipArtDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipArtDsc_Internalname,GXutil.rtrim( A830TipArtDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipArtDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtArtPml_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtPml_Internalname,GXutil.ltrim( localUtil.ntoc( A1148ArtPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1148ArtPml), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtPml_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtArtPml_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtArtGraAca_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtGraAca_Internalname,GXutil.ltrim( localUtil.ntoc( A1903ArtGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1903ArtGraAca), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtGraAca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtArtGraAca_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtArtRen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtRen_Internalname,GXutil.ltrim( localUtil.ntoc( A95ArtRen, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A95ArtRen, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtRen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtArtRen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtArtAcaMin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtAcaMin_Internalname,GXutil.ltrim( localUtil.ntoc( A63ArtAcaMin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A63ArtAcaMin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtAcaMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtArtAcaMin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavNproc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavNproc_Enabled!=0)&&(edtavNproc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNproc_Internalname,GXutil.ltrim( localUtil.ntoc( AV16NProc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavNproc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV16NProc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV16NProc), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavNproc_Enabled!=0)&&(edtavNproc_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavNproc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNproc_Visible),Integer.valueOf(edtavNproc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavProcods_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavProcods_Enabled!=0)&&(edtavProcods_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavProcods_Internalname,GXutil.rtrim( AV17ProCods),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavProcods_Enabled!=0)&&(edtavProcods_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,58);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavProcods_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavProcods_Visible),Integer.valueOf(edtavProcods_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavProdscs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavProdscs_Enabled!=0)&&(edtavProdscs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavProdscs_Internalname,GXutil.rtrim( AV18ProDscs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavProdscs_Enabled!=0)&&(edtavProdscs_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,59);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavProdscs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavProdscs_Visible),Integer.valueOf(edtavProdscs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavArtprocod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavArtprocod_Enabled!=0)&&(edtavArtprocod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 60,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavArtprocod_Internalname,GXutil.rtrim( AV19ArtProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavArtprocod_Enabled!=0)&&(edtavArtprocod_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,60);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavArtprocod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavArtprocod_Visible),Integer.valueOf(edtavArtprocod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtArtComer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtComer_Internalname,GXutil.rtrim( A5741ArtComer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtComer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtArtComer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkArtActivo.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "ARTACTIVO_" + sGXsfl_45_idx ;
         chkArtActivo.setName( GXCCtl );
         chkArtActivo.setWebtags( "" );
         chkArtActivo.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkArtActivo.getInternalname(), "TitleCaption", chkArtActivo.getCaption(), !bGXsfl_45_Refreshing);
         chkArtActivo.setCheckedValue( "N" );
         A14295ArtActivo = ((GXutil.strcmp(GXutil.rtrim( A14295ArtActivo), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkArtActivo.getInternalname(),A14295ArtActivo,"","",Integer.valueOf(chkArtActivo.getVisible()),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         send_integrity_lvl_hashes2652( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      /* End function sendrow_452 */
   }

   public void startgridcontrol45( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"45\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtArtCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtArtDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipArtCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipArtDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtArtPml_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pml", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtArtGraAca_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Grm2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtArtRen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rdto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtArtAcaMin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ancho Ac", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNproc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavProcods_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavProdscs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavArtprocod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtArtComer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artículo Comercial", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkArtActivo.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Activo?", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV56GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A65ArtCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtArtCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A69ArtDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtArtDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipArtCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A830TipArtDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipArtDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1148ArtPml, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtArtPml_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1903ArtGraAca, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtArtGraAca_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A95ArtRen, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtArtRen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A63ArtAcaMin, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtArtAcaMin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV16NProc, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNproc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNproc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV17ProCods));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavProcods_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavProcods_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV18ProDscs));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavProdscs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavProdscs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV19ArtProCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavArtprocod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavArtprocod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5741ArtComer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtArtComer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14295ArtActivo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkArtActivo.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
      bttBtninsert_Internalname = "BTNINSERT" ;
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportreport_Internalname = "BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtArtCod_Internalname = "ARTCOD" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      edtTipArtCod_Internalname = "TIPARTCOD" ;
      edtTipArtDsc_Internalname = "TIPARTDSC" ;
      edtArtPml_Internalname = "ARTPML" ;
      edtArtGraAca_Internalname = "ARTGRAACA" ;
      edtArtRen_Internalname = "ARTREN" ;
      edtArtAcaMin_Internalname = "ARTACAMIN" ;
      edtavNproc_Internalname = "vNPROC" ;
      edtavProcods_Internalname = "vPROCODS" ;
      edtavProdscs_Internalname = "vPRODSCS" ;
      edtavArtprocod_Internalname = "vARTPROCOD" ;
      edtArtComer_Internalname = "ARTCOMER" ;
      chkArtActivo.setInternalname( "ARTACTIVO" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
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
      chkArtActivo.setCaption( "" );
      edtArtComer_Jsonclick = "" ;
      edtavArtprocod_Jsonclick = "" ;
      edtavArtprocod_Enabled = 1 ;
      edtavProdscs_Jsonclick = "" ;
      edtavProdscs_Enabled = 1 ;
      edtavProcods_Jsonclick = "" ;
      edtavProcods_Enabled = 1 ;
      edtavNproc_Jsonclick = "" ;
      edtavNproc_Enabled = 1 ;
      edtArtAcaMin_Jsonclick = "" ;
      edtArtRen_Jsonclick = "" ;
      edtArtGraAca_Jsonclick = "" ;
      edtArtPml_Jsonclick = "" ;
      edtTipArtDsc_Jsonclick = "" ;
      edtTipArtCod_Jsonclick = "" ;
      edtArtDsc_Jsonclick = "" ;
      edtArtCod_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      chkArtActivo.setVisible( -1 );
      edtArtComer_Visible = -1 ;
      edtavArtprocod_Visible = -1 ;
      edtavProdscs_Visible = -1 ;
      edtavProcods_Visible = -1 ;
      edtavNproc_Visible = -1 ;
      edtArtAcaMin_Visible = -1 ;
      edtArtRen_Visible = -1 ;
      edtArtGraAca_Visible = -1 ;
      edtArtPml_Visible = -1 ;
      edtTipArtDsc_Visible = -1 ;
      edtTipArtCod_Visible = -1 ;
      edtArtDsc_Visible = -1 ;
      edtArtCod_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "Tarticu_WWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||||||S:WWP_TSChecked,N:WWP_TSUnChecked" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic||Dynamic|||||||||Dynamic|FixedValues" ;
      Ddo_grid_Includedatalist = "|T|T|T||T|||||||||T|T" ;
      Ddo_grid_Filterisrange = "T||||T||T|T|T|T||||||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Numeric|Character|Numeric|Numeric|Numeric|Numeric|||||Character|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|||||T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T|||||T|T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|||||12|13" ;
      Ddo_grid_Columnids = "1:CliCod|2:CliNom|3:ArtCod|4:ArtDsc|5:TipArtCod|6:TipArtDsc|7:ArtPml|8:ArtGraAca|9:ArtRen|10:ArtAcaMin|11:NProc|12:ProCods|13:ProDscs|14:ArtProCod|15:ArtComer|16:ArtActivo" ;
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
      Form.setCaption( httpContext.getMessage( " Ficha Tecnica (Articulo)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_45_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV56GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV56GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridActions), 4, 0));
      }
      GXCCtl = "ARTACTIVO_" + sGXsfl_45_idx ;
      chkArtActivo.setName( GXCCtl );
      chkArtActivo.setWebtags( "" );
      chkArtActivo.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkArtActivo.getInternalname(), "TitleCaption", chkArtActivo.getCaption(), !bGXsfl_45_Refreshing);
      chkArtActivo.setCheckedValue( "N" );
      A14295ArtActivo = ((GXutil.strcmp(GXutil.rtrim( A14295ArtActivo), "S")==0) ? "S" : "N") ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV35TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV36TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV37TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV38TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV39TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV40TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV41TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV42TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV43TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV44TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV45TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV46TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV47TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV48TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV49TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV50TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV51TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV63TFArtActivo_Sel',fld:'vTFARTACTIVO_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtArtCod_Visible',ctrl:'ARTCOD',prop:'Visible'},{av:'edtArtDsc_Visible',ctrl:'ARTDSC',prop:'Visible'},{av:'edtTipArtCod_Visible',ctrl:'TIPARTCOD',prop:'Visible'},{av:'edtTipArtDsc_Visible',ctrl:'TIPARTDSC',prop:'Visible'},{av:'edtArtPml_Visible',ctrl:'ARTPML',prop:'Visible'},{av:'edtArtGraAca_Visible',ctrl:'ARTGRAACA',prop:'Visible'},{av:'edtArtRen_Visible',ctrl:'ARTREN',prop:'Visible'},{av:'edtArtAcaMin_Visible',ctrl:'ARTACAMIN',prop:'Visible'},{av:'edtavNproc_Visible',ctrl:'vNPROC',prop:'Visible'},{av:'edtavProcods_Visible',ctrl:'vPROCODS',prop:'Visible'},{av:'edtavProdscs_Visible',ctrl:'vPRODSCS',prop:'Visible'},{av:'edtavArtprocod_Visible',ctrl:'vARTPROCOD',prop:'Visible'},{av:'edtArtComer_Visible',ctrl:'ARTCOMER',prop:'Visible'},{av:'chkArtActivo.getVisible()',ctrl:'ARTACTIVO',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122652',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV35TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV36TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV37TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV38TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV39TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV40TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV41TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV42TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV43TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV44TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV45TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV46TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV47TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV48TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV49TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV50TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV51TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV63TFArtActivo_Sel',fld:'vTFARTACTIVO_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132652',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV35TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV36TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV37TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV38TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV39TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV40TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV41TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV42TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV43TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV44TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV45TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV46TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV47TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV48TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV49TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV50TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV51TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV63TFArtActivo_Sel',fld:'vTFARTACTIVO_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e142652',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV35TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV36TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV37TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV38TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV39TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV40TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV41TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV42TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV43TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV44TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV45TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV46TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV47TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV48TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV49TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV50TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV51TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV63TFArtActivo_Sel',fld:'vTFARTACTIVO_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63TFArtActivo_Sel',fld:'vTFARTACTIVO_SEL',pic:''},{av:'AV50TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV51TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV48TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV49TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV46TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV47TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV44TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV45TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV42TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV43TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV40TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV41TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV38TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV39TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV36TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV37TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV34TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV35TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e222652',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV56GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV16NProc',fld:'vNPROC',pic:'ZZZ9'},{av:'AV18ProDscs',fld:'vPRODSCS',pic:''},{av:'AV17ProCods',fld:'vPROCODS',pic:''},{av:'AV19ArtProCod',fld:'vARTPROCOD',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e152652',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV35TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV36TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV37TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV38TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV39TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV40TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV41TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV42TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV43TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV44TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV45TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV46TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV47TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV48TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV49TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV50TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV51TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV63TFArtActivo_Sel',fld:'vTFARTACTIVO_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtArtCod_Visible',ctrl:'ARTCOD',prop:'Visible'},{av:'edtArtDsc_Visible',ctrl:'ARTDSC',prop:'Visible'},{av:'edtTipArtCod_Visible',ctrl:'TIPARTCOD',prop:'Visible'},{av:'edtTipArtDsc_Visible',ctrl:'TIPARTDSC',prop:'Visible'},{av:'edtArtPml_Visible',ctrl:'ARTPML',prop:'Visible'},{av:'edtArtGraAca_Visible',ctrl:'ARTGRAACA',prop:'Visible'},{av:'edtArtRen_Visible',ctrl:'ARTREN',prop:'Visible'},{av:'edtArtAcaMin_Visible',ctrl:'ARTACAMIN',prop:'Visible'},{av:'edtavNproc_Visible',ctrl:'vNPROC',prop:'Visible'},{av:'edtavProcods_Visible',ctrl:'vPROCODS',prop:'Visible'},{av:'edtavProdscs_Visible',ctrl:'vPRODSCS',prop:'Visible'},{av:'edtavArtprocod_Visible',ctrl:'vARTPROCOD',prop:'Visible'},{av:'edtArtComer_Visible',ctrl:'ARTCOMER',prop:'Visible'},{av:'chkArtActivo.getVisible()',ctrl:'ARTACTIVO',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e112652',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV35TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV36TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV37TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV38TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV39TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV40TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV41TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV42TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV43TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV44TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV45TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV46TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV47TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV48TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV49TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV50TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV51TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV63TFArtActivo_Sel',fld:'vTFARTACTIVO_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV35TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV36TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV37TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV38TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV39TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV40TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV41TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV42TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV43TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV44TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV45TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV46TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV47TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV48TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV49TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV50TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV51TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV63TFArtActivo_Sel',fld:'vTFARTACTIVO_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtArtCod_Visible',ctrl:'ARTCOD',prop:'Visible'},{av:'edtArtDsc_Visible',ctrl:'ARTDSC',prop:'Visible'},{av:'edtTipArtCod_Visible',ctrl:'TIPARTCOD',prop:'Visible'},{av:'edtTipArtDsc_Visible',ctrl:'TIPARTDSC',prop:'Visible'},{av:'edtArtPml_Visible',ctrl:'ARTPML',prop:'Visible'},{av:'edtArtGraAca_Visible',ctrl:'ARTGRAACA',prop:'Visible'},{av:'edtArtRen_Visible',ctrl:'ARTREN',prop:'Visible'},{av:'edtArtAcaMin_Visible',ctrl:'ARTACAMIN',prop:'Visible'},{av:'edtavNproc_Visible',ctrl:'vNPROC',prop:'Visible'},{av:'edtavProcods_Visible',ctrl:'vPROCODS',prop:'Visible'},{av:'edtavProdscs_Visible',ctrl:'vPRODSCS',prop:'Visible'},{av:'edtavArtprocod_Visible',ctrl:'vARTPROCOD',prop:'Visible'},{av:'edtArtComer_Visible',ctrl:'ARTCOMER',prop:'Visible'},{av:'chkArtActivo.getVisible()',ctrl:'ARTACTIVO',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e232652',iparms:[{av:'cmbavGridactions'},{av:'AV56GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV35TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV36TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV37TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV38TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV39TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV40TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV41TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV42TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV43TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV44TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV45TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV46TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV47TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV48TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV49TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV50TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV51TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV63TFArtActivo_Sel',fld:'vTFARTACTIVO_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV56GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtArtCod_Visible',ctrl:'ARTCOD',prop:'Visible'},{av:'edtArtDsc_Visible',ctrl:'ARTDSC',prop:'Visible'},{av:'edtTipArtCod_Visible',ctrl:'TIPARTCOD',prop:'Visible'},{av:'edtTipArtDsc_Visible',ctrl:'TIPARTDSC',prop:'Visible'},{av:'edtArtPml_Visible',ctrl:'ARTPML',prop:'Visible'},{av:'edtArtGraAca_Visible',ctrl:'ARTGRAACA',prop:'Visible'},{av:'edtArtRen_Visible',ctrl:'ARTREN',prop:'Visible'},{av:'edtArtAcaMin_Visible',ctrl:'ARTACAMIN',prop:'Visible'},{av:'edtavNproc_Visible',ctrl:'vNPROC',prop:'Visible'},{av:'edtavProcods_Visible',ctrl:'vPROCODS',prop:'Visible'},{av:'edtavProdscs_Visible',ctrl:'vPRODSCS',prop:'Visible'},{av:'edtavArtprocod_Visible',ctrl:'vARTPROCOD',prop:'Visible'},{av:'edtArtComer_Visible',ctrl:'ARTCOMER',prop:'Visible'},{av:'chkArtActivo.getVisible()',ctrl:'ARTACTIVO',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e162652',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A65ArtCod',fld:'ARTCOD',pic:'',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e172652',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV35TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV36TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV37TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV38TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV39TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV40TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV41TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV42TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV43TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV44TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV45TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV46TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV47TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV48TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV49TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV50TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV51TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV63TFArtActivo_Sel',fld:'vTFARTACTIVO_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV35TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV36TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV37TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV38TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV39TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV40TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV41TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV42TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV43TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV44TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV45TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV46TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV47TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV48TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV49TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV50TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV51TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV63TFArtActivo_Sel',fld:'vTFARTACTIVO_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtArtCod_Visible',ctrl:'ARTCOD',prop:'Visible'},{av:'edtArtDsc_Visible',ctrl:'ARTDSC',prop:'Visible'},{av:'edtTipArtCod_Visible',ctrl:'TIPARTCOD',prop:'Visible'},{av:'edtTipArtDsc_Visible',ctrl:'TIPARTDSC',prop:'Visible'},{av:'edtArtPml_Visible',ctrl:'ARTPML',prop:'Visible'},{av:'edtArtGraAca_Visible',ctrl:'ARTGRAACA',prop:'Visible'},{av:'edtArtRen_Visible',ctrl:'ARTREN',prop:'Visible'},{av:'edtArtAcaMin_Visible',ctrl:'ARTACAMIN',prop:'Visible'},{av:'edtavNproc_Visible',ctrl:'vNPROC',prop:'Visible'},{av:'edtavProcods_Visible',ctrl:'vPROCODS',prop:'Visible'},{av:'edtavProdscs_Visible',ctrl:'vPRODSCS',prop:'Visible'},{av:'edtavArtprocod_Visible',ctrl:'vARTPROCOD',prop:'Visible'},{av:'edtArtComer_Visible',ctrl:'ARTCOMER',prop:'Visible'},{av:'chkArtActivo.getVisible()',ctrl:'ARTACTIVO',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e182652',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV35TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV36TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV37TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV38TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV39TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV40TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV41TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV42TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV43TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV44TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV45TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV46TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV47TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV48TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV49TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV50TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV51TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV63TFArtActivo_Sel',fld:'vTFARTACTIVO_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV35TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV36TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV37TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV38TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV39TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV40TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV41TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV42TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV43TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV44TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV45TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV46TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV47TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV48TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV49TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV50TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV51TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV63TFArtActivo_Sel',fld:'vTFARTACTIVO_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtArtCod_Visible',ctrl:'ARTCOD',prop:'Visible'},{av:'edtArtDsc_Visible',ctrl:'ARTDSC',prop:'Visible'},{av:'edtTipArtCod_Visible',ctrl:'TIPARTCOD',prop:'Visible'},{av:'edtTipArtDsc_Visible',ctrl:'TIPARTDSC',prop:'Visible'},{av:'edtArtPml_Visible',ctrl:'ARTPML',prop:'Visible'},{av:'edtArtGraAca_Visible',ctrl:'ARTGRAACA',prop:'Visible'},{av:'edtArtRen_Visible',ctrl:'ARTREN',prop:'Visible'},{av:'edtArtAcaMin_Visible',ctrl:'ARTACAMIN',prop:'Visible'},{av:'edtavNproc_Visible',ctrl:'vNPROC',prop:'Visible'},{av:'edtavProcods_Visible',ctrl:'vPROCODS',prop:'Visible'},{av:'edtavProdscs_Visible',ctrl:'vPRODSCS',prop:'Visible'},{av:'edtavArtprocod_Visible',ctrl:'vARTPROCOD',prop:'Visible'},{av:'edtArtComer_Visible',ctrl:'ARTCOMER',prop:'Visible'},{av:'chkArtActivo.getVisible()',ctrl:'ARTACTIVO',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e192652',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV35TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV36TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV37TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV38TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV39TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV40TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV41TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV42TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV43TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV44TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV45TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV46TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV47TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV48TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV49TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV50TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV51TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV63TFArtActivo_Sel',fld:'vTFARTACTIVO_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV31TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV33TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFArtCod',fld:'vTFARTCOD',pic:''},{av:'AV35TFArtCod_Sel',fld:'vTFARTCOD_SEL',pic:''},{av:'AV36TFArtDsc',fld:'vTFARTDSC',pic:''},{av:'AV37TFArtDsc_Sel',fld:'vTFARTDSC_SEL',pic:''},{av:'AV38TFTipArtCod',fld:'vTFTIPARTCOD',pic:'ZZZ9'},{av:'AV39TFTipArtCod_To',fld:'vTFTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV40TFTipArtDsc',fld:'vTFTIPARTDSC',pic:''},{av:'AV41TFTipArtDsc_Sel',fld:'vTFTIPARTDSC_SEL',pic:''},{av:'AV42TFArtPml',fld:'vTFARTPML',pic:'ZZZ9'},{av:'AV43TFArtPml_To',fld:'vTFARTPML_TO',pic:'ZZZ9'},{av:'AV44TFArtGraAca',fld:'vTFARTGRAACA',pic:'ZZZ9'},{av:'AV45TFArtGraAca_To',fld:'vTFARTGRAACA_TO',pic:'ZZZ9'},{av:'AV46TFArtRen',fld:'vTFARTREN',pic:'ZZ9.99'},{av:'AV47TFArtRen_To',fld:'vTFARTREN_TO',pic:'ZZ9.99'},{av:'AV48TFArtAcaMin',fld:'vTFARTACAMIN',pic:'ZZ9'},{av:'AV49TFArtAcaMin_To',fld:'vTFARTACAMIN_TO',pic:'ZZ9'},{av:'AV50TFArtComer',fld:'vTFARTCOMER',pic:''},{av:'AV51TFArtComer_Sel',fld:'vTFARTCOMER_SEL',pic:''},{av:'AV63TFArtActivo_Sel',fld:'vTFARTACTIVO_SEL',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtArtCod_Visible',ctrl:'ARTCOD',prop:'Visible'},{av:'edtArtDsc_Visible',ctrl:'ARTDSC',prop:'Visible'},{av:'edtTipArtCod_Visible',ctrl:'TIPARTCOD',prop:'Visible'},{av:'edtTipArtDsc_Visible',ctrl:'TIPARTDSC',prop:'Visible'},{av:'edtArtPml_Visible',ctrl:'ARTPML',prop:'Visible'},{av:'edtArtGraAca_Visible',ctrl:'ARTGRAACA',prop:'Visible'},{av:'edtArtRen_Visible',ctrl:'ARTREN',prop:'Visible'},{av:'edtArtAcaMin_Visible',ctrl:'ARTACAMIN',prop:'Visible'},{av:'edtavNproc_Visible',ctrl:'vNPROC',prop:'Visible'},{av:'edtavProcods_Visible',ctrl:'vPROCODS',prop:'Visible'},{av:'edtavProdscs_Visible',ctrl:'vPRODSCS',prop:'Visible'},{av:'edtavArtprocod_Visible',ctrl:'vARTPROCOD',prop:'Visible'},{av:'edtArtComer_Visible',ctrl:'ARTCOMER',prop:'Visible'},{av:'chkArtActivo.getVisible()',ctrl:'ARTACTIVO',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_TIPARTCOD","{handler:'valid_Tipartcod',iparms:[]");
      setEventMetadata("VALID_TIPARTCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Artactivo',iparms:[]");
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
      AV15FilterFullText = "" ;
      A396EmprCod = "" ;
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV32TFCliNom = "" ;
      AV33TFCliNom_Sel = "" ;
      AV34TFArtCod = "" ;
      AV35TFArtCod_Sel = "" ;
      AV36TFArtDsc = "" ;
      AV37TFArtDsc_Sel = "" ;
      AV40TFTipArtDsc = "" ;
      AV41TFTipArtDsc_Sel = "" ;
      AV46TFArtRen = DecimalUtil.ZERO ;
      AV47TFArtRen_To = DecimalUtil.ZERO ;
      AV50TFArtComer = "" ;
      AV51TFArtComer_Sel = "" ;
      AV63TFArtActivo_Sel = "" ;
      AV66Pgmname = "" ;
      AV58EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV27ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV52DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      bttBtninsert_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A830TipArtDsc = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      AV17ProCods = "" ;
      AV18ProDscs = "" ;
      AV19ArtProCod = "" ;
      A5741ArtComer = "" ;
      A14295ArtActivo = "" ;
      scmdbuf = "" ;
      lV67Tarticu_wwds_1_filterfulltext = "" ;
      lV70Tarticu_wwds_4_tfclinom = "" ;
      lV72Tarticu_wwds_6_tfartcod = "" ;
      lV74Tarticu_wwds_8_tfartdsc = "" ;
      lV78Tarticu_wwds_12_tftipartdsc = "" ;
      lV88Tarticu_wwds_22_tfartcomer = "" ;
      AV67Tarticu_wwds_1_filterfulltext = "" ;
      AV71Tarticu_wwds_5_tfclinom_sel = "" ;
      AV70Tarticu_wwds_4_tfclinom = "" ;
      AV73Tarticu_wwds_7_tfartcod_sel = "" ;
      AV72Tarticu_wwds_6_tfartcod = "" ;
      AV75Tarticu_wwds_9_tfartdsc_sel = "" ;
      AV74Tarticu_wwds_8_tfartdsc = "" ;
      AV79Tarticu_wwds_13_tftipartdsc_sel = "" ;
      AV78Tarticu_wwds_12_tftipartdsc = "" ;
      AV84Tarticu_wwds_18_tfartren = DecimalUtil.ZERO ;
      AV85Tarticu_wwds_19_tfartren_to = DecimalUtil.ZERO ;
      AV89Tarticu_wwds_23_tfartcomer_sel = "" ;
      AV88Tarticu_wwds_22_tfartcomer = "" ;
      AV90Tarticu_wwds_24_tfartactivo_sel = "" ;
      A10045CliAct = "" ;
      H02652_A396EmprCod = new String[] {""} ;
      H02652_A10045CliAct = new String[] {""} ;
      H02652_A14295ArtActivo = new String[] {""} ;
      H02652_A5741ArtComer = new String[] {""} ;
      H02652_n5741ArtComer = new boolean[] {false} ;
      H02652_A63ArtAcaMin = new short[1] ;
      H02652_n63ArtAcaMin = new boolean[] {false} ;
      H02652_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02652_n95ArtRen = new boolean[] {false} ;
      H02652_A1903ArtGraAca = new short[1] ;
      H02652_n1903ArtGraAca = new boolean[] {false} ;
      H02652_A1148ArtPml = new short[1] ;
      H02652_n1148ArtPml = new boolean[] {false} ;
      H02652_A830TipArtDsc = new String[] {""} ;
      H02652_n830TipArtDsc = new boolean[] {false} ;
      H02652_A829TipArtCod = new short[1] ;
      H02652_A69ArtDsc = new String[] {""} ;
      H02652_n69ArtDsc = new boolean[] {false} ;
      H02652_A65ArtCod = new String[] {""} ;
      H02652_A279CliNom = new String[] {""} ;
      H02652_A252CliCod = new int[1] ;
      H02653_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV59Station = "" ;
      AV60EmprNom = "" ;
      AV61UsurCod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV26Session = httpContext.getWebSession();
      AV22ColumnsSelectorXML = "" ;
      GXv_int8 = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV28ManageFiltersXml = "" ;
      AV20ExcelFilename = "" ;
      AV21ErrorMessage = "" ;
      AV23UserCustomValue = "" ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char20 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState21 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticu_ww__default(),
         new Object[] {
             new Object[] {
            H02652_A396EmprCod, H02652_A10045CliAct, H02652_A14295ArtActivo, H02652_A5741ArtComer, H02652_n5741ArtComer, H02652_A63ArtAcaMin, H02652_n63ArtAcaMin, H02652_A95ArtRen, H02652_n95ArtRen, H02652_A1903ArtGraAca,
            H02652_n1903ArtGraAca, H02652_A1148ArtPml, H02652_n1148ArtPml, H02652_A830TipArtDsc, H02652_n830TipArtDsc, H02652_A829TipArtCod, H02652_A69ArtDsc, H02652_n69ArtDsc, H02652_A65ArtCod, H02652_A279CliNom,
            H02652_A252CliCod
            }
            , new Object[] {
            H02653_AGRID_nRecordCount
            }
         }
      );
      AV66Pgmname = "Tarticu_WW" ;
      /* GeneXus formulas. */
      AV66Pgmname = "Tarticu_WW" ;
      Gx_err = (short)(0) ;
      edtavNproc_Enabled = 0 ;
      edtavProcods_Enabled = 0 ;
      edtavProdscs_Enabled = 0 ;
      edtavArtprocod_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV29ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
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
   private short AV38TFTipArtCod ;
   private short AV39TFTipArtCod_To ;
   private short AV42TFArtPml ;
   private short AV43TFArtPml_To ;
   private short AV44TFArtGraAca ;
   private short AV45TFArtGraAca_To ;
   private short AV48TFArtAcaMin ;
   private short AV49TFArtAcaMin_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV56GridActions ;
   private short A829TipArtCod ;
   private short A1148ArtPml ;
   private short A1903ArtGraAca ;
   private short A63ArtAcaMin ;
   private short AV16NProc ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV76Tarticu_wwds_10_tftipartcod ;
   private short AV77Tarticu_wwds_11_tftipartcod_to ;
   private short AV80Tarticu_wwds_14_tfartpml ;
   private short AV81Tarticu_wwds_15_tfartpml_to ;
   private short AV82Tarticu_wwds_16_tfartgraaca ;
   private short AV83Tarticu_wwds_17_tfartgraaca_to ;
   private short AV86Tarticu_wwds_20_tfartacamin ;
   private short AV87Tarticu_wwds_21_tfartacamin_to ;
   private short GXv_int8[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV30TFCliCod ;
   private int AV31TFCliCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int edtavNproc_Enabled ;
   private int edtavProcods_Enabled ;
   private int edtavProdscs_Enabled ;
   private int edtavArtprocod_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV68Tarticu_wwds_2_tfclicod ;
   private int AV69Tarticu_wwds_3_tfclicod_to ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtArtCod_Visible ;
   private int edtArtDsc_Visible ;
   private int edtTipArtCod_Visible ;
   private int edtTipArtDsc_Visible ;
   private int edtArtPml_Visible ;
   private int edtArtGraAca_Visible ;
   private int edtArtRen_Visible ;
   private int edtArtAcaMin_Visible ;
   private int edtavNproc_Visible ;
   private int edtavProcods_Visible ;
   private int edtavProdscs_Visible ;
   private int edtavArtprocod_Visible ;
   private int edtArtComer_Visible ;
   private int AV53PageToGo ;
   private int AV91GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV54GridCurrentPage ;
   private long AV55GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV46TFArtRen ;
   private java.math.BigDecimal AV47TFArtRen_To ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal AV84Tarticu_wwds_18_tfartren ;
   private java.math.BigDecimal AV85Tarticu_wwds_19_tfartren_to ;
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
   private String sGXsfl_45_idx="0001" ;
   private String A396EmprCod ;
   private String AV32TFCliNom ;
   private String AV33TFCliNom_Sel ;
   private String AV34TFArtCod ;
   private String AV35TFArtCod_Sel ;
   private String AV36TFArtDsc ;
   private String AV37TFArtDsc_Sel ;
   private String AV40TFTipArtDsc ;
   private String AV41TFTipArtDsc_Sel ;
   private String AV50TFArtComer ;
   private String AV51TFArtComer_Sel ;
   private String AV63TFArtActivo_Sel ;
   private String AV66Pgmname ;
   private String AV58EmprCod ;
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
   private String Ddo_grid_Datalistfixedvalues ;
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
   private String Grid_empowerer_Fixedcolumns ;
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
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A65ArtCod ;
   private String edtArtCod_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Internalname ;
   private String edtTipArtCod_Internalname ;
   private String A830TipArtDsc ;
   private String edtTipArtDsc_Internalname ;
   private String edtArtPml_Internalname ;
   private String edtArtGraAca_Internalname ;
   private String edtArtRen_Internalname ;
   private String edtArtAcaMin_Internalname ;
   private String edtavNproc_Internalname ;
   private String AV17ProCods ;
   private String edtavProcods_Internalname ;
   private String AV18ProDscs ;
   private String edtavProdscs_Internalname ;
   private String AV19ArtProCod ;
   private String edtavArtprocod_Internalname ;
   private String A5741ArtComer ;
   private String edtArtComer_Internalname ;
   private String A14295ArtActivo ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV70Tarticu_wwds_4_tfclinom ;
   private String lV72Tarticu_wwds_6_tfartcod ;
   private String lV74Tarticu_wwds_8_tfartdsc ;
   private String lV78Tarticu_wwds_12_tftipartdsc ;
   private String lV88Tarticu_wwds_22_tfartcomer ;
   private String AV71Tarticu_wwds_5_tfclinom_sel ;
   private String AV70Tarticu_wwds_4_tfclinom ;
   private String AV73Tarticu_wwds_7_tfartcod_sel ;
   private String AV72Tarticu_wwds_6_tfartcod ;
   private String AV75Tarticu_wwds_9_tfartdsc_sel ;
   private String AV74Tarticu_wwds_8_tfartdsc ;
   private String AV79Tarticu_wwds_13_tftipartdsc_sel ;
   private String AV78Tarticu_wwds_12_tftipartdsc ;
   private String AV89Tarticu_wwds_23_tfartcomer_sel ;
   private String AV88Tarticu_wwds_22_tfartcomer ;
   private String AV90Tarticu_wwds_24_tfartactivo_sel ;
   private String A10045CliAct ;
   private String hsh ;
   private String AV59Station ;
   private String AV60EmprNom ;
   private String AV61UsurCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char15 ;
   private String GXv_char16[] ;
   private String GXt_char14 ;
   private String GXv_char4[] ;
   private String GXt_char13 ;
   private String GXv_char3[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtArtCod_Jsonclick ;
   private String edtArtDsc_Jsonclick ;
   private String edtTipArtCod_Jsonclick ;
   private String edtTipArtDsc_Jsonclick ;
   private String edtArtPml_Jsonclick ;
   private String edtArtGraAca_Jsonclick ;
   private String edtArtRen_Jsonclick ;
   private String edtArtAcaMin_Jsonclick ;
   private String edtavNproc_Jsonclick ;
   private String edtavProcods_Jsonclick ;
   private String edtavProdscs_Jsonclick ;
   private String edtavArtprocod_Jsonclick ;
   private String edtArtComer_Jsonclick ;
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
   private boolean n69ArtDsc ;
   private boolean n830TipArtDsc ;
   private boolean n1148ArtPml ;
   private boolean n1903ArtGraAca ;
   private boolean n95ArtRen ;
   private boolean n63ArtAcaMin ;
   private boolean n5741ArtComer ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV22ColumnsSelectorXML ;
   private String AV28ManageFiltersXml ;
   private String AV23UserCustomValue ;
   private String AV15FilterFullText ;
   private String lV67Tarticu_wwds_1_filterfulltext ;
   private String AV67Tarticu_wwds_1_filterfulltext ;
   private String AV20ExcelFilename ;
   private String AV21ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkArtActivo ;
   private IDataStoreProvider pr_default ;
   private String[] H02652_A396EmprCod ;
   private String[] H02652_A10045CliAct ;
   private String[] H02652_A14295ArtActivo ;
   private String[] H02652_A5741ArtComer ;
   private boolean[] H02652_n5741ArtComer ;
   private short[] H02652_A63ArtAcaMin ;
   private boolean[] H02652_n63ArtAcaMin ;
   private java.math.BigDecimal[] H02652_A95ArtRen ;
   private boolean[] H02652_n95ArtRen ;
   private short[] H02652_A1903ArtGraAca ;
   private boolean[] H02652_n1903ArtGraAca ;
   private short[] H02652_A1148ArtPml ;
   private boolean[] H02652_n1148ArtPml ;
   private String[] H02652_A830TipArtDsc ;
   private boolean[] H02652_n830TipArtDsc ;
   private short[] H02652_A829TipArtCod ;
   private String[] H02652_A69ArtDsc ;
   private boolean[] H02652_n69ArtDsc ;
   private String[] H02652_A65ArtCod ;
   private String[] H02652_A279CliNom ;
   private int[] H02652_A252CliCod ;
   private long[] H02653_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV27ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState21[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV52DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tarticu_ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02652( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Tarticu_wwds_1_filterfulltext ,
                                          int AV68Tarticu_wwds_2_tfclicod ,
                                          int AV69Tarticu_wwds_3_tfclicod_to ,
                                          String AV71Tarticu_wwds_5_tfclinom_sel ,
                                          String AV70Tarticu_wwds_4_tfclinom ,
                                          String AV73Tarticu_wwds_7_tfartcod_sel ,
                                          String AV72Tarticu_wwds_6_tfartcod ,
                                          String AV75Tarticu_wwds_9_tfartdsc_sel ,
                                          String AV74Tarticu_wwds_8_tfartdsc ,
                                          short AV76Tarticu_wwds_10_tftipartcod ,
                                          short AV77Tarticu_wwds_11_tftipartcod_to ,
                                          String AV79Tarticu_wwds_13_tftipartdsc_sel ,
                                          String AV78Tarticu_wwds_12_tftipartdsc ,
                                          short AV80Tarticu_wwds_14_tfartpml ,
                                          short AV81Tarticu_wwds_15_tfartpml_to ,
                                          short AV82Tarticu_wwds_16_tfartgraaca ,
                                          short AV83Tarticu_wwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV84Tarticu_wwds_18_tfartren ,
                                          java.math.BigDecimal AV85Tarticu_wwds_19_tfartren_to ,
                                          short AV86Tarticu_wwds_20_tfartacamin ,
                                          short AV87Tarticu_wwds_21_tfartacamin_to ,
                                          String AV89Tarticu_wwds_23_tfartcomer_sel ,
                                          String AV88Tarticu_wwds_22_tfartcomer ,
                                          String AV90Tarticu_wwds_24_tfartactivo_sel ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A1148ArtPml ,
                                          short A1903ArtGraAca ,
                                          java.math.BigDecimal A95ArtRen ,
                                          short A63ArtAcaMin ,
                                          String A5741ArtComer ,
                                          String A14295ArtActivo ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A10045CliAct ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[40];
      Object[] GXv_Object23 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T2.CliAct, T1.ArtActivo, T1.ArtComer, T1.ArtAcaMin, T1.ArtRen, T1.ArtGraAca, T1.ArtPml, T3.TipArtDsc, T1.TipArtCod, T1.ArtDsc, T1.ArtCod, T2.CliNom," ;
      sSelectString += " T1.CliCod" ;
      sFromString = " FROM ((TXPARTICU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod" ;
      sFromString += " = T1.TipArtCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod > 0)");
      addWhere(sWhereString, "(T2.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV67Tarticu_wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T3.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int22[1] = (byte)(1) ;
         GXv_int22[2] = (byte)(1) ;
         GXv_int22[3] = (byte)(1) ;
         GXv_int22[4] = (byte)(1) ;
         GXv_int22[5] = (byte)(1) ;
         GXv_int22[6] = (byte)(1) ;
         GXv_int22[7] = (byte)(1) ;
         GXv_int22[8] = (byte)(1) ;
         GXv_int22[9] = (byte)(1) ;
         GXv_int22[10] = (byte)(1) ;
         GXv_int22[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Tarticu_wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! (0==AV69Tarticu_wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Tarticu_wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV70Tarticu_wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tarticu_wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Tarticu_wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV72Tarticu_wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Tarticu_wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Tarticu_wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Tarticu_wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Tarticu_wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
      }
      if ( ! (0==AV76Tarticu_wwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int22[20] = (byte)(1) ;
      }
      if ( ! (0==AV77Tarticu_wwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int22[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Tarticu_wwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Tarticu_wwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tarticu_wwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int22[23] = (byte)(1) ;
      }
      if ( ! (0==AV80Tarticu_wwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int22[24] = (byte)(1) ;
      }
      if ( ! (0==AV81Tarticu_wwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int22[25] = (byte)(1) ;
      }
      if ( ! (0==AV82Tarticu_wwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int22[26] = (byte)(1) ;
      }
      if ( ! (0==AV83Tarticu_wwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int22[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Tarticu_wwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int22[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Tarticu_wwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int22[29] = (byte)(1) ;
      }
      if ( ! (0==AV86Tarticu_wwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int22[30] = (byte)(1) ;
      }
      if ( ! (0==AV87Tarticu_wwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int22[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tarticu_wwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV88Tarticu_wwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tarticu_wwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int22[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tarticu_wwds_24_tfartactivo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtActivo = ?)");
      }
      else
      {
         GXv_int22[34] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ArtCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ArtCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ArtDsc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ArtDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.TipArtCod" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.TipArtCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ArtPml" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ArtPml DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ArtGraAca" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ArtGraAca DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ArtRen" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ArtRen DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ArtAcaMin" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ArtAcaMin DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ArtComer" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ArtComer DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ArtActivo" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ArtActivo DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_H02653( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Tarticu_wwds_1_filterfulltext ,
                                          int AV68Tarticu_wwds_2_tfclicod ,
                                          int AV69Tarticu_wwds_3_tfclicod_to ,
                                          String AV71Tarticu_wwds_5_tfclinom_sel ,
                                          String AV70Tarticu_wwds_4_tfclinom ,
                                          String AV73Tarticu_wwds_7_tfartcod_sel ,
                                          String AV72Tarticu_wwds_6_tfartcod ,
                                          String AV75Tarticu_wwds_9_tfartdsc_sel ,
                                          String AV74Tarticu_wwds_8_tfartdsc ,
                                          short AV76Tarticu_wwds_10_tftipartcod ,
                                          short AV77Tarticu_wwds_11_tftipartcod_to ,
                                          String AV79Tarticu_wwds_13_tftipartdsc_sel ,
                                          String AV78Tarticu_wwds_12_tftipartdsc ,
                                          short AV80Tarticu_wwds_14_tfartpml ,
                                          short AV81Tarticu_wwds_15_tfartpml_to ,
                                          short AV82Tarticu_wwds_16_tfartgraaca ,
                                          short AV83Tarticu_wwds_17_tfartgraaca_to ,
                                          java.math.BigDecimal AV84Tarticu_wwds_18_tfartren ,
                                          java.math.BigDecimal AV85Tarticu_wwds_19_tfartren_to ,
                                          short AV86Tarticu_wwds_20_tfartacamin ,
                                          short AV87Tarticu_wwds_21_tfartacamin_to ,
                                          String AV89Tarticu_wwds_23_tfartcomer_sel ,
                                          String AV88Tarticu_wwds_22_tfartcomer ,
                                          String AV90Tarticu_wwds_24_tfartactivo_sel ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A1148ArtPml ,
                                          short A1903ArtGraAca ,
                                          java.math.BigDecimal A95ArtRen ,
                                          short A63ArtAcaMin ,
                                          String A5741ArtComer ,
                                          String A14295ArtActivo ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A10045CliAct ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[35];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPARTICU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.TipArtCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod > 0)");
      addWhere(sWhereString, "(T2.CliAct = 'S')");
      if ( ! (GXutil.strcmp("", AV67Tarticu_wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T1.ArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(T3.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ArtPml,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtGraAca,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtRen,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ArtAcaMin,'990'), 2) like '%' || ?) or ( UPPER(T1.ArtComer) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int24[1] = (byte)(1) ;
         GXv_int24[2] = (byte)(1) ;
         GXv_int24[3] = (byte)(1) ;
         GXv_int24[4] = (byte)(1) ;
         GXv_int24[5] = (byte)(1) ;
         GXv_int24[6] = (byte)(1) ;
         GXv_int24[7] = (byte)(1) ;
         GXv_int24[8] = (byte)(1) ;
         GXv_int24[9] = (byte)(1) ;
         GXv_int24[10] = (byte)(1) ;
         GXv_int24[11] = (byte)(1) ;
      }
      if ( ! (0==AV68Tarticu_wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int24[12] = (byte)(1) ;
      }
      if ( ! (0==AV69Tarticu_wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int24[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Tarticu_wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV70Tarticu_wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Tarticu_wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int24[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Tarticu_wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV72Tarticu_wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Tarticu_wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int24[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Tarticu_wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Tarticu_wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Tarticu_wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtDsc = ?)");
      }
      else
      {
         GXv_int24[19] = (byte)(1) ;
      }
      if ( ! (0==AV76Tarticu_wwds_10_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int24[20] = (byte)(1) ;
      }
      if ( ! (0==AV77Tarticu_wwds_11_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int24[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Tarticu_wwds_13_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Tarticu_wwds_12_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Tarticu_wwds_13_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int24[23] = (byte)(1) ;
      }
      if ( ! (0==AV80Tarticu_wwds_14_tfartpml) )
      {
         addWhere(sWhereString, "(T1.ArtPml >= ?)");
      }
      else
      {
         GXv_int24[24] = (byte)(1) ;
      }
      if ( ! (0==AV81Tarticu_wwds_15_tfartpml_to) )
      {
         addWhere(sWhereString, "(T1.ArtPml <= ?)");
      }
      else
      {
         GXv_int24[25] = (byte)(1) ;
      }
      if ( ! (0==AV82Tarticu_wwds_16_tfartgraaca) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca >= ?)");
      }
      else
      {
         GXv_int24[26] = (byte)(1) ;
      }
      if ( ! (0==AV83Tarticu_wwds_17_tfartgraaca_to) )
      {
         addWhere(sWhereString, "(T1.ArtGraAca <= ?)");
      }
      else
      {
         GXv_int24[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Tarticu_wwds_18_tfartren)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen >= ?)");
      }
      else
      {
         GXv_int24[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Tarticu_wwds_19_tfartren_to)==0) )
      {
         addWhere(sWhereString, "(T1.ArtRen <= ?)");
      }
      else
      {
         GXv_int24[29] = (byte)(1) ;
      }
      if ( ! (0==AV86Tarticu_wwds_20_tfartacamin) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin >= ?)");
      }
      else
      {
         GXv_int24[30] = (byte)(1) ;
      }
      if ( ! (0==AV87Tarticu_wwds_21_tfartacamin_to) )
      {
         addWhere(sWhereString, "(T1.ArtAcaMin <= ?)");
      }
      else
      {
         GXv_int24[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Tarticu_wwds_23_tfartcomer_sel)==0) && ( ! (GXutil.strcmp("", AV88Tarticu_wwds_22_tfartcomer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtComer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tarticu_wwds_23_tfartcomer_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtComer = ?)");
      }
      else
      {
         GXv_int24[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tarticu_wwds_24_tfartactivo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtActivo = ?)");
      }
      else
      {
         GXv_int24[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
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
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
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
                  return conditional_H02652(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , (String)dynConstraints[39] );
            case 1 :
                  return conditional_H02653(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , (String)dynConstraints[39] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02652", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02653", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((String[]) buf[16])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 16);
               ((String[]) buf[19])[0] = rslt.getString(13, 30);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
      }
   }

}

