package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webpartesproduccion_impl extends GXDataArea
{
   public webpartesproduccion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webpartesproduccion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webpartesproduccion_impl.class ));
   }

   public webpartesproduccion_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGrupodeacciones = new HTMLChoice();
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
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
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
      AV130FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV44ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV39ColumnsSelector);
      AV46TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV47TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV110TFMaqDsc = httpContext.GetPar( "TFMaqDsc") ;
      AV111TFMaqDsc_Sel = httpContext.GetPar( "TFMaqDsc_Sel") ;
      AV49TFHisProFec = localUtil.parseDateParm( httpContext.GetPar( "TFHisProFec")) ;
      AV54TFHisProLin = (int)(GXutil.lval( httpContext.GetPar( "TFHisProLin"))) ;
      AV55TFHisProLin_To = (int)(GXutil.lval( httpContext.GetPar( "TFHisProLin_To"))) ;
      AV57TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV58TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV60TFGruOpeCod = (int)(GXutil.lval( httpContext.GetPar( "TFGruOpeCod"))) ;
      AV61TFGruOpeCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFGruOpeCod_To"))) ;
      AV63TFBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin"))) ;
      AV64TFBarOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin_To"))) ;
      AV66TFFase = httpContext.GetPar( "TFFase") ;
      AV67TFFase_Sel = httpContext.GetPar( "TFFase_Sel") ;
      AV72TFHisProDTI = localUtil.parseDTimeParm( httpContext.GetPar( "TFHisProDTI")) ;
      AV77TFHisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "TFHisProDTF")) ;
      AV82TFHisProF = httpContext.GetPar( "TFHisProF") ;
      AV83TFHisProF_Sel = httpContext.GetPar( "TFHisProF_Sel") ;
      AV85TFHisProTur = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProTur"))) ;
      AV86TFHisProTur_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProTur_To"))) ;
      AV88TFHisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr"), ".") ;
      AV89TFHisProKgr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr_To"), ".") ;
      AV91TFHisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr"), ".") ;
      AV92TFHisProMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr_To"), ".") ;
      AV94TFHisProNpzs = (short)(GXutil.lval( httpContext.GetPar( "TFHisProNpzs"))) ;
      AV95TFHisProNpzs_To = (short)(GXutil.lval( httpContext.GetPar( "TFHisProNpzs_To"))) ;
      AV100TFParCodNom = httpContext.GetPar( "TFParCodNom") ;
      AV101TFParCodNom_Sel = httpContext.GetPar( "TFParCodNom_Sel") ;
      AV171Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV117Carvema = (short)(GXutil.lval( httpContext.GetPar( "Carvema"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV130FilterFullText, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV46TFMaqCod, AV47TFMaqCod_Sel, AV110TFMaqDsc, AV111TFMaqDsc_Sel, AV49TFHisProFec, AV54TFHisProLin, AV55TFHisProLin_To, AV57TFBarNHdr, AV58TFBarNHdr_Sel, AV60TFGruOpeCod, AV61TFGruOpeCod_To, AV63TFBarOrdLin, AV64TFBarOrdLin_To, AV66TFFase, AV67TFFase_Sel, AV72TFHisProDTI, AV77TFHisProDTF, AV82TFHisProF, AV83TFHisProF_Sel, AV85TFHisProTur, AV86TFHisProTur_To, AV88TFHisProKgr, AV89TFHisProKgr_To, AV91TFHisProMtr, AV92TFHisProMtr_To, AV94TFHisProNpzs, AV95TFHisProNpzs_To, AV100TFParCodNom, AV101TFParCodNom_Sel, AV171Pgmname, AV13OrderedBy, AV14OrderedDsc, AV117Carvema) ;
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
      paHM2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startHM2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webpartesproduccion", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV171Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVEMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV117Carvema), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV130FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV42ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV42ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV105GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV106GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV103DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV103DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV39ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV39ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV44ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD", GXutil.rtrim( AV46TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD_SEL", GXutil.rtrim( AV47TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQDSC", GXutil.rtrim( AV110TFMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQDSC_SEL", GXutil.rtrim( AV111TFMaqDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPROFEC", localUtil.dtoc( AV49TFHisProFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPROLIN", GXutil.ltrim( localUtil.ntoc( AV54TFHisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPROLIN_TO", GXutil.ltrim( localUtil.ntoc( AV55TFHisProLin_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR", GXutil.rtrim( AV57TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR_SEL", GXutil.rtrim( AV58TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGRUOPECOD", GXutil.ltrim( localUtil.ntoc( AV60TFGruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGRUOPECOD_TO", GXutil.ltrim( localUtil.ntoc( AV61TFGruOpeCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV63TFBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV64TFBarOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASE", GXutil.rtrim( AV66TFFase));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASE_SEL", GXutil.rtrim( AV67TFFase_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPRODTI", localUtil.ttoc( AV72TFHisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPRODTF", localUtil.ttoc( AV77TFHisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPROF", GXutil.rtrim( AV82TFHisProF));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPROF_SEL", GXutil.rtrim( AV83TFHisProF_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPROTUR", GXutil.ltrim( localUtil.ntoc( AV85TFHisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPROTUR_TO", GXutil.ltrim( localUtil.ntoc( AV86TFHisProTur_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPROKGR", GXutil.ltrim( localUtil.ntoc( AV88TFHisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPROKGR_TO", GXutil.ltrim( localUtil.ntoc( AV89TFHisProKgr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPROMTR", GXutil.ltrim( localUtil.ntoc( AV91TFHisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPROMTR_TO", GXutil.ltrim( localUtil.ntoc( AV92TFHisProMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPRONPZS", GXutil.ltrim( localUtil.ntoc( AV94TFHisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPRONPZS_TO", GXutil.ltrim( localUtil.ntoc( AV95TFHisProNpzs_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPARCODNOM", GXutil.rtrim( AV100TFParCodNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPARCODNOM_SEL", GXutil.rtrim( AV101TFParCodNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV171Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV171Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV13OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV14OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV112EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV114UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV115Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVEMA", GXutil.ltrim( localUtil.ntoc( AV117Carvema, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVEMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV117Carvema), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASEDSC", GXutil.rtrim( A7258FaseDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DLTLINEA_Title", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DLTLINEA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DLTLINEA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DLTLINEA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DLTLINEA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DLTLINEA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DLTLINEA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DLTLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DLTLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_dltlinea_Result));
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
         weHM2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtHM2( ) ;
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
      return formatLink("app.webpartesproduccion", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebPartesProduccion" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Table LHIPRO", "") ;
   }

   public void wbHM0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebPartesProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebPartesProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebPartesProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_HM2( true) ;
      }
      else
      {
         wb_table1_23_HM2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_HM2e( boolean wbgen )
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
         startgridcontrol41( ) ;
      }
      if ( wbEnd == 41 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_41 = (int)(nGXsfl_41_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV105GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV106GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV103DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV103DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV39ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_70_HM2( true) ;
      }
      else
      {
         wb_table2_70_HM2( false) ;
      }
      return  ;
   }

   public void wb_table2_70_HM2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprofecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprofecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprofecauxdate_Internalname, localUtil.format(AV51DDO_HisProFecAuxDate, "99/99/99"), localUtil.format( AV51DDO_HisProFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprofecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccion.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprofecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebPartesProduccion.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodtiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodtiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodtiauxdate_Internalname, localUtil.format(AV74DDO_HisProDTIAuxDate, "99/99/99"), localUtil.format( AV74DDO_HisProDTIAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodtiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccion.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodtiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebPartesProduccion.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodtfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodtfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodtfauxdate_Internalname, localUtil.format(AV79DDO_HisProDTFAuxDate, "99/99/99"), localUtil.format( AV79DDO_HisProDTFAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodtfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebPartesProduccion.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodtfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebPartesProduccion.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 41 )
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

   public void startHM2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Table LHIPRO", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupHM0( ) ;
   }

   public void wsHM2( )
   {
      startHM2( ) ;
      evtHM2( ) ;
   }

   public void evtHM2( )
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
                           e11HM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12HM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13HM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14HM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15HM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_DLTLINEA.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16HM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17HM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e18HM2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) )
                        {
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
                           cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
                           AV138Grupodeacciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138Grupodeacciones), 4, 0));
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
                           n606MaqDsc = false ;
                           A558HisProFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtHisProFec_Internalname), 0)) ;
                           A561HisProLin = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtGruOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A461Fase = httpContext.cgiGet( edtFase_Internalname) ;
                           A4440HisProDTI = localUtil.ctot( httpContext.cgiGet( edtHisProDTI_Internalname), 0) ;
                           n4440HisProDTI = false ;
                           A4441HisProDTF = localUtil.ctot( httpContext.cgiGet( edtHisProDTF_Internalname), 0) ;
                           n4441HisProDTF = false ;
                           A557HisProF = GXutil.upper( httpContext.cgiGet( edtHisProF_Internalname)) ;
                           A566HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1525HisProKgr = localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)) ;
                           A1526HisProMtr = localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)) ;
                           A4714HisProNpzs = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProNpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A867ParCodNom = httpContext.cgiGet( edtParCodNom_Internalname) ;
                           n867ParCodNom = false ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19HM2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e20HM2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e21HM2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRUPODEACCIONES.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22HM2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV130FilterFullText) != 0 )
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

   public void weHM2( )
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

   public void paHM2( )
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
      subsflControlProps_412( ) ;
      while ( nGXsfl_41_idx <= nRC_GXsfl_41 )
      {
         sendrow_412( ) ;
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV130FilterFullText ,
                                 byte AV44ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV39ColumnsSelector ,
                                 String AV46TFMaqCod ,
                                 String AV47TFMaqCod_Sel ,
                                 String AV110TFMaqDsc ,
                                 String AV111TFMaqDsc_Sel ,
                                 java.util.Date AV49TFHisProFec ,
                                 int AV54TFHisProLin ,
                                 int AV55TFHisProLin_To ,
                                 String AV57TFBarNHdr ,
                                 String AV58TFBarNHdr_Sel ,
                                 int AV60TFGruOpeCod ,
                                 int AV61TFGruOpeCod_To ,
                                 short AV63TFBarOrdLin ,
                                 short AV64TFBarOrdLin_To ,
                                 String AV66TFFase ,
                                 String AV67TFFase_Sel ,
                                 java.util.Date AV72TFHisProDTI ,
                                 java.util.Date AV77TFHisProDTF ,
                                 String AV82TFHisProF ,
                                 String AV83TFHisProF_Sel ,
                                 byte AV85TFHisProTur ,
                                 byte AV86TFHisProTur_To ,
                                 java.math.BigDecimal AV88TFHisProKgr ,
                                 java.math.BigDecimal AV89TFHisProKgr_To ,
                                 java.math.BigDecimal AV91TFHisProMtr ,
                                 java.math.BigDecimal AV92TFHisProMtr_To ,
                                 short AV94TFHisProNpzs ,
                                 short AV95TFHisProNpzs_To ,
                                 String AV100TFParCodNom ,
                                 String AV101TFParCodNom_Sel ,
                                 String AV171Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc ,
                                 short AV117Carvema )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e20HM2 ();
      GRID_nCurrentRecord = 0 ;
      rfHM2( ) ;
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
      rfHM2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV171Pgmname = "WebPartesProduccion" ;
      Gx_err = (short)(0) ;
   }

   public void rfHM2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e20HM2 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
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
         subsflControlProps_412( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV141Webpartesproduccionds_1_filterfulltext ,
                                              AV143Webpartesproduccionds_3_tfmaqcod_sel ,
                                              AV142Webpartesproduccionds_2_tfmaqcod ,
                                              AV145Webpartesproduccionds_5_tfmaqdsc_sel ,
                                              AV144Webpartesproduccionds_4_tfmaqdsc ,
                                              AV146Webpartesproduccionds_6_tfhisprofec ,
                                              Integer.valueOf(AV147Webpartesproduccionds_7_tfhisprolin) ,
                                              Integer.valueOf(AV148Webpartesproduccionds_8_tfhisprolin_to) ,
                                              AV150Webpartesproduccionds_10_tfbarnhdr_sel ,
                                              AV149Webpartesproduccionds_9_tfbarnhdr ,
                                              Integer.valueOf(AV151Webpartesproduccionds_11_tfgruopecod) ,
                                              Integer.valueOf(AV152Webpartesproduccionds_12_tfgruopecod_to) ,
                                              Short.valueOf(AV153Webpartesproduccionds_13_tfbarordlin) ,
                                              Short.valueOf(AV154Webpartesproduccionds_14_tfbarordlin_to) ,
                                              AV156Webpartesproduccionds_16_tffase_sel ,
                                              AV155Webpartesproduccionds_15_tffase ,
                                              AV157Webpartesproduccionds_17_tfhisprodti ,
                                              AV158Webpartesproduccionds_18_tfhisprodtf ,
                                              AV160Webpartesproduccionds_20_tfhisprof_sel ,
                                              AV159Webpartesproduccionds_19_tfhisprof ,
                                              Byte.valueOf(AV161Webpartesproduccionds_21_tfhisprotur) ,
                                              Byte.valueOf(AV162Webpartesproduccionds_22_tfhisprotur_to) ,
                                              AV163Webpartesproduccionds_23_tfhisprokgr ,
                                              AV164Webpartesproduccionds_24_tfhisprokgr_to ,
                                              AV165Webpartesproduccionds_25_tfhispromtr ,
                                              AV166Webpartesproduccionds_26_tfhispromtr_to ,
                                              Short.valueOf(AV167Webpartesproduccionds_27_tfhispronpzs) ,
                                              Short.valueOf(AV168Webpartesproduccionds_28_tfhispronpzs_to) ,
                                              AV170Webpartesproduccionds_30_tfparcodnom_sel ,
                                              AV169Webpartesproduccionds_29_tfparcodnom ,
                                              A602MaqCod ,
                                              A606MaqDsc ,
                                              Integer.valueOf(A561HisProLin) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Integer.valueOf(A503GruOpeCod) ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              A461Fase ,
                                              A557HisProF ,
                                              Byte.valueOf(A566HisProTur) ,
                                              A1525HisProKgr ,
                                              A1526HisProMtr ,
                                              Short.valueOf(A4714HisProNpzs) ,
                                              A867ParCodNom ,
                                              A558HisProFec ,
                                              A4440HisProDTI ,
                                              A4441HisProDTF ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                              TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                              }
         });
         lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
         lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
         lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
         lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
         lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
         lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
         lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
         lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
         lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
         lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
         lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
         lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
         lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
         lV142Webpartesproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV142Webpartesproduccionds_2_tfmaqcod), 6, "%") ;
         lV144Webpartesproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV144Webpartesproduccionds_4_tfmaqdsc), 16, "%") ;
         lV149Webpartesproduccionds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV149Webpartesproduccionds_9_tfbarnhdr), 11, "%") ;
         lV155Webpartesproduccionds_15_tffase = GXutil.padr( GXutil.rtrim( AV155Webpartesproduccionds_15_tffase), 8, "%") ;
         lV159Webpartesproduccionds_19_tfhisprof = GXutil.padr( GXutil.rtrim( AV159Webpartesproduccionds_19_tfhisprof), 1, "%") ;
         lV169Webpartesproduccionds_29_tfparcodnom = GXutil.padr( GXutil.rtrim( AV169Webpartesproduccionds_29_tfparcodnom), 30, "%") ;
         /* Using cursor H00HM2 */
         pr_default.execute(0, new Object[] {lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV142Webpartesproduccionds_2_tfmaqcod, AV143Webpartesproduccionds_3_tfmaqcod_sel, lV144Webpartesproduccionds_4_tfmaqdsc, AV145Webpartesproduccionds_5_tfmaqdsc_sel, AV146Webpartesproduccionds_6_tfhisprofec, Integer.valueOf(AV147Webpartesproduccionds_7_tfhisprolin), Integer.valueOf(AV148Webpartesproduccionds_8_tfhisprolin_to), lV149Webpartesproduccionds_9_tfbarnhdr, AV150Webpartesproduccionds_10_tfbarnhdr_sel, Integer.valueOf(AV151Webpartesproduccionds_11_tfgruopecod), Integer.valueOf(AV152Webpartesproduccionds_12_tfgruopecod_to), Short.valueOf(AV153Webpartesproduccionds_13_tfbarordlin), Short.valueOf(AV154Webpartesproduccionds_14_tfbarordlin_to), lV155Webpartesproduccionds_15_tffase, AV156Webpartesproduccionds_16_tffase_sel, AV157Webpartesproduccionds_17_tfhisprodti, AV158Webpartesproduccionds_18_tfhisprodtf, lV159Webpartesproduccionds_19_tfhisprof, AV160Webpartesproduccionds_20_tfhisprof_sel, Byte.valueOf(AV161Webpartesproduccionds_21_tfhisprotur), Byte.valueOf(AV162Webpartesproduccionds_22_tfhisprotur_to), AV163Webpartesproduccionds_23_tfhisprokgr, AV164Webpartesproduccionds_24_tfhisprokgr_to, AV165Webpartesproduccionds_25_tfhispromtr, AV166Webpartesproduccionds_26_tfhispromtr_to, Short.valueOf(AV167Webpartesproduccionds_27_tfhispronpzs), Short.valueOf(AV168Webpartesproduccionds_28_tfhispronpzs_to), lV169Webpartesproduccionds_29_tfparcodnom, AV170Webpartesproduccionds_30_tfparcodnom_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A656ParCod = H00HM2_A656ParCod[0] ;
            n656ParCod = H00HM2_n656ParCod[0] ;
            A867ParCodNom = H00HM2_A867ParCodNom[0] ;
            n867ParCodNom = H00HM2_n867ParCodNom[0] ;
            A4714HisProNpzs = H00HM2_A4714HisProNpzs[0] ;
            A1526HisProMtr = H00HM2_A1526HisProMtr[0] ;
            A1525HisProKgr = H00HM2_A1525HisProKgr[0] ;
            A566HisProTur = H00HM2_A566HisProTur[0] ;
            A557HisProF = H00HM2_A557HisProF[0] ;
            A4441HisProDTF = H00HM2_A4441HisProDTF[0] ;
            n4441HisProDTF = H00HM2_n4441HisProDTF[0] ;
            A4440HisProDTI = H00HM2_A4440HisProDTI[0] ;
            n4440HisProDTI = H00HM2_n4440HisProDTI[0] ;
            A194BarOrdLin = H00HM2_A194BarOrdLin[0] ;
            A503GruOpeCod = H00HM2_A503GruOpeCod[0] ;
            A561HisProLin = H00HM2_A561HisProLin[0] ;
            A558HisProFec = H00HM2_A558HisProFec[0] ;
            A606MaqDsc = H00HM2_A606MaqDsc[0] ;
            n606MaqDsc = H00HM2_n606MaqDsc[0] ;
            A602MaqCod = H00HM2_A602MaqCod[0] ;
            A130BarCodPar = H00HM2_A130BarCodPar[0] ;
            A132BarCodReo = H00HM2_A132BarCodReo[0] ;
            A129BarCod = H00HM2_A129BarCod[0] ;
            A461Fase = H00HM2_A461Fase[0] ;
            A396EmprCod = H00HM2_A396EmprCod[0] ;
            A606MaqDsc = H00HM2_A606MaqDsc[0] ;
            n606MaqDsc = H00HM2_n606MaqDsc[0] ;
            A867ParCodNom = H00HM2_A867ParCodNom[0] ;
            n867ParCodNom = H00HM2_n867ParCodNom[0] ;
            GXt_char1 = A7258FaseDsc ;
            GXv_char2[0] = GXt_char1 ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
            webpartesproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
            A7258FaseDsc = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A7258FaseDsc", A7258FaseDsc);
            A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
            e21HM2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(41) ;
         wbHM0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesHM2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV171Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV171Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVEMA", GXutil.ltrim( localUtil.ntoc( AV117Carvema, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVEMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV117Carvema), "ZZZ9")));
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
      AV141Webpartesproduccionds_1_filterfulltext = AV130FilterFullText ;
      AV142Webpartesproduccionds_2_tfmaqcod = AV46TFMaqCod ;
      AV143Webpartesproduccionds_3_tfmaqcod_sel = AV47TFMaqCod_Sel ;
      AV144Webpartesproduccionds_4_tfmaqdsc = AV110TFMaqDsc ;
      AV145Webpartesproduccionds_5_tfmaqdsc_sel = AV111TFMaqDsc_Sel ;
      AV146Webpartesproduccionds_6_tfhisprofec = AV49TFHisProFec ;
      AV147Webpartesproduccionds_7_tfhisprolin = AV54TFHisProLin ;
      AV148Webpartesproduccionds_8_tfhisprolin_to = AV55TFHisProLin_To ;
      AV149Webpartesproduccionds_9_tfbarnhdr = AV57TFBarNHdr ;
      AV150Webpartesproduccionds_10_tfbarnhdr_sel = AV58TFBarNHdr_Sel ;
      AV151Webpartesproduccionds_11_tfgruopecod = AV60TFGruOpeCod ;
      AV152Webpartesproduccionds_12_tfgruopecod_to = AV61TFGruOpeCod_To ;
      AV153Webpartesproduccionds_13_tfbarordlin = AV63TFBarOrdLin ;
      AV154Webpartesproduccionds_14_tfbarordlin_to = AV64TFBarOrdLin_To ;
      AV155Webpartesproduccionds_15_tffase = AV66TFFase ;
      AV156Webpartesproduccionds_16_tffase_sel = AV67TFFase_Sel ;
      AV157Webpartesproduccionds_17_tfhisprodti = AV72TFHisProDTI ;
      AV158Webpartesproduccionds_18_tfhisprodtf = AV77TFHisProDTF ;
      AV159Webpartesproduccionds_19_tfhisprof = AV82TFHisProF ;
      AV160Webpartesproduccionds_20_tfhisprof_sel = AV83TFHisProF_Sel ;
      AV161Webpartesproduccionds_21_tfhisprotur = AV85TFHisProTur ;
      AV162Webpartesproduccionds_22_tfhisprotur_to = AV86TFHisProTur_To ;
      AV163Webpartesproduccionds_23_tfhisprokgr = AV88TFHisProKgr ;
      AV164Webpartesproduccionds_24_tfhisprokgr_to = AV89TFHisProKgr_To ;
      AV165Webpartesproduccionds_25_tfhispromtr = AV91TFHisProMtr ;
      AV166Webpartesproduccionds_26_tfhispromtr_to = AV92TFHisProMtr_To ;
      AV167Webpartesproduccionds_27_tfhispronpzs = AV94TFHisProNpzs ;
      AV168Webpartesproduccionds_28_tfhispronpzs_to = AV95TFHisProNpzs_To ;
      AV169Webpartesproduccionds_29_tfparcodnom = AV100TFParCodNom ;
      AV170Webpartesproduccionds_30_tfparcodnom_sel = AV101TFParCodNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV141Webpartesproduccionds_1_filterfulltext ,
                                           AV143Webpartesproduccionds_3_tfmaqcod_sel ,
                                           AV142Webpartesproduccionds_2_tfmaqcod ,
                                           AV145Webpartesproduccionds_5_tfmaqdsc_sel ,
                                           AV144Webpartesproduccionds_4_tfmaqdsc ,
                                           AV146Webpartesproduccionds_6_tfhisprofec ,
                                           Integer.valueOf(AV147Webpartesproduccionds_7_tfhisprolin) ,
                                           Integer.valueOf(AV148Webpartesproduccionds_8_tfhisprolin_to) ,
                                           AV150Webpartesproduccionds_10_tfbarnhdr_sel ,
                                           AV149Webpartesproduccionds_9_tfbarnhdr ,
                                           Integer.valueOf(AV151Webpartesproduccionds_11_tfgruopecod) ,
                                           Integer.valueOf(AV152Webpartesproduccionds_12_tfgruopecod_to) ,
                                           Short.valueOf(AV153Webpartesproduccionds_13_tfbarordlin) ,
                                           Short.valueOf(AV154Webpartesproduccionds_14_tfbarordlin_to) ,
                                           AV156Webpartesproduccionds_16_tffase_sel ,
                                           AV155Webpartesproduccionds_15_tffase ,
                                           AV157Webpartesproduccionds_17_tfhisprodti ,
                                           AV158Webpartesproduccionds_18_tfhisprodtf ,
                                           AV160Webpartesproduccionds_20_tfhisprof_sel ,
                                           AV159Webpartesproduccionds_19_tfhisprof ,
                                           Byte.valueOf(AV161Webpartesproduccionds_21_tfhisprotur) ,
                                           Byte.valueOf(AV162Webpartesproduccionds_22_tfhisprotur_to) ,
                                           AV163Webpartesproduccionds_23_tfhisprokgr ,
                                           AV164Webpartesproduccionds_24_tfhisprokgr_to ,
                                           AV165Webpartesproduccionds_25_tfhispromtr ,
                                           AV166Webpartesproduccionds_26_tfhispromtr_to ,
                                           Short.valueOf(AV167Webpartesproduccionds_27_tfhispronpzs) ,
                                           Short.valueOf(AV168Webpartesproduccionds_28_tfhispronpzs_to) ,
                                           AV170Webpartesproduccionds_30_tfparcodnom_sel ,
                                           AV169Webpartesproduccionds_29_tfparcodnom ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A867ParCodNom ,
                                           A558HisProFec ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV141Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV141Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV142Webpartesproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV142Webpartesproduccionds_2_tfmaqcod), 6, "%") ;
      lV144Webpartesproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV144Webpartesproduccionds_4_tfmaqdsc), 16, "%") ;
      lV149Webpartesproduccionds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV149Webpartesproduccionds_9_tfbarnhdr), 11, "%") ;
      lV155Webpartesproduccionds_15_tffase = GXutil.padr( GXutil.rtrim( AV155Webpartesproduccionds_15_tffase), 8, "%") ;
      lV159Webpartesproduccionds_19_tfhisprof = GXutil.padr( GXutil.rtrim( AV159Webpartesproduccionds_19_tfhisprof), 1, "%") ;
      lV169Webpartesproduccionds_29_tfparcodnom = GXutil.padr( GXutil.rtrim( AV169Webpartesproduccionds_29_tfparcodnom), 30, "%") ;
      /* Using cursor H00HM3 */
      pr_default.execute(1, new Object[] {lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV141Webpartesproduccionds_1_filterfulltext, lV142Webpartesproduccionds_2_tfmaqcod, AV143Webpartesproduccionds_3_tfmaqcod_sel, lV144Webpartesproduccionds_4_tfmaqdsc, AV145Webpartesproduccionds_5_tfmaqdsc_sel, AV146Webpartesproduccionds_6_tfhisprofec, Integer.valueOf(AV147Webpartesproduccionds_7_tfhisprolin), Integer.valueOf(AV148Webpartesproduccionds_8_tfhisprolin_to), lV149Webpartesproduccionds_9_tfbarnhdr, AV150Webpartesproduccionds_10_tfbarnhdr_sel, Integer.valueOf(AV151Webpartesproduccionds_11_tfgruopecod), Integer.valueOf(AV152Webpartesproduccionds_12_tfgruopecod_to), Short.valueOf(AV153Webpartesproduccionds_13_tfbarordlin), Short.valueOf(AV154Webpartesproduccionds_14_tfbarordlin_to), lV155Webpartesproduccionds_15_tffase, AV156Webpartesproduccionds_16_tffase_sel, AV157Webpartesproduccionds_17_tfhisprodti, AV158Webpartesproduccionds_18_tfhisprodtf, lV159Webpartesproduccionds_19_tfhisprof, AV160Webpartesproduccionds_20_tfhisprof_sel, Byte.valueOf(AV161Webpartesproduccionds_21_tfhisprotur), Byte.valueOf(AV162Webpartesproduccionds_22_tfhisprotur_to), AV163Webpartesproduccionds_23_tfhisprokgr, AV164Webpartesproduccionds_24_tfhisprokgr_to, AV165Webpartesproduccionds_25_tfhispromtr, AV166Webpartesproduccionds_26_tfhispromtr_to, Short.valueOf(AV167Webpartesproduccionds_27_tfhispronpzs), Short.valueOf(AV168Webpartesproduccionds_28_tfhispronpzs_to), lV169Webpartesproduccionds_29_tfparcodnom, AV170Webpartesproduccionds_30_tfparcodnom_sel});
      GRID_nRecordCount = H00HM3_AGRID_nRecordCount[0] ;
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
      AV141Webpartesproduccionds_1_filterfulltext = AV130FilterFullText ;
      AV142Webpartesproduccionds_2_tfmaqcod = AV46TFMaqCod ;
      AV143Webpartesproduccionds_3_tfmaqcod_sel = AV47TFMaqCod_Sel ;
      AV144Webpartesproduccionds_4_tfmaqdsc = AV110TFMaqDsc ;
      AV145Webpartesproduccionds_5_tfmaqdsc_sel = AV111TFMaqDsc_Sel ;
      AV146Webpartesproduccionds_6_tfhisprofec = AV49TFHisProFec ;
      AV147Webpartesproduccionds_7_tfhisprolin = AV54TFHisProLin ;
      AV148Webpartesproduccionds_8_tfhisprolin_to = AV55TFHisProLin_To ;
      AV149Webpartesproduccionds_9_tfbarnhdr = AV57TFBarNHdr ;
      AV150Webpartesproduccionds_10_tfbarnhdr_sel = AV58TFBarNHdr_Sel ;
      AV151Webpartesproduccionds_11_tfgruopecod = AV60TFGruOpeCod ;
      AV152Webpartesproduccionds_12_tfgruopecod_to = AV61TFGruOpeCod_To ;
      AV153Webpartesproduccionds_13_tfbarordlin = AV63TFBarOrdLin ;
      AV154Webpartesproduccionds_14_tfbarordlin_to = AV64TFBarOrdLin_To ;
      AV155Webpartesproduccionds_15_tffase = AV66TFFase ;
      AV156Webpartesproduccionds_16_tffase_sel = AV67TFFase_Sel ;
      AV157Webpartesproduccionds_17_tfhisprodti = AV72TFHisProDTI ;
      AV158Webpartesproduccionds_18_tfhisprodtf = AV77TFHisProDTF ;
      AV159Webpartesproduccionds_19_tfhisprof = AV82TFHisProF ;
      AV160Webpartesproduccionds_20_tfhisprof_sel = AV83TFHisProF_Sel ;
      AV161Webpartesproduccionds_21_tfhisprotur = AV85TFHisProTur ;
      AV162Webpartesproduccionds_22_tfhisprotur_to = AV86TFHisProTur_To ;
      AV163Webpartesproduccionds_23_tfhisprokgr = AV88TFHisProKgr ;
      AV164Webpartesproduccionds_24_tfhisprokgr_to = AV89TFHisProKgr_To ;
      AV165Webpartesproduccionds_25_tfhispromtr = AV91TFHisProMtr ;
      AV166Webpartesproduccionds_26_tfhispromtr_to = AV92TFHisProMtr_To ;
      AV167Webpartesproduccionds_27_tfhispronpzs = AV94TFHisProNpzs ;
      AV168Webpartesproduccionds_28_tfhispronpzs_to = AV95TFHisProNpzs_To ;
      AV169Webpartesproduccionds_29_tfparcodnom = AV100TFParCodNom ;
      AV170Webpartesproduccionds_30_tfparcodnom_sel = AV101TFParCodNom_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV130FilterFullText, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV46TFMaqCod, AV47TFMaqCod_Sel, AV110TFMaqDsc, AV111TFMaqDsc_Sel, AV49TFHisProFec, AV54TFHisProLin, AV55TFHisProLin_To, AV57TFBarNHdr, AV58TFBarNHdr_Sel, AV60TFGruOpeCod, AV61TFGruOpeCod_To, AV63TFBarOrdLin, AV64TFBarOrdLin_To, AV66TFFase, AV67TFFase_Sel, AV72TFHisProDTI, AV77TFHisProDTF, AV82TFHisProF, AV83TFHisProF_Sel, AV85TFHisProTur, AV86TFHisProTur_To, AV88TFHisProKgr, AV89TFHisProKgr_To, AV91TFHisProMtr, AV92TFHisProMtr_To, AV94TFHisProNpzs, AV95TFHisProNpzs_To, AV100TFParCodNom, AV101TFParCodNom_Sel, AV171Pgmname, AV13OrderedBy, AV14OrderedDsc, AV117Carvema) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV141Webpartesproduccionds_1_filterfulltext = AV130FilterFullText ;
      AV142Webpartesproduccionds_2_tfmaqcod = AV46TFMaqCod ;
      AV143Webpartesproduccionds_3_tfmaqcod_sel = AV47TFMaqCod_Sel ;
      AV144Webpartesproduccionds_4_tfmaqdsc = AV110TFMaqDsc ;
      AV145Webpartesproduccionds_5_tfmaqdsc_sel = AV111TFMaqDsc_Sel ;
      AV146Webpartesproduccionds_6_tfhisprofec = AV49TFHisProFec ;
      AV147Webpartesproduccionds_7_tfhisprolin = AV54TFHisProLin ;
      AV148Webpartesproduccionds_8_tfhisprolin_to = AV55TFHisProLin_To ;
      AV149Webpartesproduccionds_9_tfbarnhdr = AV57TFBarNHdr ;
      AV150Webpartesproduccionds_10_tfbarnhdr_sel = AV58TFBarNHdr_Sel ;
      AV151Webpartesproduccionds_11_tfgruopecod = AV60TFGruOpeCod ;
      AV152Webpartesproduccionds_12_tfgruopecod_to = AV61TFGruOpeCod_To ;
      AV153Webpartesproduccionds_13_tfbarordlin = AV63TFBarOrdLin ;
      AV154Webpartesproduccionds_14_tfbarordlin_to = AV64TFBarOrdLin_To ;
      AV155Webpartesproduccionds_15_tffase = AV66TFFase ;
      AV156Webpartesproduccionds_16_tffase_sel = AV67TFFase_Sel ;
      AV157Webpartesproduccionds_17_tfhisprodti = AV72TFHisProDTI ;
      AV158Webpartesproduccionds_18_tfhisprodtf = AV77TFHisProDTF ;
      AV159Webpartesproduccionds_19_tfhisprof = AV82TFHisProF ;
      AV160Webpartesproduccionds_20_tfhisprof_sel = AV83TFHisProF_Sel ;
      AV161Webpartesproduccionds_21_tfhisprotur = AV85TFHisProTur ;
      AV162Webpartesproduccionds_22_tfhisprotur_to = AV86TFHisProTur_To ;
      AV163Webpartesproduccionds_23_tfhisprokgr = AV88TFHisProKgr ;
      AV164Webpartesproduccionds_24_tfhisprokgr_to = AV89TFHisProKgr_To ;
      AV165Webpartesproduccionds_25_tfhispromtr = AV91TFHisProMtr ;
      AV166Webpartesproduccionds_26_tfhispromtr_to = AV92TFHisProMtr_To ;
      AV167Webpartesproduccionds_27_tfhispronpzs = AV94TFHisProNpzs ;
      AV168Webpartesproduccionds_28_tfhispronpzs_to = AV95TFHisProNpzs_To ;
      AV169Webpartesproduccionds_29_tfparcodnom = AV100TFParCodNom ;
      AV170Webpartesproduccionds_30_tfparcodnom_sel = AV101TFParCodNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV130FilterFullText, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV46TFMaqCod, AV47TFMaqCod_Sel, AV110TFMaqDsc, AV111TFMaqDsc_Sel, AV49TFHisProFec, AV54TFHisProLin, AV55TFHisProLin_To, AV57TFBarNHdr, AV58TFBarNHdr_Sel, AV60TFGruOpeCod, AV61TFGruOpeCod_To, AV63TFBarOrdLin, AV64TFBarOrdLin_To, AV66TFFase, AV67TFFase_Sel, AV72TFHisProDTI, AV77TFHisProDTF, AV82TFHisProF, AV83TFHisProF_Sel, AV85TFHisProTur, AV86TFHisProTur_To, AV88TFHisProKgr, AV89TFHisProKgr_To, AV91TFHisProMtr, AV92TFHisProMtr_To, AV94TFHisProNpzs, AV95TFHisProNpzs_To, AV100TFParCodNom, AV101TFParCodNom_Sel, AV171Pgmname, AV13OrderedBy, AV14OrderedDsc, AV117Carvema) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV141Webpartesproduccionds_1_filterfulltext = AV130FilterFullText ;
      AV142Webpartesproduccionds_2_tfmaqcod = AV46TFMaqCod ;
      AV143Webpartesproduccionds_3_tfmaqcod_sel = AV47TFMaqCod_Sel ;
      AV144Webpartesproduccionds_4_tfmaqdsc = AV110TFMaqDsc ;
      AV145Webpartesproduccionds_5_tfmaqdsc_sel = AV111TFMaqDsc_Sel ;
      AV146Webpartesproduccionds_6_tfhisprofec = AV49TFHisProFec ;
      AV147Webpartesproduccionds_7_tfhisprolin = AV54TFHisProLin ;
      AV148Webpartesproduccionds_8_tfhisprolin_to = AV55TFHisProLin_To ;
      AV149Webpartesproduccionds_9_tfbarnhdr = AV57TFBarNHdr ;
      AV150Webpartesproduccionds_10_tfbarnhdr_sel = AV58TFBarNHdr_Sel ;
      AV151Webpartesproduccionds_11_tfgruopecod = AV60TFGruOpeCod ;
      AV152Webpartesproduccionds_12_tfgruopecod_to = AV61TFGruOpeCod_To ;
      AV153Webpartesproduccionds_13_tfbarordlin = AV63TFBarOrdLin ;
      AV154Webpartesproduccionds_14_tfbarordlin_to = AV64TFBarOrdLin_To ;
      AV155Webpartesproduccionds_15_tffase = AV66TFFase ;
      AV156Webpartesproduccionds_16_tffase_sel = AV67TFFase_Sel ;
      AV157Webpartesproduccionds_17_tfhisprodti = AV72TFHisProDTI ;
      AV158Webpartesproduccionds_18_tfhisprodtf = AV77TFHisProDTF ;
      AV159Webpartesproduccionds_19_tfhisprof = AV82TFHisProF ;
      AV160Webpartesproduccionds_20_tfhisprof_sel = AV83TFHisProF_Sel ;
      AV161Webpartesproduccionds_21_tfhisprotur = AV85TFHisProTur ;
      AV162Webpartesproduccionds_22_tfhisprotur_to = AV86TFHisProTur_To ;
      AV163Webpartesproduccionds_23_tfhisprokgr = AV88TFHisProKgr ;
      AV164Webpartesproduccionds_24_tfhisprokgr_to = AV89TFHisProKgr_To ;
      AV165Webpartesproduccionds_25_tfhispromtr = AV91TFHisProMtr ;
      AV166Webpartesproduccionds_26_tfhispromtr_to = AV92TFHisProMtr_To ;
      AV167Webpartesproduccionds_27_tfhispronpzs = AV94TFHisProNpzs ;
      AV168Webpartesproduccionds_28_tfhispronpzs_to = AV95TFHisProNpzs_To ;
      AV169Webpartesproduccionds_29_tfparcodnom = AV100TFParCodNom ;
      AV170Webpartesproduccionds_30_tfparcodnom_sel = AV101TFParCodNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV130FilterFullText, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV46TFMaqCod, AV47TFMaqCod_Sel, AV110TFMaqDsc, AV111TFMaqDsc_Sel, AV49TFHisProFec, AV54TFHisProLin, AV55TFHisProLin_To, AV57TFBarNHdr, AV58TFBarNHdr_Sel, AV60TFGruOpeCod, AV61TFGruOpeCod_To, AV63TFBarOrdLin, AV64TFBarOrdLin_To, AV66TFFase, AV67TFFase_Sel, AV72TFHisProDTI, AV77TFHisProDTF, AV82TFHisProF, AV83TFHisProF_Sel, AV85TFHisProTur, AV86TFHisProTur_To, AV88TFHisProKgr, AV89TFHisProKgr_To, AV91TFHisProMtr, AV92TFHisProMtr_To, AV94TFHisProNpzs, AV95TFHisProNpzs_To, AV100TFParCodNom, AV101TFParCodNom_Sel, AV171Pgmname, AV13OrderedBy, AV14OrderedDsc, AV117Carvema) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV141Webpartesproduccionds_1_filterfulltext = AV130FilterFullText ;
      AV142Webpartesproduccionds_2_tfmaqcod = AV46TFMaqCod ;
      AV143Webpartesproduccionds_3_tfmaqcod_sel = AV47TFMaqCod_Sel ;
      AV144Webpartesproduccionds_4_tfmaqdsc = AV110TFMaqDsc ;
      AV145Webpartesproduccionds_5_tfmaqdsc_sel = AV111TFMaqDsc_Sel ;
      AV146Webpartesproduccionds_6_tfhisprofec = AV49TFHisProFec ;
      AV147Webpartesproduccionds_7_tfhisprolin = AV54TFHisProLin ;
      AV148Webpartesproduccionds_8_tfhisprolin_to = AV55TFHisProLin_To ;
      AV149Webpartesproduccionds_9_tfbarnhdr = AV57TFBarNHdr ;
      AV150Webpartesproduccionds_10_tfbarnhdr_sel = AV58TFBarNHdr_Sel ;
      AV151Webpartesproduccionds_11_tfgruopecod = AV60TFGruOpeCod ;
      AV152Webpartesproduccionds_12_tfgruopecod_to = AV61TFGruOpeCod_To ;
      AV153Webpartesproduccionds_13_tfbarordlin = AV63TFBarOrdLin ;
      AV154Webpartesproduccionds_14_tfbarordlin_to = AV64TFBarOrdLin_To ;
      AV155Webpartesproduccionds_15_tffase = AV66TFFase ;
      AV156Webpartesproduccionds_16_tffase_sel = AV67TFFase_Sel ;
      AV157Webpartesproduccionds_17_tfhisprodti = AV72TFHisProDTI ;
      AV158Webpartesproduccionds_18_tfhisprodtf = AV77TFHisProDTF ;
      AV159Webpartesproduccionds_19_tfhisprof = AV82TFHisProF ;
      AV160Webpartesproduccionds_20_tfhisprof_sel = AV83TFHisProF_Sel ;
      AV161Webpartesproduccionds_21_tfhisprotur = AV85TFHisProTur ;
      AV162Webpartesproduccionds_22_tfhisprotur_to = AV86TFHisProTur_To ;
      AV163Webpartesproduccionds_23_tfhisprokgr = AV88TFHisProKgr ;
      AV164Webpartesproduccionds_24_tfhisprokgr_to = AV89TFHisProKgr_To ;
      AV165Webpartesproduccionds_25_tfhispromtr = AV91TFHisProMtr ;
      AV166Webpartesproduccionds_26_tfhispromtr_to = AV92TFHisProMtr_To ;
      AV167Webpartesproduccionds_27_tfhispronpzs = AV94TFHisProNpzs ;
      AV168Webpartesproduccionds_28_tfhispronpzs_to = AV95TFHisProNpzs_To ;
      AV169Webpartesproduccionds_29_tfparcodnom = AV100TFParCodNom ;
      AV170Webpartesproduccionds_30_tfparcodnom_sel = AV101TFParCodNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV130FilterFullText, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV46TFMaqCod, AV47TFMaqCod_Sel, AV110TFMaqDsc, AV111TFMaqDsc_Sel, AV49TFHisProFec, AV54TFHisProLin, AV55TFHisProLin_To, AV57TFBarNHdr, AV58TFBarNHdr_Sel, AV60TFGruOpeCod, AV61TFGruOpeCod_To, AV63TFBarOrdLin, AV64TFBarOrdLin_To, AV66TFFase, AV67TFFase_Sel, AV72TFHisProDTI, AV77TFHisProDTF, AV82TFHisProF, AV83TFHisProF_Sel, AV85TFHisProTur, AV86TFHisProTur_To, AV88TFHisProKgr, AV89TFHisProKgr_To, AV91TFHisProMtr, AV92TFHisProMtr_To, AV94TFHisProNpzs, AV95TFHisProNpzs_To, AV100TFParCodNom, AV101TFParCodNom_Sel, AV171Pgmname, AV13OrderedBy, AV14OrderedDsc, AV117Carvema) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV141Webpartesproduccionds_1_filterfulltext = AV130FilterFullText ;
      AV142Webpartesproduccionds_2_tfmaqcod = AV46TFMaqCod ;
      AV143Webpartesproduccionds_3_tfmaqcod_sel = AV47TFMaqCod_Sel ;
      AV144Webpartesproduccionds_4_tfmaqdsc = AV110TFMaqDsc ;
      AV145Webpartesproduccionds_5_tfmaqdsc_sel = AV111TFMaqDsc_Sel ;
      AV146Webpartesproduccionds_6_tfhisprofec = AV49TFHisProFec ;
      AV147Webpartesproduccionds_7_tfhisprolin = AV54TFHisProLin ;
      AV148Webpartesproduccionds_8_tfhisprolin_to = AV55TFHisProLin_To ;
      AV149Webpartesproduccionds_9_tfbarnhdr = AV57TFBarNHdr ;
      AV150Webpartesproduccionds_10_tfbarnhdr_sel = AV58TFBarNHdr_Sel ;
      AV151Webpartesproduccionds_11_tfgruopecod = AV60TFGruOpeCod ;
      AV152Webpartesproduccionds_12_tfgruopecod_to = AV61TFGruOpeCod_To ;
      AV153Webpartesproduccionds_13_tfbarordlin = AV63TFBarOrdLin ;
      AV154Webpartesproduccionds_14_tfbarordlin_to = AV64TFBarOrdLin_To ;
      AV155Webpartesproduccionds_15_tffase = AV66TFFase ;
      AV156Webpartesproduccionds_16_tffase_sel = AV67TFFase_Sel ;
      AV157Webpartesproduccionds_17_tfhisprodti = AV72TFHisProDTI ;
      AV158Webpartesproduccionds_18_tfhisprodtf = AV77TFHisProDTF ;
      AV159Webpartesproduccionds_19_tfhisprof = AV82TFHisProF ;
      AV160Webpartesproduccionds_20_tfhisprof_sel = AV83TFHisProF_Sel ;
      AV161Webpartesproduccionds_21_tfhisprotur = AV85TFHisProTur ;
      AV162Webpartesproduccionds_22_tfhisprotur_to = AV86TFHisProTur_To ;
      AV163Webpartesproduccionds_23_tfhisprokgr = AV88TFHisProKgr ;
      AV164Webpartesproduccionds_24_tfhisprokgr_to = AV89TFHisProKgr_To ;
      AV165Webpartesproduccionds_25_tfhispromtr = AV91TFHisProMtr ;
      AV166Webpartesproduccionds_26_tfhispromtr_to = AV92TFHisProMtr_To ;
      AV167Webpartesproduccionds_27_tfhispronpzs = AV94TFHisProNpzs ;
      AV168Webpartesproduccionds_28_tfhispronpzs_to = AV95TFHisProNpzs_To ;
      AV169Webpartesproduccionds_29_tfparcodnom = AV100TFParCodNom ;
      AV170Webpartesproduccionds_30_tfparcodnom_sel = AV101TFParCodNom_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV130FilterFullText, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV46TFMaqCod, AV47TFMaqCod_Sel, AV110TFMaqDsc, AV111TFMaqDsc_Sel, AV49TFHisProFec, AV54TFHisProLin, AV55TFHisProLin_To, AV57TFBarNHdr, AV58TFBarNHdr_Sel, AV60TFGruOpeCod, AV61TFGruOpeCod_To, AV63TFBarOrdLin, AV64TFBarOrdLin_To, AV66TFFase, AV67TFFase_Sel, AV72TFHisProDTI, AV77TFHisProDTF, AV82TFHisProF, AV83TFHisProF_Sel, AV85TFHisProTur, AV86TFHisProTur_To, AV88TFHisProKgr, AV89TFHisProKgr_To, AV91TFHisProMtr, AV92TFHisProMtr_To, AV94TFHisProNpzs, AV95TFHisProNpzs_To, AV100TFParCodNom, AV101TFParCodNom_Sel, AV171Pgmname, AV13OrderedBy, AV14OrderedDsc, AV117Carvema) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV171Pgmname = "WebPartesProduccion" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupHM0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19HM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV42ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV103DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV39ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV105GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV106GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV112EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
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
         Dvelop_confirmpanel_dltlinea_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DLTLINEA_Title") ;
         Dvelop_confirmpanel_dltlinea_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DLTLINEA_Confirmationtext") ;
         Dvelop_confirmpanel_dltlinea_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DLTLINEA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_dltlinea_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DLTLINEA_Nobuttoncaption") ;
         Dvelop_confirmpanel_dltlinea_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DLTLINEA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_dltlinea_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DLTLINEA_Yesbuttonposition") ;
         Dvelop_confirmpanel_dltlinea_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DLTLINEA_Confirmtype") ;
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
         Dvelop_confirmpanel_dltlinea_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DLTLINEA_Result") ;
         /* Read variables values. */
         AV130FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV130FilterFullText", AV130FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprofecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPROFECAUXDATE");
            GX_FocusControl = edtavDdo_hisprofecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV51DDO_HisProFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51DDO_HisProFecAuxDate", localUtil.format(AV51DDO_HisProFecAuxDate, "99/99/99"));
         }
         else
         {
            AV51DDO_HisProFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprofecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51DDO_HisProFecAuxDate", localUtil.format(AV51DDO_HisProFecAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodtiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODTIAUXDATE");
            GX_FocusControl = edtavDdo_hisprodtiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV74DDO_HisProDTIAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74DDO_HisProDTIAuxDate", localUtil.format(AV74DDO_HisProDTIAuxDate, "99/99/99"));
         }
         else
         {
            AV74DDO_HisProDTIAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodtiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74DDO_HisProDTIAuxDate", localUtil.format(AV74DDO_HisProDTIAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODTFAUXDATE");
            GX_FocusControl = edtavDdo_hisprodtfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV79DDO_HisProDTFAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79DDO_HisProDTFAuxDate", localUtil.format(AV79DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else
         {
            AV79DDO_HisProDTFAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79DDO_HisProDTFAuxDate", localUtil.format(AV79DDO_HisProDTFAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV130FilterFullText) != 0 )
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
      e19HM2 ();
      if (returnInSub) return;
   }

   public void e19HM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV115Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webpartesproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
      AV115Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115Station", AV115Station);
      GXv_char2[0] = AV112EmprCod ;
      GXv_char3[0] = AV113EmprNom ;
      GXv_char4[0] = AV114UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV115Station, GXv_char2, GXv_char3, GXv_char4) ;
      webpartesproduccion_impl.this.AV112EmprCod = GXv_char2[0] ;
      webpartesproduccion_impl.this.AV113EmprNom = GXv_char3[0] ;
      webpartesproduccion_impl.this.AV114UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112EmprCod", AV112EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV114UsurCod", AV114UsurCod);
      GXt_int5 = (byte)(AV120Tosa) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV112EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int6) ;
      webpartesproduccion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV120Tosa = GXt_int5 ;
      GXt_int5 = (byte)(AV121kgmtpz) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV112EmprCod, httpContext.getMessage( "KGMTPZ", ""), GXv_int6) ;
      webpartesproduccion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV121kgmtpz = GXt_int5 ;
      GXt_int5 = (byte)(AV117Carvema) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV112EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      webpartesproduccion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV117Carvema = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV117Carvema", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV117Carvema), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVEMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV117Carvema), "ZZZ9")));
      GXt_char1 = AV115Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webpartesproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV115Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115Station", AV115Station);
      GXv_char4[0] = AV112EmprCod ;
      GXv_char3[0] = AV113EmprNom ;
      GXv_char2[0] = AV114UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV115Station, GXv_char4, GXv_char3, GXv_char2) ;
      webpartesproduccion_impl.this.AV112EmprCod = GXv_char4[0] ;
      webpartesproduccion_impl.this.AV113EmprNom = GXv_char3[0] ;
      webpartesproduccion_impl.this.AV114UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112EmprCod", AV112EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV114UsurCod", AV114UsurCod);
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
      Form.setCaption( httpContext.getMessage( " Table LHIPRO", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV13OrderedBy < 1 )
      {
         AV13OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV103DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV103DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e20HM2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV44ManageFiltersExecutionStep == 1 )
      {
         AV44ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV44ManageFiltersExecutionStep == 2 )
      {
         AV44ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV41Session.getValue("WebPartesProduccionColumnsSelector"), "") != 0 )
      {
         AV37ColumnsSelectorXML = AV41Session.getValue("WebPartesProduccionColumnsSelector") ;
         AV39ColumnsSelector.fromxml(AV37ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtMaqDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProFec_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLin_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtGruOpeCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtGruOpeCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGruOpeCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtBarOrdLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtFase_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFase_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFase_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProDTI_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProDTI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDTI_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProDTF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProDTF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDTF_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProF_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProTur_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProTur_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTur_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProKgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProKgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProKgr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMtr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisProNpzs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProNpzs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProNpzs_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtParCodNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtParCodNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCodNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      AV105GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105GridCurrentPage), 10, 0));
      AV106GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106GridPageCount), 10, 0));
      AV141Webpartesproduccionds_1_filterfulltext = AV130FilterFullText ;
      AV142Webpartesproduccionds_2_tfmaqcod = AV46TFMaqCod ;
      AV143Webpartesproduccionds_3_tfmaqcod_sel = AV47TFMaqCod_Sel ;
      AV144Webpartesproduccionds_4_tfmaqdsc = AV110TFMaqDsc ;
      AV145Webpartesproduccionds_5_tfmaqdsc_sel = AV111TFMaqDsc_Sel ;
      AV146Webpartesproduccionds_6_tfhisprofec = AV49TFHisProFec ;
      AV147Webpartesproduccionds_7_tfhisprolin = AV54TFHisProLin ;
      AV148Webpartesproduccionds_8_tfhisprolin_to = AV55TFHisProLin_To ;
      AV149Webpartesproduccionds_9_tfbarnhdr = AV57TFBarNHdr ;
      AV150Webpartesproduccionds_10_tfbarnhdr_sel = AV58TFBarNHdr_Sel ;
      AV151Webpartesproduccionds_11_tfgruopecod = AV60TFGruOpeCod ;
      AV152Webpartesproduccionds_12_tfgruopecod_to = AV61TFGruOpeCod_To ;
      AV153Webpartesproduccionds_13_tfbarordlin = AV63TFBarOrdLin ;
      AV154Webpartesproduccionds_14_tfbarordlin_to = AV64TFBarOrdLin_To ;
      AV155Webpartesproduccionds_15_tffase = AV66TFFase ;
      AV156Webpartesproduccionds_16_tffase_sel = AV67TFFase_Sel ;
      AV157Webpartesproduccionds_17_tfhisprodti = AV72TFHisProDTI ;
      AV158Webpartesproduccionds_18_tfhisprodtf = AV77TFHisProDTF ;
      AV159Webpartesproduccionds_19_tfhisprof = AV82TFHisProF ;
      AV160Webpartesproduccionds_20_tfhisprof_sel = AV83TFHisProF_Sel ;
      AV161Webpartesproduccionds_21_tfhisprotur = AV85TFHisProTur ;
      AV162Webpartesproduccionds_22_tfhisprotur_to = AV86TFHisProTur_To ;
      AV163Webpartesproduccionds_23_tfhisprokgr = AV88TFHisProKgr ;
      AV164Webpartesproduccionds_24_tfhisprokgr_to = AV89TFHisProKgr_To ;
      AV165Webpartesproduccionds_25_tfhispromtr = AV91TFHisProMtr ;
      AV166Webpartesproduccionds_26_tfhispromtr_to = AV92TFHisProMtr_To ;
      AV167Webpartesproduccionds_27_tfhispronpzs = AV94TFHisProNpzs ;
      AV168Webpartesproduccionds_28_tfhispronpzs_to = AV95TFHisProNpzs_To ;
      AV169Webpartesproduccionds_29_tfparcodnom = AV100TFParCodNom ;
      AV170Webpartesproduccionds_30_tfparcodnom_sel = AV101TFParCodNom_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12HM2( )
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
         AV104PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV104PageToGo) ;
      }
   }

   public void e13HM2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14HM2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV13OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         AV14OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV46TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFMaqCod", AV46TFMaqCod);
            AV47TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFMaqCod_Sel", AV47TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqDsc") == 0 )
         {
            AV110TFMaqDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110TFMaqDsc", AV110TFMaqDsc);
            AV111TFMaqDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111TFMaqDsc_Sel", AV111TFMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProFec") == 0 )
         {
            AV49TFHisProFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFHisProFec", localUtil.format(AV49TFHisProFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProLin") == 0 )
         {
            AV54TFHisProLin = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFHisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFHisProLin), 8, 0));
            AV55TFHisProLin_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFHisProLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFHisProLin_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV57TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFBarNHdr", AV57TFBarNHdr);
            AV58TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFBarNHdr_Sel", AV58TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GruOpeCod") == 0 )
         {
            AV60TFGruOpeCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFGruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFGruOpeCod), 6, 0));
            AV61TFGruOpeCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFGruOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFGruOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOrdLin") == 0 )
         {
            AV63TFBarOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFBarOrdLin), 4, 0));
            AV64TFBarOrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Fase") == 0 )
         {
            AV66TFFase = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFFase", AV66TFFase);
            AV67TFFase_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFFase_Sel", AV67TFFase_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDTI") == 0 )
         {
            AV72TFHisProDTI = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFHisProDTI", localUtil.ttoc( AV72TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDTF") == 0 )
         {
            AV77TFHisProDTF = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFHisProDTF", localUtil.ttoc( AV77TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProF") == 0 )
         {
            AV82TFHisProF = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFHisProF", AV82TFHisProF);
            AV83TFHisProF_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFHisProF_Sel", AV83TFHisProF_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProTur") == 0 )
         {
            AV85TFHisProTur = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFHisProTur", GXutil.str( AV85TFHisProTur, 1, 0));
            AV86TFHisProTur_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFHisProTur_To", GXutil.str( AV86TFHisProTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProKgr") == 0 )
         {
            AV88TFHisProKgr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFHisProKgr", GXutil.ltrimstr( AV88TFHisProKgr, 9, 2));
            AV89TFHisProKgr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFHisProKgr_To", GXutil.ltrimstr( AV89TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProMtr") == 0 )
         {
            AV91TFHisProMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFHisProMtr", GXutil.ltrimstr( AV91TFHisProMtr, 9, 2));
            AV92TFHisProMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFHisProMtr_To", GXutil.ltrimstr( AV92TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProNpzs") == 0 )
         {
            AV94TFHisProNpzs = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFHisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94TFHisProNpzs), 4, 0));
            AV95TFHisProNpzs_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFHisProNpzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TFHisProNpzs_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ParCodNom") == 0 )
         {
            AV100TFParCodNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFParCodNom", AV100TFParCodNom);
            AV101TFParCodNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFParCodNom_Sel", AV101TFParCodNom_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e21HM2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGrupodeacciones.removeAllItems();
      cmbavGrupodeacciones.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGrupodeacciones.addItem("1", httpContext.getMessage( "Linea (Ins)", ""), (short)(0));
      cmbavGrupodeacciones.addItem("2", httpContext.getMessage( "Linea (Upd)", ""), (short)(0));
      cmbavGrupodeacciones.addItem("3", httpContext.getMessage( "Linea (Dlt)", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(41) ;
      }
      sendrow_412( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV138Grupodeacciones, 4, 0)) );
   }

   public void e15HM2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV37ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV39ColumnsSelector.fromJSonString(AV37ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WebPartesProduccionColumnsSelector", ((GXutil.strcmp("", AV37ColumnsSelectorXML)==0) ? "" : AV39ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11HM2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WebPartesProduccionFilters")),GXutil.URLEncode(GXutil.rtrim(AV171Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV44ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WebPartesProduccionFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV44ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV43ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WebPartesProduccionFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         webpartesproduccion_impl.this.GXt_char1 = GXv_char4[0] ;
         AV43ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV43ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV171Pgmname+"GridState", AV43ManageFiltersXml) ;
            AV10GridState.fromxml(AV43ManageFiltersXml, null, null);
            AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
            AV14OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
   }

   public void e22HM2( )
   {
      /* Grupodeacciones_Click Routine */
      returnInSub = false ;
      if ( AV138Grupodeacciones == 1 )
      {
         /* Execute user subroutine: 'DO INSLINEA' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV138Grupodeacciones == 2 )
      {
         /* Execute user subroutine: 'DO UPDLINEA' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV138Grupodeacciones == 3 )
      {
         /* Execute user subroutine: 'DO DLTLINEA' */
         S212 ();
         if (returnInSub) return;
      }
      AV138Grupodeacciones = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138Grupodeacciones), 4, 0));
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV138Grupodeacciones, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e16HM2( )
   {
      /* Dvelop_confirmpanel_dltlinea_Close Routine */
      returnInSub = false ;
      if ( 0 == 1 )
      {
         if ( GXutil.strcmp(Dvelop_confirmpanel_dltlinea_Result, "Yes") == 0 )
         {
            /* Execute user subroutine: 'DO ACTION DLTLINEA' */
            S222 ();
            if (returnInSub) return;
         }
      }
      if ( GXutil.strcmp(Dvelop_confirmpanel_dltlinea_Result, "Yes") == 0 )
      {
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A558HisProFec)) )
         {
            if ( AV117Carvema == 1 )
            {
               GXv_char4[0] = A396EmprCod ;
               GXv_int10[0] = A129BarCod ;
               GXv_int6[0] = A132BarCodReo ;
               GXv_char3[0] = A130BarCodPar ;
               GXv_int11[0] = A194BarOrdLin ;
               GXv_char2[0] = A602MaqCod ;
               GXv_date12[0] = A558HisProFec ;
               GXv_char13[0] = AV114UsurCod ;
               GXv_char14[0] = AV115Station ;
               new app.pdltlmetpi(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int6, GXv_char3, GXv_int11, GXv_char2, GXv_date12, GXv_char13, GXv_char14) ;
               webpartesproduccion_impl.this.A396EmprCod = GXv_char4[0] ;
               webpartesproduccion_impl.this.A129BarCod = GXv_int10[0] ;
               webpartesproduccion_impl.this.A132BarCodReo = GXv_int6[0] ;
               webpartesproduccion_impl.this.A130BarCodPar = GXv_char3[0] ;
               webpartesproduccion_impl.this.A194BarOrdLin = GXv_int11[0] ;
               webpartesproduccion_impl.this.A602MaqCod = GXv_char2[0] ;
               webpartesproduccion_impl.this.A558HisProFec = GXv_date12[0] ;
               webpartesproduccion_impl.this.AV114UsurCod = GXv_char13[0] ;
               webpartesproduccion_impl.this.AV115Station = GXv_char14[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV114UsurCod", AV114UsurCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV115Station", AV115Station);
               GXv_char14[0] = A396EmprCod ;
               GXv_int10[0] = A129BarCod ;
               GXv_int6[0] = A132BarCodReo ;
               GXv_char13[0] = A130BarCodPar ;
               GXv_int11[0] = A194BarOrdLin ;
               new app.pkmpaut(remoteHandle, context).execute( GXv_char14, GXv_int10, GXv_int6, GXv_char13, GXv_int11) ;
               webpartesproduccion_impl.this.A396EmprCod = GXv_char14[0] ;
               webpartesproduccion_impl.this.A129BarCod = GXv_int10[0] ;
               webpartesproduccion_impl.this.A132BarCodReo = GXv_int6[0] ;
               webpartesproduccion_impl.this.A130BarCodPar = GXv_char13[0] ;
               webpartesproduccion_impl.this.A194BarOrdLin = GXv_int11[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            }
            /* Execute user subroutine: 'DO DLTLINEA' */
            S212 ();
            if (returnInSub) return;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e17HM2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char14[0] = AV35ExcelFilename ;
      GXv_char13[0] = AV36ErrorMessage ;
      new app.webpartesproduccionexport(remoteHandle, context).execute( GXv_char14, GXv_char13) ;
      webpartesproduccion_impl.this.AV35ExcelFilename = GXv_char14[0] ;
      webpartesproduccion_impl.this.AV36ErrorMessage = GXv_char13[0] ;
      if ( GXutil.strcmp(AV35ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV35ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV36ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e18HM2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.webpartesproduccionexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV13OrderedBy, 4, 0))+":"+(AV14OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV39ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector15[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "MaqCod", "", "Código Máquina", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "MaqDsc", "", "Descripcion Maquina", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "HisProFec", "", "Fecha", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "HisProLin", "", "#", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarNHdr", "", "N Hdr", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "GruOpeCod", "", "Operario", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarOrdLin", "", "Orden", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "Fase", "", "Fase", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "HisProDTI", "", "Inicio", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "HisProDTF", "", "Fin", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "HisProF", "", "F?", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "HisProTur", "", "T", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "HisProKgr", "", "Kgs", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "HisProMtr", "", "Mts", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "HisProNpzs", "", "Pcs", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "ParCodNom", "", "Paro", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXt_char1 = AV38UserCustomValue ;
      GXv_char14[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebPartesProduccionColumnsSelector", GXv_char14) ;
      webpartesproduccion_impl.this.GXt_char1 = GXv_char14[0] ;
      AV38UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV38UserCustomValue)==0) ) )
      {
         AV40ColumnsSelectorAux.fromxml(AV38UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector15[0] = AV40ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector16[0] = AV39ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, GXv_SdtWWPColumnsSelector16) ;
         AV40ColumnsSelectorAux = GXv_SdtWWPColumnsSelector15[0] ;
         AV39ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = AV42ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WebPartesProduccionFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18[0] ;
      AV42ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV130FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV130FilterFullText", AV130FilterFullText);
      AV46TFMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFMaqCod", AV46TFMaqCod);
      AV47TFMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFMaqCod_Sel", AV47TFMaqCod_Sel);
      AV110TFMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110TFMaqDsc", AV110TFMaqDsc);
      AV111TFMaqDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111TFMaqDsc_Sel", AV111TFMaqDsc_Sel);
      AV49TFHisProFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFHisProFec", localUtil.format(AV49TFHisProFec, "99/99/99"));
      AV54TFHisProLin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFHisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFHisProLin), 8, 0));
      AV55TFHisProLin_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFHisProLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFHisProLin_To), 8, 0));
      AV57TFBarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFBarNHdr", AV57TFBarNHdr);
      AV58TFBarNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFBarNHdr_Sel", AV58TFBarNHdr_Sel);
      AV60TFGruOpeCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFGruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFGruOpeCod), 6, 0));
      AV61TFGruOpeCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFGruOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFGruOpeCod_To), 6, 0));
      AV63TFBarOrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFBarOrdLin), 4, 0));
      AV64TFBarOrdLin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFBarOrdLin_To), 4, 0));
      AV66TFFase = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFFase", AV66TFFase);
      AV67TFFase_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFFase_Sel", AV67TFFase_Sel);
      AV72TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV72TFHisProDTI", localUtil.ttoc( AV72TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV77TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFHisProDTF", localUtil.ttoc( AV77TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV82TFHisProF = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82TFHisProF", AV82TFHisProF);
      AV83TFHisProF_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83TFHisProF_Sel", AV83TFHisProF_Sel);
      AV85TFHisProTur = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85TFHisProTur", GXutil.str( AV85TFHisProTur, 1, 0));
      AV86TFHisProTur_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TFHisProTur_To", GXutil.str( AV86TFHisProTur_To, 1, 0));
      AV88TFHisProKgr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88TFHisProKgr", GXutil.ltrimstr( AV88TFHisProKgr, 9, 2));
      AV89TFHisProKgr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89TFHisProKgr_To", GXutil.ltrimstr( AV89TFHisProKgr_To, 9, 2));
      AV91TFHisProMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91TFHisProMtr", GXutil.ltrimstr( AV91TFHisProMtr, 9, 2));
      AV92TFHisProMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92TFHisProMtr_To", GXutil.ltrimstr( AV92TFHisProMtr_To, 9, 2));
      AV94TFHisProNpzs = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94TFHisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94TFHisProNpzs), 4, 0));
      AV95TFHisProNpzs_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95TFHisProNpzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TFHisProNpzs_To), 4, 0));
      AV100TFParCodNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100TFParCodNom", AV100TFParCodNom);
      AV101TFParCodNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101TFParCodNom_Sel", AV101TFParCodNom_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO INSLINEA' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webpartesproduccionins", new String[] {GXutil.URLEncode(GXutil.rtrim(AV112EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(A558HisProFec))}, new String[] {"EmprCod","Maqcod","HisProFec"}) , new Object[] {"AV112EmprCod","A602MaqCod","A558HisProFec"});
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'DO UPDLINEA' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webpartesproduccionupd", new String[] {GXutil.URLEncode(GXutil.rtrim(AV112EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(A558HisProFec)),GXutil.URLEncode(GXutil.ltrimstr(A561HisProLin,8,0)),GXutil.URLEncode(GXutil.rtrim(A13696BarNHdr)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A461Fase)),GXutil.URLEncode(GXutil.rtrim(A7258FaseDsc)),GXutil.URLEncode(GXutil.rtrim(AV114UsurCod)),GXutil.URLEncode(GXutil.rtrim(AV115Station))}, new String[] {"EmprCod","MaqCod","HisProFec","HisProLin","BarNHdr","BarOrdLin","Fase","FaseDsc","Usurcod","station"}) , new Object[] {"AV112EmprCod","A602MaqCod","A558HisProFec","A561HisProLin","A13696BarNHdr","A194BarOrdLin","A461Fase","A7258FaseDsc","AV114UsurCod","AV115Station"});
      httpContext.doAjaxRefresh();
   }

   public void S212( )
   {
      /* 'DO DLTLINEA' Routine */
      returnInSub = false ;
      GXv_char14[0] = A396EmprCod ;
      GXv_char13[0] = A602MaqCod ;
      GXv_date12[0] = A558HisProFec ;
      GXv_int10[0] = A561HisProLin ;
      GXv_char4[0] = AV115Station ;
      GXv_char3[0] = AV114UsurCod ;
      new app.lectoroptico.pwbollb(remoteHandle, context).execute( GXv_char14, GXv_char13, GXv_date12, GXv_int10, GXv_char4, GXv_char3) ;
      webpartesproduccion_impl.this.A396EmprCod = GXv_char14[0] ;
      webpartesproduccion_impl.this.A602MaqCod = GXv_char13[0] ;
      webpartesproduccion_impl.this.A558HisProFec = GXv_date12[0] ;
      webpartesproduccion_impl.this.A561HisProLin = GXv_int10[0] ;
      webpartesproduccion_impl.this.AV115Station = GXv_char4[0] ;
      webpartesproduccion_impl.this.AV114UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV115Station", AV115Station);
      httpContext.ajax_rsp_assign_attri("", false, "AV114UsurCod", AV114UsurCod);
      GXv_char14[0] = A396EmprCod ;
      GXv_int10[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char13[0] = A130BarCodPar ;
      GXv_int11[0] = A194BarOrdLin ;
      new app.lectoroptico.pacfbar3(remoteHandle, context).execute( GXv_char14, GXv_int10, GXv_int6, GXv_char13, GXv_int11) ;
      webpartesproduccion_impl.this.A396EmprCod = GXv_char14[0] ;
      webpartesproduccion_impl.this.A129BarCod = GXv_int10[0] ;
      webpartesproduccion_impl.this.A132BarCodReo = GXv_int6[0] ;
      webpartesproduccion_impl.this.A130BarCodPar = GXv_char13[0] ;
      webpartesproduccion_impl.this.A194BarOrdLin = GXv_int11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      GXv_char14[0] = A396EmprCod ;
      GXv_char13[0] = A602MaqCod ;
      GXv_date12[0] = A558HisProFec ;
      GXv_char4[0] = AV115Station ;
      GXv_char3[0] = AV114UsurCod ;
      new app.lectoroptico.pwbollcb(remoteHandle, context).execute( GXv_char14, GXv_char13, GXv_date12, GXv_char4, GXv_char3) ;
      webpartesproduccion_impl.this.A396EmprCod = GXv_char14[0] ;
      webpartesproduccion_impl.this.A602MaqCod = GXv_char13[0] ;
      webpartesproduccion_impl.this.A558HisProFec = GXv_date12[0] ;
      webpartesproduccion_impl.this.AV115Station = GXv_char4[0] ;
      webpartesproduccion_impl.this.AV114UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV115Station", AV115Station);
      httpContext.ajax_rsp_assign_attri("", false, "AV114UsurCod", AV114UsurCod);
      httpContext.doAjaxRefresh();
      AV134EmprCod_Selected = A396EmprCod ;
      AV135MaqCod_Selected = A602MaqCod ;
      AV136HisProFec_Selected = A558HisProFec ;
      AV172Hisprolin_selected = A561HisProLin ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_DLTLINEAContainer", "Confirm", "", new Object[] {});
   }

   public void S222( )
   {
      /* 'DO ACTION DLTLINEA' Routine */
      returnInSub = false ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue(AV171Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV171Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV41Session.getValue(AV171Pgmname+"GridState"), null, null);
      }
      AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
      AV14OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
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
      AV173GXV1 = 1 ;
      while ( AV173GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV173GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV130FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV130FilterFullText", AV130FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV46TFMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFMaqCod", AV46TFMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV47TFMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFMaqCod_Sel", AV47TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV110TFMaqDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110TFMaqDsc", AV110TFMaqDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV111TFMaqDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111TFMaqDsc_Sel", AV111TFMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROFEC") == 0 )
         {
            AV49TFHisProFec = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFHisProFec", localUtil.format(AV49TFHisProFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLIN") == 0 )
         {
            AV54TFHisProLin = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFHisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFHisProLin), 8, 0));
            AV55TFHisProLin_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFHisProLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFHisProLin_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV57TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFBarNHdr", AV57TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV58TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFBarNHdr_Sel", AV58TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV60TFGruOpeCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFGruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFGruOpeCod), 6, 0));
            AV61TFGruOpeCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFGruOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFGruOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV63TFBarOrdLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFBarOrdLin), 4, 0));
            AV64TFBarOrdLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV66TFFase = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFFase", AV66TFFase);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV67TFFase_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFFase_Sel", AV67TFFase_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV72TFHisProDTI = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFHisProDTI", localUtil.ttoc( AV72TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV74DDO_HisProDTIAuxDate = GXutil.resetTime(AV72TFHisProDTI) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74DDO_HisProDTIAuxDate", localUtil.format(AV74DDO_HisProDTIAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV77TFHisProDTF = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFHisProDTF", localUtil.ttoc( AV77TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV79DDO_HisProDTFAuxDate = GXutil.resetTime(AV77TFHisProDTF) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79DDO_HisProDTFAuxDate", localUtil.format(AV79DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF") == 0 )
         {
            AV82TFHisProF = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFHisProF", AV82TFHisProF);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF_SEL") == 0 )
         {
            AV83TFHisProF_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFHisProF_Sel", AV83TFHisProF_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV85TFHisProTur = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFHisProTur", GXutil.str( AV85TFHisProTur, 1, 0));
            AV86TFHisProTur_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFHisProTur_To", GXutil.str( AV86TFHisProTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV88TFHisProKgr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFHisProKgr", GXutil.ltrimstr( AV88TFHisProKgr, 9, 2));
            AV89TFHisProKgr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFHisProKgr_To", GXutil.ltrimstr( AV89TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV91TFHisProMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFHisProMtr", GXutil.ltrimstr( AV91TFHisProMtr, 9, 2));
            AV92TFHisProMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFHisProMtr_To", GXutil.ltrimstr( AV92TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRONPZS") == 0 )
         {
            AV94TFHisProNpzs = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFHisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94TFHisProNpzs), 4, 0));
            AV95TFHisProNpzs_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFHisProNpzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TFHisProNpzs_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV100TFParCodNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFParCodNom", AV100TFParCodNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV101TFParCodNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFParCodNom_Sel", AV101TFParCodNom_Sel);
         }
         AV173GXV1 = (int)(AV173GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char14[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFMaqCod_Sel)==0), AV47TFMaqCod_Sel, GXv_char14) ;
      webpartesproduccion_impl.this.GXt_char1 = GXv_char14[0] ;
      GXt_char19 = "" ;
      GXv_char13[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV111TFMaqDsc_Sel)==0), AV111TFMaqDsc_Sel, GXv_char13) ;
      webpartesproduccion_impl.this.GXt_char19 = GXv_char13[0] ;
      GXt_char20 = "" ;
      GXv_char4[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFBarNHdr_Sel)==0), AV58TFBarNHdr_Sel, GXv_char4) ;
      webpartesproduccion_impl.this.GXt_char20 = GXv_char4[0] ;
      GXt_char21 = "" ;
      GXv_char3[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFFase_Sel)==0), AV67TFFase_Sel, GXv_char3) ;
      webpartesproduccion_impl.this.GXt_char21 = GXv_char3[0] ;
      GXt_char22 = "" ;
      GXv_char2[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFHisProF_Sel)==0), AV83TFHisProF_Sel, GXv_char2) ;
      webpartesproduccion_impl.this.GXt_char22 = GXv_char2[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV101TFParCodNom_Sel)==0), AV101TFParCodNom_Sel, GXv_char24) ;
      webpartesproduccion_impl.this.GXt_char23 = GXv_char24[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char19+"|||"+GXt_char20+"|||"+GXt_char21+"|||"+GXt_char22+"|||||"+GXt_char23 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFMaqCod)==0), AV46TFMaqCod, GXv_char24) ;
      webpartesproduccion_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char22 = "" ;
      GXv_char14[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV110TFMaqDsc)==0), AV110TFMaqDsc, GXv_char14) ;
      webpartesproduccion_impl.this.GXt_char22 = GXv_char14[0] ;
      GXt_char21 = "" ;
      GXv_char13[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFBarNHdr)==0), AV57TFBarNHdr, GXv_char13) ;
      webpartesproduccion_impl.this.GXt_char21 = GXv_char13[0] ;
      GXt_char20 = "" ;
      GXv_char4[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFFase)==0), AV66TFFase, GXv_char4) ;
      webpartesproduccion_impl.this.GXt_char20 = GXv_char4[0] ;
      GXt_char19 = "" ;
      GXv_char3[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV82TFHisProF)==0), AV82TFHisProF, GXv_char3) ;
      webpartesproduccion_impl.this.GXt_char19 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV100TFParCodNom)==0), AV100TFParCodNom, GXv_char2) ;
      webpartesproduccion_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char23+"|"+GXt_char22+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49TFHisProFec)) ? "" : localUtil.dtoc( AV49TFHisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV54TFHisProLin) ? "" : GXutil.str( AV54TFHisProLin, 8, 0))+"|"+GXt_char21+"|"+((0==AV60TFGruOpeCod) ? "" : GXutil.str( AV60TFGruOpeCod, 6, 0))+"|"+((0==AV63TFBarOrdLin) ? "" : GXutil.str( AV63TFBarOrdLin, 4, 0))+"|"+GXt_char20+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV72TFHisProDTI) ? "" : localUtil.dtoc( AV74DDO_HisProDTIAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV77TFHisProDTF) ? "" : localUtil.dtoc( AV79DDO_HisProDTFAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char19+"|"+((0==AV85TFHisProTur) ? "" : GXutil.str( AV85TFHisProTur, 1, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFHisProKgr)==0) ? "" : GXutil.str( AV88TFHisProKgr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV91TFHisProMtr)==0) ? "" : GXutil.str( AV91TFHisProMtr, 9, 2))+"|"+((0==AV94TFHisProNpzs) ? "" : GXutil.str( AV94TFHisProNpzs, 4, 0))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||"+((0==AV55TFHisProLin_To) ? "" : GXutil.str( AV55TFHisProLin_To, 8, 0))+"||"+((0==AV61TFGruOpeCod_To) ? "" : GXutil.str( AV61TFGruOpeCod_To, 6, 0))+"|"+((0==AV64TFBarOrdLin_To) ? "" : GXutil.str( AV64TFBarOrdLin_To, 4, 0))+"|||||"+((0==AV86TFHisProTur_To) ? "" : GXutil.str( AV86TFHisProTur_To, 1, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFHisProKgr_To)==0) ? "" : GXutil.str( AV89TFHisProKgr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV92TFHisProMtr_To)==0) ? "" : GXutil.str( AV92TFHisProMtr_To, 9, 2))+"|"+((0==AV95TFHisProNpzs_To) ? "" : GXutil.str( AV95TFHisProNpzs_To, 4, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV41Session.getValue(AV171Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV130FilterFullText)==0), (short)(0), AV130FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFMAQCOD", "", !(GXutil.strcmp("", AV46TFMaqCod)==0), (short)(0), AV46TFMaqCod, "", !(GXutil.strcmp("", AV47TFMaqCod_Sel)==0), AV47TFMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFMAQDSC", "", !(GXutil.strcmp("", AV110TFMaqDsc)==0), (short)(0), AV110TFMaqDsc, "", !(GXutil.strcmp("", AV111TFMaqDsc_Sel)==0), AV111TFMaqDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFHISPROFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49TFHisProFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV49TFHisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFHISPROLIN", "", !((0==AV54TFHisProLin)&&(0==AV55TFHisProLin_To)), (short)(0), GXutil.trim( GXutil.str( AV54TFHisProLin, 8, 0)), GXutil.trim( GXutil.str( AV55TFHisProLin_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFBARNHDR", "", !(GXutil.strcmp("", AV57TFBarNHdr)==0), (short)(0), AV57TFBarNHdr, "", !(GXutil.strcmp("", AV58TFBarNHdr_Sel)==0), AV58TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFGRUOPECOD", "", !((0==AV60TFGruOpeCod)&&(0==AV61TFGruOpeCod_To)), (short)(0), GXutil.trim( GXutil.str( AV60TFGruOpeCod, 6, 0)), GXutil.trim( GXutil.str( AV61TFGruOpeCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFBARORDLIN", "", !((0==AV63TFBarOrdLin)&&(0==AV64TFBarOrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV63TFBarOrdLin, 4, 0)), GXutil.trim( GXutil.str( AV64TFBarOrdLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFFASE", "", !(GXutil.strcmp("", AV66TFFase)==0), (short)(0), AV66TFFase, "", !(GXutil.strcmp("", AV67TFFase_Sel)==0), AV67TFFase_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFHISPRODTI", "", !GXutil.dateCompare(GXutil.nullDate(), AV72TFHisProDTI), (short)(0), GXutil.trim( localUtil.ttoc( AV72TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFHISPRODTF", "", !GXutil.dateCompare(GXutil.nullDate(), AV77TFHisProDTF), (short)(0), GXutil.trim( localUtil.ttoc( AV77TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFHISPROF", "", !(GXutil.strcmp("", AV82TFHisProF)==0), (short)(0), AV82TFHisProF, "", !(GXutil.strcmp("", AV83TFHisProF_Sel)==0), AV83TFHisProF_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFHISPROTUR", "", !((0==AV85TFHisProTur)&&(0==AV86TFHisProTur_To)), (short)(0), GXutil.trim( GXutil.str( AV85TFHisProTur, 1, 0)), GXutil.trim( GXutil.str( AV86TFHisProTur_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFHISPROKGR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFHisProKgr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFHisProKgr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV88TFHisProKgr, 9, 2)), GXutil.trim( GXutil.str( AV89TFHisProKgr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFHISPROMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV91TFHisProMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV92TFHisProMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV91TFHisProMtr, 9, 2)), GXutil.trim( GXutil.str( AV92TFHisProMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFHISPRONPZS", "", !((0==AV94TFHisProNpzs)&&(0==AV95TFHisProNpzs_To)), (short)(0), GXutil.trim( GXutil.str( AV94TFHisProNpzs, 4, 0)), GXutil.trim( GXutil.str( AV95TFHisProNpzs_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFPARCODNOM", "", !(GXutil.strcmp("", AV100TFParCodNom)==0), (short)(0), AV100TFParCodNom, "", !(GXutil.strcmp("", AV101TFParCodNom_Sel)==0), AV101TFParCodNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState25[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV171Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV171Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LHIPRO" );
      AV41Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_70_HM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_dltlinea_Internalname, tblTabledvelop_confirmpanel_dltlinea_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_dltlinea.setProperty("Title", Dvelop_confirmpanel_dltlinea_Title);
         ucDvelop_confirmpanel_dltlinea.setProperty("ConfirmationText", Dvelop_confirmpanel_dltlinea_Confirmationtext);
         ucDvelop_confirmpanel_dltlinea.setProperty("YesButtonCaption", Dvelop_confirmpanel_dltlinea_Yesbuttoncaption);
         ucDvelop_confirmpanel_dltlinea.setProperty("NoButtonCaption", Dvelop_confirmpanel_dltlinea_Nobuttoncaption);
         ucDvelop_confirmpanel_dltlinea.setProperty("CancelButtonCaption", Dvelop_confirmpanel_dltlinea_Cancelbuttoncaption);
         ucDvelop_confirmpanel_dltlinea.setProperty("YesButtonPosition", Dvelop_confirmpanel_dltlinea_Yesbuttonposition);
         ucDvelop_confirmpanel_dltlinea.setProperty("ConfirmType", Dvelop_confirmpanel_dltlinea_Confirmtype);
         ucDvelop_confirmpanel_dltlinea.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_dltlinea_Internalname, "DVELOP_CONFIRMPANEL_DLTLINEAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_DLTLINEAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_70_HM2e( true) ;
      }
      else
      {
         wb_table2_70_HM2e( false) ;
      }
   }

   public void wb_table1_23_HM2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV42ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_28_HM2( true) ;
      }
      else
      {
         wb_table3_28_HM2( false) ;
      }
      return  ;
   }

   public void wb_table3_28_HM2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_HM2e( true) ;
      }
      else
      {
         wb_table1_23_HM2e( false) ;
      }
   }

   public void wb_table3_28_HM2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV130FilterFullText, GXutil.rtrim( localUtil.format( AV130FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WebPartesProduccion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_HM2e( true) ;
      }
      else
      {
         wb_table3_28_HM2e( false) ;
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
      paHM2( ) ;
      wsHM2( ) ;
      weHM2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116121394", true, true);
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
      httpContext.AddJavascriptSource("webpartesproduccion.js", "?202682116121394", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_412( )
   {
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES_"+sGXsfl_41_idx );
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_41_idx ;
      edtMaqDsc_Internalname = "MAQDSC_"+sGXsfl_41_idx ;
      edtHisProFec_Internalname = "HISPROFEC_"+sGXsfl_41_idx ;
      edtHisProLin_Internalname = "HISPROLIN_"+sGXsfl_41_idx ;
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_41_idx ;
      edtGruOpeCod_Internalname = "GRUOPECOD_"+sGXsfl_41_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_41_idx ;
      edtFase_Internalname = "FASE_"+sGXsfl_41_idx ;
      edtHisProDTI_Internalname = "HISPRODTI_"+sGXsfl_41_idx ;
      edtHisProDTF_Internalname = "HISPRODTF_"+sGXsfl_41_idx ;
      edtHisProF_Internalname = "HISPROF_"+sGXsfl_41_idx ;
      edtHisProTur_Internalname = "HISPROTUR_"+sGXsfl_41_idx ;
      edtHisProKgr_Internalname = "HISPROKGR_"+sGXsfl_41_idx ;
      edtHisProMtr_Internalname = "HISPROMTR_"+sGXsfl_41_idx ;
      edtHisProNpzs_Internalname = "HISPRONPZS_"+sGXsfl_41_idx ;
      edtParCodNom_Internalname = "PARCODNOM_"+sGXsfl_41_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_41_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_41_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES_"+sGXsfl_41_fel_idx );
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_41_fel_idx ;
      edtMaqDsc_Internalname = "MAQDSC_"+sGXsfl_41_fel_idx ;
      edtHisProFec_Internalname = "HISPROFEC_"+sGXsfl_41_fel_idx ;
      edtHisProLin_Internalname = "HISPROLIN_"+sGXsfl_41_fel_idx ;
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_41_fel_idx ;
      edtGruOpeCod_Internalname = "GRUOPECOD_"+sGXsfl_41_fel_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_41_fel_idx ;
      edtFase_Internalname = "FASE_"+sGXsfl_41_fel_idx ;
      edtHisProDTI_Internalname = "HISPRODTI_"+sGXsfl_41_fel_idx ;
      edtHisProDTF_Internalname = "HISPRODTF_"+sGXsfl_41_fel_idx ;
      edtHisProF_Internalname = "HISPROF_"+sGXsfl_41_fel_idx ;
      edtHisProTur_Internalname = "HISPROTUR_"+sGXsfl_41_fel_idx ;
      edtHisProKgr_Internalname = "HISPROKGR_"+sGXsfl_41_fel_idx ;
      edtHisProMtr_Internalname = "HISPROMTR_"+sGXsfl_41_fel_idx ;
      edtHisProNpzs_Internalname = "HISPRONPZS_"+sGXsfl_41_fel_idx ;
      edtParCodNom_Internalname = "PARCODNOM_"+sGXsfl_41_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_41_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_41_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wbHM0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_41_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_41_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         if ( ( cmbavGrupodeacciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_41_idx ;
            cmbavGrupodeacciones.setName( GXCCtl );
            cmbavGrupodeacciones.setWebtags( "" );
            if ( cmbavGrupodeacciones.getItemCount() > 0 )
            {
               AV138Grupodeacciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV138Grupodeacciones, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138Grupodeacciones), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeacciones,cmbavGrupodeacciones.getInternalname(),GXutil.trim( GXutil.str( AV138Grupodeacciones, 4, 0)),Integer.valueOf(1),cmbavGrupodeacciones.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRUPODEACCIONES.CLICK."+sGXsfl_41_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,42);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV138Grupodeacciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), !bGXsfl_41_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqDsc_Internalname,GXutil.rtrim( A606MaqDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProFec_Internalname,localUtil.format(A558HisProFec, "99/99/99"),localUtil.format( A558HisProFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProLin_Internalname,GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A561HisProLin), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtGruOpeCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGruOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGruOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtGruOpeCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarOrdLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFase_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFase_Internalname,GXutil.rtrim( A461Fase),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtFase_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProDTI_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDTI_Internalname,localUtil.ttoc( A4440HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4440HisProDTI, "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProDTI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProDTI_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProDTF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDTF_Internalname,localUtil.ttoc( A4441HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4441HisProDTF, "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProDTF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProDTF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisProF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProF_Internalname,GXutil.rtrim( A557HisProF),GXutil.rtrim( localUtil.format( A557HisProF, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProTur_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProTur_Internalname,GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProTur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProTur_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProKgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProKgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1525HisProKgr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProKgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProKgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1526HisProMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProNpzs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProNpzs_Internalname,GXutil.ltrim( localUtil.ntoc( A4714HisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4714HisProNpzs), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProNpzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProNpzs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtParCodNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParCodNom_Internalname,GXutil.rtrim( A867ParCodNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParCodNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtParCodNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesHM2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      /* End function sendrow_412 */
   }

   public void startgridcontrol41( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"41\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGruOpeCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarOrdLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFase_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProDTI_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProDTF_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProF_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProTur_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProKgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProNpzs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pcs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtParCodNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Paro", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV138Grupodeacciones, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A606MaqDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A558HisProFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGruOpeCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarOrdLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A461Fase));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFase_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4440HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProDTI_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4441HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProDTF_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A557HisProF));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProF_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProTur_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProKgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4714HisProNpzs, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProNpzs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A867ParCodNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtParCodNom_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES" );
      edtMaqCod_Internalname = "MAQCOD" ;
      edtMaqDsc_Internalname = "MAQDSC" ;
      edtHisProFec_Internalname = "HISPROFEC" ;
      edtHisProLin_Internalname = "HISPROLIN" ;
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtGruOpeCod_Internalname = "GRUOPECOD" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      edtFase_Internalname = "FASE" ;
      edtHisProDTI_Internalname = "HISPRODTI" ;
      edtHisProDTF_Internalname = "HISPRODTF" ;
      edtHisProF_Internalname = "HISPROF" ;
      edtHisProTur_Internalname = "HISPROTUR" ;
      edtHisProKgr_Internalname = "HISPROKGR" ;
      edtHisProMtr_Internalname = "HISPROMTR" ;
      edtHisProNpzs_Internalname = "HISPRONPZS" ;
      edtParCodNom_Internalname = "PARCODNOM" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_dltlinea_Internalname = "DVELOP_CONFIRMPANEL_DLTLINEA" ;
      tblTabledvelop_confirmpanel_dltlinea_Internalname = "TABLEDVELOP_CONFIRMPANEL_DLTLINEA" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_hisprofecauxdate_Internalname = "vDDO_HISPROFECAUXDATE" ;
      divDdo_hisprofecauxdates_Internalname = "DDO_HISPROFECAUXDATES" ;
      edtavDdo_hisprodtiauxdate_Internalname = "vDDO_HISPRODTIAUXDATE" ;
      divDdo_hisprodtiauxdates_Internalname = "DDO_HISPRODTIAUXDATES" ;
      edtavDdo_hisprodtfauxdate_Internalname = "vDDO_HISPRODTFAUXDATE" ;
      divDdo_hisprodtfauxdates_Internalname = "DDO_HISPRODTFAUXDATES" ;
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
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtParCodNom_Jsonclick = "" ;
      edtHisProNpzs_Jsonclick = "" ;
      edtHisProMtr_Jsonclick = "" ;
      edtHisProKgr_Jsonclick = "" ;
      edtHisProTur_Jsonclick = "" ;
      edtHisProF_Jsonclick = "" ;
      edtHisProDTF_Jsonclick = "" ;
      edtHisProDTI_Jsonclick = "" ;
      edtFase_Jsonclick = "" ;
      edtBarOrdLin_Jsonclick = "" ;
      edtGruOpeCod_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtHisProLin_Jsonclick = "" ;
      edtHisProFec_Jsonclick = "" ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      cmbavGrupodeacciones.setJsonclick( "" );
      cmbavGrupodeacciones.setVisible( -1 );
      cmbavGrupodeacciones.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtParCodNom_Visible = -1 ;
      edtHisProNpzs_Visible = -1 ;
      edtHisProMtr_Visible = -1 ;
      edtHisProKgr_Visible = -1 ;
      edtHisProTur_Visible = -1 ;
      edtHisProF_Visible = -1 ;
      edtHisProDTF_Visible = -1 ;
      edtHisProDTI_Visible = -1 ;
      edtFase_Visible = -1 ;
      edtBarOrdLin_Visible = -1 ;
      edtGruOpeCod_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtHisProLin_Visible = -1 ;
      edtHisProFec_Visible = -1 ;
      edtMaqDsc_Visible = -1 ;
      edtMaqCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_hisprodtfauxdate_Jsonclick = "" ;
      edtavDdo_hisprodtiauxdate_Jsonclick = "" ;
      edtavDdo_hisprofecauxdate_Jsonclick = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_dltlinea_Confirmtype = "1" ;
      Dvelop_confirmpanel_dltlinea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_dltlinea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_dltlinea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_dltlinea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_dltlinea_Confirmationtext = "?Desea eliminar la linea?" ;
      Dvelop_confirmpanel_dltlinea_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WebPartesProduccionGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|||Dynamic|||Dynamic|||Dynamic|||||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T|||T|||T|||T|||||T" ;
      Ddo_grid_Filterisrange = "|||T||T|T|||||T|T|T|T|" ;
      Ddo_grid_Filtertype = "Character|Character|Date|Numeric|Character|Numeric|Numeric|Character|Date|Date|Character|Numeric|Numeric|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "1|4|2|3||5|6|7|8|9|10|11|12|13|14|15" ;
      Ddo_grid_Columnids = "1:MaqCod|2:MaqDsc|3:HisProFec|4:HisProLin|5:BarNHdr|6:GruOpeCod|7:BarOrdLin|8:Fase|9:HisProDTI|10:HisProDTF|11:HisProF|12:HisProTur|13:HisProKgr|14:HisProMtr|15:HisProNpzs|16:ParCodNom" ;
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
      Form.setCaption( httpContext.getMessage( " Table LHIPRO", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_41_idx ;
      cmbavGrupodeacciones.setName( GXCCtl );
      cmbavGrupodeacciones.setWebtags( "" );
      if ( cmbavGrupodeacciones.getItemCount() > 0 )
      {
         AV138Grupodeacciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV138Grupodeacciones, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138Grupodeacciones), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV110TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV111TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV49TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV54TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV55TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV58TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV60TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV61TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV63TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV64TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV66TFFase',fld:'vTFFASE',pic:''},{av:'AV67TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV72TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV77TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV82TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV83TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV85TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV86TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV88TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV91TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV92TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV94TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV95TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV100TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV101TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtHisProFec_Visible',ctrl:'HISPROFEC',prop:'Visible'},{av:'edtHisProLin_Visible',ctrl:'HISPROLIN',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProF_Visible',ctrl:'HISPROF',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProNpzs_Visible',ctrl:'HISPRONPZS',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'AV105GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV106GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12HM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV110TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV111TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV49TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV54TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV55TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV58TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV60TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV61TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV63TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV64TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV66TFFase',fld:'vTFFASE',pic:''},{av:'AV67TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV72TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV77TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV82TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV83TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV85TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV86TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV88TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV91TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV92TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV94TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV95TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV100TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV101TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13HM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV110TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV111TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV49TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV54TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV55TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV58TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV60TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV61TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV63TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV64TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV66TFFase',fld:'vTFFASE',pic:''},{av:'AV67TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV72TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV77TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV82TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV83TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV85TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV86TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV88TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV91TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV92TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV94TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV95TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV100TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV101TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14HM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV110TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV111TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV49TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV54TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV55TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV58TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV60TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV61TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV63TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV64TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV66TFFase',fld:'vTFFASE',pic:''},{av:'AV67TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV72TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV77TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV82TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV83TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV85TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV86TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV88TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV91TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV92TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV94TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV95TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV100TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV101TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV100TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV101TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV94TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV95TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV91TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV92TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV88TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV85TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV86TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV82TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV83TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV77TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV72TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV66TFFase',fld:'vTFFASE',pic:''},{av:'AV67TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV63TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV64TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV60TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV61TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV57TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV58TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV54TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV55TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV49TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV110TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV111TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21HM2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV138Grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15HM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV110TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV111TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV49TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV54TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV55TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV58TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV60TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV61TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV63TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV64TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV66TFFase',fld:'vTFFASE',pic:''},{av:'AV67TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV72TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV77TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV82TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV83TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV85TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV86TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV88TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV91TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV92TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV94TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV95TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV100TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV101TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtHisProFec_Visible',ctrl:'HISPROFEC',prop:'Visible'},{av:'edtHisProLin_Visible',ctrl:'HISPROLIN',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProF_Visible',ctrl:'HISPROF',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProNpzs_Visible',ctrl:'HISPRONPZS',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'AV105GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV106GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11HM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV110TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV111TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV49TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV54TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV55TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV58TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV60TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV61TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV63TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV64TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV66TFFase',fld:'vTFFASE',pic:''},{av:'AV67TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV72TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV77TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV82TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV83TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV85TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV86TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV88TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV91TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV92TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV94TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV95TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV100TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV101TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV74DDO_HisProDTIAuxDate',fld:'vDDO_HISPRODTIAUXDATE',pic:''},{av:'AV79DDO_HisProDTFAuxDate',fld:'vDDO_HISPRODTFAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV110TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV111TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV49TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV54TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV55TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV58TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV60TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV61TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV63TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV64TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV66TFFase',fld:'vTFFASE',pic:''},{av:'AV67TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV72TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV77TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV82TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV83TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV85TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV86TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV88TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV91TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV92TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV94TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV95TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV100TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV101TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV79DDO_HisProDTFAuxDate',fld:'vDDO_HISPRODTFAUXDATE',pic:''},{av:'AV74DDO_HisProDTIAuxDate',fld:'vDDO_HISPRODTIAUXDATE',pic:''},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtHisProFec_Visible',ctrl:'HISPROFEC',prop:'Visible'},{av:'edtHisProLin_Visible',ctrl:'HISPROLIN',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProF_Visible',ctrl:'HISPROF',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProNpzs_Visible',ctrl:'HISPRONPZS',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'AV105GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV106GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRUPODEACCIONES.CLICK","{handler:'e22HM2',iparms:[{av:'cmbavGrupodeacciones'},{av:'AV138Grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV110TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV111TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV49TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV54TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV55TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV58TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV60TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV61TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV63TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV64TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV66TFFase',fld:'vTFFASE',pic:''},{av:'AV67TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV72TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV77TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV82TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV83TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV85TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV86TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV88TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV91TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV92TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV94TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV95TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV100TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV101TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'AV112EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A7258FaseDsc',fld:'FASEDSC',pic:''},{av:'AV114UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV115Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VGRUPODEACCIONES.CLICK",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV138Grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV112EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV115Station',fld:'vSTATION',pic:''},{av:'AV114UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A7258FaseDsc',fld:'FASEDSC',pic:''},{av:'A461Fase',fld:'FASE',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtHisProFec_Visible',ctrl:'HISPROFEC',prop:'Visible'},{av:'edtHisProLin_Visible',ctrl:'HISPROLIN',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProF_Visible',ctrl:'HISPROF',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProNpzs_Visible',ctrl:'HISPRONPZS',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'AV105GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV106GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_DLTLINEA.CLOSE","{handler:'e16HM2',iparms:[{av:'Dvelop_confirmpanel_dltlinea_Result',ctrl:'DVELOP_CONFIRMPANEL_DLTLINEA',prop:'Result'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'AV117Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV114UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV115Station',fld:'vSTATION',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV110TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV111TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV49TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV54TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV55TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV58TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV60TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV61TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV63TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV64TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV66TFFase',fld:'vTFFASE',pic:''},{av:'AV67TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV72TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV77TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV82TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV83TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV85TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV86TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV88TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV91TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV92TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV94TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV95TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV100TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV101TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_DLTLINEA.CLOSE",",oparms:[{av:'AV115Station',fld:'vSTATION',pic:''},{av:'AV114UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtHisProFec_Visible',ctrl:'HISPROFEC',prop:'Visible'},{av:'edtHisProLin_Visible',ctrl:'HISPROLIN',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtBarOrdLin_Visible',ctrl:'BARORDLIN',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProF_Visible',ctrl:'HISPROF',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProNpzs_Visible',ctrl:'HISPRONPZS',prop:'Visible'},{av:'edtParCodNom_Visible',ctrl:'PARCODNOM',prop:'Visible'},{av:'AV105GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV106GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17HM2',iparms:[{av:'AV171Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV111TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV58TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV67TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV83TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV101TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV110TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV49TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV54TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV57TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV60TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV63TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV66TFFase',fld:'vTFFASE',pic:''},{av:'AV72TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV74DDO_HisProDTIAuxDate',fld:'vDDO_HISPRODTIAUXDATE',pic:''},{av:'AV77TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV79DDO_HisProDTFAuxDate',fld:'vDDO_HISPRODTFAUXDATE',pic:''},{av:'AV82TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV85TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV88TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV91TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV94TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV100TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV55TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV61TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV64TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV86TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV89TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV92TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV95TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV110TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV111TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV49TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV54TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV55TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV58TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV60TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV61TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV63TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV64TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV66TFFase',fld:'vTFFASE',pic:''},{av:'AV67TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV72TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV77TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV82TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV83TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV85TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV86TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV88TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV91TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV92TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV94TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV95TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV100TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV101TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV117Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV79DDO_HisProDTFAuxDate',fld:'vDDO_HISPRODTFAUXDATE',pic:''},{av:'AV74DDO_HisProDTIAuxDate',fld:'vDDO_HISPRODTIAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e18HM2',iparms:[{av:'AV171Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV111TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV58TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV67TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV83TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV101TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV110TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV49TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV54TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV57TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV60TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV63TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV66TFFase',fld:'vTFFASE',pic:''},{av:'AV72TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV74DDO_HisProDTIAuxDate',fld:'vDDO_HISPRODTIAUXDATE',pic:''},{av:'AV77TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV79DDO_HisProDTFAuxDate',fld:'vDDO_HISPRODTFAUXDATE',pic:''},{av:'AV82TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV85TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV88TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV91TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV94TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV100TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV55TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV61TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV64TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV86TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV89TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV92TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV95TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV46TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV47TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV110TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV111TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV49TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV54TFHisProLin',fld:'vTFHISPROLIN',pic:'ZZZZZZZ9'},{av:'AV55TFHisProLin_To',fld:'vTFHISPROLIN_TO',pic:'ZZZZZZZ9'},{av:'AV57TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV58TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV60TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV61TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV63TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV64TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV66TFFase',fld:'vTFFASE',pic:''},{av:'AV67TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV72TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV77TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV82TFHisProF',fld:'vTFHISPROF',pic:'@!'},{av:'AV83TFHisProF_Sel',fld:'vTFHISPROF_SEL',pic:'@!'},{av:'AV85TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV86TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV88TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV91TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV92TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV94TFHisProNpzs',fld:'vTFHISPRONPZS',pic:'ZZZ9'},{av:'AV95TFHisProNpzs_To',fld:'vTFHISPRONPZS_TO',pic:'ZZZ9'},{av:'AV100TFParCodNom',fld:'vTFPARCODNOM',pic:''},{av:'AV101TFParCodNom_Sel',fld:'vTFPARCODNOM_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV117Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV79DDO_HisProDTFAuxDate',fld:'vDDO_HISPRODTFAUXDATE',pic:''},{av:'AV74DDO_HisProDTIAuxDate',fld:'vDDO_HISPRODTIAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_FASE","{handler:'valid_Fase',iparms:[]");
      setEventMetadata("VALID_FASE",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
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
      Dvelop_confirmpanel_dltlinea_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV130FilterFullText = "" ;
      AV39ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV46TFMaqCod = "" ;
      AV47TFMaqCod_Sel = "" ;
      AV110TFMaqDsc = "" ;
      AV111TFMaqDsc_Sel = "" ;
      AV49TFHisProFec = GXutil.nullDate() ;
      AV57TFBarNHdr = "" ;
      AV58TFBarNHdr_Sel = "" ;
      AV66TFFase = "" ;
      AV67TFFase_Sel = "" ;
      AV72TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV77TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV82TFHisProF = "" ;
      AV83TFHisProF_Sel = "" ;
      AV88TFHisProKgr = DecimalUtil.ZERO ;
      AV89TFHisProKgr_To = DecimalUtil.ZERO ;
      AV91TFHisProMtr = DecimalUtil.ZERO ;
      AV92TFHisProMtr_To = DecimalUtil.ZERO ;
      AV100TFParCodNom = "" ;
      AV101TFParCodNom_Sel = "" ;
      AV171Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV42ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV103DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV112EmprCod = "" ;
      AV114UsurCod = "" ;
      AV115Station = "" ;
      A396EmprCod = "" ;
      A7258FaseDsc = "" ;
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
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV51DDO_HisProFecAuxDate = GXutil.nullDate() ;
      AV74DDO_HisProDTIAuxDate = GXutil.nullDate() ;
      AV79DDO_HisProDTFAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      A461Fase = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      A130BarCodPar = "" ;
      scmdbuf = "" ;
      lV141Webpartesproduccionds_1_filterfulltext = "" ;
      lV142Webpartesproduccionds_2_tfmaqcod = "" ;
      lV144Webpartesproduccionds_4_tfmaqdsc = "" ;
      lV149Webpartesproduccionds_9_tfbarnhdr = "" ;
      lV155Webpartesproduccionds_15_tffase = "" ;
      lV159Webpartesproduccionds_19_tfhisprof = "" ;
      lV169Webpartesproduccionds_29_tfparcodnom = "" ;
      AV141Webpartesproduccionds_1_filterfulltext = "" ;
      AV143Webpartesproduccionds_3_tfmaqcod_sel = "" ;
      AV142Webpartesproduccionds_2_tfmaqcod = "" ;
      AV145Webpartesproduccionds_5_tfmaqdsc_sel = "" ;
      AV144Webpartesproduccionds_4_tfmaqdsc = "" ;
      AV146Webpartesproduccionds_6_tfhisprofec = GXutil.nullDate() ;
      AV150Webpartesproduccionds_10_tfbarnhdr_sel = "" ;
      AV149Webpartesproduccionds_9_tfbarnhdr = "" ;
      AV156Webpartesproduccionds_16_tffase_sel = "" ;
      AV155Webpartesproduccionds_15_tffase = "" ;
      AV157Webpartesproduccionds_17_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV158Webpartesproduccionds_18_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV160Webpartesproduccionds_20_tfhisprof_sel = "" ;
      AV159Webpartesproduccionds_19_tfhisprof = "" ;
      AV163Webpartesproduccionds_23_tfhisprokgr = DecimalUtil.ZERO ;
      AV164Webpartesproduccionds_24_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV165Webpartesproduccionds_25_tfhispromtr = DecimalUtil.ZERO ;
      AV166Webpartesproduccionds_26_tfhispromtr_to = DecimalUtil.ZERO ;
      AV170Webpartesproduccionds_30_tfparcodnom_sel = "" ;
      AV169Webpartesproduccionds_29_tfparcodnom = "" ;
      H00HM2_A656ParCod = new short[1] ;
      H00HM2_n656ParCod = new boolean[] {false} ;
      H00HM2_A867ParCodNom = new String[] {""} ;
      H00HM2_n867ParCodNom = new boolean[] {false} ;
      H00HM2_A4714HisProNpzs = new short[1] ;
      H00HM2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00HM2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00HM2_A566HisProTur = new byte[1] ;
      H00HM2_A557HisProF = new String[] {""} ;
      H00HM2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H00HM2_n4441HisProDTF = new boolean[] {false} ;
      H00HM2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H00HM2_n4440HisProDTI = new boolean[] {false} ;
      H00HM2_A194BarOrdLin = new short[1] ;
      H00HM2_A503GruOpeCod = new int[1] ;
      H00HM2_A561HisProLin = new int[1] ;
      H00HM2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00HM2_A606MaqDsc = new String[] {""} ;
      H00HM2_n606MaqDsc = new boolean[] {false} ;
      H00HM2_A602MaqCod = new String[] {""} ;
      H00HM2_A130BarCodPar = new String[] {""} ;
      H00HM2_A132BarCodReo = new byte[1] ;
      H00HM2_A129BarCod = new int[1] ;
      H00HM2_A461Fase = new String[] {""} ;
      H00HM2_A396EmprCod = new String[] {""} ;
      H00HM3_AGRID_nRecordCount = new long[1] ;
      AV113EmprNom = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV37ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV43ManageFiltersXml = "" ;
      AV35ExcelFilename = "" ;
      AV36ErrorMessage = "" ;
      AV38UserCustomValue = "" ;
      AV40ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector16 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18 = new GXBaseCollection[1] ;
      GXv_int10 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int11 = new short[1] ;
      GXv_date12 = new java.util.Date[1] ;
      AV134EmprCod_Selected = "" ;
      AV135MaqCod_Selected = "" ;
      AV136HisProFec_Selected = GXutil.nullDate() ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char23 = "" ;
      GXv_char24 = new String[1] ;
      GXt_char22 = "" ;
      GXv_char14 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char13 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState25 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDvelop_confirmpanel_dltlinea = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webpartesproduccion__default(),
         new Object[] {
             new Object[] {
            H00HM2_A656ParCod, H00HM2_n656ParCod, H00HM2_A867ParCodNom, H00HM2_n867ParCodNom, H00HM2_A4714HisProNpzs, H00HM2_A1526HisProMtr, H00HM2_A1525HisProKgr, H00HM2_A566HisProTur, H00HM2_A557HisProF, H00HM2_A4441HisProDTF,
            H00HM2_n4441HisProDTF, H00HM2_A4440HisProDTI, H00HM2_n4440HisProDTI, H00HM2_A194BarOrdLin, H00HM2_A503GruOpeCod, H00HM2_A561HisProLin, H00HM2_A558HisProFec, H00HM2_A606MaqDsc, H00HM2_n606MaqDsc, H00HM2_A602MaqCod,
            H00HM2_A130BarCodPar, H00HM2_A132BarCodReo, H00HM2_A129BarCod, H00HM2_A461Fase, H00HM2_A396EmprCod
            }
            , new Object[] {
            H00HM3_AGRID_nRecordCount
            }
         }
      );
      AV171Pgmname = "WebPartesProduccion" ;
      /* GeneXus formulas. */
      AV171Pgmname = "WebPartesProduccion" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV44ManageFiltersExecutionStep ;
   private byte AV85TFHisProTur ;
   private byte AV86TFHisProTur_To ;
   private byte gxajaxcallmode ;
   private byte A566HisProTur ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV161Webpartesproduccionds_21_tfhisprotur ;
   private byte AV162Webpartesproduccionds_22_tfhisprotur_to ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV63TFBarOrdLin ;
   private short AV64TFBarOrdLin_To ;
   private short AV94TFHisProNpzs ;
   private short AV95TFHisProNpzs_To ;
   private short AV13OrderedBy ;
   private short AV117Carvema ;
   private short wbEnd ;
   private short wbStart ;
   private short AV138Grupodeacciones ;
   private short A194BarOrdLin ;
   private short A4714HisProNpzs ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV153Webpartesproduccionds_13_tfbarordlin ;
   private short AV154Webpartesproduccionds_14_tfbarordlin_to ;
   private short AV167Webpartesproduccionds_27_tfhispronpzs ;
   private short AV168Webpartesproduccionds_28_tfhispronpzs_to ;
   private short A656ParCod ;
   private short AV120Tosa ;
   private short AV121kgmtpz ;
   private short GXv_int11[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int nGXsfl_41_idx=1 ;
   private int AV54TFHisProLin ;
   private int AV55TFHisProLin_To ;
   private int AV60TFGruOpeCod ;
   private int AV61TFGruOpeCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A561HisProLin ;
   private int A503GruOpeCod ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV147Webpartesproduccionds_7_tfhisprolin ;
   private int AV148Webpartesproduccionds_8_tfhisprolin_to ;
   private int AV151Webpartesproduccionds_11_tfgruopecod ;
   private int AV152Webpartesproduccionds_12_tfgruopecod_to ;
   private int edtMaqCod_Visible ;
   private int edtMaqDsc_Visible ;
   private int edtHisProFec_Visible ;
   private int edtHisProLin_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtGruOpeCod_Visible ;
   private int edtBarOrdLin_Visible ;
   private int edtFase_Visible ;
   private int edtHisProDTI_Visible ;
   private int edtHisProDTF_Visible ;
   private int edtHisProF_Visible ;
   private int edtHisProTur_Visible ;
   private int edtHisProKgr_Visible ;
   private int edtHisProMtr_Visible ;
   private int edtHisProNpzs_Visible ;
   private int edtParCodNom_Visible ;
   private int AV104PageToGo ;
   private int GXv_int10[] ;
   private int AV172Hisprolin_selected ;
   private int AV173GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV105GridCurrentPage ;
   private long AV106GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV88TFHisProKgr ;
   private java.math.BigDecimal AV89TFHisProKgr_To ;
   private java.math.BigDecimal AV91TFHisProMtr ;
   private java.math.BigDecimal AV92TFHisProMtr_To ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV163Webpartesproduccionds_23_tfhisprokgr ;
   private java.math.BigDecimal AV164Webpartesproduccionds_24_tfhisprokgr_to ;
   private java.math.BigDecimal AV165Webpartesproduccionds_25_tfhispromtr ;
   private java.math.BigDecimal AV166Webpartesproduccionds_26_tfhispromtr_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_dltlinea_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_41_idx="0001" ;
   private String AV46TFMaqCod ;
   private String AV47TFMaqCod_Sel ;
   private String AV110TFMaqDsc ;
   private String AV111TFMaqDsc_Sel ;
   private String AV57TFBarNHdr ;
   private String AV58TFBarNHdr_Sel ;
   private String AV66TFFase ;
   private String AV67TFFase_Sel ;
   private String AV82TFHisProF ;
   private String AV83TFHisProF_Sel ;
   private String AV100TFParCodNom ;
   private String AV101TFParCodNom_Sel ;
   private String AV171Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV112EmprCod ;
   private String AV114UsurCod ;
   private String AV115Station ;
   private String A396EmprCod ;
   private String A7258FaseDsc ;
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
   private String Dvelop_confirmpanel_dltlinea_Title ;
   private String Dvelop_confirmpanel_dltlinea_Confirmationtext ;
   private String Dvelop_confirmpanel_dltlinea_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_dltlinea_Nobuttoncaption ;
   private String Dvelop_confirmpanel_dltlinea_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_dltlinea_Yesbuttonposition ;
   private String Dvelop_confirmpanel_dltlinea_Confirmtype ;
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
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
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
   private String divDdo_hisprofecauxdates_Internalname ;
   private String edtavDdo_hisprofecauxdate_Internalname ;
   private String edtavDdo_hisprofecauxdate_Jsonclick ;
   private String divDdo_hisprodtiauxdates_Internalname ;
   private String edtavDdo_hisprodtiauxdate_Internalname ;
   private String edtavDdo_hisprodtiauxdate_Jsonclick ;
   private String divDdo_hisprodtfauxdates_Internalname ;
   private String edtavDdo_hisprodtfauxdate_Internalname ;
   private String edtavDdo_hisprodtfauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Internalname ;
   private String edtHisProFec_Internalname ;
   private String edtHisProLin_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String edtGruOpeCod_Internalname ;
   private String edtBarOrdLin_Internalname ;
   private String A461Fase ;
   private String edtFase_Internalname ;
   private String edtHisProDTI_Internalname ;
   private String edtHisProDTF_Internalname ;
   private String A557HisProF ;
   private String edtHisProF_Internalname ;
   private String edtHisProTur_Internalname ;
   private String edtHisProKgr_Internalname ;
   private String edtHisProMtr_Internalname ;
   private String edtHisProNpzs_Internalname ;
   private String A867ParCodNom ;
   private String edtParCodNom_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV142Webpartesproduccionds_2_tfmaqcod ;
   private String lV144Webpartesproduccionds_4_tfmaqdsc ;
   private String lV149Webpartesproduccionds_9_tfbarnhdr ;
   private String lV155Webpartesproduccionds_15_tffase ;
   private String lV159Webpartesproduccionds_19_tfhisprof ;
   private String lV169Webpartesproduccionds_29_tfparcodnom ;
   private String AV143Webpartesproduccionds_3_tfmaqcod_sel ;
   private String AV142Webpartesproduccionds_2_tfmaqcod ;
   private String AV145Webpartesproduccionds_5_tfmaqdsc_sel ;
   private String AV144Webpartesproduccionds_4_tfmaqdsc ;
   private String AV150Webpartesproduccionds_10_tfbarnhdr_sel ;
   private String AV149Webpartesproduccionds_9_tfbarnhdr ;
   private String AV156Webpartesproduccionds_16_tffase_sel ;
   private String AV155Webpartesproduccionds_15_tffase ;
   private String AV160Webpartesproduccionds_20_tfhisprof_sel ;
   private String AV159Webpartesproduccionds_19_tfhisprof ;
   private String AV170Webpartesproduccionds_30_tfparcodnom_sel ;
   private String AV169Webpartesproduccionds_29_tfparcodnom ;
   private String AV113EmprNom ;
   private String AV134EmprCod_Selected ;
   private String AV135MaqCod_Selected ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char22 ;
   private String GXv_char14[] ;
   private String GXt_char21 ;
   private String GXv_char13[] ;
   private String GXt_char20 ;
   private String GXv_char4[] ;
   private String GXt_char19 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_dltlinea_Internalname ;
   private String Dvelop_confirmpanel_dltlinea_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqDsc_Jsonclick ;
   private String edtHisProFec_Jsonclick ;
   private String edtHisProLin_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtGruOpeCod_Jsonclick ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFase_Jsonclick ;
   private String edtHisProDTI_Jsonclick ;
   private String edtHisProDTF_Jsonclick ;
   private String edtHisProF_Jsonclick ;
   private String edtHisProTur_Jsonclick ;
   private String edtHisProKgr_Jsonclick ;
   private String edtHisProMtr_Jsonclick ;
   private String edtHisProNpzs_Jsonclick ;
   private String edtParCodNom_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV72TFHisProDTI ;
   private java.util.Date AV77TFHisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV157Webpartesproduccionds_17_tfhisprodti ;
   private java.util.Date AV158Webpartesproduccionds_18_tfhisprodtf ;
   private java.util.Date AV49TFHisProFec ;
   private java.util.Date AV51DDO_HisProFecAuxDate ;
   private java.util.Date AV74DDO_HisProDTIAuxDate ;
   private java.util.Date AV79DDO_HisProDTFAuxDate ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV146Webpartesproduccionds_6_tfhisprofec ;
   private java.util.Date GXv_date12[] ;
   private java.util.Date AV136HisProFec_Selected ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV14OrderedDsc ;
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
   private boolean n606MaqDsc ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean n867ParCodNom ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n656ParCod ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV37ColumnsSelectorXML ;
   private String AV43ManageFiltersXml ;
   private String AV38UserCustomValue ;
   private String AV130FilterFullText ;
   private String lV141Webpartesproduccionds_1_filterfulltext ;
   private String AV141Webpartesproduccionds_1_filterfulltext ;
   private String AV35ExcelFilename ;
   private String AV36ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_dltlinea ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGrupodeacciones ;
   private IDataStoreProvider pr_default ;
   private short[] H00HM2_A656ParCod ;
   private boolean[] H00HM2_n656ParCod ;
   private String[] H00HM2_A867ParCodNom ;
   private boolean[] H00HM2_n867ParCodNom ;
   private short[] H00HM2_A4714HisProNpzs ;
   private java.math.BigDecimal[] H00HM2_A1526HisProMtr ;
   private java.math.BigDecimal[] H00HM2_A1525HisProKgr ;
   private byte[] H00HM2_A566HisProTur ;
   private String[] H00HM2_A557HisProF ;
   private java.util.Date[] H00HM2_A4441HisProDTF ;
   private boolean[] H00HM2_n4441HisProDTF ;
   private java.util.Date[] H00HM2_A4440HisProDTI ;
   private boolean[] H00HM2_n4440HisProDTI ;
   private short[] H00HM2_A194BarOrdLin ;
   private int[] H00HM2_A503GruOpeCod ;
   private int[] H00HM2_A561HisProLin ;
   private java.util.Date[] H00HM2_A558HisProFec ;
   private String[] H00HM2_A606MaqDsc ;
   private boolean[] H00HM2_n606MaqDsc ;
   private String[] H00HM2_A602MaqCod ;
   private String[] H00HM2_A130BarCodPar ;
   private byte[] H00HM2_A132BarCodReo ;
   private int[] H00HM2_A129BarCod ;
   private String[] H00HM2_A461Fase ;
   private String[] H00HM2_A396EmprCod ;
   private long[] H00HM3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV42ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item17 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item18[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV39ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV40ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector16[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV103DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState25[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class webpartesproduccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00HM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV141Webpartesproduccionds_1_filterfulltext ,
                                          String AV143Webpartesproduccionds_3_tfmaqcod_sel ,
                                          String AV142Webpartesproduccionds_2_tfmaqcod ,
                                          String AV145Webpartesproduccionds_5_tfmaqdsc_sel ,
                                          String AV144Webpartesproduccionds_4_tfmaqdsc ,
                                          java.util.Date AV146Webpartesproduccionds_6_tfhisprofec ,
                                          int AV147Webpartesproduccionds_7_tfhisprolin ,
                                          int AV148Webpartesproduccionds_8_tfhisprolin_to ,
                                          String AV150Webpartesproduccionds_10_tfbarnhdr_sel ,
                                          String AV149Webpartesproduccionds_9_tfbarnhdr ,
                                          int AV151Webpartesproduccionds_11_tfgruopecod ,
                                          int AV152Webpartesproduccionds_12_tfgruopecod_to ,
                                          short AV153Webpartesproduccionds_13_tfbarordlin ,
                                          short AV154Webpartesproduccionds_14_tfbarordlin_to ,
                                          String AV156Webpartesproduccionds_16_tffase_sel ,
                                          String AV155Webpartesproduccionds_15_tffase ,
                                          java.util.Date AV157Webpartesproduccionds_17_tfhisprodti ,
                                          java.util.Date AV158Webpartesproduccionds_18_tfhisprodtf ,
                                          String AV160Webpartesproduccionds_20_tfhisprof_sel ,
                                          String AV159Webpartesproduccionds_19_tfhisprof ,
                                          byte AV161Webpartesproduccionds_21_tfhisprotur ,
                                          byte AV162Webpartesproduccionds_22_tfhisprotur_to ,
                                          java.math.BigDecimal AV163Webpartesproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV164Webpartesproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV165Webpartesproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV166Webpartesproduccionds_26_tfhispromtr_to ,
                                          short AV167Webpartesproduccionds_27_tfhispronpzs ,
                                          short AV168Webpartesproduccionds_28_tfhispronpzs_to ,
                                          String AV170Webpartesproduccionds_30_tfparcodnom_sel ,
                                          String AV169Webpartesproduccionds_29_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A867ParCodNom ,
                                          java.util.Date A558HisProFec ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[47];
      Object[] GXv_Object27 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.ParCod, T3.ParCodNom, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProF, T1.HisProDTF, T1.HisProDTI, T1.BarOrdLin, T1.GruOpeCod, T1.HisProLin," ;
      sSelectString += " T1.HisProFec, T2.MaqDsc, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase, T1.EmprCod" ;
      sFromString = " FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) LEFT JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod" ;
      sFromString += " = T1.ParCod)" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV141Webpartesproduccionds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProLin,'99999990'), 2) like '%' || ?) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.GruOpeCod,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Fase) like '%' || UPPER(?)) or ( UPPER(T1.HisProF) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProTur,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProNpzs,'9990'), 2) like '%' || ?) or ( UPPER(T3.ParCodNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int26[0] = (byte)(1) ;
         GXv_int26[1] = (byte)(1) ;
         GXv_int26[2] = (byte)(1) ;
         GXv_int26[3] = (byte)(1) ;
         GXv_int26[4] = (byte)(1) ;
         GXv_int26[5] = (byte)(1) ;
         GXv_int26[6] = (byte)(1) ;
         GXv_int26[7] = (byte)(1) ;
         GXv_int26[8] = (byte)(1) ;
         GXv_int26[9] = (byte)(1) ;
         GXv_int26[10] = (byte)(1) ;
         GXv_int26[11] = (byte)(1) ;
         GXv_int26[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Webpartesproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV142Webpartesproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Webpartesproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Webpartesproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV144Webpartesproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Webpartesproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV146Webpartesproduccionds_6_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( ! (0==AV147Webpartesproduccionds_7_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( ! (0==AV148Webpartesproduccionds_8_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Webpartesproduccionds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV149Webpartesproduccionds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Webpartesproduccionds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( ! (0==AV151Webpartesproduccionds_11_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( ! (0==AV152Webpartesproduccionds_12_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( ! (0==AV153Webpartesproduccionds_13_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( ! (0==AV154Webpartesproduccionds_14_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Webpartesproduccionds_16_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV155Webpartesproduccionds_15_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Webpartesproduccionds_16_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV157Webpartesproduccionds_17_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV158Webpartesproduccionds_18_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160Webpartesproduccionds_20_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV159Webpartesproduccionds_19_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Webpartesproduccionds_20_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( ! (0==AV161Webpartesproduccionds_21_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( ! (0==AV162Webpartesproduccionds_22_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV163Webpartesproduccionds_23_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Webpartesproduccionds_24_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165Webpartesproduccionds_25_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Webpartesproduccionds_26_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int26[37] = (byte)(1) ;
      }
      if ( ! (0==AV167Webpartesproduccionds_27_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int26[38] = (byte)(1) ;
      }
      if ( ! (0==AV168Webpartesproduccionds_28_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int26[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Webpartesproduccionds_30_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV169Webpartesproduccionds_29_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Webpartesproduccionds_30_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ParCodNom = ?)");
      }
      else
      {
         GXv_int26[41] = (byte)(1) ;
      }
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisProFec" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisProFec DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisProLin" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisProLin DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T2.MaqDsc" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.MaqDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.GruOpeCod" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.GruOpeCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarOrdLin" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarOrdLin DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Fase" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Fase DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisProDTI" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisProDTI DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisProDTF" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisProDTF DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisProF" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisProF DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisProTur" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisProTur DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisProKgr" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisProKgr DESC" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisProMtr" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisProMtr DESC" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisProNpzs" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisProNpzs DESC" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T3.ParCodNom" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.ParCodNom DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_H00HM3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV141Webpartesproduccionds_1_filterfulltext ,
                                          String AV143Webpartesproduccionds_3_tfmaqcod_sel ,
                                          String AV142Webpartesproduccionds_2_tfmaqcod ,
                                          String AV145Webpartesproduccionds_5_tfmaqdsc_sel ,
                                          String AV144Webpartesproduccionds_4_tfmaqdsc ,
                                          java.util.Date AV146Webpartesproduccionds_6_tfhisprofec ,
                                          int AV147Webpartesproduccionds_7_tfhisprolin ,
                                          int AV148Webpartesproduccionds_8_tfhisprolin_to ,
                                          String AV150Webpartesproduccionds_10_tfbarnhdr_sel ,
                                          String AV149Webpartesproduccionds_9_tfbarnhdr ,
                                          int AV151Webpartesproduccionds_11_tfgruopecod ,
                                          int AV152Webpartesproduccionds_12_tfgruopecod_to ,
                                          short AV153Webpartesproduccionds_13_tfbarordlin ,
                                          short AV154Webpartesproduccionds_14_tfbarordlin_to ,
                                          String AV156Webpartesproduccionds_16_tffase_sel ,
                                          String AV155Webpartesproduccionds_15_tffase ,
                                          java.util.Date AV157Webpartesproduccionds_17_tfhisprodti ,
                                          java.util.Date AV158Webpartesproduccionds_18_tfhisprodtf ,
                                          String AV160Webpartesproduccionds_20_tfhisprof_sel ,
                                          String AV159Webpartesproduccionds_19_tfhisprof ,
                                          byte AV161Webpartesproduccionds_21_tfhisprotur ,
                                          byte AV162Webpartesproduccionds_22_tfhisprotur_to ,
                                          java.math.BigDecimal AV163Webpartesproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV164Webpartesproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV165Webpartesproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV166Webpartesproduccionds_26_tfhispromtr_to ,
                                          short AV167Webpartesproduccionds_27_tfhispronpzs ,
                                          short AV168Webpartesproduccionds_28_tfhispronpzs_to ,
                                          String AV170Webpartesproduccionds_30_tfparcodnom_sel ,
                                          String AV169Webpartesproduccionds_29_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A867ParCodNom ,
                                          java.util.Date A558HisProFec ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[42];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) LEFT JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.ParCod = T1.ParCod)" ;
      if ( ! (GXutil.strcmp("", AV141Webpartesproduccionds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProLin,'99999990'), 2) like '%' || ?) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.GruOpeCod,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Fase) like '%' || UPPER(?)) or ( UPPER(T1.HisProF) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProTur,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProNpzs,'9990'), 2) like '%' || ?) or ( UPPER(T3.ParCodNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int28[0] = (byte)(1) ;
         GXv_int28[1] = (byte)(1) ;
         GXv_int28[2] = (byte)(1) ;
         GXv_int28[3] = (byte)(1) ;
         GXv_int28[4] = (byte)(1) ;
         GXv_int28[5] = (byte)(1) ;
         GXv_int28[6] = (byte)(1) ;
         GXv_int28[7] = (byte)(1) ;
         GXv_int28[8] = (byte)(1) ;
         GXv_int28[9] = (byte)(1) ;
         GXv_int28[10] = (byte)(1) ;
         GXv_int28[11] = (byte)(1) ;
         GXv_int28[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Webpartesproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV142Webpartesproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Webpartesproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int28[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Webpartesproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV144Webpartesproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Webpartesproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int28[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV146Webpartesproduccionds_6_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int28[17] = (byte)(1) ;
      }
      if ( ! (0==AV147Webpartesproduccionds_7_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int28[18] = (byte)(1) ;
      }
      if ( ! (0==AV148Webpartesproduccionds_8_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int28[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Webpartesproduccionds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV149Webpartesproduccionds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Webpartesproduccionds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int28[21] = (byte)(1) ;
      }
      if ( ! (0==AV151Webpartesproduccionds_11_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int28[22] = (byte)(1) ;
      }
      if ( ! (0==AV152Webpartesproduccionds_12_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int28[23] = (byte)(1) ;
      }
      if ( ! (0==AV153Webpartesproduccionds_13_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int28[24] = (byte)(1) ;
      }
      if ( ! (0==AV154Webpartesproduccionds_14_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int28[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Webpartesproduccionds_16_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV155Webpartesproduccionds_15_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Webpartesproduccionds_16_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int28[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV157Webpartesproduccionds_17_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int28[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV158Webpartesproduccionds_18_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int28[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160Webpartesproduccionds_20_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV159Webpartesproduccionds_19_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Webpartesproduccionds_20_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int28[31] = (byte)(1) ;
      }
      if ( ! (0==AV161Webpartesproduccionds_21_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int28[32] = (byte)(1) ;
      }
      if ( ! (0==AV162Webpartesproduccionds_22_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int28[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV163Webpartesproduccionds_23_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int28[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV164Webpartesproduccionds_24_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int28[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV165Webpartesproduccionds_25_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int28[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Webpartesproduccionds_26_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int28[37] = (byte)(1) ;
      }
      if ( ! (0==AV167Webpartesproduccionds_27_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int28[38] = (byte)(1) ;
      }
      if ( ! (0==AV168Webpartesproduccionds_28_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int28[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV170Webpartesproduccionds_30_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV169Webpartesproduccionds_29_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170Webpartesproduccionds_30_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ParCodNom = ?)");
      }
      else
      {
         GXv_int28[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
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
                  return conditional_H00HM2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).shortValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Boolean) dynConstraints[49]).booleanValue() );
            case 1 :
                  return conditional_H00HM3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).shortValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Boolean) dynConstraints[49]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00HM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00HM3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((int[]) buf[15])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 6);
               ((String[]) buf[20])[0] = rslt.getString(16, 1);
               ((byte[]) buf[21])[0] = rslt.getByte(17);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 8);
               ((String[]) buf[24])[0] = rslt.getString(20, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[75], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[76], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[70], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[71], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               return;
      }
   }

}

