package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcpartesproduccionmaquina_impl extends GXWebComponent
{
   public wcpartesproduccionmaquina_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcpartesproduccionmaquina_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcpartesproduccionmaquina_impl.class ));
   }

   public wcpartesproduccionmaquina_impl( int remoteHandle ,
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
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
               AV21Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Emprcod", AV21Emprcod);
               AV50MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50MaqCod", AV50MaqCod);
               AV51MaqDsc = httpContext.GetPar( "MaqDsc") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51MaqDsc", AV51MaqDsc);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV21Emprcod,AV50MaqCod,AV51MaqDsc});
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
      nRC_GXsfl_70 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_70"))) ;
      nGXsfl_70_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_70_idx"))) ;
      sGXsfl_70_idx = httpContext.GetPar( "sGXsfl_70_idx") ;
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
      AV35HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
      A503GruOpeCod = (int)(GXutil.lval( httpContext.GetPar( "GruOpeCod"))) ;
      A13696BarNHdr = httpContext.GetPar( "BarNHdr") ;
      A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      A279CliNom = httpContext.GetPar( "CliNom") ;
      A212BarSer = httpContext.GetPar( "BarSer") ;
      A1652BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
      A135BarColNom = httpContext.GetPar( "BarColNom") ;
      A461Fase = httpContext.GetPar( "Fase") ;
      A7258FaseDsc = httpContext.GetPar( "FaseDsc") ;
      A1525HisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "HisProKgr"), ".") ;
      A1526HisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "HisProMtr"), ".") ;
      A566HisProTur = (byte)(GXutil.lval( httpContext.GetPar( "HisProTur"))) ;
      A5605HisProTr2 = (short)(GXutil.lval( httpContext.GetPar( "HisProTr2"))) ;
      AV48ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV11ColumnsSelector);
      AV21Emprcod = httpContext.GetPar( "Emprcod") ;
      AV50MaqCod = httpContext.GetPar( "MaqCod") ;
      AV51MaqDsc = httpContext.GetPar( "MaqDsc") ;
      AV103FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV36HisProFec_To = localUtil.parseDateParm( httpContext.GetPar( "HisProFec_To")) ;
      AV82TFHisProFec = localUtil.parseDateParm( httpContext.GetPar( "TFHisProFec")) ;
      AV76TFGruOpeCod = (int)(GXutil.lval( httpContext.GetPar( "TFGruOpeCod"))) ;
      AV77TFGruOpeCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFGruOpeCod_To"))) ;
      AV101TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV102TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV68TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV69TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV70TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV71TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV64TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV65TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV66TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV67TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV60TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV61TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV72TFFase = httpContext.GetPar( "TFFase") ;
      AV73TFFase_Sel = httpContext.GetPar( "TFFase_Sel") ;
      AV74TFFaseDsc = httpContext.GetPar( "TFFaseDsc") ;
      AV75TFFaseDsc_Sel = httpContext.GetPar( "TFFaseDsc_Sel") ;
      AV84TFHisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr"), ".") ;
      AV85TFHisProKgr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr_To"), ".") ;
      AV88TFHisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr"), ".") ;
      AV89TFHisProMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr_To"), ".") ;
      AV90TFHisProTur = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProTur"))) ;
      AV91TFHisProTur_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHisProTur_To"))) ;
      AV80TFHisProDTI = localUtil.parseDTimeParm( httpContext.GetPar( "TFHisProDTI")) ;
      AV78TFHisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "TFHisProDTF")) ;
      AV98TFHisProTr2 = (short)(GXutil.lval( httpContext.GetPar( "TFHisProTr2"))) ;
      AV99TFHisProTr2_To = (short)(GXutil.lval( httpContext.GetPar( "TFHisProTr2_To"))) ;
      AV146Pgmname = httpContext.GetPar( "Pgmname") ;
      AV55OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV57OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV111Wcpartesproduccionmaquinads_1_emprcod = httpContext.GetPar( "Wcpartesproduccionmaquinads_1_emprcod") ;
      AV112Wcpartesproduccionmaquinads_2_maqcod = httpContext.GetPar( "Wcpartesproduccionmaquinads_2_maqcod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV35HisProFec, A503GruOpeCod, A13696BarNHdr, A252CliCod, A279CliNom, A212BarSer, A1652BarSerDsc, A135BarColNom, A461Fase, A7258FaseDsc, A1525HisProKgr, A1526HisProMtr, A566HisProTur, A5605HisProTr2, AV48ManageFiltersExecutionStep, AV11ColumnsSelector, AV21Emprcod, AV50MaqCod, AV51MaqDsc, AV103FilterFullText, AV36HisProFec_To, AV82TFHisProFec, AV76TFGruOpeCod, AV77TFGruOpeCod_To, AV101TFBarNHdr, AV102TFBarNHdr_Sel, AV68TFCliCod, AV69TFCliCod_To, AV70TFCliNom, AV71TFCliNom_Sel, AV64TFBarSer, AV65TFBarSer_Sel, AV66TFBarSerDsc, AV67TFBarSerDsc_Sel, AV60TFBarColNom, AV61TFBarColNom_Sel, AV72TFFase, AV73TFFase_Sel, AV74TFFaseDsc, AV75TFFaseDsc_Sel, AV84TFHisProKgr, AV85TFHisProKgr_To, AV88TFHisProMtr, AV89TFHisProMtr_To, AV90TFHisProTur, AV91TFHisProTur_To, AV80TFHisProDTI, AV78TFHisProDTF, AV98TFHisProTr2, AV99TFHisProTr2_To, AV146Pgmname, AV55OrderedBy, AV57OrderedDsc, AV111Wcpartesproduccionmaquinads_1_emprcod, AV112Wcpartesproduccionmaquinads_2_maqcod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paIZ2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Partes Produccion Maquina", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcpartesproduccionmaquina", new String[] {GXutil.URLEncode(GXutil.rtrim(AV21Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV50MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV51MaqDsc))}, new String[] {"Emprcod","MaqCod","MaqDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV146Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vHISPROFEC", localUtil.format(AV35HisProFec, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_70", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_70, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV47ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV47ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV27GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV28GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC", localUtil.dtoc( AV35HisProFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC_TO", localUtil.dtoc( AV36HisProFec_To, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV20DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV20DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV11ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV11ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21Emprcod", GXutil.rtrim( wcpOAV21Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV50MaqCod", GXutil.rtrim( wcpOAV50MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV51MaqDsc", GXutil.rtrim( wcpOAV51MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV48ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV21Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROFEC", localUtil.dtoc( AV82TFHisProFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGRUOPECOD", GXutil.ltrim( localUtil.ntoc( AV76TFGruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFGRUOPECOD_TO", GXutil.ltrim( localUtil.ntoc( AV77TFGruOpeCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV101TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV102TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV68TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV69TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV70TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV71TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV64TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV65TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV66TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV67TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV60TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV61TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASE", GXutil.rtrim( AV72TFFase));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASE_SEL", GXutil.rtrim( AV73TFFase_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASEDSC", GXutil.rtrim( AV74TFFaseDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASEDSC_SEL", GXutil.rtrim( AV75TFFaseDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROKGR", GXutil.ltrim( localUtil.ntoc( AV84TFHisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROKGR_TO", GXutil.ltrim( localUtil.ntoc( AV85TFHisProKgr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROMTR", GXutil.ltrim( localUtil.ntoc( AV88TFHisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROMTR_TO", GXutil.ltrim( localUtil.ntoc( AV89TFHisProMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTUR", GXutil.ltrim( localUtil.ntoc( AV90TFHisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTUR_TO", GXutil.ltrim( localUtil.ntoc( AV91TFHisProTur_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRODTI", localUtil.ttoc( AV80TFHisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPRODTF", localUtil.ttoc( AV78TFHisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTR2", GXutil.ltrim( localUtil.ntoc( AV98TFHisProTr2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISPROTR2_TO", GXutil.ltrim( localUtil.ntoc( AV99TFHisProTr2_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV146Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV146Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV55OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV57OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV29GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV29GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWCPARTESPRODUCCIONMAQUINADS_1_EMPRCOD", GXutil.rtrim( AV111Wcpartesproduccionmaquinads_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vWCPARTESPRODUCCIONMAQUINADS_2_MAQCOD", GXutil.rtrim( AV112Wcpartesproduccionmaquinads_2_maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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

   public void renderHtmlCloseFormIZ2( )
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
      return "WCPartesProduccionMaquina" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Partes Produccion Maquina", "") ;
   }

   public void wbIZ0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcpartesproduccionmaquina");
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
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         wb_table1_11_IZ2( true) ;
      }
      else
      {
         wb_table1_11_IZ2( false) ;
      }
      return  ;
   }

   public void wb_table1_11_IZ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         wb_table2_35_IZ2( true) ;
      }
      else
      {
         wb_table2_35_IZ2( false) ;
      }
      return  ;
   }

   public void wb_table2_35_IZ2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         startgridcontrol70( ) ;
      }
      if ( wbEnd == 70 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_70 = (int)(nGXsfl_70_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV27GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV28GridPageCount);
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
         ucHisprofec_rangepicker.setProperty("Start Date", AV35HisProFec);
         ucHisprofec_rangepicker.setProperty("End Date", AV36HisProFec_To);
         ucHisprofec_rangepicker.render(context, "wwp.daterangepicker", Hisprofec_rangepicker_Internalname, sPrefix+"HISPROFEC_RANGEPICKERContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV20DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCPartesProduccionMaquina.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", edtMaqCod_Visible, 0, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCPartesProduccionMaquina.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDsc_Internalname, GXutil.rtrim( A606MaqDsc), GXutil.rtrim( localUtil.format( A606MaqDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtMaqDsc_Visible, 0, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCPartesProduccionMaquina.htm");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV20DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV11ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprofecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'" + sPrefix + "',false,'" + sGXsfl_70_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprofecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprofecauxdate_Internalname, localUtil.format(AV18DDO_HisProFecAuxDate, "99/99/99"), localUtil.format( AV18DDO_HisProFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,104);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprofecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCPartesProduccionMaquina.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprofecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCPartesProduccionMaquina.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodtiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'" + sPrefix + "',false,'" + sGXsfl_70_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodtiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodtiauxdate_Internalname, localUtil.format(AV16DDO_HisProDTIAuxDate, "99/99/99"), localUtil.format( AV16DDO_HisProDTIAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,106);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodtiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCPartesProduccionMaquina.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodtiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCPartesProduccionMaquina.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodtfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'" + sPrefix + "',false,'" + sGXsfl_70_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodtfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodtfauxdate_Internalname, localUtil.format(AV14DDO_HisProDTFAuxDate, "99/99/99"), localUtil.format( AV14DDO_HisProDTFAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,108);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodtfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCPartesProduccionMaquina.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodtfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCPartesProduccionMaquina.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 70 )
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

   public void startIZ2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Partes Produccion Maquina", ""), (short)(0)) ;
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
            strupIZ0( ) ;
         }
      }
   }

   public void wsIZ2( )
   {
      startIZ2( ) ;
      evtIZ2( ) ;
   }

   public void evtIZ2( )
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
                              strupIZ0( ) ;
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
                              strupIZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11IZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12IZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13IZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "HISPROFEC_RANGEPICKER.DATERANGECHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14IZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e15IZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e16IZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e17IZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIZ0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e18IZ2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupIZ0( ) ;
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
                              strupIZ0( ) ;
                           }
                           nGXsfl_70_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_702( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV104GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104GridActions), 4, 0));
                           A558HisProFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtHisProFec_Internalname), 0)) ;
                           A503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtGruOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV54OpeNom = httpContext.cgiGet( edtavOpenom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOpenom_Internalname, AV54OpeNom);
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A461Fase = httpContext.cgiGet( edtFase_Internalname) ;
                           A7258FaseDsc = httpContext.cgiGet( edtFaseDsc_Internalname) ;
                           A1525HisProKgr = localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)) ;
                           A1526HisProMtr = localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)) ;
                           A566HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4440HisProDTI = localUtil.ctot( httpContext.cgiGet( edtHisProDTI_Internalname), 0) ;
                           A4441HisProDTF = localUtil.ctot( httpContext.cgiGet( edtHisProDTF_Internalname), 0) ;
                           A5605HisProTr2 = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProTr2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV96Hm = httpContext.cgiGet( edtavHm_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHm_Internalname, AV96Hm);
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
                                       e19IZ2 ();
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
                                       e20IZ2 ();
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
                                       e21IZ2 ();
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
                                          /* Set Refresh If Hisprofec Changed */
                                          if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( sPrefix+"GXH_vHISPROFEC"), 0), AV35HisProFec) ) )
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
                                    strupIZ0( ) ;
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

   public void weIZ2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormIZ2( ) ;
         }
      }
   }

   public void paIZ2( )
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
      subsflControlProps_702( ) ;
      while ( nGXsfl_70_idx <= nRC_GXsfl_70 )
      {
         sendrow_702( ) ;
         nGXsfl_70_idx = ((subGrid_Islastpage==1)&&(nGXsfl_70_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_702( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 java.util.Date AV35HisProFec ,
                                 int A503GruOpeCod ,
                                 String A13696BarNHdr ,
                                 int A252CliCod ,
                                 String A279CliNom ,
                                 String A212BarSer ,
                                 String A1652BarSerDsc ,
                                 String A135BarColNom ,
                                 String A461Fase ,
                                 String A7258FaseDsc ,
                                 java.math.BigDecimal A1525HisProKgr ,
                                 java.math.BigDecimal A1526HisProMtr ,
                                 byte A566HisProTur ,
                                 short A5605HisProTr2 ,
                                 byte AV48ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV11ColumnsSelector ,
                                 String AV21Emprcod ,
                                 String AV50MaqCod ,
                                 String AV51MaqDsc ,
                                 String AV103FilterFullText ,
                                 java.util.Date AV36HisProFec_To ,
                                 java.util.Date AV82TFHisProFec ,
                                 int AV76TFGruOpeCod ,
                                 int AV77TFGruOpeCod_To ,
                                 String AV101TFBarNHdr ,
                                 String AV102TFBarNHdr_Sel ,
                                 int AV68TFCliCod ,
                                 int AV69TFCliCod_To ,
                                 String AV70TFCliNom ,
                                 String AV71TFCliNom_Sel ,
                                 String AV64TFBarSer ,
                                 String AV65TFBarSer_Sel ,
                                 String AV66TFBarSerDsc ,
                                 String AV67TFBarSerDsc_Sel ,
                                 String AV60TFBarColNom ,
                                 String AV61TFBarColNom_Sel ,
                                 String AV72TFFase ,
                                 String AV73TFFase_Sel ,
                                 String AV74TFFaseDsc ,
                                 String AV75TFFaseDsc_Sel ,
                                 java.math.BigDecimal AV84TFHisProKgr ,
                                 java.math.BigDecimal AV85TFHisProKgr_To ,
                                 java.math.BigDecimal AV88TFHisProMtr ,
                                 java.math.BigDecimal AV89TFHisProMtr_To ,
                                 byte AV90TFHisProTur ,
                                 byte AV91TFHisProTur_To ,
                                 java.util.Date AV80TFHisProDTI ,
                                 java.util.Date AV78TFHisProDTF ,
                                 short AV98TFHisProTr2 ,
                                 short AV99TFHisProTr2_To ,
                                 String AV146Pgmname ,
                                 short AV55OrderedBy ,
                                 boolean AV57OrderedDsc ,
                                 String AV111Wcpartesproduccionmaquinads_1_emprcod ,
                                 String AV112Wcpartesproduccionmaquinads_2_maqcod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e20IZ2 ();
      GRID_nCurrentRecord = 0 ;
      rfIZ2( ) ;
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
      rfIZ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV146Pgmname = "WCPartesProduccionMaquina" ;
      Gx_err = (short)(0) ;
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), true);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), true);
      edtavOpenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOpenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavHm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHm_Enabled), 5, 0), !bGXsfl_70_Refreshing);
   }

   public void rfIZ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(70) ;
      /* Execute user event: Refresh */
      e20IZ2 ();
      nGXsfl_70_idx = 1 ;
      sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_702( ) ;
      bGXsfl_70_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
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
         subsflControlProps_702( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV115Wcpartesproduccionmaquinads_5_hisprofec ,
                                              AV116Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                              AV117Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                              Integer.valueOf(AV118Wcpartesproduccionmaquinads_8_tfgruopecod) ,
                                              Integer.valueOf(AV119Wcpartesproduccionmaquinads_9_tfgruopecod_to) ,
                                              AV121Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                              AV120Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                              Integer.valueOf(AV122Wcpartesproduccionmaquinads_12_tfclicod) ,
                                              Integer.valueOf(AV123Wcpartesproduccionmaquinads_13_tfclicod_to) ,
                                              AV125Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                              AV124Wcpartesproduccionmaquinads_14_tfclinom ,
                                              AV127Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                              AV126Wcpartesproduccionmaquinads_16_tfbarser ,
                                              AV129Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                              AV128Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                              AV131Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                              AV130Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                              AV133Wcpartesproduccionmaquinads_23_tffase_sel ,
                                              AV132Wcpartesproduccionmaquinads_22_tffase ,
                                              AV136Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                              AV137Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                              AV138Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                              AV139Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                              Byte.valueOf(AV140Wcpartesproduccionmaquinads_30_tfhisprotur) ,
                                              Byte.valueOf(AV141Wcpartesproduccionmaquinads_31_tfhisprotur_to) ,
                                              AV142Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                              AV143Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                              Short.valueOf(AV144Wcpartesproduccionmaquinads_34_tfhisprotr2) ,
                                              Short.valueOf(AV145Wcpartesproduccionmaquinads_35_tfhisprotr2_to) ,
                                              A558HisProFec ,
                                              Integer.valueOf(A503GruOpeCod) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A135BarColNom ,
                                              A461Fase ,
                                              A1525HisProKgr ,
                                              A1526HisProMtr ,
                                              Byte.valueOf(A566HisProTur) ,
                                              A4440HisProDTI ,
                                              A4441HisProDTF ,
                                              Short.valueOf(AV55OrderedBy) ,
                                              Boolean.valueOf(AV57OrderedDsc) ,
                                              AV114Wcpartesproduccionmaquinads_4_filterfulltext ,
                                              A13696BarNHdr ,
                                              A7258FaseDsc ,
                                              Short.valueOf(A5605HisProTr2) ,
                                              AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                              AV134Wcpartesproduccionmaquinads_24_tffasedsc ,
                                              A606MaqDsc ,
                                              AV113Wcpartesproduccionmaquinads_3_maqdsc ,
                                              AV111Wcpartesproduccionmaquinads_1_emprcod ,
                                              AV112Wcpartesproduccionmaquinads_2_maqcod ,
                                              A396EmprCod ,
                                              A602MaqCod } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
         lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
         lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
         lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
         lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
         lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
         lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
         lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
         lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
         lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
         lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
         lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
         lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
         lV134Wcpartesproduccionmaquinads_24_tffasedsc = GXutil.padr( GXutil.rtrim( AV134Wcpartesproduccionmaquinads_24_tffasedsc), 28, "%") ;
         /* Using cursor H00IZ2 */
         pr_default.execute(0, new Object[] {AV111Wcpartesproduccionmaquinads_1_emprcod, AV112Wcpartesproduccionmaquinads_2_maqcod, AV114Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A503GruOpeCod), lV114Wcpartesproduccionmaquinads_4_filterfulltext, A13696BarNHdr, lV114Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A252CliCod), lV114Wcpartesproduccionmaquinads_4_filterfulltext, A279CliNom, lV114Wcpartesproduccionmaquinads_4_filterfulltext, A212BarSer, lV114Wcpartesproduccionmaquinads_4_filterfulltext, A1652BarSerDsc, lV114Wcpartesproduccionmaquinads_4_filterfulltext, A135BarColNom, lV114Wcpartesproduccionmaquinads_4_filterfulltext, A461Fase, lV114Wcpartesproduccionmaquinads_4_filterfulltext, A7258FaseDsc, lV114Wcpartesproduccionmaquinads_4_filterfulltext, A1525HisProKgr, lV114Wcpartesproduccionmaquinads_4_filterfulltext, A1526HisProMtr, lV114Wcpartesproduccionmaquinads_4_filterfulltext, Byte.valueOf(A566HisProTur), lV114Wcpartesproduccionmaquinads_4_filterfulltext, Short.valueOf(A5605HisProTr2), lV114Wcpartesproduccionmaquinads_4_filterfulltext, AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV134Wcpartesproduccionmaquinads_24_tffasedsc, A7258FaseDsc, lV134Wcpartesproduccionmaquinads_24_tffasedsc, AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel, A7258FaseDsc, AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV113Wcpartesproduccionmaquinads_3_maqdsc, AV115Wcpartesproduccionmaquinads_5_hisprofec, AV116Wcpartesproduccionmaquinads_6_hisprofec_to, AV117Wcpartesproduccionmaquinads_7_tfhisprofec, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_70_idx = 1 ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_702( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A602MaqCod = H00IZ2_A602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A602MaqCod", A602MaqCod);
            A606MaqDsc = H00IZ2_A606MaqDsc[0] ;
            n606MaqDsc = H00IZ2_n606MaqDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A606MaqDsc", A606MaqDsc);
            A558HisProFec = H00IZ2_A558HisProFec[0] ;
            A396EmprCod = H00IZ2_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A606MaqDsc = H00IZ2_A606MaqDsc[0] ;
            n606MaqDsc = H00IZ2_n606MaqDsc[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A606MaqDsc", A606MaqDsc);
            e21IZ2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(70) ;
         wbIZ0( ) ;
      }
      bGXsfl_70_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesIZ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV146Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV146Pgmname, ""))));
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
      AV111Wcpartesproduccionmaquinads_1_emprcod = AV21Emprcod ;
      AV112Wcpartesproduccionmaquinads_2_maqcod = AV50MaqCod ;
      AV113Wcpartesproduccionmaquinads_3_maqdsc = AV51MaqDsc ;
      AV114Wcpartesproduccionmaquinads_4_filterfulltext = AV103FilterFullText ;
      AV115Wcpartesproduccionmaquinads_5_hisprofec = AV35HisProFec ;
      AV116Wcpartesproduccionmaquinads_6_hisprofec_to = AV36HisProFec_To ;
      AV117Wcpartesproduccionmaquinads_7_tfhisprofec = AV82TFHisProFec ;
      AV118Wcpartesproduccionmaquinads_8_tfgruopecod = AV76TFGruOpeCod ;
      AV119Wcpartesproduccionmaquinads_9_tfgruopecod_to = AV77TFGruOpeCod_To ;
      AV120Wcpartesproduccionmaquinads_10_tfbarnhdr = AV101TFBarNHdr ;
      AV121Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = AV102TFBarNHdr_Sel ;
      AV122Wcpartesproduccionmaquinads_12_tfclicod = AV68TFCliCod ;
      AV123Wcpartesproduccionmaquinads_13_tfclicod_to = AV69TFCliCod_To ;
      AV124Wcpartesproduccionmaquinads_14_tfclinom = AV70TFCliNom ;
      AV125Wcpartesproduccionmaquinads_15_tfclinom_sel = AV71TFCliNom_Sel ;
      AV126Wcpartesproduccionmaquinads_16_tfbarser = AV64TFBarSer ;
      AV127Wcpartesproduccionmaquinads_17_tfbarser_sel = AV65TFBarSer_Sel ;
      AV128Wcpartesproduccionmaquinads_18_tfbarserdsc = AV66TFBarSerDsc ;
      AV129Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = AV67TFBarSerDsc_Sel ;
      AV130Wcpartesproduccionmaquinads_20_tfbarcolnom = AV60TFBarColNom ;
      AV131Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = AV61TFBarColNom_Sel ;
      AV132Wcpartesproduccionmaquinads_22_tffase = AV72TFFase ;
      AV133Wcpartesproduccionmaquinads_23_tffase_sel = AV73TFFase_Sel ;
      AV134Wcpartesproduccionmaquinads_24_tffasedsc = AV74TFFaseDsc ;
      AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel = AV75TFFaseDsc_Sel ;
      AV136Wcpartesproduccionmaquinads_26_tfhisprokgr = AV84TFHisProKgr ;
      AV137Wcpartesproduccionmaquinads_27_tfhisprokgr_to = AV85TFHisProKgr_To ;
      AV138Wcpartesproduccionmaquinads_28_tfhispromtr = AV88TFHisProMtr ;
      AV139Wcpartesproduccionmaquinads_29_tfhispromtr_to = AV89TFHisProMtr_To ;
      AV140Wcpartesproduccionmaquinads_30_tfhisprotur = AV90TFHisProTur ;
      AV141Wcpartesproduccionmaquinads_31_tfhisprotur_to = AV91TFHisProTur_To ;
      AV142Wcpartesproduccionmaquinads_32_tfhisprodti = AV80TFHisProDTI ;
      AV143Wcpartesproduccionmaquinads_33_tfhisprodtf = AV78TFHisProDTF ;
      AV144Wcpartesproduccionmaquinads_34_tfhisprotr2 = AV98TFHisProTr2 ;
      AV145Wcpartesproduccionmaquinads_35_tfhisprotr2_to = AV99TFHisProTr2_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV115Wcpartesproduccionmaquinads_5_hisprofec ,
                                           AV116Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                           AV117Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                           Integer.valueOf(AV118Wcpartesproduccionmaquinads_8_tfgruopecod) ,
                                           Integer.valueOf(AV119Wcpartesproduccionmaquinads_9_tfgruopecod_to) ,
                                           AV121Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                           AV120Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                           Integer.valueOf(AV122Wcpartesproduccionmaquinads_12_tfclicod) ,
                                           Integer.valueOf(AV123Wcpartesproduccionmaquinads_13_tfclicod_to) ,
                                           AV125Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                           AV124Wcpartesproduccionmaquinads_14_tfclinom ,
                                           AV127Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                           AV126Wcpartesproduccionmaquinads_16_tfbarser ,
                                           AV129Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                           AV128Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                           AV131Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                           AV130Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                           AV133Wcpartesproduccionmaquinads_23_tffase_sel ,
                                           AV132Wcpartesproduccionmaquinads_22_tffase ,
                                           AV136Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                           AV137Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                           AV138Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                           AV139Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                           Byte.valueOf(AV140Wcpartesproduccionmaquinads_30_tfhisprotur) ,
                                           Byte.valueOf(AV141Wcpartesproduccionmaquinads_31_tfhisprotur_to) ,
                                           AV142Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                           AV143Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                           Short.valueOf(AV144Wcpartesproduccionmaquinads_34_tfhisprotr2) ,
                                           Short.valueOf(AV145Wcpartesproduccionmaquinads_35_tfhisprotr2_to) ,
                                           A558HisProFec ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A461Fase ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           Short.valueOf(AV55OrderedBy) ,
                                           Boolean.valueOf(AV57OrderedDsc) ,
                                           AV114Wcpartesproduccionmaquinads_4_filterfulltext ,
                                           A13696BarNHdr ,
                                           A7258FaseDsc ,
                                           Short.valueOf(A5605HisProTr2) ,
                                           AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                           AV134Wcpartesproduccionmaquinads_24_tffasedsc ,
                                           A606MaqDsc ,
                                           AV113Wcpartesproduccionmaquinads_3_maqdsc ,
                                           AV111Wcpartesproduccionmaquinads_1_emprcod ,
                                           AV112Wcpartesproduccionmaquinads_2_maqcod ,
                                           A396EmprCod ,
                                           A602MaqCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV114Wcpartesproduccionmaquinads_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV114Wcpartesproduccionmaquinads_4_filterfulltext), "%", "") ;
      lV134Wcpartesproduccionmaquinads_24_tffasedsc = GXutil.padr( GXutil.rtrim( AV134Wcpartesproduccionmaquinads_24_tffasedsc), 28, "%") ;
      /* Using cursor H00IZ3 */
      pr_default.execute(1, new Object[] {AV111Wcpartesproduccionmaquinads_1_emprcod, AV112Wcpartesproduccionmaquinads_2_maqcod, AV114Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A503GruOpeCod), lV114Wcpartesproduccionmaquinads_4_filterfulltext, A13696BarNHdr, lV114Wcpartesproduccionmaquinads_4_filterfulltext, Integer.valueOf(A252CliCod), lV114Wcpartesproduccionmaquinads_4_filterfulltext, A279CliNom, lV114Wcpartesproduccionmaquinads_4_filterfulltext, A212BarSer, lV114Wcpartesproduccionmaquinads_4_filterfulltext, A1652BarSerDsc, lV114Wcpartesproduccionmaquinads_4_filterfulltext, A135BarColNom, lV114Wcpartesproduccionmaquinads_4_filterfulltext, A461Fase, lV114Wcpartesproduccionmaquinads_4_filterfulltext, A7258FaseDsc, lV114Wcpartesproduccionmaquinads_4_filterfulltext, A1525HisProKgr, lV114Wcpartesproduccionmaquinads_4_filterfulltext, A1526HisProMtr, lV114Wcpartesproduccionmaquinads_4_filterfulltext, Byte.valueOf(A566HisProTur), lV114Wcpartesproduccionmaquinads_4_filterfulltext, Short.valueOf(A5605HisProTr2), lV114Wcpartesproduccionmaquinads_4_filterfulltext, AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV134Wcpartesproduccionmaquinads_24_tffasedsc, A7258FaseDsc, lV134Wcpartesproduccionmaquinads_24_tffasedsc, AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel, A7258FaseDsc, AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel, AV113Wcpartesproduccionmaquinads_3_maqdsc, AV115Wcpartesproduccionmaquinads_5_hisprofec, AV116Wcpartesproduccionmaquinads_6_hisprofec_to, AV117Wcpartesproduccionmaquinads_7_tfhisprofec});
      GRID_nRecordCount = H00IZ3_AGRID_nRecordCount[0] ;
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
      AV111Wcpartesproduccionmaquinads_1_emprcod = AV21Emprcod ;
      AV112Wcpartesproduccionmaquinads_2_maqcod = AV50MaqCod ;
      AV113Wcpartesproduccionmaquinads_3_maqdsc = AV51MaqDsc ;
      AV114Wcpartesproduccionmaquinads_4_filterfulltext = AV103FilterFullText ;
      AV115Wcpartesproduccionmaquinads_5_hisprofec = AV35HisProFec ;
      AV116Wcpartesproduccionmaquinads_6_hisprofec_to = AV36HisProFec_To ;
      AV117Wcpartesproduccionmaquinads_7_tfhisprofec = AV82TFHisProFec ;
      AV118Wcpartesproduccionmaquinads_8_tfgruopecod = AV76TFGruOpeCod ;
      AV119Wcpartesproduccionmaquinads_9_tfgruopecod_to = AV77TFGruOpeCod_To ;
      AV120Wcpartesproduccionmaquinads_10_tfbarnhdr = AV101TFBarNHdr ;
      AV121Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = AV102TFBarNHdr_Sel ;
      AV122Wcpartesproduccionmaquinads_12_tfclicod = AV68TFCliCod ;
      AV123Wcpartesproduccionmaquinads_13_tfclicod_to = AV69TFCliCod_To ;
      AV124Wcpartesproduccionmaquinads_14_tfclinom = AV70TFCliNom ;
      AV125Wcpartesproduccionmaquinads_15_tfclinom_sel = AV71TFCliNom_Sel ;
      AV126Wcpartesproduccionmaquinads_16_tfbarser = AV64TFBarSer ;
      AV127Wcpartesproduccionmaquinads_17_tfbarser_sel = AV65TFBarSer_Sel ;
      AV128Wcpartesproduccionmaquinads_18_tfbarserdsc = AV66TFBarSerDsc ;
      AV129Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = AV67TFBarSerDsc_Sel ;
      AV130Wcpartesproduccionmaquinads_20_tfbarcolnom = AV60TFBarColNom ;
      AV131Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = AV61TFBarColNom_Sel ;
      AV132Wcpartesproduccionmaquinads_22_tffase = AV72TFFase ;
      AV133Wcpartesproduccionmaquinads_23_tffase_sel = AV73TFFase_Sel ;
      AV134Wcpartesproduccionmaquinads_24_tffasedsc = AV74TFFaseDsc ;
      AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel = AV75TFFaseDsc_Sel ;
      AV136Wcpartesproduccionmaquinads_26_tfhisprokgr = AV84TFHisProKgr ;
      AV137Wcpartesproduccionmaquinads_27_tfhisprokgr_to = AV85TFHisProKgr_To ;
      AV138Wcpartesproduccionmaquinads_28_tfhispromtr = AV88TFHisProMtr ;
      AV139Wcpartesproduccionmaquinads_29_tfhispromtr_to = AV89TFHisProMtr_To ;
      AV140Wcpartesproduccionmaquinads_30_tfhisprotur = AV90TFHisProTur ;
      AV141Wcpartesproduccionmaquinads_31_tfhisprotur_to = AV91TFHisProTur_To ;
      AV142Wcpartesproduccionmaquinads_32_tfhisprodti = AV80TFHisProDTI ;
      AV143Wcpartesproduccionmaquinads_33_tfhisprodtf = AV78TFHisProDTF ;
      AV144Wcpartesproduccionmaquinads_34_tfhisprotr2 = AV98TFHisProTr2 ;
      AV145Wcpartesproduccionmaquinads_35_tfhisprotr2_to = AV99TFHisProTr2_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV35HisProFec, A503GruOpeCod, A13696BarNHdr, A252CliCod, A279CliNom, A212BarSer, A1652BarSerDsc, A135BarColNom, A461Fase, A7258FaseDsc, A1525HisProKgr, A1526HisProMtr, A566HisProTur, A5605HisProTr2, AV48ManageFiltersExecutionStep, AV11ColumnsSelector, AV21Emprcod, AV50MaqCod, AV51MaqDsc, AV103FilterFullText, AV36HisProFec_To, AV82TFHisProFec, AV76TFGruOpeCod, AV77TFGruOpeCod_To, AV101TFBarNHdr, AV102TFBarNHdr_Sel, AV68TFCliCod, AV69TFCliCod_To, AV70TFCliNom, AV71TFCliNom_Sel, AV64TFBarSer, AV65TFBarSer_Sel, AV66TFBarSerDsc, AV67TFBarSerDsc_Sel, AV60TFBarColNom, AV61TFBarColNom_Sel, AV72TFFase, AV73TFFase_Sel, AV74TFFaseDsc, AV75TFFaseDsc_Sel, AV84TFHisProKgr, AV85TFHisProKgr_To, AV88TFHisProMtr, AV89TFHisProMtr_To, AV90TFHisProTur, AV91TFHisProTur_To, AV80TFHisProDTI, AV78TFHisProDTF, AV98TFHisProTr2, AV99TFHisProTr2_To, AV146Pgmname, AV55OrderedBy, AV57OrderedDsc, AV111Wcpartesproduccionmaquinads_1_emprcod, AV112Wcpartesproduccionmaquinads_2_maqcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV111Wcpartesproduccionmaquinads_1_emprcod = AV21Emprcod ;
      AV112Wcpartesproduccionmaquinads_2_maqcod = AV50MaqCod ;
      AV113Wcpartesproduccionmaquinads_3_maqdsc = AV51MaqDsc ;
      AV114Wcpartesproduccionmaquinads_4_filterfulltext = AV103FilterFullText ;
      AV115Wcpartesproduccionmaquinads_5_hisprofec = AV35HisProFec ;
      AV116Wcpartesproduccionmaquinads_6_hisprofec_to = AV36HisProFec_To ;
      AV117Wcpartesproduccionmaquinads_7_tfhisprofec = AV82TFHisProFec ;
      AV118Wcpartesproduccionmaquinads_8_tfgruopecod = AV76TFGruOpeCod ;
      AV119Wcpartesproduccionmaquinads_9_tfgruopecod_to = AV77TFGruOpeCod_To ;
      AV120Wcpartesproduccionmaquinads_10_tfbarnhdr = AV101TFBarNHdr ;
      AV121Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = AV102TFBarNHdr_Sel ;
      AV122Wcpartesproduccionmaquinads_12_tfclicod = AV68TFCliCod ;
      AV123Wcpartesproduccionmaquinads_13_tfclicod_to = AV69TFCliCod_To ;
      AV124Wcpartesproduccionmaquinads_14_tfclinom = AV70TFCliNom ;
      AV125Wcpartesproduccionmaquinads_15_tfclinom_sel = AV71TFCliNom_Sel ;
      AV126Wcpartesproduccionmaquinads_16_tfbarser = AV64TFBarSer ;
      AV127Wcpartesproduccionmaquinads_17_tfbarser_sel = AV65TFBarSer_Sel ;
      AV128Wcpartesproduccionmaquinads_18_tfbarserdsc = AV66TFBarSerDsc ;
      AV129Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = AV67TFBarSerDsc_Sel ;
      AV130Wcpartesproduccionmaquinads_20_tfbarcolnom = AV60TFBarColNom ;
      AV131Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = AV61TFBarColNom_Sel ;
      AV132Wcpartesproduccionmaquinads_22_tffase = AV72TFFase ;
      AV133Wcpartesproduccionmaquinads_23_tffase_sel = AV73TFFase_Sel ;
      AV134Wcpartesproduccionmaquinads_24_tffasedsc = AV74TFFaseDsc ;
      AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel = AV75TFFaseDsc_Sel ;
      AV136Wcpartesproduccionmaquinads_26_tfhisprokgr = AV84TFHisProKgr ;
      AV137Wcpartesproduccionmaquinads_27_tfhisprokgr_to = AV85TFHisProKgr_To ;
      AV138Wcpartesproduccionmaquinads_28_tfhispromtr = AV88TFHisProMtr ;
      AV139Wcpartesproduccionmaquinads_29_tfhispromtr_to = AV89TFHisProMtr_To ;
      AV140Wcpartesproduccionmaquinads_30_tfhisprotur = AV90TFHisProTur ;
      AV141Wcpartesproduccionmaquinads_31_tfhisprotur_to = AV91TFHisProTur_To ;
      AV142Wcpartesproduccionmaquinads_32_tfhisprodti = AV80TFHisProDTI ;
      AV143Wcpartesproduccionmaquinads_33_tfhisprodtf = AV78TFHisProDTF ;
      AV144Wcpartesproduccionmaquinads_34_tfhisprotr2 = AV98TFHisProTr2 ;
      AV145Wcpartesproduccionmaquinads_35_tfhisprotr2_to = AV99TFHisProTr2_To ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV35HisProFec, A503GruOpeCod, A13696BarNHdr, A252CliCod, A279CliNom, A212BarSer, A1652BarSerDsc, A135BarColNom, A461Fase, A7258FaseDsc, A1525HisProKgr, A1526HisProMtr, A566HisProTur, A5605HisProTr2, AV48ManageFiltersExecutionStep, AV11ColumnsSelector, AV21Emprcod, AV50MaqCod, AV51MaqDsc, AV103FilterFullText, AV36HisProFec_To, AV82TFHisProFec, AV76TFGruOpeCod, AV77TFGruOpeCod_To, AV101TFBarNHdr, AV102TFBarNHdr_Sel, AV68TFCliCod, AV69TFCliCod_To, AV70TFCliNom, AV71TFCliNom_Sel, AV64TFBarSer, AV65TFBarSer_Sel, AV66TFBarSerDsc, AV67TFBarSerDsc_Sel, AV60TFBarColNom, AV61TFBarColNom_Sel, AV72TFFase, AV73TFFase_Sel, AV74TFFaseDsc, AV75TFFaseDsc_Sel, AV84TFHisProKgr, AV85TFHisProKgr_To, AV88TFHisProMtr, AV89TFHisProMtr_To, AV90TFHisProTur, AV91TFHisProTur_To, AV80TFHisProDTI, AV78TFHisProDTF, AV98TFHisProTr2, AV99TFHisProTr2_To, AV146Pgmname, AV55OrderedBy, AV57OrderedDsc, AV111Wcpartesproduccionmaquinads_1_emprcod, AV112Wcpartesproduccionmaquinads_2_maqcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV111Wcpartesproduccionmaquinads_1_emprcod = AV21Emprcod ;
      AV112Wcpartesproduccionmaquinads_2_maqcod = AV50MaqCod ;
      AV113Wcpartesproduccionmaquinads_3_maqdsc = AV51MaqDsc ;
      AV114Wcpartesproduccionmaquinads_4_filterfulltext = AV103FilterFullText ;
      AV115Wcpartesproduccionmaquinads_5_hisprofec = AV35HisProFec ;
      AV116Wcpartesproduccionmaquinads_6_hisprofec_to = AV36HisProFec_To ;
      AV117Wcpartesproduccionmaquinads_7_tfhisprofec = AV82TFHisProFec ;
      AV118Wcpartesproduccionmaquinads_8_tfgruopecod = AV76TFGruOpeCod ;
      AV119Wcpartesproduccionmaquinads_9_tfgruopecod_to = AV77TFGruOpeCod_To ;
      AV120Wcpartesproduccionmaquinads_10_tfbarnhdr = AV101TFBarNHdr ;
      AV121Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = AV102TFBarNHdr_Sel ;
      AV122Wcpartesproduccionmaquinads_12_tfclicod = AV68TFCliCod ;
      AV123Wcpartesproduccionmaquinads_13_tfclicod_to = AV69TFCliCod_To ;
      AV124Wcpartesproduccionmaquinads_14_tfclinom = AV70TFCliNom ;
      AV125Wcpartesproduccionmaquinads_15_tfclinom_sel = AV71TFCliNom_Sel ;
      AV126Wcpartesproduccionmaquinads_16_tfbarser = AV64TFBarSer ;
      AV127Wcpartesproduccionmaquinads_17_tfbarser_sel = AV65TFBarSer_Sel ;
      AV128Wcpartesproduccionmaquinads_18_tfbarserdsc = AV66TFBarSerDsc ;
      AV129Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = AV67TFBarSerDsc_Sel ;
      AV130Wcpartesproduccionmaquinads_20_tfbarcolnom = AV60TFBarColNom ;
      AV131Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = AV61TFBarColNom_Sel ;
      AV132Wcpartesproduccionmaquinads_22_tffase = AV72TFFase ;
      AV133Wcpartesproduccionmaquinads_23_tffase_sel = AV73TFFase_Sel ;
      AV134Wcpartesproduccionmaquinads_24_tffasedsc = AV74TFFaseDsc ;
      AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel = AV75TFFaseDsc_Sel ;
      AV136Wcpartesproduccionmaquinads_26_tfhisprokgr = AV84TFHisProKgr ;
      AV137Wcpartesproduccionmaquinads_27_tfhisprokgr_to = AV85TFHisProKgr_To ;
      AV138Wcpartesproduccionmaquinads_28_tfhispromtr = AV88TFHisProMtr ;
      AV139Wcpartesproduccionmaquinads_29_tfhispromtr_to = AV89TFHisProMtr_To ;
      AV140Wcpartesproduccionmaquinads_30_tfhisprotur = AV90TFHisProTur ;
      AV141Wcpartesproduccionmaquinads_31_tfhisprotur_to = AV91TFHisProTur_To ;
      AV142Wcpartesproduccionmaquinads_32_tfhisprodti = AV80TFHisProDTI ;
      AV143Wcpartesproduccionmaquinads_33_tfhisprodtf = AV78TFHisProDTF ;
      AV144Wcpartesproduccionmaquinads_34_tfhisprotr2 = AV98TFHisProTr2 ;
      AV145Wcpartesproduccionmaquinads_35_tfhisprotr2_to = AV99TFHisProTr2_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV35HisProFec, A503GruOpeCod, A13696BarNHdr, A252CliCod, A279CliNom, A212BarSer, A1652BarSerDsc, A135BarColNom, A461Fase, A7258FaseDsc, A1525HisProKgr, A1526HisProMtr, A566HisProTur, A5605HisProTr2, AV48ManageFiltersExecutionStep, AV11ColumnsSelector, AV21Emprcod, AV50MaqCod, AV51MaqDsc, AV103FilterFullText, AV36HisProFec_To, AV82TFHisProFec, AV76TFGruOpeCod, AV77TFGruOpeCod_To, AV101TFBarNHdr, AV102TFBarNHdr_Sel, AV68TFCliCod, AV69TFCliCod_To, AV70TFCliNom, AV71TFCliNom_Sel, AV64TFBarSer, AV65TFBarSer_Sel, AV66TFBarSerDsc, AV67TFBarSerDsc_Sel, AV60TFBarColNom, AV61TFBarColNom_Sel, AV72TFFase, AV73TFFase_Sel, AV74TFFaseDsc, AV75TFFaseDsc_Sel, AV84TFHisProKgr, AV85TFHisProKgr_To, AV88TFHisProMtr, AV89TFHisProMtr_To, AV90TFHisProTur, AV91TFHisProTur_To, AV80TFHisProDTI, AV78TFHisProDTF, AV98TFHisProTr2, AV99TFHisProTr2_To, AV146Pgmname, AV55OrderedBy, AV57OrderedDsc, AV111Wcpartesproduccionmaquinads_1_emprcod, AV112Wcpartesproduccionmaquinads_2_maqcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV111Wcpartesproduccionmaquinads_1_emprcod = AV21Emprcod ;
      AV112Wcpartesproduccionmaquinads_2_maqcod = AV50MaqCod ;
      AV113Wcpartesproduccionmaquinads_3_maqdsc = AV51MaqDsc ;
      AV114Wcpartesproduccionmaquinads_4_filterfulltext = AV103FilterFullText ;
      AV115Wcpartesproduccionmaquinads_5_hisprofec = AV35HisProFec ;
      AV116Wcpartesproduccionmaquinads_6_hisprofec_to = AV36HisProFec_To ;
      AV117Wcpartesproduccionmaquinads_7_tfhisprofec = AV82TFHisProFec ;
      AV118Wcpartesproduccionmaquinads_8_tfgruopecod = AV76TFGruOpeCod ;
      AV119Wcpartesproduccionmaquinads_9_tfgruopecod_to = AV77TFGruOpeCod_To ;
      AV120Wcpartesproduccionmaquinads_10_tfbarnhdr = AV101TFBarNHdr ;
      AV121Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = AV102TFBarNHdr_Sel ;
      AV122Wcpartesproduccionmaquinads_12_tfclicod = AV68TFCliCod ;
      AV123Wcpartesproduccionmaquinads_13_tfclicod_to = AV69TFCliCod_To ;
      AV124Wcpartesproduccionmaquinads_14_tfclinom = AV70TFCliNom ;
      AV125Wcpartesproduccionmaquinads_15_tfclinom_sel = AV71TFCliNom_Sel ;
      AV126Wcpartesproduccionmaquinads_16_tfbarser = AV64TFBarSer ;
      AV127Wcpartesproduccionmaquinads_17_tfbarser_sel = AV65TFBarSer_Sel ;
      AV128Wcpartesproduccionmaquinads_18_tfbarserdsc = AV66TFBarSerDsc ;
      AV129Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = AV67TFBarSerDsc_Sel ;
      AV130Wcpartesproduccionmaquinads_20_tfbarcolnom = AV60TFBarColNom ;
      AV131Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = AV61TFBarColNom_Sel ;
      AV132Wcpartesproduccionmaquinads_22_tffase = AV72TFFase ;
      AV133Wcpartesproduccionmaquinads_23_tffase_sel = AV73TFFase_Sel ;
      AV134Wcpartesproduccionmaquinads_24_tffasedsc = AV74TFFaseDsc ;
      AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel = AV75TFFaseDsc_Sel ;
      AV136Wcpartesproduccionmaquinads_26_tfhisprokgr = AV84TFHisProKgr ;
      AV137Wcpartesproduccionmaquinads_27_tfhisprokgr_to = AV85TFHisProKgr_To ;
      AV138Wcpartesproduccionmaquinads_28_tfhispromtr = AV88TFHisProMtr ;
      AV139Wcpartesproduccionmaquinads_29_tfhispromtr_to = AV89TFHisProMtr_To ;
      AV140Wcpartesproduccionmaquinads_30_tfhisprotur = AV90TFHisProTur ;
      AV141Wcpartesproduccionmaquinads_31_tfhisprotur_to = AV91TFHisProTur_To ;
      AV142Wcpartesproduccionmaquinads_32_tfhisprodti = AV80TFHisProDTI ;
      AV143Wcpartesproduccionmaquinads_33_tfhisprodtf = AV78TFHisProDTF ;
      AV144Wcpartesproduccionmaquinads_34_tfhisprotr2 = AV98TFHisProTr2 ;
      AV145Wcpartesproduccionmaquinads_35_tfhisprotr2_to = AV99TFHisProTr2_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV35HisProFec, A503GruOpeCod, A13696BarNHdr, A252CliCod, A279CliNom, A212BarSer, A1652BarSerDsc, A135BarColNom, A461Fase, A7258FaseDsc, A1525HisProKgr, A1526HisProMtr, A566HisProTur, A5605HisProTr2, AV48ManageFiltersExecutionStep, AV11ColumnsSelector, AV21Emprcod, AV50MaqCod, AV51MaqDsc, AV103FilterFullText, AV36HisProFec_To, AV82TFHisProFec, AV76TFGruOpeCod, AV77TFGruOpeCod_To, AV101TFBarNHdr, AV102TFBarNHdr_Sel, AV68TFCliCod, AV69TFCliCod_To, AV70TFCliNom, AV71TFCliNom_Sel, AV64TFBarSer, AV65TFBarSer_Sel, AV66TFBarSerDsc, AV67TFBarSerDsc_Sel, AV60TFBarColNom, AV61TFBarColNom_Sel, AV72TFFase, AV73TFFase_Sel, AV74TFFaseDsc, AV75TFFaseDsc_Sel, AV84TFHisProKgr, AV85TFHisProKgr_To, AV88TFHisProMtr, AV89TFHisProMtr_To, AV90TFHisProTur, AV91TFHisProTur_To, AV80TFHisProDTI, AV78TFHisProDTF, AV98TFHisProTr2, AV99TFHisProTr2_To, AV146Pgmname, AV55OrderedBy, AV57OrderedDsc, AV111Wcpartesproduccionmaquinads_1_emprcod, AV112Wcpartesproduccionmaquinads_2_maqcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV111Wcpartesproduccionmaquinads_1_emprcod = AV21Emprcod ;
      AV112Wcpartesproduccionmaquinads_2_maqcod = AV50MaqCod ;
      AV113Wcpartesproduccionmaquinads_3_maqdsc = AV51MaqDsc ;
      AV114Wcpartesproduccionmaquinads_4_filterfulltext = AV103FilterFullText ;
      AV115Wcpartesproduccionmaquinads_5_hisprofec = AV35HisProFec ;
      AV116Wcpartesproduccionmaquinads_6_hisprofec_to = AV36HisProFec_To ;
      AV117Wcpartesproduccionmaquinads_7_tfhisprofec = AV82TFHisProFec ;
      AV118Wcpartesproduccionmaquinads_8_tfgruopecod = AV76TFGruOpeCod ;
      AV119Wcpartesproduccionmaquinads_9_tfgruopecod_to = AV77TFGruOpeCod_To ;
      AV120Wcpartesproduccionmaquinads_10_tfbarnhdr = AV101TFBarNHdr ;
      AV121Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = AV102TFBarNHdr_Sel ;
      AV122Wcpartesproduccionmaquinads_12_tfclicod = AV68TFCliCod ;
      AV123Wcpartesproduccionmaquinads_13_tfclicod_to = AV69TFCliCod_To ;
      AV124Wcpartesproduccionmaquinads_14_tfclinom = AV70TFCliNom ;
      AV125Wcpartesproduccionmaquinads_15_tfclinom_sel = AV71TFCliNom_Sel ;
      AV126Wcpartesproduccionmaquinads_16_tfbarser = AV64TFBarSer ;
      AV127Wcpartesproduccionmaquinads_17_tfbarser_sel = AV65TFBarSer_Sel ;
      AV128Wcpartesproduccionmaquinads_18_tfbarserdsc = AV66TFBarSerDsc ;
      AV129Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = AV67TFBarSerDsc_Sel ;
      AV130Wcpartesproduccionmaquinads_20_tfbarcolnom = AV60TFBarColNom ;
      AV131Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = AV61TFBarColNom_Sel ;
      AV132Wcpartesproduccionmaquinads_22_tffase = AV72TFFase ;
      AV133Wcpartesproduccionmaquinads_23_tffase_sel = AV73TFFase_Sel ;
      AV134Wcpartesproduccionmaquinads_24_tffasedsc = AV74TFFaseDsc ;
      AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel = AV75TFFaseDsc_Sel ;
      AV136Wcpartesproduccionmaquinads_26_tfhisprokgr = AV84TFHisProKgr ;
      AV137Wcpartesproduccionmaquinads_27_tfhisprokgr_to = AV85TFHisProKgr_To ;
      AV138Wcpartesproduccionmaquinads_28_tfhispromtr = AV88TFHisProMtr ;
      AV139Wcpartesproduccionmaquinads_29_tfhispromtr_to = AV89TFHisProMtr_To ;
      AV140Wcpartesproduccionmaquinads_30_tfhisprotur = AV90TFHisProTur ;
      AV141Wcpartesproduccionmaquinads_31_tfhisprotur_to = AV91TFHisProTur_To ;
      AV142Wcpartesproduccionmaquinads_32_tfhisprodti = AV80TFHisProDTI ;
      AV143Wcpartesproduccionmaquinads_33_tfhisprodtf = AV78TFHisProDTF ;
      AV144Wcpartesproduccionmaquinads_34_tfhisprotr2 = AV98TFHisProTr2 ;
      AV145Wcpartesproduccionmaquinads_35_tfhisprotr2_to = AV99TFHisProTr2_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV35HisProFec, A503GruOpeCod, A13696BarNHdr, A252CliCod, A279CliNom, A212BarSer, A1652BarSerDsc, A135BarColNom, A461Fase, A7258FaseDsc, A1525HisProKgr, A1526HisProMtr, A566HisProTur, A5605HisProTr2, AV48ManageFiltersExecutionStep, AV11ColumnsSelector, AV21Emprcod, AV50MaqCod, AV51MaqDsc, AV103FilterFullText, AV36HisProFec_To, AV82TFHisProFec, AV76TFGruOpeCod, AV77TFGruOpeCod_To, AV101TFBarNHdr, AV102TFBarNHdr_Sel, AV68TFCliCod, AV69TFCliCod_To, AV70TFCliNom, AV71TFCliNom_Sel, AV64TFBarSer, AV65TFBarSer_Sel, AV66TFBarSerDsc, AV67TFBarSerDsc_Sel, AV60TFBarColNom, AV61TFBarColNom_Sel, AV72TFFase, AV73TFFase_Sel, AV74TFFaseDsc, AV75TFFaseDsc_Sel, AV84TFHisProKgr, AV85TFHisProKgr_To, AV88TFHisProMtr, AV89TFHisProMtr_To, AV90TFHisProTur, AV91TFHisProTur_To, AV80TFHisProDTI, AV78TFHisProDTF, AV98TFHisProTr2, AV99TFHisProTr2_To, AV146Pgmname, AV55OrderedBy, AV57OrderedDsc, AV111Wcpartesproduccionmaquinads_1_emprcod, AV112Wcpartesproduccionmaquinads_2_maqcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV146Pgmname = "WCPartesProduccionMaquina" ;
      Gx_err = (short)(0) ;
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), true);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), true);
      edtavOpenom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOpenom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      edtavHm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHm_Enabled), 5, 0), !bGXsfl_70_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupIZ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19IZ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV47ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV20DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV11ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_70 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_70"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV27GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV28GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV35HisProFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"vHISPROFEC"), 0) ;
         AV36HisProFec_To = localUtil.ctod( httpContext.cgiGet( sPrefix+"vHISPROFEC_TO"), 0) ;
         wcpOAV21Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV21Emprcod") ;
         wcpOAV50MaqCod = httpContext.cgiGet( sPrefix+"wcpOAV50MaqCod") ;
         wcpOAV51MaqDsc = httpContext.cgiGet( sPrefix+"wcpOAV51MaqDsc") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
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
         AV103FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103FilterFullText", AV103FilterFullText);
         AV105HisProFec_RangeText = httpContext.cgiGet( edtavHisprofec_rangetext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105HisProFec_RangeText", AV105HisProFec_RangeText);
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A602MaqCod", A602MaqCod);
         A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
         n606MaqDsc = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A606MaqDsc", A606MaqDsc);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprofecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPROFECAUXDATE");
            GX_FocusControl = edtavDdo_hisprofecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18DDO_HisProFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18DDO_HisProFecAuxDate", localUtil.format(AV18DDO_HisProFecAuxDate, "99/99/99"));
         }
         else
         {
            AV18DDO_HisProFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprofecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18DDO_HisProFecAuxDate", localUtil.format(AV18DDO_HisProFecAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodtiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODTIAUXDATE");
            GX_FocusControl = edtavDdo_hisprodtiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16DDO_HisProDTIAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16DDO_HisProDTIAuxDate", localUtil.format(AV16DDO_HisProDTIAuxDate, "99/99/99"));
         }
         else
         {
            AV16DDO_HisProDTIAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodtiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16DDO_HisProDTIAuxDate", localUtil.format(AV16DDO_HisProDTIAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODTFAUXDATE");
            GX_FocusControl = edtavDdo_hisprodtfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14DDO_HisProDTFAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14DDO_HisProDTFAuxDate", localUtil.format(AV14DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else
         {
            AV14DDO_HisProDTFAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14DDO_HisProDTFAuxDate", localUtil.format(AV14DDO_HisProDTFAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_70_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_702( ) ;
         if ( nGXsfl_70_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV104GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104GridActions), 4, 0));
            A558HisProFec = localUtil.ctod( httpContext.cgiGet( edtHisProFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtGruOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV54OpeNom = httpContext.cgiGet( edtavOpenom_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOpenom_Internalname, AV54OpeNom);
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            A461Fase = httpContext.cgiGet( edtFase_Internalname) ;
            A7258FaseDsc = httpContext.cgiGet( edtFaseDsc_Internalname) ;
            A1525HisProKgr = localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)) ;
            A1526HisProMtr = localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)) ;
            A566HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4440HisProDTI = localUtil.ctot( httpContext.cgiGet( edtHisProDTI_Internalname)) ;
            A4441HisProDTF = localUtil.ctot( httpContext.cgiGet( edtHisProDTF_Internalname)) ;
            A5605HisProTr2 = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProTr2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV96Hm = httpContext.cgiGet( edtavHm_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHm_Internalname, AV96Hm);
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( sPrefix+"GXH_vHISPROFEC"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV35HisProFec)) ) )
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
      e19IZ2 ();
      if (returnInSub) return;
   }

   public void e19IZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV108Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcpartesproduccionmaquina_impl.this.GXt_char1 = GXv_char2[0] ;
      AV108Station = GXt_char1 ;
      GXv_char2[0] = AV21Emprcod ;
      GXv_char3[0] = AV109Emprnom ;
      GXv_char4[0] = AV110Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV108Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcpartesproduccionmaquina_impl.this.AV21Emprcod = GXv_char2[0] ;
      wcpartesproduccionmaquina_impl.this.AV109Emprnom = GXv_char3[0] ;
      wcpartesproduccionmaquina_impl.this.AV110Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Emprcod", AV21Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      this.executeUsercontrolMethod(sPrefix, false, "HISPROFEC_RANGEPICKERContainer", "Attach", "", new Object[] {edtavHisprofec_rangetext_Internalname});
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtMaqCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Visible), 5, 0), true);
      edtMaqDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Visible), 5, 0), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV55OrderedBy < 1 )
      {
         AV55OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV20DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV20DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e20IZ2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV95WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV95WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV48ManageFiltersExecutionStep == 1 )
      {
         AV48ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48ManageFiltersExecutionStep", GXutil.str( AV48ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV48ManageFiltersExecutionStep == 2 )
      {
         AV48ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48ManageFiltersExecutionStep", GXutil.str( AV48ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV59Session.getValue("WCPartesProduccionMaquinaColumnsSelector"), "") != 0 )
      {
         AV13ColumnsSelectorXML = AV59Session.getValue("WCPartesProduccionMaquinaColumnsSelector") ;
         AV11ColumnsSelector.fromxml(AV13ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtHisProFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProFec_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtGruOpeCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtGruOpeCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGruOpeCod_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtavOpenom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOpenom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpenom_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtFase_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFase_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFase_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtFaseDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFaseDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFaseDsc_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtHisProKgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProKgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProKgr_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtHisProMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMtr_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtHisProTur_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProTur_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTur_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtHisProDTI_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProDTI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDTI_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtHisProDTF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProDTF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDTF_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtHisProTr2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisProTr2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTr2_Visible), 5, 0), !bGXsfl_70_Refreshing);
      edtavHm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV11ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHm_Visible), 5, 0), !bGXsfl_70_Refreshing);
      AV27GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridCurrentPage), 10, 0));
      AV28GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28GridPageCount), 10, 0));
      AV111Wcpartesproduccionmaquinads_1_emprcod = AV21Emprcod ;
      AV112Wcpartesproduccionmaquinads_2_maqcod = AV50MaqCod ;
      AV113Wcpartesproduccionmaquinads_3_maqdsc = AV51MaqDsc ;
      AV114Wcpartesproduccionmaquinads_4_filterfulltext = AV103FilterFullText ;
      AV115Wcpartesproduccionmaquinads_5_hisprofec = AV35HisProFec ;
      AV116Wcpartesproduccionmaquinads_6_hisprofec_to = AV36HisProFec_To ;
      AV117Wcpartesproduccionmaquinads_7_tfhisprofec = AV82TFHisProFec ;
      AV118Wcpartesproduccionmaquinads_8_tfgruopecod = AV76TFGruOpeCod ;
      AV119Wcpartesproduccionmaquinads_9_tfgruopecod_to = AV77TFGruOpeCod_To ;
      AV120Wcpartesproduccionmaquinads_10_tfbarnhdr = AV101TFBarNHdr ;
      AV121Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = AV102TFBarNHdr_Sel ;
      AV122Wcpartesproduccionmaquinads_12_tfclicod = AV68TFCliCod ;
      AV123Wcpartesproduccionmaquinads_13_tfclicod_to = AV69TFCliCod_To ;
      AV124Wcpartesproduccionmaquinads_14_tfclinom = AV70TFCliNom ;
      AV125Wcpartesproduccionmaquinads_15_tfclinom_sel = AV71TFCliNom_Sel ;
      AV126Wcpartesproduccionmaquinads_16_tfbarser = AV64TFBarSer ;
      AV127Wcpartesproduccionmaquinads_17_tfbarser_sel = AV65TFBarSer_Sel ;
      AV128Wcpartesproduccionmaquinads_18_tfbarserdsc = AV66TFBarSerDsc ;
      AV129Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = AV67TFBarSerDsc_Sel ;
      AV130Wcpartesproduccionmaquinads_20_tfbarcolnom = AV60TFBarColNom ;
      AV131Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = AV61TFBarColNom_Sel ;
      AV132Wcpartesproduccionmaquinads_22_tffase = AV72TFFase ;
      AV133Wcpartesproduccionmaquinads_23_tffase_sel = AV73TFFase_Sel ;
      AV134Wcpartesproduccionmaquinads_24_tffasedsc = AV74TFFaseDsc ;
      AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel = AV75TFFaseDsc_Sel ;
      AV136Wcpartesproduccionmaquinads_26_tfhisprokgr = AV84TFHisProKgr ;
      AV137Wcpartesproduccionmaquinads_27_tfhisprokgr_to = AV85TFHisProKgr_To ;
      AV138Wcpartesproduccionmaquinads_28_tfhispromtr = AV88TFHisProMtr ;
      AV139Wcpartesproduccionmaquinads_29_tfhispromtr_to = AV89TFHisProMtr_To ;
      AV140Wcpartesproduccionmaquinads_30_tfhisprotur = AV90TFHisProTur ;
      AV141Wcpartesproduccionmaquinads_31_tfhisprotur_to = AV91TFHisProTur_To ;
      AV142Wcpartesproduccionmaquinads_32_tfhisprodti = AV80TFHisProDTI ;
      AV143Wcpartesproduccionmaquinads_33_tfhisprodtf = AV78TFHisProDTF ;
      AV144Wcpartesproduccionmaquinads_34_tfhisprotr2 = AV98TFHisProTr2 ;
      AV145Wcpartesproduccionmaquinads_35_tfhisprotr2_to = AV99TFHisProTr2_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV11ColumnsSelector", AV11ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47ManageFiltersData", AV47ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29GridState", AV29GridState);
   }

   public void e12IZ2( )
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
         AV58PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV58PageToGo) ;
      }
   }

   public void e13IZ2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e15IZ2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV55OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55OrderedBy), 4, 0));
         AV57OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57OrderedDsc", AV57OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProFec") == 0 )
         {
            AV82TFHisProFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFHisProFec", localUtil.format(AV82TFHisProFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GruOpeCod") == 0 )
         {
            AV76TFGruOpeCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFGruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TFGruOpeCod), 6, 0));
            AV77TFGruOpeCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFGruOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFGruOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV101TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFBarNHdr", AV101TFBarNHdr);
            AV102TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFBarNHdr_Sel", AV102TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV68TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFCliCod), 6, 0));
            AV69TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV70TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFCliNom", AV70TFCliNom);
            AV71TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFCliNom_Sel", AV71TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV64TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFBarSer", AV64TFBarSer);
            AV65TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarSer_Sel", AV65TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV66TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarSerDsc", AV66TFBarSerDsc);
            AV67TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarSerDsc_Sel", AV67TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV60TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFBarColNom", AV60TFBarColNom);
            AV61TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarColNom_Sel", AV61TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Fase") == 0 )
         {
            AV72TFFase = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFFase", AV72TFFase);
            AV73TFFase_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFFase_Sel", AV73TFFase_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FaseDsc") == 0 )
         {
            AV74TFFaseDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFFaseDsc", AV74TFFaseDsc);
            AV75TFFaseDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFFaseDsc_Sel", AV75TFFaseDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProKgr") == 0 )
         {
            AV84TFHisProKgr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFHisProKgr", GXutil.ltrimstr( AV84TFHisProKgr, 9, 2));
            AV85TFHisProKgr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFHisProKgr_To", GXutil.ltrimstr( AV85TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProMtr") == 0 )
         {
            AV88TFHisProMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFHisProMtr", GXutil.ltrimstr( AV88TFHisProMtr, 9, 2));
            AV89TFHisProMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFHisProMtr_To", GXutil.ltrimstr( AV89TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProTur") == 0 )
         {
            AV90TFHisProTur = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFHisProTur", GXutil.str( AV90TFHisProTur, 1, 0));
            AV91TFHisProTur_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFHisProTur_To", GXutil.str( AV91TFHisProTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDTI") == 0 )
         {
            AV80TFHisProDTI = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFHisProDTI", localUtil.ttoc( AV80TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDTF") == 0 )
         {
            AV78TFHisProDTF = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFHisProDTF", localUtil.ttoc( AV78TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProTr2") == 0 )
         {
            AV98TFHisProTr2 = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFHisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98TFHisProTr2), 4, 0));
            AV99TFHisProTr2_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFHisProTr2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99TFHisProTr2_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e21IZ2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      GXt_char1 = AV54OpeNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char4) ;
      wcpartesproduccionmaquina_impl.this.GXt_char1 = GXv_char4[0] ;
      AV54OpeNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOpenom_Internalname, AV54OpeNom);
      AV32HhMm = DecimalUtil.doubleToDec(A5605HisProTr2/ (double) (60)) ;
      AV43HorRea = (short)(A5605HisProTr2/ (double) (60)) ;
      AV44HorReaint = (short)(GXutil.Int( AV43HorRea)) ;
      AV52MinRea = (byte)(A5605HisProTr2-(AV44HorReaint*60)) ;
      AV53MinRea2 = (short)(AV52MinRea/ (double) (100)) ;
      AV96Hm = GXutil.padl( GXutil.trim( GXutil.str( AV44HorReaint, 4, 0)), (short)(2), "0") + ":" + GXutil.padl( GXutil.trim( GXutil.str( AV52MinRea, 2, 0)), (short)(2), "0") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHm_Internalname, AV96Hm);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(70) ;
      }
      sendrow_702( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_70_Refreshing )
      {
         httpContext.doAjaxLoad(70, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV104GridActions, 4, 0)) );
   }

   public void e16IZ2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV13ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV11ColumnsSelector.fromJSonString(AV13ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCPartesProduccionMaquinaColumnsSelector", ((GXutil.strcmp("", AV13ColumnsSelectorXML)==0) ? "" : AV11ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV11ColumnsSelector", AV11ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47ManageFiltersData", AV47ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29GridState", AV29GridState);
   }

   public void e11IZ2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WCPartesProduccionMaquinaFilters")),GXutil.URLEncode(GXutil.rtrim(AV146Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV48ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48ManageFiltersExecutionStep", GXutil.str( AV48ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WCPartesProduccionMaquinaFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV48ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48ManageFiltersExecutionStep", GXutil.str( AV48ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV49ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WCPartesProduccionMaquinaFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wcpartesproduccionmaquina_impl.this.GXt_char1 = GXv_char4[0] ;
         AV49ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV49ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV146Pgmname+"GridState", AV49ManageFiltersXml) ;
            AV29GridState.fromxml(AV49ManageFiltersXml, null, null);
            AV55OrderedBy = AV29GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55OrderedBy), 4, 0));
            AV57OrderedDsc = AV29GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57OrderedDsc", AV57OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29GridState", AV29GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV11ColumnsSelector", AV11ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47ManageFiltersData", AV47ManageFiltersData);
   }

   public void e17IZ2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV23ExcelFilename ;
      GXv_char3[0] = AV22ErrorMessage ;
      new app.wcpartesproduccionmaquinaexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wcpartesproduccionmaquina_impl.this.AV23ExcelFilename = GXv_char4[0] ;
      wcpartesproduccionmaquina_impl.this.AV22ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV23ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV23ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV22ErrorMessage);
      }
   }

   public void e18IZ2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wcpartesproduccionmaquinaexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void e14IZ2( )
   {
      /* Hisprofec_rangepicker_Daterangechanged Routine */
      returnInSub = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35HisProFec", localUtil.format(AV35HisProFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36HisProFec_To", localUtil.format(AV36HisProFec_To, "99/99/99"));
      gxgrgrid_refresh( subGrid_Rows, AV35HisProFec, A503GruOpeCod, A13696BarNHdr, A252CliCod, A279CliNom, A212BarSer, A1652BarSerDsc, A135BarColNom, A461Fase, A7258FaseDsc, A1525HisProKgr, A1526HisProMtr, A566HisProTur, A5605HisProTr2, AV48ManageFiltersExecutionStep, AV11ColumnsSelector, AV21Emprcod, AV50MaqCod, AV51MaqDsc, AV103FilterFullText, AV36HisProFec_To, AV82TFHisProFec, AV76TFGruOpeCod, AV77TFGruOpeCod_To, AV101TFBarNHdr, AV102TFBarNHdr_Sel, AV68TFCliCod, AV69TFCliCod_To, AV70TFCliNom, AV71TFCliNom_Sel, AV64TFBarSer, AV65TFBarSer_Sel, AV66TFBarSerDsc, AV67TFBarSerDsc_Sel, AV60TFBarColNom, AV61TFBarColNom_Sel, AV72TFFase, AV73TFFase_Sel, AV74TFFaseDsc, AV75TFFaseDsc_Sel, AV84TFHisProKgr, AV85TFHisProKgr_To, AV88TFHisProMtr, AV89TFHisProMtr_To, AV90TFHisProTur, AV91TFHisProTur_To, AV80TFHisProDTI, AV78TFHisProDTF, AV98TFHisProTr2, AV99TFHisProTr2_To, AV146Pgmname, AV55OrderedBy, AV57OrderedDsc, AV111Wcpartesproduccionmaquinads_1_emprcod, AV112Wcpartesproduccionmaquinads_2_maqcod, sPrefix) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV11ColumnsSelector", AV11ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV47ManageFiltersData", AV47ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29GridState", AV29GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV55OrderedBy, 4, 0))+":"+(AV57OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV11ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProFec", "", "Fecha", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "GruOpeCod", "", "Operario", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&OpeNom", "", "Nombre", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarNHdr", "", "Hdr", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Nombre Cliente", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarSer", "", "Serie", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarColNom", "", "Nombre Color", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Fase", "", "Fase", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "FaseDsc", "", "Descripcion", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProKgr", "", "Kgs", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProMtr", "", "Mts", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProTur", "", "T", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProDTI", "", "Inicio", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProDTF", "", "Fin", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "HisProTr2", "", "Mm", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV11ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Hm", "", "HhMm", true, "") ;
      AV11ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV94UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCPartesProduccionMaquinaColumnsSelector", GXv_char4) ;
      wcpartesproduccionmaquina_impl.this.GXt_char1 = GXv_char4[0] ;
      AV94UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV94UserCustomValue)==0) ) )
      {
         AV12ColumnsSelectorAux.fromxml(AV94UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV12ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV11ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV12ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV11ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV47ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WCPartesProduccionMaquinaFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV47ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV103FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103FilterFullText", AV103FilterFullText);
      AV35HisProFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35HisProFec", localUtil.format(AV35HisProFec, "99/99/99"));
      AV36HisProFec_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36HisProFec_To", localUtil.format(AV36HisProFec_To, "99/99/99"));
      AV82TFHisProFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFHisProFec", localUtil.format(AV82TFHisProFec, "99/99/99"));
      AV76TFGruOpeCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFGruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TFGruOpeCod), 6, 0));
      AV77TFGruOpeCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFGruOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFGruOpeCod_To), 6, 0));
      AV101TFBarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFBarNHdr", AV101TFBarNHdr);
      AV102TFBarNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFBarNHdr_Sel", AV102TFBarNHdr_Sel);
      AV68TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFCliCod), 6, 0));
      AV69TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFCliCod_To), 6, 0));
      AV70TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFCliNom", AV70TFCliNom);
      AV71TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFCliNom_Sel", AV71TFCliNom_Sel);
      AV64TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFBarSer", AV64TFBarSer);
      AV65TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarSer_Sel", AV65TFBarSer_Sel);
      AV66TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarSerDsc", AV66TFBarSerDsc);
      AV67TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarSerDsc_Sel", AV67TFBarSerDsc_Sel);
      AV60TFBarColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFBarColNom", AV60TFBarColNom);
      AV61TFBarColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarColNom_Sel", AV61TFBarColNom_Sel);
      AV72TFFase = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFFase", AV72TFFase);
      AV73TFFase_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFFase_Sel", AV73TFFase_Sel);
      AV74TFFaseDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFFaseDsc", AV74TFFaseDsc);
      AV75TFFaseDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFFaseDsc_Sel", AV75TFFaseDsc_Sel);
      AV84TFHisProKgr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFHisProKgr", GXutil.ltrimstr( AV84TFHisProKgr, 9, 2));
      AV85TFHisProKgr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFHisProKgr_To", GXutil.ltrimstr( AV85TFHisProKgr_To, 9, 2));
      AV88TFHisProMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFHisProMtr", GXutil.ltrimstr( AV88TFHisProMtr, 9, 2));
      AV89TFHisProMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFHisProMtr_To", GXutil.ltrimstr( AV89TFHisProMtr_To, 9, 2));
      AV90TFHisProTur = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFHisProTur", GXutil.str( AV90TFHisProTur, 1, 0));
      AV91TFHisProTur_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFHisProTur_To", GXutil.str( AV91TFHisProTur_To, 1, 0));
      AV80TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFHisProDTI", localUtil.ttoc( AV80TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV78TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFHisProDTF", localUtil.ttoc( AV78TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV98TFHisProTr2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFHisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98TFHisProTr2), 4, 0));
      AV99TFHisProTr2_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFHisProTr2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99TFHisProTr2_To), 4, 0));
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
      callWebObject(formatLink("app.tparpro", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(A558HisProFec))}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tparpro", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(A558HisProFec))}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV59Session.getValue(AV146Pgmname+"GridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV146Pgmname+"GridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV59Session.getValue(AV146Pgmname+"GridState"), null, null);
      }
      AV55OrderedBy = AV29GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55OrderedBy), 4, 0));
      AV57OrderedDsc = AV29GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57OrderedDsc", AV57OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV29GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV29GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV29GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV147GXV1 = 1 ;
      while ( AV147GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV147GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV103FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV103FilterFullText", AV103FilterFullText);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "HISPROFEC") == 0 )
         {
            AV35HisProFec = localUtil.ctod( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35HisProFec", localUtil.format(AV35HisProFec, "99/99/99"));
            AV36HisProFec_To = localUtil.ctod( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36HisProFec_To", localUtil.format(AV36HisProFec_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROFEC") == 0 )
         {
            AV82TFHisProFec = localUtil.ctod( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFHisProFec", localUtil.format(AV82TFHisProFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV76TFGruOpeCod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFGruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TFGruOpeCod), 6, 0));
            AV77TFGruOpeCod_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFGruOpeCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFGruOpeCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV101TFBarNHdr = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFBarNHdr", AV101TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV102TFBarNHdr_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFBarNHdr_Sel", AV102TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV68TFCliCod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFCliCod), 6, 0));
            AV69TFCliCod_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV70TFCliNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFCliNom", AV70TFCliNom);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV71TFCliNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFCliNom_Sel", AV71TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV64TFBarSer = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFBarSer", AV64TFBarSer);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV65TFBarSer_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarSer_Sel", AV65TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV66TFBarSerDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarSerDsc", AV66TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV67TFBarSerDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarSerDsc_Sel", AV67TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV60TFBarColNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFBarColNom", AV60TFBarColNom);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV61TFBarColNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarColNom_Sel", AV61TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV72TFFase = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFFase", AV72TFFase);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV73TFFase_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFFase_Sel", AV73TFFase_Sel);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC") == 0 )
         {
            AV74TFFaseDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFFaseDsc", AV74TFFaseDsc);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC_SEL") == 0 )
         {
            AV75TFFaseDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFFaseDsc_Sel", AV75TFFaseDsc_Sel);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV84TFHisProKgr = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFHisProKgr", GXutil.ltrimstr( AV84TFHisProKgr, 9, 2));
            AV85TFHisProKgr_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFHisProKgr_To", GXutil.ltrimstr( AV85TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV88TFHisProMtr = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFHisProMtr", GXutil.ltrimstr( AV88TFHisProMtr, 9, 2));
            AV89TFHisProMtr_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFHisProMtr_To", GXutil.ltrimstr( AV89TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV90TFHisProTur = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFHisProTur", GXutil.str( AV90TFHisProTur, 1, 0));
            AV91TFHisProTur_To = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFHisProTur_To", GXutil.str( AV91TFHisProTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV80TFHisProDTI = localUtil.ctot( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFHisProDTI", localUtil.ttoc( AV80TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV16DDO_HisProDTIAuxDate = GXutil.resetTime(AV80TFHisProDTI) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16DDO_HisProDTIAuxDate", localUtil.format(AV16DDO_HisProDTIAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV78TFHisProDTF = localUtil.ctot( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFHisProDTF", localUtil.ttoc( AV78TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV14DDO_HisProDTFAuxDate = GXutil.resetTime(AV78TFHisProDTF) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14DDO_HisProDTFAuxDate", localUtil.format(AV14DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTR2") == 0 )
         {
            AV98TFHisProTr2 = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98TFHisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98TFHisProTr2), 4, 0));
            AV99TFHisProTr2_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFHisProTr2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99TFHisProTr2_To), 4, 0));
         }
         AV147GXV1 = (int)(AV147GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV102TFBarNHdr_Sel)==0), AV102TFBarNHdr_Sel, GXv_char4) ;
      wcpartesproduccionmaquina_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFCliNom_Sel)==0), AV71TFCliNom_Sel, GXv_char3) ;
      wcpartesproduccionmaquina_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFBarSer_Sel)==0), AV65TFBarSer_Sel, GXv_char2) ;
      wcpartesproduccionmaquina_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFBarSerDsc_Sel)==0), AV67TFBarSerDsc_Sel, GXv_char15) ;
      wcpartesproduccionmaquina_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFBarColNom_Sel)==0), AV61TFBarColNom_Sel, GXv_char17) ;
      wcpartesproduccionmaquina_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFFase_Sel)==0), AV73TFFase_Sel, GXv_char19) ;
      wcpartesproduccionmaquina_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV75TFFaseDsc_Sel)==0), AV75TFFaseDsc_Sel, GXv_char21) ;
      wcpartesproduccionmaquina_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"||"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18+"|"+GXt_char20+"|||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV101TFBarNHdr)==0), AV101TFBarNHdr, GXv_char21) ;
      wcpartesproduccionmaquina_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFCliNom)==0), AV70TFCliNom, GXv_char19) ;
      wcpartesproduccionmaquina_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFBarSer)==0), AV64TFBarSer, GXv_char17) ;
      wcpartesproduccionmaquina_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFBarSerDsc)==0), AV66TFBarSerDsc, GXv_char15) ;
      wcpartesproduccionmaquina_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFBarColNom)==0), AV60TFBarColNom, GXv_char4) ;
      wcpartesproduccionmaquina_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV72TFFase)==0), AV72TFFase, GXv_char3) ;
      wcpartesproduccionmaquina_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFFaseDsc)==0), AV74TFFaseDsc, GXv_char2) ;
      wcpartesproduccionmaquina_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82TFHisProFec)) ? "" : localUtil.dtoc( AV82TFHisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV76TFGruOpeCod) ? "" : GXutil.str( AV76TFGruOpeCod, 6, 0))+"||"+GXt_char20+"|"+((0==AV68TFCliCod) ? "" : GXutil.str( AV68TFCliCod, 6, 0))+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV84TFHisProKgr)==0) ? "" : GXutil.str( AV84TFHisProKgr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFHisProMtr)==0) ? "" : GXutil.str( AV88TFHisProMtr, 9, 2))+"|"+((0==AV90TFHisProTur) ? "" : GXutil.str( AV90TFHisProTur, 1, 0))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV80TFHisProDTI) ? "" : localUtil.dtoc( AV16DDO_HisProDTIAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV78TFHisProDTF) ? "" : localUtil.dtoc( AV14DDO_HisProDTFAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV98TFHisProTr2) ? "" : GXutil.str( AV98TFHisProTr2, 4, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV77TFGruOpeCod_To) ? "" : GXutil.str( AV77TFGruOpeCod_To, 6, 0))+"|||"+((0==AV69TFCliCod_To) ? "" : GXutil.str( AV69TFCliCod_To, 6, 0))+"|||||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV85TFHisProKgr_To)==0) ? "" : GXutil.str( AV85TFHisProKgr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFHisProMtr_To)==0) ? "" : GXutil.str( AV89TFHisProMtr_To, 9, 2))+"|"+((0==AV91TFHisProTur_To) ? "" : GXutil.str( AV91TFHisProTur_To, 1, 0))+"|||"+((0==AV99TFHisProTr2_To) ? "" : GXutil.str( AV99TFHisProTr2_To, 4, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV29GridState.fromxml(AV59Session.getValue(AV146Pgmname+"GridState"), null, null);
      AV29GridState.setgxTv_SdtWWPGridState_Orderedby( AV55OrderedBy );
      AV29GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV57OrderedDsc );
      AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV103FilterFullText)==0), (short)(0), AV103FilterFullText, "") ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "HISPROFEC", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35HisProFec))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV36HisProFec_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV35HisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV36HisProFec_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFHISPROFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82TFHisProFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV82TFHisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFGRUOPECOD", "", !((0==AV76TFGruOpeCod)&&(0==AV77TFGruOpeCod_To)), (short)(0), GXutil.trim( GXutil.str( AV76TFGruOpeCod, 6, 0)), GXutil.trim( GXutil.str( AV77TFGruOpeCod_To, 6, 0))) ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARNHDR", "", !(GXutil.strcmp("", AV101TFBarNHdr)==0), (short)(0), AV101TFBarNHdr, "", !(GXutil.strcmp("", AV102TFBarNHdr_Sel)==0), AV102TFBarNHdr_Sel, "") ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCLICOD", "", !((0==AV68TFCliCod)&&(0==AV69TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV68TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV69TFCliCod_To, 6, 0))) ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCLINOM", "", !(GXutil.strcmp("", AV70TFCliNom)==0), (short)(0), AV70TFCliNom, "", !(GXutil.strcmp("", AV71TFCliNom_Sel)==0), AV71TFCliNom_Sel, "") ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARSER", "", !(GXutil.strcmp("", AV64TFBarSer)==0), (short)(0), AV64TFBarSer, "", !(GXutil.strcmp("", AV65TFBarSer_Sel)==0), AV65TFBarSer_Sel, "") ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARSERDSC", "", !(GXutil.strcmp("", AV66TFBarSerDsc)==0), (short)(0), AV66TFBarSerDsc, "", !(GXutil.strcmp("", AV67TFBarSerDsc_Sel)==0), AV67TFBarSerDsc_Sel, "") ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV60TFBarColNom)==0), (short)(0), AV60TFBarColNom, "", !(GXutil.strcmp("", AV61TFBarColNom_Sel)==0), AV61TFBarColNom_Sel, "") ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASE", "", !(GXutil.strcmp("", AV72TFFase)==0), (short)(0), AV72TFFase, "", !(GXutil.strcmp("", AV73TFFase_Sel)==0), AV73TFFase_Sel, "") ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFASEDSC", "", !(GXutil.strcmp("", AV74TFFaseDsc)==0), (short)(0), AV74TFFaseDsc, "", !(GXutil.strcmp("", AV75TFFaseDsc_Sel)==0), AV75TFFaseDsc_Sel, "") ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFHISPROKGR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV84TFHisProKgr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV85TFHisProKgr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV84TFHisProKgr, 9, 2)), GXutil.trim( GXutil.str( AV85TFHisProKgr_To, 9, 2))) ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFHISPROMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFHisProMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFHisProMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV88TFHisProMtr, 9, 2)), GXutil.trim( GXutil.str( AV89TFHisProMtr_To, 9, 2))) ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFHISPROTUR", "", !((0==AV90TFHisProTur)&&(0==AV91TFHisProTur_To)), (short)(0), GXutil.trim( GXutil.str( AV90TFHisProTur, 1, 0)), GXutil.trim( GXutil.str( AV91TFHisProTur_To, 1, 0))) ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFHISPRODTI", "", !GXutil.dateCompare(GXutil.nullDate(), AV80TFHisProDTI), (short)(0), GXutil.trim( localUtil.ttoc( AV80TFHisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFHISPRODTF", "", !GXutil.dateCompare(GXutil.nullDate(), AV78TFHisProDTF), (short)(0), GXutil.trim( localUtil.ttoc( AV78TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV29GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFHISPROTR2", "", !((0==AV98TFHisProTr2)&&(0==AV99TFHisProTr2_To)), (short)(0), GXutil.trim( GXutil.str( AV98TFHisProTr2, 4, 0)), GXutil.trim( GXutil.str( AV99TFHisProTr2_To, 4, 0))) ;
      AV29GridState = GXv_SdtWWPGridState22[0] ;
      if ( ! (GXutil.strcmp("", AV21Emprcod)==0) )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV30GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV30GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV21Emprcod );
         AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV30GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV50MaqCod)==0) )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV30GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCOD" );
         AV30GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV50MaqCod );
         AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV30GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV51MaqDsc)==0) )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV30GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQDSC" );
         AV30GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV51MaqDsc );
         AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV30GridStateFilterValue, 0);
      }
      AV29GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV29GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV146Pgmname+"GridState", AV29GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV92TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV92TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV146Pgmname );
      AV92TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV92TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV45HTTPRequest.getScriptName()+"?"+AV45HTTPRequest.getQuerystring() );
      AV92TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TPARPRO" );
      AV93TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV93TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "Emprcod" );
      AV93TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV21Emprcod );
      AV92TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV93TrnContextAtt, 0);
      AV93TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV93TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "MaqCod" );
      AV93TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV50MaqCod );
      AV92TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV93TrnContextAtt, 0);
      AV93TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV93TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "MaqDsc" );
      AV93TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV51MaqDsc );
      AV92TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV93TrnContextAtt, 0);
      AV59Session.setValue("TrnContext", AV92TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_35_IZ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTableheader_Internalname, tblTableheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 70, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCPartesProduccionMaquina.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 70, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCPartesProduccionMaquina.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 70, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCPartesProduccionMaquina.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_48_IZ2( true) ;
      }
      else
      {
         wb_table3_48_IZ2( false) ;
      }
      return  ;
   }

   public void wb_table3_48_IZ2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_35_IZ2e( true) ;
      }
      else
      {
         wb_table2_35_IZ2e( false) ;
      }
   }

   public void wb_table3_48_IZ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_51_IZ2( true) ;
      }
      else
      {
         wb_table4_51_IZ2( false) ;
      }
      return  ;
   }

   public void wb_table4_51_IZ2e( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV47ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_48_IZ2e( true) ;
      }
      else
      {
         wb_table3_48_IZ2e( false) ;
      }
   }

   public void wb_table4_51_IZ2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'" + sPrefix + "',false,'" + sGXsfl_70_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV103FilterFullText, GXutil.rtrim( localUtil.format( AV103FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCPartesProduccionMaquina.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprofec_rangetext_Internalname, httpContext.getMessage( "His Pro Fec_Range Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'" + sPrefix + "',false,'" + sGXsfl_70_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprofec_rangetext_Internalname, AV105HisProFec_RangeText, GXutil.rtrim( localUtil.format( AV105HisProFec_RangeText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavHisprofec_rangetext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavHisprofec_rangetext_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCPartesProduccionMaquina.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_51_IZ2e( true) ;
      }
      else
      {
         wb_table4_51_IZ2e( false) ;
      }
   }

   public void wb_table1_11_IZ2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablemaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmaqcod_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblockmaqcod_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WCPartesProduccionMaquina.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcod_Internalname, httpContext.getMessage( "Maq Cod", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, GXutil.rtrim( AV50MaqCod), GXutil.rtrim( localUtil.format( AV50MaqCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCPartesProduccionMaquina.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablemaqdsc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmaqdsc_Internalname, "", "", "", lblTextblockmaqdsc_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WCPartesProduccionMaquina.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqdsc_Internalname, httpContext.getMessage( "Maq Dsc", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqdsc_Internalname, GXutil.rtrim( AV51MaqDsc), GXutil.rtrim( localUtil.format( AV51MaqDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqdsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCPartesProduccionMaquina.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_11_IZ2e( true) ;
      }
      else
      {
         wb_table1_11_IZ2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV21Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Emprcod", AV21Emprcod);
      AV50MaqCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50MaqCod", AV50MaqCod);
      AV51MaqDsc = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51MaqDsc", AV51MaqDsc);
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
      paIZ2( ) ;
      wsIZ2( ) ;
      weIZ2( ) ;
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
      sCtrlAV21Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV50MaqCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV51MaqDsc = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paIZ2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcpartesproduccionmaquina", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paIZ2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV21Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Emprcod", AV21Emprcod);
         AV50MaqCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50MaqCod", AV50MaqCod);
         AV51MaqDsc = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51MaqDsc", AV51MaqDsc);
      }
      wcpOAV21Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV21Emprcod") ;
      wcpOAV50MaqCod = httpContext.cgiGet( sPrefix+"wcpOAV50MaqCod") ;
      wcpOAV51MaqDsc = httpContext.cgiGet( sPrefix+"wcpOAV51MaqDsc") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV21Emprcod, wcpOAV21Emprcod) != 0 ) || ( GXutil.strcmp(AV50MaqCod, wcpOAV50MaqCod) != 0 ) || ( GXutil.strcmp(AV51MaqDsc, wcpOAV51MaqDsc) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV21Emprcod = AV21Emprcod ;
      wcpOAV50MaqCod = AV50MaqCod ;
      wcpOAV51MaqDsc = AV51MaqDsc ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV21Emprcod = httpContext.cgiGet( sPrefix+"AV21Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV21Emprcod) > 0 )
      {
         AV21Emprcod = httpContext.cgiGet( sCtrlAV21Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Emprcod", AV21Emprcod);
      }
      else
      {
         AV21Emprcod = httpContext.cgiGet( sPrefix+"AV21Emprcod_PARM") ;
      }
      sCtrlAV50MaqCod = httpContext.cgiGet( sPrefix+"AV50MaqCod_CTRL") ;
      if ( GXutil.len( sCtrlAV50MaqCod) > 0 )
      {
         AV50MaqCod = httpContext.cgiGet( sCtrlAV50MaqCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50MaqCod", AV50MaqCod);
      }
      else
      {
         AV50MaqCod = httpContext.cgiGet( sPrefix+"AV50MaqCod_PARM") ;
      }
      sCtrlAV51MaqDsc = httpContext.cgiGet( sPrefix+"AV51MaqDsc_CTRL") ;
      if ( GXutil.len( sCtrlAV51MaqDsc) > 0 )
      {
         AV51MaqDsc = httpContext.cgiGet( sCtrlAV51MaqDsc) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51MaqDsc", AV51MaqDsc);
      }
      else
      {
         AV51MaqDsc = httpContext.cgiGet( sPrefix+"AV51MaqDsc_PARM") ;
      }
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
      paIZ2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsIZ2( ) ;
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
      wsIZ2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21Emprcod_PARM", GXutil.rtrim( AV21Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21Emprcod_CTRL", GXutil.rtrim( sCtrlAV21Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50MaqCod_PARM", GXutil.rtrim( AV50MaqCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV50MaqCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50MaqCod_CTRL", GXutil.rtrim( sCtrlAV50MaqCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51MaqDsc_PARM", GXutil.rtrim( AV51MaqDsc));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV51MaqDsc)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV51MaqDsc_CTRL", GXutil.rtrim( sCtrlAV51MaqDsc));
      }
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
      weIZ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211557077", true, true);
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
      httpContext.AddJavascriptSource("wcpartesproduccionmaquina.js", "?20268211557077", false, true);
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

   public void subsflControlProps_702( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_70_idx );
      edtHisProFec_Internalname = sPrefix+"HISPROFEC_"+sGXsfl_70_idx ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD_"+sGXsfl_70_idx ;
      edtavOpenom_Internalname = sPrefix+"vOPENOM_"+sGXsfl_70_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_70_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_70_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_70_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_70_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_70_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_70_idx ;
      edtFase_Internalname = sPrefix+"FASE_"+sGXsfl_70_idx ;
      edtFaseDsc_Internalname = sPrefix+"FASEDSC_"+sGXsfl_70_idx ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR_"+sGXsfl_70_idx ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR_"+sGXsfl_70_idx ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR_"+sGXsfl_70_idx ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI_"+sGXsfl_70_idx ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF_"+sGXsfl_70_idx ;
      edtHisProTr2_Internalname = sPrefix+"HISPROTR2_"+sGXsfl_70_idx ;
      edtavHm_Internalname = sPrefix+"vHM_"+sGXsfl_70_idx ;
   }

   public void subsflControlProps_fel_702( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_70_fel_idx );
      edtHisProFec_Internalname = sPrefix+"HISPROFEC_"+sGXsfl_70_fel_idx ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD_"+sGXsfl_70_fel_idx ;
      edtavOpenom_Internalname = sPrefix+"vOPENOM_"+sGXsfl_70_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_70_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_70_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_70_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_70_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_70_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_70_fel_idx ;
      edtFase_Internalname = sPrefix+"FASE_"+sGXsfl_70_fel_idx ;
      edtFaseDsc_Internalname = sPrefix+"FASEDSC_"+sGXsfl_70_fel_idx ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR_"+sGXsfl_70_fel_idx ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR_"+sGXsfl_70_fel_idx ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR_"+sGXsfl_70_fel_idx ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI_"+sGXsfl_70_fel_idx ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF_"+sGXsfl_70_fel_idx ;
      edtHisProTr2_Internalname = sPrefix+"HISPROTR2_"+sGXsfl_70_fel_idx ;
      edtavHm_Internalname = sPrefix+"vHM_"+sGXsfl_70_fel_idx ;
   }

   public void sendrow_702( )
   {
      subsflControlProps_702( ) ;
      wbIZ0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_70_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_70_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_70_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'"+sPrefix+"',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_70_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV104GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV104GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV104GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+sPrefix+"'"+",false,"+"'"+"e22iz2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,71);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV104GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_70_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProFec_Internalname,localUtil.format(A558HisProFec, "99/99/99"),localUtil.format( A558HisProFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtGruOpeCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGruOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtGruOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtGruOpeCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavOpenom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavOpenom_Enabled!=0)&&(edtavOpenom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 74,'"+sPrefix+"',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOpenom_Internalname,GXutil.rtrim( AV54OpeNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavOpenom_Enabled!=0)&&(edtavOpenom_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,74);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOpenom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavOpenom_Visible),Integer.valueOf(edtavOpenom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFase_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFase_Internalname,GXutil.rtrim( A461Fase),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFase_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtFaseDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFaseDsc_Internalname,GXutil.rtrim( A7258FaseDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFaseDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtFaseDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProKgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProKgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1525HisProKgr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProKgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProKgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1526HisProMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProTur_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProTur_Internalname,GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProTur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProTur_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProDTI_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDTI_Internalname,localUtil.ttoc( A4440HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4440HisProDTI, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProDTI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProDTI_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProDTF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDTF_Internalname,localUtil.ttoc( A4441HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4441HisProDTF, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProDTF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProDTF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProTr2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProTr2_Internalname,GXutil.ltrim( localUtil.ntoc( A5605HisProTr2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5605HisProTr2), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisProTr2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProTr2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHm_Enabled!=0)&&(edtavHm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 89,'"+sPrefix+"',false,'"+sGXsfl_70_idx+"',70)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHm_Internalname,GXutil.rtrim( AV96Hm),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHm_Enabled!=0)&&(edtavHm_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,89);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavHm_Visible),Integer.valueOf(edtavHm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesIZ2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_70_idx = ((subGrid_Islastpage==1)&&(nGXsfl_70_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_70_idx+1) ;
         sGXsfl_70_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_70_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_702( ) ;
      }
      /* End function sendrow_702 */
   }

   public void startgridcontrol70( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"70\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGruOpeCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavOpenom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFase_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtFaseDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProKgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProTur_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProDTI_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProDTF_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProTr2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mm", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HhMm", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV104GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A558HisProFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGruOpeCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV54OpeNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOpenom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavOpenom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A461Fase));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFase_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7258FaseDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFaseDsc_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProTur_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5605HisProTr2, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProTr2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV96Hm));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHm_Visible, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblockmaqcod_Internalname = sPrefix+"TEXTBLOCKMAQCOD" ;
      edtavMaqcod_Internalname = sPrefix+"vMAQCOD" ;
      divUnnamedtablemaqcod_Internalname = sPrefix+"UNNAMEDTABLEMAQCOD" ;
      lblTextblockmaqdsc_Internalname = sPrefix+"TEXTBLOCKMAQDSC" ;
      edtavMaqdsc_Internalname = sPrefix+"vMAQDSC" ;
      divUnnamedtablemaqdsc_Internalname = sPrefix+"UNNAMEDTABLEMAQDSC" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      tblUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      edtavHisprofec_rangetext_Internalname = sPrefix+"vHISPROFEC_RANGETEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      tblTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS" );
      edtHisProFec_Internalname = sPrefix+"HISPROFEC" ;
      edtGruOpeCod_Internalname = sPrefix+"GRUOPECOD" ;
      edtavOpenom_Internalname = sPrefix+"vOPENOM" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtFase_Internalname = sPrefix+"FASE" ;
      edtFaseDsc_Internalname = sPrefix+"FASEDSC" ;
      edtHisProKgr_Internalname = sPrefix+"HISPROKGR" ;
      edtHisProMtr_Internalname = sPrefix+"HISPROMTR" ;
      edtHisProTur_Internalname = sPrefix+"HISPROTUR" ;
      edtHisProDTI_Internalname = sPrefix+"HISPRODTI" ;
      edtHisProDTF_Internalname = sPrefix+"HISPRODTF" ;
      edtHisProTr2_Internalname = sPrefix+"HISPROTR2" ;
      edtavHm_Internalname = sPrefix+"vHM" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Hisprofec_rangepicker_Internalname = sPrefix+"HISPROFEC_RANGEPICKER" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD" ;
      edtMaqDsc_Internalname = sPrefix+"MAQDSC" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_hisprofecauxdate_Internalname = sPrefix+"vDDO_HISPROFECAUXDATE" ;
      divDdo_hisprofecauxdates_Internalname = sPrefix+"DDO_HISPROFECAUXDATES" ;
      edtavDdo_hisprodtiauxdate_Internalname = sPrefix+"vDDO_HISPRODTIAUXDATE" ;
      divDdo_hisprodtiauxdates_Internalname = sPrefix+"DDO_HISPRODTIAUXDATES" ;
      edtavDdo_hisprodtfauxdate_Internalname = sPrefix+"vDDO_HISPRODTFAUXDATE" ;
      divDdo_hisprodtfauxdates_Internalname = sPrefix+"DDO_HISPRODTFAUXDATES" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtavHm_Jsonclick = "" ;
      edtavHm_Enabled = 1 ;
      edtHisProTr2_Jsonclick = "" ;
      edtHisProDTF_Jsonclick = "" ;
      edtHisProDTI_Jsonclick = "" ;
      edtHisProTur_Jsonclick = "" ;
      edtHisProMtr_Jsonclick = "" ;
      edtHisProKgr_Jsonclick = "" ;
      edtFaseDsc_Jsonclick = "" ;
      edtFase_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtavOpenom_Jsonclick = "" ;
      edtavOpenom_Enabled = 1 ;
      edtGruOpeCod_Jsonclick = "" ;
      edtHisProFec_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavMaqdsc_Jsonclick = "" ;
      edtavMaqdsc_Enabled = 0 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 0 ;
      edtavHisprofec_rangetext_Jsonclick = "" ;
      edtavHisprofec_rangetext_Enabled = 1 ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavHm_Visible = -1 ;
      edtHisProTr2_Visible = -1 ;
      edtHisProDTF_Visible = -1 ;
      edtHisProDTI_Visible = -1 ;
      edtHisProTur_Visible = -1 ;
      edtHisProMtr_Visible = -1 ;
      edtHisProKgr_Visible = -1 ;
      edtFaseDsc_Visible = -1 ;
      edtFase_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtBarNHdr_Visible = -1 ;
      edtavOpenom_Visible = -1 ;
      edtGruOpeCod_Visible = -1 ;
      edtHisProFec_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_hisprodtfauxdate_Jsonclick = "" ;
      edtavDdo_hisprodtiauxdate_Jsonclick = "" ;
      edtavDdo_hisprofecauxdate_Jsonclick = "" ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqDsc_Visible = 1 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WCPartesProduccionMaquinaGetFilterData" ;
      Ddo_grid_Datalisttype = "|||Dynamic||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|||||||" ;
      Ddo_grid_Includedatalist = "|||T||T|T|T|T|T|T|||||||" ;
      Ddo_grid_Filterisrange = "|T|||T|||||||T|T|T|||T|" ;
      Ddo_grid_Filtertype = "Date|Numeric||Character|Numeric|Character|Character|Character|Character|Character|Character|Numeric|Numeric|Numeric|Date|Date|Numeric|" ;
      Ddo_grid_Includefilter = "T|T||T|T|T|T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|||T|T|T|T|T|T||T|T|T|T|T||" ;
      Ddo_grid_Columnssortvalues = "2|3|||4|5|6|7|8|9||10|11|12|13|14||" ;
      Ddo_grid_Columnids = "1:HisProFec|2:GruOpeCod|3:OpeNom|4:BarNHdr|5:CliCod|6:CliNom|7:BarSer|8:BarSerDsc|9:BarColNom|10:Fase|11:FaseDsc|12:HisProKgr|13:HisProMtr|14:HisProTur|15:HisProDTI|16:HisProDTF|17:HisProTr2|18:Hm" ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Maquina", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_70_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A461Fase',fld:'FASE',pic:''},{av:'A7258FaseDsc',fld:'FASEDSC',pic:''},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'AV111Wcpartesproduccionmaquinads_1_emprcod',fld:'vWCPARTESPRODUCCIONMAQUINADS_1_EMPRCOD',pic:'@!'},{av:'AV112Wcpartesproduccionmaquinads_2_maqcod',fld:'vWCPARTESPRODUCCIONMAQUINADS_2_MAQCOD',pic:''},{av:'sPrefix'},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV21Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50MaqCod',fld:'vMAQCOD',pic:''},{av:'AV51MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV103FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36HisProFec_To',fld:'vHISPROFEC_TO',pic:''},{av:'AV82TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV76TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV77TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV101TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV102TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV68TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV69TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV64TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV65TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV66TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV67TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV60TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV61TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV72TFFase',fld:'vTFFASE',pic:''},{av:'AV73TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV84TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV85TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV88TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV91TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV80TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV78TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV98TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV99TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV55OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV57OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtHisProFec_Visible',ctrl:'HISPROFEC',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtavOpenom_Visible',ctrl:'vOPENOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFaseDsc_Visible',ctrl:'FASEDSC',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProTr2_Visible',ctrl:'HISPROTR2',prop:'Visible'},{av:'edtavHm_Visible',ctrl:'vHM',prop:'Visible'},{av:'AV27GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV28GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV29GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12IZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35HisProFec',fld:'vHISPROFEC',pic:''},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A461Fase',fld:'FASE',pic:''},{av:'A7258FaseDsc',fld:'FASEDSC',pic:''},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV21Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50MaqCod',fld:'vMAQCOD',pic:''},{av:'AV51MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV103FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36HisProFec_To',fld:'vHISPROFEC_TO',pic:''},{av:'AV82TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV76TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV77TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV101TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV102TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV68TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV69TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV64TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV65TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV66TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV67TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV60TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV61TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV72TFFase',fld:'vTFFASE',pic:''},{av:'AV73TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV84TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV85TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV88TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV91TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV80TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV78TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV98TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV99TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV55OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV57OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV111Wcpartesproduccionmaquinads_1_emprcod',fld:'vWCPARTESPRODUCCIONMAQUINADS_1_EMPRCOD',pic:'@!'},{av:'AV112Wcpartesproduccionmaquinads_2_maqcod',fld:'vWCPARTESPRODUCCIONMAQUINADS_2_MAQCOD',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13IZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35HisProFec',fld:'vHISPROFEC',pic:''},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A461Fase',fld:'FASE',pic:''},{av:'A7258FaseDsc',fld:'FASEDSC',pic:''},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV21Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50MaqCod',fld:'vMAQCOD',pic:''},{av:'AV51MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV103FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36HisProFec_To',fld:'vHISPROFEC_TO',pic:''},{av:'AV82TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV76TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV77TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV101TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV102TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV68TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV69TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV64TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV65TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV66TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV67TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV60TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV61TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV72TFFase',fld:'vTFFASE',pic:''},{av:'AV73TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV84TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV85TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV88TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV91TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV80TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV78TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV98TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV99TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV55OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV57OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV111Wcpartesproduccionmaquinads_1_emprcod',fld:'vWCPARTESPRODUCCIONMAQUINADS_1_EMPRCOD',pic:'@!'},{av:'AV112Wcpartesproduccionmaquinads_2_maqcod',fld:'vWCPARTESPRODUCCIONMAQUINADS_2_MAQCOD',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e15IZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35HisProFec',fld:'vHISPROFEC',pic:''},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A461Fase',fld:'FASE',pic:''},{av:'A7258FaseDsc',fld:'FASEDSC',pic:''},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV21Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50MaqCod',fld:'vMAQCOD',pic:''},{av:'AV51MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV103FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36HisProFec_To',fld:'vHISPROFEC_TO',pic:''},{av:'AV82TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV76TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV77TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV101TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV102TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV68TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV69TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV64TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV65TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV66TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV67TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV60TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV61TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV72TFFase',fld:'vTFFASE',pic:''},{av:'AV73TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV84TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV85TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV88TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV91TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV80TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV78TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV98TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV99TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV55OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV57OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV111Wcpartesproduccionmaquinads_1_emprcod',fld:'vWCPARTESPRODUCCIONMAQUINADS_1_EMPRCOD',pic:'@!'},{av:'AV112Wcpartesproduccionmaquinads_2_maqcod',fld:'vWCPARTESPRODUCCIONMAQUINADS_2_MAQCOD',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV55OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV57OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV98TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV99TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV78TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV80TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV90TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV91TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV88TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV84TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV85TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV72TFFase',fld:'vTFFASE',pic:''},{av:'AV73TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV60TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV61TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV66TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV67TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV64TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV65TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV68TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV69TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV101TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV102TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV76TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV77TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV82TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21IZ2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV104GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV54OpeNom',fld:'vOPENOM',pic:''},{av:'AV96Hm',fld:'vHM',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e16IZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35HisProFec',fld:'vHISPROFEC',pic:''},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A461Fase',fld:'FASE',pic:''},{av:'A7258FaseDsc',fld:'FASEDSC',pic:''},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV21Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50MaqCod',fld:'vMAQCOD',pic:''},{av:'AV51MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV103FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36HisProFec_To',fld:'vHISPROFEC_TO',pic:''},{av:'AV82TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV76TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV77TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV101TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV102TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV68TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV69TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV64TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV65TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV66TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV67TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV60TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV61TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV72TFFase',fld:'vTFFASE',pic:''},{av:'AV73TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV84TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV85TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV88TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV91TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV80TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV78TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV98TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV99TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV55OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV57OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV111Wcpartesproduccionmaquinads_1_emprcod',fld:'vWCPARTESPRODUCCIONMAQUINADS_1_EMPRCOD',pic:'@!'},{av:'AV112Wcpartesproduccionmaquinads_2_maqcod',fld:'vWCPARTESPRODUCCIONMAQUINADS_2_MAQCOD',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtHisProFec_Visible',ctrl:'HISPROFEC',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtavOpenom_Visible',ctrl:'vOPENOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFaseDsc_Visible',ctrl:'FASEDSC',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProTr2_Visible',ctrl:'HISPROTR2',prop:'Visible'},{av:'edtavHm_Visible',ctrl:'vHM',prop:'Visible'},{av:'AV27GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV28GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV29GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11IZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35HisProFec',fld:'vHISPROFEC',pic:''},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A461Fase',fld:'FASE',pic:''},{av:'A7258FaseDsc',fld:'FASEDSC',pic:''},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV21Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50MaqCod',fld:'vMAQCOD',pic:''},{av:'AV51MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV103FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36HisProFec_To',fld:'vHISPROFEC_TO',pic:''},{av:'AV82TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV76TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV77TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV101TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV102TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV68TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV69TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV64TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV65TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV66TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV67TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV60TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV61TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV72TFFase',fld:'vTFFASE',pic:''},{av:'AV73TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV84TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV85TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV88TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV91TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV80TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV78TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV98TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV99TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV55OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV57OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV111Wcpartesproduccionmaquinads_1_emprcod',fld:'vWCPARTESPRODUCCIONMAQUINADS_1_EMPRCOD',pic:'@!'},{av:'AV112Wcpartesproduccionmaquinads_2_maqcod',fld:'vWCPARTESPRODUCCIONMAQUINADS_2_MAQCOD',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV29GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16DDO_HisProDTIAuxDate',fld:'vDDO_HISPRODTIAUXDATE',pic:''},{av:'AV14DDO_HisProDTFAuxDate',fld:'vDDO_HISPRODTFAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV29GridState',fld:'vGRIDSTATE',pic:''},{av:'AV55OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV57OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV103FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV35HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV36HisProFec_To',fld:'vHISPROFEC_TO',pic:''},{av:'AV82TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV76TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV77TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV101TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV102TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV68TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV69TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV64TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV65TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV66TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV67TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV60TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV61TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV72TFFase',fld:'vTFFASE',pic:''},{av:'AV73TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV84TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV85TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV88TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV91TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV80TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV78TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV98TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV99TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV14DDO_HisProDTFAuxDate',fld:'vDDO_HISPRODTFAUXDATE',pic:''},{av:'AV16DDO_HisProDTIAuxDate',fld:'vDDO_HISPRODTIAUXDATE',pic:''},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtHisProFec_Visible',ctrl:'HISPROFEC',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtavOpenom_Visible',ctrl:'vOPENOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFaseDsc_Visible',ctrl:'FASEDSC',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProTr2_Visible',ctrl:'HISPROTR2',prop:'Visible'},{av:'edtavHm_Visible',ctrl:'vHM',prop:'Visible'},{av:'AV27GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV28GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e22IZ2',iparms:[{av:'cmbavGridactions'},{av:'AV104GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV104GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17IZ2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e18IZ2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("HISPROFEC_RANGEPICKER.DATERANGECHANGED","{handler:'e14IZ2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV35HisProFec',fld:'vHISPROFEC',pic:''},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A461Fase',fld:'FASE',pic:''},{av:'A7258FaseDsc',fld:'FASEDSC',pic:''},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV21Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50MaqCod',fld:'vMAQCOD',pic:''},{av:'AV51MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV103FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV36HisProFec_To',fld:'vHISPROFEC_TO',pic:''},{av:'AV82TFHisProFec',fld:'vTFHISPROFEC',pic:''},{av:'AV76TFGruOpeCod',fld:'vTFGRUOPECOD',pic:'ZZZZZ9'},{av:'AV77TFGruOpeCod_To',fld:'vTFGRUOPECOD_TO',pic:'ZZZZZ9'},{av:'AV101TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV102TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV68TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV69TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV70TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV64TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV65TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV66TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV67TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV60TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV61TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV72TFFase',fld:'vTFFASE',pic:''},{av:'AV73TFFase_Sel',fld:'vTFFASE_SEL',pic:''},{av:'AV74TFFaseDsc',fld:'vTFFASEDSC',pic:''},{av:'AV75TFFaseDsc_Sel',fld:'vTFFASEDSC_SEL',pic:''},{av:'AV84TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV85TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV88TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV89TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV90TFHisProTur',fld:'vTFHISPROTUR',pic:'9'},{av:'AV91TFHisProTur_To',fld:'vTFHISPROTUR_TO',pic:'9'},{av:'AV80TFHisProDTI',fld:'vTFHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV78TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV98TFHisProTr2',fld:'vTFHISPROTR2',pic:'ZZZ9'},{av:'AV99TFHisProTr2_To',fld:'vTFHISPROTR2_TO',pic:'ZZZ9'},{av:'AV146Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV55OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV57OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV111Wcpartesproduccionmaquinads_1_emprcod',fld:'vWCPARTESPRODUCCIONMAQUINADS_1_EMPRCOD',pic:'@!'},{av:'AV112Wcpartesproduccionmaquinads_2_maqcod',fld:'vWCPARTESPRODUCCIONMAQUINADS_2_MAQCOD',pic:''},{av:'sPrefix'}]");
      setEventMetadata("HISPROFEC_RANGEPICKER.DATERANGECHANGED",",oparms:[{av:'AV35HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV36HisProFec_To',fld:'vHISPROFEC_TO',pic:''},{av:'AV48ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV11ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtHisProFec_Visible',ctrl:'HISPROFEC',prop:'Visible'},{av:'edtGruOpeCod_Visible',ctrl:'GRUOPECOD',prop:'Visible'},{av:'edtavOpenom_Visible',ctrl:'vOPENOM',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtFase_Visible',ctrl:'FASE',prop:'Visible'},{av:'edtFaseDsc_Visible',ctrl:'FASEDSC',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProTur_Visible',ctrl:'HISPROTUR',prop:'Visible'},{av:'edtHisProDTI_Visible',ctrl:'HISPRODTI',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtHisProTr2_Visible',ctrl:'HISPROTR2',prop:'Visible'},{av:'edtavHm_Visible',ctrl:'vHM',prop:'Visible'},{av:'AV27GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV28GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV29GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Hm',iparms:[]");
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
      wcpOAV21Emprcod = "" ;
      wcpOAV50MaqCod = "" ;
      wcpOAV51MaqDsc = "" ;
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
      AV21Emprcod = "" ;
      AV50MaqCod = "" ;
      AV51MaqDsc = "" ;
      AV35HisProFec = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A461Fase = "" ;
      A7258FaseDsc = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      AV11ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV103FilterFullText = "" ;
      AV36HisProFec_To = GXutil.nullDate() ;
      AV82TFHisProFec = GXutil.nullDate() ;
      AV101TFBarNHdr = "" ;
      AV102TFBarNHdr_Sel = "" ;
      AV70TFCliNom = "" ;
      AV71TFCliNom_Sel = "" ;
      AV64TFBarSer = "" ;
      AV65TFBarSer_Sel = "" ;
      AV66TFBarSerDsc = "" ;
      AV67TFBarSerDsc_Sel = "" ;
      AV60TFBarColNom = "" ;
      AV61TFBarColNom_Sel = "" ;
      AV72TFFase = "" ;
      AV73TFFase_Sel = "" ;
      AV74TFFaseDsc = "" ;
      AV75TFFaseDsc_Sel = "" ;
      AV84TFHisProKgr = DecimalUtil.ZERO ;
      AV85TFHisProKgr_To = DecimalUtil.ZERO ;
      AV88TFHisProMtr = DecimalUtil.ZERO ;
      AV89TFHisProMtr_To = DecimalUtil.ZERO ;
      AV80TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV78TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV146Pgmname = "" ;
      AV111Wcpartesproduccionmaquinads_1_emprcod = "" ;
      AV112Wcpartesproduccionmaquinads_2_maqcod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV47ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV20DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucHisprofec_rangepicker = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV18DDO_HisProFecAuxDate = GXutil.nullDate() ;
      AV16DDO_HisProDTIAuxDate = GXutil.nullDate() ;
      AV14DDO_HisProDTFAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A558HisProFec = GXutil.nullDate() ;
      AV54OpeNom = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV96Hm = "" ;
      scmdbuf = "" ;
      lV114Wcpartesproduccionmaquinads_4_filterfulltext = "" ;
      lV134Wcpartesproduccionmaquinads_24_tffasedsc = "" ;
      AV115Wcpartesproduccionmaquinads_5_hisprofec = GXutil.nullDate() ;
      AV116Wcpartesproduccionmaquinads_6_hisprofec_to = GXutil.nullDate() ;
      AV117Wcpartesproduccionmaquinads_7_tfhisprofec = GXutil.nullDate() ;
      AV121Wcpartesproduccionmaquinads_11_tfbarnhdr_sel = "" ;
      AV120Wcpartesproduccionmaquinads_10_tfbarnhdr = "" ;
      AV125Wcpartesproduccionmaquinads_15_tfclinom_sel = "" ;
      AV124Wcpartesproduccionmaquinads_14_tfclinom = "" ;
      AV127Wcpartesproduccionmaquinads_17_tfbarser_sel = "" ;
      AV126Wcpartesproduccionmaquinads_16_tfbarser = "" ;
      AV129Wcpartesproduccionmaquinads_19_tfbarserdsc_sel = "" ;
      AV128Wcpartesproduccionmaquinads_18_tfbarserdsc = "" ;
      AV131Wcpartesproduccionmaquinads_21_tfbarcolnom_sel = "" ;
      AV130Wcpartesproduccionmaquinads_20_tfbarcolnom = "" ;
      AV133Wcpartesproduccionmaquinads_23_tffase_sel = "" ;
      AV132Wcpartesproduccionmaquinads_22_tffase = "" ;
      AV136Wcpartesproduccionmaquinads_26_tfhisprokgr = DecimalUtil.ZERO ;
      AV137Wcpartesproduccionmaquinads_27_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV138Wcpartesproduccionmaquinads_28_tfhispromtr = DecimalUtil.ZERO ;
      AV139Wcpartesproduccionmaquinads_29_tfhispromtr_to = DecimalUtil.ZERO ;
      AV142Wcpartesproduccionmaquinads_32_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV143Wcpartesproduccionmaquinads_33_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV114Wcpartesproduccionmaquinads_4_filterfulltext = "" ;
      AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel = "" ;
      AV134Wcpartesproduccionmaquinads_24_tffasedsc = "" ;
      AV113Wcpartesproduccionmaquinads_3_maqdsc = "" ;
      H00IZ2_A602MaqCod = new String[] {""} ;
      H00IZ2_A606MaqDsc = new String[] {""} ;
      H00IZ2_n606MaqDsc = new boolean[] {false} ;
      H00IZ2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00IZ2_A396EmprCod = new String[] {""} ;
      H00IZ3_AGRID_nRecordCount = new long[1] ;
      AV105HisProFec_RangeText = "" ;
      AV108Station = "" ;
      AV109Emprnom = "" ;
      AV110Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV95WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV59Session = httpContext.getWebSession();
      AV13ColumnsSelectorXML = "" ;
      AV32HhMm = DecimalUtil.ZERO ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV49ManageFiltersXml = "" ;
      AV23ExcelFilename = "" ;
      AV22ErrorMessage = "" ;
      AV94UserCustomValue = "" ;
      AV12ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
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
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV92TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV45HTTPRequest = httpContext.getHttpRequest();
      AV93TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      lblTextblockmaqcod_Jsonclick = "" ;
      lblTextblockmaqdsc_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV21Emprcod = "" ;
      sCtrlAV50MaqCod = "" ;
      sCtrlAV51MaqDsc = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcpartesproduccionmaquina__default(),
         new Object[] {
             new Object[] {
            H00IZ2_A602MaqCod, H00IZ2_A606MaqDsc, H00IZ2_n606MaqDsc, H00IZ2_A558HisProFec, H00IZ2_A396EmprCod
            }
            , new Object[] {
            H00IZ3_AGRID_nRecordCount
            }
         }
      );
      AV146Pgmname = "WCPartesProduccionMaquina" ;
      /* GeneXus formulas. */
      AV146Pgmname = "WCPartesProduccionMaquina" ;
      Gx_err = (short)(0) ;
      edtavMaqcod_Enabled = 0 ;
      edtavMaqdsc_Enabled = 0 ;
      edtavOpenom_Enabled = 0 ;
      edtavHm_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A566HisProTur ;
   private byte AV48ManageFiltersExecutionStep ;
   private byte AV90TFHisProTur ;
   private byte AV91TFHisProTur_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV140Wcpartesproduccionmaquinads_30_tfhisprotur ;
   private byte AV141Wcpartesproduccionmaquinads_31_tfhisprotur_to ;
   private byte A132BarCodReo ;
   private byte AV52MinRea ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short A5605HisProTr2 ;
   private short AV98TFHisProTr2 ;
   private short AV99TFHisProTr2_To ;
   private short AV55OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV104GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV144Wcpartesproduccionmaquinads_34_tfhisprotr2 ;
   private short AV145Wcpartesproduccionmaquinads_35_tfhisprotr2_to ;
   private short AV43HorRea ;
   private short AV44HorReaint ;
   private short AV53MinRea2 ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_70 ;
   private int nGXsfl_70_idx=1 ;
   private int A503GruOpeCod ;
   private int A252CliCod ;
   private int AV76TFGruOpeCod ;
   private int AV77TFGruOpeCod_To ;
   private int AV68TFCliCod ;
   private int AV69TFCliCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtEmprCod_Visible ;
   private int edtMaqCod_Visible ;
   private int edtMaqDsc_Visible ;
   private int subGrid_Islastpage ;
   private int edtavMaqcod_Enabled ;
   private int edtavMaqdsc_Enabled ;
   private int edtavOpenom_Enabled ;
   private int edtavHm_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV118Wcpartesproduccionmaquinads_8_tfgruopecod ;
   private int AV119Wcpartesproduccionmaquinads_9_tfgruopecod_to ;
   private int AV122Wcpartesproduccionmaquinads_12_tfclicod ;
   private int AV123Wcpartesproduccionmaquinads_13_tfclicod_to ;
   private int A129BarCod ;
   private int edtHisProFec_Visible ;
   private int edtGruOpeCod_Visible ;
   private int edtavOpenom_Visible ;
   private int edtBarNHdr_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarColNom_Visible ;
   private int edtFase_Visible ;
   private int edtFaseDsc_Visible ;
   private int edtHisProKgr_Visible ;
   private int edtHisProMtr_Visible ;
   private int edtHisProTur_Visible ;
   private int edtHisProDTI_Visible ;
   private int edtHisProDTF_Visible ;
   private int edtHisProTr2_Visible ;
   private int edtavHm_Visible ;
   private int AV58PageToGo ;
   private int AV147GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int edtavHisprofec_rangetext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV27GridCurrentPage ;
   private long AV28GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV84TFHisProKgr ;
   private java.math.BigDecimal AV85TFHisProKgr_To ;
   private java.math.BigDecimal AV88TFHisProMtr ;
   private java.math.BigDecimal AV89TFHisProMtr_To ;
   private java.math.BigDecimal AV136Wcpartesproduccionmaquinads_26_tfhisprokgr ;
   private java.math.BigDecimal AV137Wcpartesproduccionmaquinads_27_tfhisprokgr_to ;
   private java.math.BigDecimal AV138Wcpartesproduccionmaquinads_28_tfhispromtr ;
   private java.math.BigDecimal AV139Wcpartesproduccionmaquinads_29_tfhispromtr_to ;
   private java.math.BigDecimal AV32HhMm ;
   private String wcpOAV21Emprcod ;
   private String wcpOAV50MaqCod ;
   private String wcpOAV51MaqDsc ;
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
   private String AV21Emprcod ;
   private String AV50MaqCod ;
   private String AV51MaqDsc ;
   private String sGXsfl_70_idx="0001" ;
   private String A13696BarNHdr ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A461Fase ;
   private String A7258FaseDsc ;
   private String AV101TFBarNHdr ;
   private String AV102TFBarNHdr_Sel ;
   private String AV70TFCliNom ;
   private String AV71TFCliNom_Sel ;
   private String AV64TFBarSer ;
   private String AV65TFBarSer_Sel ;
   private String AV66TFBarSerDsc ;
   private String AV67TFBarSerDsc_Sel ;
   private String AV60TFBarColNom ;
   private String AV61TFBarColNom_Sel ;
   private String AV72TFFase ;
   private String AV73TFFase_Sel ;
   private String AV74TFFaseDsc ;
   private String AV75TFFaseDsc_Sel ;
   private String AV146Pgmname ;
   private String AV111Wcpartesproduccionmaquinads_1_emprcod ;
   private String AV112Wcpartesproduccionmaquinads_2_maqcod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Hisprofec_rangepicker_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtEmprCod_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String edtMaqCod_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqDsc_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Jsonclick ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_hisprofecauxdates_Internalname ;
   private String TempTags ;
   private String edtavDdo_hisprofecauxdate_Internalname ;
   private String edtavDdo_hisprofecauxdate_Jsonclick ;
   private String divDdo_hisprodtiauxdates_Internalname ;
   private String edtavDdo_hisprodtiauxdate_Internalname ;
   private String edtavDdo_hisprodtiauxdate_Jsonclick ;
   private String divDdo_hisprodtfauxdates_Internalname ;
   private String edtavDdo_hisprodtfauxdate_Internalname ;
   private String edtavDdo_hisprodtfauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtHisProFec_Internalname ;
   private String edtGruOpeCod_Internalname ;
   private String AV54OpeNom ;
   private String edtavOpenom_Internalname ;
   private String edtBarNHdr_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliNom_Internalname ;
   private String edtBarSer_Internalname ;
   private String edtBarSerDsc_Internalname ;
   private String edtBarColNom_Internalname ;
   private String edtFase_Internalname ;
   private String edtFaseDsc_Internalname ;
   private String edtHisProKgr_Internalname ;
   private String edtHisProMtr_Internalname ;
   private String edtHisProTur_Internalname ;
   private String edtHisProDTI_Internalname ;
   private String edtHisProDTF_Internalname ;
   private String edtHisProTr2_Internalname ;
   private String AV96Hm ;
   private String edtavHm_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavMaqcod_Internalname ;
   private String edtavMaqdsc_Internalname ;
   private String scmdbuf ;
   private String lV134Wcpartesproduccionmaquinads_24_tffasedsc ;
   private String AV121Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ;
   private String AV120Wcpartesproduccionmaquinads_10_tfbarnhdr ;
   private String AV125Wcpartesproduccionmaquinads_15_tfclinom_sel ;
   private String AV124Wcpartesproduccionmaquinads_14_tfclinom ;
   private String AV127Wcpartesproduccionmaquinads_17_tfbarser_sel ;
   private String AV126Wcpartesproduccionmaquinads_16_tfbarser ;
   private String AV129Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ;
   private String AV128Wcpartesproduccionmaquinads_18_tfbarserdsc ;
   private String AV131Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ;
   private String AV130Wcpartesproduccionmaquinads_20_tfbarcolnom ;
   private String AV133Wcpartesproduccionmaquinads_23_tffase_sel ;
   private String AV132Wcpartesproduccionmaquinads_22_tffase ;
   private String AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel ;
   private String AV134Wcpartesproduccionmaquinads_24_tffasedsc ;
   private String AV113Wcpartesproduccionmaquinads_3_maqdsc ;
   private String edtavHisprofec_rangetext_Internalname ;
   private String AV108Station ;
   private String AV109Emprnom ;
   private String AV110Usurcod ;
   private String bttBtneditcolumns_Internalname ;
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
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String edtavHisprofec_rangetext_Jsonclick ;
   private String tblUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtablemaqcod_Internalname ;
   private String lblTextblockmaqcod_Internalname ;
   private String lblTextblockmaqcod_Jsonclick ;
   private String edtavMaqcod_Jsonclick ;
   private String divUnnamedtablemaqdsc_Internalname ;
   private String lblTextblockmaqdsc_Internalname ;
   private String lblTextblockmaqdsc_Jsonclick ;
   private String edtavMaqdsc_Jsonclick ;
   private String sCtrlAV21Emprcod ;
   private String sCtrlAV50MaqCod ;
   private String sCtrlAV51MaqDsc ;
   private String sGXsfl_70_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtHisProFec_Jsonclick ;
   private String edtGruOpeCod_Jsonclick ;
   private String edtavOpenom_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtFase_Jsonclick ;
   private String edtFaseDsc_Jsonclick ;
   private String edtHisProKgr_Jsonclick ;
   private String edtHisProMtr_Jsonclick ;
   private String edtHisProTur_Jsonclick ;
   private String edtHisProDTI_Jsonclick ;
   private String edtHisProDTF_Jsonclick ;
   private String edtHisProTr2_Jsonclick ;
   private String edtavHm_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV80TFHisProDTI ;
   private java.util.Date AV78TFHisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV142Wcpartesproduccionmaquinads_32_tfhisprodti ;
   private java.util.Date AV143Wcpartesproduccionmaquinads_33_tfhisprodtf ;
   private java.util.Date AV35HisProFec ;
   private java.util.Date AV36HisProFec_To ;
   private java.util.Date AV82TFHisProFec ;
   private java.util.Date AV18DDO_HisProFecAuxDate ;
   private java.util.Date AV16DDO_HisProDTIAuxDate ;
   private java.util.Date AV14DDO_HisProDTFAuxDate ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV115Wcpartesproduccionmaquinads_5_hisprofec ;
   private java.util.Date AV116Wcpartesproduccionmaquinads_6_hisprofec_to ;
   private java.util.Date AV117Wcpartesproduccionmaquinads_7_tfhisprofec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV57OrderedDsc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
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
   private boolean bGXsfl_70_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n606MaqDsc ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV13ColumnsSelectorXML ;
   private String AV49ManageFiltersXml ;
   private String AV94UserCustomValue ;
   private String AV103FilterFullText ;
   private String lV114Wcpartesproduccionmaquinads_4_filterfulltext ;
   private String AV114Wcpartesproduccionmaquinads_4_filterfulltext ;
   private String AV105HisProFec_RangeText ;
   private String AV23ExcelFilename ;
   private String AV22ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV45HTTPRequest ;
   private com.genexus.webpanels.WebSession AV59Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucHisprofec_rangepicker ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H00IZ2_A602MaqCod ;
   private String[] H00IZ2_A606MaqDsc ;
   private boolean[] H00IZ2_n606MaqDsc ;
   private java.util.Date[] H00IZ2_A558HisProFec ;
   private String[] H00IZ2_A396EmprCod ;
   private long[] H00IZ3_AGRID_nRecordCount ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV47ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV11ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV12ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV20DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV92TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV93TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV95WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class wcpartesproduccionmaquina__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00IZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV115Wcpartesproduccionmaquinads_5_hisprofec ,
                                          java.util.Date AV116Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                          java.util.Date AV117Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                          int AV118Wcpartesproduccionmaquinads_8_tfgruopecod ,
                                          int AV119Wcpartesproduccionmaquinads_9_tfgruopecod_to ,
                                          String AV121Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                          String AV120Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                          int AV122Wcpartesproduccionmaquinads_12_tfclicod ,
                                          int AV123Wcpartesproduccionmaquinads_13_tfclicod_to ,
                                          String AV125Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                          String AV124Wcpartesproduccionmaquinads_14_tfclinom ,
                                          String AV127Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                          String AV126Wcpartesproduccionmaquinads_16_tfbarser ,
                                          String AV129Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                          String AV128Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                          String AV131Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                          String AV130Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                          String AV133Wcpartesproduccionmaquinads_23_tffase_sel ,
                                          String AV132Wcpartesproduccionmaquinads_22_tffase ,
                                          java.math.BigDecimal AV136Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                          java.math.BigDecimal AV137Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                          java.math.BigDecimal AV138Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                          java.math.BigDecimal AV139Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                          byte AV140Wcpartesproduccionmaquinads_30_tfhisprotur ,
                                          byte AV141Wcpartesproduccionmaquinads_31_tfhisprotur_to ,
                                          java.util.Date AV142Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                          java.util.Date AV143Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                          short AV144Wcpartesproduccionmaquinads_34_tfhisprotr2 ,
                                          short AV145Wcpartesproduccionmaquinads_35_tfhisprotr2_to ,
                                          java.util.Date A558HisProFec ,
                                          int A503GruOpeCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          String A461Fase ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short AV55OrderedBy ,
                                          boolean AV57OrderedDsc ,
                                          String AV114Wcpartesproduccionmaquinads_4_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A7258FaseDsc ,
                                          short A5605HisProTr2 ,
                                          String AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                          String AV134Wcpartesproduccionmaquinads_24_tffasedsc ,
                                          String A606MaqDsc ,
                                          String AV113Wcpartesproduccionmaquinads_3_maqdsc ,
                                          String AV111Wcpartesproduccionmaquinads_1_emprcod ,
                                          String AV112Wcpartesproduccionmaquinads_2_maqcod ,
                                          String A396EmprCod ,
                                          String A602MaqCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[45];
      Object[] GXv_Object24 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.MaqCod, T2.MaqDsc, T1.HisProFec, T1.EmprCod" ;
      sFromString = " FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      addWhere(sWhereString, "(T2.MaqDsc = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115Wcpartesproduccionmaquinads_5_hisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV116Wcpartesproduccionmaquinads_6_hisprofec_to)) )
      {
         addWhere(sWhereString, "(T1.HisProFec <= ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV117Wcpartesproduccionmaquinads_7_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int23[39] = (byte)(1) ;
      }
      if ( AV55OrderedBy == 1 )
      {
         sOrderString += "" ;
      }
      else if ( ( AV55OrderedBy == 2 ) && ! AV57OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc, T1.HisProFec" ;
      }
      else if ( ( AV55OrderedBy == 2 ) && ( AV57OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC, T1.HisProFec DESC" ;
      }
      else if ( ( AV55OrderedBy == 3 ) && ! AV57OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV55OrderedBy == 3 ) && ( AV57OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV55OrderedBy == 4 ) && ! AV57OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV55OrderedBy == 4 ) && ( AV57OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV55OrderedBy == 5 ) && ! AV57OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV55OrderedBy == 5 ) && ( AV57OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV55OrderedBy == 6 ) && ! AV57OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV55OrderedBy == 6 ) && ( AV57OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV55OrderedBy == 7 ) && ! AV57OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV55OrderedBy == 7 ) && ( AV57OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV55OrderedBy == 8 ) && ! AV57OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV55OrderedBy == 8 ) && ( AV57OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV55OrderedBy == 9 ) && ! AV57OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV55OrderedBy == 9 ) && ( AV57OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV55OrderedBy == 10 ) && ! AV57OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV55OrderedBy == 10 ) && ( AV57OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV55OrderedBy == 11 ) && ! AV57OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV55OrderedBy == 11 ) && ( AV57OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV55OrderedBy == 12 ) && ! AV57OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV55OrderedBy == 12 ) && ( AV57OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV55OrderedBy == 13 ) && ! AV57OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV55OrderedBy == 13 ) && ( AV57OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV55OrderedBy == 14 ) && ! AV57OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T2.MaqDsc" ;
      }
      else if ( ( AV55OrderedBy == 14 ) && ( AV57OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.MaqCod DESC, T2.MaqDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H00IZ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV115Wcpartesproduccionmaquinads_5_hisprofec ,
                                          java.util.Date AV116Wcpartesproduccionmaquinads_6_hisprofec_to ,
                                          java.util.Date AV117Wcpartesproduccionmaquinads_7_tfhisprofec ,
                                          int AV118Wcpartesproduccionmaquinads_8_tfgruopecod ,
                                          int AV119Wcpartesproduccionmaquinads_9_tfgruopecod_to ,
                                          String AV121Wcpartesproduccionmaquinads_11_tfbarnhdr_sel ,
                                          String AV120Wcpartesproduccionmaquinads_10_tfbarnhdr ,
                                          int AV122Wcpartesproduccionmaquinads_12_tfclicod ,
                                          int AV123Wcpartesproduccionmaquinads_13_tfclicod_to ,
                                          String AV125Wcpartesproduccionmaquinads_15_tfclinom_sel ,
                                          String AV124Wcpartesproduccionmaquinads_14_tfclinom ,
                                          String AV127Wcpartesproduccionmaquinads_17_tfbarser_sel ,
                                          String AV126Wcpartesproduccionmaquinads_16_tfbarser ,
                                          String AV129Wcpartesproduccionmaquinads_19_tfbarserdsc_sel ,
                                          String AV128Wcpartesproduccionmaquinads_18_tfbarserdsc ,
                                          String AV131Wcpartesproduccionmaquinads_21_tfbarcolnom_sel ,
                                          String AV130Wcpartesproduccionmaquinads_20_tfbarcolnom ,
                                          String AV133Wcpartesproduccionmaquinads_23_tffase_sel ,
                                          String AV132Wcpartesproduccionmaquinads_22_tffase ,
                                          java.math.BigDecimal AV136Wcpartesproduccionmaquinads_26_tfhisprokgr ,
                                          java.math.BigDecimal AV137Wcpartesproduccionmaquinads_27_tfhisprokgr_to ,
                                          java.math.BigDecimal AV138Wcpartesproduccionmaquinads_28_tfhispromtr ,
                                          java.math.BigDecimal AV139Wcpartesproduccionmaquinads_29_tfhispromtr_to ,
                                          byte AV140Wcpartesproduccionmaquinads_30_tfhisprotur ,
                                          byte AV141Wcpartesproduccionmaquinads_31_tfhisprotur_to ,
                                          java.util.Date AV142Wcpartesproduccionmaquinads_32_tfhisprodti ,
                                          java.util.Date AV143Wcpartesproduccionmaquinads_33_tfhisprodtf ,
                                          short AV144Wcpartesproduccionmaquinads_34_tfhisprotr2 ,
                                          short AV145Wcpartesproduccionmaquinads_35_tfhisprotr2_to ,
                                          java.util.Date A558HisProFec ,
                                          int A503GruOpeCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          String A461Fase ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          byte A566HisProTur ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short AV55OrderedBy ,
                                          boolean AV57OrderedDsc ,
                                          String AV114Wcpartesproduccionmaquinads_4_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A7258FaseDsc ,
                                          short A5605HisProTr2 ,
                                          String AV135Wcpartesproduccionmaquinads_25_tffasedsc_sel ,
                                          String AV134Wcpartesproduccionmaquinads_24_tffasedsc ,
                                          String A606MaqDsc ,
                                          String AV113Wcpartesproduccionmaquinads_3_maqdsc ,
                                          String AV111Wcpartesproduccionmaquinads_1_emprcod ,
                                          String AV112Wcpartesproduccionmaquinads_2_maqcod ,
                                          String A396EmprCod ,
                                          String A602MaqCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[40];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPCHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      addWhere(sWhereString, "(T2.MaqDsc = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115Wcpartesproduccionmaquinads_5_hisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int25[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV116Wcpartesproduccionmaquinads_6_hisprofec_to)) )
      {
         addWhere(sWhereString, "(T1.HisProFec <= ?)");
      }
      else
      {
         GXv_int25[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV117Wcpartesproduccionmaquinads_7_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int25[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV55OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 2 ) && ! AV57OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 2 ) && ( AV57OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 3 ) && ! AV57OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 3 ) && ( AV57OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 4 ) && ! AV57OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 4 ) && ( AV57OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 5 ) && ! AV57OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 5 ) && ( AV57OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 6 ) && ! AV57OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 6 ) && ( AV57OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 7 ) && ! AV57OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 7 ) && ( AV57OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 8 ) && ! AV57OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 8 ) && ( AV57OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 9 ) && ! AV57OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 9 ) && ( AV57OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 10 ) && ! AV57OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 10 ) && ( AV57OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 11 ) && ! AV57OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 11 ) && ( AV57OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 12 ) && ! AV57OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 12 ) && ( AV57OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 13 ) && ! AV57OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 13 ) && ( AV57OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 14 ) && ! AV57OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV55OrderedBy == 14 ) && ( AV57OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
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
                  return conditional_H00IZ2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] );
            case 1 :
                  return conditional_H00IZ3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00IZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00IZ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
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
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 28);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 28);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 28);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 28);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[82]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[83]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[84]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 28);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 28);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 28);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 28);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               return;
      }
   }

}

