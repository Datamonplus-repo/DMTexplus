package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class reclamacionesynoconformidadeswc_impl extends GXWebComponent
{
   public reclamacionesynoconformidadeswc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public reclamacionesynoconformidadeswc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( reclamacionesynoconformidadeswc_impl.class ));
   }

   public reclamacionesynoconformidadeswc_impl( int remoteHandle ,
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
      cmbavAccionesdegrupo = new HTMLChoice();
      cmbHisEstReo = new HTMLChoice();
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
               AV5Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
               AV6Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
               AV83Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83Clicod_to), 6, 0));
               AV7HisreoFec = localUtil.parseDateParm( httpContext.GetPar( "HisreoFec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HisreoFec", localUtil.format(AV7HisreoFec, "99/99/99"));
               AV8HisreoFec_to = localUtil.parseDateParm( httpContext.GetPar( "HisreoFec_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HisreoFec_to", localUtil.format(AV8HisreoFec_to, "99/99/99"));
               AV9HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisEstReo", GXutil.str( AV9HisEstReo, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,Integer.valueOf(AV6Clicod),Integer.valueOf(AV83Clicod_to),AV7HisreoFec,AV8HisreoFec_to,Byte.valueOf(AV9HisEstReo)});
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
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
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
      AV20FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV6Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV83Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
      AV7HisreoFec = localUtil.parseDateParm( httpContext.GetPar( "HisreoFec")) ;
      AV8HisreoFec_to = localUtil.parseDateParm( httpContext.GetPar( "HisreoFec_to")) ;
      AV9HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
      AV30ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV25ColumnsSelector);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV32TFHisEstReo_Sels);
      AV33TFHisReoFec = localUtil.parseDateParm( httpContext.GetPar( "TFHisReoFec")) ;
      AV37TFHisReoHDR = httpContext.GetPar( "TFHisReoHDR") ;
      AV38TFHisReoHDR_Sel = httpContext.GetPar( "TFHisReoHDR_Sel") ;
      AV39TFHisreoLote = httpContext.GetPar( "TFHisreoLote") ;
      AV40TFHisreoLote_Sel = httpContext.GetPar( "TFHisreoLote_Sel") ;
      AV41TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV42TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV43TFHisBarSer = httpContext.GetPar( "TFHisBarSer") ;
      AV44TFHisBarSer_Sel = httpContext.GetPar( "TFHisBarSer_Sel") ;
      AV45TFHisReoDsc = httpContext.GetPar( "TFHisReoDsc") ;
      AV46TFHisReoDsc_Sel = httpContext.GetPar( "TFHisReoDsc_Sel") ;
      AV47TFHisColNom = httpContext.GetPar( "TFHisColNom") ;
      AV48TFHisColNom_Sel = httpContext.GetPar( "TFHisColNom_Sel") ;
      AV49TFHisNomCli = httpContext.GetPar( "TFHisNomCli") ;
      AV50TFHisNomCli_Sel = httpContext.GetPar( "TFHisNomCli_Sel") ;
      AV51TFHisOpeTur = (byte)(GXutil.lval( httpContext.GetPar( "TFHisOpeTur"))) ;
      AV52TFHisOpeTur_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHisOpeTur_To"))) ;
      AV53TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV54TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV55TFHisBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFHisBarKgm"), ".") ;
      AV56TFHisBarKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisBarKgm_To"), ".") ;
      AV57TFHisBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisBarMtr"), ".") ;
      AV58TFHisBarMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisBarMtr_To"), ".") ;
      AV59TFCostCausa = CommonUtil.decimalVal( httpContext.GetPar( "TFCostCausa"), ".") ;
      AV60TFCostCausa_To = CommonUtil.decimalVal( httpContext.GetPar( "TFCostCausa_To"), ".") ;
      AV90TFHisreoValorCausa = CommonUtil.decimalVal( httpContext.GetPar( "TFHisreoValorCausa"), ".") ;
      AV91TFHisreoValorCausa_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisreoValorCausa_To"), ".") ;
      AV61TFTipDefDsc = httpContext.GetPar( "TFTipDefDsc") ;
      AV62TFTipDefDsc_Sel = httpContext.GetPar( "TFTipDefDsc_Sel") ;
      AV63TFDscCausa = httpContext.GetPar( "TFDscCausa") ;
      AV64TFDscCausa_Sel = httpContext.GetPar( "TFDscCausa_Sel") ;
      AV65TFRps_Dsc = httpContext.GetPar( "TFRps_Dsc") ;
      AV66TFRps_Dsc_Sel = httpContext.GetPar( "TFRps_Dsc_Sel") ;
      AV67TFHisReoTn = (int)(GXutil.lval( httpContext.GetPar( "TFHisReoTn"))) ;
      AV68TFHisReoTn_To = (int)(GXutil.lval( httpContext.GetPar( "TFHisReoTn_To"))) ;
      AV69TFHisOpecod = (int)(GXutil.lval( httpContext.GetPar( "TFHisOpecod"))) ;
      AV70TFHisOpecod_To = (int)(GXutil.lval( httpContext.GetPar( "TFHisOpecod_To"))) ;
      AV71TFHisAcCo = httpContext.GetPar( "TFHisAcCo") ;
      AV72TFHisAcCo_Sel = httpContext.GetPar( "TFHisAcCo_Sel") ;
      AV73TFHisAcCot = httpContext.GetPar( "TFHisAcCot") ;
      AV74TFHisAcCot_Sel = httpContext.GetPar( "TFHisAcCot_Sel") ;
      AV75TFHisAdEAcCo = httpContext.GetPar( "TFHisAdEAcCo") ;
      AV76TFHisAdEAcCo_Sel = httpContext.GetPar( "TFHisAdEAcCo_Sel") ;
      AV77TFHisAdEAcCt = httpContext.GetPar( "TFHisAdEAcCt") ;
      AV78TFHisAdEAcCt_Sel = httpContext.GetPar( "TFHisAdEAcCt_Sel") ;
      AV99TFHisTipArtDsc = httpContext.GetPar( "TFHisTipArtDsc") ;
      AV100TFHisTipArtDsc_Sel = httpContext.GetPar( "TFHisTipArtDsc_Sel") ;
      AV101TFHisTipColDsc = httpContext.GetPar( "TFHisTipColDsc") ;
      AV102TFHisTipColDsc_Sel = httpContext.GetPar( "TFHisTipColDsc_Sel") ;
      AV156Pgmname = httpContext.GetPar( "Pgmname") ;
      AV17OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV18OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV84TotHisBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TotHisBarKgm"), ".") ;
      AV86TotHisBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotHisBarMtr"), ".") ;
      AV92TotHisreoValorCausa = CommonUtil.decimalVal( httpContext.GetPar( "TotHisreoValorCausa"), ".") ;
      AV95carvitin = (short)(GXutil.lval( httpContext.GetPar( "carvitin"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV5Emprcod, AV6Clicod, AV83Clicod_to, AV7HisreoFec, AV8HisreoFec_to, AV9HisEstReo, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV32TFHisEstReo_Sels, AV33TFHisReoFec, AV37TFHisReoHDR, AV38TFHisReoHDR_Sel, AV39TFHisreoLote, AV40TFHisreoLote_Sel, AV41TFCliNom, AV42TFCliNom_Sel, AV43TFHisBarSer, AV44TFHisBarSer_Sel, AV45TFHisReoDsc, AV46TFHisReoDsc_Sel, AV47TFHisColNom, AV48TFHisColNom_Sel, AV49TFHisNomCli, AV50TFHisNomCli_Sel, AV51TFHisOpeTur, AV52TFHisOpeTur_To, AV53TFMaqCod, AV54TFMaqCod_Sel, AV55TFHisBarKgm, AV56TFHisBarKgm_To, AV57TFHisBarMtr, AV58TFHisBarMtr_To, AV59TFCostCausa, AV60TFCostCausa_To, AV90TFHisreoValorCausa, AV91TFHisreoValorCausa_To, AV61TFTipDefDsc, AV62TFTipDefDsc_Sel, AV63TFDscCausa, AV64TFDscCausa_Sel, AV65TFRps_Dsc, AV66TFRps_Dsc_Sel, AV67TFHisReoTn, AV68TFHisReoTn_To, AV69TFHisOpecod, AV70TFHisOpecod_To, AV71TFHisAcCo, AV72TFHisAcCo_Sel, AV73TFHisAcCot, AV74TFHisAcCot_Sel, AV75TFHisAdEAcCo, AV76TFHisAdEAcCo_Sel, AV77TFHisAdEAcCt, AV78TFHisAdEAcCt_Sel, AV99TFHisTipArtDsc, AV100TFHisTipArtDsc_Sel, AV101TFHisTipColDsc, AV102TFHisTipColDsc_Sel, AV156Pgmname, AV17OrderedBy, AV18OrderedDsc, AV84TotHisBarKgm, AV86TotHisBarMtr, AV92TotHisreoValorCausa, AV95carvitin, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa15L2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Reoperados Internos (Nc) y Externos (Rc)", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.reclamacionesynoconformidadeswc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV83Clicod_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV7HisreoFec)),GXutil.URLEncode(GXutil.formatDateParm(AV8HisreoFec_to)),GXutil.URLEncode(GXutil.ltrimstr(AV9HisEstReo,1,0))}, new String[] {"Emprcod","Clicod","Clicod_to","HisreoFec","HisreoFec_to","HisEstReo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV156Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV84TotHisBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotHisBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISREOVALORCAUSA", getSecureSignedToken( sPrefix, localUtil.format( AV92TotHisreoValorCausa, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV95carvitin), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV20FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV28ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV28ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV81GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV82GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV79DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV79DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV25ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV25ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV6Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV83Clicod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV83Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7HisreoFec", localUtil.dtoc( wcpOAV7HisreoFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8HisreoFec_to", localUtil.dtoc( wcpOAV8HisreoFec_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9HisEstReo", GXutil.ltrim( localUtil.ntoc( wcpOAV9HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV30ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFHISESTREO_SELS", AV32TFHisEstReo_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFHISESTREO_SELS", AV32TFHisEstReo_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISREOFEC", localUtil.dtoc( AV33TFHisReoFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISREOHDR", GXutil.rtrim( AV37TFHisReoHDR));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISREOHDR_SEL", GXutil.rtrim( AV38TFHisReoHDR_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISREOLOTE", GXutil.rtrim( AV39TFHisreoLote));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISREOLOTE_SEL", GXutil.rtrim( AV40TFHisreoLote_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV41TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV42TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISBARSER", GXutil.rtrim( AV43TFHisBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISBARSER_SEL", GXutil.rtrim( AV44TFHisBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISREODSC", GXutil.rtrim( AV45TFHisReoDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISREODSC_SEL", GXutil.rtrim( AV46TFHisReoDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISCOLNOM", GXutil.rtrim( AV47TFHisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISCOLNOM_SEL", GXutil.rtrim( AV48TFHisColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISNOMCLI", GXutil.rtrim( AV49TFHisNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISNOMCLI_SEL", GXutil.rtrim( AV50TFHisNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISOPETUR", GXutil.ltrim( localUtil.ntoc( AV51TFHisOpeTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISOPETUR_TO", GXutil.ltrim( localUtil.ntoc( AV52TFHisOpeTur_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCOD", GXutil.rtrim( AV53TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMAQCOD_SEL", GXutil.rtrim( AV54TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISBARKGM", GXutil.ltrim( localUtil.ntoc( AV55TFHisBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISBARKGM_TO", GXutil.ltrim( localUtil.ntoc( AV56TFHisBarKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISBARMTR", GXutil.ltrim( localUtil.ntoc( AV57TFHisBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISBARMTR_TO", GXutil.ltrim( localUtil.ntoc( AV58TFHisBarMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCOSTCAUSA", GXutil.ltrim( localUtil.ntoc( AV59TFCostCausa, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCOSTCAUSA_TO", GXutil.ltrim( localUtil.ntoc( AV60TFCostCausa_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISREOVALORCAUSA", GXutil.ltrim( localUtil.ntoc( AV90TFHisreoValorCausa, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISREOVALORCAUSA_TO", GXutil.ltrim( localUtil.ntoc( AV91TFHisreoValorCausa_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPDEFDSC", GXutil.rtrim( AV61TFTipDefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFTIPDEFDSC_SEL", GXutil.rtrim( AV62TFTipDefDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDSCCAUSA", GXutil.rtrim( AV63TFDscCausa));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDSCCAUSA_SEL", GXutil.rtrim( AV64TFDscCausa_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRPS_DSC", GXutil.rtrim( AV65TFRps_Dsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRPS_DSC_SEL", GXutil.rtrim( AV66TFRps_Dsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISREOTN", GXutil.ltrim( localUtil.ntoc( AV67TFHisReoTn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISREOTN_TO", GXutil.ltrim( localUtil.ntoc( AV68TFHisReoTn_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISOPECOD", GXutil.ltrim( localUtil.ntoc( AV69TFHisOpecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISOPECOD_TO", GXutil.ltrim( localUtil.ntoc( AV70TFHisOpecod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISACCO", AV71TFHisAcCo);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISACCO_SEL", AV72TFHisAcCo_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISACCOT", AV73TFHisAcCot);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISACCOT_SEL", AV74TFHisAcCot_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISADEACCO", AV75TFHisAdEAcCo);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISADEACCO_SEL", AV76TFHisAdEAcCo_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISADEACCT", AV77TFHisAdEAcCt);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISADEACCT_SEL", AV78TFHisAdEAcCt_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISTIPARTDSC", GXutil.rtrim( AV99TFHisTipArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISTIPARTDSC_SEL", GXutil.rtrim( AV100TFHisTipArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISTIPCOLDSC", GXutil.rtrim( AV101TFHisTipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISTIPCOLDSC_SEL", GXutil.rtrim( AV102TFHisTipColDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV156Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV156Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV17OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV18OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV6Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV83Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISREOFEC", localUtil.dtoc( AV7HisreoFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISREOFEC_TO", localUtil.dtoc( AV8HisreoFec_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV9HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISBARKGM", GXutil.ltrim( localUtil.ntoc( AV84TotHisBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV84TotHisBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISBARMTR", GXutil.ltrim( localUtil.ntoc( AV86TotHisBarMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotHisBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISREOVALORCAUSA", GXutil.ltrim( localUtil.ntoc( AV92TotHisreoValorCausa, (byte)(18), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISREOVALORCAUSA", getSecureSignedToken( sPrefix, localUtil.format( AV92TotHisreoValorCausa, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RPS_COD", GXutil.ltrim( localUtil.ntoc( A7000Rps_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISTIPCOL", GXutil.ltrim( localUtil.ntoc( A572HisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV15GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV15GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHISESTREO_SELSJSON", AV31TFHisEstReo_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV95carvitin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV95carvitin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
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

   public void renderHtmlCloseForm15L2( )
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
      return "ReclamacionesyNoConformidadesWC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Reoperados Internos (Nc) y Externos (Rc)", "") ;
   }

   public void wb15L0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.reclamacionesynoconformidadeswc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ReclamacionesyNoConformidadesWC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ReclamacionesyNoConformidadesWC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ReclamacionesyNoConformidadesWC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_15L2( true) ;
      }
      else
      {
         wb_table1_23_15L2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_15L2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_74_15L2( true) ;
      }
      else
      {
         wb_table2_74_15L2( false) ;
      }
      return  ;
   }

   public void wb_table2_74_15L2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV81GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV82GridPageCount);
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV79DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV79DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV25ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisreofecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisreofecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisreofecauxdate_Internalname, localUtil.format(AV35DDO_HisReoFecAuxDate, "99/99/99"), localUtil.format( AV35DDO_HisReoFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,122);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisreofecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ReclamacionesyNoConformidadesWC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisreofecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ReclamacionesyNoConformidadesWC.htm");
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

   public void start15L2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Reoperados Internos (Nc) y Externos (Rc)", ""), (short)(0)) ;
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
            strup15L0( ) ;
         }
      }
   }

   public void ws15L2( )
   {
      start15L2( ) ;
      evt15L2( ) ;
   }

   public void evt15L2( )
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
                              strup15L0( ) ;
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
                              strup15L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1115L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1215L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1315L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1415L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1515L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1615L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1715L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavAccionesdegrupo.getInternalname() ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VACCIONESDEGRUPO.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VACCIONESDEGRUPO.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15L0( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           cmbavAccionesdegrupo.setName( cmbavAccionesdegrupo.getInternalname() );
                           cmbavAccionesdegrupo.setValue( httpContext.cgiGet( cmbavAccionesdegrupo.getInternalname()) );
                           AV94AccionesdeGrupo = (short)(GXutil.lval( httpContext.cgiGet( cmbavAccionesdegrupo.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAccionesdegrupo.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94AccionesdeGrupo), 4, 0));
                           cmbHisEstReo.setName( cmbHisEstReo.getInternalname() );
                           cmbHisEstReo.setValue( httpContext.cgiGet( cmbHisEstReo.getInternalname()) );
                           A548HisEstReo = (byte)(GXutil.lval( httpContext.cgiGet( cmbHisEstReo.getInternalname()))) ;
                           n548HisEstReo = false ;
                           A569HisReoFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtHisReoFec_Internalname), 0)) ;
                           n569HisReoFec = false ;
                           A13697HisReoHDR = httpContext.cgiGet( edtHisReoHDR_Internalname) ;
                           A13698HisreoLote = httpContext.cgiGet( edtHisreoLote_Internalname) ;
                           n13698HisreoLote = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A542HisBarSer = httpContext.cgiGet( edtHisBarSer_Internalname) ;
                           n542HisBarSer = false ;
                           A2299HisReoDsc = httpContext.cgiGet( edtHisReoDsc_Internalname) ;
                           n2299HisReoDsc = false ;
                           A546HisColNom = httpContext.cgiGet( edtHisColNom_Internalname) ;
                           n546HisColNom = false ;
                           A8889HisNomCli = httpContext.cgiGet( edtHisNomCli_Internalname) ;
                           n8889HisNomCli = false ;
                           A12950HisOpeTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisOpeTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n12950HisOpeTur = false ;
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           n602MaqCod = false ;
                           A540HisBarKgm = localUtil.ctond( httpContext.cgiGet( edtHisBarKgm_Internalname)) ;
                           n540HisBarKgm = false ;
                           A541HisBarMtr = localUtil.ctond( httpContext.cgiGet( edtHisBarMtr_Internalname)) ;
                           n541HisBarMtr = false ;
                           A13699CostCausa = localUtil.ctond( httpContext.cgiGet( edtCostCausa_Internalname)) ;
                           n13699CostCausa = false ;
                           A13700HisreoValo = localUtil.ctond( httpContext.cgiGet( edtHisreoValo_Internalname)) ;
                           A834TipDefDsc = httpContext.cgiGet( edtTipDefDsc_Internalname) ;
                           n834TipDefDsc = false ;
                           A5086DscCausa = httpContext.cgiGet( edtDscCausa_Internalname) ;
                           n5086DscCausa = false ;
                           A7001Rps_Dsc = httpContext.cgiGet( edtRps_Dsc_Internalname) ;
                           n7001Rps_Dsc = false ;
                           A2297HisReoTn = (int)(localUtil.ctol( httpContext.cgiGet( edtHisReoTn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n2297HisReoTn = false ;
                           A12949HisOpecod = (int)(localUtil.ctol( httpContext.cgiGet( edtHisOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n12949HisOpecod = false ;
                           A5662HisAcCo = httpContext.cgiGet( edtHisAcCo_Internalname) ;
                           n5662HisAcCo = false ;
                           A5693HisAcCot = httpContext.cgiGet( edtHisAcCot_Internalname) ;
                           n5693HisAcCot = false ;
                           A5694HisAdEAcCo = httpContext.cgiGet( edtHisAdEAcCo_Internalname) ;
                           n5694HisAdEAcCo = false ;
                           A5695HisAdEAcCt = httpContext.cgiGet( edtHisAdEAcCt_Internalname) ;
                           n5695HisAdEAcCt = false ;
                           A539HisBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHisBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A545HisCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A544HisCodPar = httpContext.cgiGet( edtHisCodPar_Internalname) ;
                           A13843HisTipArtD = httpContext.cgiGet( edtHisTipArtD_Internalname) ;
                           n13843HisTipArtD = false ;
                           A13844HisTipColD = httpContext.cgiGet( edtHisTipColD_Internalname) ;
                           n13844HisTipColD = false ;
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
                                       GX_FocusControl = cmbavAccionesdegrupo.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1815L2 ();
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
                                       GX_FocusControl = cmbavAccionesdegrupo.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1915L2 ();
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
                                       GX_FocusControl = cmbavAccionesdegrupo.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2015L2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VACCIONESDEGRUPO.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavAccionesdegrupo.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2115L2 ();
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
                                          /* Set Refresh If Filterfulltext Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV20FilterFullText) != 0 )
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
                                    strup15L0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavAccionesdegrupo.getInternalname() ;
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

   public void we15L2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm15L2( ) ;
         }
      }
   }

   public void pa15L2( )
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
                                 String AV20FilterFullText ,
                                 String AV5Emprcod ,
                                 int AV6Clicod ,
                                 int AV83Clicod_to ,
                                 java.util.Date AV7HisreoFec ,
                                 java.util.Date AV8HisreoFec_to ,
                                 byte AV9HisEstReo ,
                                 byte AV30ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelector ,
                                 GXSimpleCollection<Byte> AV32TFHisEstReo_Sels ,
                                 java.util.Date AV33TFHisReoFec ,
                                 String AV37TFHisReoHDR ,
                                 String AV38TFHisReoHDR_Sel ,
                                 String AV39TFHisreoLote ,
                                 String AV40TFHisreoLote_Sel ,
                                 String AV41TFCliNom ,
                                 String AV42TFCliNom_Sel ,
                                 String AV43TFHisBarSer ,
                                 String AV44TFHisBarSer_Sel ,
                                 String AV45TFHisReoDsc ,
                                 String AV46TFHisReoDsc_Sel ,
                                 String AV47TFHisColNom ,
                                 String AV48TFHisColNom_Sel ,
                                 String AV49TFHisNomCli ,
                                 String AV50TFHisNomCli_Sel ,
                                 byte AV51TFHisOpeTur ,
                                 byte AV52TFHisOpeTur_To ,
                                 String AV53TFMaqCod ,
                                 String AV54TFMaqCod_Sel ,
                                 java.math.BigDecimal AV55TFHisBarKgm ,
                                 java.math.BigDecimal AV56TFHisBarKgm_To ,
                                 java.math.BigDecimal AV57TFHisBarMtr ,
                                 java.math.BigDecimal AV58TFHisBarMtr_To ,
                                 java.math.BigDecimal AV59TFCostCausa ,
                                 java.math.BigDecimal AV60TFCostCausa_To ,
                                 java.math.BigDecimal AV90TFHisreoValorCausa ,
                                 java.math.BigDecimal AV91TFHisreoValorCausa_To ,
                                 String AV61TFTipDefDsc ,
                                 String AV62TFTipDefDsc_Sel ,
                                 String AV63TFDscCausa ,
                                 String AV64TFDscCausa_Sel ,
                                 String AV65TFRps_Dsc ,
                                 String AV66TFRps_Dsc_Sel ,
                                 int AV67TFHisReoTn ,
                                 int AV68TFHisReoTn_To ,
                                 int AV69TFHisOpecod ,
                                 int AV70TFHisOpecod_To ,
                                 String AV71TFHisAcCo ,
                                 String AV72TFHisAcCo_Sel ,
                                 String AV73TFHisAcCot ,
                                 String AV74TFHisAcCot_Sel ,
                                 String AV75TFHisAdEAcCo ,
                                 String AV76TFHisAdEAcCo_Sel ,
                                 String AV77TFHisAdEAcCt ,
                                 String AV78TFHisAdEAcCt_Sel ,
                                 String AV99TFHisTipArtDsc ,
                                 String AV100TFHisTipArtDsc_Sel ,
                                 String AV101TFHisTipColDsc ,
                                 String AV102TFHisTipColDsc_Sel ,
                                 String AV156Pgmname ,
                                 short AV17OrderedBy ,
                                 boolean AV18OrderedDsc ,
                                 java.math.BigDecimal AV84TotHisBarKgm ,
                                 java.math.BigDecimal AV86TotHisBarMtr ,
                                 java.math.BigDecimal AV92TotHisreoValorCausa ,
                                 short AV95carvitin ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1915L2 ();
      GRID_nCurrentRecord = 0 ;
      rf15L2( ) ;
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
      rf15L2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV156Pgmname = "ReclamacionesyNoConformidadesWC" ;
      Gx_err = (short)(0) ;
      edtavTotvaluehisbarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehisbarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehisbarkgm_Enabled), 5, 0), true);
      edtavTotvaluehisbarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehisbarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehisbarmtr_Enabled), 5, 0), true);
      edtavTotvaluehisreovalorcausa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehisreovalorcausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehisreovalorcausa_Enabled), 5, 0), true);
   }

   public void rf15L2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e1915L2 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
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
         subsflControlProps_412( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A548HisEstReo) ,
                                              AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels ,
                                              AV105Reclamacionesynoconformidadeswcds_1_filterfulltext ,
                                              Integer.valueOf(AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels.size()) ,
                                              AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec ,
                                              AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel ,
                                              AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr ,
                                              AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel ,
                                              AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote ,
                                              AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel ,
                                              AV112Reclamacionesynoconformidadeswcds_8_tfclinom ,
                                              AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel ,
                                              AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser ,
                                              AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel ,
                                              AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc ,
                                              AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel ,
                                              AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom ,
                                              AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel ,
                                              AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli ,
                                              Byte.valueOf(AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur) ,
                                              Byte.valueOf(AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to) ,
                                              AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel ,
                                              AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod ,
                                              AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm ,
                                              AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to ,
                                              AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr ,
                                              AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to ,
                                              AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa ,
                                              AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to ,
                                              AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa ,
                                              AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to ,
                                              AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel ,
                                              AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc ,
                                              AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel ,
                                              AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa ,
                                              AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel ,
                                              AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc ,
                                              Integer.valueOf(AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn) ,
                                              Integer.valueOf(AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to) ,
                                              Integer.valueOf(AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod) ,
                                              Integer.valueOf(AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to) ,
                                              AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel ,
                                              AV144Reclamacionesynoconformidadeswcds_40_tfhisacco ,
                                              AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel ,
                                              AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot ,
                                              AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel ,
                                              AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco ,
                                              AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel ,
                                              AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct ,
                                              AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel ,
                                              AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc ,
                                              AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel ,
                                              AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc ,
                                              Integer.valueOf(A539HisBarCod) ,
                                              Byte.valueOf(A545HisCodReo) ,
                                              A544HisCodPar ,
                                              A13698HisreoLote ,
                                              A279CliNom ,
                                              A542HisBarSer ,
                                              A2299HisReoDsc ,
                                              A546HisColNom ,
                                              A8889HisNomCli ,
                                              Byte.valueOf(A12950HisOpeTur) ,
                                              A602MaqCod ,
                                              A540HisBarKgm ,
                                              A541HisBarMtr ,
                                              A13699CostCausa ,
                                              A834TipDefDsc ,
                                              A5086DscCausa ,
                                              A7001Rps_Dsc ,
                                              Integer.valueOf(A2297HisReoTn) ,
                                              Integer.valueOf(A12949HisOpecod) ,
                                              A5662HisAcCo ,
                                              A5693HisAcCot ,
                                              A5694HisAdEAcCo ,
                                              A5695HisAdEAcCt ,
                                              A13843HisTipArtD ,
                                              A13844HisTipColD ,
                                              A569HisReoFec ,
                                              Short.valueOf(AV17OrderedBy) ,
                                              Boolean.valueOf(AV18OrderedDsc) ,
                                              Integer.valueOf(A252CliCod) ,
                                              Integer.valueOf(AV6Clicod) ,
                                              Integer.valueOf(AV83Clicod_to) ,
                                              AV7HisreoFec ,
                                              AV8HisreoFec_to ,
                                              Byte.valueOf(AV9HisEstReo) ,
                                              AV5Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
         lV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr = GXutil.padr( GXutil.rtrim( AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr), 11, "%") ;
         lV110Reclamacionesynoconformidadeswcds_6_tfhisreolote = GXutil.padr( GXutil.rtrim( AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote), 20, "%") ;
         lV112Reclamacionesynoconformidadeswcds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV112Reclamacionesynoconformidadeswcds_8_tfclinom), 30, "%") ;
         lV114Reclamacionesynoconformidadeswcds_10_tfhisbarser = GXutil.padr( GXutil.rtrim( AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser), 16, "%") ;
         lV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc = GXutil.padr( GXutil.rtrim( AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc), 26, "%") ;
         lV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom = GXutil.padr( GXutil.rtrim( AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom), 13, "%") ;
         lV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli = GXutil.padr( GXutil.rtrim( AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli), 13, "%") ;
         lV124Reclamacionesynoconformidadeswcds_20_tfmaqcod = GXutil.padr( GXutil.rtrim( AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod), 6, "%") ;
         lV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc = GXutil.padr( GXutil.rtrim( AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc), 30, "%") ;
         lV136Reclamacionesynoconformidadeswcds_32_tfdsccausa = GXutil.padr( GXutil.rtrim( AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa), 60, "%") ;
         lV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc = GXutil.padr( GXutil.rtrim( AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc), 40, "%") ;
         lV144Reclamacionesynoconformidadeswcds_40_tfhisacco = GXutil.concat( GXutil.rtrim( AV144Reclamacionesynoconformidadeswcds_40_tfhisacco), "%", "") ;
         lV146Reclamacionesynoconformidadeswcds_42_tfhisaccot = GXutil.concat( GXutil.rtrim( AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot), "%", "") ;
         lV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco = GXutil.concat( GXutil.rtrim( AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco), "%", "") ;
         lV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct = GXutil.concat( GXutil.rtrim( AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct), "%", "") ;
         lV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc = GXutil.padr( GXutil.rtrim( AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc), 30, "%") ;
         lV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc = GXutil.padr( GXutil.rtrim( AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc), 30, "%") ;
         /* Using cursor H015L2 */
         pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV6Clicod), Integer.valueOf(AV83Clicod_to), AV7HisreoFec, AV8HisreoFec_to, Byte.valueOf(AV9HisEstReo), lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec, lV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr, AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel, lV110Reclamacionesynoconformidadeswcds_6_tfhisreolote, AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel, lV112Reclamacionesynoconformidadeswcds_8_tfclinom, AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel, lV114Reclamacionesynoconformidadeswcds_10_tfhisbarser, AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel, lV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc, AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel, lV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom, AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel, lV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli, AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel, Byte.valueOf(AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur), Byte.valueOf(AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to), lV124Reclamacionesynoconformidadeswcds_20_tfmaqcod, AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel, AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm, AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to, AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr, AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to, AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa, AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to, AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa, AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to, lV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc, AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel, lV136Reclamacionesynoconformidadeswcds_32_tfdsccausa, AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel, lV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc, AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel, Integer.valueOf(AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn), Integer.valueOf(AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to), Integer.valueOf(AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod), Integer.valueOf(AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to), lV144Reclamacionesynoconformidadeswcds_40_tfhisacco, AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel, lV146Reclamacionesynoconformidadeswcds_42_tfhisaccot, AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel, lV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco, AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel, lV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct, AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel, lV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc, AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel, lV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc, AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A571HisTipArt = H015L2_A571HisTipArt[0] ;
            n571HisTipArt = H015L2_n571HisTipArt[0] ;
            A833TipDefCod = H015L2_A833TipDefCod[0] ;
            A5085CodCausa = H015L2_A5085CodCausa[0] ;
            n5085CodCausa = H015L2_n5085CodCausa[0] ;
            A252CliCod = H015L2_A252CliCod[0] ;
            n252CliCod = H015L2_n252CliCod[0] ;
            A7000Rps_Cod = H015L2_A7000Rps_Cod[0] ;
            n7000Rps_Cod = H015L2_n7000Rps_Cod[0] ;
            A396EmprCod = H015L2_A396EmprCod[0] ;
            A572HisTipCol = H015L2_A572HisTipCol[0] ;
            n572HisTipCol = H015L2_n572HisTipCol[0] ;
            A13844HisTipColD = H015L2_A13844HisTipColD[0] ;
            n13844HisTipColD = H015L2_n13844HisTipColD[0] ;
            A13843HisTipArtD = H015L2_A13843HisTipArtD[0] ;
            n13843HisTipArtD = H015L2_n13843HisTipArtD[0] ;
            A5695HisAdEAcCt = H015L2_A5695HisAdEAcCt[0] ;
            n5695HisAdEAcCt = H015L2_n5695HisAdEAcCt[0] ;
            A5694HisAdEAcCo = H015L2_A5694HisAdEAcCo[0] ;
            n5694HisAdEAcCo = H015L2_n5694HisAdEAcCo[0] ;
            A5693HisAcCot = H015L2_A5693HisAcCot[0] ;
            n5693HisAcCot = H015L2_n5693HisAcCot[0] ;
            A5662HisAcCo = H015L2_A5662HisAcCo[0] ;
            n5662HisAcCo = H015L2_n5662HisAcCo[0] ;
            A12949HisOpecod = H015L2_A12949HisOpecod[0] ;
            n12949HisOpecod = H015L2_n12949HisOpecod[0] ;
            A2297HisReoTn = H015L2_A2297HisReoTn[0] ;
            n2297HisReoTn = H015L2_n2297HisReoTn[0] ;
            A7001Rps_Dsc = H015L2_A7001Rps_Dsc[0] ;
            n7001Rps_Dsc = H015L2_n7001Rps_Dsc[0] ;
            A5086DscCausa = H015L2_A5086DscCausa[0] ;
            n5086DscCausa = H015L2_n5086DscCausa[0] ;
            A834TipDefDsc = H015L2_A834TipDefDsc[0] ;
            n834TipDefDsc = H015L2_n834TipDefDsc[0] ;
            A541HisBarMtr = H015L2_A541HisBarMtr[0] ;
            n541HisBarMtr = H015L2_n541HisBarMtr[0] ;
            A602MaqCod = H015L2_A602MaqCod[0] ;
            n602MaqCod = H015L2_n602MaqCod[0] ;
            A12950HisOpeTur = H015L2_A12950HisOpeTur[0] ;
            n12950HisOpeTur = H015L2_n12950HisOpeTur[0] ;
            A8889HisNomCli = H015L2_A8889HisNomCli[0] ;
            n8889HisNomCli = H015L2_n8889HisNomCli[0] ;
            A546HisColNom = H015L2_A546HisColNom[0] ;
            n546HisColNom = H015L2_n546HisColNom[0] ;
            A2299HisReoDsc = H015L2_A2299HisReoDsc[0] ;
            n2299HisReoDsc = H015L2_n2299HisReoDsc[0] ;
            A542HisBarSer = H015L2_A542HisBarSer[0] ;
            n542HisBarSer = H015L2_n542HisBarSer[0] ;
            A279CliNom = H015L2_A279CliNom[0] ;
            A13698HisreoLote = H015L2_A13698HisreoLote[0] ;
            n13698HisreoLote = H015L2_n13698HisreoLote[0] ;
            A569HisReoFec = H015L2_A569HisReoFec[0] ;
            n569HisReoFec = H015L2_n569HisReoFec[0] ;
            A548HisEstReo = H015L2_A548HisEstReo[0] ;
            n548HisEstReo = H015L2_n548HisEstReo[0] ;
            A544HisCodPar = H015L2_A544HisCodPar[0] ;
            A545HisCodReo = H015L2_A545HisCodReo[0] ;
            A539HisBarCod = H015L2_A539HisBarCod[0] ;
            A13699CostCausa = H015L2_A13699CostCausa[0] ;
            n13699CostCausa = H015L2_n13699CostCausa[0] ;
            A540HisBarKgm = H015L2_A540HisBarKgm[0] ;
            n540HisBarKgm = H015L2_n540HisBarKgm[0] ;
            A279CliNom = H015L2_A279CliNom[0] ;
            A13843HisTipArtD = H015L2_A13843HisTipArtD[0] ;
            n13843HisTipArtD = H015L2_n13843HisTipArtD[0] ;
            A834TipDefDsc = H015L2_A834TipDefDsc[0] ;
            n834TipDefDsc = H015L2_n834TipDefDsc[0] ;
            A5086DscCausa = H015L2_A5086DscCausa[0] ;
            n5086DscCausa = H015L2_n5086DscCausa[0] ;
            A13699CostCausa = H015L2_A13699CostCausa[0] ;
            n13699CostCausa = H015L2_n13699CostCausa[0] ;
            A7001Rps_Dsc = H015L2_A7001Rps_Dsc[0] ;
            n7001Rps_Dsc = H015L2_n7001Rps_Dsc[0] ;
            A13844HisTipColD = H015L2_A13844HisTipColD[0] ;
            n13844HisTipColD = H015L2_n13844HisTipColD[0] ;
            A13700HisreoValo = GXutil.roundDecimal( A13699CostCausa.multiply(A540HisBarKgm), 2) ;
            A13697HisReoHDR = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
            e2015L2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(41) ;
         wb15L0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes15L2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV156Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV156Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISBARKGM", GXutil.ltrim( localUtil.ntoc( AV84TotHisBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV84TotHisBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISBARMTR", GXutil.ltrim( localUtil.ntoc( AV86TotHisBarMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotHisBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISREOVALORCAUSA", GXutil.ltrim( localUtil.ntoc( AV92TotHisreoValorCausa, (byte)(18), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISREOVALORCAUSA", getSecureSignedToken( sPrefix, localUtil.format( AV92TotHisreoValorCausa, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV95carvitin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV95carvitin), "ZZZ9")));
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
      AV105Reclamacionesynoconformidadeswcds_1_filterfulltext = AV20FilterFullText ;
      AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels = AV32TFHisEstReo_Sels ;
      AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec = AV33TFHisReoFec ;
      AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr = AV37TFHisReoHDR ;
      AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel = AV38TFHisReoHDR_Sel ;
      AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote = AV39TFHisreoLote ;
      AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel = AV40TFHisreoLote_Sel ;
      AV112Reclamacionesynoconformidadeswcds_8_tfclinom = AV41TFCliNom ;
      AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel = AV42TFCliNom_Sel ;
      AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser = AV43TFHisBarSer ;
      AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel = AV44TFHisBarSer_Sel ;
      AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc = AV45TFHisReoDsc ;
      AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel = AV46TFHisReoDsc_Sel ;
      AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom = AV47TFHisColNom ;
      AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel = AV48TFHisColNom_Sel ;
      AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli = AV49TFHisNomCli ;
      AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel = AV50TFHisNomCli_Sel ;
      AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur = AV51TFHisOpeTur ;
      AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to = AV52TFHisOpeTur_To ;
      AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod = AV53TFMaqCod ;
      AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel = AV54TFMaqCod_Sel ;
      AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm = AV55TFHisBarKgm ;
      AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to = AV56TFHisBarKgm_To ;
      AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr = AV57TFHisBarMtr ;
      AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to = AV58TFHisBarMtr_To ;
      AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa = AV59TFCostCausa ;
      AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to = AV60TFCostCausa_To ;
      AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa = AV90TFHisreoValorCausa ;
      AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to = AV91TFHisreoValorCausa_To ;
      AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc = AV61TFTipDefDsc ;
      AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel = AV62TFTipDefDsc_Sel ;
      AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa = AV63TFDscCausa ;
      AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel = AV64TFDscCausa_Sel ;
      AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc = AV65TFRps_Dsc ;
      AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel = AV66TFRps_Dsc_Sel ;
      AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn = AV67TFHisReoTn ;
      AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to = AV68TFHisReoTn_To ;
      AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod = AV69TFHisOpecod ;
      AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to = AV70TFHisOpecod_To ;
      AV144Reclamacionesynoconformidadeswcds_40_tfhisacco = AV71TFHisAcCo ;
      AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel = AV72TFHisAcCo_Sel ;
      AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot = AV73TFHisAcCot ;
      AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel = AV74TFHisAcCot_Sel ;
      AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco = AV75TFHisAdEAcCo ;
      AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel = AV76TFHisAdEAcCo_Sel ;
      AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct = AV77TFHisAdEAcCt ;
      AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel = AV78TFHisAdEAcCt_Sel ;
      AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc = AV99TFHisTipArtDsc ;
      AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel = AV100TFHisTipArtDsc_Sel ;
      AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc = AV101TFHisTipColDsc ;
      AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel = AV102TFHisTipColDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A548HisEstReo) ,
                                           AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels ,
                                           AV105Reclamacionesynoconformidadeswcds_1_filterfulltext ,
                                           Integer.valueOf(AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels.size()) ,
                                           AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec ,
                                           AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel ,
                                           AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr ,
                                           AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel ,
                                           AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote ,
                                           AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel ,
                                           AV112Reclamacionesynoconformidadeswcds_8_tfclinom ,
                                           AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel ,
                                           AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser ,
                                           AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel ,
                                           AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc ,
                                           AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel ,
                                           AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom ,
                                           AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel ,
                                           AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli ,
                                           Byte.valueOf(AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur) ,
                                           Byte.valueOf(AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to) ,
                                           AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel ,
                                           AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod ,
                                           AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm ,
                                           AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to ,
                                           AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr ,
                                           AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to ,
                                           AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa ,
                                           AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to ,
                                           AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa ,
                                           AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to ,
                                           AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel ,
                                           AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc ,
                                           AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel ,
                                           AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa ,
                                           AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel ,
                                           AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc ,
                                           Integer.valueOf(AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn) ,
                                           Integer.valueOf(AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to) ,
                                           Integer.valueOf(AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod) ,
                                           Integer.valueOf(AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to) ,
                                           AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel ,
                                           AV144Reclamacionesynoconformidadeswcds_40_tfhisacco ,
                                           AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel ,
                                           AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot ,
                                           AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel ,
                                           AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco ,
                                           AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel ,
                                           AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct ,
                                           AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel ,
                                           AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc ,
                                           AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel ,
                                           AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc ,
                                           Integer.valueOf(A539HisBarCod) ,
                                           Byte.valueOf(A545HisCodReo) ,
                                           A544HisCodPar ,
                                           A13698HisreoLote ,
                                           A279CliNom ,
                                           A542HisBarSer ,
                                           A2299HisReoDsc ,
                                           A546HisColNom ,
                                           A8889HisNomCli ,
                                           Byte.valueOf(A12950HisOpeTur) ,
                                           A602MaqCod ,
                                           A540HisBarKgm ,
                                           A541HisBarMtr ,
                                           A13699CostCausa ,
                                           A834TipDefDsc ,
                                           A5086DscCausa ,
                                           A7001Rps_Dsc ,
                                           Integer.valueOf(A2297HisReoTn) ,
                                           Integer.valueOf(A12949HisOpecod) ,
                                           A5662HisAcCo ,
                                           A5693HisAcCot ,
                                           A5694HisAdEAcCo ,
                                           A5695HisAdEAcCt ,
                                           A13843HisTipArtD ,
                                           A13844HisTipColD ,
                                           A569HisReoFec ,
                                           Short.valueOf(AV17OrderedBy) ,
                                           Boolean.valueOf(AV18OrderedDsc) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV6Clicod) ,
                                           Integer.valueOf(AV83Clicod_to) ,
                                           AV7HisreoFec ,
                                           AV8HisreoFec_to ,
                                           Byte.valueOf(AV9HisEstReo) ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr = GXutil.padr( GXutil.rtrim( AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr), 11, "%") ;
      lV110Reclamacionesynoconformidadeswcds_6_tfhisreolote = GXutil.padr( GXutil.rtrim( AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote), 20, "%") ;
      lV112Reclamacionesynoconformidadeswcds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV112Reclamacionesynoconformidadeswcds_8_tfclinom), 30, "%") ;
      lV114Reclamacionesynoconformidadeswcds_10_tfhisbarser = GXutil.padr( GXutil.rtrim( AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser), 16, "%") ;
      lV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc = GXutil.padr( GXutil.rtrim( AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc), 26, "%") ;
      lV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom = GXutil.padr( GXutil.rtrim( AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom), 13, "%") ;
      lV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli = GXutil.padr( GXutil.rtrim( AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli), 13, "%") ;
      lV124Reclamacionesynoconformidadeswcds_20_tfmaqcod = GXutil.padr( GXutil.rtrim( AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod), 6, "%") ;
      lV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc = GXutil.padr( GXutil.rtrim( AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc), 30, "%") ;
      lV136Reclamacionesynoconformidadeswcds_32_tfdsccausa = GXutil.padr( GXutil.rtrim( AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa), 60, "%") ;
      lV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc = GXutil.padr( GXutil.rtrim( AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc), 40, "%") ;
      lV144Reclamacionesynoconformidadeswcds_40_tfhisacco = GXutil.concat( GXutil.rtrim( AV144Reclamacionesynoconformidadeswcds_40_tfhisacco), "%", "") ;
      lV146Reclamacionesynoconformidadeswcds_42_tfhisaccot = GXutil.concat( GXutil.rtrim( AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot), "%", "") ;
      lV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco = GXutil.concat( GXutil.rtrim( AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco), "%", "") ;
      lV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct = GXutil.concat( GXutil.rtrim( AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct), "%", "") ;
      lV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc = GXutil.padr( GXutil.rtrim( AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc), 30, "%") ;
      lV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc = GXutil.padr( GXutil.rtrim( AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc), 30, "%") ;
      /* Using cursor H015L3 */
      pr_default.execute(1, new Object[] {AV5Emprcod, Integer.valueOf(AV6Clicod), Integer.valueOf(AV83Clicod_to), AV7HisreoFec, AV8HisreoFec_to, Byte.valueOf(AV9HisEstReo), lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec, lV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr, AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel, lV110Reclamacionesynoconformidadeswcds_6_tfhisreolote, AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel, lV112Reclamacionesynoconformidadeswcds_8_tfclinom, AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel, lV114Reclamacionesynoconformidadeswcds_10_tfhisbarser, AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel, lV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc, AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel, lV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom, AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel, lV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli, AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel, Byte.valueOf(AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur), Byte.valueOf(AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to), lV124Reclamacionesynoconformidadeswcds_20_tfmaqcod, AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel, AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm, AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to, AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr, AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to, AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa, AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to, AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa, AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to, lV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc, AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel, lV136Reclamacionesynoconformidadeswcds_32_tfdsccausa, AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel, lV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc, AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel, Integer.valueOf(AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn), Integer.valueOf(AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to), Integer.valueOf(AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod), Integer.valueOf(AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to), lV144Reclamacionesynoconformidadeswcds_40_tfhisacco, AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel, lV146Reclamacionesynoconformidadeswcds_42_tfhisaccot, AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel, lV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco, AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel, lV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct, AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel, lV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc, AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel, lV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc, AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel});
      GRID_nRecordCount = H015L3_AGRID_nRecordCount[0] ;
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
      AV105Reclamacionesynoconformidadeswcds_1_filterfulltext = AV20FilterFullText ;
      AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels = AV32TFHisEstReo_Sels ;
      AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec = AV33TFHisReoFec ;
      AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr = AV37TFHisReoHDR ;
      AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel = AV38TFHisReoHDR_Sel ;
      AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote = AV39TFHisreoLote ;
      AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel = AV40TFHisreoLote_Sel ;
      AV112Reclamacionesynoconformidadeswcds_8_tfclinom = AV41TFCliNom ;
      AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel = AV42TFCliNom_Sel ;
      AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser = AV43TFHisBarSer ;
      AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel = AV44TFHisBarSer_Sel ;
      AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc = AV45TFHisReoDsc ;
      AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel = AV46TFHisReoDsc_Sel ;
      AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom = AV47TFHisColNom ;
      AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel = AV48TFHisColNom_Sel ;
      AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli = AV49TFHisNomCli ;
      AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel = AV50TFHisNomCli_Sel ;
      AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur = AV51TFHisOpeTur ;
      AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to = AV52TFHisOpeTur_To ;
      AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod = AV53TFMaqCod ;
      AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel = AV54TFMaqCod_Sel ;
      AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm = AV55TFHisBarKgm ;
      AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to = AV56TFHisBarKgm_To ;
      AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr = AV57TFHisBarMtr ;
      AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to = AV58TFHisBarMtr_To ;
      AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa = AV59TFCostCausa ;
      AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to = AV60TFCostCausa_To ;
      AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa = AV90TFHisreoValorCausa ;
      AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to = AV91TFHisreoValorCausa_To ;
      AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc = AV61TFTipDefDsc ;
      AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel = AV62TFTipDefDsc_Sel ;
      AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa = AV63TFDscCausa ;
      AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel = AV64TFDscCausa_Sel ;
      AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc = AV65TFRps_Dsc ;
      AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel = AV66TFRps_Dsc_Sel ;
      AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn = AV67TFHisReoTn ;
      AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to = AV68TFHisReoTn_To ;
      AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod = AV69TFHisOpecod ;
      AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to = AV70TFHisOpecod_To ;
      AV144Reclamacionesynoconformidadeswcds_40_tfhisacco = AV71TFHisAcCo ;
      AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel = AV72TFHisAcCo_Sel ;
      AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot = AV73TFHisAcCot ;
      AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel = AV74TFHisAcCot_Sel ;
      AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco = AV75TFHisAdEAcCo ;
      AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel = AV76TFHisAdEAcCo_Sel ;
      AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct = AV77TFHisAdEAcCt ;
      AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel = AV78TFHisAdEAcCt_Sel ;
      AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc = AV99TFHisTipArtDsc ;
      AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel = AV100TFHisTipArtDsc_Sel ;
      AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc = AV101TFHisTipColDsc ;
      AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel = AV102TFHisTipColDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV5Emprcod, AV6Clicod, AV83Clicod_to, AV7HisreoFec, AV8HisreoFec_to, AV9HisEstReo, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV32TFHisEstReo_Sels, AV33TFHisReoFec, AV37TFHisReoHDR, AV38TFHisReoHDR_Sel, AV39TFHisreoLote, AV40TFHisreoLote_Sel, AV41TFCliNom, AV42TFCliNom_Sel, AV43TFHisBarSer, AV44TFHisBarSer_Sel, AV45TFHisReoDsc, AV46TFHisReoDsc_Sel, AV47TFHisColNom, AV48TFHisColNom_Sel, AV49TFHisNomCli, AV50TFHisNomCli_Sel, AV51TFHisOpeTur, AV52TFHisOpeTur_To, AV53TFMaqCod, AV54TFMaqCod_Sel, AV55TFHisBarKgm, AV56TFHisBarKgm_To, AV57TFHisBarMtr, AV58TFHisBarMtr_To, AV59TFCostCausa, AV60TFCostCausa_To, AV90TFHisreoValorCausa, AV91TFHisreoValorCausa_To, AV61TFTipDefDsc, AV62TFTipDefDsc_Sel, AV63TFDscCausa, AV64TFDscCausa_Sel, AV65TFRps_Dsc, AV66TFRps_Dsc_Sel, AV67TFHisReoTn, AV68TFHisReoTn_To, AV69TFHisOpecod, AV70TFHisOpecod_To, AV71TFHisAcCo, AV72TFHisAcCo_Sel, AV73TFHisAcCot, AV74TFHisAcCot_Sel, AV75TFHisAdEAcCo, AV76TFHisAdEAcCo_Sel, AV77TFHisAdEAcCt, AV78TFHisAdEAcCt_Sel, AV99TFHisTipArtDsc, AV100TFHisTipArtDsc_Sel, AV101TFHisTipColDsc, AV102TFHisTipColDsc_Sel, AV156Pgmname, AV17OrderedBy, AV18OrderedDsc, AV84TotHisBarKgm, AV86TotHisBarMtr, AV92TotHisreoValorCausa, AV95carvitin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV105Reclamacionesynoconformidadeswcds_1_filterfulltext = AV20FilterFullText ;
      AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels = AV32TFHisEstReo_Sels ;
      AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec = AV33TFHisReoFec ;
      AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr = AV37TFHisReoHDR ;
      AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel = AV38TFHisReoHDR_Sel ;
      AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote = AV39TFHisreoLote ;
      AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel = AV40TFHisreoLote_Sel ;
      AV112Reclamacionesynoconformidadeswcds_8_tfclinom = AV41TFCliNom ;
      AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel = AV42TFCliNom_Sel ;
      AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser = AV43TFHisBarSer ;
      AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel = AV44TFHisBarSer_Sel ;
      AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc = AV45TFHisReoDsc ;
      AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel = AV46TFHisReoDsc_Sel ;
      AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom = AV47TFHisColNom ;
      AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel = AV48TFHisColNom_Sel ;
      AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli = AV49TFHisNomCli ;
      AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel = AV50TFHisNomCli_Sel ;
      AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur = AV51TFHisOpeTur ;
      AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to = AV52TFHisOpeTur_To ;
      AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod = AV53TFMaqCod ;
      AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel = AV54TFMaqCod_Sel ;
      AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm = AV55TFHisBarKgm ;
      AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to = AV56TFHisBarKgm_To ;
      AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr = AV57TFHisBarMtr ;
      AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to = AV58TFHisBarMtr_To ;
      AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa = AV59TFCostCausa ;
      AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to = AV60TFCostCausa_To ;
      AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa = AV90TFHisreoValorCausa ;
      AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to = AV91TFHisreoValorCausa_To ;
      AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc = AV61TFTipDefDsc ;
      AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel = AV62TFTipDefDsc_Sel ;
      AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa = AV63TFDscCausa ;
      AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel = AV64TFDscCausa_Sel ;
      AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc = AV65TFRps_Dsc ;
      AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel = AV66TFRps_Dsc_Sel ;
      AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn = AV67TFHisReoTn ;
      AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to = AV68TFHisReoTn_To ;
      AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod = AV69TFHisOpecod ;
      AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to = AV70TFHisOpecod_To ;
      AV144Reclamacionesynoconformidadeswcds_40_tfhisacco = AV71TFHisAcCo ;
      AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel = AV72TFHisAcCo_Sel ;
      AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot = AV73TFHisAcCot ;
      AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel = AV74TFHisAcCot_Sel ;
      AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco = AV75TFHisAdEAcCo ;
      AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel = AV76TFHisAdEAcCo_Sel ;
      AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct = AV77TFHisAdEAcCt ;
      AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel = AV78TFHisAdEAcCt_Sel ;
      AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc = AV99TFHisTipArtDsc ;
      AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel = AV100TFHisTipArtDsc_Sel ;
      AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc = AV101TFHisTipColDsc ;
      AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel = AV102TFHisTipColDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV5Emprcod, AV6Clicod, AV83Clicod_to, AV7HisreoFec, AV8HisreoFec_to, AV9HisEstReo, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV32TFHisEstReo_Sels, AV33TFHisReoFec, AV37TFHisReoHDR, AV38TFHisReoHDR_Sel, AV39TFHisreoLote, AV40TFHisreoLote_Sel, AV41TFCliNom, AV42TFCliNom_Sel, AV43TFHisBarSer, AV44TFHisBarSer_Sel, AV45TFHisReoDsc, AV46TFHisReoDsc_Sel, AV47TFHisColNom, AV48TFHisColNom_Sel, AV49TFHisNomCli, AV50TFHisNomCli_Sel, AV51TFHisOpeTur, AV52TFHisOpeTur_To, AV53TFMaqCod, AV54TFMaqCod_Sel, AV55TFHisBarKgm, AV56TFHisBarKgm_To, AV57TFHisBarMtr, AV58TFHisBarMtr_To, AV59TFCostCausa, AV60TFCostCausa_To, AV90TFHisreoValorCausa, AV91TFHisreoValorCausa_To, AV61TFTipDefDsc, AV62TFTipDefDsc_Sel, AV63TFDscCausa, AV64TFDscCausa_Sel, AV65TFRps_Dsc, AV66TFRps_Dsc_Sel, AV67TFHisReoTn, AV68TFHisReoTn_To, AV69TFHisOpecod, AV70TFHisOpecod_To, AV71TFHisAcCo, AV72TFHisAcCo_Sel, AV73TFHisAcCot, AV74TFHisAcCot_Sel, AV75TFHisAdEAcCo, AV76TFHisAdEAcCo_Sel, AV77TFHisAdEAcCt, AV78TFHisAdEAcCt_Sel, AV99TFHisTipArtDsc, AV100TFHisTipArtDsc_Sel, AV101TFHisTipColDsc, AV102TFHisTipColDsc_Sel, AV156Pgmname, AV17OrderedBy, AV18OrderedDsc, AV84TotHisBarKgm, AV86TotHisBarMtr, AV92TotHisreoValorCausa, AV95carvitin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV105Reclamacionesynoconformidadeswcds_1_filterfulltext = AV20FilterFullText ;
      AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels = AV32TFHisEstReo_Sels ;
      AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec = AV33TFHisReoFec ;
      AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr = AV37TFHisReoHDR ;
      AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel = AV38TFHisReoHDR_Sel ;
      AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote = AV39TFHisreoLote ;
      AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel = AV40TFHisreoLote_Sel ;
      AV112Reclamacionesynoconformidadeswcds_8_tfclinom = AV41TFCliNom ;
      AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel = AV42TFCliNom_Sel ;
      AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser = AV43TFHisBarSer ;
      AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel = AV44TFHisBarSer_Sel ;
      AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc = AV45TFHisReoDsc ;
      AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel = AV46TFHisReoDsc_Sel ;
      AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom = AV47TFHisColNom ;
      AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel = AV48TFHisColNom_Sel ;
      AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli = AV49TFHisNomCli ;
      AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel = AV50TFHisNomCli_Sel ;
      AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur = AV51TFHisOpeTur ;
      AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to = AV52TFHisOpeTur_To ;
      AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod = AV53TFMaqCod ;
      AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel = AV54TFMaqCod_Sel ;
      AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm = AV55TFHisBarKgm ;
      AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to = AV56TFHisBarKgm_To ;
      AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr = AV57TFHisBarMtr ;
      AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to = AV58TFHisBarMtr_To ;
      AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa = AV59TFCostCausa ;
      AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to = AV60TFCostCausa_To ;
      AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa = AV90TFHisreoValorCausa ;
      AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to = AV91TFHisreoValorCausa_To ;
      AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc = AV61TFTipDefDsc ;
      AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel = AV62TFTipDefDsc_Sel ;
      AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa = AV63TFDscCausa ;
      AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel = AV64TFDscCausa_Sel ;
      AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc = AV65TFRps_Dsc ;
      AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel = AV66TFRps_Dsc_Sel ;
      AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn = AV67TFHisReoTn ;
      AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to = AV68TFHisReoTn_To ;
      AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod = AV69TFHisOpecod ;
      AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to = AV70TFHisOpecod_To ;
      AV144Reclamacionesynoconformidadeswcds_40_tfhisacco = AV71TFHisAcCo ;
      AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel = AV72TFHisAcCo_Sel ;
      AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot = AV73TFHisAcCot ;
      AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel = AV74TFHisAcCot_Sel ;
      AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco = AV75TFHisAdEAcCo ;
      AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel = AV76TFHisAdEAcCo_Sel ;
      AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct = AV77TFHisAdEAcCt ;
      AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel = AV78TFHisAdEAcCt_Sel ;
      AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc = AV99TFHisTipArtDsc ;
      AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel = AV100TFHisTipArtDsc_Sel ;
      AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc = AV101TFHisTipColDsc ;
      AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel = AV102TFHisTipColDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV5Emprcod, AV6Clicod, AV83Clicod_to, AV7HisreoFec, AV8HisreoFec_to, AV9HisEstReo, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV32TFHisEstReo_Sels, AV33TFHisReoFec, AV37TFHisReoHDR, AV38TFHisReoHDR_Sel, AV39TFHisreoLote, AV40TFHisreoLote_Sel, AV41TFCliNom, AV42TFCliNom_Sel, AV43TFHisBarSer, AV44TFHisBarSer_Sel, AV45TFHisReoDsc, AV46TFHisReoDsc_Sel, AV47TFHisColNom, AV48TFHisColNom_Sel, AV49TFHisNomCli, AV50TFHisNomCli_Sel, AV51TFHisOpeTur, AV52TFHisOpeTur_To, AV53TFMaqCod, AV54TFMaqCod_Sel, AV55TFHisBarKgm, AV56TFHisBarKgm_To, AV57TFHisBarMtr, AV58TFHisBarMtr_To, AV59TFCostCausa, AV60TFCostCausa_To, AV90TFHisreoValorCausa, AV91TFHisreoValorCausa_To, AV61TFTipDefDsc, AV62TFTipDefDsc_Sel, AV63TFDscCausa, AV64TFDscCausa_Sel, AV65TFRps_Dsc, AV66TFRps_Dsc_Sel, AV67TFHisReoTn, AV68TFHisReoTn_To, AV69TFHisOpecod, AV70TFHisOpecod_To, AV71TFHisAcCo, AV72TFHisAcCo_Sel, AV73TFHisAcCot, AV74TFHisAcCot_Sel, AV75TFHisAdEAcCo, AV76TFHisAdEAcCo_Sel, AV77TFHisAdEAcCt, AV78TFHisAdEAcCt_Sel, AV99TFHisTipArtDsc, AV100TFHisTipArtDsc_Sel, AV101TFHisTipColDsc, AV102TFHisTipColDsc_Sel, AV156Pgmname, AV17OrderedBy, AV18OrderedDsc, AV84TotHisBarKgm, AV86TotHisBarMtr, AV92TotHisreoValorCausa, AV95carvitin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV105Reclamacionesynoconformidadeswcds_1_filterfulltext = AV20FilterFullText ;
      AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels = AV32TFHisEstReo_Sels ;
      AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec = AV33TFHisReoFec ;
      AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr = AV37TFHisReoHDR ;
      AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel = AV38TFHisReoHDR_Sel ;
      AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote = AV39TFHisreoLote ;
      AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel = AV40TFHisreoLote_Sel ;
      AV112Reclamacionesynoconformidadeswcds_8_tfclinom = AV41TFCliNom ;
      AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel = AV42TFCliNom_Sel ;
      AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser = AV43TFHisBarSer ;
      AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel = AV44TFHisBarSer_Sel ;
      AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc = AV45TFHisReoDsc ;
      AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel = AV46TFHisReoDsc_Sel ;
      AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom = AV47TFHisColNom ;
      AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel = AV48TFHisColNom_Sel ;
      AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli = AV49TFHisNomCli ;
      AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel = AV50TFHisNomCli_Sel ;
      AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur = AV51TFHisOpeTur ;
      AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to = AV52TFHisOpeTur_To ;
      AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod = AV53TFMaqCod ;
      AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel = AV54TFMaqCod_Sel ;
      AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm = AV55TFHisBarKgm ;
      AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to = AV56TFHisBarKgm_To ;
      AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr = AV57TFHisBarMtr ;
      AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to = AV58TFHisBarMtr_To ;
      AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa = AV59TFCostCausa ;
      AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to = AV60TFCostCausa_To ;
      AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa = AV90TFHisreoValorCausa ;
      AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to = AV91TFHisreoValorCausa_To ;
      AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc = AV61TFTipDefDsc ;
      AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel = AV62TFTipDefDsc_Sel ;
      AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa = AV63TFDscCausa ;
      AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel = AV64TFDscCausa_Sel ;
      AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc = AV65TFRps_Dsc ;
      AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel = AV66TFRps_Dsc_Sel ;
      AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn = AV67TFHisReoTn ;
      AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to = AV68TFHisReoTn_To ;
      AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod = AV69TFHisOpecod ;
      AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to = AV70TFHisOpecod_To ;
      AV144Reclamacionesynoconformidadeswcds_40_tfhisacco = AV71TFHisAcCo ;
      AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel = AV72TFHisAcCo_Sel ;
      AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot = AV73TFHisAcCot ;
      AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel = AV74TFHisAcCot_Sel ;
      AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco = AV75TFHisAdEAcCo ;
      AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel = AV76TFHisAdEAcCo_Sel ;
      AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct = AV77TFHisAdEAcCt ;
      AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel = AV78TFHisAdEAcCt_Sel ;
      AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc = AV99TFHisTipArtDsc ;
      AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel = AV100TFHisTipArtDsc_Sel ;
      AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc = AV101TFHisTipColDsc ;
      AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel = AV102TFHisTipColDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV5Emprcod, AV6Clicod, AV83Clicod_to, AV7HisreoFec, AV8HisreoFec_to, AV9HisEstReo, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV32TFHisEstReo_Sels, AV33TFHisReoFec, AV37TFHisReoHDR, AV38TFHisReoHDR_Sel, AV39TFHisreoLote, AV40TFHisreoLote_Sel, AV41TFCliNom, AV42TFCliNom_Sel, AV43TFHisBarSer, AV44TFHisBarSer_Sel, AV45TFHisReoDsc, AV46TFHisReoDsc_Sel, AV47TFHisColNom, AV48TFHisColNom_Sel, AV49TFHisNomCli, AV50TFHisNomCli_Sel, AV51TFHisOpeTur, AV52TFHisOpeTur_To, AV53TFMaqCod, AV54TFMaqCod_Sel, AV55TFHisBarKgm, AV56TFHisBarKgm_To, AV57TFHisBarMtr, AV58TFHisBarMtr_To, AV59TFCostCausa, AV60TFCostCausa_To, AV90TFHisreoValorCausa, AV91TFHisreoValorCausa_To, AV61TFTipDefDsc, AV62TFTipDefDsc_Sel, AV63TFDscCausa, AV64TFDscCausa_Sel, AV65TFRps_Dsc, AV66TFRps_Dsc_Sel, AV67TFHisReoTn, AV68TFHisReoTn_To, AV69TFHisOpecod, AV70TFHisOpecod_To, AV71TFHisAcCo, AV72TFHisAcCo_Sel, AV73TFHisAcCot, AV74TFHisAcCot_Sel, AV75TFHisAdEAcCo, AV76TFHisAdEAcCo_Sel, AV77TFHisAdEAcCt, AV78TFHisAdEAcCt_Sel, AV99TFHisTipArtDsc, AV100TFHisTipArtDsc_Sel, AV101TFHisTipColDsc, AV102TFHisTipColDsc_Sel, AV156Pgmname, AV17OrderedBy, AV18OrderedDsc, AV84TotHisBarKgm, AV86TotHisBarMtr, AV92TotHisreoValorCausa, AV95carvitin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV105Reclamacionesynoconformidadeswcds_1_filterfulltext = AV20FilterFullText ;
      AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels = AV32TFHisEstReo_Sels ;
      AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec = AV33TFHisReoFec ;
      AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr = AV37TFHisReoHDR ;
      AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel = AV38TFHisReoHDR_Sel ;
      AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote = AV39TFHisreoLote ;
      AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel = AV40TFHisreoLote_Sel ;
      AV112Reclamacionesynoconformidadeswcds_8_tfclinom = AV41TFCliNom ;
      AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel = AV42TFCliNom_Sel ;
      AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser = AV43TFHisBarSer ;
      AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel = AV44TFHisBarSer_Sel ;
      AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc = AV45TFHisReoDsc ;
      AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel = AV46TFHisReoDsc_Sel ;
      AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom = AV47TFHisColNom ;
      AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel = AV48TFHisColNom_Sel ;
      AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli = AV49TFHisNomCli ;
      AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel = AV50TFHisNomCli_Sel ;
      AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur = AV51TFHisOpeTur ;
      AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to = AV52TFHisOpeTur_To ;
      AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod = AV53TFMaqCod ;
      AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel = AV54TFMaqCod_Sel ;
      AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm = AV55TFHisBarKgm ;
      AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to = AV56TFHisBarKgm_To ;
      AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr = AV57TFHisBarMtr ;
      AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to = AV58TFHisBarMtr_To ;
      AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa = AV59TFCostCausa ;
      AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to = AV60TFCostCausa_To ;
      AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa = AV90TFHisreoValorCausa ;
      AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to = AV91TFHisreoValorCausa_To ;
      AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc = AV61TFTipDefDsc ;
      AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel = AV62TFTipDefDsc_Sel ;
      AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa = AV63TFDscCausa ;
      AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel = AV64TFDscCausa_Sel ;
      AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc = AV65TFRps_Dsc ;
      AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel = AV66TFRps_Dsc_Sel ;
      AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn = AV67TFHisReoTn ;
      AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to = AV68TFHisReoTn_To ;
      AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod = AV69TFHisOpecod ;
      AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to = AV70TFHisOpecod_To ;
      AV144Reclamacionesynoconformidadeswcds_40_tfhisacco = AV71TFHisAcCo ;
      AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel = AV72TFHisAcCo_Sel ;
      AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot = AV73TFHisAcCot ;
      AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel = AV74TFHisAcCot_Sel ;
      AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco = AV75TFHisAdEAcCo ;
      AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel = AV76TFHisAdEAcCo_Sel ;
      AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct = AV77TFHisAdEAcCt ;
      AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel = AV78TFHisAdEAcCt_Sel ;
      AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc = AV99TFHisTipArtDsc ;
      AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel = AV100TFHisTipArtDsc_Sel ;
      AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc = AV101TFHisTipColDsc ;
      AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel = AV102TFHisTipColDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV5Emprcod, AV6Clicod, AV83Clicod_to, AV7HisreoFec, AV8HisreoFec_to, AV9HisEstReo, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV32TFHisEstReo_Sels, AV33TFHisReoFec, AV37TFHisReoHDR, AV38TFHisReoHDR_Sel, AV39TFHisreoLote, AV40TFHisreoLote_Sel, AV41TFCliNom, AV42TFCliNom_Sel, AV43TFHisBarSer, AV44TFHisBarSer_Sel, AV45TFHisReoDsc, AV46TFHisReoDsc_Sel, AV47TFHisColNom, AV48TFHisColNom_Sel, AV49TFHisNomCli, AV50TFHisNomCli_Sel, AV51TFHisOpeTur, AV52TFHisOpeTur_To, AV53TFMaqCod, AV54TFMaqCod_Sel, AV55TFHisBarKgm, AV56TFHisBarKgm_To, AV57TFHisBarMtr, AV58TFHisBarMtr_To, AV59TFCostCausa, AV60TFCostCausa_To, AV90TFHisreoValorCausa, AV91TFHisreoValorCausa_To, AV61TFTipDefDsc, AV62TFTipDefDsc_Sel, AV63TFDscCausa, AV64TFDscCausa_Sel, AV65TFRps_Dsc, AV66TFRps_Dsc_Sel, AV67TFHisReoTn, AV68TFHisReoTn_To, AV69TFHisOpecod, AV70TFHisOpecod_To, AV71TFHisAcCo, AV72TFHisAcCo_Sel, AV73TFHisAcCot, AV74TFHisAcCot_Sel, AV75TFHisAdEAcCo, AV76TFHisAdEAcCo_Sel, AV77TFHisAdEAcCt, AV78TFHisAdEAcCt_Sel, AV99TFHisTipArtDsc, AV100TFHisTipArtDsc_Sel, AV101TFHisTipColDsc, AV102TFHisTipColDsc_Sel, AV156Pgmname, AV17OrderedBy, AV18OrderedDsc, AV84TotHisBarKgm, AV86TotHisBarMtr, AV92TotHisreoValorCausa, AV95carvitin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV156Pgmname = "ReclamacionesyNoConformidadesWC" ;
      Gx_err = (short)(0) ;
      edtavTotvaluehisbarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehisbarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehisbarkgm_Enabled), 5, 0), true);
      edtavTotvaluehisbarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehisbarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehisbarmtr_Enabled), 5, 0), true);
      edtavTotvaluehisreovalorcausa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehisreovalorcausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehisreovalorcausa_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup15L0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1815L2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV28ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV79DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV25ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV81GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV82GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV6Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV83Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV83Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7HisreoFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV7HisreoFec"), 0) ;
         wcpOAV8HisreoFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8HisreoFec_to"), 0) ;
         wcpOAV9HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( sPrefix+"DDO_GRID_Allowmultipleselection") ;
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
         AV20FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20FilterFullText", AV20FilterFullText);
         AV85TotValueHisBarKgm = httpContext.cgiGet( edtavTotvaluehisbarkgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TotValueHisBarKgm", AV85TotValueHisBarKgm);
         AV87TotValueHisBarMtr = httpContext.cgiGet( edtavTotvaluehisbarmtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TotValueHisBarMtr", AV87TotValueHisBarMtr);
         AV93TotValueHisreoValorCausa = httpContext.cgiGet( edtavTotvaluehisreovalorcausa_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TotValueHisreoValorCausa", AV93TotValueHisreoValorCausa);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisreofecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISREOFECAUXDATE");
            GX_FocusControl = edtavDdo_hisreofecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35DDO_HisReoFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35DDO_HisReoFecAuxDate", localUtil.format(AV35DDO_HisReoFecAuxDate, "99/99/99"));
         }
         else
         {
            AV35DDO_HisReoFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisreofecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35DDO_HisReoFecAuxDate", localUtil.format(AV35DDO_HisReoFecAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV20FilterFullText) != 0 )
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
      e1815L2 ();
      if (returnInSub) return;
   }

   public void e1815L2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV96Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV96Station = GXt_char1 ;
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV97EmprNom ;
      GXv_char4[0] = AV98UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV96Station, GXv_char2, GXv_char3, GXv_char4) ;
      reclamacionesynoconformidadeswc_impl.this.AV5Emprcod = GXv_char2[0] ;
      reclamacionesynoconformidadeswc_impl.this.AV97EmprNom = GXv_char3[0] ;
      reclamacionesynoconformidadeswc_impl.this.AV98UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      GXt_int5 = (byte)(AV95carvitin) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV95carvitin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95carvitin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95carvitin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV95carvitin), "ZZZ9")));
      GXt_char1 = AV96Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV96Station = GXt_char1 ;
      GXv_char4[0] = AV5Emprcod ;
      GXv_char3[0] = AV97EmprNom ;
      GXv_char2[0] = AV98UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV96Station, GXv_char4, GXv_char3, GXv_char2) ;
      reclamacionesynoconformidadeswc_impl.this.AV5Emprcod = GXv_char4[0] ;
      reclamacionesynoconformidadeswc_impl.this.AV97EmprNom = GXv_char3[0] ;
      reclamacionesynoconformidadeswc_impl.this.AV98UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV17OrderedBy < 1 )
      {
         AV17OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV79DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV79DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e1915L2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV11WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV11WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV30ManageFiltersExecutionStep == 1 )
      {
         AV30ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ManageFiltersExecutionStep", GXutil.str( AV30ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV30ManageFiltersExecutionStep == 2 )
      {
         AV30ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ManageFiltersExecutionStep", GXutil.str( AV30ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV27Session.getValue("ReclamacionesyNoConformidadesWCColumnsSelector"), "") != 0 )
      {
         AV23ColumnsSelectorXML = AV27Session.getValue("ReclamacionesyNoConformidadesWCColumnsSelector") ;
         AV25ColumnsSelector.fromxml(AV23ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      cmbHisEstReo.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbHisEstReo.getInternalname(), "Visible", GXutil.ltrimstr( cmbHisEstReo.getVisible(), 5, 0), !bGXsfl_41_Refreshing);
      edtHisReoFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisReoFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisReoFec_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisReoHDR_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisReoHDR_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisReoHDR_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisreoLote_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisreoLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisreoLote_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisBarSer_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisReoDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisReoDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisReoDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisColNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisNomCli_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisOpeTur_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisOpeTur_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisOpeTur_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisBarKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisBarKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisBarKgm_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisBarMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisBarMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisBarMtr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtCostCausa_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCostCausa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostCausa_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisreoValo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisreoValo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisreoValo_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtTipDefDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtTipDefDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtDscCausa_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDscCausa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDscCausa_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtRps_Dsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRps_Dsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRps_Dsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisReoTn_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisReoTn_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisReoTn_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisOpecod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisOpecod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisOpecod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisAcCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisAcCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisAcCo_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisAcCot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisAcCot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisAcCot_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisAdEAcCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisAdEAcCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisAdEAcCo_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisAdEAcCt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisAdEAcCt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisAdEAcCt_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisTipArtD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisTipArtD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisTipArtD_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtHisTipColD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHisTipColD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisTipColD_Visible), 5, 0), !bGXsfl_41_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV81GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81GridCurrentPage), 10, 0));
      AV82GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      AV105Reclamacionesynoconformidadeswcds_1_filterfulltext = AV20FilterFullText ;
      AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels = AV32TFHisEstReo_Sels ;
      AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec = AV33TFHisReoFec ;
      AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr = AV37TFHisReoHDR ;
      AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel = AV38TFHisReoHDR_Sel ;
      AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote = AV39TFHisreoLote ;
      AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel = AV40TFHisreoLote_Sel ;
      AV112Reclamacionesynoconformidadeswcds_8_tfclinom = AV41TFCliNom ;
      AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel = AV42TFCliNom_Sel ;
      AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser = AV43TFHisBarSer ;
      AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel = AV44TFHisBarSer_Sel ;
      AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc = AV45TFHisReoDsc ;
      AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel = AV46TFHisReoDsc_Sel ;
      AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom = AV47TFHisColNom ;
      AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel = AV48TFHisColNom_Sel ;
      AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli = AV49TFHisNomCli ;
      AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel = AV50TFHisNomCli_Sel ;
      AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur = AV51TFHisOpeTur ;
      AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to = AV52TFHisOpeTur_To ;
      AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod = AV53TFMaqCod ;
      AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel = AV54TFMaqCod_Sel ;
      AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm = AV55TFHisBarKgm ;
      AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to = AV56TFHisBarKgm_To ;
      AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr = AV57TFHisBarMtr ;
      AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to = AV58TFHisBarMtr_To ;
      AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa = AV59TFCostCausa ;
      AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to = AV60TFCostCausa_To ;
      AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa = AV90TFHisreoValorCausa ;
      AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to = AV91TFHisreoValorCausa_To ;
      AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc = AV61TFTipDefDsc ;
      AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel = AV62TFTipDefDsc_Sel ;
      AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa = AV63TFDscCausa ;
      AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel = AV64TFDscCausa_Sel ;
      AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc = AV65TFRps_Dsc ;
      AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel = AV66TFRps_Dsc_Sel ;
      AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn = AV67TFHisReoTn ;
      AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to = AV68TFHisReoTn_To ;
      AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod = AV69TFHisOpecod ;
      AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to = AV70TFHisOpecod_To ;
      AV144Reclamacionesynoconformidadeswcds_40_tfhisacco = AV71TFHisAcCo ;
      AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel = AV72TFHisAcCo_Sel ;
      AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot = AV73TFHisAcCot ;
      AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel = AV74TFHisAcCot_Sel ;
      AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco = AV75TFHisAdEAcCo ;
      AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel = AV76TFHisAdEAcCo_Sel ;
      AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct = AV77TFHisAdEAcCt ;
      AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel = AV78TFHisAdEAcCt_Sel ;
      AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc = AV99TFHisTipArtDsc ;
      AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel = AV100TFHisTipArtDsc_Sel ;
      AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc = AV101TFHisTipColDsc ;
      AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel = AV102TFHisTipColDsc_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ColumnsSelector", AV25ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ManageFiltersData", AV28ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV15GridState", AV15GridState);
   }

   public void e1215L2( )
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
         AV80PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV80PageToGo) ;
      }
   }

   public void e1315L2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1415L2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV17OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         AV18OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedDsc", AV18OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisEstReo") == 0 )
         {
            AV31TFHisEstReo_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFHisEstReo_SelsJson", AV31TFHisEstReo_SelsJson);
            AV32TFHisEstReo_Sels.fromJSonString(GXutil.strReplace( AV31TFHisEstReo_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisReoFec") == 0 )
         {
            AV33TFHisReoFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFHisReoFec", localUtil.format(AV33TFHisReoFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisReoHDR") == 0 )
         {
            AV37TFHisReoHDR = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFHisReoHDR", AV37TFHisReoHDR);
            AV38TFHisReoHDR_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFHisReoHDR_Sel", AV38TFHisReoHDR_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisreoLote") == 0 )
         {
            AV39TFHisreoLote = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFHisreoLote", AV39TFHisreoLote);
            AV40TFHisreoLote_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFHisreoLote_Sel", AV40TFHisreoLote_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV41TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFCliNom", AV41TFCliNom);
            AV42TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFCliNom_Sel", AV42TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisBarSer") == 0 )
         {
            AV43TFHisBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFHisBarSer", AV43TFHisBarSer);
            AV44TFHisBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFHisBarSer_Sel", AV44TFHisBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisReoDsc") == 0 )
         {
            AV45TFHisReoDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFHisReoDsc", AV45TFHisReoDsc);
            AV46TFHisReoDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFHisReoDsc_Sel", AV46TFHisReoDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisColNom") == 0 )
         {
            AV47TFHisColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFHisColNom", AV47TFHisColNom);
            AV48TFHisColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFHisColNom_Sel", AV48TFHisColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisNomCli") == 0 )
         {
            AV49TFHisNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFHisNomCli", AV49TFHisNomCli);
            AV50TFHisNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFHisNomCli_Sel", AV50TFHisNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisOpeTur") == 0 )
         {
            AV51TFHisOpeTur = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFHisOpeTur", GXutil.str( AV51TFHisOpeTur, 1, 0));
            AV52TFHisOpeTur_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFHisOpeTur_To", GXutil.str( AV52TFHisOpeTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV53TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMaqCod", AV53TFMaqCod);
            AV54TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFMaqCod_Sel", AV54TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisBarKgm") == 0 )
         {
            AV55TFHisBarKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFHisBarKgm", GXutil.ltrimstr( AV55TFHisBarKgm, 9, 2));
            AV56TFHisBarKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFHisBarKgm_To", GXutil.ltrimstr( AV56TFHisBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisBarMtr") == 0 )
         {
            AV57TFHisBarMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFHisBarMtr", GXutil.ltrimstr( AV57TFHisBarMtr, 9, 2));
            AV58TFHisBarMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFHisBarMtr_To", GXutil.ltrimstr( AV58TFHisBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CostCausa") == 0 )
         {
            AV59TFCostCausa = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFCostCausa", GXutil.ltrimstr( AV59TFCostCausa, 11, 3));
            AV60TFCostCausa_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFCostCausa_To", GXutil.ltrimstr( AV60TFCostCausa_To, 11, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisreoValorCausa") == 0 )
         {
            AV90TFHisreoValorCausa = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFHisreoValorCausa", GXutil.ltrimstr( AV90TFHisreoValorCausa, 11, 3));
            AV91TFHisreoValorCausa_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFHisreoValorCausa_To", GXutil.ltrimstr( AV91TFHisreoValorCausa_To, 11, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipDefDsc") == 0 )
         {
            AV61TFTipDefDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFTipDefDsc", AV61TFTipDefDsc);
            AV62TFTipDefDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFTipDefDsc_Sel", AV62TFTipDefDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DscCausa") == 0 )
         {
            AV63TFDscCausa = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFDscCausa", AV63TFDscCausa);
            AV64TFDscCausa_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFDscCausa_Sel", AV64TFDscCausa_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Rps_Dsc") == 0 )
         {
            AV65TFRps_Dsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFRps_Dsc", AV65TFRps_Dsc);
            AV66TFRps_Dsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFRps_Dsc_Sel", AV66TFRps_Dsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisReoTn") == 0 )
         {
            AV67TFHisReoTn = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFHisReoTn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFHisReoTn), 6, 0));
            AV68TFHisReoTn_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFHisReoTn_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFHisReoTn_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisOpecod") == 0 )
         {
            AV69TFHisOpecod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFHisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFHisOpecod), 6, 0));
            AV70TFHisOpecod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFHisOpecod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFHisOpecod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisAcCo") == 0 )
         {
            AV71TFHisAcCo = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFHisAcCo", AV71TFHisAcCo);
            AV72TFHisAcCo_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFHisAcCo_Sel", AV72TFHisAcCo_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisAcCot") == 0 )
         {
            AV73TFHisAcCot = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFHisAcCot", AV73TFHisAcCot);
            AV74TFHisAcCot_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFHisAcCot_Sel", AV74TFHisAcCot_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisAdEAcCo") == 0 )
         {
            AV75TFHisAdEAcCo = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFHisAdEAcCo", AV75TFHisAdEAcCo);
            AV76TFHisAdEAcCo_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFHisAdEAcCo_Sel", AV76TFHisAdEAcCo_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisAdEAcCt") == 0 )
         {
            AV77TFHisAdEAcCt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFHisAdEAcCt", AV77TFHisAdEAcCt);
            AV78TFHisAdEAcCt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFHisAdEAcCt_Sel", AV78TFHisAdEAcCt_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisTipArtDsc") == 0 )
         {
            AV99TFHisTipArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFHisTipArtDsc", AV99TFHisTipArtDsc);
            AV100TFHisTipArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100TFHisTipArtDsc_Sel", AV100TFHisTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisTipColDsc") == 0 )
         {
            AV101TFHisTipColDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFHisTipColDsc", AV101TFHisTipColDsc);
            AV102TFHisTipColDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFHisTipColDsc_Sel", AV102TFHisTipColDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV32TFHisEstReo_Sels", AV32TFHisEstReo_Sels);
   }

   private void e2015L2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavAccionesdegrupo.removeAllItems();
      cmbavAccionesdegrupo.addItem("0", ";fa fa-bars", (short)(0));
      cmbavAccionesdegrupo.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Modifcar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavAccionesdegrupo.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Informe", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      edtRps_Dsc_Link = formatLink("app.ficherosbasicos.tcodrpsview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A7000Rps_Cod,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","Rps_Cod","TabCode"})  ;
      edtHisTipColD_Link = formatLink("app.formulaciontinte.ttipcolview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A572HisTipCol,2,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","TipColCod","TabCode"})  ;
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
      cmbavAccionesdegrupo.setValue( GXutil.trim( GXutil.str( AV94AccionesdeGrupo, 4, 0)) );
   }

   public void e1515L2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV23ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV25ColumnsSelector.fromJSonString(AV23ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ReclamacionesyNoConformidadesWCColumnsSelector", ((GXutil.strcmp("", AV23ColumnsSelectorXML)==0) ? "" : AV25ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ColumnsSelector", AV25ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ManageFiltersData", AV28ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV15GridState", AV15GridState);
   }

   public void e1115L2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S192 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("ReclamacionesyNoConformidadesWCFilters")),GXutil.URLEncode(GXutil.rtrim(AV156Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV30ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ManageFiltersExecutionStep", GXutil.str( AV30ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("ReclamacionesyNoConformidadesWCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV30ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ManageFiltersExecutionStep", GXutil.str( AV30ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV29ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "ReclamacionesyNoConformidadesWCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         reclamacionesynoconformidadeswc_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV156Pgmname+"GridState", AV29ManageFiltersXml) ;
            AV15GridState.fromxml(AV29ManageFiltersXml, null, null);
            AV17OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
            AV18OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedDsc", AV18OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S202 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV15GridState", AV15GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV32TFHisEstReo_Sels", AV32TFHisEstReo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ColumnsSelector", AV25ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ManageFiltersData", AV28ManageFiltersData);
   }

   public void e2115L2( )
   {
      /* Accionesdegrupo_Click Routine */
      returnInSub = false ;
      if ( AV94AccionesdeGrupo == 1 )
      {
         /* Execute user subroutine: 'DO MODIFICAR' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV94AccionesdeGrupo == 2 )
      {
         /* Execute user subroutine: 'DO INFORME' */
         S222 ();
         if (returnInSub) return;
      }
      AV94AccionesdeGrupo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAccionesdegrupo.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94AccionesdeGrupo), 4, 0));
      /*  Sending Event outputs  */
      cmbavAccionesdegrupo.setValue( GXutil.trim( GXutil.str( AV94AccionesdeGrupo, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAccionesdegrupo.getInternalname(), "Values", cmbavAccionesdegrupo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ColumnsSelector", AV25ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ManageFiltersData", AV28ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV15GridState", AV15GridState);
   }

   public void e1615L2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV21ExcelFilename ;
      GXv_char3[0] = AV22ErrorMessage ;
      new app.reclamacionesynoconformidadeswcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      reclamacionesynoconformidadeswc_impl.this.AV21ExcelFilename = GXv_char4[0] ;
      reclamacionesynoconformidadeswc_impl.this.AV22ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV21ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV21ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV22ErrorMessage);
      }
   }

   public void e1715L2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.reclamacionesynoconformidadeswcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV17OrderedBy, 4, 0))+":"+(AV18OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV25ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisEstReo", "", "Tipo", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisReoFec", "", "Fecha", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisReoHDR", "", "Hdr", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisreoLote", "", "Lote", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliNom", "", "Cliente", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisBarSer", "", "Articulo", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisReoDsc", "", "Descripcion", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisColNom", "", "Color", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisNomCli", "", "Color Cliente", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisOpeTur", "", "T", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MaqCod", "", "Código Máquina", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisBarKgm", "", "Kilos", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisBarMtr", "", "Metros", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostCausa", "", "Coste Causa", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisreoValorCausa", "", "Valor", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "TipDefDsc", "", "Defecto", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DscCausa", "", "Causa", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Rps_Dsc", "", " Responsabilidad", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisReoTn", "", "N Int", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisOpecod", "", "Operario", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisAcCo", "", "Acciones Corrección a implementar:", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisAcCot", "", "Acciones Correctivas a Implementar:", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisAdEAcCo", "", "Analisis de Corrección", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisAdEAcCt", "", "Analisis  Accion Correctivas", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisTipArtDsc", "", "de Articulo", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisTipColDsc", "", "Tipo Colorante", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV24UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ReclamacionesyNoConformidadesWCColumnsSelector", GXv_char4) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "ReclamacionesyNoConformidadesWCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV28ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV20FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20FilterFullText", AV20FilterFullText);
      AV32TFHisEstReo_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV33TFHisReoFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFHisReoFec", localUtil.format(AV33TFHisReoFec, "99/99/99"));
      AV37TFHisReoHDR = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFHisReoHDR", AV37TFHisReoHDR);
      AV38TFHisReoHDR_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFHisReoHDR_Sel", AV38TFHisReoHDR_Sel);
      AV39TFHisreoLote = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFHisreoLote", AV39TFHisreoLote);
      AV40TFHisreoLote_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFHisreoLote_Sel", AV40TFHisreoLote_Sel);
      AV41TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFCliNom", AV41TFCliNom);
      AV42TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFCliNom_Sel", AV42TFCliNom_Sel);
      AV43TFHisBarSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFHisBarSer", AV43TFHisBarSer);
      AV44TFHisBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFHisBarSer_Sel", AV44TFHisBarSer_Sel);
      AV45TFHisReoDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFHisReoDsc", AV45TFHisReoDsc);
      AV46TFHisReoDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFHisReoDsc_Sel", AV46TFHisReoDsc_Sel);
      AV47TFHisColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFHisColNom", AV47TFHisColNom);
      AV48TFHisColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFHisColNom_Sel", AV48TFHisColNom_Sel);
      AV49TFHisNomCli = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFHisNomCli", AV49TFHisNomCli);
      AV50TFHisNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFHisNomCli_Sel", AV50TFHisNomCli_Sel);
      AV51TFHisOpeTur = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFHisOpeTur", GXutil.str( AV51TFHisOpeTur, 1, 0));
      AV52TFHisOpeTur_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFHisOpeTur_To", GXutil.str( AV52TFHisOpeTur_To, 1, 0));
      AV53TFMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMaqCod", AV53TFMaqCod);
      AV54TFMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFMaqCod_Sel", AV54TFMaqCod_Sel);
      AV55TFHisBarKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFHisBarKgm", GXutil.ltrimstr( AV55TFHisBarKgm, 9, 2));
      AV56TFHisBarKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFHisBarKgm_To", GXutil.ltrimstr( AV56TFHisBarKgm_To, 9, 2));
      AV57TFHisBarMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFHisBarMtr", GXutil.ltrimstr( AV57TFHisBarMtr, 9, 2));
      AV58TFHisBarMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFHisBarMtr_To", GXutil.ltrimstr( AV58TFHisBarMtr_To, 9, 2));
      AV59TFCostCausa = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFCostCausa", GXutil.ltrimstr( AV59TFCostCausa, 11, 3));
      AV60TFCostCausa_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFCostCausa_To", GXutil.ltrimstr( AV60TFCostCausa_To, 11, 3));
      AV90TFHisreoValorCausa = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFHisreoValorCausa", GXutil.ltrimstr( AV90TFHisreoValorCausa, 11, 3));
      AV91TFHisreoValorCausa_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFHisreoValorCausa_To", GXutil.ltrimstr( AV91TFHisreoValorCausa_To, 11, 3));
      AV61TFTipDefDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFTipDefDsc", AV61TFTipDefDsc);
      AV62TFTipDefDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFTipDefDsc_Sel", AV62TFTipDefDsc_Sel);
      AV63TFDscCausa = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFDscCausa", AV63TFDscCausa);
      AV64TFDscCausa_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFDscCausa_Sel", AV64TFDscCausa_Sel);
      AV65TFRps_Dsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFRps_Dsc", AV65TFRps_Dsc);
      AV66TFRps_Dsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFRps_Dsc_Sel", AV66TFRps_Dsc_Sel);
      AV67TFHisReoTn = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFHisReoTn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFHisReoTn), 6, 0));
      AV68TFHisReoTn_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFHisReoTn_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFHisReoTn_To), 6, 0));
      AV69TFHisOpecod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFHisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFHisOpecod), 6, 0));
      AV70TFHisOpecod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFHisOpecod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFHisOpecod_To), 6, 0));
      AV71TFHisAcCo = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFHisAcCo", AV71TFHisAcCo);
      AV72TFHisAcCo_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFHisAcCo_Sel", AV72TFHisAcCo_Sel);
      AV73TFHisAcCot = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFHisAcCot", AV73TFHisAcCot);
      AV74TFHisAcCot_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFHisAcCot_Sel", AV74TFHisAcCot_Sel);
      AV75TFHisAdEAcCo = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFHisAdEAcCo", AV75TFHisAdEAcCo);
      AV76TFHisAdEAcCo_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFHisAdEAcCo_Sel", AV76TFHisAdEAcCo_Sel);
      AV77TFHisAdEAcCt = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFHisAdEAcCt", AV77TFHisAdEAcCt);
      AV78TFHisAdEAcCt_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFHisAdEAcCt_Sel", AV78TFHisAdEAcCt_Sel);
      AV99TFHisTipArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFHisTipArtDsc", AV99TFHisTipArtDsc);
      AV100TFHisTipArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100TFHisTipArtDsc_Sel", AV100TFHisTipArtDsc_Sel);
      AV101TFHisTipColDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFHisTipColDsc", AV101TFHisTipColDsc);
      AV102TFHisTipColDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFHisTipColDsc_Sel", AV102TFHisTipColDsc_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S212( )
   {
      /* 'DO MODIFICAR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webwkp85", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A539HisBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A545HisCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A544HisCodPar))}, new String[] {"EmprCod","HisBarCod","HisCodReo","HisCodPar"}) , new Object[] {"A396EmprCod","A539HisBarCod","A545HisCodReo","A544HisCodPar"});
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S222( )
   {
      /* 'DO INFORME' Routine */
      returnInSub = false ;
      if ( ( AV95carvitin == 1 ) && ( A548HisEstReo == 1 ) )
      {
         httpContext.popup(formatLink("app.rcvnc000", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(A2297HisReoTn,6,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","HisReoTn","Output"}) , new Object[] {"AV5Emprcod","A2297HisReoTn",""});
      }
      else if ( ( AV95carvitin == 1 ) && ( A548HisEstReo == 2 ) )
      {
         httpContext.popup(formatLink("app.rcvrc000", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(A2297HisReoTn,6,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","HisReoTn","Output"}) , new Object[] {"AV5Emprcod","A2297HisReoTn",""});
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue(AV156Pgmname+"GridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV156Pgmname+"GridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV27Session.getValue(AV156Pgmname+"GridState"), null, null);
      }
      AV17OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
      AV18OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedDsc", AV18OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV15GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV15GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV15GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S202( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV157GXV1 = 1 ;
      while ( AV157GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV157GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV20FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20FilterFullText", AV20FilterFullText);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISESTREO_SEL") == 0 )
         {
            AV31TFHisEstReo_SelsJson = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFHisEstReo_SelsJson", AV31TFHisEstReo_SelsJson);
            AV32TFHisEstReo_Sels.fromJSonString(AV31TFHisEstReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOFEC") == 0 )
         {
            AV33TFHisReoFec = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFHisReoFec", localUtil.format(AV33TFHisReoFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOHDR") == 0 )
         {
            AV37TFHisReoHDR = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFHisReoHDR", AV37TFHisReoHDR);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOHDR_SEL") == 0 )
         {
            AV38TFHisReoHDR_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFHisReoHDR_Sel", AV38TFHisReoHDR_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOLOTE") == 0 )
         {
            AV39TFHisreoLote = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFHisreoLote", AV39TFHisreoLote);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOLOTE_SEL") == 0 )
         {
            AV40TFHisreoLote_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFHisreoLote_Sel", AV40TFHisreoLote_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV41TFCliNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFCliNom", AV41TFCliNom);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV42TFCliNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFCliNom_Sel", AV42TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARSER") == 0 )
         {
            AV43TFHisBarSer = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFHisBarSer", AV43TFHisBarSer);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARSER_SEL") == 0 )
         {
            AV44TFHisBarSer_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFHisBarSer_Sel", AV44TFHisBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREODSC") == 0 )
         {
            AV45TFHisReoDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFHisReoDsc", AV45TFHisReoDsc);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREODSC_SEL") == 0 )
         {
            AV46TFHisReoDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFHisReoDsc_Sel", AV46TFHisReoDsc_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISCOLNOM") == 0 )
         {
            AV47TFHisColNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFHisColNom", AV47TFHisColNom);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISCOLNOM_SEL") == 0 )
         {
            AV48TFHisColNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFHisColNom_Sel", AV48TFHisColNom_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISNOMCLI") == 0 )
         {
            AV49TFHisNomCli = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFHisNomCli", AV49TFHisNomCli);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISNOMCLI_SEL") == 0 )
         {
            AV50TFHisNomCli_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFHisNomCli_Sel", AV50TFHisNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISOPETUR") == 0 )
         {
            AV51TFHisOpeTur = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFHisOpeTur", GXutil.str( AV51TFHisOpeTur, 1, 0));
            AV52TFHisOpeTur_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFHisOpeTur_To", GXutil.str( AV52TFHisOpeTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV53TFMaqCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFMaqCod", AV53TFMaqCod);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV54TFMaqCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFMaqCod_Sel", AV54TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARKGM") == 0 )
         {
            AV55TFHisBarKgm = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFHisBarKgm", GXutil.ltrimstr( AV55TFHisBarKgm, 9, 2));
            AV56TFHisBarKgm_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFHisBarKgm_To", GXutil.ltrimstr( AV56TFHisBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARMTR") == 0 )
         {
            AV57TFHisBarMtr = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFHisBarMtr", GXutil.ltrimstr( AV57TFHisBarMtr, 9, 2));
            AV58TFHisBarMtr_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFHisBarMtr_To", GXutil.ltrimstr( AV58TFHisBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOSTCAUSA") == 0 )
         {
            AV59TFCostCausa = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFCostCausa", GXutil.ltrimstr( AV59TFCostCausa, 11, 3));
            AV60TFCostCausa_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFCostCausa_To", GXutil.ltrimstr( AV60TFCostCausa_To, 11, 3));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOVALORCAUSA") == 0 )
         {
            AV90TFHisreoValorCausa = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFHisreoValorCausa", GXutil.ltrimstr( AV90TFHisreoValorCausa, 11, 3));
            AV91TFHisreoValorCausa_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFHisreoValorCausa_To", GXutil.ltrimstr( AV91TFHisreoValorCausa_To, 11, 3));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDEFDSC") == 0 )
         {
            AV61TFTipDefDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFTipDefDsc", AV61TFTipDefDsc);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDEFDSC_SEL") == 0 )
         {
            AV62TFTipDefDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFTipDefDsc_Sel", AV62TFTipDefDsc_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSCCAUSA") == 0 )
         {
            AV63TFDscCausa = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFDscCausa", AV63TFDscCausa);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSCCAUSA_SEL") == 0 )
         {
            AV64TFDscCausa_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFDscCausa_Sel", AV64TFDscCausa_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPS_DSC") == 0 )
         {
            AV65TFRps_Dsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFRps_Dsc", AV65TFRps_Dsc);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPS_DSC_SEL") == 0 )
         {
            AV66TFRps_Dsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFRps_Dsc_Sel", AV66TFRps_Dsc_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOTN") == 0 )
         {
            AV67TFHisReoTn = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFHisReoTn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFHisReoTn), 6, 0));
            AV68TFHisReoTn_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFHisReoTn_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFHisReoTn_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISOPECOD") == 0 )
         {
            AV69TFHisOpecod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFHisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFHisOpecod), 6, 0));
            AV70TFHisOpecod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFHisOpecod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70TFHisOpecod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCO") == 0 )
         {
            AV71TFHisAcCo = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFHisAcCo", AV71TFHisAcCo);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCO_SEL") == 0 )
         {
            AV72TFHisAcCo_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFHisAcCo_Sel", AV72TFHisAcCo_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCOT") == 0 )
         {
            AV73TFHisAcCot = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFHisAcCot", AV73TFHisAcCot);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCOT_SEL") == 0 )
         {
            AV74TFHisAcCot_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFHisAcCot_Sel", AV74TFHisAcCot_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCO") == 0 )
         {
            AV75TFHisAdEAcCo = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFHisAdEAcCo", AV75TFHisAdEAcCo);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCO_SEL") == 0 )
         {
            AV76TFHisAdEAcCo_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFHisAdEAcCo_Sel", AV76TFHisAdEAcCo_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCT") == 0 )
         {
            AV77TFHisAdEAcCt = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFHisAdEAcCt", AV77TFHisAdEAcCt);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCT_SEL") == 0 )
         {
            AV78TFHisAdEAcCt_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFHisAdEAcCt_Sel", AV78TFHisAdEAcCt_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPARTDSC") == 0 )
         {
            AV99TFHisTipArtDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99TFHisTipArtDsc", AV99TFHisTipArtDsc);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPARTDSC_SEL") == 0 )
         {
            AV100TFHisTipArtDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100TFHisTipArtDsc_Sel", AV100TFHisTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPCOLDSC") == 0 )
         {
            AV101TFHisTipColDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TFHisTipColDsc", AV101TFHisTipColDsc);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPCOLDSC_SEL") == 0 )
         {
            AV102TFHisTipColDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV102TFHisTipColDsc_Sel", AV102TFHisTipColDsc_Sel);
         }
         AV157GXV1 = (int)(AV157GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFHisReoHDR_Sel)==0), AV38TFHisReoHDR_Sel, GXv_char4) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFHisreoLote_Sel)==0), AV40TFHisreoLote_Sel, GXv_char3) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char15 = "" ;
      GXv_char2[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFCliNom_Sel)==0), AV42TFCliNom_Sel, GXv_char2) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char15 = GXv_char2[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFHisBarSer_Sel)==0), AV44TFHisBarSer_Sel, GXv_char17) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFHisReoDsc_Sel)==0), AV46TFHisReoDsc_Sel, GXv_char19) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFHisColNom_Sel)==0), AV48TFHisColNom_Sel, GXv_char21) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFHisNomCli_Sel)==0), AV50TFHisNomCli_Sel, GXv_char23) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFMaqCod_Sel)==0), AV54TFMaqCod_Sel, GXv_char25) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFTipDefDsc_Sel)==0), AV62TFTipDefDsc_Sel, GXv_char27) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFDscCausa_Sel)==0), AV64TFDscCausa_Sel, GXv_char29) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFRps_Dsc_Sel)==0), AV66TFRps_Dsc_Sel, GXv_char31) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV72TFHisAcCo_Sel)==0), AV72TFHisAcCo_Sel, GXv_char33) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFHisAcCot_Sel)==0), AV74TFHisAcCot_Sel, GXv_char35) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV76TFHisAdEAcCo_Sel)==0), AV76TFHisAdEAcCo_Sel, GXv_char37) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char36 = GXv_char37[0] ;
      GXt_char38 = "" ;
      GXv_char39[0] = GXt_char38 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV78TFHisAdEAcCt_Sel)==0), AV78TFHisAdEAcCt_Sel, GXv_char39) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char38 = GXv_char39[0] ;
      GXt_char40 = "" ;
      GXv_char41[0] = GXt_char40 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV100TFHisTipArtDsc_Sel)==0), AV100TFHisTipArtDsc_Sel, GXv_char41) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char40 = GXv_char41[0] ;
      GXt_char42 = "" ;
      GXv_char43[0] = GXt_char42 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV102TFHisTipColDsc_Sel)==0), AV102TFHisTipColDsc_Sel, GXv_char43) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char42 = GXv_char43[0] ;
      Ddo_grid_Selectedvalue_set = ((AV32TFHisEstReo_Sels.size()==0) ? "" : AV31TFHisEstReo_SelsJson)+"||"+GXt_char1+"|"+GXt_char14+"|"+GXt_char15+"|"+GXt_char16+"|"+GXt_char18+"|"+GXt_char20+"|"+GXt_char22+"||"+GXt_char24+"|||||"+GXt_char26+"|"+GXt_char28+"|"+GXt_char30+"|||"+GXt_char32+"|"+GXt_char34+"|"+GXt_char36+"|"+GXt_char38+"|"+GXt_char40+"|"+GXt_char42 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char42 = "" ;
      GXv_char43[0] = GXt_char42 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFHisReoHDR)==0), AV37TFHisReoHDR, GXv_char43) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char42 = GXv_char43[0] ;
      GXt_char40 = "" ;
      GXv_char41[0] = GXt_char40 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFHisreoLote)==0), AV39TFHisreoLote, GXv_char41) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char40 = GXv_char41[0] ;
      GXt_char38 = "" ;
      GXv_char39[0] = GXt_char38 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFCliNom)==0), AV41TFCliNom, GXv_char39) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char38 = GXv_char39[0] ;
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFHisBarSer)==0), AV43TFHisBarSer, GXv_char37) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char36 = GXv_char37[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFHisReoDsc)==0), AV45TFHisReoDsc, GXv_char35) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFHisColNom)==0), AV47TFHisColNom, GXv_char33) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFHisNomCli)==0), AV49TFHisNomCli, GXv_char31) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFMaqCod)==0), AV53TFMaqCod, GXv_char29) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFTipDefDsc)==0), AV61TFTipDefDsc, GXv_char27) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFDscCausa)==0), AV63TFDscCausa, GXv_char25) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFRps_Dsc)==0), AV65TFRps_Dsc, GXv_char23) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFHisAcCo)==0), AV71TFHisAcCo, GXv_char21) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFHisAcCot)==0), AV73TFHisAcCot, GXv_char19) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV75TFHisAdEAcCo)==0), AV75TFHisAdEAcCo, GXv_char17) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV77TFHisAdEAcCt)==0), AV77TFHisAdEAcCt, GXv_char4) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char15 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV99TFHisTipArtDsc)==0), AV99TFHisTipArtDsc, GXv_char3) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV101TFHisTipColDsc)==0), AV101TFHisTipColDsc, GXv_char2) ;
      reclamacionesynoconformidadeswc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = "|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33TFHisReoFec)) ? "" : localUtil.dtoc( AV33TFHisReoFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char42+"|"+GXt_char40+"|"+GXt_char38+"|"+GXt_char36+"|"+GXt_char34+"|"+GXt_char32+"|"+GXt_char30+"|"+((0==AV51TFHisOpeTur) ? "" : GXutil.str( AV51TFHisOpeTur, 1, 0))+"|"+GXt_char28+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFHisBarKgm)==0) ? "" : GXutil.str( AV55TFHisBarKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFHisBarMtr)==0) ? "" : GXutil.str( AV57TFHisBarMtr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFCostCausa)==0) ? "" : GXutil.str( AV59TFCostCausa, 11, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV90TFHisreoValorCausa)==0) ? "" : GXutil.str( AV90TFHisreoValorCausa, 11, 3))+"|"+GXt_char26+"|"+GXt_char24+"|"+GXt_char22+"|"+((0==AV67TFHisReoTn) ? "" : GXutil.str( AV67TFHisReoTn, 6, 0))+"|"+((0==AV69TFHisOpecod) ? "" : GXutil.str( AV69TFHisOpecod, 6, 0))+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char15+"|"+GXt_char14+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||||||||"+((0==AV52TFHisOpeTur_To) ? "" : GXutil.str( AV52TFHisOpeTur_To, 1, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFHisBarKgm_To)==0) ? "" : GXutil.str( AV56TFHisBarKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFHisBarMtr_To)==0) ? "" : GXutil.str( AV58TFHisBarMtr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFCostCausa_To)==0) ? "" : GXutil.str( AV60TFCostCausa_To, 11, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV91TFHisreoValorCausa_To)==0) ? "" : GXutil.str( AV91TFHisreoValorCausa_To, 11, 3))+"||||"+((0==AV68TFHisReoTn_To) ? "" : GXutil.str( AV68TFHisReoTn_To, 6, 0))+"|"+((0==AV70TFHisOpecod_To) ? "" : GXutil.str( AV70TFHisOpecod_To, 6, 0))+"||||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV15GridState.fromxml(AV27Session.getValue(AV156Pgmname+"GridState"), null, null);
      AV15GridState.setgxTv_SdtWWPGridState_Orderedby( AV17OrderedBy );
      AV15GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV18OrderedDsc );
      AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV20FilterFullText)==0), (short)(0), AV20FilterFullText, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISESTREO_SEL", "", !(AV32TFHisEstReo_Sels.size()==0), (short)(0), AV32TFHisEstReo_Sels.toJSonString(false), "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISREOFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33TFHisReoFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV33TFHisReoFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISREOHDR", "", !(GXutil.strcmp("", AV37TFHisReoHDR)==0), (short)(0), AV37TFHisReoHDR, "", !(GXutil.strcmp("", AV38TFHisReoHDR_Sel)==0), AV38TFHisReoHDR_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISREOLOTE", "", !(GXutil.strcmp("", AV39TFHisreoLote)==0), (short)(0), AV39TFHisreoLote, "", !(GXutil.strcmp("", AV40TFHisreoLote_Sel)==0), AV40TFHisreoLote_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFCLINOM", "", !(GXutil.strcmp("", AV41TFCliNom)==0), (short)(0), AV41TFCliNom, "", !(GXutil.strcmp("", AV42TFCliNom_Sel)==0), AV42TFCliNom_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISBARSER", "", !(GXutil.strcmp("", AV43TFHisBarSer)==0), (short)(0), AV43TFHisBarSer, "", !(GXutil.strcmp("", AV44TFHisBarSer_Sel)==0), AV44TFHisBarSer_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISREODSC", "", !(GXutil.strcmp("", AV45TFHisReoDsc)==0), (short)(0), AV45TFHisReoDsc, "", !(GXutil.strcmp("", AV46TFHisReoDsc_Sel)==0), AV46TFHisReoDsc_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISCOLNOM", "", !(GXutil.strcmp("", AV47TFHisColNom)==0), (short)(0), AV47TFHisColNom, "", !(GXutil.strcmp("", AV48TFHisColNom_Sel)==0), AV48TFHisColNom_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISNOMCLI", "", !(GXutil.strcmp("", AV49TFHisNomCli)==0), (short)(0), AV49TFHisNomCli, "", !(GXutil.strcmp("", AV50TFHisNomCli_Sel)==0), AV50TFHisNomCli_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISOPETUR", "", !((0==AV51TFHisOpeTur)&&(0==AV52TFHisOpeTur_To)), (short)(0), GXutil.trim( GXutil.str( AV51TFHisOpeTur, 1, 0)), GXutil.trim( GXutil.str( AV52TFHisOpeTur_To, 1, 0))) ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFMAQCOD", "", !(GXutil.strcmp("", AV53TFMaqCod)==0), (short)(0), AV53TFMaqCod, "", !(GXutil.strcmp("", AV54TFMaqCod_Sel)==0), AV54TFMaqCod_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISBARKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFHisBarKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFHisBarKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV55TFHisBarKgm, 9, 2)), GXutil.trim( GXutil.str( AV56TFHisBarKgm_To, 9, 2))) ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISBARMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFHisBarMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFHisBarMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV57TFHisBarMtr, 9, 2)), GXutil.trim( GXutil.str( AV58TFHisBarMtr_To, 9, 2))) ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFCOSTCAUSA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFCostCausa)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFCostCausa_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV59TFCostCausa, 11, 3)), GXutil.trim( GXutil.str( AV60TFCostCausa_To, 11, 3))) ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISREOVALORCAUSA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV90TFHisreoValorCausa)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV91TFHisreoValorCausa_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV90TFHisreoValorCausa, 11, 3)), GXutil.trim( GXutil.str( AV91TFHisreoValorCausa_To, 11, 3))) ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFTIPDEFDSC", "", !(GXutil.strcmp("", AV61TFTipDefDsc)==0), (short)(0), AV61TFTipDefDsc, "", !(GXutil.strcmp("", AV62TFTipDefDsc_Sel)==0), AV62TFTipDefDsc_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFDSCCAUSA", "", !(GXutil.strcmp("", AV63TFDscCausa)==0), (short)(0), AV63TFDscCausa, "", !(GXutil.strcmp("", AV64TFDscCausa_Sel)==0), AV64TFDscCausa_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFRPS_DSC", "", !(GXutil.strcmp("", AV65TFRps_Dsc)==0), (short)(0), AV65TFRps_Dsc, "", !(GXutil.strcmp("", AV66TFRps_Dsc_Sel)==0), AV66TFRps_Dsc_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISREOTN", "", !((0==AV67TFHisReoTn)&&(0==AV68TFHisReoTn_To)), (short)(0), GXutil.trim( GXutil.str( AV67TFHisReoTn, 6, 0)), GXutil.trim( GXutil.str( AV68TFHisReoTn_To, 6, 0))) ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISOPECOD", "", !((0==AV69TFHisOpecod)&&(0==AV70TFHisOpecod_To)), (short)(0), GXutil.trim( GXutil.str( AV69TFHisOpecod, 6, 0)), GXutil.trim( GXutil.str( AV70TFHisOpecod_To, 6, 0))) ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISACCO", "", !(GXutil.strcmp("", AV71TFHisAcCo)==0), (short)(0), AV71TFHisAcCo, "", !(GXutil.strcmp("", AV72TFHisAcCo_Sel)==0), AV72TFHisAcCo_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISACCOT", "", !(GXutil.strcmp("", AV73TFHisAcCot)==0), (short)(0), AV73TFHisAcCot, "", !(GXutil.strcmp("", AV74TFHisAcCot_Sel)==0), AV74TFHisAcCot_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISADEACCO", "", !(GXutil.strcmp("", AV75TFHisAdEAcCo)==0), (short)(0), AV75TFHisAdEAcCo, "", !(GXutil.strcmp("", AV76TFHisAdEAcCo_Sel)==0), AV76TFHisAdEAcCo_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISADEACCT", "", !(GXutil.strcmp("", AV77TFHisAdEAcCt)==0), (short)(0), AV77TFHisAdEAcCt, "", !(GXutil.strcmp("", AV78TFHisAdEAcCt_Sel)==0), AV78TFHisAdEAcCt_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISTIPARTDSC", "", !(GXutil.strcmp("", AV99TFHisTipArtDsc)==0), (short)(0), AV99TFHisTipArtDsc, "", !(GXutil.strcmp("", AV100TFHisTipArtDsc_Sel)==0), AV100TFHisTipArtDsc_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISTIPCOLDSC", "", !(GXutil.strcmp("", AV101TFHisTipColDsc)==0), (short)(0), AV101TFHisTipColDsc, "", !(GXutil.strcmp("", AV102TFHisTipColDsc_Sel)==0), AV102TFHisTipColDsc_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState44[0] ;
      if ( ! (GXutil.strcmp("", AV5Emprcod)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5Emprcod );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (0==AV6Clicod) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV6Clicod, 6, 0) );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (0==AV83Clicod_to) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD_TO" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV83Clicod_to, 6, 0) );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV7HisreoFec)) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISREOFEC" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV7HisreoFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8HisreoFec_to)) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISREOFEC_TO" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV8HisreoFec_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (0==AV9HisEstReo) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISESTREO" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV9HisEstReo, 1, 0) );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      AV15GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV15GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV156Pgmname+"GridState", AV15GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV13TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV156Pgmname );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV12HTTPRequest.getScriptName()+"?"+AV12HTTPRequest.getQuerystring() );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "THISREO" );
      AV27Session.setValue("TrnContext", AV13TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV84TotHisBarKgm = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TotHisBarKgm", GXutil.ltrimstr( AV84TotHisBarKgm, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV84TotHisBarKgm, "ZZZZZ9.99")));
      AV86TotHisBarMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TotHisBarMtr", GXutil.ltrimstr( AV86TotHisBarMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotHisBarMtr, "ZZZZZ9.99")));
      AV92TotHisreoValorCausa = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TotHisreoValorCausa", GXutil.ltrimstr( AV92TotHisreoValorCausa, 18, 3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISREOVALORCAUSA", getSecureSignedToken( sPrefix, localUtil.format( AV92TotHisreoValorCausa, "ZZZZZZ9.999")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV105Reclamacionesynoconformidadeswcds_1_filterfulltext = AV20FilterFullText ;
      AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels = AV32TFHisEstReo_Sels ;
      AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec = AV33TFHisReoFec ;
      AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr = AV37TFHisReoHDR ;
      AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel = AV38TFHisReoHDR_Sel ;
      AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote = AV39TFHisreoLote ;
      AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel = AV40TFHisreoLote_Sel ;
      AV112Reclamacionesynoconformidadeswcds_8_tfclinom = AV41TFCliNom ;
      AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel = AV42TFCliNom_Sel ;
      AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser = AV43TFHisBarSer ;
      AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel = AV44TFHisBarSer_Sel ;
      AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc = AV45TFHisReoDsc ;
      AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel = AV46TFHisReoDsc_Sel ;
      AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom = AV47TFHisColNom ;
      AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel = AV48TFHisColNom_Sel ;
      AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli = AV49TFHisNomCli ;
      AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel = AV50TFHisNomCli_Sel ;
      AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur = AV51TFHisOpeTur ;
      AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to = AV52TFHisOpeTur_To ;
      AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod = AV53TFMaqCod ;
      AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel = AV54TFMaqCod_Sel ;
      AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm = AV55TFHisBarKgm ;
      AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to = AV56TFHisBarKgm_To ;
      AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr = AV57TFHisBarMtr ;
      AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to = AV58TFHisBarMtr_To ;
      AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa = AV59TFCostCausa ;
      AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to = AV60TFCostCausa_To ;
      AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa = AV90TFHisreoValorCausa ;
      AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to = AV91TFHisreoValorCausa_To ;
      AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc = AV61TFTipDefDsc ;
      AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel = AV62TFTipDefDsc_Sel ;
      AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa = AV63TFDscCausa ;
      AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel = AV64TFDscCausa_Sel ;
      AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc = AV65TFRps_Dsc ;
      AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel = AV66TFRps_Dsc_Sel ;
      AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn = AV67TFHisReoTn ;
      AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to = AV68TFHisReoTn_To ;
      AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod = AV69TFHisOpecod ;
      AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to = AV70TFHisOpecod_To ;
      AV144Reclamacionesynoconformidadeswcds_40_tfhisacco = AV71TFHisAcCo ;
      AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel = AV72TFHisAcCo_Sel ;
      AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot = AV73TFHisAcCot ;
      AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel = AV74TFHisAcCot_Sel ;
      AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco = AV75TFHisAdEAcCo ;
      AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel = AV76TFHisAdEAcCo_Sel ;
      AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct = AV77TFHisAdEAcCt ;
      AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel = AV78TFHisAdEAcCt_Sel ;
      AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc = AV99TFHisTipArtDsc ;
      AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel = AV100TFHisTipArtDsc_Sel ;
      AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc = AV101TFHisTipColDsc ;
      AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel = AV102TFHisTipColDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A548HisEstReo) ,
                                           AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels ,
                                           AV105Reclamacionesynoconformidadeswcds_1_filterfulltext ,
                                           Integer.valueOf(AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels.size()) ,
                                           AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec ,
                                           AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel ,
                                           AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr ,
                                           AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel ,
                                           AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote ,
                                           AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel ,
                                           AV112Reclamacionesynoconformidadeswcds_8_tfclinom ,
                                           AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel ,
                                           AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser ,
                                           AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel ,
                                           AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc ,
                                           AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel ,
                                           AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom ,
                                           AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel ,
                                           AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli ,
                                           Byte.valueOf(AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur) ,
                                           Byte.valueOf(AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to) ,
                                           AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel ,
                                           AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod ,
                                           AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm ,
                                           AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to ,
                                           AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr ,
                                           AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to ,
                                           AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa ,
                                           AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to ,
                                           AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa ,
                                           AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to ,
                                           AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel ,
                                           AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc ,
                                           AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel ,
                                           AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa ,
                                           AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel ,
                                           AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc ,
                                           Integer.valueOf(AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn) ,
                                           Integer.valueOf(AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to) ,
                                           Integer.valueOf(AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod) ,
                                           Integer.valueOf(AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to) ,
                                           AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel ,
                                           AV144Reclamacionesynoconformidadeswcds_40_tfhisacco ,
                                           AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel ,
                                           AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot ,
                                           AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel ,
                                           AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco ,
                                           AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel ,
                                           AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct ,
                                           AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel ,
                                           AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc ,
                                           AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel ,
                                           AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc ,
                                           Integer.valueOf(A539HisBarCod) ,
                                           Byte.valueOf(A545HisCodReo) ,
                                           A544HisCodPar ,
                                           A13698HisreoLote ,
                                           A279CliNom ,
                                           A542HisBarSer ,
                                           A2299HisReoDsc ,
                                           A546HisColNom ,
                                           A8889HisNomCli ,
                                           Byte.valueOf(A12950HisOpeTur) ,
                                           A602MaqCod ,
                                           A540HisBarKgm ,
                                           A541HisBarMtr ,
                                           A13699CostCausa ,
                                           A834TipDefDsc ,
                                           A5086DscCausa ,
                                           A7001Rps_Dsc ,
                                           Integer.valueOf(A2297HisReoTn) ,
                                           Integer.valueOf(A12949HisOpecod) ,
                                           A5662HisAcCo ,
                                           A5693HisAcCot ,
                                           A5694HisAdEAcCo ,
                                           A5695HisAdEAcCt ,
                                           A13843HisTipArtD ,
                                           A13844HisTipColD ,
                                           A569HisReoFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV6Clicod) ,
                                           Integer.valueOf(AV83Clicod_to) ,
                                           AV7HisreoFec ,
                                           AV8HisreoFec_to ,
                                           Byte.valueOf(AV9HisEstReo) ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr = GXutil.padr( GXutil.rtrim( AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr), 11, "%") ;
      lV110Reclamacionesynoconformidadeswcds_6_tfhisreolote = GXutil.padr( GXutil.rtrim( AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote), 20, "%") ;
      lV112Reclamacionesynoconformidadeswcds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV112Reclamacionesynoconformidadeswcds_8_tfclinom), 30, "%") ;
      lV114Reclamacionesynoconformidadeswcds_10_tfhisbarser = GXutil.padr( GXutil.rtrim( AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser), 16, "%") ;
      lV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc = GXutil.padr( GXutil.rtrim( AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc), 26, "%") ;
      lV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom = GXutil.padr( GXutil.rtrim( AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom), 13, "%") ;
      lV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli = GXutil.padr( GXutil.rtrim( AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli), 13, "%") ;
      lV124Reclamacionesynoconformidadeswcds_20_tfmaqcod = GXutil.padr( GXutil.rtrim( AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod), 6, "%") ;
      lV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc = GXutil.padr( GXutil.rtrim( AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc), 30, "%") ;
      lV136Reclamacionesynoconformidadeswcds_32_tfdsccausa = GXutil.padr( GXutil.rtrim( AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa), 60, "%") ;
      lV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc = GXutil.padr( GXutil.rtrim( AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc), 40, "%") ;
      lV144Reclamacionesynoconformidadeswcds_40_tfhisacco = GXutil.concat( GXutil.rtrim( AV144Reclamacionesynoconformidadeswcds_40_tfhisacco), "%", "") ;
      lV146Reclamacionesynoconformidadeswcds_42_tfhisaccot = GXutil.concat( GXutil.rtrim( AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot), "%", "") ;
      lV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco = GXutil.concat( GXutil.rtrim( AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco), "%", "") ;
      lV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct = GXutil.concat( GXutil.rtrim( AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct), "%", "") ;
      lV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc = GXutil.padr( GXutil.rtrim( AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc), 30, "%") ;
      lV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc = GXutil.padr( GXutil.rtrim( AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc), 30, "%") ;
      /* Using cursor H015L4 */
      pr_default.execute(2, new Object[] {AV5Emprcod, Integer.valueOf(AV6Clicod), Integer.valueOf(AV83Clicod_to), AV7HisreoFec, AV8HisreoFec_to, Byte.valueOf(AV9HisEstReo), lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, lV105Reclamacionesynoconformidadeswcds_1_filterfulltext, AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec, lV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr, AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel, lV110Reclamacionesynoconformidadeswcds_6_tfhisreolote, AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel, lV112Reclamacionesynoconformidadeswcds_8_tfclinom, AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel, lV114Reclamacionesynoconformidadeswcds_10_tfhisbarser, AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel, lV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc, AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel, lV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom, AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel, lV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli, AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel, Byte.valueOf(AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur), Byte.valueOf(AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to), lV124Reclamacionesynoconformidadeswcds_20_tfmaqcod, AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel, AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm, AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to, AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr, AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to, AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa, AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to, AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa, AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to, lV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc, AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel, lV136Reclamacionesynoconformidadeswcds_32_tfdsccausa, AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel, lV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc, AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel, Integer.valueOf(AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn), Integer.valueOf(AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to), Integer.valueOf(AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod), Integer.valueOf(AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to), lV144Reclamacionesynoconformidadeswcds_40_tfhisacco, AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel, lV146Reclamacionesynoconformidadeswcds_42_tfhisaccot, AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel, lV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco, AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel, lV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct, AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel, lV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc, AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel, lV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc, AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A571HisTipArt = H015L4_A571HisTipArt[0] ;
         n571HisTipArt = H015L4_n571HisTipArt[0] ;
         A572HisTipCol = H015L4_A572HisTipCol[0] ;
         n572HisTipCol = H015L4_n572HisTipCol[0] ;
         A833TipDefCod = H015L4_A833TipDefCod[0] ;
         A5085CodCausa = H015L4_A5085CodCausa[0] ;
         n5085CodCausa = H015L4_n5085CodCausa[0] ;
         A7000Rps_Cod = H015L4_A7000Rps_Cod[0] ;
         n7000Rps_Cod = H015L4_n7000Rps_Cod[0] ;
         A252CliCod = H015L4_A252CliCod[0] ;
         n252CliCod = H015L4_n252CliCod[0] ;
         A396EmprCod = H015L4_A396EmprCod[0] ;
         A13844HisTipColD = H015L4_A13844HisTipColD[0] ;
         n13844HisTipColD = H015L4_n13844HisTipColD[0] ;
         A13843HisTipArtD = H015L4_A13843HisTipArtD[0] ;
         n13843HisTipArtD = H015L4_n13843HisTipArtD[0] ;
         A5695HisAdEAcCt = H015L4_A5695HisAdEAcCt[0] ;
         n5695HisAdEAcCt = H015L4_n5695HisAdEAcCt[0] ;
         A5694HisAdEAcCo = H015L4_A5694HisAdEAcCo[0] ;
         n5694HisAdEAcCo = H015L4_n5694HisAdEAcCo[0] ;
         A5693HisAcCot = H015L4_A5693HisAcCot[0] ;
         n5693HisAcCot = H015L4_n5693HisAcCot[0] ;
         A5662HisAcCo = H015L4_A5662HisAcCo[0] ;
         n5662HisAcCo = H015L4_n5662HisAcCo[0] ;
         A12949HisOpecod = H015L4_A12949HisOpecod[0] ;
         n12949HisOpecod = H015L4_n12949HisOpecod[0] ;
         A2297HisReoTn = H015L4_A2297HisReoTn[0] ;
         n2297HisReoTn = H015L4_n2297HisReoTn[0] ;
         A7001Rps_Dsc = H015L4_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = H015L4_n7001Rps_Dsc[0] ;
         A5086DscCausa = H015L4_A5086DscCausa[0] ;
         n5086DscCausa = H015L4_n5086DscCausa[0] ;
         A834TipDefDsc = H015L4_A834TipDefDsc[0] ;
         n834TipDefDsc = H015L4_n834TipDefDsc[0] ;
         A541HisBarMtr = H015L4_A541HisBarMtr[0] ;
         n541HisBarMtr = H015L4_n541HisBarMtr[0] ;
         A602MaqCod = H015L4_A602MaqCod[0] ;
         n602MaqCod = H015L4_n602MaqCod[0] ;
         A12950HisOpeTur = H015L4_A12950HisOpeTur[0] ;
         n12950HisOpeTur = H015L4_n12950HisOpeTur[0] ;
         A8889HisNomCli = H015L4_A8889HisNomCli[0] ;
         n8889HisNomCli = H015L4_n8889HisNomCli[0] ;
         A546HisColNom = H015L4_A546HisColNom[0] ;
         n546HisColNom = H015L4_n546HisColNom[0] ;
         A2299HisReoDsc = H015L4_A2299HisReoDsc[0] ;
         n2299HisReoDsc = H015L4_n2299HisReoDsc[0] ;
         A542HisBarSer = H015L4_A542HisBarSer[0] ;
         n542HisBarSer = H015L4_n542HisBarSer[0] ;
         A279CliNom = H015L4_A279CliNom[0] ;
         A13698HisreoLote = H015L4_A13698HisreoLote[0] ;
         n13698HisreoLote = H015L4_n13698HisreoLote[0] ;
         A569HisReoFec = H015L4_A569HisReoFec[0] ;
         n569HisReoFec = H015L4_n569HisReoFec[0] ;
         A548HisEstReo = H015L4_A548HisEstReo[0] ;
         n548HisEstReo = H015L4_n548HisEstReo[0] ;
         A544HisCodPar = H015L4_A544HisCodPar[0] ;
         A545HisCodReo = H015L4_A545HisCodReo[0] ;
         A539HisBarCod = H015L4_A539HisBarCod[0] ;
         A13699CostCausa = H015L4_A13699CostCausa[0] ;
         n13699CostCausa = H015L4_n13699CostCausa[0] ;
         A540HisBarKgm = H015L4_A540HisBarKgm[0] ;
         n540HisBarKgm = H015L4_n540HisBarKgm[0] ;
         A279CliNom = H015L4_A279CliNom[0] ;
         A13843HisTipArtD = H015L4_A13843HisTipArtD[0] ;
         n13843HisTipArtD = H015L4_n13843HisTipArtD[0] ;
         A13844HisTipColD = H015L4_A13844HisTipColD[0] ;
         n13844HisTipColD = H015L4_n13844HisTipColD[0] ;
         A834TipDefDsc = H015L4_A834TipDefDsc[0] ;
         n834TipDefDsc = H015L4_n834TipDefDsc[0] ;
         A5086DscCausa = H015L4_A5086DscCausa[0] ;
         n5086DscCausa = H015L4_n5086DscCausa[0] ;
         A13699CostCausa = H015L4_A13699CostCausa[0] ;
         n13699CostCausa = H015L4_n13699CostCausa[0] ;
         A7001Rps_Dsc = H015L4_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = H015L4_n7001Rps_Dsc[0] ;
         A13700HisreoValo = GXutil.roundDecimal( A13699CostCausa.multiply(A540HisBarKgm), 2) ;
         A13697HisReoHDR = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
         AV84TotHisBarKgm = A540HisBarKgm.add(AV84TotHisBarKgm) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TotHisBarKgm", GXutil.ltrimstr( AV84TotHisBarKgm, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV84TotHisBarKgm, "ZZZZZ9.99")));
         AV86TotHisBarMtr = A541HisBarMtr.add(AV86TotHisBarMtr) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TotHisBarMtr", GXutil.ltrimstr( AV86TotHisBarMtr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV86TotHisBarMtr, "ZZZZZ9.99")));
         AV92TotHisreoValorCausa = A13700HisreoValo.add(AV92TotHisreoValorCausa) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TotHisreoValorCausa", GXutil.ltrimstr( AV92TotHisreoValorCausa, 18, 3));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISREOVALORCAUSA", getSecureSignedToken( sPrefix, localUtil.format( AV92TotHisreoValorCausa, "ZZZZZZ9.999")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV85TotValueHisBarKgm = localUtil.format( AV84TotHisBarKgm, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TotValueHisBarKgm", AV85TotValueHisBarKgm);
      AV87TotValueHisBarMtr = localUtil.format( AV86TotHisBarMtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TotValueHisBarMtr", AV87TotValueHisBarMtr);
      AV93TotValueHisreoValorCausa = localUtil.format( AV92TotHisreoValorCausa, "ZZZZZZ9.999") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TotValueHisreoValorCausa", AV93TotValueHisreoValorCausa);
   }

   public void wb_table2_74_15L2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehisbarkgm_Internalname, httpContext.getMessage( "Tot Value His Bar Kgm", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehisbarkgm_Internalname, AV85TotValueHisBarKgm, GXutil.rtrim( localUtil.format( AV85TotValueHisBarKgm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehisbarkgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehisbarkgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ReclamacionesyNoConformidadesWC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehisbarmtr_Internalname, httpContext.getMessage( "Tot Value His Bar Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehisbarmtr_Internalname, AV87TotValueHisBarMtr, GXutil.rtrim( localUtil.format( AV87TotValueHisBarMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,93);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehisbarmtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehisbarmtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ReclamacionesyNoConformidadesWC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehisreovalorcausa_Internalname, httpContext.getMessage( "Tot Value Hisreo Valor Causa", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehisreovalorcausa_Internalname, AV93TotValueHisreoValorCausa, GXutil.rtrim( localUtil.format( AV93TotValueHisreoValorCausa, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehisreovalorcausa_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehisreovalorcausa_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ReclamacionesyNoConformidadesWC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_74_15L2e( true) ;
      }
      else
      {
         wb_table2_74_15L2e( false) ;
      }
   }

   public void wb_table1_23_15L2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV28ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_28_15L2( true) ;
      }
      else
      {
         wb_table3_28_15L2( false) ;
      }
      return  ;
   }

   public void wb_table3_28_15L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_15L2e( true) ;
      }
      else
      {
         wb_table1_23_15L2e( false) ;
      }
   }

   public void wb_table3_28_15L2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV20FilterFullText, GXutil.rtrim( localUtil.format( AV20FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_ReclamacionesyNoConformidadesWC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_15L2e( true) ;
      }
      else
      {
         wb_table3_28_15L2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV6Clicod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
      AV83Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83Clicod_to), 6, 0));
      AV7HisreoFec = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HisreoFec", localUtil.format(AV7HisreoFec, "99/99/99"));
      AV8HisreoFec_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HisreoFec_to", localUtil.format(AV8HisreoFec_to, "99/99/99"));
      AV9HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisEstReo", GXutil.str( AV9HisEstReo, 1, 0));
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
      pa15L2( ) ;
      ws15L2( ) ;
      we15L2( ) ;
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
      sCtrlAV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV6Clicod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV83Clicod_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV7HisreoFec = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV8HisreoFec_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV9HisEstReo = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa15L2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "reclamacionesynoconformidadeswc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa15L2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV6Clicod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
         AV83Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83Clicod_to), 6, 0));
         AV7HisreoFec = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HisreoFec", localUtil.format(AV7HisreoFec, "99/99/99"));
         AV8HisreoFec_to = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HisreoFec_to", localUtil.format(AV8HisreoFec_to, "99/99/99"));
         AV9HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisEstReo", GXutil.str( AV9HisEstReo, 1, 0));
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV6Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV83Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV83Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7HisreoFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV7HisreoFec"), 0) ;
      wcpOAV8HisreoFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8HisreoFec_to"), 0) ;
      wcpOAV9HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( AV6Clicod != wcpOAV6Clicod ) || ( AV83Clicod_to != wcpOAV83Clicod_to ) || !( GXutil.dateCompare(GXutil.resetTime(AV7HisreoFec), GXutil.resetTime(wcpOAV7HisreoFec)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV8HisreoFec_to), GXutil.resetTime(wcpOAV8HisreoFec_to)) ) || ( AV9HisEstReo != wcpOAV9HisEstReo ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV6Clicod = AV6Clicod ;
      wcpOAV83Clicod_to = AV83Clicod_to ;
      wcpOAV7HisreoFec = AV7HisreoFec ;
      wcpOAV8HisreoFec_to = AV8HisreoFec_to ;
      wcpOAV9HisEstReo = AV9HisEstReo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV5Emprcod) > 0 )
      {
         AV5Emprcod = httpContext.cgiGet( sCtrlAV5Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      }
      else
      {
         AV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_PARM") ;
      }
      sCtrlAV6Clicod = httpContext.cgiGet( sPrefix+"AV6Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV6Clicod) > 0 )
      {
         AV6Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
      }
      else
      {
         AV6Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV83Clicod_to = httpContext.cgiGet( sPrefix+"AV83Clicod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV83Clicod_to) > 0 )
      {
         AV83Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV83Clicod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83Clicod_to), 6, 0));
      }
      else
      {
         AV83Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV83Clicod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7HisreoFec = httpContext.cgiGet( sPrefix+"AV7HisreoFec_CTRL") ;
      if ( GXutil.len( sCtrlAV7HisreoFec) > 0 )
      {
         AV7HisreoFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV7HisreoFec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7HisreoFec", localUtil.format(AV7HisreoFec, "99/99/99"));
      }
      else
      {
         AV7HisreoFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV7HisreoFec_PARM"), 0) ;
      }
      sCtrlAV8HisreoFec_to = httpContext.cgiGet( sPrefix+"AV8HisreoFec_to_CTRL") ;
      if ( GXutil.len( sCtrlAV8HisreoFec_to) > 0 )
      {
         AV8HisreoFec_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV8HisreoFec_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HisreoFec_to", localUtil.format(AV8HisreoFec_to, "99/99/99"));
      }
      else
      {
         AV8HisreoFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV8HisreoFec_to_PARM"), 0) ;
      }
      sCtrlAV9HisEstReo = httpContext.cgiGet( sPrefix+"AV9HisEstReo_CTRL") ;
      if ( GXutil.len( sCtrlAV9HisEstReo) > 0 )
      {
         AV9HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9HisEstReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HisEstReo", GXutil.str( AV9HisEstReo, 1, 0));
      }
      else
      {
         AV9HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9HisEstReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa15L2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws15L2( ) ;
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
      ws15L2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_PARM", GXutil.rtrim( AV5Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_CTRL", GXutil.rtrim( sCtrlAV5Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV6Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Clicod_CTRL", GXutil.rtrim( sCtrlAV6Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV83Clicod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV83Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV83Clicod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV83Clicod_to_CTRL", GXutil.rtrim( sCtrlAV83Clicod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7HisreoFec_PARM", localUtil.dtoc( AV7HisreoFec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7HisreoFec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7HisreoFec_CTRL", GXutil.rtrim( sCtrlAV7HisreoFec));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8HisreoFec_to_PARM", localUtil.dtoc( AV8HisreoFec_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8HisreoFec_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8HisreoFec_to_CTRL", GXutil.rtrim( sCtrlAV8HisreoFec_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HisEstReo_PARM", GXutil.ltrim( localUtil.ntoc( AV9HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9HisEstReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HisEstReo_CTRL", GXutil.rtrim( sCtrlAV9HisEstReo));
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
      we15L2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115563596", true, true);
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
      httpContext.AddJavascriptSource("reclamacionesynoconformidadeswc.js", "?202682115563596", false, true);
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

   public void subsflControlProps_412( )
   {
      cmbavAccionesdegrupo.setInternalname( sPrefix+"vACCIONESDEGRUPO_"+sGXsfl_41_idx );
      cmbHisEstReo.setInternalname( sPrefix+"HISESTREO_"+sGXsfl_41_idx );
      edtHisReoFec_Internalname = sPrefix+"HISREOFEC_"+sGXsfl_41_idx ;
      edtHisReoHDR_Internalname = sPrefix+"HISREOHDR_"+sGXsfl_41_idx ;
      edtHisreoLote_Internalname = sPrefix+"HISREOLOTE_"+sGXsfl_41_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_idx ;
      edtHisBarSer_Internalname = sPrefix+"HISBARSER_"+sGXsfl_41_idx ;
      edtHisReoDsc_Internalname = sPrefix+"HISREODSC_"+sGXsfl_41_idx ;
      edtHisColNom_Internalname = sPrefix+"HISCOLNOM_"+sGXsfl_41_idx ;
      edtHisNomCli_Internalname = sPrefix+"HISNOMCLI_"+sGXsfl_41_idx ;
      edtHisOpeTur_Internalname = sPrefix+"HISOPETUR_"+sGXsfl_41_idx ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_41_idx ;
      edtHisBarKgm_Internalname = sPrefix+"HISBARKGM_"+sGXsfl_41_idx ;
      edtHisBarMtr_Internalname = sPrefix+"HISBARMTR_"+sGXsfl_41_idx ;
      edtCostCausa_Internalname = sPrefix+"COSTCAUSA_"+sGXsfl_41_idx ;
      edtHisreoValo_Internalname = sPrefix+"HISREOVALO_"+sGXsfl_41_idx ;
      edtTipDefDsc_Internalname = sPrefix+"TIPDEFDSC_"+sGXsfl_41_idx ;
      edtDscCausa_Internalname = sPrefix+"DSCCAUSA_"+sGXsfl_41_idx ;
      edtRps_Dsc_Internalname = sPrefix+"RPS_DSC_"+sGXsfl_41_idx ;
      edtHisReoTn_Internalname = sPrefix+"HISREOTN_"+sGXsfl_41_idx ;
      edtHisOpecod_Internalname = sPrefix+"HISOPECOD_"+sGXsfl_41_idx ;
      edtHisAcCo_Internalname = sPrefix+"HISACCO_"+sGXsfl_41_idx ;
      edtHisAcCot_Internalname = sPrefix+"HISACCOT_"+sGXsfl_41_idx ;
      edtHisAdEAcCo_Internalname = sPrefix+"HISADEACCO_"+sGXsfl_41_idx ;
      edtHisAdEAcCt_Internalname = sPrefix+"HISADEACCT_"+sGXsfl_41_idx ;
      edtHisBarCod_Internalname = sPrefix+"HISBARCOD_"+sGXsfl_41_idx ;
      edtHisCodReo_Internalname = sPrefix+"HISCODREO_"+sGXsfl_41_idx ;
      edtHisCodPar_Internalname = sPrefix+"HISCODPAR_"+sGXsfl_41_idx ;
      edtHisTipArtD_Internalname = sPrefix+"HISTIPARTD_"+sGXsfl_41_idx ;
      edtHisTipColD_Internalname = sPrefix+"HISTIPCOLD_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      cmbavAccionesdegrupo.setInternalname( sPrefix+"vACCIONESDEGRUPO_"+sGXsfl_41_fel_idx );
      cmbHisEstReo.setInternalname( sPrefix+"HISESTREO_"+sGXsfl_41_fel_idx );
      edtHisReoFec_Internalname = sPrefix+"HISREOFEC_"+sGXsfl_41_fel_idx ;
      edtHisReoHDR_Internalname = sPrefix+"HISREOHDR_"+sGXsfl_41_fel_idx ;
      edtHisreoLote_Internalname = sPrefix+"HISREOLOTE_"+sGXsfl_41_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_41_fel_idx ;
      edtHisBarSer_Internalname = sPrefix+"HISBARSER_"+sGXsfl_41_fel_idx ;
      edtHisReoDsc_Internalname = sPrefix+"HISREODSC_"+sGXsfl_41_fel_idx ;
      edtHisColNom_Internalname = sPrefix+"HISCOLNOM_"+sGXsfl_41_fel_idx ;
      edtHisNomCli_Internalname = sPrefix+"HISNOMCLI_"+sGXsfl_41_fel_idx ;
      edtHisOpeTur_Internalname = sPrefix+"HISOPETUR_"+sGXsfl_41_fel_idx ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_41_fel_idx ;
      edtHisBarKgm_Internalname = sPrefix+"HISBARKGM_"+sGXsfl_41_fel_idx ;
      edtHisBarMtr_Internalname = sPrefix+"HISBARMTR_"+sGXsfl_41_fel_idx ;
      edtCostCausa_Internalname = sPrefix+"COSTCAUSA_"+sGXsfl_41_fel_idx ;
      edtHisreoValo_Internalname = sPrefix+"HISREOVALO_"+sGXsfl_41_fel_idx ;
      edtTipDefDsc_Internalname = sPrefix+"TIPDEFDSC_"+sGXsfl_41_fel_idx ;
      edtDscCausa_Internalname = sPrefix+"DSCCAUSA_"+sGXsfl_41_fel_idx ;
      edtRps_Dsc_Internalname = sPrefix+"RPS_DSC_"+sGXsfl_41_fel_idx ;
      edtHisReoTn_Internalname = sPrefix+"HISREOTN_"+sGXsfl_41_fel_idx ;
      edtHisOpecod_Internalname = sPrefix+"HISOPECOD_"+sGXsfl_41_fel_idx ;
      edtHisAcCo_Internalname = sPrefix+"HISACCO_"+sGXsfl_41_fel_idx ;
      edtHisAcCot_Internalname = sPrefix+"HISACCOT_"+sGXsfl_41_fel_idx ;
      edtHisAdEAcCo_Internalname = sPrefix+"HISADEACCO_"+sGXsfl_41_fel_idx ;
      edtHisAdEAcCt_Internalname = sPrefix+"HISADEACCT_"+sGXsfl_41_fel_idx ;
      edtHisBarCod_Internalname = sPrefix+"HISBARCOD_"+sGXsfl_41_fel_idx ;
      edtHisCodReo_Internalname = sPrefix+"HISCODREO_"+sGXsfl_41_fel_idx ;
      edtHisCodPar_Internalname = sPrefix+"HISCODPAR_"+sGXsfl_41_fel_idx ;
      edtHisTipArtD_Internalname = sPrefix+"HISTIPARTD_"+sGXsfl_41_fel_idx ;
      edtHisTipColD_Internalname = sPrefix+"HISTIPCOLD_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb15L0( ) ;
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavAccionesdegrupo.getEnabled()!=0)&&(cmbavAccionesdegrupo.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'"+sPrefix+"',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         if ( ( cmbavAccionesdegrupo.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vACCIONESDEGRUPO_" + sGXsfl_41_idx ;
            cmbavAccionesdegrupo.setName( GXCCtl );
            cmbavAccionesdegrupo.setWebtags( "" );
            if ( cmbavAccionesdegrupo.getItemCount() > 0 )
            {
               AV94AccionesdeGrupo = (short)(GXutil.lval( cmbavAccionesdegrupo.getValidValue(GXutil.trim( GXutil.str( AV94AccionesdeGrupo, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavAccionesdegrupo.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94AccionesdeGrupo), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavAccionesdegrupo,cmbavAccionesdegrupo.getInternalname(),GXutil.trim( GXutil.str( AV94AccionesdeGrupo, 4, 0)),Integer.valueOf(1),cmbavAccionesdegrupo.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVACCIONESDEGRUPO.CLICK."+sGXsfl_41_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavAccionesdegrupo.getEnabled()!=0)&&(cmbavAccionesdegrupo.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,42);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavAccionesdegrupo.setValue( GXutil.trim( GXutil.str( AV94AccionesdeGrupo, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavAccionesdegrupo.getInternalname(), "Values", cmbavAccionesdegrupo.ToJavascriptSource(), !bGXsfl_41_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbHisEstReo.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbHisEstReo.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "HISESTREO_" + sGXsfl_41_idx ;
            cmbHisEstReo.setName( GXCCtl );
            cmbHisEstReo.setWebtags( "" );
            cmbHisEstReo.addItem("1", httpContext.getMessage( "NC", ""), (short)(0));
            cmbHisEstReo.addItem("2", httpContext.getMessage( "RC", ""), (short)(0));
            if ( cmbHisEstReo.getItemCount() > 0 )
            {
               A548HisEstReo = (byte)(GXutil.lval( cmbHisEstReo.getValidValue(GXutil.trim( GXutil.str( A548HisEstReo, 1, 0))))) ;
               n548HisEstReo = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbHisEstReo,cmbHisEstReo.getInternalname(),GXutil.trim( GXutil.str( A548HisEstReo, 1, 0)),Integer.valueOf(1),cmbHisEstReo.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbHisEstReo.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbHisEstReo.setValue( GXutil.trim( GXutil.str( A548HisEstReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbHisEstReo.getInternalname(), "Values", cmbHisEstReo.ToJavascriptSource(), !bGXsfl_41_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisReoFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisReoFec_Internalname,localUtil.format(A569HisReoFec, "99/99/99"),localUtil.format( A569HisReoFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisReoFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisReoFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisReoHDR_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisReoHDR_Internalname,GXutil.rtrim( A13697HisReoHDR),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisReoHDR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisReoHDR_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisreoLote_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisreoLote_Internalname,GXutil.rtrim( A13698HisreoLote),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisreoLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisreoLote_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisBarSer_Internalname,GXutil.rtrim( A542HisBarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisReoDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisReoDsc_Internalname,GXutil.rtrim( A2299HisReoDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisReoDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisReoDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisColNom_Internalname,GXutil.rtrim( A546HisColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisNomCli_Internalname,GXutil.rtrim( A8889HisNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisOpeTur_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisOpeTur_Internalname,GXutil.ltrim( localUtil.ntoc( A12950HisOpeTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12950HisOpeTur), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisOpeTur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisOpeTur_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisBarKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A540HisBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A540HisBarKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisBarKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisBarMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisBarMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A541HisBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A541HisBarMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisBarMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisBarMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCostCausa_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCostCausa_Internalname,GXutil.ltrim( localUtil.ntoc( A13699CostCausa, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13699CostCausa, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCostCausa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCostCausa_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisreoValo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisreoValo_Internalname,GXutil.ltrim( localUtil.ntoc( A13700HisreoValo, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13700HisreoValo, "ZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisreoValo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisreoValo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipDefDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDefDsc_Internalname,GXutil.rtrim( A834TipDefDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtTipDefDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipDefDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDscCausa_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDscCausa_Internalname,GXutil.rtrim( A5086DscCausa),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDscCausa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDscCausa_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtRps_Dsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRps_Dsc_Internalname,GXutil.rtrim( A7001Rps_Dsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtRps_Dsc_Link,"","","",edtRps_Dsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRps_Dsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisReoTn_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisReoTn_Internalname,GXutil.ltrim( localUtil.ntoc( A2297HisReoTn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2297HisReoTn), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisReoTn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisReoTn_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisOpecod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisOpecod_Internalname,GXutil.ltrim( localUtil.ntoc( A12949HisOpecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12949HisOpecod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisOpecod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisOpecod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisAcCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisAcCo_Internalname,A5662HisAcCo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisAcCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisAcCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3276),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisAcCot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisAcCot_Internalname,A5693HisAcCot,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisAcCot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisAcCot_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisAdEAcCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisAdEAcCo_Internalname,A5694HisAdEAcCo,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisAdEAcCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisAdEAcCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisAdEAcCt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisAdEAcCt_Internalname,A5695HisAdEAcCt,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisAdEAcCt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisAdEAcCt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A539HisBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A539HisBarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A545HisCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A545HisCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisCodPar_Internalname,GXutil.rtrim( A544HisCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisTipArtD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisTipArtD_Internalname,GXutil.rtrim( A13843HisTipArtD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHisTipArtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisTipArtD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisTipColD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisTipColD_Internalname,GXutil.rtrim( A13844HisTipColD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtHisTipColD_Link,"","","",edtHisTipColD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisTipColD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes15L2( ) ;
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
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"41\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbHisEstReo.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisReoFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisReoHDR_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisreoLote_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisReoDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisOpeTur_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisBarKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisBarMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCostCausa_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Causa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisreoValo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipDefDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Defecto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDscCausa_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Causa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRps_Dsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( " Responsabilidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisReoTn_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Int", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisOpecod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisAcCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acciones Corrección a implementar:", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisAcCot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acciones Correctivas a Implementar:", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisAdEAcCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Analisis de Corrección", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisAdEAcCt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Analisis  Accion Correctivas", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisTipArtD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "de Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisTipColD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Colorante", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV94AccionesdeGrupo, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A548HisEstReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbHisEstReo.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A569HisReoFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisReoFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13697HisReoHDR));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisReoHDR_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13698HisreoLote));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisreoLote_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A542HisBarSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisBarSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2299HisReoDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisReoDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A546HisColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A8889HisNomCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12950HisOpeTur, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisOpeTur_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A540HisBarKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisBarKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A541HisBarMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisBarMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13699CostCausa, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCostCausa_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13700HisreoValo, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisreoValo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A834TipDefDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5086DscCausa));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDscCausa_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7001Rps_Dsc));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtRps_Dsc_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRps_Dsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2297HisReoTn, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisReoTn_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12949HisOpecod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisOpecod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A5662HisAcCo);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisAcCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A5693HisAcCot);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisAcCot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A5694HisAdEAcCo);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisAdEAcCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A5695HisAdEAcCt);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisAdEAcCt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A539HisBarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A545HisCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A544HisCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13843HisTipArtD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisTipArtD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13844HisTipColD));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtHisTipColD_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisTipColD_Visible, (byte)(5), (byte)(0), ".", "")));
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
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      cmbavAccionesdegrupo.setInternalname( sPrefix+"vACCIONESDEGRUPO" );
      cmbHisEstReo.setInternalname( sPrefix+"HISESTREO" );
      edtHisReoFec_Internalname = sPrefix+"HISREOFEC" ;
      edtHisReoHDR_Internalname = sPrefix+"HISREOHDR" ;
      edtHisreoLote_Internalname = sPrefix+"HISREOLOTE" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtHisBarSer_Internalname = sPrefix+"HISBARSER" ;
      edtHisReoDsc_Internalname = sPrefix+"HISREODSC" ;
      edtHisColNom_Internalname = sPrefix+"HISCOLNOM" ;
      edtHisNomCli_Internalname = sPrefix+"HISNOMCLI" ;
      edtHisOpeTur_Internalname = sPrefix+"HISOPETUR" ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD" ;
      edtHisBarKgm_Internalname = sPrefix+"HISBARKGM" ;
      edtHisBarMtr_Internalname = sPrefix+"HISBARMTR" ;
      edtCostCausa_Internalname = sPrefix+"COSTCAUSA" ;
      edtHisreoValo_Internalname = sPrefix+"HISREOVALO" ;
      edtTipDefDsc_Internalname = sPrefix+"TIPDEFDSC" ;
      edtDscCausa_Internalname = sPrefix+"DSCCAUSA" ;
      edtRps_Dsc_Internalname = sPrefix+"RPS_DSC" ;
      edtHisReoTn_Internalname = sPrefix+"HISREOTN" ;
      edtHisOpecod_Internalname = sPrefix+"HISOPECOD" ;
      edtHisAcCo_Internalname = sPrefix+"HISACCO" ;
      edtHisAcCot_Internalname = sPrefix+"HISACCOT" ;
      edtHisAdEAcCo_Internalname = sPrefix+"HISADEACCO" ;
      edtHisAdEAcCt_Internalname = sPrefix+"HISADEACCT" ;
      edtHisBarCod_Internalname = sPrefix+"HISBARCOD" ;
      edtHisCodReo_Internalname = sPrefix+"HISCODREO" ;
      edtHisCodPar_Internalname = sPrefix+"HISCODPAR" ;
      edtHisTipArtD_Internalname = sPrefix+"HISTIPARTD" ;
      edtHisTipColD_Internalname = sPrefix+"HISTIPCOLD" ;
      edtavTotvaluehisbarkgm_Internalname = sPrefix+"vTOTVALUEHISBARKGM" ;
      edtavTotvaluehisbarmtr_Internalname = sPrefix+"vTOTVALUEHISBARMTR" ;
      edtavTotvaluehisreovalorcausa_Internalname = sPrefix+"vTOTVALUEHISREOVALORCAUSA" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_hisreofecauxdate_Internalname = sPrefix+"vDDO_HISREOFECAUXDATE" ;
      divDdo_hisreofecauxdates_Internalname = sPrefix+"DDO_HISREOFECAUXDATES" ;
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
      edtHisTipColD_Jsonclick = "" ;
      edtHisTipColD_Link = "" ;
      edtHisTipArtD_Jsonclick = "" ;
      edtHisCodPar_Jsonclick = "" ;
      edtHisCodReo_Jsonclick = "" ;
      edtHisBarCod_Jsonclick = "" ;
      edtHisAdEAcCt_Jsonclick = "" ;
      edtHisAdEAcCo_Jsonclick = "" ;
      edtHisAcCot_Jsonclick = "" ;
      edtHisAcCo_Jsonclick = "" ;
      edtHisOpecod_Jsonclick = "" ;
      edtHisReoTn_Jsonclick = "" ;
      edtRps_Dsc_Jsonclick = "" ;
      edtRps_Dsc_Link = "" ;
      edtDscCausa_Jsonclick = "" ;
      edtTipDefDsc_Jsonclick = "" ;
      edtHisreoValo_Jsonclick = "" ;
      edtCostCausa_Jsonclick = "" ;
      edtHisBarMtr_Jsonclick = "" ;
      edtHisBarKgm_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtHisOpeTur_Jsonclick = "" ;
      edtHisNomCli_Jsonclick = "" ;
      edtHisColNom_Jsonclick = "" ;
      edtHisReoDsc_Jsonclick = "" ;
      edtHisBarSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtHisreoLote_Jsonclick = "" ;
      edtHisReoHDR_Jsonclick = "" ;
      edtHisReoFec_Jsonclick = "" ;
      cmbHisEstReo.setJsonclick( "" );
      cmbavAccionesdegrupo.setJsonclick( "" );
      cmbavAccionesdegrupo.setVisible( -1 );
      cmbavAccionesdegrupo.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluehisreovalorcausa_Jsonclick = "" ;
      edtavTotvaluehisreovalorcausa_Enabled = 1 ;
      edtavTotvaluehisbarmtr_Jsonclick = "" ;
      edtavTotvaluehisbarmtr_Enabled = 1 ;
      edtavTotvaluehisbarkgm_Jsonclick = "" ;
      edtavTotvaluehisbarkgm_Enabled = 1 ;
      edtHisTipColD_Visible = -1 ;
      edtHisTipArtD_Visible = -1 ;
      edtHisAdEAcCt_Visible = -1 ;
      edtHisAdEAcCo_Visible = -1 ;
      edtHisAcCot_Visible = -1 ;
      edtHisAcCo_Visible = -1 ;
      edtHisOpecod_Visible = -1 ;
      edtHisReoTn_Visible = -1 ;
      edtRps_Dsc_Visible = -1 ;
      edtDscCausa_Visible = -1 ;
      edtTipDefDsc_Visible = -1 ;
      edtHisreoValo_Visible = -1 ;
      edtCostCausa_Visible = -1 ;
      edtHisBarMtr_Visible = -1 ;
      edtHisBarKgm_Visible = -1 ;
      edtMaqCod_Visible = -1 ;
      edtHisOpeTur_Visible = -1 ;
      edtHisNomCli_Visible = -1 ;
      edtHisColNom_Visible = -1 ;
      edtHisReoDsc_Visible = -1 ;
      edtHisBarSer_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtHisreoLote_Visible = -1 ;
      edtHisReoHDR_Visible = -1 ;
      edtHisReoFec_Visible = -1 ;
      cmbHisEstReo.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_hisreofecauxdate_Jsonclick = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "ReclamacionesyNoConformidadesWCGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "1:NC,2:RC|||||||||||||||||||||||||" ;
      Ddo_grid_Allowmultipleselection = "T|||||||||||||||||||||||||" ;
      Ddo_grid_Datalisttype = "FixedValues||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic|||||Dynamic|Dynamic|Dynamic|||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T||T|T|T|T|T|T|T||T|||||T|T|T|||T|T|T|T|T|T" ;
      Ddo_grid_Filterisrange = "|||||||||T||T|T|T|T||||T|T||||||" ;
      Ddo_grid_Filtertype = "|Date|Character|Character|Character|Character|Character|Character|Character|Numeric|Character|Numeric|Numeric|Numeric|Numeric|Character|Character|Character|Numeric|Numeric|Character|Character|Character|Character|Character|Character" ;
      Ddo_grid_Includefilter = "|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T||T|T|T|T|T|T|T|T|T|T|T||T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "3|2||4|5|6|7|8|9|10|11|12|13|14||15|16|17|18|19|20|21|22|23|1|24" ;
      Ddo_grid_Columnids = "1:HisEstReo|2:HisReoFec|3:HisReoHDR|4:HisreoLote|5:CliNom|6:HisBarSer|7:HisReoDsc|8:HisColNom|9:HisNomCli|10:HisOpeTur|11:MaqCod|12:HisBarKgm|13:HisBarMtr|14:CostCausa|15:HisreoValorCausa|16:TipDefDsc|17:DscCausa|18:Rps_Dsc|19:HisReoTn|20:HisOpecod|21:HisAcCo|22:HisAcCot|23:HisAdEAcCo|24:HisAdEAcCt|28:HisTipArtDsc|29:HisTipColDsc" ;
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
      GXCCtl = "vACCIONESDEGRUPO_" + sGXsfl_41_idx ;
      cmbavAccionesdegrupo.setName( GXCCtl );
      cmbavAccionesdegrupo.setWebtags( "" );
      if ( cmbavAccionesdegrupo.getItemCount() > 0 )
      {
      }
      GXCCtl = "HISESTREO_" + sGXsfl_41_idx ;
      cmbHisEstReo.setName( GXCCtl );
      cmbHisEstReo.setWebtags( "" );
      cmbHisEstReo.addItem("1", httpContext.getMessage( "NC", ""), (short)(0));
      cmbHisEstReo.addItem("2", httpContext.getMessage( "RC", ""), (short)(0));
      if ( cmbHisEstReo.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV83Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV7HisreoFec',fld:'vHISREOFEC',pic:''},{av:'AV8HisreoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV9HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV32TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV33TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV37TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV38TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV39TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV40TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV41TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV42TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV44TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV45TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV46TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV47TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV48TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV49TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV50TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV51TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV52TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV53TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV54TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV55TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV56TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV57TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV58TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV59TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV60TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV90TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV91TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV61TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV62TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV63TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV64TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV65TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV66TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV67TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV68TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV69TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV70TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV71TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV72TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV73TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV74TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV75TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV76TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV77TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV78TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV99TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV100TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV101TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV102TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84TotHisBarKgm',fld:'vTOTHISBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisBarMtr',fld:'vTOTHISBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotHisreoValorCausa',fld:'vTOTHISREOVALORCAUSA',pic:'ZZZZZZ9.999',hsh:true},{av:'AV95carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A569HisReoFec',fld:'HISREOFEC',pic:''},{av:'cmbHisEstReo'},{av:'A548HisEstReo',fld:'HISESTREO',pic:'9'},{av:'A540HisBarKgm',fld:'HISBARKGM',pic:'ZZZZZ9.99'},{av:'A541HisBarMtr',fld:'HISBARMTR',pic:'ZZZZZ9.99'},{av:'A13700HisreoValo',fld:'HISREOVALO',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbHisEstReo'},{av:'edtHisReoFec_Visible',ctrl:'HISREOFEC',prop:'Visible'},{av:'edtHisReoHDR_Visible',ctrl:'HISREOHDR',prop:'Visible'},{av:'edtHisreoLote_Visible',ctrl:'HISREOLOTE',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtHisBarSer_Visible',ctrl:'HISBARSER',prop:'Visible'},{av:'edtHisReoDsc_Visible',ctrl:'HISREODSC',prop:'Visible'},{av:'edtHisColNom_Visible',ctrl:'HISCOLNOM',prop:'Visible'},{av:'edtHisNomCli_Visible',ctrl:'HISNOMCLI',prop:'Visible'},{av:'edtHisOpeTur_Visible',ctrl:'HISOPETUR',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtHisBarKgm_Visible',ctrl:'HISBARKGM',prop:'Visible'},{av:'edtHisBarMtr_Visible',ctrl:'HISBARMTR',prop:'Visible'},{av:'edtCostCausa_Visible',ctrl:'COSTCAUSA',prop:'Visible'},{av:'edtHisreoValo_Visible',ctrl:'HISREOVALO',prop:'Visible'},{av:'edtTipDefDsc_Visible',ctrl:'TIPDEFDSC',prop:'Visible'},{av:'edtDscCausa_Visible',ctrl:'DSCCAUSA',prop:'Visible'},{av:'edtRps_Dsc_Visible',ctrl:'RPS_DSC',prop:'Visible'},{av:'edtHisReoTn_Visible',ctrl:'HISREOTN',prop:'Visible'},{av:'edtHisOpecod_Visible',ctrl:'HISOPECOD',prop:'Visible'},{av:'edtHisAcCo_Visible',ctrl:'HISACCO',prop:'Visible'},{av:'edtHisAcCot_Visible',ctrl:'HISACCOT',prop:'Visible'},{av:'edtHisAdEAcCo_Visible',ctrl:'HISADEACCO',prop:'Visible'},{av:'edtHisAdEAcCt_Visible',ctrl:'HISADEACCT',prop:'Visible'},{av:'edtHisTipArtD_Visible',ctrl:'HISTIPARTD',prop:'Visible'},{av:'edtHisTipColD_Visible',ctrl:'HISTIPCOLD',prop:'Visible'},{av:'AV81GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV82GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''},{av:'AV84TotHisBarKgm',fld:'vTOTHISBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisBarMtr',fld:'vTOTHISBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotHisreoValorCausa',fld:'vTOTHISREOVALORCAUSA',pic:'ZZZZZZ9.999',hsh:true},{av:'AV85TotValueHisBarKgm',fld:'vTOTVALUEHISBARKGM',pic:''},{av:'AV87TotValueHisBarMtr',fld:'vTOTVALUEHISBARMTR',pic:''},{av:'AV93TotValueHisreoValorCausa',fld:'vTOTVALUEHISREOVALORCAUSA',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1215L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV83Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV7HisreoFec',fld:'vHISREOFEC',pic:''},{av:'AV8HisreoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV9HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV33TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV37TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV38TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV39TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV40TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV41TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV42TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV44TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV45TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV46TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV47TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV48TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV49TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV50TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV51TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV52TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV53TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV54TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV55TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV56TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV57TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV58TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV59TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV60TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV90TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV91TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV61TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV62TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV63TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV64TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV65TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV66TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV67TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV68TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV69TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV70TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV71TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV72TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV73TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV74TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV75TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV76TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV77TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV78TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV99TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV100TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV101TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV102TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84TotHisBarKgm',fld:'vTOTHISBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisBarMtr',fld:'vTOTHISBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotHisreoValorCausa',fld:'vTOTHISREOVALORCAUSA',pic:'ZZZZZZ9.999',hsh:true},{av:'AV95carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1315L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV83Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV7HisreoFec',fld:'vHISREOFEC',pic:''},{av:'AV8HisreoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV9HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV33TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV37TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV38TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV39TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV40TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV41TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV42TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV44TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV45TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV46TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV47TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV48TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV49TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV50TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV51TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV52TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV53TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV54TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV55TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV56TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV57TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV58TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV59TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV60TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV90TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV91TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV61TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV62TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV63TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV64TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV65TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV66TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV67TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV68TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV69TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV70TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV71TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV72TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV73TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV74TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV75TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV76TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV77TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV78TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV99TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV100TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV101TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV102TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84TotHisBarKgm',fld:'vTOTHISBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisBarMtr',fld:'vTOTHISBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotHisreoValorCausa',fld:'vTOTHISREOVALORCAUSA',pic:'ZZZZZZ9.999',hsh:true},{av:'AV95carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1415L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV83Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV7HisreoFec',fld:'vHISREOFEC',pic:''},{av:'AV8HisreoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV9HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV33TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV37TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV38TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV39TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV40TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV41TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV42TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV44TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV45TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV46TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV47TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV48TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV49TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV50TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV51TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV52TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV53TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV54TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV55TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV56TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV57TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV58TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV59TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV60TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV90TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV91TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV61TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV62TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV63TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV64TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV65TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV66TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV67TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV68TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV69TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV70TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV71TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV72TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV73TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV74TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV75TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV76TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV77TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV78TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV99TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV100TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV101TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV102TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84TotHisBarKgm',fld:'vTOTHISBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisBarMtr',fld:'vTOTHISBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotHisreoValorCausa',fld:'vTOTHISREOVALORCAUSA',pic:'ZZZZZZ9.999',hsh:true},{av:'AV95carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV101TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV102TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV99TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV100TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV77TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV78TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV75TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV76TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV73TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV74TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV71TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV72TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV69TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV70TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV67TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV68TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV65TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV66TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV63TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV64TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV61TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV62TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV90TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV91TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV59TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV60TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV57TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV58TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV55TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV56TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV53TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV54TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV51TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV52TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV49TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV50TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV47TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV48TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV45TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV46TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV43TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV44TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV41TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV42TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV39TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV40TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV37TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV38TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV33TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV31TFHisEstReo_SelsJson',fld:'vTFHISESTREO_SELSJSON',pic:''},{av:'AV32TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2015L2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7000Rps_Cod',fld:'RPS_COD',pic:'ZZZ9'},{av:'A572HisTipCol',fld:'HISTIPCOL',pic:'Z9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavAccionesdegrupo'},{av:'AV94AccionesdeGrupo',fld:'vACCIONESDEGRUPO',pic:'ZZZ9'},{av:'edtRps_Dsc_Link',ctrl:'RPS_DSC',prop:'Link'},{av:'edtHisTipColD_Link',ctrl:'HISTIPCOLD',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1515L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV83Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV7HisreoFec',fld:'vHISREOFEC',pic:''},{av:'AV8HisreoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV9HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV33TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV37TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV38TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV39TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV40TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV41TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV42TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV44TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV45TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV46TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV47TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV48TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV49TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV50TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV51TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV52TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV53TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV54TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV55TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV56TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV57TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV58TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV59TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV60TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV90TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV91TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV61TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV62TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV63TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV64TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV65TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV66TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV67TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV68TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV69TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV70TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV71TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV72TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV73TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV74TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV75TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV76TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV77TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV78TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV99TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV100TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV101TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV102TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84TotHisBarKgm',fld:'vTOTHISBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisBarMtr',fld:'vTOTHISBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotHisreoValorCausa',fld:'vTOTHISREOVALORCAUSA',pic:'ZZZZZZ9.999',hsh:true},{av:'AV95carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A569HisReoFec',fld:'HISREOFEC',pic:''},{av:'cmbHisEstReo'},{av:'A548HisEstReo',fld:'HISESTREO',pic:'9'},{av:'A540HisBarKgm',fld:'HISBARKGM',pic:'ZZZZZ9.99'},{av:'A541HisBarMtr',fld:'HISBARMTR',pic:'ZZZZZ9.99'},{av:'A13700HisreoValo',fld:'HISREOVALO',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbHisEstReo'},{av:'edtHisReoFec_Visible',ctrl:'HISREOFEC',prop:'Visible'},{av:'edtHisReoHDR_Visible',ctrl:'HISREOHDR',prop:'Visible'},{av:'edtHisreoLote_Visible',ctrl:'HISREOLOTE',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtHisBarSer_Visible',ctrl:'HISBARSER',prop:'Visible'},{av:'edtHisReoDsc_Visible',ctrl:'HISREODSC',prop:'Visible'},{av:'edtHisColNom_Visible',ctrl:'HISCOLNOM',prop:'Visible'},{av:'edtHisNomCli_Visible',ctrl:'HISNOMCLI',prop:'Visible'},{av:'edtHisOpeTur_Visible',ctrl:'HISOPETUR',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtHisBarKgm_Visible',ctrl:'HISBARKGM',prop:'Visible'},{av:'edtHisBarMtr_Visible',ctrl:'HISBARMTR',prop:'Visible'},{av:'edtCostCausa_Visible',ctrl:'COSTCAUSA',prop:'Visible'},{av:'edtHisreoValo_Visible',ctrl:'HISREOVALO',prop:'Visible'},{av:'edtTipDefDsc_Visible',ctrl:'TIPDEFDSC',prop:'Visible'},{av:'edtDscCausa_Visible',ctrl:'DSCCAUSA',prop:'Visible'},{av:'edtRps_Dsc_Visible',ctrl:'RPS_DSC',prop:'Visible'},{av:'edtHisReoTn_Visible',ctrl:'HISREOTN',prop:'Visible'},{av:'edtHisOpecod_Visible',ctrl:'HISOPECOD',prop:'Visible'},{av:'edtHisAcCo_Visible',ctrl:'HISACCO',prop:'Visible'},{av:'edtHisAcCot_Visible',ctrl:'HISACCOT',prop:'Visible'},{av:'edtHisAdEAcCo_Visible',ctrl:'HISADEACCO',prop:'Visible'},{av:'edtHisAdEAcCt_Visible',ctrl:'HISADEACCT',prop:'Visible'},{av:'edtHisTipArtD_Visible',ctrl:'HISTIPARTD',prop:'Visible'},{av:'edtHisTipColD_Visible',ctrl:'HISTIPCOLD',prop:'Visible'},{av:'AV81GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV82GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''},{av:'AV84TotHisBarKgm',fld:'vTOTHISBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisBarMtr',fld:'vTOTHISBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotHisreoValorCausa',fld:'vTOTHISREOVALORCAUSA',pic:'ZZZZZZ9.999',hsh:true},{av:'AV85TotValueHisBarKgm',fld:'vTOTVALUEHISBARKGM',pic:''},{av:'AV87TotValueHisBarMtr',fld:'vTOTVALUEHISBARMTR',pic:''},{av:'AV93TotValueHisreoValorCausa',fld:'vTOTVALUEHISREOVALORCAUSA',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1115L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV83Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV7HisreoFec',fld:'vHISREOFEC',pic:''},{av:'AV8HisreoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV9HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV33TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV37TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV38TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV39TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV40TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV41TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV42TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV44TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV45TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV46TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV47TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV48TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV49TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV50TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV51TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV52TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV53TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV54TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV55TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV56TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV57TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV58TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV59TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV60TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV90TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV91TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV61TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV62TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV63TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV64TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV65TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV66TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV67TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV68TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV69TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV70TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV71TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV72TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV73TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV74TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV75TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV76TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV77TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV78TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV99TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV100TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV101TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV102TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84TotHisBarKgm',fld:'vTOTHISBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisBarMtr',fld:'vTOTHISBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotHisreoValorCausa',fld:'vTOTHISREOVALORCAUSA',pic:'ZZZZZZ9.999',hsh:true},{av:'AV95carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31TFHisEstReo_SelsJson',fld:'vTFHISESTREO_SELSJSON',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A569HisReoFec',fld:'HISREOFEC',pic:''},{av:'cmbHisEstReo'},{av:'A548HisEstReo',fld:'HISESTREO',pic:'9'},{av:'A540HisBarKgm',fld:'HISBARKGM',pic:'ZZZZZ9.99'},{av:'A541HisBarMtr',fld:'HISBARMTR',pic:'ZZZZZ9.99'},{av:'A13700HisreoValo',fld:'HISREOVALO',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV33TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV37TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV38TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV39TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV40TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV41TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV42TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV44TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV45TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV46TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV47TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV48TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV49TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV50TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV51TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV52TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV53TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV54TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV55TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV56TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV57TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV58TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV59TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV60TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV90TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV91TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV61TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV62TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV63TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV64TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV65TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV66TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV67TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV68TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV69TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV70TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV71TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV72TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV73TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV74TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV75TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV76TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV77TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV78TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV99TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV100TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV101TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV102TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV31TFHisEstReo_SelsJson',fld:'vTFHISESTREO_SELSJSON',pic:''},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbHisEstReo'},{av:'edtHisReoFec_Visible',ctrl:'HISREOFEC',prop:'Visible'},{av:'edtHisReoHDR_Visible',ctrl:'HISREOHDR',prop:'Visible'},{av:'edtHisreoLote_Visible',ctrl:'HISREOLOTE',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtHisBarSer_Visible',ctrl:'HISBARSER',prop:'Visible'},{av:'edtHisReoDsc_Visible',ctrl:'HISREODSC',prop:'Visible'},{av:'edtHisColNom_Visible',ctrl:'HISCOLNOM',prop:'Visible'},{av:'edtHisNomCli_Visible',ctrl:'HISNOMCLI',prop:'Visible'},{av:'edtHisOpeTur_Visible',ctrl:'HISOPETUR',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtHisBarKgm_Visible',ctrl:'HISBARKGM',prop:'Visible'},{av:'edtHisBarMtr_Visible',ctrl:'HISBARMTR',prop:'Visible'},{av:'edtCostCausa_Visible',ctrl:'COSTCAUSA',prop:'Visible'},{av:'edtHisreoValo_Visible',ctrl:'HISREOVALO',prop:'Visible'},{av:'edtTipDefDsc_Visible',ctrl:'TIPDEFDSC',prop:'Visible'},{av:'edtDscCausa_Visible',ctrl:'DSCCAUSA',prop:'Visible'},{av:'edtRps_Dsc_Visible',ctrl:'RPS_DSC',prop:'Visible'},{av:'edtHisReoTn_Visible',ctrl:'HISREOTN',prop:'Visible'},{av:'edtHisOpecod_Visible',ctrl:'HISOPECOD',prop:'Visible'},{av:'edtHisAcCo_Visible',ctrl:'HISACCO',prop:'Visible'},{av:'edtHisAcCot_Visible',ctrl:'HISACCOT',prop:'Visible'},{av:'edtHisAdEAcCo_Visible',ctrl:'HISADEACCO',prop:'Visible'},{av:'edtHisAdEAcCt_Visible',ctrl:'HISADEACCT',prop:'Visible'},{av:'edtHisTipArtD_Visible',ctrl:'HISTIPARTD',prop:'Visible'},{av:'edtHisTipColD_Visible',ctrl:'HISTIPCOLD',prop:'Visible'},{av:'AV81GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV82GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV84TotHisBarKgm',fld:'vTOTHISBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisBarMtr',fld:'vTOTHISBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotHisreoValorCausa',fld:'vTOTHISREOVALORCAUSA',pic:'ZZZZZZ9.999',hsh:true},{av:'AV85TotValueHisBarKgm',fld:'vTOTVALUEHISBARKGM',pic:''},{av:'AV87TotValueHisBarMtr',fld:'vTOTVALUEHISBARMTR',pic:''},{av:'AV93TotValueHisreoValorCausa',fld:'vTOTVALUEHISREOVALORCAUSA',pic:''}]}");
      setEventMetadata("VACCIONESDEGRUPO.CLICK","{handler:'e2115L2',iparms:[{av:'cmbavAccionesdegrupo'},{av:'AV94AccionesdeGrupo',fld:'vACCIONESDEGRUPO',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV83Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV7HisreoFec',fld:'vHISREOFEC',pic:''},{av:'AV8HisreoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV9HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV33TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV37TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV38TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV39TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV40TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV41TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV42TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV44TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV45TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV46TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV47TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV48TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV49TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV50TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV51TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV52TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV53TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV54TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV55TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV56TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV57TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV58TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV59TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV60TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV90TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV91TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV61TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV62TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV63TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV64TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV65TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV66TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV67TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV68TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV69TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV70TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV71TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV72TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV73TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV74TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV75TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV76TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV77TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV78TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV99TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV100TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV101TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV102TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84TotHisBarKgm',fld:'vTOTHISBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisBarMtr',fld:'vTOTHISBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotHisreoValorCausa',fld:'vTOTHISREOVALORCAUSA',pic:'ZZZZZZ9.999',hsh:true},{av:'AV95carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'cmbHisEstReo'},{av:'A548HisEstReo',fld:'HISESTREO',pic:'9'},{av:'A2297HisReoTn',fld:'HISREOTN',pic:'ZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A569HisReoFec',fld:'HISREOFEC',pic:''},{av:'A540HisBarKgm',fld:'HISBARKGM',pic:'ZZZZZ9.99'},{av:'A541HisBarMtr',fld:'HISBARMTR',pic:'ZZZZZ9.99'},{av:'A13700HisreoValo',fld:'HISREOVALO',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("VACCIONESDEGRUPO.CLICK",",oparms:[{av:'cmbavAccionesdegrupo'},{av:'AV94AccionesdeGrupo',fld:'vACCIONESDEGRUPO',pic:'ZZZ9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2297HisReoTn',fld:'HISREOTN',pic:'ZZZZZ9'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbHisEstReo'},{av:'edtHisReoFec_Visible',ctrl:'HISREOFEC',prop:'Visible'},{av:'edtHisReoHDR_Visible',ctrl:'HISREOHDR',prop:'Visible'},{av:'edtHisreoLote_Visible',ctrl:'HISREOLOTE',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtHisBarSer_Visible',ctrl:'HISBARSER',prop:'Visible'},{av:'edtHisReoDsc_Visible',ctrl:'HISREODSC',prop:'Visible'},{av:'edtHisColNom_Visible',ctrl:'HISCOLNOM',prop:'Visible'},{av:'edtHisNomCli_Visible',ctrl:'HISNOMCLI',prop:'Visible'},{av:'edtHisOpeTur_Visible',ctrl:'HISOPETUR',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtHisBarKgm_Visible',ctrl:'HISBARKGM',prop:'Visible'},{av:'edtHisBarMtr_Visible',ctrl:'HISBARMTR',prop:'Visible'},{av:'edtCostCausa_Visible',ctrl:'COSTCAUSA',prop:'Visible'},{av:'edtHisreoValo_Visible',ctrl:'HISREOVALO',prop:'Visible'},{av:'edtTipDefDsc_Visible',ctrl:'TIPDEFDSC',prop:'Visible'},{av:'edtDscCausa_Visible',ctrl:'DSCCAUSA',prop:'Visible'},{av:'edtRps_Dsc_Visible',ctrl:'RPS_DSC',prop:'Visible'},{av:'edtHisReoTn_Visible',ctrl:'HISREOTN',prop:'Visible'},{av:'edtHisOpecod_Visible',ctrl:'HISOPECOD',prop:'Visible'},{av:'edtHisAcCo_Visible',ctrl:'HISACCO',prop:'Visible'},{av:'edtHisAcCot_Visible',ctrl:'HISACCOT',prop:'Visible'},{av:'edtHisAdEAcCo_Visible',ctrl:'HISADEACCO',prop:'Visible'},{av:'edtHisAdEAcCt_Visible',ctrl:'HISADEACCT',prop:'Visible'},{av:'edtHisTipArtD_Visible',ctrl:'HISTIPARTD',prop:'Visible'},{av:'edtHisTipColD_Visible',ctrl:'HISTIPCOLD',prop:'Visible'},{av:'AV81GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV82GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''},{av:'AV84TotHisBarKgm',fld:'vTOTHISBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotHisBarMtr',fld:'vTOTHISBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotHisreoValorCausa',fld:'vTOTHISREOVALORCAUSA',pic:'ZZZZZZ9.999',hsh:true},{av:'AV85TotValueHisBarKgm',fld:'vTOTVALUEHISBARKGM',pic:''},{av:'AV87TotValueHisBarMtr',fld:'vTOTVALUEHISBARMTR',pic:''},{av:'AV93TotValueHisreoValorCausa',fld:'vTOTVALUEHISREOVALORCAUSA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1615L2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1715L2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_HISBARKGM","{handler:'valid_Hisbarkgm',iparms:[]");
      setEventMetadata("VALID_HISBARKGM",",oparms:[]}");
      setEventMetadata("VALID_COSTCAUSA","{handler:'valid_Costcausa',iparms:[]");
      setEventMetadata("VALID_COSTCAUSA",",oparms:[]}");
      setEventMetadata("VALID_HISBARCOD","{handler:'valid_Hisbarcod',iparms:[]");
      setEventMetadata("VALID_HISBARCOD",",oparms:[]}");
      setEventMetadata("VALID_HISCODREO","{handler:'valid_Hiscodreo',iparms:[]");
      setEventMetadata("VALID_HISCODREO",",oparms:[]}");
      setEventMetadata("VALID_HISCODPAR","{handler:'valid_Hiscodpar',iparms:[]");
      setEventMetadata("VALID_HISCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Histipcold',iparms:[]");
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
      wcpOAV5Emprcod = "" ;
      wcpOAV7HisreoFec = GXutil.nullDate() ;
      wcpOAV8HisreoFec_to = GXutil.nullDate() ;
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
      AV5Emprcod = "" ;
      AV7HisreoFec = GXutil.nullDate() ;
      AV8HisreoFec_to = GXutil.nullDate() ;
      AV20FilterFullText = "" ;
      AV25ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV32TFHisEstReo_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV33TFHisReoFec = GXutil.nullDate() ;
      AV37TFHisReoHDR = "" ;
      AV38TFHisReoHDR_Sel = "" ;
      AV39TFHisreoLote = "" ;
      AV40TFHisreoLote_Sel = "" ;
      AV41TFCliNom = "" ;
      AV42TFCliNom_Sel = "" ;
      AV43TFHisBarSer = "" ;
      AV44TFHisBarSer_Sel = "" ;
      AV45TFHisReoDsc = "" ;
      AV46TFHisReoDsc_Sel = "" ;
      AV47TFHisColNom = "" ;
      AV48TFHisColNom_Sel = "" ;
      AV49TFHisNomCli = "" ;
      AV50TFHisNomCli_Sel = "" ;
      AV53TFMaqCod = "" ;
      AV54TFMaqCod_Sel = "" ;
      AV55TFHisBarKgm = DecimalUtil.ZERO ;
      AV56TFHisBarKgm_To = DecimalUtil.ZERO ;
      AV57TFHisBarMtr = DecimalUtil.ZERO ;
      AV58TFHisBarMtr_To = DecimalUtil.ZERO ;
      AV59TFCostCausa = DecimalUtil.ZERO ;
      AV60TFCostCausa_To = DecimalUtil.ZERO ;
      AV90TFHisreoValorCausa = DecimalUtil.ZERO ;
      AV91TFHisreoValorCausa_To = DecimalUtil.ZERO ;
      AV61TFTipDefDsc = "" ;
      AV62TFTipDefDsc_Sel = "" ;
      AV63TFDscCausa = "" ;
      AV64TFDscCausa_Sel = "" ;
      AV65TFRps_Dsc = "" ;
      AV66TFRps_Dsc_Sel = "" ;
      AV71TFHisAcCo = "" ;
      AV72TFHisAcCo_Sel = "" ;
      AV73TFHisAcCot = "" ;
      AV74TFHisAcCot_Sel = "" ;
      AV75TFHisAdEAcCo = "" ;
      AV76TFHisAdEAcCo_Sel = "" ;
      AV77TFHisAdEAcCt = "" ;
      AV78TFHisAdEAcCt_Sel = "" ;
      AV99TFHisTipArtDsc = "" ;
      AV100TFHisTipArtDsc_Sel = "" ;
      AV101TFHisTipColDsc = "" ;
      AV102TFHisTipColDsc_Sel = "" ;
      AV156Pgmname = "" ;
      AV84TotHisBarKgm = DecimalUtil.ZERO ;
      AV86TotHisBarMtr = DecimalUtil.ZERO ;
      AV92TotHisreoValorCausa = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV28ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV79DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV31TFHisEstReo_SelsJson = "" ;
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
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV35DDO_HisReoFecAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A13697HisReoHDR = "" ;
      A13698HisreoLote = "" ;
      A279CliNom = "" ;
      A542HisBarSer = "" ;
      A2299HisReoDsc = "" ;
      A546HisColNom = "" ;
      A8889HisNomCli = "" ;
      A602MaqCod = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A13699CostCausa = DecimalUtil.ZERO ;
      A13700HisreoValo = DecimalUtil.ZERO ;
      A834TipDefDsc = "" ;
      A5086DscCausa = "" ;
      A7001Rps_Dsc = "" ;
      A5662HisAcCo = "" ;
      A5693HisAcCot = "" ;
      A5694HisAdEAcCo = "" ;
      A5695HisAdEAcCt = "" ;
      A544HisCodPar = "" ;
      A13843HisTipArtD = "" ;
      A13844HisTipColD = "" ;
      AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV105Reclamacionesynoconformidadeswcds_1_filterfulltext = "" ;
      lV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr = "" ;
      lV110Reclamacionesynoconformidadeswcds_6_tfhisreolote = "" ;
      lV112Reclamacionesynoconformidadeswcds_8_tfclinom = "" ;
      lV114Reclamacionesynoconformidadeswcds_10_tfhisbarser = "" ;
      lV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc = "" ;
      lV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom = "" ;
      lV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli = "" ;
      lV124Reclamacionesynoconformidadeswcds_20_tfmaqcod = "" ;
      lV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc = "" ;
      lV136Reclamacionesynoconformidadeswcds_32_tfdsccausa = "" ;
      lV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc = "" ;
      lV144Reclamacionesynoconformidadeswcds_40_tfhisacco = "" ;
      lV146Reclamacionesynoconformidadeswcds_42_tfhisaccot = "" ;
      lV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco = "" ;
      lV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct = "" ;
      lV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc = "" ;
      lV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc = "" ;
      AV105Reclamacionesynoconformidadeswcds_1_filterfulltext = "" ;
      AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec = GXutil.nullDate() ;
      AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel = "" ;
      AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr = "" ;
      AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel = "" ;
      AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote = "" ;
      AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel = "" ;
      AV112Reclamacionesynoconformidadeswcds_8_tfclinom = "" ;
      AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel = "" ;
      AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser = "" ;
      AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel = "" ;
      AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc = "" ;
      AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel = "" ;
      AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom = "" ;
      AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel = "" ;
      AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli = "" ;
      AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel = "" ;
      AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod = "" ;
      AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm = DecimalUtil.ZERO ;
      AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to = DecimalUtil.ZERO ;
      AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr = DecimalUtil.ZERO ;
      AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to = DecimalUtil.ZERO ;
      AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa = DecimalUtil.ZERO ;
      AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to = DecimalUtil.ZERO ;
      AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa = DecimalUtil.ZERO ;
      AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to = DecimalUtil.ZERO ;
      AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel = "" ;
      AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc = "" ;
      AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel = "" ;
      AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa = "" ;
      AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel = "" ;
      AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc = "" ;
      AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel = "" ;
      AV144Reclamacionesynoconformidadeswcds_40_tfhisacco = "" ;
      AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel = "" ;
      AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot = "" ;
      AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel = "" ;
      AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco = "" ;
      AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel = "" ;
      AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct = "" ;
      AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel = "" ;
      AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc = "" ;
      AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel = "" ;
      AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc = "" ;
      H015L2_A571HisTipArt = new short[1] ;
      H015L2_n571HisTipArt = new boolean[] {false} ;
      H015L2_A833TipDefCod = new short[1] ;
      H015L2_A5085CodCausa = new short[1] ;
      H015L2_n5085CodCausa = new boolean[] {false} ;
      H015L2_A252CliCod = new int[1] ;
      H015L2_n252CliCod = new boolean[] {false} ;
      H015L2_A7000Rps_Cod = new short[1] ;
      H015L2_n7000Rps_Cod = new boolean[] {false} ;
      H015L2_A396EmprCod = new String[] {""} ;
      H015L2_A572HisTipCol = new byte[1] ;
      H015L2_n572HisTipCol = new boolean[] {false} ;
      H015L2_A13844HisTipColD = new String[] {""} ;
      H015L2_n13844HisTipColD = new boolean[] {false} ;
      H015L2_A13843HisTipArtD = new String[] {""} ;
      H015L2_n13843HisTipArtD = new boolean[] {false} ;
      H015L2_A5695HisAdEAcCt = new String[] {""} ;
      H015L2_n5695HisAdEAcCt = new boolean[] {false} ;
      H015L2_A5694HisAdEAcCo = new String[] {""} ;
      H015L2_n5694HisAdEAcCo = new boolean[] {false} ;
      H015L2_A5693HisAcCot = new String[] {""} ;
      H015L2_n5693HisAcCot = new boolean[] {false} ;
      H015L2_A5662HisAcCo = new String[] {""} ;
      H015L2_n5662HisAcCo = new boolean[] {false} ;
      H015L2_A12949HisOpecod = new int[1] ;
      H015L2_n12949HisOpecod = new boolean[] {false} ;
      H015L2_A2297HisReoTn = new int[1] ;
      H015L2_n2297HisReoTn = new boolean[] {false} ;
      H015L2_A7001Rps_Dsc = new String[] {""} ;
      H015L2_n7001Rps_Dsc = new boolean[] {false} ;
      H015L2_A5086DscCausa = new String[] {""} ;
      H015L2_n5086DscCausa = new boolean[] {false} ;
      H015L2_A834TipDefDsc = new String[] {""} ;
      H015L2_n834TipDefDsc = new boolean[] {false} ;
      H015L2_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015L2_n541HisBarMtr = new boolean[] {false} ;
      H015L2_A602MaqCod = new String[] {""} ;
      H015L2_n602MaqCod = new boolean[] {false} ;
      H015L2_A12950HisOpeTur = new byte[1] ;
      H015L2_n12950HisOpeTur = new boolean[] {false} ;
      H015L2_A8889HisNomCli = new String[] {""} ;
      H015L2_n8889HisNomCli = new boolean[] {false} ;
      H015L2_A546HisColNom = new String[] {""} ;
      H015L2_n546HisColNom = new boolean[] {false} ;
      H015L2_A2299HisReoDsc = new String[] {""} ;
      H015L2_n2299HisReoDsc = new boolean[] {false} ;
      H015L2_A542HisBarSer = new String[] {""} ;
      H015L2_n542HisBarSer = new boolean[] {false} ;
      H015L2_A279CliNom = new String[] {""} ;
      H015L2_A13698HisreoLote = new String[] {""} ;
      H015L2_n13698HisreoLote = new boolean[] {false} ;
      H015L2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      H015L2_n569HisReoFec = new boolean[] {false} ;
      H015L2_A548HisEstReo = new byte[1] ;
      H015L2_n548HisEstReo = new boolean[] {false} ;
      H015L2_A544HisCodPar = new String[] {""} ;
      H015L2_A545HisCodReo = new byte[1] ;
      H015L2_A539HisBarCod = new int[1] ;
      H015L2_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015L2_n13699CostCausa = new boolean[] {false} ;
      H015L2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015L2_n540HisBarKgm = new boolean[] {false} ;
      H015L3_AGRID_nRecordCount = new long[1] ;
      AV85TotValueHisBarKgm = "" ;
      AV87TotValueHisBarMtr = "" ;
      AV93TotValueHisreoValorCausa = "" ;
      AV96Station = "" ;
      AV97EmprNom = "" ;
      AV98UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV11WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV23ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV29ManageFiltersXml = "" ;
      AV21ExcelFilename = "" ;
      AV22ErrorMessage = "" ;
      AV24UserCustomValue = "" ;
      AV26ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char42 = "" ;
      GXv_char43 = new String[1] ;
      GXt_char40 = "" ;
      GXv_char41 = new String[1] ;
      GXt_char38 = "" ;
      GXv_char39 = new String[1] ;
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
      GXt_char15 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState44 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV13TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12HTTPRequest = httpContext.getHttpRequest();
      H015L4_A571HisTipArt = new short[1] ;
      H015L4_n571HisTipArt = new boolean[] {false} ;
      H015L4_A572HisTipCol = new byte[1] ;
      H015L4_n572HisTipCol = new boolean[] {false} ;
      H015L4_A833TipDefCod = new short[1] ;
      H015L4_A5085CodCausa = new short[1] ;
      H015L4_n5085CodCausa = new boolean[] {false} ;
      H015L4_A7000Rps_Cod = new short[1] ;
      H015L4_n7000Rps_Cod = new boolean[] {false} ;
      H015L4_A252CliCod = new int[1] ;
      H015L4_n252CliCod = new boolean[] {false} ;
      H015L4_A396EmprCod = new String[] {""} ;
      H015L4_A13844HisTipColD = new String[] {""} ;
      H015L4_n13844HisTipColD = new boolean[] {false} ;
      H015L4_A13843HisTipArtD = new String[] {""} ;
      H015L4_n13843HisTipArtD = new boolean[] {false} ;
      H015L4_A5695HisAdEAcCt = new String[] {""} ;
      H015L4_n5695HisAdEAcCt = new boolean[] {false} ;
      H015L4_A5694HisAdEAcCo = new String[] {""} ;
      H015L4_n5694HisAdEAcCo = new boolean[] {false} ;
      H015L4_A5693HisAcCot = new String[] {""} ;
      H015L4_n5693HisAcCot = new boolean[] {false} ;
      H015L4_A5662HisAcCo = new String[] {""} ;
      H015L4_n5662HisAcCo = new boolean[] {false} ;
      H015L4_A12949HisOpecod = new int[1] ;
      H015L4_n12949HisOpecod = new boolean[] {false} ;
      H015L4_A2297HisReoTn = new int[1] ;
      H015L4_n2297HisReoTn = new boolean[] {false} ;
      H015L4_A7001Rps_Dsc = new String[] {""} ;
      H015L4_n7001Rps_Dsc = new boolean[] {false} ;
      H015L4_A5086DscCausa = new String[] {""} ;
      H015L4_n5086DscCausa = new boolean[] {false} ;
      H015L4_A834TipDefDsc = new String[] {""} ;
      H015L4_n834TipDefDsc = new boolean[] {false} ;
      H015L4_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015L4_n541HisBarMtr = new boolean[] {false} ;
      H015L4_A602MaqCod = new String[] {""} ;
      H015L4_n602MaqCod = new boolean[] {false} ;
      H015L4_A12950HisOpeTur = new byte[1] ;
      H015L4_n12950HisOpeTur = new boolean[] {false} ;
      H015L4_A8889HisNomCli = new String[] {""} ;
      H015L4_n8889HisNomCli = new boolean[] {false} ;
      H015L4_A546HisColNom = new String[] {""} ;
      H015L4_n546HisColNom = new boolean[] {false} ;
      H015L4_A2299HisReoDsc = new String[] {""} ;
      H015L4_n2299HisReoDsc = new boolean[] {false} ;
      H015L4_A542HisBarSer = new String[] {""} ;
      H015L4_n542HisBarSer = new boolean[] {false} ;
      H015L4_A279CliNom = new String[] {""} ;
      H015L4_A13698HisreoLote = new String[] {""} ;
      H015L4_n13698HisreoLote = new boolean[] {false} ;
      H015L4_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      H015L4_n569HisReoFec = new boolean[] {false} ;
      H015L4_A548HisEstReo = new byte[1] ;
      H015L4_n548HisEstReo = new boolean[] {false} ;
      H015L4_A544HisCodPar = new String[] {""} ;
      H015L4_A545HisCodReo = new byte[1] ;
      H015L4_A539HisBarCod = new int[1] ;
      H015L4_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015L4_n13699CostCausa = new boolean[] {false} ;
      H015L4_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015L4_n540HisBarKgm = new boolean[] {false} ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV6Clicod = "" ;
      sCtrlAV83Clicod_to = "" ;
      sCtrlAV7HisreoFec = "" ;
      sCtrlAV8HisreoFec_to = "" ;
      sCtrlAV9HisEstReo = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.reclamacionesynoconformidadeswc__default(),
         new Object[] {
             new Object[] {
            H015L2_A571HisTipArt, H015L2_n571HisTipArt, H015L2_A833TipDefCod, H015L2_A5085CodCausa, H015L2_n5085CodCausa, H015L2_A252CliCod, H015L2_n252CliCod, H015L2_A7000Rps_Cod, H015L2_n7000Rps_Cod, H015L2_A396EmprCod,
            H015L2_A572HisTipCol, H015L2_n572HisTipCol, H015L2_A13844HisTipColD, H015L2_n13844HisTipColD, H015L2_A13843HisTipArtD, H015L2_n13843HisTipArtD, H015L2_A5695HisAdEAcCt, H015L2_n5695HisAdEAcCt, H015L2_A5694HisAdEAcCo, H015L2_n5694HisAdEAcCo,
            H015L2_A5693HisAcCot, H015L2_n5693HisAcCot, H015L2_A5662HisAcCo, H015L2_n5662HisAcCo, H015L2_A12949HisOpecod, H015L2_n12949HisOpecod, H015L2_A2297HisReoTn, H015L2_n2297HisReoTn, H015L2_A7001Rps_Dsc, H015L2_n7001Rps_Dsc,
            H015L2_A5086DscCausa, H015L2_n5086DscCausa, H015L2_A834TipDefDsc, H015L2_n834TipDefDsc, H015L2_A541HisBarMtr, H015L2_n541HisBarMtr, H015L2_A602MaqCod, H015L2_n602MaqCod, H015L2_A12950HisOpeTur, H015L2_n12950HisOpeTur,
            H015L2_A8889HisNomCli, H015L2_n8889HisNomCli, H015L2_A546HisColNom, H015L2_n546HisColNom, H015L2_A2299HisReoDsc, H015L2_n2299HisReoDsc, H015L2_A542HisBarSer, H015L2_n542HisBarSer, H015L2_A279CliNom, H015L2_A13698HisreoLote,
            H015L2_n13698HisreoLote, H015L2_A569HisReoFec, H015L2_n569HisReoFec, H015L2_A548HisEstReo, H015L2_n548HisEstReo, H015L2_A544HisCodPar, H015L2_A545HisCodReo, H015L2_A539HisBarCod, H015L2_A13699CostCausa, H015L2_n13699CostCausa,
            H015L2_A540HisBarKgm, H015L2_n540HisBarKgm
            }
            , new Object[] {
            H015L3_AGRID_nRecordCount
            }
            , new Object[] {
            H015L4_A571HisTipArt, H015L4_n571HisTipArt, H015L4_A572HisTipCol, H015L4_n572HisTipCol, H015L4_A833TipDefCod, H015L4_A5085CodCausa, H015L4_n5085CodCausa, H015L4_A7000Rps_Cod, H015L4_n7000Rps_Cod, H015L4_A252CliCod,
            H015L4_n252CliCod, H015L4_A396EmprCod, H015L4_A13844HisTipColD, H015L4_n13844HisTipColD, H015L4_A13843HisTipArtD, H015L4_n13843HisTipArtD, H015L4_A5695HisAdEAcCt, H015L4_n5695HisAdEAcCt, H015L4_A5694HisAdEAcCo, H015L4_n5694HisAdEAcCo,
            H015L4_A5693HisAcCot, H015L4_n5693HisAcCot, H015L4_A5662HisAcCo, H015L4_n5662HisAcCo, H015L4_A12949HisOpecod, H015L4_n12949HisOpecod, H015L4_A2297HisReoTn, H015L4_n2297HisReoTn, H015L4_A7001Rps_Dsc, H015L4_n7001Rps_Dsc,
            H015L4_A5086DscCausa, H015L4_n5086DscCausa, H015L4_A834TipDefDsc, H015L4_n834TipDefDsc, H015L4_A541HisBarMtr, H015L4_n541HisBarMtr, H015L4_A602MaqCod, H015L4_n602MaqCod, H015L4_A12950HisOpeTur, H015L4_n12950HisOpeTur,
            H015L4_A8889HisNomCli, H015L4_n8889HisNomCli, H015L4_A546HisColNom, H015L4_n546HisColNom, H015L4_A2299HisReoDsc, H015L4_n2299HisReoDsc, H015L4_A542HisBarSer, H015L4_n542HisBarSer, H015L4_A279CliNom, H015L4_A13698HisreoLote,
            H015L4_n13698HisreoLote, H015L4_A569HisReoFec, H015L4_n569HisReoFec, H015L4_A548HisEstReo, H015L4_n548HisEstReo, H015L4_A544HisCodPar, H015L4_A545HisCodReo, H015L4_A539HisBarCod, H015L4_A13699CostCausa, H015L4_n13699CostCausa,
            H015L4_A540HisBarKgm, H015L4_n540HisBarKgm
            }
         }
      );
      AV156Pgmname = "ReclamacionesyNoConformidadesWC" ;
      /* GeneXus formulas. */
      AV156Pgmname = "ReclamacionesyNoConformidadesWC" ;
      Gx_err = (short)(0) ;
      edtavTotvaluehisbarkgm_Enabled = 0 ;
      edtavTotvaluehisbarmtr_Enabled = 0 ;
      edtavTotvaluehisreovalorcausa_Enabled = 0 ;
   }

   private byte wcpOAV9HisEstReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV9HisEstReo ;
   private byte AV30ManageFiltersExecutionStep ;
   private byte AV51TFHisOpeTur ;
   private byte AV52TFHisOpeTur_To ;
   private byte A572HisTipCol ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A548HisEstReo ;
   private byte A12950HisOpeTur ;
   private byte A545HisCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur ;
   private byte AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to ;
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
   private short AV17OrderedBy ;
   private short AV95carvitin ;
   private short A7000Rps_Cod ;
   private short wbEnd ;
   private short wbStart ;
   private short AV94AccionesdeGrupo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A571HisTipArt ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private int wcpOAV6Clicod ;
   private int wcpOAV83Clicod_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int AV6Clicod ;
   private int AV83Clicod_to ;
   private int nGXsfl_41_idx=1 ;
   private int AV67TFHisReoTn ;
   private int AV68TFHisReoTn_To ;
   private int AV69TFHisOpecod ;
   private int AV70TFHisOpecod_To ;
   private int A252CliCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A2297HisReoTn ;
   private int A12949HisOpecod ;
   private int A539HisBarCod ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluehisbarkgm_Enabled ;
   private int edtavTotvaluehisbarmtr_Enabled ;
   private int edtavTotvaluehisreovalorcausa_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels_size ;
   private int AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn ;
   private int AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to ;
   private int AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod ;
   private int AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to ;
   private int edtHisReoFec_Visible ;
   private int edtHisReoHDR_Visible ;
   private int edtHisreoLote_Visible ;
   private int edtCliNom_Visible ;
   private int edtHisBarSer_Visible ;
   private int edtHisReoDsc_Visible ;
   private int edtHisColNom_Visible ;
   private int edtHisNomCli_Visible ;
   private int edtHisOpeTur_Visible ;
   private int edtMaqCod_Visible ;
   private int edtHisBarKgm_Visible ;
   private int edtHisBarMtr_Visible ;
   private int edtCostCausa_Visible ;
   private int edtHisreoValo_Visible ;
   private int edtTipDefDsc_Visible ;
   private int edtDscCausa_Visible ;
   private int edtRps_Dsc_Visible ;
   private int edtHisReoTn_Visible ;
   private int edtHisOpecod_Visible ;
   private int edtHisAcCo_Visible ;
   private int edtHisAcCot_Visible ;
   private int edtHisAdEAcCo_Visible ;
   private int edtHisAdEAcCt_Visible ;
   private int edtHisTipArtD_Visible ;
   private int edtHisTipColD_Visible ;
   private int AV80PageToGo ;
   private int AV157GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV81GridCurrentPage ;
   private long AV82GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV55TFHisBarKgm ;
   private java.math.BigDecimal AV56TFHisBarKgm_To ;
   private java.math.BigDecimal AV57TFHisBarMtr ;
   private java.math.BigDecimal AV58TFHisBarMtr_To ;
   private java.math.BigDecimal AV59TFCostCausa ;
   private java.math.BigDecimal AV60TFCostCausa_To ;
   private java.math.BigDecimal AV90TFHisreoValorCausa ;
   private java.math.BigDecimal AV91TFHisreoValorCausa_To ;
   private java.math.BigDecimal AV84TotHisBarKgm ;
   private java.math.BigDecimal AV86TotHisBarMtr ;
   private java.math.BigDecimal AV92TotHisreoValorCausa ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal A13699CostCausa ;
   private java.math.BigDecimal A13700HisreoValo ;
   private java.math.BigDecimal AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm ;
   private java.math.BigDecimal AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to ;
   private java.math.BigDecimal AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr ;
   private java.math.BigDecimal AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to ;
   private java.math.BigDecimal AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa ;
   private java.math.BigDecimal AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to ;
   private java.math.BigDecimal AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa ;
   private java.math.BigDecimal AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to ;
   private String wcpOAV5Emprcod ;
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
   private String AV5Emprcod ;
   private String sGXsfl_41_idx="0001" ;
   private String AV37TFHisReoHDR ;
   private String AV38TFHisReoHDR_Sel ;
   private String AV39TFHisreoLote ;
   private String AV40TFHisreoLote_Sel ;
   private String AV41TFCliNom ;
   private String AV42TFCliNom_Sel ;
   private String AV43TFHisBarSer ;
   private String AV44TFHisBarSer_Sel ;
   private String AV45TFHisReoDsc ;
   private String AV46TFHisReoDsc_Sel ;
   private String AV47TFHisColNom ;
   private String AV48TFHisColNom_Sel ;
   private String AV49TFHisNomCli ;
   private String AV50TFHisNomCli_Sel ;
   private String AV53TFMaqCod ;
   private String AV54TFMaqCod_Sel ;
   private String AV61TFTipDefDsc ;
   private String AV62TFTipDefDsc_Sel ;
   private String AV63TFDscCausa ;
   private String AV64TFDscCausa_Sel ;
   private String AV65TFRps_Dsc ;
   private String AV66TFRps_Dsc_Sel ;
   private String AV99TFHisTipArtDsc ;
   private String AV100TFHisTipArtDsc_Sel ;
   private String AV101TFHisTipColDsc ;
   private String AV102TFHisTipColDsc_Sel ;
   private String AV156Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
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
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_hisreofecauxdates_Internalname ;
   private String edtavDdo_hisreofecauxdate_Internalname ;
   private String edtavDdo_hisreofecauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtHisReoFec_Internalname ;
   private String A13697HisReoHDR ;
   private String edtHisReoHDR_Internalname ;
   private String A13698HisreoLote ;
   private String edtHisreoLote_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A542HisBarSer ;
   private String edtHisBarSer_Internalname ;
   private String A2299HisReoDsc ;
   private String edtHisReoDsc_Internalname ;
   private String A546HisColNom ;
   private String edtHisColNom_Internalname ;
   private String A8889HisNomCli ;
   private String edtHisNomCli_Internalname ;
   private String edtHisOpeTur_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String edtHisBarKgm_Internalname ;
   private String edtHisBarMtr_Internalname ;
   private String edtCostCausa_Internalname ;
   private String edtHisreoValo_Internalname ;
   private String A834TipDefDsc ;
   private String edtTipDefDsc_Internalname ;
   private String A5086DscCausa ;
   private String edtDscCausa_Internalname ;
   private String A7001Rps_Dsc ;
   private String edtRps_Dsc_Internalname ;
   private String edtHisReoTn_Internalname ;
   private String edtHisOpecod_Internalname ;
   private String edtHisAcCo_Internalname ;
   private String edtHisAcCot_Internalname ;
   private String edtHisAdEAcCo_Internalname ;
   private String edtHisAdEAcCt_Internalname ;
   private String edtHisBarCod_Internalname ;
   private String edtHisCodReo_Internalname ;
   private String A544HisCodPar ;
   private String edtHisCodPar_Internalname ;
   private String A13843HisTipArtD ;
   private String edtHisTipArtD_Internalname ;
   private String A13844HisTipColD ;
   private String edtHisTipColD_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavTotvaluehisbarkgm_Internalname ;
   private String edtavTotvaluehisbarmtr_Internalname ;
   private String edtavTotvaluehisreovalorcausa_Internalname ;
   private String scmdbuf ;
   private String lV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr ;
   private String lV110Reclamacionesynoconformidadeswcds_6_tfhisreolote ;
   private String lV112Reclamacionesynoconformidadeswcds_8_tfclinom ;
   private String lV114Reclamacionesynoconformidadeswcds_10_tfhisbarser ;
   private String lV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc ;
   private String lV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom ;
   private String lV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli ;
   private String lV124Reclamacionesynoconformidadeswcds_20_tfmaqcod ;
   private String lV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc ;
   private String lV136Reclamacionesynoconformidadeswcds_32_tfdsccausa ;
   private String lV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc ;
   private String lV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc ;
   private String lV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc ;
   private String AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel ;
   private String AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr ;
   private String AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel ;
   private String AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote ;
   private String AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel ;
   private String AV112Reclamacionesynoconformidadeswcds_8_tfclinom ;
   private String AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel ;
   private String AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser ;
   private String AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel ;
   private String AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc ;
   private String AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel ;
   private String AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom ;
   private String AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel ;
   private String AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli ;
   private String AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel ;
   private String AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod ;
   private String AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel ;
   private String AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc ;
   private String AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel ;
   private String AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa ;
   private String AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel ;
   private String AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc ;
   private String AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel ;
   private String AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc ;
   private String AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel ;
   private String AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc ;
   private String AV96Station ;
   private String AV97EmprNom ;
   private String AV98UsurCod ;
   private String edtRps_Dsc_Link ;
   private String edtHisTipColD_Link ;
   private String GXt_char42 ;
   private String GXv_char43[] ;
   private String GXt_char40 ;
   private String GXv_char41[] ;
   private String GXt_char38 ;
   private String GXv_char39[] ;
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
   private String GXt_char15 ;
   private String GXv_char4[] ;
   private String GXt_char14 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluehisbarkgm_Jsonclick ;
   private String edtavTotvaluehisbarmtr_Jsonclick ;
   private String edtavTotvaluehisreovalorcausa_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV6Clicod ;
   private String sCtrlAV83Clicod_to ;
   private String sCtrlAV7HisreoFec ;
   private String sCtrlAV8HisreoFec_to ;
   private String sCtrlAV9HisEstReo ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtHisReoFec_Jsonclick ;
   private String edtHisReoHDR_Jsonclick ;
   private String edtHisreoLote_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtHisBarSer_Jsonclick ;
   private String edtHisReoDsc_Jsonclick ;
   private String edtHisColNom_Jsonclick ;
   private String edtHisNomCli_Jsonclick ;
   private String edtHisOpeTur_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtHisBarKgm_Jsonclick ;
   private String edtHisBarMtr_Jsonclick ;
   private String edtCostCausa_Jsonclick ;
   private String edtHisreoValo_Jsonclick ;
   private String edtTipDefDsc_Jsonclick ;
   private String edtDscCausa_Jsonclick ;
   private String edtRps_Dsc_Jsonclick ;
   private String edtHisReoTn_Jsonclick ;
   private String edtHisOpecod_Jsonclick ;
   private String edtHisAcCo_Jsonclick ;
   private String edtHisAcCot_Jsonclick ;
   private String edtHisAdEAcCo_Jsonclick ;
   private String edtHisAdEAcCt_Jsonclick ;
   private String edtHisBarCod_Jsonclick ;
   private String edtHisCodReo_Jsonclick ;
   private String edtHisCodPar_Jsonclick ;
   private String edtHisTipArtD_Jsonclick ;
   private String edtHisTipColD_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV7HisreoFec ;
   private java.util.Date wcpOAV8HisreoFec_to ;
   private java.util.Date AV7HisreoFec ;
   private java.util.Date AV8HisreoFec_to ;
   private java.util.Date AV33TFHisReoFec ;
   private java.util.Date AV35DDO_HisReoFecAuxDate ;
   private java.util.Date A569HisReoFec ;
   private java.util.Date AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV18OrderedDsc ;
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
   private boolean n548HisEstReo ;
   private boolean n569HisReoFec ;
   private boolean n13698HisreoLote ;
   private boolean n542HisBarSer ;
   private boolean n2299HisReoDsc ;
   private boolean n546HisColNom ;
   private boolean n8889HisNomCli ;
   private boolean n12950HisOpeTur ;
   private boolean n602MaqCod ;
   private boolean n540HisBarKgm ;
   private boolean n541HisBarMtr ;
   private boolean n13699CostCausa ;
   private boolean n834TipDefDsc ;
   private boolean n5086DscCausa ;
   private boolean n7001Rps_Dsc ;
   private boolean n2297HisReoTn ;
   private boolean n12949HisOpecod ;
   private boolean n5662HisAcCo ;
   private boolean n5693HisAcCot ;
   private boolean n5694HisAdEAcCo ;
   private boolean n5695HisAdEAcCt ;
   private boolean n13843HisTipArtD ;
   private boolean n13844HisTipColD ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n571HisTipArt ;
   private boolean n5085CodCausa ;
   private boolean n252CliCod ;
   private boolean n7000Rps_Cod ;
   private boolean n572HisTipCol ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV31TFHisEstReo_SelsJson ;
   private String AV23ColumnsSelectorXML ;
   private String AV29ManageFiltersXml ;
   private String AV24UserCustomValue ;
   private String AV20FilterFullText ;
   private String AV71TFHisAcCo ;
   private String AV72TFHisAcCo_Sel ;
   private String AV73TFHisAcCot ;
   private String AV74TFHisAcCot_Sel ;
   private String AV75TFHisAdEAcCo ;
   private String AV76TFHisAdEAcCo_Sel ;
   private String AV77TFHisAdEAcCt ;
   private String AV78TFHisAdEAcCt_Sel ;
   private String A5662HisAcCo ;
   private String A5693HisAcCot ;
   private String A5694HisAdEAcCo ;
   private String A5695HisAdEAcCt ;
   private String lV105Reclamacionesynoconformidadeswcds_1_filterfulltext ;
   private String lV144Reclamacionesynoconformidadeswcds_40_tfhisacco ;
   private String lV146Reclamacionesynoconformidadeswcds_42_tfhisaccot ;
   private String lV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco ;
   private String lV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct ;
   private String AV105Reclamacionesynoconformidadeswcds_1_filterfulltext ;
   private String AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel ;
   private String AV144Reclamacionesynoconformidadeswcds_40_tfhisacco ;
   private String AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel ;
   private String AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot ;
   private String AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel ;
   private String AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco ;
   private String AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel ;
   private String AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct ;
   private String AV85TotValueHisBarKgm ;
   private String AV87TotValueHisBarMtr ;
   private String AV93TotValueHisreoValorCausa ;
   private String AV21ExcelFilename ;
   private String AV22ErrorMessage ;
   private GXSimpleCollection<Byte> AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels ;
   private GXSimpleCollection<Byte> AV32TFHisEstReo_Sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV12HTTPRequest ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavAccionesdegrupo ;
   private HTMLChoice cmbHisEstReo ;
   private IDataStoreProvider pr_default ;
   private short[] H015L2_A571HisTipArt ;
   private boolean[] H015L2_n571HisTipArt ;
   private short[] H015L2_A833TipDefCod ;
   private short[] H015L2_A5085CodCausa ;
   private boolean[] H015L2_n5085CodCausa ;
   private int[] H015L2_A252CliCod ;
   private boolean[] H015L2_n252CliCod ;
   private short[] H015L2_A7000Rps_Cod ;
   private boolean[] H015L2_n7000Rps_Cod ;
   private String[] H015L2_A396EmprCod ;
   private byte[] H015L2_A572HisTipCol ;
   private boolean[] H015L2_n572HisTipCol ;
   private String[] H015L2_A13844HisTipColD ;
   private boolean[] H015L2_n13844HisTipColD ;
   private String[] H015L2_A13843HisTipArtD ;
   private boolean[] H015L2_n13843HisTipArtD ;
   private String[] H015L2_A5695HisAdEAcCt ;
   private boolean[] H015L2_n5695HisAdEAcCt ;
   private String[] H015L2_A5694HisAdEAcCo ;
   private boolean[] H015L2_n5694HisAdEAcCo ;
   private String[] H015L2_A5693HisAcCot ;
   private boolean[] H015L2_n5693HisAcCot ;
   private String[] H015L2_A5662HisAcCo ;
   private boolean[] H015L2_n5662HisAcCo ;
   private int[] H015L2_A12949HisOpecod ;
   private boolean[] H015L2_n12949HisOpecod ;
   private int[] H015L2_A2297HisReoTn ;
   private boolean[] H015L2_n2297HisReoTn ;
   private String[] H015L2_A7001Rps_Dsc ;
   private boolean[] H015L2_n7001Rps_Dsc ;
   private String[] H015L2_A5086DscCausa ;
   private boolean[] H015L2_n5086DscCausa ;
   private String[] H015L2_A834TipDefDsc ;
   private boolean[] H015L2_n834TipDefDsc ;
   private java.math.BigDecimal[] H015L2_A541HisBarMtr ;
   private boolean[] H015L2_n541HisBarMtr ;
   private String[] H015L2_A602MaqCod ;
   private boolean[] H015L2_n602MaqCod ;
   private byte[] H015L2_A12950HisOpeTur ;
   private boolean[] H015L2_n12950HisOpeTur ;
   private String[] H015L2_A8889HisNomCli ;
   private boolean[] H015L2_n8889HisNomCli ;
   private String[] H015L2_A546HisColNom ;
   private boolean[] H015L2_n546HisColNom ;
   private String[] H015L2_A2299HisReoDsc ;
   private boolean[] H015L2_n2299HisReoDsc ;
   private String[] H015L2_A542HisBarSer ;
   private boolean[] H015L2_n542HisBarSer ;
   private String[] H015L2_A279CliNom ;
   private String[] H015L2_A13698HisreoLote ;
   private boolean[] H015L2_n13698HisreoLote ;
   private java.util.Date[] H015L2_A569HisReoFec ;
   private boolean[] H015L2_n569HisReoFec ;
   private byte[] H015L2_A548HisEstReo ;
   private boolean[] H015L2_n548HisEstReo ;
   private String[] H015L2_A544HisCodPar ;
   private byte[] H015L2_A545HisCodReo ;
   private int[] H015L2_A539HisBarCod ;
   private java.math.BigDecimal[] H015L2_A13699CostCausa ;
   private boolean[] H015L2_n13699CostCausa ;
   private java.math.BigDecimal[] H015L2_A540HisBarKgm ;
   private boolean[] H015L2_n540HisBarKgm ;
   private long[] H015L3_AGRID_nRecordCount ;
   private short[] H015L4_A571HisTipArt ;
   private boolean[] H015L4_n571HisTipArt ;
   private byte[] H015L4_A572HisTipCol ;
   private boolean[] H015L4_n572HisTipCol ;
   private short[] H015L4_A833TipDefCod ;
   private short[] H015L4_A5085CodCausa ;
   private boolean[] H015L4_n5085CodCausa ;
   private short[] H015L4_A7000Rps_Cod ;
   private boolean[] H015L4_n7000Rps_Cod ;
   private int[] H015L4_A252CliCod ;
   private boolean[] H015L4_n252CliCod ;
   private String[] H015L4_A396EmprCod ;
   private String[] H015L4_A13844HisTipColD ;
   private boolean[] H015L4_n13844HisTipColD ;
   private String[] H015L4_A13843HisTipArtD ;
   private boolean[] H015L4_n13843HisTipArtD ;
   private String[] H015L4_A5695HisAdEAcCt ;
   private boolean[] H015L4_n5695HisAdEAcCt ;
   private String[] H015L4_A5694HisAdEAcCo ;
   private boolean[] H015L4_n5694HisAdEAcCo ;
   private String[] H015L4_A5693HisAcCot ;
   private boolean[] H015L4_n5693HisAcCot ;
   private String[] H015L4_A5662HisAcCo ;
   private boolean[] H015L4_n5662HisAcCo ;
   private int[] H015L4_A12949HisOpecod ;
   private boolean[] H015L4_n12949HisOpecod ;
   private int[] H015L4_A2297HisReoTn ;
   private boolean[] H015L4_n2297HisReoTn ;
   private String[] H015L4_A7001Rps_Dsc ;
   private boolean[] H015L4_n7001Rps_Dsc ;
   private String[] H015L4_A5086DscCausa ;
   private boolean[] H015L4_n5086DscCausa ;
   private String[] H015L4_A834TipDefDsc ;
   private boolean[] H015L4_n834TipDefDsc ;
   private java.math.BigDecimal[] H015L4_A541HisBarMtr ;
   private boolean[] H015L4_n541HisBarMtr ;
   private String[] H015L4_A602MaqCod ;
   private boolean[] H015L4_n602MaqCod ;
   private byte[] H015L4_A12950HisOpeTur ;
   private boolean[] H015L4_n12950HisOpeTur ;
   private String[] H015L4_A8889HisNomCli ;
   private boolean[] H015L4_n8889HisNomCli ;
   private String[] H015L4_A546HisColNom ;
   private boolean[] H015L4_n546HisColNom ;
   private String[] H015L4_A2299HisReoDsc ;
   private boolean[] H015L4_n2299HisReoDsc ;
   private String[] H015L4_A542HisBarSer ;
   private boolean[] H015L4_n542HisBarSer ;
   private String[] H015L4_A279CliNom ;
   private String[] H015L4_A13698HisreoLote ;
   private boolean[] H015L4_n13698HisreoLote ;
   private java.util.Date[] H015L4_A569HisReoFec ;
   private boolean[] H015L4_n569HisReoFec ;
   private byte[] H015L4_A548HisEstReo ;
   private boolean[] H015L4_n548HisEstReo ;
   private String[] H015L4_A544HisCodPar ;
   private byte[] H015L4_A545HisCodReo ;
   private int[] H015L4_A539HisBarCod ;
   private java.math.BigDecimal[] H015L4_A13699CostCausa ;
   private boolean[] H015L4_n13699CostCausa ;
   private java.math.BigDecimal[] H015L4_A540HisBarKgm ;
   private boolean[] H015L4_n540HisBarKgm ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV28ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV79DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState44[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV13TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV11WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class reclamacionesynoconformidadeswc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H015L2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A548HisEstReo ,
                                          GXSimpleCollection<Byte> AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels ,
                                          String AV105Reclamacionesynoconformidadeswcds_1_filterfulltext ,
                                          int AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels_size ,
                                          java.util.Date AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec ,
                                          String AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel ,
                                          String AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr ,
                                          String AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel ,
                                          String AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote ,
                                          String AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel ,
                                          String AV112Reclamacionesynoconformidadeswcds_8_tfclinom ,
                                          String AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel ,
                                          String AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser ,
                                          String AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel ,
                                          String AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc ,
                                          String AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel ,
                                          String AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom ,
                                          String AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel ,
                                          String AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli ,
                                          byte AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur ,
                                          byte AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to ,
                                          String AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel ,
                                          String AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod ,
                                          java.math.BigDecimal AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm ,
                                          java.math.BigDecimal AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to ,
                                          java.math.BigDecimal AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr ,
                                          java.math.BigDecimal AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to ,
                                          java.math.BigDecimal AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa ,
                                          java.math.BigDecimal AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to ,
                                          java.math.BigDecimal AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa ,
                                          java.math.BigDecimal AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to ,
                                          String AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel ,
                                          String AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc ,
                                          String AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel ,
                                          String AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa ,
                                          String AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel ,
                                          String AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc ,
                                          int AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn ,
                                          int AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to ,
                                          int AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod ,
                                          int AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to ,
                                          String AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel ,
                                          String AV144Reclamacionesynoconformidadeswcds_40_tfhisacco ,
                                          String AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel ,
                                          String AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot ,
                                          String AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel ,
                                          String AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco ,
                                          String AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel ,
                                          String AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct ,
                                          String AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel ,
                                          String AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc ,
                                          String AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel ,
                                          String AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc ,
                                          int A539HisBarCod ,
                                          byte A545HisCodReo ,
                                          String A544HisCodPar ,
                                          String A13698HisreoLote ,
                                          String A279CliNom ,
                                          String A542HisBarSer ,
                                          String A2299HisReoDsc ,
                                          String A546HisColNom ,
                                          String A8889HisNomCli ,
                                          byte A12950HisOpeTur ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A540HisBarKgm ,
                                          java.math.BigDecimal A541HisBarMtr ,
                                          java.math.BigDecimal A13699CostCausa ,
                                          String A834TipDefDsc ,
                                          String A5086DscCausa ,
                                          String A7001Rps_Dsc ,
                                          int A2297HisReoTn ,
                                          int A12949HisOpecod ,
                                          String A5662HisAcCo ,
                                          String A5693HisAcCot ,
                                          String A5694HisAdEAcCo ,
                                          String A5695HisAdEAcCt ,
                                          String A13843HisTipArtD ,
                                          String A13844HisTipColD ,
                                          java.util.Date A569HisReoFec ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          int A252CliCod ,
                                          int AV6Clicod ,
                                          int AV83Clicod_to ,
                                          java.util.Date AV7HisreoFec ,
                                          java.util.Date AV8HisreoFec_to ,
                                          byte AV9HisEstReo ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int45 = new byte[85];
      Object[] GXv_Object46 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.HisTipArt AS HisTipArt, T1.TipDefCod, T1.CodCausa, T1.CliCod, T1.Rps_Cod, T1.EmprCod, T1.HisTipCol AS HisTipCol, T7.TipColDsc AS HisTipColD, T3.TipArtDsc AS" ;
      sSelectString += " HisTipArtD, T1.HisAdEAcCt, T1.HisAdEAcCo, T1.HisAcCot, T1.HisAcCo, T1.HisOpecod, T1.HisReoTn, T6.Rps_Dsc, T5.DscCausa, T4.TipDefDsc, T1.HisBarMtr, T1.MaqCod, T1.HisOpeTur," ;
      sSelectString += " T1.HisNomCli, T1.HisColNom, T1.HisReoDsc, T1.HisBarSer, T2.CliNom, T1.HisreoLote, T1.HisReoFec, T1.HisEstReo, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod, T5.CostCausa," ;
      sSelectString += " T1.HisBarKgm" ;
      sFromString = " FROM ((((((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod" ;
      sFromString += " = T1.HisTipArt) INNER JOIN TXPTIPDEF T4 ON T4.EmprCod = T1.EmprCod AND T4.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T5 ON T5.EmprCod = T1.EmprCod AND T5.CodCausa" ;
      sFromString += " = T1.CodCausa) LEFT JOIN TXPCODRPS T6 ON T6.EmprCod = T1.EmprCod AND T6.Rps_Cod = T1.Rps_Cod) LEFT JOIN TXPTIPCOL T7 ON T7.EmprCod = T1.EmprCod AND T7.TipColCod" ;
      sFromString += " = T1.HisTipCol)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.HisReoFec >= ?)");
      addWhere(sWhereString, "(T1.HisReoFec <= ?)");
      addWhere(sWhereString, "(T1.HisEstReo = ?)");
      if ( ! (GXutil.strcmp("", AV105Reclamacionesynoconformidadeswcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.HisEstReo,'90'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar) like '%' || UPPER(?)) or ( UPPER(T1.HisreoLote) like '%' || UPPER(?)) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.HisBarSer) like '%' || UPPER(?)) or ( UPPER(T1.HisReoDsc) like '%' || UPPER(?)) or ( UPPER(T1.HisColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisOpeTur,'90'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisBarKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisBarMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T5.CostCausa,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ROUND(T5.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2),'9999990.999'), 2) like '%' || ?) or ( UPPER(T4.TipDefDsc) like '%' || UPPER(?)) or ( UPPER(T5.DscCausa) like '%' || UPPER(?)) or ( UPPER(T6.Rps_Dsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisReoTn,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisOpecod,'999990'), 2) like '%' || ?) or ( UPPER(T1.HisAcCo) like '%' || UPPER(?)) or ( UPPER(T1.HisAcCot) like '%' || UPPER(?)) or ( UPPER(T1.HisAdEAcCo) like '%' || UPPER(?)) or ( UPPER(T1.HisAdEAcCt) like '%' || UPPER(?)) or ( UPPER(T3.TipArtDsc) like '%' || UPPER(?)) or ( UPPER(T7.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int45[6] = (byte)(1) ;
         GXv_int45[7] = (byte)(1) ;
         GXv_int45[8] = (byte)(1) ;
         GXv_int45[9] = (byte)(1) ;
         GXv_int45[10] = (byte)(1) ;
         GXv_int45[11] = (byte)(1) ;
         GXv_int45[12] = (byte)(1) ;
         GXv_int45[13] = (byte)(1) ;
         GXv_int45[14] = (byte)(1) ;
         GXv_int45[15] = (byte)(1) ;
         GXv_int45[16] = (byte)(1) ;
         GXv_int45[17] = (byte)(1) ;
         GXv_int45[18] = (byte)(1) ;
         GXv_int45[19] = (byte)(1) ;
         GXv_int45[20] = (byte)(1) ;
         GXv_int45[21] = (byte)(1) ;
         GXv_int45[22] = (byte)(1) ;
         GXv_int45[23] = (byte)(1) ;
         GXv_int45[24] = (byte)(1) ;
         GXv_int45[25] = (byte)(1) ;
         GXv_int45[26] = (byte)(1) ;
         GXv_int45[27] = (byte)(1) ;
         GXv_int45[28] = (byte)(1) ;
         GXv_int45[29] = (byte)(1) ;
         GXv_int45[30] = (byte)(1) ;
      }
      if ( AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels, "T1.HisEstReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec)) )
      {
         addWhere(sWhereString, "(T1.HisReoFec >= ?)");
      }
      else
      {
         GXv_int45[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel)==0) && ( ! (GXutil.strcmp("", AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar = ?)");
      }
      else
      {
         GXv_int45[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel)==0) && ( ! (GXutil.strcmp("", AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisreoLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisreoLote = ?)");
      }
      else
      {
         GXv_int45[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV112Reclamacionesynoconformidadeswcds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int45[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel)==0) && ( ! (GXutil.strcmp("", AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarSer = ?)");
      }
      else
      {
         GXv_int45[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisReoDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisReoDsc = ?)");
      }
      else
      {
         GXv_int45[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisColNom = ?)");
      }
      else
      {
         GXv_int45[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisNomCli = ?)");
      }
      else
      {
         GXv_int45[45] = (byte)(1) ;
      }
      if ( ! (0==AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur >= ?)");
      }
      else
      {
         GXv_int45[46] = (byte)(1) ;
      }
      if ( ! (0==AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur <= ?)");
      }
      else
      {
         GXv_int45[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int45[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm >= ?)");
      }
      else
      {
         GXv_int45[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm <= ?)");
      }
      else
      {
         GXv_int45[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr >= ?)");
      }
      else
      {
         GXv_int45[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr <= ?)");
      }
      else
      {
         GXv_int45[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa)==0) )
      {
         addWhere(sWhereString, "(T5.CostCausa >= ?)");
      }
      else
      {
         GXv_int45[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to)==0) )
      {
         addWhere(sWhereString, "(T5.CostCausa <= ?)");
      }
      else
      {
         GXv_int45[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa)==0) )
      {
         addWhere(sWhereString, "(ROUND(T5.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) >= ?)");
      }
      else
      {
         GXv_int45[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(T5.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) <= ?)");
      }
      else
      {
         GXv_int45[57] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[58] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipDefDsc = ?)");
      }
      else
      {
         GXv_int45[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel)==0) && ( ! (GXutil.strcmp("", AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.DscCausa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel)==0) )
      {
         addWhere(sWhereString, "(T5.DscCausa = ?)");
      }
      else
      {
         GXv_int45[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.Rps_Dsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel)==0) )
      {
         addWhere(sWhereString, "(T6.Rps_Dsc = ?)");
      }
      else
      {
         GXv_int45[63] = (byte)(1) ;
      }
      if ( ! (0==AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn) )
      {
         addWhere(sWhereString, "(T1.HisReoTn >= ?)");
      }
      else
      {
         GXv_int45[64] = (byte)(1) ;
      }
      if ( ! (0==AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to) )
      {
         addWhere(sWhereString, "(T1.HisReoTn <= ?)");
      }
      else
      {
         GXv_int45[65] = (byte)(1) ;
      }
      if ( ! (0==AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod) )
      {
         addWhere(sWhereString, "(T1.HisOpecod >= ?)");
      }
      else
      {
         GXv_int45[66] = (byte)(1) ;
      }
      if ( ! (0==AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to) )
      {
         addWhere(sWhereString, "(T1.HisOpecod <= ?)");
      }
      else
      {
         GXv_int45[67] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel)==0) && ( ! (GXutil.strcmp("", AV144Reclamacionesynoconformidadeswcds_40_tfhisacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[68] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCo = ?)");
      }
      else
      {
         GXv_int45[69] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel)==0) && ( ! (GXutil.strcmp("", AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCot = ?)");
      }
      else
      {
         GXv_int45[71] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel)==0) && ( ! (GXutil.strcmp("", AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCo = ?)");
      }
      else
      {
         GXv_int45[73] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel)==0) && ( ! (GXutil.strcmp("", AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[74] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCt = ?)");
      }
      else
      {
         GXv_int45[75] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[76] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int45[77] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T7.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[78] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T7.TipColDsc = ?)");
      }
      else
      {
         GXv_int45[79] = (byte)(1) ;
      }
      if ( ( AV17OrderedBy == 1 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV17OrderedBy == 1 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisReoFec" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisReoFec DESC" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisEstReo" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisEstReo DESC" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisreoLote" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisreoLote DESC" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisBarSer" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisBarSer DESC" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisReoDsc" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisReoDsc DESC" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisColNom" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisColNom DESC" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisNomCli" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisNomCli DESC" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisOpeTur" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisOpeTur DESC" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisBarKgm" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisBarKgm DESC" ;
      }
      else if ( ( AV17OrderedBy == 13 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisBarMtr" ;
      }
      else if ( ( AV17OrderedBy == 13 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisBarMtr DESC" ;
      }
      else if ( ( AV17OrderedBy == 14 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T5.CostCausa" ;
      }
      else if ( ( AV17OrderedBy == 14 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T5.CostCausa DESC" ;
      }
      else if ( ( AV17OrderedBy == 15 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T4.TipDefDsc" ;
      }
      else if ( ( AV17OrderedBy == 15 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T4.TipDefDsc DESC" ;
      }
      else if ( ( AV17OrderedBy == 16 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T5.DscCausa" ;
      }
      else if ( ( AV17OrderedBy == 16 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T5.DscCausa DESC" ;
      }
      else if ( ( AV17OrderedBy == 17 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T6.Rps_Dsc" ;
      }
      else if ( ( AV17OrderedBy == 17 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T6.Rps_Dsc DESC" ;
      }
      else if ( ( AV17OrderedBy == 18 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisReoTn" ;
      }
      else if ( ( AV17OrderedBy == 18 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisReoTn DESC" ;
      }
      else if ( ( AV17OrderedBy == 19 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisOpecod" ;
      }
      else if ( ( AV17OrderedBy == 19 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisOpecod DESC" ;
      }
      else if ( ( AV17OrderedBy == 20 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisAcCo" ;
      }
      else if ( ( AV17OrderedBy == 20 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisAcCo DESC" ;
      }
      else if ( ( AV17OrderedBy == 21 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisAcCot" ;
      }
      else if ( ( AV17OrderedBy == 21 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisAcCot DESC" ;
      }
      else if ( ( AV17OrderedBy == 22 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisAdEAcCo" ;
      }
      else if ( ( AV17OrderedBy == 22 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisAdEAcCo DESC" ;
      }
      else if ( ( AV17OrderedBy == 23 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisAdEAcCt" ;
      }
      else if ( ( AV17OrderedBy == 23 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisAdEAcCt DESC" ;
      }
      else if ( ( AV17OrderedBy == 24 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T7.TipColDsc" ;
      }
      else if ( ( AV17OrderedBy == 24 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T7.TipColDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar, T1.TipDefCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object46[0] = scmdbuf ;
      GXv_Object46[1] = GXv_int45 ;
      return GXv_Object46 ;
   }

   protected Object[] conditional_H015L3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A548HisEstReo ,
                                          GXSimpleCollection<Byte> AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels ,
                                          String AV105Reclamacionesynoconformidadeswcds_1_filterfulltext ,
                                          int AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels_size ,
                                          java.util.Date AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec ,
                                          String AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel ,
                                          String AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr ,
                                          String AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel ,
                                          String AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote ,
                                          String AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel ,
                                          String AV112Reclamacionesynoconformidadeswcds_8_tfclinom ,
                                          String AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel ,
                                          String AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser ,
                                          String AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel ,
                                          String AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc ,
                                          String AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel ,
                                          String AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom ,
                                          String AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel ,
                                          String AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli ,
                                          byte AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur ,
                                          byte AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to ,
                                          String AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel ,
                                          String AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod ,
                                          java.math.BigDecimal AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm ,
                                          java.math.BigDecimal AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to ,
                                          java.math.BigDecimal AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr ,
                                          java.math.BigDecimal AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to ,
                                          java.math.BigDecimal AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa ,
                                          java.math.BigDecimal AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to ,
                                          java.math.BigDecimal AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa ,
                                          java.math.BigDecimal AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to ,
                                          String AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel ,
                                          String AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc ,
                                          String AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel ,
                                          String AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa ,
                                          String AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel ,
                                          String AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc ,
                                          int AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn ,
                                          int AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to ,
                                          int AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod ,
                                          int AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to ,
                                          String AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel ,
                                          String AV144Reclamacionesynoconformidadeswcds_40_tfhisacco ,
                                          String AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel ,
                                          String AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot ,
                                          String AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel ,
                                          String AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco ,
                                          String AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel ,
                                          String AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct ,
                                          String AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel ,
                                          String AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc ,
                                          String AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel ,
                                          String AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc ,
                                          int A539HisBarCod ,
                                          byte A545HisCodReo ,
                                          String A544HisCodPar ,
                                          String A13698HisreoLote ,
                                          String A279CliNom ,
                                          String A542HisBarSer ,
                                          String A2299HisReoDsc ,
                                          String A546HisColNom ,
                                          String A8889HisNomCli ,
                                          byte A12950HisOpeTur ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A540HisBarKgm ,
                                          java.math.BigDecimal A541HisBarMtr ,
                                          java.math.BigDecimal A13699CostCausa ,
                                          String A834TipDefDsc ,
                                          String A5086DscCausa ,
                                          String A7001Rps_Dsc ,
                                          int A2297HisReoTn ,
                                          int A12949HisOpecod ,
                                          String A5662HisAcCo ,
                                          String A5693HisAcCot ,
                                          String A5694HisAdEAcCo ,
                                          String A5695HisAdEAcCt ,
                                          String A13843HisTipArtD ,
                                          String A13844HisTipColD ,
                                          java.util.Date A569HisReoFec ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          int A252CliCod ,
                                          int AV6Clicod ,
                                          int AV83Clicod_to ,
                                          java.util.Date AV7HisreoFec ,
                                          java.util.Date AV8HisreoFec_to ,
                                          byte AV9HisEstReo ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int48 = new byte[80];
      Object[] GXv_Object49 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((((((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.HisTipArt) INNER JOIN TXPTIPDEF T5 ON T5.EmprCod = T1.EmprCod AND T5.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T6 ON T6.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T6.CodCausa = T1.CodCausa) LEFT JOIN TXPCODRPS T7 ON T7.EmprCod = T1.EmprCod AND T7.Rps_Cod = T1.Rps_Cod) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.TipColCod = T1.HisTipCol)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.HisReoFec >= ?)");
      addWhere(sWhereString, "(T1.HisReoFec <= ?)");
      addWhere(sWhereString, "(T1.HisEstReo = ?)");
      if ( ! (GXutil.strcmp("", AV105Reclamacionesynoconformidadeswcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.HisEstReo,'90'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar) like '%' || UPPER(?)) or ( UPPER(T1.HisreoLote) like '%' || UPPER(?)) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.HisBarSer) like '%' || UPPER(?)) or ( UPPER(T1.HisReoDsc) like '%' || UPPER(?)) or ( UPPER(T1.HisColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisOpeTur,'90'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisBarKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisBarMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T6.CostCausa,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2),'9999990.999'), 2) like '%' || ?) or ( UPPER(T5.TipDefDsc) like '%' || UPPER(?)) or ( UPPER(T6.DscCausa) like '%' || UPPER(?)) or ( UPPER(T7.Rps_Dsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisReoTn,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisOpecod,'999990'), 2) like '%' || ?) or ( UPPER(T1.HisAcCo) like '%' || UPPER(?)) or ( UPPER(T1.HisAcCot) like '%' || UPPER(?)) or ( UPPER(T1.HisAdEAcCo) like '%' || UPPER(?)) or ( UPPER(T1.HisAdEAcCt) like '%' || UPPER(?)) or ( UPPER(T3.TipArtDsc) like '%' || UPPER(?)) or ( UPPER(T4.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int48[6] = (byte)(1) ;
         GXv_int48[7] = (byte)(1) ;
         GXv_int48[8] = (byte)(1) ;
         GXv_int48[9] = (byte)(1) ;
         GXv_int48[10] = (byte)(1) ;
         GXv_int48[11] = (byte)(1) ;
         GXv_int48[12] = (byte)(1) ;
         GXv_int48[13] = (byte)(1) ;
         GXv_int48[14] = (byte)(1) ;
         GXv_int48[15] = (byte)(1) ;
         GXv_int48[16] = (byte)(1) ;
         GXv_int48[17] = (byte)(1) ;
         GXv_int48[18] = (byte)(1) ;
         GXv_int48[19] = (byte)(1) ;
         GXv_int48[20] = (byte)(1) ;
         GXv_int48[21] = (byte)(1) ;
         GXv_int48[22] = (byte)(1) ;
         GXv_int48[23] = (byte)(1) ;
         GXv_int48[24] = (byte)(1) ;
         GXv_int48[25] = (byte)(1) ;
         GXv_int48[26] = (byte)(1) ;
         GXv_int48[27] = (byte)(1) ;
         GXv_int48[28] = (byte)(1) ;
         GXv_int48[29] = (byte)(1) ;
         GXv_int48[30] = (byte)(1) ;
      }
      if ( AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels, "T1.HisEstReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec)) )
      {
         addWhere(sWhereString, "(T1.HisReoFec >= ?)");
      }
      else
      {
         GXv_int48[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel)==0) && ( ! (GXutil.strcmp("", AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar = ?)");
      }
      else
      {
         GXv_int48[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel)==0) && ( ! (GXutil.strcmp("", AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisreoLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisreoLote = ?)");
      }
      else
      {
         GXv_int48[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV112Reclamacionesynoconformidadeswcds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int48[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel)==0) && ( ! (GXutil.strcmp("", AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarSer = ?)");
      }
      else
      {
         GXv_int48[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisReoDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisReoDsc = ?)");
      }
      else
      {
         GXv_int48[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisColNom = ?)");
      }
      else
      {
         GXv_int48[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisNomCli = ?)");
      }
      else
      {
         GXv_int48[45] = (byte)(1) ;
      }
      if ( ! (0==AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur >= ?)");
      }
      else
      {
         GXv_int48[46] = (byte)(1) ;
      }
      if ( ! (0==AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur <= ?)");
      }
      else
      {
         GXv_int48[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int48[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm >= ?)");
      }
      else
      {
         GXv_int48[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm <= ?)");
      }
      else
      {
         GXv_int48[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr >= ?)");
      }
      else
      {
         GXv_int48[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr <= ?)");
      }
      else
      {
         GXv_int48[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa)==0) )
      {
         addWhere(sWhereString, "(T6.CostCausa >= ?)");
      }
      else
      {
         GXv_int48[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to)==0) )
      {
         addWhere(sWhereString, "(T6.CostCausa <= ?)");
      }
      else
      {
         GXv_int48[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa)==0) )
      {
         addWhere(sWhereString, "(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) >= ?)");
      }
      else
      {
         GXv_int48[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) <= ?)");
      }
      else
      {
         GXv_int48[57] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[58] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipDefDsc = ?)");
      }
      else
      {
         GXv_int48[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel)==0) && ( ! (GXutil.strcmp("", AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.DscCausa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel)==0) )
      {
         addWhere(sWhereString, "(T6.DscCausa = ?)");
      }
      else
      {
         GXv_int48[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T7.Rps_Dsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel)==0) )
      {
         addWhere(sWhereString, "(T7.Rps_Dsc = ?)");
      }
      else
      {
         GXv_int48[63] = (byte)(1) ;
      }
      if ( ! (0==AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn) )
      {
         addWhere(sWhereString, "(T1.HisReoTn >= ?)");
      }
      else
      {
         GXv_int48[64] = (byte)(1) ;
      }
      if ( ! (0==AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to) )
      {
         addWhere(sWhereString, "(T1.HisReoTn <= ?)");
      }
      else
      {
         GXv_int48[65] = (byte)(1) ;
      }
      if ( ! (0==AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod) )
      {
         addWhere(sWhereString, "(T1.HisOpecod >= ?)");
      }
      else
      {
         GXv_int48[66] = (byte)(1) ;
      }
      if ( ! (0==AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to) )
      {
         addWhere(sWhereString, "(T1.HisOpecod <= ?)");
      }
      else
      {
         GXv_int48[67] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel)==0) && ( ! (GXutil.strcmp("", AV144Reclamacionesynoconformidadeswcds_40_tfhisacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[68] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCo = ?)");
      }
      else
      {
         GXv_int48[69] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel)==0) && ( ! (GXutil.strcmp("", AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCot = ?)");
      }
      else
      {
         GXv_int48[71] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel)==0) && ( ! (GXutil.strcmp("", AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCo = ?)");
      }
      else
      {
         GXv_int48[73] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel)==0) && ( ! (GXutil.strcmp("", AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[74] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCt = ?)");
      }
      else
      {
         GXv_int48[75] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[76] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int48[77] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[78] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int48[79] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV17OrderedBy == 1 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 1 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 12 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 13 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 13 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 14 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 14 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 15 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 15 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 16 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 16 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 17 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 17 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 18 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 18 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 19 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 19 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 20 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 20 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 21 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 21 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 22 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 22 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 23 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 23 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 24 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 24 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object49[0] = scmdbuf ;
      GXv_Object49[1] = GXv_int48 ;
      return GXv_Object49 ;
   }

   protected Object[] conditional_H015L4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A548HisEstReo ,
                                          GXSimpleCollection<Byte> AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels ,
                                          String AV105Reclamacionesynoconformidadeswcds_1_filterfulltext ,
                                          int AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels_size ,
                                          java.util.Date AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec ,
                                          String AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel ,
                                          String AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr ,
                                          String AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel ,
                                          String AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote ,
                                          String AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel ,
                                          String AV112Reclamacionesynoconformidadeswcds_8_tfclinom ,
                                          String AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel ,
                                          String AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser ,
                                          String AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel ,
                                          String AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc ,
                                          String AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel ,
                                          String AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom ,
                                          String AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel ,
                                          String AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli ,
                                          byte AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur ,
                                          byte AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to ,
                                          String AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel ,
                                          String AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod ,
                                          java.math.BigDecimal AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm ,
                                          java.math.BigDecimal AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to ,
                                          java.math.BigDecimal AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr ,
                                          java.math.BigDecimal AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to ,
                                          java.math.BigDecimal AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa ,
                                          java.math.BigDecimal AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to ,
                                          java.math.BigDecimal AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa ,
                                          java.math.BigDecimal AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to ,
                                          String AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel ,
                                          String AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc ,
                                          String AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel ,
                                          String AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa ,
                                          String AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel ,
                                          String AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc ,
                                          int AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn ,
                                          int AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to ,
                                          int AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod ,
                                          int AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to ,
                                          String AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel ,
                                          String AV144Reclamacionesynoconformidadeswcds_40_tfhisacco ,
                                          String AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel ,
                                          String AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot ,
                                          String AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel ,
                                          String AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco ,
                                          String AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel ,
                                          String AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct ,
                                          String AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel ,
                                          String AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc ,
                                          String AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel ,
                                          String AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc ,
                                          int A539HisBarCod ,
                                          byte A545HisCodReo ,
                                          String A544HisCodPar ,
                                          String A13698HisreoLote ,
                                          String A279CliNom ,
                                          String A542HisBarSer ,
                                          String A2299HisReoDsc ,
                                          String A546HisColNom ,
                                          String A8889HisNomCli ,
                                          byte A12950HisOpeTur ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A540HisBarKgm ,
                                          java.math.BigDecimal A541HisBarMtr ,
                                          java.math.BigDecimal A13699CostCausa ,
                                          String A834TipDefDsc ,
                                          String A5086DscCausa ,
                                          String A7001Rps_Dsc ,
                                          int A2297HisReoTn ,
                                          int A12949HisOpecod ,
                                          String A5662HisAcCo ,
                                          String A5693HisAcCot ,
                                          String A5694HisAdEAcCo ,
                                          String A5695HisAdEAcCt ,
                                          String A13843HisTipArtD ,
                                          String A13844HisTipColD ,
                                          java.util.Date A569HisReoFec ,
                                          int A252CliCod ,
                                          int AV6Clicod ,
                                          int AV83Clicod_to ,
                                          java.util.Date AV7HisreoFec ,
                                          java.util.Date AV8HisreoFec_to ,
                                          byte AV9HisEstReo ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int51 = new byte[80];
      Object[] GXv_Object52 = new Object[2];
      scmdbuf = "SELECT T1.HisTipArt AS HisTipArt, T1.HisTipCol AS HisTipCol, T1.TipDefCod, T1.CodCausa, T1.Rps_Cod, T1.CliCod, T1.EmprCod, T4.TipColDsc AS HisTipColD, T3.TipArtDsc" ;
      scmdbuf += " AS HisTipArtD, T1.HisAdEAcCt, T1.HisAdEAcCo, T1.HisAcCot, T1.HisAcCo, T1.HisOpecod, T1.HisReoTn, T7.Rps_Dsc, T6.DscCausa, T5.TipDefDsc, T1.HisBarMtr, T1.MaqCod," ;
      scmdbuf += " T1.HisOpeTur, T1.HisNomCli, T1.HisColNom, T1.HisReoDsc, T1.HisBarSer, T2.CliNom, T1.HisreoLote, T1.HisReoFec, T1.HisEstReo, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod," ;
      scmdbuf += " T6.CostCausa, T1.HisBarKgm FROM ((((((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.TipArtCod = T1.HisTipArt) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.HisTipCol) INNER JOIN TXPTIPDEF T5 ON T5.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T5.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T6 ON T6.EmprCod = T1.EmprCod AND T6.CodCausa = T1.CodCausa) LEFT JOIN TXPCODRPS T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.Rps_Cod = T1.Rps_Cod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.HisReoFec >= ?)");
      addWhere(sWhereString, "(T1.HisReoFec <= ?)");
      addWhere(sWhereString, "(T1.HisEstReo = ?)");
      if ( ! (GXutil.strcmp("", AV105Reclamacionesynoconformidadeswcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.HisEstReo,'90'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar) like '%' || UPPER(?)) or ( UPPER(T1.HisreoLote) like '%' || UPPER(?)) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.HisBarSer) like '%' || UPPER(?)) or ( UPPER(T1.HisReoDsc) like '%' || UPPER(?)) or ( UPPER(T1.HisColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisOpeTur,'90'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisBarKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisBarMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T6.CostCausa,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2),'9999990.999'), 2) like '%' || ?) or ( UPPER(T5.TipDefDsc) like '%' || UPPER(?)) or ( UPPER(T6.DscCausa) like '%' || UPPER(?)) or ( UPPER(T7.Rps_Dsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisReoTn,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisOpecod,'999990'), 2) like '%' || ?) or ( UPPER(T1.HisAcCo) like '%' || UPPER(?)) or ( UPPER(T1.HisAcCot) like '%' || UPPER(?)) or ( UPPER(T1.HisAdEAcCo) like '%' || UPPER(?)) or ( UPPER(T1.HisAdEAcCt) like '%' || UPPER(?)) or ( UPPER(T3.TipArtDsc) like '%' || UPPER(?)) or ( UPPER(T4.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int51[6] = (byte)(1) ;
         GXv_int51[7] = (byte)(1) ;
         GXv_int51[8] = (byte)(1) ;
         GXv_int51[9] = (byte)(1) ;
         GXv_int51[10] = (byte)(1) ;
         GXv_int51[11] = (byte)(1) ;
         GXv_int51[12] = (byte)(1) ;
         GXv_int51[13] = (byte)(1) ;
         GXv_int51[14] = (byte)(1) ;
         GXv_int51[15] = (byte)(1) ;
         GXv_int51[16] = (byte)(1) ;
         GXv_int51[17] = (byte)(1) ;
         GXv_int51[18] = (byte)(1) ;
         GXv_int51[19] = (byte)(1) ;
         GXv_int51[20] = (byte)(1) ;
         GXv_int51[21] = (byte)(1) ;
         GXv_int51[22] = (byte)(1) ;
         GXv_int51[23] = (byte)(1) ;
         GXv_int51[24] = (byte)(1) ;
         GXv_int51[25] = (byte)(1) ;
         GXv_int51[26] = (byte)(1) ;
         GXv_int51[27] = (byte)(1) ;
         GXv_int51[28] = (byte)(1) ;
         GXv_int51[29] = (byte)(1) ;
         GXv_int51[30] = (byte)(1) ;
      }
      if ( AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV106Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels, "T1.HisEstReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV107Reclamacionesynoconformidadeswcds_3_tfhisreofec)) )
      {
         addWhere(sWhereString, "(T1.HisReoFec >= ?)");
      }
      else
      {
         GXv_int51[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel)==0) && ( ! (GXutil.strcmp("", AV108Reclamacionesynoconformidadeswcds_4_tfhisreohdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar = ?)");
      }
      else
      {
         GXv_int51[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel)==0) && ( ! (GXutil.strcmp("", AV110Reclamacionesynoconformidadeswcds_6_tfhisreolote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisreoLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisreoLote = ?)");
      }
      else
      {
         GXv_int51[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV112Reclamacionesynoconformidadeswcds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Reclamacionesynoconformidadeswcds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int51[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel)==0) && ( ! (GXutil.strcmp("", AV114Reclamacionesynoconformidadeswcds_10_tfhisbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarSer = ?)");
      }
      else
      {
         GXv_int51[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Reclamacionesynoconformidadeswcds_12_tfhisreodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisReoDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisReoDsc = ?)");
      }
      else
      {
         GXv_int51[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV118Reclamacionesynoconformidadeswcds_14_tfhiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisColNom = ?)");
      }
      else
      {
         GXv_int51[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV120Reclamacionesynoconformidadeswcds_16_tfhisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisNomCli = ?)");
      }
      else
      {
         GXv_int51[45] = (byte)(1) ;
      }
      if ( ! (0==AV122Reclamacionesynoconformidadeswcds_18_tfhisopetur) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur >= ?)");
      }
      else
      {
         GXv_int51[46] = (byte)(1) ;
      }
      if ( ! (0==AV123Reclamacionesynoconformidadeswcds_19_tfhisopetur_to) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur <= ?)");
      }
      else
      {
         GXv_int51[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV124Reclamacionesynoconformidadeswcds_20_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int51[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Reclamacionesynoconformidadeswcds_22_tfhisbarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm >= ?)");
      }
      else
      {
         GXv_int51[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm <= ?)");
      }
      else
      {
         GXv_int51[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Reclamacionesynoconformidadeswcds_24_tfhisbarmtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr >= ?)");
      }
      else
      {
         GXv_int51[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr <= ?)");
      }
      else
      {
         GXv_int51[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Reclamacionesynoconformidadeswcds_26_tfcostcausa)==0) )
      {
         addWhere(sWhereString, "(T6.CostCausa >= ?)");
      }
      else
      {
         GXv_int51[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Reclamacionesynoconformidadeswcds_27_tfcostcausa_to)==0) )
      {
         addWhere(sWhereString, "(T6.CostCausa <= ?)");
      }
      else
      {
         GXv_int51[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa)==0) )
      {
         addWhere(sWhereString, "(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) >= ?)");
      }
      else
      {
         GXv_int51[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) <= ?)");
      }
      else
      {
         GXv_int51[57] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV134Reclamacionesynoconformidadeswcds_30_tftipdefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[58] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipDefDsc = ?)");
      }
      else
      {
         GXv_int51[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel)==0) && ( ! (GXutil.strcmp("", AV136Reclamacionesynoconformidadeswcds_32_tfdsccausa)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.DscCausa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel)==0) )
      {
         addWhere(sWhereString, "(T6.DscCausa = ?)");
      }
      else
      {
         GXv_int51[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV138Reclamacionesynoconformidadeswcds_34_tfrps_dsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T7.Rps_Dsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel)==0) )
      {
         addWhere(sWhereString, "(T7.Rps_Dsc = ?)");
      }
      else
      {
         GXv_int51[63] = (byte)(1) ;
      }
      if ( ! (0==AV140Reclamacionesynoconformidadeswcds_36_tfhisreotn) )
      {
         addWhere(sWhereString, "(T1.HisReoTn >= ?)");
      }
      else
      {
         GXv_int51[64] = (byte)(1) ;
      }
      if ( ! (0==AV141Reclamacionesynoconformidadeswcds_37_tfhisreotn_to) )
      {
         addWhere(sWhereString, "(T1.HisReoTn <= ?)");
      }
      else
      {
         GXv_int51[65] = (byte)(1) ;
      }
      if ( ! (0==AV142Reclamacionesynoconformidadeswcds_38_tfhisopecod) )
      {
         addWhere(sWhereString, "(T1.HisOpecod >= ?)");
      }
      else
      {
         GXv_int51[66] = (byte)(1) ;
      }
      if ( ! (0==AV143Reclamacionesynoconformidadeswcds_39_tfhisopecod_to) )
      {
         addWhere(sWhereString, "(T1.HisOpecod <= ?)");
      }
      else
      {
         GXv_int51[67] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel)==0) && ( ! (GXutil.strcmp("", AV144Reclamacionesynoconformidadeswcds_40_tfhisacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[68] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Reclamacionesynoconformidadeswcds_41_tfhisacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCo = ?)");
      }
      else
      {
         GXv_int51[69] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel)==0) && ( ! (GXutil.strcmp("", AV146Reclamacionesynoconformidadeswcds_42_tfhisaccot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCot = ?)");
      }
      else
      {
         GXv_int51[71] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel)==0) && ( ! (GXutil.strcmp("", AV148Reclamacionesynoconformidadeswcds_44_tfhisadeacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCo = ?)");
      }
      else
      {
         GXv_int51[73] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel)==0) && ( ! (GXutil.strcmp("", AV150Reclamacionesynoconformidadeswcds_46_tfhisadeacct)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[74] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCt = ?)");
      }
      else
      {
         GXv_int51[75] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV152Reclamacionesynoconformidadeswcds_48_tfhistipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[76] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV153Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int51[77] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV154Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int51[78] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int51[79] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object52[0] = scmdbuf ;
      GXv_Object52[1] = GXv_int51 ;
      return GXv_Object52 ;
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
                  return conditional_H015L2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , ((Number) dynConstraints[70]).intValue() , ((Number) dynConstraints[71]).intValue() , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (java.util.Date)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Boolean) dynConstraints[80]).booleanValue() , ((Number) dynConstraints[81]).intValue() , ((Number) dynConstraints[82]).intValue() , ((Number) dynConstraints[83]).intValue() , (java.util.Date)dynConstraints[84] , (java.util.Date)dynConstraints[85] , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , (String)dynConstraints[88] );
            case 1 :
                  return conditional_H015L3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , ((Number) dynConstraints[70]).intValue() , ((Number) dynConstraints[71]).intValue() , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (java.util.Date)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Boolean) dynConstraints[80]).booleanValue() , ((Number) dynConstraints[81]).intValue() , ((Number) dynConstraints[82]).intValue() , ((Number) dynConstraints[83]).intValue() , (java.util.Date)dynConstraints[84] , (java.util.Date)dynConstraints[85] , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , (String)dynConstraints[88] );
            case 2 :
                  return conditional_H015L4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , ((Number) dynConstraints[70]).intValue() , ((Number) dynConstraints[71]).intValue() , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (java.util.Date)dynConstraints[78] , ((Number) dynConstraints[79]).intValue() , ((Number) dynConstraints[80]).intValue() , ((Number) dynConstraints[81]).intValue() , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , ((Number) dynConstraints[84]).byteValue() , (String)dynConstraints[85] , (String)dynConstraints[86] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H015L2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015L3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015L4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 60);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((byte[]) buf[38])[0] = rslt.getByte(21);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 13);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(23, 13);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(24, 26);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(25, 16);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 30);
               ((String[]) buf[49])[0] = rslt.getString(27, 20);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[51])[0] = rslt.getGXDate(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(29);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(30, 1);
               ((byte[]) buf[56])[0] = rslt.getByte(31);
               ((int[]) buf[57])[0] = rslt.getInt(32);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(33,3);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 60);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((byte[]) buf[38])[0] = rslt.getByte(21);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 13);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(23, 13);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(24, 26);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(25, 16);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 30);
               ((String[]) buf[49])[0] = rslt.getString(27, 20);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[51])[0] = rslt.getGXDate(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(29);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(30, 1);
               ((byte[]) buf[56])[0] = rslt.getByte(31);
               ((int[]) buf[57])[0] = rslt.getInt(32);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(33,3);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[85], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[88]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[89]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[90]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[108], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[109], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[112], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[113], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[116]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 16);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 26);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 26);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 13);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[131]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 6);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[135], 2);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[136], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[137], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[138], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[139], 3);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[140], 3);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[141], 3);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[142], 3);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 30);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 30);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 60);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 60);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 40);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 40);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[149]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[151]).intValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[152]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[153], 3276);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[154], 3276);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[155], 2000);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[156], 2000);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[157], 2000);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[158], 2000);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[159], 2000);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[160], 2000);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[161], 30);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[162], 30);
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 30);
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[164], 30);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[165]).intValue());
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[166]).intValue());
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[167]).intValue());
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[168]).intValue());
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[169]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[83]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[84]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[108], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[109], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[111]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 16);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 26);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 26);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 13);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[126]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[127]).byteValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 6);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[134], 3);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[135], 3);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[136], 3);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[137], 3);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 30);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 30);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 60);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 60);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 40);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 40);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[144]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[145]).intValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[146]).intValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[147]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[148], 3276);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[149], 3276);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[150], 2000);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[151], 2000);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[152], 2000);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[153], 2000);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[154], 2000);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[155], 2000);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[156], 30);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[157], 30);
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[158], 30);
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[159], 30);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[83]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[84]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[108], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[109], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[111]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 16);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 26);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 26);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 13);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[126]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[127]).byteValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 6);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[134], 3);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[135], 3);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[136], 3);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[137], 3);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 30);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 30);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 60);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 60);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 40);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 40);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[144]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[145]).intValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[146]).intValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[147]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[148], 3276);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[149], 3276);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[150], 2000);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[151], 2000);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[152], 2000);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[153], 2000);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[154], 2000);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[155], 2000);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[156], 30);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[157], 30);
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[158], 30);
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[159], 30);
               }
               return;
      }
   }

}

