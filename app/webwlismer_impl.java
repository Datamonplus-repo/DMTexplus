package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwlismer_impl extends GXWebComponent
{
   public webwlismer_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwlismer_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwlismer_impl.class ));
   }

   public webwlismer_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      chkBarAccesor = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetPar( "sCompPrefix") ;
               sSFPrefix = httpContext.GetPar( "sSFPrefix") ;
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
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
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_93 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_93"))) ;
      nGXsfl_93_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_93_idx"))) ;
      sGXsfl_93_idx = httpContext.GetPar( "sGXsfl_93_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
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
      AV77CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV78CliCod_To = (int)(GXutil.lval( httpContext.GetPar( "CliCod_To"))) ;
      AV79BarSer = httpContext.GetPar( "BarSer") ;
      AV80BarSer_To = httpContext.GetPar( "BarSer_To") ;
      AV81BarColNom = httpContext.GetPar( "BarColNom") ;
      AV82BarColNom_To = httpContext.GetPar( "BarColNom_To") ;
      AV83BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      AV84BarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "BarColNum_To"))) ;
      AV75BarFecSal = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal")) ;
      AV29ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV24ColumnsSelector);
      AV93FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV76BarFecSal_To = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal_To")) ;
      AV31TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV32TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV34TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV35TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV37TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV38TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV40TFBarTipArt = (short)(GXutil.lval( httpContext.GetPar( "TFBarTipArt"))) ;
      AV41TFBarTipArt_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarTipArt_To"))) ;
      AV46TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV47TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV49TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV50TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV52TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV53TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV55TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV56TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV58TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV59TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV88TFBarFecSal = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecSal")) ;
      AV61TFBarFecCli = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecCli")) ;
      AV66TFBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm"), ".") ;
      AV67TFBarKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm_To"), ".") ;
      AV94TFBarRdto4 = (short)(GXutil.lval( httpContext.GetPar( "TFBarRdto4"))) ;
      AV95TFBarRdto4_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarRdto4_To"))) ;
      AV98TFBarGots = httpContext.GetPar( "TFBarGots") ;
      AV99TFBarGots_Sel = httpContext.GetPar( "TFBarGots_Sel") ;
      AV100TFBarGrs = httpContext.GetPar( "TFBarGrs") ;
      AV101TFBarGrs_Sel = httpContext.GetPar( "TFBarGrs_Sel") ;
      AV102TFBarOcs = httpContext.GetPar( "TFBarOcs") ;
      AV103TFBarOcs_Sel = httpContext.GetPar( "TFBarOcs_Sel") ;
      AV104TFBarRcs = httpContext.GetPar( "TFBarRcs") ;
      AV105TFBarRcs_Sel = httpContext.GetPar( "TFBarRcs_Sel") ;
      AV106TFBarOeko = httpContext.GetPar( "TFBarOeko") ;
      AV107TFBarOeko_Sel = httpContext.GetPar( "TFBarOeko_Sel") ;
      AV108TFBarAccesorios_Sel = httpContext.GetPar( "TFBarAccesorios_Sel") ;
      AV109TFBarMarca = httpContext.GetPar( "TFBarMarca") ;
      AV110TFBarMarca_Sel = httpContext.GetPar( "TFBarMarca_Sel") ;
      AV111TFBar_MacCod = (int)(GXutil.lval( httpContext.GetPar( "TFBar_MacCod"))) ;
      AV112TFBar_MacCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFBar_MacCod_To"))) ;
      AV113TFBarFasCod2 = httpContext.GetPar( "TFBarFasCod2") ;
      AV114TFBarFasCod2_Sel = httpContext.GetPar( "TFBarFasCod2_Sel") ;
      AV115TFBarFasDsc2 = httpContext.GetPar( "TFBarFasDsc2") ;
      AV116TFBarFasDsc2_Sel = httpContext.GetPar( "TFBarFasDsc2_Sel") ;
      AV177Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV77CliCod, AV78CliCod_To, AV79BarSer, AV80BarSer_To, AV81BarColNom, AV82BarColNom_To, AV83BarColNum, AV84BarColNum_To, AV75BarFecSal, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV93FilterFullText, AV76BarFecSal_To, AV31TFCliCod, AV32TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV37TFBarNHdr, AV38TFBarNHdr_Sel, AV40TFBarTipArt, AV41TFBarTipArt_To, AV46TFBarSer, AV47TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV52TFBarColNom, AV53TFBarColNom_Sel, AV55TFBarNomCli, AV56TFBarNomCli_Sel, AV58TFBarColNum, AV59TFBarColNum_To, AV88TFBarFecSal, AV61TFBarFecCli, AV66TFBarKgm, AV67TFBarKgm_To, AV94TFBarRdto4, AV95TFBarRdto4_To, AV98TFBarGots, AV99TFBarGots_Sel, AV100TFBarGrs, AV101TFBarGrs_Sel, AV102TFBarOcs, AV103TFBarOcs_Sel, AV104TFBarRcs, AV105TFBarRcs_Sel, AV106TFBarOeko, AV107TFBarOeko_Sel, AV108TFBarAccesorios_Sel, AV109TFBarMarca, AV110TFBarMarca_Sel, AV111TFBar_MacCod, AV112TFBar_MacCod_To, AV113TFBarFasCod2, AV114TFBarFasCod2_Sel, AV115TFBarFasDsc2, AV116TFBarFasDsc2_Sel, AV177Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paMU2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
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
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( httpContext.getMessage( "Informe de Mermas", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DateRangePicker/DateRangePickerRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwlismer", new String[] {}, new String[] {}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
      }
      else
      {
         boolean toggleHtmlOutput = httpContext.isOutputEnabled( );
         if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableOutput();
            }
         }
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         if ( toggleHtmlOutput )
         {
            if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableOutput();
               }
            }
         }
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV177Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vCLICOD", GXutil.ltrim( localUtil.ntoc( AV77CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV78CliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vBARSER", GXutil.rtrim( AV79BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vBARSER_TO", GXutil.rtrim( AV80BarSer_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vBARCOLNOM", GXutil.rtrim( AV81BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vBARCOLNOM_TO", GXutil.rtrim( AV82BarColNom_To));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV83BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV84BarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vBARFECSAL", localUtil.format(AV75BarFecSal, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_93", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_93, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV27ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV71GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV72GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSAL", localUtil.dtoc( AV75BarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECSAL_TO", localUtil.dtoc( AV76BarFecSal_To, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV69DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV69DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV24ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV29ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV31TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV32TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV34TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV35TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV37TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV38TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPART", GXutil.ltrim( localUtil.ntoc( AV40TFBarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPART_TO", GXutil.ltrim( localUtil.ntoc( AV41TFBarTipArt_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV46TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV47TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV49TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV50TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV52TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV53TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI", GXutil.rtrim( AV55TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI_SEL", GXutil.rtrim( AV56TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV58TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV59TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECSAL", localUtil.dtoc( AV88TFBarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFECCLI", localUtil.dtoc( AV61TFBarFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM", GXutil.ltrim( localUtil.ntoc( AV66TFBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM_TO", GXutil.ltrim( localUtil.ntoc( AV67TFBarKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARRDTO4", GXutil.ltrim( localUtil.ntoc( AV94TFBarRdto4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARRDTO4_TO", GXutil.ltrim( localUtil.ntoc( AV95TFBarRdto4_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARGOTS", GXutil.rtrim( AV98TFBarGots));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARGOTS_SEL", GXutil.rtrim( AV99TFBarGots_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARGRS", GXutil.rtrim( AV100TFBarGrs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARGRS_SEL", GXutil.rtrim( AV101TFBarGrs_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBAROCS", GXutil.rtrim( AV102TFBarOcs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBAROCS_SEL", GXutil.rtrim( AV103TFBarOcs_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARRCS", GXutil.rtrim( AV104TFBarRcs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARRCS_SEL", GXutil.rtrim( AV105TFBarRcs_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBAROEKO", GXutil.rtrim( AV106TFBarOeko));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBAROEKO_SEL", GXutil.rtrim( AV107TFBarOeko_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARACCESORIOS_SEL", GXutil.rtrim( AV108TFBarAccesorios_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMARCA", GXutil.rtrim( AV109TFBarMarca));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMARCA_SEL", GXutil.rtrim( AV110TFBarMarca_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBAR_MACCOD", GXutil.ltrim( localUtil.ntoc( AV111TFBar_MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBAR_MACCOD_TO", GXutil.ltrim( localUtil.ntoc( AV112TFBar_MacCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCOD2", GXutil.rtrim( AV113TFBarFasCod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCOD2_SEL", GXutil.rtrim( AV114TFBarFasCod2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASDSC2", GXutil.rtrim( AV115TFBarFasDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASDSC2_SEL", GXutil.rtrim( AV116TFBarFasDsc2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV177Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV177Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseFormMU2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) ) )
      {
         componentjscripts();
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
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
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "WebWlismer" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe de Mermas", "") ;
   }

   public void wbMU0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.webwlismer");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DateRangePicker/DateRangePickerRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, sPrefix+"DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 93, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWlismer.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 93, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWlismer.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 93, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWlismer.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_MU2( true) ;
      }
      else
      {
         wb_table1_23_MU2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_MU2e( boolean wbgen )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
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
         startgridcontrol93( ) ;
      }
      if ( wbEnd == 93 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_93 = (int)(nGXsfl_93_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV71GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV72GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         ucBarfecsal_rangepicker.setProperty("Start Date", AV75BarFecSal);
         ucBarfecsal_rangepicker.setProperty("End Date", AV76BarFecSal_To);
         ucBarfecsal_rangepicker.render(context, "wwp.daterangepicker", Barfecsal_rangepicker_Internalname, sPrefix+"BARFECSAL_RANGEPICKERContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV69DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV69DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV24ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecsalauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'" + sPrefix + "',false,'" + sGXsfl_93_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecsalauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecsalauxdate_Internalname, localUtil.format(AV90DDO_BarFecSalAuxDate, "99/99/99"), localUtil.format( AV90DDO_BarFecSalAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,131);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecsalauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWlismer.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecsalauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWlismer.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfeccliauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'" + sPrefix + "',false,'" + sGXsfl_93_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfeccliauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfeccliauxdate_Internalname, localUtil.format(AV63DDO_BarFecCliAuxDate, "99/99/99"), localUtil.format( AV63DDO_BarFecCliAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,133);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfeccliauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWlismer.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfeccliauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWlismer.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 93 )
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
               httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startMU2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            if ( httpContext.exposeMetadata( ) )
            {
               Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
            }
            Form.getMeta().addItem("description", httpContext.getMessage( "Informe de Mermas", ""), (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strupMU0( ) ;
         }
      }
   }

   public void wsMU2( )
   {
      startMU2( ) ;
      evtMU2( ) ;
   }

   public void evtMU2( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11MU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12MU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13MU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "BARFECSAL_RANGEPICKER.DATERANGECHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14MU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e15MU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e16MU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e17MU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e18MU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGridactions.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMU0( ) ;
                           }
                           nGXsfl_93_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_932( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV96GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96GridActions), 4, 0));
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n217BarTipArt = false ;
                           AV92TipArtDsc = httpContext.cgiGet( edtavTipartdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipartdsc_Internalname, AV92TipArtDsc);
                           AV15BarEncCli = httpContext.cgiGet( edtavBarenccli_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarenccli_Internalname, AV15BarEncCli);
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A161BarFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecSal_Internalname), 0)) ;
                           A155BarFecCli = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecCli_Internalname), 0)) ;
                           A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
                           n166BarKgm = false ;
                           A13769BarRdto4 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarRdto4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13769BarRdto4 = false ;
                           A13855BarGots = httpContext.cgiGet( edtBarGots_Internalname) ;
                           A13856BarGrs = httpContext.cgiGet( edtBarGrs_Internalname) ;
                           A13857BarOcs = httpContext.cgiGet( edtBarOcs_Internalname) ;
                           A13858BarRcs = httpContext.cgiGet( edtBarRcs_Internalname) ;
                           A13859BarOeko = httpContext.cgiGet( edtBarOeko_Internalname) ;
                           A13860BarAccesor = ((GXutil.strcmp(httpContext.cgiGet( chkBarAccesor.getInternalname()), "S")==0) ? "S" : "N") ;
                           n13860BarAccesor = false ;
                           A13861BarMarca = httpContext.cgiGet( edtBarMarca_Internalname) ;
                           n13861BarMarca = false ;
                           A13862Bar_MacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBar_MacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13862Bar_MacCod = false ;
                           A13863BarFasCod2 = httpContext.cgiGet( edtBarFasCod2_Internalname) ;
                           n13863BarFasCod2 = false ;
                           A13864BarFasDsc2 = httpContext.cgiGet( edtBarFasDsc2_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e19MU2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e20MU2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e21MU2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       if ( ! wbErr )
                                       {
                                          Rfr0gs = false ;
                                          /* Set Refresh If Clicod Changed */
                                          if ( localUtil.ctol( httpContext.cgiGet( sPrefix+"GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV77CliCod )
                                          {
                                             Rfr0gs = true ;
                                          }
                                          /* Set Refresh If Clicod_to Changed */
                                          if ( localUtil.ctol( httpContext.cgiGet( sPrefix+"GXH_vCLICOD_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV78CliCod_To )
                                          {
                                             Rfr0gs = true ;
                                          }
                                          /* Set Refresh If Barser Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vBARSER"), AV79BarSer) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
                                          /* Set Refresh If Barser_to Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vBARSER_TO"), AV80BarSer_To) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
                                          /* Set Refresh If Barcolnom Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vBARCOLNOM"), AV81BarColNom) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
                                          /* Set Refresh If Barcolnom_to Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vBARCOLNOM_TO"), AV82BarColNom_To) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
                                          /* Set Refresh If Barcolnum Changed */
                                          if ( localUtil.ctol( httpContext.cgiGet( sPrefix+"GXH_vBARCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV83BarColNum )
                                          {
                                             Rfr0gs = true ;
                                          }
                                          /* Set Refresh If Barcolnum_to Changed */
                                          if ( localUtil.ctol( httpContext.cgiGet( sPrefix+"GXH_vBARCOLNUM_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV84BarColNum_To )
                                          {
                                             Rfr0gs = true ;
                                          }
                                          /* Set Refresh If Barfecsal Changed */
                                          if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( sPrefix+"GXH_vBARFECSAL"), 0), AV75BarFecSal) ) )
                                          {
                                             Rfr0gs = true ;
                                          }
                                          if ( ! Rfr0gs )
                                          {
                                          }
                                          dynload_actions( ) ;
                                       }
                                    }
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strupMU0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
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

   public void weMU2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormMU2( ) ;
         }
      }
   }

   public void paMU2( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
            }
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         init_web_controls( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavFilterfulltext_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_932( ) ;
      while ( nGXsfl_93_idx <= nRC_GXsfl_93 )
      {
         sendrow_932( ) ;
         nGXsfl_93_idx = ((subGrid_Islastpage==1)&&(nGXsfl_93_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_93_idx+1) ;
         sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_932( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV77CliCod ,
                                 int AV78CliCod_To ,
                                 String AV79BarSer ,
                                 String AV80BarSer_To ,
                                 String AV81BarColNom ,
                                 String AV82BarColNom_To ,
                                 int AV83BarColNum ,
                                 int AV84BarColNum_To ,
                                 java.util.Date AV75BarFecSal ,
                                 byte AV29ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ,
                                 String AV93FilterFullText ,
                                 java.util.Date AV76BarFecSal_To ,
                                 int AV31TFCliCod ,
                                 int AV32TFCliCod_To ,
                                 String AV34TFCliNom ,
                                 String AV35TFCliNom_Sel ,
                                 String AV37TFBarNHdr ,
                                 String AV38TFBarNHdr_Sel ,
                                 short AV40TFBarTipArt ,
                                 short AV41TFBarTipArt_To ,
                                 String AV46TFBarSer ,
                                 String AV47TFBarSer_Sel ,
                                 String AV49TFBarSerDsc ,
                                 String AV50TFBarSerDsc_Sel ,
                                 String AV52TFBarColNom ,
                                 String AV53TFBarColNom_Sel ,
                                 String AV55TFBarNomCli ,
                                 String AV56TFBarNomCli_Sel ,
                                 int AV58TFBarColNum ,
                                 int AV59TFBarColNum_To ,
                                 java.util.Date AV88TFBarFecSal ,
                                 java.util.Date AV61TFBarFecCli ,
                                 java.math.BigDecimal AV66TFBarKgm ,
                                 java.math.BigDecimal AV67TFBarKgm_To ,
                                 short AV94TFBarRdto4 ,
                                 short AV95TFBarRdto4_To ,
                                 String AV98TFBarGots ,
                                 String AV99TFBarGots_Sel ,
                                 String AV100TFBarGrs ,
                                 String AV101TFBarGrs_Sel ,
                                 String AV102TFBarOcs ,
                                 String AV103TFBarOcs_Sel ,
                                 String AV104TFBarRcs ,
                                 String AV105TFBarRcs_Sel ,
                                 String AV106TFBarOeko ,
                                 String AV107TFBarOeko_Sel ,
                                 String AV108TFBarAccesorios_Sel ,
                                 String AV109TFBarMarca ,
                                 String AV110TFBarMarca_Sel ,
                                 int AV111TFBar_MacCod ,
                                 int AV112TFBar_MacCod_To ,
                                 String AV113TFBarFasCod2 ,
                                 String AV114TFBarFasCod2_Sel ,
                                 String AV115TFBarFasDsc2 ,
                                 String AV116TFBarFasDsc2_Sel ,
                                 String AV177Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e20MU2 ();
      GRID_nCurrentRecord = 0 ;
      rfMU2( ) ;
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
      rfMU2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV177Pgmname = "WebWlismer" ;
      Gx_err = (short)(0) ;
      edtavTipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), !bGXsfl_93_Refreshing);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV123Webwlismerds_1_filterfulltext = AV93FilterFullText ;
      AV124Webwlismerds_2_barfecsal = AV75BarFecSal ;
      AV125Webwlismerds_3_barfecsal_to = AV76BarFecSal_To ;
      AV126Webwlismerds_4_clicod = AV77CliCod ;
      AV127Webwlismerds_5_clicod_to = AV78CliCod_To ;
      AV128Webwlismerds_6_barser = AV79BarSer ;
      AV129Webwlismerds_7_barser_to = AV80BarSer_To ;
      AV130Webwlismerds_8_barcolnom = AV81BarColNom ;
      AV131Webwlismerds_9_barcolnom_to = AV82BarColNom_To ;
      AV132Webwlismerds_10_barcolnum = AV83BarColNum ;
      AV133Webwlismerds_11_barcolnum_to = AV84BarColNum_To ;
      AV134Webwlismerds_12_tfclicod = AV31TFCliCod ;
      AV135Webwlismerds_13_tfclicod_to = AV32TFCliCod_To ;
      AV136Webwlismerds_14_tfclinom = AV34TFCliNom ;
      AV137Webwlismerds_15_tfclinom_sel = AV35TFCliNom_Sel ;
      AV138Webwlismerds_16_tfbarnhdr = AV37TFBarNHdr ;
      AV139Webwlismerds_17_tfbarnhdr_sel = AV38TFBarNHdr_Sel ;
      AV140Webwlismerds_18_tfbartipart = AV40TFBarTipArt ;
      AV141Webwlismerds_19_tfbartipart_to = AV41TFBarTipArt_To ;
      AV142Webwlismerds_20_tfbarser = AV46TFBarSer ;
      AV143Webwlismerds_21_tfbarser_sel = AV47TFBarSer_Sel ;
      AV144Webwlismerds_22_tfbarserdsc = AV49TFBarSerDsc ;
      AV145Webwlismerds_23_tfbarserdsc_sel = AV50TFBarSerDsc_Sel ;
      AV146Webwlismerds_24_tfbarcolnom = AV52TFBarColNom ;
      AV147Webwlismerds_25_tfbarcolnom_sel = AV53TFBarColNom_Sel ;
      AV148Webwlismerds_26_tfbarnomcli = AV55TFBarNomCli ;
      AV149Webwlismerds_27_tfbarnomcli_sel = AV56TFBarNomCli_Sel ;
      AV150Webwlismerds_28_tfbarcolnum = AV58TFBarColNum ;
      AV151Webwlismerds_29_tfbarcolnum_to = AV59TFBarColNum_To ;
      AV152Webwlismerds_30_tfbarfecsal = AV88TFBarFecSal ;
      AV153Webwlismerds_31_tfbarfeccli = AV61TFBarFecCli ;
      AV154Webwlismerds_32_tfbarkgm = AV66TFBarKgm ;
      AV155Webwlismerds_33_tfbarkgm_to = AV67TFBarKgm_To ;
      AV156Webwlismerds_34_tfbarrdto4 = AV94TFBarRdto4 ;
      AV157Webwlismerds_35_tfbarrdto4_to = AV95TFBarRdto4_To ;
      AV158Webwlismerds_36_tfbargots = AV98TFBarGots ;
      AV159Webwlismerds_37_tfbargots_sel = AV99TFBarGots_Sel ;
      AV160Webwlismerds_38_tfbargrs = AV100TFBarGrs ;
      AV161Webwlismerds_39_tfbargrs_sel = AV101TFBarGrs_Sel ;
      AV162Webwlismerds_40_tfbarocs = AV102TFBarOcs ;
      AV163Webwlismerds_41_tfbarocs_sel = AV103TFBarOcs_Sel ;
      AV164Webwlismerds_42_tfbarrcs = AV104TFBarRcs ;
      AV165Webwlismerds_43_tfbarrcs_sel = AV105TFBarRcs_Sel ;
      AV166Webwlismerds_44_tfbaroeko = AV106TFBarOeko ;
      AV167Webwlismerds_45_tfbaroeko_sel = AV107TFBarOeko_Sel ;
      AV168Webwlismerds_46_tfbaraccesorios_sel = AV108TFBarAccesorios_Sel ;
      AV169Webwlismerds_47_tfbarmarca = AV109TFBarMarca ;
      AV170Webwlismerds_48_tfbarmarca_sel = AV110TFBarMarca_Sel ;
      AV171Webwlismerds_49_tfbar_maccod = AV111TFBar_MacCod ;
      AV172Webwlismerds_50_tfbar_maccod_to = AV112TFBar_MacCod_To ;
      AV173Webwlismerds_51_tfbarfascod2 = AV113TFBarFasCod2 ;
      AV174Webwlismerds_52_tfbarfascod2_sel = AV114TFBarFasCod2_Sel ;
      AV175Webwlismerds_53_tfbarfasdsc2 = AV115TFBarFasDsc2 ;
      AV176Webwlismerds_54_tfbarfasdsc2_sel = AV116TFBarFasDsc2_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV124Webwlismerds_2_barfecsal ,
                                           AV125Webwlismerds_3_barfecsal_to ,
                                           Integer.valueOf(AV126Webwlismerds_4_clicod) ,
                                           Integer.valueOf(AV127Webwlismerds_5_clicod_to) ,
                                           AV128Webwlismerds_6_barser ,
                                           AV129Webwlismerds_7_barser_to ,
                                           AV130Webwlismerds_8_barcolnom ,
                                           AV131Webwlismerds_9_barcolnom_to ,
                                           Integer.valueOf(AV132Webwlismerds_10_barcolnum) ,
                                           Integer.valueOf(AV133Webwlismerds_11_barcolnum_to) ,
                                           Integer.valueOf(AV134Webwlismerds_12_tfclicod) ,
                                           Integer.valueOf(AV135Webwlismerds_13_tfclicod_to) ,
                                           AV137Webwlismerds_15_tfclinom_sel ,
                                           AV136Webwlismerds_14_tfclinom ,
                                           AV139Webwlismerds_17_tfbarnhdr_sel ,
                                           AV138Webwlismerds_16_tfbarnhdr ,
                                           Short.valueOf(AV140Webwlismerds_18_tfbartipart) ,
                                           Short.valueOf(AV141Webwlismerds_19_tfbartipart_to) ,
                                           AV143Webwlismerds_21_tfbarser_sel ,
                                           AV142Webwlismerds_20_tfbarser ,
                                           AV145Webwlismerds_23_tfbarserdsc_sel ,
                                           AV144Webwlismerds_22_tfbarserdsc ,
                                           AV147Webwlismerds_25_tfbarcolnom_sel ,
                                           AV146Webwlismerds_24_tfbarcolnom ,
                                           AV149Webwlismerds_27_tfbarnomcli_sel ,
                                           AV148Webwlismerds_26_tfbarnomcli ,
                                           Integer.valueOf(AV150Webwlismerds_28_tfbarcolnum) ,
                                           Integer.valueOf(AV151Webwlismerds_29_tfbarcolnum_to) ,
                                           AV152Webwlismerds_30_tfbarfecsal ,
                                           AV153Webwlismerds_31_tfbarfeccli ,
                                           AV154Webwlismerds_32_tfbarkgm ,
                                           AV155Webwlismerds_33_tfbarkgm_to ,
                                           Short.valueOf(AV156Webwlismerds_34_tfbarrdto4) ,
                                           Short.valueOf(AV157Webwlismerds_35_tfbarrdto4_to) ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV123Webwlismerds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13855BarGots ,
                                           A13856BarGrs ,
                                           A13857BarOcs ,
                                           A13858BarRcs ,
                                           A13859BarOeko ,
                                           A13861BarMarca ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           A13863BarFasCod2 ,
                                           A13864BarFasDsc2 ,
                                           AV159Webwlismerds_37_tfbargots_sel ,
                                           AV158Webwlismerds_36_tfbargots ,
                                           AV161Webwlismerds_39_tfbargrs_sel ,
                                           AV160Webwlismerds_38_tfbargrs ,
                                           AV163Webwlismerds_41_tfbarocs_sel ,
                                           AV162Webwlismerds_40_tfbarocs ,
                                           AV165Webwlismerds_43_tfbarrcs_sel ,
                                           AV164Webwlismerds_42_tfbarrcs ,
                                           AV167Webwlismerds_45_tfbaroeko_sel ,
                                           AV166Webwlismerds_44_tfbaroeko ,
                                           AV168Webwlismerds_46_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV170Webwlismerds_48_tfbarmarca_sel ,
                                           AV169Webwlismerds_47_tfbarmarca ,
                                           Integer.valueOf(AV171Webwlismerds_49_tfbar_maccod) ,
                                           Integer.valueOf(AV172Webwlismerds_50_tfbar_maccod_to) ,
                                           AV174Webwlismerds_52_tfbarfascod2_sel ,
                                           AV173Webwlismerds_51_tfbarfascod2 ,
                                           AV176Webwlismerds_54_tfbarfasdsc2_sel ,
                                           AV175Webwlismerds_53_tfbarfasdsc2 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV169Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV169Webwlismerds_47_tfbarmarca), 30, "%") ;
      lV173Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV173Webwlismerds_51_tfbarfascod2), 8, "%") ;
      lV136Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV136Webwlismerds_14_tfclinom), 30, "%") ;
      lV138Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV138Webwlismerds_16_tfbarnhdr), 11, "%") ;
      lV142Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV142Webwlismerds_20_tfbarser), 16, "%") ;
      lV144Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV144Webwlismerds_22_tfbarserdsc), 26, "%") ;
      lV146Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV146Webwlismerds_24_tfbarcolnom), 13, "%") ;
      lV148Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV148Webwlismerds_26_tfbarnomcli), 13, "%") ;
      /* Using cursor H00MU8 */
      pr_default.execute(0, new Object[] {A396EmprCod, A396EmprCod, AV168Webwlismerds_46_tfbaraccesorios_sel, AV168Webwlismerds_46_tfbaraccesorios_sel, AV170Webwlismerds_48_tfbarmarca_sel, AV169Webwlismerds_47_tfbarmarca, lV169Webwlismerds_47_tfbarmarca, AV170Webwlismerds_48_tfbarmarca_sel, AV170Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV171Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV171Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV172Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV172Webwlismerds_50_tfbar_maccod_to), AV174Webwlismerds_52_tfbarfascod2_sel, AV173Webwlismerds_51_tfbarfascod2, lV173Webwlismerds_51_tfbarfascod2, AV174Webwlismerds_52_tfbarfascod2_sel, AV174Webwlismerds_52_tfbarfascod2_sel, AV124Webwlismerds_2_barfecsal, AV125Webwlismerds_3_barfecsal_to, Integer.valueOf(AV126Webwlismerds_4_clicod), Integer.valueOf(AV127Webwlismerds_5_clicod_to), AV128Webwlismerds_6_barser, AV129Webwlismerds_7_barser_to, AV130Webwlismerds_8_barcolnom, AV131Webwlismerds_9_barcolnom_to, Integer.valueOf(AV132Webwlismerds_10_barcolnum), Integer.valueOf(AV133Webwlismerds_11_barcolnum_to), Integer.valueOf(AV134Webwlismerds_12_tfclicod), Integer.valueOf(AV135Webwlismerds_13_tfclicod_to), lV136Webwlismerds_14_tfclinom, AV137Webwlismerds_15_tfclinom_sel, lV138Webwlismerds_16_tfbarnhdr, AV139Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV140Webwlismerds_18_tfbartipart), Short.valueOf(AV141Webwlismerds_19_tfbartipart_to), lV142Webwlismerds_20_tfbarser, AV143Webwlismerds_21_tfbarser_sel, lV144Webwlismerds_22_tfbarserdsc, AV145Webwlismerds_23_tfbarserdsc_sel, lV146Webwlismerds_24_tfbarcolnom, AV147Webwlismerds_25_tfbarcolnom_sel, lV148Webwlismerds_26_tfbarnomcli, AV149Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV150Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV151Webwlismerds_29_tfbarcolnum_to), AV152Webwlismerds_30_tfbarfecsal, AV153Webwlismerds_31_tfbarfeccli, AV154Webwlismerds_32_tfbarkgm, AV155Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV156Webwlismerds_34_tfbarrdto4), Short.valueOf(AV157Webwlismerds_35_tfbarrdto4_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4466BarAcaAnh = H00MU8_A4466BarAcaAnh[0] ;
         A143BarDisNum = H00MU8_A143BarDisNum[0] ;
         A4812BarEncCli = H00MU8_A4812BarEncCli[0] ;
         A13769BarRdto4 = H00MU8_A13769BarRdto4[0] ;
         n13769BarRdto4 = H00MU8_n13769BarRdto4[0] ;
         A155BarFecCli = H00MU8_A155BarFecCli[0] ;
         A161BarFecSal = H00MU8_A161BarFecSal[0] ;
         A136BarColNum = H00MU8_A136BarColNum[0] ;
         A1234BarNomCli = H00MU8_A1234BarNomCli[0] ;
         A135BarColNom = H00MU8_A135BarColNom[0] ;
         A1652BarSerDsc = H00MU8_A1652BarSerDsc[0] ;
         A212BarSer = H00MU8_A212BarSer[0] ;
         A217BarTipArt = H00MU8_A217BarTipArt[0] ;
         n217BarTipArt = H00MU8_n217BarTipArt[0] ;
         A13696BarNHdr = H00MU8_A13696BarNHdr[0] ;
         A279CliNom = H00MU8_A279CliNom[0] ;
         A252CliCod = H00MU8_A252CliCod[0] ;
         n252CliCod = H00MU8_n252CliCod[0] ;
         A13862Bar_MacCod = H00MU8_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = H00MU8_n13862Bar_MacCod[0] ;
         A13861BarMarca = H00MU8_A13861BarMarca[0] ;
         n13861BarMarca = H00MU8_n13861BarMarca[0] ;
         A13860BarAccesor = H00MU8_A13860BarAccesor[0] ;
         n13860BarAccesor = H00MU8_n13860BarAccesor[0] ;
         A166BarKgm = H00MU8_A166BarKgm[0] ;
         n166BarKgm = H00MU8_n166BarKgm[0] ;
         A129BarCod = H00MU8_A129BarCod[0] ;
         A132BarCodReo = H00MU8_A132BarCodReo[0] ;
         A130BarCodPar = H00MU8_A130BarCodPar[0] ;
         A361DisCod = H00MU8_A361DisCod[0] ;
         A13863BarFasCod2 = H00MU8_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = H00MU8_n13863BarFasCod2[0] ;
         A396EmprCod = H00MU8_A396EmprCod[0] ;
         A13862Bar_MacCod = H00MU8_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = H00MU8_n13862Bar_MacCod[0] ;
         A279CliNom = H00MU8_A279CliNom[0] ;
         A13863BarFasCod2 = H00MU8_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = H00MU8_n13863BarFasCod2[0] ;
         A13861BarMarca = H00MU8_A13861BarMarca[0] ;
         n13861BarMarca = H00MU8_n13861BarMarca[0] ;
         A13860BarAccesor = H00MU8_A13860BarAccesor[0] ;
         n13860BarAccesor = H00MU8_n13860BarAccesor[0] ;
         A166BarKgm = H00MU8_A166BarKgm[0] ;
         n166BarKgm = H00MU8_n166BarKgm[0] ;
         GXt_char1 = A13855BarGots ;
         GXv_char2[0] = GXt_char1 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
         webwlismer_impl.this.GXt_char1 = GXv_char2[0] ;
         A13855BarGots = GXt_char1 ;
         if ( ! ( (GXutil.strcmp("", AV159Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV158Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV158Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV159Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV159Webwlismerds_37_tfbargots_sel) == 0 ) ) )
            {
               GXt_char1 = A13856BarGrs ;
               GXv_char2[0] = GXt_char1 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
               webwlismer_impl.this.GXt_char1 = GXv_char2[0] ;
               A13856BarGrs = GXt_char1 ;
               if ( ! ( (GXutil.strcmp("", AV161Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV160Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV160Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV161Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV161Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char1 = A13857BarOcs ;
                     GXv_char2[0] = GXt_char1 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
                     webwlismer_impl.this.GXt_char1 = GXv_char2[0] ;
                     A13857BarOcs = GXt_char1 ;
                     if ( ! ( (GXutil.strcmp("", AV163Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV162Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV162Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV163Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV163Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char1 = A13858BarRcs ;
                           GXv_char2[0] = GXt_char1 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
                           webwlismer_impl.this.GXt_char1 = GXv_char2[0] ;
                           A13858BarRcs = GXt_char1 ;
                           if ( ! ( (GXutil.strcmp("", AV165Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV164Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV164Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV165Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV165Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char1 = A13859BarOeko ;
                                 GXv_char2[0] = GXt_char1 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
                                 webwlismer_impl.this.GXt_char1 = GXv_char2[0] ;
                                 A13859BarOeko = GXt_char1 ;
                                 if ( ! ( (GXutil.strcmp("", AV167Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV166Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV166Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV167Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV167Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char1 = A13864BarFasDsc2 ;
                                       GXv_char2[0] = GXt_char1 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char2) ;
                                       webwlismer_impl.this.GXt_char1 = GXv_char2[0] ;
                                       A13864BarFasDsc2 = GXt_char1 ;
                                       if ( (GXutil.strcmp("", AV123Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV123Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV123Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV123Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV123Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV123Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV123Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                       {
                                          if ( ! ( (GXutil.strcmp("", AV176Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV175Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV175Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV176Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV176Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
                                             {
                                                GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rfMU2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(93) ;
      /* Execute user event: Refresh */
      e20MU2 ();
      nGXsfl_93_idx = 1 ;
      sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_932( ) ;
      bGXsfl_93_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
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
         subsflControlProps_932( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV124Webwlismerds_2_barfecsal ,
                                              AV125Webwlismerds_3_barfecsal_to ,
                                              Integer.valueOf(AV126Webwlismerds_4_clicod) ,
                                              Integer.valueOf(AV127Webwlismerds_5_clicod_to) ,
                                              AV128Webwlismerds_6_barser ,
                                              AV129Webwlismerds_7_barser_to ,
                                              AV130Webwlismerds_8_barcolnom ,
                                              AV131Webwlismerds_9_barcolnom_to ,
                                              Integer.valueOf(AV132Webwlismerds_10_barcolnum) ,
                                              Integer.valueOf(AV133Webwlismerds_11_barcolnum_to) ,
                                              Integer.valueOf(AV134Webwlismerds_12_tfclicod) ,
                                              Integer.valueOf(AV135Webwlismerds_13_tfclicod_to) ,
                                              AV137Webwlismerds_15_tfclinom_sel ,
                                              AV136Webwlismerds_14_tfclinom ,
                                              AV139Webwlismerds_17_tfbarnhdr_sel ,
                                              AV138Webwlismerds_16_tfbarnhdr ,
                                              Short.valueOf(AV140Webwlismerds_18_tfbartipart) ,
                                              Short.valueOf(AV141Webwlismerds_19_tfbartipart_to) ,
                                              AV143Webwlismerds_21_tfbarser_sel ,
                                              AV142Webwlismerds_20_tfbarser ,
                                              AV145Webwlismerds_23_tfbarserdsc_sel ,
                                              AV144Webwlismerds_22_tfbarserdsc ,
                                              AV147Webwlismerds_25_tfbarcolnom_sel ,
                                              AV146Webwlismerds_24_tfbarcolnom ,
                                              AV149Webwlismerds_27_tfbarnomcli_sel ,
                                              AV148Webwlismerds_26_tfbarnomcli ,
                                              Integer.valueOf(AV150Webwlismerds_28_tfbarcolnum) ,
                                              Integer.valueOf(AV151Webwlismerds_29_tfbarcolnum_to) ,
                                              AV152Webwlismerds_30_tfbarfecsal ,
                                              AV153Webwlismerds_31_tfbarfeccli ,
                                              AV154Webwlismerds_32_tfbarkgm ,
                                              AV155Webwlismerds_33_tfbarkgm_to ,
                                              Short.valueOf(AV156Webwlismerds_34_tfbarrdto4) ,
                                              Short.valueOf(AV157Webwlismerds_35_tfbarrdto4_to) ,
                                              A161BarFecSal ,
                                              Integer.valueOf(A252CliCod) ,
                                              A212BarSer ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A279CliNom ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Short.valueOf(A217BarTipArt) ,
                                              A1652BarSerDsc ,
                                              A1234BarNomCli ,
                                              A155BarFecCli ,
                                              A166BarKgm ,
                                              Short.valueOf(A13769BarRdto4) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV123Webwlismerds_1_filterfulltext ,
                                              A13696BarNHdr ,
                                              A13855BarGots ,
                                              A13856BarGrs ,
                                              A13857BarOcs ,
                                              A13858BarRcs ,
                                              A13859BarOeko ,
                                              A13861BarMarca ,
                                              Integer.valueOf(A13862Bar_MacCod) ,
                                              A13863BarFasCod2 ,
                                              A13864BarFasDsc2 ,
                                              AV159Webwlismerds_37_tfbargots_sel ,
                                              AV158Webwlismerds_36_tfbargots ,
                                              AV161Webwlismerds_39_tfbargrs_sel ,
                                              AV160Webwlismerds_38_tfbargrs ,
                                              AV163Webwlismerds_41_tfbarocs_sel ,
                                              AV162Webwlismerds_40_tfbarocs ,
                                              AV165Webwlismerds_43_tfbarrcs_sel ,
                                              AV164Webwlismerds_42_tfbarrcs ,
                                              AV167Webwlismerds_45_tfbaroeko_sel ,
                                              AV166Webwlismerds_44_tfbaroeko ,
                                              AV168Webwlismerds_46_tfbaraccesorios_sel ,
                                              A13860BarAccesor ,
                                              AV170Webwlismerds_48_tfbarmarca_sel ,
                                              AV169Webwlismerds_47_tfbarmarca ,
                                              Integer.valueOf(AV171Webwlismerds_49_tfbar_maccod) ,
                                              Integer.valueOf(AV172Webwlismerds_50_tfbar_maccod_to) ,
                                              AV174Webwlismerds_52_tfbarfascod2_sel ,
                                              AV173Webwlismerds_51_tfbarfascod2 ,
                                              AV176Webwlismerds_54_tfbarfasdsc2_sel ,
                                              AV175Webwlismerds_53_tfbarfasdsc2 } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV169Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV169Webwlismerds_47_tfbarmarca), 30, "%") ;
         lV173Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV173Webwlismerds_51_tfbarfascod2), 8, "%") ;
         lV136Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV136Webwlismerds_14_tfclinom), 30, "%") ;
         lV138Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV138Webwlismerds_16_tfbarnhdr), 11, "%") ;
         lV142Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV142Webwlismerds_20_tfbarser), 16, "%") ;
         lV144Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV144Webwlismerds_22_tfbarserdsc), 26, "%") ;
         lV146Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV146Webwlismerds_24_tfbarcolnom), 13, "%") ;
         lV148Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV148Webwlismerds_26_tfbarnomcli), 13, "%") ;
         /* Using cursor H00MU15 */
         pr_default.execute(1, new Object[] {A396EmprCod, A396EmprCod, AV168Webwlismerds_46_tfbaraccesorios_sel, AV168Webwlismerds_46_tfbaraccesorios_sel, AV170Webwlismerds_48_tfbarmarca_sel, AV169Webwlismerds_47_tfbarmarca, lV169Webwlismerds_47_tfbarmarca, AV170Webwlismerds_48_tfbarmarca_sel, AV170Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV171Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV171Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV172Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV172Webwlismerds_50_tfbar_maccod_to), AV174Webwlismerds_52_tfbarfascod2_sel, AV173Webwlismerds_51_tfbarfascod2, lV173Webwlismerds_51_tfbarfascod2, AV174Webwlismerds_52_tfbarfascod2_sel, AV174Webwlismerds_52_tfbarfascod2_sel, AV124Webwlismerds_2_barfecsal, AV125Webwlismerds_3_barfecsal_to, Integer.valueOf(AV126Webwlismerds_4_clicod), Integer.valueOf(AV127Webwlismerds_5_clicod_to), AV128Webwlismerds_6_barser, AV129Webwlismerds_7_barser_to, AV130Webwlismerds_8_barcolnom, AV131Webwlismerds_9_barcolnom_to, Integer.valueOf(AV132Webwlismerds_10_barcolnum), Integer.valueOf(AV133Webwlismerds_11_barcolnum_to), Integer.valueOf(AV134Webwlismerds_12_tfclicod), Integer.valueOf(AV135Webwlismerds_13_tfclicod_to), lV136Webwlismerds_14_tfclinom, AV137Webwlismerds_15_tfclinom_sel, lV138Webwlismerds_16_tfbarnhdr, AV139Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV140Webwlismerds_18_tfbartipart), Short.valueOf(AV141Webwlismerds_19_tfbartipart_to), lV142Webwlismerds_20_tfbarser, AV143Webwlismerds_21_tfbarser_sel, lV144Webwlismerds_22_tfbarserdsc, AV145Webwlismerds_23_tfbarserdsc_sel, lV146Webwlismerds_24_tfbarcolnom, AV147Webwlismerds_25_tfbarcolnom_sel, lV148Webwlismerds_26_tfbarnomcli, AV149Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV150Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV151Webwlismerds_29_tfbarcolnum_to), AV152Webwlismerds_30_tfbarfecsal, AV153Webwlismerds_31_tfbarfeccli, AV154Webwlismerds_32_tfbarkgm, AV155Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV156Webwlismerds_34_tfbarrdto4), Short.valueOf(AV157Webwlismerds_35_tfbarrdto4_to)});
         nGXsfl_93_idx = 1 ;
         sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_932( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4466BarAcaAnh = H00MU15_A4466BarAcaAnh[0] ;
            A143BarDisNum = H00MU15_A143BarDisNum[0] ;
            A4812BarEncCli = H00MU15_A4812BarEncCli[0] ;
            A13769BarRdto4 = H00MU15_A13769BarRdto4[0] ;
            n13769BarRdto4 = H00MU15_n13769BarRdto4[0] ;
            A155BarFecCli = H00MU15_A155BarFecCli[0] ;
            A161BarFecSal = H00MU15_A161BarFecSal[0] ;
            A136BarColNum = H00MU15_A136BarColNum[0] ;
            A1234BarNomCli = H00MU15_A1234BarNomCli[0] ;
            A135BarColNom = H00MU15_A135BarColNom[0] ;
            A1652BarSerDsc = H00MU15_A1652BarSerDsc[0] ;
            A212BarSer = H00MU15_A212BarSer[0] ;
            A217BarTipArt = H00MU15_A217BarTipArt[0] ;
            n217BarTipArt = H00MU15_n217BarTipArt[0] ;
            A13696BarNHdr = H00MU15_A13696BarNHdr[0] ;
            A279CliNom = H00MU15_A279CliNom[0] ;
            A252CliCod = H00MU15_A252CliCod[0] ;
            n252CliCod = H00MU15_n252CliCod[0] ;
            A13862Bar_MacCod = H00MU15_A13862Bar_MacCod[0] ;
            n13862Bar_MacCod = H00MU15_n13862Bar_MacCod[0] ;
            A13861BarMarca = H00MU15_A13861BarMarca[0] ;
            n13861BarMarca = H00MU15_n13861BarMarca[0] ;
            A13860BarAccesor = H00MU15_A13860BarAccesor[0] ;
            n13860BarAccesor = H00MU15_n13860BarAccesor[0] ;
            A166BarKgm = H00MU15_A166BarKgm[0] ;
            n166BarKgm = H00MU15_n166BarKgm[0] ;
            A129BarCod = H00MU15_A129BarCod[0] ;
            A132BarCodReo = H00MU15_A132BarCodReo[0] ;
            A130BarCodPar = H00MU15_A130BarCodPar[0] ;
            A361DisCod = H00MU15_A361DisCod[0] ;
            A13863BarFasCod2 = H00MU15_A13863BarFasCod2[0] ;
            n13863BarFasCod2 = H00MU15_n13863BarFasCod2[0] ;
            A396EmprCod = H00MU15_A396EmprCod[0] ;
            A13862Bar_MacCod = H00MU15_A13862Bar_MacCod[0] ;
            n13862Bar_MacCod = H00MU15_n13862Bar_MacCod[0] ;
            A279CliNom = H00MU15_A279CliNom[0] ;
            A13863BarFasCod2 = H00MU15_A13863BarFasCod2[0] ;
            n13863BarFasCod2 = H00MU15_n13863BarFasCod2[0] ;
            A13861BarMarca = H00MU15_A13861BarMarca[0] ;
            n13861BarMarca = H00MU15_n13861BarMarca[0] ;
            A13860BarAccesor = H00MU15_A13860BarAccesor[0] ;
            n13860BarAccesor = H00MU15_n13860BarAccesor[0] ;
            A166BarKgm = H00MU15_A166BarKgm[0] ;
            n166BarKgm = H00MU15_n166BarKgm[0] ;
            GXt_char1 = A13855BarGots ;
            GXv_char2[0] = GXt_char1 ;
            new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
            webwlismer_impl.this.GXt_char1 = GXv_char2[0] ;
            A13855BarGots = GXt_char1 ;
            if ( ! ( (GXutil.strcmp("", AV159Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV158Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV158Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV159Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV159Webwlismerds_37_tfbargots_sel) == 0 ) ) )
               {
                  GXt_char1 = A13856BarGrs ;
                  GXv_char2[0] = GXt_char1 ;
                  new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
                  webwlismer_impl.this.GXt_char1 = GXv_char2[0] ;
                  A13856BarGrs = GXt_char1 ;
                  if ( ! ( (GXutil.strcmp("", AV161Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV160Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV160Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV161Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV161Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                     {
                        GXt_char1 = A13857BarOcs ;
                        GXv_char2[0] = GXt_char1 ;
                        new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
                        webwlismer_impl.this.GXt_char1 = GXv_char2[0] ;
                        A13857BarOcs = GXt_char1 ;
                        if ( ! ( (GXutil.strcmp("", AV163Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV162Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV162Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV163Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV163Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                           {
                              GXt_char1 = A13858BarRcs ;
                              GXv_char2[0] = GXt_char1 ;
                              new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
                              webwlismer_impl.this.GXt_char1 = GXv_char2[0] ;
                              A13858BarRcs = GXt_char1 ;
                              if ( ! ( (GXutil.strcmp("", AV165Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV164Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV164Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                              {
                                 if ( (GXutil.strcmp("", AV165Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV165Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                                 {
                                    GXt_char1 = A13859BarOeko ;
                                    GXv_char2[0] = GXt_char1 ;
                                    new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
                                    webwlismer_impl.this.GXt_char1 = GXv_char2[0] ;
                                    A13859BarOeko = GXt_char1 ;
                                    if ( ! ( (GXutil.strcmp("", AV167Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV166Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV166Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                    {
                                       if ( (GXutil.strcmp("", AV167Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV167Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                       {
                                          GXt_char1 = A13864BarFasDsc2 ;
                                          GXv_char2[0] = GXt_char1 ;
                                          new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char2) ;
                                          webwlismer_impl.this.GXt_char1 = GXv_char2[0] ;
                                          A13864BarFasDsc2 = GXt_char1 ;
                                          if ( (GXutil.strcmp("", AV123Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV123Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV123Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV123Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV123Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV123Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV123Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV123Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                          {
                                             if ( ! ( (GXutil.strcmp("", AV176Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV175Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV175Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                             {
                                                if ( (GXutil.strcmp("", AV176Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV176Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
                                                {
                                                   e21MU2 ();
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(93) ;
         wbMU0( ) ;
      }
      bGXsfl_93_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesMU2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV177Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV177Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_BARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
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
      return (int)(subgridclient_rec_count_fnc()) ;
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
      AV123Webwlismerds_1_filterfulltext = AV93FilterFullText ;
      AV124Webwlismerds_2_barfecsal = AV75BarFecSal ;
      AV125Webwlismerds_3_barfecsal_to = AV76BarFecSal_To ;
      AV126Webwlismerds_4_clicod = AV77CliCod ;
      AV127Webwlismerds_5_clicod_to = AV78CliCod_To ;
      AV128Webwlismerds_6_barser = AV79BarSer ;
      AV129Webwlismerds_7_barser_to = AV80BarSer_To ;
      AV130Webwlismerds_8_barcolnom = AV81BarColNom ;
      AV131Webwlismerds_9_barcolnom_to = AV82BarColNom_To ;
      AV132Webwlismerds_10_barcolnum = AV83BarColNum ;
      AV133Webwlismerds_11_barcolnum_to = AV84BarColNum_To ;
      AV134Webwlismerds_12_tfclicod = AV31TFCliCod ;
      AV135Webwlismerds_13_tfclicod_to = AV32TFCliCod_To ;
      AV136Webwlismerds_14_tfclinom = AV34TFCliNom ;
      AV137Webwlismerds_15_tfclinom_sel = AV35TFCliNom_Sel ;
      AV138Webwlismerds_16_tfbarnhdr = AV37TFBarNHdr ;
      AV139Webwlismerds_17_tfbarnhdr_sel = AV38TFBarNHdr_Sel ;
      AV140Webwlismerds_18_tfbartipart = AV40TFBarTipArt ;
      AV141Webwlismerds_19_tfbartipart_to = AV41TFBarTipArt_To ;
      AV142Webwlismerds_20_tfbarser = AV46TFBarSer ;
      AV143Webwlismerds_21_tfbarser_sel = AV47TFBarSer_Sel ;
      AV144Webwlismerds_22_tfbarserdsc = AV49TFBarSerDsc ;
      AV145Webwlismerds_23_tfbarserdsc_sel = AV50TFBarSerDsc_Sel ;
      AV146Webwlismerds_24_tfbarcolnom = AV52TFBarColNom ;
      AV147Webwlismerds_25_tfbarcolnom_sel = AV53TFBarColNom_Sel ;
      AV148Webwlismerds_26_tfbarnomcli = AV55TFBarNomCli ;
      AV149Webwlismerds_27_tfbarnomcli_sel = AV56TFBarNomCli_Sel ;
      AV150Webwlismerds_28_tfbarcolnum = AV58TFBarColNum ;
      AV151Webwlismerds_29_tfbarcolnum_to = AV59TFBarColNum_To ;
      AV152Webwlismerds_30_tfbarfecsal = AV88TFBarFecSal ;
      AV153Webwlismerds_31_tfbarfeccli = AV61TFBarFecCli ;
      AV154Webwlismerds_32_tfbarkgm = AV66TFBarKgm ;
      AV155Webwlismerds_33_tfbarkgm_to = AV67TFBarKgm_To ;
      AV156Webwlismerds_34_tfbarrdto4 = AV94TFBarRdto4 ;
      AV157Webwlismerds_35_tfbarrdto4_to = AV95TFBarRdto4_To ;
      AV158Webwlismerds_36_tfbargots = AV98TFBarGots ;
      AV159Webwlismerds_37_tfbargots_sel = AV99TFBarGots_Sel ;
      AV160Webwlismerds_38_tfbargrs = AV100TFBarGrs ;
      AV161Webwlismerds_39_tfbargrs_sel = AV101TFBarGrs_Sel ;
      AV162Webwlismerds_40_tfbarocs = AV102TFBarOcs ;
      AV163Webwlismerds_41_tfbarocs_sel = AV103TFBarOcs_Sel ;
      AV164Webwlismerds_42_tfbarrcs = AV104TFBarRcs ;
      AV165Webwlismerds_43_tfbarrcs_sel = AV105TFBarRcs_Sel ;
      AV166Webwlismerds_44_tfbaroeko = AV106TFBarOeko ;
      AV167Webwlismerds_45_tfbaroeko_sel = AV107TFBarOeko_Sel ;
      AV168Webwlismerds_46_tfbaraccesorios_sel = AV108TFBarAccesorios_Sel ;
      AV169Webwlismerds_47_tfbarmarca = AV109TFBarMarca ;
      AV170Webwlismerds_48_tfbarmarca_sel = AV110TFBarMarca_Sel ;
      AV171Webwlismerds_49_tfbar_maccod = AV111TFBar_MacCod ;
      AV172Webwlismerds_50_tfbar_maccod_to = AV112TFBar_MacCod_To ;
      AV173Webwlismerds_51_tfbarfascod2 = AV113TFBarFasCod2 ;
      AV174Webwlismerds_52_tfbarfascod2_sel = AV114TFBarFasCod2_Sel ;
      AV175Webwlismerds_53_tfbarfasdsc2 = AV115TFBarFasDsc2 ;
      AV176Webwlismerds_54_tfbarfasdsc2_sel = AV116TFBarFasDsc2_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV77CliCod, AV78CliCod_To, AV79BarSer, AV80BarSer_To, AV81BarColNom, AV82BarColNom_To, AV83BarColNum, AV84BarColNum_To, AV75BarFecSal, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV93FilterFullText, AV76BarFecSal_To, AV31TFCliCod, AV32TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV37TFBarNHdr, AV38TFBarNHdr_Sel, AV40TFBarTipArt, AV41TFBarTipArt_To, AV46TFBarSer, AV47TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV52TFBarColNom, AV53TFBarColNom_Sel, AV55TFBarNomCli, AV56TFBarNomCli_Sel, AV58TFBarColNum, AV59TFBarColNum_To, AV88TFBarFecSal, AV61TFBarFecCli, AV66TFBarKgm, AV67TFBarKgm_To, AV94TFBarRdto4, AV95TFBarRdto4_To, AV98TFBarGots, AV99TFBarGots_Sel, AV100TFBarGrs, AV101TFBarGrs_Sel, AV102TFBarOcs, AV103TFBarOcs_Sel, AV104TFBarRcs, AV105TFBarRcs_Sel, AV106TFBarOeko, AV107TFBarOeko_Sel, AV108TFBarAccesorios_Sel, AV109TFBarMarca, AV110TFBarMarca_Sel, AV111TFBar_MacCod, AV112TFBar_MacCod_To, AV113TFBarFasCod2, AV114TFBarFasCod2_Sel, AV115TFBarFasDsc2, AV116TFBarFasDsc2_Sel, AV177Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV123Webwlismerds_1_filterfulltext = AV93FilterFullText ;
      AV124Webwlismerds_2_barfecsal = AV75BarFecSal ;
      AV125Webwlismerds_3_barfecsal_to = AV76BarFecSal_To ;
      AV126Webwlismerds_4_clicod = AV77CliCod ;
      AV127Webwlismerds_5_clicod_to = AV78CliCod_To ;
      AV128Webwlismerds_6_barser = AV79BarSer ;
      AV129Webwlismerds_7_barser_to = AV80BarSer_To ;
      AV130Webwlismerds_8_barcolnom = AV81BarColNom ;
      AV131Webwlismerds_9_barcolnom_to = AV82BarColNom_To ;
      AV132Webwlismerds_10_barcolnum = AV83BarColNum ;
      AV133Webwlismerds_11_barcolnum_to = AV84BarColNum_To ;
      AV134Webwlismerds_12_tfclicod = AV31TFCliCod ;
      AV135Webwlismerds_13_tfclicod_to = AV32TFCliCod_To ;
      AV136Webwlismerds_14_tfclinom = AV34TFCliNom ;
      AV137Webwlismerds_15_tfclinom_sel = AV35TFCliNom_Sel ;
      AV138Webwlismerds_16_tfbarnhdr = AV37TFBarNHdr ;
      AV139Webwlismerds_17_tfbarnhdr_sel = AV38TFBarNHdr_Sel ;
      AV140Webwlismerds_18_tfbartipart = AV40TFBarTipArt ;
      AV141Webwlismerds_19_tfbartipart_to = AV41TFBarTipArt_To ;
      AV142Webwlismerds_20_tfbarser = AV46TFBarSer ;
      AV143Webwlismerds_21_tfbarser_sel = AV47TFBarSer_Sel ;
      AV144Webwlismerds_22_tfbarserdsc = AV49TFBarSerDsc ;
      AV145Webwlismerds_23_tfbarserdsc_sel = AV50TFBarSerDsc_Sel ;
      AV146Webwlismerds_24_tfbarcolnom = AV52TFBarColNom ;
      AV147Webwlismerds_25_tfbarcolnom_sel = AV53TFBarColNom_Sel ;
      AV148Webwlismerds_26_tfbarnomcli = AV55TFBarNomCli ;
      AV149Webwlismerds_27_tfbarnomcli_sel = AV56TFBarNomCli_Sel ;
      AV150Webwlismerds_28_tfbarcolnum = AV58TFBarColNum ;
      AV151Webwlismerds_29_tfbarcolnum_to = AV59TFBarColNum_To ;
      AV152Webwlismerds_30_tfbarfecsal = AV88TFBarFecSal ;
      AV153Webwlismerds_31_tfbarfeccli = AV61TFBarFecCli ;
      AV154Webwlismerds_32_tfbarkgm = AV66TFBarKgm ;
      AV155Webwlismerds_33_tfbarkgm_to = AV67TFBarKgm_To ;
      AV156Webwlismerds_34_tfbarrdto4 = AV94TFBarRdto4 ;
      AV157Webwlismerds_35_tfbarrdto4_to = AV95TFBarRdto4_To ;
      AV158Webwlismerds_36_tfbargots = AV98TFBarGots ;
      AV159Webwlismerds_37_tfbargots_sel = AV99TFBarGots_Sel ;
      AV160Webwlismerds_38_tfbargrs = AV100TFBarGrs ;
      AV161Webwlismerds_39_tfbargrs_sel = AV101TFBarGrs_Sel ;
      AV162Webwlismerds_40_tfbarocs = AV102TFBarOcs ;
      AV163Webwlismerds_41_tfbarocs_sel = AV103TFBarOcs_Sel ;
      AV164Webwlismerds_42_tfbarrcs = AV104TFBarRcs ;
      AV165Webwlismerds_43_tfbarrcs_sel = AV105TFBarRcs_Sel ;
      AV166Webwlismerds_44_tfbaroeko = AV106TFBarOeko ;
      AV167Webwlismerds_45_tfbaroeko_sel = AV107TFBarOeko_Sel ;
      AV168Webwlismerds_46_tfbaraccesorios_sel = AV108TFBarAccesorios_Sel ;
      AV169Webwlismerds_47_tfbarmarca = AV109TFBarMarca ;
      AV170Webwlismerds_48_tfbarmarca_sel = AV110TFBarMarca_Sel ;
      AV171Webwlismerds_49_tfbar_maccod = AV111TFBar_MacCod ;
      AV172Webwlismerds_50_tfbar_maccod_to = AV112TFBar_MacCod_To ;
      AV173Webwlismerds_51_tfbarfascod2 = AV113TFBarFasCod2 ;
      AV174Webwlismerds_52_tfbarfascod2_sel = AV114TFBarFasCod2_Sel ;
      AV175Webwlismerds_53_tfbarfasdsc2 = AV115TFBarFasDsc2 ;
      AV176Webwlismerds_54_tfbarfasdsc2_sel = AV116TFBarFasDsc2_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV77CliCod, AV78CliCod_To, AV79BarSer, AV80BarSer_To, AV81BarColNom, AV82BarColNom_To, AV83BarColNum, AV84BarColNum_To, AV75BarFecSal, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV93FilterFullText, AV76BarFecSal_To, AV31TFCliCod, AV32TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV37TFBarNHdr, AV38TFBarNHdr_Sel, AV40TFBarTipArt, AV41TFBarTipArt_To, AV46TFBarSer, AV47TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV52TFBarColNom, AV53TFBarColNom_Sel, AV55TFBarNomCli, AV56TFBarNomCli_Sel, AV58TFBarColNum, AV59TFBarColNum_To, AV88TFBarFecSal, AV61TFBarFecCli, AV66TFBarKgm, AV67TFBarKgm_To, AV94TFBarRdto4, AV95TFBarRdto4_To, AV98TFBarGots, AV99TFBarGots_Sel, AV100TFBarGrs, AV101TFBarGrs_Sel, AV102TFBarOcs, AV103TFBarOcs_Sel, AV104TFBarRcs, AV105TFBarRcs_Sel, AV106TFBarOeko, AV107TFBarOeko_Sel, AV108TFBarAccesorios_Sel, AV109TFBarMarca, AV110TFBarMarca_Sel, AV111TFBar_MacCod, AV112TFBar_MacCod_To, AV113TFBarFasCod2, AV114TFBarFasCod2_Sel, AV115TFBarFasDsc2, AV116TFBarFasDsc2_Sel, AV177Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV123Webwlismerds_1_filterfulltext = AV93FilterFullText ;
      AV124Webwlismerds_2_barfecsal = AV75BarFecSal ;
      AV125Webwlismerds_3_barfecsal_to = AV76BarFecSal_To ;
      AV126Webwlismerds_4_clicod = AV77CliCod ;
      AV127Webwlismerds_5_clicod_to = AV78CliCod_To ;
      AV128Webwlismerds_6_barser = AV79BarSer ;
      AV129Webwlismerds_7_barser_to = AV80BarSer_To ;
      AV130Webwlismerds_8_barcolnom = AV81BarColNom ;
      AV131Webwlismerds_9_barcolnom_to = AV82BarColNom_To ;
      AV132Webwlismerds_10_barcolnum = AV83BarColNum ;
      AV133Webwlismerds_11_barcolnum_to = AV84BarColNum_To ;
      AV134Webwlismerds_12_tfclicod = AV31TFCliCod ;
      AV135Webwlismerds_13_tfclicod_to = AV32TFCliCod_To ;
      AV136Webwlismerds_14_tfclinom = AV34TFCliNom ;
      AV137Webwlismerds_15_tfclinom_sel = AV35TFCliNom_Sel ;
      AV138Webwlismerds_16_tfbarnhdr = AV37TFBarNHdr ;
      AV139Webwlismerds_17_tfbarnhdr_sel = AV38TFBarNHdr_Sel ;
      AV140Webwlismerds_18_tfbartipart = AV40TFBarTipArt ;
      AV141Webwlismerds_19_tfbartipart_to = AV41TFBarTipArt_To ;
      AV142Webwlismerds_20_tfbarser = AV46TFBarSer ;
      AV143Webwlismerds_21_tfbarser_sel = AV47TFBarSer_Sel ;
      AV144Webwlismerds_22_tfbarserdsc = AV49TFBarSerDsc ;
      AV145Webwlismerds_23_tfbarserdsc_sel = AV50TFBarSerDsc_Sel ;
      AV146Webwlismerds_24_tfbarcolnom = AV52TFBarColNom ;
      AV147Webwlismerds_25_tfbarcolnom_sel = AV53TFBarColNom_Sel ;
      AV148Webwlismerds_26_tfbarnomcli = AV55TFBarNomCli ;
      AV149Webwlismerds_27_tfbarnomcli_sel = AV56TFBarNomCli_Sel ;
      AV150Webwlismerds_28_tfbarcolnum = AV58TFBarColNum ;
      AV151Webwlismerds_29_tfbarcolnum_to = AV59TFBarColNum_To ;
      AV152Webwlismerds_30_tfbarfecsal = AV88TFBarFecSal ;
      AV153Webwlismerds_31_tfbarfeccli = AV61TFBarFecCli ;
      AV154Webwlismerds_32_tfbarkgm = AV66TFBarKgm ;
      AV155Webwlismerds_33_tfbarkgm_to = AV67TFBarKgm_To ;
      AV156Webwlismerds_34_tfbarrdto4 = AV94TFBarRdto4 ;
      AV157Webwlismerds_35_tfbarrdto4_to = AV95TFBarRdto4_To ;
      AV158Webwlismerds_36_tfbargots = AV98TFBarGots ;
      AV159Webwlismerds_37_tfbargots_sel = AV99TFBarGots_Sel ;
      AV160Webwlismerds_38_tfbargrs = AV100TFBarGrs ;
      AV161Webwlismerds_39_tfbargrs_sel = AV101TFBarGrs_Sel ;
      AV162Webwlismerds_40_tfbarocs = AV102TFBarOcs ;
      AV163Webwlismerds_41_tfbarocs_sel = AV103TFBarOcs_Sel ;
      AV164Webwlismerds_42_tfbarrcs = AV104TFBarRcs ;
      AV165Webwlismerds_43_tfbarrcs_sel = AV105TFBarRcs_Sel ;
      AV166Webwlismerds_44_tfbaroeko = AV106TFBarOeko ;
      AV167Webwlismerds_45_tfbaroeko_sel = AV107TFBarOeko_Sel ;
      AV168Webwlismerds_46_tfbaraccesorios_sel = AV108TFBarAccesorios_Sel ;
      AV169Webwlismerds_47_tfbarmarca = AV109TFBarMarca ;
      AV170Webwlismerds_48_tfbarmarca_sel = AV110TFBarMarca_Sel ;
      AV171Webwlismerds_49_tfbar_maccod = AV111TFBar_MacCod ;
      AV172Webwlismerds_50_tfbar_maccod_to = AV112TFBar_MacCod_To ;
      AV173Webwlismerds_51_tfbarfascod2 = AV113TFBarFasCod2 ;
      AV174Webwlismerds_52_tfbarfascod2_sel = AV114TFBarFasCod2_Sel ;
      AV175Webwlismerds_53_tfbarfasdsc2 = AV115TFBarFasDsc2 ;
      AV176Webwlismerds_54_tfbarfasdsc2_sel = AV116TFBarFasDsc2_Sel ;
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV77CliCod, AV78CliCod_To, AV79BarSer, AV80BarSer_To, AV81BarColNom, AV82BarColNom_To, AV83BarColNum, AV84BarColNum_To, AV75BarFecSal, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV93FilterFullText, AV76BarFecSal_To, AV31TFCliCod, AV32TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV37TFBarNHdr, AV38TFBarNHdr_Sel, AV40TFBarTipArt, AV41TFBarTipArt_To, AV46TFBarSer, AV47TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV52TFBarColNom, AV53TFBarColNom_Sel, AV55TFBarNomCli, AV56TFBarNomCli_Sel, AV58TFBarColNum, AV59TFBarColNum_To, AV88TFBarFecSal, AV61TFBarFecCli, AV66TFBarKgm, AV67TFBarKgm_To, AV94TFBarRdto4, AV95TFBarRdto4_To, AV98TFBarGots, AV99TFBarGots_Sel, AV100TFBarGrs, AV101TFBarGrs_Sel, AV102TFBarOcs, AV103TFBarOcs_Sel, AV104TFBarRcs, AV105TFBarRcs_Sel, AV106TFBarOeko, AV107TFBarOeko_Sel, AV108TFBarAccesorios_Sel, AV109TFBarMarca, AV110TFBarMarca_Sel, AV111TFBar_MacCod, AV112TFBar_MacCod_To, AV113TFBarFasCod2, AV114TFBarFasCod2_Sel, AV115TFBarFasDsc2, AV116TFBarFasDsc2_Sel, AV177Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV123Webwlismerds_1_filterfulltext = AV93FilterFullText ;
      AV124Webwlismerds_2_barfecsal = AV75BarFecSal ;
      AV125Webwlismerds_3_barfecsal_to = AV76BarFecSal_To ;
      AV126Webwlismerds_4_clicod = AV77CliCod ;
      AV127Webwlismerds_5_clicod_to = AV78CliCod_To ;
      AV128Webwlismerds_6_barser = AV79BarSer ;
      AV129Webwlismerds_7_barser_to = AV80BarSer_To ;
      AV130Webwlismerds_8_barcolnom = AV81BarColNom ;
      AV131Webwlismerds_9_barcolnom_to = AV82BarColNom_To ;
      AV132Webwlismerds_10_barcolnum = AV83BarColNum ;
      AV133Webwlismerds_11_barcolnum_to = AV84BarColNum_To ;
      AV134Webwlismerds_12_tfclicod = AV31TFCliCod ;
      AV135Webwlismerds_13_tfclicod_to = AV32TFCliCod_To ;
      AV136Webwlismerds_14_tfclinom = AV34TFCliNom ;
      AV137Webwlismerds_15_tfclinom_sel = AV35TFCliNom_Sel ;
      AV138Webwlismerds_16_tfbarnhdr = AV37TFBarNHdr ;
      AV139Webwlismerds_17_tfbarnhdr_sel = AV38TFBarNHdr_Sel ;
      AV140Webwlismerds_18_tfbartipart = AV40TFBarTipArt ;
      AV141Webwlismerds_19_tfbartipart_to = AV41TFBarTipArt_To ;
      AV142Webwlismerds_20_tfbarser = AV46TFBarSer ;
      AV143Webwlismerds_21_tfbarser_sel = AV47TFBarSer_Sel ;
      AV144Webwlismerds_22_tfbarserdsc = AV49TFBarSerDsc ;
      AV145Webwlismerds_23_tfbarserdsc_sel = AV50TFBarSerDsc_Sel ;
      AV146Webwlismerds_24_tfbarcolnom = AV52TFBarColNom ;
      AV147Webwlismerds_25_tfbarcolnom_sel = AV53TFBarColNom_Sel ;
      AV148Webwlismerds_26_tfbarnomcli = AV55TFBarNomCli ;
      AV149Webwlismerds_27_tfbarnomcli_sel = AV56TFBarNomCli_Sel ;
      AV150Webwlismerds_28_tfbarcolnum = AV58TFBarColNum ;
      AV151Webwlismerds_29_tfbarcolnum_to = AV59TFBarColNum_To ;
      AV152Webwlismerds_30_tfbarfecsal = AV88TFBarFecSal ;
      AV153Webwlismerds_31_tfbarfeccli = AV61TFBarFecCli ;
      AV154Webwlismerds_32_tfbarkgm = AV66TFBarKgm ;
      AV155Webwlismerds_33_tfbarkgm_to = AV67TFBarKgm_To ;
      AV156Webwlismerds_34_tfbarrdto4 = AV94TFBarRdto4 ;
      AV157Webwlismerds_35_tfbarrdto4_to = AV95TFBarRdto4_To ;
      AV158Webwlismerds_36_tfbargots = AV98TFBarGots ;
      AV159Webwlismerds_37_tfbargots_sel = AV99TFBarGots_Sel ;
      AV160Webwlismerds_38_tfbargrs = AV100TFBarGrs ;
      AV161Webwlismerds_39_tfbargrs_sel = AV101TFBarGrs_Sel ;
      AV162Webwlismerds_40_tfbarocs = AV102TFBarOcs ;
      AV163Webwlismerds_41_tfbarocs_sel = AV103TFBarOcs_Sel ;
      AV164Webwlismerds_42_tfbarrcs = AV104TFBarRcs ;
      AV165Webwlismerds_43_tfbarrcs_sel = AV105TFBarRcs_Sel ;
      AV166Webwlismerds_44_tfbaroeko = AV106TFBarOeko ;
      AV167Webwlismerds_45_tfbaroeko_sel = AV107TFBarOeko_Sel ;
      AV168Webwlismerds_46_tfbaraccesorios_sel = AV108TFBarAccesorios_Sel ;
      AV169Webwlismerds_47_tfbarmarca = AV109TFBarMarca ;
      AV170Webwlismerds_48_tfbarmarca_sel = AV110TFBarMarca_Sel ;
      AV171Webwlismerds_49_tfbar_maccod = AV111TFBar_MacCod ;
      AV172Webwlismerds_50_tfbar_maccod_to = AV112TFBar_MacCod_To ;
      AV173Webwlismerds_51_tfbarfascod2 = AV113TFBarFasCod2 ;
      AV174Webwlismerds_52_tfbarfascod2_sel = AV114TFBarFasCod2_Sel ;
      AV175Webwlismerds_53_tfbarfasdsc2 = AV115TFBarFasDsc2 ;
      AV176Webwlismerds_54_tfbarfasdsc2_sel = AV116TFBarFasDsc2_Sel ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV77CliCod, AV78CliCod_To, AV79BarSer, AV80BarSer_To, AV81BarColNom, AV82BarColNom_To, AV83BarColNum, AV84BarColNum_To, AV75BarFecSal, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV93FilterFullText, AV76BarFecSal_To, AV31TFCliCod, AV32TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV37TFBarNHdr, AV38TFBarNHdr_Sel, AV40TFBarTipArt, AV41TFBarTipArt_To, AV46TFBarSer, AV47TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV52TFBarColNom, AV53TFBarColNom_Sel, AV55TFBarNomCli, AV56TFBarNomCli_Sel, AV58TFBarColNum, AV59TFBarColNum_To, AV88TFBarFecSal, AV61TFBarFecCli, AV66TFBarKgm, AV67TFBarKgm_To, AV94TFBarRdto4, AV95TFBarRdto4_To, AV98TFBarGots, AV99TFBarGots_Sel, AV100TFBarGrs, AV101TFBarGrs_Sel, AV102TFBarOcs, AV103TFBarOcs_Sel, AV104TFBarRcs, AV105TFBarRcs_Sel, AV106TFBarOeko, AV107TFBarOeko_Sel, AV108TFBarAccesorios_Sel, AV109TFBarMarca, AV110TFBarMarca_Sel, AV111TFBar_MacCod, AV112TFBar_MacCod_To, AV113TFBarFasCod2, AV114TFBarFasCod2_Sel, AV115TFBarFasDsc2, AV116TFBarFasDsc2_Sel, AV177Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV123Webwlismerds_1_filterfulltext = AV93FilterFullText ;
      AV124Webwlismerds_2_barfecsal = AV75BarFecSal ;
      AV125Webwlismerds_3_barfecsal_to = AV76BarFecSal_To ;
      AV126Webwlismerds_4_clicod = AV77CliCod ;
      AV127Webwlismerds_5_clicod_to = AV78CliCod_To ;
      AV128Webwlismerds_6_barser = AV79BarSer ;
      AV129Webwlismerds_7_barser_to = AV80BarSer_To ;
      AV130Webwlismerds_8_barcolnom = AV81BarColNom ;
      AV131Webwlismerds_9_barcolnom_to = AV82BarColNom_To ;
      AV132Webwlismerds_10_barcolnum = AV83BarColNum ;
      AV133Webwlismerds_11_barcolnum_to = AV84BarColNum_To ;
      AV134Webwlismerds_12_tfclicod = AV31TFCliCod ;
      AV135Webwlismerds_13_tfclicod_to = AV32TFCliCod_To ;
      AV136Webwlismerds_14_tfclinom = AV34TFCliNom ;
      AV137Webwlismerds_15_tfclinom_sel = AV35TFCliNom_Sel ;
      AV138Webwlismerds_16_tfbarnhdr = AV37TFBarNHdr ;
      AV139Webwlismerds_17_tfbarnhdr_sel = AV38TFBarNHdr_Sel ;
      AV140Webwlismerds_18_tfbartipart = AV40TFBarTipArt ;
      AV141Webwlismerds_19_tfbartipart_to = AV41TFBarTipArt_To ;
      AV142Webwlismerds_20_tfbarser = AV46TFBarSer ;
      AV143Webwlismerds_21_tfbarser_sel = AV47TFBarSer_Sel ;
      AV144Webwlismerds_22_tfbarserdsc = AV49TFBarSerDsc ;
      AV145Webwlismerds_23_tfbarserdsc_sel = AV50TFBarSerDsc_Sel ;
      AV146Webwlismerds_24_tfbarcolnom = AV52TFBarColNom ;
      AV147Webwlismerds_25_tfbarcolnom_sel = AV53TFBarColNom_Sel ;
      AV148Webwlismerds_26_tfbarnomcli = AV55TFBarNomCli ;
      AV149Webwlismerds_27_tfbarnomcli_sel = AV56TFBarNomCli_Sel ;
      AV150Webwlismerds_28_tfbarcolnum = AV58TFBarColNum ;
      AV151Webwlismerds_29_tfbarcolnum_to = AV59TFBarColNum_To ;
      AV152Webwlismerds_30_tfbarfecsal = AV88TFBarFecSal ;
      AV153Webwlismerds_31_tfbarfeccli = AV61TFBarFecCli ;
      AV154Webwlismerds_32_tfbarkgm = AV66TFBarKgm ;
      AV155Webwlismerds_33_tfbarkgm_to = AV67TFBarKgm_To ;
      AV156Webwlismerds_34_tfbarrdto4 = AV94TFBarRdto4 ;
      AV157Webwlismerds_35_tfbarrdto4_to = AV95TFBarRdto4_To ;
      AV158Webwlismerds_36_tfbargots = AV98TFBarGots ;
      AV159Webwlismerds_37_tfbargots_sel = AV99TFBarGots_Sel ;
      AV160Webwlismerds_38_tfbargrs = AV100TFBarGrs ;
      AV161Webwlismerds_39_tfbargrs_sel = AV101TFBarGrs_Sel ;
      AV162Webwlismerds_40_tfbarocs = AV102TFBarOcs ;
      AV163Webwlismerds_41_tfbarocs_sel = AV103TFBarOcs_Sel ;
      AV164Webwlismerds_42_tfbarrcs = AV104TFBarRcs ;
      AV165Webwlismerds_43_tfbarrcs_sel = AV105TFBarRcs_Sel ;
      AV166Webwlismerds_44_tfbaroeko = AV106TFBarOeko ;
      AV167Webwlismerds_45_tfbaroeko_sel = AV107TFBarOeko_Sel ;
      AV168Webwlismerds_46_tfbaraccesorios_sel = AV108TFBarAccesorios_Sel ;
      AV169Webwlismerds_47_tfbarmarca = AV109TFBarMarca ;
      AV170Webwlismerds_48_tfbarmarca_sel = AV110TFBarMarca_Sel ;
      AV171Webwlismerds_49_tfbar_maccod = AV111TFBar_MacCod ;
      AV172Webwlismerds_50_tfbar_maccod_to = AV112TFBar_MacCod_To ;
      AV173Webwlismerds_51_tfbarfascod2 = AV113TFBarFasCod2 ;
      AV174Webwlismerds_52_tfbarfascod2_sel = AV114TFBarFasCod2_Sel ;
      AV175Webwlismerds_53_tfbarfasdsc2 = AV115TFBarFasDsc2 ;
      AV176Webwlismerds_54_tfbarfasdsc2_sel = AV116TFBarFasDsc2_Sel ;
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV77CliCod, AV78CliCod_To, AV79BarSer, AV80BarSer_To, AV81BarColNom, AV82BarColNom_To, AV83BarColNum, AV84BarColNum_To, AV75BarFecSal, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV93FilterFullText, AV76BarFecSal_To, AV31TFCliCod, AV32TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV37TFBarNHdr, AV38TFBarNHdr_Sel, AV40TFBarTipArt, AV41TFBarTipArt_To, AV46TFBarSer, AV47TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV52TFBarColNom, AV53TFBarColNom_Sel, AV55TFBarNomCli, AV56TFBarNomCli_Sel, AV58TFBarColNum, AV59TFBarColNum_To, AV88TFBarFecSal, AV61TFBarFecCli, AV66TFBarKgm, AV67TFBarKgm_To, AV94TFBarRdto4, AV95TFBarRdto4_To, AV98TFBarGots, AV99TFBarGots_Sel, AV100TFBarGrs, AV101TFBarGrs_Sel, AV102TFBarOcs, AV103TFBarOcs_Sel, AV104TFBarRcs, AV105TFBarRcs_Sel, AV106TFBarOeko, AV107TFBarOeko_Sel, AV108TFBarAccesorios_Sel, AV109TFBarMarca, AV110TFBarMarca_Sel, AV111TFBar_MacCod, AV112TFBar_MacCod_To, AV113TFBarFasCod2, AV114TFBarFasCod2_Sel, AV115TFBarFasDsc2, AV116TFBarFasDsc2_Sel, AV177Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV177Pgmname = "WebWlismer" ;
      Gx_err = (short)(0) ;
      edtavTipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupMU0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19MU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV27ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV69DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV24ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_93 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_93"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV71GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV72GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV75BarFecSal = localUtil.ctod( httpContext.cgiGet( sPrefix+"vBARFECSAL"), 0) ;
         AV76BarFecSal_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"vBARFECSAL_TO"), 0) ;
         A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"BARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"BARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A130BarCodPar = httpContext.cgiGet( sPrefix+"BARCODPAR") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Cls") ;
         Dvpanel_tableheader_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV93FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93FilterFullText", AV93FilterFullText);
         AV97BarFecSal_RangeText = httpContext.cgiGet( edtavBarfecsal_rangetext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97BarFecSal_RangeText", AV97BarFecSal_RangeText);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV77CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77CliCod), 6, 0));
         }
         else
         {
            AV77CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77CliCod), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD_TO");
            GX_FocusControl = edtavClicod_to_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV78CliCod_To = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78CliCod_To), 6, 0));
         }
         else
         {
            AV78CliCod_To = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78CliCod_To), 6, 0));
         }
         AV79BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79BarSer", AV79BarSer);
         AV80BarSer_To = httpContext.cgiGet( edtavBarser_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80BarSer_To", AV80BarSer_To);
         AV81BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarColNom", AV81BarColNom);
         AV82BarColNom_To = httpContext.cgiGet( edtavBarcolnom_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82BarColNom_To", AV82BarColNom_To);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
            GX_FocusControl = edtavBarcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV83BarColNum = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83BarColNum), 6, 0));
         }
         else
         {
            AV83BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83BarColNum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM_TO");
            GX_FocusControl = edtavBarcolnum_to_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV84BarColNum_To = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84BarColNum_To), 6, 0));
         }
         else
         {
            AV84BarColNum_To = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84BarColNum_To), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecsalauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECSALAUXDATE");
            GX_FocusControl = edtavDdo_barfecsalauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV90DDO_BarFecSalAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90DDO_BarFecSalAuxDate", localUtil.format(AV90DDO_BarFecSalAuxDate, "99/99/99"));
         }
         else
         {
            AV90DDO_BarFecSalAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecsalauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90DDO_BarFecSalAuxDate", localUtil.format(AV90DDO_BarFecSalAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECCLIAUXDATE");
            GX_FocusControl = edtavDdo_barfeccliauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV63DDO_BarFecCliAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63DDO_BarFecCliAuxDate", localUtil.format(AV63DDO_BarFecCliAuxDate, "99/99/99"));
         }
         else
         {
            AV63DDO_BarFecCliAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63DDO_BarFecCliAuxDate", localUtil.format(AV63DDO_BarFecCliAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( sPrefix+"GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV77CliCod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( sPrefix+"GXH_vCLICOD_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV78CliCod_To )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vBARSER"), AV79BarSer) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vBARSER_TO"), AV80BarSer_To) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vBARCOLNOM"), AV81BarColNom) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vBARCOLNOM_TO"), AV82BarColNom_To) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( sPrefix+"GXH_vBARCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV83BarColNum )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( sPrefix+"GXH_vBARCOLNUM_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV84BarColNum_To )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( sPrefix+"GXH_vBARFECSAL"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV75BarFecSal)) ) )
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
      e19MU2 ();
      if (returnInSub) return;
   }

   public void e19MU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV119Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwlismer_impl.this.GXt_char1 = GXv_char2[0] ;
      AV119Station = GXt_char1 ;
      GXv_char2[0] = AV120Emprcod ;
      GXv_char3[0] = AV121Emprnom ;
      GXv_char4[0] = AV122Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV119Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwlismer_impl.this.AV120Emprcod = GXv_char2[0] ;
      webwlismer_impl.this.AV121Emprnom = GXv_char3[0] ;
      webwlismer_impl.this.AV122Usurcod = GXv_char4[0] ;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      this.executeUsercontrolMethod(sPrefix, false, "BARFECSAL_RANGEPICKERContainer", "Attach", "", new Object[] {edtavBarfecsal_rangetext_Internalname});
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV69DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV69DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e20MU2( )
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
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV29ManageFiltersExecutionStep == 2 )
      {
         AV29ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV26Session.getValue("WebWlismerColumnsSelector"), "") != 0 )
      {
         AV22ColumnsSelectorXML = AV26Session.getValue("WebWlismerColumnsSelector") ;
         AV24ColumnsSelector.fromxml(AV22ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarTipArt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipArt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArt_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtavTipartdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipartdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtavBarenccli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarFecSal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecSal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecSal_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarFecCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFecCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecCli_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgm_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarRdto4_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarRdto4_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarRdto4_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarGots_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarGots_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGots_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarGrs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarGrs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGrs_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarOcs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarOcs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOcs_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarRcs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarRcs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarRcs_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarOeko_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarOeko_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOeko_Visible), 5, 0), !bGXsfl_93_Refreshing);
      chkBarAccesor.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarAccesor.getInternalname(), "Visible", GXutil.ltrimstr( chkBarAccesor.getVisible(), 5, 0), !bGXsfl_93_Refreshing);
      edtBarMarca_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarMarca_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMarca_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBar_MacCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBar_MacCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBar_MacCod_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarFasCod2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasCod2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCod2_Visible), 5, 0), !bGXsfl_93_Refreshing);
      edtBarFasDsc2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV24ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasDsc2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasDsc2_Visible), 5, 0), !bGXsfl_93_Refreshing);
      AV71GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71GridCurrentPage), 10, 0));
      AV72GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72GridPageCount), 10, 0));
      AV123Webwlismerds_1_filterfulltext = AV93FilterFullText ;
      AV124Webwlismerds_2_barfecsal = AV75BarFecSal ;
      AV125Webwlismerds_3_barfecsal_to = AV76BarFecSal_To ;
      AV126Webwlismerds_4_clicod = AV77CliCod ;
      AV127Webwlismerds_5_clicod_to = AV78CliCod_To ;
      AV128Webwlismerds_6_barser = AV79BarSer ;
      AV129Webwlismerds_7_barser_to = AV80BarSer_To ;
      AV130Webwlismerds_8_barcolnom = AV81BarColNom ;
      AV131Webwlismerds_9_barcolnom_to = AV82BarColNom_To ;
      AV132Webwlismerds_10_barcolnum = AV83BarColNum ;
      AV133Webwlismerds_11_barcolnum_to = AV84BarColNum_To ;
      AV134Webwlismerds_12_tfclicod = AV31TFCliCod ;
      AV135Webwlismerds_13_tfclicod_to = AV32TFCliCod_To ;
      AV136Webwlismerds_14_tfclinom = AV34TFCliNom ;
      AV137Webwlismerds_15_tfclinom_sel = AV35TFCliNom_Sel ;
      AV138Webwlismerds_16_tfbarnhdr = AV37TFBarNHdr ;
      AV139Webwlismerds_17_tfbarnhdr_sel = AV38TFBarNHdr_Sel ;
      AV140Webwlismerds_18_tfbartipart = AV40TFBarTipArt ;
      AV141Webwlismerds_19_tfbartipart_to = AV41TFBarTipArt_To ;
      AV142Webwlismerds_20_tfbarser = AV46TFBarSer ;
      AV143Webwlismerds_21_tfbarser_sel = AV47TFBarSer_Sel ;
      AV144Webwlismerds_22_tfbarserdsc = AV49TFBarSerDsc ;
      AV145Webwlismerds_23_tfbarserdsc_sel = AV50TFBarSerDsc_Sel ;
      AV146Webwlismerds_24_tfbarcolnom = AV52TFBarColNom ;
      AV147Webwlismerds_25_tfbarcolnom_sel = AV53TFBarColNom_Sel ;
      AV148Webwlismerds_26_tfbarnomcli = AV55TFBarNomCli ;
      AV149Webwlismerds_27_tfbarnomcli_sel = AV56TFBarNomCli_Sel ;
      AV150Webwlismerds_28_tfbarcolnum = AV58TFBarColNum ;
      AV151Webwlismerds_29_tfbarcolnum_to = AV59TFBarColNum_To ;
      AV152Webwlismerds_30_tfbarfecsal = AV88TFBarFecSal ;
      AV153Webwlismerds_31_tfbarfeccli = AV61TFBarFecCli ;
      AV154Webwlismerds_32_tfbarkgm = AV66TFBarKgm ;
      AV155Webwlismerds_33_tfbarkgm_to = AV67TFBarKgm_To ;
      AV156Webwlismerds_34_tfbarrdto4 = AV94TFBarRdto4 ;
      AV157Webwlismerds_35_tfbarrdto4_to = AV95TFBarRdto4_To ;
      AV158Webwlismerds_36_tfbargots = AV98TFBarGots ;
      AV159Webwlismerds_37_tfbargots_sel = AV99TFBarGots_Sel ;
      AV160Webwlismerds_38_tfbargrs = AV100TFBarGrs ;
      AV161Webwlismerds_39_tfbargrs_sel = AV101TFBarGrs_Sel ;
      AV162Webwlismerds_40_tfbarocs = AV102TFBarOcs ;
      AV163Webwlismerds_41_tfbarocs_sel = AV103TFBarOcs_Sel ;
      AV164Webwlismerds_42_tfbarrcs = AV104TFBarRcs ;
      AV165Webwlismerds_43_tfbarrcs_sel = AV105TFBarRcs_Sel ;
      AV166Webwlismerds_44_tfbaroeko = AV106TFBarOeko ;
      AV167Webwlismerds_45_tfbaroeko_sel = AV107TFBarOeko_Sel ;
      AV168Webwlismerds_46_tfbaraccesorios_sel = AV108TFBarAccesorios_Sel ;
      AV169Webwlismerds_47_tfbarmarca = AV109TFBarMarca ;
      AV170Webwlismerds_48_tfbarmarca_sel = AV110TFBarMarca_Sel ;
      AV171Webwlismerds_49_tfbar_maccod = AV111TFBar_MacCod ;
      AV172Webwlismerds_50_tfbar_maccod_to = AV112TFBar_MacCod_To ;
      AV173Webwlismerds_51_tfbarfascod2 = AV113TFBarFasCod2 ;
      AV174Webwlismerds_52_tfbarfascod2_sel = AV114TFBarFasCod2_Sel ;
      AV175Webwlismerds_53_tfbarfasdsc2 = AV115TFBarFasDsc2 ;
      AV176Webwlismerds_54_tfbarfasdsc2_sel = AV116TFBarFasDsc2_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e12MU2( )
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
         AV70PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV70PageToGo) ;
      }
   }

   public void e13MU2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e15MU2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV31TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCod), 6, 0));
            AV32TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV34TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFCliNom", AV34TFCliNom);
            AV35TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFCliNom_Sel", AV35TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV37TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarNHdr", AV37TFBarNHdr);
            AV38TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarNHdr_Sel", AV38TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipArt") == 0 )
         {
            AV40TFBarTipArt = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFBarTipArt), 4, 0));
            AV41TFBarTipArt_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarTipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFBarTipArt_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV46TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarSer", AV46TFBarSer);
            AV47TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarSer_Sel", AV47TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV49TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarSerDsc", AV49TFBarSerDsc);
            AV50TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarSerDsc_Sel", AV50TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV52TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarColNom", AV52TFBarColNom);
            AV53TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarColNom_Sel", AV53TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV55TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarNomCli", AV55TFBarNomCli);
            AV56TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarNomCli_Sel", AV56TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV58TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFBarColNum), 6, 0));
            AV59TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecSal") == 0 )
         {
            AV88TFBarFecSal = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFBarFecSal", localUtil.format(AV88TFBarFecSal, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecCli") == 0 )
         {
            AV61TFBarFecCli = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarFecCli", localUtil.format(AV61TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarKgm") == 0 )
         {
            AV66TFBarKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarKgm", GXutil.ltrimstr( AV66TFBarKgm, 9, 2));
            AV67TFBarKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarKgm_To", GXutil.ltrimstr( AV67TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarRdto4") == 0 )
         {
            AV94TFBarRdto4 = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFBarRdto4", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94TFBarRdto4), 4, 0));
            AV95TFBarRdto4_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFBarRdto4_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TFBarRdto4_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarGots") == 0 )
         {
            AV98TFBarGots = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFBarGots", AV98TFBarGots);
            AV99TFBarGots_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFBarGots_Sel", AV99TFBarGots_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarGrs") == 0 )
         {
            AV100TFBarGrs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100TFBarGrs", AV100TFBarGrs);
            AV101TFBarGrs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFBarGrs_Sel", AV101TFBarGrs_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOcs") == 0 )
         {
            AV102TFBarOcs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFBarOcs", AV102TFBarOcs);
            AV103TFBarOcs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103TFBarOcs_Sel", AV103TFBarOcs_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarRcs") == 0 )
         {
            AV104TFBarRcs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFBarRcs", AV104TFBarRcs);
            AV105TFBarRcs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFBarRcs_Sel", AV105TFBarRcs_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOeko") == 0 )
         {
            AV106TFBarOeko = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106TFBarOeko", AV106TFBarOeko);
            AV107TFBarOeko_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFBarOeko_Sel", AV107TFBarOeko_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAccesorios") == 0 )
         {
            AV108TFBarAccesorios_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFBarAccesorios_Sel", AV108TFBarAccesorios_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMarca") == 0 )
         {
            AV109TFBarMarca = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFBarMarca", AV109TFBarMarca);
            AV110TFBarMarca_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFBarMarca_Sel", AV110TFBarMarca_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Bar_MacCod") == 0 )
         {
            AV111TFBar_MacCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFBar_MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111TFBar_MacCod), 8, 0));
            AV112TFBar_MacCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112TFBar_MacCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112TFBar_MacCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasCod2") == 0 )
         {
            AV113TFBarFasCod2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113TFBarFasCod2", AV113TFBarFasCod2);
            AV114TFBarFasCod2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFBarFasCod2_Sel", AV114TFBarFasCod2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasDsc2") == 0 )
         {
            AV115TFBarFasDsc2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115TFBarFasDsc2", AV115TFBarFasDsc2);
            AV116TFBarFasDsc2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116TFBarFasDsc2_Sel", AV116TFBarFasDsc2_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e21MU2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         GXt_char1 = AV92TipArtDsc ;
         GXv_char4[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char4) ;
         webwlismer_impl.this.GXt_char1 = GXv_char4[0] ;
         AV92TipArtDsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipartdsc_Internalname, AV92TipArtDsc);
         AV15BarEncCli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarenccli_Internalname, AV15BarEncCli);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(93) ;
         }
         sendrow_932( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_93_Refreshing )
      {
         httpContext.doAjaxLoad(93, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV96GridActions, 4, 0)) );
   }

   public void e16MU2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV22ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV24ColumnsSelector.fromJSonString(AV22ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WebWlismerColumnsSelector", ((GXutil.strcmp("", AV22ColumnsSelectorXML)==0) ? "" : AV24ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e11MU2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WebWlismerFilters")),GXutil.URLEncode(GXutil.rtrim(AV177Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WebWlismerFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV29ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29ManageFiltersExecutionStep", GXutil.str( AV29ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV28ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WebWlismerFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         webwlismer_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV177Pgmname+"GridState", AV28ManageFiltersXml) ;
            AV10GridState.fromxml(AV28ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
   }

   public void e17MU2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV20ExcelFilename ;
      GXv_char3[0] = AV21ErrorMessage ;
      new app.webwlismerexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      webwlismer_impl.this.AV20ExcelFilename = GXv_char4[0] ;
      webwlismer_impl.this.AV21ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV20ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV20ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV21ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e18MU2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.webwlismerexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e14MU2( )
   {
      /* Barfecsal_rangepicker_Daterangechanged Routine */
      returnInSub = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75BarFecSal", localUtil.format(AV75BarFecSal, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76BarFecSal_To", localUtil.format(AV76BarFecSal_To, "99/99/99"));
      gxgrgrid_refresh( subGrid_Rows, AV77CliCod, AV78CliCod_To, AV79BarSer, AV80BarSer_To, AV81BarColNom, AV82BarColNom_To, AV83BarColNum, AV84BarColNum_To, AV75BarFecSal, AV29ManageFiltersExecutionStep, AV24ColumnsSelector, AV93FilterFullText, AV76BarFecSal_To, AV31TFCliCod, AV32TFCliCod_To, AV34TFCliNom, AV35TFCliNom_Sel, AV37TFBarNHdr, AV38TFBarNHdr_Sel, AV40TFBarTipArt, AV41TFBarTipArt_To, AV46TFBarSer, AV47TFBarSer_Sel, AV49TFBarSerDsc, AV50TFBarSerDsc_Sel, AV52TFBarColNom, AV53TFBarColNom_Sel, AV55TFBarNomCli, AV56TFBarNomCli_Sel, AV58TFBarColNum, AV59TFBarColNum_To, AV88TFBarFecSal, AV61TFBarFecCli, AV66TFBarKgm, AV67TFBarKgm_To, AV94TFBarRdto4, AV95TFBarRdto4_To, AV98TFBarGots, AV99TFBarGots_Sel, AV100TFBarGrs, AV101TFBarGrs_Sel, AV102TFBarOcs, AV103TFBarOcs_Sel, AV104TFBarRcs, AV105TFBarRcs_Sel, AV106TFBarOeko, AV107TFBarOeko_Sel, AV108TFBarAccesorios_Sel, AV109TFBarMarca, AV110TFBarMarca_Sel, AV111TFBar_MacCod, AV112TFBar_MacCod_To, AV113TFBarFasCod2, AV114TFBarFasCod2_Sel, AV115TFBarFasDsc2, AV116TFBarFasDsc2_Sel, AV177Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ColumnsSelector", AV24ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV27ManageFiltersData", AV27ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV24ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Nombre Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarNHdr", "", "N° Hdr", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarTipArt", "", "Codigo Tipo Articulo", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&TipArtDsc", "", "Descripción", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&BarEncCli", "", "Disp Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarSer", "", "Serie", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarColNom", "", "Nombre Color", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarNomCli", "", "Nombre Color Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarColNum", "", "Numero del Color", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarFecSal", "", "Fecha Salida en Albaran", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarFecCli", "", "Fecha Disposicion Cliente", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarKgm", "", "Kilos", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarRdto4", "", "4 decimales", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarGots", "", "Gots", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarGrs", "", "Grs", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarOcs", "", "Ocs", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarRcs", "", "Rcs", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarOeko", "", "Oeko", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarAccesorios", "", "Acc?", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarMarca", "", "Marca", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Bar_MacCod", "", "Macro", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarFasCod2", "", "Fase Ult", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarFasDsc2", "", "Desc Fase", true, "") ;
      AV24ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV23UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWlismerColumnsSelector", GXv_char4) ;
      webwlismer_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV23UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV23UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV24ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV24ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV27ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WebWlismerFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV27ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV93FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93FilterFullText", AV93FilterFullText);
      AV75BarFecSal = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75BarFecSal", localUtil.format(AV75BarFecSal, "99/99/99"));
      AV76BarFecSal_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76BarFecSal_To", localUtil.format(AV76BarFecSal_To, "99/99/99"));
      AV77CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77CliCod), 6, 0));
      AV78CliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78CliCod_To), 6, 0));
      AV79BarSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79BarSer", AV79BarSer);
      AV80BarSer_To = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80BarSer_To", AV80BarSer_To);
      AV81BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarColNom", AV81BarColNom);
      AV82BarColNom_To = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82BarColNom_To", AV82BarColNom_To);
      AV83BarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83BarColNum), 6, 0));
      AV84BarColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84BarColNum_To), 6, 0));
      AV31TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCod), 6, 0));
      AV32TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFCliCod_To), 6, 0));
      AV34TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFCliNom", AV34TFCliNom);
      AV35TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFCliNom_Sel", AV35TFCliNom_Sel);
      AV37TFBarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarNHdr", AV37TFBarNHdr);
      AV38TFBarNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarNHdr_Sel", AV38TFBarNHdr_Sel);
      AV40TFBarTipArt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFBarTipArt), 4, 0));
      AV41TFBarTipArt_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarTipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFBarTipArt_To), 4, 0));
      AV46TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarSer", AV46TFBarSer);
      AV47TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarSer_Sel", AV47TFBarSer_Sel);
      AV49TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarSerDsc", AV49TFBarSerDsc);
      AV50TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarSerDsc_Sel", AV50TFBarSerDsc_Sel);
      AV52TFBarColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarColNom", AV52TFBarColNom);
      AV53TFBarColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarColNom_Sel", AV53TFBarColNom_Sel);
      AV55TFBarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarNomCli", AV55TFBarNomCli);
      AV56TFBarNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarNomCli_Sel", AV56TFBarNomCli_Sel);
      AV58TFBarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFBarColNum), 6, 0));
      AV59TFBarColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFBarColNum_To), 6, 0));
      AV88TFBarFecSal = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFBarFecSal", localUtil.format(AV88TFBarFecSal, "99/99/99"));
      AV61TFBarFecCli = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarFecCli", localUtil.format(AV61TFBarFecCli, "99/99/99"));
      AV66TFBarKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarKgm", GXutil.ltrimstr( AV66TFBarKgm, 9, 2));
      AV67TFBarKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarKgm_To", GXutil.ltrimstr( AV67TFBarKgm_To, 9, 2));
      AV94TFBarRdto4 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFBarRdto4", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94TFBarRdto4), 4, 0));
      AV95TFBarRdto4_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFBarRdto4_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TFBarRdto4_To), 4, 0));
      AV98TFBarGots = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFBarGots", AV98TFBarGots);
      AV99TFBarGots_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFBarGots_Sel", AV99TFBarGots_Sel);
      AV100TFBarGrs = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100TFBarGrs", AV100TFBarGrs);
      AV101TFBarGrs_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFBarGrs_Sel", AV101TFBarGrs_Sel);
      AV102TFBarOcs = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFBarOcs", AV102TFBarOcs);
      AV103TFBarOcs_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103TFBarOcs_Sel", AV103TFBarOcs_Sel);
      AV104TFBarRcs = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFBarRcs", AV104TFBarRcs);
      AV105TFBarRcs_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFBarRcs_Sel", AV105TFBarRcs_Sel);
      AV106TFBarOeko = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106TFBarOeko", AV106TFBarOeko);
      AV107TFBarOeko_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFBarOeko_Sel", AV107TFBarOeko_Sel);
      AV108TFBarAccesorios_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFBarAccesorios_Sel", AV108TFBarAccesorios_Sel);
      AV109TFBarMarca = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFBarMarca", AV109TFBarMarca);
      AV110TFBarMarca_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFBarMarca_Sel", AV110TFBarMarca_Sel);
      AV111TFBar_MacCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFBar_MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111TFBar_MacCod), 8, 0));
      AV112TFBar_MacCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112TFBar_MacCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112TFBar_MacCod_To), 8, 0));
      AV113TFBarFasCod2 = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113TFBarFasCod2", AV113TFBarFasCod2);
      AV114TFBarFasCod2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFBarFasCod2_Sel", AV114TFBarFasCod2_Sel);
      AV115TFBarFasDsc2 = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115TFBarFasDsc2", AV115TFBarFasDsc2);
      AV116TFBarFasDsc2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116TFBarFasDsc2_Sel", AV116TFBarFasDsc2_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.ttrn04", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.ttrn04", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV26Session.getValue(AV177Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV177Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV26Session.getValue(AV177Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV178GXV1 = 1 ;
      while ( AV178GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV178GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV93FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93FilterFullText", AV93FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARFECSAL") == 0 )
         {
            AV75BarFecSal = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75BarFecSal", localUtil.format(AV75BarFecSal, "99/99/99"));
            AV76BarFecSal_To = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76BarFecSal_To", localUtil.format(AV76BarFecSal_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "CLICOD") == 0 )
         {
            AV77CliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77CliCod), 6, 0));
            AV78CliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78CliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78CliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARSER") == 0 )
         {
            AV79BarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79BarSer", AV79BarSer);
            AV80BarSer_To = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80BarSer_To", AV80BarSer_To);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOLNOM") == 0 )
         {
            AV81BarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81BarColNom", AV81BarColNom);
            AV82BarColNom_To = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82BarColNom_To", AV82BarColNom_To);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOLNUM") == 0 )
         {
            AV83BarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83BarColNum), 6, 0));
            AV84BarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84BarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84BarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV31TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCliCod), 6, 0));
            AV32TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV34TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFCliNom", AV34TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV35TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFCliNom_Sel", AV35TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV37TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarNHdr", AV37TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV38TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarNHdr_Sel", AV38TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPART") == 0 )
         {
            AV40TFBarTipArt = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFBarTipArt), 4, 0));
            AV41TFBarTipArt_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarTipArt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFBarTipArt_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV46TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarSer", AV46TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV47TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarSer_Sel", AV47TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV49TFBarSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarSerDsc", AV49TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV50TFBarSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarSerDsc_Sel", AV50TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV52TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarColNom", AV52TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV53TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarColNom_Sel", AV53TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV55TFBarNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarNomCli", AV55TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV56TFBarNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarNomCli_Sel", AV56TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV58TFBarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFBarColNum), 6, 0));
            AV59TFBarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV88TFBarFecSal = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFBarFecSal", localUtil.format(AV88TFBarFecSal, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV61TFBarFecCli = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarFecCli", localUtil.format(AV61TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV66TFBarKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarKgm", GXutil.ltrimstr( AV66TFBarKgm, 9, 2));
            AV67TFBarKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarKgm_To", GXutil.ltrimstr( AV67TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRDTO4") == 0 )
         {
            AV94TFBarRdto4 = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFBarRdto4", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94TFBarRdto4), 4, 0));
            AV95TFBarRdto4_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFBarRdto4_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TFBarRdto4_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGOTS") == 0 )
         {
            AV98TFBarGots = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFBarGots", AV98TFBarGots);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGOTS_SEL") == 0 )
         {
            AV99TFBarGots_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFBarGots_Sel", AV99TFBarGots_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGRS") == 0 )
         {
            AV100TFBarGrs = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100TFBarGrs", AV100TFBarGrs);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGRS_SEL") == 0 )
         {
            AV101TFBarGrs_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFBarGrs_Sel", AV101TFBarGrs_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROCS") == 0 )
         {
            AV102TFBarOcs = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFBarOcs", AV102TFBarOcs);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROCS_SEL") == 0 )
         {
            AV103TFBarOcs_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103TFBarOcs_Sel", AV103TFBarOcs_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRCS") == 0 )
         {
            AV104TFBarRcs = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TFBarRcs", AV104TFBarRcs);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRCS_SEL") == 0 )
         {
            AV105TFBarRcs_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TFBarRcs_Sel", AV105TFBarRcs_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROEKO") == 0 )
         {
            AV106TFBarOeko = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106TFBarOeko", AV106TFBarOeko);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROEKO_SEL") == 0 )
         {
            AV107TFBarOeko_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFBarOeko_Sel", AV107TFBarOeko_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACCESORIOS_SEL") == 0 )
         {
            AV108TFBarAccesorios_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFBarAccesorios_Sel", AV108TFBarAccesorios_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMARCA") == 0 )
         {
            AV109TFBarMarca = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFBarMarca", AV109TFBarMarca);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMARCA_SEL") == 0 )
         {
            AV110TFBarMarca_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFBarMarca_Sel", AV110TFBarMarca_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAR_MACCOD") == 0 )
         {
            AV111TFBar_MacCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFBar_MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111TFBar_MacCod), 8, 0));
            AV112TFBar_MacCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112TFBar_MacCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112TFBar_MacCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD2") == 0 )
         {
            AV113TFBarFasCod2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113TFBarFasCod2", AV113TFBarFasCod2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD2_SEL") == 0 )
         {
            AV114TFBarFasCod2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFBarFasCod2_Sel", AV114TFBarFasCod2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDSC2") == 0 )
         {
            AV115TFBarFasDsc2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115TFBarFasDsc2", AV115TFBarFasDsc2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDSC2_SEL") == 0 )
         {
            AV116TFBarFasDsc2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116TFBarFasDsc2_Sel", AV116TFBarFasDsc2_Sel);
         }
         AV178GXV1 = (int)(AV178GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFCliNom_Sel)==0), AV35TFCliNom_Sel, GXv_char4) ;
      webwlismer_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFBarNHdr_Sel)==0), AV38TFBarNHdr_Sel, GXv_char3) ;
      webwlismer_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFBarSer_Sel)==0), AV47TFBarSer_Sel, GXv_char2) ;
      webwlismer_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFBarSerDsc_Sel)==0), AV50TFBarSerDsc_Sel, GXv_char15) ;
      webwlismer_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFBarColNom_Sel)==0), AV53TFBarColNom_Sel, GXv_char17) ;
      webwlismer_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFBarNomCli_Sel)==0), AV56TFBarNomCli_Sel, GXv_char19) ;
      webwlismer_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV99TFBarGots_Sel)==0), AV99TFBarGots_Sel, GXv_char21) ;
      webwlismer_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV101TFBarGrs_Sel)==0), AV101TFBarGrs_Sel, GXv_char23) ;
      webwlismer_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV103TFBarOcs_Sel)==0), AV103TFBarOcs_Sel, GXv_char25) ;
      webwlismer_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV105TFBarRcs_Sel)==0), AV105TFBarRcs_Sel, GXv_char27) ;
      webwlismer_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV107TFBarOeko_Sel)==0), AV107TFBarOeko_Sel, GXv_char29) ;
      webwlismer_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV108TFBarAccesorios_Sel)==0), AV108TFBarAccesorios_Sel, GXv_char31) ;
      webwlismer_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV110TFBarMarca_Sel)==0), AV110TFBarMarca_Sel, GXv_char33) ;
      webwlismer_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV114TFBarFasCod2_Sel)==0), AV114TFBarFasCod2_Sel, GXv_char35) ;
      webwlismer_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV116TFBarFasDsc2_Sel)==0), AV116TFBarFasDsc2_Sel, GXv_char37) ;
      webwlismer_impl.this.GXt_char36 = GXv_char37[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char12+"||||"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18+"||||||"+GXt_char20+"|"+GXt_char22+"|"+GXt_char24+"|"+GXt_char26+"|"+GXt_char28+"|"+GXt_char30+"|"+GXt_char32+"||"+GXt_char34+"|"+GXt_char36 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFCliNom)==0), AV34TFCliNom, GXv_char37) ;
      webwlismer_impl.this.GXt_char36 = GXv_char37[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFBarNHdr)==0), AV37TFBarNHdr, GXv_char35) ;
      webwlismer_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFBarSer)==0), AV46TFBarSer, GXv_char33) ;
      webwlismer_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFBarSerDsc)==0), AV49TFBarSerDsc, GXv_char31) ;
      webwlismer_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFBarColNom)==0), AV52TFBarColNom, GXv_char29) ;
      webwlismer_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFBarNomCli)==0), AV55TFBarNomCli, GXv_char27) ;
      webwlismer_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV98TFBarGots)==0), AV98TFBarGots, GXv_char25) ;
      webwlismer_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV100TFBarGrs)==0), AV100TFBarGrs, GXv_char23) ;
      webwlismer_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV102TFBarOcs)==0), AV102TFBarOcs, GXv_char21) ;
      webwlismer_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV104TFBarRcs)==0), AV104TFBarRcs, GXv_char19) ;
      webwlismer_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV106TFBarOeko)==0), AV106TFBarOeko, GXv_char17) ;
      webwlismer_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV109TFBarMarca)==0), AV109TFBarMarca, GXv_char15) ;
      webwlismer_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV113TFBarFasCod2)==0), AV113TFBarFasCod2, GXv_char4) ;
      webwlismer_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV115TFBarFasDsc2)==0), AV115TFBarFasDsc2, GXv_char3) ;
      webwlismer_impl.this.GXt_char12 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV31TFCliCod) ? "" : GXutil.str( AV31TFCliCod, 6, 0))+"|"+GXt_char36+"|"+GXt_char34+"|"+((0==AV40TFBarTipArt) ? "" : GXutil.str( AV40TFBarTipArt, 4, 0))+"|||"+GXt_char32+"|"+GXt_char30+"|"+GXt_char28+"|"+GXt_char26+"|"+((0==AV58TFBarColNum) ? "" : GXutil.str( AV58TFBarColNum, 6, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88TFBarFecSal)) ? "" : localUtil.dtoc( AV88TFBarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV61TFBarFecCli)) ? "" : localUtil.dtoc( AV61TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFBarKgm)==0) ? "" : GXutil.str( AV66TFBarKgm, 9, 2))+"|"+((0==AV94TFBarRdto4) ? "" : GXutil.str( AV94TFBarRdto4, 4, 0))+"|"+GXt_char24+"|"+GXt_char22+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"||"+GXt_char14+"|"+((0==AV111TFBar_MacCod) ? "" : GXutil.str( AV111TFBar_MacCod, 8, 0))+"|"+GXt_char13+"|"+GXt_char12 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV32TFCliCod_To) ? "" : GXutil.str( AV32TFCliCod_To, 6, 0))+"|||"+((0==AV41TFBarTipArt_To) ? "" : GXutil.str( AV41TFBarTipArt_To, 4, 0))+"|||||||"+((0==AV59TFBarColNum_To) ? "" : GXutil.str( AV59TFBarColNum_To, 6, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFBarKgm_To)==0) ? "" : GXutil.str( AV67TFBarKgm_To, 9, 2))+"|"+((0==AV95TFBarRdto4_To) ? "" : GXutil.str( AV95TFBarRdto4_To, 4, 0))+"||||||||"+((0==AV112TFBar_MacCod_To) ? "" : GXutil.str( AV112TFBar_MacCod_To, 8, 0))+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV26Session.getValue(AV177Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV93FilterFullText)==0), (short)(0), AV93FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "BARFECSAL", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75BarFecSal))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76BarFecSal_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV75BarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV76BarFecSal_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "CLICOD", "", !((0==AV77CliCod)&&(0==AV78CliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV77CliCod, 6, 0)), GXutil.trim( GXutil.str( AV78CliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "BARSER", "", !((GXutil.strcmp("", AV79BarSer)==0)&&(GXutil.strcmp("", AV80BarSer_To)==0)), (short)(0), AV79BarSer, AV80BarSer_To) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "BARCOLNOM", "", !((GXutil.strcmp("", AV81BarColNom)==0)&&(GXutil.strcmp("", AV82BarColNom_To)==0)), (short)(0), AV81BarColNom, AV82BarColNom_To) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "BARCOLNUM", "", !((0==AV83BarColNum)&&(0==AV84BarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV83BarColNum, 6, 0)), GXutil.trim( GXutil.str( AV84BarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFCLICOD", "", !((0==AV31TFCliCod)&&(0==AV32TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV31TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV32TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFCLINOM", "", !(GXutil.strcmp("", AV34TFCliNom)==0), (short)(0), AV34TFCliNom, "", !(GXutil.strcmp("", AV35TFCliNom_Sel)==0), AV35TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARNHDR", "", !(GXutil.strcmp("", AV37TFBarNHdr)==0), (short)(0), AV37TFBarNHdr, "", !(GXutil.strcmp("", AV38TFBarNHdr_Sel)==0), AV38TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARTIPART", "", !((0==AV40TFBarTipArt)&&(0==AV41TFBarTipArt_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFBarTipArt, 4, 0)), GXutil.trim( GXutil.str( AV41TFBarTipArt_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARSER", "", !(GXutil.strcmp("", AV46TFBarSer)==0), (short)(0), AV46TFBarSer, "", !(GXutil.strcmp("", AV47TFBarSer_Sel)==0), AV47TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARSERDSC", "", !(GXutil.strcmp("", AV49TFBarSerDsc)==0), (short)(0), AV49TFBarSerDsc, "", !(GXutil.strcmp("", AV50TFBarSerDsc_Sel)==0), AV50TFBarSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV52TFBarColNom)==0), (short)(0), AV52TFBarColNom, "", !(GXutil.strcmp("", AV53TFBarColNom_Sel)==0), AV53TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV55TFBarNomCli)==0), (short)(0), AV55TFBarNomCli, "", !(GXutil.strcmp("", AV56TFBarNomCli_Sel)==0), AV56TFBarNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARCOLNUM", "", !((0==AV58TFBarColNum)&&(0==AV59TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV58TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV59TFBarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARFECSAL", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88TFBarFecSal)), (short)(0), GXutil.trim( localUtil.dtoc( AV88TFBarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARFECCLI", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV61TFBarFecCli)), (short)(0), GXutil.trim( localUtil.dtoc( AV61TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFBarKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFBarKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV66TFBarKgm, 9, 2)), GXutil.trim( GXutil.str( AV67TFBarKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARRDTO4", "", !((0==AV94TFBarRdto4)&&(0==AV95TFBarRdto4_To)), (short)(0), GXutil.trim( GXutil.str( AV94TFBarRdto4, 4, 0)), GXutil.trim( GXutil.str( AV95TFBarRdto4_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARGOTS", "", !(GXutil.strcmp("", AV98TFBarGots)==0), (short)(0), AV98TFBarGots, "", !(GXutil.strcmp("", AV99TFBarGots_Sel)==0), AV99TFBarGots_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARGRS", "", !(GXutil.strcmp("", AV100TFBarGrs)==0), (short)(0), AV100TFBarGrs, "", !(GXutil.strcmp("", AV101TFBarGrs_Sel)==0), AV101TFBarGrs_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBAROCS", "", !(GXutil.strcmp("", AV102TFBarOcs)==0), (short)(0), AV102TFBarOcs, "", !(GXutil.strcmp("", AV103TFBarOcs_Sel)==0), AV103TFBarOcs_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARRCS", "", !(GXutil.strcmp("", AV104TFBarRcs)==0), (short)(0), AV104TFBarRcs, "", !(GXutil.strcmp("", AV105TFBarRcs_Sel)==0), AV105TFBarRcs_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBAROEKO", "", !(GXutil.strcmp("", AV106TFBarOeko)==0), (short)(0), AV106TFBarOeko, "", !(GXutil.strcmp("", AV107TFBarOeko_Sel)==0), AV107TFBarOeko_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARACCESORIOS_SEL", "", !(GXutil.strcmp("", AV108TFBarAccesorios_Sel)==0), (short)(0), AV108TFBarAccesorios_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARMARCA", "", !(GXutil.strcmp("", AV109TFBarMarca)==0), (short)(0), AV109TFBarMarca, "", !(GXutil.strcmp("", AV110TFBarMarca_Sel)==0), AV110TFBarMarca_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBAR_MACCOD", "", !((0==AV111TFBar_MacCod)&&(0==AV112TFBar_MacCod_To)), (short)(0), GXutil.trim( GXutil.str( AV111TFBar_MacCod, 8, 0)), GXutil.trim( GXutil.str( AV112TFBar_MacCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARFASCOD2", "", !(GXutil.strcmp("", AV113TFBarFasCod2)==0), (short)(0), AV113TFBarFasCod2, "", !(GXutil.strcmp("", AV114TFBarFasCod2_Sel)==0), AV114TFBarFasCod2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      GXv_SdtWWPGridState38[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState38, "TFBARFASDSC2", "", !(GXutil.strcmp("", AV115TFBarFasDsc2)==0), (short)(0), AV115TFBarFasDsc2, "", !(GXutil.strcmp("", AV116TFBarFasDsc2_Sel)==0), AV116TFBarFasDsc2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState38[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV177Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV177Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTrn04" );
      AV26Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_MU2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_26_MU2( true) ;
      }
      else
      {
         wb_table2_26_MU2( false) ;
      }
      return  ;
   }

   public void wb_table2_26_MU2e( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV27ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_MU2e( true) ;
      }
      else
      {
         wb_table1_23_MU2e( false) ;
      }
   }

   public void wb_table2_26_MU2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'" + sPrefix + "',false,'" + sGXsfl_93_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV93FilterFullText, GXutil.rtrim( localUtil.format( AV93FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WebWlismer.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecsal_rangetext_Internalname, httpContext.getMessage( "Bar Fec Sal_Range Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_93_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecsal_rangetext_Internalname, AV97BarFecSal_RangeText, GXutil.rtrim( localUtil.format( AV97BarFecSal_RangeText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarfecsal_rangetext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarfecsal_rangetext_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWlismer.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_37_MU2( true) ;
      }
      else
      {
         wb_table3_37_MU2( false) ;
      }
      return  ;
   }

   public void wb_table3_37_MU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_49_MU2( true) ;
      }
      else
      {
         wb_table4_49_MU2( false) ;
      }
      return  ;
   }

   public void wb_table4_49_MU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_61_MU2( true) ;
      }
      else
      {
         wb_table5_61_MU2( false) ;
      }
      return  ;
   }

   public void wb_table5_61_MU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_73_MU2( true) ;
      }
      else
      {
         wb_table6_73_MU2( false) ;
      }
      return  ;
   }

   public void wb_table6_73_MU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_26_MU2e( true) ;
      }
      else
      {
         wb_table2_26_MU2e( false) ;
      }
   }

   public void wb_table6_73_MU2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedbarcolnum_Internalname, tblTablemergedbarcolnum_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Bar Col Num", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'" + sPrefix + "',false,'" + sGXsfl_93_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV83BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV83BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV83BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarcolnum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWlismer.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblBarcolnum_rangemiddletext_Internalname, httpContext.getMessage( "WWP_MiddleText", ""), "", "", lblBarcolnum_rangemiddletext_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WebWlismer.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_to_Internalname, httpContext.getMessage( "Bar Col Num_To", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'" + sPrefix + "',false,'" + sGXsfl_93_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV84BarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_to_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV84BarColNum_To), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV84BarColNum_To), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarcolnum_to_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcolnum_to_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWlismer.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_73_MU2e( true) ;
      }
      else
      {
         wb_table6_73_MU2e( false) ;
      }
   }

   public void wb_table5_61_MU2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedbarcolnom_Internalname, tblTablemergedbarcolnom_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Bar Col Nom", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'" + sPrefix + "',false,'" + sGXsfl_93_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV81BarColNom), GXutil.rtrim( localUtil.format( AV81BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarcolnom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWlismer.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblBarcolnom_rangemiddletext_Internalname, httpContext.getMessage( "WWP_MiddleText", ""), "", "", lblBarcolnom_rangemiddletext_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WebWlismer.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_to_Internalname, httpContext.getMessage( "Bar Col Nom_To", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'" + sPrefix + "',false,'" + sGXsfl_93_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_to_Internalname, GXutil.rtrim( AV82BarColNom_To), GXutil.rtrim( localUtil.format( AV82BarColNom_To, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarcolnom_to_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcolnom_to_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWlismer.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_61_MU2e( true) ;
      }
      else
      {
         wb_table5_61_MU2e( false) ;
      }
   }

   public void wb_table4_49_MU2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedbarser_Internalname, tblTablemergedbarser_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Bar Ser", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'" + sPrefix + "',false,'" + sGXsfl_93_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV79BarSer), GXutil.rtrim( localUtil.format( AV79BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarser_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWlismer.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblBarser_rangemiddletext_Internalname, httpContext.getMessage( "WWP_MiddleText", ""), "", "", lblBarser_rangemiddletext_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WebWlismer.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_to_Internalname, httpContext.getMessage( "Bar Ser_To", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'" + sPrefix + "',false,'" + sGXsfl_93_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_to_Internalname, GXutil.rtrim( AV80BarSer_To), GXutil.rtrim( localUtil.format( AV80BarSer_To, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavBarser_to_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarser_to_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWlismer.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_49_MU2e( true) ;
      }
      else
      {
         wb_table4_49_MU2e( false) ;
      }
   }

   public void wb_table3_37_MU2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedclicod_Internalname, tblTablemergedclicod_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cli Cod", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'" + sPrefix + "',false,'" + sGXsfl_93_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV77CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV77CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV77CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavClicod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWlismer.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblClicod_rangemiddletext_Internalname, httpContext.getMessage( "WWP_MiddleText", ""), "", "", lblClicod_rangemiddletext_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WebWlismer.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_to_Internalname, httpContext.getMessage( "Cli Cod_To", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'" + sPrefix + "',false,'" + sGXsfl_93_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV78CliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_to_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV78CliCod_To), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV78CliCod_To), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavClicod_to_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavClicod_to_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWlismer.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_37_MU2e( true) ;
      }
      else
      {
         wb_table3_37_MU2e( false) ;
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
      paMU2( ) ;
      wsMU2( ) ;
      weMU2( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
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

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paMU2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "webwlismer", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paMU2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
      }
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      paMU2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsMU2( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wsMU2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      weMU2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/Shared/daterangepicker/daterangepicker.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211665238", true, true);
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
      httpContext.AddJavascriptSource("webwlismer.js", "?20268211665238", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DateRangePicker/DateRangePickerRender.js", "", false, true);
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

   public void subsflControlProps_932( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_93_idx );
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_93_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_93_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_93_idx ;
      edtBarTipArt_Internalname = sPrefix+"BARTIPART_"+sGXsfl_93_idx ;
      edtavTipartdsc_Internalname = sPrefix+"vTIPARTDSC_"+sGXsfl_93_idx ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI_"+sGXsfl_93_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_93_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_93_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_93_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_93_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_93_idx ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL_"+sGXsfl_93_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_93_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_93_idx ;
      edtBarRdto4_Internalname = sPrefix+"BARRDTO4_"+sGXsfl_93_idx ;
      edtBarGots_Internalname = sPrefix+"BARGOTS_"+sGXsfl_93_idx ;
      edtBarGrs_Internalname = sPrefix+"BARGRS_"+sGXsfl_93_idx ;
      edtBarOcs_Internalname = sPrefix+"BAROCS_"+sGXsfl_93_idx ;
      edtBarRcs_Internalname = sPrefix+"BARRCS_"+sGXsfl_93_idx ;
      edtBarOeko_Internalname = sPrefix+"BAROEKO_"+sGXsfl_93_idx ;
      chkBarAccesor.setInternalname( sPrefix+"BARACCESOR_"+sGXsfl_93_idx );
      edtBarMarca_Internalname = sPrefix+"BARMARCA_"+sGXsfl_93_idx ;
      edtBar_MacCod_Internalname = sPrefix+"BAR_MACCOD_"+sGXsfl_93_idx ;
      edtBarFasCod2_Internalname = sPrefix+"BARFASCOD2_"+sGXsfl_93_idx ;
      edtBarFasDsc2_Internalname = sPrefix+"BARFASDSC2_"+sGXsfl_93_idx ;
   }

   public void subsflControlProps_fel_932( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_93_fel_idx );
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_93_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_93_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_93_fel_idx ;
      edtBarTipArt_Internalname = sPrefix+"BARTIPART_"+sGXsfl_93_fel_idx ;
      edtavTipartdsc_Internalname = sPrefix+"vTIPARTDSC_"+sGXsfl_93_fel_idx ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI_"+sGXsfl_93_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_93_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_93_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_93_fel_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_93_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_93_fel_idx ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL_"+sGXsfl_93_fel_idx ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI_"+sGXsfl_93_fel_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_93_fel_idx ;
      edtBarRdto4_Internalname = sPrefix+"BARRDTO4_"+sGXsfl_93_fel_idx ;
      edtBarGots_Internalname = sPrefix+"BARGOTS_"+sGXsfl_93_fel_idx ;
      edtBarGrs_Internalname = sPrefix+"BARGRS_"+sGXsfl_93_fel_idx ;
      edtBarOcs_Internalname = sPrefix+"BAROCS_"+sGXsfl_93_fel_idx ;
      edtBarRcs_Internalname = sPrefix+"BARRCS_"+sGXsfl_93_fel_idx ;
      edtBarOeko_Internalname = sPrefix+"BAROEKO_"+sGXsfl_93_fel_idx ;
      chkBarAccesor.setInternalname( sPrefix+"BARACCESOR_"+sGXsfl_93_fel_idx );
      edtBarMarca_Internalname = sPrefix+"BARMARCA_"+sGXsfl_93_fel_idx ;
      edtBar_MacCod_Internalname = sPrefix+"BAR_MACCOD_"+sGXsfl_93_fel_idx ;
      edtBarFasCod2_Internalname = sPrefix+"BARFASCOD2_"+sGXsfl_93_fel_idx ;
      edtBarFasDsc2_Internalname = sPrefix+"BARFASDSC2_"+sGXsfl_93_fel_idx ;
   }

   public void sendrow_932( )
   {
      subsflControlProps_932( ) ;
      wbMU0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_93_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_93_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_93_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 94,'"+sPrefix+"',false,'"+sGXsfl_93_idx+"',93)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_93_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV96GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV96GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV96GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+sPrefix+"'"+",false,"+"'"+"e22mu2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,94);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV96GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_93_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarTipArt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipArt_Internalname,GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarTipArt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavTipartdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTipartdsc_Enabled!=0)&&(edtavTipartdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 99,'"+sPrefix+"',false,'"+sGXsfl_93_idx+"',93)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipartdsc_Internalname,GXutil.rtrim( AV92TipArtDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavTipartdsc_Enabled!=0)&&(edtavTipartdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,99);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTipartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTipartdsc_Visible),Integer.valueOf(edtavTipartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarenccli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarenccli_Enabled!=0)&&(edtavBarenccli_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 100,'"+sPrefix+"',false,'"+sGXsfl_93_idx+"',93)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarenccli_Internalname,GXutil.rtrim( AV15BarEncCli),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarenccli_Enabled!=0)&&(edtavBarenccli_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,100);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarenccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarenccli_Visible),Integer.valueOf(edtavBarenccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecSal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecSal_Internalname,localUtil.format(A161BarFecSal, "99/99/99"),localUtil.format( A161BarFecSal, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecSal_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecCli_Internalname,localUtil.format(A155BarFecCli, "99/99/99"),localUtil.format( A155BarFecCli, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFecCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarRdto4_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarRdto4_Internalname,GXutil.ltrim( localUtil.ntoc( A13769BarRdto4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13769BarRdto4), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarRdto4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarRdto4_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarGots_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarGots_Internalname,GXutil.rtrim( A13855BarGots),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarGots_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarGots_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarGrs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarGrs_Internalname,GXutil.rtrim( A13856BarGrs),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarGrs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarGrs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarOcs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOcs_Internalname,GXutil.rtrim( A13857BarOcs),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarOcs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarOcs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarRcs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarRcs_Internalname,GXutil.rtrim( A13858BarRcs),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarRcs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarRcs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarOeko_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOeko_Internalname,GXutil.rtrim( A13859BarOeko),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarOeko_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarOeko_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkBarAccesor.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "BARACCESOR_" + sGXsfl_93_idx ;
         chkBarAccesor.setName( GXCCtl );
         chkBarAccesor.setWebtags( "" );
         chkBarAccesor.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarAccesor.getInternalname(), "TitleCaption", chkBarAccesor.getCaption(), !bGXsfl_93_Refreshing);
         chkBarAccesor.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkBarAccesor.getInternalname(),A13860BarAccesor,"","",Integer.valueOf(chkBarAccesor.getVisible()),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarMarca_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMarca_Internalname,GXutil.rtrim( A13861BarMarca),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMarca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarMarca_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBar_MacCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBar_MacCod_Internalname,GXutil.ltrim( localUtil.ntoc( A13862Bar_MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13862Bar_MacCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBar_MacCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBar_MacCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarFasCod2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasCod2_Internalname,GXutil.rtrim( A13863BarFasCod2),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasCod2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFasCod2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarFasDsc2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasDsc2_Internalname,GXutil.rtrim( A13864BarFasDsc2),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasDsc2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarFasDsc2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesMU2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_93_idx = ((subGrid_Islastpage==1)&&(nGXsfl_93_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_93_idx+1) ;
         sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_932( ) ;
      }
      /* End function sendrow_932 */
   }

   public void startgridcontrol93( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"93\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTipArt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Tipo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTipartdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarenccli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disp Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero del Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecSal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Salida en Albaran", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFecCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Disposicion Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarRdto4_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "4 decimales", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarGots_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Gots", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarGrs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Grs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarOcs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ocs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarRcs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rcs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarOeko_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Oeko", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkBarAccesor.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acc?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMarca_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Marca", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBar_MacCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Macro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasCod2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase Ult", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasDsc2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Desc Fase", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV96GridActions, (byte)(4), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTipArt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV92TipArtDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTipartdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV15BarEncCli));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarenccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarenccli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A161BarFecSal, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecSal_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A155BarFecCli, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFecCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13769BarRdto4, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarRdto4_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13855BarGots));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarGots_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13856BarGrs));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarGrs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13857BarOcs));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarOcs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13858BarRcs));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarRcs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13859BarOeko));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarOeko_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13860BarAccesor));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkBarAccesor.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13861BarMarca));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMarca_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13862Bar_MacCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBar_MacCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13863BarFasCod2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasCod2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13864BarFasDsc2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasDsc2_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      edtavBarfecsal_rangetext_Internalname = sPrefix+"vBARFECSAL_RANGETEXT" ;
      edtavClicod_Internalname = sPrefix+"vCLICOD" ;
      lblClicod_rangemiddletext_Internalname = sPrefix+"CLICOD_RANGEMIDDLETEXT" ;
      edtavClicod_to_Internalname = sPrefix+"vCLICOD_TO" ;
      tblTablemergedclicod_Internalname = sPrefix+"TABLEMERGEDCLICOD" ;
      edtavBarser_Internalname = sPrefix+"vBARSER" ;
      lblBarser_rangemiddletext_Internalname = sPrefix+"BARSER_RANGEMIDDLETEXT" ;
      edtavBarser_to_Internalname = sPrefix+"vBARSER_TO" ;
      tblTablemergedbarser_Internalname = sPrefix+"TABLEMERGEDBARSER" ;
      edtavBarcolnom_Internalname = sPrefix+"vBARCOLNOM" ;
      lblBarcolnom_rangemiddletext_Internalname = sPrefix+"BARCOLNOM_RANGEMIDDLETEXT" ;
      edtavBarcolnom_to_Internalname = sPrefix+"vBARCOLNOM_TO" ;
      tblTablemergedbarcolnom_Internalname = sPrefix+"TABLEMERGEDBARCOLNOM" ;
      edtavBarcolnum_Internalname = sPrefix+"vBARCOLNUM" ;
      lblBarcolnum_rangemiddletext_Internalname = sPrefix+"BARCOLNUM_RANGEMIDDLETEXT" ;
      edtavBarcolnum_to_Internalname = sPrefix+"vBARCOLNUM_TO" ;
      tblTablemergedbarcolnum_Internalname = sPrefix+"TABLEMERGEDBARCOLNUM" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS" );
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtBarTipArt_Internalname = sPrefix+"BARTIPART" ;
      edtavTipartdsc_Internalname = sPrefix+"vTIPARTDSC" ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI" ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM" ;
      edtBarFecSal_Internalname = sPrefix+"BARFECSAL" ;
      edtBarFecCli_Internalname = sPrefix+"BARFECCLI" ;
      edtBarKgm_Internalname = sPrefix+"BARKGM" ;
      edtBarRdto4_Internalname = sPrefix+"BARRDTO4" ;
      edtBarGots_Internalname = sPrefix+"BARGOTS" ;
      edtBarGrs_Internalname = sPrefix+"BARGRS" ;
      edtBarOcs_Internalname = sPrefix+"BAROCS" ;
      edtBarRcs_Internalname = sPrefix+"BARRCS" ;
      edtBarOeko_Internalname = sPrefix+"BAROEKO" ;
      chkBarAccesor.setInternalname( sPrefix+"BARACCESOR" );
      edtBarMarca_Internalname = sPrefix+"BARMARCA" ;
      edtBar_MacCod_Internalname = sPrefix+"BAR_MACCOD" ;
      edtBarFasCod2_Internalname = sPrefix+"BARFASCOD2" ;
      edtBarFasDsc2_Internalname = sPrefix+"BARFASDSC2" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Barfecsal_rangepicker_Internalname = sPrefix+"BARFECSAL_RANGEPICKER" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_barfecsalauxdate_Internalname = sPrefix+"vDDO_BARFECSALAUXDATE" ;
      divDdo_barfecsalauxdates_Internalname = sPrefix+"DDO_BARFECSALAUXDATES" ;
      edtavDdo_barfeccliauxdate_Internalname = sPrefix+"vDDO_BARFECCLIAUXDATE" ;
      divDdo_barfeccliauxdates_Internalname = sPrefix+"DDO_BARFECCLIAUXDATES" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGrid_Internalname = sPrefix+"GRID" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtBarFasDsc2_Jsonclick = "" ;
      edtBarFasCod2_Jsonclick = "" ;
      edtBar_MacCod_Jsonclick = "" ;
      edtBarMarca_Jsonclick = "" ;
      chkBarAccesor.setCaption( "" );
      edtBarOeko_Jsonclick = "" ;
      edtBarRcs_Jsonclick = "" ;
      edtBarOcs_Jsonclick = "" ;
      edtBarGrs_Jsonclick = "" ;
      edtBarGots_Jsonclick = "" ;
      edtBarRdto4_Jsonclick = "" ;
      edtBarKgm_Jsonclick = "" ;
      edtBarFecCli_Jsonclick = "" ;
      edtBarFecSal_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtavBarenccli_Jsonclick = "" ;
      edtavBarenccli_Enabled = 1 ;
      edtavTipartdsc_Jsonclick = "" ;
      edtavTipartdsc_Enabled = 1 ;
      edtBarTipArt_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavClicod_to_Jsonclick = "" ;
      edtavClicod_to_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      edtavBarser_to_Jsonclick = "" ;
      edtavBarser_to_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 1 ;
      edtavBarcolnom_to_Jsonclick = "" ;
      edtavBarcolnom_to_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarcolnum_to_Jsonclick = "" ;
      edtavBarcolnum_to_Enabled = 1 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 1 ;
      edtavBarfecsal_rangetext_Jsonclick = "" ;
      edtavBarfecsal_rangetext_Enabled = 1 ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtBarFasDsc2_Visible = -1 ;
      edtBarFasCod2_Visible = -1 ;
      edtBar_MacCod_Visible = -1 ;
      edtBarMarca_Visible = -1 ;
      chkBarAccesor.setVisible( -1 );
      edtBarOeko_Visible = -1 ;
      edtBarRcs_Visible = -1 ;
      edtBarOcs_Visible = -1 ;
      edtBarGrs_Visible = -1 ;
      edtBarGots_Visible = -1 ;
      edtBarRdto4_Visible = -1 ;
      edtBarKgm_Visible = -1 ;
      edtBarFecCli_Visible = -1 ;
      edtBarFecSal_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarNomCli_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtavBarenccli_Visible = -1 ;
      edtavTipartdsc_Visible = -1 ;
      edtBarTipArt_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfeccliauxdate_Jsonclick = "" ;
      edtavDdo_barfecsalauxdate_Jsonclick = "" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WebWlismerGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||||||||||||||S:WWP_TSChecked,N:WWP_TSUnChecked||||" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic||||Dynamic|Dynamic|Dynamic|Dynamic||||||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|FixedValues|Dynamic||Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T||||T|T|T|T||||||T|T|T|T|T|T|T||T|T" ;
      Ddo_grid_Filterisrange = "T|||T|||||||T|||T|T||||||||T||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric|||Character|Character|Character|Character|Numeric|Date|Date|Numeric|Numeric|Character|Character|Character|Character|Character||Character|Numeric|Character|Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|||T|T|T|T|T|T|T|T|T|T|T|T|T|T||T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T||T|||T|T|T|T|T|T|T||T||||||||||" ;
      Ddo_grid_Columnssortvalues = "1|2||3|||4|5|6|7|8|9|10||11||||||||||" ;
      Ddo_grid_Columnids = "1:CliCod|2:CliNom|3:BarNHdr|4:BarTipArt|5:TipArtDsc|6:BarEncCli|7:BarSer|8:BarSerDsc|9:BarColNom|10:BarNomCli|11:BarColNum|12:BarFecSal|13:BarFecCli|14:BarKgm|15:BarRdto4|16:BarGots|17:BarGrs|18:BarOcs|19:BarRcs|20:BarOeko|21:BarAccesorios|22:BarMarca|23:Bar_MacCod|24:BarFasCod2|25:BarFasDsc2" ;
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
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_93_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
      }
      GXCCtl = "BARACCESOR_" + sGXsfl_93_idx ;
      chkBarAccesor.setName( GXCCtl );
      chkBarAccesor.setWebtags( "" );
      chkBarAccesor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarAccesor.getInternalname(), "TitleCaption", chkBarAccesor.getCaption(), !bGXsfl_93_Refreshing);
      chkBarAccesor.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV78CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV79BarSer',fld:'vBARSER',pic:''},{av:'AV80BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV81BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV82BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV83BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV84BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV75BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV93FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV76BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV37TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV38TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV40TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV41TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV46TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV47TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV58TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV59TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV88TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV61TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV66TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV67TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV94TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV95TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV98TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV99TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV100TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV101TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV102TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV103TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV104TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV105TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV106TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV107TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV108TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV109TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV110TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV111TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV112TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV113TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV114TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV115TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV116TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV177Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtavTipartdsc_Visible',ctrl:'vTIPARTDSC',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarRdto4_Visible',ctrl:'BARRDTO4',prop:'Visible'},{av:'edtBarGots_Visible',ctrl:'BARGOTS',prop:'Visible'},{av:'edtBarGrs_Visible',ctrl:'BARGRS',prop:'Visible'},{av:'edtBarOcs_Visible',ctrl:'BAROCS',prop:'Visible'},{av:'edtBarRcs_Visible',ctrl:'BARRCS',prop:'Visible'},{av:'edtBarOeko_Visible',ctrl:'BAROEKO',prop:'Visible'},{av:'chkBarAccesor.getVisible()',ctrl:'BARACCESOR',prop:'Visible'},{av:'edtBarMarca_Visible',ctrl:'BARMARCA',prop:'Visible'},{av:'edtBar_MacCod_Visible',ctrl:'BAR_MACCOD',prop:'Visible'},{av:'edtBarFasCod2_Visible',ctrl:'BARFASCOD2',prop:'Visible'},{av:'edtBarFasDsc2_Visible',ctrl:'BARFASDSC2',prop:'Visible'},{av:'AV71GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12MU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV78CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV79BarSer',fld:'vBARSER',pic:''},{av:'AV80BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV81BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV82BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV83BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV84BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV75BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV93FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV76BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV37TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV38TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV40TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV41TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV46TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV47TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV58TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV59TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV88TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV61TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV66TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV67TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV94TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV95TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV98TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV99TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV100TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV101TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV102TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV103TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV104TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV105TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV106TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV107TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV108TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV109TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV110TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV111TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV112TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV113TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV114TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV115TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV116TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV177Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13MU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV78CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV79BarSer',fld:'vBARSER',pic:''},{av:'AV80BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV81BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV82BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV83BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV84BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV75BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV93FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV76BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV37TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV38TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV40TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV41TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV46TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV47TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV58TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV59TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV88TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV61TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV66TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV67TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV94TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV95TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV98TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV99TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV100TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV101TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV102TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV103TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV104TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV105TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV106TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV107TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV108TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV109TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV110TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV111TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV112TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV113TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV114TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV115TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV116TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV177Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e15MU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV78CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV79BarSer',fld:'vBARSER',pic:''},{av:'AV80BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV81BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV82BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV83BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV84BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV75BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV93FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV76BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV37TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV38TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV40TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV41TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV46TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV47TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV58TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV59TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV88TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV61TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV66TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV67TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV94TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV95TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV98TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV99TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV100TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV101TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV102TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV103TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV104TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV105TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV106TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV107TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV108TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV109TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV110TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV111TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV112TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV113TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV114TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV115TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV116TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV177Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV115TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV116TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV113TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV114TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV111TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV112TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV109TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV110TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV108TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV106TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV107TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV104TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV105TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV102TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV103TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV100TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV101TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV98TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV99TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV94TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV95TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV66TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV67TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV61TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV88TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV58TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV59TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV46TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV47TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV40TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV41TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV37TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV38TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21MU2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV96GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV92TipArtDsc',fld:'vTIPARTDSC',pic:''},{av:'AV15BarEncCli',fld:'vBARENCCLI',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e16MU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV78CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV79BarSer',fld:'vBARSER',pic:''},{av:'AV80BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV81BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV82BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV83BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV84BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV75BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV93FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV76BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV37TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV38TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV40TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV41TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV46TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV47TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV58TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV59TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV88TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV61TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV66TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV67TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV94TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV95TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV98TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV99TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV100TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV101TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV102TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV103TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV104TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV105TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV106TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV107TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV108TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV109TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV110TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV111TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV112TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV113TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV114TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV115TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV116TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV177Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtavTipartdsc_Visible',ctrl:'vTIPARTDSC',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarRdto4_Visible',ctrl:'BARRDTO4',prop:'Visible'},{av:'edtBarGots_Visible',ctrl:'BARGOTS',prop:'Visible'},{av:'edtBarGrs_Visible',ctrl:'BARGRS',prop:'Visible'},{av:'edtBarOcs_Visible',ctrl:'BAROCS',prop:'Visible'},{av:'edtBarRcs_Visible',ctrl:'BARRCS',prop:'Visible'},{av:'edtBarOeko_Visible',ctrl:'BAROEKO',prop:'Visible'},{av:'chkBarAccesor.getVisible()',ctrl:'BARACCESOR',prop:'Visible'},{av:'edtBarMarca_Visible',ctrl:'BARMARCA',prop:'Visible'},{av:'edtBar_MacCod_Visible',ctrl:'BAR_MACCOD',prop:'Visible'},{av:'edtBarFasCod2_Visible',ctrl:'BARFASCOD2',prop:'Visible'},{av:'edtBarFasDsc2_Visible',ctrl:'BARFASDSC2',prop:'Visible'},{av:'AV71GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11MU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV78CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV79BarSer',fld:'vBARSER',pic:''},{av:'AV80BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV81BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV82BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV83BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV84BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV75BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV93FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV76BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV37TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV38TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV40TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV41TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV46TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV47TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV58TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV59TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV88TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV61TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV66TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV67TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV94TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV95TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV98TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV99TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV100TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV101TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV102TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV103TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV104TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV105TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV106TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV107TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV108TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV109TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV110TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV111TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV112TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV113TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV114TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV115TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV116TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV177Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV93FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV75BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV76BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV77CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV78CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV79BarSer',fld:'vBARSER',pic:''},{av:'AV80BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV81BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV82BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV83BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV84BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV37TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV38TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV40TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV41TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV46TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV47TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV58TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV59TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV88TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV61TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV66TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV67TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV94TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV95TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV98TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV99TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV100TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV101TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV102TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV103TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV104TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV105TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV106TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV107TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV108TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV109TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV110TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV111TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV112TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV113TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV114TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV115TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV116TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtavTipartdsc_Visible',ctrl:'vTIPARTDSC',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarRdto4_Visible',ctrl:'BARRDTO4',prop:'Visible'},{av:'edtBarGots_Visible',ctrl:'BARGOTS',prop:'Visible'},{av:'edtBarGrs_Visible',ctrl:'BARGRS',prop:'Visible'},{av:'edtBarOcs_Visible',ctrl:'BAROCS',prop:'Visible'},{av:'edtBarRcs_Visible',ctrl:'BARRCS',prop:'Visible'},{av:'edtBarOeko_Visible',ctrl:'BAROEKO',prop:'Visible'},{av:'chkBarAccesor.getVisible()',ctrl:'BARACCESOR',prop:'Visible'},{av:'edtBarMarca_Visible',ctrl:'BARMARCA',prop:'Visible'},{av:'edtBar_MacCod_Visible',ctrl:'BAR_MACCOD',prop:'Visible'},{av:'edtBarFasCod2_Visible',ctrl:'BARFASCOD2',prop:'Visible'},{av:'edtBarFasDsc2_Visible',ctrl:'BARFASDSC2',prop:'Visible'},{av:'AV71GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e22MU2',iparms:[{av:'cmbavGridactions'},{av:'AV96GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV96GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17MU2',iparms:[{av:'AV177Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV38TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV47TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV99TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV101TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV103TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV105TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV107TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV108TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV110TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV114TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV116TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV37TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV46TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV58TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV61TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV66TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV94TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV98TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV100TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV102TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV104TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV106TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV109TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV111TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV113TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV115TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV41TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV59TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV67TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV95TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV112TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV77CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV78CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV79BarSer',fld:'vBARSER',pic:''},{av:'AV80BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV81BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV82BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV83BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV84BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV75BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV93FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV76BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV37TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV38TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV40TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV41TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV46TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV47TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV58TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV59TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV88TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV61TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV66TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV67TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV94TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV95TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV98TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV99TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV100TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV101TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV102TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV103TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV104TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV105TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV106TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV107TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV108TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV109TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV110TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV111TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV112TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV113TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV114TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV115TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV116TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV177Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e18MU2',iparms:[{av:'AV177Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV38TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV47TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV99TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV101TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV103TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV105TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV107TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV108TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV110TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV114TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV116TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV37TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV40TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV46TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV58TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV88TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV61TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV66TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV94TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV98TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV100TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV102TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV104TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV106TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV109TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV111TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV113TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV115TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV41TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV59TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV67TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV95TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV112TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV77CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV78CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV79BarSer',fld:'vBARSER',pic:''},{av:'AV80BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV81BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV82BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV83BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV84BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV75BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV93FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV76BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV37TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV38TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV40TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV41TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV46TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV47TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV58TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV59TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV88TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV61TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV66TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV67TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV94TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV95TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV98TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV99TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV100TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV101TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV102TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV103TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV104TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV105TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV106TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV107TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV108TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV109TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV110TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV111TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV112TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV113TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV114TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV115TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV116TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV177Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("BARFECSAL_RANGEPICKER.DATERANGECHANGED","{handler:'e14MU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV77CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV78CliCod_To',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV79BarSer',fld:'vBARSER',pic:''},{av:'AV80BarSer_To',fld:'vBARSER_TO',pic:''},{av:'AV81BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV82BarColNom_To',fld:'vBARCOLNOM_TO',pic:''},{av:'AV83BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV84BarColNum_To',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV75BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV93FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV76BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV31TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV32TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV37TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV38TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV40TFBarTipArt',fld:'vTFBARTIPART',pic:'ZZZ9'},{av:'AV41TFBarTipArt_To',fld:'vTFBARTIPART_TO',pic:'ZZZ9'},{av:'AV46TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV47TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV49TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV50TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV52TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV53TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV55TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV56TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV58TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV59TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV88TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV61TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV66TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV67TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV94TFBarRdto4',fld:'vTFBARRDTO4',pic:'ZZZ9'},{av:'AV95TFBarRdto4_To',fld:'vTFBARRDTO4_TO',pic:'ZZZ9'},{av:'AV98TFBarGots',fld:'vTFBARGOTS',pic:''},{av:'AV99TFBarGots_Sel',fld:'vTFBARGOTS_SEL',pic:''},{av:'AV100TFBarGrs',fld:'vTFBARGRS',pic:''},{av:'AV101TFBarGrs_Sel',fld:'vTFBARGRS_SEL',pic:''},{av:'AV102TFBarOcs',fld:'vTFBAROCS',pic:''},{av:'AV103TFBarOcs_Sel',fld:'vTFBAROCS_SEL',pic:''},{av:'AV104TFBarRcs',fld:'vTFBARRCS',pic:''},{av:'AV105TFBarRcs_Sel',fld:'vTFBARRCS_SEL',pic:''},{av:'AV106TFBarOeko',fld:'vTFBAROEKO',pic:''},{av:'AV107TFBarOeko_Sel',fld:'vTFBAROEKO_SEL',pic:''},{av:'AV108TFBarAccesorios_Sel',fld:'vTFBARACCESORIOS_SEL',pic:''},{av:'AV109TFBarMarca',fld:'vTFBARMARCA',pic:''},{av:'AV110TFBarMarca_Sel',fld:'vTFBARMARCA_SEL',pic:''},{av:'AV111TFBar_MacCod',fld:'vTFBAR_MACCOD',pic:'ZZZZZZZ9'},{av:'AV112TFBar_MacCod_To',fld:'vTFBAR_MACCOD_TO',pic:'ZZZZZZZ9'},{av:'AV113TFBarFasCod2',fld:'vTFBARFASCOD2',pic:''},{av:'AV114TFBarFasCod2_Sel',fld:'vTFBARFASCOD2_SEL',pic:''},{av:'AV115TFBarFasDsc2',fld:'vTFBARFASDSC2',pic:''},{av:'AV116TFBarFasDsc2_Sel',fld:'vTFBARFASDSC2_SEL',pic:''},{av:'AV177Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'sPrefix'}]");
      setEventMetadata("BARFECSAL_RANGEPICKER.DATERANGECHANGED",",oparms:[{av:'AV75BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV76BarFecSal_To',fld:'vBARFECSAL_TO',pic:''},{av:'AV29ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV24ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtBarTipArt_Visible',ctrl:'BARTIPART',prop:'Visible'},{av:'edtavTipartdsc_Visible',ctrl:'vTIPARTDSC',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarFecSal_Visible',ctrl:'BARFECSAL',prop:'Visible'},{av:'edtBarFecCli_Visible',ctrl:'BARFECCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarRdto4_Visible',ctrl:'BARRDTO4',prop:'Visible'},{av:'edtBarGots_Visible',ctrl:'BARGOTS',prop:'Visible'},{av:'edtBarGrs_Visible',ctrl:'BARGRS',prop:'Visible'},{av:'edtBarOcs_Visible',ctrl:'BAROCS',prop:'Visible'},{av:'edtBarRcs_Visible',ctrl:'BARRCS',prop:'Visible'},{av:'edtBarOeko_Visible',ctrl:'BAROEKO',prop:'Visible'},{av:'chkBarAccesor.getVisible()',ctrl:'BARACCESOR',prop:'Visible'},{av:'edtBarMarca_Visible',ctrl:'BARMARCA',prop:'Visible'},{av:'edtBar_MacCod_Visible',ctrl:'BAR_MACCOD',prop:'Visible'},{av:'edtBarFasCod2_Visible',ctrl:'BARFASCOD2',prop:'Visible'},{av:'edtBarFasDsc2_Visible',ctrl:'BARFASDSC2',prop:'Visible'},{av:'AV71GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV27ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_BARNHDR","{handler:'valid_Barnhdr',iparms:[]");
      setEventMetadata("VALID_BARNHDR",",oparms:[]}");
      setEventMetadata("VALID_BARTIPART","{handler:'valid_Bartipart',iparms:[]");
      setEventMetadata("VALID_BARTIPART",",oparms:[]}");
      setEventMetadata("VALID_BARSER","{handler:'valid_Barser',iparms:[]");
      setEventMetadata("VALID_BARSER",",oparms:[]}");
      setEventMetadata("VALID_BARSERDSC","{handler:'valid_Barserdsc',iparms:[]");
      setEventMetadata("VALID_BARSERDSC",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNOM","{handler:'valid_Barcolnom',iparms:[]");
      setEventMetadata("VALID_BARCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_BARNOMCLI","{handler:'valid_Barnomcli',iparms:[]");
      setEventMetadata("VALID_BARNOMCLI",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNUM","{handler:'valid_Barcolnum',iparms:[]");
      setEventMetadata("VALID_BARCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_BARKGM","{handler:'valid_Barkgm',iparms:[]");
      setEventMetadata("VALID_BARKGM",",oparms:[]}");
      setEventMetadata("VALID_BARRDTO4","{handler:'valid_Barrdto4',iparms:[]");
      setEventMetadata("VALID_BARRDTO4",",oparms:[]}");
      setEventMetadata("VALID_BARGOTS","{handler:'valid_Bargots',iparms:[]");
      setEventMetadata("VALID_BARGOTS",",oparms:[]}");
      setEventMetadata("VALID_BARGRS","{handler:'valid_Bargrs',iparms:[]");
      setEventMetadata("VALID_BARGRS",",oparms:[]}");
      setEventMetadata("VALID_BAROCS","{handler:'valid_Barocs',iparms:[]");
      setEventMetadata("VALID_BAROCS",",oparms:[]}");
      setEventMetadata("VALID_BARRCS","{handler:'valid_Barrcs',iparms:[]");
      setEventMetadata("VALID_BARRCS",",oparms:[]}");
      setEventMetadata("VALID_BAROEKO","{handler:'valid_Baroeko',iparms:[]");
      setEventMetadata("VALID_BAROEKO",",oparms:[]}");
      setEventMetadata("VALID_BARMARCA","{handler:'valid_Barmarca',iparms:[]");
      setEventMetadata("VALID_BARMARCA",",oparms:[]}");
      setEventMetadata("VALID_BAR_MACCOD","{handler:'valid_Bar_maccod',iparms:[]");
      setEventMetadata("VALID_BAR_MACCOD",",oparms:[]}");
      setEventMetadata("VALID_BARFASCOD2","{handler:'valid_Barfascod2',iparms:[]");
      setEventMetadata("VALID_BARFASCOD2",",oparms:[]}");
      setEventMetadata("VALID_BARFASDSC2","{handler:'valid_Barfasdsc2',iparms:[]");
      setEventMetadata("VALID_BARFASDSC2",",oparms:[]}");
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
      sPrefix = "" ;
      AV79BarSer = "" ;
      AV80BarSer_To = "" ;
      AV81BarColNom = "" ;
      AV82BarColNom_To = "" ;
      AV75BarFecSal = GXutil.nullDate() ;
      AV24ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV93FilterFullText = "" ;
      AV76BarFecSal_To = GXutil.nullDate() ;
      AV34TFCliNom = "" ;
      AV35TFCliNom_Sel = "" ;
      AV37TFBarNHdr = "" ;
      AV38TFBarNHdr_Sel = "" ;
      AV46TFBarSer = "" ;
      AV47TFBarSer_Sel = "" ;
      AV49TFBarSerDsc = "" ;
      AV50TFBarSerDsc_Sel = "" ;
      AV52TFBarColNom = "" ;
      AV53TFBarColNom_Sel = "" ;
      AV55TFBarNomCli = "" ;
      AV56TFBarNomCli_Sel = "" ;
      AV88TFBarFecSal = GXutil.nullDate() ;
      AV61TFBarFecCli = GXutil.nullDate() ;
      AV66TFBarKgm = DecimalUtil.ZERO ;
      AV67TFBarKgm_To = DecimalUtil.ZERO ;
      AV98TFBarGots = "" ;
      AV99TFBarGots_Sel = "" ;
      AV100TFBarGrs = "" ;
      AV101TFBarGrs_Sel = "" ;
      AV102TFBarOcs = "" ;
      AV103TFBarOcs_Sel = "" ;
      AV104TFBarRcs = "" ;
      AV105TFBarRcs_Sel = "" ;
      AV106TFBarOeko = "" ;
      AV107TFBarOeko_Sel = "" ;
      AV108TFBarAccesorios_Sel = "" ;
      AV109TFBarMarca = "" ;
      AV110TFBarMarca_Sel = "" ;
      AV113TFBarFasCod2 = "" ;
      AV114TFBarFasCod2_Sel = "" ;
      AV115TFBarFasDsc2 = "" ;
      AV116TFBarFasDsc2_Sel = "" ;
      AV177Pgmname = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV27ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV69DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
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
      ucBarfecsal_rangepicker = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV90DDO_BarFecSalAuxDate = GXutil.nullDate() ;
      AV63DDO_BarFecCliAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A13696BarNHdr = "" ;
      AV92TipArtDsc = "" ;
      AV15BarEncCli = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A13855BarGots = "" ;
      A13856BarGrs = "" ;
      A13857BarOcs = "" ;
      A13858BarRcs = "" ;
      A13859BarOeko = "" ;
      A13860BarAccesor = "" ;
      A13861BarMarca = "" ;
      A13863BarFasCod2 = "" ;
      A13864BarFasDsc2 = "" ;
      AV123Webwlismerds_1_filterfulltext = "" ;
      AV124Webwlismerds_2_barfecsal = GXutil.nullDate() ;
      AV125Webwlismerds_3_barfecsal_to = GXutil.nullDate() ;
      AV128Webwlismerds_6_barser = "" ;
      AV129Webwlismerds_7_barser_to = "" ;
      AV130Webwlismerds_8_barcolnom = "" ;
      AV131Webwlismerds_9_barcolnom_to = "" ;
      AV136Webwlismerds_14_tfclinom = "" ;
      AV137Webwlismerds_15_tfclinom_sel = "" ;
      AV138Webwlismerds_16_tfbarnhdr = "" ;
      AV139Webwlismerds_17_tfbarnhdr_sel = "" ;
      AV142Webwlismerds_20_tfbarser = "" ;
      AV143Webwlismerds_21_tfbarser_sel = "" ;
      AV144Webwlismerds_22_tfbarserdsc = "" ;
      AV145Webwlismerds_23_tfbarserdsc_sel = "" ;
      AV146Webwlismerds_24_tfbarcolnom = "" ;
      AV147Webwlismerds_25_tfbarcolnom_sel = "" ;
      AV148Webwlismerds_26_tfbarnomcli = "" ;
      AV149Webwlismerds_27_tfbarnomcli_sel = "" ;
      AV152Webwlismerds_30_tfbarfecsal = GXutil.nullDate() ;
      AV153Webwlismerds_31_tfbarfeccli = GXutil.nullDate() ;
      AV154Webwlismerds_32_tfbarkgm = DecimalUtil.ZERO ;
      AV155Webwlismerds_33_tfbarkgm_to = DecimalUtil.ZERO ;
      AV158Webwlismerds_36_tfbargots = "" ;
      AV159Webwlismerds_37_tfbargots_sel = "" ;
      AV160Webwlismerds_38_tfbargrs = "" ;
      AV161Webwlismerds_39_tfbargrs_sel = "" ;
      AV162Webwlismerds_40_tfbarocs = "" ;
      AV163Webwlismerds_41_tfbarocs_sel = "" ;
      AV164Webwlismerds_42_tfbarrcs = "" ;
      AV165Webwlismerds_43_tfbarrcs_sel = "" ;
      AV166Webwlismerds_44_tfbaroeko = "" ;
      AV167Webwlismerds_45_tfbaroeko_sel = "" ;
      AV168Webwlismerds_46_tfbaraccesorios_sel = "" ;
      AV169Webwlismerds_47_tfbarmarca = "" ;
      AV170Webwlismerds_48_tfbarmarca_sel = "" ;
      AV173Webwlismerds_51_tfbarfascod2 = "" ;
      AV174Webwlismerds_52_tfbarfascod2_sel = "" ;
      AV175Webwlismerds_53_tfbarfasdsc2 = "" ;
      AV176Webwlismerds_54_tfbarfasdsc2_sel = "" ;
      scmdbuf = "" ;
      lV169Webwlismerds_47_tfbarmarca = "" ;
      lV173Webwlismerds_51_tfbarfascod2 = "" ;
      lV136Webwlismerds_14_tfclinom = "" ;
      lV138Webwlismerds_16_tfbarnhdr = "" ;
      lV142Webwlismerds_20_tfbarser = "" ;
      lV144Webwlismerds_22_tfbarserdsc = "" ;
      lV146Webwlismerds_24_tfbarcolnom = "" ;
      lV148Webwlismerds_26_tfbarnomcli = "" ;
      H00MU8_A9713Tb1_Cod = new short[1] ;
      H00MU8_A4466BarAcaAnh = new short[1] ;
      H00MU8_A143BarDisNum = new String[] {""} ;
      H00MU8_A4812BarEncCli = new String[] {""} ;
      H00MU8_A13769BarRdto4 = new short[1] ;
      H00MU8_n13769BarRdto4 = new boolean[] {false} ;
      H00MU8_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H00MU8_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H00MU8_A136BarColNum = new int[1] ;
      H00MU8_A1234BarNomCli = new String[] {""} ;
      H00MU8_A135BarColNom = new String[] {""} ;
      H00MU8_A1652BarSerDsc = new String[] {""} ;
      H00MU8_A212BarSer = new String[] {""} ;
      H00MU8_A217BarTipArt = new short[1] ;
      H00MU8_n217BarTipArt = new boolean[] {false} ;
      H00MU8_A13696BarNHdr = new String[] {""} ;
      H00MU8_A279CliNom = new String[] {""} ;
      H00MU8_A252CliCod = new int[1] ;
      H00MU8_n252CliCod = new boolean[] {false} ;
      H00MU8_A13862Bar_MacCod = new int[1] ;
      H00MU8_n13862Bar_MacCod = new boolean[] {false} ;
      H00MU8_A13861BarMarca = new String[] {""} ;
      H00MU8_n13861BarMarca = new boolean[] {false} ;
      H00MU8_A13860BarAccesor = new String[] {""} ;
      H00MU8_n13860BarAccesor = new boolean[] {false} ;
      H00MU8_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MU8_n166BarKgm = new boolean[] {false} ;
      H00MU8_A129BarCod = new int[1] ;
      H00MU8_A132BarCodReo = new byte[1] ;
      H00MU8_A130BarCodPar = new String[] {""} ;
      H00MU8_A361DisCod = new int[1] ;
      H00MU8_A13863BarFasCod2 = new String[] {""} ;
      H00MU8_n13863BarFasCod2 = new boolean[] {false} ;
      H00MU8_A396EmprCod = new String[] {""} ;
      H00MU15_A9713Tb1_Cod = new short[1] ;
      H00MU15_A4466BarAcaAnh = new short[1] ;
      H00MU15_A143BarDisNum = new String[] {""} ;
      H00MU15_A4812BarEncCli = new String[] {""} ;
      H00MU15_A13769BarRdto4 = new short[1] ;
      H00MU15_n13769BarRdto4 = new boolean[] {false} ;
      H00MU15_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H00MU15_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H00MU15_A136BarColNum = new int[1] ;
      H00MU15_A1234BarNomCli = new String[] {""} ;
      H00MU15_A135BarColNom = new String[] {""} ;
      H00MU15_A1652BarSerDsc = new String[] {""} ;
      H00MU15_A212BarSer = new String[] {""} ;
      H00MU15_A217BarTipArt = new short[1] ;
      H00MU15_n217BarTipArt = new boolean[] {false} ;
      H00MU15_A13696BarNHdr = new String[] {""} ;
      H00MU15_A279CliNom = new String[] {""} ;
      H00MU15_A252CliCod = new int[1] ;
      H00MU15_n252CliCod = new boolean[] {false} ;
      H00MU15_A13862Bar_MacCod = new int[1] ;
      H00MU15_n13862Bar_MacCod = new boolean[] {false} ;
      H00MU15_A13861BarMarca = new String[] {""} ;
      H00MU15_n13861BarMarca = new boolean[] {false} ;
      H00MU15_A13860BarAccesor = new String[] {""} ;
      H00MU15_n13860BarAccesor = new boolean[] {false} ;
      H00MU15_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MU15_n166BarKgm = new boolean[] {false} ;
      H00MU15_A129BarCod = new int[1] ;
      H00MU15_A132BarCodReo = new byte[1] ;
      H00MU15_A130BarCodPar = new String[] {""} ;
      H00MU15_A361DisCod = new int[1] ;
      H00MU15_A13863BarFasCod2 = new String[] {""} ;
      H00MU15_n13863BarFasCod2 = new boolean[] {false} ;
      H00MU15_A396EmprCod = new String[] {""} ;
      AV97BarFecSal_RangeText = "" ;
      AV119Station = "" ;
      AV120Emprcod = "" ;
      AV121Emprnom = "" ;
      AV122Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV26Session = httpContext.getWebSession();
      AV22ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV28ManageFiltersXml = "" ;
      AV20ExcelFilename = "" ;
      AV21ErrorMessage = "" ;
      AV23UserCustomValue = "" ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char36 = "" ;
      GXv_char37 = new String[1] ;
      GXt_char34 = "" ;
      GXv_char35 = new String[1] ;
      GXt_char32 = "" ;
      GXv_char33 = new String[1] ;
      GXt_char30 = "" ;
      GXv_char31 = new String[1] ;
      GXt_char28 = "" ;
      GXv_char29 = new String[1] ;
      GXt_char26 = "" ;
      GXv_char27 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char25 = new String[1] ;
      GXt_char22 = "" ;
      GXv_char23 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState38 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      lblBarcolnum_rangemiddletext_Jsonclick = "" ;
      lblBarcolnom_rangemiddletext_Jsonclick = "" ;
      lblBarser_rangemiddletext_Jsonclick = "" ;
      lblClicod_rangemiddletext_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwlismer__default(),
         new Object[] {
             new Object[] {
            H00MU8_A9713Tb1_Cod, H00MU8_A4466BarAcaAnh, H00MU8_A143BarDisNum, H00MU8_A4812BarEncCli, H00MU8_A13769BarRdto4, H00MU8_n13769BarRdto4, H00MU8_A155BarFecCli, H00MU8_A161BarFecSal, H00MU8_A136BarColNum, H00MU8_A1234BarNomCli,
            H00MU8_A135BarColNom, H00MU8_A1652BarSerDsc, H00MU8_A212BarSer, H00MU8_A217BarTipArt, H00MU8_n217BarTipArt, H00MU8_A13696BarNHdr, H00MU8_A279CliNom, H00MU8_A252CliCod, H00MU8_n252CliCod, H00MU8_A13862Bar_MacCod,
            H00MU8_n13862Bar_MacCod, H00MU8_A13861BarMarca, H00MU8_n13861BarMarca, H00MU8_A13860BarAccesor, H00MU8_n13860BarAccesor, H00MU8_A166BarKgm, H00MU8_n166BarKgm, H00MU8_A129BarCod, H00MU8_A132BarCodReo, H00MU8_A130BarCodPar,
            H00MU8_A361DisCod, H00MU8_A13863BarFasCod2, H00MU8_n13863BarFasCod2, H00MU8_A396EmprCod
            }
            , new Object[] {
            H00MU15_A9713Tb1_Cod, H00MU15_A4466BarAcaAnh, H00MU15_A143BarDisNum, H00MU15_A4812BarEncCli, H00MU15_A13769BarRdto4, H00MU15_n13769BarRdto4, H00MU15_A155BarFecCli, H00MU15_A161BarFecSal, H00MU15_A136BarColNum, H00MU15_A1234BarNomCli,
            H00MU15_A135BarColNom, H00MU15_A1652BarSerDsc, H00MU15_A212BarSer, H00MU15_A217BarTipArt, H00MU15_n217BarTipArt, H00MU15_A13696BarNHdr, H00MU15_A279CliNom, H00MU15_A252CliCod, H00MU15_n252CliCod, H00MU15_A13862Bar_MacCod,
            H00MU15_n13862Bar_MacCod, H00MU15_A13861BarMarca, H00MU15_n13861BarMarca, H00MU15_A13860BarAccesor, H00MU15_n13860BarAccesor, H00MU15_A166BarKgm, H00MU15_n166BarKgm, H00MU15_A129BarCod, H00MU15_A132BarCodReo, H00MU15_A130BarCodPar,
            H00MU15_A361DisCod, H00MU15_A13863BarFasCod2, H00MU15_n13863BarFasCod2, H00MU15_A396EmprCod
            }
         }
      );
      AV177Pgmname = "WebWlismer" ;
      /* GeneXus formulas. */
      AV177Pgmname = "WebWlismer" ;
      Gx_err = (short)(0) ;
      edtavTipartdsc_Enabled = 0 ;
      edtavBarenccli_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV29ManageFiltersExecutionStep ;
   private byte A132BarCodReo ;
   private byte nDraw ;
   private byte nDoneStart ;
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
   private short AV40TFBarTipArt ;
   private short AV41TFBarTipArt_To ;
   private short AV94TFBarRdto4 ;
   private short AV95TFBarRdto4_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV96GridActions ;
   private short A217BarTipArt ;
   private short A13769BarRdto4 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV140Webwlismerds_18_tfbartipart ;
   private short AV141Webwlismerds_19_tfbartipart_to ;
   private short AV156Webwlismerds_34_tfbarrdto4 ;
   private short AV157Webwlismerds_35_tfbarrdto4_to ;
   private short A4466BarAcaAnh ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_93 ;
   private int nGXsfl_93_idx=1 ;
   private int AV77CliCod ;
   private int AV78CliCod_To ;
   private int AV83BarColNum ;
   private int AV84BarColNum_To ;
   private int AV31TFCliCod ;
   private int AV32TFCliCod_To ;
   private int AV58TFBarColNum ;
   private int AV59TFBarColNum_To ;
   private int AV111TFBar_MacCod ;
   private int AV112TFBar_MacCod_To ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A13862Bar_MacCod ;
   private int subGrid_Islastpage ;
   private int edtavTipartdsc_Enabled ;
   private int edtavBarenccli_Enabled ;
   private int AV126Webwlismerds_4_clicod ;
   private int AV127Webwlismerds_5_clicod_to ;
   private int AV132Webwlismerds_10_barcolnum ;
   private int AV133Webwlismerds_11_barcolnum_to ;
   private int AV134Webwlismerds_12_tfclicod ;
   private int AV135Webwlismerds_13_tfclicod_to ;
   private int AV150Webwlismerds_28_tfbarcolnum ;
   private int AV151Webwlismerds_29_tfbarcolnum_to ;
   private int AV171Webwlismerds_49_tfbar_maccod ;
   private int AV172Webwlismerds_50_tfbar_maccod_to ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtBarTipArt_Visible ;
   private int edtavTipartdsc_Visible ;
   private int edtavBarenccli_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarNomCli_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarFecSal_Visible ;
   private int edtBarFecCli_Visible ;
   private int edtBarKgm_Visible ;
   private int edtBarRdto4_Visible ;
   private int edtBarGots_Visible ;
   private int edtBarGrs_Visible ;
   private int edtBarOcs_Visible ;
   private int edtBarRcs_Visible ;
   private int edtBarOeko_Visible ;
   private int edtBarMarca_Visible ;
   private int edtBar_MacCod_Visible ;
   private int edtBarFasCod2_Visible ;
   private int edtBarFasDsc2_Visible ;
   private int AV70PageToGo ;
   private int AV178GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int edtavBarfecsal_rangetext_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBarcolnum_to_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnom_to_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarser_to_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClicod_to_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV71GridCurrentPage ;
   private long AV72GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV66TFBarKgm ;
   private java.math.BigDecimal AV67TFBarKgm_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV154Webwlismerds_32_tfbarkgm ;
   private java.math.BigDecimal AV155Webwlismerds_33_tfbarkgm_to ;
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
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sGXsfl_93_idx="0001" ;
   private String AV79BarSer ;
   private String AV80BarSer_To ;
   private String AV81BarColNom ;
   private String AV82BarColNom_To ;
   private String AV34TFCliNom ;
   private String AV35TFCliNom_Sel ;
   private String AV37TFBarNHdr ;
   private String AV38TFBarNHdr_Sel ;
   private String AV46TFBarSer ;
   private String AV47TFBarSer_Sel ;
   private String AV49TFBarSerDsc ;
   private String AV50TFBarSerDsc_Sel ;
   private String AV52TFBarColNom ;
   private String AV53TFBarColNom_Sel ;
   private String AV55TFBarNomCli ;
   private String AV56TFBarNomCli_Sel ;
   private String AV98TFBarGots ;
   private String AV99TFBarGots_Sel ;
   private String AV100TFBarGrs ;
   private String AV101TFBarGrs_Sel ;
   private String AV102TFBarOcs ;
   private String AV103TFBarOcs_Sel ;
   private String AV104TFBarRcs ;
   private String AV105TFBarRcs_Sel ;
   private String AV106TFBarOeko ;
   private String AV107TFBarOeko_Sel ;
   private String AV108TFBarAccesorios_Sel ;
   private String AV109TFBarMarca ;
   private String AV110TFBarMarca_Sel ;
   private String AV113TFBarFasCod2 ;
   private String AV114TFBarFasCod2_Sel ;
   private String AV115TFBarFasDsc2 ;
   private String AV116TFBarFasDsc2_Sel ;
   private String AV177Pgmname ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
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
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
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
   private String Barfecsal_rangepicker_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_barfecsalauxdates_Internalname ;
   private String edtavDdo_barfecsalauxdate_Internalname ;
   private String edtavDdo_barfecsalauxdate_Jsonclick ;
   private String divDdo_barfeccliauxdates_Internalname ;
   private String edtavDdo_barfeccliauxdate_Internalname ;
   private String edtavDdo_barfeccliauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String edtBarTipArt_Internalname ;
   private String AV92TipArtDsc ;
   private String edtavTipartdsc_Internalname ;
   private String AV15BarEncCli ;
   private String edtavBarenccli_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String edtBarColNum_Internalname ;
   private String edtBarFecSal_Internalname ;
   private String edtBarFecCli_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtBarRdto4_Internalname ;
   private String A13855BarGots ;
   private String edtBarGots_Internalname ;
   private String A13856BarGrs ;
   private String edtBarGrs_Internalname ;
   private String A13857BarOcs ;
   private String edtBarOcs_Internalname ;
   private String A13858BarRcs ;
   private String edtBarRcs_Internalname ;
   private String A13859BarOeko ;
   private String edtBarOeko_Internalname ;
   private String A13860BarAccesor ;
   private String A13861BarMarca ;
   private String edtBarMarca_Internalname ;
   private String edtBar_MacCod_Internalname ;
   private String A13863BarFasCod2 ;
   private String edtBarFasCod2_Internalname ;
   private String A13864BarFasDsc2 ;
   private String edtBarFasDsc2_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV128Webwlismerds_6_barser ;
   private String AV129Webwlismerds_7_barser_to ;
   private String AV130Webwlismerds_8_barcolnom ;
   private String AV131Webwlismerds_9_barcolnom_to ;
   private String AV136Webwlismerds_14_tfclinom ;
   private String AV137Webwlismerds_15_tfclinom_sel ;
   private String AV138Webwlismerds_16_tfbarnhdr ;
   private String AV139Webwlismerds_17_tfbarnhdr_sel ;
   private String AV142Webwlismerds_20_tfbarser ;
   private String AV143Webwlismerds_21_tfbarser_sel ;
   private String AV144Webwlismerds_22_tfbarserdsc ;
   private String AV145Webwlismerds_23_tfbarserdsc_sel ;
   private String AV146Webwlismerds_24_tfbarcolnom ;
   private String AV147Webwlismerds_25_tfbarcolnom_sel ;
   private String AV148Webwlismerds_26_tfbarnomcli ;
   private String AV149Webwlismerds_27_tfbarnomcli_sel ;
   private String AV158Webwlismerds_36_tfbargots ;
   private String AV159Webwlismerds_37_tfbargots_sel ;
   private String AV160Webwlismerds_38_tfbargrs ;
   private String AV161Webwlismerds_39_tfbargrs_sel ;
   private String AV162Webwlismerds_40_tfbarocs ;
   private String AV163Webwlismerds_41_tfbarocs_sel ;
   private String AV164Webwlismerds_42_tfbarrcs ;
   private String AV165Webwlismerds_43_tfbarrcs_sel ;
   private String AV166Webwlismerds_44_tfbaroeko ;
   private String AV167Webwlismerds_45_tfbaroeko_sel ;
   private String AV168Webwlismerds_46_tfbaraccesorios_sel ;
   private String AV169Webwlismerds_47_tfbarmarca ;
   private String AV170Webwlismerds_48_tfbarmarca_sel ;
   private String AV173Webwlismerds_51_tfbarfascod2 ;
   private String AV174Webwlismerds_52_tfbarfascod2_sel ;
   private String AV175Webwlismerds_53_tfbarfasdsc2 ;
   private String AV176Webwlismerds_54_tfbarfasdsc2_sel ;
   private String scmdbuf ;
   private String lV169Webwlismerds_47_tfbarmarca ;
   private String lV173Webwlismerds_51_tfbarfascod2 ;
   private String lV136Webwlismerds_14_tfclinom ;
   private String lV138Webwlismerds_16_tfbarnhdr ;
   private String lV142Webwlismerds_20_tfbarser ;
   private String lV144Webwlismerds_22_tfbarserdsc ;
   private String lV146Webwlismerds_24_tfbarcolnom ;
   private String lV148Webwlismerds_26_tfbarnomcli ;
   private String edtavBarfecsal_rangetext_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_to_Internalname ;
   private String edtavBarser_Internalname ;
   private String edtavBarser_to_Internalname ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnom_to_Internalname ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_to_Internalname ;
   private String AV119Station ;
   private String AV120Emprcod ;
   private String AV121Emprnom ;
   private String AV122Usurcod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char36 ;
   private String GXv_char37[] ;
   private String GXt_char34 ;
   private String GXv_char35[] ;
   private String GXt_char32 ;
   private String GXv_char33[] ;
   private String GXt_char30 ;
   private String GXv_char31[] ;
   private String GXt_char28 ;
   private String GXv_char29[] ;
   private String GXt_char26 ;
   private String GXv_char27[] ;
   private String GXt_char24 ;
   private String GXv_char25[] ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String edtavBarfecsal_rangetext_Jsonclick ;
   private String tblTablemergedbarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String lblBarcolnum_rangemiddletext_Internalname ;
   private String lblBarcolnum_rangemiddletext_Jsonclick ;
   private String edtavBarcolnum_to_Jsonclick ;
   private String tblTablemergedbarcolnom_Internalname ;
   private String edtavBarcolnom_Jsonclick ;
   private String lblBarcolnom_rangemiddletext_Internalname ;
   private String lblBarcolnom_rangemiddletext_Jsonclick ;
   private String edtavBarcolnom_to_Jsonclick ;
   private String tblTablemergedbarser_Internalname ;
   private String edtavBarser_Jsonclick ;
   private String lblBarser_rangemiddletext_Internalname ;
   private String lblBarser_rangemiddletext_Jsonclick ;
   private String edtavBarser_to_Jsonclick ;
   private String tblTablemergedclicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String lblClicod_rangemiddletext_Internalname ;
   private String lblClicod_rangemiddletext_Jsonclick ;
   private String edtavClicod_to_Jsonclick ;
   private String sGXsfl_93_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtBarTipArt_Jsonclick ;
   private String edtavTipartdsc_Jsonclick ;
   private String edtavBarenccli_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarFecSal_Jsonclick ;
   private String edtBarFecCli_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarRdto4_Jsonclick ;
   private String edtBarGots_Jsonclick ;
   private String edtBarGrs_Jsonclick ;
   private String edtBarOcs_Jsonclick ;
   private String edtBarRcs_Jsonclick ;
   private String edtBarOeko_Jsonclick ;
   private String edtBarMarca_Jsonclick ;
   private String edtBar_MacCod_Jsonclick ;
   private String edtBarFasCod2_Jsonclick ;
   private String edtBarFasDsc2_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV75BarFecSal ;
   private java.util.Date AV76BarFecSal_To ;
   private java.util.Date AV88TFBarFecSal ;
   private java.util.Date AV61TFBarFecCli ;
   private java.util.Date AV90DDO_BarFecSalAuxDate ;
   private java.util.Date AV63DDO_BarFecCliAuxDate ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date AV124Webwlismerds_2_barfecsal ;
   private java.util.Date AV125Webwlismerds_3_barfecsal_to ;
   private java.util.Date AV152Webwlismerds_30_tfbarfecsal ;
   private java.util.Date AV153Webwlismerds_31_tfbarfeccli ;
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
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n166BarKgm ;
   private boolean n13769BarRdto4 ;
   private boolean n13860BarAccesor ;
   private boolean n13861BarMarca ;
   private boolean n13862Bar_MacCod ;
   private boolean n13863BarFasCod2 ;
   private boolean bGXsfl_93_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV22ColumnsSelectorXML ;
   private String AV28ManageFiltersXml ;
   private String AV23UserCustomValue ;
   private String AV93FilterFullText ;
   private String AV123Webwlismerds_1_filterfulltext ;
   private String AV97BarFecSal_RangeText ;
   private String AV20ExcelFilename ;
   private String AV21ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV26Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucBarfecsal_rangepicker ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkBarAccesor ;
   private IDataStoreProvider pr_default ;
   private short[] H00MU8_A9713Tb1_Cod ;
   private short[] H00MU8_A4466BarAcaAnh ;
   private String[] H00MU8_A143BarDisNum ;
   private String[] H00MU8_A4812BarEncCli ;
   private short[] H00MU8_A13769BarRdto4 ;
   private boolean[] H00MU8_n13769BarRdto4 ;
   private java.util.Date[] H00MU8_A155BarFecCli ;
   private java.util.Date[] H00MU8_A161BarFecSal ;
   private int[] H00MU8_A136BarColNum ;
   private String[] H00MU8_A1234BarNomCli ;
   private String[] H00MU8_A135BarColNom ;
   private String[] H00MU8_A1652BarSerDsc ;
   private String[] H00MU8_A212BarSer ;
   private short[] H00MU8_A217BarTipArt ;
   private boolean[] H00MU8_n217BarTipArt ;
   private String[] H00MU8_A13696BarNHdr ;
   private String[] H00MU8_A279CliNom ;
   private int[] H00MU8_A252CliCod ;
   private boolean[] H00MU8_n252CliCod ;
   private int[] H00MU8_A13862Bar_MacCod ;
   private boolean[] H00MU8_n13862Bar_MacCod ;
   private String[] H00MU8_A13861BarMarca ;
   private boolean[] H00MU8_n13861BarMarca ;
   private String[] H00MU8_A13860BarAccesor ;
   private boolean[] H00MU8_n13860BarAccesor ;
   private java.math.BigDecimal[] H00MU8_A166BarKgm ;
   private boolean[] H00MU8_n166BarKgm ;
   private int[] H00MU8_A129BarCod ;
   private byte[] H00MU8_A132BarCodReo ;
   private String[] H00MU8_A130BarCodPar ;
   private int[] H00MU8_A361DisCod ;
   private String[] H00MU8_A13863BarFasCod2 ;
   private boolean[] H00MU8_n13863BarFasCod2 ;
   private String[] H00MU8_A396EmprCod ;
   private short[] H00MU15_A9713Tb1_Cod ;
   private short[] H00MU15_A4466BarAcaAnh ;
   private String[] H00MU15_A143BarDisNum ;
   private String[] H00MU15_A4812BarEncCli ;
   private short[] H00MU15_A13769BarRdto4 ;
   private boolean[] H00MU15_n13769BarRdto4 ;
   private java.util.Date[] H00MU15_A155BarFecCli ;
   private java.util.Date[] H00MU15_A161BarFecSal ;
   private int[] H00MU15_A136BarColNum ;
   private String[] H00MU15_A1234BarNomCli ;
   private String[] H00MU15_A135BarColNom ;
   private String[] H00MU15_A1652BarSerDsc ;
   private String[] H00MU15_A212BarSer ;
   private short[] H00MU15_A217BarTipArt ;
   private boolean[] H00MU15_n217BarTipArt ;
   private String[] H00MU15_A13696BarNHdr ;
   private String[] H00MU15_A279CliNom ;
   private int[] H00MU15_A252CliCod ;
   private boolean[] H00MU15_n252CliCod ;
   private int[] H00MU15_A13862Bar_MacCod ;
   private boolean[] H00MU15_n13862Bar_MacCod ;
   private String[] H00MU15_A13861BarMarca ;
   private boolean[] H00MU15_n13861BarMarca ;
   private String[] H00MU15_A13860BarAccesor ;
   private boolean[] H00MU15_n13860BarAccesor ;
   private java.math.BigDecimal[] H00MU15_A166BarKgm ;
   private boolean[] H00MU15_n166BarKgm ;
   private int[] H00MU15_A129BarCod ;
   private byte[] H00MU15_A132BarCodReo ;
   private String[] H00MU15_A130BarCodPar ;
   private int[] H00MU15_A361DisCod ;
   private String[] H00MU15_A13863BarFasCod2 ;
   private boolean[] H00MU15_n13863BarFasCod2 ;
   private String[] H00MU15_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV27ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState38[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV69DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class webwlismer__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00MU8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV124Webwlismerds_2_barfecsal ,
                                          java.util.Date AV125Webwlismerds_3_barfecsal_to ,
                                          int AV126Webwlismerds_4_clicod ,
                                          int AV127Webwlismerds_5_clicod_to ,
                                          String AV128Webwlismerds_6_barser ,
                                          String AV129Webwlismerds_7_barser_to ,
                                          String AV130Webwlismerds_8_barcolnom ,
                                          String AV131Webwlismerds_9_barcolnom_to ,
                                          int AV132Webwlismerds_10_barcolnum ,
                                          int AV133Webwlismerds_11_barcolnum_to ,
                                          int AV134Webwlismerds_12_tfclicod ,
                                          int AV135Webwlismerds_13_tfclicod_to ,
                                          String AV137Webwlismerds_15_tfclinom_sel ,
                                          String AV136Webwlismerds_14_tfclinom ,
                                          String AV139Webwlismerds_17_tfbarnhdr_sel ,
                                          String AV138Webwlismerds_16_tfbarnhdr ,
                                          short AV140Webwlismerds_18_tfbartipart ,
                                          short AV141Webwlismerds_19_tfbartipart_to ,
                                          String AV143Webwlismerds_21_tfbarser_sel ,
                                          String AV142Webwlismerds_20_tfbarser ,
                                          String AV145Webwlismerds_23_tfbarserdsc_sel ,
                                          String AV144Webwlismerds_22_tfbarserdsc ,
                                          String AV147Webwlismerds_25_tfbarcolnom_sel ,
                                          String AV146Webwlismerds_24_tfbarcolnom ,
                                          String AV149Webwlismerds_27_tfbarnomcli_sel ,
                                          String AV148Webwlismerds_26_tfbarnomcli ,
                                          int AV150Webwlismerds_28_tfbarcolnum ,
                                          int AV151Webwlismerds_29_tfbarcolnum_to ,
                                          java.util.Date AV152Webwlismerds_30_tfbarfecsal ,
                                          java.util.Date AV153Webwlismerds_31_tfbarfeccli ,
                                          java.math.BigDecimal AV154Webwlismerds_32_tfbarkgm ,
                                          java.math.BigDecimal AV155Webwlismerds_33_tfbarkgm_to ,
                                          short AV156Webwlismerds_34_tfbarrdto4 ,
                                          short AV157Webwlismerds_35_tfbarrdto4_to ,
                                          java.util.Date A161BarFecSal ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A217BarTipArt ,
                                          String A1652BarSerDsc ,
                                          String A1234BarNomCli ,
                                          java.util.Date A155BarFecCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          short A13769BarRdto4 ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV123Webwlismerds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13855BarGots ,
                                          String A13856BarGrs ,
                                          String A13857BarOcs ,
                                          String A13858BarRcs ,
                                          String A13859BarOeko ,
                                          String A13861BarMarca ,
                                          int A13862Bar_MacCod ,
                                          String A13863BarFasCod2 ,
                                          String A13864BarFasDsc2 ,
                                          String AV159Webwlismerds_37_tfbargots_sel ,
                                          String AV158Webwlismerds_36_tfbargots ,
                                          String AV161Webwlismerds_39_tfbargrs_sel ,
                                          String AV160Webwlismerds_38_tfbargrs ,
                                          String AV163Webwlismerds_41_tfbarocs_sel ,
                                          String AV162Webwlismerds_40_tfbarocs ,
                                          String AV165Webwlismerds_43_tfbarrcs_sel ,
                                          String AV164Webwlismerds_42_tfbarrcs ,
                                          String AV167Webwlismerds_45_tfbaroeko_sel ,
                                          String AV166Webwlismerds_44_tfbaroeko ,
                                          String AV168Webwlismerds_46_tfbaraccesorios_sel ,
                                          String A13860BarAccesor ,
                                          String AV170Webwlismerds_48_tfbarmarca_sel ,
                                          String AV169Webwlismerds_47_tfbarmarca ,
                                          int AV171Webwlismerds_49_tfbar_maccod ,
                                          int AV172Webwlismerds_50_tfbar_maccod_to ,
                                          String AV174Webwlismerds_52_tfbarfascod2_sel ,
                                          String AV173Webwlismerds_51_tfbarfascod2 ,
                                          String AV176Webwlismerds_54_tfbarfasdsc2_sel ,
                                          String AV175Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int39 = new byte[52];
      Object[] GXv_Object40 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T1.BarDisNum, T1.BarEncCli, T1.BarRdto4, T1.BarFecCli, T1.BarFecSal, T1.BarColNum, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer," ;
      scmdbuf += " T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom," ;
      scmdbuf += " T1.CliCod, COALESCE( T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm, 0)" ;
      scmdbuf += " AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T8.MacCod)" ;
      scmdbuf += " AS Bar_MacCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ? and T8.MacBarCod" ;
      scmdbuf += " = T9.BarCod and T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS" ;
      scmdbuf += " BarFasCod2, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " FROM TXPBARFAS WHERE BarFasEst = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo" ;
      scmdbuf += " AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod" ;
      scmdbuf += " = T1.BarAcaAnh) LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARCAD T8 LEFT JOIN (SELECT" ;
      scmdbuf += " MIN('S') AS GXC2, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and" ;
      scmdbuf += " T10.MacBarCod = T11.BarCod and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.BarCod" ;
      scmdbuf += " = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV124Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int39[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV125Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int39[19] = (byte)(1) ;
      }
      if ( ! (0==AV126Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int39[20] = (byte)(1) ;
      }
      if ( ! (0==AV127Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int39[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int39[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int39[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int39[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int39[25] = (byte)(1) ;
      }
      if ( ! (0==AV132Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int39[26] = (byte)(1) ;
      }
      if ( ! (0==AV133Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int39[27] = (byte)(1) ;
      }
      if ( ! (0==AV134Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int39[28] = (byte)(1) ;
      }
      if ( ! (0==AV135Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int39[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV136Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int39[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV138Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int39[33] = (byte)(1) ;
      }
      if ( ! (0==AV140Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int39[34] = (byte)(1) ;
      }
      if ( ! (0==AV141Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int39[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV142Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int39[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV144Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int39[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV146Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int39[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV148Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int39[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int39[43] = (byte)(1) ;
      }
      if ( ! (0==AV150Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int39[44] = (byte)(1) ;
      }
      if ( ! (0==AV151Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int39[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV152Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int39[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV153Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int39[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV154Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int39[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV155Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int39[49] = (byte)(1) ;
      }
      if ( ! (0==AV156Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int39[50] = (byte)(1) ;
      }
      if ( ! (0==AV157Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int39[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipArt" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipArt DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarRdto4" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarRdto4 DESC" ;
      }
      GXv_Object40[0] = scmdbuf ;
      GXv_Object40[1] = GXv_int39 ;
      return GXv_Object40 ;
   }

   protected Object[] conditional_H00MU15( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           java.util.Date AV124Webwlismerds_2_barfecsal ,
                                           java.util.Date AV125Webwlismerds_3_barfecsal_to ,
                                           int AV126Webwlismerds_4_clicod ,
                                           int AV127Webwlismerds_5_clicod_to ,
                                           String AV128Webwlismerds_6_barser ,
                                           String AV129Webwlismerds_7_barser_to ,
                                           String AV130Webwlismerds_8_barcolnom ,
                                           String AV131Webwlismerds_9_barcolnom_to ,
                                           int AV132Webwlismerds_10_barcolnum ,
                                           int AV133Webwlismerds_11_barcolnum_to ,
                                           int AV134Webwlismerds_12_tfclicod ,
                                           int AV135Webwlismerds_13_tfclicod_to ,
                                           String AV137Webwlismerds_15_tfclinom_sel ,
                                           String AV136Webwlismerds_14_tfclinom ,
                                           String AV139Webwlismerds_17_tfbarnhdr_sel ,
                                           String AV138Webwlismerds_16_tfbarnhdr ,
                                           short AV140Webwlismerds_18_tfbartipart ,
                                           short AV141Webwlismerds_19_tfbartipart_to ,
                                           String AV143Webwlismerds_21_tfbarser_sel ,
                                           String AV142Webwlismerds_20_tfbarser ,
                                           String AV145Webwlismerds_23_tfbarserdsc_sel ,
                                           String AV144Webwlismerds_22_tfbarserdsc ,
                                           String AV147Webwlismerds_25_tfbarcolnom_sel ,
                                           String AV146Webwlismerds_24_tfbarcolnom ,
                                           String AV149Webwlismerds_27_tfbarnomcli_sel ,
                                           String AV148Webwlismerds_26_tfbarnomcli ,
                                           int AV150Webwlismerds_28_tfbarcolnum ,
                                           int AV151Webwlismerds_29_tfbarcolnum_to ,
                                           java.util.Date AV152Webwlismerds_30_tfbarfecsal ,
                                           java.util.Date AV153Webwlismerds_31_tfbarfeccli ,
                                           java.math.BigDecimal AV154Webwlismerds_32_tfbarkgm ,
                                           java.math.BigDecimal AV155Webwlismerds_33_tfbarkgm_to ,
                                           short AV156Webwlismerds_34_tfbarrdto4 ,
                                           short AV157Webwlismerds_35_tfbarrdto4_to ,
                                           java.util.Date A161BarFecSal ,
                                           int A252CliCod ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A217BarTipArt ,
                                           String A1652BarSerDsc ,
                                           String A1234BarNomCli ,
                                           java.util.Date A155BarFecCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           short A13769BarRdto4 ,
                                           short AV12OrderedBy ,
                                           boolean AV13OrderedDsc ,
                                           String AV123Webwlismerds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13855BarGots ,
                                           String A13856BarGrs ,
                                           String A13857BarOcs ,
                                           String A13858BarRcs ,
                                           String A13859BarOeko ,
                                           String A13861BarMarca ,
                                           int A13862Bar_MacCod ,
                                           String A13863BarFasCod2 ,
                                           String A13864BarFasDsc2 ,
                                           String AV159Webwlismerds_37_tfbargots_sel ,
                                           String AV158Webwlismerds_36_tfbargots ,
                                           String AV161Webwlismerds_39_tfbargrs_sel ,
                                           String AV160Webwlismerds_38_tfbargrs ,
                                           String AV163Webwlismerds_41_tfbarocs_sel ,
                                           String AV162Webwlismerds_40_tfbarocs ,
                                           String AV165Webwlismerds_43_tfbarrcs_sel ,
                                           String AV164Webwlismerds_42_tfbarrcs ,
                                           String AV167Webwlismerds_45_tfbaroeko_sel ,
                                           String AV166Webwlismerds_44_tfbaroeko ,
                                           String AV168Webwlismerds_46_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV170Webwlismerds_48_tfbarmarca_sel ,
                                           String AV169Webwlismerds_47_tfbarmarca ,
                                           int AV171Webwlismerds_49_tfbar_maccod ,
                                           int AV172Webwlismerds_50_tfbar_maccod_to ,
                                           String AV174Webwlismerds_52_tfbarfascod2_sel ,
                                           String AV173Webwlismerds_51_tfbarfascod2 ,
                                           String AV176Webwlismerds_54_tfbarfasdsc2_sel ,
                                           String AV175Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int41 = new byte[52];
      Object[] GXv_Object42 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T1.BarDisNum, T1.BarEncCli, T1.BarRdto4, T1.BarFecCli, T1.BarFecSal, T1.BarColNum, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer," ;
      scmdbuf += " T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom," ;
      scmdbuf += " T1.CliCod, COALESCE( T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm, 0)" ;
      scmdbuf += " AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T8.MacCod)" ;
      scmdbuf += " AS Bar_MacCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ? and T8.MacBarCod" ;
      scmdbuf += " = T9.BarCod and T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS" ;
      scmdbuf += " BarFasCod2, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " FROM TXPBARFAS WHERE BarFasEst = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo" ;
      scmdbuf += " AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod" ;
      scmdbuf += " = T1.BarAcaAnh) LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARCAD T8 LEFT JOIN (SELECT" ;
      scmdbuf += " MIN('S') AS GXC2, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and" ;
      scmdbuf += " T10.MacBarCod = T11.BarCod and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T9 ON T9.BarCod" ;
      scmdbuf += " = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV124Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int41[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV125Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int41[19] = (byte)(1) ;
      }
      if ( ! (0==AV126Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int41[20] = (byte)(1) ;
      }
      if ( ! (0==AV127Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int41[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int41[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int41[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int41[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int41[25] = (byte)(1) ;
      }
      if ( ! (0==AV132Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int41[26] = (byte)(1) ;
      }
      if ( ! (0==AV133Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int41[27] = (byte)(1) ;
      }
      if ( ! (0==AV134Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int41[28] = (byte)(1) ;
      }
      if ( ! (0==AV135Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int41[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV136Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int41[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV138Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int41[33] = (byte)(1) ;
      }
      if ( ! (0==AV140Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int41[34] = (byte)(1) ;
      }
      if ( ! (0==AV141Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int41[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV142Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int41[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV144Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int41[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV146Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int41[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV148Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int41[43] = (byte)(1) ;
      }
      if ( ! (0==AV150Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int41[44] = (byte)(1) ;
      }
      if ( ! (0==AV151Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int41[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV152Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int41[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV153Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int41[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV154Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int41[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV155Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int41[49] = (byte)(1) ;
      }
      if ( ! (0==AV156Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int41[50] = (byte)(1) ;
      }
      if ( ! (0==AV157Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int41[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipArt" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipArt DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarRdto4" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarRdto4 DESC" ;
      }
      GXv_Object42[0] = scmdbuf ;
      GXv_Object42[1] = GXv_int41 ;
      return GXv_Object42 ;
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
                  return conditional_H00MU8(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).shortValue() , ((Boolean) dynConstraints[50]).booleanValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , ((Number) dynConstraints[77]).intValue() , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] );
            case 1 :
                  return conditional_H00MU15(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).shortValue() , ((Boolean) dynConstraints[50]).booleanValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , ((Number) dynConstraints[77]).intValue() , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00MU8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00MU15", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 11);
               ((String[]) buf[16])[0] = rslt.getString(15, 30);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(17);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(21);
               ((byte[]) buf[28])[0] = rslt.getByte(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 1);
               ((int[]) buf[30])[0] = rslt.getInt(24);
               ((String[]) buf[31])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(26, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 11);
               ((String[]) buf[16])[0] = rslt.getString(15, 30);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(17);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(21);
               ((byte[]) buf[28])[0] = rslt.getByte(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 1);
               ((int[]) buf[30])[0] = rslt.getInt(24);
               ((String[]) buf[31])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(26, 3);
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
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
      }
   }

}

